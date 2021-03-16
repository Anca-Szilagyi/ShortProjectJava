package model;


public class TelefonActualizat extends Telefon {
	private int valoarePeStoc;
	public TelefonActualizat(String nume, String tip, int stocI,int pretU,int vandut) {
		super(nume, tip, stocI, pretU, vandut);
		this.valoarePeStoc = (stocI-vandut)*pretU;
	}
	public TelefonActualizat() {
		super();
		this.valoarePeStoc = 0;
	}
	
	

	public TelefonActualizat(TelefonActualizat t) {
		super(t.getNume(), t.getTip(), t.getStocI(), t.getPretU(), t.getVandute());
		this.valoarePeStoc = t.getValoare();
	}
	
	public int getValoare() {
		return this.valoarePeStoc;
	}
	
	
}
