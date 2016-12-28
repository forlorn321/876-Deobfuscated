/* Class536_Sub24_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class RemoveMemberSetting extends ChangeClanSettings {
	Class353 this$0;
	int memberIndex;

	void decodeSetting(RSByteBuffer buffer) {
		memberIndex = buffer.readUnsignedShort() * 1289097625;
		buffer.readUnsignedByte();
		if (buffer.readUnsignedByte() != 255) {
			buffer.off -= 516175515;
			buffer.readLong();
		}
	}

	void applySetting(Clan clan) {
		clan.removeMember(memberIndex * 759345833);
	}

	RemoveMemberSetting(Class353 class353) {
		this$0 = class353;
		memberIndex = -1289097625;
	}

	static final void method10697(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		long l = (long) class668.anIntArray8541[class668.anInt8542 * 1867269829];
		long l_0_ = (long) (class668.anIntArray8541[1 + 1867269829 * class668.anInt8542]);
		long l_1_ = (long) (class668.anIntArray8541[2 + class668.anInt8542 * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (int) (l * l_1_ / l_0_);
	}
}
