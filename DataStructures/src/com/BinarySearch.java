package com;

public class BinarySearch {

    public static void main(String args[]){

        int m[] = {0,1,4,5,7,8,9};
      /*  while(low<=high){
            int mid = low +(high-low)/2;
            if(m[mid]==x) {
                System.out.println("found at " + mid);
                return;
            }
            else if(m[mid]<x)
                low = mid;
            else
                high=mid;
        }*/

        int index = binarySearchRecur(m,0,m.length-1,100);
        if (index > 0) {
            System.out.println("Item found at index " + index);
        } else {
            System.out.println("Item not found in array");
        }
    }

    public static int binarySearchRecur(int a[],int low,int high,int number){
        if(a[low]==number)
            return low;
        if(a[high]==number)
            return high;
        if(low==high) {
            if(a[low]==number)
                return low;
            else
                return -1;
        }
        if(low<high){
            int mid = low+(high-low)/2;
            if(a[mid]==number)
                return mid;
            else if(a[mid]<number)
             return   binarySearchRecur(a,mid+1,high,number);
            else
             return   binarySearchRecur(a,low,mid-1,number);
        }
        else return -1;
    }
}
