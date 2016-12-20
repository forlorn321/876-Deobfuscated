/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class225 implements Interface27 {
	Class214 this$0;
	int anInt2319;

	Class225(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		anInt2319 = class527_sub38.readUnsignedShort() * -1287042047;
	}

	public void method150(Class219 class219, int i) {
		Class215 class215 = class219.method3992(-79252479 * anInt2319, -1207582736);
		class215.method3942(-439336914);
		class215.method3915((byte) 8);
		class219.method3995(anInt2319 * -79252479, 357869085);
	}

	public void method151(Class219 class219) {
		Class215 class215 = class219.method3992(-79252479 * anInt2319, -397979660);
		class215.method3942(-1862696441);
		class215.method3915((byte) 8);
		class219.method3995(anInt2319 * -79252479, -580658486);
	}

	static final void method4188(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 1190519859);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class264.method4983(class243, class240, class665, (byte) -69);
	}

	static final void method4189(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool11188 ? 1 : 0;
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = client.aString11192 == null ? "" : client.aString11192;
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = null == client.aString11191 ? "" : client.aString11191;
	}

	public static final void method4190(int i) {
		String string = (Class275.aString3156 != null ? Class275.aString3156 : Class587.method9807(1887327313));
		Class183.method3558(string, false, client.aBool11193, 272695379);
	}

	static void method4191(int i) {
		int i_1_ = -1803844265 * Class289.anInt3223;
		int i_2_ = Class611.anInt8009 * -471480167;
		if (-21941151 * Class358.anInt3831 < i_1_)
			i_1_ = Class358.anInt3831 * -21941151;
		if (Class76.anInt796 * -239790197 < i_2_)
			i_2_ = Class76.anInt796 * -239790197;
		try {
			if (Class204.aClass527_Sub31_2213 != null)
				Class411.aClass411_4363.method6587((new Object[] { Integer.valueOf(i_1_), Integer.valueOf(i_2_), Integer.valueOf(Class81.method1574((byte) 3)), Integer.valueOf(Class204.aClass527_Sub31_2213.aClass700_Sub32_10620.method17239(2080618175)) }), 984519484);
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public static void method4192(short[] is, int i) {
		for (int i_3_ = 0; i_3_ < is.length; i_3_++)
			is[i_3_] = (short) 1024;
	}
}
