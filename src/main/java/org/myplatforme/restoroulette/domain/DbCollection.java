package org.myplatforme.restoroulette.domain;

public enum DbCollection {

	RESTOS("restos");
	DbCollection(String name) {
		this.name = name;
	}

	private String name;

	public String getCollectionName() {
		return name;
	}
}
