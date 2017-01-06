/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class110 {
	static Class507 aClass507_1377;

	Class110() throws Throwable {
		throw new Error();
	}

	static final void method1452(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class300.method4027(class251, class234, class668, (byte) 48);
	}

	static final void method1453(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class295.method3978(class251, class668, (byte) 47);
	}

	static final void method1454(Class668 class668, int i) {
		if (client.anInt11289 * -1484801557 == 0)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -2;
		else if (-1484801557 * client.anInt11289 == 1)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11288 * 142551095;
	}

	static final void method1455(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class73 class73 = (Class73) Class207.aClass34_Sub22_2244.method70(i_1_, (byte) 16);
		if (class73.method1128((byte) 76))
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = ((ObjTypeDecoder) client.aClass515_11066.method6280(-1073841494).method70(i_0_, (byte) 88)).method7291(i_1_, class73.aString805, -1938439974);
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((ObjTypeDecoder) client.aClass515_11066.method6280(-1073841494).method70(i_0_, (byte) -37)).method7290(i_1_, 1566477951 * class73.anInt803, 410724759));
	}

	public static void method1456(int type, String username, int i_2_) {
		int playerCount = Class95.PLAYERLIST_SIZE * -1482773169;
		int[] indices = Class95.PLAYERLIST_INDICES;
		boolean foundPlayer = false;
		for (int i = 0; i < playerCount; i++) {
			Player player = client.PLAYER_LIST[indices[i]];
			if (player != null && (player != Class565.MY_PLAYER) && player.username != null && player.username.equalsIgnoreCase(username)) {
				OutgoingPacket packetInfo = null;
				if (type == 1)
					packetInfo = OutgoingPacket.aClass414_4510;
				else if (type == 2)
					packetInfo = OutgoingPacket.aClass414_4470;
				else if (type == 3)
					packetInfo = OutgoingPacket.aClass414_4445;
				else if (type == 4)
					packetInfo = OutgoingPacket.aClass414_4495;
				else if (5 == type)
					packetInfo = OutgoingPacket.aClass414_4416;
				else if (type == 6)
					packetInfo = OutgoingPacket.aClass414_4469;
				else if (7 == type)
					packetInfo = OutgoingPacket.aClass414_4409;
				else if (8 == type)
					packetInfo = OutgoingPacket.aClass414_4474;
				else if (type == 9)
					packetInfo = OutgoingPacket.aClass414_4480;
				else if (10 == type)
					packetInfo = OutgoingPacket.aClass414_4422;
				if (null != packetInfo) {
					OutgoingPacketContainer packet = Class213.createOutgoingPacket(packetInfo, (client.aClass106_11322.aClass15_1258), 1097761268);
					packet.stream.write128Short(indices[i]);
					packet.stream.writeByte128(0);
					client.aClass106_11322.writePacket(packet, -147770641);
				}
				foundPlayer = true;
				break;
			}
		}
		if (!foundPlayer)
			Class173_Sub1.method8634(4, new StringBuilder().append(Class38.aClass38_431.method840(Class459.CLIENT_PARAMS, 1958934299)).append(username).toString(), -1101290493);
	}
}
