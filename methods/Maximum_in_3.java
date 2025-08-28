package methods;

public class Maximum_in_3 {    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max = maximum(a,b,c);
        System.out.println(max);
    }
    public static int maximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
}
