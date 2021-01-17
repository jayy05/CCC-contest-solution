import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     double weight=in.nextDouble();
     double height=in.nextDouble();
     double BMI=weight/(height*height);
     if (BMI>25)
      System.out.println("Overweight"); 
     else if (BMI>=18.5&&BMI<=25)
      System.out.println("Normal weight"); 
     else if (BMI<18.5)
      System.out.println("Underweight"); 
      
  }
}
