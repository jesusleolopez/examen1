/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculasporcentaje;
import java.util.Scanner;
  /**
 *
 * @author labcca
 */
public class CalculasPorcentaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("ingresar precio del producto: ");
        double precio1 = scanner.nextDouble();
        
        double precio2 = scanner.nextDouble(); 
        
        double precio3 = scanner.nextDouble(); 
        
        double desc30 = precio1 * 0.30;       
        
        double preciofinal1 = precio1 - desc30; 
        
        double desc65 = precio2 * 0.65;       
        
        double preciofinal2= precio2 - desc65;  
        
        double desc15 = precio3 * 0.15;       
        
        double preciofinal3= precio3 - desc15;     
        
        System.out.println("el precio final del producto1 es: " + preciofinal1);
        
        System.out.println("el precio filan del producto2 es: " + preciofinal2);
        
        System.out.println("el precio filan del producto3 es: " + preciofinal3);
        
        
            
    }
    
}
