/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class210 implements Interface76 {
	int anInt2247;
	public static Class210 aClass210_2248;
	public static Class210 aClass210_2249;
	int anInt2250;
	public static Class210 aClass210_2251 = new Class210(1, 0);
	static int[] anIntArray2252;

	public static Class210[] method3870(byte i) {
		return (new Class210[] { aClass210_2248, aClass210_2251, aClass210_2249 });
	}

	public static Class210[] method3871() {
		return (new Class210[] { aClass210_2248, aClass210_2251, aClass210_2249 });
	}

	public int method87() {
		return anInt2250 * -362259119;
	}

	static {
		aClass210_2248 = new Class210(0, 1);
		aClass210_2249 = new Class210(2, 2);
	}

	Class210(int i, int i_0_) {
		anInt2247 = -2118732745 * i;
		anInt2250 = i_0_ * -616232015;
	}

	public int method91() {
		return anInt2250 * -362259119;
	}

	public int method42() {
		return anInt2250 * -362259119;
	}

	static final void method3872(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.method17815(class243).method16255((byte) 108);
	}

	static final void method3873(Class665 class665, int i) {
		Class316_Sub1.method15723(true, -1504177847);
	}

	static final void method3874(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_2_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		boolean bool = 1 == (class665.anIntArray8525[2 + 1769813785 * class665.anInt8526]);
		Class634 class634 = Class703.aClass219_8825.method3992(i_1_, 1111108878).method3919(i_2_, 1751859165);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (bool ? class634.method10522((byte) 21) : class634.method10526(-1224101970));
	}
}
