/* Class597 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchEventLiveStreams;

public class Class597 {
	public static Class597 aClass597_7846;
	static Class597 aClass597_7847 = new Class597(0);
	static Class597 aClass597_7848 = new Class597(1);
	public static TwitchEventLiveStreams aTwitchEventLiveStreams7849;

	Class597(int i) {
		/* empty */
	}

	static {
		aClass597_7846 = new Class597(2);
	}

	static void method9912(Class665 class665, int i) {
		class665.anIntArray8525[1769813785 * class665.anInt8526 - 2] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[(class665.anInt8526 * 1769813785) - 2]), 867549292)).method4753(Class671.aClass97_8584, class665.anIntArray8525[1769813785 * class665.anInt8526 - 1], (short) 5175)) ? 1 : 0;
		class665.anInt8526 -= 102380841;
	}

	static final void method9913(Class665 class665, int i) {
		if (Class707.aBool8841 && Class56.aFrame711 != null)
			Class188.method3663(Class204.aClass527_Sub31_2213.aClass700_Sub2_10596.method16853((byte) 3), -1, -1, false, (byte) 60);
	}

	public static void method9914(boolean bool, byte[] is, int i) {
		if (Class527_Sub6.aClass527_Sub38_10397 == null)
			Class527_Sub6.aClass527_Sub38_10397 = new RSByteBuffer(20000);
		Class527_Sub6.aClass527_Sub38_10397.writeBytes(is, 0, is.length, (byte) 62);
		if (bool) {
			Class215.method3962((Class527_Sub6.aClass527_Sub38_10397.buffer), 445754646);
			Class3.aClass604_Sub1Array31 = new Class604_Sub1[Class318.anInt3535 * -1134558959];
			int i_0_ = 0;
			for (int i_1_ = Class605.anInt7972 * 451447095; i_1_ <= Class638.anInt8321 * 1671964397; i_1_++) {
				Class604_Sub1 class604_sub1 = Class254.method4698(i_1_, -1154305347);
				if (class604_sub1 != null)
					Class3.aClass604_Sub1Array31[i_0_++] = class604_sub1;
			}
			Class3.aBool38 = false;
			Class273.aLong3141 = Class234.method4347(-1408626088) * 4183478645639791091L;
			Class527_Sub6.aClass527_Sub38_10397 = null;
		}
	}

	public static int method9915(int i, int i_2_, short i_3_) {
		int i_4_ = i_2_ >>> 24;
		int i_5_ = 255 - i_4_;
		i_2_ = (i_4_ * (i_2_ & 0xff00ff) & ~0xff00ff | i_4_ * (i_2_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_5_ * (i & 0xff00ff) & ~0xff00ff | i_5_ * (i & 0xff00) & 0xff0000) >>> 8) + i_2_);
	}
}
