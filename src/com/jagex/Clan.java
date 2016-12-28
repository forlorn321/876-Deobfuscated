/* Class536_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.BitSet;

public class Clan extends Class536 {
	public ClanMember[] members;
	boolean aBool10480;
	boolean aBool10481 = true;
	public int anInt10482 = 0;
	int[] anIntArray10483;
	long aLong10484;
	public String name = null;
	public byte talkRank;
	public byte kickRank;
	public static Class184 aClass184_10488;

	void removeMember(int i) {
		anInt10482 -= -274940659;
		if (0 == anInt10482 * 1494047173)
			members = null;
		else
			System.arraycopy(members, i + 1, members, i, 1494047173 * anInt10482 - i);
		anIntArray10483 = null;
	}

	public Clan(RSByteBuffer class536_sub33) {
		method9515(class536_sub33, 1789404581);
	}

	void method9502(int i) {
		if (null != members)
			System.arraycopy(members, 0, members = new ClanMember[i], 0, 1494047173 * anInt10482);
		else
			members = new ClanMember[i];
	}

	void addMember(ClanMember class349) {
		if (null == members || 1494047173 * anInt10482 >= members.length)
			method9510(5 + 1494047173 * anInt10482, 1636536428);
		members[(anInt10482 += -274940659) * 1494047173 - 1] = class349;
		anIntArray10483 = null;
	}

	public int[] method9504(int i) {
		if (anIntArray10483 == null) {
			String[] strings = new String[1494047173 * anInt10482];
			anIntArray10483 = new int[1494047173 * anInt10482];
			for (int i_1_ = 0; i_1_ < anInt10482 * 1494047173; i_1_++) {
				strings[i_1_] = members[i_1_].username;
				anIntArray10483[i_1_] = i_1_;
			}
			Class205_Sub12.method9071(strings, anIntArray10483, 116935183);
		}
		return anIntArray10483;
	}

	void method9505(int i) {
		anInt10482 -= -274940659;
		if (0 == anInt10482 * 1494047173)
			members = null;
		else
			System.arraycopy(members, i + 1, members, i, 1494047173 * anInt10482 - i);
		anIntArray10483 = null;
	}

	void method9506(int i) {
		if (null != members)
			System.arraycopy(members, 0, members = new ClanMember[i], 0, 1494047173 * anInt10482);
		else
			members = new ClanMember[i];
	}

	static {
		new BitSet(65536);
	}

	void method9507(int i) {
		if (null != members)
			System.arraycopy(members, 0, members = new ClanMember[i], 0, 1494047173 * anInt10482);
		else
			members = new ClanMember[i];
	}

	void method9508(int i) {
		if (null != members)
			System.arraycopy(members, 0, members = new ClanMember[i], 0, 1494047173 * anInt10482);
		else
			members = new ClanMember[i];
	}

	void method9509(int i) {
		if (null != members)
			System.arraycopy(members, 0, members = new ClanMember[i], 0, 1494047173 * anInt10482);
		else
			members = new ClanMember[i];
	}

	void method9510(int i, int i_2_) {
		if (null != members)
			System.arraycopy(members, 0, members = new ClanMember[i], 0, 1494047173 * anInt10482);
		else
			members = new ClanMember[i];
	}

	public int method9511(String string, int i) {
		for (int i_3_ = 0; i_3_ < 1494047173 * anInt10482; i_3_++) {
			if (members[i_3_].username.equalsIgnoreCase(string))
				return i_3_;
		}
		return -1;
	}

	void method9512(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedByte();
		if ((i & 0x1) != 0)
			aBool10480 = true;
		if (0 != (i & 0x2))
			aBool10481 = true;
		int i_4_ = 2;
		if ((i & 0x4) != 0)
			i_4_ = class536_sub33.readUnsignedByte();
		aLong7133 = class536_sub33.readLong() * -6756113042487376355L;
		aLong10484 = class536_sub33.readLong() * -6958170873332875355L;
		name = class536_sub33.readString();
		class536_sub33.readUnsignedByte();
		kickRank = class536_sub33.readByte();
		talkRank = class536_sub33.readByte();
		anInt10482 = class536_sub33.readUnsignedShort() * -274940659;
		if (anInt10482 * 1494047173 > 0) {
			members = new ClanMember[1494047173 * anInt10482];
			for (int i_5_ = 0; i_5_ < 1494047173 * anInt10482; i_5_++) {
				ClanMember class349 = new ClanMember();
				if (aBool10480)
					class536_sub33.readLong();
				if (aBool10481)
					class349.username = class536_sub33.readString();
				class349.rank = class536_sub33.readByte();
				class349.worldId = class536_sub33.readUnsignedShort() * 451662555;
				if (i_4_ >= 3)
					class536_sub33.readUnsignedByte();
				members[i_5_] = class349;
			}
		}
	}

	void method9513(int i) {
		anInt10482 -= -274940659;
		if (0 == anInt10482 * 1494047173)
			members = null;
		else
			System.arraycopy(members, i + 1, members, i, 1494047173 * anInt10482 - i);
		anIntArray10483 = null;
	}

	void method9514(int i) {
		if (null != members)
			System.arraycopy(members, 0, members = new ClanMember[i], 0, 1494047173 * anInt10482);
		else
			members = new ClanMember[i];
	}

	void method9515(RSByteBuffer class536_sub33, int i) {
		int i_6_ = class536_sub33.readUnsignedByte();
		if ((i_6_ & 0x1) != 0)
			aBool10480 = true;
		if (0 != (i_6_ & 0x2))
			aBool10481 = true;
		int i_7_ = 2;
		if ((i_6_ & 0x4) != 0)
			i_7_ = class536_sub33.readUnsignedByte();
		aLong7133 = class536_sub33.readLong() * -6756113042487376355L;
		aLong10484 = class536_sub33.readLong() * -6958170873332875355L;
		name = class536_sub33.readString();
		class536_sub33.readUnsignedByte();
		kickRank = class536_sub33.readByte();
		talkRank = class536_sub33.readByte();
		anInt10482 = class536_sub33.readUnsignedShort() * -274940659;
		if (anInt10482 * 1494047173 > 0) {
			members = new ClanMember[1494047173 * anInt10482];
			for (int i_8_ = 0; i_8_ < 1494047173 * anInt10482; i_8_++) {
				ClanMember class349 = new ClanMember();
				if (aBool10480)
					class536_sub33.readLong();
				if (aBool10481)
					class349.username = class536_sub33.readString();
				class349.rank = class536_sub33.readByte();
				class349.worldId = class536_sub33.readUnsignedShort() * 451662555;
				if (i_7_ >= 3)
					class536_sub33.readUnsignedByte();
				members[i_8_] = class349;
			}
		}
	}

	void method9516(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedByte();
		if ((i & 0x1) != 0)
			aBool10480 = true;
		if (0 != (i & 0x2))
			aBool10481 = true;
		int i_9_ = 2;
		if ((i & 0x4) != 0)
			i_9_ = class536_sub33.readUnsignedByte();
		aLong7133 = class536_sub33.readLong() * -6756113042487376355L;
		aLong10484 = class536_sub33.readLong() * -6958170873332875355L;
		name = class536_sub33.readString();
		class536_sub33.readUnsignedByte();
		kickRank = class536_sub33.readByte();
		talkRank = class536_sub33.readByte();
		anInt10482 = class536_sub33.readUnsignedShort() * -274940659;
		if (anInt10482 * 1494047173 > 0) {
			members = new ClanMember[1494047173 * anInt10482];
			for (int i_10_ = 0; i_10_ < 1494047173 * anInt10482; i_10_++) {
				ClanMember class349 = new ClanMember();
				if (aBool10480)
					class536_sub33.readLong();
				if (aBool10481)
					class349.username = class536_sub33.readString();
				class349.rank = class536_sub33.readByte();
				class349.worldId = class536_sub33.readUnsignedShort() * 451662555;
				if (i_9_ >= 3)
					class536_sub33.readUnsignedByte();
				members[i_10_] = class349;
			}
		}
	}

	void method9517(RSByteBuffer class536_sub33) {
		int i = class536_sub33.readUnsignedByte();
		if ((i & 0x1) != 0)
			aBool10480 = true;
		if (0 != (i & 0x2))
			aBool10481 = true;
		int i_11_ = 2;
		if ((i & 0x4) != 0)
			i_11_ = class536_sub33.readUnsignedByte();
		aLong7133 = class536_sub33.readLong() * -6756113042487376355L;
		aLong10484 = class536_sub33.readLong() * -6958170873332875355L;
		name = class536_sub33.readString();
		class536_sub33.readUnsignedByte();
		kickRank = class536_sub33.readByte();
		talkRank = class536_sub33.readByte();
		anInt10482 = class536_sub33.readUnsignedShort() * -274940659;
		if (anInt10482 * 1494047173 > 0) {
			members = new ClanMember[1494047173 * anInt10482];
			for (int i_12_ = 0; i_12_ < 1494047173 * anInt10482; i_12_++) {
				ClanMember class349 = new ClanMember();
				if (aBool10480)
					class536_sub33.readLong();
				if (aBool10481)
					class349.username = class536_sub33.readString();
				class349.rank = class536_sub33.readByte();
				class349.worldId = class536_sub33.readUnsignedShort() * 451662555;
				if (i_11_ >= 3)
					class536_sub33.readUnsignedByte();
				members[i_12_] = class349;
			}
		}
	}

	static boolean method9518(int i) {
		return Class70.anInt760 * 1780207751 > 0;
	}
}
