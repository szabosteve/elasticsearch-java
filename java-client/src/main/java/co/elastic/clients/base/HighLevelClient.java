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

package co.elastic.clients.base;

import co.elastic.clients.json.JsonpValueParser;
import org.elasticsearch.client.RequestOptions;

import javax.annotation.Nullable;

public abstract class HighLevelClient<Self extends HighLevelClient<Self>> {

    protected final Transport transport;

    @Nullable
    protected final RequestOptions requestOptions;

    protected HighLevelClient(Transport transport, @Nullable RequestOptions requestOptions) {
        this.transport = transport;
        this.requestOptions = requestOptions;
    }

    /**
     * Creates a new client with some request options
     */
    public abstract Self withRequestOptions(@Nullable RequestOptions requestOptions);

    @Nullable
    public final RequestOptions requestOptions() {
        return this.requestOptions;
    }

    protected <T> JsonpValueParser<T> getDeserializer(Class<T> clazz) {
        return null;
    }
}