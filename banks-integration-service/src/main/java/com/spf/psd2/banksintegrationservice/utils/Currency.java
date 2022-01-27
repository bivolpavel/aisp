package com.spf.psd2.banksintegrationservice.utils;

public enum Currency {
    EUR("EUR");

    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
