package br.com.sisbov.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario extends AbstractEntity {
    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    public void criptografarSenha() {
        this.password = BCrypt.hashpw(this.password, BCrypt.gensalt());
    }
}