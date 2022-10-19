package com.alkathirikhalid.cvss.api.repositories;

import com.alkathirikhalid.cvss.api.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
