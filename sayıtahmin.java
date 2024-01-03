package sayıtahmin;

import java.util.Random;
import java.util.Scanner;

public class sayıtahmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int hak = 10;
		int girilen;
		Random rnd = new Random();
		int sayi = rnd.nextInt(100);

		do {
			System.out.print("Tahmininizi Giriniz:");
			girilen = scan.nextInt();
			System.out.println(10 - (--hak) + " kere denendi.");

			if (sayi <= girilen) {
				System.out.println(girilen + " sayısı tutulan sayıdan büyük!");
			}

			if (sayi >= girilen) {
				System.out.println(girilen + " sayısı tutulan sayıdan küçük!");
			}
			
			if (sayi == girilen) {
				System.out.println("Bildin.");
				System.out.println("Puan: " + hak * 10);
				break;
			}

			if (hak == 1) {
				System.out.println("Puanınız: 0");
				System.out.println("Tutulan Sayi..:" + sayi);
				break;
			}

		} while (hak >= 0);

	}

}
