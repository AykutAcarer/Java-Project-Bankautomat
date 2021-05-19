package code.Konto;

public class Konto {

	private String kontoPasswort="geh08eim";
	public String kontoNummer="DE123456LDK";
	private static double kontoStand=111250.0;
	
	/* getter und setter Methoden */
	
	public String getKontoPassword() {
		return kontoPasswort;
	}
	public double getKontoStand() {
		return kontoStand;
	}
	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}
	
	
}