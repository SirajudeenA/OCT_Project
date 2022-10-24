package com.adactinsite.pom;

import org.openqa.selenium.WebDriver;



public class Page_object_Manager {

	public WebDriver driver; //--- null
	
	private Signin_Page signin; // --- null

	private Adactin_Home homepage; // ---null

	private Select_Hotel hotel; // ----null

	private Book_A_Hotel book; /// ---null

	public Page_object_Manager(WebDriver driver2) {

		this.driver = driver2;
	}

	public Signin_Page getSignin_Page() {
		if (signin == null) {

			signin = new Signin_Page(driver);
		}

		return signin;

	}

	public Adactin_Home getAdactin_home() {

		if (homepage == null) {

			homepage = new Adactin_Home(driver);

		}

		return homepage;
	}

	public Select_Hotel getSelect_Hotel() {
		if (hotel == null) {

			hotel = new Select_Hotel(driver);

		}

		return hotel;
	}

	public Book_A_Hotel getBook_A_Hotel() {

		if (book == null) {

			book = new Book_A_Hotel(driver);

		}

		return book;
	}

	public static void main(String[] args) {

	}

}
