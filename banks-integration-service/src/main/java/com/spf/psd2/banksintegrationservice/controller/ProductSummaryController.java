package com.spf.psd2.banksintegrationservice.controller;

import com.spf.psd2.banksintegrationservice.payload.ProductSummaryResponse;
import com.spf.psd2.banksintegrationservice.service.ProductSummaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSummaryController {

    private final ProductSummaryService productSummaryService;

    public ProductSummaryController(ProductSummaryService productSummaryService) {
        this.productSummaryService = productSummaryService;
    }

    @GetMapping("/productSummary")
    public ResponseEntity<ProductSummaryResponse> getProductSummary(String userId) {
        return ResponseEntity.ok(productSummaryService.getProductSummary(userId));
    }
}
