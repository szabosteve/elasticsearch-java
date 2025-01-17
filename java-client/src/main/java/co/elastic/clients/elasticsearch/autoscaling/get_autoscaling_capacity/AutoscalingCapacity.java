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

package co.elastic.clients.elasticsearch.autoscaling.get_autoscaling_capacity;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: autoscaling.get_autoscaling_capacity.AutoscalingCapacity
@JsonpDeserializable
public final class AutoscalingCapacity implements JsonpSerializable {
	private final AutoscalingResources node;

	private final AutoscalingResources total;

	// ---------------------------------------------------------------------------------------------

	public AutoscalingCapacity(Builder builder) {

		this.node = Objects.requireNonNull(builder.node, "node");
		this.total = Objects.requireNonNull(builder.total, "total");

	}

	public AutoscalingCapacity(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code node}
	 */
	public AutoscalingResources node() {
		return this.node;
	}

	/**
	 * API name: {@code total}
	 */
	public AutoscalingResources total() {
		return this.total;
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

		generator.writeKey("node");
		this.node.serialize(generator, mapper);

		generator.writeKey("total");
		this.total.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoscalingCapacity}.
	 */
	public static class Builder implements ObjectBuilder<AutoscalingCapacity> {
		private AutoscalingResources node;

		private AutoscalingResources total;

		/**
		 * API name: {@code node}
		 */
		public Builder node(AutoscalingResources value) {
			this.node = value;
			return this;
		}

		/**
		 * API name: {@code node}
		 */
		public Builder node(Function<AutoscalingResources.Builder, ObjectBuilder<AutoscalingResources>> fn) {
			return this.node(fn.apply(new AutoscalingResources.Builder()).build());
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(AutoscalingResources value) {
			this.total = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(Function<AutoscalingResources.Builder, ObjectBuilder<AutoscalingResources>> fn) {
			return this.total(fn.apply(new AutoscalingResources.Builder()).build());
		}

		/**
		 * Builds a {@link AutoscalingCapacity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoscalingCapacity build() {

			return new AutoscalingCapacity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoscalingCapacity}
	 */
	public static final JsonpDeserializer<AutoscalingCapacity> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoscalingCapacity::setupAutoscalingCapacityDeserializer, Builder::build);

	protected static void setupAutoscalingCapacityDeserializer(DelegatingDeserializer<AutoscalingCapacity.Builder> op) {

		op.add(Builder::node, AutoscalingResources._DESERIALIZER, "node");
		op.add(Builder::total, AutoscalingResources._DESERIALIZER, "total");

	}

}
