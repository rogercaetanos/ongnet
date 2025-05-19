package com.itb.tcc.mif3an.ongnet.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue(value = "REPRESENTANTEONG")
public class RepresentanteOng extends Usuario{

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ong_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Ong ong;


}
