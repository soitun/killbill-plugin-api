/*
 * Copyright 2022 Equinix, Inc
 * Copyright 2022 The Billing Project, LLC
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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TagMetadata {

	private String tagDefinitionName;

	public TagMetadata() {}

	@JsonCreator
	public TagMetadata(@JsonProperty("tagDefinitionName") final String tagDefinitionName) {
		this.tagDefinitionName = tagDefinitionName;
	}

	public String getTagDefinitionName() {
		return tagDefinitionName;
	}

}
