/* Class527_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub1 extends Class527 {
	int[] anIntArray10330;
	static Class205 aClass205_10331;
	int[] anIntArray10332 = { -1 };
	static Class14 aClass14_10333 = new Class14(32);
	static int anInt10334;
	Class18[] aClass18Array10335;
	public static Class459 aClass459_10336;

	public static int method15993(int i, int i_0_, boolean bool, boolean bool_1_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool_1_, (byte) 46);
		if (class527_sub1 == null)
			return 0;
		int i_2_ = 0;
		for (int i_3_ = 0; i_3_ < class527_sub1.anIntArray10332.length; i_3_++) {
			if (class527_sub1.anIntArray10332[i_3_] >= 0 && (class527_sub1.anIntArray10332[i_3_] < (Class174_Sub2.aClass24_Sub17_9120.anInt230 * -1588728841))) {
				Class9 class9 = ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(class527_sub1.anIntArray10332[i_3_], -1934502243)));
				int i_4_ = class9.method620(i_0_, (((Class80) Class679.aClass24_Sub21_8628.method81(i_0_, 560296134)).anInt804) * 780718929, (byte) 0);
				if (bool)
					i_2_ += i_4_ * class527_sub1.anIntArray10330[i_3_];
				else
					i_2_ += i_4_;
			}
		}
		return i_2_;
	}

	long method15994(int[] is, int i, int[] is_5_, boolean bool, int i_6_) {
		long[] ls = RSByteBuffer.aLongArray10688;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_7_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_7_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_7_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_7_]) & 0xffL)];
		}
		if (is_5_ != null) {
			for (int i_8_ = 0; i_8_ < 5; i_8_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_5_[i_8_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	static Class527_Sub1 method15995(int i, boolean bool) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		return (Class527_Sub1) aClass14_10333.method709(l);
	}

	static {
		aClass205_10331 = new Class205(11);
	}

	static void method15996(int i) {
		anInt10334 = 1494731909 * i;
		aClass205_10331.method3793((byte) 113);
	}

	public static int method15997(int i, int i_9_, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 54);
		if (class527_sub1 == null)
			return 0;
		if (i_9_ < 0 || i_9_ >= class527_sub1.anIntArray10330.length)
			return 0;
		return class527_sub1.anIntArray10330[i_9_];
	}

	public static int method15998(int i, int i_10_, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 58);
		if (class527_sub1 == null)
			return 0;
		if (i_10_ < 0 || i_10_ >= class527_sub1.anIntArray10330.length)
			return 0;
		return class527_sub1.anIntArray10330[i_10_];
	}

	public static int method15999(int i, int i_11_, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 107);
		if (null == class527_sub1)
			return 0;
		if (i_11_ == -1)
			return 0;
		int i_12_ = 0;
		for (int i_13_ = 0; i_13_ < class527_sub1.anIntArray10330.length; i_13_++) {
			if (i_11_ == class527_sub1.anIntArray10332[i_13_])
				i_12_ += class527_sub1.anIntArray10330[i_13_];
		}
		return i_12_;
	}

	public static int method16000(int i, int i_14_, boolean bool) {
		int i_15_ = 0;
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 35);
		if (class527_sub1 == null)
			return 0;
		for (int i_16_ = 0; i_16_ < class527_sub1.anIntArray10332.length; i_16_++) {
			if (class527_sub1.anIntArray10332[i_16_] >= 0 && ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(class527_sub1.anIntArray10332[i_16_], 1062589980))).anInt82 * 1242789509 == i_14_)
				i_15_ += Class73.method1511(i, i_16_, bool, -2090485030);
		}
		return i_15_;
	}

	public static int method16001(int i, int i_17_, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 31);
		if (class527_sub1 == null)
			return -1;
		if (i_17_ < 0 || i_17_ >= class527_sub1.anIntArray10332.length)
			return -1;
		return class527_sub1.anIntArray10332[i_17_];
	}

	public static int method16002(int i, int i_18_, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 17);
		if (null == class527_sub1)
			return 0;
		if (i_18_ == -1)
			return 0;
		int i_19_ = 0;
		for (int i_20_ = 0; i_20_ < class527_sub1.anIntArray10330.length; i_20_++) {
			if (i_18_ == class527_sub1.anIntArray10332[i_20_])
				i_19_ += class527_sub1.anIntArray10330[i_20_];
		}
		return i_19_;
	}

	public static int method16003(int i, int i_21_, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 119);
		if (class527_sub1 == null)
			return 0;
		if (i_21_ < 0 || i_21_ >= class527_sub1.anIntArray10330.length)
			return 0;
		return class527_sub1.anIntArray10330[i_21_];
	}

	public static int method16004(int i, int i_22_, boolean bool, boolean bool_23_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool_23_, (byte) 83);
		if (class527_sub1 == null)
			return 0;
		int i_24_ = 0;
		for (int i_25_ = 0; i_25_ < class527_sub1.anIntArray10332.length; i_25_++) {
			if (class527_sub1.anIntArray10332[i_25_] >= 0 && (class527_sub1.anIntArray10332[i_25_] < (Class174_Sub2.aClass24_Sub17_9120.anInt230 * -1588728841))) {
				Class9 class9 = ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(class527_sub1.anIntArray10332[i_25_], -1259018548)));
				int i_26_ = class9.method620(i_22_, (((Class80) Class679.aClass24_Sub21_8628.method81(i_22_, -1196362027)).anInt804) * 780718929, (byte) 0);
				if (bool)
					i_24_ += i_26_ * class527_sub1.anIntArray10330[i_25_];
				else
					i_24_ += i_26_;
			}
		}
		return i_24_;
	}

	public static int method16005(int i, int i_27_, boolean bool, boolean bool_28_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool_28_, (byte) 87);
		if (class527_sub1 == null)
			return 0;
		int i_29_ = 0;
		for (int i_30_ = 0; i_30_ < class527_sub1.anIntArray10332.length; i_30_++) {
			if (class527_sub1.anIntArray10332[i_30_] >= 0 && (class527_sub1.anIntArray10332[i_30_] < (Class174_Sub2.aClass24_Sub17_9120.anInt230 * -1588728841))) {
				Class9 class9 = ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(class527_sub1.anIntArray10332[i_30_], 1992475355)));
				int i_31_ = class9.method620(i_27_, (((Class80) Class679.aClass24_Sub21_8628.method81(i_27_, 1425381801)).anInt804) * 780718929, (byte) 0);
				if (bool)
					i_29_ += i_31_ * class527_sub1.anIntArray10330[i_30_];
				else
					i_29_ += i_31_;
			}
		}
		return i_29_;
	}

	Class527_Sub1() {
		anIntArray10330 = new int[] { 0 };
		aClass18Array10335 = null;
	}

	public static int method16006(int i, boolean bool) {
		if (bool)
			return 0;
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 53);
		if (class527_sub1 == null)
			return ((((Class527_Sub8_Sub1) Class527_Sub26.aClass24_Sub20_10523.method81(i, -131210798)).anInt11335) * 429500197);
		int i_32_ = 0;
		for (int i_33_ = 0; i_33_ < class527_sub1.anIntArray10332.length; i_33_++) {
			if (class527_sub1.anIntArray10332[i_33_] == -1)
				i_32_++;
		}
		i_32_ += ((((Class527_Sub8_Sub1) Class527_Sub26.aClass24_Sub20_10523.method81(i, -471282136)).anInt11335) * 429500197 - class527_sub1.anIntArray10332.length);
		return i_32_;
	}

	public static int method16007(int i, boolean bool) {
		if (bool)
			return 0;
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 17);
		if (class527_sub1 == null)
			return ((((Class527_Sub8_Sub1) Class527_Sub26.aClass24_Sub20_10523.method81(i, 616116868)).anInt11335) * 429500197);
		int i_34_ = 0;
		for (int i_35_ = 0; i_35_ < class527_sub1.anIntArray10332.length; i_35_++) {
			if (class527_sub1.anIntArray10332[i_35_] == -1)
				i_34_++;
		}
		i_34_ += ((((Class527_Sub8_Sub1) Class527_Sub26.aClass24_Sub20_10523.method81(i, 1093778644)).anInt11335) * 429500197 - class527_sub1.anIntArray10332.length);
		return i_34_;
	}

	static void method16008(int i, int i_36_, int i_37_, int i_38_, Class18 class18, boolean bool) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		Class527_Sub1 class527_sub1 = (Class527_Sub1) aClass14_10333.method709(l);
		if (null == class527_sub1) {
			class527_sub1 = new Class527_Sub1();
			aClass14_10333.method714(class527_sub1, l);
		}
		if (class527_sub1.anIntArray10332.length <= i_36_) {
			int[] is = new int[1 + i_36_];
			int[] is_39_ = new int[i_36_ + 1];
			Class18[] class18s = null;
			if (null != class527_sub1.aClass18Array10335)
				class18s = new Class18[i_36_ + 1];
			for (int i_40_ = 0; i_40_ < class527_sub1.anIntArray10332.length; i_40_++) {
				is[i_40_] = class527_sub1.anIntArray10332[i_40_];
				is_39_[i_40_] = class527_sub1.anIntArray10330[i_40_];
				if (null != class527_sub1.aClass18Array10335)
					class18s[i_40_] = class527_sub1.aClass18Array10335[i_40_];
			}
			for (int i_41_ = class527_sub1.anIntArray10332.length; i_41_ < i_36_; i_41_++) {
				is[i_41_] = -1;
				is_39_[i_41_] = 0;
			}
			class527_sub1.anIntArray10332 = is;
			class527_sub1.anIntArray10330 = is_39_;
			class527_sub1.aClass18Array10335 = class18s;
		}
		class527_sub1.anIntArray10332[i_36_] = i_37_;
		class527_sub1.anIntArray10330[i_36_] = i_38_;
		if (null != class18) {
			if (class527_sub1.aClass18Array10335 == null)
				class527_sub1.aClass18Array10335 = new Class18[class527_sub1.anIntArray10332.length];
			class527_sub1.aClass18Array10335[i_36_] = class18;
		} else if (null != class527_sub1.aClass18Array10335)
			class527_sub1.aClass18Array10335[i_36_] = null;
	}

	static void method16009(int i, int i_42_, int i_43_, int i_44_, Class18 class18, boolean bool) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		Class527_Sub1 class527_sub1 = (Class527_Sub1) aClass14_10333.method709(l);
		if (null == class527_sub1) {
			class527_sub1 = new Class527_Sub1();
			aClass14_10333.method714(class527_sub1, l);
		}
		if (class527_sub1.anIntArray10332.length <= i_42_) {
			int[] is = new int[1 + i_42_];
			int[] is_45_ = new int[i_42_ + 1];
			Class18[] class18s = null;
			if (null != class527_sub1.aClass18Array10335)
				class18s = new Class18[i_42_ + 1];
			for (int i_46_ = 0; i_46_ < class527_sub1.anIntArray10332.length; i_46_++) {
				is[i_46_] = class527_sub1.anIntArray10332[i_46_];
				is_45_[i_46_] = class527_sub1.anIntArray10330[i_46_];
				if (null != class527_sub1.aClass18Array10335)
					class18s[i_46_] = class527_sub1.aClass18Array10335[i_46_];
			}
			for (int i_47_ = class527_sub1.anIntArray10332.length; i_47_ < i_42_; i_47_++) {
				is[i_47_] = -1;
				is_45_[i_47_] = 0;
			}
			class527_sub1.anIntArray10332 = is;
			class527_sub1.anIntArray10330 = is_45_;
			class527_sub1.aClass18Array10335 = class18s;
		}
		class527_sub1.anIntArray10332[i_42_] = i_43_;
		class527_sub1.anIntArray10330[i_42_] = i_44_;
		if (null != class18) {
			if (class527_sub1.aClass18Array10335 == null)
				class527_sub1.aClass18Array10335 = new Class18[class527_sub1.anIntArray10332.length];
			class527_sub1.aClass18Array10335[i_42_] = class18;
		} else if (null != class527_sub1.aClass18Array10335)
			class527_sub1.aClass18Array10335[i_42_] = null;
	}

	public static int method16010(int i, int i_48_, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 14);
		if (class527_sub1 == null)
			return 0;
		if (i_48_ < 0 || i_48_ >= class527_sub1.anIntArray10330.length)
			return 0;
		return class527_sub1.anIntArray10330[i_48_];
	}

	static void method16011(int i, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 105);
		if (class527_sub1 != null) {
			for (int i_49_ = 0; i_49_ < class527_sub1.anIntArray10332.length; i_49_++) {
				class527_sub1.anIntArray10332[i_49_] = -1;
				class527_sub1.anIntArray10330[i_49_] = 0;
			}
			class527_sub1.aClass18Array10335 = null;
		}
	}

	static void method16012(int i, boolean bool) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 6);
		if (class527_sub1 != null)
			class527_sub1.method8735(-1889161967);
	}

	long method16013(int[] is, int i, int[] is_50_, boolean bool) {
		long[] ls = RSByteBuffer.aLongArray10688;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_51_ = 0; i_51_ < is.length; i_51_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_51_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_51_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_51_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_51_]) & 0xffL)];
		}
		if (is_50_ != null) {
			for (int i_52_ = 0; i_52_ < 5; i_52_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_50_[i_52_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	final Class176 method16014(Class180 class180, int i, Class695 class695, int i_53_, boolean bool, Class633 class633, byte i_54_) {
		Class176 class176 = null;
		int i_55_ = i;
		Class587 class587 = null;
		if (i_53_ != -1)
			class587 = (Class587) Class258.aClass24_Sub2_2827.method81(i_53_, 1018014583);
		int[] is = anIntArray10332;
		if (null != class587 && class587.anIntArray7748 != null) {
			is = new int[class587.anIntArray7748.length];
			for (int i_56_ = 0; i_56_ < class587.anIntArray7748.length; i_56_++) {
				int i_57_ = class587.anIntArray7748[i_56_];
				if (i_57_ >= 0 && i_57_ < anIntArray10332.length)
					is[i_56_] = anIntArray10332[i_57_];
				else
					is[i_56_] = -1;
			}
		}
		if (null != class695)
			i_55_ |= class695.method14174(-822649352);
		long l = method15994(is, i_53_, null != class633 ? class633.anIntArray8285 : null, bool, 339590111);
		if (aClass205_10331 != null)
			class176 = (Class176) aClass205_10331.method3787(l);
		if (null == class176 || class180.method3175(class176.method2874(), i_55_) != 0) {
			if (class176 != null)
				i_55_ = class180.method3176(i_55_, class176.method2874());
			int i_58_ = i_55_;
			boolean bool_59_ = false;
			for (int i_60_ = 0; i_60_ < is.length; i_60_++) {
				if (is[i_60_] != -1 && !((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(is[i_60_], -2063544923)).method614(bool, null, 1461596981))
					bool_59_ = true;
			}
			if (bool_59_)
				return null;
			Class175[] class175s = new Class175[is.length];
			for (int i_61_ = 0; i_61_ < is.length; i_61_++) {
				if (is[i_61_] != -1)
					class175s[i_61_] = ((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(is[i_61_], -341925130)).method617(bool, null, -608751888);
			}
			if (null != class587 && class587.anIntArrayArray7744 != null) {
				for (int i_62_ = 0; i_62_ < class587.anIntArrayArray7744.length; i_62_++) {
					if (null != class587.anIntArrayArray7744[i_62_] && null != class175s[i_62_]) {
						int i_63_ = class587.anIntArrayArray7744[i_62_][0];
						int i_64_ = class587.anIntArrayArray7744[i_62_][1];
						int i_65_ = class587.anIntArrayArray7744[i_62_][2];
						int i_66_ = class587.anIntArrayArray7744[i_62_][3];
						int i_67_ = class587.anIntArrayArray7744[i_62_][4];
						int i_68_ = class587.anIntArrayArray7744[i_62_][5];
						if (0 != i_66_ || 0 != i_67_ || i_68_ != 0)
							class175s[i_62_].method2840(i_66_, i_67_, i_68_);
						if (i_63_ != 0 || 0 != i_64_ || i_65_ != 0)
							class175s[i_62_].method2812(i_63_, i_64_, i_65_);
					}
				}
			}
			Class175 class175 = new Class175(class175s, class175s.length);
			if (class633 != null)
				i_58_ |= 0x4000;
			class176 = class180.method3376(class175, i_58_, anInt10334 * 278940749, 64, 850);
			if (class633 != null) {
				for (int i_69_ = 0; i_69_ < 10; i_69_++) {
					for (int i_70_ = 0; i_70_ < Class193.aShortArrayArray2156[i_69_].length; i_70_++) {
						if (class633.anIntArray8285[i_69_] < (Class487.aShortArrayArrayArray5470[i_69_][i_70_]).length)
							class176.method2907(Class193.aShortArrayArray2156[i_69_][i_70_], (Class487.aShortArrayArrayArray5470[i_69_][i_70_][class633.anIntArray8285[i_69_]]));
					}
				}
				for (int i_71_ = 0; i_71_ < 10; i_71_++) {
					for (int i_72_ = 0; i_72_ < Class552.aShortArrayArray7313[i_71_].length; i_72_++) {
						if (class633.anIntArray8282[i_71_] < (Class78.aShortArrayArrayArray802[i_71_][i_72_]).length)
							class176.method2909(Class552.aShortArrayArray7313[i_71_][i_72_], (Class78.aShortArrayArrayArray802[i_71_][i_72_][class633.anIntArray8282[i_71_]]));
					}
				}
			}
			if (aClass205_10331 != null) {
				class176.method2941(i_55_);
				aClass205_10331.method3790(class176, l);
			}
		}
		if (class695 == null)
			return class176;
		Class176 class176_73_ = class176.method2862((byte) 1, i_55_, true);
		class695.method14175(class176_73_, 0, (byte) 0);
		return class176_73_;
	}

	static void method16015() {
		aClass205_10331.method3793((byte) 10);
	}

	static void method16016() {
		aClass205_10331.method3793((byte) 55);
	}

	public static Class407[] method16017(byte i) {
		return (new Class407[] { Class407.aClass407_4224, Class407.aClass407_4257, Class407.aClass407_4249, Class407.aClass407_4261, Class407.aClass407_4221, Class407.aClass407_4245, Class407.aClass407_4231, Class407.aClass407_4217, Class407.aClass407_4228, Class407.aClass407_4230, Class407.aClass407_4251, Class407.aClass407_4262, Class407.aClass407_4260, Class407.aClass407_4213, Class407.aClass407_4234, Class407.aClass407_4255, Class407.aClass407_4252, Class407.aClass407_4212,
				Class407.aClass407_4241, Class407.aClass407_4258, Class407.aClass407_4244, Class407.aClass407_4247, Class407.aClass407_4227, Class407.aClass407_4219, Class407.aClass407_4214, Class407.aClass407_4238, Class407.aClass407_4253, Class407.aClass407_4243, Class407.aClass407_4222, Class407.aClass407_4232, Class407.aClass407_4223, Class407.aClass407_4216, Class407.aClass407_4220, Class407.aClass407_4210, Class407.aClass407_4242, Class407.aClass407_4226, Class407.aClass407_4239,
				Class407.aClass407_4254, Class407.aClass407_4225, Class407.aClass407_4250, Class407.aClass407_4237, Class407.aClass407_4235, Class407.aClass407_4248, Class407.aClass407_4215, Class407.aClass407_4240, Class407.aClass407_4236, Class407.aClass407_4259, Class407.aClass407_4256, Class407.aClass407_4211, Class407.aClass407_4218, Class407.aClass407_4229, Class407.aClass407_4233 });
	}

	static final void method16018(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_74_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_75_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (client.aClass492ArrayArray11272[i_75_][i_74_].anInt5487 * 293033043);
	}

	static final void method16019(Class640_Sub1 class640_sub1, Class665 class665, int i) {
		boolean bool = false;
		int i_76_ = 0;
		int i_77_ = 0;
		int i_78_ = 0;
		int i_79_ = 0;
		if (class640_sub1.aClass169Array10863 != null) {
			for (int i_80_ = 0; i_80_ < class640_sub1.aClass169Array10863.length; i_80_++) {
				Class169 class169 = class640_sub1.aClass169Array10863[i_80_];
				if (class169.aBool1874) {
					int i_81_;
					int i_82_;
					if (class169.anInt1873 < class169.anInt1872) {
						i_81_ = class169.anInt1873 - class169.anInt1877;
						i_82_ = class169.anInt1877 + class169.anInt1872;
					} else {
						i_81_ = class169.anInt1872 - class169.anInt1877;
						i_82_ = class169.anInt1873 + class169.anInt1877;
					}
					int i_83_;
					int i_84_;
					if (class169.anInt1875 < class169.anInt1876) {
						i_83_ = class169.anInt1875 - class169.anInt1877;
						i_84_ = class169.anInt1876 + class169.anInt1877;
					} else {
						i_83_ = class169.anInt1876 - class169.anInt1877;
						i_84_ = class169.anInt1875 + class169.anInt1877;
					}
					if (!bool || i_81_ < i_76_)
						i_76_ = i_81_;
					if (!bool || i_83_ < i_77_)
						i_77_ = i_83_;
					if (!bool || i_82_ > i_78_)
						i_78_ = i_82_;
					if (!bool || i_84_ > i_79_)
						i_79_ = i_84_;
					bool = true;
				}
			}
		}
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = bool ? 1 : 0;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_76_;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_77_;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_78_;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_79_;
	}
}
