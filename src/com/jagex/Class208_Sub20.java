/* Class208_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub20 extends Class208 {
	int anInt9956;
	int anInt9957;
	int anInt9958;
	int anInt9959;
	int anInt9960;

	public void method3851() {
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = Class466.aClass196Array5314[anInt9960 * -2106911687].method3717(1699724836);
		class640_sub1_sub2_sub1.method18538(anInt9957 * 1841088525, 2012638729 * anInt9958, anInt9959 * -935211361, 71351037 * anInt9956, client.anInt11019, 0, -2126195343);
	}

	public void method3846(int i) {
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = Class466.aClass196Array5314[anInt9960 * -2106911687].method3717(-1665211416);
		class640_sub1_sub2_sub1.method18538(anInt9957 * 1841088525, 2012638729 * anInt9958, anInt9959 * -935211361, 71351037 * anInt9956, client.anInt11019, 0, -2003363506);
	}

	public void method3848() {
		Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = Class466.aClass196Array5314[anInt9960 * -2106911687].method3717(1117831282);
		class640_sub1_sub2_sub1.method18538(anInt9957 * 1841088525, 2012638729 * anInt9958, anInt9959 * -935211361, 71351037 * anInt9956, client.anInt11019, 0, 1372341472);
	}

	Class208_Sub20(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9960 = class527_sub38.readUnsignedShort() * -727541239;
		int i = class527_sub38.readUnsignedByte();
		if ((i & 0x1) != 0) {
			anInt9957 = class527_sub38.readUnsignedShort() * -150944059;
			anInt9958 = class527_sub38.readUnsignedShort() * -1049264071;
		} else {
			anInt9957 = 150944059;
			anInt9958 = 1049264071;
		}
		if ((i & 0x2) != 0) {
			anInt9959 = class527_sub38.readUnsignedShort() * -1048457889;
			anInt9956 = class527_sub38.readUnsignedShort() * -371805611;
		} else {
			anInt9959 = 1048457889;
			anInt9956 = 371805611;
		}
		if (0 != (i & 0x4)) {
			int i_0_ = class527_sub38.readUnsignedShort();
			int i_1_ = class527_sub38.readUnsignedShort();
			int i_2_ = 255 * i_0_ / i_1_;
			if (i_0_ > 0 && i_2_ < 1) {
				boolean bool = true;
			}
		}
	}

	public static int method15634(int i, int i_3_, int i_4_, int i_5_) {
		i_4_ &= 0x3;
		if (0 == i_4_)
			return i;
		if (1 == i_4_)
			return i_3_;
		if (2 == i_4_)
			return 7 - i;
		return 7 - i_3_;
	}
}
