/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class265 {
	public int[] anIntArray2859;
	String aString2860;
	int anInt2861 = 1040049389;
	String aString2862;
	Class273 aClass273_2863;
	Class273 aClass273_2864;
	public int[] anIntArray2865;

	void method3681(Class269 class269, int i) {
		int i_0_ = class269.method3705(-879817182);
		aClass273_2863 = Class650.method7857(-1753815573)[i_0_];
		if (aClass273_2863 == Class273.aClass273_2893) {
			int i_1_ = class269.method3705(-1087060117);
			aClass273_2864 = Class650.method7857(-1753815573)[i_1_];
			anInt2861 = class269.method3705(-1575680571) * -1040049389;
		}
		aString2862 = class269.method3709(-762907842);
		aString2860 = class269.method3709(-604864681);
		int i_2_ = class269.method3705(-2078678612);
		anIntArray2859 = new int[i_2_];
		anIntArray2865 = new int[i_2_];
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			anIntArray2859[i_3_] = class269.method3705(-2120713957);
			anIntArray2865[i_3_] = class269.method3705(-1852282325);
		}
	}

	void method3682(Class269 class269) {
		int i = class269.method3705(-1829006372);
		aClass273_2863 = Class650.method7857(-1753815573)[i];
		if (aClass273_2863 == Class273.aClass273_2893) {
			int i_4_ = class269.method3705(-592566357);
			aClass273_2864 = Class650.method7857(-1753815573)[i_4_];
			anInt2861 = class269.method3705(-1512002699) * -1040049389;
		}
		aString2862 = class269.method3709(-2087021677);
		aString2860 = class269.method3709(-1108822747);
		int i_5_ = class269.method3705(-1649261707);
		anIntArray2859 = new int[i_5_];
		anIntArray2865 = new int[i_5_];
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			anIntArray2859[i_6_] = class269.method3705(-1855741627);
			anIntArray2865[i_6_] = class269.method3705(-1917015723);
		}
	}

	void method3683(Class269 class269) {
		int i = class269.method3705(-1545514988);
		aClass273_2863 = Class650.method7857(-1753815573)[i];
		if (aClass273_2863 == Class273.aClass273_2893) {
			int i_7_ = class269.method3705(-1631479014);
			aClass273_2864 = Class650.method7857(-1753815573)[i_7_];
			anInt2861 = class269.method3705(-1581199568) * -1040049389;
		}
		aString2862 = class269.method3709(-1679072679);
		aString2860 = class269.method3709(-1142378855);
		int i_8_ = class269.method3705(-784202314);
		anIntArray2859 = new int[i_8_];
		anIntArray2865 = new int[i_8_];
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			anIntArray2859[i_9_] = class269.method3705(-981854004);
			anIntArray2865[i_9_] = class269.method3705(-1172499013);
		}
	}

	void method3684(Class269 class269) {
		int i = class269.method3705(-1237709908);
		aClass273_2863 = Class650.method7857(-1753815573)[i];
		if (aClass273_2863 == Class273.aClass273_2893) {
			int i_10_ = class269.method3705(-1088071264);
			aClass273_2864 = Class650.method7857(-1753815573)[i_10_];
			anInt2861 = class269.method3705(-1281933208) * -1040049389;
		}
		aString2862 = class269.method3709(-1311474830);
		aString2860 = class269.method3709(-1453947224);
		int i_11_ = class269.method3705(-1579227159);
		anIntArray2859 = new int[i_11_];
		anIntArray2865 = new int[i_11_];
		for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
			anIntArray2859[i_12_] = class269.method3705(-1698050958);
			anIntArray2865[i_12_] = class269.method3705(-1663269668);
		}
	}

	Class265() {
		/* empty */
	}

	static final int method3685(int i, byte i_13_) {
		if (i < 4)
			return 0;
		if (i < 10)
			return i - 3;
		return i - 6;
	}

	public static void method3686(int i, int i_14_, int i_15_, int i_16_, byte i_17_) {
		Class575.aLinkedList7661.addLast(new Class580(i, i_14_, i_15_ - i, i_16_ - i_14_));
	}

	static final void method3687(Class668 class668, byte i) throws Exception_Sub3 {
		class668.anInt8542 -= 1472892954;
		int i_18_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_19_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class683.aClass301_Sub1_8651.method4045((float) (2.0 * ((double) i_18_ * 3.141592653589793) / 16384.0), (float) ((double) i_19_ * 3.141592653589793 * 2.0 / 16384.0), -1606307463);
	}

	static void method3688(int i, byte i_20_) {
		if (-1 != i && !Class684.aBoolArray8653[i]) {
			Class452.aClass461_4953.method5568(i, (short) -22105);
			Class463.aClass234Array5227[i] = null;
		}
	}

	public static boolean method3689(int i, int i_21_) {
		return i == 1 || i == 3 || i == 5;
	}

	static final int method3690(int i, int i_22_, int i_23_, int i_24_, int i_25_) {
		int i_26_ = 65536 - Class447.anIntArray4921[i_23_ * 8192 / i_24_] >> 1;
		return (i_22_ * i_26_ >> 16) + (i * (65536 - i_26_) >> 16);
	}
}
