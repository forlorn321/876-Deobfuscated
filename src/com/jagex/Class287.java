/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Date;

public class Class287 {
	static Class287 aClass287_3201;
	static Class287 aClass287_3202;
	static Class287 aClass287_3203;
	public int anInt3204;
	static Class287 aClass287_3205;
	static Class287 aClass287_3206;
	public int anInt3207;
	public static Class287 aClass287_3208 = new Class287(0, 104);
	static Class2 aClass2_3209;

	static {
		aClass287_3202 = new Class287(1, 120);
		aClass287_3205 = new Class287(2, 136);
		aClass287_3201 = new Class287(3, 168);
		aClass287_3203 = new Class287(4, 72);
		aClass287_3206 = new Class287(5, 256);
	}

	Class287(int i, int i_0_) {
		anInt3207 = i * -1176729841;
		anInt3204 = -2094658831 * i_0_;
	}

	static void method3911(int i) {
		Class291.aClass199_3230.method2884((byte) -22);
	}

	static final void method3912(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11085 * 616246675;
	}

	static String method3913(long l) {
		return Class252.method3517(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz", (byte) 1);
	}

	static final void method3914(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_3_ = 0;
		int i_4_ = i_2_ >>> 8;
		int i_5_ = i_2_ & 0xff;
		Class14 class14 = (Class14) Class228.aClass34_2360.method70(i_1_, (byte) -61);
		Class92 class92 = ((Class92) Class205_Sub17.aClass34_9949.method70(i_4_, (byte) -13));
		Class453[] class453s = class92.aClass453ArrayArray885[i_5_];
		Object[] objects = class14.method624(i_5_, -454071675);
		if (objects == null && class92.anObjectArrayArray886 != null)
			objects = class92.anObjectArrayArray886[i_5_];
		if (objects != null)
			i_3_ = objects.length / class453s.length;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_3_;
	}
}
