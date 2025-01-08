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
    for(int i =1 ;i<= num/2; i++){
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
        char[] digits= String.valueOf(num).toCharArray();
        String numToText="";
        for(char digit:digits){
            switch (digit){
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }

        }

        return numToText.trim();
    }

} }
