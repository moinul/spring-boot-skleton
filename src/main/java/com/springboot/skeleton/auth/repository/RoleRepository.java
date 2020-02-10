package com.springboot.skeleton.auth.repository;

import com.springboot.skeleton.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
