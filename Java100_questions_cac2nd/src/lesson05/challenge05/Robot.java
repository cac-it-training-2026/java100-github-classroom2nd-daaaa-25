package lesson05.challenge05;

public class Robot {
	int energy;
	String name1;
	String name2;
	String name3;

	void pumpWatershow() {
		System.out.println("水を1リットルだしました");
	}

	/**
	 * @param water セットする water
	 */
	public void setWater(int water) {
		System.out.println("水を" + water + "リットル出します。");
	}

}
