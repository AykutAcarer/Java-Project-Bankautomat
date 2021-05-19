package code.Konto;

import java.util.Scanner;

public class StartKonto extends Konto {

	public static void main(String[] args) {

		/* Bankautomat */

		double geld = 0;
		double neuKontoStand = 0;
		String menu = "";
		String menu2 = "";
		Scanner scan = new Scanner(System.in);
		
		/* ein Objekt erstellen */
		
		Konto k1 = new Konto();
		
		do {
			System.out.println("Geben Sie bitte ihr Kontonummer ein:");
			String k_nummer = scan.nextLine();
			System.out.println("Geben Sie bitte ihr Kenntwort ein:");
			String k_passwort = scan.nextLine();

			// Überprufung das Passwort und Kontonummer
			if ((k_nummer.equals(k1.kontoNummer)) && (k_passwort.equals(k1.getKontoPassword()))) {

				do {
					System.out.println("Herzlich Willkomen");
					System.out.println("Menu \n1-Kontostand\n2-Geld abheben\n3-Geld einzahlen");
					String auswahl = scan.nextLine();

					switch (auswahl) {
					case "1":
						System.out.println("Ihr aktuelle neuen Kontostand " + k1.getKontoStand() + " €");
						break;

					case "2":
						System.out.println("Wie viel Geld möchten Sie auszahlen?");
						geld = Double.parseDouble(scan.nextLine());
						k1.setKontoStand((k1.getKontoStand() + geld));
						System.out.println("Ihr neuen Kontostand " + k1.getKontoStand());
						break;

					case "3":
						System.out.println("Wie viel Geld möchten Sie einzahlen?");
						geld = Double.parseDouble(scan.nextLine());
						if (k1.getKontoStand() < geld) {
							System.out.println("unzureichender Kontostand!");
						} else {
							k1.setKontoStand((k1.getKontoStand() - geld));
						}
						System.out.println("Ihr neuen Kontostand " + k1.getKontoStand());
						break;

					default:
						break;
					}
					System.out.println("Möchten Sie weitergehen? J/N");
					menu = scan.nextLine();

				} while (menu.equalsIgnoreCase("J"));
				break;
			} else {
				System.out.println("Falsch Eingabe! Aufwiedersehen");
			}
			System.out.println("Möchten Sie wiederholen J/N");
			menu2 = scan.nextLine();
		} while (menu2.equalsIgnoreCase("J"));

	}
}
