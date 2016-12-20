/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Map;

public class Class319 implements Interface33 {
	Class381 aClass381_3536;
	public static int anInt3537;
	public static Map aMap3538;
	static int anInt3539;

	public boolean method208() {
		return true;
	}

	public void method205(byte i) {
		/* empty */
	}

	Class319(Class381 class381) {
		aClass381_3536 = class381;
	}

	public boolean method204(int i) {
		return true;
	}

	public void method206(boolean bool) {
		if (bool)
			Class402.aClass180_4150.method3348(0, 0, Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009, aClass381_3536.anInt3935 * -231972527, 0);
	}

	public void method85() {
		/* empty */
	}

	public boolean method207() {
		return true;
	}

	public void method203(boolean bool, int i) {
		if (bool)
			Class402.aClass180_4150.method3348(0, 0, Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009, aClass381_3536.anInt3935 * -231972527, 0);
	}

	public static int method5689(int i) {
		return Class264.anInt2872 * -2028196033 - 1;
	}

	static final void method5690(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -1110364238);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -71358053 * class243.anInt2512;
	}

	static Class572 method5691(RSByteBuffer class527_sub38, byte i) {
		int i_1_ = class527_sub38.readUnsignedByte();
		int i_2_ = class527_sub38.readUnsignedByte();
		return new Class572(i_1_, i_2_);
	}
}
