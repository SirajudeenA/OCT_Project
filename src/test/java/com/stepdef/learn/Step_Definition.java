package com.stepdef.learn;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.adactinsite.pom.Page_object_Manager;
import com.helperfile.learn.File_Data_Manager;
import com.runner.learn.Adactin_Runner_Oct;
import com.utilityfiles.learn.Utility_File_Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Utility_File_Base{

		public static WebDriver driver =Adactin_Runner_Oct.driver;
		
public static Page_object_Manager manager = new Page_object_Manager(driver);

@Given("user launch the Application")
public void user_launch_the_application() throws Throwable{

	get_url("https://adactinhotelapp.com/");
}

@When("user Enter The {string} In Username Field")
public void user_enter_the_in_username_field(String username) {

	send_Keys(manager.getSignin_Page().getUserName(), username);
}

@When("user Enter The {string} In Password Field")
public void user_enter_the_in_password_field(String password) {

	send_Keys(manager.getSignin_Page().getPassWord(), password);
}


@Then("user Click The Login Button Which Navigate to {string}")
public void user_click_the_login_button_which_navigate_to(String title) throws Throwable {

	click_on_Element(manager.getSignin_Page().getLogin_btn());
	
	Thread.sleep(3000);
	
	Assert.assertEquals(title, driver.getTitle());
}
	

@When("user Select the Location")
public void user_select_the_location() throws Throwable{

	SelectBy_intex(manager.getAdactin_home().getDropdown1(), 2);
}

@When("user Select Hotel")
public void user_select_hotel()throws Throwable {

	selectBy_Value(manager.getAdactin_home().getDropdown2(),"Hotel Sunshine");
}

@When("user Select Room Type")
public void user_select_room_type() throws Throwable {

	selectBy_Text(manager.getAdactin_home().getDropdown3(), "Deluxe");
}

@When("user Select Number Of Rooms")
public void user_select_number_of_rooms() throws Throwable{

	SelectBy_intex(manager.getAdactin_home().getDropdown4(), 3);
}

@When("user Select Check In Date")
public void user_select_check_in_date() throws Throwable {
send_Keys(manager.getAdactin_home().getCheckin(), "03/10/2022");
}

@When("user Select Check Out Date")
public void user_select_check_out_date() throws Throwable {
send_Keys(manager.getAdactin_home().getCheckout(), "05/10/2022");
}

@When("user Select Adult Per Room")
public void user_select_adult_per_room()throws Throwable  {
	selectBy_Text(manager.getAdactin_home().getDropdown5(), "3 - Three");
}

@When("user Select Children Per Room")
public void user_select_children_per_room()throws Throwable {

	SelectBy_intex(manager.getAdactin_home().getDropdown6(), 1);
}

@Then("user Click Search Button Which Navigate To Select Hotel Page")
public void user_click_search_button_which_navigate_to_select_hotel_page()throws Throwable {
	click_on_Element(manager.getAdactin_home().getSubmit_btn());
}

@When("user Select The Hotel")
public void user_select_the_hotel() throws Throwable{
click_on_Element(manager.getSelect_Hotel().getRadioButton());
}

@Then("user Click Continue Button which Navigate To Book Hotel Page")
public void user_click_continue_button_which_navigate_to_book_hotel_page() throws Throwable{

	click_on_Element(manager.getSelect_Hotel().getContinue_btn());
}

@When("user Enter The Firstname In Firstname Field")
public void user_enter_the_firstname_in_firstname_field()throws Throwable {
send_Keys(manager.getBook_A_Hotel().getFirstName(), "siraju");
}

@When("user Enter The Lastname In Lastname Field")
public void user_enter_the_lastname_in_lastname_field()throws Throwable {

	send_Keys(manager.getBook_A_Hotel().getLastName(), "deen");
}

@When("user Enter Billing Address In Address Field")
public void user_enter_billing_address_in_address_field()throws Throwable {

	send_Keys(manager.getBook_A_Hotel().getAddress(), "PO Box 9842 Salt lake City UT 83532");
}

@When("user Enter Credit Card Number In Credid Card Field")
public void user_enter_credit_card_number_in_credid_card_field()throws Throwable {
	
	send_Keys(manager.getBook_A_Hotel().getCardNum(),"1234 5678 9123 1478");
}

@When("user Select The Credit Card Type From Dropdown")
public void user_select_the_credit_card_type_from_dropdown()throws Throwable {
	
	SelectBy_intex(manager.getBook_A_Hotel().getCardType(), 1);
}

@When("user Select The Month From Expiry Date")
public void user_select_the_month_from_expiry_date() throws Throwable{

	SelectBy_intex(manager.getBook_A_Hotel().getExpMonth(), 3);
}

@When("user Select The Year From Expiry Date")
public void user_select_the_year_from_expiry_date()throws Throwable {

	SelectBy_intex(manager.getBook_A_Hotel().getExpYear(), 4);
}

@When("user Enter CVV Number in Cvv field")
public void user_enter_cvv_number_in_cvv_field()throws Throwable {

	send_Keys(manager.getBook_A_Hotel().getCcvNum(), "477");
}

@Then("user Click On Book Now Button")
public void user_click_on_book_now_button()throws Throwable {

	click_on_Element(manager.getBook_A_Hotel().getBookNow());
}

	
}
