/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		System.out.println("ピスターシュ　\\320・・・残り" + pistacheStock + "個\n");

		System.out.println("閉店の時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");

		System.out.println("売上の割合");
		System.out.println("売上合計　　　　\\" + buyamount + "\n");

		System.out.println("内訳");

		int citrontotal = (int) (citronnum * 250);
		int chocolatetotal = (int) (chocolatenum * 280);
		int pistatotal = (int) (pistanum * 320);

		//		double citronmargen = (double) (citrontotal / buyamount);
		//		double chocolatemargen = (double) (chocolatetotal / buyamount);
		//		double pistamargen = (double) (pistatotal / buyamount);
		//㊤このままだと先に割ってしまうから→ 先に割る（int計算）→ 0になる
		//初からdouble計算 → 小数OK

		double citronmargen = (double) citrontotal / buyamount;
		double chocolatemargen = (double) chocolatetotal / buyamount;
		double pistamargen = (double) pistatotal / buyamount;

		System.out.println("シトロン　　　\\" + citrontotal + "・・・" + (int) (citronmargen * 100) + "%");
		System.out.println("ショコラ　　　\\" + chocolatetotal + "・・・" + (int) (chocolatemargen * 100) + "%");
		System.out.println("ピスターシュ　\\" + pistatotal + "・・・" + (int) (pistamargen * 100) + "%");
		//ここは小数点以下を省略したいので(int)を付ける 気を付けるポイントは（）上のように付けることで→ 小数のまま計算 → 最後に整数化になる
	}
}
