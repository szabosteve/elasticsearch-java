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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

// typedef: ml._types.DataframeAnalyticsStatsDataCounts
@JsonpDeserializable
public final class DataframeAnalyticsStatsDataCounts implements JsonpSerializable {
	private final int skippedDocsCount;

	private final int testDocsCount;

	private final int trainingDocsCount;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalyticsStatsDataCounts(Builder builder) {

		this.skippedDocsCount = Objects.requireNonNull(builder.skippedDocsCount, "skipped_docs_count");
		this.testDocsCount = Objects.requireNonNull(builder.testDocsCount, "test_docs_count");
		this.trainingDocsCount = Objects.requireNonNull(builder.trainingDocsCount, "training_docs_count");

	}

	public DataframeAnalyticsStatsDataCounts(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The number of documents that are skipped during the analysis because they
	 * contained values that are not supported by the analysis. For example, outlier
	 * detection does not support missing fields so it skips documents with missing
	 * fields. Likewise, all types of analysis skip documents that contain arrays
	 * with more than one element.
	 * <p>
	 * API name: {@code skipped_docs_count}
	 */
	public int skippedDocsCount() {
		return this.skippedDocsCount;
	}

	/**
	 * The number of documents that are not used for training the model and can be
	 * used for testing.
	 * <p>
	 * API name: {@code test_docs_count}
	 */
	public int testDocsCount() {
		return this.testDocsCount;
	}

	/**
	 * The number of documents that are used for training the model.
	 * <p>
	 * API name: {@code training_docs_count}
	 */
	public int trainingDocsCount() {
		return this.trainingDocsCount;
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

		generator.writeKey("skipped_docs_count");
		generator.write(this.skippedDocsCount);

		generator.writeKey("test_docs_count");
		generator.write(this.testDocsCount);

		generator.writeKey("training_docs_count");
		generator.write(this.trainingDocsCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalyticsStatsDataCounts}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalyticsStatsDataCounts> {
		private Integer skippedDocsCount;

		private Integer testDocsCount;

		private Integer trainingDocsCount;

		/**
		 * The number of documents that are skipped during the analysis because they
		 * contained values that are not supported by the analysis. For example, outlier
		 * detection does not support missing fields so it skips documents with missing
		 * fields. Likewise, all types of analysis skip documents that contain arrays
		 * with more than one element.
		 * <p>
		 * API name: {@code skipped_docs_count}
		 */
		public Builder skippedDocsCount(int value) {
			this.skippedDocsCount = value;
			return this;
		}

		/**
		 * The number of documents that are not used for training the model and can be
		 * used for testing.
		 * <p>
		 * API name: {@code test_docs_count}
		 */
		public Builder testDocsCount(int value) {
			this.testDocsCount = value;
			return this;
		}

		/**
		 * The number of documents that are used for training the model.
		 * <p>
		 * API name: {@code training_docs_count}
		 */
		public Builder trainingDocsCount(int value) {
			this.trainingDocsCount = value;
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalyticsStatsDataCounts}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalyticsStatsDataCounts build() {

			return new DataframeAnalyticsStatsDataCounts(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalyticsStatsDataCounts}
	 */
	public static final JsonpDeserializer<DataframeAnalyticsStatsDataCounts> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalyticsStatsDataCounts::setupDataframeAnalyticsStatsDataCountsDeserializer,
					Builder::build);

	protected static void setupDataframeAnalyticsStatsDataCountsDeserializer(
			DelegatingDeserializer<DataframeAnalyticsStatsDataCounts.Builder> op) {

		op.add(Builder::skippedDocsCount, JsonpDeserializer.integerDeserializer(), "skipped_docs_count");
		op.add(Builder::testDocsCount, JsonpDeserializer.integerDeserializer(), "test_docs_count");
		op.add(Builder::trainingDocsCount, JsonpDeserializer.integerDeserializer(), "training_docs_count");

	}

}
