/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class ReferenceTable {
	Class260 aClass260_5325;
	int[][] fileNameHashes;
	int[] nameHashes;
	int validArchivesCount;
	int[] validArchiveIds;
	byte[] aByteArray5331;
	int[] anIntArray5332;
	int archiveSize;
	int[] crcs;
	Class260[] aClass260Array5335;
	byte[][] whirlpools;
	int[] anIntArray5337;
	int[] anIntArray5338;
	int[] anIntArray5339;
	int[] validFileIds;
	int[][] files;
	int anInt5342;
	int revision;
	int[] fileSizes;

	void decodeHeader(byte[] data) {
		RSByteBuffer buffer = new RSByteBuffer(Class469.method5700(data));
		int protocol = buffer.readUnsignedByte();
		if (protocol < 5 || protocol > 7)
			throw new RuntimeException();
		if (protocol >= 6)
			revision = buffer.readInt() * -1621242877;
		else
			revision = 0;
		int hash = buffer.readUnsignedByte();
		boolean named = 0 != (hash & 0x1);
		boolean usesWhirlpool = 0 != (hash & 0x2);
		boolean bitflag4 = (hash & 0x4) != 0;
		boolean bitflag8 = 0 != (hash & 0x8);
		if (protocol >= 7)
			validArchivesCount = buffer.readSmart() * 1236280683;
		else
			validArchivesCount = buffer.readUnsignedShort() * 1236280683;
		int lastArchiveId = 0;
		int biggestArchiveId = -1;
		validArchiveIds = new int[1483398979 * validArchivesCount];
		if (protocol >= 7) {
			for (int index = 0; index < 1483398979 * validArchivesCount; index++) {
				validArchiveIds[index] = lastArchiveId += buffer.readSmart();
				if (validArchiveIds[index] > biggestArchiveId)
					biggestArchiveId = validArchiveIds[index];
			}
		} else {
			for (int index = 0; index < 1483398979 * validArchivesCount; index++) {
				validArchiveIds[index] = lastArchiveId += buffer.readUnsignedShort();
				if (validArchiveIds[index] > biggestArchiveId)
					biggestArchiveId = validArchiveIds[index];
			}
		}
		archiveSize = (biggestArchiveId + 1) * 1086459915;
		crcs = new int[archiveSize * 608172963];
		if (bitflag8)
			anIntArray5332 = new int[archiveSize * 608172963];
		if (usesWhirlpool)
			whirlpools = new byte[608172963 * archiveSize][];
		anIntArray5337 = new int[archiveSize * 608172963];
		validFileIds = new int[archiveSize * 608172963];
		files = new int[608172963 * archiveSize][];
		fileSizes = new int[archiveSize * 608172963];
		if (named) {
			nameHashes = new int[archiveSize * 608172963];
			for (int index = 0; index < 608172963 * archiveSize; index++)
				nameHashes[index] = -1;
			for (int index = 0; index < 1483398979 * validArchivesCount; index++)
				nameHashes[validArchiveIds[index]] = buffer.readInt();
			aClass260_5325 = new Class260(nameHashes);
		}
		for (int index = 0; index < 1483398979 * validArchivesCount; index++)
			crcs[validArchiveIds[index]] = buffer.readInt();
		if (bitflag8) {
			for (int index = 0; index < validArchivesCount * 1483398979; index++)
				anIntArray5332[index] = buffer.readInt();
		}
		if (usesWhirlpool) {
			for (int index = 0; index < 1483398979 * validArchivesCount; index++) {
				byte[] whirlpool = new byte[64];
				buffer.readToByteArray(whirlpool, 0, 64);
				whirlpools[validArchiveIds[index]] = whirlpool;
			}
		}
		if (bitflag4) {
			anIntArray5338 = new int[608172963 * archiveSize];
			anIntArray5339 = new int[archiveSize * 608172963];
			for (int index = 0; index < 1483398979 * validArchivesCount; index++) {
				anIntArray5338[validArchiveIds[index]] = buffer.readInt();
				anIntArray5339[validArchiveIds[index]] = buffer.readInt();
			}
		}
		for (int index = 0; index < validArchivesCount * 1483398979; index++)
			anIntArray5337[validArchiveIds[index]] = buffer.readInt();
		if (protocol >= 7) {
			for (int index = 0; index < 1483398979 * validArchivesCount; index++)
				validFileIds[validArchiveIds[index]] = buffer.readSmart();
			for (int index = 0; index < 1483398979 * validArchivesCount; index++) {
				int archiveId = validArchiveIds[index];
				int validFileSizes = validFileIds[archiveId];
				lastArchiveId = 0;
				int biggestFileId = -1;
				files[archiveId] = new int[validFileSizes];
				for (int i_94_ = 0; i_94_ < validFileSizes; i_94_++) {
					int fileId = (files[archiveId][i_94_] = lastArchiveId += buffer.readSmart());
					if (fileId > biggestFileId)
						biggestFileId = fileId;
				}
				fileSizes[archiveId] = 1 + biggestFileId;
				if (1 + biggestFileId == validFileSizes)
					files[archiveId] = null;
			}
		} else {
			for (int i_96_ = 0; i_96_ < validArchivesCount * 1483398979; i_96_++)
				validFileIds[validArchiveIds[i_96_]] = buffer.readUnsignedShort();
			for (int i_97_ = 0; i_97_ < validArchivesCount * 1483398979; i_97_++) {
				int i_98_ = validArchiveIds[i_97_];
				int i_99_ = validFileIds[i_98_];
				lastArchiveId = 0;
				int i_100_ = -1;
				files[i_98_] = new int[i_99_];
				for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
					int i_102_ = (files[i_98_][i_101_] = lastArchiveId += buffer.readUnsignedShort());
					if (i_102_ > i_100_)
						i_100_ = i_102_;
				}
				fileSizes[i_98_] = 1 + i_100_;
				if (i_100_ + 1 == i_99_)
					files[i_98_] = null;
			}
		}
		if (named) {
			fileNameHashes = new int[1 + biggestArchiveId][];
			aClass260Array5335 = new Class260[1 + biggestArchiveId];
			for (int index = 0; index < 1483398979 * validArchivesCount; index++) {
				int archiveId = validArchiveIds[index];
				int fileSize = validFileIds[archiveId];
				fileNameHashes[archiveId] = new int[fileSizes[archiveId]];
				for (int i_106_ = 0; i_106_ < fileSizes[archiveId]; i_106_++)
					fileNameHashes[archiveId][i_106_] = -1;
				for (int i_107_ = 0; i_107_ < fileSize; i_107_++) {
					int i_108_;
					if (null != files[archiveId])
						i_108_ = files[archiveId][i_107_];
					else
						i_108_ = i_107_;
					fileNameHashes[archiveId][i_108_] = buffer.readInt();
				}
				aClass260Array5335[archiveId] = new Class260(fileNameHashes[archiveId]);
			}
		}
	}

	ReferenceTable(byte[] is, int i, byte[] is_109_) {
		anInt5342 = Class536_Sub25.method9592(is, is.length, (byte) 0) * -247108067;
		if (i != 217760821 * anInt5342)
			throw new RuntimeException();
		if (is_109_ != null) {
			if (64 != is_109_.length)
				throw new RuntimeException();
			aByteArray5331 = Class601.method7165(is, 0, is.length, (byte) -82);
			for (int i_110_ = 0; i_110_ < 64; i_110_++) {
				if (aByteArray5331[i_110_] != is_109_[i_110_])
					throw new RuntimeException();
			}
		}
		decodeHeader(is);
	}

	static void method5689(Interface68 interface68, int i) {
		while (Class586.aLinkedList7708.size() > 10)
			Class586.aLinkedList7708.remove();
		Class586.aLinkedList7708.add(interface68);
	}

	public static Class595[] method5690(int i) {
		return (new Class595[] { Class595.aClass595_7819, Class595.aClass595_7820, Class595.aClass595_7818 });
	}

	public static NativeSprite method5691(byte i) {
		return Class575.aClass143_7676;
	}

	public static int method5692(String string, boolean bool, byte i) {
		string = string.toLowerCase();
		Class2.anIntArray96 = null;
		Class596.anInt7830 = 0;
		LinkedList linkedlist = new LinkedList();
		LinkedList linkedlist_111_ = new LinkedList();
		int i_112_ = bool ? 32768 : 0;
		int i_113_ = ((bool ? Class198.aClass32_2216.anInt280 * 1071910999 : -1089717185 * Class198.aClass32_2216.anInt279) + i_112_);
		for (int i_114_ = i_112_; i_114_ < i_113_; i_114_++) {
			Class536_Sub18_Sub10 class536_sub18_sub10 = Class198.aClass32_2216.method788(i_114_, (byte) 97);
			if (class536_sub18_sub10.aBool11721 && class536_sub18_sub10.method10713((byte) -47).toLowerCase().indexOf(string) != -1) {
				if (linkedlist.size() >= 50)
					return -1;
				linkedlist.add(Integer.valueOf(i_114_));
				linkedlist_111_.add(class536_sub18_sub10.method10713((byte) 32));
			}
		}
		Class2.anIntArray96 = new int[linkedlist.size()];
		int i_115_ = 0;
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			Class2.anIntArray96[i_115_++] = integer.intValue();
		}
		String[] strings = (String[]) linkedlist_111_.toArray(new String[Class2.anIntArray96.length]);
		Class205_Sub12.method9071(strings, Class2.anIntArray96, -806264141);
		return linkedlist.size();
	}

	static final void method5693(Class668 class668, int i) {
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) != 0);
		int i_116_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = Class650.method7859((long) i_116_, 0, bool, Class459.CLIENT_PARAMS, -1327360575);
	}

	static final void method5694(Class668 class668, int i) {
		class668.anInt8564 += (-1531084683 * class668.anIntArray8537[class668.anInt8564 * -1640738851]);
	}
}
