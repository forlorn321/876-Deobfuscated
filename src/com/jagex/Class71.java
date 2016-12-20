/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class71 implements Interface76 {
	public static Class71 aClass71_782;
	public static Class71 aClass71_783 = new Class71(0);
	int anInt784;

	Class71(int i) {
		anInt784 = -1205298501 * i;
	}

	public int method87() {
		return anInt784 * 36346483;
	}

	static {
		aClass71_782 = new Class71(1);
	}

	public int method42() {
		return anInt784 * 36346483;
	}

	public int method91() {
		return anInt784 * 36346483;
	}

	static final boolean method1491(char c, int i) {
		return '\u00a0' == c || ' ' == c || c == '_' || c == '-';
	}

	public static void method1492(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int[] is, int[] is_0_, int[] is_1_, int i) {
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
			int i_3_ = is[i_2_];
			int i_4_ = is_1_[i_2_];
			int i_5_ = is_0_[i_2_];
			for (int i_6_ = 0; i_4_ != 0 && i_6_ < (class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934).length; i_4_ >>>= 1) {
				if (0 != (i_4_ & 0x1)) {
					if (-1 == i_3_)
						class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934[i_6_] = null;
					else {
						Class198 class198 = (Class198) Class321.aClass24_Sub10_3551.method81(i_3_, 1121331487);
						int i_7_ = -667661221 * class198.anInt2186;
						Class695_Sub3_Sub1 class695_sub3_sub1 = (class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934[i_6_]);
						if (class695_sub3_sub1 != null && class695_sub3_sub1.method14162(-1998325640)) {
							if (i_3_ == class695_sub3_sub1.method14164(-478917127)) {
								if (0 == i_7_) {
									class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934[i_6_] = null;
									class695_sub3_sub1 = null;
								} else if (1 == i_7_) {
									class695_sub3_sub1.method14179(-633668589);
									class695_sub3_sub1.anInt11885 = i_5_ * -1829614779;
								} else if (i_7_ == 2)
									class695_sub3_sub1.method14184((byte) 43);
							} else if (40010509 * class198.anInt2191 >= (class695_sub3_sub1.method14163(526396577).anInt2191) * 40010509) {
								class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934[i_6_] = null;
								class695_sub3_sub1 = null;
							}
						}
						if (null == class695_sub3_sub1 || !class695_sub3_sub1.method14162(-1792573552)) {
							class695_sub3_sub1 = class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934[i_6_] = (new Class695_Sub3_Sub1(class640_sub1_sub2_sub1));
							class695_sub3_sub1.method14165(i_3_, (byte) 39);
							class695_sub3_sub1.anInt11885 = i_5_ * -1829614779;
						}
					}
				}
				i_6_++;
			}
		}
	}

	static String method1493(Class243 class243, int i) {
		if (client.method17815(class243).method16255((byte) 34) == 0)
			return null;
		if (null == class243.aString2495 || class243.aString2495.trim().length() == 0) {
			if (client.aBool11199)
				return "Hidden-use";
			return null;
		}
		return class243.aString2495;
	}

	static Class527_Sub34_Sub2 method1494(int i, int i_8_, int i_9_, long l, int i_10_, byte i_11_) {
		synchronized (Class527_Sub34_Sub2.aClass527_Sub34_Sub2Array11829) {
			Class527_Sub34_Sub2 class527_sub34_sub2;
			if (0 == -1656970205 * Class273.anInt3142)
				class527_sub34_sub2 = new Class527_Sub34_Sub2();
			else
				class527_sub34_sub2 = (Class527_Sub34_Sub2.aClass527_Sub34_Sub2Array11829[(Class273.anInt3142 -= -1056232565) * -1656970205]);
			class527_sub34_sub2.anInt11827 = -997557425 * i;
			class527_sub34_sub2.anInt11828 = i_8_ * 172876589;
			class527_sub34_sub2.anInt11826 = -798112521 * i_9_;
			class527_sub34_sub2.aLong11830 = l * -1595071175565321647L;
			class527_sub34_sub2.anInt11831 = i_10_ * -54945929;
			Class527_Sub34_Sub2 class527_sub34_sub2_12_ = class527_sub34_sub2;
			return class527_sub34_sub2_12_;
		}
	}
}
