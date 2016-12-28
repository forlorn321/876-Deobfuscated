/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class144 implements Interface75 {
	int anInt1670;
	static Class144 aClass144_1671;
	static Class144 aClass144_1672 = new Class144(2, 1);
	static Class144 aClass144_1673;
	static Class144 aClass144_1674;
	static Class144 aClass144_1675;
	static Class144 aClass144_1676;
	int anInt1677;
	static Class144 aClass144_1678;
	public static int anInt1679;
	public static Class34_Sub12 aClass34_Sub12_1680;
	public static int anInt1681;

	public int method12() {
		return 837941301 * anInt1670;
	}

	public int method78() {
		return 837941301 * anInt1670;
	}

	static {
		aClass144_1671 = new Class144(0, 2);
		aClass144_1676 = new Class144(4, 3);
		aClass144_1673 = new Class144(3, 4);
		aClass144_1674 = new Class144(5, 5);
		aClass144_1678 = new Class144(6, 6);
		aClass144_1675 = new Class144(1, 7);
	}

	public int method73() {
		return 837941301 * anInt1670;
	}

	Class144(int i, int i_0_) {
		anInt1677 = i * 20833011;
		anInt1670 = i_0_ * 1712036381;
	}

	static int method1789(byte i) {
		return (Class262.anInt2849 += 2072713885) * -1940636747 - 1;
	}

	static void method1790(int i) {
		Class6 class6 = Class153_Sub1.method8383("2", client.aClass670_11043.aString8573, false, 2084649736);
		Class590.aClass147_Sub1_7791.method8407(class6, (byte) 54);
	}

	static final void method1791(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_1_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class565.method6876(class251, class234, class668, 939051185);
	}

	static final void method1792(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3241(899693244) == i_2_ ? 1 : 0;
	}

	static final void method1793(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((ItemDefinitions) Class111.aClass34_Sub13_1391.method70(i_3_, (byte) 45)).equipLookHideSlot2 * -2135676771);
	}

	static final void method1794(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9890((byte) -83) ? 1 : 0;
	}

	static Class536_Sub23 method1795(int i) {
		if (Class536_Sub23.anInt10532 * 1727980915 == 0)
			return new Class536_Sub23();
		return (Class536_Sub23.aClass536_Sub23Array10531[(Class536_Sub23.anInt10532 -= 373737403) * 1727980915]);
	}

	static void method1796(Class67_Sub1 class67_sub1, byte i) {
		class67_sub1.method9797(0, (byte) -16);
		int i_4_;
		if (Class505.anInt6857 * -839563813 >= 96) {
			int i_5_ = Class156.method1883(-323771008);
			if (i_5_ <= 101) {
				Class38.method843((byte) -28);
				i_4_ = 4;
			} else if (i_5_ <= 500) {
				Class154.method1875((byte) 16);
				i_4_ = 3;
			} else if (i_5_ <= 1000) {
				IncomingPacket.method5070((byte) 11);
				i_4_ = 2;
			} else {
				Class69.method1091(true, (short) 128);
				i_4_ = 1;
			}
			class67_sub1.method9795(0, i_5_, (byte) 40);
		} else {
			Class69.method1091(true, (short) 128);
			i_4_ = 1;
			class67_sub1.method9792(64, -2125603541);
		}
		if (Class710.aClass536_Sub40_8843.aClass710_Sub15_10767.method10071(429696594) != 0) {
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub15_10766), 0, (byte) 1);
			Class704.method8264(0, false, (byte) 65);
		} else
			Class710.aClass536_Sub40_8843.method9858((Class710.aClass536_Sub40_8843.aClass710_Sub15_10767), true, (byte) 3);
		Class27.method763(2059521898);
		class67_sub1.method9794(i_4_, -1914631539);
	}
}
