package lesson05.challenge04;

public class Robot {
	int energy;
	String name1;
	String name2;
	String name3;

	void pumpWatershow() {
		System.out.println("水を1リットルだしました");
	}

	int water = (int) (Math.random() * 9) + 1;

	void randamWatershow() {
		System.out.println("水を" + water + "リットル出します\n");
	}
}