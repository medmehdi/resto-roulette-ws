/**
 * 
 */
package org.myplatforme.restoroulette.domain;

import org.jongo.marshall.jackson.id.Id;

/**
 * @author MElalami
 * 
 */
public class Resto {

	@Id
	private String id;
	private String title;
	private String imageUrl;
	private String description;
	private String address;
	private double longitude;
	private double latitude;
	// definie l'url d'acces à la ressource
	private String accessUrl;

	public Resto() {
	}

	public Resto(String title, String imageUrl, String description, String address, double longitude, double latitude, String accessUrl) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.description = description;
		this.address = address;
		this.longitude = longitude;
		this.latitude = latitude;
		this.accessUrl = accessUrl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getAccessUrl() {
		return accessUrl;
	}

	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}

	@Override
	public String toString() {
		return "Resto [title=" + title + ", imageUrl=" + imageUrl + ", description=" + description + ", address=" + address + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", accessUrl=" + accessUrl + "]";
	}
}
