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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.ExecutionState
@JsonpDeserializable
public final class ExecutionState implements JsonpSerializable {
	private final boolean successful;

	private final String timestamp;

	// ---------------------------------------------------------------------------------------------

	public ExecutionState(Builder builder) {

		this.successful = Objects.requireNonNull(builder.successful, "successful");
		this.timestamp = Objects.requireNonNull(builder.timestamp, "timestamp");

	}

	public ExecutionState(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code successful}
	 */
	public boolean successful() {
		return this.successful;
	}

	/**
	 * API name: {@code timestamp}
	 */
	public String timestamp() {
		return this.timestamp;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("successful");
		generator.write(this.successful);

		generator.writeKey("timestamp");
		generator.write(this.timestamp);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExecutionState}.
	 */
	public static class Builder implements ObjectBuilder<ExecutionState> {
		private Boolean successful;

		private String timestamp;

		/**
		 * API name: {@code successful}
		 */
		public Builder successful(boolean value) {
			this.successful = value;
			return this;
		}

		/**
		 * API name: {@code timestamp}
		 */
		public Builder timestamp(String value) {
			this.timestamp = value;
			return this;
		}

		/**
		 * Builds a {@link ExecutionState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExecutionState build() {

			return new ExecutionState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExecutionState}
	 */
	public static final JsonpDeserializer<ExecutionState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExecutionState::setupExecutionStateDeserializer, Builder::build);

	protected static void setupExecutionStateDeserializer(DelegatingDeserializer<ExecutionState.Builder> op) {

		op.add(Builder::successful, JsonpDeserializer.booleanDeserializer(), "successful");
		op.add(Builder::timestamp, JsonpDeserializer.stringDeserializer(), "timestamp");

	}

}
