/* Class603 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class603 implements Interface19 {
	static final long aLong7952 = 500L;
	int[] anIntArray7953;
	static final long aLong7954 = 1L;
	static final long aLong7955 = 4611686018427387903L;
	static final long aLong7956 = 4611686018427387904L;
	int[] anIntArray7957;
	Class14 aClass14_7958 = new Class14(128);
	static Class527_Sub8_Sub12 aClass527_Sub8_Sub12_7959;
	public static int anInt7960;

	public Object method115(Class160 class160) {
		throw new UnsupportedOperationException();
	}

	public int method10013(boolean bool, byte i) {
		long l = Class234.method4347(-1408626088);
		for (Class527_Sub20 class527_sub20 = (Class527_Sub20) (bool ? aClass14_7958.method713((byte) 87) : aClass14_7958.method717(-1805224)); class527_sub20 != null; class527_sub20 = (Class527_Sub20) aClass14_7958.method717(-1814102104)) {
			if ((3276150014841543847L * class527_sub20.aLong10482 & 0x3fffffffffffffffL) < l) {
				if ((class527_sub20.aLong10482 * 3276150014841543847L & 0x4000000000000000L) != 0L) {
					int i_0_ = (int) (class527_sub20.aLong7106 * -8168620736534281759L);
					anIntArray7957[i_0_] = anIntArray7953[i_0_];
					class527_sub20.method8735(-1889161967);
					return i_0_;
				}
				class527_sub20.method8735(-1889161967);
			}
		}
		return -1;
	}

	public void method10014(int i) {
		for (int i_1_ = 0; i_1_ < Class248.aClass95_Sub1_Sub1_2731.method77(-1618477708); i_1_++) {
			Class160_Sub1 class160_sub1 = ((Class160_Sub1) Class248.aClass95_Sub1_Sub1_2731.method81(i_1_, -1756462047));
			if (null != class160_sub1) {
				anIntArray7953[i_1_] = 0;
				anIntArray7957[i_1_] = 0;
			}
		}
		aClass14_7958 = new Class14(128);
	}

	public int method101(Class160 class160, int i) {
		return anIntArray7957[727971013 * class160.anInt1746];
	}

	public void method105(Class160 class160, int i, byte i_2_) {
		anIntArray7957[727971013 * class160.anInt1746] = i;
		Class527_Sub20 class527_sub20 = ((Class527_Sub20) aClass14_7958.method709((long) (727971013 * class160.anInt1746)));
		if (null != class527_sub20)
			class527_sub20.aLong10482 = (Class234.method4347(-1408626088) + 500L) * -613984820454061289L;
		else {
			class527_sub20 = new Class527_Sub20(Class234.method4347(-1408626088) + 500L);
			aClass14_7958.method714(class527_sub20, (long) (class160.anInt1746 * 727971013));
		}
	}

	public void method10015(Class160 class160, int i, int i_3_) {
		anIntArray7953[class160.anInt1746 * 727971013] = i;
		Class527_Sub20 class527_sub20 = ((Class527_Sub20) aClass14_7958.method709((long) (727971013 * class160.anInt1746)));
		if (null != class527_sub20) {
			if (3276150014841543847L * class527_sub20.aLong10482 != 4611686018427387905L)
				class527_sub20.aLong10482 = (Class234.method4347(-1408626088) + 500L | 0x4000000000000000L) * -613984820454061289L;
		} else {
			class527_sub20 = new Class527_Sub20(4611686018427387905L);
			aClass14_7958.method714(class527_sub20, (long) (class160.anInt1746 * 727971013));
		}
	}

	public int method100(Class333 class333, short i) {
		return class333.method5839(anIntArray7957[727971013 * (class333.aClass160_3626.anInt1746)], (byte) 3);
	}

	public void method109(Class333 class333, int i, int i_4_) throws Exception_Sub7 {
		int i_5_ = class333.method5841(anIntArray7957[(class333.aClass160_3626.anInt1746) * 727971013], i, (byte) -95);
		method105(class333.aClass160_3626, i_5_, (byte) -33);
	}

	public void method10016(Class333 class333, int i, int i_6_) {
		try {
			int i_7_ = class333.method5841(anIntArray7953[(class333.aClass160_3626.anInt1746) * 727971013], i, (byte) -14);
			method10015(class333.aClass160_3626, i_7_, -566817985);
		} catch (Exception_Sub7 exception_sub7) {
			/* empty */
		}
	}

	public long method113(Class160 class160, byte i) {
		throw new UnsupportedOperationException();
	}

	public int method10017(boolean bool) {
		long l = Class234.method4347(-1408626088);
		for (Class527_Sub20 class527_sub20 = (Class527_Sub20) (bool ? aClass14_7958.method713((byte) -22) : aClass14_7958.method717(-767024338)); class527_sub20 != null; class527_sub20 = (Class527_Sub20) aClass14_7958.method717(-944539923)) {
			if ((3276150014841543847L * class527_sub20.aLong10482 & 0x3fffffffffffffffL) < l) {
				if ((class527_sub20.aLong10482 * 3276150014841543847L & 0x4000000000000000L) != 0L) {
					int i = (int) (class527_sub20.aLong7106 * -8168620736534281759L);
					anIntArray7957[i] = anIntArray7953[i];
					class527_sub20.method8735(-1889161967);
					return i;
				}
				class527_sub20.method8735(-1889161967);
			}
		}
		return -1;
	}

	public Object method106(Class160 class160, int i) {
		throw new UnsupportedOperationException();
	}

	public int method104(Class160 class160) {
		return anIntArray7957[727971013 * class160.anInt1746];
	}

	public void method118(Class160 class160, Object object) {
		throw new UnsupportedOperationException();
	}

	public int method10018(boolean bool) {
		long l = Class234.method4347(-1408626088);
		for (Class527_Sub20 class527_sub20 = (Class527_Sub20) (bool ? aClass14_7958.method713((byte) -89) : aClass14_7958.method717(1993165718)); class527_sub20 != null; class527_sub20 = (Class527_Sub20) aClass14_7958.method717(-910534958)) {
			if ((3276150014841543847L * class527_sub20.aLong10482 & 0x3fffffffffffffffL) < l) {
				if ((class527_sub20.aLong10482 * 3276150014841543847L & 0x4000000000000000L) != 0L) {
					int i = (int) (class527_sub20.aLong7106 * -8168620736534281759L);
					anIntArray7957[i] = anIntArray7953[i];
					class527_sub20.method8735(-1889161967);
					return i;
				}
				class527_sub20.method8735(-1889161967);
			}
		}
		return -1;
	}

	public Object method116(Class160 class160) {
		throw new UnsupportedOperationException();
	}

	public long method112(Class160 class160) {
		throw new UnsupportedOperationException();
	}

	public long method108(Class160 class160) {
		throw new UnsupportedOperationException();
	}

	public Class603() {
		anIntArray7953 = new int[Class248.aClass95_Sub1_Sub1_2731.method77(567053146)];
		anIntArray7957 = new int[Class248.aClass95_Sub1_Sub1_2731.method77(955024533)];
	}

	public int method102(Class333 class333) {
		return class333.method5839(anIntArray7957[727971013 * (class333.aClass160_3626.anInt1746)], (byte) 3);
	}

	public void method107(Class160 class160, int i) {
		anIntArray7957[727971013 * class160.anInt1746] = i;
		Class527_Sub20 class527_sub20 = ((Class527_Sub20) aClass14_7958.method709((long) (727971013 * class160.anInt1746)));
		if (null != class527_sub20)
			class527_sub20.aLong10482 = (Class234.method4347(-1408626088) + 500L) * -613984820454061289L;
		else {
			class527_sub20 = new Class527_Sub20(Class234.method4347(-1408626088) + 500L);
			aClass14_7958.method714(class527_sub20, (long) (class160.anInt1746 * 727971013));
		}
	}

	public Object method117(Class160 class160) {
		throw new UnsupportedOperationException();
	}

	public void method122(Class160 class160, int i) {
		anIntArray7957[727971013 * class160.anInt1746] = i;
		Class527_Sub20 class527_sub20 = ((Class527_Sub20) aClass14_7958.method709((long) (727971013 * class160.anInt1746)));
		if (null != class527_sub20)
			class527_sub20.aLong10482 = (Class234.method4347(-1408626088) + 500L) * -613984820454061289L;
		else {
			class527_sub20 = new Class527_Sub20(Class234.method4347(-1408626088) + 500L);
			aClass14_7958.method714(class527_sub20, (long) (class160.anInt1746 * 727971013));
		}
	}

	public void method119(Class333 class333, int i) throws Exception_Sub7 {
		int i_8_ = class333.method5841(anIntArray7957[(class333.aClass160_3626.anInt1746) * 727971013], i, (byte) -110);
		method105(class333.aClass160_3626, i_8_, (byte) -56);
	}

	public void method111(Class160 class160, Object object, int i) {
		throw new UnsupportedOperationException();
	}

	public void method120(Class333 class333, int i) throws Exception_Sub7 {
		int i_9_ = class333.method5841(anIntArray7957[(class333.aClass160_3626.anInt1746) * 727971013], i, (byte) -76);
		method105(class333.aClass160_3626, i_9_, (byte) -39);
	}

	public void method121(Class160 class160, int i) {
		anIntArray7957[727971013 * class160.anInt1746] = i;
		Class527_Sub20 class527_sub20 = ((Class527_Sub20) aClass14_7958.method709((long) (727971013 * class160.anInt1746)));
		if (null != class527_sub20)
			class527_sub20.aLong10482 = (Class234.method4347(-1408626088) + 500L) * -613984820454061289L;
		else {
			class527_sub20 = new Class527_Sub20(Class234.method4347(-1408626088) + 500L);
			aClass14_7958.method714(class527_sub20, (long) (class160.anInt1746 * 727971013));
		}
	}

	public void method114(Class160 class160, long l) {
		throw new UnsupportedOperationException();
	}

	public int method103(Class160 class160) {
		return anIntArray7957[727971013 * class160.anInt1746];
	}

	public void method110(Class160 class160, long l) {
		throw new UnsupportedOperationException();
	}

	public int method10019(boolean bool) {
		long l = Class234.method4347(-1408626088);
		for (Class527_Sub20 class527_sub20 = (Class527_Sub20) (bool ? aClass14_7958.method713((byte) -22) : aClass14_7958.method717(-2025814706)); class527_sub20 != null; class527_sub20 = (Class527_Sub20) aClass14_7958.method717(1684622215)) {
			if ((3276150014841543847L * class527_sub20.aLong10482 & 0x3fffffffffffffffL) < l) {
				if ((class527_sub20.aLong10482 * 3276150014841543847L & 0x4000000000000000L) != 0L) {
					int i = (int) (class527_sub20.aLong7106 * -8168620736534281759L);
					anIntArray7957[i] = anIntArray7953[i];
					class527_sub20.method8735(-1889161967);
					return i;
				}
				class527_sub20.method8735(-1889161967);
			}
		}
		return -1;
	}

	public int method10020(boolean bool) {
		long l = Class234.method4347(-1408626088);
		for (Class527_Sub20 class527_sub20 = (Class527_Sub20) (bool ? aClass14_7958.method713((byte) 9) : aClass14_7958.method717(577586088)); class527_sub20 != null; class527_sub20 = (Class527_Sub20) aClass14_7958.method717(-13507752)) {
			if ((3276150014841543847L * class527_sub20.aLong10482 & 0x3fffffffffffffffL) < l) {
				if ((class527_sub20.aLong10482 * 3276150014841543847L & 0x4000000000000000L) != 0L) {
					int i = (int) (class527_sub20.aLong7106 * -8168620736534281759L);
					anIntArray7957[i] = anIntArray7953[i];
					class527_sub20.method8735(-1889161967);
					return i;
				}
				class527_sub20.method8735(-1889161967);
			}
		}
		return -1;
	}

	public void method10021(Class160 class160, int i) {
		anIntArray7953[class160.anInt1746 * 727971013] = i;
		Class527_Sub20 class527_sub20 = ((Class527_Sub20) aClass14_7958.method709((long) (727971013 * class160.anInt1746)));
		if (null != class527_sub20) {
			if (3276150014841543847L * class527_sub20.aLong10482 != 4611686018427387905L)
				class527_sub20.aLong10482 = (Class234.method4347(-1408626088) + 500L | 0x4000000000000000L) * -613984820454061289L;
		} else {
			class527_sub20 = new Class527_Sub20(4611686018427387905L);
			aClass14_7958.method714(class527_sub20, (long) (class160.anInt1746 * 727971013));
		}
	}

	static final void method10022(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-1222346476) == 1 ? 1 : 0;
	}

	static final void method10023(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_10_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_11_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183)
			Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183.method10491(i_10_, i_11_, -2049454606);
	}

	static final void method10024(Class665 class665, int i) {
		class665.anInt8526 -= 1228570092;
		Exception_Sub7.method17974(613047382);
		Class578.method9646(-1102412710);
		Class95_Sub1_Sub1.anInt11331 = (308448729 * class665.anIntArray8525[class665.anInt8526 * 1769813785]);
		Class451.anInt4938 = (-1186258513 * class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1]);
		Class474.anInt5373 = (class665.anIntArray8525[1769813785 * class665.anInt8526 + 2] * 1073545189);
		Class695_Sub2.anInt10972 = (-922626445 * class665.anIntArray8525[class665.anInt8526 * 1769813785 + 3]);
		Class539.anInt7233 = (-2589149 * class665.anIntArray8525[1769813785 * class665.anInt8526 + 4]);
		Class317.anInt3531 = (89454335 * class665.anIntArray8525[5 + 1769813785 * class665.anInt8526]);
		Class637.anInt8318 = (-766478033 * class665.anIntArray8525[class665.anInt8526 * 1769813785 + 6]);
		Class171.anInt1882 = (-668568009 * class665.anIntArray8525[class665.anInt8526 * 1769813785 + 7]);
		Class156.anInt1720 = (-2067282123 * class665.anIntArray8525[8 + 1769813785 * class665.anInt8526]);
		Class296.anInt3385 = (class665.anIntArray8525[9 + 1769813785 * class665.anInt8526] * 1849958821);
		OutputStream_Sub1.anInt10987 = (class665.anIntArray8525[10 + 1769813785 * class665.anInt8526] * -309893661);
		Class711.anInt8856 = 801907655 * (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 11]);
		Class338.aClass459_3656.method7480(Class539.anInt7233 * -627367541, 10145325);
		Class338.aClass459_3656.method7480(-849737473 * Class317.anInt3531, 1401803695);
		Class338.aClass459_3656.method7480(Class637.anInt8318 * 1488678351, -1280029828);
		Class338.aClass459_3656.method7480(Class171.anInt1882 * -1403969657, -1532081278);
		Class338.aClass459_3656.method7480(Class156.anInt1720 * 644846365, 1272151233);
		Class338.aClass459_3656.method7480(Class711.anInt8856 * 725921271, 571941971);
		Class272.aClass459_3136.method7480(Class711.anInt8856 * 725921271, -1313600655);
		Class700_Sub27.aClass147_10907 = null;
		Class700_Sub16.aClass147_10856 = null;
		Class190.aClass147_2130 = null;
		Class640_Sub1_Sub1_Sub1.aClass147_11978 = null;
		Class35.aClass147_366 = null;
		Class39.aClass147_433 = null;
		Class218.aClass147_2285 = null;
		Class327_Sub2.aClass147_10052 = null;
		Class35.aBool365 = true;
	}
}
