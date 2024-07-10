# openapi-java-client

Wallet Pay API Documentations
- API version: 1.0
  - Build date: 2024-07-09T17:47:29.721176+08:00[Asia/Shanghai]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import io.openweb3.pay.internal.ApiClient;
import io.openweb3.pay.internal.ApiException;
import io.openweb3.pay.internal.Configuration;
import io.openweb3.pay.internal.auth.*;
import io.openweb3.pay.internal.models.*;
import io.openweb3.pay.internal.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pay.openweb3.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Integer limit = 20; // Integer | Limit the number of returned items
    Integer offset = 0; // Integer | Specifying the amount of excluded from a response the first N items
    try {
      ListResponseAccountOut result = apiInstance.v1AccountList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#v1AccountList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.pay.openweb3.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**v1AccountList**](docs/AccountApi.md#v1AccountList) | **GET** /api/v1/accounts | List Accounts
*OrderApi* | [**v1OrderCreate**](docs/OrderApi.md#v1OrderCreate) | **POST** /api/v1/orders | Create Order
*OrderApi* | [**v1OrderList**](docs/OrderApi.md#v1OrderList) | **GET** /api/v1/orders | List Orders
*WebhookApi* | [**v1WebhookCreate**](docs/WebhookApi.md#v1WebhookCreate) | **POST** /api/v1/webhooks | Create webhook
*WebhookApi* | [**v1WebhookDelete**](docs/WebhookApi.md#v1WebhookDelete) | **DELETE** /api/v1/webhooks/{webhookId} | Delete webhook
*WebhookApi* | [**v1WebhookList**](docs/WebhookApi.md#v1WebhookList) | **GET** /api/v1/webhooks | List webhooks
*WebhookApi* | [**v1WebhookPatch**](docs/WebhookApi.md#v1WebhookPatch) | **PATCH** /api/v1/webhooks/{webhookId} | update webhook
*WebhookApi* | [**v1WebhookRetrieve**](docs/WebhookApi.md#v1WebhookRetrieve) | **GET** /api/v1/webhooks/{webhookId} | Retrieve webhook


## Documentation for Models

 - [AccountOut](docs/AccountOut.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [HttpErrorOut](docs/HttpErrorOut.md)
 - [ListResponseAccountOut](docs/ListResponseAccountOut.md)
 - [ListResponseOrderOut](docs/ListResponseOrderOut.md)
 - [ListResponseWebhookOut](docs/ListResponseWebhookOut.md)
 - [OrderIn](docs/OrderIn.md)
 - [OrderOut](docs/OrderOut.md)
 - [Ordering](docs/Ordering.md)
 - [ValidationError](docs/ValidationError.md)
 - [WebhookIn](docs/WebhookIn.md)
 - [WebhookOut](docs/WebhookOut.md)
 - [WebhookPatch](docs/WebhookPatch.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


