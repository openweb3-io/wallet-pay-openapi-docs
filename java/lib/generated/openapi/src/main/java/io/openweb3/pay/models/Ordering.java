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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Defines the ordering in a listing of results.
 */
@JsonAdapter(Ordering.Adapter.class)
public enum Ordering {
  
  ASC("asc"),
  
  DESC("desc");

  private String value;

  Ordering(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Ordering fromValue(String value) {
    for (Ordering b : Ordering.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Ordering> {
    @Override
    public void write(final JsonWriter jsonWriter, final Ordering enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Ordering read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Ordering.fromValue(value);
    }
  }
}

