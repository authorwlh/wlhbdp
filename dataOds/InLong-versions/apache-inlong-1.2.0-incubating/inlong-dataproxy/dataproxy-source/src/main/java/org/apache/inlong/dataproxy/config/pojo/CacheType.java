/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.dataproxy.config.pojo;

/**
 * cache cluster type
 */
public enum CacheType {

    TUBE("tube"), KAFKA("kafka"), PULSAR("pulsar"), N("n");

    private final String value;

    /**
     * 
     * Constructor
     * 
     * @param value
     */
    private CacheType(String value) {
        this.value = value;
    }

    /**
     * value
     *
     * @return
     */
    public String value() {
        return this.value;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return this.name() + ":" + this.value;
    }

    /**
     * convert
     *
     * @param  value
     * @return
     */
    public static CacheType convert(String value) {
        for (CacheType v : values()) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        return N;
    }
}
