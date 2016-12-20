/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class82 {
	public int anInt809;
	public int anInt810;
	public int anInt811;

	Class82(int i, int i_0_, int i_1_) {
		anInt809 = 1646212631 * i;
		anInt810 = -1338835475 * i_0_;
		anInt811 = i_1_ * 522783023;
	}

	static Class640_Sub1_Sub2_Sub1 method1576(int i, int i_2_, int i_3_, byte i_4_) {
		Class561 class561 = (client.aClass509_11072.method8314(1070507042).aClass561ArrayArrayArray7426[i][i_2_][i_3_]);
		if (null == class561)
			return null;
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = null;
		int i_5_ = -1;
		for (Class562 class562 = class561.aClass562_7558; null != class562; class562 = class562.aClass562_7565) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
			if (class640_sub1_sub2 instanceof Class640_Sub1_Sub2_Sub1) {
				Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1_6_ = (Class640_Sub1_Sub2_Sub1) class640_sub1_sub2;
				int i_7_ = (class640_sub1_sub2_sub1_6_.method18564(-1435822041) - 1) * 256 + 252;
				Class442 class442 = class640_sub1_sub2_sub1_6_.method10637().aClass442_4927;
				int i_8_ = (int) class442.aFloat4918 - i_7_ >> 9;
				int i_9_ = (int) class442.aFloat4919 - i_7_ >> 9;
				int i_10_ = (int) class442.aFloat4918 + i_7_ >> 9;
				int i_11_ = i_7_ + (int) class442.aFloat4919 >> 9;
				if (i_8_ <= i_2_ && i_9_ <= i_3_ && i_10_ >= i_2_ && i_11_ >= i_3_) {
					int i_12_ = (i_10_ + 1 - i_2_) * (i_11_ + 1 - i_3_);
					if (i_12_ > i_5_) {
						class640_sub1_sub2_sub1 = class640_sub1_sub2_sub1_6_;
						i_5_ = i_12_;
					}
				}
			}
		}
		return class640_sub1_sub2_sub1;
	}

	static void method1577(Class702 class702, int i) {
		Class207.aClass702_2232 = class702;
	}
}
