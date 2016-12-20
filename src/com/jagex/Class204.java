/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class204 implements Interface56 {
	Class226 this$0;
	public static Class527_Sub31 aClass527_Sub31_2213;

	public void method362(Object object, float[] fs, Object[] objects) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(1141567448);
		float f = class483.method7869((short) 8714);
		float f_0_ = class483.method7915((byte) 62);
		Class442 class442_1_ = Class442.method7155(class442, this$0.method4197((byte) -18));
		float f_2_ = 0.0F;
		float f_3_ = class442_1_.method7160();
		if (f_3_ >= f_0_)
			f_2_ = 0.0F;
		if (f_3_ <= f)
			f_2_ = 1.0F;
		else {
			float f_4_ = 1.0F - (f_3_ - f) * (1.0F / (f_0_ - f));
			if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			f_2_ = f_4_;
		}
		fs[0] = f_2_;
		fs[1] = f_2_;
	}

	public void method361(Object object, float[] fs, Object[] objects, int i) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(1804565319);
		float f = class483.method7869((short) -23741);
		float f_5_ = class483.method7915((byte) 28);
		Class442 class442_6_ = Class442.method7155(class442, this$0.method4197((byte) -67));
		float f_7_ = 0.0F;
		float f_8_ = class442_6_.method7160();
		if (f_8_ >= f_5_)
			f_7_ = 0.0F;
		if (f_8_ <= f)
			f_7_ = 1.0F;
		else {
			float f_9_ = 1.0F - (f_8_ - f) * (1.0F / (f_5_ - f));
			if ((double) f_9_ < 0.0 || (double) f_9_ > 1.0)
				f_9_ = Math.min(Math.max(f_9_, 0.0F), 1.0F);
			f_7_ = f_9_;
		}
		fs[0] = f_7_;
		fs[1] = f_7_;
	}

	Class204(Class226 class226) {
		this$0 = class226;
	}

	public void method363(Object object, float[] fs, Object[] objects) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(1286906336);
		float f = class483.method7869((short) -3704);
		float f_10_ = class483.method7915((byte) -54);
		Class442 class442_11_ = Class442.method7155(class442, this$0.method4197((byte) -16));
		float f_12_ = 0.0F;
		float f_13_ = class442_11_.method7160();
		if (f_13_ >= f_10_)
			f_12_ = 0.0F;
		if (f_13_ <= f)
			f_12_ = 1.0F;
		else {
			float f_14_ = 1.0F - (f_13_ - f) * (1.0F / (f_10_ - f));
			if ((double) f_14_ < 0.0 || (double) f_14_ > 1.0)
				f_14_ = Math.min(Math.max(f_14_, 0.0F), 1.0F);
			f_12_ = f_14_;
		}
		fs[0] = f_12_;
		fs[1] = f_12_;
	}

	static final void method3784(Class665 class665, byte i) {
		int i_15_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_16_ = aClass527_Sub31_2213.aClass700_Sub24_10636.method17139((byte) -35);
		if (i_15_ != i_16_) {
			aClass527_Sub31_2213.method16350((aClass527_Sub31_2213.aClass700_Sub24_10636), i_15_, 550227994);
			Class631.method10465(1005089986);
			client.aBool11020 = false;
		}
	}
}
