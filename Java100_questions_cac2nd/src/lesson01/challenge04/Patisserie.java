/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");

		System.out.println("それぞれ何個ずつ買いますか？　（最大30個まで）\n");

		//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//
		//		String citron = reader.readLine();
		//		int citronpeaces = Integer.parseInt(citron);
		//		System.out.println("シトロン　　　" + citronpeaces + "個");
		//
		//		String chocolate = reader.readLine();
		//		int chocolatepeaces = Integer.parseInt(chocolate);
		//		System.out.println("ショコラ　　　" + chocolatepeaces + "個");
		//
		//		String pista = reader.readLine();
		//		int pistapeaces = Integer.parseInt(pista);
		//		System.out.println("ピスターシュ　" + pistapeaces + "個\n");
		//
		//		System.out.println("をお買い上げですね。");
		//		System.out.println("承りました。");
		//　㊤これが自分でやったやつこの場合だと1行ずつになっちゃうから修正してみる
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("シトロン　　　>");
		String citronpeacesString = reader.readLine();
		int citronnum = Integer.parseInt(citronpeacesString);

		System.out.println("ショコラ　　　>");
		String chocolatepeaceString = reader.readLine();
		int chocolatenum = Integer.parseInt(chocolatepeaceString);

		System.out.println("ピスターシュ　>");
		String pistapeaceString = reader.readLine();
		int pistanum = Integer.parseInt(pistapeaceString);

		System.out.println("シトロン　　　" + citronnum + "個");
		System.out.println("ショコラ　　　" + chocolatenum + "個");
		System.out.println("ピスターシュ　" + pistanum + "個\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");
	}
}
