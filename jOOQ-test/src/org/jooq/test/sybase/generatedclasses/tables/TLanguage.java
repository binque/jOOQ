/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TLanguage extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 824824036;

	/**
	 * The singleton instance of <code>DBA.t_language</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.sybase.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The column <code>DBA.t_language.cd</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("cd", org.jooq.impl.SQLDataType.CHAR.length(2), this);

	/**
	 * The column <code>DBA.t_language.description</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>DBA.t_language.description_english</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>DBA.t_language.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>DBA.t_language</code> table reference
	 */
	public TLanguage() {
		super("t_language", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * Create an aliased <code>DBA.t_language</code> table reference
	 */
	public TLanguage(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord> getPrimaryKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_LANGUAGE__PK_T_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_LANGUAGE__PK_T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TLanguage as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TLanguage(alias);
	}
}
