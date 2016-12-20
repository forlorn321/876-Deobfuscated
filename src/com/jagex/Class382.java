/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class382 {
	public int anInt3939;
	public Class527_Sub8_Sub17 aClass527_Sub8_Sub17_3940;
	public int[] anIntArray3941;

	public static Class382 method6399(RSByteBuffer class527_sub38) {
		Class382 class382 = new Class382();
		class382.anInt3939 = class527_sub38.readUnsignedShort() * 389032867;
		class382.aClass527_Sub8_Sub17_3940 = Exception_Sub3.aClass51_11362.method1277(-1237622773 * class382.anInt3939, 304198612);
		return class382;
	}

	public static Class382 method6400(RSByteBuffer class527_sub38) {
		Class382 class382 = new Class382();
		class382.anInt3939 = class527_sub38.readUnsignedShort() * 389032867;
		class382.aClass527_Sub8_Sub17_3940 = Exception_Sub3.aClass51_11362.method1277(-1237622773 * class382.anInt3939, -268834490);
		return class382;
	}

	public static Class382 method6401(RSByteBuffer class527_sub38) {
		Class382 class382 = new Class382();
		class382.anInt3939 = class527_sub38.readUnsignedShort() * 389032867;
		class382.aClass527_Sub8_Sub17_3940 = Exception_Sub3.aClass51_11362.method1277(-1237622773 * class382.anInt3939, 2094716227);
		return class382;
	}

	static final void method6402(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -1223554963);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class305.method5594(class243, class240, class665, -1262021360);
	}

	static final void method6403(Class665 class665, byte i) {
		if ((Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 75) != Class301.aClass301_3418) || (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -79) != Class309.aClass309_3455))
			throw new RuntimeException();
		Class442 class442 = ((Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0)).method15732((byte) 58);
		Class442 class442_1_ = ((Class696_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5472(1385083577)).method17229((byte) -16);
		Class442 class442_2_ = Class442.method7139(class442);
		class442_2_.method7154(class442_1_);
		float f = Class640_Sub1_Sub3_Sub2.method18676(class442_2_.aFloat4918, class442_2_.aFloat4919, (byte) -128);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) (2607.5945876176133 * (double) f) & 0x3fff;
	}

	static final void method6404(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class695.method14242(string, 206469326);
	}

	static final void method6405(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_3_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_4_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_5_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 2];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class331.method5830(i_3_, i_4_, i_5_, true, 1614363926);
	}

	public static int method6406(int i) {
		if (!Class585.aBool7693)
			return 12;
		Class208_Sub11.method15616(Class402.aClass180_4150, 1644050584);
		return Class585.aTwitchTV7698.Logout();
	}
}
