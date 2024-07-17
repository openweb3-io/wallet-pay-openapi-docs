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


import io.openweb3.walletpay.models.HttpErrorOut;
import io.openweb3.walletpay.models.ListResponseOrderOut;
import io.openweb3.walletpay.models.OrderIn;
import io.openweb3.walletpay.models.OrderOut;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderApi {
    private ApiClient localVarApiClient;

    public OrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for v1OrderCreate
     * @param orderIn  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrderCreateCall(OrderIn orderIn, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = orderIn;

        // create path and map variables
        String localVarPath = "/api/v1/pay/orders";

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
    private okhttp3.Call v1OrderCreateValidateBeforeCall(OrderIn orderIn, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'orderIn' is set
        if (orderIn == null) {
            throw new ApiException("Missing the required parameter 'orderIn' when calling v1OrderCreate(Async)");
        }
        

        okhttp3.Call localVarCall = v1OrderCreateCall(orderIn, _callback);
        return localVarCall;

    }

    /**
     * Create Order
     * Create a new order.
     * @param orderIn  (required)
     * @return OrderOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public OrderOut v1OrderCreate(OrderIn orderIn) throws ApiException {
        ApiResponse<OrderOut> localVarResp = v1OrderCreateWithHttpInfo(orderIn);
        return localVarResp.getData();
    }

    /**
     * Create Order
     * Create a new order.
     * @param orderIn  (required)
     * @return ApiResponse&lt;OrderOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OrderOut> v1OrderCreateWithHttpInfo(OrderIn orderIn) throws ApiException {
        okhttp3.Call localVarCall = v1OrderCreateValidateBeforeCall(orderIn, null);
        Type localVarReturnType = new TypeToken<OrderOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Order (asynchronously)
     * Create a new order.
     * @param orderIn  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrderCreateAsync(OrderIn orderIn, final ApiCallback<OrderOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1OrderCreateValidateBeforeCall(orderIn, _callback);
        Type localVarReturnType = new TypeToken<OrderOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for v1OrderList
     * @param size Limit the number of returned items (optional, default to 20)
     * @param page Specifying the page index (optional, default to 0)
     * @param walletId Optional wallet id (optional)
     * @param accountId Optional account id (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrderListCall(Integer size, Integer page, String walletId, String accountId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/pay/orders";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (walletId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("wallet_id", walletId));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
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
    private okhttp3.Call v1OrderListValidateBeforeCall(Integer size, Integer page, String walletId, String accountId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = v1OrderListCall(size, page, walletId, accountId, _callback);
        return localVarCall;

    }

    /**
     * List Orders
     * List orders.
     * @param size Limit the number of returned items (optional, default to 20)
     * @param page Specifying the page index (optional, default to 0)
     * @param walletId Optional wallet id (optional)
     * @param accountId Optional account id (optional)
     * @return ListResponseOrderOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ListResponseOrderOut v1OrderList(Integer size, Integer page, String walletId, String accountId) throws ApiException {
        ApiResponse<ListResponseOrderOut> localVarResp = v1OrderListWithHttpInfo(size, page, walletId, accountId);
        return localVarResp.getData();
    }

    /**
     * List Orders
     * List orders.
     * @param size Limit the number of returned items (optional, default to 20)
     * @param page Specifying the page index (optional, default to 0)
     * @param walletId Optional wallet id (optional)
     * @param accountId Optional account id (optional)
     * @return ApiResponse&lt;ListResponseOrderOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListResponseOrderOut> v1OrderListWithHttpInfo(Integer size, Integer page, String walletId, String accountId) throws ApiException {
        okhttp3.Call localVarCall = v1OrderListValidateBeforeCall(size, page, walletId, accountId, null);
        Type localVarReturnType = new TypeToken<ListResponseOrderOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Orders (asynchronously)
     * List orders.
     * @param size Limit the number of returned items (optional, default to 20)
     * @param page Specifying the page index (optional, default to 0)
     * @param walletId Optional wallet id (optional)
     * @param accountId Optional account id (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
      <table border="1">
         <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call v1OrderListAsync(Integer size, Integer page, String walletId, String accountId, final ApiCallback<ListResponseOrderOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = v1OrderListValidateBeforeCall(size, page, walletId, accountId, _callback);
        Type localVarReturnType = new TypeToken<ListResponseOrderOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
