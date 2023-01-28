package com.AplicationLoginUser.Repository;

import com.AplicationLoginUser.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
