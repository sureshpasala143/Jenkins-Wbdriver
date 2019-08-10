package RestAssuredAPItesting.RestAssuredAPItesting;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.*;
import io.restassured.http.Method;

public class Firstcase_GET_Resquest {

	@Test  
	void getweatherDetails(){
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httpRequest= RestAssured.given();
		
	//Response
		Response response= httpRequest.request(Method.GET,"/Hyderabad");
		String responsebody=response.getBody().asString();
		System.out.println("Response is : "+ responsebody);
		
		//status code validation starts
	Integer Statuscode=	response.getStatusCode();
	System.out.println("Statuscode  is : "+ Statuscode);
	}
	
}
