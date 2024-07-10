/*
 * Wallet Pay API Documentations
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.pay.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OrderIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-09T17:47:29.721176+08:00[Asia/Shanghai]")
public class OrderIn {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private String chain;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;


  public OrderIn metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public OrderIn putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Optional metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional metadata")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public OrderIn userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Optional user identifier
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "userid_example", value = "Optional user identifier")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public OrderIn channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Order channel
   * @return channel
  **/
  @ApiModelProperty(example = "ton-connect", required = true, value = "Order channel")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public OrderIn chain(String chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * Blockchain code
   * @return chain
  **/
  @ApiModelProperty(example = "ton", required = true, value = "Blockchain code")

  public String getChain() {
    return chain;
  }


  public void setChain(String chain) {
    this.chain = chain;
  }


  public OrderIn uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Optional unique identifier for the order
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-order-identifier", value = "Optional unique identifier for the order")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public OrderIn currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency code
   * @return currency
  **/
  @ApiModelProperty(example = "USDT", required = true, value = "Currency code")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public OrderIn amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Big decimal string representation. Note that the max precision (number of digits after decimal point) depends on the currencyCode. E.g. for all fiat currencies is 2 (0.01), for BTC is 8, for USDT is 6. There&#39;s also min order amount for creating an order. It&#39;s 0.000001 BTC / 0.01 USDT / 0.01 USD / 0.01 EUR / 0.1 RUB.
   * @return amount
  **/
  @ApiModelProperty(example = "0.0012345", required = true, value = "Big decimal string representation. Note that the max precision (number of digits after decimal point) depends on the currencyCode. E.g. for all fiat currencies is 2 (0.01), for BTC is 8, for USDT is 6. There's also min order amount for creating an order. It's 0.000001 BTC / 0.01 USDT / 0.01 USD / 0.01 EUR / 0.1 RUB.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
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
    OrderIn orderIn = (OrderIn) o;
    return Objects.equals(this.metadata, orderIn.metadata) &&
        Objects.equals(this.userId, orderIn.userId) &&
        Objects.equals(this.channel, orderIn.channel) &&
        Objects.equals(this.chain, orderIn.chain) &&
        Objects.equals(this.uid, orderIn.uid) &&
        Objects.equals(this.currency, orderIn.currency) &&
        Objects.equals(this.amount, orderIn.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, userId, channel, chain, uid, currency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderIn {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
