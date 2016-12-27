package com.jagex;

import java.io.IOException;

import com.RS3Applet;

public class PacketDecoder {

	static final boolean decodePacket(Class106 class106, int i) throws IOException {
		Class567 class567 = class106.method1413((short) 22334);
		RSBitBuffer stream = class106.byteBuffer;
		if (null == class567)
			return false;
		if (class106.currentPacket == null) {
			if (class106.aBool1263) {
				if (!class567.bitsRemaining(1, -820615647))
					return false;
				class567.method6899((class106.byteBuffer.buffer), 0, 1, -838434603);
				class106.anInt1259 += 1205722163;
				class106.anInt1264 = 0;
				class106.aBool1263 = false;
			}
			stream.off = 0;
			if (stream.method10784(-1248706266)) {
				if (!class567.bitsRemaining(1, -1841555963))
					return false;
				class567.method6899((class106.byteBuffer.buffer), 1, 1, 1955509841);
				class106.anInt1259 += 1205722163;
				class106.anInt1264 = 0;
			}
			class106.aBool1263 = true;
			IncomingPacket[] class422s = Class374.method4778(2069309728);
			int i_0_ = stream.method10778(1371435410);
			if (i_0_ < 0 || i_0_ >= class422s.length)
				throw new IOException(new StringBuilder().append(i_0_).append(" ").append(-810172525 * stream.off).toString());
			class106.currentPacket = class422s[i_0_];
			class106.anInt1262 = -1623192949 * class106.currentPacket.anInt4750;
		}
		if (-1 == 610303591 * class106.anInt1262) {
			if (!class567.bitsRemaining(1, -1216243629))
				return false;
			class567.method6899(stream.buffer, 0, 1, 1154994607);
			class106.anInt1262 = (stream.buffer[0] & 0xff) * 925220183;
			class106.anInt1259 += 1205722163;
			class106.anInt1264 = 0;
		}
		if (610303591 * class106.anInt1262 == -2) {
			if (!class567.bitsRemaining(2, -943952845))
				return false;
			class567.method6899(stream.buffer, 0, 2, -877017357);
			stream.off = 0;
			class106.anInt1262 = stream.readUnsignedShort() * 925220183;
			class106.anInt1259 += -1883522970;
			class106.anInt1264 = 0;
		}
		if (610303591 * class106.anInt1262 > 0) {
			if (!class567.bitsRemaining(class106.anInt1262 * 610303591, -236946734))
				return false;
			stream.off = 0;
			class567.method6899(stream.buffer, 0, 610303591 * class106.anInt1262, -1235057777);
			class106.anInt1259 += -607866235 * class106.anInt1262;
			class106.anInt1264 = 0;
		}
		class106.aClass422_1274 = class106.aClass422_1271;
		class106.aClass422_1271 = class106.aClass422_1270;
		class106.aClass422_1270 = class106.currentPacket;
		
		if (!RS3Applet.IDENTIFIED.contains(class106.currentPacket)) {
			System.out.println("UNIDENTIFIED PACKET: " + (-798865899 * class106.currentPacket.id) + ", " + class106.currentPacket.realLength);
		}
		
		if (IncomingPacket.aClass422_4696 == class106.currentPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			if (bool)
				Class609.method7265(2, -1557386429);
			else
				Class609.method7265(1, -573211891);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4715) {
			if (!client.aBool11172) {
				try {
					int i_1_ = stream.readUnsignedByte();
					int i_2_ = stream.readUnsignedByte128();
					int i_3_ = stream.readUnsignedByte();
					client.aClass231_11088.method3301(i_2_, (byte) 109).method3165(i_1_, i_3_, (byte) 101);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) 11);
					Class515.method6325(class106, 199043816);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_LOOK == class106.currentPacket) {
			byte isMale = stream.readByte();
			Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.decodePlayerLook(stream, isMale);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4595 == class106.currentPacket) {
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.NPC_UPDATE) {
			Class98_Sub1.method8391((-1224030829 * client.aClass515_11066.anInt7035), (byte) -53);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_UPDATE == class106.currentPacket) {
			Class153_Sub2.decodePlayerUpdate(stream, 610303591 * class106.anInt1262, (byte) 117);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4749 == class106.currentPacket) {
			int i_5_ = stream.readLEInt();
			int i_6_ = i_5_ >> 28 & 0x3;
			int i_7_ = i_5_ >> 14 & 0x3fff;
			int i_8_ = i_5_ & 0x3fff;
			int i_9_ = stream.readUnsigned128Byte();
			int i_10_ = stream.readIntV2();
			int i_11_ = stream.readUnsignedByte();
			int i_12_ = i_11_ >> 2;
			int i_13_ = i_11_ & 0x3;
			int i_14_ = client.anIntArray11315[i_12_];
			Class598 class598 = client.aClass515_11066.method6255(-2019675902);
			i_7_ -= 1858049507 * class598.anInt7839;
			i_8_ -= class598.anInt7840 * 1479112045;
			Class400.method4919(i_6_, i_7_, i_8_, i_14_, i_12_, i_13_, i_10_, i_9_, -749500889);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4655) {
			String string = stream.readString();
			long l = (long) stream.readUnsignedShort();
			long l_15_ = (long) stream.read24BitUnsignedInteger(1584315645);
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(-1461571648), stream.readUnsignedByte(), 1858049507));
			boolean bool = stream.readUnsignedByte() == 1;
			long l_16_ = l_15_ + (l << 32);
			boolean bool_17_ = false;
			while_67_: do {
				if (Class63.aClass226_717 == null)
					bool_17_ = true;
				else {
					for (int i_18_ = 0; i_18_ < 100; i_18_++) {
						if (client.aLongArray11235[i_18_] == l_16_) {
							bool_17_ = true;
							break while_67_;
						}
					}
					if (class402.aBool4203) {
						if (client.aBool11078 && !client.aBool11163 || client.aBool11166)
							bool_17_ = true;
						else if (Class350.method4638(string, (short) -2409))
							bool_17_ = true;
					}
				}
			} while (false);
			if (!bool_17_) {
				client.aLongArray11235[632873891 * client.anInt11072] = l_16_;
				client.anInt11072 = 308045835 * ((632873891 * client.anInt11072 + 1) % 100);
				String string_19_ = (Class166.method1997(Class323.method4257(stream, (byte) 79), (byte) 98));
				int i_20_ = bool ? 22 : 24;
				if (1719069535 * class402.anInt4201 != -1)
					Class536_Sub18_Sub2.method10491(i_20_, 0, new StringBuilder().append(Class635.method7563((class402.anInt4201 * 1719069535), (byte) -31)).append(string).toString(), new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) 21)).append(string).toString(), string, string_19_, Class63.aClass226_717.method3255(-789593300), -1, class402, -294633906);
				else
					Class536_Sub18_Sub2.method10491(i_20_, 0, string, string, string, string_19_, Class63.aClass226_717.method3255(-1686296505), -1, class402, 189021822);
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4730) {
			int i_21_ = stream.readUnsignedShortLE();
			int i_22_ = stream.readIntV1();
			int i_23_ = stream.readIntV1();
			Class307.method4133();
			Class206.method2961(i_23_, 3, i_21_, i_22_, 1736035179);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4748) {
			int i_24_ = stream.readIntV2();
			int i_25_ = stream.readUnsignedShortLE();
			int i_26_ = stream.readUnsignedShort();
			int i_27_ = stream.readUnsignedByte128();
			Class307.method4133();
			Class609.method7266(i_24_, i_27_, i_26_, i_25_, -426884131);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4685) {
			int i_28_ = stream.readUnsignedByte();
			i_28_ = -i_28_ - 2;
			byte i_29_ = stream.readByte();
			Player class649_sub1_sub5_sub1_sub2 = ((Player) client.aMap11157.get(Integer.valueOf(i_28_)));
			if (null == class649_sub1_sub5_sub1_sub2) {
				class649_sub1_sub5_sub1_sub2 = new Player(null);
				class649_sub1_sub5_sub1_sub2.anInt11889 = i_28_ * 675537735;
				client.aMap11157.put(Integer.valueOf(i_28_), class649_sub1_sub5_sub1_sub2);
			}
			class649_sub1_sub5_sub1_sub2.decodePlayerLook(stream, i_29_);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4773 == class106.currentPacket) {
			int i_30_ = stream.readInt();
			Class374.aClass33_3907 = new Class33(i_30_);
			Thread thread = new Thread(Class374.aClass33_3907);
			thread.setPriority(1);
			thread.start();
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4636) {
			String string = stream.readString();
			Class512.method6211(string, false, false, (byte) 27);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4661) {
			Class302.sceneX = (stream.readByte128() << 3) * 1163453749;
			Class512.scenePlane = stream.readUnsignedByteC() * -200495015;
			Class618.sceneY = (stream.readByte() << 3) * 1712069097;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4622) {
			int i_31_ = stream.readUnsignedByte128();
			int i_32_ = stream.readUnsignedShort128();
			if (i_32_ == 65535)
				i_32_ = -1;
			Class184_Sub2.aClass211_9442.method3014(i_32_, i_31_, -504828815);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4709) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.aClass409_4309, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4703) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.aClass409_4307, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4736 == class106.currentPacket) {
			int i_33_ = stream.readUnsignedByte128();
			if (i_33_ == 255)
				i_33_ = -1;
			int i_34_ = stream.readUnsignedShortLE();
			int i_35_ = stream.readUnsignedShortLE();
			int i_36_ = stream.readUnsignedByteC();
			int i_37_ = stream.readUnsignedShortLE128();
			int i_38_ = stream.readUnsignedShort();
			int i_39_ = stream.readUnsignedShortLE();
			int i_40_ = stream.readByteC();
			int i_41_ = stream.readUnsigned128Byte() * 4;
			int i_42_ = stream.readShortLE((byte) -36);
			int i_43_ = stream.read128Byte();
			int i_44_ = stream.readUnsignedShort();
			int i_45_ = stream.readUnsignedByte128();
			int i_46_ = stream.readShortLE((byte) 2);
			boolean bool = 0 != (i_36_ & 0x1);
			boolean bool_47_ = 0 != (i_36_ & 0x2);
			int i_48_ = bool_47_ ? i_36_ >> 2 : -1;
			if (bool_47_)
				i_45_ = (byte) i_45_;
			else
				i_45_ *= 4;
			Class598 class598 = client.aClass515_11066.method6255(-1178328555);
			int i_49_ = i_35_ - -578868282 * class598.anInt7839;
			int i_50_ = i_37_ - -1336743206 * class598.anInt7840;
			i_40_ += i_49_;
			i_43_ += i_50_;
			if (i_49_ >= 0 && i_50_ >= 0 && i_49_ < client.aClass515_11066.method6321((byte) -60) * 2 && i_50_ < client.aClass515_11066.method6321((byte) 33) * 2 && i_40_ >= 0 && i_43_ >= 0 && i_40_ < client.aClass515_11066.method6243(177401017) * 2 && i_43_ < client.aClass515_11066.method6243(177401017) * 2 && 65535 != i_34_) {
				i_49_ *= 256;
				i_50_ *= 256;
				i_40_ *= 256;
				i_43_ *= 256;
				i_45_ <<= 2;
				i_41_ <<= 2;
				i_39_ <<= 2;
				Class677.method8053(i_34_, i_46_, i_42_, i_48_, i_45_, i_41_, i_49_, i_50_, i_40_, i_43_, i_38_, i_44_, i_33_, i_39_, bool, 0, (byte) -91);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4651 == class106.currentPacket) {
			if (Class233.method3334(client.anInt11101 * -708374433, (byte) -76))
				client.anInt11065 = (int) ((float) stream.readUnsignedShort() * 2.5F) * 1895634101;
			else
				client.anInt11065 = (stream.readUnsignedShort() * 1034448182);
			client.anInt11030 = client.anInt11215 * -1021888685;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4672) {
			Class465_Sub1.aClass96_10352.aClass610_1164.method7271(-1056104537);
			client.anInt11219 += -1226769344;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ICOMPONENT_MODEL == class106.currentPacket) {
			int i_51_ = stream.readInt();
			int i_52_ = stream.readLEInt();
			int interfaceId = i_51_ >> 16;
			int componentId = i_51_ & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendIComponentModel(" + interfaceId + ", " + componentId + ", " + i_52_ + ");");
			Class307.method4133();
			Class206.method2961(i_51_, 1, i_52_, -1, -1187242940);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4643) {
			client.anInt11268 = client.anInt11215 * -316283343;
			Class213 class213 = new Class213(stream, client.anInterface28_11049);
			class213.method3070(Class63.aClass226_717, 127578918);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4739) {
			if (!client.aBool11172) {
				try {
					int i_53_ = stream.readUnsigned128Byte();
					int i_54_ = stream.readUnsignedByteC();
					int i_55_ = stream.readUnsignedByteC();
					client.aClass231_11088.method3301(i_54_, (byte) 96).method3171(i_53_, i_55_, 1375161968);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) 12);
					Class515.method6325(class106, -504006187);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CLIENT_EDIT_CHECK == class106.currentPacket) {
			Class158.method1889(stream, 610303591 * class106.anInt1262, (short) 16548);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4676 == class106.currentPacket) {
			int i_56_ = stream.readInt();
			int i_57_ = stream.readUnsignedShortLE128();
			int windowId = i_56_ >> 16;
			int windowComponentId = i_56_ & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("Packet 85: " + windowId + ", " + windowComponentId + ", " + i_57_);
			Class307.method4133();
			Class458_Sub1.method9335(i_56_, i_57_, (byte) 41);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.SKILLS) {
			int level = stream.readUnsignedByteC();
			int experience = stream.readIntV1();
			int skillId = stream.readUnsignedByte128();
			Class611.aClass602_7930.method7174(skillId, (byte) 97);
			Class465_Sub1.aClass96_10352.aClass618Array1167[skillId].method7380(experience, (byte) 18);
			Class465_Sub1.aClass96_10352.aClass618Array1167[skillId].method7376(level, -1394810797);
			client.anIntArray11222[(client.anInt11056 += -1560395987) * -323786587 - 1 & 0x3f] = skillId;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4755 == class106.currentPacket) {
			int i_61_ = stream.readUnsignedByte();
			i_61_ = -i_61_ - 2;
			client.aMap11157.remove(Integer.valueOf(i_61_));
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4718 == class106.currentPacket) {
			int i_62_ = stream.readUnsignedShortLE128();
			int i_63_ = stream.readInt();
			if (RS3Applet.DUMP) {
				System.out.println("player.getPackets().setVarbit(" + i_62_ + ", " + i_63_ + ");");
			}
			Class465_Sub1.aClass96_10352.aClass610_1164.method7270((Class324) Class56.aClass34_Sub14_608.method70(i_62_, (byte) -70), i_63_, (byte) -30);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.RUN_ENERGY == class106.currentPacket) {
			client.anInt11216 = stream.readUnsignedByte() * 2077961771;
			client.anInt11030 = client.anInt11215 * -1021888685;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4638) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString();
			String string_64_ = string;
			if (bool)
				string_64_ = stream.readString();
			long l = (long) stream.readUnsignedShort();
			long l_65_ = (long) stream.read24BitUnsignedInteger(1417052576);
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(992299809), stream.readUnsignedByte(), 1858049507));
			int i_66_ = stream.readUnsignedShort();
			long l_67_ = l_65_ + (l << 32);
			boolean bool_68_ = false;
			while_68_: do {
				for (int i_69_ = 0; i_69_ < 100; i_69_++) {
					if (client.aLongArray11235[i_69_] == l_67_) {
						bool_68_ = true;
						break while_68_;
					}
				}
				if (class402.aBool4203 && Class350.method4638(string_64_, (short) -15828))
					bool_68_ = true;
			} while (false);
			if (!bool_68_) {
				client.aLongArray11235[632873891 * client.anInt11072] = l_67_;
				client.anInt11072 = 308045835 * ((1 + client.anInt11072 * 632873891) % 100);
				String string_70_ = Class198.aClass32_2216.method788(i_66_, (byte) -36).method10712(stream, (byte) -63);
				if (1719069535 * class402.anInt4201 != -1)
					Class536_Sub18_Sub2.method10491(18, 0, new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) -12)).append(string).toString(), new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) 62)).append(string_64_).toString(), string, string_70_, null, i_66_, class402, -1589880173);
				else
					Class536_Sub18_Sub2.method10491(18, 0, string, string_64_, string, string_70_, null, i_66_, class402, 2114173034);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4772 == class106.currentPacket) {
			if (!client.aBool11172) {
				try {
					int i_71_ = stream.readIntV2();
					byte i_72_ = stream.readByte128();
					client.aClass231_11088.method3312(new Class223(i_71_), i_72_, (byte) 45);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) 5);
					Class515.method6325(class106, -970987539);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4626 == class106.currentPacket) {
			int i_73_ = stream.readUnsignedShort();
			int i_74_ = stream.readUnsignedShort();
			Class184_Sub2.aClass211_9442.method3025(i_73_, i_74_, -54413679);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4757 == class106.currentPacket) {
			Class605.method7209(stream.readString(), -495480453);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.INTERFACE_SETTINGS) {
			int interfaceHash = stream.readInt();
			int fromSlot = stream.readUnsignedShortLE();
			if (65535 == fromSlot)
				fromSlot = -1;
			int value = stream.readIntV1();
			int toSlot = stream.readUnsignedShort128();
			if (65535 == toSlot)
				toSlot = -1;
			Class307.method4133();
			int interfaceId = interfaceHash >> 16;
			int componentId = interfaceHash & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendIComponentSettings("+interfaceId+", "+componentId+", "+fromSlot+", "+toSlot+", "+value+");");
			for (int i_79_ = fromSlot; i_79_ <= toSlot; i_79_++) {
				long l = ((long) interfaceHash << 32) + (long) i_79_;
				Class536_Sub14 class536_sub14 = (Class536_Sub14) client.aClass4_11243.method556(l);
				Class536_Sub14 class536_sub14_80_;
				if (class536_sub14 == null) {
					if (i_79_ == -1)
						class536_sub14_80_ = new Class536_Sub14(value, (Class264.method3678(interfaceHash, -689214737).aClass536_Sub14_2575.anInt10478) * 501091713);
					else
						class536_sub14_80_ = new Class536_Sub14(value, -1);
				} else {
					class536_sub14_80_ = new Class536_Sub14(value, (class536_sub14.anInt10478 * 501091713));
					class536_sub14.method6484(524356204);
				}
				client.aClass4_11243.method560(class536_sub14_80_, l);
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4637) {
			if (!client.aBool11172) {
				try {
					int i_81_ = stream.readUnsignedByteC();
					client.aClass231_11088.method3304(i_81_, (byte) 1);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) 48);
					Class515.method6325(class106, -667029430);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.CLOSE_INTERFACE) {
			int i_82_ = stream.readLEInt();
			int windowId = i_82_ >> 16;
			int windowComponentId = i_82_ & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().closeInterface("+windowId+", "+windowComponentId+");");
			Class307.method4133();
			Class536_Sub36 class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method556((long) i_82_));
			if (class536_sub36 != null)
				Class398.method4903(class536_sub36, true, false, 1759806773);
			if (client.aClass251_11057 != null) {
				Class668.method8011(client.aClass251_11057, 263642117);
				client.aClass251_11057 = null;
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4646 == class106.currentPacket) {
			if (Class707.aBool8822 && null != Class223.aFrame2336)
				Class15.method640(Class710.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(-1278523423), -1, -1, false, -1298793998);
			byte[] is = new byte[610303591 * class106.anInt1262];
			stream.method10776(is, 0, 610303591 * class106.anInt1262, -399442820);
			String string = Class202.method2925(is, 0, class106.anInt1262 * 610303591, -1694498816);
			Class380.method4809(string, true, client.aBool11228, 839758455);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4597 == class106.currentPacket) {
			if (!client.aBool11172) {
				try {
					int i_83_ = stream.readUnsigned128Byte();
					int i_84_ = stream.readUnsignedByteC();
					client.aClass231_11088.method3301(i_83_, (byte) 112).method3196(i_84_, -1142076290);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) 6);
					Class515.method6325(class106, -701959026);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4618 == class106.currentPacket) {
			int i_85_ = stream.readUnsigned128Byte();
			int i_86_ = stream.readUnsigned128Byte();
			int i_87_ = stream.readUnsignedShortLE128();
			int i_88_ = stream.readUnsignedByteC();
			int i_89_ = stream.readUnsignedByte();
			Class307.method4133();
			client.aBoolArray11270[i_89_] = true;
			client.anIntArray11006[i_89_] = i_85_;
			client.anIntArray11272[i_89_] = i_86_;
			client.anIntArray11273[i_89_] = i_88_;
			client.anIntArray11302[i_89_] = i_87_;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.PING) {
			class106.currentPacket = null;
			return false;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4608) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString();
			String string_90_ = string;
			if (bool)
				string_90_ = stream.readString();
			String string_91_ = stream.readString();
			long l = (long) stream.readUnsignedShort();
			long l_92_ = (long) stream.read24BitUnsignedInteger(1868228596);
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(-969837515), stream.readUnsignedByte(), 1858049507));
			int i_93_ = stream.readUnsignedShort();
			long l_94_ = l_92_ + (l << 32);
			boolean bool_95_ = false;
			while_69_: do {
				for (int i_96_ = 0; i_96_ < 100; i_96_++) {
					if (l_94_ == client.aLongArray11235[i_96_]) {
						bool_95_ = true;
						break while_69_;
					}
				}
				if (class402.aBool4203 && Class350.method4638(string_90_, (short) -8743))
					bool_95_ = true;
			} while (false);
			if (!bool_95_) {
				client.aLongArray11235[632873891 * client.anInt11072] = l_94_;
				client.anInt11072 = (632873891 * client.anInt11072 + 1) % 100 * 308045835;
				String string_97_ = Class198.aClass32_2216.method788(i_93_, (byte) 65).method10712(stream, (byte) -71);
				if (-1 != 1719069535 * class402.anInt4201)
					Class536_Sub18_Sub2.method10491(20, 0, new StringBuilder().append(Class635.method7563((class402.anInt4201 * 1719069535), (byte) 22)).append(string).toString(), new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) -44)).append(string_90_).toString(), string, string_97_, string_91_, i_93_, class402, 1822190768);
				else
					Class536_Sub18_Sub2.method10491(20, 0, string, string_90_, string, string_97_, string_91_, i_93_, class402, -135110921);
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.ADD_GROUND_ITEM) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.ADD_GROUND_ITEM, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4692 == class106.currentPacket) {
			int i_98_ = stream.readUnsignedShort();
			int i_99_ = stream.readUnsignedShort();
			int i_100_ = stream.readUnsignedShort();
			Class307.method4133();
			if (Class463.aClass234Array5227[i_98_] != null) {
				for (int i_101_ = i_99_; i_101_ < i_100_; i_101_++) {
					int i_102_ = stream.read24BitUnsignedInteger(1254797117);
					if (i_101_ < (Class463.aClass234Array5227[i_98_].aClass251Array2378).length && (Class463.aClass234Array5227[i_98_].aClass251Array2378[i_101_]) != null)
						Class463.aClass234Array5227[i_98_].aClass251Array2378[i_101_].anInt2558 = 2115749181 * i_102_;
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4765) {
			int i_103_ = stream.readInt();
			int i_104_ = stream.readIntV1();
			int interfaceId = i_104_ >> 16;
			int componentId = i_104_ & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendInterfaceRelatedPacket15(" + interfaceId + ", " + componentId + ", " + i_103_ + ");");
			Class307.method4133();
			Class523.method6406(i_104_, i_103_, 1706383974);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.SOUND_EFFECT) {
			int i_105_ = stream.readUnsignedShort();
			if (65535 == i_105_)
				i_105_ = -1;
			int i_106_ = stream.readUnsignedByte();
			int i_107_ = stream.readUnsignedShort();
			int i_108_ = stream.readUnsignedByte();
			int i_109_ = stream.readUnsignedShort();
			Class184_Sub2.aClass211_9442.method3030(Class198.aClass198_2212, i_105_, i_106_, i_108_, Class188.aClass188_2133.method2788(-1628358619), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, i_109_, i_107_, (byte) 80);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4677) {
			client.anInt11158 = stream.readShort((byte) -12) * 574619547;
			client.anInt11030 = client.anInt11215 * -1021888685;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4763) {
			int i_110_ = stream.readUnsignedShort();
			Class184_Sub2.aClass211_9442.method2992(i_110_, 1164011507);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4697 == class106.currentPacket) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.aClass409_4318, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4666) {
			int i_111_ = stream.readUnsignedShort();
			Class69.method1090(i_111_, -2130094380);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CS_VAR_STRING_2 == class106.currentPacket) {
			int i_112_ = stream.readUnsignedShortLE128();
			String string = stream.readString();
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendCSVarString("+i_112_+", "+string+");");
			Class307.method4133();
			Class310.method4178(i_112_, string, 728541324);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4658 == class106.currentPacket) {
			if (Class535.aClass147_7131 == null)
				Class535.aClass147_7131 = new Class147(Class536_Sub19.aClass98_Sub1_Sub2_10519);
			Class430 class430 = Class536_Sub19.aClass98_Sub1_Sub2_10519.method8388(stream, -246227589);
			Class535.aClass147_7131.anInterface3_1696.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) 9);
			client.anIntArray11139[(client.anInt11229 += 2144201) * 1597313657 - 1 & 0x3f] = class430.anInt4820 * 706703961;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4653) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.aClass409_4321, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4769 == class106.currentPacket) {
			client.anInt11226 = client.anInt11215 * -49549167;
			boolean bool = stream.readUnsignedByte() == 1;
			if (610303591 * class106.anInt1262 == 1) {
				if (bool)
					Class256.aClass350_2762 = null;
				else
					Class50.aClass350_585 = null;
				class106.currentPacket = null;
				return true;
			}
			if (bool)
				Class256.aClass350_2762 = new Class350(stream);
			else
				Class50.aClass350_585 = new Class350(stream);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4650 == class106.currentPacket) {
			int i_113_ = stream.readUnsignedShort();
			client.anInt11076 = 446199109;
			client.anInt11052 = -2044763365 * i_113_;
			client.anInt11074 = 0;
			Class98_Sub1_Sub1.aClass461_11326.method5580(client.anInt11052 * -749191405, -964514165);
			Class51.method930(-1398418648);
			Class452.method5434(844579260);
			int i_114_ = stream.readUnsignedShort();
			client.anInt11114 = i_114_ * 272454491;
			int i_115_ = stream.readUnsignedByte();
			Class392_Sub1.aClass536_Sub33_10107 = new RSByteBuffer(i_115_);
			Class392_Sub1.aClass536_Sub33_10107.writeBytes(stream.buffer, -810172525 * stream.off, i_115_, (byte) 29);
			stream.off += 516175515 * i_115_;
			class106.currentPacket = null;
			return false;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4752) {
			int i_116_ = stream.readUnsignedShortLE128();
			int i_117_ = stream.readUnsignedByte128();
			int i_118_ = stream.readLEInt();
			int i_119_ = stream.readUnsignedByte128();
			int i_120_ = stream.readUnsignedShort();
			int i_121_ = stream.readUnsignedShortLE();
			if (65535 == i_121_)
				i_121_ = -1;
			int i_122_ = i_119_ & 0x7;
			int i_123_ = i_119_ >> 3 & 0xf;
			if (i_123_ == 15)
				i_123_ = -1;
			boolean bool = (i_119_ >> 7 & 0x1) == 1;
			if (0 != i_118_ >> 30) {
				Class598 class598 = client.aClass515_11066.method6255(-2144272068);
				int i_124_ = i_118_ >> 28 & 0x3;
				int i_125_ = ((i_118_ >> 14 & 0x3fff) - 1858049507 * class598.anInt7839);
				int i_126_ = (i_118_ & 0x3fff) - class598.anInt7840 * 1479112045;
				if (i_125_ >= 0 && i_126_ >= 0 && i_125_ < client.aClass515_11066.method6321((byte) 0) && i_126_ < client.aClass515_11066.method6243(177401017)) {
					if (-1 == i_121_) {
						Class536_Sub18_Sub4 class536_sub18_sub4 = ((Class536_Sub18_Sub4) client.aClass4_11175.method556((long) (i_125_ << 16 | i_126_)));
						if (null != class536_sub18_sub4) {
							class536_sub18_sub4.aClass649_Sub1_Sub5_Sub4_11619.method11026(-159343355);
							class536_sub18_sub4.method6484(-1057336631);
						}
					} else {
						int i_127_ = 512 * i_125_ + 256;
						int i_128_ = 512 * i_126_ + 256;
						int i_129_ = i_124_;
						if (i_129_ < 3 && client.aClass515_11066.method6251(-836992088).method5466(i_125_, i_126_, (byte) -16))
							i_129_++;
						Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = (new Class649_Sub1_Sub5_Sub4(client.aClass515_11066.method6249(-2107612623), i_121_, i_120_, i_124_, i_129_, i_127_, Class54.method944(i_127_, i_128_, i_124_, 1648657667) - i_116_, i_128_, i_125_, i_125_, i_126_, i_126_, i_122_, bool, 0));
						client.aClass4_11175.method560(new Class536_Sub18_Sub4(class649_sub1_sub5_sub4), (long) (i_125_ << 16 | i_126_));
					}
				}
			} else if (0 != i_118_ >> 29) {
				int i_130_ = i_118_ & 0xffff;
				Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i_130_));
				if (null != class536_sub13) {
					NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.anObject10468);
					Class500 class500 = (class649_sub1_sub5_sub1_sub1.aClass500Array11901[i_117_]);
					if (65535 == i_121_)
						i_121_ = -1;
					boolean bool_131_ = true;
					int i_132_ = class500.anInt6839 * -1262960011;
					if (-1 != i_121_ && -1 != i_132_) {
						if (i_121_ == i_132_) {
							Class677 class677 = (Class677) Class633.aClass34_Sub15_8260.method70(i_121_, (byte) 42);
							if (class677.aBool8604 && -1 != class677.anInt8607 * -1078340929) {
								Class191 class191 = ((Class191) (Class45.aClass34_Sub11_529.method70(class677.anInt8607 * -1078340929, (byte) -68)));
								int i_133_ = class191.anInt2169 * -15611351;
								if (i_133_ == 0 || 2 == i_133_)
									bool_131_ = false;
								else if (i_133_ == 1)
									bool_131_ = true;
							}
						} else {
							Class677 class677 = (Class677) Class633.aClass34_Sub15_8260.method70(i_121_, (byte) 60);
							Class677 class677_134_ = (Class677) Class633.aClass34_Sub15_8260.method70(i_132_, (byte) 22);
							if (-1 != -1078340929 * class677.anInt8607 && (class677_134_.anInt8607 * -1078340929 != -1)) {
								Class191 class191 = ((Class191) (Class45.aClass34_Sub11_529.method70(-1078340929 * class677.anInt8607, (byte) 30)));
								Class191 class191_135_ = ((Class191) (Class45.aClass34_Sub11_529.method70(-1078340929 * class677_134_.anInt8607, (byte) 82)));
								if (class191.anInt2163 * -430743627 < class191_135_.anInt2163 * -430743627)
									bool_131_ = false;
							}
						}
					}
					if (bool_131_) {
						class500.anInt6839 = 1673100765 * i_121_;
						class500.anInt6842 = i_116_ * -1033084159;
						class500.anInt6838 = i_123_ * 1016781343;
						if (-1 != i_121_) {
							Class677 class677 = (Class677) Class633.aClass34_Sub15_8260.method70(i_121_, (byte) 59);
							int i_136_ = class677.aBool8604 ? 0 : 2;
							if (bool)
								i_136_ = 1;
							class500.aClass688_6843.method8126(-1078340929 * class677.anInt8607, i_120_, i_136_, false, -1186502682);
						} else
							class500.aClass688_6843.method8122(-1, -1005110625);
					}
				}
			} else if (i_118_ >> 28 != 0) {
				int i_137_ = i_118_ & 0xffff;
				Player class649_sub1_sub5_sub1_sub2;
				if (i_137_ == client.anInt11156 * -1791435655)
					class649_sub1_sub5_sub1_sub2 = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
				else
					class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_137_]);
				if (class649_sub1_sub5_sub1_sub2 != null) {
					Class500 class500 = (class649_sub1_sub5_sub1_sub2.aClass500Array11901[i_117_]);
					if (65535 == i_121_)
						i_121_ = -1;
					boolean bool_138_ = true;
					int i_139_ = -1262960011 * class500.anInt6839;
					if (i_121_ != -1 && i_139_ != -1) {
						if (i_121_ == i_139_) {
							Class677 class677 = (Class677) Class633.aClass34_Sub15_8260.method70(i_121_, (byte) 9);
							if (class677.aBool8604 && -1 != class677.anInt8607 * -1078340929) {
								Class191 class191 = ((Class191) (Class45.aClass34_Sub11_529.method70(class677.anInt8607 * -1078340929, (byte) 70)));
								int i_140_ = class191.anInt2169 * -15611351;
								if (i_140_ == 0 || i_140_ == 2)
									bool_138_ = false;
								else if (1 == i_140_)
									bool_138_ = true;
							}
						} else {
							Class677 class677 = (Class677) Class633.aClass34_Sub15_8260.method70(i_121_, (byte) -33);
							Class677 class677_141_ = (Class677) Class633.aClass34_Sub15_8260.method70(i_139_, (byte) -4);
							if (-1 != -1078340929 * class677.anInt8607 && (class677_141_.anInt8607 * -1078340929 != -1)) {
								Class191 class191 = ((Class191) (Class45.aClass34_Sub11_529.method70(class677.anInt8607 * -1078340929, (byte) 1)));
								Class191 class191_142_ = ((Class191) (Class45.aClass34_Sub11_529.method70(class677_141_.anInt8607 * -1078340929, (byte) -30)));
								if (-430743627 * class191.anInt2163 < -430743627 * class191_142_.anInt2163)
									bool_138_ = false;
							}
						}
					}
					if (bool_138_) {
						class500.anInt6839 = i_121_ * 1673100765;
						class500.anInt6842 = i_116_ * -1033084159;
						class500.anInt6838 = 1016781343 * i_123_;
						class500.anInt6840 = -692260355 * i_122_;
						if (-1 != i_121_) {
							Class677 class677 = (Class677) Class633.aClass34_Sub15_8260.method70(i_121_, (byte) -54);
							int i_143_ = class677.aBool8604 ? 0 : 2;
							if (bool)
								i_143_ = 1;
							class500.aClass688_6843.method8126(class677.anInt8607 * -1078340929, i_120_, i_143_, false, -658105404);
						} else
							class500.aClass688_6843.method8122(-1, -1852163574);
					}
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4774) {
			int i_144_ = stream.readUnsignedShortLE128();
			int i_145_ = stream.readUnsignedShortLE();
			Class307.method4133();
			OutgoingPacket.method5027(i_144_, i_145_, 0, (byte) 22);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4725 == class106.currentPacket) {
			int i_146_ = stream.readUnsignedByte();
			int i_147_ = stream.method9756((byte) 81);
			int i_148_ = stream.readUnsignedShortLE();
			int i_149_ = stream.readInt();
			Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i_148_));
			if (null != class536_sub13) {
				NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.anObject10468);
				if (null == class649_sub1_sub5_sub1_sub1.aClass307_12167)
					class649_sub1_sub5_sub1_sub1.aClass307_12167 = new Class307(class649_sub1_sub5_sub1_sub1.aClass296_12174);
				class649_sub1_sub5_sub1_sub1.aClass307_12167.anIntArray3453[i_146_] = i_149_;
				class649_sub1_sub5_sub1_sub1.aClass307_12167.aShortArray3452[i_146_] = (short) i_147_;
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.HIDE_ICOMPONENT == class106.currentPacket) {
			int i_150_ = stream.readLEInt();
			int i_151_ = stream.readUnsignedByte128();
			int interfaceId = i_150_ >> 16;
			int componentId = i_150_ & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendHideIComponent("+interfaceId+", "+componentId+", "+(i_151_ == 1)+");");
			Class307.method4133();
			Class89.method1228(i_150_, i_151_, 65535);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4728) {
			int i_152_ = stream.readUnsignedByte();
			int i_153_ = stream.readUnsignedShortLE128();
			boolean bool = 1 == (i_152_ & 0x1);
			Class401.method4921(i_153_, bool, (byte) 1);
			client.anIntArray11220[(client.anInt11221 += 705495793) * -111956463 - 1 & 0x3f] = i_153_;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4742) {
			int i_154_ = stream.readInt();
			boolean bool = stream.readUnsignedByteC() == 1;
			Class307.method4133();
			Class176.method2455(i_154_, bool, -1287959245);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4663) {
			int i_155_ = stream.readInt();
			Class307.method4133();
			if (i_155_ == -1) {
				Class658.anInt8498 = -662013517;
				Class667.anInt8535 = 1594603721;
			} else {
				Class598 class598 = client.aClass515_11066.method6255(-1768115048);
				int i_156_ = i_155_ >> 14 & 0x3fff;
				int i_157_ = i_155_ & 0x3fff;
				i_156_ -= class598.anInt7839 * 1858049507;
				if (i_156_ < 0)
					i_156_ = 0;
				else if (i_156_ >= client.aClass515_11066.method6321((byte) -50))
					i_156_ = client.aClass515_11066.method6321((byte) -8);
				i_157_ -= class598.anInt7840 * 1479112045;
				if (i_157_ < 0)
					i_157_ = 0;
				else if (i_157_ >= client.aClass515_11066.method6243(177401017))
					i_157_ = client.aClass515_11066.method6243(177401017);
				Class658.anInt8498 = 662013517 * (256 + (i_156_ << 9));
				Class667.anInt8535 = -1594603721 * (256 + (i_157_ << 9));
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4713 == class106.currentPacket) {
			Class184_Sub2.aClass211_9442.method2998(stream.readUnsignedShort(), 2105921254);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4732 == class106.currentPacket) {
			int i_158_ = stream.readUnsigned128Byte();
			int i_159_ = stream.readUnsigned128Byte();
			int i_160_ = stream.readInt();
			int i_161_ = stream.readIntV1();
			int i_162_ = stream.readUnsignedByteC();
			int i_163_ = i_161_ >> 28;
			int i_164_ = i_161_ >> 14 & 0x3fff;
			int i_165_ = i_161_ & 0x3fff;
			Class184_Sub2.aClass211_9442.method3011(i_160_, i_158_, true, i_163_, i_164_ << 9, i_165_ << 9, i_159_ << 9, i_162_ << 9, 1767850884);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PING_2 == class106.currentPacket) {
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4756) {
			int i_166_ = stream.readIntV1();
			int i_167_ = stream.readShort((byte) -93);
			int i_168_ = stream.method9756((byte) 43);
			Class307.method4133();
			Class297.method4008(i_166_, i_167_, i_168_, (short) 28391);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4614) {
			client.anInt11232 = client.anInt11215 * -2101414481;
			if (0 == 610303591 * class106.anInt1262) {
				client.aString11137 = null;
				client.aString11265 = null;
				Class269.anInt2880 = 0;
				Class360_Sub1.aClass94Array10168 = null;
				class106.currentPacket = null;
				return true;
			}
			client.aString11265 = stream.readString();
			boolean bool = stream.readUnsignedByte() == 1;
			if (bool)
				stream.readString();
			client.aString11137 = stream.readString();
			Class205_Sub14.aByte9920 = stream.readByte();
			int i_169_ = stream.readUnsignedByte();
			if (255 == i_169_) {
				class106.currentPacket = null;
				return true;
			}
			Class269.anInt2880 = i_169_ * 1093210431;
			Class94[] class94s = new Class94[100];
			for (int i_170_ = 0; i_170_ < Class269.anInt2880 * -918987073; i_170_++) {
				class94s[i_170_] = new Class94();
				class94s[i_170_].aString1143 = stream.readString();
				bool = stream.readUnsignedByte() == 1;
				if (bool)
					class94s[i_170_].aString1146 = stream.readString();
				else
					class94s[i_170_].aString1146 = class94s[i_170_].aString1143;
				class94s[i_170_].aString1144 = Class473.method5740(class94s[i_170_].aString1146, Class302.aClass74_3406, (byte) -19);
				class94s[i_170_].anInt1145 = (stream.readUnsignedShort() * 1991460897);
				class94s[i_170_].aByte1147 = stream.readByte();
				class94s[i_170_].aString1142 = stream.readString();
				if (class94s[i_170_].aString1146.equals(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.username))
					Class446.aByte4903 = class94s[i_170_].aByte1147;
			}
			boolean bool_171_ = false;
			int i_172_ = -918987073 * Class269.anInt2880;
			do {
				if (i_172_ <= 0)
					break;
				bool_171_ = true;
				i_172_--;
				for (int i_173_ = 0; i_173_ < i_172_; i_173_++) {
					if (class94s[i_173_].aString1144.compareTo(class94s[i_173_ + 1].aString1144) > 0) {
						Class94 class94 = class94s[i_173_];
						class94s[i_173_] = class94s[i_173_ + 1];
						class94s[1 + i_173_] = class94;
						bool_171_ = false;
					}
				}
			} while (!bool_171_);
			Class360_Sub1.aClass94Array10168 = class94s;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4691) {
			Class184_Sub2.aClass211_9442.method3060(Class188.aClass188_2129.method2788(-713318053), 900823373);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4727) {
			int i_174_ = stream.readUnsignedShort();
			String string = stream.readString();
			int i_175_ = stream.readUnsignedShort();
			int i_176_ = stream.readUnsignedShort();
			boolean bool = stream.readUnsignedByte() == 1;
			Class195.aClass5_2200 = Class23.aClass5_221;
			Class710_Sub1.aBool10815 = bool;
			Class554.method6786(i_174_, string, i_175_, i_176_, -1845349719);
			Object object = null;
			Class673.method8026(19, -1798113843);
			class106.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4684 == class106.currentPacket) {
			Class689.aString8692 = (class106.anInt1262 * 610303591 > 2 ? stream.readString() : Class38.aClass38_310.method840(Class459.aClass664_5178, 1640018385));
			client.anInt11035 = (610303591 * class106.anInt1262 > 0 ? stream.readUnsignedShort() : -1) * -1003121495;
			if (client.anInt11035 * -1869983847 == 65535)
				client.anInt11035 = 1003121495;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.CHUNK_SCENE) {
			Class512.scenePlane = stream.readUnsigned128Byte() * -200495015;
			Class618.sceneY = (stream.readByteC() << 3) * 1712069097;
			Class302.sceneX = (stream.read128Byte() << 3) * 1163453749;
			while (-810172525 * stream.off < 610303591 * class106.anInt1262) {
				ChunkSceneSubPackets class409 = (Class200.method2916()[stream.readUnsignedByte()]);
				PacketDecoder.decodeChunkSceneSubPacket(class409, (byte) 2);
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.WORLD_LIST) {
			boolean bool = stream.readUnsignedByte() == 1;
			byte[] is = new byte[610303591 * class106.anInt1262 - 1];
			stream.method9716(is, 0, 610303591 * class106.anInt1262 - 1, 745475045);
			Class380.method4808(bool, is, (byte) 110);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4640) {
			String string = stream.readString();
			String string_177_ = Class166.method1997(Class323.method4257(stream, (byte) 65), (byte) 53);
			Class635.method7564(6, 0, string, string, string, string_177_, null, -1538266173);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4694 == class106.currentPacket) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.REMOVE_GAME_OBJECT, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4644 == class106.currentPacket) {
			int i_178_ = stream.readUnsignedShort();
			if (i_178_ == 65535)
				i_178_ = -1;
			int i_179_ = stream.readUnsignedByte();
			int i_180_ = stream.readUnsignedShort();
			int i_181_ = stream.readUnsignedByte();
			int i_182_ = stream.readUnsignedShort();
			if (RS3Applet.DUMP)
				System.out.println("Packet 132: " + i_178_ + ", " + i_179_ + ", " + i_180_ + ", " + i_181_ + ", " + i_182_);
			Class184_Sub2.aClass211_9442.method3030(Class198.aClass198_2212, i_178_, i_179_, i_181_, Class188.aClass188_2133.method2788(-1695960296), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, i_182_, i_180_, (byte) 79);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4705 == class106.currentPacket) {
			int i_183_ = stream.readInt();
			boolean bool = stream.readUnsigned128Byte() == 1;
			Class307.method4133();
			Class538.method6510(i_183_, bool, -659581542);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4743 == class106.currentPacket) {
			int i_184_ = stream.readIntV2();
			if (i_184_ != -1262289085 * Class141.anInt1659) {
				Class141.anInt1659 = i_184_ * -423557781;
				Class170.method2421(Class570.aClass570_7618, -1, -1, -2053231966);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4724 == class106.currentPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			Class307.method4133();
			Class532.aBool7124 = bool;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.VARP_1 == class106.currentPacket) {
			int i_185_ = stream.readUnsignedShortLE();
			byte i_186_ = stream.readByte();
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendVar("+i_185_+", "+i_186_+");");
			Class465_Sub1.aClass96_10352.aClass610_1164.method7269((Class153) Class532.aClass98_Sub1_Sub1_7122.method70(i_185_, (byte) -6), i_186_, 315754912);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CS_VAR_2 == class106.currentPacket) {
			int i_187_ = stream.readIntV2();
			int i_188_ = stream.readUnsignedShort();
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendCSVarInteger("+i_188_+", "+i_187_+");");
			Class307.method4133();
			Class619.method7397(i_188_, i_187_, (byte) 5);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CS_VAR_STRING_1 == class106.currentPacket) {
			int i_189_ = stream.readUnsignedShort();
			String string = stream.readString();
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendCSVarString("+i_189_+", "+string+");");
			Class307.method4133();
			Class310.method4178(i_189_, string, 728541324);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4633) {
			client.anInt11002 = stream.readShort((byte) -107) * 438262537;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_HEAD_ON_ICOMPONENT == class106.currentPacket) {
			int i_190_ = stream.readIntV1();
			Class307.method4133();
			Class206.method2961(i_190_, 3, -1791435655 * client.anInt11156, 0, -963718975);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.MINIMAP_FLAG) {
			int i_191_ = stream.readUnsignedByte128();
			int i_192_ = stream.readUnsignedByteC();
			if (i_192_ == 255) {
				i_192_ = -1;
				i_191_ = -1;
			}
			Class34_Sub7.method10329(i_192_, i_191_, -1986959265);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4607 == class106.currentPacket) {
			Class535.aClass147_7131 = null;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4722) {
			int i_193_ = stream.readUnsignedByte();
			int i_194_ = stream.readUnsignedByte();
			if (stream.readUnsignedByte() == 0)
				client.aClass485ArrayArray11266[i_193_][i_194_] = new Class485();
			else {
				stream.off -= 516175515;
				client.aClass485ArrayArray11266[i_193_][i_194_] = new Class485(stream, null);
			}
			client.anInt11144 = client.anInt11215 * 1144493727;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SET_INTERFACE == class106.currentPacket) {
			int clipped = stream.readUnsigned128Byte();
			int i_196_ = stream.readLEInt();
			int i_197_ = stream.readInt();
			int parent = stream.readIntV1();
			int i_199_ = stream.readIntV1();
			int id = stream.readUnsignedShort();
			int i_201_ = stream.readInt();
			int windowId = parent >> 16;
			int windowComponentId = parent & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendInterface("+id+", "+windowId+", "+windowComponentId+", "+(clipped == 1)+");");
			Class307.method4133();
			Class681.method8089(parent, new Class536_Sub36(id, clipped), new int[] { i_197_, i_199_, i_201_, i_196_ }, false, 381545503);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4671) {
			if (!client.aBool11172) {
				try {
					int i_202_ = stream.readUnsignedByte128();
					byte i_203_ = stream.read128Byte();
					int i_204_ = stream.readIntV2();
					client.aClass231_11088.method3301(i_202_, (byte) 76).method3155(i_204_, i_203_, 1473192922);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) -17);
					Class515.method6325(class106, -1125711021);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4704 == class106.currentPacket) {
			if (!client.aBool11172) {
				try {
					for (byte i_205_ = stream.readByte(); i_205_ != -1; i_205_ = stream.readByte()) {
						for (byte i_206_ = stream.readByte(); i_206_ != -1; i_206_ = stream.readByte()) {
							for (byte i_207_ = stream.readByte(); i_207_ != -1; i_207_ = stream.readByte())
								client.aClass231_11088.method3301(i_205_, (byte) 27).method3173(i_206_, i_207_, Integer.valueOf(stream.readInt()), -829537588);
						}
					}
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) -57);
					Class515.method6325(class106, 507573409);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CS_VAR_1 == class106.currentPacket) {
			byte i_208_ = stream.read128Byte();
			int i_209_ = stream.readUnsignedShortLE();
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendCSVarInteger("+i_209_+", "+i_208_+");");
			Class307.method4133();
			Class619.method7397(i_209_, i_208_, (byte) -49);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4754) {
			int i_210_ = stream.readUnsignedShort();
			int i_211_ = stream.readUnsignedShort();
			int i_212_ = stream.readUnsignedShort();
			Class184_Sub2.aClass211_9442.method2994(i_210_, i_211_, i_212_, -824841078);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4710) {
			String string = stream.readString();
			int i_213_ = stream.readUnsignedShort();
			int i_214_ = stream.readUnsignedShort();
			int i_215_ = stream.readUnsignedShort();
			Class23.aClass5_230.aString112 = string;
			Class23.aClass5_230.anInt111 = i_213_ * 1232605419;
			Class23.aClass5_230.anInt110 = -1803928197 * i_214_;
			Class23.aClass5_230.anInt108 = i_215_ * -1753280203;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4778 == class106.currentPacket) {
			int i_216_ = stream.readLEInt();
			int i_217_ = stream.readLEInt();
			Class307.method4133();
			Class101.method1357(i_216_, i_217_, -1848645974);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4635 == class106.currentPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString();
			long l = (long) stream.readUnsignedShort();
			long l_218_ = (long) stream.read24BitUnsignedInteger(1607406376);
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(1056117194), stream.readUnsignedByte(), 1858049507));
			int i_219_ = stream.readUnsignedShort();
			long l_220_ = l_218_ + (l << 32);
			boolean bool_221_ = false;
			Object object = null;
			Class536_Sub15 class536_sub15 = (bool ? Class646.aClass536_Sub15_8361 : Class66.aClass536_Sub15_724);
			while_70_: do {
				if (null == class536_sub15)
					bool_221_ = true;
				else {
					for (int i_222_ = 0; i_222_ < 100; i_222_++) {
						if (l_220_ == client.aLongArray11235[i_222_]) {
							bool_221_ = true;
							break while_70_;
						}
					}
					if (class402.aBool4203 && Class350.method4638(string, (short) 6157))
						bool_221_ = true;
				}
			} while (false);
			if (!bool_221_) {
				client.aLongArray11235[client.anInt11072 * 632873891] = l_220_;
				client.anInt11072 = 308045835 * ((1 + 632873891 * client.anInt11072) % 100);
				String string_223_ = Class198.aClass32_2216.method788(i_219_, (byte) -2).method10712(stream, (byte) -102);
				int i_224_ = bool ? 42 : 45;
				if (1719069535 * class402.anInt4201 != -1)
					Class536_Sub18_Sub2.method10491(i_224_, 0, new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) 44)).append(string).toString(), new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) 49)).append(string).toString(), string, string_223_, class536_sub15.aString10485, i_219_, class402, -1967917467);
				else
					Class536_Sub18_Sub2.method10491(i_224_, 0, string, string, string, string_223_, (class536_sub15.aString10485), i_219_, class402, -769666274);
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4656) {
			client.anInt11234 = client.anInt11215 * -1759549907;
			boolean bool = stream.readUnsignedByte() == 1;
			Class353 class353 = new Class353(stream);
			Class536_Sub15 class536_sub15;
			if (bool)
				class536_sub15 = Class646.aClass536_Sub15_8361;
			else
				class536_sub15 = Class66.aClass536_Sub15_724;
			class353.method4643(class536_sub15, 2012505291);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.MAP_REGION) {
			RSBitBuffer class536_sub33_sub2_225_ = new RSBitBuffer(class106.anInt1262 * 610303591);
			System.arraycopy((class106.byteBuffer.buffer), (-810172525 * class106.byteBuffer.off), class536_sub33_sub2_225_.buffer, 0, class106.anInt1262 * 610303591);
			Class478.method5762(753155875);
			if (Class710.aClass536_Sub40_8843.aClass710_Sub41_10784.method10248(65533) == 1)
				Class266.aClass503_2867.method6043(new Class510(Class498.aClass498_5557, class536_sub33_sub2_225_), (byte) 122);
			else
				client.aClass515_11066.method6291(new Class510(Class498.aClass498_5557, class536_sub33_sub2_225_), (byte) -87);
			class106.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4717 == class106.currentPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString();
			String string_226_ = string;
			if (bool)
				string_226_ = stream.readString();
			long l = (long) stream.readUnsignedShort();
			long l_227_ = (long) stream.read24BitUnsignedInteger(1856093933);
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(-88856294), stream.readUnsignedByte(), 1858049507));
			long l_228_ = l_227_ + (l << 32);
			boolean bool_229_ = false;
			while_71_: do {
				for (int i_230_ = 0; i_230_ < 100; i_230_++) {
					if (client.aLongArray11235[i_230_] == l_228_) {
						bool_229_ = true;
						break while_71_;
					}
				}
				if (class402.aBool4203) {
					if (client.aBool11078 && !client.aBool11163 || client.aBool11166)
						bool_229_ = true;
					else if (Class350.method4638(string_226_, (short) 301))
						bool_229_ = true;
				}
			} while (false);
			if (!bool_229_) {
				client.aLongArray11235[632873891 * client.anInt11072] = l_228_;
				client.anInt11072 = 308045835 * ((1 + 632873891 * client.anInt11072) % 100);
				String string_231_ = (Class166.method1997(Class323.method4257(stream, (byte) 75), (byte) 22));
				int i_232_ = class402.aBool4202 ? 7 : 3;
				if (-1 != class402.anInt4201 * 1719069535)
					Class536_Sub18_Sub2.method10491(i_232_, 0, new StringBuilder().append(Class635.method7563((class402.anInt4201 * 1719069535), (byte) -92)).append(string).toString(), new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) -58)).append(string_226_).toString(), string, string_231_, null, -1, class402, 2102642043);
				else
					Class536_Sub18_Sub2.method10491(i_232_, 0, string, string_226_, string, string_231_, null, -1, class402, 965241137);
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4596) {
			client.aClass634_11165 = (Class634) Class682.method8091(Class634.method7547((byte) 3), stream.readUnsigned128Byte(), 1858049507);
			if (null == client.aClass634_11165)
				client.aClass634_11165 = Class634.aClass634_8264;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4726 == class106.currentPacket) {
			int i_233_ = stream.readLEInt();
			int i_234_ = stream.readUnsignedShort128();
			if (65535 == i_234_)
				i_234_ = -1;
			int i_235_ = stream.readUnsignedShort();
			if (i_235_ == 65535)
				i_235_ = -1;
			int i_236_ = stream.readUnsignedShort128();
			Class307.method4133();
			for (int i_237_ = i_234_; i_237_ <= i_235_; i_237_++) {
				long l = ((long) i_233_ << 32) + (long) i_237_;
				Class536_Sub14 class536_sub14 = (Class536_Sub14) client.aClass4_11243.method556(l);
				Class536_Sub14 class536_sub14_238_;
				if (null == class536_sub14) {
					if (-1 == i_237_)
						class536_sub14_238_ = new Class536_Sub14((Class264.method3678(i_233_, -689214737).aClass536_Sub14_2575.anInt10469) * -512963777, i_236_);
					else
						class536_sub14_238_ = new Class536_Sub14(0, i_236_);
				} else {
					class536_sub14_238_ = new Class536_Sub14((-512963777 * class536_sub14.anInt10469), i_236_);
					class536_sub14.method6484(523680172);
				}
				client.aClass4_11243.method560(class536_sub14_238_, l);
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4780) {
			if (!client.aBool11172) {
				try {
					int i_239_ = stream.readUnsignedByte();
					boolean bool = stream.readUnsignedByte() == 1;
					int i_240_ = stream.readUnsignedByte128();
					client.aClass231_11088.method3301(i_239_, (byte) 41).method3159(i_240_, bool, -1360287920);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) 35);
					Class515.method6325(class106, 186666851);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CLIENT_SCRIPT == class106.currentPacket) {
			String string = stream.readString();
			Object[] objects = new Object[string.length() + 1];
			for (int i_241_ = string.length() - 1; i_241_ >= 0; i_241_--) {
				if (string.charAt(i_241_) == 's')
					objects[1 + i_241_] = stream.readString();
				else
					objects[1 + i_241_] = new Integer(stream.readInt());
			}
			String args = "new Object[] { ";
			for (int z = objects.length-1;z > 0;z--) {
				Object pramStr;
				if (objects[z] instanceof String)
					pramStr = "\""+objects[z]+"\"";
				else
					pramStr = objects[z];
				if (z != objects.length-1) {
					args = args+", "+pramStr;
				} else {
					args = args+pramStr;
				}
			}
			objects[0] = new Integer(stream.readInt());
			args = args + " });";
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendExecuteScriptReverse("+objects[0]+", "+args);
			Class307.method4133();
			Class536_Sub42 class536_sub42 = new Class536_Sub42();
			class536_sub42.anObjectArray10802 = objects;
			Class618.method7388(class536_sub42, 1995422853);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4777 == class106.currentPacket) {
			client.anInt11268 = client.anInt11215 * -316283343;
			if (0 == 610303591 * class106.anInt1262)
				Class63.aClass226_717 = null;
			else
				Class63.aClass226_717 = new Class226(0L, stream, true, client.anInterface28_11049);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4758) {
			boolean bool = stream.readUnsignedByte() == 1;
			long l = (long) stream.readUnsignedShort();
			long l_242_ = (long) stream.read24BitUnsignedInteger(1049136975);
			long l_243_ = l_242_ + (l << 32);
			boolean bool_244_ = false;
			Class536_Sub15 class536_sub15 = (bool ? Class646.aClass536_Sub15_8361 : Class66.aClass536_Sub15_724);
			if (class536_sub15 == null)
				bool_244_ = true;
			else {
				for (int i_245_ = 0; i_245_ < 100; i_245_++) {
					if (client.aLongArray11235[i_245_] == l_243_) {
						bool_244_ = true;
						break;
					}
				}
			}
			if (!bool_244_) {
				client.aLongArray11235[632873891 * client.anInt11072] = l_243_;
				client.anInt11072 = (client.anInt11072 * 632873891 + 1) % 100 * 308045835;
				String string = Class323.method4257(stream, (byte) 36);
				int i_246_ = bool ? 43 : 46;
				Class536_Sub18_Sub2.method10491(i_246_, 0, "", "", "", string, class536_sub15.aString10485, -1, null, -180123751);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4712 == class106.currentPacket) {
			int i_247_ = stream.readInt();
			if (-271820503 * Class486.anInt5443 != i_247_) {
				Class486.anInt5443 = -1872014567 * i_247_;
				Class170.method2421(Class570.aClass570_7616, -1, -1, -1087469756);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4716 == class106.currentPacket) {
			int i_248_ = stream.readInt();
			int i_249_ = stream.readIntV2();
			Class307.method4133();
			Class536_Sub36 class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method556((long) i_249_));
			Class536_Sub36 class536_sub36_250_ = ((Class536_Sub36) client.aClass4_11008.method556((long) i_248_));
			if (null != class536_sub36_250_)
				Class398.method4903(class536_sub36_250_, (class536_sub36 == null || ((-358726121 * class536_sub36_250_.anInt10634) != (-358726121 * class536_sub36.anInt10634))), false, 1759806773);
			if (null != class536_sub36) {
				class536_sub36.method6484(212946829);
				client.aClass4_11008.method560(class536_sub36, (long) i_248_);
			}
			InterfaceDefinitions class251 = Class264.method3678(i_249_, -689214737);
			if (class251 != null)
				Class668.method8011(class251, 263642117);
			class251 = Class264.method3678(i_248_, -689214737);
			if (class251 != null) {
				Class668.method8011(class251, 263642117);
				Class499.method6023((Class463.aClass234Array5227[(class251.anInt2559 * -1591767037 >>> 16)]), class251, true, (byte) -38);
			}
			if (-1 != -1959825479 * client.anInt11187)
				Class205.method2950(-1959825479 * client.anInt11187, 1, -870807069);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4745) {
			int i_251_ = stream.readUnsignedByte();
			Class690 class690 = ((Class690) Class682.method8091(Class173_Sub1.method8635(-911671277), i_251_, 1858049507));
			if (null == class690)
				class690 = Class690.aClass690_8696;
			Class196.method2868(class690, -90938983);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4779 == class106.currentPacket) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.GROUND_GRAPHIC_RELATED, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4612) {
			int i_252_ = stream.readUnsignedByte();
			int i_253_ = stream.readBigSmart();
			if (client.aClass526Array11021[i_252_] != null) {
				client.aClass526Array11021[i_252_].method6415(client.aClass515_11066.method6249(828325686), (byte) 0);
				client.aClass526Array11021[i_252_] = null;
			}
			if (-1 != i_253_)
				client.aClass526Array11021[i_252_] = new Class526(Class677.aClass167_8609, stream, i_253_);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4592 == class106.currentPacket) {
			int i_254_ = stream.readUnsignedShort();
			byte i_255_ = stream.read128Byte();
			Class307.method4133();
			Class632.method7542(i_254_, i_255_, 1007728958);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4609) {
			client.anInt11289 = 1823844035;
			client.anInt11231 = client.anInt11215 * 1286029873;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4785 == class106.currentPacket) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.aClass409_4319, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4688) {
			String string = stream.readString();
			Class94.method1288(string, 1216065667);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4654) {
			Class184_Sub2.aClass211_9442.method3013(39424);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4642 == class106.currentPacket) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.PROJECTILE, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.GAME_MESSAGE) {
			int messageType = stream.readUnsignedSmart();
			int tileHash = stream.readInt();
			int maskData = stream.readUnsignedByte();
			String username = "";
			String displayName = username;
			if (0 != (maskData & 0x1)) {
				username = stream.readString();
				if (0 != (maskData & 0x2))
					displayName = stream.readString();
				else
					displayName = username;
			}
			String message = stream.readString();
			if (messageType == 99)
				Class214.sendPanelBoxMessage(message);
			else if (98 == messageType)
				Class298.method4013(message, -2086717899);
			else {
				if (!displayName.equals("") && Class350.method4638(displayName, (short) -6856)) {
					class106.currentPacket = null;
					return true;
				}
				Class635.method7564(messageType, tileHash, username, displayName, username, message, null, -1538266173);
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4647) {
			client.anInt11073 = stream.readUnsignedByte128() * 378731663;
			client.anInt11259 = stream.readUnsignedByte() * -1673168787;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4770 == class106.currentPacket) {
			client.aClass231_11088.method3314(-563827227);
			int i_261_ = stream.readUnsignedByte();
			for (int i_262_ = 0; i_262_ < i_261_; i_262_++) {
				int i_263_ = stream.readInt();
				Class223 class223 = new Class223(i_263_);
				client.aClass231_11088.method3302(class223, -150234020);
				int i_264_ = stream.readUnsignedByte();
				for (int i_265_ = 0; i_265_ < i_264_; i_265_++)
					class223.method3195(stream.readInt(), (byte) -73);
				int i_266_ = stream.readUnsignedByte();
				for (int i_267_ = 0; i_267_ < i_266_; i_267_++)
					class223.method3158(stream.readInt(), -1259532821);
				for (int i_268_ = 0; i_268_ < i_264_; i_268_++) {
					byte i_269_ = stream.readByte();
					class223.method3191(i_268_, i_269_, (byte) -27);
					for (int i_270_ = 0; i_270_ < i_266_; i_270_++) {
						if (stream.readUnsignedByte() == 0)
							class223.method3173(i_268_, i_270_, null, -829537588);
						else
							class223.method3173(i_268_, i_270_, Integer.valueOf(stream.readInt()), -829537588);
					}
				}
			}
			client.aBool11172 = false;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4598 == class106.currentPacket) {
			int i_271_ = stream.readUnsignedByte();
			Class686 class686 = ((Class686) Class682.method8091(Class692.method8194(1297487641), i_271_, 1858049507));
			if (class686 == null)
				class686 = Class686.aClass686_8669;
			Class55.method955(class686, (byte) -58);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4708) {
			Class75.anInt819 = stream.read24BitInteger((byte) 42) * 89794997;
			client.aBool11078 = stream.readUnsignedByte() == 1;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4701) {
			int i_272_ = stream.readUnsignedShortLE();
			int i_273_ = stream.readUnsignedShort128();
			int i_274_ = stream.readIntV1();
			client.aClass515_11066.method6249(458468733).method6739(i_272_, i_274_, i_273_, (byte) 121);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4720) {
			Class642 class642 = new Class642();
			boolean bool = class642.method7711(stream, 1804867751);
			client.aClass515_11066.method6252(1796531619).method7608(client.aClass515_11066, bool ? class642 : null, class642.method7693((short) 255), -1699115930);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4639 == class106.currentPacket) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.ADD_GAME_OBJECT, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4594) {
			Class101.anInt1200 = stream.readUnsignedByte() * -1632508337;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4776 == class106.currentPacket) {
			int i_275_ = stream.readInt();
			int i_276_ = stream.readUnsigned128Byte();
			i_276_ = -i_276_ - 2;
			Class307.method4133();
			Class206.method2961(i_275_, 5, i_276_, 0, 619898817);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4670) {
			int i_277_ = stream.readIntV2();
			Class307.method4133();
			Class206.method2961(i_277_, 5, -1791435655 * client.anInt11156, 0, 1281313370);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4768) {
			int i_278_ = stream.readUnsignedByte128();
			int i_279_ = stream.readUnsignedByte128();
			int i_280_ = stream.readUnsignedByte128();
			int i_281_ = stream.readUnsignedByte128();
			int i_282_ = stream.readUnsignedShort128() << 2;
			Class307.method4133();
			Class195.method2864(i_278_, i_281_, i_282_, i_279_, i_280_, -830720796);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ITEM_CONTAINER == class106.currentPacket) {
			int key = stream.readUnsignedShort();
			int flags = stream.readUnsignedByte();
			boolean bool = 0 != (flags & 0x1);
			boolean bool_285_ = 0 != (flags & 0x2);
			Class522.method6383(key, bool, -143802020);
			int size = stream.readUnsignedShort();
			for (int i_287_ = 0; i_287_ < size; i_287_++) {
				int itemId = stream.readUnsignedShort();
				int amount = stream.readUnsignedByte();
				if (amount == 255)
					amount = stream.readInt();
				Class21 class21 = null;
				if (bool_285_) {
					int metadataCount = stream.readUnsignedByte();
					if (metadataCount > 0) {
						class21 = new Class21(Class458_Sub2.aClass98_Sub1_Sub2_10306);
						while (metadataCount-- > 0) {
							Class430 class430 = (Class458_Sub2.aClass98_Sub1_Sub2_10306.method8388(stream, 420708291));
							class21.method18(706703961 * class430.anInt4820, class430.anObject4819, (byte) -9);
						}
					}
				}
				Class38.method846(key, i_287_, itemId - 1, amount, class21, bool, 330407149);
			}
			client.anIntArray11220[(client.anInt11221 += 705495793) * -111956463 - 1 & 0x3f] = key;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.OBJECT_RELATED_MAYBE) {
			Class302.sceneX = (stream.readByte128() << 3) * 1163453749;
			Class512.scenePlane = stream.readUnsigned128Byte() * -200495015;
			Class618.sceneY = (stream.readByteC() << 3) * 1712069097;
			Class598 class598 = client.aClass515_11066.method6255(-1402585475);
			for (Class536_Sub9 class536_sub9 = ((Class536_Sub9) client.aClass4_11170.method562(-2130479919)); null != class536_sub9; class536_sub9 = (Class536_Sub9) client.aClass4_11170.method567(-960496680)) {
				int i_291_ = (int) ((class536_sub9.aLong7133 * -6909195213925454795L >> 28) & 0x3L);
				int i_292_ = (int) (class536_sub9.aLong7133 * -6909195213925454795L & 0x3fffL);
				int i_293_ = i_292_ - 1858049507 * class598.anInt7839;
				int i_294_ = (int) ((class536_sub9.aLong7133 * -6909195213925454795L >> 14) & 0x3fffL);
				int i_295_ = i_294_ - class598.anInt7840 * 1479112045;
				if (Class512.scenePlane * -502818839 == i_291_ && i_293_ >= 421791005 * Class302.sceneX && i_293_ < 8 + Class302.sceneX * 421791005 && i_295_ >= 1895190105 * Class618.sceneY && i_295_ < 1895190105 * Class618.sceneY + 8) {
					class536_sub9.method6484(-214302077);
					if (i_293_ >= 0 && i_295_ >= 0 && (i_293_ < client.aClass515_11066.method6321((byte) 10)) && (i_295_ < client.aClass515_11066.method6243(177401017)))
						Class52.method934(Class512.scenePlane * -502818839, i_293_, i_295_, (byte) -121);
				}
			}
			for (Class536_Sub2 class536_sub2 = ((Class536_Sub2) Class536_Sub2.aClass708_10320.method8308(1867269829)); class536_sub2 != null; class536_sub2 = (Class536_Sub2) Class536_Sub2.aClass708_10320.method8311(1383904041)) {
				if ((848380705 * class536_sub2.anInt10309 >= Class302.sceneX * 421791005) && (848380705 * class536_sub2.anInt10309 < 8 + 421791005 * Class302.sceneX) && (-499217723 * class536_sub2.anInt10312 >= Class618.sceneY * 1895190105) && (-499217723 * class536_sub2.anInt10312 < 8 + Class618.sceneY * 1895190105) && (-1676454841 * class536_sub2.anInt10310 == Class512.scenePlane * -502818839))
					class536_sub2.aBool10319 = true;
			}
			for (Class536_Sub2 class536_sub2 = ((Class536_Sub2) Class536_Sub2.aClass708_10321.method8308(1867269829)); null != class536_sub2; class536_sub2 = (Class536_Sub2) Class536_Sub2.aClass708_10321.method8311(1298341929)) {
				if ((class536_sub2.anInt10309 * 848380705 >= 421791005 * Class302.sceneX) && (class536_sub2.anInt10309 * 848380705 < 8 + 421791005 * Class302.sceneX) && (-499217723 * class536_sub2.anInt10312 >= 1895190105 * Class618.sceneY) && (class536_sub2.anInt10312 * -499217723 < 8 + 1895190105 * Class618.sceneY) && (class536_sub2.anInt10310 * -1676454841 == Class512.scenePlane * -502818839))
					class536_sub2.aBool10319 = true;
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4761 == class106.currentPacket) {
			if (!client.aBool11172) {
				try {
					int i_296_ = stream.readUnsigned128Byte();
					int i_297_ = stream.readUnsignedByte();
					int i_298_ = stream.readUnsigned128Byte();
					client.aClass231_11088.method3301(i_296_, (byte) 15).method3173(i_298_, i_297_, null, -829537588);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) -72);
					Class515.method6325(class106, 1228501028);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.PUBLIC_CHAT) { 
			int i_299_ = stream.readUnsignedShort();
			Player player;
			if (client.anInt11156 * -1791435655 == i_299_)
				player = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591;
			else
				player = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_299_];
			if (null == player) {
				class106.currentPacket = null;
				return true;
			}
			int i_300_ = stream.readUnsignedShort();
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(1530576446), stream.readUnsignedByte(), 1858049507));
			boolean bool = (i_300_ & 0x8000) != 0;
			if (player.username != null && player.aClass617_12202 != null) {
				boolean bool_301_ = false;
				if (class402.aBool4203) {
					if (!bool && (client.aBool11078 && !client.aBool11163 || client.aBool11166))
						bool_301_ = true;
					else if (Class350.method4638((player.username), (short) -20530))
						bool_301_ = true;
				}
				if (!bool_301_) {
					int i_302_ = -1;
					String string;
					if (bool) {
						i_300_ &= 0x7fff;
						Class382 class382 = Class604.method7205(stream, 748283128);
						i_302_ = 810974573 * class382.anInt4013;
						string = (class382.aClass536_Sub18_Sub10_4012.method10712(stream, (byte) -21));
					} else
						string = (Class166.method1997(Class323.method4257(stream, (byte) 40), (byte) 108));
					player.method11090(string.trim(), i_300_ >> 8, i_300_ & 0xff, (byte) 3);
					int i_303_;
					if (class402.aBool4202)
						i_303_ = bool ? 17 : 1;
					else
						i_303_ = bool ? 17 : 2;
					if (-1 != class402.anInt4201 * 1719069535)
						Class536_Sub18_Sub2.method10491(i_303_, 0, new StringBuilder().append(Class635.method7563((class402.anInt4201 * 1719069535), (byte) 16)).append(player.method11085(true, (byte) 1)).toString(), new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) -57)).append(player.method11086(false, -1870264782)).toString(), player.aString12192, string, null, i_302_, class402,
								-1710692062);
					else
						Class536_Sub18_Sub2.method10491(i_303_, 0, player.method11085(true, (byte) 1), player.method11086(false, -1984113659), player.aString12192, string, null, i_302_, class402, -1816212715);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4591) {
			if (!client.aBool11172) {
				try {
					int i_304_ = stream.readIntV1();
					byte i_305_ = stream.readByte128();
					int i_306_ = stream.readUnsignedByte128();
					client.aClass231_11088.method3301(i_306_, (byte) 75).method3162(i_304_, i_305_, -1566474308);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) 39);
					Class515.method6325(class106, 1762162197);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4679 == class106.currentPacket) {
			int i_307_ = stream.readUnsignedShortLE();
			int[] is = new int[4];
			for (int i_308_ = 0; i_308_ < 4; i_308_++)
				is[i_308_] = stream.readInt();
			int i_309_ = stream.readUnsignedByte();
			Class536_Sub13 class536_sub13 = ((Class536_Sub13) client.aClass4_11050.method556((long) i_307_));
			if (null != class536_sub13)
				Class360_Sub1.method9269(((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468), is, i_309_, true);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4652 == class106.currentPacket) {
			int i_310_ = stream.readUnsignedByteC();
			Class307.method4133();
			client.anInt11132 = 1448609337 * i_310_;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4711) {
			int i_311_ = stream.readUnsignedShortLE128();
			int i_312_ = stream.readLEInt();
			Class307.method4133();
			Class96.method1313(i_312_, i_311_, (byte) 5);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4689 == class106.currentPacket) {
			client.anInt11226 = -49549167 * client.anInt11215;
			boolean bool = stream.readUnsignedByte() == 1;
			Class344 class344 = new Class344(stream);
			Class350 class350;
			if (bool)
				class350 = Class256.aClass350_2762;
			else
				class350 = Class50.aClass350_585;
			class344.method4480(class350, (byte) 120);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4721 == class106.currentPacket) {
			if (Class707.aBool8822 && null != Class223.aFrame2336)
				Class15.method640(Class710.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(-1146339449), -1, -1, false, -1631489726);
			byte[] is = new byte[610303591 * class106.anInt1262 - 1];
			boolean bool = stream.readUnsignedByte() == 1;
			stream.method10776(is, 0, class106.anInt1262 * 610303591 - 1, -399442820);
			RSByteBuffer class536_sub33 = new RSByteBuffer(is);
			String string = class536_sub33.readString();
			if (bool) {
				String string_313_ = class536_sub33.readString();
				if (string_313_.length() == 0)
					string_313_ = string;
				if (!client.aBool10984 || Class241.aString2456.startsWith("mac") || !Class575.method7000(string, 1, Class412.aClass412_4392.method5005(1262993710), -1538496515))
					Class380.method4809(string_313_, true, client.aBool11228, 1887390142);
			} else
				Class380.method4809(string, true, client.aBool11228, 1657675759);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4627) {
			int i_314_ = stream.readIntV1();
			int i_315_ = stream.readIntV1();
			int i_316_ = stream.readInt();
			int i_317_ = stream.readInt();
			Class598 class598 = new Class598(stream.readInt());
			int i_318_ = stream.readUnsignedByte();
			int i_319_ = stream.readUnsignedShort128();
			int i_320_ = stream.readIntV2();
			int i_321_ = stream.readUnsignedByteC();
			int i_322_ = i_321_ >> 2;
			int i_323_ = i_321_ & 0x3;
			int i_324_ = stream.readInt();
			Class307.method4133();
			Class681.method8089(i_324_, new Class536_Sub36_Sub4(i_319_, i_318_, new Class675(class598, i_322_, i_323_, i_320_)), new int[] { i_314_, i_317_, i_315_, i_316_ }, false, -747535247);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4665) {
			int val = stream.readUnsignedByte();
			Class464.aClass694_5229 = Class187.method2785(val, (byte) 1);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4759 == class106.currentPacket) {
			int i_325_ = stream.readUnsignedByte128();
			int i_326_ = stream.readUnsignedShort128();
			if (RS3Applet.DUMP) {
				System.out.println("player.getPackets().setVarbit(" + i_326_ + ", " + i_325_ + ");");
			}
			Class465_Sub1.aClass96_10352.aClass610_1164.method7270((Class324) Class56.aClass34_Sub14_608.method70(i_326_, (byte) 11), i_325_, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4629) {
			int i_327_ = stream.readUnsignedShort();
			Class184_Sub2.aClass211_9442.method3008(i_327_, -2100301397);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_OPTION == class106.currentPacket) {
			int icon = stream.readUnsignedShortLE128();
			if (65535 == icon)
				icon = -1;
			String option = stream.readString();
			int optionSlot = stream.readUnsignedByteC();
			int isTopFlag = stream.readUnsignedByteC();
			if (optionSlot >= 1 && optionSlot <= 8) {
				if (option.equalsIgnoreCase("null"))
					option = null;
				client.aStringArray11100[optionSlot - 1] = option;
				client.anIntArray11169[optionSlot - 1] = icon;
				client.aBoolArray11171[optionSlot - 1] = isTopFlag == 0;
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4681 == class106.currentPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString();
			long l = (long) stream.readUnsignedShort();
			long l_331_ = (long) stream.read24BitUnsignedInteger(1867459018);
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(-1200400101), stream.readUnsignedByte(), 1858049507));
			long l_332_ = l_331_ + (l << 32);
			boolean bool_333_ = false;
			Object object = null;
			Class536_Sub15 class536_sub15 = (bool ? Class646.aClass536_Sub15_8361 : Class66.aClass536_Sub15_724);
			while_72_: do {
				if (class536_sub15 == null)
					bool_333_ = true;
				else {
					for (int i_334_ = 0; i_334_ < 100; i_334_++) {
						if (l_332_ == client.aLongArray11235[i_334_]) {
							bool_333_ = true;
							break while_72_;
						}
					}
					if (class402.aBool4203) {
						if (client.aBool11078 && !client.aBool11163 || client.aBool11166)
							bool_333_ = true;
						else if (Class350.method4638(string, (short) 7189))
							bool_333_ = true;
					}
				}
			} while (false);
			if (!bool_333_) {
				client.aLongArray11235[client.anInt11072 * 632873891] = l_332_;
				client.anInt11072 = 308045835 * ((1 + 632873891 * client.anInt11072) % 100);
				String string_335_ = (Class166.method1997(Class323.method4257(stream, (byte) 29), (byte) 124));
				int i_336_ = bool ? 41 : 44;
				if (-1 != 1719069535 * class402.anInt4201)
					Class536_Sub18_Sub2.method10491(i_336_, 0, new StringBuilder().append(Class635.method7563((class402.anInt4201 * 1719069535), (byte) 8)).append(string).toString(), new StringBuilder().append(Class635.method7563((class402.anInt4201 * 1719069535), (byte) 21)).append(string).toString(), string, string_335_, class536_sub15.aString10485, -1, class402, 1789658075);
				else
					Class536_Sub18_Sub2.method10491(i_336_, 0, string, string, string, string_335_, (class536_sub15.aString10485), -1, class402, -87081790);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ICOMPONENT_ANIMATION == class106.currentPacket) {
			int i_337_ = stream.readIntV2();
			int i_338_ = stream.readIntV1();
			Class307.method4133();
			Class639.method7667(i_337_, i_338_, (short) 18545);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4764 == class106.currentPacket) {
			Class307.method4133();
			Class689.method8182(2092834857);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4624) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.GRAPHICS_ON_TILE, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4673 == class106.currentPacket) {
			if (-1 != -1959825479 * client.anInt11187)
				Class205.method2950(-1959825479 * client.anInt11187, 0, -870807069);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4744 == class106.currentPacket) {
			int i_339_ = stream.readIntV1();
			int i_340_ = stream.readIntV1();
			int i_341_ = stream.readUnsignedShortLE();
			Class307.method4133();
			Class206.method2961(i_340_, 5, i_341_, i_339_, -1639689697);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.DYNAMIC_MAP_SCENE) {
			RSBitBuffer class536_sub33_sub2_342_ = new RSBitBuffer(class106.anInt1262 * 610303591);
			System.arraycopy((class106.byteBuffer.buffer), (class106.byteBuffer.off * -810172525), class536_sub33_sub2_342_.buffer, 0, class106.anInt1262 * 610303591);
			Class478.method5762(204029425);
			if (Class710.aClass536_Sub40_8843.aClass710_Sub41_10784.method10248(65533) == 1)
				Class266.aClass503_2867.method6043(new Class510(Class498.aClass498_5558, class536_sub33_sub2_342_), (byte) 109);
			else
				client.aClass515_11066.method6291(new Class510(Class498.aClass498_5558, class536_sub33_sub2_342_), (byte) -52);
			class106.currentPacket = null;
			return false;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4610) {
			int i_343_ = stream.readUnsignedShort();
			Class184_Sub2.aClass211_9442.method2990(i_343_, -1963540751);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4620) {
			Class275.method3737(Class61.aBool653, -1376513187);
			class106.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4782 == class106.currentPacket) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.aClass409_4308, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.ROOT_INTERFACE) {
			int i_344_ = stream.readInt();
			int i_345_ = stream.readInt();
			int i_346_ = stream.readInt();
			int i_347_ = stream.readLEInt();
			int id = stream.readUnsignedShortLE();
			stream.readUnsignedByte();
			if (RS3Applet.DUMP) {
				System.out.println("player.getInterfaceManager().setRootInterface(" + id + ", false);");
			}
			Class307.method4133();
			int[] is = { i_347_, i_346_, i_345_, i_344_ };
			client.anInt11187 = id * 2074470025;
			Class261.method3624(id, is, -1484135275);
			Class325_Sub1.method9206(false, 555962201);
			Class668.method8010(client.anInt11187 * -1959825479, is, 729569083);
			for (int i_349_ = 0; i_349_ < 106; i_349_++)
				client.aBoolArray11240[i_349_] = true;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4690) {
			client.anInt11234 = client.anInt11215 * -1759549907;
			boolean bool = stream.readUnsignedByte() == 1;
			if (class106.anInt1262 * 610303591 == 1) {
				if (bool)
					Class646.aClass536_Sub15_8361 = null;
				else
					Class66.aClass536_Sub15_724 = null;
				class106.currentPacket = null;
				return true;
			}
			if (bool)
				Class646.aClass536_Sub15_8361 = new Class536_Sub15(stream);
			else
				Class66.aClass536_Sub15_724 = new Class536_Sub15(stream);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4603 == class106.currentPacket) {
			int i_350_ = stream.readLEInt();
			int i_351_ = stream.readUnsignedShortLE();
			Class598 class598 = new Class598(stream.readIntV2());
			int i_352_ = stream.readIntV1();
			int i_353_ = stream.readUnsignedShort();
			int i_354_ = stream.readLEInt();
			int i_355_ = stream.readIntV1();
			int i_356_ = stream.readUnsigned128Byte();
			int i_357_ = stream.readInt();
			Class307.method4133();
			Class681.method8089(i_354_, new Class536_Sub36_Sub1(i_351_, i_356_, new Class666(class598, i_353_)), new int[] { i_357_, i_355_, i_352_, i_350_ }, false, -1604120929);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.VARP_2 == class106.currentPacket) {
			int i_358_ = stream.readIntV1();
			int i_359_ = stream.readUnsignedShortLE128();
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendVar("+i_359_+", "+i_358_+");");
			Class465_Sub1.aClass96_10352.aClass610_1164.method7269((Class153) Class532.aClass98_Sub1_Sub1_7122.method70(i_359_, (byte) 19), i_358_, 315754912);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4707) {
			int i_360_ = stream.readIntV2();
			int i_361_ = stream.readIntV1();
			int i_362_ = stream.readUnsignedShort();
			int i_363_ = stream.readIntV1();
			int i_364_ = stream.readIntV1();
			int i_365_ = stream.readUnsignedByte128();
			int i_366_ = stream.readUnsignedShort();
			int i_367_ = stream.readIntV1();
			Class307.method4133();
			Class681.method8089(i_361_, new Class536_Sub36_Sub2(i_366_, i_365_, i_362_), new int[] { i_364_, i_363_, i_367_, i_360_ }, false, -176012196);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4729) {
			Class275.method3737(false, -1767652538);
			class106.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass422_4660 == class106.currentPacket) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString();
			String string_368_ = string;
			if (bool)
				string_368_ = stream.readString();
			String string_369_ = stream.readString();
			long l = (long) stream.readUnsignedShort();
			long l_370_ = (long) stream.read24BitUnsignedInteger(1954072536);
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(-142450876), stream.readUnsignedByte(), 1858049507));
			long l_371_ = l_370_ + (l << 32);
			boolean bool_372_ = false;
			while_73_: do {
				for (int i_373_ = 0; i_373_ < 100; i_373_++) {
					if (l_371_ == client.aLongArray11235[i_373_]) {
						bool_372_ = true;
						break while_73_;
					}
				}
				if (class402.aBool4203) {
					if (client.aBool11078 && !client.aBool11163 || client.aBool11166)
						bool_372_ = true;
					else if (Class350.method4638(string_368_, (short) 1289))
						bool_372_ = true;
				}
			} while (false);
			if (!bool_372_) {
				client.aLongArray11235[632873891 * client.anInt11072] = l_371_;
				client.anInt11072 = (1 + 632873891 * client.anInt11072) % 100 * 308045835;
				String string_374_ = (Class166.method1997(Class323.method4257(stream, (byte) 36), (byte) 48));
				if (-1 != class402.anInt4201 * 1719069535)
					Class536_Sub18_Sub2.method10491(9, 0, new StringBuilder().append(Class635.method7563((class402.anInt4201 * 1719069535), (byte) 80)).append(string).toString(), new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) -34)).append(string_368_).toString(), string, string_374_, string_369_, -1, class402, -686305909);
				else
					Class536_Sub18_Sub2.method10491(9, 0, string, string_368_, string, string_374_, string_369_, -1, class402, -1342508355);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.UPDATE_ITEM_CONTAINER == class106.currentPacket) {
			int key = stream.readUnsignedShort();
			int flags = stream.readUnsignedByte();
			boolean bool = 0 != (flags & 0x1);
			boolean hasMetadata = (flags & 0x2) != 0;
			while (-810172525 * stream.off < 610303591 * class106.anInt1262) {
				int size = stream.readUnsignedSmart();
				int itemId = stream.readUnsignedShort();
				int amount = 0;
				Class21 class21 = null;
				if (itemId != 0) {
					amount = stream.readUnsignedByte();
					if (255 == amount)
						amount = stream.readInt();
					if (hasMetadata) {
						int numValues = stream.readUnsignedByte();
						if (numValues > 0) {
							class21 = new Class21(Class458_Sub2.aClass98_Sub1_Sub2_10306);
							while (numValues-- > 0) {
								Class430 class430 = (Class458_Sub2.aClass98_Sub1_Sub2_10306.method8388(stream, 738758521));
								class21.method18((706703961 * class430.anInt4820), class430.anObject4819, (byte) 57);
							}
						}
					}
				}
				Class38.method846(key, size, itemId - 1, amount, class21, bool, 357884856);
			}
			client.anIntArray11220[(client.anInt11221 += 705495793) * -111956463 - 1 & 0x3f] = key;
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.HINT_ICON) {
			int i_382_ = stream.readUnsignedByte();
			int i_383_ = i_382_ >> 5;
			int i_384_ = i_382_ & 0x1f;
			if (0 == i_384_) {
				client.aClass103Array11020[i_383_] = null;
				class106.currentPacket = null;
				return true;
			}
			Class103 class103 = new Class103();
			class103.anInt1224 = -18369493 * i_384_;
			class103.anInt1222 = stream.readUnsignedByte() * -403223793;
			if (-1060879377 * class103.anInt1222 >= 0 && (class103.anInt1222 * -1060879377 < Class458_Sub5.aClass143Array10338.length)) {
				if (1 == class103.anInt1224 * 2030004867 || class103.anInt1224 * 2030004867 == 10) {
					class103.anInt1223 = (stream.readUnsignedShort() * 4939365);
					class103.anInt1230 = (stream.readUnsignedShort() * 1950049547);
					stream.off += 2064702060;
				} else if (class103.anInt1224 * 2030004867 >= 2 && 2030004867 * class103.anInt1224 <= 6) {
					if (class103.anInt1224 * 2030004867 == 2) {
						class103.anInt1225 = 1853492992;
						class103.anInt1226 = -1320886528;
					}
					if (3 == 2030004867 * class103.anInt1224) {
						class103.anInt1225 = 0;
						class103.anInt1226 = -1320886528;
					}
					if (4 == 2030004867 * class103.anInt1224) {
						class103.anInt1225 = -587981312;
						class103.anInt1226 = -1320886528;
					}
					if (class103.anInt1224 * 2030004867 == 5) {
						class103.anInt1225 = 1853492992;
						class103.anInt1226 = 0;
					}
					if (2030004867 * class103.anInt1224 == 6) {
						class103.anInt1225 = 1853492992;
						class103.anInt1226 = 1653194240;
					}
					class103.anInt1224 = -36738986;
					class103.anInt1221 = (stream.readUnsignedByte() * 1668180345);
					Class598 class598 = client.aClass515_11066.method6255(-1734851434);
					class103.anInt1225 += ((stream.readUnsignedShort() - 1858049507 * class598.anInt7839) << 9) * -2123466225;
					class103.anInt1226 += ((stream.readUnsignedShort() - 1479112045 * class598.anInt7840) << 9) * 615597279;
					class103.anInt1227 = ((stream.readUnsignedByte() << 2) * -842481877);
					class103.anInt1228 = (stream.readUnsignedShort() * -511359211);
				}
				class103.anInt1229 = stream.readInt() * -275637823;
				client.aClass103Array11020[i_383_] = class103;
			}
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4699) {
			int i_385_ = stream.readUnsignedShortLE128();
			int i_386_ = stream.readIntV2();
			Class307.method4133();
			Class632.method7542(i_385_, i_386_, 1007728958);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4648) {
			int i_387_ = stream.readUnsignedShortLE128();
			if (i_387_ == 65535)
				i_387_ = -1;
			int i_388_ = stream.readUnsignedByteC();
			Class184_Sub2.aClass211_9442.method3010(i_387_, i_388_, -2081939247);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.RESET_NIS_VARS) {
			Class590.aClass147_Sub1_7791.method8406((byte) 0);
			class106.currentPacket = null;
			return false;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4723) {
			if (!client.aBool11172) {
				try {
					int i_389_ = stream.readUnsignedByte();
					int i_390_ = stream.readUnsignedByte128();
					client.aClass231_11088.method3301(i_390_, (byte) 75).method3163(i_389_, -505937896);
				} catch (RuntimeException runtimeexception) {
					Class81.method1165(null, runtimeexception, (byte) 52);
					Class515.method6325(class106, -1996435320);
				}
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4619 == class106.currentPacket) {
			String string = stream.readString();
			int i_391_ = stream.readUnsignedShort();
			String string_392_ = Class198.aClass32_2216.method788(i_391_, (byte) -1).method10712(stream, (byte) -92);
			Class536_Sub18_Sub2.method10491(19, 0, string, string, string, string_392_, null, i_391_, null, -705262347);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4615) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.aClass409_4312, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4698 == class106.currentPacket) {
			int i_393_ = stream.readUnsignedShort128();
			int i_394_ = stream.readLEInt();
			int i_395_ = stream.readUnsignedShortLE128();
			int i_396_ = stream.readUnsignedShortLE128();
			Class307.method4133();
			Class206.method2961(i_394_, 7, i_396_ << 16 | i_393_, i_395_, -517201900);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.ICOMPONENT_TEXT) {
			String string = stream.readString();
			int ifHash = stream.readLEInt();
			int interfaceId = ifHash >> 16;
			int componentId = ifHash & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendIComponentText("+interfaceId+", "+componentId+", "+string+");");
			Class307.method4133();
			Class98_Sub1_Sub1.method10476(ifHash, string);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4611) {
			int i_398_ = stream.readUnsignedShort();
			if (65535 == i_398_)
				i_398_ = -1;
			int i_399_ = stream.readUnsignedByte();
			int i_400_ = stream.readUnsignedShort();
			int i_401_ = stream.readUnsignedByte();
			int i_402_ = stream.readUnsignedShort();
			int i_403_ = stream.readUnsignedShort();
			Class479 class479 = (Class184_Sub2.aClass211_9442.method3003(Class198.aClass198_2212, Class184_Sub2.aClass211_9442, i_398_, i_399_, i_401_, Class188.aClass188_2133.method2788(-406223506), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, i_402_, false, (byte) 14));
			if (class479 != null)
				Class184_Sub2.aClass211_9442.method2986(class479, i_403_, i_400_, 576788728);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4753 == class106.currentPacket) {
			int i_404_ = stream.readUnsignedByte();
			Class699 class699 = ((Class699) Class682.method8091(Class503.method6056(1203363943), i_404_, 1858049507));
			if (class699 == null)
				class699 = Class699.aClass699_8786;
			Class10.method618(class699, 677892243);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4604 == class106.currentPacket) {
			int i_405_ = stream.readUnsignedByte();
			int i_406_ = stream.readUnsignedShort();
			int i_407_ = stream.readUnsignedShortLE128();
			int i_408_ = stream.readInt();
			int i_409_ = stream.readIntV2();
			int i_410_ = stream.readIntV2();
			int i_411_ = stream.readInt();
			int i_412_ = stream.readIntV2();
			Class307.method4133();
			Class681.method8089(i_412_, new Class536_Sub36_Sub3(i_407_, i_405_, i_406_), new int[] { i_409_, i_410_, i_408_, i_411_ }, false, 373228862);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ICOMPONENT_SPRITE == class106.currentPacket) {
			int i_413_ = stream.readIntV1();
			int i_414_ = stream.readInt();
			int interfaceId = i_413_ >> 16;
			int componentId = i_413_ & 0xFFFF;
			if (RS3Applet.DUMP)
				System.out.println("player.getPackets().sendIComponentSprite(" + interfaceId + ", " + componentId + ", " + i_414_ + ");");
			Class307.method4133();
			InterfaceDefinitions class251 = Class264.method3678(i_413_, -689214737);
			class251.anInt2604 = -1513859745 * i_414_;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.REMOVE_GROUND_ITEM == class106.currentPacket) {
			PacketDecoder.decodeChunkSceneSubPacket(ChunkSceneSubPackets.REMOVE_GROUND_ITEM, (byte) 2);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4667) {
			int i_415_ = stream.readUnsignedShort();
			if (i_415_ == 65535)
				i_415_ = -1;
			int i_416_ = stream.readUnsignedByte();
			int i_417_ = stream.readUnsignedShort();
			int i_418_ = stream.readUnsignedByte();
			Class184_Sub2.aClass211_9442.method3030(Class198.aClass198_2212, i_415_, i_416_, i_418_, Class188.aClass188_2129.method2788(-44878486), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, 256, i_417_, (byte) 67);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4601) {
			Class307.method4133();
			Class609.method7265(Class65.method1062((short) -15997), -1459725839);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4771) {
			while (stream.off * -810172525 < 610303591 * class106.anInt1262) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString();
				String string_419_ = stream.readString();
				int i_420_ = stream.readUnsignedShort();
				int i_421_ = stream.readUnsignedByte();
				int i_422_ = stream.readUnsignedByte();
				boolean bool_423_ = (i_422_ & 0x2) != 0;
				boolean bool_424_ = 0 != (i_422_ & 0x1);
				String string_425_ = "";
				int i_426_ = -1;
				int i_427_ = 0;
				if (i_420_ > 0) {
					string_425_ = stream.readString();
					i_426_ = stream.readUnsignedByte();
					i_427_ = stream.readInt();
				}
				String string_428_ = stream.readString();
				for (int i_429_ = 0; i_429_ < 142551095 * client.anInt11288; i_429_++) {
					Class31 class31 = client.aClass31Array11291[i_429_];
					if (!bool) {
						if (string.equals(class31.aString266)) {
							if (-32584767 * class31.anInt272 != i_420_) {
								boolean bool_430_ = true;
								for (Class521_Sub6 class521_sub6 = ((Class521_Sub6) client.aClass695_11292.method8210(928520854)); null != class521_sub6; class521_sub6 = ((Class521_Sub6) client.aClass695_11292.method8219(1045593911))) {
									if (class521_sub6.aString10360.equals(string)) {
										if (0 != i_420_ && (class521_sub6.aShort10361 == 0)) {
											class521_sub6.method6354((byte) -14);
											bool_430_ = false;
										} else if (i_420_ == 0 && 0 != (class521_sub6.aShort10361)) {
											class521_sub6.method6354((byte) 61);
											bool_430_ = false;
										}
									}
								}
								if (bool_430_)
									client.aClass695_11292.method8217(new Class521_Sub6(string, i_420_), -449440698);
								class31.anInt272 = -740342719 * i_420_;
							}
							class31.aString267 = string_419_;
							class31.aString268 = string_425_;
							class31.anInt270 = -1079102215 * i_421_;
							class31.anInt271 = 1372019349 * i_426_;
							class31.aBool275 = bool_423_;
							class31.aBool273 = bool_424_;
							class31.aString274 = string_428_;
							class31.anInt269 = -395846731 * i_427_;
							string = null;
							break;
						}
					} else if (string_419_.equals(class31.aString266)) {
						class31.aString266 = string;
						class31.aString267 = string_419_;
						string = null;
						break;
					}
				}
				if (null != string && 142551095 * client.anInt11288 < 400) {
					Class31 class31 = new Class31();
					client.aClass31Array11291[142551095 * client.anInt11288] = class31;
					class31.aString266 = string;
					class31.aString267 = string_419_;
					class31.anInt272 = -740342719 * i_420_;
					class31.aString268 = string_425_;
					class31.anInt270 = i_421_ * -1079102215;
					class31.anInt271 = 1372019349 * i_426_;
					class31.aBool275 = bool_423_;
					class31.aBool273 = bool_424_;
					class31.aString274 = string_428_;
					class31.anInt269 = -395846731 * i_427_;
					client.anInt11288 += 500239751;
				}
			}
			client.anInt11289 = -647279226;
			client.anInt11231 = client.anInt11215 * 1286029873;
			boolean bool = false;
			int i_431_ = client.anInt11288 * 142551095;
			do {
				if (i_431_ <= 0)
					break;
				bool = true;
				i_431_--;
				for (int i_432_ = 0; i_432_ < i_431_; i_432_++) {
					boolean bool_433_ = false;
					Class31 class31 = client.aClass31Array11291[i_432_];
					Class31 class31_434_ = client.aClass31Array11291[1 + i_432_];
					if ((-32584767 * class31.anInt272 != 1318197187 * Class23.aClass5_221.anInt111) && (class31_434_.anInt272 * -32584767 == Class23.aClass5_221.anInt111 * 1318197187))
						bool_433_ = true;
					if (!bool_433_ && 0 == -32584767 * class31.anInt272 && 0 != class31_434_.anInt272 * -32584767)
						bool_433_ = true;
					if (!bool_433_ && !class31.aBool275 && class31_434_.aBool275)
						bool_433_ = true;
					if (!bool_433_ && !class31.aBool273 && class31_434_.aBool273)
						bool_433_ = true;
					if (bool_433_) {
						Class31 class31_435_ = client.aClass31Array11291[i_432_];
						client.aClass31Array11291[i_432_] = client.aClass31Array11291[i_432_ + 1];
						client.aClass31Array11291[i_432_ + 1] = class31_435_;
						bool = false;
					}
				}
			} while (!bool);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4593 == class106.currentPacket) {
			int i_436_ = stream.readUnsignedShortLE128();
			int i_437_ = stream.readUnsignedShortLE();
			int i_438_ = stream.readInt();
			int i_439_ = stream.readUnsignedShortLE();
			Class307.method4133();
			Class504_Sub1.method9322(i_438_, i_437_, i_436_, i_439_, (byte) -42);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4613 == class106.currentPacket) {
			stream.off += 1568012532;
			if (stream.method9727((byte) 46))
				Class288.method3915(stream, (stream.off * -810172525) - 28, -1480728102);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4628 == class106.currentPacket) {
			for (int i_440_ = 0; (i_440_ < client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155.length); i_440_++) {
				if (null != (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_440_])) {
					client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_440_].anIntArray11913 = null;
					client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_440_].aClass688_11925.method8122(-1, -1003425005);
				}
			}
			for (int i_441_ = 0; i_441_ < -1683770117 * client.anInt11164; i_441_++) {
				((Class649_Sub1_Sub5_Sub1) client.aClass536_Sub13Array11044[i_441_].anObject10468).anIntArray11913 = null;
				((Class649_Sub1_Sub5_Sub1) client.aClass536_Sub13Array11044[i_441_].anObject10468).aClass688_11925.method8122(-1, -685209736);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ITEM_ON_ICOMPONENT == class106.currentPacket) {
			int i_442_ = stream.readInt();
			int i_443_ = stream.readIntV1();
			int i_444_ = stream.readUnsignedShort128();
			if (i_444_ == 65535)
				i_444_ = -1;
			Class307.method4133();
			Class216.method3094(i_442_, i_444_, i_443_, -413124118);
			Class1 class1 = ((Class1) Class111.aClass34_Sub13_1391.method70(i_444_, (byte) 19));
			Class504_Sub1.method9322(i_442_, class1.anInt54 * 211736907, 824706077 * class1.anInt30, -1906278051 * class1.anInt47, (byte) -34);
			Class706_Sub4.method10317(i_442_, class1.anInt32 * 814524581, class1.anInt33 * -1832345149, class1.anInt31 * -751322115, 1021240981);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4669) {
			while (stream.off * -810172525 < 610303591 * class106.anInt1262) {
				int i_445_ = stream.readUnsignedByte();
				boolean bool = (i_445_ & 0x1) == 1;
				String string = stream.readString();
				String string_446_ = stream.readString();
				String string_447_ = stream.readString();
				for (int i_448_ = 0; i_448_ < 1857706641 * client.anInt11293; i_448_++) {
					Class30 class30 = client.aClass30Array11295[i_448_];
					if (bool) {
						if (string_446_.equals(class30.aString263)) {
							class30.aString263 = string;
							class30.aString262 = string_446_;
							string = null;
							break;
						}
					} else if (string.equals(class30.aString263)) {
						class30.aString263 = string;
						class30.aString262 = string_446_;
						class30.aString261 = string_447_;
						string = null;
						break;
					}
				}
				if (string != null && 1857706641 * client.anInt11293 < 400) {
					Class30 class30 = new Class30();
					client.aClass30Array11295[1857706641 * client.anInt11293] = class30;
					class30.aString263 = string;
					class30.aString262 = string_446_;
					class30.aString261 = string_447_;
					class30.aBool264 = 2 == (i_445_ & 0x2);
					client.anInt11293 += -758864271;
				}
			}
			client.anInt11231 = 1286029873 * client.anInt11215;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4746 == class106.currentPacket) {
			int i_449_ = stream.readUnsignedByte();
			Class692 class692 = ((Class692) Class682.method8091(Class360_Sub1.method9273(847157081), i_449_, 1858049507));
			if (class692 == null)
				class692 = Class692.aClass692_8707;
			Class441.method5328(class692, (short) 12845);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4760) {
			Class683.aClass301_Sub1_8651.method9198(stream, (610303591 * class106.anInt1262), 1470148540);
			client.anInt11239 = -1740068355 * client.anInt11215;
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4659 == class106.currentPacket) {
			Class535.aClass147_7131 = new Class147(Class536_Sub19.aClass98_Sub1_Sub2_10519);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.NPC_HEAD_ON_ICOMPONENT == class106.currentPacket) {
			int i_450_ = stream.readInt();
			int i_451_ = stream.readInt();
			Class307.method4133();
			Class206.method2961(i_450_, 2, i_451_, -1, -900449254);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4600) {
			int i_452_ = stream.readUnsignedShortLE128();
			if (i_452_ == 65535)
				i_452_ = -1;
			Class184_Sub2.aClass211_9442.method3005(i_452_, 255, 1232605419);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4641) {
			int i_453_ = stream.readUnsignedByte128();
			int i_454_ = stream.readUnsignedByteC();
			int i_455_ = stream.readUnsignedShort128() << 2;
			int i_456_ = stream.readUnsignedByte128();
			int i_457_ = stream.readUnsignedByte128();
			Class307.method4133();
			Class101.method1354(i_453_, i_457_, i_455_, i_454_, i_456_, true, (short) 25595);
			class106.currentPacket = null;
			return true;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4662) {
			int i_458_ = stream.readIntV2();
			int i_459_ = stream.readUnsignedShortLE();
			int i_460_ = stream.readUnsignedShortLE();
			int i_461_ = stream.readUnsigned128Byte();
			Class307.method4133();
			Class193.method2852(i_458_, i_461_, i_460_, i_459_, -2047575529);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4621 == class106.currentPacket) {
			client.anInt11238 = client.anInt11215 * 650243009;
			int i_462_ = stream.off * -810172525;
			int i_463_ = stream.readUnsignedShort();
			boolean bool = stream.readUnsignedByte() == 1;
			Class222 class222 = Class63.aClass226_717.method3227(i_463_, -781094290);
			Class21 class21 = class222.method3128(-1070869978);
			if (class21 == null || bool) {
				class222.method3143(client.anInterface28_11049, -593414976);
				class21 = class222.method3128(-625396178);
			}
			while ((class106.anInt1262 * 610303591 - (-810172525 * stream.off - i_462_)) > 0) {
				Class430 class430 = Class532.aClass98_Sub1_Sub1_7122.method8388(stream, 1522874672);
				class21.method18(class430.anInt4820 * 706703961, class430.anObject4819, (byte) 29);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4737 == class106.currentPacket) {
			Class510.method6186(-530795066);
			class106.currentPacket = null;
			return false;
		}
		if (class106.currentPacket == IncomingPacket.aClass422_4751) {
			String string = stream.readString();
			long l = (long) stream.readUnsignedShort();
			long l_464_ = (long) stream.read24BitUnsignedInteger(1995733377);
			Class402 class402 = ((Class402) Class682.method8091(Class402.method4922(-153815932), stream.readUnsignedByte(), 1858049507));
			boolean bool = stream.readUnsignedByte() == 1;
			int i_465_ = stream.readUnsignedShort();
			long l_466_ = (l << 32) + l_464_;
			boolean bool_467_ = false;
			while_74_: do {
				if (null == Class63.aClass226_717)
					bool_467_ = true;
				else {
					for (int i_468_ = 0; i_468_ < 100; i_468_++) {
						if (l_466_ == client.aLongArray11235[i_468_]) {
							bool_467_ = true;
							break while_74_;
						}
					}
					if (class402.aBool4203 && Class350.method4638(string, (short) 21599))
						bool_467_ = true;
				}
			} while (false);
			if (!bool_467_) {
				client.aLongArray11235[632873891 * client.anInt11072] = l_466_;
				client.anInt11072 = 308045835 * ((client.anInt11072 * 632873891 + 1) % 100);
				String string_469_ = Class198.aClass32_2216.method788(i_465_, (byte) -18).method10712(stream, (byte) -63);
				int i_470_ = bool ? 23 : 25;
				if (-1 != 1719069535 * class402.anInt4201)
					Class536_Sub18_Sub2.method10491(i_470_, 0, new StringBuilder().append(Class635.method7563((class402.anInt4201 * 1719069535), (byte) -45)).append(string).toString(), new StringBuilder().append(Class635.method7563((1719069535 * class402.anInt4201), (byte) 67)).append(string).toString(), string, string_469_, Class63.aClass226_717.method3255(-1332789257), i_465_, class402, 1666880579);
				else
					Class536_Sub18_Sub2.method10491(i_470_, 0, string, string, string, string_469_, Class63.aClass226_717.method3255(-1301335883), i_465_, class402, 1553674177);
			}
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4714 == class106.currentPacket) {
			int i_471_ = stream.readInt();
			int i_472_ = stream.readInt();
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4432, class106.aClass15_1258, 2050670086);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeIntV2(i_471_, (byte) 38);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeIntLE(i_472_, 1795793310);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(client.anInt6856 * -311312947);
			class106.method1409(class536_sub23, 1563853139);
			class106.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass422_4781 == class106.currentPacket) {
			String string = stream.readString();
			boolean bool = stream.readUnsignedByte() == 1;
			String string_473_;
			if (bool)
				string_473_ = stream.readString();
			else
				string_473_ = string;
			int i_474_ = stream.readUnsignedShort();
			byte i_475_ = stream.readByte();
			boolean bool_476_ = false;
			if (-128 == i_475_)
				bool_476_ = true;
			if (bool_476_) {
				if (0 == -918987073 * Class269.anInt2880) {
					class106.currentPacket = null;
					return true;
				}
				boolean bool_477_ = false;
				int i_478_;
				for (i_478_ = 0; (i_478_ < -918987073 * Class269.anInt2880 && (!Class360_Sub1.aClass94Array10168[i_478_].aString1146.equals(string_473_) || 1225669601 * (Class360_Sub1.aClass94Array10168[i_478_].anInt1145) != i_474_)); i_478_++) {
					/* empty */
				}
				if (i_478_ < Class269.anInt2880 * -918987073) {
					for (/**/; i_478_ < -918987073 * Class269.anInt2880 - 1; i_478_++)
						Class360_Sub1.aClass94Array10168[i_478_] = Class360_Sub1.aClass94Array10168[i_478_ + 1];
					Class269.anInt2880 -= 1093210431;
					Class360_Sub1.aClass94Array10168[(Class269.anInt2880 * -918987073)] = null;
				}
			} else {
				String string_479_ = stream.readString();
				Class94 class94 = new Class94();
				class94.aString1143 = string;
				class94.aString1146 = string_473_;
				class94.aString1144 = Class473.method5740(class94.aString1146, Class302.aClass74_3406, (byte) -68);
				class94.anInt1145 = 1991460897 * i_474_;
				class94.aByte1147 = i_475_;
				class94.aString1142 = string_479_;
				int i_480_;
				for (i_480_ = Class269.anInt2880 * -918987073 - 1; i_480_ >= 0; i_480_--) {
					int i_481_ = Class360_Sub1.aClass94Array10168[i_480_].aString1144.compareTo(class94.aString1144);
					if (i_481_ == 0) {
						Class360_Sub1.aClass94Array10168[i_480_].anInt1145 = 1991460897 * i_474_;
						Class360_Sub1.aClass94Array10168[i_480_].aByte1147 = i_475_;
						Class360_Sub1.aClass94Array10168[i_480_].aString1142 = string_479_;
						if (string_473_.equals(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.username))
							Class446.aByte4903 = i_475_;
						client.anInt11232 = client.anInt11215 * -2101414481;
						class106.currentPacket = null;
						return true;
					}
					if (i_481_ < 0)
						break;
				}
				if (-918987073 * Class269.anInt2880 >= Class360_Sub1.aClass94Array10168.length) {
					class106.currentPacket = null;
					return true;
				}
				for (int i_482_ = Class269.anInt2880 * -918987073 - 1; i_482_ > i_480_; i_482_--)
					Class360_Sub1.aClass94Array10168[i_482_ + 1] = Class360_Sub1.aClass94Array10168[i_482_];
				if (0 == -918987073 * Class269.anInt2880)
					Class360_Sub1.aClass94Array10168 = new Class94[100];
				Class360_Sub1.aClass94Array10168[i_480_ + 1] = class94;
				Class269.anInt2880 += 1093210431;
				if (string_473_.equals(Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.username))
					Class446.aByte4903 = i_475_;
			}
			client.anInt11232 = -2101414481 * client.anInt11215;
			class106.currentPacket = null;
			return true;
		}
		Class81.method1165(new StringBuilder().append(null != class106.currentPacket ? -798865899 * class106.currentPacket.id : -1).append(Class40.aString491).append(null != class106.aClass422_1271 ? class106.aClass422_1271.id * -798865899 : -1).append(Class40.aString491).append(null != class106.aClass422_1274 ? class106.aClass422_1274.id * -798865899 : -1).append(" ").append(610303591 * class106.anInt1262).toString(), new RuntimeException(), (byte) 0);
		Class275.method3737(false, -1076358841);
		return true;
	}
	
	static final void decodeChunkSceneSubPacket(ChunkSceneSubPackets packet, byte i) {
		RSBitBuffer stream = client.aClass106_11322.byteBuffer;
		if (!RS3Applet.IDENTIFIED_SUB.contains(packet))
			System.out.println("Sub packet: " + packet.id);
		if (ChunkSceneSubPackets.ADD_GROUND_ITEM == packet) {
			int i_16_ = stream.readUnsignedShortLE128();
			int i_17_ = stream.readUnsignedByte128();
			Class598 class598 = client.aClass515_11066.method6255(-1418022307);
			int i_18_ = (i_17_ & 0x7) + 1895190105 * Class618.sceneY;
			int i_19_ = 1479112045 * class598.anInt7840 + i_18_;
			int i_20_ = 421791005 * Class302.sceneX + (i_17_ >> 4 & 0x7);
			int i_21_ = 1858049507 * class598.anInt7839 + i_20_;
			int i_22_ = stream.readUnsignedShort();
			boolean bool = (i_20_ >= 0 && i_18_ >= 0 && i_20_ < client.aClass515_11066.method6321((byte) 27) && i_18_ < client.aClass515_11066.method6243(177401017));
			if (bool || client.aClass515_11066.method6315(-953606533).method6015((short) -8192)) {
				Class596.method7137(-502818839 * Class512.scenePlane, i_21_, i_19_, new Class536_Sub6(i_16_, i_22_), -392431989);
				if (bool)
					Class52.method934(-502818839 * Class512.scenePlane, i_20_, i_18_, (byte) -78);
			}
		} else if (packet == ChunkSceneSubPackets.aClass409_4318) {
			int i_23_ = stream.readIntV2();
			int i_24_ = stream.readUnsigned128Byte();
			int i_25_ = (i_24_ >> 4 & 0x7) + 421791005 * Class302.sceneX;
			int i_26_ = (i_24_ & 0x7) + 1895190105 * Class618.sceneY;
			int i_27_ = stream.readUnsigned128Byte();
			int i_28_ = stream.readUnsignedByte();
			int i_29_ = i_28_ >> 2;
			int i_30_ = i_28_ & 0x3;
			int i_31_ = client.anIntArray11315[i_29_];
			if (client.aClass515_11066.method6315(-1448576844) != Class498.aClass498_5556)
				Class400.method4919(Class512.scenePlane * -502818839, i_25_, i_26_, i_31_, i_29_, i_30_, i_23_, i_27_, -1602183746);
		} else if (ChunkSceneSubPackets.aClass409_4309 == packet) {
			int i_32_ = stream.readUnsigned128Byte();
			int i_33_ = stream.readUnsignedByte128();
			int i_34_ = 421791005 * Class302.sceneX + (i_33_ >> 4 & 0x7);
			int i_35_ = (i_33_ & 0x7) + Class618.sceneY * 1895190105;
			int i_36_ = stream.readIntV2();
			int i_37_ = stream.readUnsigned128Byte();
			int i_38_ = i_37_ >> 2;
			int i_39_ = client.anIntArray11315[i_38_];
			if (i_38_ == -723459231 * Class606.aClass606_7894.anInt7878)
				i_38_ = Class606.aClass606_7880.anInt7878 * -723459231;
			if (1 == (i_32_ & 0x1))
				Class264.method3679(-502818839 * Class512.scenePlane, i_34_, i_35_, i_39_, i_36_, i_38_, null, -102911269);
			else {
				int[] is = null;
				if (2 == (i_32_ & 0x2)) {
					int i_40_ = stream.readUnsignedByte();
					is = new int[i_40_];
					for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
						is[i_41_] = stream.readInt();
				}
				short[] is_42_ = null;
				if ((i_32_ & 0x4) == 4) {
					int i_43_ = stream.readUnsignedByte();
					is_42_ = new short[i_43_];
					for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
						is_42_[i_44_] = (short) stream.readUnsignedShort();
				}
				short[] is_45_ = null;
				if ((i_32_ & 0x8) == 8) {
					int i_46_ = stream.readUnsignedByte();
					is_45_ = new short[i_46_];
					for (int i_47_ = 0; i_47_ < i_46_; i_47_++)
						is_45_[i_47_] = (short) stream.readUnsignedShort();
				}
				Class264.method3679(-502818839 * Class512.scenePlane, i_34_, i_35_, i_39_, i_36_, i_38_, new Class590((Class536_Sub2.aLong10316 * -4076442633492019353L), is, is_42_, is_45_), 1994564570);
				Class536_Sub2.aLong10316 += 5134328676184089687L;
			}
		} else if (ChunkSceneSubPackets.GRAPHICS_ON_TILE == packet) {
			int i_48_ = stream.readUnsignedByte();
			int i_49_ = 421791005 * Class302.sceneX + (i_48_ >> 4 & 0x7);
			int i_50_ = 1895190105 * Class618.sceneY + (i_48_ & 0x7);
			int i_51_ = stream.readUnsignedShort();
			if (65535 == i_51_)
				i_51_ = -1;
			int i_52_ = stream.readUnsignedShort();
			int i_53_ = stream.readUnsignedShort();
			int i_54_ = stream.readUnsignedByte();
			int i_55_ = stream.readShort((byte) -82);
			if (client.aClass515_11066.method6315(-1071773999) != Class498.aClass498_5556) {
				if (i_49_ >= 0 && i_50_ >= 0 && i_49_ < client.aClass515_11066.method6321((byte) 85) && i_50_ < client.aClass515_11066.method6243(177401017)) {
					if (-1 == i_51_) {
						Class536_Sub18_Sub4 class536_sub18_sub4 = ((Class536_Sub18_Sub4) client.aClass4_11175.method556((long) (i_49_ << 16 | i_50_)));
						if (null != class536_sub18_sub4) {
							class536_sub18_sub4.aClass649_Sub1_Sub5_Sub4_11619.method11026(-159343355);
							class536_sub18_sub4.method6484(-923136991);
						}
					} else {
						int i_56_ = i_49_ * 512 + 256;
						int i_57_ = 256 + 512 * i_50_;
						int i_58_ = -502818839 * Class512.scenePlane;
						if (i_58_ < 3 && client.aClass515_11066.method6251(-1253408630).method5466(i_49_, i_50_, (byte) -18))
							i_58_++;
						Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = (new Class649_Sub1_Sub5_Sub4(client.aClass515_11066.method6249(1294293394), i_51_, i_53_, Class512.scenePlane * -502818839, i_58_, i_56_, Class54.method944(i_56_, i_57_, (-502818839 * Class512.scenePlane), 2113184014) - i_52_, i_57_, i_49_, i_49_, i_50_, i_50_, i_54_, false, i_55_));
						client.aClass4_11175.method560(new Class536_Sub18_Sub4(class649_sub1_sub5_sub4), (long) (i_49_ << 16 | i_50_));
					}
				}
			}
		} else if (ChunkSceneSubPackets.aClass409_4321 == packet) {
			int i_59_ = stream.readInt();
			int i_60_ = stream.readUnsignedByte();
			((Class612) client.aClass515_11066.method6280(-1073841494).method70(i_59_, (byte) 92)).method7286(i_60_, 900619132);
		} else if (ChunkSceneSubPackets.aClass409_4308 == packet) {
			int i_61_ = stream.readUnsignedShort128();
			int i_62_ = stream.readUnsignedShortLE();
			int i_63_ = stream.readUnsignedByteC();
			Class598 class598 = client.aClass515_11066.method6255(-1484901764);
			int i_64_ = (i_63_ & 0x7) + 1895190105 * Class618.sceneY;
			int i_65_ = class598.anInt7840 * 1479112045 + i_64_;
			int i_66_ = (i_63_ >> 4 & 0x7) + 421791005 * Class302.sceneX;
			int i_67_ = class598.anInt7839 * 1858049507 + i_66_;
			int i_68_ = stream.readUnsignedShortLE();
			if (i_61_ != client.anInt11156 * -1791435655) {
				boolean bool = (i_66_ >= 0 && i_64_ >= 0 && i_66_ < client.aClass515_11066.method6321((byte) 77) && (i_64_ < client.aClass515_11066.method6243(177401017)));
				if (bool || client.aClass515_11066.method6315(-1959926438).method6015((short) -8192)) {
					Class596.method7137(Class512.scenePlane * -502818839, i_67_, i_65_, new Class536_Sub6(i_68_, i_62_), -392431989);
					if (bool)
						Class52.method934(Class512.scenePlane * -502818839, i_66_, i_64_, (byte) -110);
				}
			}
		} else if (ChunkSceneSubPackets.REMOVE_GAME_OBJECT == packet) {
			int i_69_ = stream.readUnsignedByteC();
			int i_70_ = i_69_ >> 2;
			int i_71_ = i_69_ & 0x3;
			int i_72_ = client.anIntArray11315[i_70_];
			int i_73_ = stream.readUnsignedByte();
			int i_74_ = Class302.sceneX * 421791005 + (i_73_ >> 4 & 0x7);
			int i_75_ = (i_73_ & 0x7) + 1895190105 * Class618.sceneY;
			if (client.aClass515_11066.method6315(-1909423582).method6015((short) -8192) || (i_74_ >= 0 && i_75_ >= 0 && i_74_ < client.aClass515_11066.method6321((byte) -92) && i_75_ < client.aClass515_11066.method6243(177401017)))
				ChunkSceneSubPackets.method4972(-502818839 * Class512.scenePlane, i_74_, i_75_, i_72_, -1, i_70_, i_71_, (byte) 95);
		} else if (packet == ChunkSceneSubPackets.REMOVE_GROUND_ITEM) {
			int i_76_ = stream.readUnsignedShort128();
			int i_77_ = stream.readUnsignedByte128();
			Class598 class598 = client.aClass515_11066.method6255(-1445300354);
			int i_78_ = Class618.sceneY * 1895190105 + (i_77_ & 0x7);
			int i_79_ = i_78_ + class598.anInt7840 * 1479112045;
			int i_80_ = 421791005 * Class302.sceneX + (i_77_ >> 4 & 0x7);
			int i_81_ = i_80_ + 1858049507 * class598.anInt7839;
			Class536_Sub9 class536_sub9 = ((Class536_Sub9) (client.aClass4_11170.method556((long) (-502818839 * Class512.scenePlane << 28 | i_79_ << 14 | i_81_))));
			if (class536_sub9 != null) {
				for (Class536_Sub6 class536_sub6 = (Class536_Sub6) class536_sub9.aClass708_10433.method8308(1867269829); class536_sub6 != null; class536_sub6 = (Class536_Sub6) class536_sub9.aClass708_10433.method8311(1901753527)) {
					if (i_76_ == 1696543099 * class536_sub6.anInt10419) {
						class536_sub6.method6484(243529464);
						break;
					}
				}
				if (class536_sub9.aClass708_10433.method8313(-1448201937))
					class536_sub9.method6484(-196483931);
				if (i_80_ >= 0 && i_78_ >= 0 && i_80_ < client.aClass515_11066.method6321((byte) 21) && i_78_ < client.aClass515_11066.method6243(177401017))
					Class52.method934(-502818839 * Class512.scenePlane, i_80_, i_78_, (byte) -61);
			}
		} else if (packet == ChunkSceneSubPackets.aClass409_4319) {
			stream.readUnsignedByte();
			int i_82_ = stream.readUnsignedByte();
			int i_83_ = Class302.sceneX * 421791005 + (i_82_ >> 4 & 0x7);
			int i_84_ = (i_82_ & 0x7) + Class618.sceneY * 1895190105;
			int i_85_ = stream.readUnsignedShort();
			int i_86_ = stream.readUnsignedByte();
			int i_87_ = stream.read24BitUnsignedInteger(2015090931);
			String string = stream.readString();
			if (client.aClass515_11066.method6315(95863962) != Class498.aClass498_5556)
				Class21.method707(-502818839 * Class512.scenePlane, i_83_, i_84_, i_86_, i_85_, i_87_, string, 217843226);
		} else if (ChunkSceneSubPackets.aClass409_4312 == packet) {
			int i_88_ = stream.readUnsignedByte();
			Class598 class598 = client.aClass515_11066.method6255(-1813779402);
			int i_89_ = 1895190105 * Class618.sceneY + (i_88_ & 0x7);
			int i_90_ = i_89_ + class598.anInt7840 * 1479112045;
			int i_91_ = 421791005 * Class302.sceneX + (i_88_ >> 4 & 0x7);
			int i_92_ = i_91_ + class598.anInt7839 * 1858049507;
			int i_93_ = stream.readUnsignedShort();
			int i_94_ = stream.readUnsignedShort();
			int i_95_ = stream.readUnsignedShort();
			if (client.aClass4_11170 != null) {
				Class536_Sub9 class536_sub9 = ((Class536_Sub9) (client.aClass4_11170.method556((long) (Class512.scenePlane * -502818839 << 28 | i_90_ << 14 | i_92_))));
				if (class536_sub9 != null) {
					for (Class536_Sub6 class536_sub6 = (Class536_Sub6) class536_sub9.aClass708_10433.method8308(1867269829); class536_sub6 != null; class536_sub6 = (Class536_Sub6) class536_sub9.aClass708_10433.method8311(2055739184)) {
						if (1696543099 * class536_sub6.anInt10419 == i_93_ && (1740996619 * class536_sub6.anInt10420 == i_94_)) {
							class536_sub6.method6484(-713187355);
							class536_sub6.anInt10420 = i_95_ * -23262301;
							Class596.method7137((-502818839 * Class512.scenePlane), i_92_, i_90_, class536_sub6, -392431989);
							break;
						}
					}
					if (i_91_ >= 0 && i_89_ >= 0 && (i_91_ < client.aClass515_11066.method6321((byte) -10)) && (i_89_ < client.aClass515_11066.method6243(177401017)))
						Class52.method934(-502818839 * Class512.scenePlane, i_91_, i_89_, (byte) -33);
				}
			}
		} else if (ChunkSceneSubPackets.aClass409_4317 == packet) {
			int i_96_ = stream.readUnsignedByte();
			int i_97_ = Class302.sceneX * 421791005 + (i_96_ >> 4 & 0x7);
			int i_98_ = 1895190105 * Class618.sceneY + (i_96_ & 0x7);
			int i_99_ = stream.readUnsignedShort();
			if (i_99_ == 65535)
				i_99_ = -1;
			int i_100_ = stream.readUnsignedByte();
			int i_101_ = i_100_ >> 4 & 0xf;
			int i_102_ = i_100_ & 0x7;
			int i_103_ = stream.readUnsignedByte();
			int i_104_ = stream.readUnsignedByte();
			int i_105_ = stream.readUnsignedShort();
			boolean bool = stream.readUnsignedByte() == 1;
			/*
			 * Sent during goblin raids:
			 * Sub packet 4: 2, 3, 19739, 6, 1, 253, false
				Sub packet: 4
				Sub packet 4: 0, 7, 19739, 6, 1, 233, false
				Sub packet: 4
				Sub packet 4: 0, 0, 19740, 6, 1, 263, false
				Sub packet: 4
				Sub packet 4: 6, 5, 19742, 6, 1, 231, false
			 */
			//System.out.println("Sub packet 4: " + (i_96_ >> 4 & 0x7) + ", " + (i_96_ & 0x7) + ", " + i_99_ + ", " + i_101_ + ", " + i_102_ + ", " + i_105_ + ", " + bool);
			if (client.aClass515_11066.method6315(-1134055537) != Class498.aClass498_5556) {
				if (i_97_ >= 0 && i_98_ >= 0 && i_97_ < client.aClass515_11066.method6321((byte) -78) && i_98_ < client.aClass515_11066.method6243(177401017)) {
					int i_106_ = i_101_ + 1;
					if ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0]) >= i_97_ - i_106_ && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0]) <= i_97_ + i_106_ && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0]) >= i_98_ - i_106_ && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0]) <= i_106_ + i_98_) {
						Class436 class436 = new Class436((float) (i_97_ << 9), 0.0F, (float) (i_98_ << 9));
						int i_107_ = Class512.scenePlane * -502818839;
						int i_108_ = (bool ? Class188.aClass188_2129.method2788(-1313244031) : Class188.aClass188_2133.method2788(-846887302));
						Class184_Sub2.aClass211_9442.method3030(Class198.aClass198_2212, i_99_, i_102_, i_104_, i_108_, Class207.aClass207_2240, 0.0F, (float) (i_101_ << 9), class436, i_107_, i_105_, i_103_, (byte) 62);
					}
				}
			}
		} else if (packet == ChunkSceneSubPackets.aClass409_4307) {
			int i_109_ = stream.readUnsignedByte();
			int i_110_ = (i_109_ >> 4 & 0xf) + 843582010 * Class302.sceneX;
			int i_111_ = (i_109_ & 0xf) + Class618.sceneY * -504587086;
			int i_112_ = stream.readUnsignedByte();
			boolean bool = (i_112_ & 0x1) != 0;
			boolean bool_113_ = 0 != (i_112_ & 0x2);
			int i_114_ = bool_113_ ? i_112_ >> 2 : -1;
			int i_115_ = i_110_ + stream.readByte();
			int i_116_ = i_111_ + stream.readByte();
			int i_117_ = stream.readShort((byte) -104);
			int i_118_ = stream.readShort((byte) -110);
			int i_119_ = stream.readUnsignedShort();
			int i_120_ = stream.readUnsignedByte();
			if (bool_113_)
				i_120_ = (byte) i_120_;
			else
				i_120_ *= 4;
			int i_121_ = stream.readUnsignedByte() * 4;
			int i_122_ = stream.readUnsignedShort();
			int i_123_ = stream.readUnsignedShort();
			int i_124_ = stream.readUnsignedByte();
			int i_125_ = stream.readUnsignedShort();
			if (255 == i_124_)
				i_124_ = -1;
			int i_126_ = stream.readShort((byte) -2);
			if (client.aClass515_11066.method6315(-1952299188) != Class498.aClass498_5556) {
				if (i_110_ >= 0 && i_111_ >= 0 && (i_110_ < client.aClass515_11066.method6321((byte) 24) * 2) && (i_111_ < client.aClass515_11066.method6321((byte) 56) * 2) && i_115_ >= 0 && i_116_ >= 0 && (i_115_ < client.aClass515_11066.method6243(177401017) * 2) && (i_116_ < client.aClass515_11066.method6243(177401017) * 2) && 65535 != i_119_) {
					i_110_ = 256 * i_110_;
					i_111_ *= 256;
					i_115_ = 256 * i_115_;
					i_116_ = 256 * i_116_;
					i_120_ <<= 2;
					i_121_ <<= 2;
					i_125_ <<= 2;
					Class677.method8053(i_119_, i_117_, i_118_, i_114_, i_120_, i_121_, i_110_, i_111_, i_115_, i_116_, i_122_, i_123_, i_124_, i_125_, bool, i_126_, (byte) 15);
				}
			}
		} else if (ChunkSceneSubPackets.ADD_GAME_OBJECT == packet) {
			int i_127_ = stream.readUnsigned128Byte();
			int i_128_ = i_127_ >> 2;
			int i_129_ = i_127_ & 0x3;
			int i_130_ = client.anIntArray11315[i_128_];
			int i_131_ = stream.readUnsignedByte128();
			int i_132_ = Class302.sceneX * 421791005 + (i_131_ >> 4 & 0x7);
			int i_133_ = (i_131_ & 0x7) + Class618.sceneY * 1895190105;
			int i_134_ = stream.readLEInt();
			if (client.aClass515_11066.method6315(-434956694).method6015((short) -8192) || (i_132_ >= 0 && i_133_ >= 0 && i_132_ < client.aClass515_11066.method6321((byte) 48) && i_133_ < client.aClass515_11066.method6243(177401017)))
				ChunkSceneSubPackets.method4972(Class512.scenePlane * -502818839, i_132_, i_133_, i_130_, i_134_, i_128_, i_129_, (byte) 35);
		} else if (packet == ChunkSceneSubPackets.PROJECTILE) {
			int i_135_ = stream.readUnsignedByte();
			boolean bool = 0 != (i_135_ & 0x80);
			int i_136_ = 421791005 * Class302.sceneX + (i_135_ >> 3 & 0x7);
			int i_137_ = 1895190105 * Class618.sceneY + (i_135_ & 0x7);
			int i_138_ = i_136_ + stream.readByte();
			int i_139_ = i_137_ + stream.readByte();
			int i_140_ = stream.readShort((byte) -74);
			int i_141_ = stream.readUnsignedShort();
			int i_142_ = stream.readUnsignedByte() * 4;
			int i_143_ = stream.readUnsignedByte() * 4;
			int i_144_ = stream.readUnsignedShort();
			int i_145_ = stream.readUnsignedShort();
			int i_146_ = stream.readUnsignedByte();
			int i_147_ = stream.readUnsignedShort();
			int i_148_ = stream.readShort((byte) -123);
			if (i_146_ == 255)
				i_146_ = -1;
			if (client.aClass515_11066.method6315(-536838864) != Class498.aClass498_5556) {
				if (i_136_ >= 0 && i_137_ >= 0 && i_136_ < client.aClass515_11066.method6321((byte) -61) && i_137_ < client.aClass515_11066.method6243(177401017) && i_138_ >= 0 && i_139_ >= 0 && i_138_ < client.aClass515_11066.method6321((byte) -3) && i_139_ < client.aClass515_11066.method6243(177401017) && 65535 != i_141_) {
					i_136_ = i_136_ * 512 + 256;
					i_137_ = 256 + 512 * i_137_;
					i_138_ = 512 * i_138_ + 256;
					i_139_ = 256 + i_139_ * 512;
					i_142_ <<= 2;
					i_143_ <<= 2;
					i_147_ <<= 2;
					Class649_Sub1_Sub5_Sub6 class649_sub1_sub5_sub6 = (new Class649_Sub1_Sub5_Sub6(client.aClass515_11066.method6249(1750155094), i_141_, -502818839 * Class512.scenePlane, Class512.scenePlane * -502818839, i_136_, i_137_, i_142_, i_144_ + client.cycles, i_145_ + client.cycles, i_146_, i_147_, 0, i_140_, i_143_, bool, -1, i_148_));
					class649_sub1_sub5_sub6.method11046(i_138_, i_139_, Class54.method944(i_138_, i_139_, -502818839 * Class512.scenePlane, 1964353183) - i_143_, i_144_ + client.cycles, -1418067352);
					client.aClass708_11174.method8335(new Class536_Sub18_Sub8(class649_sub1_sub5_sub6), 276931999);
				}
			}
		} else if (packet == ChunkSceneSubPackets.GROUND_GRAPHIC_RELATED) {
			int i_149_ = stream.readUnsignedByte();
			int i_150_ = (i_149_ >> 4 & 0x7) + 421791005 * Class302.sceneX;
			int i_151_ = (i_149_ & 0x7) + 1895190105 * Class618.sceneY;
			int i_152_ = stream.readUnsignedShort();
			if (i_152_ == 65535)
				i_152_ = -1;
			int i_153_ = stream.readUnsignedByte();
			int i_154_ = i_153_ >> 4 & 0xf;
			int i_155_ = i_153_ & 0x7;
			int i_156_ = stream.readUnsignedByte();
			int i_157_ = stream.readUnsignedByte();
			int i_158_ = stream.readUnsignedShort();
			if (client.aClass515_11066.method6315(595421904) != Class498.aClass498_5556) {
				if (i_150_ >= 0 && i_151_ >= 0 && i_150_ < client.aClass515_11066.method6321((byte) -16) && i_151_ < client.aClass515_11066.method6243(177401017)) {
					int i_159_ = 1 + i_154_;
					if ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0]) >= i_150_ - i_159_ && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0]) <= i_159_ + i_150_ && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0]) >= i_151_ - i_159_ && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0]) <= i_151_ + i_159_) {
						Class436 class436 = new Class436((float) (i_150_ << 9), 0.0F, (float) (i_151_ << 9));
						int i_160_ = -502818839 * Class512.scenePlane;
						Class184_Sub2.aClass211_9442.method3030(Class198.aClass198_2212, i_152_, i_155_, i_157_, Class188.aClass188_2133.method2788(-2001243474), Class207.aClass207_2240, 0.0F, (float) (i_154_ << 9), class436, i_160_, i_158_, i_156_, (byte) 74);
					}
				}
			}
		} else {
			Class81.method1165(new StringBuilder().append("").append(packet).toString(), new RuntimeException(), (byte) -30);
			Class275.method3737(false, -1166406040);
		}
	}
}
