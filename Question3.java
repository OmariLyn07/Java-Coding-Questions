//Write a function that rotates a list by k elements.
/*For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2].
 * Try solving this without creating a copy of the list. How many swap
 * or move operations do you need?
*/
public class Question3 {
    public static void rotate(int[] a1, int k){
        for(int i = 0; i < k; i++){
            swap(a1);
        }
        
    }

    public static int[] swap(int[] a1){
        int tempLast = a1[0];
        int elem = 0;

        while(elem < a1.length - 1){
            a1[elem] = a1[elem + 1];
            elem++;
        }
        a1[a1.length - 1] = tempLast;
        return a1;
    }

    public static void main(String args[]){
        int[] ans = {1,2,3,4,5,6};
        rotate(ans, 2);

        for(int l : ans){
            System.out.print(l + " ");
        }
    }
}
