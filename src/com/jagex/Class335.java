/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

public class Class335 implements Interface33 {
	Class384 aClass384_3629;

	public boolean method207() {
		return true;
	}

	public boolean method214() {
		return true;
	}

	public void method206(int i) {
		/* empty */
	}

	public boolean method209(int i) {
		return true;
	}

	public void method212(boolean bool) {
		if (bool)
			Class677.aClass167_8609.method2063(0, 0, -1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499, 1480406519 * aClass384_3629.anInt4018, 0);
	}

	public void method217() {
		/* empty */
	}

	public void method211(boolean bool) {
		if (bool)
			Class677.aClass167_8609.method2063(0, 0, -1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499, 1480406519 * aClass384_3629.anInt4018, 0);
	}

	public void method216(boolean bool, int i) {
		if (bool)
			Class677.aClass167_8609.method2063(0, 0, -1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499, 1480406519 * aClass384_3629.anInt4018, 0);
	}

	public void method213(boolean bool) {
		if (bool)
			Class677.aClass167_8609.method2063(0, 0, -1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499, 1480406519 * aClass384_3629.anInt4018, 0);
	}

	public void method210(boolean bool) {
		if (bool)
			Class677.aClass167_8609.method2063(0, 0, -1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499, 1480406519 * aClass384_3629.anInt4018, 0);
	}

	public boolean method215() {
		return true;
	}

	Class335(Class384 class384) {
		aClass384_3629 = class384;
	}

	public void method208(boolean bool) {
		if (bool)
			Class677.aClass167_8609.method2063(0, 0, -1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499, 1480406519 * aClass384_3629.anInt4018, 0);
	}

	static final void method4370(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class194.method2853(class251, class234, class668, (short) 2903);
	}

	static final void method4371(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		String string = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801]);
		String string_0_ = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801 + 1]);
		if (0 != client.anInt11160 * 423156687 || ((!client.aBool11078 || client.aBool11163) && !client.aBool11166)) {
			Class106 class106 = Class536_Sub41.method9871(2077853800);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4460, class106.aClass15_1258, 712227686);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(0, -1778059594);
			int i_1_ = (-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
			Class100.method1334(class536_sub23.aClass536_Sub33_Sub2_10528, string_0_, -2111850483);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9698(-810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off) - i_1_, 740048950);
			class106.method1409(class536_sub23, -223218520);
		}
	}

	static final void method4372(Class668 class668, byte i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		boolean bool = true;
		if (i_2_ < 0)
			bool = 0 == (1 + i_2_) % 4;
		else if (i_2_ < 1582)
			bool = 0 == i_2_ % 4;
		else if (i_2_ % 4 != 0)
			bool = false;
		else if (0 != i_2_ % 100)
			bool = true;
		else if (0 != i_2_ % 400)
			bool = false;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = bool ? 1 : 0;
	}

	static final void method4373(Class668 class668, int i) {
		if (Class61.anIterator698 != null && Class61.anIterator698.hasNext())
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ((Integer) Class61.anIterator698.next()).intValue();
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
	}

	public static byte[] method4374(File file, byte i) {
		return Class187.method2786(file, (int) file.length(), (byte) -112);
	}

	static final void method4375(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_3_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class569.method6924(class683.aClass251_8650, i_3_, i_4_, -345315736);
	}

	static final void method4376(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class683.aClass301_Sub1_8651.method4089(i_5_, (byte) 92);
	}

	static void method4377(Class167 class167, int i, int i_6_, InterfaceDefinitions class251, Class161 class161, int i_7_, int i_8_, int i_9_) {
		for (int i_10_ = 0; i_10_ < client.anInt11053 * -664631943; i_10_++) {
			Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) client.anIntArray11211[i_10_]));
			if (null != class536_sub13) {
				Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class536_sub13.anObject10468);
				if (class649_sub1_sub5_sub1_sub1.method11068(2073549523) && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839 == class649_sub1_sub5_sub1_sub1.aByte10839)) {
					Class296 class296 = class649_sub1_sub5_sub1_sub1.aClass296_12174;
					if (null != class296 && null != class296.anIntArray3304)
						class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -76);
					if (null != class296 && class296.aBool3284 && class296.aBool3287) {
						Class436 class436 = (class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
						int i_11_ = (int) class436.aFloat4850 / 128 - i / 128;
						int i_12_ = (int) class436.aFloat4853 / 128 - i_6_ / 128;
						if (class296.anInt3329 * 1269730445 != -1)
							Class103.method1371(class167, class161, class251, i_7_, i_8_, i_11_, i_12_, (1269730445 * class296.anInt3329), -33191159);
						else
							Class533.method6467(class251, class161, i_7_, i_8_, i_11_, i_12_, Class35.aClass143Array292[1], (byte) -10);
					}
				}
			}
		}
	}
}
