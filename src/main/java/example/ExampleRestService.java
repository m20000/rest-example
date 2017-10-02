package example;

import static spark.Spark.*;
import static example.JsonUtil.*;

public class ExampleRestService
{

	public static void main(String[] args)
	{
		get("/example/:text", (req, res) -> new ExampleResponse(Example.reverse(req.params(":text"))), json());
		
		after((req, res) -> {res.type("application/json");});
	}

}
