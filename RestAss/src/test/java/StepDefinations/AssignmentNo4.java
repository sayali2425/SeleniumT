package StepDefinations;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
public class AssignmentNo4 {

	
	
	@Test
	@Given("Setting HTTP request")
	public void setting_http_request() {
		RestAssured.baseURI="http://api.exchangeratesapi.io";
	}

	@Test
	@When("creating negative scenario")
	public void creating_negative_scenario() {
		RequestSpecification http_request = RestAssured.given();
		Response response = http_request.request(Method.GET,"7169dac9c0fa2d550590cf3a5ea5cfac");
		response=http_request.get();
		System.out.println(response);
	}

	@Test
	@Then("Print response into the console")
	public void print_response_into_the_console() {
		ValidatableResponse res=given().
		get("http://api.exchangeratesapi.io/v1/latest?access_key=7169dac9c0fa2d550590cf3a5ea5cfac").
	then().
		log().
		all().
		body("base", equalTo("EUR"));
		
		System.out.println("Response body is:" +res);
		System.out.println("Negative response received");

	}

}
