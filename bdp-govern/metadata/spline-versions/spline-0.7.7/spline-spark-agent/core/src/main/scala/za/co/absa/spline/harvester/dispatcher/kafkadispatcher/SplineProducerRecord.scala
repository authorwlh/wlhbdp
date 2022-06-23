/*
 * Copyright 2021 ABSA Group Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package za.co.absa.spline.harvester.dispatcher.kafkadispatcher

import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.header.Header

import java.util.UUID
import java.{lang => jl, util => ju}

class SplineProducerRecord(
  topic: String,
  recordId: UUID,
  recordContent: String,
  headers: Array[_ <: Header]
) extends ProducerRecord(
  topic,
  null,
  recordId.toString,
  recordContent,
  ju.Arrays.asList(headers: _*): jl.Iterable[Header]
)
