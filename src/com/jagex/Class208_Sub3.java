/* Class208_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub3 extends Class208 {
	int anInt9875;
	int anInt9876;
	String aString9877;
	int anInt9878;

	public void method3846(int i) {
		Class466.aClass196Array5314[719395699 * anInt9875].method3717(-975411775).method18598(aString9877, anInt9876 * 1703192929, 0, -216131353 * anInt9878, -441238943);
	}

	public void method3851() {
		Class466.aClass196Array5314[719395699 * anInt9875].method3717(1197548072).method18598(aString9877, anInt9876 * 1703192929, 0, -216131353 * anInt9878, -441238943);
	}

	public void method3848() {
		Class466.aClass196Array5314[719395699 * anInt9875].method3717(-782295623).method18598(aString9877, anInt9876 * 1703192929, 0, -216131353 * anInt9878, -441238943);
	}

	Class208_Sub3(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9875 = class527_sub38.readUnsignedShort() * -1890287173;
		aString9877 = class527_sub38.readString(1332516411);
		anInt9876 = class527_sub38.readInt() * 1327610529;
		anInt9878 = class527_sub38.readUnsignedShort() * -1259504937;
	}

	static boolean method15608(CharSequence charsequence, int i, boolean bool, byte i_0_) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_1_ = false;
		boolean bool_2_ = false;
		int i_3_ = 0;
		int i_4_ = charsequence.length();
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
			int i_6_ = charsequence.charAt(i_5_);
			if (0 == i_5_) {
				if (45 == i_6_) {
					bool_1_ = true;
					continue;
				}
				if (43 == i_6_ && bool)
					continue;
			}
			if (i_6_ >= 48 && i_6_ <= 57)
				i_6_ -= 48;
			else if (i_6_ >= 65 && i_6_ <= 90)
				i_6_ -= 55;
			else if (i_6_ >= 97 && i_6_ <= 122)
				i_6_ -= 87;
			else
				return false;
			if (i_6_ >= i)
				return false;
			if (bool_1_)
				i_6_ = -i_6_;
			int i_7_ = i_6_ + i * i_3_;
			if (i_3_ != i_7_ / i)
				return false;
			i_3_ = i_7_;
			bool_2_ = true;
		}
		return bool_2_;
	}
}
