/* Class315_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Class315_Sub1_Sub1 extends Class315_Sub1 {
	static int anInt11395;
	float aFloat11396;
	Class306 this$0;
	float aFloat11397;
	static boolean[][] aBoolArrayArray11398;

	Class315_Sub1_Sub1(Class306 class306, Image image, int i, int i_0_, float f) {
		super(class306, image, i, i_0_);
		this$0 = class306;
		aFloat11397 = f;
		aFloat11396 = -aFloat11397;
	}

	void method4206(Graphics graphics, int i) {
		aFloat11396 += aFloat11397;
		if (aFloat11396 < 0.0F)
			aFloat11396 += 360.0F;
		aFloat11396 %= 360.0F;
		double d = Math.toRadians((double) aFloat11396);
		int i_1_ = anImage10018.getWidth(null);
		int i_2_ = anImage10018.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (this$0.method4109(i_1_, 1851879494) + i_1_ / 2 + 28572035 * anInt3506), (double) (this$0.method4118(i_2_, (byte) -18) + i_2_ / 2 + anInt3505 * 1161853173));
		graphics2d.translate((this$0.method4109(i_1_, 1435942514) + anInt3506 * 28572035), (this$0.method4118(i_2_, (byte) -16) + anInt3505 * 1161853173));
		graphics2d.drawImage(anImage10018, null, null);
		graphics2d.setTransform(this$0.anAffineTransform3445);
	}

	void method4208(Graphics graphics) {
		aFloat11396 += aFloat11397;
		if (aFloat11396 < 0.0F)
			aFloat11396 += 360.0F;
		aFloat11396 %= 360.0F;
		double d = Math.toRadians((double) aFloat11396);
		int i = anImage10018.getWidth(null);
		int i_3_ = anImage10018.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (this$0.method4109(i, 645322339) + i / 2 + 28572035 * anInt3506), (double) (this$0.method4118(i_3_, (byte) -20) + i_3_ / 2 + anInt3505 * 1161853173));
		graphics2d.translate((this$0.method4109(i, 650937784) + anInt3506 * 28572035), (this$0.method4118(i_3_, (byte) 52) + anInt3505 * 1161853173));
		graphics2d.drawImage(anImage10018, null, null);
		graphics2d.setTransform(this$0.anAffineTransform3445);
	}

	void method4207(Graphics graphics) {
		aFloat11396 += aFloat11397;
		if (aFloat11396 < 0.0F)
			aFloat11396 += 360.0F;
		aFloat11396 %= 360.0F;
		double d = Math.toRadians((double) aFloat11396);
		int i = anImage10018.getWidth(null);
		int i_4_ = anImage10018.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (this$0.method4109(i, 1381579239) + i / 2 + 28572035 * anInt3506), (double) (this$0.method4118(i_4_, (byte) 13) + i_4_ / 2 + anInt3505 * 1161853173));
		graphics2d.translate((this$0.method4109(i, 1020991877) + anInt3506 * 28572035), (this$0.method4118(i_4_, (byte) 47) + anInt3505 * 1161853173));
		graphics2d.drawImage(anImage10018, null, null);
		graphics2d.setTransform(this$0.anAffineTransform3445);
	}

	void method4205(Graphics graphics) {
		aFloat11396 += aFloat11397;
		if (aFloat11396 < 0.0F)
			aFloat11396 += 360.0F;
		aFloat11396 %= 360.0F;
		double d = Math.toRadians((double) aFloat11396);
		int i = anImage10018.getWidth(null);
		int i_5_ = anImage10018.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (this$0.method4109(i, -55301614) + i / 2 + 28572035 * anInt3506), (double) (this$0.method4118(i_5_, (byte) 58) + i_5_ / 2 + anInt3505 * 1161853173));
		graphics2d.translate((this$0.method4109(i, 29338554) + anInt3506 * 28572035), (this$0.method4118(i_5_, (byte) 2) + anInt3505 * 1161853173));
		graphics2d.drawImage(anImage10018, null, null);
		graphics2d.setTransform(this$0.anAffineTransform3445);
	}

	void method4209(Graphics graphics) {
		aFloat11396 += aFloat11397;
		if (aFloat11396 < 0.0F)
			aFloat11396 += 360.0F;
		aFloat11396 %= 360.0F;
		double d = Math.toRadians((double) aFloat11396);
		int i = anImage10018.getWidth(null);
		int i_6_ = anImage10018.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (this$0.method4109(i, 1781316910) + i / 2 + 28572035 * anInt3506), (double) (this$0.method4118(i_6_, (byte) -9) + i_6_ / 2 + anInt3505 * 1161853173));
		graphics2d.translate((this$0.method4109(i, 193963346) + anInt3506 * 28572035), (this$0.method4118(i_6_, (byte) 75) + anInt3505 * 1161853173));
		graphics2d.drawImage(anImage10018, null, null);
		graphics2d.setTransform(this$0.anAffineTransform3445);
	}

	static final void method10554(Class536_Sub18_Sub9 class536_sub18_sub9, Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class555.method6805(class536_sub18_sub9, -1753161730);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class563.method6870(class536_sub18_sub9, 2132407292);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class301.method4093(class536_sub18_sub9, (byte) 1);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class576.method7002(class536_sub18_sub9, (short) 14654);
	}
}
