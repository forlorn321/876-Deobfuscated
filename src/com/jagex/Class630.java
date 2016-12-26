/* Class630 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.List;

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
		if (0 != (flag & 0x1000)) { //graphics_2
			int i_18_ = buffer.readUnsignedShortLE128();
			int i_19_ = buffer.readIntV2();
			if (i_18_ == 65535)
				i_18_ = -1;
			int i_20_ = buffer.readUnsignedByteC();
			int i_21_ = i_20_ & 0x7;
			int i_22_ = i_20_ >> 3 & 0xf;
			if (i_22_ == 15)
				i_22_ = -1;
			boolean bool = (i_20_ >> 7 & 0x1) == 1;
			player.method10917(i_18_, i_19_, i_21_, i_22_, bool, 1, 1400082898);
		}
		if (0 != (flag & 0x8)) { //appearance
			int renderSize = buffer.readUnsignedByte();
			byte[] bytes = new byte[renderSize];
			RSByteBuffer renderData = new RSByteBuffer(bytes);
			buffer.readBytesReverse(bytes, 0, renderSize, 1732951361);
			Class95.playerRenderData[playerIndex] = renderData;
			player.decodePlayerAppearance(renderData);
		}
		if ((flag & 0x800000) != 0) //clan_member
			player.isClanMember = buffer.readUnsignedByteC() == 1;
		if ((flag & 0x400000) != 0) { //unknown
			String string = buffer.readString();
			int i_24_ = buffer.readUnsignedByte();
			if ((i_24_ & 0x1) != 0)
				Class635.method7564(2, i_24_, player.method11085(true, (byte) 1), player.method11086(false, -2012118516), player.aString12192, string, null, -1538266173);
			player.method11090(string, 0, 0, (byte) -87);
		}
		if ((flag & 0x10000) != 0) { //not used
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
		if ((flag & 0x40) != 0) { //face_dir
			player.faceDirection = buffer.readUnsignedShortLE128() * 2114230253;
			if (-711375609 * player.stepsCount == 0) {
				player.method10867(1763663333 * player.faceDirection);
				player.faceDirection = -2114230253;
			}
		}
		if ((flag & 0x200000) != 0) { //graphics_4
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
		if ((flag & 0x400) != 0) { //unknown
			player.aClass210_12200 = ((Class210) Class682.method8091(Class210.method2980(523152207), buffer.readUnsignedByteC(), 1858049507));
			if (null == player.aClass210_12200)
				player.aClass210_12200 = Class210.aClass210_2258;
		}
		if (0 != (flag & 0x40000)) { //unknown
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
		if (0 != (flag & 0x20)) { //face_entity
			int i_38_ = buffer.readUnsignedShort128();
			if (65535 == i_38_)
				i_38_ = -1;
			player.anInt11911 = i_38_ * -16791139;
		}
		if (0 != (flag & 0x20000)) { //unknown
			buffer.off += 1032351030;
			int i_39_ = (buffer.buffer[((buffer.off += 516175515) * -810172525 - 1)]) & 0xff;
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				int i_41_ = buffer.readUnsignedByte128();
				Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) 10), i_41_, 1858049507));
				Class430 class430 = (Class532.aClass98_Sub1_Sub1_7122.method8390(buffer, class478, 275541441));
				player.anInterface3_11929.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) -18);
			}
		}
		if (0 != (flag & 0x4)) { //graphics_1
			int i_42_ = buffer.readUnsignedShortLE();
			int i_43_ = buffer.readIntV1();
			if (i_42_ == 65535)
				i_42_ = -1;
			int i_44_ = buffer.readUnsignedByteC();
			int i_45_ = i_44_ & 0x7;
			int i_46_ = i_44_ >> 3 & 0xf;
			if (15 == i_46_)
				i_46_ = -1;
			boolean bool = 1 == (i_44_ >> 7 & 0x1);
			player.method10917(i_42_, i_43_, i_45_, i_46_, bool, 0, 1260695262);
		}
		if ((flag & 0x10) != 0) { //animation
			int[] animation_id = new int[4];
			for (int i = 0; i < 4; i++)
				animation_id[i] = buffer.readBigSmart((byte) 1);
			int delay = buffer.readUnsigned128Byte();
			Class360_Sub1.method9269(player, animation_id, delay, false);
		}
		if (0 != (flag & 0x1)) {
			int hitsSize = buffer.readUnsigned128Byte();
			if (hitsSize > 0) {
				for (int i = 0; i < hitsSize; i++) {
					int soakingMark = -1;
					int damage = -1;
					int soakingDisplay = -1;
					int hitType = buffer.readUnsignedSmart();
					if (hitType == 32767) { //soaking
						hitType = buffer.readUnsignedSmart();
						damage = buffer.readUnsignedSmart();
						soakingMark = buffer.readUnsignedSmart();
						soakingDisplay = buffer.readUnsignedSmart();
					} else if (hitType != 32766) //soaked
						damage = buffer.readUnsignedSmart();
					else { //no soaking
						hitType = -1;
						damage = buffer.readUnsignedByte();
					}
					int i_55_ = buffer.readUnsignedSmart();
					player.method10871(hitType, damage, soakingMark, soakingDisplay, client.anInt11014, i_55_, 2141861727);
				}
			}
			int hitBarSize = buffer.readUnsignedByte128();
			if (hitBarSize > 0) {
				for (int i = 0; i < hitBarSize; i++) {
					int type = buffer.readUnsignedSmart();
					int display = buffer.readUnsignedSmart();
					if (32767 != display) {
						int delay = buffer.readUnsignedSmart();
						int percentage = buffer.readUnsignedByte();
						int toPercentage = (display > 0 ? buffer.readUnsignedByte128() : percentage);
						player.method10906(type, (client.anInt11014), display, delay, percentage, toPercentage, -1884532814);
					} else
						player.method10872(type, (short) 2456);
				}
			}
		}
		if ((flag & 0x80000) != 0) { //unknown
			int i_63_ = buffer.readUnsignedByteC();
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
		if (0 != (flag & 0x8000)) { //graphics_3
			int i_68_ = buffer.readUnsignedShortLE128();
			int i_69_ = buffer.readIntV2();
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
		if ((flag & 0x200) != 0) { //unknown
			int i_73_ = buffer.readUnsignedByteC();
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
		if (0 != (flag & 0x2000)) { //icons
			int iconSize = buffer.readUnsignedByte();
			byte[] bytes = new byte[iconSize];
			RSByteBuffer iconData = new RSByteBuffer(bytes);
			buffer.readBytesReverse128(bytes, 0, iconSize, 397948282);
			Class95.iconData[playerIndex] = iconData;
			player.decodeIcons(iconData);
		}
		if ((flag & 0x4000) != 0) {
			String string = buffer.readString();
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == player)
				Class635.method7564(2, 0, player.method11085(true, (byte) 1), player.method11086(false, -2021464545), player.aString12192, string, null, -1538266173);
			player.method11090(string, 0, 0, (byte) -93);
		}
		if (0 != (flag & 0x2)) {
			int i1 = buffer.readByte();
			int i2 = buffer.readByte128();
			int i3 = buffer.readByte128();
			int i4 = buffer.readByteC();
			int i5 = buffer.readByte128();
			int i6 = buffer.read128Byte();
			int i7 = buffer.readUnsignedShort128();
			int i8 = buffer.readUnsignedShortLE();
			int i9 = buffer.readUnsignedShort128();
			List<Integer> list = Arrays.asList(i1, i2, i3, i4, i5, i6, i7, i8, i9);
			list.stream().forEach(System.out::println);
			player.anInt11916 = i1 * -339639515;
			player.anInt11919 = i2 * 1183324809;
			player.anInt11935 = i3 * -1437384935;
			player.anInt11920 = i4 * -1947310333;
			player.anInt11921 = i5 * 791753037;
			player.anInt11922 = i6 * 107491611;
			player.anInt11923 = (i7 + client.anInt11014) * -1372978185;
			player.anInt11924 = (i8 + client.anInt11014) * -652258591;
			player.anInt11952 = i9 * -2105433735;
			player.stepsCount = 1754339511;
			player.anInt11948 = 0;
			player.anInt11916 += (-339639515 * player.screenX[0]);
			player.anInt11919 += (player.screenY[0] * 1183324809);
			player.anInt11935 += (player.screenX[0] * -1437384935);
			player.anInt11920 += (-1947310333 * player.screenY[0]);
			player.anInt11921 += player.aByte10839 * 791753037;
			player.anInt11922 += 107491611 * player.aByte10839;
			
		}
		if (0 != (flag & 0x100000)) {
			player.aByte11928 = buffer.readByteC();
			player.aByte11936 = buffer.readByte128();
			player.aByte11930 = buffer.read128Byte();
			player.aByte11958 = (byte) buffer.readUnsignedByte();
			player.anInt11926 = (client.anInt11014 + buffer.readUnsignedShortLE()) * 2109855411;
			player.anInt11927 = (client.anInt11014 + buffer.readUnsignedShortLE()) * -2120654239;
		}
	}
}
