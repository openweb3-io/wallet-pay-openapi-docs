/*
 * Wallet-Pay API Documentations
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.walletpay.internal.api;

import io.openweb3.walletpay.internal.ApiCallback;
import io.openweb3.walletpay.internal.ApiClient;
import io.openweb3.walletpay.internal.ApiException;
import io.openweb3.walletpay.internal.ApiResponse;
import io.openweb3.walletpay.internal.Configuration;
import io.openweb3.walletpay.internal.Pair;
import io.openweb3.walletpay.internal.ProgressRequestBody;
import io.openweb3.walletpay.internal.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.openweb3.walletpay.models.EndpointIn;
import io.openweb3.walletpay.models.EndpointOut;
import io.openweb3.walletpay.models.HttpErrorOut;
import io.openweb3.walletpay.models.ListResponseEndpointOut;
import io.openweb3.walletpay.models.Ordering;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhookEndpointApi {
    private ApiClient localVarApiClient;

    public WebhookEndpointApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookEndpointApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1EndpointCreate
     * @param endpointIn  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1EndpointCreateCall(EndpointIn endpointIn, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = endpointIn;

        // create path and map variables
        String localVarPath = "/api/v1/webhooks/endpoints";

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
    private okhttp3.Call v1EndpointCreateValidateBeforeCall(EndpointIn endpointIn, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'endpointIn' is set
        if (endpointIn == null) {
            throw new ApiException("Missing the required parameter 'endpointIn' when calling v1EndpointCreate(Async)");
        }
        

        okhttp3.Call localVarCall = v1EndpointCreateCall(endpointIn, _callback);
        return localVarCall;

    }

    /**
     * Create endpoint
     * Create a webhook endpoint.
     * @param endpointIn  (required)
     * @return EndpointOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public EndpointOut v1EndpointCreate(EndpointIn endpointIn) throws ApiException {
        ApiResponse<EndpointOut> localVarResp = v1EndpointCreateWithHttpInfo(endpointIn);
        return localVarResp.getData();
    }

    /**
     * Create endpoint
     * Create a webhook endpoint.
     * @param endpointIn  (required)
     * @return ApiResponse&lt;EndpointOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EndpointOut> v1EndpointCreateWithHttpInfo(EndpointIn endpointIn) throws ApiException {
        okhttp3.Call localVarCall = v1EndpointCreateValidateBeforeCall(endpointIn, null);
        Type localVarReturnType = new TypeToken<EndpointOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create endpoint (asynchronously)
     * Create a webhook endpoint.
     * @param endpointIn  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1EndpointCreateAsync(EndpointIn endpointIn, final ApiCallback<EndpointOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1EndpointCreateValidateBeforeCall(endpointIn, _callback);
        Type localVarReturnType = new TypeToken<EndpointOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1EndpointDelete
     * @param endpointId Specified the endpoint id. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1EndpointDeleteCall(String endpointId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/webhooks/endpoints/{endpointId}"
            .replaceAll("\\{" + "endpointId" + "\\}", localVarApiClient.escapeString(endpointId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call v1EndpointDeleteValidateBeforeCall(String endpointId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'endpointId' is set
        if (endpointId == null) {
            throw new ApiException("Missing the required parameter 'endpointId' when calling v1EndpointDelete(Async)");
        }
        

        okhttp3.Call localVarCall = v1EndpointDeleteCall(endpointId, _callback);
        return localVarCall;

    }

    /**
     * Delete endpoint
     * delete the specified webhook endpoint.
     * @param endpointId Specified the endpoint id. (required)
     * @return EndpointOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public EndpointOut v1EndpointDelete(String endpointId) throws ApiException {
        ApiResponse<EndpointOut> localVarResp = v1EndpointDeleteWithHttpInfo(endpointId);
        return localVarResp.getData();
    }

    /**
     * Delete endpoint
     * delete the specified webhook endpoint.
     * @param endpointId Specified the endpoint id. (required)
     * @return ApiResponse&lt;EndpointOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EndpointOut> v1EndpointDeleteWithHttpInfo(String endpointId) throws ApiException {
        okhttp3.Call localVarCall = v1EndpointDeleteValidateBeforeCall(endpointId, null);
        Type localVarReturnType = new TypeToken<EndpointOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete endpoint (asynchronously)
     * delete the specified webhook endpoint.
     * @param endpointId Specified the endpoint id. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 201 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1EndpointDeleteAsync(String endpointId, final ApiCallback<EndpointOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1EndpointDeleteValidateBeforeCall(endpointId, _callback);
        Type localVarReturnType = new TypeToken<EndpointOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1EndpointList
     * @param limit Limit the number of returned items (optional, default to 20)
     * @param cursor Specifying the start cursor position (optional)
     * @param order The sorting order of the returned items (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1EndpointListCall(Integer limit, String cursor, Ordering order, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/webhooks/endpoints";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
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
    private okhttp3.Call v1EndpointListValidateBeforeCall(Integer limit, String cursor, Ordering order, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1EndpointListCall(limit, cursor, order, _callback);
        return localVarCall;

    }

    /**
     * List endpoints
     * List endpoints.
     * @param limit Limit the number of returned items (optional, default to 20)
     * @param cursor Specifying the start cursor position (optional)
     * @param order The sorting order of the returned items (optional)
     * @return ListResponseEndpointOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ListResponseEndpointOut v1EndpointList(Integer limit, String cursor, Ordering order) throws ApiException {
        ApiResponse<ListResponseEndpointOut> localVarResp = v1EndpointListWithHttpInfo(limit, cursor, order);
        return localVarResp.getData();
    }

    /**
     * List endpoints
     * List endpoints.
     * @param limit Limit the number of returned items (optional, default to 20)
     * @param cursor Specifying the start cursor position (optional)
     * @param order The sorting order of the returned items (optional)
     * @return ApiResponse&lt;ListResponseEndpointOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListResponseEndpointOut> v1EndpointListWithHttpInfo(Integer limit, String cursor, Ordering order) throws ApiException {
        okhttp3.Call localVarCall = v1EndpointListValidateBeforeCall(limit, cursor, order, null);
        Type localVarReturnType = new TypeToken<ListResponseEndpointOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List endpoints (asynchronously)
     * List endpoints.
     * @param limit Limit the number of returned items (optional, default to 20)
     * @param cursor Specifying the start cursor position (optional)
     * @param order The sorting order of the returned items (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1EndpointListAsync(Integer limit, String cursor, Ordering order, final ApiCallback<ListResponseEndpointOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1EndpointListValidateBeforeCall(limit, cursor, order, _callback);
        Type localVarReturnType = new TypeToken<ListResponseEndpointOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
