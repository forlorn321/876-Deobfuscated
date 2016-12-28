/* Class684 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class684 {
	static boolean[] aBoolArray8653;

	Class684() throws Throwable {
		throw new Error();
	}

	public static byte[] method8104(byte[] is) {
		if (is == null)
			return null;
		byte[] is_0_ = new byte[is.length];
		System.arraycopy(is, 0, is_0_, 0, is.length);
		return is_0_;
	}

	public static void method8105(Class52 class52, String string, int i, Throwable throwable, int i_1_) {
		Class467.method5689(new Class571(class52, string, i, throwable), -1048328013);
	}

	static final void method8106(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_2_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_2_ >> 16];
		Class642.method7733(class251, class234, class668, 1215376741);
	}

	public static void method8107(boolean bool, int i) {
		if (client.anInt11074 * 1542697723 != 2 && 3 != 1542697723 * client.anInt11074) {
			if (!bool) {
				if (Class193.aClass205Array2183 != null) {
					Class205[] class205s = Class193.aClass205Array2183;
					for (int i_3_ = 0; i_3_ < class205s.length; i_3_++) {
						Class205 class205 = class205s[i_3_];
						class205.method2941((byte) -80);
					}
				}
				if (-1 != Class193.anInt2189 * 1092703765)
					Class184_Sub2.aClass211_9442.method3010((Class193.anInt2189 * 1092703765), 255, 1103770682);
			}
			client.anInt11074 = -277540762;
			Class392_Sub1.aClass536_Sub33_10107 = null;
			client.aBool11159 = false;
			if (Class193.anInt2184 * 518181271 > 0)
				Class170.method2421(Class570.aClass570_7626, Class193.anInt2184 * 518181271, -1, -162989105);
			Class521_Sub4.method9368(1334888769);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4425, client.aClass106_11322.aClass15_1258, 1762520380);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(bool ? 1 : 0);
			client.aClass106_11322.method1409(class536_sub23, 432833800);
		}
	}

	static final void method8108(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1779609349 * Class619.anInt8093;
	}

	static Class559 method8109(int i, int i_4_, int i_5_, Class177 class177, short i_6_) {
		if (null == class177)
			return null;
		Class559 class559 = new Class559(i, i_4_, i_5_, class177.method2493(), class177.method2563(), class177.method2483(), class177.method2562(), class177.method2497(), class177.method2498(), class177.method2499());
		return class559;
	}
}
