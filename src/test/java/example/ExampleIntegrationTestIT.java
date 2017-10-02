package example;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 

public class ExampleIntegrationTestIT
{
	@Test	
	public void integrationTest()
	{
		get("http://localhost:4567/example/text").then().body("result", equalTo("txet"));
	}
}
