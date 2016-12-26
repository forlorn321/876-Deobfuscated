/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class465 {
	public boolean aBool5231;
	protected Class455 aClass455_5232;
	boolean aBool5233;
	static final int anInt5234 = 32;
	static final int anInt5235 = 0;
	static final int anInt5236 = 2;
	public boolean aBool5237;
	public boolean aBool5238;
	public boolean aBool5239;
	static int[][] anIntArrayArray5240;
	public int anInt5241;
	protected int anInt5242;
	Class34_Sub4 aClass34_Sub4_5243;
	Class34_Sub3 aClass34_Sub3_5244;
	public int[][][] anIntArrayArrayArray5245;
	public byte[][][] aByteArrayArrayArray5246;
	protected boolean aBool5247;
	int anInt5248;
	byte[][][] aByteArrayArrayArray5249;
	static int[] anIntArray5250;
	short[][][] aShortArrayArrayArray5251;
	protected byte[][][] aByteArrayArrayArray5252;
	int[] anIntArray5253;
	int[] anIntArray5254;
	int[] anIntArray5255;
	static boolean[][] aBoolArrayArray5256;
	int[] anIntArray5257;
	static final int anInt5258 = 0;
	static final int anInt5259 = 2;
	static final int anInt5260 = 64;
	static int[][] anIntArrayArray5261;
	static final int anInt5262 = 1;
	int[] anIntArray5263;
	static final int anInt5264 = 128;
	static final int anInt5265 = 8;
	static final int anInt5266 = 16;
	byte[][][] aByteArrayArrayArray5267;
	public int anInt5268 = 0;
	protected Class553 aClass553_5269;
	static final int anInt5270 = 256;
	static final int anInt5271 = 512;
	static int[] anIntArray5272;
	boolean aBool5273;
	int anInt5274;
	static int[] anIntArray5275;
	static int[] anIntArray5276;
	static final int anInt5277 = 1;
	static boolean[][] aBoolArrayArray5278;
	static int[] anIntArray5279;
	static int[] anIntArray5280;
	int anInt5281;
	static int[][] anIntArrayArray5282;
	static int[][] anIntArrayArray5283;
	protected int anInt5284;
	static boolean[][] aBoolArrayArray5285;
	static int[][] anIntArrayArray5286;
	static int[][] anIntArrayArray5287;
	static int[][] anIntArrayArray5288;
	static int[][] anIntArrayArray5289;
	static boolean[][] aBoolArrayArray5290;
	static int[][] anIntArrayArray5291;
	int[] anIntArray5292;
	static int[][] anIntArrayArray5293;
	static int[][] anIntArrayArray5294;
	int[] anIntArray5295;
	static final int anInt5296 = 4;
	short[][][] aShortArrayArrayArray5297;
	public boolean aBool5298;
	int[] anIntArray5299;
	int[] anIntArray5300;
	int[] anIntArray5301;
	int anInt5302;
	static int[] anIntArray5303 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	int[] anIntArray5304;
	int anInt5305;
	int anInt5306;
	static final int anInt5307 = 3;
	int anInt5308;
	boolean aBool5309;
	int anInt5310;
	int[] anIntArray5311;
	boolean aBool5312;
	int anInt5313;
	static int[] anIntArray5314;
	int[] anIntArray5315;
	int[] anIntArray5316;
	int[] anIntArray5317;
	int[] anIntArray5318;

	static final int method5634(int i, int i_0_) {
		int i_1_ = (Class585.method7049(i - 1, i_0_ - 1, -1871695632) + Class585.method7049(i + 1, i_0_ - 1, -1871695632) + Class585.method7049(i - 1, 1 + i_0_, -1871695632) + Class585.method7049(1 + i, i_0_ + 1, -1871695632));
		int i_2_ = (Class585.method7049(i - 1, i_0_, -1871695632) + Class585.method7049(1 + i, i_0_, -1871695632) + Class585.method7049(i, i_0_ - 1, -1871695632) + Class585.method7049(i, 1 + i_0_, -1871695632));
		int i_3_ = Class585.method7049(i, i_0_, -1871695632);
		return i_2_ / 8 + i_1_ / 16 + i_3_ / 4;
	}

	public void method5635(byte i) {
		anIntArray5253 = null;
		anIntArray5318 = null;
		anIntArray5255 = null;
		anIntArray5263 = null;
		anIntArray5257 = null;
		aBool5247 = false;
	}

	public final void method5636(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		for (int i_9_ = i_5_; i_9_ < i_5_ + i_7_; i_9_++) {
			for (int i_10_ = i_4_; i_10_ < i_4_ + i_6_; i_10_++) {
				if (i_10_ >= 0 && i_10_ < anInt5242 * 312855363 && i_9_ >= 0 && i_9_ < -183622811 * anInt5284)
					anIntArrayArrayArray5245[i][i_10_][i_9_] = (i > 0 ? anIntArrayArrayArray5245[i - 1][i_10_][i_9_] - 960 : 0);
			}
		}
		if (i_4_ > 0 && i_4_ < anInt5242 * 312855363) {
			for (int i_11_ = i_5_ + 1; i_11_ < i_5_ + i_7_; i_11_++) {
				if (i_11_ >= 0 && i_11_ < -183622811 * anInt5284)
					anIntArrayArrayArray5245[i][i_4_][i_11_] = anIntArrayArrayArray5245[i][i_4_ - 1][i_11_];
			}
		}
		if (i_5_ > 0 && i_5_ < anInt5284 * -183622811) {
			for (int i_12_ = i_4_ + 1; i_12_ < i_6_ + i_4_; i_12_++) {
				if (i_12_ >= 0 && i_12_ < anInt5242 * 312855363)
					anIntArrayArrayArray5245[i][i_12_][i_5_] = anIntArrayArrayArray5245[i][i_12_][i_5_ - 1];
			}
		}
		if (i_4_ >= 0 && i_5_ >= 0 && i_4_ < anInt5242 * 312855363 && i_5_ < anInt5284 * -183622811) {
			if (0 == i) {
				if (i_4_ > 0 && 0 != anIntArrayArrayArray5245[i][i_4_ - 1][i_5_])
					anIntArrayArrayArray5245[i][i_4_][i_5_] = anIntArrayArrayArray5245[i][i_4_ - 1][i_5_];
				else if (i_5_ > 0 && anIntArrayArrayArray5245[i][i_4_][i_5_ - 1] != 0)
					anIntArrayArrayArray5245[i][i_4_][i_5_] = anIntArrayArrayArray5245[i][i_4_][i_5_ - 1];
				else if (i_4_ > 0 && i_5_ > 0 && 0 != (anIntArrayArrayArray5245[i][i_4_ - 1][i_5_ - 1]))
					anIntArrayArrayArray5245[i][i_4_][i_5_] = anIntArrayArrayArray5245[i][i_4_ - 1][i_5_ - 1];
			} else if (i_4_ > 0 && (anIntArrayArrayArray5245[i][i_4_ - 1][i_5_] != anIntArrayArrayArray5245[i - 1][i_4_ - 1][i_5_]))
				anIntArrayArrayArray5245[i][i_4_][i_5_] = anIntArrayArrayArray5245[i][i_4_ - 1][i_5_];
			else if (i_5_ > 0 && (anIntArrayArrayArray5245[i][i_4_][i_5_ - 1] != anIntArrayArrayArray5245[i - 1][i_4_][i_5_ - 1]))
				anIntArrayArrayArray5245[i][i_4_][i_5_] = anIntArrayArrayArray5245[i][i_4_][i_5_ - 1];
			else if (i_4_ > 0 && i_5_ > 0 && (anIntArrayArrayArray5245[i][i_4_ - 1][i_5_ - 1] != (anIntArrayArrayArray5245[i - 1][i_4_ - 1][i_5_ - 1])))
				anIntArrayArrayArray5245[i][i_4_][i_5_] = anIntArrayArrayArray5245[i][i_4_ - 1][i_5_ - 1];
		}
	}

	public final void method5637(RSByteBuffer class536_sub33, int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		int i_20_ = 8 * (i_16_ & 0x7);
		int i_21_ = 8 * (i_17_ & 0x7);
		int i_22_ = (i_16_ & ~0x7) << 3;
		int i_23_ = (i_17_ & ~0x7) << 3;
		int i_24_ = 0;
		int i_25_ = 0;
		if (i_18_ == 1)
			i_25_ = 1;
		else if (2 == i_18_) {
			i_24_ = 1;
			i_25_ = 1;
		} else if (i_18_ == 3)
			i_24_ = 1;
		for (int i_26_ = 0; i_26_ < anInt5241 * -1581600933; i_26_++) {
			for (int i_27_ = 0; i_27_ < 64; i_27_++) {
				for (int i_28_ = 0; i_28_ < 64; i_28_++) {
					if (i_15_ == i_26_ && i_27_ >= i_20_ && i_27_ <= i_20_ + 8 && i_28_ >= i_21_ && i_28_ <= i_21_ + 8) {
						int i_29_;
						int i_30_;
						if (8 + i_20_ == i_27_ || i_28_ == i_21_ + 8) {
							if (0 == i_18_) {
								i_29_ = i_13_ + (i_27_ - i_20_);
								i_30_ = i_28_ - i_21_ + i_14_;
							} else if (1 == i_18_) {
								i_29_ = i_28_ - i_21_ + i_13_;
								i_30_ = 8 + i_14_ - (i_27_ - i_20_);
							} else if (i_18_ == 2) {
								i_29_ = 8 + i_13_ - (i_27_ - i_20_);
								i_30_ = 8 + i_14_ - (i_28_ - i_21_);
							} else {
								i_29_ = i_13_ + 8 - (i_28_ - i_21_);
								i_30_ = i_27_ - i_20_ + i_14_;
							}
							method5638(class536_sub33, i, i_29_, i_30_, 0, 0, i_27_ + i_22_, i_28_ + i_23_, 0, true, 805335635);
						} else {
							i_29_ = i_13_ + Class89.method1226(i_27_ & 0x7, i_28_ & 0x7, i_18_, 1890000619);
							i_30_ = i_14_ + Class45.method897(i_27_ & 0x7, i_28_ & 0x7, i_18_, -2128104654);
							method5638(class536_sub33, i, i_29_, i_30_, i_24_, i_25_, i_22_ + i_27_, i_23_ + i_28_, i_18_, false, 2106581189);
						}
						if (63 == i_27_ || 63 == i_28_) {
							int i_31_ = 1;
							if (63 == i_27_ && i_28_ == 63)
								i_31_ = 3;
							for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
								int i_33_ = i_27_;
								int i_34_ = i_28_;
								if (i_32_ == 0) {
									i_33_ = i_27_ == 63 ? 64 : i_27_;
									i_34_ = 63 == i_28_ ? 64 : i_28_;
								} else if (i_32_ == 1)
									i_33_ = 64;
								else if (i_32_ == 2)
									i_34_ = 64;
								int i_35_;
								int i_36_;
								if (0 == i_18_) {
									i_35_ = i_13_ + (i_33_ - i_20_);
									i_36_ = i_34_ - i_21_ + i_14_;
								} else if (1 == i_18_) {
									i_35_ = i_34_ - i_21_ + i_13_;
									i_36_ = 8 + i_14_ - (i_33_ - i_20_);
								} else if (i_18_ == 2) {
									i_35_ = i_13_ + 8 - (i_33_ - i_20_);
									i_36_ = 8 + i_14_ - (i_34_ - i_21_);
								} else {
									i_35_ = 8 + i_13_ - (i_34_ - i_21_);
									i_36_ = i_33_ - i_20_ + i_14_;
								}
								if (i_35_ >= 0 && i_35_ < anInt5242 * 312855363 && i_36_ >= 0 && i_36_ < -183622811 * anInt5284)
									anIntArrayArrayArray5245[i][i_35_][i_36_] = (anIntArrayArrayArray5245[i][i_24_ + i_29_][i_25_ + i_30_]);
							}
						}
					} else
						method5638(class536_sub33, 0, -1, -1, 0, 0, 0, 0, 0, false, 1491152708);
				}
			}
		}
	}

	final void method5638(RSByteBuffer class536_sub33, int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, boolean bool, int i_44_) {
		if (1 == i_43_)
			i_40_ = 1;
		else if (2 == i_43_) {
			i_39_ = 1;
			i_40_ = 1;
		} else if (i_43_ == 3)
			i_39_ = 1;
		if (i_37_ >= 0 && i_37_ < 312855363 * anInt5242 && i_38_ >= 0 && i_38_ < -183622811 * anInt5284) {
			if (!aBool5298 && !bool)
				aClass455_5232.aByteArrayArrayArray5154[i][i_37_][i_38_] = (byte) 0;
			int i_45_ = class536_sub33.readUnsignedByte();
			if ((i_45_ & 0x1) != 0) {
				if (bool) {
					class536_sub33.readUnsignedByte();
					class536_sub33.readUnsignedSmart();
				} else {
					int i_46_ = class536_sub33.readUnsignedByte();
					aShortArrayArrayArray5251[i][i_37_][i_38_] = (short) class536_sub33.readUnsignedSmart();
					aByteArrayArrayArray5267[i][i_37_][i_38_] = (byte) (i_46_ >> 2);
					aByteArrayArrayArray5249[i][i_37_][i_38_] = (byte) (i_46_ + i_43_ & 0x3);
				}
			}
			if (0 != (i_45_ & 0x2)) {
				if (!aBool5298 && !bool)
					aClass455_5232.aByteArrayArrayArray5154[i][i_37_][i_38_] = class536_sub33.readByte();
				else
					class536_sub33.off += 516175515;
			}
			if (0 != (i_45_ & 0x4)) {
				if (bool)
					class536_sub33.readUnsignedSmart();
				else
					aShortArrayArrayArray5297[i][i_37_][i_38_] = (short) class536_sub33.readUnsignedSmart();
			}
			if (0 != (i_45_ & 0x8)) {
				int i_47_ = class536_sub33.readUnsignedByte();
				if (!aBool5298) {
					if (1 == i_47_)
						i_47_ = 0;
					if (i == 0)
						anIntArrayArrayArray5245[0][i_37_ + i_39_][(i_40_ + i_38_)] = -i_47_ * 8 << 2;
					else
						anIntArrayArrayArray5245[i][i_39_ + i_37_][(i_38_ + i_40_)] = (anIntArrayArrayArray5245[i - 1][i_39_ + i_37_][i_40_ + i_38_]) - (i_47_ * 8 << 2);
				} else
					anIntArrayArrayArray5245[0][i_37_ + i_39_][i_38_ + i_40_] = i_47_ * 8 << 2;
			} else if (aBool5298)
				anIntArrayArrayArray5245[0][i_39_ + i_37_][i_38_ + i_40_] = 0;
			else if (0 == i)
				anIntArrayArrayArray5245[0][i_37_ + i_39_][i_38_ + i_40_] = (-Class205_Sub23.method9101(i_41_ + 932731, i_42_ + 556238, (short) 255) * 8) << 2;
			else
				anIntArrayArrayArray5245[i][i_39_ + i_37_][i_38_ + i_40_] = (anIntArrayArrayArray5245[i - 1][i_39_ + i_37_][i_40_ + i_38_]) - 960;
		} else {
			int i_48_ = class536_sub33.readUnsignedByte();
			if ((i_48_ & 0x1) != 0) {
				class536_sub33.readUnsignedByte();
				class536_sub33.readUnsignedSmart();
			}
			if ((i_48_ & 0x2) != 0)
				class536_sub33.off += 516175515;
			if ((i_48_ & 0x4) != 0)
				class536_sub33.readUnsignedSmart();
			if ((i_48_ & 0x8) != 0)
				class536_sub33.readUnsignedByte();
		}
	}

	public final void method5639(int i, int[][] is, int i_49_) {
		int[][] is_50_ = anIntArrayArrayArray5245[i];
		for (int i_51_ = 0; i_51_ < 1 + 312855363 * anInt5242; i_51_++) {
			for (int i_52_ = 0; i_52_ < anInt5284 * -183622811 + 1; i_52_++)
				is_50_[i_51_][i_52_] += is[i_51_][i_52_];
		}
	}

	public final void method5640(Class167 class167, Class160 class160, Class160 class160_53_, int i) {
		int[][] is = new int[312855363 * anInt5242][-183622811 * anInt5284];
		if (null == anIntArray5253 || anIntArray5253.length != -183622811 * anInt5284) {
			anIntArray5253 = new int[anInt5284 * -183622811];
			anIntArray5318 = new int[-183622811 * anInt5284];
			anIntArray5255 = new int[anInt5284 * -183622811];
			anIntArray5263 = new int[anInt5284 * -183622811];
			anIntArray5257 = new int[anInt5284 * -183622811];
		}
		for (int i_54_ = 0; i_54_ < anInt5241 * -1581600933; i_54_++) {
			for (int i_55_ = 0; i_55_ < -183622811 * anInt5284; i_55_++) {
				anIntArray5253[i_55_] = 0;
				anIntArray5318[i_55_] = 0;
				anIntArray5255[i_55_] = 0;
				anIntArray5263[i_55_] = 0;
				anIntArray5257[i_55_] = 0;
			}
			for (int i_56_ = -5; i_56_ < anInt5242 * 312855363; i_56_++) {
				for (int i_57_ = 0; i_57_ < anInt5284 * -183622811; i_57_++) {
					int i_58_ = 5 + i_56_;
					if (i_58_ < 312855363 * anInt5242) {
						int i_59_ = (aShortArrayArrayArray5297[i_54_][i_58_][i_57_] & 0x7fff);
						if (i_59_ > 0) {
							Class20 class20 = ((Class20) aClass34_Sub3_5244.method70(i_59_ - 1, (byte) -88));
							anIntArray5253[i_57_] += 1490608091 * class20.anInt211;
							anIntArray5318[i_57_] += -1278569833 * class20.anInt212;
							anIntArray5255[i_57_] += class20.anInt213 * -2044137673;
							anIntArray5263[i_57_] += class20.anInt206 * -1374187401;
							anIntArray5257[i_57_]++;
						}
					}
					int i_60_ = i_56_ - 5;
					if (i_60_ >= 0) {
						int i_61_ = (aShortArrayArrayArray5297[i_54_][i_60_][i_57_] & 0x7fff);
						if (i_61_ > 0) {
							Class20 class20 = ((Class20) aClass34_Sub3_5244.method70(i_61_ - 1, (byte) -28));
							anIntArray5253[i_57_] -= class20.anInt211 * 1490608091;
							anIntArray5318[i_57_] -= class20.anInt212 * -1278569833;
							anIntArray5255[i_57_] -= class20.anInt213 * -2044137673;
							anIntArray5263[i_57_] -= class20.anInt206 * -1374187401;
							anIntArray5257[i_57_]--;
						}
					}
				}
				if (i_56_ >= 0) {
					int i_62_ = 0;
					int i_63_ = 0;
					int i_64_ = 0;
					int i_65_ = 0;
					int i_66_ = 0;
					for (int i_67_ = -5; i_67_ < anInt5284 * -183622811; i_67_++) {
						int i_68_ = 5 + i_67_;
						if (i_68_ < -183622811 * anInt5284) {
							i_62_ += anIntArray5253[i_68_];
							i_63_ += anIntArray5318[i_68_];
							i_64_ += anIntArray5255[i_68_];
							i_65_ += anIntArray5263[i_68_];
							i_66_ += anIntArray5257[i_68_];
						}
						int i_69_ = i_67_ - 5;
						if (i_69_ >= 0) {
							i_62_ -= anIntArray5253[i_69_];
							i_63_ -= anIntArray5318[i_69_];
							i_64_ -= anIntArray5255[i_69_];
							i_65_ -= anIntArray5263[i_69_];
							i_66_ -= anIntArray5257[i_69_];
						}
						if (i_67_ >= 0 && i_65_ > 0 && i_66_ > 0)
							is[i_56_][i_67_] = Class169.method2417(256 * i_62_ / i_65_, i_63_ / i_66_, i_64_ / i_66_, 1155502892);
					}
				}
			}
			if (aBool5239)
				method5657(class167, aClass553_5269.aClass160Array7431[i_54_], i_54_, is, 0 == i_54_ ? class160 : null, 0 == i_54_ ? class160_53_ : null, -17170179);
			else
				method5641(class167, aClass553_5269.aClass160Array7431[i_54_], i_54_, is, i_54_ == 0 ? class160 : null, i_54_ == 0 ? class160_53_ : null, (byte) 93);
			aShortArrayArrayArray5297[i_54_] = null;
			aShortArrayArrayArray5251[i_54_] = null;
			aByteArrayArrayArray5267[i_54_] = null;
			aByteArrayArrayArray5249[i_54_] = null;
		}
		if (!aBool5298) {
			if (0 != -529914135 * anInt5268)
				aClass553_5269.method6765(-997888627);
			if (aBool5238)
				aClass553_5269.method6738((byte) 35);
		}
		for (int i_70_ = 0; i_70_ < anInt5241 * -1581600933; i_70_++)
			aClass553_5269.aClass160Array7431[i_70_].method1922();
	}

	void method5641(Class167 class167, Class160 class160, int i, int[][] is, Class160 class160_71_, Class160 class160_72_, byte i_73_) {
		for (int i_74_ = 0; i_74_ < anInt5242 * 312855363; i_74_++) {
			for (int i_75_ = 0; i_75_ < -183622811 * anInt5284; i_75_++) {
				byte i_76_ = aByteArrayArrayArray5267[i][i_74_][i_75_];
				byte i_77_ = aByteArrayArrayArray5249[i][i_74_][i_75_];
				int i_78_ = aShortArrayArrayArray5251[i][i_74_][i_75_] & 0x7fff;
				int i_79_ = aShortArrayArrayArray5297[i][i_74_][i_75_] & 0x7fff;
				Class647 class647 = ((Class647) (0 != i_78_ ? aClass34_Sub4_5243.method70(i_78_ - 1, (byte) 28) : null));
				Class20 class20 = ((Class20) (0 != i_79_ ? aClass34_Sub3_5244.method70(i_79_ - 1, (byte) -20) : null));
				if (0 == i_76_ && null == class647)
					i_76_ = (byte) 12;
				Class647 class647_80_ = class647;
				if (null != class647 && 1648019033 * class647.anInt8364 == -1 && -1 == -1198548799 * class647.anInt8366) {
					class647_80_ = class647;
					class647 = null;
				}
				if (null != class647 || class20 != null) {
					anInt5313 = 380915957 * anIntArray5280[i_76_];
					anInt5274 = 1452782421 * anIntArray5303[i_76_];
					int i_81_ = ((null != class20 ? anInt5313 * 1747573597 : 0) + (null != class647 ? anInt5274 * -1329679875 : 0));
					int i_82_ = 0;
					anInt5281 = 0;
					anInt5306 = -1371028645 * (class647 != null ? class647.anInt8365 * 22125273 : -1);
					int i_83_ = class20 != null ? class20.anInt207 * -542882535 : -1;
					int[] is_84_ = new int[i_81_];
					int[] is_85_ = new int[i_81_];
					int[] is_86_ = new int[i_81_];
					int[] is_87_ = new int[i_81_];
					int[] is_88_ = new int[i_81_];
					int[] is_89_ = new int[i_81_];
					int[] is_90_ = ((null != class647 && -1 != -1198548799 * class647.anInt8366) ? new int[i_81_] : null);
					if (null != class647) {
						for (int i_91_ = 0; i_91_ < anInt5274 * -1329679875; i_91_++) {
							is_84_[i_82_] = (anIntArrayArray5282[i_76_][anInt5281 * -1883533497]);
							is_85_[i_82_] = (anIntArrayArray5283[i_76_][-1883533497 * anInt5281]);
							is_86_[i_82_] = (anIntArrayArray5240[i_76_][anInt5281 * -1883533497]);
							is_88_[i_82_] = anInt5306 * -1092963117;
							is_89_[i_82_] = class647.anInt8372 * 1570850085;
							is_87_[i_82_] = 1648019033 * class647.anInt8364;
							if (null != is_90_)
								is_90_[i_82_] = -1198548799 * class647.anInt8366;
							i_82_++;
							anInt5281 += 1176201847;
						}
						if (!aBool5298 && 0 == i)
							aClass553_5269.method6706(i_74_, i_75_, class647.anInt8367 * 460440827, 330928968 * class647.anInt8368, class647.anInt8374 * 756434589, -1328631995 * class647.anInt8375, class647.anInt8376 * 1439418245, -2084798233 * class647.anInt8377, (byte) 0);
					} else
						anInt5281 += anInt5274 * 302415515;
					if (null != class20) {
						for (int i_92_ = 0; i_92_ < anInt5313 * 1747573597; i_92_++) {
							is_84_[i_82_] = (anIntArrayArray5282[i_76_][-1883533497 * anInt5281]);
							is_85_[i_82_] = (anIntArrayArray5283[i_76_][anInt5281 * -1883533497]);
							is_86_[i_82_] = (anIntArrayArray5240[i_76_][-1883533497 * anInt5281]);
							is_88_[i_82_] = i_83_;
							is_89_[i_82_] = -69580511 * class20.anInt214;
							is_87_[i_82_] = is[i_74_][i_75_];
							if (is_90_ != null)
								is_90_[i_82_] = is_87_[i_82_];
							i_82_++;
							anInt5281 += 1176201847;
						}
					}
					int i_93_ = anIntArray5250.length;
					int[] is_94_ = new int[i_93_];
					int[] is_95_ = new int[i_93_];
					int[] is_96_ = class160_72_ != null ? new int[i_93_] : null;
					int[] is_97_ = (class160_72_ != null || class160_71_ != null ? new int[i_93_] : null);
					for (int i_98_ = 0; i_98_ < i_93_; i_98_++) {
						int i_99_ = anIntArray5250[i_98_];
						int i_100_ = anIntArray5279[i_98_];
						if (0 == i_77_) {
							is_94_[i_98_] = i_99_;
							is_95_[i_98_] = i_100_;
						} else if (i_77_ == 1) {
							int i_101_ = i_99_;
							is_94_[i_98_] = i_100_;
							is_95_[i_98_] = 512 - i_101_;
						} else if (2 == i_77_) {
							is_94_[i_98_] = 512 - i_99_;
							is_95_[i_98_] = 512 - i_100_;
						} else if (3 == i_77_) {
							int i_102_ = i_99_;
							is_94_[i_98_] = 512 - i_100_;
							is_95_[i_98_] = i_102_;
						}
						if (is_96_ != null && aBoolArrayArray5256[i_76_][i_98_]) {
							int i_103_ = (i_74_ << 9) + is_94_[i_98_];
							int i_104_ = (i_75_ << 9) + is_95_[i_98_];
							is_96_[i_98_] = (class160_72_.method1925(i_103_, i_104_, (byte) 69) - class160.method1925(i_103_, i_104_, (byte) -120));
						}
						if (is_97_ != null) {
							if (null != class160_72_ && !aBoolArrayArray5256[i_76_][i_98_]) {
								int i_105_ = is_94_[i_98_] + (i_74_ << 9);
								int i_106_ = is_95_[i_98_] + (i_75_ << 9);
								is_97_[i_98_] = (class160.method1925(i_105_, i_106_, (byte) 29) - class160_72_.method1925(i_105_, i_106_, (byte) -70));
							} else if (null != class160_71_ && !aBoolArrayArray5278[i_76_][i_98_]) {
								int i_107_ = (i_74_ << 9) + is_94_[i_98_];
								int i_108_ = is_95_[i_98_] + (i_75_ << 9);
								is_97_[i_98_] = (class160_71_.method1925(i_107_, i_108_, (byte) -85) - class160.method1925(i_107_, i_108_, (byte) -25));
							}
						}
					}
					int i_109_ = class160.method1927(i_74_, i_75_, -666208766);
					int i_110_ = class160.method1927(1 + i_74_, i_75_, -418750687);
					int i_111_ = class160.method1927(i_74_ + 1, i_75_ + 1, 1108940227);
					int i_112_ = class160.method1927(i_74_, i_75_ + 1, -1357155721);
					boolean bool = aClass455_5232.method5466(i_74_, i_75_, (byte) -22);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_113_ = true;
						if (class20 != null && !class20.aBool210)
							bool_113_ = false;
						else if (i_79_ == 0 && 0 != i_76_)
							bool_113_ = false;
						else if (i_78_ > 0 && class647_80_ != null && !class647_80_.aBool8362)
							bool_113_ = false;
						if (bool_113_ && i_110_ == i_109_ && i_111_ == i_109_ && i_109_ == i_112_)
							aByteArrayArrayArray5252[i][i_74_][i_75_] |= 0x4;
					}
					Class175 class175 = new Class175();
					if (aBool5298) {
						class175.anInt1932 = (aClass553_5269.method6702(i_74_, i_75_, (byte) 17) * -158484941);
						class175.anInt1934 = (aClass553_5269.method6701(i_74_, i_75_, -1284058322) * 261072557);
						class175.anInt1930 = (aClass553_5269.method6703(i_74_, i_75_, (byte) 24) * -1714306347);
						class175.anInt1928 = (aClass553_5269.method6767(i_74_, i_75_, -1541476112) * 1238295881);
						class175.anInt1933 = (aClass553_5269.method6757(i_74_, i_75_, 1755250134) * 1127551047);
						class175.anInt1929 = (aClass553_5269.method6705(i_74_, i_75_, (byte) 38) * -284212951);
					}
					class160.method1921(i_74_, i_75_, is_94_, is_96_, is_95_, is_97_, is_84_, is_85_, is_86_, is_87_, is_90_, is_88_, is_89_, class175, false);
					aClass553_5269.method6699(i, i_74_, i_75_, (byte) 119);
				}
			}
		}
	}

	int method5642(int i, int i_114_, int i_115_, int i_116_, int i_117_, Class160 class160, short[][] is, byte i_118_) {
		if ((anInt5302 * -312900595 == 0 || 12 == -312900595 * anInt5302) && i_114_ > 0 && i_115_ > 0 && i_114_ < 312855363 * anInt5242 && i_115_ < -183622811 * anInt5284) {
			int i_119_ = 0;
			int i_120_ = 0;
			int i_121_ = 0;
			int i_122_ = 0;
			i_119_ = i_119_ + (i == is[i_114_ - 1][i_115_ - 1] ? 1 : -1);
			i_120_ = i_120_ + (i == is[i_116_][i_115_ - 1] ? 1 : -1);
			i_121_ = i_121_ + (is[i_116_][i_117_] == i ? 1 : -1);
			i_122_ = i_122_ + (i == is[i_114_ - 1][i_117_] ? 1 : -1);
			if (i == is[i_114_][i_115_ - 1]) {
				i_119_++;
				i_120_++;
			} else {
				i_119_--;
				i_120_--;
			}
			if (is[i_116_][i_115_] == i) {
				i_120_++;
				i_121_++;
			} else {
				i_120_--;
				i_121_--;
			}
			if (i == is[i_114_][i_117_]) {
				i_121_++;
				i_122_++;
			} else {
				i_121_--;
				i_122_--;
			}
			if (is[i_114_ - 1][i_115_] == i) {
				i_122_++;
				i_119_++;
			} else {
				i_122_--;
				i_119_--;
			}
			int i_123_ = i_119_ - i_121_;
			if (i_123_ < 0)
				i_123_ = -i_123_;
			int i_124_ = i_120_ - i_122_;
			if (i_124_ < 0)
				i_124_ = -i_124_;
			if (i_124_ == i_123_) {
				i_123_ = (class160.method1927(i_114_, i_115_, -604335717) - class160.method1927(i_116_, i_117_, 232841));
				if (i_123_ < 0)
					i_123_ = -i_123_;
				i_124_ = (class160.method1927(i_116_, i_115_, 2019585583) - class160.method1927(i_114_, i_117_, -1816228540));
				if (i_124_ < 0)
					i_124_ = -i_124_;
			}
			return i_123_ < i_124_ ? 1 : 0;
		}
		return -1883533497 * anInt5281;
	}

	void method5643(Class167 class167, Class647 class647, Class20 class20, int i, int i_125_, byte[][] is, byte[][] is_126_, short[][] is_127_, boolean[] bools, byte i_128_) {
		boolean[] bools_129_ = (class647 != null && class647.aBool8371 ? aBoolArrayArray5290[anInt5302 * -312900595] : aBoolArrayArray5285[-312900595 * anInt5302]);
		method5656(class167, class647, class20, i, i_125_, anInt5242 * 312855363, anInt5284 * -183622811, is_127_, is, is_126_, bools, 1422773388);
		aBool5312 = class647 != null && (1648019033 * class647.anInt8364 != class647.anInt8366 * -1198548799);
		if (!aBool5312) {
			for (int i_130_ = 0; i_130_ < 8; i_130_++) {
				if (anIntArray5300[i_130_] >= 0 && anIntArray5304[i_130_] != anIntArray5311[i_130_]) {
					aBool5312 = true;
					break;
				}
			}
		}
		if (!bools_129_[-1883533497 * anInt5281 + 1 & 0x3]) {
			boolean[] bools_131_ = bools;
			int i_132_ = 1;
			bools_131_[i_132_] = (bools_131_[i_132_] | (anIntArray5301[2] & anIntArray5301[4]) == 0);
		}
		if (!bools_129_[3 + anInt5281 * -1883533497 & 0x3]) {
			boolean[] bools_133_ = bools;
			int i_134_ = 3;
			bools_133_[i_134_] = (bools_133_[i_134_] | (anIntArray5301[6] & anIntArray5301[0]) == 0);
		}
		if (!bools_129_[0 + -1883533497 * anInt5281 & 0x3]) {
			boolean[] bools_135_ = bools;
			int i_136_ = 0;
			bools_135_[i_136_] = (bools_135_[i_136_] | (anIntArray5301[0] & anIntArray5301[2]) == 0);
		}
		if (!bools_129_[2 + -1883533497 * anInt5281 & 0x3]) {
			boolean[] bools_137_ = bools;
			int i_138_ = 2;
			bools_137_[i_138_] = (bools_137_[i_138_] | (anIntArray5301[4] & anIntArray5301[6]) == 0);
		}
		if (!aBool5273 && (anInt5302 * -312900595 == 0 || 12 == anInt5302 * -312900595)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_139_ = bools;
				bools[3] = false;
				bools_139_[0] = false;
				anInt5302 = (-312900595 * anInt5302 == 0 ? 13 : 14) * -483366203;
				anInt5281 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_140_ = bools;
				bools[1] = false;
				bools_140_[0] = false;
				anInt5302 = -483366203 * (anInt5302 * -312900595 == 0 ? 13 : 14);
				anInt5281 = -766361755;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_141_ = bools;
				bools[2] = false;
				bools_141_[1] = false;
				anInt5302 = (-312900595 * anInt5302 == 0 ? 13 : 14) * -483366203;
				anInt5281 = -1942563602;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_142_ = bools;
				bools[3] = false;
				bools_142_[2] = false;
				anInt5302 = (anInt5302 * -312900595 == 0 ? 13 : 14) * -483366203;
				anInt5281 = 1176201847;
			}
		}
	}

	void method5644(Class647 class647, Class20 class20, int i) {
		if (aBool5233) {
			anIntArray5315 = anIntArrayArray5282[anInt5302 * -312900595];
			anIntArray5254 = anIntArrayArray5283[anInt5302 * -312900595];
			anIntArray5317 = anIntArrayArray5240[anInt5302 * -312900595];
			anInt5274 = (null != class647 ? anIntArray5303[anInt5302 * -312900595] : 0) * 1452782421;
			anInt5313 = (class20 != null ? anIntArray5280[-312900595 * anInt5302] : 0) * 380915957;
		} else if (aBool5273) {
			anIntArray5315 = anIntArrayArray5261[-312900595 * anInt5302];
			anIntArray5254 = anIntArrayArray5293[anInt5302 * -312900595];
			anIntArray5317 = anIntArrayArray5294[-312900595 * anInt5302];
			anInt5274 = 1452782421 * (class647 != null ? anIntArray5276[-312900595 * anInt5302] : 0);
			anInt5313 = (null != class20 ? anIntArray5314[anInt5302 * -312900595] : 0) * 380915957;
			anIntArray5316 = anIntArrayArray5291[-312900595 * anInt5302];
		} else {
			anIntArray5315 = anIntArrayArray5287[anInt5302 * -312900595];
			anIntArray5254 = anIntArrayArray5288[-312900595 * anInt5302];
			anIntArray5317 = anIntArrayArray5289[-312900595 * anInt5302];
			anInt5274 = 1452782421 * (null != class647 ? anIntArray5272[-312900595 * anInt5302] : 0);
			anInt5313 = (null != class20 ? anIntArray5275[anInt5302 * -312900595] : 0) * 380915957;
			anIntArray5316 = anIntArrayArray5286[-312900595 * anInt5302];
		}
	}

	void method5645(Class167 class167, int i, int i_143_, int i_144_, Class647 class647, boolean[] bools, int[] is, int[] is_145_, int[] is_146_, int[] is_147_, int[] is_148_, int[] is_149_, int[] is_150_, int[] is_151_, Class160 class160, Class160 class160_152_, Class160 class160_153_, int i_154_) {
		anInt5308 = -441352059;
		anInt5306 = 1371028645;
		anInt5248 = 253372672;
		if (null != class647) {
			anInt5308 = -742296637 * class647.anInt8364;
			anInt5306 = class647.anInt8365 * 287594019;
			anInt5248 = class647.anInt8372 * 1141167341;
			int i_155_ = Class461.method5610(class167, class647, (short) 255);
			for (int i_156_ = 0; i_156_ < -1329679875 * anInt5274; i_156_++) {
				boolean bool = false;
				int i_157_;
				if (bools[0 - anInt5281 * -1883533497 & 0x3] && anInt5310 * 563046651 == anIntArray5316[0]) {
					anIntArray5295[0] = anIntArray5315[anInt5310 * 563046651];
					anIntArray5295[1] = 1;
					anIntArray5295[2] = anIntArray5317[563046651 * anInt5310];
					anIntArray5295[3] = 1;
					anIntArray5295[4] = anIntArray5254[anInt5310 * 563046651];
					anIntArray5295[5] = anIntArray5317[563046651 * anInt5310];
					i_157_ = 6;
				} else if (bools[2 - anInt5281 * -1883533497 & 0x3] && anIntArray5316[2] == anInt5310 * 563046651) {
					anIntArray5295[0] = anIntArray5315[anInt5310 * 563046651];
					anIntArray5295[1] = 5;
					anIntArray5295[2] = anIntArray5317[563046651 * anInt5310];
					anIntArray5295[3] = 5;
					anIntArray5295[4] = anIntArray5254[anInt5310 * 563046651];
					anIntArray5295[5] = anIntArray5317[anInt5310 * 563046651];
					i_157_ = 6;
				} else if (bools[1 - anInt5281 * -1883533497 & 0x3] && anIntArray5316[1] == 563046651 * anInt5310) {
					anIntArray5295[0] = anIntArray5315[anInt5310 * 563046651];
					anIntArray5295[1] = 3;
					anIntArray5295[2] = anIntArray5317[anInt5310 * 563046651];
					anIntArray5295[3] = 3;
					anIntArray5295[4] = anIntArray5254[anInt5310 * 563046651];
					anIntArray5295[5] = anIntArray5317[563046651 * anInt5310];
					i_157_ = 6;
				} else if (bools[3 - -1883533497 * anInt5281 & 0x3] && anIntArray5316[3] == 563046651 * anInt5310) {
					anIntArray5295[0] = anIntArray5315[563046651 * anInt5310];
					anIntArray5295[1] = 7;
					anIntArray5295[2] = anIntArray5317[563046651 * anInt5310];
					anIntArray5295[3] = 7;
					anIntArray5295[4] = anIntArray5254[anInt5310 * 563046651];
					anIntArray5295[5] = anIntArray5317[563046651 * anInt5310];
					i_157_ = 6;
				} else {
					anIntArray5295[0] = anIntArray5315[anInt5310 * 563046651];
					anIntArray5295[1] = anIntArray5254[anInt5310 * 563046651];
					anIntArray5295[2] = anIntArray5317[anInt5310 * 563046651];
					i_157_ = 3;
				}
				for (int i_158_ = 0; i_158_ < i_157_; i_158_++) {
					int i_159_ = anIntArray5295[i_158_];
					int i_160_ = i_159_ - 527900302 * anInt5281 & 0x7;
					int i_161_ = anIntArray5250[i_159_];
					int i_162_ = anIntArray5279[i_159_];
					int i_163_;
					int i_164_;
					if (anInt5281 * -1883533497 == 1) {
						i_163_ = i_162_;
						i_164_ = 512 - i_161_;
					} else if (2 == -1883533497 * anInt5281) {
						i_163_ = 512 - i_161_;
						i_164_ = 512 - i_162_;
					} else if (anInt5281 * -1883533497 == 3) {
						i_163_ = 512 - i_162_;
						i_164_ = i_161_;
					} else {
						i_163_ = i_161_;
						i_164_ = i_162_;
					}
					is_145_[anInt5305 * -1588318079] = i_163_;
					is_146_[anInt5305 * -1588318079] = i_164_;
					if (null != is_150_ && (aBoolArrayArray5256[-312900595 * anInt5302][i_159_])) {
						int i_165_ = i_163_ + (i_143_ << 9);
						int i_166_ = (i_144_ << 9) + i_164_;
						is_150_[anInt5305 * -1588318079] = (class160_152_.method1925(i_165_, i_166_, (byte) 19) - class160.method1925(i_165_, i_166_, (byte) 29));
					}
					if (null != is_151_) {
						if (null != class160_152_ && !(aBoolArrayArray5256[anInt5302 * -312900595][i_159_])) {
							int i_167_ = (i_143_ << 9) + i_163_;
							int i_168_ = i_164_ + (i_144_ << 9);
							is_151_[anInt5305 * -1588318079] = (class160.method1925(i_167_, i_168_, (byte) -31) - class160_152_.method1925(i_167_, i_168_, (byte) 67));
						} else if (class160_153_ != null && !(aBoolArrayArray5278[-312900595 * anInt5302][i_159_])) {
							int i_169_ = (i_143_ << 9) + i_163_;
							int i_170_ = (i_144_ << 9) + i_164_;
							is_151_[-1588318079 * anInt5305] = (class160_153_.method1925(i_169_, i_170_, (byte) -28) - class160.method1925(i_169_, i_170_, (byte) 66));
						}
					}
					if (i_159_ < 8 && (anIntArray5300[i_160_] > class647.anInt8370 * 653672513)) {
						if (is != null)
							is[anInt5305 * -1588318079] = anIntArray5311[i_160_];
						is_149_[-1588318079 * anInt5305] = anIntArray5299[i_160_];
						is_148_[anInt5305 * -1588318079] = anIntArray5292[i_160_];
						is_147_[anInt5305 * -1588318079] = anIntArray5304[i_160_];
					} else {
						if (is != null)
							is[anInt5305 * -1588318079] = i_155_;
						is_148_[-1588318079 * anInt5305] = 22125273 * class647.anInt8365;
						is_149_[-1588318079 * anInt5305] = class647.anInt8372 * 1570850085;
						is_147_[-1588318079 * anInt5305] = 1656326067 * anInt5308;
					}
					anInt5305 += -1480847487;
				}
				anInt5310 += -430284237;
			}
			if (!aBool5298 && 0 == i)
				aClass553_5269.method6706(i_143_, i_144_, class647.anInt8367 * 460440827, 330928968 * class647.anInt8368, class647.anInt8374 * 756434589, -1328631995 * class647.anInt8375, 1439418245 * class647.anInt8376, -2084798233 * class647.anInt8377, (byte) 0);
			if (-312900595 * anInt5302 != 12 && -1 != 1648019033 * class647.anInt8364 && class647.aBool8369)
				aBool5309 = true;
		} else if (aBool5233)
			anInt5310 += -430284237 * anIntArray5303[anInt5302 * -312900595];
		else if (aBool5273)
			anInt5310 += -430284237 * anIntArray5276[-312900595 * anInt5302];
		else
			anInt5310 += anIntArray5272[anInt5302 * -312900595] * -430284237;
	}

	void method5646(Class167 class167, int i, int i_171_, int i_172_, int i_173_, int i_174_, Class20 class20, int i_175_, int i_176_, int i_177_, int i_178_, boolean[] bools, int[] is, int[] is_179_, int[] is_180_, int[] is_181_, int[] is_182_, int[] is_183_, int[] is_184_, int[] is_185_, int[][] is_186_, Class160 class160, Class160 class160_187_, Class160 class160_188_, byte i_189_) {
		if (class20 != null) {
			if (i_176_ == 0)
				i_176_ = i_175_;
			if (0 == i_177_)
				i_177_ = i_175_;
			if (i_178_ == 0)
				i_178_ = i_175_;
			Class20 class20_190_ = ((Class20) aClass34_Sub3_5244.method70(i_175_ - 1, (byte) -93));
			Class20 class20_191_ = (Class20) aClass34_Sub3_5244.method70(i_176_ - 1, (byte) 78);
			Class20 class20_192_ = (Class20) aClass34_Sub3_5244.method70(i_177_ - 1, (byte) -4);
			Class20 class20_193_ = ((Class20) aClass34_Sub3_5244.method70(i_178_ - 1, (byte) -64));
			for (int i_194_ = 0; i_194_ < 1747573597 * anInt5313; i_194_++) {
				boolean bool = false;
				int i_195_;
				if (bools[0 - -1883533497 * anInt5281 & 0x3] && anInt5310 * 563046651 == anIntArray5316[0]) {
					anIntArray5295[0] = anIntArray5315[anInt5310 * 563046651];
					anIntArray5295[1] = 1;
					anIntArray5295[2] = anIntArray5317[anInt5310 * 563046651];
					anIntArray5295[3] = 1;
					anIntArray5295[4] = anIntArray5254[563046651 * anInt5310];
					anIntArray5295[5] = anIntArray5317[563046651 * anInt5310];
					i_195_ = 6;
				} else if (bools[2 - -1883533497 * anInt5281 & 0x3] && 563046651 * anInt5310 == anIntArray5316[2]) {
					anIntArray5295[0] = anIntArray5315[anInt5310 * 563046651];
					anIntArray5295[1] = 5;
					anIntArray5295[2] = anIntArray5317[anInt5310 * 563046651];
					anIntArray5295[3] = 5;
					anIntArray5295[4] = anIntArray5254[anInt5310 * 563046651];
					anIntArray5295[5] = anIntArray5317[563046651 * anInt5310];
					i_195_ = 6;
				} else if (bools[1 - anInt5281 * -1883533497 & 0x3] && anInt5310 * 563046651 == anIntArray5316[1]) {
					anIntArray5295[0] = anIntArray5315[563046651 * anInt5310];
					anIntArray5295[1] = 3;
					anIntArray5295[2] = anIntArray5317[563046651 * anInt5310];
					anIntArray5295[3] = 3;
					anIntArray5295[4] = anIntArray5254[563046651 * anInt5310];
					anIntArray5295[5] = anIntArray5317[563046651 * anInt5310];
					i_195_ = 6;
				} else if (bools[3 - -1883533497 * anInt5281 & 0x3] && anIntArray5316[3] == 563046651 * anInt5310) {
					anIntArray5295[0] = anIntArray5315[563046651 * anInt5310];
					anIntArray5295[1] = 7;
					anIntArray5295[2] = anIntArray5317[anInt5310 * 563046651];
					anIntArray5295[3] = 7;
					anIntArray5295[4] = anIntArray5254[563046651 * anInt5310];
					anIntArray5295[5] = anIntArray5317[563046651 * anInt5310];
					i_195_ = 6;
				} else {
					anIntArray5295[0] = anIntArray5315[anInt5310 * 563046651];
					anIntArray5295[1] = anIntArray5254[563046651 * anInt5310];
					anIntArray5295[2] = anIntArray5317[anInt5310 * 563046651];
					i_195_ = 3;
				}
				for (int i_196_ = 0; i_196_ < i_195_; i_196_++) {
					int i_197_ = anIntArray5295[i_196_];
					int i_198_ = i_197_ - anInt5281 * 527900302 & 0x7;
					int i_199_ = anIntArray5250[i_197_];
					int i_200_ = anIntArray5279[i_197_];
					int i_201_;
					int i_202_;
					if (1 == -1883533497 * anInt5281) {
						i_201_ = i_200_;
						i_202_ = 512 - i_199_;
					} else if (-1883533497 * anInt5281 == 2) {
						i_201_ = 512 - i_199_;
						i_202_ = 512 - i_200_;
					} else if (-1883533497 * anInt5281 == 3) {
						i_201_ = 512 - i_200_;
						i_202_ = i_199_;
					} else {
						i_201_ = i_199_;
						i_202_ = i_200_;
					}
					is_179_[anInt5305 * -1588318079] = i_201_;
					is_180_[anInt5305 * -1588318079] = i_202_;
					if (null != is_184_ && (aBoolArrayArray5256[anInt5302 * -312900595][i_197_])) {
						int i_203_ = (i_171_ << 9) + i_201_;
						int i_204_ = i_202_ + (i_172_ << 9);
						is_184_[-1588318079 * anInt5305] = (class160_187_.method1925(i_203_, i_204_, (byte) -7) - class160.method1925(i_203_, i_204_, (byte) -66));
					}
					if (null != is_185_) {
						if (class160_187_ != null && !(aBoolArrayArray5256[-312900595 * anInt5302][i_197_])) {
							int i_205_ = (i_171_ << 9) + i_201_;
							int i_206_ = i_202_ + (i_172_ << 9);
							is_185_[anInt5305 * -1588318079] = (class160.method1925(i_205_, i_206_, (byte) 68) - class160_187_.method1925(i_205_, i_206_, (byte) -36));
						} else if (class160_188_ != null && !(aBoolArrayArray5278[anInt5302 * -312900595][i_197_])) {
							int i_207_ = (i_171_ << 9) + i_201_;
							int i_208_ = i_202_ + (i_172_ << 9);
							is_185_[-1588318079 * anInt5305] = (class160_188_.method1925(i_207_, i_208_, (byte) 22) - class160.method1925(i_207_, i_208_, (byte) -68));
						}
					}
					if (i_197_ < 8 && anIntArray5300[i_198_] >= 0) {
						if (null != is)
							is[anInt5305 * -1588318079] = anIntArray5311[i_198_];
						is_183_[anInt5305 * -1588318079] = anIntArray5299[i_198_];
						is_182_[-1588318079 * anInt5305] = anIntArray5292[i_198_];
						is_181_[-1588318079 * anInt5305] = anIntArray5304[i_198_];
					} else {
						if (aBool5273 && (aBoolArrayArray5256[anInt5302 * -312900595][i_197_])) {
							is_182_[anInt5305 * -1588318079] = -1092963117 * anInt5306;
							is_183_[anInt5305 * -1588318079] = 1430594073 * anInt5248;
							is_181_[anInt5305 * -1588318079] = anInt5308 * 1656326067;
						} else if (0 == i_201_ && i_202_ == 0) {
							is_181_[-1588318079 * anInt5305] = is_186_[i_171_][i_172_];
							is_182_[anInt5305 * -1588318079] = class20_190_.anInt207 * -542882535;
							is_183_[-1588318079 * anInt5305] = class20_190_.anInt214 * -69580511;
						} else if (0 == i_201_ && i_202_ == 512) {
							is_181_[-1588318079 * anInt5305] = is_186_[i_171_][i_174_];
							is_182_[anInt5305 * -1588318079] = class20_191_.anInt207 * -542882535;
							is_183_[-1588318079 * anInt5305] = -69580511 * class20_191_.anInt214;
						} else if (512 == i_201_ && i_202_ == 512) {
							is_181_[anInt5305 * -1588318079] = is_186_[i_173_][i_174_];
							is_182_[-1588318079 * anInt5305] = -542882535 * class20_192_.anInt207;
							is_183_[-1588318079 * anInt5305] = -69580511 * class20_192_.anInt214;
						} else if (i_201_ == 512 && 0 == i_202_) {
							is_181_[-1588318079 * anInt5305] = is_186_[i_173_][i_172_];
							is_182_[anInt5305 * -1588318079] = class20_193_.anInt207 * -542882535;
							is_183_[anInt5305 * -1588318079] = -69580511 * class20_193_.anInt214;
						} else {
							if (i_201_ < 256) {
								if (i_202_ < 256) {
									is_182_[-1588318079 * anInt5305] = -542882535 * class20_190_.anInt207;
									is_183_[-1588318079 * anInt5305] = class20_190_.anInt214 * -69580511;
								} else {
									is_182_[-1588318079 * anInt5305] = class20_191_.anInt207 * -542882535;
									is_183_[-1588318079 * anInt5305] = -69580511 * class20_191_.anInt214;
								}
							} else if (i_202_ < 256) {
								is_182_[anInt5305 * -1588318079] = class20_193_.anInt207 * -542882535;
								is_183_[anInt5305 * -1588318079] = class20_193_.anInt214 * -69580511;
							} else {
								is_182_[-1588318079 * anInt5305] = -542882535 * class20_192_.anInt207;
								is_183_[-1588318079 * anInt5305] = -69580511 * class20_192_.anInt214;
							}
							int i_209_ = Class34_Sub2.method10303((is_186_[i_171_][i_172_]), (is_186_[i_173_][i_172_]), i_201_ << 7 >> 9, -638671248);
							int i_210_ = Class34_Sub2.method10303((is_186_[i_171_][i_174_]), (is_186_[i_173_][i_174_]), i_201_ << 7 >> 9, -619498748);
							is_181_[-1588318079 * anInt5305] = Class34_Sub2.method10303(i_209_, i_210_, i_202_ << 7 >> 9, -2050548117);
						}
						if (null != is)
							is[anInt5305 * -1588318079] = is_181_[-1588318079 * anInt5305];
					}
					anInt5305 += -1480847487;
				}
				anInt5310 += -430284237;
			}
			if (0 != -312900595 * anInt5302 && class20.aBool209)
				aBool5309 = true;
		}
	}

	void method5647(Class160 class160, Class20 class20, Class647 class647, int i, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_) {
		int i_218_ = class160.method1927(i_211_, i_212_, 1168610090);
		int i_219_ = class160.method1927(i_213_, i_212_, -1349378651);
		int i_220_ = class160.method1927(i_213_, i_214_, 1047090825);
		int i_221_ = class160.method1927(i_211_, i_214_, -574849663);
		boolean bool = aClass455_5232.method5466(i_211_, i_212_, (byte) -10);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_222_ = true;
			if (class20 != null && !class20.aBool210)
				bool_222_ = false;
			else if (0 == i_215_ && 0 != -312900595 * anInt5302)
				bool_222_ = false;
			else if (i_216_ > 0 && class647 != null && !class647.aBool8362)
				bool_222_ = false;
			if (bool_222_ && i_219_ == i_218_ && i_218_ == i_220_ && i_221_ == i_218_)
				aByteArrayArrayArray5252[i][i_211_][i_212_] |= 0x4;
		}
	}

	static {
		anIntArray5280 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
		anIntArray5272 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray5275 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray5276 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray5314 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray5250 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray5279 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBoolArrayArray5256 = (new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false },
				{ true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } });
		aBoolArrayArray5278 = (new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false },
				{ true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false },
				{ true, true, true, true, true, true, true, true, true, true, true, true, true } });
		anIntArrayArray5282 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray5283 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray5240 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBoolArrayArray5285 = (new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } });
		anIntArrayArray5286 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray5287 = (new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
		anIntArrayArray5288 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray5289 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBoolArrayArray5290 = (new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } });
		anIntArrayArray5291 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray5261 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray5293 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray5294 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	public void method5648() {
		aBool5247 = true;
	}

	public void method5649() {
		aBool5247 = true;
	}

	public void method5650() {
		anIntArray5253 = null;
		anIntArray5318 = null;
		anIntArray5255 = null;
		anIntArray5263 = null;
		anIntArray5257 = null;
		aBool5247 = false;
	}

	public void method5651() {
		anIntArray5253 = null;
		anIntArray5318 = null;
		anIntArray5255 = null;
		anIntArray5263 = null;
		anIntArray5257 = null;
		aBool5247 = false;
	}

	public final void method5652(int i, int i_223_, int i_224_, int i_225_) {
		for (int i_226_ = 0; i_226_ < anInt5241 * -1581600933; i_226_++)
			method5636(i_226_, i, i_223_, i_224_, i_225_, 34710999);
	}

	public void method5653(Class167 class167, int[][][] is, int i) {
		for (int i_227_ = 0; i_227_ < -1581600933 * anInt5241; i_227_++) {
			int i_228_ = 0;
			int i_229_ = 0;
			if (!aBool5298) {
				if (aBool5237)
					i_229_ |= 0x8;
				if (aBool5238)
					i_228_ |= 0x2;
				if (anInt5268 * -529914135 != 0) {
					i_228_ |= 0x1;
					i_229_ |= 0x10;
				}
			}
			if (aBool5238)
				i_229_ |= 0x7;
			if (!aBool5231)
				i_229_ |= 0x20;
			int[][] is_230_ = (is != null && i_227_ < is.length ? is[i_227_] : anIntArrayArrayArray5245[i_227_]);
			aClass553_5269.method6704(i_227_, class167.method2162(anInt5242 * 312855363, -183622811 * anInt5284, anIntArrayArrayArray5245[i_227_], is_230_, 512, i_228_, i_229_), 481942727);
		}
	}

	public final void method5654(int i, int i_231_, int i_232_, int i_233_, int i_234_) {
		for (int i_235_ = 0; i_235_ < anInt5241 * -1581600933; i_235_++)
			method5636(i_235_, i, i_231_, i_232_, i_233_, -1018181998);
	}

	public final void method5655(RSByteBuffer class536_sub33, int i, int i_236_, int i_237_, int i_238_, byte i_239_) {
		int i_240_ = i + i_237_;
		int i_241_ = i_236_ + i_238_;
		for (int i_242_ = 0; i_242_ < anInt5241 * -1581600933; i_242_++) {
			for (int i_243_ = 0; i_243_ < 64; i_243_++) {
				for (int i_244_ = 0; i_244_ < 64; i_244_++)
					method5638(class536_sub33, i_242_, i_243_ + i, i_236_ + i_244_, 0, 0, i_243_ + i_240_, i_241_ + i_244_, 0, false, 1903418567);
			}
		}
	}

	final void method5656(Class167 class167, Class647 class647, Class20 class20, int i, int i_245_, int i_246_, int i_247_, short[][] is, byte[][] is_248_, byte[][] is_249_, boolean[] bools, int i_250_) {
		boolean[] bools_251_ = (null != class647 && class647.aBool8371 ? aBoolArrayArray5290[anInt5302 * -312900595] : aBoolArrayArray5285[-312900595 * anInt5302]);
		if (i_245_ > 0) {
			if (i > 0) {
				int i_252_ = is[i - 1][i_245_ - 1] & 0x7fff;
				if (i_252_ > 0) {
					Class647 class647_253_ = (Class647) aClass34_Sub4_5243.method70(i_252_ - 1, (byte) -32);
					if (1648019033 * class647_253_.anInt8364 != -1 && class647_253_.aBool8371) {
						byte i_254_ = is_248_[i - 1][i_245_ - 1];
						int i_255_ = 4 + 2 * is_249_[i - 1][i_245_ - 1] & 0x7;
						int i_256_ = Class461.method5610(class167, class647_253_, (short) 255);
						if (aBoolArrayArray5256[i_254_][i_255_]) {
							anIntArray5304[0] = 1648019033 * class647_253_.anInt8364;
							anIntArray5311[0] = i_256_;
							anIntArray5292[0] = class647_253_.anInt8365 * 22125273;
							anIntArray5299[0] = 1570850085 * class647_253_.anInt8372;
							anIntArray5300[0] = class647_253_.anInt8370 * 653672513;
							anIntArray5301[0] = 256;
						}
					}
				}
			}
			if (i < i_246_ - 1) {
				int i_257_ = is[1 + i][i_245_ - 1] & 0x7fff;
				if (i_257_ > 0) {
					Class647 class647_258_ = (Class647) aClass34_Sub4_5243.method70(i_257_ - 1, (byte) -20);
					if (-1 != class647_258_.anInt8364 * 1648019033 && class647_258_.aBool8371) {
						byte i_259_ = is_248_[i + 1][i_245_ - 1];
						int i_260_ = 6 + 2 * is_249_[i + 1][i_245_ - 1] & 0x7;
						int i_261_ = Class461.method5610(class167, class647_258_, (short) 255);
						if (aBoolArrayArray5256[i_259_][i_260_]) {
							anIntArray5304[2] = class647_258_.anInt8364 * 1648019033;
							anIntArray5311[2] = i_261_;
							anIntArray5292[2] = 22125273 * class647_258_.anInt8365;
							anIntArray5299[2] = 1570850085 * class647_258_.anInt8372;
							anIntArray5300[2] = class647_258_.anInt8370 * 653672513;
							anIntArray5301[2] = 512;
						}
					}
				}
			}
		}
		if (i_245_ < i_247_ - 1) {
			if (i > 0) {
				int i_262_ = is[i - 1][i_245_ + 1] & 0x7fff;
				if (i_262_ > 0) {
					Class647 class647_263_ = (Class647) aClass34_Sub4_5243.method70(i_262_ - 1, (byte) -105);
					if (class647_263_.anInt8364 * 1648019033 != -1 && class647_263_.aBool8371) {
						byte i_264_ = is_248_[i - 1][1 + i_245_];
						int i_265_ = 2 + 2 * is_249_[i - 1][1 + i_245_] & 0x7;
						int i_266_ = Class461.method5610(class167, class647_263_, (short) 255);
						if (aBoolArrayArray5256[i_264_][i_265_]) {
							anIntArray5304[6] = class647_263_.anInt8364 * 1648019033;
							anIntArray5311[6] = i_266_;
							anIntArray5292[6] = 22125273 * class647_263_.anInt8365;
							anIntArray5299[6] = 1570850085 * class647_263_.anInt8372;
							anIntArray5300[6] = 653672513 * class647_263_.anInt8370;
							anIntArray5301[6] = 64;
						}
					}
				}
			}
			if (i < i_246_ - 1) {
				int i_267_ = is[1 + i][i_245_ + 1] & 0x7fff;
				if (i_267_ > 0) {
					Class647 class647_268_ = ((Class647) aClass34_Sub4_5243.method70(i_267_ - 1, (byte) 75));
					if (class647_268_.anInt8364 * 1648019033 != -1 && class647_268_.aBool8371) {
						byte i_269_ = is_248_[i + 1][1 + i_245_];
						int i_270_ = 0 + 2 * is_249_[i + 1][1 + i_245_] & 0x7;
						int i_271_ = Class461.method5610(class167, class647_268_, (short) 255);
						if (aBoolArrayArray5256[i_269_][i_270_]) {
							anIntArray5304[4] = class647_268_.anInt8364 * 1648019033;
							anIntArray5311[4] = i_271_;
							anIntArray5292[4] = 22125273 * class647_268_.anInt8365;
							anIntArray5299[4] = 1570850085 * class647_268_.anInt8372;
							anIntArray5300[4] = class647_268_.anInt8370 * 653672513;
							anIntArray5301[4] = 128;
						}
					}
				}
			}
		}
		if (i_245_ > 0) {
			int i_272_ = is[i][i_245_ - 1] & 0x7fff;
			if (i_272_ > 0) {
				Class647 class647_273_ = ((Class647) aClass34_Sub4_5243.method70(i_272_ - 1, (byte) -37));
				if (-1 != class647_273_.anInt8364 * 1648019033) {
					byte i_274_ = is_248_[i][i_245_ - 1];
					int i_275_ = is_249_[i][i_245_ - 1];
					if (class647_273_.aBool8371) {
						int i_276_ = 2;
						int i_277_ = 4 + i_275_ * 2;
						int i_278_ = Class461.method5610(class167, class647_273_, (short) 255);
						for (int i_279_ = 0; i_279_ < 3; i_279_++) {
							i_277_ &= 0x7;
							i_276_ &= 0x7;
							if (aBoolArrayArray5256[i_274_][i_277_] && (anIntArray5300[i_276_] <= class647_273_.anInt8370 * 653672513)) {
								anIntArray5304[i_276_] = 1648019033 * class647_273_.anInt8364;
								anIntArray5311[i_276_] = i_278_;
								anIntArray5292[i_276_] = class647_273_.anInt8365 * 22125273;
								anIntArray5299[i_276_] = 1570850085 * class647_273_.anInt8372;
								if (anIntArray5300[i_276_] == class647_273_.anInt8370 * 653672513)
									anIntArray5301[i_276_] |= 0x20;
								else
									anIntArray5301[i_276_] = 32;
								anIntArray5300[i_276_] = 653672513 * class647_273_.anInt8370;
							}
							i_277_++;
							i_276_--;
						}
						if (!bools_251_[0 + anInt5281 * -1883533497 & 0x3])
							bools[0] = (aBoolArrayArray5290[i_274_][2 + i_275_ & 0x3]);
					} else if (!bools_251_[-1883533497 * anInt5281 + 0 & 0x3])
						bools[0] = aBoolArrayArray5285[i_274_][i_275_ + 2 & 0x3];
				}
			}
		}
		if (i_245_ < i_247_ - 1) {
			int i_280_ = is[i][i_245_ + 1] & 0x7fff;
			if (i_280_ > 0) {
				Class647 class647_281_ = ((Class647) aClass34_Sub4_5243.method70(i_280_ - 1, (byte) -23));
				if (-1 != class647_281_.anInt8364 * 1648019033) {
					byte i_282_ = is_248_[i][1 + i_245_];
					int i_283_ = is_249_[i][1 + i_245_];
					if (class647_281_.aBool8371) {
						int i_284_ = 4;
						int i_285_ = 2 + 2 * i_283_;
						int i_286_ = Class461.method5610(class167, class647_281_, (short) 255);
						for (int i_287_ = 0; i_287_ < 3; i_287_++) {
							i_285_ &= 0x7;
							i_284_ &= 0x7;
							if (aBoolArrayArray5256[i_282_][i_285_] && (anIntArray5300[i_284_] <= 653672513 * class647_281_.anInt8370)) {
								anIntArray5304[i_284_] = class647_281_.anInt8364 * 1648019033;
								anIntArray5311[i_284_] = i_286_;
								anIntArray5292[i_284_] = class647_281_.anInt8365 * 22125273;
								anIntArray5299[i_284_] = class647_281_.anInt8372 * 1570850085;
								if (653672513 * class647_281_.anInt8370 == anIntArray5300[i_284_])
									anIntArray5301[i_284_] |= 0x10;
								else
									anIntArray5301[i_284_] = 16;
								anIntArray5300[i_284_] = 653672513 * class647_281_.anInt8370;
							}
							i_285_--;
							i_284_++;
						}
						if (!bools_251_[anInt5281 * -1883533497 + 2 & 0x3])
							bools[2] = (aBoolArrayArray5290[i_282_][i_283_ + 0 & 0x3]);
					} else if (!bools_251_[-1883533497 * anInt5281 + 2 & 0x3])
						bools[2] = aBoolArrayArray5285[i_282_][i_283_ + 0 & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_288_ = is[i - 1][i_245_] & 0x7fff;
			if (i_288_ > 0) {
				Class647 class647_289_ = ((Class647) aClass34_Sub4_5243.method70(i_288_ - 1, (byte) -42));
				if (1648019033 * class647_289_.anInt8364 != -1) {
					byte i_290_ = is_248_[i - 1][i_245_];
					int i_291_ = is_249_[i - 1][i_245_];
					if (class647_289_.aBool8371) {
						int i_292_ = 6;
						int i_293_ = 2 * i_291_ + 4;
						int i_294_ = Class461.method5610(class167, class647_289_, (short) 255);
						for (int i_295_ = 0; i_295_ < 3; i_295_++) {
							i_293_ &= 0x7;
							i_292_ &= 0x7;
							if (aBoolArrayArray5256[i_290_][i_293_] && (anIntArray5300[i_292_] <= class647_289_.anInt8370 * 653672513)) {
								anIntArray5304[i_292_] = 1648019033 * class647_289_.anInt8364;
								anIntArray5311[i_292_] = i_294_;
								anIntArray5292[i_292_] = 22125273 * class647_289_.anInt8365;
								anIntArray5299[i_292_] = 1570850085 * class647_289_.anInt8372;
								if (anIntArray5300[i_292_] == class647_289_.anInt8370 * 653672513)
									anIntArray5301[i_292_] |= 0x8;
								else
									anIntArray5301[i_292_] = 8;
								anIntArray5300[i_292_] = 653672513 * class647_289_.anInt8370;
							}
							i_293_--;
							i_292_++;
						}
						if (!bools_251_[3 + -1883533497 * anInt5281 & 0x3])
							bools[3] = (aBoolArrayArray5290[i_290_][i_291_ + 1 & 0x3]);
					} else if (!bools_251_[-1883533497 * anInt5281 + 3 & 0x3])
						bools[3] = aBoolArrayArray5285[i_290_][i_291_ + 1 & 0x3];
				}
			}
		}
		if (i < i_246_ - 1) {
			int i_296_ = is[1 + i][i_245_] & 0x7fff;
			if (i_296_ > 0) {
				Class647 class647_297_ = ((Class647) aClass34_Sub4_5243.method70(i_296_ - 1, (byte) -103));
				if (-1 != 1648019033 * class647_297_.anInt8364) {
					byte i_298_ = is_248_[1 + i][i_245_];
					int i_299_ = is_249_[i + 1][i_245_];
					if (class647_297_.aBool8371) {
						int i_300_ = 4;
						int i_301_ = i_299_ * 2 + 6;
						int i_302_ = Class461.method5610(class167, class647_297_, (short) 255);
						for (int i_303_ = 0; i_303_ < 3; i_303_++) {
							i_301_ &= 0x7;
							i_300_ &= 0x7;
							if (aBoolArrayArray5256[i_298_][i_301_] && (anIntArray5300[i_300_] <= 653672513 * class647_297_.anInt8370)) {
								anIntArray5304[i_300_] = class647_297_.anInt8364 * 1648019033;
								anIntArray5311[i_300_] = i_302_;
								anIntArray5292[i_300_] = 22125273 * class647_297_.anInt8365;
								anIntArray5299[i_300_] = 1570850085 * class647_297_.anInt8372;
								if (anIntArray5300[i_300_] == 653672513 * class647_297_.anInt8370)
									anIntArray5301[i_300_] |= 0x4;
								else
									anIntArray5301[i_300_] = 4;
								anIntArray5300[i_300_] = class647_297_.anInt8370 * 653672513;
							}
							i_301_++;
							i_300_--;
						}
						if (!bools_251_[-1883533497 * anInt5281 + 1 & 0x3])
							bools[1] = (aBoolArrayArray5290[i_298_][i_299_ + 3 & 0x3]);
					} else if (!bools_251_[1 + -1883533497 * anInt5281 & 0x3])
						bools[1] = aBoolArrayArray5285[i_298_][3 + i_299_ & 0x3];
				}
			}
		}
		if (class647 != null && class647.aBool8371) {
			int i_304_ = Class461.method5610(class167, class647, (short) 255);
			for (int i_305_ = 0; i_305_ < 8; i_305_++) {
				int i_306_ = i_305_ - 527900302 * anInt5281 & 0x7;
				if (aBoolArrayArray5256[-312900595 * anInt5302][i_305_] && (anIntArray5300[i_306_] <= class647.anInt8370 * 653672513)) {
					anIntArray5304[i_306_] = 1648019033 * class647.anInt8364;
					anIntArray5311[i_306_] = i_304_;
					anIntArray5292[i_306_] = 22125273 * class647.anInt8365;
					anIntArray5299[i_306_] = class647.anInt8372 * 1570850085;
					if (653672513 * class647.anInt8370 == anIntArray5300[i_306_])
						anIntArray5301[i_306_] |= 0x2;
					else
						anIntArray5301[i_306_] = 2;
					anIntArray5300[i_306_] = 653672513 * class647.anInt8370;
				}
			}
		}
	}

	void method5657(Class167 class167, Class160 class160, int i, int[][] is, Class160 class160_307_, Class160 class160_308_, int i_309_) {
		byte[][] is_310_ = aByteArrayArrayArray5267[i];
		byte[][] is_311_ = aByteArrayArrayArray5249[i];
		short[][] is_312_ = aShortArrayArrayArray5297[i];
		short[][] is_313_ = aShortArrayArrayArray5251[i];
		boolean[] bools = new boolean[4];
		for (int i_314_ = 0; i_314_ < 312855363 * anInt5242; i_314_++) {
			int i_315_ = i_314_ < 312855363 * anInt5242 - 1 ? 1 + i_314_ : i_314_;
			for (int i_316_ = 0; i_316_ < -183622811 * anInt5284; i_316_++) {
				int i_317_ = (i_316_ < -183622811 * anInt5284 - 1 ? 1 + i_316_ : i_316_);
				anInt5302 = is_310_[i_314_][i_316_] * -483366203;
				anInt5281 = 1176201847 * is_311_[i_314_][i_316_];
				int i_318_ = is_313_[i_314_][i_316_] & 0x7fff;
				int i_319_ = is_312_[i_314_][i_316_] & 0x7fff;
				if (i_318_ != 0 || 0 != i_319_) {
					Class647 class647 = (Class647) (i_318_ != 0 ? aClass34_Sub4_5243.method70(i_318_ - 1, (byte) -33) : null);
					Class20 class20 = (Class20) (0 != i_319_ ? aClass34_Sub3_5244.method70(i_319_ - 1, (byte) -37) : null);
					if (anInt5302 * -312900595 == 0 && class647 == null)
						anInt5302 = -1505427140;
					aBool5309 = false;
					aBool5273 = false;
					boolean[] bools_320_ = bools;
					boolean[] bools_321_ = bools;
					boolean[] bools_322_ = bools;
					bools[3] = false;
					bools_322_[2] = false;
					bools_321_[1] = false;
					bools_320_[0] = false;
					Class647 class647_323_ = class647;
					if (null != class647) {
						if (-1 == 1648019033 * class647.anInt8364 && -1198548799 * class647.anInt8366 == -1) {
							class647_323_ = class647;
							class647 = null;
						} else if (class20 != null && anInt5302 * -312900595 != 0)
							aBool5273 = class647.aBool8371;
					}
					anInt5281 = method5642(i_319_, i_314_, i_316_, i_315_, i_317_, class160, is_312_, (byte) 12) * 1176201847;
					for (int i_324_ = 0; i_324_ < 13; i_324_++) {
						anIntArray5300[i_324_] = -1;
						anIntArray5301[i_324_] = 1;
					}
					method5643(class167, class647, class20, i_314_, i_316_, is_310_, is_311_, is_313_, bools, (byte) 0);
					aBool5233 = (!aBool5273 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method5644(class647, class20, 973388109);
					int i_325_ = anInt5313 * 1747573597 + -1329679875 * anInt5274;
					if (i_325_ <= 0)
						aClass553_5269.method6699(i, i_314_, i_316_, (byte) 7);
					else {
						if (bools[0])
							i_325_++;
						if (bools[2])
							i_325_++;
						if (bools[1])
							i_325_++;
						if (bools[3])
							i_325_++;
						anInt5310 = 0;
						anInt5305 = 0;
						int i_326_ = 3 * i_325_;
						int[] is_327_ = aBool5312 ? new int[i_326_] : null;
						int[] is_328_ = new int[i_326_];
						int[] is_329_ = new int[i_326_];
						int[] is_330_ = new int[i_326_];
						int[] is_331_ = new int[i_326_];
						int[] is_332_ = new int[i_326_];
						int[] is_333_ = class160_308_ != null ? new int[i_326_] : null;
						int[] is_334_ = (class160_308_ != null || null != class160_307_ ? new int[i_326_] : null);
						for (int i_335_ = 0; i_335_ < i_326_; i_335_++)
							is_331_[i_335_] = -1;
						method5645(class167, i, i_314_, i_316_, class647, bools, is_327_, is_328_, is_329_, is_330_, is_331_, is_332_, is_333_, is_334_, class160, class160_308_, class160_307_, -580580653);
						int i_336_ = is_312_[i_314_][i_317_] & 0x7fff;
						int i_337_ = is_312_[i_315_][i_317_] & 0x7fff;
						int i_338_ = is_312_[i_315_][i_316_] & 0x7fff;
						method5646(class167, i, i_314_, i_316_, i_315_, i_317_, class20, i_319_, i_336_, i_337_, i_338_, bools, is_327_, is_328_, is_329_, is_330_, is_331_, is_332_, is_333_, is_334_, is, class160, class160_308_, class160_307_, (byte) 3);
						method5647(class160, class20, class647_323_, i, i_314_, i_316_, i_315_, i_317_, i_319_, i_318_, 1836496750);
						Class175 class175 = new Class175();
						if (aBool5298) {
							class175.anInt1932 = (aClass553_5269.method6702(i_314_, i_316_, (byte) 66) * -158484941);
							class175.anInt1934 = (aClass553_5269.method6701(i_314_, i_316_, -682989806) * 261072557);
							class175.anInt1930 = (aClass553_5269.method6703(i_314_, i_316_, (byte) 24) * -1714306347);
							class175.anInt1928 = (aClass553_5269.method6767(i_314_, i_316_, 1549917198) * 1238295881);
							class175.anInt1933 = (aClass553_5269.method6757(i_314_, i_316_, 2124922125) * 1127551047);
							class175.anInt1929 = (aClass553_5269.method6705(i_314_, i_316_, (byte) 3) * -284212951);
						}
						class160.method1920(i_314_, i_316_, is_328_, is_333_, is_329_, is_334_, is_330_, is_327_, is_331_, is_332_, class175, aBool5309);
						aClass553_5269.method6699(i, i_314_, i_316_, (byte) 56);
					}
				}
			}
		}
	}

	public void method5658(int i) {
		aBool5247 = true;
	}

	Class465(Class553 class553, int i, int i_339_, int i_340_, boolean bool, Class34_Sub4 class34_sub4, Class34_Sub3 class34_sub3, Class455 class455) {
		aBool5237 = false;
		aBool5238 = false;
		aBool5239 = false;
		aBool5231 = false;
		anIntArray5295 = new int[6];
		anIntArray5304 = new int[13];
		anIntArray5311 = new int[13];
		anIntArray5292 = new int[13];
		anIntArray5299 = new int[13];
		anIntArray5300 = new int[13];
		anIntArray5301 = new int[13];
		anInt5310 = 0;
		anInt5305 = 0;
		anIntArray5316 = null;
		aClass553_5269 = class553;
		anInt5241 = i * -782898989;
		anInt5242 = i_339_ * -1294755477;
		anInt5284 = i_340_ * -120891795;
		aBool5298 = bool;
		aClass34_Sub4_5243 = class34_sub4;
		aClass34_Sub3_5244 = class34_sub3;
		aClass455_5232 = class455;
		aShortArrayArrayArray5297 = (new short[-1581600933 * anInt5241][312855363 * anInt5242][anInt5284 * -183622811]);
		aShortArrayArrayArray5251 = (new short[-1581600933 * anInt5241][anInt5242 * 312855363][-183622811 * anInt5284]);
		aByteArrayArrayArray5267 = (new byte[anInt5241 * -1581600933][anInt5242 * 312855363][-183622811 * anInt5284]);
		aByteArrayArrayArray5249 = (new byte[-1581600933 * anInt5241][312855363 * anInt5242][-183622811 * anInt5284]);
		anIntArrayArrayArray5245 = (new int[anInt5241 * -1581600933][1 + 312855363 * anInt5242][1 + -183622811 * anInt5284]);
		aByteArrayArrayArray5252 = (new byte[anInt5241 * -1581600933][anInt5242 * 312855363 + 1][1 + anInt5284 * -183622811]);
	}

	static final int method5659(int i, int i_341_, int i_342_) {
		int i_343_ = i / i_342_;
		int i_344_ = i & i_342_ - 1;
		int i_345_ = i_341_ / i_342_;
		int i_346_ = i_341_ & i_342_ - 1;
		int i_347_ = Class315.method4215(i_343_, i_345_, 1329576603);
		int i_348_ = Class315.method4215(i_343_ + 1, i_345_, 1406309131);
		int i_349_ = Class315.method4215(i_343_, i_345_ + 1, 2073586629);
		int i_350_ = Class315.method4215(i_343_ + 1, 1 + i_345_, 743319850);
		int i_351_ = Class265.method3690(i_347_, i_348_, i_344_, i_342_, -1034272579);
		int i_352_ = Class265.method3690(i_349_, i_350_, i_344_, i_342_, -1335859455);
		return Class265.method3690(i_351_, i_352_, i_346_, i_342_, -1510394195);
	}

	static final int method5660(int i, int i_353_) {
		int i_354_ = i + 57 * i_353_;
		i_354_ = i_354_ << 13 ^ i_354_;
		int i_355_ = (1376312589 + (789221 + 15731 * (i_354_ * i_354_)) * i_354_ & 0x7fffffff);
		return i_355_ >> 19 & 0xff;
	}

	static final int method5661(int i, int i_356_) {
		int i_357_ = i + 57 * i_356_;
		i_357_ = i_357_ << 13 ^ i_357_;
		int i_358_ = (1376312589 + (789221 + 15731 * (i_357_ * i_357_)) * i_357_ & 0x7fffffff);
		return i_358_ >> 19 & 0xff;
	}

	static final void method5662(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class320.method4244(class251, class234, class668, 1360337775);
	}

	static final void method5663(Class668 class668, int i) {
		if (client.anInt11160 * 423156687 >= 2)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11160 * 423156687;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method5664(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (611144047 * Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12186);
	}

	static final void method5665(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_359_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_360_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_359_ | i_360_;
	}

	static final void method5666(Class668 class668, int i) throws Exception_Sub3 {
		class668.anInt8542 -= -1349181388;
		float f = (float) class668.anIntArray8541[class668.anInt8542 * 1867269829];
		float f_361_ = (float) (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1]);
		float f_362_ = (float) (class668.anIntArray8541[2 + class668.anInt8542 * 1867269829]);
		float f_363_ = ((float) (class668.anIntArray8541[1867269829 * class668.anInt8542 + 3]) / 1000.0F);
		Class683.aClass301_Sub1_8651.method4048(Class436.method5257(f, f_361_, f_362_), f_363_, 2061019090);
	}

	public static float method5667(Class425 class425, int i) {
		Class436 class436 = Class436.method5257(0.0F, 0.0F, 1.0F);
		class436.method5263(class425);
		double d = Math.atan2((double) class436.aFloat4850, (double) class436.aFloat4853);
		class436.method5239();
		if (d < 0.0)
			d = 3.141592653589793 + d + 3.141592653589793;
		return (float) d;
	}

	static boolean method5668(int i, byte i_364_) {
		if (9 == i || 10 == i || 11 == i || 12 == i || i == 13 || i == 1003)
			return true;
		if (8 == i)
			return true;
		return false;
	}
}
