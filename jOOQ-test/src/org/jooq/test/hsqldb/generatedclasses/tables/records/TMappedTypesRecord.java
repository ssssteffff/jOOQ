/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class TMappedTypesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TMappedTypesRecord> {

	private static final long serialVersionUID = 1171355220;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setJavaUtilDate(java.util.Date value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.JAVA_UTIL_DATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.util.Date getJavaUtilDate() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.JAVA_UTIL_DATE);
	}

	/**
	 * An uncommented item
	 */
	public void setJavaUtilCalendar(java.util.GregorianCalendar value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.JAVA_UTIL_CALENDAR, value);
	}

	/**
	 * An uncommented item
	 */
	public java.util.GregorianCalendar getJavaUtilCalendar() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.JAVA_UTIL_CALENDAR);
	}

	/**
	 * An uncommented item
	 */
	public void setDefaultEnumOrdinal(org.jooq.test._.converters.OrdinalEnum value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.DEFAULT_ENUM_ORDINAL, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test._.converters.OrdinalEnum getDefaultEnumOrdinal() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.DEFAULT_ENUM_ORDINAL);
	}

	/**
	 * An uncommented item
	 */
	public void setDefaultEnumName(org.jooq.test._.converters.StringEnum value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.DEFAULT_ENUM_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test._.converters.StringEnum getDefaultEnumName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.DEFAULT_ENUM_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setCustomEnumNumeric(org.jooq.test._.converters.OrdinalEnum1 value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.CUSTOM_ENUM_NUMERIC, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test._.converters.OrdinalEnum1 getCustomEnumNumeric() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.CUSTOM_ENUM_NUMERIC);
	}

	/**
	 * An uncommented item
	 */
	public void setCustomEnumText(org.jooq.test._.converters.StringEnum1 value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.CUSTOM_ENUM_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test._.converters.StringEnum1 getCustomEnumText() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES.CUSTOM_ENUM_TEXT);
	}

	/**
	 * Create a detached TMappedTypesRecord
	 */
	public TMappedTypesRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TMappedTypes.T_MAPPED_TYPES);
	}
}
