package model;

public class Telefon {
	   private String denumire;  //necesar
	   private String tip;	 //necesar
	   private int stocInitial;	 //necesar
	   private int pretUnit;    //necesar
	   private int vandute;	 //optional
	   						 //exemplu constructori telescopici
	   
	   public Telefon() {
		   this.denumire = null;
		   this.tip = null;
		   this.stocInitial = 0;
		   this.pretUnit = 0;
		   this.vandute = 0;
	   }
	   public Telefon(String nume, String tip, int stocI,int pretU,int vandut) {
		   this.denumire=nume;
		   this.tip=tip;
		   this.stocInitial=stocI;
		   this.vandute=vandut;
		   this.pretUnit=pretU;
	   }
	   public String getNume() {
		   return denumire;
	   }
	   public void setNume(String nume) {
		   this.denumire = nume;
	   }
	   public String getTip() {
		   return tip;
	   }
	   public void setTip(String tip) {
		   this.tip = tip;
	   }
	   public int getStocI() {
		   return stocInitial;
	   }
	   public void setStocI(int stocI) {
		   this.stocInitial = stocI;
	   }
	   public int getVandute() {
		   return vandute;
	   }
	   public void setVandute(int vandut) {
		   this.vandute = vandut;
	   }
	   public int getPretU() {
		   return pretUnit;
	   }
	   public void setPretU(int pretU) {
		   this.pretUnit = pretU;
	   }
	}


