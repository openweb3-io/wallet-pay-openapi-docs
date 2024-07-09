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


package io.openweb3.pay.internal.api;

import io.openweb3.pay.internal.ApiException;
import io.openweb3.pay.models.HTTPValidationError;
import io.openweb3.pay.models.HttpErrorOut;
import io.openweb3.pay.models.WebhookIn;
import io.openweb3.pay.models.WebhookOut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookApi
 */
@Ignore
public class WebhookApiTest {

    private final WebhookApi api = new WebhookApi();

    
    /**
     * Create webhook
     *
     * Create a webhook.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WebhookCreateTest() throws ApiException {
        WebhookIn webhookIn = null;
        WebhookOut response = api.v1WebhookCreate(webhookIn);

        // TODO: test validations
    }
    
    /**
     * Delete webhook
     *
     * delete the specified webhook.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WebhookDeleteTest() throws ApiException {
        String webhookId = null;
        WebhookOut response = api.v1WebhookDelete(webhookId);

        // TODO: test validations
    }
    
    /**
     * List webhooks
     *
     * retrieve the specified webhook.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WebhookRetrieveTest() throws ApiException {
        String webhookId = null;
        WebhookOut response = api.v1WebhookRetrieve(webhookId);

        // TODO: test validations
    }
    
    /**
     * update webhook
     *
     * update a specified webhook.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1WebhookUpdateTest() throws ApiException {
        String webhookId = null;
        WebhookOut response = api.v1WebhookUpdate(webhookId);

        // TODO: test validations
    }
    
}
