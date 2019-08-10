package RestAssuredAPItesting.RestAssuredAPItesting;

import java.sql.Time;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Third_GETHeaders {
	@Test  
	void getweatherDetails(){
	RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	
	RequestSpecification httpRequest= RestAssured.given();
	
//Response
	Response response= httpRequest.request(Method.GET,"/Hyderabad");
	String responsebody=response.getBody().asString();
	System.out.println("Responsebody is : "+ responsebody);
	
	//status code validation starts
	Integer Statuscode=	response.getStatusCode();
	System.out.println("Statuscode  is : "+ Statuscode);
	long resptym=response.getTime();
	System.out.println("Resp tym  is : "+ resptym);
	Headers headers=response.headers();
 for(Header header: headers)
 {
	 System.out.println("Header name "+ header.getName());
	 System.out.println("Header value "+ header.getValue());
 }

}
	
	

}
