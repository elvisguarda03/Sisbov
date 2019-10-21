package br.com.sisbov.application.controller;

import br.com.sisbov.application.view.Tela_Login;
import br.com.sisbov.domain.repository.UsuarioRepository;
import br.com.sisbov.infrastructure.repository.UsuarioJpaRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener {
    private Tela_Login telaLogin;

    private UsuarioRepository usuarioRepository;

    public LoginController(Tela_Login telaLogin) {
        this.telaLogin = telaLogin;
        this.telaLogin.btn_entrar_usuario.addActionListener(this::actionPerformed);
        this.usuarioRepository = new UsuarioJpaRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaLogin.btn_entrar_usuario) {
            var usuario = usuarioRepository.findByUsername(this.telaLogin.txt_usuario_login.getText());
            if (usuario.isEmpty()) {
                JOptionPane.showMessageDialog(this.telaLogin, "Usuário ou senha inválido!");
            }
            else {

            }
        }
    }
}
