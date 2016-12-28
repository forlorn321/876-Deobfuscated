/* Class247_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class247_Sub1 extends Class247 {
	public static JS5ResourceProvider aClass461_9968;
	public static Class143 aClass143_9969;

	public ConfigType method55(int i, Interface12 interface12, int i_0_) {
		return new Class248(i, interface12, this);
	}

	public Class method51(int i) {
		return com.jagex.Class248.class;
	}

	public Class method52() {
		return com.jagex.Class248.class;
	}

	public ConfigType method53(int i, Interface12 interface12) {
		return new Class248(i, interface12, this);
	}

	public ConfigType method54(int i, Interface12 interface12) {
		return new Class248(i, interface12, this);
	}

	Class247_Sub1(JS5ResourceProvider class461, int i) {
		super(class461, i);
	}

	static final void method9104(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class622.anInt8127 * 77302415;
	}

	static final void method9105(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1125896429) != null)
			string = string.substring(0, string.length() - 1);
		class251.onDragHook = Class33.method796(string, class668, (short) 18903);
		class251.hasComponentHook = true;
	}

	static final void method9106(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class248 class248 = ((Class248) Class398_Sub1.aClass34_Sub8_10110.method70(i_1_, (byte) -6));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 2086350461 * class248.anInt2508;
	}
}
