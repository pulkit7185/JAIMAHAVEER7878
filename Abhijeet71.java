import java.util.Scanner;
class Abhijeet71
{
  public static void main(String[] args)
 {
  int a[]=new int[5];
  int i, n, count=0;
  System.out.println("enter array elements");
  
  Scanner sc=new Scanner(System.in);
  
  for(i=0;i<5;i++)
  {
   a[i]=sc.nextInt();
    }
  
  System.out.println("printed array elements");

  for(i=0;i<5;i++)
  {
   System.out.println(a[i]+" ");
     }

  System.out.println("enter search element");
  n=sc.nextInt();

  for(i=0;i<5;i++)
  {
   if(a[i]==n)
   {
    count++;
     }
   }

   if(count>0)
   {
    System.out.println("item-found"+" "+count+" "+"times");
      }

   else
   {
    System.out.println("item-not found");
      }
  }
}
    
 