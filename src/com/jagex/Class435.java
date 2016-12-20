/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class435 {
	public static final int anInt4874 = 1;
	public static final int anInt4875 = 2;
	public static final int anInt4876 = 0;
	public static final int anInt4877 = 4;
	public static final int anInt4878 = 3;

	Class435() throws Throwable {
		throw new Error();
	}

	static final void method6985(Class243 class243, Class240 class240, Class665 class665, short i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -1981011502) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2505 = Class103.method1800(string, class665, (byte) -74);
		class243.aBool2606 = true;
	}

	static final void method6986(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3990((byte) 24);
	}

	static final void method6987(Class665 class665, int i) {
		class665.anInt8526 -= 409523364;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		int i_2_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		int i_3_ = class665.anIntArray8525[3 + class665.anInt8526 * 1769813785];
		int i_4_ = 256;
		Class245.aClass226_2698.method4218(Class193.aClass193_2150, i_0_, i_1_, i_3_, Class206.aClass206_2228.method3836(45972596), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_4_, i_2_, -1241622859);
	}

	static final void method6988(Class640_Sub1 class640_sub1, int i, boolean bool, byte i_5_) {
		Class641.method10702(class640_sub1, i, false, bool, (byte) 3);
	}

	static final void method6989(Class665 class665, int i) {
		if (Class265.aClass711_2876 == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -143370735 * Class265.aClass711_2876.anInt8855;
	}

	public static boolean method6990(int i, int i_6_, int i_7_) {
		if (!Class35.aBool338)
			return false;
		int i_8_ = i >> 16;
		int i_9_ = i & 0xffff;
		if (Class183.aClass240Array2100[i_8_] == null || (Class183.aClass240Array2100[i_8_].aClass243Array2392[i_9_] == null))
			return false;
		Class243 class243 = Class183.aClass240Array2100[i_8_].aClass243Array2392[i_9_];
		if (-1 != i_6_ || class243.anInt2501 * -270144907 != 0) {
			for (Class527_Sub8_Sub7 class527_sub8_sub7 = ((Class527_Sub8_Sub7) Class35.aClass694_348.method14081((short) 20142)); class527_sub8_sub7 != null; class527_sub8_sub7 = ((Class527_Sub8_Sub7) Class35.aClass694_348.method14086(-65534))) {
				if (i_6_ == class527_sub8_sub7.anInt11646 * -376653789 && (class527_sub8_sub7.anInt11647 * 815386065 == -254728301 * class243.anInt2504) && (class527_sub8_sub7.anInt11652 * 1720667579 == 58 || class527_sub8_sub7.anInt11652 * 1720667579 == 1007 || 25 == 1720667579 * class527_sub8_sub7.anInt11652 || 57 == 1720667579 * class527_sub8_sub7.anInt11652 || 30 == class527_sub8_sub7.anInt11652 * 1720667579))
					return true;
			}
		} else {
			for (Class527_Sub8_Sub7 class527_sub8_sub7 = ((Class527_Sub8_Sub7) Class35.aClass694_348.method14081((short) -22834)); null != class527_sub8_sub7; class527_sub8_sub7 = ((Class527_Sub8_Sub7) Class35.aClass694_348.method14086(-65534))) {
				if (class527_sub8_sub7.anInt11652 * 1720667579 == 58 || 1720667579 * class527_sub8_sub7.anInt11652 == 1007 || 25 == class527_sub8_sub7.anInt11652 * 1720667579 || class527_sub8_sub7.anInt11652 * 1720667579 == 57 || 30 == class527_sub8_sub7.anInt11652 * 1720667579) {
					for (Class243 class243_10_ = Class648.method10837((class527_sub8_sub7.anInt11647) * 815386065, -623659333); null != class243_10_; class243_10_ = Class519.method8657((Class183.aClass240Array2100[(-254728301 * (class243_10_.anInt2504)) >> 16]), class243_10_, 1053921327)) {
						if (class243_10_.anInt2504 * -254728301 == class243.anInt2504 * -254728301)
							return true;
					}
				}
			}
		}
		return false;
	}
}
