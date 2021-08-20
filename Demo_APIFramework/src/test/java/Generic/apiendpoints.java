package Generic;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.apiResources;
import utilities.getconfigdata;

public class apiendpoints {
	
	//===========================Authentication Endpoint=========================================//
		public static Response Authentication() throws IOException {
			apiResources resource=apiResources.valueOf("AuthEndpoint");
	        RequestSpecification request = RestAssured.given();
	        request.header("Content-Type", "application/json");
	        request.header("x-client-id",getconfigdata.getPropertyValue("x-client-id"));
	        request.header("x-api-key",getconfigdata.getPropertyValue("x-api-key"));
	        Response response = request.post(resource.getResource());
	        return response;      
		}
		
}
