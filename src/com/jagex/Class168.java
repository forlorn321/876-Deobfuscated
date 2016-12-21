/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class168 {
	Class168() {
		/* empty */
	}

	public static int method2415(int i, int i_0_, int i_1_, boolean bool, int i_2_) {
		if (0 != i && (i < 50 || i > 100))
			i = 0;
		if (0 != i_0_ && (i_0_ < 50 || i_0_ > 100))
			i_0_ = 0;
		boolean bool_3_ = Class497.aString5550.startsWith("mac");
		int[] is = (Class536_Sub42.aTwitchTV10811.GetRecommendedSettings(Class144.anInt1679 * -1804846931, Class34_Sub6.anInt10965 * 589116499, i, 2000, i_1_, Class575.aFloat7672, bool_3_));
		if (0 != is[0])
			return is[0];
		int i_4_ = is[1];
		int i_5_ = is[2];
		int i_6_ = is[3];
		int i_7_ = i_6_;
		Class575.aLong7663 = 0L;
		Class633.aLong8259 = (long) (1000.0F / (float) i_1_) * -2083275317143284765L;
		Class420.anInt4585 = 1426233155 * i_4_;
		Class575.anInt7669 = i_5_ * 419145933;
		if (0 != i_0_)
			i_6_ = i_6_ * i_0_ / 100;
		Class214.method3077(new StringBuilder().append("Stream - Input: ").append(Class144.anInt1679 * -1804846931).append("x").append(589116499 * Class34_Sub6.anInt10965).append(" (").append(i_7_).append("kbps)").append(" => ").append("Output: ").append(i_4_).append("x").append(i_5_).append(" [").append(i == 0 ? "auto" : new StringBuilder().append(i).append("%").toString()).append("] (").append(i_6_).append("kbps [")
				.append(i_0_ == 0 ? "auto" : new StringBuilder().append(i_0_).append("%").toString()).append("])").toString(), -1221298618);
		return (Class536_Sub42.aTwitchTV10811.StartStreaming(i_4_, i_5_, i_1_, i_6_, 0 != i_0_, Class575.aFloat7672, 876028591 * Class575.anInt7654, bool));
	}

	static final void method2416(Class251 class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -533339504) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2544 = Class33.method796(string, class668, (short) -6178);
		class251.aBool2666 = true;
	}
}
