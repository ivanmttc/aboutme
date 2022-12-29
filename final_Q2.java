import java.util.Scanner;
public class final_Q2 {
	static int h = 0, n = 0;
	static int BinTree[] = new int[1024];
	
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int user_input = 0;
    	
    	long start_time;
    	long end_time;
    	
    	System.out.println("�п�J�п�J�G���𪺰���:");
    	h = sc.nextInt();
    	n = (int) Math.pow(2, h);
    	System.out.print("�п�J�o�ʾ𪺰}�C��ܪk:");
		for(int i=1;i<Math.pow(2, h);i++) {
			BinTree[i] = sc.nextInt();
		}
    	
    	while(user_input != 5) {
    		System.out.println("�п�J�ƧǤ覡 1.�P�_���w���G���𪺤����`�I�P�𸭸`�I���Ӽ� 2.�e�Ǧ��G������X 3.���Ǧ��G������X 4.��Ǧ��G������X 5.���}");
    		user_input = sc.nextInt();
    		
    		start_time = System.currentTimeMillis();
	    	
    		switch(user_input) {
	    		case 1:
	    			
	    			break;
	    		case 2:
	    			System.out.printf("\n�Q�� Preoder �ӫ��X�@�ʰ��׬� %d ���G����",h);

	    	        System.out.printf("\n�o�ʤG���𪺰}�C��ܪk�G");
	    	        for(int i=1;i<n;i++)
	    	           {
	    	           	 System.out.printf(" %3d",BinTree[i]);
	    	           }

	    	         System.out.printf("\n\n�i�� Preorder Tree Traversal ���B�z\n",h);
	    	         // �i�� Preorder Tree Traversal ���B�z

	    	         PreorderTraversal(1);
	    			break;
	    		case 3:
	    			System.out.printf("\n�Q�� Inoder �ӫ��X�@�ʰ��׬� %d ���G����",h);

	    	        System.out.printf("\n�o�ʤG���𪺰}�C��ܪk�G");
	    	        for(int i=1;i<n;i++)
	    	           {
	    	           	 System.out.printf(" %3d",BinTree[i]);
	    	           }

	    	         System.out.printf("\n\n�i�� Inorder Tree Traversal ���B�z\n",h);
	    	         // �i�� Inorder Tree Traversal ���B�z

	    	         InorderTraversal(1);
	    			break;
	    		case 4:
	    			System.out.printf("\n�Q�� Postorder �ӫ��X�@�ʰ��׬� %d ���G����",h);

	    	        System.out.printf("\n�o�ʤG���𪺰}�C��ܪk�G");
	    	        for(int i=1;i<n;i++)
	    	           {
	    	           	 System.out.printf(" %3d",BinTree[i]);
	    	           }

	    	         System.out.printf("\n\n�i�� Postorder Tree Traversal ���B�z\n",h);
	    	         // �i�� Postorder Tree Traversal ���B�z

	    	         PostorderTraversal(1);
	    			break;
	    		case 5:
	    			System.out.println("See You!");
	    			break;
	    		default:
	    			System.out.println("���~����J");
	    	}
    		end_time = System.currentTimeMillis();
    		System.out.println("\n�{������ɶ��G" + (double) (end_time - start_time) / 1000 + "s\n");
    	}
    }
	
	static int BinaryTreeNodeAnalysis(int h, int[] bin_tree) {
		int NoLeafNode = 0;
        int NoInternalNode = 0;
		for(int i=1;i<n;i++)
        {
        	 if ( bin_tree[i] != 0 )
        	    {
        	       int value = IsLeaf(i);
                if ( value == 1 )
        	          {
        	 	        NoLeafNode++;
        	 	        System.out.printf("\n �`�I�s�� %3d | �ƭȬ� %3d, ���O�𸭸`�I (leaf node)",i,bin_tree[i]);
        	          }
                else
        	          {
        	 	        NoInternalNode++;
        	 	        System.out.printf("\n �`�I�s�� %3d | �ƭȬ� %3d, ���O�����`�I (internal node)",i,bin_tree[i]);
        	          }
        	    }
        }
		
      System.out.printf("\n\t�����`�I���ӼƬ� %3d",NoInternalNode);
      System.out.printf("\n\t�𸭸`�I���ӼƬ� %3d",NoLeafNode);
      return 0;
	}
	
	 static int IsLeaf(int no)
	    {
	      // �T�h���G����A�u���s�� 1, 2, 3 ���~���i��O�����`�I
	      //                   �s�� 1, 2, 3 ���`�I�٭n�A�ˬd�O�_�����䪺�Ĥl�άO�k�䪺�Ĥl
	      //                             ==> ( BinTree[2*i]!=0 || BinTree[2*i+1]!=0 )  1 <= i <=3
	      //                   �s�� 4, 5, 6, 7 ���@�w�O�𸭸`�I

	  	  if ( no < n/2 )
	    	 {
	   	  	   if ( ( BinTree[2*no]!=0) || ( BinTree[2*no+1]!=0 ) )
	   	  	      {
	   	  	    	return (0);
	   	  	      }
	   	  	   else
	   	  	      {
	   	  	      	return (1);
	   	  	      }
	  	     }
	  	  else
	  	     {
	       	   return (1);
	  	     }
	 }
	 
	 public static void PreorderTraversal(int no)    //�e�Ǧ�
	    {
	      if ( BinTree[no] != 0 )
	         {
	           // �B�z�ثe����ڸ`�I, ������X
	           System.out.printf("%3d ",BinTree[no]);

	           if ( no < n/2 )
	              {
	                 if ( BinTree[2*no] !=0 )
	                    {
	                      PreorderTraversal(2*no);
	                    }

	                 if ( BinTree[2*no+1] !=0 )
	                    {
	                      PreorderTraversal(2*no+1);
	                    }
	              }
	         }
	    }
	 
	 static void InorderTraversal(int no)  //���Ǧ�
	    {
	      if ( BinTree[no] != 0 )
	         {
	           if ( 2*no < n/2 )
	              {
	                InorderTraversal(2*no);
	              }
	           else
	              {
	              	if ( BinTree[2*no] != 0 )
	              	   {
	              	   	 System.out.printf("%3d ",BinTree[2*no]);
	                   }
	              }

	           // �B�z�ثe����ڸ`�I, ������X
	           System.out.printf("%3d ",BinTree[no]);

	           if ( ( 2*no+1 ) < n/2 )
	              {
	                InorderTraversal(2*no+1);
	              }
	           else
	              {
	              	if ( BinTree[2*no+1] != 0 )
	              	   {
	              	   	 System.out.printf("%3d ",BinTree[2*no+1]);
	                   }
	              }
	         }
	    }
	 
	 public static void PostorderTraversal(int no)   //��Ǧ�
	    {
	      if ( BinTree[no] != 0 )
	         {

	           if ( no < n/2 )
	              {
	                 if ( BinTree[2*no] !=0 )
	                    {
	                      PostorderTraversal(2*no);
	                    }

	                 if ( BinTree[2*no+1] !=0 )
	                    {
	                      PostorderTraversal(2*no+1);
	                    }
	              }

	           // �B�z�ثe����ڸ`�I, ������X
	           System.out.printf("%3d ",BinTree[no]);

	         }
	    }
}