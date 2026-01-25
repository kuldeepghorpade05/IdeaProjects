import java.util.ArrayList;
import java.util.*;

class Q19_rearrange_pos_neg_variety2{
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));
        ArrayList<Integer> ans = rearrange(arr);

//        System.out.println(Arrays.toString(ans.toArray()));
          System.out.println(ans);

    }

    static ArrayList<Integer> rearrange(ArrayList<Integer> arr){

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // adds pos and negatives to pos ans neg arraylist
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) < 0){
                pos.add(arr.get(i));
            }else {
                neg.add(arr.get(i));
            }
        }

        //adding pos and neg aternatively and adding left over pos or neg
        if(pos.size() > neg.size()){


            for(int i=0; i<neg.size(); i++){
                arr.set(2*i,pos.get(i));
                arr.set(2*i+1,neg.get(i));
            }

            int index = neg.size() * 2;
            for(int i=neg.size(); i<pos.size(); i++){
                arr.set(index,pos.get(i));
                index++;
            }

        }

        else {

            // adding pos in pair with neg untit it exceds
            for(int i=0; i<pos.size(); i++){
                arr.set(2*i,pos.get(i));
                arr.set(2*i+1,neg.get(i));
            }

            //to add left over negatives
            int index = pos.size() * 2;
            for(int i=pos.size(); i< neg.size(); i++){
                arr.set(index, neg.get(i));
                index++;
            }

        }
        return arr;
    }





}