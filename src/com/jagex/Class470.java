/* Class470 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class470 {
	public static int method5701(int i, int i_0_, int i_1_) {
		i_1_ &= 0x3;
		if (i_1_ == 0)
			return i;
		if (1 == i_1_)
			return i_0_;
		if (2 == i_1_)
			return 7 - i;
		return 7 - i_0_;
	}

	public static int method5702(int i, int i_2_, int i_3_) {
		i_3_ &= 0x3;
		if (i_3_ == 0)
			return i_2_;
		if (i_3_ == 1)
			return 7 - i;
		if (i_3_ == 2)
			return 7 - i_2_;
		return i;
	}

	public static int method5703(int i, int i_4_, int i_5_) {
		i_5_ &= 0x3;
		if (i_5_ == 0)
			return i_4_;
		if (1 == i_5_)
			return 4095 - i;
		if (2 == i_5_)
			return 4095 - i_4_;
		return i;
	}

	public static int method5704(int i, int i_6_, int i_7_) {
		i_7_ &= 0x3;
		if (i_7_ == 0)
			return i_6_;
		if (1 == i_7_)
			return 4095 - i;
		if (2 == i_7_)
			return 4095 - i_6_;
		return i;
	}

	Class470() throws Throwable {
		throw new Error();
	}

	public static void method5705(String string, byte i) {
		if (-708374433 * client.anInt11101 == 11) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4485, client.aClass106_11218.aClass15_1258, 1865806577);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(0, -1778059594);
			int i_8_ = (class536_sub23.aClass536_Sub33_Sub2_10528.off * -810172525);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
			class536_sub23.aClass536_Sub33_Sub2_10528.off += -681738691;
			class536_sub23.aClass536_Sub33_Sub2_10528.method9725(Class45.anIntArray526, i_8_, (-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off), -869482025);
			class536_sub23.aClass536_Sub33_Sub2_10528.method9698(-810172525 * (class536_sub23.aClass536_Sub33_Sub2_10528.off) - i_8_, 52250740);
			client.aClass106_11218.method1409(class536_sub23, 138798278);
			Class391.aClass686_4060 = Class686.aClass686_8670;
		}
	}

	public static void method5706(float f, Class436 class436, Class425 class425, Class436 class436_9_, Class436 class436_10_, Class436 class436_11_, float f_12_, float f_13_, float f_14_, int i) {
		if (!class436_9_.method5245(class436)) {
			Class436 class436_15_ = Class436.method5257(0.0F, 0.0F, 0.0F);
			Class436 class436_16_ = Class436.method5240(Class436.method5252(class436_9_, class436));
			class436_16_.method5263(class425);
			Class436 class436_17_ = Class436.method5252(class436_16_, class436_15_);
			float f_18_ = class436_17_.method5291();
			if (Float.POSITIVE_INFINITY == class436_11_.aFloat4850 || Float.isNaN(class436.aFloat4850) || f_18_ > f_13_ || f_18_ < f_14_) {
				class436.method5272(class436_9_);
				class436_10_.method5244();
			} else {
				class425.method5091();
				Class436 class436_19_ = Class436.method5257(1.0F, 0.0F, 0.0F);
				Class436 class436_20_ = Class436.method5257(0.0F, 1.0F, 0.0F);
				Class436 class436_21_ = Class436.method5257(0.0F, 0.0F, 1.0F);
				class436_19_.method5263(class425);
				class436_20_.method5263(class425);
				class436_21_.method5263(class425);
				Class436 class436_22_ = Class436.method5257(Class436.method5254(class436_19_, class436_10_), Class436.method5254(class436_20_, class436_10_), Class436.method5254(class436_21_, class436_10_));
				Class436 class436_23_ = Class436.method5240(class436_22_);
				Class436 class436_24_ = (Class436.method5257(class436_11_.aFloat4850 * class436_17_.aFloat4850, class436_11_.aFloat4852 * class436_17_.aFloat4852, class436_17_.aFloat4853 * class436_11_.aFloat4853));
				class436_23_.method5249(class436_24_, f);
				class436_23_.method5262(f_12_);
				Class436 class436_25_ = Class436.method5281(class436_19_, class436_23_.aFloat4850);
				class436_25_.method5249(class436_20_, class436_23_.aFloat4852);
				class436_25_.method5249(class436_21_, class436_23_.aFloat4853);
				class436_10_.method5272(class436_25_);
				class436.method5248(Class436.method5281(class436_10_, f));
			}
		}
	}

	static final void method5707(Class668 class668, byte i) {
		int i_26_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_26_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_26_ >> 16];
		Class320.method4243(class251, class234, class668, -1028581094);
	}

	static final void method5708(Class668 class668, int i) {
		int i_27_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_27_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_27_ >> 16];
		Class390.method4856(class251, class234, false, 0, class668, (byte) -20);
	}
}
