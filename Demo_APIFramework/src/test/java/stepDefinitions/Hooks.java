package stepDefinitions;

import java.io.IOException;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import utilities.getconfigdata;

public class Hooks {
	
	//Think of logic to create a baseurl based upon the environment.
	//As per me best way is to keep it under config.json and have baseurl's and x-api &x-client-id keys as that
	//can be different per env
	@Before()
	public void createRestAssuredconn()
	{
		String baseurl="";
		try {
			baseurl = getconfigdata.getPropertyValue("BaseUrl");
		} catch (IOException e) {
			e.printStackTrace();
		}
		RestAssured.baseURI=baseurl;		
	}

}
