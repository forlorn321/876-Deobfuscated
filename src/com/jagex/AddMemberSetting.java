/* Class536_Sub24_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class AddMemberSetting extends ChangeClanSettings {
	String uernmae;
	byte rank;
	int worldId;

	AddMemberSetting(Class353 class353) {
		uernmae = null;
	}

	void applySetting(Clan clan) {
		ClanMember member = new ClanMember();
		member.username = uernmae;
		member.worldId = worldId * -1069994167;
		member.rank = rank;
		clan.addMember(member);
	}

	void decodeSetting(RSByteBuffer buffer) {
		if (buffer.readUnsignedByte() != 255) {
			buffer.off -= 516175515;
			buffer.readLong();
		}
		uernmae = buffer.method9713(16509697);
		worldId = buffer.readUnsignedShort() * -1078125309;
		rank = buffer.readByte();
		buffer.readLong();
	}
}
