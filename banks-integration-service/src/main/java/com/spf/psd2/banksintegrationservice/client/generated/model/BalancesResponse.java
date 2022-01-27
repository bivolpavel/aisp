/*
 * Account Information API
 * Create Account Information Services consuming applications that offer great added value to your customers and users. Our Account Information Service will enable secure access to all European ING online accessible payment accounts.
 *
 * OpenAPI spec version: 2.5.0
 * Contact: developerportal@ing.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.spf.psd2.banksintegrationservice.client.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BalancesResponse
 */

public class BalancesResponse {

  @JsonProperty("account")

  private AccountReferenceIbanAndPan account = null;

  @JsonProperty("balances")

  private List<Balance> balances = new ArrayList<>();
  public BalancesResponse account(AccountReferenceIbanAndPan account) {
    this.account = account;
    return this;
  }

  

  /**
  * Get account
  * @return account
  **/
  @Schema(description = "")
  public AccountReferenceIbanAndPan getAccount() {
    return account;
  }
  public void setAccount(AccountReferenceIbanAndPan account) {
    this.account = account;
  }
  public BalancesResponse balances(List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public BalancesResponse addBalancesItem(Balance balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

  /**
  * Get balances
  * @return balances
  **/
  @Schema(required = true, description = "")
  public List<Balance> getBalances() {
    return balances;
  }
  public void setBalances(List<Balance> balances) {
    this.balances = balances;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalancesResponse balancesResponse = (BalancesResponse) o;
    return Objects.equals(this.account, balancesResponse.account) &&
        Objects.equals(this.balances, balancesResponse.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, balances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancesResponse {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
