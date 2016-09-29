package hw;
import java.util.Scanner;
public class hw01_105021059 {
	/*假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，且媽媽交待，
	要老闆找小明的零錢的數目要最少，而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子
	，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
	請問老問需找多少個1元、5元、50元，其銅板數目最少。
	(先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，
	且a1*15+ a2*20+ a3*30小於或等於N。
	列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
	
	
	Author: 105021059 王俊鑌
	 * 
	 */
	public static void main(String[] args)  {
	Scanner scn =new Scanner(System.in);
 	int N = scn.nextInt();
 	int a1 = scn.nextInt();
 	int a2 = scn.nextInt();
 	int a3 = scn.nextInt();
 	int a = a1*15+a2*20+a3*30 ; 
 	int C = N-a;
 	if (N < a){
 		System.out.print("0");}
 	 else {
 		  if( N>=a )
	 System.out.print( (C)/50 + " 個50元\t");
	  if((C)%50 != 0)
	 System.out.print( ((C)%10)/5 + " 個5元\t"); 
	  if((C)%5 != 0)
	 System.out.print(  (C%10)%5 + " 個1元"); 
	  
		  }		
    }
}