package ebrahemots;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
class Builtin{

    static int[] minMax (int[] arr){
        /**
         * Making a function to return the min and max value of list
         */
        //declaring defualt min and max value ans suppose it's the first item of the list
        int maxValue = arr[0];
        int minValue = arr[0];
        //Looping through the items in the list but we start loop from the second item in the list
        for (int i = 1 ; i < arr.length ; i++){
            //check if the second item is larger than the max value (the first item)
            if(arr[i] > maxValue){
                // then assign it's value to the max variable
                maxValue = arr[i];
                //if the item is smaller than the min value (the first item in the list )
            } else if (arr[i] < minValue) {
                //assign it ti the min value
                minValue = arr[i];
            }
        }
        //creating new array and save the two variable on it
        int result[] = new int[2];
        result[0] = maxValue;
        result[1] = minValue;
        return result ; // then return the result 

    }

    public static void main(String[] args) {
        int[] res = minMax(new int[]{2,7,3,2,7});
        int myarr[] = new int[6];
        myarr[0] = 2;
        myarr[1] = 9;
        myarr[2] = 5;
        myarr[3] = 1;
        myarr[4] = 13;
        myarr[5] = 22;
        Arrays.sort(myarr);
        System.out.println(Arrays.toString(myarr));



    }
}



