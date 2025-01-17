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

package co.elastic.clients.elasticsearch.nodes.info;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes.info.NodeInfoHttp
@JsonpDeserializable
public final class NodeInfoHttp implements JsonpSerializable {
	private final List<String> boundAddress;

	@Nullable
	private final String maxContentLength;

	private final long maxContentLengthInBytes;

	private final String publishAddress;

	// ---------------------------------------------------------------------------------------------

	public NodeInfoHttp(Builder builder) {

		this.boundAddress = ModelTypeHelper.unmodifiableNonNull(builder.boundAddress, "bound_address");
		this.maxContentLength = builder.maxContentLength;
		this.maxContentLengthInBytes = Objects.requireNonNull(builder.maxContentLengthInBytes,
				"max_content_length_in_bytes");
		this.publishAddress = Objects.requireNonNull(builder.publishAddress, "publish_address");

	}

	public NodeInfoHttp(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code bound_address}
	 */
	public List<String> boundAddress() {
		return this.boundAddress;
	}

	/**
	 * API name: {@code max_content_length}
	 */
	@Nullable
	public String maxContentLength() {
		return this.maxContentLength;
	}

	/**
	 * API name: {@code max_content_length_in_bytes}
	 */
	public long maxContentLengthInBytes() {
		return this.maxContentLengthInBytes;
	}

	/**
	 * API name: {@code publish_address}
	 */
	public String publishAddress() {
		return this.publishAddress;
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

		generator.writeKey("bound_address");
		generator.writeStartArray();
		for (String item0 : this.boundAddress) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.maxContentLength != null) {

			generator.writeKey("max_content_length");
			generator.write(this.maxContentLength);

		}

		generator.writeKey("max_content_length_in_bytes");
		generator.write(this.maxContentLengthInBytes);

		generator.writeKey("publish_address");
		generator.write(this.publishAddress);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeInfoHttp}.
	 */
	public static class Builder implements ObjectBuilder<NodeInfoHttp> {
		private List<String> boundAddress;

		@Nullable
		private String maxContentLength;

		private Long maxContentLengthInBytes;

		private String publishAddress;

		/**
		 * API name: {@code bound_address}
		 */
		public Builder boundAddress(List<String> value) {
			this.boundAddress = value;
			return this;
		}

		/**
		 * API name: {@code bound_address}
		 */
		public Builder boundAddress(String... value) {
			this.boundAddress = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #boundAddress(List)}, creating the list if needed. 4
		 */
		public Builder addBoundAddress(String value) {
			if (this.boundAddress == null) {
				this.boundAddress = new ArrayList<>();
			}
			this.boundAddress.add(value);
			return this;
		}

		/**
		 * API name: {@code max_content_length}
		 */
		public Builder maxContentLength(@Nullable String value) {
			this.maxContentLength = value;
			return this;
		}

		/**
		 * API name: {@code max_content_length_in_bytes}
		 */
		public Builder maxContentLengthInBytes(long value) {
			this.maxContentLengthInBytes = value;
			return this;
		}

		/**
		 * API name: {@code publish_address}
		 */
		public Builder publishAddress(String value) {
			this.publishAddress = value;
			return this;
		}

		/**
		 * Builds a {@link NodeInfoHttp}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeInfoHttp build() {

			return new NodeInfoHttp(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeInfoHttp}
	 */
	public static final JsonpDeserializer<NodeInfoHttp> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeInfoHttp::setupNodeInfoHttpDeserializer, Builder::build);

	protected static void setupNodeInfoHttpDeserializer(DelegatingDeserializer<NodeInfoHttp.Builder> op) {

		op.add(Builder::boundAddress, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"bound_address");
		op.add(Builder::maxContentLength, JsonpDeserializer.stringDeserializer(), "max_content_length");
		op.add(Builder::maxContentLengthInBytes, JsonpDeserializer.longDeserializer(), "max_content_length_in_bytes");
		op.add(Builder::publishAddress, JsonpDeserializer.stringDeserializer(), "publish_address");

	}

}
