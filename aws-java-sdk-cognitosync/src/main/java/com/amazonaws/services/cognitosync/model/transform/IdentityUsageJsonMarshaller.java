/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitosync.model.*;

import com.amazonaws.protocol.json.*;

/**
 * IdentityUsageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityUsageJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(IdentityUsage identityUsage, StructuredJsonGenerator jsonGenerator) {

        if (identityUsage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (identityUsage.getIdentityId() != null) {
                jsonGenerator.writeFieldName("IdentityId").writeValue(identityUsage.getIdentityId());
            }
            if (identityUsage.getIdentityPoolId() != null) {
                jsonGenerator.writeFieldName("IdentityPoolId").writeValue(identityUsage.getIdentityPoolId());
            }
            if (identityUsage.getLastModifiedDate() != null) {
                jsonGenerator.writeFieldName("LastModifiedDate").writeValue(identityUsage.getLastModifiedDate());
            }
            if (identityUsage.getDatasetCount() != null) {
                jsonGenerator.writeFieldName("DatasetCount").writeValue(identityUsage.getDatasetCount());
            }
            if (identityUsage.getDataStorage() != null) {
                jsonGenerator.writeFieldName("DataStorage").writeValue(identityUsage.getDataStorage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IdentityUsageJsonMarshaller instance;

    public static IdentityUsageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IdentityUsageJsonMarshaller();
        return instance;
    }

}
