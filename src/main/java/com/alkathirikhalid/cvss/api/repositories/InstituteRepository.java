package com.alkathirikhalid.cvss.api.repositories;

import com.alkathirikhalid.cvss.api.entities.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "institutes", path = "institutes")
public interface InstituteRepository extends JpaRepository<Institute, Integer> {
}
