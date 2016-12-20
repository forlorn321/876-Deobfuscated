/* Class337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class337 {
	static final boolean method5903(int i, int i_0_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5904(int i, int i_1_) {
		return (i & 0x21) != 0;
	}

	static final boolean method5905(int i, int i_2_) {
		return (i & 0x22) != 0;
	}

	static final boolean method5906(int i, int i_3_) {
		return (i & 0x34) != 0;
	}

	static final boolean method5907(int i, int i_4_) {
		return (i & 0x400) != 0;
	}

	static final boolean method5908(int i, int i_5_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method5909(int i, int i_6_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method5910(int i, int i_7_) {
		return method5913(i, i_7_) & method5920(i, i_7_);
	}

	static final boolean method5911(int i, int i_8_) {
		return false;
	}

	static final boolean method5912(int i, int i_9_) {
		return (i & 0x60000) != 0 | method5913(i, i_9_) || method5925(i, i_9_);
	}

	static final boolean method5913(int i, int i_10_) {
		return (i & 0x10) != 0;
	}

	static final boolean method5914(int i, int i_11_) {
		return (i & 0x400) != 0;
	}

	static final boolean method5915(int i, int i_12_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5916(int i, int i_13_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5917(int i, int i_14_) {
		return (i & 0x800) != 0 && (i_14_ & 0x37) != 0;
	}

	static final boolean method5918(int i, int i_15_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method5919(int i, int i_16_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5920(int i, int i_17_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5921(int i, int i_18_) {
		return false;
	}

	static final boolean method5922(int i, int i_19_) {
		return ((i & 0x70000) != 0 || method5906(i, i_19_) || method5960(i, i_19_));
	}

	static final boolean method5923(int i, int i_20_) {
		if (!method5915(i, i_20_))
			return false;
		if ((i & 0x9000) != 0 | method5909(i, i_20_) | method5977(i, i_20_))
			return true;
		return (i_20_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5908(i, i_20_) | method5936(i, i_20_));
	}

	static final boolean method5924(int i, int i_21_) {
		return method5911(i, i_21_) & method5919(i, i_21_);
	}

	static final boolean method5925(int i, int i_22_) {
		return method5913(i, i_22_) & method5920(i, i_22_);
	}

	static final boolean method5926(int i, int i_23_) {
		return ((i & 0x70000) != 0 || method5904(i, i_23_) || method5960(i, i_23_));
	}

	static final boolean method5927(int i, int i_24_) {
		return ((i & 0x70000) != 0 || method5905(i, i_24_) || method5960(i, i_24_));
	}

	static final boolean method5928(int i, int i_25_) {
		return ((i & 0x70000) != 0 || method5906(i, i_25_) || method5960(i, i_25_));
	}

	static final boolean method5929(int i, int i_26_) {
		boolean bool = ((i_26_ & 0x37) != 0 ? method5975(i, i_26_) : method5923(i, i_26_));
		return (i & 0x10000) != 0 | method5908(i, i_26_) | bool;
	}

	static final boolean method5930(int i, int i_27_) {
		return ((i & 0x70000) != 0 || method5906(i, i_27_) || method5960(i, i_27_));
	}

	static final boolean method5931(int i, int i_28_) {
		return ((i & 0x40000) != 0 | method5977(i, i_28_) || method5923(i, i_28_));
	}

	static final boolean method5932(int i, int i_29_) {
		return (i & 0x20) != 0;
	}

	static final boolean method5933(int i, int i_30_) {
		return method5911(i, i_30_) || method5924(i, i_30_);
	}

	static final boolean method5934(int i, int i_31_) {
		return (i & 0x20) != 0;
	}

	static final boolean method5935(int i, int i_32_) {
		return (i & 0x100) != 0;
	}

	static final boolean method5936(int i, int i_33_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method5937(int i, int i_34_) {
		return (i & 0x800) != 0 | method5956(i, i_34_) || method5923(i, i_34_);
	}

	static final boolean method5938(int i, int i_35_) {
		return (i & 0x21) != 0;
	}

	static final boolean method5939(int i, int i_36_) {
		return (i & 0x21) != 0;
	}

	static final boolean method5940(int i, int i_37_) {
		return (i & 0x21) != 0;
	}

	static final boolean method5941(int i, int i_38_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method5942(int i, int i_39_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5943(int i, int i_40_) {
		return (i & 0x22) != 0;
	}

	static final boolean method5944(int i, int i_41_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5945(int i, int i_42_) {
		return (i & 0x34) != 0;
	}

	static final boolean method5946(int i, int i_43_) {
		return method5911(i, i_43_) || method5924(i, i_43_);
	}

	static final boolean method5947(int i, int i_44_) {
		return (i & 0x37) != 0;
	}

	static final boolean method5948(int i, int i_45_) {
		return (i & 0x100) != 0;
	}

	static final boolean method5949(int i, int i_46_) {
		return (i & 0x84080) != 0;
	}

	Class337() throws Throwable {
		throw new Error();
	}

	static final boolean method5950(int i, int i_47_) {
		return (i & 0x100) != 0;
	}

	static final boolean method5951(int i, int i_48_) {
		return (i & 0x22) != 0;
	}

	static final boolean method5952(int i, int i_49_) {
		boolean bool = ((i_49_ & 0x37) != 0 ? method5975(i, i_49_) : method5923(i, i_49_));
		return (i & 0x10000) != 0 | method5908(i, i_49_) | bool;
	}

	static final boolean method5953(int i, int i_50_) {
		return false;
	}

	static final boolean method5954(int i, int i_51_) {
		return (i & 0x10) != 0;
	}

	static final boolean method5955(int i, int i_52_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method5956(int i, int i_53_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method5957(int i, int i_54_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method5958(int i, int i_55_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method5959(int i, int i_56_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method5960(int i, int i_57_) {
		return ((method5904(i, i_57_) | method5905(i, i_57_) | method5906(i, i_57_)) & method5916(i, i_57_));
	}

	static final boolean method5961(int i, int i_58_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method5962(int i, int i_59_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method5963(int i, int i_60_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method5964(int i, int i_61_) {
		return ((i & 0x40000) != 0 | method5977(i, i_61_) || method5923(i, i_61_));
	}

	static final boolean method5965(int i, int i_62_) {
		return ((i & 0x70000) != 0 || method5906(i, i_62_) || method5960(i, i_62_));
	}

	static final boolean method5966(int i, int i_63_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5967(int i, int i_64_) {
		return ((method5904(i, i_64_) | method5905(i, i_64_) | method5906(i, i_64_)) & method5916(i, i_64_));
	}

	static final boolean method5968(int i, int i_65_) {
		return (i & 0x800) != 0 && (i_65_ & 0x37) != 0;
	}

	static final boolean method5969(int i, int i_66_) {
		return (i & 0x800) != 0 && (i_66_ & 0x37) != 0;
	}

	static final boolean method5970(int i, int i_67_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5971(int i, int i_68_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5972(int i, int i_69_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5973(int i, int i_70_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5974(int i, int i_71_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5975(int i, int i_72_) {
		return method5917(i, i_72_) & ((i & 0x2000) != 0 | method5908(i, i_72_) | method5936(i, i_72_));
	}

	static final boolean method5976(int i, int i_73_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method5977(int i, int i_74_) {
		return (i & 0x100) != 0;
	}

	static final boolean method5978(int i, int i_75_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5979(int i, int i_76_) {
		return (i & 0x21) != 0;
	}

	static final boolean method5980(int i, int i_77_) {
		return ((method5904(i, i_77_) | method5905(i, i_77_) | method5906(i, i_77_)) & method5916(i, i_77_));
	}

	static final boolean method5981(int i, int i_78_) {
		return (i & 0x34) != 0;
	}

	static final boolean method5982(int i, int i_79_) {
		if (!method5915(i, i_79_))
			return false;
		if ((i & 0x9000) != 0 | method5909(i, i_79_) | method5977(i, i_79_))
			return true;
		return (i_79_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5908(i, i_79_) | method5936(i, i_79_));
	}

	static final boolean method5983(int i, int i_80_) {
		return method5911(i, i_80_) & method5919(i, i_80_);
	}

	static final boolean method5984(int i, int i_81_) {
		return method5911(i, i_81_) & method5919(i, i_81_);
	}

	static final boolean method5985(int i, int i_82_) {
		return method5911(i, i_82_) & method5919(i, i_82_);
	}

	static final boolean method5986(int i, int i_83_) {
		return method5913(i, i_83_) & method5920(i, i_83_);
	}

	static final boolean method5987(int i, int i_84_) {
		return method5913(i, i_84_) & method5920(i, i_84_);
	}

	static final boolean method5988(int i, int i_85_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method5989(int i, int i_86_) {
		return ((i & 0x60000) != 0 | method5913(i, i_86_) || method5925(i, i_86_));
	}

	static final boolean method5990(int i, int i_87_) {
		return ((i & 0x70000) != 0 || method5904(i, i_87_) || method5960(i, i_87_));
	}

	static final boolean method5991(int i, int i_88_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5992(int i, int i_89_) {
		return method5909(i, i_89_) || method5923(i, i_89_);
	}

	static final boolean method5993(int i, int i_90_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5994(int i, int i_91_) {
		return ((i & 0x70000) != 0 || method5906(i, i_91_) || method5960(i, i_91_));
	}

	static final boolean method5995(int i, int i_92_) {
		boolean bool = ((i_92_ & 0x37) != 0 ? method5975(i, i_92_) : method5923(i, i_92_));
		return (i & 0x10000) != 0 | method5908(i, i_92_) | bool;
	}

	static final boolean method5996(int i, int i_93_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method5997(int i, int i_94_) {
		return (i & 0x180) != 0;
	}

	static final boolean method5998(int i, int i_95_) {
		return ((i & 0x40000) != 0 | method5977(i, i_95_) || method5923(i, i_95_));
	}

	static final boolean method5999(int i, int i_96_) {
		return ((i & 0x70000) != 0 || method5904(i, i_96_) || method5960(i, i_96_));
	}

	static final boolean method6000(int i, int i_97_) {
		return ((i & 0x40000) != 0 | method5977(i, i_97_) || method5923(i, i_97_));
	}

	static final boolean method6001(int i, int i_98_) {
		return ((i & 0x40000) != 0 | method5977(i, i_98_) || method5923(i, i_98_));
	}

	static final boolean method6002(int i, int i_99_) {
		return method5911(i, i_99_) || method5924(i, i_99_);
	}

	static final boolean method6003(int i, int i_100_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6004(int i, int i_101_) {
		return method5911(i, i_101_) || method5924(i, i_101_);
	}

	static final boolean method6005(int i, int i_102_) {
		return (i & 0x180) != 0;
	}

	static final boolean method6006(int i, int i_103_) {
		return (i & 0x180) != 0;
	}

	static final boolean method6007(int i, int i_104_) {
		return (i & 0x800) != 0;
	}

	static final boolean method6008(int i, int i_105_) {
		return method5909(i, i_105_) || method5923(i, i_105_);
	}

	static final boolean method6009(int i, int i_106_) {
		return ((i & 0x60000) != 0 | method5913(i, i_106_) || method5925(i, i_106_));
	}

	static final boolean method6010(int i, int i_107_) {
		return (i & 0x37) != 0;
	}

	static final boolean method6011(int i, int i_108_) {
		return ((i & 0x800) != 0 | method5956(i, i_108_) || method5923(i, i_108_));
	}
}
