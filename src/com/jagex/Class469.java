/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class469 {
	Class281 aClass281_5332;
	int[] anIntArray5333;
	byte[] aByteArray5334;
	int[] anIntArray5335;
	int anInt5336;
	int[] anIntArray5337;
	int[] anIntArray5338;
	int anInt5339;
	int anInt5340;
	int anInt5341;
	int[] anIntArray5342;
	byte[][] aByteArrayArray5343;
	int[] anIntArray5344;
	int[] anIntArray5345;
	int[][] anIntArrayArray5346;
	int[] anIntArray5347;
	int[][] anIntArrayArray5348;
	static final int anInt5349 = 7;
	Class281[] aClass281Array5350;
	int[] anIntArray5351;

	void method7691(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(Class305.method5591(is, 2059799121));
		int i = class527_sub38.readUnsignedByte();
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			anInt5339 = class527_sub38.readInt() * 2008380913;
		else
			anInt5339 = 0;
		int i_0_ = class527_sub38.readUnsignedByte();
		boolean bool = (i_0_ & 0x1) != 0;
		boolean bool_1_ = (i_0_ & 0x2) != 0;
		boolean bool_2_ = (i_0_ & 0x4) != 0;
		boolean bool_3_ = 0 != (i_0_ & 0x8);
		if (i >= 7)
			anInt5336 = class527_sub38.method16526(809429921) * 665966645;
		else
			anInt5336 = class527_sub38.readUnsignedShort() * 665966645;
		int i_4_ = 0;
		int i_5_ = -1;
		anIntArray5337 = new int[-1019954659 * anInt5336];
		if (i >= 7) {
			for (int i_6_ = 0; i_6_ < -1019954659 * anInt5336; i_6_++) {
				anIntArray5337[i_6_] = i_4_ += class527_sub38.method16526(809429921);
				if (anIntArray5337[i_6_] > i_5_)
					i_5_ = anIntArray5337[i_6_];
			}
		} else {
			for (int i_7_ = 0; i_7_ < anInt5336 * -1019954659; i_7_++) {
				anIntArray5337[i_7_] = i_4_ += class527_sub38.readUnsignedShort();
				if (anIntArray5337[i_7_] > i_5_)
					i_5_ = anIntArray5337[i_7_];
			}
		}
		anInt5340 = (1 + i_5_) * -567994083;
		anIntArray5347 = new int[309096757 * anInt5340];
		if (bool_3_)
			anIntArray5342 = new int[anInt5340 * 309096757];
		if (bool_1_)
			aByteArrayArray5343 = new byte[309096757 * anInt5340][];
		anIntArray5333 = new int[309096757 * anInt5340];
		anIntArray5335 = new int[anInt5340 * 309096757];
		anIntArrayArray5348 = new int[anInt5340 * 309096757][];
		anIntArray5351 = new int[309096757 * anInt5340];
		if (bool) {
			anIntArray5338 = new int[anInt5340 * 309096757];
			for (int i_8_ = 0; i_8_ < anInt5340 * 309096757; i_8_++)
				anIntArray5338[i_8_] = -1;
			for (int i_9_ = 0; i_9_ < anInt5336 * -1019954659; i_9_++)
				anIntArray5338[anIntArray5337[i_9_]] = class527_sub38.readInt();
			aClass281_5332 = new Class281(anIntArray5338);
		}
		for (int i_10_ = 0; i_10_ < -1019954659 * anInt5336; i_10_++)
			anIntArray5347[anIntArray5337[i_10_]] = class527_sub38.readInt();
		if (bool_3_) {
			for (int i_11_ = 0; i_11_ < anInt5336 * -1019954659; i_11_++)
				anIntArray5342[i_11_] = class527_sub38.readInt();
		}
		if (bool_1_) {
			for (int i_12_ = 0; i_12_ < -1019954659 * anInt5336; i_12_++) {
				byte[] is_13_ = new byte[64];
				class527_sub38.method16460(is_13_, 0, 64, -1969674760);
				aByteArrayArray5343[anIntArray5337[i_12_]] = is_13_;
			}
		}
		if (bool_2_) {
			anIntArray5344 = new int[309096757 * anInt5340];
			anIntArray5345 = new int[anInt5340 * 309096757];
			for (int i_14_ = 0; i_14_ < anInt5336 * -1019954659; i_14_++) {
				anIntArray5344[anIntArray5337[i_14_]] = class527_sub38.readInt();
				anIntArray5345[anIntArray5337[i_14_]] = class527_sub38.readInt();
			}
		}
		for (int i_15_ = 0; i_15_ < anInt5336 * -1019954659; i_15_++)
			anIntArray5333[anIntArray5337[i_15_]] = class527_sub38.readInt();
		if (i >= 7) {
			for (int i_16_ = 0; i_16_ < -1019954659 * anInt5336; i_16_++)
				anIntArray5335[anIntArray5337[i_16_]] = class527_sub38.method16526(809429921);
			for (int i_17_ = 0; i_17_ < anInt5336 * -1019954659; i_17_++) {
				int i_18_ = anIntArray5337[i_17_];
				int i_19_ = anIntArray5335[i_18_];
				i_4_ = 0;
				int i_20_ = -1;
				anIntArrayArray5348[i_18_] = new int[i_19_];
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					int i_22_ = (anIntArrayArray5348[i_18_][i_21_] = i_4_ += class527_sub38.method16526(809429921));
					if (i_22_ > i_20_)
						i_20_ = i_22_;
				}
				anIntArray5351[i_18_] = i_20_ + 1;
				if (i_20_ + 1 == i_19_)
					anIntArrayArray5348[i_18_] = null;
			}
		} else {
			for (int i_23_ = 0; i_23_ < anInt5336 * -1019954659; i_23_++)
				anIntArray5335[anIntArray5337[i_23_]] = class527_sub38.readUnsignedShort();
			for (int i_24_ = 0; i_24_ < -1019954659 * anInt5336; i_24_++) {
				int i_25_ = anIntArray5337[i_24_];
				int i_26_ = anIntArray5335[i_25_];
				i_4_ = 0;
				int i_27_ = -1;
				anIntArrayArray5348[i_25_] = new int[i_26_];
				for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
					int i_29_ = (anIntArrayArray5348[i_25_][i_28_] = i_4_ += class527_sub38.readUnsignedShort());
					if (i_29_ > i_27_)
						i_27_ = i_29_;
				}
				anIntArray5351[i_25_] = 1 + i_27_;
				if (i_26_ == 1 + i_27_)
					anIntArrayArray5348[i_25_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5346 = new int[1 + i_5_][];
			aClass281Array5350 = new Class281[i_5_ + 1];
			for (int i_30_ = 0; i_30_ < -1019954659 * anInt5336; i_30_++) {
				int i_31_ = anIntArray5337[i_30_];
				int i_32_ = anIntArray5335[i_31_];
				anIntArrayArray5346[i_31_] = new int[anIntArray5351[i_31_]];
				for (int i_33_ = 0; i_33_ < anIntArray5351[i_31_]; i_33_++)
					anIntArrayArray5346[i_31_][i_33_] = -1;
				for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
					int i_35_;
					if (null != anIntArrayArray5348[i_31_])
						i_35_ = anIntArrayArray5348[i_31_][i_34_];
					else
						i_35_ = i_34_;
					anIntArrayArray5346[i_31_][i_35_] = class527_sub38.readInt();
				}
				aClass281Array5350[i_31_] = new Class281(anIntArrayArray5346[i_31_]);
			}
		}
	}

	Class469(byte[] is, int i, byte[] is_36_) {
		anInt5341 = Class704.method14311(is, is.length, -373504254) * -462924679;
		if (i != anInt5341 * 620090825)
			throw new RuntimeException();
		if (null != is_36_) {
			if (is_36_.length != 64)
				throw new RuntimeException();
			aByteArray5334 = Class693.method14074(is, 0, is.length, -2049072676);
			for (int i_37_ = 0; i_37_ < 64; i_37_++) {
				if (aByteArray5334[i_37_] != is_36_[i_37_])
					throw new RuntimeException();
			}
		}
		method7693(is, 1796883415);
	}

	void method7692(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(Class305.method5591(is, 1346456511));
		int i = class527_sub38.readUnsignedByte();
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			anInt5339 = class527_sub38.readInt() * 2008380913;
		else
			anInt5339 = 0;
		int i_38_ = class527_sub38.readUnsignedByte();
		boolean bool = (i_38_ & 0x1) != 0;
		boolean bool_39_ = (i_38_ & 0x2) != 0;
		boolean bool_40_ = (i_38_ & 0x4) != 0;
		boolean bool_41_ = 0 != (i_38_ & 0x8);
		if (i >= 7)
			anInt5336 = class527_sub38.method16526(809429921) * 665966645;
		else
			anInt5336 = class527_sub38.readUnsignedShort() * 665966645;
		int i_42_ = 0;
		int i_43_ = -1;
		anIntArray5337 = new int[-1019954659 * anInt5336];
		if (i >= 7) {
			for (int i_44_ = 0; i_44_ < -1019954659 * anInt5336; i_44_++) {
				anIntArray5337[i_44_] = i_42_ += class527_sub38.method16526(809429921);
				if (anIntArray5337[i_44_] > i_43_)
					i_43_ = anIntArray5337[i_44_];
			}
		} else {
			for (int i_45_ = 0; i_45_ < anInt5336 * -1019954659; i_45_++) {
				anIntArray5337[i_45_] = i_42_ += class527_sub38.readUnsignedShort();
				if (anIntArray5337[i_45_] > i_43_)
					i_43_ = anIntArray5337[i_45_];
			}
		}
		anInt5340 = (1 + i_43_) * -567994083;
		anIntArray5347 = new int[309096757 * anInt5340];
		if (bool_41_)
			anIntArray5342 = new int[anInt5340 * 309096757];
		if (bool_39_)
			aByteArrayArray5343 = new byte[309096757 * anInt5340][];
		anIntArray5333 = new int[309096757 * anInt5340];
		anIntArray5335 = new int[anInt5340 * 309096757];
		anIntArrayArray5348 = new int[anInt5340 * 309096757][];
		anIntArray5351 = new int[309096757 * anInt5340];
		if (bool) {
			anIntArray5338 = new int[anInt5340 * 309096757];
			for (int i_46_ = 0; i_46_ < anInt5340 * 309096757; i_46_++)
				anIntArray5338[i_46_] = -1;
			for (int i_47_ = 0; i_47_ < anInt5336 * -1019954659; i_47_++)
				anIntArray5338[anIntArray5337[i_47_]] = class527_sub38.readInt();
			aClass281_5332 = new Class281(anIntArray5338);
		}
		for (int i_48_ = 0; i_48_ < -1019954659 * anInt5336; i_48_++)
			anIntArray5347[anIntArray5337[i_48_]] = class527_sub38.readInt();
		if (bool_41_) {
			for (int i_49_ = 0; i_49_ < anInt5336 * -1019954659; i_49_++)
				anIntArray5342[i_49_] = class527_sub38.readInt();
		}
		if (bool_39_) {
			for (int i_50_ = 0; i_50_ < -1019954659 * anInt5336; i_50_++) {
				byte[] is_51_ = new byte[64];
				class527_sub38.method16460(is_51_, 0, 64, -1765171604);
				aByteArrayArray5343[anIntArray5337[i_50_]] = is_51_;
			}
		}
		if (bool_40_) {
			anIntArray5344 = new int[309096757 * anInt5340];
			anIntArray5345 = new int[anInt5340 * 309096757];
			for (int i_52_ = 0; i_52_ < anInt5336 * -1019954659; i_52_++) {
				anIntArray5344[anIntArray5337[i_52_]] = class527_sub38.readInt();
				anIntArray5345[anIntArray5337[i_52_]] = class527_sub38.readInt();
			}
		}
		for (int i_53_ = 0; i_53_ < anInt5336 * -1019954659; i_53_++)
			anIntArray5333[anIntArray5337[i_53_]] = class527_sub38.readInt();
		if (i >= 7) {
			for (int i_54_ = 0; i_54_ < -1019954659 * anInt5336; i_54_++)
				anIntArray5335[anIntArray5337[i_54_]] = class527_sub38.method16526(809429921);
			for (int i_55_ = 0; i_55_ < anInt5336 * -1019954659; i_55_++) {
				int i_56_ = anIntArray5337[i_55_];
				int i_57_ = anIntArray5335[i_56_];
				i_42_ = 0;
				int i_58_ = -1;
				anIntArrayArray5348[i_56_] = new int[i_57_];
				for (int i_59_ = 0; i_59_ < i_57_; i_59_++) {
					int i_60_ = (anIntArrayArray5348[i_56_][i_59_] = i_42_ += class527_sub38.method16526(809429921));
					if (i_60_ > i_58_)
						i_58_ = i_60_;
				}
				anIntArray5351[i_56_] = i_58_ + 1;
				if (i_58_ + 1 == i_57_)
					anIntArrayArray5348[i_56_] = null;
			}
		} else {
			for (int i_61_ = 0; i_61_ < anInt5336 * -1019954659; i_61_++)
				anIntArray5335[anIntArray5337[i_61_]] = class527_sub38.readUnsignedShort();
			for (int i_62_ = 0; i_62_ < -1019954659 * anInt5336; i_62_++) {
				int i_63_ = anIntArray5337[i_62_];
				int i_64_ = anIntArray5335[i_63_];
				i_42_ = 0;
				int i_65_ = -1;
				anIntArrayArray5348[i_63_] = new int[i_64_];
				for (int i_66_ = 0; i_66_ < i_64_; i_66_++) {
					int i_67_ = (anIntArrayArray5348[i_63_][i_66_] = i_42_ += class527_sub38.readUnsignedShort());
					if (i_67_ > i_65_)
						i_65_ = i_67_;
				}
				anIntArray5351[i_63_] = 1 + i_65_;
				if (i_64_ == 1 + i_65_)
					anIntArrayArray5348[i_63_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5346 = new int[1 + i_43_][];
			aClass281Array5350 = new Class281[i_43_ + 1];
			for (int i_68_ = 0; i_68_ < -1019954659 * anInt5336; i_68_++) {
				int i_69_ = anIntArray5337[i_68_];
				int i_70_ = anIntArray5335[i_69_];
				anIntArrayArray5346[i_69_] = new int[anIntArray5351[i_69_]];
				for (int i_71_ = 0; i_71_ < anIntArray5351[i_69_]; i_71_++)
					anIntArrayArray5346[i_69_][i_71_] = -1;
				for (int i_72_ = 0; i_72_ < i_70_; i_72_++) {
					int i_73_;
					if (null != anIntArrayArray5348[i_69_])
						i_73_ = anIntArrayArray5348[i_69_][i_72_];
					else
						i_73_ = i_72_;
					anIntArrayArray5346[i_69_][i_73_] = class527_sub38.readInt();
				}
				aClass281Array5350[i_69_] = new Class281(anIntArrayArray5346[i_69_]);
			}
		}
	}

	void method7693(byte[] is, int i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(Class305.method5591(is, 1157879207));
		int i_74_ = class527_sub38.readUnsignedByte();
		if (i_74_ < 5 || i_74_ > 7)
			throw new RuntimeException();
		if (i_74_ >= 6)
			anInt5339 = class527_sub38.readInt() * 2008380913;
		else
			anInt5339 = 0;
		int i_75_ = class527_sub38.readUnsignedByte();
		boolean bool = (i_75_ & 0x1) != 0;
		boolean bool_76_ = (i_75_ & 0x2) != 0;
		boolean bool_77_ = (i_75_ & 0x4) != 0;
		boolean bool_78_ = 0 != (i_75_ & 0x8);
		if (i_74_ >= 7)
			anInt5336 = class527_sub38.method16526(809429921) * 665966645;
		else
			anInt5336 = class527_sub38.readUnsignedShort() * 665966645;
		int i_79_ = 0;
		int i_80_ = -1;
		anIntArray5337 = new int[-1019954659 * anInt5336];
		if (i_74_ >= 7) {
			for (int i_81_ = 0; i_81_ < -1019954659 * anInt5336; i_81_++) {
				anIntArray5337[i_81_] = i_79_ += class527_sub38.method16526(809429921);
				if (anIntArray5337[i_81_] > i_80_)
					i_80_ = anIntArray5337[i_81_];
			}
		} else {
			for (int i_82_ = 0; i_82_ < anInt5336 * -1019954659; i_82_++) {
				anIntArray5337[i_82_] = i_79_ += class527_sub38.readUnsignedShort();
				if (anIntArray5337[i_82_] > i_80_)
					i_80_ = anIntArray5337[i_82_];
			}
		}
		anInt5340 = (1 + i_80_) * -567994083;
		anIntArray5347 = new int[309096757 * anInt5340];
		if (bool_78_)
			anIntArray5342 = new int[anInt5340 * 309096757];
		if (bool_76_)
			aByteArrayArray5343 = new byte[309096757 * anInt5340][];
		anIntArray5333 = new int[309096757 * anInt5340];
		anIntArray5335 = new int[anInt5340 * 309096757];
		anIntArrayArray5348 = new int[anInt5340 * 309096757][];
		anIntArray5351 = new int[309096757 * anInt5340];
		if (bool) {
			anIntArray5338 = new int[anInt5340 * 309096757];
			for (int i_83_ = 0; i_83_ < anInt5340 * 309096757; i_83_++)
				anIntArray5338[i_83_] = -1;
			for (int i_84_ = 0; i_84_ < anInt5336 * -1019954659; i_84_++)
				anIntArray5338[anIntArray5337[i_84_]] = class527_sub38.readInt();
			aClass281_5332 = new Class281(anIntArray5338);
		}
		for (int i_85_ = 0; i_85_ < -1019954659 * anInt5336; i_85_++)
			anIntArray5347[anIntArray5337[i_85_]] = class527_sub38.readInt();
		if (bool_78_) {
			for (int i_86_ = 0; i_86_ < anInt5336 * -1019954659; i_86_++)
				anIntArray5342[i_86_] = class527_sub38.readInt();
		}
		if (bool_76_) {
			for (int i_87_ = 0; i_87_ < -1019954659 * anInt5336; i_87_++) {
				byte[] is_88_ = new byte[64];
				class527_sub38.method16460(is_88_, 0, 64, -1878395198);
				aByteArrayArray5343[anIntArray5337[i_87_]] = is_88_;
			}
		}
		if (bool_77_) {
			anIntArray5344 = new int[309096757 * anInt5340];
			anIntArray5345 = new int[anInt5340 * 309096757];
			for (int i_89_ = 0; i_89_ < anInt5336 * -1019954659; i_89_++) {
				anIntArray5344[anIntArray5337[i_89_]] = class527_sub38.readInt();
				anIntArray5345[anIntArray5337[i_89_]] = class527_sub38.readInt();
			}
		}
		for (int i_90_ = 0; i_90_ < anInt5336 * -1019954659; i_90_++)
			anIntArray5333[anIntArray5337[i_90_]] = class527_sub38.readInt();
		if (i_74_ >= 7) {
			for (int i_91_ = 0; i_91_ < -1019954659 * anInt5336; i_91_++)
				anIntArray5335[anIntArray5337[i_91_]] = class527_sub38.method16526(809429921);
			for (int i_92_ = 0; i_92_ < anInt5336 * -1019954659; i_92_++) {
				int i_93_ = anIntArray5337[i_92_];
				int i_94_ = anIntArray5335[i_93_];
				i_79_ = 0;
				int i_95_ = -1;
				anIntArrayArray5348[i_93_] = new int[i_94_];
				for (int i_96_ = 0; i_96_ < i_94_; i_96_++) {
					int i_97_ = (anIntArrayArray5348[i_93_][i_96_] = i_79_ += class527_sub38.method16526(809429921));
					if (i_97_ > i_95_)
						i_95_ = i_97_;
				}
				anIntArray5351[i_93_] = i_95_ + 1;
				if (i_95_ + 1 == i_94_)
					anIntArrayArray5348[i_93_] = null;
			}
		} else {
			for (int i_98_ = 0; i_98_ < anInt5336 * -1019954659; i_98_++)
				anIntArray5335[anIntArray5337[i_98_]] = class527_sub38.readUnsignedShort();
			for (int i_99_ = 0; i_99_ < -1019954659 * anInt5336; i_99_++) {
				int i_100_ = anIntArray5337[i_99_];
				int i_101_ = anIntArray5335[i_100_];
				i_79_ = 0;
				int i_102_ = -1;
				anIntArrayArray5348[i_100_] = new int[i_101_];
				for (int i_103_ = 0; i_103_ < i_101_; i_103_++) {
					int i_104_ = (anIntArrayArray5348[i_100_][i_103_] = i_79_ += class527_sub38.readUnsignedShort());
					if (i_104_ > i_102_)
						i_102_ = i_104_;
				}
				anIntArray5351[i_100_] = 1 + i_102_;
				if (i_101_ == 1 + i_102_)
					anIntArrayArray5348[i_100_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5346 = new int[1 + i_80_][];
			aClass281Array5350 = new Class281[i_80_ + 1];
			for (int i_105_ = 0; i_105_ < -1019954659 * anInt5336; i_105_++) {
				int i_106_ = anIntArray5337[i_105_];
				int i_107_ = anIntArray5335[i_106_];
				anIntArrayArray5346[i_106_] = new int[anIntArray5351[i_106_]];
				for (int i_108_ = 0; i_108_ < anIntArray5351[i_106_]; i_108_++)
					anIntArrayArray5346[i_106_][i_108_] = -1;
				for (int i_109_ = 0; i_109_ < i_107_; i_109_++) {
					int i_110_;
					if (null != anIntArrayArray5348[i_106_])
						i_110_ = anIntArrayArray5348[i_106_][i_109_];
					else
						i_110_ = i_109_;
					anIntArrayArray5346[i_106_][i_110_] = class527_sub38.readInt();
				}
				aClass281Array5350[i_106_] = new Class281(anIntArrayArray5346[i_106_]);
			}
		}
	}

	void method7694(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(Class305.method5591(is, 2129084986));
		int i = class527_sub38.readUnsignedByte();
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			anInt5339 = class527_sub38.readInt() * 2008380913;
		else
			anInt5339 = 0;
		int i_111_ = class527_sub38.readUnsignedByte();
		boolean bool = (i_111_ & 0x1) != 0;
		boolean bool_112_ = (i_111_ & 0x2) != 0;
		boolean bool_113_ = (i_111_ & 0x4) != 0;
		boolean bool_114_ = 0 != (i_111_ & 0x8);
		if (i >= 7)
			anInt5336 = class527_sub38.method16526(809429921) * 665966645;
		else
			anInt5336 = class527_sub38.readUnsignedShort() * 665966645;
		int i_115_ = 0;
		int i_116_ = -1;
		anIntArray5337 = new int[-1019954659 * anInt5336];
		if (i >= 7) {
			for (int i_117_ = 0; i_117_ < -1019954659 * anInt5336; i_117_++) {
				anIntArray5337[i_117_] = i_115_ += class527_sub38.method16526(809429921);
				if (anIntArray5337[i_117_] > i_116_)
					i_116_ = anIntArray5337[i_117_];
			}
		} else {
			for (int i_118_ = 0; i_118_ < anInt5336 * -1019954659; i_118_++) {
				anIntArray5337[i_118_] = i_115_ += class527_sub38.readUnsignedShort();
				if (anIntArray5337[i_118_] > i_116_)
					i_116_ = anIntArray5337[i_118_];
			}
		}
		anInt5340 = (1 + i_116_) * -567994083;
		anIntArray5347 = new int[309096757 * anInt5340];
		if (bool_114_)
			anIntArray5342 = new int[anInt5340 * 309096757];
		if (bool_112_)
			aByteArrayArray5343 = new byte[309096757 * anInt5340][];
		anIntArray5333 = new int[309096757 * anInt5340];
		anIntArray5335 = new int[anInt5340 * 309096757];
		anIntArrayArray5348 = new int[anInt5340 * 309096757][];
		anIntArray5351 = new int[309096757 * anInt5340];
		if (bool) {
			anIntArray5338 = new int[anInt5340 * 309096757];
			for (int i_119_ = 0; i_119_ < anInt5340 * 309096757; i_119_++)
				anIntArray5338[i_119_] = -1;
			for (int i_120_ = 0; i_120_ < anInt5336 * -1019954659; i_120_++)
				anIntArray5338[anIntArray5337[i_120_]] = class527_sub38.readInt();
			aClass281_5332 = new Class281(anIntArray5338);
		}
		for (int i_121_ = 0; i_121_ < -1019954659 * anInt5336; i_121_++)
			anIntArray5347[anIntArray5337[i_121_]] = class527_sub38.readInt();
		if (bool_114_) {
			for (int i_122_ = 0; i_122_ < anInt5336 * -1019954659; i_122_++)
				anIntArray5342[i_122_] = class527_sub38.readInt();
		}
		if (bool_112_) {
			for (int i_123_ = 0; i_123_ < -1019954659 * anInt5336; i_123_++) {
				byte[] is_124_ = new byte[64];
				class527_sub38.method16460(is_124_, 0, 64, -1728420946);
				aByteArrayArray5343[anIntArray5337[i_123_]] = is_124_;
			}
		}
		if (bool_113_) {
			anIntArray5344 = new int[309096757 * anInt5340];
			anIntArray5345 = new int[anInt5340 * 309096757];
			for (int i_125_ = 0; i_125_ < anInt5336 * -1019954659; i_125_++) {
				anIntArray5344[anIntArray5337[i_125_]] = class527_sub38.readInt();
				anIntArray5345[anIntArray5337[i_125_]] = class527_sub38.readInt();
			}
		}
		for (int i_126_ = 0; i_126_ < anInt5336 * -1019954659; i_126_++)
			anIntArray5333[anIntArray5337[i_126_]] = class527_sub38.readInt();
		if (i >= 7) {
			for (int i_127_ = 0; i_127_ < -1019954659 * anInt5336; i_127_++)
				anIntArray5335[anIntArray5337[i_127_]] = class527_sub38.method16526(809429921);
			for (int i_128_ = 0; i_128_ < anInt5336 * -1019954659; i_128_++) {
				int i_129_ = anIntArray5337[i_128_];
				int i_130_ = anIntArray5335[i_129_];
				i_115_ = 0;
				int i_131_ = -1;
				anIntArrayArray5348[i_129_] = new int[i_130_];
				for (int i_132_ = 0; i_132_ < i_130_; i_132_++) {
					int i_133_ = (anIntArrayArray5348[i_129_][i_132_] = i_115_ += class527_sub38.method16526(809429921));
					if (i_133_ > i_131_)
						i_131_ = i_133_;
				}
				anIntArray5351[i_129_] = i_131_ + 1;
				if (i_131_ + 1 == i_130_)
					anIntArrayArray5348[i_129_] = null;
			}
		} else {
			for (int i_134_ = 0; i_134_ < anInt5336 * -1019954659; i_134_++)
				anIntArray5335[anIntArray5337[i_134_]] = class527_sub38.readUnsignedShort();
			for (int i_135_ = 0; i_135_ < -1019954659 * anInt5336; i_135_++) {
				int i_136_ = anIntArray5337[i_135_];
				int i_137_ = anIntArray5335[i_136_];
				i_115_ = 0;
				int i_138_ = -1;
				anIntArrayArray5348[i_136_] = new int[i_137_];
				for (int i_139_ = 0; i_139_ < i_137_; i_139_++) {
					int i_140_ = (anIntArrayArray5348[i_136_][i_139_] = i_115_ += class527_sub38.readUnsignedShort());
					if (i_140_ > i_138_)
						i_138_ = i_140_;
				}
				anIntArray5351[i_136_] = 1 + i_138_;
				if (i_137_ == 1 + i_138_)
					anIntArrayArray5348[i_136_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5346 = new int[1 + i_116_][];
			aClass281Array5350 = new Class281[i_116_ + 1];
			for (int i_141_ = 0; i_141_ < -1019954659 * anInt5336; i_141_++) {
				int i_142_ = anIntArray5337[i_141_];
				int i_143_ = anIntArray5335[i_142_];
				anIntArrayArray5346[i_142_] = new int[anIntArray5351[i_142_]];
				for (int i_144_ = 0; i_144_ < anIntArray5351[i_142_]; i_144_++)
					anIntArrayArray5346[i_142_][i_144_] = -1;
				for (int i_145_ = 0; i_145_ < i_143_; i_145_++) {
					int i_146_;
					if (null != anIntArrayArray5348[i_142_])
						i_146_ = anIntArrayArray5348[i_142_][i_145_];
					else
						i_146_ = i_145_;
					anIntArrayArray5346[i_142_][i_146_] = class527_sub38.readInt();
				}
				aClass281Array5350[i_142_] = new Class281(anIntArrayArray5346[i_142_]);
			}
		}
	}

	static final void method7695(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class648.method10832(class243, class240, class665, -1941797806);
	}

	static final void method7696(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_147_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		boolean bool = 1 == (class665.anIntArray8525[1 + class665.anInt8526 * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class7.method597(i_147_, bool, (byte) 15);
	}

	static final void method7697(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static boolean method7698(int i, int i_148_) {
		return (59 == i || 2 == i || 8 == i || i == 17 || 15 == i || 16 == i || 58 == i);
	}

	static final void method7699(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass346_8532.aByte3709;
	}
}
