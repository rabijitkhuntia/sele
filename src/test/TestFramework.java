package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMFramework;

public class TestFramework extends BaseTest 
{
	
	@Test
	public void Submit() throws IOException
	{
		POMFramework sub = new POMFramework(driver);
		sub.formSubmit();
		
	}

}
