package test;

public class Methots {

	public static void main(String[] args) {
		Oop bir = new Oop(65);
		System.out.println("Sayi 1 = " + bir.sayi1);
		System.out.println("Girilen Sayılar" + bir.sayi1 + bir.sayi2);
		System.out.println("İşlem Sonucu" + bir.topla(4, 6));
		int[] array = new int[10];
		int[] liste = {1,2,3,4};
		System.out.println(liste[2]);
		int[][] benim = new int[3][3];
		benim[0][0] = 5;
		System.out.println("Dizinin İlk Gardaşı" + benim[0][0]);
		int[][] senin = new int[][] {
			{1,2,3},{4,5,6}
		};
		System.out.println("Gardaşşşş " + senin[1][1]);
	}

}
