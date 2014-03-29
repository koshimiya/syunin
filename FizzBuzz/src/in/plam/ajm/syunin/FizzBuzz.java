package in.plam.ajm.syunin;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udumge
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	FizzBuzz fz = new FizzBuzz();

    	if (args == null) return;

    	String numString = args[0];

    	Integer num = Integer.parseInt(numString);

    	String result = fz.fizzBuzz(num);


    	System.out.println(result);

    }

    public String fizzBuzz(Integer num) {

    	String result = "";

    	if (num % 3 == 0) {
    		result = "Fizz";
    	}

    	if (num % 5 == 0) {
    		result += "Buzz";
    	}

    	if (result.length() == 0) {
    		result = num.toString();
    	}

    	return result;
    }
    
}
