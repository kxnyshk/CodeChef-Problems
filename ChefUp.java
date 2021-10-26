import java.util.Arrays;
import java.util.Scanner;

public class ChefUp {
    public static void main(String[] args){
    
        // Problem statement Link: https://www.codechef.com/COOK134B/problems/CHEF7UP

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases>0){
            int N = scan.nextInt();             // Number of Officers
            Long C = scan.nextLong();           // Initial co-ordinate of Chef

            Long[] array = new Long[N];
            for(int i=0; i<N; i++){
                Long P = scan.nextLong();
                array[i] = P;
            }

            Arrays.sort(array);
            Long count = (long) 0;

            int start;
            start = startForI(N, C, array);

            int i;
            for(i=start; i>=0; i--){
                if(array[i]<C){
                    if(parity(C, array[i])){
                        count++;
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }

            int j;
            for(j=start+1; j<N; j++){
                if(array[j]>C){
                    if(parity(C, array[j])){
                        count++;
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }

            testCases--;
            System.out.println(count + " " + (count == N ? 1 : -1));
        }

        scan.close();
    }

    private static int startForI(int N, Long C, Long[] array) {
       int startIDX = -1;
        for(int i=0; i<N; i++){
            if(array[i]<C){
                startIDX = i;
            }
            else{
                break;
            }
        }
        return startIDX;
    }

    private static boolean parity(Long c, Long i) {
        if(c%2 != i%2){
            return true;
        }
        return false;
    }
}

// 2
// 2
// 2
// 1 4
// 1
// 2
// 1

// Sample Output 1 
// 1 -1
// 1 1