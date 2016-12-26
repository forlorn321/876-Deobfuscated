/* Class450 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class450 {
	static final int anInt4938 = 32768;
	Class461 aClass461_4939;
	Class199 aClass199_4940 = new Class199(64);
	static final int anInt4941 = 0;
	Class461 aClass461_4942;
	static long aLong4943;

	public Class450(Class664 class664, Class461 class461, Class461 class461_0_) {
		aClass461_4942 = class461;
		aClass461_4939 = class461_0_;
		if (null != aClass461_4942)
			aClass461_4942.method5566(0, 783550688);
		if (aClass461_4939 != null)
			aClass461_4939.method5566(0, 181624909);
	}

	public Class536_Sub18_Sub13 method5424(int i, int i_1_) {
		Class536_Sub18_Sub13 class536_sub18_sub13 = (Class536_Sub18_Sub13) aClass199_4940.method2886((long) i);
		if (class536_sub18_sub13 != null)
			return class536_sub18_sub13;
		byte[] is;
		if (i >= 32768)
			is = aClass461_4939.method5556(0, i & 0x7fff, (byte) 1);
		else
			is = aClass461_4942.method5556(0, i, (byte) 1);
		class536_sub18_sub13 = new Class536_Sub18_Sub13();
		if (is != null)
			class536_sub18_sub13.method10754(new RSByteBuffer(is), 478244933);
		if (i >= 32768)
			class536_sub18_sub13.method10758(-324811881);
		aClass199_4940.method2881(class536_sub18_sub13, (long) i);
		return class536_sub18_sub13;
	}

	static final void method5425(Class668 class668, short i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class19.method692(class251, class234, class668, -391805864);
	}

	static final void method5426(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static int method5427(Class536_Sub18_Sub6 class536_sub18_sub6, Class2 class2, int i) {
		String string = Class273.method3726(class536_sub18_sub6, -1411037171);
		return class2.method531(string, Class195.aClass143Array2201, 1397966135);
	}

	static final void method5428(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_3_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		Class303.method4105(i_2_, i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff, false, (byte) -51);
	}
}
