/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class298 {
	static Class298 aClass298_3344;
	static Class298 aClass298_3345;
	static Class298 aClass298_3346 = new Class298(0, true);
	int anInt3347;
	boolean aBool3348;

	Class298(int i, boolean bool) {
		anInt3347 = -2036429903 * i;
		aBool3348 = bool;
	}

	static {
		aClass298_3345 = new Class298(1, true);
		aClass298_3344 = new Class298(2, false);
	}

	public static int method4009(int i, int i_0_, int i_1_, int i_2_) {
		i_1_ &= 0x3;
		if (i_1_ == 0)
			return i_0_;
		if (1 == i_1_)
			return 4095 - i;
		if (2 == i_1_)
			return 4095 - i_0_;
		return i;
	}

	static final void method4010(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class182.method2723(class251, class234, class668, (byte) -122);
	}

	static final void method4011(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_3_);
		Class234 class234 = Class463.aClass234Array5227[i_3_ >> 16];
		Class107.method1438(class251, class234, class668, -1308350610);
	}

	static final void method4012(Class668 class668, byte i) {
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4508, client.aClass106_11322.aClass15_1258, 1173456635);
		client.aClass106_11322.writePacket(class536_sub23, 1381347610);
	}

	public static void method4013(String string, int i) {
		Class105.aString1243 = string;
		Class105.anInt1246 = Class105.aString1243.length() * -1505065287;
	}

	static final void method4014(Class668 class668, byte i) {
		client.aBool11147 = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
		if (client.aBool11147)
			GraphicalRenderer.method2408(1105758597);
	}

	public static void method4015(int[] is, int[] is_4_, int i) {
		if (is == null || is_4_ == null) {
			CircularBuffer.anIntArray8816 = null;
			CircularBuffer.anIntArray8819 = null;
			CircularBuffer.aByteArrayArrayArray8820 = null;
		} else {
			CircularBuffer.anIntArray8816 = is;
			CircularBuffer.anIntArray8819 = new int[is.length];
			CircularBuffer.aByteArrayArrayArray8820 = new byte[is.length][][];
			for (int i_5_ = 0; i_5_ < CircularBuffer.anIntArray8816.length; i_5_++)
				CircularBuffer.aByteArrayArrayArray8820[i_5_] = new byte[is_4_[i_5_]][];
		}
	}
}
