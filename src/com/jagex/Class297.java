/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class297 {
	public int[] anIntArray3386;
	public short[] aShortArray3387;

	public Class297(Class295 class295) {
		anIntArray3386 = new int[8];
		aShortArray3387 = new short[8];
		int i = 0;
		if (null != class295.anIntArray3324 && null != class295.aShortArray3309) {
			i = class295.anIntArray3324.length;
			System.arraycopy(class295.anIntArray3324, 0, anIntArray3386, 0, i);
			System.arraycopy(class295.aShortArray3309, 0, aShortArray3387, 0, i);
		}
		for (int i_0_ = i; i_0_ < 8; i_0_++) {
			anIntArray3386[i_0_] = -1;
			aShortArray3387[i_0_] = (short) -1;
		}
	}

	public Class297(int[] is, short[] is_1_) {
		anIntArray3386 = is;
		aShortArray3387 = is_1_;
	}

	static final void method5507(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -1118357371) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2600 = Class103.method1800(string, class665, (byte) -79);
		class243.aBool2606 = true;
	}

	static final void method5508(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Character.toUpperCase((char) i_2_);
	}

	static final void method5509(Class665 class665, int i) {
		/* empty */
	}

	static final void method5510(Class665 class665, int i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub24_10633, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 1177845873);
		Class631.method10465(-1609134886);
		client.aBool11020 = false;
	}

	static void method5511(byte i) {
		Class700_Sub35.method17268((byte) -119);
	}
}
