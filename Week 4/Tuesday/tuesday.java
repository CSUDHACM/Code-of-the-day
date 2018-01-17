
public class tuesday {
    
    public static void main(String[] args) {
        
        // Make a method that accepts a string that consists of positive numbers (digits)
	// and stores those digits into an int array
	// then the method should return the array;
        
        int [] array;
        
        
        String str = " 2 5 6 7 4 3";
        
       array =  method(str);
        
    }
    public static int [] method(String str) // Alvaro's method
    {
        int length = 0;
        for (int i = 0; i < str.length; i++) {
            
            String letter = str.substring(i, i+1);
            if (letter.equals(" ")) {
                length++;      
            }
        }
        length++;
        int num[] = new int[length];
        
    
        for (int i = 0,j=0; i < str.length(); i++) {
            
            String ch = str.substring(i,i+1);
            
            if(ch.matches("[0-9]"))
            {
                num[j] = Integer.parseInt(str.substring(i,i+1));
                j++;
            }
                
        }
        
        //for (int i = 0; i < num.length; i++) {
        //    System.out.println(num[i]);
        //}
        
        return num;
    }
	public static int[] separate(String string_to_convert) {//Rushabh's Method
		int size_of_string=string_to_convert.length();	//Getting Size of the string
		int lengthOfArray=0; //Initializing the variable
		int Array_with_values[] =new int[string_to_convert.length()] ; //initializing int array to get values from the string
		for(int i=0,k=0;i<size_of_string;i++) {
			if (string_to_convert.charAt(i)== ' ') { //Finding spaces
				
		         if(i>0) {
		        	 Array_with_values[k]=Integer.parseInt(String.valueOf(string_to_convert.charAt(i-1)));
		        	 k++;
		        	 lengthOfArray++;
		         }
		    }
		}
		int main_int_array[]=new int[lengthOfArray]; // creating a new array to filter out the values
		for(int i=0;i<lengthOfArray;i++) {
			if(Array_with_values[i]!=0) {
				main_int_array[i]=Array_with_values[i]; // parsing the values
			}
		}
		
		return main_int_array; // returning the array
	}
    
    	public static int[] string_to_positive_array(String integer_string) //Martin Lennan's method
	{
		int array_length = 1;
		for (int current_character = 0; current_character < integer_string.length(); current_character++)
		{
			if (integer_string.charAt(current_character) == ' ')
			{
				array_length++;
			}
		}
		
		int[] integer_array = new int[array_length];
		
		for (int current_character = 0, current_index = 0; current_character < integer_string.length(); current_character++)
		{
			String current_integer = "";
			if (integer_string.charAt(current_character) != ' ')
			{
				for (	;
					(current_character < integer_string.length()) && (integer_string.charAt(current_character) != ' ');
					current_character++)
				{
					current_integer = current_integer + integer_string.charAt(current_character);
				}
			}
			integer_array[current_index] = Integer.parseInt(current_integer);
			System.out.println(Integer.parseInt(current_integer));
			current_index++;
		}
		
		return integer_array;
	}
}
