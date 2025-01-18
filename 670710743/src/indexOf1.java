import java.util.Scanner;

public class indexOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String msg = sc.nextLine();
        int index = str.indexOf(msg);

        if(index <= -1){
            System.out.println("strinf not found");
        }
        else{
            System.out.println(index+1);
        }
    }
}
