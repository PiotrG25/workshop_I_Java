package pl.pgoralewicz.cl.workshop.find_random_number2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int assumed = 500, tries = 1;
        int low = 0, high = 1001;
        String text;

        System.out.println("Pomysl o liczbie z zakresu 1-1000");
        System.out.println("Mów \"mniej\", \"wiecej\", \"trafiles\"");
        System.out.println("Próba nr. " + tries + ", zgaduję, że to: " + assumed);

        while(true){
            text = scanner.next();

            if(text.equals("wiecej")){
                if(assumed + 1== high){
                    System.out.println("Oszukujesz! :(");
                    break;
                }
                low = assumed;
                assumed = low + (high - low) / 2;

            }else if(text.equals("mniej")){
                if(assumed == low + 1){
                    System.out.println("Oszukujesz! :(");
                    break;
                }
                high = assumed;
                assumed = low + (high - low) / 2;

            }else if(!text.equals("trafiles")){
                System.out.println("NICHT FERSTECHEN!!!");
                continue;
            }

            if(!text.equals("trafiles")){
                tries++;
                System.out.println("Próba nr. " + tries + ", zgaduję, że to: " + assumed);
            }else{
                System.out.println("Hurra!");
                break;
            }
        }
    }
}
