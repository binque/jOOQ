/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class UInvalidType extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UInvalidTypeRecord> {

	private static final long serialVersionUID = 1975558376;

	/**
	 * The singleton instance of <code>TEST.U_INVALID_TYPE</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.udt.UInvalidType U_INVALID_TYPE = new org.jooq.test.oracle.generatedclasses.test.udt.UInvalidType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.UInvalidTypeRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.udt.records.UInvalidTypeRecord.class;
	}

	/**
	 * No further instances allowed
	 */
	private UInvalidType() {
		super("U_INVALID_TYPE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		// Initialise data type
		getDataType();
	}
}
