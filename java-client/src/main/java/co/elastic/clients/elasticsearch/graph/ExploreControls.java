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

package co.elastic.clients.elasticsearch.graph;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: graph._types.ExploreControls
@JsonpDeserializable
public final class ExploreControls implements JsonpSerializable {
	@Nullable
	private final SampleDiversity sampleDiversity;

	@Nullable
	private final Integer sampleSize;

	@Nullable
	private final String timeout;

	private final boolean useSignificance;

	// ---------------------------------------------------------------------------------------------

	public ExploreControls(Builder builder) {

		this.sampleDiversity = builder.sampleDiversity;
		this.sampleSize = builder.sampleSize;
		this.timeout = builder.timeout;
		this.useSignificance = Objects.requireNonNull(builder.useSignificance, "use_significance");

	}

	public ExploreControls(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code sample_diversity}
	 */
	@Nullable
	public SampleDiversity sampleDiversity() {
		return this.sampleDiversity;
	}

	/**
	 * API name: {@code sample_size}
	 */
	@Nullable
	public Integer sampleSize() {
		return this.sampleSize;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code use_significance}
	 */
	public boolean useSignificance() {
		return this.useSignificance;
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

		if (this.sampleDiversity != null) {

			generator.writeKey("sample_diversity");
			this.sampleDiversity.serialize(generator, mapper);

		}
		if (this.sampleSize != null) {

			generator.writeKey("sample_size");
			generator.write(this.sampleSize);

		}
		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}

		generator.writeKey("use_significance");
		generator.write(this.useSignificance);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExploreControls}.
	 */
	public static class Builder implements ObjectBuilder<ExploreControls> {
		@Nullable
		private SampleDiversity sampleDiversity;

		@Nullable
		private Integer sampleSize;

		@Nullable
		private String timeout;

		private Boolean useSignificance;

		/**
		 * API name: {@code sample_diversity}
		 */
		public Builder sampleDiversity(@Nullable SampleDiversity value) {
			this.sampleDiversity = value;
			return this;
		}

		/**
		 * API name: {@code sample_diversity}
		 */
		public Builder sampleDiversity(Function<SampleDiversity.Builder, ObjectBuilder<SampleDiversity>> fn) {
			return this.sampleDiversity(fn.apply(new SampleDiversity.Builder()).build());
		}

		/**
		 * API name: {@code sample_size}
		 */
		public Builder sampleSize(@Nullable Integer value) {
			this.sampleSize = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code use_significance}
		 */
		public Builder useSignificance(boolean value) {
			this.useSignificance = value;
			return this;
		}

		/**
		 * Builds a {@link ExploreControls}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExploreControls build() {

			return new ExploreControls(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExploreControls}
	 */
	public static final JsonpDeserializer<ExploreControls> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ExploreControls::setupExploreControlsDeserializer, Builder::build);

	protected static void setupExploreControlsDeserializer(DelegatingDeserializer<ExploreControls.Builder> op) {

		op.add(Builder::sampleDiversity, SampleDiversity._DESERIALIZER, "sample_diversity");
		op.add(Builder::sampleSize, JsonpDeserializer.integerDeserializer(), "sample_size");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");
		op.add(Builder::useSignificance, JsonpDeserializer.booleanDeserializer(), "use_significance");

	}

}
