package com.spf.psd2.banksintegrationservice.controller;

import com.spf.psd2.banksintegrationservice.payload.BankAuthorization;
import com.spf.psd2.banksintegrationservice.service.BankAuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class AddBankAccountController {

    private final Logger logger = LoggerFactory.getLogger(AddBankAccountController.class);

    private final BankAuthorizationService bankAuthorizationService;

    public AddBankAccountController(BankAuthorizationService bankAuthorizationService) {
        this.bankAuthorizationService = bankAuthorizationService;
    }

    @PostMapping("/banks/authorization/url")
    public ResponseEntity<BankAuthorization> initiateAuthorization() {
        logger.debug("Initiate authorization flow!");
        Optional<String> url = bankAuthorizationService.getBankAuthorizationUrl();
        logger.debug("Bank authorization url is: {}", url);
        return url
                .map(s -> ResponseEntity.ok(new BankAuthorization(s)))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    @PostMapping("/banks/accessToken")
    public ResponseEntity redirectBack( @RequestParam String code, @RequestParam(required = false) String state){
        logger.debug("Receive redirect from bank with code: {}", code);
        bankAuthorizationService.getCustomerAccessToken(code, state);
        return ResponseEntity.ok().build();
    }
}
