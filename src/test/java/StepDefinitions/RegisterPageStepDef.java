package StepDefinitions;

import java.util.List;
import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStepDef extends BaseClass
{
	RegisterPage regpage;
@Given("user open Guru99 register page on {string} broweser")
public void user_open_guru99_register_page_on_broweser(String browsername) {
	Initialization(browsername);
}
List<List<String>> ls;
@When("user enter valid contactinfo as firstname lastname phone and email")
public void user_enter_valid_contactinfo_as_firstname_lastname_phone_and_email(io.cucumber.datatable.DataTable dataTable) {
	ls=dataTable.asLists();
    String firstname=ls.get(0).get(0);
    String lastname=ls.get(0).get(1);
    String phonnum=ls.get(0).get(2);
    String email=ls.get(0).get(3);
    regpage=new RegisterPage();
    regpage.contactInfoFunctionality(firstname, lastname, phonnum, email);
}

@Then("user enter valid maillinginfo as address city state postalcode and country")
public void user_enter_valid_maillinginfo_as_address_city_state_postalcode_and_country(io.cucumber.datatable.DataTable dataTable) {
	 ls=dataTable.asLists();
	 String address=ls.get(0).get(0);
	 String city=ls.get(0).get(1);
	 String state=ls.get(0).get(2);
	 String postalcode=ls.get(0).get(3);
	 String country=ls.get(0).get(4);
	 regpage.mailingFunctionality(address, city, state,postalcode, country);
}

@Then("enter valid userinfo as username password confirmpassword and user click  on submit button")
public void enter_valid_userinfo_as_username_password_confirmpassword_and_user_click_on_submit_button(io.cucumber.datatable.DataTable dataTable) {
	ls = dataTable.asLists();
	String username=ls.get(0).get(0);
	String password=ls.get(0).get(1);
	String cinfirmpass=ls.get(0).get(2);
	regpage.userInfoFunctionality(username, password, cinfirmpass);
}

@When("user is on RegisterPageSuccess and user capture screenshot")
public void user_is_on_register_page_success_and_user_capture_screenshot() {
    System.out.println("Screenshot caputured");
}

@When("user click on sign-in link")
public void user_click_on_sign_in_link() {
    System.out.println("clicked on sign-in link ");
}
}