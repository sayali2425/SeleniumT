package StepDefinations;

import org.junit.Test;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
public class AssignmentNo5 {

	
	@Test
	public void ValidateNegativeResponseCode()
	{
		Response r =  RestAssured.given().
				when().
					get("https://api.exchangeratesapi.io/v1/lat").
				then().
					assertThat().
					log().
					all().
					and().
					body("error.code", equalTo("missing_access_key")).
					extract().
					response();
		
		System.out.println("Response is :"+r);
		System.out.println("Negative response received");
		
			
	}
}
