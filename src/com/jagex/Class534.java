/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534 implements Interface64 {
	Class649_Sub1_Sub5_Sub5 aClass649_Sub1_Sub5_Sub5_7130;

	Class534(Class649_Sub1_Sub5_Sub5 class649_sub1_sub5_sub5) {
		aClass649_Sub1_Sub5_Sub5_7130 = class649_sub1_sub5_sub5;
	}

	public boolean method420(Class649_Sub1_Sub5 class649_sub1_sub5, int i) {
		return class649_sub1_sub5 == aClass649_Sub1_Sub5_Sub5_7130;
	}

	public boolean method421(Class649_Sub1_Sub5 class649_sub1_sub5) {
		return class649_sub1_sub5 == aClass649_Sub1_Sub5_Sub5_7130;
	}

	static final void method6468(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4515, client.aClass106_11322.aClass15_1258, 663786877);
		class536_sub23.stream.writeShort(i_0_, -1778059594);
		client.aClass106_11322.writePacket(class536_sub23, 1884156957);
	}

	static final void method6469(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		int i_1_ = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) - 1);
		if (i_1_ < 0 || i_1_ > 9)
			class668.anInt8544 -= 1946079257;
		else
			class251.setOp(i_1_, (String) (class668.anObjectArray8543[((class668.anInt8544 -= 1946079257) * 366709801)]));
	}

	static void method6470(IComponentDefinitions class251, int i) {
		if (1049444347 * class251.anInt2728 == 5 && -1484799213 * class251.anInt2711 != -1)
			Class228.method3288(Class677.aClass167_8609, class251, 73603669);
	}
}
