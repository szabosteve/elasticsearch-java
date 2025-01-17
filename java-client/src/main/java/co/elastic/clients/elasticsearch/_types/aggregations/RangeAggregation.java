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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.RangeAggregation
@JsonpDeserializable
public final class RangeAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final String field;

	@Nullable
	private final List<AggregationRange> ranges;

	@Nullable
	private final JsonValue /* _types.Script */ script;

	@Nullable
	private final Boolean keyed;

	// ---------------------------------------------------------------------------------------------

	public RangeAggregation(Builder builder) {
		super(builder);

		this.field = builder.field;
		this.ranges = ModelTypeHelper.unmodifiable(builder.ranges);
		this.script = builder.script;
		this.keyed = builder.keyed;

	}

	public RangeAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "range";
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code ranges}
	 */
	@Nullable
	public List<AggregationRange> ranges() {
		return this.ranges;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
	 * API name: {@code keyed}
	 */
	@Nullable
	public Boolean keyed() {
		return this.keyed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.field != null) {

			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.ranges != null) {

			generator.writeKey("ranges");
			generator.writeStartArray();
			for (AggregationRange item0 : this.ranges) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.script != null) {

			generator.writeKey("script");
			generator.write(this.script);

		}
		if (this.keyed != null) {

			generator.writeKey("keyed");
			generator.write(this.keyed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RangeAggregation}.
	 */
	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RangeAggregation> {
		@Nullable
		private String field;

		@Nullable
		private List<AggregationRange> ranges;

		@Nullable
		private JsonValue /* _types.Script */ script;

		@Nullable
		private Boolean keyed;

		/**
		 * API name: {@code field}
		 */
		public Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public Builder ranges(@Nullable List<AggregationRange> value) {
			this.ranges = value;
			return this;
		}

		/**
		 * API name: {@code ranges}
		 */
		public Builder ranges(AggregationRange... value) {
			this.ranges = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #ranges(List)}, creating the list if needed. 4
		 */
		public Builder addRanges(AggregationRange value) {
			if (this.ranges == null) {
				this.ranges = new ArrayList<>();
			}
			this.ranges.add(value);
			return this;
		}

		/**
		 * Set {@link #ranges(List)} to a singleton list.
		 */
		public Builder ranges(Function<AggregationRange.Builder, ObjectBuilder<AggregationRange>> fn) {
			return this.ranges(fn.apply(new AggregationRange.Builder()).build());
		}

		/**
		 * Add a value to {@link #ranges(List)}, creating the list if needed. 5
		 */
		public Builder addRanges(Function<AggregationRange.Builder, ObjectBuilder<AggregationRange>> fn) {
			return this.addRanges(fn.apply(new AggregationRange.Builder()).build());
		}

		/**
		 * API name: {@code script}
		 */
		public Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code keyed}
		 */
		public Builder keyed(@Nullable Boolean value) {
			this.keyed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RangeAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RangeAggregation build() {

			return new RangeAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RangeAggregation}
	 */
	public static final JsonpDeserializer<RangeAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RangeAggregation::setupRangeAggregationDeserializer, Builder::build);

	protected static void setupRangeAggregationDeserializer(DelegatingDeserializer<RangeAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ranges, JsonpDeserializer.arrayDeserializer(AggregationRange._DESERIALIZER), "ranges");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::keyed, JsonpDeserializer.booleanDeserializer(), "keyed");

	}

}
