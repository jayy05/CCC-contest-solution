import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int[][] magicSquare = new int[4][4];
     for (int i=0;i<4;i++){
     for (int j=0;j<4;j++){
     magicSquare[i][j] = in.nextInt();
     }
     }
     int[] sum = new int[8];
     for (int i=0;i<4;i++){
       sum[i]=0;
     }
     for (int i=0;i<4;i++){
     for (int j=0;j<4;j++){
      /*System.out.print(magicSquare[i][j]+" ");*/
     sum[i]=sum[i]+magicSquare[i][j];
     }


     }
for (int i=0;i<4;i++){
      /*System.out.print(magicSquare[i][j]+" ");*/
     sum[4]+=magicSquare[0][i];
     sum[5]+=magicSquare[1][i];
     sum[6]+=magicSquare[2][i];
     sum[7]+=magicSquare[3][i];


     }
    int magic=1;
    for (int i=0;i<7;i++){
      if(sum[i]!=sum[i+1]){
        System.out.println("not magic");
    magic=0;
    break;
      }
    }
  if(magic==1)
  System.out.println("magic");
 }
}
