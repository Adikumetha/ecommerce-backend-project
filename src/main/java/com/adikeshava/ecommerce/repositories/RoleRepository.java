package com.adikeshava.ecommerce.repositories;

import com.adikeshava.ecommerce.model.AppRole;
import com.adikeshava.ecommerce.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
