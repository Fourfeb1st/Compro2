import java.util.Scanner;

public class SubMatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String msg = sc.nextLine();
        //int index = str.indexOf(msg);

        String[] result = new String[3];
        for(int i=0;i<3;i++){
            result[i] = msg.substring(i, i+3);
        }

        for(String substring : result){
            int index = str.indexOf(substring);
            if(index != -1){
                System.out.println(index+1);
            }
            else{
                System.out.println("No");
            }
        }
    }
}
