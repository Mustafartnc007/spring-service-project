package com.service.springserviceproject.aaaEntities.abstracts;

import com.service.springserviceproject.aaaEntities.concretes.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}
