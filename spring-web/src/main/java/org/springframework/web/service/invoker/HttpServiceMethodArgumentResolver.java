/*
 * Copyright 2002-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.web.service.invoker;

import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable;
import org.springframework.web.service.annotation.HttpRequest;


/**
 * Resolve an argument from an {@link HttpRequest @HttpRequest} annotated method
 * to one or more HTTP request values.
 *
 * @author Rossen Stoyanchev
 * @since 6.0
 */
public interface HttpServiceMethodArgumentResolver {

	/**
	 * Resolve the argument value.
	 * @param argument the argument value
	 * @param parameter the method parameter for the argument
	 * @param requestDefinition container to add HTTP request values to
	 */
	void resolve(@Nullable Object argument, MethodParameter parameter, HttpRequestDefinition requestDefinition);

}
