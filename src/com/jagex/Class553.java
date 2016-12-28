/* Class553 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class553 {
	int anInt7417;
	public Class160[] aClass160Array7418;
	int anInt7419;
	int anInt7420;
	short[][] aShortArrayArray7421;
	Class167 aClass167_7422;
	byte[][] aByteArrayArray7423;
	boolean aBool7424;
	HashMap aHashMap7425;
	public Class544 aClass544_7426;
	public int anInt7427;
	public int anInt7428;
	int anInt7429 = 65134;
	public Class556[][][] aClass556ArrayArrayArray7430;
	public Class160[] aClass160Array7431;
	public Class556[][][] aClass556ArrayArrayArray7432;
	Class29 aClass29_7433;
	boolean aBool7434;
	int[] anIntArray7435;
	int[][] anIntArrayArray7436;
	public Class556[][][] aClass556ArrayArrayArray7437;
	byte[][] aByteArrayArray7438;
	Class649_Sub1[] aClass649_Sub1Array7439;
	byte[][] aByteArrayArray7440;
	Class649_Sub1[] aClass649_Sub1Array7441;
	int anInt7442;
	int anInt7443 = 10042;
	public int anInt7444;
	int anInt7445 = 5056;
	int anInt7446 = 5057;
	int anInt7447;
	Class649_Sub1[] aClass649_Sub1Array7448;
	int anInt7449;
	int anInt7450;
	int anInt7451;
	Class649_Sub1[] aClass649_Sub1Array7452;
	Class649_Sub1_Sub5[] aClass649_Sub1_Sub5Array7453;
	int anInt7454;
	int anInt7455;
	int anInt7456;
	int anInt7457;
	int anInt7458;
	public Class160[] aClass160Array7459;
	Class536_Sub19[] aClass536_Sub19Array7460;
	int anInt7461;
	int anInt7462;
	int anInt7463;
	public int anInt7464;
	int anInt7465;
	int anInt7466;
	float[] aFloatArray7467;
	byte[][] aByteArrayArray7468;
	public static boolean aBool7469 = true;
	static final int anInt7470 = 4;
	boolean[][] aBoolArrayArray7471;
	long[][][] aLongArrayArrayArray7472;
	Class562[] aClass562Array7473;
	boolean[] aBoolArray7474;
	HashMap aHashMap7475;
	int anInt7476;
	public Class564 aClass564_7477;
	boolean[][] aBoolArrayArray7478;
	Class649_Sub1[] aClass649_Sub1Array7479;
	int anInt7480 = 16;
	boolean[][] aBoolArrayArray7481;
	public static int anInt7482;

	public void method6694(int i, int i_0_) {
		/* empty */
	}

	public void method6695(Class184 class184, byte i) {
		/* empty */
	}

	public void method6696(int i) {
		for (int i_1_ = 0; i_1_ < 116201905 * anInt7442; i_1_++) {
			Class649_Sub1_Sub5 class649_sub1_sub5 = aClass649_Sub1_Sub5Array7453[i_1_];
			method6720(class649_sub1_sub5, true, -179796343);
			aClass649_Sub1_Sub5Array7453[i_1_] = null;
		}
		anInt7442 = 0;
	}

	public void method6697(int i) {
		for (int i_2_ = 0; i_2_ < anInt7428 * 937313339; i_2_++) {
			for (int i_3_ = 0; i_3_ < 1965060689 * anInt7464; i_3_++) {
				if (aClass556ArrayArrayArray7430[0][i_2_][i_3_] == null)
					aClass556ArrayArrayArray7430[0][i_2_][i_3_] = new Class556(0);
			}
		}
	}

	Class556 method6698(int i, int i_4_, int i_5_, byte i_6_) {
		return method6700(i, Math.min(937313339 * anInt7428 - 1, Math.max(0, i_4_)), Math.min(1965060689 * anInt7464 - 1, Math.max(0, i_5_)), -2097043021);
	}

	public void method6699(int i, int i_7_, int i_8_, byte i_9_) {
		boolean bool = (aClass556ArrayArrayArray7430[0][i_7_][i_8_] != null && null != (aClass556ArrayArrayArray7430[0][i_7_][i_8_].aClass556_7498));
		for (int i_10_ = i; i_10_ >= 0; i_10_--) {
			if (null == aClass556ArrayArrayArray7430[i_10_][i_7_][i_8_]) {
				Class556 class556 = (aClass556ArrayArrayArray7430[i_10_][i_7_][i_8_] = new Class556(i_10_));
				if (bool)
					class556.aByte7508++;
			}
		}
	}

	Class556 method6700(int i, int i_11_, int i_12_, int i_13_) {
		if (aClass556ArrayArrayArray7430[i][i_11_][i_12_] == null) {
			boolean bool = (aClass556ArrayArrayArray7430[0][i_11_][i_12_] != null && null != (aClass556ArrayArrayArray7430[0][i_11_][i_12_].aClass556_7498));
			if (bool && i >= 1091122111 * anInt7427 - 1)
				return null;
			method6699(i, i_11_, i_12_, (byte) 93);
		}
		return aClass556ArrayArrayArray7430[i][i_11_][i_12_];
	}

	public int method6701(int i, int i_14_, int i_15_) {
		return (null != aShortArrayArray7421 ? aShortArrayArray7421[i][i_14_] & 0xffff : 0);
	}

	public int method6702(int i, int i_16_, byte i_17_) {
		return (null != anIntArrayArray7436 ? anIntArrayArray7436[i][i_16_] & 0xffffff : 0);
	}

	public int method6703(int i, int i_18_, byte i_19_) {
		return (aByteArrayArray7438 != null ? aByteArrayArray7438[i][i_18_] & 0xff : 0);
	}

	public void method6704(int i, Class160 class160, int i_20_) {
		aClass160Array7431[i] = class160;
	}

	public int method6705(int i, int i_21_, byte i_22_) {
		return (aByteArrayArray7468 != null ? aByteArrayArray7468[i][i_21_] & 0xff : 0);
	}

	public void method6706(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, byte i_30_) {
		if (anIntArrayArray7436 != null)
			anIntArrayArray7436[i][i_23_] = ~0xffffff | i_24_;
		if (null != aShortArrayArray7421)
			aShortArrayArray7421[i][i_23_] = (short) i_25_;
		if (null != aByteArrayArray7438)
			aByteArrayArray7438[i][i_23_] = (byte) i_26_;
		if (null != aByteArrayArray7423)
			aByteArrayArray7423[i][i_23_] = (byte) i_27_;
		if (aByteArrayArray7440 != null)
			aByteArrayArray7440[i][i_23_] = (byte) i_28_;
		if (null != aByteArrayArray7468)
			aByteArrayArray7468[i][i_23_] = (byte) i_29_;
	}

	public void method6707(int i, int i_31_, int i_32_, Class649_Sub1_Sub2 class649_sub1_sub2, byte i_33_) {
		Class556 class556 = method6700(i, i_31_, i_32_, -1630418033);
		if (null != class556) {
			class556.aClass649_Sub1_Sub2_7503 = class649_sub1_sub2;
			int i_34_ = aClass160Array7418 == aClass160Array7431 ? 1 : 0;
			if (class649_sub1_sub2.method9974(2068192554)) {
				if (class649_sub1_sub2.method9942(-1017485918)) {
					class649_sub1_sub2.aClass649_Sub1_10837 = aClass649_Sub1Array7439[i_34_];
					aClass649_Sub1Array7439[i_34_] = class649_sub1_sub2;
				} else {
					class649_sub1_sub2.aClass649_Sub1_10837 = aClass649_Sub1Array7479[i_34_];
					aClass649_Sub1Array7479[i_34_] = class649_sub1_sub2;
				}
			} else {
				class649_sub1_sub2.aClass649_Sub1_10837 = aClass649_Sub1Array7448[i_34_];
				aClass649_Sub1Array7448[i_34_] = class649_sub1_sub2;
			}
		}
	}

	public void method6708(int i, int i_35_, int i_36_, int i_37_, Class649_Sub1_Sub1 class649_sub1_sub1, int i_38_) {
		Class556 class556 = method6700(i, i_35_, i_36_, -956247069);
		if (null != class556) {
			class649_sub1_sub1.method7841(new Class436((float) (-2019890215 * anInt7420 + (i_35_ << anInt7444 * 1893698405)), (float) i_37_, (float) (-2019890215 * anInt7420 + (i_36_ << anInt7444 * 1893698405))));
			class556.aClass649_Sub1_Sub1_7505 = class649_sub1_sub1;
			int i_39_ = aClass160Array7431 == aClass160Array7418 ? 1 : 0;
			if (class649_sub1_sub1.method9974(286985137)) {
				if (class649_sub1_sub1.method9942(-1359943386)) {
					class649_sub1_sub1.aClass649_Sub1_10837 = aClass649_Sub1Array7439[i_39_];
					aClass649_Sub1Array7439[i_39_] = class649_sub1_sub1;
				} else {
					class649_sub1_sub1.aClass649_Sub1_10837 = aClass649_Sub1Array7479[i_39_];
					aClass649_Sub1Array7479[i_39_] = class649_sub1_sub1;
				}
			} else {
				class649_sub1_sub1.aClass649_Sub1_10837 = aClass649_Sub1Array7448[i_39_];
				aClass649_Sub1Array7448[i_39_] = class649_sub1_sub1;
			}
		}
	}

	public void method6709() {
		for (int i = 0; i < anInt7428 * 937313339; i++) {
			for (int i_40_ = 0; i_40_ < 1965060689 * anInt7464; i_40_++) {
				if (aClass556ArrayArrayArray7430[0][i][i_40_] == null)
					aClass556ArrayArrayArray7430[0][i][i_40_] = new Class556(0);
			}
		}
	}

	public void method6710(int i, int i_41_, int i_42_, Class649_Sub1_Sub4 class649_sub1_sub4, Class649_Sub1_Sub4 class649_sub1_sub4_43_, int i_44_) {
		Class556 class556 = method6700(i, i_41_, i_42_, -774192734);
		if (null != class556) {
			class556.aClass649_Sub1_Sub4_7501 = class649_sub1_sub4;
			class556.aClass649_Sub1_Sub4_7502 = class649_sub1_sub4_43_;
			int i_45_ = aClass160Array7418 == aClass160Array7431 ? 1 : 0;
			if (class649_sub1_sub4.method9974(1774432255)) {
				if (class649_sub1_sub4.method9942(-1733735138)) {
					class649_sub1_sub4.aClass649_Sub1_10837 = aClass649_Sub1Array7439[i_45_];
					aClass649_Sub1Array7439[i_45_] = class649_sub1_sub4;
				} else {
					class649_sub1_sub4.aClass649_Sub1_10837 = aClass649_Sub1Array7479[i_45_];
					aClass649_Sub1Array7479[i_45_] = class649_sub1_sub4;
				}
			} else {
				class649_sub1_sub4.aClass649_Sub1_10837 = aClass649_Sub1Array7448[i_45_];
				aClass649_Sub1Array7448[i_45_] = class649_sub1_sub4;
			}
			if (null != class649_sub1_sub4_43_) {
				if (class649_sub1_sub4_43_.method9974(2018697413)) {
					if (class649_sub1_sub4_43_.method9942(-637114804)) {
						class649_sub1_sub4_43_.aClass649_Sub1_10837 = aClass649_Sub1Array7439[i_45_];
						aClass649_Sub1Array7439[i_45_] = class649_sub1_sub4_43_;
					} else {
						class649_sub1_sub4_43_.aClass649_Sub1_10837 = aClass649_Sub1Array7479[i_45_];
						aClass649_Sub1Array7479[i_45_] = class649_sub1_sub4_43_;
					}
				} else {
					class649_sub1_sub4_43_.aClass649_Sub1_10837 = aClass649_Sub1Array7448[i_45_];
					aClass649_Sub1Array7448[i_45_] = class649_sub1_sub4_43_;
				}
			}
		}
	}

	public boolean method6711(Class649_Sub1_Sub5 class649_sub1_sub5, boolean bool, int i) {
		boolean bool_46_ = aClass160Array7431 == aClass160Array7418;
		int i_47_ = 0;
		short i_48_ = 0;
		byte i_49_ = 0;
		class649_sub1_sub5.method10836((short) 9563);
		short i_50_ = 0;
		int i_51_ = Math.min(937313339 * anInt7428 - 1, Math.max(0, class649_sub1_sub5.aShort11867));
		int i_52_ = Math.min(anInt7428 * 937313339 - 1, Math.max(0, class649_sub1_sub5.aShort11864));
		int i_53_ = Math.min(anInt7464 * 1965060689 - 1, Math.max(0, class649_sub1_sub5.aShort11865));
		int i_54_ = Math.min(anInt7464 * 1965060689 - 1, Math.max(0, class649_sub1_sub5.aShort11870));
		for (int i_55_ = i_51_; i_55_ <= i_52_; i_55_++) {
			for (int i_56_ = i_53_; i_56_ <= i_54_; i_56_++) {
				Class556 class556 = method6698(class649_sub1_sub5.aByte10839, i_55_, i_56_, (byte) 4);
				if (null != class556) {
					Class552 class552 = Class479.method5822(class649_sub1_sub5, 1500301042);
					Class552 class552_57_ = class556.aClass552_7497;
					if (class552_57_ == null)
						class556.aClass552_7497 = class552;
					else {
						for (/**/; class552_57_.aClass552_7414 != null; class552_57_ = class552_57_.aClass552_7414) {
							/* empty */
						}
						class552_57_.aClass552_7414 = class552;
					}
					if (bool_46_ && 0 != (anIntArrayArray7436[i_55_][i_56_] & ~0xffffff)) {
						i_47_ = anIntArrayArray7436[i_55_][i_56_];
						i_48_ = aShortArrayArray7421[i_55_][i_56_];
						i_49_ = aByteArrayArray7438[i_55_][i_56_];
					}
					if (!bool && null != class556.aClass649_Sub1_Sub2_7503 && (class556.aClass649_Sub1_Sub2_7503.aShort11755 > i_50_))
						i_50_ = class556.aClass649_Sub1_Sub2_7503.aShort11755;
				}
			}
		}
		if (bool_46_ && (i_47_ & ~0xffffff) != 0) {
			for (int i_58_ = i_51_; i_58_ <= i_52_; i_58_++) {
				for (int i_59_ = i_53_; i_59_ <= i_54_; i_59_++) {
					if (0 == (anIntArrayArray7436[i_58_][i_59_] & ~0xffffff)) {
						anIntArrayArray7436[i_58_][i_59_] = i_47_;
						aShortArrayArray7421[i_58_][i_59_] = i_48_;
						aByteArrayArray7438[i_58_][i_59_] = i_49_;
					}
				}
			}
		}
		if (bool) {
			aClass649_Sub1_Sub5Array7453[(anInt7442 += -1896771759) * 116201905 - 1] = class649_sub1_sub5;
			class649_sub1_sub5.aClass553_10838 = this;
		} else {
			int i_60_ = aClass160Array7418 == aClass160Array7431 ? 1 : 0;
			if (class649_sub1_sub5.method9974(1191312172)) {
				if (class649_sub1_sub5.method9942(-607505404)) {
					class649_sub1_sub5.aClass649_Sub1_10837 = aClass649_Sub1Array7439[i_60_];
					aClass649_Sub1Array7439[i_60_] = class649_sub1_sub5;
				} else {
					class649_sub1_sub5.aClass649_Sub1_10837 = aClass649_Sub1Array7479[i_60_];
					aClass649_Sub1Array7479[i_60_] = class649_sub1_sub5;
				}
			} else {
				class649_sub1_sub5.aClass649_Sub1_10837 = aClass649_Sub1Array7448[i_60_];
				aClass649_Sub1Array7448[i_60_] = class649_sub1_sub5;
			}
		}
		if (bool) {
			Class436 class436 = Class436.method5240(class649_sub1_sub5.method7837().aClass436_4823);
			class436.aFloat4852 -= (float) i_50_;
			class649_sub1_sub5.method7841(class436);
			class436.method5239();
		}
		return true;
	}

	public void method6712(int i, int i_61_, int i_62_, int i_63_, byte i_64_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_61_][i_62_];
		if (class556 != null) {
			Class649_Sub1_Sub4 class649_sub1_sub4 = class556.aClass649_Sub1_Sub4_7501;
			Class649_Sub1_Sub4 class649_sub1_sub4_65_ = class556.aClass649_Sub1_Sub4_7502;
			if (class649_sub1_sub4 != null) {
				class649_sub1_sub4.aShort11823 = (short) (i_63_ * class649_sub1_sub4.aShort11823 / (16 << 1893698405 * anInt7444 - 7));
				class649_sub1_sub4.aShort11821 = (short) (class649_sub1_sub4.aShort11821 * i_63_ / (16 << anInt7444 * 1893698405 - 7));
			}
			if (null != class649_sub1_sub4_65_) {
				class649_sub1_sub4_65_.aShort11823 = (short) (class649_sub1_sub4_65_.aShort11823 * i_63_ / (16 << 1893698405 * anInt7444 - 7));
				class649_sub1_sub4_65_.aShort11821 = (short) (class649_sub1_sub4_65_.aShort11821 * i_63_ / (16 << anInt7444 * 1893698405 - 7));
			}
		}
	}

	public Class649_Sub1_Sub3 method6713(int i, int i_66_, int i_67_, int i_68_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_66_][i_67_];
		if (class556 != null) {
			method6721(class556.aClass649_Sub1_Sub3_7499, -1765487021);
			if (null != class556.aClass649_Sub1_Sub3_7499) {
				Class649_Sub1_Sub3 class649_sub1_sub3 = class556.aClass649_Sub1_Sub3_7499;
				class556.aClass649_Sub1_Sub3_7499 = null;
				return class649_sub1_sub3;
			}
		}
		return null;
	}

	public Class649_Sub1_Sub4 method6714(int i, int i_69_, int i_70_, byte i_71_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_69_][i_70_];
		if (null == class556)
			return null;
		return class556.aClass649_Sub1_Sub4_7501;
	}

	public Class649_Sub1_Sub4 method6715(int i, int i_72_, int i_73_, int i_74_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_72_][i_73_];
		if (null != class556) {
			method6721(class556.aClass649_Sub1_Sub4_7501, -1966318198);
			if (class556.aClass649_Sub1_Sub4_7501 != null) {
				Class649_Sub1_Sub4 class649_sub1_sub4 = class556.aClass649_Sub1_Sub4_7501;
				class556.aClass649_Sub1_Sub4_7501 = null;
				return class649_sub1_sub4;
			}
		}
		return null;
	}

	public Class649_Sub1_Sub3 method6716(int i, int i_75_, int i_76_, int i_77_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_75_][i_76_];
		if (null == class556)
			return null;
		return class556.aClass649_Sub1_Sub3_7499;
	}

	public Class649_Sub1_Sub2 method6717(int i, int i_78_, int i_79_, int i_80_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_78_][i_79_];
		if (class556 == null)
			return null;
		method6721(class556.aClass649_Sub1_Sub2_7503, -652784537);
		if (null != class556.aClass649_Sub1_Sub2_7503) {
			Class649_Sub1_Sub2 class649_sub1_sub2 = class556.aClass649_Sub1_Sub2_7503;
			class556.aClass649_Sub1_Sub2_7503 = null;
			return class649_sub1_sub2;
		}
		return null;
	}

	public Class649_Sub1_Sub1 method6718(int i, int i_81_, int i_82_, int i_83_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_81_][i_82_];
		if (class556 == null)
			return null;
		Class649_Sub1_Sub1 class649_sub1_sub1 = class556.aClass649_Sub1_Sub1_7505;
		class556.aClass649_Sub1_Sub1_7505 = null;
		method6721(class649_sub1_sub1, -1037299642);
		return class649_sub1_sub1;
	}

	public Class649_Sub1_Sub5 method6719(int i, int i_84_, int i_85_, Interface64 interface64, int i_86_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_84_][i_85_];
		if (class556 == null)
			return null;
		for (Class552 class552 = class556.aClass552_7497; class552 != null; class552 = class552.aClass552_7414) {
			Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
			if ((interface64 == null || interface64.method420(class649_sub1_sub5, 935902503)) && i_84_ == class649_sub1_sub5.aShort11867 && i_85_ == class649_sub1_sub5.aShort11865) {
				method6720(class649_sub1_sub5, false, -1467889368);
				return class649_sub1_sub5;
			}
		}
		return null;
	}

	void method6720(Class649_Sub1_Sub5 class649_sub1_sub5, boolean bool, int i) {
		int i_87_ = Math.min(anInt7428 * 937313339 - 1, Math.max(0, class649_sub1_sub5.aShort11867));
		int i_88_ = Math.min(anInt7428 * 937313339 - 1, Math.max(0, class649_sub1_sub5.aShort11864));
		int i_89_ = Math.min(anInt7464 * 1965060689 - 1, Math.max(0, class649_sub1_sub5.aShort11865));
		int i_90_ = Math.min(1965060689 * anInt7464 - 1, Math.max(0, class649_sub1_sub5.aShort11870));
		for (int i_91_ = i_87_; i_91_ <= i_88_; i_91_++) {
			for (int i_92_ = i_89_; i_92_ <= i_90_; i_92_++) {
				Class556 class556 = (aClass556ArrayArrayArray7430[class649_sub1_sub5.aByte10839][i_91_][i_92_]);
				if (class556 != null) {
					Class552 class552 = class556.aClass552_7497;
					Class552 class552_93_ = null;
					for (/**/; null != class552; class552 = class552.aClass552_7414) {
						if (class552.aClass649_Sub1_Sub5_7415 == class649_sub1_sub5) {
							if (null != class552_93_)
								class552_93_.aClass552_7414 = class552.aClass552_7414;
							else
								class556.aClass552_7497 = class552.aClass552_7414;
							class552.method6687(-720528421);
							break;
						}
						class552_93_ = class552;
					}
				}
			}
		}
		if (!bool)
			method6721(class649_sub1_sub5, -751028332);
	}

	void method6721(Class649_Sub1 class649_sub1, int i) {
		if (class649_sub1 != null) {
			class649_sub1.method7846();
			for (int i_94_ = 0; i_94_ < 2; i_94_++) {
				Class649_Sub1 class649_sub1_95_ = null;
				for (Class649_Sub1 class649_sub1_96_ = aClass649_Sub1Array7479[i_94_]; null != class649_sub1_96_; class649_sub1_96_ = class649_sub1_96_.aClass649_Sub1_10837) {
					if (class649_sub1 == class649_sub1_96_) {
						if (class649_sub1_95_ != null)
							class649_sub1_95_.aClass649_Sub1_10837 = class649_sub1_96_.aClass649_Sub1_10837;
						else
							aClass649_Sub1Array7479[i_94_] = class649_sub1_96_.aClass649_Sub1_10837;
						return;
					}
					class649_sub1_95_ = class649_sub1_96_;
				}
				class649_sub1_95_ = null;
				for (Class649_Sub1 class649_sub1_97_ = aClass649_Sub1Array7439[i_94_]; null != class649_sub1_97_; class649_sub1_97_ = class649_sub1_97_.aClass649_Sub1_10837) {
					if (class649_sub1 == class649_sub1_97_) {
						if (null != class649_sub1_95_)
							class649_sub1_95_.aClass649_Sub1_10837 = class649_sub1_97_.aClass649_Sub1_10837;
						else
							aClass649_Sub1Array7439[i_94_] = class649_sub1_97_.aClass649_Sub1_10837;
						return;
					}
					class649_sub1_95_ = class649_sub1_97_;
				}
				class649_sub1_95_ = null;
				for (Class649_Sub1 class649_sub1_98_ = aClass649_Sub1Array7448[i_94_]; null != class649_sub1_98_; class649_sub1_98_ = class649_sub1_98_.aClass649_Sub1_10837) {
					if (class649_sub1_98_ == class649_sub1) {
						if (class649_sub1_95_ != null)
							class649_sub1_95_.aClass649_Sub1_10837 = class649_sub1_98_.aClass649_Sub1_10837;
						else
							aClass649_Sub1Array7448[i_94_] = class649_sub1_98_.aClass649_Sub1_10837;
						return;
					}
					class649_sub1_95_ = class649_sub1_98_;
				}
			}
		}
	}

	public void method6722(int i) {
		/* empty */
	}

	public void method6723(Class562 class562, int i) {
		if (anInt7417 * 1051878761 < 65134) {
			Class536_Sub19 class536_sub19 = class562.aClass536_Sub19_7546;
			aClass562Array7473[1051878761 * anInt7417] = class562;
			aBoolArray7474[anInt7417 * 1051878761] = false;
			anInt7417 += 273971929;
			int i_99_ = class562.anInt7570 * -2071213659;
			if (class562.aBool7563)
				i_99_ = 0;
			int i_100_ = class562.anInt7570 * -2071213659;
			if (class562.aBool7569)
				i_100_ = anInt7427 * 1091122111 - 1;
			for (int i_101_ = i_99_; i_101_ <= i_100_; i_101_++) {
				int i_102_ = 0;
				int i_103_ = ((class536_sub19.method9551((byte) 0) - class536_sub19.method9530(-1810074246) + -2019890215 * anInt7420) >> anInt7444 * 1893698405);
				if (i_103_ < 0) {
					i_102_ -= i_103_;
					i_103_ = 0;
				}
				int i_104_ = ((class536_sub19.method9551((byte) 0) + class536_sub19.method9530(-957723410) - anInt7420 * -2019890215) >> anInt7444 * 1893698405);
				if (i_104_ >= 1965060689 * anInt7464)
					i_104_ = anInt7464 * 1965060689 - 1;
				for (int i_105_ = i_103_; i_105_ <= i_104_; i_105_++) {
					int i_106_ = class562.aShortArray7571[i_102_++];
					int i_107_ = (((class536_sub19.method9548(-458198416) - class536_sub19.method9530(1491324851) + -2019890215 * anInt7420) >> anInt7444 * 1893698405) + (i_106_ >>> 8));
					int i_108_ = i_107_ + (i_106_ & 0xff) - 1;
					if (i_107_ < 0)
						i_107_ = 0;
					if (i_108_ >= 937313339 * anInt7428)
						i_108_ = 937313339 * anInt7428 - 1;
					for (int i_109_ = i_107_; i_109_ <= i_108_; i_109_++) {
						long l = aLongArrayArrayArray7472[i_101_][i_109_][i_105_];
						if (0L == (l & 0xffffL))
							aLongArrayArrayArray7472[i_101_][i_109_][i_105_] = l | (long) (1051878761 * anInt7417);
						else if ((l & 0xffff0000L) == 0L)
							aLongArrayArrayArray7472[i_101_][i_109_][i_105_] = l | (long) (anInt7417 * 1051878761) << 16;
						else if ((l & 0xffff00000000L) == 0L)
							aLongArrayArrayArray7472[i_101_][i_109_][i_105_] = l | (long) (1051878761 * anInt7417) << 32;
						else if ((l & ~0xffffffffffffL) == 0L)
							aLongArrayArrayArray7472[i_101_][i_109_][i_105_] = l | (long) (anInt7417 * 1051878761) << 48;
					}
				}
			}
			if (-1 != class562.anInt7565 * -246978873) {
				List list = ((List) aHashMap7475.get(Integer.valueOf(class562.anInt7565 * -246978873)));
				if (list == null) {
					list = new ArrayList();
					aHashMap7475.put(Integer.valueOf(-246978873 * class562.anInt7565), list);
				}
				list.add(class562);
				Class536_Sub19 class536_sub19_110_ = ((Class536_Sub19) aHashMap7425.get(Integer.valueOf(-246978873 * (class562.anInt7565))));
				if (class536_sub19_110_ != null) {
					class562.aClass536_Sub19_7546.method9534(class536_sub19_110_.method9528(-141439729), -930674328);
					class562.aClass536_Sub19_7546.method9535(class536_sub19_110_.method9533(-1699877898), class536_sub19_110_.method9553(1739410475), (short) 27771);
				}
			}
		}
	}

	public void method6724(int i) {
		/* empty */
	}

	public Class552 method6725(int i, int i_111_, int i_112_, int i_113_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_111_][i_112_];
		if (class556 == null)
			return null;
		return class556.aClass552_7497;
	}

	public Class649_Sub1_Sub2 method6726(int i, int i_114_, int i_115_, int i_116_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_114_][i_115_];
		if (class556 == null || class556.aClass649_Sub1_Sub2_7503 == null)
			return null;
		return class556.aClass649_Sub1_Sub2_7503;
	}

	public void method6727() {
		for (int i = 0; i < anInt7427 * 1091122111; i++) {
			for (int i_117_ = 0; i_117_ < 937313339 * anInt7428; i_117_++) {
				for (int i_118_ = 0; i_118_ < 1965060689 * anInt7464; i_118_++) {
					Class556 class556 = aClass556ArrayArrayArray7430[i][i_117_][i_118_];
					if (null != class556) {
						Class649_Sub1_Sub3 class649_sub1_sub3 = class556.aClass649_Sub1_Sub3_7499;
						Class649_Sub1_Sub3 class649_sub1_sub3_119_ = class556.aClass649_Sub1_Sub3_7500;
						if (class649_sub1_sub3 != null && class649_sub1_sub3.method9940(2051831491)) {
							method6729(class649_sub1_sub3, i, i_117_, i_118_, 1, 1);
							if (class649_sub1_sub3_119_ != null && class649_sub1_sub3_119_.method9940(-1687060564)) {
								method6729(class649_sub1_sub3_119_, i, i_117_, i_118_, 1, 1);
								class649_sub1_sub3_119_.method9943(aClass167_7422, class649_sub1_sub3, 0, 0, 0, false, -2103729264);
								class649_sub1_sub3_119_.method9986(587480687);
							}
							class649_sub1_sub3.method9986(1407971176);
						}
						for (Class552 class552 = class556.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
							Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
							if (null != class649_sub1_sub5 && class649_sub1_sub5.method9940(-59087989)) {
								method6729(class649_sub1_sub5, i, i_117_, i_118_, (class649_sub1_sub5.aShort11864 - class649_sub1_sub5.aShort11867 + 1), (class649_sub1_sub5.aShort11870 - class649_sub1_sub5.aShort11865 + 1));
								class649_sub1_sub5.method9986(301404396);
							}
						}
						Class649_Sub1_Sub2 class649_sub1_sub2 = class556.aClass649_Sub1_Sub2_7503;
						if (class649_sub1_sub2 != null && class649_sub1_sub2.method9940(692280122)) {
							method6728(class649_sub1_sub2, i, i_117_, i_118_, 1656057648);
							class649_sub1_sub2.method9986(-648952782);
						}
					}
				}
			}
		}
	}

	void method6728(Class649_Sub1 class649_sub1, int i, int i_120_, int i_121_, int i_122_) {
		if (i_120_ < anInt7428 * 937313339) {
			Class556 class556 = aClass556ArrayArrayArray7430[i][i_120_ + 1][i_121_];
			if (null != class556 && null != class556.aClass649_Sub1_Sub2_7503 && class556.aClass649_Sub1_Sub2_7503.method9940(-696718730)) {
				int i_123_ = ((aClass160Array7431[i].method1927(1 + i_120_, i_121_, 667821239) + aClass160Array7431[i].method1927(1 + (1 + i_120_), i_121_, -1353959371) + aClass160Array7431[i].method1927(1 + i_120_, i_121_ + 1, -757349309) + aClass160Array7431[i].method1927(1 + i_120_ + 1, 1 + i_121_, 1406901290)) / 4
						- (aClass160Array7431[i].method1927(i_120_, i_121_, -1959265339) + aClass160Array7431[i].method1927(1 + i_120_, i_121_, -1255089837) + aClass160Array7431[i].method1927(i_120_, 1 + i_121_, 1779647913) + aClass160Array7431[i].method1927(i_120_ + 1, i_121_ + 1, 11813382)) / 4);
				class649_sub1.method9943(aClass167_7422, class556.aClass649_Sub1_Sub2_7503, anInt7419 * 327297877, i_123_, 0, true, -1559501055);
			}
		}
		if (i_121_ < 937313339 * anInt7428) {
			Class556 class556 = aClass556ArrayArrayArray7430[i][i_120_][1 + i_121_];
			if (class556 != null && null != class556.aClass649_Sub1_Sub2_7503 && class556.aClass649_Sub1_Sub2_7503.method9940(1721393529)) {
				int i_124_ = ((aClass160Array7431[i].method1927(i_120_, i_121_, -2023975015) + aClass160Array7431[i].method1927(i_120_ + 1, i_121_ + 1, 245328350) + aClass160Array7431[i].method1927(i_120_, 1 + i_121_ + 1, -666652195) + aClass160Array7431[i].method1927(i_120_ + 1, 1 + (1 + i_121_), -1165439592)) / 4
						- (aClass160Array7431[i].method1927(i_120_, i_121_, 588190619) + aClass160Array7431[i].method1927(i_120_ + 1, i_121_, 531638239) + aClass160Array7431[i].method1927(i_120_, 1 + i_121_, -1011162065) + aClass160Array7431[i].method1927(i_120_ + 1, i_121_ + 1, 826884885)) / 4);
				class649_sub1.method9943(aClass167_7422, class556.aClass649_Sub1_Sub2_7503, 0, i_124_, 327297877 * anInt7419, true, -2128105935);
			}
		}
		if (i_120_ < anInt7428 * 937313339 && i_121_ < 1965060689 * anInt7464) {
			Class556 class556 = aClass556ArrayArrayArray7430[i][i_120_ + 1][i_121_ + 1];
			if (null != class556 && class556.aClass649_Sub1_Sub2_7503 != null && class556.aClass649_Sub1_Sub2_7503.method9940(723548536)) {
				int i_125_ = ((aClass160Array7431[i].method1927(1 + i_120_, 1 + i_121_, -52747906) + aClass160Array7431[i].method1927(i_120_ + 1 + 1, i_121_ + 1, 1527781425) + aClass160Array7431[i].method1927(1 + i_120_, 1 + (1 + i_121_), 1804624702) + aClass160Array7431[i].method1927(i_120_ + 1 + 1, i_121_ + 1 + 1, 508430975)) / 4
						- (aClass160Array7431[i].method1927(i_120_, i_121_, 1359184714) + aClass160Array7431[i].method1927(i_120_ + 1, i_121_, 1747259518) + aClass160Array7431[i].method1927(i_120_, 1 + i_121_, 1959885558) + aClass160Array7431[i].method1927(i_120_ + 1, i_121_ + 1, -462251609)) / 4);
				class649_sub1.method9943(aClass167_7422, class556.aClass649_Sub1_Sub2_7503, anInt7419 * 327297877, i_125_, 327297877 * anInt7419, true, -1695200274);
			}
		}
		if (i_120_ < anInt7428 * 937313339 && i_121_ > 0) {
			Class556 class556 = aClass556ArrayArrayArray7430[i][i_120_ + 1][i_121_ - 1];
			if (class556 != null && null != class556.aClass649_Sub1_Sub2_7503 && class556.aClass649_Sub1_Sub2_7503.method9940(633788634)) {
				int i_126_ = ((aClass160Array7431[i].method1927(i_120_ + 1, i_121_ - 1, 1863697751) + aClass160Array7431[i].method1927(1 + i_120_ + 1, i_121_ - 1, -504823487) + aClass160Array7431[i].method1927(1 + i_120_, i_121_ + 1 - 1, -2091477351) + aClass160Array7431[i].method1927(1 + (1 + i_120_), i_121_ + 1 - 1, 1427856944)) / 4
						- ((aClass160Array7431[i].method1927(i_120_, i_121_, -2072299446) + aClass160Array7431[i].method1927(1 + i_120_, i_121_, -702251067) + aClass160Array7431[i].method1927(i_120_, i_121_ + 1, 1915345586) + aClass160Array7431[i].method1927(1 + i_120_, 1 + i_121_, -1806768243)) / 4));
				class649_sub1.method9943(aClass167_7422, class556.aClass649_Sub1_Sub2_7503, anInt7419 * 327297877, i_126_, -(anInt7419 * 327297877), true, -1109011053);
			}
		}
	}

	void method6729(Class649_Sub1 class649_sub1, int i, int i_127_, int i_128_, int i_129_, int i_130_) {
		boolean bool = true;
		int i_131_ = i_127_;
		int i_132_ = i_127_ + i_129_;
		int i_133_ = i_128_ - 1;
		int i_134_ = i_128_ + i_130_;
		for (int i_135_ = i; i_135_ <= i + 1; i_135_++) {
			if (1091122111 * anInt7427 != i_135_) {
				for (int i_136_ = i_131_; i_136_ <= i_132_; i_136_++) {
					if (i_136_ >= 0 && i_136_ < 937313339 * anInt7428) {
						for (int i_137_ = i_133_; i_137_ <= i_134_; i_137_++) {
							if (i_137_ >= 0 && i_137_ < anInt7464 * 1965060689 && (!bool || i_136_ >= i_132_ || i_137_ >= i_134_ || i_137_ < i_128_ && i_136_ != i_127_)) {
								Class556 class556 = (aClass556ArrayArrayArray7430[i_135_][i_136_][i_137_]);
								if (null != class556) {
									int i_138_ = (((aClass160Array7431[i_135_].method1927(i_136_, i_137_, -428922086)) + (aClass160Array7431[i_135_].method1927(i_136_ + 1, i_137_, 2041614371)) + (aClass160Array7431[i_135_].method1927(i_136_, i_137_ + 1, -1805189343)) + (aClass160Array7431[i_135_].method1927(1 + i_136_, 1 + i_137_, 856314112))) / 4
											- ((aClass160Array7431[i].method1927(i_127_, i_128_, -356358899)) + (aClass160Array7431[i].method1927(1 + i_127_, i_128_, 1936174919)) + (aClass160Array7431[i].method1927(i_127_, 1 + i_128_, -1669568235)) + (aClass160Array7431[i].method1927(i_127_ + 1, 1 + i_128_, 1408822171))) / 4);
									Class649_Sub1_Sub3 class649_sub1_sub3 = class556.aClass649_Sub1_Sub3_7499;
									Class649_Sub1_Sub3 class649_sub1_sub3_139_ = class556.aClass649_Sub1_Sub3_7500;
									if (class649_sub1_sub3 != null && class649_sub1_sub3.method9940(-173373957))
										class649_sub1.method9943(aClass167_7422, class649_sub1_sub3, ((i_136_ - i_127_) * (327297877 * anInt7419) + (anInt7420 * -2019890215 * (1 - i_129_))), i_138_, ((-2019890215 * anInt7420 * (1 - i_130_)) + ((i_137_ - i_128_) * (anInt7419 * 327297877))), bool, -951576561);
									if (null != class649_sub1_sub3_139_ && class649_sub1_sub3_139_.method9940(908840130))
										class649_sub1.method9943(aClass167_7422, class649_sub1_sub3_139_, ((i_136_ - i_127_) * (anInt7419 * 327297877) + (-2019890215 * anInt7420 * (1 - i_129_))), i_138_, ((1 - i_130_) * (-2019890215 * anInt7420) + ((i_137_ - i_128_) * (327297877 * anInt7419))), bool, -1981493183);
									for (Class552 class552 = class556.aClass552_7497; class552 != null; class552 = class552.aClass552_7414) {
										Class649_Sub1_Sub5 class649_sub1_sub5 = (class552.aClass649_Sub1_Sub5_7415);
										if (class649_sub1_sub5 != null && class649_sub1_sub5.method9940(1747774756) && ((class649_sub1_sub5.aShort11867 == i_136_) || i_131_ == i_136_) && ((class649_sub1_sub5.aShort11865 == i_137_) || i_137_ == i_133_)) {
											int i_140_ = 1 + ((class649_sub1_sub5.aShort11864) - (class649_sub1_sub5.aShort11867));
											int i_141_ = 1 + ((class649_sub1_sub5.aShort11870) - (class649_sub1_sub5.aShort11865));
											class649_sub1.method9943(aClass167_7422, class649_sub1_sub5, ((((class649_sub1_sub5.aShort11867) - i_127_) * (anInt7419 * 327297877)) + (anInt7420 * -2019890215 * (i_140_ - i_129_))), i_138_, ((327297877 * anInt7419 * ((class649_sub1_sub5.aShort11865) - i_128_)) + (-2019890215 * anInt7420 * (i_141_ - i_130_))), bool, -1988093187);
										}
									}
								}
							}
						}
					}
				}
				i_131_--;
				bool = false;
			}
		}
	}

	public void method6730(int i, int i_142_, int i_143_, int i_144_, byte[][][] is, int[] is_145_, int[] is_146_, int[] is_147_, int[] is_148_, int[] is_149_, int i_150_, byte i_151_, int i_152_, int i_153_, boolean bool, boolean bool_154_, int i_155_, boolean bool_156_) {
		aClass544_7426.aBool7238 = true;
		aBool7434 = bool_154_;
		anInt7454 = (i_142_ >> 1893698405 * anInt7444) * -398952257;
		anInt7455 = (i_144_ >> 1893698405 * anInt7444) * -1945529199;
		anInt7456 = -2036838349 * i_142_;
		anInt7457 = 134781913 * i_144_;
		anInt7458 = -2132789719 * i_143_;
		anInt7463 = 2011118987 * anInt7454 - anInt7447 * 539374129;
		if (-944518243 * anInt7463 < 0) {
			anInt7461 = -(-311947639 * anInt7463);
			anInt7463 = 0;
		} else
			anInt7461 = 0;
		anInt7465 = -43413139 * anInt7455 - anInt7447 * 965106329;
		if (-1217255275 * anInt7465 < 0) {
			anInt7462 = -(anInt7465 * 100596127);
			anInt7465 = 0;
		} else
			anInt7462 = 0;
		anInt7466 = -282930709 * anInt7454 + anInt7447 * 27668817;
		if (1396049661 * anInt7466 > anInt7428 * 937313339)
			anInt7466 = -1549121129 * anInt7428;
		anInt7451 = anInt7447 * 1560809911 + anInt7455 * 1139255075;
		if (-816291493 * anInt7451 > anInt7464 * 1965060689)
			anInt7451 = anInt7464 * 1820524227;
		boolean[][] bools = aBoolArrayArray7471;
		boolean[][] bools_157_ = aBoolArrayArray7478;
		if (aBool7434) {
			for (int i_158_ = 0; i_158_ < 813474573 * anInt7447 + 813474573 * anInt7447 + 2; i_158_++) {
				int i_159_ = 0;
				int i_160_ = 0;
				for (int i_161_ = 0; (i_161_ < 2 + (813474573 * anInt7447 + 813474573 * anInt7447)); i_161_++) {
					if (i_161_ > 1)
						anIntArray7435[i_161_ - 2] = i_159_;
					i_159_ = i_160_;
					int i_162_ = (-1629030593 * anInt7454 - 813474573 * anInt7447 + i_158_);
					int i_163_ = (-1430999951 * anInt7455 - anInt7447 * 813474573 + i_161_);
					if (i_162_ >= 0 && i_163_ >= 0 && i_162_ < 937313339 * anInt7428 && i_163_ < 1965060689 * anInt7464) {
						int i_164_ = i_162_ << anInt7444 * 1893698405;
						int i_165_ = i_163_ << anInt7444 * 1893698405;
						int i_166_ = (aClass160Array7459[aClass160Array7459.length - 1].method1927(i_162_, i_163_, -472653894) - (1000 << anInt7444 * 1893698405 - 7));
						int i_167_ = ((aClass160Array7418 != null ? (aClass160Array7418[0].method1927(i_162_, i_163_, -1402069781) + 327297877 * anInt7419) : (aClass160Array7459[0].method1927(i_162_, i_163_, -1665825523) + anInt7419 * 327297877)) + (1000 << anInt7444 * 1893698405 - 7));
						i_160_ = aClass167_7422.method2262(i_164_, i_166_, i_165_, i_164_, i_167_, i_165_);
						aBoolArrayArray7478[i_158_][i_161_] = i_160_ == 0;
					} else {
						i_160_ = -1;
						aBoolArrayArray7478[i_158_][i_161_] = false;
					}
					if (i_158_ > 0 && i_161_ > 0) {
						int i_168_ = (anIntArray7435[i_161_ - 1] & anIntArray7435[i_161_] & i_159_ & i_160_);
						aBoolArrayArray7471[i_158_ - 1][i_161_ - 1] = 0 == i_168_;
					}
				}
				anIntArray7435[anInt7447 * 813474573 + 813474573 * anInt7447] = i_159_;
				anIntArray7435[(anInt7447 * 813474573 + 813474573 * anInt7447 + 1)] = i_160_;
			}
			if (!bool_156_)
				aClass544_7426.aBool7238 = false;
			else {
				aClass544_7426.anIntArray7256 = is_145_;
				aClass544_7426.anIntArray7267 = is_146_;
				aClass544_7426.anIntArray7264 = is_147_;
				aClass544_7426.anIntArray7259 = is_148_;
				aClass544_7426.anIntArray7260 = is_149_;
				aClass544_7426.method6603(aClass167_7422, i_150_);
			}
		} else {
			if (aBoolArrayArray7481 == null)
				aBoolArrayArray7481 = (new boolean[813474573 * anInt7447 + 813474573 * anInt7447 + 2][2 + (813474573 * anInt7447 + 813474573 * anInt7447)]);
			for (int i_169_ = 0; i_169_ < aBoolArrayArray7481.length; i_169_++) {
				for (int i_170_ = 0; i_170_ < aBoolArrayArray7481[0].length; i_170_++)
					aBoolArrayArray7481[i_169_][i_170_] = true;
			}
			aBoolArrayArray7478 = aBoolArrayArray7481;
			aBoolArrayArray7471 = aBoolArrayArray7481;
			anInt7463 = 0;
			anInt7465 = 0;
			anInt7466 = anInt7428 * -1549121129;
			anInt7451 = anInt7464 * 1820524227;
			aClass544_7426.aBool7238 = false;
		}
		Class387.method4846(this, aClass167_7422, 1689406261);
		if (!aClass564_7477.aBool7584) {
			Iterator iterator = aClass564_7477.aList7586.iterator();
			while (iterator.hasNext()) {
				Class563 class563 = (Class563) iterator.next();
				iterator.remove();
				Class97.method1316(class563, 1744455527);
			}
		}
		if (aBool7424) {
			for (int i_171_ = 0; i_171_ < 1051878761 * anInt7417; i_171_++)
				aClass562Array7473[i_171_].method6855(i, bool, (byte) -72);
		}
		if (aClass556ArrayArrayArray7437 != null) {
			method6763(true, -141980575);
			aClass167_7422.method2127(-1, new Class175(1583160, 40, 127, 63, 0, 0, 0));
			method6731(true, is, i_150_, i_151_, i_155_);
			aClass167_7422.method2074();
			method6763(false, 979525639);
		}
		method6731(false, is, i_150_, i_151_, i_155_);
		if (!aBool7434) {
			aBoolArrayArray7471 = bools;
			aBoolArrayArray7478 = bools_157_;
		}
	}

	void method6731(boolean bool, byte[][][] is, int i, byte i_172_, int i_173_) {
		int i_174_ = bool ? 1 : 0;
		anInt7449 = 0;
		anInt7450 = 0;
		anInt7476 += -751402837;
		if (0 == (i_173_ & 0x2)) {
			for (Class649_Sub1 class649_sub1 = aClass649_Sub1Array7479[i_174_]; class649_sub1 != null; class649_sub1 = class649_sub1.aClass649_Sub1_10837) {
				method6748(class649_sub1, -1576894845);
				if (-1 != 1477898525 * class649_sub1.anInt10841 && !method6734(class649_sub1, bool, is, i, i_172_))
					aClass649_Sub1Array7452[(anInt7449 += 895538047) * -452793217 - 1] = class649_sub1;
			}
		}
		if ((i_173_ & 0x1) == 0) {
			for (Class649_Sub1 class649_sub1 = aClass649_Sub1Array7439[i_174_]; null != class649_sub1; class649_sub1 = class649_sub1.aClass649_Sub1_10837) {
				method6748(class649_sub1, -1961535314);
				if (class649_sub1.anInt10841 * 1477898525 != -1 && !method6734(class649_sub1, bool, is, i, i_172_))
					aClass649_Sub1Array7441[(anInt7450 += 1648444637) * -95833227 - 1] = class649_sub1;
			}
			for (Class649_Sub1 class649_sub1 = aClass649_Sub1Array7448[i_174_]; null != class649_sub1; class649_sub1 = class649_sub1.aClass649_Sub1_10837) {
				method6748(class649_sub1, -83559523);
				if (class649_sub1.anInt10841 * 1477898525 != -1 && !method6734(class649_sub1, bool, is, i, i_172_)) {
					if (class649_sub1.method9942(-1408445959))
						aClass649_Sub1Array7441[(anInt7450 += 1648444637) * -95833227 - 1] = class649_sub1;
					else
						aClass649_Sub1Array7452[(anInt7449 += 895538047) * -452793217 - 1] = class649_sub1;
				}
			}
			if (!bool) {
				for (int i_175_ = 0; i_175_ < anInt7442 * 116201905; i_175_++) {
					method6748(aClass649_Sub1_Sub5Array7453[i_175_], -1001246979);
					if (1477898525 * (aClass649_Sub1_Sub5Array7453[i_175_].anInt10841) != -1 && !method6734(aClass649_Sub1_Sub5Array7453[i_175_], bool, is, i, i_172_)) {
						if (aClass649_Sub1_Sub5Array7453[i_175_].method9942(-1952544859))
							aClass649_Sub1Array7441[(anInt7450 += 1648444637) * -95833227 - 1] = aClass649_Sub1_Sub5Array7453[i_175_];
						else
							aClass649_Sub1Array7452[(anInt7449 += 895538047) * -452793217 - 1] = aClass649_Sub1_Sub5Array7453[i_175_];
					}
				}
			}
		}
		if (anInt7449 * -452793217 > 0) {
			method6733(aClass649_Sub1Array7452, 0, anInt7449 * -452793217 - 1);
			for (int i_176_ = 0; i_176_ < anInt7449 * -452793217; i_176_++)
				method6749(aClass649_Sub1Array7452[i_176_], aClass536_Sub19Array7460);
		}
		if (aBool7424)
			aClass167_7422.method2110(0, null);
		if ((i_173_ & 0x2) == 0) {
			for (int i_177_ = 0; i_177_ < 1091122111 * anInt7427; i_177_++) {
				if (i_177_ >= i && null != is) {
					int i_178_ = aBoolArrayArray7471.length;
					if (-944518243 * anInt7463 + aBoolArrayArray7471.length > anInt7428 * 937313339)
						i_178_ -= (anInt7463 * -944518243 + aBoolArrayArray7471.length - 937313339 * anInt7428);
					int i_179_ = aBoolArrayArray7471[0].length;
					if (aBoolArrayArray7471[0].length + anInt7465 * -1217255275 > 1965060689 * anInt7464)
						i_179_ -= (aBoolArrayArray7471[0].length + anInt7465 * -1217255275 - anInt7464 * 1965060689);
					boolean[][] bools = aBoolArrayArray7478;
					if (aBool7434) {
						for (int i_180_ = -97898635 * anInt7461; i_180_ < i_178_; i_180_++) {
							int i_181_ = (-944518243 * anInt7463 + i_180_ - -97898635 * anInt7461);
							for (int i_182_ = anInt7462 * -1592682165; i_182_ < i_179_; i_182_++) {
								bools[i_180_][i_182_] = false;
								if (aBoolArrayArray7471[i_180_][i_182_]) {
									int i_183_ = (-1217255275 * anInt7465 + i_182_ - anInt7462 * -1592682165);
									for (int i_184_ = i_177_; i_184_ >= 0; i_184_--) {
										if ((null != (aClass556ArrayArrayArray7430[i_184_][i_181_][i_183_])) && (i_177_ == (aClass556ArrayArrayArray7430[i_184_][i_181_][i_183_].aByte7508))) {
											if ((i_184_ >= i && i_172_ == (is[i_184_][i_181_][i_183_])) || (aClass544_7426.method6601(i_177_, i_181_, i_183_)))
												bools[i_180_][i_182_] = false;
											else
												bools[i_180_][i_182_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass160Array7431[i_177_].method1923(-1629030593 * anInt7454, anInt7455 * -1430999951, 813474573 * anInt7447, aBoolArrayArray7478, false, i_173_);
				} else {
					int i_185_ = aBoolArrayArray7471.length;
					if (aBoolArrayArray7471.length + anInt7463 * -944518243 > anInt7428 * 937313339)
						i_185_ -= (aBoolArrayArray7471.length + -944518243 * anInt7463 - anInt7428 * 937313339);
					int i_186_ = aBoolArrayArray7471[0].length;
					if (aBoolArrayArray7471[0].length + -1217255275 * anInt7465 > anInt7464 * 1965060689)
						i_186_ -= (anInt7465 * -1217255275 + aBoolArrayArray7471[0].length - 1965060689 * anInt7464);
					boolean[][] bools = aBoolArrayArray7478;
					if (aBool7434) {
						for (int i_187_ = anInt7461 * -97898635; i_187_ < i_185_; i_187_++) {
							int i_188_ = (-944518243 * anInt7463 + i_187_ - anInt7461 * -97898635);
							for (int i_189_ = anInt7462 * -1592682165; i_189_ < i_186_; i_189_++) {
								if (aBoolArrayArray7471[i_187_][i_189_] && !(aClass544_7426.method6601(i_177_, i_188_, (anInt7465 * -1217255275 + i_189_ - anInt7462 * -1592682165))))
									bools[i_187_][i_189_] = true;
								else
									bools[i_187_][i_189_] = false;
							}
						}
					}
					aClass160Array7431[i_177_].method1923(-1629030593 * anInt7454, -1430999951 * anInt7455, anInt7447 * 813474573, aBoolArrayArray7478, true, i_173_);
				}
			}
		}
		if (-95833227 * anInt7450 > 0) {
			method6732(aClass649_Sub1Array7441, 0, anInt7450 * -95833227 - 1);
			for (int i_190_ = 0; i_190_ < anInt7450 * -95833227; i_190_++)
				method6749(aClass649_Sub1Array7441[i_190_], aClass536_Sub19Array7460);
		}
	}

	void method6732(Class649_Sub1[] class649_sub1s, int i, int i_191_) {
		if (i < i_191_) {
			int i_192_ = (i_191_ + i) / 2;
			int i_193_ = i;
			Class649_Sub1 class649_sub1 = class649_sub1s[i_192_];
			class649_sub1s[i_192_] = class649_sub1s[i_191_];
			class649_sub1s[i_191_] = class649_sub1;
			int i_194_ = 1477898525 * class649_sub1.anInt10841;
			for (int i_195_ = i; i_195_ < i_191_; i_195_++) {
				if (1477898525 * class649_sub1s[i_195_].anInt10841 > (i_195_ & 0x1) + i_194_) {
					Class649_Sub1 class649_sub1_196_ = class649_sub1s[i_195_];
					class649_sub1s[i_195_] = class649_sub1s[i_193_];
					class649_sub1s[i_193_++] = class649_sub1_196_;
				}
			}
			class649_sub1s[i_191_] = class649_sub1s[i_193_];
			class649_sub1s[i_193_] = class649_sub1;
			method6732(class649_sub1s, i, i_193_ - 1);
			method6732(class649_sub1s, i_193_ + 1, i_191_);
		}
	}

	void method6733(Class649_Sub1[] class649_sub1s, int i, int i_197_) {
		if (i < i_197_) {
			int i_198_ = (i + i_197_) / 2;
			int i_199_ = i;
			Class649_Sub1 class649_sub1 = class649_sub1s[i_198_];
			class649_sub1s[i_198_] = class649_sub1s[i_197_];
			class649_sub1s[i_197_] = class649_sub1;
			int i_200_ = 1477898525 * class649_sub1.anInt10841;
			for (int i_201_ = i; i_201_ < i_197_; i_201_++) {
				if (class649_sub1s[i_201_].anInt10841 * 1477898525 < (i_201_ & 0x1) + i_200_) {
					Class649_Sub1 class649_sub1_202_ = class649_sub1s[i_201_];
					class649_sub1s[i_201_] = class649_sub1s[i_199_];
					class649_sub1s[i_199_++] = class649_sub1_202_;
				}
			}
			class649_sub1s[i_197_] = class649_sub1s[i_199_];
			class649_sub1s[i_199_] = class649_sub1;
			method6733(class649_sub1s, i, i_199_ - 1);
			method6733(class649_sub1s, i_199_ + 1, i_197_);
		}
	}

	boolean method6734(Class649_Sub1 class649_sub1, boolean bool, byte[][][] is, int i, byte i_203_) {
		if (!aBool7434)
			return false;
		if (class649_sub1 instanceof Class649_Sub1_Sub5) {
			int i_204_ = ((Class649_Sub1_Sub5) class649_sub1).aShort11864;
			int i_205_ = ((Class649_Sub1_Sub5) class649_sub1).aShort11870;
			int i_206_ = ((Class649_Sub1_Sub5) class649_sub1).aShort11867;
			int i_207_ = ((Class649_Sub1_Sub5) class649_sub1).aShort11865;
			for (int i_208_ = i_206_; i_208_ <= i_204_; i_208_++) {
				for (int i_209_ = i_207_; i_209_ <= i_205_; i_209_++) {
					if (class649_sub1.aByte10840 < anInt7427 * 1091122111 && i_208_ >= anInt7463 * -944518243 && i_208_ < anInt7466 * 1396049661 && i_209_ >= -1217255275 * anInt7465 && i_209_ < anInt7451 * -816291493) {
						if ((is != null && class649_sub1.aByte10839 >= i && (is[class649_sub1.aByte10839][i_208_][i_209_] == i_203_)) || !class649_sub1.method9949(-2117265773) || class649_sub1.method9948(aClass167_7422, -25652654)) {
							if (!bool && i_208_ >= anInt7454 * -1629030593 - 16 && i_208_ <= -1629030593 * anInt7454 + 16 && i_209_ >= anInt7455 * -1430999951 - 16 && i_209_ <= -1430999951 * anInt7455 + 16)
								class649_sub1.method9945(aClass167_7422, -1949762614);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Class436 class436 = class649_sub1.method7837().aClass436_4823;
		int i_210_ = (int) class436.aFloat4850 >> 1893698405 * anInt7444;
		int i_211_ = (int) class436.aFloat4853 >> anInt7444 * 1893698405;
		if (class649_sub1.aByte10840 < 1091122111 * anInt7427 && i_210_ >= -944518243 * anInt7463 && i_210_ < 1396049661 * anInt7466 && i_211_ >= anInt7465 * -1217255275 && i_211_ < -816291493 * anInt7451) {
			if ((null != is && class649_sub1.aByte10839 >= i && is[class649_sub1.aByte10839][i_210_][i_211_] == i_203_) || !class649_sub1.method9949(-1330965954) || class649_sub1.method9948(aClass167_7422, -1347808388)) {
				if (!bool && i_210_ >= -1629030593 * anInt7454 - 16 && i_210_ <= anInt7454 * -1629030593 + 16 && i_211_ >= -1430999951 * anInt7455 - 16 && i_211_ <= -1430999951 * anInt7455 + 16)
					class649_sub1.method9945(aClass167_7422, -1949762614);
				return true;
			}
			return false;
		}
		return true;
	}

	void method6735(int i, int i_212_, int i_213_) {
		Class536_Sub18_Sub7 class536_sub18_sub7 = null;
		for (int i_214_ = i; i_214_ < i_212_; i_214_++) {
			Class160 class160 = aClass160Array7459[i_214_];
			if (class160 != null) {
				for (int i_215_ = 0; i_215_ < 1965060689 * anInt7464; i_215_++) {
					for (int i_216_ = 0; i_216_ < anInt7428 * 937313339; i_216_++) {
						class536_sub18_sub7 = class160.method1928(i_216_, i_215_, class536_sub18_sub7);
						if (class536_sub18_sub7 != null) {
							int i_217_ = i_216_ << anInt7444 * 1893698405;
							int i_218_ = i_215_ << anInt7444 * 1893698405;
							for (int i_219_ = i_214_ - 1; i_219_ >= 0; i_219_--) {
								Class160 class160_220_ = aClass160Array7459[i_219_];
								if (null != class160_220_) {
									int i_221_ = (class160.method1927(i_216_, i_215_, 196552770) - (class160_220_.method1927(i_216_, i_215_, -114900729)));
									int i_222_ = (class160.method1927(i_216_ + 1, i_215_, -1049008743) - (class160_220_.method1927(i_216_ + 1, i_215_, 150364374)));
									int i_223_ = (class160.method1927(i_216_ + 1, 1 + i_215_, 717799847) - (class160_220_.method1927(i_216_ + 1, 1 + i_215_, 1526568235)));
									int i_224_ = (class160.method1927(i_216_, i_215_ + 1, -37802836) - (class160_220_.method1927(i_216_, 1 + i_215_, -1232042610)));
									class160_220_.method1945(class536_sub18_sub7, i_217_, ((i_224_ + (i_221_ + i_222_ + i_223_)) / 4), i_218_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public Class649_Sub1_Sub5 method6736(int i, int i_225_, int i_226_, Interface64 interface64, byte i_227_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_225_][i_226_];
		if (null == class556)
			return null;
		for (Class552 class552 = class556.aClass552_7497; class552 != null; class552 = class552.aClass552_7414) {
			Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
			if ((interface64 == null || interface64.method420(class649_sub1_sub5, 1968944199)) && class649_sub1_sub5.aShort11867 == i_225_ && i_226_ == class649_sub1_sub5.aShort11865)
				return class649_sub1_sub5;
		}
		return null;
	}

	public void method6737(int i, int i_228_, int i_229_) {
		Class556 class556 = aClass556ArrayArrayArray7430[0][i][i_228_];
		for (int i_230_ = 0; i_230_ < 3; i_230_++) {
			Class556 class556_231_ = (aClass556ArrayArrayArray7430[i_230_][i][i_228_] = aClass556ArrayArrayArray7430[i_230_ + 1][i][i_228_]);
			if (null != class556_231_) {
				for (Class552 class552 = class556_231_.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
					Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
					if (class649_sub1_sub5.aShort11867 == i && i_228_ == class649_sub1_sub5.aShort11865)
						class649_sub1_sub5.aByte10839--;
				}
				if (null != class556_231_.aClass649_Sub1_Sub2_7503)
					class556_231_.aClass649_Sub1_Sub2_7503.aByte10839--;
				if (null != class556_231_.aClass649_Sub1_Sub3_7499)
					class556_231_.aClass649_Sub1_Sub3_7499.aByte10839--;
				if (null != class556_231_.aClass649_Sub1_Sub3_7500)
					class556_231_.aClass649_Sub1_Sub3_7500.aByte10839--;
				if (class556_231_.aClass649_Sub1_Sub4_7501 != null)
					class556_231_.aClass649_Sub1_Sub4_7501.aByte10839--;
				if (class556_231_.aClass649_Sub1_Sub4_7502 != null)
					class556_231_.aClass649_Sub1_Sub4_7502.aByte10839--;
			}
		}
		if (aClass556ArrayArrayArray7430[0][i][i_228_] == null) {
			aClass556ArrayArrayArray7430[0][i][i_228_] = new Class556(0);
			aClass556ArrayArrayArray7430[0][i][i_228_].aByte7508 = (byte) 1;
		}
		aClass556ArrayArrayArray7430[0][i][i_228_].aClass556_7498 = class556;
		aClass556ArrayArrayArray7430[3][i][i_228_] = null;
	}

	public void method6738(byte i) {
		for (int i_232_ = 0; i_232_ < anInt7417 * 1051878761; i_232_++) {
			if (!aBoolArray7474[i_232_]) {
				Class562 class562 = aClass562Array7473[i_232_];
				Class536_Sub19 class536_sub19 = class562.aClass536_Sub19_7546;
				int i_233_ = class562.anInt7570 * -2071213659;
				int i_234_ = (class536_sub19.method9530(237811111) - anInt7420 * -2019890215);
				int i_235_ = 1 + (i_234_ * 2 >> anInt7444 * 1893698405);
				int i_236_ = 0;
				int[] is = new int[i_235_ * i_235_];
				int i_237_ = (class536_sub19.method9548(-1965224124) - i_234_ >> 1893698405 * anInt7444);
				int i_238_ = (class536_sub19.method9551((byte) 0) - i_234_ >> 1893698405 * anInt7444);
				int i_239_ = (class536_sub19.method9551((byte) 0) + i_234_ >> 1893698405 * anInt7444);
				if (i_238_ < 0) {
					i_236_ -= i_238_;
					i_238_ = 0;
				}
				if (i_239_ >= 1965060689 * anInt7464)
					i_239_ = anInt7464 * 1965060689 - 1;
				for (int i_240_ = i_238_; i_240_ <= i_239_; i_240_++) {
					int i_241_ = class562.aShortArray7571[i_236_];
					int i_242_ = i_241_ >>> 8;
					int i_243_ = i_235_ * i_236_ + i_242_;
					int i_244_ = (i_241_ >>> 8) + i_237_;
					int i_245_ = (i_241_ & 0xff) + i_244_ - 1;
					if (i_244_ < 0) {
						i_243_ -= i_244_;
						i_244_ = 0;
					}
					if (i_245_ >= 937313339 * anInt7428)
						i_245_ = anInt7428 * 937313339 - 1;
					for (int i_246_ = i_244_; i_246_ <= i_245_; i_246_++) {
						int i_247_ = 1;
						Class649_Sub1_Sub5 class649_sub1_sub5 = method6736(i_233_, i_246_, i_240_, null, (byte) -125);
						if (null != class649_sub1_sub5 && class649_sub1_sub5.aByte11869 != 0) {
							if (class649_sub1_sub5.aByte11869 == 1) {
								boolean bool = i_246_ - 1 >= i_244_;
								boolean bool_248_ = i_246_ + 1 <= i_245_;
								if (!bool && 1 + i_240_ <= i_239_) {
									int i_249_ = class562.aShortArray7571[i_236_ + 1];
									int i_250_ = i_237_ + (i_249_ >>> 8);
									int i_251_ = (i_249_ & 0xff) + i_250_;
									bool = i_246_ > i_250_ && i_246_ < i_251_;
								}
								if (!bool_248_ && i_240_ - 1 >= i_238_) {
									int i_252_ = class562.aShortArray7571[i_236_ - 1];
									int i_253_ = i_237_ + (i_252_ >>> 8);
									int i_254_ = (i_252_ & 0xff) + i_253_;
									bool_248_ = i_246_ > i_253_ && i_246_ < i_254_;
								}
								if (bool && !bool_248_)
									i_247_ = 4;
								else if (bool_248_ && !bool)
									i_247_ = 2;
							} else {
								boolean bool = i_246_ - 1 >= i_244_;
								boolean bool_255_ = i_246_ + 1 <= i_245_;
								if (!bool && i_240_ - 1 >= i_238_) {
									int i_256_ = class562.aShortArray7571[i_236_ - 1];
									int i_257_ = (i_256_ >>> 8) + i_237_;
									int i_258_ = (i_256_ & 0xff) + i_257_;
									bool = i_246_ > i_257_ && i_246_ < i_258_;
								}
								if (!bool_255_ && 1 + i_240_ <= i_239_) {
									int i_259_ = class562.aShortArray7571[i_236_ + 1];
									int i_260_ = (i_259_ >>> 8) + i_237_;
									int i_261_ = (i_259_ & 0xff) + i_260_;
									bool_255_ = i_246_ > i_260_ && i_246_ < i_261_;
								}
								if (bool && !bool_255_)
									i_247_ = 3;
								else if (bool_255_ && !bool)
									i_247_ = 5;
							}
						}
						is[i_243_++] = i_247_;
					}
					i_236_++;
				}
				aBoolArray7474[i_232_] = true;
				if (aBool7469)
					aClass160Array7431[i_233_].method1952(class536_sub19, is);
			}
		}
	}

	public void method6739(int i, int i_262_, int i_263_, byte i_264_) {
		List list = (List) aHashMap7475.get(Integer.valueOf(i));
		if (null != list) {
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class562 class562 = (Class562) iterator.next();
				class562.aClass536_Sub19_7546.method9535(i_262_, i_263_, (short) 24456);
			}
		}
	}

	public HashMap method6740(byte i) {
		aHashMap7425.clear();
		Iterator iterator = aHashMap7475.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			aHashMap7425.put(entry.getKey(), (((Class562) ((List) entry.getValue()).get(0)).aClass536_Sub19_7546));
		}
		return aHashMap7425;
	}

	public void method6741(HashMap hashmap, int i) {
		aHashMap7425 = hashmap;
	}

	public void method6742(int i) {
		/* empty */
	}

	public void method6743(int i) {
		/* empty */
	}

	public void method6744(int i) {
		/* empty */
	}

	public void method6745() {
		for (int i = 0; i < anInt7428 * 937313339; i++) {
			for (int i_265_ = 0; i_265_ < 1965060689 * anInt7464; i_265_++) {
				if (aClass556ArrayArrayArray7430[0][i][i_265_] == null)
					aClass556ArrayArrayArray7430[0][i][i_265_] = new Class556(0);
			}
		}
	}

	public Class649_Sub1_Sub3 method6746(int i, int i_266_, int i_267_, int i_268_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_266_][i_267_];
		if (null == class556)
			return null;
		return class556.aClass649_Sub1_Sub3_7500;
	}

	void method6747(int i, int i_269_) {
		Class536_Sub18_Sub7 class536_sub18_sub7 = null;
		for (int i_270_ = i; i_270_ < i_269_; i_270_++) {
			Class160 class160 = aClass160Array7459[i_270_];
			if (class160 != null) {
				for (int i_271_ = 0; i_271_ < 1965060689 * anInt7464; i_271_++) {
					for (int i_272_ = 0; i_272_ < anInt7428 * 937313339; i_272_++) {
						class536_sub18_sub7 = class160.method1928(i_272_, i_271_, class536_sub18_sub7);
						if (class536_sub18_sub7 != null) {
							int i_273_ = i_272_ << anInt7444 * 1893698405;
							int i_274_ = i_271_ << anInt7444 * 1893698405;
							for (int i_275_ = i_270_ - 1; i_275_ >= 0; i_275_--) {
								Class160 class160_276_ = aClass160Array7459[i_275_];
								if (null != class160_276_) {
									int i_277_ = (class160.method1927(i_272_, i_271_, 1092297116) - (class160_276_.method1927(i_272_, i_271_, 1423466445)));
									int i_278_ = (class160.method1927(i_272_ + 1, i_271_, 37654772) - (class160_276_.method1927(i_272_ + 1, i_271_, -1781104312)));
									int i_279_ = (class160.method1927(i_272_ + 1, 1 + i_271_, 2060901384) - (class160_276_.method1927(i_272_ + 1, 1 + i_271_, -380958114)));
									int i_280_ = (class160.method1927(i_272_, i_271_ + 1, 409570326) - (class160_276_.method1927(i_272_, 1 + i_271_, 1118146637)));
									class160_276_.method1945(class536_sub18_sub7, i_273_, ((i_280_ + (i_277_ + i_278_ + i_279_)) / 4), i_274_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	void method6748(Class649_Sub1 class649_sub1, int i) {
		Class436 class436 = class649_sub1.method7837().aClass436_4823;
		aClass167_7422.method2017((float) (int) class436.aFloat4850, (float) ((int) class436.aFloat4852 + (class649_sub1.method9960(-1001989761) >> 1)), (float) (int) class436.aFloat4853, aFloatArray7467);
		class649_sub1.anInt10841 = -1735304907 * (int) aFloatArray7467[2];
	}

	void method6749(Class649_Sub1 class649_sub1, Class536_Sub19[] class536_sub19s) {
		if (aBool7424) {
			int i = class649_sub1.method9959(class536_sub19s, (byte) 6);
			aClass167_7422.method2110(i, class536_sub19s);
		}
		if (aClass160Array7418 == aClass160Array7431) {
			boolean bool = false;
			boolean bool_281_ = false;
			Class436 class436 = class649_sub1.method7837().aClass436_4823;
			int i;
			int i_282_;
			if (class649_sub1 instanceof Class649_Sub1_Sub5) {
				i = ((Class649_Sub1_Sub5) class649_sub1).aShort11867;
				i_282_ = ((Class649_Sub1_Sub5) class649_sub1).aShort11865;
			} else {
				i = (int) class436.aFloat4850 >> anInt7444 * 1893698405;
				i_282_ = (int) class436.aFloat4853 >> anInt7444 * 1893698405;
			}
			i = Math.min(anInt7428 * 937313339 - 1, Math.max(0, i));
			i_282_ = Math.min(1965060689 * anInt7464 - 1, Math.max(0, i_282_));
			Class175 class175 = new Class175();
			class175.anInt1932 = method6702(i, i_282_, (byte) -15) * -158484941;
			class175.anInt1934 = method6701(i, i_282_, -36097330) * 261072557;
			class175.anInt1930 = method6703(i, i_282_, (byte) 24) * -1714306347;
			class175.anInt1928 = method6767(i, i_282_, 564197184) * 1238295881;
			class175.anInt1933 = method6757(i, i_282_, 1815653720) * 1127551047;
			class175.anInt1929 = method6705(i, i_282_, (byte) -11) * -284212951;
			aClass167_7422.method2282(aClass160Array7459[0].method1925((int) class436.aFloat4850, (int) class436.aFloat4853, (byte) 13), class175);
		}
		Class563 class563 = class649_sub1.method9944(aClass167_7422, (byte) 1);
		if (class563 != null) {
			if (class563.aBool7581) {
				class563.aClass649_Sub1_7582 = class649_sub1;
				aClass564_7477.method6873(class563, 574661466);
			} else
				Class97.method1316(class563, 1459349905);
		}
	}

	public void method6750() {
		for (int i = 0; i < anInt7428 * 937313339; i++) {
			for (int i_283_ = 0; i_283_ < 1965060689 * anInt7464; i_283_++) {
				if (aClass556ArrayArrayArray7430[0][i][i_283_] == null)
					aClass556ArrayArrayArray7430[0][i][i_283_] = new Class556(0);
			}
		}
	}

	public void method6751(int i, int i_284_) {
		Class556 class556 = aClass556ArrayArrayArray7430[0][i][i_284_];
		for (int i_285_ = 0; i_285_ < 3; i_285_++) {
			Class556 class556_286_ = (aClass556ArrayArrayArray7430[i_285_][i][i_284_] = aClass556ArrayArrayArray7430[i_285_ + 1][i][i_284_]);
			if (null != class556_286_) {
				for (Class552 class552 = class556_286_.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
					Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
					if (class649_sub1_sub5.aShort11867 == i && i_284_ == class649_sub1_sub5.aShort11865)
						class649_sub1_sub5.aByte10839--;
				}
				if (null != class556_286_.aClass649_Sub1_Sub2_7503)
					class556_286_.aClass649_Sub1_Sub2_7503.aByte10839--;
				if (null != class556_286_.aClass649_Sub1_Sub3_7499)
					class556_286_.aClass649_Sub1_Sub3_7499.aByte10839--;
				if (null != class556_286_.aClass649_Sub1_Sub3_7500)
					class556_286_.aClass649_Sub1_Sub3_7500.aByte10839--;
				if (class556_286_.aClass649_Sub1_Sub4_7501 != null)
					class556_286_.aClass649_Sub1_Sub4_7501.aByte10839--;
				if (class556_286_.aClass649_Sub1_Sub4_7502 != null)
					class556_286_.aClass649_Sub1_Sub4_7502.aByte10839--;
			}
		}
		if (aClass556ArrayArrayArray7430[0][i][i_284_] == null) {
			aClass556ArrayArrayArray7430[0][i][i_284_] = new Class556(0);
			aClass556ArrayArrayArray7430[0][i][i_284_].aByte7508 = (byte) 1;
		}
		aClass556ArrayArrayArray7430[0][i][i_284_].aClass556_7498 = class556;
		aClass556ArrayArrayArray7430[3][i][i_284_] = null;
	}

	public void method6752() {
		for (int i = 0; i < anInt7428 * 937313339; i++) {
			for (int i_287_ = 0; i_287_ < 1965060689 * anInt7464; i_287_++) {
				if (aClass556ArrayArrayArray7430[0][i][i_287_] == null)
					aClass556ArrayArrayArray7430[0][i][i_287_] = new Class556(0);
			}
		}
	}

	public void method6753(int i, int i_288_) {
		Class556 class556 = aClass556ArrayArrayArray7430[0][i][i_288_];
		for (int i_289_ = 0; i_289_ < 3; i_289_++) {
			Class556 class556_290_ = (aClass556ArrayArrayArray7430[i_289_][i][i_288_] = aClass556ArrayArrayArray7430[i_289_ + 1][i][i_288_]);
			if (null != class556_290_) {
				for (Class552 class552 = class556_290_.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
					Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
					if (class649_sub1_sub5.aShort11867 == i && i_288_ == class649_sub1_sub5.aShort11865)
						class649_sub1_sub5.aByte10839--;
				}
				if (null != class556_290_.aClass649_Sub1_Sub2_7503)
					class556_290_.aClass649_Sub1_Sub2_7503.aByte10839--;
				if (null != class556_290_.aClass649_Sub1_Sub3_7499)
					class556_290_.aClass649_Sub1_Sub3_7499.aByte10839--;
				if (null != class556_290_.aClass649_Sub1_Sub3_7500)
					class556_290_.aClass649_Sub1_Sub3_7500.aByte10839--;
				if (class556_290_.aClass649_Sub1_Sub4_7501 != null)
					class556_290_.aClass649_Sub1_Sub4_7501.aByte10839--;
				if (class556_290_.aClass649_Sub1_Sub4_7502 != null)
					class556_290_.aClass649_Sub1_Sub4_7502.aByte10839--;
			}
		}
		if (aClass556ArrayArrayArray7430[0][i][i_288_] == null) {
			aClass556ArrayArrayArray7430[0][i][i_288_] = new Class556(0);
			aClass556ArrayArrayArray7430[0][i][i_288_].aByte7508 = (byte) 1;
		}
		aClass556ArrayArrayArray7430[0][i][i_288_].aClass556_7498 = class556;
		aClass556ArrayArrayArray7430[3][i][i_288_] = null;
	}

	public void method6754(int i, int i_291_) {
		Class556 class556 = aClass556ArrayArrayArray7430[0][i][i_291_];
		for (int i_292_ = 0; i_292_ < 3; i_292_++) {
			Class556 class556_293_ = (aClass556ArrayArrayArray7430[i_292_][i][i_291_] = aClass556ArrayArrayArray7430[i_292_ + 1][i][i_291_]);
			if (null != class556_293_) {
				for (Class552 class552 = class556_293_.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
					Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
					if (class649_sub1_sub5.aShort11867 == i && i_291_ == class649_sub1_sub5.aShort11865)
						class649_sub1_sub5.aByte10839--;
				}
				if (null != class556_293_.aClass649_Sub1_Sub2_7503)
					class556_293_.aClass649_Sub1_Sub2_7503.aByte10839--;
				if (null != class556_293_.aClass649_Sub1_Sub3_7499)
					class556_293_.aClass649_Sub1_Sub3_7499.aByte10839--;
				if (null != class556_293_.aClass649_Sub1_Sub3_7500)
					class556_293_.aClass649_Sub1_Sub3_7500.aByte10839--;
				if (class556_293_.aClass649_Sub1_Sub4_7501 != null)
					class556_293_.aClass649_Sub1_Sub4_7501.aByte10839--;
				if (class556_293_.aClass649_Sub1_Sub4_7502 != null)
					class556_293_.aClass649_Sub1_Sub4_7502.aByte10839--;
			}
		}
		if (aClass556ArrayArrayArray7430[0][i][i_291_] == null) {
			aClass556ArrayArrayArray7430[0][i][i_291_] = new Class556(0);
			aClass556ArrayArrayArray7430[0][i][i_291_].aByte7508 = (byte) 1;
		}
		aClass556ArrayArrayArray7430[0][i][i_291_].aClass556_7498 = class556;
		aClass556ArrayArrayArray7430[3][i][i_291_] = null;
	}

	public void method6755(int i, int i_294_) {
		Class556 class556 = aClass556ArrayArrayArray7430[0][i][i_294_];
		for (int i_295_ = 0; i_295_ < 3; i_295_++) {
			Class556 class556_296_ = (aClass556ArrayArrayArray7430[i_295_][i][i_294_] = aClass556ArrayArrayArray7430[i_295_ + 1][i][i_294_]);
			if (null != class556_296_) {
				for (Class552 class552 = class556_296_.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
					Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
					if (class649_sub1_sub5.aShort11867 == i && i_294_ == class649_sub1_sub5.aShort11865)
						class649_sub1_sub5.aByte10839--;
				}
				if (null != class556_296_.aClass649_Sub1_Sub2_7503)
					class556_296_.aClass649_Sub1_Sub2_7503.aByte10839--;
				if (null != class556_296_.aClass649_Sub1_Sub3_7499)
					class556_296_.aClass649_Sub1_Sub3_7499.aByte10839--;
				if (null != class556_296_.aClass649_Sub1_Sub3_7500)
					class556_296_.aClass649_Sub1_Sub3_7500.aByte10839--;
				if (class556_296_.aClass649_Sub1_Sub4_7501 != null)
					class556_296_.aClass649_Sub1_Sub4_7501.aByte10839--;
				if (class556_296_.aClass649_Sub1_Sub4_7502 != null)
					class556_296_.aClass649_Sub1_Sub4_7502.aByte10839--;
			}
		}
		if (aClass556ArrayArrayArray7430[0][i][i_294_] == null) {
			aClass556ArrayArrayArray7430[0][i][i_294_] = new Class556(0);
			aClass556ArrayArrayArray7430[0][i][i_294_].aByte7508 = (byte) 1;
		}
		aClass556ArrayArrayArray7430[0][i][i_294_].aClass556_7498 = class556;
		aClass556ArrayArrayArray7430[3][i][i_294_] = null;
	}

	public Class649_Sub1_Sub4 method6756(int i, int i_297_, int i_298_, byte i_299_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_297_][i_298_];
		if (class556 != null) {
			method6721(class556.aClass649_Sub1_Sub4_7502, -1038999948);
			if (class556.aClass649_Sub1_Sub4_7502 != null) {
				Class649_Sub1_Sub4 class649_sub1_sub4 = class556.aClass649_Sub1_Sub4_7502;
				class556.aClass649_Sub1_Sub4_7502 = null;
				return class649_sub1_sub4;
			}
		}
		return null;
	}

	public Class553(Class167 class167, int i, int i_300_, int i_301_, int i_302_, int i_303_, boolean bool, boolean bool_304_) {
		anInt7442 = 0;
		anInt7443 = 10042;
		anInt7446 = 5057;
		anInt7445 = 5056;
		aFloatArray7467 = new float[3];
		aClass536_Sub19Array7460 = new Class536_Sub19[8];
		anInt7429 = 65134;
		aHashMap7475 = new HashMap();
		aHashMap7425 = new HashMap();
		aClass167_7422 = class167;
		aBool7424 = aClass167_7422.method2108() > 0;
		anInt7444 = i * -233329043;
		anInt7419 = (1 << anInt7444 * 1893698405) * 710965757;
		anInt7420 = 162063465 * (327297877 * anInt7419 >> 1);
		anInt7427 = i_300_ * 38059071;
		anInt7428 = -1909984013 * i_301_;
		anInt7464 = -245492047 * i_302_;
		anInt7447 = i_303_ * -1056250939;
		aClass29_7433 = new Class29();
		aClass544_7426 = new Class544(this);
		aClass556ArrayArrayArray7432 = (new Class556[i_300_][937313339 * anInt7428][1965060689 * anInt7464]);
		aClass160Array7459 = new Class160[i_300_];
		if (bool) {
			anIntArrayArray7436 = new int[anInt7428 * 937313339][1965060689 * anInt7464];
			aByteArrayArray7438 = new byte[937313339 * anInt7428][1965060689 * anInt7464];
			aShortArrayArray7421 = new short[anInt7428 * 937313339][anInt7464 * 1965060689];
			aByteArrayArray7423 = new byte[937313339 * anInt7428][1965060689 * anInt7464];
			aByteArrayArray7440 = new byte[937313339 * anInt7428][anInt7464 * 1965060689];
			aByteArrayArray7468 = new byte[937313339 * anInt7428][anInt7464 * 1965060689];
			aClass556ArrayArrayArray7437 = (new Class556[1][937313339 * anInt7428][anInt7464 * 1965060689]);
			aClass160Array7418 = new Class160[1];
		}
		if (bool_304_) {
			aLongArrayArrayArray7472 = new long[i_300_][i_301_][i_302_];
			aClass562Array7473 = new Class562[65134];
			aBoolArray7474 = new boolean[65134];
			anInt7417 = 0;
		}
		method6763(false, -1108384433);
		aClass649_Sub1Array7479 = new Class649_Sub1[2];
		aClass649_Sub1Array7439 = new Class649_Sub1[2];
		aClass649_Sub1Array7448 = new Class649_Sub1[2];
		aClass649_Sub1Array7452 = new Class649_Sub1[10042];
		anInt7449 = 0;
		aClass649_Sub1Array7441 = new Class649_Sub1[5057];
		anInt7450 = 0;
		aClass649_Sub1_Sub5Array7453 = new Class649_Sub1_Sub5[5056];
		anInt7442 = 0;
		aBoolArrayArray7471 = (new boolean[1 + (813474573 * anInt7447 + 813474573 * anInt7447)][813474573 * anInt7447 + 813474573 * anInt7447 + 1]);
		aBoolArrayArray7478 = (new boolean[813474573 * anInt7447 + 813474573 * anInt7447 + 2][2 + (anInt7447 * 813474573 + anInt7447 * 813474573)]);
		anIntArray7435 = new int[anInt7447 * 813474573 + 813474573 * anInt7447 + 2];
		aClass564_7477 = new Class564(false);
	}

	public int method6757(int i, int i_305_, int i_306_) {
		return (aByteArrayArray7440 != null ? aByteArrayArray7440[i][i_305_] & 0xff : 0);
	}

	public void method6758(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_307_, int i_308_, boolean[] bools, int i_309_) {
		if (aClass160Array7431 != aClass160Array7418) {
			int i_310_ = aClass160Array7459[i].method1925(i_307_, i_308_, (byte) 54);
			for (int i_311_ = 0; i_311_ <= i; i_311_++) {
				if (bools == null || bools[i_311_]) {
					Class160 class160 = aClass160Array7459[i_311_];
					if (null != class160)
						class160.method1932(class536_sub18_sub7, i_307_, (i_310_ - class160.method1925(i_307_, i_308_, (byte) 34)), i_308_, 0, false);
				}
			}
		}
	}

	public Class649_Sub1_Sub3 method6759(int i, int i_312_, int i_313_, byte i_314_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_312_][i_313_];
		if (null != class556) {
			method6721(class556.aClass649_Sub1_Sub3_7500, -1767070850);
			if (class556.aClass649_Sub1_Sub3_7500 != null) {
				Class649_Sub1_Sub3 class649_sub1_sub3 = class556.aClass649_Sub1_Sub3_7500;
				class556.aClass649_Sub1_Sub3_7500 = null;
				return class649_sub1_sub3;
			}
		}
		return null;
	}

	public void method6760(int i, int i_315_, int i_316_, Class649_Sub1_Sub3 class649_sub1_sub3, Class649_Sub1_Sub3 class649_sub1_sub3_317_, int i_318_) {
		Class556 class556 = method6700(i, i_315_, i_316_, -1407373062);
		if (class556 != null) {
			class556.aClass649_Sub1_Sub3_7499 = class649_sub1_sub3;
			class556.aClass649_Sub1_Sub3_7500 = class649_sub1_sub3_317_;
			int i_319_ = aClass160Array7431 == aClass160Array7418 ? 1 : 0;
			if (class649_sub1_sub3.method9974(-1715880695)) {
				if (class649_sub1_sub3.method9942(-563345991)) {
					class649_sub1_sub3.aClass649_Sub1_10837 = aClass649_Sub1Array7439[i_319_];
					aClass649_Sub1Array7439[i_319_] = class649_sub1_sub3;
				} else {
					class649_sub1_sub3.aClass649_Sub1_10837 = aClass649_Sub1Array7479[i_319_];
					aClass649_Sub1Array7479[i_319_] = class649_sub1_sub3;
				}
			} else {
				class649_sub1_sub3.aClass649_Sub1_10837 = aClass649_Sub1Array7448[i_319_];
				aClass649_Sub1Array7448[i_319_] = class649_sub1_sub3;
			}
			if (null != class649_sub1_sub3_317_) {
				if (class649_sub1_sub3_317_.method9974(-1194917664)) {
					if (class649_sub1_sub3_317_.method9942(-1151364082)) {
						class649_sub1_sub3_317_.aClass649_Sub1_10837 = aClass649_Sub1Array7439[i_319_];
						aClass649_Sub1Array7439[i_319_] = class649_sub1_sub3_317_;
					} else {
						class649_sub1_sub3_317_.aClass649_Sub1_10837 = aClass649_Sub1Array7479[i_319_];
						aClass649_Sub1Array7479[i_319_] = class649_sub1_sub3_317_;
					}
				} else {
					class649_sub1_sub3_317_.aClass649_Sub1_10837 = aClass649_Sub1Array7448[i_319_];
					aClass649_Sub1Array7448[i_319_] = class649_sub1_sub3_317_;
				}
			}
		}
	}

	public boolean method6761(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_320_, int i_321_, boolean[] bools, byte i_322_) {
		boolean bool = false;
		if (aClass160Array7418 != aClass160Array7431) {
			int i_323_ = aClass160Array7459[i].method1925(i_320_, i_321_, (byte) 67);
			int i_324_ = 0;
			for (/**/; i_324_ <= i; i_324_++) {
				Class160 class160 = aClass160Array7459[i_324_];
				if (null != class160) {
					int i_325_ = i_323_ - class160.method1925(i_320_, i_321_, (byte) -118);
					if (bools != null) {
						bools[i_324_] = class160.method1930(class536_sub18_sub7, i_320_, i_325_, i_321_, 0, false);
						if (!bools[i_324_])
							continue;
					}
					class160.method1945(class536_sub18_sub7, i_320_, i_325_, i_321_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	public Class649_Sub1_Sub1 method6762(int i, int i_326_, int i_327_, byte i_328_) {
		Class556 class556 = aClass556ArrayArrayArray7430[i][i_326_][i_327_];
		if (class556 == null)
			return null;
		return class556.aClass649_Sub1_Sub1_7505;
	}

	public void method6763(boolean bool, int i) {
		if (bool) {
			aClass556ArrayArrayArray7430 = aClass556ArrayArrayArray7437;
			aClass160Array7431 = aClass160Array7418;
		} else {
			aClass556ArrayArrayArray7430 = aClass556ArrayArrayArray7432;
			aClass160Array7431 = aClass160Array7459;
		}
		anInt7427 = 38059071 * aClass556ArrayArrayArray7430.length;
	}

	public void method6764() {
		for (int i = 0; i < anInt7427 * 1091122111; i++) {
			for (int i_329_ = 0; i_329_ < 937313339 * anInt7428; i_329_++) {
				for (int i_330_ = 0; i_330_ < 1965060689 * anInt7464; i_330_++) {
					Class556 class556 = aClass556ArrayArrayArray7430[i][i_329_][i_330_];
					if (null != class556) {
						Class649_Sub1_Sub3 class649_sub1_sub3 = class556.aClass649_Sub1_Sub3_7499;
						Class649_Sub1_Sub3 class649_sub1_sub3_331_ = class556.aClass649_Sub1_Sub3_7500;
						if (class649_sub1_sub3 != null && class649_sub1_sub3.method9940(1310554865)) {
							method6729(class649_sub1_sub3, i, i_329_, i_330_, 1, 1);
							if (class649_sub1_sub3_331_ != null && class649_sub1_sub3_331_.method9940(1872504199)) {
								method6729(class649_sub1_sub3_331_, i, i_329_, i_330_, 1, 1);
								class649_sub1_sub3_331_.method9943(aClass167_7422, class649_sub1_sub3, 0, 0, 0, false, -1242601675);
								class649_sub1_sub3_331_.method9986(387143390);
							}
							class649_sub1_sub3.method9986(-964078267);
						}
						for (Class552 class552 = class556.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
							Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
							if (null != class649_sub1_sub5 && class649_sub1_sub5.method9940(887909649)) {
								method6729(class649_sub1_sub5, i, i_329_, i_330_, (class649_sub1_sub5.aShort11864 - class649_sub1_sub5.aShort11867 + 1), (class649_sub1_sub5.aShort11870 - class649_sub1_sub5.aShort11865 + 1));
								class649_sub1_sub5.method9986(624391058);
							}
						}
						Class649_Sub1_Sub2 class649_sub1_sub2 = class556.aClass649_Sub1_Sub2_7503;
						if (class649_sub1_sub2 != null && class649_sub1_sub2.method9940(84093356)) {
							method6728(class649_sub1_sub2, i, i_329_, i_330_, 1964622056);
							class649_sub1_sub2.method9986(-774344698);
						}
					}
				}
			}
		}
	}

	public void method6765(int i) {
		method6735(1, anInt7427 * 1091122111, 1639416395);
	}

	public void method6766(int i) {
		/* empty */
	}

	public int method6767(int i, int i_332_, int i_333_) {
		return (aByteArrayArray7423 != null ? aByteArrayArray7423[i][i_332_] & 0xff : 0);
	}

	static final void method6768(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1);
		Class198.method2873(class251, class234, class668, (bool ? Class233.aClass233_2376 : Class233.aClass233_2370), (byte) 2);
	}

	static final void method6769(Class668 class668, int i) {
		int i_334_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3227(i_334_, -781094290).method3124(396759762) ? 1 : 0;
	}

	static void method6770(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class57.method965(1867269829);
	}
}
