/* Class467 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class ReferenceTable {
	Class260 aClass260_5325;
	int[][] anIntArrayArray5327;
	int[] anIntArray5328;
	int anInt5329;
	int[] anIntArray5330;
	byte[] aByteArray5331;
	int[] anIntArray5332;
	int anInt5333;
	int[] anIntArray5334;
	Class260[] aClass260Array5335;
	byte[][] aByteArrayArray5336;
	int[] anIntArray5337;
	int[] anIntArray5338;
	int[] anIntArray5339;
	int[] anIntArray5340;
	int[][] anIntArrayArray5341;
	int anInt5342;
	int anInt5343;
	int[] anIntArray5344;

	void decodeHeader(byte[] is, int i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(Class469.method5700(is, (byte) -43));
		int i_72_ = class536_sub33.readUnsignedByte();
		if (i_72_ < 5 || i_72_ > 7)
			throw new RuntimeException();
		if (i_72_ >= 6)
			anInt5343 = class536_sub33.readInt() * -1621242877;
		else
			anInt5343 = 0;
		int i_73_ = class536_sub33.readUnsignedByte();
		boolean bool = 0 != (i_73_ & 0x1);
		boolean bool_74_ = 0 != (i_73_ & 0x2);
		boolean bool_75_ = (i_73_ & 0x4) != 0;
		boolean bool_76_ = 0 != (i_73_ & 0x8);
		if (i_72_ >= 7)
			anInt5329 = class536_sub33.method9765((short) 11913) * 1236280683;
		else
			anInt5329 = class536_sub33.readUnsignedShort() * 1236280683;
		int i_77_ = 0;
		int i_78_ = -1;
		anIntArray5330 = new int[1483398979 * anInt5329];
		if (i_72_ >= 7) {
			for (int i_79_ = 0; i_79_ < 1483398979 * anInt5329; i_79_++) {
				anIntArray5330[i_79_] = i_77_ += class536_sub33.method9765((short) 15098);
				if (anIntArray5330[i_79_] > i_78_)
					i_78_ = anIntArray5330[i_79_];
			}
		} else {
			for (int i_80_ = 0; i_80_ < 1483398979 * anInt5329; i_80_++) {
				anIntArray5330[i_80_] = i_77_ += class536_sub33.readUnsignedShort();
				if (anIntArray5330[i_80_] > i_78_)
					i_78_ = anIntArray5330[i_80_];
			}
		}
		anInt5333 = (i_78_ + 1) * 1086459915;
		anIntArray5334 = new int[anInt5333 * 608172963];
		if (bool_76_)
			anIntArray5332 = new int[anInt5333 * 608172963];
		if (bool_74_)
			aByteArrayArray5336 = new byte[608172963 * anInt5333][];
		anIntArray5337 = new int[anInt5333 * 608172963];
		anIntArray5340 = new int[anInt5333 * 608172963];
		anIntArrayArray5341 = new int[608172963 * anInt5333][];
		anIntArray5344 = new int[anInt5333 * 608172963];
		if (bool) {
			anIntArray5328 = new int[anInt5333 * 608172963];
			for (int i_81_ = 0; i_81_ < 608172963 * anInt5333; i_81_++)
				anIntArray5328[i_81_] = -1;
			for (int i_82_ = 0; i_82_ < 1483398979 * anInt5329; i_82_++)
				anIntArray5328[anIntArray5330[i_82_]] = class536_sub33.readInt();
			aClass260_5325 = new Class260(anIntArray5328);
		}
		for (int i_83_ = 0; i_83_ < 1483398979 * anInt5329; i_83_++)
			anIntArray5334[anIntArray5330[i_83_]] = class536_sub33.readInt();
		if (bool_76_) {
			for (int i_84_ = 0; i_84_ < anInt5329 * 1483398979; i_84_++)
				anIntArray5332[i_84_] = class536_sub33.readInt();
		}
		if (bool_74_) {
			for (int i_85_ = 0; i_85_ < 1483398979 * anInt5329; i_85_++) {
				byte[] is_86_ = new byte[64];
				class536_sub33.method9716(is_86_, 0, 64, -751300460);
				aByteArrayArray5336[anIntArray5330[i_85_]] = is_86_;
			}
		}
		if (bool_75_) {
			anIntArray5338 = new int[608172963 * anInt5333];
			anIntArray5339 = new int[anInt5333 * 608172963];
			for (int i_87_ = 0; i_87_ < 1483398979 * anInt5329; i_87_++) {
				anIntArray5338[anIntArray5330[i_87_]] = class536_sub33.readInt();
				anIntArray5339[anIntArray5330[i_87_]] = class536_sub33.readInt();
			}
		}
		for (int i_88_ = 0; i_88_ < anInt5329 * 1483398979; i_88_++)
			anIntArray5337[anIntArray5330[i_88_]] = class536_sub33.readInt();
		if (i_72_ >= 7) {
			for (int i_89_ = 0; i_89_ < 1483398979 * anInt5329; i_89_++)
				anIntArray5340[anIntArray5330[i_89_]] = class536_sub33.method9765((short) 32629);
			for (int i_90_ = 0; i_90_ < 1483398979 * anInt5329; i_90_++) {
				int i_91_ = anIntArray5330[i_90_];
				int i_92_ = anIntArray5340[i_91_];
				i_77_ = 0;
				int i_93_ = -1;
				anIntArrayArray5341[i_91_] = new int[i_92_];
				for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
					int i_95_ = (anIntArrayArray5341[i_91_][i_94_] = i_77_ += class536_sub33.method9765((short) 31627));
					if (i_95_ > i_93_)
						i_93_ = i_95_;
				}
				anIntArray5344[i_91_] = 1 + i_93_;
				if (1 + i_93_ == i_92_)
					anIntArrayArray5341[i_91_] = null;
			}
		} else {
			for (int i_96_ = 0; i_96_ < anInt5329 * 1483398979; i_96_++)
				anIntArray5340[anIntArray5330[i_96_]] = class536_sub33.readUnsignedShort();
			for (int i_97_ = 0; i_97_ < anInt5329 * 1483398979; i_97_++) {
				int i_98_ = anIntArray5330[i_97_];
				int i_99_ = anIntArray5340[i_98_];
				i_77_ = 0;
				int i_100_ = -1;
				anIntArrayArray5341[i_98_] = new int[i_99_];
				for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
					int i_102_ = (anIntArrayArray5341[i_98_][i_101_] = i_77_ += class536_sub33.readUnsignedShort());
					if (i_102_ > i_100_)
						i_100_ = i_102_;
				}
				anIntArray5344[i_98_] = 1 + i_100_;
				if (i_100_ + 1 == i_99_)
					anIntArrayArray5341[i_98_] = null;
			}
		}
		if (bool) {
			anIntArrayArray5327 = new int[1 + i_78_][];
			aClass260Array5335 = new Class260[1 + i_78_];
			for (int i_103_ = 0; i_103_ < 1483398979 * anInt5329; i_103_++) {
				int i_104_ = anIntArray5330[i_103_];
				int i_105_ = anIntArray5340[i_104_];
				anIntArrayArray5327[i_104_] = new int[anIntArray5344[i_104_]];
				for (int i_106_ = 0; i_106_ < anIntArray5344[i_104_]; i_106_++)
					anIntArrayArray5327[i_104_][i_106_] = -1;
				for (int i_107_ = 0; i_107_ < i_105_; i_107_++) {
					int i_108_;
					if (null != anIntArrayArray5341[i_104_])
						i_108_ = anIntArrayArray5341[i_104_][i_107_];
					else
						i_108_ = i_107_;
					anIntArrayArray5327[i_104_][i_108_] = class536_sub33.readInt();
				}
				aClass260Array5335[i_104_] = new Class260(anIntArrayArray5327[i_104_]);
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
		decodeHeader(is, -539613955);
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
