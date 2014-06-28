package com.paypal.dt.hackathon.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Cust_Sentiment_Tab")
public class CustSentiment {

	public CustSentiment() {
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Email_Id")
	private String emailId;

	@Column(name = "Type")
	private String type;

	@Column(name = "Is_Positive_Flag")
	private String isPositiveFlag;

	@Column(name = "Merch_Id")
	private String merchantId;

	@Column(name = "Prod_Id")
	private String prodId;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;

	public CustSentiment(String emailId, String type, String isPositiveFlag,
			String merchantId, String prodId, Date date) {
		this.emailId = emailId;
		this.type = type;
		this.isPositiveFlag = isPositiveFlag;
		this.merchantId = merchantId;
		this.prodId = prodId;
		this.date = date;
	}

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the emailId
	 */
	public final String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public final void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the type
	 */
	public final String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public final void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the isPositiveFlag
	 */
	public final String getIsPositiveFlag() {
		return isPositiveFlag;
	}

	/**
	 * @param isPositiveFlag
	 *            the isPositiveFlag to set
	 */
	public final void setIsPositiveFlag(String isPositiveFlag) {
		this.isPositiveFlag = isPositiveFlag;
	}

	/**
	 * @return the merchantId
	 */
	public final String getMerchantId() {
		return merchantId;
	}

	/**
	 * @param merchantId
	 *            the merchantId to set
	 */
	public final void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * @return the prodId
	 */
	public final String getProdId() {
		return prodId;
	}

	/**
	 * @param prodId
	 *            the prodId to set
	 */
	public final void setProdId(String prodId) {
		this.prodId = prodId;
	}

	/**
	 * @return the date
	 */
	public final Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public final void setDate(Date date) {
		this.date = date;
	}

}
