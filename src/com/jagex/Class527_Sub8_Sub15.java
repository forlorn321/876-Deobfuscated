/* Class527_Sub8_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class527_Sub8_Sub15 extends Class527_Sub8 {
	public int anInt11779;

	public abstract void method18352(Class302 class302, Class432 class432, Class427 class427);

	public abstract void method18353(float f, int i);

	public abstract void method18354(Class302 class302, Class432 class432, Class427 class427, int i);

	public abstract void method18355(RSByteBuffer class527_sub38, int i);

	public abstract void method18356(float f);

	public abstract void method18357(RSByteBuffer class527_sub38);

	Class527_Sub8_Sub15(int i) {
		anInt11779 = -1342015865 * i;
	}

	public abstract void method18358(Class302 class302, Class432 class432, Class427 class427);

	public abstract void method18359(float f);

	public static Class527_Sub8_Sub15 method18360(int i, Class270 class270, RSByteBuffer class527_sub38) {
		if (Class270.aClass270_3124 == class270)
			return new Class527_Sub8_Sub15_Sub1(i, class527_sub38);
		if (class270 == Class270.aClass270_3123)
			return new Class527_Sub8_Sub15_Sub2(i, class527_sub38);
		return null;
	}

	public static Class527_Sub8_Sub15 method18361(int i, Class270 class270, RSByteBuffer class527_sub38) {
		if (Class270.aClass270_3124 == class270)
			return new Class527_Sub8_Sub15_Sub1(i, class527_sub38);
		if (class270 == Class270.aClass270_3123)
			return new Class527_Sub8_Sub15_Sub2(i, class527_sub38);
		return null;
	}

	public abstract void method18362(float f);
}
