class Aop
{
 int a,b,c,d,e,f,g;
 void accept()
 {
  a=10;
  b=20;
 }
 void Aopoperations()
 {
  c=a+b;
  d=a-b;
  e=a*b;
  f=a/b;
  g=a%b;
 }
 void disp()
 {
 System.out.println(a+"+"+b+"="+c);
 System.out.println(a+"-"+b+"="+d);
 System.out.println(a+"*"+b+"="+e);
 System.out.println(a+"/"+b+"="+f);
 System.out.println(a+"%"+b+"="+g);
 } 
}
class AopDemo
{
 public static void main(String[] args)
 {
  Aop ao=new Aop();
      ao.accept();
      ao.Aopoperations();
      ao.disp();
 } 
} 