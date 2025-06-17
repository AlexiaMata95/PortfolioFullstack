package com.portfolio.certificate_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.certificate_service.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer>{

}
