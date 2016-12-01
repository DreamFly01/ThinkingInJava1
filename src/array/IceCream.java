package array;

/**
 * Created by dell on 2016/11/30.
 */
public class IceCream {
    static String [] flav = {
      "Cocolate ","Strawberry","Vanilla Fudge Swirl","Rum Raisin","Praline Cream","Mud Pie"
    };
    static String[] flavorSet(int n){
        n = Math.abs(n)%(flav.length+1);
        String [] results = new String [n];
        int [] picks = new int[n];
        for (int i = 0; i < picks.length; i++) {
            picks[i] = -1;
        }
        for (int i = 0; i < picks.length; i++) {
            retry:
            while (true){
                int t = (int)(Math.random()*flav.length);
                for (int j = 0; j < i; j++) {
                    if (picks[j] ==t) {
                        continue retry;
                    }
                    picks[i] = t;
                    results[i] = flav[t];
                    break ;
                }
            }
        }
            return results;
    }
    public static void main (String [] args){
        for (int i = 0; i < 20; i++) {
            System.out.println("flavorSet("+i+") = ");
            String [] f1 = flavorSet(flav.length);
            for (int j = 0; j < f1.length; j++) {
                System.out.println("\t"+f1[j]);
            }
        }
    }
}
