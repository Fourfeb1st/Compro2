import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] word = new String[N];
        String[] check = new String[10];

        for(int i=0;i<N;i++){
            word[i] = sc.next();
        }

        for(int i=0;i<10;i++){
            check[i] = sc.next();

        }
        for(int i=0;i<10;i++){
            boolean found = false;
            for(int j=0;j<N;j++){
                if(word[j].equals(check[i])){
                    found = true;
                    break;
                    //System.out.print("1");
                }
            }
            if(found){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
    }
}
