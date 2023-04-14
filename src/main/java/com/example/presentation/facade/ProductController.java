package com.example.presentation.facade;

import com.example.application.service.ProductApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductApplicationService productApplicationService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List findAll() {
        return productApplicationService.findAll();
    }

}
