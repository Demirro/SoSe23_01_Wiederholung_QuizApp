package de.uk.java;

import java.util.Scanner;

public class QuizApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/** Simple Lösung:
		 * Einfach die Fragen in der Konsole ausgeben
		 * Die Antwort mit dem Scanner auslesen und mit einer simplen if-Abfrage überprüfen,
		 * ob die eingegebene Antwort richtig ist (equalsIgnoreCase)
		 */
		System.out.println("Willkommen im Quiz");
		
		System.out.println("Erste Frage: Wann wurde die Universität zu Köln gegründet?");
		
		String answer = scanner.nextLine();
		
		if (answer.equalsIgnoreCase("1388")) {
			System.out.println("Richtig.");
		} else {
			System.out.println("Falsch. Du hast verloren.");
			System.exit(0);
		}
		
		/** Komplexer:
		 * Auslagern der verschiedenen Fragenkomponente in eine eigene Klasse --> siehe QuizFrage
		 * Erstellen neuer Fragen, mithilfe des Konstruktors
		 * Dann weiterhin das "stumpfe" Ausgeben und einlesen über die Konsole.
		 * Die Eingabe der Nutzenden wird an eine ausgelagerte "checkAnswer"-Methode übergeben,
		 * damit wir die oben stehende if-Abfrage nicht für jede Frage schreiben müssen.
		 */
		QuizFrage q2 = new QuizFrage("Was ist die Hauptstadt von Angola?", "Luanda");
		QuizFrage q3 = new QuizFrage("Wer ist für die Entdeckung des Penicillins bekannt und hat dafür auch einen Nobelpreis erhalten?", "Alexander Fleming");
		
		
		System.out.println("Zweite Frage: " +  q2);
		
		q2.checkAnswer(scanner.nextLine());
		
		System.out.println("Zweite Frage: " +  q3);
		
		q3.checkAnswer(scanner.nextLine());
		
		scanner.close();
		System.exit(0);
	}
}
