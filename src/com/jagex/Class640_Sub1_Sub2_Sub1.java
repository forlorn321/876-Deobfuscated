/* Class640_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class640_Sub1_Sub2_Sub1 extends Class640_Sub1_Sub2 implements Interface32 {
	public int anInt11886;
	public byte aByte11887;
	int anInt11888;
	int anInt11889;
	public int anInt11890;
	int anInt11891;
	int anInt11892;
	public boolean aBool11893;
	public int[] anIntArray11894;
	public int anInt11895;
	public int anInt11896;
	public int anInt11897;
	public byte aByte11898;
	int anInt11899;
	public int anInt11900;
	public int anInt11901;
	public int[] anIntArray11902;
	int anInt11903;
	public int[] anIntArray11904;
	public int[] anIntArray11905;
	public int[] anIntArray11906;
	public byte aByte11907;
	public int anInt11908;
	public int anInt11909;
	public int anInt11910;
	public int[] anIntArray11911;
	public Class705 aClass705_11912;
	public Class695_Sub2 aClass695_Sub2_11913;
	public Class695 aClass695_11914;
	public Class505[] aClass505Array11915;
	public int anInt11916;
	static final int anInt11917 = 20;
	public int anInt11918;
	public int[] anIntArray11919;
	public int anInt11920;
	Class523 aClass523_11921;
	int anInt11922;
	public int anInt11923;
	public int anInt11924;
	public int anInt11925;
	public int anInt11926;
	int anInt11927;
	byte aByte11928;
	public byte aByte11929;
	public int anInt11930;
	public int[] anIntArray11931;
	int anInt11932;
	public int anInt11933;
	public Class695_Sub3_Sub1[] aClass695_Sub3_Sub1Array11934;
	public int[] anIntArray11935;
	public Class61 aClass61_11936;
	public int anInt11937;
	public int anInt11938;
	public boolean aBool11939;
	public Class61 aClass61_11940;
	public Class61 aClass61_11941;
	public int anInt11942;
	int anInt11943;
	public int[] anIntArray11944;
	public byte[] aByteArray11945;
	public int anInt11946;
	public int anInt11947;
	static final int anInt11948 = 5;
	Class613 aClass613_11949;
	boolean aBool11950;
	boolean aBool11951;
	public Class176[] aClass176Array11952;
	public Interface3 anInterface3_11953;
	Class240 aClass240_11954;
	public int anInt11955 = -1587877927;
	int anInt11956;
	public Interface19 anInterface19_11957;

	void method18525(Class180 class180, Class176[] class176s, Class432 class432, boolean bool) {
		if (!bool) {
			int i = 0;
			int i_0_ = 0;
			int i_1_ = 0;
			int i_2_ = 0;
			int i_3_ = -1;
			int i_4_ = -1;
			Class167[][] class167s = new Class167[class176s.length][];
			Class159[][] class159s = new Class159[class176s.length][];
			for (int i_5_ = 0; i_5_ < class176s.length; i_5_++) {
				if (null != class176s[i_5_]) {
					class176s[i_5_].method2870(class432);
					class167s[i_5_] = class176s[i_5_].method2915();
					class159s[i_5_] = class176s[i_5_].method2916();
					if (null != class167s[i_5_]) {
						i_3_ = i_5_;
						i_0_++;
						i += class167s[i_5_].length;
					}
					if (class159s[i_5_] != null) {
						i_4_ = i_5_;
						i_2_++;
						i_1_ += class159s[i_5_].length;
					}
				}
			}
			if ((null == aClass613_11949 || aClass613_11949.aBool8026) && (i_0_ > 0 || i_2_ > 0))
				aClass613_11949 = Class613.method10130(client.anInt11019, true);
			if (aClass613_11949 != null) {
				Object object = null;
				Class167[] class167s_6_;
				if (i_0_ == 1)
					class167s_6_ = class167s[i_3_];
				else {
					class167s_6_ = new Class167[i];
					int i_7_ = 0;
					for (int i_8_ = 0; i_8_ < class176s.length; i_8_++) {
						if (null != class167s[i_8_]) {
							System.arraycopy(class167s[i_8_], 0, class167s_6_, i_7_, class167s[i_8_].length);
							i_7_ += class167s[i_8_].length;
						}
					}
				}
				Object object_9_ = null;
				Class159[] class159s_10_;
				if (i_2_ == 1)
					class159s_10_ = class159s[i_4_];
				else {
					class159s_10_ = new Class159[i_1_];
					int i_11_ = 0;
					for (int i_12_ = 0; i_12_ < class176s.length; i_12_++) {
						if (class159s[i_12_] != null) {
							System.arraycopy(class159s[i_12_], 0, class159s_10_, i_11_, class159s[i_12_].length);
							i_11_ += class159s[i_12_].length;
						}
					}
				}
				aClass613_11949.method10133(class180, (long) client.anInt11019, class167s_6_, class159s_10_, false);
				aBool11950 = true;
			}
		} else if (aClass613_11949 != null)
			aClass613_11949.method10132((long) client.anInt11019);
		if (aClass613_11949 != null)
			aClass613_11949.method10137(aByte10864, aShort11775, aShort11770, aShort11771, aShort11772);
	}

	boolean method17051() {
		return false;
	}

	public void method18526(int i) {
		Class587 class587 = method18542(-1350963404);
		if (0 != 754557379 * class587.anInt7726 || 0 != 2021896877 * anInt11937) {
			aClass61_11936.method1385((byte) -20);
			int i_13_ = i - aClass61_11936.anInt725 * 1085423875 & 0x3fff;
			if (i_13_ > 8192)
				anInt11938 = -1593588451 * (1085423875 * aClass61_11936.anInt725 - (16384 - i_13_));
			else
				anInt11938 = ((i_13_ + 1085423875 * aClass61_11936.anInt725) * -1593588451);
		}
	}

	boolean method17069(int i) {
		return false;
	}

	boolean method17072(int i) {
		return aBool11951;
	}

	public void method18527(int i, int i_14_) {
		Class587 class587 = method18542(-1484698985);
		if (0 != 754557379 * class587.anInt7726 || 0 != 2021896877 * anInt11937) {
			aClass61_11936.method1385((byte) -14);
			int i_15_ = i - aClass61_11936.anInt725 * 1085423875 & 0x3fff;
			if (i_15_ > 8192)
				anInt11938 = -1593588451 * (1085423875 * aClass61_11936.anInt725 - (16384 - i_15_));
			else
				anInt11938 = ((i_15_ + 1085423875 * aClass61_11936.anInt725) * -1593588451);
		}
	}

	public void method18528(int i, boolean bool, int i_16_) {
		Class587 class587 = method18542(-1728189494);
		if (bool || 0 != 754557379 * class587.anInt7726 || 0 != anInt11937 * 2021896877) {
			anInt11938 = (i & 0x3fff) * -1593588451;
			aClass61_11936.method1383(anInt11938 * 1672946997, -1842662795);
		}
	}

	public int method18529(byte i) {
		Class587 class587 = method18542(-1678527118);
		int i_17_ = aClass61_11936.anInt725 * 1085423875;
		boolean bool;
		if (class587.anInt7726 * 754557379 != 0)
			bool = aClass61_11936.method1389(1672946997 * anInt11938, class587.anInt7726 * 754557379, 1681160699 * class587.anInt7750, 1600318569);
		else
			bool = aClass61_11936.method1389(1672946997 * anInt11938, anInt11937 * 2021896877, anInt11937 * 2021896877, -297856991);
		int i_18_ = aClass61_11936.anInt725 * 1085423875 - i_17_;
		if (i_18_ != 0)
			anInt11901 += 1719838789;
		else {
			anInt11901 = 0;
			aClass61_11936.method1383(anInt11938 * 1672946997, -1901481446);
		}
		if (bool) {
			if (class587.anInt7725 * -268296813 != 0) {
				if (i_18_ > 0)
					aClass61_11940.method1389(class587.anInt7753 * -353138087, class587.anInt7725 * -268296813, -1073392833 * class587.anInt7722, 419453126);
				else
					aClass61_11940.method1389(-(class587.anInt7753 * -353138087), -268296813 * class587.anInt7725, -1073392833 * class587.anInt7722, -1516624923);
			}
			if (0 != class587.anInt7751 * 809230621)
				aClass61_11941.method1389(class587.anInt7756 * -1624976099, class587.anInt7751 * 809230621, 2047116291 * class587.anInt7747, 1761017485);
		} else {
			if (class587.anInt7725 * -268296813 != 0)
				aClass61_11940.method1389(0, -268296813 * class587.anInt7725, -1073392833 * class587.anInt7722, 1928672674);
			else
				aClass61_11940.method1383(0, -2115733689);
			if (0 != 809230621 * class587.anInt7751)
				aClass61_11941.method1389(0, 809230621 * class587.anInt7751, 2047116291 * class587.anInt7747, 1955655014);
			else
				aClass61_11941.method1383(0, -2100351061);
		}
		return i_18_;
	}

	public void method18530(int[] is, int[] is_19_, byte i) {
		if (anIntArray11911 == null && null != is)
			anIntArray11911 = new int[Class443.aClass616_4922.anIntArray8086.length];
		else if (is == null) {
			anIntArray11911 = null;
			return;
		}
		for (int i_20_ = 0; i_20_ < anIntArray11911.length; i_20_++)
			anIntArray11911[i_20_] = -1;
		for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
			int i_22_ = is_19_[i_21_];
			int i_23_ = 0;
			while (i_23_ < anIntArray11911.length) {
				if ((i_22_ & 0x1) != 0)
					anIntArray11911[i_23_] = is[i_21_];
				i_23_++;
				i_22_ >>= 1;
			}
		}
	}

	public boolean method18531(int i, int i_24_, int i_25_) {
		if (anIntArray11935 == null) {
			if (-1 == i_24_)
				return true;
			anIntArray11935 = new int[Class443.aClass616_4922.anIntArray8086.length];
			for (int i_26_ = 0; i_26_ < Class443.aClass616_4922.anIntArray8086.length; i_26_++)
				anIntArray11935[i_26_] = -1;
		}
		Class587 class587 = method18542(-1887052616);
		int i_27_ = 256;
		if (null != class587.anIntArray7743 && class587.anIntArray7743[i] > 0)
			i_27_ = class587.anIntArray7743[i];
		if (-1 == i_24_) {
			if (-1 == anIntArray11935[i])
				return true;
			int i_28_ = aClass61_11936.method1384((byte) 1);
			int i_29_ = anIntArray11935[i];
			int i_30_ = i_28_ - i_29_;
			if (i_30_ >= -i_27_ && i_30_ <= i_27_) {
				anIntArray11935[i] = -1;
				for (int i_31_ = 0; i_31_ < Class443.aClass616_4922.anIntArray8086.length; i_31_++) {
					if (anIntArray11935[i_31_] != -1)
						return true;
				}
				anIntArray11935 = null;
				return true;
			}
			if (i_30_ > 0 && i_30_ <= 8192 || i_30_ <= -8192)
				anIntArray11935[i] = i_29_ + i_27_ & 0x3fff;
			else
				anIntArray11935[i] = i_29_ - i_27_ & 0x3fff;
			return false;
		}
		if (anIntArray11935[i] == -1)
			anIntArray11935[i] = aClass61_11936.method1384((byte) 1);
		int i_32_ = anIntArray11935[i];
		int i_33_ = i_24_ - i_32_;
		if (i_33_ >= -i_27_ && i_33_ <= i_27_) {
			anIntArray11935[i] = i_24_;
			return true;
		}
		if (i_33_ > 0 && i_33_ <= 8192 || i_33_ <= -8192)
			anIntArray11935[i] = i_27_ + i_32_ & 0x3fff;
		else
			anIntArray11935[i] = i_32_ - i_27_ & 0x3fff;
		return false;
	}

	void method18532(Class180 class180, Class176[] class176s, Class432 class432, boolean bool, byte i) {
		if (!bool) {
			int i_34_ = 0;
			int i_35_ = 0;
			int i_36_ = 0;
			int i_37_ = 0;
			int i_38_ = -1;
			int i_39_ = -1;
			Class167[][] class167s = new Class167[class176s.length][];
			Class159[][] class159s = new Class159[class176s.length][];
			for (int i_40_ = 0; i_40_ < class176s.length; i_40_++) {
				if (null != class176s[i_40_]) {
					class176s[i_40_].method2870(class432);
					class167s[i_40_] = class176s[i_40_].method2915();
					class159s[i_40_] = class176s[i_40_].method2916();
					if (null != class167s[i_40_]) {
						i_38_ = i_40_;
						i_35_++;
						i_34_ += class167s[i_40_].length;
					}
					if (class159s[i_40_] != null) {
						i_39_ = i_40_;
						i_37_++;
						i_36_ += class159s[i_40_].length;
					}
				}
			}
			if ((null == aClass613_11949 || aClass613_11949.aBool8026) && (i_35_ > 0 || i_37_ > 0))
				aClass613_11949 = Class613.method10130(client.anInt11019, true);
			if (aClass613_11949 != null) {
				Object object = null;
				Class167[] class167s_41_;
				if (i_35_ == 1)
					class167s_41_ = class167s[i_38_];
				else {
					class167s_41_ = new Class167[i_34_];
					int i_42_ = 0;
					for (int i_43_ = 0; i_43_ < class176s.length; i_43_++) {
						if (null != class167s[i_43_]) {
							System.arraycopy(class167s[i_43_], 0, class167s_41_, i_42_, class167s[i_43_].length);
							i_42_ += class167s[i_43_].length;
						}
					}
				}
				Object object_44_ = null;
				Class159[] class159s_45_;
				if (i_37_ == 1)
					class159s_45_ = class159s[i_39_];
				else {
					class159s_45_ = new Class159[i_36_];
					int i_46_ = 0;
					for (int i_47_ = 0; i_47_ < class176s.length; i_47_++) {
						if (class159s[i_47_] != null) {
							System.arraycopy(class159s[i_47_], 0, class159s_45_, i_46_, class159s[i_47_].length);
							i_46_ += class159s[i_47_].length;
						}
					}
				}
				aClass613_11949.method10133(class180, (long) client.anInt11019, class167s_41_, class159s_45_, false);
				aBool11950 = true;
			}
		} else if (aClass613_11949 != null)
			aClass613_11949.method10132((long) client.anInt11019);
		if (aClass613_11949 != null)
			aClass613_11949.method10137(aByte10864, aShort11775, aShort11770, aShort11771, aShort11772);
	}

	public abstract Class523 method18533();

	public int method17047(int i) {
		if (1075560407 * anInt11891 == -32768)
			return 0;
		return anInt11891 * 1075560407;
	}

	public Class592 method18534(int i) {
		Class442 class442 = method10637().aClass442_4927;
		Class592 class592 = client.aClass509_11072.method8283((short) 13065);
		int i_48_ = (class592.anInt7798 * 153371143 + ((int) class442.aFloat4918 >> 9));
		int i_49_ = (((int) class442.aFloat4919 >> 9) + -2029646807 * class592.anInt7799);
		return new Class592(aByte10864, i_48_, i_49_);
	}

	public final void method18535(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
		Class544 class544 = ((Class544) Class536_Sub1.aClass24_Sub13_10343.method81(i, -618983641));
		Class522_Sub1 class522_sub1 = null;
		Class522_Sub1 class522_sub1_56_ = null;
		int i_57_ = 1360642829 * class544.anInt7247;
		int i_58_ = 0;
		for (Class522_Sub1 class522_sub1_59_ = (Class522_Sub1) aClass705_11912.method14317(297060422); class522_sub1_59_ != null; class522_sub1_59_ = (Class522_Sub1) aClass705_11912.method14320((byte) -121)) {
			i_58_++;
			if (class544 == class522_sub1_59_.aClass544_10291) {
				class522_sub1_59_.method15937(i_50_ + i_52_, i_53_, i_54_, i_51_, 1377322883);
				return;
			}
			if (class522_sub1_59_.aClass544_10291.anInt7246 * -438391665 <= class544.anInt7246 * -438391665)
				class522_sub1 = class522_sub1_59_;
			if (class522_sub1_59_.aClass544_10291.anInt7247 * 1360642829 > i_57_) {
				class522_sub1_56_ = class522_sub1_59_;
				i_57_ = 1360642829 * class522_sub1_59_.aClass544_10291.anInt7247;
			}
		}
		if (null != class522_sub1_56_ || i_58_ < 391603273 * Class536.aClass615_7224.anInt8044) {
			Class522_Sub1 class522_sub1_60_ = new Class522_Sub1(class544);
			if (class522_sub1 == null)
				aClass705_11912.method14330(class522_sub1_60_, -1153940198);
			else
				Class550.method9115(class522_sub1_60_, class522_sub1, (byte) 75);
			class522_sub1_60_.method15937(i_50_ + i_52_, i_53_, i_54_, i_51_, 729414712);
			if (i_58_ >= 391603273 * Class536.aClass615_7224.anInt8044)
				class522_sub1_56_.method8682(-2077384413);
		}
	}

	public final void method18536(int i, int i_61_) {
		Class544 class544 = ((Class544) Class536_Sub1.aClass24_Sub13_10343.method81(i, -307716923));
		for (Class522_Sub1 class522_sub1 = (Class522_Sub1) aClass705_11912.method14317(297060422); class522_sub1 != null; class522_sub1 = (Class522_Sub1) aClass705_11912.method14320((byte) -70)) {
			if (class544 == class522_sub1.aClass544_10291) {
				class522_sub1.method8682(-157210294);
				break;
			}
		}
	}

	public int method17049(byte i) {
		Class587 class587 = method18542(-1680722690);
		int i_62_;
		if (-1 != 750844545 * class587.anInt7758)
			i_62_ = class587.anInt7758 * 750844545;
		else if (-32768 == anInt11892 * 480794473)
			i_62_ = 200;
		else
			i_62_ = -(480794473 * anInt11892);
		Class445 class445 = method10637();
		int i_63_ = (int) class445.aClass442_4927.aFloat4918 >> 9;
		int i_64_ = (int) class445.aClass442_4927.aFloat4919 >> 9;
		if (aClass555_10867 != null && i_63_ >= 1 && i_64_ >= 1 && i_63_ <= client.aClass509_11072.method8284((byte) 11) - 1 && i_64_ <= client.aClass509_11072.method8285(868935377) - 1) {
			Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][i_63_][i_64_]);
			if (null != class561 && class561.aClass640_Sub1_Sub4_7556 != null)
				return i_62_ + class561.aClass640_Sub1_Sub4_7556.aShort11871;
		}
		return i_62_;
	}

	public final void method18537(int i, int i_65_, int i_66_, int i_67_, boolean bool, int i_68_, byte i_69_) {
		Class505 class505 = aClass505Array11915[i_68_];
		int i_70_ = class505.anInt6909 * 1429262853;
		if (i != -1 && -1 != i_70_) {
			if (i_70_ == i) {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(i, -150356956));
				if (class685.aBool8665 && -1 != -1567837355 * class685.anInt8671) {
					Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, -1930385635)));
					int i_71_ = -667661221 * class198.anInt2186;
					if (0 == i_71_)
						return;
					if (2 == i_71_) {
						class505.aClass695_6911.method14184((byte) 43);
						return;
					}
				}
			} else {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(i, -808526007));
				Class685 class685_72_ = ((Class685) Class57.aClass24_Sub4_720.method81(i_70_, -1792224818));
				if (-1 != class685.anInt8671 * -1567837355 && -1567837355 * class685_72_.anInt8671 != -1) {
					Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, -562055576)));
					Class198 class198_73_ = (Class198) (Class321.aClass24_Sub10_3551.method81(class685_72_.anInt8671 * -1567837355, 469340189));
					if (class198.anInt2191 * 40010509 < class198_73_.anInt2191 * 40010509)
						return;
				}
			}
		}
		int i_74_ = 0;
		if (-1 != i && !(((Class685) Class57.aClass24_Sub4_720.method81(i, -729390943)).aBool8665))
			i_74_ = 2;
		if (-1 != i && bool)
			i_74_ = 1;
		class505.anInt6909 = i * -82367795;
		class505.anInt6908 = i_67_ * 1669348947;
		class505.anInt6910 = 706413901 * (i_65_ >> 16);
		class505.anInt6912 = i_66_ * 2009205063;
		class505.aClass695_6911.method14238((i != -1 ? (((Class685) Class57.aClass24_Sub4_720.method81(i, -1528385421)).anInt8671) * -1567837355 : -1), i_65_ & 0xffff, i_74_, false, 2093921087);
	}

	public final void method18538(int i, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
		boolean bool = true;
		boolean bool_81_ = true;
		for (int i_82_ = 0; i_82_ < Class536.aClass615_7224.anInt8038 * -66822073; i_82_++) {
			if (anIntArray11906[i_82_] > i_78_)
				bool = false;
			else
				bool_81_ = false;
		}
		int i_83_ = -1;
		int i_84_ = -1;
		int i_85_ = 0;
		if (i >= 0) {
			Class589 class589 = ((Class589) Class234.aClass24_Sub18_2375.method81(i, 1054498688));
			i_84_ = class589.anInt7780 * 651590369;
			i_85_ = 346458345 * class589.anInt7779;
		}
		if (bool_81_) {
			if (i_84_ == -1)
				return;
			i_83_ = 0;
			int i_86_ = 0;
			if (0 == i_84_)
				i_86_ = anIntArray11906[0];
			else if (1 == i_84_)
				i_86_ = anIntArray11905[0];
			for (int i_87_ = 1; i_87_ < -66822073 * Class536.aClass615_7224.anInt8038; i_87_++) {
				if (0 == i_84_) {
					if (anIntArray11906[i_87_] < i_86_) {
						i_83_ = i_87_;
						i_86_ = anIntArray11906[i_87_];
					}
				} else if (i_84_ == 1 && anIntArray11905[i_87_] < i_86_) {
					i_83_ = i_87_;
					i_86_ = anIntArray11905[i_87_];
				}
			}
			if (i_84_ == 1 && i_86_ >= i_75_)
				return;
		} else {
			if (bool)
				aByte11928 = (byte) 0;
			for (int i_88_ = 0; i_88_ < Class536.aClass615_7224.anInt8038 * -66822073; i_88_++) {
				int i_89_ = aByte11928;
				aByte11928 = (byte) ((aByte11928 + 1) % (-66822073 * Class536.aClass615_7224.anInt8038));
				if (anIntArray11906[i_89_] <= i_78_) {
					i_83_ = i_89_;
					break;
				}
			}
		}
		if (i_83_ >= 0) {
			anIntArray11904[i_83_] = i;
			anIntArray11905[i_83_] = i_75_;
			anIntArray11894[i_83_] = i_76_;
			anIntArray11919[i_83_] = i_77_;
			anIntArray11906[i_83_] = i_85_ + i_78_ + i_79_;
		}
	}

	public void method18335(byte i) {
		int i_90_ = 240 + (anInt11889 * 1053416001 - 1 << 8);
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = (short) ((int) class442.aFloat4918 - i_90_ >> 9);
		aShort11771 = (short) ((int) class442.aFloat4919 - i_90_ >> 9);
		aShort11770 = (short) ((int) class442.aFloat4918 + i_90_ >> 9);
		aShort11772 = (short) ((int) class442.aFloat4919 + i_90_ >> 9);
	}

	void method18539(Class176 class176, byte i) {
		int i_91_ = aClass61_11940.anInt725 * 1085423875;
		int i_92_ = 1085423875 * aClass61_11941.anInt725;
		if (0 != i_91_ || 0 != i_92_) {
			int i_93_ = class176.method2896() / 2;
			class176.method3015(0, -i_93_, 0);
			class176.method2869(i_91_ & 0x3fff);
			class176.method2868(i_92_ & 0x3fff);
			class176.method3015(0, i_93_, 0);
		}
	}

	void method18540(Class180 class180, Class587 class587, int i, int i_94_, int i_95_, int i_96_, int i_97_) {
		for (int i_98_ = 0; i_98_ < aClass505Array11915.length; i_98_++) {
			byte i_99_ = 0;
			if (0 == i_98_)
				i_99_ = (byte) 2;
			else if (1 == i_98_)
				i_99_ = (byte) 5;
			else if (2 == i_98_)
				i_99_ = (byte) 1;
			else if (i_98_ == 3)
				i_99_ = (byte) 7;
			else if (i_98_ == 4)
				i_99_ = (byte) 8;
			Class505 class505 = aClass505Array11915[i_98_];
			if (-1 != 1429262853 * class505.anInt6909 && !class505.aClass695_6911.method14172(-657887233)) {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81((class505.anInt6909 * 1429262853), -187661987));
				int i_100_ = i;
				if (0 != -895692681 * class505.anInt6912)
					i_100_ |= 0x5;
				if (0 != 1207155589 * class505.anInt6910)
					i_100_ |= 0x2;
				if (class505.anInt6908 * -1969310245 >= 0)
					i_100_ |= 0x7;
				if (-1969310245 * class505.anInt6908 >= 0 && null != class587.anIntArrayArray7744 && (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908]) != null) {
					Class176 class176 = (aClass176Array11952[i_98_ + 1] = class685.method13931(class180, i_100_, class505.aClass695_6911, i_99_, (short) 19973));
					if (class176 != null) {
						int i_101_ = 0;
						int i_102_ = 0;
						int i_103_ = 0;
						if (class587.anIntArrayArray7744 != null && null != (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908])) {
							i_101_ += (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908][0]);
							i_102_ += (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908][1]);
							i_103_ += (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908][2]);
						}
						if (null != class587.anIntArrayArray7745 && null != (class587.anIntArrayArray7745[-1969310245 * class505.anInt6908])) {
							i_101_ += (class587.anIntArrayArray7745[-1969310245 * class505.anInt6908][0]);
							i_102_ += (class587.anIntArrayArray7745[-1969310245 * class505.anInt6908][1]);
							i_103_ += (class587.anIntArrayArray7745[-1969310245 * class505.anInt6908][2]);
						}
						if (i_103_ != 0 || i_101_ != 0) {
							int i_104_ = i_96_;
							if (null != anIntArray11935 && (anIntArray11935[-1969310245 * class505.anInt6908]) != -1)
								i_104_ = (anIntArray11935[-1969310245 * class505.anInt6908]);
							int i_105_ = ((i_104_ + class505.anInt6912 * -427575296 - i_96_) & 0x3fff);
							if (0 != i_105_)
								class176.method2911(i_105_);
							int i_106_ = Class428.anIntArray4825[i_105_];
							int i_107_ = Class428.anIntArray4819[i_105_];
							int i_108_ = i_107_ * i_101_ + i_103_ * i_106_ >> 14;
							i_103_ = i_107_ * i_103_ - i_101_ * i_106_ >> 14;
							i_101_ = i_108_;
						}
						class176.method3015(i_101_, i_102_, i_103_);
						if (1207155589 * class505.anInt6910 != 0)
							class176.method3015(0, -(1207155589 * class505.anInt6910) << 2, 0);
						class176.aBool1953 = false;
					}
				} else {
					Class176 class176 = (aClass176Array11952[1 + i_98_] = class685.method13932(class180, i_100_, (class505.anInt6912 * -427575296), 299555935 * anInt11927, -1105701807 * anInt11943, -1914574331 * anInt11888, class505.aClass695_6911, i_99_, (byte) 0));
					if (class176 != null) {
						if (1207155589 * class505.anInt6910 != 0)
							class176.method3015(0, -(class505.anInt6910 * 1207155589) << 2, 0);
						class176.aBool1953 = false;
					}
				}
			} else
				aClass176Array11952[i_98_ + 1] = null;
		}
	}

	void method18541(Class180 class180, Class176[] class176s, Class432 class432, boolean bool) {
		if (!bool) {
			int i = 0;
			int i_109_ = 0;
			int i_110_ = 0;
			int i_111_ = 0;
			int i_112_ = -1;
			int i_113_ = -1;
			Class167[][] class167s = new Class167[class176s.length][];
			Class159[][] class159s = new Class159[class176s.length][];
			for (int i_114_ = 0; i_114_ < class176s.length; i_114_++) {
				if (null != class176s[i_114_]) {
					class176s[i_114_].method2870(class432);
					class167s[i_114_] = class176s[i_114_].method2915();
					class159s[i_114_] = class176s[i_114_].method2916();
					if (null != class167s[i_114_]) {
						i_112_ = i_114_;
						i_109_++;
						i += class167s[i_114_].length;
					}
					if (class159s[i_114_] != null) {
						i_113_ = i_114_;
						i_111_++;
						i_110_ += class159s[i_114_].length;
					}
				}
			}
			if ((null == aClass613_11949 || aClass613_11949.aBool8026) && (i_109_ > 0 || i_111_ > 0))
				aClass613_11949 = Class613.method10130(client.anInt11019, true);
			if (aClass613_11949 != null) {
				Object object = null;
				Class167[] class167s_115_;
				if (i_109_ == 1)
					class167s_115_ = class167s[i_112_];
				else {
					class167s_115_ = new Class167[i];
					int i_116_ = 0;
					for (int i_117_ = 0; i_117_ < class176s.length; i_117_++) {
						if (null != class167s[i_117_]) {
							System.arraycopy(class167s[i_117_], 0, class167s_115_, i_116_, class167s[i_117_].length);
							i_116_ += class167s[i_117_].length;
						}
					}
				}
				Object object_118_ = null;
				Class159[] class159s_119_;
				if (i_111_ == 1)
					class159s_119_ = class159s[i_113_];
				else {
					class159s_119_ = new Class159[i_110_];
					int i_120_ = 0;
					for (int i_121_ = 0; i_121_ < class176s.length; i_121_++) {
						if (class159s[i_121_] != null) {
							System.arraycopy(class159s[i_121_], 0, class159s_119_, i_120_, class159s[i_121_].length);
							i_120_ += class159s[i_121_].length;
						}
					}
				}
				aClass613_11949.method10133(class180, (long) client.anInt11019, class167s_115_, class159s_119_, false);
				aBool11950 = true;
			}
		} else if (aClass613_11949 != null)
			aClass613_11949.method10132((long) client.anInt11019);
		if (aClass613_11949 != null)
			aClass613_11949.method10137(aByte10864, aShort11775, aShort11770, aShort11771, aShort11772);
	}

	public Class587 method18542(int i) {
		int i_122_ = method18543(1376746622);
		if (-1 == i_122_)
			return Class24_Sub2.aClass587_10964;
		return ((Class587) Class258.aClass24_Sub2_2827.method81(i_122_, -708224642));
	}

	abstract int method18543(int i);

	public abstract int method18544(int i);

	public final void method18545(int i, int i_123_, int i_124_, int i_125_, boolean bool, int i_126_) {
		Class505 class505 = aClass505Array11915[i_126_];
		int i_127_ = class505.anInt6909 * 1429262853;
		if (i != -1 && -1 != i_127_) {
			if (i_127_ == i) {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(i, 787877035));
				if (class685.aBool8665 && -1 != -1567837355 * class685.anInt8671) {
					Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, 1964979309)));
					int i_128_ = -667661221 * class198.anInt2186;
					if (0 == i_128_)
						return;
					if (2 == i_128_) {
						class505.aClass695_6911.method14184((byte) 43);
						return;
					}
				}
			} else {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(i, -261776310));
				Class685 class685_129_ = ((Class685) Class57.aClass24_Sub4_720.method81(i_127_, -1878057526));
				if (-1 != class685.anInt8671 * -1567837355 && -1567837355 * class685_129_.anInt8671 != -1) {
					Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, -715803755)));
					Class198 class198_130_ = (Class198) (Class321.aClass24_Sub10_3551.method81(class685_129_.anInt8671 * -1567837355, 34212139));
					if (class198.anInt2191 * 40010509 < class198_130_.anInt2191 * 40010509)
						return;
				}
			}
		}
		int i_131_ = 0;
		if (-1 != i && !(((Class685) Class57.aClass24_Sub4_720.method81(i, -928290426)).aBool8665))
			i_131_ = 2;
		if (-1 != i && bool)
			i_131_ = 1;
		class505.anInt6909 = i * -82367795;
		class505.anInt6908 = i_125_ * 1669348947;
		class505.anInt6910 = 706413901 * (i_123_ >> 16);
		class505.anInt6912 = i_124_ * 2009205063;
		class505.aClass695_6911.method14238((i != -1 ? (((Class685) Class57.aClass24_Sub4_720.method81(i, 993263015)).anInt8671) * -1567837355 : -1), i_123_ & 0xffff, i_131_, false, 2102002538);
	}

	public Class527_Sub36 method18546() {
		Class442 class442 = method10637().aClass442_4927;
		Class592 class592 = client.aClass509_11072.method8283((short) 13544);
		int i = (int) class442.aFloat4918 + class592.anInt7798 * 1216613888;
		int i_132_ = (int) class442.aFloat4915;
		int i_133_ = (int) class442.aFloat4919 + 202920448 * class592.anInt7799;
		return new Class527_Sub36(aByte10864, i, i_132_, i_133_);
	}

	public abstract Class523 method18547(int i);

	public Class527_Sub36 method18548() {
		Class442 class442 = method10637().aClass442_4927;
		Class592 class592 = client.aClass509_11072.method8283((short) 23054);
		int i = (int) class442.aFloat4918 + class592.anInt7798 * 1216613888;
		int i_134_ = (int) class442.aFloat4915;
		int i_135_ = (int) class442.aFloat4919 + 202920448 * class592.anInt7799;
		return new Class527_Sub36(aByte10864, i, i_134_, i_135_);
	}

	boolean method18549(int i) {
		if (922256893 * anInt11956 == -1)
			return false;
		return method18561(922256893 * anInt11956, -195353704);
	}

	public void method18338() {
		int i = 240 + (anInt11889 * 1053416001 - 1 << 8);
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = (short) ((int) class442.aFloat4918 - i >> 9);
		aShort11771 = (short) ((int) class442.aFloat4919 - i >> 9);
		aShort11770 = (short) ((int) class442.aFloat4918 + i >> 9);
		aShort11772 = (short) ((int) class442.aFloat4919 + i >> 9);
	}

	public void method18550(int i) {
		Class587 class587 = method18542(-1769122928);
		if (0 != 754557379 * class587.anInt7726 || 0 != 2021896877 * anInt11937) {
			aClass61_11936.method1385((byte) 63);
			int i_136_ = i - aClass61_11936.anInt725 * 1085423875 & 0x3fff;
			if (i_136_ > 8192)
				anInt11938 = -1593588451 * (1085423875 * aClass61_11936.anInt725 - (16384 - i_136_));
			else
				anInt11938 = ((i_136_ + 1085423875 * aClass61_11936.anInt725) * -1593588451);
		}
	}

	public void method18551(int i, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, byte i_143_) {
		if (!method18549(-1052134928)) {
			if (-1 != i)
				client.aBoolArray11310[i] = true;
			else {
				for (int i_144_ = 0; i_144_ < 102; i_144_++)
					client.aBoolArray11310[i_144_] = true;
			}
		} else
			Class485.method7957(aClass240_11954.method4384(-1030451686), -1, i_137_, i_138_, i_139_, i_140_, i_141_, i_142_, i, false, -1932565163);
	}

	abstract int method18552();

	public abstract int method18553(int i);

	public abstract boolean method18554(int i);

	public Class527_Sub36 method18555(byte i) {
		Class442 class442 = method10637().aClass442_4927;
		Class592 class592 = client.aClass509_11072.method8283((short) 20194);
		int i_145_ = (int) class442.aFloat4918 + class592.anInt7798 * 1216613888;
		int i_146_ = (int) class442.aFloat4915;
		int i_147_ = (int) class442.aFloat4919 + 202920448 * class592.anInt7799;
		return new Class527_Sub36(aByte10864, i_145_, i_146_, i_147_);
	}

	public void finalize() {
		if (aClass613_11949 != null)
			aClass613_11949.method10129();
	}

	public final void method18556(int i, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_) {
		boolean bool = true;
		boolean bool_153_ = true;
		for (int i_154_ = 0; i_154_ < Class536.aClass615_7224.anInt8038 * -66822073; i_154_++) {
			if (anIntArray11906[i_154_] > i_151_)
				bool = false;
			else
				bool_153_ = false;
		}
		int i_155_ = -1;
		int i_156_ = -1;
		int i_157_ = 0;
		if (i >= 0) {
			Class589 class589 = ((Class589) Class234.aClass24_Sub18_2375.method81(i, -265700329));
			i_156_ = class589.anInt7780 * 651590369;
			i_157_ = 346458345 * class589.anInt7779;
		}
		if (bool_153_) {
			if (i_156_ == -1)
				return;
			i_155_ = 0;
			int i_158_ = 0;
			if (0 == i_156_)
				i_158_ = anIntArray11906[0];
			else if (1 == i_156_)
				i_158_ = anIntArray11905[0];
			for (int i_159_ = 1; i_159_ < -66822073 * Class536.aClass615_7224.anInt8038; i_159_++) {
				if (0 == i_156_) {
					if (anIntArray11906[i_159_] < i_158_) {
						i_155_ = i_159_;
						i_158_ = anIntArray11906[i_159_];
					}
				} else if (i_156_ == 1 && anIntArray11905[i_159_] < i_158_) {
					i_155_ = i_159_;
					i_158_ = anIntArray11905[i_159_];
				}
			}
			if (i_156_ == 1 && i_158_ >= i_148_)
				return;
		} else {
			if (bool)
				aByte11928 = (byte) 0;
			for (int i_160_ = 0; i_160_ < Class536.aClass615_7224.anInt8038 * -66822073; i_160_++) {
				int i_161_ = aByte11928;
				aByte11928 = (byte) ((aByte11928 + 1) % (-66822073 * Class536.aClass615_7224.anInt8038));
				if (anIntArray11906[i_161_] <= i_151_) {
					i_155_ = i_161_;
					break;
				}
			}
		}
		if (i_155_ >= 0) {
			anIntArray11904[i_155_] = i;
			anIntArray11905[i_155_] = i_148_;
			anIntArray11894[i_155_] = i_149_;
			anIntArray11919[i_155_] = i_150_;
			anIntArray11906[i_155_] = i_157_ + i_151_ + i_152_;
		}
	}

	void method18557() {
		if (aClass613_11949 != null)
			aClass613_11949.method10129();
	}

	public Class587 method18558() {
		int i = method18543(1568815895);
		if (-1 == i)
			return Class24_Sub2.aClass587_10964;
		return (Class587) Class258.aClass24_Sub2_2827.method81(i, 1231071660);
	}

	void method18559() {
		if (aClass613_11949 != null)
			aClass613_11949.method10129();
	}

	public void method18560(String string, int i, int i_162_, int i_163_) {
		if (null == aClass523_11921)
			aClass523_11921 = new Class523();
		aClass523_11921.aString7090 = string;
		aClass523_11921.anInt7093 = i * -2053580521;
		aClass523_11921.anInt7092 = -1781221627 * i_162_;
		aClass523_11921.anInt7094 = (aClass523_11921.anInt7091 = 1570909915 * i_163_) * -430941535;
	}

	boolean method18561(int i, int i_164_) {
		if (212522229 * anInt11922 == i)
			return true;
		aClass240_11954 = Class700_Sub26.method17192(i, null, null, true, 1216425365);
		if (aClass240_11954 == null)
			return false;
		anInt11922 = 191903581 * i;
		Class203.method3777(aClass240_11954.aClass243Array2392, (byte) 9);
		return true;
	}

	boolean method17052() {
		return false;
	}

	public void method18562(String string, int i, int i_165_, int i_166_) {
		if (null == aClass523_11921)
			aClass523_11921 = new Class523();
		aClass523_11921.aString7090 = string;
		aClass523_11921.anInt7093 = i * -2053580521;
		aClass523_11921.anInt7092 = -1781221627 * i_165_;
		aClass523_11921.anInt7094 = (aClass523_11921.anInt7091 = 1570909915 * i_166_) * -430941535;
	}

	boolean method17048() {
		return aBool11951;
	}

	public int method17059() {
		Class587 class587 = method18542(-1889982984);
		int i;
		if (-1 != 750844545 * class587.anInt7758)
			i = class587.anInt7758 * 750844545;
		else if (-32768 == anInt11892 * 480794473)
			i = 200;
		else
			i = -(480794473 * anInt11892);
		Class445 class445 = method10637();
		int i_167_ = (int) class445.aClass442_4927.aFloat4918 >> 9;
		int i_168_ = (int) class445.aClass442_4927.aFloat4919 >> 9;
		if (aClass555_10867 != null && i_167_ >= 1 && i_168_ >= 1 && i_167_ <= client.aClass509_11072.method8284((byte) 89) - 1 && i_168_ <= client.aClass509_11072.method8285(1282897589) - 1) {
			Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][i_167_][i_168_]);
			if (null != class561 && class561.aClass640_Sub1_Sub4_7556 != null)
				return i + class561.aClass640_Sub1_Sub4_7556.aShort11871;
		}
		return i;
	}

	public int method17035() {
		Class587 class587 = method18542(-2137701828);
		int i;
		if (-1 != 750844545 * class587.anInt7758)
			i = class587.anInt7758 * 750844545;
		else if (-32768 == anInt11892 * 480794473)
			i = 200;
		else
			i = -(480794473 * anInt11892);
		Class445 class445 = method10637();
		int i_169_ = (int) class445.aClass442_4927.aFloat4918 >> 9;
		int i_170_ = (int) class445.aClass442_4927.aFloat4919 >> 9;
		if (aClass555_10867 != null && i_169_ >= 1 && i_170_ >= 1 && i_169_ <= client.aClass509_11072.method8284((byte) 27) - 1 && i_170_ <= client.aClass509_11072.method8285(648980014) - 1) {
			Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][i_169_][i_170_]);
			if (null != class561 && class561.aClass640_Sub1_Sub4_7556 != null)
				return i + class561.aClass640_Sub1_Sub4_7556.aShort11871;
		}
		return i;
	}

	public void method18563(int i) {
		anInt11889 = i * 1491285441;
	}

	public int method18564(int i) {
		return 1053416001 * anInt11889;
	}

	public void method18565(int i) {
		Class587 class587 = method18542(-2035354705);
		if (0 != 754557379 * class587.anInt7726 || 0 != 2021896877 * anInt11937) {
			aClass61_11936.method1385((byte) 8);
			int i_171_ = i - aClass61_11936.anInt725 * 1085423875 & 0x3fff;
			if (i_171_ > 8192)
				anInt11938 = -1593588451 * (1085423875 * aClass61_11936.anInt725 - (16384 - i_171_));
			else
				anInt11938 = ((i_171_ + 1085423875 * aClass61_11936.anInt725) * -1593588451);
		}
	}

	public int method17076() {
		if (1075560407 * anInt11891 == -32768)
			return 0;
		return anInt11891 * 1075560407;
	}

	public void method18566() {
		if (aClass523_11921 != null && null != aClass523_11921.aString7090) {
			aClass523_11921.anInt7094 -= 1307080123;
			if (0 == -991885453 * aClass523_11921.anInt7094)
				aClass523_11921.aString7090 = null;
		}
	}

	public void method18567(int i, boolean bool) {
		Class587 class587 = method18542(-1743881132);
		if (bool || 0 != 754557379 * class587.anInt7726 || 0 != anInt11937 * 2021896877) {
			anInt11938 = (i & 0x3fff) * -1593588451;
			aClass61_11936.method1383(anInt11938 * 1672946997, -2065854375);
		}
	}

	public void method18568(int i, boolean bool) {
		Class587 class587 = method18542(-1758354740);
		if (bool || 0 != 754557379 * class587.anInt7726 || 0 != anInt11937 * 2021896877) {
			anInt11938 = (i & 0x3fff) * -1593588451;
			aClass61_11936.method1383(anInt11938 * 1672946997, -1966167088);
		}
	}

	public void method18569(int i, boolean bool) {
		Class587 class587 = method18542(-1501791858);
		if (bool || 0 != 754557379 * class587.anInt7726 || 0 != anInt11937 * 2021896877) {
			anInt11938 = (i & 0x3fff) * -1593588451;
			aClass61_11936.method1383(anInt11938 * 1672946997, -2042390107);
		}
	}

	void method18570() {
		if (aClass613_11949 != null)
			aClass613_11949.method10129();
	}

	public void method18571(int[] is, int[] is_172_) {
		if (anIntArray11911 == null && null != is)
			anIntArray11911 = new int[Class443.aClass616_4922.anIntArray8086.length];
		else if (is == null) {
			anIntArray11911 = null;
			return;
		}
		for (int i = 0; i < anIntArray11911.length; i++)
			anIntArray11911[i] = -1;
		for (int i = 0; i < is.length; i++) {
			int i_173_ = is_172_[i];
			int i_174_ = 0;
			while (i_174_ < anIntArray11911.length) {
				if ((i_173_ & 0x1) != 0)
					anIntArray11911[i_174_] = is[i];
				i_174_++;
				i_173_ >>= 1;
			}
		}
	}

	public void method18572(int[] is, int[] is_175_) {
		if (anIntArray11911 == null && null != is)
			anIntArray11911 = new int[Class443.aClass616_4922.anIntArray8086.length];
		else if (is == null) {
			anIntArray11911 = null;
			return;
		}
		for (int i = 0; i < anIntArray11911.length; i++)
			anIntArray11911[i] = -1;
		for (int i = 0; i < is.length; i++) {
			int i_176_ = is_175_[i];
			int i_177_ = 0;
			while (i_177_ < anIntArray11911.length) {
				if ((i_176_ & 0x1) != 0)
					anIntArray11911[i_177_] = is[i];
				i_177_++;
				i_176_ >>= 1;
			}
		}
	}

	void method18573(Class180 class180, Class587 class587, int i, int i_178_, int i_179_, int i_180_) {
		for (int i_181_ = 0; i_181_ < aClass505Array11915.length; i_181_++) {
			byte i_182_ = 0;
			if (0 == i_181_)
				i_182_ = (byte) 2;
			else if (1 == i_181_)
				i_182_ = (byte) 5;
			else if (2 == i_181_)
				i_182_ = (byte) 1;
			else if (i_181_ == 3)
				i_182_ = (byte) 7;
			else if (i_181_ == 4)
				i_182_ = (byte) 8;
			Class505 class505 = aClass505Array11915[i_181_];
			if (-1 != 1429262853 * class505.anInt6909 && !class505.aClass695_6911.method14172(1411611189)) {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81((class505.anInt6909 * 1429262853), -1444068644));
				int i_183_ = i;
				if (0 != -895692681 * class505.anInt6912)
					i_183_ |= 0x5;
				if (0 != 1207155589 * class505.anInt6910)
					i_183_ |= 0x2;
				if (class505.anInt6908 * -1969310245 >= 0)
					i_183_ |= 0x7;
				if (-1969310245 * class505.anInt6908 >= 0 && null != class587.anIntArrayArray7744 && (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908]) != null) {
					Class176 class176 = (aClass176Array11952[i_181_ + 1] = class685.method13931(class180, i_183_, class505.aClass695_6911, i_182_, (short) 17131));
					if (class176 != null) {
						int i_184_ = 0;
						int i_185_ = 0;
						int i_186_ = 0;
						if (class587.anIntArrayArray7744 != null && null != (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908])) {
							i_184_ += (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908][0]);
							i_185_ += (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908][1]);
							i_186_ += (class587.anIntArrayArray7744[-1969310245 * class505.anInt6908][2]);
						}
						if (null != class587.anIntArrayArray7745 && null != (class587.anIntArrayArray7745[-1969310245 * class505.anInt6908])) {
							i_184_ += (class587.anIntArrayArray7745[-1969310245 * class505.anInt6908][0]);
							i_185_ += (class587.anIntArrayArray7745[-1969310245 * class505.anInt6908][1]);
							i_186_ += (class587.anIntArrayArray7745[-1969310245 * class505.anInt6908][2]);
						}
						if (i_186_ != 0 || i_184_ != 0) {
							int i_187_ = i_180_;
							if (null != anIntArray11935 && (anIntArray11935[-1969310245 * class505.anInt6908]) != -1)
								i_187_ = (anIntArray11935[-1969310245 * class505.anInt6908]);
							int i_188_ = ((i_187_ + class505.anInt6912 * -427575296 - i_180_) & 0x3fff);
							if (0 != i_188_)
								class176.method2911(i_188_);
							int i_189_ = Class428.anIntArray4825[i_188_];
							int i_190_ = Class428.anIntArray4819[i_188_];
							int i_191_ = i_190_ * i_184_ + i_186_ * i_189_ >> 14;
							i_186_ = i_190_ * i_186_ - i_184_ * i_189_ >> 14;
							i_184_ = i_191_;
						}
						class176.method3015(i_184_, i_185_, i_186_);
						if (1207155589 * class505.anInt6910 != 0)
							class176.method3015(0, -(1207155589 * class505.anInt6910) << 2, 0);
						class176.aBool1953 = false;
					}
				} else {
					Class176 class176 = (aClass176Array11952[1 + i_181_] = class685.method13932(class180, i_183_, (class505.anInt6912 * -427575296), 299555935 * anInt11927, -1105701807 * anInt11943, -1914574331 * anInt11888, class505.aClass695_6911, i_182_, (byte) 0));
					if (class176 != null) {
						if (1207155589 * class505.anInt6910 != 0)
							class176.method3015(0, -(class505.anInt6910 * 1207155589) << 2, 0);
						class176.aBool1953 = false;
					}
				}
			} else
				aClass176Array11952[i_181_ + 1] = null;
		}
	}

	void method18574() {
		if (aClass613_11949 != null)
			aClass613_11949.method10129();
	}

	public final void method18575(int i) {
		Class544 class544 = ((Class544) Class536_Sub1.aClass24_Sub13_10343.method81(i, 2081066265));
		for (Class522_Sub1 class522_sub1 = (Class522_Sub1) aClass705_11912.method14317(297060422); class522_sub1 != null; class522_sub1 = (Class522_Sub1) aClass705_11912.method14320((byte) -67)) {
			if (class544 == class522_sub1.aClass544_10291) {
				class522_sub1.method8682(985356672);
				break;
			}
		}
	}

	public final void method18576(int i, int i_192_, int i_193_, int i_194_, boolean bool, int i_195_) {
		Class505 class505 = aClass505Array11915[i_195_];
		int i_196_ = class505.anInt6909 * 1429262853;
		if (i != -1 && -1 != i_196_) {
			if (i_196_ == i) {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(i, -712767501));
				if (class685.aBool8665 && -1 != -1567837355 * class685.anInt8671) {
					Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, 161762712)));
					int i_197_ = -667661221 * class198.anInt2186;
					if (0 == i_197_)
						return;
					if (2 == i_197_) {
						class505.aClass695_6911.method14184((byte) 43);
						return;
					}
				}
			} else {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(i, 159744608));
				Class685 class685_198_ = ((Class685) Class57.aClass24_Sub4_720.method81(i_196_, -1300946355));
				if (-1 != class685.anInt8671 * -1567837355 && -1567837355 * class685_198_.anInt8671 != -1) {
					Class198 class198 = ((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, -1700915199)));
					Class198 class198_199_ = (Class198) (Class321.aClass24_Sub10_3551.method81(class685_198_.anInt8671 * -1567837355, -362848942));
					if (class198.anInt2191 * 40010509 < class198_199_.anInt2191 * 40010509)
						return;
				}
			}
		}
		int i_200_ = 0;
		if (-1 != i && !(((Class685) Class57.aClass24_Sub4_720.method81(i, 742111399)).aBool8665))
			i_200_ = 2;
		if (-1 != i && bool)
			i_200_ = 1;
		class505.anInt6909 = i * -82367795;
		class505.anInt6908 = i_194_ * 1669348947;
		class505.anInt6910 = 706413901 * (i_192_ >> 16);
		class505.anInt6912 = i_193_ * 2009205063;
		class505.aClass695_6911.method14238((i != -1 ? (((Class685) Class57.aClass24_Sub4_720.method81(i, -237122327)).anInt8671) * -1567837355 : -1), i_192_ & 0xffff, i_200_, false, 2124615852);
	}

	public final void method18577() {
		anInt11942 = 0;
		anInt11947 = 0;
	}

	public final void method18578() {
		anInt11942 = 0;
		anInt11947 = 0;
	}

	public final void method18579() {
		anInt11942 = 0;
		anInt11947 = 0;
	}

	public int method18580() {
		Class587 class587 = method18542(-2035223226);
		int i = aClass61_11936.anInt725 * 1085423875;
		boolean bool;
		if (class587.anInt7726 * 754557379 != 0)
			bool = aClass61_11936.method1389(1672946997 * anInt11938, class587.anInt7726 * 754557379, 1681160699 * class587.anInt7750, 1401117677);
		else
			bool = aClass61_11936.method1389(1672946997 * anInt11938, anInt11937 * 2021896877, anInt11937 * 2021896877, 1539980053);
		int i_201_ = aClass61_11936.anInt725 * 1085423875 - i;
		if (i_201_ != 0)
			anInt11901 += 1719838789;
		else {
			anInt11901 = 0;
			aClass61_11936.method1383(anInt11938 * 1672946997, -1930907953);
		}
		if (bool) {
			if (class587.anInt7725 * -268296813 != 0) {
				if (i_201_ > 0)
					aClass61_11940.method1389(class587.anInt7753 * -353138087, class587.anInt7725 * -268296813, -1073392833 * class587.anInt7722, -384227427);
				else
					aClass61_11940.method1389(-(class587.anInt7753 * -353138087), -268296813 * class587.anInt7725, -1073392833 * class587.anInt7722, -1610568697);
			}
			if (0 != class587.anInt7751 * 809230621)
				aClass61_11941.method1389(class587.anInt7756 * -1624976099, class587.anInt7751 * 809230621, 2047116291 * class587.anInt7747, -355572007);
		} else {
			if (class587.anInt7725 * -268296813 != 0)
				aClass61_11940.method1389(0, -268296813 * class587.anInt7725, -1073392833 * class587.anInt7722, 233526498);
			else
				aClass61_11940.method1383(0, -2027561513);
			if (0 != 809230621 * class587.anInt7751)
				aClass61_11941.method1389(0, 809230621 * class587.anInt7751, 2047116291 * class587.anInt7747, -1646327512);
			else
				aClass61_11941.method1383(0, -2057880481);
		}
		return i_201_;
	}

	void method18581(Class176 class176) {
		int i = aClass61_11940.anInt725 * 1085423875;
		int i_202_ = 1085423875 * aClass61_11941.anInt725;
		if (0 != i || 0 != i_202_) {
			int i_203_ = class176.method2896() / 2;
			class176.method3015(0, -i_203_, 0);
			class176.method2869(i & 0x3fff);
			class176.method2868(i_202_ & 0x3fff);
			class176.method3015(0, i_203_, 0);
		}
	}

	public final void method18582(int i, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_) {
		boolean bool = true;
		boolean bool_209_ = true;
		for (int i_210_ = 0; i_210_ < Class536.aClass615_7224.anInt8038 * -66822073; i_210_++) {
			if (anIntArray11906[i_210_] > i_207_)
				bool = false;
			else
				bool_209_ = false;
		}
		int i_211_ = -1;
		int i_212_ = -1;
		int i_213_ = 0;
		if (i >= 0) {
			Class589 class589 = ((Class589) Class234.aClass24_Sub18_2375.method81(i, 1275785441));
			i_212_ = class589.anInt7780 * 651590369;
			i_213_ = 346458345 * class589.anInt7779;
		}
		if (bool_209_) {
			if (i_212_ == -1)
				return;
			i_211_ = 0;
			int i_214_ = 0;
			if (0 == i_212_)
				i_214_ = anIntArray11906[0];
			else if (1 == i_212_)
				i_214_ = anIntArray11905[0];
			for (int i_215_ = 1; i_215_ < -66822073 * Class536.aClass615_7224.anInt8038; i_215_++) {
				if (0 == i_212_) {
					if (anIntArray11906[i_215_] < i_214_) {
						i_211_ = i_215_;
						i_214_ = anIntArray11906[i_215_];
					}
				} else if (i_212_ == 1 && anIntArray11905[i_215_] < i_214_) {
					i_211_ = i_215_;
					i_214_ = anIntArray11905[i_215_];
				}
			}
			if (i_212_ == 1 && i_214_ >= i_204_)
				return;
		} else {
			if (bool)
				aByte11928 = (byte) 0;
			for (int i_216_ = 0; i_216_ < Class536.aClass615_7224.anInt8038 * -66822073; i_216_++) {
				int i_217_ = aByte11928;
				aByte11928 = (byte) ((aByte11928 + 1) % (-66822073 * Class536.aClass615_7224.anInt8038));
				if (anIntArray11906[i_217_] <= i_207_) {
					i_211_ = i_217_;
					break;
				}
			}
		}
		if (i_211_ >= 0) {
			anIntArray11904[i_211_] = i;
			anIntArray11905[i_211_] = i_204_;
			anIntArray11894[i_211_] = i_205_;
			anIntArray11919[i_211_] = i_206_;
			anIntArray11906[i_211_] = i_213_ + i_207_ + i_208_;
		}
	}

	public void method18337() {
		int i = 240 + (anInt11889 * 1053416001 - 1 << 8);
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = (short) ((int) class442.aFloat4918 - i >> 9);
		aShort11771 = (short) ((int) class442.aFloat4919 - i >> 9);
		aShort11770 = (short) ((int) class442.aFloat4918 + i >> 9);
		aShort11772 = (short) ((int) class442.aFloat4919 + i >> 9);
	}

	public final void method18583(int i) {
		Class544 class544 = ((Class544) Class536_Sub1.aClass24_Sub13_10343.method81(i, -1711621126));
		for (Class522_Sub1 class522_sub1 = (Class522_Sub1) aClass705_11912.method14317(297060422); class522_sub1 != null; class522_sub1 = (Class522_Sub1) aClass705_11912.method14320((byte) -113)) {
			if (class544 == class522_sub1.aClass544_10291) {
				class522_sub1.method8682(-634180259);
				break;
			}
		}
	}

	public void method18584(int i) {
		anInt11889 = i * 1491285441;
	}

	public void method18585(int i, int i_218_) {
		anInt11889 = i * 1491285441;
	}

	public int method18586() {
		return 1053416001 * anInt11889;
	}

	Class640_Sub1_Sub2_Sub1(Class555 class555, int i, Class95_Sub1 class95_sub1) {
		super(class555, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		anInt11889 = 1491285441;
		anInt11891 = -1374912512;
		anInt11892 = 731086848;
		aBool11893 = true;
		anInt11908 = 0;
		anInt11896 = 1321046293;
		anInt11897 = 0;
		anInt11903 = 0;
		aByte11928 = (byte) 0;
		anIntArray11904 = new int[-66822073 * Class536.aClass615_7224.anInt8038];
		anIntArray11905 = new int[-66822073 * Class536.aClass615_7224.anInt8038];
		anIntArray11906 = new int[Class536.aClass615_7224.anInt8038 * -66822073];
		anIntArray11894 = new int[Class536.aClass615_7224.anInt8038 * -66822073];
		anIntArray11919 = new int[Class536.aClass615_7224.anInt8038 * -66822073];
		aClass705_11912 = new Class705();
		anInt11910 = 1271780505;
		anIntArray11931 = null;
		aClass695_Sub2_11913 = new Class695_Sub2(this, false);
		aClass695_11914 = new Class695_Sub3(this, false);
		anInt11925 = -443123777;
		anInt11926 = 1162867085;
		aByte11898 = (byte) 0;
		anInt11899 = -342166455;
		anInt11932 = 0;
		anInt11933 = 0;
		anInt11901 = 0;
		anInt11937 = 1719739648;
		aClass61_11936 = new Class61();
		aClass61_11940 = new Class61();
		aClass61_11941 = new Class61();
		anInt11942 = 0;
		anInt11946 = 0;
		anInt11947 = 0;
		anInt11918 = 0;
		aBool11950 = false;
		aBool11951 = false;
		anInt11922 = -191903581;
		anInt11956 = -1459584853;
		anInterface19_11957 = new Class526(this);
		anIntArray11902 = new int[i];
		anIntArray11944 = new int[i];
		aByteArray11945 = new byte[i];
		aClass176Array11952 = new Class176[6];
		aClass505Array11915 = new Class505[5];
		for (int i_219_ = 0; i_219_ < 5; i_219_++)
			aClass505Array11915[i_219_] = new Class505(this);
		aClass695_Sub3_Sub1Array11934 = (new Class695_Sub3_Sub1[Class443.aClass616_4922.anIntArray8086.length]);
		anInterface3_11953 = new Class18(class95_sub1);
	}

	public int method18587() {
		return 1053416001 * anInt11889;
	}

	public int method18588() {
		return 1053416001 * anInt11889;
	}

	public int method18589() {
		return 1053416001 * anInt11889;
	}

	void method18590(Class176 class176) {
		int i = aClass61_11940.anInt725 * 1085423875;
		int i_220_ = 1085423875 * aClass61_11941.anInt725;
		if (0 != i || 0 != i_220_) {
			int i_221_ = class176.method2896() / 2;
			class176.method3015(0, -i_221_, 0);
			class176.method2869(i & 0x3fff);
			class176.method2868(i_220_ & 0x3fff);
			class176.method3015(0, i_221_, 0);
		}
	}

	void method18591(int i, int i_222_, int i_223_, int i_224_, int i_225_, byte i_226_) {
		Class442 class442 = method10637().aClass442_4927;
		int i_227_ = aShort11770 + aShort11775 >> 1;
		int i_228_ = aShort11771 + aShort11772 >> 1;
		int i_229_ = Class428.anIntArray4825[i];
		int i_230_ = Class428.anIntArray4819[i];
		int i_231_ = -i_222_ / 2;
		int i_232_ = -i_223_ / 2;
		int i_233_ = i_231_ * i_230_ + i_229_ * i_232_ >> 14;
		int i_234_ = i_232_ * i_230_ - i_231_ * i_229_ >> 14;
		int i_235_ = Class634.method10548((int) class442.aFloat4918 + i_233_, i_234_ + (int) class442.aFloat4919, i_227_, i_228_, aByte10864, (byte) 24);
		int i_236_ = i_222_ / 2;
		int i_237_ = -i_223_ / 2;
		int i_238_ = i_230_ * i_236_ + i_237_ * i_229_ >> 14;
		int i_239_ = i_237_ * i_230_ - i_229_ * i_236_ >> 14;
		int i_240_ = Class634.method10548(i_238_ + (int) class442.aFloat4918, i_239_ + (int) class442.aFloat4919, i_227_, i_228_, aByte10864, (byte) -9);
		int i_241_ = -i_222_ / 2;
		int i_242_ = i_223_ / 2;
		int i_243_ = i_229_ * i_242_ + i_230_ * i_241_ >> 14;
		int i_244_ = i_230_ * i_242_ - i_241_ * i_229_ >> 14;
		int i_245_ = Class634.method10548((int) class442.aFloat4918 + i_243_, (int) class442.aFloat4919 + i_244_, i_227_, i_228_, aByte10864, (byte) 64);
		int i_246_ = i_222_ / 2;
		int i_247_ = i_223_ / 2;
		int i_248_ = i_246_ * i_230_ + i_247_ * i_229_ >> 14;
		int i_249_ = i_247_ * i_230_ - i_246_ * i_229_ >> 14;
		int i_250_ = Class634.method10548(i_248_ + (int) class442.aFloat4918, i_249_ + (int) class442.aFloat4919, i_227_, i_228_, aByte10864, (byte) -44);
		int i_251_ = i_235_ < i_240_ ? i_235_ : i_240_;
		int i_252_ = i_245_ < i_250_ ? i_245_ : i_250_;
		int i_253_ = i_240_ < i_250_ ? i_240_ : i_250_;
		int i_254_ = i_235_ < i_245_ ? i_235_ : i_245_;
		anInt11927 = ((int) (Math.atan2((double) (i_251_ - i_252_), (double) i_223_) * 2607.5945876176133) & 0x3fff) * -2096988257;
		anInt11943 = ((int) (Math.atan2((double) (i_254_ - i_253_), (double) i_222_) * 2607.5945876176133) & 0x3fff) * -366381903;
		if (0 != 299555935 * anInt11927 && i_224_ != 0) {
			int i_255_ = 16384 - i_224_;
			if (299555935 * anInt11927 > 8192) {
				if (anInt11927 * 299555935 < i_255_)
					anInt11927 = -2096988257 * i_255_;
			} else if (anInt11927 * 299555935 > i_224_)
				anInt11927 = i_224_ * -2096988257;
		}
		if (0 != -1105701807 * anInt11943 && i_225_ != 0) {
			int i_256_ = 16384 - i_225_;
			if (anInt11943 * -1105701807 > 8192) {
				if (-1105701807 * anInt11943 < i_256_)
					anInt11943 = i_256_ * -366381903;
			} else if (anInt11943 * -1105701807 > i_225_)
				anInt11943 = -366381903 * i_225_;
		}
		anInt11888 = (i_250_ + i_235_) * 3822285;
		if (i_240_ + i_245_ < anInt11888 * -1914574331)
			anInt11888 = (i_240_ + i_245_) * 3822285;
		anInt11888 = ((anInt11888 * -1914574331 >> 1) - (int) class442.aFloat4915) * 3822285;
	}

	public void method18592(int i, int i_257_, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, short i_264_) {
		if (method18549(-1052134928))
			client.method17442(aClass240_11954, aClass240_11954.method4384(-1030451686), -1, i, i_257_, i_258_, i_259_, i_260_, i_261_, i_262_, i_263_);
	}

	void method18593(int i, int i_265_, int i_266_, int i_267_, int i_268_) {
		Class442 class442 = method10637().aClass442_4927;
		int i_269_ = aShort11770 + aShort11775 >> 1;
		int i_270_ = aShort11771 + aShort11772 >> 1;
		int i_271_ = Class428.anIntArray4825[i];
		int i_272_ = Class428.anIntArray4819[i];
		int i_273_ = -i_265_ / 2;
		int i_274_ = -i_266_ / 2;
		int i_275_ = i_273_ * i_272_ + i_271_ * i_274_ >> 14;
		int i_276_ = i_274_ * i_272_ - i_273_ * i_271_ >> 14;
		int i_277_ = Class634.method10548((int) class442.aFloat4918 + i_275_, i_276_ + (int) class442.aFloat4919, i_269_, i_270_, aByte10864, (byte) 53);
		int i_278_ = i_265_ / 2;
		int i_279_ = -i_266_ / 2;
		int i_280_ = i_272_ * i_278_ + i_279_ * i_271_ >> 14;
		int i_281_ = i_279_ * i_272_ - i_271_ * i_278_ >> 14;
		int i_282_ = Class634.method10548(i_280_ + (int) class442.aFloat4918, i_281_ + (int) class442.aFloat4919, i_269_, i_270_, aByte10864, (byte) -23);
		int i_283_ = -i_265_ / 2;
		int i_284_ = i_266_ / 2;
		int i_285_ = i_271_ * i_284_ + i_272_ * i_283_ >> 14;
		int i_286_ = i_272_ * i_284_ - i_283_ * i_271_ >> 14;
		int i_287_ = Class634.method10548((int) class442.aFloat4918 + i_285_, (int) class442.aFloat4919 + i_286_, i_269_, i_270_, aByte10864, (byte) -51);
		int i_288_ = i_265_ / 2;
		int i_289_ = i_266_ / 2;
		int i_290_ = i_288_ * i_272_ + i_289_ * i_271_ >> 14;
		int i_291_ = i_289_ * i_272_ - i_288_ * i_271_ >> 14;
		int i_292_ = Class634.method10548(i_290_ + (int) class442.aFloat4918, i_291_ + (int) class442.aFloat4919, i_269_, i_270_, aByte10864, (byte) 33);
		int i_293_ = i_277_ < i_282_ ? i_277_ : i_282_;
		int i_294_ = i_287_ < i_292_ ? i_287_ : i_292_;
		int i_295_ = i_282_ < i_292_ ? i_282_ : i_292_;
		int i_296_ = i_277_ < i_287_ ? i_277_ : i_287_;
		anInt11927 = ((int) (Math.atan2((double) (i_293_ - i_294_), (double) i_266_) * 2607.5945876176133) & 0x3fff) * -2096988257;
		anInt11943 = ((int) (Math.atan2((double) (i_296_ - i_295_), (double) i_265_) * 2607.5945876176133) & 0x3fff) * -366381903;
		if (0 != 299555935 * anInt11927 && i_267_ != 0) {
			int i_297_ = 16384 - i_267_;
			if (299555935 * anInt11927 > 8192) {
				if (anInt11927 * 299555935 < i_297_)
					anInt11927 = -2096988257 * i_297_;
			} else if (anInt11927 * 299555935 > i_267_)
				anInt11927 = i_267_ * -2096988257;
		}
		if (0 != -1105701807 * anInt11943 && i_268_ != 0) {
			int i_298_ = 16384 - i_268_;
			if (anInt11943 * -1105701807 > 8192) {
				if (-1105701807 * anInt11943 < i_298_)
					anInt11943 = i_298_ * -366381903;
			} else if (anInt11943 * -1105701807 > i_268_)
				anInt11943 = -366381903 * i_268_;
		}
		anInt11888 = (i_292_ + i_277_) * 3822285;
		if (i_282_ + i_287_ < anInt11888 * -1914574331)
			anInt11888 = (i_282_ + i_287_) * 3822285;
		anInt11888 = ((anInt11888 * -1914574331 >> 1) - (int) class442.aFloat4915) * 3822285;
	}

	public final void method18594(int i, int i_299_, int i_300_, int i_301_, int i_302_, int i_303_) {
		boolean bool = true;
		boolean bool_304_ = true;
		for (int i_305_ = 0; i_305_ < Class536.aClass615_7224.anInt8038 * -66822073; i_305_++) {
			if (anIntArray11906[i_305_] > i_302_)
				bool = false;
			else
				bool_304_ = false;
		}
		int i_306_ = -1;
		int i_307_ = -1;
		int i_308_ = 0;
		if (i >= 0) {
			Class589 class589 = ((Class589) Class234.aClass24_Sub18_2375.method81(i, -2092360411));
			i_307_ = class589.anInt7780 * 651590369;
			i_308_ = 346458345 * class589.anInt7779;
		}
		if (bool_304_) {
			if (i_307_ == -1)
				return;
			i_306_ = 0;
			int i_309_ = 0;
			if (0 == i_307_)
				i_309_ = anIntArray11906[0];
			else if (1 == i_307_)
				i_309_ = anIntArray11905[0];
			for (int i_310_ = 1; i_310_ < -66822073 * Class536.aClass615_7224.anInt8038; i_310_++) {
				if (0 == i_307_) {
					if (anIntArray11906[i_310_] < i_309_) {
						i_306_ = i_310_;
						i_309_ = anIntArray11906[i_310_];
					}
				} else if (i_307_ == 1 && anIntArray11905[i_310_] < i_309_) {
					i_306_ = i_310_;
					i_309_ = anIntArray11905[i_310_];
				}
			}
			if (i_307_ == 1 && i_309_ >= i_299_)
				return;
		} else {
			if (bool)
				aByte11928 = (byte) 0;
			for (int i_311_ = 0; i_311_ < Class536.aClass615_7224.anInt8038 * -66822073; i_311_++) {
				int i_312_ = aByte11928;
				aByte11928 = (byte) ((aByte11928 + 1) % (-66822073 * Class536.aClass615_7224.anInt8038));
				if (anIntArray11906[i_312_] <= i_302_) {
					i_306_ = i_312_;
					break;
				}
			}
		}
		if (i_306_ >= 0) {
			anIntArray11904[i_306_] = i;
			anIntArray11905[i_306_] = i_299_;
			anIntArray11894[i_306_] = i_300_;
			anIntArray11919[i_306_] = i_301_;
			anIntArray11906[i_306_] = i_308_ + i_302_ + i_303_;
		}
	}

	abstract int method18595();

	abstract int method18596();

	public void method18597(int i, int i_313_, int i_314_, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_) {
		if (method18549(-1052134928))
			client.method17442(aClass240_11954, aClass240_11954.method4384(-1030451686), -1, i, i_313_, i_314_, i_315_, i_316_, i_317_, i_318_, i_319_);
	}

	public void method18598(String string, int i, int i_320_, int i_321_, int i_322_) {
		if (null == aClass523_11921)
			aClass523_11921 = new Class523();
		aClass523_11921.aString7090 = string;
		aClass523_11921.anInt7093 = i * -2053580521;
		aClass523_11921.anInt7092 = -1781221627 * i_320_;
		aClass523_11921.anInt7094 = (aClass523_11921.anInt7091 = 1570909915 * i_321_) * -430941535;
	}

	public abstract int method18599();

	public abstract int method18600();

	public void method18601() {
		if (aClass523_11921 != null && null != aClass523_11921.aString7090) {
			aClass523_11921.anInt7094 -= 1307080123;
			if (0 == -991885453 * aClass523_11921.anInt7094)
				aClass523_11921.aString7090 = null;
		}
	}

	public void method18602(int i) {
		if (aClass523_11921 != null && null != aClass523_11921.aString7090) {
			aClass523_11921.anInt7094 -= 1307080123;
			if (0 == -991885453 * aClass523_11921.anInt7094)
				aClass523_11921.aString7090 = null;
		}
	}

	public int method18603() {
		return 1053416001 * anInt11889;
	}

	public abstract boolean method18604();

	public abstract boolean method18605();

	public abstract boolean method18606();

	public abstract boolean method18607();

	public void method18608(int i, int i_323_, int i_324_, int i_325_, int i_326_, int i_327_, int i_328_) {
		if (!method18549(-1052134928)) {
			if (-1 != i)
				client.aBoolArray11310[i] = true;
			else {
				for (int i_329_ = 0; i_329_ < 102; i_329_++)
					client.aBoolArray11310[i_329_] = true;
			}
		} else
			Class485.method7957(aClass240_11954.method4384(-1030451686), -1, i_323_, i_324_, i_325_, i_326_, i_327_, i_328_, i, false, -778597877);
	}

	boolean method17053() {
		return aBool11951;
	}

	public void method18609(String string, int i, int i_330_, int i_331_) {
		if (null == aClass523_11921)
			aClass523_11921 = new Class523();
		aClass523_11921.aString7090 = string;
		aClass523_11921.anInt7093 = i * -2053580521;
		aClass523_11921.anInt7092 = -1781221627 * i_330_;
		aClass523_11921.anInt7094 = (aClass523_11921.anInt7091 = 1570909915 * i_331_) * -430941535;
	}

	Class640_Sub1_Sub2_Sub1(Class555 class555, Class95_Sub1 class95_sub1) {
		this(class555, 10, class95_sub1);
	}

	boolean method18610() {
		if (922256893 * anInt11956 == -1)
			return false;
		return method18561(922256893 * anInt11956, -638045982);
	}

	boolean method18611() {
		if (922256893 * anInt11956 == -1)
			return false;
		return method18561(922256893 * anInt11956, -84007284);
	}

	boolean method18612() {
		if (922256893 * anInt11956 == -1)
			return false;
		return method18561(922256893 * anInt11956, -2010713567);
	}

	boolean method18613(int i) {
		if (212522229 * anInt11922 == i)
			return true;
		aClass240_11954 = Class700_Sub26.method17192(i, null, null, true, 1911765714);
		if (aClass240_11954 == null)
			return false;
		anInt11922 = 191903581 * i;
		Class203.method3777(aClass240_11954.aClass243Array2392, (byte) 54);
		return true;
	}

	boolean method18614(int i) {
		if (212522229 * anInt11922 == i)
			return true;
		aClass240_11954 = Class700_Sub26.method17192(i, null, null, true, 1826993602);
		if (aClass240_11954 == null)
			return false;
		anInt11922 = 191903581 * i;
		Class203.method3777(aClass240_11954.aClass243Array2392, (byte) 49);
		return true;
	}

	public void method18615(int i, int i_332_, int i_333_, int i_334_, int i_335_, int i_336_, int i_337_, int i_338_) {
		if (method18549(-1052134928))
			client.method17442(aClass240_11954, aClass240_11954.method4384(-1030451686), -1, i, i_332_, i_333_, i_334_, i_335_, i_336_, i_337_, i_338_);
	}

	public void method18616(String string, int i, int i_339_, int i_340_) {
		if (null == aClass523_11921)
			aClass523_11921 = new Class523();
		aClass523_11921.aString7090 = string;
		aClass523_11921.anInt7093 = i * -2053580521;
		aClass523_11921.anInt7092 = -1781221627 * i_339_;
		aClass523_11921.anInt7094 = (aClass523_11921.anInt7091 = 1570909915 * i_340_) * -430941535;
	}

	public void method18617(int i, int i_341_, int i_342_, int i_343_, int i_344_, int i_345_, int i_346_) {
		if (!method18549(-1052134928)) {
			if (-1 != i)
				client.aBoolArray11310[i] = true;
			else {
				for (int i_347_ = 0; i_347_ < 102; i_347_++)
					client.aBoolArray11310[i_347_] = true;
			}
		} else
			Class485.method7957(aClass240_11954.method4384(-1030451686), -1, i_341_, i_342_, i_343_, i_344_, i_345_, i_346_, i, false, -2068067004);
	}

	abstract int method18618();

	public void method18619(int i, int i_348_, boolean bool) {
		if (method18549(-1052134928))
			Class384.method6421(aClass240_11954.aClass243Array2392, -1, i, i_348_, bool, (short) 11273);
	}

	public void method18620(int i, int i_349_, boolean bool) {
		if (method18549(-1052134928))
			Class384.method6421(aClass240_11954.aClass243Array2392, -1, i, i_349_, bool, (short) -18146);
	}

	public void method18621(int i, int i_350_, boolean bool) {
		if (method18549(-1052134928))
			Class384.method6421(aClass240_11954.aClass243Array2392, -1, i, i_350_, bool, (short) 330);
	}

	public void method18622(int i, int i_351_, boolean bool) {
		if (method18549(-1052134928))
			Class384.method6421(aClass240_11954.aClass243Array2392, -1, i, i_351_, bool, (short) 7345);
	}

	public abstract int method18623();

	public void method18624(int i, int i_352_, boolean bool, int i_353_) {
		if (method18549(-1052134928))
			Class384.method6421(aClass240_11954.aClass243Array2392, -1, i, i_352_, bool, (short) -5467);
	}

	public abstract int method18625();

	public abstract int method18626();

	public void method18627() {
		if (aClass523_11921 != null && null != aClass523_11921.aString7090) {
			aClass523_11921.anInt7094 -= 1307080123;
			if (0 == -991885453 * aClass523_11921.anInt7094)
				aClass523_11921.aString7090 = null;
		}
	}

	public void method18336() {
		int i = 240 + (anInt11889 * 1053416001 - 1 << 8);
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = (short) ((int) class442.aFloat4918 - i >> 9);
		aShort11771 = (short) ((int) class442.aFloat4919 - i >> 9);
		aShort11770 = (short) ((int) class442.aFloat4918 + i >> 9);
		aShort11772 = (short) ((int) class442.aFloat4919 + i >> 9);
	}

	public void method18341() {
		int i = 240 + (anInt11889 * 1053416001 - 1 << 8);
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = (short) ((int) class442.aFloat4918 - i >> 9);
		aShort11771 = (short) ((int) class442.aFloat4919 - i >> 9);
		aShort11770 = (short) ((int) class442.aFloat4918 + i >> 9);
		aShort11772 = (short) ((int) class442.aFloat4919 + i >> 9);
	}

	void method18628() {
		if (aClass613_11949 != null)
			aClass613_11949.method10129();
	}

	public int method17061() {
		Class587 class587 = method18542(-1531892174);
		int i;
		if (-1 != 750844545 * class587.anInt7758)
			i = class587.anInt7758 * 750844545;
		else if (-32768 == anInt11892 * 480794473)
			i = 200;
		else
			i = -(480794473 * anInt11892);
		Class445 class445 = method10637();
		int i_354_ = (int) class445.aClass442_4927.aFloat4918 >> 9;
		int i_355_ = (int) class445.aClass442_4927.aFloat4919 >> 9;
		if (aClass555_10867 != null && i_354_ >= 1 && i_355_ >= 1 && i_354_ <= client.aClass509_11072.method8284((byte) 59) - 1 && i_355_ <= client.aClass509_11072.method8285(916348246) - 1) {
			Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][i_354_][i_355_]);
			if (null != class561 && class561.aClass640_Sub1_Sub4_7556 != null)
				return i + class561.aClass640_Sub1_Sub4_7556.aShort11871;
		}
		return i;
	}

	public void method18339() {
		int i = 240 + (anInt11889 * 1053416001 - 1 << 8);
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = (short) ((int) class442.aFloat4918 - i >> 9);
		aShort11771 = (short) ((int) class442.aFloat4919 - i >> 9);
		aShort11770 = (short) ((int) class442.aFloat4918 + i >> 9);
		aShort11772 = (short) ((int) class442.aFloat4919 + i >> 9);
	}

	public void method18340() {
		int i = 240 + (anInt11889 * 1053416001 - 1 << 8);
		Class442 class442 = method10637().aClass442_4927;
		aShort11775 = (short) ((int) class442.aFloat4918 - i >> 9);
		aShort11771 = (short) ((int) class442.aFloat4919 - i >> 9);
		aShort11770 = (short) ((int) class442.aFloat4918 + i >> 9);
		aShort11772 = (short) ((int) class442.aFloat4919 + i >> 9);
	}

	public abstract Class523 method18629();

	public abstract Class523 method18630();

	public final void method18631(short i) {
		anInt11942 = 0;
		anInt11947 = 0;
	}
}
