

/*
 * @author ryanh
 */
import java.util.Scanner;
public class average {
    /*
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        
        Scanner scanner = new Scanner(System.in);

        // TODO code application logic here
        int first, second, third;
        
        
        System.out.println("Calculate the average program");
        
        System.out.println("------------------------------");
        
        System.out.println("First number = ");
        first = scanner.nextInt();
        
        System.out.println("Second number = ");
        second = scanner.nextInt();
        
        System.out.println("Third number = ");
        third = scanner.nextInt();
        
        System.out.println("------------------------------");
        
        System.out.println("average = " + ( first + second + third)/ 3);        
    }
}
