package com.apireceipt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apireceipt.domain.Recibo;

@Repository
public interface ReciboRepository extends JpaRepository<Recibo, Integer> {

}
