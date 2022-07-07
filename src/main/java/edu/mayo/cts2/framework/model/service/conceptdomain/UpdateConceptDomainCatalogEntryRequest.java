/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.conceptdomain;

/**
 * Class UpdateConceptDomainCatalogEntryRequest.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdateConceptDomainCatalogEntryRequest extends edu.mayo.cts2.framework.model.service.core.UpdateAbstractResourceDescription 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _updatedDefiningEntity.
     */
    private edu.mayo.cts2.framework.model.service.conceptdomain.UpdatedDefiningEntity _updatedDefiningEntity;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdateConceptDomainCatalogEntryRequest() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Overrides the java.lang.Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final Object obj) {
        if ( this == obj )
            return true;

        if (!super.equals(obj))
            return false;

        if (obj instanceof UpdateConceptDomainCatalogEntryRequest) {

            UpdateConceptDomainCatalogEntryRequest temp = (UpdateConceptDomainCatalogEntryRequest)obj;
            if (this._updatedDefiningEntity != null) {
                if (temp._updatedDefiningEntity == null) return false;
                return this._updatedDefiningEntity.equals(temp._updatedDefiningEntity);
            } else return temp._updatedDefiningEntity == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'updatedDefiningEntity'.
     * 
     * @return the value of field 'UpdatedDefiningEntity'.
     */
    public edu.mayo.cts2.framework.model.service.conceptdomain.UpdatedDefiningEntity getUpdatedDefiningEntity(
    ) {
        return this._updatedDefiningEntity;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = super.hashCode();

        long tmp;
        if (_updatedDefiningEntity != null) {
           result = 37 * result + _updatedDefiningEntity.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */

    /**
     * Sets the value of field 'updatedDefiningEntity'.
     * 
     * @param updatedDefiningEntity the value of field
     * 'updatedDefiningEntity'.
     */
    public void setUpdatedDefiningEntity(
            final edu.mayo.cts2.framework.model.service.conceptdomain.UpdatedDefiningEntity updatedDefiningEntity) {
        this._updatedDefiningEntity = updatedDefiningEntity;
    }

    /**
     * Method unmarshalUpdateConceptDomainCatalogEntryRequest.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.conceptdomain.UpdateConceptDomainCatalogEntryRequest
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
