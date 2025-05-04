package com.test.Assignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Assignment.models.Discounts;
import com.test.Assignment.service.DiscountService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/assignment")
public class AssignmentController {

    @Autowired
    public DiscountService discountService;

    @GetMapping("/getdiscounts")
    public List<Discounts> getAllDiscounts() {
        return discountService.getDiscounts();
    }

    @PostMapping("/savediscounts")
    public String saveDiscount(@RequestBody Discounts discounts) {
        return discountService.saveDiscounts(discounts);
    }

    @PutMapping("/updatediscounts")
    public String postMethodName(@RequestBody Discounts discounts) {
        return discountService.saveDiscounts(discounts);
    }

    @DeleteMapping("/deletediscounts/{code}")
    public String deleteDiscount(@PathVariable String code) {
        return discountService.deleteDiscount(code);
    }

}
