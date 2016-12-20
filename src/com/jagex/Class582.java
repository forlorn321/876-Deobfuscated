/* Class582 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class582 implements Interface67 {
	int anInt7678;

	public void method285() {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4495, client.aClass109_11067.aClass2_1367, (byte) 11);
		class527_sub15.buffer.writeShortLE2(anInt7678 * 168612107, (byte) 1);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	public void method421(int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4495, client.aClass109_11067.aClass2_1367, (byte) 10);
		class527_sub15.buffer.writeShortLE2(anInt7678 * 168612107, (byte) -121);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	Class582(int i) {
		anInt7678 = i * 641757859;
	}

	static final void method9670(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 1281082053);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class309.method5629(class243, class240, class665, 204273084);
	}

	static final void method9671(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -2119864417 * client.anInt11237;
	}

	static final void method9672(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.aBool2537 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1;
		Class430.method6876(class243, (byte) 44);
	}
}
