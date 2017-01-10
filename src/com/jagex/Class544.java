/* Class544 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class544 {
	int[][][] anIntArrayArrayArray7237;
	boolean aBool7238;
	public boolean aBool7239 = true;
	int[] anIntArray7240;
	static final int anInt7241 = 101;
	float[] aFloatArray7242;
	int[] anIntArray7243;
	boolean aBool7244;
	int anInt7245;
	int anInt7246;
	Class548 aClass548_7247;
	Class557[] aClass557Array7248;
	Class557[] aClass557Array7249;
	int anInt7250;
	Class557[] aClass557Array7251;
	int anInt7252;
	static final float aFloat7253 = 3.0F;
	int anInt7254;
	boolean aBool7255;
	int[] anIntArray7256;
	Class553 aClass553_7257;
	Class557[] aClass557Array7258;
	int[] anIntArray7259;
	int[] anIntArray7260;
	int anInt7261;
	static GraphicalRenderer aClass167_7262;
	static final int anInt7263 = 10;
	int[] anIntArray7264;
	int anInt7265;
	int anInt7266;
	int[] anIntArray7267;

	public void method6583(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (i == 8 || i == 16) {
			if (i == 8) {
				int i_5_ = i_1_ << aClass553_7257.anInt7444 * 1893698405;
				int i_6_ = i_5_ + aClass553_7257.anInt7419 * 327297877;
				int i_7_ = i_2_ << aClass553_7257.anInt7444 * 1893698405;
				int i_8_ = i_7_ + aClass553_7257.anInt7419 * 327297877;
				int i_9_ = aClass553_7257.aClass160Array7459[i_0_].method1927(i_1_, i_2_, -162479124);
				int i_10_ = aClass553_7257.aClass160Array7459[i_0_].method1927(i_1_ + 1, i_2_ + 1, 105214542);
				aClass557Array7258[anInt7252++] = new Class557(aClass553_7257, i, i_0_, i_5_, i_6_, i_6_, i_5_, i_9_, i_10_, i_10_ - i_3_, i_9_ - i_3_, i_7_, i_8_, i_8_, i_7_);
			} else {
				int i_11_ = ((i_1_ << aClass553_7257.anInt7444 * 1893698405) + aClass553_7257.anInt7419 * 327297877);
				int i_12_ = i_11_ - aClass553_7257.anInt7419 * 327297877;
				int i_13_ = i_2_ << aClass553_7257.anInt7444 * 1893698405;
				int i_14_ = i_13_ + aClass553_7257.anInt7419 * 327297877;
				int i_15_ = aClass553_7257.aClass160Array7459[i_0_].method1927(i_1_ + 1, i_2_, -1443569301);
				int i_16_ = aClass553_7257.aClass160Array7459[i_0_].method1927(i_1_, i_2_ + 1, 1456934100);
				aClass557Array7258[anInt7252++] = new Class557(aClass553_7257, i, i_0_, i_11_, i_12_, i_12_, i_11_, i_15_, i_16_, i_16_ - i_3_, i_15_ - i_3_, i_13_, i_14_, i_14_, i_13_);
			}
		} else {
			Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i_0_][i_1_][i_2_]);
			if (class556 == null)
				aClass553_7257.aClass556ArrayArrayArray7430[i_0_][i_1_][i_2_] = class556 = new Class556(i_0_);
			if (i == 1) {
				class556.aShort7504 = (short) i_3_;
				class556.aShort7507 = (short) i_4_;
			} else if (i == 2) {
				class556.aShort7506 = (short) i_3_;
				class556.aShort7509 = (short) i_4_;
			}
			if (aBool7244)
				method6584();
		}
	}

	void method6584() {
		for (int i = 0; i < anInt7250; i++)
			aClass557Array7251[i] = null;
		anInt7250 = 0;
		for (int i = 0; i < aClass553_7257.anInt7427 * 1091122111; i++) {
			for (int i_17_ = 0; i_17_ < aClass553_7257.anInt7428 * 937313339; i_17_++) {
				for (int i_18_ = 0; i_18_ < aClass553_7257.anInt7464 * 1965060689; i_18_++) {
					Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_18_][i_17_]);
					if (class556 != null) {
						if (class556.aShort7504 > 0)
							class556.aShort7504 *= -1;
						if (class556.aShort7506 > 0)
							class556.aShort7506 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass553_7257.anInt7427 * 1091122111; i++) {
			for (int i_19_ = 0; i_19_ < aClass553_7257.anInt7428 * 937313339; i_19_++) {
				for (int i_20_ = 0; i_20_ < aClass553_7257.anInt7464 * 1965060689; i_20_++) {
					Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_20_][i_19_]);
					if (class556 != null) {
						boolean bool = ((aClass553_7257.aClass556ArrayArrayArray7430[0][i_20_][i_19_]) != null && (aClass553_7257.aClass556ArrayArrayArray7430[0][i_20_][i_19_].aClass556_7498) != null);
						if (class556.aShort7504 < 0) {
							int i_21_ = i_19_;
							int i_22_ = i_19_;
							int i_23_ = i;
							int i_24_ = i;
							Class556 class556_25_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_20_][i_21_ - 1]);
							int i_26_;
							for (i_26_ = (aClass553_7257.aClass160Array7459[i].method1927(i_20_, i_19_, 455521314)); (i_21_ > 0 && class556_25_ != null && class556_25_.aShort7504 < 0 && (class556_25_.aShort7504 == class556.aShort7504) && (class556_25_.aShort7507 == class556.aShort7507) && i_26_ == (aClass553_7257.aClass160Array7459[i].method1927(i_20_, i_21_ - 1, -1007216587)) && (i_21_ - 1 <= 0 || (i_26_ == (aClass553_7257.aClass160Array7459[i].method1927(i_20_, i_21_ - 2, 2033404235))))
									&& i_22_ - i_21_ <= 10); class556_25_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_20_][i_21_ - 1]))
								i_21_--;
							for (class556_25_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_20_][i_22_ + 1]); (i_22_ < aClass553_7257.anInt7464 * 1965060689 && class556_25_ != null && class556_25_.aShort7504 < 0 && (class556_25_.aShort7504 == class556.aShort7504) && (class556_25_.aShort7507 == class556.aShort7507) && i_26_ == (aClass553_7257.aClass160Array7459[i].method1927(i_20_, i_22_ + 1, 898769933))
									&& (i_22_ + 1 >= (aClass553_7257.anInt7464 * 1965060689) || (i_26_ == (aClass553_7257.aClass160Array7459[i].method1927(i_20_, i_22_ + 2, 809212086)))) && i_22_ - i_21_ <= 10); class556_25_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_20_][i_22_ + 1]))
								i_22_++;
							int i_27_ = i_24_ - i_23_ + 1;
							int i_28_ = aClass553_7257.aClass160Array7459[bool ? i_23_ + 1 : i_23_].method1927(i_20_, i_21_, 747248733);
							int i_29_ = i_28_ + class556.aShort7504 * i_27_;
							int i_30_ = (aClass553_7257.aClass160Array7459[bool ? i_23_ + 1 : i_23_].method1927(i_20_, i_22_ + 1, -1468042841));
							int i_31_ = i_30_ + class556.aShort7504 * i_27_;
							int i_32_ = (i_20_ << aClass553_7257.anInt7444 * 1893698405);
							int i_33_ = (i_21_ << aClass553_7257.anInt7444 * 1893698405);
							int i_34_ = ((i_22_ << aClass553_7257.anInt7444 * 1893698405) + aClass553_7257.anInt7419 * 327297877);
							aClass557Array7251[anInt7250++] = new Class557(aClass553_7257, 1, i_24_, i_32_ + class556.aShort7507, i_32_ + class556.aShort7507, i_32_ + class556.aShort7507, i_32_ + class556.aShort7507, i_28_, i_30_, i_31_, i_29_, i_33_, i_34_, i_34_, i_33_);
							for (int i_35_ = i_23_; i_35_ <= i_24_; i_35_++) {
								for (int i_36_ = i_21_; i_36_ <= i_22_; i_36_++)
									aClass553_7257.aClass556ArrayArrayArray7430[i_35_][i_20_][i_36_].aShort7504 *= -1;
							}
						}
						if (class556.aShort7506 < 0) {
							int i_37_ = i_20_;
							int i_38_ = i_20_;
							int i_39_ = i;
							int i_40_ = i;
							Class556 class556_41_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_37_ - 1][i_19_]);
							int i_42_;
							for (i_42_ = (aClass553_7257.aClass160Array7459[i].method1927(i_20_, i_19_, 867273435)); (i_37_ > 0 && class556_41_ != null && class556_41_.aShort7506 < 0 && (class556_41_.aShort7506 == class556.aShort7506) && (class556_41_.aShort7509 == class556.aShort7509) && i_42_ == (aClass553_7257.aClass160Array7459[i].method1927(i_37_ - 1, i_19_, 737698970)) && (i_37_ - 1 <= 0 || (i_42_ == (aClass553_7257.aClass160Array7459[i].method1927(i_37_ - 2, i_19_, 125279551))))
									&& i_38_ - i_37_ <= 10); class556_41_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_37_ - 1][i_19_]))
								i_37_--;
							for (class556_41_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_38_ + 1][i_19_]); (i_38_ < aClass553_7257.anInt7428 * 937313339 && class556_41_ != null && class556_41_.aShort7506 < 0 && (class556_41_.aShort7506 == class556.aShort7506) && (class556_41_.aShort7509 == class556.aShort7509) && i_42_ == (aClass553_7257.aClass160Array7459[i].method1927(i_38_ + 1, i_19_, -2111342054))
									&& ((i_38_ + 1 >= aClass553_7257.anInt7428 * 937313339) || (i_42_ == (aClass553_7257.aClass160Array7459[i].method1927(i_38_ + 2, i_19_, 1416380570)))) && i_38_ - i_37_ <= 10); class556_41_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_38_ + 1][i_19_]))
								i_38_++;
							int i_43_ = i_40_ - i_39_ + 1;
							int i_44_ = aClass553_7257.aClass160Array7459[bool ? i_39_ + 1 : i_39_].method1927(i_37_, i_19_, -1152022896);
							int i_45_ = i_44_ + class556.aShort7506 * i_43_;
							int i_46_ = (aClass553_7257.aClass160Array7459[bool ? i_39_ + 1 : i_39_].method1927(i_38_ + 1, i_19_, 1172873633));
							int i_47_ = i_46_ + class556.aShort7506 * i_43_;
							int i_48_ = (i_37_ << aClass553_7257.anInt7444 * 1893698405);
							int i_49_ = ((i_38_ << aClass553_7257.anInt7444 * 1893698405) + aClass553_7257.anInt7419 * 327297877);
							int i_50_ = (i_19_ << aClass553_7257.anInt7444 * 1893698405);
							aClass557Array7251[anInt7250++] = new Class557(aClass553_7257, 2, i_40_, i_48_, i_49_, i_49_, i_48_, i_44_, i_46_, i_47_, i_45_, i_50_ + class556.aShort7509, i_50_ + class556.aShort7509, i_50_ + class556.aShort7509, i_50_ + class556.aShort7509);
							for (int i_51_ = i_39_; i_51_ <= i_40_; i_51_++) {
								for (int i_52_ = i_37_; i_52_ <= i_38_; i_52_++)
									aClass553_7257.aClass556ArrayArrayArray7430[i_51_][i_52_][i_19_].aShort7506 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7244 = true;
	}

	public void method6585(int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		aClass557Array7249[anInt7261++] = new Class557(aClass553_7257, i, i_53_, i_54_, i_55_, i_55_, i_54_, i_58_, i_59_, i_59_, i_58_, i_56_, i_56_, i_57_, i_57_);
	}

	public void method6586() {
		method6584();
	}

	void method6587(GraphicalRenderer class167, Class557 class557, int i) {
		aClass167_7262 = class167;
		if (anIntArray7256 != null && class557.aByte7517 >= i) {
			for (int i_60_ = 0; i_60_ < anIntArray7256.length; i_60_++) {
				if (anIntArray7256[i_60_] != -1000000 && (class557.anIntArray7523[0] <= anIntArray7256[i_60_] || class557.anIntArray7523[1] <= anIntArray7256[i_60_] || class557.anIntArray7523[2] <= anIntArray7256[i_60_] || class557.anIntArray7523[3] <= anIntArray7256[i_60_]) && (class557.anIntArray7522[0] <= anIntArray7264[i_60_] || class557.anIntArray7522[1] <= anIntArray7264[i_60_] || class557.anIntArray7522[2] <= anIntArray7264[i_60_] || class557.anIntArray7522[3] <= anIntArray7264[i_60_])
						&& (class557.anIntArray7522[0] >= anIntArray7267[i_60_] || class557.anIntArray7522[1] >= anIntArray7267[i_60_] || class557.anIntArray7522[2] >= anIntArray7267[i_60_] || class557.anIntArray7522[3] >= anIntArray7267[i_60_]) && (class557.anIntArray7513[0] <= anIntArray7259[i_60_] || class557.anIntArray7513[1] <= anIntArray7259[i_60_] || class557.anIntArray7513[2] <= anIntArray7259[i_60_] || class557.anIntArray7513[3] <= anIntArray7259[i_60_])
						&& (class557.anIntArray7513[0] >= anIntArray7260[i_60_] || class557.anIntArray7513[1] >= anIntArray7260[i_60_] || class557.anIntArray7513[2] >= anIntArray7260[i_60_] || (class557.anIntArray7513[3] >= anIntArray7260[i_60_])))
					return;
			}
		}
		if (class557.aByte7516 == 1) {
			int i_61_ = (class557.aShort7526 - aClass553_7257.anInt7454 * -1629030593 + aClass553_7257.anInt7447 * 813474573);
			if (i_61_ >= 0 && i_61_ <= (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573)) {
				int i_62_ = (class557.aShort7518 - aClass553_7257.anInt7455 * -1430999951 + aClass553_7257.anInt7447 * 813474573);
				if (i_62_ < 0)
					i_62_ = 0;
				else if (i_62_ > (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573))
					return;
				int i_63_ = (class557.aShort7521 - aClass553_7257.anInt7455 * -1430999951 + aClass553_7257.anInt7447 * 813474573);
				if (i_63_ > (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573))
					i_63_ = (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573);
				else if (i_63_ < 0)
					return;
				boolean bool = false;
				while_43_: do {
					do {
						if (i_62_ > i_63_)
							break while_43_;
					} while (!aClass553_7257.aBoolArrayArray7471[i_61_][i_62_++]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass553_7257.anInt7456 * 1903897339 - class557.anIntArray7522[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7245) && method6599(class557, 0) && method6599(class557, 1) && method6599(class557, 2) && method6599(class557, 3))
						aClass557Array7248[anInt7254++] = class557;
				}
			}
		} else if (class557.aByte7516 == 2) {
			int i_64_ = (class557.aShort7518 - aClass553_7257.anInt7455 * -1430999951 + aClass553_7257.anInt7447 * 813474573);
			if (i_64_ >= 0 && i_64_ <= (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573)) {
				int i_65_ = (class557.aShort7526 - aClass553_7257.anInt7454 * -1629030593 + aClass553_7257.anInt7447 * 813474573);
				if (i_65_ < 0)
					i_65_ = 0;
				else if (i_65_ > (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573))
					return;
				int i_66_ = (class557.aShort7519 - aClass553_7257.anInt7454 * -1629030593 + aClass553_7257.anInt7447 * 813474573);
				if (i_66_ > (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573))
					i_66_ = (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573);
				else if (i_66_ < 0)
					return;
				boolean bool = false;
				while_44_: do {
					do {
						if (i_65_ > i_66_)
							break while_44_;
					} while (!aClass553_7257.aBoolArrayArray7471[i_65_++][i_64_]);
					bool = true;
				} while (false);
				if (bool) {
					float f = (float) (aClass553_7257.anInt7457 * -1454361495 - class557.anIntArray7513[0]);
					if (f < 0.0F)
						f *= -1.0F;
					if (!(f < (float) anInt7245) && method6599(class557, 0) && method6599(class557, 1) && method6599(class557, 2) && method6599(class557, 3))
						aClass557Array7248[anInt7254++] = class557;
				}
			}
		} else if (class557.aByte7516 == 16 || class557.aByte7516 == 8) {
			int i_67_ = (class557.aShort7526 - aClass553_7257.anInt7454 * -1629030593 + aClass553_7257.anInt7447 * 813474573);
			if (i_67_ >= 0 && i_67_ <= (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573)) {
				int i_68_ = (class557.aShort7518 - aClass553_7257.anInt7455 * -1430999951 + aClass553_7257.anInt7447 * 813474573);
				if (i_68_ >= 0 && i_68_ <= (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573) && aClass553_7257.aBoolArrayArray7471[i_67_][i_68_]) {
					float f = (float) (aClass553_7257.anInt7456 * 1903897339 - class557.anIntArray7522[0]);
					if (f < 0.0F)
						f *= -1.0F;
					float f_69_ = (float) (aClass553_7257.anInt7457 * -1454361495 - class557.anIntArray7513[0]);
					if (f_69_ < 0.0F)
						f_69_ *= -1.0F;
					if ((!(f < (float) anInt7245) || !(f_69_ < (float) anInt7245)) && method6599(class557, 0) && method6599(class557, 1) && method6599(class557, 2) && method6599(class557, 3))
						aClass557Array7248[anInt7254++] = class557;
				}
			}
		} else if (class557.aByte7516 == 4) {
			float f = (float) (class557.anIntArray7523[0] - aClass553_7257.anInt7458 * -1889548775);
			if (!(f <= (float) anInt7246)) {
				int i_70_ = (class557.aShort7518 - aClass553_7257.anInt7455 * -1430999951 + aClass553_7257.anInt7447 * 813474573);
				if (i_70_ < 0)
					i_70_ = 0;
				else if (i_70_ > (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573))
					return;
				int i_71_ = (class557.aShort7521 - aClass553_7257.anInt7455 * -1430999951 + aClass553_7257.anInt7447 * 813474573);
				if (i_71_ > (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573))
					i_71_ = (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573);
				else if (i_71_ < 0)
					return;
				int i_72_ = (class557.aShort7526 - aClass553_7257.anInt7454 * -1629030593 + aClass553_7257.anInt7447 * 813474573);
				if (i_72_ < 0)
					i_72_ = 0;
				else if (i_72_ > (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573))
					return;
				int i_73_ = (class557.aShort7519 - aClass553_7257.anInt7454 * -1629030593 + aClass553_7257.anInt7447 * 813474573);
				if (i_73_ > (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573))
					i_73_ = (aClass553_7257.anInt7447 * 813474573 + aClass553_7257.anInt7447 * 813474573);
				else if (i_73_ < 0)
					return;
				boolean bool = false;
				while_45_: for (int i_74_ = i_72_; i_74_ <= i_73_; i_74_++) {
					for (int i_75_ = i_70_; i_75_ <= i_71_; i_75_++) {
						if (aClass553_7257.aBoolArrayArray7471[i_74_][i_75_]) {
							bool = true;
							break while_45_;
						}
					}
				}
				if (bool && method6599(class557, 0) && method6599(class557, 1) && method6599(class557, 2) && method6599(class557, 3))
					aClass557Array7248[anInt7254++] = class557;
			}
		}
	}

	final boolean method6588(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_) {
		if (!method6589(i, i_76_, i_77_))
			return false;
		i = (int) aFloatArray7242[0];
		i_76_ = (int) aFloatArray7242[1];
		i_77_ = (int) aFloatArray7242[2];
		if (!method6589(i_78_, i_79_, i_80_))
			return false;
		i_78_ = (int) aFloatArray7242[0];
		i_79_ = (int) aFloatArray7242[1];
		i_80_ = (int) aFloatArray7242[2];
		if (!method6589(i_81_, i_82_, i_83_))
			return false;
		i_81_ = (int) aFloatArray7242[0];
		i_82_ = (int) aFloatArray7242[1];
		i_83_ = (int) aFloatArray7242[2];
		return aClass548_7247.method6635(i_76_, i_79_, i_82_, i, i_78_, i_81_, i_77_, i_80_, i_83_);
	}

	final boolean method6589(int i, int i_84_, int i_85_) {
		aClass167_7262.method2017((float) i, (float) i_84_, (float) i_85_, aFloatArray7242);
		if (aFloatArray7242[2] < 50.0F)
			return false;
		aFloatArray7242[0] /= 3.0F;
		aFloatArray7242[1] /= 3.0F;
		return true;
	}

	void method6590() {
		for (int i = 0; i < anInt7250; i++)
			aClass557Array7251[i] = null;
		anInt7250 = 0;
		for (int i = 0; i < aClass553_7257.anInt7427 * 1091122111; i++) {
			for (int i_86_ = 0; i_86_ < aClass553_7257.anInt7428 * 937313339; i_86_++) {
				for (int i_87_ = 0; i_87_ < aClass553_7257.anInt7464 * 1965060689; i_87_++) {
					Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_87_][i_86_]);
					if (class556 != null) {
						if (class556.aShort7504 > 0)
							class556.aShort7504 *= -1;
						if (class556.aShort7506 > 0)
							class556.aShort7506 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass553_7257.anInt7427 * 1091122111; i++) {
			for (int i_88_ = 0; i_88_ < aClass553_7257.anInt7428 * 937313339; i_88_++) {
				for (int i_89_ = 0; i_89_ < aClass553_7257.anInt7464 * 1965060689; i_89_++) {
					Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_89_][i_88_]);
					if (class556 != null) {
						boolean bool = ((aClass553_7257.aClass556ArrayArrayArray7430[0][i_89_][i_88_]) != null && (aClass553_7257.aClass556ArrayArrayArray7430[0][i_89_][i_88_].aClass556_7498) != null);
						if (class556.aShort7504 < 0) {
							int i_90_ = i_88_;
							int i_91_ = i_88_;
							int i_92_ = i;
							int i_93_ = i;
							Class556 class556_94_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_89_][i_90_ - 1]);
							int i_95_;
							for (i_95_ = (aClass553_7257.aClass160Array7459[i].method1927(i_89_, i_88_, -341014230)); (i_90_ > 0 && class556_94_ != null && class556_94_.aShort7504 < 0 && (class556_94_.aShort7504 == class556.aShort7504) && (class556_94_.aShort7507 == class556.aShort7507) && i_95_ == (aClass553_7257.aClass160Array7459[i].method1927(i_89_, i_90_ - 1, 360451019)) && (i_90_ - 1 <= 0 || (i_95_ == (aClass553_7257.aClass160Array7459[i].method1927(i_89_, i_90_ - 2, -648792857))))
									&& i_91_ - i_90_ <= 10); class556_94_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_89_][i_90_ - 1]))
								i_90_--;
							for (class556_94_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_89_][i_91_ + 1]); (i_91_ < aClass553_7257.anInt7464 * 1965060689 && class556_94_ != null && class556_94_.aShort7504 < 0 && (class556_94_.aShort7504 == class556.aShort7504) && (class556_94_.aShort7507 == class556.aShort7507) && i_95_ == (aClass553_7257.aClass160Array7459[i].method1927(i_89_, i_91_ + 1, -1615992927))
									&& (i_91_ + 1 >= (aClass553_7257.anInt7464 * 1965060689) || (i_95_ == (aClass553_7257.aClass160Array7459[i].method1927(i_89_, i_91_ + 2, -419530643)))) && i_91_ - i_90_ <= 10); class556_94_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_89_][i_91_ + 1]))
								i_91_++;
							int i_96_ = i_93_ - i_92_ + 1;
							int i_97_ = aClass553_7257.aClass160Array7459[bool ? i_92_ + 1 : i_92_].method1927(i_89_, i_90_, -159332047);
							int i_98_ = i_97_ + class556.aShort7504 * i_96_;
							int i_99_ = (aClass553_7257.aClass160Array7459[bool ? i_92_ + 1 : i_92_].method1927(i_89_, i_91_ + 1, 1165705536));
							int i_100_ = i_99_ + class556.aShort7504 * i_96_;
							int i_101_ = (i_89_ << aClass553_7257.anInt7444 * 1893698405);
							int i_102_ = (i_90_ << aClass553_7257.anInt7444 * 1893698405);
							int i_103_ = ((i_91_ << aClass553_7257.anInt7444 * 1893698405) + aClass553_7257.anInt7419 * 327297877);
							aClass557Array7251[anInt7250++] = new Class557(aClass553_7257, 1, i_93_, i_101_ + class556.aShort7507, i_101_ + class556.aShort7507, i_101_ + class556.aShort7507, i_101_ + class556.aShort7507, i_97_, i_99_, i_100_, i_98_, i_102_, i_103_, i_103_, i_102_);
							for (int i_104_ = i_92_; i_104_ <= i_93_; i_104_++) {
								for (int i_105_ = i_90_; i_105_ <= i_91_; i_105_++)
									aClass553_7257.aClass556ArrayArrayArray7430[i_104_][i_89_][i_105_].aShort7504 *= -1;
							}
						}
						if (class556.aShort7506 < 0) {
							int i_106_ = i_89_;
							int i_107_ = i_89_;
							int i_108_ = i;
							int i_109_ = i;
							Class556 class556_110_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_106_ - 1][i_88_]);
							int i_111_;
							for (i_111_ = (aClass553_7257.aClass160Array7459[i].method1927(i_89_, i_88_, 1238513476)); (i_106_ > 0 && class556_110_ != null && class556_110_.aShort7506 < 0 && (class556_110_.aShort7506 == class556.aShort7506) && (class556_110_.aShort7509 == class556.aShort7509) && (i_111_ == (aClass553_7257.aClass160Array7459[i].method1927(i_106_ - 1, i_88_, -320298944)))
									&& (i_106_ - 1 <= 0 || i_111_ == (aClass553_7257.aClass160Array7459[i].method1927(i_106_ - 2, i_88_, 1020124101))) && i_107_ - i_106_ <= 10); class556_110_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_106_ - 1][i_88_]))
								i_106_--;
							for (class556_110_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_107_ + 1][i_88_]); (i_107_ < aClass553_7257.anInt7428 * 937313339 && class556_110_ != null && class556_110_.aShort7506 < 0 && (class556_110_.aShort7506 == class556.aShort7506) && (class556_110_.aShort7509 == class556.aShort7509) && (i_111_ == (aClass553_7257.aClass160Array7459[i].method1927(i_107_ + 1, i_88_, 1605403258)))
									&& ((i_107_ + 1 >= aClass553_7257.anInt7428 * 937313339) || i_111_ == (aClass553_7257.aClass160Array7459[i].method1927(i_107_ + 2, i_88_, 1463185686))) && i_107_ - i_106_ <= 10); class556_110_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_107_ + 1][i_88_]))
								i_107_++;
							int i_112_ = i_109_ - i_108_ + 1;
							int i_113_ = aClass553_7257.aClass160Array7459[bool ? i_108_ + 1 : i_108_].method1927(i_106_, i_88_, 951527158);
							int i_114_ = i_113_ + class556.aShort7506 * i_112_;
							int i_115_ = (aClass553_7257.aClass160Array7459[bool ? i_108_ + 1 : i_108_].method1927(i_107_ + 1, i_88_, -1794231203));
							int i_116_ = i_115_ + class556.aShort7506 * i_112_;
							int i_117_ = (i_106_ << aClass553_7257.anInt7444 * 1893698405);
							int i_118_ = ((i_107_ << aClass553_7257.anInt7444 * 1893698405) + aClass553_7257.anInt7419 * 327297877);
							int i_119_ = (i_88_ << aClass553_7257.anInt7444 * 1893698405);
							aClass557Array7251[anInt7250++] = new Class557(aClass553_7257, 2, i_109_, i_117_, i_118_, i_118_, i_117_, i_113_, i_115_, i_116_, i_114_, i_119_ + class556.aShort7509, i_119_ + class556.aShort7509, i_119_ + class556.aShort7509, i_119_ + class556.aShort7509);
							for (int i_120_ = i_108_; i_120_ <= i_109_; i_120_++) {
								for (int i_121_ = i_106_; i_121_ <= i_107_; i_121_++)
									aClass553_7257.aClass556ArrayArrayArray7430[i_120_][i_121_][i_88_].aShort7506 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7244 = true;
	}

	boolean method6591(Class649_Sub1_Sub3 class649_sub1_sub3, int i, int i_122_, int i_123_) {
		if (!aBool7239 || !aBool7238)
			return false;
		if (aClass548_7247.anInt7304 < 101)
			return false;
		if (!method6601(i, i_122_, i_123_))
			return false;
		int i_124_ = i_122_ << aClass553_7257.anInt7444 * 1893698405;
		int i_125_ = i_123_ << aClass553_7257.anInt7444 * 1893698405;
		int i_126_ = (aClass553_7257.aClass160Array7431[i].method1927(i_122_, i_123_, -900911412) - 1);
		int i_127_ = i_126_ + class649_sub1_sub3.method9960(-2089160251);
		if (class649_sub1_sub3.aShort11789 == 1) {
			if (!method6588(i_124_, i_126_, i_125_, i_124_, i_127_, i_125_, i_124_, i_127_, i_125_ + aClass553_7257.anInt7419 * 327297877))
				return false;
			if (!method6588(i_124_, i_126_, i_125_, i_124_, i_127_, i_125_ + aClass553_7257.anInt7419 * 327297877, i_124_, i_126_, i_125_ + aClass553_7257.anInt7419 * 327297877))
				return false;
			return true;
		}
		if (class649_sub1_sub3.aShort11789 == 2) {
			if (!method6588(i_124_, i_126_, i_125_ + aClass553_7257.anInt7419 * 327297877, i_124_ + aClass553_7257.anInt7419 * 327297877, i_127_, i_125_ + aClass553_7257.anInt7419 * 327297877, i_124_, i_127_, i_125_ + aClass553_7257.anInt7419 * 327297877))
				return false;
			if (!method6588(i_124_, i_126_, i_125_ + aClass553_7257.anInt7419 * 327297877, i_124_ + aClass553_7257.anInt7419 * 327297877, i_126_, i_125_ + aClass553_7257.anInt7419 * 327297877, i_124_ + aClass553_7257.anInt7419 * 327297877, i_127_, i_125_ + aClass553_7257.anInt7419 * 327297877))
				return false;
			return true;
		}
		if (class649_sub1_sub3.aShort11789 == 4) {
			if (!method6588(i_124_ + aClass553_7257.anInt7419 * 327297877, i_126_, i_125_, i_124_ + aClass553_7257.anInt7419 * 327297877, i_127_, i_125_, i_124_ + aClass553_7257.anInt7419 * 327297877, i_127_, i_125_ + aClass553_7257.anInt7419 * 327297877))
				return false;
			if (!method6588(i_124_ + aClass553_7257.anInt7419 * 327297877, i_126_, i_125_, i_124_ + aClass553_7257.anInt7419 * 327297877, i_127_, i_125_ + aClass553_7257.anInt7419 * 327297877, i_124_ + aClass553_7257.anInt7419 * 327297877, i_126_, i_125_ + aClass553_7257.anInt7419 * 327297877))
				return false;
			return true;
		}
		if (class649_sub1_sub3.aShort11789 == 8) {
			if (!method6588(i_124_, i_126_, i_125_, i_124_ + aClass553_7257.anInt7419 * 327297877, i_127_, i_125_, i_124_, i_127_, i_125_))
				return false;
			if (!method6588(i_124_, i_126_, i_125_, i_124_ + aClass553_7257.anInt7419 * 327297877, i_126_, i_125_, i_124_ + aClass553_7257.anInt7419 * 327297877, i_127_, i_125_))
				return false;
			return true;
		}
		if (class649_sub1_sub3.aShort11789 == 16) {
			if (!method6594(i_124_, i_126_, i_125_ + aClass553_7257.anInt7420 * -2019890215, aClass553_7257.anInt7420 * -2019890215, i_127_, aClass553_7257.anInt7420 * -2019890215))
				return false;
			return true;
		}
		if (class649_sub1_sub3.aShort11789 == 32) {
			if (!method6594(i_124_ + aClass553_7257.anInt7420 * -2019890215, i_126_, i_125_ + aClass553_7257.anInt7420 * -2019890215, aClass553_7257.anInt7420 * -2019890215, i_127_, aClass553_7257.anInt7420 * -2019890215))
				return false;
			return true;
		}
		if (class649_sub1_sub3.aShort11789 == 64) {
			if (!method6594(i_124_ + aClass553_7257.anInt7420 * -2019890215, i_126_, i_125_, aClass553_7257.anInt7420 * -2019890215, i_127_, aClass553_7257.anInt7420 * -2019890215))
				return false;
			return true;
		}
		if (class649_sub1_sub3.aShort11789 == 128) {
			if (!method6594(i_124_, i_126_, i_125_, aClass553_7257.anInt7420 * -2019890215, i_127_, aClass553_7257.anInt7420 * -2019890215))
				return false;
			return true;
		}
		return true;
	}

	Class544(Class553 class553) {
		aBool7238 = true;
		aBool7244 = false;
		anInt7254 = 0;
		aFloatArray7242 = new float[3];
		anIntArray7243 = new int[2];
		anInt7265 = -1;
		anInt7266 = -1;
		aBool7255 = true;
		anInt7245 = class553.anInt7419 * 327297877;
		anInt7246 = class553.anInt7419 * 327297877;
		aClass553_7257 = class553;
		aClass557Array7249 = new Class557[521];
		anInt7261 = 0;
		aClass557Array7251 = new Class557[2027];
		anInt7250 = 0;
		aClass557Array7258 = new Class557[1014];
		anInt7252 = 0;
		aClass557Array7248 = new Class557[1026];
		anInt7254 = 0;
		anIntArrayArrayArray7237 = (new int[aClass553_7257.anInt7427 * 1091122111][aClass553_7257.anInt7428 * 937313339 + 1][aClass553_7257.anInt7464 * 1965060689 + 1]);
		aBool7244 = false;
		aBool7239 = true;
		if (aBool7239)
			aClass548_7247 = new Class548(this);
	}

	boolean method6592(int i, int i_128_, int i_129_, int i_130_, int i_131_, Class559 class559) {
		if (!aBool7239 || !aBool7238)
			return false;
		if (aClass548_7247.anInt7304 < 101)
			return false;
		if (i_128_ < 0 || i_130_ < 0 || i_129_ >= anIntArrayArrayArray7237[i].length || i_131_ >= anIntArrayArrayArray7237[i][i_128_].length)
			return false;
		if (i_128_ == i_129_ && i_130_ == i_131_) {
			if (!method6601(i, i_128_, i_130_))
				return false;
			if (method6593(class559))
				return true;
			return false;
		}
		for (int i_132_ = i_128_; i_132_ <= i_129_; i_132_++) {
			for (int i_133_ = i_130_; i_133_ <= i_131_; i_133_++) {
				if (anIntArrayArrayArray7237[i][i_132_][i_133_] == -(aClass553_7257.anInt7476 * -450790909))
					return false;
			}
		}
		if (!method6593(class559))
			return false;
		return true;
	}

	final boolean method6593(Class559 class559) {
		if (class559 == null)
			return false;
		return method6594(class559.anInt7528, class559.anInt7534, class559.anInt7536, class559.anInt7531 - class559.anInt7528, class559.anInt7535 - class559.anInt7534, class559.anInt7537 - class559.anInt7536);
	}

	final boolean method6594(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_) {
		int i_139_ = i + i_136_;
		int i_140_ = i_134_ + i_137_;
		int i_141_ = i_135_ + i_138_;
		if (!method6588(i, i_140_, i_135_, i_139_, i_140_, i_141_, i, i_140_, i_141_))
			return false;
		if (!method6588(i, i_140_, i_135_, i_139_, i_140_, i_135_, i_139_, i_140_, i_141_))
			return false;
		if (i < aClass553_7257.anInt7456 * 1903897339) {
			if (!method6588(i, i_134_, i_141_, i, i_140_, i_135_, i, i_140_, i_141_))
				return false;
			if (!method6588(i, i_134_, i_141_, i, i_134_, i_135_, i, i_140_, i_135_))
				return false;
		} else {
			if (!method6588(i_139_, i_134_, i_141_, i_139_, i_140_, i_135_, i_139_, i_140_, i_141_))
				return false;
			if (!method6588(i_139_, i_134_, i_141_, i_139_, i_134_, i_135_, i_139_, i_140_, i_135_))
				return false;
		}
		if (i_135_ < aClass553_7257.anInt7457 * -1454361495) {
			if (!method6588(i, i_134_, i_135_, i_139_, i_140_, i_135_, i, i_140_, i_135_))
				return false;
			if (!method6588(i, i_134_, i_135_, i_139_, i_134_, i_135_, i_139_, i_140_, i_135_))
				return false;
		} else {
			if (!method6588(i, i_134_, i_141_, i_139_, i_140_, i_141_, i, i_140_, i_141_))
				return false;
			if (!method6588(i, i_134_, i_141_, i_139_, i_134_, i_141_, i_139_, i_140_, i_141_))
				return false;
		}
		return true;
	}

	boolean method6595(int i, int i_142_, int i_143_, int i_144_) {
		if (!aBool7239 || !aBool7238)
			return false;
		if (aClass548_7247.anInt7304 < 101)
			return false;
		if (!method6601(i, i_142_, i_143_))
			return false;
		int i_145_ = i_142_ << aClass553_7257.anInt7444 * 1893698405;
		int i_146_ = i_143_ << aClass553_7257.anInt7444 * 1893698405;
		if (method6594(i_145_, aClass553_7257.aClass160Array7431[i].method1927(i_142_, i_143_, 2110682507), i_146_, aClass553_7257.anInt7419 * 327297877, i_144_, aClass553_7257.anInt7419 * 327297877))
			return true;
		return false;
	}

	public void method6596(int i, int i_147_, int i_148_, int i_149_) {
		if (i == 8 || i == 16) {
			for (int i_150_ = 0; i_150_ < anInt7252; i_150_++) {
				Class557 class557 = aClass557Array7258[i_150_];
				if (class557.aByte7516 == i && class557.aByte7517 == i_147_ && ((class557.aShort7526 == i_148_ && class557.aShort7518 == i_149_) || (class557.aShort7519 == i_148_ && class557.aShort7521 == i_149_))) {
					if (i_150_ != anInt7252)
						System.arraycopy(aClass557Array7258, i_150_ + 1, aClass557Array7258, i_150_, aClass557Array7258.length - (i_150_ + 1));
					anInt7252--;
					break;
				}
			}
		} else {
			Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i_147_][i_148_][i_149_]);
			if (class556 != null) {
				if (i == 1)
					class556.aShort7504 = (short) 0;
				else if (i == 2)
					class556.aShort7506 = (short) 0;
			}
			method6584();
		}
	}

	public void method6597() {
		method6584();
	}

	public void method6598() {
		method6584();
	}

	boolean method6599(Class557 class557, int i) {
		if (!method6589(class557.anIntArray7522[i], class557.anIntArray7523[i], class557.anIntArray7513[i]))
			return false;
		class557.aShortArray7520[i] = (short) (int) aFloatArray7242[0];
		class557.aShortArray7512[i] = (short) (int) aFloatArray7242[1];
		class557.aShortArray7527[i] = (short) (int) aFloatArray7242[2];
		return true;
	}

	void method6600() {
		for (int i = 0; i < anInt7250; i++)
			aClass557Array7251[i] = null;
		anInt7250 = 0;
		for (int i = 0; i < aClass553_7257.anInt7427 * 1091122111; i++) {
			for (int i_151_ = 0; i_151_ < aClass553_7257.anInt7428 * 937313339; i_151_++) {
				for (int i_152_ = 0; i_152_ < aClass553_7257.anInt7464 * 1965060689; i_152_++) {
					Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_152_][i_151_]);
					if (class556 != null) {
						if (class556.aShort7504 > 0)
							class556.aShort7504 *= -1;
						if (class556.aShort7506 > 0)
							class556.aShort7506 *= -1;
					}
				}
			}
		}
		for (int i = 0; i < aClass553_7257.anInt7427 * 1091122111; i++) {
			for (int i_153_ = 0; i_153_ < aClass553_7257.anInt7428 * 937313339; i_153_++) {
				for (int i_154_ = 0; i_154_ < aClass553_7257.anInt7464 * 1965060689; i_154_++) {
					Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_154_][i_153_]);
					if (class556 != null) {
						boolean bool = ((aClass553_7257.aClass556ArrayArrayArray7430[0][i_154_][i_153_]) != null && ((aClass553_7257.aClass556ArrayArrayArray7430[0][i_154_][i_153_].aClass556_7498) != null));
						if (class556.aShort7504 < 0) {
							int i_155_ = i_153_;
							int i_156_ = i_153_;
							int i_157_ = i;
							int i_158_ = i;
							Class556 class556_159_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_154_][i_155_ - 1]);
							int i_160_;
							for (i_160_ = (aClass553_7257.aClass160Array7459[i].method1927(i_154_, i_153_, -233182952)); (i_155_ > 0 && class556_159_ != null && class556_159_.aShort7504 < 0 && (class556_159_.aShort7504 == class556.aShort7504) && (class556_159_.aShort7507 == class556.aShort7507) && (i_160_ == (aClass553_7257.aClass160Array7459[i].method1927(i_154_, i_155_ - 1, -1139881485)))
									&& (i_155_ - 1 <= 0 || i_160_ == (aClass553_7257.aClass160Array7459[i].method1927(i_154_, i_155_ - 2, -1200024903))) && i_156_ - i_155_ <= 10); class556_159_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_154_][i_155_ - 1]))
								i_155_--;
							for (class556_159_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_154_][i_156_ + 1]); ((i_156_ < aClass553_7257.anInt7464 * 1965060689) && class556_159_ != null && class556_159_.aShort7504 < 0 && (class556_159_.aShort7504 == class556.aShort7504) && (class556_159_.aShort7507 == class556.aShort7507) && (i_160_ == (aClass553_7257.aClass160Array7459[i].method1927(i_154_, i_156_ + 1, 268572918)))
									&& (i_156_ + 1 >= (aClass553_7257.anInt7464 * 1965060689) || i_160_ == (aClass553_7257.aClass160Array7459[i].method1927(i_154_, i_156_ + 2, -882755204))) && i_156_ - i_155_ <= 10); class556_159_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_154_][i_156_ + 1]))
								i_156_++;
							int i_161_ = i_158_ - i_157_ + 1;
							int i_162_ = aClass553_7257.aClass160Array7459[bool ? i_157_ + 1 : i_157_].method1927(i_154_, i_155_, -680365556);
							int i_163_ = i_162_ + class556.aShort7504 * i_161_;
							int i_164_ = (aClass553_7257.aClass160Array7459[bool ? i_157_ + 1 : i_157_].method1927(i_154_, i_156_ + 1, 1259677210));
							int i_165_ = i_164_ + class556.aShort7504 * i_161_;
							int i_166_ = (i_154_ << aClass553_7257.anInt7444 * 1893698405);
							int i_167_ = (i_155_ << aClass553_7257.anInt7444 * 1893698405);
							int i_168_ = ((i_156_ << aClass553_7257.anInt7444 * 1893698405) + aClass553_7257.anInt7419 * 327297877);
							aClass557Array7251[anInt7250++] = new Class557(aClass553_7257, 1, i_158_, i_166_ + class556.aShort7507, i_166_ + class556.aShort7507, i_166_ + class556.aShort7507, i_166_ + class556.aShort7507, i_162_, i_164_, i_165_, i_163_, i_167_, i_168_, i_168_, i_167_);
							for (int i_169_ = i_157_; i_169_ <= i_158_; i_169_++) {
								for (int i_170_ = i_155_; i_170_ <= i_156_; i_170_++)
									aClass553_7257.aClass556ArrayArrayArray7430[i_169_][i_154_][i_170_].aShort7504 *= -1;
							}
						}
						if (class556.aShort7506 < 0) {
							int i_171_ = i_154_;
							int i_172_ = i_154_;
							int i_173_ = i;
							int i_174_ = i;
							Class556 class556_175_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_171_ - 1][i_153_]);
							int i_176_;
							for (i_176_ = (aClass553_7257.aClass160Array7459[i].method1927(i_154_, i_153_, 1301173947)); (i_171_ > 0 && class556_175_ != null && class556_175_.aShort7506 < 0 && (class556_175_.aShort7506 == class556.aShort7506) && (class556_175_.aShort7509 == class556.aShort7509) && (i_176_ == (aClass553_7257.aClass160Array7459[i].method1927(i_171_ - 1, i_153_, -393075977)))
									&& (i_171_ - 1 <= 0 || i_176_ == (aClass553_7257.aClass160Array7459[i].method1927(i_171_ - 2, i_153_, -697681284))) && i_172_ - i_171_ <= 10); class556_175_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_171_ - 1][i_153_]))
								i_171_--;
							for (class556_175_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_172_ + 1][i_153_]); (i_172_ < aClass553_7257.anInt7428 * 937313339 && class556_175_ != null && class556_175_.aShort7506 < 0 && (class556_175_.aShort7506 == class556.aShort7506) && (class556_175_.aShort7509 == class556.aShort7509) && (i_176_ == (aClass553_7257.aClass160Array7459[i].method1927(i_172_ + 1, i_153_, 377309684)))
									&& ((i_172_ + 1 >= aClass553_7257.anInt7428 * 937313339) || i_176_ == (aClass553_7257.aClass160Array7459[i].method1927(i_172_ + 2, i_153_, 1531284747))) && i_172_ - i_171_ <= 10); class556_175_ = (aClass553_7257.aClass556ArrayArrayArray7430[i][i_172_ + 1][i_153_]))
								i_172_++;
							int i_177_ = i_174_ - i_173_ + 1;
							int i_178_ = aClass553_7257.aClass160Array7459[bool ? i_173_ + 1 : i_173_].method1927(i_171_, i_153_, -1311318207);
							int i_179_ = i_178_ + class556.aShort7506 * i_177_;
							int i_180_ = (aClass553_7257.aClass160Array7459[bool ? i_173_ + 1 : i_173_].method1927(i_172_ + 1, i_153_, -4974146));
							int i_181_ = i_180_ + class556.aShort7506 * i_177_;
							int i_182_ = (i_171_ << aClass553_7257.anInt7444 * 1893698405);
							int i_183_ = ((i_172_ << aClass553_7257.anInt7444 * 1893698405) + aClass553_7257.anInt7419 * 327297877);
							int i_184_ = (i_153_ << aClass553_7257.anInt7444 * 1893698405);
							aClass557Array7251[anInt7250++] = new Class557(aClass553_7257, 2, i_174_, i_182_, i_183_, i_183_, i_182_, i_178_, i_180_, i_181_, i_179_, i_184_ + class556.aShort7509, i_184_ + class556.aShort7509, i_184_ + class556.aShort7509, i_184_ + class556.aShort7509);
							for (int i_185_ = i_173_; i_185_ <= i_174_; i_185_++) {
								for (int i_186_ = i_171_; i_186_ <= i_172_; i_186_++)
									aClass553_7257.aClass556ArrayArrayArray7430[i_185_][i_186_][i_153_].aShort7506 *= -1;
							}
						}
					}
				}
			}
		}
		aBool7244 = true;
	}

	boolean method6601(int i, int i_187_, int i_188_) {
		if (!aBool7239 || !aBool7238)
			return false;
		if (aClass548_7247.anInt7304 < 101)
			return false;
		int i_189_ = anIntArrayArrayArray7237[i][i_187_][i_188_];
		if (i_189_ == -(aClass553_7257.anInt7476 * -450790909))
			return false;
		if (i_189_ == aClass553_7257.anInt7476 * -450790909)
			return true;
		if (aClass553_7257.aClass160Array7431 == aClass553_7257.aClass160Array7418)
			return false;
		int i_190_ = i_187_ << aClass553_7257.anInt7444 * 1893698405;
		int i_191_ = i_188_ << aClass553_7257.anInt7444 * 1893698405;
		if (method6588(i_190_ + 1, aClass553_7257.aClass160Array7431[i].method1927(i_187_, i_188_, -1498223856), i_191_ + 1, i_190_ + aClass553_7257.anInt7419 * 327297877 - 1, aClass553_7257.aClass160Array7431[i].method1927(i_187_ + 1, i_188_ + 1, -996318725), i_191_ + aClass553_7257.anInt7419 * 327297877 - 1, i_190_ + 1, aClass553_7257.aClass160Array7431[i].method1927(i_187_, i_188_ + 1, 1187025706), i_191_ + aClass553_7257.anInt7419 * 327297877 - 1)
				&& method6588(i_190_ + 1, aClass553_7257.aClass160Array7431[i].method1927(i_187_, i_188_, -1114844521), i_191_ + 1, i_190_ + aClass553_7257.anInt7419 * 327297877 - 1, aClass553_7257.aClass160Array7431[i].method1927(i_187_ + 1, i_188_, -768016448), i_191_ + 1, i_190_ + aClass553_7257.anInt7419 * 327297877 - 1, aClass553_7257.aClass160Array7431[i].method1927(i_187_ + 1, i_188_ + 1, -368278791), i_191_ + aClass553_7257.anInt7419 * 327297877 - 1)) {
			anIntArrayArrayArray7237[i][i_187_][i_188_] = aClass553_7257.anInt7476 * -450790909;
			return true;
		}
		anIntArrayArrayArray7237[i][i_187_][i_188_] = -(aClass553_7257.anInt7476 * -450790909);
		return false;
	}

	public void method6602(int i, int i_192_, int i_193_, int i_194_) {
		if (i == 8 || i == 16) {
			for (int i_195_ = 0; i_195_ < anInt7252; i_195_++) {
				Class557 class557 = aClass557Array7258[i_195_];
				if (class557.aByte7516 == i && class557.aByte7517 == i_192_ && ((class557.aShort7526 == i_193_ && class557.aShort7518 == i_194_) || (class557.aShort7519 == i_193_ && class557.aShort7521 == i_194_))) {
					if (i_195_ != anInt7252)
						System.arraycopy(aClass557Array7258, i_195_ + 1, aClass557Array7258, i_195_, aClass557Array7258.length - (i_195_ + 1));
					anInt7252--;
					break;
				}
			}
		} else {
			Class556 class556 = (aClass553_7257.aClass556ArrayArrayArray7430[i_192_][i_193_][i_194_]);
			if (class556 != null) {
				if (i == 1)
					class556.aShort7504 = (short) 0;
				else if (i == 2)
					class556.aShort7506 = (short) 0;
			}
			method6584();
		}
	}

	void method6603(GraphicalRenderer class167, int i) {
		aClass167_7262 = class167;
		if (!aBool7239 || !aBool7238)
			anInt7254 = 0;
		else {
			if (aBool7255)
				aClass553_7257.aClass29_7433.method775(2063238728);
			aClass167_7262.method2020(anIntArray7243);
			if (anInt7265 != (int) ((float) anIntArray7243[0] / 3.0F) || anInt7266 != (int) ((float) anIntArray7243[1] / 3.0F)) {
				anInt7265 = (int) ((float) anIntArray7243[0] / 3.0F);
				anInt7266 = (int) ((float) anIntArray7243[1] / 3.0F);
				anIntArray7240 = new int[anInt7265 * anInt7266];
			}
			anInt7254 = 0;
			for (int i_196_ = 0; i_196_ < anInt7261; i_196_++)
				method6587(aClass167_7262, aClass557Array7249[i_196_], i);
			for (int i_197_ = 0; i_197_ < anInt7250; i_197_++)
				method6587(aClass167_7262, aClass557Array7251[i_197_], i);
			for (int i_198_ = 0; i_198_ < anInt7252; i_198_++)
				method6587(aClass167_7262, aClass557Array7258[i_198_], i);
			aClass548_7247.anInt7304 = 0;
			if (anInt7254 > 0) {
				int i_199_ = anIntArray7240.length;
				int i_200_ = i_199_ - i_199_ & 0x7;
				int i_201_ = 0;
				while (i_201_ < i_200_) {
					anIntArray7240[i_201_++] = 2147483647;
					anIntArray7240[i_201_++] = 2147483647;
					anIntArray7240[i_201_++] = 2147483647;
					anIntArray7240[i_201_++] = 2147483647;
					anIntArray7240[i_201_++] = 2147483647;
					anIntArray7240[i_201_++] = 2147483647;
					anIntArray7240[i_201_++] = 2147483647;
					anIntArray7240[i_201_++] = 2147483647;
				}
				while (i_201_ < i_199_)
					anIntArray7240[i_201_++] = 2147483647;
				aClass548_7247.anInt7302 = 1;
				for (int i_202_ = 0; i_202_ < anInt7254; i_202_++) {
					Class557 class557 = aClass557Array7248[i_202_];
					aClass548_7247.method6635(class557.aShortArray7512[0], class557.aShortArray7512[1], class557.aShortArray7512[3], class557.aShortArray7520[0], class557.aShortArray7520[1], class557.aShortArray7520[3], class557.aShortArray7527[0], class557.aShortArray7527[1], class557.aShortArray7527[3]);
					aClass548_7247.method6635(class557.aShortArray7512[1], class557.aShortArray7512[2], class557.aShortArray7512[3], class557.aShortArray7520[1], class557.aShortArray7520[2], class557.aShortArray7520[3], class557.aShortArray7527[1], class557.aShortArray7527[2], class557.aShortArray7527[3]);
				}
				aClass548_7247.anInt7302 = 2;
			}
			if (aBool7255)
				aClass553_7257.aClass29_7433.method775(90492466);
		}
	}

	public void method6604() {
		method6584();
	}
}
