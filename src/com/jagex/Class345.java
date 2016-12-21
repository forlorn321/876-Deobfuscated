/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class345 {
	static final boolean method4489(int i, int i_0_) {
		return method4496(i, i_0_) & method4541(i, i_0_);
	}

	static final boolean method4490(int i, int i_1_) {
		return (i & 0x21) != 0;
	}

	static final boolean method4491(int i, int i_2_) {
		return (i & 0x34) != 0;
	}

	static final boolean method4492(int i, int i_3_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4493(int i, int i_4_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method4494(int i, int i_5_) {
		return method4496(i, i_5_) & method4541(i, i_5_);
	}

	static final boolean method4495(int i, int i_6_) {
		return ((i & 0x70000) != 0 || method4499(i, i_6_) || method4506(i, i_6_));
	}

	static final boolean method4496(int i, int i_7_) {
		return false;
	}

	static final boolean method4497(int i, int i_8_) {
		return (i & 0x10) != 0;
	}

	static final boolean method4498(int i, int i_9_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method4499(int i, int i_10_) {
		return (i & 0x22) != 0;
	}

	static final boolean method4500(int i, int i_11_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method4501(int i, int i_12_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4502(int i, int i_13_) {
		return (i & 0x800) != 0 && (i_13_ & 0x37) != 0;
	}

	static final boolean method4503(int i, int i_14_) {
		return ((i & 0x40000) != 0 | method4507(i, i_14_) || method4558(i, i_14_));
	}

	static final boolean method4504(int i, int i_15_) {
		return false;
	}

	static final boolean method4505(int i, int i_16_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4506(int i, int i_17_) {
		return ((method4490(i, i_17_) | method4499(i, i_17_) | method4491(i, i_17_)) & method4501(i, i_17_));
	}

	static final boolean method4507(int i, int i_18_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4508(int i, int i_19_) {
		return method4496(i, i_19_) & method4541(i, i_19_);
	}

	static final boolean method4509(int i, int i_20_) {
		return method4497(i, i_20_) & method4505(i, i_20_);
	}

	static final boolean method4510(int i, int i_21_) {
		return ((i & 0x70000) != 0 || method4490(i, i_21_) || method4506(i, i_21_));
	}

	static final boolean method4511(int i, int i_22_) {
		return ((method4490(i, i_22_) | method4499(i, i_22_) | method4491(i, i_22_)) & method4501(i, i_22_));
	}

	static final boolean method4512(int i, int i_23_) {
		return ((i & 0x70000) != 0 || method4491(i, i_23_) || method4506(i, i_23_));
	}

	static final boolean method4513(int i, int i_24_) {
		boolean bool = ((i_24_ & 0x37) != 0 ? method4531(i, i_24_) : method4558(i, i_24_));
		return (i & 0x10000) != 0 | method4493(i, i_24_) | bool;
	}

	static final boolean method4514(int i, int i_25_) {
		return method4532(i, i_25_) || method4558(i, i_25_);
	}

	static final boolean method4515(int i, int i_26_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method4516(int i, int i_27_) {
		return method4496(i, i_27_) || method4508(i, i_27_);
	}

	static final boolean method4517(int i, int i_28_) {
		return (i & 0x180) != 0;
	}

	static final boolean method4518(int i, int i_29_) {
		return (i & 0x20) != 0;
	}

	static final boolean method4519(int i, int i_30_) {
		return (i & 0x400) != 0;
	}

	static final boolean method4520(int i, int i_31_) {
		return ((i & 0x60000) != 0 | method4497(i, i_31_) || method4509(i, i_31_));
	}

	static final boolean method4521(int i, int i_32_) {
		return (i & 0x800) != 0 | method4498(i, i_32_) || method4558(i, i_32_);
	}

	static final boolean method4522(int i, int i_33_) {
		return (i & 0x21) != 0;
	}

	static final boolean method4523(int i, int i_34_) {
		return (i & 0x34) != 0;
	}

	static final boolean method4524(int i, int i_35_) {
		return (i & 0x34) != 0;
	}

	static final boolean method4525(int i, int i_36_) {
		return (i & 0x37) != 0;
	}

	static final boolean method4526(int i, int i_37_) {
		return (i & 0x37) != 0;
	}

	static final boolean method4527(int i, int i_38_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method4528(int i, int i_39_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method4529(int i, int i_40_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method4530(int i, int i_41_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4531(int i, int i_42_) {
		return method4502(i, i_42_) & ((i & 0x2000) != 0 | method4493(i, i_42_) | method4500(i, i_42_));
	}

	static final boolean method4532(int i, int i_43_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method4533(int i, int i_44_) {
		return (i & 0x800) != 0 && (i_44_ & 0x37) != 0;
	}

	static final boolean method4534(int i, int i_45_) {
		return (i & 0x10) != 0;
	}

	static final boolean method4535(int i, int i_46_) {
		return (i & 0x8000) != 0;
	}

	Class345() throws Throwable {
		throw new Error();
	}

	static final boolean method4536(int i, int i_47_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method4537(int i, int i_48_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method4538(int i, int i_49_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method4539(int i, int i_50_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method4540(int i, int i_51_) {
		return (i & 0x37) != 0;
	}

	static final boolean method4541(int i, int i_52_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4542(int i, int i_53_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4543(int i, int i_54_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4544(int i, int i_55_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4545(int i, int i_56_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4546(int i, int i_57_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4547(int i, int i_58_) {
		return ((method4490(i, i_58_) | method4499(i, i_58_) | method4491(i, i_58_)) & method4501(i, i_58_));
	}

	static final boolean method4548(int i, int i_59_) {
		return ((method4490(i, i_59_) | method4499(i, i_59_) | method4491(i, i_59_)) & method4501(i, i_59_));
	}

	static final boolean method4549(int i, int i_60_) {
		return method4497(i, i_60_) & method4505(i, i_60_);
	}

	static final boolean method4550(int i, int i_61_) {
		if (!method4492(i, i_61_))
			return false;
		if ((i & 0x9000) != 0 | method4532(i, i_61_) | method4507(i, i_61_))
			return true;
		return (i_61_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4493(i, i_61_) | method4500(i, i_61_));
	}

	static final boolean method4551(int i, int i_62_) {
		if (!method4492(i, i_62_))
			return false;
		if ((i & 0x9000) != 0 | method4532(i, i_62_) | method4507(i, i_62_))
			return true;
		return (i_62_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4493(i, i_62_) | method4500(i, i_62_));
	}

	static final boolean method4552(int i, int i_63_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4553(int i, int i_64_) {
		boolean bool = ((i_64_ & 0x37) != 0 ? method4531(i, i_64_) : method4558(i, i_64_));
		return (i & 0x10000) != 0 | method4493(i, i_64_) | bool;
	}

	static final boolean method4554(int i, int i_65_) {
		return method4496(i, i_65_) & method4541(i, i_65_);
	}

	static final boolean method4555(int i, int i_66_) {
		return method4497(i, i_66_) & method4505(i, i_66_);
	}

	static final boolean method4556(int i, int i_67_) {
		return method4497(i, i_67_) & method4505(i, i_67_);
	}

	static final boolean method4557(int i, int i_68_) {
		return ((i & 0x70000) != 0 || method4491(i, i_68_) || method4506(i, i_68_));
	}

	static final boolean method4558(int i, int i_69_) {
		if (!method4492(i, i_69_))
			return false;
		if ((i & 0x9000) != 0 | method4532(i, i_69_) | method4507(i, i_69_))
			return true;
		return (i_69_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4493(i, i_69_) | method4500(i, i_69_));
	}

	static final boolean method4559(int i, int i_70_) {
		return false;
	}

	static final boolean method4560(int i, int i_71_) {
		return ((i & 0x70000) != 0 || method4490(i, i_71_) || method4506(i, i_71_));
	}

	static final boolean method4561(int i, int i_72_) {
		return ((i & 0x70000) != 0 || method4499(i, i_72_) || method4506(i, i_72_));
	}

	static final boolean method4562(int i, int i_73_) {
		return ((i & 0x70000) != 0 || method4491(i, i_73_) || method4506(i, i_73_));
	}

	static final boolean method4563(int i, int i_74_) {
		return (i & 0x800) != 0 && (i_74_ & 0x37) != 0;
	}

	static final boolean method4564(int i, int i_75_) {
		boolean bool = ((i_75_ & 0x37) != 0 ? method4531(i, i_75_) : method4558(i, i_75_));
		return (i & 0x10000) != 0 | method4493(i, i_75_) | bool;
	}

	static final boolean method4565(int i, int i_76_) {
		boolean bool = ((i_76_ & 0x37) != 0 ? method4531(i, i_76_) : method4558(i, i_76_));
		return (i & 0x10000) != 0 | method4493(i, i_76_) | bool;
	}

	static final boolean method4566(int i, int i_77_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4567(int i, int i_78_) {
		return method4532(i, i_78_) || method4558(i, i_78_);
	}

	static final boolean method4568(int i, int i_79_) {
		return method4532(i, i_79_) || method4558(i, i_79_);
	}

	static final boolean method4569(int i, int i_80_) {
		return method4532(i, i_80_) || method4558(i, i_80_);
	}

	static final boolean method4570(int i, int i_81_) {
		return method4496(i, i_81_) || method4508(i, i_81_);
	}

	static final boolean method4571(int i, int i_82_) {
		return method4496(i, i_82_) || method4508(i, i_82_);
	}

	static final boolean method4572(int i, int i_83_) {
		return (i & 0x180) != 0;
	}

	static final boolean method4573(int i, int i_84_) {
		return (i & 0x180) != 0;
	}

	static final boolean method4574(int i, int i_85_) {
		return (i & 0x180) != 0;
	}

	static final boolean method4575(int i, int i_86_) {
		return (i & 0x20) != 0;
	}

	static final boolean method4576(int i, int i_87_) {
		return ((i & 0x70000) != 0 || method4490(i, i_87_) || method4506(i, i_87_));
	}

	static final boolean method4577(int i, int i_88_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method4578(int i, int i_89_) {
		return (i & 0x10) != 0;
	}

	static final boolean method4579(int i, int i_90_) {
		return ((i & 0x70000) != 0 || method4490(i, i_90_) || method4506(i, i_90_));
	}

	static final boolean method4580(int i, int i_91_) {
		return (i & 0x800) != 0 | method4498(i, i_91_) || method4558(i, i_91_);
	}

	static final boolean method4581(int i, int i_92_) {
		return method4502(i, i_92_) & ((i & 0x2000) != 0 | method4493(i, i_92_) | method4500(i, i_92_));
	}
}
