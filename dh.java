import java.util.*;
class Diffie_Hellman
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter modulo(p)");
 int p=sc.nextInt();
 System.out.println("Enter primitive root of "+p);
 int g=sc.nextInt();
 System.out.println("Choose 1st secret no(Alice)");
 int a=sc.nextInt();
 System.out.println("Choose 2nd secret no(BOB)");
 int b=sc.nextInt();
 
 int A = (int)Math.pow(g,a)%p;
 int B = (int)Math.pow(g,b)%p;
 
 int S_A = (int)Math.pow(B,a)%p;
 int S_B =(int)Math.pow(A,b)%p; 
 
 if(S_A==S_B)
 {
 System.out.println("ALice and Bob can communicate with each other!!!");
 System.out.println("They share a secret no = "+S_A); 
 }
 
 else
 {
 System.out.println("ALice and Bob cannot communicate with each other!!!");
 }
 sc.close();
 } 
}