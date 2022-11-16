package anket;
import java.util.ArrayList;
import java.util.Scanner;
public class Anket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		ArrayList veri= new ArrayList();
		int cvp1,cvp2,cvp3,cvp4,cvp5;
		int i=0;
		int dongu;
		String a= "Y";
		String b= "y";
		double ort1, ort2, ort3, ort4, ort5;
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
		int max = sum1;

		while (1 == 1) {
			i++;
			veri.add(i);
			System.out.printf("Teste Hosgeldiniz %d. kisi\n", i);
			System.out.println("Lutfen sorulara 1-10 arasi bir puan veriniz!!\n");
			System.out.println("Enflasyon problemini oylayiniz?\n");
			cvp1 = scan.nextInt();
			if (cvp1 <= 0 || cvp1 > 10) {
				System.out.println("1-10 arası oylayiniz\n");
				return;
			}
			veri.add(cvp1);
			System.out.println("Ulasim problemini oylayiniz\n");
			cvp2 = scan.nextInt();
			if (cvp2 <= 0 || cvp2 > 10) {
				System.out.println("1-10 arası oylayiniz\n");
				return;
			}
			veri.add(cvp2);
			System.out.println("egitim problemlerini oylayiniz\n");
			cvp3 = scan.nextInt();
			if (cvp3 <= 0 || cvp3 > 10) {
				System.out.println("1-10 arası oylayiniz\n");
				return;
			}
			veri.add(cvp3);
			System.out.println("beyin gocu problemini oylayiniz\n");
			cvp4 = scan.nextInt();
			if (cvp4 <= 0 || cvp4 > 10) {
				System.out.println("1-10 arası oylayiniz\n");
				return;
			}
			veri.add(cvp4);
			System.out.println("multeci problemini oylayiniz\n");
			cvp5 = scan.nextInt();
			if (cvp5 <= 0 || cvp5 > 10) {
				System.out.println("1-10 arası oylayiniz\n");
				return;
			}
			veri.add(cvp5);

			System.out.println("devam için 1'i tuslayin");
			dongu = scan.nextInt();

			if (dongu!=1) {
				break;
			}
		}

		System.out.println("enflasyon-ulasim-egitim-beyin gocu-multeci");

		for (int j = 0; j < i * 6; j += 6) {
			System.out.printf("%d.kisi  |   %d    |   %d    |  %d   |   %d    |   %d     |", veri.get(j),
					veri.get(j + 1), veri.get(j + 2), veri.get(j + 3), veri.get(j + 4),
					veri.get(j + 5));
			System.out.println();
		}

		int enflasyon[] = new int[i];
		int ulasim[] = new int[i];
		int egitim[] = new int[i];
		int beyingocu[] = new int[i];
		int multeci[] = new int[i];

		for (int k = 0; k < i * 6; k += 6) {
			enflasyon[k / 6] = (int) veri.get(k + 1);
			ulasim[k / 6] = (int) veri.get(k + 2);
			egitim[k / 6] = (int) veri.get(k + 3);
			beyingocu[k / 6] = (int) veri.get(k + 4);
			multeci[k / 6] = (int) veri.get(k + 5);
		}

		for (int value : enflasyon) {
			sum1 = sum1 + value;
		}
		for (int value : ulasim) {
			sum2 = sum2 + value;
		}
		for (int value : egitim) {
			sum3 = sum3 + value;
		}
		for (int value : beyingocu) {
			sum4 = sum4 + value;
		}
		for (int value : multeci) {
			sum5 = sum5 + value;
		}

		ort1 = (double) sum1 / enflasyon.length;
		ort2 = (double) sum2 / ulasim.length;
		ort3 = (double) sum3 / egitim.length;
		ort4 = (double) sum4 / beyingocu.length;
		ort5 = (double) sum5 / multeci.length;

		if (max < sum2) {
			max = sum2;
		}
		if (max < sum3) {
			max = sum3;
		}
		if (max < sum4) {
			max = sum4;
		}
		if (max < sum5) {
			max = sum5;
		}

		int min = sum1;

		if (min > sum2) {
			min = sum2;
		}
		if (min > sum3) {
			min = sum3;
		}
		if (min > sum4) {
			min = sum4;
		}
		if (min > sum5) {
			min = sum5;
		}

		System.out.println("--------|--------|--------|------|--------|---------|");
		System.out.printf("Ortalama|  %.2f  |  %.2f  | %.2f |  %.2f  |  %.2f   |\n", ort1, ort2, ort3, ort4, ort5);
		System.out.println("--------|--------|--------|------|--------|---------|");
		if (max == sum1) {
			System.out.println("En Cok Oy Alan: Enflasyon " + sum1);
		} else if (max == sum2) {
			System.out.println("En Cok Oy Alan: Ulasim " + sum2);
		} else if (max == sum3) {
			System.out.println("En Cok Oy Alan: Egitim Problemi " + sum3);
		} else if (max == sum4) {
			System.out.println("En Cok Oy Alan: Beyin Gocu " + sum4);
		} else if (max == sum5) {
			System.out.println("En Cok Oy Alan: Multeci Problemi " + sum5);
		}

		if (min == sum1) {
			System.out.println("En Az Oy Alan: Enflasyon " + sum1);
		} else if (min == sum2) {
			System.out.println("En Az Oy Alan: Ulasim " + sum2);
		} else if (min == sum3) {
			System.out.println("En Az Oy Alan: Egitim Problemi " + sum3);
		} else if (min == sum4) {
			System.out.println("En Az Oy Alan: Beyin Gocu " + sum4);
		} else if (min == sum5) {
			System.out.println("En Az Oy Alan: Multeci Problemi " + sum5);
		}

	}

}