package com.SpringDataJpa.Repository;

import com.SpringDataJpa.Model.UserStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<UserStudent, Long> {
}
