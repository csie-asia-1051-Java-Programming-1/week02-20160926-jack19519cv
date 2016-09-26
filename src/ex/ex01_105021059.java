package ex;

import java.util.Scanner;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021059 王俊鑌
 */
public class ex01_105021059 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
			float p = 0.5f;
			int n = scn.nextInt();
			float d=0;
			if(n<600){
				d = (float)(n*p);
			}else{
				if(n<=1200 && n>=600 ){
					d = (float)(n*p*0.9);
				
				}else{
					d = (float)(n*p*0.79);
					
				}
			
			}
			System.out.print("電話費:" + d);
}
}
