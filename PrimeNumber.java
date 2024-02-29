package exercicejava;
import java.util.*;

public class NombrePremier {
    
    private static boolean estPremier(int nb) {
        if (nb <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(nb); i++) {
            if (nb % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        if (estPremier(num)) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}
