/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisbov.application.controller;

import br.com.sisbov.application.view.Tela_Principal;
import br.com.sisbov.domain.repository.FazendaRepository;
import br.com.sisbov.infrastructure.repository.FazendaJpaRepository;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Elvis
 *
 */
public class FazendaController implements ActionListener {
    private Tela_Principal telaPrincipal;
    private FazendaRepository fazendaRepository;

    public FazendaController(Tela_Principal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        this.fazendaRepository = new FazendaJpaRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (this.telaPrincipal.btn)
    }
}