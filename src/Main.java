
public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * HelloWorldを表示
		 */
		System.out.println("Hello World!");
		
		/*
		 * 変数の種類
		 */
		// 論理値型
		boolean bool = true;// true/false
		
		//　変数
		byte b  = 1;          // [8bit] -2^7   ~ 2^7-1(-128 ~ 127)
		short s = 1;          // [16bit] -2^15 ~ 2^15-1
		int i   = 1;          // [32bit] -2^31 ~ 2^31-1
		long l  = 1l;         // [64bit] -2^63 ~ 2^63-1
		
		// 小数
		float  f = 1.0f;       // IEEE 754 規格の 32 ビット浮動小数点数
		double d = 1.0d;       // IEEE 754 規格の 64 ビット浮動小数点数
		
		// 文字型
		char c1 = 'あ';         // Unicodeの一文字
		char c2 = '\u0041';     // Unicodeのマップ番号
		
		// 文字列型
		String str = "The World!"; // 文字列
		
		/*
		 * 数字、文字をコンソールに書き出してみましょう
		 */
		System.out.println("strは、" + str);
	}
	
	
}
