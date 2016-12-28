/* Class536_Sub24_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class ChangesMajorSettings extends ChangeClanSettings {
	byte talkRank;
	byte kickRank;
	Class353 this$0;
	String name;

	void decodeSetting(RSByteBuffer class536_sub33) {
		name = class536_sub33.method9713(16509697);
		if (name != null) {
			class536_sub33.readUnsignedByte();
			talkRank = class536_sub33.readByte();
			kickRank = class536_sub33.readByte();
		}
	}

	void applySetting(Clan clan) {
		clan.name = name;
		if (null != name) {
			clan.talkRank = talkRank;
			clan.kickRank = kickRank;
		}
	}

	ChangesMajorSettings(Class353 class353) {
		this$0 = class353;
	}

	static final void method10698(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3241(-966822854);
	}
}
