/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class444 implements Interface5 {
	Class461 aClass461_4880;
	int anInt4881;

	public int method47() {
		if (aClass461_4880.method5560(anInt4881 * -905170181, 968593744))
			return 100;
		return aClass461_4880.method5562(anInt4881 * -905170181, -2116850394);
	}

	public int method48(int i) {
		if (aClass461_4880.method5560(anInt4881 * -905170181, 469942941))
			return 100;
		return aClass461_4880.method5562(anInt4881 * -905170181, -2088005174);
	}

	Class444(Class461 class461, int i) {
		aClass461_4880 = class461;
		anInt4881 = i * -1999763405;
	}

	public Class50 method50(byte i) {
		return Class50.aClass50_583;
	}

	public Class50 method46() {
		return Class50.aClass50_583;
	}

	public Class50 method49() {
		return Class50.aClass50_583;
	}

	public Class50 method45() {
		return Class50.aClass50_583;
	}

	public static final void method5392(int i) {
		GameShell.aClass504_6883.method6059(1474485579);
		for (int i_0_ = 0; i_0_ < 32; i_0_++)
			GameShell.aLongArray6860[i_0_] = 0L;
		for (int i_1_ = 0; i_1_ < 32; i_1_++)
			GameShell.aLongArray6861[i_1_] = 0L;
		Class243.anInt2458 = 0;
	}

	static final void method5393(Class668 class668, byte i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		ItemTypeDecoder class1 = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(i_2_, (byte) -27);
		if (208949951 * class1.anInt64 >= 0 && 989214201 * class1.anInt67 >= 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class1.anInt67 * 989214201;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_2_;
	}

	static void method5394(int i, int i_3_) {
		Class588.anInt7740 = 254753283 * i;
		synchronized (Class49.aClass199_580) {
			Class49.aClass199_580.method2884((byte) -25);
		}
	}

	public static void method5395(int i, int i_4_) {
		Class684.aBoolArray8653[i] = false;
		Class265.method3688(i, (byte) 104);
	}

	static final void method5396(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.spotShadowSetting.method10014(-1904559876) == 1 ? 1 : 0;
	}
}
