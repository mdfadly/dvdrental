package com.project.dvdrental.entity;

public class Feature<T> {
	private T specialFeatures;

	public Feature() {
		super();
	}

	public Feature(T specialFeatures) {
		super();
		this.specialFeatures = specialFeatures;
	}

	public T getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(T specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
	
}
