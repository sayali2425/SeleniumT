package StepDefinations;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class AssignmentNo3 {

	@Test
	public void validateStatusCode()
	{
		String url = "https://reqres.in/api/users?page=2";
		
		RequestSpecification http_request = RestAssured.given();
		Response response = http_request.get(url);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code : " + statusCode);
		Assert.assertEquals(statusCode, 200, "status code are matched");
	
	}
}
