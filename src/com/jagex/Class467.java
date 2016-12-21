/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class467 {
	Class260 aClass260_5325;
	static final int anInt5326 = 7;
	int[][] anIntArrayArray5327;
	int[] anIntArray5328;
	int anInt5329;
	int[] anIntArray5330;
	byte[] aByteArray5331;
	int[] anIntArray5332;
	int anInt5333;
	int[] anIntArray5334;
	Class260[] aClass260Array5335;
	byte[][] aByteArrayArray5336;
	int[] anIntArray5337;
	int[] anIntArray5338;
	int[] anIntArray5339;
	int[] anIntArray5340;
	int[][] anIntArrayArray5341;
	int anInt5342;
	int anInt5343;
	int[] anIntArray5344;

	void method5686(byte[] is) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(Class469.method5700(is, (byte) -15));
		int i = class536_sub33.readUnsignedByte(519661334);
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			anInt5343 = class536_sub33.method9709(-751670345) * -1621242877;
		else
			anInt5343 = 0;
		int i_0_ = class536_sub33.readUnsignedByte(1184954128);
		boolean bool = 0 != (i_0_ & 0x1);
		boolean bool_1_ = 0 != (i_0_ & 0x2);
		boolean bool_2_ = (i_0_ & 0x4) != 0;
		boolean bool_3_ = 0 != (i_0_ & 0x8);
		if (i >= 7)
			anInt5329 = class536_sub33.method9765((short) 31148) * 1236280683;
		else
			anInt5329 = class536_sub33.readUnsignedShort((short) -16263) * 1236280683;
		int i_4_ = 0;
		int i_5_ = -1;
		anIntArray5330 = new int[1483398979 * anInt5329];
		if (i >= 7) {
			for (int i_6_ = 0; i_6_ < 1483398979 * anInt5329; i_6_++) {
				anIntArray5330[i_6_] = i_4_ += class536_sub33.method9765((short) 23290);
				if (anIntArray5330[i_6_] > i_5_)
					i_5_ = anIntArray5330[i_6_];
			}
		} else {
			for (int i_7_ = 0; i_7_ < 1483398979 * anInt5329; i_7_++) {
				anIntArray5330[i_7_] = i_4_ += class536_sub33.readUnsignedShort((short) -12028);
				if (anIntArray5330[i_7_] > i_5_)
					i_5_ = anIntArray5330[i_7_];
			}
		}
		anInt5333 = (i_5_ + 1) * 1086459915;
		anIntArray5334 = new int[anInt5333 * 608172963];
		if (bool_3_)
			anIntArray5332 = new int[anInt5333 * 608172963];
		if (bool_1_)
			aByteArrayArray5336 = new byte[608172963 * anInt5333][];
		anIntArray5337 = new int[anInt5333 * 608172963];
		anIntArray5340 = new int[anInt5333 * 608172963];
		anIntArrayArray5341 = new int[608172963 * anInt5333][];
		anIntArray5344 = new int[anInt5333 * 608172963];
		if (bool) {
			anIntArray5328 = new int[anInt5333 * 608172963];
			for (int i_8_ = 0; i_8_ < 608172963 * anInt5333; i_8_++)
				anIntArray5328[i_8_] = -1;
			for (int i_9_ = 0; i_9_ < 1483398979 * anInt5329; i_9_++)
				anIntArray5328[anIntArray5330[i_9_]] = class536_sub33.method9709(-1000301379);
			aClass260_5325 = new Class260(anIntArray5328);
		}
		for (int i_10_ = 0; i_10_ < 1483398979 * anInt5329; i_10_++)
			anIntArray5334[anIntArray5330[i_10_]] = class536_sub33.method9709(-791791804);
		if (bool_3_) {
			for (int i_11_ = 0; i_11_ < anInt5329 * 1483398979; i_11_++)
				anIntArray5332[i_11_] = class536_sub33.method9709(-876086744);
		}
		if (bool_1_) {
			for (int i_12_ = 0; i_12_ < 1483398979 * anInt5329; i_12_++) {
				byte[] is_13_ = new byte[64];
				class536_sub33.method9716(is_13_, 0, 64, 225229609);
				aByteArrayArray5336[anIntArray5330[i_12_]] = is_13_;
			}
		}
		if (bool_2_) {
			anIntArray5338 = new int[608172963 * anInt5333];
			anIntArray5339 = new int[anInt5333 * 608172963];
			for (int i_14_ = 0; i_14_ < 1483398979 * anInt5329; i_14_++) {
				anIntArray5338[anIntArray5330[i_14_]] = class536_sub33.method9709(-2021844509);
				anIntArray5339[anIntArray5330[i_14_]] = class536_sub33.method9709(195703550);
			}
		}
		for (int i_15_ = 0; i_15_ < anInt5329 * 1483398979; i_15_++)
			anIntArray5337[anIntArray5330[i_15_]] = class536_sub33.method9709(-639257761);
		if (i >= 7) {
			for (int i_16_ = 0; i_16_ < 1483398979 * anInt5329; i_16_++)
				anIntArray5340[anIntArray5330[i_16_]] = class536_sub33.method9765((short) 29624);
			for (int i_17_ = 0; i_17_ < 1483398979 * anInt5329; i_17_++) {
				int i_18_ = anIntArray5330[i_17_];
				int i_19_ = anIntArray5340[i_18_];
				i_4_ = 0;
				int i_20_ = -1;
				anIntArrayArray5341[i_18_] = new int[i_19_];
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					int i_22_ = (anIntArrayArray5341[i_18_][i_21_] = i_4_ += class536_sub33.method9765((short) 9239));
					if (i_22_ > i_20_)
						i_20_ = i_22_;
				}
				anIntArray5344[i_18_] = 1 + i_20_;
				if (1 + i_20_ == i_19_)
					anIntArrayArray5341[i_18_] = null;
			}
		} else {
			for (int i_23_ = 0; i_23_ < anInt5329 * 1483398979; i_23_++)
				anIntArray5340[anIntArray5330[i_23_]] = class536_sub33.readUnsignedShort((short) 16813);
			for (int i_24_ = 0; i_24_ < anInt5329 * 1483398979; i_24_++) {
				int i_25_ = anIntArray5330[i_24_];
				int i_26_ = anIntArray5340[i_25_];
				i_4_ = 0;
				int i_27_ = -1;
				anIntArrayArray5341[i_25_] = new int[i_26_];
				for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
					int i_29_ = (anIntArrayArray5341[i_25_][i_28_] = i_4_ += class536_sub33.readUnsignedShort((short) 10785));
					if (i_29_ > i_27_)
						i_27_ = i_29_;
				}
				anIntArray5344[i_25_] = 1 + i_27_;
				if (i_27_ + 1 == i_26_)
					anIntArrayArray5341[i_25_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5327 = new int[1 + i_5_][];
			aClass260Array5335 = new Class260[1 + i_5_];
			for (int i_30_ = 0; i_30_ < 1483398979 * anInt5329; i_30_++) {
				int i_31_ = anIntArray5330[i_30_];
				int i_32_ = anIntArray5340[i_31_];
				anIntArrayArray5327[i_31_] = new int[anIntArray5344[i_31_]];
				for (int i_33_ = 0; i_33_ < anIntArray5344[i_31_]; i_33_++)
					anIntArrayArray5327[i_31_][i_33_] = -1;
				for (int i_34_ = 0; i_34_ < i_32_; i_34_++) {
					int i_35_;
					if (null != anIntArrayArray5341[i_31_])
						i_35_ = anIntArrayArray5341[i_31_][i_34_];
					else
						i_35_ = i_34_;
					anIntArrayArray5327[i_31_][i_35_] = class536_sub33.method9709(-1066009118);
				}
				aClass260Array5335[i_31_] = new Class260(anIntArrayArray5327[i_31_]);
			}
		}
	}

	void method5687(byte[] is) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(Class469.method5700(is, (byte) -32));
		int i = class536_sub33.readUnsignedByte(1372887013);
		if (i < 5 || i > 7)
			throw new RuntimeException();
		if (i >= 6)
			anInt5343 = class536_sub33.method9709(-777467171) * -1621242877;
		else
			anInt5343 = 0;
		int i_36_ = class536_sub33.readUnsignedByte(-1018192569);
		boolean bool = 0 != (i_36_ & 0x1);
		boolean bool_37_ = 0 != (i_36_ & 0x2);
		boolean bool_38_ = (i_36_ & 0x4) != 0;
		boolean bool_39_ = 0 != (i_36_ & 0x8);
		if (i >= 7)
			anInt5329 = class536_sub33.method9765((short) 31462) * 1236280683;
		else
			anInt5329 = class536_sub33.readUnsignedShort((short) -8804) * 1236280683;
		int i_40_ = 0;
		int i_41_ = -1;
		anIntArray5330 = new int[1483398979 * anInt5329];
		if (i >= 7) {
			for (int i_42_ = 0; i_42_ < 1483398979 * anInt5329; i_42_++) {
				anIntArray5330[i_42_] = i_40_ += class536_sub33.method9765((short) 29342);
				if (anIntArray5330[i_42_] > i_41_)
					i_41_ = anIntArray5330[i_42_];
			}
		} else {
			for (int i_43_ = 0; i_43_ < 1483398979 * anInt5329; i_43_++) {
				anIntArray5330[i_43_] = i_40_ += class536_sub33.readUnsignedShort((short) -16399);
				if (anIntArray5330[i_43_] > i_41_)
					i_41_ = anIntArray5330[i_43_];
			}
		}
		anInt5333 = (i_41_ + 1) * 1086459915;
		anIntArray5334 = new int[anInt5333 * 608172963];
		if (bool_39_)
			anIntArray5332 = new int[anInt5333 * 608172963];
		if (bool_37_)
			aByteArrayArray5336 = new byte[608172963 * anInt5333][];
		anIntArray5337 = new int[anInt5333 * 608172963];
		anIntArray5340 = new int[anInt5333 * 608172963];
		anIntArrayArray5341 = new int[608172963 * anInt5333][];
		anIntArray5344 = new int[anInt5333 * 608172963];
		if (bool) {
			anIntArray5328 = new int[anInt5333 * 608172963];
			for (int i_44_ = 0; i_44_ < 608172963 * anInt5333; i_44_++)
				anIntArray5328[i_44_] = -1;
			for (int i_45_ = 0; i_45_ < 1483398979 * anInt5329; i_45_++)
				anIntArray5328[anIntArray5330[i_45_]] = class536_sub33.method9709(200631497);
			aClass260_5325 = new Class260(anIntArray5328);
		}
		for (int i_46_ = 0; i_46_ < 1483398979 * anInt5329; i_46_++)
			anIntArray5334[anIntArray5330[i_46_]] = class536_sub33.method9709(-1384967550);
		if (bool_39_) {
			for (int i_47_ = 0; i_47_ < anInt5329 * 1483398979; i_47_++)
				anIntArray5332[i_47_] = class536_sub33.method9709(-686308639);
		}
		if (bool_37_) {
			for (int i_48_ = 0; i_48_ < 1483398979 * anInt5329; i_48_++) {
				byte[] is_49_ = new byte[64];
				class536_sub33.method9716(is_49_, 0, 64, -1715326754);
				aByteArrayArray5336[anIntArray5330[i_48_]] = is_49_;
			}
		}
		if (bool_38_) {
			anIntArray5338 = new int[608172963 * anInt5333];
			anIntArray5339 = new int[anInt5333 * 608172963];
			for (int i_50_ = 0; i_50_ < 1483398979 * anInt5329; i_50_++) {
				anIntArray5338[anIntArray5330[i_50_]] = class536_sub33.method9709(-159291391);
				anIntArray5339[anIntArray5330[i_50_]] = class536_sub33.method9709(163005040);
			}
		}
		for (int i_51_ = 0; i_51_ < anInt5329 * 1483398979; i_51_++)
			anIntArray5337[anIntArray5330[i_51_]] = class536_sub33.method9709(-1525806753);
		if (i >= 7) {
			for (int i_52_ = 0; i_52_ < 1483398979 * anInt5329; i_52_++)
				anIntArray5340[anIntArray5330[i_52_]] = class536_sub33.method9765((short) 10334);
			for (int i_53_ = 0; i_53_ < 1483398979 * anInt5329; i_53_++) {
				int i_54_ = anIntArray5330[i_53_];
				int i_55_ = anIntArray5340[i_54_];
				i_40_ = 0;
				int i_56_ = -1;
				anIntArrayArray5341[i_54_] = new int[i_55_];
				for (int i_57_ = 0; i_57_ < i_55_; i_57_++) {
					int i_58_ = (anIntArrayArray5341[i_54_][i_57_] = i_40_ += class536_sub33.method9765((short) 31523));
					if (i_58_ > i_56_)
						i_56_ = i_58_;
				}
				anIntArray5344[i_54_] = 1 + i_56_;
				if (1 + i_56_ == i_55_)
					anIntArrayArray5341[i_54_] = null;
			}
		} else {
			for (int i_59_ = 0; i_59_ < anInt5329 * 1483398979; i_59_++)
				anIntArray5340[anIntArray5330[i_59_]] = class536_sub33.readUnsignedShort((short) -10019);
			for (int i_60_ = 0; i_60_ < anInt5329 * 1483398979; i_60_++) {
				int i_61_ = anIntArray5330[i_60_];
				int i_62_ = anIntArray5340[i_61_];
				i_40_ = 0;
				int i_63_ = -1;
				anIntArrayArray5341[i_61_] = new int[i_62_];
				for (int i_64_ = 0; i_64_ < i_62_; i_64_++) {
					int i_65_ = (anIntArrayArray5341[i_61_][i_64_] = i_40_ += class536_sub33.readUnsignedShort((short) 8143));
					if (i_65_ > i_63_)
						i_63_ = i_65_;
				}
				anIntArray5344[i_61_] = 1 + i_63_;
				if (i_63_ + 1 == i_62_)
					anIntArrayArray5341[i_61_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5327 = new int[1 + i_41_][];
			aClass260Array5335 = new Class260[1 + i_41_];
			for (int i_66_ = 0; i_66_ < 1483398979 * anInt5329; i_66_++) {
				int i_67_ = anIntArray5330[i_66_];
				int i_68_ = anIntArray5340[i_67_];
				anIntArrayArray5327[i_67_] = new int[anIntArray5344[i_67_]];
				for (int i_69_ = 0; i_69_ < anIntArray5344[i_67_]; i_69_++)
					anIntArrayArray5327[i_67_][i_69_] = -1;
				for (int i_70_ = 0; i_70_ < i_68_; i_70_++) {
					int i_71_;
					if (null != anIntArrayArray5341[i_67_])
						i_71_ = anIntArrayArray5341[i_67_][i_70_];
					else
						i_71_ = i_70_;
					anIntArrayArray5327[i_67_][i_71_] = class536_sub33.method9709(-82637162);
				}
				aClass260Array5335[i_67_] = new Class260(anIntArrayArray5327[i_67_]);
			}
		}
	}

	void method5688(byte[] is, int i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(Class469.method5700(is, (byte) -43));
		int i_72_ = class536_sub33.readUnsignedByte(1106342427);
		if (i_72_ < 5 || i_72_ > 7)
			throw new RuntimeException();
		if (i_72_ >= 6)
			anInt5343 = class536_sub33.method9709(-1830096642) * -1621242877;
		else
			anInt5343 = 0;
		int i_73_ = class536_sub33.readUnsignedByte(-754344730);
		boolean bool = 0 != (i_73_ & 0x1);
		boolean bool_74_ = 0 != (i_73_ & 0x2);
		boolean bool_75_ = (i_73_ & 0x4) != 0;
		boolean bool_76_ = 0 != (i_73_ & 0x8);
		if (i_72_ >= 7)
			anInt5329 = class536_sub33.method9765((short) 11913) * 1236280683;
		else
			anInt5329 = class536_sub33.readUnsignedShort((short) 2892) * 1236280683;
		int i_77_ = 0;
		int i_78_ = -1;
		anIntArray5330 = new int[1483398979 * anInt5329];
		if (i_72_ >= 7) {
			for (int i_79_ = 0; i_79_ < 1483398979 * anInt5329; i_79_++) {
				anIntArray5330[i_79_] = i_77_ += class536_sub33.method9765((short) 15098);
				if (anIntArray5330[i_79_] > i_78_)
					i_78_ = anIntArray5330[i_79_];
			}
		} else {
			for (int i_80_ = 0; i_80_ < 1483398979 * anInt5329; i_80_++) {
				anIntArray5330[i_80_] = i_77_ += class536_sub33.readUnsignedShort((short) 17270);
				if (anIntArray5330[i_80_] > i_78_)
					i_78_ = anIntArray5330[i_80_];
			}
		}
		anInt5333 = (i_78_ + 1) * 1086459915;
		anIntArray5334 = new int[anInt5333 * 608172963];
		if (bool_76_)
			anIntArray5332 = new int[anInt5333 * 608172963];
		if (bool_74_)
			aByteArrayArray5336 = new byte[608172963 * anInt5333][];
		anIntArray5337 = new int[anInt5333 * 608172963];
		anIntArray5340 = new int[anInt5333 * 608172963];
		anIntArrayArray5341 = new int[608172963 * anInt5333][];
		anIntArray5344 = new int[anInt5333 * 608172963];
		if (bool) {
			anIntArray5328 = new int[anInt5333 * 608172963];
			for (int i_81_ = 0; i_81_ < 608172963 * anInt5333; i_81_++)
				anIntArray5328[i_81_] = -1;
			for (int i_82_ = 0; i_82_ < 1483398979 * anInt5329; i_82_++)
				anIntArray5328[anIntArray5330[i_82_]] = class536_sub33.method9709(-1317197544);
			aClass260_5325 = new Class260(anIntArray5328);
		}
		for (int i_83_ = 0; i_83_ < 1483398979 * anInt5329; i_83_++)
			anIntArray5334[anIntArray5330[i_83_]] = class536_sub33.method9709(-1679747367);
		if (bool_76_) {
			for (int i_84_ = 0; i_84_ < anInt5329 * 1483398979; i_84_++)
				anIntArray5332[i_84_] = class536_sub33.method9709(-56774284);
		}
		if (bool_74_) {
			for (int i_85_ = 0; i_85_ < 1483398979 * anInt5329; i_85_++) {
				byte[] is_86_ = new byte[64];
				class536_sub33.method9716(is_86_, 0, 64, -751300460);
				aByteArrayArray5336[anIntArray5330[i_85_]] = is_86_;
			}
		}
		if (bool_75_) {
			anIntArray5338 = new int[608172963 * anInt5333];
			anIntArray5339 = new int[anInt5333 * 608172963];
			for (int i_87_ = 0; i_87_ < 1483398979 * anInt5329; i_87_++) {
				anIntArray5338[anIntArray5330[i_87_]] = class536_sub33.method9709(172257008);
				anIntArray5339[anIntArray5330[i_87_]] = class536_sub33.method9709(-1651847510);
			}
		}
		for (int i_88_ = 0; i_88_ < anInt5329 * 1483398979; i_88_++)
			anIntArray5337[anIntArray5330[i_88_]] = class536_sub33.method9709(-766282907);
		if (i_72_ >= 7) {
			for (int i_89_ = 0; i_89_ < 1483398979 * anInt5329; i_89_++)
				anIntArray5340[anIntArray5330[i_89_]] = class536_sub33.method9765((short) 32629);
			for (int i_90_ = 0; i_90_ < 1483398979 * anInt5329; i_90_++) {
				int i_91_ = anIntArray5330[i_90_];
				int i_92_ = anIntArray5340[i_91_];
				i_77_ = 0;
				int i_93_ = -1;
				anIntArrayArray5341[i_91_] = new int[i_92_];
				for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
					int i_95_ = (anIntArrayArray5341[i_91_][i_94_] = i_77_ += class536_sub33.method9765((short) 31627));
					if (i_95_ > i_93_)
						i_93_ = i_95_;
				}
				anIntArray5344[i_91_] = 1 + i_93_;
				if (1 + i_93_ == i_92_)
					anIntArrayArray5341[i_91_] = null;
			}
		} else {
			for (int i_96_ = 0; i_96_ < anInt5329 * 1483398979; i_96_++)
				anIntArray5340[anIntArray5330[i_96_]] = class536_sub33.readUnsignedShort((short) 27156);
			for (int i_97_ = 0; i_97_ < anInt5329 * 1483398979; i_97_++) {
				int i_98_ = anIntArray5330[i_97_];
				int i_99_ = anIntArray5340[i_98_];
				i_77_ = 0;
				int i_100_ = -1;
				anIntArrayArray5341[i_98_] = new int[i_99_];
				for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
					int i_102_ = (anIntArrayArray5341[i_98_][i_101_] = i_77_ += class536_sub33.readUnsignedShort((short) 10738));
					if (i_102_ > i_100_)
						i_100_ = i_102_;
				}
				anIntArray5344[i_98_] = 1 + i_100_;
				if (i_100_ + 1 == i_99_)
					anIntArrayArray5341[i_98_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5327 = new int[1 + i_78_][];
			aClass260Array5335 = new Class260[1 + i_78_];
			for (int i_103_ = 0; i_103_ < 1483398979 * anInt5329; i_103_++) {
				int i_104_ = anIntArray5330[i_103_];
				int i_105_ = anIntArray5340[i_104_];
				anIntArrayArray5327[i_104_] = new int[anIntArray5344[i_104_]];
				for (int i_106_ = 0; i_106_ < anIntArray5344[i_104_]; i_106_++)
					anIntArrayArray5327[i_104_][i_106_] = -1;
				for (int i_107_ = 0; i_107_ < i_105_; i_107_++) {
					int i_108_;
					if (null != anIntArrayArray5341[i_104_])
						i_108_ = anIntArrayArray5341[i_104_][i_107_];
					else
						i_108_ = i_107_;
					anIntArrayArray5327[i_104_][i_108_] = class536_sub33.method9709(-609025813);
				}
				aClass260Array5335[i_104_] = new Class260(anIntArrayArray5327[i_104_]);
			}
		}
	}

	Class467(byte[] is, int i, byte[] is_109_) {
		anInt5342 = Class536_Sub25.method9592(is, is.length, (byte) 0) * -247108067;
		if (i != 217760821 * anInt5342)
			throw new RuntimeException();
		if (is_109_ != null) {
			if (64 != is_109_.length)
				throw new RuntimeException();
			aByteArray5331 = Class601.method7165(is, 0, is.length, (byte) -82);
			for (int i_110_ = 0; i_110_ < 64; i_110_++) {
				if (aByteArray5331[i_110_] != is_109_[i_110_])
					throw new RuntimeException();
			}
		}
		method5688(is, -539613955);
	}

	static void method5689(Interface68 interface68, int i) {
		while (Class586.aLinkedList7708.size() > 10)
			Class586.aLinkedList7708.remove();
		Class586.aLinkedList7708.add(interface68);
	}

	public static Class595[] method5690(int i) {
		return (new Class595[] { Class595.aClass595_7819, Class595.aClass595_7820, Class595.aClass595_7818 });
	}

	public static Class143 method5691(byte i) {
		return Class575.aClass143_7676;
	}

	public static int method5692(String string, boolean bool, byte i) {
		string = string.toLowerCase();
		Class2.anIntArray96 = null;
		Class596.anInt7830 = 0;
		LinkedList linkedlist = new LinkedList();
		LinkedList linkedlist_111_ = new LinkedList();
		int i_112_ = bool ? 32768 : 0;
		int i_113_ = ((bool ? Class198.aClass32_2216.anInt280 * 1071910999 : -1089717185 * Class198.aClass32_2216.anInt279) + i_112_);
		for (int i_114_ = i_112_; i_114_ < i_113_; i_114_++) {
			Class536_Sub18_Sub10 class536_sub18_sub10 = Class198.aClass32_2216.method788(i_114_, (byte) 97);
			if (class536_sub18_sub10.aBool11721 && class536_sub18_sub10.method10713((byte) -47).toLowerCase().indexOf(string) != -1) {
				if (linkedlist.size() >= 50)
					return -1;
				linkedlist.add(Integer.valueOf(i_114_));
				linkedlist_111_.add(class536_sub18_sub10.method10713((byte) 32));
			}
		}
		Class2.anIntArray96 = new int[linkedlist.size()];
		int i_115_ = 0;
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			Class2.anIntArray96[i_115_++] = integer.intValue();
		}
		String[] strings = (String[]) linkedlist_111_.toArray(new String[Class2.anIntArray96.length]);
		Class205_Sub12.method9071(strings, Class2.anIntArray96, -806264141);
		return linkedlist.size();
	}

	static final void method5693(Class668 class668, int i) {
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) != 0);
		int i_116_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class650.method7859((long) i_116_, 0, bool, Class459.aClass664_5178, -1327360575);
	}

	static final void method5694(Class668 class668, int i) {
		class668.anInt8564 += (-1531084683 * class668.anIntArray8537[class668.anInt8564 * -1640738851]);
	}
}
