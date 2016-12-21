/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class250 implements Interface27 {
	int anInt2530;
	int anInt2531;
	Class213 this$0;

	public void method154(Class226 class226, short i) {
		class226.method3234(-1956150451 * anInt2531, anInt2530 * 268438873, (byte) -60);
		class226.method3227(anInt2531 * -1956150451, -781094290).method3123(368312517);
	}

	public void method155(Class226 class226) {
		class226.method3234(-1956150451 * anInt2531, anInt2530 * 268438873, (byte) 48);
		class226.method3227(anInt2531 * -1956150451, -781094290).method3123(368312517);
	}

	Class250(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		anInt2531 = class536_sub33.readUnsignedShort((short) 2624) * 655715717;
		anInt2530 = class536_sub33.readUnsignedShort((short) -1621) * -13276439;
	}

	public void method153(Class226 class226) {
		class226.method3234(-1956150451 * anInt2531, anInt2530 * 268438873, (byte) 96);
		class226.method3227(anInt2531 * -1956150451, -781094290).method3123(368312517);
	}

	static final void method3459(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (string.startsWith(Class635.method7563(0, (byte) -81)) || string.startsWith(Class635.method7563(1, (byte) 10)))
			string = string.substring(7);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class536_Sub20.method9568(string, -570813033);
	}

	static final void method3460(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -2020441271 * Class61.anInt694;
	}

	public static Class697[] method3461(Class691 class691, byte i) {
		int[] is = class691.method8188(1655945510);
		Class697[] class697s = new Class697[is.length >> 2];
		for (int i_0_ = 0; i_0_ < class697s.length; i_0_++) {
			Class697 class697 = new Class697();
			class697s[i_0_] = class697;
			class697.anInt8744 = -749744593 * is[i_0_ << 2];
			class697.anInt8743 = is[1 + (i_0_ << 2)] * 768002489;
			class697.anInt8745 = is[2 + (i_0_ << 2)] * 1802604007;
			class697.anInt8742 = 430138953 * is[(i_0_ << 2) + 3];
		}
		return class697s;
	}

	static final void method3462(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3227(i_1_, -781094290).method3137((byte) 82) ? 1 : 0;
	}

	static final void method3463(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static void method3464(Class153 class153, byte i) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(2, (long) (class153.anInt1715 * -1786401803));
		class536_sub18_sub5.method10669(-586511687);
	}
}
