/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class474 implements Interface11 {
	public static int anInt5373;

	public Object method75(RSByteBuffer class527_sub38, byte i) {
		return Integer.valueOf(class527_sub38.readInt());
	}

	public Object method74(RSByteBuffer class527_sub38) {
		return Integer.valueOf(class527_sub38.readInt());
	}

	static final void method7753(Class665 class665, Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, byte i) {
		class665.anInt8526 -= 409523364;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		int i_2_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		boolean bool = (class665.anIntArray8525[1769813785 * class665.anInt8526 + 3] == 1);
		if (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -50) != Class309.aClass309_3455)
			throw new RuntimeException();
		Class696_Sub3 class696_sub3 = ((Class696_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5472(-488258185));
		if (null != class640_sub1_sub2_sub1)
			class696_sub3.method17228(class640_sub1_sub2_sub1, new Class442((float) i_0_, (float) i_1_, (float) i_2_), bool, -519467501);
		client.aBool11119 = true;
	}

	public static int method7754(CharSequence charsequence, byte i) {
		int i_3_ = charsequence.length();
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
			i_4_ = ((i_4_ << 5) - i_4_ + Class676.method13876(charsequence.charAt(i_5_), 1907269876));
		return i_4_;
	}

	static final void method7755(Class665 class665, byte i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub26_10602, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), 1942499684);
		Class631.method10465(582195417);
		client.aBool11020 = false;
	}

	static void method7756(Class180 class180, int i) {
		int i_6_ = -10660793;
		Class700_Sub18.method17022(class180, -1375491723 * Class230.anInt2355, Class80.anInt807 * 479584441, Class100.anInt1187 * -1309847599, -830760507 * Class317.anInt3532, i_6_, -16777216, 777715094);
		Class29.aClass174_262.method2770(Class53.aClass53_658.method1290(Class144_Sub1.aClass671_8995, (byte) -14), 3 + -1375491723 * Class230.anInt2355, 479584441 * Class80.anInt807 + 14, i_6_, -1, 1380106854);
		int i_7_ = Class534.aClass553_7213.method9158(-1412060454);
		int i_8_ = Class534.aClass553_7213.method9159(1957375230);
		if (!Class35.aBool339) {
			int i_9_ = 0;
			for (Class527_Sub8_Sub7 class527_sub8_sub7 = ((Class527_Sub8_Sub7) Class35.aClass694_348.method14081((short) -8304)); class527_sub8_sub7 != null; class527_sub8_sub7 = ((Class527_Sub8_Sub7) Class35.aClass694_348.method14086(-65534))) {
				int i_10_ = (31 + 479584441 * Class80.anInt807 + ((-943170217 * Class35.anInt346 - 1 - i_9_) * (-1297575597 * Class35.anInt335)));
				Class670.method13764(i_7_, i_8_, Class230.anInt2355 * -1375491723, 479584441 * Class80.anInt807, Class100.anInt1187 * -1309847599, Class317.anInt3532 * -830760507, i_10_, class527_sub8_sub7, Class29.aClass174_262, Class568.aClass22_7615, -1, -256, 300682597);
				i_9_++;
			}
		} else {
			int i_11_ = 0;
			for (Class527_Sub8_Sub4 class527_sub8_sub4 = ((Class527_Sub8_Sub4) Class35.aClass693_350.method14072(1269240675)); null != class527_sub8_sub4; class527_sub8_sub4 = ((Class527_Sub8_Sub4) Class35.aClass693_350.method14059(-1311245901))) {
				int i_12_ = (Class80.anInt807 * 479584441 + 31 + i_11_ * (-1297575597 * Class35.anInt335));
				if (class527_sub8_sub4.anInt11625 * 1731231531 == 1)
					Class670.method13764(i_7_, i_8_, -1375491723 * Class230.anInt2355, Class80.anInt807 * 479584441, -1309847599 * Class100.anInt1187, Class317.anInt3532 * -830760507, i_12_, ((Class527_Sub8_Sub7) (class527_sub8_sub4.aClass693_11624.aClass527_Sub8_8734.aClass527_Sub8_10400)), Class29.aClass174_262, Class568.aClass22_7615, -1, -256, -857392163);
				else
					Class264.method4984(i_7_, i_8_, Class230.anInt2355 * -1375491723, Class80.anInt807 * 479584441, -1309847599 * Class100.anInt1187, -830760507 * Class317.anInt3532, i_12_, class527_sub8_sub4, Class29.aClass174_262, Class568.aClass22_7615, -1, -256, (byte) 3);
				i_11_++;
			}
			if (null != Class35.aClass527_Sub8_Sub4_340) {
				Class700_Sub18.method17022(class180, -860825733 * Class576.anInt7640, Class35.anInt354 * 182965925, 949523843 * Class279.anInt3172, -1441633063 * Class402.anInt4149, i_6_, -16777216, 847185382);
				Class29.aClass174_262.method2770(Class35.aClass527_Sub8_Sub4_340.aString11623, 3 + Class576.anInt7640 * -860825733, Class35.anInt354 * 182965925 + 14, i_6_, -1, 1287051846);
				i_11_ = 0;
				for (Class527_Sub8_Sub7 class527_sub8_sub7 = (Class527_Sub8_Sub7) Class35.aClass527_Sub8_Sub4_340.aClass693_11624.method14072(-409246844); null != class527_sub8_sub7; class527_sub8_sub7 = (Class527_Sub8_Sub7) Class35.aClass527_Sub8_Sub4_340.aClass693_11624.method14059(355936253)) {
					int i_13_ = (Class35.anInt335 * -1297575597 * i_11_ + (31 + 182965925 * Class35.anInt354));
					Class670.method13764(i_7_, i_8_, Class576.anInt7640 * -860825733, 182965925 * Class35.anInt354, Class279.anInt3172 * 949523843, -1441633063 * Class402.anInt4149, i_13_, class527_sub8_sub7, Class29.aClass174_262, Class568.aClass22_7615, -1, -256, -5543549);
					i_11_++;
				}
			}
		}
	}
}
