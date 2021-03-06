/*
 * Copyright: (c) 2004-2011 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
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
package edu.mayo.cts2.framework.webapp.rest.view;

import edu.mayo.cts2.framework.service.core.constants.ModelAndViewInterface;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * The Class ModelNameAdjustingMappingJacksonJsonView.
 *
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class ModelNameAdjustingMappingJacksonJsonView extends MappingJackson2JsonView {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.view.json.MappingJacksonJsonView#filterModel(java.util.Map)
	 */
	@Override
	@SuppressWarnings( "unchecked" )
	protected Object filterModel(Map<String, Object> model) {
		
		Object filteredModel = super.filterModel(model);;
	
		if(filteredModel instanceof Map){

			@SuppressWarnings("rawtypes")
			Map filteredMap = (Map)filteredModel;
			
			@SuppressWarnings("rawtypes")
			Map adjustedFilteredMap = new HashMap();
			if(filteredMap.size() == 1 &&
					filteredMap.containsKey(ModelAndViewInterface.CTS2_MODEL_OBJECT)){
				
				Object value = filteredMap.get(ModelAndViewInterface.CTS2_MODEL_OBJECT);
				
				adjustedFilteredMap.put(value.getClass().getSimpleName(), value);
				
				return adjustedFilteredMap;
			}
		}
			
		return filteredModel;	
	}
}
