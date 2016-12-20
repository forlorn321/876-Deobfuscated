/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class224 implements Interface27 {
	Class214 this$0;
	boolean aBool2317;
	int anInt2318;

	public void method150(Class219 class219, int i) {
		class219.method3993(-2091584455 * anInt2318, aBool2317, 902329738);
		class219.method3992(anInt2318 * -2091584455, -682437910).method3942(-1274549586);
	}

	Class224(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		anInt2318 = class527_sub38.readUnsignedShort() * 19053065;
		aBool2317 = class527_sub38.readUnsignedByte() == 1;
	}

	public void method151(Class219 class219) {
		class219.method3993(-2091584455 * anInt2318, aBool2317, -459064417);
		class219.method3992(anInt2318 * -2091584455, -870148894).method3942(256600353);
	}

	static final void method4181(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub26_10602.method17186((byte) 1);
	}

	static final void method4182(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method4059((byte) 124).size();
	}

	static final void method4183(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, byte i) {
		int i_0_ = (class640_sub1_sub2_sub1.anInt11923 * -1359861193 - client.anInt11019);
		int i_1_ = (-1597707776 * class640_sub1_sub2_sub1.anInt11916 + class640_sub1_sub2_sub1.method18564(-1215189630) * 256);
		int i_2_ = (class640_sub1_sub2_sub1.anInt11886 * 523276800 + class640_sub1_sub2_sub1.method18564(-1454096092) * 256);
		int i_3_ = Class590.method9853(i_1_, i_2_, (class640_sub1_sub2_sub1.anInt11920 * -1862679399), (byte) 5);
		Class442 class442 = class640_sub1_sub2_sub1.method10637().aClass442_4927;
		class640_sub1_sub2_sub1.method10619((float) ((i_1_ - (int) class442.aFloat4918) / i_0_ + (int) class442.aFloat4918), (float) ((i_3_ - (int) class442.aFloat4915) / i_0_ + (int) class442.aFloat4915), (float) ((i_2_ - (int) class442.aFloat4919) / i_0_ + (int) class442.aFloat4919));
		class640_sub1_sub2_sub1.anInt11946 = 0;
		class640_sub1_sub2_sub1.method18527((class640_sub1_sub2_sub1.anInt11924 * 1306109367), -436591321);
	}

	static boolean method4184(byte i) {
		client.anInt11069 += -316002473;
		client.aBool11288 = true;
		return true;
	}

	public static void method4185(Class615 class615, byte i) {
		Class684.anInt8652 = class615.anInt8071 * -476135305;
		Class188.anInt2121 = class615.anInt8072 * -1266995729;
		Class705.anInt8832 = class615.anInt8073 * -306617201;
		Class659.anInt8497 = -1618072141 * class615.anInt8074;
		Class66.anInt762 = -1926738779 * class615.anInt8075;
		Class49.anInt510 = 1992772501 * class615.anInt8078;
		Class659.anInt8491 = class615.anInt8077 * -1261222029;
		Class527_Sub41.anInt10754 = 1159153609 * class615.anInt8080;
		Class49.anInt508 = class615.anInt8079 * 1467551273;
		Class95.anInt1147 = -994520763 * class615.anInt8039;
		Class49.anInt509 = class615.anInt8081 * -1411029625;
		Class24_Sub22.anInt10986 = 973128159 * class615.anInt8066;
	}

	public static boolean method4186(byte i) {
		if (Class498.aString5584.startsWith("win"))
			return true;
		return false;
	}

	static final void method4187(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_4_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_5_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class315.method5674(i_4_, i_5_, true, 1978181693);
	}
}
