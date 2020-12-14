package com.jessica.feitosa.aulaspoo.aula07;

public class ultraEmojiCombat {

	public static void main(String[] args) {

		Lutador l[] = new Lutador[6];

		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		l[1] = new Lutador("Putscript","França", 31, 1.75, 68.9, 11, 2, 1);
		l[2] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		l[3] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		l[4] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		l[5] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);

		l[3].apresentar();
		l[5].status();

	}
}