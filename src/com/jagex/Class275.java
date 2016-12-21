/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

final class Class275 implements Interface29 {
	public static Class459_Sub1[] aClass459_Sub1Array3024;

	public long method168(String string, int i) {
		return Class30.method780(string, (byte) -24);
	}

	public long method170(String string) {
		return Class30.method780(string, (byte) -11);
	}

	public long method169(String string) {
		return Class30.method780(string, (byte) 1);
	}

	public long method167(String string) {
		return Class30.method780(string, (byte) -108);
	}

	static Class12 method3736(Class1 class1, RSByteBuffer class536_sub33, int i, int i_0_) {
		Class12 class12 = new Class12(class1);
		int i_1_ = class536_sub33.readUnsignedByte(6144354);
		boolean bool = (i_1_ & 0x1) != 0;
		boolean bool_2_ = 0 != (i_1_ & 0x2);
		boolean bool_3_ = (i_1_ & 0x4) != 0;
		boolean bool_4_ = (i_1_ & 0x8) != 0;
		if (bool) {
			if (i <= 1) {
				class12.anIntArray149[0] = class536_sub33.readUnsignedShort((short) -6712);
				class12.anIntArray152[0] = class536_sub33.readUnsignedShort((short) -6795);
			} else {
				class12.anIntArray149[0] = class536_sub33.method9720((byte) 1);
				class12.anIntArray152[0] = class536_sub33.method9720((byte) 1);
			}
			if (-1 != class1.anInt46 * 661594531 || -490119801 * class1.anInt48 != -1) {
				if (i <= 1) {
					class12.anIntArray149[1] = class536_sub33.readUnsignedShort((short) -2108);
					class12.anIntArray152[1] = class536_sub33.readUnsignedShort((short) -26204);
				} else {
					class12.anIntArray149[1] = class536_sub33.method9720((byte) 1);
					class12.anIntArray152[1] = class536_sub33.method9720((byte) 1);
				}
			}
			if (-1 != 1280785913 * class1.anInt66 || class1.anInt20 * 835049345 != -1) {
				if (i <= 1) {
					class12.anIntArray149[2] = class536_sub33.readUnsignedShort((short) 19121);
					class12.anIntArray152[2] = class536_sub33.readUnsignedShort((short) -19992);
				} else {
					class12.anIntArray149[2] = class536_sub33.method9720((byte) 1);
					class12.anIntArray152[2] = class536_sub33.method9720((byte) 1);
				}
			}
		}
		if (bool_2_) {
			if (i <= 1) {
				class12.anIntArray153[0] = class536_sub33.readUnsignedShort((short) 29005);
				class12.anIntArray154[0] = class536_sub33.readUnsignedShort((short) -2975);
			} else {
				class12.anIntArray153[0] = class536_sub33.method9720((byte) 1);
				class12.anIntArray154[0] = class536_sub33.method9720((byte) 1);
			}
			if (-1 != class1.anInt58 * -869646663 || class1.anInt82 * 1550687287 != -1) {
				if (i <= 1) {
					class12.anIntArray153[1] = class536_sub33.readUnsignedShort((short) 30514);
					class12.anIntArray154[1] = class536_sub33.readUnsignedShort((short) -14517);
				} else {
					class12.anIntArray153[1] = class536_sub33.method9720((byte) 1);
					class12.anIntArray154[1] = class536_sub33.method9720((byte) 1);
				}
			}
		}
		if (bool_3_) {
			int i_5_ = class536_sub33.readUnsignedShort((short) 29857);
			int[] is = new int[4];
			is[0] = i_5_ & 0xf;
			is[1] = i_5_ >> 4 & 0xf;
			is[2] = i_5_ >> 8 & 0xf;
			is[3] = i_5_ >> 12 & 0xf;
			for (int i_6_ = 0; i_6_ < 4; i_6_++) {
				if (15 != is[i_6_])
					class12.aShortArray155[is[i_6_]] = (short) class536_sub33.readUnsignedShort((short) -13604);
			}
		}
		if (bool_4_) {
			int i_7_ = class536_sub33.readUnsignedByte(1843756799);
			int[] is = new int[2];
			is[0] = i_7_ & 0xf;
			is[1] = i_7_ >> 4 & 0xf;
			for (int i_8_ = 0; i_8_ < 2; i_8_++) {
				if (is[i_8_] != 15)
					class12.aShortArray156[is[i_8_]] = (short) class536_sub33.readUnsignedShort((short) 21536);
			}
		}
		return class12;
	}

	public static final void method3737(boolean bool, int i) {
		Class106[] class106s = client.aClass106Array11062;
		for (int i_9_ = 0; i_9_ < class106s.length; i_9_++) {
			Class106 class106 = class106s[i_9_];
			try {
				class106.method1408(1023015778);
			} catch (IOException ioexception) {
				/* empty */
			}
			class106.method1418(1639557232);
		}
		Class116.method1485(-1608060471);
		Class396.method4889(-1715467174);
		Class558.method6817(false, 902832405);
		client.aClass515_11066.method6259(-1732027393);
		client.aClass515_11066.method6258((byte) 0);
		client.aClass515_11066.method6262(1063724184);
		Class465_Sub1.method9387(-931943004);
		Class316.method4218(-1892364643);
		Class100.method1339(true, (short) 27545);
		Class595.method7134((byte) 1);
		Class141.method1712((short) 311);
		client.anInt11156 = -213831113;
		if (bool)
			Class673.method8026(4, -1798113843);
		else {
			Class673.method8026(16, -1798113843);
			try {
				Class25.method729(Class622.anApplet8126, "loggedout", -1773644883);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method3738(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3223(-569501258);
	}

	static final void method3739(Class668 class668, byte i) {
		if (Class331_Sub2.aClass549_10049.method6638(81, (byte) 0))
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
