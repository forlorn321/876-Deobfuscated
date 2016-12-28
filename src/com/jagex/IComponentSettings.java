/* Class536_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class IComponentSettings extends Class536 {
	public int settings;
	static IComponentSettings aClass536_Sub14_10477 = new IComponentSettings(0, -1);
	public int interfaceHash;

	public final boolean method9472(int i, int i_0_) {
		return 0 != (settings * -512963777 >> 1 + i & 0x1);
	}

	public final boolean method9473(int i) {
		return (settings * -512963777 >> 21 & 0x1) != 0;
	}

	public final int method9474(byte i) {
		return Class703.method8258(-512963777 * settings, 2126713908);
	}

	public final boolean method9476(short i) {
		return (-512963777 * settings & 0x1) != 0;
	}

	public final boolean method9477(int i) {
		return 0 != (settings * -512963777 >> 23 & 0x1);
	}

	public IComponentSettings(int i, int i_1_) {
		settings = -1704942401 * i;
		interfaceHash = i_1_ * 1081619073;
	}

	public final boolean method9491(int i) {
		return 0 != (settings * -512963777 >> 22 & 0x1);
	}

	public final int method9494(int i) {
		return settings * -512963777 >> 18 & 0x7;
	}

	public static void method9498(Interface74 interface74, byte i) {
		if (IcmpService_Sub1.anIcmpService_Sub1_10855 == null)
			throw new IllegalStateException("");
		IcmpService_Sub1.anIcmpService_Sub1_10855.aList10854.add(interface74);
	}

	static final void method9499(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 2003514143 * class251.anInt2636;
	}

	static final void method9500(Class668 class668, byte i) {
		class668.anInt8542 -= -1411037171;
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Exception_Sub7.method10552(i_2_, -129672678);
	}
}
