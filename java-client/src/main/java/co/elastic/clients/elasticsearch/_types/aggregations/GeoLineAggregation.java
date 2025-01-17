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

import co.elastic.clients.elasticsearch._core.search.SortOrder;
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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.GeoLineAggregation
@JsonpDeserializable
public final class GeoLineAggregation implements AggregationVariant, JsonpSerializable {
	private final GeoLinePoint point;

	private final GeoLineSort sort;

	@Nullable
	private final Boolean includeSort;

	@Nullable
	private final SortOrder sortOrder;

	@Nullable
	private final Integer size;

	// ---------------------------------------------------------------------------------------------

	public GeoLineAggregation(Builder builder) {

		this.point = Objects.requireNonNull(builder.point, "point");
		this.sort = Objects.requireNonNull(builder.sort, "sort");
		this.includeSort = builder.includeSort;
		this.sortOrder = builder.sortOrder;
		this.size = builder.size;

	}

	public GeoLineAggregation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "geo_line";
	}

	/**
	 * API name: {@code point}
	 */
	public GeoLinePoint point() {
		return this.point;
	}

	/**
	 * API name: {@code sort}
	 */
	public GeoLineSort sort() {
		return this.sort;
	}

	/**
	 * API name: {@code include_sort}
	 */
	@Nullable
	public Boolean includeSort() {
		return this.includeSort;
	}

	/**
	 * API name: {@code sort_order}
	 */
	@Nullable
	public SortOrder sortOrder() {
		return this.sortOrder;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
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

		generator.writeKey("point");
		this.point.serialize(generator, mapper);

		generator.writeKey("sort");
		this.sort.serialize(generator, mapper);

		if (this.includeSort != null) {

			generator.writeKey("include_sort");
			generator.write(this.includeSort);

		}
		if (this.sortOrder != null) {

			generator.writeKey("sort_order");
			this.sortOrder.serialize(generator, mapper);
		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoLineAggregation}.
	 */
	public static class Builder implements ObjectBuilder<GeoLineAggregation> {
		private GeoLinePoint point;

		private GeoLineSort sort;

		@Nullable
		private Boolean includeSort;

		@Nullable
		private SortOrder sortOrder;

		@Nullable
		private Integer size;

		/**
		 * API name: {@code point}
		 */
		public Builder point(GeoLinePoint value) {
			this.point = value;
			return this;
		}

		/**
		 * API name: {@code point}
		 */
		public Builder point(Function<GeoLinePoint.Builder, ObjectBuilder<GeoLinePoint>> fn) {
			return this.point(fn.apply(new GeoLinePoint.Builder()).build());
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(GeoLineSort value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(Function<GeoLineSort.Builder, ObjectBuilder<GeoLineSort>> fn) {
			return this.sort(fn.apply(new GeoLineSort.Builder()).build());
		}

		/**
		 * API name: {@code include_sort}
		 */
		public Builder includeSort(@Nullable Boolean value) {
			this.includeSort = value;
			return this;
		}

		/**
		 * API name: {@code sort_order}
		 */
		public Builder sortOrder(@Nullable SortOrder value) {
			this.sortOrder = value;
			return this;
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * Builds a {@link GeoLineAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoLineAggregation build() {

			return new GeoLineAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoLineAggregation}
	 */
	public static final JsonpDeserializer<GeoLineAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GeoLineAggregation::setupGeoLineAggregationDeserializer, Builder::build);

	protected static void setupGeoLineAggregationDeserializer(DelegatingDeserializer<GeoLineAggregation.Builder> op) {

		op.add(Builder::point, GeoLinePoint._DESERIALIZER, "point");
		op.add(Builder::sort, GeoLineSort._DESERIALIZER, "sort");
		op.add(Builder::includeSort, JsonpDeserializer.booleanDeserializer(), "include_sort");
		op.add(Builder::sortOrder, SortOrder._DESERIALIZER, "sort_order");
		op.add(Builder::size, JsonpDeserializer.integerDeserializer(), "size");

	}

}
