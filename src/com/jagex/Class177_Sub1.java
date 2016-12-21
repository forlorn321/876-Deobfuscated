/* Class177_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Stream;

import jaggl.OpenGL;

public class Class177_Sub1 extends Class177 {
	static long[] aLongArray9042;
	static final int anInt9043 = 7;
	static final int anInt9044 = 1;
	static final int anInt9045 = 2;
	Class121 aClass121_9046;
	static final int anInt9047 = 8;
	static final int anInt9048 = 16;
	Class167_Sub2 aClass167_Sub2_9049;
	int anInt9050;
	int anInt9051;
	static int anInt9052;
	short aShort9053;
	short aShort9054;
	short[] aShortArray9055;
	boolean aBool9056;
	int anInt9057;
	int anInt9058;
	int[] anIntArray9059;
	int[] anIntArray9060;
	int[] anIntArray9061;
	float[] aFloatArray9062;
	short[] aShortArray9063;
	Class156[] aClass156Array9064;
	Class130 aClass130_9065;
	short[] aShortArray9066;
	int anInt9067;
	int[] anIntArray9068;
	Class162 aClass162_9069;
	float[] aFloatArray9070;
	short[] aShortArray9071;
	int anInt9072;
	static int anInt9073;
	short[] aShortArray9074;
	byte[] aByteArray9075;
	short[] aShortArray9076;
	int anInt9077;
	static final int anInt9078 = 4;
	short[] aShortArray9079;
	int[][] anIntArrayArray9080;
	short[] aShortArray9081;
	Class130 aClass130_9082;
	short aShort9083;
	boolean aBool9084 = false;
	byte aByte9085;
	Class130 aClass130_9086;
	Interface17 anInterface17_9087;
	Interface15 anInterface15_9088;
	boolean aBool9089;
	int anInt9090;
	short[] aShortArray9091;
	boolean aBool9092;
	short aShort9093;
	short aShort9094;
	short aShort9095;
	short aShort9096;
	short aShort9097;
	short aShort9098;
	boolean aBool9099;
	byte[] aByteArray9100;
	int[] anIntArray9101;
	Class132[] aClass132Array9102;
	short[] aShortArray9103;
	Class172[] aClass172Array9104;
	static boolean aBool9105;
	Class130 aClass130_9106;
	Class142[] aClass142Array9107;
	short[] aShortArray9108;
	int[][] anIntArrayArray9109;
	static int[] anIntArray9110;
	static float[] aFloatArray9111 = new float[2];
	int[][] anIntArrayArray9112;
	static int[] anIntArray9113;
	static int[] anIntArray9114;
	static final int anInt9115 = 4;
	int anInt9116;
	static int anInt9117;
	int anInt9118;

	void method2542() {
		for (int i = 0; i < anInt9057; i++) {
			anIntArray9059[i] = anIntArray9059[i] + 7 >> 4;
			anIntArray9060[i] = anIntArray9060[i] + 7 >> 4;
			anIntArray9061[i] = anIntArray9061[i] + 7 >> 4;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2500(byte i, byte[] is) {
		if (is == null) {
			for (int i_0_ = 0; i_0_ < anInt9118; i_0_++)
				aByteArray9075[i_0_] = i;
		} else {
			for (int i_1_ = 0; i_1_ < anInt9118; i_1_++) {
				int i_2_ = (255 - (255 - (is[i_1_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9075[i_1_] = (byte) i_2_;
			}
		}
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	short method8483(Class180 class180, int i, long l, int i_3_, int i_4_, int i_5_, int i_6_, float f, float f_7_) {
		int i_8_ = anIntArray9068[i];
		int i_9_ = anIntArray9068[i + 1];
		int i_10_ = 0;
		for (int i_11_ = i_8_; i_11_ < i_9_; i_11_++) {
			if (aShortArray9103[i_11_] == 0) {
				i_10_ = i_11_;
				break;
			}
			int i_12_ = (aShortArray9103[i_11_] & 0xffff) - 1;
			if (aLongArray9042[i_11_] == l)
				return (short) i_12_;
		}
		aShortArray9103[i_10_] = (short) (anInt9077 + 1);
		aLongArray9042[i_10_] = l;
		aShortArray9108[anInt9077] = (short) i_3_;
		aShortArray9066[anInt9077] = (short) i_4_;
		aShortArray9071[anInt9077] = (short) i_5_;
		aByteArray9100[anInt9077] = (byte) i_6_;
		aFloatArray9070[anInt9077] = f;
		aFloatArray9062[anInt9077] = f_7_;
		return (short) anInt9077++;
	}

	static byte[] method8484(byte[] is, int i) {
		byte[] is_13_ = new byte[i];
		System.arraycopy(is, 0, is_13_, 0, i);
		return is_13_;
	}

	static short[] method8485(short[] is, int i) {
		short[] is_14_ = new short[i];
		System.arraycopy(is, 0, is_14_, 0, i);
		return is_14_;
	}

	static float[] method8486(float[] fs, int i) {
		float[] fs_15_ = new float[i];
		System.arraycopy(fs, 0, fs_15_, 0, i);
		return fs_15_;
	}

	public int method2466() {
		return anInt9050;
	}

	public void method2465(int i) {
		anInt9050 = i;
		if (aClass162_9069 != null && (anInt9050 & 0x10000) == 0) {
			aShortArray9108 = aClass162_9069.aShortArray1774;
			aShortArray9066 = aClass162_9069.aShortArray1771;
			aShortArray9071 = aClass162_9069.aShortArray1773;
			aByteArray9100 = aClass162_9069.aByteArray1772;
			aClass162_9069 = null;
		}
		aBool9089 = true;
		method8487();
	}

	public void method2467() {
		if (anInt9077 > 0 && anInt9072 > 0) {
			method8496(false);
			if ((aByte9085 & 0x10) == 0 && aClass121_9046.anInterface17_1481 == null)
				method8490(false);
			method8487();
		}
	}

	public Class177 method2623(byte i, int i_16_, boolean bool) {
		boolean bool_17_ = false;
		Class177_Sub1 class177_sub1_18_;
		Class177_Sub1 class177_sub1_19_;
		if (i > 0 && i <= 8) {
			class177_sub1_19_ = aClass167_Sub2_9049.aClass177_Sub1Array9177[i - 1];
			class177_sub1_18_ = aClass167_Sub2_9049.aClass177_Sub1Array9312[i - 1];
			bool_17_ = true;
		} else
			class177_sub1_18_ = class177_sub1_19_ = new Class177_Sub1(aClass167_Sub2_9049);
		return method8497(class177_sub1_18_, class177_sub1_19_, i_16_, bool_17_, bool);
	}

	public void method2596(short i, short i_20_) {
		Class174 class174 = aClass167_Sub2_9049.aClass174_1852;
		for (int i_21_ = 0; i_21_ < anInt9118; i_21_++) {
			if (aShortArray9079[i_21_] == i)
				aShortArray9079[i_21_] = i_20_;
		}
		byte i_22_ = 0;
		byte i_23_ = 0;
		if (i != -1) {
			Class164 class164 = class174.method2446(i & 0xffff, -495300988);
			i_22_ = class164.aByte1829;
			i_23_ = class164.aByte1828;
		}
		byte i_24_ = 0;
		byte i_25_ = 0;
		if (i_20_ != -1) {
			Class164 class164 = class174.method2446(i_20_ & 0xffff, -1178597465);
			i_24_ = class164.aByte1829;
			i_25_ = class164.aByte1828;
			if (class164.aByte1802 != 0 || class164.aByte1803 != 0)
				aBool9056 = true;
		}
		if (i_22_ != i_24_ | i_23_ != i_25_) {
			if (aClass142Array9107 != null) {
				for (int i_26_ = 0; i_26_ < anInt9116; i_26_++) {
					Class142 class142 = aClass142Array9107[i_26_];
					Class132 class132 = aClass132Array9102[i_26_];
					class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
		}
	}

	void method8487() {
		if (aBool9089) {
			aBool9089 = false;
			if (aClass172Array9104 == null && aClass156Array9064 == null && aClass142Array9107 == null && !Class118.method1512(anInt9050, anInt9051)) {
				boolean bool = false;
				boolean bool_27_ = false;
				boolean bool_28_ = false;
				if (anIntArray9059 != null && !Class118.method1531(anInt9050, anInt9051)) {
					if (aClass130_9082 == null || aClass130_9082.anInterface15_1587 != null) {
						if (!aBool9092)
							method8488();
						bool = true;
					} else
						aBool9089 = true;
				}
				if (anIntArray9060 != null && !Class118.method1532(anInt9050, anInt9051)) {
					if (aClass130_9082 == null || aClass130_9082.anInterface15_1587 != null) {
						if (!aBool9092)
							method8488();
						bool_27_ = true;
					} else
						aBool9089 = true;
				}
				if (anIntArray9061 != null && !Class118.method1533(anInt9050, anInt9051)) {
					if (aClass130_9082 == null || aClass130_9082.anInterface15_1587 != null) {
						if (!aBool9092)
							method8488();
						bool_28_ = true;
					} else
						aBool9089 = true;
				}
				if (bool)
					anIntArray9059 = null;
				if (bool_27_)
					anIntArray9060 = null;
				if (bool_28_)
					anIntArray9061 = null;
			}
			if (aShortArray9103 != null && anIntArray9059 == null && anIntArray9060 == null && anIntArray9061 == null) {
				aShortArray9103 = null;
				anIntArray9068 = null;
			}
			if (aByteArray9100 != null && !Class118.method1534(anInt9050, anInt9051)) {
				if (aClass130_9106 != null) {
					if (aClass130_9106.anInterface15_1587 != null) {
						aShortArray9071 = null;
						aShortArray9066 = null;
						aShortArray9108 = null;
						aByteArray9100 = null;
					} else
						aBool9089 = true;
				} else if (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null) {
					aShortArray9071 = null;
					aShortArray9066 = null;
					aShortArray9108 = null;
					aByteArray9100 = null;
				} else
					aBool9089 = true;
			}
			if (aShortArray9074 != null && !Class118.method1548(anInt9050, anInt9051)) {
				if (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null)
					aShortArray9074 = null;
				else
					aBool9089 = true;
			}
			if (aByteArray9075 != null && !Class118.method1536(anInt9050, anInt9051)) {
				if (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null)
					aByteArray9075 = null;
				else
					aBool9089 = true;
			}
			if (aFloatArray9070 != null && !Class118.method1597(anInt9050, anInt9051)) {
				if (aClass130_9086 == null || aClass130_9086.anInterface15_1587 != null) {
					aFloatArray9062 = null;
					aFloatArray9070 = null;
				} else
					aBool9089 = true;
			}
			if (aShortArray9079 != null && !Class118.method1542(anInt9050, anInt9051)) {
				if (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null)
					aShortArray9079 = null;
				else
					aBool9089 = true;
			}
			if (aShortArray9076 != null && !Class118.method1587(anInt9050, anInt9051)) {
				if ((aClass121_9046 == null || aClass121_9046.anInterface17_1481 != null) && (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null)) {
					aShortArray9091 = null;
					aShortArray9055 = null;
					aShortArray9076 = null;
				} else
					aBool9089 = true;
			}
			if (anIntArrayArray9080 != null && !Class118.method1538(anInt9050, anInt9051)) {
				anIntArrayArray9080 = null;
				aShortArray9081 = null;
			}
			if (anIntArrayArray9109 != null && !Class118.method1539(anInt9050, anInt9051)) {
				anIntArrayArray9109 = null;
				aShortArray9063 = null;
			}
			if (anIntArrayArray9112 != null && !Class118.method1540(anInt9050, anInt9051))
				anIntArrayArray9112 = null;
			if (anIntArray9101 != null && (anInt9050 & 0x800) == 0 && (anInt9050 & 0x40000) == 0)
				anIntArray9101 = null;
		}
	}

	void method2544(int i, int[] is, int i_29_, int i_30_, int i_31_, int i_32_, boolean bool) {
		int i_33_ = is.length;
		if (i == 0) {
			i_29_ <<= 4;
			i_30_ <<= 4;
			i_31_ <<= 4;
			int i_34_ = 0;
			anInt9073 = 0;
			anInt9052 = 0;
			anInt9117 = 0;
			for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
				int i_36_ = is[i_35_];
				if (i_36_ < anIntArrayArray9109.length) {
					int[] is_37_ = anIntArrayArray9109[i_36_];
					for (int i_38_ = 0; i_38_ < is_37_.length; i_38_++) {
						int i_39_ = is_37_[i_38_];
						anInt9073 += anIntArray9059[i_39_];
						anInt9052 += anIntArray9060[i_39_];
						anInt9117 += anIntArray9061[i_39_];
						i_34_++;
					}
				}
			}
			if (i_34_ > 0) {
				anInt9073 = anInt9073 / i_34_ + i_29_;
				anInt9052 = anInt9052 / i_34_ + i_30_;
				anInt9117 = anInt9117 / i_34_ + i_31_;
			} else {
				anInt9073 = i_29_;
				anInt9052 = i_30_;
				anInt9117 = i_31_;
			}
		} else if (i == 1) {
			i_29_ <<= 4;
			i_30_ <<= 4;
			i_31_ <<= 4;
			for (int i_40_ = 0; i_40_ < i_33_; i_40_++) {
				int i_41_ = is[i_40_];
				if (i_41_ < anIntArrayArray9109.length) {
					int[] is_42_ = anIntArrayArray9109[i_41_];
					for (int i_43_ = 0; i_43_ < is_42_.length; i_43_++) {
						int i_44_ = is_42_[i_43_];
						anIntArray9059[i_44_] += i_29_;
						anIntArray9060[i_44_] += i_30_;
						anIntArray9061[i_44_] += i_31_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_45_ = 0; i_45_ < i_33_; i_45_++) {
				int i_46_ = is[i_45_];
				if (i_46_ < anIntArrayArray9109.length) {
					int[] is_47_ = anIntArrayArray9109[i_46_];
					if ((i_32_ & 0x1) == 0) {
						for (int i_48_ = 0; i_48_ < is_47_.length; i_48_++) {
							int i_49_ = is_47_[i_48_];
							anIntArray9059[i_49_] -= anInt9073;
							anIntArray9060[i_49_] -= anInt9052;
							anIntArray9061[i_49_] -= anInt9117;
							if (i_31_ != 0) {
								int i_50_ = Class447.anIntArray4906[i_31_];
								int i_51_ = Class447.anIntArray4921[i_31_];
								int i_52_ = ((anIntArray9060[i_49_] * i_50_ + anIntArray9059[i_49_] * i_51_ + 16383) >> 14);
								anIntArray9060[i_49_] = (anIntArray9060[i_49_] * i_51_ - anIntArray9059[i_49_] * i_50_ + 16383) >> 14;
								anIntArray9059[i_49_] = i_52_;
							}
							if (i_29_ != 0) {
								int i_53_ = Class447.anIntArray4906[i_29_];
								int i_54_ = Class447.anIntArray4921[i_29_];
								int i_55_ = ((anIntArray9060[i_49_] * i_54_ - anIntArray9061[i_49_] * i_53_ + 16383) >> 14);
								anIntArray9061[i_49_] = (anIntArray9060[i_49_] * i_53_ + anIntArray9061[i_49_] * i_54_ + 16383) >> 14;
								anIntArray9060[i_49_] = i_55_;
							}
							if (i_30_ != 0) {
								int i_56_ = Class447.anIntArray4906[i_30_];
								int i_57_ = Class447.anIntArray4921[i_30_];
								int i_58_ = ((anIntArray9061[i_49_] * i_56_ + anIntArray9059[i_49_] * i_57_ + 16383) >> 14);
								anIntArray9061[i_49_] = (anIntArray9061[i_49_] * i_57_ - anIntArray9059[i_49_] * i_56_ + 16383) >> 14;
								anIntArray9059[i_49_] = i_58_;
							}
							anIntArray9059[i_49_] += anInt9073;
							anIntArray9060[i_49_] += anInt9052;
							anIntArray9061[i_49_] += anInt9117;
						}
					} else {
						for (int i_59_ = 0; i_59_ < is_47_.length; i_59_++) {
							int i_60_ = is_47_[i_59_];
							anIntArray9059[i_60_] -= anInt9073;
							anIntArray9060[i_60_] -= anInt9052;
							anIntArray9061[i_60_] -= anInt9117;
							if (i_29_ != 0) {
								int i_61_ = Class447.anIntArray4906[i_29_];
								int i_62_ = Class447.anIntArray4921[i_29_];
								int i_63_ = ((anIntArray9060[i_60_] * i_62_ - anIntArray9061[i_60_] * i_61_ + 16383) >> 14);
								anIntArray9061[i_60_] = (anIntArray9060[i_60_] * i_61_ + anIntArray9061[i_60_] * i_62_ + 16383) >> 14;
								anIntArray9060[i_60_] = i_63_;
							}
							if (i_31_ != 0) {
								int i_64_ = Class447.anIntArray4906[i_31_];
								int i_65_ = Class447.anIntArray4921[i_31_];
								int i_66_ = ((anIntArray9060[i_60_] * i_64_ + anIntArray9059[i_60_] * i_65_ + 16383) >> 14);
								anIntArray9060[i_60_] = (anIntArray9060[i_60_] * i_65_ - anIntArray9059[i_60_] * i_64_ + 16383) >> 14;
								anIntArray9059[i_60_] = i_66_;
							}
							if (i_30_ != 0) {
								int i_67_ = Class447.anIntArray4906[i_30_];
								int i_68_ = Class447.anIntArray4921[i_30_];
								int i_69_ = ((anIntArray9061[i_60_] * i_67_ + anIntArray9059[i_60_] * i_68_ + 16383) >> 14);
								anIntArray9061[i_60_] = (anIntArray9061[i_60_] * i_68_ - anIntArray9059[i_60_] * i_67_ + 16383) >> 14;
								anIntArray9059[i_60_] = i_69_;
							}
							anIntArray9059[i_60_] += anInt9073;
							anIntArray9060[i_60_] += anInt9052;
							anIntArray9061[i_60_] += anInt9117;
						}
					}
				}
			}
			if (bool) {
				for (int i_70_ = 0; i_70_ < i_33_; i_70_++) {
					int i_71_ = is[i_70_];
					if (i_71_ < anIntArrayArray9109.length) {
						int[] is_72_ = anIntArrayArray9109[i_71_];
						for (int i_73_ = 0; i_73_ < is_72_.length; i_73_++) {
							int i_74_ = is_72_[i_73_];
							int i_75_ = anIntArray9068[i_74_];
							int i_76_ = anIntArray9068[i_74_ + 1];
							for (int i_77_ = i_75_; i_77_ < i_76_ && aShortArray9103[i_77_] != 0; i_77_++) {
								int i_78_ = (aShortArray9103[i_77_] & 0xffff) - 1;
								if (i_31_ != 0) {
									int i_79_ = Class447.anIntArray4906[i_31_];
									int i_80_ = Class447.anIntArray4921[i_31_];
									int i_81_ = ((aShortArray9066[i_78_] * i_79_ + aShortArray9108[i_78_] * i_80_ + 16383) >> 14);
									aShortArray9066[i_78_] = (short) (((aShortArray9066[i_78_] * i_80_) - (aShortArray9108[i_78_] * i_79_) + 16383) >> 14);
									aShortArray9108[i_78_] = (short) i_81_;
								}
								if (i_29_ != 0) {
									int i_82_ = Class447.anIntArray4906[i_29_];
									int i_83_ = Class447.anIntArray4921[i_29_];
									int i_84_ = ((aShortArray9066[i_78_] * i_83_ - aShortArray9071[i_78_] * i_82_ + 16383) >> 14);
									aShortArray9071[i_78_] = (short) (((aShortArray9066[i_78_] * i_82_) + (aShortArray9071[i_78_] * i_83_) + 16383) >> 14);
									aShortArray9066[i_78_] = (short) i_84_;
								}
								if (i_30_ != 0) {
									int i_85_ = Class447.anIntArray4906[i_30_];
									int i_86_ = Class447.anIntArray4921[i_30_];
									int i_87_ = ((aShortArray9071[i_78_] * i_85_ + aShortArray9108[i_78_] * i_86_ + 16383) >> 14);
									aShortArray9071[i_78_] = (short) (((aShortArray9071[i_78_] * i_86_) - (aShortArray9108[i_78_] * i_85_) + 16383) >> 14);
									aShortArray9108[i_78_] = (short) i_87_;
								}
							}
						}
					}
				}
				if (aClass130_9106 == null && aClass130_9065 != null)
					aClass130_9065.anInterface15_1587 = null;
				if (aClass130_9106 != null)
					aClass130_9106.anInterface15_1587 = null;
			}
		} else if (i == 3) {
			for (int i_88_ = 0; i_88_ < i_33_; i_88_++) {
				int i_89_ = is[i_88_];
				if (i_89_ < anIntArrayArray9109.length) {
					int[] is_90_ = anIntArrayArray9109[i_89_];
					for (int i_91_ = 0; i_91_ < is_90_.length; i_91_++) {
						int i_92_ = is_90_[i_91_];
						anIntArray9059[i_92_] -= anInt9073;
						anIntArray9060[i_92_] -= anInt9052;
						anIntArray9061[i_92_] -= anInt9117;
						anIntArray9059[i_92_] = anIntArray9059[i_92_] * i_29_ >> 7;
						anIntArray9060[i_92_] = anIntArray9060[i_92_] * i_30_ >> 7;
						anIntArray9061[i_92_] = anIntArray9061[i_92_] * i_31_ >> 7;
						anIntArray9059[i_92_] += anInt9073;
						anIntArray9060[i_92_] += anInt9052;
						anIntArray9061[i_92_] += anInt9117;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9080 != null) {
				for (int i_93_ = 0; i_93_ < i_33_; i_93_++) {
					int i_94_ = is[i_93_];
					if (i_94_ < anIntArrayArray9080.length) {
						int[] is_95_ = anIntArrayArray9080[i_94_];
						for (int i_96_ = 0; i_96_ < is_95_.length; i_96_++) {
							int i_97_ = is_95_[i_96_];
							int i_98_ = (aByteArray9075[i_97_] & 0xff) + i_29_ * 8;
							if (i_98_ < 0)
								i_98_ = 0;
							else if (i_98_ > 255)
								i_98_ = 255;
							aByteArray9075[i_97_] = (byte) i_98_;
						}
						if (is_95_.length > 0 && aClass130_9065 != null)
							aClass130_9065.anInterface15_1587 = null;
					}
				}
				if (aClass142Array9107 != null) {
					for (int i_99_ = 0; i_99_ < anInt9116; i_99_++) {
						Class142 class142 = aClass142Array9107[i_99_];
						Class132 class132 = aClass132Array9102[i_99_];
						class132.anInt1603 = (class132.anInt1603 & 0xffffff | 255 - (aByteArray9075[class142.anInt1663] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9080 != null) {
				for (int i_100_ = 0; i_100_ < i_33_; i_100_++) {
					int i_101_ = is[i_100_];
					if (i_101_ < anIntArrayArray9080.length) {
						int[] is_102_ = anIntArrayArray9080[i_101_];
						for (int i_103_ = 0; i_103_ < is_102_.length; i_103_++) {
							int i_104_ = is_102_[i_103_];
							int i_105_ = aShortArray9074[i_104_] & 0xffff;
							int i_106_ = i_105_ >> 10 & 0x3f;
							int i_107_ = i_105_ >> 7 & 0x7;
							int i_108_ = i_105_ & 0x7f;
							i_106_ = i_106_ + i_29_ & 0x3f;
							i_107_ += i_30_ / 4;
							if (i_107_ < 0)
								i_107_ = 0;
							else if (i_107_ > 7)
								i_107_ = 7;
							i_108_ += i_31_;
							if (i_108_ < 0)
								i_108_ = 0;
							else if (i_108_ > 127)
								i_108_ = 127;
							aShortArray9074[i_104_] = (short) (i_106_ << 10 | i_107_ << 7 | i_108_);
						}
						if (is_102_.length > 0 && aClass130_9065 != null)
							aClass130_9065.anInterface15_1587 = null;
					}
				}
				if (aClass142Array9107 != null) {
					for (int i_109_ = 0; i_109_ < anInt9116; i_109_++) {
						Class142 class142 = aClass142Array9107[i_109_];
						Class132 class132 = aClass132Array9102[i_109_];
						class132.anInt1603 = (class132.anInt1603 & ~0xffffff | (Class639.anIntArray8309[(aShortArray9074[class142.anInt1663] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9112 != null) {
				for (int i_110_ = 0; i_110_ < i_33_; i_110_++) {
					int i_111_ = is[i_110_];
					if (i_111_ < anIntArrayArray9112.length) {
						int[] is_112_ = anIntArrayArray9112[i_111_];
						for (int i_113_ = 0; i_113_ < is_112_.length; i_113_++) {
							Class132 class132 = aClass132Array9102[is_112_[i_113_]];
							class132.anInt1606 += i_29_;
							class132.anInt1607 += i_30_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9112 != null) {
				for (int i_114_ = 0; i_114_ < i_33_; i_114_++) {
					int i_115_ = is[i_114_];
					if (i_115_ < anIntArrayArray9112.length) {
						int[] is_116_ = anIntArrayArray9112[i_115_];
						for (int i_117_ = 0; i_117_ < is_116_.length; i_117_++) {
							Class132 class132 = aClass132Array9102[is_116_[i_117_]];
							class132.anInt1608 = class132.anInt1608 * i_29_ >> 7;
							class132.anInt1604 = class132.anInt1604 * i_30_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9112 != null) {
				for (int i_118_ = 0; i_118_ < i_33_; i_118_++) {
					int i_119_ = is[i_118_];
					if (i_119_ < anIntArrayArray9112.length) {
						int[] is_120_ = anIntArrayArray9112[i_119_];
						for (int i_121_ = 0; i_121_ < is_120_.length; i_121_++) {
							Class132 class132 = aClass132Array9102[is_120_[i_121_]];
							class132.anInt1605 = class132.anInt1605 + i_29_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2529(int i) {
		int i_122_ = Class447.anIntArray4906[i];
		int i_123_ = Class447.anIntArray4921[i];
		for (int i_124_ = 0; i_124_ < anInt9058; i_124_++) {
			int i_125_ = ((anIntArray9060[i_124_] * i_122_ + anIntArray9059[i_124_] * i_123_) >> 14);
			anIntArray9060[i_124_] = (anIntArray9060[i_124_] * i_123_ - anIntArray9059[i_124_] * i_122_) >> 14;
			anIntArray9059[i_124_] = i_125_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2470(int i) {
		int i_126_ = Class447.anIntArray4906[i];
		int i_127_ = Class447.anIntArray4921[i];
		for (int i_128_ = 0; i_128_ < anInt9058; i_128_++) {
			int i_129_ = ((anIntArray9060[i_128_] * i_126_ + anIntArray9059[i_128_] * i_127_) >> 14);
			anIntArray9060[i_128_] = (anIntArray9060[i_128_] * i_127_ - anIntArray9059[i_128_] * i_126_) >> 14;
			anIntArray9059[i_128_] = i_129_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2521(int i) {
		int i_130_ = Class447.anIntArray4906[i];
		int i_131_ = Class447.anIntArray4921[i];
		for (int i_132_ = 0; i_132_ < anInt9058; i_132_++) {
			int i_133_ = ((anIntArray9061[i_132_] * i_130_ + anIntArray9059[i_132_] * i_131_) >> 14);
			anIntArray9061[i_132_] = (anIntArray9061[i_132_] * i_131_ - anIntArray9059[i_132_] * i_130_) >> 14;
			anIntArray9059[i_132_] = i_133_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public boolean method2604() {
		if (aShortArray9079 == null)
			return true;
		for (int i = 0; i < aShortArray9079.length; i++) {
			if (aShortArray9079[i] != -1) {
				Class164 class164 = (aClass167_Sub2_9049.aClass174_1852.method2446(aShortArray9079[i] & 0xffff, -2066159278));
				if (class164.aBool1814 && !aClass167_Sub2_9049.aClass149_9293.method1819(Class599.aClass599_7843, class164, -1))
					return false;
			}
		}
		return true;
	}

	public void method2475(int i, int i_134_, Class160 class160, Class160 class160_135_, int i_136_, int i_137_, int i_138_) {
		if (!aBool9092)
			method8488();
		int i_139_ = i_136_ + aShort9095;
		int i_140_ = i_136_ + aShort9096;
		int i_141_ = i_138_ + aShort9097;
		int i_142_ = i_138_ + aShort9098;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_139_ >= 0 && ((i_140_ + class160.anInt1767 * -1504778739 >> class160.anInt1768 * 2064238369) < class160.anInt1766 * 1718142487) && i_141_ >= 0 && ((i_142_ + class160.anInt1767 * -1504778739 >> class160.anInt1768 * 2064238369) < class160.anInt1769 * -889224915))) {
			if (i == 4 || i == 5) {
				if (class160_135_ == null || (i_139_ < 0 || ((i_140_ + class160_135_.anInt1767 * -1504778739 >> class160_135_.anInt1768 * 2064238369) >= class160_135_.anInt1766 * 1718142487) || i_141_ < 0 || ((i_142_ + class160_135_.anInt1767 * -1504778739 >> class160_135_.anInt1768 * 2064238369) >= class160_135_.anInt1769 * -889224915)))
					return;
			} else {
				i_139_ >>= class160.anInt1768 * 2064238369;
				i_140_ = (i_140_ + (class160.anInt1767 * -1504778739 - 1) >> class160.anInt1768 * 2064238369);
				i_141_ >>= class160.anInt1768 * 2064238369;
				i_142_ = (i_142_ + (class160.anInt1767 * -1504778739 - 1) >> class160.anInt1768 * 2064238369);
				if (class160.method1927(i_139_, i_141_, -2106279247) == i_137_ && (class160.method1927(i_140_, i_141_, 1969264671) == i_137_) && class160.method1927(i_139_, i_142_, 719813700) == i_137_ && (class160.method1927(i_140_, i_142_, -1437086832) == i_137_))
					return;
			}
			if (i == 1) {
				for (int i_143_ = 0; i_143_ < anInt9058; i_143_++)
					anIntArray9060[i_143_] = (anIntArray9060[i_143_] + class160.method1926((anIntArray9059[i_143_] + i_136_), (anIntArray9061[i_143_] + i_138_), (byte) 0) - i_137_);
			} else if (i == 2) {
				int i_144_ = aShort9093;
				if (i_144_ == 0)
					return;
				for (int i_145_ = 0; i_145_ < anInt9058; i_145_++) {
					int i_146_ = (anIntArray9060[i_145_] << 16) / i_144_;
					if (i_146_ < i_134_)
						anIntArray9060[i_145_] = (anIntArray9060[i_145_] + (class160.method1926((anIntArray9059[i_145_] + i_136_), (anIntArray9061[i_145_] + i_138_), (byte) 0) - i_137_) * (i_134_ - i_146_) / i_134_);
				}
			} else if (i == 3) {
				int i_147_ = (i_134_ & 0xff) * 16;
				int i_148_ = (i_134_ >> 8 & 0xff) * 16;
				int i_149_ = (i_134_ >> 16 & 0xff) << 6;
				int i_150_ = (i_134_ >> 24 & 0xff) << 6;
				if (i_136_ - (i_147_ >> 1) < 0 || ((i_136_ + (i_147_ >> 1) + class160.anInt1767 * -1504778739) >= (class160.anInt1766 * 1718142487 << class160.anInt1768 * 2064238369)) || i_138_ - (i_148_ >> 1) < 0 || ((i_138_ + (i_148_ >> 1) + class160.anInt1767 * -1504778739) >= (class160.anInt1769 * -889224915 << class160.anInt1768 * 2064238369)))
					return;
				method2476(class160, i_136_, i_137_, i_138_, i_147_, i_148_, i_149_, i_150_);
			} else if (i == 4) {
				int i_151_ = aShort9094 - aShort9093;
				for (int i_152_ = 0; i_152_ < anInt9058; i_152_++)
					anIntArray9060[i_152_] = (anIntArray9060[i_152_] + (class160_135_.method1926((anIntArray9059[i_152_] + i_136_), (anIntArray9061[i_152_] + i_138_), (byte) 0) - i_137_) + i_151_);
			} else if (i == 5) {
				int i_153_ = aShort9094 - aShort9093;
				for (int i_154_ = 0; i_154_ < anInt9058; i_154_++) {
					int i_155_ = anIntArray9059[i_154_] + i_136_;
					int i_156_ = anIntArray9061[i_154_] + i_138_;
					int i_157_ = class160.method1926(i_155_, i_156_, (byte) 0);
					int i_158_ = class160_135_.method1926(i_155_, i_156_, (byte) 0);
					int i_159_ = i_157_ - i_158_ - i_134_;
					anIntArray9060[i_154_] = ((anIntArray9060[i_154_] << 8) / i_153_ * i_159_ >> 8) - (i_137_ - i_157_);
				}
			}
			if (aClass130_9082 != null)
				aClass130_9082.anInterface15_1587 = null;
			aBool9092 = false;
		}
	}

	void method8488() {
		int i = 32767;
		int i_160_ = 32767;
		int i_161_ = 32767;
		int i_162_ = -32768;
		int i_163_ = -32768;
		int i_164_ = -32768;
		int i_165_ = 0;
		int i_166_ = 0;
		for (int i_167_ = 0; i_167_ < anInt9058; i_167_++) {
			int i_168_ = anIntArray9059[i_167_];
			int i_169_ = anIntArray9060[i_167_];
			int i_170_ = anIntArray9061[i_167_];
			if (i_168_ < i)
				i = i_168_;
			if (i_168_ > i_162_)
				i_162_ = i_168_;
			if (i_169_ < i_160_)
				i_160_ = i_169_;
			if (i_169_ > i_163_)
				i_163_ = i_169_;
			if (i_170_ < i_161_)
				i_161_ = i_170_;
			if (i_170_ > i_164_)
				i_164_ = i_170_;
			int i_171_ = i_168_ * i_168_ + i_170_ * i_170_;
			if (i_171_ > i_165_)
				i_165_ = i_171_;
			i_171_ = i_168_ * i_168_ + i_170_ * i_170_ + i_169_ * i_169_;
			if (i_171_ > i_166_)
				i_166_ = i_171_;
		}
		aShort9095 = (short) i;
		aShort9096 = (short) i_162_;
		aShort9093 = (short) i_160_;
		aShort9094 = (short) i_163_;
		aShort9097 = (short) i_161_;
		aShort9098 = (short) i_164_;
		anInt9067 = (int) (Math.sqrt((double) i_165_) + 0.99);
		anInt9090 = (int) (Math.sqrt((double) i_166_) + 0.99);
		aBool9092 = true;
	}

	public void method2501() {
		if (!aBool9099) {
			if (!aBool9092)
				method8488();
			aShort9083 = aShort9093;
			aBool9099 = true;
		}
	}

	Class177_Sub1(Class167_Sub2 class167_sub2) {
		aBool9056 = false;
		anInt9057 = 0;
		anInt9058 = 0;
		anInt9077 = 0;
		anInt9118 = 0;
		anInt9072 = 0;
		aBool9089 = true;
		aBool9092 = false;
		aBool9099 = false;
		aClass167_Sub2_9049 = class167_sub2;
		aClass130_9082 = new Class130(null, 5126, 3, 0);
		aClass130_9086 = new Class130(null, 5126, 2, 0);
		aClass130_9106 = new Class130(null, 5126, 3, 0);
		aClass130_9065 = new Class130(null, 5121, 4, 0);
		aClass121_9046 = new Class121();
	}

	public int method2579() {
		if (!aBool9092)
			method8488();
		return anInt9090;
	}

	public int method2563() {
		if (!aBool9092)
			method8488();
		return aShort9095;
	}

	public int method2570() {
		if (!aBool9092)
			method8488();
		return aShort9096;
	}

	static final int method8489(int i, int i_172_) {
		i_172_ = i_172_ * (i & 0x7f) >> 7;
		if (i_172_ < 2)
			i_172_ = 2;
		else if (i_172_ > 126)
			i_172_ = 126;
		return (i & 0xff80) + i_172_;
	}

	void method8490(boolean bool) {
		if ((aClass167_Sub2_9049.aClass536_Sub33_Sub1_9136.buffer).length < anInt9072 * 6)
			aClass167_Sub2_9049.aClass536_Sub33_Sub1_9136 = new Class536_Sub33_Sub1((anInt9072 + 100) * 6);
		else
			aClass167_Sub2_9049.aClass536_Sub33_Sub1_9136.off = 0;
		Class536_Sub33_Sub1 class536_sub33_sub1 = aClass167_Sub2_9049.aClass536_Sub33_Sub1_9136;
		if (aClass167_Sub2_9049.aBool9284) {
			for (int i = 0; i < anInt9072; i++) {
				class536_sub33_sub1.writeShort(aShortArray9076[i], -1778059594);
				class536_sub33_sub1.writeShort(aShortArray9055[i], -1778059594);
				class536_sub33_sub1.writeShort(aShortArray9091[i], -1778059594);
			}
		} else {
			for (int i = 0; i < anInt9072; i++) {
				class536_sub33_sub1.writeShortLE(aShortArray9076[i], 1866535713);
				class536_sub33_sub1.writeShortLE(aShortArray9055[i], 378397297);
				class536_sub33_sub1.writeShortLE(aShortArray9091[i], -1636909901);
			}
		}
		if (class536_sub33_sub1.off * -810172525 != 0) {
			if (bool) {
				if (anInterface17_9087 == null)
					anInterface17_9087 = (aClass167_Sub2_9049.method8543(5123, class536_sub33_sub1.buffer, class536_sub33_sub1.off * -810172525, true));
				else
					anInterface17_9087.method91(5123, (class536_sub33_sub1.buffer), (class536_sub33_sub1.off * -810172525));
				aClass121_9046.anInterface17_1481 = anInterface17_9087;
			} else
				aClass121_9046.anInterface17_1481 = (aClass167_Sub2_9049.method8543(5123, class536_sub33_sub1.buffer, class536_sub33_sub1.off * -810172525, false));
			if (!bool)
				aBool9089 = true;
		}
	}

	public int method2498() {
		if (!aBool9092)
			method8488();
		return aShort9097;
	}

	public void method2474(int i, int i_173_, int i_174_) {
		for (int i_175_ = 0; i_175_ < anInt9058; i_175_++) {
			if (i != 128)
				anIntArray9059[i_175_] = anIntArray9059[i_175_] * i >> 7;
			if (i_173_ != 128)
				anIntArray9060[i_175_] = anIntArray9060[i_175_] * i_173_ >> 7;
			if (i_174_ != 128)
				anIntArray9061[i_175_] = anIntArray9061[i_175_] * i_174_ >> 7;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public int method2493() {
		if (!aBool9092)
			method8488();
		return anInt9067;
	}

	public void method2469(Class177 class177, int i, int i_176_, int i_177_, boolean bool) {
		Class177_Sub1 class177_sub1_178_ = (Class177_Sub1) class177;
		if (anInt9118 != 0 && class177_sub1_178_.anInt9118 != 0) {
			int i_179_ = class177_sub1_178_.anInt9058;
			int[] is = class177_sub1_178_.anIntArray9059;
			int[] is_180_ = class177_sub1_178_.anIntArray9060;
			int[] is_181_ = class177_sub1_178_.anIntArray9061;
			short[] is_182_ = class177_sub1_178_.aShortArray9108;
			short[] is_183_ = class177_sub1_178_.aShortArray9066;
			short[] is_184_ = class177_sub1_178_.aShortArray9071;
			byte[] is_185_ = class177_sub1_178_.aByteArray9100;
			short[] is_186_;
			short[] is_187_;
			short[] is_188_;
			byte[] is_189_;
			if (aClass162_9069 != null) {
				is_186_ = aClass162_9069.aShortArray1774;
				is_187_ = aClass162_9069.aShortArray1771;
				is_188_ = aClass162_9069.aShortArray1773;
				is_189_ = aClass162_9069.aByteArray1772;
			} else {
				is_186_ = null;
				is_187_ = null;
				is_188_ = null;
				is_189_ = null;
			}
			short[] is_190_;
			short[] is_191_;
			short[] is_192_;
			byte[] is_193_;
			if (class177_sub1_178_.aClass162_9069 != null) {
				is_190_ = class177_sub1_178_.aClass162_9069.aShortArray1774;
				is_191_ = class177_sub1_178_.aClass162_9069.aShortArray1771;
				is_192_ = class177_sub1_178_.aClass162_9069.aShortArray1773;
				is_193_ = class177_sub1_178_.aClass162_9069.aByteArray1772;
			} else {
				is_190_ = null;
				is_191_ = null;
				is_192_ = null;
				is_193_ = null;
			}
			int[] is_194_ = class177_sub1_178_.anIntArray9068;
			short[] is_195_ = class177_sub1_178_.aShortArray9103;
			if (!class177_sub1_178_.aBool9092)
				class177_sub1_178_.method8488();
			int i_196_ = class177_sub1_178_.aShort9093;
			int i_197_ = class177_sub1_178_.aShort9094;
			int i_198_ = class177_sub1_178_.aShort9095;
			int i_199_ = class177_sub1_178_.aShort9096;
			int i_200_ = class177_sub1_178_.aShort9097;
			int i_201_ = class177_sub1_178_.aShort9098;
			for (int i_202_ = 0; i_202_ < anInt9058; i_202_++) {
				int i_203_ = anIntArray9060[i_202_] - i_176_;
				if (i_203_ >= i_196_ && i_203_ <= i_197_) {
					int i_204_ = anIntArray9059[i_202_] - i;
					if (i_204_ >= i_198_ && i_204_ <= i_199_) {
						int i_205_ = anIntArray9061[i_202_] - i_177_;
						if (i_205_ >= i_200_ && i_205_ <= i_201_) {
							int i_206_ = -1;
							int i_207_ = anIntArray9068[i_202_];
							int i_208_ = anIntArray9068[i_202_ + 1];
							for (int i_209_ = i_207_; (i_209_ < i_208_ && aShortArray9103[i_209_] != 0); i_209_++) {
								i_206_ = (aShortArray9103[i_209_] & 0xffff) - 1;
								if (aByteArray9100[i_206_] != 0)
									break;
							}
							if (i_206_ != -1) {
								for (int i_210_ = 0; i_210_ < i_179_; i_210_++) {
									if (i_204_ == is[i_210_] && i_205_ == is_181_[i_210_] && i_203_ == is_180_[i_210_]) {
										int i_211_ = -1;
										i_207_ = is_194_[i_210_];
										i_208_ = is_194_[i_210_ + 1];
										for (int i_212_ = i_207_; (i_212_ < i_208_ && is_195_[i_212_] != 0); i_212_++) {
											i_211_ = (is_195_[i_212_] & 0xffff) - 1;
											if (is_185_[i_211_] != 0)
												break;
										}
										if (i_211_ != -1) {
											if (is_186_ == null) {
												aClass162_9069 = new Class162();
												is_186_ = aClass162_9069.aShortArray1774 = (Class483.method5839(aShortArray9108, -1196562389));
												is_187_ = aClass162_9069.aShortArray1771 = (Class483.method5839(aShortArray9066, -781840853));
												is_188_ = aClass162_9069.aShortArray1773 = (Class483.method5839(aShortArray9071, -1470310186));
												is_189_ = aClass162_9069.aByteArray1772 = (Class536_Sub2.method9364(aByteArray9100, (byte) 22));
											}
											if (is_190_ == null) {
												Class162 class162 = (class177_sub1_178_.aClass162_9069 = new Class162());
												is_190_ = class162.aShortArray1774 = (Class483.method5839(is_182_, -2005117847));
												is_191_ = class162.aShortArray1771 = (Class483.method5839(is_183_, -1396470118));
												is_192_ = class162.aShortArray1773 = (Class483.method5839(is_184_, -1309722916));
												is_193_ = class162.aByteArray1772 = (Class536_Sub2.method9364(is_185_, (byte) 22));
											}
											short i_213_ = aShortArray9108[i_206_];
											short i_214_ = aShortArray9066[i_206_];
											short i_215_ = aShortArray9071[i_206_];
											byte i_216_ = aByteArray9100[i_206_];
											i_207_ = is_194_[i_210_];
											i_208_ = is_194_[i_210_ + 1];
											for (int i_217_ = i_207_; i_217_ < i_208_; i_217_++) {
												int i_218_ = is_195_[i_217_] - 1;
												if (i_218_ == -1)
													break;
												if (is_193_[i_218_] != 0) {
													is_190_[i_218_] += i_213_;
													is_191_[i_218_] += i_214_;
													is_192_[i_218_] += i_215_;
													is_193_[i_218_] += i_216_;
												}
											}
											i_213_ = is_182_[i_211_];
											i_214_ = is_183_[i_211_];
											i_215_ = is_184_[i_211_];
											i_216_ = is_185_[i_211_];
											i_207_ = anIntArray9068[i_202_];
											i_208_ = anIntArray9068[i_202_ + 1];
											for (int i_219_ = i_207_; (i_219_ < i_208_ && (aShortArray9103[i_219_] != 0)); i_219_++) {
												int i_220_ = ((aShortArray9103[i_219_] & 0xffff) - 1);
												if (is_189_[i_220_] != 0) {
													is_186_[i_220_] += i_213_;
													is_187_[i_220_] += i_214_;
													is_188_[i_220_] += i_215_;
													is_189_[i_220_] += i_216_;
												}
											}
											if (aClass130_9106 == null && aClass130_9065 != null)
												aClass130_9065.anInterface15_1587 = null;
											if (aClass130_9106 != null)
												aClass130_9106.anInterface15_1587 = null;
											if ((class177_sub1_178_.aClass130_9106) == null && (class177_sub1_178_.aClass130_9065) != null)
												class177_sub1_178_.aClass130_9065.anInterface15_1587 = null;
											if ((class177_sub1_178_.aClass130_9106) != null)
												class177_sub1_178_.aClass130_9106.anInterface15_1587 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2502(int i) {
		aShort9053 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public int method2528() {
		if (!aBool9092)
			method8488();
		return aShort9095;
	}

	public int method2589() {
		return aShort9053;
	}

	public int method2505() {
		return aShort9054;
	}

	public Class172[] method2514() {
		return aClass172Array9104;
	}

	public void method2507(short i, short i_221_) {
		for (int i_222_ = 0; i_222_ < anInt9118; i_222_++) {
			if (aShortArray9074[i_222_] == i)
				aShortArray9074[i_222_] = i_221_;
		}
		if (aClass142Array9107 != null) {
			for (int i_223_ = 0; i_223_ < anInt9116; i_223_++) {
				Class142 class142 = aClass142Array9107[i_223_];
				Class132 class132 = aClass132Array9102[i_223_];
				class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public int method2581() {
		if (!aBool9092)
			method8488();
		return aShort9098;
	}

	public void method2624(int i) {
		int i_224_ = Class447.anIntArray4906[i];
		int i_225_ = Class447.anIntArray4921[i];
		for (int i_226_ = 0; i_226_ < anInt9058; i_226_++) {
			int i_227_ = ((anIntArray9060[i_226_] * i_225_ - anIntArray9061[i_226_] * i_224_) >> 14);
			anIntArray9061[i_226_] = (anIntArray9060[i_226_] * i_224_ + anIntArray9061[i_226_] * i_225_) >> 14;
			anIntArray9060[i_226_] = i_227_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2510(int i, int i_228_, int i_229_, int i_230_) {
		for (int i_231_ = 0; i_231_ < anInt9118; i_231_++) {
			int i_232_ = aShortArray9074[i_231_] & 0xffff;
			int i_233_ = i_232_ >> 10 & 0x3f;
			int i_234_ = i_232_ >> 7 & 0x7;
			int i_235_ = i_232_ & 0x7f;
			if (i != -1)
				i_233_ += (i - i_233_) * i_230_ >> 7;
			if (i_228_ != -1)
				i_234_ += (i_228_ - i_234_) * i_230_ >> 7;
			if (i_229_ != -1)
				i_235_ += (i_229_ - i_235_) * i_230_ >> 7;
			aShortArray9074[i_231_] = (short) (i_233_ << 10 | i_234_ << 7 | i_235_);
		}
		if (aClass142Array9107 != null) {
			for (int i_236_ = 0; i_236_ < anInt9116; i_236_++) {
				Class142 class142 = aClass142Array9107[i_236_];
				Class132 class132 = aClass132Array9102[i_236_];
				class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public boolean method2480() {
		if (aShortArray9079 == null)
			return true;
		for (int i = 0; i < aShortArray9079.length; i++) {
			if (aShortArray9079[i] != -1) {
				Class164 class164 = aClass167_Sub2_9049.aClass174_1852.method2446(aShortArray9079[i] & 0xffff, -280885139);
				if (class164.aBool1814 && !aClass167_Sub2_9049.aClass149_9293.method1819(Class599.aClass599_7843, class164, -1))
					return false;
			}
		}
		return true;
	}

	public boolean method2511() {
		return aBool9084;
	}

	public void method2532(int i, int i_237_, int i_238_) {
		for (int i_239_ = 0; i_239_ < anInt9058; i_239_++) {
			if (i != 128)
				anIntArray9059[i_239_] = anIntArray9059[i_239_] * i >> 7;
			if (i_237_ != 128)
				anIntArray9060[i_239_] = anIntArray9060[i_239_] * i_237_ >> 7;
			if (i_238_ != 128)
				anIntArray9061[i_239_] = anIntArray9061[i_239_] * i_238_ >> 7;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	void method2477() {
		/* empty */
	}

	void method2478() {
		/* empty */
	}

	boolean method2485() {
		if (anIntArrayArray9109 == null)
			return false;
		for (int i = 0; i < anInt9057; i++) {
			anIntArray9059[i] <<= 4;
			anIntArray9060[i] <<= 4;
			anIntArray9061[i] <<= 4;
		}
		anInt9073 = 0;
		anInt9052 = 0;
		anInt9117 = 0;
		return true;
	}

	public int method2615() {
		if (!aBool9092)
			method8488();
		return aShort9094;
	}

	public Class177 method2617(byte i, int i_240_, boolean bool) {
		boolean bool_241_ = false;
		Class177_Sub1 class177_sub1_242_;
		Class177_Sub1 class177_sub1_243_;
		if (i > 0 && i <= 8) {
			class177_sub1_243_ = aClass167_Sub2_9049.aClass177_Sub1Array9177[i - 1];
			class177_sub1_242_ = aClass167_Sub2_9049.aClass177_Sub1Array9312[i - 1];
			bool_241_ = true;
		} else
			class177_sub1_242_ = class177_sub1_243_ = new Class177_Sub1(aClass167_Sub2_9049);
		return method8497(class177_sub1_242_, class177_sub1_243_, i_240_, bool_241_, bool);
	}

	void method2486(int i, int[] is, int i_244_, int i_245_, int i_246_, int i_247_, boolean bool) {
		int i_248_ = is.length;
		if (i == 0) {
			i_244_ <<= 4;
			i_245_ <<= 4;
			i_246_ <<= 4;
			int i_249_ = 0;
			anInt9073 = 0;
			anInt9052 = 0;
			anInt9117 = 0;
			for (int i_250_ = 0; i_250_ < i_248_; i_250_++) {
				int i_251_ = is[i_250_];
				if (i_251_ < anIntArrayArray9109.length) {
					int[] is_252_ = anIntArrayArray9109[i_251_];
					for (int i_253_ = 0; i_253_ < is_252_.length; i_253_++) {
						int i_254_ = is_252_[i_253_];
						anInt9073 += anIntArray9059[i_254_];
						anInt9052 += anIntArray9060[i_254_];
						anInt9117 += anIntArray9061[i_254_];
						i_249_++;
					}
				}
			}
			if (i_249_ > 0) {
				anInt9073 = anInt9073 / i_249_ + i_244_;
				anInt9052 = anInt9052 / i_249_ + i_245_;
				anInt9117 = anInt9117 / i_249_ + i_246_;
			} else {
				anInt9073 = i_244_;
				anInt9052 = i_245_;
				anInt9117 = i_246_;
			}
		} else if (i == 1) {
			i_244_ <<= 4;
			i_245_ <<= 4;
			i_246_ <<= 4;
			for (int i_255_ = 0; i_255_ < i_248_; i_255_++) {
				int i_256_ = is[i_255_];
				if (i_256_ < anIntArrayArray9109.length) {
					int[] is_257_ = anIntArrayArray9109[i_256_];
					for (int i_258_ = 0; i_258_ < is_257_.length; i_258_++) {
						int i_259_ = is_257_[i_258_];
						anIntArray9059[i_259_] += i_244_;
						anIntArray9060[i_259_] += i_245_;
						anIntArray9061[i_259_] += i_246_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_260_ = 0; i_260_ < i_248_; i_260_++) {
				int i_261_ = is[i_260_];
				if (i_261_ < anIntArrayArray9109.length) {
					int[] is_262_ = anIntArrayArray9109[i_261_];
					if ((i_247_ & 0x1) == 0) {
						for (int i_263_ = 0; i_263_ < is_262_.length; i_263_++) {
							int i_264_ = is_262_[i_263_];
							anIntArray9059[i_264_] -= anInt9073;
							anIntArray9060[i_264_] -= anInt9052;
							anIntArray9061[i_264_] -= anInt9117;
							if (i_246_ != 0) {
								int i_265_ = Class447.anIntArray4906[i_246_];
								int i_266_ = Class447.anIntArray4921[i_246_];
								int i_267_ = (anIntArray9060[i_264_] * i_265_ + anIntArray9059[i_264_] * i_266_ + 16383) >> 14;
								anIntArray9060[i_264_] = (anIntArray9060[i_264_] * i_266_ - anIntArray9059[i_264_] * i_265_ + 16383) >> 14;
								anIntArray9059[i_264_] = i_267_;
							}
							if (i_244_ != 0) {
								int i_268_ = Class447.anIntArray4906[i_244_];
								int i_269_ = Class447.anIntArray4921[i_244_];
								int i_270_ = (anIntArray9060[i_264_] * i_269_ - anIntArray9061[i_264_] * i_268_ + 16383) >> 14;
								anIntArray9061[i_264_] = (anIntArray9060[i_264_] * i_268_ + anIntArray9061[i_264_] * i_269_ + 16383) >> 14;
								anIntArray9060[i_264_] = i_270_;
							}
							if (i_245_ != 0) {
								int i_271_ = Class447.anIntArray4906[i_245_];
								int i_272_ = Class447.anIntArray4921[i_245_];
								int i_273_ = (anIntArray9061[i_264_] * i_271_ + anIntArray9059[i_264_] * i_272_ + 16383) >> 14;
								anIntArray9061[i_264_] = (anIntArray9061[i_264_] * i_272_ - anIntArray9059[i_264_] * i_271_ + 16383) >> 14;
								anIntArray9059[i_264_] = i_273_;
							}
							anIntArray9059[i_264_] += anInt9073;
							anIntArray9060[i_264_] += anInt9052;
							anIntArray9061[i_264_] += anInt9117;
						}
					} else {
						for (int i_274_ = 0; i_274_ < is_262_.length; i_274_++) {
							int i_275_ = is_262_[i_274_];
							anIntArray9059[i_275_] -= anInt9073;
							anIntArray9060[i_275_] -= anInt9052;
							anIntArray9061[i_275_] -= anInt9117;
							if (i_244_ != 0) {
								int i_276_ = Class447.anIntArray4906[i_244_];
								int i_277_ = Class447.anIntArray4921[i_244_];
								int i_278_ = (anIntArray9060[i_275_] * i_277_ - anIntArray9061[i_275_] * i_276_ + 16383) >> 14;
								anIntArray9061[i_275_] = (anIntArray9060[i_275_] * i_276_ + anIntArray9061[i_275_] * i_277_ + 16383) >> 14;
								anIntArray9060[i_275_] = i_278_;
							}
							if (i_246_ != 0) {
								int i_279_ = Class447.anIntArray4906[i_246_];
								int i_280_ = Class447.anIntArray4921[i_246_];
								int i_281_ = (anIntArray9060[i_275_] * i_279_ + anIntArray9059[i_275_] * i_280_ + 16383) >> 14;
								anIntArray9060[i_275_] = (anIntArray9060[i_275_] * i_280_ - anIntArray9059[i_275_] * i_279_ + 16383) >> 14;
								anIntArray9059[i_275_] = i_281_;
							}
							if (i_245_ != 0) {
								int i_282_ = Class447.anIntArray4906[i_245_];
								int i_283_ = Class447.anIntArray4921[i_245_];
								int i_284_ = (anIntArray9061[i_275_] * i_282_ + anIntArray9059[i_275_] * i_283_ + 16383) >> 14;
								anIntArray9061[i_275_] = (anIntArray9061[i_275_] * i_283_ - anIntArray9059[i_275_] * i_282_ + 16383) >> 14;
								anIntArray9059[i_275_] = i_284_;
							}
							anIntArray9059[i_275_] += anInt9073;
							anIntArray9060[i_275_] += anInt9052;
							anIntArray9061[i_275_] += anInt9117;
						}
					}
				}
			}
			if (bool) {
				for (int i_285_ = 0; i_285_ < i_248_; i_285_++) {
					int i_286_ = is[i_285_];
					if (i_286_ < anIntArrayArray9109.length) {
						int[] is_287_ = anIntArrayArray9109[i_286_];
						for (int i_288_ = 0; i_288_ < is_287_.length; i_288_++) {
							int i_289_ = is_287_[i_288_];
							int i_290_ = anIntArray9068[i_289_];
							int i_291_ = anIntArray9068[i_289_ + 1];
							for (int i_292_ = i_290_; (i_292_ < i_291_ && aShortArray9103[i_292_] != 0); i_292_++) {
								int i_293_ = (aShortArray9103[i_292_] & 0xffff) - 1;
								if (i_246_ != 0) {
									int i_294_ = Class447.anIntArray4906[i_246_];
									int i_295_ = Class447.anIntArray4921[i_246_];
									int i_296_ = ((aShortArray9066[i_293_] * i_294_ + aShortArray9108[i_293_] * i_295_ + 16383) >> 14);
									aShortArray9066[i_293_] = (short) (((aShortArray9066[i_293_] * i_295_) - (aShortArray9108[i_293_] * i_294_) + 16383) >> 14);
									aShortArray9108[i_293_] = (short) i_296_;
								}
								if (i_244_ != 0) {
									int i_297_ = Class447.anIntArray4906[i_244_];
									int i_298_ = Class447.anIntArray4921[i_244_];
									int i_299_ = ((aShortArray9066[i_293_] * i_298_ - aShortArray9071[i_293_] * i_297_ + 16383) >> 14);
									aShortArray9071[i_293_] = (short) (((aShortArray9066[i_293_] * i_297_) + (aShortArray9071[i_293_] * i_298_) + 16383) >> 14);
									aShortArray9066[i_293_] = (short) i_299_;
								}
								if (i_245_ != 0) {
									int i_300_ = Class447.anIntArray4906[i_245_];
									int i_301_ = Class447.anIntArray4921[i_245_];
									int i_302_ = ((aShortArray9071[i_293_] * i_300_ + aShortArray9108[i_293_] * i_301_ + 16383) >> 14);
									aShortArray9071[i_293_] = (short) (((aShortArray9071[i_293_] * i_301_) - (aShortArray9108[i_293_] * i_300_) + 16383) >> 14);
									aShortArray9108[i_293_] = (short) i_302_;
								}
							}
						}
					}
				}
				if (aClass130_9106 == null && aClass130_9065 != null)
					aClass130_9065.anInterface15_1587 = null;
				if (aClass130_9106 != null)
					aClass130_9106.anInterface15_1587 = null;
			}
		} else if (i == 3) {
			for (int i_303_ = 0; i_303_ < i_248_; i_303_++) {
				int i_304_ = is[i_303_];
				if (i_304_ < anIntArrayArray9109.length) {
					int[] is_305_ = anIntArrayArray9109[i_304_];
					for (int i_306_ = 0; i_306_ < is_305_.length; i_306_++) {
						int i_307_ = is_305_[i_306_];
						anIntArray9059[i_307_] -= anInt9073;
						anIntArray9060[i_307_] -= anInt9052;
						anIntArray9061[i_307_] -= anInt9117;
						anIntArray9059[i_307_] = anIntArray9059[i_307_] * i_244_ >> 7;
						anIntArray9060[i_307_] = anIntArray9060[i_307_] * i_245_ >> 7;
						anIntArray9061[i_307_] = anIntArray9061[i_307_] * i_246_ >> 7;
						anIntArray9059[i_307_] += anInt9073;
						anIntArray9060[i_307_] += anInt9052;
						anIntArray9061[i_307_] += anInt9117;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9080 != null) {
				for (int i_308_ = 0; i_308_ < i_248_; i_308_++) {
					int i_309_ = is[i_308_];
					if (i_309_ < anIntArrayArray9080.length) {
						int[] is_310_ = anIntArrayArray9080[i_309_];
						for (int i_311_ = 0; i_311_ < is_310_.length; i_311_++) {
							int i_312_ = is_310_[i_311_];
							int i_313_ = (aByteArray9075[i_312_] & 0xff) + i_244_ * 8;
							if (i_313_ < 0)
								i_313_ = 0;
							else if (i_313_ > 255)
								i_313_ = 255;
							aByteArray9075[i_312_] = (byte) i_313_;
						}
						if (is_310_.length > 0 && aClass130_9065 != null)
							aClass130_9065.anInterface15_1587 = null;
					}
				}
				if (aClass142Array9107 != null) {
					for (int i_314_ = 0; i_314_ < anInt9116; i_314_++) {
						Class142 class142 = aClass142Array9107[i_314_];
						Class132 class132 = aClass132Array9102[i_314_];
						class132.anInt1603 = (class132.anInt1603 & 0xffffff | 255 - (aByteArray9075[class142.anInt1663] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9080 != null) {
				for (int i_315_ = 0; i_315_ < i_248_; i_315_++) {
					int i_316_ = is[i_315_];
					if (i_316_ < anIntArrayArray9080.length) {
						int[] is_317_ = anIntArrayArray9080[i_316_];
						for (int i_318_ = 0; i_318_ < is_317_.length; i_318_++) {
							int i_319_ = is_317_[i_318_];
							int i_320_ = aShortArray9074[i_319_] & 0xffff;
							int i_321_ = i_320_ >> 10 & 0x3f;
							int i_322_ = i_320_ >> 7 & 0x7;
							int i_323_ = i_320_ & 0x7f;
							i_321_ = i_321_ + i_244_ & 0x3f;
							i_322_ += i_245_ / 4;
							if (i_322_ < 0)
								i_322_ = 0;
							else if (i_322_ > 7)
								i_322_ = 7;
							i_323_ += i_246_;
							if (i_323_ < 0)
								i_323_ = 0;
							else if (i_323_ > 127)
								i_323_ = 127;
							aShortArray9074[i_319_] = (short) (i_321_ << 10 | i_322_ << 7 | i_323_);
						}
						if (is_317_.length > 0 && aClass130_9065 != null)
							aClass130_9065.anInterface15_1587 = null;
					}
				}
				if (aClass142Array9107 != null) {
					for (int i_324_ = 0; i_324_ < anInt9116; i_324_++) {
						Class142 class142 = aClass142Array9107[i_324_];
						Class132 class132 = aClass132Array9102[i_324_];
						class132.anInt1603 = (class132.anInt1603 & ~0xffffff | (Class639.anIntArray8309[(aShortArray9074[class142.anInt1663] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9112 != null) {
				for (int i_325_ = 0; i_325_ < i_248_; i_325_++) {
					int i_326_ = is[i_325_];
					if (i_326_ < anIntArrayArray9112.length) {
						int[] is_327_ = anIntArrayArray9112[i_326_];
						for (int i_328_ = 0; i_328_ < is_327_.length; i_328_++) {
							Class132 class132 = aClass132Array9102[is_327_[i_328_]];
							class132.anInt1606 += i_244_;
							class132.anInt1607 += i_245_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9112 != null) {
				for (int i_329_ = 0; i_329_ < i_248_; i_329_++) {
					int i_330_ = is[i_329_];
					if (i_330_ < anIntArrayArray9112.length) {
						int[] is_331_ = anIntArrayArray9112[i_330_];
						for (int i_332_ = 0; i_332_ < is_331_.length; i_332_++) {
							Class132 class132 = aClass132Array9102[is_331_[i_332_]];
							class132.anInt1608 = class132.anInt1608 * i_244_ >> 7;
							class132.anInt1604 = class132.anInt1604 * i_245_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9112 != null) {
				for (int i_333_ = 0; i_333_ < i_248_; i_333_++) {
					int i_334_ = is[i_333_];
					if (i_334_ < anIntArrayArray9112.length) {
						int[] is_335_ = anIntArrayArray9112[i_334_];
						for (int i_336_ = 0; i_336_ < is_335_.length; i_336_++) {
							Class132 class132 = aClass132Array9102[is_335_[i_336_]];
							class132.anInt1605 = class132.anInt1605 + i_244_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2573() {
		for (int i = 0; i < anInt9057; i++) {
			anIntArray9059[i] = anIntArray9059[i] + 7 >> 4;
			anIntArray9060[i] = anIntArray9060[i] + 7 >> 4;
			anIntArray9061[i] = anIntArray9061[i] + 7 >> 4;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	void method2546(int i, int i_337_, int i_338_, int i_339_) {
		if (i == 0) {
			int i_340_ = 0;
			anInt9073 = 0;
			anInt9052 = 0;
			anInt9117 = 0;
			for (int i_341_ = 0; i_341_ < anInt9058; i_341_++) {
				anInt9073 += anIntArray9059[i_341_];
				anInt9052 += anIntArray9060[i_341_];
				anInt9117 += anIntArray9061[i_341_];
				i_340_++;
			}
			if (i_340_ > 0) {
				anInt9073 = anInt9073 / i_340_ + i_337_;
				anInt9052 = anInt9052 / i_340_ + i_338_;
				anInt9117 = anInt9117 / i_340_ + i_339_;
			} else {
				anInt9073 = i_337_;
				anInt9052 = i_338_;
				anInt9117 = i_339_;
			}
		} else if (i == 1) {
			for (int i_342_ = 0; i_342_ < anInt9058; i_342_++) {
				anIntArray9059[i_342_] += i_337_;
				anIntArray9060[i_342_] += i_338_;
				anIntArray9061[i_342_] += i_339_;
			}
		} else if (i == 2) {
			for (int i_343_ = 0; i_343_ < anInt9058; i_343_++) {
				anIntArray9059[i_343_] -= anInt9073;
				anIntArray9060[i_343_] -= anInt9052;
				anIntArray9061[i_343_] -= anInt9117;
				if (i_339_ != 0) {
					int i_344_ = Class447.anIntArray4906[i_339_];
					int i_345_ = Class447.anIntArray4921[i_339_];
					int i_346_ = ((anIntArray9060[i_343_] * i_344_ + anIntArray9059[i_343_] * i_345_ + 16383) >> 14);
					anIntArray9060[i_343_] = (anIntArray9060[i_343_] * i_345_ - anIntArray9059[i_343_] * i_344_ + 16383) >> 14;
					anIntArray9059[i_343_] = i_346_;
				}
				if (i_337_ != 0) {
					int i_347_ = Class447.anIntArray4906[i_337_];
					int i_348_ = Class447.anIntArray4921[i_337_];
					int i_349_ = ((anIntArray9060[i_343_] * i_348_ - anIntArray9061[i_343_] * i_347_ + 16383) >> 14);
					anIntArray9061[i_343_] = (anIntArray9060[i_343_] * i_347_ + anIntArray9061[i_343_] * i_348_ + 16383) >> 14;
					anIntArray9060[i_343_] = i_349_;
				}
				if (i_338_ != 0) {
					int i_350_ = Class447.anIntArray4906[i_338_];
					int i_351_ = Class447.anIntArray4921[i_338_];
					int i_352_ = ((anIntArray9061[i_343_] * i_350_ + anIntArray9059[i_343_] * i_351_ + 16383) >> 14);
					anIntArray9061[i_343_] = (anIntArray9061[i_343_] * i_351_ - anIntArray9059[i_343_] * i_350_ + 16383) >> 14;
					anIntArray9059[i_343_] = i_352_;
				}
				anIntArray9059[i_343_] += anInt9073;
				anIntArray9060[i_343_] += anInt9052;
				anIntArray9061[i_343_] += anInt9117;
			}
		} else if (i == 3) {
			for (int i_353_ = 0; i_353_ < anInt9058; i_353_++) {
				anIntArray9059[i_353_] -= anInt9073;
				anIntArray9060[i_353_] -= anInt9052;
				anIntArray9061[i_353_] -= anInt9117;
				anIntArray9059[i_353_] = anIntArray9059[i_353_] * i_337_ / 128;
				anIntArray9060[i_353_] = anIntArray9060[i_353_] * i_338_ / 128;
				anIntArray9061[i_353_] = anIntArray9061[i_353_] * i_339_ / 128;
				anIntArray9059[i_353_] += anInt9073;
				anIntArray9060[i_353_] += anInt9052;
				anIntArray9061[i_353_] += anInt9117;
			}
		} else if (i == 5) {
			for (int i_354_ = 0; i_354_ < anInt9118; i_354_++) {
				int i_355_ = (aByteArray9075[i_354_] & 0xff) + i_337_ * 8;
				if (i_355_ < 0)
					i_355_ = 0;
				else if (i_355_ > 255)
					i_355_ = 255;
				aByteArray9075[i_354_] = (byte) i_355_;
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
			if (aClass142Array9107 != null) {
				for (int i_356_ = 0; i_356_ < anInt9116; i_356_++) {
					Class142 class142 = aClass142Array9107[i_356_];
					Class132 class132 = aClass132Array9102[i_356_];
					class132.anInt1603 = (class132.anInt1603 & 0xffffff | (255 - (aByteArray9075[class142.anInt1663] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_357_ = 0; i_357_ < anInt9118; i_357_++) {
				int i_358_ = aShortArray9074[i_357_] & 0xffff;
				int i_359_ = i_358_ >> 10 & 0x3f;
				int i_360_ = i_358_ >> 7 & 0x7;
				int i_361_ = i_358_ & 0x7f;
				i_359_ = i_359_ + i_337_ & 0x3f;
				i_360_ += i_338_ / 4;
				if (i_360_ < 0)
					i_360_ = 0;
				else if (i_360_ > 7)
					i_360_ = 7;
				i_361_ += i_339_;
				if (i_361_ < 0)
					i_361_ = 0;
				else if (i_361_ > 127)
					i_361_ = 127;
				aShortArray9074[i_357_] = (short) (i_359_ << 10 | i_360_ << 7 | i_361_);
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
			if (aClass142Array9107 != null) {
				for (int i_362_ = 0; i_362_ < anInt9116; i_362_++) {
					Class142 class142 = aClass142Array9107[i_362_];
					Class132 class132 = aClass132Array9102[i_362_];
					class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_363_ = 0; i_363_ < anInt9116; i_363_++) {
				Class132 class132 = aClass132Array9102[i_363_];
				class132.anInt1606 += i_337_;
				class132.anInt1607 += i_338_;
			}
		} else if (i == 10) {
			for (int i_364_ = 0; i_364_ < anInt9116; i_364_++) {
				Class132 class132 = aClass132Array9102[i_364_];
				class132.anInt1608 = class132.anInt1608 * i_337_ >> 7;
				class132.anInt1604 = class132.anInt1604 * i_338_ >> 7;
			}
		} else if (i == 9) {
			for (int i_365_ = 0; i_365_ < anInt9116; i_365_++) {
				Class132 class132 = aClass132Array9102[i_365_];
				class132.anInt1605 = class132.anInt1605 + i_337_ & 0x3fff;
			}
		}
	}

	public Class156[] method2515() {
		return aClass156Array9064;
	}

	public int method2569() {
		if (!aBool9092)
			method8488();
		return aShort9096;
	}

	public void method2513(Class433 class433) {
		Class443 class443 = aClass167_Sub2_9049.aClass443_9223;
		class443.method5359(class433);
		if (aClass172Array9104 != null) {
			for (int i = 0; i < aClass172Array9104.length; i++) {
				Class172 class172 = aClass172Array9104[i];
				Class172 class172_366_ = class172;
				if (class172.aClass172_1910 != null)
					class172_366_ = class172.aClass172_1910;
				class172_366_.anInt1913 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9059[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9060[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9061[(class172.anInt1909 * -1506968299)])))) * -1971428173);
				class172_366_.anInt1914 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9059[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9060[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9061[(class172.anInt1909 * -1506968299)])))) * 179150469);
				class172_366_.anInt1915 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9059[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9060[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9061[(class172.anInt1909 * -1506968299)])))) * -26173683);
				class172_366_.anInt1907 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9059[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9060[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9061[(class172.anInt1916 * -1724466837)])))) * 163461589);
				class172_366_.anInt1917 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9059[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9060[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9061[(class172.anInt1916 * -1724466837)])))) * 555769531);
				class172_366_.anInt1918 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9059[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9060[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9061[(class172.anInt1916 * -1724466837)])))) * -379440279);
				class172_366_.anInt1919 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9059[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9060[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9061[(class172.anInt1911 * -767867943)])))) * -767320321);
				class172_366_.anInt1920 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9059[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9060[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9061[(class172.anInt1911 * -767867943)])))) * 1270728077);
				class172_366_.anInt1921 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9059[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9060[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9061[(class172.anInt1911 * -767867943)])))) * -2080843121);
			}
		}
		if (aClass156Array9064 != null) {
			for (int i = 0; i < aClass156Array9064.length; i++) {
				Class156 class156 = aClass156Array9064[i];
				Class156 class156_367_ = class156;
				if (class156.aClass156_1735 != null)
					class156_367_ = class156.aClass156_1735;
				if (class156.aClass443_1740 != null)
					class156.aClass443_1740.method5339(class443);
				else
					class156.aClass443_1740 = new Class443(class443);
				class156_367_.anInt1734 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9059[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9060[(class156.anInt1738 * -986127555)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9061[(class156.anInt1738 * -986127555)])))) * 1464786499);
				class156_367_.anInt1737 = (int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) (anIntArray9059[class156.anInt1738 * -986127555])) + (class443.aFloatArray4878[5] * (float) anIntArray9060[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[9] * (float) (anIntArray9061[(class156.anInt1738 * -986127555)])))) * 524114341;
				class156_367_.anInt1739 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9059[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9060[(class156.anInt1738 * -986127555)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9061[(class156.anInt1738 * -986127555)])))) * -1766187741);
			}
		}
	}

	public boolean method2602() {
		if (aShortArray9079 == null)
			return true;
		for (int i = 0; i < aShortArray9079.length; i++) {
			if (aShortArray9079[i] != -1) {
				Class164 class164 = (aClass167_Sub2_9049.aClass174_1852.method2446(aShortArray9079[i] & 0xffff, -1797522279));
				if (class164.aBool1814 && !aClass167_Sub2_9049.aClass149_9293.method1819(Class599.aClass599_7843, class164, -1))
					return false;
			}
		}
		return true;
	}

	boolean method8491(int i, int i_368_, int i_369_, int i_370_, int i_371_, int i_372_, int i_373_, int i_374_) {
		if (i_368_ < i_369_ && i_368_ < i_370_ && i_368_ < i_371_)
			return false;
		if (i_368_ > i_369_ && i_368_ > i_370_ && i_368_ > i_371_)
			return false;
		if (i < i_372_ && i < i_373_ && i < i_374_)
			return false;
		if (i > i_372_ && i > i_373_ && i > i_374_)
			return false;
		return true;
	}

	void method8492(Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2) {
		if (aClass167_Sub2_9049.anIntArray9321.length < anInt9077) {
			aClass167_Sub2_9049.anIntArray9321 = new int[anInt9077];
			aClass167_Sub2_9049.anIntArray9320 = new int[anInt9077];
		}
		int[] is = aClass167_Sub2_9049.anIntArray9321;
		int[] is_375_ = aClass167_Sub2_9049.anIntArray9320;
		for (int i = 0; i < anInt9058; i++) {
			int i_376_ = (((anIntArray9059[i] - (anIntArray9060[i] * aClass167_Sub2_9049.anInt9332 >> 8)) >> aClass167_Sub2_9049.anInt9178) - class536_sub18_sub7_sub2.anInt12078);
			int i_377_ = (((anIntArray9061[i] - (anIntArray9060[i] * aClass167_Sub2_9049.anInt9257 >> 8)) >> aClass167_Sub2_9049.anInt9178) - class536_sub18_sub7_sub2.anInt12079);
			int i_378_ = anIntArray9068[i];
			int i_379_ = anIntArray9068[i + 1];
			for (int i_380_ = i_378_; i_380_ < i_379_ && aShortArray9103[i_380_] != 0; i_380_++) {
				int i_381_ = (aShortArray9103[i_380_] & 0xffff) - 1;
				is[i_381_] = i_376_;
				is_375_[i_381_] = i_377_;
			}
		}
		for (int i = 0; i < anInt9072; i++) {
			if (aByteArray9075 == null || aByteArray9075[i] <= 128) {
				int i_382_ = aShortArray9076[i] & 0xffff;
				int i_383_ = aShortArray9055[i] & 0xffff;
				int i_384_ = aShortArray9091[i] & 0xffff;
				int i_385_ = is[i_382_];
				int i_386_ = is[i_383_];
				int i_387_ = is[i_384_];
				int i_388_ = is_375_[i_382_];
				int i_389_ = is_375_[i_383_];
				int i_390_ = is_375_[i_384_];
				if (((i_385_ - i_386_) * (i_389_ - i_390_) - (i_389_ - i_388_) * (i_387_ - i_386_)) > 0)
					class536_sub18_sub7_sub2.method11002(i_388_, i_389_, i_390_, i_385_, i_386_, i_387_);
			}
		}
	}

	public void method2490(Class433 class433, Class178 class178, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9077 != 0) {
			Class443 class443 = aClass167_Sub2_9049.aClass443_9209;
			Class443 class443_391_ = aClass167_Sub2_9049.aClass443_9223;
			Class443 class443_392_ = aClass167_Sub2_9049.aClass443_9224;
			class443_391_.method5359(class433);
			class443_392_.method5339(class443_391_);
			class443_392_.method5390(aClass167_Sub2_9049.aClass443_9211);
			if (!aBool9092)
				method8488();
			float[] fs = aClass167_Sub2_9049.aFloatArray9231;
			class443_391_.method5346(0.0F, (float) aShort9093, 0.0F, fs);
			float f = fs[0];
			float f_393_ = fs[1];
			float f_394_ = fs[2];
			class443_391_.method5346(0.0F, (float) aShort9094, 0.0F, fs);
			float f_395_ = fs[0];
			float f_396_ = fs[1];
			float f_397_ = fs[2];
			for (int i_398_ = 0; i_398_ < 6; i_398_++) {
				float[] fs_399_ = aClass167_Sub2_9049.aFloatArrayArray9212[i_398_];
				float f_400_ = (fs_399_[0] * f + fs_399_[1] * f_393_ + fs_399_[2] * f_394_ + fs_399_[3] + (float) anInt9067);
				float f_401_ = (fs_399_[0] * f_395_ + fs_399_[1] * f_396_ + fs_399_[2] * f_397_ + fs_399_[3] + (float) anInt9067);
				if (f_400_ < 0.0F && f_401_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_402_ = true;
				int i_403_ = aShort9095 + aShort9096 >> 1;
				int i_404_ = aShort9097 + aShort9098 >> 1;
				int i_405_ = i_403_;
				short i_406_ = aShort9093;
				int i_407_ = i_404_;
				float f_408_ = (class443_392_.aFloatArray4878[0] * (float) i_405_ + class443_392_.aFloatArray4878[4] * (float) i_406_ + class443_392_.aFloatArray4878[8] * (float) i_407_ + class443_392_.aFloatArray4878[12]);
				float f_409_ = (class443_392_.aFloatArray4878[1] * (float) i_405_ + class443_392_.aFloatArray4878[5] * (float) i_406_ + class443_392_.aFloatArray4878[9] * (float) i_407_ + class443_392_.aFloatArray4878[13]);
				float f_410_ = (class443_392_.aFloatArray4878[2] * (float) i_405_ + class443_392_.aFloatArray4878[6] * (float) i_406_ + class443_392_.aFloatArray4878[10] * (float) i_407_ + class443_392_.aFloatArray4878[14]);
				float f_411_ = (class443_392_.aFloatArray4878[3] * (float) i_405_ + class443_392_.aFloatArray4878[7] * (float) i_406_ + class443_392_.aFloatArray4878[11] * (float) i_407_ + class443_392_.aFloatArray4878[15]);
				if (f_410_ >= -f_411_) {
					class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_408_ / f_411_));
					class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_409_ / f_411_));
				} else
					bool = true;
				i_405_ = i_403_;
				i_406_ = aShort9094;
				i_407_ = i_404_;
				float f_412_ = (class443_392_.aFloatArray4878[0] * (float) i_405_ + class443_392_.aFloatArray4878[4] * (float) i_406_ + class443_392_.aFloatArray4878[8] * (float) i_407_ + class443_392_.aFloatArray4878[12]);
				float f_413_ = (class443_392_.aFloatArray4878[1] * (float) i_405_ + class443_392_.aFloatArray4878[5] * (float) i_406_ + class443_392_.aFloatArray4878[9] * (float) i_407_ + class443_392_.aFloatArray4878[13]);
				float f_414_ = (class443_392_.aFloatArray4878[2] * (float) i_405_ + class443_392_.aFloatArray4878[6] * (float) i_406_ + class443_392_.aFloatArray4878[10] * (float) i_407_ + class443_392_.aFloatArray4878[14]);
				float f_415_ = (class443_392_.aFloatArray4878[3] * (float) i_405_ + class443_392_.aFloatArray4878[7] * (float) i_406_ + class443_392_.aFloatArray4878[11] * (float) i_407_ + class443_392_.aFloatArray4878[15]);
				if (f_414_ >= -f_415_) {
					class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_412_ / f_415_));
					class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_413_ / f_415_));
				} else
					bool = true;
				if (bool) {
					if (f_410_ < -f_411_ && f_414_ < -f_415_)
						bool_402_ = false;
					else if (f_410_ < -f_411_) {
						float f_416_ = (f_410_ + f_411_) / (f_414_ + f_415_) - 1.0F;
						float f_417_ = f_408_ + f_416_ * (f_412_ - f_408_);
						float f_418_ = f_409_ + f_416_ * (f_413_ - f_409_);
						float f_419_ = f_411_ + f_416_ * (f_415_ - f_411_);
						class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_417_ / f_419_));
						class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_418_ / f_419_));
					} else if (f_414_ < -f_415_) {
						float f_420_ = (f_414_ + f_415_) / (f_410_ + f_411_) - 1.0F;
						float f_421_ = f_412_ + f_420_ * (f_408_ - f_412_);
						float f_422_ = f_413_ + f_420_ * (f_409_ - f_413_);
						float f_423_ = f_415_ + f_420_ * (f_411_ - f_415_);
						class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_421_ / f_423_));
						class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_422_ / f_423_));
					}
				}
				if (bool_402_) {
					if (f_410_ / f_411_ > f_414_ / f_415_) {
						float f_424_ = (f_408_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_425_ = (f_411_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1941 + (aClass167_Sub2_9049.aFloat9215 * f_424_ / f_425_));
					} else {
						float f_426_ = (f_412_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_427_ = (f_415_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1943 + (aClass167_Sub2_9049.aFloat9215 * f_426_ / f_427_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub2_9049.method8552();
			aClass167_Sub2_9049.method8527(class443_391_);
			method8493();
			aClass167_Sub2_9049.method8529();
			class443_391_.method5390(aClass167_Sub2_9049.aClass443_9280);
			method8494(class443_391_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	void method8493() {
		if (anInt9072 != 0) {
			if (aByte9085 != 0)
				method8496(true);
			method8496(false);
			if (aClass121_9046 != null) {
				if (aClass121_9046.anInterface17_1481 == null)
					method8490((aByte9085 & 0x10) != 0);
				if (aClass121_9046.anInterface17_1481 != null) {
					aClass167_Sub2_9049.method8611(aClass130_9106 != null);
					aClass167_Sub2_9049.method8547(aClass130_9082, aClass130_9106, aClass130_9065, aClass130_9086);
					int i = anIntArray9101.length - 1;
					for (int i_428_ = 0; i_428_ < i; i_428_++) {
						int i_429_ = anIntArray9101[i_428_];
						int i_430_ = anIntArray9101[i_428_ + 1];
						int i_431_ = (aShortArray9079[i_429_] == -1 ? -1 : aShortArray9079[i_429_] & 0xffff);
						aClass167_Sub2_9049.method8554(i_431_, aClass130_9106 != null);
						aClass167_Sub2_9049.method8511((aClass121_9046.anInterface17_1481), 4, i_429_ * 3, (i_430_ - i_429_) * 3);
					}
				}
			}
			method8487();
		}
	}

	void method8494(Class443 class443) {
		if (aClass142Array9107 != null) {
			Class443 class443_432_ = aClass167_Sub2_9049.aClass443_9305;
			aClass167_Sub2_9049.method8526();
			aClass167_Sub2_9049.method2302(!aBool9084);
			aClass167_Sub2_9049.method8611(false);
			aClass167_Sub2_9049.method8547(aClass167_Sub2_9049.aClass130_9315, null, null, aClass167_Sub2_9049.aClass130_9316);
			for (int i = 0; i < anInt9116; i++) {
				Class142 class142 = aClass142Array9107[i];
				Class132 class132 = aClass132Array9102[i];
				if (!class142.aBool1668 || !aClass167_Sub2_9049.method2124()) {
					float f = ((float) (anIntArray9059[class142.anInt1662] + anIntArray9059[class142.anInt1661] + anIntArray9059[class142.anInt1660]) * 0.3333333F);
					float f_433_ = ((float) (anIntArray9060[class142.anInt1662] + anIntArray9060[class142.anInt1661] + anIntArray9060[class142.anInt1660]) * 0.3333333F);
					float f_434_ = ((float) (anIntArray9061[class142.anInt1662] + anIntArray9061[class142.anInt1661] + anIntArray9061[class142.anInt1660]) * 0.3333333F);
					float f_435_ = (class443.aFloatArray4878[0] * f + class443.aFloatArray4878[4] * f_433_ + class443.aFloatArray4878[8] * f_434_ + class443.aFloatArray4878[12]);
					float f_436_ = (class443.aFloatArray4878[1] * f + class443.aFloatArray4878[5] * f_433_ + class443.aFloatArray4878[9] * f_434_ + class443.aFloatArray4878[13]);
					float f_437_ = (class443.aFloatArray4878[2] * f + class443.aFloatArray4878[6] * f_433_ + class443.aFloatArray4878[10] * f_434_ + class443.aFloatArray4878[14]);
					float f_438_ = ((float) (1.0 / Math.sqrt((double) (f_435_ * f_435_ + f_436_ * f_436_ + f_437_ * f_437_))) * (float) class142.anInt1669);
					class443_432_.method5365(class132.anInt1605, class132.anInt1608 * class142.aShort1666 >> 7, class132.anInt1604 * class142.aShort1665 >> 7, f_435_ + (float) class132.anInt1606 - f_435_ * f_438_, f_436_ + (float) class132.anInt1607 - f_436_ * f_438_, f_437_ - f_437_ * f_438_);
					aClass167_Sub2_9049.method8528(class443_432_);
					int i_439_ = class132.anInt1603;
					OpenGL.glColor4ub((byte) (i_439_ >> 16), (byte) (i_439_ >> 8), (byte) i_439_, (byte) (i_439_ >> 24));
					aClass167_Sub2_9049.method8553(class142.aShort1664);
					aClass167_Sub2_9049.method8567(class142.aByte1667);
					aClass167_Sub2_9049.method8548(7, 0, 4);
				}
			}
			aClass167_Sub2_9049.method2302(true);
			aClass167_Sub2_9049.method8529();
		}
	}

	public int method2611() {
		return anInt9050;
	}

	public int method2577() {
		if (!aBool9092)
			method8488();
		return aShort9093;
	}

	static final int method8495(int i, int i_440_) {
		i_440_ = i_440_ * (i & 0x7f) >> 7;
		if (i_440_ < 2)
			i_440_ = 2;
		else if (i_440_ > 126)
			i_440_ = 126;
		return (i & 0xff80) + i_440_;
	}

	static {
		anIntArray9110 = new int[8];
		anIntArray9113 = new int[8];
		anIntArray9114 = new int[8];
	}

	public void method2517(Class177 class177, int i, int i_441_, int i_442_, boolean bool) {
		Class177_Sub1 class177_sub1_443_ = (Class177_Sub1) class177;
		if (anInt9118 != 0 && class177_sub1_443_.anInt9118 != 0) {
			int i_444_ = class177_sub1_443_.anInt9058;
			int[] is = class177_sub1_443_.anIntArray9059;
			int[] is_445_ = class177_sub1_443_.anIntArray9060;
			int[] is_446_ = class177_sub1_443_.anIntArray9061;
			short[] is_447_ = class177_sub1_443_.aShortArray9108;
			short[] is_448_ = class177_sub1_443_.aShortArray9066;
			short[] is_449_ = class177_sub1_443_.aShortArray9071;
			byte[] is_450_ = class177_sub1_443_.aByteArray9100;
			short[] is_451_;
			short[] is_452_;
			short[] is_453_;
			byte[] is_454_;
			if (aClass162_9069 != null) {
				is_451_ = aClass162_9069.aShortArray1774;
				is_452_ = aClass162_9069.aShortArray1771;
				is_453_ = aClass162_9069.aShortArray1773;
				is_454_ = aClass162_9069.aByteArray1772;
			} else {
				is_451_ = null;
				is_452_ = null;
				is_453_ = null;
				is_454_ = null;
			}
			short[] is_455_;
			short[] is_456_;
			short[] is_457_;
			byte[] is_458_;
			if (class177_sub1_443_.aClass162_9069 != null) {
				is_455_ = class177_sub1_443_.aClass162_9069.aShortArray1774;
				is_456_ = class177_sub1_443_.aClass162_9069.aShortArray1771;
				is_457_ = class177_sub1_443_.aClass162_9069.aShortArray1773;
				is_458_ = class177_sub1_443_.aClass162_9069.aByteArray1772;
			} else {
				is_455_ = null;
				is_456_ = null;
				is_457_ = null;
				is_458_ = null;
			}
			int[] is_459_ = class177_sub1_443_.anIntArray9068;
			short[] is_460_ = class177_sub1_443_.aShortArray9103;
			if (!class177_sub1_443_.aBool9092)
				class177_sub1_443_.method8488();
			int i_461_ = class177_sub1_443_.aShort9093;
			int i_462_ = class177_sub1_443_.aShort9094;
			int i_463_ = class177_sub1_443_.aShort9095;
			int i_464_ = class177_sub1_443_.aShort9096;
			int i_465_ = class177_sub1_443_.aShort9097;
			int i_466_ = class177_sub1_443_.aShort9098;
			for (int i_467_ = 0; i_467_ < anInt9058; i_467_++) {
				int i_468_ = anIntArray9060[i_467_] - i_441_;
				if (i_468_ >= i_461_ && i_468_ <= i_462_) {
					int i_469_ = anIntArray9059[i_467_] - i;
					if (i_469_ >= i_463_ && i_469_ <= i_464_) {
						int i_470_ = anIntArray9061[i_467_] - i_442_;
						if (i_470_ >= i_465_ && i_470_ <= i_466_) {
							int i_471_ = -1;
							int i_472_ = anIntArray9068[i_467_];
							int i_473_ = anIntArray9068[i_467_ + 1];
							for (int i_474_ = i_472_; (i_474_ < i_473_ && aShortArray9103[i_474_] != 0); i_474_++) {
								i_471_ = (aShortArray9103[i_474_] & 0xffff) - 1;
								if (aByteArray9100[i_471_] != 0)
									break;
							}
							if (i_471_ != -1) {
								for (int i_475_ = 0; i_475_ < i_444_; i_475_++) {
									if (i_469_ == is[i_475_] && i_470_ == is_446_[i_475_] && i_468_ == is_445_[i_475_]) {
										int i_476_ = -1;
										i_472_ = is_459_[i_475_];
										i_473_ = is_459_[i_475_ + 1];
										for (int i_477_ = i_472_; (i_477_ < i_473_ && is_460_[i_477_] != 0); i_477_++) {
											i_476_ = (is_460_[i_477_] & 0xffff) - 1;
											if (is_450_[i_476_] != 0)
												break;
										}
										if (i_476_ != -1) {
											if (is_451_ == null) {
												aClass162_9069 = new Class162();
												is_451_ = aClass162_9069.aShortArray1774 = (Class483.method5839(aShortArray9108, -1652445272));
												is_452_ = aClass162_9069.aShortArray1771 = (Class483.method5839(aShortArray9066, -1089156429));
												is_453_ = aClass162_9069.aShortArray1773 = (Class483.method5839(aShortArray9071, -1429112329));
												is_454_ = aClass162_9069.aByteArray1772 = (Class536_Sub2.method9364(aByteArray9100, (byte) 22));
											}
											if (is_455_ == null) {
												Class162 class162 = (class177_sub1_443_.aClass162_9069 = new Class162());
												is_455_ = class162.aShortArray1774 = (Class483.method5839(is_447_, -1631894161));
												is_456_ = class162.aShortArray1771 = (Class483.method5839(is_448_, -827745377));
												is_457_ = class162.aShortArray1773 = (Class483.method5839(is_449_, -1851004401));
												is_458_ = class162.aByteArray1772 = (Class536_Sub2.method9364(is_450_, (byte) 22));
											}
											short i_478_ = aShortArray9108[i_471_];
											short i_479_ = aShortArray9066[i_471_];
											short i_480_ = aShortArray9071[i_471_];
											byte i_481_ = aByteArray9100[i_471_];
											i_472_ = is_459_[i_475_];
											i_473_ = is_459_[i_475_ + 1];
											for (int i_482_ = i_472_; i_482_ < i_473_; i_482_++) {
												int i_483_ = is_460_[i_482_] - 1;
												if (i_483_ == -1)
													break;
												if (is_458_[i_483_] != 0) {
													is_455_[i_483_] += i_478_;
													is_456_[i_483_] += i_479_;
													is_457_[i_483_] += i_480_;
													is_458_[i_483_] += i_481_;
												}
											}
											i_478_ = is_447_[i_476_];
											i_479_ = is_448_[i_476_];
											i_480_ = is_449_[i_476_];
											i_481_ = is_450_[i_476_];
											i_472_ = anIntArray9068[i_467_];
											i_473_ = anIntArray9068[i_467_ + 1];
											for (int i_484_ = i_472_; (i_484_ < i_473_ && (aShortArray9103[i_484_] != 0)); i_484_++) {
												int i_485_ = ((aShortArray9103[i_484_] & 0xffff) - 1);
												if (is_454_[i_485_] != 0) {
													is_451_[i_485_] += i_478_;
													is_452_[i_485_] += i_479_;
													is_453_[i_485_] += i_480_;
													is_454_[i_485_] += i_481_;
												}
											}
											if (aClass130_9106 == null && aClass130_9065 != null)
												aClass130_9065.anInterface15_1587 = null;
											if (aClass130_9106 != null)
												aClass130_9106.anInterface15_1587 = null;
											if ((class177_sub1_443_.aClass130_9106) == null && (class177_sub1_443_.aClass130_9065) != null)
												class177_sub1_443_.aClass130_9065.anInterface15_1587 = null;
											if ((class177_sub1_443_.aClass130_9106) != null)
												class177_sub1_443_.aClass130_9106.anInterface15_1587 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2561(Class177 class177, int i, int i_486_, int i_487_, boolean bool) {
		Class177_Sub1 class177_sub1_488_ = (Class177_Sub1) class177;
		if (anInt9118 != 0 && class177_sub1_488_.anInt9118 != 0) {
			int i_489_ = class177_sub1_488_.anInt9058;
			int[] is = class177_sub1_488_.anIntArray9059;
			int[] is_490_ = class177_sub1_488_.anIntArray9060;
			int[] is_491_ = class177_sub1_488_.anIntArray9061;
			short[] is_492_ = class177_sub1_488_.aShortArray9108;
			short[] is_493_ = class177_sub1_488_.aShortArray9066;
			short[] is_494_ = class177_sub1_488_.aShortArray9071;
			byte[] is_495_ = class177_sub1_488_.aByteArray9100;
			short[] is_496_;
			short[] is_497_;
			short[] is_498_;
			byte[] is_499_;
			if (aClass162_9069 != null) {
				is_496_ = aClass162_9069.aShortArray1774;
				is_497_ = aClass162_9069.aShortArray1771;
				is_498_ = aClass162_9069.aShortArray1773;
				is_499_ = aClass162_9069.aByteArray1772;
			} else {
				is_496_ = null;
				is_497_ = null;
				is_498_ = null;
				is_499_ = null;
			}
			short[] is_500_;
			short[] is_501_;
			short[] is_502_;
			byte[] is_503_;
			if (class177_sub1_488_.aClass162_9069 != null) {
				is_500_ = class177_sub1_488_.aClass162_9069.aShortArray1774;
				is_501_ = class177_sub1_488_.aClass162_9069.aShortArray1771;
				is_502_ = class177_sub1_488_.aClass162_9069.aShortArray1773;
				is_503_ = class177_sub1_488_.aClass162_9069.aByteArray1772;
			} else {
				is_500_ = null;
				is_501_ = null;
				is_502_ = null;
				is_503_ = null;
			}
			int[] is_504_ = class177_sub1_488_.anIntArray9068;
			short[] is_505_ = class177_sub1_488_.aShortArray9103;
			if (!class177_sub1_488_.aBool9092)
				class177_sub1_488_.method8488();
			int i_506_ = class177_sub1_488_.aShort9093;
			int i_507_ = class177_sub1_488_.aShort9094;
			int i_508_ = class177_sub1_488_.aShort9095;
			int i_509_ = class177_sub1_488_.aShort9096;
			int i_510_ = class177_sub1_488_.aShort9097;
			int i_511_ = class177_sub1_488_.aShort9098;
			for (int i_512_ = 0; i_512_ < anInt9058; i_512_++) {
				int i_513_ = anIntArray9060[i_512_] - i_486_;
				if (i_513_ >= i_506_ && i_513_ <= i_507_) {
					int i_514_ = anIntArray9059[i_512_] - i;
					if (i_514_ >= i_508_ && i_514_ <= i_509_) {
						int i_515_ = anIntArray9061[i_512_] - i_487_;
						if (i_515_ >= i_510_ && i_515_ <= i_511_) {
							int i_516_ = -1;
							int i_517_ = anIntArray9068[i_512_];
							int i_518_ = anIntArray9068[i_512_ + 1];
							for (int i_519_ = i_517_; (i_519_ < i_518_ && aShortArray9103[i_519_] != 0); i_519_++) {
								i_516_ = (aShortArray9103[i_519_] & 0xffff) - 1;
								if (aByteArray9100[i_516_] != 0)
									break;
							}
							if (i_516_ != -1) {
								for (int i_520_ = 0; i_520_ < i_489_; i_520_++) {
									if (i_514_ == is[i_520_] && i_515_ == is_491_[i_520_] && i_513_ == is_490_[i_520_]) {
										int i_521_ = -1;
										i_517_ = is_504_[i_520_];
										i_518_ = is_504_[i_520_ + 1];
										for (int i_522_ = i_517_; (i_522_ < i_518_ && is_505_[i_522_] != 0); i_522_++) {
											i_521_ = (is_505_[i_522_] & 0xffff) - 1;
											if (is_495_[i_521_] != 0)
												break;
										}
										if (i_521_ != -1) {
											if (is_496_ == null) {
												aClass162_9069 = new Class162();
												is_496_ = aClass162_9069.aShortArray1774 = (Class483.method5839(aShortArray9108, -1107556580));
												is_497_ = aClass162_9069.aShortArray1771 = (Class483.method5839(aShortArray9066, -1586741934));
												is_498_ = aClass162_9069.aShortArray1773 = (Class483.method5839(aShortArray9071, -1136688311));
												is_499_ = aClass162_9069.aByteArray1772 = (Class536_Sub2.method9364(aByteArray9100, (byte) 22));
											}
											if (is_500_ == null) {
												Class162 class162 = (class177_sub1_488_.aClass162_9069 = new Class162());
												is_500_ = class162.aShortArray1774 = (Class483.method5839(is_492_, -2133842457));
												is_501_ = class162.aShortArray1771 = (Class483.method5839(is_493_, -1073953103));
												is_502_ = class162.aShortArray1773 = (Class483.method5839(is_494_, -843748972));
												is_503_ = class162.aByteArray1772 = (Class536_Sub2.method9364(is_495_, (byte) 22));
											}
											short i_523_ = aShortArray9108[i_516_];
											short i_524_ = aShortArray9066[i_516_];
											short i_525_ = aShortArray9071[i_516_];
											byte i_526_ = aByteArray9100[i_516_];
											i_517_ = is_504_[i_520_];
											i_518_ = is_504_[i_520_ + 1];
											for (int i_527_ = i_517_; i_527_ < i_518_; i_527_++) {
												int i_528_ = is_505_[i_527_] - 1;
												if (i_528_ == -1)
													break;
												if (is_503_[i_528_] != 0) {
													is_500_[i_528_] += i_523_;
													is_501_[i_528_] += i_524_;
													is_502_[i_528_] += i_525_;
													is_503_[i_528_] += i_526_;
												}
											}
											i_523_ = is_492_[i_521_];
											i_524_ = is_493_[i_521_];
											i_525_ = is_494_[i_521_];
											i_526_ = is_495_[i_521_];
											i_517_ = anIntArray9068[i_512_];
											i_518_ = anIntArray9068[i_512_ + 1];
											for (int i_529_ = i_517_; (i_529_ < i_518_ && (aShortArray9103[i_529_] != 0)); i_529_++) {
												int i_530_ = ((aShortArray9103[i_529_] & 0xffff) - 1);
												if (is_499_[i_530_] != 0) {
													is_496_[i_530_] += i_523_;
													is_497_[i_530_] += i_524_;
													is_498_[i_530_] += i_525_;
													is_499_[i_530_] += i_526_;
												}
											}
											if (aClass130_9106 == null && aClass130_9065 != null)
												aClass130_9065.anInterface15_1587 = null;
											if (aClass130_9106 != null)
												aClass130_9106.anInterface15_1587 = null;
											if ((class177_sub1_488_.aClass130_9106) == null && (class177_sub1_488_.aClass130_9065) != null)
												class177_sub1_488_.aClass130_9065.anInterface15_1587 = null;
											if ((class177_sub1_488_.aClass130_9106) != null)
												class177_sub1_488_.aClass130_9106.anInterface15_1587 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2553(int i) {
		anInt9050 = i;
		if (aClass162_9069 != null && (anInt9050 & 0x10000) == 0) {
			aShortArray9108 = aClass162_9069.aShortArray1774;
			aShortArray9066 = aClass162_9069.aShortArray1771;
			aShortArray9071 = aClass162_9069.aShortArray1773;
			aByteArray9100 = aClass162_9069.aByteArray1772;
			aClass162_9069 = null;
		}
		aBool9089 = true;
		method8487();
	}

	public void method2519() {
		if (anInt9077 > 0 && anInt9072 > 0) {
			method8496(false);
			if ((aByte9085 & 0x10) == 0 && aClass121_9046.anInterface17_1481 == null)
				method8490(false);
			method8487();
		}
	}

	public void method2568() {
		if (anInt9077 > 0 && anInt9072 > 0) {
			method8496(false);
			if ((aByte9085 & 0x10) == 0 && aClass121_9046.anInterface17_1481 == null)
				method8490(false);
			method8487();
		}
	}

	public int method2583() {
		if (!aBool9099)
			method2501();
		return aShort9083;
	}

	public int method2571() {
		if (!aBool9099)
			method2501();
		return aShort9083;
	}

	public void method2523(int i) {
		int i_531_ = Class447.anIntArray4906[i];
		int i_532_ = Class447.anIntArray4921[i];
		for (int i_533_ = 0; i_533_ < anInt9058; i_533_++) {
			int i_534_ = ((anIntArray9061[i_533_] * i_531_ + anIntArray9059[i_533_] * i_532_) >> 14);
			anIntArray9061[i_533_] = (anIntArray9061[i_533_] * i_532_ - anIntArray9059[i_533_] * i_531_) >> 14;
			anIntArray9059[i_533_] = i_534_;
		}
		for (int i_535_ = 0; i_535_ < anInt9077; i_535_++) {
			int i_536_ = ((aShortArray9071[i_535_] * i_531_ + aShortArray9108[i_535_] * i_532_) >> 14);
			aShortArray9071[i_535_] = (short) ((aShortArray9071[i_535_] * i_532_ - aShortArray9108[i_535_] * i_531_) >> 14);
			aShortArray9108[i_535_] = (short) i_536_;
		}
		if (aClass130_9106 == null && aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2524(int i) {
		int i_537_ = Class447.anIntArray4906[i];
		int i_538_ = Class447.anIntArray4921[i];
		for (int i_539_ = 0; i_539_ < anInt9058; i_539_++) {
			int i_540_ = ((anIntArray9061[i_539_] * i_537_ + anIntArray9059[i_539_] * i_538_) >> 14);
			anIntArray9061[i_539_] = (anIntArray9061[i_539_] * i_538_ - anIntArray9059[i_539_] * i_537_) >> 14;
			anIntArray9059[i_539_] = i_540_;
		}
		for (int i_541_ = 0; i_541_ < anInt9077; i_541_++) {
			int i_542_ = ((aShortArray9071[i_541_] * i_537_ + aShortArray9108[i_541_] * i_538_) >> 14);
			aShortArray9071[i_541_] = (short) ((aShortArray9071[i_541_] * i_538_ - aShortArray9108[i_541_] * i_537_) >> 14);
			aShortArray9108[i_541_] = (short) i_542_;
		}
		if (aClass130_9106 == null && aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public int method2572() {
		if (!aBool9092)
			method8488();
		return anInt9067;
	}

	public void method2526(int i) {
		int i_543_ = Class447.anIntArray4906[i];
		int i_544_ = Class447.anIntArray4921[i];
		for (int i_545_ = 0; i_545_ < anInt9058; i_545_++) {
			int i_546_ = ((anIntArray9060[i_545_] * i_544_ - anIntArray9061[i_545_] * i_543_) >> 14);
			anIntArray9061[i_545_] = (anIntArray9060[i_545_] * i_543_ + anIntArray9061[i_545_] * i_544_) >> 14;
			anIntArray9060[i_545_] = i_546_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2527(int i) {
		int i_547_ = Class447.anIntArray4906[i];
		int i_548_ = Class447.anIntArray4921[i];
		for (int i_549_ = 0; i_549_ < anInt9058; i_549_++) {
			int i_550_ = ((anIntArray9060[i_549_] * i_548_ - anIntArray9061[i_549_] * i_547_) >> 14);
			anIntArray9061[i_549_] = (anIntArray9060[i_549_] * i_547_ + anIntArray9061[i_549_] * i_548_) >> 14;
			anIntArray9060[i_549_] = i_550_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2489(Class433 class433, int i, boolean bool) {
		if (aShortArray9063 != null) {
			Class433 class433_551_ = class433;
			if (bool) {
				class433_551_ = aClass167_Sub2_9049.aClass433_9282;
				class433_551_.method5196(class433);
			}
			float[] fs = new float[3];
			for (int i_552_ = 0; i_552_ < anInt9058; i_552_++) {
				if ((i & aShortArray9063[i_552_]) != 0) {
					class433_551_.method5215((float) anIntArray9059[i_552_], (float) anIntArray9060[i_552_], (float) anIntArray9061[i_552_], fs);
					anIntArray9059[i_552_] = (int) fs[0];
					anIntArray9060[i_552_] = (int) fs[1];
					anIntArray9061[i_552_] = (int) fs[2];
				}
			}
		}
	}

	public Class536_Sub18_Sub7 method2525(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9077 == 0)
			return null;
		if (!aBool9092)
			method8488();
		int i;
		int i_553_;
		if (aClass167_Sub2_9049.anInt9332 > 0) {
			i = (aShort9095 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_553_ = aShort9096 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i = (aShort9095 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_553_ = aShort9096 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_554_;
		int i_555_;
		if (aClass167_Sub2_9049.anInt9257 > 0) {
			i_554_ = aShort9097 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_555_ = aShort9098 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i_554_ = aShort9097 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_555_ = aShort9098 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_556_ = i_553_ - i + 1;
		int i_557_ = i_555_ - i_554_ + 1;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2_558_;
		if (class536_sub18_sub7_sub2 != null && class536_sub18_sub7_sub2.method11001(i_556_, i_557_)) {
			class536_sub18_sub7_sub2_558_ = class536_sub18_sub7_sub2;
			class536_sub18_sub7_sub2_558_.method11009();
		} else
			class536_sub18_sub7_sub2_558_ = new Class536_Sub18_Sub7_Sub2(aClass167_Sub2_9049, i_556_, i_557_);
		class536_sub18_sub7_sub2_558_.method11000(i, i_554_, i_553_, i_555_);
		method8492(class536_sub18_sub7_sub2_558_);
		return class536_sub18_sub7_sub2_558_;
	}

	public void method2531() {
		for (int i = 0; i < anInt9058; i++)
			anIntArray9061[i] = -anIntArray9061[i];
		for (int i = 0; i < anInt9077; i++)
			aShortArray9071[i] = (short) -aShortArray9071[i];
		for (int i = 0; i < anInt9118; i++) {
			short i_559_ = aShortArray9076[i];
			aShortArray9076[i] = aShortArray9091[i];
			aShortArray9091[i] = i_559_;
		}
		if (aClass130_9106 == null && aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		if (aClass121_9046 != null)
			aClass121_9046.anInterface17_1481 = null;
		aBool9092 = false;
	}

	public boolean method2549(int i, int i_560_, Class433 class433, boolean bool, int i_561_) {
		Class443 class443 = aClass167_Sub2_9049.aClass443_9223;
		class443.method5359(class433);
		class443.method5390(aClass167_Sub2_9049.aClass443_9211);
		boolean bool_562_ = false;
		int i_563_ = 2147483647;
		int i_564_ = -2147483648;
		int i_565_ = 2147483647;
		int i_566_ = -2147483648;
		if (!aBool9092)
			method8488();
		int i_567_ = aShort9096 - aShort9095 >> 1;
		int i_568_ = aShort9094 - aShort9093 >> 1;
		int i_569_ = aShort9098 - aShort9097 >> 1;
		int i_570_ = aShort9095 + i_567_;
		int i_571_ = aShort9093 + i_568_;
		int i_572_ = aShort9097 + i_569_;
		int i_573_ = i_570_ - (i_567_ << i_561_);
		int i_574_ = i_571_ - (i_568_ << i_561_);
		int i_575_ = i_572_ - (i_569_ << i_561_);
		int i_576_ = i_570_ + (i_567_ << i_561_);
		int i_577_ = i_571_ + (i_568_ << i_561_);
		int i_578_ = i_572_ + (i_569_ << i_561_);
		anIntArray9110[0] = i_573_;
		anIntArray9113[0] = i_574_;
		anIntArray9114[0] = i_575_;
		anIntArray9110[1] = i_576_;
		anIntArray9113[1] = i_574_;
		anIntArray9114[1] = i_575_;
		anIntArray9110[2] = i_573_;
		anIntArray9113[2] = i_577_;
		anIntArray9114[2] = i_575_;
		anIntArray9110[3] = i_576_;
		anIntArray9113[3] = i_577_;
		anIntArray9114[3] = i_575_;
		anIntArray9110[4] = i_573_;
		anIntArray9113[4] = i_574_;
		anIntArray9114[4] = i_578_;
		anIntArray9110[5] = i_576_;
		anIntArray9113[5] = i_574_;
		anIntArray9114[5] = i_578_;
		anIntArray9110[6] = i_573_;
		anIntArray9113[6] = i_577_;
		anIntArray9114[6] = i_578_;
		anIntArray9110[7] = i_576_;
		anIntArray9113[7] = i_577_;
		anIntArray9114[7] = i_578_;
		for (int i_579_ = 0; i_579_ < 8; i_579_++) {
			int i_580_ = anIntArray9110[i_579_];
			int i_581_ = anIntArray9113[i_579_];
			int i_582_ = anIntArray9114[i_579_];
			float f = (class443.aFloatArray4878[2] * (float) i_580_ + class443.aFloatArray4878[6] * (float) i_581_ + class443.aFloatArray4878[10] * (float) i_582_ + class443.aFloatArray4878[14]);
			float f_583_ = (class443.aFloatArray4878[3] * (float) i_580_ + class443.aFloatArray4878[7] * (float) i_581_ + class443.aFloatArray4878[11] * (float) i_582_ + class443.aFloatArray4878[15]);
			if (f >= -f_583_) {
				float f_584_ = (class443.aFloatArray4878[0] * (float) i_580_ + class443.aFloatArray4878[4] * (float) i_581_ + class443.aFloatArray4878[8] * (float) i_582_ + class443.aFloatArray4878[12]);
				float f_585_ = (class443.aFloatArray4878[1] * (float) i_580_ + class443.aFloatArray4878[5] * (float) i_581_ + class443.aFloatArray4878[9] * (float) i_582_ + class443.aFloatArray4878[13]);
				int i_586_ = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_584_ / f_583_));
				int i_587_ = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_585_ / f_583_));
				if (i_586_ < i_563_)
					i_563_ = i_586_;
				if (i_586_ > i_564_)
					i_564_ = i_586_;
				if (i_587_ < i_565_)
					i_565_ = i_587_;
				if (i_587_ > i_566_)
					i_566_ = i_587_;
				bool_562_ = true;
			}
		}
		if (bool_562_ && i > i_563_ && i < i_564_ && i_560_ > i_565_ && i_560_ < i_566_) {
			if (bool)
				return true;
			if (aClass167_Sub2_9049.anIntArray9321.length < anInt9077) {
				aClass167_Sub2_9049.anIntArray9321 = new int[anInt9077];
				aClass167_Sub2_9049.anIntArray9320 = new int[anInt9077];
			}
			int[] is = aClass167_Sub2_9049.anIntArray9321;
			int[] is_588_ = aClass167_Sub2_9049.anIntArray9320;
			for (int i_589_ = 0; i_589_ < anInt9058; i_589_++) {
				int i_590_ = anIntArray9059[i_589_];
				int i_591_ = anIntArray9060[i_589_];
				int i_592_ = anIntArray9061[i_589_];
				float f = (class443.aFloatArray4878[2] * (float) i_590_ + class443.aFloatArray4878[6] * (float) i_591_ + class443.aFloatArray4878[10] * (float) i_592_ + class443.aFloatArray4878[14]);
				float f_593_ = (class443.aFloatArray4878[3] * (float) i_590_ + class443.aFloatArray4878[7] * (float) i_591_ + class443.aFloatArray4878[11] * (float) i_592_ + class443.aFloatArray4878[15]);
				if (f >= -f_593_) {
					float f_594_ = (class443.aFloatArray4878[0] * (float) i_590_ + class443.aFloatArray4878[4] * (float) i_591_ + class443.aFloatArray4878[8] * (float) i_592_ + class443.aFloatArray4878[12]);
					float f_595_ = (class443.aFloatArray4878[1] * (float) i_590_ + class443.aFloatArray4878[5] * (float) i_591_ + class443.aFloatArray4878[9] * (float) i_592_ + class443.aFloatArray4878[13]);
					int i_596_ = anIntArray9068[i_589_];
					int i_597_ = anIntArray9068[i_589_ + 1];
					for (int i_598_ = i_596_; i_598_ < i_597_ && aShortArray9103[i_598_] != 0; i_598_++) {
						int i_599_ = (aShortArray9103[i_598_] & 0xffff) - 1;
						is[i_599_] = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_594_ / f_593_));
						is_588_[i_599_] = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_595_ / f_593_));
					}
				} else {
					int i_600_ = anIntArray9068[i_589_];
					int i_601_ = anIntArray9068[i_589_ + 1];
					for (int i_602_ = i_600_; i_602_ < i_601_ && aShortArray9103[i_602_] != 0; i_602_++) {
						int i_603_ = (aShortArray9103[i_602_] & 0xffff) - 1;
						is[i_603_] = -999999;
					}
				}
			}
			for (int i_604_ = 0; i_604_ < anInt9118; i_604_++) {
				if (is[aShortArray9076[i_604_] & 0xffff] != -999999 && is[aShortArray9055[i_604_] & 0xffff] != -999999 && is[aShortArray9091[i_604_] & 0xffff] != -999999 && method8491(i, i_560_, is_588_[aShortArray9076[i_604_] & 0xffff], is_588_[aShortArray9055[i_604_] & 0xffff], is_588_[aShortArray9091[i_604_] & 0xffff], is[aShortArray9076[i_604_] & 0xffff], is[aShortArray9055[i_604_] & 0xffff], is[aShortArray9091[i_604_] & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public int method2522() {
		if (!aBool9092)
			method8488();
		return aShort9098;
	}

	void method2534() {
		/* empty */
	}

	void method2536() {
		/* empty */
	}

	void method2537() {
		/* empty */
	}

	void method2538() {
		/* empty */
	}

	boolean method2539() {
		if (anIntArrayArray9109 == null)
			return false;
		for (int i = 0; i < anInt9057; i++) {
			anIntArray9059[i] <<= 4;
			anIntArray9060[i] <<= 4;
			anIntArray9061[i] <<= 4;
		}
		anInt9073 = 0;
		anInt9052 = 0;
		anInt9117 = 0;
		return true;
	}

	public int method2562() {
		if (!aBool9092)
			method8488();
		return aShort9093;
	}

	public Class536_Sub18_Sub7 method2459(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9077 == 0)
			return null;
		if (!aBool9092)
			method8488();
		int i;
		int i_605_;
		if (aClass167_Sub2_9049.anInt9332 > 0) {
			i = (aShort9095 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_605_ = aShort9096 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i = (aShort9095 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_605_ = aShort9096 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_606_;
		int i_607_;
		if (aClass167_Sub2_9049.anInt9257 > 0) {
			i_606_ = aShort9097 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_607_ = aShort9098 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i_606_ = aShort9097 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_607_ = aShort9098 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_608_ = i_605_ - i + 1;
		int i_609_ = i_607_ - i_606_ + 1;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2_610_;
		if (class536_sub18_sub7_sub2 != null && class536_sub18_sub7_sub2.method11001(i_608_, i_609_)) {
			class536_sub18_sub7_sub2_610_ = class536_sub18_sub7_sub2;
			class536_sub18_sub7_sub2_610_.method11009();
		} else
			class536_sub18_sub7_sub2_610_ = new Class536_Sub18_Sub7_Sub2(aClass167_Sub2_9049, i_608_, i_609_);
		class536_sub18_sub7_sub2_610_.method11000(i, i_606_, i_605_, i_607_);
		method8492(class536_sub18_sub7_sub2_610_);
		return class536_sub18_sub7_sub2_610_;
	}

	public int method2580() {
		if (!aBool9092)
			method8488();
		return aShort9097;
	}

	void method2543() {
		for (int i = 0; i < anInt9057; i++) {
			anIntArray9059[i] = anIntArray9059[i] + 7 >> 4;
			anIntArray9060[i] = anIntArray9060[i] + 7 >> 4;
			anIntArray9061[i] = anIntArray9061[i] + 7 >> 4;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	void method8496(boolean bool) {
		boolean bool_611_ = (aClass130_9065 != null && aClass130_9065.anInterface15_1587 == null);
		boolean bool_612_ = (aClass130_9106 != null && aClass130_9106.anInterface15_1587 == null);
		boolean bool_613_ = (aClass130_9082 != null && aClass130_9082.anInterface15_1587 == null);
		boolean bool_614_ = (aClass130_9086 != null && aClass130_9086.anInterface15_1587 == null);
		if (bool) {
			bool_611_ = bool_611_ & (aByte9085 & 0x2) != 0;
			bool_612_ = bool_612_ & (aByte9085 & 0x4) != 0;
			bool_613_ = bool_613_ & (aByte9085 & 0x1) != 0;
			bool_614_ = bool_614_ & (aByte9085 & 0x8) != 0;
		}
		byte i = 0;
		byte i_615_ = 0;
		byte i_616_ = 0;
		byte i_617_ = 0;
		byte i_618_ = 0;
		if (bool_613_) {
			i_615_ = i;
			i += 12;
		}
		if (bool_611_) {
			i_616_ = i;
			i += 4;
		}
		if (bool_612_) {
			i_617_ = i;
			i += 12;
		}
		if (bool_614_) {
			i_618_ = i;
			i += 8;
		}
		if (i != 0) {
			if ((aClass167_Sub2_9049.aClass536_Sub33_Sub1_9136.buffer).length < anInt9077 * i)
				aClass167_Sub2_9049.aClass536_Sub33_Sub1_9136 = new Class536_Sub33_Sub1((anInt9077 + 100) * i);
			else
				aClass167_Sub2_9049.aClass536_Sub33_Sub1_9136.off = 0;
			Class536_Sub33_Sub1 class536_sub33_sub1 = aClass167_Sub2_9049.aClass536_Sub33_Sub1_9136;
			if (bool_613_) {
				if (aClass167_Sub2_9049.aBool9284) {
					for (int i_619_ = 0; i_619_ < anInt9058; i_619_++) {
						int i_620_ = Stream.floatToRawIntBits((float) anIntArray9059[i_619_]);
						int i_621_ = Stream.floatToRawIntBits((float) anIntArray9060[i_619_]);
						int i_622_ = Stream.floatToRawIntBits((float) anIntArray9061[i_619_]);
						int i_623_ = anIntArray9068[i_619_];
						int i_624_ = anIntArray9068[i_619_ + 1];
						for (int i_625_ = i_623_; i_625_ < i_624_ && aShortArray9103[i_625_] != 0; i_625_++) {
							int i_626_ = (aShortArray9103[i_625_] & 0xffff) - 1;
							class536_sub33_sub1.off = i_626_ * i * 516175515;
							class536_sub33_sub1.writeInt(i_620_, -149241618);
							class536_sub33_sub1.writeInt(i_621_, -149241618);
							class536_sub33_sub1.writeInt(i_622_, -149241618);
						}
					}
				} else {
					for (int i_627_ = 0; i_627_ < anInt9058; i_627_++) {
						int i_628_ = Stream.floatToRawIntBits((float) anIntArray9059[i_627_]);
						int i_629_ = Stream.floatToRawIntBits((float) anIntArray9060[i_627_]);
						int i_630_ = Stream.floatToRawIntBits((float) anIntArray9061[i_627_]);
						int i_631_ = anIntArray9068[i_627_];
						int i_632_ = anIntArray9068[i_627_ + 1];
						for (int i_633_ = i_631_; i_633_ < i_632_ && aShortArray9103[i_633_] != 0; i_633_++) {
							int i_634_ = (aShortArray9103[i_633_] & 0xffff) - 1;
							class536_sub33_sub1.off = i_634_ * i * 516175515;
							class536_sub33_sub1.writeLEInt(i_628_, 465737299);
							class536_sub33_sub1.writeLEInt(i_629_, 1718622608);
							class536_sub33_sub1.writeLEInt(i_630_, 1123586741);
						}
					}
				}
			}
			if (bool_611_) {
				if (aClass130_9106 == null) {
					short[] is;
					short[] is_635_;
					short[] is_636_;
					byte[] is_637_;
					if (aClass162_9069 != null) {
						is = aClass162_9069.aShortArray1774;
						is_635_ = aClass162_9069.aShortArray1771;
						is_636_ = aClass162_9069.aShortArray1773;
						is_637_ = aClass162_9069.aByteArray1772;
					} else {
						is = aShortArray9108;
						is_635_ = aShortArray9066;
						is_636_ = aShortArray9071;
						is_637_ = aByteArray9100;
					}
					float f = aClass167_Sub2_9049.aFloatArray9181[0];
					float f_638_ = aClass167_Sub2_9049.aFloatArray9181[1];
					float f_639_ = aClass167_Sub2_9049.aFloatArray9181[2];
					float f_640_ = aClass167_Sub2_9049.aFloat9250;
					float f_641_ = (aClass167_Sub2_9049.aFloat9251 * 768.0F / (float) aShort9054);
					float f_642_ = (aClass167_Sub2_9049.aFloat9252 * 768.0F / (float) aShort9054);
					for (int i_643_ = 0; i_643_ < anInt9118; i_643_++) {
						int i_644_ = method8498(aShortArray9074[i_643_], aShortArray9079[i_643_], aShort9053, aByteArray9075[i_643_]);
						float f_645_ = ((float) (i_644_ >>> 24) * aClass167_Sub2_9049.aFloat9247);
						float f_646_ = ((float) (i_644_ >> 16 & 0xff) * aClass167_Sub2_9049.aFloat9248);
						float f_647_ = ((float) (i_644_ >> 8 & 0xff) * aClass167_Sub2_9049.aFloat9249);
						int i_648_ = aShortArray9076[i_643_] & 0xffff;
						short i_649_ = (short) is_637_[i_648_];
						float f_650_;
						if (i_649_ == 0)
							f_650_ = ((f * (float) is[i_648_] + f_638_ * (float) is_635_[i_648_] + f_639_ * (float) is_636_[i_648_]) * 0.0026041667F);
						else
							f_650_ = ((f * (float) is[i_648_] + f_638_ * (float) is_635_[i_648_] + f_639_ * (float) is_636_[i_648_]) / (float) (i_649_ * 256));
						float f_651_ = f_640_ + f_650_ * (f_650_ < 0.0F ? f_642_ : f_641_);
						int i_652_ = (int) (f_645_ * f_651_);
						if (i_652_ < 0)
							i_652_ = 0;
						else if (i_652_ > 255)
							i_652_ = 255;
						int i_653_ = (int) (f_646_ * f_651_);
						if (i_653_ < 0)
							i_653_ = 0;
						else if (i_653_ > 255)
							i_653_ = 255;
						int i_654_ = (int) (f_647_ * f_651_);
						if (i_654_ < 0)
							i_654_ = 0;
						else if (i_654_ > 255)
							i_654_ = 255;
						class536_sub33_sub1.off = (i_616_ + i_648_ * i) * 516175515;
						class536_sub33_sub1.writeByte(i_652_, 465637339);
						class536_sub33_sub1.writeByte(i_653_, 465637339);
						class536_sub33_sub1.writeByte(i_654_, 465637339);
						class536_sub33_sub1.writeByte(255 - ((aByteArray9075[i_643_]) & 0xff), 465637339);
						i_648_ = aShortArray9055[i_643_] & 0xffff;
						i_649_ = (short) is_637_[i_648_];
						if (i_649_ == 0)
							f_650_ = ((f * (float) is[i_648_] + f_638_ * (float) is_635_[i_648_] + f_639_ * (float) is_636_[i_648_]) * 0.0026041667F);
						else
							f_650_ = ((f * (float) is[i_648_] + f_638_ * (float) is_635_[i_648_] + f_639_ * (float) is_636_[i_648_]) / (float) (i_649_ * 256));
						f_651_ = f_640_ + f_650_ * (f_650_ < 0.0F ? f_642_ : f_641_);
						i_652_ = (int) (f_645_ * f_651_);
						if (i_652_ < 0)
							i_652_ = 0;
						else if (i_652_ > 255)
							i_652_ = 255;
						i_653_ = (int) (f_646_ * f_651_);
						if (i_653_ < 0)
							i_653_ = 0;
						else if (i_653_ > 255)
							i_653_ = 255;
						i_654_ = (int) (f_647_ * f_651_);
						if (i_654_ < 0)
							i_654_ = 0;
						else if (i_654_ > 255)
							i_654_ = 255;
						class536_sub33_sub1.off = (i_616_ + i_648_ * i) * 516175515;
						class536_sub33_sub1.writeByte(i_652_, 465637339);
						class536_sub33_sub1.writeByte(i_653_, 465637339);
						class536_sub33_sub1.writeByte(i_654_, 465637339);
						class536_sub33_sub1.writeByte(255 - ((aByteArray9075[i_643_]) & 0xff), 465637339);
						i_648_ = aShortArray9091[i_643_] & 0xffff;
						i_649_ = (short) is_637_[i_648_];
						if (i_649_ == 0)
							f_650_ = ((f * (float) is[i_648_] + f_638_ * (float) is_635_[i_648_] + f_639_ * (float) is_636_[i_648_]) * 0.0026041667F);
						else
							f_650_ = ((f * (float) is[i_648_] + f_638_ * (float) is_635_[i_648_] + f_639_ * (float) is_636_[i_648_]) / (float) (i_649_ * 256));
						f_651_ = f_640_ + f_650_ * (f_650_ < 0.0F ? f_642_ : f_641_);
						i_652_ = (int) (f_645_ * f_651_);
						if (i_652_ < 0)
							i_652_ = 0;
						else if (i_652_ > 255)
							i_652_ = 255;
						i_653_ = (int) (f_646_ * f_651_);
						if (i_653_ < 0)
							i_653_ = 0;
						else if (i_653_ > 255)
							i_653_ = 255;
						i_654_ = (int) (f_647_ * f_651_);
						if (i_654_ < 0)
							i_654_ = 0;
						else if (i_654_ > 255)
							i_654_ = 255;
						class536_sub33_sub1.off = (i_616_ + i_648_ * i) * 516175515;
						class536_sub33_sub1.writeByte(i_652_, 465637339);
						class536_sub33_sub1.writeByte(i_653_, 465637339);
						class536_sub33_sub1.writeByte(i_654_, 465637339);
						class536_sub33_sub1.writeByte(255 - ((aByteArray9075[i_643_]) & 0xff), 465637339);
					}
				} else {
					for (int i_655_ = 0; i_655_ < anInt9118; i_655_++) {
						int i_656_ = method8498(aShortArray9074[i_655_], aShortArray9079[i_655_], aShort9053, aByteArray9075[i_655_]);
						class536_sub33_sub1.off = ((i_616_ + (aShortArray9076[i_655_] & 0xffff) * i) * 516175515);
						class536_sub33_sub1.writeInt(i_656_, -149241618);
						class536_sub33_sub1.off = ((i_616_ + (aShortArray9055[i_655_] & 0xffff) * i) * 516175515);
						class536_sub33_sub1.writeInt(i_656_, -149241618);
						class536_sub33_sub1.off = ((i_616_ + (aShortArray9091[i_655_] & 0xffff) * i) * 516175515);
						class536_sub33_sub1.writeInt(i_656_, -149241618);
					}
				}
			}
			if (bool_612_) {
				short[] is;
				short[] is_657_;
				short[] is_658_;
				byte[] is_659_;
				if (aClass162_9069 != null) {
					is = aClass162_9069.aShortArray1774;
					is_657_ = aClass162_9069.aShortArray1771;
					is_658_ = aClass162_9069.aShortArray1773;
					is_659_ = aClass162_9069.aByteArray1772;
				} else {
					is = aShortArray9108;
					is_657_ = aShortArray9066;
					is_658_ = aShortArray9071;
					is_659_ = aByteArray9100;
				}
				float f = 3.0F / (float) aShort9054;
				float f_660_ = 3.0F / (float) (aShort9054 + aShort9054 / 2);
				class536_sub33_sub1.off = i_617_ * 516175515;
				if (aClass167_Sub2_9049.aBool9284) {
					for (int i_661_ = 0; i_661_ < anInt9077; i_661_++) {
						int i_662_ = is_659_[i_661_] & 0xff;
						if (i_662_ == 0) {
							class536_sub33_sub1.method10740((float) is[i_661_] * f_660_);
							class536_sub33_sub1.method10740((float) is_657_[i_661_] * f_660_);
							class536_sub33_sub1.method10740((float) is_658_[i_661_] * f_660_);
						} else {
							float f_663_ = f / (float) i_662_;
							class536_sub33_sub1.method10740((float) is[i_661_] * f_663_);
							class536_sub33_sub1.method10740((float) is_657_[i_661_] * f_663_);
							class536_sub33_sub1.method10740((float) is_658_[i_661_] * f_663_);
						}
						class536_sub33_sub1.off += (i - 12) * 516175515;
					}
				} else {
					for (int i_664_ = 0; i_664_ < anInt9077; i_664_++) {
						int i_665_ = is_659_[i_664_] & 0xff;
						if (i_665_ == 0) {
							class536_sub33_sub1.method10741((float) is[i_664_] * f_660_);
							class536_sub33_sub1.method10741((float) is_657_[i_664_] * f_660_);
							class536_sub33_sub1.method10741((float) is_658_[i_664_] * f_660_);
						} else {
							float f_666_ = f / (float) i_665_;
							class536_sub33_sub1.method10741((float) is[i_664_] * f_666_);
							class536_sub33_sub1.method10741((float) is_657_[i_664_] * f_666_);
							class536_sub33_sub1.method10741((float) is_658_[i_664_] * f_666_);
						}
						class536_sub33_sub1.off += (i - 12) * 516175515;
					}
				}
			}
			if (bool_614_) {
				class536_sub33_sub1.off = i_618_ * 516175515;
				if (aClass167_Sub2_9049.aBool9284) {
					for (int i_667_ = 0; i_667_ < anInt9077; i_667_++) {
						class536_sub33_sub1.method10740(aFloatArray9070[i_667_]);
						class536_sub33_sub1.method10740(aFloatArray9062[i_667_]);
						class536_sub33_sub1.off += (i - 8) * 516175515;
					}
				} else {
					for (int i_668_ = 0; i_668_ < anInt9077; i_668_++) {
						class536_sub33_sub1.method10741(aFloatArray9070[i_668_]);
						class536_sub33_sub1.method10741(aFloatArray9062[i_668_]);
						class536_sub33_sub1.off += (i - 8) * 516175515;
					}
				}
			}
			class536_sub33_sub1.off = i * anInt9077 * 516175515;
			Interface15 interface15;
			if (bool) {
				if (anInterface15_9088 == null)
					anInterface15_9088 = (aClass167_Sub2_9049.method8522(i, class536_sub33_sub1.buffer, class536_sub33_sub1.off * -810172525, true));
				else
					anInterface15_9088.method80(i, (class536_sub33_sub1.buffer), (class536_sub33_sub1.off * -810172525));
				interface15 = anInterface15_9088;
				aByte9085 = (byte) 0;
			} else {
				interface15 = (aClass167_Sub2_9049.method8522(i, class536_sub33_sub1.buffer, class536_sub33_sub1.off * -810172525, false));
				aBool9089 = true;
			}
			if (bool_613_) {
				aClass130_9082.anInterface15_1587 = interface15;
				aClass130_9082.aByte1588 = i_615_;
			}
			if (bool_614_) {
				aClass130_9086.anInterface15_1587 = interface15;
				aClass130_9086.aByte1588 = i_618_;
			}
			if (bool_611_) {
				aClass130_9065.anInterface15_1587 = interface15;
				aClass130_9065.aByte1588 = i_616_;
			}
			if (bool_612_) {
				aClass130_9106.anInterface15_1587 = interface15;
				aClass130_9106.aByte1588 = i_617_;
			}
		}
	}

	void method2545(int i, int[] is, int i_669_, int i_670_, int i_671_, boolean bool, int i_672_, int[] is_673_) {
		int i_674_ = is.length;
		if (i == 0) {
			i_669_ <<= 4;
			i_670_ <<= 4;
			i_671_ <<= 4;
			int i_675_ = 0;
			anInt9073 = 0;
			anInt9052 = 0;
			anInt9117 = 0;
			for (int i_676_ = 0; i_676_ < i_674_; i_676_++) {
				int i_677_ = is[i_676_];
				if (i_677_ < anIntArrayArray9109.length) {
					int[] is_678_ = anIntArrayArray9109[i_677_];
					for (int i_679_ = 0; i_679_ < is_678_.length; i_679_++) {
						int i_680_ = is_678_[i_679_];
						if (aShortArray9063 == null || (i_672_ & aShortArray9063[i_680_]) != 0) {
							anInt9073 += anIntArray9059[i_680_];
							anInt9052 += anIntArray9060[i_680_];
							anInt9117 += anIntArray9061[i_680_];
							i_675_++;
						}
					}
				}
			}
			if (i_675_ > 0) {
				anInt9073 = anInt9073 / i_675_ + i_669_;
				anInt9052 = anInt9052 / i_675_ + i_670_;
				anInt9117 = anInt9117 / i_675_ + i_671_;
				aBool9105 = true;
			} else {
				anInt9073 = i_669_;
				anInt9052 = i_670_;
				anInt9117 = i_671_;
			}
		} else if (i == 1) {
			if (is_673_ != null) {
				int i_681_ = ((is_673_[0] * i_669_ + is_673_[1] * i_670_ + is_673_[2] * i_671_ + 8192) >> 14);
				int i_682_ = ((is_673_[3] * i_669_ + is_673_[4] * i_670_ + is_673_[5] * i_671_ + 8192) >> 14);
				int i_683_ = ((is_673_[6] * i_669_ + is_673_[7] * i_670_ + is_673_[8] * i_671_ + 8192) >> 14);
				i_669_ = i_681_;
				i_670_ = i_682_;
				i_671_ = i_683_;
			}
			i_669_ <<= 4;
			i_670_ <<= 4;
			i_671_ <<= 4;
			for (int i_684_ = 0; i_684_ < i_674_; i_684_++) {
				int i_685_ = is[i_684_];
				if (i_685_ < anIntArrayArray9109.length) {
					int[] is_686_ = anIntArrayArray9109[i_685_];
					for (int i_687_ = 0; i_687_ < is_686_.length; i_687_++) {
						int i_688_ = is_686_[i_687_];
						if (aShortArray9063 == null || (i_672_ & aShortArray9063[i_688_]) != 0) {
							anIntArray9059[i_688_] += i_669_;
							anIntArray9060[i_688_] += i_670_;
							anIntArray9061[i_688_] += i_671_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_673_ != null) {
				int i_689_ = is_673_[9] << 4;
				int i_690_ = is_673_[10] << 4;
				int i_691_ = is_673_[11] << 4;
				int i_692_ = is_673_[12] << 4;
				int i_693_ = is_673_[13] << 4;
				int i_694_ = is_673_[14] << 4;
				if (aBool9105) {
					int i_695_ = ((is_673_[0] * anInt9073 + is_673_[3] * anInt9052 + is_673_[6] * anInt9117 + 8192) >> 14);
					int i_696_ = ((is_673_[1] * anInt9073 + is_673_[4] * anInt9052 + is_673_[7] * anInt9117 + 8192) >> 14);
					int i_697_ = ((is_673_[2] * anInt9073 + is_673_[5] * anInt9052 + is_673_[8] * anInt9117 + 8192) >> 14);
					i_695_ += i_692_;
					i_696_ += i_693_;
					i_697_ += i_694_;
					anInt9073 = i_695_;
					anInt9052 = i_696_;
					anInt9117 = i_697_;
					aBool9105 = false;
				}
				int[] is_698_ = new int[9];
				int i_699_ = Class447.anIntArray4921[i_669_];
				int i_700_ = Class447.anIntArray4906[i_669_];
				int i_701_ = Class447.anIntArray4921[i_670_];
				int i_702_ = Class447.anIntArray4906[i_670_];
				int i_703_ = Class447.anIntArray4921[i_671_];
				int i_704_ = Class447.anIntArray4906[i_671_];
				int i_705_ = i_700_ * i_703_ + 8192 >> 14;
				int i_706_ = i_700_ * i_704_ + 8192 >> 14;
				is_698_[0] = i_701_ * i_703_ + i_702_ * i_706_ + 8192 >> 14;
				is_698_[1] = -i_701_ * i_704_ + i_702_ * i_705_ + 8192 >> 14;
				is_698_[2] = i_702_ * i_699_ + 8192 >> 14;
				is_698_[3] = i_699_ * i_704_ + 8192 >> 14;
				is_698_[4] = i_699_ * i_703_ + 8192 >> 14;
				is_698_[5] = -i_700_;
				is_698_[6] = -i_702_ * i_703_ + i_701_ * i_706_ + 8192 >> 14;
				is_698_[7] = i_702_ * i_704_ + i_701_ * i_705_ + 8192 >> 14;
				is_698_[8] = i_701_ * i_699_ + 8192 >> 14;
				int i_707_ = (is_698_[0] * -anInt9073 + is_698_[1] * -anInt9052 + is_698_[2] * -anInt9117 + 8192) >> 14;
				int i_708_ = (is_698_[3] * -anInt9073 + is_698_[4] * -anInt9052 + is_698_[5] * -anInt9117 + 8192) >> 14;
				int i_709_ = (is_698_[6] * -anInt9073 + is_698_[7] * -anInt9052 + is_698_[8] * -anInt9117 + 8192) >> 14;
				int i_710_ = i_707_ + anInt9073;
				int i_711_ = i_708_ + anInt9052;
				int i_712_ = i_709_ + anInt9117;
				int[] is_713_ = new int[9];
				for (int i_714_ = 0; i_714_ < 3; i_714_++) {
					for (int i_715_ = 0; i_715_ < 3; i_715_++) {
						int i_716_ = 0;
						for (int i_717_ = 0; i_717_ < 3; i_717_++)
							i_716_ += (is_698_[i_714_ * 3 + i_717_] * is_673_[i_715_ * 3 + i_717_]);
						is_713_[i_714_ * 3 + i_715_] = i_716_ + 8192 >> 14;
					}
				}
				int i_718_ = ((is_698_[0] * i_692_ + is_698_[1] * i_693_ + is_698_[2] * i_694_ + 8192) >> 14);
				int i_719_ = ((is_698_[3] * i_692_ + is_698_[4] * i_693_ + is_698_[5] * i_694_ + 8192) >> 14);
				int i_720_ = ((is_698_[6] * i_692_ + is_698_[7] * i_693_ + is_698_[8] * i_694_ + 8192) >> 14);
				i_718_ += i_710_;
				i_719_ += i_711_;
				i_720_ += i_712_;
				int[] is_721_ = new int[9];
				for (int i_722_ = 0; i_722_ < 3; i_722_++) {
					for (int i_723_ = 0; i_723_ < 3; i_723_++) {
						int i_724_ = 0;
						for (int i_725_ = 0; i_725_ < 3; i_725_++)
							i_724_ += (is_673_[i_722_ * 3 + i_725_] * is_713_[i_723_ + i_725_ * 3]);
						is_721_[i_722_ * 3 + i_723_] = i_724_ + 8192 >> 14;
					}
				}
				int i_726_ = ((is_673_[0] * i_718_ + is_673_[1] * i_719_ + is_673_[2] * i_720_ + 8192) >> 14);
				int i_727_ = ((is_673_[3] * i_718_ + is_673_[4] * i_719_ + is_673_[5] * i_720_ + 8192) >> 14);
				int i_728_ = ((is_673_[6] * i_718_ + is_673_[7] * i_719_ + is_673_[8] * i_720_ + 8192) >> 14);
				i_726_ += i_689_;
				i_727_ += i_690_;
				i_728_ += i_691_;
				for (int i_729_ = 0; i_729_ < i_674_; i_729_++) {
					int i_730_ = is[i_729_];
					if (i_730_ < anIntArrayArray9109.length) {
						int[] is_731_ = anIntArrayArray9109[i_730_];
						for (int i_732_ = 0; i_732_ < is_731_.length; i_732_++) {
							int i_733_ = is_731_[i_732_];
							if (aShortArray9063 == null || (i_672_ & aShortArray9063[i_733_]) != 0) {
								int i_734_ = ((is_721_[0] * anIntArray9059[i_733_] + is_721_[1] * anIntArray9060[i_733_] + is_721_[2] * anIntArray9061[i_733_] + 8192) >> 14);
								int i_735_ = ((is_721_[3] * anIntArray9059[i_733_] + is_721_[4] * anIntArray9060[i_733_] + is_721_[5] * anIntArray9061[i_733_] + 8192) >> 14);
								int i_736_ = ((is_721_[6] * anIntArray9059[i_733_] + is_721_[7] * anIntArray9060[i_733_] + is_721_[8] * anIntArray9061[i_733_] + 8192) >> 14);
								i_734_ += i_726_;
								i_735_ += i_727_;
								i_736_ += i_728_;
								anIntArray9059[i_733_] = i_734_;
								anIntArray9060[i_733_] = i_735_;
								anIntArray9061[i_733_] = i_736_;
							}
						}
					}
				}
			} else {
				for (int i_737_ = 0; i_737_ < i_674_; i_737_++) {
					int i_738_ = is[i_737_];
					if (i_738_ < anIntArrayArray9109.length) {
						int[] is_739_ = anIntArrayArray9109[i_738_];
						for (int i_740_ = 0; i_740_ < is_739_.length; i_740_++) {
							int i_741_ = is_739_[i_740_];
							if (aShortArray9063 == null || (i_672_ & aShortArray9063[i_741_]) != 0) {
								anIntArray9059[i_741_] -= anInt9073;
								anIntArray9060[i_741_] -= anInt9052;
								anIntArray9061[i_741_] -= anInt9117;
								if (i_671_ != 0) {
									int i_742_ = Class447.anIntArray4906[i_671_];
									int i_743_ = Class447.anIntArray4921[i_671_];
									int i_744_ = ((anIntArray9060[i_741_] * i_742_ + anIntArray9059[i_741_] * i_743_ + 16383) >> 14);
									anIntArray9060[i_741_] = (anIntArray9060[i_741_] * i_743_ - anIntArray9059[i_741_] * i_742_ + 16383) >> 14;
									anIntArray9059[i_741_] = i_744_;
								}
								if (i_669_ != 0) {
									int i_745_ = Class447.anIntArray4906[i_669_];
									int i_746_ = Class447.anIntArray4921[i_669_];
									int i_747_ = ((anIntArray9060[i_741_] * i_746_ - anIntArray9061[i_741_] * i_745_ + 16383) >> 14);
									anIntArray9061[i_741_] = (anIntArray9060[i_741_] * i_745_ + anIntArray9061[i_741_] * i_746_ + 16383) >> 14;
									anIntArray9060[i_741_] = i_747_;
								}
								if (i_670_ != 0) {
									int i_748_ = Class447.anIntArray4906[i_670_];
									int i_749_ = Class447.anIntArray4921[i_670_];
									int i_750_ = ((anIntArray9061[i_741_] * i_748_ + anIntArray9059[i_741_] * i_749_ + 16383) >> 14);
									anIntArray9061[i_741_] = (anIntArray9061[i_741_] * i_749_ - anIntArray9059[i_741_] * i_748_ + 16383) >> 14;
									anIntArray9059[i_741_] = i_750_;
								}
								anIntArray9059[i_741_] += anInt9073;
								anIntArray9060[i_741_] += anInt9052;
								anIntArray9061[i_741_] += anInt9117;
							}
						}
					}
				}
				if (bool) {
					for (int i_751_ = 0; i_751_ < i_674_; i_751_++) {
						int i_752_ = is[i_751_];
						if (i_752_ < anIntArrayArray9109.length) {
							int[] is_753_ = anIntArrayArray9109[i_752_];
							for (int i_754_ = 0; i_754_ < is_753_.length; i_754_++) {
								int i_755_ = is_753_[i_754_];
								if (aShortArray9063 == null || ((i_672_ & aShortArray9063[i_755_]) != 0)) {
									int i_756_ = anIntArray9068[i_755_];
									int i_757_ = anIntArray9068[i_755_ + 1];
									for (int i_758_ = i_756_; (i_758_ < i_757_ && aShortArray9103[i_758_] != 0); i_758_++) {
										int i_759_ = ((aShortArray9103[i_758_] & 0xffff) - 1);
										if (i_671_ != 0) {
											int i_760_ = (Class447.anIntArray4906[i_671_]);
											int i_761_ = (Class447.anIntArray4921[i_671_]);
											int i_762_ = (((aShortArray9066[i_759_] * i_760_) + (aShortArray9108[i_759_] * i_761_) + 16383) >> 14);
											aShortArray9066[i_759_] = (short) (((aShortArray9066[i_759_]) * i_761_ - ((aShortArray9108[i_759_]) * i_760_) + 16383) >> 14);
											aShortArray9108[i_759_] = (short) i_762_;
										}
										if (i_669_ != 0) {
											int i_763_ = (Class447.anIntArray4906[i_669_]);
											int i_764_ = (Class447.anIntArray4921[i_669_]);
											int i_765_ = (((aShortArray9066[i_759_] * i_764_) - (aShortArray9071[i_759_] * i_763_) + 16383) >> 14);
											aShortArray9071[i_759_] = (short) (((aShortArray9066[i_759_]) * i_763_ + ((aShortArray9071[i_759_]) * i_764_) + 16383) >> 14);
											aShortArray9066[i_759_] = (short) i_765_;
										}
										if (i_670_ != 0) {
											int i_766_ = (Class447.anIntArray4906[i_670_]);
											int i_767_ = (Class447.anIntArray4921[i_670_]);
											int i_768_ = (((aShortArray9071[i_759_] * i_766_) + (aShortArray9108[i_759_] * i_767_) + 16383) >> 14);
											aShortArray9071[i_759_] = (short) (((aShortArray9071[i_759_]) * i_767_ - ((aShortArray9108[i_759_]) * i_766_) + 16383) >> 14);
											aShortArray9108[i_759_] = (short) i_768_;
										}
									}
								}
							}
						}
					}
					if (aClass130_9106 == null && aClass130_9065 != null)
						aClass130_9065.anInterface15_1587 = null;
					if (aClass130_9106 != null)
						aClass130_9106.anInterface15_1587 = null;
				}
			}
		} else if (i == 3) {
			if (is_673_ != null) {
				int i_769_ = is_673_[9] << 4;
				int i_770_ = is_673_[10] << 4;
				int i_771_ = is_673_[11] << 4;
				int i_772_ = is_673_[12] << 4;
				int i_773_ = is_673_[13] << 4;
				int i_774_ = is_673_[14] << 4;
				if (aBool9105) {
					int i_775_ = ((is_673_[0] * anInt9073 + is_673_[3] * anInt9052 + is_673_[6] * anInt9117 + 8192) >> 14);
					int i_776_ = ((is_673_[1] * anInt9073 + is_673_[4] * anInt9052 + is_673_[7] * anInt9117 + 8192) >> 14);
					int i_777_ = ((is_673_[2] * anInt9073 + is_673_[5] * anInt9052 + is_673_[8] * anInt9117 + 8192) >> 14);
					i_775_ += i_772_;
					i_776_ += i_773_;
					i_777_ += i_774_;
					anInt9073 = i_775_;
					anInt9052 = i_776_;
					anInt9117 = i_777_;
					aBool9105 = false;
				}
				int i_778_ = i_669_ << 15 >> 7;
				int i_779_ = i_670_ << 15 >> 7;
				int i_780_ = i_671_ << 15 >> 7;
				int i_781_ = i_778_ * -anInt9073 + 8192 >> 14;
				int i_782_ = i_779_ * -anInt9052 + 8192 >> 14;
				int i_783_ = i_780_ * -anInt9117 + 8192 >> 14;
				int i_784_ = i_781_ + anInt9073;
				int i_785_ = i_782_ + anInt9052;
				int i_786_ = i_783_ + anInt9117;
				int[] is_787_ = new int[9];
				is_787_[0] = i_778_ * is_673_[0] + 8192 >> 14;
				is_787_[1] = i_778_ * is_673_[3] + 8192 >> 14;
				is_787_[2] = i_778_ * is_673_[6] + 8192 >> 14;
				is_787_[3] = i_779_ * is_673_[1] + 8192 >> 14;
				is_787_[4] = i_779_ * is_673_[4] + 8192 >> 14;
				is_787_[5] = i_779_ * is_673_[7] + 8192 >> 14;
				is_787_[6] = i_780_ * is_673_[2] + 8192 >> 14;
				is_787_[7] = i_780_ * is_673_[5] + 8192 >> 14;
				is_787_[8] = i_780_ * is_673_[8] + 8192 >> 14;
				int i_788_ = i_778_ * i_772_ + 8192 >> 14;
				int i_789_ = i_779_ * i_773_ + 8192 >> 14;
				int i_790_ = i_780_ * i_774_ + 8192 >> 14;
				i_788_ += i_784_;
				i_789_ += i_785_;
				i_790_ += i_786_;
				int[] is_791_ = new int[9];
				for (int i_792_ = 0; i_792_ < 3; i_792_++) {
					for (int i_793_ = 0; i_793_ < 3; i_793_++) {
						int i_794_ = 0;
						for (int i_795_ = 0; i_795_ < 3; i_795_++)
							i_794_ += (is_673_[i_792_ * 3 + i_795_] * is_787_[i_793_ + i_795_ * 3]);
						is_791_[i_792_ * 3 + i_793_] = i_794_ + 8192 >> 14;
					}
				}
				int i_796_ = ((is_673_[0] * i_788_ + is_673_[1] * i_789_ + is_673_[2] * i_790_ + 8192) >> 14);
				int i_797_ = ((is_673_[3] * i_788_ + is_673_[4] * i_789_ + is_673_[5] * i_790_ + 8192) >> 14);
				int i_798_ = ((is_673_[6] * i_788_ + is_673_[7] * i_789_ + is_673_[8] * i_790_ + 8192) >> 14);
				i_796_ += i_769_;
				i_797_ += i_770_;
				i_798_ += i_771_;
				for (int i_799_ = 0; i_799_ < i_674_; i_799_++) {
					int i_800_ = is[i_799_];
					if (i_800_ < anIntArrayArray9109.length) {
						int[] is_801_ = anIntArrayArray9109[i_800_];
						for (int i_802_ = 0; i_802_ < is_801_.length; i_802_++) {
							int i_803_ = is_801_[i_802_];
							if (aShortArray9063 == null || (i_672_ & aShortArray9063[i_803_]) != 0) {
								int i_804_ = ((is_791_[0] * anIntArray9059[i_803_] + is_791_[1] * anIntArray9060[i_803_] + is_791_[2] * anIntArray9061[i_803_] + 8192) >> 14);
								int i_805_ = ((is_791_[3] * anIntArray9059[i_803_] + is_791_[4] * anIntArray9060[i_803_] + is_791_[5] * anIntArray9061[i_803_] + 8192) >> 14);
								int i_806_ = ((is_791_[6] * anIntArray9059[i_803_] + is_791_[7] * anIntArray9060[i_803_] + is_791_[8] * anIntArray9061[i_803_] + 8192) >> 14);
								i_804_ += i_796_;
								i_805_ += i_797_;
								i_806_ += i_798_;
								anIntArray9059[i_803_] = i_804_;
								anIntArray9060[i_803_] = i_805_;
								anIntArray9061[i_803_] = i_806_;
							}
						}
					}
				}
			} else {
				for (int i_807_ = 0; i_807_ < i_674_; i_807_++) {
					int i_808_ = is[i_807_];
					if (i_808_ < anIntArrayArray9109.length) {
						int[] is_809_ = anIntArrayArray9109[i_808_];
						for (int i_810_ = 0; i_810_ < is_809_.length; i_810_++) {
							int i_811_ = is_809_[i_810_];
							if (aShortArray9063 == null || (i_672_ & aShortArray9063[i_811_]) != 0) {
								anIntArray9059[i_811_] -= anInt9073;
								anIntArray9060[i_811_] -= anInt9052;
								anIntArray9061[i_811_] -= anInt9117;
								anIntArray9059[i_811_] = anIntArray9059[i_811_] * i_669_ >> 7;
								anIntArray9060[i_811_] = anIntArray9060[i_811_] * i_670_ >> 7;
								anIntArray9061[i_811_] = anIntArray9061[i_811_] * i_671_ >> 7;
								anIntArray9059[i_811_] += anInt9073;
								anIntArray9060[i_811_] += anInt9052;
								anIntArray9061[i_811_] += anInt9117;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9080 != null) {
				for (int i_812_ = 0; i_812_ < i_674_; i_812_++) {
					int i_813_ = is[i_812_];
					if (i_813_ < anIntArrayArray9080.length) {
						int[] is_814_ = anIntArrayArray9080[i_813_];
						for (int i_815_ = 0; i_815_ < is_814_.length; i_815_++) {
							int i_816_ = is_814_[i_815_];
							if (aShortArray9081 == null || (i_672_ & aShortArray9081[i_816_]) != 0) {
								int i_817_ = ((aByteArray9075[i_816_] & 0xff) + i_669_ * 8);
								if (i_817_ < 0)
									i_817_ = 0;
								else if (i_817_ > 255)
									i_817_ = 255;
								aByteArray9075[i_816_] = (byte) i_817_;
								if (aClass130_9065 != null)
									aClass130_9065.anInterface15_1587 = null;
							}
						}
					}
				}
				if (aClass142Array9107 != null) {
					for (int i_818_ = 0; i_818_ < anInt9116; i_818_++) {
						Class142 class142 = aClass142Array9107[i_818_];
						Class132 class132 = aClass132Array9102[i_818_];
						class132.anInt1603 = (class132.anInt1603 & 0xffffff | 255 - (aByteArray9075[class142.anInt1663] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9080 != null) {
				for (int i_819_ = 0; i_819_ < i_674_; i_819_++) {
					int i_820_ = is[i_819_];
					if (i_820_ < anIntArrayArray9080.length) {
						int[] is_821_ = anIntArrayArray9080[i_820_];
						for (int i_822_ = 0; i_822_ < is_821_.length; i_822_++) {
							int i_823_ = is_821_[i_822_];
							if (aShortArray9081 == null || (i_672_ & aShortArray9081[i_823_]) != 0) {
								int i_824_ = aShortArray9074[i_823_] & 0xffff;
								int i_825_ = i_824_ >> 10 & 0x3f;
								int i_826_ = i_824_ >> 7 & 0x7;
								int i_827_ = i_824_ & 0x7f;
								i_825_ = i_825_ + i_669_ & 0x3f;
								i_826_ += i_670_ / 4;
								if (i_826_ < 0)
									i_826_ = 0;
								else if (i_826_ > 7)
									i_826_ = 7;
								i_827_ += i_671_;
								if (i_827_ < 0)
									i_827_ = 0;
								else if (i_827_ > 127)
									i_827_ = 127;
								aShortArray9074[i_823_] = (short) (i_825_ << 10 | i_826_ << 7 | i_827_);
								if (aClass130_9065 != null)
									aClass130_9065.anInterface15_1587 = null;
							}
						}
					}
				}
				if (aClass142Array9107 != null) {
					for (int i_828_ = 0; i_828_ < anInt9116; i_828_++) {
						Class142 class142 = aClass142Array9107[i_828_];
						Class132 class132 = aClass132Array9102[i_828_];
						class132.anInt1603 = (class132.anInt1603 & ~0xffffff | (Class639.anIntArray8309[(aShortArray9074[class142.anInt1663] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9112 != null) {
				for (int i_829_ = 0; i_829_ < i_674_; i_829_++) {
					int i_830_ = is[i_829_];
					if (i_830_ < anIntArrayArray9112.length) {
						int[] is_831_ = anIntArrayArray9112[i_830_];
						for (int i_832_ = 0; i_832_ < is_831_.length; i_832_++) {
							Class132 class132 = aClass132Array9102[is_831_[i_832_]];
							class132.anInt1606 += i_669_;
							class132.anInt1607 += i_670_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9112 != null) {
				for (int i_833_ = 0; i_833_ < i_674_; i_833_++) {
					int i_834_ = is[i_833_];
					if (i_834_ < anIntArrayArray9112.length) {
						int[] is_835_ = anIntArrayArray9112[i_834_];
						for (int i_836_ = 0; i_836_ < is_835_.length; i_836_++) {
							Class132 class132 = aClass132Array9102[is_835_[i_836_]];
							class132.anInt1608 = class132.anInt1608 * i_669_ >> 7;
							class132.anInt1604 = class132.anInt1604 * i_670_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9112 != null) {
				for (int i_837_ = 0; i_837_ < i_674_; i_837_++) {
					int i_838_ = is[i_837_];
					if (i_838_ < anIntArrayArray9112.length) {
						int[] is_839_ = anIntArrayArray9112[i_838_];
						for (int i_840_ = 0; i_840_ < is_839_.length; i_840_++) {
							Class132 class132 = aClass132Array9102[is_839_[i_840_]];
							class132.anInt1605 = class132.anInt1605 + i_669_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2520(Class433 class433) {
		Class443 class443 = aClass167_Sub2_9049.aClass443_9223;
		class443.method5359(class433);
		if (aClass172Array9104 != null) {
			for (int i = 0; i < aClass172Array9104.length; i++) {
				Class172 class172 = aClass172Array9104[i];
				Class172 class172_841_ = class172;
				if (class172.aClass172_1910 != null)
					class172_841_ = class172.aClass172_1910;
				class172_841_.anInt1913 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9059[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9060[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9061[(class172.anInt1909 * -1506968299)])))) * -1971428173);
				class172_841_.anInt1914 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9059[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9060[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9061[(class172.anInt1909 * -1506968299)])))) * 179150469);
				class172_841_.anInt1915 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9059[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9060[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9061[(class172.anInt1909 * -1506968299)])))) * -26173683);
				class172_841_.anInt1907 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9059[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9060[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9061[(class172.anInt1916 * -1724466837)])))) * 163461589);
				class172_841_.anInt1917 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9059[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9060[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9061[(class172.anInt1916 * -1724466837)])))) * 555769531);
				class172_841_.anInt1918 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9059[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9060[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9061[(class172.anInt1916 * -1724466837)])))) * -379440279);
				class172_841_.anInt1919 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9059[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9060[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9061[(class172.anInt1911 * -767867943)])))) * -767320321);
				class172_841_.anInt1920 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9059[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9060[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9061[(class172.anInt1911 * -767867943)])))) * 1270728077);
				class172_841_.anInt1921 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9059[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9060[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9061[(class172.anInt1911 * -767867943)])))) * -2080843121);
			}
		}
		if (aClass156Array9064 != null) {
			for (int i = 0; i < aClass156Array9064.length; i++) {
				Class156 class156 = aClass156Array9064[i];
				Class156 class156_842_ = class156;
				if (class156.aClass156_1735 != null)
					class156_842_ = class156.aClass156_1735;
				if (class156.aClass443_1740 != null)
					class156.aClass443_1740.method5339(class443);
				else
					class156.aClass443_1740 = new Class443(class443);
				class156_842_.anInt1734 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9059[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9060[(class156.anInt1738 * -986127555)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9061[(class156.anInt1738 * -986127555)])))) * 1464786499);
				class156_842_.anInt1737 = (int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) (anIntArray9059[class156.anInt1738 * -986127555])) + (class443.aFloatArray4878[5] * (float) anIntArray9060[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[9] * (float) (anIntArray9061[(class156.anInt1738 * -986127555)])))) * 524114341;
				class156_842_.anInt1739 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9059[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9060[(class156.anInt1738 * -986127555)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9061[(class156.anInt1738 * -986127555)])))) * -1766187741);
			}
		}
	}

	Class177 method8497(Class177_Sub1 class177_sub1_843_, Class177_Sub1 class177_sub1_844_, int i, boolean bool, boolean bool_845_) {
		class177_sub1_843_.aByte9085 = (byte) 0;
		class177_sub1_843_.anInt9050 = i;
		class177_sub1_843_.anInt9051 = anInt9051;
		class177_sub1_843_.aShort9053 = aShort9053;
		class177_sub1_843_.aShort9054 = aShort9054;
		class177_sub1_843_.anInt9057 = anInt9057;
		class177_sub1_843_.anInt9058 = anInt9058;
		class177_sub1_843_.anInt9077 = anInt9077;
		class177_sub1_843_.anInt9118 = anInt9118;
		class177_sub1_843_.anInt9072 = anInt9072;
		class177_sub1_843_.anInt9116 = anInt9116;
		if ((i & 0x100) != 0)
			class177_sub1_843_.aBool9084 = true;
		else
			class177_sub1_843_.aBool9084 = aBool9084;
		class177_sub1_843_.aBool9056 = aBool9056;
		boolean bool_846_ = Class118.method1509(i, anInt9051);
		boolean bool_847_ = Class118.method1559(i, anInt9051);
		boolean bool_848_ = Class118.method1511(i, anInt9051);
		boolean bool_849_ = bool_846_ | bool_847_ | bool_848_;
		if (bool_849_) {
			if (bool_846_) {
				if (class177_sub1_844_.anIntArray9059 == null || class177_sub1_844_.anIntArray9059.length < anInt9057)
					class177_sub1_843_.anIntArray9059 = class177_sub1_844_.anIntArray9059 = new int[anInt9057];
				else
					class177_sub1_843_.anIntArray9059 = class177_sub1_844_.anIntArray9059;
			} else
				class177_sub1_843_.anIntArray9059 = anIntArray9059;
			if (bool_847_) {
				if (class177_sub1_844_.anIntArray9060 == null || class177_sub1_844_.anIntArray9060.length < anInt9057)
					class177_sub1_843_.anIntArray9060 = class177_sub1_844_.anIntArray9060 = new int[anInt9057];
				else
					class177_sub1_843_.anIntArray9060 = class177_sub1_844_.anIntArray9060;
			} else
				class177_sub1_843_.anIntArray9060 = anIntArray9060;
			if (bool_848_) {
				if (class177_sub1_844_.anIntArray9061 == null || class177_sub1_844_.anIntArray9061.length < anInt9057)
					class177_sub1_843_.anIntArray9061 = class177_sub1_844_.anIntArray9061 = new int[anInt9057];
				else
					class177_sub1_843_.anIntArray9061 = class177_sub1_844_.anIntArray9061;
			} else
				class177_sub1_843_.anIntArray9061 = anIntArray9061;
			for (int i_850_ = 0; i_850_ < anInt9057; i_850_++) {
				if (bool_846_)
					class177_sub1_843_.anIntArray9059[i_850_] = anIntArray9059[i_850_];
				if (bool_847_)
					class177_sub1_843_.anIntArray9060[i_850_] = anIntArray9060[i_850_];
				if (bool_848_)
					class177_sub1_843_.anIntArray9061[i_850_] = anIntArray9061[i_850_];
			}
		} else {
			class177_sub1_843_.anIntArray9059 = anIntArray9059;
			class177_sub1_843_.anIntArray9060 = anIntArray9060;
			class177_sub1_843_.anIntArray9061 = anIntArray9061;
		}
		if (Class118.method1589(i, anInt9051)) {
			if (bool)
				class177_sub1_843_.aByte9085 |= 0x1;
			class177_sub1_843_.aClass130_9082 = class177_sub1_844_.aClass130_9082;
			class177_sub1_843_.aClass130_9082.aByte1588 = aClass130_9082.aByte1588;
			class177_sub1_843_.aClass130_9082.anInterface15_1587 = aClass130_9082.anInterface15_1587;
		} else if (Class118.method1521(i, anInt9051))
			class177_sub1_843_.aClass130_9082 = aClass130_9082;
		else
			class177_sub1_843_.aClass130_9082 = null;
		if (Class118.method1514(i, anInt9051)) {
			if (class177_sub1_844_.aShortArray9074 == null || class177_sub1_844_.aShortArray9074.length < anInt9118)
				class177_sub1_843_.aShortArray9074 = class177_sub1_844_.aShortArray9074 = new short[anInt9118];
			else
				class177_sub1_843_.aShortArray9074 = class177_sub1_844_.aShortArray9074;
			for (int i_851_ = 0; i_851_ < anInt9118; i_851_++)
				class177_sub1_843_.aShortArray9074[i_851_] = aShortArray9074[i_851_];
		} else
			class177_sub1_843_.aShortArray9074 = aShortArray9074;
		if (Class118.method1586(i, anInt9051)) {
			if (class177_sub1_844_.aByteArray9075 == null || class177_sub1_844_.aByteArray9075.length < anInt9118)
				class177_sub1_843_.aByteArray9075 = class177_sub1_844_.aByteArray9075 = new byte[anInt9118];
			else
				class177_sub1_843_.aByteArray9075 = class177_sub1_844_.aByteArray9075;
			for (int i_852_ = 0; i_852_ < anInt9118; i_852_++)
				class177_sub1_843_.aByteArray9075[i_852_] = aByteArray9075[i_852_];
		} else
			class177_sub1_843_.aByteArray9075 = aByteArray9075;
		if (Class118.method1528(i, anInt9051)) {
			if (bool)
				class177_sub1_843_.aByte9085 |= 0x2;
			class177_sub1_843_.aClass130_9065 = class177_sub1_844_.aClass130_9065;
			class177_sub1_843_.aClass130_9065.aByte1588 = aClass130_9065.aByte1588;
			class177_sub1_843_.aClass130_9065.anInterface15_1587 = aClass130_9065.anInterface15_1587;
		} else if (Class118.method1510(i, anInt9051))
			class177_sub1_843_.aClass130_9065 = aClass130_9065;
		else
			class177_sub1_843_.aClass130_9065 = null;
		if (Class118.method1513(i, anInt9051)) {
			if (class177_sub1_844_.aShortArray9108 == null || class177_sub1_844_.aShortArray9108.length < anInt9077) {
				int i_853_ = anInt9077;
				class177_sub1_843_.aShortArray9108 = class177_sub1_844_.aShortArray9108 = new short[i_853_];
				class177_sub1_843_.aShortArray9066 = class177_sub1_844_.aShortArray9066 = new short[i_853_];
				class177_sub1_843_.aShortArray9071 = class177_sub1_844_.aShortArray9071 = new short[i_853_];
			} else {
				class177_sub1_843_.aShortArray9108 = class177_sub1_844_.aShortArray9108;
				class177_sub1_843_.aShortArray9066 = class177_sub1_844_.aShortArray9066;
				class177_sub1_843_.aShortArray9071 = class177_sub1_844_.aShortArray9071;
			}
			if (aClass162_9069 != null) {
				if (class177_sub1_844_.aClass162_9069 == null)
					class177_sub1_844_.aClass162_9069 = new Class162();
				Class162 class162 = (class177_sub1_843_.aClass162_9069 = class177_sub1_844_.aClass162_9069);
				if (class162.aShortArray1774 == null || class162.aShortArray1774.length < anInt9077) {
					int i_854_ = anInt9077;
					class162.aShortArray1774 = new short[i_854_];
					class162.aShortArray1771 = new short[i_854_];
					class162.aShortArray1773 = new short[i_854_];
					class162.aByteArray1772 = new byte[i_854_];
				}
				for (int i_855_ = 0; i_855_ < anInt9077; i_855_++) {
					class177_sub1_843_.aShortArray9108[i_855_] = aShortArray9108[i_855_];
					class177_sub1_843_.aShortArray9066[i_855_] = aShortArray9066[i_855_];
					class177_sub1_843_.aShortArray9071[i_855_] = aShortArray9071[i_855_];
					class162.aShortArray1774[i_855_] = aClass162_9069.aShortArray1774[i_855_];
					class162.aShortArray1771[i_855_] = aClass162_9069.aShortArray1771[i_855_];
					class162.aShortArray1773[i_855_] = aClass162_9069.aShortArray1773[i_855_];
					class162.aByteArray1772[i_855_] = aClass162_9069.aByteArray1772[i_855_];
				}
			} else {
				for (int i_856_ = 0; i_856_ < anInt9077; i_856_++) {
					class177_sub1_843_.aShortArray9108[i_856_] = aShortArray9108[i_856_];
					class177_sub1_843_.aShortArray9066[i_856_] = aShortArray9066[i_856_];
					class177_sub1_843_.aShortArray9071[i_856_] = aShortArray9071[i_856_];
				}
			}
			class177_sub1_843_.aByteArray9100 = aByteArray9100;
		} else {
			class177_sub1_843_.aClass162_9069 = aClass162_9069;
			class177_sub1_843_.aShortArray9108 = aShortArray9108;
			class177_sub1_843_.aShortArray9066 = aShortArray9066;
			class177_sub1_843_.aShortArray9071 = aShortArray9071;
			class177_sub1_843_.aByteArray9100 = aByteArray9100;
		}
		if (Class118.method1561(i, anInt9051)) {
			if (bool)
				class177_sub1_843_.aByte9085 |= 0x4;
			class177_sub1_843_.aClass130_9106 = class177_sub1_844_.aClass130_9106;
			class177_sub1_843_.aClass130_9106.aByte1588 = aClass130_9106.aByte1588;
			class177_sub1_843_.aClass130_9106.anInterface15_1587 = aClass130_9106.anInterface15_1587;
		} else if (Class118.method1522(i, anInt9051))
			class177_sub1_843_.aClass130_9106 = aClass130_9106;
		else
			class177_sub1_843_.aClass130_9106 = null;
		if (Class118.method1527(i, anInt9051)) {
			if (class177_sub1_844_.aFloatArray9070 == null || class177_sub1_844_.aFloatArray9070.length < anInt9118) {
				int i_857_ = anInt9077;
				class177_sub1_843_.aFloatArray9070 = class177_sub1_844_.aFloatArray9070 = new float[i_857_];
				class177_sub1_843_.aFloatArray9062 = class177_sub1_844_.aFloatArray9062 = new float[i_857_];
			} else {
				class177_sub1_843_.aFloatArray9070 = class177_sub1_844_.aFloatArray9070;
				class177_sub1_843_.aFloatArray9062 = class177_sub1_844_.aFloatArray9062;
			}
			for (int i_858_ = 0; i_858_ < anInt9077; i_858_++) {
				class177_sub1_843_.aFloatArray9070[i_858_] = aFloatArray9070[i_858_];
				class177_sub1_843_.aFloatArray9062[i_858_] = aFloatArray9062[i_858_];
			}
		} else {
			class177_sub1_843_.aFloatArray9070 = aFloatArray9070;
			class177_sub1_843_.aFloatArray9062 = aFloatArray9062;
		}
		if (Class118.method1529(i, anInt9051)) {
			if (bool)
				class177_sub1_843_.aByte9085 |= 0x8;
			class177_sub1_843_.aClass130_9086 = class177_sub1_844_.aClass130_9086;
			class177_sub1_843_.aClass130_9086.aByte1588 = aClass130_9086.aByte1588;
			class177_sub1_843_.aClass130_9086.anInterface15_1587 = aClass130_9086.anInterface15_1587;
		} else if (Class118.method1524(i, anInt9051))
			class177_sub1_843_.aClass130_9086 = aClass130_9086;
		else
			class177_sub1_843_.aClass130_9086 = null;
		if (Class118.method1517(i, anInt9051)) {
			if (class177_sub1_844_.aShortArray9076 == null || class177_sub1_844_.aShortArray9076.length < anInt9118) {
				int i_859_ = anInt9118;
				class177_sub1_843_.aShortArray9076 = class177_sub1_844_.aShortArray9076 = new short[i_859_];
				class177_sub1_843_.aShortArray9055 = class177_sub1_844_.aShortArray9055 = new short[i_859_];
				class177_sub1_843_.aShortArray9091 = class177_sub1_844_.aShortArray9091 = new short[i_859_];
			} else {
				class177_sub1_843_.aShortArray9076 = class177_sub1_844_.aShortArray9076;
				class177_sub1_843_.aShortArray9055 = class177_sub1_844_.aShortArray9055;
				class177_sub1_843_.aShortArray9091 = class177_sub1_844_.aShortArray9091;
			}
			for (int i_860_ = 0; i_860_ < anInt9118; i_860_++) {
				class177_sub1_843_.aShortArray9076[i_860_] = aShortArray9076[i_860_];
				class177_sub1_843_.aShortArray9055[i_860_] = aShortArray9055[i_860_];
				class177_sub1_843_.aShortArray9091[i_860_] = aShortArray9091[i_860_];
			}
		} else {
			class177_sub1_843_.aShortArray9076 = aShortArray9076;
			class177_sub1_843_.aShortArray9055 = aShortArray9055;
			class177_sub1_843_.aShortArray9091 = aShortArray9091;
		}
		if (Class118.method1530(i, anInt9051)) {
			if (bool)
				class177_sub1_843_.aByte9085 |= 0x10;
			class177_sub1_843_.aClass121_9046 = class177_sub1_844_.aClass121_9046;
			class177_sub1_843_.aClass121_9046.anInterface17_1481 = aClass121_9046.anInterface17_1481;
		} else if (Class118.method1526(i, anInt9051))
			class177_sub1_843_.aClass121_9046 = aClass121_9046;
		else
			class177_sub1_843_.aClass121_9046 = null;
		if (Class118.method1535(i, anInt9051)) {
			if (class177_sub1_844_.aShortArray9079 == null || class177_sub1_844_.aShortArray9079.length < anInt9118) {
				int i_861_ = anInt9118;
				class177_sub1_843_.aShortArray9079 = class177_sub1_844_.aShortArray9079 = new short[i_861_];
			} else
				class177_sub1_843_.aShortArray9079 = class177_sub1_844_.aShortArray9079;
			for (int i_862_ = 0; i_862_ < anInt9118; i_862_++)
				class177_sub1_843_.aShortArray9079[i_862_] = aShortArray9079[i_862_];
		} else
			class177_sub1_843_.aShortArray9079 = aShortArray9079;
		if (Class118.method1519(i, anInt9051)) {
			if (class177_sub1_844_.aClass132Array9102 == null || class177_sub1_844_.aClass132Array9102.length < anInt9116) {
				int i_863_ = anInt9116;
				class177_sub1_843_.aClass132Array9102 = class177_sub1_844_.aClass132Array9102 = new Class132[i_863_];
				for (int i_864_ = 0; i_864_ < anInt9116; i_864_++)
					class177_sub1_843_.aClass132Array9102[i_864_] = aClass132Array9102[i_864_].method1684();
			} else {
				class177_sub1_843_.aClass132Array9102 = class177_sub1_844_.aClass132Array9102;
				for (int i_865_ = 0; i_865_ < anInt9116; i_865_++)
					class177_sub1_843_.aClass132Array9102[i_865_].method1683(aClass132Array9102[i_865_]);
			}
		} else
			class177_sub1_843_.aClass132Array9102 = aClass132Array9102;
		class177_sub1_843_.aClass142Array9107 = aClass142Array9107;
		if (aBool9092) {
			class177_sub1_843_.anInt9090 = anInt9090;
			class177_sub1_843_.anInt9067 = anInt9067;
			class177_sub1_843_.aShort9095 = aShort9095;
			class177_sub1_843_.aShort9096 = aShort9096;
			class177_sub1_843_.aShort9093 = aShort9093;
			class177_sub1_843_.aShort9094 = aShort9094;
			class177_sub1_843_.aShort9097 = aShort9097;
			class177_sub1_843_.aShort9098 = aShort9098;
			class177_sub1_843_.aBool9092 = true;
		} else
			class177_sub1_843_.aBool9092 = false;
		if (aBool9099) {
			class177_sub1_843_.aShort9083 = aShort9083;
			class177_sub1_843_.aBool9099 = true;
		} else
			class177_sub1_843_.aBool9099 = false;
		class177_sub1_843_.anIntArrayArray9109 = anIntArrayArray9109;
		class177_sub1_843_.anIntArrayArray9080 = anIntArrayArray9080;
		class177_sub1_843_.anIntArrayArray9112 = anIntArrayArray9112;
		class177_sub1_843_.aShortArray9103 = aShortArray9103;
		class177_sub1_843_.anIntArray9068 = anIntArray9068;
		class177_sub1_843_.aShortArray9063 = aShortArray9063;
		class177_sub1_843_.aShortArray9081 = aShortArray9081;
		class177_sub1_843_.anIntArray9101 = anIntArray9101;
		class177_sub1_843_.aClass172Array9104 = aClass172Array9104;
		class177_sub1_843_.aClass156Array9064 = aClass156Array9064;
		return class177_sub1_843_;
	}

	public void method2491(int i) {
		int i_866_ = Class447.anIntArray4906[i];
		int i_867_ = Class447.anIntArray4921[i];
		for (int i_868_ = 0; i_868_ < anInt9058; i_868_++) {
			int i_869_ = ((anIntArray9060[i_868_] * i_866_ + anIntArray9059[i_868_] * i_867_) >> 14);
			anIntArray9060[i_868_] = (anIntArray9060[i_868_] * i_867_ - anIntArray9059[i_868_] * i_866_) >> 14;
			anIntArray9059[i_868_] = i_869_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2587(Class433 class433, int i, boolean bool) {
		if (aShortArray9063 != null) {
			Class433 class433_870_ = class433;
			if (bool) {
				class433_870_ = aClass167_Sub2_9049.aClass433_9282;
				class433_870_.method5196(class433);
			}
			float[] fs = new float[3];
			for (int i_871_ = 0; i_871_ < anInt9058; i_871_++) {
				if ((i & aShortArray9063[i_871_]) != 0) {
					class433_870_.method5215((float) anIntArray9059[i_871_], (float) anIntArray9060[i_871_], (float) anIntArray9061[i_871_], fs);
					anIntArray9059[i_871_] = (int) fs[0];
					anIntArray9060[i_871_] = (int) fs[1];
					anIntArray9061[i_871_] = (int) fs[2];
				}
			}
		}
	}

	public void method2590(int i) {
		aShort9054 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
	}

	public void method2551(Class433 class433, Class178 class178, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9077 != 0) {
			Class443 class443 = aClass167_Sub2_9049.aClass443_9209;
			Class443 class443_872_ = aClass167_Sub2_9049.aClass443_9223;
			Class443 class443_873_ = aClass167_Sub2_9049.aClass443_9224;
			class443_872_.method5359(class433);
			class443_873_.method5339(class443_872_);
			class443_873_.method5390(aClass167_Sub2_9049.aClass443_9211);
			if (!aBool9092)
				method8488();
			float[] fs = aClass167_Sub2_9049.aFloatArray9231;
			class443_872_.method5346(0.0F, (float) aShort9093, 0.0F, fs);
			float f = fs[0];
			float f_874_ = fs[1];
			float f_875_ = fs[2];
			class443_872_.method5346(0.0F, (float) aShort9094, 0.0F, fs);
			float f_876_ = fs[0];
			float f_877_ = fs[1];
			float f_878_ = fs[2];
			for (int i_879_ = 0; i_879_ < 6; i_879_++) {
				float[] fs_880_ = aClass167_Sub2_9049.aFloatArrayArray9212[i_879_];
				float f_881_ = (fs_880_[0] * f + fs_880_[1] * f_874_ + fs_880_[2] * f_875_ + fs_880_[3] + (float) anInt9067);
				float f_882_ = (fs_880_[0] * f_876_ + fs_880_[1] * f_877_ + fs_880_[2] * f_878_ + fs_880_[3] + (float) anInt9067);
				if (f_881_ < 0.0F && f_882_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_883_ = true;
				int i_884_ = aShort9095 + aShort9096 >> 1;
				int i_885_ = aShort9097 + aShort9098 >> 1;
				int i_886_ = i_884_;
				short i_887_ = aShort9093;
				int i_888_ = i_885_;
				float f_889_ = (class443_873_.aFloatArray4878[0] * (float) i_886_ + class443_873_.aFloatArray4878[4] * (float) i_887_ + class443_873_.aFloatArray4878[8] * (float) i_888_ + class443_873_.aFloatArray4878[12]);
				float f_890_ = (class443_873_.aFloatArray4878[1] * (float) i_886_ + class443_873_.aFloatArray4878[5] * (float) i_887_ + class443_873_.aFloatArray4878[9] * (float) i_888_ + class443_873_.aFloatArray4878[13]);
				float f_891_ = (class443_873_.aFloatArray4878[2] * (float) i_886_ + class443_873_.aFloatArray4878[6] * (float) i_887_ + class443_873_.aFloatArray4878[10] * (float) i_888_ + class443_873_.aFloatArray4878[14]);
				float f_892_ = (class443_873_.aFloatArray4878[3] * (float) i_886_ + class443_873_.aFloatArray4878[7] * (float) i_887_ + class443_873_.aFloatArray4878[11] * (float) i_888_ + class443_873_.aFloatArray4878[15]);
				if (f_891_ >= -f_892_) {
					class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_889_ / f_892_));
					class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_890_ / f_892_));
				} else
					bool = true;
				i_886_ = i_884_;
				i_887_ = aShort9094;
				i_888_ = i_885_;
				float f_893_ = (class443_873_.aFloatArray4878[0] * (float) i_886_ + class443_873_.aFloatArray4878[4] * (float) i_887_ + class443_873_.aFloatArray4878[8] * (float) i_888_ + class443_873_.aFloatArray4878[12]);
				float f_894_ = (class443_873_.aFloatArray4878[1] * (float) i_886_ + class443_873_.aFloatArray4878[5] * (float) i_887_ + class443_873_.aFloatArray4878[9] * (float) i_888_ + class443_873_.aFloatArray4878[13]);
				float f_895_ = (class443_873_.aFloatArray4878[2] * (float) i_886_ + class443_873_.aFloatArray4878[6] * (float) i_887_ + class443_873_.aFloatArray4878[10] * (float) i_888_ + class443_873_.aFloatArray4878[14]);
				float f_896_ = (class443_873_.aFloatArray4878[3] * (float) i_886_ + class443_873_.aFloatArray4878[7] * (float) i_887_ + class443_873_.aFloatArray4878[11] * (float) i_888_ + class443_873_.aFloatArray4878[15]);
				if (f_895_ >= -f_896_) {
					class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_893_ / f_896_));
					class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_894_ / f_896_));
				} else
					bool = true;
				if (bool) {
					if (f_891_ < -f_892_ && f_895_ < -f_896_)
						bool_883_ = false;
					else if (f_891_ < -f_892_) {
						float f_897_ = (f_891_ + f_892_) / (f_895_ + f_896_) - 1.0F;
						float f_898_ = f_889_ + f_897_ * (f_893_ - f_889_);
						float f_899_ = f_890_ + f_897_ * (f_894_ - f_890_);
						float f_900_ = f_892_ + f_897_ * (f_896_ - f_892_);
						class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_898_ / f_900_));
						class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_899_ / f_900_));
					} else if (f_895_ < -f_896_) {
						float f_901_ = (f_895_ + f_896_) / (f_891_ + f_892_) - 1.0F;
						float f_902_ = f_893_ + f_901_ * (f_889_ - f_893_);
						float f_903_ = f_894_ + f_901_ * (f_890_ - f_894_);
						float f_904_ = f_896_ + f_901_ * (f_892_ - f_896_);
						class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_902_ / f_904_));
						class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_903_ / f_904_));
					}
				}
				if (bool_883_) {
					if (f_891_ / f_892_ > f_895_ / f_896_) {
						float f_905_ = (f_889_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_906_ = (f_892_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1941 + (aClass167_Sub2_9049.aFloat9215 * f_905_ / f_906_));
					} else {
						float f_907_ = (f_893_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_908_ = (f_896_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1943 + (aClass167_Sub2_9049.aFloat9215 * f_907_ / f_908_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub2_9049.method8552();
			aClass167_Sub2_9049.method8527(class443_872_);
			method8493();
			aClass167_Sub2_9049.method8529();
			class443_872_.method5390(aClass167_Sub2_9049.aClass443_9280);
			method8494(class443_872_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void method2619(Class433 class433, Class178 class178, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9077 != 0) {
			Class443 class443 = aClass167_Sub2_9049.aClass443_9209;
			Class443 class443_909_ = aClass167_Sub2_9049.aClass443_9223;
			Class443 class443_910_ = aClass167_Sub2_9049.aClass443_9224;
			class443_909_.method5359(class433);
			class443_910_.method5339(class443_909_);
			class443_910_.method5390(aClass167_Sub2_9049.aClass443_9211);
			if (!aBool9092)
				method8488();
			float[] fs = aClass167_Sub2_9049.aFloatArray9231;
			class443_909_.method5346(0.0F, (float) aShort9093, 0.0F, fs);
			float f = fs[0];
			float f_911_ = fs[1];
			float f_912_ = fs[2];
			class443_909_.method5346(0.0F, (float) aShort9094, 0.0F, fs);
			float f_913_ = fs[0];
			float f_914_ = fs[1];
			float f_915_ = fs[2];
			for (int i_916_ = 0; i_916_ < 6; i_916_++) {
				float[] fs_917_ = aClass167_Sub2_9049.aFloatArrayArray9212[i_916_];
				float f_918_ = (fs_917_[0] * f + fs_917_[1] * f_911_ + fs_917_[2] * f_912_ + fs_917_[3] + (float) anInt9067);
				float f_919_ = (fs_917_[0] * f_913_ + fs_917_[1] * f_914_ + fs_917_[2] * f_915_ + fs_917_[3] + (float) anInt9067);
				if (f_918_ < 0.0F && f_919_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_920_ = true;
				int i_921_ = aShort9095 + aShort9096 >> 1;
				int i_922_ = aShort9097 + aShort9098 >> 1;
				int i_923_ = i_921_;
				short i_924_ = aShort9093;
				int i_925_ = i_922_;
				float f_926_ = (class443_910_.aFloatArray4878[0] * (float) i_923_ + class443_910_.aFloatArray4878[4] * (float) i_924_ + class443_910_.aFloatArray4878[8] * (float) i_925_ + class443_910_.aFloatArray4878[12]);
				float f_927_ = (class443_910_.aFloatArray4878[1] * (float) i_923_ + class443_910_.aFloatArray4878[5] * (float) i_924_ + class443_910_.aFloatArray4878[9] * (float) i_925_ + class443_910_.aFloatArray4878[13]);
				float f_928_ = (class443_910_.aFloatArray4878[2] * (float) i_923_ + class443_910_.aFloatArray4878[6] * (float) i_924_ + class443_910_.aFloatArray4878[10] * (float) i_925_ + class443_910_.aFloatArray4878[14]);
				float f_929_ = (class443_910_.aFloatArray4878[3] * (float) i_923_ + class443_910_.aFloatArray4878[7] * (float) i_924_ + class443_910_.aFloatArray4878[11] * (float) i_925_ + class443_910_.aFloatArray4878[15]);
				if (f_928_ >= -f_929_) {
					class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_926_ / f_929_));
					class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_927_ / f_929_));
				} else
					bool = true;
				i_923_ = i_921_;
				i_924_ = aShort9094;
				i_925_ = i_922_;
				float f_930_ = (class443_910_.aFloatArray4878[0] * (float) i_923_ + class443_910_.aFloatArray4878[4] * (float) i_924_ + class443_910_.aFloatArray4878[8] * (float) i_925_ + class443_910_.aFloatArray4878[12]);
				float f_931_ = (class443_910_.aFloatArray4878[1] * (float) i_923_ + class443_910_.aFloatArray4878[5] * (float) i_924_ + class443_910_.aFloatArray4878[9] * (float) i_925_ + class443_910_.aFloatArray4878[13]);
				float f_932_ = (class443_910_.aFloatArray4878[2] * (float) i_923_ + class443_910_.aFloatArray4878[6] * (float) i_924_ + class443_910_.aFloatArray4878[10] * (float) i_925_ + class443_910_.aFloatArray4878[14]);
				float f_933_ = (class443_910_.aFloatArray4878[3] * (float) i_923_ + class443_910_.aFloatArray4878[7] * (float) i_924_ + class443_910_.aFloatArray4878[11] * (float) i_925_ + class443_910_.aFloatArray4878[15]);
				if (f_932_ >= -f_933_) {
					class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_930_ / f_933_));
					class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_931_ / f_933_));
				} else
					bool = true;
				if (bool) {
					if (f_928_ < -f_929_ && f_932_ < -f_933_)
						bool_920_ = false;
					else if (f_928_ < -f_929_) {
						float f_934_ = (f_928_ + f_929_) / (f_932_ + f_933_) - 1.0F;
						float f_935_ = f_926_ + f_934_ * (f_930_ - f_926_);
						float f_936_ = f_927_ + f_934_ * (f_931_ - f_927_);
						float f_937_ = f_929_ + f_934_ * (f_933_ - f_929_);
						class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_935_ / f_937_));
						class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_936_ / f_937_));
					} else if (f_932_ < -f_933_) {
						float f_938_ = (f_932_ + f_933_) / (f_928_ + f_929_) - 1.0F;
						float f_939_ = f_930_ + f_938_ * (f_926_ - f_930_);
						float f_940_ = f_931_ + f_938_ * (f_927_ - f_931_);
						float f_941_ = f_933_ + f_938_ * (f_929_ - f_933_);
						class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_939_ / f_941_));
						class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_940_ / f_941_));
					}
				}
				if (bool_920_) {
					if (f_928_ / f_929_ > f_932_ / f_933_) {
						float f_942_ = (f_926_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_943_ = (f_929_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1941 + (aClass167_Sub2_9049.aFloat9215 * f_942_ / f_943_));
					} else {
						float f_944_ = (f_930_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_945_ = (f_933_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1943 + (aClass167_Sub2_9049.aFloat9215 * f_944_ / f_945_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub2_9049.method8552();
			aClass167_Sub2_9049.method8527(class443_909_);
			method8493();
			aClass167_Sub2_9049.method8529();
			class443_909_.method5390(aClass167_Sub2_9049.aClass443_9280);
			method8494(class443_909_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public int method2483() {
		if (!aBool9092)
			method8488();
		return aShort9096;
	}

	Class177_Sub1(Class167_Sub2 class167_sub2, Class180 class180, int i, int i_946_, int i_947_, int i_948_) {
		aBool9056 = false;
		anInt9057 = 0;
		anInt9058 = 0;
		anInt9077 = 0;
		anInt9118 = 0;
		anInt9072 = 0;
		aBool9089 = true;
		aBool9092 = false;
		aBool9099 = false;
		aClass167_Sub2_9049 = class167_sub2;
		anInt9050 = i;
		anInt9051 = i_948_;
		if (Class118.method1521(i, i_948_))
			aClass130_9082 = new Class130(null, 5126, 3, 0);
		if (Class118.method1524(i, i_948_))
			aClass130_9086 = new Class130(null, 5126, 2, 0);
		if (Class118.method1522(i, i_948_))
			aClass130_9106 = new Class130(null, 5126, 3, 0);
		if (Class118.method1510(i, i_948_))
			aClass130_9065 = new Class130(null, 5121, 4, 0);
		if (Class118.method1526(i, i_948_))
			aClass121_9046 = new Class121();
		Class174 class174 = class167_sub2.aClass174_1852;
		Interface47 interface47 = class167_sub2.anInterface47_1867;
		int[] is = new int[class180.anInt1961];
		anIntArray9068 = new int[class180.anInt1951 + 1];
		for (int i_949_ = 0; i_949_ < class180.anInt1961; i_949_++) {
			if (class180.aByteArray1968 == null || class180.aByteArray1968[i_949_] != 2) {
				if (class180.aShortArray1957 != null && class180.aShortArray1957[i_949_] != -1) {
					Class164 class164 = class174.method2446((class180.aShortArray1957[i_949_] & 0xffff), -1309349067);
					if (((anInt9051 & 0x40) == 0 || !class164.aBool1820) && class164.aBool1822)
						continue;
				}
				is[anInt9118++] = i_949_;
				anIntArray9068[class180.aShortArray1962[i_949_]]++;
				anIntArray9068[class180.aShortArray1979[i_949_]]++;
				anIntArray9068[class180.aShortArray1964[i_949_]]++;
			}
		}
		anInt9072 = anInt9118;
		long[] ls = new long[anInt9118];
		boolean bool = (anInt9050 & 0x100) != 0;
		for (int i_950_ = 0; i_950_ < anInt9118; i_950_++) {
			int i_951_ = is[i_950_];
			Class164 class164 = null;
			int i_952_ = 0;
			int i_953_ = 0;
			int i_954_ = 0;
			int i_955_ = 0;
			if (class180.aClass170Array1994 != null) {
				boolean bool_956_ = false;
				for (int i_957_ = 0; i_957_ < class180.aClass170Array1994.length; i_957_++) {
					Class170 class170 = class180.aClass170Array1994[i_957_];
					if (i_951_ == class170.anInt1892 * -479439647) {
						Class400 class400 = interface47.method335((class170.anInt1894 * 1249223187), (byte) 79);
						if (class400.aBool4136)
							bool_956_ = true;
						if (class400.anInt4130 * -428264537 != -1) {
							Class164 class164_958_ = class174.method2446((class400.anInt4130 * -428264537), -1299782292);
							if (class164_958_.aClass595_1805 == Class595.aClass595_7819)
								aBool9084 = true;
						}
					}
				}
				if (bool_956_) {
					ls[i_950_] = 9223372036854775807L;
					anInt9072--;
					continue;
				}
			}
			if (class180.aClass172Array1992 != null) {
				boolean bool_959_ = false;
				for (int i_960_ = 0; i_960_ < class180.aClass172Array1992.length; i_960_++) {
					Class172 class172 = class180.aClass172Array1992[i_960_];
					if (i_951_ == class172.anInt1908 * 1443923489) {
						Class381 class381 = (aClass167_Sub2_9049.anInterface48_1854.method338(class172.anInt1906 * -1649091331, (byte) -35));
						if (class381.aBool3941)
							bool_959_ = true;
					}
				}
				if (bool_959_) {
					ls[i_950_] = 9223372036854775807L;
					anInt9072--;
					continue;
				}
			}
			int i_961_ = -1;
			if (class180.aShortArray1957 != null) {
				i_961_ = class180.aShortArray1957[i_951_];
				if (i_961_ != -1) {
					class164 = class174.method2446(i_961_ & 0xffff, -208077799);
					if ((anInt9051 & 0x40) == 0 || !class164.aBool1820) {
						i_954_ = class164.aByte1797;
						i_955_ = class164.aByte1823;
						if (class164.aByte1802 != 0 || class164.aByte1803 != 0)
							aBool9056 = true;
					} else {
						i_961_ = -1;
						class164 = null;
					}
				}
			}
			boolean bool_962_ = ((class180.aByteArray1970 != null && class180.aByteArray1970[i_951_] != 0) || (class164 != null && class164.aClass595_1805 != Class595.aClass595_7820));
			if ((bool || bool_962_) && class180.aByteArray1969 != null)
				i_952_ += class180.aByteArray1969[i_951_] << 17;
			if (bool_962_)
				i_952_ += 65536;
			i_952_ += (i_954_ & 0xff) << 8;
			i_952_ += i_955_ & 0xff;
			i_953_ += (i_961_ & 0xffff) << 16;
			i_953_ += i_950_ & 0xffff;
			ls[i_950_] = ((long) i_952_ << 32) + (long) i_953_;
			aBool9084 |= bool_962_;
			Class177_Sub1 class177_sub1_963_ = this;
			class177_sub1_963_.aBool9056 = (class177_sub1_963_.aBool9056 | (class164 != null && (class164.aByte1802 != 0 || class164.aByte1803 != 0)));
		}
		Class535.method6480(ls, is, (byte) -54);
		anInt9057 = class180.anInt1947;
		anInt9058 = class180.anInt1951;
		anIntArray9059 = class180.anIntArray1952;
		anIntArray9060 = class180.anIntArray1981;
		anIntArray9061 = class180.anIntArray1978;
		aShortArray9063 = class180.aShortArray1958;
		Class120[] class120s = new Class120[anInt9058];
		aClass172Array9104 = class180.aClass172Array1992;
		aClass156Array9064 = class180.aClass156Array1993;
		if (class180.aClass170Array1994 != null) {
			anInt9116 = class180.aClass170Array1994.length;
			aClass142Array9107 = new Class142[anInt9116];
			aClass132Array9102 = new Class132[anInt9116];
			for (int i_964_ = 0; i_964_ < anInt9116; i_964_++) {
				Class170 class170 = class180.aClass170Array1994[i_964_];
				Class400 class400 = interface47.method335(class170.anInt1894 * 1249223187, (byte) 92);
				int i_965_ = -1;
				for (int i_966_ = 0; i_966_ < anInt9118; i_966_++) {
					if (is[i_966_] == class170.anInt1892 * -479439647) {
						i_965_ = i_966_;
						break;
					}
				}
				if (i_965_ == -1)
					throw new RuntimeException();
				int i_967_ = ((Class639.anIntArray8309[(class180.aShortArray1972[class170.anInt1892 * -479439647]) & 0xffff]) & 0xffffff);
				i_967_ = i_967_ | 255 - (class180.aByteArray1970 != null ? (class180.aByteArray1970[class170.anInt1892 * -479439647]) : 0) << 24;
				aClass142Array9107[i_964_] = new Class142(i_965_, (class180.aShortArray1962[class170.anInt1892 * -479439647]), (class180.aShortArray1979[class170.anInt1892 * -479439647]), (class180.aShortArray1964[class170.anInt1892 * -479439647]), class400.anInt4131 * -1116339673, class400.anInt4132 * 1459124959, class400.anInt4130 * -428264537, class400.anInt4135 * 303721477, class400.anInt4133 * -1199139105, class400.aBool4136, class400.aBool4134, class170.anInt1893 * 1430346167);
				aClass132Array9102[i_964_] = new Class132(i_967_);
			}
		}
		int i_968_ = anInt9118 * 3;
		aShortArray9108 = new short[i_968_];
		aShortArray9066 = new short[i_968_];
		aShortArray9071 = new short[i_968_];
		aByteArray9100 = new byte[i_968_];
		aFloatArray9070 = new float[i_968_];
		aFloatArray9062 = new float[i_968_];
		aShortArray9074 = new short[anInt9118];
		aByteArray9075 = new byte[anInt9118];
		aShortArray9076 = new short[anInt9118];
		aShortArray9055 = new short[anInt9118];
		aShortArray9091 = new short[anInt9118];
		aShortArray9079 = new short[anInt9118];
		if (class180.aShortArray1976 != null)
			aShortArray9081 = new short[anInt9118];
		aShort9053 = (short) i_946_;
		aShort9054 = (short) i_947_;
		aShortArray9103 = new short[i_968_];
		aLongArray9042 = new long[i_968_];
		int i_969_ = 0;
		for (int i_970_ = 0; i_970_ < class180.anInt1951; i_970_++) {
			int i_971_ = anIntArray9068[i_970_];
			anIntArray9068[i_970_] = i_969_;
			i_969_ += i_971_;
			class120s[i_970_] = new Class120();
		}
		anIntArray9068[class180.anInt1951] = i_969_;
		Class163 class163 = method2494(class180, is, anInt9118);
		Class135[] class135s = new Class135[class180.anInt1961];
		for (int i_972_ = 0; i_972_ < class180.anInt1961; i_972_++) {
			short i_973_ = class180.aShortArray1962[i_972_];
			short i_974_ = class180.aShortArray1979[i_972_];
			short i_975_ = class180.aShortArray1964[i_972_];
			int i_976_ = anIntArray9059[i_974_] - anIntArray9059[i_973_];
			int i_977_ = anIntArray9060[i_974_] - anIntArray9060[i_973_];
			int i_978_ = anIntArray9061[i_974_] - anIntArray9061[i_973_];
			int i_979_ = anIntArray9059[i_975_] - anIntArray9059[i_973_];
			int i_980_ = anIntArray9060[i_975_] - anIntArray9060[i_973_];
			int i_981_ = anIntArray9061[i_975_] - anIntArray9061[i_973_];
			int i_982_ = i_977_ * i_981_ - i_980_ * i_978_;
			int i_983_ = i_978_ * i_979_ - i_981_ * i_976_;
			int i_984_;
			for (i_984_ = i_976_ * i_980_ - i_979_ * i_977_; (i_982_ > 8192 || i_983_ > 8192 || i_984_ > 8192 || i_982_ < -8192 || i_983_ < -8192 || i_984_ < -8192); i_984_ >>= 1) {
				i_982_ >>= 1;
				i_983_ >>= 1;
			}
			int i_985_ = (int) Math.sqrt((double) (i_982_ * i_982_ + i_983_ * i_983_ + i_984_ * i_984_));
			if (i_985_ <= 0)
				i_985_ = 1;
			i_982_ = i_982_ * 256 / i_985_;
			i_983_ = i_983_ * 256 / i_985_;
			i_984_ = i_984_ * 256 / i_985_;
			byte i_986_ = (class180.aByteArray1968 == null ? (byte) 0 : class180.aByteArray1968[i_972_]);
			if (i_986_ == 0) {
				Class120 class120 = class120s[i_973_];
				class120.anInt1480 += i_982_;
				class120.anInt1477 += i_983_;
				class120.anInt1478 += i_984_;
				class120.anInt1479++;
				class120 = class120s[i_974_];
				class120.anInt1480 += i_982_;
				class120.anInt1477 += i_983_;
				class120.anInt1478 += i_984_;
				class120.anInt1479++;
				class120 = class120s[i_975_];
				class120.anInt1480 += i_982_;
				class120.anInt1477 += i_983_;
				class120.anInt1478 += i_984_;
				class120.anInt1479++;
			} else if (i_986_ == 1) {
				Class135 class135 = class135s[i_972_] = new Class135();
				class135.anInt1623 = i_982_;
				class135.anInt1624 = i_983_;
				class135.anInt1625 = i_984_;
			}
		}
		for (int i_987_ = 0; i_987_ < anInt9118; i_987_++) {
			int i_988_ = is[i_987_];
			int i_989_ = class180.aShortArray1972[i_988_] & 0xffff;
			int i_990_ = (class180.aByteArray1970 != null ? class180.aByteArray1970[i_988_] & 0xff : 0);
			short i_991_ = (class180.aShortArray1957 == null ? (short) -1 : class180.aShortArray1957[i_988_]);
			if (i_991_ != -1 && (anInt9051 & 0x40) != 0 && class174.method2446(i_991_, -981488571).aBool1820)
				i_991_ = (short) -1;
			float f = 0.0F;
			float f_992_ = 0.0F;
			float f_993_ = 0.0F;
			float f_994_ = 0.0F;
			float f_995_ = 0.0F;
			float f_996_ = 0.0F;
			long l;
			long l_997_;
			long l_998_;
			if (i_991_ != -1) {
				int i_999_ = (class180.aShortArray1982 != null ? class180.aShortArray1982[i_988_] : -1);
				if (i_999_ == 32766) {
					int i_1000_ = class180.aByteArray1965[i_988_] & 0xff;
					int i_1001_ = class180.aByteArray1966[i_988_] & 0xff;
					int i_1002_ = class180.aByteArray1967[i_988_] & 0xff;
					i_1000_ += (class180.anIntArray1955[class180.aShortArray1962[i_988_]]);
					l_998_ = (long) i_1000_;
					i_1001_ += (class180.anIntArray1955[class180.aShortArray1979[i_988_]]);
					l_997_ = (long) i_1000_;
					i_1002_ += (class180.anIntArray1955[class180.aShortArray1964[i_988_]]);
					l = (long) i_1000_;
					f = class180.aFloatArray1959[i_1000_];
					f_992_ = class180.aFloatArray1960[i_1000_];
					f_993_ = class180.aFloatArray1959[i_1001_];
					f_994_ = class180.aFloatArray1960[i_1001_];
					f_995_ = class180.aFloatArray1959[i_1002_];
					f_996_ = class180.aFloatArray1960[i_1002_];
				} else if (i_999_ == -1) {
					f = 0.0F;
					f_992_ = 1.0F;
					l_998_ = 65535L;
					f_993_ = 1.0F;
					f_994_ = 1.0F;
					l_997_ = 131071L;
					f_995_ = 0.0F;
					f_996_ = 0.0F;
					l = 196607L;
				} else {
					i_999_ &= 0xffff;
					int i_1003_ = 0;
					int i_1004_ = 0;
					int i_1005_ = 0;
					byte i_1006_ = class180.aByteArray1980[i_999_];
					if (i_1006_ == 0) {
						short i_1007_ = class180.aShortArray1962[i_988_];
						short i_1008_ = class180.aShortArray1979[i_988_];
						short i_1009_ = class180.aShortArray1964[i_988_];
						short i_1010_ = class180.aShortArray1984[i_999_];
						short i_1011_ = class180.aShortArray1954[i_999_];
						short i_1012_ = class180.aShortArray1956[i_999_];
						float f_1013_ = (float) class180.anIntArray1952[i_1010_];
						float f_1014_ = (float) class180.anIntArray1981[i_1010_];
						float f_1015_ = (float) class180.anIntArray1978[i_1010_];
						float f_1016_ = ((float) class180.anIntArray1952[i_1011_] - f_1013_);
						float f_1017_ = ((float) class180.anIntArray1981[i_1011_] - f_1014_);
						float f_1018_ = ((float) class180.anIntArray1978[i_1011_] - f_1015_);
						float f_1019_ = ((float) class180.anIntArray1952[i_1012_] - f_1013_);
						float f_1020_ = ((float) class180.anIntArray1981[i_1012_] - f_1014_);
						float f_1021_ = ((float) class180.anIntArray1978[i_1012_] - f_1015_);
						float f_1022_ = ((float) class180.anIntArray1952[i_1007_] - f_1013_);
						float f_1023_ = ((float) class180.anIntArray1981[i_1007_] - f_1014_);
						float f_1024_ = ((float) class180.anIntArray1978[i_1007_] - f_1015_);
						float f_1025_ = ((float) class180.anIntArray1952[i_1008_] - f_1013_);
						float f_1026_ = ((float) class180.anIntArray1981[i_1008_] - f_1014_);
						float f_1027_ = ((float) class180.anIntArray1978[i_1008_] - f_1015_);
						float f_1028_ = ((float) class180.anIntArray1952[i_1009_] - f_1013_);
						float f_1029_ = ((float) class180.anIntArray1981[i_1009_] - f_1014_);
						float f_1030_ = ((float) class180.anIntArray1978[i_1009_] - f_1015_);
						float f_1031_ = f_1017_ * f_1021_ - f_1018_ * f_1020_;
						float f_1032_ = f_1018_ * f_1019_ - f_1016_ * f_1021_;
						float f_1033_ = f_1016_ * f_1020_ - f_1017_ * f_1019_;
						float f_1034_ = f_1020_ * f_1033_ - f_1021_ * f_1032_;
						float f_1035_ = f_1021_ * f_1031_ - f_1019_ * f_1033_;
						float f_1036_ = f_1019_ * f_1032_ - f_1020_ * f_1031_;
						float f_1037_ = 1.0F / (f_1034_ * f_1016_ + f_1035_ * f_1017_ + f_1036_ * f_1018_);
						f = (f_1034_ * f_1022_ + f_1035_ * f_1023_ + f_1036_ * f_1024_) * f_1037_;
						f_993_ = (f_1034_ * f_1025_ + f_1035_ * f_1026_ + f_1036_ * f_1027_) * f_1037_;
						f_995_ = (f_1034_ * f_1028_ + f_1035_ * f_1029_ + f_1036_ * f_1030_) * f_1037_;
						f_1034_ = f_1017_ * f_1033_ - f_1018_ * f_1032_;
						f_1035_ = f_1018_ * f_1031_ - f_1016_ * f_1033_;
						f_1036_ = f_1016_ * f_1032_ - f_1017_ * f_1031_;
						f_1037_ = 1.0F / (f_1034_ * f_1019_ + f_1035_ * f_1020_ + f_1036_ * f_1021_);
						f_992_ = (f_1034_ * f_1022_ + f_1035_ * f_1023_ + f_1036_ * f_1024_) * f_1037_;
						f_994_ = (f_1034_ * f_1025_ + f_1035_ * f_1026_ + f_1036_ * f_1027_) * f_1037_;
						f_996_ = (f_1034_ * f_1028_ + f_1035_ * f_1029_ + f_1036_ * f_1030_) * f_1037_;
					} else {
						short i_1038_ = class180.aShortArray1962[i_988_];
						short i_1039_ = class180.aShortArray1979[i_988_];
						short i_1040_ = class180.aShortArray1964[i_988_];
						int i_1041_ = class163.anIntArray1775[i_999_];
						int i_1042_ = class163.anIntArray1776[i_999_];
						int i_1043_ = class163.anIntArray1777[i_999_];
						float[] fs = class163.aFloatArrayArray1778[i_999_];
						byte i_1044_ = class180.aByteArray1991[i_999_];
						float f_1045_ = (float) class180.anIntArray1946[i_999_] / 256.0F;
						if (i_1006_ == 1) {
							float f_1046_ = ((float) class180.anIntArray1986[i_999_] / 1024.0F);
							method2616(class180.anIntArray1952[i_1038_], class180.anIntArray1981[i_1038_], class180.anIntArray1978[i_1038_], i_1041_, i_1042_, i_1043_, fs, f_1046_, i_1044_, f_1045_, aFloatArray9111);
							f = aFloatArray9111[0];
							f_992_ = aFloatArray9111[1];
							method2616(class180.anIntArray1952[i_1039_], class180.anIntArray1981[i_1039_], class180.anIntArray1978[i_1039_], i_1041_, i_1042_, i_1043_, fs, f_1046_, i_1044_, f_1045_, aFloatArray9111);
							f_993_ = aFloatArray9111[0];
							f_994_ = aFloatArray9111[1];
							method2616(class180.anIntArray1952[i_1040_], class180.anIntArray1981[i_1040_], class180.anIntArray1978[i_1040_], i_1041_, i_1042_, i_1043_, fs, f_1046_, i_1044_, f_1045_, aFloatArray9111);
							f_995_ = aFloatArray9111[0];
							f_996_ = aFloatArray9111[1];
							float f_1047_ = f_1046_ / 2.0F;
							if ((i_1044_ & 0x1) == 0) {
								if (f_993_ - f > f_1047_) {
									f_993_ -= f_1046_;
									i_1004_ = 1;
								} else if (f - f_993_ > f_1047_) {
									f_993_ += f_1046_;
									i_1004_ = 2;
								}
								if (f_995_ - f > f_1047_) {
									f_995_ -= f_1046_;
									i_1005_ = 1;
								} else if (f - f_995_ > f_1047_) {
									f_995_ += f_1046_;
									i_1005_ = 2;
								}
							} else {
								if (f_994_ - f_992_ > f_1047_) {
									f_994_ -= f_1046_;
									i_1004_ = 1;
								} else if (f_992_ - f_994_ > f_1047_) {
									f_994_ += f_1046_;
									i_1004_ = 2;
								}
								if (f_996_ - f_992_ > f_1047_) {
									f_996_ -= f_1046_;
									i_1005_ = 1;
								} else if (f_992_ - f_996_ > f_1047_) {
									f_996_ += f_1046_;
									i_1005_ = 2;
								}
							}
						} else if (i_1006_ == 2) {
							float f_1048_ = ((float) class180.anIntArray1988[i_999_] / 256.0F);
							float f_1049_ = ((float) class180.anIntArray1948[i_999_] / 256.0F);
							int i_1050_ = (class180.anIntArray1952[i_1039_] - class180.anIntArray1952[i_1038_]);
							int i_1051_ = (class180.anIntArray1981[i_1039_] - class180.anIntArray1981[i_1038_]);
							int i_1052_ = (class180.anIntArray1978[i_1039_] - class180.anIntArray1978[i_1038_]);
							int i_1053_ = (class180.anIntArray1952[i_1040_] - class180.anIntArray1952[i_1038_]);
							int i_1054_ = (class180.anIntArray1981[i_1040_] - class180.anIntArray1981[i_1038_]);
							int i_1055_ = (class180.anIntArray1978[i_1040_] - class180.anIntArray1978[i_1038_]);
							int i_1056_ = i_1051_ * i_1055_ - i_1054_ * i_1052_;
							int i_1057_ = i_1052_ * i_1053_ - i_1055_ * i_1050_;
							int i_1058_ = i_1050_ * i_1054_ - i_1053_ * i_1051_;
							float f_1059_ = (64.0F / (float) class180.anIntArray1950[i_999_]);
							float f_1060_ = (64.0F / (float) class180.anIntArray1985[i_999_]);
							float f_1061_ = (64.0F / (float) class180.anIntArray1986[i_999_]);
							float f_1062_ = (((float) i_1056_ * fs[0] + (float) i_1057_ * fs[1] + (float) i_1058_ * fs[2]) / f_1059_);
							float f_1063_ = (((float) i_1056_ * fs[3] + (float) i_1057_ * fs[4] + (float) i_1058_ * fs[5]) / f_1060_);
							float f_1064_ = (((float) i_1056_ * fs[6] + (float) i_1057_ * fs[7] + (float) i_1058_ * fs[8]) / f_1061_);
							i_1003_ = method2460(f_1062_, f_1063_, f_1064_);
							method2461(class180.anIntArray1952[i_1038_], class180.anIntArray1981[i_1038_], class180.anIntArray1978[i_1038_], i_1041_, i_1042_, i_1043_, i_1003_, fs, i_1044_, f_1045_, f_1048_, f_1049_, aFloatArray9111);
							f = aFloatArray9111[0];
							f_992_ = aFloatArray9111[1];
							method2461(class180.anIntArray1952[i_1039_], class180.anIntArray1981[i_1039_], class180.anIntArray1978[i_1039_], i_1041_, i_1042_, i_1043_, i_1003_, fs, i_1044_, f_1045_, f_1048_, f_1049_, aFloatArray9111);
							f_993_ = aFloatArray9111[0];
							f_994_ = aFloatArray9111[1];
							method2461(class180.anIntArray1952[i_1040_], class180.anIntArray1981[i_1040_], class180.anIntArray1978[i_1040_], i_1041_, i_1042_, i_1043_, i_1003_, fs, i_1044_, f_1045_, f_1048_, f_1049_, aFloatArray9111);
							f_995_ = aFloatArray9111[0];
							f_996_ = aFloatArray9111[1];
						} else if (i_1006_ == 3) {
							method2492(class180.anIntArray1952[i_1038_], class180.anIntArray1981[i_1038_], class180.anIntArray1978[i_1038_], i_1041_, i_1042_, i_1043_, fs, i_1044_, f_1045_, aFloatArray9111);
							f = aFloatArray9111[0];
							f_992_ = aFloatArray9111[1];
							method2492(class180.anIntArray1952[i_1039_], class180.anIntArray1981[i_1039_], class180.anIntArray1978[i_1039_], i_1041_, i_1042_, i_1043_, fs, i_1044_, f_1045_, aFloatArray9111);
							f_993_ = aFloatArray9111[0];
							f_994_ = aFloatArray9111[1];
							method2492(class180.anIntArray1952[i_1040_], class180.anIntArray1981[i_1040_], class180.anIntArray1978[i_1040_], i_1041_, i_1042_, i_1043_, fs, i_1044_, f_1045_, aFloatArray9111);
							f_995_ = aFloatArray9111[0];
							f_996_ = aFloatArray9111[1];
							if ((i_1044_ & 0x1) == 0) {
								if (f_993_ - f > 0.5F) {
									f_993_--;
									i_1004_ = 1;
								} else if (f - f_993_ > 0.5F) {
									f_993_++;
									i_1004_ = 2;
								}
								if (f_995_ - f > 0.5F) {
									f_995_--;
									i_1005_ = 1;
								} else if (f - f_995_ > 0.5F) {
									f_995_++;
									i_1005_ = 2;
								}
							} else {
								if (f_994_ - f_992_ > 0.5F) {
									f_994_--;
									i_1004_ = 1;
								} else if (f_992_ - f_994_ > 0.5F) {
									f_994_++;
									i_1004_ = 2;
								}
								if (f_996_ - f_992_ > 0.5F) {
									f_996_--;
									i_1005_ = 1;
								} else if (f_992_ - f_996_ > 0.5F) {
									f_996_++;
									i_1005_ = 2;
								}
							}
						}
					}
					l_998_ = (long) (i_1003_ << 16 | i_999_);
					l_997_ = (long) (i_1004_ << 19) | l_998_;
					l = (long) (i_1005_ << 19) | l_998_;
				}
			} else {
				l = 0L;
				l_997_ = 0L;
				l_998_ = 0L;
			}
			byte i_1065_ = (class180.aByteArray1968 != null ? class180.aByteArray1968[i_988_] : (byte) 0);
			if (i_1065_ == 0) {
				long l_1066_ = (long) ((i_989_ << 8) + i_990_);
				short i_1067_ = class180.aShortArray1962[i_988_];
				short i_1068_ = class180.aShortArray1979[i_988_];
				short i_1069_ = class180.aShortArray1964[i_988_];
				Class120 class120 = class120s[i_1067_];
				aShortArray9076[i_987_] = method8483(class180, i_1067_, l_1066_ | l_998_ << 24, class120.anInt1480, class120.anInt1477, class120.anInt1478, class120.anInt1479, f, f_992_);
				class120 = class120s[i_1068_];
				aShortArray9055[i_987_] = method8483(class180, i_1068_, l_1066_ | l_997_ << 24, class120.anInt1480, class120.anInt1477, class120.anInt1478, class120.anInt1479, f_993_, f_994_);
				class120 = class120s[i_1069_];
				aShortArray9091[i_987_] = method8483(class180, i_1069_, l_1066_ | l << 24, class120.anInt1480, class120.anInt1477, class120.anInt1478, class120.anInt1479, f_995_, f_996_);
			} else if (i_1065_ == 1) {
				Class135 class135 = class135s[i_988_];
				long l_1070_ = (((long) (class135.anInt1623 & ~0x7fffffff) << 9) + ((long) (class135.anInt1624 + 256) << 32) + ((long) (class135.anInt1625 + 256) << 24) + (long) (i_989_ << 8) + (long) i_990_);
				aShortArray9076[i_987_] = method8483(class180, class180.aShortArray1962[i_988_], l_1070_ | l_998_ << 41, class135.anInt1623, class135.anInt1624, class135.anInt1625, 0, f, f_992_);
				aShortArray9055[i_987_] = method8483(class180, class180.aShortArray1979[i_988_], l_1070_ | l_998_ << 41, class135.anInt1623, class135.anInt1624, class135.anInt1625, 0, f_993_, f_994_);
				aShortArray9091[i_987_] = method8483(class180, class180.aShortArray1964[i_988_], l_1070_ | l_998_ << 41, class135.anInt1623, class135.anInt1624, class135.anInt1625, 0, f_995_, f_996_);
			}
			if (class180.aByteArray1970 != null)
				aByteArray9075[i_987_] = class180.aByteArray1970[i_988_];
			if (class180.aShortArray1976 != null)
				aShortArray9081[i_987_] = class180.aShortArray1976[i_988_];
			aShortArray9074[i_987_] = class180.aShortArray1972[i_988_];
			aShortArray9079[i_987_] = i_991_;
		}
		int i_1071_ = 0;
		short i_1072_ = -10000;
		for (int i_1073_ = 0; i_1073_ < anInt9072; i_1073_++) {
			short i_1074_ = aShortArray9079[i_1073_];
			if (i_1074_ != i_1072_) {
				i_1071_++;
				i_1072_ = i_1074_;
			}
		}
		anIntArray9101 = new int[i_1071_ + 1];
		i_1071_ = 0;
		i_1072_ = (short) -10000;
		for (int i_1075_ = 0; i_1075_ < anInt9072; i_1075_++) {
			short i_1076_ = aShortArray9079[i_1075_];
			if (i_1076_ != i_1072_) {
				anIntArray9101[i_1071_++] = i_1075_;
				i_1072_ = i_1076_;
			}
		}
		anIntArray9101[i_1071_] = anInt9072;
		aLongArray9042 = null;
		aShortArray9108 = method8485(aShortArray9108, anInt9077);
		aShortArray9066 = method8485(aShortArray9066, anInt9077);
		aShortArray9071 = method8485(aShortArray9071, anInt9077);
		aByteArray9100 = method8484(aByteArray9100, anInt9077);
		aFloatArray9070 = method8486(aFloatArray9070, anInt9077);
		aFloatArray9062 = method8486(aFloatArray9062, anInt9077);
		if (class180.anIntArray1953 != null && Class118.method1539(i, anInt9051))
			anIntArrayArray9109 = class180.method2702(false);
		if (class180.aClass170Array1994 != null && Class118.method1540(i, anInt9051))
			anIntArrayArray9112 = class180.method2710();
		if (class180.anIntArray1974 != null && Class118.method1538(i, anInt9051)) {
			int i_1077_ = 0;
			int[] is_1078_ = new int[256];
			for (int i_1079_ = 0; i_1079_ < anInt9118; i_1079_++) {
				int i_1080_ = class180.anIntArray1974[is[i_1079_]];
				if (i_1080_ >= 0) {
					is_1078_[i_1080_]++;
					if (i_1080_ > i_1077_)
						i_1077_ = i_1080_;
				}
			}
			anIntArrayArray9080 = new int[i_1077_ + 1][];
			for (int i_1081_ = 0; i_1081_ <= i_1077_; i_1081_++) {
				anIntArrayArray9080[i_1081_] = new int[is_1078_[i_1081_]];
				is_1078_[i_1081_] = 0;
			}
			for (int i_1082_ = 0; i_1082_ < anInt9118; i_1082_++) {
				int i_1083_ = class180.anIntArray1974[is[i_1082_]];
				if (i_1083_ >= 0)
					anIntArrayArray9080[i_1083_][is_1078_[i_1083_]++] = i_1082_;
			}
		}
	}

	public Class536_Sub18_Sub7 method2574(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9077 == 0)
			return null;
		if (!aBool9092)
			method8488();
		int i;
		int i_1084_;
		if (aClass167_Sub2_9049.anInt9332 > 0) {
			i = (aShort9095 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_1084_ = aShort9096 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i = (aShort9095 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_1084_ = aShort9096 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_1085_;
		int i_1086_;
		if (aClass167_Sub2_9049.anInt9257 > 0) {
			i_1085_ = aShort9097 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_1086_ = aShort9098 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i_1085_ = aShort9097 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_1086_ = aShort9098 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_1087_ = i_1084_ - i + 1;
		int i_1088_ = i_1086_ - i_1085_ + 1;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2_1089_;
		if (class536_sub18_sub7_sub2 != null && class536_sub18_sub7_sub2.method11001(i_1087_, i_1088_)) {
			class536_sub18_sub7_sub2_1089_ = class536_sub18_sub7_sub2;
			class536_sub18_sub7_sub2_1089_.method11009();
		} else
			class536_sub18_sub7_sub2_1089_ = new Class536_Sub18_Sub7_Sub2(aClass167_Sub2_9049, i_1087_, i_1088_);
		class536_sub18_sub7_sub2_1089_.method11000(i, i_1085_, i_1084_, i_1086_);
		method8492(class536_sub18_sub7_sub2_1089_);
		return class536_sub18_sub7_sub2_1089_;
	}

	public Class536_Sub18_Sub7 method2556(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9077 == 0)
			return null;
		if (!aBool9092)
			method8488();
		int i;
		int i_1090_;
		if (aClass167_Sub2_9049.anInt9332 > 0) {
			i = (aShort9095 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_1090_ = aShort9096 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i = (aShort9095 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_1090_ = aShort9096 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_1091_;
		int i_1092_;
		if (aClass167_Sub2_9049.anInt9257 > 0) {
			i_1091_ = aShort9097 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_1092_ = aShort9098 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i_1091_ = aShort9097 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_1092_ = aShort9098 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_1093_ = i_1090_ - i + 1;
		int i_1094_ = i_1092_ - i_1091_ + 1;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2_1095_;
		if (class536_sub18_sub7_sub2 != null && class536_sub18_sub7_sub2.method11001(i_1093_, i_1094_)) {
			class536_sub18_sub7_sub2_1095_ = class536_sub18_sub7_sub2;
			class536_sub18_sub7_sub2_1095_.method11009();
		} else
			class536_sub18_sub7_sub2_1095_ = new Class536_Sub18_Sub7_Sub2(aClass167_Sub2_9049, i_1093_, i_1094_);
		class536_sub18_sub7_sub2_1095_.method11000(i, i_1091_, i_1090_, i_1092_);
		method8492(class536_sub18_sub7_sub2_1095_);
		return class536_sub18_sub7_sub2_1095_;
	}

	public boolean method2609() {
		return aBool9056;
	}

	public Class536_Sub18_Sub7 method2558(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9077 == 0)
			return null;
		if (!aBool9092)
			method8488();
		int i;
		int i_1096_;
		if (aClass167_Sub2_9049.anInt9332 > 0) {
			i = (aShort9095 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_1096_ = aShort9096 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i = (aShort9095 - (aShort9093 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178);
			i_1096_ = aShort9096 - (aShort9094 * aClass167_Sub2_9049.anInt9332 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_1097_;
		int i_1098_;
		if (aClass167_Sub2_9049.anInt9257 > 0) {
			i_1097_ = aShort9097 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_1098_ = aShort9098 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		} else {
			i_1097_ = aShort9097 - (aShort9093 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
			i_1098_ = aShort9098 - (aShort9094 * aClass167_Sub2_9049.anInt9257 >> 8) >> aClass167_Sub2_9049.anInt9178;
		}
		int i_1099_ = i_1096_ - i + 1;
		int i_1100_ = i_1098_ - i_1097_ + 1;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2 = (Class536_Sub18_Sub7_Sub2) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub2 class536_sub18_sub7_sub2_1101_;
		if (class536_sub18_sub7_sub2 != null && class536_sub18_sub7_sub2.method11001(i_1099_, i_1100_)) {
			class536_sub18_sub7_sub2_1101_ = class536_sub18_sub7_sub2;
			class536_sub18_sub7_sub2_1101_.method11009();
		} else
			class536_sub18_sub7_sub2_1101_ = new Class536_Sub18_Sub7_Sub2(aClass167_Sub2_9049, i_1099_, i_1100_);
		class536_sub18_sub7_sub2_1101_.method11000(i, i_1097_, i_1096_, i_1098_);
		method8492(class536_sub18_sub7_sub2_1101_);
		return class536_sub18_sub7_sub2_1101_;
	}

	public int method2592() {
		return aShort9053;
	}

	public void method2560() {
		if (!aBool9099) {
			if (!aBool9092)
				method8488();
			aShort9083 = aShort9093;
			aBool9099 = true;
		}
	}

	public int method2463() {
		if (!aBool9092)
			method8488();
		return anInt9067;
	}

	public int method2504() {
		if (!aBool9092)
			method8488();
		return anInt9067;
	}

	public byte[] method2506() {
		return aByteArray9075;
	}

	public int method2597() {
		if (!aBool9092)
			method8488();
		return anInt9090;
	}

	public void method2508(byte i, byte[] is) {
		if (is == null) {
			for (int i_1102_ = 0; i_1102_ < anInt9118; i_1102_++)
				aByteArray9075[i_1102_] = i;
		} else {
			for (int i_1103_ = 0; i_1103_ < anInt9118; i_1103_++) {
				int i_1104_ = 255 - ((255 - (is[i_1103_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9075[i_1103_] = (byte) i_1104_;
			}
		}
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public int method2566() {
		if (!aBool9092)
			method8488();
		return aShort9095;
	}

	public int method2471() {
		if (!aBool9092)
			method8488();
		return aShort9095;
	}

	public int method2575() {
		if (!aBool9092)
			method8488();
		return aShort9095;
	}

	public void method2552(Class433 class433, Class178 class178, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9077 != 0) {
			Class443 class443 = aClass167_Sub2_9049.aClass443_9209;
			Class443 class443_1105_ = aClass167_Sub2_9049.aClass443_9223;
			Class443 class443_1106_ = aClass167_Sub2_9049.aClass443_9224;
			class443_1105_.method5359(class433);
			class443_1106_.method5339(class443_1105_);
			class443_1106_.method5390(aClass167_Sub2_9049.aClass443_9211);
			if (!aBool9092)
				method8488();
			float[] fs = aClass167_Sub2_9049.aFloatArray9231;
			class443_1105_.method5346(0.0F, (float) aShort9093, 0.0F, fs);
			float f = fs[0];
			float f_1107_ = fs[1];
			float f_1108_ = fs[2];
			class443_1105_.method5346(0.0F, (float) aShort9094, 0.0F, fs);
			float f_1109_ = fs[0];
			float f_1110_ = fs[1];
			float f_1111_ = fs[2];
			for (int i_1112_ = 0; i_1112_ < 6; i_1112_++) {
				float[] fs_1113_ = aClass167_Sub2_9049.aFloatArrayArray9212[i_1112_];
				float f_1114_ = (fs_1113_[0] * f + fs_1113_[1] * f_1107_ + fs_1113_[2] * f_1108_ + fs_1113_[3] + (float) anInt9067);
				float f_1115_ = (fs_1113_[0] * f_1109_ + fs_1113_[1] * f_1110_ + fs_1113_[2] * f_1111_ + fs_1113_[3] + (float) anInt9067);
				if (f_1114_ < 0.0F && f_1115_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_1116_ = true;
				int i_1117_ = aShort9095 + aShort9096 >> 1;
				int i_1118_ = aShort9097 + aShort9098 >> 1;
				int i_1119_ = i_1117_;
				short i_1120_ = aShort9093;
				int i_1121_ = i_1118_;
				float f_1122_ = (class443_1106_.aFloatArray4878[0] * (float) i_1119_ + class443_1106_.aFloatArray4878[4] * (float) i_1120_ + class443_1106_.aFloatArray4878[8] * (float) i_1121_ + class443_1106_.aFloatArray4878[12]);
				float f_1123_ = (class443_1106_.aFloatArray4878[1] * (float) i_1119_ + class443_1106_.aFloatArray4878[5] * (float) i_1120_ + class443_1106_.aFloatArray4878[9] * (float) i_1121_ + class443_1106_.aFloatArray4878[13]);
				float f_1124_ = (class443_1106_.aFloatArray4878[2] * (float) i_1119_ + class443_1106_.aFloatArray4878[6] * (float) i_1120_ + class443_1106_.aFloatArray4878[10] * (float) i_1121_ + class443_1106_.aFloatArray4878[14]);
				float f_1125_ = (class443_1106_.aFloatArray4878[3] * (float) i_1119_ + class443_1106_.aFloatArray4878[7] * (float) i_1120_ + class443_1106_.aFloatArray4878[11] * (float) i_1121_ + class443_1106_.aFloatArray4878[15]);
				if (f_1124_ >= -f_1125_) {
					class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1122_ / f_1125_));
					class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1123_ / f_1125_));
				} else
					bool = true;
				i_1119_ = i_1117_;
				i_1120_ = aShort9094;
				i_1121_ = i_1118_;
				float f_1126_ = (class443_1106_.aFloatArray4878[0] * (float) i_1119_ + class443_1106_.aFloatArray4878[4] * (float) i_1120_ + class443_1106_.aFloatArray4878[8] * (float) i_1121_ + class443_1106_.aFloatArray4878[12]);
				float f_1127_ = (class443_1106_.aFloatArray4878[1] * (float) i_1119_ + class443_1106_.aFloatArray4878[5] * (float) i_1120_ + class443_1106_.aFloatArray4878[9] * (float) i_1121_ + class443_1106_.aFloatArray4878[13]);
				float f_1128_ = (class443_1106_.aFloatArray4878[2] * (float) i_1119_ + class443_1106_.aFloatArray4878[6] * (float) i_1120_ + class443_1106_.aFloatArray4878[10] * (float) i_1121_ + class443_1106_.aFloatArray4878[14]);
				float f_1129_ = (class443_1106_.aFloatArray4878[3] * (float) i_1119_ + class443_1106_.aFloatArray4878[7] * (float) i_1120_ + class443_1106_.aFloatArray4878[11] * (float) i_1121_ + class443_1106_.aFloatArray4878[15]);
				if (f_1128_ >= -f_1129_) {
					class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1126_ / f_1129_));
					class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1127_ / f_1129_));
				} else
					bool = true;
				if (bool) {
					if (f_1124_ < -f_1125_ && f_1128_ < -f_1129_)
						bool_1116_ = false;
					else if (f_1124_ < -f_1125_) {
						float f_1130_ = (f_1124_ + f_1125_) / (f_1128_ + f_1129_) - 1.0F;
						float f_1131_ = f_1122_ + f_1130_ * (f_1126_ - f_1122_);
						float f_1132_ = f_1123_ + f_1130_ * (f_1127_ - f_1123_);
						float f_1133_ = f_1125_ + f_1130_ * (f_1129_ - f_1125_);
						class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1131_ / f_1133_));
						class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1132_ / f_1133_));
					} else if (f_1128_ < -f_1129_) {
						float f_1134_ = (f_1128_ + f_1129_) / (f_1124_ + f_1125_) - 1.0F;
						float f_1135_ = f_1126_ + f_1134_ * (f_1122_ - f_1126_);
						float f_1136_ = f_1127_ + f_1134_ * (f_1123_ - f_1127_);
						float f_1137_ = f_1129_ + f_1134_ * (f_1125_ - f_1129_);
						class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1135_ / f_1137_));
						class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1136_ / f_1137_));
					}
				}
				if (bool_1116_) {
					if (f_1124_ / f_1125_ > f_1128_ / f_1129_) {
						float f_1138_ = (f_1122_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_1139_ = (f_1125_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1941 + (aClass167_Sub2_9049.aFloat9215 * f_1138_ / f_1139_));
					} else {
						float f_1140_ = (f_1126_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_1141_ = (f_1129_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1943 + (aClass167_Sub2_9049.aFloat9215 * f_1140_ / f_1141_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub2_9049.method8552();
			aClass167_Sub2_9049.method8527(class443_1105_);
			method8493();
			aClass167_Sub2_9049.method8529();
			class443_1105_.method5390(aClass167_Sub2_9049.aClass443_9280);
			method8494(class443_1105_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public void method2626(int i) {
		int i_1142_ = Class447.anIntArray4906[i];
		int i_1143_ = Class447.anIntArray4921[i];
		for (int i_1144_ = 0; i_1144_ < anInt9058; i_1144_++) {
			int i_1145_ = ((anIntArray9061[i_1144_] * i_1142_ + anIntArray9059[i_1144_] * i_1143_) >> 14);
			anIntArray9061[i_1144_] = (anIntArray9061[i_1144_] * i_1143_ - anIntArray9059[i_1144_] * i_1142_) >> 14;
			anIntArray9059[i_1144_] = i_1145_;
		}
		for (int i_1146_ = 0; i_1146_ < anInt9077; i_1146_++) {
			int i_1147_ = ((aShortArray9071[i_1146_] * i_1142_ + aShortArray9108[i_1146_] * i_1143_) >> 14);
			aShortArray9071[i_1146_] = (short) ((aShortArray9071[i_1146_] * i_1143_ - aShortArray9108[i_1146_] * i_1142_) >> 14);
			aShortArray9108[i_1146_] = (short) i_1147_;
		}
		if (aClass130_9106 == null && aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public int method2591() {
		if (!aBool9092)
			method8488();
		return aShort9096;
	}

	boolean method2540() {
		if (anIntArrayArray9109 == null)
			return false;
		for (int i = 0; i < anInt9057; i++) {
			anIntArray9059[i] <<= 4;
			anIntArray9060[i] <<= 4;
			anIntArray9061[i] <<= 4;
		}
		anInt9073 = 0;
		anInt9052 = 0;
		anInt9117 = 0;
		return true;
	}

	void method2535() {
		/* empty */
	}

	public int method2458() {
		if (!aBool9092)
			method8488();
		return aShort9096;
	}

	public int method2564() {
		if (!aBool9092)
			method8488();
		return aShort9093;
	}

	public int method2576() {
		if (!aBool9092)
			method8488();
		return aShort9093;
	}

	public void method2472(int i, int i_1148_, int i_1149_) {
		for (int i_1150_ = 0; i_1150_ < anInt9058; i_1150_++) {
			if (i != 0)
				anIntArray9059[i_1150_] += i;
			if (i_1148_ != 0)
				anIntArray9060[i_1150_] += i_1148_;
			if (i_1149_ != 0)
				anIntArray9061[i_1150_] += i_1149_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public void method2530(int i, int i_1151_, int i_1152_) {
		for (int i_1153_ = 0; i_1153_ < anInt9058; i_1153_++) {
			if (i != 0)
				anIntArray9059[i_1153_] += i;
			if (i_1151_ != 0)
				anIntArray9060[i_1153_] += i_1151_;
			if (i_1152_ != 0)
				anIntArray9061[i_1153_] += i_1152_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public int method2612() {
		if (!aBool9092)
			method8488();
		return aShort9094;
	}

	public void method2541(int i) {
		int i_1154_ = Class447.anIntArray4906[i];
		int i_1155_ = Class447.anIntArray4921[i];
		for (int i_1156_ = 0; i_1156_ < anInt9058; i_1156_++) {
			int i_1157_ = ((anIntArray9061[i_1156_] * i_1154_ + anIntArray9059[i_1156_] * i_1155_) >> 14);
			anIntArray9061[i_1156_] = (anIntArray9061[i_1156_] * i_1155_ - anIntArray9059[i_1156_] * i_1154_) >> 14;
			anIntArray9059[i_1156_] = i_1157_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public int method2559() {
		if (!aBool9092)
			method8488();
		return aShort9094;
	}

	public void method2457(int i) {
		int i_1158_ = Class447.anIntArray4906[i];
		int i_1159_ = Class447.anIntArray4921[i];
		for (int i_1160_ = 0; i_1160_ < anInt9058; i_1160_++) {
			int i_1161_ = ((anIntArray9060[i_1160_] * i_1159_ - anIntArray9061[i_1160_] * i_1158_) >> 14);
			anIntArray9061[i_1160_] = (anIntArray9060[i_1160_] * i_1158_ + anIntArray9061[i_1160_] * i_1159_) >> 14;
			anIntArray9060[i_1160_] = i_1161_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	public int method2582() {
		if (!aBool9099)
			method2501();
		return aShort9083;
	}

	public void method2509(short i, short i_1162_) {
		Class174 class174 = aClass167_Sub2_9049.aClass174_1852;
		for (int i_1163_ = 0; i_1163_ < anInt9118; i_1163_++) {
			if (aShortArray9079[i_1163_] == i)
				aShortArray9079[i_1163_] = i_1162_;
		}
		byte i_1164_ = 0;
		byte i_1165_ = 0;
		if (i != -1) {
			Class164 class164 = class174.method2446(i & 0xffff, -1697066706);
			i_1164_ = class164.aByte1829;
			i_1165_ = class164.aByte1828;
		}
		byte i_1166_ = 0;
		byte i_1167_ = 0;
		if (i_1162_ != -1) {
			Class164 class164 = class174.method2446(i_1162_ & 0xffff, -562708022);
			i_1166_ = class164.aByte1829;
			i_1167_ = class164.aByte1828;
			if (class164.aByte1802 != 0 || class164.aByte1803 != 0)
				aBool9056 = true;
		}
		if (i_1164_ != i_1166_ | i_1165_ != i_1167_) {
			if (aClass142Array9107 != null) {
				for (int i_1168_ = 0; i_1168_ < anInt9116; i_1168_++) {
					Class142 class142 = aClass142Array9107[i_1168_];
					Class132 class132 = aClass132Array9102[i_1168_];
					class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
		}
	}

	public void method2584(int i) {
		aShort9053 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public void method2585(int i) {
		aShort9053 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public void method2586(int i) {
		aShort9053 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public void method2516(int i) {
		aShort9053 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public void method2588(int i) {
		aShort9054 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
	}

	public void method2607(int i) {
		aShort9054 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
	}

	public void method2495(int i) {
		aShort9054 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
	}

	public boolean method2512() {
		return aBool9056;
	}

	public int method2593() {
		return aShort9054;
	}

	public void method2594(short i, short i_1169_) {
		for (int i_1170_ = 0; i_1170_ < anInt9118; i_1170_++) {
			if (aShortArray9074[i_1170_] == i)
				aShortArray9074[i_1170_] = i_1169_;
		}
		if (aClass142Array9107 != null) {
			for (int i_1171_ = 0; i_1171_ < anInt9116; i_1171_++) {
				Class142 class142 = aClass142Array9107[i_1171_];
				Class132 class132 = aClass132Array9102[i_1171_];
				class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public void method2595(short i, short i_1172_) {
		Class174 class174 = aClass167_Sub2_9049.aClass174_1852;
		for (int i_1173_ = 0; i_1173_ < anInt9118; i_1173_++) {
			if (aShortArray9079[i_1173_] == i)
				aShortArray9079[i_1173_] = i_1172_;
		}
		byte i_1174_ = 0;
		byte i_1175_ = 0;
		if (i != -1) {
			Class164 class164 = class174.method2446(i & 0xffff, -1730898546);
			i_1174_ = class164.aByte1829;
			i_1175_ = class164.aByte1828;
		}
		byte i_1176_ = 0;
		byte i_1177_ = 0;
		if (i_1172_ != -1) {
			Class164 class164 = class174.method2446(i_1172_ & 0xffff, -993191737);
			i_1176_ = class164.aByte1829;
			i_1177_ = class164.aByte1828;
			if (class164.aByte1802 != 0 || class164.aByte1803 != 0)
				aBool9056 = true;
		}
		if (i_1174_ != i_1176_ | i_1175_ != i_1177_) {
			if (aClass142Array9107 != null) {
				for (int i_1178_ = 0; i_1178_ < anInt9116; i_1178_++) {
					Class142 class142 = aClass142Array9107[i_1178_];
					Class132 class132 = aClass132Array9102[i_1178_];
					class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
				}
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
		}
	}

	public boolean method2625(int i, int i_1179_, Class433 class433, boolean bool, int i_1180_) {
		Class443 class443 = aClass167_Sub2_9049.aClass443_9223;
		class443.method5359(class433);
		class443.method5390(aClass167_Sub2_9049.aClass443_9211);
		boolean bool_1181_ = false;
		int i_1182_ = 2147483647;
		int i_1183_ = -2147483648;
		int i_1184_ = 2147483647;
		int i_1185_ = -2147483648;
		if (!aBool9092)
			method8488();
		int i_1186_ = aShort9096 - aShort9095 >> 1;
		int i_1187_ = aShort9094 - aShort9093 >> 1;
		int i_1188_ = aShort9098 - aShort9097 >> 1;
		int i_1189_ = aShort9095 + i_1186_;
		int i_1190_ = aShort9093 + i_1187_;
		int i_1191_ = aShort9097 + i_1188_;
		int i_1192_ = i_1189_ - (i_1186_ << i_1180_);
		int i_1193_ = i_1190_ - (i_1187_ << i_1180_);
		int i_1194_ = i_1191_ - (i_1188_ << i_1180_);
		int i_1195_ = i_1189_ + (i_1186_ << i_1180_);
		int i_1196_ = i_1190_ + (i_1187_ << i_1180_);
		int i_1197_ = i_1191_ + (i_1188_ << i_1180_);
		anIntArray9110[0] = i_1192_;
		anIntArray9113[0] = i_1193_;
		anIntArray9114[0] = i_1194_;
		anIntArray9110[1] = i_1195_;
		anIntArray9113[1] = i_1193_;
		anIntArray9114[1] = i_1194_;
		anIntArray9110[2] = i_1192_;
		anIntArray9113[2] = i_1196_;
		anIntArray9114[2] = i_1194_;
		anIntArray9110[3] = i_1195_;
		anIntArray9113[3] = i_1196_;
		anIntArray9114[3] = i_1194_;
		anIntArray9110[4] = i_1192_;
		anIntArray9113[4] = i_1193_;
		anIntArray9114[4] = i_1197_;
		anIntArray9110[5] = i_1195_;
		anIntArray9113[5] = i_1193_;
		anIntArray9114[5] = i_1197_;
		anIntArray9110[6] = i_1192_;
		anIntArray9113[6] = i_1196_;
		anIntArray9114[6] = i_1197_;
		anIntArray9110[7] = i_1195_;
		anIntArray9113[7] = i_1196_;
		anIntArray9114[7] = i_1197_;
		for (int i_1198_ = 0; i_1198_ < 8; i_1198_++) {
			int i_1199_ = anIntArray9110[i_1198_];
			int i_1200_ = anIntArray9113[i_1198_];
			int i_1201_ = anIntArray9114[i_1198_];
			float f = (class443.aFloatArray4878[2] * (float) i_1199_ + class443.aFloatArray4878[6] * (float) i_1200_ + class443.aFloatArray4878[10] * (float) i_1201_ + class443.aFloatArray4878[14]);
			float f_1202_ = (class443.aFloatArray4878[3] * (float) i_1199_ + class443.aFloatArray4878[7] * (float) i_1200_ + class443.aFloatArray4878[11] * (float) i_1201_ + class443.aFloatArray4878[15]);
			if (f >= -f_1202_) {
				float f_1203_ = (class443.aFloatArray4878[0] * (float) i_1199_ + class443.aFloatArray4878[4] * (float) i_1200_ + class443.aFloatArray4878[8] * (float) i_1201_ + class443.aFloatArray4878[12]);
				float f_1204_ = (class443.aFloatArray4878[1] * (float) i_1199_ + class443.aFloatArray4878[5] * (float) i_1200_ + class443.aFloatArray4878[9] * (float) i_1201_ + class443.aFloatArray4878[13]);
				int i_1205_ = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1203_ / f_1202_));
				int i_1206_ = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1204_ / f_1202_));
				if (i_1205_ < i_1182_)
					i_1182_ = i_1205_;
				if (i_1205_ > i_1183_)
					i_1183_ = i_1205_;
				if (i_1206_ < i_1184_)
					i_1184_ = i_1206_;
				if (i_1206_ > i_1185_)
					i_1185_ = i_1206_;
				bool_1181_ = true;
			}
		}
		if (bool_1181_ && i > i_1182_ && i < i_1183_ && i_1179_ > i_1184_ && i_1179_ < i_1185_) {
			if (bool)
				return true;
			if (aClass167_Sub2_9049.anIntArray9321.length < anInt9077) {
				aClass167_Sub2_9049.anIntArray9321 = new int[anInt9077];
				aClass167_Sub2_9049.anIntArray9320 = new int[anInt9077];
			}
			int[] is = aClass167_Sub2_9049.anIntArray9321;
			int[] is_1207_ = aClass167_Sub2_9049.anIntArray9320;
			for (int i_1208_ = 0; i_1208_ < anInt9058; i_1208_++) {
				int i_1209_ = anIntArray9059[i_1208_];
				int i_1210_ = anIntArray9060[i_1208_];
				int i_1211_ = anIntArray9061[i_1208_];
				float f = (class443.aFloatArray4878[2] * (float) i_1209_ + class443.aFloatArray4878[6] * (float) i_1210_ + class443.aFloatArray4878[10] * (float) i_1211_ + class443.aFloatArray4878[14]);
				float f_1212_ = (class443.aFloatArray4878[3] * (float) i_1209_ + class443.aFloatArray4878[7] * (float) i_1210_ + class443.aFloatArray4878[11] * (float) i_1211_ + class443.aFloatArray4878[15]);
				if (f >= -f_1212_) {
					float f_1213_ = (class443.aFloatArray4878[0] * (float) i_1209_ + class443.aFloatArray4878[4] * (float) i_1210_ + class443.aFloatArray4878[8] * (float) i_1211_ + class443.aFloatArray4878[12]);
					float f_1214_ = (class443.aFloatArray4878[1] * (float) i_1209_ + class443.aFloatArray4878[5] * (float) i_1210_ + class443.aFloatArray4878[9] * (float) i_1211_ + class443.aFloatArray4878[13]);
					int i_1215_ = anIntArray9068[i_1208_];
					int i_1216_ = anIntArray9068[i_1208_ + 1];
					for (int i_1217_ = i_1215_; i_1217_ < i_1216_ && aShortArray9103[i_1217_] != 0; i_1217_++) {
						int i_1218_ = (aShortArray9103[i_1217_] & 0xffff) - 1;
						is[i_1218_] = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1213_ / f_1212_));
						is_1207_[i_1218_] = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1214_ / f_1212_));
					}
				} else {
					int i_1219_ = anIntArray9068[i_1208_];
					int i_1220_ = anIntArray9068[i_1208_ + 1];
					for (int i_1221_ = i_1219_; i_1221_ < i_1220_ && aShortArray9103[i_1221_] != 0; i_1221_++) {
						int i_1222_ = (aShortArray9103[i_1221_] & 0xffff) - 1;
						is[i_1222_] = -999999;
					}
				}
			}
			for (int i_1223_ = 0; i_1223_ < anInt9118; i_1223_++) {
				if (is[aShortArray9076[i_1223_] & 0xffff] != -999999 && is[aShortArray9055[i_1223_] & 0xffff] != -999999 && is[aShortArray9091[i_1223_] & 0xffff] != -999999 && method8491(i, i_1179_, is_1207_[aShortArray9076[i_1223_] & 0xffff], is_1207_[aShortArray9055[i_1223_] & 0xffff], is_1207_[aShortArray9091[i_1223_] & 0xffff], is[aShortArray9076[i_1223_] & 0xffff], is[aShortArray9055[i_1223_] & 0xffff], is[aShortArray9091[i_1223_] & 0xffff]))
					return true;
			}
		}
		return false;
	}

	public void method2620(int i, int i_1224_, int i_1225_, int i_1226_) {
		for (int i_1227_ = 0; i_1227_ < anInt9118; i_1227_++) {
			int i_1228_ = aShortArray9074[i_1227_] & 0xffff;
			int i_1229_ = i_1228_ >> 10 & 0x3f;
			int i_1230_ = i_1228_ >> 7 & 0x7;
			int i_1231_ = i_1228_ & 0x7f;
			if (i != -1)
				i_1229_ += (i - i_1229_) * i_1226_ >> 7;
			if (i_1224_ != -1)
				i_1230_ += (i_1224_ - i_1230_) * i_1226_ >> 7;
			if (i_1225_ != -1)
				i_1231_ += (i_1225_ - i_1231_) * i_1226_ >> 7;
			aShortArray9074[i_1227_] = (short) (i_1229_ << 10 | i_1230_ << 7 | i_1231_);
		}
		if (aClass142Array9107 != null) {
			for (int i_1232_ = 0; i_1232_ < anInt9116; i_1232_++) {
				Class142 class142 = aClass142Array9107[i_1232_];
				Class132 class132 = aClass132Array9102[i_1232_];
				class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
			}
		}
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
	}

	public Class172[] method2598() {
		return aClass172Array9104;
	}

	public Class172[] method2599() {
		return aClass172Array9104;
	}

	public int method2622() {
		if (!aBool9092)
			method8488();
		return aShort9096;
	}

	public Class156[] method2600() {
		return aClass156Array9064;
	}

	public boolean method2621() {
		if (aShortArray9079 == null)
			return true;
		for (int i = 0; i < aShortArray9079.length; i++) {
			if (aShortArray9079[i] != -1) {
				Class164 class164 = aClass167_Sub2_9049.aClass174_1852.method2446(aShortArray9079[i] & 0xffff, -45048859);
				if (class164.aBool1814 && !aClass167_Sub2_9049.aClass149_9293.method1819(Class599.aClass599_7843, class164, -1))
					return false;
			}
		}
		return true;
	}

	public boolean method2601() {
		if (aShortArray9079 == null)
			return true;
		for (int i = 0; i < aShortArray9079.length; i++) {
			if (aShortArray9079[i] != -1) {
				Class164 class164 = aClass167_Sub2_9049.aClass174_1852.method2446(aShortArray9079[i] & 0xffff, -960876310);
				if (class164.aBool1814 && !aClass167_Sub2_9049.aClass149_9293.method1819(Class599.aClass599_7843, class164, -1))
					return false;
			}
		}
		return true;
	}

	void method2548(int i, int i_1233_, int i_1234_, int i_1235_) {
		if (i == 0) {
			int i_1236_ = 0;
			anInt9073 = 0;
			anInt9052 = 0;
			anInt9117 = 0;
			for (int i_1237_ = 0; i_1237_ < anInt9058; i_1237_++) {
				anInt9073 += anIntArray9059[i_1237_];
				anInt9052 += anIntArray9060[i_1237_];
				anInt9117 += anIntArray9061[i_1237_];
				i_1236_++;
			}
			if (i_1236_ > 0) {
				anInt9073 = anInt9073 / i_1236_ + i_1233_;
				anInt9052 = anInt9052 / i_1236_ + i_1234_;
				anInt9117 = anInt9117 / i_1236_ + i_1235_;
			} else {
				anInt9073 = i_1233_;
				anInt9052 = i_1234_;
				anInt9117 = i_1235_;
			}
		} else if (i == 1) {
			for (int i_1238_ = 0; i_1238_ < anInt9058; i_1238_++) {
				anIntArray9059[i_1238_] += i_1233_;
				anIntArray9060[i_1238_] += i_1234_;
				anIntArray9061[i_1238_] += i_1235_;
			}
		} else if (i == 2) {
			for (int i_1239_ = 0; i_1239_ < anInt9058; i_1239_++) {
				anIntArray9059[i_1239_] -= anInt9073;
				anIntArray9060[i_1239_] -= anInt9052;
				anIntArray9061[i_1239_] -= anInt9117;
				if (i_1235_ != 0) {
					int i_1240_ = Class447.anIntArray4906[i_1235_];
					int i_1241_ = Class447.anIntArray4921[i_1235_];
					int i_1242_ = ((anIntArray9060[i_1239_] * i_1240_ + anIntArray9059[i_1239_] * i_1241_ + 16383) >> 14);
					anIntArray9060[i_1239_] = (anIntArray9060[i_1239_] * i_1241_ - anIntArray9059[i_1239_] * i_1240_ + 16383) >> 14;
					anIntArray9059[i_1239_] = i_1242_;
				}
				if (i_1233_ != 0) {
					int i_1243_ = Class447.anIntArray4906[i_1233_];
					int i_1244_ = Class447.anIntArray4921[i_1233_];
					int i_1245_ = ((anIntArray9060[i_1239_] * i_1244_ - anIntArray9061[i_1239_] * i_1243_ + 16383) >> 14);
					anIntArray9061[i_1239_] = (anIntArray9060[i_1239_] * i_1243_ + anIntArray9061[i_1239_] * i_1244_ + 16383) >> 14;
					anIntArray9060[i_1239_] = i_1245_;
				}
				if (i_1234_ != 0) {
					int i_1246_ = Class447.anIntArray4906[i_1234_];
					int i_1247_ = Class447.anIntArray4921[i_1234_];
					int i_1248_ = ((anIntArray9061[i_1239_] * i_1246_ + anIntArray9059[i_1239_] * i_1247_ + 16383) >> 14);
					anIntArray9061[i_1239_] = (anIntArray9061[i_1239_] * i_1247_ - anIntArray9059[i_1239_] * i_1246_ + 16383) >> 14;
					anIntArray9059[i_1239_] = i_1248_;
				}
				anIntArray9059[i_1239_] += anInt9073;
				anIntArray9060[i_1239_] += anInt9052;
				anIntArray9061[i_1239_] += anInt9117;
			}
		} else if (i == 3) {
			for (int i_1249_ = 0; i_1249_ < anInt9058; i_1249_++) {
				anIntArray9059[i_1249_] -= anInt9073;
				anIntArray9060[i_1249_] -= anInt9052;
				anIntArray9061[i_1249_] -= anInt9117;
				anIntArray9059[i_1249_] = anIntArray9059[i_1249_] * i_1233_ / 128;
				anIntArray9060[i_1249_] = anIntArray9060[i_1249_] * i_1234_ / 128;
				anIntArray9061[i_1249_] = anIntArray9061[i_1249_] * i_1235_ / 128;
				anIntArray9059[i_1249_] += anInt9073;
				anIntArray9060[i_1249_] += anInt9052;
				anIntArray9061[i_1249_] += anInt9117;
			}
		} else if (i == 5) {
			for (int i_1250_ = 0; i_1250_ < anInt9118; i_1250_++) {
				int i_1251_ = (aByteArray9075[i_1250_] & 0xff) + i_1233_ * 8;
				if (i_1251_ < 0)
					i_1251_ = 0;
				else if (i_1251_ > 255)
					i_1251_ = 255;
				aByteArray9075[i_1250_] = (byte) i_1251_;
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
			if (aClass142Array9107 != null) {
				for (int i_1252_ = 0; i_1252_ < anInt9116; i_1252_++) {
					Class142 class142 = aClass142Array9107[i_1252_];
					Class132 class132 = aClass132Array9102[i_1252_];
					class132.anInt1603 = (class132.anInt1603 & 0xffffff | (255 - (aByteArray9075[class142.anInt1663] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_1253_ = 0; i_1253_ < anInt9118; i_1253_++) {
				int i_1254_ = aShortArray9074[i_1253_] & 0xffff;
				int i_1255_ = i_1254_ >> 10 & 0x3f;
				int i_1256_ = i_1254_ >> 7 & 0x7;
				int i_1257_ = i_1254_ & 0x7f;
				i_1255_ = i_1255_ + i_1233_ & 0x3f;
				i_1256_ += i_1234_ / 4;
				if (i_1256_ < 0)
					i_1256_ = 0;
				else if (i_1256_ > 7)
					i_1256_ = 7;
				i_1257_ += i_1235_;
				if (i_1257_ < 0)
					i_1257_ = 0;
				else if (i_1257_ > 127)
					i_1257_ = 127;
				aShortArray9074[i_1253_] = (short) (i_1255_ << 10 | i_1256_ << 7 | i_1257_);
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
			if (aClass142Array9107 != null) {
				for (int i_1258_ = 0; i_1258_ < anInt9116; i_1258_++) {
					Class142 class142 = aClass142Array9107[i_1258_];
					Class132 class132 = aClass132Array9102[i_1258_];
					class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_1259_ = 0; i_1259_ < anInt9116; i_1259_++) {
				Class132 class132 = aClass132Array9102[i_1259_];
				class132.anInt1606 += i_1233_;
				class132.anInt1607 += i_1234_;
			}
		} else if (i == 10) {
			for (int i_1260_ = 0; i_1260_ < anInt9116; i_1260_++) {
				Class132 class132 = aClass132Array9102[i_1260_];
				class132.anInt1608 = class132.anInt1608 * i_1233_ >> 7;
				class132.anInt1604 = class132.anInt1604 * i_1234_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1261_ = 0; i_1261_ < anInt9116; i_1261_++) {
				Class132 class132 = aClass132Array9102[i_1261_];
				class132.anInt1605 = class132.anInt1605 + i_1233_ & 0x3fff;
			}
		}
	}

	public boolean method2603() {
		if (aShortArray9079 == null)
			return true;
		for (int i = 0; i < aShortArray9079.length; i++) {
			if (aShortArray9079[i] != -1) {
				Class164 class164 = (aClass167_Sub2_9049.aClass174_1852.method2446(aShortArray9079[i] & 0xffff, -1585193066));
				if (class164.aBool1814 && !aClass167_Sub2_9049.aClass149_9293.method1819(Class599.aClass599_7843, class164, -1))
					return false;
			}
		}
		return true;
	}

	public void method2473() {
		for (int i = 0; i < anInt9058; i++)
			anIntArray9061[i] = -anIntArray9061[i];
		for (int i = 0; i < anInt9077; i++)
			aShortArray9071[i] = (short) -aShortArray9071[i];
		for (int i = 0; i < anInt9118; i++) {
			short i_1262_ = aShortArray9076[i];
			aShortArray9076[i] = aShortArray9091[i];
			aShortArray9091[i] = i_1262_;
		}
		if (aClass130_9106 == null && aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		if (aClass121_9046 != null)
			aClass121_9046.anInterface17_1481 = null;
		aBool9092 = false;
	}

	public boolean method2605() {
		if (aShortArray9079 == null)
			return true;
		for (int i = 0; i < aShortArray9079.length; i++) {
			if (aShortArray9079[i] != -1) {
				Class164 class164 = (aClass167_Sub2_9049.aClass174_1852.method2446(aShortArray9079[i] & 0xffff, -1649740451));
				if (class164.aBool1814 && !aClass167_Sub2_9049.aClass149_9293.method1819(Class599.aClass599_7843, class164, -1))
					return false;
			}
		}
		return true;
	}

	public boolean method2606() {
		return aBool9084;
	}

	public boolean method2567() {
		return aBool9084;
	}

	public boolean method2608() {
		return aBool9084;
	}

	public Class156[] method2557() {
		return aClass156Array9064;
	}

	public int method2499() {
		if (!aBool9092)
			method8488();
		return aShort9098;
	}

	int method8498(int i, short i_1263_, int i_1264_, byte i_1265_) {
		int i_1266_ = Class639.anIntArray8309[method8495(i, i_1264_)];
		if (i_1263_ != -1) {
			Class164 class164 = aClass167_Sub2_9049.aClass174_1852.method2446(i_1263_ & 0xffff, -612565714);
			int i_1267_ = class164.aByte1829 & 0xff;
			if (i_1267_ != 0) {
				int i_1268_;
				if (i_1264_ < 0)
					i_1268_ = 0;
				else if (i_1264_ > 127)
					i_1268_ = 16777215;
				else
					i_1268_ = 131586 * i_1264_;
				if (i_1267_ == 256)
					i_1266_ = i_1268_;
				else {
					int i_1269_ = i_1267_;
					int i_1270_ = 256 - i_1267_;
					i_1266_ = ((((i_1268_ & 0xff00ff) * i_1269_ + (i_1266_ & 0xff00ff) * i_1270_) & ~0xff00ff) + (((i_1268_ & 0xff00) * i_1269_ + (i_1266_ & 0xff00) * i_1270_) & 0xff0000)) >> 8;
				}
			}
			int i_1271_ = class164.aByte1828 & 0xff;
			if (i_1271_ != 0) {
				i_1271_ += 256;
				int i_1272_ = ((i_1266_ & 0xff0000) >> 16) * i_1271_;
				if (i_1272_ > 65535)
					i_1272_ = 65535;
				int i_1273_ = ((i_1266_ & 0xff00) >> 8) * i_1271_;
				if (i_1273_ > 65535)
					i_1273_ = 65535;
				int i_1274_ = (i_1266_ & 0xff) * i_1271_;
				if (i_1274_ > 65535)
					i_1274_ = 65535;
				i_1266_ = (i_1272_ << 8 & 0xff0000) + (i_1273_ & 0xff00) + (i_1274_ >> 8);
			}
		}
		return i_1266_ << 8 | 255 - (i_1265_ & 0xff);
	}

	public int method2578() {
		if (!aBool9092)
			method8488();
		return aShort9094;
	}

	boolean method2565() {
		if (anIntArrayArray9109 == null)
			return false;
		for (int i = 0; i < anInt9057; i++) {
			anIntArray9059[i] <<= 4;
			anIntArray9060[i] <<= 4;
			anIntArray9061[i] <<= 4;
		}
		anInt9073 = 0;
		anInt9052 = 0;
		anInt9117 = 0;
		return true;
	}

	public int method2610() {
		return anInt9050;
	}

	public void method2503(int i) {
		aShort9054 = (short) i;
		if (aClass130_9065 != null)
			aClass130_9065.anInterface15_1587 = null;
		if (aClass130_9106 != null)
			aClass130_9106.anInterface15_1587 = null;
	}

	public int method2488() {
		if (!aBool9092)
			method8488();
		return aShort9096;
	}

	public void method2533(int i, int i_1275_, Class160 class160, Class160 class160_1276_, int i_1277_, int i_1278_, int i_1279_) {
		if (!aBool9092)
			method8488();
		int i_1280_ = i_1277_ + aShort9095;
		int i_1281_ = i_1277_ + aShort9096;
		int i_1282_ = i_1279_ + aShort9097;
		int i_1283_ = i_1279_ + aShort9098;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_1280_ >= 0 && ((i_1281_ + class160.anInt1767 * -1504778739 >> class160.anInt1768 * 2064238369) < class160.anInt1766 * 1718142487) && i_1282_ >= 0 && ((i_1283_ + class160.anInt1767 * -1504778739 >> class160.anInt1768 * 2064238369) < class160.anInt1769 * -889224915))) {
			if (i == 4 || i == 5) {
				if (class160_1276_ == null || (i_1280_ < 0 || ((i_1281_ + class160_1276_.anInt1767 * -1504778739 >> class160_1276_.anInt1768 * 2064238369) >= class160_1276_.anInt1766 * 1718142487) || i_1282_ < 0 || ((i_1283_ + class160_1276_.anInt1767 * -1504778739 >> class160_1276_.anInt1768 * 2064238369) >= class160_1276_.anInt1769 * -889224915)))
					return;
			} else {
				i_1280_ >>= class160.anInt1768 * 2064238369;
				i_1281_ = (i_1281_ + (class160.anInt1767 * -1504778739 - 1) >> class160.anInt1768 * 2064238369);
				i_1282_ >>= class160.anInt1768 * 2064238369;
				i_1283_ = (i_1283_ + (class160.anInt1767 * -1504778739 - 1) >> class160.anInt1768 * 2064238369);
				if ((class160.method1927(i_1280_, i_1282_, -1104823452) == i_1278_) && (class160.method1927(i_1281_, i_1282_, -1673536895) == i_1278_) && (class160.method1927(i_1280_, i_1283_, 230616891) == i_1278_) && (class160.method1927(i_1281_, i_1283_, -1545186908) == i_1278_))
					return;
			}
			if (i == 1) {
				for (int i_1284_ = 0; i_1284_ < anInt9058; i_1284_++)
					anIntArray9060[i_1284_] = (anIntArray9060[i_1284_] + class160.method1926((anIntArray9059[i_1284_] + i_1277_), (anIntArray9061[i_1284_] + i_1279_), (byte) 0) - i_1278_);
			} else if (i == 2) {
				int i_1285_ = aShort9093;
				if (i_1285_ == 0)
					return;
				for (int i_1286_ = 0; i_1286_ < anInt9058; i_1286_++) {
					int i_1287_ = (anIntArray9060[i_1286_] << 16) / i_1285_;
					if (i_1287_ < i_1275_)
						anIntArray9060[i_1286_] = (anIntArray9060[i_1286_] + (class160.method1926((anIntArray9059[i_1286_] + i_1277_), (anIntArray9061[i_1286_] + i_1279_), (byte) 0) - i_1278_) * (i_1275_ - i_1287_) / i_1275_);
				}
			} else if (i == 3) {
				int i_1288_ = (i_1275_ & 0xff) * 16;
				int i_1289_ = (i_1275_ >> 8 & 0xff) * 16;
				int i_1290_ = (i_1275_ >> 16 & 0xff) << 6;
				int i_1291_ = (i_1275_ >> 24 & 0xff) << 6;
				if (i_1277_ - (i_1288_ >> 1) < 0 || ((i_1277_ + (i_1288_ >> 1) + class160.anInt1767 * -1504778739) >= (class160.anInt1766 * 1718142487 << class160.anInt1768 * 2064238369)) || i_1279_ - (i_1289_ >> 1) < 0 || ((i_1279_ + (i_1289_ >> 1) + class160.anInt1767 * -1504778739) >= (class160.anInt1769 * -889224915 << class160.anInt1768 * 2064238369)))
					return;
				method2476(class160, i_1277_, i_1278_, i_1279_, i_1288_, i_1289_, i_1290_, i_1291_);
			} else if (i == 4) {
				int i_1292_ = aShort9094 - aShort9093;
				for (int i_1293_ = 0; i_1293_ < anInt9058; i_1293_++)
					anIntArray9060[i_1293_] = (anIntArray9060[i_1293_] + ((class160_1276_.method1926(anIntArray9059[i_1293_] + i_1277_, anIntArray9061[i_1293_] + i_1279_, (byte) 0)) - i_1278_) + i_1292_);
			} else if (i == 5) {
				int i_1294_ = aShort9094 - aShort9093;
				for (int i_1295_ = 0; i_1295_ < anInt9058; i_1295_++) {
					int i_1296_ = anIntArray9059[i_1295_] + i_1277_;
					int i_1297_ = anIntArray9061[i_1295_] + i_1279_;
					int i_1298_ = class160.method1926(i_1296_, i_1297_, (byte) 0);
					int i_1299_ = class160_1276_.method1926(i_1296_, i_1297_, (byte) 0);
					int i_1300_ = i_1298_ - i_1299_ - i_1275_;
					anIntArray9060[i_1295_] = ((anIntArray9060[i_1295_] << 8) / i_1294_ * i_1300_ >> 8) - (i_1278_ - i_1298_);
				}
			}
			if (aClass130_9082 != null)
				aClass130_9082.anInterface15_1587 = null;
			aBool9092 = false;
		}
	}

	void method2554(int i, int[] is, int i_1301_, int i_1302_, int i_1303_, boolean bool, int i_1304_, int[] is_1305_) {
		int i_1306_ = is.length;
		if (i == 0) {
			i_1301_ <<= 4;
			i_1302_ <<= 4;
			i_1303_ <<= 4;
			int i_1307_ = 0;
			anInt9073 = 0;
			anInt9052 = 0;
			anInt9117 = 0;
			for (int i_1308_ = 0; i_1308_ < i_1306_; i_1308_++) {
				int i_1309_ = is[i_1308_];
				if (i_1309_ < anIntArrayArray9109.length) {
					int[] is_1310_ = anIntArrayArray9109[i_1309_];
					for (int i_1311_ = 0; i_1311_ < is_1310_.length; i_1311_++) {
						int i_1312_ = is_1310_[i_1311_];
						if (aShortArray9063 == null || (i_1304_ & aShortArray9063[i_1312_]) != 0) {
							anInt9073 += anIntArray9059[i_1312_];
							anInt9052 += anIntArray9060[i_1312_];
							anInt9117 += anIntArray9061[i_1312_];
							i_1307_++;
						}
					}
				}
			}
			if (i_1307_ > 0) {
				anInt9073 = anInt9073 / i_1307_ + i_1301_;
				anInt9052 = anInt9052 / i_1307_ + i_1302_;
				anInt9117 = anInt9117 / i_1307_ + i_1303_;
				aBool9105 = true;
			} else {
				anInt9073 = i_1301_;
				anInt9052 = i_1302_;
				anInt9117 = i_1303_;
			}
		} else if (i == 1) {
			if (is_1305_ != null) {
				int i_1313_ = ((is_1305_[0] * i_1301_ + is_1305_[1] * i_1302_ + is_1305_[2] * i_1303_ + 8192) >> 14);
				int i_1314_ = ((is_1305_[3] * i_1301_ + is_1305_[4] * i_1302_ + is_1305_[5] * i_1303_ + 8192) >> 14);
				int i_1315_ = ((is_1305_[6] * i_1301_ + is_1305_[7] * i_1302_ + is_1305_[8] * i_1303_ + 8192) >> 14);
				i_1301_ = i_1313_;
				i_1302_ = i_1314_;
				i_1303_ = i_1315_;
			}
			i_1301_ <<= 4;
			i_1302_ <<= 4;
			i_1303_ <<= 4;
			for (int i_1316_ = 0; i_1316_ < i_1306_; i_1316_++) {
				int i_1317_ = is[i_1316_];
				if (i_1317_ < anIntArrayArray9109.length) {
					int[] is_1318_ = anIntArrayArray9109[i_1317_];
					for (int i_1319_ = 0; i_1319_ < is_1318_.length; i_1319_++) {
						int i_1320_ = is_1318_[i_1319_];
						if (aShortArray9063 == null || (i_1304_ & aShortArray9063[i_1320_]) != 0) {
							anIntArray9059[i_1320_] += i_1301_;
							anIntArray9060[i_1320_] += i_1302_;
							anIntArray9061[i_1320_] += i_1303_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1305_ != null) {
				int i_1321_ = is_1305_[9] << 4;
				int i_1322_ = is_1305_[10] << 4;
				int i_1323_ = is_1305_[11] << 4;
				int i_1324_ = is_1305_[12] << 4;
				int i_1325_ = is_1305_[13] << 4;
				int i_1326_ = is_1305_[14] << 4;
				if (aBool9105) {
					int i_1327_ = ((is_1305_[0] * anInt9073 + is_1305_[3] * anInt9052 + is_1305_[6] * anInt9117 + 8192) >> 14);
					int i_1328_ = ((is_1305_[1] * anInt9073 + is_1305_[4] * anInt9052 + is_1305_[7] * anInt9117 + 8192) >> 14);
					int i_1329_ = ((is_1305_[2] * anInt9073 + is_1305_[5] * anInt9052 + is_1305_[8] * anInt9117 + 8192) >> 14);
					i_1327_ += i_1324_;
					i_1328_ += i_1325_;
					i_1329_ += i_1326_;
					anInt9073 = i_1327_;
					anInt9052 = i_1328_;
					anInt9117 = i_1329_;
					aBool9105 = false;
				}
				int[] is_1330_ = new int[9];
				int i_1331_ = Class447.anIntArray4921[i_1301_];
				int i_1332_ = Class447.anIntArray4906[i_1301_];
				int i_1333_ = Class447.anIntArray4921[i_1302_];
				int i_1334_ = Class447.anIntArray4906[i_1302_];
				int i_1335_ = Class447.anIntArray4921[i_1303_];
				int i_1336_ = Class447.anIntArray4906[i_1303_];
				int i_1337_ = i_1332_ * i_1335_ + 8192 >> 14;
				int i_1338_ = i_1332_ * i_1336_ + 8192 >> 14;
				is_1330_[0] = i_1333_ * i_1335_ + i_1334_ * i_1338_ + 8192 >> 14;
				is_1330_[1] = -i_1333_ * i_1336_ + i_1334_ * i_1337_ + 8192 >> 14;
				is_1330_[2] = i_1334_ * i_1331_ + 8192 >> 14;
				is_1330_[3] = i_1331_ * i_1336_ + 8192 >> 14;
				is_1330_[4] = i_1331_ * i_1335_ + 8192 >> 14;
				is_1330_[5] = -i_1332_;
				is_1330_[6] = -i_1334_ * i_1335_ + i_1333_ * i_1338_ + 8192 >> 14;
				is_1330_[7] = i_1334_ * i_1336_ + i_1333_ * i_1337_ + 8192 >> 14;
				is_1330_[8] = i_1333_ * i_1331_ + 8192 >> 14;
				int i_1339_ = ((is_1330_[0] * -anInt9073 + is_1330_[1] * -anInt9052 + is_1330_[2] * -anInt9117 + 8192) >> 14);
				int i_1340_ = ((is_1330_[3] * -anInt9073 + is_1330_[4] * -anInt9052 + is_1330_[5] * -anInt9117 + 8192) >> 14);
				int i_1341_ = ((is_1330_[6] * -anInt9073 + is_1330_[7] * -anInt9052 + is_1330_[8] * -anInt9117 + 8192) >> 14);
				int i_1342_ = i_1339_ + anInt9073;
				int i_1343_ = i_1340_ + anInt9052;
				int i_1344_ = i_1341_ + anInt9117;
				int[] is_1345_ = new int[9];
				for (int i_1346_ = 0; i_1346_ < 3; i_1346_++) {
					for (int i_1347_ = 0; i_1347_ < 3; i_1347_++) {
						int i_1348_ = 0;
						for (int i_1349_ = 0; i_1349_ < 3; i_1349_++)
							i_1348_ += (is_1330_[i_1346_ * 3 + i_1349_] * is_1305_[i_1347_ * 3 + i_1349_]);
						is_1345_[i_1346_ * 3 + i_1347_] = i_1348_ + 8192 >> 14;
					}
				}
				int i_1350_ = ((is_1330_[0] * i_1324_ + is_1330_[1] * i_1325_ + is_1330_[2] * i_1326_ + 8192) >> 14);
				int i_1351_ = ((is_1330_[3] * i_1324_ + is_1330_[4] * i_1325_ + is_1330_[5] * i_1326_ + 8192) >> 14);
				int i_1352_ = ((is_1330_[6] * i_1324_ + is_1330_[7] * i_1325_ + is_1330_[8] * i_1326_ + 8192) >> 14);
				i_1350_ += i_1342_;
				i_1351_ += i_1343_;
				i_1352_ += i_1344_;
				int[] is_1353_ = new int[9];
				for (int i_1354_ = 0; i_1354_ < 3; i_1354_++) {
					for (int i_1355_ = 0; i_1355_ < 3; i_1355_++) {
						int i_1356_ = 0;
						for (int i_1357_ = 0; i_1357_ < 3; i_1357_++)
							i_1356_ += (is_1305_[i_1354_ * 3 + i_1357_] * is_1345_[i_1355_ + i_1357_ * 3]);
						is_1353_[i_1354_ * 3 + i_1355_] = i_1356_ + 8192 >> 14;
					}
				}
				int i_1358_ = ((is_1305_[0] * i_1350_ + is_1305_[1] * i_1351_ + is_1305_[2] * i_1352_ + 8192) >> 14);
				int i_1359_ = ((is_1305_[3] * i_1350_ + is_1305_[4] * i_1351_ + is_1305_[5] * i_1352_ + 8192) >> 14);
				int i_1360_ = ((is_1305_[6] * i_1350_ + is_1305_[7] * i_1351_ + is_1305_[8] * i_1352_ + 8192) >> 14);
				i_1358_ += i_1321_;
				i_1359_ += i_1322_;
				i_1360_ += i_1323_;
				for (int i_1361_ = 0; i_1361_ < i_1306_; i_1361_++) {
					int i_1362_ = is[i_1361_];
					if (i_1362_ < anIntArrayArray9109.length) {
						int[] is_1363_ = anIntArrayArray9109[i_1362_];
						for (int i_1364_ = 0; i_1364_ < is_1363_.length; i_1364_++) {
							int i_1365_ = is_1363_[i_1364_];
							if (aShortArray9063 == null || (i_1304_ & aShortArray9063[i_1365_]) != 0) {
								int i_1366_ = ((is_1353_[0] * anIntArray9059[i_1365_] + is_1353_[1] * anIntArray9060[i_1365_] + is_1353_[2] * anIntArray9061[i_1365_] + 8192) >> 14);
								int i_1367_ = ((is_1353_[3] * anIntArray9059[i_1365_] + is_1353_[4] * anIntArray9060[i_1365_] + is_1353_[5] * anIntArray9061[i_1365_] + 8192) >> 14);
								int i_1368_ = ((is_1353_[6] * anIntArray9059[i_1365_] + is_1353_[7] * anIntArray9060[i_1365_] + is_1353_[8] * anIntArray9061[i_1365_] + 8192) >> 14);
								i_1366_ += i_1358_;
								i_1367_ += i_1359_;
								i_1368_ += i_1360_;
								anIntArray9059[i_1365_] = i_1366_;
								anIntArray9060[i_1365_] = i_1367_;
								anIntArray9061[i_1365_] = i_1368_;
							}
						}
					}
				}
			} else {
				for (int i_1369_ = 0; i_1369_ < i_1306_; i_1369_++) {
					int i_1370_ = is[i_1369_];
					if (i_1370_ < anIntArrayArray9109.length) {
						int[] is_1371_ = anIntArrayArray9109[i_1370_];
						for (int i_1372_ = 0; i_1372_ < is_1371_.length; i_1372_++) {
							int i_1373_ = is_1371_[i_1372_];
							if (aShortArray9063 == null || (i_1304_ & aShortArray9063[i_1373_]) != 0) {
								anIntArray9059[i_1373_] -= anInt9073;
								anIntArray9060[i_1373_] -= anInt9052;
								anIntArray9061[i_1373_] -= anInt9117;
								if (i_1303_ != 0) {
									int i_1374_ = Class447.anIntArray4906[i_1303_];
									int i_1375_ = Class447.anIntArray4921[i_1303_];
									int i_1376_ = ((anIntArray9060[i_1373_] * i_1374_ + anIntArray9059[i_1373_] * i_1375_ + 16383) >> 14);
									anIntArray9060[i_1373_] = (anIntArray9060[i_1373_] * i_1375_ - anIntArray9059[i_1373_] * i_1374_ + 16383) >> 14;
									anIntArray9059[i_1373_] = i_1376_;
								}
								if (i_1301_ != 0) {
									int i_1377_ = Class447.anIntArray4906[i_1301_];
									int i_1378_ = Class447.anIntArray4921[i_1301_];
									int i_1379_ = ((anIntArray9060[i_1373_] * i_1378_ - anIntArray9061[i_1373_] * i_1377_ + 16383) >> 14);
									anIntArray9061[i_1373_] = (anIntArray9060[i_1373_] * i_1377_ + anIntArray9061[i_1373_] * i_1378_ + 16383) >> 14;
									anIntArray9060[i_1373_] = i_1379_;
								}
								if (i_1302_ != 0) {
									int i_1380_ = Class447.anIntArray4906[i_1302_];
									int i_1381_ = Class447.anIntArray4921[i_1302_];
									int i_1382_ = ((anIntArray9061[i_1373_] * i_1380_ + anIntArray9059[i_1373_] * i_1381_ + 16383) >> 14);
									anIntArray9061[i_1373_] = (anIntArray9061[i_1373_] * i_1381_ - anIntArray9059[i_1373_] * i_1380_ + 16383) >> 14;
									anIntArray9059[i_1373_] = i_1382_;
								}
								anIntArray9059[i_1373_] += anInt9073;
								anIntArray9060[i_1373_] += anInt9052;
								anIntArray9061[i_1373_] += anInt9117;
							}
						}
					}
				}
				if (bool) {
					for (int i_1383_ = 0; i_1383_ < i_1306_; i_1383_++) {
						int i_1384_ = is[i_1383_];
						if (i_1384_ < anIntArrayArray9109.length) {
							int[] is_1385_ = anIntArrayArray9109[i_1384_];
							for (int i_1386_ = 0; i_1386_ < is_1385_.length; i_1386_++) {
								int i_1387_ = is_1385_[i_1386_];
								if (aShortArray9063 == null || ((i_1304_ & aShortArray9063[i_1387_]) != 0)) {
									int i_1388_ = anIntArray9068[i_1387_];
									int i_1389_ = anIntArray9068[i_1387_ + 1];
									for (int i_1390_ = i_1388_; (i_1390_ < i_1389_ && aShortArray9103[i_1390_] != 0); i_1390_++) {
										int i_1391_ = (aShortArray9103[i_1390_] & 0xffff) - 1;
										if (i_1303_ != 0) {
											int i_1392_ = (Class447.anIntArray4906[i_1303_]);
											int i_1393_ = (Class447.anIntArray4921[i_1303_]);
											int i_1394_ = (((aShortArray9066[i_1391_] * i_1392_) + (aShortArray9108[i_1391_] * i_1393_) + 16383) >> 14);
											aShortArray9066[i_1391_] = (short) ((((aShortArray9066[i_1391_]) * i_1393_) - ((aShortArray9108[i_1391_]) * i_1392_) + 16383) >> 14);
											aShortArray9108[i_1391_] = (short) i_1394_;
										}
										if (i_1301_ != 0) {
											int i_1395_ = (Class447.anIntArray4906[i_1301_]);
											int i_1396_ = (Class447.anIntArray4921[i_1301_]);
											int i_1397_ = (((aShortArray9066[i_1391_] * i_1396_) - (aShortArray9071[i_1391_] * i_1395_) + 16383) >> 14);
											aShortArray9071[i_1391_] = (short) ((((aShortArray9066[i_1391_]) * i_1395_) + ((aShortArray9071[i_1391_]) * i_1396_) + 16383) >> 14);
											aShortArray9066[i_1391_] = (short) i_1397_;
										}
										if (i_1302_ != 0) {
											int i_1398_ = (Class447.anIntArray4906[i_1302_]);
											int i_1399_ = (Class447.anIntArray4921[i_1302_]);
											int i_1400_ = (((aShortArray9071[i_1391_] * i_1398_) + (aShortArray9108[i_1391_] * i_1399_) + 16383) >> 14);
											aShortArray9071[i_1391_] = (short) ((((aShortArray9071[i_1391_]) * i_1399_) - ((aShortArray9108[i_1391_]) * i_1398_) + 16383) >> 14);
											aShortArray9108[i_1391_] = (short) i_1400_;
										}
									}
								}
							}
						}
					}
					if (aClass130_9106 == null && aClass130_9065 != null)
						aClass130_9065.anInterface15_1587 = null;
					if (aClass130_9106 != null)
						aClass130_9106.anInterface15_1587 = null;
				}
			}
		} else if (i == 3) {
			if (is_1305_ != null) {
				int i_1401_ = is_1305_[9] << 4;
				int i_1402_ = is_1305_[10] << 4;
				int i_1403_ = is_1305_[11] << 4;
				int i_1404_ = is_1305_[12] << 4;
				int i_1405_ = is_1305_[13] << 4;
				int i_1406_ = is_1305_[14] << 4;
				if (aBool9105) {
					int i_1407_ = ((is_1305_[0] * anInt9073 + is_1305_[3] * anInt9052 + is_1305_[6] * anInt9117 + 8192) >> 14);
					int i_1408_ = ((is_1305_[1] * anInt9073 + is_1305_[4] * anInt9052 + is_1305_[7] * anInt9117 + 8192) >> 14);
					int i_1409_ = ((is_1305_[2] * anInt9073 + is_1305_[5] * anInt9052 + is_1305_[8] * anInt9117 + 8192) >> 14);
					i_1407_ += i_1404_;
					i_1408_ += i_1405_;
					i_1409_ += i_1406_;
					anInt9073 = i_1407_;
					anInt9052 = i_1408_;
					anInt9117 = i_1409_;
					aBool9105 = false;
				}
				int i_1410_ = i_1301_ << 15 >> 7;
				int i_1411_ = i_1302_ << 15 >> 7;
				int i_1412_ = i_1303_ << 15 >> 7;
				int i_1413_ = i_1410_ * -anInt9073 + 8192 >> 14;
				int i_1414_ = i_1411_ * -anInt9052 + 8192 >> 14;
				int i_1415_ = i_1412_ * -anInt9117 + 8192 >> 14;
				int i_1416_ = i_1413_ + anInt9073;
				int i_1417_ = i_1414_ + anInt9052;
				int i_1418_ = i_1415_ + anInt9117;
				int[] is_1419_ = new int[9];
				is_1419_[0] = i_1410_ * is_1305_[0] + 8192 >> 14;
				is_1419_[1] = i_1410_ * is_1305_[3] + 8192 >> 14;
				is_1419_[2] = i_1410_ * is_1305_[6] + 8192 >> 14;
				is_1419_[3] = i_1411_ * is_1305_[1] + 8192 >> 14;
				is_1419_[4] = i_1411_ * is_1305_[4] + 8192 >> 14;
				is_1419_[5] = i_1411_ * is_1305_[7] + 8192 >> 14;
				is_1419_[6] = i_1412_ * is_1305_[2] + 8192 >> 14;
				is_1419_[7] = i_1412_ * is_1305_[5] + 8192 >> 14;
				is_1419_[8] = i_1412_ * is_1305_[8] + 8192 >> 14;
				int i_1420_ = i_1410_ * i_1404_ + 8192 >> 14;
				int i_1421_ = i_1411_ * i_1405_ + 8192 >> 14;
				int i_1422_ = i_1412_ * i_1406_ + 8192 >> 14;
				i_1420_ += i_1416_;
				i_1421_ += i_1417_;
				i_1422_ += i_1418_;
				int[] is_1423_ = new int[9];
				for (int i_1424_ = 0; i_1424_ < 3; i_1424_++) {
					for (int i_1425_ = 0; i_1425_ < 3; i_1425_++) {
						int i_1426_ = 0;
						for (int i_1427_ = 0; i_1427_ < 3; i_1427_++)
							i_1426_ += (is_1305_[i_1424_ * 3 + i_1427_] * is_1419_[i_1425_ + i_1427_ * 3]);
						is_1423_[i_1424_ * 3 + i_1425_] = i_1426_ + 8192 >> 14;
					}
				}
				int i_1428_ = ((is_1305_[0] * i_1420_ + is_1305_[1] * i_1421_ + is_1305_[2] * i_1422_ + 8192) >> 14);
				int i_1429_ = ((is_1305_[3] * i_1420_ + is_1305_[4] * i_1421_ + is_1305_[5] * i_1422_ + 8192) >> 14);
				int i_1430_ = ((is_1305_[6] * i_1420_ + is_1305_[7] * i_1421_ + is_1305_[8] * i_1422_ + 8192) >> 14);
				i_1428_ += i_1401_;
				i_1429_ += i_1402_;
				i_1430_ += i_1403_;
				for (int i_1431_ = 0; i_1431_ < i_1306_; i_1431_++) {
					int i_1432_ = is[i_1431_];
					if (i_1432_ < anIntArrayArray9109.length) {
						int[] is_1433_ = anIntArrayArray9109[i_1432_];
						for (int i_1434_ = 0; i_1434_ < is_1433_.length; i_1434_++) {
							int i_1435_ = is_1433_[i_1434_];
							if (aShortArray9063 == null || (i_1304_ & aShortArray9063[i_1435_]) != 0) {
								int i_1436_ = ((is_1423_[0] * anIntArray9059[i_1435_] + is_1423_[1] * anIntArray9060[i_1435_] + is_1423_[2] * anIntArray9061[i_1435_] + 8192) >> 14);
								int i_1437_ = ((is_1423_[3] * anIntArray9059[i_1435_] + is_1423_[4] * anIntArray9060[i_1435_] + is_1423_[5] * anIntArray9061[i_1435_] + 8192) >> 14);
								int i_1438_ = ((is_1423_[6] * anIntArray9059[i_1435_] + is_1423_[7] * anIntArray9060[i_1435_] + is_1423_[8] * anIntArray9061[i_1435_] + 8192) >> 14);
								i_1436_ += i_1428_;
								i_1437_ += i_1429_;
								i_1438_ += i_1430_;
								anIntArray9059[i_1435_] = i_1436_;
								anIntArray9060[i_1435_] = i_1437_;
								anIntArray9061[i_1435_] = i_1438_;
							}
						}
					}
				}
			} else {
				for (int i_1439_ = 0; i_1439_ < i_1306_; i_1439_++) {
					int i_1440_ = is[i_1439_];
					if (i_1440_ < anIntArrayArray9109.length) {
						int[] is_1441_ = anIntArrayArray9109[i_1440_];
						for (int i_1442_ = 0; i_1442_ < is_1441_.length; i_1442_++) {
							int i_1443_ = is_1441_[i_1442_];
							if (aShortArray9063 == null || (i_1304_ & aShortArray9063[i_1443_]) != 0) {
								anIntArray9059[i_1443_] -= anInt9073;
								anIntArray9060[i_1443_] -= anInt9052;
								anIntArray9061[i_1443_] -= anInt9117;
								anIntArray9059[i_1443_] = anIntArray9059[i_1443_] * i_1301_ >> 7;
								anIntArray9060[i_1443_] = anIntArray9060[i_1443_] * i_1302_ >> 7;
								anIntArray9061[i_1443_] = anIntArray9061[i_1443_] * i_1303_ >> 7;
								anIntArray9059[i_1443_] += anInt9073;
								anIntArray9060[i_1443_] += anInt9052;
								anIntArray9061[i_1443_] += anInt9117;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9080 != null) {
				for (int i_1444_ = 0; i_1444_ < i_1306_; i_1444_++) {
					int i_1445_ = is[i_1444_];
					if (i_1445_ < anIntArrayArray9080.length) {
						int[] is_1446_ = anIntArrayArray9080[i_1445_];
						for (int i_1447_ = 0; i_1447_ < is_1446_.length; i_1447_++) {
							int i_1448_ = is_1446_[i_1447_];
							if (aShortArray9081 == null || (i_1304_ & aShortArray9081[i_1448_]) != 0) {
								int i_1449_ = ((aByteArray9075[i_1448_] & 0xff) + i_1301_ * 8);
								if (i_1449_ < 0)
									i_1449_ = 0;
								else if (i_1449_ > 255)
									i_1449_ = 255;
								aByteArray9075[i_1448_] = (byte) i_1449_;
								if (aClass130_9065 != null)
									aClass130_9065.anInterface15_1587 = null;
							}
						}
					}
				}
				if (aClass142Array9107 != null) {
					for (int i_1450_ = 0; i_1450_ < anInt9116; i_1450_++) {
						Class142 class142 = aClass142Array9107[i_1450_];
						Class132 class132 = aClass132Array9102[i_1450_];
						class132.anInt1603 = (class132.anInt1603 & 0xffffff | 255 - (aByteArray9075[class142.anInt1663] & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9080 != null) {
				for (int i_1451_ = 0; i_1451_ < i_1306_; i_1451_++) {
					int i_1452_ = is[i_1451_];
					if (i_1452_ < anIntArrayArray9080.length) {
						int[] is_1453_ = anIntArrayArray9080[i_1452_];
						for (int i_1454_ = 0; i_1454_ < is_1453_.length; i_1454_++) {
							int i_1455_ = is_1453_[i_1454_];
							if (aShortArray9081 == null || (i_1304_ & aShortArray9081[i_1455_]) != 0) {
								int i_1456_ = aShortArray9074[i_1455_] & 0xffff;
								int i_1457_ = i_1456_ >> 10 & 0x3f;
								int i_1458_ = i_1456_ >> 7 & 0x7;
								int i_1459_ = i_1456_ & 0x7f;
								i_1457_ = i_1457_ + i_1301_ & 0x3f;
								i_1458_ += i_1302_ / 4;
								if (i_1458_ < 0)
									i_1458_ = 0;
								else if (i_1458_ > 7)
									i_1458_ = 7;
								i_1459_ += i_1303_;
								if (i_1459_ < 0)
									i_1459_ = 0;
								else if (i_1459_ > 127)
									i_1459_ = 127;
								aShortArray9074[i_1455_] = (short) (i_1457_ << 10 | i_1458_ << 7 | i_1459_);
								if (aClass130_9065 != null)
									aClass130_9065.anInterface15_1587 = null;
							}
						}
					}
				}
				if (aClass142Array9107 != null) {
					for (int i_1460_ = 0; i_1460_ < anInt9116; i_1460_++) {
						Class142 class142 = aClass142Array9107[i_1460_];
						Class132 class132 = aClass132Array9102[i_1460_];
						class132.anInt1603 = (class132.anInt1603 & ~0xffffff | (Class639.anIntArray8309[(aShortArray9074[class142.anInt1663] & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9112 != null) {
				for (int i_1461_ = 0; i_1461_ < i_1306_; i_1461_++) {
					int i_1462_ = is[i_1461_];
					if (i_1462_ < anIntArrayArray9112.length) {
						int[] is_1463_ = anIntArrayArray9112[i_1462_];
						for (int i_1464_ = 0; i_1464_ < is_1463_.length; i_1464_++) {
							Class132 class132 = aClass132Array9102[is_1463_[i_1464_]];
							class132.anInt1606 += i_1301_;
							class132.anInt1607 += i_1302_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9112 != null) {
				for (int i_1465_ = 0; i_1465_ < i_1306_; i_1465_++) {
					int i_1466_ = is[i_1465_];
					if (i_1466_ < anIntArrayArray9112.length) {
						int[] is_1467_ = anIntArrayArray9112[i_1466_];
						for (int i_1468_ = 0; i_1468_ < is_1467_.length; i_1468_++) {
							Class132 class132 = aClass132Array9102[is_1467_[i_1468_]];
							class132.anInt1608 = class132.anInt1608 * i_1301_ >> 7;
							class132.anInt1604 = class132.anInt1604 * i_1302_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9112 != null) {
				for (int i_1469_ = 0; i_1469_ < i_1306_; i_1469_++) {
					int i_1470_ = is[i_1469_];
					if (i_1470_ < anIntArrayArray9112.length) {
						int[] is_1471_ = anIntArrayArray9112[i_1470_];
						for (int i_1472_ = 0; i_1472_ < is_1471_.length; i_1472_++) {
							Class132 class132 = aClass132Array9102[is_1471_[i_1472_]];
							class132.anInt1605 = class132.anInt1605 + i_1301_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public int method2497() {
		if (!aBool9092)
			method8488();
		return aShort9094;
	}

	public void method2550(Class433 class433, Class178 class178, int i) {
		if ((i & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);
		if (anInt9077 != 0) {
			Class443 class443 = aClass167_Sub2_9049.aClass443_9209;
			Class443 class443_1473_ = aClass167_Sub2_9049.aClass443_9223;
			Class443 class443_1474_ = aClass167_Sub2_9049.aClass443_9224;
			class443_1473_.method5359(class433);
			class443_1474_.method5339(class443_1473_);
			class443_1474_.method5390(aClass167_Sub2_9049.aClass443_9211);
			if (!aBool9092)
				method8488();
			float[] fs = aClass167_Sub2_9049.aFloatArray9231;
			class443_1473_.method5346(0.0F, (float) aShort9093, 0.0F, fs);
			float f = fs[0];
			float f_1475_ = fs[1];
			float f_1476_ = fs[2];
			class443_1473_.method5346(0.0F, (float) aShort9094, 0.0F, fs);
			float f_1477_ = fs[0];
			float f_1478_ = fs[1];
			float f_1479_ = fs[2];
			for (int i_1480_ = 0; i_1480_ < 6; i_1480_++) {
				float[] fs_1481_ = aClass167_Sub2_9049.aFloatArrayArray9212[i_1480_];
				float f_1482_ = (fs_1481_[0] * f + fs_1481_[1] * f_1475_ + fs_1481_[2] * f_1476_ + fs_1481_[3] + (float) anInt9067);
				float f_1483_ = (fs_1481_[0] * f_1477_ + fs_1481_[1] * f_1478_ + fs_1481_[2] * f_1479_ + fs_1481_[3] + (float) anInt9067);
				if (f_1482_ < 0.0F && f_1483_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_1484_ = true;
				int i_1485_ = aShort9095 + aShort9096 >> 1;
				int i_1486_ = aShort9097 + aShort9098 >> 1;
				int i_1487_ = i_1485_;
				short i_1488_ = aShort9093;
				int i_1489_ = i_1486_;
				float f_1490_ = (class443_1474_.aFloatArray4878[0] * (float) i_1487_ + class443_1474_.aFloatArray4878[4] * (float) i_1488_ + class443_1474_.aFloatArray4878[8] * (float) i_1489_ + class443_1474_.aFloatArray4878[12]);
				float f_1491_ = (class443_1474_.aFloatArray4878[1] * (float) i_1487_ + class443_1474_.aFloatArray4878[5] * (float) i_1488_ + class443_1474_.aFloatArray4878[9] * (float) i_1489_ + class443_1474_.aFloatArray4878[13]);
				float f_1492_ = (class443_1474_.aFloatArray4878[2] * (float) i_1487_ + class443_1474_.aFloatArray4878[6] * (float) i_1488_ + class443_1474_.aFloatArray4878[10] * (float) i_1489_ + class443_1474_.aFloatArray4878[14]);
				float f_1493_ = (class443_1474_.aFloatArray4878[3] * (float) i_1487_ + class443_1474_.aFloatArray4878[7] * (float) i_1488_ + class443_1474_.aFloatArray4878[11] * (float) i_1489_ + class443_1474_.aFloatArray4878[15]);
				if (f_1492_ >= -f_1493_) {
					class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1490_ / f_1493_));
					class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1491_ / f_1493_));
				} else
					bool = true;
				i_1487_ = i_1485_;
				i_1488_ = aShort9094;
				i_1489_ = i_1486_;
				float f_1494_ = (class443_1474_.aFloatArray4878[0] * (float) i_1487_ + class443_1474_.aFloatArray4878[4] * (float) i_1488_ + class443_1474_.aFloatArray4878[8] * (float) i_1489_ + class443_1474_.aFloatArray4878[12]);
				float f_1495_ = (class443_1474_.aFloatArray4878[1] * (float) i_1487_ + class443_1474_.aFloatArray4878[5] * (float) i_1488_ + class443_1474_.aFloatArray4878[9] * (float) i_1489_ + class443_1474_.aFloatArray4878[13]);
				float f_1496_ = (class443_1474_.aFloatArray4878[2] * (float) i_1487_ + class443_1474_.aFloatArray4878[6] * (float) i_1488_ + class443_1474_.aFloatArray4878[10] * (float) i_1489_ + class443_1474_.aFloatArray4878[14]);
				float f_1497_ = (class443_1474_.aFloatArray4878[3] * (float) i_1487_ + class443_1474_.aFloatArray4878[7] * (float) i_1488_ + class443_1474_.aFloatArray4878[11] * (float) i_1489_ + class443_1474_.aFloatArray4878[15]);
				if (f_1496_ >= -f_1497_) {
					class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1494_ / f_1497_));
					class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1495_ / f_1497_));
				} else
					bool = true;
				if (bool) {
					if (f_1492_ < -f_1493_ && f_1496_ < -f_1497_)
						bool_1484_ = false;
					else if (f_1492_ < -f_1493_) {
						float f_1498_ = (f_1492_ + f_1493_) / (f_1496_ + f_1497_) - 1.0F;
						float f_1499_ = f_1490_ + f_1498_ * (f_1494_ - f_1490_);
						float f_1500_ = f_1491_ + f_1498_ * (f_1495_ - f_1491_);
						float f_1501_ = f_1493_ + f_1498_ * (f_1497_ - f_1493_);
						class178.anInt1941 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1499_ / f_1501_));
						class178.anInt1942 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1500_ / f_1501_));
					} else if (f_1496_ < -f_1497_) {
						float f_1502_ = (f_1496_ + f_1497_) / (f_1492_ + f_1493_) - 1.0F;
						float f_1503_ = f_1494_ + f_1502_ * (f_1490_ - f_1494_);
						float f_1504_ = f_1495_ + f_1502_ * (f_1491_ - f_1495_);
						float f_1505_ = f_1497_ + f_1502_ * (f_1493_ - f_1497_);
						class178.anInt1943 = (int) (aClass167_Sub2_9049.aFloat9214 + (aClass167_Sub2_9049.aFloat9215 * f_1503_ / f_1505_));
						class178.anInt1944 = (int) (aClass167_Sub2_9049.aFloat9216 + (aClass167_Sub2_9049.aFloat9217 * f_1504_ / f_1505_));
					}
				}
				if (bool_1484_) {
					if (f_1492_ / f_1493_ > f_1496_ / f_1497_) {
						float f_1506_ = (f_1490_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_1507_ = (f_1493_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1941 + (aClass167_Sub2_9049.aFloat9215 * f_1506_ / f_1507_));
					} else {
						float f_1508_ = (f_1494_ + (class443.aFloatArray4878[0] * (float) anInt9067) + class443.aFloatArray4878[12]);
						float f_1509_ = (f_1497_ + (class443.aFloatArray4878[3] * (float) anInt9067) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub2_9049.aFloat9214 - (float) class178.anInt1943 + (aClass167_Sub2_9049.aFloat9215 * f_1508_ / f_1509_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub2_9049.method8552();
			aClass167_Sub2_9049.method8527(class443_1473_);
			method8493();
			aClass167_Sub2_9049.method8529();
			class443_1473_.method5390(aClass167_Sub2_9049.aClass443_9280);
			method8494(class443_1473_);
			if ((i & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}
	}

	public byte[] method2462() {
		return aByteArray9075;
	}

	public byte[] method2613() {
		return aByteArray9075;
	}

	void method8499() {
		if (anInt9072 != 0) {
			if (aByte9085 != 0)
				method8496(true);
			method8496(false);
			if (aClass121_9046 != null) {
				if (aClass121_9046.anInterface17_1481 == null)
					method8490((aByte9085 & 0x10) != 0);
				if (aClass121_9046.anInterface17_1481 != null) {
					aClass167_Sub2_9049.method8611(aClass130_9106 != null);
					aClass167_Sub2_9049.method8547(aClass130_9082, aClass130_9106, aClass130_9065, aClass130_9086);
					int i = anIntArray9101.length - 1;
					for (int i_1510_ = 0; i_1510_ < i; i_1510_++) {
						int i_1511_ = anIntArray9101[i_1510_];
						int i_1512_ = anIntArray9101[i_1510_ + 1];
						int i_1513_ = (aShortArray9079[i_1511_] == -1 ? -1 : aShortArray9079[i_1511_] & 0xffff);
						aClass167_Sub2_9049.method8554(i_1513_, aClass130_9106 != null);
						aClass167_Sub2_9049.method8511((aClass121_9046.anInterface17_1481), 4, i_1511_ * 3, ((i_1512_ - i_1511_) * 3));
					}
				}
			}
			method8487();
		}
	}

	void method8500() {
		if (anInt9072 != 0) {
			if (aByte9085 != 0)
				method8496(true);
			method8496(false);
			if (aClass121_9046 != null) {
				if (aClass121_9046.anInterface17_1481 == null)
					method8490((aByte9085 & 0x10) != 0);
				if (aClass121_9046.anInterface17_1481 != null) {
					aClass167_Sub2_9049.method8611(aClass130_9106 != null);
					aClass167_Sub2_9049.method8547(aClass130_9082, aClass130_9106, aClass130_9065, aClass130_9086);
					int i = anIntArray9101.length - 1;
					for (int i_1514_ = 0; i_1514_ < i; i_1514_++) {
						int i_1515_ = anIntArray9101[i_1514_];
						int i_1516_ = anIntArray9101[i_1514_ + 1];
						int i_1517_ = (aShortArray9079[i_1515_] == -1 ? -1 : aShortArray9079[i_1515_] & 0xffff);
						aClass167_Sub2_9049.method8554(i_1517_, aClass130_9106 != null);
						aClass167_Sub2_9049.method8511((aClass121_9046.anInterface17_1481), 4, i_1515_ * 3, ((i_1516_ - i_1515_) * 3));
					}
				}
			}
			method8487();
		}
	}

	void method8501() {
		if (anInt9072 != 0) {
			if (aByte9085 != 0)
				method8496(true);
			method8496(false);
			if (aClass121_9046 != null) {
				if (aClass121_9046.anInterface17_1481 == null)
					method8490((aByte9085 & 0x10) != 0);
				if (aClass121_9046.anInterface17_1481 != null) {
					aClass167_Sub2_9049.method8611(aClass130_9106 != null);
					aClass167_Sub2_9049.method8547(aClass130_9082, aClass130_9106, aClass130_9065, aClass130_9086);
					int i = anIntArray9101.length - 1;
					for (int i_1518_ = 0; i_1518_ < i; i_1518_++) {
						int i_1519_ = anIntArray9101[i_1518_];
						int i_1520_ = anIntArray9101[i_1518_ + 1];
						int i_1521_ = (aShortArray9079[i_1519_] == -1 ? -1 : aShortArray9079[i_1519_] & 0xffff);
						aClass167_Sub2_9049.method8554(i_1521_, aClass130_9106 != null);
						aClass167_Sub2_9049.method8511((aClass121_9046.anInterface17_1481), 4, i_1519_ * 3, ((i_1520_ - i_1519_) * 3));
					}
				}
			}
			method8487();
		}
	}

	void method8502() {
		if (anInt9072 != 0) {
			if (aByte9085 != 0)
				method8496(true);
			method8496(false);
			if (aClass121_9046 != null) {
				if (aClass121_9046.anInterface17_1481 == null)
					method8490((aByte9085 & 0x10) != 0);
				if (aClass121_9046.anInterface17_1481 != null) {
					aClass167_Sub2_9049.method8611(aClass130_9106 != null);
					aClass167_Sub2_9049.method8547(aClass130_9082, aClass130_9106, aClass130_9065, aClass130_9086);
					int i = anIntArray9101.length - 1;
					for (int i_1522_ = 0; i_1522_ < i; i_1522_++) {
						int i_1523_ = anIntArray9101[i_1522_];
						int i_1524_ = anIntArray9101[i_1522_ + 1];
						int i_1525_ = (aShortArray9079[i_1523_] == -1 ? -1 : aShortArray9079[i_1523_] & 0xffff);
						aClass167_Sub2_9049.method8554(i_1525_, aClass130_9106 != null);
						aClass167_Sub2_9049.method8511((aClass121_9046.anInterface17_1481), 4, i_1523_ * 3, ((i_1524_ - i_1523_) * 3));
					}
				}
			}
			method8487();
		}
	}

	void method2487(int i, int i_1526_, int i_1527_, int i_1528_) {
		if (i == 0) {
			int i_1529_ = 0;
			anInt9073 = 0;
			anInt9052 = 0;
			anInt9117 = 0;
			for (int i_1530_ = 0; i_1530_ < anInt9058; i_1530_++) {
				anInt9073 += anIntArray9059[i_1530_];
				anInt9052 += anIntArray9060[i_1530_];
				anInt9117 += anIntArray9061[i_1530_];
				i_1529_++;
			}
			if (i_1529_ > 0) {
				anInt9073 = anInt9073 / i_1529_ + i_1526_;
				anInt9052 = anInt9052 / i_1529_ + i_1527_;
				anInt9117 = anInt9117 / i_1529_ + i_1528_;
			} else {
				anInt9073 = i_1526_;
				anInt9052 = i_1527_;
				anInt9117 = i_1528_;
			}
		} else if (i == 1) {
			for (int i_1531_ = 0; i_1531_ < anInt9058; i_1531_++) {
				anIntArray9059[i_1531_] += i_1526_;
				anIntArray9060[i_1531_] += i_1527_;
				anIntArray9061[i_1531_] += i_1528_;
			}
		} else if (i == 2) {
			for (int i_1532_ = 0; i_1532_ < anInt9058; i_1532_++) {
				anIntArray9059[i_1532_] -= anInt9073;
				anIntArray9060[i_1532_] -= anInt9052;
				anIntArray9061[i_1532_] -= anInt9117;
				if (i_1528_ != 0) {
					int i_1533_ = Class447.anIntArray4906[i_1528_];
					int i_1534_ = Class447.anIntArray4921[i_1528_];
					int i_1535_ = ((anIntArray9060[i_1532_] * i_1533_ + anIntArray9059[i_1532_] * i_1534_ + 16383) >> 14);
					anIntArray9060[i_1532_] = (anIntArray9060[i_1532_] * i_1534_ - anIntArray9059[i_1532_] * i_1533_ + 16383) >> 14;
					anIntArray9059[i_1532_] = i_1535_;
				}
				if (i_1526_ != 0) {
					int i_1536_ = Class447.anIntArray4906[i_1526_];
					int i_1537_ = Class447.anIntArray4921[i_1526_];
					int i_1538_ = ((anIntArray9060[i_1532_] * i_1537_ - anIntArray9061[i_1532_] * i_1536_ + 16383) >> 14);
					anIntArray9061[i_1532_] = (anIntArray9060[i_1532_] * i_1536_ + anIntArray9061[i_1532_] * i_1537_ + 16383) >> 14;
					anIntArray9060[i_1532_] = i_1538_;
				}
				if (i_1527_ != 0) {
					int i_1539_ = Class447.anIntArray4906[i_1527_];
					int i_1540_ = Class447.anIntArray4921[i_1527_];
					int i_1541_ = ((anIntArray9061[i_1532_] * i_1539_ + anIntArray9059[i_1532_] * i_1540_ + 16383) >> 14);
					anIntArray9061[i_1532_] = (anIntArray9061[i_1532_] * i_1540_ - anIntArray9059[i_1532_] * i_1539_ + 16383) >> 14;
					anIntArray9059[i_1532_] = i_1541_;
				}
				anIntArray9059[i_1532_] += anInt9073;
				anIntArray9060[i_1532_] += anInt9052;
				anIntArray9061[i_1532_] += anInt9117;
			}
		} else if (i == 3) {
			for (int i_1542_ = 0; i_1542_ < anInt9058; i_1542_++) {
				anIntArray9059[i_1542_] -= anInt9073;
				anIntArray9060[i_1542_] -= anInt9052;
				anIntArray9061[i_1542_] -= anInt9117;
				anIntArray9059[i_1542_] = anIntArray9059[i_1542_] * i_1526_ / 128;
				anIntArray9060[i_1542_] = anIntArray9060[i_1542_] * i_1527_ / 128;
				anIntArray9061[i_1542_] = anIntArray9061[i_1542_] * i_1528_ / 128;
				anIntArray9059[i_1542_] += anInt9073;
				anIntArray9060[i_1542_] += anInt9052;
				anIntArray9061[i_1542_] += anInt9117;
			}
		} else if (i == 5) {
			for (int i_1543_ = 0; i_1543_ < anInt9118; i_1543_++) {
				int i_1544_ = (aByteArray9075[i_1543_] & 0xff) + i_1526_ * 8;
				if (i_1544_ < 0)
					i_1544_ = 0;
				else if (i_1544_ > 255)
					i_1544_ = 255;
				aByteArray9075[i_1543_] = (byte) i_1544_;
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
			if (aClass142Array9107 != null) {
				for (int i_1545_ = 0; i_1545_ < anInt9116; i_1545_++) {
					Class142 class142 = aClass142Array9107[i_1545_];
					Class132 class132 = aClass132Array9102[i_1545_];
					class132.anInt1603 = (class132.anInt1603 & 0xffffff | (255 - (aByteArray9075[class142.anInt1663] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_1546_ = 0; i_1546_ < anInt9118; i_1546_++) {
				int i_1547_ = aShortArray9074[i_1546_] & 0xffff;
				int i_1548_ = i_1547_ >> 10 & 0x3f;
				int i_1549_ = i_1547_ >> 7 & 0x7;
				int i_1550_ = i_1547_ & 0x7f;
				i_1548_ = i_1548_ + i_1526_ & 0x3f;
				i_1549_ += i_1527_ / 4;
				if (i_1549_ < 0)
					i_1549_ = 0;
				else if (i_1549_ > 7)
					i_1549_ = 7;
				i_1550_ += i_1528_;
				if (i_1550_ < 0)
					i_1550_ = 0;
				else if (i_1550_ > 127)
					i_1550_ = 127;
				aShortArray9074[i_1546_] = (short) (i_1548_ << 10 | i_1549_ << 7 | i_1550_);
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
			if (aClass142Array9107 != null) {
				for (int i_1551_ = 0; i_1551_ < anInt9116; i_1551_++) {
					Class142 class142 = aClass142Array9107[i_1551_];
					Class132 class132 = aClass132Array9102[i_1551_];
					class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_1552_ = 0; i_1552_ < anInt9116; i_1552_++) {
				Class132 class132 = aClass132Array9102[i_1552_];
				class132.anInt1606 += i_1526_;
				class132.anInt1607 += i_1527_;
			}
		} else if (i == 10) {
			for (int i_1553_ = 0; i_1553_ < anInt9116; i_1553_++) {
				Class132 class132 = aClass132Array9102[i_1553_];
				class132.anInt1608 = class132.anInt1608 * i_1526_ >> 7;
				class132.anInt1604 = class132.anInt1604 * i_1527_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1554_ = 0; i_1554_ < anInt9116; i_1554_++) {
				Class132 class132 = aClass132Array9102[i_1554_];
				class132.anInt1605 = class132.anInt1605 + i_1526_ & 0x3fff;
			}
		}
	}

	public void method2614(int i) {
		int i_1555_ = Class447.anIntArray4906[i];
		int i_1556_ = Class447.anIntArray4921[i];
		for (int i_1557_ = 0; i_1557_ < anInt9058; i_1557_++) {
			int i_1558_ = ((anIntArray9061[i_1557_] * i_1555_ + anIntArray9059[i_1557_] * i_1556_) >> 14);
			anIntArray9061[i_1557_] = (anIntArray9061[i_1557_] * i_1556_ - anIntArray9059[i_1557_] * i_1555_) >> 14;
			anIntArray9059[i_1557_] = i_1558_;
		}
		if (aClass130_9082 != null)
			aClass130_9082.anInterface15_1587 = null;
		aBool9092 = false;
	}

	void method8503() {
		if (aBool9089) {
			aBool9089 = false;
			if (aClass172Array9104 == null && aClass156Array9064 == null && aClass142Array9107 == null && !Class118.method1512(anInt9050, anInt9051)) {
				boolean bool = false;
				boolean bool_1559_ = false;
				boolean bool_1560_ = false;
				if (anIntArray9059 != null && !Class118.method1531(anInt9050, anInt9051)) {
					if (aClass130_9082 == null || aClass130_9082.anInterface15_1587 != null) {
						if (!aBool9092)
							method8488();
						bool = true;
					} else
						aBool9089 = true;
				}
				if (anIntArray9060 != null && !Class118.method1532(anInt9050, anInt9051)) {
					if (aClass130_9082 == null || aClass130_9082.anInterface15_1587 != null) {
						if (!aBool9092)
							method8488();
						bool_1559_ = true;
					} else
						aBool9089 = true;
				}
				if (anIntArray9061 != null && !Class118.method1533(anInt9050, anInt9051)) {
					if (aClass130_9082 == null || aClass130_9082.anInterface15_1587 != null) {
						if (!aBool9092)
							method8488();
						bool_1560_ = true;
					} else
						aBool9089 = true;
				}
				if (bool)
					anIntArray9059 = null;
				if (bool_1559_)
					anIntArray9060 = null;
				if (bool_1560_)
					anIntArray9061 = null;
			}
			if (aShortArray9103 != null && anIntArray9059 == null && anIntArray9060 == null && anIntArray9061 == null) {
				aShortArray9103 = null;
				anIntArray9068 = null;
			}
			if (aByteArray9100 != null && !Class118.method1534(anInt9050, anInt9051)) {
				if (aClass130_9106 != null) {
					if (aClass130_9106.anInterface15_1587 != null) {
						aShortArray9071 = null;
						aShortArray9066 = null;
						aShortArray9108 = null;
						aByteArray9100 = null;
					} else
						aBool9089 = true;
				} else if (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null) {
					aShortArray9071 = null;
					aShortArray9066 = null;
					aShortArray9108 = null;
					aByteArray9100 = null;
				} else
					aBool9089 = true;
			}
			if (aShortArray9074 != null && !Class118.method1548(anInt9050, anInt9051)) {
				if (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null)
					aShortArray9074 = null;
				else
					aBool9089 = true;
			}
			if (aByteArray9075 != null && !Class118.method1536(anInt9050, anInt9051)) {
				if (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null)
					aByteArray9075 = null;
				else
					aBool9089 = true;
			}
			if (aFloatArray9070 != null && !Class118.method1597(anInt9050, anInt9051)) {
				if (aClass130_9086 == null || aClass130_9086.anInterface15_1587 != null) {
					aFloatArray9062 = null;
					aFloatArray9070 = null;
				} else
					aBool9089 = true;
			}
			if (aShortArray9079 != null && !Class118.method1542(anInt9050, anInt9051)) {
				if (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null)
					aShortArray9079 = null;
				else
					aBool9089 = true;
			}
			if (aShortArray9076 != null && !Class118.method1587(anInt9050, anInt9051)) {
				if ((aClass121_9046 == null || aClass121_9046.anInterface17_1481 != null) && (aClass130_9065 == null || aClass130_9065.anInterface15_1587 != null)) {
					aShortArray9091 = null;
					aShortArray9055 = null;
					aShortArray9076 = null;
				} else
					aBool9089 = true;
			}
			if (anIntArrayArray9080 != null && !Class118.method1538(anInt9050, anInt9051)) {
				anIntArrayArray9080 = null;
				aShortArray9081 = null;
			}
			if (anIntArrayArray9109 != null && !Class118.method1539(anInt9050, anInt9051)) {
				anIntArrayArray9109 = null;
				aShortArray9063 = null;
			}
			if (anIntArrayArray9112 != null && !Class118.method1540(anInt9050, anInt9051))
				anIntArrayArray9112 = null;
			if (anIntArray9101 != null && (anInt9050 & 0x800) == 0 && (anInt9050 & 0x40000) == 0)
				anIntArray9101 = null;
		}
	}

	public void method2464() {
		if (!aBool9099) {
			if (!aBool9092)
				method8488();
			aShort9083 = aShort9093;
			aBool9099 = true;
		}
	}

	void method2547(int i, int i_1561_, int i_1562_, int i_1563_) {
		if (i == 0) {
			int i_1564_ = 0;
			anInt9073 = 0;
			anInt9052 = 0;
			anInt9117 = 0;
			for (int i_1565_ = 0; i_1565_ < anInt9058; i_1565_++) {
				anInt9073 += anIntArray9059[i_1565_];
				anInt9052 += anIntArray9060[i_1565_];
				anInt9117 += anIntArray9061[i_1565_];
				i_1564_++;
			}
			if (i_1564_ > 0) {
				anInt9073 = anInt9073 / i_1564_ + i_1561_;
				anInt9052 = anInt9052 / i_1564_ + i_1562_;
				anInt9117 = anInt9117 / i_1564_ + i_1563_;
			} else {
				anInt9073 = i_1561_;
				anInt9052 = i_1562_;
				anInt9117 = i_1563_;
			}
		} else if (i == 1) {
			for (int i_1566_ = 0; i_1566_ < anInt9058; i_1566_++) {
				anIntArray9059[i_1566_] += i_1561_;
				anIntArray9060[i_1566_] += i_1562_;
				anIntArray9061[i_1566_] += i_1563_;
			}
		} else if (i == 2) {
			for (int i_1567_ = 0; i_1567_ < anInt9058; i_1567_++) {
				anIntArray9059[i_1567_] -= anInt9073;
				anIntArray9060[i_1567_] -= anInt9052;
				anIntArray9061[i_1567_] -= anInt9117;
				if (i_1563_ != 0) {
					int i_1568_ = Class447.anIntArray4906[i_1563_];
					int i_1569_ = Class447.anIntArray4921[i_1563_];
					int i_1570_ = ((anIntArray9060[i_1567_] * i_1568_ + anIntArray9059[i_1567_] * i_1569_ + 16383) >> 14);
					anIntArray9060[i_1567_] = (anIntArray9060[i_1567_] * i_1569_ - anIntArray9059[i_1567_] * i_1568_ + 16383) >> 14;
					anIntArray9059[i_1567_] = i_1570_;
				}
				if (i_1561_ != 0) {
					int i_1571_ = Class447.anIntArray4906[i_1561_];
					int i_1572_ = Class447.anIntArray4921[i_1561_];
					int i_1573_ = ((anIntArray9060[i_1567_] * i_1572_ - anIntArray9061[i_1567_] * i_1571_ + 16383) >> 14);
					anIntArray9061[i_1567_] = (anIntArray9060[i_1567_] * i_1571_ + anIntArray9061[i_1567_] * i_1572_ + 16383) >> 14;
					anIntArray9060[i_1567_] = i_1573_;
				}
				if (i_1562_ != 0) {
					int i_1574_ = Class447.anIntArray4906[i_1562_];
					int i_1575_ = Class447.anIntArray4921[i_1562_];
					int i_1576_ = ((anIntArray9061[i_1567_] * i_1574_ + anIntArray9059[i_1567_] * i_1575_ + 16383) >> 14);
					anIntArray9061[i_1567_] = (anIntArray9061[i_1567_] * i_1575_ - anIntArray9059[i_1567_] * i_1574_ + 16383) >> 14;
					anIntArray9059[i_1567_] = i_1576_;
				}
				anIntArray9059[i_1567_] += anInt9073;
				anIntArray9060[i_1567_] += anInt9052;
				anIntArray9061[i_1567_] += anInt9117;
			}
		} else if (i == 3) {
			for (int i_1577_ = 0; i_1577_ < anInt9058; i_1577_++) {
				anIntArray9059[i_1577_] -= anInt9073;
				anIntArray9060[i_1577_] -= anInt9052;
				anIntArray9061[i_1577_] -= anInt9117;
				anIntArray9059[i_1577_] = anIntArray9059[i_1577_] * i_1561_ / 128;
				anIntArray9060[i_1577_] = anIntArray9060[i_1577_] * i_1562_ / 128;
				anIntArray9061[i_1577_] = anIntArray9061[i_1577_] * i_1563_ / 128;
				anIntArray9059[i_1577_] += anInt9073;
				anIntArray9060[i_1577_] += anInt9052;
				anIntArray9061[i_1577_] += anInt9117;
			}
		} else if (i == 5) {
			for (int i_1578_ = 0; i_1578_ < anInt9118; i_1578_++) {
				int i_1579_ = (aByteArray9075[i_1578_] & 0xff) + i_1561_ * 8;
				if (i_1579_ < 0)
					i_1579_ = 0;
				else if (i_1579_ > 255)
					i_1579_ = 255;
				aByteArray9075[i_1578_] = (byte) i_1579_;
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
			if (aClass142Array9107 != null) {
				for (int i_1580_ = 0; i_1580_ < anInt9116; i_1580_++) {
					Class142 class142 = aClass142Array9107[i_1580_];
					Class132 class132 = aClass132Array9102[i_1580_];
					class132.anInt1603 = (class132.anInt1603 & 0xffffff | (255 - (aByteArray9075[class142.anInt1663] & 0xff) << 24));
				}
			}
		} else if (i == 7) {
			for (int i_1581_ = 0; i_1581_ < anInt9118; i_1581_++) {
				int i_1582_ = aShortArray9074[i_1581_] & 0xffff;
				int i_1583_ = i_1582_ >> 10 & 0x3f;
				int i_1584_ = i_1582_ >> 7 & 0x7;
				int i_1585_ = i_1582_ & 0x7f;
				i_1583_ = i_1583_ + i_1561_ & 0x3f;
				i_1584_ += i_1562_ / 4;
				if (i_1584_ < 0)
					i_1584_ = 0;
				else if (i_1584_ > 7)
					i_1584_ = 7;
				i_1585_ += i_1563_;
				if (i_1585_ < 0)
					i_1585_ = 0;
				else if (i_1585_ > 127)
					i_1585_ = 127;
				aShortArray9074[i_1581_] = (short) (i_1583_ << 10 | i_1584_ << 7 | i_1585_);
			}
			if (aClass130_9065 != null)
				aClass130_9065.anInterface15_1587 = null;
			if (aClass142Array9107 != null) {
				for (int i_1586_ = 0; i_1586_ < anInt9116; i_1586_++) {
					Class142 class142 = aClass142Array9107[i_1586_];
					Class132 class132 = aClass132Array9102[i_1586_];
					class132.anInt1603 = (class132.anInt1603 & ~0xffffff | ((Class639.anIntArray8309[aShortArray9074[class142.anInt1663] & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_1587_ = 0; i_1587_ < anInt9116; i_1587_++) {
				Class132 class132 = aClass132Array9102[i_1587_];
				class132.anInt1606 += i_1561_;
				class132.anInt1607 += i_1562_;
			}
		} else if (i == 10) {
			for (int i_1588_ = 0; i_1588_ < anInt9116; i_1588_++) {
				Class132 class132 = aClass132Array9102[i_1588_];
				class132.anInt1608 = class132.anInt1608 * i_1561_ >> 7;
				class132.anInt1604 = class132.anInt1604 * i_1562_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1589_ = 0; i_1589_ < anInt9116; i_1589_++) {
				Class132 class132 = aClass132Array9102[i_1589_];
				class132.anInt1605 = class132.anInt1605 + i_1561_ & 0x3fff;
			}
		}
	}

	public Class177 method2618(byte i, int i_1590_, boolean bool) {
		boolean bool_1591_ = false;
		Class177_Sub1 class177_sub1_1592_;
		Class177_Sub1 class177_sub1_1593_;
		if (i > 0 && i <= 8) {
			class177_sub1_1593_ = aClass167_Sub2_9049.aClass177_Sub1Array9177[i - 1];
			class177_sub1_1592_ = aClass167_Sub2_9049.aClass177_Sub1Array9312[i - 1];
			bool_1591_ = true;
		} else
			class177_sub1_1592_ = class177_sub1_1593_ = new Class177_Sub1(aClass167_Sub2_9049);
		return method8497(class177_sub1_1592_, class177_sub1_1593_, i_1590_, bool_1591_, bool);
	}

	public Class177 method2496(byte i, int i_1594_, boolean bool) {
		boolean bool_1595_ = false;
		Class177_Sub1 class177_sub1_1596_;
		Class177_Sub1 class177_sub1_1597_;
		if (i > 0 && i <= 8) {
			class177_sub1_1597_ = aClass167_Sub2_9049.aClass177_Sub1Array9177[i - 1];
			class177_sub1_1596_ = aClass167_Sub2_9049.aClass177_Sub1Array9312[i - 1];
			bool_1595_ = true;
		} else
			class177_sub1_1596_ = class177_sub1_1597_ = new Class177_Sub1(aClass167_Sub2_9049);
		return method8497(class177_sub1_1596_, class177_sub1_1597_, i_1594_, bool_1595_, bool);
	}
}
