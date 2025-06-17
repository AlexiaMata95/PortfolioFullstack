package com.portfolio.education_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.education_service.dto.DiplomaDTO; 
import com.portfolio.education_service.service.DiplomaService;

@RestController
@RequestMapping("api/diplomas")
public class DiplomaController {
    
    @Autowired
    private DiplomaService diplomaService;

    @GetMapping
    public ResponseEntity<List<DiplomaDTO>> getAllDiplomas(){
        return ResponseEntity.ok(diplomaService.getAllDiplomas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiplomaDTO> getDiplomaById(@PathVariable Integer id) {
        return ResponseEntity.ok(diplomaService.getDiplomaById(id));
    }

    @PostMapping
    public ResponseEntity<DiplomaDTO> createDiploma(@RequestBody DiplomaDTO diplomaDTO) {
        return ResponseEntity.ok(diplomaService.createDiploma(diplomaDTO));
    }

     @PutMapping("/{id}")
    public ResponseEntity<DiplomaDTO> updateDiploma(@PathVariable Integer id, @RequestBody DiplomaDTO diplomaDTO) {
        return ResponseEntity.ok(diplomaService.updateDiploma(id, diplomaDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiploma(@PathVariable Integer id) {
        diplomaService.deleteDiploma(id);
        return ResponseEntity.noContent().build();
    }

}
