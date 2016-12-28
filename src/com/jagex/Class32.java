/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class32 {
	Class199 aClass199_277;
	JS5ResourceProvider aClass461_278;
	public int anInt279 = 0;
	public int anInt280 = 0;
	static final int anInt281 = 1;
	JS5ResourceProvider aClass461_282;
	static final int anInt283 = 32768;
	Interface73 anInterface73_284;

	public Class536_Sub18_Sub10 method788(int i, byte i_0_) {
		Class536_Sub18_Sub10 class536_sub18_sub10 = (Class536_Sub18_Sub10) aClass199_277.method2886((long) i);
		if (class536_sub18_sub10 != null)
			return class536_sub18_sub10;
		byte[] is;
		if (i >= 32768)
			is = aClass461_282.method5556(1, i & 0x7fff, (byte) 1);
		else
			is = aClass461_278.method5556(1, i, (byte) 1);
		class536_sub18_sub10 = new Class536_Sub18_Sub10();
		class536_sub18_sub10.aClass32_11723 = this;
		if (is != null)
			class536_sub18_sub10.method10709(new RSByteBuffer(is), 996998273);
		if (i >= 32768)
			class536_sub18_sub10.method10717(-952449493);
		aClass199_277.method2881(class536_sub18_sub10, (long) i);
		return class536_sub18_sub10;
	}

	String method789(Class614 class614, int[] is, long l) {
		if (null != anInterface73_284) {
			String string = anInterface73_284.method490(class614, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	public Class32(Language class664, JS5ResourceProvider class461, JS5ResourceProvider class461_1_, Interface73 interface73) {
		aClass199_277 = new Class199(64);
		anInterface73_284 = null;
		aClass461_278 = class461;
		aClass461_282 = class461_1_;
		anInterface73_284 = interface73;
		if (null != aClass461_278)
			anInt279 = aClass461_278.method5566(1, -87775073) * 1954657215;
		if (aClass461_282 != null)
			anInt280 = aClass461_282.method5566(1, -2014222047) * 586537831;
	}

	static final void method790(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11065 * 691419549;
	}

	static final void method791(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int i_3_ = Class249.method3457(Class47.aClass678_578, Class665.aClass665_8531, i_2_, -773547866);
		int i_4_ = Class205_Sub15.method9087(Class47.aClass678_578, Class665.aClass665_8531, i_2_, -1003636629);
		if (client.anInt11101 * -708374433 != 0 || Class344.method4487(-440129613))
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class554.method6786(i_2_, string, i_3_, i_4_, -1058552606) ? 1 : 0);
	}

	public static final void method792(byte i) {
		if (-1 != client.anInt11192 * 614327763 && -1 != client.anInt11119 * 763781455) {
			int i_5_ = (client.anInt11054 * -2057389237 + ((-1891555007 * client.anInt11122 * (client.anInt11318 * 1242679705 - -2057389237 * client.anInt11054)) >> 16));
			client.anInt11122 += i_5_ * -1116707135;
			if (-1891555007 * client.anInt11122 >= 65535) {
				client.anInt11122 = -1454335681;
				if (!client.aBool11126)
					client.aBool11120 = true;
				else
					client.aBool11120 = false;
				client.aBool11126 = true;
			} else {
				client.aBool11120 = false;
				client.aBool11126 = false;
			}
			float f = (float) (-1891555007 * client.anInt11122) / 65535.0F;
			float[] fs = new float[3];
			int i_6_ = client.anInt11182 * 1867387298;
			for (int i_7_ = 0; i_7_ < 3; i_7_++) {
				int i_8_ = 3 * (client.anIntArrayArrayArray11117[614327763 * client.anInt11192][i_6_][i_7_]);
				int i_9_ = 3 * (client.anIntArrayArrayArray11117[client.anInt11192 * 614327763][1 + i_6_][i_7_]);
				int i_10_ = 3 * ((client.anIntArrayArrayArray11117[client.anInt11192 * 614327763][2 + i_6_][i_7_]) - ((client.anIntArrayArrayArray11117[client.anInt11192 * 614327763][3 + i_6_][i_7_]) - (client.anIntArrayArrayArray11117[614327763 * client.anInt11192][2 + i_6_][i_7_])));
				int i_11_ = (client.anIntArrayArrayArray11117[614327763 * client.anInt11192][i_6_][i_7_]);
				int i_12_ = i_9_ - i_8_;
				int i_13_ = i_10_ + (i_8_ - i_9_ * 2);
				int i_14_ = ((client.anIntArrayArrayArray11117[client.anInt11192 * 614327763][i_6_ + 2][i_7_]) - i_11_ + i_9_ - i_10_);
				fs[i_7_] = (((float) i_12_ + f * ((float) i_13_ + f * (float) i_14_)) * f + (float) i_11_);
			}
			Class598 class598 = client.aClass515_11066.method6255(-1478354313);
			Class637.anInt8301 = 1420867453 * ((int) fs[0] - class598.anInt7839 * 2133575168);
			Class205_Sub21.anInt9958 = 300318539 * (int) fs[1];
			Class685.anInt8665 = 717279039 * ((int) fs[2] - 1391122944 * class598.anInt7840);
			float[] fs_15_ = new float[3];
			int i_16_ = client.anInt11248 * -356507514;
			for (int i_17_ = 0; i_17_ < 3; i_17_++) {
				int i_18_ = ((client.anIntArrayArrayArray11117[client.anInt11119 * 763781455][i_16_][i_17_]) * 3);
				int i_19_ = 3 * (client.anIntArrayArrayArray11117[client.anInt11119 * 763781455][i_16_ + 1][i_17_]);
				int i_20_ = 3 * ((client.anIntArrayArrayArray11117[763781455 * client.anInt11119][2 + i_16_][i_17_]) - ((client.anIntArrayArrayArray11117[client.anInt11119 * 763781455][3 + i_16_][i_17_]) - (client.anIntArrayArrayArray11117[763781455 * client.anInt11119][i_16_ + 2][i_17_])));
				int i_21_ = (client.anIntArrayArrayArray11117[client.anInt11119 * 763781455][i_16_][i_17_]);
				int i_22_ = i_19_ - i_18_;
				int i_23_ = i_20_ + (i_18_ - 2 * i_19_);
				int i_24_ = i_19_ + ((client.anIntArrayArrayArray11117[client.anInt11119 * 763781455][2 + i_16_][i_17_]) - i_21_) - i_20_;
				fs_15_[i_17_] = ((float) i_21_ + f * ((float) i_22_ + ((float) i_23_ + (float) i_24_ * f) * f));
			}
			float f_25_ = fs_15_[0] - fs[0];
			float f_26_ = -1.0F * (fs_15_[1] - fs[1]);
			float f_27_ = fs_15_[2] - fs[2];
			double d = Math.sqrt((double) (f_27_ * f_27_ + f_25_ * f_25_));
			Class141.anInt1658 = ((int) (Math.atan2((double) f_26_, d) * 2607.5945876176133) & 0x3fff) * 269246561;
			Class144.anInt1681 = ((int) (-Math.atan2((double) f_25_, (double) f_27_) * 2607.5945876176133) & 0x3fff) * 402508199;
			NPCCustomization.anInt3440 = ((client.anIntArrayArrayArray11117[client.anInt11192 * 614327763][i_6_][3]) + ((((client.anIntArrayArrayArray11117[614327763 * client.anInt11192][2 + i_6_][3]) - (client.anIntArrayArrayArray11117[client.anInt11192 * 614327763][i_6_][3])) * (client.anInt11122 * -1891555007)) >> 16)) * -2135395277;
		}
	}
}
