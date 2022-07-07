/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.updates;

import java.util.Collections;

/**
 * An ordered collection of changes that, when applied, will
 * transform a service instance from one consistent state to
 *  another. A ChangeSet is viewed as an atomic unit of change -
 * either all of the Changeable elements in a change set will
 *  be applied or none of them will be applied. It is anticipated
 * that service implementations will provide a mechanism by which
 * it can
 *  apply local business rules to the validation and application of
 * change sets. These rules may include the option to selectively
 * apply,
 *  reject, modify or ignore the elements of change sets as they
 * arrive. In this case, it is up to the developers of the business
 * rules to
 *  determine what constitutes a "complete" change set that can be
 * applied.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ChangeSet extends edu.mayo.cts2.framework.model.BaseCts2ModelObject 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _state.
     */
    private edu.mayo.cts2.framework.model.core.types.FinalizableState _state = edu.mayo.cts2.framework.model.core.types.FinalizableState.fromValue("FINAL");

    /**
     * a globally unique identifier that signifies this particular
     * change set
     */
    private String _changeSetURI;

    /**
     * the date and time that the change set was initially created
     */
    private java.util.Date _creationDate;

    /**
     * the date and time that this set of changes became (or should
     * become) effective from the perspective of the authors. This
     * parameter enables history queries from both the perspective
     * of the service
     *  ("What did the service return on July 1") and the
     * perspective of the resource author ("What would the state of
     * the terminology have been on July 1 had it been loaded prior
     * to that date and not been locally modified?").
     *  
     */
    private java.util.Date _officialEffectiveDate;

    /**
     * the date and time that this change set was finalized (state
     * = FINAL). Once finalized, a change set cannot be further
     * modified.
     */
    private java.util.Date _closeDate;

    /**
     * the number of Changeable members in the set
     */
    private Long _entryCount;

    /**
     * Field _changeSetElementGroup.
     */
    private edu.mayo.cts2.framework.model.core.ChangeSetElementGroup _changeSetElementGroup;

    /**
     * Field _memberList.
     */
    private java.util.List<edu.mayo.cts2.framework.model.updates.ChangeableResource> _memberList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ChangeSet() {
        super();
        setState(edu.mayo.cts2.framework.model.core.types.FinalizableState.fromValue("FINAL"));
        this._memberList = new java.util.ArrayList<edu.mayo.cts2.framework.model.updates.ChangeableResource>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMember(
            final edu.mayo.cts2.framework.model.updates.ChangeableResource vMember)
    throws IndexOutOfBoundsException {
        this._memberList.add(vMember);
    }

    /**
     * 
     * 
     * @param index
     * @param vMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addMember(
            final int index,
            final edu.mayo.cts2.framework.model.updates.ChangeableResource vMember)
    throws IndexOutOfBoundsException {
        this._memberList.add(index, vMember);
    }

    /**
     * Method enumerateMember.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends edu.mayo.cts2.framework.model.updates.ChangeableResource> enumerateMember(
    ) {
        return java.util.Collections.enumeration(this._memberList);
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

        if (obj instanceof ChangeSet) {

            ChangeSet temp = (ChangeSet)obj;
            if (this._state != null) {
                if (temp._state == null) return false;
                if (!this._state.equals(temp._state)) 
                    return false;
            } else if (temp._state != null)
                return false;
            if (this._changeSetURI != null) {
                if (temp._changeSetURI == null) return false;
                if (!this._changeSetURI.equals(temp._changeSetURI)) 
                    return false;
            } else if (temp._changeSetURI != null)
                return false;
            if (this._creationDate != null) {
                if (temp._creationDate == null) return false;
                if (!this._creationDate.equals(temp._creationDate)) 
                    return false;
            } else if (temp._creationDate != null)
                return false;
            if (this._officialEffectiveDate != null) {
                if (temp._officialEffectiveDate == null) return false;
                if (!this._officialEffectiveDate.equals(temp._officialEffectiveDate)) 
                    return false;
            } else if (temp._officialEffectiveDate != null)
                return false;
            if (this._closeDate != null) {
                if (temp._closeDate == null) return false;
                if (!this._closeDate.equals(temp._closeDate)) 
                    return false;
            } else if (temp._closeDate != null)
                return false;
            if (this._entryCount != null) {
                if (temp._entryCount == null) return false;
                if (!this._entryCount.equals(temp._entryCount)) 
                    return false;
            } else if (temp._entryCount != null)
                return false;
            if (this._changeSetElementGroup != null) {
                if (temp._changeSetElementGroup == null) return false;
                if (!this._changeSetElementGroup.equals(temp._changeSetElementGroup)) 
                    return false;
            } else if (temp._changeSetElementGroup != null)
                return false;
            if (this._memberList != null) {
                if (temp._memberList == null) return false;
                return this._memberList.equals(temp._memberList);
            } else return temp._memberList == null;
        }
        return false;
    }

    /**
     * Returns the value of field 'changeSetElementGroup'.
     * 
     * @return the value of field 'ChangeSetElementGroup'.
     */
    public edu.mayo.cts2.framework.model.core.ChangeSetElementGroup getChangeSetElementGroup(
    ) {
        return this._changeSetElementGroup;
    }

    /**
     * Returns the value of field 'changeSetURI'. The field
     * 'changeSetURI' has the following description: a globally
     * unique identifier that signifies this particular change set
     * 
     * @return the value of field 'ChangeSetURI'.
     */
    public String getChangeSetURI(
    ) {
        return this._changeSetURI;
    }

    /**
     * Returns the value of field 'closeDate'. The field
     * 'closeDate' has the following description: the date and time
     * that this change set was finalized (state = FINAL). Once
     * finalized, a change set cannot be further modified.
     * 
     * @return the value of field 'CloseDate'.
     */
    public java.util.Date getCloseDate(
    ) {
        return this._closeDate;
    }

    /**
     * Returns the value of field 'creationDate'. The field
     * 'creationDate' has the following description: the date and
     * time that the change set was initially created
     * 
     * @return the value of field 'CreationDate'.
     */
    public java.util.Date getCreationDate(
    ) {
        return this._creationDate;
    }

    /**
     * Returns the value of field 'entryCount'. The field
     * 'entryCount' has the following description: the number of
     * Changeable members in the set
     * 
     * @return the value of field 'EntryCount'.
     */
    public Long getEntryCount(
    ) {
        return this._entryCount;
    }

    /**
     * Method getMember.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.updates.ChangeableResource at
     * the given index
     */
    public edu.mayo.cts2.framework.model.updates.ChangeableResource getMember(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._memberList.size()) {
            throw new IndexOutOfBoundsException("getMember: Index value '" + index + "' not in range [0.." + (this._memberList.size() - 1) + "]");
        }

        return _memberList.get(index);
    }

    /**
     * Method getMember.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public edu.mayo.cts2.framework.model.updates.ChangeableResource[] getMember(
    ) {
        edu.mayo.cts2.framework.model.updates.ChangeableResource[] array = new edu.mayo.cts2.framework.model.updates.ChangeableResource[0];
        return this._memberList.toArray(array);
    }

    /**
     * Method getMemberAsReference.Returns a reference to
     * '_memberList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<edu.mayo.cts2.framework.model.updates.ChangeableResource> getMemberAsReference(
    ) {
        return this._memberList;
    }

    /**
     * Method getMemberCount.
     * 
     * @return the size of this collection
     */
    public int getMemberCount(
    ) {
        return this._memberList.size();
    }

    /**
     * Returns the value of field 'officialEffectiveDate'. The
     * field 'officialEffectiveDate' has the following description:
     * the date and time that this set of changes became (or should
     * become) effective from the perspective of the authors. This
     * parameter enables history queries from both the perspective
     * of the service
     *  ("What did the service return on July 1") and the
     * perspective of the resource author ("What would the state of
     * the terminology have been on July 1 had it been loaded prior
     * to that date and not been locally modified?").
     *  
     * 
     * @return the value of field 'OfficialEffectiveDate'.
     */
    public java.util.Date getOfficialEffectiveDate(
    ) {
        return this._officialEffectiveDate;
    }

    /**
     * Returns the value of field 'state'.
     * 
     * @return the value of field 'State'.
     */
    public edu.mayo.cts2.framework.model.core.types.FinalizableState getState(
    ) {
        return this._state;
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
        if (_state != null) {
           result = 37 * result + _state.hashCode();
        }
        if (_changeSetURI != null) {
           result = 37 * result + _changeSetURI.hashCode();
        }
        if (_creationDate != null) {
           result = 37 * result + _creationDate.hashCode();
        }
        if (_officialEffectiveDate != null) {
           result = 37 * result + _officialEffectiveDate.hashCode();
        }
        if (_closeDate != null) {
           result = 37 * result + _closeDate.hashCode();
        }
        if (_entryCount != null) {
           result = 37 * result + _entryCount.hashCode();
        }
        if (_changeSetElementGroup != null) {
           result = 37 * result + _changeSetElementGroup.hashCode();
        }
        if (_memberList != null) {
           result = 37 * result + _memberList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateMember.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends edu.mayo.cts2.framework.model.updates.ChangeableResource> iterateMember(
    ) {
        return this._memberList.iterator();
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
    public void removeAllMember(
    ) {
        this._memberList.clear();
    }

    /**
     * Method removeMember.
     * 
     * @param vMember
     * @return true if the object was removed from the collection.
     */
    public boolean removeMember(
            final edu.mayo.cts2.framework.model.updates.ChangeableResource vMember) {
        return _memberList.remove(vMember);
    }

    /**
     * Method removeMemberAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public edu.mayo.cts2.framework.model.updates.ChangeableResource removeMemberAt(
            final int index) {
        ChangeableResource obj = this._memberList.remove(index);
        return obj;
    }

    /**
     * Sets the value of field 'changeSetElementGroup'.
     * 
     * @param changeSetElementGroup the value of field
     * 'changeSetElementGroup'.
     */
    public void setChangeSetElementGroup(
            final edu.mayo.cts2.framework.model.core.ChangeSetElementGroup changeSetElementGroup) {
        this._changeSetElementGroup = changeSetElementGroup;
    }

    /**
     * Sets the value of field 'changeSetURI'. The field
     * 'changeSetURI' has the following description: a globally
     * unique identifier that signifies this particular change set
     * 
     * @param changeSetURI the value of field 'changeSetURI'.
     */
    public void setChangeSetURI(
            final String changeSetURI) {
        this._changeSetURI = changeSetURI;
    }

    /**
     * Sets the value of field 'closeDate'. The field 'closeDate'
     * has the following description: the date and time that this
     * change set was finalized (state = FINAL). Once finalized, a
     * change set cannot be further modified.
     * 
     * @param closeDate the value of field 'closeDate'.
     */
    public void setCloseDate(
            final java.util.Date closeDate) {
        this._closeDate = closeDate;
    }

    /**
     * Sets the value of field 'creationDate'. The field
     * 'creationDate' has the following description: the date and
     * time that the change set was initially created
     * 
     * @param creationDate the value of field 'creationDate'.
     */
    public void setCreationDate(
            final java.util.Date creationDate) {
        this._creationDate = creationDate;
    }

    /**
     * Sets the value of field 'entryCount'. The field 'entryCount'
     * has the following description: the number of Changeable
     * members in the set
     * 
     * @param entryCount the value of field 'entryCount'.
     */
    public void setEntryCount(
            final Long entryCount) {
        this._entryCount = entryCount;
    }

    /**
     * 
     * 
     * @param index
     * @param vMember
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setMember(
            final int index,
            final edu.mayo.cts2.framework.model.updates.ChangeableResource vMember)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._memberList.size()) {
            throw new IndexOutOfBoundsException("setMember: Index value '" + index + "' not in range [0.." + (this._memberList.size() - 1) + "]");
        }

        this._memberList.set(index, vMember);
    }

    /**
     * 
     * 
     * @param vMemberArray
     */
    public void setMember(
            final edu.mayo.cts2.framework.model.updates.ChangeableResource[] vMemberArray) {
        //-- copy array
        _memberList.clear();

        Collections.addAll(this._memberList, vMemberArray);
    }

    /**
     * Sets the value of '_memberList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vMemberList the Vector to copy.
     */
    public void setMember(
            final java.util.List<edu.mayo.cts2.framework.model.updates.ChangeableResource> vMemberList) {
        // copy vector
        this._memberList.clear();

        this._memberList.addAll(vMemberList);
    }

    /**
     * Sets the value of '_memberList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param memberList the Vector to set.
     */
    public void setMemberAsReference(
            final java.util.List<edu.mayo.cts2.framework.model.updates.ChangeableResource> memberList) {
        this._memberList = memberList;
    }

    /**
     * Sets the value of field 'officialEffectiveDate'. The field
     * 'officialEffectiveDate' has the following description: the
     * date and time that this set of changes became (or should
     * become) effective from the perspective of the authors. This
     * parameter enables history queries from both the perspective
     * of the service
     *  ("What did the service return on July 1") and the
     * perspective of the resource author ("What would the state of
     * the terminology have been on July 1 had it been loaded prior
     * to that date and not been locally modified?").
     *  
     * 
     * @param officialEffectiveDate the value of field
     * 'officialEffectiveDate'.
     */
    public void setOfficialEffectiveDate(
            final java.util.Date officialEffectiveDate) {
        this._officialEffectiveDate = officialEffectiveDate;
    }

    /**
     * Sets the value of field 'state'.
     * 
     * @param state the value of field 'state'.
     */
    public void setState(
            final edu.mayo.cts2.framework.model.core.types.FinalizableState state) {
        this._state = state;
    }

    /**
     * Method unmarshalChangeSet.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.updates.ChangeSet
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
