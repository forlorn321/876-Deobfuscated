/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class196 implements Interface55 {
	Class211 this$0;
	public static Class410 aClass410_2202;

	public void method360(Object object, float[] fs, Object[] objects, byte i) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -10);
		float f = class479.method5808(-2001134286);
		float f_0_ = class479.method5782(-1342458804);
		Class436 class436_1_ = Class436.method5252(class436, this$0.method2985(-580855334));
		float f_2_ = 0.0F;
		float f_3_ = class436_1_.method5291();
		if (f_3_ >= f_0_)
			f_2_ = 0.0F;
		if (f_3_ <= f)
			f_2_ = 1.0F;
		else {
			float f_4_ = 1.0F - 1.0F / (f_0_ - f) * (f_3_ - f);
			if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			f_2_ = f_4_;
		}
		int i_5_ = 8192;
		float f_6_ = 0.0F;
		if (155362615 * Class246.anInt2474 == 2) {
			float f_7_ = Class683.aClass301_Sub1_8651.method4092((byte) 63);
			if (class436_1_.aFloat4850 != 0.0F || class436_1_.aFloat4853 != 0.0F) {
				int i_8_ = (((int) ((double) (-1.0F * f_7_) * 2607.5945876176133) - (int) (Math.atan2((double) class436_1_.aFloat4850, (double) class436_1_.aFloat4853) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_8_ > 8192)
					i_8_ = 16384 - i_8_;
				int i_9_;
				if (f_3_ <= 0.0F)
					i_9_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_9_ = 16384;
				else
					i_9_ = (int) (8192.0F + f_3_ * 8192.0F / 4096.0F);
				i_5_ = i_8_ * i_9_ / 8192 + (16384 - i_9_ >> 1);
			}
			f_6_ = (float) i_5_ * 6.1035156E-5F;
		} else {
			if (class436_1_.aFloat4850 != 0.0F || class436_1_.aFloat4853 != 0.0F) {
				int i_10_ = ((-(158223895 * Class144.anInt1681) - (int) (Math.atan2((double) class436_1_.aFloat4850, (double) class436_1_.aFloat4853) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_10_ > 8192)
					i_10_ = 16384 - i_10_;
				int i_11_;
				if (f_3_ <= 0.0F)
					i_11_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_11_ = 16384;
				else
					i_11_ = (int) (f_3_ * 8192.0F / 4096.0F + 8192.0F);
				i_5_ = i_10_ * i_11_ / 8192 + (16384 - i_11_ >> 1);
			}
			f_6_ = (float) i_5_ * 6.1035156E-5F;
		}
		fs[0] = (float) (i_5_ < 0 ? (double) f_2_ : (double) f_2_ * Math.sqrt((double) ((1.0F - f_6_) * 2.0F)));
		fs[1] = (float) (i_5_ < 0 ? (double) -f_2_ : (double) f_2_ * Math.sqrt((double) (f_6_ * 2.0F)));
	}

	Class196(Class211 class211) {
		this$0 = class211;
	}

	public void method361(Object object, float[] fs, Object[] objects) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -111);
		float f = class479.method5808(-1936126999);
		float f_12_ = class479.method5782(-310960457);
		Class436 class436_13_ = Class436.method5252(class436, this$0.method2985(-967416165));
		float f_14_ = 0.0F;
		float f_15_ = class436_13_.method5291();
		if (f_15_ >= f_12_)
			f_14_ = 0.0F;
		if (f_15_ <= f)
			f_14_ = 1.0F;
		else {
			float f_16_ = 1.0F - 1.0F / (f_12_ - f) * (f_15_ - f);
			if ((double) f_16_ < 0.0 || (double) f_16_ > 1.0)
				f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
			f_14_ = f_16_;
		}
		int i = 8192;
		float f_17_ = 0.0F;
		if (155362615 * Class246.anInt2474 == 2) {
			float f_18_ = Class683.aClass301_Sub1_8651.method4092((byte) 4);
			if (class436_13_.aFloat4850 != 0.0F || class436_13_.aFloat4853 != 0.0F) {
				int i_19_ = (((int) ((double) (-1.0F * f_18_) * 2607.5945876176133) - (int) (Math.atan2((double) class436_13_.aFloat4850, (double) class436_13_.aFloat4853) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_19_ > 8192)
					i_19_ = 16384 - i_19_;
				int i_20_;
				if (f_15_ <= 0.0F)
					i_20_ = 8192;
				else if (f_15_ >= 4096.0F)
					i_20_ = 16384;
				else
					i_20_ = (int) (8192.0F + f_15_ * 8192.0F / 4096.0F);
				i = i_19_ * i_20_ / 8192 + (16384 - i_20_ >> 1);
			}
			f_17_ = (float) i * 6.1035156E-5F;
		} else {
			if (class436_13_.aFloat4850 != 0.0F || class436_13_.aFloat4853 != 0.0F) {
				int i_21_ = ((-(158223895 * Class144.anInt1681) - (int) (Math.atan2((double) class436_13_.aFloat4850, (double) class436_13_.aFloat4853) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_21_ > 8192)
					i_21_ = 16384 - i_21_;
				int i_22_;
				if (f_15_ <= 0.0F)
					i_22_ = 8192;
				else if (f_15_ >= 4096.0F)
					i_22_ = 16384;
				else
					i_22_ = (int) (f_15_ * 8192.0F / 4096.0F + 8192.0F);
				i = i_21_ * i_22_ / 8192 + (16384 - i_22_ >> 1);
			}
			f_17_ = (float) i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_14_ : (double) f_14_ * Math.sqrt((double) ((1.0F - f_17_) * 2.0F)));
		fs[1] = (float) (i < 0 ? (double) -f_14_ : (double) f_14_ * Math.sqrt((double) (f_17_ * 2.0F)));
	}

	public void method362(Object object, float[] fs, Object[] objects) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -74);
		float f = class479.method5808(-1945326346);
		float f_23_ = class479.method5782(-1239855437);
		Class436 class436_24_ = Class436.method5252(class436, this$0.method2985(167238939));
		float f_25_ = 0.0F;
		float f_26_ = class436_24_.method5291();
		if (f_26_ >= f_23_)
			f_25_ = 0.0F;
		if (f_26_ <= f)
			f_25_ = 1.0F;
		else {
			float f_27_ = 1.0F - 1.0F / (f_23_ - f) * (f_26_ - f);
			if ((double) f_27_ < 0.0 || (double) f_27_ > 1.0)
				f_27_ = Math.min(Math.max(f_27_, 0.0F), 1.0F);
			f_25_ = f_27_;
		}
		int i = 8192;
		float f_28_ = 0.0F;
		if (155362615 * Class246.anInt2474 == 2) {
			float f_29_ = Class683.aClass301_Sub1_8651.method4092((byte) 16);
			if (class436_24_.aFloat4850 != 0.0F || class436_24_.aFloat4853 != 0.0F) {
				int i_30_ = (((int) ((double) (-1.0F * f_29_) * 2607.5945876176133) - (int) (Math.atan2((double) class436_24_.aFloat4850, (double) class436_24_.aFloat4853) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_30_ > 8192)
					i_30_ = 16384 - i_30_;
				int i_31_;
				if (f_26_ <= 0.0F)
					i_31_ = 8192;
				else if (f_26_ >= 4096.0F)
					i_31_ = 16384;
				else
					i_31_ = (int) (8192.0F + f_26_ * 8192.0F / 4096.0F);
				i = i_30_ * i_31_ / 8192 + (16384 - i_31_ >> 1);
			}
			f_28_ = (float) i * 6.1035156E-5F;
		} else {
			if (class436_24_.aFloat4850 != 0.0F || class436_24_.aFloat4853 != 0.0F) {
				int i_32_ = ((-(158223895 * Class144.anInt1681) - (int) (Math.atan2((double) class436_24_.aFloat4850, (double) class436_24_.aFloat4853) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_32_ > 8192)
					i_32_ = 16384 - i_32_;
				int i_33_;
				if (f_26_ <= 0.0F)
					i_33_ = 8192;
				else if (f_26_ >= 4096.0F)
					i_33_ = 16384;
				else
					i_33_ = (int) (f_26_ * 8192.0F / 4096.0F + 8192.0F);
				i = i_32_ * i_33_ / 8192 + (16384 - i_33_ >> 1);
			}
			f_28_ = (float) i * 6.1035156E-5F;
		}
		fs[0] = (float) (i < 0 ? (double) f_25_ : (double) f_25_ * Math.sqrt((double) ((1.0F - f_28_) * 2.0F)));
		fs[1] = (float) (i < 0 ? (double) -f_25_ : (double) f_25_ * Math.sqrt((double) (f_28_ * 2.0F)));
	}

	static final void method2865(Class668 class668, byte i) {
		Class536_Sub18.method9525(class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)], -1686392020);
	}

	static final void method2866(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method2867(Class668 class668, byte i) {
		int i_34_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_34_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_34_ >> 16];
		Class573.method6940(class251, class234, class668, 1582262265);
	}

	static void method2868(Class690 class690, int i) {
		Class4.aClass690_102 = class690;
		Class45.aString528 = null;
	}
}
