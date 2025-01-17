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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.PartitionScore
@JsonpDeserializable
public final class PartitionScore implements JsonpSerializable {
	private final double initialRecordScore;

	private final String partitionFieldName;

	private final String partitionFieldValue;

	private final double probability;

	private final double recordScore;

	// ---------------------------------------------------------------------------------------------

	public PartitionScore(Builder builder) {

		this.initialRecordScore = Objects.requireNonNull(builder.initialRecordScore, "initial_record_score");
		this.partitionFieldName = Objects.requireNonNull(builder.partitionFieldName, "partition_field_name");
		this.partitionFieldValue = Objects.requireNonNull(builder.partitionFieldValue, "partition_field_value");
		this.probability = Objects.requireNonNull(builder.probability, "probability");
		this.recordScore = Objects.requireNonNull(builder.recordScore, "record_score");

	}

	public PartitionScore(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code initial_record_score}
	 */
	public double initialRecordScore() {
		return this.initialRecordScore;
	}

	/**
	 * API name: {@code partition_field_name}
	 */
	public String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * API name: {@code partition_field_value}
	 */
	public String partitionFieldValue() {
		return this.partitionFieldValue;
	}

	/**
	 * API name: {@code probability}
	 */
	public double probability() {
		return this.probability;
	}

	/**
	 * API name: {@code record_score}
	 */
	public double recordScore() {
		return this.recordScore;
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

		generator.writeKey("initial_record_score");
		generator.write(this.initialRecordScore);

		generator.writeKey("partition_field_name");
		generator.write(this.partitionFieldName);

		generator.writeKey("partition_field_value");
		generator.write(this.partitionFieldValue);

		generator.writeKey("probability");
		generator.write(this.probability);

		generator.writeKey("record_score");
		generator.write(this.recordScore);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PartitionScore}.
	 */
	public static class Builder implements ObjectBuilder<PartitionScore> {
		private Double initialRecordScore;

		private String partitionFieldName;

		private String partitionFieldValue;

		private Double probability;

		private Double recordScore;

		/**
		 * API name: {@code initial_record_score}
		 */
		public Builder initialRecordScore(double value) {
			this.initialRecordScore = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_name}
		 */
		public Builder partitionFieldName(String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * API name: {@code partition_field_value}
		 */
		public Builder partitionFieldValue(String value) {
			this.partitionFieldValue = value;
			return this;
		}

		/**
		 * API name: {@code probability}
		 */
		public Builder probability(double value) {
			this.probability = value;
			return this;
		}

		/**
		 * API name: {@code record_score}
		 */
		public Builder recordScore(double value) {
			this.recordScore = value;
			return this;
		}

		/**
		 * Builds a {@link PartitionScore}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PartitionScore build() {

			return new PartitionScore(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PartitionScore}
	 */
	public static final JsonpDeserializer<PartitionScore> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PartitionScore::setupPartitionScoreDeserializer, Builder::build);

	protected static void setupPartitionScoreDeserializer(DelegatingDeserializer<PartitionScore.Builder> op) {

		op.add(Builder::initialRecordScore, JsonpDeserializer.doubleDeserializer(), "initial_record_score");
		op.add(Builder::partitionFieldName, JsonpDeserializer.stringDeserializer(), "partition_field_name");
		op.add(Builder::partitionFieldValue, JsonpDeserializer.stringDeserializer(), "partition_field_value");
		op.add(Builder::probability, JsonpDeserializer.doubleDeserializer(), "probability");
		op.add(Builder::recordScore, JsonpDeserializer.doubleDeserializer(), "record_score");

	}

}
