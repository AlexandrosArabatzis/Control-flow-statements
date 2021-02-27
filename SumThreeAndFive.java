package arabatzis;

public class SumThreeAndFive {

	public static void main(String[] args) {

		int counter = 0;
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {

			if (counter == 5) {
				break;
			}

			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println(i);
				counter += 1;
				sum = sum + i;
			}

		}

		System.out.println("Summe" + sum);

	}
}
