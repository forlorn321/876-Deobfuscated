/* Class314_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Graphics;
import java.awt.Image;

public class Class314_Sub2 extends Class314 {
	Class292 this$0;
	Image anImage10109;

	void method5663(Graphics graphics) {
		int i = (this$0.method5258(anImage10109.getWidth(null), 601935675) + 899934251 * anInt3506);
		int i_0_ = (this$0.method5259(anImage10109.getHeight(null), 507803131) + anInt3505 * -755285989);
		graphics.drawImage(anImage10109, i, i_0_, null);
	}

	void method5660(Graphics graphics, int i) {
		int i_1_ = (this$0.method5258(anImage10109.getWidth(null), 21601967) + 899934251 * anInt3506);
		int i_2_ = (this$0.method5259(anImage10109.getHeight(null), 2053833146) + anInt3505 * -755285989);
		graphics.drawImage(anImage10109, i_1_, i_2_, null);
	}

	void method5659(Graphics graphics) {
		int i = (this$0.method5258(anImage10109.getWidth(null), 1200563628) + 899934251 * anInt3506);
		int i_3_ = (this$0.method5259(anImage10109.getHeight(null), 654374209) + anInt3505 * -755285989);
		graphics.drawImage(anImage10109, i, i_3_, null);
	}

	void method5664(Graphics graphics) {
		int i = (this$0.method5258(anImage10109.getWidth(null), 1802752891) + 899934251 * anInt3506);
		int i_4_ = (this$0.method5259(anImage10109.getHeight(null), 1665039894) + anInt3505 * -755285989);
		graphics.drawImage(anImage10109, i, i_4_, null);
	}

	void method5662(Graphics graphics) {
		int i = (this$0.method5258(anImage10109.getWidth(null), 972496772) + 899934251 * anInt3506);
		int i_5_ = (this$0.method5259(anImage10109.getHeight(null), 1670503098) + anInt3505 * -755285989);
		graphics.drawImage(anImage10109, i, i_5_, null);
	}

	Class314_Sub2(Class292 class292, Image image, int i, int i_6_) {
		super(class292, i, i_6_);
		this$0 = class292;
		anImage10109 = image;
	}

	void method5661(Graphics graphics) {
		int i = (this$0.method5258(anImage10109.getWidth(null), 1467114933) + 899934251 * anInt3506);
		int i_7_ = (this$0.method5259(anImage10109.getHeight(null), 1556812309) + anInt3505 * -755285989);
		graphics.drawImage(anImage10109, i, i_7_, null);
	}

	void method5665(Graphics graphics) {
		int i = (this$0.method5258(anImage10109.getWidth(null), 327240474) + 899934251 * anInt3506);
		int i_8_ = (this$0.method5259(anImage10109.getHeight(null), 1628540892) + anInt3505 * -755285989);
		graphics.drawImage(anImage10109, i, i_8_, null);
	}

	static boolean method15777(int i, int i_9_) {
		return 16 == i || 1 == i || 3 == i || i == 11 || i == 13 || i == 5;
	}

	static final void method15778(long l) {
		Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
		int i = -912781963 * client.anInt11195 + (int) class442.aFloat4918;
		int i_10_ = (int) class442.aFloat4919 + client.anInt11213 * -84518431;
		if (Class286.anInt3211 * 657661431 - i < -2000 || 657661431 * Class286.anInt3211 - i > 2000 || Class608.anInt7995 * -1823634057 - i_10_ < -2000 || Class608.anInt7995 * -1823634057 - i_10_ > 2000) {
			Class286.anInt3211 = i * 1831908295;
			Class608.anInt7995 = i_10_ * -1672389561;
		}
		if (i != Class286.anInt3211 * 657661431) {
			int i_11_ = i - 657661431 * Class286.anInt3211;
			int i_12_ = (int) ((long) i_11_ * l / 320L);
			if (i_11_ > 0) {
				if (0 == i_12_)
					i_12_ = 1;
				else if (i_12_ > i_11_)
					i_12_ = i_11_;
			} else if (0 == i_12_)
				i_12_ = -1;
			else if (i_12_ < i_11_)
				i_12_ = i_11_;
			Class286.anInt3211 += i_12_ * 1831908295;
		}
		if (i_10_ != -1823634057 * Class608.anInt7995) {
			int i_13_ = i_10_ - -1823634057 * Class608.anInt7995;
			int i_14_ = (int) (l * (long) i_13_ / 320L);
			if (i_13_ > 0) {
				if (0 == i_14_)
					i_14_ = 1;
				else if (i_14_ > i_13_)
					i_14_ = i_13_;
			} else if (i_14_ == 0)
				i_14_ = -1;
			else if (i_14_ < i_13_)
				i_14_ = i_13_;
			Class608.anInt7995 += -1672389561 * i_14_;
		}
		client.aFloat11112 += (float) l * client.aFloat11156 / 6.0F;
		client.aFloat11111 += client.aFloat11114 * (float) l / 6.0F;
		Class229.method4317((byte) -108);
	}
}
