package com.product.manage.model;

import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class CustomerModel {
	private int customerId;
	@NotBlank(message="Firstname should not be null")
	private String firstName;
	private String middleName;
	@NotBlank(message="Lastname should not be null")
	private String lastName;
	private String gender;

	private AddressModel addressModel;
	private List<ContactModel> contactModels;

	public CustomerModel() {
		super();
	}

	public CustomerModel(int customerId, String firstName, String middleName, String lastName, String gender,
			AddressModel addressModel, List<ContactModel> contactModels) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.addressModel = addressModel;
		this.contactModels = contactModels;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public AddressModel getAddressModel() {
		return addressModel;
	}

	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}

	public List<ContactModel> getContactModels() {
		return contactModels;
	}

	public void setContactModels(List<ContactModel> contactModels) {
		this.contactModels = contactModels;
	}

	@Override
	public String toString() {
		return "CustomerModel [customerId=" + customerId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", gender=" + gender + ", addressModel=" + addressModel
				+ ", contactModels=" + contactModels + "]";
	}

}
