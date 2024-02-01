package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas vão ser digitadas: ");
		int n = sc.nextInt();
		Dados[] vect = new Dados[n];

		sc.nextLine();

		double highest = 0.0;
		double lessheight = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
			char gender = sc.next().charAt(0);

			sc.nextLine();

			vect[i] = new Dados(gender, height);

			if (vect[i].getHeight() > highest) {
				highest = vect[i].getHeight();
			}

			if (vect[i].getHeight() < lessheight || lessheight == 0) {
			    lessheight = vect[i].getHeight();
			}

		}
		int quantityMale = 0;
		int quantityFemale = 0;
		double sumFemele = 0.0;
		double mediaheight;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGender() == 'F') {
				sumFemele += vect[i].getHeight();
				quantityFemale++;
			} else {
				quantityMale++;
			}
		}
		mediaheight = sumFemele / quantityFemale;

		System.out.println("Menor altura = " + lessheight);
		System.out.println("Maior altura = " + highest);

		System.out.println("Media das alturas das mulheres = " + mediaheight);
		System.out.println("Numero de homens = " + quantityMale);
		sc.close();

	}

}
