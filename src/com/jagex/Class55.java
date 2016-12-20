/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class55 {
	static Class205 aClass205_709 = new Class205(32);
	public static int anInt710;

	public static void method1304() {
		synchronized (aClass205_709) {
			aClass205_709.method3793((byte) 75);
		}
	}

	public static Class176 method1305(Class180 class180, int i, int i_0_, int i_1_, int i_2_, int i_3_, Class176 class176, int i_4_, int i_5_, int i_6_, int i_7_, Class695 class695) {
		if (null == class176)
			return null;
		int i_8_ = 2055;
		if (class695 != null) {
			i_8_ |= class695.method14174(-822649352);
			i_8_ &= ~0x200;
		}
		long l = ((long) ((i_6_ << 16) + i_3_ + (i_7_ << 24)) + ((long) i_4_ << 32) + ((long) i_5_ << 48));
		Class176 class176_9_;
		synchronized (aClass205_709) {
			class176_9_ = (Class176) aClass205_709.method3787(l);
		}
		if (null == class176_9_ || class180.method3175(class176_9_.method2874(), i_8_) != 0) {
			if (null != class176_9_)
				i_8_ = class180.method3176(i_8_, class176_9_.method2874());
			int i_10_ = 6 + i_3_ * 3;
			int i_11_ = 3;
			int[] is = { 64, 96, 128 };
			Class175 class175 = new Class175(1 + i_11_ * i_10_, 2 * (i_11_ * i_10_) - i_10_, 0);
			int i_12_ = class175.method2849(0, 0, 0);
			int[][] is_13_ = new int[i_11_][i_10_];
			for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
				int i_15_ = is[i_14_];
				int i_16_ = is[i_14_];
				for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
					int i_18_ = (i_17_ << 14) / i_10_;
					int i_19_ = Class428.anIntArray4825[i_18_] * i_15_ >> 14;
					int i_20_ = Class428.anIntArray4819[i_18_] * i_16_ >> 14;
					is_13_[i_14_][i_17_] = class175.method2849(i_19_, 0, i_20_);
				}
			}
			for (int i_21_ = 0; i_21_ < i_11_; i_21_++) {
				int i_22_ = (128 + i_21_ * 256) / i_11_;
				int i_23_ = 256 - i_22_;
				byte i_24_ = (byte) (i_23_ * i_6_ + i_7_ * i_22_ >> 8);
				short i_25_ = (short) ((((i_5_ & 0xfc00) * i_22_ + i_23_ * (i_4_ & 0xfc00) & 0xfc0000) + ((i_23_ * (i_4_ & 0x380) + (i_5_ & 0x380) * i_22_) & 0x38000) + ((i_5_ & 0x7f) * i_22_ + i_23_ * (i_4_ & 0x7f) & 0x7f00)) >> 8);
				for (int i_26_ = 0; i_26_ < i_10_; i_26_++) {
					if (i_21_ == 0)
						class175.method2804(i_12_, is_13_[0][(1 + i_26_) % i_10_], is_13_[0][i_26_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
					else {
						class175.method2804(is_13_[i_21_ - 1][i_26_], (is_13_[i_21_ - 1][(i_26_ + 1) % i_10_]), is_13_[i_21_][(i_26_ + 1) % i_10_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
						class175.method2804(is_13_[i_21_ - 1][i_26_], is_13_[i_21_][(i_26_ + 1) % i_10_], is_13_[i_21_][i_26_], (byte) 1, (byte) -1, i_25_, i_24_, (short) -1);
					}
				}
			}
			class176_9_ = class180.method3376(class175, i_8_, 1730638447 * Class526.anInt7104, 64, 768);
			synchronized (aClass205_709) {
				aClass205_709.method3790(class176_9_, l);
			}
		}
		int i_27_ = class176.method2894();
		int i_28_ = class176.method2939();
		int i_29_ = class176.method2898();
		int i_30_ = class176.method2890();
		if (class695 != null) {
			class176_9_ = class176_9_.method2862((byte) 3, i_8_, true);
			class176_9_.method2872(i_28_ - i_27_ >> 1, 128, i_30_ - i_29_ >> 1);
			class176_9_.method3015(i_28_ + i_27_ >> 1, 0, i_29_ + i_30_ >> 1);
			class695.method14171(class176_9_, 536775333);
		} else {
			class176_9_ = class176_9_.method2862((byte) 3, i_8_, true);
			class176_9_.method2872(i_28_ - i_27_ >> 1, 128, i_30_ - i_29_ >> 1);
			class176_9_.method3015(i_28_ + i_27_ >> 1, 0, i_30_ + i_29_ >> 1);
		}
		if (0 != i_0_)
			class176_9_.method2868(i_0_);
		if (0 != i_1_)
			class176_9_.method2869(i_1_);
		if (i_2_ != 0)
			class176_9_.method3015(0, i_2_, 0);
		return class176_9_;
	}

	public static Class176 method1306(Class180 class180, int i, int i_31_, int i_32_, int i_33_, int i_34_, Class176 class176, int i_35_, int i_36_, int i_37_, int i_38_, Class695 class695) {
		if (null == class176)
			return null;
		int i_39_ = 2055;
		if (class695 != null) {
			i_39_ |= class695.method14174(-822649352);
			i_39_ &= ~0x200;
		}
		long l = ((long) ((i_37_ << 16) + i_34_ + (i_38_ << 24)) + ((long) i_35_ << 32) + ((long) i_36_ << 48));
		Class176 class176_40_;
		synchronized (aClass205_709) {
			class176_40_ = (Class176) aClass205_709.method3787(l);
		}
		if (null == class176_40_ || class180.method3175(class176_40_.method2874(), i_39_) != 0) {
			if (null != class176_40_)
				i_39_ = class180.method3176(i_39_, class176_40_.method2874());
			int i_41_ = 6 + i_34_ * 3;
			int i_42_ = 3;
			int[] is = { 64, 96, 128 };
			Class175 class175 = new Class175(1 + i_42_ * i_41_, 2 * (i_42_ * i_41_) - i_41_, 0);
			int i_43_ = class175.method2849(0, 0, 0);
			int[][] is_44_ = new int[i_42_][i_41_];
			for (int i_45_ = 0; i_45_ < i_42_; i_45_++) {
				int i_46_ = is[i_45_];
				int i_47_ = is[i_45_];
				for (int i_48_ = 0; i_48_ < i_41_; i_48_++) {
					int i_49_ = (i_48_ << 14) / i_41_;
					int i_50_ = Class428.anIntArray4825[i_49_] * i_46_ >> 14;
					int i_51_ = Class428.anIntArray4819[i_49_] * i_47_ >> 14;
					is_44_[i_45_][i_48_] = class175.method2849(i_50_, 0, i_51_);
				}
			}
			for (int i_52_ = 0; i_52_ < i_42_; i_52_++) {
				int i_53_ = (128 + i_52_ * 256) / i_42_;
				int i_54_ = 256 - i_53_;
				byte i_55_ = (byte) (i_54_ * i_37_ + i_38_ * i_53_ >> 8);
				short i_56_ = (short) ((((i_36_ & 0xfc00) * i_53_ + i_54_ * (i_35_ & 0xfc00) & 0xfc0000) + ((i_54_ * (i_35_ & 0x380) + (i_36_ & 0x380) * i_53_) & 0x38000) + ((i_36_ & 0x7f) * i_53_ + i_54_ * (i_35_ & 0x7f) & 0x7f00)) >> 8);
				for (int i_57_ = 0; i_57_ < i_41_; i_57_++) {
					if (i_52_ == 0)
						class175.method2804(i_43_, is_44_[0][(1 + i_57_) % i_41_], is_44_[0][i_57_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
					else {
						class175.method2804(is_44_[i_52_ - 1][i_57_], (is_44_[i_52_ - 1][(i_57_ + 1) % i_41_]), is_44_[i_52_][(i_57_ + 1) % i_41_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
						class175.method2804(is_44_[i_52_ - 1][i_57_], is_44_[i_52_][(i_57_ + 1) % i_41_], is_44_[i_52_][i_57_], (byte) 1, (byte) -1, i_56_, i_55_, (short) -1);
					}
				}
			}
			class176_40_ = class180.method3376(class175, i_39_, 1730638447 * Class526.anInt7104, 64, 768);
			synchronized (aClass205_709) {
				aClass205_709.method3790(class176_40_, l);
			}
		}
		int i_58_ = class176.method2894();
		int i_59_ = class176.method2939();
		int i_60_ = class176.method2898();
		int i_61_ = class176.method2890();
		if (class695 != null) {
			class176_40_ = class176_40_.method2862((byte) 3, i_39_, true);
			class176_40_.method2872(i_59_ - i_58_ >> 1, 128, i_61_ - i_60_ >> 1);
			class176_40_.method3015(i_59_ + i_58_ >> 1, 0, i_60_ + i_61_ >> 1);
			class695.method14171(class176_40_, 536775333);
		} else {
			class176_40_ = class176_40_.method2862((byte) 3, i_39_, true);
			class176_40_.method2872(i_59_ - i_58_ >> 1, 128, i_61_ - i_60_ >> 1);
			class176_40_.method3015(i_59_ + i_58_ >> 1, 0, i_61_ + i_60_ >> 1);
		}
		if (0 != i_31_)
			class176_40_.method2868(i_31_);
		if (0 != i_32_)
			class176_40_.method2869(i_32_);
		if (i_33_ != 0)
			class176_40_.method3015(0, i_33_, 0);
		return class176_40_;
	}

	public static Class176 method1307(Class180 class180, int i, int i_62_, int i_63_, int i_64_, Class176 class176, short i_65_, byte i_66_, Class695 class695) {
		if (class176 == null)
			return null;
		int i_67_ = 2055;
		if (class695 != null) {
			i_67_ |= class695.method14174(-822649352);
			i_67_ &= ~0x200;
		}
		long l = (long) ((i_65_ & 0xffff) << 8 | i_66_);
		Class176 class176_68_;
		synchronized (aClass205_709) {
			class176_68_ = (Class176) aClass205_709.method3787(l);
		}
		if (null == class176_68_ || class180.method3175(class176_68_.method2874(), i_67_) != 0) {
			if (class176_68_ != null)
				i_67_ = class180.method3176(i_67_, class176_68_.method2874());
			Class175 class175 = new Class175(4, 2, 2);
			int i_69_ = 128;
			int[] is = new int[4];
			is[0] = class175.method2849(-i_69_, 0, -i_69_);
			is[1] = class175.method2849(i_69_, 0, -i_69_);
			is[2] = class175.method2849(i_69_, 0, i_69_);
			is[3] = class175.method2849(-i_69_, 0, i_69_);
			class175.method2804(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_66_, i_65_);
			class175.method2804(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_66_, i_65_);
			class175.method2805((short) 1, (short) 2, (short) 0);
			class175.method2805((short) 2, (short) 3, (short) 0);
			class176_68_ = class180.method3376(class175, i_67_, Class526.anInt7104 * 1730638447, 64, 768);
			synchronized (aClass205_709) {
				aClass205_709.method3790(class176_68_, l);
			}
		}
		int i_70_ = class176.method2894();
		int i_71_ = class176.method2939();
		int i_72_ = class176.method2898();
		int i_73_ = class176.method2890();
		if (class695 != null) {
			class176_68_ = class176_68_.method2862((byte) 3, i_67_, true);
			class176_68_.method2872(i_71_ - i_70_ >> 1, 128, i_73_ - i_72_ >> 1);
			class176_68_.method3015(i_71_ + i_70_ >> 1, 0, i_73_ + i_72_ >> 1);
			class695.method14171(class176_68_, 536775333);
		} else {
			class176_68_ = class176_68_.method2862((byte) 3, i_67_, true);
			class176_68_.method2872(i_71_ - i_70_ >> 1, 128, i_73_ - i_72_ >> 1);
			class176_68_.method3015(i_71_ + i_70_ >> 1, 0, i_72_ + i_73_ >> 1);
		}
		if (i_62_ != 0)
			class176_68_.method2868(i_62_);
		if (i_63_ != 0)
			class176_68_.method2869(i_63_);
		if (i_64_ != 0)
			class176_68_.method3015(0, i_64_, 0);
		return class176_68_;
	}

	public static void method1308() {
		synchronized (aClass205_709) {
			aClass205_709.method3793((byte) 75);
		}
	}

	public static void method1309() {
		synchronized (aClass205_709) {
			aClass205_709.method3793((byte) 126);
		}
	}

	Class55() throws Throwable {
		throw new Error();
	}

	static void method1310() {
		synchronized (aClass205_709) {
			aClass205_709.method3820(-1840877407);
		}
	}

	static void method1311(int i) {
		synchronized (aClass205_709) {
			aClass205_709.method3792(i, (byte) -60);
		}
	}

	static void method1312(int i) {
		synchronized (aClass205_709) {
			aClass205_709.method3792(i, (byte) 121);
		}
	}

	static void method1313() {
		synchronized (aClass205_709) {
			aClass205_709.method3820(1454290108);
		}
	}

	static void method1314(int i) {
		Class526.anInt7104 = i * -1317786481;
		synchronized (aClass205_709) {
			aClass205_709.method3793((byte) 119);
		}
	}

	public static void method1315(int i) {
		if (Class231.method4328(736666097))
			Class265.method5041(new Class622(), 77195429);
	}

	static final void method1316(Class665 class665, int i) {
		int i_74_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_74_, -1191410360);
		Class240 class240 = Class183.aClass240Array2100[i_74_ >> 16];
		Class302.method5574(class243, class240, class665, (short) -1708);
	}

	static final void method1317(Class665 class665, int i) {
		int i_75_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if ((Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 30) != Class301.aClass301_3418) || (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -91) != Class309.aClass309_3455))
			throw new RuntimeException();
		Class327_Sub2 class327_sub2 = ((Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0));
		Class696_Sub3 class696_sub3 = ((Class696_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5472(-738628061));
		Class442 class442 = class327_sub2.method15732((byte) 38);
		Class442 class442_76_ = Class442.method7139(class442);
		class442_76_.aFloat4915 += (float) i_75_;
		Class442 class442_77_ = Class442.method7155(class696_sub3.method14245((byte) 44), class442_76_);
		class442_77_.method7173();
		float f = class327_sub2.method15738(670004548).method7160();
		Class424.method6725(class696_sub3.method14245((byte) 41), class442_77_, class442, f, Class666.aClass442Array8559);
		Object object = null;
		if (null == Class666.aClass442Array8559[0])
			throw new RuntimeException("");
		Class442 class442_78_;
		if (Class666.aClass442Array8559[1] == null)
			class442_78_ = Class666.aClass442Array8559[0];
		else if (Class442.method7155(class696_sub3.method14245((byte) 6), Class666.aClass442Array8559[0]).method7160() < Class442.method7155(class696_sub3.method14245((byte) 106), Class666.aClass442Array8559[1]).method7160())
			class442_78_ = Class666.aClass442Array8559[1];
		else
			class442_78_ = Class666.aClass442Array8559[0];
		float f_79_ = Class640_Sub1_Sub3_Sub2.method18676((class442.aFloat4918 - class442_78_.aFloat4918), (class442.aFloat4919 - class442_78_.aFloat4919), (byte) -15);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) ((double) f_79_ * 2607.5945876176133) & 0x3fff;
	}

	static final void method1318(Class665 class665, int i) {
		int i_80_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_80_, -1227828686);
		Class240 class240 = Class183.aClass240Array2100[i_80_ >> 16];
		Class679.method13903(class243, class240, class665, -840685214);
	}

	static final void method1319(Class665 class665, byte i) {
		int i_81_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_81_, 537127062);
		Class240 class240 = Class183.aClass240Array2100[i_81_ >> 16];
		Class218.method3976(class243, class240, class665, 594280023);
	}

	static final void method1320(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_82_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_83_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (99 == i_82_)
			Class493.method7997(string, (byte) 8);
		else if (98 == i_82_)
			Class170.method2727(string, 16711935);
		else
			Class99.method1766(i_82_, i_83_, "", "", "", string, null, -161394916);
	}

	static char method1321(char c, int i) {
		switch (c) {
		case '\u00c8':
		case '\u00c9':
		case '\u00ca':
		case '\u00cb':
		case '\u00e8':
		case '\u00e9':
		case '\u00ea':
		case '\u00eb':
			return 'e';
		case '\u00d2':
		case '\u00d3':
		case '\u00d4':
		case '\u00d5':
		case '\u00d6':
		case '\u00f2':
		case '\u00f3':
		case '\u00f4':
		case '\u00f5':
		case '\u00f6':
			return 'o';
		case '\u00cd':
		case '\u00ce':
		case '\u00cf':
		case '\u00ed':
		case '\u00ee':
		case '\u00ef':
			return 'i';
		case '\u00c7':
		case '\u00e7':
			return 'c';
		case '\u00d1':
		case '\u00f1':
			return 'n';
		case ' ':
		case '-':
		case '_':
		case '\u00a0':
			return '_';
		case '#':
		case '[':
		case ']':
			return c;
		case '\u00df':
			return 'b';
		case '\u00d9':
		case '\u00da':
		case '\u00db':
		case '\u00dc':
		case '\u00f9':
		case '\u00fa':
		case '\u00fb':
		case '\u00fc':
			return 'u';
		case '\u00ff':
		case '\u0178':
			return 'y';
		case '\u00c0':
		case '\u00c1':
		case '\u00c2':
		case '\u00c3':
		case '\u00c4':
		case '\u00e0':
		case '\u00e1':
		case '\u00e2':
		case '\u00e3':
		case '\u00e4':
			return 'a';
		default:
			return Character.toLowerCase(c);
		}
	}
}
