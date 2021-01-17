import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     String letter = "IOSHZXN";
     String input=in.nextLine();  
     int flag=1;   
     for (int i=0;i<input.length();i++){
       flag=0;
       for (int j=0;j<letter.length();j++){
  
       if (letter.charAt(j)==input.charAt(i)){
          flag=1;
       }
      


        
      }
      if (flag==0){System.out.println("NO");break;}
      

    }
    if (flag==1)
     System.out.println("YES");  

  }
}
