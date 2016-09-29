package hw;
import java.util.Scanner;
public class hw02_105021059 {
/*已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6；
 * 試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * 
 * Author: 105021059 王俊鑌
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int c = scn.nextInt();
		int a = scn.nextInt();
		double b =0;
		if(a == 1 ){ 
		 b = (c-80)*0.7;}
		else if(a == 2){
		b = (c-70)*0.6;
		}
      System.out.print(b);
	}

}
