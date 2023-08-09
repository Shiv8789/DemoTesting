package tests.api;

import org.junit.Before;
import org.junit.Test;

import com.github.dockerjava.transport.DockerHttpClient.Response;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import  static org.hamcrest.Matchers.*;

public class BookerAPITest {
	RequestSpecification request;
	Response response;
	@Before
	public void setUP() {
		RestAssured.basePath="";
	}
//	@Test
//	public void createBooking() {
//		request=given().log().all().header("content-type","application/json").body(null);
//		response=request.when().post("/booking");
//		response.then().log().all().assertThat().statusCode(200).body("booking.firstname",equalTo("Jim"))
//		
//	}

}
