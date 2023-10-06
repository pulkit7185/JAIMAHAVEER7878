class Abdu5
{
 private Double value;

 void setValue(Double a)
 {
  value=a;
  }
 Double getValue()
 {
 return value;
   }
 public static void main(String[] args)
 {
  Abdu5 r=new Abdu5();
  r.setValue(44.8);
  System.out.println(r.getValue());
  }
}  