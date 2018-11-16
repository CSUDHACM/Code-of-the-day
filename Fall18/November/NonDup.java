public class NonDup {
    public static void main(String[] args) {
        int[] myArr = {3, 8, 2, 1, 9, 4, 4, 8, 2, 3, 9};
        /*
        For this programming practice, suppose you are given an array containing integers of no particular range.
        This array contains elements that are unsorted and every element except one has a duplicate.
        Create a method that can search through this array and return the non duplicated element.
        You may use additional data structures or sorting techniques at your disposal.
        */
        
        int nonDup = findNonDup(myArr);
        System.out.println(nonDup);
    }
    //Insert your method below this line.
    
}
