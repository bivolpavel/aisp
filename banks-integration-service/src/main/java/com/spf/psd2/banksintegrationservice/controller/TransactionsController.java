package com.spf.psd2.banksintegrationservice.controller;

import com.spf.psd2.banksintegrationservice.payload.AllAccountsTransactionsResponses;
import com.spf.psd2.banksintegrationservice.service.TransactionsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TransactionsController {

    private final TransactionsService transactionsService;

    public TransactionsController(TransactionsService transactionsService) {
        this.transactionsService = transactionsService;
    }

    @GetMapping("/transactions")
    public ResponseEntity<AllAccountsTransactionsResponses> getTransactions(){

        Optional<AllAccountsTransactionsResponses> allAccountsTransactionsResponses = transactionsService.getTransactionsInfo();

        return allAccountsTransactionsResponses
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }
}
