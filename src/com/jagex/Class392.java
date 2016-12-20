/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class392 implements Interface47 {
	public int anInt4008;
	public int anInt4009;
	public static final int anInt4010 = 2;
	public static final int anInt4011 = 1;
	public static final int anInt4012 = 0;
	public Class384 aClass384_4013;
	public Class400 aClass400_4014;
	public int anInt4015;
	public int anInt4016;
	public int anInt4017;

	public static Class392 method6481(RSByteBuffer class527_sub38) {
		Class400 class400 = (Class183.method3556(1411291380)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i = class527_sub38.readShort();
		int i_0_ = class527_sub38.readShort();
		int i_1_ = class527_sub38.method16466(-2119186168);
		int i_2_ = class527_sub38.readInt();
		int i_3_ = class527_sub38.readUnsignedByte();
		return new Class392(class400, class384, i, i_0_, i_1_, i_2_, i_3_);
	}

	public Class396 method334(int i) {
		return Class396.aClass396_4113;
	}

	public Class396 method333() {
		return Class396.aClass396_4113;
	}

	Class392(Class400 class400, Class384 class384, int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		aClass400_4014 = class400;
		aClass384_4013 = class384;
		anInt4008 = i * -2022875097;
		anInt4009 = i_4_ * 45229925;
		anInt4015 = i_5_ * -1067531903;
		anInt4016 = -127159049 * i_6_;
		anInt4017 = 1950636005 * i_7_;
	}

	static final void method6482(Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = new StringBuilder().append(string).append(i_8_).toString();
	}

	static final void method6483(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int[] is = Class606.method10056(string, class665, 1346739564);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2625 = Class103.method1800(string, class665, (byte) -85);
		class243.anIntArray2626 = is;
		class243.aBool2606 = true;
	}

	static final void method6484(Class243 class243, Class240 class240, Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		class243.anInt2515 = (class665.anIntArray8525[1769813785 * class665.anInt8526] * -339647303);
		class243.anInt2516 = (1593025273 * class665.anIntArray8525[1 + class665.anInt8526 * 1769813785]);
		Class430.method6876(class243, (byte) 69);
		Class209.method3869(class240, class243, -1778055362);
		if (0 == -270144907 * class243.anInt2501)
			Class397.method6513(class240, class243, false, 928425805);
	}
}
