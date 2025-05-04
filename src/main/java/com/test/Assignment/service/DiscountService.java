package com.test.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Assignment.models.Discounts;
import com.test.Assignment.repo.DiscountRepo;

@Service
public class DiscountService {

    @Autowired
    public DiscountRepo discountRepo;

    public List<Discounts> getDiscounts() {
        return discountRepo.findAll();
    }

    public String saveDiscounts(Discounts discounts) {
        System.out.println(discounts.toString());
        discountRepo.save(discounts);
        return "Saved Successfully";
    }

    public String deleteDiscount(String code) {
        discountRepo.deleteById(code);
        return "Deleted Successfully";
    }
}
