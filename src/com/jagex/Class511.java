/* Class511 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class511 {
	boolean aBool6979;
	static Interface24 anInterface24_6980;
	int anInt6981;
	Class496 aClass496_6982;
	Class496[] aClass496Array6983;
	Class496[] aClass496Array6984;
	int anInt6985;
	Class581 aClass581_6986;
	int anInt6987;
	int anInt6988;
	int anInt6989;
	Class147 aClass147_6990;
	int anInt6991;
	int anInt6992;
	int anInt6993;
	int anInt6994 = 1998666919;
	int anInt6995;
	int anInt6996;
	Class176 aClass176_6997;
	byte[] aByteArray6998;
	boolean aBool6999;
	Class511 aClass511_7000;
	int anInt7001;
	int anInt7002;
	static final int anInt7003 = 512;

	public boolean method8446(Class180 class180, int i, int i_0_, byte i_1_) {
		if (i != anInt6994 * 1283413225) {
			anInt6994 = i * -1998666919;
			int i_2_ = Class203.method3783(i, 1904222168);
			if (i_2_ > 512)
				i_2_ = 512;
			if (i_2_ <= 0)
				i_2_ = 1;
			if (i_2_ != anInt6981 * 345217131) {
				anInt6981 = i_2_ * -1793829821;
				aClass147_6990 = null;
			}
			if (null != aClass496Array6983) {
				anInt6985 = 0;
				int[] is = new int[aClass496Array6983.length];
				for (int i_3_ = 0; i_3_ < aClass496Array6983.length; i_3_++) {
					Class496 class496 = aClass496Array6983[i_3_];
					if (class496.method8128(-1449638295 * anInt6993, anInt6988 * 1342728511, anInt6989 * -1352260751, 1283413225 * anInt6994)) {
						is[anInt6985 * -2143421679] = class496.anInt5564;
						aClass496Array6984[(anInt6985 += 2024429041) * -2143421679 - 1] = class496;
					}
				}
				Class605.method10048(is, aClass496Array6984, 0, -2143421679 * anInt6985 - 1, -2018731608);
			}
			aBool6979 = true;
		}
		boolean bool = false;
		if (aBool6979) {
			aBool6979 = false;
			for (int i_4_ = -2143421679 * anInt6985 - 1; i_4_ >= 0; i_4_--) {
				boolean bool_5_ = aClass496Array6984[i_4_].method8132(class180, aClass496_6982);
				Class511 class511_6_ = this;
				class511_6_.aBool6979 = class511_6_.aBool6979 | !bool_5_;
				bool |= bool_5_;
			}
		}
		if (i_0_ == 0 || !class180.method3093())
			aClass176_6997 = null;
		else if (aClass176_6997 == null && anInt6996 * -257729101 >= 0)
			method8456(class180, (byte) 1);
		if (null != aClass511_7000 && aClass511_7000 != this) {
			aClass511_7000.method8449((byte) 0);
			bool |= aClass511_7000.method8446(class180, i, i_0_, (byte) -91);
		}
		return bool;
	}

	public void method8447(int i, int i_7_, short i_8_) {
		if (aBool6999) {
			/* empty */
		}
		anInt7001 = (anInt6991 * 620833213 + i * (i_7_ - anInt6991 * 620833213) / 255) * 1793922959;
	}

	public Class511 method8448() {
		return aClass511_7000;
	}

	public void method8449(byte i) {
		aBool6999 = false;
		aClass511_7000 = null;
		anInt7001 = 0;
	}

	public boolean method8450(int i) {
		return aBool6999;
	}

	public Class511 method8451(int i) {
		return aClass511_7000;
	}

	public void method8452(int i, int i_9_) {
		if (aBool6999) {
			/* empty */
		}
		anInt7001 = (anInt6991 * 620833213 + i * (i_9_ - anInt6991 * 620833213) / 255) * 1793922959;
	}

	public void method8453(Class180 class180, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		method8455(class180, i, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, 0, i_17_, true, false, (byte) -1);
	}

	void method8454(Class180 class180, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool, boolean bool_27_, int i_28_, int i_29_) {
		int i_30_ = 255 - i_28_;
		class180.method3165();
		class180.method3242();
		if (null == aClass176_6997) {
			class180.method3136(2, 0);
			i_24_ = i_24_ + i & 0x3fff;
			if (-1 != anInt6987 * 2003510811 && 0 != anInt6981 * 345217131) {
				Class163 class163 = Class25.aClass181_237.method3544(2003510811 * anInt6987, (byte) -89);
				if (aClass147_6990 == null && (anInterface24_6980.method134(Class609.aClass609_7996, 1303945621 * class163.anInt1776, (class163.aClass595_1784 == Class595.aClass595_7814 ? Class591.aClass591_7796 : Class591.aClass591_7795), 0.7F, 345217131 * anInt6981, 345217131 * anInt6981, false, -2128229563))) {
					int[] is = (class163.aClass595_1784 == Class595.aClass595_7814 ? (anInterface24_6980.method133(Class609.aClass609_7996, 1303945621 * class163.anInt1776, 0.7F, anInt6981 * 345217131, 345217131 * anInt6981, false, 718879665)) : (anInterface24_6980.method132(Class609.aClass609_7996, 1303945621 * class163.anInt1776, 0.7F, anInt6981 * 345217131, anInt6981 * 345217131, false, (byte) -20)));
					anInt6995 = -1796249675 * is[0];
					anInt6992 = is[is.length - 1] * 266552203;
					aClass147_6990 = class180.method3163(is, 0, 1039262975 * class163.anInt1780, class163.anInt1780 * 1039262975, 1039262975 * class163.anInt1780, 1896474383);
				}
				int i_31_ = (255 == i_30_ ? (Class595.aClass595_7814 == class163.aClass595_1784 ? 1 : 0) : 1);
				if (1 == i_31_ && bool)
					class180.method3348(i_19_, i_20_, i_21_, i_22_, i_26_, 0);
				if (aClass147_6990 != null) {
					int i_32_ = i_23_ * i_22_ / -4096;
					int i_33_;
					for (i_33_ = (i_21_ - i_22_) / 2 + i_24_ * i_22_ / 4096; i_33_ > i_22_; i_33_ -= i_22_) {
						/* empty */
					}
					for (/**/; i_33_ < 0; i_33_ += i_22_) {
						/* empty */
					}
					if (Class581.aClass581_7675 == aClass581_6986) {
						for (int i_34_ = i_33_ - i_22_; i_34_ < i_21_; i_34_ += i_22_)
							aClass147_6990.method2419(i_34_ + i_19_, i_20_ + i_32_, i_22_, i_22_, 0, i_30_ << 24 | 0xffffff, i_31_);
						if ((anInt6995 * -1855222115 & ~0xffffff) != 0)
							class180.method3174(0, 0, i_21_, i_32_ + i_20_ + 1, anInt6995 * -1855222115, 257926789);
						if (0 != (anInt6992 * -172897245 & ~0xffffff))
							class180.method3174(0, i_22_ + (i_32_ + i_20_), i_21_, i_22_ - (i_32_ + i_20_ + i_22_), -172897245 * anInt6992, 1877834392);
					} else {
						for (/**/; i_32_ > i_22_; i_32_ -= i_22_) {
							/* empty */
						}
						for (/**/; i_32_ < 0; i_32_ += i_22_) {
							/* empty */
						}
						for (int i_35_ = i_33_ - i_22_; i_35_ < i_21_; i_35_ += i_22_) {
							for (int i_36_ = i_32_ - i_22_; i_36_ < i_22_; i_36_ += i_22_)
								aClass147_6990.method2419(i_35_ + i_19_, i_20_ + i_36_, i_22_, i_22_, 0, (i_30_ << 24 | 0xffffff), i_31_);
						}
					}
				}
			} else
				class180.method3348(i_19_, i_20_, i_21_, i_22_, i_30_ << 24 | i_26_, bool ? 0 : 1);
		} else if (bool_27_) {
			Class427 class427 = class180.method3364();
			Class427 class427_37_ = class180.method3364();
			class427.aFloatArray4807[2] = class427.aFloatArray4807[3];
			class427.aFloatArray4807[6] = class427.aFloatArray4807[7];
			class427.aFloatArray4807[10] = class427.aFloatArray4807[11];
			class427.aFloatArray4807[14] = class427.aFloatArray4807[15];
			class180.method3183(class427);
			method8457(class180, i_23_, i_24_, i_25_, i_28_, -621522556);
			class180.method3183(class427_37_);
		} else {
			if (bool)
				class180.method3136(3, i_26_);
			method8457(class180, i_23_, i_24_, i_25_, i_28_, 385210157);
		}
		for (int i_38_ = anInt6985 * -2143421679 - 1; i_38_ >= 0; i_38_--)
			aClass496Array6984[i_38_].method8139(class180, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, anInt6993 * -1449638295, anInt6988 * 1342728511, anInt6989 * -1352260751, i_30_);
		class180.method3136(2, 0);
		class180.method3167();
	}

	public void method8455(Class180 class180, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, boolean bool, boolean bool_47_, byte i_48_) {
		int i_49_ = 0;
		if (aBool6999)
			i_49_ = anInt7001 * 1134831471;
		if (aClass511_7000 != null) {
			Class511 class511_50_ = this;
			Class511 class511_51_ = aClass511_7000;
			if (class511_50_.hashCode() > class511_51_.hashCode()) {
				class511_50_ = aClass511_7000;
				class511_51_ = this;
				i_49_ = 255 - i_49_;
			}
			class511_50_.method8454(class180, i, i_39_, i_40_, i_41_, i_42_, i_43_, i_44_, i_45_, i_46_, bool, bool_47_, i_49_, -1715799714);
			class511_51_.method8454(class180, i, i_39_, i_40_, i_41_, i_42_, i_43_, i_44_, i_45_, i_46_, false, bool_47_, 255 - i_49_, -2130227418);
		} else {
			if (anInt6987 * 2003510811 == -1)
				class180.method3348(i_39_, i_40_, i_41_, i_42_, ~0xffffff | i_46_, 0);
			method8454(class180, i, i_39_, i_40_, i_41_, i_42_, i_43_, i_44_, i_45_, i_46_, bool, bool_47_, i_49_, -955259352);
		}
	}

	void method8456(Class180 class180, byte i) {
		try {
			boolean bool = Class269.aClass459_3121.method7552(anInt6996 * -257729101, (byte) 21);
			if (bool) {
				class180.method3157(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Class175 class175 = Class175.method2814(Class269.aClass459_3121, -257729101 * anInt6996, 0);
				aClass176_6997 = class180.method3376(class175, 1099776, 0, 255, 1);
				byte[] is = aClass176_6997.method2906();
				if (null == is)
					aByteArray6998 = null;
				else {
					aByteArray6998 = new byte[is.length];
					System.arraycopy(is, 0, aByteArray6998, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	void method8457(Class180 class180, int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		Class432 class432 = class180.method3181();
		Class432 class432_56_ = new Class432();
		class432_56_.method6894(0.0F, 0.0F, 0.0F);
		class432_56_.method6936(0.0F, -1.0F, 0.0F, Class428.method6863(-i_52_ & 0x3fff));
		class432_56_.method6936(-1.0F, 0.0F, 0.0F, Class428.method6863(-i & 0x3fff));
		class432_56_.method6936(0.0F, 0.0F, -1.0F, Class428.method6863(-i_53_ & 0x3fff));
		class180.method3180(class432_56_);
		Class432 class432_57_ = new Class432();
		if (-1406350025 * anInt7002 != i_54_) {
			aClass176_6997.method2908((byte) i_54_, aByteArray6998);
			anInt7002 = i_54_ * 339900551;
		}
		aClass176_6997.method2889(class432_57_, null, 0);
		class180.method3180(class432);
	}

	public static void method8458(Class459 class459, Class181 class181, Interface24 interface24) {
		Class269.aClass459_3121 = class459;
		Class25.aClass181_237 = class181;
		anInterface24_6980 = interface24;
	}

	public static void method8459(Class459 class459, Class181 class181, Interface24 interface24) {
		Class269.aClass459_3121 = class459;
		Class25.aClass181_237 = class181;
		anInterface24_6980 = interface24;
	}

	public boolean method8460() {
		return aBool6999;
	}

	public void method8461(int i, int i_58_) {
		if (aBool6999) {
			/* empty */
		}
		anInt7001 = (anInt6991 * 620833213 + i * (i_58_ - anInt6991 * 620833213) / 255) * 1793922959;
	}

	public void method8462(Class511 class511_59_) {
		if (aBool6999)
			anInt6991 = -2010084709 * anInt7001;
		else if (class511_59_ != null && class511_59_.aBool6999)
			anInt6991 = 558447467 - class511_59_.anInt7001 * -2010084709;
		else
			anInt6991 = 0;
		aBool6999 = true;
		aClass511_7000 = class511_59_;
		anInt7001 = 0;
	}

	public void method8463(Class511 class511_60_) {
		if (aBool6999)
			anInt6991 = -2010084709 * anInt7001;
		else if (class511_60_ != null && class511_60_.aBool6999)
			anInt6991 = 558447467 - class511_60_.anInt7001 * -2010084709;
		else
			anInt6991 = 0;
		aBool6999 = true;
		aClass511_7000 = class511_60_;
		anInt7001 = 0;
	}

	public void method8464() {
		aBool6999 = false;
		aClass511_7000 = null;
		anInt7001 = 0;
	}

	public boolean method8465() {
		return aBool6999;
	}

	void method8466(Class180 class180, int i, int i_61_, int i_62_, int i_63_) {
		Class432 class432 = class180.method3181();
		Class432 class432_64_ = new Class432();
		class432_64_.method6894(0.0F, 0.0F, 0.0F);
		class432_64_.method6936(0.0F, -1.0F, 0.0F, Class428.method6863(-i_61_ & 0x3fff));
		class432_64_.method6936(-1.0F, 0.0F, 0.0F, Class428.method6863(-i & 0x3fff));
		class432_64_.method6936(0.0F, 0.0F, -1.0F, Class428.method6863(-i_62_ & 0x3fff));
		class180.method3180(class432_64_);
		Class432 class432_65_ = new Class432();
		if (-1406350025 * anInt7002 != i_63_) {
			aClass176_6997.method2908((byte) i_63_, aByteArray6998);
			anInt7002 = i_63_ * 339900551;
		}
		aClass176_6997.method2889(class432_65_, null, 0);
		class180.method3180(class432);
	}

	public boolean method8467() {
		return aBool6999;
	}

	public Class511(int i, Class496[] class496s, int i_66_, int i_67_, int i_68_, int i_69_, Class581 class581, int i_70_) {
		aBool6979 = true;
		anInt6993 = i_67_ * 399092185;
		anInt6988 = i_68_ * -432142657;
		anInt6989 = -1712046703 * i_69_;
		anInt6987 = -912833517 * i;
		aClass496Array6983 = class496s;
		aClass581_6986 = class581;
		if (null != class496s) {
			aClass496Array6984 = new Class496[class496s.length];
			aClass496_6982 = i_66_ >= 0 ? class496s[i_66_] : null;
		} else {
			aClass496Array6984 = null;
			aClass496_6982 = null;
		}
		anInt6996 = 980851067 * i_70_;
	}

	public boolean method8468() {
		return aBool6999;
	}

	public Class511 method8469() {
		return aClass511_7000;
	}

	public void method8470(Class180 class180, int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, boolean bool, boolean bool_79_) {
		int i_80_ = 0;
		if (aBool6999)
			i_80_ = anInt7001 * 1134831471;
		if (aClass511_7000 != null) {
			Class511 class511_81_ = this;
			Class511 class511_82_ = aClass511_7000;
			if (class511_81_.hashCode() > class511_82_.hashCode()) {
				class511_81_ = aClass511_7000;
				class511_82_ = this;
				i_80_ = 255 - i_80_;
			}
			class511_81_.method8454(class180, i, i_71_, i_72_, i_73_, i_74_, i_75_, i_76_, i_77_, i_78_, bool, bool_79_, i_80_, -2116754181);
			class511_82_.method8454(class180, i, i_71_, i_72_, i_73_, i_74_, i_75_, i_76_, i_77_, i_78_, false, bool_79_, 255 - i_80_, -1897610776);
		} else {
			if (anInt6987 * 2003510811 == -1)
				class180.method3348(i_71_, i_72_, i_73_, i_74_, ~0xffffff | i_78_, 0);
			method8454(class180, i, i_71_, i_72_, i_73_, i_74_, i_75_, i_76_, i_77_, i_78_, bool, bool_79_, i_80_, -1540250939);
		}
	}

	public boolean method8471(Class180 class180, int i, int i_83_) {
		if (i != anInt6994 * 1283413225) {
			anInt6994 = i * -1998666919;
			int i_84_ = Class203.method3783(i, 2009869975);
			if (i_84_ > 512)
				i_84_ = 512;
			if (i_84_ <= 0)
				i_84_ = 1;
			if (i_84_ != anInt6981 * 345217131) {
				anInt6981 = i_84_ * -1793829821;
				aClass147_6990 = null;
			}
			if (null != aClass496Array6983) {
				anInt6985 = 0;
				int[] is = new int[aClass496Array6983.length];
				for (int i_85_ = 0; i_85_ < aClass496Array6983.length; i_85_++) {
					Class496 class496 = aClass496Array6983[i_85_];
					if (class496.method8128(-1449638295 * anInt6993, anInt6988 * 1342728511, anInt6989 * -1352260751, 1283413225 * anInt6994)) {
						is[anInt6985 * -2143421679] = class496.anInt5564;
						aClass496Array6984[(anInt6985 += 2024429041) * -2143421679 - 1] = class496;
					}
				}
				Class605.method10048(is, aClass496Array6984, 0, -2143421679 * anInt6985 - 1, -977304849);
			}
			aBool6979 = true;
		}
		boolean bool = false;
		if (aBool6979) {
			aBool6979 = false;
			for (int i_86_ = -2143421679 * anInt6985 - 1; i_86_ >= 0; i_86_--) {
				boolean bool_87_ = aClass496Array6984[i_86_].method8132(class180, aClass496_6982);
				Class511 class511_88_ = this;
				class511_88_.aBool6979 = class511_88_.aBool6979 | !bool_87_;
				bool |= bool_87_;
			}
		}
		if (i_83_ == 0 || !class180.method3093())
			aClass176_6997 = null;
		else if (aClass176_6997 == null && anInt6996 * -257729101 >= 0)
			method8456(class180, (byte) 1);
		if (null != aClass511_7000 && aClass511_7000 != this) {
			aClass511_7000.method8449((byte) 0);
			bool |= aClass511_7000.method8446(class180, i, i_83_, (byte) -49);
		}
		return bool;
	}

	void method8472(Class180 class180) {
		try {
			boolean bool = Class269.aClass459_3121.method7552(anInt6996 * -257729101, (byte) 119);
			if (bool) {
				class180.method3157(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				Class175 class175 = Class175.method2814(Class269.aClass459_3121, -257729101 * anInt6996, 0);
				aClass176_6997 = class180.method3376(class175, 1099776, 0, 255, 1);
				byte[] is = aClass176_6997.method2906();
				if (null == is)
					aByteArray6998 = null;
				else {
					aByteArray6998 = new byte[is.length];
					System.arraycopy(is, 0, aByteArray6998, 0, is.length);
				}
			}
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method8473(Class180 class180, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_) {
		method8455(class180, i, i_89_, i_90_, i_91_, i_92_, i_93_, i_94_, 0, i_96_, true, false, (byte) -104);
	}

	public void method8474(Class180 class180, int i, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_) {
		method8455(class180, i, i_97_, i_98_, i_99_, i_100_, i_101_, i_102_, 0, i_104_, true, false, (byte) 44);
	}

	public void method8475(Class180 class180, int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, boolean bool, boolean bool_113_) {
		int i_114_ = 0;
		if (aBool6999)
			i_114_ = anInt7001 * 1134831471;
		if (aClass511_7000 != null) {
			Class511 class511_115_ = this;
			Class511 class511_116_ = aClass511_7000;
			if (class511_115_.hashCode() > class511_116_.hashCode()) {
				class511_115_ = aClass511_7000;
				class511_116_ = this;
				i_114_ = 255 - i_114_;
			}
			class511_115_.method8454(class180, i, i_105_, i_106_, i_107_, i_108_, i_109_, i_110_, i_111_, i_112_, bool, bool_113_, i_114_, -1742545306);
			class511_116_.method8454(class180, i, i_105_, i_106_, i_107_, i_108_, i_109_, i_110_, i_111_, i_112_, false, bool_113_, 255 - i_114_, -1340619712);
		} else {
			if (anInt6987 * 2003510811 == -1)
				class180.method3348(i_105_, i_106_, i_107_, i_108_, ~0xffffff | i_112_, 0);
			method8454(class180, i, i_105_, i_106_, i_107_, i_108_, i_109_, i_110_, i_111_, i_112_, bool, bool_113_, i_114_, -1264761873);
		}
	}

	public void method8476(Class180 class180, int i, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, boolean bool, boolean bool_125_) {
		int i_126_ = 0;
		if (aBool6999)
			i_126_ = anInt7001 * 1134831471;
		if (aClass511_7000 != null) {
			Class511 class511_127_ = this;
			Class511 class511_128_ = aClass511_7000;
			if (class511_127_.hashCode() > class511_128_.hashCode()) {
				class511_127_ = aClass511_7000;
				class511_128_ = this;
				i_126_ = 255 - i_126_;
			}
			class511_127_.method8454(class180, i, i_117_, i_118_, i_119_, i_120_, i_121_, i_122_, i_123_, i_124_, bool, bool_125_, i_126_, -1990347952);
			class511_128_.method8454(class180, i, i_117_, i_118_, i_119_, i_120_, i_121_, i_122_, i_123_, i_124_, false, bool_125_, 255 - i_126_, -1343920685);
		} else {
			if (anInt6987 * 2003510811 == -1)
				class180.method3348(i_117_, i_118_, i_119_, i_120_, ~0xffffff | i_124_, 0);
			method8454(class180, i, i_117_, i_118_, i_119_, i_120_, i_121_, i_122_, i_123_, i_124_, bool, bool_125_, i_126_, -888081007);
		}
	}

	void method8477(Class180 class180, int i, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, boolean bool, boolean bool_137_, int i_138_) {
		int i_139_ = 255 - i_138_;
		class180.method3165();
		class180.method3242();
		if (null == aClass176_6997) {
			class180.method3136(2, 0);
			i_134_ = i_134_ + i & 0x3fff;
			if (-1 != anInt6987 * 2003510811 && 0 != anInt6981 * 345217131) {
				Class163 class163 = Class25.aClass181_237.method3544(2003510811 * anInt6987, (byte) -53);
				if (aClass147_6990 == null && (anInterface24_6980.method134(Class609.aClass609_7996, 1303945621 * class163.anInt1776, (class163.aClass595_1784 == Class595.aClass595_7814 ? Class591.aClass591_7796 : Class591.aClass591_7795), 0.7F, 345217131 * anInt6981, 345217131 * anInt6981, false, -801735568))) {
					int[] is = (class163.aClass595_1784 == Class595.aClass595_7814 ? (anInterface24_6980.method133(Class609.aClass609_7996, 1303945621 * class163.anInt1776, 0.7F, anInt6981 * 345217131, 345217131 * anInt6981, false, 99397715)) : (anInterface24_6980.method132(Class609.aClass609_7996, 1303945621 * class163.anInt1776, 0.7F, anInt6981 * 345217131, anInt6981 * 345217131, false, (byte) 76)));
					anInt6995 = -1796249675 * is[0];
					anInt6992 = is[is.length - 1] * 266552203;
					aClass147_6990 = class180.method3163(is, 0, 1039262975 * class163.anInt1780, class163.anInt1780 * 1039262975, 1039262975 * class163.anInt1780, 8611073);
				}
				int i_140_ = (255 == i_139_ ? (Class595.aClass595_7814 == class163.aClass595_1784 ? 1 : 0) : 1);
				if (1 == i_140_ && bool)
					class180.method3348(i_129_, i_130_, i_131_, i_132_, i_136_, 0);
				if (aClass147_6990 != null) {
					int i_141_ = i_133_ * i_132_ / -4096;
					int i_142_;
					for (i_142_ = (i_131_ - i_132_) / 2 + i_134_ * i_132_ / 4096; i_142_ > i_132_; i_142_ -= i_132_) {
						/* empty */
					}
					for (/**/; i_142_ < 0; i_142_ += i_132_) {
						/* empty */
					}
					if (Class581.aClass581_7675 == aClass581_6986) {
						for (int i_143_ = i_142_ - i_132_; i_143_ < i_131_; i_143_ += i_132_)
							aClass147_6990.method2419(i_143_ + i_129_, i_130_ + i_141_, i_132_, i_132_, 0, i_139_ << 24 | 0xffffff, i_140_);
						if ((anInt6995 * -1855222115 & ~0xffffff) != 0)
							class180.method3174(0, 0, i_131_, i_141_ + i_130_ + 1, anInt6995 * -1855222115, -1679163847);
						if (0 != (anInt6992 * -172897245 & ~0xffffff))
							class180.method3174(0, i_132_ + (i_141_ + i_130_), i_131_, i_132_ - (i_141_ + i_130_ + i_132_), -172897245 * anInt6992, 61300982);
					} else {
						for (/**/; i_141_ > i_132_; i_141_ -= i_132_) {
							/* empty */
						}
						for (/**/; i_141_ < 0; i_141_ += i_132_) {
							/* empty */
						}
						for (int i_144_ = i_142_ - i_132_; i_144_ < i_131_; i_144_ += i_132_) {
							for (int i_145_ = i_141_ - i_132_; i_145_ < i_132_; i_145_ += i_132_)
								aClass147_6990.method2419(i_144_ + i_129_, i_130_ + i_145_, i_132_, i_132_, 0, (i_139_ << 24 | 0xffffff), i_140_);
						}
					}
				}
			} else
				class180.method3348(i_129_, i_130_, i_131_, i_132_, i_139_ << 24 | i_136_, bool ? 0 : 1);
		} else if (bool_137_) {
			Class427 class427 = class180.method3364();
			Class427 class427_146_ = class180.method3364();
			class427.aFloatArray4807[2] = class427.aFloatArray4807[3];
			class427.aFloatArray4807[6] = class427.aFloatArray4807[7];
			class427.aFloatArray4807[10] = class427.aFloatArray4807[11];
			class427.aFloatArray4807[14] = class427.aFloatArray4807[15];
			class180.method3183(class427);
			method8457(class180, i_133_, i_134_, i_135_, i_138_, -965891551);
			class180.method3183(class427_146_);
		} else {
			if (bool)
				class180.method3136(3, i_136_);
			method8457(class180, i_133_, i_134_, i_135_, i_138_, 1228394425);
		}
		for (int i_147_ = anInt6985 * -2143421679 - 1; i_147_ >= 0; i_147_--)
			aClass496Array6984[i_147_].method8139(class180, i_129_, i_130_, i_131_, i_132_, i_133_, i_134_, anInt6993 * -1449638295, anInt6988 * 1342728511, anInt6989 * -1352260751, i_139_);
		class180.method3136(2, 0);
		class180.method3167();
	}

	public void method8478(Class180 class180, int i, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, boolean bool, boolean bool_156_) {
		int i_157_ = 0;
		if (aBool6999)
			i_157_ = anInt7001 * 1134831471;
		if (aClass511_7000 != null) {
			Class511 class511_158_ = this;
			Class511 class511_159_ = aClass511_7000;
			if (class511_158_.hashCode() > class511_159_.hashCode()) {
				class511_158_ = aClass511_7000;
				class511_159_ = this;
				i_157_ = 255 - i_157_;
			}
			class511_158_.method8454(class180, i, i_148_, i_149_, i_150_, i_151_, i_152_, i_153_, i_154_, i_155_, bool, bool_156_, i_157_, -1700432205);
			class511_159_.method8454(class180, i, i_148_, i_149_, i_150_, i_151_, i_152_, i_153_, i_154_, i_155_, false, bool_156_, 255 - i_157_, -1501395764);
		} else {
			if (anInt6987 * 2003510811 == -1)
				class180.method3348(i_148_, i_149_, i_150_, i_151_, ~0xffffff | i_155_, 0);
			method8454(class180, i, i_148_, i_149_, i_150_, i_151_, i_152_, i_153_, i_154_, i_155_, bool, bool_156_, i_157_, -655838991);
		}
	}

	void method8479(Class180 class180, int i, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, boolean bool, boolean bool_168_, int i_169_) {
		int i_170_ = 255 - i_169_;
		class180.method3165();
		class180.method3242();
		if (null == aClass176_6997) {
			class180.method3136(2, 0);
			i_165_ = i_165_ + i & 0x3fff;
			if (-1 != anInt6987 * 2003510811 && 0 != anInt6981 * 345217131) {
				Class163 class163 = Class25.aClass181_237.method3544(2003510811 * anInt6987, (byte) -72);
				if (aClass147_6990 == null && (anInterface24_6980.method134(Class609.aClass609_7996, 1303945621 * class163.anInt1776, (class163.aClass595_1784 == Class595.aClass595_7814 ? Class591.aClass591_7796 : Class591.aClass591_7795), 0.7F, 345217131 * anInt6981, 345217131 * anInt6981, false, 1069592705))) {
					int[] is = (class163.aClass595_1784 == Class595.aClass595_7814 ? (anInterface24_6980.method133(Class609.aClass609_7996, 1303945621 * class163.anInt1776, 0.7F, anInt6981 * 345217131, 345217131 * anInt6981, false, -1741221455)) : (anInterface24_6980.method132(Class609.aClass609_7996, 1303945621 * class163.anInt1776, 0.7F, anInt6981 * 345217131, anInt6981 * 345217131, false, (byte) 5)));
					anInt6995 = -1796249675 * is[0];
					anInt6992 = is[is.length - 1] * 266552203;
					aClass147_6990 = class180.method3163(is, 0, 1039262975 * class163.anInt1780, class163.anInt1780 * 1039262975, 1039262975 * class163.anInt1780, -1283139577);
				}
				int i_171_ = (255 == i_170_ ? (Class595.aClass595_7814 == class163.aClass595_1784 ? 1 : 0) : 1);
				if (1 == i_171_ && bool)
					class180.method3348(i_160_, i_161_, i_162_, i_163_, i_167_, 0);
				if (aClass147_6990 != null) {
					int i_172_ = i_164_ * i_163_ / -4096;
					int i_173_;
					for (i_173_ = (i_162_ - i_163_) / 2 + i_165_ * i_163_ / 4096; i_173_ > i_163_; i_173_ -= i_163_) {
						/* empty */
					}
					for (/**/; i_173_ < 0; i_173_ += i_163_) {
						/* empty */
					}
					if (Class581.aClass581_7675 == aClass581_6986) {
						for (int i_174_ = i_173_ - i_163_; i_174_ < i_162_; i_174_ += i_163_)
							aClass147_6990.method2419(i_174_ + i_160_, i_161_ + i_172_, i_163_, i_163_, 0, i_170_ << 24 | 0xffffff, i_171_);
						if ((anInt6995 * -1855222115 & ~0xffffff) != 0)
							class180.method3174(0, 0, i_162_, i_172_ + i_161_ + 1, anInt6995 * -1855222115, -43441375);
						if (0 != (anInt6992 * -172897245 & ~0xffffff))
							class180.method3174(0, i_163_ + (i_172_ + i_161_), i_162_, i_163_ - (i_172_ + i_161_ + i_163_), -172897245 * anInt6992, -751310376);
					} else {
						for (/**/; i_172_ > i_163_; i_172_ -= i_163_) {
							/* empty */
						}
						for (/**/; i_172_ < 0; i_172_ += i_163_) {
							/* empty */
						}
						for (int i_175_ = i_173_ - i_163_; i_175_ < i_162_; i_175_ += i_163_) {
							for (int i_176_ = i_172_ - i_163_; i_176_ < i_163_; i_176_ += i_163_)
								aClass147_6990.method2419(i_175_ + i_160_, i_161_ + i_176_, i_163_, i_163_, 0, (i_170_ << 24 | 0xffffff), i_171_);
						}
					}
				}
			} else
				class180.method3348(i_160_, i_161_, i_162_, i_163_, i_170_ << 24 | i_167_, bool ? 0 : 1);
		} else if (bool_168_) {
			Class427 class427 = class180.method3364();
			Class427 class427_177_ = class180.method3364();
			class427.aFloatArray4807[2] = class427.aFloatArray4807[3];
			class427.aFloatArray4807[6] = class427.aFloatArray4807[7];
			class427.aFloatArray4807[10] = class427.aFloatArray4807[11];
			class427.aFloatArray4807[14] = class427.aFloatArray4807[15];
			class180.method3183(class427);
			method8457(class180, i_164_, i_165_, i_166_, i_169_, 1016952149);
			class180.method3183(class427_177_);
		} else {
			if (bool)
				class180.method3136(3, i_167_);
			method8457(class180, i_164_, i_165_, i_166_, i_169_, -962528067);
		}
		for (int i_178_ = anInt6985 * -2143421679 - 1; i_178_ >= 0; i_178_--)
			aClass496Array6984[i_178_].method8139(class180, i_160_, i_161_, i_162_, i_163_, i_164_, i_165_, anInt6993 * -1449638295, anInt6988 * 1342728511, anInt6989 * -1352260751, i_170_);
		class180.method3136(2, 0);
		class180.method3167();
	}

	public void method8480() {
		aBool6999 = false;
		aClass511_7000 = null;
		anInt7001 = 0;
	}

	void method8481(Class180 class180, int i, int i_179_, int i_180_, int i_181_) {
		Class432 class432 = class180.method3181();
		Class432 class432_182_ = new Class432();
		class432_182_.method6894(0.0F, 0.0F, 0.0F);
		class432_182_.method6936(0.0F, -1.0F, 0.0F, Class428.method6863(-i_179_ & 0x3fff));
		class432_182_.method6936(-1.0F, 0.0F, 0.0F, Class428.method6863(-i & 0x3fff));
		class432_182_.method6936(0.0F, 0.0F, -1.0F, Class428.method6863(-i_180_ & 0x3fff));
		class180.method3180(class432_182_);
		Class432 class432_183_ = new Class432();
		if (-1406350025 * anInt7002 != i_181_) {
			aClass176_6997.method2908((byte) i_181_, aByteArray6998);
			anInt7002 = i_181_ * 339900551;
		}
		aClass176_6997.method2889(class432_183_, null, 0);
		class180.method3180(class432);
	}

	public void method8482(Class511 class511_184_, byte i) {
		if (aBool6999)
			anInt6991 = -2010084709 * anInt7001;
		else if (class511_184_ != null && class511_184_.aBool6999)
			anInt6991 = 558447467 - class511_184_.anInt7001 * -2010084709;
		else
			anInt6991 = 0;
		aBool6999 = true;
		aClass511_7000 = class511_184_;
		anInt7001 = 0;
	}

	static Class574 method8483(int i, int i_185_) {
		Class574[] class574s = Class278.method5163(-1904482821);
		for (int i_186_ = 0; i_186_ < class574s.length; i_186_++) {
			Class574 class574 = class574s[i_186_];
			if (i == 691356409 * class574.anInt7635)
				return class574;
		}
		return null;
	}

	static final void method8484(Class665 class665, int i) {
		int i_187_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_187_, -869785435);
		Class240 class240 = Class183.aClass240Array2100[i_187_ >> 16];
		Class702.method14298(class243, class240, class665, 1472698582);
	}

	static final void method8485(Class665 class665, int i) {
		int i_188_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class671.aClass97_8584.method1735(i_188_, 774694292);
	}
}
