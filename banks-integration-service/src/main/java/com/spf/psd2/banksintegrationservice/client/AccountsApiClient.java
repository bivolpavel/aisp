package com.spf.psd2.banksintegrationservice.client;

import com.spf.psd2.banksintegrationservice.client.generated.model.AccountsResponse;
import com.spf.psd2.banksintegrationservice.client.generated.model.BalancesResponse;
import com.spf.psd2.banksintegrationservice.client.generated.model.CardTransactionsResponse;
import com.spf.psd2.banksintegrationservice.client.generated.model.TransactionsResponse;
import org.springframework.web.client.RestClientException;

import java.util.Optional;
import java.util.UUID;

public interface AccountsApiClient {

    Optional<AccountsResponse> getAccounts() throws RestClientException;

    Optional<BalancesResponse> getAccountsBalance(UUID accountId, String currency) throws RestClientException;

    Optional<TransactionsResponse> getAccountTransactions(UUID accountId, String currency) throws RestClientException;

    Optional<CardTransactionsResponse> getAccountsCardTransactions(UUID accountId);



}
