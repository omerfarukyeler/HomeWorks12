package homework12_1;

public class Basekredi {
	
	public double hesapla (double eski_maas ) {
		double zam_orani=0.20;
		double yeni_maas = eski_maas +(eski_maas*zam_orani);
		return yeni_maas;
}
}
