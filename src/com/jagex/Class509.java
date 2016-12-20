/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Class509 {
	int anInt6925;
	Class503 aClass503_6926;
	Class503 aClass503_6927;
	Class282 aClass282_6928;
	Class527_Sub8_Sub12 aClass527_Sub8_Sub12_6929;
	int[] anIntArray6930;
	Class592 aClass592_6931 = new Class592();
	Class456_Sub1 aClass456_Sub1_6932;
	int anInt6933;
	Class555 aClass555_6934;
	int anInt6935;
	Class623 aClass623_6936;
	boolean aBool6937;
	public int anInt6938;
	public boolean aBool6939;
	byte[][][] aByteArrayArrayArray6940;
	int anInt6941;
	byte[][] aByteArrayArray6942;
	Class532 aClass532_6943;
	Class512 aClass512_6944;
	float aFloat6945;
	Class24_Sub6 aClass24_Sub6_6946;
	int[][] anIntArrayArray6947;
	int[][] anIntArrayArray6948;
	Class456_Sub1 aClass456_Sub1_6949;
	int anInt6950;
	Class592 aClass592_6951 = new Class592();
	int anInt6952;
	int anInt6953;
	int anInt6954;
	byte[][] aByteArrayArray6955;
	int anInt6956;
	Class470 aClass470_6957;
	int[] anIntArray6958;
	byte[][] aByteArrayArray6959;
	byte[][] aByteArrayArray6960;
	int anInt6961;
	byte[][] aByteArrayArray6962;
	Class500 aClass500_6963;
	int[][][] anIntArrayArrayArray6964;
	int anInt6965;
	public long aLong6966;
	public long aLong6967;
	HashMap aHashMap6968;
	int anInt6969;
	public static Class459 aClass459_6970;
	static int anInt6971;

	void method8278(int i) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public Class503 method8279(int i) {
		return aClass503_6926;
	}

	public void method8280(Class514 class514, int i) {
		aClass503_6926 = class514.aClass503_7010;
		if (aClass503_6926 == Class503.aClass503_6879)
			method8400((byte) -80);
		else if (aClass503_6926 == Class503.aClass503_6876)
			method8386(class514.aClass527_Sub38_Sub2_7011, (byte) 126);
		else if (Class503.aClass503_6875 == aClass503_6926)
			method8312(738082887);
		else if (aClass503_6926.method8206(-1412044639))
			method8293(class514.aClass527_Sub38_Sub2_7011, -2023707039);
	}

	public int method8281(int i) {
		return 100 - -2056797588 * anInt6925 / (anInt6952 * -1756875253);
	}

	public int method8282(byte i) {
		return 100 - 1404849692 * anInt6953 / (anInt6954 * -66692121);
	}

	public Class592 method8283(short i) {
		return aClass592_6931;
	}

	public int method8284(byte i) {
		return -1501092105 * anInt6935;
	}

	public int method8285(int i) {
		return anInt6956 * 1417173501;
	}

	public Class532 method8286(int i) {
		return aClass532_6943;
	}

	public Class512 method8287(int i) {
		return aClass512_6944;
	}

	public float method8288(int i) {
		return aFloat6945;
	}

	public int[][] method8289() {
		return anIntArrayArray6948;
	}

	void method8290(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = class527_sub38_sub2.readUnsignedShort();
		int i_0_ = class527_sub38_sub2.readUnsignedByteC(-711840460);
		boolean bool = class527_sub38_sub2.readUnsignedByteC(-761360675) == 1;
		anInt6938 = class527_sub38_sub2.readUnsignedByte() * -1552819617;
		int i_1_ = class527_sub38_sub2.readUnsignedShort();
		int i_2_ = class527_sub38_sub2.readUnsignedByteC(-1035651605);
		if (!aBool6937)
			method8316((byte) -1);
		method8405(Class255.method4705(i_0_, 1194348987), -32211252);
		anIntArray6930 = new int[i_2_];
		anIntArray6958 = new int[i_2_];
		aByteArrayArray6959 = new byte[i_2_][];
		aByteArrayArray6960 = new byte[i_2_][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i_2_][];
		aByteArrayArray6955 = new byte[i_2_][];
		i_2_ = 0;
		for (int i_3_ = (i - (-1501092105 * anInt6935 >> 4)) / 8; i_3_ <= (i + (anInt6935 * -1501092105 >> 4)) / 8; i_3_++) {
			for (int i_4_ = (i_1_ - (1417173501 * anInt6956 >> 4)) / 8; i_4_ <= ((anInt6956 * 1417173501 >> 4) + i_1_) / 8; i_4_++) {
				if (Class64.aClass459_743.method7474(method8379(i_3_, i_4_, -633207463), -983826993 * Class464.aClass464_5295.anInt5292, -103199583)) {
					anIntArray6930[i_2_] = i_4_ + (i_3_ << 8);
					anIntArray6958[i_2_] = method8379(i_3_, i_4_, -633207463);
					i_2_++;
				}
			}
		}
		anInt6950 = 1083007835 * i_2_;
		method8317(i, i_1_, 10, bool, (byte) -50);
	}

	void method8291(Class456_Sub1 class456_sub1, byte[][] is, int i) {
		for (int i_5_ = 0; i_5_ < 587945237 * class456_sub1.anInt5047; i_5_++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(1258814027);
			for (int i_6_ = 0; i_6_ < anInt6935 * -1501092105 >> 3; i_6_++) {
				for (int i_7_ = 0; i_7_ < anInt6956 * 1417173501 >> 3; i_7_++) {
					int i_8_ = anIntArrayArrayArray6964[i_5_][i_6_][i_7_];
					if (i_8_ != -1) {
						int i_9_ = i_8_ >> 24 & 0x3;
						if (!class456_sub1.aBool4976 || i_9_ == 0) {
							int i_10_ = i_8_ >> 1 & 0x3;
							int i_11_ = i_8_ >> 14 & 0x3ff;
							int i_12_ = i_8_ >> 3 & 0x7ff;
							int i_13_ = (i_11_ / 8 << 8) + i_12_ / 8;
							for (int i_14_ = 0; i_14_ < anIntArray6930.length; i_14_++) {
								if (i_13_ == anIntArray6930[i_14_] && is[i_14_] != null) {
									RSByteBuffer class527_sub38 = new RSByteBuffer(is[i_14_]);
									class456_sub1.method7398(class527_sub38, i_5_, i_6_ * 8, i_7_ * 8, i_9_, i_11_, i_12_, i_10_, -1623153217);
									class456_sub1.method15959(Class402.aClass180_4150, class527_sub38, i_5_, i_6_ * 8, 8 * i_7_, i_9_, i_11_, i_12_, i_10_, (byte) 74);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i_15_ = 0; i_15_ < class456_sub1.anInt5047 * 587945237; i_15_++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(-648391667);
			for (int i_16_ = 0; i_16_ < anInt6935 * -1501092105 >> 3; i_16_++) {
				for (int i_17_ = 0; i_17_ < 1417173501 * anInt6956 >> 3; i_17_++) {
					int i_18_ = anIntArrayArrayArray6964[i_15_][i_16_][i_17_];
					if (i_18_ == -1)
						class456_sub1.method7352(i_15_, i_16_ * 8, i_17_ * 8, 8, 8, -375517254);
				}
			}
		}
	}

	public Class500 method8292(byte i) {
		return aClass500_6963;
	}

	void method8293(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		int i_19_ = class527_sub38_sub2.readUnsignedShortLE((byte) 124);
		int i_20_ = class527_sub38_sub2.readUnsignedByte128();
		int i_21_ = class527_sub38_sub2.readUnsignedByte();
		if (1 == i_21_)
			aClass503_6926 = Class503.aClass503_6877;
		else if (2 == i_21_)
			aClass503_6926 = Class503.aClass503_6878;
		else if (i_21_ == 3)
			aClass503_6926 = Class503.aClass503_6874;
		else if (4 == i_21_)
			aClass503_6926 = Class503.aClass503_6883;
		int i_22_ = class527_sub38_sub2.readUnsignedShort();
		anInt6938 = class527_sub38_sub2.readUnsignedByteC(-1433246274) * -1552819617;
		int i_23_ = class527_sub38_sub2.readUnsignedByteC(-866428032);
		boolean bool = (i_23_ & 0x1) != 0;
		if (!aBool6937)
			method8316((byte) -1);
		method8405(Class255.method4705(i_20_, 1039164800), -32211252);
		class527_sub38_sub2.method18450(1798035436);
		HashSet hashset = new HashSet();
		for (int i_24_ = 0; i_24_ < 4; i_24_++) {
			for (int i_25_ = 0; i_25_ < anInt6935 * -1501092105 >> 3; i_25_++) {
				for (int i_26_ = 0; i_26_ < anInt6956 * 1417173501 >> 3; i_26_++) {
					int i_27_ = class527_sub38_sub2.method18469(1, -1398301137);
					if (i_27_ == 1) {
						int i_28_ = class527_sub38_sub2.method18469(26, 1774652821);
						anIntArrayArrayArray6964[i_24_][i_25_][i_26_] = i_28_;
						int i_29_ = i_28_ >> 14 & 0x3ff;
						int i_30_ = i_28_ >> 3 & 0x7ff;
						int i_31_ = i_29_ >> 3 << 8 | i_30_ >> 3;
						hashset.add(Integer.valueOf(i_31_));
					} else
						anIntArrayArrayArray6964[i_24_][i_25_][i_26_] = -1;
				}
			}
		}
		class527_sub38_sub2.method18452(1840702163);
		int i_32_ = hashset.size();
		anIntArray6930 = new int[i_32_];
		anIntArray6958 = new int[i_32_];
		aByteArrayArray6959 = new byte[i_32_][];
		aByteArrayArray6960 = new byte[i_32_][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i_32_][];
		aByteArrayArray6955 = new byte[i_32_][];
		i_32_ = 0;
		for (int i_33_ = 0; i_33_ < 4; i_33_++) {
			for (int i_34_ = 0; i_34_ < -1501092105 * anInt6935 >> 3; i_34_++) {
				for (int i_35_ = 0; i_35_ < anInt6956 * 1417173501 >> 3; i_35_++) {
					int i_36_ = anIntArrayArrayArray6964[i_33_][i_34_][i_35_];
					if (i_36_ != -1) {
						int i_37_ = i_36_ >> 14 & 0x3ff;
						int i_38_ = i_36_ >> 3 & 0x7ff;
						int i_39_ = (i_37_ / 8 << 8) + i_38_ / 8;
						for (int i_40_ = 0; i_40_ < i_32_; i_40_++) {
							if (anIntArray6930[i_40_] == i_39_) {
								i_39_ = -1;
								break;
							}
						}
						if (-1 != i_39_) {
							int i_41_ = i_39_ >> 8 & 0xff;
							int i_42_ = i_39_ & 0xff;
							if (Class64.aClass459_743.method7474(method8379(i_41_, i_42_, -633207463), (-983826993 * Class464.aClass464_5295.anInt5292), -1122074915)) {
								anIntArray6930[i_32_] = i_39_;
								anIntArray6958[i_32_] = method8379(i_41_, i_42_, -633207463);
								i_32_++;
							}
						}
					}
				}
			}
		}
		anInt6950 = i_32_ * 1083007835;
		method8317(i_22_, i_19_, 10, bool, (byte) -107);
	}

	void method8294(int i) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method8295(Class282 class282) {
		if (aClass282_6928 != class282) {
			anInt6935 = (anInt6956 = -707703295 * class282.anInt3197) * -1427798613;
			anIntArrayArrayArray6964 = (new int[4][anInt6935 * -1501092105 >> 3][anInt6956 * 1417173501 >> 3]);
			anIntArrayArray6947 = new int[anInt6935 * -1501092105][anInt6956 * 1417173501];
			anIntArrayArray6948 = new int[-1501092105 * anInt6935][anInt6956 * 1417173501];
			aByteArrayArrayArray6940 = new byte[4][anInt6935 * -1501092105][anInt6956 * 1417173501];
			aClass470_6957 = new Class470(4, -1501092105 * anInt6935, anInt6956 * 1417173501);
			method8305(false, -2137216324);
			Class202.method3772(-570327033);
			aClass282_6928 = class282;
		}
	}

	public int[][] method8296(int i) {
		return anIntArrayArray6947;
	}

	public int[][] method8297(int i) {
		return anIntArrayArray6948;
	}

	public void method8298() {
		if (aBool6937) {
			method8304(1034600608);
			aLong6967 = -4523297059643251975L;
			Class509 class509_43_ = client.aClass509_11072;
			anInt6950 = 1 * class509_43_.anInt6950;
			anIntArray6930 = class509_43_.anIntArray6930;
			anIntArray6958 = class509_43_.anIntArray6958;
			aByteArrayArray6959 = class509_43_.aByteArrayArray6959;
			aByteArrayArray6960 = class509_43_.aByteArrayArray6960;
			aByteArrayArray6942 = class509_43_.aByteArrayArray6942;
			aByteArrayArray6962 = class509_43_.aByteArrayArray6962;
			aByteArrayArray6955 = class509_43_.aByteArrayArray6955;
			aClass470_6957 = class509_43_.aClass470_6957;
			aClass623_6936 = class509_43_.aClass623_6936;
			anIntArrayArrayArray6964 = class509_43_.anIntArrayArrayArray6964;
			anInt6965 = 1 * class509_43_.anInt6965;
			anInt6941 = 1 * class509_43_.anInt6941;
			aClass527_Sub8_Sub12_6929 = class509_43_.aClass527_Sub8_Sub12_6929;
			aClass532_6943 = class509_43_.aClass532_6943;
			anIntArrayArray6947 = class509_43_.anIntArrayArray6947;
			anIntArrayArray6948 = class509_43_.anIntArrayArray6948;
			aByteArrayArrayArray6940 = class509_43_.aByteArrayArrayArray6940;
			aClass503_6926 = class509_43_.aClass503_6926;
			aClass282_6928 = class509_43_.aClass282_6928;
			aClass592_6931 = class509_43_.aClass592_6931;
			aClass592_6951 = class509_43_.aClass592_6951;
			anInt6933 = 1 * class509_43_.anInt6933;
			anInt6969 = 1 * class509_43_.anInt6969;
			anInt6935 = class509_43_.anInt6935 * 1;
			anInt6956 = 1 * class509_43_.anInt6956;
		} else if (client.anInt11048 * -1927019389 == 16)
			Class78.method1560(7, (byte) 0);
		else if (0 == -1927019389 * client.anInt11048)
			Class78.method1560(14, (byte) 0);
		else if (8 == client.anInt11048 * -1927019389)
			Class78.method1560(6, (byte) 0);
		else if (9 == client.anInt11048 * -1927019389)
			Class78.method1560(10, (byte) 0);
		else if (11 == client.anInt11048 * -1927019389)
			Class78.method1560(5, (byte) 0);
	}

	public void method8299(byte[][][] is, byte i) {
		aByteArrayArrayArray6940 = is;
	}

	public Class456_Sub1 method8300(byte i) {
		return aClass456_Sub1_6949;
	}

	public void method8301(Class24_Sub6 class24_sub6, int i) {
		aClass24_Sub6_6946 = class24_sub6;
	}

	public void method8302(byte i) {
		aClass592_6931 = new Class592();
		anInt6969 = 0;
		anInt6933 = 0;
	}

	public void method8303(int i) {
		if (null != aClass555_6934) {
			Class153.method2529(561477144);
			aHashMap6968 = aClass555_6934.method9316((byte) 127);
			aClass555_6934.aClass546_7480.method9052((byte) -127);
			aClass555_6934 = null;
		}
	}

	public void method8304(int i) {
		aClass500_6963 = Class500.aClass500_5595;
		anInt6925 = 0;
		anInt6952 = -949869149;
		anInt6953 = 0;
		anInt6954 = 738101207;
		anInt6961 = 0;
	}

	public void method8305(boolean bool, int i) {
		Class647 class647 = null;
		if (null != aClass623_6936 && bool)
			class647 = aClass623_6936.method10239((byte) 56);
		aClass623_6936 = new Class623(Class402.aClass180_4150, Class338.aClass459_3656, anInt6935 * -1501092105 >> 3, anInt6956 * 1417173501 >> 3);
		if (null != class647)
			aClass623_6936.method10295(this, class647, 0, -1593935447);
	}

	public int[][] method8306() {
		return anIntArrayArray6947;
	}

	public void method8307(int i) {
		anInt6965 = -825742488;
		if (anInt6935 * -1501092105 == 0)
			anInt6941 = 2022803406;
		else
			anInt6941 = -254991503 * (int) ((double) (-1501092105 * anInt6935) * 34.46);
		anInt6941 = -254991503 * (-1213383279 * anInt6941 << 2);
		if (Class402.aClass180_4150.method3094())
			anInt6941 += -1706630656;
	}

	public int[][] method8308() {
		return anIntArrayArray6948;
	}

	public int[][] method8309() {
		return anIntArrayArray6948;
	}

	public Class24_Sub6 method8310(int i) {
		return aClass24_Sub6_6946;
	}

	public Class509(boolean bool) {
		aClass512_6944 = new Class512(0, 0, 0, 0);
		anInt6925 = 0;
		anInt6952 = -949869149;
		anInt6953 = 0;
		anInt6954 = 738101207;
		anInt6950 = 0;
		aBool6939 = false;
		aLong6967 = -4523297059643251975L;
		aHashMap6968 = new HashMap();
		aBool6937 = bool;
	}

	public float method8311() {
		return aFloat6945;
	}

	void method8312(int i) {
		aClass503_6927 = aClass503_6926;
		method8405(Class282.aClass282_3192, -32211252);
		for (int i_44_ = 0; i_44_ < 4; i_44_++) {
			for (int i_45_ = 0; i_45_ < anInt6935 * -1501092105 >> 3; i_45_++) {
				for (int i_46_ = 0; i_46_ < anInt6956 * 1417173501 >> 3; i_46_++)
					anIntArrayArrayArray6964[i_44_][i_45_][i_46_] = -1;
			}
		}
		for (Class527_Sub5 class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14081((short) 3812)); null != class527_sub5; class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14086(-65534))) {
			int i_47_ = 13221953 * class527_sub5.anInt10390;
			boolean bool = (i_47_ & 0x1) == 1;
			int i_48_ = class527_sub5.anInt10387 * -1275360735 >> 3;
			int i_49_ = class527_sub5.anInt10384 * -12667853 >> 3;
			int i_50_ = 518359233 * class527_sub5.anInt10386;
			int i_51_ = class527_sub5.anInt10382 * 1949853763;
			int i_52_ = -1808237439 * class527_sub5.anInt10383;
			int i_53_ = -1126139181 * class527_sub5.anInt10385;
			int i_54_ = 1997972785 * class527_sub5.anInt10388;
			int i_55_ = -367579771 * class527_sub5.anInt10389;
			int i_56_ = 0;
			int i_57_ = 0;
			int i_58_ = 1;
			int i_59_ = 1;
			if (i_47_ == 1) {
				i_57_ = i_54_ - 1;
				i_58_ = -1;
			} else if (2 == i_47_) {
				i_57_ = i_54_ - 1;
				i_56_ = i_55_ - 1;
				i_58_ = -1;
				i_59_ = -1;
			} else if (3 == i_47_) {
				i_56_ = i_55_ - 1;
				i_58_ = 1;
				i_59_ = -1;
			}
			int i_60_ = i_49_;
			while (i_60_ < i_55_ + i_49_) {
				int i_61_ = i_57_;
				int i_62_ = i_48_;
				while (i_62_ < i_48_ + i_54_) {
					if (bool)
						anIntArrayArrayArray6964[i_53_][i_50_ + i_56_][i_61_ + i_51_] = (i_47_ << 1) + ((i_52_ << 24) + (i_62_ << 14) + (i_60_ << 3));
					else
						anIntArrayArrayArray6964[i_53_][i_61_ + i_50_][i_51_ + i_56_] = ((i_52_ << 24) + (i_62_ << 14) + (i_60_ << 3) + (i_47_ << 1));
					i_62_++;
					i_61_ += i_58_;
				}
				i_60_++;
				i_56_ += i_59_;
			}
		}
		int i_63_ = client.anInt11084 * -403166697;
		anIntArray6930 = new int[i_63_];
		anIntArray6958 = new int[i_63_];
		aByteArrayArray6959 = new byte[i_63_][];
		aByteArrayArray6960 = new byte[i_63_][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i_63_][];
		aByteArrayArray6955 = new byte[i_63_][];
		i_63_ = 0;
		for (Class527_Sub5 class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14081((short) -11398)); null != class527_sub5; class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14086(-65534))) {
			int i_64_ = class527_sub5.anInt10387 * -1275360735 >>> 3;
			int i_65_ = -12667853 * class527_sub5.anInt10384 >>> 3;
			int i_66_ = i_64_ + 1997972785 * class527_sub5.anInt10388;
			if ((i_66_ & 0x7) == 0)
				i_66_--;
			i_66_ >>>= 3;
			int i_67_ = i_65_ + -367579771 * class527_sub5.anInt10389;
			if (0 == (i_67_ & 0x7))
				i_67_--;
			i_67_ >>>= 3;
			for (int i_68_ = i_64_ >>> 3; i_68_ <= i_66_; i_68_++) {
				while_1_: for (int i_69_ = i_65_ >>> 3; i_69_ <= i_67_; i_69_++) {
					int i_70_ = i_68_ << 8 | i_69_;
					for (int i_71_ = 0; i_71_ < i_63_; i_71_++) {
						if (i_70_ == anIntArray6930[i_71_])
							continue while_1_;
					}
					if (Class64.aClass459_743.method7474(method8379(i_68_, i_69_, -633207463), -983826993 * Class464.aClass464_5295.anInt5292, -263247760)) {
						anIntArray6930[i_63_] = i_70_;
						anIntArray6958[i_63_] = method8379(i_68_, i_69_, -633207463);
						i_63_++;
					}
				}
			}
		}
		anInt6950 = 1083007835 * i_63_;
		method8317(-1501092105 * anInt6935 >> 4, anInt6956 * 1417173501 >> 4, 10, false, (byte) -73);
	}

	void method8313(int i) {
		int i_72_ = (153371143 * aClass592_6931.anInt7798 - 153371143 * aClass592_6951.anInt7798);
		int i_73_ = (aClass592_6931.anInt7799 * -2029646807 - aClass592_6951.anInt7799 * -2029646807);
		if (10 == i) {
			for (int i_74_ = 0; i_74_ < client.anInt11030 * 152738023; i_74_++) {
				Class527_Sub26 class527_sub26 = client.aClass527_Sub26Array11313[i_74_];
				if (class527_sub26 != null) {
					Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
					for (int i_75_ = 0; i_75_ < (class640_sub1_sub2_sub1_sub1.anIntArray11902).length; i_75_++) {
						class640_sub1_sub2_sub1_sub1.anIntArray11902[i_75_] -= i_72_;
						class640_sub1_sub2_sub1_sub1.anIntArray11944[i_75_] -= i_73_;
					}
					Class442 class442 = Class442.method7139(class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
					class442.aFloat4918 -= (float) (512 * i_72_);
					class442.aFloat4919 -= (float) (i_73_ * 512);
					class640_sub1_sub2_sub1_sub1.method10618(class442);
					class442.method7141();
				}
			}
		} else {
			boolean bool = false;
			client.anInt11059 = 0;
			int i_76_ = anInt6935 * 239988224 - 512;
			int i_77_ = -256640512 * anInt6956 - 512;
			for (int i_78_ = 0; i_78_ < 152738023 * client.anInt11030; i_78_++) {
				Class527_Sub26 class527_sub26 = client.aClass527_Sub26Array11313[i_78_];
				if (class527_sub26 != null) {
					Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
					Class442 class442 = Class442.method7139(class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
					class442.aFloat4918 -= (float) (512 * i_72_);
					class442.aFloat4919 -= (float) (i_73_ * 512);
					class640_sub1_sub2_sub1_sub1.method10618(class442);
					if ((int) class442.aFloat4918 < 0 || (int) class442.aFloat4918 > i_76_ || (int) class442.aFloat4919 < 0 || (int) class442.aFloat4919 > i_77_) {
						class640_sub1_sub2_sub1_sub1.method18832(null, 2145069098);
						class527_sub26.method8735(-1889161967);
						bool = true;
					} else {
						boolean bool_79_ = true;
						for (int i_80_ = 0; i_80_ < (class640_sub1_sub2_sub1_sub1.anIntArray11902).length; i_80_++) {
							class640_sub1_sub2_sub1_sub1.anIntArray11902[i_80_] -= i_72_;
							class640_sub1_sub2_sub1_sub1.anIntArray11944[i_80_] -= i_73_;
							if ((class640_sub1_sub2_sub1_sub1.anIntArray11902[i_80_]) < 0 || ((class640_sub1_sub2_sub1_sub1.anIntArray11902[i_80_]) >= anInt6935 * -1501092105) || (class640_sub1_sub2_sub1_sub1.anIntArray11944[i_80_]) < 0 || ((class640_sub1_sub2_sub1_sub1.anIntArray11944[i_80_]) >= 1417173501 * anInt6956))
								bool_79_ = false;
						}
						if (bool_79_)
							client.anIntArray11021[((client.anInt11059 += -84653349) * -1599561389) - 1] = (-541403241 * class640_sub1_sub2_sub1_sub1.anInt11955);
						else {
							class640_sub1_sub2_sub1_sub1.method18832(null, 2145069098);
							class527_sub26.method8735(-1889161967);
							bool = true;
						}
					}
					class442.method7141();
				}
			}
			if (bool) {
				client.anInt11030 = (client.aClass14_10989.method711(-1754391818) * -1326908713);
				int i_81_ = 0;
				Iterator iterator = client.aClass14_10989.iterator();
				while (iterator.hasNext()) {
					Class527_Sub26 class527_sub26 = (Class527_Sub26) iterator.next();
					client.aClass527_Sub26Array11313[i_81_++] = class527_sub26;
				}
			}
		}
		for (int i_82_ = 0; i_82_ < 2048; i_82_++) {
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_82_];
			if (null != class640_sub1_sub2_sub1_sub2) {
				for (int i_83_ = 0; (i_83_ < class640_sub1_sub2_sub1_sub2.anIntArray11902.length); i_83_++) {
					class640_sub1_sub2_sub1_sub2.anIntArray11902[i_83_] -= i_72_;
					class640_sub1_sub2_sub1_sub2.anIntArray11944[i_83_] -= i_73_;
				}
				Class442 class442 = Class442.method7139(class640_sub1_sub2_sub1_sub2.method10637().aClass442_4927);
				class442.aFloat4918 -= (float) (512 * i_72_);
				class442.aFloat4919 -= (float) (i_73_ * 512);
				class640_sub1_sub2_sub1_sub2.method10618(class442);
				class442.method7141();
			}
		}
		Class100[] class100s = client.aClass100Array11025;
		for (int i_84_ = 0; i_84_ < class100s.length; i_84_++) {
			Class100 class100 = class100s[i_84_];
			if (null != class100) {
				class100.anInt1180 -= -693149184 * i_72_;
				class100.anInt1178 -= i_73_ * 1715110400;
			}
		}
		for (Class527_Sub2 class527_sub2 = ((Class527_Sub2) Class527_Sub2.aClass694_10357.method14081((short) 11765)); class527_sub2 != null; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10357.method14086(-65534)) {
			class527_sub2.anInt10346 -= -1468356395 * i_72_;
			class527_sub2.anInt10345 -= 759242615 * i_73_;
			Class602 class602 = ((Class602) aClass24_Sub6_6946.method81((class527_sub2.anInt10351 * 1059125193), 1710561569));
			int i_85_;
			int i_86_;
			if (0 == (class527_sub2.anInt10352 * 1808463735 & 0x1)) {
				i_85_ = -49406469 * class602.anInt7874;
				i_86_ = class602.anInt7891 * 1481957615;
			} else {
				i_85_ = 1481957615 * class602.anInt7891;
				i_86_ = class602.anInt7874 * -49406469;
			}
			if (Class503.aClass503_6883 != aClass503_6926 && (i_85_ + class527_sub2.anInt10346 * 1182093437 <= 0 || -677418425 * class527_sub2.anInt10345 + i_86_ <= 0 || (1182093437 * class527_sub2.anInt10346 >= anInt6935 * -1501092105) || (-677418425 * class527_sub2.anInt10345 >= anInt6956 * 1417173501)))
				class527_sub2.method8735(-1889161967);
		}
		for (Class527_Sub2 class527_sub2 = ((Class527_Sub2) Class527_Sub2.aClass694_10359.method14081((short) 22728)); class527_sub2 != null; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10359.method14086(-65534)) {
			class527_sub2.anInt10346 -= -1468356395 * i_72_;
			class527_sub2.anInt10345 -= i_73_ * 759242615;
			Class602 class602 = ((Class602) aClass24_Sub6_6946.method81((1059125193 * class527_sub2.anInt10351), -1193257163));
			int i_87_;
			int i_88_;
			if ((class527_sub2.anInt10352 * 1808463735 & 0x1) == 0) {
				i_87_ = class602.anInt7874 * -49406469;
				i_88_ = class602.anInt7891 * 1481957615;
			} else {
				i_87_ = class602.anInt7891 * 1481957615;
				i_88_ = -49406469 * class602.anInt7874;
			}
			if (aClass503_6926 != Class503.aClass503_6883 && (class527_sub2.anInt10346 * 1182093437 + i_87_ <= 0 || i_88_ + -677418425 * class527_sub2.anInt10345 <= 0 || (class527_sub2.anInt10346 * 1182093437 >= anInt6935 * -1501092105) || (class527_sub2.anInt10345 * -677418425 >= 1417173501 * anInt6956)))
				class527_sub2.method8735(-1889161967);
		}
		for (Class527_Sub12 class527_sub12 = ((Class527_Sub12) client.aClass14_11253.method713((byte) -24)); class527_sub12 != null; class527_sub12 = ((Class527_Sub12) client.aClass14_11253.method717(-204197887))) {
			int i_89_ = (int) (-8168620736534281759L * class527_sub12.aLong7106 >> 28 & 0x3L);
			int i_90_ = (int) (class527_sub12.aLong7106 * -8168620736534281759L & 0x3fffL);
			int i_91_ = i_90_ - 153371143 * aClass592_6931.anInt7798;
			int i_92_ = (int) (class527_sub12.aLong7106 * -8168620736534281759L >> 14 & 0x3fffL);
			int i_93_ = i_92_ - -2029646807 * aClass592_6931.anInt7799;
			if (aClass555_6934 != null) {
				if (i_91_ < 0 || i_93_ < 0 || i_91_ >= anInt6935 * -1501092105 || i_93_ >= 1417173501 * anInt6956 || i_91_ >= -547681223 * aClass555_6934.anInt7443 || i_93_ >= -1437024153 * aClass555_6934.anInt7432) {
					if (Class503.aClass503_6883 != aClass503_6926)
						class527_sub12.method8735(-1889161967);
				} else if (null != aClass555_6934.aClass561ArrayArrayArray7426)
					aClass555_6934.method9246(i_89_, i_91_, i_93_, (byte) -127);
			}
		}
		if (1573687583 * Class106.anInt1323 != 0) {
			Class106.anInt1323 -= i_72_ * 1689365215;
			Class106.anInt1322 -= i_73_ * -1880014929;
		}
		Class93.method1672(false, 1725278876);
		if (10 == i) {
			client.anInt11179 -= i_72_ * -828634624;
			client.anInt11045 -= 62276096 * i_73_;
			Class286.anInt3211 -= i_72_ * 1634176512;
			Class608.anInt7995 -= i_73_ * -1564963328;
			if (6 != Class30.anInt265 * -349191067 && -349191067 * Class30.anInt265 != 2)
				Class393.method6490(Class527_Sub29.method16288(1262646084), -1438798709);
		} else {
			Class321.anInt3552 -= i_72_ * -1834149305;
			Class452.anInt4963 -= 325034431 * i_73_;
			Class405.anInt4196 -= 1987416811 * i_72_;
			Class170.anInt1881 -= -765061525 * i_73_;
			Class320.anInt3543 -= -43410944 * i_72_;
			Class201.anInt2211 -= 954913280 * i_73_;
			if (Math.abs(i_72_) > anInt6935 * -1501092105 || Math.abs(i_73_) > 1417173501 * anInt6956)
				aClass623_6936.method10252((short) -18285);
		}
		Class107.method1928((byte) 0);
		Class49.method1264(-287576266);
		client.aClass14_11184.method721(-447773491);
		client.aClass694_11290.method14105((byte) 70);
		client.aClass705_11182.method14332(-462805131);
		Class232.method4331(1483314876);
	}

	public Class555 method8314(int i) {
		return aClass555_6934;
	}

	void method8315(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = class527_sub38_sub2.readUnsignedShortLE((byte) 102);
		int i_94_ = class527_sub38_sub2.readUnsignedByte128();
		int i_95_ = class527_sub38_sub2.readUnsignedByte();
		if (1 == i_95_)
			aClass503_6926 = Class503.aClass503_6877;
		else if (2 == i_95_)
			aClass503_6926 = Class503.aClass503_6878;
		else if (i_95_ == 3)
			aClass503_6926 = Class503.aClass503_6874;
		else if (4 == i_95_)
			aClass503_6926 = Class503.aClass503_6883;
		int i_96_ = class527_sub38_sub2.readUnsignedShort();
		anInt6938 = class527_sub38_sub2.readUnsignedByteC(-458831497) * -1552819617;
		int i_97_ = class527_sub38_sub2.readUnsignedByteC(939941381);
		boolean bool = (i_97_ & 0x1) != 0;
		if (!aBool6937)
			method8316((byte) -1);
		method8405(Class255.method4705(i_94_, 1334846024), -32211252);
		class527_sub38_sub2.method18450(905377604);
		HashSet hashset = new HashSet();
		for (int i_98_ = 0; i_98_ < 4; i_98_++) {
			for (int i_99_ = 0; i_99_ < anInt6935 * -1501092105 >> 3; i_99_++) {
				for (int i_100_ = 0; i_100_ < anInt6956 * 1417173501 >> 3; i_100_++) {
					int i_101_ = class527_sub38_sub2.method18469(1, 1774573895);
					if (i_101_ == 1) {
						int i_102_ = class527_sub38_sub2.method18469(26, 1693803881);
						anIntArrayArrayArray6964[i_98_][i_99_][i_100_] = i_102_;
						int i_103_ = i_102_ >> 14 & 0x3ff;
						int i_104_ = i_102_ >> 3 & 0x7ff;
						int i_105_ = i_103_ >> 3 << 8 | i_104_ >> 3;
						hashset.add(Integer.valueOf(i_105_));
					} else
						anIntArrayArrayArray6964[i_98_][i_99_][i_100_] = -1;
				}
			}
		}
		class527_sub38_sub2.method18452(2082141511);
		int i_106_ = hashset.size();
		anIntArray6930 = new int[i_106_];
		anIntArray6958 = new int[i_106_];
		aByteArrayArray6959 = new byte[i_106_][];
		aByteArrayArray6960 = new byte[i_106_][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i_106_][];
		aByteArrayArray6955 = new byte[i_106_][];
		i_106_ = 0;
		for (int i_107_ = 0; i_107_ < 4; i_107_++) {
			for (int i_108_ = 0; i_108_ < -1501092105 * anInt6935 >> 3; i_108_++) {
				for (int i_109_ = 0; i_109_ < anInt6956 * 1417173501 >> 3; i_109_++) {
					int i_110_ = anIntArrayArrayArray6964[i_107_][i_108_][i_109_];
					if (i_110_ != -1) {
						int i_111_ = i_110_ >> 14 & 0x3ff;
						int i_112_ = i_110_ >> 3 & 0x7ff;
						int i_113_ = (i_111_ / 8 << 8) + i_112_ / 8;
						for (int i_114_ = 0; i_114_ < i_106_; i_114_++) {
							if (anIntArray6930[i_114_] == i_113_) {
								i_113_ = -1;
								break;
							}
						}
						if (-1 != i_113_) {
							int i_115_ = i_113_ >> 8 & 0xff;
							int i_116_ = i_113_ & 0xff;
							if (Class64.aClass459_743.method7474(method8379(i_115_, i_116_, -633207463), (-983826993 * Class464.aClass464_5295.anInt5292), -406856255)) {
								anIntArray6930[i_106_] = i_113_;
								anIntArray6958[i_106_] = method8379(i_115_, i_116_, -633207463);
								i_106_++;
							}
						}
					}
				}
			}
		}
		anInt6950 = i_106_ * 1083007835;
		method8317(i_96_, i, 10, bool, (byte) -114);
	}

	void method8316(byte i) {
		if (Class503.aClass503_6875 != aClass503_6926 && aClass503_6927 != Class503.aClass503_6875) {
			if (aClass503_6926 == Class503.aClass503_6877 || aClass503_6926 == Class503.aClass503_6874 || (aClass503_6927 != aClass503_6926 && (Class503.aClass503_6876 == aClass503_6926 || aClass503_6927 == Class503.aClass503_6876))) {
				Iterator iterator = client.aClass14_10989.iterator();
				while (iterator.hasNext()) {
					Class527_Sub26 class527_sub26 = (Class527_Sub26) iterator.next();
					Class48.method1245(((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522), (byte) -35);
				}
				client.anInt11059 = 0;
				client.anInt11030 = 0;
				client.aClass14_10989.method721(-1576265487);
			}
			aClass503_6927 = aClass503_6926;
		}
	}

	void method8317(int i, int i_117_, int i_118_, boolean bool, byte i_119_) {
		if (2 == -1481292237 * client.anInt11080) {
			if (aBool6937)
				throw new IllegalStateException();
			client.anInt11080 = -1474990351;
			client.anInt11245 = -5641215;
		}
		if (bool || i != anInt6933 * 1760010523 || 1300507587 * anInt6969 != i_117_) {
			anInt6933 = -514273005 * i;
			anInt6969 = i_117_ * 1273732331;
			if (!aBool6937) {
				Class78.method1560(i_118_, (byte) 0);
				Class307.method5612(Class53.aClass53_625.method1290((Class144_Sub1.aClass671_8995), (byte) -100), true, Class402.aClass180_4150, Class85.aClass174_819, Class581.aClass22_7677, 1638733593);
			}
			if (null != aClass592_6931)
				aClass592_6951 = aClass592_6931;
			else
				aClass592_6951 = new Class592(0, 0, 0);
			aClass592_6931 = new Class592(0, 8 * (1760010523 * anInt6933 - (-1501092105 * anInt6935 >> 4)), (anInt6969 * 1300507587 - (anInt6956 * 1417173501 >> 4)) * 8);
			aClass527_Sub8_Sub12_6929 = Class529.method8818((aClass592_6931.anInt7798 * 153371143 + -1501092105 * anInt6935 / 2), (-2029646807 * aClass592_6931.anInt7799 + -1501092105 * anInt6935 / 2));
			aClass532_6943 = null;
			aLong6967 = -4523297059643251975L;
			if (!aBool6937)
				method8318(i_118_, -870376806);
		}
	}

	void method8318(int i, int i_120_) {
		int i_121_ = (153371143 * aClass592_6931.anInt7798 - 153371143 * aClass592_6951.anInt7798);
		int i_122_ = (aClass592_6931.anInt7799 * -2029646807 - aClass592_6951.anInt7799 * -2029646807);
		if (10 == i) {
			for (int i_123_ = 0; i_123_ < client.anInt11030 * 152738023; i_123_++) {
				Class527_Sub26 class527_sub26 = client.aClass527_Sub26Array11313[i_123_];
				if (class527_sub26 != null) {
					Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
					for (int i_124_ = 0; i_124_ < (class640_sub1_sub2_sub1_sub1.anIntArray11902).length; i_124_++) {
						class640_sub1_sub2_sub1_sub1.anIntArray11902[i_124_] -= i_121_;
						class640_sub1_sub2_sub1_sub1.anIntArray11944[i_124_] -= i_122_;
					}
					Class442 class442 = Class442.method7139(class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
					class442.aFloat4918 -= (float) (512 * i_121_);
					class442.aFloat4919 -= (float) (i_122_ * 512);
					class640_sub1_sub2_sub1_sub1.method10618(class442);
					class442.method7141();
				}
			}
		} else {
			boolean bool = false;
			client.anInt11059 = 0;
			int i_125_ = anInt6935 * 239988224 - 512;
			int i_126_ = -256640512 * anInt6956 - 512;
			for (int i_127_ = 0; i_127_ < 152738023 * client.anInt11030; i_127_++) {
				Class527_Sub26 class527_sub26 = client.aClass527_Sub26Array11313[i_127_];
				if (class527_sub26 != null) {
					Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
					Class442 class442 = Class442.method7139(class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
					class442.aFloat4918 -= (float) (512 * i_121_);
					class442.aFloat4919 -= (float) (i_122_ * 512);
					class640_sub1_sub2_sub1_sub1.method10618(class442);
					if ((int) class442.aFloat4918 < 0 || (int) class442.aFloat4918 > i_125_ || (int) class442.aFloat4919 < 0 || (int) class442.aFloat4919 > i_126_) {
						class640_sub1_sub2_sub1_sub1.method18832(null, 2145069098);
						class527_sub26.method8735(-1889161967);
						bool = true;
					} else {
						boolean bool_128_ = true;
						for (int i_129_ = 0; i_129_ < (class640_sub1_sub2_sub1_sub1.anIntArray11902).length; i_129_++) {
							class640_sub1_sub2_sub1_sub1.anIntArray11902[i_129_] -= i_121_;
							class640_sub1_sub2_sub1_sub1.anIntArray11944[i_129_] -= i_122_;
							if ((class640_sub1_sub2_sub1_sub1.anIntArray11902[i_129_]) < 0 || ((class640_sub1_sub2_sub1_sub1.anIntArray11902[i_129_]) >= anInt6935 * -1501092105) || (class640_sub1_sub2_sub1_sub1.anIntArray11944[i_129_]) < 0 || ((class640_sub1_sub2_sub1_sub1.anIntArray11944[i_129_]) >= 1417173501 * anInt6956))
								bool_128_ = false;
						}
						if (bool_128_)
							client.anIntArray11021[((client.anInt11059 += -84653349) * -1599561389) - 1] = (-541403241 * class640_sub1_sub2_sub1_sub1.anInt11955);
						else {
							class640_sub1_sub2_sub1_sub1.method18832(null, 2145069098);
							class527_sub26.method8735(-1889161967);
							bool = true;
						}
					}
					class442.method7141();
				}
			}
			if (bool) {
				client.anInt11030 = (client.aClass14_10989.method711(-154352662) * -1326908713);
				int i_130_ = 0;
				Iterator iterator = client.aClass14_10989.iterator();
				while (iterator.hasNext()) {
					Class527_Sub26 class527_sub26 = (Class527_Sub26) iterator.next();
					client.aClass527_Sub26Array11313[i_130_++] = class527_sub26;
				}
			}
		}
		for (int i_131_ = 0; i_131_ < 2048; i_131_++) {
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_131_];
			if (null != class640_sub1_sub2_sub1_sub2) {
				for (int i_132_ = 0; (i_132_ < class640_sub1_sub2_sub1_sub2.anIntArray11902.length); i_132_++) {
					class640_sub1_sub2_sub1_sub2.anIntArray11902[i_132_] -= i_121_;
					class640_sub1_sub2_sub1_sub2.anIntArray11944[i_132_] -= i_122_;
				}
				Class442 class442 = Class442.method7139(class640_sub1_sub2_sub1_sub2.method10637().aClass442_4927);
				class442.aFloat4918 -= (float) (512 * i_121_);
				class442.aFloat4919 -= (float) (i_122_ * 512);
				class640_sub1_sub2_sub1_sub2.method10618(class442);
				class442.method7141();
			}
		}
		Class100[] class100s = client.aClass100Array11025;
		for (int i_133_ = 0; i_133_ < class100s.length; i_133_++) {
			Class100 class100 = class100s[i_133_];
			if (null != class100) {
				class100.anInt1180 -= -693149184 * i_121_;
				class100.anInt1178 -= i_122_ * 1715110400;
			}
		}
		for (Class527_Sub2 class527_sub2 = ((Class527_Sub2) Class527_Sub2.aClass694_10357.method14081((short) -13128)); class527_sub2 != null; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10357.method14086(-65534)) {
			class527_sub2.anInt10346 -= -1468356395 * i_121_;
			class527_sub2.anInt10345 -= 759242615 * i_122_;
			Class602 class602 = ((Class602) aClass24_Sub6_6946.method81((class527_sub2.anInt10351 * 1059125193), 1305283946));
			int i_134_;
			int i_135_;
			if (0 == (class527_sub2.anInt10352 * 1808463735 & 0x1)) {
				i_134_ = -49406469 * class602.anInt7874;
				i_135_ = class602.anInt7891 * 1481957615;
			} else {
				i_134_ = 1481957615 * class602.anInt7891;
				i_135_ = class602.anInt7874 * -49406469;
			}
			if (Class503.aClass503_6883 != aClass503_6926 && (i_134_ + class527_sub2.anInt10346 * 1182093437 <= 0 || -677418425 * class527_sub2.anInt10345 + i_135_ <= 0 || (1182093437 * class527_sub2.anInt10346 >= anInt6935 * -1501092105) || (-677418425 * class527_sub2.anInt10345 >= anInt6956 * 1417173501)))
				class527_sub2.method8735(-1889161967);
		}
		for (Class527_Sub2 class527_sub2 = ((Class527_Sub2) Class527_Sub2.aClass694_10359.method14081((short) -4184)); class527_sub2 != null; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10359.method14086(-65534)) {
			class527_sub2.anInt10346 -= -1468356395 * i_121_;
			class527_sub2.anInt10345 -= i_122_ * 759242615;
			Class602 class602 = ((Class602) aClass24_Sub6_6946.method81((1059125193 * class527_sub2.anInt10351), 365296133));
			int i_136_;
			int i_137_;
			if ((class527_sub2.anInt10352 * 1808463735 & 0x1) == 0) {
				i_136_ = class602.anInt7874 * -49406469;
				i_137_ = class602.anInt7891 * 1481957615;
			} else {
				i_136_ = class602.anInt7891 * 1481957615;
				i_137_ = -49406469 * class602.anInt7874;
			}
			if (aClass503_6926 != Class503.aClass503_6883 && (class527_sub2.anInt10346 * 1182093437 + i_136_ <= 0 || i_137_ + -677418425 * class527_sub2.anInt10345 <= 0 || (class527_sub2.anInt10346 * 1182093437 >= anInt6935 * -1501092105) || (class527_sub2.anInt10345 * -677418425 >= 1417173501 * anInt6956)))
				class527_sub2.method8735(-1889161967);
		}
		for (Class527_Sub12 class527_sub12 = ((Class527_Sub12) client.aClass14_11253.method713((byte) -25)); class527_sub12 != null; class527_sub12 = ((Class527_Sub12) client.aClass14_11253.method717(1816412804))) {
			int i_138_ = (int) (-8168620736534281759L * class527_sub12.aLong7106 >> 28 & 0x3L);
			int i_139_ = (int) (class527_sub12.aLong7106 * -8168620736534281759L & 0x3fffL);
			int i_140_ = i_139_ - 153371143 * aClass592_6931.anInt7798;
			int i_141_ = (int) (class527_sub12.aLong7106 * -8168620736534281759L >> 14 & 0x3fffL);
			int i_142_ = i_141_ - -2029646807 * aClass592_6931.anInt7799;
			if (aClass555_6934 != null) {
				if (i_140_ < 0 || i_142_ < 0 || i_140_ >= anInt6935 * -1501092105 || i_142_ >= 1417173501 * anInt6956 || i_140_ >= -547681223 * aClass555_6934.anInt7443 || i_142_ >= -1437024153 * aClass555_6934.anInt7432) {
					if (Class503.aClass503_6883 != aClass503_6926)
						class527_sub12.method8735(-1889161967);
				} else if (null != aClass555_6934.aClass561ArrayArrayArray7426)
					aClass555_6934.method9246(i_138_, i_140_, i_142_, (byte) -75);
			}
		}
		if (1573687583 * Class106.anInt1323 != 0) {
			Class106.anInt1323 -= i_121_ * 1689365215;
			Class106.anInt1322 -= i_122_ * -1880014929;
		}
		Class93.method1672(false, 2146117722);
		if (10 == i) {
			client.anInt11179 -= i_121_ * -828634624;
			client.anInt11045 -= 62276096 * i_122_;
			Class286.anInt3211 -= i_121_ * 1634176512;
			Class608.anInt7995 -= i_122_ * -1564963328;
			if (6 != Class30.anInt265 * -349191067 && -349191067 * Class30.anInt265 != 2)
				Class393.method6490(Class527_Sub29.method16288(1997314469), -2016960414);
		} else {
			Class321.anInt3552 -= i_121_ * -1834149305;
			Class452.anInt4963 -= 325034431 * i_122_;
			Class405.anInt4196 -= 1987416811 * i_121_;
			Class170.anInt1881 -= -765061525 * i_122_;
			Class320.anInt3543 -= -43410944 * i_121_;
			Class201.anInt2211 -= 954913280 * i_122_;
			if (Math.abs(i_121_) > anInt6935 * -1501092105 || Math.abs(i_122_) > 1417173501 * anInt6956)
				aClass623_6936.method10252((short) -8756);
		}
		Class107.method1928((byte) 0);
		Class49.method1264(-287576266);
		client.aClass14_11184.method721(761372827);
		client.aClass694_11290.method14105((byte) 67);
		client.aClass705_11182.method14332(-1080453141);
		Class232.method4331(1483314876);
	}

	void method8319(int i) {
		aClass456_Sub1_6932 = null;
		aClass456_Sub1_6949 = null;
		if (null != aClass470_6957)
			aClass470_6957.method7709(-1649563488);
		if (null != aClass623_6936)
			aClass623_6936.method10247(-1413884076);
		if (aClass555_6934 != null) {
			aClass555_6934.aClass546_7480.method9052((byte) -96);
			aClass555_6934 = null;
		}
	}

	public boolean method8320(int i) {
		if (!aBool6937)
			Class568.method9570(false, -1247580553);
		if (aLong6967 * 9166316196517380279L == -1L)
			aLong6967 = Class234.method4347(-1408626088) * 4523297059643251975L;
		anInt6925 = 0;
		for (int i_143_ = 0; i_143_ < anInt6950 * 291247315; i_143_++) {
			if (!Class64.aClass459_743.method7552(anIntArray6958[i_143_], (byte) 35))
				anInt6925 += -1181254821;
		}
		if (null == aClass532_6943) {
			if (null != aClass527_Sub8_Sub12_6929 && aClass459_6970.method7495((aClass527_Sub8_Sub12_6929.aString11755), -18266436)) {
				if (!aClass459_6970.method7485((aClass527_Sub8_Sub12_6929.aString11755), 535848406))
					anInt6925 += -1181254821;
				else
					aClass532_6943 = Class19.method770(aClass459_6970, (aClass527_Sub8_Sub12_6929.aString11755), client.aBool11165, 16777472);
			} else
				aClass532_6943 = new Class532(0);
		}
		if (anInt6925 * -2039202605 > 0) {
			if (anInt6952 * -1756875253 < -2039202605 * anInt6925)
				anInt6952 = anInt6925 * -1231865511;
			aClass500_6963 = Class500.aClass500_5594;
			return false;
		}
		for (int i_144_ = 0; i_144_ < 291247315 * anInt6950; i_144_++) {
			if (null == aByteArrayArray6959[i_144_])
				aByteArrayArray6959[i_144_] = Class64.aClass459_743.method7470(anIntArray6958[i_144_], (-983826993 * (Class464.aClass464_5295.anInt5292)), (byte) -77);
			if (aByteArrayArray6960[i_144_] == null)
				aByteArrayArray6960[i_144_] = Class64.aClass459_743.method7470(anIntArray6958[i_144_], (-983826993 * (Class464.aClass464_5293.anInt5292)), (byte) -22);
			if (null == aByteArrayArray6962[i_144_])
				aByteArrayArray6962[i_144_] = Class64.aClass459_743.method7470(anIntArray6958[i_144_], ((Class464.aClass464_5291.anInt5292) * -983826993), (byte) -110);
			if (aByteArrayArray6955[i_144_] == null)
				aByteArrayArray6955[i_144_] = Class64.aClass459_743.method7470(anIntArray6958[i_144_], (-983826993 * (Class464.aClass464_5294.anInt5292)), (byte) -22);
			if (aByteArrayArray6942 != null && null == aByteArrayArray6942[i_144_])
				aByteArrayArray6942[i_144_] = Class64.aClass459_743.method7470(anIntArray6958[i_144_], ((Class464.aClass464_5300.anInt5292) * -983826993), (byte) -20);
		}
		int i_145_ = -71850849 * anInt6953;
		Class645 class645 = new Class645(-1);
		Class645 class645_146_ = new Class645(-1);
		anInt6953 = 0;
		for (int i_147_ = 0; i_147_ < 291247315 * anInt6950; i_147_++) {
			byte[] is = aByteArrayArray6960[i_147_];
			if (null != is) {
				int i_148_ = ((anIntArray6930[i_147_] >> 8) * 64 - aClass592_6931.anInt7798 * 153371143);
				int i_149_ = (64 * (anIntArray6930[i_147_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
				if (aClass503_6926.method8206(763361961)) {
					i_148_ = 10;
					i_149_ = 10;
				}
				int i_150_ = Class271.method5077(aClass24_Sub6_6946, is, i_148_, i_149_, anInt6935 * -1501092105, anInt6956 * 1417173501, class645_146_, class645, -307922291);
				if (i_150_ > 0)
					anInt6953 += i_150_ * 1378645855;
			}
			is = aByteArrayArray6955[i_147_];
			if (is != null) {
				int i_151_ = ((anIntArray6930[i_147_] >> 8) * 64 - 153371143 * aClass592_6931.anInt7798);
				int i_152_ = ((anIntArray6930[i_147_] & 0xff) * 64 - aClass592_6931.anInt7799 * -2029646807);
				if (aClass503_6926.method8206(398562429)) {
					i_151_ = 10;
					i_152_ = 10;
				}
				int i_153_ = Class271.method5077(aClass24_Sub6_6946, is, i_151_, i_152_, -1501092105 * anInt6935, anInt6956 * 1417173501, class645_146_, class645, -706049627);
				if (i_153_ > 0)
					anInt6953 += i_153_ * 1378645855;
			}
		}
		if (-71850849 * anInt6953 > 0) {
			if (anInt6953 * -71850849 == i_145_) {
				if (anInt6961 * 644074087 != 0 && 1000 == client.anInt11019 - anInt6961 * 644074087) {
					Class287.method5216(719556723 * class645_146_.anInt8348, 719556723 * class645.anInt8348, -71850849 * anInt6953, (byte) 92);
					Class643.method10737(694434472);
				}
			} else
				anInt6961 = -460082857 * client.anInt11019;
			if (-66692121 * anInt6954 < anInt6953 * -71850849)
				anInt6954 = 1238178441 * anInt6953;
			aClass500_6963 = Class500.aClass500_5596;
			return false;
		}
		if (!aBool6937 && aClass500_6963 != Class500.aClass500_5595)
			Class307.method5612(new StringBuilder().append(Class53.aClass53_625.method1290((Class144_Sub1.aClass671_8995), (byte) -126)).append(Class33.aString329).append("(100%)").toString(), true, Class402.aClass180_4150, Class85.aClass174_819, Class581.aClass22_7677, 2090073619);
		aClass500_6963 = Class500.aClass500_5597;
		if (!aBool6937 && Class245.aClass226_2698 != null)
			Class245.aClass226_2698.method4200(2087347312);
		if (!aBool6937) {
			for (int i_154_ = 0; i_154_ < 2048; i_154_++) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_154_];
				if (null != class640_sub1_sub2_sub1_sub2)
					class640_sub1_sub2_sub1_sub2.aClass555_10867 = null;
			}
			for (int i_155_ = 0; i_155_ < client.aClass527_Sub26Array11313.length; i_155_++) {
				Class527_Sub26 class527_sub26 = client.aClass527_Sub26Array11313[i_155_];
				if (null != class527_sub26)
					((Class640_Sub1) class527_sub26.anObject10522).aClass555_10867 = null;
			}
		}
		if (!aBool6937)
			Class32.method942(true, 48305882);
		boolean bool = false;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-391603840) == 2) {
			for (int i_156_ = 0; i_156_ < 291247315 * anInt6950; i_156_++) {
				if (aByteArrayArray6955[i_156_] != null || null != aByteArrayArray6962[i_156_]) {
					bool = true;
					break;
				}
			}
		}
		int i_157_ = (Class689.method13996(Class204.aClass527_Sub31_2213.aClass700_Sub33_10609.method17247(1831204839), -254728301).anInt3271 * -1088851960);
		if (Class402.aClass180_4150.method3094())
			i_157_++;
		method8307(1809879311);
		method8319(927161049);
		aClass555_6934 = new Class555(Class402.aClass180_4150, 9, 4, anInt6935 * -1501092105, anInt6956 * 1417173501, i_157_, bool, Class402.aClass180_4150.method3188() > 0);
		aClass555_6934.method9220(false, (byte) -98);
		aClass555_6934.method9218(475651289 * client.anInt11032, 337700564);
		aClass555_6934.method9275(aHashMap6968, 785060804);
		if (client.anInt11032 * 475651289 != 0)
			aClass555_6934.method9310(Class24_Sub9.aClass174_10977, 1551166221);
		else
			aClass555_6934.method9310(null, 1551166221);
		aClass512_6944 = new Class512();
		aFloat6945 = -0.05F + (float) (Math.random() / 10.0);
		aClass456_Sub1_6949 = new Class456_Sub1(aClass555_6934, aClass24_Sub6_6946, 4, anInt6935 * -1501092105, 1417173501 * anInt6956, false, aClass470_6957, aClass623_6936);
		aClass456_Sub1_6949.method7395(1480484983);
		aClass456_Sub1_6949.anInt4980 = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(2127519032) * 2019629863;
		aClass456_Sub1_6949.aBool5022 = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-1499925964) == 2;
		aClass456_Sub1_6949.aBool4982 = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-1111754446) == 1;
		aClass456_Sub1_6949.aBool4983 = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(487316729) == 1;
		aClass456_Sub1_6949.aBool4984 = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(1577362076) == 1;
		if (!aClass503_6926.method8206(757730948))
			method8370(aClass456_Sub1_6949, aByteArrayArray6959, (byte) 1);
		else
			method8291(aClass456_Sub1_6949, aByteArrayArray6959, -2011270976);
		if (aBool6937)
			method8321(50, (byte) 59);
		aClass623_6936.method10248(anInt6935 * -1501092105 >> 4, 1417173501 * anInt6956 >> 4, -1462259504);
		aClass623_6936.method10250(this, -791866311);
		if (bool) {
			aClass555_6934.method9220(true, (byte) 0);
			aClass456_Sub1_6932 = new Class456_Sub1(aClass555_6934, aClass24_Sub6_6946, 1, -1501092105 * anInt6935, 1417173501 * anInt6956, true, aClass470_6957, aClass623_6936);
			aClass456_Sub1_6932.method7395(1203843836);
			aClass456_Sub1_6932.anInt4980 = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-2014260141) * 2019629863;
			aClass456_Sub1_6932.aBool5022 = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-538064369) == 2;
			aClass456_Sub1_6932.aBool4982 = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-1229458462) == 1;
			aClass456_Sub1_6932.aBool4983 = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(-897888839) == 1;
			aClass456_Sub1_6932.aBool4984 = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-325312396) == 1;
			if (!aClass503_6926.method8206(982481289)) {
				method8370(aClass456_Sub1_6932, aByteArrayArray6962, (byte) 1);
				if (!aBool6937)
					Class568.method9570(true, -2146970464);
			} else {
				method8291(aClass456_Sub1_6932, aByteArrayArray6962, -2130414685);
				if (!aBool6937)
					Class568.method9570(true, -1583544374);
			}
			aClass456_Sub1_6932.method7356(0, (aClass456_Sub1_6949.anIntArrayArrayArray4989[0]), -1554155929);
			aClass456_Sub1_6932.method7367(Class402.aClass180_4150, null, (byte) 22);
			aClass555_6934.method9220(false, (byte) -14);
			if (aBool6937)
				method8321(50, (byte) 97);
		}
		aClass456_Sub1_6949.method7367(Class402.aClass180_4150, (bool ? (aClass456_Sub1_6932.anIntArrayArrayArray4989) : null), (byte) -17);
		if (!aClass503_6926.method8206(-1749331108)) {
			if (!aBool6937)
				Class568.method9570(true, -2001562738);
			method8324(aClass456_Sub1_6949, aByteArrayArray6960, (byte) 53);
			if (null != aByteArrayArray6942)
				method8352(-788509156);
		} else {
			if (!aBool6937)
				Class568.method9570(true, -715272026);
			method8325(aClass456_Sub1_6949, aByteArrayArray6960, -1238669131);
		}
		if (!aBool6937)
			Class568.method9570(true, -1815525569);
		aClass456_Sub1_6949.method7358(Class402.aClass180_4150, (bool ? aClass555_6934.aClass161Array7435[0] : null), null, -249174006);
		if (aBool6937)
			method8321(75, (byte) 42);
		aClass456_Sub1_6949.method15967(Class402.aClass180_4150, false, (byte) 110);
		if (aBool6937)
			method8321(75, (byte) 70);
		if (!aBool6937)
			Class568.method9570(true, -906013841);
		if (bool) {
			aClass555_6934.method9220(true, (byte) -15);
			if (!aBool6937)
				Class568.method9570(true, -1628671927);
			if (!aClass503_6926.method8206(-427870983))
				method8324(aClass456_Sub1_6932, aByteArrayArray6955, (byte) 66);
			else
				method8325(aClass456_Sub1_6932, aByteArrayArray6955, -366613899);
			if (!aBool6937)
				Class568.method9570(true, -1243877703);
			aClass456_Sub1_6932.method7358(Class402.aClass180_4150, null, (aClass555_6934.aClass161Array7457[0]), 760073532);
			aClass456_Sub1_6932.method15967(Class402.aClass180_4150, true, (byte) 3);
			if (!aBool6937)
				Class568.method9570(true, -1035825395);
			aClass555_6934.method9220(false, (byte) -125);
			if (aBool6937)
				method8321(50, (byte) 98);
		}
		aClass456_Sub1_6949.method7350(1310886835);
		if (null != aClass456_Sub1_6932)
			aClass456_Sub1_6932.method7350(1310886835);
		aClass555_6934.method9221(1246980464);
		if (aBool6937) {
			Class234.method4347(-1408626088);
			while (!Class402.aClass180_4150.method3178(1418071226))
				method8321(1, (byte) 68);
		}
		boolean bool_158_ = false;
		if (aBool6937) {
			Class509 class509_159_ = client.aClass509_11072;
			method8354(class509_159_, -1452291296);
			Class396.aClass506_4119.method8232(class509_159_, 2118785432);
			bool_158_ = true;
			Class234.method4347(-1408626088);
			synchronized (client.anObject11311) {
				client.aBool11073 = true;
				try {
					client.anObject11311.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass509_11072 = this;
			class509_159_.method8319(1930813826);
			method8318(10, -115707766);
			method8316((byte) -1);
		} else {
			Class245.aClass226_2698.method4200(-217496879);
			aClass623_6936.method10294(1307673230);
			Class527_Sub3.method16047(-1931328650);
		}
		for (int i_160_ = 0; i_160_ < 4; i_160_++) {
			for (int i_161_ = 0; i_161_ < -1501092105 * anInt6935; i_161_++) {
				for (int i_162_ = 0; i_162_ < 1417173501 * anInt6956; i_162_++)
					Class375.method6385(i_160_, i_161_, i_162_, 1394761684);
			}
		}
		for (int i_163_ = 0; i_163_ < client.aClass535Array11026.length; i_163_++) {
			if (null != client.aClass535Array11026[i_163_])
				client.aClass535Array11026[i_163_].method8963((byte) 59);
		}
		Class639_Sub1.method16871((byte) 107);
		Class522_Sub6.method15991(-1054537975);
		if (Class440.method7110((byte) -30) == Class516.aClass516_7049 && client.aClass109_11067.method1967(2097670348) != null && 10 == client.anInt11048 * -1927019389) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4506, client.aClass109_11067.aClass2_1367, (byte) -115);
			class527_sub15.buffer.writeInt(1057001181, 234948584);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (!aClass503_6926.method8206(-1783801553)) {
			int i_164_ = ((1760010523 * anInt6933 - (-1501092105 * anInt6935 >> 4)) / 8);
			int i_165_ = (((-1501092105 * anInt6935 >> 4) + 1760010523 * anInt6933) / 8);
			int i_166_ = (1300507587 * anInt6969 - (1417173501 * anInt6956 >> 4)) / 8;
			int i_167_ = ((anInt6956 * 1417173501 >> 4) + anInt6969 * 1300507587) / 8;
			for (int i_168_ = i_164_ - 1; i_168_ <= i_165_ + 1; i_168_++) {
				for (int i_169_ = i_166_ - 1; i_169_ <= 1 + i_167_; i_169_++) {
					if (i_168_ < i_164_ || i_168_ > i_165_ || i_169_ < i_166_ || i_169_ > i_167_)
						Class64.aClass459_743.method7487(method8379(i_168_, i_169_, -633207463), -1861188085);
				}
			}
		}
		long l = (Class234.method4347(-1408626088) - aLong6967 * 9166316196517380279L);
		if (7 == -1927019389 * client.anInt11048)
			Class78.method1560(16, (byte) 0);
		else if (14 == client.anInt11048 * -1927019389)
			Class78.method1560(0, (byte) 0);
		else if (client.anInt11048 * -1927019389 == 6)
			Class78.method1560(8, (byte) 0);
		else if (-1927019389 * client.anInt11048 == 5)
			Class78.method1560(11, (byte) 0);
		else {
			Class78.method1560(9, (byte) 0);
			if (client.aClass109_11067.method1967(1932055346) != null) {
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4405, client.aClass109_11067.aClass2_1367, (byte) -86);
				class527_sub15.buffer.writeInt((int) l, 2058048093);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			}
		}
		if (aBool6939) {
			Class493.method7997(Long.toString(Class234.method4347(-1408626088) - (6830704253204824397L * aLong6966)), (byte) 8);
			aBool6939 = false;
		}
		if (bool_158_) {
			synchronized (client.anObject11074) {
				client.anObject11074.notify();
			}
		}
		return true;
	}

	void method8321(int i, byte i_170_) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void method8322() {
		if (null != aClass555_6934) {
			Class153.method2529(561477144);
			aHashMap6968 = aClass555_6934.method9316((byte) 127);
			aClass555_6934.aClass546_7480.method9052((byte) -85);
			aClass555_6934 = null;
		}
	}

	void method8323() {
		aClass503_6927 = aClass503_6926;
		method8405(Class282.aClass282_3192, -32211252);
		for (int i = 0; i < 4; i++) {
			for (int i_171_ = 0; i_171_ < anInt6935 * -1501092105 >> 3; i_171_++) {
				for (int i_172_ = 0; i_172_ < anInt6956 * 1417173501 >> 3; i_172_++)
					anIntArrayArrayArray6964[i][i_171_][i_172_] = -1;
			}
		}
		for (Class527_Sub5 class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14081((short) 17511)); null != class527_sub5; class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14086(-65534))) {
			int i = 13221953 * class527_sub5.anInt10390;
			boolean bool = (i & 0x1) == 1;
			int i_173_ = class527_sub5.anInt10387 * -1275360735 >> 3;
			int i_174_ = class527_sub5.anInt10384 * -12667853 >> 3;
			int i_175_ = 518359233 * class527_sub5.anInt10386;
			int i_176_ = class527_sub5.anInt10382 * 1949853763;
			int i_177_ = -1808237439 * class527_sub5.anInt10383;
			int i_178_ = -1126139181 * class527_sub5.anInt10385;
			int i_179_ = 1997972785 * class527_sub5.anInt10388;
			int i_180_ = -367579771 * class527_sub5.anInt10389;
			int i_181_ = 0;
			int i_182_ = 0;
			int i_183_ = 1;
			int i_184_ = 1;
			if (i == 1) {
				i_182_ = i_179_ - 1;
				i_183_ = -1;
			} else if (2 == i) {
				i_182_ = i_179_ - 1;
				i_181_ = i_180_ - 1;
				i_183_ = -1;
				i_184_ = -1;
			} else if (3 == i) {
				i_181_ = i_180_ - 1;
				i_183_ = 1;
				i_184_ = -1;
			}
			int i_185_ = i_174_;
			while (i_185_ < i_180_ + i_174_) {
				int i_186_ = i_182_;
				int i_187_ = i_173_;
				while (i_187_ < i_173_ + i_179_) {
					if (bool)
						anIntArrayArrayArray6964[i_178_][i_175_ + i_181_][i_186_ + i_176_] = (i << 1) + ((i_177_ << 24) + (i_187_ << 14) + (i_185_ << 3));
					else
						anIntArrayArrayArray6964[i_178_][i_186_ + i_175_][i_176_ + i_181_] = ((i_177_ << 24) + (i_187_ << 14) + (i_185_ << 3) + (i << 1));
					i_187_++;
					i_186_ += i_183_;
				}
				i_185_++;
				i_181_ += i_184_;
			}
		}
		int i = client.anInt11084 * -403166697;
		anIntArray6930 = new int[i];
		anIntArray6958 = new int[i];
		aByteArrayArray6959 = new byte[i][];
		aByteArrayArray6960 = new byte[i][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i][];
		aByteArrayArray6955 = new byte[i][];
		i = 0;
		for (Class527_Sub5 class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14081((short) 4942)); null != class527_sub5; class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14086(-65534))) {
			int i_188_ = class527_sub5.anInt10387 * -1275360735 >>> 3;
			int i_189_ = -12667853 * class527_sub5.anInt10384 >>> 3;
			int i_190_ = i_188_ + 1997972785 * class527_sub5.anInt10388;
			if ((i_190_ & 0x7) == 0)
				i_190_--;
			i_190_ >>>= 3;
			int i_191_ = i_189_ + -367579771 * class527_sub5.anInt10389;
			if (0 == (i_191_ & 0x7))
				i_191_--;
			i_191_ >>>= 3;
			for (int i_192_ = i_188_ >>> 3; i_192_ <= i_190_; i_192_++) {
				while_3_: for (int i_193_ = i_189_ >>> 3; i_193_ <= i_191_; i_193_++) {
					int i_194_ = i_192_ << 8 | i_193_;
					for (int i_195_ = 0; i_195_ < i; i_195_++) {
						if (i_194_ == anIntArray6930[i_195_])
							continue while_3_;
					}
					if (Class64.aClass459_743.method7474(method8379(i_192_, i_193_, -633207463), -983826993 * Class464.aClass464_5295.anInt5292, -333209245)) {
						anIntArray6930[i] = i_194_;
						anIntArray6958[i] = method8379(i_192_, i_193_, -633207463);
						i++;
					}
				}
			}
		}
		anInt6950 = 1083007835 * i;
		method8317(-1501092105 * anInt6935 >> 4, anInt6956 * 1417173501 >> 4, 10, false, (byte) -108);
	}

	void method8324(Class456_Sub1 class456_sub1, byte[][] is, byte i) {
		for (int i_196_ = 0; i_196_ < anInt6950 * 291247315; i_196_++) {
			byte[] is_197_ = is[i_196_];
			if (null != is_197_) {
				int i_198_ = ((anIntArray6930[i_196_] >> 8) * 64 - aClass592_6931.anInt7798 * 153371143);
				int i_199_ = (64 * (anIntArray6930[i_196_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
				if (!aBool6937)
					Class245.aClass226_2698.method4200(1986214582);
				class456_sub1.method15960(Class402.aClass180_4150, is_197_, i_198_, i_199_, (byte) 115);
				if (aBool6937)
					method8321(10, (byte) 68);
			}
		}
	}

	void method8325(Class456_Sub1 class456_sub1, byte[][] is, int i) {
		for (int i_200_ = 0; i_200_ < 587945237 * class456_sub1.anInt5047; i_200_++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(-201182027);
			for (int i_201_ = 0; i_201_ < anInt6935 * -1501092105 >> 3; i_201_++) {
				for (int i_202_ = 0; i_202_ < 1417173501 * anInt6956 >> 3; i_202_++) {
					int i_203_ = anIntArrayArrayArray6964[i_200_][i_201_][i_202_];
					if (i_203_ != -1) {
						int i_204_ = i_203_ >> 24 & 0x3;
						if (!class456_sub1.aBool4976 || i_204_ == 0) {
							int i_205_ = i_203_ >> 1 & 0x3;
							int i_206_ = i_203_ >> 14 & 0x3ff;
							int i_207_ = i_203_ >> 3 & 0x7ff;
							int i_208_ = (i_206_ / 8 << 8) + i_207_ / 8;
							for (int i_209_ = 0; i_209_ < anIntArray6930.length; i_209_++) {
								if (i_208_ == anIntArray6930[i_209_] && null != is[i_209_]) {
									class456_sub1.method15983(Class402.aClass180_4150, is[i_209_], i_200_, 8 * i_201_, i_202_ * 8, i_204_, 8 * (i_206_ & 0x7), (i_207_ & 0x7) * 8, i_205_, (short) 630);
									break;
								}
							}
						}
					}
					if (aBool6937)
						method8321(5, (byte) 68);
				}
			}
		}
	}

	public int method8326() {
		return anInt6941 * -1213383279;
	}

	public Class503 method8327() {
		return aClass503_6926;
	}

	public Class500 method8328() {
		return aClass500_6963;
	}

	public int method8329() {
		return 100 - -2056797588 * anInt6925 / (anInt6952 * -1756875253);
	}

	public int method8330() {
		return 100 - -2056797588 * anInt6925 / (anInt6952 * -1756875253);
	}

	public int method8331() {
		return 100 - -2056797588 * anInt6925 / (anInt6952 * -1756875253);
	}

	public int method8332() {
		return 100 - 1404849692 * anInt6953 / (anInt6954 * -66692121);
	}

	public int method8333() {
		return -1501092105 * anInt6935;
	}

	public Class512 method8334() {
		return aClass512_6944;
	}

	public float method8335() {
		return aFloat6945;
	}

	void method8336(Class282 class282) {
		if (aClass282_6928 != class282) {
			anInt6935 = (anInt6956 = -707703295 * class282.anInt3197) * -1427798613;
			anIntArrayArrayArray6964 = (new int[4][anInt6935 * -1501092105 >> 3][anInt6956 * 1417173501 >> 3]);
			anIntArrayArray6947 = new int[anInt6935 * -1501092105][anInt6956 * 1417173501];
			anIntArrayArray6948 = new int[-1501092105 * anInt6935][anInt6956 * 1417173501];
			aByteArrayArrayArray6940 = new byte[4][anInt6935 * -1501092105][anInt6956 * 1417173501];
			aClass470_6957 = new Class470(4, -1501092105 * anInt6935, anInt6956 * 1417173501);
			method8305(false, -1948595861);
			Class202.method3772(-835832597);
			aClass282_6928 = class282;
		}
	}

	public float method8337() {
		return aFloat6945;
	}

	public void method8338(Class24_Sub6 class24_sub6) {
		aClass24_Sub6_6946 = class24_sub6;
	}

	public void method8339(byte[][][] is) {
		aByteArrayArrayArray6940 = is;
	}

	public int method8340() {
		return anInt6941 * -1213383279;
	}

	public int method8341() {
		return anInt6941 * -1213383279;
	}

	public int method8342() {
		return anInt6941 * -1213383279;
	}

	public byte[][] method8343(int i) {
		if (aClass456_Sub1_6949 != null && null != aClass456_Sub1_6949.aByteArrayArrayArray5057 && aClass456_Sub1_6949.aByteArrayArrayArray5057[i] != null)
			return aClass456_Sub1_6949.aByteArrayArrayArray5057[i];
		return null;
	}

	public byte[][] method8344(int i) {
		if (aClass456_Sub1_6949 != null && null != aClass456_Sub1_6949.aByteArrayArrayArray5057 && aClass456_Sub1_6949.aByteArrayArrayArray5057[i] != null)
			return aClass456_Sub1_6949.aByteArrayArrayArray5057[i];
		return null;
	}

	public Class470 method8345() {
		return aClass470_6957;
	}

	public Class470 method8346() {
		return aClass470_6957;
	}

	public Class623 method8347() {
		return aClass623_6936;
	}

	public Class24_Sub6 method8348() {
		return aClass24_Sub6_6946;
	}

	public byte[][] method8349(int i, byte i_210_) {
		if (aClass456_Sub1_6949 != null && null != aClass456_Sub1_6949.aByteArrayArrayArray5057 && aClass456_Sub1_6949.aByteArrayArrayArray5057[i] != null)
			return aClass456_Sub1_6949.aByteArrayArrayArray5057[i];
		return null;
	}

	public int[][] method8350() {
		return anIntArrayArray6947;
	}

	public int method8351(int i) {
		return anInt6941 * -1213383279;
	}

	void method8352(int i) {
		int i_211_ = aByteArrayArray6942.length;
		for (int i_212_ = 0; i_212_ < i_211_; i_212_++) {
			if (null != aByteArrayArray6942[i_212_]) {
				int i_213_ = -1;
				for (int i_214_ = 0; i_214_ < client.anInt11077 * -673556667; i_214_++) {
					if (client.anIntArray11076[i_214_] == anIntArray6930[i_212_]) {
						i_213_ = i_214_;
						break;
					}
				}
				if (-1 == i_213_) {
					client.anIntArray11076[client.anInt11077 * -673556667] = anIntArray6930[i_212_];
					i_213_ = (client.anInt11077 += 1791599501) * -673556667 - 1;
				}
				RSByteBuffer class527_sub38 = new RSByteBuffer(aByteArrayArray6942[i_212_]);
				int i_215_ = 0;
				while ((class527_sub38.anInt10689 * -441238943 < aByteArrayArray6942[i_212_].length) && i_215_ < 511 && -1599561389 * client.anInt11059 < 1023) {
					int i_216_ = i_213_ | i_215_++ << 6;
					int i_217_ = class527_sub38.readUnsignedShort();
					int i_218_ = i_217_ >> 14;
					int i_219_ = i_217_ >> 7 & 0x3f;
					int i_220_ = i_217_ & 0x3f;
					int i_221_ = (64 * (anIntArray6930[i_212_] >> 8) - 153371143 * aClass592_6931.anInt7798 + i_219_);
					int i_222_ = i_220_ + (64 * (anIntArray6930[i_212_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
					Class295 class295 = (Class295) (Class381.aClass24_Sub9_3936.method81(class527_sub38.readUnsignedShort(), 711444473));
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_216_));
					if (null == class527_sub26 && (class295.aByte3294 & 0x1) > 0 && i_221_ >= 0 && (i_221_ + 897343531 * class295.anInt3342 < -1501092105 * anInt6935) && i_222_ >= 0 && (i_222_ + 897343531 * class295.anInt3342 < 1417173501 * anInt6956)) {
						Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = new Class640_Sub1_Sub2_Sub1_Sub1(aClass555_6934);
						class640_sub1_sub2_sub1_sub1.anInt11955 = i_216_ * 1587877927;
						Class527_Sub26 class527_sub26_223_ = new Class527_Sub26(class640_sub1_sub2_sub1_sub1);
						client.aClass14_10989.method714(class527_sub26_223_, (long) i_216_);
						client.aClass527_Sub26Array11313[((client.anInt11030 += -1326908713) * 152738023) - 1] = class527_sub26_223_;
						client.anIntArray11021[((client.anInt11059 += -84653349) * -1599561389 - 1)] = i_216_;
						class640_sub1_sub2_sub1_sub1.anInt11933 = client.anInt11019 * 2052153447;
						class640_sub1_sub2_sub1_sub1.method18832(class295, 2145069098);
						class640_sub1_sub2_sub1_sub1.method18585(897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342), 1725084656);
						class640_sub1_sub2_sub1_sub1.anInt11937 = (57049381 * (1076155623 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3311) << 3));
						class640_sub1_sub2_sub1_sub1.method18528(class640_sub1_sub2_sub1_sub1.aClass295_12168.aClass681_3277.method13906(-936936965).method87() << 11 & 0x3fff, true, -1332300987);
						class640_sub1_sub2_sub1_sub1.method18837(i_218_, i_221_, i_222_, true, class640_sub1_sub2_sub1_sub1.method18564(-1371402162), (byte) 27);
					}
				}
			}
		}
	}

	public void method8353() {
		aClass592_6931 = new Class592();
		anInt6969 = 0;
		anInt6933 = 0;
	}

	void method8354(Class509 class509_224_, int i) {
		boolean bool = class509_224_.aBool6937;
		class509_224_.aBool6937 = aBool6937;
		aBool6937 = bool;
		Class503 class503 = class509_224_.aClass503_6927;
		class509_224_.aClass503_6927 = aClass503_6927;
		aClass503_6927 = class503;
		class509_224_.aClass592_6951 = aClass592_6931;
		aClass592_6951 = class509_224_.aClass592_6931;
		aClass623_6936.method10241(class509_224_.method8397(1909079687), 2045713926);
	}

	public boolean method8355() {
		if (!aBool6937)
			Class568.method9570(false, -845205502);
		if (aLong6967 * 9166316196517380279L == -1L)
			aLong6967 = Class234.method4347(-1408626088) * 4523297059643251975L;
		anInt6925 = 0;
		for (int i = 0; i < anInt6950 * 291247315; i++) {
			if (!Class64.aClass459_743.method7552(anIntArray6958[i], (byte) 95))
				anInt6925 += -1181254821;
		}
		if (null == aClass532_6943) {
			if (null != aClass527_Sub8_Sub12_6929 && aClass459_6970.method7495((aClass527_Sub8_Sub12_6929.aString11755), -1152649788)) {
				if (!aClass459_6970.method7485((aClass527_Sub8_Sub12_6929.aString11755), 1540279383))
					anInt6925 += -1181254821;
				else
					aClass532_6943 = Class19.method770(aClass459_6970, (aClass527_Sub8_Sub12_6929.aString11755), client.aBool11165, 16777472);
			} else
				aClass532_6943 = new Class532(0);
		}
		if (anInt6925 * -2039202605 > 0) {
			if (anInt6952 * -1756875253 < -2039202605 * anInt6925)
				anInt6952 = anInt6925 * -1231865511;
			aClass500_6963 = Class500.aClass500_5594;
			return false;
		}
		for (int i = 0; i < 291247315 * anInt6950; i++) {
			if (null == aByteArrayArray6959[i])
				aByteArrayArray6959[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5295.anInt5292)), (byte) -74);
			if (aByteArrayArray6960[i] == null)
				aByteArrayArray6960[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5293.anInt5292)), (byte) -6);
			if (null == aByteArrayArray6962[i])
				aByteArrayArray6962[i] = Class64.aClass459_743.method7470(anIntArray6958[i], ((Class464.aClass464_5291.anInt5292) * -983826993), (byte) -39);
			if (aByteArrayArray6955[i] == null)
				aByteArrayArray6955[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5294.anInt5292)), (byte) -92);
			if (aByteArrayArray6942 != null && null == aByteArrayArray6942[i])
				aByteArrayArray6942[i] = Class64.aClass459_743.method7470(anIntArray6958[i], ((Class464.aClass464_5300.anInt5292) * -983826993), (byte) -7);
		}
		int i = -71850849 * anInt6953;
		Class645 class645 = new Class645(-1);
		Class645 class645_225_ = new Class645(-1);
		anInt6953 = 0;
		for (int i_226_ = 0; i_226_ < 291247315 * anInt6950; i_226_++) {
			byte[] is = aByteArrayArray6960[i_226_];
			if (null != is) {
				int i_227_ = ((anIntArray6930[i_226_] >> 8) * 64 - aClass592_6931.anInt7798 * 153371143);
				int i_228_ = (64 * (anIntArray6930[i_226_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
				if (aClass503_6926.method8206(-1042042011)) {
					i_227_ = 10;
					i_228_ = 10;
				}
				int i_229_ = Class271.method5077(aClass24_Sub6_6946, is, i_227_, i_228_, anInt6935 * -1501092105, anInt6956 * 1417173501, class645_225_, class645, -637011943);
				if (i_229_ > 0)
					anInt6953 += i_229_ * 1378645855;
			}
			is = aByteArrayArray6955[i_226_];
			if (is != null) {
				int i_230_ = ((anIntArray6930[i_226_] >> 8) * 64 - 153371143 * aClass592_6931.anInt7798);
				int i_231_ = ((anIntArray6930[i_226_] & 0xff) * 64 - aClass592_6931.anInt7799 * -2029646807);
				if (aClass503_6926.method8206(1158232823)) {
					i_230_ = 10;
					i_231_ = 10;
				}
				int i_232_ = Class271.method5077(aClass24_Sub6_6946, is, i_230_, i_231_, -1501092105 * anInt6935, anInt6956 * 1417173501, class645_225_, class645, -2100156924);
				if (i_232_ > 0)
					anInt6953 += i_232_ * 1378645855;
			}
		}
		if (-71850849 * anInt6953 > 0) {
			if (anInt6953 * -71850849 == i) {
				if (anInt6961 * 644074087 != 0 && 1000 == client.anInt11019 - anInt6961 * 644074087) {
					Class287.method5216(719556723 * class645_225_.anInt8348, 719556723 * class645.anInt8348, -71850849 * anInt6953, (byte) 92);
					Class643.method10737(-1778452077);
				}
			} else
				anInt6961 = -460082857 * client.anInt11019;
			if (-66692121 * anInt6954 < anInt6953 * -71850849)
				anInt6954 = 1238178441 * anInt6953;
			aClass500_6963 = Class500.aClass500_5596;
			return false;
		}
		if (!aBool6937 && aClass500_6963 != Class500.aClass500_5595)
			Class307.method5612(new StringBuilder().append(Class53.aClass53_625.method1290((Class144_Sub1.aClass671_8995), (byte) -111)).append(Class33.aString329).append("(100%)").toString(), true, Class402.aClass180_4150, Class85.aClass174_819, Class581.aClass22_7677, 1918672386);
		aClass500_6963 = Class500.aClass500_5597;
		if (!aBool6937 && Class245.aClass226_2698 != null)
			Class245.aClass226_2698.method4200(1053581683);
		if (!aBool6937) {
			for (int i_233_ = 0; i_233_ < 2048; i_233_++) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_233_];
				if (null != class640_sub1_sub2_sub1_sub2)
					class640_sub1_sub2_sub1_sub2.aClass555_10867 = null;
			}
			for (int i_234_ = 0; i_234_ < client.aClass527_Sub26Array11313.length; i_234_++) {
				Class527_Sub26 class527_sub26 = client.aClass527_Sub26Array11313[i_234_];
				if (null != class527_sub26)
					((Class640_Sub1) class527_sub26.anObject10522).aClass555_10867 = null;
			}
		}
		if (!aBool6937)
			Class32.method942(true, 1481858242);
		boolean bool = false;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-176984452) == 2) {
			for (int i_235_ = 0; i_235_ < 291247315 * anInt6950; i_235_++) {
				if (aByteArrayArray6955[i_235_] != null || null != aByteArrayArray6962[i_235_]) {
					bool = true;
					break;
				}
			}
		}
		int i_236_ = (Class689.method13996(Class204.aClass527_Sub31_2213.aClass700_Sub33_10609.method17247(1831204839), -254728301).anInt3271 * -1088851960);
		if (Class402.aClass180_4150.method3094())
			i_236_++;
		method8307(732148185);
		method8319(231383408);
		aClass555_6934 = new Class555(Class402.aClass180_4150, 9, 4, anInt6935 * -1501092105, anInt6956 * 1417173501, i_236_, bool, Class402.aClass180_4150.method3188() > 0);
		aClass555_6934.method9220(false, (byte) -34);
		aClass555_6934.method9218(475651289 * client.anInt11032, 888325355);
		aClass555_6934.method9275(aHashMap6968, -1622386294);
		if (client.anInt11032 * 475651289 != 0)
			aClass555_6934.method9310(Class24_Sub9.aClass174_10977, 1551166221);
		else
			aClass555_6934.method9310(null, 1551166221);
		aClass512_6944 = new Class512();
		aFloat6945 = -0.05F + (float) (Math.random() / 10.0);
		aClass456_Sub1_6949 = new Class456_Sub1(aClass555_6934, aClass24_Sub6_6946, 4, anInt6935 * -1501092105, 1417173501 * anInt6956, false, aClass470_6957, aClass623_6936);
		aClass456_Sub1_6949.method7395(1174887224);
		aClass456_Sub1_6949.anInt4980 = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-465294701) * 2019629863;
		aClass456_Sub1_6949.aBool5022 = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-456332876) == 2;
		aClass456_Sub1_6949.aBool4982 = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-340654460) == 1;
		aClass456_Sub1_6949.aBool4983 = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(511853065) == 1;
		aClass456_Sub1_6949.aBool4984 = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-111486293) == 1;
		if (!aClass503_6926.method8206(1065752177))
			method8370(aClass456_Sub1_6949, aByteArrayArray6959, (byte) 1);
		else
			method8291(aClass456_Sub1_6949, aByteArrayArray6959, -2034427011);
		if (aBool6937)
			method8321(50, (byte) 80);
		aClass623_6936.method10248(anInt6935 * -1501092105 >> 4, 1417173501 * anInt6956 >> 4, -1957994523);
		aClass623_6936.method10250(this, -1012096211);
		if (bool) {
			aClass555_6934.method9220(true, (byte) -46);
			aClass456_Sub1_6932 = new Class456_Sub1(aClass555_6934, aClass24_Sub6_6946, 1, -1501092105 * anInt6935, 1417173501 * anInt6956, true, aClass470_6957, aClass623_6936);
			aClass456_Sub1_6932.method7395(1100563442);
			aClass456_Sub1_6932.anInt4980 = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-689943388) * 2019629863;
			aClass456_Sub1_6932.aBool5022 = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-1010779080) == 2;
			aClass456_Sub1_6932.aBool4982 = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-1893335130) == 1;
			aClass456_Sub1_6932.aBool4983 = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(340601333) == 1;
			aClass456_Sub1_6932.aBool4984 = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(1796883910) == 1;
			if (!aClass503_6926.method8206(-957009399)) {
				method8370(aClass456_Sub1_6932, aByteArrayArray6962, (byte) 1);
				if (!aBool6937)
					Class568.method9570(true, -1368386347);
			} else {
				method8291(aClass456_Sub1_6932, aByteArrayArray6962, -2105493510);
				if (!aBool6937)
					Class568.method9570(true, -1180594996);
			}
			aClass456_Sub1_6932.method7356(0, (aClass456_Sub1_6949.anIntArrayArrayArray4989[0]), -216983531);
			aClass456_Sub1_6932.method7367(Class402.aClass180_4150, null, (byte) -39);
			aClass555_6934.method9220(false, (byte) -103);
			if (aBool6937)
				method8321(50, (byte) 33);
		}
		aClass456_Sub1_6949.method7367(Class402.aClass180_4150, (bool ? (aClass456_Sub1_6932.anIntArrayArrayArray4989) : null), (byte) 58);
		if (!aClass503_6926.method8206(515782272)) {
			if (!aBool6937)
				Class568.method9570(true, -884104044);
			method8324(aClass456_Sub1_6949, aByteArrayArray6960, (byte) 101);
			if (null != aByteArrayArray6942)
				method8352(-1639622572);
		} else {
			if (!aBool6937)
				Class568.method9570(true, -1305814974);
			method8325(aClass456_Sub1_6949, aByteArrayArray6960, -1859153651);
		}
		if (!aBool6937)
			Class568.method9570(true, -1399991127);
		aClass456_Sub1_6949.method7358(Class402.aClass180_4150, (bool ? aClass555_6934.aClass161Array7435[0] : null), null, 2037185323);
		if (aBool6937)
			method8321(75, (byte) 92);
		aClass456_Sub1_6949.method15967(Class402.aClass180_4150, false, (byte) 20);
		if (aBool6937)
			method8321(75, (byte) 11);
		if (!aBool6937)
			Class568.method9570(true, -1183944602);
		if (bool) {
			aClass555_6934.method9220(true, (byte) -31);
			if (!aBool6937)
				Class568.method9570(true, -1068402435);
			if (!aClass503_6926.method8206(406696472))
				method8324(aClass456_Sub1_6932, aByteArrayArray6955, (byte) 9);
			else
				method8325(aClass456_Sub1_6932, aByteArrayArray6955, -1769261012);
			if (!aBool6937)
				Class568.method9570(true, -1465642406);
			aClass456_Sub1_6932.method7358(Class402.aClass180_4150, null, (aClass555_6934.aClass161Array7457[0]), -210567603);
			aClass456_Sub1_6932.method15967(Class402.aClass180_4150, true, (byte) 33);
			if (!aBool6937)
				Class568.method9570(true, -943433140);
			aClass555_6934.method9220(false, (byte) -22);
			if (aBool6937)
				method8321(50, (byte) 99);
		}
		aClass456_Sub1_6949.method7350(1310886835);
		if (null != aClass456_Sub1_6932)
			aClass456_Sub1_6932.method7350(1310886835);
		aClass555_6934.method9221(2103680205);
		if (aBool6937) {
			Class234.method4347(-1408626088);
			while (!Class402.aClass180_4150.method3178(1788282422))
				method8321(1, (byte) 53);
		}
		boolean bool_237_ = false;
		if (aBool6937) {
			Class509 class509_238_ = client.aClass509_11072;
			method8354(class509_238_, -207767259);
			Class396.aClass506_4119.method8232(class509_238_, 1458639641);
			bool_237_ = true;
			Class234.method4347(-1408626088);
			synchronized (client.anObject11311) {
				client.aBool11073 = true;
				try {
					client.anObject11311.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass509_11072 = this;
			class509_238_.method8319(1377994506);
			method8318(10, 1878384237);
			method8316((byte) -1);
		} else {
			Class245.aClass226_2698.method4200(308450576);
			aClass623_6936.method10294(-295584253);
			Class527_Sub3.method16047(-1837006075);
		}
		for (int i_239_ = 0; i_239_ < 4; i_239_++) {
			for (int i_240_ = 0; i_240_ < -1501092105 * anInt6935; i_240_++) {
				for (int i_241_ = 0; i_241_ < 1417173501 * anInt6956; i_241_++)
					Class375.method6385(i_239_, i_240_, i_241_, 1394761684);
			}
		}
		for (int i_242_ = 0; i_242_ < client.aClass535Array11026.length; i_242_++) {
			if (null != client.aClass535Array11026[i_242_])
				client.aClass535Array11026[i_242_].method8963((byte) 20);
		}
		Class639_Sub1.method16871((byte) 40);
		Class522_Sub6.method15991(-1054537975);
		if (Class440.method7110((byte) -48) == Class516.aClass516_7049 && client.aClass109_11067.method1967(1915130390) != null && 10 == client.anInt11048 * -1927019389) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4506, client.aClass109_11067.aClass2_1367, (byte) -35);
			class527_sub15.buffer.writeInt(1057001181, -1850781795);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (!aClass503_6926.method8206(-1996011466)) {
			int i_243_ = ((1760010523 * anInt6933 - (-1501092105 * anInt6935 >> 4)) / 8);
			int i_244_ = (((-1501092105 * anInt6935 >> 4) + 1760010523 * anInt6933) / 8);
			int i_245_ = (1300507587 * anInt6969 - (1417173501 * anInt6956 >> 4)) / 8;
			int i_246_ = ((anInt6956 * 1417173501 >> 4) + anInt6969 * 1300507587) / 8;
			for (int i_247_ = i_243_ - 1; i_247_ <= i_244_ + 1; i_247_++) {
				for (int i_248_ = i_245_ - 1; i_248_ <= 1 + i_246_; i_248_++) {
					if (i_247_ < i_243_ || i_247_ > i_244_ || i_248_ < i_245_ || i_248_ > i_246_)
						Class64.aClass459_743.method7487(method8379(i_247_, i_248_, -633207463), -1861188085);
				}
			}
		}
		long l = (Class234.method4347(-1408626088) - aLong6967 * 9166316196517380279L);
		if (7 == -1927019389 * client.anInt11048)
			Class78.method1560(16, (byte) 0);
		else if (14 == client.anInt11048 * -1927019389)
			Class78.method1560(0, (byte) 0);
		else if (client.anInt11048 * -1927019389 == 6)
			Class78.method1560(8, (byte) 0);
		else if (-1927019389 * client.anInt11048 == 5)
			Class78.method1560(11, (byte) 0);
		else {
			Class78.method1560(9, (byte) 0);
			if (client.aClass109_11067.method1967(2064558397) != null) {
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4405, client.aClass109_11067.aClass2_1367, (byte) -102);
				class527_sub15.buffer.writeInt((int) l, -1315768002);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			}
		}
		if (aBool6939) {
			Class493.method7997(Long.toString(Class234.method4347(-1408626088) - (6830704253204824397L * aLong6966)), (byte) 8);
			aBool6939 = false;
		}
		if (bool_237_) {
			synchronized (client.anObject11074) {
				client.anObject11074.notify();
			}
		}
		return true;
	}

	public void method8356(byte[][][] is) {
		aByteArrayArrayArray6940 = is;
	}

	public void method8357(byte[][][] is) {
		aByteArrayArrayArray6940 = is;
	}

	public Class456_Sub1 method8358() {
		return aClass456_Sub1_6949;
	}

	public Class470 method8359(int i) {
		return aClass470_6957;
	}

	public void method8360(Class24_Sub6 class24_sub6) {
		aClass24_Sub6_6946 = class24_sub6;
	}

	public void method8361(int i) {
		if (aBool6937) {
			method8304(-2084556617);
			aLong6967 = -4523297059643251975L;
			Class509 class509_249_ = client.aClass509_11072;
			anInt6950 = 1 * class509_249_.anInt6950;
			anIntArray6930 = class509_249_.anIntArray6930;
			anIntArray6958 = class509_249_.anIntArray6958;
			aByteArrayArray6959 = class509_249_.aByteArrayArray6959;
			aByteArrayArray6960 = class509_249_.aByteArrayArray6960;
			aByteArrayArray6942 = class509_249_.aByteArrayArray6942;
			aByteArrayArray6962 = class509_249_.aByteArrayArray6962;
			aByteArrayArray6955 = class509_249_.aByteArrayArray6955;
			aClass470_6957 = class509_249_.aClass470_6957;
			aClass623_6936 = class509_249_.aClass623_6936;
			anIntArrayArrayArray6964 = class509_249_.anIntArrayArrayArray6964;
			anInt6965 = 1 * class509_249_.anInt6965;
			anInt6941 = 1 * class509_249_.anInt6941;
			aClass527_Sub8_Sub12_6929 = class509_249_.aClass527_Sub8_Sub12_6929;
			aClass532_6943 = class509_249_.aClass532_6943;
			anIntArrayArray6947 = class509_249_.anIntArrayArray6947;
			anIntArrayArray6948 = class509_249_.anIntArrayArray6948;
			aByteArrayArrayArray6940 = class509_249_.aByteArrayArrayArray6940;
			aClass503_6926 = class509_249_.aClass503_6926;
			aClass282_6928 = class509_249_.aClass282_6928;
			aClass592_6931 = class509_249_.aClass592_6931;
			aClass592_6951 = class509_249_.aClass592_6951;
			anInt6933 = 1 * class509_249_.anInt6933;
			anInt6969 = 1 * class509_249_.anInt6969;
			anInt6935 = class509_249_.anInt6935 * 1;
			anInt6956 = 1 * class509_249_.anInt6956;
		} else if (client.anInt11048 * -1927019389 == 16)
			Class78.method1560(7, (byte) 0);
		else if (0 == -1927019389 * client.anInt11048)
			Class78.method1560(14, (byte) 0);
		else if (8 == client.anInt11048 * -1927019389)
			Class78.method1560(6, (byte) 0);
		else if (9 == client.anInt11048 * -1927019389)
			Class78.method1560(10, (byte) 0);
		else if (11 == client.anInt11048 * -1927019389)
			Class78.method1560(5, (byte) 0);
	}

	public void method8362() {
		aClass592_6931 = new Class592();
		anInt6969 = 0;
		anInt6933 = 0;
	}

	public void method8363(boolean bool) {
		Class647 class647 = null;
		if (null != aClass623_6936 && bool)
			class647 = aClass623_6936.method10239((byte) 100);
		aClass623_6936 = new Class623(Class402.aClass180_4150, Class338.aClass459_3656, anInt6935 * -1501092105 >> 3, anInt6956 * 1417173501 >> 3);
		if (null != class647)
			aClass623_6936.method10295(this, class647, 0, -1593935447);
	}

	public void method8364() {
		if (null != aClass555_6934) {
			Class153.method2529(561477144);
			aHashMap6968 = aClass555_6934.method9316((byte) 127);
			aClass555_6934.aClass546_7480.method9052((byte) -61);
			aClass555_6934 = null;
		}
	}

	public int method8365() {
		return anInt6941 * -1213383279;
	}

	public void method8366() {
		aClass500_6963 = Class500.aClass500_5595;
		anInt6925 = 0;
		anInt6952 = -949869149;
		anInt6953 = 0;
		anInt6954 = 738101207;
		anInt6961 = 0;
	}

	public void method8367() {
		if (null != aClass555_6934) {
			Class153.method2529(561477144);
			aHashMap6968 = aClass555_6934.method9316((byte) 127);
			aClass555_6934.aClass546_7480.method9052((byte) -28);
			aClass555_6934 = null;
		}
	}

	public void method8368() {
		aClass500_6963 = Class500.aClass500_5595;
		anInt6925 = 0;
		anInt6952 = -949869149;
		anInt6953 = 0;
		anInt6954 = 738101207;
		anInt6961 = 0;
	}

	public void method8369() {
		aClass500_6963 = Class500.aClass500_5595;
		anInt6925 = 0;
		anInt6952 = -949869149;
		anInt6953 = 0;
		anInt6954 = 738101207;
		anInt6961 = 0;
	}

	void method8370(Class456_Sub1 class456_sub1, byte[][] is, byte i) {
		int i_250_ = is.length;
		for (int i_251_ = 0; i_251_ < i_250_; i_251_++) {
			byte[] is_252_ = is[i_251_];
			if (is_252_ != null) {
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_252_);
				int i_253_ = anIntArray6930[i_251_] >> 8;
				int i_254_ = anIntArray6930[i_251_] & 0xff;
				int i_255_ = 64 * i_253_ - aClass592_6931.anInt7798 * 153371143;
				int i_256_ = 64 * i_254_ - aClass592_6931.anInt7799 * -2029646807;
				if (!aBool6937 && null != Class245.aClass226_2698)
					Class245.aClass226_2698.method4200(-901023374);
				class456_sub1.method7353(class527_sub38, i_255_, i_256_, aClass592_6931.anInt7798 * 153371143, (aClass592_6931.anInt7799 * -2029646807), (byte) 8);
				class456_sub1.method15982(Class402.aClass180_4150, class527_sub38, i_255_, i_256_, (byte) -1);
			}
		}
		for (int i_257_ = 0; i_257_ < i_250_; i_257_++) {
			int i_258_ = (64 * (anIntArray6930[i_257_] >> 8) - 153371143 * aClass592_6931.anInt7798);
			int i_259_ = ((anIntArray6930[i_257_] & 0xff) * 64 - aClass592_6931.anInt7799 * -2029646807);
			byte[] is_260_ = is[i_257_];
			if (null == is_260_ && 1300507587 * anInt6969 < 800) {
				if (!aBool6937 && null != Class245.aClass226_2698)
					Class245.aClass226_2698.method4200(83216386);
				class456_sub1.method7351(i_258_, i_259_, 64, 64, 65280);
			}
		}
	}

	public byte[][][] method8371(byte i) {
		return aByteArrayArrayArray6940;
	}

	public void method8372() {
		anInt6965 = -825742488;
		if (anInt6935 * -1501092105 == 0)
			anInt6941 = 2022803406;
		else
			anInt6941 = -254991503 * (int) ((double) (-1501092105 * anInt6935) * 34.46);
		anInt6941 = -254991503 * (-1213383279 * anInt6941 << 2);
		if (Class402.aClass180_4150.method3094())
			anInt6941 += -1706630656;
	}

	void method8373(Class509 class509_261_) {
		boolean bool = class509_261_.aBool6937;
		class509_261_.aBool6937 = aBool6937;
		aBool6937 = bool;
		Class503 class503 = class509_261_.aClass503_6927;
		class509_261_.aClass503_6927 = aClass503_6927;
		aClass503_6927 = class503;
		class509_261_.aClass592_6951 = aClass592_6931;
		aClass592_6951 = class509_261_.aClass592_6931;
		aClass623_6936.method10241(class509_261_.method8397(823334649), 2045713926);
	}

	void method8374(Class509 class509_262_) {
		boolean bool = class509_262_.aBool6937;
		class509_262_.aBool6937 = aBool6937;
		aBool6937 = bool;
		Class503 class503 = class509_262_.aClass503_6927;
		class509_262_.aClass503_6927 = aClass503_6927;
		aClass503_6927 = class503;
		class509_262_.aClass592_6951 = aClass592_6931;
		aClass592_6951 = class509_262_.aClass592_6931;
		aClass623_6936.method10241(class509_262_.method8397(106877236), 2045713926);
	}

	public void method8375() {
		if (null != aClass555_6934) {
			Class153.method2529(561477144);
			aHashMap6968 = aClass555_6934.method9316((byte) 127);
			aClass555_6934.aClass546_7480.method9052((byte) -26);
			aClass555_6934 = null;
		}
	}

	public void method8376(Class514 class514) {
		aClass503_6926 = class514.aClass503_7010;
		if (aClass503_6926 == Class503.aClass503_6879)
			method8400((byte) 52);
		else if (aClass503_6926 == Class503.aClass503_6876)
			method8386(class514.aClass527_Sub38_Sub2_7011, (byte) 127);
		else if (Class503.aClass503_6875 == aClass503_6926)
			method8312(439234463);
		else if (aClass503_6926.method8206(-361054199))
			method8293(class514.aClass527_Sub38_Sub2_7011, -708685628);
	}

	public void method8377(Class514 class514) {
		aClass503_6926 = class514.aClass503_7010;
		if (aClass503_6926 == Class503.aClass503_6879)
			method8400((byte) 28);
		else if (aClass503_6926 == Class503.aClass503_6876)
			method8386(class514.aClass527_Sub38_Sub2_7011, (byte) 124);
		else if (Class503.aClass503_6875 == aClass503_6926)
			method8312(-419922895);
		else if (aClass503_6926.method8206(-1630429177))
			method8293(class514.aClass527_Sub38_Sub2_7011, -339280005);
	}

	public void method8378(Class514 class514) {
		aClass503_6926 = class514.aClass503_7010;
		if (aClass503_6926 == Class503.aClass503_6879)
			method8400((byte) 11);
		else if (aClass503_6926 == Class503.aClass503_6876)
			method8386(class514.aClass527_Sub38_Sub2_7011, (byte) 124);
		else if (Class503.aClass503_6875 == aClass503_6926)
			method8312(1817442833);
		else if (aClass503_6926.method8206(951978824))
			method8293(class514.aClass527_Sub38_Sub2_7011, -1266004745);
	}

	int method8379(int i, int i_263_, int i_264_) {
		return i | i_263_ << 7;
	}

	void method8380() {
		method8405(Class255.method4705(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594.method17010((byte) -22), 1580374392), -32211252);
		int i = 153371143 * aClass592_6931.anInt7798;
		int i_265_ = aClass592_6931.anInt7799 * -2029646807;
		int i_266_ = (-1998563323 * Class320.anInt3543 >> 12) + (i >> 3);
		int i_267_ = (-1261737255 * Class201.anInt2211 >> 12) + (i_265_ >> 3);
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864 = (byte) 0;
		Class673.anInt8585 = 0;
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18886(8, 8, -1793922895);
		int i_268_ = 18;
		anIntArray6930 = new int[i_268_];
		anIntArray6958 = new int[i_268_];
		aByteArrayArray6959 = new byte[i_268_][];
		aByteArrayArray6960 = new byte[i_268_][];
		aByteArrayArray6942 = new byte[i_268_][];
		aByteArrayArray6962 = new byte[i_268_][];
		aByteArrayArray6955 = new byte[i_268_][];
		i_268_ = 0;
		for (int i_269_ = (i_266_ - (anInt6935 * -1501092105 >> 4)) / 8; i_269_ <= (i_266_ + (-1501092105 * anInt6935 >> 4)) / 8; i_269_++) {
			for (int i_270_ = (i_267_ - (anInt6956 * 1417173501 >> 4)) / 8; i_270_ <= ((1417173501 * anInt6956 >> 4) + i_267_) / 8; i_270_++) {
				int i_271_ = i_270_ + (i_269_ << 8);
				if (Class64.aClass459_743.method7474(method8379(i_269_, i_270_, -633207463), (Class464.aClass464_5295.anInt5292) * -983826993, -50174290)) {
					anIntArray6930[i_268_] = i_271_;
					anIntArray6958[i_268_] = method8379(i_269_, i_270_, -633207463);
					i_268_++;
				}
			}
		}
		anInt6950 = i_268_ * 1083007835;
		int i_272_;
		if (16 == client.anInt11048 * -1927019389)
			i_272_ = 7;
		else if (-1927019389 * client.anInt11048 == 8)
			i_272_ = 6;
		else if (0 == client.anInt11048 * -1927019389)
			i_272_ = 14;
		else if (11 == client.anInt11048 * -1927019389)
			i_272_ = 5;
		else
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt11048 * -1927019389).toString());
		method8317(i_266_, i_267_, i_272_, false, (byte) -18);
	}

	void method8381() {
		aClass456_Sub1_6932 = null;
		aClass456_Sub1_6949 = null;
		if (null != aClass470_6957)
			aClass470_6957.method7709(-1649563488);
		if (null != aClass623_6936)
			aClass623_6936.method10247(-1413884076);
		if (aClass555_6934 != null) {
			aClass555_6934.aClass546_7480.method9052((byte) -53);
			aClass555_6934 = null;
		}
	}

	void method8382(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = class527_sub38_sub2.readUnsignedShortLE((byte) 112);
		int i_273_ = class527_sub38_sub2.readUnsignedByte128();
		int i_274_ = class527_sub38_sub2.readUnsignedByte();
		if (1 == i_274_)
			aClass503_6926 = Class503.aClass503_6877;
		else if (2 == i_274_)
			aClass503_6926 = Class503.aClass503_6878;
		else if (i_274_ == 3)
			aClass503_6926 = Class503.aClass503_6874;
		else if (4 == i_274_)
			aClass503_6926 = Class503.aClass503_6883;
		int i_275_ = class527_sub38_sub2.readUnsignedShort();
		anInt6938 = class527_sub38_sub2.readUnsignedByteC(577288746) * -1552819617;
		int i_276_ = class527_sub38_sub2.readUnsignedByteC(940336867);
		boolean bool = (i_276_ & 0x1) != 0;
		if (!aBool6937)
			method8316((byte) -1);
		method8405(Class255.method4705(i_273_, 1872987619), -32211252);
		class527_sub38_sub2.method18450(1281888624);
		HashSet hashset = new HashSet();
		for (int i_277_ = 0; i_277_ < 4; i_277_++) {
			for (int i_278_ = 0; i_278_ < anInt6935 * -1501092105 >> 3; i_278_++) {
				for (int i_279_ = 0; i_279_ < anInt6956 * 1417173501 >> 3; i_279_++) {
					int i_280_ = class527_sub38_sub2.method18469(1, 256409342);
					if (i_280_ == 1) {
						int i_281_ = class527_sub38_sub2.method18469(26, 1475854979);
						anIntArrayArrayArray6964[i_277_][i_278_][i_279_] = i_281_;
						int i_282_ = i_281_ >> 14 & 0x3ff;
						int i_283_ = i_281_ >> 3 & 0x7ff;
						int i_284_ = i_282_ >> 3 << 8 | i_283_ >> 3;
						hashset.add(Integer.valueOf(i_284_));
					} else
						anIntArrayArrayArray6964[i_277_][i_278_][i_279_] = -1;
				}
			}
		}
		class527_sub38_sub2.method18452(2109510165);
		int i_285_ = hashset.size();
		anIntArray6930 = new int[i_285_];
		anIntArray6958 = new int[i_285_];
		aByteArrayArray6959 = new byte[i_285_][];
		aByteArrayArray6960 = new byte[i_285_][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i_285_][];
		aByteArrayArray6955 = new byte[i_285_][];
		i_285_ = 0;
		for (int i_286_ = 0; i_286_ < 4; i_286_++) {
			for (int i_287_ = 0; i_287_ < -1501092105 * anInt6935 >> 3; i_287_++) {
				for (int i_288_ = 0; i_288_ < anInt6956 * 1417173501 >> 3; i_288_++) {
					int i_289_ = anIntArrayArrayArray6964[i_286_][i_287_][i_288_];
					if (i_289_ != -1) {
						int i_290_ = i_289_ >> 14 & 0x3ff;
						int i_291_ = i_289_ >> 3 & 0x7ff;
						int i_292_ = (i_290_ / 8 << 8) + i_291_ / 8;
						for (int i_293_ = 0; i_293_ < i_285_; i_293_++) {
							if (anIntArray6930[i_293_] == i_292_) {
								i_292_ = -1;
								break;
							}
						}
						if (-1 != i_292_) {
							int i_294_ = i_292_ >> 8 & 0xff;
							int i_295_ = i_292_ & 0xff;
							if (Class64.aClass459_743.method7474(method8379(i_294_, i_295_, -633207463), (-983826993 * Class464.aClass464_5295.anInt5292), -1189344036)) {
								anIntArray6930[i_285_] = i_292_;
								anIntArray6958[i_285_] = method8379(i_294_, i_295_, -633207463);
								i_285_++;
							}
						}
					}
				}
			}
		}
		anInt6950 = i_285_ * 1083007835;
		method8317(i_275_, i, 10, bool, (byte) -22);
	}

	void method8383(Class456_Sub1 class456_sub1, byte[][] is) {
		for (int i = 0; i < 587945237 * class456_sub1.anInt5047; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(-650428736);
			for (int i_296_ = 0; i_296_ < anInt6935 * -1501092105 >> 3; i_296_++) {
				for (int i_297_ = 0; i_297_ < anInt6956 * 1417173501 >> 3; i_297_++) {
					int i_298_ = anIntArrayArrayArray6964[i][i_296_][i_297_];
					if (i_298_ != -1) {
						int i_299_ = i_298_ >> 24 & 0x3;
						if (!class456_sub1.aBool4976 || i_299_ == 0) {
							int i_300_ = i_298_ >> 1 & 0x3;
							int i_301_ = i_298_ >> 14 & 0x3ff;
							int i_302_ = i_298_ >> 3 & 0x7ff;
							int i_303_ = (i_301_ / 8 << 8) + i_302_ / 8;
							for (int i_304_ = 0; i_304_ < anIntArray6930.length; i_304_++) {
								if (i_303_ == anIntArray6930[i_304_] && is[i_304_] != null) {
									RSByteBuffer class527_sub38 = new RSByteBuffer(is[i_304_]);
									class456_sub1.method7398(class527_sub38, i, i_296_ * 8, i_297_ * 8, i_299_, i_301_, i_302_, i_300_, -1274224851);
									class456_sub1.method15959(Class402.aClass180_4150, class527_sub38, i, i_296_ * 8, 8 * i_297_, i_299_, i_301_, i_302_, i_300_, (byte) 68);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < class456_sub1.anInt5047 * 587945237; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(503857027);
			for (int i_305_ = 0; i_305_ < anInt6935 * -1501092105 >> 3; i_305_++) {
				for (int i_306_ = 0; i_306_ < 1417173501 * anInt6956 >> 3; i_306_++) {
					int i_307_ = anIntArrayArrayArray6964[i][i_305_][i_306_];
					if (i_307_ == -1)
						class456_sub1.method7352(i, i_305_ * 8, i_306_ * 8, 8, 8, -375517254);
				}
			}
		}
	}

	void method8384() {
		aClass503_6927 = aClass503_6926;
		method8405(Class282.aClass282_3192, -32211252);
		for (int i = 0; i < 4; i++) {
			for (int i_308_ = 0; i_308_ < anInt6935 * -1501092105 >> 3; i_308_++) {
				for (int i_309_ = 0; i_309_ < anInt6956 * 1417173501 >> 3; i_309_++)
					anIntArrayArrayArray6964[i][i_308_][i_309_] = -1;
			}
		}
		for (Class527_Sub5 class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14081((short) -4977)); null != class527_sub5; class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14086(-65534))) {
			int i = 13221953 * class527_sub5.anInt10390;
			boolean bool = (i & 0x1) == 1;
			int i_310_ = class527_sub5.anInt10387 * -1275360735 >> 3;
			int i_311_ = class527_sub5.anInt10384 * -12667853 >> 3;
			int i_312_ = 518359233 * class527_sub5.anInt10386;
			int i_313_ = class527_sub5.anInt10382 * 1949853763;
			int i_314_ = -1808237439 * class527_sub5.anInt10383;
			int i_315_ = -1126139181 * class527_sub5.anInt10385;
			int i_316_ = 1997972785 * class527_sub5.anInt10388;
			int i_317_ = -367579771 * class527_sub5.anInt10389;
			int i_318_ = 0;
			int i_319_ = 0;
			int i_320_ = 1;
			int i_321_ = 1;
			if (i == 1) {
				i_319_ = i_316_ - 1;
				i_320_ = -1;
			} else if (2 == i) {
				i_319_ = i_316_ - 1;
				i_318_ = i_317_ - 1;
				i_320_ = -1;
				i_321_ = -1;
			} else if (3 == i) {
				i_318_ = i_317_ - 1;
				i_320_ = 1;
				i_321_ = -1;
			}
			int i_322_ = i_311_;
			while (i_322_ < i_317_ + i_311_) {
				int i_323_ = i_319_;
				int i_324_ = i_310_;
				while (i_324_ < i_310_ + i_316_) {
					if (bool)
						anIntArrayArrayArray6964[i_315_][i_312_ + i_318_][i_323_ + i_313_] = (i << 1) + ((i_314_ << 24) + (i_324_ << 14) + (i_322_ << 3));
					else
						anIntArrayArrayArray6964[i_315_][i_323_ + i_312_][i_313_ + i_318_] = ((i_314_ << 24) + (i_324_ << 14) + (i_322_ << 3) + (i << 1));
					i_324_++;
					i_323_ += i_320_;
				}
				i_322_++;
				i_318_ += i_321_;
			}
		}
		int i = client.anInt11084 * -403166697;
		anIntArray6930 = new int[i];
		anIntArray6958 = new int[i];
		aByteArrayArray6959 = new byte[i][];
		aByteArrayArray6960 = new byte[i][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i][];
		aByteArrayArray6955 = new byte[i][];
		i = 0;
		for (Class527_Sub5 class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14081((short) -15811)); null != class527_sub5; class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14086(-65534))) {
			int i_325_ = class527_sub5.anInt10387 * -1275360735 >>> 3;
			int i_326_ = -12667853 * class527_sub5.anInt10384 >>> 3;
			int i_327_ = i_325_ + 1997972785 * class527_sub5.anInt10388;
			if ((i_327_ & 0x7) == 0)
				i_327_--;
			i_327_ >>>= 3;
			int i_328_ = i_326_ + -367579771 * class527_sub5.anInt10389;
			if (0 == (i_328_ & 0x7))
				i_328_--;
			i_328_ >>>= 3;
			for (int i_329_ = i_325_ >>> 3; i_329_ <= i_327_; i_329_++) {
				while_5_: for (int i_330_ = i_326_ >>> 3; i_330_ <= i_328_; i_330_++) {
					int i_331_ = i_329_ << 8 | i_330_;
					for (int i_332_ = 0; i_332_ < i; i_332_++) {
						if (i_331_ == anIntArray6930[i_332_])
							continue while_5_;
					}
					if (Class64.aClass459_743.method7474(method8379(i_329_, i_330_, -633207463), -983826993 * Class464.aClass464_5295.anInt5292, 868149694)) {
						anIntArray6930[i] = i_331_;
						anIntArray6958[i] = method8379(i_329_, i_330_, -633207463);
						i++;
					}
				}
			}
		}
		anInt6950 = 1083007835 * i;
		method8317(-1501092105 * anInt6935 >> 4, anInt6956 * 1417173501 >> 4, 10, false, (byte) -65);
	}

	void method8385() {
		aClass503_6927 = aClass503_6926;
		method8405(Class282.aClass282_3192, -32211252);
		for (int i = 0; i < 4; i++) {
			for (int i_333_ = 0; i_333_ < anInt6935 * -1501092105 >> 3; i_333_++) {
				for (int i_334_ = 0; i_334_ < anInt6956 * 1417173501 >> 3; i_334_++)
					anIntArrayArrayArray6964[i][i_333_][i_334_] = -1;
			}
		}
		for (Class527_Sub5 class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14081((short) 6209)); null != class527_sub5; class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14086(-65534))) {
			int i = 13221953 * class527_sub5.anInt10390;
			boolean bool = (i & 0x1) == 1;
			int i_335_ = class527_sub5.anInt10387 * -1275360735 >> 3;
			int i_336_ = class527_sub5.anInt10384 * -12667853 >> 3;
			int i_337_ = 518359233 * class527_sub5.anInt10386;
			int i_338_ = class527_sub5.anInt10382 * 1949853763;
			int i_339_ = -1808237439 * class527_sub5.anInt10383;
			int i_340_ = -1126139181 * class527_sub5.anInt10385;
			int i_341_ = 1997972785 * class527_sub5.anInt10388;
			int i_342_ = -367579771 * class527_sub5.anInt10389;
			int i_343_ = 0;
			int i_344_ = 0;
			int i_345_ = 1;
			int i_346_ = 1;
			if (i == 1) {
				i_344_ = i_341_ - 1;
				i_345_ = -1;
			} else if (2 == i) {
				i_344_ = i_341_ - 1;
				i_343_ = i_342_ - 1;
				i_345_ = -1;
				i_346_ = -1;
			} else if (3 == i) {
				i_343_ = i_342_ - 1;
				i_345_ = 1;
				i_346_ = -1;
			}
			int i_347_ = i_336_;
			while (i_347_ < i_342_ + i_336_) {
				int i_348_ = i_344_;
				int i_349_ = i_335_;
				while (i_349_ < i_335_ + i_341_) {
					if (bool)
						anIntArrayArrayArray6964[i_340_][i_337_ + i_343_][i_348_ + i_338_] = (i << 1) + ((i_339_ << 24) + (i_349_ << 14) + (i_347_ << 3));
					else
						anIntArrayArrayArray6964[i_340_][i_348_ + i_337_][i_338_ + i_343_] = ((i_339_ << 24) + (i_349_ << 14) + (i_347_ << 3) + (i << 1));
					i_349_++;
					i_348_ += i_345_;
				}
				i_347_++;
				i_343_ += i_346_;
			}
		}
		int i = client.anInt11084 * -403166697;
		anIntArray6930 = new int[i];
		anIntArray6958 = new int[i];
		aByteArrayArray6959 = new byte[i][];
		aByteArrayArray6960 = new byte[i][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i][];
		aByteArrayArray6955 = new byte[i][];
		i = 0;
		for (Class527_Sub5 class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14081((short) -8129)); null != class527_sub5; class527_sub5 = ((Class527_Sub5) Class209.aClass694_2243.method14086(-65534))) {
			int i_350_ = class527_sub5.anInt10387 * -1275360735 >>> 3;
			int i_351_ = -12667853 * class527_sub5.anInt10384 >>> 3;
			int i_352_ = i_350_ + 1997972785 * class527_sub5.anInt10388;
			if ((i_352_ & 0x7) == 0)
				i_352_--;
			i_352_ >>>= 3;
			int i_353_ = i_351_ + -367579771 * class527_sub5.anInt10389;
			if (0 == (i_353_ & 0x7))
				i_353_--;
			i_353_ >>>= 3;
			for (int i_354_ = i_350_ >>> 3; i_354_ <= i_352_; i_354_++) {
				while_7_: for (int i_355_ = i_351_ >>> 3; i_355_ <= i_353_; i_355_++) {
					int i_356_ = i_354_ << 8 | i_355_;
					for (int i_357_ = 0; i_357_ < i; i_357_++) {
						if (i_356_ == anIntArray6930[i_357_])
							continue while_7_;
					}
					if (Class64.aClass459_743.method7474(method8379(i_354_, i_355_, -633207463), -983826993 * Class464.aClass464_5295.anInt5292, -1280085340)) {
						anIntArray6930[i] = i_356_;
						anIntArray6958[i] = method8379(i_354_, i_355_, -633207463);
						i++;
					}
				}
			}
		}
		anInt6950 = 1083007835 * i;
		method8317(-1501092105 * anInt6935 >> 4, anInt6956 * 1417173501 >> 4, 10, false, (byte) -109);
	}

	void method8386(Class527_Sub38_Sub2 class527_sub38_sub2, byte i) {
		int i_358_ = class527_sub38_sub2.readUnsignedShort();
		int i_359_ = class527_sub38_sub2.readUnsignedByteC(-712683774);
		boolean bool = class527_sub38_sub2.readUnsignedByteC(-1520152358) == 1;
		anInt6938 = class527_sub38_sub2.readUnsignedByte() * -1552819617;
		int i_360_ = class527_sub38_sub2.readUnsignedShort();
		int i_361_ = class527_sub38_sub2.readUnsignedByteC(366717024);
		if (!aBool6937)
			method8316((byte) -1);
		method8405(Class255.method4705(i_359_, 1869761516), -32211252);
		anIntArray6930 = new int[i_361_];
		anIntArray6958 = new int[i_361_];
		aByteArrayArray6959 = new byte[i_361_][];
		aByteArrayArray6960 = new byte[i_361_][];
		aByteArrayArray6942 = null;
		aByteArrayArray6962 = new byte[i_361_][];
		aByteArrayArray6955 = new byte[i_361_][];
		i_361_ = 0;
		for (int i_362_ = (i_358_ - (-1501092105 * anInt6935 >> 4)) / 8; i_362_ <= (i_358_ + (anInt6935 * -1501092105 >> 4)) / 8; i_362_++) {
			for (int i_363_ = (i_360_ - (1417173501 * anInt6956 >> 4)) / 8; i_363_ <= ((anInt6956 * 1417173501 >> 4) + i_360_) / 8; i_363_++) {
				if (Class64.aClass459_743.method7474(method8379(i_362_, i_363_, -633207463), -983826993 * Class464.aClass464_5295.anInt5292, -605419271)) {
					anIntArray6930[i_361_] = i_363_ + (i_362_ << 8);
					anIntArray6958[i_361_] = method8379(i_362_, i_363_, -633207463);
					i_361_++;
				}
			}
		}
		anInt6950 = 1083007835 * i_361_;
		method8317(i_358_, i_360_, 10, bool, (byte) -99);
	}

	int method8387(int i, int i_364_) {
		return i | i_364_ << 7;
	}

	void method8388(Class282 class282) {
		if (aClass282_6928 != class282) {
			anInt6935 = (anInt6956 = -707703295 * class282.anInt3197) * -1427798613;
			anIntArrayArrayArray6964 = (new int[4][anInt6935 * -1501092105 >> 3][anInt6956 * 1417173501 >> 3]);
			anIntArrayArray6947 = new int[anInt6935 * -1501092105][anInt6956 * 1417173501];
			anIntArrayArray6948 = new int[-1501092105 * anInt6935][anInt6956 * 1417173501];
			aByteArrayArrayArray6940 = new byte[4][anInt6935 * -1501092105][anInt6956 * 1417173501];
			aClass470_6957 = new Class470(4, -1501092105 * anInt6935, anInt6956 * 1417173501);
			method8305(false, -1554930812);
			Class202.method3772(-493064662);
			aClass282_6928 = class282;
		}
	}

	void method8389(Class282 class282) {
		if (aClass282_6928 != class282) {
			anInt6935 = (anInt6956 = -707703295 * class282.anInt3197) * -1427798613;
			anIntArrayArrayArray6964 = (new int[4][anInt6935 * -1501092105 >> 3][anInt6956 * 1417173501 >> 3]);
			anIntArrayArray6947 = new int[anInt6935 * -1501092105][anInt6956 * 1417173501];
			anIntArrayArray6948 = new int[-1501092105 * anInt6935][anInt6956 * 1417173501];
			aByteArrayArrayArray6940 = new byte[4][anInt6935 * -1501092105][anInt6956 * 1417173501];
			aClass470_6957 = new Class470(4, -1501092105 * anInt6935, anInt6956 * 1417173501);
			method8305(false, -859051071);
			Class202.method3772(-409151447);
			aClass282_6928 = class282;
		}
	}

	void method8390(int i, int i_365_, int i_366_, boolean bool) {
		if (2 == -1481292237 * client.anInt11080) {
			if (aBool6937)
				throw new IllegalStateException();
			client.anInt11080 = -1474990351;
			client.anInt11245 = -5641215;
		}
		if (bool || i != anInt6933 * 1760010523 || 1300507587 * anInt6969 != i_365_) {
			anInt6933 = -514273005 * i;
			anInt6969 = i_365_ * 1273732331;
			if (!aBool6937) {
				Class78.method1560(i_366_, (byte) 0);
				Class307.method5612(Class53.aClass53_625.method1290(Class144_Sub1.aClass671_8995, (byte) -2), true, Class402.aClass180_4150, Class85.aClass174_819, Class581.aClass22_7677, 1067144049);
			}
			if (null != aClass592_6931)
				aClass592_6951 = aClass592_6931;
			else
				aClass592_6951 = new Class592(0, 0, 0);
			aClass592_6931 = new Class592(0, 8 * (1760010523 * anInt6933 - (-1501092105 * anInt6935 >> 4)), (anInt6969 * 1300507587 - (anInt6956 * 1417173501 >> 4)) * 8);
			aClass527_Sub8_Sub12_6929 = Class529.method8818((aClass592_6931.anInt7798 * 153371143 + -1501092105 * anInt6935 / 2), (-2029646807 * aClass592_6931.anInt7799 + -1501092105 * anInt6935 / 2));
			aClass532_6943 = null;
			aLong6967 = -4523297059643251975L;
			if (!aBool6937)
				method8318(i_366_, -790624408);
		}
	}

	void method8391() {
		method8405(Class255.method4705(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594.method17010((byte) -101), 1487212225), -32211252);
		int i = 153371143 * aClass592_6931.anInt7798;
		int i_367_ = aClass592_6931.anInt7799 * -2029646807;
		int i_368_ = (-1998563323 * Class320.anInt3543 >> 12) + (i >> 3);
		int i_369_ = (-1261737255 * Class201.anInt2211 >> 12) + (i_367_ >> 3);
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864 = (byte) 0;
		Class673.anInt8585 = 0;
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18886(8, 8, -867288567);
		int i_370_ = 18;
		anIntArray6930 = new int[i_370_];
		anIntArray6958 = new int[i_370_];
		aByteArrayArray6959 = new byte[i_370_][];
		aByteArrayArray6960 = new byte[i_370_][];
		aByteArrayArray6942 = new byte[i_370_][];
		aByteArrayArray6962 = new byte[i_370_][];
		aByteArrayArray6955 = new byte[i_370_][];
		i_370_ = 0;
		for (int i_371_ = (i_368_ - (anInt6935 * -1501092105 >> 4)) / 8; i_371_ <= (i_368_ + (-1501092105 * anInt6935 >> 4)) / 8; i_371_++) {
			for (int i_372_ = (i_369_ - (anInt6956 * 1417173501 >> 4)) / 8; i_372_ <= ((1417173501 * anInt6956 >> 4) + i_369_) / 8; i_372_++) {
				int i_373_ = i_372_ + (i_371_ << 8);
				if (Class64.aClass459_743.method7474(method8379(i_371_, i_372_, -633207463), (Class464.aClass464_5295.anInt5292) * -983826993, -1187226372)) {
					anIntArray6930[i_370_] = i_373_;
					anIntArray6958[i_370_] = method8379(i_371_, i_372_, -633207463);
					i_370_++;
				}
			}
		}
		anInt6950 = i_370_ * 1083007835;
		int i_374_;
		if (16 == client.anInt11048 * -1927019389)
			i_374_ = 7;
		else if (-1927019389 * client.anInt11048 == 8)
			i_374_ = 6;
		else if (0 == client.anInt11048 * -1927019389)
			i_374_ = 14;
		else if (11 == client.anInt11048 * -1927019389)
			i_374_ = 5;
		else
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt11048 * -1927019389).toString());
		method8317(i_368_, i_369_, i_374_, false, (byte) -116);
	}

	public void method8392(int i) {
		aClass623_6936.method10295(this, null, 0, -1593935447);
	}

	void method8393(int i, int i_375_, int i_376_, boolean bool) {
		if (2 == -1481292237 * client.anInt11080) {
			if (aBool6937)
				throw new IllegalStateException();
			client.anInt11080 = -1474990351;
			client.anInt11245 = -5641215;
		}
		if (bool || i != anInt6933 * 1760010523 || 1300507587 * anInt6969 != i_375_) {
			anInt6933 = -514273005 * i;
			anInt6969 = i_375_ * 1273732331;
			if (!aBool6937) {
				Class78.method1560(i_376_, (byte) 0);
				Class307.method5612(Class53.aClass53_625.method1290(Class144_Sub1.aClass671_8995, (byte) -61), true, Class402.aClass180_4150, Class85.aClass174_819, Class581.aClass22_7677, 157157913);
			}
			if (null != aClass592_6931)
				aClass592_6951 = aClass592_6931;
			else
				aClass592_6951 = new Class592(0, 0, 0);
			aClass592_6931 = new Class592(0, 8 * (1760010523 * anInt6933 - (-1501092105 * anInt6935 >> 4)), (anInt6969 * 1300507587 - (anInt6956 * 1417173501 >> 4)) * 8);
			aClass527_Sub8_Sub12_6929 = Class529.method8818((aClass592_6931.anInt7798 * 153371143 + -1501092105 * anInt6935 / 2), (-2029646807 * aClass592_6931.anInt7799 + -1501092105 * anInt6935 / 2));
			aClass532_6943 = null;
			aLong6967 = -4523297059643251975L;
			if (!aBool6937)
				method8318(i_376_, -203320047);
		}
	}

	public int method8394(int i) {
		return anInt6965 * 455734749;
	}

	void method8395() {
		aClass456_Sub1_6932 = null;
		aClass456_Sub1_6949 = null;
		if (null != aClass470_6957)
			aClass470_6957.method7709(-1649563488);
		if (null != aClass623_6936)
			aClass623_6936.method10247(-1413884076);
		if (aClass555_6934 != null) {
			aClass555_6934.aClass546_7480.method9052((byte) -48);
			aClass555_6934 = null;
		}
	}

	void method8396() {
		aClass456_Sub1_6932 = null;
		aClass456_Sub1_6949 = null;
		if (null != aClass470_6957)
			aClass470_6957.method7709(-1649563488);
		if (null != aClass623_6936)
			aClass623_6936.method10247(-1413884076);
		if (aClass555_6934 != null) {
			aClass555_6934.aClass546_7480.method9052((byte) -58);
			aClass555_6934 = null;
		}
	}

	public Class623 method8397(int i) {
		return aClass623_6936;
	}

	void method8398() {
		aClass456_Sub1_6932 = null;
		aClass456_Sub1_6949 = null;
		if (null != aClass470_6957)
			aClass470_6957.method7709(-1649563488);
		if (null != aClass623_6936)
			aClass623_6936.method10247(-1413884076);
		if (aClass555_6934 != null) {
			aClass555_6934.aClass546_7480.method9052((byte) -127);
			aClass555_6934 = null;
		}
	}

	public boolean method8399() {
		if (!aBool6937)
			Class568.method9570(false, -1588789920);
		if (aLong6967 * 9166316196517380279L == -1L)
			aLong6967 = Class234.method4347(-1408626088) * 4523297059643251975L;
		anInt6925 = 0;
		for (int i = 0; i < anInt6950 * 291247315; i++) {
			if (!Class64.aClass459_743.method7552(anIntArray6958[i], (byte) 13))
				anInt6925 += -1181254821;
		}
		if (null == aClass532_6943) {
			if (null != aClass527_Sub8_Sub12_6929 && aClass459_6970.method7495((aClass527_Sub8_Sub12_6929.aString11755), 2078177596)) {
				if (!aClass459_6970.method7485((aClass527_Sub8_Sub12_6929.aString11755), 1148390998))
					anInt6925 += -1181254821;
				else
					aClass532_6943 = Class19.method770(aClass459_6970, (aClass527_Sub8_Sub12_6929.aString11755), client.aBool11165, 16777472);
			} else
				aClass532_6943 = new Class532(0);
		}
		if (anInt6925 * -2039202605 > 0) {
			if (anInt6952 * -1756875253 < -2039202605 * anInt6925)
				anInt6952 = anInt6925 * -1231865511;
			aClass500_6963 = Class500.aClass500_5594;
			return false;
		}
		for (int i = 0; i < 291247315 * anInt6950; i++) {
			if (null == aByteArrayArray6959[i])
				aByteArrayArray6959[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5295.anInt5292)), (byte) -123);
			if (aByteArrayArray6960[i] == null)
				aByteArrayArray6960[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5293.anInt5292)), (byte) -50);
			if (null == aByteArrayArray6962[i])
				aByteArrayArray6962[i] = Class64.aClass459_743.method7470(anIntArray6958[i], ((Class464.aClass464_5291.anInt5292) * -983826993), (byte) -25);
			if (aByteArrayArray6955[i] == null)
				aByteArrayArray6955[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5294.anInt5292)), (byte) -22);
			if (aByteArrayArray6942 != null && null == aByteArrayArray6942[i])
				aByteArrayArray6942[i] = Class64.aClass459_743.method7470(anIntArray6958[i], ((Class464.aClass464_5300.anInt5292) * -983826993), (byte) -118);
		}
		int i = -71850849 * anInt6953;
		Class645 class645 = new Class645(-1);
		Class645 class645_377_ = new Class645(-1);
		anInt6953 = 0;
		for (int i_378_ = 0; i_378_ < 291247315 * anInt6950; i_378_++) {
			byte[] is = aByteArrayArray6960[i_378_];
			if (null != is) {
				int i_379_ = ((anIntArray6930[i_378_] >> 8) * 64 - aClass592_6931.anInt7798 * 153371143);
				int i_380_ = (64 * (anIntArray6930[i_378_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
				if (aClass503_6926.method8206(1596025804)) {
					i_379_ = 10;
					i_380_ = 10;
				}
				int i_381_ = Class271.method5077(aClass24_Sub6_6946, is, i_379_, i_380_, anInt6935 * -1501092105, anInt6956 * 1417173501, class645_377_, class645, -1933880698);
				if (i_381_ > 0)
					anInt6953 += i_381_ * 1378645855;
			}
			is = aByteArrayArray6955[i_378_];
			if (is != null) {
				int i_382_ = ((anIntArray6930[i_378_] >> 8) * 64 - 153371143 * aClass592_6931.anInt7798);
				int i_383_ = ((anIntArray6930[i_378_] & 0xff) * 64 - aClass592_6931.anInt7799 * -2029646807);
				if (aClass503_6926.method8206(-1940193559)) {
					i_382_ = 10;
					i_383_ = 10;
				}
				int i_384_ = Class271.method5077(aClass24_Sub6_6946, is, i_382_, i_383_, -1501092105 * anInt6935, anInt6956 * 1417173501, class645_377_, class645, 139917932);
				if (i_384_ > 0)
					anInt6953 += i_384_ * 1378645855;
			}
		}
		if (-71850849 * anInt6953 > 0) {
			if (anInt6953 * -71850849 == i) {
				if (anInt6961 * 644074087 != 0 && 1000 == client.anInt11019 - anInt6961 * 644074087) {
					Class287.method5216(719556723 * class645_377_.anInt8348, 719556723 * class645.anInt8348, -71850849 * anInt6953, (byte) 92);
					Class643.method10737(-1746383154);
				}
			} else
				anInt6961 = -460082857 * client.anInt11019;
			if (-66692121 * anInt6954 < anInt6953 * -71850849)
				anInt6954 = 1238178441 * anInt6953;
			aClass500_6963 = Class500.aClass500_5596;
			return false;
		}
		if (!aBool6937 && aClass500_6963 != Class500.aClass500_5595)
			Class307.method5612(new StringBuilder().append(Class53.aClass53_625.method1290((Class144_Sub1.aClass671_8995), (byte) -56)).append(Class33.aString329).append("(100%)").toString(), true, Class402.aClass180_4150, Class85.aClass174_819, Class581.aClass22_7677, 2106050303);
		aClass500_6963 = Class500.aClass500_5597;
		if (!aBool6937 && Class245.aClass226_2698 != null)
			Class245.aClass226_2698.method4200(1361948151);
		if (!aBool6937) {
			for (int i_385_ = 0; i_385_ < 2048; i_385_++) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_385_];
				if (null != class640_sub1_sub2_sub1_sub2)
					class640_sub1_sub2_sub1_sub2.aClass555_10867 = null;
			}
			for (int i_386_ = 0; i_386_ < client.aClass527_Sub26Array11313.length; i_386_++) {
				Class527_Sub26 class527_sub26 = client.aClass527_Sub26Array11313[i_386_];
				if (null != class527_sub26)
					((Class640_Sub1) class527_sub26.anObject10522).aClass555_10867 = null;
			}
		}
		if (!aBool6937)
			Class32.method942(true, 1377666008);
		boolean bool = false;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-605031225) == 2) {
			for (int i_387_ = 0; i_387_ < 291247315 * anInt6950; i_387_++) {
				if (aByteArrayArray6955[i_387_] != null || null != aByteArrayArray6962[i_387_]) {
					bool = true;
					break;
				}
			}
		}
		int i_388_ = (Class689.method13996(Class204.aClass527_Sub31_2213.aClass700_Sub33_10609.method17247(1831204839), -254728301).anInt3271 * -1088851960);
		if (Class402.aClass180_4150.method3094())
			i_388_++;
		method8307(1437415152);
		method8319(474968661);
		aClass555_6934 = new Class555(Class402.aClass180_4150, 9, 4, anInt6935 * -1501092105, anInt6956 * 1417173501, i_388_, bool, Class402.aClass180_4150.method3188() > 0);
		aClass555_6934.method9220(false, (byte) -88);
		aClass555_6934.method9218(475651289 * client.anInt11032, 1796124192);
		aClass555_6934.method9275(aHashMap6968, -1872985412);
		if (client.anInt11032 * 475651289 != 0)
			aClass555_6934.method9310(Class24_Sub9.aClass174_10977, 1551166221);
		else
			aClass555_6934.method9310(null, 1551166221);
		aClass512_6944 = new Class512();
		aFloat6945 = -0.05F + (float) (Math.random() / 10.0);
		aClass456_Sub1_6949 = new Class456_Sub1(aClass555_6934, aClass24_Sub6_6946, 4, anInt6935 * -1501092105, 1417173501 * anInt6956, false, aClass470_6957, aClass623_6936);
		aClass456_Sub1_6949.method7395(2087039861);
		aClass456_Sub1_6949.anInt4980 = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-195235483) * 2019629863;
		aClass456_Sub1_6949.aBool5022 = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-1428323309) == 2;
		aClass456_Sub1_6949.aBool4982 = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-1743391521) == 1;
		aClass456_Sub1_6949.aBool4983 = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(822910829) == 1;
		aClass456_Sub1_6949.aBool4984 = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-1385990196) == 1;
		if (!aClass503_6926.method8206(535102739))
			method8370(aClass456_Sub1_6949, aByteArrayArray6959, (byte) 1);
		else
			method8291(aClass456_Sub1_6949, aByteArrayArray6959, -2083493930);
		if (aBool6937)
			method8321(50, (byte) 118);
		aClass623_6936.method10248(anInt6935 * -1501092105 >> 4, 1417173501 * anInt6956 >> 4, 302262100);
		aClass623_6936.method10250(this, 1009479683);
		if (bool) {
			aClass555_6934.method9220(true, (byte) -104);
			aClass456_Sub1_6932 = new Class456_Sub1(aClass555_6934, aClass24_Sub6_6946, 1, -1501092105 * anInt6935, 1417173501 * anInt6956, true, aClass470_6957, aClass623_6936);
			aClass456_Sub1_6932.method7395(2006203626);
			aClass456_Sub1_6932.anInt4980 = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(834714804) * 2019629863;
			aClass456_Sub1_6932.aBool5022 = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-1014955088) == 2;
			aClass456_Sub1_6932.aBool4982 = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-1387021015) == 1;
			aClass456_Sub1_6932.aBool4983 = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(-566441183) == 1;
			aClass456_Sub1_6932.aBool4984 = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-1120287220) == 1;
			if (!aClass503_6926.method8206(-1596248041)) {
				method8370(aClass456_Sub1_6932, aByteArrayArray6962, (byte) 1);
				if (!aBool6937)
					Class568.method9570(true, -1358942049);
			} else {
				method8291(aClass456_Sub1_6932, aByteArrayArray6962, -1967328472);
				if (!aBool6937)
					Class568.method9570(true, -1432566799);
			}
			aClass456_Sub1_6932.method7356(0, (aClass456_Sub1_6949.anIntArrayArrayArray4989[0]), -2009103387);
			aClass456_Sub1_6932.method7367(Class402.aClass180_4150, null, (byte) 14);
			aClass555_6934.method9220(false, (byte) -51);
			if (aBool6937)
				method8321(50, (byte) 71);
		}
		aClass456_Sub1_6949.method7367(Class402.aClass180_4150, (bool ? (aClass456_Sub1_6932.anIntArrayArrayArray4989) : null), (byte) 26);
		if (!aClass503_6926.method8206(672937709)) {
			if (!aBool6937)
				Class568.method9570(true, -1713408374);
			method8324(aClass456_Sub1_6949, aByteArrayArray6960, (byte) 20);
			if (null != aByteArrayArray6942)
				method8352(-1792923936);
		} else {
			if (!aBool6937)
				Class568.method9570(true, -798658024);
			method8325(aClass456_Sub1_6949, aByteArrayArray6960, -44123908);
		}
		if (!aBool6937)
			Class568.method9570(true, -1490697537);
		aClass456_Sub1_6949.method7358(Class402.aClass180_4150, (bool ? aClass555_6934.aClass161Array7435[0] : null), null, 828676772);
		if (aBool6937)
			method8321(75, (byte) 98);
		aClass456_Sub1_6949.method15967(Class402.aClass180_4150, false, (byte) 126);
		if (aBool6937)
			method8321(75, (byte) 50);
		if (!aBool6937)
			Class568.method9570(true, -836900743);
		if (bool) {
			aClass555_6934.method9220(true, (byte) -37);
			if (!aBool6937)
				Class568.method9570(true, -1208786099);
			if (!aClass503_6926.method8206(1074109247))
				method8324(aClass456_Sub1_6932, aByteArrayArray6955, (byte) 21);
			else
				method8325(aClass456_Sub1_6932, aByteArrayArray6955, 267083071);
			if (!aBool6937)
				Class568.method9570(true, -768581986);
			aClass456_Sub1_6932.method7358(Class402.aClass180_4150, null, (aClass555_6934.aClass161Array7457[0]), -210660009);
			aClass456_Sub1_6932.method15967(Class402.aClass180_4150, true, (byte) 9);
			if (!aBool6937)
				Class568.method9570(true, -1651559480);
			aClass555_6934.method9220(false, (byte) -40);
			if (aBool6937)
				method8321(50, (byte) 102);
		}
		aClass456_Sub1_6949.method7350(1310886835);
		if (null != aClass456_Sub1_6932)
			aClass456_Sub1_6932.method7350(1310886835);
		aClass555_6934.method9221(1697082085);
		if (aBool6937) {
			Class234.method4347(-1408626088);
			while (!Class402.aClass180_4150.method3178(1314065655))
				method8321(1, (byte) 76);
		}
		boolean bool_389_ = false;
		if (aBool6937) {
			Class509 class509_390_ = client.aClass509_11072;
			method8354(class509_390_, 814719279);
			Class396.aClass506_4119.method8232(class509_390_, 2034781751);
			bool_389_ = true;
			Class234.method4347(-1408626088);
			synchronized (client.anObject11311) {
				client.aBool11073 = true;
				try {
					client.anObject11311.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass509_11072 = this;
			class509_390_.method8319(960598979);
			method8318(10, 603842928);
			method8316((byte) -1);
		} else {
			Class245.aClass226_2698.method4200(113822987);
			aClass623_6936.method10294(-26235718);
			Class527_Sub3.method16047(-2065735189);
		}
		for (int i_391_ = 0; i_391_ < 4; i_391_++) {
			for (int i_392_ = 0; i_392_ < -1501092105 * anInt6935; i_392_++) {
				for (int i_393_ = 0; i_393_ < 1417173501 * anInt6956; i_393_++)
					Class375.method6385(i_391_, i_392_, i_393_, 1394761684);
			}
		}
		for (int i_394_ = 0; i_394_ < client.aClass535Array11026.length; i_394_++) {
			if (null != client.aClass535Array11026[i_394_])
				client.aClass535Array11026[i_394_].method8963((byte) 88);
		}
		Class639_Sub1.method16871((byte) 48);
		Class522_Sub6.method15991(-1054537975);
		if (Class440.method7110((byte) 32) == Class516.aClass516_7049 && client.aClass109_11067.method1967(1902532421) != null && 10 == client.anInt11048 * -1927019389) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4506, client.aClass109_11067.aClass2_1367, (byte) -24);
			class527_sub15.buffer.writeInt(1057001181, -2134458840);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (!aClass503_6926.method8206(970906042)) {
			int i_395_ = ((1760010523 * anInt6933 - (-1501092105 * anInt6935 >> 4)) / 8);
			int i_396_ = (((-1501092105 * anInt6935 >> 4) + 1760010523 * anInt6933) / 8);
			int i_397_ = (1300507587 * anInt6969 - (1417173501 * anInt6956 >> 4)) / 8;
			int i_398_ = ((anInt6956 * 1417173501 >> 4) + anInt6969 * 1300507587) / 8;
			for (int i_399_ = i_395_ - 1; i_399_ <= i_396_ + 1; i_399_++) {
				for (int i_400_ = i_397_ - 1; i_400_ <= 1 + i_398_; i_400_++) {
					if (i_399_ < i_395_ || i_399_ > i_396_ || i_400_ < i_397_ || i_400_ > i_398_)
						Class64.aClass459_743.method7487(method8379(i_399_, i_400_, -633207463), -1861188085);
				}
			}
		}
		long l = (Class234.method4347(-1408626088) - aLong6967 * 9166316196517380279L);
		if (7 == -1927019389 * client.anInt11048)
			Class78.method1560(16, (byte) 0);
		else if (14 == client.anInt11048 * -1927019389)
			Class78.method1560(0, (byte) 0);
		else if (client.anInt11048 * -1927019389 == 6)
			Class78.method1560(8, (byte) 0);
		else if (-1927019389 * client.anInt11048 == 5)
			Class78.method1560(11, (byte) 0);
		else {
			Class78.method1560(9, (byte) 0);
			if (client.aClass109_11067.method1967(1893385853) != null) {
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4405, client.aClass109_11067.aClass2_1367, (byte) 40);
				class527_sub15.buffer.writeInt((int) l, 1963521322);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			}
		}
		if (aBool6939) {
			Class493.method7997(Long.toString(Class234.method4347(-1408626088) - (6830704253204824397L * aLong6966)), (byte) 8);
			aBool6939 = false;
		}
		if (bool_389_) {
			synchronized (client.anObject11074) {
				client.anObject11074.notify();
			}
		}
		return true;
	}

	void method8400(byte i) {
		method8405(Class255.method4705(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594.method17010((byte) -38), 1954827438), -32211252);
		int i_401_ = 153371143 * aClass592_6931.anInt7798;
		int i_402_ = aClass592_6931.anInt7799 * -2029646807;
		int i_403_ = (-1998563323 * Class320.anInt3543 >> 12) + (i_401_ >> 3);
		int i_404_ = (-1261737255 * Class201.anInt2211 >> 12) + (i_402_ >> 3);
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864 = (byte) 0;
		Class673.anInt8585 = 0;
		Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18886(8, 8, -209531783);
		int i_405_ = 18;
		anIntArray6930 = new int[i_405_];
		anIntArray6958 = new int[i_405_];
		aByteArrayArray6959 = new byte[i_405_][];
		aByteArrayArray6960 = new byte[i_405_][];
		aByteArrayArray6942 = new byte[i_405_][];
		aByteArrayArray6962 = new byte[i_405_][];
		aByteArrayArray6955 = new byte[i_405_][];
		i_405_ = 0;
		for (int i_406_ = (i_403_ - (anInt6935 * -1501092105 >> 4)) / 8; i_406_ <= (i_403_ + (-1501092105 * anInt6935 >> 4)) / 8; i_406_++) {
			for (int i_407_ = (i_404_ - (anInt6956 * 1417173501 >> 4)) / 8; i_407_ <= ((1417173501 * anInt6956 >> 4) + i_404_) / 8; i_407_++) {
				int i_408_ = i_407_ + (i_406_ << 8);
				if (Class64.aClass459_743.method7474(method8379(i_406_, i_407_, -633207463), (Class464.aClass464_5295.anInt5292) * -983826993, 465430156)) {
					anIntArray6930[i_405_] = i_408_;
					anIntArray6958[i_405_] = method8379(i_406_, i_407_, -633207463);
					i_405_++;
				}
			}
		}
		anInt6950 = i_405_ * 1083007835;
		int i_409_;
		if (16 == client.anInt11048 * -1927019389)
			i_409_ = 7;
		else if (-1927019389 * client.anInt11048 == 8)
			i_409_ = 6;
		else if (0 == client.anInt11048 * -1927019389)
			i_409_ = 14;
		else if (11 == client.anInt11048 * -1927019389)
			i_409_ = 5;
		else
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt11048 * -1927019389).toString());
		method8317(i_403_, i_404_, i_409_, false, (byte) -9);
	}

	public boolean method8401() {
		if (!aBool6937)
			Class568.method9570(false, -1820495384);
		if (aLong6967 * 9166316196517380279L == -1L)
			aLong6967 = Class234.method4347(-1408626088) * 4523297059643251975L;
		anInt6925 = 0;
		for (int i = 0; i < anInt6950 * 291247315; i++) {
			if (!Class64.aClass459_743.method7552(anIntArray6958[i], (byte) 56))
				anInt6925 += -1181254821;
		}
		if (null == aClass532_6943) {
			if (null != aClass527_Sub8_Sub12_6929 && aClass459_6970.method7495((aClass527_Sub8_Sub12_6929.aString11755), -654010047)) {
				if (!aClass459_6970.method7485((aClass527_Sub8_Sub12_6929.aString11755), 1363185787))
					anInt6925 += -1181254821;
				else
					aClass532_6943 = Class19.method770(aClass459_6970, (aClass527_Sub8_Sub12_6929.aString11755), client.aBool11165, 16777472);
			} else
				aClass532_6943 = new Class532(0);
		}
		if (anInt6925 * -2039202605 > 0) {
			if (anInt6952 * -1756875253 < -2039202605 * anInt6925)
				anInt6952 = anInt6925 * -1231865511;
			aClass500_6963 = Class500.aClass500_5594;
			return false;
		}
		for (int i = 0; i < 291247315 * anInt6950; i++) {
			if (null == aByteArrayArray6959[i])
				aByteArrayArray6959[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5295.anInt5292)), (byte) -4);
			if (aByteArrayArray6960[i] == null)
				aByteArrayArray6960[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5293.anInt5292)), (byte) -39);
			if (null == aByteArrayArray6962[i])
				aByteArrayArray6962[i] = Class64.aClass459_743.method7470(anIntArray6958[i], ((Class464.aClass464_5291.anInt5292) * -983826993), (byte) -44);
			if (aByteArrayArray6955[i] == null)
				aByteArrayArray6955[i] = Class64.aClass459_743.method7470(anIntArray6958[i], (-983826993 * (Class464.aClass464_5294.anInt5292)), (byte) -45);
			if (aByteArrayArray6942 != null && null == aByteArrayArray6942[i])
				aByteArrayArray6942[i] = Class64.aClass459_743.method7470(anIntArray6958[i], ((Class464.aClass464_5300.anInt5292) * -983826993), (byte) -24);
		}
		int i = -71850849 * anInt6953;
		Class645 class645 = new Class645(-1);
		Class645 class645_410_ = new Class645(-1);
		anInt6953 = 0;
		for (int i_411_ = 0; i_411_ < 291247315 * anInt6950; i_411_++) {
			byte[] is = aByteArrayArray6960[i_411_];
			if (null != is) {
				int i_412_ = ((anIntArray6930[i_411_] >> 8) * 64 - aClass592_6931.anInt7798 * 153371143);
				int i_413_ = (64 * (anIntArray6930[i_411_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
				if (aClass503_6926.method8206(-375936808)) {
					i_412_ = 10;
					i_413_ = 10;
				}
				int i_414_ = Class271.method5077(aClass24_Sub6_6946, is, i_412_, i_413_, anInt6935 * -1501092105, anInt6956 * 1417173501, class645_410_, class645, -989942007);
				if (i_414_ > 0)
					anInt6953 += i_414_ * 1378645855;
			}
			is = aByteArrayArray6955[i_411_];
			if (is != null) {
				int i_415_ = ((anIntArray6930[i_411_] >> 8) * 64 - 153371143 * aClass592_6931.anInt7798);
				int i_416_ = ((anIntArray6930[i_411_] & 0xff) * 64 - aClass592_6931.anInt7799 * -2029646807);
				if (aClass503_6926.method8206(-416430583)) {
					i_415_ = 10;
					i_416_ = 10;
				}
				int i_417_ = Class271.method5077(aClass24_Sub6_6946, is, i_415_, i_416_, -1501092105 * anInt6935, anInt6956 * 1417173501, class645_410_, class645, -1934723574);
				if (i_417_ > 0)
					anInt6953 += i_417_ * 1378645855;
			}
		}
		if (-71850849 * anInt6953 > 0) {
			if (anInt6953 * -71850849 == i) {
				if (anInt6961 * 644074087 != 0 && 1000 == client.anInt11019 - anInt6961 * 644074087) {
					Class287.method5216(719556723 * class645_410_.anInt8348, 719556723 * class645.anInt8348, -71850849 * anInt6953, (byte) 92);
					Class643.method10737(-1882276320);
				}
			} else
				anInt6961 = -460082857 * client.anInt11019;
			if (-66692121 * anInt6954 < anInt6953 * -71850849)
				anInt6954 = 1238178441 * anInt6953;
			aClass500_6963 = Class500.aClass500_5596;
			return false;
		}
		if (!aBool6937 && aClass500_6963 != Class500.aClass500_5595)
			Class307.method5612(new StringBuilder().append(Class53.aClass53_625.method1290((Class144_Sub1.aClass671_8995), (byte) -72)).append(Class33.aString329).append("(100%)").toString(), true, Class402.aClass180_4150, Class85.aClass174_819, Class581.aClass22_7677, 396447113);
		aClass500_6963 = Class500.aClass500_5597;
		if (!aBool6937 && Class245.aClass226_2698 != null)
			Class245.aClass226_2698.method4200(495782442);
		if (!aBool6937) {
			for (int i_418_ = 0; i_418_ < 2048; i_418_++) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_418_];
				if (null != class640_sub1_sub2_sub1_sub2)
					class640_sub1_sub2_sub1_sub2.aClass555_10867 = null;
			}
			for (int i_419_ = 0; i_419_ < client.aClass527_Sub26Array11313.length; i_419_++) {
				Class527_Sub26 class527_sub26 = client.aClass527_Sub26Array11313[i_419_];
				if (null != class527_sub26)
					((Class640_Sub1) class527_sub26.anObject10522).aClass555_10867 = null;
			}
		}
		if (!aBool6937)
			Class32.method942(true, -761740750);
		boolean bool = false;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-2135893965) == 2) {
			for (int i_420_ = 0; i_420_ < 291247315 * anInt6950; i_420_++) {
				if (aByteArrayArray6955[i_420_] != null || null != aByteArrayArray6962[i_420_]) {
					bool = true;
					break;
				}
			}
		}
		int i_421_ = (Class689.method13996(Class204.aClass527_Sub31_2213.aClass700_Sub33_10609.method17247(1831204839), -254728301).anInt3271 * -1088851960);
		if (Class402.aClass180_4150.method3094())
			i_421_++;
		method8307(669294279);
		method8319(1410734289);
		aClass555_6934 = new Class555(Class402.aClass180_4150, 9, 4, anInt6935 * -1501092105, anInt6956 * 1417173501, i_421_, bool, Class402.aClass180_4150.method3188() > 0);
		aClass555_6934.method9220(false, (byte) 0);
		aClass555_6934.method9218(475651289 * client.anInt11032, 16227642);
		aClass555_6934.method9275(aHashMap6968, -2019712362);
		if (client.anInt11032 * 475651289 != 0)
			aClass555_6934.method9310(Class24_Sub9.aClass174_10977, 1551166221);
		else
			aClass555_6934.method9310(null, 1551166221);
		aClass512_6944 = new Class512();
		aFloat6945 = -0.05F + (float) (Math.random() / 10.0);
		aClass456_Sub1_6949 = new Class456_Sub1(aClass555_6934, aClass24_Sub6_6946, 4, anInt6935 * -1501092105, 1417173501 * anInt6956, false, aClass470_6957, aClass623_6936);
		aClass456_Sub1_6949.method7395(599139890);
		aClass456_Sub1_6949.anInt4980 = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(861308736) * 2019629863;
		aClass456_Sub1_6949.aBool5022 = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-135330866) == 2;
		aClass456_Sub1_6949.aBool4982 = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-1245788104) == 1;
		aClass456_Sub1_6949.aBool4983 = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(-110300011) == 1;
		aClass456_Sub1_6949.aBool4984 = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-698485153) == 1;
		if (!aClass503_6926.method8206(78117464))
			method8370(aClass456_Sub1_6949, aByteArrayArray6959, (byte) 1);
		else
			method8291(aClass456_Sub1_6949, aByteArrayArray6959, -2014739277);
		if (aBool6937)
			method8321(50, (byte) 9);
		aClass623_6936.method10248(anInt6935 * -1501092105 >> 4, 1417173501 * anInt6956 >> 4, -97965774);
		aClass623_6936.method10250(this, -984150903);
		if (bool) {
			aClass555_6934.method9220(true, (byte) -43);
			aClass456_Sub1_6932 = new Class456_Sub1(aClass555_6934, aClass24_Sub6_6946, 1, -1501092105 * anInt6935, 1417173501 * anInt6956, true, aClass470_6957, aClass623_6936);
			aClass456_Sub1_6932.method7395(921526874);
			aClass456_Sub1_6932.anInt4980 = Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-52741367) * 2019629863;
			aClass456_Sub1_6932.aBool5022 = Class204.aClass527_Sub31_2213.aClass700_Sub18_10615.method17019(-604886676) == 2;
			aClass456_Sub1_6932.aBool4982 = Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-2066852083) == 1;
			aClass456_Sub1_6932.aBool4983 = Class204.aClass527_Sub31_2213.aClass700_Sub40_10604.method17294(-1827415784) == 1;
			aClass456_Sub1_6932.aBool4984 = Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(2009583994) == 1;
			if (!aClass503_6926.method8206(48879764)) {
				method8370(aClass456_Sub1_6932, aByteArrayArray6962, (byte) 1);
				if (!aBool6937)
					Class568.method9570(true, -1532482491);
			} else {
				method8291(aClass456_Sub1_6932, aByteArrayArray6962, -2046993473);
				if (!aBool6937)
					Class568.method9570(true, -1509004330);
			}
			aClass456_Sub1_6932.method7356(0, (aClass456_Sub1_6949.anIntArrayArrayArray4989[0]), 343300564);
			aClass456_Sub1_6932.method7367(Class402.aClass180_4150, null, (byte) 5);
			aClass555_6934.method9220(false, (byte) -119);
			if (aBool6937)
				method8321(50, (byte) 67);
		}
		aClass456_Sub1_6949.method7367(Class402.aClass180_4150, (bool ? (aClass456_Sub1_6932.anIntArrayArrayArray4989) : null), (byte) 13);
		if (!aClass503_6926.method8206(2053859795)) {
			if (!aBool6937)
				Class568.method9570(true, -1094840109);
			method8324(aClass456_Sub1_6949, aByteArrayArray6960, (byte) 92);
			if (null != aByteArrayArray6942)
				method8352(-659186084);
		} else {
			if (!aBool6937)
				Class568.method9570(true, -1106012858);
			method8325(aClass456_Sub1_6949, aByteArrayArray6960, -1777417491);
		}
		if (!aBool6937)
			Class568.method9570(true, -855487607);
		aClass456_Sub1_6949.method7358(Class402.aClass180_4150, (bool ? aClass555_6934.aClass161Array7435[0] : null), null, 2032660775);
		if (aBool6937)
			method8321(75, (byte) 20);
		aClass456_Sub1_6949.method15967(Class402.aClass180_4150, false, (byte) 51);
		if (aBool6937)
			method8321(75, (byte) 89);
		if (!aBool6937)
			Class568.method9570(true, -633903492);
		if (bool) {
			aClass555_6934.method9220(true, (byte) -124);
			if (!aBool6937)
				Class568.method9570(true, -2081577024);
			if (!aClass503_6926.method8206(-1399458838))
				method8324(aClass456_Sub1_6932, aByteArrayArray6955, (byte) 12);
			else
				method8325(aClass456_Sub1_6932, aByteArrayArray6955, 246888166);
			if (!aBool6937)
				Class568.method9570(true, -1849135106);
			aClass456_Sub1_6932.method7358(Class402.aClass180_4150, null, (aClass555_6934.aClass161Array7457[0]), 623386403);
			aClass456_Sub1_6932.method15967(Class402.aClass180_4150, true, (byte) 29);
			if (!aBool6937)
				Class568.method9570(true, -1535466969);
			aClass555_6934.method9220(false, (byte) -105);
			if (aBool6937)
				method8321(50, (byte) 39);
		}
		aClass456_Sub1_6949.method7350(1310886835);
		if (null != aClass456_Sub1_6932)
			aClass456_Sub1_6932.method7350(1310886835);
		aClass555_6934.method9221(1433929503);
		if (aBool6937) {
			Class234.method4347(-1408626088);
			while (!Class402.aClass180_4150.method3178(2074565847))
				method8321(1, (byte) 90);
		}
		boolean bool_422_ = false;
		if (aBool6937) {
			Class509 class509_423_ = client.aClass509_11072;
			method8354(class509_423_, 392287765);
			Class396.aClass506_4119.method8232(class509_423_, 1450470898);
			bool_422_ = true;
			Class234.method4347(-1408626088);
			synchronized (client.anObject11311) {
				client.aBool11073 = true;
				try {
					client.anObject11311.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass509_11072 = this;
			class509_423_.method8319(1064646572);
			method8318(10, -158695167);
			method8316((byte) -1);
		} else {
			Class245.aClass226_2698.method4200(1407675135);
			aClass623_6936.method10294(-296719704);
			Class527_Sub3.method16047(-2031331284);
		}
		for (int i_424_ = 0; i_424_ < 4; i_424_++) {
			for (int i_425_ = 0; i_425_ < -1501092105 * anInt6935; i_425_++) {
				for (int i_426_ = 0; i_426_ < 1417173501 * anInt6956; i_426_++)
					Class375.method6385(i_424_, i_425_, i_426_, 1394761684);
			}
		}
		for (int i_427_ = 0; i_427_ < client.aClass535Array11026.length; i_427_++) {
			if (null != client.aClass535Array11026[i_427_])
				client.aClass535Array11026[i_427_].method8963((byte) 68);
		}
		Class639_Sub1.method16871((byte) 108);
		Class522_Sub6.method15991(-1054537975);
		if (Class440.method7110((byte) -45) == Class516.aClass516_7049 && client.aClass109_11067.method1967(2063531480) != null && 10 == client.anInt11048 * -1927019389) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4506, client.aClass109_11067.aClass2_1367, (byte) -93);
			class527_sub15.buffer.writeInt(1057001181, 2018509408);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
		if (!aClass503_6926.method8206(-79544443)) {
			int i_428_ = ((1760010523 * anInt6933 - (-1501092105 * anInt6935 >> 4)) / 8);
			int i_429_ = (((-1501092105 * anInt6935 >> 4) + 1760010523 * anInt6933) / 8);
			int i_430_ = (1300507587 * anInt6969 - (1417173501 * anInt6956 >> 4)) / 8;
			int i_431_ = ((anInt6956 * 1417173501 >> 4) + anInt6969 * 1300507587) / 8;
			for (int i_432_ = i_428_ - 1; i_432_ <= i_429_ + 1; i_432_++) {
				for (int i_433_ = i_430_ - 1; i_433_ <= 1 + i_431_; i_433_++) {
					if (i_432_ < i_428_ || i_432_ > i_429_ || i_433_ < i_430_ || i_433_ > i_431_)
						Class64.aClass459_743.method7487(method8379(i_432_, i_433_, -633207463), -1861188085);
				}
			}
		}
		long l = (Class234.method4347(-1408626088) - aLong6967 * 9166316196517380279L);
		if (7 == -1927019389 * client.anInt11048)
			Class78.method1560(16, (byte) 0);
		else if (14 == client.anInt11048 * -1927019389)
			Class78.method1560(0, (byte) 0);
		else if (client.anInt11048 * -1927019389 == 6)
			Class78.method1560(8, (byte) 0);
		else if (-1927019389 * client.anInt11048 == 5)
			Class78.method1560(11, (byte) 0);
		else {
			Class78.method1560(9, (byte) 0);
			if (client.aClass109_11067.method1967(1929757727) != null) {
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4405, client.aClass109_11067.aClass2_1367, (byte) -84);
				class527_sub15.buffer.writeInt((int) l, -1176102524);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
			}
		}
		if (aBool6939) {
			Class493.method7997(Long.toString(Class234.method4347(-1408626088) - (6830704253204824397L * aLong6966)), (byte) 8);
			aBool6939 = false;
		}
		if (bool_422_) {
			synchronized (client.anObject11074) {
				client.anObject11074.notify();
			}
		}
		return true;
	}

	void method8402(int i) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method8403(Class456_Sub1 class456_sub1, byte[][] is) {
		for (int i = 0; i < 587945237 * class456_sub1.anInt5047; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(1508968427);
			for (int i_434_ = 0; i_434_ < anInt6935 * -1501092105 >> 3; i_434_++) {
				for (int i_435_ = 0; i_435_ < 1417173501 * anInt6956 >> 3; i_435_++) {
					int i_436_ = anIntArrayArrayArray6964[i][i_434_][i_435_];
					if (i_436_ != -1) {
						int i_437_ = i_436_ >> 24 & 0x3;
						if (!class456_sub1.aBool4976 || i_437_ == 0) {
							int i_438_ = i_436_ >> 1 & 0x3;
							int i_439_ = i_436_ >> 14 & 0x3ff;
							int i_440_ = i_436_ >> 3 & 0x7ff;
							int i_441_ = (i_439_ / 8 << 8) + i_440_ / 8;
							for (int i_442_ = 0; i_442_ < anIntArray6930.length; i_442_++) {
								if (i_441_ == anIntArray6930[i_442_] && null != is[i_442_]) {
									class456_sub1.method15983(Class402.aClass180_4150, is[i_442_], i, 8 * i_434_, i_435_ * 8, i_437_, 8 * (i_439_ & 0x7), (i_440_ & 0x7) * 8, i_438_, (short) 630);
									break;
								}
							}
						}
					}
					if (aBool6937)
						method8321(5, (byte) 89);
				}
			}
		}
	}

	void method8404(int i) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method8405(Class282 class282, int i) {
		if (aClass282_6928 != class282) {
			anInt6935 = (anInt6956 = -707703295 * class282.anInt3197) * -1427798613;
			anIntArrayArrayArray6964 = (new int[4][anInt6935 * -1501092105 >> 3][anInt6956 * 1417173501 >> 3]);
			anIntArrayArray6947 = new int[anInt6935 * -1501092105][anInt6956 * 1417173501];
			anIntArrayArray6948 = new int[-1501092105 * anInt6935][anInt6956 * 1417173501];
			aByteArrayArrayArray6940 = new byte[4][anInt6935 * -1501092105][anInt6956 * 1417173501];
			aClass470_6957 = new Class470(4, -1501092105 * anInt6935, anInt6956 * 1417173501);
			method8305(false, -972162557);
			Class202.method3772(-104773169);
			aClass282_6928 = class282;
		}
	}

	public void method8406(Class24_Sub6 class24_sub6) {
		aClass24_Sub6_6946 = class24_sub6;
	}

	void method8407(Class456_Sub1 class456_sub1, byte[][] is) {
		for (int i = 0; i < 587945237 * class456_sub1.anInt5047; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(1430988009);
			for (int i_443_ = 0; i_443_ < anInt6935 * -1501092105 >> 3; i_443_++) {
				for (int i_444_ = 0; i_444_ < anInt6956 * 1417173501 >> 3; i_444_++) {
					int i_445_ = anIntArrayArrayArray6964[i][i_443_][i_444_];
					if (i_445_ != -1) {
						int i_446_ = i_445_ >> 24 & 0x3;
						if (!class456_sub1.aBool4976 || i_446_ == 0) {
							int i_447_ = i_445_ >> 1 & 0x3;
							int i_448_ = i_445_ >> 14 & 0x3ff;
							int i_449_ = i_445_ >> 3 & 0x7ff;
							int i_450_ = (i_448_ / 8 << 8) + i_449_ / 8;
							for (int i_451_ = 0; i_451_ < anIntArray6930.length; i_451_++) {
								if (i_450_ == anIntArray6930[i_451_] && is[i_451_] != null) {
									RSByteBuffer class527_sub38 = new RSByteBuffer(is[i_451_]);
									class456_sub1.method7398(class527_sub38, i, i_443_ * 8, i_444_ * 8, i_446_, i_448_, i_449_, i_447_, -636379566);
									class456_sub1.method15959(Class402.aClass180_4150, class527_sub38, i, i_443_ * 8, 8 * i_444_, i_446_, i_448_, i_449_, i_447_, (byte) 69);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < class456_sub1.anInt5047 * 587945237; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(1747908976);
			for (int i_452_ = 0; i_452_ < anInt6935 * -1501092105 >> 3; i_452_++) {
				for (int i_453_ = 0; i_453_ < 1417173501 * anInt6956 >> 3; i_453_++) {
					int i_454_ = anIntArrayArrayArray6964[i][i_452_][i_453_];
					if (i_454_ == -1)
						class456_sub1.method7352(i, i_452_ * 8, i_453_ * 8, 8, 8, -375517254);
				}
			}
		}
	}

	void method8408(Class456_Sub1 class456_sub1, byte[][] is) {
		for (int i = 0; i < 587945237 * class456_sub1.anInt5047; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(835214730);
			for (int i_455_ = 0; i_455_ < anInt6935 * -1501092105 >> 3; i_455_++) {
				for (int i_456_ = 0; i_456_ < anInt6956 * 1417173501 >> 3; i_456_++) {
					int i_457_ = anIntArrayArrayArray6964[i][i_455_][i_456_];
					if (i_457_ != -1) {
						int i_458_ = i_457_ >> 24 & 0x3;
						if (!class456_sub1.aBool4976 || i_458_ == 0) {
							int i_459_ = i_457_ >> 1 & 0x3;
							int i_460_ = i_457_ >> 14 & 0x3ff;
							int i_461_ = i_457_ >> 3 & 0x7ff;
							int i_462_ = (i_460_ / 8 << 8) + i_461_ / 8;
							for (int i_463_ = 0; i_463_ < anIntArray6930.length; i_463_++) {
								if (i_462_ == anIntArray6930[i_463_] && is[i_463_] != null) {
									RSByteBuffer class527_sub38 = new RSByteBuffer(is[i_463_]);
									class456_sub1.method7398(class527_sub38, i, i_455_ * 8, i_456_ * 8, i_458_, i_460_, i_461_, i_459_, -1548604300);
									class456_sub1.method15959(Class402.aClass180_4150, class527_sub38, i, i_455_ * 8, 8 * i_456_, i_458_, i_460_, i_461_, i_459_, (byte) 17);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < class456_sub1.anInt5047 * 587945237; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(1098802510);
			for (int i_464_ = 0; i_464_ < anInt6935 * -1501092105 >> 3; i_464_++) {
				for (int i_465_ = 0; i_465_ < 1417173501 * anInt6956 >> 3; i_465_++) {
					int i_466_ = anIntArrayArrayArray6964[i][i_464_][i_465_];
					if (i_466_ == -1)
						class456_sub1.method7352(i, i_464_ * 8, i_465_ * 8, 8, 8, -375517254);
				}
			}
		}
	}

	void method8409(Class456_Sub1 class456_sub1, byte[][] is) {
		for (int i = 0; i < anInt6950 * 291247315; i++) {
			byte[] is_467_ = is[i];
			if (null != is_467_) {
				int i_468_ = ((anIntArray6930[i] >> 8) * 64 - aClass592_6931.anInt7798 * 153371143);
				int i_469_ = (64 * (anIntArray6930[i] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
				if (!aBool6937)
					Class245.aClass226_2698.method4200(227575338);
				class456_sub1.method15960(Class402.aClass180_4150, is_467_, i_468_, i_469_, (byte) 42);
				if (aBool6937)
					method8321(10, (byte) 81);
			}
		}
	}

	void method8410(Class456_Sub1 class456_sub1, byte[][] is) {
		for (int i = 0; i < anInt6950 * 291247315; i++) {
			byte[] is_470_ = is[i];
			if (null != is_470_) {
				int i_471_ = ((anIntArray6930[i] >> 8) * 64 - aClass592_6931.anInt7798 * 153371143);
				int i_472_ = (64 * (anIntArray6930[i] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
				if (!aBool6937)
					Class245.aClass226_2698.method4200(-373360478);
				class456_sub1.method15960(Class402.aClass180_4150, is_470_, i_471_, i_472_, (byte) 27);
				if (aBool6937)
					method8321(10, (byte) 32);
			}
		}
	}

	void method8411(Class456_Sub1 class456_sub1, byte[][] is) {
		for (int i = 0; i < 587945237 * class456_sub1.anInt5047; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(508321780);
			for (int i_473_ = 0; i_473_ < anInt6935 * -1501092105 >> 3; i_473_++) {
				for (int i_474_ = 0; i_474_ < 1417173501 * anInt6956 >> 3; i_474_++) {
					int i_475_ = anIntArrayArrayArray6964[i][i_473_][i_474_];
					if (i_475_ != -1) {
						int i_476_ = i_475_ >> 24 & 0x3;
						if (!class456_sub1.aBool4976 || i_476_ == 0) {
							int i_477_ = i_475_ >> 1 & 0x3;
							int i_478_ = i_475_ >> 14 & 0x3ff;
							int i_479_ = i_475_ >> 3 & 0x7ff;
							int i_480_ = (i_478_ / 8 << 8) + i_479_ / 8;
							for (int i_481_ = 0; i_481_ < anIntArray6930.length; i_481_++) {
								if (i_480_ == anIntArray6930[i_481_] && null != is[i_481_]) {
									class456_sub1.method15983(Class402.aClass180_4150, is[i_481_], i, 8 * i_473_, i_474_ * 8, i_476_, 8 * (i_478_ & 0x7), (i_479_ & 0x7) * 8, i_477_, (short) 630);
									break;
								}
							}
						}
					}
					if (aBool6937)
						method8321(5, (byte) 66);
				}
			}
		}
	}

	public int[][] method8412() {
		return anIntArrayArray6948;
	}

	void method8413(Class456_Sub1 class456_sub1, byte[][] is) {
		for (int i = 0; i < 587945237 * class456_sub1.anInt5047; i++) {
			if (!aBool6937)
				Class245.aClass226_2698.method4200(1509967682);
			for (int i_482_ = 0; i_482_ < anInt6935 * -1501092105 >> 3; i_482_++) {
				for (int i_483_ = 0; i_483_ < 1417173501 * anInt6956 >> 3; i_483_++) {
					int i_484_ = anIntArrayArrayArray6964[i][i_482_][i_483_];
					if (i_484_ != -1) {
						int i_485_ = i_484_ >> 24 & 0x3;
						if (!class456_sub1.aBool4976 || i_485_ == 0) {
							int i_486_ = i_484_ >> 1 & 0x3;
							int i_487_ = i_484_ >> 14 & 0x3ff;
							int i_488_ = i_484_ >> 3 & 0x7ff;
							int i_489_ = (i_487_ / 8 << 8) + i_488_ / 8;
							for (int i_490_ = 0; i_490_ < anIntArray6930.length; i_490_++) {
								if (i_489_ == anIntArray6930[i_490_] && null != is[i_490_]) {
									class456_sub1.method15983(Class402.aClass180_4150, is[i_490_], i, 8 * i_482_, i_483_ * 8, i_485_, 8 * (i_487_ & 0x7), (i_488_ & 0x7) * 8, i_486_, (short) 630);
									break;
								}
							}
						}
					}
					if (aBool6937)
						method8321(5, (byte) 77);
				}
			}
		}
	}

	void method8414() {
		int i = aByteArrayArray6942.length;
		for (int i_491_ = 0; i_491_ < i; i_491_++) {
			if (null != aByteArrayArray6942[i_491_]) {
				int i_492_ = -1;
				for (int i_493_ = 0; i_493_ < client.anInt11077 * -673556667; i_493_++) {
					if (client.anIntArray11076[i_493_] == anIntArray6930[i_491_]) {
						i_492_ = i_493_;
						break;
					}
				}
				if (-1 == i_492_) {
					client.anIntArray11076[client.anInt11077 * -673556667] = anIntArray6930[i_491_];
					i_492_ = (client.anInt11077 += 1791599501) * -673556667 - 1;
				}
				RSByteBuffer class527_sub38 = new RSByteBuffer(aByteArrayArray6942[i_491_]);
				int i_494_ = 0;
				while ((class527_sub38.anInt10689 * -441238943 < aByteArrayArray6942[i_491_].length) && i_494_ < 511 && -1599561389 * client.anInt11059 < 1023) {
					int i_495_ = i_492_ | i_494_++ << 6;
					int i_496_ = class527_sub38.readUnsignedShort();
					int i_497_ = i_496_ >> 14;
					int i_498_ = i_496_ >> 7 & 0x3f;
					int i_499_ = i_496_ & 0x3f;
					int i_500_ = (64 * (anIntArray6930[i_491_] >> 8) - 153371143 * aClass592_6931.anInt7798 + i_498_);
					int i_501_ = i_499_ + (64 * (anIntArray6930[i_491_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
					Class295 class295 = (Class295) (Class381.aClass24_Sub9_3936.method81(class527_sub38.readUnsignedShort(), -290666385));
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_495_));
					if (null == class527_sub26 && (class295.aByte3294 & 0x1) > 0 && i_500_ >= 0 && (i_500_ + 897343531 * class295.anInt3342 < -1501092105 * anInt6935) && i_501_ >= 0 && (i_501_ + 897343531 * class295.anInt3342 < 1417173501 * anInt6956)) {
						Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = new Class640_Sub1_Sub2_Sub1_Sub1(aClass555_6934);
						class640_sub1_sub2_sub1_sub1.anInt11955 = i_495_ * 1587877927;
						Class527_Sub26 class527_sub26_502_ = new Class527_Sub26(class640_sub1_sub2_sub1_sub1);
						client.aClass14_10989.method714(class527_sub26_502_, (long) i_495_);
						client.aClass527_Sub26Array11313[((client.anInt11030 += -1326908713) * 152738023) - 1] = class527_sub26_502_;
						client.anIntArray11021[((client.anInt11059 += -84653349) * -1599561389 - 1)] = i_495_;
						class640_sub1_sub2_sub1_sub1.anInt11933 = client.anInt11019 * 2052153447;
						class640_sub1_sub2_sub1_sub1.method18832(class295, 2145069098);
						class640_sub1_sub2_sub1_sub1.method18585(897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342), 1375673656);
						class640_sub1_sub2_sub1_sub1.anInt11937 = (57049381 * (1076155623 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3311) << 3));
						class640_sub1_sub2_sub1_sub1.method18528(class640_sub1_sub2_sub1_sub1.aClass295_12168.aClass681_3277.method13906(-1308292753).method87() << 11 & 0x3fff, true, -808495985);
						class640_sub1_sub2_sub1_sub1.method18837(i_497_, i_500_, i_501_, true, class640_sub1_sub2_sub1_sub1.method18564(-2090523915), (byte) 116);
					}
				}
			}
		}
	}

	void method8415() {
		int i = aByteArrayArray6942.length;
		for (int i_503_ = 0; i_503_ < i; i_503_++) {
			if (null != aByteArrayArray6942[i_503_]) {
				int i_504_ = -1;
				for (int i_505_ = 0; i_505_ < client.anInt11077 * -673556667; i_505_++) {
					if (client.anIntArray11076[i_505_] == anIntArray6930[i_503_]) {
						i_504_ = i_505_;
						break;
					}
				}
				if (-1 == i_504_) {
					client.anIntArray11076[client.anInt11077 * -673556667] = anIntArray6930[i_503_];
					i_504_ = (client.anInt11077 += 1791599501) * -673556667 - 1;
				}
				RSByteBuffer class527_sub38 = new RSByteBuffer(aByteArrayArray6942[i_503_]);
				int i_506_ = 0;
				while ((class527_sub38.anInt10689 * -441238943 < aByteArrayArray6942[i_503_].length) && i_506_ < 511 && -1599561389 * client.anInt11059 < 1023) {
					int i_507_ = i_504_ | i_506_++ << 6;
					int i_508_ = class527_sub38.readUnsignedShort();
					int i_509_ = i_508_ >> 14;
					int i_510_ = i_508_ >> 7 & 0x3f;
					int i_511_ = i_508_ & 0x3f;
					int i_512_ = (64 * (anIntArray6930[i_503_] >> 8) - 153371143 * aClass592_6931.anInt7798 + i_510_);
					int i_513_ = i_511_ + (64 * (anIntArray6930[i_503_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
					Class295 class295 = (Class295) (Class381.aClass24_Sub9_3936.method81(class527_sub38.readUnsignedShort(), -1381590453));
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_507_));
					if (null == class527_sub26 && (class295.aByte3294 & 0x1) > 0 && i_512_ >= 0 && (i_512_ + 897343531 * class295.anInt3342 < -1501092105 * anInt6935) && i_513_ >= 0 && (i_513_ + 897343531 * class295.anInt3342 < 1417173501 * anInt6956)) {
						Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = new Class640_Sub1_Sub2_Sub1_Sub1(aClass555_6934);
						class640_sub1_sub2_sub1_sub1.anInt11955 = i_507_ * 1587877927;
						Class527_Sub26 class527_sub26_514_ = new Class527_Sub26(class640_sub1_sub2_sub1_sub1);
						client.aClass14_10989.method714(class527_sub26_514_, (long) i_507_);
						client.aClass527_Sub26Array11313[((client.anInt11030 += -1326908713) * 152738023) - 1] = class527_sub26_514_;
						client.anIntArray11021[((client.anInt11059 += -84653349) * -1599561389 - 1)] = i_507_;
						class640_sub1_sub2_sub1_sub1.anInt11933 = client.anInt11019 * 2052153447;
						class640_sub1_sub2_sub1_sub1.method18832(class295, 2145069098);
						class640_sub1_sub2_sub1_sub1.method18585(897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342), 1866908062);
						class640_sub1_sub2_sub1_sub1.anInt11937 = (57049381 * (1076155623 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3311) << 3));
						class640_sub1_sub2_sub1_sub1.method18528(class640_sub1_sub2_sub1_sub1.aClass295_12168.aClass681_3277.method13906(988623061).method87() << 11 & 0x3fff, true, -1716945884);
						class640_sub1_sub2_sub1_sub1.method18837(i_509_, i_512_, i_513_, true, class640_sub1_sub2_sub1_sub1.method18564(-1885299534), (byte) 111);
					}
				}
			}
		}
	}

	void method8416() {
		int i = aByteArrayArray6942.length;
		for (int i_515_ = 0; i_515_ < i; i_515_++) {
			if (null != aByteArrayArray6942[i_515_]) {
				int i_516_ = -1;
				for (int i_517_ = 0; i_517_ < client.anInt11077 * -673556667; i_517_++) {
					if (client.anIntArray11076[i_517_] == anIntArray6930[i_515_]) {
						i_516_ = i_517_;
						break;
					}
				}
				if (-1 == i_516_) {
					client.anIntArray11076[client.anInt11077 * -673556667] = anIntArray6930[i_515_];
					i_516_ = (client.anInt11077 += 1791599501) * -673556667 - 1;
				}
				RSByteBuffer class527_sub38 = new RSByteBuffer(aByteArrayArray6942[i_515_]);
				int i_518_ = 0;
				while ((class527_sub38.anInt10689 * -441238943 < aByteArrayArray6942[i_515_].length) && i_518_ < 511 && -1599561389 * client.anInt11059 < 1023) {
					int i_519_ = i_516_ | i_518_++ << 6;
					int i_520_ = class527_sub38.readUnsignedShort();
					int i_521_ = i_520_ >> 14;
					int i_522_ = i_520_ >> 7 & 0x3f;
					int i_523_ = i_520_ & 0x3f;
					int i_524_ = (64 * (anIntArray6930[i_515_] >> 8) - 153371143 * aClass592_6931.anInt7798 + i_522_);
					int i_525_ = i_523_ + (64 * (anIntArray6930[i_515_] & 0xff) - aClass592_6931.anInt7799 * -2029646807);
					Class295 class295 = (Class295) (Class381.aClass24_Sub9_3936.method81(class527_sub38.readUnsignedShort(), -1016051560));
					Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_519_));
					if (null == class527_sub26 && (class295.aByte3294 & 0x1) > 0 && i_524_ >= 0 && (i_524_ + 897343531 * class295.anInt3342 < -1501092105 * anInt6935) && i_525_ >= 0 && (i_525_ + 897343531 * class295.anInt3342 < 1417173501 * anInt6956)) {
						Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = new Class640_Sub1_Sub2_Sub1_Sub1(aClass555_6934);
						class640_sub1_sub2_sub1_sub1.anInt11955 = i_519_ * 1587877927;
						Class527_Sub26 class527_sub26_526_ = new Class527_Sub26(class640_sub1_sub2_sub1_sub1);
						client.aClass14_10989.method714(class527_sub26_526_, (long) i_519_);
						client.aClass527_Sub26Array11313[((client.anInt11030 += -1326908713) * 152738023) - 1] = class527_sub26_526_;
						client.anIntArray11021[((client.anInt11059 += -84653349) * -1599561389 - 1)] = i_519_;
						class640_sub1_sub2_sub1_sub1.anInt11933 = client.anInt11019 * 2052153447;
						class640_sub1_sub2_sub1_sub1.method18832(class295, 2145069098);
						class640_sub1_sub2_sub1_sub1.method18585(897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342), 1515358563);
						class640_sub1_sub2_sub1_sub1.anInt11937 = (57049381 * (1076155623 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3311) << 3));
						class640_sub1_sub2_sub1_sub1.method18528(class640_sub1_sub2_sub1_sub1.aClass295_12168.aClass681_3277.method13906(139038807).method87() << 11 & 0x3fff, true, -1605579370);
						class640_sub1_sub2_sub1_sub1.method18837(i_521_, i_524_, i_525_, true, class640_sub1_sub2_sub1_sub1.method18564(-2037132613), (byte) 66);
					}
				}
			}
		}
	}

	static int method8417(int i, int i_527_, int i_528_) {
		if (9 == i_527_)
			i = 1 + i & 0x3;
		if (i_527_ == 10)
			i = 3 + i & 0x3;
		if (11 == i_527_)
			i = i + 3 & 0x3;
		return i;
	}

	public static void method8418(long[] ls, Object[] objects, byte i) {
		Class238.method4374(ls, objects, 0, ls.length - 1, (byte) -69);
	}

	static final void method8419(Class665 class665, byte i) {
		class665.anInt8526 -= 102380841;
	}

	public static final void method8420(byte i) {
		if (!client.aBool11115) {
			client.aFloat11114 += (12.0F - client.aFloat11114) / 2.0F;
			client.aBool11119 = true;
			client.aBool11115 = true;
		}
	}

	static final void method8421(Class665 class665, int i) {
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (class665.anObjectArray8524[class665.anIntArray8545[891367231 * class665.anInt8527]]);
	}

	static final void method8422(Class243 class243, Class665 class665, byte i) {
		if (client.method17815(class243).method16253(1484451382) && client.aClass243_11196 == null) {
			Class644.method10741(class243.anInt2504 * -254728301, class243.anInt2675 * -927924265, 1649208153);
			client.aClass243_11196 = Class447.method7260(class243.anInt2504 * -254728301, class243.anInt2675 * -927924265, 2019213435);
			Class430.method6876(client.aClass243_11196, (byte) 67);
		}
	}
}
