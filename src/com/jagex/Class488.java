/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class488 implements Interface57 {
	Class483 this$0;
	static int anInt5471;
	static Class174 aClass174_5472;

	Class488(Class483 class483) {
		this$0 = class483;
	}

	public byte[] method364(int i, int i_0_) {
		return this$0.anInterface70_5432.method462(i, 102380841);
	}

	public byte[] method365(int i) {
		return this$0.anInterface70_5432.method462(i, 102380841);
	}

	static final void method7967(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class529.method8752(i_1_);
		if (class527_sub8_sub12 == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1417497333 * class527_sub8_sub12.anInt11760;
	}

	static final void method7968(Class665 class665, byte i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3992(i_2_, 1765972119).method3913(-391427232).method87();
	}

	public static String method7969(int i) {
		return Class502.aFile6872.getAbsolutePath();
	}
}
