package de.uk.java;

public class QuizFrage {
	// Instanzvariablen
	String question;
	String answer;
	
	/***
	 * Konstruktor für die Erstellung einer Frage
	 * @param question - String. Beinhaltet die Frage, die gestellt werden soll
	 * @param answer - String. Die Antwort auf die Frage
	 */
	public QuizFrage(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}
	
	/***
	 * Überprüft ob die übergebene Antwort (aus der Konsoleneingabe übergeben siehe QuizApplication Zeilen 41 & 45)
	 * Vergleich der Eingabe mit der gespeicherten Antwort der Instanz (equalsIgnoreCase nicht vergessen)
	 * Falls die Antwort falsch ist wird das Programm beendet.
	 * @param userAnswer
	 */
	public void checkAnswer(String userAnswer) {
		if (userAnswer.equalsIgnoreCase(answer)) {
			System.out.println("Richtig");
		} else {
			System.out.println("Falsch. Du hast verloren.");
			System.exit(0);
		}
	}
	
	/***
	 * Überschreiben der toString-Methode, um schnell und einfach den Fragentext ausgeben zu können 
	 * --> Implizierter Aufruf von toString bei System.out.println(QuizFrage);
	 * Alternativ ist eine printQuestion-Methode möglich.
	 */
	@Override
	public String toString() {
		return question;
	}
}
