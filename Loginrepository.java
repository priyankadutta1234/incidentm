package com.incident.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Loginrepository extends JpaRepository<login, Long> {
        login findByUsernameAndPassword(String Username, String Password);
}



