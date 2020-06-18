package com.example.sampleProject.controller;

import com.example.sampleProject.model.Product;
import com.example.sampleProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = { "http://frontend-sample-project-dl-f73-sandbox.apps.ocp3.eu-west-1.stable.aws.vwdl.de/", "http://frontend-sample-project-dl-f73-sandbox.apps.ocp3.eu-west-1.stable.aws.vwdl.de" })
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
