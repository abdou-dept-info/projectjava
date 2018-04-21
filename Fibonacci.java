import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;


public class Fibonacci {

	static void Fichier(String nom,int n,long tpsexecution){
		try{
			File f=new File(nom);
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(f,true)));
			pw.println(n+";"+tpsexecution);
			pw.close();
		}catch(Exception e){
			System.out.println("erreur de fichier :"+e);}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ind;
	    int nb_element; 
	  
	    int fib = 1;
	    int terme_prec1 = 1;
	    int terme_prec2 = 1;
	    System.out.println("Nombre de nombres de Fibonacci a calculer?");
	    Scanner sc=new Scanner(System.in);
	    nb_element = sc.nextInt();
		System.out.println("Les "+nb_element+" premiers éléments de la suite de Fibonacci sont : ");

for ( ind = 1 ; ind <= nb_element ; ind++ ) {
  
     if ( ind == 2 ) {
        fib = 2; }
  
      if ( ind > 2 ) {
        fib = terme_prec1 + terme_prec2;
        terme_prec2 = terme_prec1;
        terme_prec1 = fib; 
        }
}
 	      /*  float res=(float)(endTime-StartTime)/1000000;
 	        System.out.println("temp de calcule :"+(endTime-StartTime));*/
      /*System.out.print(fib+";"); }
long StartTime=System.nanoTime();
 long endTime=System.nanoTime();*/
// System.out.println("\n temp de calcule :"+(endTime-StartTime));
	
}

}
