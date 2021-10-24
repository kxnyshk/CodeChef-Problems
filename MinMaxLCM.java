import java.util.Scanner;

public class MinMaxLCM {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();             // Testcases
        
        while(testCases>0){
            long X = scan.nextInt();
            long K = scan.nextInt();

            long min = MinLCM(X, K);
            long max = MaxLCM(X, K);

            testCases--;
            System.out.println(min + " " + max + "\n");
        }

        scan.close();
    }

    private static long MaxLCM(long x, long k) {
        long max;
        max = (x*k)*((x*k)-1);
        return max;
    }

    private static long MinLCM(long x, long k) {
        long min;
        min = 2*x;
        return min;
    }
}
