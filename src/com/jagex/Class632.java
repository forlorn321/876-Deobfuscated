/* Class632 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class632 {
	public int anInt8258;
	static Class632 aClass632_8259;
	static Class632 aClass632_8260;
	public static Class632 aClass632_8261;
	static Class632 aClass632_8262;
	static Class632 aClass632_8263;
	static Class632 aClass632_8264;
	static Class632 aClass632_8265;
	static Class632 aClass632_8266;
	static Class632 aClass632_8267;
	public static Class632 aClass632_8268 = new Class632(1);
	static Class22 aClass22_8269;
	public static boolean aBool8270;

	Class632(int i) {
		anInt8258 = 2137060417 * i;
	}

	static {
		aClass632_8259 = new Class632(2);
		aClass632_8267 = new Class632(3);
		aClass632_8261 = new Class632(4);
		aClass632_8262 = new Class632(5);
		aClass632_8263 = new Class632(6);
		aClass632_8264 = new Class632(7);
		aClass632_8265 = new Class632(8);
		aClass632_8260 = new Class632(9);
		aClass632_8266 = new Class632(10);
	}

	static final void method10470(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 419050762);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class243.method4608(class243, class240, class665, 714701526);
	}

	static final void method10471(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class527_Sub8_Sub11 class527_sub8_sub11 = Class534.method8957(i_1_, i_2_, (byte) -36);
		if (class527_sub8_sub11 != null) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class527_sub8_sub11.anInt11752 * 867529685;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class512.method8488((class527_sub8_sub11.aLong11744 * -5777888702365622175L), (Class144_Sub1.aClass671_8995.anInt8581 * -53745175), -753657300);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -858796403 * class527_sub8_sub11.anInt11753;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (null != class527_sub8_sub11.aString11747 ? class527_sub8_sub11.aString11747 : "");
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (class527_sub8_sub11.aString11745 != null ? class527_sub8_sub11.aString11745 : "");
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (class527_sub8_sub11.aString11749 != null ? class527_sub8_sub11.aString11749 : "");
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (null != class527_sub8_sub11.aString11750 ? class527_sub8_sub11.aString11750 : "");
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1722951477 * class527_sub8_sub11.anInt11751;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (null != class527_sub8_sub11.aString11743 ? class527_sub8_sub11.aString11743 : "");
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (class527_sub8_sub11.aClass406_11748 != null ? class527_sub8_sub11.aClass406_11748.method87() : -1);
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		}
	}

	static final void method10472(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1 == -349191067 * Class30.anInt265 ? 1 : 0;
	}

	static Class method10473(String string, int i) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}

	public static void method10474(int i, byte i_3_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(12, (long) i);
		class527_sub8_sub9.method18186(-458593667);
	}
}
