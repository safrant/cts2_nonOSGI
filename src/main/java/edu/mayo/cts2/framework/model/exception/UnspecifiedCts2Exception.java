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
package edu.mayo.cts2.framework.model.exception;


import edu.mayo.cts2.framework.model.service.exception.CTS2Exception;
import edu.mayo.cts2.framework.model.util.ModelUtils;

/**
 * The Class UnspecifiedCts2Exception.
 *
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class UnspecifiedCts2Exception extends CTS2Exception  {

	private static final long serialVersionUID = -8567312912032789588L;
	
	public UnspecifiedCts2Exception(){
		super();
	}
	
	public UnspecifiedCts2Exception(String message){
		super();
		this.setCts2Message(ModelUtils.createOpaqueData(message));
	}

}
