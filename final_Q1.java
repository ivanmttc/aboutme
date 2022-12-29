//日期：2022/12/29
//資管二b 411025180 莫天賜

import java.util.Scanner;

public class final_Q1 {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int user_input = 0;
    	long start_time;
    	long end_time;
    	
    	System.out.println("請輸入遞迴問題: 1.n階乘問題 2.求最大公因數 3.費氏數列 4.計算1~n總和 5.離開");
    	
    	while(user_input != 5) {
    		user_input = sc.nextInt();
    		
    		start_time = System.currentTimeMillis();
	    	
    		switch(user_input) {
	    		case 1:
	    			System.out.printf("請輸入想求的階層數:");
	    			System.out.printf("%d", fact(sc.nextInt()));
	    			break;
	    		case 2:
	    			System.out.print("請輸入兩個正整數求最大公因數:");
	    			System.out.printf("兩數的最大公因數是%d", GCD(sc.nextInt(),sc.nextInt()));
	    			
	    			break;
	    		case 3:
	    			System.out.printf("請輸入費氏數列的項次? :");
	    			System.out.printf("");
	    			
	    			break;
	    		case 4:
	    			System.out.printf("請問想求1~多少的總和? :");
	    			System.out.printf("%d", sum(sc.nextInt()));
	    			break;
	    		case 5:
	    			System.out.println("See You!");
	    			break;
	    		default:
	    			System.out.println("錯誤的輸入");
	    	}
    		end_time = System.currentTimeMillis();
    		System.out.println("\n程式執行時間：" + (double) (end_time - start_time) / 1000 + "s");
    	}
    }
	
	
	static int fact(int n)  //n階乘問題
	  {
	    if (n ==0)            //遞迴函數的終值
	      return 1;
	    else
	      return n * fact(n - 1); //函數自己又可以呼叫自己
	  }
	
	static int GCD(int a,int b)  //求最大公因數
	  {
	    int c;
	    c = a % b;    //取餘數
	    if (c == 0)
	        return b;
	    else
	        return GCD(b, c);  //函數自己又可以呼叫自己
	  }
	
	static long Fib(int n){   //費氏數列
	   if(n==1)
			return 1;
	   else if (n==2)
			return 1;
	   else
			return Fib(n-1)+Fib(n-2); 	
	}
	
    static int sum(int n)  //計算1~n總和
	  {
	    if (n ==1)            //遞迴函數的終值
	      return 1;
	    else
	      return n + sum(n - 1); //函數自己又可以呼叫自己
	  }
}