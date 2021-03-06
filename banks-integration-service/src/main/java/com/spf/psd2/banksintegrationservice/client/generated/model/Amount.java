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

import java.util.Objects;

/**
 * Amount
 */

public class Amount {

  @JsonProperty("currency")

  private String currency = null;

  @JsonProperty("amount")

  private Double amount = null;
  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

  

  /**
  * 3 Letter ISO Currency Code: ISO 4217 code
  * @return currency
  **/
  @Schema(example = "EUR", required = true, description = "3 Letter ISO Currency Code: ISO 4217 code")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }
  public Amount amount(Double amount) {
    this.amount = amount;
    return this;
  }

  

  /**
  * &#x27;The amount given with fractional digits, where fractions must be  compliant to the currency definition. The decimal separator is a dot.  The number of fractional digits (or minor unit of currency) must  comply with ISO 4217. totalDigits 18 fractionDigits 5.  This can include a \&quot;-\&quot; in case of a debit amount.&#x27;
  * @return amount
  **/
  @Schema(example = "100.12", required = true, description = "'The amount given with fractional digits, where fractions must be  compliant to the currency definition. The decimal separator is a dot.  The number of fractional digits (or minor unit of currency) must  comply with ISO 4217. totalDigits 18 fractionDigits 5.  This can include a \"-\" in case of a debit amount.'")
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.currency, amount.currency) &&
        Objects.equals(this.amount, amount.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
