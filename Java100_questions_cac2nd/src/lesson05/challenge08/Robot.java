package lesson05.challenge08;

public class Robot {
	int energy;
	String name1;
	String name2;
	String name3;
	int water;

	void pumpWatershow() {
		System.out.println("水を1リットルだしました");
	}

	/**
	 * @param water セットする water
	 */

	void randamWater() {
		water = (int) (Math.random() * 9) + 1;
	}

	public void makeOmlet(int eggNum, int butterNum) {
		int amount1 = eggNum / 2;//卵２個で一人前
		int amount2 = butterNum / 5;//バター5個で一人前
		int total = (amount1 + amount2) / 2;

		System.out.println(total + "人分のオムレツを作成しました。");

	}

	/**
	 * @return water
	 */
	public int getWater() {
		return water;
	}
}
