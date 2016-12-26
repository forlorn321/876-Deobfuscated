/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class305 {
	public int anInt3441;
	public int anInt3442;
	public int anInt3443;

	static final void method4107(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (class668.aClass536_Sub15_8553.aClass349Array10479[i_0_].aString3695);
	}

	static final void method4108(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int i) {
		if (null != class649_sub1_sub5_sub1.anIntArray11912 || class649_sub1_sub5_sub1.anIntArray11918 != null) {
			boolean bool = true;
			Class598 class598 = client.aClass515_11066.method6255(-1353652430);
			for (int i_1_ = 0; i_1_ < class649_sub1_sub5_sub1.anIntArray11912.length; i_1_++) {
				int i_2_ = -1;
				if (null != class649_sub1_sub5_sub1.anIntArray11912)
					i_2_ = class649_sub1_sub5_sub1.anIntArray11912[i_1_];
				if (-1 == i_2_) {
					if (!class649_sub1_sub5_sub1.method10868(i_1_, -1, 1743763825))
						bool = false;
				} else {
					bool = false;
					boolean bool_3_ = false;
					boolean bool_4_ = false;
					Class436 class436 = class649_sub1_sub5_sub1.method7837().aClass436_4823;
					int i_5_;
					int i_6_;
					if ((i_2_ & ~0x3fffffff) == -1073741824) {
						int i_7_ = i_2_ & 0xfffffff;
						int i_8_ = i_7_ >> 14;
						int i_9_ = i_7_ & 0x3fff;
						i_5_ = ((int) class436.aFloat4850 - (256 + ((i_8_ - 1858049507 * class598.anInt7839) * 512)));
						i_6_ = ((int) class436.aFloat4853 - (256 + 512 * (i_9_ - (1479112045 * class598.anInt7840))));
					} else if (0 != (i_2_ & 0x8000)) {
						int i_10_ = i_2_ & 0x7fff;
						Player class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_10_]);
						if (class649_sub1_sub5_sub1_sub2 != null) {
							Class436 class436_11_ = (class649_sub1_sub5_sub1_sub2.method7837().aClass436_4823);
							i_5_ = ((int) class436.aFloat4850 - (int) class436_11_.aFloat4850);
							i_6_ = ((int) class436.aFloat4853 - (int) class436_11_.aFloat4853);
						} else {
							class649_sub1_sub5_sub1.method10868(i_1_, -1, 493953488);
							continue;
						}
					} else {
						Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i_2_));
						if (null != class536_sub13) {
							Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class536_sub13.anObject10468);
							Class436 class436_12_ = (class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
							i_5_ = ((int) class436.aFloat4850 - (int) class436_12_.aFloat4850);
							i_6_ = ((int) class436.aFloat4853 - (int) class436_12_.aFloat4853);
						} else {
							class649_sub1_sub5_sub1.method10868(i_1_, -1, 410117923);
							continue;
						}
					}
					if (0 != i_5_ || 0 != i_6_)
						class649_sub1_sub5_sub1.method10868(i_1_, (int) (Math.atan2((double) i_5_, (double) i_6_) * 2607.5945876176133) & 0x3fff, 322079665);
				}
			}
			if (bool) {
				class649_sub1_sub5_sub1.anIntArray11912 = null;
				class649_sub1_sub5_sub1.anIntArray11918 = null;
			}
		}
	}
}
