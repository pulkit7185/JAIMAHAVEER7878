import java.util.Scanner;
class Aajtak5 
{
 public static void main(String[] args)
 {
 int size,i;
 System.out.println("enter size of an array");
 Scanner sc=new Scanner(System.in);
 size=sc.nextInt();
 
 int a[]=new int[size];
 
 for(i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("printed array value's");
  for(i=0;i<size;i++)
  {
   System.out.println(a[i]+" ");
  }
   System.out.println("we have done it");
 }
}