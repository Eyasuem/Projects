// Author: Eyasue Mengesha
// Project: Array of Objects 
// Date: 6/06/24

import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.util.Arrays;

public class ZordonArrayDriver{

	public static void main(String args[]){
	    
		Zordon arr [] = new Zordon [20];
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Please enter the file's name: ");
		String inp = obj.nextLine();
		System.out.println("");
		
		int x = 0;
        
		
		// Try and catch used to try and open the file depending on the user input. 
		// if the input is incorrect our catch will tell the user an error has occurred
		
		try {
		
			File file_obj = new File(inp);
			Scanner myReader = new Scanner(file_obj);
			
      	while(myReader.hasNext()) {
      		
      	// Holds the color and number associated with our ranger
        	String color = myReader.next();
        	int number = myReader.nextInt();
        	
        // adds each ranger into our array
        	arr[x] = new Zordon(color,number);
        	x++;
      }
       // closes the file
            myReader.close();
        
    } 	catch(FileNotFoundException e) {
    
     	 System.out.println("An error occurred.");
     	 e.printStackTrace();
    }
    
    // Prints every Ranger and the number associated with them. 
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
			System.out.println("");
		}
		
	
		overallAvg(arr);
		count(arr,arr[0]);
		groupAvg(arr,"yellow");
		lessThan(arr,50);
		groupEdit(arr,"yellow",10);
		

	}
	
	
	// This is the avg method, finds the average of our int attributs
	    public static int overallAvg(Zordon [] array){
	    	int temp = 0;
			for(int x = 0; x < array.length; x++){
				// adds the the number from each ranger 
					temp += array[x].getNum();
				
			}
			
			System.out.println("");
			System.out.println("Avg of int attributes: " + temp / array.length);
			return temp / array.length;
		
		}
		
	// This is the count method, sees the amount of rangers with the same color and number 
	public static int count(Zordon [] array, Zordon item){
		int temp = 0;
		for(int x = 0; x < array.length; x++){
			if(item.equals(array[x])){
				temp += 1;
			}
			
		
		}
		
		System.out.println("Amount of rangers with the same color and number: " + temp);
		return temp; 
			
	
	}
	
	//This is the group avg method, checks all the rangers with the same color and finds 
	// the avg of them. 
	public static int groupAvg(Zordon [] array, String color){
		int temp = 0; 
		int same_color = 0;
		for(int x = 0; x < array.length; x++){
			if(array[x].getRanger().compareToIgnoreCase(color) == 0){
					same_color += array[x].getNum();
					temp++;
			
			}
		
		}
		
	
		
		
		
		System.out.println("Average of the rangers with the same color: " + (same_color / temp));
		return same_color / temp ;
	
	}
	
	
	// This is the less than method, depending on the inputed int, it will compare 
	
	public static Zordon[] lessThan(Zordon [] array, int num){
	// temp arr
		Zordon temp_arr [] = new Zordon[20];
	//  when adding elements to our new array will add to the start
		
		int holder = 0;
	// loops through and checks whether the number associated with the ranger is less than the 
	// number inputed
		for(int x = 0; x < array.length; x++){
			if(array[x].getNum() < num){
				temp_arr[holder] = array[x];
				holder++;
			}
			
			
		
		}
		
	// returns array
		System.out.println("The new array: " + Arrays.toString(temp_arr));
		return temp_arr;
		
	
	}
	
	// group edit, 
	public static void groupEdit(Zordon [] array, String color, int num){
		for(int x = 0; x < array.length; x++){
		// checks if its the same string
			if(array[x].getRanger().compareToIgnoreCase(color) == 0){
			// grabs the current number that has the same string, updates it then sets it to the new number
					int currentNum = array[x].getNum();
					int updatedNum = currentNum + num;
					array[x].setNum(updatedNum);
			
			}
		
		}
		
	
	}
	
	
	 
		
		
	
		
	
}