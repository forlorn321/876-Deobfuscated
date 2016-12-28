/* Class536_Sub24_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub24_Sub3 extends ChangeClanSettings {
	byte rank;
	int memberIndex;
	int worldId;
	String username;
	Class353 this$0;

	void applySetting(Clan clan) {
		ClanMember member = clan.members[-809902909 * memberIndex];
		member.rank = rank;
		member.worldId = 315310617 * worldId;
		member.username = username;
	}

	void decodeSetting(RSByteBuffer buffer) {
		buffer.readUnsignedByte();
		memberIndex = buffer.readUnsignedShort() * -1065176085;
		rank = buffer.readByte();
		worldId = buffer.readUnsignedShort() * 2025890579;
		buffer.readLong();
		username = buffer.readString();
		buffer.readUnsignedByte();
	}

	Class536_Sub24_Sub3(Class353 class353) {
		this$0 = class353;
		memberIndex = 1065176085;
	}
}
