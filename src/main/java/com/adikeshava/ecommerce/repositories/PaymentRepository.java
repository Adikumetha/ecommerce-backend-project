package com.adikeshava.ecommerce.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adikeshava.ecommerce.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}