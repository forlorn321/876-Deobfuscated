/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class260 {
	public String aString2851;
	public String aString2852;
	static long aLong2853;

	Class260() {
		/* empty */
	}

	void method4788(Class278 class278, byte i) {
		aString2852 = class278.method5157(-123882494);
		aString2851 = class278.method5157(-123882494);
	}

	void method4789(Class278 class278) {
		aString2852 = class278.method5157(-123882494);
		aString2851 = class278.method5157(-123882494);
	}

	static final void method4790(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.aBool2556 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1;
		Class430.method6876(class243, (byte) 125);
	}

	static final void method4791(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		int i_2_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		int i_3_ = 255;
		int i_4_ = 256;
		Class245.aClass226_2698.method4218(Class193.aClass193_2150, i_0_, i_1_, i_3_, Class206.aClass206_2228.method3836(-1320179902), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_4_, i_2_, 498699745);
	}

	static final void method4792(Class665 class665, byte i) {
		Class440.method7114(Class405.method6550(1788343088), class665, -546762977);
	}

	static final void method4793(Class665 class665, byte i) {
		if (client.anInt11083 * -405609043 == 0)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 182205737 * client.anInt11299;
	}

	static final void method4794(Class665 class665, int i) throws Exception_Sub6 {
		class665.anInt8526 -= 409523364;
		float f = (float) class665.anIntArray8525[1769813785 * class665.anInt8526];
		float f_5_ = (float) (class665.anIntArray8525[1 + 1769813785 * class665.anInt8526]);
		float f_6_ = (float) (class665.anIntArray8525[1769813785 * class665.anInt8526 + 2]);
		float f_7_ = ((float) (class665.anIntArray8525[1769813785 * class665.anInt8526 + 3]) / 1000.0F);
		Class208_Sub10.aClass296_Sub1_9923.method5427(Class442.method7166(f, f_5_, f_6_), f_7_, 1924634622);
	}

	static final void method4795(Class665 class665, int i) {
		Class604_Sub1 class604_sub1 = Class212.method3890(-1708179433);
		if (class604_sub1 != null) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -642278059 * class604_sub1.anInt10579;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class604_sub1.anInt7962 * -909883667;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class604_sub1.aString10578;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class604_sub1.method16316(-187361331);
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class604_sub1.method16320(2046167653);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class604_sub1.anInt7967 * 1898710151;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class604_sub1.anInt10576 * 741395911;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class604_sub1.aString10577;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		}
	}

	public static char method4796(byte i, byte i_8_) {
		int i_9_ = i & 0xff;
		if (i_9_ == 0)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_9_, 16)).toString());
		if (i_9_ >= 128 && i_9_ < 160) {
			int i_10_ = Class662.aCharArray8515[i_9_ - 128];
			if (i_10_ == 0)
				i_10_ = 63;
			i_9_ = i_10_;
		}
		return (char) i_9_;
	}

	static final void method4797(Class665 class665, int i) {
		int i_11_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_11_, -781419423);
		Class240 class240 = Class183.aClass240Array2100[i_11_ >> 16];
		Class552.method9149(class243, class240, class665, 8053968);
	}

	static final void method4798(Class665 class665, int i) {
		int i_12_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class249 class249 = ((Class249) Class457.aClass24_Sub12_5063.method81(i_12_, 894689354));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1365262055 * class249.anInt2741;
	}
}
