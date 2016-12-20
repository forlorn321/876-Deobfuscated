/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchEventResult;

public abstract class Class265 implements Interface36 {
	protected String aString2873;
	protected String aString2874 = null;
	protected String aString2875;
	public static Class711 aClass711_2876;

	abstract void method4986(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i);

	abstract void method4987(int i, Class427 class427);

	public abstract boolean method4988();

	abstract void method4989(Class527_Sub18_Sub1 class527_sub18_sub1, float f);

	abstract void method4990(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_0_);

	abstract void method4991(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_1_, float f_2_);

	abstract void method4992(int i, float f, float f_3_, float f_4_, float f_5_);

	abstract void method4993(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i);

	abstract void method4994(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427);

	Class265() {
		/* empty */
	}

	abstract void method4995(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41);

	abstract void method4996(int i, float f, float f_6_, float f_7_);

	abstract void method4997(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_8_, float f_9_, float f_10_);

	abstract void method4998(int i, int i_11_, Interface41 interface41);

	abstract void method4999(int i, Class427 class427);

	abstract void method5000(int i, Class427 class427);

	abstract void method5001(int i, float[] fs, int i_12_);

	abstract void method5002(int i, int i_13_, Interface41 interface41);

	String method5003() {
		return aString2874;
	}

	String method5004(int i) {
		return aString2874;
	}

	abstract void method5005(Class527_Sub18_Sub1 class527_sub18_sub1, int i, Interface41 interface41);

	public abstract boolean method5006();

	abstract void method5007(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_14_);

	abstract void method5008(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_15_);

	abstract void method5009(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_16_, float f_17_);

	abstract void method5010(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_18_);

	abstract void method5011(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_19_, float f_20_, float f_21_);

	abstract void method5012(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_22_, float f_23_, float f_24_);

	abstract void method5013(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i);

	abstract void method5014(Class527_Sub18_Sub1 class527_sub18_sub1, float[] fs, int i);

	abstract void method5015(int i, float f, float f_25_, float f_26_, float f_27_);

	abstract void method5016(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427);

	abstract void method5017(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427);

	abstract void method5018(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427);

	abstract void method5019(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427);

	abstract void method5020(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_28_);

	abstract void method5021(int i, float f, float f_29_, float f_30_);

	abstract void method5022(int i, float[] fs, int i_31_);

	abstract void method5023(int i, Class427 class427);

	abstract void method5024(int i, Class427 class427);

	abstract void method5025(int i, Class427 class427);

	abstract void method5026(int i, Class427 class427);

	abstract void method5027(Class527_Sub18_Sub1 class527_sub18_sub1, float f, float f_32_, float f_33_);

	abstract void method5028(Class527_Sub18_Sub1 class527_sub18_sub1, Class427 class427);

	abstract void method5029(Class527_Sub18_Sub1 class527_sub18_sub1, float f);

	abstract void method5030(int i, float[] fs, int i_34_);

	abstract void method5031(int i, float[] fs, int i_35_);

	abstract void method5032(int i, Class427 class427);

	static void method5033(int i, int i_36_, int i_37_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_36_);
		Class578 class578 = twitcheventresult.method6561();
		if (class578 != null)
			Class390.method6467(class578.method87(), twitcheventresult, 1058113241);
	}

	static final void method5034(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class160.method2581(class243, class240, class665, 2070177529);
	}

	static final void method5035(Class665 class665, byte i) {
		int i_38_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_38_, 1996376410)).aString84);
	}

	static final void method5036(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_39_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_40_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class331_Sub3.method15766(9, i_39_, i_40_, "", 472161400);
	}

	public static void method5037(int i, boolean bool, int i_41_, boolean bool_42_, int i_43_) {
		Class28.method866(0, Class3.aClass604_Sub1Array31.length - 1, i, bool, i_41_, bool_42_, -873425112);
		Class3.anInt35 = 0;
		Class3.aClass638_42 = null;
	}

	static final void method5038(Class665 class665, byte i) {
		throw new RuntimeException("");
	}

	public static byte[][][] method5039(int i, int i_44_) {
		byte[][][] is = new byte[8][4][];
		int i_45_ = i;
		int i_46_ = i;
		byte[] is_47_ = new byte[i_45_ * i_46_];
		int i_48_ = 0;
		for (int i_49_ = 0; i_49_ < i_46_; i_49_++) {
			for (int i_50_ = 0; i_50_ < i_45_; i_50_++) {
				if (i_50_ <= i_49_)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[0][0] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_51_ = i_46_ - 1; i_51_ >= 0; i_51_--) {
			for (int i_52_ = 0; i_52_ < i_46_; i_52_++) {
				if (i_52_ <= i_51_)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[0][1] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_53_ = 0; i_53_ < i_46_; i_53_++) {
			for (int i_54_ = 0; i_54_ < i_45_; i_54_++) {
				if (i_54_ >= i_53_)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[0][2] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_55_ = i_46_ - 1; i_55_ >= 0; i_55_--) {
			for (int i_56_ = 0; i_56_ < i_45_; i_56_++) {
				if (i_56_ >= i_55_)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[0][3] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_57_ = i_46_ - 1; i_57_ >= 0; i_57_--) {
			for (int i_58_ = 0; i_58_ < i_45_; i_58_++) {
				if (i_58_ <= i_57_ >> 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[1][0] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_59_ = 0; i_59_ < i_46_; i_59_++) {
			for (int i_60_ = 0; i_60_ < i_45_; i_60_++) {
				if (i_48_ < 0 || i_48_ >= is_47_.length)
					i_48_++;
				else {
					if (i_60_ >= i_59_ << 1)
						is_47_[i_48_] = (byte) -1;
					i_48_++;
				}
			}
		}
		is[1][1] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_61_ = 0; i_61_ < i_46_; i_61_++) {
			for (int i_62_ = i_45_ - 1; i_62_ >= 0; i_62_--) {
				if (i_62_ <= i_61_ >> 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[1][2] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_63_ = i_46_ - 1; i_63_ >= 0; i_63_--) {
			for (int i_64_ = i_45_ - 1; i_64_ >= 0; i_64_--) {
				if (i_64_ >= i_63_ << 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[1][3] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_65_ = i_46_ - 1; i_65_ >= 0; i_65_--) {
			for (int i_66_ = i_45_ - 1; i_66_ >= 0; i_66_--) {
				if (i_66_ <= i_65_ >> 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[2][0] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_67_ = i_46_ - 1; i_67_ >= 0; i_67_--) {
			for (int i_68_ = 0; i_68_ < i_45_; i_68_++) {
				if (i_68_ >= i_67_ << 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[2][1] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_69_ = 0; i_69_ < i_46_; i_69_++) {
			for (int i_70_ = 0; i_70_ < i_45_; i_70_++) {
				if (i_70_ <= i_69_ >> 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[2][2] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_71_ = 0; i_71_ < i_46_; i_71_++) {
			for (int i_72_ = i_45_ - 1; i_72_ >= 0; i_72_--) {
				if (i_72_ >= i_71_ << 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[2][3] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_73_ = i_46_ - 1; i_73_ >= 0; i_73_--) {
			for (int i_74_ = 0; i_74_ < i_45_; i_74_++) {
				if (i_74_ >= i_73_ >> 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[3][0] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_75_ = 0; i_75_ < i_46_; i_75_++) {
			for (int i_76_ = 0; i_76_ < i_45_; i_76_++) {
				if (i_76_ <= i_75_ << 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[3][1] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_77_ = 0; i_77_ < i_46_; i_77_++) {
			for (int i_78_ = i_45_ - 1; i_78_ >= 0; i_78_--) {
				if (i_78_ >= i_77_ >> 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[3][2] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_79_ = i_46_ - 1; i_79_ >= 0; i_79_--) {
			for (int i_80_ = i_45_ - 1; i_80_ >= 0; i_80_--) {
				if (i_80_ <= i_79_ << 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[3][3] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_81_ = i_46_ - 1; i_81_ >= 0; i_81_--) {
			for (int i_82_ = i_45_ - 1; i_82_ >= 0; i_82_--) {
				if (i_82_ >= i_81_ >> 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[4][0] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_83_ = i_46_ - 1; i_83_ >= 0; i_83_--) {
			for (int i_84_ = 0; i_84_ < i_45_; i_84_++) {
				if (i_84_ <= i_83_ << 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[4][1] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_85_ = 0; i_85_ < i_46_; i_85_++) {
			for (int i_86_ = 0; i_86_ < i_45_; i_86_++) {
				if (i_86_ >= i_85_ >> 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[4][2] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_87_ = 0; i_87_ < i_46_; i_87_++) {
			for (int i_88_ = i_45_ - 1; i_88_ >= 0; i_88_--) {
				if (i_88_ <= i_87_ << 1)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[4][3] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_89_ = 0; i_89_ < i_46_; i_89_++) {
			for (int i_90_ = 0; i_90_ < i_45_; i_90_++) {
				if (i_90_ <= i_45_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[5][0] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_91_ = 0; i_91_ < i_46_; i_91_++) {
			for (int i_92_ = 0; i_92_ < i_45_; i_92_++) {
				if (i_91_ <= i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[5][1] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_93_ = 0; i_93_ < i_46_; i_93_++) {
			for (int i_94_ = 0; i_94_ < i_45_; i_94_++) {
				if (i_94_ >= i_45_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[5][2] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_95_ = 0; i_95_ < i_46_; i_95_++) {
			for (int i_96_ = 0; i_96_ < i_45_; i_96_++) {
				if (i_95_ >= i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[5][3] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_97_ = 0; i_97_ < i_46_; i_97_++) {
			for (int i_98_ = 0; i_98_ < i_45_; i_98_++) {
				if (i_98_ <= i_97_ - i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[6][0] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_99_ = i_46_ - 1; i_99_ >= 0; i_99_--) {
			for (int i_100_ = 0; i_100_ < i_45_; i_100_++) {
				if (i_100_ <= i_99_ - i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[6][1] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_101_ = i_46_ - 1; i_101_ >= 0; i_101_--) {
			for (int i_102_ = i_45_ - 1; i_102_ >= 0; i_102_--) {
				if (i_102_ <= i_101_ - i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[6][2] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_103_ = 0; i_103_ < i_46_; i_103_++) {
			for (int i_104_ = i_45_ - 1; i_104_ >= 0; i_104_--) {
				if (i_104_ <= i_103_ - i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[6][3] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_105_ = 0; i_105_ < i_46_; i_105_++) {
			for (int i_106_ = 0; i_106_ < i_45_; i_106_++) {
				if (i_106_ >= i_105_ - i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[7][0] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_107_ = i_46_ - 1; i_107_ >= 0; i_107_--) {
			for (int i_108_ = 0; i_108_ < i_45_; i_108_++) {
				if (i_108_ >= i_107_ - i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[7][1] = is_47_;
		is_47_ = new byte[i_45_ * i_46_];
		i_48_ = 0;
		for (int i_109_ = i_46_ - 1; i_109_ >= 0; i_109_--) {
			for (int i_110_ = i_45_ - 1; i_110_ >= 0; i_110_--) {
				if (i_110_ >= i_109_ - i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[7][2] = is_47_;
		is_47_ = new byte[i_46_ * i_45_];
		i_48_ = 0;
		for (int i_111_ = 0; i_111_ < i_46_; i_111_++) {
			for (int i_112_ = i_45_ - 1; i_112_ >= 0; i_112_--) {
				if (i_112_ >= i_111_ - i_46_ / 2)
					is_47_[i_48_] = (byte) -1;
				i_48_++;
			}
		}
		is[7][3] = is_47_;
		return is;
	}

	static final void method5040(int i) {
		for (Class527_Sub2 class527_sub2 = ((Class527_Sub2) Class527_Sub2.aClass694_10357.method14081((short) -16639)); class527_sub2 != null; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10357.method14086(-65534))
			Class560.method9451(class527_sub2, false, (byte) -75);
		for (Class527_Sub2 class527_sub2 = ((Class527_Sub2) Class527_Sub2.aClass694_10359.method14081((short) 11592)); class527_sub2 != null; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10359.method14086(-65534))
			Class560.method9451(class527_sub2, true, (byte) -7);
	}

	public static void method5041(Interface74 interface74, int i) {
		if (null == IcmpService_Sub1.anIcmpService_Sub1_10869)
			throw new IllegalStateException("");
		IcmpService_Sub1.anIcmpService_Sub1_10869.aList10868.add(interface74);
	}

	public static int method5042(int i) {
		return Class628.anInt8201 * 367556557;
	}
}
