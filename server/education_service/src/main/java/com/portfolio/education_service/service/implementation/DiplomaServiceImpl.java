package com.portfolio.education_service.service.implementation;

import com.portfolio.education_service.dto.DiplomaDTO;
import com.portfolio.education_service.entity.Diploma;
import com.portfolio.education_service.repository.DiplomaRepository;
import com.portfolio.education_service.service.DiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiplomaServiceImpl implements DiplomaService {

    @Autowired
    private DiplomaRepository diplomaRepository;


    private Diploma dtoToEntity(DiplomaDTO dto) {
        Diploma diploma = new Diploma();
        diploma.setName(dto.getName());
        diploma.setIssuer(dto.getIssuer());
        return diploma;
    }

    private DiplomaDTO entityToDto(Diploma diploma) {
        return new DiplomaDTO(diploma.getId(), diploma.getName(), diploma.getIssuer(), diploma.getYear());
    }

    @Override
    public DiplomaDTO createDiploma(DiplomaDTO diplomaDTO) {
        Diploma saved = diplomaRepository.save(dtoToEntity(diplomaDTO));
        return entityToDto(saved);
    }

    @Override
    public List<DiplomaDTO> getAllDiplomas() {
        return diplomaRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public DiplomaDTO getDiplomaById(Integer id) {
        Diploma diploma = diplomaRepository.findById(id).orElseThrow(() -> new RuntimeException("Diploma not found"));
        return entityToDto(diploma);
    }

    @Override
    public DiplomaDTO updateDiploma(Integer id, DiplomaDTO diplomaDTO) {
        Diploma diploma = diplomaRepository.findById(id).orElseThrow(() -> new RuntimeException("Diploma not found"));
        diploma.setName(diplomaDTO.getName());
        diploma.setIssuer(diplomaDTO.getIssuer());
        diploma.setYear(diplomaDTO.getYear());
        Diploma updated = diplomaRepository.save(diploma);
        return entityToDto(updated);
    }

    @Override
    public void deleteDiploma(Integer id) {
        diplomaRepository.deleteById(id);
    }
}