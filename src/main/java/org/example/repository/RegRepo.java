package org.example.repository;

import org.example.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegRepo extends JpaRepository<Registration, Long> {
    Registration findByEmail(String email);


}
