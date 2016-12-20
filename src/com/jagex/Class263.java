/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class263 {
	static Class279 aClass279_2867;
	static int anInt2868;

	static String method4947(RSByteBuffer class527_sub38, int i) {
		String string;
		try {
			int i_0_ = class527_sub38.readUnsignedSmart((byte) -78);
			if (i_0_ > i)
				i_0_ = i;
			byte[] is = new byte[i_0_];
			class527_sub38.anInt10689 += (aClass279_2867.method5169(class527_sub38.buffer, (-441238943 * class527_sub38.anInt10689), is, 0, i_0_, -2029485712) * 1474750881);
			String string_1_ = Class539.method9000(is, 0, i_0_, -1883347605);
			string = string_1_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}

	public static void method4948(Class279 class279) {
		aClass279_2867 = class279;
	}

	public static String method4949(RSByteBuffer class527_sub38) {
		return Class174_Sub1.method14595(class527_sub38, 32767, 1231703725);
	}

	public static void method4950(Class279 class279) {
		aClass279_2867 = class279;
	}

	public static int method4951(RSByteBuffer class527_sub38, String string) {
		int i = -441238943 * class527_sub38.anInt10689;
		byte[] is = Class539.method8999(string, (short) -22121);
		class527_sub38.method16652(is.length, 1655550775);
		class527_sub38.anInt10689 += aClass279_2867.method5168(is, 0, is.length, class527_sub38.buffer, (-441238943 * class527_sub38.anInt10689), (byte) -18) * 1474750881;
		return class527_sub38.anInt10689 * -441238943 - i;
	}

	public static String method4952(RSByteBuffer class527_sub38) {
		return Class174_Sub1.method14595(class527_sub38, 32767, 2015289516);
	}

	public static String method4953(RSByteBuffer class527_sub38) {
		return Class174_Sub1.method14595(class527_sub38, 32767, 1275441127);
	}

	Class263() throws Throwable {
		throw new Error();
	}

	public static void method4954(Class279 class279) {
		aClass279_2867 = class279;
	}

	public static String method4955(RSByteBuffer class527_sub38) {
		return Class174_Sub1.method14595(class527_sub38, 32767, 1489193837);
	}

	static String method4956(RSByteBuffer class527_sub38, int i) {
		String string;
		try {
			int i_2_ = class527_sub38.readUnsignedSmart((byte) -76);
			if (i_2_ > i)
				i_2_ = i;
			byte[] is = new byte[i_2_];
			class527_sub38.anInt10689 += (aClass279_2867.method5169(class527_sub38.buffer, (-441238943 * class527_sub38.anInt10689), is, 0, i_2_, -1995720926) * 1474750881);
			String string_3_ = Class539.method9000(is, 0, i_2_, -1933028905);
			string = string_3_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}

	static String method4957(RSByteBuffer class527_sub38, int i) {
		String string;
		try {
			int i_4_ = class527_sub38.readUnsignedSmart((byte) -98);
			if (i_4_ > i)
				i_4_ = i;
			byte[] is = new byte[i_4_];
			class527_sub38.anInt10689 += (aClass279_2867.method5169(class527_sub38.buffer, (-441238943 * class527_sub38.anInt10689), is, 0, i_4_, -2144853000) * 1474750881);
			String string_5_ = Class539.method9000(is, 0, i_4_, -1783234112);
			string = string_5_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}

	static final void method4958(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class249.method4659(class243, class240, true, 1, class665, (byte) 10);
	}

	static final void method4959(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class273.method5121(class243, class240, class665, 2135491601);
	}

	static final void method4960(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_6_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		boolean bool = (class665.anIntArray8525[1 + class665.anInt8526 * 1769813785] == 1);
		if (null != Class529_Sub1.aClass14_10789) {
			Class527 class527 = Class529_Sub1.aClass14_10789.method709((long) i_6_);
			if (class527 != null && !bool)
				class527.method8735(-1889161967);
			else if (class527 == null && bool) {
				class527 = new Class527();
				Class529_Sub1.aClass14_10789.method714(class527, (long) i_6_);
			}
		}
	}

	static final void method4961(Class665 class665, int i) {
		if (Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 104) != Class301.aClass301_3413)
			throw new RuntimeException();
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class208_Sub10.aClass296_Sub1_9923.method5380((byte) 47);
	}

	static Class527_Sub1 method4962(int i, boolean bool, byte i_7_) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		return (Class527_Sub1) Class527_Sub1.aClass14_10333.method709(l);
	}

	public static void method4963(int i) {
		Class209.aClass14_2236.method721(-1439747424);
		Class209.aClass694_2243.method14105((byte) 8);
		Class209.aClass191Array2242 = null;
		Class466.aClass196Array5314 = null;
		Class689.aClass186Array8689 = null;
		Class232.aClass195Array2359 = null;
		Class181.aClass208Array2093 = null;
		Class209.anInt2239 = 1072441851;
		Class209.anInt2240 = 0;
		Class209.anInt2241 = 0;
		Class235.aClass192_2378 = null;
		Class209.anInt2244 = 1844912785;
		Class209.anInt2237 = 1091310815;
		if (Class209.aBool2238) {
			client.aShort11287 = Class646_Sub1.aShort10841;
			client.aShort11211 = Class316_Sub1.aShort10037;
			client.aShort11285 = Class682.aShort8649;
			client.aShort11043 = Class236.aShort2379;
			Class209.aBool2238 = false;
		}
	}

	static final void method4964(Class665 class665, int i) {
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_8_, 1601095820);
		Class240 class240 = Class183.aClass240Array2100[i_8_ >> 16];
		Class249.method4659(class243, class240, true, 2, class665, (byte) 76);
	}
}
