import java.util.Scanner;

public class GeneticCode_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int start = -1;
        int end = -1;

        while ((start = input.indexOf('<', start+1)) != -1) {
            end = input.indexOf('>', start+1);

            if(end!= -1){
                String result = input.substring(start +1, end);
                System.out.println(result);
            }
        }
    }
}
