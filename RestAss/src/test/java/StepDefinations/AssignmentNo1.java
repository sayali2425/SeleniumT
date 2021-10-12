package StepDefinations;

import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class AssignmentNo1 {

	@Test
	 @Given("API for foreign exchange")
	  public void api_for_foreign_exchange() {
		  
			 RestAssured.given().
				body("{\r\n"
						+ "\"name\": \"morpheus\",\r\n"
						+" \"job\": \"leader\"\r\n"
						+"}").
				post("https://reqres.in/api/users").
				then(). 
				log(). 
				all(). 
				assertThat().
				statusCode(201);
	  }

	  @When("posted with correct Information")
	  public void posted_with_correct_information() {
	     
	  }

	  @Then("validate positive response code received")
	  public void validate_positive_response_code_received() {
	  
	  }
}
