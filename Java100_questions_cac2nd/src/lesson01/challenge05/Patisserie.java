/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン　　　>");
		String citronpeacesString = reader.readLine();
		int citronnum = Integer.parseInt(citronpeacesString);

		System.out.println("ショコラ　　　>");
		String chocolatepeacesString = reader.readLine();
		int chocolatenum = Integer.parseInt(chocolatepeacesString);

		System.out.println("ピスターシュ　>");
		String pistapeaceString = reader.readLine();
		int pistanum = Integer.parseInt(pistapeaceString);

		System.out.println("シトロン　　　" + citronnum + "個");
		System.out.println("ショコラ　　　" + chocolatenum + "個");
		System.out.println("ピスターシュ　" + pistanum + "個\n");
		//ここまではチャレンジ４と一緒入力をしてあげる

		//ここからは計算部分に入る　さっき宣言した変数を足したものと金額をかけ合わせたものが下のやつ
		System.out.println("個数　　" + (citronnum + chocolatenum + pistanum) + "個");
		System.out.println("金額　" + (citronnum * 250 + chocolatenum * 280 + pistanum * 320) + "円\n");
		;

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

	}
}
