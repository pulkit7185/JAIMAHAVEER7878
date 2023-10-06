class Abachhan81 implements Runnable
{
 int i;
 public void run()
 {
  for(i=1;i<=7;i++)
  {
   System.out.println("He is the legend of bollywood.");
   }
 }
}
class Abhishek81
{
  public static void main(String[] args)
  {
   Abachhan81 r=new Abachhan81();
   Thread t=new Thread(r);
   t.start();
    
   int i;
   for(i=1;i<=7;i++)
   {
    System.out.println("he has ruled bollywood for years.");
    }
}
}
       