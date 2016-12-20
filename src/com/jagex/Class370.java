/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class370 {
	public static Class370 aClass370_3896;
	public static Class370 aClass370_3897;
	public static Class370 aClass370_3898;
	public static Class370 aClass370_3899;
	public static Class370 aClass370_3900;
	public static Class370 aClass370_3901 = new Class370();
	public static Class370 aClass370_3902;

	Class370() {
		/* empty */
	}

	static {
		aClass370_3897 = new Class370();
		aClass370_3898 = new Class370();
		aClass370_3899 = new Class370();
		aClass370_3900 = new Class370();
		aClass370_3896 = new Class370();
		aClass370_3902 = new Class370();
	}

	static String method6358(int[] is, int i) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
			Class259 class259 = ((Class259) Class590.aClass62_Sub1_7793.method81(is[i_0_], 1653573520));
			if (-1530194725 * class259.anInt2850 != -1)
				stringbuilder.append(" <sprite=").append(class259.anInt2850 * -1530194725).append(">");
		}
		return stringbuilder.toString();
	}

	static final void method6359(Class665 class665, byte i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_1_, -239379772)).anInt108) * 1114593611;
	}

	static final void method6360(Class665 class665, int i) {
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[318492261 * class665.anInt8528]);
		String string_2_ = ((String) class665.anObjectArray8541[318492261 * class665.anInt8528 + 1]);
		if (0 != 962135673 * client.anInt11075 || ((!client.aBool11180 || client.aBool11169) && !client.aBool11172)) {
			Class109 class109 = Class203.method3782((byte) -1);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4456, class109.aClass2_1367, (byte) 21);
			class527_sub15.buffer.writeShort(0, 1404835786);
			int i_3_ = (class527_sub15.buffer.anInt10689 * -441238943);
			class527_sub15.buffer.writeString(string, -221697509);
			Class542.method9027(class527_sub15.buffer, string_2_, -4132577);
			class527_sub15.buffer.method16437(-441238943 * (class527_sub15.buffer.anInt10689) - i_3_, -18705907);
			class109.method1969(class527_sub15, (byte) 1);
		}
	}

	public static void method6361(Class527_Sub8 class527_sub8, Class527_Sub8 class527_sub8_4_, int i) {
		if (class527_sub8.aClass527_Sub8_10402 != null)
			class527_sub8.method16057((byte) -32);
		class527_sub8.aClass527_Sub8_10402 = class527_sub8_4_;
		class527_sub8.aClass527_Sub8_10400 = class527_sub8_4_.aClass527_Sub8_10400;
		class527_sub8.aClass527_Sub8_10402.aClass527_Sub8_10400 = class527_sub8;
		class527_sub8.aClass527_Sub8_10400.aClass527_Sub8_10402 = class527_sub8;
	}

	public static boolean method6362(int i, int i_5_) {
		return 1 == i || i == 3 || 5 == i;
	}

	static final void method6363(Class665 class665, int i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_6_, -2095706019);
		Class240 class240 = Class183.aClass240Array2100[i_6_ >> 16];
		Class527_Sub24_Sub2.method18174(class243, class240, class665, -2077732913);
	}
}
