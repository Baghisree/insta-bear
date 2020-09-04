/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  
  static int singleDigit(int n)
    {
        
int sum=0;
      
  while(n>0 || sum>9)
       
 {
         
   if(n==0)
           
 {
             
   n=sum;
             
   sum=0;
           
 }
            

sum+=n%10;
         
   n/=10;
       
 }
        
return sum;
   
 }
	
public static void main(String[] args) {
	   
 int n=9829;
		
System.out.println(singleDigit(n));
	

}

}
