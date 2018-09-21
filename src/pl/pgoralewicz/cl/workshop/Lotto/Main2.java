package pl.pgoralewicz.cl.workshop.Lotto;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] nums = new int [6];
        Scanner scanner = new Scanner(System.in);

        //wpisywanie liczb uzytkownika
        System.out.println("Wpisz 6 liczb całowitych z zakresu 1-49");
        for(int i = 0; i < nums.length; i++){
            nums[i] = scanInt();
        }
        Arrays.sort(nums);

        //Sprawdzenie czy liczby się nie powtażają
        for(int i = 1; i < nums.length; i++){
            while(nums[i - 1] == nums[i]){
                System.out.println("Liczba " + nums[i] +
                        " powtarza się, podaj inną liczbę!");
                nums[i] = scanInt();
                Arrays.sort(nums);
                i = 1;
            }
        }

        
    }
    static int scanInt(){
        //walidated int input
        int n;
        Scanner scan = new Scanner(System.in);
        while(true){
            if(!scan.hasNextInt()){
                scan.next();
                System.out.println("Podaj liczbę");
            }else{
                n = scan.nextInt();
                while(n > 49 || n < 1){
                    System.out.println("Liczba musi byc z zakresu 1 49");
                    n = scanInt();
                }
                break;
            }
        }
        return n;
    }
}
