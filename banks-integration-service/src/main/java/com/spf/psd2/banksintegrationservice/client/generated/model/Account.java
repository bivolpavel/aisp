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
import java.util.UUID;

/**
 * Account
 */

public class Account {

  @JsonProperty("resourceId")

  private UUID resourceId = null;

  @JsonProperty("iban")

  private String iban = null;

  @JsonProperty("maskedPan")

  private String maskedPan = null;

  @JsonProperty("name")

  private String name = null;

  @JsonProperty("currency")

  private String currency = null;

  @JsonProperty("product")

  private String product = null;

  @JsonProperty("_links")

  private AccountLinks _links = null;
  public Account resourceId(UUID resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  

  /**
  * This is the data element to be used in the path when retrieving data from a dedicated account.
  * @return resourceId
  **/
  @Schema(example = "7de0041d-4f25-4b6c-a885-0bbeb1eab220", required = true, description = "This is the data element to be used in the path when retrieving data from a dedicated account.")
  public UUID getResourceId() {
    return resourceId;
  }
  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
  }
  public Account iban(String iban) {
    this.iban = iban;
    return this;
  }

  

  /**
  * This is the IBAN of the account belonging to the id
  * @return iban
  **/
  @Schema(example = "NL69INGB0123456789", description = "This is the IBAN of the account belonging to the id")
  public String getIban() {
    return iban;
  }
  public void setIban(String iban) {
    this.iban = iban;
  }
  public Account maskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

  

  /**
  * This is the masked credit card number
  * @return maskedPan
  **/
  @Schema(example = "123456******6789", description = "This is the masked credit card number")
  public String getMaskedPan() {
    return maskedPan;
  }
  public void setMaskedPan(String maskedPan) {
    this.maskedPan = maskedPan;
  }
  public Account name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Name of the account holder as registered at ING
  * @return name
  **/
  @Schema(example = "A. Van Dijk", required = true, description = "Name of the account holder as registered at ING")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Account currency(String currency) {
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
  public Account product(String product) {
    this.product = product;
    return this;
  }

  

  /**
  * Product name for the account
  * @return product
  **/
  @Schema(example = "Current Account", required = true, description = "Product name for the account")
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }
  public Account _links(AccountLinks _links) {
    this._links = _links;
    return this;
  }

  

  /**
  * Get _links
  * @return _links
  **/
  @Schema(required = true, description = "")
  public AccountLinks getLinks() {
    return _links;
  }
  public void setLinks(AccountLinks _links) {
    this._links = _links;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.resourceId, account.resourceId) &&
        Objects.equals(this.iban, account.iban) &&
        Objects.equals(this.maskedPan, account.maskedPan) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.product, account.product) &&
        Objects.equals(this._links, account._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, iban, maskedPan, name, currency, product, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
