/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.MainError
@JsonpDeserializable
public final class MainError extends ErrorCause {
	@Nullable
	private final Map<String, String> headers;

	// ---------------------------------------------------------------------------------------------

	public MainError(Builder builder) {
		super(builder);

		this.headers = ModelTypeHelper.unmodifiable(builder.headers);

	}

	public MainError(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code headers}
	 */
	@Nullable
	public Map<String, String> headers() {
		return this.headers;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.headers != null) {

			generator.writeKey("headers");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.headers.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MainError}.
	 */
	public static class Builder extends ErrorCause.AbstractBuilder<Builder> implements ObjectBuilder<MainError> {
		@Nullable
		private Map<String, String> headers;

		/**
		 * API name: {@code headers}
		 */
		public Builder headers(@Nullable Map<String, String> value) {
			this.headers = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #headers(Map)}, creating the map if needed.
		 */
		public Builder putHeaders(String key, String value) {
			if (this.headers == null) {
				this.headers = new HashMap<>();
			}
			this.headers.put(key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MainError}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MainError build() {

			return new MainError(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MainError}
	 */
	public static final JsonpDeserializer<MainError> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MainError::setupMainErrorDeserializer, Builder::build);

	protected static void setupMainErrorDeserializer(DelegatingDeserializer<MainError.Builder> op) {
		ErrorCause.setupErrorCauseDeserializer(op);
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()),
				"headers");

	}

}
