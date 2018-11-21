import java.util.Arrays;

public class SearchImplementation {

    public static void main(String[] args) {
        int[] sortedArray = new int[50];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = (int) (Math.random() * 100 + 1);   //Fills the array with numbers ranging from 1 to 100.
        }
        Arrays.sort(sortedArray);                               //Java provided method that sorts the array for us.
        int elementToFind = (int) (Math.random() * 100 + 1);    //Variable that creates a random item for us to search.
        System.out.println("Element to find: " + elementToFind);//Print that lets us know what the element is.
        
        /*
        Anytime a data structure is used in a program, it is used with the 
            intention to retrieve stored information at a later date.
        
        Due to the necessity of storing information, these data structures 
            grow massive in size and make it difficult to access any specific item efficiently.
        
        For this programming practice, create a method which return nothing, 
            is given an already sorted array as well as a key to find, and prints the index the key is at.
        
        As a bonus step, print the amount of steps your method took to get the index.
        */
        
        MySearch(sortedArray, elementToFind);
    }
    //Add your method beneath this line as well as your name above it.
    
}
