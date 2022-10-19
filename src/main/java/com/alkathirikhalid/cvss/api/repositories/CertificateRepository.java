package com.alkathirikhalid.cvss.api.repositories;

import com.alkathirikhalid.cvss.api.entities.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "certificates", path = "certificates")
public interface CertificateRepository extends JpaRepository<Certificate, UUID> {
}
