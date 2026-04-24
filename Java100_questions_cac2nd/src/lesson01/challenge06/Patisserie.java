/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolateStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolateStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

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

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		citronStock = citronStock - citronnum;
		chocolateStock = chocolateStock - chocolatenum;
		pistacheStock = pistacheStock - pistanum;

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + citronStock + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + chocolateStock + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pistacheStock + "個");

	}

}
