package br.com.sisbov.application.controller;

import br.com.sisbov.domain.entity.Usuario;
import br.com.sisbov.application.view.Tela_Login;
import br.com.sisbov.application.view.Tela_de_Cadastro;
import br.com.sisbov.domain.repository.UsuarioRepository;
import br.com.sisbov.infrastructure.repository.UsuarioJpaRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroController implements ActionListener {
    private Tela_Login telaLogin;
    private Tela_de_Cadastro telaCadastro;
    private UsuarioRepository usuarioRepository;

    public CadastroController(Tela_de_Cadastro telaDeCadastro, Tela_Login telaLogin) {
        this.telaCadastro = telaDeCadastro;
        this.telaLogin = telaLogin;
        this.telaCadastro.btn_cadastrar_cadastroUsuario.addActionListener(this::actionPerformed);
        this.telaCadastro.btn_cancelar_cadastroUsuario.addActionListener(this::actionPerformed);
        this.telaLogin.btn_cadastrar_usuario.addActionListener(this::actionPerformed);
        this.usuarioRepository = new UsuarioJpaRepository();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaLogin.btn_cadastrar_usuario) {
            disposeScreen(true, false);
        }
        else if (e.getSource() == this.telaCadastro.btn_cancelar_cadastroUsuario) {
            disposeScreen(false, true);
        }
        else {
            var usuario = Usuario.builder()
                    .username(this.telaCadastro.txt_nome_cadastroUsuario.getText())
                    .password(new String(this.telaCadastro.cs_senha_cadastroUsuario.getPassword()))
                    .build();
            usuario.criptografarSenha();
            boolean isSave = usuarioRepository.save(usuario);
            if (isSave) {
                disposeScreen(false, true);
                JOptionPane.showMessageDialog(this.telaCadastro, "Usuário cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this.telaCadastro, "Erro no cadastro do usuário!");
            }
        }
    }

    private void disposeScreen(boolean... screen) {
        this.telaLogin.setVisible(screen[0]);
        this.telaCadastro.setVisible(screen[1]);
    }
}