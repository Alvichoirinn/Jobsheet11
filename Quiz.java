import java.util.Random;
import java.util.Scanner;
/**
 * Quiz
 */
public class Quiz {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.println("Tebak angka(1-10): ");
                int answer = input.nextInt();
                input.nextLine();//digunakan untuk mengabaikan karakter new line 
                
                if(answer==number){
                    success = true;
                }else if(answer < number){
                    System.out.println("Apakah nilai tebakan lebih kecil");
                }else {
                    System.out.println("Apakah nilai tebakan lebih besar");
                }
            }while(!success);
            System.out.println("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        }while(menu=='y'|| menu=='Y');
        }
    }
