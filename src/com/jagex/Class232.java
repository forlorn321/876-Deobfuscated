/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class232 implements Interface27 {
	Class213 this$0;
	Class430 aClass430_2368;

	public void method154(Class226 class226, short i) {
		if (aClass430_2368 != null)
			class226.method3228(-1660889205).method105(((Class153) (this$0.anInterface28_2296.method165((byte) -8).method70(aClass430_2368.anInt4820 * 706703961, (byte) -84))), aClass430_2368.anObject4819, 2116110135);
	}

	public void method153(Class226 class226) {
		if (aClass430_2368 != null)
			class226.method3228(-54042721).method105(((Class153) (this$0.anInterface28_2296.method165((byte) 96).method70(aClass430_2368.anInt4820 * 706703961, (byte) -19))), aClass430_2368.anObject4819, 1972618990);
	}

	Class232(Class213 class213, RSByteBuffer class536_sub33) {
		this$0 = class213;
		if (class536_sub33.readUnsignedShort() != 65535) {
			class536_sub33.off -= 1032351030;
			aClass430_2368 = class213.anInterface28_2296.method165((byte) 8).method8388(class536_sub33, 81361887);
		} else
			aClass430_2368 = null;
	}

	public void method155(Class226 class226) {
		if (aClass430_2368 != null)
			class226.method3228(-890633659).method105(((Class153) (this$0.anInterface28_2296.method165((byte) -55).method70(aClass430_2368.anInt4820 * 706703961, (byte) 26))), aClass430_2368.anObject4819, 2139997915);
	}

	static final void method3322(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_0_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class492.method5972(class251, class234, class668, (byte) -82);
	}

	static final void method3323(Class668 class668, byte i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_1_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Exception_Sub3.method10516(class251, class234, class668, (byte) 65);
	}

	static final void method3324(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub27_10746.method10156(128563989);
	}

	static final void method3325(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		Class103[] class103s = client.aClass103Array11020;
		for (int i_8_ = 0; i_8_ < class103s.length; i_8_++) {
			Class103 class103 = class103s[i_8_];
			if (null != class103 && class103.anInt1224 * 2030004867 == 2) {
				Class672.method8024(class103.anInt1221 * -852709175, 987706607 * class103.anInt1225, -1675921633 * class103.anInt1226, 0, -230158586 * class103.anInt1227, false, false, -2131275969);
				if (client.aFloatArray11133[0] > -1.0F && client.cycles % 20 < 10) {
					Class143 class143 = (Class458_Sub5.aClass143Array10338[-1060879377 * class103.anInt1222]);
					int i_9_ = (int) (client.aFloatArray11133[0] + (float) i - 12.0F);
					int i_10_ = (int) (client.aFloatArray11133[1] + (float) i_2_ - 28.0F);
					class143.method1728(i_9_, i_10_);
				}
			}
		}
	}

	static byte method3326(int i, int i_11_, byte i_12_) {
		if (i != -723459231 * Class606.aClass606_7873.anInt7878)
			return (byte) 0;
		if ((i_11_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	static final void method3327(Class668 class668, int i) {
		class668.anInt8542 -= 1534748737;
		int i_13_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_14_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		int i_15_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 2];
		int i_16_ = class668.anIntArray8541[3 + 1867269829 * class668.anInt8542];
		int i_17_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 4];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_13_ + (i_14_ - i_13_) * (i_17_ - i_15_) / (i_16_ - i_15_);
	}
}
