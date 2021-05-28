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

package co.elastic.clients.elasticsearch.experiments.inheritance.base;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpSerializationContext;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;

import javax.json.stream.JsonGenerator;
import java.util.Objects;

/**
 * An abstract base class
 */
public abstract class BaseClass implements ToJsonp {

    private final String baseField;

    public BaseClass(AbstractBuilder<?> builder) {
        this.baseField = Objects.requireNonNull(builder.baseField, "baseField");
    }

    public String baseField() {
        return this.baseField;
    }

    @Override
    public void toJsonp(JsonGenerator generator, JsonpSerializationContext params) {
        generator.writeStartObject();
        toJsonpInternal(generator, params);
        generator.writeEnd();
    }

    protected void toJsonpInternal(JsonGenerator generator, JsonpSerializationContext params) {
        generator.write("baseField", this.baseField);
    }

    //---------------------------------------------------------------------------------------------

    // This is class protected as it's only of interest to subclasses. Yet public members are visible
    // from the outside on public subclasses.
    protected abstract static class AbstractBuilder<T extends AbstractBuilder<T>> {

        private String baseField;

        public T baseField(String value) {
            this.baseField = value;
            return self();
        }

        protected abstract T self();
    }

    //---------------------------------------------------------------------------------------------

    protected static <T extends AbstractBuilder<T>> void setupBaseClassParser(DelegatingJsonpValueParser<T> op) {
        op.add(AbstractBuilder::baseField, JsonpValueParser.stringParser(), "baseField");
    }
}