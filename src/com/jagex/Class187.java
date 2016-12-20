/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.util.Iterator;

class Class187 implements Interface25 {
	Class226 this$0;
	public static Iterator anIterator2119;
	static int anInt2120;

	public void method146(Object object) {
		method3653((Interface70) object, -611009949);
	}

	void method3653(Interface70 interface70, int i) {
		Iterator iterator = this$0.method4199(105088582).iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			if (class483.method7926(-2019608322) == interface70) {
				class483.method7850((byte) 0);
				iterator.remove();
			}
		}
	}

	public void method149(Object object, int i) {
		method3653((Interface70) object, -1329053666);
	}

	public void method147(Object object) {
		method3653((Interface70) object, -1474077081);
	}

	public void method148(Object object) {
		method3653((Interface70) object, -334975786);
	}

	Class187(Class226 class226) {
		this$0 = class226;
	}

	void method3654(Interface70 interface70) {
		Iterator iterator = this$0.method4199(105088582).iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			if (class483.method7926(-1930586059) == interface70) {
				class483.method7850((byte) 0);
				iterator.remove();
			}
		}
	}

	public static void method3655(RSByteBuffer class527_sub38, int i) {
		byte[] is = new byte[24];
		try {
			Class515.aClass1_7026.method492(0L);
			Class515.aClass1_7026.method490(is, (byte) 0);
			int i_0_;
			for (i_0_ = 0; i_0_ < 24 && 0 == is[i_0_]; i_0_++) {
				/* empty */
			}
			if (i_0_ >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i_1_ = 0; i_1_ < 24; i_1_++)
				is[i_1_] = (byte) -1;
		}
		class527_sub38.writeBytes(is, 0, 24, (byte) 57);
	}

	static final void method3656(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_2_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_3_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		int i_4_ = class665.anIntArray8525[2 + class665.anInt8526 * 1769813785];
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (i_3_ == -1)
			throw new RuntimeException();
		Class57 class57 = (Class57) Class664.aClass24_Sub15_8519.method81(i_3_, 354407959);
		if (class57.aClass462_714.method87() != i_2_)
			throw new RuntimeException();
		if (class57.aClass462_718.method87() != Class462.aClass462_5131.method87())
			throw new RuntimeException();
		int[] is = class57.method1341(string, (byte) 4);
		if (i_4_ < 0 || is == null || is.length <= i_4_)
			throw new RuntimeException();
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = is[i_4_];
	}

	static final void method3657(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass346_8532.anInt3726 * -1045961249;
	}

	static final void method3658(Class665 class665, short i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static Interface19 method3659(Class346 class346, byte i) {
		return new Class661(class346);
	}

	static final void method3660(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3987(469675490);
	}

	static int method3661(int i, int i_5_, int i_6_) {
		if (i == -1736797763 * Class596.aClass596_7826.anInt7844 || -1736797763 * Class596.aClass596_7838.anInt7844 == i)
			return Class640_Sub1_Sub3_Sub1.anIntArray11982[i_5_ & 0x3];
		return Class640_Sub1_Sub3_Sub1.anIntArray11981[i_5_ & 0x3];
	}

	static final void method3662(Class665 class665, int i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3992(i_7_, -1823611913).method3947(-1756315788);
	}
}
