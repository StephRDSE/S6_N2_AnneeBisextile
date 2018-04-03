import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// Écrire une fonction qui affiche si une année est bissextile ou non.
	// Écrire une fonction qui affiche combien d'années dans un intervalle donné
	// (par exemple [1980, 2016[ ) sont bissextiles.
	// si l'année est divisible par 4 et non divisible par 100, ou
	// si l'année est divisible par 400.

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int startDate;
		int endDate;

		System.out.println("Voulez vous connaître les années bisextiles entre 2 dates?");
		System.out.println("Donnez la date de départ");
		startDate = in.nextInt();
		in.nextLine();
		System.out.println("Donnez la date de fin");
		endDate = in.nextInt();
		in.nextLine();

		dateIsBisextile(startDate, endDate);
		
		in.close();

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

		System.out.println("voici les années bisextiles entre " + sDate + " et " + eDate);
		for (int j=0; j< years.size(); j++) {
			
			System.out.println(years.get(j));
			}
	}

}
