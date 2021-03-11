package com.cjc.app.fwl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private String customerMobileNo;
	private int customerLoanAmount;
	private int customerAge;
	private String customerdDateOfBirth;
	private String customerEmail;
	private String customerPancardNo;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	private Vehicaldetails vehical;
	@OneToOne(cascade = CascadeType.ALL)
	private Bank bank;
	@OneToOne(cascade = CascadeType.ALL)
	private Guaranterdetails guaranter;
	@OneToOne(cascade = CascadeType.ALL)
	private Previousloandetails loandetails;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMobileNo() {
		return customerMobileNo;
	}
	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}
	public int getCustomerLoanAmount() {
		return customerLoanAmount;
	}
	public void setCustomerLoanAmount(int customerLoanAmount) {
		this.customerLoanAmount = customerLoanAmount;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerdDateOfBirth() {
		return customerdDateOfBirth;
	}
	public void setCustomerdDateOfBirth(String customerdDateOfBirth) {
		this.customerdDateOfBirth = customerdDateOfBirth;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPancardNo() {
		return customerPancardNo;
	}
	public void setCustomerPancardNo(String customerPancardNo) {
		this.customerPancardNo = customerPancardNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Vehicaldetails getVehical() {
		return vehical;
	}
	public void setVehical(Vehicaldetails vehical) {
		this.vehical = vehical;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Guaranterdetails getGuaranter() {
		return guaranter;
	}
	public void setGuaranter(Guaranterdetails guaranter) {
		this.guaranter = guaranter;
	}
	public Previousloandetails getLoandetails() {
		return loandetails;
	}
	public void setLoandetails(Previousloandetails loandetails) {
		this.loandetails = loandetails;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerMobileNo="
				+ customerMobileNo + ", customerLoanAmount=" + customerLoanAmount + ", customerAge=" + customerAge
				+ ", customerdDateOfBirth=" + customerdDateOfBirth + ", customerEmail=" + customerEmail
				+ ", customerPancardNo=" + customerPancardNo + ", address=" + address + ", vehical=" + vehical
				+ ", bank=" + bank + ", guaranter=" + guaranter + ", loandetails=" + loandetails + "]";
	}
	
	
}
