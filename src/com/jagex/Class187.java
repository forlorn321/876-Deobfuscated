/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.IOException;

class Class187 implements Interface55 {
	Class211 this$0;

	public void method361(Object object, float[] fs, Object[] objects) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -6);
		float f = class479.method5808(-1090017481);
		float f_0_ = class479.method5782(916064797);
		Class436 class436_1_ = Class436.method5252(class436, this$0.method2985(-332249815));
		float f_2_ = 0.0F;
		float f_3_ = class436_1_.method5291();
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

	public void method360(Object object, float[] fs, Object[] objects, byte i) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -55);
		float f = class479.method5808(-1964159842);
		float f_5_ = class479.method5782(-1654206233);
		Class436 class436_6_ = Class436.method5252(class436, this$0.method2985(-444484096));
		float f_7_ = 0.0F;
		float f_8_ = class436_6_.method5291();
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

	Class187(Class211 class211) {
		this$0 = class211;
	}

	public void method362(Object object, float[] fs, Object[] objects) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -41);
		float f = class479.method5808(-1237170859);
		float f_10_ = class479.method5782(-1710896476);
		Class436 class436_11_ = Class436.method5252(class436, this$0.method2985(-54436567));
		float f_12_ = 0.0F;
		float f_13_ = class436_11_.method5291();
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

	public static void method2779(byte i) {
		if (null != Class192.aClass292_2177)
			Class192.aClass292_2177.method3941((short) -27821);
		if (Class94.aThread1148 != null) {
			for (;;) {
				try {
					Class94.aThread1148.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	public static boolean method2780(int i) {
		return (null != Class536_Sub42.aTwitchTV10811 && Class536_Sub42.aTwitchTV10811.IsStreaming());
	}

	public static int method2781(byte[] is, int i, CharSequence charsequence, int i_15_) {
		int i_16_ = charsequence.length();
		int i_17_ = i;
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
			int i_19_ = charsequence.charAt(i_18_);
			if (i_19_ <= 127)
				is[i_17_++] = (byte) i_19_;
			else if (i_19_ <= 2047) {
				is[i_17_++] = (byte) (0xc0 | i_19_ >> 6);
				is[i_17_++] = (byte) (0x80 | i_19_ & 0x3f);
			} else {
				is[i_17_++] = (byte) (0xe0 | i_19_ >> 12);
				is[i_17_++] = (byte) (0x80 | i_19_ >> 6 & 0x3f);
				is[i_17_++] = (byte) (0x80 | i_19_ & 0x3f);
			}
		}
		return i_17_ - i;
	}

	public static void method2782(float[] fs, int[] is, int i, int i_20_, short i_21_) {
		if (i < i_20_) {
			int i_22_ = (i + i_20_) / 2;
			int i_23_ = i;
			float f = fs[i_22_];
			fs[i_22_] = fs[i_20_];
			fs[i_20_] = f;
			int i_24_ = is[i_22_];
			is[i_22_] = is[i_20_];
			is[i_20_] = i_24_;
			for (int i_25_ = i; i_25_ < i_20_; i_25_++) {
				if (fs[i_25_] > f) {
					float f_26_ = fs[i_25_];
					fs[i_25_] = fs[i_23_];
					fs[i_23_] = f_26_;
					int i_27_ = is[i_25_];
					is[i_25_] = is[i_23_];
					is[i_23_++] = i_27_;
				}
			}
			fs[i_20_] = fs[i_23_];
			fs[i_23_] = f;
			is[i_20_] = is[i_23_];
			is[i_23_] = i_24_;
			method2782(fs, is, i, i_23_ - 1, (short) 512);
			method2782(fs, is, 1 + i_23_, i_20_, (short) 512);
		}
	}

	static final void method2783(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_28_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_29_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_30_ = class668.anIntArray8541[2 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.method4598(i_28_, i_29_, i_30_, (byte) -31);
	}

	static final void method2784(Class668 class668, int i) {
		int i_31_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (Class463.aClass234Array5227[i_31_] == null)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class463.aClass234Array5227[i_31_].aClass251Array2378.length;
	}

	public static Class694 method2785(int i, byte i_32_) {
		Class694[] class694s = Class453.method5446(1725285974);
		for (int i_33_ = 0; i_33_ < class694s.length; i_33_++) {
			Class694 class694 = class694s[i_33_];
			if (-1418548035 * class694.anInt8730 == i)
				return class694;
		}
		return null;
	}

	static byte[] method2786(File file, int i, byte i_34_) {
		byte[] is;
		try {
			byte[] is_35_ = new byte[i];
			Class60.method999(file, is_35_, i, 751468988);
			is = is_35_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	public static int method2787(int i) {
		return Class536_Sub42.aTwitchTV10811.GetChatState();
	}
}
