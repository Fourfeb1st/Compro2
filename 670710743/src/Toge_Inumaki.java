import java.util.Scanner;

public class Toge_Inumaki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sai = {"Shake", "Okaka", "Konbu", "Takana", "Tuna", "Tunamayo","Sujiko","Mentaiko"};
        String[] mean ={"Yes", "No", "Hi", "How are you", "focas", "Serious matter", "Mmm", "Combat"};
        String str = sc.nextLine();

        for(int i=0;i<8;i++){
            if(str == sai[i]){
                System.out.println(mean[i]);
            }
        }


    }
}
