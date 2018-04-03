import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static Scanner in = new Scanner(System.in);

	// �crire une fonction qui affiche si une ann�e est bissextile ou non.
	// �crire une fonction qui affiche combien d'ann�es dans un intervalle donn�
	// (par exemple [1980, 2016[ ) sont bissextiles.
	// si l'ann�e est divisible par 4 et non divisible par 100, ou
	// si l'ann�e est divisible par 400.

	public static void main(String[] args) {

		boolean endOfProg = false;
		String answer = "";

		do {
			System.out.println("Voulez vous conna�tre les ann�es bisextiles entre 2 dates?");
			System.out.println("0) Non, sortir du programme." + "\n" + "1) Oui.");

			answer = in.nextLine();

			switch (answer)

			{

			case "1":
				input();
				break;

			case "0":
				System.out.println("Bonne journ�e");
				endOfProg = true;
				break;

			default:
				System.out.println("Donnez une r�ponse correcte");
			}
		} while (!endOfProg);

		in.close();

	}

	/*
	 * boolean bError = true; int n1 = 0, n2 = 0, nQuotient = 0;
	 * 
	 * do { try { System.out.println("Enter first num: "); n1 = input.nextInt();
	 * System.out.println("Enter second num: "); n2 = input.nextInt(); nQuotient =
	 * n1/n2; bError = false; } catch (Exception e) { System.out.println("Error!");
	 * } } while (bError);
	 */
	public static void input() {

		int startDate;
		int endDate;
		try {
			System.out.println("Donnez la date de d�part");
			startDate = in.nextInt();
			System.out.println("Donnez la date de fin");
			endDate = in.nextInt();
			
			dateIsBisextile(startDate, endDate);
		}

		catch (Exception e) {
			System.out.println("Erreur de saisie !");

		}

	}

	private static void dateIsBisextile(int sDate, int eDate) {
		boolean stop = false;

		List<Integer> years = new ArrayList<Integer>();
		do {
			if (sDate <= eDate && sDate > 0) {

				for (int i = sDate; i < (eDate + 1); i++) {

					if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {

						years.add(i);

					}

					stop = true;
				}

			} else {
				int tempDate = eDate;
				eDate = sDate;
				sDate = tempDate;
			}
		} while (!stop);

		System.out.println("voici les ann�es bisextiles entre " + sDate + " et " + eDate);
		for (int j = 0; j < years.size(); j++) {

			System.out.println(years.get(j));
		}
	}

}
