package controller;
import java.util.Scanner;
import model.*;
import view.*;

public class Run {
    public static int meniu() {
    	System.out.println();
    	System.out.println("1.Citire date din fisier");
    	System.out.println("2.Afisare toata marfa");
    	System.out.println("3.Afisare marfa disponibila");
    	//sortata descrescator dupa pretul de marfa disponibil
    	System.out.println("4.Afisare marfa vanduta peste 25% din stocul initial");

    	System.out.println("0.Terminare program");
    	return citIntreg("da optiunea ta:");
    }
    public static int citIntreg(String sir) {
    	try { System.out.print(sir);
    	      Scanner s=new Scanner(System.in);
    	      int i=s.nextInt();
    	      return i;
    	}
    	catch(Exception e) {
    		System.out.println("Ai gresit, mai incearca!!");
    		return citIntreg(sir);
    	}  	
    }
	public static void main(String[] args) {
		TelefonActualizat b[]=null;				
		int opt=meniu();
        while(opt!=0) {
        	switch(opt) {
        		case 1: b=CitireFisier.citFisier("Telefon.txt");
        		        break;
        		case 2: Tabel.Tabel2(b);
        				break;
        		case 3: Tabel.Tabel3(b);
        				break;
        		case 4: Tabel.Tabel4(b);
        			    break;
        	
        		default:System.out.println("Optiune gresita, mai incearca!!");	        
        	}
        	opt=meniu();
        }
        System.out.println("program terminat,bye bye");
	}
}
