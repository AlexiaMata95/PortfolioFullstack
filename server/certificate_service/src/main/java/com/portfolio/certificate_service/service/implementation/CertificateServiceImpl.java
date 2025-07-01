package com.portfolio.certificate_service.service.implementation;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.certificate_service.dto.CertificateDTO;
import com.portfolio.certificate_service.entity.Certificate;
import com.portfolio.certificate_service.entity.Category;
import com.portfolio.certificate_service.repository.CategoryRepository;
import com.portfolio.certificate_service.repository.CertificateRepository;
import com.portfolio.certificate_service.service.CertificateService;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    
    private Certificate dtoToEntity(CertificateDTO dto) {
        Certificate certificate = new Certificate();
        certificate.setName(dto.getName());
        certificate.setIssuer(dto.getIssuer());
        certificate.setYear(dto.getYear());
        Set<Category> categories = categoryRepository.findAllById(dto.getCategoryIds()).stream().collect(Collectors.toSet());
        certificate.setCategories(categories);
        return certificate;
    }

    private CertificateDTO entityToDto(Certificate certificate) {
        List<Integer> ids = certificate.getCategories().stream().map(Category::getId).collect(Collectors.toList());
        List<String> names = certificate.getCategories().stream().map(Category::getName).collect(Collectors.toList());
        return new CertificateDTO(certificate.getId(), certificate.getName(), certificate.getIssuer(), certificate.getYear(), ids, names);
    }
    
    @Override
    public CertificateDTO createCertificate(CertificateDTO CertificateDTO) {
        Certificate savedCertificate = certificateRepository.save(dtoToEntity(CertificateDTO));
        return entityToDto(savedCertificate);
    }

    @Override
    public List<CertificateDTO> getAllCertificates() {
        return certificateRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public CertificateDTO getCertificateById(Integer id) {
        Certificate certificate = certificateRepository.findById(id).orElseThrow(() -> new RuntimeException("Certificate not found"));
        return entityToDto(certificate);
    }

    @Override
    public CertificateDTO updateCertificate(Integer id, CertificateDTO certificateDTO) {
        Certificate certificate = certificateRepository.findById(id).orElseThrow(() -> new RuntimeException("Certificate not found"));
        certificate.setName(certificateDTO.getName());
        certificate.setIssuer(certificateDTO.getIssuer());
        certificate.setYear(certificateDTO.getYear());
        Set<Category> categories = categoryRepository.findAllById(certificateDTO.getCategoryIds()).stream().collect(Collectors.toSet());
        certificate.setCategories(categories);
        Certificate updated = certificateRepository.save(certificate);
        return entityToDto(updated);
    }

    @Override
    public void deleteCertificate(Integer id) {
        certificateRepository.deleteById(id);
    }
    
    public List<CertificateDTO> getCertificateByCategories(String nameCategory){
    	return certificateRepository.findByCategories_Name(nameCategory)
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }
    
}
