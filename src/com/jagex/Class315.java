/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Graphics;

public abstract class Class315 {
	int anInt3505;
	int anInt3506;
	Class306 this$0;

	abstract void method4205(Graphics graphics);

	abstract void method4206(Graphics graphics, int i);

	abstract void method4207(Graphics graphics);

	abstract void method4208(Graphics graphics);

	Class315(Class306 class306, int i, int i_0_) {
		this$0 = class306;
		anInt3506 = -621421269 * i;
		anInt3505 = -1383697571 * i_0_;
	}

	abstract void method4209(Graphics graphics);

	static final void method4210(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class251.aBool2692 = i_1_ == 1;
		Class668.method8011(class251, 263642117);
	}

	static final void method4211(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_2_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_3_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		Class303.method4105(i_2_, i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff, true, (byte) -99);
	}

	public static int method4212(byte i) {
		if (Class707.aBool8822 && null != Class223.aFrame2336)
			return 3;
		return client.aBool11244 ? 2 : 1;
	}

	static final void method4213(long l) {
		if (client.aClass515_11066.method6249(-244790730) != null) {
			if (Class246.anInt2474 * 155362615 == 1 || 5 == 155362615 * Class246.anInt2474)
				Class711.method8376(l);
			else if (155362615 * Class246.anInt2474 == 6)
				Class685.method8112(l);
		}
		Class192.method2842(Class677.aClass167_8609, (long) client.cycles);
		if (-1959825479 * client.anInt11187 != -1)
			Class199.method2913(-1959825479 * client.anInt11187, -1253897341);
		for (int i = 0; i < -5823823 * client.anInt11245; i++) {
			client.aBoolArray11029[i] = client.aBoolArray11240[i];
			client.aBoolArray11240[i] = false;
		}
		client.anInt11246 = -1287148997 * client.cycles;
		Class34.method815(-1, -1, -1223147037);
		if (-1 != client.anInt11187 * -1959825479) {
			client.anInt11245 = 0;
			Class457.method5490(-972318091);
		}
		Class677.aClass167_8609.method2051();
		Class233.method3336(Class677.aClass167_8609, (byte) 118);
		int i = Class520.method6352(1268211697);
		if (-1 == i)
			i = 181434031 * client.anInt11179;
		if (-1 == i)
			i = client.anInt11178 * -551919553;
		Class458_Sub5.method9373(i, (byte) 28);
		int i_4_ = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10874() << 8);
		Class436 class436 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823);
		Class567.method6920((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839), i_4_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_4_, client.anInt11180 * -1483561311, -165772);
		client.anInt11180 = 0;
	}

	static final void method4214(Class668 class668, short i) {
		class668.anInt8542 -= 1472892954;
		int i_5_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_6_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class200.method2915(i_5_, i_6_, false, (byte) 84);
	}

	static final int method4215(int i, int i_7_, int i_8_) {
		int i_9_ = (Class585.method7049(i - 1, i_7_ - 1, -1871695632) + Class585.method7049(i + 1, i_7_ - 1, -1871695632) + Class585.method7049(i - 1, 1 + i_7_, -1871695632) + Class585.method7049(1 + i, i_7_ + 1, -1871695632));
		int i_10_ = (Class585.method7049(i - 1, i_7_, -1871695632) + Class585.method7049(1 + i, i_7_, -1871695632) + Class585.method7049(i, i_7_ - 1, -1871695632) + Class585.method7049(i, 1 + i_7_, -1871695632));
		int i_11_ = Class585.method7049(i, i_7_, -1871695632);
		return i_10_ / 8 + i_9_ / 16 + i_11_ / 4;
	}
}
