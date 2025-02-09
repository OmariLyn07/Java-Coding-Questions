//Write a function that merges two sorted lists into a new sorted list
//[1,4,6], [2,3,5] -> [1,2,3,4,5,6].
//Can you do this quicker than concatenating them followed by a sort
import java.util.*;
public class Question2 {
    public static ArrayList<Integer> mergeLists(int[] a1, int[] a2){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < a1.length; i++){
            res.add(a1[i]);
        }
        for(int j = 0; j < a2.length; j++){
            res.add(a2[j]);
        }

        Collections.sort(res);
        return res;
    }

    public static void main(String args[]){
        int[] a = {1,4,6};
        int[] b = {2,3,5};
        ArrayList<Integer> r = mergeLists(a, b);

        System.out.println(r.toString());
    }
}
