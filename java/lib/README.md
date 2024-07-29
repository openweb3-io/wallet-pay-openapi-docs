# openapi-java-client

Pay API Documentations
- API version: 1.0
  - Build date: 2024-07-29T16:32:55.820573+08:00[Asia/Shanghai]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
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
import io.openweb3.pay.internal.api.EndpointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.pay.openweb3.io");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    EndpointApi apiInstance = new EndpointApi(defaultClient);
    String appId = "app_12345xsfei"; // String | Specified the app id.
    EndpointIn endpointIn = new EndpointIn(); // EndpointIn | 
    try {
      EndpointOut result = apiInstance.v1EndpointCreate(appId, endpointIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#v1EndpointCreate");
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
*EndpointApi* | [**v1EndpointCreate**](docs/EndpointApi.md#v1EndpointCreate) | **POST** /api/v1/apps/{appId}/endpoints | Create endpoint
*EndpointApi* | [**v1EndpointDelete**](docs/EndpointApi.md#v1EndpointDelete) | **DELETE** /api/v1/apps/{appId}/endpoints/{endpointId} | Delete endpoint
*EndpointApi* | [**v1EndpointGet**](docs/EndpointApi.md#v1EndpointGet) | **GET** /api/v1/apps/{appId}/endpoints/{endpointId} | Get endpoint
*EndpointApi* | [**v1EndpointList**](docs/EndpointApi.md#v1EndpointList) | **GET** /api/v1/apps/{appId}/endpoints | List endpoints
*EndpointApi* | [**v1EndpointPatch**](docs/EndpointApi.md#v1EndpointPatch) | **PATCH** /api/v1/apps/{appId}/endpoints/{endpointId} | Patch endpoint
*InvoiceApi* | [**v1InvoiceCreate**](docs/InvoiceApi.md#v1InvoiceCreate) | **POST** /api/v1/apps/{appId}/invoices | Create invoice
*InvoiceApi* | [**v1InvoiceGet**](docs/InvoiceApi.md#v1InvoiceGet) | **GET** /api/v1/apps/{appId}/invoices/{idOrUid} | Get invoice
*InvoiceApi* | [**v1InvoiceList**](docs/InvoiceApi.md#v1InvoiceList) | **GET** /api/v1/apps/{appId}/invoices | List invoices


## Documentation for Models

 - [EndpointIn](docs/EndpointIn.md)
 - [EndpointOut](docs/EndpointOut.md)
 - [EndpointPatch](docs/EndpointPatch.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [HttpErrorOut](docs/HttpErrorOut.md)
 - [InvoiceIn](docs/InvoiceIn.md)
 - [InvoiceOut](docs/InvoiceOut.md)
 - [Invoiceing](docs/Invoiceing.md)
 - [ListResponseEndpointOut](docs/ListResponseEndpointOut.md)
 - [ListResponseInvoiceOut](docs/ListResponseInvoiceOut.md)
 - [Ordering](docs/Ordering.md)
 - [ValidationError](docs/ValidationError.md)
 - [WebhookMessage](docs/WebhookMessage.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


