package model;
import java.io.BufferedReader;
import java.io.FileReader;
public class CitireFisier {
	public static TelefonActualizat[] citFisier(String filename) {
		try {
			BufferedReader fisIn=
			  new BufferedReader(new FileReader("D:\\Programe\\LaboratoareMAP\\"+ filename));
			
			TelefonActualizat b[]= new TelefonActualizat[8];	//declare si instantiere nr de componente
			
			String sir=fisIn.readLine();
			int i =-1;
			while(sir != null) {
				i++;
				String atribut[]=sir.split(",");
				String nume=atribut[0];
				String tip=atribut[1];
				int stocI=Integer.parseInt(atribut[2]);
				int pretU=Integer.parseInt(atribut[3]);
				int vandut=Integer.parseInt(atribut[4]);
				
				b[i]=new TelefonActualizat(nume,tip,stocI,pretU,vandut); //apel constructor cu param.
				sir=fisIn.readLine();
				
			}
			return b;
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}
}
