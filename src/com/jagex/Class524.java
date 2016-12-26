/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class524 {
	Class538 this$0;
	public static Class34_Sub10 aClass34_Sub10_7097;

	Class524(Class538 class538) {
		this$0 = class538;
	}

	static Class21 method6407(RSByteBuffer class536_sub33, Class98_Sub1 class98_sub1, int i) {
		Class21 class21 = new Class21(class98_sub1);
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 255)
				break;
			Class478 class478 = (Class478) Class457.method5488(com.jagex.Class478.class, i_0_, -1787209896);
			for (;;) {
				int i_1_ = class536_sub33.readUnsignedByte();
				if (i_1_ == 255)
					break;
				class536_sub33.off -= 516175515;
				Class430 class430 = class98_sub1.method8390(class536_sub33, class478, 275541441);
				if (null != class430)
					class21.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) 33);
			}
		}
		return class21;
	}

	static final void method6408(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_3_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		Class2 class2 = Class196.aClass410_2202.method4981(client.anInterface51_11196, i_3_, -946222564);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class2.method536(string, i_2_, Class195.aClass143Array2201, (byte) -94);
	}

	static final void method6409(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.aString2665 = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
	}
}
