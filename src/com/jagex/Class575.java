/* Class575 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class575 {
	Class575() throws Throwable {
		throw new Error();
	}

	public static void method9631(float f, Class442 class442, Class438 class438, Class442 class442_0_, Class442 class442_1_, Class442 class442_2_, float f_3_, float f_4_, float f_5_) {
		if (!class442_0_.method7177(class442)) {
			Class442 class442_6_ = Class442.method7166(0.0F, 0.0F, 0.0F);
			Class442 class442_7_ = Class442.method7139(Class442.method7155(class442_0_, class442));
			class442_7_.method7157(class438);
			Class442 class442_8_ = Class442.method7155(class442_7_, class442_6_);
			float f_9_ = class442_8_.method7160();
			if (Float.POSITIVE_INFINITY == class442_2_.aFloat4918 || Float.isNaN(class442.aFloat4918) || f_9_ > f_4_ || f_9_ < f_5_) {
				class442.method7146(class442_0_);
				class442_1_.method7211();
			} else {
				class438.method7033();
				Class442 class442_10_ = Class442.method7166(1.0F, 0.0F, 0.0F);
				Class442 class442_11_ = Class442.method7166(0.0F, 1.0F, 0.0F);
				Class442 class442_12_ = Class442.method7166(0.0F, 0.0F, 1.0F);
				class442_10_.method7157(class438);
				class442_11_.method7157(class438);
				class442_12_.method7157(class438);
				Class442 class442_13_ = Class442.method7166(Class442.method7145(class442_10_, class442_1_), Class442.method7145(class442_11_, class442_1_), Class442.method7145(class442_12_, class442_1_));
				Class442 class442_14_ = Class442.method7139(class442_13_);
				Class442 class442_15_ = (Class442.method7166(class442_8_.aFloat4918 * class442_2_.aFloat4918, class442_8_.aFloat4915 * class442_2_.aFloat4915, class442_2_.aFloat4919 * class442_8_.aFloat4919));
				class442_14_.method7152(class442_15_, f);
				class442_14_.method7167(f_3_);
				Class442 class442_16_ = Class442.method7168(class442_10_, class442_14_.aFloat4918);
				class442_16_.method7152(class442_11_, class442_14_.aFloat4915);
				class442_16_.method7152(class442_12_, class442_14_.aFloat4919);
				class442_1_.method7146(class442_16_);
				class442.method7219(Class442.method7168(class442_1_, f));
			}
		}
	}

	static final void method9632(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		int[] is = Class606.method10056(string, class665, -236578251);
		if (is != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2623 = Class103.method1800(string, class665, (byte) -115);
		class243.anIntArray2624 = is;
		class243.aBool2606 = true;
	}
}
