package StepDefinations;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
public class AssignmentNo2 {
@Test
	public void ValidateResponse()
	{
		RestAssured.baseURI="https://reqres.in";
		given().
			
		when().
			get("/api/users?page=2").
		then().
			log().all()
			.and().
			body("data.id[0]", equalTo(7));
		
	
	}
}
