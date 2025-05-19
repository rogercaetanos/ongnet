package com.itb.tcc.mif3an.ongnet.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "ong")
@Data
public class Ong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, length = 20)
    private String cnpj;
    @Column(nullable = false, length = 15)
    private String cep;
    @Column(nullable = false, length = 10)
    private String numero;
    @Column(nullable = true, length = 15)
    private String telefone;
    @Column(nullable = false, length = 45)
    private String email;
    @Column(nullable = false, length = 100)
    private String responsavel;
    @Column(nullable = true, length = 100)
    private String site;
    private boolean codStatus;

    @OneToMany(mappedBy = "ong", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<RepresentanteOng> representanteOngs = new ArrayList<>();

    @Transient
    @JsonIgnore
    private String mensagemErro = "";

    @Transient
    @JsonIgnore
    private boolean isValid = true;

    public boolean validarOng() {
        return isValid;
    }

}
