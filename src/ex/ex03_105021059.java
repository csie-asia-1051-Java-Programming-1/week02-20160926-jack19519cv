package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021059 王俊鑌
 */
import java.util.Scanner;
public class ex03_105021059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a = scn.nextInt(); 
		int b = scn.nextInt(); 
		int c = scn.nextInt(); 
		int d = scn.nextInt(); 
		int e = 0;
        double t=((c*60)+d)-((a*60)+b);
        int t1 = (int)(t/30); 
        if (t<=120){
        	System.out.println(t1*30);}
        	else if (t>=120 && t<=240){
        		System.out.println((t1-4)*40+120);}
        		else if(t>=240){
        			System.out.println((t1-8)*60+280);}
        
        }

	}
