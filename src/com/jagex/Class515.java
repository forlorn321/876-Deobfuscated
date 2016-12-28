/* Class515 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Class515 {
	Class465_Sub1 aClass465_Sub1_6991;
	Class498 aClass498_6992;
	Class498 aClass498_6993;
	Class636 aClass636_6994;
	Class465_Sub1 aClass465_Sub1_6995;
	int[] anIntArray6996;
	public long aLong6997;
	Class598 aClass598_6998;
	Class455 aClass455_6999;
	int anInt7000;
	int[][] anIntArrayArray7001;
	int[][][] anIntArrayArrayArray7002;
	Class553 aClass553_7003;
	public boolean aBool7004;
	boolean aBool7005;
	int anInt7006;
	float aFloat7007;
	Class543 aClass543_7008;
	int anInt7009;
	Class501 aClass501_7010;
	int anInt7011;
	Class34_Sub17 aClass34_Sub17_7012;
	int[][] anIntArrayArray7013;
	Class536_Sub18_Sub14 aClass536_Sub18_Sub14_7014;
	int anInt7015;
	Class516 aClass516_7016;
	int anInt7017;
	int anInt7018;
	int anInt7019;
	int anInt7020;
	int anInt7021;
	int anInt7022;
	Class598 aClass598_7023 = new Class598();
	int[] anIntArray7024;
	byte[][] aByteArrayArray7025;
	byte[][] aByteArrayArray7026;
	byte[][] aByteArrayArray7027;
	byte[][] aByteArrayArray7028;
	byte[][] aByteArrayArray7029;
	int anInt7030;
	byte[][][] aByteArrayArrayArray7031;
	Class287 aClass287_7032;
	public long aLong7033;
	HashMap aHashMap7034;
	public int anInt7035;

	void method6240() {
		method6299(Class510.method6188(Class710.aClass536_Sub40_8843.aClass710_Sub8_10770.method9996((byte) 28), -1709781983), 1121434602);
		int i = aClass598_7023.anInt7839 * 1858049507;
		int i_0_ = aClass598_7023.anInt7840 * 1479112045;
		int i_1_ = (i >> 3) + (Class637.anInt8301 * -1607026219 >> 12);
		int i_2_ = (-1646092097 * Class685.anInt8665 >> 12) + (i_0_ >> 3);
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839 = (byte) 0;
		Class320.anInt3539 = 0;
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method11087(8, 8, (byte) 1);
		int i_3_ = 18;
		anIntArray6996 = new int[i_3_];
		anIntArray7024 = new int[i_3_];
		aByteArrayArray7025 = new byte[i_3_][];
		aByteArrayArray7026 = new byte[i_3_][];
		aByteArrayArray7027 = new byte[i_3_][];
		aByteArrayArray7028 = new byte[i_3_][];
		aByteArrayArray7029 = new byte[i_3_][];
		i_3_ = 0;
		for (int i_4_ = (i_1_ - (-324388659 * anInt7030 >> 4)) / 8; i_4_ <= (i_1_ + (-324388659 * anInt7030 >> 4)) / 8; i_4_++) {
			for (int i_5_ = (i_2_ - (anInt7011 * -1001036419 >> 4)) / 8; i_5_ <= ((anInt7011 * -1001036419 >> 4) + i_2_) / 8; i_5_++) {
				int i_6_ = i_5_ + (i_4_ << 8);
				if (Class116.aClass461_1432.method5553(method6267(i_4_, i_5_, 524434557), Class468.aClass468_5348.anInt5354 * 1600259987, 87024603)) {
					anIntArray6996[i_3_] = i_6_;
					anIntArray7024[i_3_] = method6267(i_4_, i_5_, 573631945);
					i_3_++;
				}
			}
		}
		anInt7022 = i_3_ * -1538430001;
		int i_7_;
		if (-708374433 * client.anInt11101 == 16)
			i_7_ = 7;
		else if (8 == -708374433 * client.anInt11101)
			i_7_ = 6;
		else if (-708374433 * client.anInt11101 == 0)
			i_7_ = 14;
		else if (client.anInt11101 * -708374433 == 11)
			i_7_ = 5;
		else
			throw new RuntimeException(new StringBuilder().append("").append(-708374433 * client.anInt11101).toString());
		loadChunk(i_1_, i_2_, i_7_, false, -1799047192);
	}

	public Class515(boolean bool) {
		aClass598_6998 = new Class598();
		aClass501_7010 = new Class501(0, 0, 0, 0);
		anInt7017 = 0;
		anInt7018 = -1076761753;
		anInt7019 = 0;
		anInt7015 = -172129027;
		anInt7022 = 0;
		aBool7004 = false;
		aLong7033 = -4972394634653231741L;
		aHashMap7034 = new HashMap();
		aBool7005 = bool;
	}

	public float method6241() {
		return aFloat7007;
	}

	public int method6242(byte i) {
		return 100 - anInt7017 * 14998628 / (-1838219177 * anInt7018);
	}

	public int method6243(int i) {
		return -1001036419 * anInt7011;
	}

	public Class543 method6244(byte i) {
		return aClass543_7008;
	}

	public Class501 method6245(byte i) {
		return aClass501_7010;
	}

	public void method6246(byte[][][] is, int i) {
		aByteArrayArrayArray7031 = is;
	}

	public int method6247(int i) {
		return -833740267 * anInt7006;
	}

	public int method6248(int i) {
		return anInt7020 * -831210981;
	}

	public Class553 method6249(int i) {
		return aClass553_7003;
	}

	public byte[][] method6250(int i, int i_8_) {
		if (null != aClass465_Sub1_6991 && aClass465_Sub1_6991.aByteArrayArrayArray5246 != null && aClass465_Sub1_6991.aByteArrayArrayArray5246[i] != null)
			return aClass465_Sub1_6991.aByteArrayArrayArray5246[i];
		return null;
	}

	public Class455 method6251(int i) {
		return aClass455_6999;
	}

	public Class636 method6252(int i) {
		return aClass636_6994;
	}

	public int method6253() {
		return 100 - anInt7017 * 14998628 / (-1838219177 * anInt7018);
	}

	public void method6254(Class34_Sub17 class34_sub17, int i) {
		aClass34_Sub17_7012 = class34_sub17;
	}

	public Class598 method6255(int i) {
		return aClass598_7023;
	}

	void method6256(byte i) {
		aClass498_6993 = aClass498_6992;
		method6299(Class287.aClass287_3208, 1121434602);
		for (int i_9_ = 0; i_9_ < 4; i_9_++) {
			for (int i_10_ = 0; i_10_ < anInt7030 * -324388659 >> 3; i_10_++) {
				for (int i_11_ = 0; i_11_ < -1001036419 * anInt7011 >> 3; i_11_++)
					anIntArrayArrayArray7002[i_9_][i_10_][i_11_] = -1;
			}
		}
		for (Class536_Sub27 class536_sub27 = ((Class536_Sub27) Class193.aClass708_2181.method8308(1867269829)); null != class536_sub27; class536_sub27 = (Class536_Sub27) Class193.aClass708_2181.method8311(1962028215)) {
			int i_12_ = class536_sub27.anInt10538 * -1674752119;
			boolean bool = 1 == (i_12_ & 0x1);
			int i_13_ = -1256230887 * class536_sub27.anInt10540 >> 3;
			int i_14_ = -337130859 * class536_sub27.anInt10536 >> 3;
			int i_15_ = 1174354059 * class536_sub27.anInt10535;
			int i_16_ = class536_sub27.anInt10539 * 1973961159;
			int i_17_ = class536_sub27.anInt10534 * -1181488613;
			int i_18_ = class536_sub27.anInt10537 * -182281589;
			int i_19_ = -706160771 * class536_sub27.anInt10542;
			int i_20_ = class536_sub27.anInt10541 * 453775873;
			int i_21_ = 0;
			int i_22_ = 0;
			int i_23_ = 1;
			int i_24_ = 1;
			if (i_12_ == 1) {
				i_22_ = i_19_ - 1;
				i_23_ = -1;
			} else if (i_12_ == 2) {
				i_22_ = i_19_ - 1;
				i_21_ = i_20_ - 1;
				i_23_ = -1;
				i_24_ = -1;
			} else if (3 == i_12_) {
				i_21_ = i_20_ - 1;
				i_23_ = 1;
				i_24_ = -1;
			}
			int i_25_ = i_14_;
			while (i_25_ < i_20_ + i_14_) {
				int i_26_ = i_22_;
				int i_27_ = i_13_;
				while (i_27_ < i_19_ + i_13_) {
					if (bool)
						anIntArrayArrayArray7002[i_18_][i_21_ + i_15_][i_26_ + i_16_] = (i_12_ << 1) + ((i_25_ << 3) + ((i_27_ << 14) + (i_17_ << 24)));
					else
						anIntArrayArrayArray7002[i_18_][i_15_ + i_26_][i_21_ + i_16_] = ((i_17_ << 24) + (i_27_ << 14) + (i_25_ << 3) + (i_12_ << 1));
					i_27_++;
					i_26_ += i_23_;
				}
				i_25_++;
				i_21_ += i_24_;
			}
		}
		int i_28_ = client.anInt11114 * 1066050771;
		anIntArray6996 = new int[i_28_];
		anIntArray7024 = new int[i_28_];
		aByteArrayArray7025 = new byte[i_28_][];
		aByteArrayArray7026 = new byte[i_28_][];
		aByteArrayArray7027 = null;
		aByteArrayArray7028 = new byte[i_28_][];
		aByteArrayArray7029 = new byte[i_28_][];
		i_28_ = 0;
		for (Class536_Sub27 class536_sub27 = ((Class536_Sub27) Class193.aClass708_2181.method8308(1867269829)); class536_sub27 != null; class536_sub27 = (Class536_Sub27) Class193.aClass708_2181.method8311(1756311528)) {
			int i_29_ = -1256230887 * class536_sub27.anInt10540 >>> 3;
			int i_30_ = class536_sub27.anInt10536 * -337130859 >>> 3;
			int i_31_ = i_29_ + class536_sub27.anInt10542 * -706160771;
			if ((i_31_ & 0x7) == 0)
				i_31_--;
			i_31_ >>>= 3;
			int i_32_ = i_30_ + 453775873 * class536_sub27.anInt10541;
			if ((i_32_ & 0x7) == 0)
				i_32_--;
			i_32_ >>>= 3;
			for (int i_33_ = i_29_ >>> 3; i_33_ <= i_31_; i_33_++) {
				while_1_: for (int i_34_ = i_30_ >>> 3; i_34_ <= i_32_; i_34_++) {
					int i_35_ = i_33_ << 8 | i_34_;
					for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
						if (anIntArray6996[i_36_] == i_35_)
							continue while_1_;
					}
					if (Class116.aClass461_1432.method5553(method6267(i_33_, i_34_, 1398502497), Class468.aClass468_5348.anInt5354 * 1600259987, 1447108207)) {
						anIntArray6996[i_28_] = i_35_;
						anIntArray7024[i_28_] = method6267(i_33_, i_34_, -722967400);
						i_28_++;
					}
				}
			}
		}
		anInt7022 = i_28_ * -1538430001;
		loadChunk(anInt7030 * -324388659 >> 4, anInt7011 * -1001036419 >> 4, 10, false, -1125899736);
	}

	public int method6257(int i) {
		return 100 - anInt7019 * -324909788 / (-243156907 * anInt7015);
	}

	public void method6258(byte i) {
		aClass598_7023 = new Class598();
		anInt7000 = 0;
		anInt7009 = 0;
	}

	public void method6259(int i) {
		if (null != aClass553_7003) {
			Class270.method3713(-360466849);
			aHashMap7034 = aClass553_7003.method6740((byte) 6);
			aClass553_7003.aClass564_7477.method6872(-508713334);
			aClass553_7003 = null;
		}
	}

	public void method6260(byte i) {
		aClass516_7016 = Class516.aClass516_7039;
		anInt7017 = 0;
		anInt7018 = -1076761753;
		anInt7019 = 0;
		anInt7015 = -172129027;
		anInt7021 = 0;
	}

	public void method6261(boolean bool, int i) {
		Class642 class642 = null;
		if (null != aClass636_6994 && bool)
			class642 = aClass636_6994.method7569((byte) 1);
		aClass636_6994 = new Class636(Class677.aClass167_8609, Class398.aClass461_4122, -324388659 * anInt7030 >> 3, anInt7011 * -1001036419 >> 3);
		if (null != class642)
			aClass636_6994.method7608(this, class642, 0, -1699115930);
	}

	public void method6262(int i) {
		aClass636_6994.method7608(this, null, 0, -1699115930);
	}

	public void method6263(int i) {
		anInt7006 = 2117261224;
		if (0 == anInt7030 * -324388659)
			anInt7020 = -1701314582;
		else
			anInt7020 = ((int) (34.46 * (double) (-324388659 * anInt7030)) * 1214615571);
		anInt7020 = (anInt7020 * -831210981 << 2) * 1214615571;
		if (Class677.aClass167_8609.method2407())
			anInt7020 += -887085568;
	}

	void method6264(Class515 class515_37_, byte i) {
		boolean bool = class515_37_.aBool7005;
		class515_37_.aBool7005 = aBool7005;
		aBool7005 = bool;
		Class498 class498 = class515_37_.aClass498_6993;
		class515_37_.aClass498_6993 = aClass498_6993;
		aClass498_6993 = class498;
		class515_37_.aClass598_6998 = aClass598_7023;
		aClass598_6998 = class515_37_.aClass598_7023;
		aClass636_6994.method7571(class515_37_.method6252(1796531619), -149240645);
	}

	void decodeMapScene(RSBitBuffer stream, byte i) {
		int chunkY = stream.readUnsignedShortLE();
		int chunkX = stream.readUnsignedShort128();
		int mapType = stream.readUnsignedByteC();
		boolean refresh = stream.readUnsignedByte() == 1;
		int size = stream.readUnsigned128Byte();
		int unknown = stream.readUnsigned128Byte();
		//System.out.println("Loading map region: " + chunkX + ", " + chunkY + ", " + mapType + ", " + size + ", " + refresh + ", " + unknown);
		anInt7035 = unknown * 974659739;
		if (!aBool7005)
			method6268(1787021816);
		method6299(Class510.method6188(mapType, -717012590), 1121434602);
		anIntArray6996 = new int[size];
		anIntArray7024 = new int[size];
		aByteArrayArray7025 = new byte[size][];
		aByteArrayArray7026 = new byte[size][];
		aByteArrayArray7027 = null;
		aByteArrayArray7028 = new byte[size][];
		aByteArrayArray7029 = new byte[size][];
		size = 0;
		for (int i_42_ = (chunkX - (-324388659 * anInt7030 >> 4)) / 8; i_42_ <= ((anInt7030 * -324388659 >> 4) + chunkX) / 8; i_42_++) {
			for (int i_43_ = (chunkY - (-1001036419 * anInt7011 >> 4)) / 8; i_43_ <= (chunkY + (-1001036419 * anInt7011 >> 4)) / 8; i_43_++) {
				if (Class116.aClass461_1432.method5553(method6267(i_42_, i_43_, 1249324415), Class468.aClass468_5348.anInt5354 * 1600259987, 1444360960)) {
					anIntArray6996[size] = (i_42_ << 8) + i_43_;
					anIntArray7024[size] = method6267(i_42_, i_43_, -737072190);
					size++;
				}
			}
		}
		anInt7022 = -1538430001 * size;
		loadChunk(chunkX, chunkY, 10, refresh, -430743798);
	}

	void decodeDynamicMapScene(RSBitBuffer buffer, int i) {
		int sceneType = buffer.readUnsigned128Byte();
		if (sceneType == 1)
			aClass498_6992 = Class498.aClass498_5558;
		else if (2 == sceneType)
			aClass498_6992 = Class498.aClass498_5555;
		else if (3 == sceneType)
			aClass498_6992 = Class498.aClass498_5560;
		else if (sceneType == 4)
			aClass498_6992 = Class498.aClass498_5561;
		int chunkY = buffer.readUnsignedShortLE();
		int chunkX = buffer.readUnsignedShort128();
		int mapType = buffer.readUnsigned128Byte();
		int refreshFlags = buffer.readUnsigned128Byte();
		boolean refresh = 0 != (refreshFlags & 0x1);
		int unknown = buffer.readUnsignedByte128();
		anInt7035 = unknown * 974659739;
		if (!aBool7005)
			method6268(-1387269708);
		method6299(Class510.method6188(mapType, -1665393252), 1121434602);
		buffer.initBitAccess();
		HashSet hashset = new HashSet();
		for (int i_49_ = 0; i_49_ < 4; i_49_++) {
			for (int i_50_ = 0; i_50_ < anInt7030 * -324388659 >> 3; i_50_++) {
				for (int i_51_ = 0; i_51_ < anInt7011 * -1001036419 >> 3; i_51_++) {
					int i_52_ = buffer.readBits(1);
					if (1 == i_52_) {
						int i_53_ = buffer.readBits(26);
						anIntArrayArrayArray7002[i_49_][i_50_][i_51_] = i_53_;
						int i_54_ = i_53_ >> 14 & 0x3ff;
						int i_55_ = i_53_ >> 3 & 0x7ff;
						int i_56_ = i_54_ >> 3 << 8 | i_55_ >> 3;
						hashset.add(Integer.valueOf(i_56_));
					} else
						anIntArrayArrayArray7002[i_49_][i_50_][i_51_] = -1;
				}
			}
		}
		buffer.finishBitAccess(-1374707765);
		int i_57_ = hashset.size();
		anIntArray6996 = new int[i_57_];
		anIntArray7024 = new int[i_57_];
		aByteArrayArray7025 = new byte[i_57_][];
		aByteArrayArray7026 = new byte[i_57_][];
		aByteArrayArray7027 = null;
		aByteArrayArray7028 = new byte[i_57_][];
		aByteArrayArray7029 = new byte[i_57_][];
		i_57_ = 0;
		for (int i_58_ = 0; i_58_ < 4; i_58_++) {
			for (int i_59_ = 0; i_59_ < -324388659 * anInt7030 >> 3; i_59_++) {
				for (int i_60_ = 0; i_60_ < -1001036419 * anInt7011 >> 3; i_60_++) {
					int i_61_ = anIntArrayArrayArray7002[i_58_][i_59_][i_60_];
					if (-1 != i_61_) {
						int i_62_ = i_61_ >> 14 & 0x3ff;
						int i_63_ = i_61_ >> 3 & 0x7ff;
						int i_64_ = i_63_ / 8 + (i_62_ / 8 << 8);
						for (int i_65_ = 0; i_65_ < i_57_; i_65_++) {
							if (i_64_ == anIntArray6996[i_65_]) {
								i_64_ = -1;
								break;
							}
						}
						if (i_64_ != -1) {
							int i_66_ = i_64_ >> 8 & 0xff;
							int i_67_ = i_64_ & 0xff;
							if (Class116.aClass461_1432.method5553(method6267(i_66_, i_67_, -1543723280), (1600259987 * Class468.aClass468_5348.anInt5354), -1251592656)) {
								anIntArray6996[i_57_] = i_64_;
								anIntArray7024[i_57_] = method6267(i_66_, i_67_, -1120114520);
								i_57_++;
							}
						}
					}
				}
			}
		}
		anInt7022 = i_57_ * -1538430001;
		loadChunk(chunkX, chunkY, 10, refresh, -1312257118);
	}

	int method6267(int i, int i_68_, int i_69_) {
		return i | i_68_ << 7;
	}

	void method6268(int i) {
		if (aClass498_6992 != Class498.aClass498_5556 && Class498.aClass498_5556 != aClass498_6993) {
			if (Class498.aClass498_5558 == aClass498_6992 || Class498.aClass498_5560 == aClass498_6992 || (aClass498_6993 != aClass498_6992 && (Class498.aClass498_5557 == aClass498_6992 || Class498.aClass498_5557 == aClass498_6993))) {
				Iterator iterator = client.aClass4_11050.iterator();
				while (iterator.hasNext()) {
					ObjectParam class536_sub13 = (ObjectParam) iterator.next();
					Class18.method688(((NPC) class536_sub13.value), 1568950305);
				}
				client.anInt11053 = 0;
				client.anInt11164 = 0;
				client.aClass4_11050.method561(-2117553523);
			}
			aClass498_6993 = aClass498_6992;
		}
	}

	void method6269(int i, int i_70_) {
		int i_71_ = (aClass598_7023.anInt7839 * 1858049507 - aClass598_6998.anInt7839 * 1858049507);
		int i_72_ = (aClass598_7023.anInt7840 * 1479112045 - aClass598_6998.anInt7840 * 1479112045);
		if (i == 10) {
			for (int i_73_ = 0; i_73_ < -1683770117 * client.anInt11164; i_73_++) {
				ObjectParam class536_sub13 = client.aClass536_Sub13Array11044[i_73_];
				if (null != class536_sub13) {
					NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
					for (int i_74_ = 0; i_74_ < (class649_sub1_sub5_sub1_sub1.screenX).length; i_74_++) {
						class649_sub1_sub5_sub1_sub1.screenX[i_74_] -= i_71_;
						class649_sub1_sub5_sub1_sub1.screenY[i_74_] -= i_72_;
					}
					Class436 class436 = Class436.method5240(class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
					class436.aFloat4850 -= (float) (512 * i_71_);
					class436.aFloat4853 -= (float) (512 * i_72_);
					class649_sub1_sub5_sub1_sub1.method7841(class436);
					class436.method5239();
				}
			}
		} else {
			boolean bool = false;
			client.anInt11053 = 0;
			int i_75_ = 1416731136 * anInt7030 - 512;
			int i_76_ = anInt7011 * -1429538304 - 512;
			for (int i_77_ = 0; i_77_ < -1683770117 * client.anInt11164; i_77_++) {
				ObjectParam class536_sub13 = client.aClass536_Sub13Array11044[i_77_];
				if (null != class536_sub13) {
					NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class536_sub13.value);
					Class436 class436 = Class436.method5240(class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
					class436.aFloat4850 -= (float) (i_71_ * 512);
					class436.aFloat4853 -= (float) (512 * i_72_);
					class649_sub1_sub5_sub1_sub1.method7841(class436);
					if ((int) class436.aFloat4850 < 0 || (int) class436.aFloat4850 > i_75_ || (int) class436.aFloat4853 < 0 || (int) class436.aFloat4853 > i_76_) {
						class649_sub1_sub5_sub1_sub1.method11065(null, 179188063);
						class536_sub13.method6484();
						bool = true;
					} else {
						boolean bool_78_ = true;
						for (int i_79_ = 0; i_79_ < (class649_sub1_sub5_sub1_sub1.screenX).length; i_79_++) {
							class649_sub1_sub5_sub1_sub1.screenX[i_79_] -= i_71_;
							class649_sub1_sub5_sub1_sub1.screenY[i_79_] -= i_72_;
							if ((class649_sub1_sub5_sub1_sub1.screenX[i_79_]) < 0 || ((class649_sub1_sub5_sub1_sub1.screenX[i_79_]) >= -324388659 * anInt7030) || (class649_sub1_sub5_sub1_sub1.screenY[i_79_]) < 0 || ((class649_sub1_sub5_sub1_sub1.screenY[i_79_]) >= -1001036419 * anInt7011))
								bool_78_ = false;
						}
						if (bool_78_)
							client.anIntArray11211[((client.anInt11053 += -1094331191) * -664631943) - 1] = (1710020215 * class649_sub1_sub5_sub1_sub1.anInt11889);
						else {
							class649_sub1_sub5_sub1_sub1.method11065(null, 179188063);
							class536_sub13.method6484();
							bool = true;
						}
					}
					class436.method5239();
				}
			}
			if (bool) {
				client.anInt11164 = client.aClass4_11050.method569(2121580764) * -255707597;
				int i_80_ = 0;
				Iterator iterator = client.aClass4_11050.iterator();
				while (iterator.hasNext()) {
					ObjectParam class536_sub13 = (ObjectParam) iterator.next();
					client.aClass536_Sub13Array11044[i_80_++] = class536_sub13;
				}
			}
		}
		for (int i_81_ = 0; i_81_ < 2048; i_81_++) {
			Player class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_81_];
			if (null != class649_sub1_sub5_sub1_sub2) {
				for (int i_82_ = 0; (i_82_ < class649_sub1_sub5_sub1_sub2.screenX.length); i_82_++) {
					class649_sub1_sub5_sub1_sub2.screenX[i_82_] -= i_71_;
					class649_sub1_sub5_sub1_sub2.screenY[i_82_] -= i_72_;
				}
				Class436 class436 = Class436.method5240(class649_sub1_sub5_sub1_sub2.method7837().aClass436_4823);
				class436.aFloat4850 -= (float) (i_71_ * 512);
				class436.aFloat4853 -= (float) (i_72_ * 512);
				class649_sub1_sub5_sub1_sub2.method7841(class436);
				class436.method5239();
			}
		}
		Class103[] class103s = client.aClass103Array11020;
		for (int i_83_ = 0; i_83_ < class103s.length; i_83_++) {
			Class103 class103 = class103s[i_83_];
			if (class103 != null) {
				class103.anInt1225 -= i_71_ * -587981312;
				class103.anInt1226 -= 1653194240 * i_72_;
			}
		}
		for (Class536_Sub2 class536_sub2 = ((Class536_Sub2) Class536_Sub2.aClass708_10320.method8308(1867269829)); null != class536_sub2; class536_sub2 = (Class536_Sub2) Class536_Sub2.aClass708_10320.method8311(907354362)) {
			class536_sub2.anInt10309 -= 399769825 * i_71_;
			class536_sub2.anInt10312 -= -1006214131 * i_72_;
			Class612 class612 = ((Class612) aClass34_Sub17_7012.method70((744541999 * class536_sub2.anInt10314), (byte) -109));
			int i_84_;
			int i_85_;
			if (0 == (class536_sub2.anInt10315 * -190376161 & 0x1)) {
				i_84_ = class612.anInt8002 * -1981381335;
				i_85_ = -90266503 * class612.anInt7980;
			} else {
				i_84_ = class612.anInt7980 * -90266503;
				i_85_ = -1981381335 * class612.anInt8002;
			}
			if (Class498.aClass498_5561 != aClass498_6992 && (i_84_ + 848380705 * class536_sub2.anInt10309 <= 0 || -499217723 * class536_sub2.anInt10312 + i_85_ <= 0 || (class536_sub2.anInt10309 * 848380705 >= anInt7030 * -324388659) || (-499217723 * class536_sub2.anInt10312 >= -1001036419 * anInt7011)))
				class536_sub2.method6484();
		}
		for (Class536_Sub2 class536_sub2 = ((Class536_Sub2) Class536_Sub2.aClass708_10321.method8308(1867269829)); null != class536_sub2; class536_sub2 = (Class536_Sub2) Class536_Sub2.aClass708_10321.method8311(1494865754)) {
			class536_sub2.anInt10309 -= 399769825 * i_71_;
			class536_sub2.anInt10312 -= i_72_ * -1006214131;
			Class612 class612 = ((Class612) aClass34_Sub17_7012.method70((class536_sub2.anInt10314 * 744541999), (byte) -82));
			int i_86_;
			int i_87_;
			if ((-190376161 * class536_sub2.anInt10315 & 0x1) == 0) {
				i_86_ = class612.anInt8002 * -1981381335;
				i_87_ = class612.anInt7980 * -90266503;
			} else {
				i_86_ = -90266503 * class612.anInt7980;
				i_87_ = -1981381335 * class612.anInt8002;
			}
			if (aClass498_6992 != Class498.aClass498_5561 && (i_86_ + class536_sub2.anInt10309 * 848380705 <= 0 || class536_sub2.anInt10312 * -499217723 + i_87_ <= 0 || (class536_sub2.anInt10309 * 848380705 >= -324388659 * anInt7030) || (-499217723 * class536_sub2.anInt10312 >= -1001036419 * anInt7011)))
				class536_sub2.method6484();
		}
		for (Class536_Sub9 class536_sub9 = (Class536_Sub9) client.aClass4_11170.method562(-1295102343); null != class536_sub9; class536_sub9 = ((Class536_Sub9) client.aClass4_11170.method567(1391057622))) {
			int i_88_ = (int) (-6909195213925454795L * class536_sub9.aLong7133 >> 28 & 0x3L);
			int i_89_ = (int) (class536_sub9.aLong7133 * -6909195213925454795L & 0x3fffL);
			int i_90_ = i_89_ - 1858049507 * aClass598_7023.anInt7839;
			int i_91_ = (int) (-6909195213925454795L * class536_sub9.aLong7133 >> 14 & 0x3fffL);
			int i_92_ = i_91_ - aClass598_7023.anInt7840 * 1479112045;
			if (aClass553_7003 != null) {
				if (i_90_ < 0 || i_92_ < 0 || i_90_ >= anInt7030 * -324388659 || i_92_ >= -1001036419 * anInt7011 || i_90_ >= aClass553_7003.anInt7428 * 937313339 || i_92_ >= aClass553_7003.anInt7464 * 1965060689) {
					if (aClass498_6992 != Class498.aClass498_5561)
						class536_sub9.method6484();
				} else if (aClass553_7003.aClass556ArrayArrayArray7430 != null)
					aClass553_7003.method6718(i_88_, i_90_, i_92_, -366818792);
			}
		}
		if (0 != Class101.anInt1205 * -349564685) {
			Class101.anInt1205 -= i_71_ * -1245738949;
			Class101.anInt1194 -= 1934813789 * i_72_;
		}
		Class100.method1339(false, (short) 15579);
		if (i == 10) {
			client.anInt11082 -= i_71_ * -543285760;
			client.anInt11236 -= i_72_ * 149658112;
			Class461.anInt5216 -= 1712049664 * i_71_;
			Class222.anInt2326 -= i_72_ * -967711232;
			if (6 != 155362615 * Class246.anInt2474 && 2 != 155362615 * Class246.anInt2474)
				Class609.method7265(Class65.method1062());
		} else {
			Class440.anInt4874 -= -1470004169 * i_71_;
			Class606.anInt7898 -= i_72_ * 1281447141;
			Class438.anInt4868 -= -1221047655 * i_71_;
			Class550.anInt7412 -= -186879469 * i_72_;
			Class637.anInt8301 -= 1634662912 * i_71_;
			Class685.anInt8665 -= -2120319488 * i_72_;
			if (Math.abs(i_71_) > -324388659 * anInt7030 || Math.abs(i_72_) > anInt7011 * -1001036419)
				aClass636_6994.method7581((byte) 8);
		}
		Class106.method1429(1019130034);
		Class541.method6531(786572272);
		client.aClass4_11175.method561(-2117553523);
		client.aClass708_11174.method8304(454036827);
		client.aClass695_11176.method8211(-1778406990);
		Class580.method7013(1964875185);
	}

	void method6270(int i) {
		aClass465_Sub1_6995 = null;
		aClass465_Sub1_6991 = null;
		if (null != aClass455_6999)
			aClass455_6999.method5464(-1903948074);
		if (null != aClass636_6994)
			aClass636_6994.method7576((byte) -31);
		if (aClass553_7003 != null) {
			aClass553_7003.aClass564_7477.method6872(506675642);
			aClass553_7003 = null;
		}
	}

	public boolean method6271(int i) {
		if (!aBool7005)
			Class106.method1424(false, 1847757598);
		if (-1L == aLong7033 * -5238373949260439851L)
			aLong7033 = Class249.method3450(2008975044) * 4972394634653231741L;
		anInt7017 = 0;
		for (int i_93_ = 0; i_93_ < -861422801 * anInt7022; i_93_++) {
			if (!Class116.aClass461_1432.method5560(anIntArray7024[i_93_], 2093058369))
				anInt7017 += 745746689;
		}
		if (null == aClass543_7008) {
			if (aClass536_Sub18_Sub14_7014 != null && (Class622.aClass461_8129.method5573(aClass536_Sub18_Sub14_7014.aString11763, 746013087))) {
				if (!Class622.aClass461_8129.method5577(aClass536_Sub18_Sub14_7014.aString11763, -1500362199))
					anInt7017 += 745746689;
				else
					aClass543_7008 = Class463.method5625(Class622.aClass461_8129, (aClass536_Sub18_Sub14_7014.aString11763), client.aBool11123, 1297147153);
			} else
				aClass543_7008 = new Class543(0);
		}
		if (1374539521 * anInt7017 > 0) {
			if (anInt7018 * -1838219177 < anInt7017 * 1374539521)
				anInt7018 = 42284135 * anInt7017;
			aClass516_7016 = Class516.aClass516_7036;
			return false;
		}
		for (int i_94_ = 0; i_94_ < -861422801 * anInt7022; i_94_++) {
			if (aByteArrayArray7025[i_94_] == null)
				aByteArrayArray7025[i_94_] = Class116.aClass461_1432.method5556(anIntArray7024[i_94_], ((Class468.aClass468_5348.anInt5354) * 1600259987), (byte) 1);
			if (null == aByteArrayArray7026[i_94_])
				aByteArrayArray7026[i_94_] = Class116.aClass461_1432.method5556(anIntArray7024[i_94_], (1600259987 * (Class468.aClass468_5352.anInt5354)), (byte) 1);
			if (null == aByteArrayArray7028[i_94_])
				aByteArrayArray7028[i_94_] = Class116.aClass461_1432.method5556(anIntArray7024[i_94_], (1600259987 * (Class468.aClass468_5349.anInt5354)), (byte) 1);
			if (null == aByteArrayArray7029[i_94_])
				aByteArrayArray7029[i_94_] = Class116.aClass461_1432.method5556(anIntArray7024[i_94_], (1600259987 * (Class468.aClass468_5346.anInt5354)), (byte) 1);
			if (null != aByteArrayArray7027 && null == aByteArrayArray7027[i_94_])
				aByteArrayArray7027[i_94_] = Class116.aClass461_1432.method5556(anIntArray7024[i_94_], (1600259987 * (Class468.aClass468_5347.anInt5354)), (byte) 1);
		}
		int i_95_ = 125599921 * anInt7019;
		Class656 class656 = new Class656(-1);
		Class656 class656_96_ = new Class656(-1);
		anInt7019 = 0;
		for (int i_97_ = 0; i_97_ < -861422801 * anInt7022; i_97_++) {
			byte[] is = aByteArrayArray7026[i_97_];
			if (is != null) {
				int i_98_ = ((anIntArray6996[i_97_] >> 8) * 64 - aClass598_7023.anInt7839 * 1858049507);
				int i_99_ = (64 * (anIntArray6996[i_97_] & 0xff) - aClass598_7023.anInt7840 * 1479112045);
				if (aClass498_6992.method6016((byte) -6)) {
					i_98_ = 10;
					i_99_ = 10;
				}
				int i_100_ = Class665.method7999(aClass34_Sub17_7012, is, i_98_, i_99_, anInt7030 * -324388659, anInt7011 * -1001036419, class656_96_, class656, -207776497);
				if (i_100_ > 0)
					anInt7019 += -1167996847 * i_100_;
			}
			is = aByteArrayArray7029[i_97_];
			if (null != is) {
				int i_101_ = ((anIntArray6996[i_97_] >> 8) * 64 - aClass598_7023.anInt7839 * 1858049507);
				int i_102_ = ((anIntArray6996[i_97_] & 0xff) * 64 - 1479112045 * aClass598_7023.anInt7840);
				if (aClass498_6992.method6016((byte) -11)) {
					i_101_ = 10;
					i_102_ = 10;
				}
				int i_103_ = Class665.method7999(aClass34_Sub17_7012, is, i_101_, i_102_, anInt7030 * -324388659, anInt7011 * -1001036419, class656_96_, class656, 680661803);
				if (i_103_ > 0)
					anInt7019 += -1167996847 * i_103_;
			}
		}
		if (anInt7019 * 125599921 > 0) {
			if (i_95_ == 125599921 * anInt7019) {
				if (anInt7021 * 1494122109 != 0 && 1000 == client.cycles - anInt7021 * 1494122109) {
					Class215.method3088(899086101 * class656_96_.anInt8497, class656.anInt8497 * 899086101, anInt7019 * 125599921, -841672183);
					Class246.method3418((byte) 1);
				}
			} else
				anInt7021 = -526030123 * client.cycles;
			if (-243156907 * anInt7015 < 125599921 * anInt7019)
				anInt7015 = anInt7019 * 1274605;
			aClass516_7016 = Class516.aClass516_7038;
			return false;
		}
		if (!aBool7005 && aClass516_7016 != Class516.aClass516_7039)
			Class306.method4120(new StringBuilder().append(Class38.aClass38_402.method840(Class459.aClass664_5178, 1898190789)).append(Class40.aString496).append("(100%)").toString(), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
		aClass516_7016 = Class516.aClass516_7037;
		if (!aBool7005 && Class184_Sub2.aClass211_9442 != null)
			Class184_Sub2.aClass211_9442.method2987((short) 16005);
		if (!aBool7005) {
			for (int i_104_ = 0; i_104_ < 2048; i_104_++) {
				Player class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_104_];
				if (null != class649_sub1_sub5_sub1_sub2)
					class649_sub1_sub5_sub1_sub2.aClass553_10838 = null;
			}
			for (int i_105_ = 0; i_105_ < client.aClass536_Sub13Array11044.length; i_105_++) {
				ObjectParam class536_sub13 = client.aClass536_Sub13Array11044[i_105_];
				if (class536_sub13 != null)
					((Class649_Sub1) class536_sub13.value).aClass553_10838 = null;
			}
		}
		if (!aBool7005)
			Class558.method6817(true, -1371729051);
		boolean bool = false;
		if (Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055) == 2) {
			for (int i_106_ = 0; i_106_ < anInt7022 * -861422801; i_106_++) {
				if (aByteArrayArray7029[i_106_] != null || null != aByteArrayArray7028[i_106_]) {
					bool = true;
					break;
				}
			}
		}
		int i_107_ = (Class229.method3293(Class710.aClass536_Sub40_8843.aClass710_Sub40_10745.method10246(-2026593254), (byte) -59).anInt3349 * 931674088);
		if (Class677.aClass167_8609.method2407())
			i_107_++;
		method6263(-2076691100);
		method6270(-547777121);
		aClass553_7003 = new Class553(Class677.aClass167_8609, 9, 4, -324388659 * anInt7030, anInt7011 * -1001036419, i_107_, bool, Class677.aClass167_8609.method2108() > 0);
		aClass553_7003.method6763(false, -414642736);
		aClass553_7003.method6694(client.anInt11027 * -562745919, 1336159818);
		aClass553_7003.method6741(aHashMap7034, 1556382578);
		if (client.anInt11027 * -562745919 != 0)
			aClass553_7003.method6695(Class18.aClass184_190, (byte) -61);
		else
			aClass553_7003.method6695(null, (byte) -3);
		aClass501_7010 = new Class501();
		aFloat7007 = -0.05F + (float) (Math.random() / 10.0);
		aClass465_Sub1_6991 = new Class465_Sub1(aClass553_7003, aClass34_Sub17_7012, 4, anInt7030 * -324388659, -1001036419 * anInt7011, false, aClass455_6999, aClass636_6994);
		aClass465_Sub1_6991.method5658(1546481980);
		aClass465_Sub1_6991.anInt5268 = Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(1609247486) * -1635053223;
		aClass465_Sub1_6991.aBool5237 = Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055) == 2;
		aClass465_Sub1_6991.aBool5238 = Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0) == 1;
		aClass465_Sub1_6991.aBool5239 = Class710.aClass536_Sub40_8843.aClass710_Sub29_10752.method10171(-498458505) == 1;
		aClass465_Sub1_6991.aBool5231 = Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(221547964) == 1;
		if (!aClass498_6992.method6016((byte) -1))
			method6273(aClass465_Sub1_6991, aByteArrayArray7025, (byte) 57);
		else
			method6274(aClass465_Sub1_6991, aByteArrayArray7025, (byte) -41);
		if (aBool7005)
			method6320(50, (byte) -77);
		aClass636_6994.method7586(-324388659 * anInt7030 >> 4, -1001036419 * anInt7011 >> 4, (byte) -87);
		aClass636_6994.method7567(this, -1411037171);
		if (bool) {
			aClass553_7003.method6763(true, -2035267085);
			aClass465_Sub1_6995 = new Class465_Sub1(aClass553_7003, aClass34_Sub17_7012, 1, -324388659 * anInt7030, -1001036419 * anInt7011, true, aClass455_6999, aClass636_6994);
			aClass465_Sub1_6995.method5658(2036579120);
			aClass465_Sub1_6995.anInt5268 = Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(1089100668) * -1635053223;
			aClass465_Sub1_6995.aBool5237 = Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method9894(-1017210055) == 2;
			aClass465_Sub1_6995.aBool5238 = Class710.aClass536_Sub40_8843.aClass710_Sub14_10755.method10066((byte) 0) == 1;
			aClass465_Sub1_6995.aBool5239 = Class710.aClass536_Sub40_8843.aClass710_Sub29_10752.method10171(-498458505) == 1;
			aClass465_Sub1_6995.aBool5231 = Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(-426924339) == 1;
			if (!aClass498_6992.method6016((byte) -116)) {
				method6273(aClass465_Sub1_6995, aByteArrayArray7028, (byte) 74);
				if (!aBool7005)
					Class106.method1424(true, 848853138);
			} else {
				method6274(aClass465_Sub1_6995, aByteArrayArray7028, (byte) -33);
				if (!aBool7005)
					Class106.method1424(true, 1233867735);
			}
			aClass465_Sub1_6995.method5639(0, (aClass465_Sub1_6991.anIntArrayArrayArray5245[0]), -1281266231);
			aClass465_Sub1_6995.method5653(Class677.aClass167_8609, null, 1855009917);
			aClass553_7003.method6763(false, -50689352);
			if (aBool7005)
				method6320(50, (byte) -104);
		}
		aClass465_Sub1_6991.method5653(Class677.aClass167_8609, (bool ? (aClass465_Sub1_6995.anIntArrayArrayArray5245) : null), 588543482);
		if (!aClass498_6992.method6016((byte) -65)) {
			if (!aBool7005)
				Class106.method1424(true, 1387261455);
			method6275(aClass465_Sub1_6991, aByteArrayArray7026, (byte) 1);
			if (aByteArrayArray7027 != null)
				method6306(1453161944);
		} else {
			if (!aBool7005)
				Class106.method1424(true, 1314102805);
			method6276(aClass465_Sub1_6991, aByteArrayArray7026, -1697010135);
		}
		if (!aBool7005)
			Class106.method1424(true, 1066130756);
		aClass465_Sub1_6991.method5640(Class677.aClass167_8609, (bool ? aClass553_7003.aClass160Array7418[0] : null), null, -1906756390);
		if (aBool7005)
			method6320(75, (byte) -21);
		aClass465_Sub1_6991.method9383(Class677.aClass167_8609, false, -1702884924);
		if (aBool7005)
			method6320(75, (byte) -72);
		if (!aBool7005)
			Class106.method1424(true, 1807584818);
		if (bool) {
			aClass553_7003.method6763(true, 1252004833);
			if (!aBool7005)
				Class106.method1424(true, 1536006943);
			if (!aClass498_6992.method6016((byte) 64))
				method6275(aClass465_Sub1_6995, aByteArrayArray7029, (byte) 1);
			else
				method6276(aClass465_Sub1_6995, aByteArrayArray7029, -1697010135);
			if (!aBool7005)
				Class106.method1424(true, 1824102857);
			aClass465_Sub1_6995.method5640(Class677.aClass167_8609, null, (aClass553_7003.aClass160Array7459[0]), -2021499635);
			aClass465_Sub1_6995.method9383(Class677.aClass167_8609, true, -1702884924);
			if (!aBool7005)
				Class106.method1424(true, 1095532818);
			aClass553_7003.method6763(false, 746923168);
			if (aBool7005)
				method6320(50, (byte) -47);
		}
		aClass465_Sub1_6991.method5635((byte) -18);
		if (aClass465_Sub1_6995 != null)
			aClass465_Sub1_6995.method5635((byte) -37);
		aClass553_7003.method6697(248075094);
		if (aBool7005) {
			Class249.method3450(1734028508);
			while (!Class677.aClass167_8609.method2387(2057102333))
				method6320(1, (byte) -105);
		}
		boolean bool_108_ = false;
		if (aBool7005) {
			Class515 class515_109_ = client.aClass515_11066;
			method6264(class515_109_, (byte) 6);
			Class266.aClass503_2867.method6046(class515_109_, 1135148218);
			bool_108_ = true;
			Class249.method3450(1440624718);
			synchronized (client.anObject11069) {
				client.aBool11067 = true;
				try {
					client.anObject11069.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass515_11066 = this;
			class515_109_.method6270(-547777121);
			method6269(10, -1712057137);
			method6268(-1630974196);
		} else {
			Class184_Sub2.aClass211_9442.method2987((short) 30837);
			aClass636_6994.method7583(-93776436);
			Class444.method5392(731819448);
		}
		for (int i_110_ = 0; i_110_ < 4; i_110_++) {
			for (int i_111_ = 0; i_111_ < anInt7030 * -324388659; i_111_++) {
				for (int i_112_ = 0; i_112_ < anInt7011 * -1001036419; i_112_++)
					Class52.method934(i_110_, i_111_, i_112_, (byte) -75);
			}
		}
		for (int i_113_ = 0; i_113_ < client.aClass526Array11021.length; i_113_++) {
			if (client.aClass526Array11021[i_113_] != null)
				client.aClass526Array11021[i_113_].method6417((byte) 122);
		}
		Class85.method1188(-1345824543);
		Class586.method7062(-2045705413);
		if (Class74.method1136(-1617235478) == Class512.aClass512_6934 && client.aClass106_11322.method1413((short) -6658) != null && -708374433 * client.anInt11101 == 10) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4458, client.aClass106_11322.aClass15_1258, 1505145210);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(1057001181);
			client.aClass106_11322.method1409(class536_sub23, 1717359335);
		}
		if (!aClass498_6992.method6016((byte) 112)) {
			int i_114_ = (629054387 * anInt7009 - (-324388659 * anInt7030 >> 4)) / 8;
			int i_115_ = (629054387 * anInt7009 + (anInt7030 * -324388659 >> 4)) / 8;
			int i_116_ = ((anInt7000 * -2102751423 - (anInt7011 * -1001036419 >> 4)) / 8);
			int i_117_ = (((anInt7011 * -1001036419 >> 4) + -2102751423 * anInt7000) / 8);
			for (int i_118_ = i_114_ - 1; i_118_ <= 1 + i_115_; i_118_++) {
				for (int i_119_ = i_116_ - 1; i_119_ <= i_117_ + 1; i_119_++) {
					if (i_118_ < i_114_ || i_118_ > i_115_ || i_119_ < i_116_ || i_119_ > i_117_)
						Class116.aClass461_1432.method5555(method6267(i_118_, i_119_, -572407158), (byte) 43);
				}
			}
		}
		long l = (Class249.method3450(1663582177) - aLong7033 * -5238373949260439851L);
		if (7 == -708374433 * client.anInt11101)
			Class673.method8026(16, -1798113843);
		else if (client.anInt11101 * -708374433 == 14)
			Class673.method8026(0, -1798113843);
		else if (6 == -708374433 * client.anInt11101)
			Class673.method8026(8, -1798113843);
		else if (5 == client.anInt11101 * -708374433)
			Class673.method8026(11, -1798113843);
		else {
			Class673.method8026(9, -1798113843);
			if (client.aClass106_11322.method1413((short) 14364) != null) {
				Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4478, client.aClass106_11322.aClass15_1258, 991193209);
				class536_sub23.aClass536_Sub33_Sub2_10528.writeInt((int) l);
				client.aClass106_11322.method1409(class536_sub23, 1461488604);
			}
		}
		if (aBool7004) {
			Class214.sendPanelBoxMessage(Long.toString(Class249.method3450(1583288708) - (aLong6997 * -8589650872127847125L)));
			aBool7004 = false;
		}
		if (bool_108_) {
			synchronized (client.anObject11068) {
				client.anObject11068.notify();
			}
		}
		return true;
	}

	public void method6272() {
		aClass598_7023 = new Class598();
		anInt7000 = 0;
		anInt7009 = 0;
	}

	void method6273(Class465_Sub1 class465_sub1, byte[][] is, byte i) {
		int i_120_ = is.length;
		for (int i_121_ = 0; i_121_ < i_120_; i_121_++) {
			byte[] is_122_ = is[i_121_];
			if (null != is_122_) {
				RSByteBuffer class536_sub33 = new RSByteBuffer(is_122_);
				int i_123_ = anIntArray6996[i_121_] >> 8;
				int i_124_ = anIntArray6996[i_121_] & 0xff;
				int i_125_ = i_123_ * 64 - 1858049507 * aClass598_7023.anInt7839;
				int i_126_ = i_124_ * 64 - aClass598_7023.anInt7840 * 1479112045;
				if (!aBool7005 && null != Class184_Sub2.aClass211_9442)
					Class184_Sub2.aClass211_9442.method2987((short) 29363);
				class465_sub1.method5655(class536_sub33, i_125_, i_126_, aClass598_7023.anInt7839 * 1858049507, aClass598_7023.anInt7840 * 1479112045, (byte) -83);
				class465_sub1.method9376(Class677.aClass167_8609, class536_sub33, i_125_, i_126_, 1867269829);
			}
		}
		for (int i_127_ = 0; i_127_ < i_120_; i_127_++) {
			int i_128_ = ((anIntArray6996[i_127_] >> 8) * 64 - aClass598_7023.anInt7839 * 1858049507);
			int i_129_ = ((anIntArray6996[i_127_] & 0xff) * 64 - aClass598_7023.anInt7840 * 1479112045);
			byte[] is_130_ = is[i_127_];
			if (null == is_130_ && -2102751423 * anInt7000 < 800) {
				if (!aBool7005 && null != Class184_Sub2.aClass211_9442)
					Class184_Sub2.aClass211_9442.method2987((short) 13667);
				class465_sub1.method5654(i_128_, i_129_, 64, 64, -429552682);
			}
		}
	}

	void method6274(Class465_Sub1 class465_sub1, byte[][] is, byte i) {
		for (int i_131_ = 0; i_131_ < -1581600933 * class465_sub1.anInt5241; i_131_++) {
			if (!aBool7005)
				Class184_Sub2.aClass211_9442.method2987((short) 12794);
			for (int i_132_ = 0; i_132_ < anInt7030 * -324388659 >> 3; i_132_++) {
				for (int i_133_ = 0; i_133_ < -1001036419 * anInt7011 >> 3; i_133_++) {
					int i_134_ = anIntArrayArrayArray7002[i_131_][i_132_][i_133_];
					if (i_134_ != -1) {
						int i_135_ = i_134_ >> 24 & 0x3;
						if (!class465_sub1.aBool5298 || i_135_ == 0) {
							int i_136_ = i_134_ >> 1 & 0x3;
							int i_137_ = i_134_ >> 14 & 0x3ff;
							int i_138_ = i_134_ >> 3 & 0x7ff;
							int i_139_ = i_138_ / 8 + (i_137_ / 8 << 8);
							for (int i_140_ = 0; i_140_ < anIntArray6996.length; i_140_++) {
								if (i_139_ == anIntArray6996[i_140_] && is[i_140_] != null) {
									RSByteBuffer class536_sub33 = new RSByteBuffer(is[i_140_]);
									class465_sub1.method5637(class536_sub33, i_131_, i_132_ * 8, i_133_ * 8, i_135_, i_137_, i_138_, i_136_, -1567927402);
									class465_sub1.method9377(Class677.aClass167_8609, class536_sub33, i_131_, 8 * i_132_, 8 * i_133_, i_135_, i_137_, i_138_, i_136_, (byte) -63);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i_141_ = 0; i_141_ < -1581600933 * class465_sub1.anInt5241; i_141_++) {
			if (!aBool7005)
				Class184_Sub2.aClass211_9442.method2987((short) 11130);
			for (int i_142_ = 0; i_142_ < -324388659 * anInt7030 >> 3; i_142_++) {
				for (int i_143_ = 0; i_143_ < -1001036419 * anInt7011 >> 3; i_143_++) {
					int i_144_ = anIntArrayArrayArray7002[i_141_][i_142_][i_143_];
					if (i_144_ == -1)
						class465_sub1.method5636(i_141_, i_142_ * 8, i_143_ * 8, 8, 8, -1244783903);
				}
			}
		}
	}

	void method6275(Class465_Sub1 class465_sub1, byte[][] is, byte i) {
		for (int i_145_ = 0; i_145_ < -861422801 * anInt7022; i_145_++) {
			byte[] is_146_ = is[i_145_];
			if (is_146_ != null) {
				int i_147_ = ((anIntArray6996[i_145_] >> 8) * 64 - 1858049507 * aClass598_7023.anInt7839);
				int i_148_ = (64 * (anIntArray6996[i_145_] & 0xff) - 1479112045 * aClass598_7023.anInt7840);
				if (!aBool7005)
					Class184_Sub2.aClass211_9442.method2987((short) 32118);
				class465_sub1.method9384(Class677.aClass167_8609, is_146_, i_147_, i_148_, 995364854);
				if (aBool7005)
					method6320(10, (byte) 24);
			}
		}
	}

	void method6276(Class465_Sub1 class465_sub1, byte[][] is, int i) {
		for (int i_149_ = 0; i_149_ < class465_sub1.anInt5241 * -1581600933; i_149_++) {
			if (!aBool7005)
				Class184_Sub2.aClass211_9442.method2987((short) 32452);
			for (int i_150_ = 0; i_150_ < -324388659 * anInt7030 >> 3; i_150_++) {
				for (int i_151_ = 0; i_151_ < anInt7011 * -1001036419 >> 3; i_151_++) {
					int i_152_ = anIntArrayArrayArray7002[i_149_][i_150_][i_151_];
					if (i_152_ != -1) {
						int i_153_ = i_152_ >> 24 & 0x3;
						if (!class465_sub1.aBool5298 || 0 == i_153_) {
							int i_154_ = i_152_ >> 1 & 0x3;
							int i_155_ = i_152_ >> 14 & 0x3ff;
							int i_156_ = i_152_ >> 3 & 0x7ff;
							int i_157_ = i_156_ / 8 + (i_155_ / 8 << 8);
							for (int i_158_ = 0; i_158_ < anIntArray6996.length; i_158_++) {
								if (anIntArray6996[i_158_] == i_157_ && is[i_158_] != null) {
									class465_sub1.method9378(Class677.aClass167_8609, is[i_158_], i_149_, i_150_ * 8, 8 * i_151_, i_153_, 8 * (i_155_ & 0x7), 8 * (i_156_ & 0x7), i_154_, (byte) 78);
									break;
								}
							}
						}
					}
					if (aBool7005)
						method6320(5, (byte) -114);
				}
			}
		}
	}

	void loadChunk(int i, int i_159_, int i_160_, boolean bool, int i_161_) {
		if (1542697723 * client.anInt11074 == 2) {
			if (aBool7005)
				throw new IllegalStateException();
			client.anInt11074 = -416311143;
			client.anInt11052 = 2044763365;
		}
		if (bool || anInt7009 * 629054387 != i || -2102751423 * anInt7000 != i_159_) {
			anInt7009 = 123439995 * i;
			anInt7000 = i_159_ * -1930821439;
			if (!aBool7005) {
				Class673.method8026(i_160_, -1798113843);
				Class306.method4120(Class38.aClass38_402.method840(Class459.aClass664_5178, 1704574885), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			}
			if (aClass598_7023 != null)
				aClass598_6998 = aClass598_7023;
			else
				aClass598_6998 = new Class598(0, 0, 0);
			aClass598_7023 = new Class598(0, 8 * (629054387 * anInt7009 - (anInt7030 * -324388659 >> 4)), 8 * (-2102751423 * anInt7000 - (-1001036419 * anInt7011 >> 4)));
			aClass536_Sub18_Sub14_7014 = Class542.method6535((1858049507 * aClass598_7023.anInt7839 + anInt7030 * -324388659 / 2), (1479112045 * aClass598_7023.anInt7840 + -324388659 * anInt7030 / 2));
			aClass543_7008 = null;
			aLong7033 = -4972394634653231741L;
			if (!aBool7005)
				method6269(i_160_, -1712057137);
		}
	}

	public int method6278() {
		return 100 - anInt7017 * 14998628 / (-1838219177 * anInt7018);
	}

	public float method6279(int i) {
		return aFloat7007;
	}

	public Class34_Sub17 method6280(int i) {
		return aClass34_Sub17_7012;
	}

	void method6281() {
		aClass498_6993 = aClass498_6992;
		method6299(Class287.aClass287_3208, 1121434602);
		for (int i = 0; i < 4; i++) {
			for (int i_162_ = 0; i_162_ < anInt7030 * -324388659 >> 3; i_162_++) {
				for (int i_163_ = 0; i_163_ < -1001036419 * anInt7011 >> 3; i_163_++)
					anIntArrayArrayArray7002[i][i_162_][i_163_] = -1;
			}
		}
		for (Class536_Sub27 class536_sub27 = ((Class536_Sub27) Class193.aClass708_2181.method8308(1867269829)); null != class536_sub27; class536_sub27 = (Class536_Sub27) Class193.aClass708_2181.method8311(1594282319)) {
			int i = class536_sub27.anInt10538 * -1674752119;
			boolean bool = 1 == (i & 0x1);
			int i_164_ = -1256230887 * class536_sub27.anInt10540 >> 3;
			int i_165_ = -337130859 * class536_sub27.anInt10536 >> 3;
			int i_166_ = 1174354059 * class536_sub27.anInt10535;
			int i_167_ = class536_sub27.anInt10539 * 1973961159;
			int i_168_ = class536_sub27.anInt10534 * -1181488613;
			int i_169_ = class536_sub27.anInt10537 * -182281589;
			int i_170_ = -706160771 * class536_sub27.anInt10542;
			int i_171_ = class536_sub27.anInt10541 * 453775873;
			int i_172_ = 0;
			int i_173_ = 0;
			int i_174_ = 1;
			int i_175_ = 1;
			if (i == 1) {
				i_173_ = i_170_ - 1;
				i_174_ = -1;
			} else if (i == 2) {
				i_173_ = i_170_ - 1;
				i_172_ = i_171_ - 1;
				i_174_ = -1;
				i_175_ = -1;
			} else if (3 == i) {
				i_172_ = i_171_ - 1;
				i_174_ = 1;
				i_175_ = -1;
			}
			int i_176_ = i_165_;
			while (i_176_ < i_171_ + i_165_) {
				int i_177_ = i_173_;
				int i_178_ = i_164_;
				while (i_178_ < i_170_ + i_164_) {
					if (bool)
						anIntArrayArrayArray7002[i_169_][i_172_ + i_166_][i_177_ + i_167_] = (i << 1) + ((i_176_ << 3) + ((i_178_ << 14) + (i_168_ << 24)));
					else
						anIntArrayArrayArray7002[i_169_][i_166_ + i_177_][i_172_ + i_167_] = ((i_168_ << 24) + (i_178_ << 14) + (i_176_ << 3) + (i << 1));
					i_178_++;
					i_177_ += i_174_;
				}
				i_176_++;
				i_172_ += i_175_;
			}
		}
		int i = client.anInt11114 * 1066050771;
		anIntArray6996 = new int[i];
		anIntArray7024 = new int[i];
		aByteArrayArray7025 = new byte[i][];
		aByteArrayArray7026 = new byte[i][];
		aByteArrayArray7027 = null;
		aByteArrayArray7028 = new byte[i][];
		aByteArrayArray7029 = new byte[i][];
		i = 0;
		for (Class536_Sub27 class536_sub27 = ((Class536_Sub27) Class193.aClass708_2181.method8308(1867269829)); class536_sub27 != null; class536_sub27 = (Class536_Sub27) Class193.aClass708_2181.method8311(1455876060)) {
			int i_179_ = -1256230887 * class536_sub27.anInt10540 >>> 3;
			int i_180_ = class536_sub27.anInt10536 * -337130859 >>> 3;
			int i_181_ = i_179_ + class536_sub27.anInt10542 * -706160771;
			if ((i_181_ & 0x7) == 0)
				i_181_--;
			i_181_ >>>= 3;
			int i_182_ = i_180_ + 453775873 * class536_sub27.anInt10541;
			if ((i_182_ & 0x7) == 0)
				i_182_--;
			i_182_ >>>= 3;
			for (int i_183_ = i_179_ >>> 3; i_183_ <= i_181_; i_183_++) {
				while_3_: for (int i_184_ = i_180_ >>> 3; i_184_ <= i_182_; i_184_++) {
					int i_185_ = i_183_ << 8 | i_184_;
					for (int i_186_ = 0; i_186_ < i; i_186_++) {
						if (anIntArray6996[i_186_] == i_185_)
							continue while_3_;
					}
					if (Class116.aClass461_1432.method5553(method6267(i_183_, i_184_, 545280734), Class468.aClass468_5348.anInt5354 * 1600259987, -1898516406)) {
						anIntArray6996[i] = i_185_;
						anIntArray7024[i] = method6267(i_183_, i_184_, 204819768);
						i++;
					}
				}
			}
		}
		anInt7022 = i * -1538430001;
		loadChunk(anInt7030 * -324388659 >> 4, anInt7011 * -1001036419 >> 4, 10, false, -838804833);
	}

	public int method6282() {
		return -1001036419 * anInt7011;
	}

	public int method6283() {
		return -1001036419 * anInt7011;
	}

	public int method6284() {
		return -1001036419 * anInt7011;
	}

	public int method6285() {
		return -1001036419 * anInt7011;
	}

	public int[][] method6286(byte i) {
		return anIntArrayArray7001;
	}

	public int method6287() {
		return -833740267 * anInt7006;
	}

	public int method6288() {
		return -833740267 * anInt7006;
	}

	public int method6289() {
		return anInt7020 * -831210981;
	}

	public int method6290() {
		return anInt7020 * -831210981;
	}

	public void method6291(Class510 class510, byte i) {
		aClass498_6992 = class510.aClass498_6925;
		if (aClass498_6992 == Class498.aClass498_5559)
			method6296(1404727975);
		else if (aClass498_6992 == Class498.aClass498_5557)
			decodeMapScene(class510.aClass536_Sub33_Sub2_6924, (byte) 102);
		else if (aClass498_6992 == Class498.aClass498_5556)
			method6256((byte) 28);
		else if (aClass498_6992.method6016((byte) -101))
			decodeDynamicMapScene(class510.aClass536_Sub33_Sub2_6924, -658435570);
	}

	public Class465_Sub1 method6292(int i) {
		return aClass465_Sub1_6991;
	}

	public int method6293() {
		return 100 - anInt7019 * -324909788 / (-243156907 * anInt7015);
	}

	void method6294(int i) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public int[][] method6295(int i) {
		return anIntArrayArray7013;
	}

	void method6296(int i) {
		method6299(Class510.method6188(Class710.aClass536_Sub40_8843.aClass710_Sub8_10770.method9996((byte) 101), -1248789177), 1121434602);
		int i_187_ = aClass598_7023.anInt7839 * 1858049507;
		int i_188_ = aClass598_7023.anInt7840 * 1479112045;
		int i_189_ = (i_187_ >> 3) + (Class637.anInt8301 * -1607026219 >> 12);
		int i_190_ = (-1646092097 * Class685.anInt8665 >> 12) + (i_188_ >> 3);
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839 = (byte) 0;
		Class320.anInt3539 = 0;
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method11087(8, 8, (byte) 1);
		int i_191_ = 18;
		anIntArray6996 = new int[i_191_];
		anIntArray7024 = new int[i_191_];
		aByteArrayArray7025 = new byte[i_191_][];
		aByteArrayArray7026 = new byte[i_191_][];
		aByteArrayArray7027 = new byte[i_191_][];
		aByteArrayArray7028 = new byte[i_191_][];
		aByteArrayArray7029 = new byte[i_191_][];
		i_191_ = 0;
		for (int i_192_ = (i_189_ - (-324388659 * anInt7030 >> 4)) / 8; i_192_ <= (i_189_ + (-324388659 * anInt7030 >> 4)) / 8; i_192_++) {
			for (int i_193_ = (i_190_ - (anInt7011 * -1001036419 >> 4)) / 8; i_193_ <= ((anInt7011 * -1001036419 >> 4) + i_190_) / 8; i_193_++) {
				int i_194_ = i_193_ + (i_192_ << 8);
				if (Class116.aClass461_1432.method5553(method6267(i_192_, i_193_, -1171925999), Class468.aClass468_5348.anInt5354 * 1600259987, -740994157)) {
					anIntArray6996[i_191_] = i_194_;
					anIntArray7024[i_191_] = method6267(i_192_, i_193_, -1938995883);
					i_191_++;
				}
			}
		}
		anInt7022 = i_191_ * -1538430001;
		int i_195_;
		if (-708374433 * client.anInt11101 == 16)
			i_195_ = 7;
		else if (8 == -708374433 * client.anInt11101)
			i_195_ = 6;
		else if (-708374433 * client.anInt11101 == 0)
			i_195_ = 14;
		else if (client.anInt11101 * -708374433 == 11)
			i_195_ = 5;
		else
			throw new RuntimeException(new StringBuilder().append("").append(-708374433 * client.anInt11101).toString());
		loadChunk(i_189_, i_190_, i_195_, false, -1294156171);
	}

	public int method6297() {
		return -1001036419 * anInt7011;
	}

	public Class516 method6298(int i) {
		return aClass516_7016;
	}

	void method6299(Class287 class287, int i) {
		if (aClass287_7032 != class287) {
			anInt7030 = (anInt7011 = -323561691 * class287.anInt3204) * 1603772273;
			anIntArrayArrayArray7002 = (new int[4][-324388659 * anInt7030 >> 3][-1001036419 * anInt7011 >> 3]);
			anIntArrayArray7013 = new int[-324388659 * anInt7030][-1001036419 * anInt7011];
			anIntArrayArray7001 = new int[-324388659 * anInt7030][anInt7011 * -1001036419];
			aByteArrayArrayArray7031 = new byte[4][anInt7030 * -324388659][anInt7011 * -1001036419];
			aClass455_6999 = new Class455(4, anInt7030 * -324388659, anInt7011 * -1001036419);
			method6261(false, 2007522021);
			Class40.method873(-844573503);
			aClass287_7032 = class287;
		}
	}

	public void method6300() {
		aClass598_7023 = new Class598();
		anInt7000 = 0;
		anInt7009 = 0;
	}

	public void method6301() {
		aClass598_7023 = new Class598();
		anInt7000 = 0;
		anInt7009 = 0;
	}

	public void method6302() {
		aClass598_7023 = new Class598();
		anInt7000 = 0;
		anInt7009 = 0;
	}

	public void method6303() {
		if (null != aClass553_7003) {
			Class270.method3713(-936627569);
			aHashMap7034 = aClass553_7003.method6740((byte) 36);
			aClass553_7003.aClass564_7477.method6872(-1031389842);
			aClass553_7003 = null;
		}
	}

	public void method6304() {
		if (null != aClass553_7003) {
			Class270.method3713(-1337099503);
			aHashMap7034 = aClass553_7003.method6740((byte) 124);
			aClass553_7003.aClass564_7477.method6872(19648150);
			aClass553_7003 = null;
		}
	}

	public void method6305() {
		aClass516_7016 = Class516.aClass516_7039;
		anInt7017 = 0;
		anInt7018 = -1076761753;
		anInt7019 = 0;
		anInt7015 = -172129027;
		anInt7021 = 0;
	}

	void method6306(int i) {
		int i_196_ = aByteArrayArray7027.length;
		for (int i_197_ = 0; i_197_ < i_196_; i_197_++) {
			if (null != aByteArrayArray7027[i_197_]) {
				int i_198_ = -1;
				for (int i_199_ = 0; i_199_ < client.anInt11071 * 139694587; i_199_++) {
					if (anIntArray6996[i_197_] == client.anIntArray11070[i_199_]) {
						i_198_ = i_199_;
						break;
					}
				}
				if (i_198_ == -1) {
					client.anIntArray11070[client.anInt11071 * 139694587] = anIntArray6996[i_197_];
					i_198_ = (client.anInt11071 += -1144729293) * 139694587 - 1;
				}
				RSByteBuffer class536_sub33 = new RSByteBuffer(aByteArrayArray7027[i_197_]);
				int i_200_ = 0;
				while ((class536_sub33.off * -810172525 < aByteArrayArray7027[i_197_].length) && i_200_ < 511 && -664631943 * client.anInt11053 < 1023) {
					int i_201_ = i_198_ | i_200_++ << 6;
					int i_202_ = class536_sub33.readUnsignedShort();
					int i_203_ = i_202_ >> 14;
					int i_204_ = i_202_ >> 7 & 0x3f;
					int i_205_ = i_202_ & 0x3f;
					int i_206_ = ((anIntArray6996[i_197_] >> 8) * 64 - 1858049507 * aClass598_7023.anInt7839 + i_204_);
					int i_207_ = i_205_ + (64 * (anIntArray6996[i_197_] & 0xff) - 1479112045 * aClass598_7023.anInt7840);
					Class296 class296 = ((Class296) (Class172.aClass34_Sub7_1922.method70(class536_sub33.readUnsignedShort(), (byte) -16)));
					ObjectParam class536_sub13 = ((ObjectParam) client.aClass4_11050.method556((long) i_201_));
					if (class536_sub13 == null && (class296.aByte3316 & 0x1) > 0 && i_206_ >= 0 && (i_206_ + 830254667 * class296.anInt3272 < -324388659 * anInt7030) && i_207_ >= 0 && (i_207_ + 830254667 * class296.anInt3272 < -1001036419 * anInt7011)) {
						NPC class649_sub1_sub5_sub1_sub1 = new NPC(aClass553_7003);
						class649_sub1_sub5_sub1_sub1.anInt11889 = i_201_ * 675537735;
						ObjectParam class536_sub13_208_ = new ObjectParam(class649_sub1_sub5_sub1_sub1);
						client.aClass4_11050.method560(class536_sub13_208_, (long) i_201_);
						client.aClass536_Sub13Array11044[((client.anInt11164 += -255707597) * -1683770117) - 1] = class536_sub13_208_;
						client.anIntArray11211[((client.anInt11053 += -1094331191) * -664631943 - 1)] = i_201_;
						class649_sub1_sub5_sub1_sub1.anInt11934 = 653611363 * client.cycles;
						class649_sub1_sub5_sub1_sub1.method11065(class296, 179188063);
						class649_sub1_sub5_sub1_sub1.method10873(830254667 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272), -324388659);
						class649_sub1_sub5_sub1_sub1.anInt11938 = -1906385303 * (((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3318) * 235698067) << 3);
						class649_sub1_sub5_sub1_sub1.method10893(class649_sub1_sub5_sub1_sub1.aClass296_12174.aClass679_3328.method8063(-592081144).method78() << 11 & 0x3fff, true, (byte) 69);
						class649_sub1_sub5_sub1_sub1.method11067(i_203_, i_206_, i_207_, true, class649_sub1_sub5_sub1_sub1.method10874(), -1578406959);
					}
				}
			}
		}
	}

	public void method6307() {
		aClass636_6994.method7608(this, null, 0, -1699115930);
	}

	public void method6308() {
		aClass636_6994.method7608(this, null, 0, -1699115930);
	}

	public void method6309() {
		aClass636_6994.method7608(this, null, 0, -1699115930);
	}

	public void method6310() {
		anInt7006 = 2117261224;
		if (0 == anInt7030 * -324388659)
			anInt7020 = -1701314582;
		else
			anInt7020 = ((int) (34.46 * (double) (-324388659 * anInt7030)) * 1214615571);
		anInt7020 = (anInt7020 * -831210981 << 2) * 1214615571;
		if (Class677.aClass167_8609.method2407())
			anInt7020 += -887085568;
	}

	public void method6311() {
		anInt7006 = 2117261224;
		if (0 == anInt7030 * -324388659)
			anInt7020 = -1701314582;
		else
			anInt7020 = ((int) (34.46 * (double) (-324388659 * anInt7030)) * 1214615571);
		anInt7020 = (anInt7020 * -831210981 << 2) * 1214615571;
		if (Class677.aClass167_8609.method2407())
			anInt7020 += -887085568;
	}

	public float method6312() {
		return aFloat7007;
	}

	void method6313() {
		method6299(Class510.method6188(Class710.aClass536_Sub40_8843.aClass710_Sub8_10770.method9996((byte) 127), -880834776), 1121434602);
		int i = aClass598_7023.anInt7839 * 1858049507;
		int i_209_ = aClass598_7023.anInt7840 * 1479112045;
		int i_210_ = (i >> 3) + (Class637.anInt8301 * -1607026219 >> 12);
		int i_211_ = (-1646092097 * Class685.anInt8665 >> 12) + (i_209_ >> 3);
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839 = (byte) 0;
		Class320.anInt3539 = 0;
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method11087(8, 8, (byte) 1);
		int i_212_ = 18;
		anIntArray6996 = new int[i_212_];
		anIntArray7024 = new int[i_212_];
		aByteArrayArray7025 = new byte[i_212_][];
		aByteArrayArray7026 = new byte[i_212_][];
		aByteArrayArray7027 = new byte[i_212_][];
		aByteArrayArray7028 = new byte[i_212_][];
		aByteArrayArray7029 = new byte[i_212_][];
		i_212_ = 0;
		for (int i_213_ = (i_210_ - (-324388659 * anInt7030 >> 4)) / 8; i_213_ <= (i_210_ + (-324388659 * anInt7030 >> 4)) / 8; i_213_++) {
			for (int i_214_ = (i_211_ - (anInt7011 * -1001036419 >> 4)) / 8; i_214_ <= ((anInt7011 * -1001036419 >> 4) + i_211_) / 8; i_214_++) {
				int i_215_ = i_214_ + (i_213_ << 8);
				if (Class116.aClass461_1432.method5553(method6267(i_213_, i_214_, 1223868841), Class468.aClass468_5348.anInt5354 * 1600259987, -415482118)) {
					anIntArray6996[i_212_] = i_215_;
					anIntArray7024[i_212_] = method6267(i_213_, i_214_, -85679459);
					i_212_++;
				}
			}
		}
		anInt7022 = i_212_ * -1538430001;
		int i_216_;
		if (-708374433 * client.anInt11101 == 16)
			i_216_ = 7;
		else if (8 == -708374433 * client.anInt11101)
			i_216_ = 6;
		else if (-708374433 * client.anInt11101 == 0)
			i_216_ = 14;
		else if (client.anInt11101 * -708374433 == 11)
			i_216_ = 5;
		else
			throw new RuntimeException(new StringBuilder().append("").append(-708374433 * client.anInt11101).toString());
		loadChunk(i_210_, i_211_, i_216_, false, -827065691);
	}

	public byte[][][] method6314(byte i) {
		return aByteArrayArrayArray7031;
	}

	public Class498 method6315(int i) {
		return aClass498_6992;
	}

	void method6316() {
		if (aClass498_6992 != Class498.aClass498_5556 && Class498.aClass498_5556 != aClass498_6993) {
			if (Class498.aClass498_5558 == aClass498_6992 || Class498.aClass498_5560 == aClass498_6992 || (aClass498_6993 != aClass498_6992 && (Class498.aClass498_5557 == aClass498_6992 || Class498.aClass498_5557 == aClass498_6993))) {
				Iterator iterator = client.aClass4_11050.iterator();
				while (iterator.hasNext()) {
					ObjectParam class536_sub13 = (ObjectParam) iterator.next();
					Class18.method688(((NPC) class536_sub13.value), -284180918);
				}
				client.anInt11053 = 0;
				client.anInt11164 = 0;
				client.aClass4_11050.method561(-2117553523);
			}
			aClass498_6993 = aClass498_6992;
		}
	}

	void method6317() {
		aClass465_Sub1_6995 = null;
		aClass465_Sub1_6991 = null;
		if (null != aClass455_6999)
			aClass455_6999.method5464(-1943093829);
		if (null != aClass636_6994)
			aClass636_6994.method7576((byte) -89);
		if (aClass553_7003 != null) {
			aClass553_7003.aClass564_7477.method6872(-765637653);
			aClass553_7003 = null;
		}
	}

	void method6318(int i) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void method6319(int i) {
		if (aBool7005) {
			method6260((byte) 30);
			aLong7033 = -4972394634653231741L;
			Class515 class515_217_ = client.aClass515_11066;
			anInt7022 = 1 * class515_217_.anInt7022;
			anIntArray6996 = class515_217_.anIntArray6996;
			anIntArray7024 = class515_217_.anIntArray7024;
			aByteArrayArray7025 = class515_217_.aByteArrayArray7025;
			aByteArrayArray7026 = class515_217_.aByteArrayArray7026;
			aByteArrayArray7027 = class515_217_.aByteArrayArray7027;
			aByteArrayArray7028 = class515_217_.aByteArrayArray7028;
			aByteArrayArray7029 = class515_217_.aByteArrayArray7029;
			aClass455_6999 = class515_217_.aClass455_6999;
			aClass636_6994 = class515_217_.aClass636_6994;
			anIntArrayArrayArray7002 = class515_217_.anIntArrayArrayArray7002;
			anInt7006 = class515_217_.anInt7006 * 1;
			anInt7020 = class515_217_.anInt7020 * 1;
			aClass536_Sub18_Sub14_7014 = class515_217_.aClass536_Sub18_Sub14_7014;
			aClass543_7008 = class515_217_.aClass543_7008;
			anIntArrayArray7013 = class515_217_.anIntArrayArray7013;
			anIntArrayArray7001 = class515_217_.anIntArrayArray7001;
			aByteArrayArrayArray7031 = class515_217_.aByteArrayArrayArray7031;
			aClass498_6992 = class515_217_.aClass498_6992;
			aClass287_7032 = class515_217_.aClass287_7032;
			aClass598_7023 = class515_217_.aClass598_7023;
			aClass598_6998 = class515_217_.aClass598_6998;
			anInt7009 = 1 * class515_217_.anInt7009;
			anInt7000 = 1 * class515_217_.anInt7000;
			anInt7030 = 1 * class515_217_.anInt7030;
			anInt7011 = class515_217_.anInt7011 * 1;
		} else if (16 == client.anInt11101 * -708374433)
			Class673.method8026(7, -1798113843);
		else if (client.anInt11101 * -708374433 == 0)
			Class673.method8026(14, -1798113843);
		else if (8 == client.anInt11101 * -708374433)
			Class673.method8026(6, -1798113843);
		else if (client.anInt11101 * -708374433 == 9)
			Class673.method8026(10, -1798113843);
		else if (-708374433 * client.anInt11101 == 11)
			Class673.method8026(5, -1798113843);
	}

	void method6320(int i, byte i_218_) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public int method6321(byte i) {
		return -324388659 * anInt7030;
	}

	void method6322() {
		int i = aByteArrayArray7027.length;
		for (int i_219_ = 0; i_219_ < i; i_219_++) {
			if (null != aByteArrayArray7027[i_219_]) {
				int i_220_ = -1;
				for (int i_221_ = 0; i_221_ < client.anInt11071 * 139694587; i_221_++) {
					if (anIntArray6996[i_219_] == client.anIntArray11070[i_221_]) {
						i_220_ = i_221_;
						break;
					}
				}
				if (i_220_ == -1) {
					client.anIntArray11070[client.anInt11071 * 139694587] = anIntArray6996[i_219_];
					i_220_ = (client.anInt11071 += -1144729293) * 139694587 - 1;
				}
				RSByteBuffer class536_sub33 = new RSByteBuffer(aByteArrayArray7027[i_219_]);
				int i_222_ = 0;
				while ((class536_sub33.off * -810172525 < aByteArrayArray7027[i_219_].length) && i_222_ < 511 && -664631943 * client.anInt11053 < 1023) {
					int i_223_ = i_220_ | i_222_++ << 6;
					int i_224_ = class536_sub33.readUnsignedShort();
					int i_225_ = i_224_ >> 14;
					int i_226_ = i_224_ >> 7 & 0x3f;
					int i_227_ = i_224_ & 0x3f;
					int i_228_ = ((anIntArray6996[i_219_] >> 8) * 64 - 1858049507 * aClass598_7023.anInt7839 + i_226_);
					int i_229_ = i_227_ + (64 * (anIntArray6996[i_219_] & 0xff) - 1479112045 * aClass598_7023.anInt7840);
					Class296 class296 = ((Class296) (Class172.aClass34_Sub7_1922.method70(class536_sub33.readUnsignedShort(), (byte) -32)));
					ObjectParam class536_sub13 = ((ObjectParam) client.aClass4_11050.method556((long) i_223_));
					if (class536_sub13 == null && (class296.aByte3316 & 0x1) > 0 && i_228_ >= 0 && (i_228_ + 830254667 * class296.anInt3272 < -324388659 * anInt7030) && i_229_ >= 0 && (i_229_ + 830254667 * class296.anInt3272 < -1001036419 * anInt7011)) {
						NPC class649_sub1_sub5_sub1_sub1 = new NPC(aClass553_7003);
						class649_sub1_sub5_sub1_sub1.anInt11889 = i_223_ * 675537735;
						ObjectParam class536_sub13_230_ = new ObjectParam(class649_sub1_sub5_sub1_sub1);
						client.aClass4_11050.method560(class536_sub13_230_, (long) i_223_);
						client.aClass536_Sub13Array11044[((client.anInt11164 += -255707597) * -1683770117) - 1] = class536_sub13_230_;
						client.anIntArray11211[((client.anInt11053 += -1094331191) * -664631943 - 1)] = i_223_;
						class649_sub1_sub5_sub1_sub1.anInt11934 = 653611363 * client.cycles;
						class649_sub1_sub5_sub1_sub1.method11065(class296, 179188063);
						class649_sub1_sub5_sub1_sub1.method10873(830254667 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272), -324388659);
						class649_sub1_sub5_sub1_sub1.anInt11938 = -1906385303 * (((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3318) * 235698067) << 3);
						class649_sub1_sub5_sub1_sub1.method10893(class649_sub1_sub5_sub1_sub1.aClass296_12174.aClass679_3328.method8063(72511004).method78() << 11 & 0x3fff, true, (byte) 116);
						class649_sub1_sub5_sub1_sub1.method11067(i_225_, i_228_, i_229_, true, class649_sub1_sub5_sub1_sub1.method10874(), -1596854400);
					}
				}
			}
		}
	}

	static final void method6323(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_231_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_232_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class499.method6024(i_231_, i_232_, false, -978258019);
	}

	public static Class2 method6324(Class461 class461, int i, Interface4 interface4, int i_233_) {
		byte[] is = class461.method5595(i, -1592946383);
		if (is == null)
			return null;
		return new Class2(is, interface4);
	}

	static void method6325(Class106 class106, int i) {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4424, class106.aClass15_1258, 855820232);
		class106.method1409(class536_sub23, 810270165);
		client.aBool11172 = true;
	}
}
