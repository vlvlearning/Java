package com.kiran.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiran.springboot.model.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long>{

}
