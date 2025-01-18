import java.util.Scanner;

public class DefensiveWall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        int K = sc.nextInt();
        for(int i=0;i<K;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a > N || a ==0){
                System.out.println("invalid position");
            }else{
                arr[a-1] += b;
                System.out.println(arr[a-1]);
            }
        }

        int S = sc.nextInt();
        int count = 0;

        for(int i=0;i<N;i++){
            if(arr[i] < S){
                System.out.print(i+1 + " ");
            }
            else if(arr[i] >= S){
                count+=1;
                //System.out.println(count);
            }
        }

        if(count >= N){
            System.out.print("ready");
        }
    }
}
