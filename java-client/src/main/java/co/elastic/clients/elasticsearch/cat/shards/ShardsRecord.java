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

package co.elastic.clients.elasticsearch.cat.shards;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.shards.ShardsRecord
@JsonpDeserializable
public final class ShardsRecord implements JsonpSerializable {
	@Nullable
	private final String index;

	@Nullable
	private final String shard;

	@Nullable
	private final String prirep;

	@Nullable
	private final String state;

	@Nullable
	private final String docs;

	@Nullable
	private final String store;

	@Nullable
	private final String ip;

	@Nullable
	private final String id;

	@Nullable
	private final String node;

	@Nullable
	private final String syncId;

	@Nullable
	private final String unassignedReason;

	@Nullable
	private final String unassignedAt;

	@Nullable
	private final String unassignedFor;

	@Nullable
	private final String unassignedDetails;

	@Nullable
	private final String recoverysourceType;

	@Nullable
	private final String completionSize;

	@Nullable
	private final String fielddataMemorySize;

	@Nullable
	private final String fielddataEvictions;

	@Nullable
	private final String queryCacheMemorySize;

	@Nullable
	private final String queryCacheEvictions;

	@Nullable
	private final String flushTotal;

	@Nullable
	private final String flushTotalTime;

	@Nullable
	private final String getCurrent;

	@Nullable
	private final String getTime;

	@Nullable
	private final String getTotal;

	@Nullable
	private final String getExistsTime;

	@Nullable
	private final String getExistsTotal;

	@Nullable
	private final String getMissingTime;

	@Nullable
	private final String getMissingTotal;

	@Nullable
	private final String indexingDeleteCurrent;

	@Nullable
	private final String indexingDeleteTime;

	@Nullable
	private final String indexingDeleteTotal;

	@Nullable
	private final String indexingIndexCurrent;

	@Nullable
	private final String indexingIndexTime;

	@Nullable
	private final String indexingIndexTotal;

	@Nullable
	private final String indexingIndexFailed;

	@Nullable
	private final String mergesCurrent;

	@Nullable
	private final String mergesCurrentDocs;

	@Nullable
	private final String mergesCurrentSize;

	@Nullable
	private final String mergesTotal;

	@Nullable
	private final String mergesTotalDocs;

	@Nullable
	private final String mergesTotalSize;

	@Nullable
	private final String mergesTotalTime;

	@Nullable
	private final String refreshTotal;

	@Nullable
	private final String refreshTime;

	@Nullable
	private final String refreshExternalTotal;

	@Nullable
	private final String refreshExternalTime;

	@Nullable
	private final String refreshListeners;

	@Nullable
	private final String searchFetchCurrent;

	@Nullable
	private final String searchFetchTime;

	@Nullable
	private final String searchFetchTotal;

	@Nullable
	private final String searchOpenContexts;

	@Nullable
	private final String searchQueryCurrent;

	@Nullable
	private final String searchQueryTime;

	@Nullable
	private final String searchQueryTotal;

	@Nullable
	private final String searchScrollCurrent;

	@Nullable
	private final String searchScrollTime;

	@Nullable
	private final String searchScrollTotal;

	@Nullable
	private final String segmentsCount;

	@Nullable
	private final String segmentsMemory;

	@Nullable
	private final String segmentsIndexWriterMemory;

	@Nullable
	private final String segmentsVersionMapMemory;

	@Nullable
	private final String segmentsFixedBitsetMemory;

	@Nullable
	private final String seqNoMax;

	@Nullable
	private final String seqNoLocalCheckpoint;

	@Nullable
	private final String seqNoGlobalCheckpoint;

	@Nullable
	private final String warmerCurrent;

	@Nullable
	private final String warmerTotal;

	@Nullable
	private final String warmerTotalTime;

	@Nullable
	private final String pathData;

	@Nullable
	private final String pathState;

	@Nullable
	private final String bulkTotalOperations;

	@Nullable
	private final String bulkTotalTime;

	@Nullable
	private final String bulkTotalSizeInBytes;

	@Nullable
	private final String bulkAvgTime;

	@Nullable
	private final String bulkAvgSizeInBytes;

	// ---------------------------------------------------------------------------------------------

	public ShardsRecord(Builder builder) {

		this.index = builder.index;
		this.shard = builder.shard;
		this.prirep = builder.prirep;
		this.state = builder.state;
		this.docs = builder.docs;
		this.store = builder.store;
		this.ip = builder.ip;
		this.id = builder.id;
		this.node = builder.node;
		this.syncId = builder.syncId;
		this.unassignedReason = builder.unassignedReason;
		this.unassignedAt = builder.unassignedAt;
		this.unassignedFor = builder.unassignedFor;
		this.unassignedDetails = builder.unassignedDetails;
		this.recoverysourceType = builder.recoverysourceType;
		this.completionSize = builder.completionSize;
		this.fielddataMemorySize = builder.fielddataMemorySize;
		this.fielddataEvictions = builder.fielddataEvictions;
		this.queryCacheMemorySize = builder.queryCacheMemorySize;
		this.queryCacheEvictions = builder.queryCacheEvictions;
		this.flushTotal = builder.flushTotal;
		this.flushTotalTime = builder.flushTotalTime;
		this.getCurrent = builder.getCurrent;
		this.getTime = builder.getTime;
		this.getTotal = builder.getTotal;
		this.getExistsTime = builder.getExistsTime;
		this.getExistsTotal = builder.getExistsTotal;
		this.getMissingTime = builder.getMissingTime;
		this.getMissingTotal = builder.getMissingTotal;
		this.indexingDeleteCurrent = builder.indexingDeleteCurrent;
		this.indexingDeleteTime = builder.indexingDeleteTime;
		this.indexingDeleteTotal = builder.indexingDeleteTotal;
		this.indexingIndexCurrent = builder.indexingIndexCurrent;
		this.indexingIndexTime = builder.indexingIndexTime;
		this.indexingIndexTotal = builder.indexingIndexTotal;
		this.indexingIndexFailed = builder.indexingIndexFailed;
		this.mergesCurrent = builder.mergesCurrent;
		this.mergesCurrentDocs = builder.mergesCurrentDocs;
		this.mergesCurrentSize = builder.mergesCurrentSize;
		this.mergesTotal = builder.mergesTotal;
		this.mergesTotalDocs = builder.mergesTotalDocs;
		this.mergesTotalSize = builder.mergesTotalSize;
		this.mergesTotalTime = builder.mergesTotalTime;
		this.refreshTotal = builder.refreshTotal;
		this.refreshTime = builder.refreshTime;
		this.refreshExternalTotal = builder.refreshExternalTotal;
		this.refreshExternalTime = builder.refreshExternalTime;
		this.refreshListeners = builder.refreshListeners;
		this.searchFetchCurrent = builder.searchFetchCurrent;
		this.searchFetchTime = builder.searchFetchTime;
		this.searchFetchTotal = builder.searchFetchTotal;
		this.searchOpenContexts = builder.searchOpenContexts;
		this.searchQueryCurrent = builder.searchQueryCurrent;
		this.searchQueryTime = builder.searchQueryTime;
		this.searchQueryTotal = builder.searchQueryTotal;
		this.searchScrollCurrent = builder.searchScrollCurrent;
		this.searchScrollTime = builder.searchScrollTime;
		this.searchScrollTotal = builder.searchScrollTotal;
		this.segmentsCount = builder.segmentsCount;
		this.segmentsMemory = builder.segmentsMemory;
		this.segmentsIndexWriterMemory = builder.segmentsIndexWriterMemory;
		this.segmentsVersionMapMemory = builder.segmentsVersionMapMemory;
		this.segmentsFixedBitsetMemory = builder.segmentsFixedBitsetMemory;
		this.seqNoMax = builder.seqNoMax;
		this.seqNoLocalCheckpoint = builder.seqNoLocalCheckpoint;
		this.seqNoGlobalCheckpoint = builder.seqNoGlobalCheckpoint;
		this.warmerCurrent = builder.warmerCurrent;
		this.warmerTotal = builder.warmerTotal;
		this.warmerTotalTime = builder.warmerTotalTime;
		this.pathData = builder.pathData;
		this.pathState = builder.pathState;
		this.bulkTotalOperations = builder.bulkTotalOperations;
		this.bulkTotalTime = builder.bulkTotalTime;
		this.bulkTotalSizeInBytes = builder.bulkTotalSizeInBytes;
		this.bulkAvgTime = builder.bulkAvgTime;
		this.bulkAvgSizeInBytes = builder.bulkAvgSizeInBytes;

	}

	public ShardsRecord(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * index name
	 * <p>
	 * API name: {@code index}
	 */
	@Nullable
	public String index() {
		return this.index;
	}

	/**
	 * shard name
	 * <p>
	 * API name: {@code shard}
	 */
	@Nullable
	public String shard() {
		return this.shard;
	}

	/**
	 * primary or replica
	 * <p>
	 * API name: {@code prirep}
	 */
	@Nullable
	public String prirep() {
		return this.prirep;
	}

	/**
	 * shard state
	 * <p>
	 * API name: {@code state}
	 */
	@Nullable
	public String state() {
		return this.state;
	}

	/**
	 * number of docs in shard
	 * <p>
	 * API name: {@code docs}
	 */
	@Nullable
	public String docs() {
		return this.docs;
	}

	/**
	 * store size of shard (how much disk it uses)
	 * <p>
	 * API name: {@code store}
	 */
	@Nullable
	public String store() {
		return this.store;
	}

	/**
	 * ip of node where it lives
	 * <p>
	 * API name: {@code ip}
	 */
	@Nullable
	public String ip() {
		return this.ip;
	}

	/**
	 * unique id of node where it lives
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * name of node where it lives
	 * <p>
	 * API name: {@code node}
	 */
	@Nullable
	public String node() {
		return this.node;
	}

	/**
	 * sync id
	 * <p>
	 * API name: {@code sync_id}
	 */
	@Nullable
	public String syncId() {
		return this.syncId;
	}

	/**
	 * reason shard is unassigned
	 * <p>
	 * API name: {@code unassigned.reason}
	 */
	@Nullable
	public String unassignedReason() {
		return this.unassignedReason;
	}

	/**
	 * time shard became unassigned (UTC)
	 * <p>
	 * API name: {@code unassigned.at}
	 */
	@Nullable
	public String unassignedAt() {
		return this.unassignedAt;
	}

	/**
	 * time has been unassigned
	 * <p>
	 * API name: {@code unassigned.for}
	 */
	@Nullable
	public String unassignedFor() {
		return this.unassignedFor;
	}

	/**
	 * additional details as to why the shard became unassigned
	 * <p>
	 * API name: {@code unassigned.details}
	 */
	@Nullable
	public String unassignedDetails() {
		return this.unassignedDetails;
	}

	/**
	 * recovery source type
	 * <p>
	 * API name: {@code recoverysource.type}
	 */
	@Nullable
	public String recoverysourceType() {
		return this.recoverysourceType;
	}

	/**
	 * size of completion
	 * <p>
	 * API name: {@code completion.size}
	 */
	@Nullable
	public String completionSize() {
		return this.completionSize;
	}

	/**
	 * used fielddata cache
	 * <p>
	 * API name: {@code fielddata.memory_size}
	 */
	@Nullable
	public String fielddataMemorySize() {
		return this.fielddataMemorySize;
	}

	/**
	 * fielddata evictions
	 * <p>
	 * API name: {@code fielddata.evictions}
	 */
	@Nullable
	public String fielddataEvictions() {
		return this.fielddataEvictions;
	}

	/**
	 * used query cache
	 * <p>
	 * API name: {@code query_cache.memory_size}
	 */
	@Nullable
	public String queryCacheMemorySize() {
		return this.queryCacheMemorySize;
	}

	/**
	 * query cache evictions
	 * <p>
	 * API name: {@code query_cache.evictions}
	 */
	@Nullable
	public String queryCacheEvictions() {
		return this.queryCacheEvictions;
	}

	/**
	 * number of flushes
	 * <p>
	 * API name: {@code flush.total}
	 */
	@Nullable
	public String flushTotal() {
		return this.flushTotal;
	}

	/**
	 * time spent in flush
	 * <p>
	 * API name: {@code flush.total_time}
	 */
	@Nullable
	public String flushTotalTime() {
		return this.flushTotalTime;
	}

	/**
	 * number of current get ops
	 * <p>
	 * API name: {@code get.current}
	 */
	@Nullable
	public String getCurrent() {
		return this.getCurrent;
	}

	/**
	 * time spent in get
	 * <p>
	 * API name: {@code get.time}
	 */
	@Nullable
	public String getTime() {
		return this.getTime;
	}

	/**
	 * number of get ops
	 * <p>
	 * API name: {@code get.total}
	 */
	@Nullable
	public String getTotal() {
		return this.getTotal;
	}

	/**
	 * time spent in successful gets
	 * <p>
	 * API name: {@code get.exists_time}
	 */
	@Nullable
	public String getExistsTime() {
		return this.getExistsTime;
	}

	/**
	 * number of successful gets
	 * <p>
	 * API name: {@code get.exists_total}
	 */
	@Nullable
	public String getExistsTotal() {
		return this.getExistsTotal;
	}

	/**
	 * time spent in failed gets
	 * <p>
	 * API name: {@code get.missing_time}
	 */
	@Nullable
	public String getMissingTime() {
		return this.getMissingTime;
	}

	/**
	 * number of failed gets
	 * <p>
	 * API name: {@code get.missing_total}
	 */
	@Nullable
	public String getMissingTotal() {
		return this.getMissingTotal;
	}

	/**
	 * number of current deletions
	 * <p>
	 * API name: {@code indexing.delete_current}
	 */
	@Nullable
	public String indexingDeleteCurrent() {
		return this.indexingDeleteCurrent;
	}

	/**
	 * time spent in deletions
	 * <p>
	 * API name: {@code indexing.delete_time}
	 */
	@Nullable
	public String indexingDeleteTime() {
		return this.indexingDeleteTime;
	}

	/**
	 * number of delete ops
	 * <p>
	 * API name: {@code indexing.delete_total}
	 */
	@Nullable
	public String indexingDeleteTotal() {
		return this.indexingDeleteTotal;
	}

	/**
	 * number of current indexing ops
	 * <p>
	 * API name: {@code indexing.index_current}
	 */
	@Nullable
	public String indexingIndexCurrent() {
		return this.indexingIndexCurrent;
	}

	/**
	 * time spent in indexing
	 * <p>
	 * API name: {@code indexing.index_time}
	 */
	@Nullable
	public String indexingIndexTime() {
		return this.indexingIndexTime;
	}

	/**
	 * number of indexing ops
	 * <p>
	 * API name: {@code indexing.index_total}
	 */
	@Nullable
	public String indexingIndexTotal() {
		return this.indexingIndexTotal;
	}

	/**
	 * number of failed indexing ops
	 * <p>
	 * API name: {@code indexing.index_failed}
	 */
	@Nullable
	public String indexingIndexFailed() {
		return this.indexingIndexFailed;
	}

	/**
	 * number of current merges
	 * <p>
	 * API name: {@code merges.current}
	 */
	@Nullable
	public String mergesCurrent() {
		return this.mergesCurrent;
	}

	/**
	 * number of current merging docs
	 * <p>
	 * API name: {@code merges.current_docs}
	 */
	@Nullable
	public String mergesCurrentDocs() {
		return this.mergesCurrentDocs;
	}

	/**
	 * size of current merges
	 * <p>
	 * API name: {@code merges.current_size}
	 */
	@Nullable
	public String mergesCurrentSize() {
		return this.mergesCurrentSize;
	}

	/**
	 * number of completed merge ops
	 * <p>
	 * API name: {@code merges.total}
	 */
	@Nullable
	public String mergesTotal() {
		return this.mergesTotal;
	}

	/**
	 * docs merged
	 * <p>
	 * API name: {@code merges.total_docs}
	 */
	@Nullable
	public String mergesTotalDocs() {
		return this.mergesTotalDocs;
	}

	/**
	 * size merged
	 * <p>
	 * API name: {@code merges.total_size}
	 */
	@Nullable
	public String mergesTotalSize() {
		return this.mergesTotalSize;
	}

	/**
	 * time spent in merges
	 * <p>
	 * API name: {@code merges.total_time}
	 */
	@Nullable
	public String mergesTotalTime() {
		return this.mergesTotalTime;
	}

	/**
	 * total refreshes
	 * <p>
	 * API name: {@code refresh.total}
	 */
	@Nullable
	public String refreshTotal() {
		return this.refreshTotal;
	}

	/**
	 * time spent in refreshes
	 * <p>
	 * API name: {@code refresh.time}
	 */
	@Nullable
	public String refreshTime() {
		return this.refreshTime;
	}

	/**
	 * total external refreshes
	 * <p>
	 * API name: {@code refresh.external_total}
	 */
	@Nullable
	public String refreshExternalTotal() {
		return this.refreshExternalTotal;
	}

	/**
	 * time spent in external refreshes
	 * <p>
	 * API name: {@code refresh.external_time}
	 */
	@Nullable
	public String refreshExternalTime() {
		return this.refreshExternalTime;
	}

	/**
	 * number of pending refresh listeners
	 * <p>
	 * API name: {@code refresh.listeners}
	 */
	@Nullable
	public String refreshListeners() {
		return this.refreshListeners;
	}

	/**
	 * current fetch phase ops
	 * <p>
	 * API name: {@code search.fetch_current}
	 */
	@Nullable
	public String searchFetchCurrent() {
		return this.searchFetchCurrent;
	}

	/**
	 * time spent in fetch phase
	 * <p>
	 * API name: {@code search.fetch_time}
	 */
	@Nullable
	public String searchFetchTime() {
		return this.searchFetchTime;
	}

	/**
	 * total fetch ops
	 * <p>
	 * API name: {@code search.fetch_total}
	 */
	@Nullable
	public String searchFetchTotal() {
		return this.searchFetchTotal;
	}

	/**
	 * open search contexts
	 * <p>
	 * API name: {@code search.open_contexts}
	 */
	@Nullable
	public String searchOpenContexts() {
		return this.searchOpenContexts;
	}

	/**
	 * current query phase ops
	 * <p>
	 * API name: {@code search.query_current}
	 */
	@Nullable
	public String searchQueryCurrent() {
		return this.searchQueryCurrent;
	}

	/**
	 * time spent in query phase
	 * <p>
	 * API name: {@code search.query_time}
	 */
	@Nullable
	public String searchQueryTime() {
		return this.searchQueryTime;
	}

	/**
	 * total query phase ops
	 * <p>
	 * API name: {@code search.query_total}
	 */
	@Nullable
	public String searchQueryTotal() {
		return this.searchQueryTotal;
	}

	/**
	 * open scroll contexts
	 * <p>
	 * API name: {@code search.scroll_current}
	 */
	@Nullable
	public String searchScrollCurrent() {
		return this.searchScrollCurrent;
	}

	/**
	 * time scroll contexts held open
	 * <p>
	 * API name: {@code search.scroll_time}
	 */
	@Nullable
	public String searchScrollTime() {
		return this.searchScrollTime;
	}

	/**
	 * completed scroll contexts
	 * <p>
	 * API name: {@code search.scroll_total}
	 */
	@Nullable
	public String searchScrollTotal() {
		return this.searchScrollTotal;
	}

	/**
	 * number of segments
	 * <p>
	 * API name: {@code segments.count}
	 */
	@Nullable
	public String segmentsCount() {
		return this.segmentsCount;
	}

	/**
	 * memory used by segments
	 * <p>
	 * API name: {@code segments.memory}
	 */
	@Nullable
	public String segmentsMemory() {
		return this.segmentsMemory;
	}

	/**
	 * memory used by index writer
	 * <p>
	 * API name: {@code segments.index_writer_memory}
	 */
	@Nullable
	public String segmentsIndexWriterMemory() {
		return this.segmentsIndexWriterMemory;
	}

	/**
	 * memory used by version map
	 * <p>
	 * API name: {@code segments.version_map_memory}
	 */
	@Nullable
	public String segmentsVersionMapMemory() {
		return this.segmentsVersionMapMemory;
	}

	/**
	 * memory used by fixed bit sets for nested object field types and export type
	 * filters for types referred in _parent fields
	 * <p>
	 * API name: {@code segments.fixed_bitset_memory}
	 */
	@Nullable
	public String segmentsFixedBitsetMemory() {
		return this.segmentsFixedBitsetMemory;
	}

	/**
	 * max sequence number
	 * <p>
	 * API name: {@code seq_no.max}
	 */
	@Nullable
	public String seqNoMax() {
		return this.seqNoMax;
	}

	/**
	 * local checkpoint
	 * <p>
	 * API name: {@code seq_no.local_checkpoint}
	 */
	@Nullable
	public String seqNoLocalCheckpoint() {
		return this.seqNoLocalCheckpoint;
	}

	/**
	 * global checkpoint
	 * <p>
	 * API name: {@code seq_no.global_checkpoint}
	 */
	@Nullable
	public String seqNoGlobalCheckpoint() {
		return this.seqNoGlobalCheckpoint;
	}

	/**
	 * current warmer ops
	 * <p>
	 * API name: {@code warmer.current}
	 */
	@Nullable
	public String warmerCurrent() {
		return this.warmerCurrent;
	}

	/**
	 * total warmer ops
	 * <p>
	 * API name: {@code warmer.total}
	 */
	@Nullable
	public String warmerTotal() {
		return this.warmerTotal;
	}

	/**
	 * time spent in warmers
	 * <p>
	 * API name: {@code warmer.total_time}
	 */
	@Nullable
	public String warmerTotalTime() {
		return this.warmerTotalTime;
	}

	/**
	 * shard data path
	 * <p>
	 * API name: {@code path.data}
	 */
	@Nullable
	public String pathData() {
		return this.pathData;
	}

	/**
	 * shard state path
	 * <p>
	 * API name: {@code path.state}
	 */
	@Nullable
	public String pathState() {
		return this.pathState;
	}

	/**
	 * number of bulk shard ops
	 * <p>
	 * API name: {@code bulk.total_operations}
	 */
	@Nullable
	public String bulkTotalOperations() {
		return this.bulkTotalOperations;
	}

	/**
	 * time spend in shard bulk
	 * <p>
	 * API name: {@code bulk.total_time}
	 */
	@Nullable
	public String bulkTotalTime() {
		return this.bulkTotalTime;
	}

	/**
	 * total size in bytes of shard bulk
	 * <p>
	 * API name: {@code bulk.total_size_in_bytes}
	 */
	@Nullable
	public String bulkTotalSizeInBytes() {
		return this.bulkTotalSizeInBytes;
	}

	/**
	 * average time spend in shard bulk
	 * <p>
	 * API name: {@code bulk.avg_time}
	 */
	@Nullable
	public String bulkAvgTime() {
		return this.bulkAvgTime;
	}

	/**
	 * avg size in bytes of shard bulk
	 * <p>
	 * API name: {@code bulk.avg_size_in_bytes}
	 */
	@Nullable
	public String bulkAvgSizeInBytes() {
		return this.bulkAvgSizeInBytes;
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

		if (this.index != null) {

			generator.writeKey("index");
			generator.write(this.index);

		}
		if (this.shard != null) {

			generator.writeKey("shard");
			generator.write(this.shard);

		}
		if (this.prirep != null) {

			generator.writeKey("prirep");
			generator.write(this.prirep);

		}
		if (this.state != null) {

			generator.writeKey("state");
			generator.write(this.state);

		}
		if (this.docs != null) {

			generator.writeKey("docs");
			generator.write(this.docs);

		}
		if (this.store != null) {

			generator.writeKey("store");
			generator.write(this.store);

		}
		if (this.ip != null) {

			generator.writeKey("ip");
			generator.write(this.ip);

		}
		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.node != null) {

			generator.writeKey("node");
			generator.write(this.node);

		}
		if (this.syncId != null) {

			generator.writeKey("sync_id");
			generator.write(this.syncId);

		}
		if (this.unassignedReason != null) {

			generator.writeKey("unassigned.reason");
			generator.write(this.unassignedReason);

		}
		if (this.unassignedAt != null) {

			generator.writeKey("unassigned.at");
			generator.write(this.unassignedAt);

		}
		if (this.unassignedFor != null) {

			generator.writeKey("unassigned.for");
			generator.write(this.unassignedFor);

		}
		if (this.unassignedDetails != null) {

			generator.writeKey("unassigned.details");
			generator.write(this.unassignedDetails);

		}
		if (this.recoverysourceType != null) {

			generator.writeKey("recoverysource.type");
			generator.write(this.recoverysourceType);

		}
		if (this.completionSize != null) {

			generator.writeKey("completion.size");
			generator.write(this.completionSize);

		}
		if (this.fielddataMemorySize != null) {

			generator.writeKey("fielddata.memory_size");
			generator.write(this.fielddataMemorySize);

		}
		if (this.fielddataEvictions != null) {

			generator.writeKey("fielddata.evictions");
			generator.write(this.fielddataEvictions);

		}
		if (this.queryCacheMemorySize != null) {

			generator.writeKey("query_cache.memory_size");
			generator.write(this.queryCacheMemorySize);

		}
		if (this.queryCacheEvictions != null) {

			generator.writeKey("query_cache.evictions");
			generator.write(this.queryCacheEvictions);

		}
		if (this.flushTotal != null) {

			generator.writeKey("flush.total");
			generator.write(this.flushTotal);

		}
		if (this.flushTotalTime != null) {

			generator.writeKey("flush.total_time");
			generator.write(this.flushTotalTime);

		}
		if (this.getCurrent != null) {

			generator.writeKey("get.current");
			generator.write(this.getCurrent);

		}
		if (this.getTime != null) {

			generator.writeKey("get.time");
			generator.write(this.getTime);

		}
		if (this.getTotal != null) {

			generator.writeKey("get.total");
			generator.write(this.getTotal);

		}
		if (this.getExistsTime != null) {

			generator.writeKey("get.exists_time");
			generator.write(this.getExistsTime);

		}
		if (this.getExistsTotal != null) {

			generator.writeKey("get.exists_total");
			generator.write(this.getExistsTotal);

		}
		if (this.getMissingTime != null) {

			generator.writeKey("get.missing_time");
			generator.write(this.getMissingTime);

		}
		if (this.getMissingTotal != null) {

			generator.writeKey("get.missing_total");
			generator.write(this.getMissingTotal);

		}
		if (this.indexingDeleteCurrent != null) {

			generator.writeKey("indexing.delete_current");
			generator.write(this.indexingDeleteCurrent);

		}
		if (this.indexingDeleteTime != null) {

			generator.writeKey("indexing.delete_time");
			generator.write(this.indexingDeleteTime);

		}
		if (this.indexingDeleteTotal != null) {

			generator.writeKey("indexing.delete_total");
			generator.write(this.indexingDeleteTotal);

		}
		if (this.indexingIndexCurrent != null) {

			generator.writeKey("indexing.index_current");
			generator.write(this.indexingIndexCurrent);

		}
		if (this.indexingIndexTime != null) {

			generator.writeKey("indexing.index_time");
			generator.write(this.indexingIndexTime);

		}
		if (this.indexingIndexTotal != null) {

			generator.writeKey("indexing.index_total");
			generator.write(this.indexingIndexTotal);

		}
		if (this.indexingIndexFailed != null) {

			generator.writeKey("indexing.index_failed");
			generator.write(this.indexingIndexFailed);

		}
		if (this.mergesCurrent != null) {

			generator.writeKey("merges.current");
			generator.write(this.mergesCurrent);

		}
		if (this.mergesCurrentDocs != null) {

			generator.writeKey("merges.current_docs");
			generator.write(this.mergesCurrentDocs);

		}
		if (this.mergesCurrentSize != null) {

			generator.writeKey("merges.current_size");
			generator.write(this.mergesCurrentSize);

		}
		if (this.mergesTotal != null) {

			generator.writeKey("merges.total");
			generator.write(this.mergesTotal);

		}
		if (this.mergesTotalDocs != null) {

			generator.writeKey("merges.total_docs");
			generator.write(this.mergesTotalDocs);

		}
		if (this.mergesTotalSize != null) {

			generator.writeKey("merges.total_size");
			generator.write(this.mergesTotalSize);

		}
		if (this.mergesTotalTime != null) {

			generator.writeKey("merges.total_time");
			generator.write(this.mergesTotalTime);

		}
		if (this.refreshTotal != null) {

			generator.writeKey("refresh.total");
			generator.write(this.refreshTotal);

		}
		if (this.refreshTime != null) {

			generator.writeKey("refresh.time");
			generator.write(this.refreshTime);

		}
		if (this.refreshExternalTotal != null) {

			generator.writeKey("refresh.external_total");
			generator.write(this.refreshExternalTotal);

		}
		if (this.refreshExternalTime != null) {

			generator.writeKey("refresh.external_time");
			generator.write(this.refreshExternalTime);

		}
		if (this.refreshListeners != null) {

			generator.writeKey("refresh.listeners");
			generator.write(this.refreshListeners);

		}
		if (this.searchFetchCurrent != null) {

			generator.writeKey("search.fetch_current");
			generator.write(this.searchFetchCurrent);

		}
		if (this.searchFetchTime != null) {

			generator.writeKey("search.fetch_time");
			generator.write(this.searchFetchTime);

		}
		if (this.searchFetchTotal != null) {

			generator.writeKey("search.fetch_total");
			generator.write(this.searchFetchTotal);

		}
		if (this.searchOpenContexts != null) {

			generator.writeKey("search.open_contexts");
			generator.write(this.searchOpenContexts);

		}
		if (this.searchQueryCurrent != null) {

			generator.writeKey("search.query_current");
			generator.write(this.searchQueryCurrent);

		}
		if (this.searchQueryTime != null) {

			generator.writeKey("search.query_time");
			generator.write(this.searchQueryTime);

		}
		if (this.searchQueryTotal != null) {

			generator.writeKey("search.query_total");
			generator.write(this.searchQueryTotal);

		}
		if (this.searchScrollCurrent != null) {

			generator.writeKey("search.scroll_current");
			generator.write(this.searchScrollCurrent);

		}
		if (this.searchScrollTime != null) {

			generator.writeKey("search.scroll_time");
			generator.write(this.searchScrollTime);

		}
		if (this.searchScrollTotal != null) {

			generator.writeKey("search.scroll_total");
			generator.write(this.searchScrollTotal);

		}
		if (this.segmentsCount != null) {

			generator.writeKey("segments.count");
			generator.write(this.segmentsCount);

		}
		if (this.segmentsMemory != null) {

			generator.writeKey("segments.memory");
			generator.write(this.segmentsMemory);

		}
		if (this.segmentsIndexWriterMemory != null) {

			generator.writeKey("segments.index_writer_memory");
			generator.write(this.segmentsIndexWriterMemory);

		}
		if (this.segmentsVersionMapMemory != null) {

			generator.writeKey("segments.version_map_memory");
			generator.write(this.segmentsVersionMapMemory);

		}
		if (this.segmentsFixedBitsetMemory != null) {

			generator.writeKey("segments.fixed_bitset_memory");
			generator.write(this.segmentsFixedBitsetMemory);

		}
		if (this.seqNoMax != null) {

			generator.writeKey("seq_no.max");
			generator.write(this.seqNoMax);

		}
		if (this.seqNoLocalCheckpoint != null) {

			generator.writeKey("seq_no.local_checkpoint");
			generator.write(this.seqNoLocalCheckpoint);

		}
		if (this.seqNoGlobalCheckpoint != null) {

			generator.writeKey("seq_no.global_checkpoint");
			generator.write(this.seqNoGlobalCheckpoint);

		}
		if (this.warmerCurrent != null) {

			generator.writeKey("warmer.current");
			generator.write(this.warmerCurrent);

		}
		if (this.warmerTotal != null) {

			generator.writeKey("warmer.total");
			generator.write(this.warmerTotal);

		}
		if (this.warmerTotalTime != null) {

			generator.writeKey("warmer.total_time");
			generator.write(this.warmerTotalTime);

		}
		if (this.pathData != null) {

			generator.writeKey("path.data");
			generator.write(this.pathData);

		}
		if (this.pathState != null) {

			generator.writeKey("path.state");
			generator.write(this.pathState);

		}
		if (this.bulkTotalOperations != null) {

			generator.writeKey("bulk.total_operations");
			generator.write(this.bulkTotalOperations);

		}
		if (this.bulkTotalTime != null) {

			generator.writeKey("bulk.total_time");
			generator.write(this.bulkTotalTime);

		}
		if (this.bulkTotalSizeInBytes != null) {

			generator.writeKey("bulk.total_size_in_bytes");
			generator.write(this.bulkTotalSizeInBytes);

		}
		if (this.bulkAvgTime != null) {

			generator.writeKey("bulk.avg_time");
			generator.write(this.bulkAvgTime);

		}
		if (this.bulkAvgSizeInBytes != null) {

			generator.writeKey("bulk.avg_size_in_bytes");
			generator.write(this.bulkAvgSizeInBytes);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardsRecord}.
	 */
	public static class Builder implements ObjectBuilder<ShardsRecord> {
		@Nullable
		private String index;

		@Nullable
		private String shard;

		@Nullable
		private String prirep;

		@Nullable
		private String state;

		@Nullable
		private String docs;

		@Nullable
		private String store;

		@Nullable
		private String ip;

		@Nullable
		private String id;

		@Nullable
		private String node;

		@Nullable
		private String syncId;

		@Nullable
		private String unassignedReason;

		@Nullable
		private String unassignedAt;

		@Nullable
		private String unassignedFor;

		@Nullable
		private String unassignedDetails;

		@Nullable
		private String recoverysourceType;

		@Nullable
		private String completionSize;

		@Nullable
		private String fielddataMemorySize;

		@Nullable
		private String fielddataEvictions;

		@Nullable
		private String queryCacheMemorySize;

		@Nullable
		private String queryCacheEvictions;

		@Nullable
		private String flushTotal;

		@Nullable
		private String flushTotalTime;

		@Nullable
		private String getCurrent;

		@Nullable
		private String getTime;

		@Nullable
		private String getTotal;

		@Nullable
		private String getExistsTime;

		@Nullable
		private String getExistsTotal;

		@Nullable
		private String getMissingTime;

		@Nullable
		private String getMissingTotal;

		@Nullable
		private String indexingDeleteCurrent;

		@Nullable
		private String indexingDeleteTime;

		@Nullable
		private String indexingDeleteTotal;

		@Nullable
		private String indexingIndexCurrent;

		@Nullable
		private String indexingIndexTime;

		@Nullable
		private String indexingIndexTotal;

		@Nullable
		private String indexingIndexFailed;

		@Nullable
		private String mergesCurrent;

		@Nullable
		private String mergesCurrentDocs;

		@Nullable
		private String mergesCurrentSize;

		@Nullable
		private String mergesTotal;

		@Nullable
		private String mergesTotalDocs;

		@Nullable
		private String mergesTotalSize;

		@Nullable
		private String mergesTotalTime;

		@Nullable
		private String refreshTotal;

		@Nullable
		private String refreshTime;

		@Nullable
		private String refreshExternalTotal;

		@Nullable
		private String refreshExternalTime;

		@Nullable
		private String refreshListeners;

		@Nullable
		private String searchFetchCurrent;

		@Nullable
		private String searchFetchTime;

		@Nullable
		private String searchFetchTotal;

		@Nullable
		private String searchOpenContexts;

		@Nullable
		private String searchQueryCurrent;

		@Nullable
		private String searchQueryTime;

		@Nullable
		private String searchQueryTotal;

		@Nullable
		private String searchScrollCurrent;

		@Nullable
		private String searchScrollTime;

		@Nullable
		private String searchScrollTotal;

		@Nullable
		private String segmentsCount;

		@Nullable
		private String segmentsMemory;

		@Nullable
		private String segmentsIndexWriterMemory;

		@Nullable
		private String segmentsVersionMapMemory;

		@Nullable
		private String segmentsFixedBitsetMemory;

		@Nullable
		private String seqNoMax;

		@Nullable
		private String seqNoLocalCheckpoint;

		@Nullable
		private String seqNoGlobalCheckpoint;

		@Nullable
		private String warmerCurrent;

		@Nullable
		private String warmerTotal;

		@Nullable
		private String warmerTotalTime;

		@Nullable
		private String pathData;

		@Nullable
		private String pathState;

		@Nullable
		private String bulkTotalOperations;

		@Nullable
		private String bulkTotalTime;

		@Nullable
		private String bulkTotalSizeInBytes;

		@Nullable
		private String bulkAvgTime;

		@Nullable
		private String bulkAvgSizeInBytes;

		/**
		 * index name
		 * <p>
		 * API name: {@code index}
		 */
		public Builder index(@Nullable String value) {
			this.index = value;
			return this;
		}

		/**
		 * shard name
		 * <p>
		 * API name: {@code shard}
		 */
		public Builder shard(@Nullable String value) {
			this.shard = value;
			return this;
		}

		/**
		 * primary or replica
		 * <p>
		 * API name: {@code prirep}
		 */
		public Builder prirep(@Nullable String value) {
			this.prirep = value;
			return this;
		}

		/**
		 * shard state
		 * <p>
		 * API name: {@code state}
		 */
		public Builder state(@Nullable String value) {
			this.state = value;
			return this;
		}

		/**
		 * number of docs in shard
		 * <p>
		 * API name: {@code docs}
		 */
		public Builder docs(@Nullable String value) {
			this.docs = value;
			return this;
		}

		/**
		 * store size of shard (how much disk it uses)
		 * <p>
		 * API name: {@code store}
		 */
		public Builder store(@Nullable String value) {
			this.store = value;
			return this;
		}

		/**
		 * ip of node where it lives
		 * <p>
		 * API name: {@code ip}
		 */
		public Builder ip(@Nullable String value) {
			this.ip = value;
			return this;
		}

		/**
		 * unique id of node where it lives
		 * <p>
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * name of node where it lives
		 * <p>
		 * API name: {@code node}
		 */
		public Builder node(@Nullable String value) {
			this.node = value;
			return this;
		}

		/**
		 * sync id
		 * <p>
		 * API name: {@code sync_id}
		 */
		public Builder syncId(@Nullable String value) {
			this.syncId = value;
			return this;
		}

		/**
		 * reason shard is unassigned
		 * <p>
		 * API name: {@code unassigned.reason}
		 */
		public Builder unassignedReason(@Nullable String value) {
			this.unassignedReason = value;
			return this;
		}

		/**
		 * time shard became unassigned (UTC)
		 * <p>
		 * API name: {@code unassigned.at}
		 */
		public Builder unassignedAt(@Nullable String value) {
			this.unassignedAt = value;
			return this;
		}

		/**
		 * time has been unassigned
		 * <p>
		 * API name: {@code unassigned.for}
		 */
		public Builder unassignedFor(@Nullable String value) {
			this.unassignedFor = value;
			return this;
		}

		/**
		 * additional details as to why the shard became unassigned
		 * <p>
		 * API name: {@code unassigned.details}
		 */
		public Builder unassignedDetails(@Nullable String value) {
			this.unassignedDetails = value;
			return this;
		}

		/**
		 * recovery source type
		 * <p>
		 * API name: {@code recoverysource.type}
		 */
		public Builder recoverysourceType(@Nullable String value) {
			this.recoverysourceType = value;
			return this;
		}

		/**
		 * size of completion
		 * <p>
		 * API name: {@code completion.size}
		 */
		public Builder completionSize(@Nullable String value) {
			this.completionSize = value;
			return this;
		}

		/**
		 * used fielddata cache
		 * <p>
		 * API name: {@code fielddata.memory_size}
		 */
		public Builder fielddataMemorySize(@Nullable String value) {
			this.fielddataMemorySize = value;
			return this;
		}

		/**
		 * fielddata evictions
		 * <p>
		 * API name: {@code fielddata.evictions}
		 */
		public Builder fielddataEvictions(@Nullable String value) {
			this.fielddataEvictions = value;
			return this;
		}

		/**
		 * used query cache
		 * <p>
		 * API name: {@code query_cache.memory_size}
		 */
		public Builder queryCacheMemorySize(@Nullable String value) {
			this.queryCacheMemorySize = value;
			return this;
		}

		/**
		 * query cache evictions
		 * <p>
		 * API name: {@code query_cache.evictions}
		 */
		public Builder queryCacheEvictions(@Nullable String value) {
			this.queryCacheEvictions = value;
			return this;
		}

		/**
		 * number of flushes
		 * <p>
		 * API name: {@code flush.total}
		 */
		public Builder flushTotal(@Nullable String value) {
			this.flushTotal = value;
			return this;
		}

		/**
		 * time spent in flush
		 * <p>
		 * API name: {@code flush.total_time}
		 */
		public Builder flushTotalTime(@Nullable String value) {
			this.flushTotalTime = value;
			return this;
		}

		/**
		 * number of current get ops
		 * <p>
		 * API name: {@code get.current}
		 */
		public Builder getCurrent(@Nullable String value) {
			this.getCurrent = value;
			return this;
		}

		/**
		 * time spent in get
		 * <p>
		 * API name: {@code get.time}
		 */
		public Builder getTime(@Nullable String value) {
			this.getTime = value;
			return this;
		}

		/**
		 * number of get ops
		 * <p>
		 * API name: {@code get.total}
		 */
		public Builder getTotal(@Nullable String value) {
			this.getTotal = value;
			return this;
		}

		/**
		 * time spent in successful gets
		 * <p>
		 * API name: {@code get.exists_time}
		 */
		public Builder getExistsTime(@Nullable String value) {
			this.getExistsTime = value;
			return this;
		}

		/**
		 * number of successful gets
		 * <p>
		 * API name: {@code get.exists_total}
		 */
		public Builder getExistsTotal(@Nullable String value) {
			this.getExistsTotal = value;
			return this;
		}

		/**
		 * time spent in failed gets
		 * <p>
		 * API name: {@code get.missing_time}
		 */
		public Builder getMissingTime(@Nullable String value) {
			this.getMissingTime = value;
			return this;
		}

		/**
		 * number of failed gets
		 * <p>
		 * API name: {@code get.missing_total}
		 */
		public Builder getMissingTotal(@Nullable String value) {
			this.getMissingTotal = value;
			return this;
		}

		/**
		 * number of current deletions
		 * <p>
		 * API name: {@code indexing.delete_current}
		 */
		public Builder indexingDeleteCurrent(@Nullable String value) {
			this.indexingDeleteCurrent = value;
			return this;
		}

		/**
		 * time spent in deletions
		 * <p>
		 * API name: {@code indexing.delete_time}
		 */
		public Builder indexingDeleteTime(@Nullable String value) {
			this.indexingDeleteTime = value;
			return this;
		}

		/**
		 * number of delete ops
		 * <p>
		 * API name: {@code indexing.delete_total}
		 */
		public Builder indexingDeleteTotal(@Nullable String value) {
			this.indexingDeleteTotal = value;
			return this;
		}

		/**
		 * number of current indexing ops
		 * <p>
		 * API name: {@code indexing.index_current}
		 */
		public Builder indexingIndexCurrent(@Nullable String value) {
			this.indexingIndexCurrent = value;
			return this;
		}

		/**
		 * time spent in indexing
		 * <p>
		 * API name: {@code indexing.index_time}
		 */
		public Builder indexingIndexTime(@Nullable String value) {
			this.indexingIndexTime = value;
			return this;
		}

		/**
		 * number of indexing ops
		 * <p>
		 * API name: {@code indexing.index_total}
		 */
		public Builder indexingIndexTotal(@Nullable String value) {
			this.indexingIndexTotal = value;
			return this;
		}

		/**
		 * number of failed indexing ops
		 * <p>
		 * API name: {@code indexing.index_failed}
		 */
		public Builder indexingIndexFailed(@Nullable String value) {
			this.indexingIndexFailed = value;
			return this;
		}

		/**
		 * number of current merges
		 * <p>
		 * API name: {@code merges.current}
		 */
		public Builder mergesCurrent(@Nullable String value) {
			this.mergesCurrent = value;
			return this;
		}

		/**
		 * number of current merging docs
		 * <p>
		 * API name: {@code merges.current_docs}
		 */
		public Builder mergesCurrentDocs(@Nullable String value) {
			this.mergesCurrentDocs = value;
			return this;
		}

		/**
		 * size of current merges
		 * <p>
		 * API name: {@code merges.current_size}
		 */
		public Builder mergesCurrentSize(@Nullable String value) {
			this.mergesCurrentSize = value;
			return this;
		}

		/**
		 * number of completed merge ops
		 * <p>
		 * API name: {@code merges.total}
		 */
		public Builder mergesTotal(@Nullable String value) {
			this.mergesTotal = value;
			return this;
		}

		/**
		 * docs merged
		 * <p>
		 * API name: {@code merges.total_docs}
		 */
		public Builder mergesTotalDocs(@Nullable String value) {
			this.mergesTotalDocs = value;
			return this;
		}

		/**
		 * size merged
		 * <p>
		 * API name: {@code merges.total_size}
		 */
		public Builder mergesTotalSize(@Nullable String value) {
			this.mergesTotalSize = value;
			return this;
		}

		/**
		 * time spent in merges
		 * <p>
		 * API name: {@code merges.total_time}
		 */
		public Builder mergesTotalTime(@Nullable String value) {
			this.mergesTotalTime = value;
			return this;
		}

		/**
		 * total refreshes
		 * <p>
		 * API name: {@code refresh.total}
		 */
		public Builder refreshTotal(@Nullable String value) {
			this.refreshTotal = value;
			return this;
		}

		/**
		 * time spent in refreshes
		 * <p>
		 * API name: {@code refresh.time}
		 */
		public Builder refreshTime(@Nullable String value) {
			this.refreshTime = value;
			return this;
		}

		/**
		 * total external refreshes
		 * <p>
		 * API name: {@code refresh.external_total}
		 */
		public Builder refreshExternalTotal(@Nullable String value) {
			this.refreshExternalTotal = value;
			return this;
		}

		/**
		 * time spent in external refreshes
		 * <p>
		 * API name: {@code refresh.external_time}
		 */
		public Builder refreshExternalTime(@Nullable String value) {
			this.refreshExternalTime = value;
			return this;
		}

		/**
		 * number of pending refresh listeners
		 * <p>
		 * API name: {@code refresh.listeners}
		 */
		public Builder refreshListeners(@Nullable String value) {
			this.refreshListeners = value;
			return this;
		}

		/**
		 * current fetch phase ops
		 * <p>
		 * API name: {@code search.fetch_current}
		 */
		public Builder searchFetchCurrent(@Nullable String value) {
			this.searchFetchCurrent = value;
			return this;
		}

		/**
		 * time spent in fetch phase
		 * <p>
		 * API name: {@code search.fetch_time}
		 */
		public Builder searchFetchTime(@Nullable String value) {
			this.searchFetchTime = value;
			return this;
		}

		/**
		 * total fetch ops
		 * <p>
		 * API name: {@code search.fetch_total}
		 */
		public Builder searchFetchTotal(@Nullable String value) {
			this.searchFetchTotal = value;
			return this;
		}

		/**
		 * open search contexts
		 * <p>
		 * API name: {@code search.open_contexts}
		 */
		public Builder searchOpenContexts(@Nullable String value) {
			this.searchOpenContexts = value;
			return this;
		}

		/**
		 * current query phase ops
		 * <p>
		 * API name: {@code search.query_current}
		 */
		public Builder searchQueryCurrent(@Nullable String value) {
			this.searchQueryCurrent = value;
			return this;
		}

		/**
		 * time spent in query phase
		 * <p>
		 * API name: {@code search.query_time}
		 */
		public Builder searchQueryTime(@Nullable String value) {
			this.searchQueryTime = value;
			return this;
		}

		/**
		 * total query phase ops
		 * <p>
		 * API name: {@code search.query_total}
		 */
		public Builder searchQueryTotal(@Nullable String value) {
			this.searchQueryTotal = value;
			return this;
		}

		/**
		 * open scroll contexts
		 * <p>
		 * API name: {@code search.scroll_current}
		 */
		public Builder searchScrollCurrent(@Nullable String value) {
			this.searchScrollCurrent = value;
			return this;
		}

		/**
		 * time scroll contexts held open
		 * <p>
		 * API name: {@code search.scroll_time}
		 */
		public Builder searchScrollTime(@Nullable String value) {
			this.searchScrollTime = value;
			return this;
		}

		/**
		 * completed scroll contexts
		 * <p>
		 * API name: {@code search.scroll_total}
		 */
		public Builder searchScrollTotal(@Nullable String value) {
			this.searchScrollTotal = value;
			return this;
		}

		/**
		 * number of segments
		 * <p>
		 * API name: {@code segments.count}
		 */
		public Builder segmentsCount(@Nullable String value) {
			this.segmentsCount = value;
			return this;
		}

		/**
		 * memory used by segments
		 * <p>
		 * API name: {@code segments.memory}
		 */
		public Builder segmentsMemory(@Nullable String value) {
			this.segmentsMemory = value;
			return this;
		}

		/**
		 * memory used by index writer
		 * <p>
		 * API name: {@code segments.index_writer_memory}
		 */
		public Builder segmentsIndexWriterMemory(@Nullable String value) {
			this.segmentsIndexWriterMemory = value;
			return this;
		}

		/**
		 * memory used by version map
		 * <p>
		 * API name: {@code segments.version_map_memory}
		 */
		public Builder segmentsVersionMapMemory(@Nullable String value) {
			this.segmentsVersionMapMemory = value;
			return this;
		}

		/**
		 * memory used by fixed bit sets for nested object field types and export type
		 * filters for types referred in _parent fields
		 * <p>
		 * API name: {@code segments.fixed_bitset_memory}
		 */
		public Builder segmentsFixedBitsetMemory(@Nullable String value) {
			this.segmentsFixedBitsetMemory = value;
			return this;
		}

		/**
		 * max sequence number
		 * <p>
		 * API name: {@code seq_no.max}
		 */
		public Builder seqNoMax(@Nullable String value) {
			this.seqNoMax = value;
			return this;
		}

		/**
		 * local checkpoint
		 * <p>
		 * API name: {@code seq_no.local_checkpoint}
		 */
		public Builder seqNoLocalCheckpoint(@Nullable String value) {
			this.seqNoLocalCheckpoint = value;
			return this;
		}

		/**
		 * global checkpoint
		 * <p>
		 * API name: {@code seq_no.global_checkpoint}
		 */
		public Builder seqNoGlobalCheckpoint(@Nullable String value) {
			this.seqNoGlobalCheckpoint = value;
			return this;
		}

		/**
		 * current warmer ops
		 * <p>
		 * API name: {@code warmer.current}
		 */
		public Builder warmerCurrent(@Nullable String value) {
			this.warmerCurrent = value;
			return this;
		}

		/**
		 * total warmer ops
		 * <p>
		 * API name: {@code warmer.total}
		 */
		public Builder warmerTotal(@Nullable String value) {
			this.warmerTotal = value;
			return this;
		}

		/**
		 * time spent in warmers
		 * <p>
		 * API name: {@code warmer.total_time}
		 */
		public Builder warmerTotalTime(@Nullable String value) {
			this.warmerTotalTime = value;
			return this;
		}

		/**
		 * shard data path
		 * <p>
		 * API name: {@code path.data}
		 */
		public Builder pathData(@Nullable String value) {
			this.pathData = value;
			return this;
		}

		/**
		 * shard state path
		 * <p>
		 * API name: {@code path.state}
		 */
		public Builder pathState(@Nullable String value) {
			this.pathState = value;
			return this;
		}

		/**
		 * number of bulk shard ops
		 * <p>
		 * API name: {@code bulk.total_operations}
		 */
		public Builder bulkTotalOperations(@Nullable String value) {
			this.bulkTotalOperations = value;
			return this;
		}

		/**
		 * time spend in shard bulk
		 * <p>
		 * API name: {@code bulk.total_time}
		 */
		public Builder bulkTotalTime(@Nullable String value) {
			this.bulkTotalTime = value;
			return this;
		}

		/**
		 * total size in bytes of shard bulk
		 * <p>
		 * API name: {@code bulk.total_size_in_bytes}
		 */
		public Builder bulkTotalSizeInBytes(@Nullable String value) {
			this.bulkTotalSizeInBytes = value;
			return this;
		}

		/**
		 * average time spend in shard bulk
		 * <p>
		 * API name: {@code bulk.avg_time}
		 */
		public Builder bulkAvgTime(@Nullable String value) {
			this.bulkAvgTime = value;
			return this;
		}

		/**
		 * avg size in bytes of shard bulk
		 * <p>
		 * API name: {@code bulk.avg_size_in_bytes}
		 */
		public Builder bulkAvgSizeInBytes(@Nullable String value) {
			this.bulkAvgSizeInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link ShardsRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsRecord build() {

			return new ShardsRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsRecord}
	 */
	public static final JsonpDeserializer<ShardsRecord> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardsRecord::setupShardsRecordDeserializer, Builder::build);

	protected static void setupShardsRecordDeserializer(DelegatingDeserializer<ShardsRecord.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index", "i", "idx");
		op.add(Builder::shard, JsonpDeserializer.stringDeserializer(), "shard", "s", "sh");
		op.add(Builder::prirep, JsonpDeserializer.stringDeserializer(), "prirep", "p", "pr", "primaryOrReplica");
		op.add(Builder::state, JsonpDeserializer.stringDeserializer(), "state", "st");
		op.add(Builder::docs, JsonpDeserializer.stringDeserializer(), "docs", "d", "dc");
		op.add(Builder::store, JsonpDeserializer.stringDeserializer(), "store", "sto");
		op.add(Builder::ip, JsonpDeserializer.stringDeserializer(), "ip");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node", "n");
		op.add(Builder::syncId, JsonpDeserializer.stringDeserializer(), "sync_id");
		op.add(Builder::unassignedReason, JsonpDeserializer.stringDeserializer(), "unassigned.reason", "ur");
		op.add(Builder::unassignedAt, JsonpDeserializer.stringDeserializer(), "unassigned.at", "ua");
		op.add(Builder::unassignedFor, JsonpDeserializer.stringDeserializer(), "unassigned.for", "uf");
		op.add(Builder::unassignedDetails, JsonpDeserializer.stringDeserializer(), "unassigned.details", "ud");
		op.add(Builder::recoverysourceType, JsonpDeserializer.stringDeserializer(), "recoverysource.type", "rs");
		op.add(Builder::completionSize, JsonpDeserializer.stringDeserializer(), "completion.size", "cs",
				"completionSize");
		op.add(Builder::fielddataMemorySize, JsonpDeserializer.stringDeserializer(), "fielddata.memory_size", "fm",
				"fielddataMemory");
		op.add(Builder::fielddataEvictions, JsonpDeserializer.stringDeserializer(), "fielddata.evictions", "fe",
				"fielddataEvictions");
		op.add(Builder::queryCacheMemorySize, JsonpDeserializer.stringDeserializer(), "query_cache.memory_size", "qcm",
				"queryCacheMemory");
		op.add(Builder::queryCacheEvictions, JsonpDeserializer.stringDeserializer(), "query_cache.evictions", "qce",
				"queryCacheEvictions");
		op.add(Builder::flushTotal, JsonpDeserializer.stringDeserializer(), "flush.total", "ft", "flushTotal");
		op.add(Builder::flushTotalTime, JsonpDeserializer.stringDeserializer(), "flush.total_time", "ftt",
				"flushTotalTime");
		op.add(Builder::getCurrent, JsonpDeserializer.stringDeserializer(), "get.current", "gc", "getCurrent");
		op.add(Builder::getTime, JsonpDeserializer.stringDeserializer(), "get.time", "gti", "getTime");
		op.add(Builder::getTotal, JsonpDeserializer.stringDeserializer(), "get.total", "gto", "getTotal");
		op.add(Builder::getExistsTime, JsonpDeserializer.stringDeserializer(), "get.exists_time", "geti",
				"getExistsTime");
		op.add(Builder::getExistsTotal, JsonpDeserializer.stringDeserializer(), "get.exists_total", "geto",
				"getExistsTotal");
		op.add(Builder::getMissingTime, JsonpDeserializer.stringDeserializer(), "get.missing_time", "gmti",
				"getMissingTime");
		op.add(Builder::getMissingTotal, JsonpDeserializer.stringDeserializer(), "get.missing_total", "gmto",
				"getMissingTotal");
		op.add(Builder::indexingDeleteCurrent, JsonpDeserializer.stringDeserializer(), "indexing.delete_current", "idc",
				"indexingDeleteCurrent");
		op.add(Builder::indexingDeleteTime, JsonpDeserializer.stringDeserializer(), "indexing.delete_time", "idti",
				"indexingDeleteTime");
		op.add(Builder::indexingDeleteTotal, JsonpDeserializer.stringDeserializer(), "indexing.delete_total", "idto",
				"indexingDeleteTotal");
		op.add(Builder::indexingIndexCurrent, JsonpDeserializer.stringDeserializer(), "indexing.index_current", "iic",
				"indexingIndexCurrent");
		op.add(Builder::indexingIndexTime, JsonpDeserializer.stringDeserializer(), "indexing.index_time", "iiti",
				"indexingIndexTime");
		op.add(Builder::indexingIndexTotal, JsonpDeserializer.stringDeserializer(), "indexing.index_total", "iito",
				"indexingIndexTotal");
		op.add(Builder::indexingIndexFailed, JsonpDeserializer.stringDeserializer(), "indexing.index_failed", "iif",
				"indexingIndexFailed");
		op.add(Builder::mergesCurrent, JsonpDeserializer.stringDeserializer(), "merges.current", "mc", "mergesCurrent");
		op.add(Builder::mergesCurrentDocs, JsonpDeserializer.stringDeserializer(), "merges.current_docs", "mcd",
				"mergesCurrentDocs");
		op.add(Builder::mergesCurrentSize, JsonpDeserializer.stringDeserializer(), "merges.current_size", "mcs",
				"mergesCurrentSize");
		op.add(Builder::mergesTotal, JsonpDeserializer.stringDeserializer(), "merges.total", "mt", "mergesTotal");
		op.add(Builder::mergesTotalDocs, JsonpDeserializer.stringDeserializer(), "merges.total_docs", "mtd",
				"mergesTotalDocs");
		op.add(Builder::mergesTotalSize, JsonpDeserializer.stringDeserializer(), "merges.total_size", "mts",
				"mergesTotalSize");
		op.add(Builder::mergesTotalTime, JsonpDeserializer.stringDeserializer(), "merges.total_time", "mtt",
				"mergesTotalTime");
		op.add(Builder::refreshTotal, JsonpDeserializer.stringDeserializer(), "refresh.total");
		op.add(Builder::refreshTime, JsonpDeserializer.stringDeserializer(), "refresh.time");
		op.add(Builder::refreshExternalTotal, JsonpDeserializer.stringDeserializer(), "refresh.external_total", "rto",
				"refreshTotal");
		op.add(Builder::refreshExternalTime, JsonpDeserializer.stringDeserializer(), "refresh.external_time", "rti",
				"refreshTime");
		op.add(Builder::refreshListeners, JsonpDeserializer.stringDeserializer(), "refresh.listeners", "rli",
				"refreshListeners");
		op.add(Builder::searchFetchCurrent, JsonpDeserializer.stringDeserializer(), "search.fetch_current", "sfc",
				"searchFetchCurrent");
		op.add(Builder::searchFetchTime, JsonpDeserializer.stringDeserializer(), "search.fetch_time", "sfti",
				"searchFetchTime");
		op.add(Builder::searchFetchTotal, JsonpDeserializer.stringDeserializer(), "search.fetch_total", "sfto",
				"searchFetchTotal");
		op.add(Builder::searchOpenContexts, JsonpDeserializer.stringDeserializer(), "search.open_contexts", "so",
				"searchOpenContexts");
		op.add(Builder::searchQueryCurrent, JsonpDeserializer.stringDeserializer(), "search.query_current", "sqc",
				"searchQueryCurrent");
		op.add(Builder::searchQueryTime, JsonpDeserializer.stringDeserializer(), "search.query_time", "sqti",
				"searchQueryTime");
		op.add(Builder::searchQueryTotal, JsonpDeserializer.stringDeserializer(), "search.query_total", "sqto",
				"searchQueryTotal");
		op.add(Builder::searchScrollCurrent, JsonpDeserializer.stringDeserializer(), "search.scroll_current", "scc",
				"searchScrollCurrent");
		op.add(Builder::searchScrollTime, JsonpDeserializer.stringDeserializer(), "search.scroll_time", "scti",
				"searchScrollTime");
		op.add(Builder::searchScrollTotal, JsonpDeserializer.stringDeserializer(), "search.scroll_total", "scto",
				"searchScrollTotal");
		op.add(Builder::segmentsCount, JsonpDeserializer.stringDeserializer(), "segments.count", "sc", "segmentsCount");
		op.add(Builder::segmentsMemory, JsonpDeserializer.stringDeserializer(), "segments.memory", "sm",
				"segmentsMemory");
		op.add(Builder::segmentsIndexWriterMemory, JsonpDeserializer.stringDeserializer(),
				"segments.index_writer_memory", "siwm", "segmentsIndexWriterMemory");
		op.add(Builder::segmentsVersionMapMemory, JsonpDeserializer.stringDeserializer(), "segments.version_map_memory",
				"svmm", "segmentsVersionMapMemory");
		op.add(Builder::segmentsFixedBitsetMemory, JsonpDeserializer.stringDeserializer(),
				"segments.fixed_bitset_memory", "sfbm", "fixedBitsetMemory");
		op.add(Builder::seqNoMax, JsonpDeserializer.stringDeserializer(), "seq_no.max", "sqm", "maxSeqNo");
		op.add(Builder::seqNoLocalCheckpoint, JsonpDeserializer.stringDeserializer(), "seq_no.local_checkpoint", "sql",
				"localCheckpoint");
		op.add(Builder::seqNoGlobalCheckpoint, JsonpDeserializer.stringDeserializer(), "seq_no.global_checkpoint",
				"sqg", "globalCheckpoint");
		op.add(Builder::warmerCurrent, JsonpDeserializer.stringDeserializer(), "warmer.current", "wc", "warmerCurrent");
		op.add(Builder::warmerTotal, JsonpDeserializer.stringDeserializer(), "warmer.total", "wto", "warmerTotal");
		op.add(Builder::warmerTotalTime, JsonpDeserializer.stringDeserializer(), "warmer.total_time", "wtt",
				"warmerTotalTime");
		op.add(Builder::pathData, JsonpDeserializer.stringDeserializer(), "path.data", "pd", "dataPath");
		op.add(Builder::pathState, JsonpDeserializer.stringDeserializer(), "path.state", "ps", "statsPath");
		op.add(Builder::bulkTotalOperations, JsonpDeserializer.stringDeserializer(), "bulk.total_operations", "bto",
				"bulkTotalOperations");
		op.add(Builder::bulkTotalTime, JsonpDeserializer.stringDeserializer(), "bulk.total_time", "btti",
				"bulkTotalTime");
		op.add(Builder::bulkTotalSizeInBytes, JsonpDeserializer.stringDeserializer(), "bulk.total_size_in_bytes",
				"btsi", "bulkTotalSizeInBytes");
		op.add(Builder::bulkAvgTime, JsonpDeserializer.stringDeserializer(), "bulk.avg_time", "bati", "bulkAvgTime");
		op.add(Builder::bulkAvgSizeInBytes, JsonpDeserializer.stringDeserializer(), "bulk.avg_size_in_bytes", "basi",
				"bulkAvgSizeInBytes");

	}

}
