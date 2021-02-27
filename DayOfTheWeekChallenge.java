package arabatzis;

public class DayOfTheWeekChallenge {

	public static void printDayOfTheWeek(int day) {

		if ((day <= 6) && (day >= 0)) {

			switch (day) {

			case 0:
				System.out.println("Day of the week is Monday");
				break;

			case 1:
				System.out.println("Day of the week is Tuesday");
				break;

			case 2:
				System.out.println("Day of the week is Wednesday");
				break;

			case 3:
				System.out.println("Day of the week is Thursday");
				break;

			case 4:
				System.out.println("Day of the week is Friday");
				break;

			case 5:
				System.out.println("Day of the week is Saturday");
				break;

			case 6:
				System.out.println("Day of the week is Sunday");
				break;

			}
		}

		else {
			System.out.println("Invalid Value");
		}

	}

	public static void main(String args[]) {

		printDayOfTheWeek(0);
		printDayOfTheWeek(5);
		printDayOfTheWeek(10);
		printDayOfTheWeek(-2);

	}

}
