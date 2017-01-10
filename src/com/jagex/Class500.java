/* Class500 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class500 {
	public int anInt6838;
	public int anInt6839 = -1673100765;
	public int anInt6840;
	protected static int anInt6841;
	public int anInt6842;
	public Class688 aClass688_6843;
	public static short[][] skinColors;

	Class500(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1) {
		aClass688_6843 = new Class688_Sub2(class649_sub1_sub5_sub1, false);
	}

	static final void method6026(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1142987460) != null)
			string = string.substring(0, string.length() - 1);
		class251.onMouseRepeatHook = Class33.method796(string, class668, (short) -1420);
		class251.hasComponentHook = true;
	}

	static final void method6027(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		Class436 class436 = Class436.method5257((float) i_0_, (float) i_0_, (float) i_0_);
		if (-1.0F == class436.aFloat4850)
			class436.aFloat4850 = Float.POSITIVE_INFINITY;
		if (class436.aFloat4852 == -1.0F)
			class436.aFloat4852 = Float.POSITIVE_INFINITY;
		if (class436.aFloat4853 == -1.0F)
			class436.aFloat4853 = Float.POSITIVE_INFINITY;
		Class683.aClass301_Sub1_8651.method4037(class436, 1919749668);
		Class683.aClass301_Sub1_8651.method4034((float) i_1_ / 1000.0F, 1805138400);
		class436.method5239();
	}

	static final void method6028(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
	}

	static GameMode[] method6029(byte i) {
		return (new GameMode[] { GameMode.aClass670_8569, GameMode.aClass670_8568, GameMode.aClass670_8571, GameMode.aClass670_8570, GameMode.aClass670_8575, GameMode.aClass670_8572 });
	}

	static final void method6030(Class668 class668, byte i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Integer.toString(i_2_);
	}
}
