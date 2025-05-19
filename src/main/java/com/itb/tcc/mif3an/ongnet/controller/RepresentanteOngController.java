package com.itb.tcc.mif3an.ongnet.controller;


import com.itb.tcc.mif3an.ongnet.model.entity.Ong;
import com.itb.tcc.mif3an.ongnet.model.services.OngService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/representante-ong")
public class RepresentanteOngController {

    private final OngService ongService;

    public RepresentanteOngController(OngService ongService) {
        this.ongService = ongService;
    }

    @GetMapping("/ong")
    public ResponseEntity<List<Ong>> listarOngs() {

        return ResponseEntity.ok().body(ongService.findAll());
    }

    @PostMapping("/ong")
    public ResponseEntity<Ong> saveOng(@RequestBody Ong ong) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/representante-ong").toUriString());
        return ResponseEntity.created(uri).body(ongService.save(ong));
    }

    
}
