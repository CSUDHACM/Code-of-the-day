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
    
    //James Method
    public static int findNonDup(int[] myArr) {
        for (int i = 0; i <= myArr.length - 1; i++) {

            for (int j = i + 1; j <= myArr.length - 1; j++) {
                if (myArr[i] > myArr[j]) {
                    //int temp = myArr[j];
                    //myArr[j] = myArr[i];
                    //myArr[i] = temp;\
                    
                    myArr[i] = myArr[i] ^ myArr[j];
                    myArr[j] = myArr[i] ^ myArr[j];
                    myArr[i] = myArr[i] ^ myArr[j];
                }
            }
        }

        for (int i = 0; i < myArr.length - 1; i += 2) {
            if (myArr[i] != myArr[i + 1]) {
                return myArr[i];
            }
        }
        return myArr[myArr.length - 1];
    }
    
    //Martin's Method
    public static int nonDup(int[] nonDupArr)
    {
        int XOR = 0;
        for (int current_index = 0; current_index < nonDupArr.length; current_index++)
        {
            XOR ^= nonDupArr[current_index];
        }
        return XOR;
    }
}
