import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int humidity=in.nextInt();
     int MaxTime=in.nextInt();
     int flag=0;
     for (int i=1;i<MaxTime;i++){
      
      if (((-6*(i*i*i*i))+(humidity*(i*i*i))+(2*(i*i))+i)<=0){
        System.out.println("The balloon first touches ground at hour:\n"+i);
        flag=1;
        break;
      }

     }
      if (flag==0)
        System.out.println("The balloon does not touch ground in the given time.");
  }
}
