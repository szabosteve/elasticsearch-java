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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ComponentTemplateNode
@JsonpDeserializable
public final class ComponentTemplateNode implements JsonpSerializable {
	private final ComponentTemplateSummary template;

	@Nullable
	private final Long version;

	@Nullable
	private final Map<String, JsonData> meta;

	// ---------------------------------------------------------------------------------------------

	public ComponentTemplateNode(Builder builder) {

		this.template = Objects.requireNonNull(builder.template, "template");
		this.version = builder.version;
		this.meta = ModelTypeHelper.unmodifiable(builder.meta);

	}

	public ComponentTemplateNode(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code template}
	 */
	public ComponentTemplateSummary template() {
		return this.template;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public Long version() {
		return this.version;
	}

	/**
	 * API name: {@code _meta}
	 */
	@Nullable
	public Map<String, JsonData> meta() {
		return this.meta;
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

		generator.writeKey("template");
		this.template.serialize(generator, mapper);

		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.meta != null) {

			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ComponentTemplateNode}.
	 */
	public static class Builder implements ObjectBuilder<ComponentTemplateNode> {
		private ComponentTemplateSummary template;

		@Nullable
		private Long version;

		@Nullable
		private Map<String, JsonData> meta;

		/**
		 * API name: {@code template}
		 */
		public Builder template(ComponentTemplateSummary value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(
				Function<ComponentTemplateSummary.Builder, ObjectBuilder<ComponentTemplateSummary>> fn) {
			return this.template(fn.apply(new ComponentTemplateSummary.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code _meta}
		 */
		public Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #meta(Map)}, creating the map if needed.
		 */
		public Builder putMeta(String key, JsonData value) {
			if (this.meta == null) {
				this.meta = new HashMap<>();
			}
			this.meta.put(key, value);
			return this;
		}

		/**
		 * Builds a {@link ComponentTemplateNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ComponentTemplateNode build() {

			return new ComponentTemplateNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ComponentTemplateNode}
	 */
	public static final JsonpDeserializer<ComponentTemplateNode> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ComponentTemplateNode::setupComponentTemplateNodeDeserializer, Builder::build);

	protected static void setupComponentTemplateNodeDeserializer(
			DelegatingDeserializer<ComponentTemplateNode.Builder> op) {

		op.add(Builder::template, ComponentTemplateSummary._DESERIALIZER, "template");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");

	}

}
