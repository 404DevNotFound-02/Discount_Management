package com.test.Assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.Assignment.models.Discounts;

@Repository
public interface DiscountRepo extends JpaRepository<Discounts, String> {

}
