/* Class612 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class ObjTypeDecoder implements ConfigType {
	public int anInt7931;
	public static short[] aShortArray7932 = new short[256];
	Class4 aClass4_7933;
	Class608 aClass608_7934;
	public String aString7935 = "null";
	int anInt7936;
	int anInt7937;
	byte[] aByteArray7938;
	short[] aShortArray7939;
	short[] aShortArray7940;
	public int anInt7941;
	static final int anInt7942 = 6;
	Interface12 anInterface12_7943;
	byte[] aByteArray7944;
	public boolean aBool7945;
	public int anInt7946;
	byte aByte7947;
	byte aByte7948;
	byte aByte7949 = 0;
	public int anInt7950;
	int[] anIntArray7951;
	public int anInt7952;
	public int anInt7953;
	byte aByte7954;
	int anInt7955;
	public boolean aBool7956;
	byte[] aByteArray7957;
	int[][] anIntArrayArray7958;
	public int anInt7959;
	int[] anIntArray7960;
	public int anInt7961;
	int anInt7962;
	public int anInt7963;
	int anInt7964;
	byte[] aByteArray7965;
	public String[] aStringArray7966;
	public int anInt7967;
	short[] aShortArray7968;
	public boolean aBool7969;
	public boolean aBool7970;
	public int anInt7971;
	public boolean aBool7972;
	public boolean aBool7973;
	public boolean aBool7974;
	int anInt7975;
	int anInt7976;
	int anInt7977;
	int anInt7978;
	int anInt7979;
	public int anInt7980;
	int anInt7981;
	byte aByte7982;
	int[] anIntArray7983;
	int anInt7984;
	boolean aBool7985;
	short[] aShortArray7986;
	public int anInt7987;
	public int[] anIntArray7988;
	int anInt7989;
	int anInt7990;
	public int anInt7991;
	public int anInt7992;
	public boolean aBool7993;
	public int anInt7994;
	public int anInt7995;
	public int anInt7996;
	public int[] anIntArray7997;
	public boolean aBool7998;
	public boolean aBool7999;
	public boolean aBool8000;
	public boolean aBool8001;
	public int anInt8002 = -783423719;
	public boolean aBool8003;
	public int[] anIntArray8004;
	public int anInt8005;
	public int anInt8006;
	public boolean aBool8007;
	public int anInt8008;
	public Class601 aClass601_8009;
	public Class437 aClass437_8010;
	static final int anInt8011 = 127007;

	public boolean method7282(short i) {
		if (anIntArray7988 == null)
			return anInt7946 * 1912280925 != -1 || null != anIntArray7997;
		for (int i_0_ = 0; i_0_ < anIntArray7988.length; i_0_++) {
			if (-1 != anIntArray7988[i_0_]) {
				ObjTypeDecoder class612_1_ = ((ObjTypeDecoder) anInterface12_7943.method70(anIntArray7988[i_0_], (byte) 39));
				if (1912280925 * class612_1_.anInt7946 != -1 || class612_1_.anIntArray7997 != null)
					return true;
			}
		}
		return false;
	}

	public void decodeType(RSByteBuffer class536_sub33) {
		for (;;) {
			int i_2_ = class536_sub33.readUnsignedByte();
			if (0 == i_2_)
				break;
			method7284(class536_sub33, i_2_, -1702705906);
		}
	}

	public int method7283() {
		if (anIntArray7960 != null) {
			if (anIntArray7960.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_3_ = 0; i_3_ < anIntArray7960.length; i_3_++) {
					if (i <= anIntArray7983[i_3_])
						return anIntArray7960[i_3_];
					i -= anIntArray7983[i_3_];
				}
			} else
				return anIntArray7960[0];
		}
		return -1;
	}

	void method7284(RSByteBuffer class536_sub33, int i, int i_4_) {
		if (1 == i) {
			int i_5_ = class536_sub33.readUnsignedByte();
			aByteArray7938 = new byte[i_5_];
			anIntArrayArray7958 = new int[i_5_][];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				aByteArray7938[i_6_] = class536_sub33.readByte();
				int i_7_ = class536_sub33.readUnsignedByte();
				anIntArrayArray7958[i_6_] = new int[i_7_];
				for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
					anIntArrayArray7958[i_6_][i_8_] = class536_sub33.readBigSmart();
			}
		} else if (2 == i)
			aString7935 = class536_sub33.readString().intern();
		else if (i == 14)
			anInt8002 = class536_sub33.readUnsignedByte() * -783423719;
		else if (i == 15)
			anInt7980 = class536_sub33.readUnsignedByte() * -1301379639;
		else if (17 == i)
			anInt7952 = 0;
		else if (18 != i) {
			if (i == 19)
				anInt7953 = class536_sub33.readUnsignedByte() * -712968303;
			else if (21 == i)
				aByte7954 = (byte) 1;
			else if (22 == i)
				aBool7956 = true;
			else if (i == 23)
				anInt7995 = -1551638173;
			else if (24 == i) {
				int i_9_ = class536_sub33.readBigSmart();
				if (-1 != i_9_)
					anIntArray7960 = new int[] { i_9_ };
			} else if (27 == i)
				anInt7952 = -1138952909;
			else if (28 == i)
				anInt7963 = (class536_sub33.readUnsignedByte() << 2) * -677542355;
			else if (i == 29)
				anInt7964 = class536_sub33.readByte() * -1041137523;
			else if (i == 39)
				anInt7937 = class536_sub33.readByte() * 1427321801;
			else if (i >= 30 && i < 35)
				aStringArray7966[i - 30] = class536_sub33.readString().intern();
			else if (40 == i) {
				int i_10_ = class536_sub33.readUnsignedByte();
				aShortArray7939 = new short[i_10_];
				aShortArray7940 = new short[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					aShortArray7939[i_11_] = (short) class536_sub33.readUnsignedShort();
					aShortArray7940[i_11_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (41 == i) {
				int i_12_ = class536_sub33.readUnsignedByte();
				aShortArray7986 = new short[i_12_];
				aShortArray7968 = new short[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					aShortArray7986[i_13_] = (short) class536_sub33.readUnsignedShort();
					aShortArray7968[i_13_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (42 == i) {
				int i_14_ = class536_sub33.readUnsignedByte();
				aByteArray7965 = new byte[i_14_];
				for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
					aByteArray7965[i_15_] = class536_sub33.readByte();
			} else if (i == 44) {
				int i_16_ = class536_sub33.readUnsignedShort();
				int i_17_ = 0;
				for (int i_18_ = i_16_; i_18_ > 0; i_18_ >>= 1)
					i_17_++;
				aByteArray7944 = new byte[i_17_];
				byte i_19_ = 0;
				for (int i_20_ = 0; i_20_ < i_17_; i_20_++) {
					if ((i_16_ & 1 << i_20_) > 0) {
						aByteArray7944[i_20_] = i_19_;
						i_19_++;
					} else
						aByteArray7944[i_20_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_21_ = class536_sub33.readUnsignedShort();
				int i_22_ = 0;
				for (int i_23_ = i_21_; i_23_ > 0; i_23_ >>= 1)
					i_22_++;
				aByteArray7957 = new byte[i_22_];
				byte i_24_ = 0;
				for (int i_25_ = 0; i_25_ < i_22_; i_25_++) {
					if ((i_21_ & 1 << i_25_) > 0) {
						aByteArray7957[i_25_] = i_24_;
						i_24_++;
					} else
						aByteArray7957[i_25_] = (byte) -1;
				}
			} else if (i == 62)
				aBool7973 = true;
			else if (64 == i)
				aBool7974 = false;
			else if (i == 65)
				anInt7975 = class536_sub33.readUnsignedShort() * 635595039;
			else if (66 == i)
				anInt7976 = class536_sub33.readUnsignedShort() * 1027789045;
			else if (67 == i)
				anInt7977 = class536_sub33.readUnsignedShort() * -804470723;
			else if (i == 69)
				class536_sub33.readUnsignedByte();
			else if (70 == i)
				anInt7978 = ((class536_sub33.readShort() << 2) * -445350345);
			else if (i == 71)
				anInt7979 = (class536_sub33.readShort() << 2) * 902429351;
			else if (72 == i)
				anInt7962 = ((class536_sub33.readShort() << 2) * 1093534315);
			else if (73 == i)
				aBool7945 = true;
			else if (i == 74)
				aBool7985 = true;
			else if (75 == i)
				anInt7996 = class536_sub33.readUnsignedByte() * 114563965;
			else if (77 == i || i == 92) {
				anInt7989 = class536_sub33.readUnsignedShort() * -1400564909;
				if (anInt7989 * 1868474587 == 65535)
					anInt7989 = 1400564909;
				anInt7990 = class536_sub33.readUnsignedShort() * 97020193;
				if (2066111201 * anInt7990 == 65535)
					anInt7990 = -97020193;
				int i_26_ = -1;
				if (i == 92)
					i_26_ = class536_sub33.readBigSmart();
				int i_27_ = class536_sub33.readUnsignedByte();
				anIntArray7988 = new int[i_27_ + 2];
				for (int i_28_ = 0; i_28_ <= i_27_; i_28_++)
					anIntArray7988[i_28_] = class536_sub33.readBigSmart();
				anIntArray7988[i_27_ + 1] = i_26_;
			} else if (78 == i) {
				anInt7946 = class536_sub33.readUnsignedShort() * -1186532107;
				anInt7991 = class536_sub33.readUnsignedByte() * -2073673989;
			} else if (i == 79) {
				anInt7967 = class536_sub33.readUnsignedShort() * -1963140303;
				anInt7961 = class536_sub33.readUnsignedShort() * -937467215;
				anInt7991 = class536_sub33.readUnsignedByte() * -2073673989;
				int i_29_ = class536_sub33.readUnsignedByte();
				anIntArray7997 = new int[i_29_];
				for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
					anIntArray7997[i_30_] = class536_sub33.readUnsignedShort();
			} else if (81 == i) {
				aByte7954 = (byte) 2;
				anInt7955 = class536_sub33.readUnsignedByte() * 1891535616;
			} else if (82 == i)
				aBool7999 = true;
			else if (i == 88)
				aBool8000 = false;
			else if (89 == i)
				aBool7998 = false;
			else if (i == 91)
				aBool8001 = true;
			else if (i == 93) {
				aByte7954 = (byte) 3;
				anInt7955 = class536_sub33.readUnsignedShort() * -512704885;
			} else if (94 == i)
				aByte7954 = (byte) 4;
			else if (i == 95) {
				aByte7954 = (byte) 5;
				anInt7955 = class536_sub33.readShort() * -512704885;
			} else if (i == 97)
				aBool7970 = true;
			else if (i == 98)
				aBool8003 = true;
			else if (i == 99 || 100 == i) {
				class536_sub33.readUnsignedByte();
				class536_sub33.readUnsignedShort();
			} else if (i == 101)
				anInt7971 = class536_sub33.readUnsignedByte() * -1593952067;
			else if (102 == i)
				anInt7941 = class536_sub33.readUnsignedShort() * 1314038561;
			else if (i == 103)
				anInt7995 = 0;
			else if (104 == i)
				anInt7959 = class536_sub33.readUnsignedByte() * 1314451607;
			else if (105 == i)
				aBool7972 = true;
			else if (106 == i) {
				int i_31_ = class536_sub33.readUnsignedByte();
				int i_32_ = 0;
				anIntArray7960 = new int[i_31_];
				anIntArray7983 = new int[i_31_];
				for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
					anIntArray7960[i_33_] = class536_sub33.readBigSmart();
					i_32_ += anIntArray7983[i_33_] = class536_sub33.readUnsignedByte();
				}
				for (int i_34_ = 0; i_34_ < i_31_; i_34_++)
					anIntArray7983[i_34_] = anIntArray7983[i_34_] * 65535 / i_32_;
			} else if (i == 107)
				anInt7994 = class536_sub33.readUnsignedShort() * 1462571881;
			else if (i >= 150 && i < 155) {
				aStringArray7966[i - 150] = class536_sub33.readString().intern();
				if (!aClass608_7934.aBool7910)
					aStringArray7966[i - 150] = null;
			} else if (160 == i) {
				int i_35_ = class536_sub33.readUnsignedByte();
				anIntArray8004 = new int[i_35_];
				for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
					anIntArray8004[i_36_] = class536_sub33.readUnsignedShort();
			} else if (162 == i) {
				aByte7954 = (byte) 3;
				anInt7955 = class536_sub33.readInt() * -512704885;
			} else if (i == 163) {
				aByte7982 = class536_sub33.readByte();
				aByte7947 = class536_sub33.readByte();
				aByte7948 = class536_sub33.readByte();
				aByte7949 = class536_sub33.readByte();
			} else if (i == 164)
				anInt7981 = class536_sub33.readShort() * -1554100081;
			else if (i == 165)
				anInt7984 = class536_sub33.readShort() * -698357095;
			else if (i == 166)
				anInt7936 = class536_sub33.readShort() * -1406833241;
			else if (167 == i)
				anInt7987 = class536_sub33.readUnsignedShort() * 277144019;
			else if (168 != i && 169 != i) {
				if (170 == i)
					anInt7931 = class536_sub33.readUnsignedSmart() * -425448053;
				else if (i == 171)
					anInt7950 = class536_sub33.readUnsignedSmart() * 1420098721;
				else if (173 == i) {
					anInt8005 = (class536_sub33.readUnsignedShort() * -719122001);
					anInt8006 = class536_sub33.readUnsignedShort() * 181075575;
				} else if (i == 177)
					aBool8007 = true;
				else if (178 == i)
					anInt7992 = class536_sub33.readUnsignedByte() * -1081233369;
				else if (i == 186)
					aClass601_8009 = ((Class601) Class682.method8091(Class236.method3350(-1343454826), class536_sub33.readUnsignedByte(), 1858049507));
				else if (188 != i) {
					if (189 == i)
						aBool7969 = true;
					else if (i >= 190 && i < 196) {
						if (null == anIntArray7951) {
							anIntArray7951 = new int[6];
							Arrays.fill(anIntArray7951, -1);
						}
						anIntArray7951[i - 190] = class536_sub33.readUnsignedShort();
					} else if (196 == i)
						Class682.method8091(Class619.method7395(65280), class536_sub33.readUnsignedByte(), 1858049507);
					else if (197 == i)
						Class682.method8091(Class241.method3388((byte) 12), class536_sub33.readUnsignedByte(), 1858049507);
					else if (198 != i && 199 != i) {
						if (i == 200)
							aBool7993 = true;
						else if (i == 201) {
							aClass437_8010 = new Class437();
							aClass437_8010.aFloat4859 = (float) class536_sub33.method9717(1835855482);
							aClass437_8010.aFloat4855 = (float) class536_sub33.method9717(-101950922);
							aClass437_8010.aFloat4856 = (float) class536_sub33.method9717(1114585288);
							aClass437_8010.aFloat4858 = (float) class536_sub33.method9717(99939145);
							aClass437_8010.aFloat4857 = (float) class536_sub33.method9717(-1248105456);
							aClass437_8010.aFloat4854 = (float) class536_sub33.method9717(-1551190949);
						} else if (i == 249) {
							int i_37_ = class536_sub33.readUnsignedByte();
							if (aClass4_7933 == null) {
								int i_38_ = Class528.method6434(i_37_, -837678971);
								aClass4_7933 = new Class4(i_38_);
							}
							for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
								boolean bool = (class536_sub33.readUnsignedByte() == 1);
								int i_40_ = class536_sub33.read24BitUnsignedInteger();
								Class536 class536;
								if (bool)
									class536 = new ObjectParam(class536_sub33.readString().intern());
								else
									class536 = new IntParam(class536_sub33.readInt());
								aClass4_7933.method560(class536, (long) i_40_);
							}
						}
					}
				}
			}
		}
	}

	void method7285(int i) {
		if (anInt7953 * 1248110961 == -1) {
			anInt7953 = 0;
			if (null != aByteArray7938 && aByteArray7938.length == 1 && (aByteArray7938[0] == -723459231 * ObjShapes.aClass606_7880.anInt7878))
				anInt7953 = -712968303;
			for (int i_41_ = 0; i_41_ < 5; i_41_++) {
				if (aStringArray7966[i_41_] != null) {
					anInt7953 = -712968303;
					break;
				}
			}
		}
		if (-1 == anInt7996 * -1529252395)
			anInt7996 = (0 != -1137177093 * anInt7952 ? 1 : 0) * 114563965;
		if (method7300((byte) -91) || aBool8003 || anIntArray7988 != null)
			aBool8007 = true;
		if (1248110961 * anInt7953 <= 0 && aClass601_8009 != Class601.aClass601_7851) {
			/* empty */
		}
	}

	public final boolean method7286(int i, int i_42_) {
		if (null == anIntArrayArray7958)
			return true;
		boolean bool = true;
		for (int i_43_ = 0; i_43_ < aByteArray7938.length; i_43_++) {
			if (i == aByteArray7938[i_43_]) {
				for (int i_44_ = 0; i_44_ < anIntArrayArray7958[i_43_].length; i_44_++) {
					if (!aClass608_7934.method7241((anIntArrayArray7958[i_43_][i_44_]), (byte) 3))
						bool = false;
				}
			}
		}
		return bool;
	}

	public final synchronized Class7 method7287(Class167 class167, int i, int i_45_, int i_46_, Class160 class160, Class160 class160_47_, int i_48_, int i_49_, int i_50_, boolean bool, ObjTypeTransformation class590, byte i_51_) {
		if (Class567.method6914(i_45_, (byte) 15))
			i_45_ = ObjShapes.aClass606_7888.anInt7878 * -723459231;
		long l = (long) ((anInt8008 * 1083959103 << 10) + (i_45_ << 3) + i_46_);
		l |= (long) (1526643673 * class167.anInt1850 << 29);
		if (null != class590)
			l |= class590.aLong7788 * 4927694003461891043L << 32;
		int i_52_ = i;
		if (3 == aByte7954)
			i_52_ |= 0x7;
		else {
			if (aByte7954 != 0 || 0 != 282905001 * anInt7984)
				i_52_ |= 0x2;
			if (-96940433 * anInt7981 != 0)
				i_52_ |= 0x1;
			if (anInt7936 * -1402705385 != 0)
				i_52_ |= 0x4;
		}
		if (bool)
			i_52_ |= 0x40000;
		boolean bool_53_ = aByte7954 != 0 && (null != class160 || class160_47_ != null);
		boolean bool_54_ = (0 != anInt7981 * -96940433 || 282905001 * anInt7984 != 0 || 0 != -1402705385 * anInt7936);
		Class7 class7;
		synchronized (aClass608_7934.aClass199_7907) {
			class7 = (Class7) aClass608_7934.aClass199_7907.method2886(l);
		}
		Class177 class177 = (Class177) (class7 != null ? class7.anObject117 : null);
		Class536_Sub18_Sub7 class536_sub18_sub7 = null;
		if (class177 == null || class167.method2308(class177.method2466(), i_52_) != 0) {
			if (class177 != null)
				i_52_ = class167.method2068(i_52_, class177.method2466());
			int i_55_ = i_52_;
			if (-723459231 * ObjShapes.aClass606_7880.anInt7878 == i_45_ && i_46_ > 3)
				i_55_ |= 0x5;
			class177 = method7289(class167, i_55_, i_45_, i_46_, class590, (short) 13709);
			if (null == class177)
				return null;
			if (ObjShapes.aClass606_7880.anInt7878 * -723459231 == i_45_ && i_46_ > 3)
				class177.method2541(2048);
			if (bool && !bool_53_ && !bool_54_)
				class536_sub18_sub7 = class177.method2459(null);
			class177.method2465(i_52_);
			class7 = new Class7(class177, class536_sub18_sub7);
			synchronized (aClass608_7934.aClass199_7907) {
				aClass608_7934.aClass199_7907.method2881(class7, l);
			}
		} else {
			class536_sub18_sub7 = (Class536_Sub18_Sub7) class7.anObject118;
			if (bool && null == class536_sub18_sub7 && !bool_53_ && !bool_54_)
				class536_sub18_sub7 = (Class536_Sub18_Sub7) (class7.anObject118 = class177.method2459(null));
		}
		if (bool_53_ || bool_54_) {
			class177 = class177.method2623((byte) 0, i_52_, true);
			if (bool_53_)
				class177.method2475(aByte7954, -1080346333 * anInt7955, class160, class160_47_, i_48_, i_49_, i_50_);
			if (bool_54_)
				class177.method2472(-96940433 * anInt7981, anInt7984 * 282905001, -1402705385 * anInt7936);
			if (bool)
				class536_sub18_sub7 = class177.method2459(null);
			class177.method2465(i);
		} else
			class177 = class177.method2623((byte) 0, i, true);
		aClass608_7934.aClass7_7903.anObject117 = class177;
		aClass608_7934.aClass7_7903.anObject118 = class536_sub18_sub7;
		return aClass608_7934.aClass7_7903;
	}

	public final synchronized Class177 method7288(Class167 class167, int i, int i_56_, int i_57_, Class160 class160, Class160 class160_58_, int i_59_, int i_60_, int i_61_, Class688 class688, ObjTypeTransformation class590, int i_62_) {
		if (Class567.method6914(i_56_, (byte) 0))
			i_56_ = -723459231 * ObjShapes.aClass606_7888.anInt7878;
		long l = (long) ((i_56_ << 3) + (anInt8008 * 1083959103 << 10) + i_57_);
		int i_63_ = i;
		l |= (long) (class167.anInt1850 * 1526643673 << 29);
		if (null != class590)
			l |= 4927694003461891043L * class590.aLong7788 << 32;
		if (class688 != null)
			i |= class688.method8162((byte) 109);
		if (3 == aByte7954)
			i |= 0x7;
		else {
			if (0 != aByte7954 || 0 != 282905001 * anInt7984)
				i |= 0x2;
			if (-96940433 * anInt7981 != 0)
				i |= 0x1;
			if (0 != anInt7936 * -1402705385)
				i |= 0x4;
		}
		if (-723459231 * ObjShapes.aClass606_7880.anInt7878 == i_56_ && i_57_ > 3)
			i |= 0x5;
		Class177 class177;
		synchronized (aClass608_7934.aClass199_7906) {
			class177 = (Class177) aClass608_7934.aClass199_7906.method2886(l);
		}
		if (class177 == null || class167.method2308(class177.method2466(), i) != 0) {
			if (null != class177)
				i = class167.method2068(i, class177.method2466());
			class177 = method7289(class167, i, i_56_, i_57_, class590, (short) 28787);
			if (class177 == null)
				return null;
			synchronized (aClass608_7934.aClass199_7906) {
				aClass608_7934.aClass199_7906.method2881(class177, l);
			}
		}
		boolean bool = false;
		if (class688 != null) {
			class177 = class177.method2623((byte) 1, i, true);
			bool = true;
			class688.method8132(class177, i_57_ & 0x3, -692370560);
		}
		if (i_56_ == ObjShapes.aClass606_7880.anInt7878 * -723459231 && i_57_ > 3) {
			if (!bool) {
				class177 = class177.method2623((byte) 3, i, true);
				bool = true;
			}
			class177.method2541(2048);
		}
		if (0 != aByte7954) {
			if (!bool) {
				class177 = class177.method2623((byte) 3, i, true);
				bool = true;
			}
			class177.method2475(aByte7954, anInt7955 * -1080346333, class160, class160_58_, i_59_, i_60_, i_61_);
		}
		if (-96940433 * anInt7981 != 0 || 0 != anInt7984 * 282905001 || anInt7936 * -1402705385 != 0) {
			if (!bool) {
				class177 = class177.method2623((byte) 3, i, true);
				bool = true;
			}
			class177.method2472(-96940433 * anInt7981, 282905001 * anInt7984, -1402705385 * anInt7936);
		}
		if (bool)
			class177.method2465(i_63_);
		return class177;
	}

	Class177 method7289(Class167 class167, int i, int i_64_, int i_65_, ObjTypeTransformation class590, short i_66_) {
		int i_67_ = 64 + anInt7964 * -1965800891;
		int i_68_ = 850 + 1057796189 * anInt7937;
		int i_69_ = i;
		boolean bool = (aBool7973 || (ObjShapes.aClass606_7875.anInt7878 * -723459231 == i_64_ && i_65_ > 3));
		if (bool)
			i |= 0x10;
		if (0 == i_65_) {
			if (-1709845793 * anInt7975 != 128 || 0 != anInt7978 * -665217145)
				i |= 0x1;
			if (128 != 244700949 * anInt7977 || 1153669699 * anInt7962 != 0)
				i |= 0x4;
		} else
			i |= 0xd;
		if (128 != 1355242333 * anInt7976 || 0 != anInt7979 * -1847587561)
			i |= 0x2;
		if (aShortArray7939 != null)
			i |= 0x4000;
		if (aShortArray7986 != null)
			i |= 0x8000;
		if (0 != aByte7949)
			i |= 0x80000;
		Class177 class177 = null;
		if (aByteArray7938 != null) {
			int i_70_ = -1;
			for (int i_71_ = 0; i_71_ < aByteArray7938.length; i_71_++) {
				if (i_64_ == aByteArray7938[i_71_]) {
					i_70_ = i_71_;
					break;
				}
			}
			if (i_70_ == -1)
				return null;
			int[] is = (class590 != null && null != class590.anIntArray7786 ? class590.anIntArray7786 : anIntArrayArray7958[i_70_]);
			int i_72_ = is.length;
			if (i_72_ > 0) {
				long l = (long) (class167.anInt1850 * 1526643673);
				for (int i_73_ = 0; i_73_ < i_72_; i_73_++)
					l = (long) is[i_73_] + 67783L * l;
				synchronized (aClass608_7934.aClass199_7904) {
					class177 = ((Class177) aClass608_7934.aClass199_7904.method2886(l));
				}
				if (null != class177) {
					if (i_67_ != class177.method2589())
						i |= 0x1000;
					if (i_68_ != class177.method2505())
						i |= 0x2000;
				}
				if (class177 == null || class167.method2308(class177.method2466(), i) != 0) {
					int i_74_ = i | 0x1f01f;
					if (class177 != null)
						i_74_ = class167.method2068(i_74_, class177.method2466());
					Class180 class180 = null;
					synchronized (aClass608_7934.aClass180Array7909) {
						for (int i_75_ = 0; i_75_ < i_72_; i_75_++) {
							byte[] is_76_ = aClass608_7934.method7255(is[i_75_], 1700856910);
							if (is_76_ == null) {
								Class177 class177_77_ = null;
								return class177_77_;
							}
							class180 = new Class180(is_76_);
							if (class180.anInt1949 < 13)
								class180.method2707(2);
							if (i_72_ > 1)
								aClass608_7934.aClass180Array7909[i_75_] = class180;
						}
						if (i_72_ > 1)
							class180 = new Class180((aClass608_7934.aClass180Array7909), i_72_);
					}
					class177 = class167.method2093(class180, i_74_, (aClass608_7934.anInt7905 * 1548756747), i_67_, i_68_);
					synchronized (aClass608_7934.aClass199_7904) {
						aClass608_7934.aClass199_7904.method2881(class177, l);
					}
				}
			}
		}
		if (class177 == null)
			return null;
		Class177 class177_78_ = class177.method2623((byte) 0, i, true);
		if (i_67_ != class177.method2589())
			class177_78_.method2502(i_67_);
		if (i_68_ != class177.method2505())
			class177_78_.method2503(i_68_);
		if (bool)
			class177_78_.method2473();
		if (-723459231 * ObjShapes.aClass606_7888.anInt7878 == i_64_ && i_65_ > 3) {
			class177_78_.method2626(2048);
			class177_78_.method2472(180, 0, -180);
		}
		i_65_ &= 0x3;
		if (1 == i_65_)
			class177_78_.method2626(4096);
		else if (2 == i_65_)
			class177_78_.method2626(8192);
		else if (i_65_ == 3)
			class177_78_.method2626(12288);
		if (null != aShortArray7939) {
			short[] is;
			if (class590 != null && null != class590.aShortArray7787)
				is = class590.aShortArray7787;
			else
				is = aShortArray7940;
			for (int i_79_ = 0; i_79_ < aShortArray7939.length; i_79_++) {
				if (aByteArray7965 != null && i_79_ < aByteArray7965.length)
					class177_78_.method2507(aShortArray7939[i_79_], (aShortArray7932[aByteArray7965[i_79_] & 0xff]));
				else
					class177_78_.method2507(aShortArray7939[i_79_], is[i_79_]);
			}
		}
		if (null != aShortArray7986) {
			short[] is;
			if (class590 != null && null != class590.aShortArray7785)
				is = class590.aShortArray7785;
			else
				is = aShortArray7968;
			for (int i_80_ = 0; i_80_ < aShortArray7986.length; i_80_++)
				class177_78_.method2509(aShortArray7986[i_80_], is[i_80_]);
		}
		if (aByte7949 != 0)
			class177_78_.method2510(aByte7982, aByte7947, aByte7948, aByte7949 & 0xff);
		if (-1709845793 * anInt7975 != 128 || 1355242333 * anInt7976 != 128 || 128 != 244700949 * anInt7977)
			class177_78_.method2474(anInt7975 * -1709845793, anInt7976 * 1355242333, 244700949 * anInt7977);
		if (anInt7978 * -665217145 != 0 || anInt7979 * -1847587561 != 0 || 0 != 1153669699 * anInt7962)
			class177_78_.method2472(-665217145 * anInt7978, anInt7979 * -1847587561, 1153669699 * anInt7962);
		class177_78_.method2465(i_69_);
		return class177_78_;
	}

	public int method7290(int i, int i_81_, int i_82_) {
		if (null == aClass4_7933)
			return i_81_;
		IntParam class536_sub26 = (IntParam) aClass4_7933.method556((long) i);
		if (null == class536_sub26)
			return i_81_;
		return class536_sub26.value * 2083602213;
	}

	public String method7291(int i, String string, int i_83_) {
		if (aClass4_7933 == null)
			return string;
		ObjectParam class536_sub13 = (ObjectParam) aClass4_7933.method556((long) i);
		if (null == class536_sub13)
			return string;
		return (String) class536_sub13.value;
	}

	public final boolean method7292(Class656 class656, byte i) {
		if (null == anIntArrayArray7958)
			return true;
		boolean bool = true;
		for (int i_84_ = 0; i_84_ < anIntArrayArray7958.length; i_84_++) {
			for (int i_85_ = 0; i_85_ < anIntArrayArray7958[i_84_].length; i_85_++) {
				boolean bool_86_ = aClass608_7934.method7241((anIntArrayArray7958[i_84_][i_85_]), (byte) 3);
				bool &= bool_86_;
				if (!bool_86_)
					class656.anInt8497 = anIntArrayArray7958[i_84_][i_85_] * -994926531;
			}
		}
		return bool;
	}

	public final ObjTypeDecoder method7293(Interface20 interface20, Interface18 interface18, byte i) {
		int i_87_ = -1;
		if (-1 != anInt7989 * 1868474587) {
			Class324 class324 = interface20.method123(anInt7989 * 1868474587, -1018286558);
			if (null != class324)
				i_87_ = interface18.method96(class324, 813439230);
		} else if (2066111201 * anInt7990 != -1) {
			Class153 class153 = interface20.method124(Class458.aClass458_5176, anInt7990 * 2066111201, 323730415);
			if (class153 != null)
				i_87_ = interface18.method99(class153, 1902318076);
		}
		if (i_87_ < 0 || i_87_ >= anIntArray7988.length - 1) {
			int i_88_ = anIntArray7988[anIntArray7988.length - 1];
			if (i_88_ != -1)
				return ((ObjTypeDecoder) anInterface12_7943.method70(i_88_, (byte) -48));
			return null;
		}
		if (anIntArray7988[i_87_] == -1)
			return null;
		return ((ObjTypeDecoder) anInterface12_7943.method70(anIntArray7988[i_87_], (byte) 1));
	}

	public boolean method7294(byte i) {
		return null != anIntArray7960 && anIntArray7960.length > 1;
	}

	public int[] method7295(int i) {
		return anIntArray7960;
	}

	public boolean method7296(int i, int i_89_) {
		if (anIntArray7960 != null && i != -1) {
			for (int i_90_ = 0; i_90_ < anIntArray7960.length; i_90_++) {
				if (anIntArray7960[i_90_] == i)
					return true;
			}
		}
		return false;
	}

	public int method7297(int i, int i_91_) {
		if (null == anIntArray7951)
			return -1;
		return anIntArray7951[i];
	}

	public void postDecode() {
		method7285(1000714098);
		if (aBool7985)
			anInt7952 = 0;
		if (!aClass608_7934.aBool7910 && aBool8001) {
			aStringArray7966 = null;
			anIntArray8004 = null;
		}
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			method7284(class536_sub33, i, -1589851569);
		}
	}

	public void method77() {
		method7285(1399233996);
		if (aBool7985)
			anInt7952 = 0;
		if (!aClass608_7934.aBool7910 && aBool8001) {
			aStringArray7966 = null;
			anIntArray8004 = null;
		}
	}

	public boolean method7298() {
		return null != anIntArray7960 && anIntArray7960.length > 1;
	}

	void method7299(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			int i_92_ = class536_sub33.readUnsignedByte();
			aByteArray7938 = new byte[i_92_];
			anIntArrayArray7958 = new int[i_92_][];
			for (int i_93_ = 0; i_93_ < i_92_; i_93_++) {
				aByteArray7938[i_93_] = class536_sub33.readByte();
				int i_94_ = class536_sub33.readUnsignedByte();
				anIntArrayArray7958[i_93_] = new int[i_94_];
				for (int i_95_ = 0; i_95_ < i_94_; i_95_++)
					anIntArrayArray7958[i_93_][i_95_] = class536_sub33.readBigSmart();
			}
		} else if (2 == i)
			aString7935 = class536_sub33.readString().intern();
		else if (i == 14)
			anInt8002 = class536_sub33.readUnsignedByte() * -783423719;
		else if (i == 15)
			anInt7980 = class536_sub33.readUnsignedByte() * -1301379639;
		else if (17 == i)
			anInt7952 = 0;
		else if (18 != i) {
			if (i == 19)
				anInt7953 = class536_sub33.readUnsignedByte() * -712968303;
			else if (21 == i)
				aByte7954 = (byte) 1;
			else if (22 == i)
				aBool7956 = true;
			else if (i == 23)
				anInt7995 = -1551638173;
			else if (24 == i) {
				int i_96_ = class536_sub33.readBigSmart();
				if (-1 != i_96_)
					anIntArray7960 = new int[] { i_96_ };
			} else if (27 == i)
				anInt7952 = -1138952909;
			else if (28 == i)
				anInt7963 = (class536_sub33.readUnsignedByte() << 2) * -677542355;
			else if (i == 29)
				anInt7964 = class536_sub33.readByte() * -1041137523;
			else if (i == 39)
				anInt7937 = class536_sub33.readByte() * 1427321801;
			else if (i >= 30 && i < 35)
				aStringArray7966[i - 30] = class536_sub33.readString().intern();
			else if (40 == i) {
				int i_97_ = class536_sub33.readUnsignedByte();
				aShortArray7939 = new short[i_97_];
				aShortArray7940 = new short[i_97_];
				for (int i_98_ = 0; i_98_ < i_97_; i_98_++) {
					aShortArray7939[i_98_] = (short) class536_sub33.readUnsignedShort();
					aShortArray7940[i_98_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (41 == i) {
				int i_99_ = class536_sub33.readUnsignedByte();
				aShortArray7986 = new short[i_99_];
				aShortArray7968 = new short[i_99_];
				for (int i_100_ = 0; i_100_ < i_99_; i_100_++) {
					aShortArray7986[i_100_] = (short) class536_sub33.readUnsignedShort();
					aShortArray7968[i_100_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (42 == i) {
				int i_101_ = class536_sub33.readUnsignedByte();
				aByteArray7965 = new byte[i_101_];
				for (int i_102_ = 0; i_102_ < i_101_; i_102_++)
					aByteArray7965[i_102_] = class536_sub33.readByte();
			} else if (i == 44) {
				int i_103_ = class536_sub33.readUnsignedShort();
				int i_104_ = 0;
				for (int i_105_ = i_103_; i_105_ > 0; i_105_ >>= 1)
					i_104_++;
				aByteArray7944 = new byte[i_104_];
				byte i_106_ = 0;
				for (int i_107_ = 0; i_107_ < i_104_; i_107_++) {
					if ((i_103_ & 1 << i_107_) > 0) {
						aByteArray7944[i_107_] = i_106_;
						i_106_++;
					} else
						aByteArray7944[i_107_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_108_ = class536_sub33.readUnsignedShort();
				int i_109_ = 0;
				for (int i_110_ = i_108_; i_110_ > 0; i_110_ >>= 1)
					i_109_++;
				aByteArray7957 = new byte[i_109_];
				byte i_111_ = 0;
				for (int i_112_ = 0; i_112_ < i_109_; i_112_++) {
					if ((i_108_ & 1 << i_112_) > 0) {
						aByteArray7957[i_112_] = i_111_;
						i_111_++;
					} else
						aByteArray7957[i_112_] = (byte) -1;
				}
			} else if (i == 62)
				aBool7973 = true;
			else if (64 == i)
				aBool7974 = false;
			else if (i == 65)
				anInt7975 = class536_sub33.readUnsignedShort() * 635595039;
			else if (66 == i)
				anInt7976 = class536_sub33.readUnsignedShort() * 1027789045;
			else if (67 == i)
				anInt7977 = class536_sub33.readUnsignedShort() * -804470723;
			else if (i == 69)
				class536_sub33.readUnsignedByte();
			else if (70 == i)
				anInt7978 = ((class536_sub33.readShort() << 2) * -445350345);
			else if (i == 71)
				anInt7979 = (class536_sub33.readShort() << 2) * 902429351;
			else if (72 == i)
				anInt7962 = ((class536_sub33.readShort() << 2) * 1093534315);
			else if (73 == i)
				aBool7945 = true;
			else if (i == 74)
				aBool7985 = true;
			else if (75 == i)
				anInt7996 = class536_sub33.readUnsignedByte() * 114563965;
			else if (77 == i || i == 92) {
				anInt7989 = class536_sub33.readUnsignedShort() * -1400564909;
				if (anInt7989 * 1868474587 == 65535)
					anInt7989 = 1400564909;
				anInt7990 = class536_sub33.readUnsignedShort() * 97020193;
				if (2066111201 * anInt7990 == 65535)
					anInt7990 = -97020193;
				int i_113_ = -1;
				if (i == 92)
					i_113_ = class536_sub33.readBigSmart();
				int i_114_ = class536_sub33.readUnsignedByte();
				anIntArray7988 = new int[i_114_ + 2];
				for (int i_115_ = 0; i_115_ <= i_114_; i_115_++)
					anIntArray7988[i_115_] = class536_sub33.readBigSmart();
				anIntArray7988[i_114_ + 1] = i_113_;
			} else if (78 == i) {
				anInt7946 = class536_sub33.readUnsignedShort() * -1186532107;
				anInt7991 = class536_sub33.readUnsignedByte() * -2073673989;
			} else if (i == 79) {
				anInt7967 = class536_sub33.readUnsignedShort() * -1963140303;
				anInt7961 = class536_sub33.readUnsignedShort() * -937467215;
				anInt7991 = class536_sub33.readUnsignedByte() * -2073673989;
				int i_116_ = class536_sub33.readUnsignedByte();
				anIntArray7997 = new int[i_116_];
				for (int i_117_ = 0; i_117_ < i_116_; i_117_++)
					anIntArray7997[i_117_] = class536_sub33.readUnsignedShort();
			} else if (81 == i) {
				aByte7954 = (byte) 2;
				anInt7955 = class536_sub33.readUnsignedByte() * 1891535616;
			} else if (82 == i)
				aBool7999 = true;
			else if (i == 88)
				aBool8000 = false;
			else if (89 == i)
				aBool7998 = false;
			else if (i == 91)
				aBool8001 = true;
			else if (i == 93) {
				aByte7954 = (byte) 3;
				anInt7955 = class536_sub33.readUnsignedShort() * -512704885;
			} else if (94 == i)
				aByte7954 = (byte) 4;
			else if (i == 95) {
				aByte7954 = (byte) 5;
				anInt7955 = class536_sub33.readShort() * -512704885;
			} else if (i == 97)
				aBool7970 = true;
			else if (i == 98)
				aBool8003 = true;
			else if (i == 99 || 100 == i) {
				class536_sub33.readUnsignedByte();
				class536_sub33.readUnsignedShort();
			} else if (i == 101)
				anInt7971 = class536_sub33.readUnsignedByte() * -1593952067;
			else if (102 == i)
				anInt7941 = class536_sub33.readUnsignedShort() * 1314038561;
			else if (i == 103)
				anInt7995 = 0;
			else if (104 == i)
				anInt7959 = class536_sub33.readUnsignedByte() * 1314451607;
			else if (105 == i)
				aBool7972 = true;
			else if (106 == i) {
				int i_118_ = class536_sub33.readUnsignedByte();
				int i_119_ = 0;
				anIntArray7960 = new int[i_118_];
				anIntArray7983 = new int[i_118_];
				for (int i_120_ = 0; i_120_ < i_118_; i_120_++) {
					anIntArray7960[i_120_] = class536_sub33.readBigSmart();
					i_119_ += anIntArray7983[i_120_] = class536_sub33.readUnsignedByte();
				}
				for (int i_121_ = 0; i_121_ < i_118_; i_121_++)
					anIntArray7983[i_121_] = anIntArray7983[i_121_] * 65535 / i_119_;
			} else if (i == 107)
				anInt7994 = class536_sub33.readUnsignedShort() * 1462571881;
			else if (i >= 150 && i < 155) {
				aStringArray7966[i - 150] = class536_sub33.readString().intern();
				if (!aClass608_7934.aBool7910)
					aStringArray7966[i - 150] = null;
			} else if (160 == i) {
				int i_122_ = class536_sub33.readUnsignedByte();
				anIntArray8004 = new int[i_122_];
				for (int i_123_ = 0; i_123_ < i_122_; i_123_++)
					anIntArray8004[i_123_] = class536_sub33.readUnsignedShort();
			} else if (162 == i) {
				aByte7954 = (byte) 3;
				anInt7955 = class536_sub33.readInt() * -512704885;
			} else if (i == 163) {
				aByte7982 = class536_sub33.readByte();
				aByte7947 = class536_sub33.readByte();
				aByte7948 = class536_sub33.readByte();
				aByte7949 = class536_sub33.readByte();
			} else if (i == 164)
				anInt7981 = class536_sub33.readShort() * -1554100081;
			else if (i == 165)
				anInt7984 = class536_sub33.readShort() * -698357095;
			else if (i == 166)
				anInt7936 = class536_sub33.readShort() * -1406833241;
			else if (167 == i)
				anInt7987 = class536_sub33.readUnsignedShort() * 277144019;
			else if (168 != i && 169 != i) {
				if (170 == i)
					anInt7931 = class536_sub33.readUnsignedSmart() * -425448053;
				else if (i == 171)
					anInt7950 = class536_sub33.readUnsignedSmart() * 1420098721;
				else if (173 == i) {
					anInt8005 = class536_sub33.readUnsignedShort() * -719122001;
					anInt8006 = class536_sub33.readUnsignedShort() * 181075575;
				} else if (i == 177)
					aBool8007 = true;
				else if (178 == i)
					anInt7992 = class536_sub33.readUnsignedByte() * -1081233369;
				else if (i == 186)
					aClass601_8009 = ((Class601) Class682.method8091(Class236.method3350(-1343454826), class536_sub33.readUnsignedByte(), 1858049507));
				else if (188 != i) {
					if (189 == i)
						aBool7969 = true;
					else if (i >= 190 && i < 196) {
						if (null == anIntArray7951) {
							anIntArray7951 = new int[6];
							Arrays.fill(anIntArray7951, -1);
						}
						anIntArray7951[i - 190] = class536_sub33.readUnsignedShort();
					} else if (196 == i)
						Class682.method8091(Class619.method7395(65280), class536_sub33.readUnsignedByte(), 1858049507);
					else if (197 == i)
						Class682.method8091(Class241.method3388((byte) 68), class536_sub33.readUnsignedByte(), 1858049507);
					else if (198 != i && 199 != i) {
						if (i == 200)
							aBool7993 = true;
						else if (i == 201) {
							aClass437_8010 = new Class437();
							aClass437_8010.aFloat4859 = (float) class536_sub33.method9717(-2048092877);
							aClass437_8010.aFloat4855 = (float) class536_sub33.method9717(940861975);
							aClass437_8010.aFloat4856 = (float) class536_sub33.method9717(-1960506235);
							aClass437_8010.aFloat4858 = (float) class536_sub33.method9717(-1363483899);
							aClass437_8010.aFloat4857 = (float) class536_sub33.method9717(2101734453);
							aClass437_8010.aFloat4854 = (float) class536_sub33.method9717(1929292458);
						} else if (i == 249) {
							int i_124_ = class536_sub33.readUnsignedByte();
							if (aClass4_7933 == null) {
								int i_125_ = Class528.method6434(i_124_, -417705039);
								aClass4_7933 = new Class4(i_125_);
							}
							for (int i_126_ = 0; i_126_ < i_124_; i_126_++) {
								boolean bool = (class536_sub33.readUnsignedByte() == 1);
								int i_127_ = class536_sub33.read24BitUnsignedInteger();
								Class536 class536;
								if (bool)
									class536 = new ObjectParam(class536_sub33.readString().intern());
								else
									class536 = new IntParam(class536_sub33.readInt());
								aClass4_7933.method560(class536, (long) i_127_);
							}
						}
					}
				}
			}
		}
	}

	public boolean method7300(byte i) {
		return null != anIntArray7960;
	}

	void method7301() {
		if (anInt7953 * 1248110961 == -1) {
			anInt7953 = 0;
			if (null != aByteArray7938 && aByteArray7938.length == 1 && (aByteArray7938[0] == -723459231 * ObjShapes.aClass606_7880.anInt7878))
				anInt7953 = -712968303;
			for (int i = 0; i < 5; i++) {
				if (aStringArray7966[i] != null) {
					anInt7953 = -712968303;
					break;
				}
			}
		}
		if (-1 == anInt7996 * -1529252395)
			anInt7996 = (0 != -1137177093 * anInt7952 ? 1 : 0) * 114563965;
		if (method7300((byte) -33) || aBool8003 || anIntArray7988 != null)
			aBool8007 = true;
		if (1248110961 * anInt7953 <= 0 && aClass601_8009 != Class601.aClass601_7851) {
			/* empty */
		}
	}

	void method7302() {
		if (anInt7953 * 1248110961 == -1) {
			anInt7953 = 0;
			if (null != aByteArray7938 && aByteArray7938.length == 1 && (aByteArray7938[0] == -723459231 * ObjShapes.aClass606_7880.anInt7878))
				anInt7953 = -712968303;
			for (int i = 0; i < 5; i++) {
				if (aStringArray7966[i] != null) {
					anInt7953 = -712968303;
					break;
				}
			}
		}
		if (-1 == anInt7996 * -1529252395)
			anInt7996 = (0 != -1137177093 * anInt7952 ? 1 : 0) * 114563965;
		if (method7300((byte) -89) || aBool8003 || anIntArray7988 != null)
			aBool8007 = true;
		if (1248110961 * anInt7953 <= 0 && aClass601_8009 != Class601.aClass601_7851) {
			/* empty */
		}
	}

	void method7303() {
		if (anInt7953 * 1248110961 == -1) {
			anInt7953 = 0;
			if (null != aByteArray7938 && aByteArray7938.length == 1 && (aByteArray7938[0] == -723459231 * ObjShapes.aClass606_7880.anInt7878))
				anInt7953 = -712968303;
			for (int i = 0; i < 5; i++) {
				if (aStringArray7966[i] != null) {
					anInt7953 = -712968303;
					break;
				}
			}
		}
		if (-1 == anInt7996 * -1529252395)
			anInt7996 = (0 != -1137177093 * anInt7952 ? 1 : 0) * 114563965;
		if (method7300((byte) -115) || aBool8003 || anIntArray7988 != null)
			aBool8007 = true;
		if (1248110961 * anInt7953 <= 0 && aClass601_8009 != Class601.aClass601_7851) {
			/* empty */
		}
	}

	public int method7304() {
		if (anIntArray7960 != null) {
			if (anIntArray7960.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_128_ = 0; i_128_ < anIntArray7960.length; i_128_++) {
					if (i <= anIntArray7983[i_128_])
						return anIntArray7960[i_128_];
					i -= anIntArray7983[i_128_];
				}
			} else
				return anIntArray7960[0];
		}
		return -1;
	}

	ObjTypeDecoder(int i, Class608 class608, Interface12 interface12) {
		anInt7980 = -1301379639;
		anInt7952 = 2017061478;
		anInt7953 = 712968303;
		aByte7954 = (byte) 0;
		anInt7955 = 512704885;
		aBool7956 = false;
		anInt7995 = 1551638173;
		anInt7931 = -408237760;
		anInt7950 = 0;
		anIntArray7960 = null;
		anIntArray7983 = null;
		aBool7993 = false;
		anInt7963 = -413037760;
		anInt7964 = 0;
		anInt7937 = 0;
		anInt7994 = -1462571881;
		anInt7941 = -1314038561;
		aBool7970 = false;
		anInt7971 = 0;
		aBool7972 = false;
		aBool7973 = false;
		aBool7974 = true;
		anInt7975 = -248213632;
		anInt7976 = -1586988416;
		anInt7977 = 106962560;
		anInt7978 = 0;
		anInt7979 = 0;
		anInt7962 = 0;
		anInt7981 = 0;
		anInt7984 = 0;
		anInt7936 = 0;
		aBool7945 = false;
		aBool7985 = false;
		anInt7996 = -114563965;
		anInt7987 = 0;
		anInt7989 = 1400564909;
		anInt7990 = -97020193;
		anInt7946 = 1186532107;
		anInt7991 = 0;
		anInt7992 = 0;
		anInt7959 = 177710697;
		anInt7967 = 0;
		anInt7961 = 0;
		aBool7998 = true;
		aBool7999 = false;
		aBool8000 = true;
		aBool8001 = false;
		aBool8003 = false;
		anInt8005 = 588361472;
		anInt8006 = -889293056;
		aBool8007 = false;
		aBool7969 = false;
		aClass601_8009 = Class601.aClass601_7850;
		anInt8008 = -823424833 * i;
		aClass608_7934 = class608;
		anInterface12_7943 = interface12;
		aStringArray7966 = (String[]) aClass608_7934.aStringArray7908.clone();
	}

	public int method7305(byte i) {
		if (anIntArray7960 != null) {
			if (anIntArray7960.length > 1) {
				int i_129_ = (int) (Math.random() * 65535.0);
				for (int i_130_ = 0; i_130_ < anIntArray7960.length; i_130_++) {
					if (i_129_ <= anIntArray7983[i_130_])
						return anIntArray7960[i_130_];
					i_129_ -= anIntArray7983[i_130_];
				}
			} else
				return anIntArray7960[0];
		}
		return -1;
	}

	public String method7306(int i, String string) {
		if (aClass4_7933 == null)
			return string;
		ObjectParam class536_sub13 = (ObjectParam) aClass4_7933.method556((long) i);
		if (null == class536_sub13)
			return string;
		return (String) class536_sub13.value;
	}

	public boolean method7307() {
		return null != anIntArray7960;
	}

	public boolean method7308() {
		return null != anIntArray7960 && anIntArray7960.length > 1;
	}

	void method7309(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			int i_131_ = class536_sub33.readUnsignedByte();
			aByteArray7938 = new byte[i_131_];
			anIntArrayArray7958 = new int[i_131_][];
			for (int i_132_ = 0; i_132_ < i_131_; i_132_++) {
				aByteArray7938[i_132_] = class536_sub33.readByte();
				int i_133_ = class536_sub33.readUnsignedByte();
				anIntArrayArray7958[i_132_] = new int[i_133_];
				for (int i_134_ = 0; i_134_ < i_133_; i_134_++)
					anIntArrayArray7958[i_132_][i_134_] = class536_sub33.readBigSmart();
			}
		} else if (2 == i)
			aString7935 = class536_sub33.readString().intern();
		else if (i == 14)
			anInt8002 = class536_sub33.readUnsignedByte() * -783423719;
		else if (i == 15)
			anInt7980 = class536_sub33.readUnsignedByte() * -1301379639;
		else if (17 == i)
			anInt7952 = 0;
		else if (18 != i) {
			if (i == 19)
				anInt7953 = class536_sub33.readUnsignedByte() * -712968303;
			else if (21 == i)
				aByte7954 = (byte) 1;
			else if (22 == i)
				aBool7956 = true;
			else if (i == 23)
				anInt7995 = -1551638173;
			else if (24 == i) {
				int i_135_ = class536_sub33.readBigSmart();
				if (-1 != i_135_)
					anIntArray7960 = new int[] { i_135_ };
			} else if (27 == i)
				anInt7952 = -1138952909;
			else if (28 == i)
				anInt7963 = (class536_sub33.readUnsignedByte() << 2) * -677542355;
			else if (i == 29)
				anInt7964 = class536_sub33.readByte() * -1041137523;
			else if (i == 39)
				anInt7937 = class536_sub33.readByte() * 1427321801;
			else if (i >= 30 && i < 35)
				aStringArray7966[i - 30] = class536_sub33.readString().intern();
			else if (40 == i) {
				int i_136_ = class536_sub33.readUnsignedByte();
				aShortArray7939 = new short[i_136_];
				aShortArray7940 = new short[i_136_];
				for (int i_137_ = 0; i_137_ < i_136_; i_137_++) {
					aShortArray7939[i_137_] = (short) class536_sub33.readUnsignedShort();
					aShortArray7940[i_137_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (41 == i) {
				int i_138_ = class536_sub33.readUnsignedByte();
				aShortArray7986 = new short[i_138_];
				aShortArray7968 = new short[i_138_];
				for (int i_139_ = 0; i_139_ < i_138_; i_139_++) {
					aShortArray7986[i_139_] = (short) class536_sub33.readUnsignedShort();
					aShortArray7968[i_139_] = (short) class536_sub33.readUnsignedShort();
				}
			} else if (42 == i) {
				int i_140_ = class536_sub33.readUnsignedByte();
				aByteArray7965 = new byte[i_140_];
				for (int i_141_ = 0; i_141_ < i_140_; i_141_++)
					aByteArray7965[i_141_] = class536_sub33.readByte();
			} else if (i == 44) {
				int i_142_ = class536_sub33.readUnsignedShort();
				int i_143_ = 0;
				for (int i_144_ = i_142_; i_144_ > 0; i_144_ >>= 1)
					i_143_++;
				aByteArray7944 = new byte[i_143_];
				byte i_145_ = 0;
				for (int i_146_ = 0; i_146_ < i_143_; i_146_++) {
					if ((i_142_ & 1 << i_146_) > 0) {
						aByteArray7944[i_146_] = i_145_;
						i_145_++;
					} else
						aByteArray7944[i_146_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_147_ = class536_sub33.readUnsignedShort();
				int i_148_ = 0;
				for (int i_149_ = i_147_; i_149_ > 0; i_149_ >>= 1)
					i_148_++;
				aByteArray7957 = new byte[i_148_];
				byte i_150_ = 0;
				for (int i_151_ = 0; i_151_ < i_148_; i_151_++) {
					if ((i_147_ & 1 << i_151_) > 0) {
						aByteArray7957[i_151_] = i_150_;
						i_150_++;
					} else
						aByteArray7957[i_151_] = (byte) -1;
				}
			} else if (i == 62)
				aBool7973 = true;
			else if (64 == i)
				aBool7974 = false;
			else if (i == 65)
				anInt7975 = class536_sub33.readUnsignedShort() * 635595039;
			else if (66 == i)
				anInt7976 = class536_sub33.readUnsignedShort() * 1027789045;
			else if (67 == i)
				anInt7977 = class536_sub33.readUnsignedShort() * -804470723;
			else if (i == 69)
				class536_sub33.readUnsignedByte();
			else if (70 == i)
				anInt7978 = ((class536_sub33.readShort() << 2) * -445350345);
			else if (i == 71)
				anInt7979 = (class536_sub33.readShort() << 2) * 902429351;
			else if (72 == i)
				anInt7962 = ((class536_sub33.readShort() << 2) * 1093534315);
			else if (73 == i)
				aBool7945 = true;
			else if (i == 74)
				aBool7985 = true;
			else if (75 == i)
				anInt7996 = class536_sub33.readUnsignedByte() * 114563965;
			else if (77 == i || i == 92) {
				anInt7989 = class536_sub33.readUnsignedShort() * -1400564909;
				if (anInt7989 * 1868474587 == 65535)
					anInt7989 = 1400564909;
				anInt7990 = class536_sub33.readUnsignedShort() * 97020193;
				if (2066111201 * anInt7990 == 65535)
					anInt7990 = -97020193;
				int i_152_ = -1;
				if (i == 92)
					i_152_ = class536_sub33.readBigSmart();
				int i_153_ = class536_sub33.readUnsignedByte();
				anIntArray7988 = new int[i_153_ + 2];
				for (int i_154_ = 0; i_154_ <= i_153_; i_154_++)
					anIntArray7988[i_154_] = class536_sub33.readBigSmart();
				anIntArray7988[i_153_ + 1] = i_152_;
			} else if (78 == i) {
				anInt7946 = class536_sub33.readUnsignedShort() * -1186532107;
				anInt7991 = class536_sub33.readUnsignedByte() * -2073673989;
			} else if (i == 79) {
				anInt7967 = class536_sub33.readUnsignedShort() * -1963140303;
				anInt7961 = class536_sub33.readUnsignedShort() * -937467215;
				anInt7991 = class536_sub33.readUnsignedByte() * -2073673989;
				int i_155_ = class536_sub33.readUnsignedByte();
				anIntArray7997 = new int[i_155_];
				for (int i_156_ = 0; i_156_ < i_155_; i_156_++)
					anIntArray7997[i_156_] = class536_sub33.readUnsignedShort();
			} else if (81 == i) {
				aByte7954 = (byte) 2;
				anInt7955 = class536_sub33.readUnsignedByte() * 1891535616;
			} else if (82 == i)
				aBool7999 = true;
			else if (i == 88)
				aBool8000 = false;
			else if (89 == i)
				aBool7998 = false;
			else if (i == 91)
				aBool8001 = true;
			else if (i == 93) {
				aByte7954 = (byte) 3;
				anInt7955 = class536_sub33.readUnsignedShort() * -512704885;
			} else if (94 == i)
				aByte7954 = (byte) 4;
			else if (i == 95) {
				aByte7954 = (byte) 5;
				anInt7955 = class536_sub33.readShort() * -512704885;
			} else if (i == 97)
				aBool7970 = true;
			else if (i == 98)
				aBool8003 = true;
			else if (i == 99 || 100 == i) {
				class536_sub33.readUnsignedByte();
				class536_sub33.readUnsignedShort();
			} else if (i == 101)
				anInt7971 = class536_sub33.readUnsignedByte() * -1593952067;
			else if (102 == i)
				anInt7941 = class536_sub33.readUnsignedShort() * 1314038561;
			else if (i == 103)
				anInt7995 = 0;
			else if (104 == i)
				anInt7959 = class536_sub33.readUnsignedByte() * 1314451607;
			else if (105 == i)
				aBool7972 = true;
			else if (106 == i) {
				int i_157_ = class536_sub33.readUnsignedByte();
				int i_158_ = 0;
				anIntArray7960 = new int[i_157_];
				anIntArray7983 = new int[i_157_];
				for (int i_159_ = 0; i_159_ < i_157_; i_159_++) {
					anIntArray7960[i_159_] = class536_sub33.readBigSmart();
					i_158_ += anIntArray7983[i_159_] = class536_sub33.readUnsignedByte();
				}
				for (int i_160_ = 0; i_160_ < i_157_; i_160_++)
					anIntArray7983[i_160_] = anIntArray7983[i_160_] * 65535 / i_158_;
			} else if (i == 107)
				anInt7994 = class536_sub33.readUnsignedShort() * 1462571881;
			else if (i >= 150 && i < 155) {
				aStringArray7966[i - 150] = class536_sub33.readString().intern();
				if (!aClass608_7934.aBool7910)
					aStringArray7966[i - 150] = null;
			} else if (160 == i) {
				int i_161_ = class536_sub33.readUnsignedByte();
				anIntArray8004 = new int[i_161_];
				for (int i_162_ = 0; i_162_ < i_161_; i_162_++)
					anIntArray8004[i_162_] = class536_sub33.readUnsignedShort();
			} else if (162 == i) {
				aByte7954 = (byte) 3;
				anInt7955 = class536_sub33.readInt() * -512704885;
			} else if (i == 163) {
				aByte7982 = class536_sub33.readByte();
				aByte7947 = class536_sub33.readByte();
				aByte7948 = class536_sub33.readByte();
				aByte7949 = class536_sub33.readByte();
			} else if (i == 164)
				anInt7981 = class536_sub33.readShort() * -1554100081;
			else if (i == 165)
				anInt7984 = class536_sub33.readShort() * -698357095;
			else if (i == 166)
				anInt7936 = class536_sub33.readShort() * -1406833241;
			else if (167 == i)
				anInt7987 = class536_sub33.readUnsignedShort() * 277144019;
			else if (168 != i && 169 != i) {
				if (170 == i)
					anInt7931 = class536_sub33.readUnsignedSmart() * -425448053;
				else if (i == 171)
					anInt7950 = class536_sub33.readUnsignedSmart() * 1420098721;
				else if (173 == i) {
					anInt8005 = (class536_sub33.readUnsignedShort() * -719122001);
					anInt8006 = class536_sub33.readUnsignedShort() * 181075575;
				} else if (i == 177)
					aBool8007 = true;
				else if (178 == i)
					anInt7992 = class536_sub33.readUnsignedByte() * -1081233369;
				else if (i == 186)
					aClass601_8009 = ((Class601) Class682.method8091(Class236.method3350(-1343454826), class536_sub33.readUnsignedByte(), 1858049507));
				else if (188 != i) {
					if (189 == i)
						aBool7969 = true;
					else if (i >= 190 && i < 196) {
						if (null == anIntArray7951) {
							anIntArray7951 = new int[6];
							Arrays.fill(anIntArray7951, -1);
						}
						anIntArray7951[i - 190] = class536_sub33.readUnsignedShort();
					} else if (196 == i)
						Class682.method8091(Class619.method7395(65280), class536_sub33.readUnsignedByte(), 1858049507);
					else if (197 == i)
						Class682.method8091(Class241.method3388((byte) 12), class536_sub33.readUnsignedByte(), 1858049507);
					else if (198 != i && 199 != i) {
						if (i == 200)
							aBool7993 = true;
						else if (i == 201) {
							aClass437_8010 = new Class437();
							aClass437_8010.aFloat4859 = (float) class536_sub33.method9717(1665215506);
							aClass437_8010.aFloat4855 = (float) class536_sub33.method9717(-1839559218);
							aClass437_8010.aFloat4856 = (float) class536_sub33.method9717(380796458);
							aClass437_8010.aFloat4858 = (float) class536_sub33.method9717(-569565637);
							aClass437_8010.aFloat4857 = (float) class536_sub33.method9717(-938240614);
							aClass437_8010.aFloat4854 = (float) class536_sub33.method9717(-45228529);
						} else if (i == 249) {
							int i_163_ = class536_sub33.readUnsignedByte();
							if (aClass4_7933 == null) {
								int i_164_ = Class528.method6434(i_163_, -1107678031);
								aClass4_7933 = new Class4(i_164_);
							}
							for (int i_165_ = 0; i_165_ < i_163_; i_165_++) {
								boolean bool = (class536_sub33.readUnsignedByte() == 1);
								int i_166_ = class536_sub33.read24BitUnsignedInteger();
								Class536 class536;
								if (bool)
									class536 = new ObjectParam(class536_sub33.readString().intern());
								else
									class536 = new IntParam(class536_sub33.readInt());
								aClass4_7933.method560(class536, (long) i_166_);
							}
						}
					}
				}
			}
		}
	}

	public int method7310() {
		if (anIntArray7960 != null) {
			if (anIntArray7960.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_167_ = 0; i_167_ < anIntArray7960.length; i_167_++) {
					if (i <= anIntArray7983[i_167_])
						return anIntArray7960[i_167_];
					i -= anIntArray7983[i_167_];
				}
			} else
				return anIntArray7960[0];
		}
		return -1;
	}

	public int method7311() {
		if (anIntArray7960 != null) {
			if (anIntArray7960.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_168_ = 0; i_168_ < anIntArray7960.length; i_168_++) {
					if (i <= anIntArray7983[i_168_])
						return anIntArray7960[i_168_];
					i -= anIntArray7983[i_168_];
				}
			} else
				return anIntArray7960[0];
		}
		return -1;
	}

	public int method7312(int i) {
		if (null == anIntArray7951)
			return -1;
		return anIntArray7951[i];
	}

	static final void method7313(Class668 class668, int i) {
		Class28.method770((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]), (short) 11737);
	}

	static final void method7314(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class190.method2826(class251, class234, class668, -1238707415);
	}

	public static int method7315(String string, int i) {
		return string.length() + 2;
	}
}
