/*
 * Copyright (c) 2015 Villu Ruusmann
 *
 * This file is part of Openscoring
 *
 * Openscoring is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Openscoring is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Openscoring.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.openscoring.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.jpmml.model.ToStringHelper;

@JsonInclude (
	value = JsonInclude.Include.NON_EMPTY
)
public class BatchModelResponse extends SimpleResponse {

	private List<ModelResponse> responses = null;


	public BatchModelResponse(){
	}

	@Override
	protected ToStringHelper toStringHelper(){
		return super.toStringHelper()
			.add("responses", getResponses());
	}

	public ModelResponse getResponse(int index){
		List<ModelResponse> responses = getResponses();

		return responses.get(index);
	}

	public List<ModelResponse> getResponses(){
		return this.responses;
	}

	public BatchModelResponse setResponses(List<ModelResponse> responses){
		this.responses = responses;

		return this;
	}
}