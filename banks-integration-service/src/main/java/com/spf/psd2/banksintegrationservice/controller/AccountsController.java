package com.spf.psd2.banksintegrationservice.controller;

import com.spf.psd2.banksintegrationservice.payload.AllAccountsResponse;
import com.spf.psd2.banksintegrationservice.service.AccountsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class AccountsController {

    private final Logger logger = LoggerFactory.getLogger(AccountsController.class);

    private final AccountsService accountsService;

    public AccountsController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @GetMapping("/accounts")
    public ResponseEntity<AllAccountsResponse> getAccount() {
        logger.debug("Get all accounts!");
        Optional<AllAccountsResponse> accountsResponseOptional = accountsService.getAllAccountBalances();
        logger.debug("Accounts response {}", accountsResponseOptional);
        return accountsResponseOptional
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}