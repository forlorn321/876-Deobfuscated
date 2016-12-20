/* Class656 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class656 {
	public static int[] anIntArray8390;
	static int anInt8391;
	public static int[] anIntArray8392;
	public static int[] anIntArray8393;
	static int anInt8394 = 0;

	public static int method10969(int i, int i_0_) {
		int i_1_ = i_0_ >>> 24;
		int i_2_ = 255 - i_1_;
		i_0_ = (i_1_ * (i_0_ & 0xff00ff) & ~0xff00ff | i_1_ * (i_0_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_2_ * (i & 0xff00ff) & ~0xff00ff | i_2_ * (i & 0xff00) & 0xff0000) >>> 8) + i_0_);
	}

	static {
		anInt8391 = 0;
	}

	public static void method10970(boolean bool, boolean bool_3_) {
		if (bool) {
			anInt8394 += 1317456281;
			Class218.method3975(-909360015);
		}
		if (bool_3_) {
			anInt8391 += -1823192467;
			Class274.method5133(-964640282);
		}
	}

	public static void method10971(boolean bool, boolean bool_4_) {
		if (bool) {
			anInt8394 += 1317456281;
			Class218.method3975(-965460144);
		}
		if (bool_4_) {
			anInt8391 += -1823192467;
			Class274.method5133(-964640282);
		}
	}

	public static short method10972(int i) {
		int i_5_ = i >> 10 & 0x3f;
		int i_6_ = i >> 3 & 0x70;
		int i_7_ = i & 0x7f;
		i_6_ = i_7_ <= 64 ? i_6_ * i_7_ >> 7 : (127 - i_7_) * i_6_ >> 7;
		int i_8_ = i_7_ + i_6_;
		int i_9_;
		if (0 != i_8_)
			i_9_ = (i_6_ << 8) / i_8_;
		else
			i_9_ = i_6_ << 1;
		int i_10_ = i_8_;
		return (short) (i_5_ << 10 | i_9_ >> 4 << 7 | i_10_);
	}

	public static void method10973(boolean bool, boolean bool_11_) {
		if (bool) {
			anInt8394 -= 1317456281;
			if (-1077773655 * anInt8394 == 0)
				anIntArray8393 = null;
		}
		if (bool_11_) {
			anInt8391 -= -1823192467;
			if (-2088546459 * anInt8391 == 0)
				anIntArray8390 = null;
		}
	}

	static void method10974() {
		if (null == anIntArray8390) {
			anIntArray8390 = new int[65536];
			anIntArray8392 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i = 0; i < 65536; i++) {
				double d_12_ = 0.0078125 + (double) (i >> 10 & 0x3f) / 64.0;
				double d_13_ = (double) (i >> 7 & 0x7) / 8.0 + 0.0625;
				double d_14_ = (double) (i & 0x7f) / 128.0;
				double d_15_ = d_14_;
				double d_16_ = d_14_;
				double d_17_ = d_14_;
				if (d_13_ != 0.0) {
					double d_18_;
					if (d_14_ < 0.5)
						d_18_ = (d_13_ + 1.0) * d_14_;
					else
						d_18_ = d_14_ + d_13_ - d_14_ * d_13_;
					double d_19_ = d_14_ * 2.0 - d_18_;
					double d_20_ = 0.3333333333333333 + d_12_;
					if (d_20_ > 1.0)
						d_20_--;
					double d_21_ = d_12_;
					double d_22_ = d_12_ - 0.3333333333333333;
					if (d_22_ < 0.0)
						d_22_++;
					if (d_20_ * 6.0 < 1.0)
						d_15_ = d_19_ + d_20_ * (6.0 * (d_18_ - d_19_));
					else if (d_20_ * 2.0 < 1.0)
						d_15_ = d_18_;
					else if (d_20_ * 3.0 < 2.0)
						d_15_ = 6.0 * ((d_18_ - d_19_) * (0.6666666666666666 - d_20_)) + d_19_;
					else
						d_15_ = d_19_;
					if (d_21_ * 6.0 < 1.0)
						d_16_ = d_21_ * (6.0 * (d_18_ - d_19_)) + d_19_;
					else if (d_21_ * 2.0 < 1.0)
						d_16_ = d_18_;
					else if (d_21_ * 3.0 < 2.0)
						d_16_ = d_19_ + 6.0 * ((d_18_ - d_19_) * (0.6666666666666666 - d_21_));
					else
						d_16_ = d_19_;
					if (d_22_ * 6.0 < 1.0)
						d_17_ = d_22_ * ((d_18_ - d_19_) * 6.0) + d_19_;
					else if (d_22_ * 2.0 < 1.0)
						d_17_ = d_18_;
					else if (d_22_ * 3.0 < 2.0)
						d_17_ = d_19_ + 6.0 * ((d_18_ - d_19_) * (0.6666666666666666 - d_22_));
					else
						d_17_ = d_19_;
				}
				d_15_ = Math.pow(d_15_, d);
				d_16_ = Math.pow(d_16_, d);
				d_17_ = Math.pow(d_17_, d);
				int i_23_ = (int) (256.0 * d_15_);
				int i_24_ = (int) (256.0 * d_16_);
				int i_25_ = (int) (d_17_ * 256.0);
				int i_26_ = i_25_ + ((i_23_ << 16) + (i_24_ << 8));
				anIntArray8390[i] = i_26_ & 0xffffff;
				int i_27_ = (i_24_ << 8) + (i_25_ << 16) + i_23_;
				anIntArray8392[i] = i_27_;
			}
		}
	}

	public static final int method10975(int i, int i_28_) {
		if (i == -1)
			return 12345678;
		i_28_ = (i & 0x7f) * i_28_ >> 7;
		if (i_28_ < 2)
			i_28_ = 2;
		else if (i_28_ > 126)
			i_28_ = 126;
		return (i & 0xff80) + i_28_;
	}

	public static short method10976(int i) {
		int i_29_ = i >> 10 & 0x3f;
		int i_30_ = i >> 3 & 0x70;
		int i_31_ = i & 0x7f;
		i_30_ = i_31_ <= 64 ? i_30_ * i_31_ >> 7 : (127 - i_31_) * i_30_ >> 7;
		int i_32_ = i_31_ + i_30_;
		int i_33_;
		if (0 != i_32_)
			i_33_ = (i_30_ << 8) / i_32_;
		else
			i_33_ = i_30_ << 1;
		int i_34_ = i_32_;
		return (short) (i_29_ << 10 | i_33_ >> 4 << 7 | i_34_);
	}

	Class656() throws Throwable {
		throw new Error();
	}

	public static int method10977(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_35_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_36_ = (double) (i & 0xff) / 256.0;
		double d_37_ = d;
		if (d_35_ < d_37_)
			d_37_ = d_35_;
		if (d_36_ < d_37_)
			d_37_ = d_36_;
		double d_38_ = d;
		if (d_35_ > d_38_)
			d_38_ = d_35_;
		if (d_36_ > d_38_)
			d_38_ = d_36_;
		double d_39_ = 0.0;
		double d_40_ = 0.0;
		double d_41_ = (d_37_ + d_38_) / 2.0;
		if (d_38_ != d_37_) {
			if (d_41_ < 0.5)
				d_40_ = (d_38_ - d_37_) / (d_38_ + d_37_);
			if (d_41_ >= 0.5)
				d_40_ = (d_38_ - d_37_) / (2.0 - d_38_ - d_37_);
			if (d_38_ == d)
				d_39_ = (d_35_ - d_36_) / (d_38_ - d_37_);
			else if (d_38_ == d_35_)
				d_39_ = (d_36_ - d) / (d_38_ - d_37_) + 2.0;
			else if (d_38_ == d_36_)
				d_39_ = (d - d_35_) / (d_38_ - d_37_) + 4.0;
		}
		d_39_ /= 6.0;
		int i_42_ = (int) (256.0 * d_39_);
		int i_43_ = (int) (256.0 * d_40_);
		int i_44_ = (int) (d_41_ * 256.0);
		if (i_43_ < 0)
			i_43_ = 0;
		else if (i_43_ > 255)
			i_43_ = 255;
		if (i_44_ < 0)
			i_44_ = 0;
		else if (i_44_ > 255)
			i_44_ = 255;
		if (i_44_ > 243)
			i_43_ >>= 4;
		else if (i_44_ > 217)
			i_43_ >>= 3;
		else if (i_44_ > 192)
			i_43_ >>= 2;
		else if (i_44_ > 179)
			i_43_ >>= 1;
		return ((i_44_ >> 1) + ((i_43_ >> 5 << 7) + ((i_42_ & 0xff) >> 2 << 10)));
	}

	public static int method10978(int i, int i_45_) {
		int i_46_ = i_45_ >>> 24;
		int i_47_ = 255 - i_46_;
		i_45_ = (i_46_ * (i_45_ & 0xff00ff) & ~0xff00ff | i_46_ * (i_45_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_47_ * (i & 0xff00ff) & ~0xff00ff | i_47_ * (i & 0xff00) & 0xff0000) >>> 8) + i_45_);
	}

	public static int method10979(int i, int i_48_) {
		int i_49_ = i_48_ >>> 24;
		int i_50_ = 255 - i_49_;
		i_48_ = (i_49_ * (i_48_ & 0xff00ff) & ~0xff00ff | i_49_ * (i_48_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_50_ * (i & 0xff00ff) & ~0xff00ff | i_50_ * (i & 0xff00) & 0xff0000) >>> 8) + i_48_);
	}

	public static int method10980(int i, int i_51_) {
		int i_52_ = i_51_ >>> 24;
		int i_53_ = 255 - i_52_;
		i_51_ = (i_52_ * (i_51_ & 0xff00ff) & ~0xff00ff | i_52_ * (i_51_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_53_ * (i & 0xff00ff) & ~0xff00ff | i_53_ * (i & 0xff00) & 0xff0000) >>> 8) + i_51_);
	}

	public static int method10981(int i, int i_54_) {
		int i_55_ = i_54_ >>> 24;
		int i_56_ = 255 - i_55_;
		i_54_ = (i_55_ * (i_54_ & 0xff00ff) & ~0xff00ff | i_55_ * (i_54_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_56_ * (i & 0xff00ff) & ~0xff00ff | i_56_ * (i & 0xff00) & 0xff0000) >>> 8) + i_54_);
	}

	public static void method10982(boolean bool, boolean bool_57_) {
		if (bool) {
			anInt8394 += 1317456281;
			Class218.method3975(431897288);
		}
		if (bool_57_) {
			anInt8391 += -1823192467;
			Class274.method5133(-964640282);
		}
	}

	public static final int method10983(int i, int i_58_) {
		if (-2 == i)
			return 12345678;
		if (i == -1) {
			if (i_58_ < 2)
				i_58_ = 2;
			else if (i_58_ > 126)
				i_58_ = 126;
			return i_58_;
		}
		i_58_ = (i & 0x7f) * i_58_ >> 7;
		if (i_58_ < 2)
			i_58_ = 2;
		else if (i_58_ > 126)
			i_58_ = 126;
		return i_58_ + (i & 0xff80);
	}

	public static int method10984(int i, int i_59_, int i_60_) {
		int i_61_ = 255 - i_60_;
		i_59_ = ((i_59_ & 0xff00ff) * i_60_ & ~0xff00ff | i_60_ * (i_59_ & 0xff00) & 0xff0000) >>> 8;
		return i_59_ + (((i & 0xff00ff) * i_61_ & ~0xff00ff | i_61_ * (i & 0xff00) & 0xff0000) >>> 8);
	}

	public static int method10985(int i, int i_62_) {
		int i_63_ = i_62_ >>> 24;
		int i_64_ = 255 - i_63_;
		i_62_ = (i_63_ * (i_62_ & 0xff00ff) & ~0xff00ff | i_63_ * (i_62_ & 0xff00) & 0xff0000) >>> 8;
		return (((i_64_ * (i & 0xff00ff) & ~0xff00ff | i_64_ * (i & 0xff00) & 0xff0000) >>> 8) + i_62_);
	}

	public static int method10986(int i, int i_65_) {
		i_65_ = (i & 0x7f) * i_65_ >> 7;
		if (i_65_ < 2)
			i_65_ = 2;
		else if (i_65_ > 126)
			i_65_ = 126;
		return i_65_ + (i & 0xff80);
	}

	public static int method10987(int i) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_66_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_67_ = (double) (i & 0xff) / 256.0;
		double d_68_ = d;
		if (d_66_ < d_68_)
			d_68_ = d_66_;
		if (d_67_ < d_68_)
			d_68_ = d_67_;
		double d_69_ = d;
		if (d_66_ > d_69_)
			d_69_ = d_66_;
		if (d_67_ > d_69_)
			d_69_ = d_67_;
		double d_70_ = 0.0;
		double d_71_ = 0.0;
		double d_72_ = (d_68_ + d_69_) / 2.0;
		if (d_69_ != d_68_) {
			if (d_72_ < 0.5)
				d_71_ = (d_69_ - d_68_) / (d_69_ + d_68_);
			if (d_72_ >= 0.5)
				d_71_ = (d_69_ - d_68_) / (2.0 - d_69_ - d_68_);
			if (d_69_ == d)
				d_70_ = (d_66_ - d_67_) / (d_69_ - d_68_);
			else if (d_69_ == d_66_)
				d_70_ = (d_67_ - d) / (d_69_ - d_68_) + 2.0;
			else if (d_69_ == d_67_)
				d_70_ = (d - d_66_) / (d_69_ - d_68_) + 4.0;
		}
		d_70_ /= 6.0;
		int i_73_ = (int) (256.0 * d_70_);
		int i_74_ = (int) (256.0 * d_71_);
		int i_75_ = (int) (d_72_ * 256.0);
		if (i_74_ < 0)
			i_74_ = 0;
		else if (i_74_ > 255)
			i_74_ = 255;
		if (i_75_ < 0)
			i_75_ = 0;
		else if (i_75_ > 255)
			i_75_ = 255;
		if (i_75_ > 243)
			i_74_ >>= 4;
		else if (i_75_ > 217)
			i_74_ >>= 3;
		else if (i_75_ > 192)
			i_74_ >>= 2;
		else if (i_75_ > 179)
			i_74_ >>= 1;
		return ((i_75_ >> 1) + ((i_74_ >> 5 << 7) + ((i_73_ & 0xff) >> 2 << 10)));
	}

	public static final int method10988(int i, int i_76_) {
		if (i == -1)
			return 12345678;
		i_76_ = (i & 0x7f) * i_76_ >> 7;
		if (i_76_ < 2)
			i_76_ = 2;
		else if (i_76_ > 126)
			i_76_ = 126;
		return (i & 0xff80) + i_76_;
	}

	public static int method10989(int i, int i_77_, float f) {
		return Class307.method5617(i, i_77_, (int) f, (short) 10240);
	}

	public static int method10990(int i, int i_78_) {
		i_78_ = (i & 0x7f) * i_78_ >> 7;
		if (i_78_ < 2)
			i_78_ = 2;
		else if (i_78_ > 126)
			i_78_ = 126;
		return i_78_ + (i & 0xff80);
	}

	public static final int method10991(int i, int i_79_, int i_80_) {
		if (i_80_ > 243)
			i_79_ >>= 4;
		else if (i_80_ > 217)
			i_79_ >>= 3;
		else if (i_80_ > 192)
			i_79_ >>= 2;
		else if (i_80_ > 179)
			i_79_ >>= 1;
		return (i_80_ >> 1) + (((i & 0xff) >> 2 << 10) + (i_79_ >> 5 << 7));
	}

	static final void method10992(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class289.method5229(class243, class240, class665, (byte) -48);
	}

	static final void method10993(Class665 class665, int i) {
		int i_81_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_81_, 167712157);
		Class240 class240 = Class183.aClass240Array2100[i_81_ >> 16];
		Class580.method9659(class243, class240, class665, -1666108630);
	}

	static final void method10994(Class665 class665, int i) {
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class665.aClass527_Sub21_8537.aString10483;
	}

	static final void method10995(Class665 class665, byte i) {
		String string;
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 != null && (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12202))
			string = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18877(false, (byte) -90);
		else
			string = "";
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string;
	}

	static final void method10996(Class665 class665, short i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub15_10598, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1 ? 1 : 0, 239542059);
		client.aClass509_11072.method8361(-428559959);
		Class631.method10465(1424224329);
		client.aBool11020 = false;
	}

	static final void method10997(Class665 class665, int i) {
		int i_82_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (client.aString11270 != null && i_82_ < Class695_Sub3.anInt10976 * -2075991457)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class679.aClass104Array8629[i_82_].anInt1288 * 2066428519;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}
}
