/* Class630 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class630 {
	boolean aBool8231;
	int anInt8232;
	int anInt8233;
	int anInt8234;
	Class635 aClass635_8235;
	int anInt8236;
	int anInt8237;

	public int method7503(int i) {
		return 290725675 * anInt8236;
	}

	int method7504(int i) {
		return -1243192549 * anInt8233;
	}

	public boolean method7505(int i) {
		return aBool8231;
	}

	public int method7506(int i) {
		return -642321703 * anInt8234;
	}

	int method7507(int i) {
		if (i > -415518351 * anInt8232)
			i = -415518351 * anInt8232;
		return aClass635_8235.method7552(i - anInt8237 * 1862671173, (byte) -5);
	}

	public int method7508(int i, int i_0_) {
		int i_1_ = aClass635_8235.method7550(i, (byte) 45) + anInt8237 * 1862671173;
		if (i_1_ > anInt8232 * -415518351)
			return anInt8232 * -415518351;
		return i_1_;
	}

	public int method7509() {
		return 290725675 * anInt8236;
	}

	public int method7510(int i, int i_2_) {
		int i_3_ = i / 10;
		return method7508(i_3_, 483343009);
	}

	int method7511(int i, int i_4_) {
		if (i > -415518351 * anInt8232)
			i = -415518351 * anInt8232;
		return aClass635_8235.method7552(i - anInt8237 * 1862671173, (byte) -18);
	}

	int method7512(int i, byte i_5_) {
		return method7511(i, -1439018107) * 10;
	}

	int method7513() {
		return -1243192549 * anInt8233;
	}

	public boolean method7514() {
		return aBool8231;
	}

	public boolean method7515() {
		return aBool8231;
	}

	public int method7516() {
		return 290725675 * anInt8236;
	}

	public boolean method7517(int i) {
		return -1 != -642321703 * anInt8234;
	}

	Class630(int i, int i_6_, boolean bool, boolean bool_7_, int i_8_, Class635 class635, int i_9_) {
		anInt8233 = i * 2109292307;
		anInt8232 = i_6_ * 1359540113;
		aBool8231 = bool;
		aClass635_8235 = class635;
		anInt8237 = 1300840333 * i_9_;
		if (bool) {
			anInt8236 = i_8_ * 1297983363;
			anInt8234 = method7512(i_8_, (byte) -50) * 152071529;
		} else {
			anInt8236 = -1297983363;
			anInt8234 = -152071529;
		}
	}

	public int method7518(int i) {
		int i_10_ = aClass635_8235.method7550(i, (byte) 67) + anInt8237 * 1862671173;
		if (i_10_ > anInt8232 * -415518351)
			return anInt8232 * -415518351;
		return i_10_;
	}

	public int method7519(int i) {
		int i_11_ = (aClass635_8235.method7550(i, (byte) 106) + anInt8237 * 1862671173);
		if (i_11_ > anInt8232 * -415518351)
			return anInt8232 * -415518351;
		return i_11_;
	}

	public int method7520(int i) {
		int i_12_ = i / 10;
		return method7508(i_12_, 1444606534);
	}

	public int method7521(int i) {
		int i_13_ = i / 10;
		return method7508(i_13_, 1443816039);
	}

	public int method7522(int i) {
		int i_14_ = i / 10;
		return method7508(i_14_, 1398408887);
	}

	public int method7523(int i) {
		int i_15_ = i / 10;
		return method7508(i_15_, 824571246);
	}

	int method7524(int i) {
		if (i > -415518351 * anInt8232)
			i = -415518351 * anInt8232;
		return aClass635_8235.method7552(i - anInt8237 * 1862671173, (byte) -55);
	}

	public int method7525() {
		return 290725675 * anInt8236;
	}

	int method7526(int i) {
		return method7511(i, -1439018107) * 10;
	}

	int method7527(int i) {
		return method7511(i, -1439018107) * 10;
	}

	static final void method7528(Class536_Sub33_Sub2 class536_sub33_sub2, int i, Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2, int i_16_, int i_17_) {
		if (0 != (i_16_ & 0x1000)) {
			int i_18_ = class536_sub33_sub2.readUnsignedShortLE128(-1348417021);
			int i_19_ = class536_sub33_sub2.readIntV2((byte) 70);
			if (i_18_ == 65535)
				i_18_ = -1;
			int i_20_ = class536_sub33_sub2.readUnsignedByteC(2020455595);
			int i_21_ = i_20_ & 0x7;
			int i_22_ = i_20_ >> 3 & 0xf;
			if (i_22_ == 15)
				i_22_ = -1;
			boolean bool = (i_20_ >> 7 & 0x1) == 1;
			class649_sub1_sub5_sub1_sub2.method10917(i_18_, i_19_, i_21_, i_22_, bool, 1, 1400082898);
		}
		if (0 != (i_16_ & 0x8)) {
			int i_23_ = class536_sub33_sub2.readUnsignedByte(1496978059);
			byte[] is = new byte[i_23_];
			RSByteBuffer class536_sub33 = new RSByteBuffer(is);
			class536_sub33_sub2.method9762(is, 0, i_23_, 1732951361);
			Class95.aClass536_Sub33Array1154[i] = class536_sub33;
			class649_sub1_sub5_sub1_sub2.method11082(class536_sub33, 1446904106);
		}
		if ((i_16_ & 0x800000) != 0)
			class649_sub1_sub5_sub1_sub2.aBool12194 = class536_sub33_sub2.readUnsignedByteC(2106762247) == 1;
		if ((i_16_ & 0x400000) != 0) {
			String string = class536_sub33_sub2.readString((byte) 55);
			int i_24_ = class536_sub33_sub2.readUnsignedByte(-889169116);
			if ((i_24_ & 0x1) != 0)
				Class635.method7564(2, i_24_, class649_sub1_sub5_sub1_sub2.method11085(true, (byte) 1), class649_sub1_sub5_sub1_sub2.method11086(false, -2012118516), class649_sub1_sub5_sub1_sub2.aString12192, string, null, -1538266173);
			class649_sub1_sub5_sub1_sub2.method11090(string, 0, 0, (byte) -87);
		}
		if ((i_16_ & 0x10000) != 0) {
			int i_25_ = class536_sub33_sub2.readUnsignedShort128(-1296383888);
			int i_26_ = class536_sub33_sub2.readLEInt((short) 6828);
			if (i_25_ == 65535)
				i_25_ = -1;
			int i_27_ = class536_sub33_sub2.readUnsignedByte(-1721924385);
			int i_28_ = i_27_ & 0x7;
			int i_29_ = i_27_ >> 3 & 0xf;
			if (i_29_ == 15)
				i_29_ = -1;
			boolean bool = 1 == (i_27_ >> 7 & 0x1);
			class649_sub1_sub5_sub1_sub2.method10917(i_25_, i_26_, i_28_, i_29_, bool, 4, 464850627);
		}
		if ((i_16_ & 0x40) != 0) {
			class649_sub1_sub5_sub1_sub2.anInt12190 = class536_sub33_sub2.readUnsignedShortLE128(-1917492340) * 2114230253;
			if (-711375609 * class649_sub1_sub5_sub1_sub2.anInt11957 == 0) {
				class649_sub1_sub5_sub1_sub2.method10867(1763663333 * class649_sub1_sub5_sub1_sub2.anInt12190, -1576746716);
				class649_sub1_sub5_sub1_sub2.anInt12190 = -2114230253;
			}
		}
		if ((i_16_ & 0x200000) != 0) {
			int i_30_ = class536_sub33_sub2.readUnsignedShortLE(553295111);
			int i_31_ = class536_sub33_sub2.readInt(-1113038553);
			if (65535 == i_30_)
				i_30_ = -1;
			int i_32_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
			int i_33_ = i_32_ & 0x7;
			int i_34_ = i_32_ >> 3 & 0xf;
			if (i_34_ == 15)
				i_34_ = -1;
			boolean bool = (i_32_ >> 7 & 0x1) == 1;
			class649_sub1_sub5_sub1_sub2.method10917(i_30_, i_31_, i_33_, i_34_, bool, 3, 959501178);
		}
		if ((i_16_ & 0x400) != 0) {
			class649_sub1_sub5_sub1_sub2.aClass210_12200 = ((Class210) Class682.method8091(Class210.method2980(523152207), class536_sub33_sub2.readUnsignedByteC(2119715381), 1858049507));
			if (null == class649_sub1_sub5_sub1_sub2.aClass210_12200)
				class649_sub1_sub5_sub1_sub2.aClass210_12200 = Class210.aClass210_2258;
		}
		if (0 != (i_16_ & 0x40000)) {
			class649_sub1_sub5_sub1_sub2.anInterface3_11929.method29(-522502633);
			class536_sub33_sub2.off += 1032351030;
			int i_35_ = (class536_sub33_sub2.buffer[((class536_sub33_sub2.off += 516175515) * -810172525 - 1)]) & 0xff;
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				int i_37_ = class536_sub33_sub2.readUnsignedByte(-662937652);
				Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) 41), i_37_, 1858049507));
				Class430 class430 = (Class532.aClass98_Sub1_Sub1_7122.method8390(class536_sub33_sub2, class478, 275541441));
				class649_sub1_sub5_sub1_sub2.anInterface3_11929.method18(class430.anInt4820 * 706703961, class430.anObject4819, (byte) 24);
			}
		}
		if (0 != (i_16_ & 0x20)) {
			int i_38_ = class536_sub33_sub2.readUnsignedShort128(1067554259);
			if (65535 == i_38_)
				i_38_ = -1;
			class649_sub1_sub5_sub1_sub2.anInt11911 = i_38_ * -16791139;
		}
		if (0 != (i_16_ & 0x20000)) {
			class536_sub33_sub2.off += 1032351030;
			int i_39_ = (class536_sub33_sub2.buffer[((class536_sub33_sub2.off += 516175515) * -810172525 - 1)]) & 0xff;
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				int i_41_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
				Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) 10), i_41_, 1858049507));
				Class430 class430 = (Class532.aClass98_Sub1_Sub1_7122.method8390(class536_sub33_sub2, class478, 275541441));
				class649_sub1_sub5_sub1_sub2.anInterface3_11929.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) -18);
			}
		}
		if (0 != (i_16_ & 0x4)) {
			int i_42_ = class536_sub33_sub2.readUnsignedShortLE(-1489262230);
			int i_43_ = class536_sub33_sub2.readIntV1(1465048426);
			if (i_42_ == 65535)
				i_42_ = -1;
			int i_44_ = class536_sub33_sub2.readUnsignedByteC(2145609394);
			int i_45_ = i_44_ & 0x7;
			int i_46_ = i_44_ >> 3 & 0xf;
			if (15 == i_46_)
				i_46_ = -1;
			boolean bool = 1 == (i_44_ >> 7 & 0x1);
			class649_sub1_sub5_sub1_sub2.method10917(i_42_, i_43_, i_45_, i_46_, bool, 0, 1260695262);
		}
		if ((i_16_ & 0x10) != 0) {
			int[] is = new int[4];
			for (int i_47_ = 0; i_47_ < 4; i_47_++)
				is[i_47_] = class536_sub33_sub2.method9720((byte) 1);
			int i_48_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
			Class360_Sub1.method9269(class649_sub1_sub5_sub1_sub2, is, i_48_, false, 1131805852);
		}
		if (0 != (i_16_ & 0x1)) {
			int i_49_ = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
			if (i_49_ > 0) {
				for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
					int i_51_ = -1;
					int i_52_ = -1;
					int i_53_ = -1;
					int i_54_ = class536_sub33_sub2.readUnsignedSmart(1001043189);
					if (i_54_ == 32767) {
						i_54_ = class536_sub33_sub2.readUnsignedSmart(-1453868902);
						i_52_ = class536_sub33_sub2.readUnsignedSmart(-587219119);
						i_51_ = class536_sub33_sub2.readUnsignedSmart(1931985466);
						i_53_ = class536_sub33_sub2.readUnsignedSmart(-1487765605);
					} else if (i_54_ != 32766)
						i_52_ = class536_sub33_sub2.readUnsignedSmart(331693348);
					else {
						i_54_ = -1;
						i_52_ = class536_sub33_sub2.readUnsignedByte(-709576982);
					}
					int i_55_ = class536_sub33_sub2.readUnsignedSmart(78718253);
					class649_sub1_sub5_sub1_sub2.method10871(i_54_, i_52_, i_51_, i_53_, client.anInt11014, i_55_, 2141861727);
				}
			}
			int i_56_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
			if (i_56_ > 0) {
				for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
					int i_58_ = class536_sub33_sub2.readUnsignedSmart(-1345048628);
					int i_59_ = class536_sub33_sub2.readUnsignedSmart(-685857995);
					if (32767 != i_59_) {
						int i_60_ = class536_sub33_sub2.readUnsignedSmart(-1565752433);
						int i_61_ = class536_sub33_sub2.readUnsignedByte(862505345);
						int i_62_ = (i_59_ > 0 ? class536_sub33_sub2.readUnsignedByte128((byte) 0) : i_61_);
						class649_sub1_sub5_sub1_sub2.method10906(i_58_, (client.anInt11014), i_59_, i_60_, i_61_, i_62_, -1884532814);
					} else
						class649_sub1_sub5_sub1_sub2.method10872(i_58_, (short) 2456);
				}
			}
		}
		if ((i_16_ & 0x80000) != 0) {
			int i_63_ = class536_sub33_sub2.readUnsignedByteC(2146409837);
			int[] is = new int[i_63_];
			int[] is_64_ = new int[i_63_];
			for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
				int i_66_ = class536_sub33_sub2.readUnsignedShort((short) 27672);
				if ((i_66_ & 0xc000) == 49152) {
					int i_67_ = class536_sub33_sub2.readUnsignedShortLE128(-537280322);
					is[i_65_] = i_66_ << 16 | i_67_;
				} else
					is[i_65_] = i_66_;
				is_64_[i_65_] = class536_sub33_sub2.readUnsignedShortLE(-754229350);
			}
			class649_sub1_sub5_sub1_sub2.method10895(is, is_64_, 1653239322);
		}
		if (0 != (i_16_ & 0x8000)) {
			int i_68_ = class536_sub33_sub2.readUnsignedShortLE128(694556441);
			int i_69_ = class536_sub33_sub2.readIntV2((byte) 85);
			if (65535 == i_68_)
				i_68_ = -1;
			int i_70_ = class536_sub33_sub2.readUnsignedByte128((byte) 0);
			int i_71_ = i_70_ & 0x7;
			int i_72_ = i_70_ >> 3 & 0xf;
			if (i_72_ == 15)
				i_72_ = -1;
			boolean bool = 1 == (i_70_ >> 7 & 0x1);
			class649_sub1_sub5_sub1_sub2.method10917(i_68_, i_69_, i_71_, i_72_, bool, 2, 1862914719);
		}
		if ((i_16_ & 0x200) != 0) {
			int i_73_ = class536_sub33_sub2.readUnsignedByteC(2031343823);
			int[] is = new int[i_73_];
			int[] is_74_ = new int[i_73_];
			int[] is_75_ = new int[i_73_];
			for (int i_76_ = 0; i_76_ < i_73_; i_76_++) {
				is[i_76_] = class536_sub33_sub2.method9720((byte) 1);
				is_74_[i_76_] = class536_sub33_sub2.readUnsigned128Byte((short) 6408);
				is_75_[i_76_] = class536_sub33_sub2.readUnsignedShort128(-893487161);
			}
			Class74.method1139(class649_sub1_sub5_sub1_sub2, is, is_74_, is_75_, (byte) -25);
		}
		if (0 != (i_16_ & 0x2000)) {
			int i_77_ = class536_sub33_sub2.readUnsignedByte(1636599625);
			byte[] is = new byte[i_77_];
			RSByteBuffer class536_sub33 = new RSByteBuffer(is);
			class536_sub33_sub2.method9780(is, 0, i_77_, 397948282);
			Class95.aClass536_Sub33Array1155[i] = class536_sub33;
			class649_sub1_sub5_sub1_sub2.method11091(class536_sub33, 5101197);
		}
		if ((i_16_ & 0x4000) != 0) {
			String string = class536_sub33_sub2.readString((byte) 32);
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == class649_sub1_sub5_sub1_sub2)
				Class635.method7564(2, 0, class649_sub1_sub5_sub1_sub2.method11085(true, (byte) 1), class649_sub1_sub5_sub1_sub2.method11086(false, -2021464545), class649_sub1_sub5_sub1_sub2.aString12192, string, null, -1538266173);
			class649_sub1_sub5_sub1_sub2.method11090(string, 0, 0, (byte) -93);
		}
		if (0 != (i_16_ & 0x2)) {
			class649_sub1_sub5_sub1_sub2.anInt11916 = class536_sub33_sub2.readByte(-1788011662) * -339639515;
			class649_sub1_sub5_sub1_sub2.anInt11919 = class536_sub33_sub2.readByte128(2030841405) * 1183324809;
			class649_sub1_sub5_sub1_sub2.anInt11935 = class536_sub33_sub2.readByte128(-149637005) * -1437384935;
			class649_sub1_sub5_sub1_sub2.anInt11920 = class536_sub33_sub2.readByteC((byte) 0) * -1947310333;
			class649_sub1_sub5_sub1_sub2.anInt11921 = class536_sub33_sub2.readByte128(-1068764366) * 791753037;
			class649_sub1_sub5_sub1_sub2.anInt11922 = class536_sub33_sub2.read128Byte(1534909642) * 107491611;
			class649_sub1_sub5_sub1_sub2.anInt11923 = (class536_sub33_sub2.readUnsignedShort128(1068243784) + client.anInt11014) * -1372978185;
			class649_sub1_sub5_sub1_sub2.anInt11924 = (class536_sub33_sub2.readUnsignedShortLE(-1743461816) + client.anInt11014) * -652258591;
			class649_sub1_sub5_sub1_sub2.anInt11952 = class536_sub33_sub2.readUnsignedShort128(-1814207975) * -2105433735;
			class649_sub1_sub5_sub1_sub2.anInt11957 = 1754339511;
			class649_sub1_sub5_sub1_sub2.anInt11948 = 0;
			class649_sub1_sub5_sub1_sub2.anInt11916 += (-339639515 * class649_sub1_sub5_sub1_sub2.anIntArray11944[0]);
			class649_sub1_sub5_sub1_sub2.anInt11919 += (class649_sub1_sub5_sub1_sub2.anIntArray11945[0] * 1183324809);
			class649_sub1_sub5_sub1_sub2.anInt11935 += (class649_sub1_sub5_sub1_sub2.anIntArray11944[0] * -1437384935);
			class649_sub1_sub5_sub1_sub2.anInt11920 += (-1947310333 * class649_sub1_sub5_sub1_sub2.anIntArray11945[0]);
			class649_sub1_sub5_sub1_sub2.anInt11921 += class649_sub1_sub5_sub1_sub2.aByte10839 * 791753037;
			class649_sub1_sub5_sub1_sub2.anInt11922 += 107491611 * class649_sub1_sub5_sub1_sub2.aByte10839;
		}
		if (0 != (i_16_ & 0x100000)) {
			class649_sub1_sub5_sub1_sub2.aByte11928 = class536_sub33_sub2.readByteC((byte) 0);
			class649_sub1_sub5_sub1_sub2.aByte11936 = class536_sub33_sub2.readByte128(-409858559);
			class649_sub1_sub5_sub1_sub2.aByte11930 = class536_sub33_sub2.read128Byte(1716414138);
			class649_sub1_sub5_sub1_sub2.aByte11958 = (byte) class536_sub33_sub2.readUnsignedByte(-902817352);
			class649_sub1_sub5_sub1_sub2.anInt11926 = (client.anInt11014 + class536_sub33_sub2.readUnsignedShortLE(711967802)) * 2109855411;
			class649_sub1_sub5_sub1_sub2.anInt11927 = (client.anInt11014 + class536_sub33_sub2.readUnsignedShortLE(1513530620)) * -2120654239;
		}
	}
}
