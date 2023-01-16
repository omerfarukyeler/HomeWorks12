package homework12_1;

public class pazarlama extends Basekredi{
	public double hesapla (double eski_maas ) {
		double zam_orani=0.12;
		double yeni_maas = eski_maas +(eski_maas*zam_orani);
		return yeni_maas;
}
}
