package workingset1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problemSolving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fibonaci(6));
		//System.out.println(palindromCheck(228056822));
		//inQ("Hello Kee Hello");
		//System.out.println(paranthBalance("{[{[{[]}]}]}"));
		System.out.println(repeatedString("abcdeafgha", 3));
		//System.out.println(jumpingOnClouds(new int[]{0,0,1,0}));
		//System.out.println(sumOfKWindowSlice(new int[]{100,200,300,400,400,200,0},3));
		//System.out.println(hourglassSum(new int[][]{{-1 ,-1, 0, -9, -2, -2},{-2 ,-1 ,-6 ,-8 ,-2 ,-5},{-1 ,-1 ,-1 ,-2 ,-3 ,-4},{-1 ,-9 ,-2 ,-4 ,-4 ,-5},{-7 ,-3 ,-3 ,-2 ,-9 ,-9},{-1 ,-3 ,-1 ,-2 ,-4, -5}},6,6));
	}
//f(n) = f(n-1)+ f(n-2) --> nth fibonaci series
//fibonaci(int n) is element at nth index starting at 1
	public static int fibonaci(int n)
	{
		if(n<1)
			return 0;
		if(n==1)
			return 1;
		else
		{
			return fibonaci(n-1)+fibonaci(n-2);			
		}
	}
	public static boolean palindromCheck(int n)
	{
		if(n<9)
			return true;
		
		List<Integer> ls = new ArrayList<>();
		while(n>9)
		{
			int temp = n%10;
			ls.add(temp);
			n=n/10;
		}
		ls.add(n);
		int len = ls.size()-1;
		int k=0 ;
		while(k<=len/2 && k<=len)	
		{
			if(ls.get(k)!=ls.get(len-k))
			{
				return false;
			}
			k++;
		}
		return true;
		
	}
public static void inQ(String str)
{
	String[] stray = str.split(" ");
	Map<String , Integer> map = new HashMap<>();
	for(int i=0;i<stray.length ; i++)
	{
		if(map.get(stray[i])!=null)
		{
			int temp = map.get(stray[i]);
			map.put(stray[i], ++temp);
		}
		else
		{
			map.put(stray[i], 1);
		}
		
	}
}
public static boolean paranthBalance(String str)
{
	String[] strAy= str.split("");
	int len = strAy.length;int count =0;
	String open="{[(";
	String close="}])";
	if(len<=1 || close.contains(strAy[0]))
		return false;
	for(int i =1;i<len;i++)
	{
		if(close.contains(strAy[i]))
		{
			count--;
			int index =close.indexOf(strAy[i]);
			if(!strAy[i-1].equalsIgnoreCase(String.valueOf(open.charAt(index))))
				return false;
		}
		else
		  count++;
	}
	return (count==0) ;
}
static long repeatedString(String s, long n) {
    char[] str = s.toCharArray();
    int len = str.length;
    int count=0 , count1=0 ;
    long temp = ((n/len)>0)?(n/len):1;
    long temp2=((n%len)==0)? 0 : (n%len);
    if(n<len)
    	temp2=n;
   	
    for(int i=0;i<len;i++)
    {
    	char t = (char) (str[i]+3);
    	if(str[i]=='a')
    	{
    		count++;
    	}
    	if(temp2!=0 && i==(temp2-1))
		{
			count1=count;
			if(n<len)
				return count1;
		}
		
    }
    return (count*temp)+count1;

}
static int jumpingOnClouds(int[] c) {
int jump =0;
int i=0;
int len=c.length;
while(i<(len-2))
{
	if(c[i]!=1&&c[i+2]!=1)
	{jump++;
	i++;}
	else if(c[i]!=1&&c[i+1]!=1)
		jump++;
	i++;
}
if(i==(len-2)&&c[len-2]==0)
	jump++;
return jump;
}
static int sumOfKConsecutives(int[] a,int k)
{
	int len = a.length;
	int sum =0,currentSum = 0;
	for(int i=0;i<=len-k;i++)
	{
		currentSum = 0;
		for(int j =0;j<k;j++)//(0,1,2)
		{
			currentSum = currentSum+a[i+j];
			
		}
		sum=Math.max(currentSum, sum);
	}
	return sum;
}
static int sumOfKWindowSlice(int[] a,int k)
{
	int len = a.length;
	int sum =0,windowSum = 0;
	for(int i =0;i<k;i++)
	{
		windowSum = windowSum+a[i];
	}
	sum = windowSum;
	for(int i =k;i<len;i++)
	{
		windowSum = windowSum+a[i]-a[i-k];
		sum= Math.max(sum, windowSum);
	}
	return sum;
}
static int hourglassSum(int[][] arr,int r, int c) {
    int k =3;
    int sum =0; int ts = Integer.MIN_VALUE;
    for(int i=0;i<=r-k;i++)
    {
       
        for(int j=0;j<=c-k;j++)
        {
        	 sum=0;
            for(int ii=0;ii<k;ii++)
            {
                for(int jj=0;jj<k;jj++)
                {
                    sum = sum+arr[i+ii][j+jj];

                }

            }
        sum = sum-arr[i+1][j+0]-arr[i+1][j+2];
        ts = Math.max(ts,sum);

        }
        //sum = sum-arr[i+1][j+0]-arr[i+1][j+2];
        //ts = Math.max(ts,sum);

    }
    return ts;


}

}
