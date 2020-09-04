/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main

{
   
 static void printNumbers(int start,int n,int d)
  
  {
        
int count=0;
        
     
   String st= "" + d;
       
 char ch=st.charAt(0);
        
for(int i=start;i<=n;i++){
            
st="";
           
 st=st+i;
            
          
  if(i==d || st.indexOf(ch)>=0)
          
  count++;
          
  if(i==11||i==111||i==1111)
           
 count ++;
      
  }
        

System.out.println(count);
   
 }
	
public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	 
   int start=sc.nextInt();
	
    int n=sc.nextInt();
	    
int d=1;
	    
printNumbers(start,n,d);
	
	
}

}
