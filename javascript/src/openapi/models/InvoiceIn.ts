/**
 * Pay API Documentations
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { AnyType } from './AnyType';
import { HttpFile } from '../http/http';

export class InvoiceIn {
    /**
    * Optional unique identifier for the invoice
    */
    'uid'?: string;
    /**
    * Optional user id
    */
    'userId'?: string;
    /**
    * Invoice channel
    */
    'channel': string;
    /**
    * Currency code
    */
    'currency': string;
    /**
    * Big decimal string representation. Note that the max precision (number of digits after decimal point) depends on the currencyCode. E.g. for all fiat currencies is 2 (0.01), for BTC is 8, for USDT is 6. There's also min invoice amount for creating an invoice. It's 0.000001 BTC / 0.01 USDT / 0.01 USD / 0.01 EUR / 0.1 RUB.
    */
    'amount': string;
    /**
    * Optional metadata
    */
    'metadata'?: { [key: string]: AnyType; };
    /**
    * Optional metadata
    */
    'extra'?: { [key: string]: AnyType; };
    /**
    * Optional order note
    */
    'note'?: string;
    /**
    * The expiration seconds
    */
    'expiration'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "uid",
            "baseName": "uid",
            "type": "string",
            "format": ""
        },
        {
            "name": "userId",
            "baseName": "userId",
            "type": "string",
            "format": ""
        },
        {
            "name": "channel",
            "baseName": "channel",
            "type": "string",
            "format": ""
        },
        {
            "name": "currency",
            "baseName": "currency",
            "type": "string",
            "format": ""
        },
        {
            "name": "amount",
            "baseName": "amount",
            "type": "string",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "{ [key: string]: AnyType; }",
            "format": ""
        },
        {
            "name": "extra",
            "baseName": "extra",
            "type": "{ [key: string]: AnyType; }",
            "format": ""
        },
        {
            "name": "note",
            "baseName": "note",
            "type": "string",
            "format": ""
        },
        {
            "name": "expiration",
            "baseName": "expiration",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return InvoiceIn.attributeTypeMap;
    }
    
    public constructor() {
    }
}
