package example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExampleTest
{

	@Test	
	public void test()
	{
		assertTrue("Basic reverse test", Example.reverse("test").equals("tset"));
	}
}
