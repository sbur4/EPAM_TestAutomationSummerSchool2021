//Write a program to solve the problem. 
//You are given an array of numbers.
//Double those positive elements of the array that are less than the average of all the elements.

public class Question1 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, -1 };

        int arrLeng = arr.length;
        // System.out.println(sumArrElmnts);
        double sumArr = 0;
        for (int i = 0; i < arr.length; i++)
            sumArr = sumArr + arr[i];
        // System.out.println(sumArr);
        double avrg = sumArr / arrLeng;
        // System.out.println(avarageSumArr);

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < avrg && arr[i] > 0)
                // System.out.print(arr[i] + " ");
                System.out.print((arr[i]) * 2 + " ");
    }
}
