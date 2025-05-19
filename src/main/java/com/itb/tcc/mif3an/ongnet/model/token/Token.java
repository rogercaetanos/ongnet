package com.itb.tcc.mif3an.ongnet.model.token;

import com.itb.tcc.mif3an.ongnet.model.entity.Usuario;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "tokens")
@Data
public class Token {

    @Id
    @GeneratedValue
    public Long id;
    public String token;
    @Enumerated(EnumType.STRING)
    public TokenType tokenType = TokenType.BEARER;
    public boolean revoked;
    public boolean expired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    public Usuario usuario;

    public Token() {
    }

    public Token(Long id, String token, TokenType tokenType, boolean revoked, boolean expired, Usuario usuario) {
        this.id = id;
        this.token = token;
        this.tokenType = tokenType;
        this.revoked = revoked;
        this.expired = expired;
        this.usuario = usuario;
    }
}
