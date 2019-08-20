import java.util.Arrays;

public class Exercise   {

    public static void main(String[] args)  {

        exercise1();
        exercise2();
        exercise3();
    }

    // This is problem number 2 reltio interview
    static void exercise1()	{

        //Interview question - provide array index of repeated number in array 1,2,3,4,2,5,3
        int[] numbers = {1, 2, 3, 4, 5, 6, 6};

        for (int i = 0; i < numbers.length-1; i++ ) {
            for (int j = i+1; j < numbers.length; j++)	{

                if (numbers[i] == numbers[j])	{
                    System.out.println("The first index of repeated number is: " + i);
                    System.out.println("The second index of repeated number is: " + j);
                    System.out.println("The repeated value is: " + numbers[i]);
                }
            }
        }
    }

    // This is problem number 3 reltio interview
    static void exercise2()	{

        //reverse an integer array and print
        int[] myArray = { 2, 5, 8, 10, 38, 9};
        System.out.println("Original Array: " +Arrays.toString(myArray));

        int l = myArray.length;

        int[] revArray = new int[l];

        int i = l-1;
        int j = 0;

        do	{

            revArray[j] = myArray[i];
            i--;
            j++;

        } while (i>=0);
        System.out.println("Reverse Array: " +Arrays.toString(revArray));
    }

    //reverse an integer array without creating a new array
    static void exercise3()	{

        int[] my_array = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        System.out.println("Original array : "+Arrays.toString(my_array));

        for (int i = 0; i < my_array.length/2 ; i++)	{
            int temp = my_array[i];
            my_array[i] = my_array[my_array.length -i -1];
            my_array[my_array.length -i -1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array));

    }
}