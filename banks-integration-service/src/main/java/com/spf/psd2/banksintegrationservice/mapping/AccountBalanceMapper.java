package com.spf.psd2.banksintegrationservice.mapping;

import com.spf.psd2.banksintegrationservice.client.generated.model.Account;
import com.spf.psd2.banksintegrationservice.client.generated.model.Balance;
import com.spf.psd2.banksintegrationservice.payload.AccountBalanceResponse;
import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountBalanceMapper {

    @Mappings({
            @Mapping(target="iban", source="account.iban"),
            @Mapping(target="currency", source="account.currency"),
            @Mapping(target="product", source="account.product"),
            @Mapping(target="resourceId", source = "account.resourceId"),
            @Mapping(target="ownerName", source="account.name"),
            @Mapping(target="amount", source="balance.balanceAmount.amount")
    })
    AccountBalanceResponse accountAndBalanceToAccountBalanceResponse(Account account, Balance balance);

}
