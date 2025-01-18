import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int A =0;
        int B=0;

        for(int i=0;i<N;i++){
            int x =scan.nextInt();
            a[i] = x;
        }

        for(int i=0;i<N;i++){
            int y =scan.nextInt();
            b[i] = y;
        }

        for(int i=0;i<N;i++){
            if(a[i]>b[i]){
                A+=2;
                B+=0;
            }
            else if(a[i]<b[i]){
                B+=2;
                A+=0;
            }
            else{
                A+=1;
                B+=1;
            }
        }

        if(A>B){
            System.out.println("Team 1 wins");
            System.out.println("Score "+ A +" to " +B);
        }
        else if(B>A){
            System.out.println("Team 2 wins");
            System.out.println("Score "+ B +" to " +A);
        }
        else{
            System.out.println("Draw game");
            System.out.println("Score "+ A +" to " +B);
        }

    }
}
