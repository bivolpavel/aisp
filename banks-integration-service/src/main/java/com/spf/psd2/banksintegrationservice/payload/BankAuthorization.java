package com.spf.psd2.banksintegrationservice.payload;

public class BankAuthorization {
    private String authorizationUrl;

    public BankAuthorization(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }
}
