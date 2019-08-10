 package RestAssuredAPItesting.RestAssuredAPItesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Second_POST_method {
	
	@Test
	void post_details(){
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
	  //Request
		RequestSpecification httprequest=RestAssured.given();
	    
		// post & put payload
		JSONObject requestparams = new JSONObject();
	    requestparams.put("FirstName","Suresh");
	    requestparams.put("LastName","love");
	    requestparams.put("UserName","Suresh123");
	    requestparams.put("Password","Suresh123");
	    requestparams.put("Email","Suresh.love@gmail.com");
		//respone
		httprequest.header("Content.Type","application/json");
		 httprequest.body(requestparams.toJSONString());
		 
		 Response response= httprequest.request(Method.POST,"/register");
			String responsebody=response.getBody().asString();
			System.out.println("Response is : "+ responsebody);
			
			//status code validation starts
		Integer Statuscode=	response.getStatusCode();
		System.out.println("Statuscode  is : "+ Statuscode);
		response.jsonPath().get("SuccesCode");  
		String Statusline=	response.getStatusLine();
		System.out.println("Statuscline  is : "+ Statusline);
	
	}
	

}
