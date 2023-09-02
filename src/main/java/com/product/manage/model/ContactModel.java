package com.product.manage.model;

public class ContactModel {
	private int contactId;
	private String contactType;
	private String value;

	public ContactModel() {
		super();
	}

	public ContactModel(int contactId, String contactType, String value) {
		super();
		this.contactId = contactId;
		this.contactType = contactType;
		this.value = value;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ContactModel [contactId=" + contactId + ", contactType=" + contactType + ", value=" + value + "]";
	}

}
