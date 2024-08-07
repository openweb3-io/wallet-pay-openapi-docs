/*
 * Pay API Documentations
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.pay.internal.api;

import io.openweb3.pay.internal.ApiCallback;
import io.openweb3.pay.internal.ApiClient;
import io.openweb3.pay.internal.ApiException;
import io.openweb3.pay.internal.ApiResponse;
import io.openweb3.pay.internal.Configuration;
import io.openweb3.pay.internal.Pair;
import io.openweb3.pay.internal.ProgressRequestBody;
import io.openweb3.pay.internal.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.openweb3.pay.models.HTTPValidationError;
import io.openweb3.pay.models.HttpErrorOut;
import io.openweb3.pay.models.InvoiceIn;
import io.openweb3.pay.models.InvoiceOut;
import io.openweb3.pay.models.ListResponseInvoiceOut;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceApi {
    private ApiClient localVarApiClient;

    public InvoiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InvoiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1InvoiceCreate
     * @param appId Specified the app id. (required)
     * @param invoiceIn  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1InvoiceCreateCall(String appId, InvoiceIn invoiceIn, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = invoiceIn;

        // create path and map variables
        String localVarPath = "/api/v1/apps/{appId}/invoices"
            .replaceAll("\\{" + "appId" + "\\}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1InvoiceCreateValidateBeforeCall(String appId, InvoiceIn invoiceIn, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling v1InvoiceCreate(Async)");
        }
        
        // verify the required parameter 'invoiceIn' is set
        if (invoiceIn == null) {
            throw new ApiException("Missing the required parameter 'invoiceIn' when calling v1InvoiceCreate(Async)");
        }
        

        okhttp3.Call localVarCall = v1InvoiceCreateCall(appId, invoiceIn, _callback);
        return localVarCall;

    }

    /**
     * Create invoice
     * Create a new invoice.
     * @param appId Specified the app id. (required)
     * @param invoiceIn  (required)
     * @return InvoiceOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public InvoiceOut v1InvoiceCreate(String appId, InvoiceIn invoiceIn) throws ApiException {
        ApiResponse<InvoiceOut> localVarResp = v1InvoiceCreateWithHttpInfo(appId, invoiceIn);
        return localVarResp.getData();
    }

    /**
     * Create invoice
     * Create a new invoice.
     * @param appId Specified the app id. (required)
     * @param invoiceIn  (required)
     * @return ApiResponse&lt;InvoiceOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvoiceOut> v1InvoiceCreateWithHttpInfo(String appId, InvoiceIn invoiceIn) throws ApiException {
        okhttp3.Call localVarCall = v1InvoiceCreateValidateBeforeCall(appId, invoiceIn, null);
        Type localVarReturnType = new TypeToken<InvoiceOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create invoice (asynchronously)
     * Create a new invoice.
     * @param appId Specified the app id. (required)
     * @param invoiceIn  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1InvoiceCreateAsync(String appId, InvoiceIn invoiceIn, final ApiCallback<InvoiceOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1InvoiceCreateValidateBeforeCall(appId, invoiceIn, _callback);
        Type localVarReturnType = new TypeToken<InvoiceOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1InvoiceGet
     * @param appId Specified the app id. (required)
     * @param idOrUid Specified the invoice id or invoice uid. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1InvoiceGetCall(String appId, String idOrUid, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/apps/{appId}/invoices/{idOrUid}"
            .replaceAll("\\{" + "appId" + "\\}", localVarApiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "idOrUid" + "\\}", localVarApiClient.escapeString(idOrUid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1InvoiceGetValidateBeforeCall(String appId, String idOrUid, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling v1InvoiceGet(Async)");
        }
        
        // verify the required parameter 'idOrUid' is set
        if (idOrUid == null) {
            throw new ApiException("Missing the required parameter 'idOrUid' when calling v1InvoiceGet(Async)");
        }
        

        okhttp3.Call localVarCall = v1InvoiceGetCall(appId, idOrUid, _callback);
        return localVarCall;

    }

    /**
     * Get invoice
     * retrieve a specified webhook endpoint.
     * @param appId Specified the app id. (required)
     * @param idOrUid Specified the invoice id or invoice uid. (required)
     * @return InvoiceOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public InvoiceOut v1InvoiceGet(String appId, String idOrUid) throws ApiException {
        ApiResponse<InvoiceOut> localVarResp = v1InvoiceGetWithHttpInfo(appId, idOrUid);
        return localVarResp.getData();
    }

    /**
     * Get invoice
     * retrieve a specified webhook endpoint.
     * @param appId Specified the app id. (required)
     * @param idOrUid Specified the invoice id or invoice uid. (required)
     * @return ApiResponse&lt;InvoiceOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvoiceOut> v1InvoiceGetWithHttpInfo(String appId, String idOrUid) throws ApiException {
        okhttp3.Call localVarCall = v1InvoiceGetValidateBeforeCall(appId, idOrUid, null);
        Type localVarReturnType = new TypeToken<InvoiceOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get invoice (asynchronously)
     * retrieve a specified webhook endpoint.
     * @param appId Specified the app id. (required)
     * @param idOrUid Specified the invoice id or invoice uid. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1InvoiceGetAsync(String appId, String idOrUid, final ApiCallback<InvoiceOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1InvoiceGetValidateBeforeCall(appId, idOrUid, _callback);
        Type localVarReturnType = new TypeToken<InvoiceOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1InvoiceList
     * @param appId Specified the app id. (required)
     * @param limit Limit the number of returned items (optional, default to 20)
     * @param offset Specifying the amount of excluded from a response the first N invoices (optional, default to 0)
     * @param userId Optional invoice user id (optional)
     * @param channel Channel of the invoice (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1InvoiceListCall(String appId, Integer limit, Integer offset, String userId, String channel, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/apps/{appId}/invoices"
            .replaceAll("\\{" + "appId" + "\\}", localVarApiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (userId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("userId", userId));
        }

        if (channel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("channel", channel));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1InvoiceListValidateBeforeCall(String appId, Integer limit, Integer offset, String userId, String channel, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling v1InvoiceList(Async)");
        }
        

        okhttp3.Call localVarCall = v1InvoiceListCall(appId, limit, offset, userId, channel, _callback);
        return localVarCall;

    }

    /**
     * List invoices
     * List invoices.
     * @param appId Specified the app id. (required)
     * @param limit Limit the number of returned items (optional, default to 20)
     * @param offset Specifying the amount of excluded from a response the first N invoices (optional, default to 0)
     * @param userId Optional invoice user id (optional)
     * @param channel Channel of the invoice (optional)
     * @return ListResponseInvoiceOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ListResponseInvoiceOut v1InvoiceList(String appId, Integer limit, Integer offset, String userId, String channel) throws ApiException {
        ApiResponse<ListResponseInvoiceOut> localVarResp = v1InvoiceListWithHttpInfo(appId, limit, offset, userId, channel);
        return localVarResp.getData();
    }

    /**
     * List invoices
     * List invoices.
     * @param appId Specified the app id. (required)
     * @param limit Limit the number of returned items (optional, default to 20)
     * @param offset Specifying the amount of excluded from a response the first N invoices (optional, default to 0)
     * @param userId Optional invoice user id (optional)
     * @param channel Channel of the invoice (optional)
     * @return ApiResponse&lt;ListResponseInvoiceOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListResponseInvoiceOut> v1InvoiceListWithHttpInfo(String appId, Integer limit, Integer offset, String userId, String channel) throws ApiException {
        okhttp3.Call localVarCall = v1InvoiceListValidateBeforeCall(appId, limit, offset, userId, channel, null);
        Type localVarReturnType = new TypeToken<ListResponseInvoiceOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List invoices (asynchronously)
     * List invoices.
     * @param appId Specified the app id. (required)
     * @param limit Limit the number of returned items (optional, default to 20)
     * @param offset Specifying the amount of excluded from a response the first N invoices (optional, default to 0)
     * @param userId Optional invoice user id (optional)
     * @param channel Channel of the invoice (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1InvoiceListAsync(String appId, Integer limit, Integer offset, String userId, String channel, final ApiCallback<ListResponseInvoiceOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1InvoiceListValidateBeforeCall(appId, limit, offset, userId, channel, _callback);
        Type localVarReturnType = new TypeToken<ListResponseInvoiceOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
