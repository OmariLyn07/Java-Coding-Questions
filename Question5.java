/*Write a function that takes a number and returns a list of its digits.
 * So for 2342 it should return [2,3,4,2].
 */
public class Question5 {
    static int[] digits(int n){
        String s = String.valueOf(n);
        int[] box = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            box[i] = Character.getNumericValue(s.charAt(i));
        }

        return box;
    }

    public static void main(String[] args) {
        int[] b = digits(2342);

        for(int i : b){
            System.out.println(i);
        }
        System.out.println(b.toString());
    }
    
}
