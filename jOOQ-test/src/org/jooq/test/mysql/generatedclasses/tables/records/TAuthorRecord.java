/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;


import java.sql.Date;

import org.jooq.Result;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.TAuthor;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
public class TAuthorRecord extends UpdatableRecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TAuthor.ID, value);
	}

	/**
	 * The author ID
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TAuthor.ID);
	}

	/**
	 * The author's first name
	 */
	public void setFirstName(String value) {
		setValue(TAuthor.FIRST_NAME, value);
	}

	/**
	 * The author's first name
	 */
	public String getFirstName() {
		return getValue(TAuthor.FIRST_NAME);
	}

	/**
	 * The author's last name
	 */
	public void setLastName(String value) {
		setValue(TAuthor.LAST_NAME, value);
	}

	/**
	 * The author's last name
	 */
	public String getLastName() {
		return getValue(TAuthor.LAST_NAME);
	}

	/**
	 * The author's date of birth
	 */
	public void setDateOfBirth(Date value) {
		setValue(TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * The author's date of birth
	 */
	public Date getDateOfBirth() {
		return getValue(TAuthor.DATE_OF_BIRTH);
	}

	/**
	 * The author's year of birth
	 */
	public void setYearOfBirth(Integer value) {
		setValue(TAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * The author's year of birth
	 */
	public Integer getYearOfBirth() {
		return getValue(TAuthor.YEAR_OF_BIRTH);
	}

	public TAuthorRecord(Result result) {
		super(result, TAuthor.T_AUTHOR);
	}
}
