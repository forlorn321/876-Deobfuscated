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

	static final void decodePlayerMasks(RSBitBuffer buffer, int playerIndex, Player player, int flag) {
		if (0 != (flag & 0x1000)) {
			int i_18_ = buffer.readUnsignedShortLE128();
			int i_19_ = buffer.readIntV2((byte) 70);
			if (i_18_ == 65535)
				i_18_ = -1;
			int i_20_ = buffer.readUnsignedByteC(2020455595);
			int i_21_ = i_20_ & 0x7;
			int i_22_ = i_20_ >> 3 & 0xf;
			if (i_22_ == 15)
				i_22_ = -1;
			boolean bool = (i_20_ >> 7 & 0x1) == 1;
			player.method10917(i_18_, i_19_, i_21_, i_22_, bool, 1, 1400082898);
		}
		if (0 != (flag & 0x8)) {
			int renderSize = buffer.readUnsignedByte();
			byte[] bytes = new byte[renderSize];
			RSByteBuffer renderData = new RSByteBuffer(bytes);
			buffer.readBytesReverse(bytes, 0, renderSize, 1732951361);
			Class95.playerRenderData[playerIndex] = renderData;
			player.decodePlayerAppearance(renderData);
		}
		if ((flag & 0x800000) != 0)
			player.aBool12194 = buffer.readUnsignedByteC(2106762247) == 1;
		if ((flag & 0x400000) != 0) {
			String string = buffer.readString();
			int i_24_ = buffer.readUnsignedByte();
			if ((i_24_ & 0x1) != 0)
				Class635.method7564(2, i_24_, player.method11085(true, (byte) 1), player.method11086(false, -2012118516), player.aString12192, string, null, -1538266173);
			player.method11090(string, 0, 0, (byte) -87);
		}
		if ((flag & 0x10000) != 0) {
			int i_25_ = buffer.readUnsignedShort128();
			int i_26_ = buffer.readLEInt();
			if (i_25_ == 65535)
				i_25_ = -1;
			int i_27_ = buffer.readUnsignedByte();
			int i_28_ = i_27_ & 0x7;
			int i_29_ = i_27_ >> 3 & 0xf;
			if (i_29_ == 15)
				i_29_ = -1;
			boolean bool = 1 == (i_27_ >> 7 & 0x1);
			player.method10917(i_25_, i_26_, i_28_, i_29_, bool, 4, 464850627);
		}
		if ((flag & 0x40) != 0) {
			player.anInt12190 = buffer.readUnsignedShortLE128() * 2114230253;
			if (-711375609 * player.anInt11957 == 0) {
				player.method10867(1763663333 * player.anInt12190, -1576746716);
				player.anInt12190 = -2114230253;
			}
		}
		if ((flag & 0x200000) != 0) {
			int i_30_ = buffer.readUnsignedShortLE();
			int i_31_ = buffer.readInt();
			if (65535 == i_30_)
				i_30_ = -1;
			int i_32_ = buffer.readUnsignedByte128();
			int i_33_ = i_32_ & 0x7;
			int i_34_ = i_32_ >> 3 & 0xf;
			if (i_34_ == 15)
				i_34_ = -1;
			boolean bool = (i_32_ >> 7 & 0x1) == 1;
			player.method10917(i_30_, i_31_, i_33_, i_34_, bool, 3, 959501178);
		}
		if ((flag & 0x400) != 0) {
			player.aClass210_12200 = ((Class210) Class682.method8091(Class210.method2980(523152207), buffer.readUnsignedByteC(2119715381), 1858049507));
			if (null == player.aClass210_12200)
				player.aClass210_12200 = Class210.aClass210_2258;
		}
		if (0 != (flag & 0x40000)) {
			player.anInterface3_11929.method29(-522502633);
			buffer.off += 1032351030;
			int i_35_ = (buffer.buffer[((buffer.off += 516175515) * -810172525 - 1)]) & 0xff;
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				int i_37_ = buffer.readUnsignedByte();
				Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) 41), i_37_, 1858049507));
				Class430 class430 = (Class532.aClass98_Sub1_Sub1_7122.method8390(buffer, class478, 275541441));
				player.anInterface3_11929.method18(class430.anInt4820 * 706703961, class430.anObject4819, (byte) 24);
			}
		}
		if (0 != (flag & 0x20)) {
			int i_38_ = buffer.readUnsignedShort128();
			if (65535 == i_38_)
				i_38_ = -1;
			player.anInt11911 = i_38_ * -16791139;
		}
		if (0 != (flag & 0x20000)) {
			buffer.off += 1032351030;
			int i_39_ = (buffer.buffer[((buffer.off += 516175515) * -810172525 - 1)]) & 0xff;
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				int i_41_ = buffer.readUnsignedByte128();
				Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) 10), i_41_, 1858049507));
				Class430 class430 = (Class532.aClass98_Sub1_Sub1_7122.method8390(buffer, class478, 275541441));
				player.anInterface3_11929.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) -18);
			}
		}
		if (0 != (flag & 0x4)) {
			int i_42_ = buffer.readUnsignedShortLE();
			int i_43_ = buffer.readIntV1();
			if (i_42_ == 65535)
				i_42_ = -1;
			int i_44_ = buffer.readUnsignedByteC(2145609394);
			int i_45_ = i_44_ & 0x7;
			int i_46_ = i_44_ >> 3 & 0xf;
			if (15 == i_46_)
				i_46_ = -1;
			boolean bool = 1 == (i_44_ >> 7 & 0x1);
			player.method10917(i_42_, i_43_, i_45_, i_46_, bool, 0, 1260695262);
		}
		if ((flag & 0x10) != 0) {
			int[] is = new int[4];
			for (int i_47_ = 0; i_47_ < 4; i_47_++)
				is[i_47_] = buffer.readBigSmart((byte) 1);
			int i_48_ = buffer.readUnsigned128Byte();
			Class360_Sub1.method9269(player, is, i_48_, false, 1131805852);
		}
		if (0 != (flag & 0x1)) {
			int i_49_ = buffer.readUnsigned128Byte();
			if (i_49_ > 0) {
				for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
					int i_51_ = -1;
					int i_52_ = -1;
					int i_53_ = -1;
					int i_54_ = buffer.readUnsignedSmart(1001043189);
					if (i_54_ == 32767) {
						i_54_ = buffer.readUnsignedSmart(-1453868902);
						i_52_ = buffer.readUnsignedSmart(-587219119);
						i_51_ = buffer.readUnsignedSmart(1931985466);
						i_53_ = buffer.readUnsignedSmart(-1487765605);
					} else if (i_54_ != 32766)
						i_52_ = buffer.readUnsignedSmart(331693348);
					else {
						i_54_ = -1;
						i_52_ = buffer.readUnsignedByte();
					}
					int i_55_ = buffer.readUnsignedSmart(78718253);
					player.method10871(i_54_, i_52_, i_51_, i_53_, client.anInt11014, i_55_, 2141861727);
				}
			}
			int i_56_ = buffer.readUnsignedByte128();
			if (i_56_ > 0) {
				for (int i_57_ = 0; i_57_ < i_56_; i_57_++) {
					int i_58_ = buffer.readUnsignedSmart(-1345048628);
					int i_59_ = buffer.readUnsignedSmart(-685857995);
					if (32767 != i_59_) {
						int i_60_ = buffer.readUnsignedSmart(-1565752433);
						int i_61_ = buffer.readUnsignedByte();
						int i_62_ = (i_59_ > 0 ? buffer.readUnsignedByte128() : i_61_);
						player.method10906(i_58_, (client.anInt11014), i_59_, i_60_, i_61_, i_62_, -1884532814);
					} else
						player.method10872(i_58_, (short) 2456);
				}
			}
		}
		if ((flag & 0x80000) != 0) {
			int i_63_ = buffer.readUnsignedByteC(2146409837);
			int[] is = new int[i_63_];
			int[] is_64_ = new int[i_63_];
			for (int i_65_ = 0; i_65_ < i_63_; i_65_++) {
				int i_66_ = buffer.readUnsignedShort();
				if ((i_66_ & 0xc000) == 49152) {
					int i_67_ = buffer.readUnsignedShortLE128();
					is[i_65_] = i_66_ << 16 | i_67_;
				} else
					is[i_65_] = i_66_;
				is_64_[i_65_] = buffer.readUnsignedShortLE();
			}
			player.method10895(is, is_64_, 1653239322);
		}
		if (0 != (flag & 0x8000)) {
			int i_68_ = buffer.readUnsignedShortLE128();
			int i_69_ = buffer.readIntV2((byte) 85);
			if (65535 == i_68_)
				i_68_ = -1;
			int i_70_ = buffer.readUnsignedByte128();
			int i_71_ = i_70_ & 0x7;
			int i_72_ = i_70_ >> 3 & 0xf;
			if (i_72_ == 15)
				i_72_ = -1;
			boolean bool = 1 == (i_70_ >> 7 & 0x1);
			player.method10917(i_68_, i_69_, i_71_, i_72_, bool, 2, 1862914719);
		}
		if ((flag & 0x200) != 0) {
			int i_73_ = buffer.readUnsignedByteC(2031343823);
			int[] is = new int[i_73_];
			int[] is_74_ = new int[i_73_];
			int[] is_75_ = new int[i_73_];
			for (int i_76_ = 0; i_76_ < i_73_; i_76_++) {
				is[i_76_] = buffer.readBigSmart((byte) 1);
				is_74_[i_76_] = buffer.readUnsigned128Byte();
				is_75_[i_76_] = buffer.readUnsignedShort128();
			}
			Class74.method1139(player, is, is_74_, is_75_, (byte) -25);
		}
		if (0 != (flag & 0x2000)) {
			int i_77_ = buffer.readUnsignedByte();
			byte[] is = new byte[i_77_];
			RSByteBuffer class536_sub33 = new RSByteBuffer(is);
			buffer.method9780(is, 0, i_77_, 397948282);
			Class95.aClass536_Sub33Array1155[playerIndex] = class536_sub33;
			player.method11091(class536_sub33, 5101197);
		}
		if ((flag & 0x4000) != 0) {
			String string = buffer.readString();
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == player)
				Class635.method7564(2, 0, player.method11085(true, (byte) 1), player.method11086(false, -2021464545), player.aString12192, string, null, -1538266173);
			player.method11090(string, 0, 0, (byte) -93);
		}
		if (0 != (flag & 0x2)) {
			player.anInt11916 = buffer.readByte() * -339639515;
			player.anInt11919 = buffer.readByte128(2030841405) * 1183324809;
			player.anInt11935 = buffer.readByte128(-149637005) * -1437384935;
			player.anInt11920 = buffer.readByteC() * -1947310333;
			player.anInt11921 = buffer.readByte128(-1068764366) * 791753037;
			player.anInt11922 = buffer.read128Byte() * 107491611;
			player.anInt11923 = (buffer.readUnsignedShort128() + client.anInt11014) * -1372978185;
			player.anInt11924 = (buffer.readUnsignedShortLE() + client.anInt11014) * -652258591;
			player.anInt11952 = buffer.readUnsignedShort128() * -2105433735;
			player.anInt11957 = 1754339511;
			player.anInt11948 = 0;
			player.anInt11916 += (-339639515 * player.anIntArray11944[0]);
			player.anInt11919 += (player.anIntArray11945[0] * 1183324809);
			player.anInt11935 += (player.anIntArray11944[0] * -1437384935);
			player.anInt11920 += (-1947310333 * player.anIntArray11945[0]);
			player.anInt11921 += player.aByte10839 * 791753037;
			player.anInt11922 += 107491611 * player.aByte10839;
		}
		if (0 != (flag & 0x100000)) {
			player.aByte11928 = buffer.readByteC();
			player.aByte11936 = buffer.readByte128(-409858559);
			player.aByte11930 = buffer.read128Byte();
			player.aByte11958 = (byte) buffer.readUnsignedByte();
			player.anInt11926 = (client.anInt11014 + buffer.readUnsignedShortLE()) * 2109855411;
			player.anInt11927 = (client.anInt11014 + buffer.readUnsignedShortLE()) * -2120654239;
		}
	}
}
