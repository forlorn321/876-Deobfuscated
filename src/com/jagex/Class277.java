/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class277 implements ConfigType {
	public String[] aStringArray3026;
	public String aString3027;
	public String aString3028;
	int[][] anIntArrayArray3029;
	int[][] anIntArrayArray3030;
	public int anInt3031 = 0;
	public int anInt3032;
	public boolean aBool3033;
	int[] anIntArray3034;
	Interface12 anInterface12_3035;
	public int[] anIntArray3036;
	public int[][] anIntArrayArray3037;
	public int anInt3038;
	int[] anIntArray3039;
	Class4 aClass4_3040;
	int[] anIntArray3041;
	public String[] aStringArray3042;
	public int[] anIntArray3043;
	public int[] anIntArray3044;
	int[] anIntArray3045;
	int[] anIntArray3046;
	public int anInt3047 = 0;
	public int anInt3048;

	public void decodeType(RSByteBuffer class536_sub33) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method3740(class536_sub33, i_0_, -1106056103);
		}
	}

	void method3740(RSByteBuffer class536_sub33, int i, int i_1_) {
		if (1 == i)
			aString3027 = class536_sub33.readVersionedString();
		else if (2 == i)
			aString3028 = class536_sub33.readVersionedString();
		else if (3 == i) {
			int i_2_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3029 = new int[i_2_][3];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				anIntArrayArray3029[i_3_][0] = class536_sub33.readUnsignedShort();
				anIntArrayArray3029[i_3_][1] = class536_sub33.readInt();
				anIntArrayArray3029[i_3_][2] = class536_sub33.readInt();
			}
		} else if (4 == i) {
			int i_4_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3030 = new int[i_4_][3];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				anIntArrayArray3030[i_5_][0] = class536_sub33.readUnsignedShort();
				anIntArrayArray3030[i_5_][1] = class536_sub33.readInt();
				anIntArrayArray3030[i_5_][2] = class536_sub33.readInt();
			}
		} else if (5 == i)
			class536_sub33.readUnsignedShort();
		else if (i == 6)
			anInt3031 = class536_sub33.readUnsignedByte() * 493644429;
		else if (i == 7)
			anInt3047 = class536_sub33.readUnsignedByte() * 1327736819;
		else if (8 == i)
			aBool3033 = true;
		else if (9 == i)
			anInt3038 = class536_sub33.readUnsignedByte() * 1369176991;
		else if (i == 10) {
			int i_6_ = class536_sub33.readUnsignedByte();
			anIntArray3039 = new int[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				anIntArray3039[i_7_] = class536_sub33.readInt();
		} else if (12 == i)
			class536_sub33.readInt();
		else if (13 == i) {
			int i_8_ = class536_sub33.readUnsignedByte();
			anIntArray3036 = new int[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				anIntArray3036[i_9_] = class536_sub33.readUnsignedShort();
		} else if (14 == i) {
			int i_10_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3037 = new int[i_10_][2];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				anIntArrayArray3037[i_11_][0] = class536_sub33.readUnsignedByte();
				anIntArrayArray3037[i_11_][1] = class536_sub33.readUnsignedByte();
			}
		} else if (i == 15)
			anInt3032 = class536_sub33.readUnsignedShort() * -757256069;
		else if (i == 17)
			anInt3048 = class536_sub33.readBigSmart() * 1566078101;
		else if (i == 18) {
			int i_12_ = class536_sub33.readUnsignedByte();
			anIntArray3044 = new int[i_12_];
			anIntArray3034 = new int[i_12_];
			anIntArray3041 = new int[i_12_];
			aStringArray3042 = new String[i_12_];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				anIntArray3044[i_13_] = class536_sub33.readInt();
				anIntArray3034[i_13_] = class536_sub33.readInt();
				anIntArray3041[i_13_] = class536_sub33.readInt();
				aStringArray3042[i_13_] = class536_sub33.readString();
			}
		} else if (19 == i) {
			int i_14_ = class536_sub33.readUnsignedByte();
			anIntArray3043 = new int[i_14_];
			anIntArray3046 = new int[i_14_];
			anIntArray3045 = new int[i_14_];
			aStringArray3026 = new String[i_14_];
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				anIntArray3043[i_15_] = class536_sub33.readInt();
				anIntArray3046[i_15_] = class536_sub33.readInt();
				anIntArray3045[i_15_] = class536_sub33.readInt();
				aStringArray3026[i_15_] = class536_sub33.readString();
			}
		} else if (249 == i) {
			int i_16_ = class536_sub33.readUnsignedByte();
			if (null == aClass4_3040) {
				int i_17_ = Class528.method6434(i_16_, 8573132);
				aClass4_3040 = new Class4(i_17_);
			}
			for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
				boolean bool = class536_sub33.readUnsignedByte() == 1;
				int i_19_ = class536_sub33.read24BitUnsignedInteger();
				Class536 class536;
				if (bool)
					class536 = new ObjectParam(class536_sub33.readString());
				else
					class536 = new IntParam(class536_sub33.readInt());
				aClass4_3040.method560(class536, (long) i_19_);
			}
		}
	}

	public void method77() {
		if (null == aString3028)
			aString3028 = aString3027;
	}

	public int method3741(int i, int i_20_, int i_21_) {
		if (null == aClass4_3040)
			return i_20_;
		IntParam class536_sub26 = (IntParam) aClass4_3040.method556((long) i);
		if (null == class536_sub26)
			return i_20_;
		return 2083602213 * class536_sub26.value;
	}

	public String method3742(int i, String string, byte i_22_) {
		if (null == aClass4_3040)
			return string;
		ObjectParam class536_sub13 = (ObjectParam) aClass4_3040.method556((long) i);
		if (null == class536_sub13)
			return string;
		return (String) class536_sub13.value;
	}

	public boolean method3743(Interface18 interface18, byte i) {
		if (anIntArrayArray3029 != null) {
			for (int i_23_ = 0; i_23_ < anIntArrayArray3029.length; i_23_++) {
				Class153 class153 = (((Interface20) interface18).method124(Class458.aClass458_5176, anIntArrayArray3029[i_23_][0], 323730415));
				if (interface18.method99(class153, 2094027940) >= anIntArrayArray3029[i_23_][1])
					return true;
			}
		}
		if (null != anIntArrayArray3030) {
			for (int i_24_ = 0; i_24_ < anIntArrayArray3030.length; i_24_++) {
				Class324 class324 = (((Interface20) interface18).method123(anIntArrayArray3030[i_24_][0], -1018286558));
				if (interface18.method96(class324, -258629903) >= anIntArrayArray3030[i_24_][1])
					return true;
			}
		}
		return false;
	}

	public boolean method3744(Interface18 interface18, byte i) {
		if (Class333_Sub1.method9165(interface18, anInterface12_3035, (byte) 118) < -829215053 * anInt3032)
			return false;
		if (anIntArrayArray3037 != null) {
			for (int i_25_ = 0; i_25_ < anIntArrayArray3037.length; i_25_++) {
				if (((Interface72) interface18).method481(anIntArrayArray3037[i_25_][0], (byte) 117) < anIntArrayArray3037[i_25_][1])
					return false;
			}
		}
		if (null != anIntArray3036) {
			for (int i_26_ = 0; i_26_ < anIntArray3036.length; i_26_++) {
				if (!((Class277) anInterface12_3035.method70(anIntArray3036[i_26_], (byte) -67)).method3750(interface18, (byte) 42))
					return false;
			}
		}
		if (null != anIntArray3044) {
			for (int i_27_ = 0; i_27_ < anIntArray3044.length; i_27_++) {
				Class153 class153 = ((Interface20) interface18).method124((Class458.aClass458_5176), (anIntArray3044[i_27_]), 323730415);
				int i_28_ = interface18.method99(class153, 2033574603);
				if (i_28_ < anIntArray3034[i_27_] || i_28_ > anIntArray3041[i_27_])
					return false;
			}
		}
		if (anIntArray3043 != null) {
			for (int i_29_ = 0; i_29_ < anIntArray3043.length; i_29_++) {
				Class324 class324 = ((Interface20) interface18).method123(anIntArray3043[i_29_], -1018286558);
				int i_30_ = interface18.method96(class324, -1722093451);
				if (i_30_ < anIntArray3046[i_29_] || i_30_ > anIntArray3045[i_29_])
					return false;
			}
		}
		return true;
	}

	public boolean method3745(Interface18 interface18, int i) {
		if (Class333_Sub1.method9165(interface18, anInterface12_3035, (byte) 27) < anInt3032 * -829215053)
			return false;
		return true;
	}

	public boolean method3746(Interface18 interface18, int i, int i_31_) {
		if (null == anIntArrayArray3037 || i < 0 || i >= anIntArrayArray3037.length)
			return false;
		if (((Interface72) interface18).method481(anIntArrayArray3037[i][0], (byte) 19) < anIntArrayArray3037[i][1])
			return false;
		return true;
	}

	public boolean method3747(Interface18 interface18, int i, int i_32_) {
		if (anIntArray3036 == null || i < 0 || i >= anIntArray3036.length)
			return false;
		if (!((Class277) anInterface12_3035.method70(anIntArray3036[i], (byte) -37)).method3750(interface18, (byte) 110))
			return false;
		return true;
	}

	public boolean method3748(Interface18 interface18, int i, byte i_33_) {
		if (anIntArray3044 == null || i < 0 || i >= anIntArray3044.length)
			return false;
		Class153 class153 = ((Interface20) interface18).method124(Class458.aClass458_5176, anIntArray3044[i], 323730415);
		int i_34_ = interface18.method99(class153, 2085534331);
		if (i_34_ < anIntArray3034[i] || i_34_ > anIntArray3041[i])
			return false;
		return true;
	}

	public boolean method3749(Interface18 interface18, int i, int i_35_) {
		if (null == anIntArray3043 || i < 0 || i >= anIntArray3043.length)
			return false;
		Class324 class324 = ((Interface20) interface18).method123(anIntArray3043[i], -1018286558);
		int i_36_ = interface18.method96(class324, -188523554);
		if (i_36_ < anIntArray3046[i] || i_36_ > anIntArray3045[i])
			return false;
		return true;
	}

	public boolean method3750(Interface18 interface18, byte i) {
		if (null != anIntArrayArray3029) {
			for (int i_37_ = 0; i_37_ < anIntArrayArray3029.length; i_37_++) {
				Class153 class153 = (((Interface20) interface18).method124(Class458.aClass458_5176, anIntArrayArray3029[i_37_][0], 323730415));
				if (interface18.method99(class153, 2095033606) >= anIntArrayArray3029[i_37_][2])
					return true;
			}
		}
		if (anIntArrayArray3030 != null) {
			for (int i_38_ = 0; i_38_ < anIntArrayArray3030.length; i_38_++) {
				Class324 class324 = (((Interface20) interface18).method123(anIntArrayArray3030[i_38_][0], -1018286558));
				if (interface18.method96(class324, 633738930) >= anIntArrayArray3030[i_38_][2])
					return true;
			}
		}
		return false;
	}

	void method3751(RSByteBuffer class536_sub33, int i) {
		if (1 == i)
			aString3027 = class536_sub33.readVersionedString();
		else if (2 == i)
			aString3028 = class536_sub33.readVersionedString();
		else if (3 == i) {
			int i_39_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3029 = new int[i_39_][3];
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				anIntArrayArray3029[i_40_][0] = class536_sub33.readUnsignedShort();
				anIntArrayArray3029[i_40_][1] = class536_sub33.readInt();
				anIntArrayArray3029[i_40_][2] = class536_sub33.readInt();
			}
		} else if (4 == i) {
			int i_41_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3030 = new int[i_41_][3];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
				anIntArrayArray3030[i_42_][0] = class536_sub33.readUnsignedShort();
				anIntArrayArray3030[i_42_][1] = class536_sub33.readInt();
				anIntArrayArray3030[i_42_][2] = class536_sub33.readInt();
			}
		} else if (5 == i)
			class536_sub33.readUnsignedShort();
		else if (i == 6)
			anInt3031 = class536_sub33.readUnsignedByte() * 493644429;
		else if (i == 7)
			anInt3047 = class536_sub33.readUnsignedByte() * 1327736819;
		else if (8 == i)
			aBool3033 = true;
		else if (9 == i)
			anInt3038 = class536_sub33.readUnsignedByte() * 1369176991;
		else if (i == 10) {
			int i_43_ = class536_sub33.readUnsignedByte();
			anIntArray3039 = new int[i_43_];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
				anIntArray3039[i_44_] = class536_sub33.readInt();
		} else if (12 == i)
			class536_sub33.readInt();
		else if (13 == i) {
			int i_45_ = class536_sub33.readUnsignedByte();
			anIntArray3036 = new int[i_45_];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
				anIntArray3036[i_46_] = class536_sub33.readUnsignedShort();
		} else if (14 == i) {
			int i_47_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3037 = new int[i_47_][2];
			for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
				anIntArrayArray3037[i_48_][0] = class536_sub33.readUnsignedByte();
				anIntArrayArray3037[i_48_][1] = class536_sub33.readUnsignedByte();
			}
		} else if (i == 15)
			anInt3032 = class536_sub33.readUnsignedShort() * -757256069;
		else if (i == 17)
			anInt3048 = class536_sub33.readBigSmart() * 1566078101;
		else if (i == 18) {
			int i_49_ = class536_sub33.readUnsignedByte();
			anIntArray3044 = new int[i_49_];
			anIntArray3034 = new int[i_49_];
			anIntArray3041 = new int[i_49_];
			aStringArray3042 = new String[i_49_];
			for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
				anIntArray3044[i_50_] = class536_sub33.readInt();
				anIntArray3034[i_50_] = class536_sub33.readInt();
				anIntArray3041[i_50_] = class536_sub33.readInt();
				aStringArray3042[i_50_] = class536_sub33.readString();
			}
		} else if (19 == i) {
			int i_51_ = class536_sub33.readUnsignedByte();
			anIntArray3043 = new int[i_51_];
			anIntArray3046 = new int[i_51_];
			anIntArray3045 = new int[i_51_];
			aStringArray3026 = new String[i_51_];
			for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
				anIntArray3043[i_52_] = class536_sub33.readInt();
				anIntArray3046[i_52_] = class536_sub33.readInt();
				anIntArray3045[i_52_] = class536_sub33.readInt();
				aStringArray3026[i_52_] = class536_sub33.readString();
			}
		} else if (249 == i) {
			int i_53_ = class536_sub33.readUnsignedByte();
			if (null == aClass4_3040) {
				int i_54_ = Class528.method6434(i_53_, -1934048646);
				aClass4_3040 = new Class4(i_54_);
			}
			for (int i_55_ = 0; i_55_ < i_53_; i_55_++) {
				boolean bool = class536_sub33.readUnsignedByte() == 1;
				int i_56_ = class536_sub33.read24BitUnsignedInteger();
				Class536 class536;
				if (bool)
					class536 = new ObjectParam(class536_sub33.readString());
				else
					class536 = new IntParam(class536_sub33.readInt());
				aClass4_3040.method560(class536, (long) i_56_);
			}
		}
	}

	void method3752(RSByteBuffer class536_sub33, int i) {
		if (1 == i)
			aString3027 = class536_sub33.readVersionedString();
		else if (2 == i)
			aString3028 = class536_sub33.readVersionedString();
		else if (3 == i) {
			int i_57_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3029 = new int[i_57_][3];
			for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
				anIntArrayArray3029[i_58_][0] = class536_sub33.readUnsignedShort();
				anIntArrayArray3029[i_58_][1] = class536_sub33.readInt();
				anIntArrayArray3029[i_58_][2] = class536_sub33.readInt();
			}
		} else if (4 == i) {
			int i_59_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3030 = new int[i_59_][3];
			for (int i_60_ = 0; i_60_ < i_59_; i_60_++) {
				anIntArrayArray3030[i_60_][0] = class536_sub33.readUnsignedShort();
				anIntArrayArray3030[i_60_][1] = class536_sub33.readInt();
				anIntArrayArray3030[i_60_][2] = class536_sub33.readInt();
			}
		} else if (5 == i)
			class536_sub33.readUnsignedShort();
		else if (i == 6)
			anInt3031 = class536_sub33.readUnsignedByte() * 493644429;
		else if (i == 7)
			anInt3047 = class536_sub33.readUnsignedByte() * 1327736819;
		else if (8 == i)
			aBool3033 = true;
		else if (9 == i)
			anInt3038 = class536_sub33.readUnsignedByte() * 1369176991;
		else if (i == 10) {
			int i_61_ = class536_sub33.readUnsignedByte();
			anIntArray3039 = new int[i_61_];
			for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
				anIntArray3039[i_62_] = class536_sub33.readInt();
		} else if (12 == i)
			class536_sub33.readInt();
		else if (13 == i) {
			int i_63_ = class536_sub33.readUnsignedByte();
			anIntArray3036 = new int[i_63_];
			for (int i_64_ = 0; i_64_ < i_63_; i_64_++)
				anIntArray3036[i_64_] = class536_sub33.readUnsignedShort();
		} else if (14 == i) {
			int i_65_ = class536_sub33.readUnsignedByte();
			anIntArrayArray3037 = new int[i_65_][2];
			for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
				anIntArrayArray3037[i_66_][0] = class536_sub33.readUnsignedByte();
				anIntArrayArray3037[i_66_][1] = class536_sub33.readUnsignedByte();
			}
		} else if (i == 15)
			anInt3032 = class536_sub33.readUnsignedShort() * -757256069;
		else if (i == 17)
			anInt3048 = class536_sub33.readBigSmart() * 1566078101;
		else if (i == 18) {
			int i_67_ = class536_sub33.readUnsignedByte();
			anIntArray3044 = new int[i_67_];
			anIntArray3034 = new int[i_67_];
			anIntArray3041 = new int[i_67_];
			aStringArray3042 = new String[i_67_];
			for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
				anIntArray3044[i_68_] = class536_sub33.readInt();
				anIntArray3034[i_68_] = class536_sub33.readInt();
				anIntArray3041[i_68_] = class536_sub33.readInt();
				aStringArray3042[i_68_] = class536_sub33.readString();
			}
		} else if (19 == i) {
			int i_69_ = class536_sub33.readUnsignedByte();
			anIntArray3043 = new int[i_69_];
			anIntArray3046 = new int[i_69_];
			anIntArray3045 = new int[i_69_];
			aStringArray3026 = new String[i_69_];
			for (int i_70_ = 0; i_70_ < i_69_; i_70_++) {
				anIntArray3043[i_70_] = class536_sub33.readInt();
				anIntArray3046[i_70_] = class536_sub33.readInt();
				anIntArray3045[i_70_] = class536_sub33.readInt();
				aStringArray3026[i_70_] = class536_sub33.readString();
			}
		} else if (249 == i) {
			int i_71_ = class536_sub33.readUnsignedByte();
			if (null == aClass4_3040) {
				int i_72_ = Class528.method6434(i_71_, -1412582404);
				aClass4_3040 = new Class4(i_72_);
			}
			for (int i_73_ = 0; i_73_ < i_71_; i_73_++) {
				boolean bool = class536_sub33.readUnsignedByte() == 1;
				int i_74_ = class536_sub33.read24BitUnsignedInteger();
				Class536 class536;
				if (bool)
					class536 = new ObjectParam(class536_sub33.readString());
				else
					class536 = new IntParam(class536_sub33.readInt());
				aClass4_3040.method560(class536, (long) i_74_);
			}
		}
	}

	Class277(int i, Interface12 interface12) {
		aBool3033 = false;
		anInt3048 = -1566078101;
		anInterface12_3035 = interface12;
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method3740(class536_sub33, i, -1106056103);
		}
	}

	public void postDecode() {
		if (null == aString3028)
			aString3028 = aString3027;
	}

	static void method3753(Class536_Sub42 class536_sub42, int i, int i_75_) {
		Object[] objects = class536_sub42.anObjectArray10802;
		int i_76_ = ((Integer) objects[0]).intValue();
		Class536_Sub18_Sub16 class536_sub18_sub16 = Class457.method5485(i_76_, 1541811627);
		if (class536_sub18_sub16 != null) {
			Class668 class668 = Class586.method7063((byte) 5);
			class668.anIntArray8550 = new int[class536_sub18_sub16.anInt11795 * 520600665];
			int i_77_ = 0;
			class668.anObjectArray8561 = new String[class536_sub18_sub16.anInt11799 * 1265663029];
			int i_78_ = 0;
			class668.aLongArray8538 = new long[class536_sub18_sub16.anInt11802 * 1971309879];
			int i_79_ = 0;
			for (int i_80_ = 1; i_80_ < objects.length; i_80_++) {
				if (objects[i_80_] instanceof Integer) {
					int i_81_ = ((Integer) objects[i_80_]).intValue();
					if (i_81_ == -2147483647)
						i_81_ = class536_sub42.anInt10803 * 141740503;
					if (i_81_ == -2147483646)
						i_81_ = class536_sub42.anInt10800 * 1548365433;
					if (-2147483645 == i_81_)
						i_81_ = (null != class536_sub42.aClass251_10804 ? (-1591767037 * class536_sub42.aClass251_10804.anInt2559) : -1);
					if (-2147483644 == i_81_)
						i_81_ = class536_sub42.anInt10805 * 560106671;
					if (i_81_ == -2147483643)
						i_81_ = (null != class536_sub42.aClass251_10804 ? (class536_sub42.aClass251_10804.anInt2546 * -809980533) : -1);
					if (-2147483642 == i_81_)
						i_81_ = (null != class536_sub42.aClass251_10806 ? (class536_sub42.aClass251_10806.anInt2559 * -1591767037) : -1);
					if (-2147483641 == i_81_)
						i_81_ = (class536_sub42.aClass251_10806 != null ? (class536_sub42.aClass251_10806.anInt2546 * -809980533) : -1);
					if (-2147483640 == i_81_)
						i_81_ = class536_sub42.anInt10807 * -549774501;
					if (-2147483639 == i_81_)
						i_81_ = 1091948887 * class536_sub42.anInt10808;
					class668.anIntArray8550[i_77_++] = i_81_;
				} else if (objects[i_80_] instanceof String) {
					String string = (String) objects[i_80_];
					if (string.equals("event_opbase"))
						string = class536_sub42.aString10809;
					class668.anObjectArray8561[i_78_++] = string;
				} else if (objects[i_80_] instanceof Long) {
					long l = ((Long) objects[i_80_]).longValue();
					class668.aLongArray8538[i_79_++] = l;
				}
			}
			class668.anInt8559 = class536_sub42.anInt10810 * 163306479;
			Class198.method2876(class536_sub18_sub16, i, class668, -482518332);
			class668.anInt8559 = 0;
		}
	}

	public static int method3754(int i, int i_82_) {
		Class536_Sub18_Sub12 class536_sub18_sub12 = (Class536_Sub18_Sub12) Class262.aClass4_2847.method556((long) i);
		if (class536_sub18_sub12 == null)
			return -1;
		if (class536_sub18_sub12.aClass536_Sub18_10508 == Class262.aClass700_2846.aClass536_Sub18_8794)
			return -1;
		return (698041493 * ((Class536_Sub18_Sub12) class536_sub18_sub12.aClass536_Sub18_10508).anInt11728);
	}
}
