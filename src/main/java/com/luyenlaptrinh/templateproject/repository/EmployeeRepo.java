package com.luyenlaptrinh.templateproject.repository;

import com.luyenlaptrinh.templateproject.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Create by
 *
 * @author : Nguyen Ba Hung
 * @since : 9/21/2022, Wed
 **/
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> findAll();
    Optional<Employee> findById(Long id);

    @Transactional
    void deleteById(Long id);
}
