/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Arrays;

public class ItemDefinitions implements DefinitionI {
	static String aString9;
	int anInt11;
	public static short[] aShortArray14 = new short[256];
	Interface12 anInterface12_15;
	Class16 aClass16_16;
	public int anInt17;
	public int anInt18 = -975650179;
	int anInt19;
	int anInt20;
	String aString21;
	short[] aShortArray22;
	int anInt23;
	public String[] aStringArray24;
	short[] aShortArray25;
	byte[] aByteArray26;
	byte[] aByteArray27;
	short[] aShortArray28;
	public int anInt29;
	public int anInt30;
	public int anInt31;
	public int anInt32;
	public int anInt33;
	public int anInt34;
	public int anInt35;
	public int anInt36;
	public boolean aBool37;
	public String[] aStringArray38;
	int anInt39;
	public int anInt40;
	int[] anIntArray41;
	public int anInt42;
	public int anInt43;
	public String aString44 = "null";
	int anInt45;
	int anInt46;
	public int anInt47 = -60909040;
	int anInt48;
	public boolean aBool49;
	public int anInt50;
	int anInt51;
	int anInt52;
	int anInt53;
	public int anInt54 = 0;
	int anInt55;
	int anInt56;
	int anInt57;
	int anInt58;
	int anInt59;
	int anInt60;
	int[] anIntArray61;
	int[] anIntArray62;
	public int anInt63;
	public int anInt64;
	int anInt65;
	int anInt66;
	public int anInt67;
	int anInt69;
	public int anInt70;
	int anInt71;
	int anInt72;
	int anInt73;
	int anInt74;
	short[] aShortArray75;
	public int anInt76;
	public boolean aBool77;
	public int anInt78;
	Class4 aClass4_79;
	public int[] anIntArray80;
	public int anInt81;
	int anInt82;
	public int anInt83;
	public boolean aBool84;
	int[] anIntArray85;
	byte[] aByteArray87;

	void method497(ItemDefinitions class1_0_, ItemDefinitions class1_1_, Class664 class664, int i) {
		method499(Class13.aClass13_158, class1_0_, class1_1_, Class38.aClass38_312, class664, (byte) 75);
	}

	public void method75(byte i) {
		if (anInt63 * 79208069 != -1)
			method500((ItemDefinitions) anInterface12_15.method70(anInt63 * 79208069, (byte) 52), (ItemDefinitions) anInterface12_15.method70(1990739153 * anInt29, (byte) -27), aClass16_16.aClass664_176, -113470931);
		else if (-1494720165 * anInt17 != -1)
			method497((ItemDefinitions) anInterface12_15.method70(anInt17 * -1494720165, (byte) -77), (ItemDefinitions) anInterface12_15.method70(515259213 * anInt65, (byte) -112), aClass16_16.aClass664_176, -2018787355);
		else if (-1 != anInt83 * -377039411)
			method501((ItemDefinitions) anInterface12_15.method70(anInt83 * -377039411, (byte) 32), (ItemDefinitions) anInterface12_15.method70(1859340953 * anInt23, (byte) 14), aClass16_16.aClass664_176, (byte) -107);
		else if (-1 != 208949951 * anInt64)
			method502((ItemDefinitions) anInterface12_15.method70(208949951 * anInt64, (byte) -41), (ItemDefinitions) anInterface12_15.method70(anInt67 * 989214201, (byte) 38), aClass16_16.aClass664_176, (byte) -39);
		if (!aClass16_16.aBool174 && aBool37) {
			anInt76 = 0;
			aStringArray38 = aClass16_16.aStringArray182;
			aStringArray24 = aClass16_16.aStringArray183;
			aBool77 = false;
			anIntArray80 = null;
			if (null != aClass4_79) {
				boolean bool = false;
				for (Class536 class536 = aClass4_79.method562(-1886721107); class536 != null; class536 = aClass4_79.method567(785392296)) {
					Class73 class73 = (Class73) (aClass16_16.anInterface12_180.method70((int) (-6909195213925454795L * class536.aLong7133), (byte) -66));
					if (class73.aBool802)
						class536.method6484(1169878739);
					else
						bool = true;
				}
				if (!bool)
					aClass4_79 = null;
			}
		}
	}

	void method499(Class13 class13, ItemDefinitions class1_2_, ItemDefinitions class1_3_, Class38 class38, Class664 class664, byte i) {
		anInt19 = class1_2_.anInt19 * 1;
		anInt47 = class1_2_.anInt47 * 1;
		anInt54 = class1_2_.anInt54 * 1;
		anInt30 = 1 * class1_2_.anInt30;
		anInt31 = class1_2_.anInt31 * 1;
		anInt32 = 1 * class1_2_.anInt32;
		anInt33 = 1 * class1_2_.anInt33;
		ItemDefinitions class1_4_ = Class13.aClass13_157 == class13 ? class1_2_ : class1_3_;
		aShortArray28 = class1_4_.aShortArray28;
		aShortArray22 = class1_4_.aShortArray22;
		aByteArray87 = class1_4_.aByteArray87;
		aShortArray75 = class1_4_.aShortArray75;
		aShortArray25 = class1_4_.aShortArray25;
		aString44 = class1_3_.aString44;
		aBool37 = class1_3_.aBool37;
		if (Class13.aClass13_157 == class13) {
			anInt36 = 1 * class1_3_.anInt36;
			anInt34 = -201081757;
		} else if (Class13.aClass13_160 == class13) {
			aString44 = class1_3_.aString21;
			anInt36 = (int) Math.floor((double) (-680425497 * class1_3_.anInt36 / (class1_3_.anInt50 * -682434919))) * 384998359;
			anInt34 = -201081757;
			aBool77 = class1_3_.aBool77;
			anInt18 = 1 * class1_2_.anInt18;
			anIntArray85 = class1_2_.anIntArray85;
			anIntArray41 = class1_2_.anIntArray41;
			aStringArray24 = new String[5];
			aStringArray24[0] = Class38.aClass38_316.method840(class664, 1854381950);
			aStringArray24[4] = class38.method840(class664, 1833967988);
		} else {
			anInt36 = 0;
			anInt34 = class1_3_.anInt34 * 1;
			anInt42 = class1_3_.anInt42 * 1;
			anInt43 = class1_3_.anInt43 * 1;
			anInt70 = 1 * class1_3_.anInt70;
			anInt45 = 1 * class1_3_.anInt45;
			anInt46 = 1 * class1_3_.anInt46;
			anInt66 = 1 * class1_3_.anInt66;
			anInt11 = class1_3_.anInt11 * 1;
			anInt48 = 1 * class1_3_.anInt48;
			anInt20 = class1_3_.anInt20 * 1;
			anInt51 = 1 * class1_3_.anInt51;
			anInt52 = class1_3_.anInt52 * 1;
			anInt53 = 1 * class1_3_.anInt53;
			anInt56 = class1_3_.anInt56 * 1;
			anInt55 = class1_3_.anInt55 * 1;
			anInt69 = 1 * class1_3_.anInt69;
			anInt57 = 1 * class1_3_.anInt57;
			anInt58 = 1 * class1_3_.anInt58;
			anInt59 = class1_3_.anInt59 * 1;
			anInt82 = 1 * class1_3_.anInt82;
			anInt18 = 1 * class1_3_.anInt18;
			anInt76 = 1 * class1_3_.anInt76;
			aStringArray38 = class1_3_.aStringArray38;
			aClass4_79 = class1_3_.aClass4_79;
			aStringArray24 = new String[5];
			if (class1_3_.aStringArray24 != null) {
				for (int i_5_ = 0; i_5_ < 4; i_5_++)
					aStringArray24[i_5_] = class1_3_.aStringArray24[i_5_];
			}
			aStringArray24[4] = class38.method840(class664, 1674609059);
		}
	}

	void method500(ItemDefinitions class1_6_, ItemDefinitions class1_7_, Class664 class664, int i) {
		method499(Class13.aClass13_157, class1_6_, class1_7_, null, class664, (byte) 125);
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			decode(class536_sub33, i);
		}
	}

	void method501(ItemDefinitions class1_8_, ItemDefinitions class1_9_, Class664 class664, byte i) {
		method499(Class13.aClass13_159, class1_8_, class1_9_, Class38.aClass38_306, class664, (byte) 126);
	}

	void method502(ItemDefinitions class1_10_, ItemDefinitions class1_11_, Class664 class664, byte i) {
		method499(Class13.aClass13_160, class1_10_, class1_11_, Class38.aClass38_318, class664, (byte) 126);
	}

	public final Class177 method503(Class167 class167, int i, int i_12_, Class617 class617, Class688 class688, int i_13_, int i_14_, int i_15_, int i_16_, byte i_17_) {
		if (anIntArray61 != null && i_12_ > 1) {
			int i_18_ = -1;
			for (int i_19_ = 0; i_19_ < 10; i_19_++) {
				if (i_12_ >= anIntArray62[i_19_] && 0 != anIntArray62[i_19_])
					i_18_ = anIntArray61[i_19_];
			}
			if (-1 != i_18_)
				return (((ItemDefinitions) anInterface12_15.method70(i_18_, (byte) -38)).method503(class167, i, 1, class617, class688, i_13_, i_14_, i_15_, i_16_, (byte) -12));
		}
		int i_20_ = i;
		if (class688 != null)
			i_20_ |= class688.method8162((byte) 39);
		Class177 class177;
		synchronized (aClass16_16.aClass199_177) {
			class177 = ((Class177) (aClass16_16.aClass199_177.method2886((long) (anInt39 * 729344115 | 1526643673 * class167.anInt1850 << 29))));
		}
		if (null == class177 || class167.method2308(class177.method2466(), i_20_) != 0) {
			if (class177 != null)
				i_20_ = class167.method2068(i_20_, class177.method2466());
			int i_21_ = i_20_;
			if (aShortArray75 != null)
				i_21_ |= 0x8000;
			if (null != aShortArray28 || class617 != null)
				i_21_ |= 0x4000;
			if (128 != anInt71 * -268256853)
				i_21_ |= 0x1;
			if (anInt72 * 1833389311 != 128)
				i_21_ |= 0x2;
			if (anInt73 * 622326303 != 128)
				i_21_ |= 0x4;
			Class180 class180 = Class180.method2708(aClass16_16.aClass461_175, -603352859 * anInt19, 0);
			if (null == class180)
				return null;
			if (class180.anInt1949 < 13)
				class180.method2707(2);
			class177 = class167.method2093(class180, i_21_, aClass16_16.anInt181 * -1879025117, -2092145097 * anInt60 + 64, anInt74 * -573721669 + 850);
			if (anInt71 * -268256853 != 128 || 1833389311 * anInt72 != 128 || 128 != anInt73 * 622326303)
				class177.method2474(-268256853 * anInt71, anInt72 * 1833389311, anInt73 * 622326303);
			if (aShortArray28 != null) {
				for (int i_22_ = 0; i_22_ < aShortArray28.length; i_22_++) {
					if (aByteArray87 != null && i_22_ < aByteArray87.length)
						class177.method2507(aShortArray28[i_22_], (aShortArray14[aByteArray87[i_22_] & 0xff]));
					else
						class177.method2507(aShortArray28[i_22_], aShortArray22[i_22_]);
				}
			}
			if (aShortArray75 != null) {
				for (int i_23_ = 0; i_23_ < aShortArray75.length; i_23_++)
					class177.method2509(aShortArray75[i_23_], aShortArray25[i_23_]);
			}
			if (class617 != null) {
				for (int i_24_ = 0; i_24_ < 10; i_24_++) {
					for (int i_25_ = 0; i_25_ < Class500.aShortArrayArray6844[i_24_].length; i_25_++) {
						if (class617.anIntArray8072[i_24_] < (Class267.aShortArrayArrayArray2870[i_24_][i_25_]).length)
							class177.method2507(Class500.aShortArrayArray6844[i_24_][i_25_], (Class267.aShortArrayArrayArray2870[i_24_][i_25_][class617.anIntArray8072[i_24_]]));
					}
				}
				for (int i_26_ = 0; i_26_ < 10; i_26_++) {
					for (int i_27_ = 0; (i_27_ < Class710_Sub4.aShortArrayArray10822[i_26_].length); i_27_++) {
						if (class617.anIntArray8075[i_26_] < (Class44.aShortArrayArrayArray520[i_26_][i_27_]).length)
							class177.method2509((Class710_Sub4.aShortArrayArray10822[i_26_][i_27_]), (Class44.aShortArrayArrayArray520[i_26_][i_27_][(class617.anIntArray8075[i_26_])]));
					}
				}
			}
			class177.method2465(i_20_);
			synchronized (aClass16_16.aClass199_177) {
				aClass16_16.aClass199_177.method2881(class177, (long) (729344115 * anInt39 | class167.anInt1850 * 1526643673 << 29));
			}
		}
		if (class688 != null || i_16_ != 0) {
			class177 = class177.method2623((byte) 1, i_20_, true);
			if (class688 != null)
				class688.method8132(class177, 0, -962281013);
			if (i_16_ != 0)
				class177.method2510(i_13_, i_14_, i_15_, i_16_);
		}
		class177.method2465(i);
		return class177;
	}

	public ItemDefinitions method504(int i, int i_28_) {
		if (null != anIntArray61 && i > 1) {
			int i_29_ = -1;
			for (int i_30_ = 0; i_30_ < 10; i_30_++) {
				if (i >= anIntArray62[i_30_] && anIntArray62[i_30_] != 0)
					i_29_ = anIntArray61[i_30_];
			}
			if (i_29_ != -1)
				return (ItemDefinitions) anInterface12_15.method70(i_29_, (byte) -6);
		}
		return this;
	}

	int[] method506(int[] is, int i, int i_53_) {
		int[] is_54_ = new int[1152];
		int i_55_ = 0;
		for (int i_56_ = 0; i_56_ < 32; i_56_++) {
			for (int i_57_ = 0; i_57_ < 36; i_57_++) {
				int i_58_ = is[i_55_];
				if (i_58_ == 0) {
					if (i_57_ > 0 && is[i_55_ - 1] != 0)
						i_58_ = i;
					else if (i_56_ > 0 && 0 != is[i_55_ - 36])
						i_58_ = i;
					else if (i_57_ < 35 && 0 != is[1 + i_55_])
						i_58_ = i;
					else if (i_56_ < 31 && 0 != is[i_55_ + 36])
						i_58_ = i;
				}
				is_54_[i_55_++] = i_58_;
			}
		}
		return is_54_;
	}

	void method507(int[] is, int i, byte i_59_) {
		for (int i_60_ = 31; i_60_ > 0; i_60_--) {
			int i_61_ = i_60_ * 36;
			for (int i_62_ = 35; i_62_ > 0; i_62_--) {
				if (is[i_61_ + i_62_] == 0 && 0 != is[i_61_ + i_62_ - 1 - 36])
					is[i_62_ + i_61_] = i;
			}
		}
	}

	public int method508(int i, int i_63_) {
		if (anIntArray41 == null)
			return -1;
		return anIntArray41[i];
	}

	public final Class180 method509(boolean bool, Class12 class12, int i) {
		int i_64_;
		int i_65_;
		int i_66_;
		if (bool) {
			if (class12 != null && class12.anIntArray152 != null) {
				i_64_ = class12.anIntArray152[0];
				i_65_ = class12.anIntArray152[1];
				i_66_ = class12.anIntArray152[2];
			} else {
				i_64_ = -324829393 * anInt11;
				i_65_ = -490119801 * anInt48;
				i_66_ = 835049345 * anInt20;
			}
		} else if (null != class12 && null != class12.anIntArray149) {
			i_64_ = class12.anIntArray149[0];
			i_65_ = class12.anIntArray149[1];
			i_66_ = class12.anIntArray149[2];
		} else {
			i_64_ = anInt45 * -64038767;
			i_65_ = 661594531 * anInt46;
			i_66_ = 1280785913 * anInt66;
		}
		if (-1 == i_64_)
			return null;
		Class180 class180 = Class180.method2708(aClass16_16.aClass461_175, i_64_, 0);
		if (null == class180)
			return null;
		if (class180.anInt1949 < 13)
			class180.method2707(2);
		if (-1 != i_65_) {
			Class180 class180_67_ = Class180.method2708(aClass16_16.aClass461_175, i_65_, 0);
			if (class180_67_.anInt1949 < 13)
				class180_67_.method2707(2);
			if (-1 != i_66_) {
				Class180 class180_68_ = Class180.method2708(aClass16_16.aClass461_175, i_66_, 0);
				if (class180_68_.anInt1949 < 13)
					class180_68_.method2707(2);
				Class180[] class180s = { class180, class180_67_, class180_68_ };
				class180 = new Class180(class180s, 3);
			} else {
				Class180[] class180s = { class180, class180_67_ };
				class180 = new Class180(class180s, 2);
			}
		}
		if (!bool && (0 != 918907781 * anInt51 || 0 != anInt53 * -1489063167 || -1529289737 * anInt55 != 0))
			class180.method2705(918907781 * anInt51, anInt53 * -1489063167, -1529289737 * anInt55);
		if (bool && (anInt52 * 2036233391 != 0 || 360451697 * anInt56 != 0 || 0 != -896441729 * anInt69))
			class180.method2705(2036233391 * anInt52, 360451697 * anInt56, -896441729 * anInt69);
		if (null != aShortArray28) {
			short[] is;
			if (null != class12 && class12.aShortArray155 != null)
				is = class12.aShortArray155;
			else
				is = aShortArray22;
			for (int i_69_ = 0; i_69_ < aShortArray28.length; i_69_++)
				class180.method2703(aShortArray28[i_69_], is[i_69_]);
		}
		if (null != aShortArray75) {
			short[] is;
			if (class12 != null && null != class12.aShortArray156)
				is = class12.aShortArray156;
			else
				is = aShortArray25;
			for (int i_70_ = 0; i_70_ < aShortArray75.length; i_70_++)
				class180.method2704(aShortArray75[i_70_], is[i_70_]);
		}
		return class180;
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_71_ = class536_sub33.readUnsignedByte();
			if (i_71_ == 0)
				break;
			decode(class536_sub33, i_71_);
		}
	}

	public int method510(int i, int i_72_, byte i_73_) {
		if (aClass4_79 == null)
			return i_72_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_79.method556((long) i);
		if (null == class536_sub26)
			return i_72_;
		return class536_sub26.anInt10533 * 2083602213;
	}

	public int method511(int i, int i_74_) {
		if (null == anIntArray85)
			return -1;
		return anIntArray85[i];
	}

	static {
		aString9 = "</col>";
	}

	public String method512(int i, String string, int i_75_) {
		if (null == aClass4_79)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_79.method556((long) i);
		if (class536_sub13 == null)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	public void method77() {
		if (anInt63 * 79208069 != -1)
			method500((ItemDefinitions) anInterface12_15.method70(anInt63 * 79208069, (byte) -40), (ItemDefinitions) anInterface12_15.method70(1990739153 * anInt29, (byte) -72), aClass16_16.aClass664_176, -1247668190);
		else if (-1494720165 * anInt17 != -1)
			method497((ItemDefinitions) anInterface12_15.method70(anInt17 * -1494720165, (byte) -19), (ItemDefinitions) anInterface12_15.method70(515259213 * anInt65, (byte) 10), aClass16_16.aClass664_176, -24657178);
		else if (-1 != anInt83 * -377039411)
			method501((ItemDefinitions) anInterface12_15.method70(anInt83 * -377039411, (byte) -65), (ItemDefinitions) anInterface12_15.method70(1859340953 * anInt23, (byte) 75), aClass16_16.aClass664_176, (byte) -106);
		else if (-1 != 208949951 * anInt64)
			method502((ItemDefinitions) anInterface12_15.method70(208949951 * anInt64, (byte) 35), (ItemDefinitions) anInterface12_15.method70(anInt67 * 989214201, (byte) -34), aClass16_16.aClass664_176, (byte) -110);
		if (!aClass16_16.aBool174 && aBool37) {
			anInt76 = 0;
			aStringArray38 = aClass16_16.aStringArray182;
			aStringArray24 = aClass16_16.aStringArray183;
			aBool77 = false;
			anIntArray80 = null;
			if (null != aClass4_79) {
				boolean bool = false;
				for (Class536 class536 = aClass4_79.method562(-1551289147); class536 != null; class536 = aClass4_79.method567(-335423598)) {
					Class73 class73 = (Class73) (aClass16_16.anInterface12_180.method70((int) (-6909195213925454795L * class536.aLong7133), (byte) -82));
					if (class73.aBool802)
						class536.method6484(-1437571573);
					else
						bool = true;
				}
				if (!bool)
					aClass4_79 = null;
			}
		}
	}

	ItemDefinitions(int i, Interface12 interface12, Class16 class16) {
		anInt30 = 0;
		anInt31 = 0;
		anInt32 = 0;
		anInt33 = 0;
		anInt34 = 0;
		anInt35 = 415875853;
		anInt36 = 384998359;
		aBool37 = false;
		anInt42 = -507874001;
		anInt43 = -132064527;
		anInt70 = -1533255093;
		anInt45 = 1449138063;
		anInt46 = -988092939;
		anInt11 = -1012148175;
		anInt48 = 1638541257;
		anInt66 = -268366921;
		anInt20 = -1019373697;
		anInt51 = 0;
		anInt52 = 0;
		anInt53 = 0;
		anInt56 = 0;
		anInt55 = 0;
		anInt69 = 0;
		anInt57 = -495777045;
		anInt58 = 613914743;
		anInt59 = -174858125;
		anInt82 = -1501092231;
		anInt63 = -379890253;
		anInt29 = 1973251023;
		anInt65 = 191007355;
		anInt17 = 1526667565;
		anInt67 = -743865417;
		anInt64 = 1107288769;
		aString21 = "null";
		anInt50 = 0;
		anInt71 = 1362919808;
		anInt72 = 1205436288;
		anInt73 = -1618677888;
		anInt60 = 0;
		anInt74 = 0;
		anInt76 = 0;
		aBool77 = false;
		anInt78 = 0;
		anInt81 = 0;
		anInt23 = -170092969;
		anInt83 = -1415716613;
		aBool84 = false;
		aBool49 = false;
		anInt39 = -797967173 * i;
		anInterface12_15 = interface12;
		aClass16_16 = class16;
		aStringArray38 = (String[]) aClass16_16.aStringArray182.clone();
		aStringArray24 = (String[]) aClass16_16.aStringArray183.clone();
	}

	int[] method513(Class167 class167, Class167 class167_76_, int i, int i_77_, int i_78_, boolean bool, int i_79_, Class184 class184, Class617 class617, Class628 class628, int i_80_) {
		Class180 class180 = Class180.method2708(aClass16_16.aClass461_175, anInt19 * -603352859, 0);
		if (class180 == null)
			return null;
		if (class180.anInt1949 < 13)
			class180.method2707(2);
		if (aShortArray28 != null) {
			for (int i_81_ = 0; i_81_ < aShortArray28.length; i_81_++) {
				if (aByteArray87 != null && i_81_ < aByteArray87.length)
					class180.method2703(aShortArray28[i_81_], (aShortArray14[aByteArray87[i_81_] & 0xff]));
				else
					class180.method2703(aShortArray28[i_81_], aShortArray22[i_81_]);
			}
		}
		if (null != aShortArray75) {
			for (int i_82_ = 0; i_82_ < aShortArray75.length; i_82_++)
				class180.method2704(aShortArray75[i_82_], aShortArray25[i_82_]);
		}
		if (class617 != null) {
			for (int i_83_ = 0; i_83_ < 10; i_83_++) {
				for (int i_84_ = 0; i_84_ < Class500.aShortArrayArray6844[i_83_].length; i_84_++) {
					if (class617.anIntArray8072[i_83_] < (Class267.aShortArrayArrayArray2870[i_83_][i_84_]).length)
						class180.method2703((Class500.aShortArrayArray6844[i_83_][i_84_]), (Class267.aShortArrayArrayArray2870[i_83_][i_84_][(class617.anIntArray8072[i_83_])]));
				}
			}
			for (int i_85_ = 0; i_85_ < 10; i_85_++) {
				for (int i_86_ = 0; i_86_ < Class710_Sub4.aShortArrayArray10822[i_85_].length; i_86_++) {
					if (class617.anIntArray8075[i_85_] < (Class44.aShortArrayArrayArray520[i_85_][i_86_]).length)
						class180.method2704(Class710_Sub4.aShortArrayArray10822[i_85_][i_86_], (Class44.aShortArrayArrayArray520[i_85_][i_86_][class617.anIntArray8075[i_85_]]));
				}
			}
		}
		int i_87_ = 2048;
		boolean bool_88_ = false;
		if (-268256853 * anInt71 != 128 || 128 != anInt72 * 1833389311 || 128 != anInt73 * 622326303) {
			bool_88_ = true;
			i_87_ |= 0x7;
		}
		Class177 class177 = class167.method2093(class180, i_87_, 64, 64 + anInt60 * -2092145097, -573721669 * anInt74 + 768);
		if (!class177.method2480())
			return null;
		if (bool_88_)
			class177.method2474(anInt71 * -268256853, 1833389311 * anInt72, 622326303 * anInt73);
		Class143 class143 = null;
		if (-1 != anInt63 * 79208069) {
			class143 = aClass16_16.method646(class167, class167_76_, 1990739153 * anInt29, 10, 1, 0, true, true, 0, class184, class617, class628, anInterface12_15, -889560749);
			if (null == class143)
				return null;
		} else if (-1 != -1494720165 * anInt17) {
			class143 = aClass16_16.method646(class167, class167_76_, 515259213 * anInt65, i, i_77_, i_78_, false, true, 0, class184, class617, class628, anInterface12_15, 1133511832);
			if (null == class143)
				return null;
		} else if (-1 != anInt83 * -377039411) {
			class143 = aClass16_16.method646(class167, class167_76_, anInt23 * 1859340953, i, i_77_, i_78_, false, true, 0, class184, class617, class628, anInterface12_15, 284352773);
			if (null == class143)
				return null;
		} else if (anInt64 * 208949951 != -1) {
			class143 = aClass16_16.method646(class167, class167_76_, 989214201 * anInt67, 10, 1, 0, true, true, 0, class184, class617, class628, anInterface12_15, -2107081638);
			if (null == class143)
				return null;
		}
		int i_89_;
		if (bool)
			i_89_ = (int) ((double) (anInt47 * -1906278051) * 1.5) << 2;
		else if (i_77_ == 2)
			i_89_ = (int) ((double) (-1906278051 * anInt47) * 1.04) << 2;
		else
			i_89_ = anInt47 * -1906278051 << 2;
		Class443 class443 = class167.method2103();
		Class443 class443_90_ = class167.method2391();
		class443_90_.method5350(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class167.method2278((byte) 82).method2725(), (float) class167.method2278((byte) -67).method2726());
		class167.method2390(class443_90_);
		class167.method2048(0, 0, class167.method2278((byte) 18).method2725(), class167.method2278((byte) -12).method2726());
		Class433 class433 = new Class433();
		class167.method2099(class433);
		class167.method2006(0.95F + (float) (Math.random() / 10.0));
		class167.method2105(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class433 class433_91_ = class167.method2091();
		class433_91_.method5206(0.0F, 0.0F, 1.0F, Class447.method5400(-(anInt31 * -751322115) << 3));
		class433_91_.method5214(0.0F, 1.0F, 0.0F, Class447.method5400(anInt30 * 824706077 << 3));
		class433_91_.method5200((float) (anInt32 * 814524581 << 2), (float) (((Class447.anIntArray4906[211736907 * anInt54 << 3]) * i_89_ >> 14) - class177.method2562() / 2 + (-1832345149 * anInt33 << 2)), (float) ((anInt33 * -1832345149 << 2) + (((Class447.anIntArray4921[211736907 * anInt54 << 3]) * i_89_) >> 14)));
		class433_91_.method5214(1.0F, 0.0F, 0.0F, Class447.method5400(anInt54 * 211736907 << 3));
		class167.method2369(0, 0, 36, 32);
		class167.method2000(2, 0);
		class167.method2063(0, 0, 36, 32, 0, 0);
		class167.method2107(0, -1, 0);
		class177.method2490(class433_91_, null, 1);
		class167.method2390(class443);
		int[] is = class167.method2078(0, 0, 36, 32);
		if (i_77_ >= 1) {
			is = method506(is, -16777214, -1371650055);
			if (i_77_ >= 2)
				is = method506(is, -1, -330011200);
		}
		if (i_78_ != 0)
			method507(is, i_78_, (byte) 5);
		if (-1 != anInt17 * -1494720165)
			class143.method1728(0, 0);
		else if (-1 != anInt83 * -377039411)
			class143.method1728(0, 0);
		class167.method2081(is, 0, 36, 36, 32, (byte) -98).method1728(0, 0);
		if (anInt63 * 79208069 != -1)
			class143.method1728(0, 0);
		if (208949951 * anInt64 != -1)
			class143.method1728(0, 0);
		if (i_79_ == 1 || i_79_ == 2 && (anInt34 * -1370184373 == 1 || i != 1) && i != -1)
			class184.method2763(Class60.method998(i, aClass16_16.aClass664_176, class628, -1735265180), 0, 9, -256, -16777215, (byte) -96);
		is = class167.method2078(0, 0, 36, 32);
		for (int i_92_ = 0; i_92_ < is.length; i_92_++) {
			if (0 == (is[i_92_] & 0xffffff))
				is[i_92_] = 0;
			else
				is[i_92_] |= ~0xffffff;
		}
		return is;
	}

	public final boolean method514(boolean bool, Class12 class12, int i) {
		int i_93_;
		int i_94_;
		if (bool) {
			if (class12 != null && null != class12.anIntArray154) {
				i_93_ = class12.anIntArray154[0];
				i_94_ = class12.anIntArray154[1];
			} else {
				i_93_ = 1399733061 * anInt59;
				i_94_ = 1550687287 * anInt82;
			}
		} else if (null != class12 && null != class12.anIntArray153) {
			i_93_ = class12.anIntArray153[0];
			i_94_ = class12.anIntArray153[1];
		} else {
			i_93_ = anInt57 * -1724009923;
			i_94_ = anInt58 * -869646663;
		}
		if (-1 == i_93_)
			return true;
		boolean bool_95_ = true;
		if (!aClass16_16.aClass461_175.method5558(i_93_, 0, 367375023))
			bool_95_ = false;
		if (-1 != i_94_ && !aClass16_16.aClass461_175.method5558(i_94_, 0, 1390793256))
			bool_95_ = false;
		return bool_95_;
	}

	public final boolean method515(boolean bool, Class12 class12, int i) {
		int i_96_;
		int i_97_;
		int i_98_;
		if (bool) {
			if (class12 != null && class12.anIntArray152 != null) {
				i_96_ = class12.anIntArray152[0];
				i_97_ = class12.anIntArray152[1];
				i_98_ = class12.anIntArray152[2];
			} else {
				i_96_ = -324829393 * anInt11;
				i_97_ = -490119801 * anInt48;
				i_98_ = anInt20 * 835049345;
			}
		} else if (null != class12 && class12.anIntArray149 != null) {
			i_96_ = class12.anIntArray149[0];
			i_97_ = class12.anIntArray149[1];
			i_98_ = class12.anIntArray149[2];
		} else {
			i_96_ = anInt45 * -64038767;
			i_97_ = 661594531 * anInt46;
			i_98_ = 1280785913 * anInt66;
		}
		if (i_96_ == -1)
			return true;
		boolean bool_99_ = true;
		if (!aClass16_16.aClass461_175.method5558(i_96_, 0, -944398882))
			bool_99_ = false;
		if (i_97_ != -1 && !aClass16_16.aClass461_175.method5558(i_97_, 0, 413776572))
			bool_99_ = false;
		if (i_98_ != -1 && !aClass16_16.aClass461_175.method5558(i_98_, 0, -1005164162))
			bool_99_ = false;
		return bool_99_;
	}

	public final Class180 method517(boolean bool, Class12 class12, byte i) {
		int i_122_;
		int i_123_;
		if (bool) {
			if (null != class12 && class12.anIntArray154 != null) {
				i_122_ = class12.anIntArray154[0];
				i_123_ = class12.anIntArray154[1];
			} else {
				i_122_ = anInt59 * 1399733061;
				i_123_ = anInt82 * 1550687287;
			}
		} else if (null != class12 && null != class12.anIntArray153) {
			i_122_ = class12.anIntArray153[0];
			i_123_ = class12.anIntArray153[1];
		} else {
			i_122_ = anInt57 * -1724009923;
			i_123_ = -869646663 * anInt58;
		}
		if (-1 == i_122_)
			return null;
		Class180 class180 = Class180.method2708(aClass16_16.aClass461_175, i_122_, 0);
		if (class180.anInt1949 < 13)
			class180.method2707(2);
		if (i_123_ != -1) {
			Class180 class180_124_ = Class180.method2708(aClass16_16.aClass461_175, i_123_, 0);
			if (class180_124_.anInt1949 < 13)
				class180_124_.method2707(2);
			Class180[] class180s = { class180, class180_124_ };
			class180 = new Class180(class180s, 2);
		}
		if (null != aShortArray28) {
			short[] is;
			if (class12 != null && null != class12.aShortArray155)
				is = class12.aShortArray155;
			else
				is = aShortArray22;
			for (int i_125_ = 0; i_125_ < aShortArray28.length; i_125_++)
				class180.method2703(aShortArray28[i_125_], is[i_125_]);
		}
		if (aShortArray75 != null) {
			short[] is;
			if (null != class12 && class12.aShortArray156 != null)
				is = class12.aShortArray156;
			else
				is = aShortArray25;
			for (int i_126_ = 0; i_126_ < aShortArray75.length; i_126_++)
				class180.method2704(aShortArray75[i_126_], is[i_126_]);
		}
		return class180;
	}

	void decode(RSByteBuffer buffer, int opcode) {
		if (1 == opcode)
			anInt19 = buffer.readBigSmart() * -1192252179;
		else if (opcode == 2)
			aString44 = buffer.readString();
		else if (4 == opcode)
			anInt47 = buffer.readUnsignedShort() * 246930165;
		else if (5 == opcode)
			anInt54 = buffer.readUnsignedShort() * -1959597981;
		else if (6 == opcode)
			anInt30 = buffer.readUnsignedShort() * 1725881909;
		else if (opcode == 7) {
			anInt32 = buffer.readUnsignedShort() * -1039990995;
			if (814524581 * anInt32 > 32767)
				anInt32 -= -13828096;
		} else if (opcode == 8) {
			anInt33 = buffer.readUnsignedShort() * 584341227;
			if (anInt33 * -1832345149 > 32767)
				anInt33 -= 1458241536;
		} else if (opcode == 11)
			anInt34 = -201081757;
		else if (12 == opcode)
			anInt36 = buffer.readInt() * 384998359;
		else if (opcode == 13)
			anInt42 = buffer.readUnsignedByte() * 507874001;
		else if (opcode == 14)
			anInt43 = buffer.readUnsignedByte() * 132064527;
		else if (16 == opcode)
			aBool37 = true;
		else if (opcode == 18)
			anInt35 = buffer.readUnsignedShort() * -415875853;
		else if (23 == opcode)
			anInt45 = buffer.readBigSmart() * -1449138063;
		else if (24 == opcode)
			anInt46 = buffer.readBigSmart() * 988092939;
		else if (opcode == 25)
			anInt11 = buffer.readBigSmart() * 1012148175;
		else if (26 == opcode)
			anInt48 = buffer.readBigSmart() * -1638541257;
		else if (opcode == 27)
			anInt70 = buffer.readUnsignedByte() * 1533255093;
		else if (opcode >= 30 && opcode < 35)
			aStringArray38[opcode - 30] = buffer.readString();
		else if (opcode >= 35 && opcode < 40)
			aStringArray24[opcode - 35] = buffer.readString();
		else if (opcode == 40) {
			int i_128_ = buffer.readUnsignedByte();
			aShortArray28 = new short[i_128_];
			aShortArray22 = new short[i_128_];
			for (int i_129_ = 0; i_129_ < i_128_; i_129_++) {
				aShortArray28[i_129_] = (short) buffer.readUnsignedShort();
				aShortArray22[i_129_] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int i_130_ = buffer.readUnsignedByte();
			aShortArray75 = new short[i_130_];
			aShortArray25 = new short[i_130_];
			for (int i_131_ = 0; i_131_ < i_130_; i_131_++) {
				aShortArray75[i_131_] = (short) buffer.readUnsignedShort();
				aShortArray25[i_131_] = (short) buffer.readUnsignedShort();
			}
		} else if (42 == opcode) {
			int i_132_ = buffer.readUnsignedByte();
			aByteArray87 = new byte[i_132_];
			for (int i_133_ = 0; i_133_ < i_132_; i_133_++)
				aByteArray87[i_133_] = buffer.readByte();
		} else if (43 == opcode) {
			anInt40 = buffer.readInt() * -1485044269;
			aBool84 = true;
		} else if (44 == opcode) {
			int i_134_ = buffer.readUnsignedShort();
			int i_135_ = 0;
			for (int i_136_ = i_134_; i_136_ > 0; i_136_ >>= 1)
				i_135_++;
			aByteArray26 = new byte[i_135_];
			byte i_137_ = 0;
			for (int i_138_ = 0; i_138_ < i_135_; i_138_++) {
				if ((i_134_ & 1 << i_138_) > 0) {
					aByteArray26[i_138_] = i_137_;
					i_137_++;
				} else
					aByteArray26[i_138_] = (byte) -1;
			}
		} else if (opcode == 45) {
			int i_139_ = buffer.readUnsignedShort();
			int i_140_ = 0;
			for (int i_141_ = i_139_; i_141_ > 0; i_141_ >>= 1)
				i_140_++;
			aByteArray27 = new byte[i_140_];
			byte i_142_ = 0;
			for (int i_143_ = 0; i_143_ < i_140_; i_143_++) {
				if ((i_139_ & 1 << i_143_) > 0) {
					aByteArray27[i_143_] = i_142_;
					i_142_++;
				} else
					aByteArray27[i_143_] = (byte) -1;
			}
		} else if (65 == opcode)
			aBool77 = true;
		else if (opcode == 78)
			anInt66 = buffer.readBigSmart() * 268366921;
		else if (79 == opcode)
			anInt20 = buffer.readBigSmart() * 1019373697;
		else if (90 == opcode)
			anInt57 = buffer.readBigSmart() * 495777045;
		else if (opcode == 91)
			anInt59 = buffer.readBigSmart() * 174858125;
		else if (92 == opcode)
			anInt58 = buffer.readBigSmart() * -613914743;
		else if (93 == opcode)
			anInt82 = buffer.readBigSmart() * 1501092231;
		else if (94 == opcode)
			anInt18 = buffer.readUnsignedShort() * 975650179;
		else if (95 == opcode)
			anInt31 = buffer.readUnsignedShort() * 947157333;
		else if (96 == opcode)
			anInt78 = buffer.readUnsignedByte() * -1239015883;
		else if (opcode == 97)
			anInt29 = buffer.readUnsignedShort() * -1973251023;
		else if (opcode == 98)
			anInt63 = buffer.readUnsignedShort() * 379890253;
		else if (opcode >= 100 && opcode < 110) {
			if (anIntArray61 == null) {
				anIntArray61 = new int[10];
				anIntArray62 = new int[10];
			}
			anIntArray61[opcode - 100] = buffer.readUnsignedShort();
			anIntArray62[opcode - 100] = buffer.readUnsignedShort();
		} else if (110 == opcode)
			anInt71 = buffer.readUnsignedShort() * 950171907;
		else if (opcode == 111)
			anInt72 = buffer.readUnsignedShort() * 1888465663;
		else if (opcode == 112)
			anInt73 = buffer.readUnsignedShort() * 1564412383;
		else if (opcode == 113)
			anInt60 = buffer.readByte() * -1969344633;
		else if (opcode == 114)
			anInt74 = buffer.readByte() * -1313505473;
		else if (115 == opcode)
			anInt76 = buffer.readUnsignedByte() * 1227687221;
		else if (opcode == 121)
			anInt65 = buffer.readUnsignedShort() * -191007355;
		else if (122 == opcode)
			anInt17 = buffer.readUnsignedShort() * -1526667565;
		else if (opcode == 125) {
			anInt51 = (buffer.readByte() << 2) * -1655319219;
			anInt53 = (buffer.readByte() << 2) * -555070207;
			anInt55 = (buffer.readByte() << 2) * 1870056903;
		} else if (opcode == 126) {
			anInt52 = (buffer.readByte() << 2) * -1719573937;
			anInt56 = (buffer.readByte() << 2) * -454692207;
			anInt69 = (buffer.readByte() << 2) * -1830265473;
		} else if (127 == opcode || 128 == opcode || 129 == opcode || opcode == 130) {
			buffer.readUnsignedByte();
			buffer.readUnsignedShort();
		} else if (132 == opcode) {
			int i_144_ = buffer.readUnsignedByte();
			anIntArray80 = new int[i_144_];
			for (int i_145_ = 0; i_145_ < i_144_; i_145_++)
				anIntArray80[i_145_] = buffer.readUnsignedShort();
		} else if (134 == opcode)
			anInt81 = buffer.readUnsignedByte() * -1286735167;
		else if (opcode == 139)
			anInt23 = buffer.readUnsignedShort() * 170092969;
		else if (140 == opcode)
			anInt83 = buffer.readUnsignedShort() * 1415716613;
		else if (opcode >= 142 && opcode < 147) {
			if (anIntArray85 == null) {
				anIntArray85 = new int[6];
				Arrays.fill(anIntArray85, -1);
			}
			anIntArray85[opcode - 142] = buffer.readUnsignedShort();
		} else if (opcode >= 150 && opcode < 155) {
			if (null == anIntArray41) {
				anIntArray41 = new int[5];
				Arrays.fill(anIntArray41, -1);
			}
			anIntArray41[opcode - 150] = buffer.readUnsignedShort();
		} else if (156 != opcode) {
			if (157 == opcode)
				aBool49 = true;
			else if (161 == opcode)
				anInt67 = buffer.readUnsignedShort() * 743865417;
			else if (162 == opcode)
				anInt64 = buffer.readUnsignedShort() * -1107288769;
			else if (163 == opcode)
				anInt50 = buffer.readUnsignedShort() * 907842985;
			else if (opcode == 164)
				aString21 = buffer.readString();
			else if (opcode == 165)
				anInt34 = -402163514;
			else if (opcode == 249) {
				int i_146_ = buffer.readUnsignedByte();
				if (null == aClass4_79) {
					int i_147_ = Class528.method6434(i_146_, -1806816082);
					aClass4_79 = new Class4(i_147_);
				}
				for (int i_148_ = 0; i_148_ < i_146_; i_148_++) {
					boolean bool = buffer.readUnsignedByte() == 1;
					int i_149_ = buffer.read24BitUnsignedInteger();
					Class536 class536;
					if (bool)
						class536 = new Class536_Sub13(buffer.readString());
					else
						class536 = new Class536_Sub26(buffer.readInt());
					aClass4_79.method560(class536, (long) i_149_);
				}
			}
		}
	}

	static final void method523(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class94.method1292(class251, class234, class668, 1798516375);
	}

	static void method524(Class521_Sub5 class521_sub5, byte i) {
		class521_sub5.aClass649_Sub1_Sub5_Sub1_10355 = null;
		if (Class521_Sub5.anInt10353 * 1115812309 < 20) {
			Class521_Sub5.aClass695_10357.method8217(class521_sub5, -1875792180);
			Class521_Sub5.anInt10353 += -148652163;
		}
	}

	static final void method525(Class668 class668, byte i) {
		if (null != client.aString11005)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = client.aString11005;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}

	static Class536_Sub18_Sub14 method526(RSByteBuffer class536_sub33, int i, int i_150_) {
		Class536_Sub18_Sub14 class536_sub18_sub14 = new Class536_Sub18_Sub14(i, class536_sub33.readString(), class536_sub33.readString(), class536_sub33.readInt(), class536_sub33.readInt(), (class536_sub33.readUnsignedByte() == 1), class536_sub33.readUnsignedByte(), class536_sub33.readUnsignedByte());
		int i_151_ = class536_sub33.readUnsignedByte();
		for (int i_152_ = 0; i_152_ < i_151_; i_152_++)
			class536_sub18_sub14.aClass708_11768.method8335(new Class536_Sub32(class536_sub33.readUnsignedByte(), class536_sub33.readUnsignedShort(), class536_sub33.readUnsignedShort(), class536_sub33.readUnsignedShort(), class536_sub33.readUnsignedShort(), class536_sub33.readUnsignedShort(), class536_sub33.readUnsignedShort(), class536_sub33.readUnsignedShort(), class536_sub33.readUnsignedShort()), -1534855635);
		class536_sub18_sub14.method10768((byte) 0);
		return class536_sub18_sub14;
	}

	public static final void method527(int i, String string, Color color, Color color_153_, Color color_154_, int i_155_) {
		try {
			Graphics graphics = Class399.aCanvas4127.getGraphics();
			if (Class41_Sub1.aFont10561 == null)
				Class41_Sub1.aFont10561 = new Font("Helvetica", 1, 13);
			if (color == null)
				color = new Color(140, 17, 17);
			if (color_153_ == null)
				color_153_ = new Color(140, 17, 17);
			if (null == color_154_)
				color_154_ = new Color(255, 255, 255);
			try {
				if (null == Class655.anImage8495)
					Class655.anImage8495 = (Class399.aCanvas4127.createImage(-1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499));
				Graphics graphics_156_ = Class655.anImage8495.getGraphics();
				graphics_156_.setColor(Color.black);
				graphics_156_.fillRect(0, 0, Class144.anInt1679 * -1804846931, Class34_Sub6.anInt10965 * 589116499);
				int i_157_ = Class144.anInt1679 * -1804846931 / 2 - 152;
				int i_158_ = Class34_Sub6.anInt10965 * 589116499 / 2 - 18;
				graphics_156_.setColor(color_153_);
				graphics_156_.drawRect(i_157_, i_158_, 303, 33);
				graphics_156_.setColor(color);
				graphics_156_.fillRect(i_157_ + 2, i_158_ + 2, i * 3, 30);
				graphics_156_.setColor(Color.black);
				graphics_156_.drawRect(i_157_ + 1, 1 + i_158_, 301, 31);
				graphics_156_.fillRect(i_157_ + 2 + 3 * i, i_158_ + 2, 300 - i * 3, 30);
				graphics_156_.setFont(Class41_Sub1.aFont10561);
				graphics_156_.setColor(color_154_);
				graphics_156_.drawString(string, (i_157_ + (304 - string.length() * 6) / 2), 22 + i_158_);
				if (null != Class505.aString6881) {
					graphics_156_.setFont(Class41_Sub1.aFont10561);
					graphics_156_.setColor(color_154_);
					graphics_156_.drawString(Class505.aString6881, (-1804846931 * Class144.anInt1679 / 2 - Class505.aString6881.length() * 6 / 2), Class34_Sub6.anInt10965 * 589116499 / 2 - 26);
				}
				graphics.drawImage(Class655.anImage8495, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Class144.anInt1679 * -1804846931, 589116499 * Class34_Sub6.anInt10965);
				int i_159_ = -1804846931 * Class144.anInt1679 / 2 - 152;
				int i_160_ = Class34_Sub6.anInt10965 * 589116499 / 2 - 18;
				graphics.setColor(color_153_);
				graphics.drawRect(i_159_, i_160_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(2 + i_159_, 2 + i_160_, 3 * i, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(1 + i_159_, i_160_ + 1, 301, 31);
				graphics.fillRect(i_159_ + 2 + i * 3, i_160_ + 2, 300 - i * 3, 30);
				graphics.setFont(Class41_Sub1.aFont10561);
				graphics.setColor(color_154_);
				if (Class505.aString6881 != null) {
					graphics.setFont(Class41_Sub1.aFont10561);
					graphics.setColor(color_154_);
					graphics.drawString(Class505.aString6881, (Class144.anInt1679 * -1804846931 / 2 - (Class505.aString6881.length() * 6 / 2)), (589116499 * Class34_Sub6.anInt10965 / 2) - 26);
				}
				graphics.drawString(string, i_159_ + (304 - string.length() * 6) / 2, i_160_ + 22);
			}
		} catch (Exception exception) {
			Class399.aCanvas4127.repaint();
		}
	}
}
