/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package edu.mayo.cts2.framework.model.map;

import edu.mayo.cts2.framework.model.core.Directory;
import java.util.Collections;

/**
 * A directory summarizing all or some of the MapCatalogEntries
 * known to the service.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class MapCatalogEntryDirectory extends Directory
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _entryList.
     */
    private java.util.List<MapCatalogEntrySummary> _entryList;


      //----------------/
     //- Constructors -/
    //----------------/

    public MapCatalogEntryDirectory() {
        super();
        this._entryList = new java.util.ArrayList<MapCatalogEntrySummary>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEntry
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final MapCatalogEntrySummary vEntry)
    throws IndexOutOfBoundsException {
        this._entryList.add(vEntry);
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEntry(
            final int index,
            final MapCatalogEntrySummary vEntry)
    throws IndexOutOfBoundsException {
        this._entryList.add(index, vEntry);
    }

    /**
     * Method enumerateEntry.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends MapCatalogEntrySummary> enumerateEntry(
    ) {
        return java.util.Collections.enumeration(this._entryList);
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

        if (obj instanceof MapCatalogEntryDirectory) {

            MapCatalogEntryDirectory temp = (MapCatalogEntryDirectory)obj;
            if (this._entryList != null) {
                if (temp._entryList == null) return false;
                return this._entryList.equals(temp._entryList);
            } else return temp._entryList == null;
        }
        return false;
    }

    /**
     * Method getEntry.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * edu.mayo.cts2.framework.model.map.MapCatalogEntrySummary at
     * the given index
     */
    public MapCatalogEntrySummary getEntry(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("getEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }

        return _entryList.get(index);
    }

    /**
     * Method getEntry.Returns the contents of the collection in an
     * Array.  <p>Note:  Just in case the collection contents are
     * changing in another thread, we pass a 0-length Array of the
     * correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public MapCatalogEntrySummary[] getEntry(
    ) {
        MapCatalogEntrySummary[] array = new MapCatalogEntrySummary[0];
        return this._entryList.toArray(array);
    }

    /**
     * Method getEntryAsReference.Returns a reference to
     * '_entryList'. No type checking is performed on any
     * modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<MapCatalogEntrySummary> getEntryAsReference(
    ) {
        return this._entryList;
    }

    /**
     * Method getEntryCount.
     * 
     * @return the size of this collection
     */
    public int getEntryCount(
    ) {
        return this._entryList.size();
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
        if (_entryList != null) {
           result = 37 * result + _entryList.hashCode();
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */

    /**
     * Method iterateEntry.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends MapCatalogEntrySummary> iterateEntry(
    ) {
        return this._entryList.iterator();
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
    public void removeAllEntry(
    ) {
        this._entryList.clear();
    }

    /**
     * Method removeEntry.
     * 
     * @param vEntry
     * @return true if the object was removed from the collection.
     */
    public boolean removeEntry(
            final MapCatalogEntrySummary vEntry) {
        return _entryList.remove(vEntry);
    }

    /**
     * Method removeEntryAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public MapCatalogEntrySummary removeEntryAt(
            final int index) {
        MapCatalogEntrySummary obj = this._entryList.remove(index);
        return obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEntry
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEntry(
            final int index,
            final MapCatalogEntrySummary vEntry)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._entryList.size()) {
            throw new IndexOutOfBoundsException("setEntry: Index value '" + index + "' not in range [0.." + (this._entryList.size() - 1) + "]");
        }

        this._entryList.set(index, vEntry);
    }

    /**
     * 
     * 
     * @param vEntryArray
     */
    public void setEntry(
            final MapCatalogEntrySummary[] vEntryArray) {
        //-- copy array
        _entryList.clear();

        Collections.addAll(this._entryList, vEntryArray);
    }

    /**
     * Sets the value of '_entryList' by copying the given Vector.
     * All elements will be checked for type safety.
     * 
     * @param vEntryList the Vector to copy.
     */
    public void setEntry(
            final java.util.List<MapCatalogEntrySummary> vEntryList) {
        // copy vector
        this._entryList.clear();

        this._entryList.addAll(vEntryList);
    }

    /**
     * Sets the value of '_entryList' by setting it to the given
     * Vector. No type checking is performed.
     * @deprecated
     * 
     * @param entryList the Vector to set.
     */
    public void setEntryAsReference(
            final java.util.List<MapCatalogEntrySummary> entryList) {
        this._entryList = entryList;
    }

    /**
     * Method unmarshalMapCatalogEntryDirectory.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * edu.mayo.cts2.framework.model.map.MapCatalogEntryDirectory
     */

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */

}
