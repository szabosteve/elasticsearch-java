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

package co.elastic.clients.elasticsearch._types.aggregations;

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
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.ChiSquareHeuristic
@JsonpDeserializable
public final class ChiSquareHeuristic implements JsonpSerializable {
	private final boolean backgroundIsSuperset;

	private final boolean includeNegatives;

	// ---------------------------------------------------------------------------------------------

	public ChiSquareHeuristic(Builder builder) {

		this.backgroundIsSuperset = Objects.requireNonNull(builder.backgroundIsSuperset, "background_is_superset");
		this.includeNegatives = Objects.requireNonNull(builder.includeNegatives, "include_negatives");

	}

	public ChiSquareHeuristic(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code background_is_superset}
	 */
	public boolean backgroundIsSuperset() {
		return this.backgroundIsSuperset;
	}

	/**
	 * API name: {@code include_negatives}
	 */
	public boolean includeNegatives() {
		return this.includeNegatives;
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

		generator.writeKey("background_is_superset");
		generator.write(this.backgroundIsSuperset);

		generator.writeKey("include_negatives");
		generator.write(this.includeNegatives);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ChiSquareHeuristic}.
	 */
	public static class Builder implements ObjectBuilder<ChiSquareHeuristic> {
		private Boolean backgroundIsSuperset;

		private Boolean includeNegatives;

		/**
		 * API name: {@code background_is_superset}
		 */
		public Builder backgroundIsSuperset(boolean value) {
			this.backgroundIsSuperset = value;
			return this;
		}

		/**
		 * API name: {@code include_negatives}
		 */
		public Builder includeNegatives(boolean value) {
			this.includeNegatives = value;
			return this;
		}

		/**
		 * Builds a {@link ChiSquareHeuristic}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ChiSquareHeuristic build() {

			return new ChiSquareHeuristic(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ChiSquareHeuristic}
	 */
	public static final JsonpDeserializer<ChiSquareHeuristic> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ChiSquareHeuristic::setupChiSquareHeuristicDeserializer, Builder::build);

	protected static void setupChiSquareHeuristicDeserializer(DelegatingDeserializer<ChiSquareHeuristic.Builder> op) {

		op.add(Builder::backgroundIsSuperset, JsonpDeserializer.booleanDeserializer(), "background_is_superset");
		op.add(Builder::includeNegatives, JsonpDeserializer.booleanDeserializer(), "include_negatives");

	}

}
