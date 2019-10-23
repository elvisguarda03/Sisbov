package br.com.sisbov.application.controller;

import br.com.sisbov.application.view.Tela_Principal;
import br.com.sisbov.domain.entity.TipoAnimal;
import br.com.sisbov.domain.enums.ActionType;
import br.com.sisbov.domain.repository.TipoAnimalRepository;
import br.com.sisbov.infrastructure.repository.TipoAnimalJpaRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static br.com.sisbov.domain.enums.ActionType.CADASTRAR;
import static br.com.sisbov.domain.enums.ActionType.START;

/**
 * @author Elvis
 */
public class TipoAnimalController implements ActionListener {
    private final Tela_Principal telaPrincipal;
    private final TipoAnimalRepository tipoAnimalRepository;

    public TipoAnimalController(Tela_Principal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        this.tipoAnimalRepository = new TipoAnimalJpaRepository();
        this.telaPrincipal.btn_cancelar_TipoAnimal.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_novo_TipoAnimal.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_salvar_TipoAnimal.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_editar_TipoAnimal.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_excluir_TipoAnimal.addActionListener(this::actionPerformed);
        loadData();
        enabled(START);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaPrincipal.btn_novo_TipoAnimal) {
            enabled(CADASTRAR);
        } else if (e.getSource() == this.telaPrincipal.btn_salvar_TipoAnimal) {
            var tipoAnimal = TipoAnimal.builder()
                    .nome(this.telaPrincipal.c_nome_TipoAnimal.getText())
                    .build();

            var isSave = tipoAnimalRepository.save(tipoAnimal);

            if (isSave) {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Operação bem sucedida!");
                loadData();
                clearFields();
                enabled(START);
            } else {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Ocorreu um erro no cadastro.");
            }
        } else if (e.getSource() == this.telaPrincipal.btn_editar_TipoAnimal) {
            var selectedRow = this.telaPrincipal.tab_listar_TipoAnimais.getSelectedRow();
            var numberRow = this.telaPrincipal.tab_listar_TipoAnimais.getSelectedRowCount();

            if (selectedRow >= 0 && numberRow == 1) {
                var id = Long.parseLong(telaPrincipal.tab_listar_TipoAnimais.getValueAt(selectedRow, 0).toString());
                var newName = telaPrincipal.tab_listar_TipoAnimais.getValueAt(selectedRow, 1).toString();

                var tipoAnimal = TipoAnimal.builder()
                        .nome(newName)
                        .build();
                tipoAnimal.setId(id);

                var isUpdate = tipoAnimalRepository.update(tipoAnimal);
                if (isUpdate) {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Operação bem sucedida!");
                    loadData();
                } else {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Ocorreu um erro na atualização");
                }
            }
            else {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Selecione uma linha!");
            }
        } else if (e.getSource() == this.telaPrincipal.btn_cancelar_TipoAnimal) {
            enabled(START);
        }
        else {
            var selectedRow = this.telaPrincipal.tab_listar_TipoAnimais.getSelectedRow();
            var numberRow = this.telaPrincipal.tab_listar_TipoAnimais.getSelectedRowCount();
            if (selectedRow >= 0 && numberRow == 1) {
                var id = Long.parseLong(this.telaPrincipal.tab_listar_TipoAnimais.getValueAt(selectedRow, 0).toString());
                var name = this.telaPrincipal.tab_listar_TipoAnimais.getValueAt(selectedRow, 1);

                var isDelete = tipoAnimalRepository.deleteById(id);
                if (isDelete) {
                    JOptionPane.showMessageDialog(this.telaPrincipal, "Tipo animal: " + name + " foi deletado!");
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

    private void enabled(ActionType actionType) {
        switch (actionType) {
            case CADASTRAR:
                this.telaPrincipal.btn_editar_TipoAnimal.setEnabled(false);
                this.telaPrincipal.btn_excluir_TipoAnimal.setEnabled(false);
                this.telaPrincipal.btn_salvar_TipoAnimal.setEnabled(true);
                this.telaPrincipal.btn_cancelar_TipoAnimal.setEnabled(true);
                this.telaPrincipal.c_nome_TipoAnimal.setEnabled(true);
                break;
            case START:
                this.telaPrincipal.btn_editar_TipoAnimal.setEnabled(true);
                this.telaPrincipal.btn_excluir_TipoAnimal.setEnabled(true);
                this.telaPrincipal.btn_novo_TipoAnimal.setEnabled(true);
                this.telaPrincipal.btn_salvar_TipoAnimal.setEnabled(false);
                this.telaPrincipal.btn_cancelar_TipoAnimal.setEnabled(false);
                this.telaPrincipal.c_nome_TipoAnimal.setEnabled(false);
                this.telaPrincipal.TXT_codigo_TipoAnimal.setEnabled(false);
                break;
        }
    }

    private void loadData() {
        var dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Nome");
        this.telaPrincipal.tab_listar_TipoAnimais.setModel(dtm);
        tipoAnimalRepository.findAll().stream().forEach(t -> {
            var columns = new Object[2];
            columns[0] = t.getId();
            columns[1] = t.getNome();
            dtm.addRow(columns);
        });
    }

    private void clearFields() {
        this.telaPrincipal.txt_tipo_animal.setText("");

    }
}