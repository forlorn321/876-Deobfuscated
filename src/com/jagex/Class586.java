/* Class586 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class586 implements Interface65 {
	int[] anIntArray7715;

	public static Class586 method9774(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int[] is = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			is[i_0_] = class527_sub38.readUnsignedByte();
		return new Class586(is);
	}

	public boolean method420(Class527_Sub34 class527_sub34, Interface64[] interface64s, int i, Class554 class554, byte i_1_) {
		int[] is = anIntArray7715;
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
			int i_3_ = is[i_2_];
			if (!class554.method9199(i_3_, 1009244468))
				return false;
		}
		return true;
	}

	Class586(int[] is) {
		anIntArray7715 = is;
	}

	public static Class586 method9775(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int[] is = new int[i];
		for (int i_4_ = 0; i_4_ < i; i_4_++)
			is[i_4_] = class527_sub38.readUnsignedByte();
		return new Class586(is);
	}

	public static Class586 method9776(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int[] is = new int[i];
		for (int i_5_ = 0; i_5_ < i; i_5_++)
			is[i_5_] = class527_sub38.readUnsignedByte();
		return new Class586(is);
	}

	public static Class586 method9777(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int[] is = new int[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++)
			is[i_6_] = class527_sub38.readUnsignedByte();
		return new Class586(is);
	}

	public boolean method419(Class527_Sub34 class527_sub34, Interface64[] interface64s, int i, Class554 class554) {
		int[] is = anIntArray7715;
		for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
			int i_8_ = is[i_7_];
			if (!class554.method9199(i_8_, 1289649214))
				return false;
		}
		return true;
	}

	static final void method9778(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class552.method9149(class243, class240, class665, -1840834692);
	}

	static final void method9779(Class665 class665, int i) {
		if (client.anInt11083 * -405609043 == 0)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -2;
		else if (1 == -405609043 * client.anInt11083)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = client.anInt11261 * -67152419;
	}

	static final void method9780(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_9_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_10_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4154(i_9_, 423090107).method4075(i_10_, (byte) 4);
	}

	static final void method9781(Class665 class665, int i) {
		int i_11_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_12_ = i_11_ >> 16;
		if (null == Class183.aClass240Array2100[i_12_])
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 283571337 * (Class183.aClass240Array2100[i_12_].aClass243Array2392[i_11_].anInt2498);
	}

	static final void method9782(Class665 class665, int i) {
		int i_13_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_13_, 2037449989);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class243.aString2578;
	}

	static void method9783(RSByteBuffer class527_sub38, long l) {
		Class16 class16;
		if (Class32.aString318 != null && Class32.aString318.length() == 6) {
			if (Class32.aBool271)
				class16 = Class16.aClass16_194;
			else
				class16 = Class16.aClass16_193;
		} else if (Class105.aClass45_1309.method1198(l))
			class16 = Class16.aClass16_191;
		else
			class16 = Class16.aClass16_192;
		class527_sub38.writeByte(class16.method87(), 1835107365);
		switch (-2029514083 * class16.anInt190) {
		case 0:
			class527_sub38.writeInt(Class105.aClass45_1309.method1203(l), 748016452);
			break;
		case 3:
			class527_sub38.anInt10689 += 1604036228;
			break;
		case 1:
		case 2:
			class527_sub38.writeTriByte(Integer.parseInt(Class32.aString318), -708674655);
			class527_sub38.anInt10689 += 1474750881;
			break;
		}
	}
}
