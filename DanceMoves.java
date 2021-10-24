import java.util.Scanner;

public class DanceMoves {
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();             // Testcases

        while(testCases>0){
            long X = scan.nextInt();                 // Chef's position
            long Y = scan.nextInt();                 // Partner's position

            long moves;
            if(X>Y){
                moves = X-Y;
                System.out.println(moves + "\n");
            }
            else if(Y>X){
                long count = 0;
                while(Y>X){
                    X += 2;
                    count++;
                }
                while(X>Y){
                    X--;
                    count++;
                }
                System.out.println(count + "\n");
            }
            else{
                System.out.println("0\n");
            }

            testCases--;
        }

        scan.close();
    }
}

// test cases 
// 3 8
// -11 -5
// 57 492
// -677 913

// outputs
// 4
// 3
// 219
// 795