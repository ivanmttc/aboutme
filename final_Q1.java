//����G2022/12/29
//��ޤGb 411025180 ���ѽ�

import java.util.Scanner;

public class final_Q1 {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int user_input = 0;
    	long start_time;
    	long end_time;
    	
    	System.out.println("�п�J���j���D: 1.n�������D 2.�D�̤j���]�� 3.�O��ƦC 4.�p��1~n�`�M 5.���}");
    	
    	while(user_input != 5) {
    		user_input = sc.nextInt();
    		
    		start_time = System.currentTimeMillis();
	    	
    		switch(user_input) {
	    		case 1:
	    			System.out.printf("�п�J�Q�D�����h��:");
	    			System.out.printf("%d", fact(sc.nextInt()));
	    			break;
	    		case 2:
	    			System.out.print("�п�J��ӥ���ƨD�̤j���]��:");
	    			System.out.printf("��ƪ��̤j���]�ƬO%d", GCD(sc.nextInt(),sc.nextInt()));
	    			
	    			break;
	    		case 3:
	    			System.out.printf("�п�J�O��ƦC������? :");
	    			System.out.printf("");
	    			
	    			break;
	    		case 4:
	    			System.out.printf("�аݷQ�D1~�h�֪��`�M? :");
	    			System.out.printf("%d", sum(sc.nextInt()));
	    			break;
	    		case 5:
	    			System.out.println("See You!");
	    			break;
	    		default:
	    			System.out.println("���~����J");
	    	}
    		end_time = System.currentTimeMillis();
    		System.out.println("\n�{������ɶ��G" + (double) (end_time - start_time) / 1000 + "s");
    	}
    }
	
	
	static int fact(int n)  //n�������D
	  {
	    if (n ==0)            //���j��ƪ��׭�
	      return 1;
	    else
	      return n * fact(n - 1); //��Ʀۤv�S�i�H�I�s�ۤv
	  }
	
	static int GCD(int a,int b)  //�D�̤j���]��
	  {
	    int c;
	    c = a % b;    //���l��
	    if (c == 0)
	        return b;
	    else
	        return GCD(b, c);  //��Ʀۤv�S�i�H�I�s�ۤv
	  }
	
	static long Fib(int n){   //�O��ƦC
	   if(n==1)
			return 1;
	   else if (n==2)
			return 1;
	   else
			return Fib(n-1)+Fib(n-2); 	
	}
	
    static int sum(int n)  //�p��1~n�`�M
	  {
	    if (n ==1)            //���j��ƪ��׭�
	      return 1;
	    else
	      return n + sum(n - 1); //��Ʀۤv�S�i�H�I�s�ۤv
	  }
}