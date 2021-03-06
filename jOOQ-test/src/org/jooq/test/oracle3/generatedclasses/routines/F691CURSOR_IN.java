/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class F691CURSOR_IN extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.lang.Cloneable {

	private static final long serialVersionUID = 402851221;

	/**
	 * The parameter <code>F691CURSOR_IN.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>F691CURSOR_IN.C</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> C = createParameter("C", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * Create a new routine call instance
	 */
	public F691CURSOR_IN() {
		super("F691CURSOR_IN", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(C);
	}

	/**
	 * Set the <code>C</code> parameter IN value to the routine
	 */
	public void setC(org.jooq.Result<org.jooq.Record> value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.F691CURSOR_IN.C, value);
	}

	/**
	 * Set the <code>C</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setC(org.jooq.Field<org.jooq.Result<org.jooq.Record>> field) {
		setField(C, field);
	}
}
