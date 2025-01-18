import java.util.Scanner;

public class IndexAndValue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            arr[i]=x;
        }

        for(int i=0;i<2;i++){
            int ind = sc.nextInt();
            if(ind < 0){
                System.out.println("-1");
                count+=0;
            }
            if(ind < N){
                System.out.println(arr[ind]);
                count+=1;
            }
            else{
                System.out.println("-1");
                count+=0; 
            }
        }
        System.out.println(count);
        
    }
}
