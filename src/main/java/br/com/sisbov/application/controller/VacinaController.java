/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisbov.application.controller;

import br.com.sisbov.application.view.Tela_Principal;
import br.com.sisbov.domain.entity.Vacina;
import br.com.sisbov.domain.enums.ActionType;
import br.com.sisbov.domain.repository.VacinaRepository;
import br.com.sisbov.infrastructure.repository.VacinaJpaRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static br.com.sisbov.domain.enums.ActionType.CADASTRAR;
import static br.com.sisbov.domain.enums.ActionType.START;

/**
 * @author Elvis
 */
public class VacinaController implements ActionListener {
    private Tela_Principal telaPrincipal;
    private VacinaRepository vacinaRepository;

    public VacinaController(Tela_Principal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        this.vacinaRepository = new VacinaJpaRepository();
        this.telaPrincipal.btn_novo_vacinas.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_editar_vacinas.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_cancelar_vacinas.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_excluir_vacinas.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_salvar_vacinas.addActionListener(this::actionPerformed);
        enabled(START);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaPrincipal.btn_novo_vacinas) {
            enabled(CADASTRAR);
        }
        else if (e.getSource() == this.telaPrincipal.btn_cancelar_vacinas) {
            enabled(START);
        }
        else if (e.getSource() == this.telaPrincipal.btn_salvar_vacinas) {
            var vacina = Vacina.builder()
                    .Nome(this.telaPrincipal.txt_nome_vacinas.getText())
                    //TODO - Ao implementar retirar o comentário para que a inserção seja efetuada com sucesso.
//                    .dataAplicacaoVacina(LocalDate.now())
                    .build();
            var isSave = vacinaRepository.save(vacina);

            if (isSave) {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Operação bem sucedida!");
                loadData();
                clearFields();
                enabled(START);
            }
            else {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Ocorreu um erro no cadastro.");
            }
        }
        else if (e.getSource() == this.telaPrincipal.btn_editar_vacinas) {
            var selectedRow = this.telaPrincipal.tab_listar_vacinas.getSelectedRow();
            var numberRow = this.telaPrincipal.tab_listar_vacinas.getSelectedRowCount();

            if (selectedRow >= 0 && numberRow == 1) {
                var id = Long.parseLong(this.telaPrincipal.tab_listar_vacinas.getValueAt(selectedRow, 0).toString());
                var name = this.telaPrincipal.tab_listar_vacinas.getValueAt(selectedRow, 1).toString();
                //TODO - Ao implementar retirar o comentário para que a inserção seja efetuada com sucesso.
//                var dataAplicacao = LocalDate.parse(this.telaPrincipal.tab_listar_vacinas.getValueAt(selectedRow, 2).toString());
                var vacina = Vacina.builder()
                        .Nome(name)
//                        .dataAplicacaoVacina(dataAplicacao)
                        .build();
                vacina.setId(id);

                var isUpdate = vacinaRepository.update(vacina);
                if (isUpdate) {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Operação bem sucedida!");
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
        else {
            var selectedRow = this.telaPrincipal.tab_listar_vacinas.getSelectedRow();
            var numberRow = this.telaPrincipal.tab_listar_vacinas.getSelectedRowCount();
            if (selectedRow >= 0 && numberRow == 1) {
                var id = Long.parseLong(this.telaPrincipal.tab_listar_vacinas.getValueAt(selectedRow, 0).toString());
                var name = this.telaPrincipal.tab_listar_vacinas.getValueAt(selectedRow, 1).toString();

                var isDelete = vacinaRepository.deleteById(id);
                if (isDelete) {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Vacina: " + name + " deletada com sucesso!");
                    loadData();
                }
                else {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Erro na deleção!");
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
        //TODO - Ao implementar o campo de data de aplicação retirar o comentário para que a tabela reflita a entidade.
//        dtm.addColumn("Data de Aplicação da Vacina");
        this.telaPrincipal.tab_listar_vacinas.setModel(dtm);
        vacinaRepository.findAll().stream().forEach(v -> {
            var columns = new Object[3];
            columns[0] = v.getId();
            columns[1] = v.getNome();
//            columns[2] = v.getDataAplicacaoVacina();
        });
    }

    private void enabled(ActionType actionType) {
        switch (actionType) {
            case CADASTRAR:
                this.telaPrincipal.btn_novo_vacinas.setEnabled(false);
                this.telaPrincipal.btn_editar_vacinas.setEnabled(false);
                this.telaPrincipal.btn_cancelar_vacinas.setEnabled(true);
                this.telaPrincipal.btn_excluir_vacinas.setEnabled(false);
                this.telaPrincipal.btn_salvar_vacinas.setEnabled(true);
                this.telaPrincipal.txt_nome_vacinas.setEnabled(true);
                break;
            case START:
                this.telaPrincipal.btn_novo_vacinas.setEnabled(true);
                this.telaPrincipal.btn_editar_vacinas.setEnabled(true);
                this.telaPrincipal.btn_cancelar_vacinas.setEnabled(false);
                this.telaPrincipal.btn_excluir_vacinas.setEnabled(true);
                this.telaPrincipal.btn_salvar_vacinas.setEnabled(false);
                this.telaPrincipal.txt_nome_vacinas.setEnabled(false);
                break;
        }
    }

    private void clearFields() {
        this.telaPrincipal.txt_nome_vacinas.setText("");
    }
}
