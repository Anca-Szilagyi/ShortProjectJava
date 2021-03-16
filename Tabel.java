package view;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import model.*;


public class Tabel {
	
	public static ArrayList<TelefonActualizat> telefoaneOrdonate (TelefonActualizat []p){
		ArrayList<TelefonActualizat> telefoane= new ArrayList<TelefonActualizat>();

		for(int i =0; i<p.length; i++) 
			{ if(p[i].getValoare()!=0)
				telefoane.add(p[i]);
			}
			
		for(int i=0; i<telefoane.size(); i++) {
			for(int j=i+1; j<telefoane.size(); j++)
		{
			if(telefoane.get(i).getValoare()<telefoane.get(j).getValoare())
			{ TelefonActualizat aux = telefoane.get(i);
			  telefoane.set(i, telefoane.get(j));
			  telefoane.set(j, aux);
			}
		}
		}
		
		//sortare descrescatoare

		return telefoane;
	}
	

	public static void linii(int nr, String s) {
		   for (int i=0;i<nr;i++)
			   System.out.print(s);
		   System.out.println();
	}
	   
   public static void capTabel2() {
	   //afisarea tututor telefoanelor din sistem
	   //cu toate detaliile despre acestea
		   linii(60,"=");
		   System.out.println("|   Denumire    |      Tip      |StocInit|PretUnit |Vandute|");
		   linii(60,"=");  
	   }
   
   public static void capTabel3() {
	   //tabel cu marfurile unde s-a vandut peste 25% din stocul initial
	   linii(70,"=");
	   System.out.println("|   Denumire    |      Tip      |StocInit |Vandute|PretUnit |Valoare  | Procent |");
	   linii(60,"=");  
   }
   
   
   public static void capTabel4() {
	   //tabel afisat la cumparator sortat descrescator
	   //dupa valoarea unitatilor disponibile
	   linii(69,"=");
	   System.out.println("|   Denumire    |      Tip      |Disponibile| PretUnit|Valoare disponibile |");
	   linii(69,"=");   
   }
  
  
   
   
   
   public static void Tabel2(TelefonActualizat []b) {
	   if(b!=null) {
	       capTabel2();
		   for(int i=0;i<b.length; i++) {
			   System.out.format("|%-15s|%-15s|%8d|%9d|%7d|\n",
					   b[i].getNume(),b[i].getTip(),b[i].getStocI(),b[i].getVandute(), b[i].getPretU(), b[i].getVandute());
	       }
	   linii(60,"-");
	   }
	   else System.out.println("Va rugam sa cititi mai intai datele din fisier!");
	   
   }
   
   
   
   
   
   public static void Tabel3(TelefonActualizat []b) {
	   //tabel afisat la cumparator sortat descrescator
	   //dupa valoarea unitatilor disponibile
	 ArrayList<TelefonActualizat> telefoane = new ArrayList<TelefonActualizat>(); 
	  telefoane = telefoaneOrdonate(b);
	   System.out.println("Telefoane disponibile: ");
	   capTabel4();

	   int total=0;
	   for(int i=0;i<telefoane.size(); i++) {
		   total = total+telefoane.get(i).getValoare();
		   int disp = telefoane.get(i).getStocI() - telefoane.get(i).getVandute();
		   System.out.format("|%-15s|%-15s|%11d|%8d|%15d|\n",
			  telefoane.get(i).getNume(),telefoane.get(i).getTip(),disp,b[i].getPretU(),telefoane.get(i).getValoare());
		   //   total+=valDif;
		   }
	   System.out.println("Totalul este: "+total);

	   linii(70,"-");  
   }
	  
   
   
   public static void Tabel4(TelefonActualizat b[]) {
	   System.out.println("Marfurile care s-au vandut peste 25%: ");
	   capTabel3();
	   int total = 0;
	   for(int i=0;i<b.length; i++) {
	      // float proc=(b[i].getVandute()/b[i].getStocI())*100;
	       
	       //if (proc>=25) {
	    	   
	    	  
	    	       if(4*b[i].getVandute()>b[i].getStocI()) {
	    	    	   double proc=b[i].getVandute()*1.0/b[i].getStocI()*100;
	    		     //  System.out.format("|%-15s|%8d|%8d|%8d|\n",
	    			  //   b[i].getNume(),b[i].getStocI(),b[i].getVandute(),b[i].getPretU());
	    	       
	    	   
	    	   
	    	   
	    	   
	    	   int valoare = b[i].getVandute()*b[i].getPretU();
	    	   total = total+valoare;
	    	   //int valoare = (b[i].getStocI()-b[i].getVandute())*b[i].getPretU();
	    	   System.out.format("|%-15s|%-15s|%8d|%8d|%6d|%10d|%8.2f|\n",
	    			   //aici de modificat formatul pentru mai multe campuri
			   b[i].getNume(),b[i].getTip(),b[i].getStocI(),b[i].getVandute(), b[i].getPretU(),valoare, proc);
	       }
	   }
	   System.out.println("Totalul este: "+total);
	   linii(60,"-");
   }
   
   
   
   
   
   
   
  
}
