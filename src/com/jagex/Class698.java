/* Class698 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class698 implements Interface76 {
	static Class698 aClass698_8763;
	public static Class698 aClass698_8764;
	static Class698 aClass698_8765;
	public static Class698 aClass698_8766;
	public static Class698 aClass698_8767 = new Class698(-2);
	static Class698 aClass698_8768;
	int anInt8769;

	public int method87() {
		return anInt8769 * -1859348849;
	}

	public int method42() {
		return anInt8769 * -1859348849;
	}

	static {
		aClass698_8764 = new Class698(-3);
		aClass698_8763 = new Class698(2);
		aClass698_8766 = new Class698(3);
		aClass698_8765 = new Class698(21);
		aClass698_8768 = new Class698(20);
	}

	Class698(int i) {
		anInt8769 = -456800145 * i;
	}

	public int method91() {
		return anInt8769 * -1859348849;
	}

	public static Class698[] method14269() {
		return (new Class698[] { aClass698_8768, aClass698_8763, aClass698_8764, aClass698_8765, aClass698_8766, aClass698_8767 });
	}

	public static Class698[] method14270() {
		return (new Class698[] { aClass698_8768, aClass698_8763, aClass698_8764, aClass698_8765, aClass698_8766, aClass698_8767 });
	}

	public static int method14271(int i, int i_0_, boolean bool, int i_1_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 48);
		if (class527_sub1 == null)
			return -1;
		if (i_0_ < 0 || i_0_ >= class527_sub1.anIntArray10332.length)
			return -1;
		return class527_sub1.anIntArray10332[i_0_];
	}

	static final void method14272(Class665 class665, byte i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method14289(i_2_, 1196591228);
	}

	public static void method14273(int i) {
		Class106.anInt1321 = 1830047253;
	}

	static final void method14274(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_3_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_4_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4154(i_3_, -1572954).method4082(i_4_, (byte) 81) ? 1 : 0;
	}
}
