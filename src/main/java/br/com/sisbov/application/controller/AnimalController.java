/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisbov.application.controller;

import br.com.sisbov.application.view.Tela_Principal;
import br.com.sisbov.domain.entity.Animal;
import br.com.sisbov.domain.repository.AnimalRepository;
import br.com.sisbov.infrastructure.repository.AnimalJpaRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

/**
 *
 * @author Elvis
 */
public class AnimalController implements ActionListener {
    private Tela_Principal telaPrincipal;
    private AnimalRepository animalRepository;

    public AnimalController(Tela_Principal telaPrincipal) {
        this.animalRepository = new AnimalJpaRepository();
        this.telaPrincipal = telaPrincipal;
        this.telaPrincipal.btn_novo_animal.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_editar_animal.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_cancelar_animal.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_excluir_animal.addActionListener(this::actionPerformed);
        this.telaPrincipal.btn_salvar_animal.addActionListener(this::actionPerformed);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaPrincipal.btn_salvar_animal) {
            var animal = Animal.builder()
                    .Brinco(this.telaPrincipal.txt_brinco_animal.getText())
                    .createdAt(LocalDate.now())
                    .dataNascimento(LocalDate.parse(this.telaPrincipal.txt_dataNasc_animal.getText()))
                    .Peso(Double.parseDouble(this.telaPrincipal.txt_peso_animal.getText()))
                    .sexo(Integer.parseInt(this.telaPrincipal.txt_sexo_animal.getText()))
                    .build();
            var isSave = animalRepository.save(animal);
            if (isSave) {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Operação bem sucedida!");
            }
            else {
                JOptionPane.showMessageDialog(this.telaPrincipal, "Ocorreu um erro na inserção.");
            }
        }
    }
}
