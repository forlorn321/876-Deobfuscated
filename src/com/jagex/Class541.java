/* Class541 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class541 {
	static int method9013(int i) {
		if (i == 9 || 10 == i)
			return 1;
		if (i == 11)
			return 8;
		return i;
	}

	static int method9014(int i, int i_0_) {
		if (9 == i_0_)
			i = 1 + i & 0x3;
		if (i_0_ == 10)
			i = 3 + i & 0x3;
		if (11 == i_0_)
			i = i + 3 & 0x3;
		return i;
	}

	static int method9015(int i) {
		if (i == 9 || 10 == i)
			return 1;
		if (i == 11)
			return 8;
		return i;
	}

	static int method9016(int i) {
		if (i == 9 || 10 == i)
			return 1;
		if (i == 11)
			return 8;
		return i;
	}

	Class541() throws Throwable {
		throw new Error();
	}

	public static byte[][][] method9017(int i) {
		byte[][][] is = new byte[8][4][];
		int i_1_ = i;
		int i_2_ = i;
		byte[] is_3_ = new byte[i_1_ * i_2_];
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
				if (i_6_ <= i_5_)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[0][0] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_7_ = i_2_ - 1; i_7_ >= 0; i_7_--) {
			for (int i_8_ = 0; i_8_ < i_2_; i_8_++) {
				if (i_8_ <= i_7_)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[0][1] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_9_ = 0; i_9_ < i_2_; i_9_++) {
			for (int i_10_ = 0; i_10_ < i_1_; i_10_++) {
				if (i_10_ >= i_9_)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[0][2] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_11_ = i_2_ - 1; i_11_ >= 0; i_11_--) {
			for (int i_12_ = 0; i_12_ < i_1_; i_12_++) {
				if (i_12_ >= i_11_)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[0][3] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_13_ = i_2_ - 1; i_13_ >= 0; i_13_--) {
			for (int i_14_ = 0; i_14_ < i_1_; i_14_++) {
				if (i_14_ <= i_13_ >> 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[1][0] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
			for (int i_16_ = 0; i_16_ < i_1_; i_16_++) {
				if (i_4_ < 0 || i_4_ >= is_3_.length)
					i_4_++;
				else {
					if (i_16_ >= i_15_ << 1)
						is_3_[i_4_] = (byte) -1;
					i_4_++;
				}
			}
		}
		is[1][1] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_17_ = 0; i_17_ < i_2_; i_17_++) {
			for (int i_18_ = i_1_ - 1; i_18_ >= 0; i_18_--) {
				if (i_18_ <= i_17_ >> 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[1][2] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_19_ = i_2_ - 1; i_19_ >= 0; i_19_--) {
			for (int i_20_ = i_1_ - 1; i_20_ >= 0; i_20_--) {
				if (i_20_ >= i_19_ << 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[1][3] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_21_ = i_2_ - 1; i_21_ >= 0; i_21_--) {
			for (int i_22_ = i_1_ - 1; i_22_ >= 0; i_22_--) {
				if (i_22_ <= i_21_ >> 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[2][0] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_23_ = i_2_ - 1; i_23_ >= 0; i_23_--) {
			for (int i_24_ = 0; i_24_ < i_1_; i_24_++) {
				if (i_24_ >= i_23_ << 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[2][1] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_25_ = 0; i_25_ < i_2_; i_25_++) {
			for (int i_26_ = 0; i_26_ < i_1_; i_26_++) {
				if (i_26_ <= i_25_ >> 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[2][2] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_27_ = 0; i_27_ < i_2_; i_27_++) {
			for (int i_28_ = i_1_ - 1; i_28_ >= 0; i_28_--) {
				if (i_28_ >= i_27_ << 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[2][3] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_29_ = i_2_ - 1; i_29_ >= 0; i_29_--) {
			for (int i_30_ = 0; i_30_ < i_1_; i_30_++) {
				if (i_30_ >= i_29_ >> 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[3][0] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
			for (int i_32_ = 0; i_32_ < i_1_; i_32_++) {
				if (i_32_ <= i_31_ << 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[3][1] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_33_ = 0; i_33_ < i_2_; i_33_++) {
			for (int i_34_ = i_1_ - 1; i_34_ >= 0; i_34_--) {
				if (i_34_ >= i_33_ >> 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[3][2] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_35_ = i_2_ - 1; i_35_ >= 0; i_35_--) {
			for (int i_36_ = i_1_ - 1; i_36_ >= 0; i_36_--) {
				if (i_36_ <= i_35_ << 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[3][3] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_37_ = i_2_ - 1; i_37_ >= 0; i_37_--) {
			for (int i_38_ = i_1_ - 1; i_38_ >= 0; i_38_--) {
				if (i_38_ >= i_37_ >> 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[4][0] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_39_ = i_2_ - 1; i_39_ >= 0; i_39_--) {
			for (int i_40_ = 0; i_40_ < i_1_; i_40_++) {
				if (i_40_ <= i_39_ << 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[4][1] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_41_ = 0; i_41_ < i_2_; i_41_++) {
			for (int i_42_ = 0; i_42_ < i_1_; i_42_++) {
				if (i_42_ >= i_41_ >> 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[4][2] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_43_ = 0; i_43_ < i_2_; i_43_++) {
			for (int i_44_ = i_1_ - 1; i_44_ >= 0; i_44_--) {
				if (i_44_ <= i_43_ << 1)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[4][3] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_45_ = 0; i_45_ < i_2_; i_45_++) {
			for (int i_46_ = 0; i_46_ < i_1_; i_46_++) {
				if (i_46_ <= i_1_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[5][0] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_47_ = 0; i_47_ < i_2_; i_47_++) {
			for (int i_48_ = 0; i_48_ < i_1_; i_48_++) {
				if (i_47_ <= i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[5][1] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_49_ = 0; i_49_ < i_2_; i_49_++) {
			for (int i_50_ = 0; i_50_ < i_1_; i_50_++) {
				if (i_50_ >= i_1_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[5][2] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_51_ = 0; i_51_ < i_2_; i_51_++) {
			for (int i_52_ = 0; i_52_ < i_1_; i_52_++) {
				if (i_51_ >= i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[5][3] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_53_ = 0; i_53_ < i_2_; i_53_++) {
			for (int i_54_ = 0; i_54_ < i_1_; i_54_++) {
				if (i_54_ <= i_53_ - i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[6][0] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_55_ = i_2_ - 1; i_55_ >= 0; i_55_--) {
			for (int i_56_ = 0; i_56_ < i_1_; i_56_++) {
				if (i_56_ <= i_55_ - i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[6][1] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_57_ = i_2_ - 1; i_57_ >= 0; i_57_--) {
			for (int i_58_ = i_1_ - 1; i_58_ >= 0; i_58_--) {
				if (i_58_ <= i_57_ - i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[6][2] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_59_ = 0; i_59_ < i_2_; i_59_++) {
			for (int i_60_ = i_1_ - 1; i_60_ >= 0; i_60_--) {
				if (i_60_ <= i_59_ - i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[6][3] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_61_ = 0; i_61_ < i_2_; i_61_++) {
			for (int i_62_ = 0; i_62_ < i_1_; i_62_++) {
				if (i_62_ >= i_61_ - i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[7][0] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_63_ = i_2_ - 1; i_63_ >= 0; i_63_--) {
			for (int i_64_ = 0; i_64_ < i_1_; i_64_++) {
				if (i_64_ >= i_63_ - i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[7][1] = is_3_;
		is_3_ = new byte[i_1_ * i_2_];
		i_4_ = 0;
		for (int i_65_ = i_2_ - 1; i_65_ >= 0; i_65_--) {
			for (int i_66_ = i_1_ - 1; i_66_ >= 0; i_66_--) {
				if (i_66_ >= i_65_ - i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[7][2] = is_3_;
		is_3_ = new byte[i_2_ * i_1_];
		i_4_ = 0;
		for (int i_67_ = 0; i_67_ < i_2_; i_67_++) {
			for (int i_68_ = i_1_ - 1; i_68_ >= 0; i_68_--) {
				if (i_68_ >= i_67_ - i_2_ / 2)
					is_3_[i_4_] = (byte) -1;
				i_4_++;
			}
		}
		is[7][3] = is_3_;
		return is;
	}

	public static Class467[] method9018(byte i) {
		return (new Class467[] { Class467.aClass467_5315, Class467.aClass467_5316, Class467.aClass467_5317 });
	}

	static final void method9019(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_69_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_70_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		int i_71_ = client.aClass492ArrayArray11272[i_70_][i_69_].method7985(1769813785);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0 == i_71_ ? 1 : 0;
	}

	static final void method9020(Class665 class665, int i) {
		class665.anInt8526 -= 409523364;
		int i_72_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_73_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		int i_74_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		int i_75_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 3];
		Class592 class592 = client.aClass509_11072.method8283((short) 24873);
		Class352.method6212(((i_72_ >> 14 & 0x3fff) - class592.anInt7798 * 153371143), ((i_72_ & 0x3fff) - class592.anInt7799 * -2029646807), i_73_ << 2, i_74_, i_75_, false, (byte) -9);
		client.aBool11119 = true;
	}

	static void method9021(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int i) {
		if (class640_sub1_sub2_sub1 instanceof Class640_Sub1_Sub2_Sub1_Sub1) {
			Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = (Class640_Sub1_Sub2_Sub1_Sub1) class640_sub1_sub2_sub1;
			if (null != class640_sub1_sub2_sub1_sub1.aClass295_12168)
				Class24_Sub3.method17353(class640_sub1_sub2_sub1_sub1, ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) != (class640_sub1_sub2_sub1_sub1.aByte10864)), 1791647807);
		} else if (class640_sub1_sub2_sub1 instanceof Class640_Sub1_Sub2_Sub1_Sub2) {
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (Class640_Sub1_Sub2_Sub1_Sub2) class640_sub1_sub2_sub1;
			Class108.method1938(class640_sub1_sub2_sub1_sub2, ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) != class640_sub1_sub2_sub1_sub2.aByte10864), (byte) 1);
		}
	}

	static final void method9022(Class665 class665, short i) {
		int i_76_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (-405609043 * client.anInt11083 == 2 && i_76_ < -67152419 * client.anInt11261)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = client.aClass69Array11297[i_76_].aBool780 ? 1 : 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static int method9023(int i) {
		if (Class204.aClass527_Sub31_2213.aClass700_Sub38_10630.method17286(1789493567) == 0) {
			for (int i_77_ = 0; i_77_ < 1422154267 * client.anInt11038; i_77_++) {
				if (client.anInterface64Array11039[i_77_].method418((byte) 118) == 's' || client.anInterface64Array11039[i_77_].method418((byte) 104) == 'S') {
					Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub38_10630, 1, 888903396);
					client.aBool11000 = true;
					Class216.method3966(Class41.aClass41_451, -1525458735);
					break;
				}
			}
		}
		if (Class310.aClass310_3480 == Class593.aClass310_7804) {
			if (Class309.aClass440_3464 == null)
				Class309.aClass440_3464 = new Class440(Class454.aClass452_4972, Class389_Sub3.aClass468_10272, Class26_Sub1.aClass461_10572, Class52.GRAB_PUBLIC_EXPONENT, Class52.GRAB_PUBLIC_MODULUS);
			if (!Class309.aClass440_3464.method7099((byte) -41))
				return 0;
			Class306.method5606(0, null, true, -1934367178);
			Class527_Sub22.aBool10492 = !Class693.method14075((byte) -99);
			Class290.aClass459_3228 = Class642.method10728((Class527_Sub22.aBool10492 ? Class36.aClass36_409 : Class36.aClass36_407), false, 1, true, true, -1345084543);
			Class142.aClass459_1658 = Class642.method10728(Class36.aClass36_408, false, 1, true, true, -1345084543);
			Class272.aClass459_3136 = Class642.method10728(Class36.aClass36_389, false, 1, true, true, -1345084543);
			Class616.aClass459_8091 = Class642.method10728(Class36.aClass36_403, true, 1, true, true, -1345084543);
		}
		if (Class593.aClass310_7804 == Class310.aClass310_3479) {
			boolean bool = Class142.aClass459_1658.method7482(-414567928);
			boolean bool_78_ = Class616.aClass459_8091.method7482(-715147914);
			int i_79_ = Class711.aClass457_Sub1Array8857[Class36.aClass36_408.method1134((byte) -7)].method15875(-1654831237);
			i_79_ = i_79_ + Class711.aClass457_Sub1Array8857[(Class527_Sub22.aBool10492 ? Class36.aClass36_409.method1134((byte) 69) : Class36.aClass36_407.method1134((byte) -31))].method15875(-1978868118);
			i_79_ += Class711.aClass457_Sub1Array8857[Class36.aClass36_389.method1134((byte) -30)].method15875(-1683740298);
			i_79_ = i_79_ + (bool_78_ ? 100 : Class616.aClass459_8091.method7484(819825252));
			i_79_ = i_79_ + (bool ? 100 : Class142.aClass459_1658.method7484(679177915));
			if (500 != i_79_)
				return i_79_ / 5;
			Class536.aClass615_7224 = new Class615(Class616.aClass459_8091);
			Class318.method5688(Class536.aClass615_7224, 1875851442);
			int i_80_ = Class204.aClass527_Sub31_2213.aClass700_Sub29_10612.method17209(-1146924155);
			Class290.aClass90_3227 = new Class90(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class142.aClass459_1658);
			Class82[] class82s = Class290.aClass90_3227.method1636(i_80_, (byte) -51);
			if (class82s.length == 0)
				class82s = Class290.aClass90_3227.method1636(0, (byte) -124);
			Class332 class332 = new Class332(Class290.aClass459_3228, Class272.aClass459_3136);
			if (class82s.length > 0) {
				Class290.anInterface31Array3225 = new Interface31[class82s.length];
				for (int i_81_ = 0; i_81_ < Class290.anInterface31Array3225.length; i_81_++)
					Class290.anInterface31Array3225[i_81_] = new Class299((Class290.aClass90_3227.method1635((class82s[i_81_].anInt809 * -2094833241), 866809081)), class82s[i_81_].anInt810 * -1005918235, 744283599 * class82s[i_81_].anInt811, class332);
			}
		}
		if (Class593.aClass310_7804 == Class310.aClass310_3483)
			Class211.aClass420_2256 = new Class420(Class402.aClass180_4150, Class290.aClass459_3228, Class272.aClass459_3136, Class211.method3875((byte) 1));
		if (Class310.aClass310_3468 == Class593.aClass310_7804) {
			int i_82_ = Class211.aClass420_2256.method6677((byte) -23);
			int i_83_ = Class211.aClass420_2256.method6681((byte) -23);
			if (i_82_ < i_83_)
				return i_82_ * 100 / i_83_;
		}
		if (Class593.aClass310_7804 == Class310.aClass310_3469) {
			if (null != Class290.anInterface31Array3225 && Class290.anInterface31Array3225.length > 0) {
				if (Class290.anInterface31Array3225[0].method181(390450049) < 100)
					return 0;
				if (Class290.anInterface31Array3225.length > 1 && Class290.aClass90_3227.method1637(86162738) && (Class290.anInterface31Array3225[1].method181(180936145) < 100))
					return 0;
			}
			Class211.aClass420_2256.method6707(client.anInterface50_11053, 27833036);
			Class684.method13926(Class402.aClass180_4150, 736955329);
			Class78.method1560(15, (byte) 0);
		}
		if (Class310.aClass310_3470 == Class593.aClass310_7804) {
			Class338.aClass459_3656 = Class642.method10728(Class36.aClass36_386, false, 1, false, true, -1345084543);
			Class561.aClass459_7563 = Class642.method10728(Class36.aClass36_414, false, 1, false, true, -1345084543);
			client.aClass459_11154 = Class642.method10728(Class36.aClass36_381, false, 1, false, true, -1345084543);
			Class411.aClass459_4370 = Class642.method10728(Class36.aClass36_382, false, 1, true, true, -1345084543);
			Class388.aClass459_3990 = Class642.method10728(Class36.aClass36_420, false, 1, true, true, -1345084543);
			Class216.aClass459_2280 = Class642.method10728(Class36.aClass36_387, false, 1, true, true, -1345084543);
			Class64.aClass459_743 = Class642.method10728(Class36.aClass36_394, true, 1, false, true, -1345084543);
			Class208_Sub12.aClass459_9930 = Class642.method10728(Class36.aClass36_413, false, 1, false, true, -1345084543);
			Class681.aClass459_8643 = Class642.method10728(Class36.aClass36_396, true, 1, false, true, -1345084543);
			Class58.aClass459_721 = Class642.method10728(Class36.aClass36_415, true, 1, false, true, -1345084543);
			Class31.aClass459_266 = Class642.method10728(Class36.aClass36_397, false, 1, false, true, -1345084543);
			Class293_Sub1.aClass459_10041 = Class642.method10728(Class36.aClass36_388, false, 1, true, true, -1345084543);
			Class205.aClass459_2219 = Class642.method10728(Class36.aClass36_398, true, 1, false, false, -1345084543);
			Class620.aClass459_8118 = Class642.method10728(Class36.aClass36_411, true, 1, false, false, -1345084543);
			Class636.aClass459_8304 = Class642.method10728(Class36.aClass36_391, false, 1, true, true, -1345084543);
			Class102.aClass459_1237 = Class642.method10728(Class36.aClass36_418, false, 1, true, true, -1345084543);
			Class527_Sub1.aClass459_10336 = Class642.method10728(Class36.aClass36_393, false, 1, true, true, -1345084543);
			Class508.aClass459_6924 = Class642.method10728(Class36.aClass36_390, false, 1, true, true, -1345084543);
			Class217.aClass459_2283 = Class642.method10728(Class36.aClass36_395, false, 1, true, true, -1345084543);
			Class24.aClass459_234 = Class642.method10728(Class36.aClass36_402, false, 1, true, true, -1345084543);
			Class675.aClass459_8591 = Class642.method10728(Class36.aClass36_380, false, 1, true, true, -1345084543);
			Class596.aClass459_7845 = Class642.method10728(Class36.aClass36_385, true, 1, false, false, -1345084543);
			Class509.aClass459_6970 = Class642.method10728(Class36.aClass36_412, true, 1, false, true, -1345084543);
			Class467.aClass459_5319 = Class642.method10728(Class36.aClass36_399, false, 1, true, true, -1345084543);
			Class456_Sub1.aClass459_10324 = Class642.method10728(Class36.aClass36_400, false, 1, true, true, -1345084543);
			InputStream_Sub1.aClass459_10985 = Class642.method10728(Class36.aClass36_401, true, 1, true, true, -1345084543);
			Class684.aClass459_8654 = Class642.method10728(Class36.aClass36_392, false, 1, true, true, -1345084543);
			Class87.aClass459_827 = Class642.method10728(Class36.aClass36_404, false, 1, true, true, -1345084543);
			Class186.aClass459_2118 = Class642.method10728(Class36.aClass36_410, true, 1, false, true, -1345084543);
			Class461.aClass459_5094 = Class642.method10728(Class36.aClass36_405, true, 1, false, true, -1345084543);
			Class478.aClass459_5395 = Class642.method10728(Class36.aClass36_419, true, 1, true, true, -1345084543);
		}
		if (Class310.aClass310_3471 == Class593.aClass310_7804) {
			int i_84_ = 0;
			int i_85_ = 0;
			for (int i_86_ = 0; i_86_ < Class711.aClass457_Sub1Array8857.length; i_86_++) {
				if (Class711.aClass457_Sub1Array8857[i_86_] != null) {
					i_84_ += Class711.aClass457_Sub1Array8857[i_86_].method15875(-1980992001);
					i_85_++;
				}
			}
			if (i_85_ > 0)
				i_84_ /= i_85_;
			if (100 != i_84_) {
				if (Class290.anInt3233 * -1948096031 < 0)
					Class290.anInt3233 = i_84_ * -302015967;
				return ((i_84_ - Class290.anInt3233 * -1948096031) * 100 / (100 - -1948096031 * Class290.anInt3233));
			}
			Class224.method4185(Class536.aClass615_7224, (byte) 66);
			Class211.aClass420_2256 = new Class420(Class402.aClass180_4150, Class338.aClass459_3656, Class272.aClass459_3136, Class211.method3875((byte) 1));
		}
		if (Class593.aClass310_7804 == Class310.aClass310_3465) {
			byte[] is = Class616.aClass459_8091.method7512((Class632.aClass632_8261.anInt8258) * 1088756673, 1447980132);
			if (null == is)
				return 0;
			Class245.aClass226_2698 = new Class226();
			Class245.aClass226_2698.method4259(50, 7340032, -1829234168);
			Class321.method5702(is, 1986465670);
			Class78.method1560(12, (byte) 0);
		}
		if (Class593.aClass310_7804 == Class310.aClass310_3473 && Class234.aClass539_2374 == null) {
			Class234.aClass539_2374 = new Class539(Class461.aClass459_5094);
			Class178.method3065(Class234.aClass539_2374, (byte) 1);
		}
		if (Class310.aClass310_3474 == Class593.aClass310_7804) {
			int i_87_ = Class174_Sub1.method14593(-1471723370);
			if (i_87_ < 100)
				return i_87_;
			Class191.method3686((Class616.aClass459_8091.method7512((1088756673 * Class632.aClass632_8268.anInt8258), 1447980132)), -940009572);
			Class193.aShortArrayArray2156 = Class536.aClass615_7224.aShortArrayArray8054;
			Class487.aShortArrayArrayArray5470 = Class536.aClass615_7224.aShortArrayArrayArray8055;
			Class552.aShortArrayArray7313 = Class536.aClass615_7224.aShortArrayArray8056;
			Class78.aShortArrayArrayArray802 = Class536.aClass615_7224.aShortArrayArrayArray8057;
			if (Class536.aClass615_7224.anInt8062 * -647050191 != -1 && -1 != 1843425819 * Class536.aClass615_7224.anInt8082) {
				client.anInt11158 = -1241064323 * Class536.aClass615_7224.anInt8062;
				client.anInt11058 = -615994007 * Class536.aClass615_7224.anInt8082;
			}
			Class443.aClass616_4922 = new Class616(Class616.aClass459_8091);
			Class525.aClass610_7102 = new Class610(Class616.aClass459_8091);
			Class271.aClass624_3128 = new Class624(Class616.aClass459_8091);
			Class490.aClass617_5473 = new Class617(Class616.aClass459_8091);
			Class529.aClass630_7122 = new Class630(Class616.aClass459_8091);
		}
		if (Class593.aClass310_7804 == Class310.aClass310_3475) {
			if (-1 != Class536.aClass615_7224.anInt8047 * 746708507 && !(Class208_Sub12.aClass459_9930.method7479(746708507 * Class536.aClass615_7224.anInt8047, 0, 102380841)))
				return 99;
			Class143.aClass181_1669 = new Class181(InputStream_Sub1.aClass459_10985);
			Class226.anInterface24_2350 = new Class170_Sub1(Class681.aClass459_8643, Class58.aClass459_721);
			Class679.aClass24_Sub21_8628 = new Class24_Sub21(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class258.aClass24_Sub2_2827 = new Class24_Sub2(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class312.aClass24_Sub11_3497 = new Class24_Sub11(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class338.aClass459_3656);
			Class431.aClass24_4851 = new Class24(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class657.aClass657_8435, 64, new Class43(com.jagex.Class4.class));
			Class208_Sub2.aClass24_9868 = new Class24(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class657.aClass657_8466, 16, new Class43(com.jagex.Class84.class));
			Class664.aClass24_Sub15_8519 = new Class24_Sub15(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class102.aClass459_1237);
			Class153.aClass24_Sub14_1716 = new Class24_Sub14(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class317.aClass24_Sub5_3533 = new Class24_Sub5(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class234.aClass24_Sub18_2375 = new Class24_Sub18(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class338.aClass459_3656);
			Class536_Sub1.aClass24_Sub13_10343 = new Class24_Sub13(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class338.aClass459_3656);
			Class587.aClass24_Sub19_7760 = new Class24_Sub19(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class208_Sub12.aClass459_9930);
			Class527_Sub26.aClass24_Sub20_10523 = new Class24_Sub20(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class482.aClass24_Sub22_5430 = new Class24_Sub22(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class457_Sub1.aClass24_Sub6_10251 = new Class24_Sub6(client.aClass678_11259, Class144_Sub1.aClass671_8995, true, Class636.aClass459_8304, Class208_Sub12.aClass459_9930);
			client.aClass509_11072.method8301(Class457_Sub1.aClass24_Sub6_10251, -730230549);
			Class396.aClass506_4119.method8228(new Class24_Sub6(client.aClass678_11259, Class144_Sub1.aClass671_8995, true, Class636.aClass459_8304, Class208_Sub12.aClass459_9930), (byte) 21);
			Class457.aClass24_Sub12_5063 = new Class24_Sub12(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class338.aClass459_3656);
			Class346.aClass24_Sub8_3731 = new Class24_Sub8(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class338.aClass459_3656);
			Class381.aClass24_Sub9_3936 = new Class24_Sub9(client.aClass678_11259, Class144_Sub1.aClass671_8995, true, Class527_Sub1.aClass459_10336, Class208_Sub12.aClass459_9930);
			Class174_Sub2.aClass24_Sub17_9120 = new Class24_Sub17(client.aClass678_11259, Class144_Sub1.aClass671_8995, true, Class679.aClass24_Sub21_8628, Class508.aClass459_6924, Class208_Sub12.aClass459_9930);
			Class590.aClass62_Sub1_7793 = new Class62_Sub1(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, true);
			Class552.aClass24_Sub3_7312 = new Class24_Sub3(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class321.aClass24_Sub10_3551 = new Class24_Sub10(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class217.aClass459_2283, Class561.aClass459_7563, client.aClass459_11154, Class552.aClass24_Sub3_7312);
			Class84.aClass24_Sub1_815 = new Class24_Sub1(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class189.aClass24_Sub7_2127 = new Class24_Sub7(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class57.aClass24_Sub4_720 = new Class24_Sub4(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class24.aClass459_234, Class208_Sub12.aClass459_9930);
			Class231.aClass62_Sub2_2358 = new Class62_Sub2(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class675.aClass459_8591, true);
			Class112.aClass95_Sub1_Sub2_1406 = new Class95_Sub1_Sub2(client.aClass678_11259, Class465.aClass465_5303, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class248.aClass95_Sub1_Sub1_2731 = new Class95_Sub1_Sub1(client.aClass678_11259, Class465.aClass465_5313, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			IncomingPacket.aClass95_Sub1_Sub2_4802 = new Class95_Sub1_Sub2(client.aClass678_11259, Class465.aClass465_5302, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class499.aClass95_Sub1_Sub2_5593 = new Class95_Sub1_Sub2(client.aClass678_11259, Class465.aClass465_5301, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class333.aClass95_Sub1_Sub2_3629 = new Class95_Sub1_Sub2(client.aClass678_11259, Class465.aClass465_5308, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class104.aClass95_Sub1_Sub2_1292 = new Class95_Sub1_Sub2(client.aClass678_11259, Class465.aClass465_5309, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class98.aClass95_Sub1_Sub2_1166 = new Class95_Sub1_Sub2(client.aClass678_11259, Class465.aClass465_5306, Class144_Sub1.aClass671_8995, Class411.aClass459_4370);
			Class104.aMap1293 = (Class527_Sub35.method16380(new Class95_Sub1[] { Class112.aClass95_Sub1_Sub2_1406, Class248.aClass95_Sub1_Sub1_2731, IncomingPacket.aClass95_Sub1_Sub2_4802, Class499.aClass95_Sub1_Sub2_5593, Class333.aClass95_Sub1_Sub2_3629, Class104.aClass95_Sub1_Sub2_1292, Class98.aClass95_Sub1_Sub2_1166 }, (byte) 17));
			Class51.aClass24_Sub16_522 = new Class24_Sub16(client.aClass678_11259, Class144_Sub1.aClass671_8995, Class411.aClass459_4370, Class104.aMap1293);
			Class310.anInterface20_3490 = new Class304();
			Class602.method10011(Class216.aClass459_2280, Class208_Sub12.aClass459_9930, Class338.aClass459_3656, Class272.aClass459_3136, -2082256485);
			Class219.aClass386_2303 = new Class386(Class87.aClass459_827);
			Class643.aClass397_8346 = new Class397(Class684.aClass459_8654);
			Class659.aClass391_8496 = new Class391(Class684.aClass459_8654);
			Class708.aClass463_8847 = new Class463(Class144_Sub1.aClass671_8995, Class467.aClass459_5319, Class456_Sub1.aClass459_10324);
			Exception_Sub3.aClass51_11362 = new Class51(Class144_Sub1.aClass671_8995, Class467.aClass459_5319, Class456_Sub1.aClass459_10324, new Class398());
			Class671.aClass97_8584 = new Class97(Class248.aClass95_Sub1_Sub1_2731, Class51.aClass24_Sub16_522, Class525.aClass610_7102.method10095(2103778523));
			Class208_Sub22.method15638((byte) 1);
			Class645.method10746(Class321.aClass24_Sub10_3551, 970360748);
			Class677.method13881(Class659.aClass391_8496, Class643.aClass397_8346, (byte) 84);
			Class153.method2523(Class208_Sub12.aClass459_9930, Class143.aClass181_1669, Class226.anInterface24_2350, -1070997398);
			Class279 class279 = new Class279(Class31.aClass459_266.method7497("huffman", "", (byte) -1));
			Class223.method4176(class279, 1552656692);
			Class170.aClass517_1880 = Class405.method6548(-755825839);
			Class177.aClass527_Sub40_2048 = new Class527_Sub40(true);
		}
		if (Class593.aClass310_7804 == Class310.aClass310_3476) {
			int i_88_ = (Class621.method10228(Class338.aClass459_3656, (byte) 0) + Class211.aClass420_2256.method6698(true, 1753775384));
			int i_89_ = (Class685.method13950((byte) -68) + Class211.aClass420_2256.method6681((byte) -65));
			if (i_88_ < i_89_)
				return 100 * i_88_ / i_89_;
		}
		if (Class310.aClass310_3477 == Class593.aClass310_7804)
			Class529.method8746(Class596.aClass459_7845, Class509.aClass459_6970, Class153.aClass24_Sub14_1716, Class317.aClass24_Sub5_3533, client.aClass509_11072.method8310(-34224629), Class457.aClass24_Sub12_5063, Class346.aClass24_Sub8_3731, Class671.aClass97_8584, Class671.aClass97_8584);
		if (Class593.aClass310_7804 == Class310.aClass310_3478) {
			Class598.aClass144_Sub1_7852 = new Class144_Sub1(Class112.aClass95_Sub1_Sub2_1406);
			Class335.method5872(-75881350);
			Class105.aClass45_1309 = Class1.method515((byte) 16);
			Class64.aClass459_743.method7491(false, true, 1698521445);
			Class338.aClass459_3656.method7491(true, true, 1698521445);
			Class272.aClass459_3136.method7491(true, true, 1698521445);
			Class31.aClass459_266.method7491(true, true, 1698521445);
			client.aBool11027 = true;
		}
		if (Class310.aClass310_3466 == Class593.aClass310_7804 && -1 != Class536.aClass615_7224.anInt8048 * 1432330895) {
			if (!Class189.method3666((Class536.aClass615_7224.anInt8048 * 1432330895), null, -374584257))
				return 0;
			boolean bool = true;
			for (int i_90_ = 0; i_90_ < (Class183.aClass240Array2100[Class536.aClass615_7224.anInt8048 * 1432330895].aClass243Array2392).length; i_90_++) {
				Class243 class243 = (Class183.aClass240Array2100[Class536.aClass615_7224.anInt8048 * 1432330895].aClass243Array2392[i_90_]);
				if (5 == -270144907 * class243.anInt2501 && -1 != class243.anInt2532 * -1335703211 && !Class338.aClass459_3656.method7479((-1335703211 * (class243.anInt2532)), 0, 102380841))
					bool = false;
			}
			if (!bool)
				return 0;
		}
		if (Class310.aClass310_3472 == Class593.aClass310_7804)
			Class542.method9025(true, -2139577323);
		if (Class593.aClass310_7804 == Class310.aClass310_3481) {
			Class290.aClass300_3229.method5536(-1905889468);
			try {
				Class595.aThread7818.join();
			} catch (InterruptedException interruptedexception) {
				return 0;
			}
			Class290.aClass300_3229 = null;
			Class595.aThread7818 = null;
			Class290.aClass459_3228 = null;
			Class142.aClass459_1658 = null;
			Class290.aClass90_3227 = null;
			Class290.anInterface31Array3225 = null;
			Class319.aMap3538.remove(Class36.aClass36_408);
			Class319.aMap3538.remove(Class36.aClass36_407);
			Class319.aMap3538.remove(Class36.aClass36_409);
			Class491.method7979((byte) 82);
			client.aBool10999 = Class204.aClass527_Sub31_2213.aClass700_Sub38_10630.method17286(61022769) == 1;
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub38_10630), 1, 1416764677);
			if (client.aBool10999)
				Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub7_10613, 0, 659592979);
			else if ((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.aBool10835) && (529936607 * Class177.aClass527_Sub40_2048.anInt10721 < 512) && (529936607 * Class177.aClass527_Sub40_2048.anInt10721 != 0))
				Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub7_10613, 0, 1138095632);
			Class631.method10465(-1287047400);
			if (client.aBool10999) {
				Class535.method8982(0, false, 2038795974);
				if (!client.aBool11000)
					Class216.method3966(Class41.aClass41_440, -458353454);
			} else {
				Class535.method8982(Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method16894(293300948), false, 2038795974);
				if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10613.method16894(-17129425) == 0)
					Class216.method3966(Class41.aClass41_450, -305277105);
			}
			Class188.method3663(Class204.aClass527_Sub31_2213.aClass700_Sub2_10596.method16853((byte) 1), -1, -1, false, (byte) -7);
			Class211.aClass420_2256.method6707(client.anInterface50_11053, 27833036);
			Class684.method13926(Class402.aClass180_4150, 1423256355);
			Class3.method558(Class402.aClass180_4150, Class338.aClass459_3656, (byte) 82);
		}
		return Class171_Sub2.method15335(-1442340125);
	}

	static void method9024(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class224.method4186((byte) 12) ? 1 : 0;
	}
}
