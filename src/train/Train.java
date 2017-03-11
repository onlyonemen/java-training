package train;

import java.util.Scanner;
import java.util.Random;

public class Train{

	public void avarage(){
		Scanner in=new Scanner(System.in);
		int a=0,sum=0,avarage,i=0;

		while(true){
			a=in.nextInt();
			if(a==-1){
				break;
			}
			i++;
			sum+=a;
		}
		avarage=sum/i;
		System.out.println(avarage);

	}

	public void randomMax(){
		int i=0,a=0,max=0;
		Random r=new java.util.Random(); 
		while(i++<10){
			a=r.nextInt(100);
			System.out.println(i+"."+a+" ");
			if(a>max){
				max=a;
			}
		}
		System.out.println("\nmax is:"+max);
	}
	
	public void isSameString(){
		String a="abc",b="abc";//a=b
		String a_new= new String("abc");
		String b_new= new String("abc");
		System.out.printf("a=b is:");
		System.out.println(a==b);//true
		System.out.printf("a=a_new is:");
		System.out.println(a==a_new);//false
		System.out.printf("a_new=b_new is:");
		System.out.println(b_new==a_new);//false
	}
}