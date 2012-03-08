/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PurchaseOrderHeader", schema = "Purchasing")
public class PurchaseOrderHeader implements java.io.Serializable {

	private static final long serialVersionUID = -1344621084;

	private java.lang.Integer    PurchaseOrderID;
	private java.lang.Byte       RevisionNumber;
	private java.lang.Byte       Status;
	private java.lang.Integer    EmployeeID;
	private java.lang.Integer    VendorID;
	private java.lang.Integer    ShipMethodID;
	private java.sql.Timestamp   OrderDate;
	private java.sql.Timestamp   ShipDate;
	private java.math.BigDecimal SubTotal;
	private java.math.BigDecimal TaxAmt;
	private java.math.BigDecimal Freight;
	private java.math.BigDecimal TotalDue;
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "PurchaseOrderID", unique = true, nullable = false)
	public java.lang.Integer getPurchaseOrderID() {
		return this.PurchaseOrderID;
	}

	public void setPurchaseOrderID(java.lang.Integer PurchaseOrderID) {
		this.PurchaseOrderID = PurchaseOrderID;
	}

	@javax.persistence.Column(name = "RevisionNumber", nullable = false)
	public java.lang.Byte getRevisionNumber() {
		return this.RevisionNumber;
	}

	public void setRevisionNumber(java.lang.Byte RevisionNumber) {
		this.RevisionNumber = RevisionNumber;
	}

	@javax.persistence.Column(name = "Status", nullable = false)
	public java.lang.Byte getStatus() {
		return this.Status;
	}

	public void setStatus(java.lang.Byte Status) {
		this.Status = Status;
	}

	@javax.persistence.Column(name = "EmployeeID", nullable = false)
	public java.lang.Integer getEmployeeID() {
		return this.EmployeeID;
	}

	public void setEmployeeID(java.lang.Integer EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	@javax.persistence.Column(name = "VendorID", nullable = false)
	public java.lang.Integer getVendorID() {
		return this.VendorID;
	}

	public void setVendorID(java.lang.Integer VendorID) {
		this.VendorID = VendorID;
	}

	@javax.persistence.Column(name = "ShipMethodID", nullable = false)
	public java.lang.Integer getShipMethodID() {
		return this.ShipMethodID;
	}

	public void setShipMethodID(java.lang.Integer ShipMethodID) {
		this.ShipMethodID = ShipMethodID;
	}

	@javax.persistence.Column(name = "OrderDate", nullable = false)
	public java.sql.Timestamp getOrderDate() {
		return this.OrderDate;
	}

	public void setOrderDate(java.sql.Timestamp OrderDate) {
		this.OrderDate = OrderDate;
	}

	@javax.persistence.Column(name = "ShipDate")
	public java.sql.Timestamp getShipDate() {
		return this.ShipDate;
	}

	public void setShipDate(java.sql.Timestamp ShipDate) {
		this.ShipDate = ShipDate;
	}

	@javax.persistence.Column(name = "SubTotal", nullable = false)
	public java.math.BigDecimal getSubTotal() {
		return this.SubTotal;
	}

	public void setSubTotal(java.math.BigDecimal SubTotal) {
		this.SubTotal = SubTotal;
	}

	@javax.persistence.Column(name = "TaxAmt", nullable = false)
	public java.math.BigDecimal getTaxAmt() {
		return this.TaxAmt;
	}

	public void setTaxAmt(java.math.BigDecimal TaxAmt) {
		this.TaxAmt = TaxAmt;
	}

	@javax.persistence.Column(name = "Freight", nullable = false)
	public java.math.BigDecimal getFreight() {
		return this.Freight;
	}

	public void setFreight(java.math.BigDecimal Freight) {
		this.Freight = Freight;
	}

	@javax.persistence.Column(name = "TotalDue", nullable = false)
	public java.math.BigDecimal getTotalDue() {
		return this.TotalDue;
	}

	public void setTotalDue(java.math.BigDecimal TotalDue) {
		this.TotalDue = TotalDue;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}