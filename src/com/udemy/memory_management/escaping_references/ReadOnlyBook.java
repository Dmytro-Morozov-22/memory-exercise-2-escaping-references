package com.udemy.memory_management.escaping_references;

public interface ReadOnlyBook {

	int getId();

	String getTitle();

	String getAuthor();

	Price getPrice();

	String toString();

}