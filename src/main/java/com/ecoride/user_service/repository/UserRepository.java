package com.ecoride.user_service.repository;

import com.ecoride.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByPhone(String phone);
    boolean existsByEmail(String email);
    boolean existsByLicenseNumber(String licenseNumber);
}