/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaweb.employeerostering.gwtui.client.gwtjackson;

import java.time.LocalDateTime;

import com.github.nmorel.gwtjackson.client.JsonDeserializationContext;
import com.github.nmorel.gwtjackson.client.JsonDeserializer;
import com.github.nmorel.gwtjackson.client.JsonDeserializerParameters;
import com.github.nmorel.gwtjackson.client.stream.JsonReader;

public class LocalDateTimeJsonDeserializer extends JsonDeserializer<LocalDateTime> {

    @Override
    protected LocalDateTime doDeserialize(JsonReader reader, JsonDeserializationContext ctx, JsonDeserializerParameters params) {
        String text = reader.nextString();
        // TODO the super source of DateTimeFormatter is broken
//        return LocalDateTime.parse(text, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return LocalDateTime.parse(text);
    }

}
