/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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

		System.out.print("シトロン　　　>");
		String citronpeacesString = reader.readLine();
		double citronnum = Double.parseDouble(citronpeacesString);
		//ここのIntegerはもともとstrをintに変えてたからIntegerになっていただけで今度はdoubleに変えなきゃだから
		//doubleにする
		//だから全体で書くとdouble citronnum=Double.parseDoubleになる！！！！
		//ここは変える型に合わせる＜＜重要＞＞

		System.out.print("ショコラ　　　>");
		String chocolatepeacesString = reader.readLine();
		double chocolatenum = Double.parseDouble(chocolatepeacesString);

		System.out.print("ピスターシュ　>\n");
		String pistapeaceString = reader.readLine();
		double pistanum = Double.parseDouble(pistapeaceString);

		System.out.println("シトロン　　　" + citronnum + "個");
		System.out.println("ショコラ　　　" + chocolatenum + "個");
		System.out.println("ピスターシュ　" + pistanum + "個\n");
		//ここまではチャレンジ４と一緒入力をしてあげる

		double totalpeaces = citronnum + chocolatenum + pistanum;
		int buyamount = (int) (citronnum * 250 + chocolatenum * 280 + pistanum * 320);
		//ここで新しく変数を使って合計個数と合計金額の変数を宣言する
		//2行目では合計金額を整数で表示させなければいけないのでintと(int)を使って無理やり整数にする

		System.out.println("個数　　" + totalpeaces + "個");
		System.out.println("金額　" + buyamount + "円\n");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		citronStock = (int) (citronStock - citronnum);
		chocolateStock = (int) (chocolateStock - chocolatenum);
		pistacheStock = (int) (pistacheStock - pistanum);
		//ここでも最後の表示させるStockを整数にしたいので(int)を使って整数にする。
		//ポイントとしては金額はさっき上の行で整数にしてるのでこんどは最後に表示させる個数を整数にする。
		//ここの(citronStock - citronnum)の部分は（）を付けないとうまくcitronStockなどが整数にならない

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250・・・残り" + citronStock + "個");
		System.out.println("ショコラ　　　\\280・・・残り" + chocolateStock + "個");
		System.out.println("ピスターシュ　\\320・・・残り" + pistacheStock + "個");

	}

}
