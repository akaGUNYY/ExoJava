import java.util.*;

public class ConversionBinDecimal {
    public static void main(String[] args) {
        int NombreDecimal, temp, i = 0;
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Entrez un nombre décimal : ");
        NombreDecimal = scan.nextInt();
        
        temp = NombreDecimal;
        int taille = countBits(temp);
        int NombreBinaire[] = new int[taille];
        int res;
        
        
        while (temp != 0) {
            res = temp % 2;
            NombreBinaire[i++] = res;
            temp /= 2;
        }
        
        
        System.out.print("Le nombre binaire équivalent est : ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(NombreBinaire[j]);
        }
        System.out.println();
    }

   
    public static int countBits(int number) {
        
        if (number == 0) {
            return 1;
        }
        
        return (int) Math.ceil(Math.log(number + 1) / Math.log(2));
    }
}
