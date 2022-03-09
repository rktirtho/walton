package com.rktirtho.walton.repository;

import com.rktirtho.walton.entity.SalesInvoiceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesInvoiceDetailsRepository extends JpaRepository<SalesInvoiceDetails, Long> {
}
