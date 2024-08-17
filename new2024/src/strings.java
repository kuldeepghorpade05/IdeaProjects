import java.util.*;

/** STRINGS **/
public class strings {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String first = "tony";
        String last = "stark";

        String fullname = first + " "+ last;

        /** length function **/
        //System.out.println(fullname.length());

        // charAt function
        /*for(int i=0; i<fullname.length(); i++ ){
            System.out.println(fullname.charAt(i));
        }*/

        /** compareTo function **/
        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve


       /* if(first.compareTo(last)==0 ){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        } */

        /** sub string **/

        /*String sentence = "my name is tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);*/

        /** strings are immutable **/

       // StringBuilder sb =   new StringBuilder("tony");
       // System.out.println(sb);

        /** char at index **/
        //System.out.println(sb.charAt(0));

        /** set char at index 0 **/
       // sb.setCharAt(0,'p');
       // System.out.println(sb);

        /** to insert a new char **/
       // sb.insert(2, 'n');
       // System.out.println(sb);



        /** to delete a char **/
        //sb.delete(0,1);
        //System.out.println(sb);

        //sb.insert(0, 'T');
        //System.out.println(sb);

        /** to append letters **/

        /*StringBuilder  name = new StringBuilder("k");
        name.append("u");
        name.append("l");
        name.append("d");
        name.append("e");
        name.append("e");
        name.append("p");
        System.out.println(name);
        //length of string in stringbuilder
        System.out.println(name.length());*/

        StringBuilder  name = new StringBuilder("hello");

        /** reverse a string **/
        /*for(int i=0; i<name.length()/2; i++ ){
            int front = i;
            int back = name.length() -1 -i; //5-1-0;

            char frontchar = name.charAt(front);
            char backchar = name.charAt(back);

            name.setCharAt(front, backchar);
            name.setCharAt(back,frontchar);
        }
        System.out.println(name);*/




























    }
}
