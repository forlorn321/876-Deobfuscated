/* Class536_Sub18_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub2 extends Class536_Sub18 implements Interface13, Interface7 {
	Class4 aClass4_11331;

	Class536_Sub18_Sub2() {
		/* empty */
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte(-1466251806);
			if (0 == i_0_)
				break;
			method10483(class536_sub33, i_0_, -1093384679);
		}
	}

	public void method57(int i) {
		/* empty */
	}

	public int method10481(int i, int i_1_) {
		if (null == aClass4_11331)
			return i_1_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_11331.method556((long) i);
		if (null == class536_sub26)
			return i_1_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public String method10482(int i, String string, int i_2_) {
		if (null == aClass4_11331)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_11331.method556((long) i);
		if (null == class536_sub13)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	public void method59(int i, int i_3_) {
		/* empty */
	}

	void method10483(RSByteBuffer class536_sub33, int i, int i_4_) {
		if (i == 249) {
			int i_5_ = class536_sub33.readUnsignedByte(1784909094);
			if (aClass4_11331 == null) {
				int i_6_ = Class528.method6434(i_5_, -749369397);
				aClass4_11331 = new Class4(i_6_);
			}
			for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
				boolean bool = class536_sub33.readUnsignedByte(-1627632578) == 1;
				int i_8_ = class536_sub33.read24BitUnsignedInteger(1196325211);
				Class536 class536;
				if (bool)
					class536 = new Class536_Sub13(class536_sub33.readString());
				else
					class536 = new Class536_Sub26(class536_sub33.readInt());
				aClass4_11331.method560(class536, (long) i_8_);
			}
		}
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(-1524732401);
			if (0 == i)
				break;
			method10483(class536_sub33, i, 2069724290);
		}
	}

	public void method77() {
		/* empty */
	}

	public int method10484(int i, int i_9_, byte i_10_) {
		if (null == aClass4_11331)
			return i_9_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_11331.method556((long) i);
		if (null == class536_sub26)
			return i_9_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public void method58(int i) {
		/* empty */
	}

	void method10485(RSByteBuffer class536_sub33, int i) {
		if (i == 249) {
			int i_11_ = class536_sub33.readUnsignedByte(590558523);
			if (aClass4_11331 == null) {
				int i_12_ = Class528.method6434(i_11_, -1479389088);
				aClass4_11331 = new Class4(i_12_);
			}
			for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
				boolean bool = class536_sub33.readUnsignedByte(-1653948911) == 1;
				int i_14_ = class536_sub33.read24BitUnsignedInteger(1019026108);
				Class536 class536;
				if (bool)
					class536 = new Class536_Sub13(class536_sub33.readString());
				else
					class536 = new Class536_Sub26(class536_sub33.readInt());
				aClass4_11331.method560(class536, (long) i_14_);
			}
		}
	}

	void method10486(RSByteBuffer class536_sub33, int i) {
		if (i == 249) {
			int i_15_ = class536_sub33.readUnsignedByte(-931668047);
			if (aClass4_11331 == null) {
				int i_16_ = Class528.method6434(i_15_, -2133544801);
				aClass4_11331 = new Class4(i_16_);
			}
			for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
				boolean bool = class536_sub33.readUnsignedByte(-908032899) == 1;
				int i_18_ = class536_sub33.read24BitUnsignedInteger(1832238836);
				Class536 class536;
				if (bool)
					class536 = new Class536_Sub13(class536_sub33.readString());
				else
					class536 = new Class536_Sub26(class536_sub33.readInt());
				aClass4_11331.method560(class536, (long) i_18_);
			}
		}
	}

	public void method75(byte i) {
		/* empty */
	}

	public void method56(int i) {
		/* empty */
	}

	public int method10487(int i, int i_19_) {
		if (null == aClass4_11331)
			return i_19_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_11331.method556((long) i);
		if (null == class536_sub26)
			return i_19_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public String method10488(int i, String string) {
		if (null == aClass4_11331)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_11331.method556((long) i);
		if (null == class536_sub13)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	public String method10489(int i, String string) {
		if (null == aClass4_11331)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_11331.method556((long) i);
		if (null == class536_sub13)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	static final void method10490(Class668 class668, int i) {
		Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class668.aClass649_Sub1_Sub5_Sub1_8554);
		String string = class649_sub1_sub5_sub1_sub1.aString12162;
		Class296 class296 = class649_sub1_sub5_sub1_sub1.aClass296_12174;
		if (null != class296.anIntArray3304) {
			class296 = class296.method3984(Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, (byte) -14);
			if (class296 == null)
				string = "";
			else
				string = class296.aString3271;
		}
		if (string == null)
			string = "";
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
	}

	public static void method10491(int i, int i_20_, String string, String string_21_, String string_22_, String string_23_, String string_24_, int i_25_, Class402 class402, int i_26_) {
		Class279 class279 = (Class279) Class262.aMap2848.get(Integer.valueOf(i));
		if (class279 == null) {
			class279 = new Class279();
			Class262.aMap2848.put(Integer.valueOf(i), class279);
		}
		Class536_Sub18_Sub12 class536_sub18_sub12 = class279.method3755(i, i_20_, string, string_21_, string_22_, string_23_, string_24_, i_25_, class402, 2063373304);
		Class262.aClass4_2847.method560(class536_sub18_sub12, (long) (class536_sub18_sub12.anInt11728 * 698041493));
		Class262.aClass700_2846.method8239(class536_sub18_sub12, (byte) 50);
		client.anInt11162 = -1094042733 * client.anInt11215;
	}
}
