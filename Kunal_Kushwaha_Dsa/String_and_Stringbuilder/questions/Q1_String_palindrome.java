package String_and_Stringbuilder.questions;

public class Q1_String_palindrome {
    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'd', 'c', 'b', 'a'};

        int start = 0;
        int end = arr.length - 1;

        boolean ispalindrome = true;

        while(start < end ){
            if(arr[start] != arr[end]){
               ispalindrome = false;
               break;
            }
            start++;
            end--;
        }

        if(ispalindrome){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }









    }
}
