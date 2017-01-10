/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class207 {
	static Class207 aClass207_2238;
	static Class207 aClass207_2239;
	public static Class207 aClass207_2240 = new Class207();
	static Class207 aClass207_2241 = new Class207();
	public static Class207 aClass207_2242;
	static int anInt2243;
	public static Class34_Sub22 aClass34_Sub22_2244;

	Class207() {
		/* empty */
	}

	static {
		aClass207_2239 = new Class207();
		aClass207_2238 = new Class207();
		aClass207_2242 = new Class207();
	}

	static final void method2963(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((Class536_Sub18_Sub1) Class74.aClass34_Sub21_818.method70(i_0_, (byte) 51)).anInt11330) * -1574179605;
	}

	static final void method2964(Class668 class668, byte i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_1_);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		GraphicalRenderer.method2411(class251, class234, class668, 1724353800);
	}

	public static final void method2965(String string, String string_2_, byte i) {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		OutgoingPacketContainer class536_sub23 = Class213.createOutgoingPacket(OutgoingPacket.aClass414_4506, class106.aClass15_1258, 1399244557);
		if (string_2_.length() > 30)
			string_2_ = string_2_.substring(0, 30);
		class536_sub23.stream.writeByte((Class555.method6802(string, 522556789) + Class555.method6802(string_2_, -818730005)));
		class536_sub23.stream.writeString(string);
		class536_sub23.stream.writeString(string_2_);
		class106.writePacket(class536_sub23, 991721859);
	}

	static final void method2966(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.modelType = -2106309430;
		class251.aClass304_2583 = null;
		class251.modelId = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * 1639447419;
		if (-809980533 * class251.anInt2546 == -1 && !class234.aBool2379)
			Class34_Sub7.method10328(class251.anInt2559 * -1591767037, (short) -3333);
	}
}
