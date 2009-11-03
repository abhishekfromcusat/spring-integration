/*
 * Copyright 2002-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.config.xml;

import org.springframework.integration.core.MessageHeaders;
import org.springframework.integration.core.MessagePriority;

/**
 * Parser for the &lt;header-enricher&gt; element within the core integration
 * namespace. This is used for setting the <em>standard</em>, out-of-the-box
 * configurable {@link MessageHeaders}, such as 'reply-channel', 'priority',
 * and 'correlation-id'. It will also accept custom header values (or bean
 * references) if provided as 'header' sub-elements.
 * 
 * @author Mark Fisher
 */
public class StandardHeaderEnricherParser extends HeaderEnricherParserSupport {

	public StandardHeaderEnricherParser() {
		this.addElementToHeaderMapping("reply-channel", MessageHeaders.REPLY_CHANNEL);
		this.addElementToHeaderMapping("error-channel", MessageHeaders.ERROR_CHANNEL);
		this.addElementToHeaderMapping("correlation-id", MessageHeaders.CORRELATION_ID);
		this.addElementToHeaderMapping("expiration-date", MessageHeaders.EXPIRATION_DATE, Long.class);
		this.addElementToHeaderMapping("priority", MessageHeaders.PRIORITY, MessagePriority.class);
	}

}
