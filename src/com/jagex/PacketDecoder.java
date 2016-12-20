package com.jagex;

import java.io.IOException;

import com.RS3Applet;

public class PacketDecoder {
	
	static final boolean decodeIncomingPacket(Class109 class109, short i) throws IOException {
		Class563 class563 = class109.method1967(2033634282);
		Class527_Sub38_Sub2 stream = class109.aClass527_Sub38_Sub2_1364;
		if (null == class563)
			return false;
		if (null == class109.incomingPacket) {
			if (class109.aBool1372) {
				if (!class563.method9466(1, (byte) -9))
					return false;
				class563.method9472((class109.aClass527_Sub38_Sub2_1364.buffer), 0, 1, -226630132);
				class109.anInt1370 += 1809181855;
				class109.anInt1369 = 0;
				class109.aBool1372 = false;
			}
			stream.anInt10689 = 0;
			if (stream.method18447((byte) -94)) {
				if (!class563.method9466(1, (byte) -96))
					return false;
				class563.method9472((class109.aClass527_Sub38_Sub2_1364.buffer), 1, 1, -226630132);
				class109.anInt1370 += 1809181855;
				class109.anInt1369 = 0;
			}
			class109.aBool1372 = true;
			IncomingPacket[] class422s = Class294.method5296(1359066889);
			int i_2_ = stream.method18465((byte) 3);
			if (i_2_ < 0 || i_2_ >= class422s.length)
				throw new IOException(new StringBuilder().append(i_2_).append(" ").append(stream.anInt10689 * -441238943).toString());
			class109.incomingPacket = class422s[i_2_];
			class109.anInt1359 = 1556091203 * class109.incomingPacket.length;
		}
		if (-1 == class109.anInt1359 * 1011661087) {
			if (!class563.method9466(1, (byte) -127))
				return false;
			class563.method9472(stream.buffer, 0, 1, -226630132);
			class109.anInt1359 = (stream.buffer[0] & 0xff) * 314016479;
			class109.anInt1370 += 1809181855;
			class109.anInt1369 = 0;
		}
		if (-2 == class109.anInt1359 * 1011661087) {
			if (!class563.method9466(2, (byte) -120))
				return false;
			class563.method9472(stream.buffer, 0, 2, -226630132);
			stream.anInt10689 = 0;
			class109.anInt1359 = stream.readUnsignedShort() * 314016479;
			class109.anInt1370 += -676603586;
			class109.anInt1369 = 0;
		}
		if (class109.anInt1359 * 1011661087 > 0) {
			if (!class563.method9466(1011661087 * class109.anInt1359, (byte) -10))
				return false;
			stream.anInt10689 = 0;
			class563.method9472(stream.buffer, 0, class109.anInt1359 * 1011661087, -226630132);
			class109.anInt1370 += 706383425 * class109.anInt1359;
			class109.anInt1369 = 0;
		}
		class109.aClass422_1377 = class109.aClass422_1376;
		class109.aClass422_1376 = class109.aClass422_1361;
		class109.aClass422_1361 = class109.incomingPacket;
		
		if (!RS3Applet.IDENTIFIED.contains(class109.incomingPacket))
			System.out.println("UNIDENTIFIED PACKET: (id:" + (class109.incomingPacket.id * -874813153) + ", length:" + class109.incomingPacket.realLength + ")");
		
		if (class109.incomingPacket == IncomingPacket.aClass422_4625) {
			client.anInt11083 = 109430309;
			client.anInt11047 = client.anInt11221 * -97421591;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4638 == class109.incomingPacket) {
			int i_3_ = stream.readUnsignedShort128();
			if (i_3_ == 65535)
				i_3_ = -1;
			int i_4_ = stream.readUnsignedByte();
			Class245.aClass226_2698.method4229(i_3_, i_4_, 1177177880);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4626 == class109.incomingPacket) {
			int i_5_ = stream.readUnsignedShort();
			Class245.aClass226_2698.method4203(i_5_, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4682 == class109.incomingPacket) {
			int i_6_ = stream.readUnsignedShort();
			Class700_Sub12.method16961(i_6_, -808143111);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4798) {
			decodeSubPacket(SubIncomingPacket.aClass421_4593, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4708 == class109.incomingPacket) {
			Class245.aClass226_2698.method4228(-1635423113);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4719 == class109.incomingPacket) {
			client.anInt11240 = 1283512047 * client.anInt11221;
			boolean bool = stream.readUnsignedByte() == 1;
			if (1 == 1011661087 * class109.anInt1359) {
				if (bool)
					Class627.aClass527_Sub21_8187 = null;
				else
					Class618.aClass527_Sub21_8111 = null;
				class109.incomingPacket = null;
				return true;
			}
			if (bool)
				Class627.aClass527_Sub21_8187 = new Class527_Sub21(stream);
			else
				Class618.aClass527_Sub21_8111 = new Class527_Sub21(stream);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.CS_VAR_2 == class109.incomingPacket) {
			int i_7_ = stream.readInt();
			int i_8_ = stream.readUnsignedShortLE((byte) 119);
			Class224.method4184((byte) -70);
			Class290.method5256(i_8_, i_7_, -178723594);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4677 == class109.incomingPacket) {
			int i_9_ = stream.readUnsigned128Byte();
			int i_10_ = stream.readUnsignedShortLE128();
			if (65535 == i_10_)
				i_10_ = -1;
			Class245.aClass226_2698.method4273(i_10_, i_9_, (byte) 8);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4612 == class109.incomingPacket) {
			int i_11_ = stream.readInt();
			int i_12_ = stream.readUnsignedShort();
			Class224.method4184((byte) -14);
			Class208_Sub11.method15618(i_11_, i_12_, -160006041);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4672 == class109.incomingPacket) {
			int i_13_ = stream.readUnsignedShort();
			Class245.aClass226_2698.method4212(i_13_, 1670734100);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4755) {
			if (!client.aBool11309) {
				try {
					int i_14_ = stream.readUnsignedByte128();
					int i_15_ = stream.readUnsigned128Byte();
					int i_16_ = stream.readUnsigned128Byte();
					client.aClass223_11241.method4154(i_16_, 132841884).method4092(i_15_, i_14_, -415606089);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, -1643535851);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.HINT_ICON) {
			int i_17_ = stream.readUnsignedByte();
			int i_18_ = i_17_ >> 5;
			int i_19_ = i_17_ & 0x1f;
			if (i_19_ == 0) {
				client.aClass100Array11025[i_18_] = null;
				class109.incomingPacket = null;
				return true;
			}
			Class100 class100 = new Class100();
			class100.anInt1176 = 2093656453 * i_19_;
			class100.anInt1177 = stream.readUnsignedByte() * -2134071339;
			if (1280661885 * class100.anInt1177 >= 0 && (1280661885 * class100.anInt1177 < Class631.aClass147Array8257.length)) {
				if (1 == class100.anInt1176 * -905648307 || 10 == class100.anInt1176 * -905648307) {
					class100.anInt1184 = (stream.readUnsignedShort() * 664382007);
					class100.anInt1185 = (stream.readUnsignedShort() * 546061299);
					stream.anInt10689 += 1604036228;
				} else if (-905648307 * class100.anInt1176 >= 2 && class100.anInt1176 * -905648307 <= 6) {
					if (class100.anInt1176 * -905648307 == 2) {
						class100.anInt1180 = 1800909056;
						class100.anInt1178 = -1289928448;
					}
					if (-905648307 * class100.anInt1176 == 3) {
						class100.anInt1180 = 0;
						class100.anInt1178 = -1289928448;
					}
					if (-905648307 * class100.anInt1176 == 4) {
						class100.anInt1180 = -693149184;
						class100.anInt1178 = -1289928448;
					}
					if (-905648307 * class100.anInt1176 == 5) {
						class100.anInt1180 = 1800909056;
						class100.anInt1178 = 0;
					}
					if (6 == class100.anInt1176 * -905648307) {
						class100.anInt1180 = 1800909056;
						class100.anInt1178 = 1715110400;
					}
					class100.anInt1176 = -107654390;
					class100.anInt1181 = (stream.readUnsignedByte() * -1674009425);
					Class592 class592 = client.aClass509_11072.method8283((short) 14395);
					class100.anInt1180 += ((stream.readUnsignedShort() - 153371143 * class592.anInt7798) << 9) * -1318365263;
					class100.anInt1178 += ((stream.readUnsignedShort() - class592.anInt7799 * -2029646807) << 9) * 179510593;
					class100.anInt1179 = ((stream.readUnsignedByte() << 2) * -846693577);
					class100.anInt1182 = (stream.readUnsignedShort() * -948530677);
				}
				class100.anInt1183 = stream.readInt() * 1266211353;
				client.aClass100Array11025[i_18_] = class100;
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4667 == class109.incomingPacket) {
			Class208_Sub10.aClass296_Sub1_9923.method15691(stream, (1011661087 * (class109.anInt1359)), 1123152168);
			client.anInt11215 = client.anInt11221 * -405006973;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4615 == class109.incomingPacket) {
			client.anInt11218 = -374557391 * client.anInt11221;
			Class214 class214 = new Class214(stream, client.anInterface28_11187);
			class214.method3897(Class703.aClass219_8825, 1943222803);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.SOUND_EFFECT == class109.incomingPacket) {
			int i_20_ = stream.readUnsignedShort();
			if (65535 == i_20_)
				i_20_ = -1;
			int i_21_ = stream.readUnsignedByte();
			int i_22_ = stream.readUnsignedShort();
			int i_23_ = stream.readUnsignedByte();
			int i_24_ = stream.readUnsignedShort();
			Class245.aClass226_2698.method4218(Class193.aClass193_2145, i_20_, i_21_, i_23_, Class206.aClass206_2228.method3836(-1615488065), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_24_, i_22_, -255863336);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4694) {
			int i_25_ = stream.readIntV1();
			if (Class599.anInt7857 * -1806063747 != i_25_) {
				Class599.anInt7857 = -1773581867 * i_25_;
				Class546.method9060(Class579.aClass579_7661, -1, -1, (byte) -61);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4781 == class109.incomingPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			long l = (long) stream.readUnsignedShort();
			long l_26_ = (long) stream.read24BitUnsignedInteger(1604553539);
			long l_27_ = (l << 32) + l_26_;
			boolean bool_28_ = false;
			Class527_Sub21 class527_sub21 = (bool ? Class627.aClass527_Sub21_8187 : Class618.aClass527_Sub21_8111);
			if (null == class527_sub21)
				bool_28_ = true;
			else {
				for (int i_29_ = 0; i_29_ < 100; i_29_++) {
					if (client.aLongArray11268[i_29_] == l_27_) {
						bool_28_ = true;
						break;
					}
				}
			}
			if (!bool_28_) {
				client.aLongArray11268[-402274783 * client.anInt11269] = l_27_;
				client.anInt11269 = -1378402847 * ((-402274783 * client.anInt11269 + 1) % 100);
				String string = Class245.method4621(stream, 1980088574);
				int i_30_ = bool ? 43 : 46;
				Class452.method7332(i_30_, 0, "", "", "", string, class527_sub21.aString10483, -1, null, 1297791405);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4628 == class109.incomingPacket) {
			client.anInt11265 = stream.readUnsignedByte() * -184283011;
			client.anInt11223 = stream.readUnsignedByte128() * -2115812591;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4728) {
			client.anInt11232 = stream.readShort() * -1525330229;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4777) {
			int i_31_ = stream.readUnsignedShortLE((byte) 105);
			int i_32_ = stream.readIntV2();
			int i_33_ = stream.readUnsignedShort128();
			client.aClass509_11072.method8314(365801678).method9224(i_31_, i_32_, i_33_, -1470897231);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4746 == class109.incomingPacket) {
			int i_34_ = stream.readLEInt();
			int i_35_ = stream.readLEInt();
			int i_36_ = stream.readUnsignedShortLE((byte) 120);
			Class224.method4184((byte) -58);
			Class583.method9675(i_35_, 3, i_36_, i_34_, -702203871);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4705) {
			if (null == Class383_Sub1.aClass144_10279)
				Class383_Sub1.aClass144_10279 = new Class144(Class499.aClass95_Sub1_Sub2_5593);
			Class425 class425 = Class499.aClass95_Sub1_Sub2_5593.method14483(stream, 1831426067);
			Class383_Sub1.aClass144_10279.anInterface3_1670.method18(494563151 * class425.anInt4803, class425.anObject4804, 306367755);
			client.anIntArray11234[(client.anInt11235 += 549887279) * 1955842511 - 1 & 0x3f] = class425.anInt4803 * 494563151;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4761) {
			int i_37_ = stream.readIntV2();
			int i_38_ = stream.readIntV1();
			Class224.method4184((byte) -103);
			Class467.method7668(i_38_, i_37_, -1796170478);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4745 == class109.incomingPacket) {
			if (!client.aBool11309) {
				try {
					for (byte i_39_ = stream.readByte(); -1 != i_39_; i_39_ = stream.readByte()) {
						for (byte i_40_ = stream.readByte(); i_40_ != -1; i_40_ = stream.readByte()) {
							for (byte i_41_ = stream.readByte(); i_41_ != -1; i_41_ = stream.readByte())
								client.aClass223_11241.method4154(i_39_, 621288846).method4135(i_40_, i_41_, Integer.valueOf(stream.readInt()), -323169);
						}
					}
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, -88140458);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4754) {
			Class598.aClass144_Sub1_7852.method14502((byte) 84);
			class109.incomingPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4676 == class109.incomingPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(1362547226);
			String string_42_ = string;
			if (bool)
				string_42_ = stream.readString(1353647279);
			String string_43_ = stream.readString(1648778272);
			long l = (long) stream.readUnsignedShort();
			long l_44_ = (long) stream.read24BitUnsignedInteger(1274394528);
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), 1687472039);
			long l_45_ = l_44_ + (l << 32);
			boolean bool_46_ = false;
			while_119_: do {
				for (int i_47_ = 0; i_47_ < 100; i_47_++) {
					if (l_45_ == client.aLongArray11268[i_47_]) {
						bool_46_ = true;
						break while_119_;
					}
				}
				if (class406.aBool4209) {
					if (client.aBool11180 && !client.aBool11169 || client.aBool11172)
						bool_46_ = true;
					else if (Class6.method585(string_42_, -845807294))
						bool_46_ = true;
				}
			} while (false);
			if (!bool_46_) {
				client.aLongArray11268[-402274783 * client.anInt11269] = l_45_;
				client.anInt11269 = (client.anInt11269 * -402274783 + 1) % 100 * -1378402847;
				String string_48_ = (Class144.method2387(Class245.method4621(stream, 2075484493), 1925631386));
				if (-1 != -2095289761 * class406.anInt4200)
					Class452.method7332(9, 0, new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 2097729220)).append(string).toString(), new StringBuilder().append(Class202.method3775((class406.anInt4200 * -2095289761), 2038886780)).append(string_42_).toString(), string, string_48_, string_43_, -1, class406, 278204505);
				else
					Class452.method7332(9, 0, string, string_42_, string, string_48_, string_43_, -1, class406, 897633905);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4713 == class109.incomingPacket) {
			decodeSubPacket(SubIncomingPacket.aClass421_4603, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4670) {
			if (Class208_Sub23.method15642(-1927019389 * client.anInt11048, -422130462))
				client.anInt11024 = (int) ((float) stream.readUnsignedShort() * 2.5F) * 164586105;
			else
				client.anInt11024 = stream.readUnsignedShort() * 642615854;
			client.anInt11242 = -818664029 * client.anInt11221;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.REMOVE_GROUND_ITEM == class109.incomingPacket) {
			decodeSubPacket(SubIncomingPacket.REMOVE_GROUND_ITEM, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4643) {
			//Tile message
			int i_49_ = stream.readUnsignedShortLE128();
			int i_50_ = stream.readUnsignedByte128();
			int i_51_ = i_50_ >> 2;
			int i_52_ = i_50_ & 0x3;
			int i_53_ = stream.readUnsigned128Byte();
			int i_54_ = stream.readIntV1();
			int i_55_ = stream.readLEInt();
			int i_56_ = stream.readLEInt();
			int i_57_ = stream.readIntV1();
			int i_58_ = stream.readLEInt();
			Class592 class592 = new Class592(stream.readInt());
			int i_59_ = stream.readInt();
			Class224.method4184((byte) -20);
			Class6.method584(i_57_, new Class527_Sub41_Sub3(i_49_, i_53_, new Class675(class592, i_51_, i_52_, i_54_)), new int[] { i_55_, i_56_, i_58_, i_59_ }, false, -62471588);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4775) {
			decodeSubPacket(SubIncomingPacket.aClass421_4602, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4782) {
			int i_60_ = stream.readLEInt();
			int i_61_ = stream.readUnsignedShortLE((byte) 98);
			int i_62_ = stream.readUnsignedShortLE((byte) 113);
			int i_63_ = stream.readUnsignedByteC(-1038359954);
			Class224.method4184((byte) -75);
			InputStream_Sub1.method17421(i_60_, i_63_, i_62_, i_61_, (byte) 2);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4668 == class109.incomingPacket) {
			int i_64_ = stream.readUnsignedByte();
			Class224.method4184((byte) -72);
			client.anInt11138 = i_64_ * 1436616571;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4800 == class109.incomingPacket) {
			int i_65_ = stream.readUnsignedByte();
			Class687 class687 = (Class687) Class26.method858(Class574.method9630(-312737944), i_65_, -929962359);
			if (null == class687)
				class687 = Class687.aClass687_8677;
			Class526.method8732(class687, (byte) 6);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4651 == class109.incomingPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(865085179);
			long l = (long) stream.readUnsignedShort();
			long l_66_ = (long) stream.read24BitUnsignedInteger(392414116);
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), 1956971214);
			int i_67_ = stream.readUnsignedShort();
			long l_68_ = l_66_ + (l << 32);
			boolean bool_69_ = false;
			Object object = null;
			Class527_Sub21 class527_sub21 = (bool ? Class627.aClass527_Sub21_8187 : Class618.aClass527_Sub21_8111);
			while_120_: do {
				if (class527_sub21 == null)
					bool_69_ = true;
				else {
					for (int i_70_ = 0; i_70_ < 100; i_70_++) {
						if (client.aLongArray11268[i_70_] == l_68_) {
							bool_69_ = true;
							break while_120_;
						}
					}
					if (class406.aBool4209 && Class6.method585(string, -484825704))
						bool_69_ = true;
				}
			} while (false);
			if (!bool_69_) {
				client.aLongArray11268[-402274783 * client.anInt11269] = l_68_;
				client.anInt11269 = (client.anInt11269 * -402274783 + 1) % 100 * -1378402847;
				String string_71_ = Exception_Sub3.aClass51_11362.method1277(i_67_, -445669295).method18409(stream, 1550626157);
				int i_72_ = bool ? 42 : 45;
				if (-1 != -2095289761 * class406.anInt4200)
					Class452.method7332(i_72_, 0, new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 1993687801)).append(string).toString(), new StringBuilder().append(Class202.method3775((class406.anInt4200 * -2095289761), 2104241288)).append(string).toString(), string, string_71_, class527_sub21.aString10483, i_67_, class406, 302719460);
				else
					Class452.method7332(i_72_, 0, string, string, string, string_71_, class527_sub21.aString10483, i_67_, class406, -49068554);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4715 == class109.incomingPacket) {
			int i_73_ = stream.readIntV1();
			int i_74_ = stream.readUnsignedShort();
			Class224.method4184((byte) -111);
			Class80.method1573(i_74_, i_73_, -764443813);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4619) {
			if (!client.aBool11309) {
				try {
					int i_75_ = stream.readIntV1();
					byte i_76_ = stream.readByte();
					client.aClass223_11241.method4171(new Class221(i_75_), i_76_, -1795255511);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, 2130056809);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4778 == class109.incomingPacket) {
			int i_77_ = stream.readInt();
			int i_78_ = stream.readIntV2();
			Class224.method4184((byte) -95);
			Class583.method9675(i_78_, 1, i_77_, -1, -702203871);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4779 == class109.incomingPacket) {
			int i_79_ = stream.readLEInt();
			Class592 class592 = new Class592(stream.readIntV1());
			int i_80_ = stream.readUnsigned128Byte();
			int i_81_ = stream.readLEInt();
			int i_82_ = stream.readIntV2();
			int i_83_ = stream.readUnsignedShortLE128();
			int i_84_ = stream.readUnsignedShortLE128();
			int i_85_ = stream.readIntV2();
			int i_86_ = stream.readLEInt();
			Class224.method4184((byte) 0);
			Class6.method584(i_79_, new Class527_Sub41_Sub2(i_84_, i_80_, new Class683(class592, i_83_)), new int[] { i_81_, i_82_, i_86_, i_85_ }, false, 1427201751);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.VARP_1) {
			byte i_87_ = stream.readByteC((byte) 111);
			int i_88_ = stream.readUnsignedShort();
			Class671.aClass97_8584.aClass603_1162.method10015((Class160) Class248.aClass95_Sub1_Sub1_2731.method81(i_88_, 1902404798), i_87_, 1442412081);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4608) {
			int i_89_ = stream.readIntV1();
			boolean bool = stream.readUnsigned128Byte() == 1;
			Class224.method4184((byte) -53);
			Class557.method9431(i_89_, bool, (byte) 43);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4722 == class109.incomingPacket) {
			int i_90_ = stream.readUnsignedShort128();
			int i_91_ = stream.readUnsignedByte128();
			int i_92_ = stream.readUnsignedShort();
			int i_93_ = stream.readLEInt();
			Class224.method4184((byte) -51);
			Class31.method886(i_93_, i_91_, i_92_, i_90_, 1142193613);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4729) {
			int i_94_ = stream.readUnsignedShort();
			if (i_94_ == 65535)
				i_94_ = -1;
			int i_95_ = stream.readUnsignedByte();
			int i_96_ = stream.readUnsignedShort();
			int i_97_ = stream.readUnsignedByte();
			int i_98_ = stream.readUnsignedShort();
			Class245.aClass226_2698.method4218(Class193.aClass193_2145, i_94_, i_95_, i_97_, Class206.aClass206_2228.method3836(1160708607), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_98_, i_96_, 1120839192);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4710 == class109.incomingPacket) {
			client.aClass223_11241.method4160((byte) 1);
			int i_99_ = stream.readUnsignedByte();
			for (int i_100_ = 0; i_100_ < i_99_; i_100_++) {
				int i_101_ = stream.readInt();
				Class221 class221 = new Class221(i_101_);
				client.aClass223_11241.method4157(class221, (short) -10142);
				int i_102_ = stream.readUnsignedByte();
				for (int i_103_ = 0; i_103_ < i_102_; i_103_++)
					class221.method4128(stream.readInt(), 1327436957);
				int i_104_ = stream.readUnsignedByte();
				for (int i_105_ = 0; i_105_ < i_104_; i_105_++)
					class221.method4079(stream.readInt(), (byte) 23);
				for (int i_106_ = 0; i_106_ < i_102_; i_106_++) {
					byte i_107_ = stream.readByte();
					class221.method4081(i_106_, i_107_, (byte) 2);
					for (int i_108_ = 0; i_108_ < i_104_; i_108_++) {
						if (stream.readUnsignedByte() == 0)
							class221.method4135(i_106_, i_108_, null, 2096849943);
						else
							class221.method4135(i_106_, i_108_, Integer.valueOf(stream.readInt()), 140616921);
					}
				}
			}
			client.aBool11309 = false;
			class109.incomingPacket = null;
			return true;
		}
		/*
		 *UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,0
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,1
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,2
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 1154, 10,3
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,4
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,5
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,6
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,7
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,8
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,9
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,10
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,11
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,12
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,13
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,14
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 63, 1,15
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,16
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,17
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,18
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,19
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,20
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,21
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,22
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,23
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,24
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,25
		UNIDENTIFIED PACKET: (id:5, length:6)
		Packet 5: 0, 1,26
		 */
		if (IncomingPacket.UNIDENTIFIED_SENDS_ON_LOGIN == class109.incomingPacket) {
			int i_109_ = stream.readIntV1();
			int i_110_ = stream.readUnsignedByte128();
			int i_111_ = stream.readUnsignedByte128();
			Class525.aClass610_7102.method10096(i_111_, (byte) -39);
			Class671.aClass97_8584.aClass634Array1160[i_111_].method10521(i_109_, -528526207);
			Class671.aClass97_8584.aClass634Array1160[i_111_].method10531(i_110_, 1617898835);
			client.anIntArray11228[(client.anInt11229 += 1639172471) * 1992155207 - 1 & 0x3f] = i_111_;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.CS_VAR_1 == class109.incomingPacket) {
			int i_112_ = stream.readUnsignedShort128();
			byte i_113_ = stream.readByte();
			Class224.method4184((byte) -93);
			Class290.method5256(i_112_, i_113_, 1931859967);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4635) {
			String string = stream.readString(1103658823);
			int i_114_ = stream.readUnsignedShort();
			String string_115_ = Exception_Sub3.aClass51_11362.method1277(i_114_, -372645294).method18409(stream, 989407092);
			Class452.method7332(19, 0, string, string, string, string_115_, null, i_114_, null, -313322451);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.SEND_ITEMS == class109.incomingPacket) {
			int i_116_ = stream.readUnsignedShort();
			int i_117_ = stream.readUnsignedByte();
			boolean bool = (i_117_ & 0x1) != 0;
			boolean bool_118_ = 0 != (i_117_ & 0x2);
			System.out.println("Item update: " + i_116_ + ", " + i_117_ + ", " + bool + ", " + bool_118_);
			while (-441238943 * stream.anInt10689 < class109.anInt1359 * 1011661087) {
				int i_119_ = stream.readUnsignedSmart((byte) -2);
				int i_120_ = stream.readUnsignedShort();
				int i_121_ = 0;
				Class18 class18 = null;
				if (0 != i_120_) {
					i_121_ = stream.readUnsignedByte();
					if (i_121_ == 255)
						i_121_ = stream.readInt();
					if (bool_118_) {
						int i_122_ = stream.readUnsignedByte();
						if (i_122_ > 0) {
							class18 = new Class18(Class98.aClass95_Sub1_Sub2_1166);
							while (i_122_-- > 0) {
								Class425 class425 = (Class98.aClass95_Sub1_Sub2_1166.method14483(stream, -760846910));
								class18.method18((class425.anInt4803 * 494563151), class425.anObject4804, -1417715075);
							}
						}
					}
				}
				Class217.method3974(i_116_, i_119_, i_120_ - 1, i_121_, class18, bool, 2012307220);
			}
			client.anIntArray11181[(client.anInt11227 += 639081873) * 2058273649 - 1 & 0x3f] = i_116_;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4738) {
			int i_123_ = stream.readUnsignedByte();
			int i_124_ = stream.readUnsignedByte();
			if (stream.readUnsignedByte() == 0)
				client.aClass492ArrayArray11272[i_123_][i_124_] = new Class492();
			else {
				stream.anInt10689 -= 1474750881;
				client.aClass492ArrayArray11272[i_123_][i_124_] = new Class492(stream, null);
			}
			client.anInt11292 = client.anInt11221 * 1656486465;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4640) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(1126971930);
			String string_125_ = string;
			if (bool)
				string_125_ = stream.readString(1954405731);
			String string_126_ = stream.readString(2069313131);
			long l = (long) stream.readUnsignedShort();
			long l_127_ = (long) stream.read24BitUnsignedInteger(1892232263);
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), 675910942);
			int i_128_ = stream.readUnsignedShort();
			long l_129_ = l_127_ + (l << 32);
			boolean bool_130_ = false;
			while_121_: do {
				for (int i_131_ = 0; i_131_ < 100; i_131_++) {
					if (client.aLongArray11268[i_131_] == l_129_) {
						bool_130_ = true;
						break while_121_;
					}
				}
				if (class406.aBool4209 && Class6.method585(string_125_, -520328165))
					bool_130_ = true;
			} while (false);
			if (!bool_130_) {
				client.aLongArray11268[-402274783 * client.anInt11269] = l_129_;
				client.anInt11269 = -1378402847 * ((1 + -402274783 * client.anInt11269) % 100);
				String string_132_ = Exception_Sub3.aClass51_11362.method1277(i_128_, 286471706).method18409(stream, 785127302);
				if (-1 != class406.anInt4200 * -2095289761)
					Class452.method7332(20, 0, new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 2019389620)).append(string).toString(), new StringBuilder().append(Class202.method3775((class406.anInt4200 * -2095289761), 1973280774)).append(string_125_).toString(), string, string_132_, string_126_, i_128_, class406, -258580436);
				else
					Class452.method7332(20, 0, string, string_125_, string, string_132_, string_126_, i_128_, class406, -1954350415);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4741) {
			int i_133_ = stream.readIntV2();
			int i_134_ = stream.readUnsigned128Byte();
			Class224.method4184((byte) -32);
			Class677.method13892(i_133_, i_134_, (byte) -76);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4617) {
			boolean bool = stream.readUnsignedByte() == 1;
			int i_135_ = stream.readIntV2();
			Class224.method4184((byte) -116);
			Class708.method14380(i_135_, bool, (short) 7480);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4609) {
			int i_136_ = stream.readUnsignedShort();
			int i_137_ = stream.readInt();
			int i_138_ = stream.readUnsignedShortLE128();
			int i_139_ = stream.readUnsignedShort();
			Class224.method4184((byte) -90);
			Class320.method5695(i_137_, i_139_, i_136_, i_138_, (byte) -91);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4679) {
			int i_140_ = stream.readIntV2();
			Class224.method4184((byte) -5);
			if (i_140_ == -1) {
				Class400.anInt4141 = -228665961;
				Class452.anInt4964 = 1432081761;
			} else {
				Class592 class592 = client.aClass509_11072.method8283((short) 26493);
				int i_141_ = i_140_ >> 14 & 0x3fff;
				int i_142_ = i_140_ & 0x3fff;
				i_141_ -= class592.anInt7798 * 153371143;
				if (i_141_ < 0)
					i_141_ = 0;
				else if (i_141_ >= client.aClass509_11072.method8284((byte) 60))
					i_141_ = client.aClass509_11072.method8284((byte) 59);
				i_142_ -= -2029646807 * class592.anInt7799;
				if (i_142_ < 0)
					i_142_ = 0;
				else if (i_142_ >= client.aClass509_11072.method8285(-1896926799))
					i_142_ = client.aClass509_11072.method8285(720376243);
				Class400.anInt4141 = ((i_141_ << 9) + 256) * 228665961;
				Class452.anInt4964 = ((i_142_ << 9) + 256) * -1432081761;
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.PING == class109.incomingPacket) {
			class109.incomingPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4768 == class109.incomingPacket) {
			int i_143_ = stream.readUnsignedShort();
			int i_144_ = stream.readUnsignedShort();
			Class245.aClass226_2698.method4217(i_143_, i_144_, -2109961416);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4688 == class109.incomingPacket) {
			Class671.aClass97_8584.aClass603_1162.method10014(2063058531);
			client.anInt11110 += -693011904;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4706 == class109.incomingPacket) {
			decodeSubPacket(SubIncomingPacket.aClass421_4594, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4701) {
			int i_145_ = stream.readUnsignedByte();
			i_145_ = -i_145_ - 2;
			byte i_146_ = stream.readByte();
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = ((Class640_Sub1_Sub2_Sub1_Sub2) client.aMap11163.get(Integer.valueOf(i_145_)));
			if (class640_sub1_sub2_sub1_sub2 == null) {
				class640_sub1_sub2_sub1_sub2 = new Class640_Sub1_Sub2_Sub1_Sub2(null);
				class640_sub1_sub2_sub1_sub2.anInt11955 = i_145_ * 1587877927;
				client.aMap11163.put(Integer.valueOf(i_145_), class640_sub1_sub2_sub1_sub2);
			}
			class640_sub1_sub2_sub1_sub2.method18872(stream, i_146_, 102380841);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4793) {
			client.anInt11218 = client.anInt11221 * -374557391;
			if (class109.anInt1359 * 1011661087 == 0)
				Class703.aClass219_8825 = null;
			else
				Class703.aClass219_8825 = new Class219(0L, stream, true, client.anInterface28_11187);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4748 == class109.incomingPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(1211274038);
			String string_147_ = string;
			if (bool)
				string_147_ = stream.readString(902749241);
			long l = (long) stream.readUnsignedShort();
			long l_148_ = (long) stream.read24BitUnsignedInteger(222811158);
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), 1081958763);
			int i_149_ = stream.readUnsignedShort();
			long l_150_ = (l << 32) + l_148_;
			boolean bool_151_ = false;
			while_122_: do {
				for (int i_152_ = 0; i_152_ < 100; i_152_++) {
					if (client.aLongArray11268[i_152_] == l_150_) {
						bool_151_ = true;
						break while_122_;
					}
				}
				if (class406.aBool4209 && Class6.method585(string_147_, -1508720785))
					bool_151_ = true;
			} while (false);
			if (!bool_151_) {
				client.aLongArray11268[client.anInt11269 * -402274783] = l_150_;
				client.anInt11269 = -1378402847 * ((1 + -402274783 * client.anInt11269) % 100);
				String string_153_ = Exception_Sub3.aClass51_11362.method1277(i_149_, -262463421).method18409(stream, 841671523);
				if (-1 != class406.anInt4200 * -2095289761)
					Class452.method7332(18, 0, new StringBuilder().append(Class202.method3775((class406.anInt4200 * -2095289761), 2100690657)).append(string).toString(), new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 2134416644)).append(string_147_).toString(), string, string_153_, null, i_149_, class406, -382562856);
				else
					Class452.method7332(18, 0, string, string_147_, string, string_153_, null, i_149_, class406, -1836005556);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4687 == class109.incomingPacket) {
			int i_154_ = stream.readLEInt();
			int i_155_ = stream.readInt();
			int i_156_ = stream.readIntV1();
			stream.readUnsigned128Byte();
			int i_157_ = stream.readLEInt();
			int i_158_ = stream.readUnsignedShortLE128();
			Class224.method4184((byte) -38);
			int[] is = { i_156_, i_157_, i_154_, i_155_ };
			client.anInt11237 = -1087640481 * i_158_;
			Class581.method9669(i_158_, is, (byte) 13);
			Class316_Sub1.method15721(false, 1279554512);
			Class573.method9618(-2119864417 * client.anInt11237, is, -729961384);
			for (int i_159_ = 0; i_159_ < 102; i_159_++)
				client.aBoolArray11310[i_159_] = true;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.ADD_GROUND_ITEM == class109.incomingPacket) {
			decodeSubPacket(SubIncomingPacket.ADD_GROUND_ITEM, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4724) {
			Class335.anInt3642 = stream.method16581(1090645973) * 1129192597;
			client.aBool11180 = stream.readUnsignedByte() == 1;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4727) {
			if (!client.aBool11309) {
				try {
					byte i_160_ = stream.readByte128((byte) -66);
					int i_161_ = stream.readLEInt();
					int i_162_ = stream.readUnsigned128Byte();
					client.aClass223_11241.method4154(i_162_, 1527322148).method4083(i_161_, i_160_, (byte) 127);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, 1129347473);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4770 == class109.incomingPacket) {
			int i_163_ = stream.readUnsignedShort();
			int i_164_ = stream.readUnsignedShort();
			int i_165_ = stream.readUnsignedShort();
			Class245.aClass226_2698.method4206(i_163_, i_164_, i_165_, -2050298035);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4660 == class109.incomingPacket) {
			if (!client.aBool11309) {
				try {
					int i_166_ = stream.readUnsignedByte();
					int i_167_ = stream.readUnsigned128Byte();
					int i_168_ = stream.readUnsignedByteC(1013146255);
					client.aClass223_11241.method4154(i_167_, 1463262089).method4135(i_168_, i_166_, null, 2027892354);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, -535453529);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4654 == class109.incomingPacket) {
			Class224.method4184((byte) -128);
			Class642.method10729(264014236);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4707 == class109.incomingPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(1217343932);
			long l = (long) stream.readUnsignedShort();
			long l_169_ = (long) stream.read24BitUnsignedInteger(611266706);
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), -1458015801);
			long l_170_ = (l << 32) + l_169_;
			boolean bool_171_ = false;
			Object object = null;
			Class527_Sub21 class527_sub21 = (bool ? Class627.aClass527_Sub21_8187 : Class618.aClass527_Sub21_8111);
			while_123_: do {
				if (class527_sub21 == null)
					bool_171_ = true;
				else {
					for (int i_172_ = 0; i_172_ < 100; i_172_++) {
						if (l_170_ == client.aLongArray11268[i_172_]) {
							bool_171_ = true;
							break while_123_;
						}
					}
					if (class406.aBool4209) {
						if (client.aBool11180 && !client.aBool11169 || client.aBool11172)
							bool_171_ = true;
						else if (Class6.method585(string, 497589421))
							bool_171_ = true;
					}
				}
			} while (false);
			if (!bool_171_) {
				client.aLongArray11268[-402274783 * client.anInt11269] = l_170_;
				client.anInt11269 = (-402274783 * client.anInt11269 + 1) % 100 * -1378402847;
				String string_173_ = (Class144.method2387(Class245.method4621(stream, 2043674200), 1559440499));
				int i_174_ = bool ? 41 : 44;
				if (class406.anInt4200 * -2095289761 != -1)
					Class452.method7332(i_174_, 0, new StringBuilder().append(Class202.method3775((class406.anInt4200 * -2095289761), 1934093670)).append(string).toString(), new StringBuilder().append(Class202.method3775((class406.anInt4200 * -2095289761), 1967769580)).append(string).toString(), string, string_173_, class527_sub21.aString10483, -1, class406, 568336854);
				else
					Class452.method7332(i_174_, 0, string, string, string, string_173_, class527_sub21.aString10483, -1, class406, 1148816429);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4788 == class109.incomingPacket) {
			Class149.method2493(Class32.aBool320, (byte) -25);
			class109.incomingPacket = null;
			return false;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4753) {
			Class596.method9909(359074089);
			class109.incomingPacket = null;
			return false;
		}
		if (IncomingPacket.CS_VAR_STRING_2 == class109.incomingPacket) {
			int i_175_ = stream.readUnsignedShortLE((byte) 124);
			String string = stream.readString(1781877490);
			Class224.method4184((byte) -6);
			Class684.method13928(i_175_, string, 2);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4699 == class109.incomingPacket) {
			int i_176_ = stream.readLEInt();
			int i_177_ = stream.readIntV2();
			Class224.method4184((byte) -81);
			Class34.method965(i_177_, i_176_, (byte) 106);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4730) {
			int i_178_ = stream.readUnsignedShort();
			int i_179_ = stream.readIntV1();
			Class671.aClass97_8584.aClass603_1162.method10016((Class333) Class51.aClass24_Sub16_522.method81(i_178_, -1622451860), i_179_, 1540485348);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4709) {
			int i_180_ = stream.readUnsignedShort();
			int i_181_ = stream.readUnsignedByteC(-1728522894);
			Class671.aClass97_8584.aClass603_1162.method10016((Class333) Class51.aClass24_Sub16_522.method81(i_180_, 1124396342), i_181_, 1823206949);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4673) {
			Class527_Sub38_Sub2 class527_sub38_sub2_182_ = new Class527_Sub38_Sub2(1011661087 * class109.anInt1359);
			System.arraycopy((class109.aClass527_Sub38_Sub2_1364.buffer), (-441238943 * class109.aClass527_Sub38_Sub2_1364.anInt10689), class527_sub38_sub2_182_.buffer, 0, class109.anInt1359 * 1011661087);
			Class296_Sub1.method15694(-573494135);
			if (Class204.aClass527_Sub31_2213.aClass700_Sub22_10631.method17121((byte) -66) == 1)
				Class396.aClass506_4119.method8239(new Class514(Class503.aClass503_6876, class527_sub38_sub2_182_), (byte) 11);
			else
				client.aClass509_11072.method8280(new Class514(Class503.aClass503_6876, class527_sub38_sub2_182_), -620030752);
			class109.incomingPacket = null;
			return false;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4607) {
			if (!client.aBool11309) {
				try {
					int i_183_ = stream.readUnsignedByte();
					int i_184_ = stream.readUnsignedByte128();
					boolean bool = stream.readUnsignedByteC(1285298350) == 1;
					client.aClass223_11241.method4154(i_184_, 288373665).method4076(i_183_, bool, -947101820);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, -1758859540);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4764 == class109.incomingPacket) {
			Class5.anInt53 = (stream.readByte128((byte) -44) << 3) * -1089793007;
			Class579.anInt7673 = stream.readUnsignedByte128() * -1073751099;
			Class304.anInt3428 = (stream.read128Byte((byte) 120) << 3) * 2143073115;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4758) {
			client.anInt11056 = client.anInt11221 * 1254547619;
			boolean bool = stream.readUnsignedByte() == 1;
			Class352 class352 = new Class352(stream);
			Class346 class346;
			if (bool)
				class346 = Class386.aClass346_3964;
			else
				class346 = Class208_Sub8.aClass346_9916;
			class352.method6204(class346, (byte) -79);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.GAME_MESSAGE) {
			int i_185_ = stream.readUnsignedSmart((byte) -89);
			int i_186_ = stream.readInt();
			int i_187_ = stream.readUnsignedByte();
			String string = "";
			String string_188_ = string;
			if (0 != (i_187_ & 0x1)) {
				string = stream.readString(1096771123);
				if (0 != (i_187_ & 0x2))
					string_188_ = stream.readString(993340670);
				else
					string_188_ = string;
			}
			String string_189_ = stream.readString(1513812278);
			if (99 == i_185_)
				Class493.method7997(string_189_, (byte) 8);
			else if (i_185_ == 98)
				Class170.method2727(string_189_, 16711935);
			else {
				if (!string_188_.equals("") && Class6.method585(string_188_, 83953238)) {
					class109.incomingPacket = null;
					return true;
				}
				Class99.method1766(i_185_, i_186_, string, string_188_, string, string_189_, null, -1126303017);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4725) {
			for (int i_190_ = 0; (i_190_ < client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161.length); i_190_++) {
				if (null != (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_190_])) {
					client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_190_].anIntArray11931 = null;
					client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_190_].aClass695_11914.method14165(-1, (byte) 18);
				}
			}
			for (int i_191_ = 0; i_191_ < 152738023 * client.anInt11030; i_191_++) {
				((Class640_Sub1_Sub2_Sub1) client.aClass527_Sub26Array11313[i_191_].anObject10522).anIntArray11931 = null;
				((Class640_Sub1_Sub2_Sub1) client.aClass527_Sub26Array11313[i_191_].anObject10522).aClass695_11914.method14165(-1, (byte) 35);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4752) {
			int i_192_ = stream.readUnsignedShortLE((byte) 102);
			int i_193_ = stream.readUnsignedShortLE((byte) 111);
			int i_194_ = stream.readUnsigned128Byte();
			if (i_194_ == 255)
				i_194_ = -1;
			int i_195_ = stream.readUnsignedShortLE128();
			int i_196_ = stream.readUnsignedByte128();
			int i_197_ = stream.readShort();
			int i_198_ = stream.readUnsignedShort();
			int i_199_ = stream.readUnsignedShort128();
			int i_200_ = stream.method16481(2108130722);
			int i_201_ = stream.readUnsignedByte128() * 4;
			int i_202_ = stream.readByte128((byte) -48);
			int i_203_ = stream.readUnsignedByte128();
			int i_204_ = stream.readByteC((byte) 65);
			int i_205_ = stream.readUnsignedShort128();
			boolean bool = (i_203_ & 0x1) != 0;
			boolean bool_206_ = 0 != (i_203_ & 0x2);
			int i_207_ = bool_206_ ? i_203_ >> 2 : -1;
			if (bool_206_)
				i_196_ = (byte) i_196_;
			else
				i_196_ *= 4;
			Class592 class592 = client.aClass509_11072.method8283((short) 20418);
			int i_208_ = i_198_ - 306742286 * class592.anInt7798;
			int i_209_ = i_199_ - class592.anInt7799 * 235673682;
			i_204_ += i_208_;
			i_202_ += i_209_;
			if (i_208_ >= 0 && i_209_ >= 0 && i_208_ < client.aClass509_11072.method8284((byte) 7) * 2 && i_209_ < client.aClass509_11072.method8284((byte) 82) * 2 && i_204_ >= 0 && i_202_ >= 0 && i_204_ < client.aClass509_11072.method8285(368147393) * 2 && i_202_ < client.aClass509_11072.method8285(-375914077) * 2 && i_195_ != 65535) {
				i_208_ = 256 * i_208_;
				i_209_ *= 256;
				i_204_ *= 256;
				i_202_ = 256 * i_202_;
				i_196_ <<= 2;
				i_201_ <<= 2;
				i_193_ <<= 2;
				Class70.method1490(i_195_, i_200_, i_197_, i_207_, i_196_, i_201_, i_208_, i_209_, i_204_, i_202_, i_192_, i_205_, i_194_, i_193_, bool, 0, -1773024764);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4774) {
			int i_210_ = stream.readIntV1();
			int i_211_ = stream.readShort();
			int i_212_ = stream.readUnsigned128Byte();
			int i_213_ = stream.readUnsignedShort128();
			Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_213_));
			if (class527_sub26 != null) {
				Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
				if (null == class640_sub1_sub2_sub1_sub1.aClass297_12164)
					class640_sub1_sub2_sub1_sub1.aClass297_12164 = new Class297(class640_sub1_sub2_sub1_sub1.aClass295_12168);
				class640_sub1_sub2_sub1_sub1.aClass297_12164.anIntArray3386[i_212_] = i_210_;
				class640_sub1_sub2_sub1_sub1.aClass297_12164.aShortArray3387[i_212_] = (short) i_211_;
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4784) {
			Class647 class647 = new Class647();
			boolean bool = class647.method10759(stream, 2095326455);
			client.aClass509_11072.method8397(-2037493235).method10295(client.aClass509_11072, bool ? class647 : null, class647.method10777(318492261), -1593935447);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4692 == class109.incomingPacket) {
			int i_214_ = stream.readUnsignedShortLE128();
			int i_215_ = stream.readLEInt();
			Class224.method4184((byte) -57);
			Class700_Sub42.method17328(i_215_, i_214_, 1556121073);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4675) {
			client.anInt11240 = client.anInt11221 * 1283512047;
			boolean bool = stream.readUnsignedByte() == 1;
			Class338 class338 = new Class338(stream);
			Class527_Sub21 class527_sub21;
			if (bool)
				class527_sub21 = Class627.aClass527_Sub21_8187;
			else
				class527_sub21 = Class618.aClass527_Sub21_8111;
			class338.method6015(class527_sub21, -1865949576);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4732) {
			int i_216_ = stream.readUnsignedByte();
			Class701 class701 = (Class701) Class26.method858(Class675.method13860((byte) 51), i_216_, -936748189);
			if (class701 == null)
				class701 = Class701.aClass701_8792;
			Class26_Sub1.method16305(class701, -1120904284);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4652) {
			if (!client.aBool11309) {
				try {
					int i_217_ = stream.readUnsignedByte();
					int i_218_ = stream.readLEInt();
					byte i_219_ = stream.readByte128((byte) -114);
					client.aClass223_11241.method4154(i_217_, 417612905).method4088(i_218_, i_219_, 431618034);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, 1807959262);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4704 == class109.incomingPacket) {
			String string = stream.readString(947656809);
			Class47.method1243(string, 1474750881);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4661) {
			decodeSubPacket(SubIncomingPacket.aClass421_4606, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4649) {
			decodeSubPacket(SubIncomingPacket.aClass421_4596, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.OBJECT_RELATED_MAYBE == class109.incomingPacket) {
			Class5.anInt53 = ((stream.readByteC((byte) 2) << 3) * -1089793007);
			Class304.anInt3428 = (stream.readByte128((byte) -31) << 3) * 2143073115;
			Class579.anInt7673 = stream.readUnsignedByteC(1207203793) * -1073751099;
			Class592 class592 = client.aClass509_11072.method8283((short) 14833);
			for (Class527_Sub12 class527_sub12 = ((Class527_Sub12) client.aClass14_11253.method713((byte) -54)); class527_sub12 != null; class527_sub12 = ((Class527_Sub12) client.aClass14_11253.method717(-1468334113))) {
				int i_220_ = (int) ((-8168620736534281759L * class527_sub12.aLong7106 >> 28) & 0x3L);
				int i_221_ = (int) (-8168620736534281759L * class527_sub12.aLong7106 & 0x3fffL);
				int i_222_ = i_221_ - class592.anInt7798 * 153371143;
				int i_223_ = (int) ((-8168620736534281759L * class527_sub12.aLong7106 >> 14) & 0x3fffL);
				int i_224_ = i_223_ - -2029646807 * class592.anInt7799;
				if (i_220_ == 1551166221 * Class579.anInt7673 && i_222_ >= Class5.anInt53 * -509846287 && i_222_ < Class5.anInt53 * -509846287 + 8 && i_224_ >= Class304.anInt3428 * 1941718227 && i_224_ < Class304.anInt3428 * 1941718227 + 8) {
					class527_sub12.method8735(-1889161967);
					if (i_222_ >= 0 && i_224_ >= 0 && (i_222_ < client.aClass509_11072.method8284((byte) 33)) && (i_224_ < client.aClass509_11072.method8285(-889068769)))
						Class375.method6385(Class579.anInt7673 * 1551166221, i_222_, i_224_, 1394761684);
				}
			}
			for (Class527_Sub2 class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10357.method14081((short) -8796); class527_sub2 != null; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10357.method14086(-65534)) {
				if ((class527_sub2.anInt10346 * 1182093437 >= -509846287 * Class5.anInt53) && (1182093437 * class527_sub2.anInt10346 < 8 + -509846287 * Class5.anInt53) && (-677418425 * class527_sub2.anInt10345 >= Class304.anInt3428 * 1941718227) && (-677418425 * class527_sub2.anInt10345 < Class304.anInt3428 * 1941718227 + 8) && (1551166221 * Class579.anInt7673 == class527_sub2.anInt10348 * 1986250821))
					class527_sub2.aBool10356 = true;
			}
			for (Class527_Sub2 class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10359.method14081((short) -12086); null != class527_sub2; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10359.method14086(-65534)) {
				if ((class527_sub2.anInt10346 * 1182093437 >= Class5.anInt53 * -509846287) && (class527_sub2.anInt10346 * 1182093437 < 8 + -509846287 * Class5.anInt53) && (class527_sub2.anInt10345 * -677418425 >= Class304.anInt3428 * 1941718227) && (class527_sub2.anInt10345 * -677418425 < 1941718227 * Class304.anInt3428 + 8) && (class527_sub2.anInt10348 * 1986250821 == 1551166221 * Class579.anInt7673))
					class527_sub2.aBool10356 = true;
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4747) {
			int i_225_ = stream.readUnsignedShort();
			int i_226_ = stream.readUnsignedByte();
			boolean bool = 0 != (i_226_ & 0x1);
			boolean bool_227_ = (i_226_ & 0x2) != 0;
			Class515.method8605(i_225_, bool, (short) 913);
			int i_228_ = stream.readUnsignedShort();
			for (int i_229_ = 0; i_229_ < i_228_; i_229_++) {
				int i_230_ = stream.readUnsignedShort();
				int i_231_ = stream.readUnsignedByte();
				if (i_231_ == 255)
					i_231_ = stream.readInt();
				Class18 class18 = null;
				if (bool_227_) {
					int i_232_ = stream.readUnsignedByte();
					if (i_232_ > 0) {
						class18 = new Class18(Class98.aClass95_Sub1_Sub2_1166);
						while (i_232_-- > 0) {
							Class425 class425 = (Class98.aClass95_Sub1_Sub2_1166.method14483(stream, -733632530));
							class18.method18(494563151 * class425.anInt4803, class425.anObject4804, -450767462);
						}
					}
				}
				Class217.method3974(i_225_, i_229_, i_230_ - 1, i_231_, class18, bool, 757277488);
			}
			client.anIntArray11181[(client.anInt11227 += 639081873) * 2058273649 - 1 & 0x3f] = i_225_;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4797) {
			client.anInt11056 = client.anInt11221 * 1254547619;
			boolean bool = stream.readUnsignedByte() == 1;
			if (1 == class109.anInt1359 * 1011661087) {
				if (bool)
					Class386.aClass346_3964 = null;
				else
					Class208_Sub8.aClass346_9916 = null;
				class109.incomingPacket = null;
				return true;
			}
			if (bool)
				Class386.aClass346_3964 = new Class346(stream);
			else
				Class208_Sub8.aClass346_9916 = new Class346(stream);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4799 == class109.incomingPacket) {
			int i_233_ = stream.readUnsignedShort();
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2;
			if (-899375681 * client.anInt11070 == i_233_)
				class640_sub1_sub2_sub1_sub2 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937;
			else
				class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_233_];
			if (class640_sub1_sub2_sub1_sub2 == null) {
				class109.incomingPacket = null;
				return true;
			}
			int i_234_ = stream.readUnsignedShort();
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), 787792771);
			boolean bool = (i_234_ & 0x8000) != 0;
			if (null != class640_sub1_sub2_sub1_sub2.aString12179 && null != class640_sub1_sub2_sub1_sub2.aClass633_12183) {
				boolean bool_235_ = false;
				if (class406.aBool4209) {
					if (!bool && (client.aBool11180 && !client.aBool11169 || client.aBool11172))
						bool_235_ = true;
					else if (Class6.method585((class640_sub1_sub2_sub1_sub2.aString12179), 1871760493))
						bool_235_ = true;
				}
				if (!bool_235_) {
					int i_236_ = -1;
					String string;
					if (bool) {
						i_234_ &= 0x7fff;
						Class382 class382 = Class178.method3067(stream, (byte) 79);
						i_236_ = class382.anInt3939 * -1237622773;
						string = class382.aClass527_Sub8_Sub17_3940.method18409(stream, -32413441);
					} else
						string = (Class144.method2387(Class245.method4621(stream, 2140796850), 1136992547));
					class640_sub1_sub2_sub1_sub2.method18882(string.trim(), i_234_ >> 8, i_234_ & 0xff, -1263075120);
					int i_237_;
					if (class406.aBool4208)
						i_237_ = bool ? 17 : 1;
					else
						i_237_ = bool ? 17 : 2;
					if (-1 != class406.anInt4200 * -2095289761)
						Class452.method7332(i_237_, 0, new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 2071418405)).append(class640_sub1_sub2_sub1_sub2.method18879(true, (byte) 17)).toString(), new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 2074018874)).append(class640_sub1_sub2_sub1_sub2.method18877(false, (byte) -124)).toString(), class640_sub1_sub2_sub1_sub2.aString12202, string, null, i_236_, class406, 927898519);
					else
						Class452.method7332(i_237_, 0, class640_sub1_sub2_sub1_sub2.method18879(true, (byte) -83), class640_sub1_sub2_sub1_sub2.method18877(false, (byte) -113), class640_sub1_sub2_sub1_sub2.aString12202, string, null, i_236_, class406, 453202);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4678) {
			int i_238_ = stream.readLEInt();
			if (i_238_ != 1495139311 * Class338.anInt3655) {
				Class338.anInt3655 = i_238_ * -543847665;
				Class546.method9060(Class579.aClass579_7652, -1, -1, (byte) -73);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4762 == class109.incomingPacket) {
			int i_239_ = stream.readUnsignedByte();
			Class702 class702 = ((Class702) Class26.method858(Class633.method10520(-1169105568), i_239_, -71439128));
			if (class702 == null)
				class702 = Class702.aClass702_8800;
			Class82.method1577(class702, 1400545007);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4662) {
			if (Class707.aBool8841 && null != Class56.aFrame711)
				Class188.method3663(Class204.aClass527_Sub31_2213.aClass700_Sub2_10596.method16853((byte) -18), -1, -1, false, (byte) 14);
			byte[] is = new byte[class109.anInt1359 * 1011661087];
			stream.method18449(is, 0, class109.anInt1359 * 1011661087, 1937577827);
			String string = Class539.method9000(is, 0, 1011661087 * class109.anInt1359, -2124859545);
			Class183.method3558(string, true, client.aBool11193, 406731002);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4789) {
			if (-1 != client.anInt11237 * -2119864417)
				Class316_Sub1.method15722(client.anInt11237 * -2119864417, 0, -1343485169);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4613 == class109.incomingPacket) {
			Class320.method5693(stream.readString(843521876), -2074329888);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4794) {
			decodeSubPacket(SubIncomingPacket.aClass421_4601, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4695) {
			int i_240_ = stream.readUnsignedShortLE128();
			int[] is = new int[4];
			for (int i_241_ = 0; i_241_ < 4; i_241_++)
				is[i_241_] = stream.readIntV2();
			int i_242_ = stream.readUnsignedByte128();
			Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_240_));
			if (class527_sub26 != null)
				Class524.method8717(((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522), is, i_242_, true, -397006101);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4632 == class109.incomingPacket) {
			client.anInt11198 = stream.readShort() * -1161873079;
			client.anInt11242 = -818664029 * client.anInt11221;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4796 == class109.incomingPacket) {
			int i_243_ = stream.readUnsignedShort();
			String string = stream.readString(1564453836);
			int i_244_ = stream.readUnsignedShort();
			int i_245_ = stream.readUnsignedShort();
			boolean bool = stream.readUnsignedByte() == 1;
			Class3.aClass13_37 = Class3.aClass13_34;
			Class49.aBool511 = bool;
			Class645.method10747(i_243_, string, i_244_, i_245_, 1587546148);
			Object object = null;
			Class78.method1560(19, (byte) 0);
			class109.incomingPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4623 == class109.incomingPacket) {
			Class383_Sub1.aClass144_10279 = null;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4614 == class109.incomingPacket) {
			Class383_Sub1.aClass144_10279 = new Class144(Class499.aClass95_Sub1_Sub2_5593);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4680) {
			String string = stream.readString(1402032127);
			Class29.method868(string, false, false, 396196190);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4671) {
			String string = stream.readString(984184745);
			long l = (long) stream.readUnsignedShort();
			long l_246_ = (long) stream.read24BitUnsignedInteger(2091617604);
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), 569258864);
			boolean bool = stream.readUnsignedByte() == 1;
			long l_247_ = (l << 32) + l_246_;
			boolean bool_248_ = false;
			while_124_: do {
				if (null == Class703.aClass219_8825)
					bool_248_ = true;
				else {
					for (int i_249_ = 0; i_249_ < 100; i_249_++) {
						if (l_247_ == client.aLongArray11268[i_249_]) {
							bool_248_ = true;
							break while_124_;
						}
					}
					if (class406.aBool4209) {
						if (client.aBool11180 && !client.aBool11169 || client.aBool11172)
							bool_248_ = true;
						else if (Class6.method585(string, -173594534))
							bool_248_ = true;
					}
				}
			} while (false);
			if (!bool_248_) {
				client.aLongArray11268[client.anInt11269 * -402274783] = l_247_;
				client.anInt11269 = -1378402847 * ((-402274783 * client.anInt11269 + 1) % 100);
				String string_250_ = (Class144.method2387(Class245.method4621(stream, 2092465745), -99072061));
				int i_251_ = bool ? 22 : 24;
				if (-1 != -2095289761 * class406.anInt4200)
					Class452.method7332(i_251_, 0, new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 2006069813)).append(string).toString(), new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 1979785132)).append(string).toString(), string, string_250_, Class703.aClass219_8825.method4023(-958290710), -1, class406, -1886569673);
				else
					Class452.method7332(i_251_, 0, string, string, string, string_250_, Class703.aClass219_8825.method4023(-901716643), -1, class406, -1849257454);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4795) {
			int i_252_ = stream.readUnsignedByte128();
			int i_253_ = stream.readUnsignedByte128();
			int i_254_ = stream.readUnsignedShort128() << 2;
			int i_255_ = stream.readUnsignedByte128();
			int i_256_ = stream.readUnsignedByteC(430011783);
			Class224.method4184((byte) -68);
			Class548.method9094(i_255_, i_253_, i_254_, i_252_, i_256_, -1921287226);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4610) {
			int i_257_ = stream.readInt();
			int i_258_ = stream.readLEInt();
			Class224.method4184((byte) -7);
			Class243 class243 = Class648.method10837(i_257_, -624916684);
			class243.anInt2472 = -746768767 * i_258_;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4731) {
			Class245.aClass226_2698.method4223(stream.readUnsignedShort(), -737618702);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4665) {
			if (!client.aBool11309) {
				try {
					int i_259_ = stream.readUnsignedByteC(407681217);
					int i_260_ = stream.readUnsignedByte();
					client.aClass223_11241.method4154(i_260_, 827154742).method4090(i_259_, (short) -21535);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, 913740892);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.MINIMAP_FLAG == class109.incomingPacket) {
			int i_261_ = stream.readUnsignedByteC(-1725667912);
			int i_262_ = stream.readUnsignedByte128();
			if (255 == i_261_) {
				i_261_ = -1;
				i_262_ = -1;
			}
			Class26.method857(i_261_, i_262_, 707674917);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4700) {
			client.anInt11159 = stream.readUnsignedByte() * 1575839039;
			client.anInt11242 = client.anInt11221 * -818664029;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4766 == class109.incomingPacket) {
			String string = stream.readString(1421671617);
			boolean bool = stream.readUnsignedByte() == 1;
			String string_263_;
			if (bool)
				string_263_ = stream.readString(1661866761);
			else
				string_263_ = string;
			int i_264_ = stream.readUnsignedShort();
			byte i_265_ = stream.readByte();
			boolean bool_266_ = false;
			if (i_265_ == -128)
				bool_266_ = true;
			if (bool_266_) {
				if (0 == Class695_Sub3.anInt10976 * -2075991457) {
					class109.incomingPacket = null;
					return true;
				}
				boolean bool_267_ = false;
				int i_268_;
				for (i_268_ = 0; (i_268_ < Class695_Sub3.anInt10976 * -2075991457 && (!Class679.aClass104Array8629[i_268_].aString1290.equals(string_263_) || i_264_ != (Class679.aClass104Array8629[i_268_].anInt1288) * 2066428519)); i_268_++) {
					/* empty */
				}
				if (i_268_ < Class695_Sub3.anInt10976 * -2075991457) {
					for (/**/; i_268_ < -2075991457 * Class695_Sub3.anInt10976 - 1; i_268_++)
						Class679.aClass104Array8629[i_268_] = Class679.aClass104Array8629[i_268_ + 1];
					Class695_Sub3.anInt10976 -= -283510369;
					Class679.aClass104Array8629[(Class695_Sub3.anInt10976 * -2075991457)] = null;
				}
			} else {
				String string_269_ = stream.readString(1127329478);
				Class104 class104 = new Class104();
				class104.aString1286 = string;
				class104.aString1290 = string_263_;
				class104.aString1285 = Class641.method10704(class104.aString1290, Class242.aClass91_2471, -2100488883);
				class104.anInt1288 = -1763063465 * i_264_;
				class104.aByte1287 = i_265_;
				class104.aString1289 = string_269_;
				int i_270_;
				for (i_270_ = -2075991457 * Class695_Sub3.anInt10976 - 1; i_270_ >= 0; i_270_--) {
					int i_271_ = Class679.aClass104Array8629[i_270_].aString1285.compareTo(class104.aString1285);
					if (0 == i_271_) {
						Class679.aClass104Array8629[i_270_].anInt1288 = -1763063465 * i_264_;
						Class679.aClass104Array8629[i_270_].aByte1287 = i_265_;
						Class679.aClass104Array8629[i_270_].aString1289 = string_269_;
						if (string_263_.equals(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12179))
							Class510.aByte6978 = i_265_;
						client.anInt11238 = -759342041 * client.anInt11221;
						class109.incomingPacket = null;
						return true;
					}
					if (i_271_ < 0)
						break;
				}
				if (-2075991457 * Class695_Sub3.anInt10976 >= Class679.aClass104Array8629.length) {
					class109.incomingPacket = null;
					return true;
				}
				for (int i_272_ = Class695_Sub3.anInt10976 * -2075991457 - 1; i_272_ > i_270_; i_272_--)
					Class679.aClass104Array8629[i_272_ + 1] = Class679.aClass104Array8629[i_272_];
				if (0 == Class695_Sub3.anInt10976 * -2075991457)
					Class679.aClass104Array8629 = new Class104[100];
				Class679.aClass104Array8629[1 + i_270_] = class104;
				Class695_Sub3.anInt10976 += -283510369;
				if (string_263_.equals(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12179))
					Class510.aByte6978 = i_265_;
			}
			client.anInt11238 = -759342041 * client.anInt11221;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4689) {
			int i_273_ = stream.readUnsignedShort128();
			int i_274_ = stream.readUnsignedByte();
			int i_275_ = stream.readUnsignedByte128();
			int i_276_ = stream.readLEInt();
			int i_277_ = stream.readUnsignedShort128();
			if (i_277_ == 65535)
				i_277_ = -1;
			int i_278_ = stream.readUnsignedShortLE128();
			int i_279_ = i_275_ & 0x7;
			int i_280_ = i_275_ >> 3 & 0xf;
			if (i_280_ == 15)
				i_280_ = -1;
			boolean bool = 1 == (i_275_ >> 7 & 0x1);
			if (i_276_ >> 30 != 0) {
				Class592 class592 = client.aClass509_11072.method8283((short) 23028);
				int i_281_ = i_276_ >> 28 & 0x3;
				int i_282_ = (i_276_ >> 14 & 0x3fff) - class592.anInt7798 * 153371143;
				int i_283_ = (i_276_ & 0x3fff) - class592.anInt7799 * -2029646807;
				if (i_282_ >= 0 && i_283_ >= 0 && i_282_ < client.aClass509_11072.method8284((byte) 58) && (i_283_ < client.aClass509_11072.method8285(-995105358))) {
					if (-1 == i_277_) {
						Class527_Sub8_Sub6 class527_sub8_sub6 = ((Class527_Sub8_Sub6) client.aClass14_11184.method709((long) (i_282_ << 16 | i_283_)));
						if (class527_sub8_sub6 != null) {
							class527_sub8_sub6.aClass640_Sub1_Sub2_Sub4_11639.method18785(1971644412);
							class527_sub8_sub6.method8735(-1889161967);
						}
					} else {
						int i_284_ = 256 + i_282_ * 512;
						int i_285_ = 256 + i_283_ * 512;
						int i_286_ = i_281_;
						if (i_286_ < 3 && client.aClass509_11072.method8359(734841367).method7706(i_282_, i_283_, (short) -5216))
							i_286_++;
						Class640_Sub1_Sub2_Sub4 class640_sub1_sub2_sub4 = (new Class640_Sub1_Sub2_Sub4(client.aClass509_11072.method8314(495452001), i_277_, i_273_, i_281_, i_286_, i_284_, Class590.method9853(i_284_, i_285_, i_281_, (byte) 5) - i_278_, i_285_, i_282_, i_282_, i_283_, i_283_, i_279_, bool, 0));
						client.aClass14_11184.method714(new Class527_Sub8_Sub6(class640_sub1_sub2_sub4), (long) (i_282_ << 16 | i_283_));
					}
				}
			} else if (i_276_ >> 29 != 0) {
				int i_287_ = i_276_ & 0xffff;
				Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_287_));
				if (class527_sub26 != null) {
					Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
					Class505 class505 = (class640_sub1_sub2_sub1_sub1.aClass505Array11915[i_274_]);
					if (i_277_ == 65535)
						i_277_ = -1;
					boolean bool_288_ = true;
					int i_289_ = class505.anInt6909 * 1429262853;
					if (-1 != i_277_ && -1 != i_289_) {
						if (i_277_ == i_289_) {
							Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(i_277_, -1318180411));
							if (class685.aBool8665 && class685.anInt8671 * -1567837355 != -1) {
								Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, -206371682)));
								int i_290_ = -667661221 * class198.anInt2186;
								if (i_290_ == 0 || i_290_ == 2)
									bool_288_ = false;
								else if (i_290_ == 1)
									bool_288_ = true;
							}
						} else {
							Class685 class685 = (Class685) Class57.aClass24_Sub4_720.method81(i_277_, 1115216345);
							Class685 class685_291_ = (Class685) Class57.aClass24_Sub4_720.method81(i_289_, 132517084);
							if (-1 != class685.anInt8671 * -1567837355 && (-1567837355 * class685_291_.anInt8671 != -1)) {
								Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(class685.anInt8671 * -1567837355, 879930813)));
								Class198 class198_292_ = ((Class198) (Class321.aClass24_Sub10_3551.method81(class685_291_.anInt8671 * -1567837355, -960451313)));
								if (class198.anInt2191 * 40010509 < 40010509 * class198_292_.anInt2191)
									bool_288_ = false;
							}
						}
					}
					if (bool_288_) {
						class505.anInt6909 = -82367795 * i_277_;
						class505.anInt6910 = 706413901 * i_278_;
						class505.anInt6908 = 1669348947 * i_280_;
						if (-1 != i_277_) {
							Class685 class685 = (Class685) Class57.aClass24_Sub4_720.method81(i_277_, 120309165);
							int i_293_ = class685.aBool8665 ? 0 : 2;
							if (bool)
								i_293_ = 1;
							class505.aClass695_6911.method14238(class685.anInt8671 * -1567837355, i_273_, i_293_, false, 2066723311);
						} else
							class505.aClass695_6911.method14165(-1, (byte) 21);
					}
				}
			} else if (i_276_ >> 28 != 0) {
				int i_294_ = i_276_ & 0xffff;
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2;
				if (client.anInt11070 * -899375681 == i_294_)
					class640_sub1_sub2_sub1_sub2 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937;
				else
					class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_294_]);
				if (null != class640_sub1_sub2_sub1_sub2) {
					Class505 class505 = (class640_sub1_sub2_sub1_sub2.aClass505Array11915[i_274_]);
					if (65535 == i_277_)
						i_277_ = -1;
					boolean bool_295_ = true;
					int i_296_ = 1429262853 * class505.anInt6909;
					if (i_277_ != -1 && -1 != i_296_) {
						if (i_296_ == i_277_) {
							Class685 class685 = (Class685) Class57.aClass24_Sub4_720.method81(i_277_, -853315316);
							if (class685.aBool8665 && -1567837355 * class685.anInt8671 != -1) {
								Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(class685.anInt8671 * -1567837355, 1323394758)));
								int i_297_ = class198.anInt2186 * -667661221;
								if (i_297_ == 0 || i_297_ == 2)
									bool_295_ = false;
								else if (i_297_ == 1)
									bool_295_ = true;
							}
						} else {
							Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(i_277_, -1287101348));
							Class685 class685_298_ = ((Class685) Class57.aClass24_Sub4_720.method81(i_296_, -1678932174));
							if (-1567837355 * class685.anInt8671 != -1 && (class685_298_.anInt8671 * -1567837355 != -1)) {
								Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(class685.anInt8671 * -1567837355, -175761690)));
								Class198 class198_299_ = ((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685_298_.anInt8671, 1879407295)));
								if (40010509 * class198.anInt2191 < class198_299_.anInt2191 * 40010509)
									bool_295_ = false;
							}
						}
					}
					if (bool_295_) {
						class505.anInt6909 = i_277_ * -82367795;
						class505.anInt6910 = 706413901 * i_278_;
						class505.anInt6908 = i_280_ * 1669348947;
						class505.anInt6912 = i_279_ * 2009205063;
						if (-1 != i_277_) {
							Class685 class685 = (Class685) Class57.aClass24_Sub4_720.method81(i_277_, 1154526001);
							int i_300_ = class685.aBool8665 ? 0 : 2;
							if (bool)
								i_300_ = 1;
							class505.aClass695_6911.method14238(class685.anInt8671 * -1567837355, i_273_, i_300_, false, 2145964399);
						} else
							class505.aClass695_6911.method14165(-1, (byte) 25);
					}
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4767) {
			decodeSubPacket(SubIncomingPacket.aClass421_4599, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.NPC_UPDATE) {
			Class335.method5878(-370081377 * client.aClass509_11072.anInt6938, (byte) 28);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4634 == class109.incomingPacket) {
			int i_301_ = stream.readUnsignedByte128();
			int i_302_ = stream.readUnsignedShort();
			int i_303_ = stream.readUnsignedByte();
			int i_304_ = stream.readUnsigned128Byte();
			int i_305_ = stream.readUnsignedByte128();
			Class224.method4184((byte) -33);
			client.aBoolArray11060[i_303_] = true;
			client.anIntArray11277[i_303_] = i_304_;
			client.anIntArray11294[i_303_] = i_305_;
			client.anIntArray11279[i_303_] = i_301_;
			client.anIntArray11280[i_303_] = i_302_;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4769 == class109.incomingPacket) {
			Class224.method4184((byte) -73);
			Class393.method6490(Class527_Sub29.method16288(511592480), -611159697);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4659) {
			byte i_306_ = stream.readByte();
			Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18872(stream, i_306_, 102380841);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4656) {
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4792 == class109.incomingPacket) {
			int i_307_ = stream.readUnsignedByte();
			i_307_ = -i_307_ - 2;
			int i_308_ = stream.readIntV2();
			Class224.method4184((byte) -28);
			Class583.method9675(i_308_, 5, i_307_, 0, -702203871);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4686 == class109.incomingPacket) {
			int i_309_ = stream.readLEInt();
			Class224.method4184((byte) -63);
			Class583.method9675(i_309_, 5, -899375681 * client.anInt11070, 0, -702203871);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4691 == class109.incomingPacket) {
			client.anInt11244 = -261483823 * client.anInt11221;
			int i_310_ = stream.anInt10689 * -441238943;
			int i_311_ = stream.readUnsignedShort();
			boolean bool = stream.readUnsignedByte() == 1;
			Class215 class215 = Class703.aClass219_8825.method3992(i_311_, 2055008836);
			Class18 class18 = class215.method3922((byte) 9);
			if (class18 == null || bool) {
				class215.method3928(client.anInterface28_11187, 1779764741);
				class18 = class215.method3922((byte) 9);
			}
			while ((class109.anInt1359 * 1011661087 - (stream.anInt10689 * -441238943 - i_310_)) > 0) {
				Class425 class425 = Class248.aClass95_Sub1_Sub1_2731.method14483(stream, -794446018);
				class18.method18(class425.anInt4803 * 494563151, class425.anObject4804, -2107129933);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4666) {
			client.aClass635_11206 = ((Class635) Class26.method858(Class635.method10551(69915111), stream.readUnsignedByte128(), 1430262799));
			if (null == client.aClass635_11206)
				client.aClass635_11206 = Class635.aClass635_8297;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4616 == class109.incomingPacket) {
			int i_312_ = stream.readUnsignedShortLE128();
			if (i_312_ == 65535)
				i_312_ = -1;
			Class245.aClass226_2698.method4298(i_312_, 255, 552812203);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.CLIENT_EDIT_CHECK == class109.incomingPacket) {
			Class465_Sub2.method15953(stream, class109.anInt1359 * 1011661087, -1624120036);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.PING_2) {
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4631) {
			decodeSubPacket(SubIncomingPacket.aClass421_4598, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4771) {
			int i_313_ = stream.readUnsignedByte();
			int i_314_ = stream.method16466(-2046527717);
			if (null != client.aClass535Array11026[i_313_]) {
				client.aClass535Array11026[i_313_].method8971(client.aClass509_11072.method8314(-556551960), (byte) 107);
				client.aClass535Array11026[i_313_] = null;
			}
			if (i_314_ != -1)
				client.aClass535Array11026[i_313_] = new Class535(Class402.aClass180_4150, stream, i_314_);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4683) {
			int i_315_ = stream.readUnsignedShort();
			if (65535 == i_315_)
				i_315_ = -1;
			int i_316_ = stream.readUnsignedByte();
			int i_317_ = stream.readUnsignedShort();
			int i_318_ = stream.readUnsignedByte();
			Class245.aClass226_2698.method4218(Class193.aClass193_2145, i_315_, i_316_, i_318_, Class206.aClass206_2222.method3836(-603523270), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 256, i_317_, 1643538489);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4717 == class109.incomingPacket) {
			decodeSubPacket(SubIncomingPacket.aClass421_4605, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4714 == class109.incomingPacket) {
			int i_319_ = stream.readUnsignedShortLE128();
			int i_320_ = stream.readLEInt();
			int i_321_ = stream.readUnsignedShortLE128();
			int i_322_ = stream.readUnsignedShort();
			Class224.method4184((byte) -98);
			Class583.method9675(i_320_, 7, i_321_ << 16 | i_322_, i_319_, -702203871);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4776 == class109.incomingPacket) {
			decodeSubPacket(SubIncomingPacket.aClass421_4604, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.CLIENT_SCRIPT == class109.incomingPacket) {
			String string = stream.readString(2094230974);
			Object[] objects = new Object[string.length() + 1];
			for (int i_323_ = string.length() - 1; i_323_ >= 0; i_323_--) {
				if (string.charAt(i_323_) == 's')
					objects[i_323_ + 1] = stream.readString(1366716701);
				else
					objects[1 + i_323_] = new Integer(stream.readInt());
			}
			objects[0] = new Integer(stream.readInt());
			Class224.method4184((byte) -15);
			Class527_Sub33 class527_sub33 = new Class527_Sub33();
			class527_sub33.anObjectArray10650 = objects;
			Class491.method7980(class527_sub33, -1732112502);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.SET_INTERFACE == class109.incomingPacket) {
			int parent = stream.readIntV1();
			int clipped = stream.readUnsigned128Byte();
			int xtea4 = stream.readInt();
			int id = stream.readUnsignedShort128();
			int xtea3 = stream.readIntV2();
			int xtea2 = stream.readIntV1();
			int xtea1 = stream.readIntV1();
			Class224.method4184((byte) -64);
			Class6.method584(parent, new Class527_Sub41(id, clipped), new int[] { xtea1, xtea2, xtea3, xtea4 }, false, 1973098061);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4620) {
			if (!client.aBool11309) {
				try {
					int i_331_ = stream.readUnsignedByte128();
					int i_332_ = stream.readUnsignedByteC(-1079714666);
					client.aClass223_11241.method4154(i_332_, 1228346717).method4072(i_331_, 253011818);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, 1480747524);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4750) {
			int i_333_ = stream.readInt();
			Class200.aClass50_2203 = new Class50(i_333_);
			Thread thread = new Thread(Class200.aClass50_2203);
			thread.setPriority(1);
			thread.start();
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4790 == class109.incomingPacket) {
			int i_334_ = stream.readUnsignedShort();
			int i_335_ = stream.readUnsignedShortLE((byte) 100);
			Class224.method4184((byte) -108);
			Class570.method9598(i_335_, i_334_, 0, -1944295345);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4630) {
			client.anInt11238 = client.anInt11221 * -759342041;
			if (class109.anInt1359 * 1011661087 == 0) {
				client.aString11270 = null;
				client.aString11176 = null;
				Class695_Sub3.anInt10976 = 0;
				Class679.aClass104Array8629 = null;
				class109.incomingPacket = null;
				return true;
			}
			client.aString11176 = stream.readString(1725721722);
			boolean bool = stream.readUnsignedByte() == 1;
			if (bool)
				stream.readString(852523522);
			client.aString11270 = stream.readString(895628662);
			Class619.aByte8114 = stream.readByte();
			int i_336_ = stream.readUnsignedByte();
			if (255 == i_336_) {
				class109.incomingPacket = null;
				return true;
			}
			Class695_Sub3.anInt10976 = -283510369 * i_336_;
			Class104[] class104s = new Class104[100];
			for (int i_337_ = 0; i_337_ < Class695_Sub3.anInt10976 * -2075991457; i_337_++) {
				class104s[i_337_] = new Class104();
				class104s[i_337_].aString1286 = stream.readString(1227296373);
				bool = stream.readUnsignedByte() == 1;
				if (bool)
					class104s[i_337_].aString1290 = stream.readString(1589394523);
				else
					class104s[i_337_].aString1290 = class104s[i_337_].aString1286;
				class104s[i_337_].aString1285 = Class641.method10704(class104s[i_337_].aString1290, Class242.aClass91_2471, -2126295611);
				class104s[i_337_].anInt1288 = stream.readUnsignedShort() * -1763063465;
				class104s[i_337_].aByte1287 = stream.readByte();
				class104s[i_337_].aString1289 = stream.readString(1139925564);
				if (class104s[i_337_].aString1290.equals(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12179))
					Class510.aByte6978 = class104s[i_337_].aByte1287;
			}
			boolean bool_338_ = false;
			int i_339_ = -2075991457 * Class695_Sub3.anInt10976;
			do {
				if (i_339_ <= 0)
					break;
				bool_338_ = true;
				i_339_--;
				for (int i_340_ = 0; i_340_ < i_339_; i_340_++) {
					if (class104s[i_340_].aString1285.compareTo(class104s[i_340_ + 1].aString1285) > 0) {
						Class104 class104 = class104s[i_340_];
						class104s[i_340_] = class104s[i_340_ + 1];
						class104s[i_340_ + 1] = class104;
						bool_338_ = false;
					}
				}
			} while (!bool_338_);
			Class679.aClass104Array8629 = class104s;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4772 == class109.incomingPacket) {
			Class106.anInt1320 = stream.readUnsignedByte() * -186039545;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4611 == class109.incomingPacket) {
			int i_341_ = stream.readShort();
			int i_342_ = stream.readShort();
			int i_343_ = stream.readLEInt();
			Class224.method4184((byte) -37);
			Class281.method5187(i_343_, i_342_, i_341_, 1485166684);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4716 == class109.incomingPacket) {
			int i_344_ = stream.readUnsignedShortLE((byte) 123);
			if (i_344_ == 65535)
				i_344_ = -1;
			int i_345_ = stream.readIntV2();
			int i_346_ = stream.readLEInt();
			Class224.method4184((byte) -15);
			Class523.method8701(i_346_, i_344_, i_345_, -874301943);
			Class9 class9 = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_344_, -1290144691);
			Class320.method5695(i_346_, class9.anInt107 * -1615963605, class9.anInt94 * 608991827, 1387730399 * class9.anInt92, (byte) -90);
			Class230.method4322(i_346_, class9.anInt138 * 288478567, class9.anInt97 * 560960069, class9.anInt95 * -451529449, 1183902211);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.WORLD_LIST) {
			boolean bool = stream.readUnsignedByte() == 1;
			byte[] is = new byte[class109.anInt1359 * 1011661087 - 1];
			stream.method16460(is, 0, (1011661087 * class109.anInt1359 - 1), -2059210946);
			Class597.method9914(bool, is, -1903210116);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4739 == class109.incomingPacket) {
			decodeSubPacket(SubIncomingPacket.aClass421_4595, 1769813785);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.CS_VAR_STRING_1) {
			int i_347_ = stream.readUnsignedShortLE128();
			String string = stream.readString(760206623);
			Class224.method4184((byte) -76);
			Class684.method13928(i_347_, string, 4);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4702) {
			int i_348_ = stream.readUnsignedByte();
			i_348_ = -i_348_ - 2;
			client.aMap11163.remove(Integer.valueOf(i_348_));
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4685 == class109.incomingPacket) {
			while (stream.anInt10689 * -441238943 < class109.anInt1359 * 1011661087) {
				int i_349_ = stream.readUnsignedByte();
				boolean bool = 1 == (i_349_ & 0x1);
				String string = stream.readString(1666840184);
				String string_350_ = stream.readString(1843906583);
				String string_351_ = stream.readString(888767274);
				for (int i_352_ = 0; i_352_ < 182205737 * client.anInt11299; i_352_++) {
					Class72 class72 = client.aClass72Array11301[i_352_];
					if (bool) {
						if (string_350_.equals(class72.aString785)) {
							class72.aString785 = string;
							class72.aString786 = string_350_;
							string = null;
							break;
						}
					} else if (string.equals(class72.aString785)) {
						class72.aString785 = string;
						class72.aString786 = string_350_;
						class72.aString787 = string_351_;
						string = null;
						break;
					}
				}
				if (null != string && client.anInt11299 * 182205737 < 400) {
					Class72 class72 = new Class72();
					client.aClass72Array11301[client.anInt11299 * 182205737] = class72;
					class72.aString785 = string;
					class72.aString786 = string_350_;
					class72.aString787 = string_351_;
					class72.aBool788 = 2 == (i_349_ & 0x2);
					client.anInt11299 += 1142402841;
				}
			}
			client.anInt11047 = -97421591 * client.anInt11221;
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4733 == class109.incomingPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(1189628739);
			String string_353_ = string;
			if (bool)
				string_353_ = stream.readString(1768676852);
			long l = (long) stream.readUnsignedShort();
			long l_354_ = (long) stream.read24BitUnsignedInteger(786008649);
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), -668092783);
			long l_355_ = (l << 32) + l_354_;
			boolean bool_356_ = false;
			while_125_: do {
				for (int i_357_ = 0; i_357_ < 100; i_357_++) {
					if (client.aLongArray11268[i_357_] == l_355_) {
						bool_356_ = true;
						break while_125_;
					}
				}
				if (class406.aBool4209) {
					if (client.aBool11180 && !client.aBool11169 || client.aBool11172)
						bool_356_ = true;
					else if (Class6.method585(string_353_, 1394367524))
						bool_356_ = true;
				}
			} while (false);
			if (!bool_356_) {
				client.aLongArray11268[client.anInt11269 * -402274783] = l_355_;
				client.anInt11269 = -1378402847 * ((client.anInt11269 * -402274783 + 1) % 100);
				String string_358_ = (Class144.method2387(Class245.method4621(stream, 2057000470), 1460674981));
				int i_359_ = class406.aBool4208 ? 7 : 3;
				if (class406.anInt4200 * -2095289761 != -1)
					Class452.method7332(i_359_, 0, new StringBuilder().append(Class202.method3775((class406.anInt4200 * -2095289761), 2140459328)).append(string).toString(), new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 2071920376)).append(string_353_).toString(), string, string_358_, null, -1, class406, -1878137651);
				else
					Class452.method7332(i_359_, 0, string, string_353_, string, string_358_, null, -1, class406, -1856978753);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4757 == class109.incomingPacket) {
			Class149.method2493(false, (byte) -50);
			class109.incomingPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4751 == class109.incomingPacket) {
			String string = stream.readString(1385046150);
			long l = (long) stream.readUnsignedShort();
			long l_360_ = (long) stream.read24BitUnsignedInteger(292734916);
			Class406 class406 = (Class406) Class26.method858(Class406.method6551((byte) 5), stream.readUnsignedByte(), -68866305);
			boolean bool = stream.readUnsignedByte() == 1;
			int i_361_ = stream.readUnsignedShort();
			long l_362_ = l_360_ + (l << 32);
			boolean bool_363_ = false;
			while_126_: do {
				if (Class703.aClass219_8825 == null)
					bool_363_ = true;
				else {
					for (int i_364_ = 0; i_364_ < 100; i_364_++) {
						if (client.aLongArray11268[i_364_] == l_362_) {
							bool_363_ = true;
							break while_126_;
						}
					}
					if (class406.aBool4209 && Class6.method585(string, -904290880))
						bool_363_ = true;
				}
			} while (false);
			if (!bool_363_) {
				client.aLongArray11268[-402274783 * client.anInt11269] = l_362_;
				client.anInt11269 = (-402274783 * client.anInt11269 + 1) % 100 * -1378402847;
				String string_365_ = Exception_Sub3.aClass51_11362.method1277(i_361_, 1578749798).method18409(stream, 855371304);
				int i_366_ = bool ? 23 : 25;
				if (-1 != -2095289761 * class406.anInt4200)
					Class452.method7332(i_366_, 0, new StringBuilder().append(Class202.method3775((class406.anInt4200 * -2095289761), 2090795394)).append(string).toString(), new StringBuilder().append(Class202.method3775((-2095289761 * class406.anInt4200), 2001580498)).append(string).toString(), string, string_365_, Class703.aClass219_8825.method4023(-243123030), i_361_, class406, 786779676);
				else
					Class452.method7332(i_366_, 0, string, string, string, string_365_, Class703.aClass219_8825.method4023(-1143455868), i_361_, class406, -897500986);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4740) {
			boolean bool = stream.readUnsigned128Byte() == 1;
			Class224.method4184((byte) -73);
			Class619.aBool8115 = bool;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.PLAYER_OPTION) {
			int i_367_ = stream.readUnsignedByte();
			String string = stream.readString(2080346413);
			int i_368_ = stream.readUnsignedShortLE128();
			if (65535 == i_368_)
				i_368_ = -1;
			int i_369_ = stream.readUnsignedByteC(26955118);
			if (i_367_ >= 1 && i_367_ <= 8) {
				if (string.equalsIgnoreCase("null"))
					string = null;
				client.aStringArray11262[i_367_ - 1] = string;
				client.anIntArray11175[i_367_ - 1] = i_368_;
				client.aBoolArray11177[i_367_ - 1] = 0 == i_369_;
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4760) {
			int i_370_ = stream.readInt();
			int i_371_ = stream.readUnsignedShortLE((byte) 114);
			int i_372_ = stream.readInt();
			Class224.method4184((byte) -125);
			Class583.method9675(i_372_, 5, i_371_, i_370_, -702203871);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4720) {
			while (stream.anInt10689 * -441238943 < 1011661087 * class109.anInt1359) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(1445224239);
				String string_373_ = stream.readString(2052206896);
				int i_374_ = stream.readUnsignedShort();
				int i_375_ = stream.readUnsignedByte();
				int i_376_ = stream.readUnsignedByte();
				boolean bool_377_ = 0 != (i_376_ & 0x2);
				boolean bool_378_ = 0 != (i_376_ & 0x1);
				String string_379_ = "";
				int i_380_ = -1;
				int i_381_ = 0;
				if (i_374_ > 0) {
					string_379_ = stream.readString(1008786228);
					i_380_ = stream.readUnsignedByte();
					i_381_ = stream.readInt();
				}
				String string_382_ = stream.readString(1343545530);
				for (int i_383_ = 0; i_383_ < client.anInt11261 * -67152419; i_383_++) {
					Class69 class69 = client.aClass69Array11297[i_383_];
					if (!bool) {
						if (string.equals(class69.aString776)) {
							if (class69.anInt774 * -62014255 != i_374_) {
								boolean bool_384_ = true;
								for (Class522_Sub5 class522_sub5 = ((Class522_Sub5) client.aClass705_11298.method14317(297060422)); class522_sub5 != null; class522_sub5 = ((Class522_Sub5) client.aClass705_11298.method14320((byte) -29))) {
									if (class522_sub5.aString10325.equals(string)) {
										if (0 != i_374_ && 0 == (class522_sub5.aShort10327)) {
											class522_sub5.method8682(-467658428);
											bool_384_ = false;
										} else if (0 == i_374_ && (class522_sub5.aShort10327) != 0) {
											class522_sub5.method8682(1314183165);
											bool_384_ = false;
										}
									}
								}
								if (bool_384_)
									client.aClass705_11298.method14322(new Class522_Sub5(string, i_374_), -2137491078);
								class69.anInt774 = i_374_ * 720903217;
							}
							class69.aString779 = string_373_;
							class69.aString775 = string_379_;
							class69.anInt773 = i_375_ * -612359011;
							class69.anInt777 = i_380_ * 626102097;
							class69.aBool778 = bool_377_;
							class69.aBool780 = bool_378_;
							class69.aString781 = string_382_;
							class69.anInt772 = 891285645 * i_381_;
							string = null;
							break;
						}
					} else if (string_373_.equals(class69.aString776)) {
						class69.aString776 = string;
						class69.aString779 = string_373_;
						string = null;
						break;
					}
				}
				if (string != null && -67152419 * client.anInt11261 < 400) {
					Class69 class69 = new Class69();
					client.aClass69Array11297[client.anInt11261 * -67152419] = class69;
					class69.aString776 = string;
					class69.aString779 = string_373_;
					class69.anInt774 = 720903217 * i_374_;
					class69.aString775 = string_379_;
					class69.anInt773 = i_375_ * -612359011;
					class69.anInt777 = 626102097 * i_380_;
					class69.aBool778 = bool_377_;
					class69.aBool780 = bool_378_;
					class69.aString781 = string_382_;
					class69.anInt772 = i_381_ * 891285645;
					client.anInt11261 += 610118261;
				}
			}
			client.anInt11083 = 218860618;
			client.anInt11047 = -97421591 * client.anInt11221;
			boolean bool = false;
			int i_385_ = -67152419 * client.anInt11261;
			do {
				if (i_385_ <= 0)
					break;
				bool = true;
				i_385_--;
				for (int i_386_ = 0; i_386_ < i_385_; i_386_++) {
					boolean bool_387_ = false;
					Class69 class69 = client.aClass69Array11297[i_386_];
					Class69 class69_388_ = client.aClass69Array11297[i_386_ + 1];
					if ((-62014255 * class69.anInt774 != 44791937 * Class3.aClass13_34.anInt181) && (class69_388_.anInt774 * -62014255 == Class3.aClass13_34.anInt181 * 44791937))
						bool_387_ = true;
					if (!bool_387_ && 0 == class69.anInt774 * -62014255 && class69_388_.anInt774 * -62014255 != 0)
						bool_387_ = true;
					if (!bool_387_ && !class69.aBool778 && class69_388_.aBool778)
						bool_387_ = true;
					if (!bool_387_ && !class69.aBool780 && class69_388_.aBool780)
						bool_387_ = true;
					if (bool_387_) {
						Class69 class69_389_ = client.aClass69Array11297[i_386_];
						client.aClass69Array11297[i_386_] = client.aClass69Array11297[1 + i_386_];
						client.aClass69Array11297[i_386_ + 1] = class69_389_;
						bool = false;
					}
				}
			} while (!bool);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4711) {
			int i_390_ = stream.readIntV2();
			int i_391_ = stream.readInt();
			Class224.method4184((byte) -124);
			Class583.method9675(i_390_, 2, i_391_, -1, -702203871);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4693 == class109.incomingPacket) {
			int i_392_ = stream.readUnsignedShortLE((byte) 97);
			int i_393_ = stream.readLEInt();
			int i_394_ = stream.readUnsignedShort128();
			int i_395_ = stream.readLEInt();
			int i_396_ = stream.readInt();
			int i_397_ = stream.readUnsignedByte();
			int i_398_ = stream.readLEInt();
			int i_399_ = stream.readIntV2();
			Class224.method4184((byte) -107);
			Class6.method584(i_398_, new Class527_Sub41_Sub1(i_392_, i_397_, i_394_), new int[] { i_399_, i_393_, i_396_, i_395_ }, false, -276913165);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4723) {
			int i_400_ = stream.readUnsignedShort();
			client.anInt11304 = -1791423621;
			client.anInt11245 = 5641215 * i_400_;
			client.anInt11080 = 0;
			Class186.aClass459_2118.method7480(1310321663 * client.anInt11245, -1654408596);
			Exception_Sub7.method17974(-849704026);
			Class700_Sub10.method16944((byte) 88);
			int i_401_ = stream.readUnsignedShort();
			client.anInt11084 = i_401_ * -963793497;
			int i_402_ = stream.readUnsignedByte();
			Class213.aClass527_Sub38_2261 = new RSByteBuffer(i_402_);
			Class213.aClass527_Sub38_2261.writeBytes(stream.buffer, -441238943 * stream.anInt10689, i_402_, (byte) 110);
			stream.anInt10689 += 1474750881 * i_402_;
			class109.incomingPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4765 == class109.incomingPacket) {
			int i_403_ = stream.readUnsignedShortLE128() << 2;
			int i_404_ = stream.readUnsignedByte();
			int i_405_ = stream.readUnsignedByte128();
			int i_406_ = stream.readUnsignedByte128();
			int i_407_ = stream.readUnsignedByte128();
			Class224.method4184((byte) -68);
			Class352.method6212(i_405_, i_406_, i_403_, i_407_, i_404_, true, (byte) -47);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4642) {
			int i_408_ = stream.readUnsignedShort();
			int i_409_ = stream.readUnsignedShort();
			int i_410_ = stream.readUnsignedShort();
			Class224.method4184((byte) -102);
			if (null != Class183.aClass240Array2100[i_408_]) {
				for (int i_411_ = i_409_; i_411_ < i_410_; i_411_++) {
					int i_412_ = stream.read24BitUnsignedInteger(1962165908);
					if (i_411_ < (Class183.aClass240Array2100[i_408_].aClass243Array2392).length && null != (Class183.aClass240Array2100[i_408_].aClass243Array2392[i_411_]))
						Class183.aClass240Array2100[i_408_].aClass243Array2392[i_411_].anInt2498 = -1588674119 * i_412_;
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4742 == class109.incomingPacket) {
			int i_413_ = stream.readUnsignedShort128();
			int i_414_ = stream.readInt();
			int i_415_ = stream.readUnsignedShort128();
			if (65535 == i_415_)
				i_415_ = -1;
			int i_416_ = stream.readUnsignedShortLE((byte) 108);
			if (i_416_ == 65535)
				i_416_ = -1;
			Class224.method4184((byte) -26);
			for (int i_417_ = i_416_; i_417_ <= i_415_; i_417_++) {
				long l = ((long) i_414_ << 32) + (long) i_417_;
				Class527_Sub25 class527_sub25 = (Class527_Sub25) client.aClass14_11249.method709(l);
				Class527_Sub25 class527_sub25_418_;
				if (null == class527_sub25) {
					if (i_417_ == -1)
						class527_sub25_418_ = new Class527_Sub25((Class648.method10837(i_414_, 1859762649).aClass527_Sub25_2585.anInt10520) * -2105107355, i_413_);
					else
						class527_sub25_418_ = new Class527_Sub25(0, i_413_);
				} else {
					class527_sub25_418_ = new Class527_Sub25((class527_sub25.anInt10520 * -2105107355), i_413_);
					class527_sub25.method8735(-1889161967);
				}
				client.aClass14_11249.method714(class527_sub25_418_, l);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4653) {
			if (!client.aBool11309) {
				try {
					int i_419_ = stream.readUnsigned128Byte();
					client.aClass223_11241.method4159(i_419_, -1085620692);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, -1804640750);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.INTERFACE_SETTINGS) {
			int fromSlot = stream.readUnsignedShort128();
			if (fromSlot == 65535)
				fromSlot = -1;
			int settings = stream.readIntV2();
			int toSlot = stream.readUnsignedShort128();
			if (toSlot == 65535)
				toSlot = -1;
			int interHash = stream.readInt();
			Class224.method4184((byte) -37);
			for (int index = fromSlot; index <= toSlot; index++) {
				long l = (long) index + ((long) interHash << 32);
				Class527_Sub25 class527_sub25 = (Class527_Sub25) client.aClass14_11249.method709(l);
				Class527_Sub25 class527_sub25_425_;
				if (null == class527_sub25) {
					if (index == -1)
						class527_sub25_425_ = new Class527_Sub25(settings, (Class648.method10837(interHash, 1099753529).aClass527_Sub25_2585.anInt10512) * -43099239);
					else
						class527_sub25_425_ = new Class527_Sub25(settings, -1);
				} else {
					class527_sub25_425_ = new Class527_Sub25(settings, (-43099239 * class527_sub25.anInt10512));
					class527_sub25.method8735(-1889161967);
				}
				client.aClass14_11249.method714(class527_sub25_425_, l);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.CHUNK_SCENE == class109.incomingPacket) {
			Class579.anInt7673 = stream.readUnsignedByteC(1138232618) * -1073751099;
			Class304.anInt3428 = (stream.read128Byte((byte) 52) << 3) * 2143073115;
			Class5.anInt53 = ((stream.readByte() << 3) * -1089793007);
			while (stream.anInt10689 * -441238943 < 1011661087 * class109.anInt1359) {
				SubIncomingPacket class421 = (Class329.method5809(-1096605353)[stream.readUnsignedByte()]);
				decodeSubPacket(class421, 1769813785);
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.VARP_2) {
			int i_426_ = stream.readIntV2();
			int i_427_ = stream.readUnsignedShortLE((byte) 100);
			Class671.aClass97_8584.aClass603_1162.method10015((Class160) Class248.aClass95_Sub1_Sub1_2731.method81(i_427_, -11385045), i_426_, 1378859006);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4697) {
			int i_428_ = stream.readLEInt();
			Class224.method4184((byte) -48);
			Class583.method9675(i_428_, 3, -899375681 * client.anInt11070, 0, -702203871);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4647 == class109.incomingPacket) {
			byte i_429_ = stream.read128Byte((byte) 112);
			int i_430_ = stream.readUnsignedShort();
			Class224.method4184((byte) -76);
			Class80.method1573(i_430_, i_429_, 545800278);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4637 == class109.incomingPacket) {
			int i_431_ = stream.readUnsignedByte();
			Class698 class698 = (Class698) Class26.method858(Class466.method7662((byte) 56), i_431_, -1377513833);
			if (null == class698)
				class698 = Class698.aClass698_8766;
			Class115.method2030(class698, (short) 1678);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4658) {
			Class245.aClass226_2698.method4297(Class206.aClass206_2222.method3836(-345358096), (byte) 48);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4780) {
			Class527_Sub38_Sub2 class527_sub38_sub2_432_ = new Class527_Sub38_Sub2(class109.anInt1359 * 1011661087);
			System.arraycopy((class109.aClass527_Sub38_Sub2_1364.buffer), (class109.aClass527_Sub38_Sub2_1364.anInt10689 * -441238943), class527_sub38_sub2_432_.buffer, 0, 1011661087 * class109.anInt1359);
			Class296_Sub1.method15694(-1820245067);
			if (Class204.aClass527_Sub31_2213.aClass700_Sub22_10631.method17121((byte) 34) == 1)
				Class396.aClass506_4119.method8239(new Class514(Class503.aClass503_6877, class527_sub38_sub2_432_), (byte) -94);
			else
				client.aClass509_11072.method8280(new Class514(Class503.aClass503_6877, class527_sub38_sub2_432_), -107507950);
			class109.incomingPacket = null;
			return false;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4763) {
			if (!client.aBool11309) {
				try {
					int i_433_ = stream.readUnsigned128Byte();
					int i_434_ = stream.readUnsigned128Byte();
					int i_435_ = stream.readUnsignedByteC(-1354123030);
					client.aClass223_11241.method4154(i_435_, 1417732307).method4086(i_433_, i_434_, -165069504);
				} catch (RuntimeException runtimeexception) {
					Class180.method3542(null, runtimeexception, 1604547405);
					Class508.method8275(class109, -1900610607);
				}
			}
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4641 == class109.incomingPacket) {
			int i_436_ = stream.readIntV2();
			String string = stream.readString(2016571418);
			Class224.method4184((byte) -44);
			Class40.method1169(i_436_, string, -932073433);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4655) {
			int i_437_ = stream.readInt();
			Class224.method4184((byte) -71);
			Class527_Sub41 class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method709((long) i_437_));
			if (class527_sub41 != null)
				Class231.method4326(class527_sub41, true, false, 1995431401);
			if (null != client.aClass243_11196) {
				Class430.method6876(client.aClass243_11196, (byte) 91);
				client.aClass243_11196 = null;
			}
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4696) {
			if (Class707.aBool8841 && Class56.aFrame711 != null)
				Class188.method3663(Class204.aClass527_Sub31_2213.aClass700_Sub2_10596.method16853((byte) 37), -1, -1, false, (byte) -28);
			byte[] is = new byte[1011661087 * class109.anInt1359 - 1];
			boolean bool = stream.readUnsignedByte() == 1;
			stream.method18449(is, 0, (1011661087 * class109.anInt1359 - 1), 30199037);
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			String string = class527_sub38.readString(1991039474);
			if (bool) {
				String string_438_ = class527_sub38.readString(1855338620);
				if (string_438_.length() == 0)
					string_438_ = string;
				if (!client.aBool11271 || Class234.aString2373.startsWith("mac") || !Class282.method5194(string, 1, Class411.aClass411_4368.method6584((byte) 85), (byte) -61))
					Class183.method3558(string_438_, true, client.aBool11193, 1563338678);
			} else
				Class183.method3558(string, true, client.aBool11193, 1080365756);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4737 == class109.incomingPacket) {
			int i_439_ = stream.readUnsignedShortLE((byte) 107);
			int i_440_ = stream.readIntV1();
			int i_441_ = stream.readUnsignedShortLE((byte) 105);
			int i_442_ = stream.readIntV2();
			int i_443_ = stream.readInt();
			int i_444_ = stream.readUnsigned128Byte();
			int i_445_ = stream.readIntV1();
			int i_446_ = stream.readIntV1();
			Class224.method4184((byte) -112);
			Class6.method584(i_440_, new Class527_Sub41_Sub4(i_439_, i_444_, i_441_), new int[] { i_443_, i_445_, i_446_, i_442_ }, false, 692035917);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4712 == class109.incomingPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			if (bool)
				Class393.method6490(2, -487945740);
			else
				Class393.method6490(1, -1994983488);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4629 == class109.incomingPacket) {
			stream.anInt10689 += -1656648292;
			if (stream.method16475(1265672665))
				Class596.method9911(stream, (stream.anInt10689 * -441238943) - 28, (byte) -41);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4645 == class109.incomingPacket) {
			int i_447_ = stream.readUnsignedShort();
			Class245.aClass226_2698.method4248(i_447_, -1690541664);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4726 == class109.incomingPacket) {
			String string = stream.readString(1645615565);
			int i_448_ = stream.readUnsignedShort();
			int i_449_ = stream.readUnsignedShort();
			int i_450_ = stream.readUnsignedShort();
			Class3.aClass13_36.aString178 = string;
			Class3.aClass13_36.anInt181 = i_448_ * 1189922689;
			Class3.aClass13_36.anInt179 = i_449_ * -1993161747;
			Class3.aClass13_36.anInt180 = -911001455 * i_450_;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4681) {
			Class265.aClass711_2876 = Class321.method5703(stream.readUnsignedByte(), (byte) 1);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4785) {
			int i_451_ = stream.readUnsignedShort();
			if (i_451_ == 65535)
				i_451_ = -1;
			int i_452_ = stream.readUnsignedByte();
			int i_453_ = stream.readUnsignedShort();
			int i_454_ = stream.readUnsignedByte();
			int i_455_ = stream.readUnsignedShort();
			int i_456_ = stream.readUnsignedShort();
			Class483 class483 = (Class245.aClass226_2698.method4211(Class193.aClass193_2145, Class245.aClass226_2698, i_451_, i_452_, i_454_, Class206.aClass206_2228.method3836(1326745677), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_455_, false, (byte) 48));
			if (null != class483)
				Class245.aClass226_2698.method4202(class483, i_456_, i_453_, (byte) -117);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_UPDATE == class109.incomingPacket) {
			Class644.method10742(stream, 1011661087 * class109.anInt1359, 879698488);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4627) {
			int i_457_ = stream.readLEInt();
			int i_458_ = stream.readUnsignedByte128();
			int i_459_ = stream.readUnsignedByteC(620561387);
			int i_460_ = stream.readLEInt();
			int i_461_ = stream.readUnsignedByteC(1013497338);
			int i_462_ = i_460_ >> 28;
			int i_463_ = i_460_ >> 14 & 0x3fff;
			int i_464_ = i_460_ & 0x3fff;
			Class245.aClass226_2698.method4226(i_457_, i_459_, true, i_462_, i_463_ << 9, i_464_ << 9, i_461_ << 9, i_458_ << 9, -1323575999);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4690 == class109.incomingPacket) {
			String string = stream.readString(1673262724);
			String string_465_ = Class144.method2387(Class245.method4621(stream, 1974179656), 630727535);
			Class99.method1766(6, 0, string, string, string, string_465_, null, 185668773);
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4618) {
			int i_466_ = stream.readIntV2();
			int i_467_ = stream.readIntV2();
			Class224.method4184((byte) -90);
			Class527_Sub41 class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method709((long) i_466_));
			Class527_Sub41 class527_sub41_468_ = ((Class527_Sub41) client.aClass14_11276.method709((long) i_467_));
			if (class527_sub41_468_ != null)
				Class231.method4326(class527_sub41_468_, (null == class527_sub41 || ((1307137747 * class527_sub41_468_.anInt10752) != (1307137747 * class527_sub41.anInt10752))), false, 1550106125);
			if (class527_sub41 != null) {
				class527_sub41.method8735(-1889161967);
				client.aClass14_11276.method714(class527_sub41, (long) i_467_);
			}
			Class243 class243 = Class648.method10837(i_466_, -1421761204);
			if (null != class243)
				Class430.method6876(class243, (byte) 112);
			class243 = Class648.method10837(i_467_, -1820485644);
			if (class243 != null) {
				Class430.method6876(class243, (byte) 24);
				Class397.method6513((Class183.aClass240Array2100[-254728301 * class243.anInt2504 >>> 16]), class243, true, 428315903);
			}
			if (-2119864417 * client.anInt11237 != -1)
				Class316_Sub1.method15722(-2119864417 * client.anInt11237, 1, -489029268);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4734 == class109.incomingPacket) {
			int i_469_ = stream.readInt();
			int i_470_ = i_469_ >> 28 & 0x3;
			int i_471_ = i_469_ >> 14 & 0x3fff;
			int i_472_ = i_469_ & 0x3fff;
			int i_473_ = stream.readUnsignedByte128();
			int i_474_ = stream.readUnsignedByte128();
			int i_475_ = i_474_ >> 2;
			int i_476_ = i_474_ & 0x3;
			int i_477_ = client.anIntArray11006[i_475_];
			int i_478_ = stream.readIntV2();
			Class592 class592 = client.aClass509_11072.method8283((short) 5482);
			i_471_ -= class592.anInt7798 * 153371143;
			i_472_ -= -2029646807 * class592.anInt7799;
			Class271.method5078(i_470_, i_471_, i_472_, i_477_, i_475_, i_476_, i_478_, i_473_, 562526483);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4657 == class109.incomingPacket) {
			Class485.aString5463 = (1011661087 * class109.anInt1359 > 2 ? stream.readString(1727580602) : Class53.aClass53_660.method1290((Class144_Sub1.aClass671_8995), (byte) -49));
			client.anInt11178 = (1011661087 * class109.anInt1359 > 0 ? stream.readUnsignedShort() : -1) * -710728053;
			if (client.anInt11178 * -1908960989 == 65535)
				client.anInt11178 = 710728053;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4744) {
			int i_479_ = stream.readUnsignedShort128();
			int i_480_ = stream.readUnsignedByteC(807046310);
			boolean bool = (i_480_ & 0x1) == 1;
			Class70.method1488(i_479_, bool, (short) -25119);
			client.anIntArray11181[(client.anInt11227 += 639081873) * 2058273649 - 1 & 0x3f] = i_479_;
			class109.incomingPacket = null;
			return true;
		}
		if (class109.incomingPacket == IncomingPacket.aClass422_4759) {
			int i_481_ = stream.readInt();
			int i_482_ = stream.readInt();
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4483, class109.aClass2_1367, (byte) -87);
			class527_sub15.buffer.writeIntV2(i_481_, (byte) 74);
			class527_sub15.buffer.writeIntLE2(i_482_, (byte) -74);
			class527_sub15.buffer.writeByte128(client.anInt7014 * -1176934951, -362087053);
			class109.method1969(class527_sub15, (byte) 1);
			class109.incomingPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4622 == class109.incomingPacket) {
			int i_483_ = stream.readIntV1();
			int i_484_ = stream.readIntV1();
			Class224.method4184((byte) -31);
			Class87.method1623(i_483_, i_484_, 65536);
			class109.incomingPacket = null;
			return true;
		}
		Class180.method3542(new StringBuilder().append(class109.incomingPacket != null ? class109.incomingPacket.id * -874813153 : -1).append(Class33.aString325).append(class109.aClass422_1376 != null ? class109.aClass422_1376.id * -874813153 : -1).append(Class33.aString325).append(null != class109.aClass422_1377 ? class109.aClass422_1377.id * -874813153 : -1).append(" ").append(1011661087 * class109.anInt1359).toString(), new RuntimeException(), 1604547405);
		Class149.method2493(false, (byte) -83);
		return true;
	}

	
	static final void decodeSubPacket(SubIncomingPacket packet, int i) {
		Class527_Sub38_Sub2 stream = client.aClass109_11067.aClass527_Sub38_Sub2_1364;
		if (!RS3Applet.IDENTIFIED_SUB.contains(packet))
			System.out.println("Sub packet: " + packet.id);
		if (packet == SubIncomingPacket.aClass421_4605) {
			int i_2_ = stream.readUnsignedByte();
			boolean bool = (i_2_ & 0x80) != 0;
			int i_3_ = Class5.anInt53 * -509846287 + (i_2_ >> 3 & 0x7);
			int i_4_ = 1941718227 * Class304.anInt3428 + (i_2_ & 0x7);
			int i_5_ = i_3_ + stream.readByte();
			int i_6_ = i_4_ + stream.readByte();
			int i_7_ = stream.readShort();
			int i_8_ = stream.readUnsignedShort();
			int i_9_ = stream.readUnsignedByte() * 4;
			int i_10_ = stream.readUnsignedByte() * 4;
			int i_11_ = stream.readUnsignedShort();
			int i_12_ = stream.readUnsignedShort();
			int i_13_ = stream.readUnsignedByte();
			int i_14_ = stream.readUnsignedShort();
			int i_15_ = stream.readShort();
			if (i_13_ == 255)
				i_13_ = -1;
			if (client.aClass509_11072.method8279(313614) != Class503.aClass503_6875) {
				if (i_3_ >= 0 && i_4_ >= 0 && i_3_ < client.aClass509_11072.method8284((byte) 75) && i_4_ < client.aClass509_11072.method8285(-366835900) && i_5_ >= 0 && i_6_ >= 0 && i_5_ < client.aClass509_11072.method8284((byte) 74) && i_6_ < client.aClass509_11072.method8285(2038387749) && i_8_ != 65535) {
					i_3_ = i_3_ * 512 + 256;
					i_4_ = 256 + i_4_ * 512;
					i_5_ = 512 * i_5_ + 256;
					i_6_ = i_6_ * 512 + 256;
					i_9_ <<= 2;
					i_10_ <<= 2;
					i_14_ <<= 2;
					Class640_Sub1_Sub2_Sub5 class640_sub1_sub2_sub5 = (new Class640_Sub1_Sub2_Sub5(client.aClass509_11072.method8314(740741614), i_8_, 1551166221 * Class579.anInt7673, 1551166221 * Class579.anInt7673, i_3_, i_4_, i_9_, client.anInt11019 + i_11_, client.anInt11019 + i_12_, i_13_, i_14_, 0, i_7_, i_10_, bool, -1, i_15_));
					class640_sub1_sub2_sub5.method18812(i_5_, i_6_, Class590.method9853(i_5_, i_6_, 1551166221 * Class579.anInt7673, (byte) 5) - i_10_, client.anInt11019 + i_11_, (byte) -93);
					client.aClass694_11290.method14147(new Class527_Sub8_Sub5(class640_sub1_sub2_sub5), -1377154059);
				}
			}
		} else if (packet == SubIncomingPacket.aClass421_4595) {
			int i_16_ = stream.readUnsignedByte();
			int i_17_ = (i_16_ >> 4 & 0xf) + -1019692574 * Class5.anInt53;
			int i_18_ = Class304.anInt3428 * -411530842 + (i_16_ & 0xf);
			int i_19_ = stream.readUnsignedByte();
			boolean bool = 0 != (i_19_ & 0x1);
			boolean bool_20_ = 0 != (i_19_ & 0x2);
			int i_21_ = bool_20_ ? i_19_ >> 2 : -1;
			int i_22_ = i_17_ + stream.readByte();
			int i_23_ = i_18_ + stream.readByte();
			int i_24_ = stream.readShort();
			int i_25_ = stream.readShort();
			int i_26_ = stream.readUnsignedShort();
			int i_27_ = stream.readUnsignedByte();
			if (bool_20_)
				i_27_ = (byte) i_27_;
			else
				i_27_ *= 4;
			int i_28_ = stream.readUnsignedByte() * 4;
			int i_29_ = stream.readUnsignedShort();
			int i_30_ = stream.readUnsignedShort();
			int i_31_ = stream.readUnsignedByte();
			int i_32_ = stream.readUnsignedShort();
			if (i_31_ == 255)
				i_31_ = -1;
			int i_33_ = stream.readShort();
			if (client.aClass509_11072.method8279(-2137901901) != Class503.aClass503_6875) {
				if (i_17_ >= 0 && i_18_ >= 0 && i_17_ < client.aClass509_11072.method8284((byte) 68) * 2 && i_18_ < client.aClass509_11072.method8284((byte) 15) * 2 && i_22_ >= 0 && i_23_ >= 0 && (i_22_ < client.aClass509_11072.method8285(1131197779) * 2) && i_23_ < client.aClass509_11072.method8285(796418358) * 2 && i_26_ != 65535) {
					i_17_ = 256 * i_17_;
					i_18_ = 256 * i_18_;
					i_22_ *= 256;
					i_23_ = 256 * i_23_;
					i_27_ <<= 2;
					i_28_ <<= 2;
					i_32_ <<= 2;
					Class70.method1490(i_26_, i_24_, i_25_, i_21_, i_27_, i_28_, i_17_, i_18_, i_22_, i_23_, i_29_, i_30_, i_31_, i_32_, bool, i_33_, -1851258299);
				}
			}
		} else if (SubIncomingPacket.ADD_GROUND_ITEM == packet) {
			int i_34_ = stream.readUnsignedShortLE128();
			int i_35_ = stream.readUnsignedByte128();
			Class592 class592 = client.aClass509_11072.method8283((short) 29279);
			int i_36_ = (i_35_ & 0x7) + 1941718227 * Class304.anInt3428;
			int i_37_ = i_36_ + class592.anInt7799 * -2029646807;
			int i_38_ = (i_35_ >> 4 & 0x7) + Class5.anInt53 * -509846287;
			int i_39_ = 153371143 * class592.anInt7798 + i_38_;
			int i_40_ = stream.readUnsignedShort();
			boolean bool = (i_38_ >= 0 && i_36_ >= 0 && i_38_ < client.aClass509_11072.method8284((byte) 107) && i_36_ < client.aClass509_11072.method8285(1530066415));
			if (bool || client.aClass509_11072.method8279(-836223142).method8211((byte) -26)) {
				Class568.method9568(1551166221 * Class579.anInt7673, i_39_, i_37_, new Class527_Sub22(i_34_, i_40_), -264567387);
				if (bool)
					Class375.method6385(Class579.anInt7673 * 1551166221, i_38_, i_36_, 1394761684);
			}
		} else if (SubIncomingPacket.aClass421_4596 == packet) {
			stream.readUnsignedByte();
			int i_41_ = stream.readUnsignedByte();
			int i_42_ = (i_41_ >> 4 & 0x7) + -509846287 * Class5.anInt53;
			int i_43_ = (i_41_ & 0x7) + 1941718227 * Class304.anInt3428;
			int i_44_ = stream.readUnsignedShort();
			int i_45_ = stream.readUnsignedByte();
			int i_46_ = stream.read24BitUnsignedInteger(141589953);
			String string = stream.readString(1415520906);
			if (client.aClass509_11072.method8279(-501809217) != Class503.aClass503_6875)
				Class643.method10736(Class579.anInt7673 * 1551166221, i_42_, i_43_, i_45_, i_44_, i_46_, string, 65643443);
		} else if (SubIncomingPacket.aClass421_4598 == packet) {
			int i_47_ = stream.readUnsignedByte();
			Class592 class592 = client.aClass509_11072.method8283((short) 9514);
			int i_48_ = Class304.anInt3428 * 1941718227 + (i_47_ & 0x7);
			int i_49_ = -2029646807 * class592.anInt7799 + i_48_;
			int i_50_ = (i_47_ >> 4 & 0x7) + Class5.anInt53 * -509846287;
			int i_51_ = i_50_ + class592.anInt7798 * 153371143;
			int i_52_ = stream.readUnsignedShort();
			int i_53_ = stream.readUnsignedShort();
			int i_54_ = stream.readUnsignedShort();
			if (client.aClass14_11253 != null) {
				Class527_Sub12 class527_sub12 = ((Class527_Sub12) (client.aClass14_11253.method709((long) (1551166221 * Class579.anInt7673 << 28 | i_49_ << 14 | i_51_))));
				if (null != class527_sub12) {
					for (Class527_Sub22 class527_sub22 = ((Class527_Sub22) class527_sub12.aClass694_10444.method14081((short) -6661)); null != class527_sub22; class527_sub22 = (Class527_Sub22) class527_sub12.aClass694_10444.method14086(-65534)) {
						if (-875637783 * class527_sub22.anInt10494 == i_52_ && (-1543349933 * class527_sub22.anInt10493 == i_53_)) {
							class527_sub22.method8735(-1889161967);
							class527_sub22.anInt10493 = i_54_ * -1879354661;
							Class568.method9568((Class579.anInt7673 * 1551166221), i_51_, i_49_, class527_sub22, 1121846868);
							break;
						}
					}
					if (i_50_ >= 0 && i_48_ >= 0 && i_50_ < client.aClass509_11072.method8284((byte) 8) && (i_48_ < client.aClass509_11072.method8285(1756981602)))
						Class375.method6385(1551166221 * Class579.anInt7673, i_50_, i_48_, 1394761684);
				}
			}
		} else if (packet == SubIncomingPacket.REMOVE_GROUND_ITEM) {
			int i_55_ = stream.readUnsignedShort128();
			int i_56_ = stream.readUnsignedByte128();
			Class592 class592 = client.aClass509_11072.method8283((short) 25076);
			int i_57_ = 1941718227 * Class304.anInt3428 + (i_56_ & 0x7);
			int i_58_ = -2029646807 * class592.anInt7799 + i_57_;
			int i_59_ = (i_56_ >> 4 & 0x7) + Class5.anInt53 * -509846287;
			int i_60_ = i_59_ + class592.anInt7798 * 153371143;
			Class527_Sub12 class527_sub12 = ((Class527_Sub12) client.aClass14_11253.method709((long) ((Class579.anInt7673 * 1551166221) << 28 | i_58_ << 14 | i_60_)));
			if (null != class527_sub12) {
				for (Class527_Sub22 class527_sub22 = (Class527_Sub22) class527_sub12.aClass694_10444.method14081((short) 9073); class527_sub22 != null; class527_sub22 = (Class527_Sub22) class527_sub12.aClass694_10444.method14086(-65534)) {
					if (i_55_ == class527_sub22.anInt10494 * -875637783) {
						class527_sub22.method8735(-1889161967);
						break;
					}
				}
				if (class527_sub12.aClass694_10444.method14088(-329955939))
					class527_sub12.method8735(-1889161967);
				if (i_59_ >= 0 && i_57_ >= 0 && i_59_ < client.aClass509_11072.method8284((byte) 59) && i_57_ < client.aClass509_11072.method8285(1059334151))
					Class375.method6385(1551166221 * Class579.anInt7673, i_59_, i_57_, 1394761684);
			}
		} else if (packet == SubIncomingPacket.aClass421_4606) {
			int i_61_ = stream.readUnsignedByte();
			int i_62_ = (i_61_ >> 4 & 0x7) + Class5.anInt53 * -509846287;
			int i_63_ = (i_61_ & 0x7) + Class304.anInt3428 * 1941718227;
			int i_64_ = stream.readUnsignedShort();
			if (65535 == i_64_)
				i_64_ = -1;
			int i_65_ = stream.readUnsignedShort();
			int i_66_ = stream.readUnsignedShort();
			int i_67_ = stream.readUnsignedByte();
			int i_68_ = stream.readShort();
			if (client.aClass509_11072.method8279(-1543592884) != Class503.aClass503_6875) {
				if (i_62_ >= 0 && i_63_ >= 0 && i_62_ < client.aClass509_11072.method8284((byte) 5) && i_63_ < client.aClass509_11072.method8285(444543165)) {
					if (-1 == i_64_) {
						Class527_Sub8_Sub6 class527_sub8_sub6 = ((Class527_Sub8_Sub6) client.aClass14_11184.method709((long) (i_62_ << 16 | i_63_)));
						if (null != class527_sub8_sub6) {
							class527_sub8_sub6.aClass640_Sub1_Sub2_Sub4_11639.method18785(2025453218);
							class527_sub8_sub6.method8735(-1889161967);
						}
					} else {
						int i_69_ = 256 + i_62_ * 512;
						int i_70_ = 256 + i_63_ * 512;
						int i_71_ = 1551166221 * Class579.anInt7673;
						if (i_71_ < 3 && client.aClass509_11072.method8359(1634990776).method7706(i_62_, i_63_, (short) 19141))
							i_71_++;
						Class640_Sub1_Sub2_Sub4 class640_sub1_sub2_sub4 = (new Class640_Sub1_Sub2_Sub4(client.aClass509_11072.method8314(-415381480), i_64_, i_66_, Class579.anInt7673 * 1551166221, i_71_, i_69_, Class590.method9853(i_69_, i_70_, (Class579.anInt7673 * 1551166221), (byte) 5) - i_65_, i_70_, i_62_, i_62_, i_63_, i_63_, i_67_, false, i_68_));
						client.aClass14_11184.method714(new Class527_Sub8_Sub6(class640_sub1_sub2_sub4), (long) (i_62_ << 16 | i_63_));
					}
				}
			}
		} else if (packet == SubIncomingPacket.aClass421_4601) {
			int i_72_ = stream.readUnsignedByteC(-448790086);
			int i_73_ = i_72_ >> 2;
			int i_74_ = i_72_ & 0x3;
			int i_75_ = client.anIntArray11006[i_73_];
			int i_76_ = stream.readUnsignedByte();
			int i_77_ = -509846287 * Class5.anInt53 + (i_76_ >> 4 & 0x7);
			int i_78_ = (i_76_ & 0x7) + 1941718227 * Class304.anInt3428;
			if (client.aClass509_11072.method8279(-1449828846).method8211((byte) 19) || (i_77_ >= 0 && i_78_ >= 0 && i_77_ < client.aClass509_11072.method8284((byte) 28) && i_78_ < client.aClass509_11072.method8285(5470375)))
				Class492.method7994(Class579.anInt7673 * 1551166221, i_77_, i_78_, i_75_, -1, i_73_, i_74_, 696125773);
		} else if (SubIncomingPacket.aClass421_4599 == packet) {
			int i_79_ = stream.readUnsignedByte();
			int i_80_ = Class5.anInt53 * -509846287 + (i_79_ >> 4 & 0x7);
			int i_81_ = (i_79_ & 0x7) + 1941718227 * Class304.anInt3428;
			int i_82_ = stream.readUnsignedShort();
			if (i_82_ == 65535)
				i_82_ = -1;
			int i_83_ = stream.readUnsignedByte();
			int i_84_ = i_83_ >> 4 & 0xf;
			int i_85_ = i_83_ & 0x7;
			int i_86_ = stream.readUnsignedByte();
			int i_87_ = stream.readUnsignedByte();
			int i_88_ = stream.readUnsignedShort();
			if (client.aClass509_11072.method8279(-754607768) != Class503.aClass503_6875) {
				if (i_80_ >= 0 && i_81_ >= 0 && i_80_ < client.aClass509_11072.method8284((byte) 75) && i_81_ < client.aClass509_11072.method8285(941074240)) {
					int i_89_ = 1 + i_84_;
					if ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) >= i_80_ - i_89_ && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) <= i_89_ + i_80_ && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) >= i_81_ - i_89_ && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) <= i_81_ + i_89_) {
						Class442 class442 = new Class442((float) (i_80_ << 9), 0.0F, (float) (i_81_ << 9));
						int i_90_ = Class579.anInt7673 * 1551166221;
						Class245.aClass226_2698.method4218(Class193.aClass193_2145, i_82_, i_85_, i_87_, Class206.aClass206_2228.method3836(132629698), Class189.aClass189_2124, 0.0F, (float) (i_84_ << 9), class442, i_90_, i_88_, i_86_, 1587226715);
					}
				}
			}
		} else if (packet == SubIncomingPacket.aClass421_4602) {
			int i_91_ = stream.readInt();
			int i_92_ = stream.readUnsignedByte();
			((Class602) client.aClass509_11072.method8310(22045325).method81(i_91_, -455685665)).method9958(i_92_, 944498276);
		} else if (SubIncomingPacket.aClass421_4593 == packet) {
			int i_93_ = stream.readUnsignedShort128();
			int i_94_ = stream.readUnsignedShortLE((byte) 122);
			int i_95_ = stream.readUnsignedByteC(141428889);
			Class592 class592 = client.aClass509_11072.method8283((short) 27928);
			int i_96_ = 1941718227 * Class304.anInt3428 + (i_95_ & 0x7);
			int i_97_ = -2029646807 * class592.anInt7799 + i_96_;
			int i_98_ = (i_95_ >> 4 & 0x7) + -509846287 * Class5.anInt53;
			int i_99_ = class592.anInt7798 * 153371143 + i_98_;
			int i_100_ = stream.readUnsignedShortLE((byte) 126);
			if (i_93_ != client.anInt11070 * -899375681) {
				boolean bool = (i_98_ >= 0 && i_96_ >= 0 && i_98_ < client.aClass509_11072.method8284((byte) 109) && (i_96_ < client.aClass509_11072.method8285(175507398)));
				if (bool || client.aClass509_11072.method8279(-2112135252).method8211((byte) 37)) {
					Class568.method9568(Class579.anInt7673 * 1551166221, i_99_, i_97_, new Class527_Sub22(i_100_, i_94_), -1718958686);
					if (bool)
						Class375.method6385(1551166221 * Class579.anInt7673, i_98_, i_96_, 1394761684);
				}
			}
		} else if (SubIncomingPacket.aClass421_4604 == packet) {
			int i_101_ = stream.readUnsigned128Byte();
			int i_102_ = i_101_ >> 2;
			int i_103_ = i_101_ & 0x3;
			int i_104_ = client.anIntArray11006[i_102_];
			int i_105_ = stream.readUnsignedByte128();
			int i_106_ = (i_105_ >> 4 & 0x7) + Class5.anInt53 * -509846287;
			int i_107_ = Class304.anInt3428 * 1941718227 + (i_105_ & 0x7);
			int i_108_ = stream.readLEInt();
			if (client.aClass509_11072.method8279(-1355108596).method8211((byte) 0) || (i_106_ >= 0 && i_107_ >= 0 && i_106_ < client.aClass509_11072.method8284((byte) 26) && i_107_ < client.aClass509_11072.method8285(-241524202)))
				Class492.method7994(Class579.anInt7673 * 1551166221, i_106_, i_107_, i_104_, i_108_, i_102_, i_103_, 1096229170);
		} else if (SubIncomingPacket.aClass421_4603 == packet) {
			int i_109_ = stream.readIntV2();
			int i_110_ = stream.readUnsigned128Byte();
			int i_111_ = (i_110_ >> 4 & 0x7) + Class5.anInt53 * -509846287;
			int i_112_ = (i_110_ & 0x7) + Class304.anInt3428 * 1941718227;
			int i_113_ = stream.readUnsigned128Byte();
			int i_114_ = stream.readUnsignedByte();
			int i_115_ = i_114_ >> 2;
			int i_116_ = i_114_ & 0x3;
			int i_117_ = client.anIntArray11006[i_115_];
			if (client.aClass509_11072.method8279(-1705013513) != Class503.aClass503_6875)
				Class271.method5078(1551166221 * Class579.anInt7673, i_111_, i_112_, i_117_, i_115_, i_116_, i_109_, i_113_, 562526483);
		} else if (packet == SubIncomingPacket.aClass421_4594) {
			int i_118_ = stream.readUnsigned128Byte();
			int i_119_ = stream.readUnsignedByte128();
			int i_120_ = (i_119_ >> 4 & 0x7) + -509846287 * Class5.anInt53;
			int i_121_ = (i_119_ & 0x7) + 1941718227 * Class304.anInt3428;
			int i_122_ = stream.readIntV2();
			int i_123_ = stream.readUnsigned128Byte();
			int i_124_ = i_123_ >> 2;
			int i_125_ = client.anIntArray11006[i_124_];
			if (-1736797763 * Class596.aClass596_7841.anInt7844 == i_124_)
				i_124_ = -1736797763 * Class596.aClass596_7823.anInt7844;
			if (1 == (i_118_ & 0x1))
				Class462.method7617(Class579.anInt7673 * 1551166221, i_120_, i_121_, i_125_, i_122_, i_124_, null, -1309358951);
			else {
				int[] is = null;
				if ((i_118_ & 0x2) == 2) {
					int i_126_ = stream.readUnsignedByte();
					is = new int[i_126_];
					for (int i_127_ = 0; i_127_ < i_126_; i_127_++)
						is[i_127_] = stream.readInt();
				}
				short[] is_128_ = null;
				if ((i_118_ & 0x4) == 4) {
					int i_129_ = stream.readUnsignedByte();
					is_128_ = new short[i_129_];
					for (int i_130_ = 0; i_130_ < i_129_; i_130_++)
						is_128_[i_130_] = (short) stream.readUnsignedShort();
				}
				short[] is_131_ = null;
				if (8 == (i_118_ & 0x8)) {
					int i_132_ = stream.readUnsignedByte();
					is_131_ = new short[i_132_];
					for (int i_133_ = 0; i_133_ < i_132_; i_133_++)
						is_131_[i_133_] = (short) stream.readUnsignedShort();
				}
				Class462.method7617(Class579.anInt7673 * 1551166221, i_120_, i_121_, i_125_, i_122_, i_124_, new Class599((-8581293558763477767L * Class527_Sub2.aLong10353), is, is_128_, is_131_), -1343242992);
				Class527_Sub2.aLong10353 += 8559454847757278537L;
			}
		} else if (packet == SubIncomingPacket.aClass421_4597) {
			int i_134_ = stream.readUnsignedByte();
			int i_135_ = (i_134_ >> 4 & 0x7) + -509846287 * Class5.anInt53;
			int i_136_ = (i_134_ & 0x7) + Class304.anInt3428 * 1941718227;
			int i_137_ = stream.readUnsignedShort();
			if (65535 == i_137_)
				i_137_ = -1;
			int i_138_ = stream.readUnsignedByte();
			int i_139_ = i_138_ >> 4 & 0xf;
			int i_140_ = i_138_ & 0x7;
			int i_141_ = stream.readUnsignedByte();
			int i_142_ = stream.readUnsignedByte();
			int i_143_ = stream.readUnsignedShort();
			boolean bool = stream.readUnsignedByte() == 1;
			if (client.aClass509_11072.method8279(-794696225) != Class503.aClass503_6875) {
				if (i_135_ >= 0 && i_136_ >= 0 && i_135_ < client.aClass509_11072.method8284((byte) 112) && (i_136_ < client.aClass509_11072.method8285(-756807140))) {
					int i_144_ = 1 + i_139_;
					if ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) >= i_135_ - i_144_ && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) <= i_135_ + i_144_ && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) >= i_136_ - i_144_ && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) <= i_136_ + i_144_) {
						Class442 class442 = new Class442((float) (i_135_ << 9), 0.0F, (float) (i_136_ << 9));
						int i_145_ = 1551166221 * Class579.anInt7673;
						int i_146_ = (bool ? Class206.aClass206_2222.method3836(-610238100) : Class206.aClass206_2228.method3836(1835848215));
						Class245.aClass226_2698.method4218(Class193.aClass193_2145, i_137_, i_140_, i_142_, i_146_, Class189.aClass189_2124, 0.0F, (float) (i_139_ << 9), class442, i_145_, i_143_, i_141_, -469509171);
					}
				}
			}
		} else {
			Class180.method3542(new StringBuilder().append("").append(packet).toString(), new RuntimeException(), 1604547405);
			Class149.method2493(false, (byte) -29);
		}
	}
}
