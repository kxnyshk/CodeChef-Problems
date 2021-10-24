import java.util.Scanner;

public class RoundRobinRanks {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();             // Testcases
        
        while(testCases>0){
            int n = scan.nextInt();                 // Total teams
            int k = scan.nextInt();                 // 'K'th team

            int points = 2*(n-k);
            points += 2*((k-1)/2);

            testCases--;
            System.out.println(points);
        }

        scan.close();
    }    
}