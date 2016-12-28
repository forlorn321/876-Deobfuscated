/* Class536_Sub24_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class EditMemberSetting extends ChangeClanSettings {
	int worldId;
	byte rank;
	Class353 this$0;
	String username;
	int memberIndex;

	void applySetting(Clan clan) {
		ClanMember member = clan.members[-1351981507 * memberIndex];
		member.rank = rank;
		member.worldId = worldId * 1620532229;
		member.username = username;
	}

	void decodeSetting(RSByteBuffer buffer) {
		memberIndex = buffer.readUnsignedShort() * 716366101;
		rank = buffer.readByte();
		worldId = buffer.readUnsignedShort() * 1645906271;
		buffer.readLong();
		username = buffer.readString();
	}

	EditMemberSetting(Class353 class353) {
		this$0 = class353;
		memberIndex = -716366101;
	}
}
