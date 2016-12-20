/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class383 implements Interface47 {
	public int anInt3942;
	public Class400 aClass400_3943;
	public Class384 aClass384_3944;
	public int anInt3945;
	public int anInt3946;

	public static Class383 method6407(RSByteBuffer class527_sub38) {
		int i = class527_sub38.method16466(-1867357766);
		Class400 class400 = (Class183.method3556(-841280839)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_0_ = class527_sub38.readShort();
		int i_1_ = class527_sub38.readShort();
		return new Class383(i, class400, class384, i_0_, i_1_);
	}

	public Class396 method334(int i) {
		return Class396.aClass396_4112;
	}

	public Class396 method333() {
		return Class396.aClass396_4112;
	}

	public static Class383 method6408(RSByteBuffer class527_sub38) {
		int i = class527_sub38.method16466(-1780247895);
		Class400 class400 = (Class183.method3556(-1890144146)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_2_ = class527_sub38.readShort();
		int i_3_ = class527_sub38.readShort();
		return new Class383(i, class400, class384, i_2_, i_3_);
	}

	Class383(int i, Class400 class400, Class384 class384, int i_4_, int i_5_) {
		anInt3946 = 2084856133 * i;
		aClass400_3943 = class400;
		aClass384_3944 = class384;
		anInt3945 = i_4_ * 588130969;
		anInt3942 = i_5_ * 938141637;
	}

	static final Class665 method6409(byte i) {
		if (-289266721 * Class666.anInt8560 == Class666.anArrayList8554.size())
			Class666.anArrayList8554.add(new Class665());
		Class665 class665 = ((Class665) Class666.anArrayList8554.get(-289266721 * Class666.anInt8560));
		Class666.anInt8560 += 49764383;
		return class665;
	}

	static final void method6410(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int[] is = Class606.method10056(string, class665, 340538290);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2622 = Class103.method1800(string, class665, (byte) -60);
		class243.anIntArray2557 = is;
		class243.aBool2606 = true;
	}

	static final void method6411(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class373.method6377(class243, class240, class665, (byte) -12);
	}

	static final void method6412(Class665 class665, int i) {
		float f = Class428.method6863(class665.anIntArray8525[((class665.anInt8526 -= 102380841) * 1769813785)]);
		Class527_Sub8_Sub15_Sub2 class527_sub8_sub15_sub2 = new Class527_Sub8_Sub15_Sub2(Class208_Sub10.aClass296_Sub1_9923.method15684(336273634), f);
		Class208_Sub10.aClass296_Sub1_9923.method5445(class527_sub8_sub15_sub2, 36783392);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class527_sub8_sub15_sub2.anInt11779 * 575434551;
	}
}
