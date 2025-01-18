import java.util.Scanner;

public class SlotRsv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N+1];

        int K = scan.nextInt();
        int P = scan.nextInt();
        for(int p=0;p<P;p++){
            int i = scan.nextInt();
            if(A[i] < K){
                A[i]+=1;
                System.out.println("1");
            }
            else{
                B[i]+=1;
                System.out.println("2");
            }
        }

        for(int i=1;i<=N;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println( );
        for(int i=1;i<=N;i++){
            System.out.print(B[i] + " ");
        }
        System.out.println( );
    }
}
