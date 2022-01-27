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
 * TPPMessages
 */

public class TPPMessages {

  @JsonProperty("tppMessages")

  private List<TPPMessage> tppMessages = new ArrayList<>();
  public TPPMessages tppMessages(List<TPPMessage> tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  public TPPMessages addTppMessagesItem(TPPMessage tppMessagesItem) {
    this.tppMessages.add(tppMessagesItem);
    return this;
  }

  /**
  * Get tppMessages
  * @return tppMessages
  **/
  @Schema(required = true, description = "")
  public List<TPPMessage> getTppMessages() {
    return tppMessages;
  }
  public void setTppMessages(List<TPPMessage> tppMessages) {
    this.tppMessages = tppMessages;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TPPMessages tpPMessages = (TPPMessages) o;
    return Objects.equals(this.tppMessages, tpPMessages.tppMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tppMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TPPMessages {\n");
    
    sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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