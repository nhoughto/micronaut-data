/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.data.tck.repositories;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.data.tck.entities.Sale;
import io.micronaut.data.tck.entities.SaleDTO;

import java.util.Map;

public interface SaleRepository extends CrudRepository<Sale, Long> {

    SaleDTO getById(Long id);

    void updateData(@Id Long id, @Parameter("data") Map<String, String> data);

}
