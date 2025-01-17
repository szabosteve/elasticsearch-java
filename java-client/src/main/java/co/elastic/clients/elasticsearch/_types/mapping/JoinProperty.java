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

package co.elastic.clients.elasticsearch._types.mapping;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.JoinProperty
@JsonpDeserializable
public final class JoinProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final Map<String, List<String>> relations;

	// ---------------------------------------------------------------------------------------------

	public JoinProperty(Builder builder) {
		super(builder);

		this.relations = ModelTypeHelper.unmodifiable(builder.relations);

	}

	public JoinProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "join";
	}

	/**
	 * API name: {@code relations}
	 */
	@Nullable
	public Map<String, List<String>> relations() {
		return this.relations;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "join");
		super.serializeInternal(generator, mapper);
		if (this.relations != null) {

			generator.writeKey("relations");
			generator.writeStartObject();
			for (Map.Entry<String, List<String>> item0 : this.relations.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				for (String item1 : item0.getValue()) {
					generator.write(item1);

				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JoinProperty}.
	 */
	public static class Builder extends PropertyBase.AbstractBuilder<Builder> implements ObjectBuilder<JoinProperty> {
		@Nullable
		private Map<String, List<String>> relations;

		/**
		 * API name: {@code relations}
		 */
		public Builder relations(@Nullable Map<String, List<String>> value) {
			this.relations = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #relations(Map)}, creating the map if needed.
		 */
		public Builder putRelations(String key, List<String> value) {
			if (this.relations == null) {
				this.relations = new HashMap<>();
			}
			this.relations.put(key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JoinProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JoinProperty build() {

			return new JoinProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JoinProperty}
	 */
	public static final JsonpDeserializer<JoinProperty> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JoinProperty::setupJoinPropertyDeserializer, Builder::build);

	protected static void setupJoinPropertyDeserializer(DelegatingDeserializer<JoinProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::relations, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "relations");

		op.ignore("type");
	}

}
