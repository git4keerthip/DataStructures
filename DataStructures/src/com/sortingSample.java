package com;

public class sortingSample {

  public static void selectionSort(int ary[])
  {
	  int len = ary.length;  
	  int index = 0;
	  while(index < len)
	  {
		  int smallestIdx = getSmallestNumber(ary,index);
		  int temp = ary[smallestIdx];
		  ary[smallestIdx]=ary[index];
		  ary[index] = temp;
		  index++;
		} 
	  System.out.println("/////Selection Sort//// "); 
	  for(int p : ary)
	  {
		  System.out.print(" " +p); 
	  }
	 
  }
  public static void bubbleSort(int ary[])
  {
	  int len = ary.length-1;  
	  int swap = len+1;
	  
	  while(swap !=0)
	  {
		  swap = 0;
		  for(int  k =0; k<len ;k++)
		  {
			  if(ary[k] > ary[k+1])
			  {
				  int temp = ary[k+1];
				  ary[k+1]=ary[k];
				  ary[k] = temp;
				  swap ++;
			  }
		  } 
	  } System.out.println();
	  System.out.println("/////Bubble Sort//// "); 
	  for(int p : ary)
	  {
		  System.out.print(" " +p); 
	  }
	 
  }
  public static void insertionSort(int ary[])
  {
	  int len = ary.length-1;  
	   for(int  k =1; k<=len ;k++)
		  {
		   		int temp = ary[k];
		   		int j =k-1;
			  while(j >=0 && ary[j] > temp)
				  {
					  ary[j+1]=ary[j];
					  j--;
				  }
			ary[j+1] = temp;
			  
		  }
	   System.out.println();
	  System.out.println("/////insertion  Sort//// "); 
	  for(int p : ary)
	  {
		  System.out.print(" " +p); 
	  }
	 
  }
  
  public static int getSmallestNumber(int ary[],int index)
  {
 	 int len = ary.length;
 	 int temp= index;
 		
 	 for(int j=index;j<len;j++)
 	 {
 		 if(ary[temp] > ary[j])
 		 {
 			 temp = j;
 		 }
 	}
 	 return temp; 
 		
  }

 public static void normalSort(int ary[])
 {
	 int len = ary.length; 
	 for(int j=0;j<len;j++)
	 {
		 for(int k = j+1 ; k < len ; k++)
		 {
			 if(ary[j]> ary[k])
			 {
				 int temp = ary[k];
				 ary[k]=ary[j];
				 ary[j]= temp;
			 }
		 }
		 
	 }
	 for(int p : ary)
	  {
		  System.out.print(" " +p); 
	  }
 }
 public static void main(String[] args) {
		// TODO Auto-generated method stub 
	 	int ary[] ={3,35,8,0,3,3,4,5,7,5,58,35,-98,346,-78};
	 	selectionSort(ary);
	 	bubbleSort(ary);
	 	insertionSort(ary);
	}

}
