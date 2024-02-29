/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicejava;
import java.util.*;
/**
 *
 * @author ali
 */
public class AffichageParticulier {
    public static void main(String[] args){
        Scanner scan;
        scan = new Scanner(System.in);
        String name = scan.nextLine();
        for(int i = 0;i<name.length();i++){
            for(int j = 0;j<name.length();j++){
                if(i == j){
                    System.out.print(name.charAt(i));
                }
                System.out.print("-");
            }
            System.out.println();
        }
        
    }
    
}
