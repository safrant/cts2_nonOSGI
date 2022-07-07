/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.core;

import edu.mayo.cts2.framework.model.core.OpaqueData;

/**
 * Class UpdatedChangeInstructions.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class UpdatedChangeInstructions extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _changeInstructions.
     */
    private OpaqueData _changeInstructions;


      //----------------/
     //- Constructors -/
    //----------------/

    public UpdatedChangeInstructions() {
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

        if (obj instanceof UpdatedChangeInstructions) {

            UpdatedChangeInstructions temp = (UpdatedChangeInstructions)obj;
            if (this._changeInstructions != null) {
                if (temp._changeInstructions == null) return false;
                return this._changeInstructions.equals(temp._changeInstructions);
            } else return temp._changeInstructions == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeInstructions'.
     * 
     * @return the value of field 'ChangeInstructions'.
     */
    public OpaqueData getChangeInstructions(
    ) {
        return this._changeInstructions;
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
        if (_changeInstructions != null) {
           result = 37 * result + _changeInstructions.hashCode();
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
     * Sets the value of field 'changeInstructions'.
     * 
     * @param changeInstructions the value of field
     * 'changeInstructions'.
     */
    public void setChangeInstructions(
            final OpaqueData changeInstructions) {
        this._changeInstructions = changeInstructions;
    }

    /**
     * Method unmarshalUpdatedChangeInstructions.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.core.UpdatedChangeInstructions
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
