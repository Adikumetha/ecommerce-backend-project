package com.adikeshava.ecommerce.repositories;

import com.adikeshava.ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
