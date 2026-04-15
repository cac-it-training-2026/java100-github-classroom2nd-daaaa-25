/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題2 商品の展示
 *
 * [問題1]の表示を行った後で
 * 以下の実行例と同じものを表示してください。
 *
 * <実行例>
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250
 * ショコラ      \280
 * ピスターシュ  \320
 *
 */

package lesson01.challenge02;

public class Patisserie {
	public static void main(String[] args) {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！\n");

		System.out.println("本日のおすすめ商品です。\n");
		//		㊤ここでのポイントとしては"\n"の使い方である。これを使うことで"println"に加えてもう一
		//		段階改行することができる

		System.out.println("シトロン　　　\\250");
		System.out.println("ショコラ　　　\\280");
		System.out.println("ピスターシュ　\\320");

	}
}
