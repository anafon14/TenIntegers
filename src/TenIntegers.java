/**
 * Name: Ana Luiza Fonseca Teixeira
 * Teacher: Mr. Hardman 
 * Assignment 5, Program #2 
 * Date Last Modified: 11/29/2016
 */

import java.util.Scanner;

public class TenIntegers {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int[] userValues = new int[10];
		int element;
		int count = 0;
		
		System.out.println("Please, enter 10 integers values: ");
		System.out.println();
		
		for(int i = 0; i < userValues.length; i++){
			
			System.out.print("Please enter an integer: ");
			userValues[i] = userInput.nextInt();
	
		}
			
		System.out.println("What element do you want to search for? ");
		element = userInput.nextInt();	

		for(int i = 0; i < userValues.length; i++){
			
			if(element == userValues[i]){
				
				count++;

			}
		
		}
		
		System.out.print("The element " + element + " can be found " + count + " times!");
		
		userInput.close();
		
	}

}
