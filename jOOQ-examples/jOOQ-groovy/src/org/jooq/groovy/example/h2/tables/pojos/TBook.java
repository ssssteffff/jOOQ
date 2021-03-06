/**
 * This class is generated by jOOQ
 */
package org.jooq.groovy.example.h2.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook implements java.io.Serializable {

	private static final long serialVersionUID = -1404736907;

	private java.lang.Integer  id;
	private java.lang.Integer  authorId;
	private java.lang.Integer  coAuthorId;
	private java.lang.Integer  detailsId;
	private java.lang.String   title;
	private java.lang.Integer  publishedIn;
	private java.lang.Integer  languageId;
	private java.lang.String   contentText;
	private byte[]             contentPdf;
	private java.lang.Integer  recVersion;
	private java.sql.Timestamp recTimestamp;

	public TBook() {}

	public TBook(
		java.lang.Integer  id,
		java.lang.Integer  authorId,
		java.lang.Integer  coAuthorId,
		java.lang.Integer  detailsId,
		java.lang.String   title,
		java.lang.Integer  publishedIn,
		java.lang.Integer  languageId,
		java.lang.String   contentText,
		byte[]             contentPdf,
		java.lang.Integer  recVersion,
		java.sql.Timestamp recTimestamp
	) {
		this.id = id;
		this.authorId = authorId;
		this.coAuthorId = coAuthorId;
		this.detailsId = detailsId;
		this.title = title;
		this.publishedIn = publishedIn;
		this.languageId = languageId;
		this.contentText = contentText;
		this.contentPdf = contentPdf;
		this.recVersion = recVersion;
		this.recTimestamp = recTimestamp;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(java.lang.Integer authorId) {
		this.authorId = authorId;
	}

	public java.lang.Integer getCoAuthorId() {
		return this.coAuthorId;
	}

	public void setCoAuthorId(java.lang.Integer coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	public java.lang.Integer getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(java.lang.Integer detailsId) {
		this.detailsId = detailsId;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.Integer getPublishedIn() {
		return this.publishedIn;
	}

	public void setPublishedIn(java.lang.Integer publishedIn) {
		this.publishedIn = publishedIn;
	}

	public java.lang.Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(java.lang.Integer languageId) {
		this.languageId = languageId;
	}

	public java.lang.String getContentText() {
		return this.contentText;
	}

	public void setContentText(java.lang.String contentText) {
		this.contentText = contentText;
	}

	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	public void setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
	}

	public java.lang.Integer getRecVersion() {
		return this.recVersion;
	}

	public void setRecVersion(java.lang.Integer recVersion) {
		this.recVersion = recVersion;
	}

	public java.sql.Timestamp getRecTimestamp() {
		return this.recTimestamp;
	}

	public void setRecTimestamp(java.sql.Timestamp recTimestamp) {
		this.recTimestamp = recTimestamp;
	}
}
