/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisbov.application.controller;

import br.com.sisbov.application.view.Tela_Principal;
import br.com.sisbov.domain.entity.Raca;
import br.com.sisbov.domain.enums.ActionType;
import br.com.sisbov.domain.repository.RacaRepository;
import br.com.sisbov.infrastructure.repository.RacaJpaRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static br.com.sisbov.domain.enums.ActionType.CADASTRAR;
import static br.com.sisbov.domain.enums.ActionType.START;

/**
 *
 * @author Elvis
 */
public class RacaController implements ActionListener {
    private Tela_Principal telaPrincipal;
    private RacaRepository racaRepository;

    public RacaController(Tela_Principal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        this.telaPrincipal.btn_salvar_raca.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_cancelar_raca.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_editar_raca.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_excluir_raca.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_novo_raca.addActionListener(this::actionPerformed);
        this.racaRepository = new RacaJpaRepository();
        loadData();
        enabled(START);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaPrincipal.btn_novo_raca) {
            enabled(CADASTRAR);
        }
        else if (e.getSource() == this.telaPrincipal.btn_cancelar_raca) {
            enabled(START);
        }
        else if (e.getSource() == this.telaPrincipal.btn_salvar_raca) {
            var raca = Raca.builder()
                    .Nome(this.telaPrincipal.txt_nome_raca.getText())
                    .build();

            var isSave = racaRepository.save(raca);

            if (isSave) {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Operação bem sucedida!");
                enabled(START);
                loadData();
                clearFields();
            }
            else {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Ocorre um erro na operação.");
            }
        }
        else if (e.getSource() == this.telaPrincipal.btn_excluir_raca) {
            var selectedRow = this.telaPrincipal.tab_listar_raca.getSelectedRow();
            var numberRow = this.telaPrincipal.tab_listar_raca.getSelectedRowCount();
            if (selectedRow >= 0 && numberRow == 1) {
                var id = Long.parseLong(this.telaPrincipal.tab_listar_raca.getValueAt(selectedRow, 0).toString());
                var name = this.telaPrincipal.tab_listar_raca.getValueAt(selectedRow, 1).toString();

                var isDelete = racaRepository.deleteById(id);
                if (isDelete) {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "A Raça: " + name + " foi deletada com sucesso.");
                    loadData();
                }
                else {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Ocorreu um erro na deleção.");
                }
            }
            else {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Selecione uma linha!");
            }
        }
        else {
            var selectedRow = this.telaPrincipal.tab_listar_raca.getSelectedRow();
            var numberRow = this.telaPrincipal.tab_listar_raca.getSelectedRowCount();

            if (selectedRow >= 0 && numberRow == 1) {
                var id = Long.parseLong(this.telaPrincipal.tab_listar_raca.getValueAt(selectedRow, 0).toString());
                var newWName = this.telaPrincipal.tab_listar_raca.getValueAt(selectedRow, 1).toString();
                var raca = Raca.builder()
                        .Nome(newWName)
                        .build();
                raca.setId(id);

                var isUpdate = racaRepository.update(raca);
                if (isUpdate) {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Operação efetuada com sucesso!");
                    loadData();
                }
                else {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Ocorreu um erro na atualização!");
                }
            }
            else {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Selecione uma linha!");
            }
        }
    }

    private void loadData() {
        var dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Nome");
        this.telaPrincipal.tab_listar_raca.setModel(dtm);
        racaRepository.findAll().stream().forEach(r -> {
            var columns = new Object[2];
            columns[0] = r.getId();
            columns[1] = r.getNome();
            dtm.addRow(columns);
        });
    }

    private void enabled(ActionType actionType) {
        switch (actionType) {
            case CADASTRAR:
                this.telaPrincipal.btn_salvar_raca.setEnabled(true);
                this.telaPrincipal.btn_cancelar_raca.setEnabled(true);
                this.telaPrincipal.btn_novo_raca.setEnabled(false);
                this.telaPrincipal.btn_excluir_raca.setEnabled(false);
                this.telaPrincipal.btn_editar_raca.setEnabled(false);
                this.telaPrincipal.txt_nome_raca.setEnabled(true);
                break;
            case START:
                this.telaPrincipal.btn_salvar_raca.setEnabled(false);
                this.telaPrincipal.btn_cancelar_raca.setEnabled(false);
                this.telaPrincipal.btn_novo_raca.setEnabled(true);
                this.telaPrincipal.btn_excluir_raca.setEnabled(true);
                this.telaPrincipal.btn_editar_raca.setEnabled(true);
                this.telaPrincipal.txt_nome_raca.setEnabled(false);
                break;
        }
    }

    private void clearFields() {
        this.telaPrincipal.txt_nome_raca.setText("");
    }
}
