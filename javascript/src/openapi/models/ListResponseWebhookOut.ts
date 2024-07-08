/**
 * Wallet Pay API Documentations
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { WebhookOut } from './WebhookOut';
import { HttpFile } from '../http/http';

export class ListResponseWebhookOut {
    'data': Array<WebhookOut>;
    'total'?: number;
    'hasNext'?: boolean;
    'hasPrev'?: boolean;
    'preCursor'?: string;
    'nextCursor'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<WebhookOut>",
            "format": ""
        },
        {
            "name": "total",
            "baseName": "total",
            "type": "number",
            "format": ""
        },
        {
            "name": "hasNext",
            "baseName": "hasNext",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "hasPrev",
            "baseName": "hasPrev",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "preCursor",
            "baseName": "preCursor",
            "type": "string",
            "format": ""
        },
        {
            "name": "nextCursor",
            "baseName": "nextCursor",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ListResponseWebhookOut.attributeTypeMap;
    }
    
    public constructor() {
    }
}

