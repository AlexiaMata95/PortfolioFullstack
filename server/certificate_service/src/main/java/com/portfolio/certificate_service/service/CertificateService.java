package com.portfolio.certificate_service.service;

import java.util.List;

import com.portfolio.certificate_service.dto.CertificateDTO;

public interface CertificateService {
    CertificateDTO createCertificate(CertificateDTO CertificateDTO);
    List<CertificateDTO> getAllCertificates();
    CertificateDTO getCertificateById(Integer id);
    CertificateDTO updateCertificate(Integer id, CertificateDTO CertificateDTO);
    void deleteCertificate(Integer id);
}
