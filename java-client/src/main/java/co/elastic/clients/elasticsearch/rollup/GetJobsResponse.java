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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.elasticsearch.rollup.get_jobs.RollupJob;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_jobs.Response
@JsonpDeserializable
public final class GetJobsResponse implements JsonpSerializable {
	private final List<RollupJob> jobs;

	// ---------------------------------------------------------------------------------------------

	public GetJobsResponse(Builder builder) {

		this.jobs = ModelTypeHelper.unmodifiableNonNull(builder.jobs, "jobs");

	}

	public GetJobsResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code jobs}
	 */
	public List<RollupJob> jobs() {
		return this.jobs;
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

		generator.writeKey("jobs");
		generator.writeStartArray();
		for (RollupJob item0 : this.jobs) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetJobsResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetJobsResponse> {
		private List<RollupJob> jobs;

		/**
		 * API name: {@code jobs}
		 */
		public Builder jobs(List<RollupJob> value) {
			this.jobs = value;
			return this;
		}

		/**
		 * API name: {@code jobs}
		 */
		public Builder jobs(RollupJob... value) {
			this.jobs = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #jobs(List)}, creating the list if needed. 4
		 */
		public Builder addJobs(RollupJob value) {
			if (this.jobs == null) {
				this.jobs = new ArrayList<>();
			}
			this.jobs.add(value);
			return this;
		}

		/**
		 * Set {@link #jobs(List)} to a singleton list.
		 */
		public Builder jobs(Function<RollupJob.Builder, ObjectBuilder<RollupJob>> fn) {
			return this.jobs(fn.apply(new RollupJob.Builder()).build());
		}

		/**
		 * Add a value to {@link #jobs(List)}, creating the list if needed. 5
		 */
		public Builder addJobs(Function<RollupJob.Builder, ObjectBuilder<RollupJob>> fn) {
			return this.addJobs(fn.apply(new RollupJob.Builder()).build());
		}

		/**
		 * Builds a {@link GetJobsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetJobsResponse build() {

			return new GetJobsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetJobsResponse}
	 */
	public static final JsonpDeserializer<GetJobsResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetJobsResponse::setupGetJobsResponseDeserializer, Builder::build);

	protected static void setupGetJobsResponseDeserializer(DelegatingDeserializer<GetJobsResponse.Builder> op) {

		op.add(Builder::jobs, JsonpDeserializer.arrayDeserializer(RollupJob._DESERIALIZER), "jobs");

	}

}
