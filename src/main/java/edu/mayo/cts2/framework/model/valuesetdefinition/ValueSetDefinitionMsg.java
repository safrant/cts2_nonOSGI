/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.valuesetdefinition;

/**
 * A ValueSetDefinition read from a service instance.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ValueSetDefinitionMsg extends edu.mayo.cts2.framework.model.core.Message 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _valueSetDefinition.
     */
    private edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinition _valueSetDefinition;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValueSetDefinitionMsg() {
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

        if (obj instanceof ValueSetDefinitionMsg) {

            ValueSetDefinitionMsg temp = (ValueSetDefinitionMsg)obj;
            if (this._valueSetDefinition != null) {
                if (temp._valueSetDefinition == null) return false;
                return this._valueSetDefinition.equals(temp._valueSetDefinition);
            } else return temp._valueSetDefinition == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'valueSetDefinition'.
     * 
     * @return the value of field 'ValueSetDefinition'.
     */
    public edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinition getValueSetDefinition(
    ) {
        return this._valueSetDefinition;
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
        if (_valueSetDefinition != null) {
           result = 37 * result + _valueSetDefinition.hashCode();
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
     * Sets the value of field 'valueSetDefinition'.
     * 
     * @param valueSetDefinition the value of field
     * 'valueSetDefinition'.
     */
    public void setValueSetDefinition(
            final edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinition valueSetDefinition) {
        this._valueSetDefinition = valueSetDefinition;
    }

    /**
     * Method unmarshalValueSetDefinitionMsg.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.valuesetdefinition.ValueSetDefinitionMsg
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
