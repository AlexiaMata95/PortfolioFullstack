package com.portfolio.education_service.service;

import java.util.List;

import com.portfolio.education_service.dto.DiplomaDTO;

public interface DiplomaService {
    DiplomaDTO createDiploma(DiplomaDTO skillDTO);
    List<DiplomaDTO> getAllDiplomas();
    DiplomaDTO getDiplomaById(Integer id);
    DiplomaDTO updateDiploma(Integer id, DiplomaDTO skillDTO);
    void deleteDiploma(Integer id);
}
