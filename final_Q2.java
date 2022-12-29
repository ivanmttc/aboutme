import java.util.Scanner;
public class final_Q2 {
	static int h = 0, n = 0;
	static int BinTree[] = new int[1024];
	
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int user_input = 0;
    	
    	long start_time;
    	long end_time;
    	
    	System.out.println("請輸入請輸入二元樹的高度:");
    	h = sc.nextInt();
    	n = (int) Math.pow(2, h);
    	System.out.print("請輸入這棵樹的陣列表示法:");
		for(int i=1;i<Math.pow(2, h);i++) {
			BinTree[i] = sc.nextInt();
		}
    	
    	while(user_input != 5) {
    		System.out.println("請輸入排序方式 1.判斷給定的二元樹的內部節點與樹葉節點的個數 2.前序式二元樹拜訪 3.中序式二元樹拜訪 4.後序式二元樹拜訪 5.離開");
    		user_input = sc.nextInt();
    		
    		start_time = System.currentTimeMillis();
	    	
    		switch(user_input) {
	    		case 1:
	    			
	    			break;
	    		case 2:
	    			System.out.printf("\n利用 Preoder 來拜訪一棵高度為 %d 的二元樹",h);

	    	        System.out.printf("\n這棵二元樹的陣列表示法：");
	    	        for(int i=1;i<n;i++)
	    	           {
	    	           	 System.out.printf(" %3d",BinTree[i]);
	    	           }

	    	         System.out.printf("\n\n進行 Preorder Tree Traversal 的處理\n",h);
	    	         // 進行 Preorder Tree Traversal 的處理

	    	         PreorderTraversal(1);
	    			break;
	    		case 3:
	    			System.out.printf("\n利用 Inoder 來拜訪一棵高度為 %d 的二元樹",h);

	    	        System.out.printf("\n這棵二元樹的陣列表示法：");
	    	        for(int i=1;i<n;i++)
	    	           {
	    	           	 System.out.printf(" %3d",BinTree[i]);
	    	           }

	    	         System.out.printf("\n\n進行 Inorder Tree Traversal 的處理\n",h);
	    	         // 進行 Inorder Tree Traversal 的處理

	    	         InorderTraversal(1);
	    			break;
	    		case 4:
	    			System.out.printf("\n利用 Postorder 來拜訪一棵高度為 %d 的二元樹",h);

	    	        System.out.printf("\n這棵二元樹的陣列表示法：");
	    	        for(int i=1;i<n;i++)
	    	           {
	    	           	 System.out.printf(" %3d",BinTree[i]);
	    	           }

	    	         System.out.printf("\n\n進行 Postorder Tree Traversal 的處理\n",h);
	    	         // 進行 Postorder Tree Traversal 的處理

	    	         PostorderTraversal(1);
	    			break;
	    		case 5:
	    			System.out.println("See You!");
	    			break;
	    		default:
	    			System.out.println("錯誤的輸入");
	    	}
    		end_time = System.currentTimeMillis();
    		System.out.println("\n程式執行時間：" + (double) (end_time - start_time) / 1000 + "s\n");
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
        	 	        System.out.printf("\n 節點編號 %3d | 數值為 %3d, 它是樹葉節點 (leaf node)",i,bin_tree[i]);
        	          }
                else
        	          {
        	 	        NoInternalNode++;
        	 	        System.out.printf("\n 節點編號 %3d | 數值為 %3d, 它是內部節點 (internal node)",i,bin_tree[i]);
        	          }
        	    }
        }
		
      System.out.printf("\n\t內部節點的個數為 %3d",NoInternalNode);
      System.out.printf("\n\t樹葉節點的個數為 %3d",NoLeafNode);
      return 0;
	}
	
	 static int IsLeaf(int no)
	    {
	      // 三層的二元樹，只有編號 1, 2, 3 的才有可能是內部節點
	      //                   編號 1, 2, 3 的節點還要再檢查是否有左邊的孩子或是右邊的孩子
	      //                             ==> ( BinTree[2*i]!=0 || BinTree[2*i+1]!=0 )  1 <= i <=3
	      //                   編號 4, 5, 6, 7 的一定是樹葉節點

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
	 
	 public static void PreorderTraversal(int no)    //前序式
	    {
	      if ( BinTree[no] != 0 )
	         {
	           // 處理目前的樹根節點, 直接輸出
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
	 
	 static void InorderTraversal(int no)  //中序式
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

	           // 處理目前的樹根節點, 直接輸出
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
	 
	 public static void PostorderTraversal(int no)   //後序式
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

	           // 處理目前的樹根節點, 直接輸出
	           System.out.printf("%3d ",BinTree[no]);

	         }
	    }
}