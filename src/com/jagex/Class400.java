/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class400 {
	static Class400 aClass400_4138 = new Class400();
	static Class400 aClass400_4139 = new Class400();
	static Class400 aClass400_4140 = new Class400();
	public static int anInt4141;
	static int anInt4142;

	public int method6525(int i, int i_0_, int i_1_) {
		int i_2_ = (Class289.anInt3223 * -1803844265 > i_0_ ? -1803844265 * Class289.anInt3223 : i_0_);
		if (aClass400_4138 == this)
			return 0;
		if (this == aClass400_4140)
			return i_2_ - i;
		if (this == aClass400_4139)
			return (i_2_ - i) / 2;
		return 0;
	}

	public int method6526(int i, int i_3_) {
		int i_4_ = (Class289.anInt3223 * -1803844265 > i_3_ ? -1803844265 * Class289.anInt3223 : i_3_);
		if (aClass400_4138 == this)
			return 0;
		if (this == aClass400_4140)
			return i_4_ - i;
		if (this == aClass400_4139)
			return (i_4_ - i) / 2;
		return 0;
	}

	public static Class400[] method6527() {
		return (new Class400[] { aClass400_4138, aClass400_4139, aClass400_4140 });
	}

	Class400() {
		/* empty */
	}

	public int method6528(int i, int i_5_) {
		int i_6_ = (Class289.anInt3223 * -1803844265 > i_5_ ? -1803844265 * Class289.anInt3223 : i_5_);
		if (aClass400_4138 == this)
			return 0;
		if (this == aClass400_4140)
			return i_6_ - i;
		if (this == aClass400_4139)
			return (i_6_ - i) / 2;
		return 0;
	}

	public static Class400[] method6529() {
		return (new Class400[] { aClass400_4138, aClass400_4139, aClass400_4140 });
	}

	static final void method6530(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1;
	}

	static Class569 method6531(RSByteBuffer class527_sub38, int i) {
		int i_7_ = class527_sub38.readUnsignedByte();
		int i_8_ = class527_sub38.readUnsignedByte();
		int i_9_ = class527_sub38.readUnsignedByte();
		int[] is = new int[i_9_];
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
			is[i_10_] = class527_sub38.readUnsignedByte();
		return new Class569(i_7_, i_8_, is);
	}

	static final void method6532(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -2030585543) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2640 = Class103.method1800(string, class665, (byte) -12);
		class243.aBool2606 = true;
	}
}
