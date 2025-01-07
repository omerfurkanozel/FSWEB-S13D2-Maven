package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome (int num){
    int originalNumber = num ;
    int reverseNum= 0;
    while (num !=0){
        int rem = num %10;
        reverseNum= reverseNum*10 + rem;
        num /=10;
    }
    return  originalNumber==reverseNum;
    }

    public  static boolean isPerfectNumber(int num){


        int sum = 0;
    for(int i =1 ;i<num-1; i++){
        if (num %i == 0){
            sum +=i;
        }
    }
    return  sum == num;
    }

    public static String numberToWords(int num){
        if (num <0){
            return "Invalid Value";
        } else{
        return "one";
        }
    }

}
