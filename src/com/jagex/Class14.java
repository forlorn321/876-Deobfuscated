/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public final class Class14 implements Iterable {
	long aLong183;
	Class527[] aClass527Array184;
	int anInt185;
	Class527 aClass527_186;
	Class527 aClass527_187;
	int anInt188 = 0;

	public int method708(Class527[] class527s, int i) {
		int i_0_ = 0;
		for (int i_1_ = 0; i_1_ < anInt185 * -778154051; i_1_++) {
			Class527 class527 = aClass527Array184[i_1_];
			for (Class527 class527_2_ = class527.aClass527_7105; class527 != class527_2_; class527_2_ = class527_2_.aClass527_7105)
				class527s[i_0_++] = class527_2_;
		}
		return i_0_;
	}

	public Class14(int i) {
		anInt185 = i * -1582046315;
		aClass527Array184 = new Class527[i];
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			Class527 class527 = aClass527Array184[i_3_] = new Class527();
			class527.aClass527_7105 = class527;
			class527.aClass527_7107 = class527;
		}
	}

	public Class527 method709(long l) {
		aLong183 = 5765199951630978051L * l;
		Class527 class527 = (aClass527Array184[(int) (l & (long) (-778154051 * anInt185 - 1))]);
		for (aClass527_186 = class527.aClass527_7105; aClass527_186 != class527; aClass527_186 = aClass527_186.aClass527_7105) {
			if (l == -8168620736534281759L * aClass527_186.aLong7106) {
				Class527 class527_4_ = aClass527_186;
				aClass527_186 = aClass527_186.aClass527_7105;
				return class527_4_;
			}
		}
		aClass527_186 = null;
		return null;
	}

	public void method710(Class527 class527, long l) {
		if (null != class527.aClass527_7107)
			class527.method8735(-1889161967);
		Class527 class527_5_ = (aClass527Array184[(int) (l & (long) (anInt185 * -778154051 - 1))]);
		class527.aClass527_7107 = class527_5_.aClass527_7107;
		class527.aClass527_7105 = class527_5_;
		class527.aClass527_7107.aClass527_7105 = class527;
		class527.aClass527_7105.aClass527_7107 = class527;
		class527.aLong7106 = l * -42244196890836447L;
	}

	public int method711(int i) {
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < anInt185 * -778154051; i_7_++) {
			Class527 class527 = aClass527Array184[i_7_];
			for (Class527 class527_8_ = class527.aClass527_7105; class527 != class527_8_; class527_8_ = class527_8_.aClass527_7105)
				i_6_++;
		}
		return i_6_;
	}

	public Iterator iterator() {
		return new Class10(this);
	}

	public Class527 method712(long l) {
		aLong183 = 5765199951630978051L * l;
		Class527 class527 = (aClass527Array184[(int) (l & (long) (-778154051 * anInt185 - 1))]);
		for (aClass527_186 = class527.aClass527_7105; aClass527_186 != class527; aClass527_186 = aClass527_186.aClass527_7105) {
			if (l == -8168620736534281759L * aClass527_186.aLong7106) {
				Class527 class527_9_ = aClass527_186;
				aClass527_186 = aClass527_186.aClass527_7105;
				return class527_9_;
			}
		}
		aClass527_186 = null;
		return null;
	}

	public Class527 method713(byte i) {
		anInt188 = 0;
		return method717(678066668);
	}

	public void method714(Class527 class527, long l) {
		if (null != class527.aClass527_7107)
			class527.method8735(-1889161967);
		Class527 class527_10_ = (aClass527Array184[(int) (l & (long) (anInt185 * -778154051 - 1))]);
		class527.aClass527_7107 = class527_10_.aClass527_7107;
		class527.aClass527_7105 = class527_10_;
		class527.aClass527_7107.aClass527_7105 = class527;
		class527.aClass527_7105.aClass527_7107 = class527;
		class527.aLong7106 = l * -42244196890836447L;
	}

	public Class527 method715(int i) {
		if (aClass527_186 == null)
			return null;
		for (Class527 class527 = aClass527Array184[(int) (aLong183 * 8507509354890641067L & (long) (anInt185 * -778154051 - 1))]; aClass527_186 != class527; aClass527_186 = aClass527_186.aClass527_7105) {
			if (8507509354890641067L * aLong183 == -8168620736534281759L * aClass527_186.aLong7106) {
				Class527 class527_11_ = aClass527_186;
				aClass527_186 = aClass527_186.aClass527_7105;
				return class527_11_;
			}
		}
		aClass527_186 = null;
		return null;
	}

	public Iterator method716() {
		return new Class10(this);
	}

	public Class527 method717(int i) {
		if (anInt188 * -1742596755 > 0 && (aClass527Array184[anInt188 * -1742596755 - 1] != aClass527_187)) {
			Class527 class527 = aClass527_187;
			aClass527_187 = class527.aClass527_7105;
			return class527;
		}
		while (-1742596755 * anInt188 < -778154051 * anInt185) {
			Class527 class527 = (aClass527Array184[(anInt188 += -425182107) * -1742596755 - 1].aClass527_7105);
			if (aClass527Array184[-1742596755 * anInt188 - 1] != class527) {
				aClass527_187 = class527.aClass527_7105;
				return class527;
			}
		}
		return null;
	}

	public Class527 method718(long l) {
		aLong183 = 5765199951630978051L * l;
		Class527 class527 = (aClass527Array184[(int) (l & (long) (-778154051 * anInt185 - 1))]);
		for (aClass527_186 = class527.aClass527_7105; aClass527_186 != class527; aClass527_186 = aClass527_186.aClass527_7105) {
			if (l == -8168620736534281759L * aClass527_186.aLong7106) {
				Class527 class527_12_ = aClass527_186;
				aClass527_186 = aClass527_186.aClass527_7105;
				return class527_12_;
			}
		}
		aClass527_186 = null;
		return null;
	}

	public Class527 method719() {
		if (aClass527_186 == null)
			return null;
		for (Class527 class527 = aClass527Array184[(int) (aLong183 * 8507509354890641067L & (long) (anInt185 * -778154051 - 1))]; aClass527_186 != class527; aClass527_186 = aClass527_186.aClass527_7105) {
			if (8507509354890641067L * aLong183 == -8168620736534281759L * aClass527_186.aLong7106) {
				Class527 class527_13_ = aClass527_186;
				aClass527_186 = aClass527_186.aClass527_7105;
				return class527_13_;
			}
		}
		aClass527_186 = null;
		return null;
	}

	public int method720(Class527[] class527s) {
		int i = 0;
		for (int i_14_ = 0; i_14_ < anInt185 * -778154051; i_14_++) {
			Class527 class527 = aClass527Array184[i_14_];
			for (Class527 class527_15_ = class527.aClass527_7105; class527 != class527_15_; class527_15_ = class527_15_.aClass527_7105)
				class527s[i++] = class527_15_;
		}
		return i;
	}

	public void method721(int i) {
		for (int i_16_ = 0; i_16_ < anInt185 * -778154051; i_16_++) {
			Class527 class527 = aClass527Array184[i_16_];
			for (;;) {
				Class527 class527_17_ = class527.aClass527_7105;
				if (class527_17_ == class527)
					break;
				class527_17_.method8735(-1889161967);
			}
		}
		aClass527_186 = null;
		aClass527_187 = null;
	}

	public int method722(Class527[] class527s) {
		int i = 0;
		for (int i_18_ = 0; i_18_ < anInt185 * -778154051; i_18_++) {
			Class527 class527 = aClass527Array184[i_18_];
			for (Class527 class527_19_ = class527.aClass527_7105; class527 != class527_19_; class527_19_ = class527_19_.aClass527_7105)
				class527s[i++] = class527_19_;
		}
		return i;
	}

	public int method723() {
		int i = 0;
		for (int i_20_ = 0; i_20_ < anInt185 * -778154051; i_20_++) {
			Class527 class527 = aClass527Array184[i_20_];
			for (Class527 class527_21_ = class527.aClass527_7105; class527 != class527_21_; class527_21_ = class527_21_.aClass527_7105)
				i++;
		}
		return i;
	}

	public int method724() {
		int i = 0;
		for (int i_22_ = 0; i_22_ < anInt185 * -778154051; i_22_++) {
			Class527 class527 = aClass527Array184[i_22_];
			for (Class527 class527_23_ = class527.aClass527_7105; class527 != class527_23_; class527_23_ = class527_23_.aClass527_7105)
				i++;
		}
		return i;
	}

	public int method725() {
		int i = 0;
		for (int i_24_ = 0; i_24_ < anInt185 * -778154051; i_24_++) {
			Class527 class527 = aClass527Array184[i_24_];
			for (Class527 class527_25_ = class527.aClass527_7105; class527 != class527_25_; class527_25_ = class527_25_.aClass527_7105)
				i++;
		}
		return i;
	}

	public void method726(Class527 class527, long l) {
		if (null != class527.aClass527_7107)
			class527.method8735(-1889161967);
		Class527 class527_26_ = (aClass527Array184[(int) (l & (long) (anInt185 * -778154051 - 1))]);
		class527.aClass527_7107 = class527_26_.aClass527_7107;
		class527.aClass527_7105 = class527_26_;
		class527.aClass527_7107.aClass527_7105 = class527;
		class527.aClass527_7105.aClass527_7107 = class527;
		class527.aLong7106 = l * -42244196890836447L;
	}

	public Class527 method727() {
		anInt188 = 0;
		return method717(-2058594541);
	}

	public int method728(Class527[] class527s) {
		int i = 0;
		for (int i_27_ = 0; i_27_ < anInt185 * -778154051; i_27_++) {
			Class527 class527 = aClass527Array184[i_27_];
			for (Class527 class527_28_ = class527.aClass527_7105; class527 != class527_28_; class527_28_ = class527_28_.aClass527_7105)
				class527s[i++] = class527_28_;
		}
		return i;
	}

	public Class527 method729() {
		if (anInt188 * -1742596755 > 0 && (aClass527Array184[anInt188 * -1742596755 - 1] != aClass527_187)) {
			Class527 class527 = aClass527_187;
			aClass527_187 = class527.aClass527_7105;
			return class527;
		}
		while (-1742596755 * anInt188 < -778154051 * anInt185) {
			Class527 class527 = (aClass527Array184[(anInt188 += -425182107) * -1742596755 - 1].aClass527_7105);
			if (aClass527Array184[-1742596755 * anInt188 - 1] != class527) {
				aClass527_187 = class527.aClass527_7105;
				return class527;
			}
		}
		return null;
	}

	static final void method730(int i) {
		if (-2119864417 * client.anInt11237 != -1) {
			int i_29_ = Class534.aClass553_7213.method9158(-1412060454);
			int i_30_ = Class534.aClass553_7213.method9159(1901220644);
			Class527_Sub34 class527_sub34 = ((Class527_Sub34) client.aClass694_11278.method14081((short) 9303));
			if (null != class527_sub34) {
				i_29_ = class527_sub34.method16356(1319623125);
				i_30_ = class527_sub34.method16357(719777205);
			}
			if (client.aClass243_11150 != null && client.aClass243_11205 == Class226.aClass243_2351) {
				client.aBool11209 = true;
				client.anInt11210 = 0;
				client.anInt11107 = 0;
				client.anInt11225 = 913698829 * Class289.anInt3223;
				client.anInt11131 = Class611.anInt8009 * 2027814963;
			}
			Class68_Sub1.method16794(null, -2119864417 * client.anInt11237, 0, 0, Class289.anInt3223 * -1803844265, Class611.anInt8009 * -471480167, 0, 0, i_29_, i_30_, (byte) -90);
			if (null != Class527_Sub27.aClass243_10524)
				Class308.method5625(i_29_, i_30_, (byte) 2);
		}
	}

	static boolean method731(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, int i, int i_31_, int i_32_) {
		if (Class529_Sub1.aBool7165 && !client.aBool11165 && !Class529_Sub1.method8774(class527_sub30.anInt10568 * 208579007, (class527_sub30.anInt10565 * -1499963557)))
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(Class529_Sub1.anInterface20_7121, Class529_Sub1.anInterface18_7120, -1840974139);
			if (class249 == null)
				return false;
		}
		int i_33_ = 2147483647;
		int i_34_ = -2147483648;
		int i_35_ = 2147483647;
		int i_36_ = -2147483648;
		if (null != class249.anIntArray2760) {
			i_33_ = (((class249.anInt2740 * -1712073 + class527_sub30.anInt10568 * 208579007 - Class529_Sub1.anInt7125) * (Class529_Sub1.anInt7181 - Class529_Sub1.anInt7179) / (Class529_Sub1.anInt7177 - Class529_Sub1.anInt7125)) + Class529_Sub1.anInt7179);
			i_34_ = (Class529_Sub1.anInt7179 + ((Class529_Sub1.anInt7181 - Class529_Sub1.anInt7179) * (208579007 * class527_sub30.anInt10568 + 1589409961 * class249.anInt2771 - Class529_Sub1.anInt7125) / (Class529_Sub1.anInt7177 - Class529_Sub1.anInt7125)));
			i_36_ = (Class529_Sub1.anInt7182 - ((-1499963557 * class527_sub30.anInt10565 + class249.anInt2748 * -1564335433 - Class529_Sub1.anInt7175) * (Class529_Sub1.anInt7182 - Class529_Sub1.anInt7180) / (Class529_Sub1.anInt7136 - Class529_Sub1.anInt7175)));
			i_35_ = (Class529_Sub1.anInt7182 - ((class527_sub30.anInt10565 * -1499963557 + class249.anInt2764 * -548669143 - Class529_Sub1.anInt7175) * (Class529_Sub1.anInt7182 - Class529_Sub1.anInt7180) / (Class529_Sub1.anInt7136 - Class529_Sub1.anInt7175)));
		}
		Class147 class147 = null;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		if (-1 != class249.anInt2735 * 1928897467) {
			if (class527_sub30.aBool10571 && 1028708925 * class249.anInt2736 != -1)
				class147 = class249.method4637(class180, true, 1514910421);
			else
				class147 = class249.method4637(class180, false, 2024942610);
			if (class147 != null) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_37_ = (-1409288891 * class527_sub30.anInt10569 - (class147.method42() + 1 >> 1));
					i_38_ = (class527_sub30.anInt10569 * -1409288891 + (class147.method42() + 1 >> 1));
					break;
				case 2:
					i_37_ = class527_sub30.anInt10569 * -1409288891;
					i_38_ = (class527_sub30.anInt10569 * -1409288891 + class147.method42());
					break;
				case 0:
					i_37_ = (-1409288891 * class527_sub30.anInt10569 - class147.method42());
					i_38_ = class527_sub30.anInt10569 * -1409288891;
					break;
				}
				switch (-401058325 * class249.aClass277_2763.anInt3165) {
				case 1:
					i_39_ = (class527_sub30.anInt10570 * -745445839 - (class147.method2410() + 1 >> 1));
					i_40_ = (class527_sub30.anInt10570 * -745445839 + (class147.method2410() + 1 >> 1));
					break;
				case 0:
					i_39_ = class527_sub30.anInt10570 * -745445839;
					i_40_ = (class527_sub30.anInt10570 * -745445839 + class147.method2410());
					break;
				case 2:
					i_39_ = (-745445839 * class527_sub30.anInt10570 - class147.method2410());
					i_40_ = -745445839 * class527_sub30.anInt10570;
					break;
				}
				if (i_37_ < i_33_)
					i_33_ = i_37_;
				if (i_38_ > i_34_)
					i_34_ = i_38_;
				if (i_39_ < i_35_)
					i_35_ = i_39_;
				if (i_40_ > i_36_)
					i_36_ = i_40_;
			}
		}
		Class147 class147_41_ = null;
		if (class249.anInt2745 * 581159495 != -1)
			class147_41_ = class249.method4648(class180, (byte) 4);
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = 0;
		int i_46_ = 0;
		int i_47_ = 0;
		int i_48_ = 0;
		int i_49_ = 0;
		if (null != class249.aString2737) {
			Class332.method5838(1365262055 * class249.anInt2741, (byte) 114);
			if (Class358_Sub2.aClass174_10289 != null) {
				i_49_ = (Class529_Sub1.aClass22_10781.method810(class249.aString2737, Class289.anInt3223 * -1803844265, 0, null, -847386583));
				i_44_ = (Class529_Sub1.aClass22_10781.method798(class249.aString2737, Class289.anInt3223 * -1803844265, null, -1486853083));
				i_42_ = (class527_sub30.anInt10569 * -1409288891 - i_44_ / 2 + (class249.anInt2769 * 899834733 * (Class529_Sub1.anInt7181 - Class529_Sub1.anInt7179) / (Class529_Sub1.anInt7177 - Class529_Sub1.anInt7125)));
				i_43_ = (class527_sub30.anInt10570 * -745445839 - (class249.anInt2766 * -1987476183 * (Class529_Sub1.anInt7182 - Class529_Sub1.anInt7180) / (Class529_Sub1.anInt7136 - Class529_Sub1.anInt7175)));
				if (class147 == null)
					i_43_ -= i_49_ / 2;
				else
					i_43_ -= (class147.method2410() >> 1) + i_49_;
				i_45_ = i_42_ + i;
				if (i_45_ < i_33_)
					i_33_ = i_45_;
				i_46_ = i + (i_44_ + i_42_);
				if (i_46_ > i_34_)
					i_34_ = i_46_;
				i_47_ = i_43_ + i_31_;
				if (i_47_ < i_35_)
					i_35_ = i_47_;
				i_48_ = i_31_ + (i_43_ + i_49_);
				if (i_48_ > i_36_)
					i_36_ = i_48_;
			}
		}
		if (i_34_ < Class529_Sub1.anInt7179 || i_33_ > Class529_Sub1.anInt7181 || i_36_ < Class529_Sub1.anInt7180 || i_35_ > Class529_Sub1.anInt7182)
			return true;
		Class529_Sub1.method8773(class180, class527_sub30, class249);
		if (null != class147) {
			int i_50_ = 0;
			int i_51_ = 0;
			int i_52_ = 0;
			int i_53_ = 0;
			int i_54_ = 0;
			int i_55_ = 0;
			switch (-229615941 * class249.aClass274_2752.anInt3146) {
			case 2:
				i_51_ = -(class147.method2407() + 1) / 2;
				break;
			case 0:
				i_50_ = class147.method2407();
				i_51_ = (class147.method2407() + 1) / 2;
				i_52_ = class147.method42();
				break;
			case 1:
				i_50_ = class147.method2407() / 2;
				i_52_ = class147.method42() >> 1;
				break;
			}
			switch (class249.aClass277_2763.anInt3165 * -401058325) {
			case 1:
				i_53_ = class147.method2407() / 2;
				i_55_ = class147.method2410() >> 1;
				break;
			case 2:
				i_53_ = class147.method2407();
				i_54_ = (class147.method2407() + 1) / 2;
				i_55_ = class147.method2410();
				break;
			case 0:
				i_54_ = -(class147.method2407() + 1) / 2;
				break;
			}
			Class25 class25 = (Class25) (Class529_Sub1.aHashMap10782.get(Integer.valueOf(class527_sub30.anInt10567 * -558184067)));
			if (class25 == null)
				class25 = (Class25) (Class529_Sub1.aHashMap10764.get(Integer.valueOf(-1771553873 * class249.anInt2777)));
			if (class25 != null && -1 == 581159495 * class249.anInt2745) {
				int i_56_;
				if (class25.anInt235 * -810418811 > Class529_Sub1.anInt10791 * 1570431151 / 2)
					i_56_ = ((Class529_Sub1.anInt10791 * 1027984977 - -498366597 * class25.anInt235) / (1570431151 * Class529_Sub1.anInt10791));
				else
					i_56_ = (class25.anInt235 * -498366597 / (1570431151 * Class529_Sub1.anInt10791));
				int i_57_ = i_56_ << 24 | 0xffff00;
				if (class180 instanceof Class180_Sub2) {
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_50_ - 7, class527_sub30.anInt10570 * -745445839 - i_53_ - 7, class147.method2407() + 14, class147.method2407() + 14, i_57_, 486115754);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_50_ - 5, class527_sub30.anInt10570 * -745445839 - i_53_ - 5, class147.method2407() + 10, class147.method2407() + 10, i_57_, 570730730);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_50_ - 3, -745445839 * class527_sub30.anInt10570 - i_53_ - 3, class147.method2407() + 6, class147.method2407() + 6, i_57_, -1907142380);
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_50_ - 1, class527_sub30.anInt10570 * -745445839 - i_53_ - 1, class147.method2407() + 2, class147.method2407() + 2, i_57_, -2035835028);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_50_, class527_sub30.anInt10570 * -745445839 - i_53_, class147.method2407(), class147.method2407(), i_57_, 511705717);
				} else {
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_51_, class527_sub30.anInt10570 * -745445839 - i_54_, class147.method2407() / 2 + 7, i_57_, (byte) -53);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_51_, (class527_sub30.anInt10570 * -745445839 - i_54_ - i_54_) != 0 ? 1 : 0, class147.method2407() / 2 + 5, i_57_, (byte) -93);
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_51_, 0 != (-745445839 * class527_sub30.anInt10570 - i_54_ - i_54_) ? 1 : 0, class147.method2407() / 2 + 3, i_57_, (byte) -3);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_51_, (-745445839 * class527_sub30.anInt10570 - i_54_ - i_54_) != 0 ? 1 : 0, class147.method2407() / 2 + 1, i_57_, (byte) -65);
					class180.method3139((-1409288891 * class527_sub30.anInt10569) - i_51_, (class527_sub30.anInt10570 * -745445839 - i_54_ - i_54_) != 0 ? 1 : 0, class147.method2407() / 2, i_57_, (byte) -43);
				}
			}
			class147.method2415((-1409288891 * class527_sub30.anInt10569 - i_52_), (-745445839 * class527_sub30.anInt10570 - i_55_));
			int i_58_ = 0;
			int i_59_ = 0;
			if (null != class25 && null != class147_41_) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_58_ = class147_41_.method42() >> 1;
					break;
				case 0:
					break;
				case 2:
					i_58_ = class147_41_.method42();
					break;
				}
				switch (class249.aClass277_2763.anInt3165 * -401058325) {
				case 2:
					i_59_ = (class147_41_.method2410() + class147.method2410()) / 2;
					break;
				case 0:
					break;
				case 1:
					i_59_ = (class147_41_.method2410() / 2 + class147.method2410()) / 2;
					break;
				}
				int i_60_;
				if (-810418811 * class25.anInt235 > 1570431151 * Class529_Sub1.anInt10791 / 2)
					i_60_ = ((Class529_Sub1.anInt10791 * 1027984977 - class25.anInt235 * -498366597) / (Class529_Sub1.anInt10791 * 1570431151));
				else
					i_60_ = (-498366597 * class25.anInt235 / (1570431151 * Class529_Sub1.anInt10791));
				int i_61_ = i_60_ << 24 | 0xffff00;
				class147_41_.method2416((class527_sub30.anInt10569 * -1409288891) - i_58_, (-745445839 * class527_sub30.anInt10570 - i_59_), 0, i_61_, 1);
			}
		}
		if (null != class249.aString2737 && Class358_Sub2.aClass174_10289 != null)
			Class553.method9195(class180, class527_sub30, class249, i_42_, i_43_, i_49_, i_44_, -1954998779);
		if (1928897467 * class249.anInt2735 != -1 || class249.aString2737 != null) {
			Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
			class527_sub10.anInt10425 = 1547116355 * i_37_;
			class527_sub10.anInt10423 = i_38_ * 460630271;
			class527_sub10.anInt10422 = i_39_ * -1555531975;
			class527_sub10.anInt10428 = -560104107 * i_40_;
			class527_sub10.anInt10426 = -1221672401 * i_45_;
			class527_sub10.anInt10424 = i_46_ * 240629295;
			class527_sub10.anInt10427 = i_47_ * 320863415;
			class527_sub10.anInt10429 = -1601482153 * i_48_;
			Class620.aClass694_8119.method14147(class527_sub10, -742794324);
		}
		return false;
	}

	public static void method732(byte i) {
		synchronized (Class642.aQueue8341) {
			for (;;) {
				Class527_Sub34_Sub1 class527_sub34_sub1 = (Class527_Sub34_Sub1) Class642.aQueue8341.poll();
				if (class527_sub34_sub1 == null)
					break;
				class527_sub34_sub1.method16363(182953128);
			}
		}
	}

	public static Class527_Sub8_Sub11 method733(int i, byte i_62_) {
		return ((Class527_Sub8_Sub11) Class264.aClass14_2870.method709((long) i));
	}

	static final void method734(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class615.method10185(class243, class240, class665, -164353045);
	}
}
