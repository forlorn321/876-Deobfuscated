/* Class637 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class637 {
	public static final int anInt8305 = 16777215;
	public static final int anInt8306 = 13156520;
	public static final float aFloat8307 = 0.69921875F;
	public static final float aFloat8308 = 1.2F;
	public static final int anInt8309 = -50;
	public static final int anInt8310 = -50;
	public static final float aFloat8311 = 1.1523438F;
	static final int anInt8312 = 5000;
	public static final int anInt8313 = 0;
	public static final int anInt8314 = -60;
	public static final int anInt8315 = 2816;
	public static final int anInt8316 = 2816;
	public static final int anInt8317 = 2816;
	public static int anInt8318;

	static {
		new Class442(0.6F, 0.6F, 0.6F);
		new Class442(0.3F, 0.3F, 0.3F);
		new Class442(0.3F, 0.3F, 0.5F);
	}

	Class637() throws Throwable {
		throw new Error();
	}

	static final void method10567(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -1603904490) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2485 = Class103.method1800(string, class665, (byte) -48);
		class243.aBool2606 = true;
	}

	static final void method10568(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, 154048338);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class588.method9812(class243, class240, class665, (byte) 101);
	}

	static final void method10569(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class420.aClass273_4591.method5098(i_1_ != 0, -638380405);
	}

	public static void method10570(Class71 class71, String string, int i, Throwable throwable, int i_2_) {
		Class472.method7735(new Class576(class71, string, i, throwable), (byte) -3);
	}

	public static Class432 method10571(byte i) {
		Class432 class432 = new Class432();
		class432.method6890(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class432.method6896(f - 128.0F, 0.0F, 0.0F);
		class432.method6936(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		return class432;
	}
}
