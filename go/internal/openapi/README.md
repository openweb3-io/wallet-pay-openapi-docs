# Go API client for openapi

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 1.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.GoClientCodegen

## Installation

Install the following dependencies:

```shell
go get github.com/stretchr/testify/assert
go get golang.org/x/oauth2
go get golang.org/x/net/context
```

Put the package under your project folder and add the following in import:

```golang
import sw "./openapi"
```

To use a proxy, set the environment variable `HTTP_PROXY`:

```golang
os.Setenv("HTTP_PROXY", "http://proxy_name:proxy_port")
```

## Configuration of Server URL

Default configuration comes with `Servers` field that contains server objects as defined in the OpenAPI specification.

### Select Server Configuration

For using other server than the one defined on index 0 set context value `sw.ContextServerIndex` of type `int`.

```golang
ctx := context.WithValue(context.Background(), sw.ContextServerIndex, 1)
```

### Templated Server URL

Templated server URL is formatted using default variables from configuration or from context value `sw.ContextServerVariables` of type `map[string]string`.

```golang
ctx := context.WithValue(context.Background(), sw.ContextServerVariables, map[string]string{
	"basePath": "v2",
})
```

Note, enum values are always validated and all unused variables are silently ignored.

### URLs Configuration per Operation

Each operation can use different server URL defined using `OperationServers` map in the `Configuration`.
An operation is uniquely identifield by `"{classname}Service.{nickname}"` string.
Similar rules for overriding default operation server index and variables applies by using `sw.ContextOperationServerIndices` and `sw.ContextOperationServerVariables` context maps.

```
ctx := context.WithValue(context.Background(), sw.ContextOperationServerIndices, map[string]int{
	"{classname}Service.{nickname}": 2,
})
ctx = context.WithValue(context.Background(), sw.ContextOperationServerVariables, map[string]map[string]string{
	"{classname}Service.{nickname}": {
		"port": "8443",
	},
})
```

## Documentation for API Endpoints

All URIs are relative to *https://api.pay.openweb3.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EndpointApi* | [**V1EndpointCreate**](docs/EndpointApi.md#v1endpointcreate) | **Post** /api/v1/apps/{appId}/endpoints | Create endpoint
*EndpointApi* | [**V1EndpointDelete**](docs/EndpointApi.md#v1endpointdelete) | **Delete** /api/v1/apps/{appId}/endpoints/{endpointId} | Delete endpoint
*EndpointApi* | [**V1EndpointGet**](docs/EndpointApi.md#v1endpointget) | **Get** /api/v1/apps/{appId}/endpoints/{endpointId} | Get endpoint
*EndpointApi* | [**V1EndpointList**](docs/EndpointApi.md#v1endpointlist) | **Get** /api/v1/apps/{appId}/endpoints | List endpoints
*EndpointApi* | [**V1EndpointPatch**](docs/EndpointApi.md#v1endpointpatch) | **Patch** /api/v1/apps/{appId}/endpoints/{endpointId} | Patch endpoint
*InvoiceApi* | [**V1InvoiceCreate**](docs/InvoiceApi.md#v1invoicecreate) | **Post** /api/v1/apps/{appId}/invoices | Create invoice
*InvoiceApi* | [**V1InvoiceGet**](docs/InvoiceApi.md#v1invoiceget) | **Get** /api/v1/apps/{appId}/invoices/{idOrUid} | Get invoice
*InvoiceApi* | [**V1InvoiceList**](docs/InvoiceApi.md#v1invoicelist) | **Get** /api/v1/apps/{appId}/invoices | List invoices


## Documentation For Models

 - [EndpointIn](docs/EndpointIn.md)
 - [EndpointOut](docs/EndpointOut.md)
 - [EndpointPatch](docs/EndpointPatch.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [HttpErrorOut](docs/HttpErrorOut.md)
 - [InvoiceIn](docs/InvoiceIn.md)
 - [InvoiceOut](docs/InvoiceOut.md)
 - [ListResponseEndpointOut](docs/ListResponseEndpointOut.md)
 - [ListResponseInvoiceOut](docs/ListResponseInvoiceOut.md)
 - [Ordering](docs/Ordering.md)
 - [ValidationError](docs/ValidationError.md)
 - [WebhookMessage](docs/WebhookMessage.md)


## Documentation For Authorization



### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

Note, each API key must be added to a map of `map[string]APIKey` where the key is: x-api-key and passed in as the auth context for each request.


## Documentation for Utility Methods

Due to the fact that model structure members are all pointers, this package contains
a number of utility functions to easily obtain pointers to values of basic types.
Each of these functions takes a value of the given basic type and returns a pointer to it:

* `PtrBool`
* `PtrInt`
* `PtrInt32`
* `PtrInt64`
* `PtrFloat`
* `PtrFloat32`
* `PtrFloat64`
* `PtrString`
* `PtrTime`

## Author



