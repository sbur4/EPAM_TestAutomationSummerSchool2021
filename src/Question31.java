//Write a program to solve the problem. 
//You are given two integer numbers A and B. 
//Print all the numbers from A to B inclusive in ascending order, if A<B, or in descending order otherwise. 
//For this purpose you cannot use loops, goto, arrays and collections.

public class Question31 {

    public static void main(String[] args) {

        int result = sum(5, 2);
        System.out.println(result);
    }

    public static int sum(int A, int B) {
        if (B > A) {
            return B + sum(A, B - 1);
        } else if (A > B) {
            return A + sum(A - 1, B);
        } else {
            return 0;
        }
    }
}
