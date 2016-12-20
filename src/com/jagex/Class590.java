/* Class590 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class590 implements Interface76 {
	static Class590 aClass590_7789;
	static Class590 aClass590_7790;
	static Class590 aClass590_7791 = new Class590(0);
	int anInt7792;
	public static Class62_Sub1 aClass62_Sub1_7793;

	public int method87() {
		return anInt7792 * -1583083105;
	}

	Class590(int i) {
		anInt7792 = i * 1644874335;
	}

	public int method91() {
		return anInt7792 * -1583083105;
	}

	public int method42() {
		return anInt7792 * -1583083105;
	}

	static {
		aClass590_7789 = new Class590(1);
		aClass590_7790 = new Class590(2);
	}

	public static Class590[] method9850() {
		return (new Class590[] { aClass590_7790, aClass590_7791, aClass590_7789 });
	}

	public static Class590[] method9851() {
		return (new Class590[] { aClass590_7790, aClass590_7791, aClass590_7789 });
	}

	public static Class590[] method9852() {
		return (new Class590[] { aClass590_7790, aClass590_7791, aClass590_7789 });
	}

	public static final int method9853(int i, int i_0_, int i_1_, byte i_2_) {
		if (client.aClass509_11072.method8314(-1383830549) == null)
			return 0;
		int i_3_ = i >> 9;
		int i_4_ = i_0_ >> 9;
		if (i_3_ < 0 || i_4_ < 0 || i_3_ > client.aClass509_11072.method8284((byte) 80) - 1 || i_4_ > client.aClass509_11072.method8285(887635977) - 1)
			return 0;
		int i_5_ = i_1_;
		if (i_5_ < 3 && ((client.aClass509_11072.method8359(-113262132).aByteArrayArrayArray5354[1][i_3_][i_4_]) & 0x2) != 0)
			i_5_++;
		return client.aClass509_11072.method8314(790984364).aClass161Array7434[i_5_].method2593(i, i_0_, -1151432033);
	}
}
