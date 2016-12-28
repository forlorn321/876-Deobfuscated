/* Class665 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class665 {
	static Class665 aClass665_8529;
	public static Class665 aClass665_8530;
	public static Class665 aClass665_8531 = new Class665();

	Class665() {
		/* empty */
	}

	static {
		aClass665_8530 = new Class665();
		aClass665_8529 = new Class665();
	}

	public static final int method7999(Class34_Sub17 class34_sub17, byte[] is, int i, int i_0_, int i_1_, int i_2_, Class656 class656, Class656 class656_3_, int i_4_) {
		int i_5_ = 0;
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		int i_6_ = -1;
		for (;;) {
			int i_7_ = class536_sub33.readSmart2(-2142398867);
			if (i_7_ == 0)
				break;
			i_6_ += i_7_;
			int i_8_ = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int i_9_ = class536_sub33.readUnsignedSmart();
					if (0 == i_9_)
						break;
					class536_sub33.readUnsignedByte();
				} else {
					int i_10_ = class536_sub33.readUnsignedSmart();
					if (i_10_ == 0)
						break;
					i_8_ += i_10_ - 1;
					int i_11_ = i_8_ & 0x3f;
					int i_12_ = i_8_ >> 6 & 0x3f;
					int i_13_ = class536_sub33.readUnsignedByte() >> 2;
					int i_14_ = i_13_ & 0x3;
					i_13_ >>= 2;
					int i_15_ = i + i_12_;
					int i_16_ = i_0_ + i_11_;
					Class612 class612 = (Class612) class34_sub17.method70(i_6_, (byte) 62);
					int i_17_;
					int i_18_;
					if (0 == (i_14_ & 0x1)) {
						i_17_ = class612.anInt8002 * -1981381335;
						i_18_ = -90266503 * class612.anInt7980;
					} else {
						i_17_ = -90266503 * class612.anInt7980;
						i_18_ = class612.anInt8002 * -1981381335;
					}
					if (i_15_ < i_1_ && i_16_ < i_2_ && i_17_ + i_15_ >= 0 && i_16_ + i_18_ >= 0) {
						if ((-723459231 * Class606.aClass606_7895.anInt7878 != i_13_) || ClientSetting.aClass536_Sub40_8843.groundDecorationSetting.method9932(-2015548878) != 0 || 0 != 1248110961 * class612.anInt7953 || 1 == -1137177093 * class612.anInt7952 || class612.aBool7945) {
							if (!class612.method7292(class656_3_, (byte) -53)) {
								class656.anInt8497 = -994926531 * i_6_;
								i_5_++;
							}
							bool = true;
						}
					}
				}
			}
		}
		return i_5_;
	}

	static final void method8000(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class292.method3968(class251, class234, class668, -878876194);
	}

	public static void method8001(int i, byte i_19_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(21, (long) i);
		class536_sub18_sub5.method10669(-1017803809);
	}
}
