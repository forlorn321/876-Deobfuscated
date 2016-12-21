/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class281 {
	static Class281 aClass281_3168;
	static Class281 aClass281_3169;
	public static Class281 aClass281_3170;
	static Class281 aClass281_3171 = new Class281(0);
	public static Class281 aClass281_3172;
	public static Class281 aClass281_3173;
	int anInt3174;
	static int anInt3175;

	static {
		aClass281_3168 = new Class281(1);
		aClass281_3169 = new Class281(2);
		aClass281_3170 = new Class281(3);
		aClass281_3172 = new Class281(4);
		aClass281_3173 = new Class281(5);
	}

	Class281(int i) {
		anInt3174 = -1516898249 * i;
	}

	public static void method3761(float f, Class436 class436, Class425 class425, Class436 class436_0_, Class436 class436_1_, Class436 class436_2_, Class436 class436_3_, float f_4_, float f_5_, float f_6_, float f_7_, int i) {
		if (!class436_0_.method5245(class436)) {
			Class436 class436_8_ = Class436.method5257(0.0F, 0.0F, 0.0F);
			Class436 class436_9_ = Class436.method5240(Class436.method5252(class436_0_, class436));
			class436_9_.method5263(class425);
			Class436 class436_10_ = Class436.method5252(class436_9_, class436_8_);
			float f_11_ = class436_10_.method5291();
			if (f_4_ > 0.0F) {
				class436_2_ = Class436.method5240(class436_2_);
				class436_2_.method5287(f_5_ * (f_11_ / f_4_));
			}
			if (class436_2_.aFloat4850 == Float.POSITIVE_INFINITY || Float.isNaN(class436.aFloat4850) || f_11_ > f_6_ || f_11_ < f_7_) {
				class436.method5272(class436_0_);
				class436_1_.method5244();
			} else {
				class425.method5091();
				Class436 class436_12_ = Class436.method5257(1.0F, 0.0F, 0.0F);
				Class436 class436_13_ = Class436.method5257(0.0F, 1.0F, 0.0F);
				Class436 class436_14_ = Class436.method5257(0.0F, 0.0F, 1.0F);
				class436_12_.method5263(class425);
				class436_13_.method5263(class425);
				class436_14_.method5263(class425);
				Class436 class436_15_ = Class436.method5257(Class436.method5254(class436_12_, class436_1_), Class436.method5254(class436_13_, class436_1_), Class436.method5254(class436_14_, class436_1_));
				Class436 class436_16_ = Class436.method5240(class436_15_);
				class436_16_.method5258();
				Class436 class436_17_ = Class436.method5261(Class436.method5259(class436_16_, class436_16_), Class436.method5281(class436_2_, 2.0F));
				Class436 class436_18_ = Class436.method5240(class436_10_);
				class436_18_.method5258();
				Class436 class436_19_ = Class436.method5240(class436_15_);
				if (class436_17_.aFloat4850 > class436_18_.aFloat4850) {
					if (class436_10_.aFloat4850 < 0.0F) {
						class436_19_.aFloat4850 += class436_2_.aFloat4850 * f;
						if (class436_19_.aFloat4850 > 0.0F)
							class436_19_.aFloat4850 = 0.0F;
					} else {
						class436_19_.aFloat4850 -= class436_2_.aFloat4850 * f;
						if (class436_19_.aFloat4850 < 0.0F)
							class436_19_.aFloat4850 = 0.0F;
					}
				} else if (class436_16_.aFloat4850 < class436_3_.aFloat4850) {
					if (class436_10_.aFloat4850 < 0.0F) {
						class436_19_.aFloat4850 -= class436_2_.aFloat4850 * f;
						if (class436_19_.aFloat4850 < -class436_3_.aFloat4850)
							class436_19_.aFloat4850 = -class436_3_.aFloat4850;
					} else {
						class436_19_.aFloat4850 += class436_2_.aFloat4850 * f;
						if (class436_19_.aFloat4850 > class436_3_.aFloat4850)
							class436_19_.aFloat4850 = class436_3_.aFloat4850;
					}
				}
				if (class436_17_.aFloat4852 > class436_18_.aFloat4852) {
					if (class436_10_.aFloat4852 < 0.0F) {
						class436_19_.aFloat4852 += f * class436_2_.aFloat4852;
						if (class436_19_.aFloat4852 > 0.0F)
							class436_19_.aFloat4852 = 0.0F;
					} else {
						class436_19_.aFloat4852 -= class436_2_.aFloat4852 * f;
						if (class436_19_.aFloat4852 < 0.0F)
							class436_19_.aFloat4852 = 0.0F;
					}
				} else if (class436_16_.aFloat4852 < class436_3_.aFloat4852) {
					if (class436_10_.aFloat4852 < 0.0F) {
						class436_19_.aFloat4852 -= class436_2_.aFloat4852 * f;
						if (class436_19_.aFloat4852 < -class436_3_.aFloat4852)
							class436_19_.aFloat4852 = -class436_3_.aFloat4852;
					} else {
						class436_19_.aFloat4852 += f * class436_2_.aFloat4852;
						if (class436_19_.aFloat4852 > class436_3_.aFloat4852)
							class436_19_.aFloat4852 = class436_3_.aFloat4852;
					}
				}
				if (class436_17_.aFloat4853 > class436_18_.aFloat4853) {
					if (class436_10_.aFloat4853 < 0.0F) {
						class436_19_.aFloat4853 += class436_2_.aFloat4853 * f;
						if (class436_19_.aFloat4853 > 0.0F)
							class436_19_.aFloat4853 = 0.0F;
					} else {
						class436_19_.aFloat4853 -= f * class436_2_.aFloat4853;
						if (class436_19_.aFloat4853 < 0.0F)
							class436_19_.aFloat4853 = 0.0F;
					}
				} else if (class436_16_.aFloat4853 < class436_3_.aFloat4853) {
					if (class436_10_.aFloat4853 < 0.0F) {
						class436_19_.aFloat4853 -= f * class436_2_.aFloat4853;
						if (class436_19_.aFloat4853 < -class436_3_.aFloat4853)
							class436_19_.aFloat4853 = -class436_3_.aFloat4853;
					} else {
						class436_19_.aFloat4853 += class436_2_.aFloat4853 * f;
						if (class436_19_.aFloat4853 > class436_3_.aFloat4853)
							class436_19_.aFloat4853 = class436_3_.aFloat4853;
					}
				}
				Class436 class436_20_ = Class436.method5281(class436_12_, class436_19_.aFloat4850);
				class436_20_.method5249(class436_13_, class436_19_.aFloat4852);
				class436_20_.method5249(class436_14_, class436_19_.aFloat4853);
				class436_1_.method5265(class436_20_, 0.8F);
				class436.method5248(Class436.method5281(class436_1_, f));
				class436_16_.method5239();
				class436_19_.method5239();
				class436_18_.method5239();
			}
		}
	}

	static final void method3762(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1494047173 * class668.aClass536_Sub15_8553.anInt10482;
	}

	static final void method3763(Class668 class668, int i) {
		int i_21_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (class668.aClass536_Sub15_8553.aClass349Array10479[i_21_].anInt3697) * -2028086957;
	}

	public static char method3764(byte i, int i_22_) {
		int i_23_ = i & 0xff;
		if (i_23_ == 0)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_23_, 16)).toString());
		if (i_23_ >= 128 && i_23_ < 160) {
			int i_24_ = Class667.aCharArray8534[i_23_ - 128];
			if (i_24_ == 0)
				i_24_ = 63;
			i_23_ = i_24_;
		}
		return (char) i_23_;
	}

	static final void method3765(Class668 class668, int i) {
		Class324 class324 = (Class324) (class668.aClass536_Sub18_Sub16_8547.anObjectArray11796[-1640738851 * class668.anInt8564]);
		Interface19 interface19 = ((Interface19) (0 == class668.anIntArray8537[class668.anInt8564 * -1640738851] ? class668.aMap8557.get(class324.aClass153_3555.aClass458_1717) : class668.aMap8558.get(class324.aClass153_3555.aClass458_1717)));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = interface19.method96(class324, -420732780);
	}

	static final void method3766(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1606950689 * class251.anInt2573;
	}

	static final void method3767(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class306.method4122(class251, class234, class668, 32206471);
	}
}
