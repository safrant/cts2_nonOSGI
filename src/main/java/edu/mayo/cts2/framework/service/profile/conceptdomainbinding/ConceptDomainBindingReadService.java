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
package edu.mayo.cts2.framework.service.profile.conceptdomainbinding;

import edu.mayo.cts2.framework.model.conceptdomainbinding.ConceptDomainBinding;
import edu.mayo.cts2.framework.model.core.VersionTagReference;
import edu.mayo.cts2.framework.model.extension.LocalIdConceptDomainBinding;
import edu.mayo.cts2.framework.model.service.core.NameOrURI;
import edu.mayo.cts2.framework.model.service.core.types.StructuralProfile;
import edu.mayo.cts2.framework.service.profile.Cts2Profile;
import edu.mayo.cts2.framework.service.profile.ReadService;
import edu.mayo.cts2.framework.service.profile.StructuralConformance;
import edu.mayo.cts2.framework.service.profile.conceptdomainbinding.name.ConceptDomainBindingReadId;
import java.util.List;

/**
 * The Interface ConceptDomainBindingReadService.
 *
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
@StructuralConformance(StructuralProfile.SP_CONCEPT_DOMAIN_BINDING)
public interface ConceptDomainBindingReadService extends
		ReadService<LocalIdConceptDomainBinding, ConceptDomainBindingReadId>, Cts2Profile {

  /**
   * Exists.
   *
   * @param conceptDomain the concept domain
   * @param valueSet the value set
   * @param applicableContext the applicable context
   * @param bindingQualifier the binding qualifier
   * @return true, if successful
   */
  public boolean exists(
      final NameOrURI conceptDomain,
      final NameOrURI valueSet,
      final NameOrURI applicableContext,
      final NameOrURI bindingQualifier
  );
  
  /**
   * Read.
   *
   * @param conceptDomain the concept domain
   * @param valueSet the value set
   * @param applicableContext the applicable context
   * @param bindingQualifier the binding qualifier
   * @return the concept domain binding
   */
  public ConceptDomainBinding read(
      final NameOrURI conceptDomain,
      final NameOrURI valueSet,
      final NameOrURI applicableContext,
      final NameOrURI bindingQualifier);
 
  /**
   * Gets the supported tag.
   *
   * @return the supported tag
   */
  public List<VersionTagReference> getSupportedTag();

}
