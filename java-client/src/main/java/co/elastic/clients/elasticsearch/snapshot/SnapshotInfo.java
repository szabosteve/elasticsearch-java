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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot._types.SnapshotInfo
@JsonpDeserializable
public final class SnapshotInfo implements JsonpSerializable {
	private final List<String> dataStreams;

	@Nullable
	private final String duration;

	@Nullable
	private final String durationInMillis;

	@Nullable
	private final String endTime;

	@Nullable
	private final String endTimeInMillis;

	@Nullable
	private final List<SnapshotShardFailure> failures;

	@Nullable
	private final Boolean includeGlobalState;

	private final List<String> indices;

	@Nullable
	private final Map<String, IndexDetails> indexDetails;

	@Nullable
	private final Map<String, JsonData> metadata;

	@Nullable
	private final String reason;

	@Nullable
	private final String repository;

	private final String snapshot;

	@Nullable
	private final ShardStatistics shards;

	@Nullable
	private final String startTime;

	@Nullable
	private final String startTimeInMillis;

	@Nullable
	private final String state;

	private final String uuid;

	@Nullable
	private final String version;

	@Nullable
	private final Long versionId;

	@Nullable
	private final List<InfoFeatureState> featureStates;

	// ---------------------------------------------------------------------------------------------

	public SnapshotInfo(Builder builder) {

		this.dataStreams = ModelTypeHelper.unmodifiableNonNull(builder.dataStreams, "data_streams");
		this.duration = builder.duration;
		this.durationInMillis = builder.durationInMillis;
		this.endTime = builder.endTime;
		this.endTimeInMillis = builder.endTimeInMillis;
		this.failures = ModelTypeHelper.unmodifiable(builder.failures);
		this.includeGlobalState = builder.includeGlobalState;
		this.indices = ModelTypeHelper.unmodifiableNonNull(builder.indices, "indices");
		this.indexDetails = ModelTypeHelper.unmodifiable(builder.indexDetails);
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.reason = builder.reason;
		this.repository = builder.repository;
		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");
		this.shards = builder.shards;
		this.startTime = builder.startTime;
		this.startTimeInMillis = builder.startTimeInMillis;
		this.state = builder.state;
		this.uuid = Objects.requireNonNull(builder.uuid, "uuid");
		this.version = builder.version;
		this.versionId = builder.versionId;
		this.featureStates = ModelTypeHelper.unmodifiable(builder.featureStates);

	}

	public SnapshotInfo(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code data_streams}
	 */
	public List<String> dataStreams() {
		return this.dataStreams;
	}

	/**
	 * API name: {@code duration}
	 */
	@Nullable
	public String duration() {
		return this.duration;
	}

	/**
	 * API name: {@code duration_in_millis}
	 */
	@Nullable
	public String durationInMillis() {
		return this.durationInMillis;
	}

	/**
	 * API name: {@code end_time}
	 */
	@Nullable
	public String endTime() {
		return this.endTime;
	}

	/**
	 * API name: {@code end_time_in_millis}
	 */
	@Nullable
	public String endTimeInMillis() {
		return this.endTimeInMillis;
	}

	/**
	 * API name: {@code failures}
	 */
	@Nullable
	public List<SnapshotShardFailure> failures() {
		return this.failures;
	}

	/**
	 * API name: {@code include_global_state}
	 */
	@Nullable
	public Boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * API name: {@code indices}
	 */
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code index_details}
	 */
	@Nullable
	public Map<String, IndexDetails> indexDetails() {
		return this.indexDetails;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code reason}
	 */
	@Nullable
	public String reason() {
		return this.reason;
	}

	/**
	 * API name: {@code repository}
	 */
	@Nullable
	public String repository() {
		return this.repository;
	}

	/**
	 * API name: {@code snapshot}
	 */
	public String snapshot() {
		return this.snapshot;
	}

	/**
	 * API name: {@code shards}
	 */
	@Nullable
	public ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code start_time}
	 */
	@Nullable
	public String startTime() {
		return this.startTime;
	}

	/**
	 * API name: {@code start_time_in_millis}
	 */
	@Nullable
	public String startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * API name: {@code state}
	 */
	@Nullable
	public String state() {
		return this.state;
	}

	/**
	 * API name: {@code uuid}
	 */
	public String uuid() {
		return this.uuid;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public String version() {
		return this.version;
	}

	/**
	 * API name: {@code version_id}
	 */
	@Nullable
	public Long versionId() {
		return this.versionId;
	}

	/**
	 * API name: {@code feature_states}
	 */
	@Nullable
	public List<InfoFeatureState> featureStates() {
		return this.featureStates;
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

		generator.writeKey("data_streams");
		generator.writeStartArray();
		for (String item0 : this.dataStreams) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.duration != null) {

			generator.writeKey("duration");
			generator.write(this.duration);

		}
		if (this.durationInMillis != null) {

			generator.writeKey("duration_in_millis");
			generator.write(this.durationInMillis);

		}
		if (this.endTime != null) {

			generator.writeKey("end_time");
			generator.write(this.endTime);

		}
		if (this.endTimeInMillis != null) {

			generator.writeKey("end_time_in_millis");
			generator.write(this.endTimeInMillis);

		}
		if (this.failures != null) {

			generator.writeKey("failures");
			generator.writeStartArray();
			for (SnapshotShardFailure item0 : this.failures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.includeGlobalState != null) {

			generator.writeKey("include_global_state");
			generator.write(this.includeGlobalState);

		}

		generator.writeKey("indices");
		generator.writeStartArray();
		for (String item0 : this.indices) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.indexDetails != null) {

			generator.writeKey("index_details");
			generator.writeStartObject();
			for (Map.Entry<String, IndexDetails> item0 : this.indexDetails.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.reason != null) {

			generator.writeKey("reason");
			generator.write(this.reason);

		}
		if (this.repository != null) {

			generator.writeKey("repository");
			generator.write(this.repository);

		}

		generator.writeKey("snapshot");
		generator.write(this.snapshot);

		if (this.shards != null) {

			generator.writeKey("shards");
			this.shards.serialize(generator, mapper);

		}
		if (this.startTime != null) {

			generator.writeKey("start_time");
			generator.write(this.startTime);

		}
		if (this.startTimeInMillis != null) {

			generator.writeKey("start_time_in_millis");
			generator.write(this.startTimeInMillis);

		}
		if (this.state != null) {

			generator.writeKey("state");
			generator.write(this.state);

		}

		generator.writeKey("uuid");
		generator.write(this.uuid);

		if (this.version != null) {

			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.versionId != null) {

			generator.writeKey("version_id");
			generator.write(this.versionId);

		}
		if (this.featureStates != null) {

			generator.writeKey("feature_states");
			generator.writeStartArray();
			for (InfoFeatureState item0 : this.featureStates) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotInfo}.
	 */
	public static class Builder implements ObjectBuilder<SnapshotInfo> {
		private List<String> dataStreams;

		@Nullable
		private String duration;

		@Nullable
		private String durationInMillis;

		@Nullable
		private String endTime;

		@Nullable
		private String endTimeInMillis;

		@Nullable
		private List<SnapshotShardFailure> failures;

		@Nullable
		private Boolean includeGlobalState;

		private List<String> indices;

		@Nullable
		private Map<String, IndexDetails> indexDetails;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private String reason;

		@Nullable
		private String repository;

		private String snapshot;

		@Nullable
		private ShardStatistics shards;

		@Nullable
		private String startTime;

		@Nullable
		private String startTimeInMillis;

		@Nullable
		private String state;

		private String uuid;

		@Nullable
		private String version;

		@Nullable
		private Long versionId;

		@Nullable
		private List<InfoFeatureState> featureStates;

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(List<String> value) {
			this.dataStreams = value;
			return this;
		}

		/**
		 * API name: {@code data_streams}
		 */
		public Builder dataStreams(String... value) {
			this.dataStreams = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #dataStreams(List)}, creating the list if needed. 4
		 */
		public Builder addDataStreams(String value) {
			if (this.dataStreams == null) {
				this.dataStreams = new ArrayList<>();
			}
			this.dataStreams.add(value);
			return this;
		}

		/**
		 * API name: {@code duration}
		 */
		public Builder duration(@Nullable String value) {
			this.duration = value;
			return this;
		}

		/**
		 * API name: {@code duration_in_millis}
		 */
		public Builder durationInMillis(@Nullable String value) {
			this.durationInMillis = value;
			return this;
		}

		/**
		 * API name: {@code end_time}
		 */
		public Builder endTime(@Nullable String value) {
			this.endTime = value;
			return this;
		}

		/**
		 * API name: {@code end_time_in_millis}
		 */
		public Builder endTimeInMillis(@Nullable String value) {
			this.endTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(@Nullable List<SnapshotShardFailure> value) {
			this.failures = value;
			return this;
		}

		/**
		 * API name: {@code failures}
		 */
		public Builder failures(SnapshotShardFailure... value) {
			this.failures = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed. 4
		 */
		public Builder addFailures(SnapshotShardFailure value) {
			if (this.failures == null) {
				this.failures = new ArrayList<>();
			}
			this.failures.add(value);
			return this;
		}

		/**
		 * Set {@link #failures(List)} to a singleton list.
		 */
		public Builder failures(Function<SnapshotShardFailure.Builder, ObjectBuilder<SnapshotShardFailure>> fn) {
			return this.failures(fn.apply(new SnapshotShardFailure.Builder()).build());
		}

		/**
		 * Add a value to {@link #failures(List)}, creating the list if needed. 5
		 */
		public Builder addFailures(Function<SnapshotShardFailure.Builder, ObjectBuilder<SnapshotShardFailure>> fn) {
			return this.addFailures(fn.apply(new SnapshotShardFailure.Builder()).build());
		}

		/**
		 * API name: {@code include_global_state}
		 */
		public Builder includeGlobalState(@Nullable Boolean value) {
			this.includeGlobalState = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed. 4
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * API name: {@code index_details}
		 */
		public Builder indexDetails(@Nullable Map<String, IndexDetails> value) {
			this.indexDetails = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #indexDetails(Map)}, creating the map if needed.
		 */
		public Builder putIndexDetails(String key, IndexDetails value) {
			if (this.indexDetails == null) {
				this.indexDetails = new HashMap<>();
			}
			this.indexDetails.put(key, value);
			return this;
		}

		/**
		 * Set {@link #indexDetails(Map)} to a singleton map.
		 */
		public Builder indexDetails(String key, Function<IndexDetails.Builder, ObjectBuilder<IndexDetails>> fn) {
			return this.indexDetails(Collections.singletonMap(key, fn.apply(new IndexDetails.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #indexDetails(Map)}, creating the map if needed.
		 */
		public Builder putIndexDetails(String key, Function<IndexDetails.Builder, ObjectBuilder<IndexDetails>> fn) {
			return this.putIndexDetails(key, fn.apply(new IndexDetails.Builder()).build());
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * API name: {@code reason}
		 */
		public Builder reason(@Nullable String value) {
			this.reason = value;
			return this;
		}

		/**
		 * API name: {@code repository}
		 */
		public Builder repository(@Nullable String value) {
			this.repository = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(String value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(@Nullable ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code shards}
		 */
		public Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code start_time}
		 */
		public Builder startTime(@Nullable String value) {
			this.startTime = value;
			return this;
		}

		/**
		 * API name: {@code start_time_in_millis}
		 */
		public Builder startTimeInMillis(@Nullable String value) {
			this.startTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code state}
		 */
		public Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * API name: {@code uuid}
		 */
		public Builder uuid(String value) {
			this.uuid = value;
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code version_id}
		 */
		public Builder versionId(@Nullable Long value) {
			this.versionId = value;
			return this;
		}

		/**
		 * API name: {@code feature_states}
		 */
		public Builder featureStates(@Nullable List<InfoFeatureState> value) {
			this.featureStates = value;
			return this;
		}

		/**
		 * API name: {@code feature_states}
		 */
		public Builder featureStates(InfoFeatureState... value) {
			this.featureStates = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #featureStates(List)}, creating the list if needed. 4
		 */
		public Builder addFeatureStates(InfoFeatureState value) {
			if (this.featureStates == null) {
				this.featureStates = new ArrayList<>();
			}
			this.featureStates.add(value);
			return this;
		}

		/**
		 * Set {@link #featureStates(List)} to a singleton list.
		 */
		public Builder featureStates(Function<InfoFeatureState.Builder, ObjectBuilder<InfoFeatureState>> fn) {
			return this.featureStates(fn.apply(new InfoFeatureState.Builder()).build());
		}

		/**
		 * Add a value to {@link #featureStates(List)}, creating the list if needed. 5
		 */
		public Builder addFeatureStates(Function<InfoFeatureState.Builder, ObjectBuilder<InfoFeatureState>> fn) {
			return this.addFeatureStates(fn.apply(new InfoFeatureState.Builder()).build());
		}

		/**
		 * Builds a {@link SnapshotInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotInfo build() {

			return new SnapshotInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotInfo}
	 */
	public static final JsonpDeserializer<SnapshotInfo> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SnapshotInfo::setupSnapshotInfoDeserializer, Builder::build);

	protected static void setupSnapshotInfoDeserializer(DelegatingDeserializer<SnapshotInfo.Builder> op) {

		op.add(Builder::dataStreams, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"data_streams");
		op.add(Builder::duration, JsonpDeserializer.stringDeserializer(), "duration");
		op.add(Builder::durationInMillis, JsonpDeserializer.stringDeserializer(), "duration_in_millis");
		op.add(Builder::endTime, JsonpDeserializer.stringDeserializer(), "end_time");
		op.add(Builder::endTimeInMillis, JsonpDeserializer.stringDeserializer(), "end_time_in_millis");
		op.add(Builder::failures, JsonpDeserializer.arrayDeserializer(SnapshotShardFailure._DESERIALIZER), "failures");
		op.add(Builder::includeGlobalState, JsonpDeserializer.booleanDeserializer(), "include_global_state");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indexDetails, JsonpDeserializer.stringMapDeserializer(IndexDetails._DESERIALIZER),
				"index_details");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::repository, JsonpDeserializer.stringDeserializer(), "repository");
		op.add(Builder::snapshot, JsonpDeserializer.stringDeserializer(), "snapshot");
		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "shards");
		op.add(Builder::startTime, JsonpDeserializer.stringDeserializer(), "start_time");
		op.add(Builder::startTimeInMillis, JsonpDeserializer.stringDeserializer(), "start_time_in_millis");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state");
		op.add(Builder::uuid, JsonpDeserializer.stringDeserializer(), "uuid");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::versionId, JsonpDeserializer.longDeserializer(), "version_id");
		op.add(Builder::featureStates, JsonpDeserializer.arrayDeserializer(InfoFeatureState._DESERIALIZER),
				"feature_states");

	}

}
