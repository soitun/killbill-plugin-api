/*
 * Copyright 2010-2013 Ning, Inc.
 * Copyright 2016 Groupon, Inc
 * Copyright 2016 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.notification.plugin.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubscriptionMetadata {

    public enum ActionType {
        EFFECTIVE,
        REQUESTED
    };

    private ActionType actionType;
    private String bundleExternalKey;
    private boolean subscriptionChangeUndo;

    /**
     * This is needed for object deserialization.
     */
    public SubscriptionMetadata() {}

    public SubscriptionMetadata(@JsonProperty("actionType") final ActionType actionType,
                                @JsonProperty("bundleExternalKey") final String bundleExternalKey,
                                @JsonProperty("subscriptionChangeUndo") final boolean subscriptionChangeUndo) {
        this.actionType = actionType;
        this.bundleExternalKey = bundleExternalKey;
        this.subscriptionChangeUndo = subscriptionChangeUndo;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public String getBundleExternalKey() {
        return bundleExternalKey;
    }

    public boolean getSubscriptionChangeUndo() {
        return subscriptionChangeUndo;
    }
}
