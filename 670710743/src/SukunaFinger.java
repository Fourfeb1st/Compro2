import java.util.Scanner;

public class SukunaFinger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fingerRight = 0;
        int fingerLeft = 0;
        int jubustsu = 0;
        int sumfinger = 0;

        while (true) {
            int finger = sc.nextInt();
            
            if(finger <= 0){
                break;
            }
            else if(finger > 0){
                if(finger < 100 || finger >=1000){
                    System.out.println("JUBUTSU !");
                    jubustsu+=1;
                }
                else{
                    int z = finger/100;
                    int y = (finger%100)/10;
                    int x = finger%10;
                    int sum = x+y+z;
                    if(sum>9){
                        int a = sum/10;
                        int b = sum%10;
                        sum = a+b;
                        //System.out.println(sum);
                    }

                    sumfinger+=1;
                    if(sumfinger > 20){
                        fingerLeft+=0;
                        fingerRight+=0;
                        sumfinger = 20;
                        System.out.println("JUBUTSU !");
                        jubustsu+=1;
                    }
                    else if(sum % 2 == 0){
                        fingerRight+=1;
                        //sumfinger+=1;
                    }
                    else{
                        fingerLeft+=1;
                        //sumfinger+=1;
                    }
                    
                    if(fingerLeft >20 || fingerRight >20){
                        System.out.println("JUBUTSU !");
                        jubustsu+=1;
                    }
                    /*if(fingerRight >= 20){
                        fingerLeft = 0;
                        fingerRight =20;
                    }
                    else if(fingerLeft >= 20){
                        fingerRight = 0;
                        fingerLeft = 20;
                    }*/
                }
            }
            
        }

        System.out.println("Sukuna's right finger "+ fingerRight);
        System.out.println("Sukuna's left finger "+ fingerLeft);
        System.out.println("Sukuna's finger "+ sumfinger);
        System.out.println("jubutsu "+ jubustsu);

    }
}
