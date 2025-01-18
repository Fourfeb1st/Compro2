import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String search = sc.nextLine();
        int msg = str.indexOf(search);

        if(msg <= -1){
            System.out.println("string not found");
        }
        int cnt = 0;
        for(int i=0;i<str.length();i++){
            msg = str.indexOf(search,i);
            i = msg;
            if(msg <= -1){
                break;
            }
            System.out.print(msg+1 + " ");
        }

    }
}