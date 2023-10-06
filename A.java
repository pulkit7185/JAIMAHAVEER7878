import java.util.Scanner;
class A
{
 public static void main(String[] args)
 
{
 int i,n,count=0;
 System.out.println("enter array elements ");

 Scanner sc=new Scanner(System.in);
 
 int a[]=new int[5]; //array formula
 
 for(i=0;i<5;i++)
 {
  a[i]=sc.nextInt();
  }
  System.out.println("Array Elements");
  for(i=0;i<5;i++)
  {
   System.out.println(a[i]+" ");
  }

  System.out.println("enter search elements");
  n=sc.nextInt();  //here n is the searching element.
  for(i=0;i<5;i++)
  {
   
    if(a[i]==n)
    { count++;
    }
  }
   if(count>0)
    System.out.println("item found");
  
   else
    System.out.println("item not found");
 }
  }
  
  



 