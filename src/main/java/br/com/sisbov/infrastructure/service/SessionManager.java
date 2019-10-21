package br.com.sisbov.infrastructure.service;

import br.com.sisbov.domain.entity.Usuario;
import org.hibernate.Session;

import java.awt.event.WindowEvent;
import java.util.Objects;

public class SessionManager {
    private static SessionManager instance;
    private Usuario user;
    private Session currentSession;

    public static SessionManager getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void startNewSession(Usuario user) {
        this.user = user;
    }

    public void endCurrentSession() {
        this.user = null;
        SessionManager.instance = null;
    }
}
