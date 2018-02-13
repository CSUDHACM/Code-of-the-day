/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teeest;

import java.util.Scanner;

/**
 *
 * @author Berna
 */
public class FizzThatBuzz {

    /**
     * Maria P.
     */
    
    static String fizzBuzz(int n){
        if((n%3 == 0) && (n%5 == 0))
            return "FizzBuzz";
        else if(n%3 == 0)
            return "Fizz";
        else if(n%5 == 0)
            return "Buzz";
        return "Something Broke.";
        }
    
    private static String divide(int number) {//Rushabh's Method
		// Checking if its divisible by 3 5 and 3 and 5 both
		String value=" ";
		if(number%3==0) {
			value="Fizz";
		}
		if(number%5 == 0) {
			value="Buzz";
		}
		if(number%5 == 0 && number%3==0) {
			value="Fizz_Buzz";
		}
		
		return value;
	}
	
	public static String retStr(int n) //Daniel's Method
    { 
         String temp = "";
        if((n%15) == 0)
        {
            temp = "Fizzbuzz";
        }
        else if((n%5) == 0)
        {
            temp= "Buzz";
        }
        else if((n%3)== 0)
        {
            temp= "Fizz";
        }
            
       return temp;
    }
        
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      System.out.println(fizzBuzz(input.nextInt()));
    }
    
}
