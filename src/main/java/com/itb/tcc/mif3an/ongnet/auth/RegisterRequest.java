package com.itb.tcc.mif3an.ongnet.auth;

import com.itb.tcc.mif3an.ongnet.model.entity.Role;
import lombok.Data;

@Data
public class RegisterRequest {

    private String nome;
    private String email;
    private String password;
    private Role role;

    public RegisterRequest() {

    }
    public RegisterRequest(String nome, String email, String password, Role role) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
