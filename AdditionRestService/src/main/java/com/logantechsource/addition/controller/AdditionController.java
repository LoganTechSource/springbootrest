package com.logantechsource.addition.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class is exposed as a rest controller.
 * The purpose of this service is to add given numbers from the request parameter and respond back with the result.
 * 
 * <p>Sample URL: http://localhost:9921/additionservice/add?numbers=2,1000,998</p>
 * 
 * @author LoganTechSource
 *
 */
@RestController
@RequestMapping(value="/additionservice")
public class AdditionController {

	/**
	 * This GET method will add numbers which are passed through request parameter. 
	 * Since we have used Varargs (...) parameter we can pass more numbers with comma separated values as argument.
	 * 
	 * @param numbersToAdd is the RequestParam variable and it is alias of "numbers". 
	 * 						The request param values will be stored into this variable.
	 * @return the sum of the given numbers
	 */
	@GetMapping(value="/add")
	public String addNumbers(@RequestParam("numbers") String... numbersToAdd )
	{
		int sumTotal = 0;
		String responseMessage = null;
		try
		{
			for(String number: numbersToAdd)
			{
				sumTotal += Integer.parseInt(number);
			}
			responseMessage = "The given "+ numbersToAdd.length + " number(s) sum value is " +sumTotal;
		}
		catch(NumberFormatException numberFormatException)
		{
			responseMessage = "Please provide valide data!";
		}
		return responseMessage;
	}
}
