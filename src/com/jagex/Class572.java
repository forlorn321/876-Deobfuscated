/* Class572 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class572 implements Interface75, Interface67 {
	public static Class572 aClass572_7634;
	public static Class572 aClass572_7635;
	public static Class572 aClass572_7636 = new Class572(0, "", new Class453[] { Class453.aClass453_5008, Class453.aClass453_5084 });
	static Class572 aClass572_7637;
	int anInt7638;
	Class453[] aClass453Array7639;

	static {
		aClass572_7635 = new Class572(1, "", new Class453[] { Class453.aClass453_5008, Class453.aClass453_5008 });
		aClass572_7634 = new Class572(2, "", new Class453[] { Class453.aClass453_5084, Class453.aClass453_5084 });
		aClass572_7637 = new Class572(3, "", new Class453[] { Class453.aClass453_5008, Class453.aClass453_5008, Class453.aClass453_5084 });
	}

	public int method12() {
		return 351085287 * anInt7638;
	}

	public int method78() {
		return 351085287 * anInt7638;
	}

	Class572(int i, String string, Class453[] class453s) {
		anInt7638 = 1747243223 * i;
		aClass453Array7639 = class453s;
		Class453[] class453s_0_ = aClass453Array7639;
		for (int i_1_ = 0; i_1_ < class453s_0_.length; i_1_++) {
			Class453 class453 = class453s_0_[i_1_];
			switch (-1645921193 * class453.aClass478_5077.anInt5383) {
			case 0:
				break;
			case 3:
				break;
			default:
				break;
			case 2:
				/* empty */
			}
		}
	}

	public int method73() {
		return 351085287 * anInt7638;
	}

	static void method6934(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		TwitchWebcamDevice twitchwebcamdevice = Class484.method5843(i_2_, -1263361632);
		if (null == twitchwebcamdevice)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = twitchwebcamdevice.method1267();
	}

	static final void method6935(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (client.aClass485ArrayArray11266[i_4_][i_3_].anInt5441 * -1406935321);
	}

	static final void method6936(Class668 class668, byte i) {
		if (Class2.anIntArray96 == null || -1156908483 * Class596.anInt7830 >= Class2.anIntArray96.length)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ((Class2.anIntArray96[(Class596.anInt7830 += 572255509) * -1156908483 - 1]) & 0xffff);
	}

	static final void method6937(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055) == 2 ? 1 : 0;
	}

	static final void method6938(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_5_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_6_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		if (Class707.aBool8822) {
			Class15.method640(3, i_5_, i_6_, false, -1475430026);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = null != Class223.aFrame2336 ? 1 : 0;
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
