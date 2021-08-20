package stepDefinitions;

import java.io.IOException;

import Generic.apiendpoints;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import utilities.Json_handler;
import utilities.log;

public class CreateBeneficiary_BankDetails_steps {
	
	@Given("I am authorized user")
	public void i_am_authorized_user() throws IOException {
		log.startTestCase("Create Beneficiary");
	    Response response=apiendpoints.Authentication();
	    String token= Json_handler.getJsonPath(response, "token");
	    log.info("Token is:"+token);
	 }

}
