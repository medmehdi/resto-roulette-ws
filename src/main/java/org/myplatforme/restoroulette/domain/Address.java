package org.myplatforme.restoroulette.domain;

public class Address {

	private int streetNumber;
	private String street;
	private String postalCode;
	private String city;
	private String country;
	private Coordinates coordinates;

	public Address(int streetNumber, String street, String postalCode, String city, String country, Coordinates coordinates) {
		super();
		this.streetNumber = streetNumber;
		this.street = street;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
		this.coordinates = coordinates;
	}

	public Address() {
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", street=" + street + ", postalCode=" + postalCode + ", city=" + city + ", country=" + country + ", coordinates="
				+ coordinates + "]";
	}
}
