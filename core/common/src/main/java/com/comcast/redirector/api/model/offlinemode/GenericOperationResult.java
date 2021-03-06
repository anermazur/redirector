/**
 * Copyright 2017 Comcast Cable Communications Management, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author Alexey Mironchenko (amironchenko@productengine.com)
 */

package com.comcast.redirector.api.model.offlinemode;

import com.comcast.redirector.api.model.ErrorMessage;
import com.comcast.redirector.api.model.whitelisted.WhitelistedStackUpdates;

import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * A marker interface that tells us that an implemented class is a result of some web service operation
 * (either one or batch)
 */
@XmlSeeAlso({OperationResult.class, PendingChangesBatchOperationResult.class, WhitelistedStackUpdates.class})
public interface GenericOperationResult {

    void setErrorMessage(ErrorMessage validationResult);

}

