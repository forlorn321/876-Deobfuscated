/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class175 {
	public int anInt1928;
	public int anInt1929;
	public int anInt1930;
	int anInt1931;
	public int anInt1932;
	public int anInt1933;
	public int anInt1934;
	public static Interface24 anInterface24_1935;

	public Class175(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt1932 = i * -158484941;
		anInt1934 = 261072557 * i_0_;
		anInt1930 = i_1_ * -1714306347;
		anInt1931 = i_2_ * 565102899;
		anInt1928 = i_3_ * 1238295881;
		anInt1933 = i_4_ * 1127551047;
		anInt1929 = i_5_ * -284212951;
	}

	public boolean method2450(Class175 class175_6_, byte i) {
		return (432289019 * class175_6_.anInt1932 == 432289019 * anInt1932 && 71478565 * class175_6_.anInt1934 == anInt1934 * 71478565 && class175_6_.anInt1930 * 1487365757 == 1487365757 * anInt1930 && 530209275 * anInt1931 == class175_6_.anInt1931 * 530209275 && (-1036575495 * anInt1928 == class175_6_.anInt1928 * -1036575495) && 135108983 * anInt1933 == class175_6_.anInt1933 * 135108983 && (anInt1929 * -1386026215 == class175_6_.anInt1929 * -1386026215));
	}

	public Class175() {
		/* empty */
	}

	static boolean method2451(byte i) {
		boolean bool;
		try {
			Class85 class85 = new Class85();
			byte[] is = class85.method1185(Class291.aByteArray3231, 1793456077);
			Huffman.method3771(is, (byte) 12);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	static final void method2452(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_7_);
		Class234 class234 = Class463.aClass234Array5227[i_7_ >> 16];
		Class466.method5683(class251, class234, class668, -1818873532);
	}

	static final boolean method2453(char c, int i) {
		if (Character.isISOControl(c))
			return false;
		if (Class608.method7260(c, 2105503447))
			return true;
		char[] cs = Class93.aCharArray889;
		for (int i_8_ = 0; i_8_ < cs.length; i_8_++) {
			char c_9_ = cs[i_8_];
			if (c == c_9_)
				return true;
		}
		cs = Class93.aCharArray890;
		for (int i_10_ = 0; i_10_ < cs.length; i_10_++) {
			char c_11_ = cs[i_10_];
			if (c == c_11_)
				return true;
		}
		return false;
	}
}
