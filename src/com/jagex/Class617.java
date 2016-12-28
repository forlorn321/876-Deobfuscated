/* Class617 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class617 {
	int anInt8064;
	public static final int anInt8065 = 1073741824;
	static final int anInt8066 = 1073741823;
	public static final int anInt8067 = 10;
	public static final int anInt8068 = 10;
	long aLong8069;
	public static final int anInt8070 = 4;
	int[] anIntArray8071;
	public int[] anIntArray8072;
	ItemEffects[] aClass12Array8073;
	public static final int anInt8074 = -2147483648;
	public int[] anIntArray8075;
	public boolean aBool8076;
	public static final int anInt8077 = 4;
	long aLong8078;
	public int anInt8079 = -1381953609;
	static int[] anIntArray8080 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	static Class199 aClass199_8081 = new Class199(260);
	static Class199 aClass199_8082 = new Class199(5);

	public void method7339(boolean bool) {
		aBool8076 = bool;
		method7363(-1172750978);
	}

	public void method7340(int i, int[] is, ItemEffects[] class12s, int[] is_0_, int[] is_1_, boolean bool, int i_2_, byte i_3_) {
		if (i != anInt8064 * -947248455)
			anInt8064 = -983219319 * i;
		anIntArray8071 = is;
		aClass12Array8073 = class12s;
		anIntArray8072 = is_0_;
		anIntArray8075 = is_1_;
		aBool8076 = bool;
		anInt8079 = 1381953609 * i_2_;
		method7363(-2103263168);
	}

	public static void method7341() {
		synchronized (aClass199_8081) {
			aClass199_8081.method2892(-1699026302);
		}
		synchronized (aClass199_8082) {
			aClass199_8082.method2892(-2101885195);
		}
	}

	public void method7342(int i, int i_4_, byte i_5_) {
		anIntArray8072[i] = i_4_;
		method7363(457524399);
	}

	public void method7343(int i, int i_6_, int i_7_) {
		anIntArray8075[i] = i_6_;
		method7363(2027737916);
	}

	public static void method7344(int i) {
		Class98_Sub1_Sub1.anInt11323 = i * 1812291805;
		synchronized (aClass199_8082) {
			aClass199_8082.method2884((byte) -56);
		}
		synchronized (aClass199_8081) {
			aClass199_8081.method2884((byte) -58);
		}
	}

	public Class177 method7345(Class167 class167, int i, BASTypeList class34_sub16, Class34_Sub2 class34_sub2, Class34_Sub7 class34_sub7, Class34_Sub13 class34_sub13, Interface20 interface20, Interface18 interface18, Class688 class688, Class688 class688_8_, Class688[] class688s, int[] is, int i_9_, boolean bool, Class631 class631, int i_10_) {
		if (-1 != -587726343 * anInt8079)
			return (((NPCDecoder) class34_sub7.method70(anInt8079 * -587726343, (byte) -27)).method3995(class167, i, class34_sub16, interface20, interface18, class688, class688_8_, class688s, is, i_9_, null, 978684503));
		int i_11_ = i;
		long l = aLong8078 * 8665352308600706965L;
		int[] is_12_ = anIntArray8071;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		if (class688 != null) {
			Class191 class191 = class688.method8159(564425336);
			if (class191 != null && (class191.anInt2164 * -154054713 >= 0 || class191.anInt2162 * -148397283 >= 0)) {
				is_12_ = new int[anIntArray8071.length];
				for (int i_15_ = 0; i_15_ < is_12_.length; i_15_++)
					is_12_[i_15_] = anIntArray8071[i_15_];
				if (class191.anInt2164 * -154054713 >= 0 && class631.anInt8242 * -81499919 != -1) {
					bool_13_ = true;
					if (class191.anInt2164 * -154054713 == 65535) {
						is_12_[class631.anInt8242 * -81499919] = 0;
						for (int i_16_ = 0; i_16_ < class631.anIntArray8244.length; i_16_++)
							is_12_[class631.anIntArray8244[i_16_]] = 0;
						l ^= ~0xffffffffL;
					} else {
						is_12_[-81499919 * class631.anInt8242] = -154054713 * class191.anInt2164 | 0x40000000;
						for (int i_17_ = 0; i_17_ < class631.anIntArray8244.length; i_17_++)
							is_12_[class631.anIntArray8244[i_17_]] = 0;
						l ^= ((long) is_12_[-81499919 * class631.anInt8242] << 32);
					}
				}
				if (class191.anInt2162 * -148397283 >= 0 && -1 != class631.anInt8243 * -589111501) {
					bool_14_ = true;
					if (class191.anInt2162 * -148397283 == 65535) {
						is_12_[-589111501 * class631.anInt8243] = 0;
						for (int i_18_ = 0; i_18_ < class631.anIntArray8245.length; i_18_++)
							is_12_[class631.anIntArray8245[i_18_]] = 0;
						l ^= 0xffffffffL;
					} else {
						is_12_[-589111501 * class631.anInt8243] = -148397283 * class191.anInt2162 | 0x40000000;
						for (int i_19_ = 0; i_19_ < class631.anIntArray8245.length; i_19_++)
							is_12_[class631.anIntArray8245[i_19_]] = 0;
						l ^= (long) is_12_[class631.anInt8243 * -589111501];
					}
				}
			}
		}
		boolean bool_20_ = false;
		int i_21_ = null != class688s ? class688s.length : 0;
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
			if (null != class688s[i_22_]) {
				i_11_ |= class688s[i_22_].method8162((byte) 2);
				bool_20_ = true;
			}
		}
		if (class688 != null) {
			i_11_ |= class688.method8162((byte) 39);
			bool_20_ = true;
		}
		if (class688_8_ != null) {
			i_11_ |= class688_8_.method8162((byte) 82);
			bool_20_ = true;
		}
		boolean bool_23_ = false;
		if (is != null) {
			for (int i_24_ = 0; i_24_ < is.length; i_24_++) {
				if (-1 != is[i_24_]) {
					i_11_ |= 0x20;
					bool_23_ = true;
				}
			}
		}
		Class177 class177;
		synchronized (aClass199_8081) {
			class177 = (Class177) aClass199_8081.method2886(l);
		}
		BASTypeDecoder class589 = null;
		if (anInt8064 * -947248455 != -1)
			class589 = (BASTypeDecoder) class34_sub16.method70(-947248455 * anInt8064, (byte) 93);
		if (null == class177 || class167.method2308(class177.method2466(), i_11_) != 0) {
			if (null != class177)
				i_11_ = class167.method2068(i_11_, class177.method2466());
			int i_25_ = i_11_;
			boolean bool_26_ = false;
			for (int i_27_ = 0; i_27_ < is_12_.length; i_27_++) {
				int i_28_ = is_12_[i_27_];
				ItemEffects class12 = null;
				boolean bool_29_ = false;
				if (bool_13_) {
					if (-81499919 * class631.anInt8242 == i_27_)
						bool_29_ = true;
					else {
						for (int i_30_ = 0; i_30_ < class631.anIntArray8244.length; i_30_++) {
							if (class631.anIntArray8244[i_30_] == i_27_) {
								bool_29_ = true;
								break;
							}
						}
					}
				}
				if (bool_14_) {
					if (i_27_ == class631.anInt8243 * -589111501)
						bool_29_ = true;
					else {
						for (int i_31_ = 0; i_31_ < class631.anIntArray8245.length; i_31_++) {
							if (class631.anIntArray8245[i_31_] == i_27_) {
								bool_29_ = true;
								break;
							}
						}
					}
				}
				if ((i_28_ & 0x40000000) != 0) {
					if (!bool_29_ && null != aClass12Array8073 && aClass12Array8073[i_27_] != null)
						class12 = aClass12Array8073[i_27_];
					if (!((ItemDecoder) class34_sub13.method70(i_28_ & 0x3fffffff, (byte) 107)).method515(aBool8076, class12, -797291593))
						bool_26_ = true;
				} else if ((i_28_ & ~0x7fffffff) != 0 && !((Class313) class34_sub2.method70(i_28_ & 0x3fffffff, (byte) -73)).method4187(-114291264))
					bool_26_ = true;
			}
			if (bool_26_) {
				if (-1L != aLong8069 * -1938889797460437105L) {
					synchronized (aClass199_8081) {
						class177 = (Class177) (aClass199_8081.method2886(aLong8069 * -1938889797460437105L));
					}
				}
				if (null == class177 || class167.method2308(class177.method2466(), i_11_) != 0)
					return null;
			} else {
				Class180[] class180s = new Class180[is_12_.length];
				for (int i_32_ = 0; i_32_ < is_12_.length; i_32_++) {
					int i_33_ = is_12_[i_32_];
					ItemEffects class12 = null;
					boolean bool_34_ = i_32_ == 5 && bool_13_ || 3 == i_32_ && bool_14_;
					if ((i_33_ & 0x40000000) != 0) {
						if (!bool_34_ && null != aClass12Array8073 && null != aClass12Array8073[i_32_])
							class12 = aClass12Array8073[i_32_];
						Class180 class180 = ((ItemDecoder) class34_sub13.method70(i_33_ & 0x3fffffff, (byte) -106)).method509(aBool8076, class12, -1431934785);
						if (class180 != null)
							class180s[i_32_] = class180;
					} else if (0 != (i_33_ & ~0x7fffffff)) {
						Class180 class180 = ((Class313) class34_sub2.method70(i_33_ & 0x3fffffff, (byte) -20)).method4188(-1901146875);
						if (null != class180)
							class180s[i_32_] = class180;
					}
				}
				if (class589 != null && null != class589.anIntArrayArray7749) {
					for (int i_35_ = 0; i_35_ < class589.anIntArrayArray7749.length; i_35_++) {
						if (null != class180s[i_35_]) {
							int i_36_ = 0;
							int i_37_ = 0;
							int i_38_ = 0;
							int i_39_ = 0;
							int i_40_ = 0;
							int i_41_ = 0;
							if (class589.anIntArrayArray7749[i_35_] != null) {
								i_36_ = class589.anIntArrayArray7749[i_35_][0];
								i_37_ = class589.anIntArrayArray7749[i_35_][1];
								i_38_ = class589.anIntArrayArray7749[i_35_][2];
								i_39_ = (class589.anIntArrayArray7749[i_35_][3] << 3);
								i_40_ = (class589.anIntArrayArray7749[i_35_][4] << 3);
								i_41_ = (class589.anIntArrayArray7749[i_35_][5] << 3);
							}
							if (i_39_ != 0 || i_40_ != 0 || 0 != i_41_)
								class180s[i_35_].method2711(i_39_, i_40_, i_41_);
							if (0 != i_36_ || i_37_ != 0 || i_38_ != 0)
								class180s[i_35_].method2705(i_36_, i_37_, i_38_);
						}
					}
				}
				Class180 class180 = new Class180(class180s, class180s.length);
				i_25_ |= 0x4000;
				class177 = class167.method2093(class180, i_25_, -1386973323 * (Class98_Sub1_Sub1.anInt11323), 64, 850);
				for (int i_42_ = 0; i_42_ < 10; i_42_++) {
					for (int i_43_ = 0; i_43_ < Class500.aShortArrayArray6844[i_42_].length; i_43_++) {
						if (anIntArray8072[i_42_] < (Class267.aShortArrayArrayArray2870[i_42_][i_43_]).length)
							class177.method2507((Class500.aShortArrayArray6844[i_42_][i_43_]), (Class267.aShortArrayArrayArray2870[i_42_][i_43_][anIntArray8072[i_42_]]));
					}
				}
				for (int i_44_ = 0; i_44_ < 10; i_44_++) {
					for (int i_45_ = 0; (i_45_ < Class710_Sub4.aShortArrayArray10822[i_44_].length); i_45_++) {
						if (anIntArray8075[i_44_] < (Class44.aShortArrayArrayArray520[i_44_][i_45_]).length)
							class177.method2509((Class710_Sub4.aShortArrayArray10822[i_44_][i_45_]), (Class44.aShortArrayArrayArray520[i_44_][i_45_][anIntArray8075[i_44_]]));
					}
				}
				class177.method2501();
				if (bool) {
					class177.method2465(i_11_);
					synchronized (aClass199_8081) {
						aClass199_8081.method2881(class177, l);
					}
					aLong8069 = 9154697909189175151L * l;
				}
			}
		}
		Class177 class177_46_ = class177.method2623((byte) 4, i_11_, true);
		if (!bool_20_ && !bool_23_)
			return class177_46_;
		Class433[] class433s = null;
		if (null != class589)
			class433s = class589.method7091(354690031);
		if (bool_23_ && null != class433s) {
			for (int i_47_ = 0; i_47_ < is.length; i_47_++) {
				if (null != class433s[i_47_])
					class177_46_.method2489(class433s[i_47_], 1 << i_47_, true);
			}
		}
		int i_48_ = 0;
		int i_49_ = 1;
		while (i_48_ < i_21_) {
			if (null != class688s[i_48_])
				class688s[i_48_].method8133(class177_46_, 0, i_49_, 1049444347);
			i_48_++;
			i_49_ <<= 1;
		}
		if (bool_23_) {
			for (i_48_ = 0; i_48_ < is.length; i_48_++) {
				if (-1 != is[i_48_]) {
					i_49_ = is[i_48_] - i_9_;
					i_49_ &= 0x3fff;
					Class433 class433 = new Class433();
					class433.method5206(0.0F, 1.0F, 0.0F, Class447.method5400(i_49_));
					class177_46_.method2489(class433, 1 << i_48_, false);
				}
			}
		}
		if (bool_23_ && class433s != null) {
			for (i_48_ = 0; i_48_ < is.length; i_48_++) {
				if (null != class433s[i_48_])
					class177_46_.method2489(class433s[i_48_], 1 << i_48_, false);
			}
		}
		if (null != class688 && class688_8_ != null)
			Class389.method4852(class177_46_, class688, class688_8_, -97419394);
		else if (class688 != null)
			class688.method8132(class177_46_, 0, -693361831);
		else if (null != class688_8_)
			class688_8_.method8132(class177_46_, 0, -1225163035);
		return class177_46_;
	}

	public Class177 method7346(Class167 class167, int i, Class34_Sub2 class34_sub2, Class34_Sub7 class34_sub7, Class34_Sub13 class34_sub13, Interface20 interface20, Interface18 interface18, Class688 class688, int i_50_) {
		if (-1 != -587726343 * anInt8079)
			return (((NPCDecoder) class34_sub7.method70(anInt8079 * -587726343, (byte) -64)).method3981(class167, i, interface20, interface18, class688, null, (short) -21847));
		int i_51_ = null != class688 ? i | class688.method8162((byte) 84) : i;
		Class177 class177;
		synchronized (aClass199_8082) {
			class177 = (Class177) aClass199_8082.method2886(8665352308600706965L * aLong8078);
		}
		if (null == class177 || class167.method2308(class177.method2466(), i_51_) != 0) {
			if (null != class177)
				i_51_ = class167.method2068(i_51_, class177.method2466());
			int i_52_ = i_51_;
			boolean bool = false;
			for (int i_53_ = 0; i_53_ < anIntArray8071.length; i_53_++) {
				int i_54_ = anIntArray8071[i_53_];
				ItemEffects class12 = null;
				if ((i_54_ & 0x40000000) != 0) {
					if (aClass12Array8073 != null && aClass12Array8073[i_53_] != null)
						class12 = aClass12Array8073[i_53_];
					if (!((ItemDecoder) class34_sub13.method70(i_54_ & 0x3fffffff, (byte) -18)).method514(aBool8076, class12, 1499603302))
						bool = true;
				} else if (0 != (i_54_ & ~0x7fffffff) && !((Class313) class34_sub2.method70(i_54_ & 0x3fffffff, (byte) -13)).method4192(1660830213))
					bool = true;
			}
			if (bool)
				return null;
			Class180[] class180s = new Class180[anIntArray8071.length];
			int i_55_ = 0;
			for (int i_56_ = 0; i_56_ < anIntArray8071.length; i_56_++) {
				int i_57_ = anIntArray8071[i_56_];
				ItemEffects class12 = null;
				if (0 != (i_57_ & 0x40000000)) {
					if (null != aClass12Array8073 && aClass12Array8073[i_56_] != null)
						class12 = aClass12Array8073[i_56_];
					Class180 class180 = ((ItemDecoder) class34_sub13.method70(i_57_ & 0x3fffffff, (byte) -5)).method517(aBool8076, class12, (byte) -79);
					if (class180 != null)
						class180s[i_55_++] = class180;
				} else if ((i_57_ & ~0x7fffffff) != 0) {
					Class180 class180 = ((Class313) class34_sub2.method70(i_57_ & 0x3fffffff, (byte) -16)).method4190((byte) 0);
					if (null != class180)
						class180s[i_55_++] = class180;
				}
			}
			Class180 class180 = new Class180(class180s, i_55_);
			i_52_ |= 0x4000;
			class177 = class167.method2093(class180, i_52_, (Class98_Sub1_Sub1.anInt11323 * -1386973323), 64, 768);
			for (int i_58_ = 0; i_58_ < 10; i_58_++) {
				for (int i_59_ = 0; i_59_ < Class500.aShortArrayArray6844[i_58_].length; i_59_++) {
					if (anIntArray8072[i_58_] < (Class267.aShortArrayArrayArray2870[i_58_][i_59_]).length)
						class177.method2507((Class500.aShortArrayArray6844[i_58_][i_59_]), (Class267.aShortArrayArrayArray2870[i_58_][i_59_][anIntArray8072[i_58_]]));
				}
			}
			for (int i_60_ = 0; i_60_ < 10; i_60_++) {
				for (int i_61_ = 0; i_61_ < Class710_Sub4.aShortArrayArray10822[i_60_].length; i_61_++) {
					if (anIntArray8075[i_60_] < (Class44.aShortArrayArrayArray520[i_60_][i_61_]).length)
						class177.method2509((Class710_Sub4.aShortArrayArray10822[i_60_][i_61_]), (Class44.aShortArrayArrayArray520[i_60_][i_61_][anIntArray8075[i_60_]]));
				}
			}
			class177.method2465(i_51_);
			synchronized (aClass199_8082) {
				aClass199_8082.method2881(class177, aLong8078 * 8665352308600706965L);
			}
		}
		if (class688 == null)
			return class177;
		Class177 class177_62_ = class177.method2623((byte) 4, i_51_, true);
		class688.method8132(class177_62_, 0, -159125703);
		return class177_62_;
	}

	public Class177 method7347(Class167 class167, int i, Class34_Sub2 class34_sub2, Class34_Sub11 class34_sub11, Class688 class688, int i_63_, int i_64_, int i_65_, int i_66_) {
		int i_67_ = null != class688 ? i | class688.method8162((byte) 52) : i;
		long l = (long) i_65_ << 32 | (long) (i_64_ << 16) | (long) i_63_;
		Class177 class177;
		synchronized (aClass199_8082) {
			class177 = (Class177) aClass199_8082.method2886(l);
		}
		if (null == class177 || class167.method2308(class177.method2466(), i_67_) != 0) {
			if (null != class177)
				i_67_ = class167.method2068(i_67_, class177.method2466());
			int i_68_ = i_67_;
			Class180[] class180s = new Class180[3];
			int i_69_ = 0;
			if (((Class313) class34_sub2.method70(i_63_, (byte) 18)).method4192(1516952665) && ((Class313) class34_sub2.method70(i_64_, (byte) -50)).method4192(1705093801) && ((Class313) class34_sub2.method70(i_65_, (byte) -109)).method4192(1978663142)) {
				Class180 class180 = ((Class313) class34_sub2.method70(i_63_, (byte) 15)).method4190((byte) 0);
				if (null != class180)
					class180s[i_69_++] = class180;
				class180 = ((Class313) class34_sub2.method70(i_64_, (byte) 14)).method4190((byte) 0);
				if (class180 != null)
					class180s[i_69_++] = class180;
				class180 = ((Class313) class34_sub2.method70(i_65_, (byte) -24)).method4190((byte) 0);
				if (null != class180)
					class180s[i_69_++] = class180;
				class180 = new Class180(class180s, i_69_);
				i_68_ |= 0x4000;
				class177 = class167.method2093(class180, i_68_, (Class98_Sub1_Sub1.anInt11323 * -1386973323), 64, 768);
				for (int i_70_ = 0; i_70_ < 10; i_70_++) {
					for (int i_71_ = 0; i_71_ < Class500.aShortArrayArray6844[i_70_].length; i_71_++) {
						if (anIntArray8072[i_70_] < (Class267.aShortArrayArrayArray2870[i_70_][i_71_]).length)
							class177.method2507((Class500.aShortArrayArray6844[i_70_][i_71_]), (Class267.aShortArrayArrayArray2870[i_70_][i_71_][anIntArray8072[i_70_]]));
					}
				}
				for (int i_72_ = 0; i_72_ < 10; i_72_++) {
					for (int i_73_ = 0; (i_73_ < Class710_Sub4.aShortArrayArray10822[i_72_].length); i_73_++) {
						if (anIntArray8075[i_72_] < (Class44.aShortArrayArrayArray520[i_72_][i_73_]).length)
							class177.method2509((Class710_Sub4.aShortArrayArray10822[i_72_][i_73_]), (Class44.aShortArrayArrayArray520[i_72_][i_73_][anIntArray8075[i_72_]]));
					}
				}
				class177.method2465(i_67_);
				synchronized (aClass199_8082) {
					aClass199_8082.method2881(class177, l);
				}
			} else
				return null;
		}
		if (null == class688)
			return class177;
		class177 = class177.method2623((byte) 4, i_67_, true);
		class688.method8132(class177, 0, -939798194);
		return class177;
	}

	public void method7348(boolean bool) {
		aBool8076 = bool;
		method7363(240383406);
	}

	public void method7349(int i, int i_74_) {
		anIntArray8072[i] = i_74_;
		method7363(1119392021);
	}

	public void method7350(int i, int i_75_, Class34_Sub2 class34_sub2, int i_76_) {
		int i_77_ = anIntArray8080[i];
		if (class34_sub2.method70(i_75_, (byte) -29) != null) {
			anIntArray8071[i_77_] = i_75_ | ~0x7fffffff;
			method7363(-1209606183);
		}
	}

	public static void method7351(int i) {
		Class98_Sub1_Sub1.anInt11323 = i * 1812291805;
		synchronized (aClass199_8082) {
			aClass199_8082.method2884((byte) -2);
		}
		synchronized (aClass199_8081) {
			aClass199_8081.method2884((byte) -80);
		}
	}

	void method7352() {
		long[] ls = RSByteBuffer.aLongArray10595;
		aLong8078 = 7740964439852778563L;
		aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (-947248455 * anInt8064 >> 8)) & 0xffL)]));
		aLong8078 = (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (-947248455 * anInt8064)) & 0xffL)]) * -7740964439852778563L;
		for (int i = 0; i < anIntArray8071.length; i++) {
			aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i] >> 24)) & 0xffL)]));
			aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i] >> 16)) & 0xffL)]));
			aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i] >> 8)) & 0xffL)]));
			aLong8078 = (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8071[i]) & 0xffL)]) * -7740964439852778563L;
		}
		if (aClass12Array8073 != null) {
			for (int i = 0; i < aClass12Array8073.length; i++) {
				if (aClass12Array8073[i] != null) {
					int[] is;
					int[] is_78_;
					if (aBool8076) {
						is = aClass12Array8073[i].anIntArray152;
						is_78_ = aClass12Array8073[i].anIntArray154;
					} else {
						is = aClass12Array8073[i].anIntArray149;
						is_78_ = aClass12Array8073[i].anIntArray153;
					}
					if (is != null) {
						for (int i_79_ = 0; i_79_ < is.length; i_79_++) {
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) (is[i_79_] >> 8)) & 0xffL)]));
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) is[i_79_]) & 0xffL)]) * -7740964439852778563L);
						}
					}
					if (is_78_ != null) {
						for (int i_80_ = 0; i_80_ < is_78_.length; i_80_++) {
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) (is_78_[i_80_] >> 8)) & 0xffL)]));
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) is_78_[i_80_]) & 0xffL)]));
						}
					}
					if (null != aClass12Array8073[i].modifiedColours) {
						for (int i_81_ = 0; (i_81_ < aClass12Array8073[i].modifiedColours.length); i_81_++) {
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) ((aClass12Array8073[i].modifiedColours[i_81_]) >> 8)) & 0xffL)]) * -7740964439852778563L);
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) (aClass12Array8073[i].modifiedColours[i_81_])) & 0xffL)]));
						}
					}
					if (aClass12Array8073[i].modifiedTextures != null) {
						for (int i_82_ = 0; (i_82_ < aClass12Array8073[i].modifiedTextures.length); i_82_++) {
							aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) ((aClass12Array8073[i].modifiedTextures[i_82_]) >> 8)) & 0xffL)]));
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) (aClass12Array8073[i].modifiedTextures[i_82_])) & 0xffL)]) * -7740964439852778563L);
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8072[i]) & 0xffL)]));
		for (int i = 0; i < 10; i++)
			aLong8078 = (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8075[i]) & 0xffL)]) * -7740964439852778563L;
		aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) (aBool8076 ? 1 : 0)) & 0xffL)]));
	}

	void method7353() {
		long[] ls = RSByteBuffer.aLongArray10595;
		aLong8078 = 7740964439852778563L;
		aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (-947248455 * anInt8064 >> 8)) & 0xffL)]));
		aLong8078 = (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (-947248455 * anInt8064)) & 0xffL)]) * -7740964439852778563L;
		for (int i = 0; i < anIntArray8071.length; i++) {
			aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i] >> 24)) & 0xffL)]));
			aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i] >> 16)) & 0xffL)]));
			aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i] >> 8)) & 0xffL)]));
			aLong8078 = (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8071[i]) & 0xffL)]) * -7740964439852778563L;
		}
		if (aClass12Array8073 != null) {
			for (int i = 0; i < aClass12Array8073.length; i++) {
				if (aClass12Array8073[i] != null) {
					int[] is;
					int[] is_83_;
					if (aBool8076) {
						is = aClass12Array8073[i].anIntArray152;
						is_83_ = aClass12Array8073[i].anIntArray154;
					} else {
						is = aClass12Array8073[i].anIntArray149;
						is_83_ = aClass12Array8073[i].anIntArray153;
					}
					if (is != null) {
						for (int i_84_ = 0; i_84_ < is.length; i_84_++) {
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) (is[i_84_] >> 8)) & 0xffL)]));
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) is[i_84_]) & 0xffL)]) * -7740964439852778563L);
						}
					}
					if (is_83_ != null) {
						for (int i_85_ = 0; i_85_ < is_83_.length; i_85_++) {
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) (is_83_[i_85_] >> 8)) & 0xffL)]));
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) is_83_[i_85_]) & 0xffL)]));
						}
					}
					if (null != aClass12Array8073[i].modifiedColours) {
						for (int i_86_ = 0; (i_86_ < aClass12Array8073[i].modifiedColours.length); i_86_++) {
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) ((aClass12Array8073[i].modifiedColours[i_86_]) >> 8)) & 0xffL)]) * -7740964439852778563L);
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) (aClass12Array8073[i].modifiedColours[i_86_])) & 0xffL)]));
						}
					}
					if (aClass12Array8073[i].modifiedTextures != null) {
						for (int i_87_ = 0; (i_87_ < aClass12Array8073[i].modifiedTextures.length); i_87_++) {
							aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) ((aClass12Array8073[i].modifiedTextures[i_87_]) >> 8)) & 0xffL)]));
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) (aClass12Array8073[i].modifiedTextures[i_87_])) & 0xffL)]) * -7740964439852778563L);
						}
					}
				}
			}
		}
		for (int i = 0; i < 10; i++)
			aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8072[i]) & 0xffL)]));
		for (int i = 0; i < 10; i++)
			aLong8078 = (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8075[i]) & 0xffL)]) * -7740964439852778563L;
		aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) (aBool8076 ? 1 : 0)) & 0xffL)]));
	}

	public void method7354(int i, int i_88_, Class34_Sub13 class34_sub13, int i_89_) {
		if (i_88_ == -1)
			anIntArray8071[i] = 0;
		else if (class34_sub13.method70(i_88_, (byte) -9) != null) {
			anIntArray8071[i] = i_88_ | 0x40000000;
			method7363(-58200247);
		}
	}

	public static int method7355() {
		synchronized (aClass199_8081) {
			int i = aClass199_8081.method2887(1789749525);
			return i;
		}
	}

	public static int method7356() {
		synchronized (aClass199_8081) {
			int i = aClass199_8081.method2887(1980716984);
			return i;
		}
	}

	public void method7357(boolean bool, int i) {
		aBool8076 = bool;
		method7363(-1962301106);
	}

	public static void method7358(int i) {
		Class98_Sub1_Sub1.anInt11323 = i * 1812291805;
		synchronized (aClass199_8082) {
			aClass199_8082.method2884((byte) -77);
		}
		synchronized (aClass199_8081) {
			aClass199_8081.method2884((byte) -89);
		}
	}

	public static void method7359(int i) {
		Class98_Sub1_Sub1.anInt11323 = i * 1812291805;
		synchronized (aClass199_8082) {
			aClass199_8082.method2884((byte) -22);
		}
		synchronized (aClass199_8081) {
			aClass199_8081.method2884((byte) -101);
		}
	}

	public static void method7360() {
		synchronized (aClass199_8081) {
			aClass199_8081.method2884((byte) -8);
		}
		synchronized (aClass199_8082) {
			aClass199_8082.method2884((byte) -5);
		}
	}

	public static void method7361() {
		synchronized (aClass199_8081) {
			aClass199_8081.method2892(-1560271234);
		}
		synchronized (aClass199_8082) {
			aClass199_8082.method2892(186636070);
		}
	}

	public static void method7362() {
		synchronized (aClass199_8081) {
			aClass199_8081.method2892(-1305794528);
		}
		synchronized (aClass199_8082) {
			aClass199_8082.method2892(-2015388805);
		}
	}

	void method7363(int i) {
		long[] ls = RSByteBuffer.aLongArray10595;
		aLong8078 = 7740964439852778563L;
		aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (-947248455 * anInt8064 >> 8)) & 0xffL)]));
		aLong8078 = (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (-947248455 * anInt8064)) & 0xffL)]) * -7740964439852778563L;
		for (int i_90_ = 0; i_90_ < anIntArray8071.length; i_90_++) {
			aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i_90_] >> 24)) & 0xffL)]));
			aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i_90_] >> 16)) & 0xffL)]));
			aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((8665352308600706965L * aLong8078 ^ (long) (anIntArray8071[i_90_] >> 8)) & 0xffL)]));
			aLong8078 = (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8071[i_90_]) & 0xffL)]) * -7740964439852778563L;
		}
		if (aClass12Array8073 != null) {
			for (int i_91_ = 0; i_91_ < aClass12Array8073.length; i_91_++) {
				if (aClass12Array8073[i_91_] != null) {
					int[] is;
					int[] is_92_;
					if (aBool8076) {
						is = aClass12Array8073[i_91_].anIntArray152;
						is_92_ = aClass12Array8073[i_91_].anIntArray154;
					} else {
						is = aClass12Array8073[i_91_].anIntArray149;
						is_92_ = aClass12Array8073[i_91_].anIntArray153;
					}
					if (is != null) {
						for (int i_93_ = 0; i_93_ < is.length; i_93_++) {
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) (is[i_93_] >> 8)) & 0xffL)]));
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) is[i_93_]) & 0xffL)]) * -7740964439852778563L);
						}
					}
					if (is_92_ != null) {
						for (int i_94_ = 0; i_94_ < is_92_.length; i_94_++) {
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) (is_92_[i_94_] >> 8)) & 0xffL)]));
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) is_92_[i_94_]) & 0xffL)]));
						}
					}
					if (null != aClass12Array8073[i_91_].modifiedColours) {
						for (int i_95_ = 0; i_95_ < (aClass12Array8073[i_91_].modifiedColours).length; i_95_++) {
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) ((aClass12Array8073[i_91_].modifiedColours[i_95_]) >> 8)) & 0xffL)]) * -7740964439852778563L);
							aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) (aClass12Array8073[i_91_].modifiedColours[i_95_])) & 0xffL)]));
						}
					}
					if (aClass12Array8073[i_91_].modifiedTextures != null) {
						for (int i_96_ = 0; i_96_ < (aClass12Array8073[i_91_].modifiedTextures).length; i_96_++) {
							aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((aLong8078 * 8665352308600706965L) ^ (long) ((aClass12Array8073[i_91_].modifiedTextures[i_96_]) >> 8)) & 0xffL)]));
							aLong8078 = ((8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) (((8665352308600706965L * aLong8078) ^ (long) (aClass12Array8073[i_91_].modifiedTextures[i_96_])) & 0xffL)]) * -7740964439852778563L);
						}
					}
				}
			}
		}
		for (int i_97_ = 0; i_97_ < 10; i_97_++)
			aLong8078 = (-7740964439852778563L * (8665352308600706965L * aLong8078 >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8072[i_97_]) & 0xffL)]));
		for (int i_98_ = 0; i_98_ < 10; i_98_++)
			aLong8078 = (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) anIntArray8075[i_98_]) & 0xffL)]) * -7740964439852778563L;
		aLong8078 = (-7740964439852778563L * (aLong8078 * 8665352308600706965L >>> 8 ^ ls[(int) ((aLong8078 * 8665352308600706965L ^ (long) (aBool8076 ? 1 : 0)) & 0xffL)]));
	}

	public static void method7364() {
		synchronized (aClass199_8081) {
			aClass199_8081.method2892(-1217048525);
		}
		synchronized (aClass199_8082) {
			aClass199_8082.method2892(-1414930564);
		}
	}

	static final void method7365(Class668 class668, int i) {
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.bgSoundVolumeSetting), (class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 1);
		Class27.method763(1946128829);
		client.aBool11015 = false;
	}

	static final void method7366(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static void method7367(Class167 class167, int i) {
		if ((1780207751 * Class70.anInt760 >= 2 || client.aBool11188) && client.aClass251_10992 == null) {
			String string;
			if (client.aBool11188 && Class70.anInt760 * 1780207751 < 2)
				string = new StringBuilder().append(client.aString11185).append(Class38.aClass38_444.method840(Class459.aClass664_5178, 1874106645)).append(client.aString11186).append(" ").append(Class40.aString495).toString();
			else if (Class176.method2454((byte) -9) && Class70.anInt760 * 1780207751 > 2)
				string = Class87.method1212(Class70.aClass536_Sub18_Sub9_759, 1910397862);
			else {
				Class536_Sub18_Sub9 class536_sub18_sub9 = Class70.aClass536_Sub18_Sub9_759;
				if (null == class536_sub18_sub9)
					return;
				string = Class87.method1212(class536_sub18_sub9, 154142204);
				int[] is = Class402.method4923(class536_sub18_sub9, -1621041989);
				if (null != is)
					string = new StringBuilder().append(string).append(Class158.method1892(is, -1192355961)).toString();
			}
			if (Class70.anInt760 * 1780207751 > 2)
				string = new StringBuilder().append(string).append(Class264.method3680(16777215, -1200361023)).append(" / ").append(1780207751 * Class70.anInt760 - 2).append(Class38.aClass38_387.method840(Class459.aClass664_5178, 1890094037)).toString();
			if (Class70.aClass251_770 != null) {
				Class184 class184 = Class70.aClass251_770.method3469(Class196.aClass410_2202, (client.anInterface51_11196), (byte) 1);
				if (class184 == null)
					class184 = Class26.aClass184_248;
				class184.method2739(string, 919705081 * Class70.anInt771, -224506627 * Class70.anInt769, Class70.aClass251_770.anInt2573 * -1606950689, Class70.aClass251_770.anInt2574 * 223822141, Class70.aClass251_770.colour * -336626187, 1514577167 * Class70.aClass251_770.graphicShadow, -953209107 * Class70.aClass251_770.horizTextAlign, 18027815 * Class70.aClass251_770.vertTextAlign, client.aRandom11161, Class458_Sub4.anInt10337, client.anIntArray11251, Class195.aClass143Array2201, null, (byte) 0);
				Class680.method8073(client.anIntArray11251[0], client.anIntArray11251[1], client.anIntArray11251[2], client.anIntArray11251[3], (byte) 36);
			}
		}
	}

	static final void method7368(Class668 class668, int i) {
		int i_99_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3227(i_99_, -781094290).method3120(-215615549);
	}

	static final void method7369(Class668 class668, int i) {
		int i_100_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_100_);
		Class234 class234 = Class463.aClass234Array5227[i_100_ >> 16];
		Class560.method6824(class251, class234, class668, -2145933986);
	}
}
