import java.util.Scanner;

public class IintegerP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);

        try {
            int y = Integer.parseInt("xx");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Not found");
        }
    }
}
