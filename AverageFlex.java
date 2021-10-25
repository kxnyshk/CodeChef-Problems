import java.util.Scanner;

public class AverageFlex {
    public static void main(String[] args){
    
        // Problem statement Link: https://www.codechef.com/COOK134B/problems/AVGFLEX

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases>0){
            int N = scan.nextInt();
            int[] array = new int[N];
            
            for(int i=0; i<N; i++){
                int A = scan.nextInt();
                array[i] = A;
            }

            int ans = 0;
            for(int i=0; i<N; i++){
                int count = 0;

                for(int j=0; j<N; j++){
                    if(array[i]>=array[j]){
                        count++;
                    }
                }

                if(count>N-count){
                    ans++;
                }
            }

            testCases--;
            System.out.println(ans);
        }

        scan.close();
    }
}

// Sample Input 1 
// 3
// 3
// 100 100 100
// 3
// 2 1 3
// 4
// 30 1 30 30

// Sample Output 1 
// 3
// 2
// 3
