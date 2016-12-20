/* Class633 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class633 {
	public int anInt8271 = -1431630183;
	public static final int anInt8272 = 1073741824;
	static final int anInt8273 = 1073741823;
	public static final int anInt8274 = 10;
	public static final int anInt8275 = 10;
	public static final int anInt8276 = 4;
	public static final int anInt8277 = 4;
	public boolean aBool8278;
	Class23[] aClass23Array8279;
	long aLong8280;
	public static final int anInt8281 = -2147483648;
	public int[] anIntArray8282;
	int anInt8283;
	long aLong8284;
	public int[] anIntArray8285;
	int[] anIntArray8286;
	static int[] anIntArray8287 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	static Class205 aClass205_8288 = new Class205(260);
	static Class205 aClass205_8289 = new Class205(5);

	public void method10475(int i, int i_0_, int i_1_) {
		anIntArray8285[i] = i_0_;
		method10492(1378711409);
	}

	public void method10476(int i, int[] is, Class23[] class23s, int[] is_2_, int[] is_3_, boolean bool, int i_4_, int i_5_) {
		if (i != 148245047 * anInt8283)
			anInt8283 = 1538378631 * i;
		anIntArray8286 = is;
		aClass23Array8279 = class23s;
		anIntArray8285 = is_2_;
		anIntArray8282 = is_3_;
		aBool8278 = bool;
		anInt8271 = i_4_ * 1431630183;
		method10492(1261680303);
	}

	public Class176 method10477(Class180 class180, int i, Class24_Sub2 class24_sub2, Class24_Sub19 class24_sub19, Class24_Sub9 class24_sub9, Class24_Sub17 class24_sub17, Interface20 interface20, Interface18 interface18, Class695 class695, Class695 class695_6_, Class695[] class695s, int[] is, int i_7_, boolean bool, Class616 class616) {
		if (-1 != 1032231511 * anInt8271)
			return (((Class295) class24_sub9.method81(anInt8271 * 1032231511, -1048075668)).method5302(class180, i, class24_sub2, interface20, interface18, class695, class695_6_, class695s, is, i_7_, null, -209491270));
		int i_8_ = i;
		long l = 1703005809715999049L * aLong8284;
		int[] is_9_ = anIntArray8286;
		boolean bool_10_ = false;
		boolean bool_11_ = false;
		if (null != class695) {
			Class198 class198 = class695.method14163(2057551333);
			if (null != class198 && (-552058037 * class198.anInt2181 >= 0 || class198.anInt2182 * -1682597575 >= 0)) {
				is_9_ = new int[anIntArray8286.length];
				for (int i_12_ = 0; i_12_ < is_9_.length; i_12_++)
					is_9_[i_12_] = anIntArray8286[i_12_];
				if (-552058037 * class198.anInt2181 >= 0 && -1 != -166140631 * class616.anInt8088) {
					bool_10_ = true;
					if (65535 == class198.anInt2181 * -552058037) {
						is_9_[-166140631 * class616.anInt8088] = 0;
						for (int i_13_ = 0; i_13_ < class616.anIntArray8089.length; i_13_++)
							is_9_[class616.anIntArray8089[i_13_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_9_[class616.anInt8088 * -166140631] = -552058037 * class198.anInt2181 | 0x40000000;
						for (int i_14_ = 0; i_14_ < class616.anIntArray8089.length; i_14_++)
							is_9_[class616.anIntArray8089[i_14_]] = 0;
						l ^= ((long) is_9_[-166140631 * class616.anInt8088] << 32);
					}
				}
				if (class198.anInt2182 * -1682597575 >= 0 && -1 != -246087045 * class616.anInt8085) {
					bool_11_ = true;
					if (class198.anInt2182 * -1682597575 == 65535) {
						is_9_[class616.anInt8085 * -246087045] = 0;
						for (int i_15_ = 0; i_15_ < class616.anIntArray8090.length; i_15_++)
							is_9_[class616.anIntArray8090[i_15_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_9_[-246087045 * class616.anInt8085] = -1682597575 * class198.anInt2182 | 0x40000000;
						for (int i_16_ = 0; i_16_ < class616.anIntArray8090.length; i_16_++)
							is_9_[class616.anIntArray8090[i_16_]] = 0;
						l ^= (long) is_9_[-246087045 * class616.anInt8085];
					}
				}
			}
		}
		boolean bool_17_ = false;
		int i_18_ = class695s != null ? class695s.length : 0;
		for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
			if (class695s[i_19_] != null) {
				i_8_ |= class695s[i_19_].method14174(-822649352);
				bool_17_ = true;
			}
		}
		if (null != class695) {
			i_8_ |= class695.method14174(-822649352);
			bool_17_ = true;
		}
		if (class695_6_ != null) {
			i_8_ |= class695_6_.method14174(-822649352);
			bool_17_ = true;
		}
		boolean bool_20_ = false;
		if (is != null) {
			for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
				if (-1 != is[i_21_]) {
					i_8_ |= 0x20;
					bool_20_ = true;
				}
			}
		}
		Class176 class176;
		synchronized (aClass205_8288) {
			class176 = (Class176) aClass205_8288.method3787(l);
		}
		Class587 class587 = null;
		if (-1 != 148245047 * anInt8283)
			class587 = (Class587) class24_sub2.method81(anInt8283 * 148245047, 2059175114);
		if (null == class176 || class180.method3175(class176.method2874(), i_8_) != 0) {
			if (null != class176)
				i_8_ = class180.method3176(i_8_, class176.method2874());
			int i_22_ = i_8_;
			boolean bool_23_ = false;
			for (int i_24_ = 0; i_24_ < is_9_.length; i_24_++) {
				int i_25_ = is_9_[i_24_];
				Class23 class23 = null;
				boolean bool_26_ = false;
				if (bool_10_) {
					if (i_24_ == class616.anInt8088 * -166140631)
						bool_26_ = true;
					else {
						for (int i_27_ = 0; i_27_ < class616.anIntArray8089.length; i_27_++) {
							if (i_24_ == class616.anIntArray8089[i_27_]) {
								bool_26_ = true;
								break;
							}
						}
					}
				}
				if (bool_11_) {
					if (i_24_ == class616.anInt8085 * -246087045)
						bool_26_ = true;
					else {
						for (int i_28_ = 0; i_28_ < class616.anIntArray8090.length; i_28_++) {
							if (i_24_ == class616.anIntArray8090[i_28_]) {
								bool_26_ = true;
								break;
							}
						}
					}
				}
				if (0 != (i_25_ & 0x40000000)) {
					if (!bool_26_ && aClass23Array8279 != null && null != aClass23Array8279[i_24_])
						class23 = aClass23Array8279[i_24_];
					if (!((Class9) class24_sub17.method81(i_25_ & 0x3fffffff, -452135309)).method614(aBool8278, class23, 1683354822))
						bool_23_ = true;
				} else if ((i_25_ & ~0x7fffffff) != 0 && !((Class322) class24_sub19.method81(i_25_ & 0x3fffffff, 291149814)).method5705((byte) 6))
					bool_23_ = true;
			}
			if (bool_23_) {
				if (-1L != -575281462585291815L * aLong8280) {
					synchronized (aClass205_8288) {
						class176 = (Class176) (aClass205_8288.method3787(aLong8280 * -575281462585291815L));
					}
				}
				if (class176 == null || class180.method3175(class176.method2874(), i_8_) != 0)
					return null;
			} else {
				Class175[] class175s = new Class175[is_9_.length];
				for (int i_29_ = 0; i_29_ < is_9_.length; i_29_++) {
					int i_30_ = is_9_[i_29_];
					Class23 class23 = null;
					boolean bool_31_ = i_29_ == 5 && bool_10_ || 3 == i_29_ && bool_11_;
					if ((i_30_ & 0x40000000) != 0) {
						if (!bool_31_ && null != aClass23Array8279 && aClass23Array8279[i_29_] != null)
							class23 = aClass23Array8279[i_29_];
						Class175 class175 = ((Class9) class24_sub17.method81(i_30_ & 0x3fffffff, -1444708111)).method617(aBool8278, class23, -1494931622);
						if (class175 != null)
							class175s[i_29_] = class175;
					} else if ((i_30_ & ~0x7fffffff) != 0) {
						Class175 class175 = ((Class322) class24_sub19.method81(i_30_ & 0x3fffffff, 1571226337)).method5706(-550394187);
						if (class175 != null)
							class175s[i_29_] = class175;
					}
				}
				if (class587 != null && null != class587.anIntArrayArray7744) {
					for (int i_32_ = 0; i_32_ < class587.anIntArrayArray7744.length; i_32_++) {
						if (null != class175s[i_32_]) {
							int i_33_ = 0;
							int i_34_ = 0;
							int i_35_ = 0;
							int i_36_ = 0;
							int i_37_ = 0;
							int i_38_ = 0;
							if (class587.anIntArrayArray7744[i_32_] != null) {
								i_33_ = class587.anIntArrayArray7744[i_32_][0];
								i_34_ = class587.anIntArrayArray7744[i_32_][1];
								i_35_ = class587.anIntArrayArray7744[i_32_][2];
								i_36_ = (class587.anIntArrayArray7744[i_32_][3] << 3);
								i_37_ = (class587.anIntArrayArray7744[i_32_][4] << 3);
								i_38_ = (class587.anIntArrayArray7744[i_32_][5] << 3);
							}
							if (0 != i_36_ || 0 != i_37_ || 0 != i_38_)
								class175s[i_32_].method2840(i_36_, i_37_, i_38_);
							if (i_33_ != 0 || i_34_ != 0 || i_35_ != 0)
								class175s[i_32_].method2812(i_33_, i_34_, i_35_);
						}
					}
				}
				Class175 class175 = new Class175(class175s, class175s.length);
				i_22_ |= 0x4000;
				class176 = class180.method3376(class175, i_22_, -315634293 * Class475.anInt5383, 64, 850);
				for (int i_39_ = 0; i_39_ < 10; i_39_++) {
					for (int i_40_ = 0; i_40_ < Class193.aShortArrayArray2156[i_39_].length; i_40_++) {
						if (anIntArray8285[i_39_] < (Class487.aShortArrayArrayArray5470[i_39_][i_40_]).length)
							class176.method2907((Class193.aShortArrayArray2156[i_39_][i_40_]), (Class487.aShortArrayArrayArray5470[i_39_][i_40_][anIntArray8285[i_39_]]));
					}
				}
				for (int i_41_ = 0; i_41_ < 10; i_41_++) {
					for (int i_42_ = 0; i_42_ < Class552.aShortArrayArray7313[i_41_].length; i_42_++) {
						if (anIntArray8282[i_41_] < (Class78.aShortArrayArrayArray802[i_41_][i_42_]).length)
							class176.method2909((Class552.aShortArrayArray7313[i_41_][i_42_]), (Class78.aShortArrayArrayArray802[i_41_][i_42_][anIntArray8282[i_41_]]));
					}
				}
				class176.method2901();
				if (bool) {
					class176.method2941(i_8_);
					synchronized (aClass205_8288) {
						aClass205_8288.method3790(class176, l);
					}
					aLong8280 = l * 4702159447199138921L;
				}
			}
		}
		Class176 class176_43_ = class176.method2862((byte) 4, i_8_, true);
		if (!bool_17_ && !bool_20_)
			return class176_43_;
		Class432[] class432s = null;
		if (null != class587)
			class432s = class587.method9788((byte) -96);
		if (bool_20_ && null != class432s) {
			for (int i_44_ = 0; i_44_ < is.length; i_44_++) {
				if (null != class432s[i_44_])
					class176_43_.method2888(class432s[i_44_], 1 << i_44_, true);
			}
		}
		int i_45_ = 0;
		int i_46_ = 1;
		while (i_45_ < i_18_) {
			if (null != class695s[i_45_])
				class695s[i_45_].method14176(class176_43_, 0, i_46_, -2012863316);
			i_45_++;
			i_46_ <<= 1;
		}
		if (bool_20_) {
			for (i_45_ = 0; i_45_ < is.length; i_45_++) {
				if (is[i_45_] != -1) {
					i_46_ = is[i_45_] - i_7_;
					i_46_ &= 0x3fff;
					Class432 class432 = new Class432();
					class432.method6890(0.0F, 1.0F, 0.0F, Class428.method6863(i_46_));
					class176_43_.method2888(class432, 1 << i_45_, false);
				}
			}
		}
		if (bool_20_ && null != class432s) {
			for (i_45_ = 0; i_45_ < is.length; i_45_++) {
				if (class432s[i_45_] != null)
					class176_43_.method2888(class432s[i_45_], 1 << i_45_, false);
			}
		}
		if (null != class695 && class695_6_ != null)
			Class476.method7773(class176_43_, class695, class695_6_, -1237622773);
		else if (class695 != null)
			class695.method14175(class176_43_, 0, (byte) 0);
		else if (class695_6_ != null)
			class695_6_.method14175(class176_43_, 0, (byte) 0);
		return class176_43_;
	}

	public static void method10478(int i) {
		Class475.anInt5383 = i * 1722642979;
		synchronized (aClass205_8289) {
			aClass205_8289.method3793((byte) 89);
		}
		synchronized (aClass205_8288) {
			aClass205_8288.method3793((byte) 127);
		}
	}

	public void method10479(boolean bool, int i) {
		aBool8278 = bool;
		method10492(742036282);
	}

	public void method10480(int i, int i_47_, Class24_Sub19 class24_sub19) {
		int i_48_ = anIntArray8287[i];
		if (class24_sub19.method81(i_47_, -1155614004) != null) {
			anIntArray8286[i_48_] = i_47_ | ~0x7fffffff;
			method10492(995509759);
		}
	}

	public void method10481(int i, int i_49_, Class24_Sub17 class24_sub17, int i_50_) {
		if (-1 == i_49_)
			anIntArray8286[i] = 0;
		else if (class24_sub17.method81(i_49_, -1512027290) != null) {
			anIntArray8286[i] = i_49_ | 0x40000000;
			method10492(419253868);
		}
	}

	public void method10482(int i, int i_51_, Class24_Sub19 class24_sub19, byte i_52_) {
		int i_53_ = anIntArray8287[i];
		if (class24_sub19.method81(i_51_, 1761940131) != null) {
			anIntArray8286[i_53_] = i_51_ | ~0x7fffffff;
			method10492(1513865889);
		}
	}

	public void method10483(int i, int[] is, Class23[] class23s, int[] is_54_, int[] is_55_, boolean bool, int i_56_) {
		if (i != 148245047 * anInt8283)
			anInt8283 = 1538378631 * i;
		anIntArray8286 = is;
		aClass23Array8279 = class23s;
		anIntArray8285 = is_54_;
		anIntArray8282 = is_55_;
		aBool8278 = bool;
		anInt8271 = i_56_ * 1431630183;
		method10492(923031134);
	}

	public Class176 method10484(Class180 class180, int i, Class24_Sub19 class24_sub19, Class24_Sub10 class24_sub10, Class695 class695, int i_57_, int i_58_, int i_59_, int i_60_) {
		int i_61_ = null != class695 ? i | class695.method14174(-822649352) : i;
		long l = (long) i_59_ << 32 | (long) (i_58_ << 16) | (long) i_57_;
		Class176 class176;
		synchronized (aClass205_8289) {
			class176 = (Class176) aClass205_8289.method3787(l);
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_61_) != 0) {
			if (null != class176)
				i_61_ = class180.method3176(i_61_, class176.method2874());
			int i_62_ = i_61_;
			Class175[] class175s = new Class175[3];
			int i_63_ = 0;
			if (((Class322) class24_sub19.method81(i_57_, 87295569)).method5711(-1173855569) && ((Class322) class24_sub19.method81(i_58_, -1658496777)).method5711(-1173855569) && ((Class322) class24_sub19.method81(i_59_, 1245384006)).method5711(-1173855569)) {
				Class175 class175 = ((Class322) class24_sub19.method81(i_57_, 630153569)).method5708(1769813785);
				if (class175 != null)
					class175s[i_63_++] = class175;
				class175 = ((Class322) class24_sub19.method81(i_58_, 1869778238)).method5708(1769813785);
				if (null != class175)
					class175s[i_63_++] = class175;
				class175 = ((Class322) class24_sub19.method81(i_59_, 67385883)).method5708(1769813785);
				if (null != class175)
					class175s[i_63_++] = class175;
				class175 = new Class175(class175s, i_63_);
				i_62_ |= 0x4000;
				class176 = class180.method3376(class175, i_62_, Class475.anInt5383 * -315634293, 64, 768);
				for (int i_64_ = 0; i_64_ < 10; i_64_++) {
					for (int i_65_ = 0; i_65_ < Class193.aShortArrayArray2156[i_64_].length; i_65_++) {
						if (anIntArray8285[i_64_] < (Class487.aShortArrayArrayArray5470[i_64_][i_65_]).length)
							class176.method2907((Class193.aShortArrayArray2156[i_64_][i_65_]), (Class487.aShortArrayArrayArray5470[i_64_][i_65_][anIntArray8285[i_64_]]));
					}
				}
				for (int i_66_ = 0; i_66_ < 10; i_66_++) {
					for (int i_67_ = 0; i_67_ < Class552.aShortArrayArray7313[i_66_].length; i_67_++) {
						if (anIntArray8282[i_66_] < (Class78.aShortArrayArrayArray802[i_66_][i_67_]).length)
							class176.method2909((Class552.aShortArrayArray7313[i_66_][i_67_]), (Class78.aShortArrayArrayArray802[i_66_][i_67_][anIntArray8282[i_66_]]));
					}
				}
				class176.method2941(i_61_);
				synchronized (aClass205_8289) {
					aClass205_8289.method3790(class176, l);
				}
			} else
				return null;
		}
		if (class695 == null)
			return class176;
		class176 = class176.method2862((byte) 4, i_61_, true);
		class695.method14175(class176, 0, (byte) 0);
		return class176;
	}

	public static void method10485() {
		synchronized (aClass205_8288) {
			aClass205_8288.method3793((byte) 9);
		}
		synchronized (aClass205_8289) {
			aClass205_8289.method3793((byte) 5);
		}
	}

	public void method10486(int i, int[] is, Class23[] class23s, int[] is_68_, int[] is_69_, boolean bool, int i_70_) {
		if (i != 148245047 * anInt8283)
			anInt8283 = 1538378631 * i;
		anIntArray8286 = is;
		aClass23Array8279 = class23s;
		anIntArray8285 = is_68_;
		anIntArray8282 = is_69_;
		aBool8278 = bool;
		anInt8271 = i_70_ * 1431630183;
		method10492(943214448);
	}

	public void method10487(int i, int[] is, Class23[] class23s, int[] is_71_, int[] is_72_, boolean bool, int i_73_) {
		if (i != 148245047 * anInt8283)
			anInt8283 = 1538378631 * i;
		anIntArray8286 = is;
		aClass23Array8279 = class23s;
		anIntArray8285 = is_71_;
		anIntArray8282 = is_72_;
		aBool8278 = bool;
		anInt8271 = i_73_ * 1431630183;
		method10492(1776822850);
	}

	public void method10488(int i, int[] is, Class23[] class23s, int[] is_74_, int[] is_75_, boolean bool, int i_76_) {
		if (i != 148245047 * anInt8283)
			anInt8283 = 1538378631 * i;
		anIntArray8286 = is;
		aClass23Array8279 = class23s;
		anIntArray8285 = is_74_;
		anIntArray8282 = is_75_;
		aBool8278 = bool;
		anInt8271 = i_76_ * 1431630183;
		method10492(152964763);
	}

	public void method10489(int i, int[] is, Class23[] class23s, int[] is_77_, int[] is_78_, boolean bool, int i_79_) {
		if (i != 148245047 * anInt8283)
			anInt8283 = 1538378631 * i;
		anIntArray8286 = is;
		aClass23Array8279 = class23s;
		anIntArray8285 = is_77_;
		anIntArray8282 = is_78_;
		aBool8278 = bool;
		anInt8271 = i_79_ * 1431630183;
		method10492(1115034098);
	}

	public Class176 method10490(Class180 class180, int i, Class24_Sub19 class24_sub19, Class24_Sub9 class24_sub9, Class24_Sub17 class24_sub17, Interface20 interface20, Interface18 interface18, Class695 class695) {
		if (anInt8271 * 1032231511 != -1)
			return (((Class295) class24_sub9.method81(anInt8271 * 1032231511, -1008321983)).method5301(class180, i, interface20, interface18, class695, null, -1576439925));
		int i_80_ = class695 != null ? i | class695.method14174(-822649352) : i;
		Class176 class176;
		synchronized (aClass205_8289) {
			class176 = (Class176) aClass205_8289.method3787(aLong8284 * 1703005809715999049L);
		}
		if (null == class176 || class180.method3175(class176.method2874(), i_80_) != 0) {
			if (class176 != null)
				i_80_ = class180.method3176(i_80_, class176.method2874());
			int i_81_ = i_80_;
			boolean bool = false;
			for (int i_82_ = 0; i_82_ < anIntArray8286.length; i_82_++) {
				int i_83_ = anIntArray8286[i_82_];
				Class23 class23 = null;
				if ((i_83_ & 0x40000000) != 0) {
					if (null != aClass23Array8279 && null != aClass23Array8279[i_82_])
						class23 = aClass23Array8279[i_82_];
					if (!((Class9) class24_sub17.method81(i_83_ & 0x3fffffff, -60813892)).method618(aBool8278, class23, 1625482144))
						bool = true;
				} else if (0 != (i_83_ & ~0x7fffffff) && !((Class322) class24_sub19.method81(i_83_ & 0x3fffffff, 1206650408)).method5711(-1173855569))
					bool = true;
			}
			if (bool)
				return null;
			Class175[] class175s = new Class175[anIntArray8286.length];
			int i_84_ = 0;
			for (int i_85_ = 0; i_85_ < anIntArray8286.length; i_85_++) {
				int i_86_ = anIntArray8286[i_85_];
				Class23 class23 = null;
				if (0 != (i_86_ & 0x40000000)) {
					if (aClass23Array8279 != null && aClass23Array8279[i_85_] != null)
						class23 = aClass23Array8279[i_85_];
					Class175 class175 = ((Class9) class24_sub17.method81(i_86_ & 0x3fffffff, 111348976)).method639(aBool8278, class23, 408995584);
					if (null != class175)
						class175s[i_84_++] = class175;
				} else if ((i_86_ & ~0x7fffffff) != 0) {
					Class175 class175 = ((Class322) class24_sub19.method81(i_86_ & 0x3fffffff, -752034864)).method5708(1769813785);
					if (class175 != null)
						class175s[i_84_++] = class175;
				}
			}
			Class175 class175 = new Class175(class175s, i_84_);
			i_81_ |= 0x4000;
			class176 = class180.method3376(class175, i_81_, -315634293 * Class475.anInt5383, 64, 768);
			for (int i_87_ = 0; i_87_ < 10; i_87_++) {
				for (int i_88_ = 0; i_88_ < Class193.aShortArrayArray2156[i_87_].length; i_88_++) {
					if (anIntArray8285[i_87_] < (Class487.aShortArrayArrayArray5470[i_87_][i_88_]).length)
						class176.method2907((Class193.aShortArrayArray2156[i_87_][i_88_]), (Class487.aShortArrayArrayArray5470[i_87_][i_88_][anIntArray8285[i_87_]]));
				}
			}
			for (int i_89_ = 0; i_89_ < 10; i_89_++) {
				for (int i_90_ = 0; i_90_ < Class552.aShortArrayArray7313[i_89_].length; i_90_++) {
					if (anIntArray8282[i_89_] < (Class78.aShortArrayArrayArray802[i_89_][i_90_]).length)
						class176.method2909((Class552.aShortArrayArray7313[i_89_][i_90_]), (Class78.aShortArrayArrayArray802[i_89_][i_90_][anIntArray8282[i_89_]]));
				}
			}
			class176.method2941(i_80_);
			synchronized (aClass205_8289) {
				aClass205_8289.method3790(class176, aLong8284 * 1703005809715999049L);
			}
		}
		if (null == class695)
			return class176;
		Class176 class176_91_ = class176.method2862((byte) 4, i_80_, true);
		class695.method14175(class176_91_, 0, (byte) 0);
		return class176_91_;
	}

	public void method10491(int i, int i_92_, int i_93_) {
		anIntArray8282[i] = i_92_;
		method10492(1903136295);
	}

	void method10492(int i) {
		long[] ls = RSByteBuffer.aLongArray10688;
		aLong8284 = -5419621410820018425L;
		aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) (anInt8283 * 148245047 >> 8)) & 0xffL)]) * 5419621410820018425L;
		aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (148245047 * anInt8283)) & 0xffL)]) * 5419621410820018425L;
		for (int i_94_ = 0; i_94_ < anIntArray8286.length; i_94_++) {
			aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) (anIntArray8286[i_94_] >> 24)) & 0xffL)]));
			aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (anIntArray8286[i_94_] >> 16)) & 0xffL)]) * 5419621410820018425L;
			aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (anIntArray8286[i_94_] >> 8)) & 0xffL)]));
			aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) anIntArray8286[i_94_]) & 0xffL)]) * 5419621410820018425L;
		}
		if (null != aClass23Array8279) {
			for (int i_95_ = 0; i_95_ < aClass23Array8279.length; i_95_++) {
				if (aClass23Array8279[i_95_] != null) {
					int[] is;
					int[] is_96_;
					if (aBool8278) {
						is = aClass23Array8279[i_95_].anIntArray217;
						is_96_ = aClass23Array8279[i_95_].anIntArray226;
					} else {
						is = aClass23Array8279[i_95_].anIntArray222;
						is_96_ = aClass23Array8279[i_95_].anIntArray224;
					}
					if (is != null) {
						for (int i_97_ = 0; i_97_ < is.length; i_97_++) {
							aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) (is[i_97_] >> 8)) & 0xffL)]));
							aLong8284 = ((aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) is[i_97_]) & 0xffL)]) * 5419621410820018425L);
						}
					}
					if (null != is_96_) {
						for (int i_98_ = 0; i_98_ < is_96_.length; i_98_++) {
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) (is_96_[i_98_] >> 8)) & 0xffL)]));
							aLong8284 = ((aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) is_96_[i_98_]) & 0xffL)]) * 5419621410820018425L);
						}
					}
					if (null != aClass23Array8279[i_95_].aShortArray218) {
						for (int i_99_ = 0; i_99_ < (aClass23Array8279[i_95_].aShortArray218).length; i_99_++) {
							aLong8284 = ((1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) ((aClass23Array8279[i_95_].aShortArray218[i_99_]) >> 8)) & 0xffL)]) * 5419621410820018425L);
							aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) (aClass23Array8279[i_95_].aShortArray218[i_99_])) & 0xffL)]));
						}
					}
					if (null != aClass23Array8279[i_95_].aShortArray227) {
						for (int i_100_ = 0; i_100_ < (aClass23Array8279[i_95_].aShortArray227).length; i_100_++) {
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) ((aClass23Array8279[i_95_].aShortArray227[i_100_]) >> 8)) & 0xffL)]));
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) (aClass23Array8279[i_95_].aShortArray227[i_100_])) & 0xffL)]));
						}
					}
				}
			}
		}
		for (int i_101_ = 0; i_101_ < 10; i_101_++)
			aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) anIntArray8285[i_101_]) & 0xffL)]) * 5419621410820018425L;
		for (int i_102_ = 0; i_102_ < 10; i_102_++)
			aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) anIntArray8282[i_102_]) & 0xffL)]) * 5419621410820018425L;
		aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (aBool8278 ? 1 : 0)) & 0xffL)]) * 5419621410820018425L;
	}

	public void method10493(int i, int i_103_) {
		anIntArray8282[i] = i_103_;
		method10492(828130072);
	}

	public void method10494(int i, int i_104_) {
		anIntArray8282[i] = i_104_;
		method10492(655165083);
	}

	public void method10495(boolean bool) {
		aBool8278 = bool;
		method10492(1804636817);
	}

	public void method10496(int i, int i_105_, Class24_Sub17 class24_sub17) {
		if (-1 == i_105_)
			anIntArray8286[i] = 0;
		else if (class24_sub17.method81(i_105_, 1196941515) != null) {
			anIntArray8286[i] = i_105_ | 0x40000000;
			method10492(1198669859);
		}
	}

	public void method10497(int i, int i_106_, Class24_Sub17 class24_sub17) {
		if (-1 == i_106_)
			anIntArray8286[i] = 0;
		else if (class24_sub17.method81(i_106_, -1552542579) != null) {
			anIntArray8286[i] = i_106_ | 0x40000000;
			method10492(490965770);
		}
	}

	public Class176 method10498(Class180 class180, int i, Class24_Sub19 class24_sub19, Class24_Sub9 class24_sub9, Class24_Sub17 class24_sub17, Interface20 interface20, Interface18 interface18, Class695 class695, int i_107_) {
		if (anInt8271 * 1032231511 != -1)
			return (((Class295) class24_sub9.method81(anInt8271 * 1032231511, 1539106604)).method5301(class180, i, interface20, interface18, class695, null, -2055567166));
		int i_108_ = class695 != null ? i | class695.method14174(-822649352) : i;
		Class176 class176;
		synchronized (aClass205_8289) {
			class176 = (Class176) aClass205_8289.method3787(aLong8284 * 1703005809715999049L);
		}
		if (null == class176 || class180.method3175(class176.method2874(), i_108_) != 0) {
			if (class176 != null)
				i_108_ = class180.method3176(i_108_, class176.method2874());
			int i_109_ = i_108_;
			boolean bool = false;
			for (int i_110_ = 0; i_110_ < anIntArray8286.length; i_110_++) {
				int i_111_ = anIntArray8286[i_110_];
				Class23 class23 = null;
				if ((i_111_ & 0x40000000) != 0) {
					if (null != aClass23Array8279 && null != aClass23Array8279[i_110_])
						class23 = aClass23Array8279[i_110_];
					if (!((Class9) class24_sub17.method81(i_111_ & 0x3fffffff, -1516698321)).method618(aBool8278, class23, -497132857))
						bool = true;
				} else if (0 != (i_111_ & ~0x7fffffff) && !((Class322) class24_sub19.method81(i_111_ & 0x3fffffff, -837606343)).method5711(-1173855569))
					bool = true;
			}
			if (bool)
				return null;
			Class175[] class175s = new Class175[anIntArray8286.length];
			int i_112_ = 0;
			for (int i_113_ = 0; i_113_ < anIntArray8286.length; i_113_++) {
				int i_114_ = anIntArray8286[i_113_];
				Class23 class23 = null;
				if (0 != (i_114_ & 0x40000000)) {
					if (aClass23Array8279 != null && aClass23Array8279[i_113_] != null)
						class23 = aClass23Array8279[i_113_];
					Class175 class175 = ((Class9) class24_sub17.method81(i_114_ & 0x3fffffff, -340986675)).method639(aBool8278, class23, -2064368129);
					if (null != class175)
						class175s[i_112_++] = class175;
				} else if ((i_114_ & ~0x7fffffff) != 0) {
					Class175 class175 = ((Class322) class24_sub19.method81(i_114_ & 0x3fffffff, 1567285254)).method5708(1769813785);
					if (class175 != null)
						class175s[i_112_++] = class175;
				}
			}
			Class175 class175 = new Class175(class175s, i_112_);
			i_109_ |= 0x4000;
			class176 = class180.method3376(class175, i_109_, -315634293 * Class475.anInt5383, 64, 768);
			for (int i_115_ = 0; i_115_ < 10; i_115_++) {
				for (int i_116_ = 0; i_116_ < Class193.aShortArrayArray2156[i_115_].length; i_116_++) {
					if (anIntArray8285[i_115_] < (Class487.aShortArrayArrayArray5470[i_115_][i_116_]).length)
						class176.method2907((Class193.aShortArrayArray2156[i_115_][i_116_]), (Class487.aShortArrayArrayArray5470[i_115_][i_116_][anIntArray8285[i_115_]]));
				}
			}
			for (int i_117_ = 0; i_117_ < 10; i_117_++) {
				for (int i_118_ = 0; i_118_ < Class552.aShortArrayArray7313[i_117_].length; i_118_++) {
					if (anIntArray8282[i_117_] < (Class78.aShortArrayArrayArray802[i_117_][i_118_]).length)
						class176.method2909((Class552.aShortArrayArray7313[i_117_][i_118_]), (Class78.aShortArrayArrayArray802[i_117_][i_118_][anIntArray8282[i_117_]]));
				}
			}
			class176.method2941(i_108_);
			synchronized (aClass205_8289) {
				aClass205_8289.method3790(class176, aLong8284 * 1703005809715999049L);
			}
		}
		if (null == class695)
			return class176;
		Class176 class176_119_ = class176.method2862((byte) 4, i_108_, true);
		class695.method14175(class176_119_, 0, (byte) 0);
		return class176_119_;
	}

	void method10499() {
		long[] ls = RSByteBuffer.aLongArray10688;
		aLong8284 = -5419621410820018425L;
		aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) (anInt8283 * 148245047 >> 8)) & 0xffL)]) * 5419621410820018425L;
		aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (148245047 * anInt8283)) & 0xffL)]) * 5419621410820018425L;
		for (int i = 0; i < anIntArray8286.length; i++) {
			aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) (anIntArray8286[i] >> 24)) & 0xffL)]));
			aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (anIntArray8286[i] >> 16)) & 0xffL)]) * 5419621410820018425L;
			aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (anIntArray8286[i] >> 8)) & 0xffL)]));
			aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) anIntArray8286[i]) & 0xffL)]) * 5419621410820018425L;
		}
		if (null != aClass23Array8279) {
			for (int i = 0; i < aClass23Array8279.length; i++) {
				if (aClass23Array8279[i] != null) {
					int[] is;
					int[] is_120_;
					if (aBool8278) {
						is = aClass23Array8279[i].anIntArray217;
						is_120_ = aClass23Array8279[i].anIntArray226;
					} else {
						is = aClass23Array8279[i].anIntArray222;
						is_120_ = aClass23Array8279[i].anIntArray224;
					}
					if (is != null) {
						for (int i_121_ = 0; i_121_ < is.length; i_121_++) {
							aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) (is[i_121_] >> 8)) & 0xffL)]));
							aLong8284 = ((aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) is[i_121_]) & 0xffL)]) * 5419621410820018425L);
						}
					}
					if (null != is_120_) {
						for (int i_122_ = 0; i_122_ < is_120_.length; i_122_++) {
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) (is_120_[i_122_] >> 8)) & 0xffL)]));
							aLong8284 = ((aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) is_120_[i_122_]) & 0xffL)]) * 5419621410820018425L);
						}
					}
					if (null != aClass23Array8279[i].aShortArray218) {
						for (int i_123_ = 0; (i_123_ < aClass23Array8279[i].aShortArray218.length); i_123_++) {
							aLong8284 = ((1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) ((aClass23Array8279[i].aShortArray218[i_123_]) >> 8)) & 0xffL)]) * 5419621410820018425L);
							aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) (aClass23Array8279[i].aShortArray218[i_123_])) & 0xffL)]));
						}
					}
					if (null != aClass23Array8279[i].aShortArray227) {
						for (int i_124_ = 0; (i_124_ < aClass23Array8279[i].aShortArray227.length); i_124_++) {
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) ((aClass23Array8279[i].aShortArray227[i_124_]) >> 8)) & 0xffL)]));
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) (aClass23Array8279[i].aShortArray227[i_124_])) & 0xffL)]));
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) anIntArray8285[i]) & 0xffL)]) * 5419621410820018425L;
		for (int i = 0; i < 10; i++)
			aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) anIntArray8282[i]) & 0xffL)]) * 5419621410820018425L;
		aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (aBool8278 ? 1 : 0)) & 0xffL)]) * 5419621410820018425L;
	}

	void method10500() {
		long[] ls = RSByteBuffer.aLongArray10688;
		aLong8284 = -5419621410820018425L;
		aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) (anInt8283 * 148245047 >> 8)) & 0xffL)]) * 5419621410820018425L;
		aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (148245047 * anInt8283)) & 0xffL)]) * 5419621410820018425L;
		for (int i = 0; i < anIntArray8286.length; i++) {
			aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) (anIntArray8286[i] >> 24)) & 0xffL)]));
			aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (anIntArray8286[i] >> 16)) & 0xffL)]) * 5419621410820018425L;
			aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (anIntArray8286[i] >> 8)) & 0xffL)]));
			aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((1703005809715999049L * aLong8284 ^ (long) anIntArray8286[i]) & 0xffL)]) * 5419621410820018425L;
		}
		if (null != aClass23Array8279) {
			for (int i = 0; i < aClass23Array8279.length; i++) {
				if (aClass23Array8279[i] != null) {
					int[] is;
					int[] is_125_;
					if (aBool8278) {
						is = aClass23Array8279[i].anIntArray217;
						is_125_ = aClass23Array8279[i].anIntArray226;
					} else {
						is = aClass23Array8279[i].anIntArray222;
						is_125_ = aClass23Array8279[i].anIntArray224;
					}
					if (is != null) {
						for (int i_126_ = 0; i_126_ < is.length; i_126_++) {
							aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) (is[i_126_] >> 8)) & 0xffL)]));
							aLong8284 = ((aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) is[i_126_]) & 0xffL)]) * 5419621410820018425L);
						}
					}
					if (null != is_125_) {
						for (int i_127_ = 0; i_127_ < is_125_.length; i_127_++) {
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) (is_125_[i_127_] >> 8)) & 0xffL)]));
							aLong8284 = ((aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) is_125_[i_127_]) & 0xffL)]) * 5419621410820018425L);
						}
					}
					if (null != aClass23Array8279[i].aShortArray218) {
						for (int i_128_ = 0; (i_128_ < aClass23Array8279[i].aShortArray218.length); i_128_++) {
							aLong8284 = ((1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((1703005809715999049L * aLong8284) ^ (long) ((aClass23Array8279[i].aShortArray218[i_128_]) >> 8)) & 0xffL)]) * 5419621410820018425L);
							aLong8284 = (5419621410820018425L * (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) (aClass23Array8279[i].aShortArray218[i_128_])) & 0xffL)]));
						}
					}
					if (null != aClass23Array8279[i].aShortArray227) {
						for (int i_129_ = 0; (i_129_ < aClass23Array8279[i].aShortArray227.length); i_129_++) {
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) ((aClass23Array8279[i].aShortArray227[i_129_]) >> 8)) & 0xffL)]));
							aLong8284 = (5419621410820018425L * (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) (((aLong8284 * 1703005809715999049L) ^ (long) (aClass23Array8279[i].aShortArray227[i_129_])) & 0xffL)]));
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) anIntArray8285[i]) & 0xffL)]) * 5419621410820018425L;
		for (int i = 0; i < 10; i++)
			aLong8284 = (1703005809715999049L * aLong8284 >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) anIntArray8282[i]) & 0xffL)]) * 5419621410820018425L;
		aLong8284 = (aLong8284 * 1703005809715999049L >>> 8 ^ ls[(int) ((aLong8284 * 1703005809715999049L ^ (long) (aBool8278 ? 1 : 0)) & 0xffL)]) * 5419621410820018425L;
	}

	public void method10501(int i, int i_130_, Class24_Sub17 class24_sub17) {
		if (-1 == i_130_)
			anIntArray8286[i] = 0;
		else if (class24_sub17.method81(i_130_, 1415830495) != null) {
			anIntArray8286[i] = i_130_ | 0x40000000;
			method10492(1344474375);
		}
	}

	public void method10502(int i, int i_131_, Class24_Sub19 class24_sub19) {
		int i_132_ = anIntArray8287[i];
		if (class24_sub19.method81(i_131_, -1480913043) != null) {
			anIntArray8286[i_132_] = i_131_ | ~0x7fffffff;
			method10492(1675712993);
		}
	}

	public Class176 method10503(Class180 class180, int i, Class24_Sub19 class24_sub19, Class24_Sub9 class24_sub9, Class24_Sub17 class24_sub17, Interface20 interface20, Interface18 interface18, Class695 class695) {
		if (anInt8271 * 1032231511 != -1)
			return (((Class295) class24_sub9.method81(anInt8271 * 1032231511, 1417778860)).method5301(class180, i, interface20, interface18, class695, null, -1455550949));
		int i_133_ = class695 != null ? i | class695.method14174(-822649352) : i;
		Class176 class176;
		synchronized (aClass205_8289) {
			class176 = (Class176) aClass205_8289.method3787(aLong8284 * 1703005809715999049L);
		}
		if (null == class176 || class180.method3175(class176.method2874(), i_133_) != 0) {
			if (class176 != null)
				i_133_ = class180.method3176(i_133_, class176.method2874());
			int i_134_ = i_133_;
			boolean bool = false;
			for (int i_135_ = 0; i_135_ < anIntArray8286.length; i_135_++) {
				int i_136_ = anIntArray8286[i_135_];
				Class23 class23 = null;
				if ((i_136_ & 0x40000000) != 0) {
					if (null != aClass23Array8279 && null != aClass23Array8279[i_135_])
						class23 = aClass23Array8279[i_135_];
					if (!((Class9) class24_sub17.method81(i_136_ & 0x3fffffff, 837824973)).method618(aBool8278, class23, -984884439))
						bool = true;
				} else if (0 != (i_136_ & ~0x7fffffff) && !((Class322) class24_sub19.method81(i_136_ & 0x3fffffff, -1418378608)).method5711(-1173855569))
					bool = true;
			}
			if (bool)
				return null;
			Class175[] class175s = new Class175[anIntArray8286.length];
			int i_137_ = 0;
			for (int i_138_ = 0; i_138_ < anIntArray8286.length; i_138_++) {
				int i_139_ = anIntArray8286[i_138_];
				Class23 class23 = null;
				if (0 != (i_139_ & 0x40000000)) {
					if (aClass23Array8279 != null && aClass23Array8279[i_138_] != null)
						class23 = aClass23Array8279[i_138_];
					Class175 class175 = ((Class9) class24_sub17.method81(i_139_ & 0x3fffffff, -1869151477)).method639(aBool8278, class23, -1062045711);
					if (null != class175)
						class175s[i_137_++] = class175;
				} else if ((i_139_ & ~0x7fffffff) != 0) {
					Class175 class175 = ((Class322) class24_sub19.method81(i_139_ & 0x3fffffff, 158757878)).method5708(1769813785);
					if (class175 != null)
						class175s[i_137_++] = class175;
				}
			}
			Class175 class175 = new Class175(class175s, i_137_);
			i_134_ |= 0x4000;
			class176 = class180.method3376(class175, i_134_, -315634293 * Class475.anInt5383, 64, 768);
			for (int i_140_ = 0; i_140_ < 10; i_140_++) {
				for (int i_141_ = 0; i_141_ < Class193.aShortArrayArray2156[i_140_].length; i_141_++) {
					if (anIntArray8285[i_140_] < (Class487.aShortArrayArrayArray5470[i_140_][i_141_]).length)
						class176.method2907((Class193.aShortArrayArray2156[i_140_][i_141_]), (Class487.aShortArrayArrayArray5470[i_140_][i_141_][anIntArray8285[i_140_]]));
				}
			}
			for (int i_142_ = 0; i_142_ < 10; i_142_++) {
				for (int i_143_ = 0; i_143_ < Class552.aShortArrayArray7313[i_142_].length; i_143_++) {
					if (anIntArray8282[i_142_] < (Class78.aShortArrayArrayArray802[i_142_][i_143_]).length)
						class176.method2909((Class552.aShortArrayArray7313[i_142_][i_143_]), (Class78.aShortArrayArrayArray802[i_142_][i_143_][anIntArray8282[i_142_]]));
				}
			}
			class176.method2941(i_133_);
			synchronized (aClass205_8289) {
				aClass205_8289.method3790(class176, aLong8284 * 1703005809715999049L);
			}
		}
		if (null == class695)
			return class176;
		Class176 class176_144_ = class176.method2862((byte) 4, i_133_, true);
		class695.method14175(class176_144_, 0, (byte) 0);
		return class176_144_;
	}

	public static void method10504(int i) {
		synchronized (aClass205_8288) {
			aClass205_8288.method3792(i, (byte) 11);
		}
		synchronized (aClass205_8289) {
			aClass205_8289.method3792(i, (byte) -41);
		}
	}

	public Class176 method10505(Class180 class180, int i, Class24_Sub2 class24_sub2, Class24_Sub19 class24_sub19, Class24_Sub9 class24_sub9, Class24_Sub17 class24_sub17, Interface20 interface20, Interface18 interface18, Class695 class695, Class695 class695_145_, Class695[] class695s, int[] is, int i_146_, boolean bool, Class616 class616, int i_147_) {
		if (-1 != 1032231511 * anInt8271)
			return (((Class295) class24_sub9.method81(anInt8271 * 1032231511, -1609381257)).method5302(class180, i, class24_sub2, interface20, interface18, class695, class695_145_, class695s, is, i_146_, null, 735074213));
		int i_148_ = i;
		long l = 1703005809715999049L * aLong8284;
		int[] is_149_ = anIntArray8286;
		boolean bool_150_ = false;
		boolean bool_151_ = false;
		if (null != class695) {
			Class198 class198 = class695.method14163(1498936000);
			if (null != class198 && (-552058037 * class198.anInt2181 >= 0 || class198.anInt2182 * -1682597575 >= 0)) {
				is_149_ = new int[anIntArray8286.length];
				for (int i_152_ = 0; i_152_ < is_149_.length; i_152_++)
					is_149_[i_152_] = anIntArray8286[i_152_];
				if (-552058037 * class198.anInt2181 >= 0 && -1 != -166140631 * class616.anInt8088) {
					bool_150_ = true;
					if (65535 == class198.anInt2181 * -552058037) {
						is_149_[-166140631 * class616.anInt8088] = 0;
						for (int i_153_ = 0; i_153_ < class616.anIntArray8089.length; i_153_++)
							is_149_[class616.anIntArray8089[i_153_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_149_[class616.anInt8088 * -166140631] = -552058037 * class198.anInt2181 | 0x40000000;
						for (int i_154_ = 0; i_154_ < class616.anIntArray8089.length; i_154_++)
							is_149_[class616.anIntArray8089[i_154_]] = 0;
						l ^= ((long) is_149_[-166140631 * class616.anInt8088] << 32);
					}
				}
				if (class198.anInt2182 * -1682597575 >= 0 && -1 != -246087045 * class616.anInt8085) {
					bool_151_ = true;
					if (class198.anInt2182 * -1682597575 == 65535) {
						is_149_[class616.anInt8085 * -246087045] = 0;
						for (int i_155_ = 0; i_155_ < class616.anIntArray8090.length; i_155_++)
							is_149_[class616.anIntArray8090[i_155_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_149_[-246087045 * class616.anInt8085] = -1682597575 * class198.anInt2182 | 0x40000000;
						for (int i_156_ = 0; i_156_ < class616.anIntArray8090.length; i_156_++)
							is_149_[class616.anIntArray8090[i_156_]] = 0;
						l ^= (long) is_149_[-246087045 * class616.anInt8085];
					}
				}
			}
		}
		boolean bool_157_ = false;
		int i_158_ = class695s != null ? class695s.length : 0;
		for (int i_159_ = 0; i_159_ < i_158_; i_159_++) {
			if (class695s[i_159_] != null) {
				i_148_ |= class695s[i_159_].method14174(-822649352);
				bool_157_ = true;
			}
		}
		if (null != class695) {
			i_148_ |= class695.method14174(-822649352);
			bool_157_ = true;
		}
		if (class695_145_ != null) {
			i_148_ |= class695_145_.method14174(-822649352);
			bool_157_ = true;
		}
		boolean bool_160_ = false;
		if (is != null) {
			for (int i_161_ = 0; i_161_ < is.length; i_161_++) {
				if (-1 != is[i_161_]) {
					i_148_ |= 0x20;
					bool_160_ = true;
				}
			}
		}
		Class176 class176;
		synchronized (aClass205_8288) {
			class176 = (Class176) aClass205_8288.method3787(l);
		}
		Class587 class587 = null;
		if (-1 != 148245047 * anInt8283)
			class587 = (Class587) class24_sub2.method81(anInt8283 * 148245047, -1231771054);
		if (null == class176 || class180.method3175(class176.method2874(), i_148_) != 0) {
			if (null != class176)
				i_148_ = class180.method3176(i_148_, class176.method2874());
			int i_162_ = i_148_;
			boolean bool_163_ = false;
			for (int i_164_ = 0; i_164_ < is_149_.length; i_164_++) {
				int i_165_ = is_149_[i_164_];
				Class23 class23 = null;
				boolean bool_166_ = false;
				if (bool_150_) {
					if (i_164_ == class616.anInt8088 * -166140631)
						bool_166_ = true;
					else {
						for (int i_167_ = 0; i_167_ < class616.anIntArray8089.length; i_167_++) {
							if (i_164_ == class616.anIntArray8089[i_167_]) {
								bool_166_ = true;
								break;
							}
						}
					}
				}
				if (bool_151_) {
					if (i_164_ == class616.anInt8085 * -246087045)
						bool_166_ = true;
					else {
						for (int i_168_ = 0; i_168_ < class616.anIntArray8090.length; i_168_++) {
							if (i_164_ == class616.anIntArray8090[i_168_]) {
								bool_166_ = true;
								break;
							}
						}
					}
				}
				if (0 != (i_165_ & 0x40000000)) {
					if (!bool_166_ && aClass23Array8279 != null && null != aClass23Array8279[i_164_])
						class23 = aClass23Array8279[i_164_];
					if (!((Class9) class24_sub17.method81(i_165_ & 0x3fffffff, 262279804)).method614(aBool8278, class23, 1928405678))
						bool_163_ = true;
				} else if ((i_165_ & ~0x7fffffff) != 0 && !((Class322) class24_sub19.method81(i_165_ & 0x3fffffff, -773468121)).method5705((byte) 6))
					bool_163_ = true;
			}
			if (bool_163_) {
				if (-1L != -575281462585291815L * aLong8280) {
					synchronized (aClass205_8288) {
						class176 = (Class176) (aClass205_8288.method3787(aLong8280 * -575281462585291815L));
					}
				}
				if (class176 == null || class180.method3175(class176.method2874(), i_148_) != 0)
					return null;
			} else {
				Class175[] class175s = new Class175[is_149_.length];
				for (int i_169_ = 0; i_169_ < is_149_.length; i_169_++) {
					int i_170_ = is_149_[i_169_];
					Class23 class23 = null;
					boolean bool_171_ = i_169_ == 5 && bool_150_ || 3 == i_169_ && bool_151_;
					if ((i_170_ & 0x40000000) != 0) {
						if (!bool_171_ && null != aClass23Array8279 && aClass23Array8279[i_169_] != null)
							class23 = aClass23Array8279[i_169_];
						Class175 class175 = ((Class9) class24_sub17.method81(i_170_ & 0x3fffffff, -1070480078)).method617(aBool8278, class23, -1248025688);
						if (class175 != null)
							class175s[i_169_] = class175;
					} else if ((i_170_ & ~0x7fffffff) != 0) {
						Class175 class175 = ((Class322) class24_sub19.method81(i_170_ & 0x3fffffff, 406694360)).method5706(688224683);
						if (class175 != null)
							class175s[i_169_] = class175;
					}
				}
				if (class587 != null && null != class587.anIntArrayArray7744) {
					for (int i_172_ = 0; i_172_ < class587.anIntArrayArray7744.length; i_172_++) {
						if (null != class175s[i_172_]) {
							int i_173_ = 0;
							int i_174_ = 0;
							int i_175_ = 0;
							int i_176_ = 0;
							int i_177_ = 0;
							int i_178_ = 0;
							if (class587.anIntArrayArray7744[i_172_] != null) {
								i_173_ = class587.anIntArrayArray7744[i_172_][0];
								i_174_ = class587.anIntArrayArray7744[i_172_][1];
								i_175_ = class587.anIntArrayArray7744[i_172_][2];
								i_176_ = (class587.anIntArrayArray7744[i_172_][3] << 3);
								i_177_ = (class587.anIntArrayArray7744[i_172_][4] << 3);
								i_178_ = (class587.anIntArrayArray7744[i_172_][5] << 3);
							}
							if (0 != i_176_ || 0 != i_177_ || 0 != i_178_)
								class175s[i_172_].method2840(i_176_, i_177_, i_178_);
							if (i_173_ != 0 || i_174_ != 0 || i_175_ != 0)
								class175s[i_172_].method2812(i_173_, i_174_, i_175_);
						}
					}
				}
				Class175 class175 = new Class175(class175s, class175s.length);
				i_162_ |= 0x4000;
				class176 = class180.method3376(class175, i_162_, -315634293 * Class475.anInt5383, 64, 850);
				for (int i_179_ = 0; i_179_ < 10; i_179_++) {
					for (int i_180_ = 0; i_180_ < Class193.aShortArrayArray2156[i_179_].length; i_180_++) {
						if (anIntArray8285[i_179_] < (Class487.aShortArrayArrayArray5470[i_179_][i_180_]).length)
							class176.method2907((Class193.aShortArrayArray2156[i_179_][i_180_]), (Class487.aShortArrayArrayArray5470[i_179_][i_180_][anIntArray8285[i_179_]]));
					}
				}
				for (int i_181_ = 0; i_181_ < 10; i_181_++) {
					for (int i_182_ = 0; i_182_ < Class552.aShortArrayArray7313[i_181_].length; i_182_++) {
						if (anIntArray8282[i_181_] < (Class78.aShortArrayArrayArray802[i_181_][i_182_]).length)
							class176.method2909((Class552.aShortArrayArray7313[i_181_][i_182_]), (Class78.aShortArrayArrayArray802[i_181_][i_182_][anIntArray8282[i_181_]]));
					}
				}
				class176.method2901();
				if (bool) {
					class176.method2941(i_148_);
					synchronized (aClass205_8288) {
						aClass205_8288.method3790(class176, l);
					}
					aLong8280 = l * 4702159447199138921L;
				}
			}
		}
		Class176 class176_183_ = class176.method2862((byte) 4, i_148_, true);
		if (!bool_157_ && !bool_160_)
			return class176_183_;
		Class432[] class432s = null;
		if (null != class587)
			class432s = class587.method9788((byte) -26);
		if (bool_160_ && null != class432s) {
			for (int i_184_ = 0; i_184_ < is.length; i_184_++) {
				if (null != class432s[i_184_])
					class176_183_.method2888(class432s[i_184_], 1 << i_184_, true);
			}
		}
		int i_185_ = 0;
		int i_186_ = 1;
		while (i_185_ < i_158_) {
			if (null != class695s[i_185_])
				class695s[i_185_].method14176(class176_183_, 0, i_186_, -55108623);
			i_185_++;
			i_186_ <<= 1;
		}
		if (bool_160_) {
			for (i_185_ = 0; i_185_ < is.length; i_185_++) {
				if (is[i_185_] != -1) {
					i_186_ = is[i_185_] - i_146_;
					i_186_ &= 0x3fff;
					Class432 class432 = new Class432();
					class432.method6890(0.0F, 1.0F, 0.0F, Class428.method6863(i_186_));
					class176_183_.method2888(class432, 1 << i_185_, false);
				}
			}
		}
		if (bool_160_ && null != class432s) {
			for (i_185_ = 0; i_185_ < is.length; i_185_++) {
				if (class432s[i_185_] != null)
					class176_183_.method2888(class432s[i_185_], 1 << i_185_, false);
			}
		}
		if (null != class695 && class695_145_ != null)
			Class476.method7773(class176_183_, class695, class695_145_, -1237622773);
		else if (class695 != null)
			class695.method14175(class176_183_, 0, (byte) 0);
		else if (class695_145_ != null)
			class695_145_.method14175(class176_183_, 0, (byte) 0);
		return class176_183_;
	}

	public Class176 method10506(Class180 class180, int i, Class24_Sub19 class24_sub19, Class24_Sub10 class24_sub10, Class695 class695, int i_187_, int i_188_, int i_189_) {
		int i_190_ = null != class695 ? i | class695.method14174(-822649352) : i;
		long l = (long) i_189_ << 32 | (long) (i_188_ << 16) | (long) i_187_;
		Class176 class176;
		synchronized (aClass205_8289) {
			class176 = (Class176) aClass205_8289.method3787(l);
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_190_) != 0) {
			if (null != class176)
				i_190_ = class180.method3176(i_190_, class176.method2874());
			int i_191_ = i_190_;
			Class175[] class175s = new Class175[3];
			int i_192_ = 0;
			if (((Class322) class24_sub19.method81(i_187_, 1553420172)).method5711(-1173855569) && ((Class322) class24_sub19.method81(i_188_, 659551813)).method5711(-1173855569) && ((Class322) class24_sub19.method81(i_189_, 1209085984)).method5711(-1173855569)) {
				Class175 class175 = ((Class322) class24_sub19.method81(i_187_, 1168257384)).method5708(1769813785);
				if (class175 != null)
					class175s[i_192_++] = class175;
				class175 = ((Class322) class24_sub19.method81(i_188_, -97403349)).method5708(1769813785);
				if (null != class175)
					class175s[i_192_++] = class175;
				class175 = ((Class322) class24_sub19.method81(i_189_, -173754379)).method5708(1769813785);
				if (null != class175)
					class175s[i_192_++] = class175;
				class175 = new Class175(class175s, i_192_);
				i_191_ |= 0x4000;
				class176 = class180.method3376(class175, i_191_, Class475.anInt5383 * -315634293, 64, 768);
				for (int i_193_ = 0; i_193_ < 10; i_193_++) {
					for (int i_194_ = 0; i_194_ < Class193.aShortArrayArray2156[i_193_].length; i_194_++) {
						if (anIntArray8285[i_193_] < (Class487.aShortArrayArrayArray5470[i_193_][i_194_]).length)
							class176.method2907((Class193.aShortArrayArray2156[i_193_][i_194_]), (Class487.aShortArrayArrayArray5470[i_193_][i_194_][anIntArray8285[i_193_]]));
					}
				}
				for (int i_195_ = 0; i_195_ < 10; i_195_++) {
					for (int i_196_ = 0; i_196_ < Class552.aShortArrayArray7313[i_195_].length; i_196_++) {
						if (anIntArray8282[i_195_] < (Class78.aShortArrayArrayArray802[i_195_][i_196_]).length)
							class176.method2909((Class552.aShortArrayArray7313[i_195_][i_196_]), (Class78.aShortArrayArrayArray802[i_195_][i_196_][anIntArray8282[i_195_]]));
					}
				}
				class176.method2941(i_190_);
				synchronized (aClass205_8289) {
					aClass205_8289.method3790(class176, l);
				}
			} else
				return null;
		}
		if (class695 == null)
			return class176;
		class176 = class176.method2862((byte) 4, i_190_, true);
		class695.method14175(class176, 0, (byte) 0);
		return class176;
	}

	public Class176 method10507(Class180 class180, int i, Class24_Sub19 class24_sub19, Class24_Sub10 class24_sub10, Class695 class695, int i_197_, int i_198_, int i_199_) {
		int i_200_ = null != class695 ? i | class695.method14174(-822649352) : i;
		long l = (long) i_199_ << 32 | (long) (i_198_ << 16) | (long) i_197_;
		Class176 class176;
		synchronized (aClass205_8289) {
			class176 = (Class176) aClass205_8289.method3787(l);
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_200_) != 0) {
			if (null != class176)
				i_200_ = class180.method3176(i_200_, class176.method2874());
			int i_201_ = i_200_;
			Class175[] class175s = new Class175[3];
			int i_202_ = 0;
			if (((Class322) class24_sub19.method81(i_197_, -2112497747)).method5711(-1173855569) && ((Class322) class24_sub19.method81(i_198_, -1885524949)).method5711(-1173855569) && ((Class322) class24_sub19.method81(i_199_, 447089440)).method5711(-1173855569)) {
				Class175 class175 = ((Class322) class24_sub19.method81(i_197_, 787994027)).method5708(1769813785);
				if (class175 != null)
					class175s[i_202_++] = class175;
				class175 = ((Class322) class24_sub19.method81(i_198_, -1827536570)).method5708(1769813785);
				if (null != class175)
					class175s[i_202_++] = class175;
				class175 = ((Class322) class24_sub19.method81(i_199_, 692359917)).method5708(1769813785);
				if (null != class175)
					class175s[i_202_++] = class175;
				class175 = new Class175(class175s, i_202_);
				i_201_ |= 0x4000;
				class176 = class180.method3376(class175, i_201_, Class475.anInt5383 * -315634293, 64, 768);
				for (int i_203_ = 0; i_203_ < 10; i_203_++) {
					for (int i_204_ = 0; i_204_ < Class193.aShortArrayArray2156[i_203_].length; i_204_++) {
						if (anIntArray8285[i_203_] < (Class487.aShortArrayArrayArray5470[i_203_][i_204_]).length)
							class176.method2907((Class193.aShortArrayArray2156[i_203_][i_204_]), (Class487.aShortArrayArrayArray5470[i_203_][i_204_][anIntArray8285[i_203_]]));
					}
				}
				for (int i_205_ = 0; i_205_ < 10; i_205_++) {
					for (int i_206_ = 0; i_206_ < Class552.aShortArrayArray7313[i_205_].length; i_206_++) {
						if (anIntArray8282[i_205_] < (Class78.aShortArrayArrayArray802[i_205_][i_206_]).length)
							class176.method2909((Class552.aShortArrayArray7313[i_205_][i_206_]), (Class78.aShortArrayArrayArray802[i_205_][i_206_][anIntArray8282[i_205_]]));
					}
				}
				class176.method2941(i_200_);
				synchronized (aClass205_8289) {
					aClass205_8289.method3790(class176, l);
				}
			} else
				return null;
		}
		if (class695 == null)
			return class176;
		class176 = class176.method2862((byte) 4, i_200_, true);
		class695.method14175(class176, 0, (byte) 0);
		return class176;
	}

	public static int method10508() {
		synchronized (aClass205_8288) {
			int i = aClass205_8288.method3795(-943357642);
			return i;
		}
	}

	public Class176 method10509(Class180 class180, int i, Class24_Sub19 class24_sub19, Class24_Sub9 class24_sub9, Class24_Sub17 class24_sub17, Interface20 interface20, Interface18 interface18, Class695 class695) {
		if (anInt8271 * 1032231511 != -1)
			return (((Class295) class24_sub9.method81(anInt8271 * 1032231511, -1562404653)).method5301(class180, i, interface20, interface18, class695, null, -1633709138));
		int i_207_ = class695 != null ? i | class695.method14174(-822649352) : i;
		Class176 class176;
		synchronized (aClass205_8289) {
			class176 = (Class176) aClass205_8289.method3787(aLong8284 * 1703005809715999049L);
		}
		if (null == class176 || class180.method3175(class176.method2874(), i_207_) != 0) {
			if (class176 != null)
				i_207_ = class180.method3176(i_207_, class176.method2874());
			int i_208_ = i_207_;
			boolean bool = false;
			for (int i_209_ = 0; i_209_ < anIntArray8286.length; i_209_++) {
				int i_210_ = anIntArray8286[i_209_];
				Class23 class23 = null;
				if ((i_210_ & 0x40000000) != 0) {
					if (null != aClass23Array8279 && null != aClass23Array8279[i_209_])
						class23 = aClass23Array8279[i_209_];
					if (!((Class9) class24_sub17.method81(i_210_ & 0x3fffffff, 1161924058)).method618(aBool8278, class23, -1846193649))
						bool = true;
				} else if (0 != (i_210_ & ~0x7fffffff) && !((Class322) class24_sub19.method81(i_210_ & 0x3fffffff, -306613869)).method5711(-1173855569))
					bool = true;
			}
			if (bool)
				return null;
			Class175[] class175s = new Class175[anIntArray8286.length];
			int i_211_ = 0;
			for (int i_212_ = 0; i_212_ < anIntArray8286.length; i_212_++) {
				int i_213_ = anIntArray8286[i_212_];
				Class23 class23 = null;
				if (0 != (i_213_ & 0x40000000)) {
					if (aClass23Array8279 != null && aClass23Array8279[i_212_] != null)
						class23 = aClass23Array8279[i_212_];
					Class175 class175 = ((Class9) class24_sub17.method81(i_213_ & 0x3fffffff, -1044418589)).method639(aBool8278, class23, -1026611187);
					if (null != class175)
						class175s[i_211_++] = class175;
				} else if ((i_213_ & ~0x7fffffff) != 0) {
					Class175 class175 = ((Class322) class24_sub19.method81(i_213_ & 0x3fffffff, 69259203)).method5708(1769813785);
					if (class175 != null)
						class175s[i_211_++] = class175;
				}
			}
			Class175 class175 = new Class175(class175s, i_211_);
			i_208_ |= 0x4000;
			class176 = class180.method3376(class175, i_208_, -315634293 * Class475.anInt5383, 64, 768);
			for (int i_214_ = 0; i_214_ < 10; i_214_++) {
				for (int i_215_ = 0; i_215_ < Class193.aShortArrayArray2156[i_214_].length; i_215_++) {
					if (anIntArray8285[i_214_] < (Class487.aShortArrayArrayArray5470[i_214_][i_215_]).length)
						class176.method2907((Class193.aShortArrayArray2156[i_214_][i_215_]), (Class487.aShortArrayArrayArray5470[i_214_][i_215_][anIntArray8285[i_214_]]));
				}
			}
			for (int i_216_ = 0; i_216_ < 10; i_216_++) {
				for (int i_217_ = 0; i_217_ < Class552.aShortArrayArray7313[i_216_].length; i_217_++) {
					if (anIntArray8282[i_216_] < (Class78.aShortArrayArrayArray802[i_216_][i_217_]).length)
						class176.method2909((Class552.aShortArrayArray7313[i_216_][i_217_]), (Class78.aShortArrayArrayArray802[i_216_][i_217_][anIntArray8282[i_216_]]));
				}
			}
			class176.method2941(i_207_);
			synchronized (aClass205_8289) {
				aClass205_8289.method3790(class176, aLong8284 * 1703005809715999049L);
			}
		}
		if (null == class695)
			return class176;
		Class176 class176_218_ = class176.method2862((byte) 4, i_207_, true);
		class695.method14175(class176_218_, 0, (byte) 0);
		return class176_218_;
	}

	public static void method10510(int i) {
		Class475.anInt5383 = i * 1722642979;
		synchronized (aClass205_8289) {
			aClass205_8289.method3793((byte) 48);
		}
		synchronized (aClass205_8288) {
			aClass205_8288.method3793((byte) 74);
		}
	}

	public static void method10511(int i) {
		Class475.anInt5383 = i * 1722642979;
		synchronized (aClass205_8289) {
			aClass205_8289.method3793((byte) 119);
		}
		synchronized (aClass205_8288) {
			aClass205_8288.method3793((byte) 87);
		}
	}

	public static void method10512() {
		synchronized (aClass205_8288) {
			aClass205_8288.method3793((byte) 34);
		}
		synchronized (aClass205_8289) {
			aClass205_8289.method3793((byte) 100);
		}
	}

	public static void method10513() {
		synchronized (aClass205_8288) {
			aClass205_8288.method3793((byte) 74);
		}
		synchronized (aClass205_8289) {
			aClass205_8289.method3793((byte) 75);
		}
	}

	public Class176 method10514(Class180 class180, int i, Class24_Sub2 class24_sub2, Class24_Sub19 class24_sub19, Class24_Sub9 class24_sub9, Class24_Sub17 class24_sub17, Interface20 interface20, Interface18 interface18, Class695 class695, Class695 class695_219_, Class695[] class695s, int[] is, int i_220_, boolean bool, Class616 class616) {
		if (-1 != 1032231511 * anInt8271)
			return (((Class295) class24_sub9.method81(anInt8271 * 1032231511, -826964461)).method5302(class180, i, class24_sub2, interface20, interface18, class695, class695_219_, class695s, is, i_220_, null, -693628030));
		int i_221_ = i;
		long l = 1703005809715999049L * aLong8284;
		int[] is_222_ = anIntArray8286;
		boolean bool_223_ = false;
		boolean bool_224_ = false;
		if (null != class695) {
			Class198 class198 = class695.method14163(1841351178);
			if (null != class198 && (-552058037 * class198.anInt2181 >= 0 || class198.anInt2182 * -1682597575 >= 0)) {
				is_222_ = new int[anIntArray8286.length];
				for (int i_225_ = 0; i_225_ < is_222_.length; i_225_++)
					is_222_[i_225_] = anIntArray8286[i_225_];
				if (-552058037 * class198.anInt2181 >= 0 && -1 != -166140631 * class616.anInt8088) {
					bool_223_ = true;
					if (65535 == class198.anInt2181 * -552058037) {
						is_222_[-166140631 * class616.anInt8088] = 0;
						for (int i_226_ = 0; i_226_ < class616.anIntArray8089.length; i_226_++)
							is_222_[class616.anIntArray8089[i_226_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_222_[class616.anInt8088 * -166140631] = -552058037 * class198.anInt2181 | 0x40000000;
						for (int i_227_ = 0; i_227_ < class616.anIntArray8089.length; i_227_++)
							is_222_[class616.anIntArray8089[i_227_]] = 0;
						l ^= ((long) is_222_[-166140631 * class616.anInt8088] << 32);
					}
				}
				if (class198.anInt2182 * -1682597575 >= 0 && -1 != -246087045 * class616.anInt8085) {
					bool_224_ = true;
					if (class198.anInt2182 * -1682597575 == 65535) {
						is_222_[class616.anInt8085 * -246087045] = 0;
						for (int i_228_ = 0; i_228_ < class616.anIntArray8090.length; i_228_++)
							is_222_[class616.anIntArray8090[i_228_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_222_[-246087045 * class616.anInt8085] = -1682597575 * class198.anInt2182 | 0x40000000;
						for (int i_229_ = 0; i_229_ < class616.anIntArray8090.length; i_229_++)
							is_222_[class616.anIntArray8090[i_229_]] = 0;
						l ^= (long) is_222_[-246087045 * class616.anInt8085];
					}
				}
			}
		}
		boolean bool_230_ = false;
		int i_231_ = class695s != null ? class695s.length : 0;
		for (int i_232_ = 0; i_232_ < i_231_; i_232_++) {
			if (class695s[i_232_] != null) {
				i_221_ |= class695s[i_232_].method14174(-822649352);
				bool_230_ = true;
			}
		}
		if (null != class695) {
			i_221_ |= class695.method14174(-822649352);
			bool_230_ = true;
		}
		if (class695_219_ != null) {
			i_221_ |= class695_219_.method14174(-822649352);
			bool_230_ = true;
		}
		boolean bool_233_ = false;
		if (is != null) {
			for (int i_234_ = 0; i_234_ < is.length; i_234_++) {
				if (-1 != is[i_234_]) {
					i_221_ |= 0x20;
					bool_233_ = true;
				}
			}
		}
		Class176 class176;
		synchronized (aClass205_8288) {
			class176 = (Class176) aClass205_8288.method3787(l);
		}
		Class587 class587 = null;
		if (-1 != 148245047 * anInt8283)
			class587 = (Class587) class24_sub2.method81(anInt8283 * 148245047, 1277274320);
		if (null == class176 || class180.method3175(class176.method2874(), i_221_) != 0) {
			if (null != class176)
				i_221_ = class180.method3176(i_221_, class176.method2874());
			int i_235_ = i_221_;
			boolean bool_236_ = false;
			for (int i_237_ = 0; i_237_ < is_222_.length; i_237_++) {
				int i_238_ = is_222_[i_237_];
				Class23 class23 = null;
				boolean bool_239_ = false;
				if (bool_223_) {
					if (i_237_ == class616.anInt8088 * -166140631)
						bool_239_ = true;
					else {
						for (int i_240_ = 0; i_240_ < class616.anIntArray8089.length; i_240_++) {
							if (i_237_ == class616.anIntArray8089[i_240_]) {
								bool_239_ = true;
								break;
							}
						}
					}
				}
				if (bool_224_) {
					if (i_237_ == class616.anInt8085 * -246087045)
						bool_239_ = true;
					else {
						for (int i_241_ = 0; i_241_ < class616.anIntArray8090.length; i_241_++) {
							if (i_237_ == class616.anIntArray8090[i_241_]) {
								bool_239_ = true;
								break;
							}
						}
					}
				}
				if (0 != (i_238_ & 0x40000000)) {
					if (!bool_239_ && aClass23Array8279 != null && null != aClass23Array8279[i_237_])
						class23 = aClass23Array8279[i_237_];
					if (!((Class9) class24_sub17.method81(i_238_ & 0x3fffffff, -125961449)).method614(aBool8278, class23, 1394882196))
						bool_236_ = true;
				} else if ((i_238_ & ~0x7fffffff) != 0 && !((Class322) class24_sub19.method81(i_238_ & 0x3fffffff, -2041863171)).method5705((byte) 6))
					bool_236_ = true;
			}
			if (bool_236_) {
				if (-1L != -575281462585291815L * aLong8280) {
					synchronized (aClass205_8288) {
						class176 = (Class176) (aClass205_8288.method3787(aLong8280 * -575281462585291815L));
					}
				}
				if (class176 == null || class180.method3175(class176.method2874(), i_221_) != 0)
					return null;
			} else {
				Class175[] class175s = new Class175[is_222_.length];
				for (int i_242_ = 0; i_242_ < is_222_.length; i_242_++) {
					int i_243_ = is_222_[i_242_];
					Class23 class23 = null;
					boolean bool_244_ = i_242_ == 5 && bool_223_ || 3 == i_242_ && bool_224_;
					if ((i_243_ & 0x40000000) != 0) {
						if (!bool_244_ && null != aClass23Array8279 && aClass23Array8279[i_242_] != null)
							class23 = aClass23Array8279[i_242_];
						Class175 class175 = ((Class9) class24_sub17.method81(i_243_ & 0x3fffffff, -1803460007)).method617(aBool8278, class23, -942592400);
						if (class175 != null)
							class175s[i_242_] = class175;
					} else if ((i_243_ & ~0x7fffffff) != 0) {
						Class175 class175 = ((Class322) class24_sub19.method81(i_243_ & 0x3fffffff, -1636274307)).method5706(365514763);
						if (class175 != null)
							class175s[i_242_] = class175;
					}
				}
				if (class587 != null && null != class587.anIntArrayArray7744) {
					for (int i_245_ = 0; i_245_ < class587.anIntArrayArray7744.length; i_245_++) {
						if (null != class175s[i_245_]) {
							int i_246_ = 0;
							int i_247_ = 0;
							int i_248_ = 0;
							int i_249_ = 0;
							int i_250_ = 0;
							int i_251_ = 0;
							if (class587.anIntArrayArray7744[i_245_] != null) {
								i_246_ = class587.anIntArrayArray7744[i_245_][0];
								i_247_ = class587.anIntArrayArray7744[i_245_][1];
								i_248_ = class587.anIntArrayArray7744[i_245_][2];
								i_249_ = (class587.anIntArrayArray7744[i_245_][3] << 3);
								i_250_ = (class587.anIntArrayArray7744[i_245_][4] << 3);
								i_251_ = (class587.anIntArrayArray7744[i_245_][5] << 3);
							}
							if (0 != i_249_ || 0 != i_250_ || 0 != i_251_)
								class175s[i_245_].method2840(i_249_, i_250_, i_251_);
							if (i_246_ != 0 || i_247_ != 0 || i_248_ != 0)
								class175s[i_245_].method2812(i_246_, i_247_, i_248_);
						}
					}
				}
				Class175 class175 = new Class175(class175s, class175s.length);
				i_235_ |= 0x4000;
				class176 = class180.method3376(class175, i_235_, -315634293 * Class475.anInt5383, 64, 850);
				for (int i_252_ = 0; i_252_ < 10; i_252_++) {
					for (int i_253_ = 0; i_253_ < Class193.aShortArrayArray2156[i_252_].length; i_253_++) {
						if (anIntArray8285[i_252_] < (Class487.aShortArrayArrayArray5470[i_252_][i_253_]).length)
							class176.method2907((Class193.aShortArrayArray2156[i_252_][i_253_]), (Class487.aShortArrayArrayArray5470[i_252_][i_253_][anIntArray8285[i_252_]]));
					}
				}
				for (int i_254_ = 0; i_254_ < 10; i_254_++) {
					for (int i_255_ = 0; i_255_ < Class552.aShortArrayArray7313[i_254_].length; i_255_++) {
						if (anIntArray8282[i_254_] < (Class78.aShortArrayArrayArray802[i_254_][i_255_]).length)
							class176.method2909((Class552.aShortArrayArray7313[i_254_][i_255_]), (Class78.aShortArrayArrayArray802[i_254_][i_255_][anIntArray8282[i_254_]]));
					}
				}
				class176.method2901();
				if (bool) {
					class176.method2941(i_221_);
					synchronized (aClass205_8288) {
						aClass205_8288.method3790(class176, l);
					}
					aLong8280 = l * 4702159447199138921L;
				}
			}
		}
		Class176 class176_256_ = class176.method2862((byte) 4, i_221_, true);
		if (!bool_230_ && !bool_233_)
			return class176_256_;
		Class432[] class432s = null;
		if (null != class587)
			class432s = class587.method9788((byte) -8);
		if (bool_233_ && null != class432s) {
			for (int i_257_ = 0; i_257_ < is.length; i_257_++) {
				if (null != class432s[i_257_])
					class176_256_.method2888(class432s[i_257_], 1 << i_257_, true);
			}
		}
		int i_258_ = 0;
		int i_259_ = 1;
		while (i_258_ < i_231_) {
			if (null != class695s[i_258_])
				class695s[i_258_].method14176(class176_256_, 0, i_259_, -982568413);
			i_258_++;
			i_259_ <<= 1;
		}
		if (bool_233_) {
			for (i_258_ = 0; i_258_ < is.length; i_258_++) {
				if (is[i_258_] != -1) {
					i_259_ = is[i_258_] - i_220_;
					i_259_ &= 0x3fff;
					Class432 class432 = new Class432();
					class432.method6890(0.0F, 1.0F, 0.0F, Class428.method6863(i_259_));
					class176_256_.method2888(class432, 1 << i_258_, false);
				}
			}
		}
		if (bool_233_ && null != class432s) {
			for (i_258_ = 0; i_258_ < is.length; i_258_++) {
				if (class432s[i_258_] != null)
					class176_256_.method2888(class432s[i_258_], 1 << i_258_, false);
			}
		}
		if (null != class695 && class695_219_ != null)
			Class476.method7773(class176_256_, class695, class695_219_, -1237622773);
		else if (class695 != null)
			class695.method14175(class176_256_, 0, (byte) 0);
		else if (class695_219_ != null)
			class695_219_.method14175(class176_256_, 0, (byte) 0);
		return class176_256_;
	}

	public static void method10515() {
		synchronized (aClass205_8288) {
			aClass205_8288.method3820(1155948610);
		}
		synchronized (aClass205_8289) {
			aClass205_8289.method3820(-559412430);
		}
	}

	static final void method10516(Class665 class665, int i) {
		int i_260_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_260_, 54118230);
		Class240 class240 = Class183.aClass240Array2100[i_260_ >> 16];
		Class261.method4927(class243, class240, class665, (byte) 37);
	}

	static void method10517(String[] strings, short i) {
		if (strings.length > 1) {
			for (int i_261_ = 0; i_261_ < strings.length; i_261_++) {
				if (strings[i_261_].startsWith("pause")) {
					int i_262_ = 5;
					try {
						i_262_ = Integer.parseInt(strings[i_261_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class493.method7997(new StringBuilder().append("Pausing for ").append(i_262_).append(" seconds...").toString(), (byte) 8);
					Class551.aStringArray7306 = strings;
					Class107.anInt1342 = (i_261_ + 1) * -1382613763;
					Class24_Sub15.aLong10982 = (Class234.method4347(-1408626088) + (long) (i_262_ * 1000)) * 358060795605226943L;
					break;
				}
				Class107.aString1337 = strings[i_261_];
				Node_Sub6.method16054(false, -1163482689);
			}
		} else {
			Class107.aString1337 = new StringBuilder().append(Class107.aString1337).append(strings[0]).toString();
			Class107.anInt1339 += strings[0].length() * 207030263;
		}
	}

	static void method10518(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, int i, byte i_263_) {
		if (null != class640_sub1_sub2_sub1.anIntArray11931) {
			Class679 class679 = (Class679) Class26.method858(Class679.method13904(673878859), i, 591382012);
			int i_264_ = (class640_sub1_sub2_sub1.anIntArray11931[class679.method13900(-1106028305)]);
			if (i_264_ != class640_sub1_sub2_sub1.aClass695_11914.method14164(-1977072149)) {
				class640_sub1_sub2_sub1.aClass695_11914.method14218(i_264_, class640_sub1_sub2_sub1.aClass695_11914.method14216(1769813785), (byte) 16);
				class640_sub1_sub2_sub1.anInt11947 = -466054043 * class640_sub1_sub2_sub1.anInt11942;
			}
		}
	}

	static void method10519(byte i) {
		if (Class204.aClass527_Sub31_2213.aClass700_Sub22_10631.method17121((byte) 32) == 1)
			Class396.aClass506_4119.method8239(new Class514((Class503.aClass503_6881), null), (byte) 24);
		else {
			client.aClass509_11072.method8361(-428559959);
			Class49.method1264(-287576266);
		}
	}

	public static Class702[] method10520(int i) {
		return (new Class702[] { Class702.aClass702_8800, Class702.aClass702_8805, Class702.aClass702_8804, Class702.aClass702_8797, Class702.aClass702_8806, Class702.aClass702_8799, Class702.aClass702_8802, Class702.aClass702_8813, Class702.aClass702_8803, Class702.aClass702_8809, Class702.aClass702_8815, Class702.aClass702_8814, Class702.aClass702_8816, Class702.aClass702_8801, Class702.aClass702_8807, Class702.aClass702_8810, Class702.aClass702_8812, Class702.aClass702_8811,
				Class702.aClass702_8808 });
	}
}
