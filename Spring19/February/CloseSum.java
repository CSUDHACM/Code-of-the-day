public class CloseSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 10, 11, 17, 20};
        int key = 25;
        /*
            Suppose you are given a sorted array of integers and a key of some value.
            Create a method which returns nothing, has a parameter of an integer array and an integer key, and prints 
              out a pair of numbers whose sum is the closest to the given key.
              
            Example: PrintCloseSum(arr, key); //This should print pair 8 and 17.
        */
    }   
    //Insert your method below this line with a comment including your name.
    
    //Kevin Ramirez, O(n) solution
    public static void PrintCloseSum(int[] arr, int key) {
        if (arr.length <= 1) {                                                 
            System.out.println("Error! Array size is less than two!");
        } else if (arr.length == 2) {
            System.out.println("Closest pair to key: " + arr[0] + " " + arr[1]);
        } else {
            int leftInd = 0, rightInd = arr.length - 1;     //Pointers to point at two locations in an array.
            int diff = Integer.MAX_VALUE;                   //Difference variable to keep track of how close the pair sum is to the key.
            int item1 = 0, item2 = 0;                       //Keep track of a pair that is closest to the key.
            while (leftInd < rightInd) {
                if ((int) Math.abs(arr[leftInd] + arr[rightInd] - key) < diff) {    //If pair sum is close to key, update items + diff.
                    item1 = arr[leftInd];
                    item2 = arr[rightInd];
                    diff = (int) Math.abs(arr[leftInd] + arr[rightInd] - key);
                }
                if ((int) Math.abs(arr[leftInd] + arr[rightInd - 1] - key) < diff) {    //Check the next element for potential closer pair.
                    rightInd--;
                } else {
                    leftInd++;
                }
            }
            System.out.println("Key: " + key + "\nClosest Pair: " + item1 + " " + item2);
        }
    }
}


/*
 while (leftInd < rightInd) {
                if ((int) Math.abs(arr[leftInd] + arr[rightInd] - key) < diff) {    //If pair sum is close to key, update items + diff.
                    item1 = arr[leftInd];
                    item2 = arr[rightInd];
                    diff = (int) Math.abs(arr[leftInd] + arr[rightInd] - key);
					System.out.println(item1);
					System.out.println(item2);
					System.out.println("The diff is: " +diff);
                }
                if ((int) Math.abs(arr[leftInd] + arr[rightInd - 1] - key) <= diff) {    //Check the next element for potential closer pair.
                    System.out.println((int) Math.abs(arr[leftInd] + arr[rightInd - 1] - key) < diff);
					System.out.println("Prev rIndex is: " + rightInd);
					rightInd--;
					System.out.println("The rIndex is: " +rightInd);
                } else {
                    leftInd++;
					System.out.println("The lIndex is: " +leftInd);
                }
            }
            System.out.println("Key: " + key + "\nClosest Pair: " + item1 + " " + item2);
        }
    }
 */
