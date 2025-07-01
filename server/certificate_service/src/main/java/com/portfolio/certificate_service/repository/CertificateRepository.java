package com.portfolio.certificate_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.certificate_service.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer>{
	List<Certificate> findByCategories_Name(String name);
}
