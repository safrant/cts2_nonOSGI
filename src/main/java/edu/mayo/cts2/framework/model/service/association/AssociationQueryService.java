/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.service.association;

import edu.mayo.cts2.framework.model.core.CodeSystemVersionReference;
import edu.mayo.cts2.framework.model.core.SourceAndNotation;
import java.util.Collections;

/**
 * Class AssociationQueryService.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AssociationQueryService extends edu.mayo.cts2.framework.model.service.core.BaseQueryService 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _associations.
     */
    private String _associations;

    /**
     * Field _supportedCodeSystemVersionList.
     */
    private java.util.List<edu.mayo.cts2.framework.model.core.CodeSystemVersionReference> _supportedCodeSystemVersionList;

    /**
     * Field _supportedSourceAndNotationList.
     */
    private java.util.List<edu.mayo.cts2.framework.model.core.SourceAndNotation> _supportedSourceAndNotationList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AssociationQueryService() {
        super();
        this._supportedCodeSystemVersionList = new java.util.ArrayList<edu.mayo.cts2.framework.model.core.CodeSystemVersionReference>();
        this._supportedSourceAndNotationList = new java.util.ArrayList<edu.mayo.cts2.framework.model.core.SourceAndNotation>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSupportedCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedCodeSystemVersion(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference vSupportedCodeSystemVersion)
    throws IndexOutOfBoundsException {
        this._supportedCodeSystemVersionList.add(vSupportedCodeSystemVersion);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedCodeSystemVersion(
            final int index,
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference vSupportedCodeSystemVersion)
    throws IndexOutOfBoundsException {
        this._supportedCodeSystemVersionList.add(index, vSupportedCodeSystemVersion);
    }

    /**
     * 
     * 
     * @param vSupportedSourceAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSourceAndNotation(
            final edu.mayo.cts2.framework.model.core.SourceAndNotation vSupportedSourceAndNotation)
    throws IndexOutOfBoundsException {
        this._supportedSourceAndNotationList.add(vSupportedSourceAndNotation);
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSourceAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addSupportedSourceAndNotation(
            final int index,
            final edu.mayo.cts2.framework.model.core.SourceAndNotation vSupportedSourceAndNotation)
    throws IndexOutOfBoundsException {
        this._supportedSourceAndNotationList.add(index, vSupportedSourceAndNotation);
    }

    /**
     * Method enumerateSupportedCodeSystemVersion.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends edu.mayo.cts2.framework.model.core.CodeSystemVersionReference> enumerateSupportedCodeSystemVersion(
    ) {
        return java.util.Collections.enumeration(this._supportedCodeSystemVersionList);
    }

    /**
     * Method enumerateSupportedSourceAndNotation.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends edu.mayo.cts2.framework.model.core.SourceAndNotation> enumerateSupportedSourceAndNotation(
    ) {
        return java.util.Collections.enumeration(this._supportedSourceAndNotationList);
    }

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

        if (obj instanceof AssociationQueryService) {

            AssociationQueryService temp = (AssociationQueryService)obj;
            if (this._associations != null) {
                if (temp._associations == null) return false;
                if (!this._associations.equals(temp._associations)) 
                    return false;
            } else if (temp._associations != null)
                return false;
            if (this._supportedCodeSystemVersionList != null) {
                if (temp._supportedCodeSystemVersionList == null) return false;
                if (!this._supportedCodeSystemVersionList.equals(temp._supportedCodeSystemVersionList)) 
                    return false;
            } else if (temp._supportedCodeSystemVersionList != null)
                return false;
            if (this._supportedSourceAndNotationList != null) {
                if (temp._supportedSourceAndNotationList == null) return false;
                return this._supportedSourceAndNotationList.equals(temp._supportedSourceAndNotationList);
            } else return temp._supportedSourceAndNotationList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'associations'.
     * 
     * @return the value of field 'Associations'.
     */
    public String getAssociations(
    ) {
        return this._associations;
    }

    /**
     * Method getSupportedCodeSystemVersion.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.CodeSystemVersionReference
     * at the given index
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference getSupportedCodeSystemVersion(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedCodeSystemVersionList.size()) {
            throw new IndexOutOfBoundsException("getSupportedCodeSystemVersion: Index value '" + index + "' not in range [0.." + (this._supportedCodeSystemVersionList.size() - 1) + "]");
        }

        return _supportedCodeSystemVersionList.get(index);
    }

    /**
     * Method getSupportedCodeSystemVersion.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference[] getSupportedCodeSystemVersion(
    ) {
        edu.mayo.cts2.framework.model.core.CodeSystemVersionReference[] array = new edu.mayo.cts2.framework.model.core.CodeSystemVersionReference[0];
        return this._supportedCodeSystemVersionList.toArray(array);
    }

    /**
     * Method getSupportedCodeSystemVersionAsReference.Returns a
     * reference to '_supportedCodeSystemVersionList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<edu.mayo.cts2.framework.model.core.CodeSystemVersionReference> getSupportedCodeSystemVersionAsReference(
    ) {
        return this._supportedCodeSystemVersionList;
    }

    /**
     * Method getSupportedCodeSystemVersionCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedCodeSystemVersionCount(
    ) {
        return this._supportedCodeSystemVersionList.size();
    }

    /**
     * Method getSupportedSourceAndNotation.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.core.SourceAndNotation at the
     * given index
     */
    public edu.mayo.cts2.framework.model.core.SourceAndNotation getSupportedSourceAndNotation(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSourceAndNotationList.size()) {
            throw new IndexOutOfBoundsException("getSupportedSourceAndNotation: Index value '" + index + "' not in range [0.." + (this._supportedSourceAndNotationList.size() - 1) + "]");
        }

        return _supportedSourceAndNotationList.get(index);
    }

    /**
     * Method getSupportedSourceAndNotation.Returns the contents of
     * the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public edu.mayo.cts2.framework.model.core.SourceAndNotation[] getSupportedSourceAndNotation(
    ) {
        edu.mayo.cts2.framework.model.core.SourceAndNotation[] array = new edu.mayo.cts2.framework.model.core.SourceAndNotation[0];
        return this._supportedSourceAndNotationList.toArray(array);
    }

    /**
     * Method getSupportedSourceAndNotationAsReference.Returns a
     * reference to '_supportedSourceAndNotationList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<edu.mayo.cts2.framework.model.core.SourceAndNotation> getSupportedSourceAndNotationAsReference(
    ) {
        return this._supportedSourceAndNotationList;
    }

    /**
     * Method getSupportedSourceAndNotationCount.
     * 
     * @return the size of this collection
     */
    public int getSupportedSourceAndNotationCount(
    ) {
        return this._supportedSourceAndNotationList.size();
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
        if (_associations != null) {
           result = 37 * result + _associations.hashCode();
        }
        if (_supportedCodeSystemVersionList != null) {
           result = 37 * result + _supportedCodeSystemVersionList.hashCode();
        }
        if (_supportedSourceAndNotationList != null) {
           result = 37 * result + _supportedSourceAndNotationList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateSupportedCodeSystemVersion.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends edu.mayo.cts2.framework.model.core.CodeSystemVersionReference> iterateSupportedCodeSystemVersion(
    ) {
        return this._supportedCodeSystemVersionList.iterator();
    }

    /**
     * Method iterateSupportedSourceAndNotation.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends edu.mayo.cts2.framework.model.core.SourceAndNotation> iterateSupportedSourceAndNotation(
    ) {
        return this._supportedSourceAndNotationList.iterator();
    }

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
     */
    public void removeAllSupportedCodeSystemVersion(
    ) {
        this._supportedCodeSystemVersionList.clear();
    }

    /**
     */
    public void removeAllSupportedSourceAndNotation(
    ) {
        this._supportedSourceAndNotationList.clear();
    }

    /**
     * Method removeSupportedCodeSystemVersion.
     * 
     * @param vSupportedCodeSystemVersion
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedCodeSystemVersion(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference vSupportedCodeSystemVersion) {
        return _supportedCodeSystemVersionList.remove(vSupportedCodeSystemVersion);
    }

    /**
     * Method removeSupportedCodeSystemVersionAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public edu.mayo.cts2.framework.model.core.CodeSystemVersionReference removeSupportedCodeSystemVersionAt(
            final int index) {
        CodeSystemVersionReference obj = this._supportedCodeSystemVersionList.remove(index);
        return obj;
    }

    /**
     * Method removeSupportedSourceAndNotation.
     * 
     * @param vSupportedSourceAndNotation
     * @return true if the object was removed from the collection.
     */
    public boolean removeSupportedSourceAndNotation(
            final edu.mayo.cts2.framework.model.core.SourceAndNotation vSupportedSourceAndNotation) {
        return _supportedSourceAndNotationList.remove(vSupportedSourceAndNotation);
    }

    /**
     * Method removeSupportedSourceAndNotationAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public edu.mayo.cts2.framework.model.core.SourceAndNotation removeSupportedSourceAndNotationAt(
            final int index) {
        SourceAndNotation obj = this._supportedSourceAndNotationList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'associations'.
     * 
     * @param associations the value of field 'associations'.
     */
    public void setAssociations(
            final String associations) {
        this._associations = associations;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedCodeSystemVersion
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedCodeSystemVersion(
            final int index,
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference vSupportedCodeSystemVersion)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedCodeSystemVersionList.size()) {
            throw new IndexOutOfBoundsException("setSupportedCodeSystemVersion: Index value '" + index + "' not in range [0.." + (this._supportedCodeSystemVersionList.size() - 1) + "]");
        }

        this._supportedCodeSystemVersionList.set(index, vSupportedCodeSystemVersion);
    }

    /**
     * 
     * 
     * @param vSupportedCodeSystemVersionArray
     */
    public void setSupportedCodeSystemVersion(
            final edu.mayo.cts2.framework.model.core.CodeSystemVersionReference[] vSupportedCodeSystemVersionArray) {
        //-- copy array
        _supportedCodeSystemVersionList.clear();

        Collections.addAll(this._supportedCodeSystemVersionList, vSupportedCodeSystemVersionArray);
    }

    /**
     * Sets the value of '_supportedCodeSystemVersionList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedCodeSystemVersionList the Vector to copy.
     */
    public void setSupportedCodeSystemVersion(
            final java.util.List<edu.mayo.cts2.framework.model.core.CodeSystemVersionReference> vSupportedCodeSystemVersionList) {
        // copy vector
        this._supportedCodeSystemVersionList.clear();

        this._supportedCodeSystemVersionList.addAll(vSupportedCodeSystemVersionList);
    }

    /**
     * Sets the value of '_supportedCodeSystemVersionList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedCodeSystemVersionList the Vector to set.
     */
    public void setSupportedCodeSystemVersionAsReference(
            final java.util.List<edu.mayo.cts2.framework.model.core.CodeSystemVersionReference> supportedCodeSystemVersionList) {
        this._supportedCodeSystemVersionList = supportedCodeSystemVersionList;
    }

    /**
     * 
     * 
     * @param index
     * @param vSupportedSourceAndNotation
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setSupportedSourceAndNotation(
            final int index,
            final edu.mayo.cts2.framework.model.core.SourceAndNotation vSupportedSourceAndNotation)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._supportedSourceAndNotationList.size()) {
            throw new IndexOutOfBoundsException("setSupportedSourceAndNotation: Index value '" + index + "' not in range [0.." + (this._supportedSourceAndNotationList.size() - 1) + "]");
        }

        this._supportedSourceAndNotationList.set(index, vSupportedSourceAndNotation);
    }

    /**
     * 
     * 
     * @param vSupportedSourceAndNotationArray
     */
    public void setSupportedSourceAndNotation(
            final edu.mayo.cts2.framework.model.core.SourceAndNotation[] vSupportedSourceAndNotationArray) {
        //-- copy array
        _supportedSourceAndNotationList.clear();

        Collections.addAll(this._supportedSourceAndNotationList, vSupportedSourceAndNotationArray);
    }

    /**
     * Sets the value of '_supportedSourceAndNotationList' by
     * copying the given Vector. All elements will be checked for
     * type safety.
     * 
     * @param vSupportedSourceAndNotationList the Vector to copy.
     */
    public void setSupportedSourceAndNotation(
            final java.util.List<edu.mayo.cts2.framework.model.core.SourceAndNotation> vSupportedSourceAndNotationList) {
        // copy vector
        this._supportedSourceAndNotationList.clear();

        this._supportedSourceAndNotationList.addAll(vSupportedSourceAndNotationList);
    }

    /**
     * Sets the value of '_supportedSourceAndNotationList' by
     * setting it to the given Vector. No type checking is
     * performed.
     * @deprecated
     * 
     * @param supportedSourceAndNotationList the Vector to set.
     */
    public void setSupportedSourceAndNotationAsReference(
            final java.util.List<edu.mayo.cts2.framework.model.core.SourceAndNotation> supportedSourceAndNotationList) {
        this._supportedSourceAndNotationList = supportedSourceAndNotationList;
    }

    /**
     * Method unmarshalAssociationQueryService.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.service.association.AssociationQueryService
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
