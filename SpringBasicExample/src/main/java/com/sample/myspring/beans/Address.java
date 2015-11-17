package com.sample.myspring.beans;

public class Address {
	private String street;
	private String city;
	private String State;

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", State=" + State + ", zip=" + zip + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	private String zip;
}
