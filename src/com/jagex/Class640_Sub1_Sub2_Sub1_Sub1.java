/* Class640_Sub1_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640_Sub1_Sub2_Sub1_Sub1 extends Class640_Sub1_Sub2_Sub1 {
	int[] anIntArray12160;
	public int anInt12161 = -414989425;
	int anInt12162;
	public Class308 aClass308_12163;
	public Class297 aClass297_12164;
	public static int anInt12165;
	public int anInt12166;
	int anInt12167;
	public Class295 aClass295_12168;
	public String aString12169;
	public int anInt12170;
	int[] anIntArray12171;
	int anInt12172;
	int anInt12173;
	public static int anInt12174 = -311572459;
	public int anInt12175 = 1294511563;
	public int anInt12176;
	boolean aBool12177;

	public boolean method18606() {
		return Class536.aClass615_7224.aBool8049;
	}

	public Class549 method17085(Class180 class180) {
		return null;
	}

	public void method18831(byte i) {
		anInt11932 = 2103282385;
		anInt11899 = 342166455 * client.anInt11019;
	}

	public int method18625() {
		return -541403241 * anInt11955 + 1;
	}

	public void method18832(Class295 class295, int i) {
		method18833(class295, true, true, true, (byte) 102);
	}

	public void method18833(Class295 class295, boolean bool, boolean bool_0_, boolean bool_1_, byte i) {
		if (class295 != aClass295_12168 && Class35.aBool338 && Class352.method6214(-541403241 * anInt11955, -733978003))
			Exception_Sub7.method17974(370591503);
		aClass295_12168 = class295;
		if (null != aClass295_12168) {
			if (bool)
				aString12169 = aClass295_12168.aString3279;
			if (bool_0_)
				anInt12170 = aClass295_12168.anInt3285 * -882122449;
			if (bool_1_)
				aClass297_12164 = null;
		}
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
	}

	boolean method18834(int i) {
		return aBool12177 || aClass295_12168.aBool3299;
	}

	public int method18623() {
		return -541403241 * anInt11955 + 1;
	}

	boolean method18835(Class180 class180, int i, byte i_2_) {
		int i_3_ = i;
		Class587 class587 = method18542(-1636050182);
		Class695 class695 = ((aClass695_11914.method14162(-966306481) && !aClass695_11914.method14172(-1937552113)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-1663362543) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
		int i_4_ = 261385821 * class587.anInt7740;
		int i_5_ = class587.anInt7738 * 1568751847;
		if (i_4_ != 0 || i_5_ != 0 || class587.anInt7753 * -353138087 != 0 || 0 != class587.anInt7756 * -1624976099)
			i |= 0x7;
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		boolean bool_6_ = false;
		if (anInt11932 * 391979727 != 0) {
			Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1245988280) : aClass295_12168);
			if (class295 == null || client.anInt11019 >= (-863714809 * anInt11899 + -789435441 * class295.anInt3346))
				anInt11932 = 0;
			else {
				anInt11932 = (255 - (255 * (client.anInt11019 - -863714809 * anInt11899) / (class295.anInt3346 * -789435441))) * -918117329;
				bool_6_ = true;
			}
		}
		if (bool_6_)
			i |= 0x100;
		int i_7_ = aClass61_11936.method1384((byte) 1);
		Class176 class176 = (aClass176Array11952[0] = aClass295_12168.method5303(class180, i, Class258.aClass24_Sub2_2827, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_7_, aClass308_12163, method18543(-939140984), false, -1947464588));
		if (class176 == null)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 103);
		if (i_4_ != 0 || i_5_ != 0) {
			method18591(i_7_, i_4_, i_5_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 125);
			if (0 != 299555935 * anInt11927)
				aClass176Array11952[0].method2868(299555935 * anInt11927);
			if (0 != -1105701807 * anInt11943)
				aClass176Array11952[0].method2869(-1105701807 * anInt11943);
			if (-1914574331 * anInt11888 != 0)
				aClass176Array11952[0].method3015(0, -1914574331 * anInt11888, 0);
		} else
			method18591(i_7_, method18564(-1500610539) << 9, method18564(-1752891657) << 9, 0, 0, (byte) 116);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (bool_6_)
			class176.method2908((byte) (391979727 * anInt11932), null);
		method18540(class180, class587, i_3_, i_4_, i_5_, i_7_, -1954667794);
		return true;
	}

	public int method17061() {
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 916237588);
			if (null != class295 && 380835039 * class295.anInt3335 != -1)
				return class295.anInt3335 * 380835039;
		}
		return (-1 != aClass295_12168.anInt3335 * 380835039 ? aClass295_12168.anInt3335 * 380835039 : super.method17049((byte) -47));
	}

	public final void method18836(Class681 class681, int i, byte i_8_) {
		int i_9_ = anIntArray11902[0];
		int i_10_ = anIntArray11944[0];
		switch (-538279681 * class681.anInt8637) {
		case 1:
			i_9_++;
			i_10_--;
			break;
		case 7:
			i_9_--;
			break;
		case 6:
			i_10_++;
			break;
		case 0:
			i_9_--;
			i_10_--;
			break;
		case 3:
			i_9_++;
			break;
		case 5:
			i_10_--;
			break;
		case 4:
			i_9_--;
			i_10_++;
			break;
		case 2:
			i_9_++;
			i_10_++;
			break;
		}
		if (aClass695_11914.method14162(-1047636566) && (aClass695_11914.method14163(320069875).anInt2185 * -707228641 == 1)) {
			anIntArray11931 = null;
			aClass695_11914.method14165(-1, (byte) 45);
		}
		for (int i_11_ = 0; i_11_ < aClass505Array11915.length; i_11_++) {
			if (-1 != 1429262853 * aClass505Array11915[i_11_].anInt6909) {
				Class685 class685 = ((Class685) (Class57.aClass24_Sub4_720.method81(1429262853 * aClass505Array11915[i_11_].anInt6909, 1383971699)));
				if (class685.aBool8665 && -1 != class685.anInt8671 * -1567837355 && (((Class198) Class321.aClass24_Sub10_3551.method81(((class685.anInt8671) * -1567837355), 1578960773)).anInt2185) * -707228641 == 1) {
					aClass505Array11915[i_11_].aClass695_6911.method14165(-1, (byte) 82);
					aClass505Array11915[i_11_].anInt6909 = 82367795;
				}
			}
		}
		if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
			anInt11942 += 1705181029;
		for (int i_12_ = -1057678739 * anInt11942; i_12_ > 0; i_12_--) {
			anIntArray11902[i_12_] = anIntArray11902[i_12_ - 1];
			anIntArray11944[i_12_] = anIntArray11944[i_12_ - 1];
			aByteArray11945[i_12_] = aByteArray11945[i_12_ - 1];
		}
		anIntArray11902[0] = i_9_;
		anIntArray11944[0] = i_10_;
		aByteArray11945[0] = (byte) i;
	}

	public void method18837(int i, int i_13_, int i_14_, boolean bool, int i_15_, byte i_16_) {
		aByte10864 = aByte10862 = (byte) i;
		if (client.aClass509_11072.method8359(982648220).method7706(i_13_, i_14_, (short) -874))
			aByte10862++;
		if (aClass695_11914.method14162(-914298320) && (aClass695_11914.method14163(-514678584).anInt2185 * -707228641 == 1)) {
			anIntArray11931 = null;
			aClass695_11914.method14165(-1, (byte) 78);
		}
		for (int i_17_ = 0; i_17_ < aClass505Array11915.length; i_17_++) {
			if (aClass505Array11915[i_17_].anInt6909 * 1429262853 != -1) {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(((aClass505Array11915[i_17_].anInt6909) * 1429262853), -1826422177));
				if (class685.aBool8665 && -1567837355 * class685.anInt8671 != -1 && (((Class198) Class321.aClass24_Sub10_3551.method81(((class685.anInt8671) * -1567837355), 2029265078)).anInt2185) * -707228641 == 1) {
					aClass505Array11915[i_17_].aClass695_6911.method14165(-1, (byte) 126);
					aClass505Array11915[i_17_].anInt6909 = 82367795;
				}
			}
		}
		if (!bool) {
			int i_18_ = i_13_ - anIntArray11902[0];
			int i_19_ = i_14_ - anIntArray11944[0];
			if (i_18_ >= -8 && i_18_ <= 8 && i_19_ >= -8 && i_19_ <= 8) {
				if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
					anInt11942 += 1705181029;
				for (int i_20_ = -1057678739 * anInt11942; i_20_ > 0; i_20_--) {
					anIntArray11902[i_20_] = anIntArray11902[i_20_ - 1];
					anIntArray11944[i_20_] = anIntArray11944[i_20_ - 1];
					aByteArray11945[i_20_] = aByteArray11945[i_20_ - 1];
				}
				anIntArray11902[0] = i_13_;
				anIntArray11944[0] = i_14_;
				aByteArray11945[0] = Class679.aClass679_8622.aByte8627;
				return;
			}
		}
		anInt11942 = 0;
		anInt11947 = 0;
		anInt11946 = 0;
		anIntArray11902[0] = i_13_;
		anIntArray11944[0] = i_14_;
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 = (float) ((i_15_ << 8) + (anIntArray11902[0] << 9));
		class442.aFloat4919 = (float) ((anIntArray11944[0] << 9) + (i_15_ << 8));
		method10618(class442);
		class442.method7141();
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
	}

	public final boolean method18838(int i) {
		if (aClass295_12168 == null)
			return false;
		return true;
	}

	int method18543(int i) {
		if (-1 != -710569895 * anInt12166)
			return anInt12166 * -710569895;
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 57933219);
			if (null != class295 && -1 != class295.anInt3284 * -767096327)
				return -767096327 * class295.anInt3284;
		}
		return aClass295_12168.anInt3284 * -767096327;
	}

	public Class289 method202(short i) {
		return Class289.aClass289_3220;
	}

	public int method17049(byte i) {
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 1970303797);
			if (null != class295 && 380835039 * class295.anInt3335 != -1)
				return class295.anInt3335 * 380835039;
		}
		return (-1 != aClass295_12168.anInt3335 * 380835039 ? aClass295_12168.anInt3335 * 380835039 : super.method17049((byte) -91));
	}

	public int method51() {
		return -541403241 * anInt11955;
	}

	int method17046(int i) {
		if (null == aClass295_12168)
			return 0;
		return -1958110209 * aClass295_12168.anInt3344;
	}

	boolean method17033(Class180 class180, int i, int i_21_, byte i_22_) {
		if (aClass295_12168 == null)
			return false;
		if (null != aClass295_12168.aClass439_3341)
			return class180.method3155(i, i_21_, method10612(), aClass295_12168.aClass439_3341, -867329631);
		if (!method18835(class180, 131072, (byte) -80))
			return false;
		Class432 class432 = method10612();
		boolean bool = false;
		for (int i_23_ = 0; i_23_ < aClass176Array11952.length; i_23_++) {
			if (aClass176Array11952[i_23_] != null && aClass176Array11952[i_23_].aBool1953) {
				boolean bool_24_;
				while_105_: do {
					do {
						if (-1958110209 * aClass295_12168.anInt3344 <= 0) {
							if (-1 == -283433239 * aClass295_12168.anInt3340) {
								if (897343531 * aClass295_12168.anInt3342 != 1)
									break;
							} else if (-283433239 * aClass295_12168.anInt3340 != 1)
								break;
						}
						bool_24_ = true;
						break while_105_;
					} while (false);
					bool_24_ = false;
				} while (false);
				boolean bool_25_ = bool_24_;
				boolean bool_26_ = aClass176Array11952[i_23_].method3051(i, i_21_, class432, bool_25_, (-1958110209 * (aClass295_12168.anInt3344)));
				if (bool_26_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_27_ = 0; i_27_ < aClass176Array11952.length; i_27_++)
			aClass176Array11952[i_27_] = null;
		return bool;
	}

	final boolean method17037(int i) {
		return false;
	}

	final void method17038(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_28_, int i_29_, boolean bool, int i_30_) {
		throw new IllegalStateException();
	}

	public int method200(byte i) {
		return -541403241 * anInt11955;
	}

	public int method18839(int i, int i_31_) {
		return anIntArray12160[i];
	}

	public int method18840(int i, int i_32_) {
		return anIntArray12171[i];
	}

	public Class438 method195(int i) {
		Class438 class438 = Class438.method7020();
		class438.method7030(Class428.method6863(1085423875 * aClass61_11936.anInt725), 0.0F, 0.0F);
		return class438;
	}

	public boolean method18554(int i) {
		return Class536.aClass615_7224.aBool8049;
	}

	public Class523 method18547(int i) {
		if (null != aClass523_11921 && aClass523_11921.aString7090 == null)
			return null;
		return aClass523_11921;
	}

	public void method18841(String string, int i, int i_33_, int i_34_) {
		int i_35_ = (Class259.method4781((byte) 16) * (Class536.aClass615_7224.anInt8059 * -1699353169));
		method18598(string, i, i_33_, i_35_, -441238943);
	}

	public int method88() {
		return -541403241 * anInt11955;
	}

	public int method46() {
		return -541403241 * anInt11955;
	}

	final void method17039(int i) {
		throw new IllegalStateException();
	}

	public Class527_Sub36 method189(byte i) {
		Class592 class592 = client.aClass509_11072.method8283((short) 3224);
		return (Class545.method9049(aByte10864, ((int) method10637().aClass442_4927.aFloat4918 + class592.anInt7798 * 1216613888), -(int) method10637().aClass442_4927.aFloat4915, ((int) method10637().aClass442_4927.aFloat4919 + class592.anInt7799 * 202920448), -2124007647));
	}

	final void method17075() {
		throw new IllegalStateException();
	}

	Class558 method17063(Class180 class180) {
		if (null == aClass295_12168 || !method18835(class180, 526336, (byte) -123))
			return null;
		Class432 class432 = method10612();
		Class445 class445 = method10637();
		Class432 class432_36_ = class180.method3172();
		int i = aClass61_11936.method1384((byte) 1);
		Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][(int) class445.aClass442_4927.aFloat4918 >> 9][(int) class445.aClass442_4927.aFloat4919 >> 9]);
		if (class561 != null && class561.aClass640_Sub1_Sub4_7556 != null) {
			int i_37_ = (1017774861 * anInt11903 - class561.aClass640_Sub1_Sub4_7556.aShort11871);
			anInt11903 = -1593015355 * (int) ((float) (1017774861 * anInt11903) - (float) i_37_ / 10.0F);
		} else
			anInt11903 = (-1593015355 * (int) ((float) (anInt11903 * 1017774861) - (float) (1017774861 * anInt11903) / 10.0F));
		class432_36_.method6899(class432);
		class432_36_.method6896(0.0F, (float) (-20 - 1017774861 * anInt11903), 0.0F);
		Class587 class587 = method18542(-1341128384);
		Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1382569887) : aClass295_12168);
		boolean bool = class295.aClass439_3341 != null;
		aBool11951 = false;
		Class558 class558 = null;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub10_10611.method16939((short) 1260) == 1 && class295.aBool3274 && class587.aBool7717) {
			Class695 class695 = ((aClass695_11914.method14162(-300677772) && aClass695_11914.method14172(1195799900)) ? aClass695_11914 : null);
			Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-518901766) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
			short i_38_ = Class536.aClass615_7224.aShort8051;
			byte i_39_ = Class536.aClass615_7224.aByte8037;
			if (aClass295_12168.aShort3322 > -1) {
				i_38_ = aClass295_12168.aShort3322;
				i_39_ = aClass295_12168.aByte3323;
			}
			Class176 class176;
			if (i_38_ > -1 && Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-1610498623) == 1)
				class176 = Class576.method9635(class180, i, 299555935 * anInt11927, anInt11943 * -1105701807, -1914574331 * anInt11888, aClass176Array11952[0], i_38_, i_39_, (class695_sub2 != null ? (Class695) class695_sub2 : class695), (byte) 29);
			else
				class176 = Class35.method1127(class180, i, 299555935 * anInt11927, -1105701807 * anInt11943, anInt11888 * -1914574331, 897343531 * aClass295_12168.anInt3342, aClass176Array11952[0], aClass295_12168.aShort3318 & 0xffff, aClass295_12168.aShort3319 & 0xffff, aClass295_12168.aByte3320 & 0xff, aClass295_12168.aByte3288 & 0xff, (class695_sub2 != null ? (Class695) class695_sub2 : class695), 349702023);
			if (null != class176) {
				class558 = Class171_Sub1.method14736(method18834(-1409555118), -1130887668);
				aBool11951 = true;
				class180.method3182(false);
				if (bool)
					class176.method2889(class432_36_, null, 0);
				else {
					if (aClass169Array10863 == null || (aClass169Array10863.length < 1 + aClass176Array11952.length))
						method17050(aClass176Array11952.length + 1, (short) 24293);
					class176.method2889(class432_36_, (aClass169Array10863[aClass176Array11952.length]), 0);
				}
				class180.method3182(true);
			}
		}
		if (bool) {
			if (aClass169Array10863 == null || aClass169Array10863.length > 1)
				method17050(1, (short) 22100);
			class180.method3536(class432_36_, aClass169Array10863[0], class295.aClass439_3341);
		} else if (aClass169Array10863 == null || aClass169Array10863.length < aClass176Array11952.length)
			method17050(aClass176Array11952.length, (short) 17327);
		if (class558 == null)
			class558 = Class171_Sub1.method14736(method18834(-1963744624), 1433029195);
		method18532(class180, aClass176Array11952, class432_36_, false, (byte) -83);
		for (int i_40_ = 0; i_40_ < aClass176Array11952.length; i_40_++) {
			if (null != aClass176Array11952[i_40_]) {
				if (aClass295_12168.aBool3315)
					aClass176Array11952[i_40_].method2986(-1895931967 * anInt12172, anInt12173 * 1662717731, -1970013993 * anInt12162, -1976700197 * anInt12167);
				if (bool)
					aClass176Array11952[i_40_].method2889(class432_36_, null, 0);
				else
					aClass176Array11952[i_40_].method2889(class432_36_, (aClass169Array10863[i_40_]), 0);
			} else if (!bool)
				aClass169Array10863[i_40_].aBool1874 = false;
		}
		if (null != aClass613_11949) {
			Class182 class182 = aClass613_11949.method10139();
			class180.method3179(class182);
		}
		for (int i_41_ = 0; i_41_ < aClass176Array11952.length; i_41_++) {
			if (aClass176Array11952[i_41_] != null)
				aBool11951 |= aClass176Array11952[i_41_].method2949();
			aClass176Array11952[i_41_] = null;
		}
		anInt11890 = client.anInt11129 * -1710401247;
		return class558;
	}

	public boolean method17060(byte i) {
		if (null != aClass295_12168.anIntArray3312 && (aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -859006178) == null))
			return false;
		return true;
	}

	public boolean method18605() {
		return Class536.aClass615_7224.aBool8049;
	}

	public Class289 method191() {
		return Class289.aClass289_3220;
	}

	public Class289 method192() {
		return Class289.aClass289_3220;
	}

	public int method18553(int i) {
		return -541403241 * anInt11955 + 1;
	}

	boolean method17066(Class180 class180, int i, int i_42_) {
		if (aClass295_12168 == null)
			return false;
		if (null != aClass295_12168.aClass439_3341)
			return class180.method3155(i, i_42_, method10612(), aClass295_12168.aClass439_3341, -867329631);
		if (!method18835(class180, 131072, (byte) -27))
			return false;
		Class432 class432 = method10612();
		boolean bool = false;
		for (int i_43_ = 0; i_43_ < aClass176Array11952.length; i_43_++) {
			if (aClass176Array11952[i_43_] != null && aClass176Array11952[i_43_].aBool1953) {
				boolean bool_44_;
				while_106_: do {
					do {
						if (-1958110209 * aClass295_12168.anInt3344 <= 0) {
							if (-1 == -283433239 * aClass295_12168.anInt3340) {
								if (897343531 * aClass295_12168.anInt3342 != 1)
									break;
							} else if (-283433239 * aClass295_12168.anInt3340 != 1)
								break;
						}
						bool_44_ = true;
						break while_106_;
					} while (false);
					bool_44_ = false;
				} while (false);
				boolean bool_45_ = bool_44_;
				boolean bool_46_ = aClass176Array11952[i_43_].method3051(i, i_42_, class432, bool_45_, (-1958110209 * (aClass295_12168.anInt3344)));
				if (bool_46_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_47_ = 0; i_47_ < aClass176Array11952.length; i_47_++)
			aClass176Array11952[i_47_] = null;
		return bool;
	}

	public void method18842(Class295 class295) {
		method18833(class295, true, true, true, (byte) 53);
	}

	public int method194() {
		return -541403241 * anInt11955;
	}

	int method18618() {
		if (-1 != -710569895 * anInt12166)
			return anInt12166 * -710569895;
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 926250083);
			if (null != class295 && -1 != class295.anInt3284 * -767096327)
				return -767096327 * class295.anInt3284;
		}
		return aClass295_12168.anInt3284 * -767096327;
	}

	public Class438 method199() {
		Class438 class438 = Class438.method7020();
		class438.method7030(Class428.method6863(1085423875 * aClass61_11936.anInt725), 0.0F, 0.0F);
		return class438;
	}

	public Class527_Sub36 method198() {
		Class592 class592 = client.aClass509_11072.method8283((short) 29116);
		return (Class545.method9049(aByte10864, ((int) method10637().aClass442_4927.aFloat4918 + class592.anInt7798 * 1216613888), -(int) method10637().aClass442_4927.aFloat4915, ((int) method10637().aClass442_4927.aFloat4919 + class592.anInt7799 * 202920448), -2110630963));
	}

	Class558 method17070(Class180 class180) {
		if (null == aClass295_12168 || !method18835(class180, 526336, (byte) -23))
			return null;
		Class432 class432 = method10612();
		Class445 class445 = method10637();
		Class432 class432_48_ = class180.method3172();
		int i = aClass61_11936.method1384((byte) 1);
		Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][(int) class445.aClass442_4927.aFloat4918 >> 9][(int) class445.aClass442_4927.aFloat4919 >> 9]);
		if (class561 != null && class561.aClass640_Sub1_Sub4_7556 != null) {
			int i_49_ = (1017774861 * anInt11903 - class561.aClass640_Sub1_Sub4_7556.aShort11871);
			anInt11903 = -1593015355 * (int) ((float) (1017774861 * anInt11903) - (float) i_49_ / 10.0F);
		} else
			anInt11903 = (-1593015355 * (int) ((float) (anInt11903 * 1017774861) - (float) (1017774861 * anInt11903) / 10.0F));
		class432_48_.method6899(class432);
		class432_48_.method6896(0.0F, (float) (-20 - 1017774861 * anInt11903), 0.0F);
		Class587 class587 = method18542(-1936752290);
		Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 1395108426) : aClass295_12168);
		boolean bool = class295.aClass439_3341 != null;
		aBool11951 = false;
		Class558 class558 = null;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub10_10611.method16939((short) 1260) == 1 && class295.aBool3274 && class587.aBool7717) {
			Class695 class695 = ((aClass695_11914.method14162(-1441791918) && aClass695_11914.method14172(-1096317944)) ? aClass695_11914 : null);
			Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-278384224) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
			short i_50_ = Class536.aClass615_7224.aShort8051;
			byte i_51_ = Class536.aClass615_7224.aByte8037;
			if (aClass295_12168.aShort3322 > -1) {
				i_50_ = aClass295_12168.aShort3322;
				i_51_ = aClass295_12168.aByte3323;
			}
			Class176 class176;
			if (i_50_ > -1 && Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-1772084441) == 1)
				class176 = Class576.method9635(class180, i, 299555935 * anInt11927, anInt11943 * -1105701807, -1914574331 * anInt11888, aClass176Array11952[0], i_50_, i_51_, (class695_sub2 != null ? (Class695) class695_sub2 : class695), (byte) -23);
			else
				class176 = Class35.method1127(class180, i, 299555935 * anInt11927, -1105701807 * anInt11943, anInt11888 * -1914574331, 897343531 * aClass295_12168.anInt3342, aClass176Array11952[0], aClass295_12168.aShort3318 & 0xffff, aClass295_12168.aShort3319 & 0xffff, aClass295_12168.aByte3320 & 0xff, aClass295_12168.aByte3288 & 0xff, (class695_sub2 != null ? (Class695) class695_sub2 : class695), 273317197);
			if (null != class176) {
				class558 = Class171_Sub1.method14736(method18834(-2020323342), 521261369);
				aBool11951 = true;
				class180.method3182(false);
				if (bool)
					class176.method2889(class432_48_, null, 0);
				else {
					if (aClass169Array10863 == null || (aClass169Array10863.length < 1 + aClass176Array11952.length))
						method17050(aClass176Array11952.length + 1, (short) 19811);
					class176.method2889(class432_48_, (aClass169Array10863[aClass176Array11952.length]), 0);
				}
				class180.method3182(true);
			}
		}
		if (bool) {
			if (aClass169Array10863 == null || aClass169Array10863.length > 1)
				method17050(1, (short) 32232);
			class180.method3536(class432_48_, aClass169Array10863[0], class295.aClass439_3341);
		} else if (aClass169Array10863 == null || aClass169Array10863.length < aClass176Array11952.length)
			method17050(aClass176Array11952.length, (short) 17726);
		if (class558 == null)
			class558 = Class171_Sub1.method14736(method18834(-1591272140), -1474237110);
		method18532(class180, aClass176Array11952, class432_48_, false, (byte) -2);
		for (int i_52_ = 0; i_52_ < aClass176Array11952.length; i_52_++) {
			if (null != aClass176Array11952[i_52_]) {
				if (aClass295_12168.aBool3315)
					aClass176Array11952[i_52_].method2986(-1895931967 * anInt12172, anInt12173 * 1662717731, -1970013993 * anInt12162, -1976700197 * anInt12167);
				if (bool)
					aClass176Array11952[i_52_].method2889(class432_48_, null, 0);
				else
					aClass176Array11952[i_52_].method2889(class432_48_, (aClass169Array10863[i_52_]), 0);
			} else if (!bool)
				aClass169Array10863[i_52_].aBool1874 = false;
		}
		if (null != aClass613_11949) {
			Class182 class182 = aClass613_11949.method10139();
			class180.method3179(class182);
		}
		for (int i_53_ = 0; i_53_ < aClass176Array11952.length; i_53_++) {
			if (aClass176Array11952[i_53_] != null)
				aBool11951 |= aClass176Array11952[i_53_].method2949();
			aClass176Array11952[i_53_] = null;
		}
		anInt11890 = client.anInt11129 * -1710401247;
		return class558;
	}

	public Class438 method196() {
		Class438 class438 = Class438.method7020();
		class438.method7030(Class428.method6863(1085423875 * aClass61_11936.anInt725), 0.0F, 0.0F);
		return class438;
	}

	public Class442 method201() {
		return Class442.method7137();
	}

	public Class442 method193() {
		return Class442.method7137();
	}

	public void method18843(String string, int i, int i_54_) {
		int i_55_ = (Class259.method4781((byte) -53) * (Class536.aClass615_7224.anInt8059 * -1699353169));
		method18598(string, i, i_54_, i_55_, -441238943);
	}

	void method18844(int i) {
		anInt12172 = (32 + (int) (Math.random() * 4.0)) * 617984065;
		anInt12173 = (3 + (int) (Math.random() * 2.0)) * -1316579189;
		anInt12162 = (16 + (int) (Math.random() * 3.0)) * -1631814937;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(523217667) == 1)
			anInt12167 = (int) (Math.random() * 6.0) * -705775277;
		else
			anInt12167 = (int) (Math.random() * 12.0) * -705775277;
	}

	public Class549 method17057(Class180 class180) {
		return null;
	}

	public void method18845() {
		anInt11932 = 2103282385;
		anInt11899 = 342166455 * client.anInt11019;
	}

	public int method17059() {
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1533847477);
			if (null != class295 && 380835039 * class295.anInt3335 != -1)
				return class295.anInt3335 * 380835039;
		}
		return (-1 != aClass295_12168.anInt3335 * 380835039 ? aClass295_12168.anInt3335 * 380835039 : super.method17049((byte) -66));
	}

	public int method17035() {
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1899703872);
			if (null != class295 && 380835039 * class295.anInt3335 != -1)
				return class295.anInt3335 * 380835039;
		}
		return (-1 != aClass295_12168.anInt3335 * 380835039 ? aClass295_12168.anInt3335 * 380835039 : super.method17049((byte) -113));
	}

	int method17036() {
		if (null == aClass295_12168)
			return 0;
		return -1958110209 * aClass295_12168.anInt3344;
	}

	public Class549 method17064(Class180 class180) {
		return null;
	}

	public Class549 method17042(Class180 class180, int i) {
		return null;
	}

	void method17056(Class180 class180) {
		if (aClass295_12168 != null && (aBool11950 || method18835(class180, 0, (byte) -98))) {
			Class432 class432 = class180.method3172();
			class432.method6899(method10612());
			class432.method6896(0.0F, -5.0F, 0.0F);
			method18532(class180, aClass176Array11952, class432, aBool11950, (byte) 39);
			for (int i = 0; i < aClass176Array11952.length; i++)
				aClass176Array11952[i] = null;
		}
	}

	void method17071(Class180 class180) {
		if (aClass295_12168 != null && (aBool11950 || method18835(class180, 0, (byte) -77))) {
			Class432 class432 = class180.method3172();
			class432.method6899(method10612());
			class432.method6896(0.0F, -5.0F, 0.0F);
			method18532(class180, aClass176Array11952, class432, aBool11950, (byte) -5);
			for (int i = 0; i < aClass176Array11952.length; i++)
				aClass176Array11952[i] = null;
		}
	}

	public Class527_Sub36 method197() {
		Class592 class592 = client.aClass509_11072.method8283((short) 17308);
		return (Class545.method9049(aByte10864, ((int) method10637().aClass442_4927.aFloat4918 + class592.anInt7798 * 1216613888), -(int) method10637().aClass442_4927.aFloat4915, ((int) method10637().aClass442_4927.aFloat4919 + class592.anInt7799 * 202920448), -2099723491));
	}

	final boolean method17067() {
		return false;
	}

	final boolean method17045() {
		return false;
	}

	final boolean method17068() {
		return false;
	}

	boolean method18846(Class180 class180, int i) {
		int i_56_ = i;
		Class587 class587 = method18542(-1340438873);
		Class695 class695 = ((aClass695_11914.method14162(285987568) && !aClass695_11914.method14172(-1091716514)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-89672433) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
		int i_57_ = 261385821 * class587.anInt7740;
		int i_58_ = class587.anInt7738 * 1568751847;
		if (i_57_ != 0 || i_58_ != 0 || class587.anInt7753 * -353138087 != 0 || 0 != class587.anInt7756 * -1624976099)
			i |= 0x7;
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		boolean bool_59_ = false;
		if (anInt11932 * 391979727 != 0) {
			Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -825236596) : aClass295_12168);
			if (class295 == null || client.anInt11019 >= (-863714809 * anInt11899 + -789435441 * class295.anInt3346))
				anInt11932 = 0;
			else {
				anInt11932 = (255 - (255 * (client.anInt11019 - -863714809 * anInt11899) / (class295.anInt3346 * -789435441))) * -918117329;
				bool_59_ = true;
			}
		}
		if (bool_59_)
			i |= 0x100;
		int i_60_ = aClass61_11936.method1384((byte) 1);
		Class176 class176 = (aClass176Array11952[0] = aClass295_12168.method5303(class180, i, Class258.aClass24_Sub2_2827, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_60_, aClass308_12163, method18543(60709069), false, -1914035809));
		if (class176 == null)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 89);
		if (i_57_ != 0 || i_58_ != 0) {
			method18591(i_60_, i_57_, i_58_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 42);
			if (0 != 299555935 * anInt11927)
				aClass176Array11952[0].method2868(299555935 * anInt11927);
			if (0 != -1105701807 * anInt11943)
				aClass176Array11952[0].method2869(-1105701807 * anInt11943);
			if (-1914574331 * anInt11888 != 0)
				aClass176Array11952[0].method3015(0, -1914574331 * anInt11888, 0);
		} else
			method18591(i_60_, method18564(-1691010153) << 9, method18564(-1319253638) << 9, 0, 0, (byte) 95);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (bool_59_)
			class176.method2908((byte) (391979727 * anInt11932), null);
		method18540(class180, class587, i_56_, i_57_, i_58_, i_60_, -1536166893);
		return true;
	}

	final void method17078(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_61_, int i_62_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method17041(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_63_, int i_64_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method17073(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_65_, int i_66_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method17074() {
		throw new IllegalStateException();
	}

	public Class640_Sub1_Sub2_Sub1_Sub1(Class555 class555, int i) {
		super(class555, i, IncomingPacket.aClass95_Sub1_Sub2_4802);
		anInt12166 = -2132850665;
		anIntArray12160 = new int[6];
		anIntArray12171 = new int[6];
		method18844(960988861);
	}

	int method18595() {
		if (-1 != -710569895 * anInt12166)
			return anInt12166 * -710569895;
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -802354059);
			if (null != class295 && -1 != class295.anInt3284 * -767096327)
				return -767096327 * class295.anInt3284;
		}
		return aClass295_12168.anInt3284 * -767096327;
	}

	int method18596() {
		if (-1 != -710569895 * anInt12166)
			return anInt12166 * -710569895;
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -598379266);
			if (null != class295 && -1 != class295.anInt3284 * -767096327)
				return -767096327 * class295.anInt3284;
		}
		return aClass295_12168.anInt3284 * -767096327;
	}

	boolean method18847() {
		return aBool12177 || aClass295_12168.aBool3299;
	}

	public void method18848(int i, int i_67_, int i_68_, int i_69_) {
		anIntArray12160[i] = i_67_;
		anIntArray12171[i] = i_68_;
	}

	public int method18599() {
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1692135746);
			if (class295 != null && -1 != -1821798279 * class295.anInt3310)
				return -1821798279 * class295.anInt3310;
		}
		return aClass295_12168.anInt3310 * -1821798279;
	}

	public Class442 method190(short i) {
		return Class442.method7137();
	}

	public boolean method18604() {
		return Class536.aClass615_7224.aBool8049;
	}

	public Class640_Sub1_Sub2_Sub1_Sub1(Class555 class555) {
		super(class555, IncomingPacket.aClass95_Sub1_Sub2_4802);
		anInt12166 = -2132850665;
		anIntArray12160 = new int[6];
		anIntArray12171 = new int[6];
		method18844(960988861);
	}

	boolean method18849(Class180 class180, int i) {
		int i_70_ = i;
		Class587 class587 = method18542(-1970338555);
		Class695 class695 = ((aClass695_11914.method14162(-1358134653) && !aClass695_11914.method14172(521819699)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-67074525) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
		int i_71_ = 261385821 * class587.anInt7740;
		int i_72_ = class587.anInt7738 * 1568751847;
		if (i_71_ != 0 || i_72_ != 0 || class587.anInt7753 * -353138087 != 0 || 0 != class587.anInt7756 * -1624976099)
			i |= 0x7;
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		boolean bool_73_ = false;
		if (anInt11932 * 391979727 != 0) {
			Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 2053546384) : aClass295_12168);
			if (class295 == null || client.anInt11019 >= (-863714809 * anInt11899 + -789435441 * class295.anInt3346))
				anInt11932 = 0;
			else {
				anInt11932 = (255 - (255 * (client.anInt11019 - -863714809 * anInt11899) / (class295.anInt3346 * -789435441))) * -918117329;
				bool_73_ = true;
			}
		}
		if (bool_73_)
			i |= 0x100;
		int i_74_ = aClass61_11936.method1384((byte) 1);
		Class176 class176 = (aClass176Array11952[0] = aClass295_12168.method5303(class180, i, Class258.aClass24_Sub2_2827, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_74_, aClass308_12163, method18543(-878192730), false, -1566857708));
		if (class176 == null)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 95);
		if (i_71_ != 0 || i_72_ != 0) {
			method18591(i_74_, i_71_, i_72_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 68);
			if (0 != 299555935 * anInt11927)
				aClass176Array11952[0].method2868(299555935 * anInt11927);
			if (0 != -1105701807 * anInt11943)
				aClass176Array11952[0].method2869(-1105701807 * anInt11943);
			if (-1914574331 * anInt11888 != 0)
				aClass176Array11952[0].method3015(0, -1914574331 * anInt11888, 0);
		} else
			method18591(i_74_, method18564(-1524025143) << 9, method18564(-1158117057) << 9, 0, 0, (byte) 23);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (bool_73_)
			class176.method2908((byte) (391979727 * anInt11932), null);
		method18540(class180, class587, i_70_, i_71_, i_72_, i_74_, -1235857108);
		return true;
	}

	public boolean method18607() {
		return Class536.aClass615_7224.aBool8049;
	}

	final void method17062(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_75_, int i_76_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method18850(Class295 class295) {
		method18833(class295, true, true, true, (byte) 27);
	}

	public Class527_Sub36 method188() {
		Class592 class592 = client.aClass509_11072.method8283((short) 31304);
		return (Class545.method9049(aByte10864, ((int) method10637().aClass442_4927.aFloat4918 + class592.anInt7798 * 1216613888), -(int) method10637().aClass442_4927.aFloat4915, ((int) method10637().aClass442_4927.aFloat4919 + class592.anInt7799 * 202920448), -2134954801));
	}

	public int method18544(int i) {
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 313648222);
			if (class295 != null && -1 != -1821798279 * class295.anInt3310)
				return -1821798279 * class295.anInt3310;
		}
		return aClass295_12168.anInt3310 * -1821798279;
	}

	int method17087() {
		if (null == aClass295_12168)
			return 0;
		return -1958110209 * aClass295_12168.anInt3344;
	}

	int method17079() {
		if (null == aClass295_12168)
			return 0;
		return -1958110209 * aClass295_12168.anInt3344;
	}

	public Class523 method18629() {
		if (null != aClass523_11921 && aClass523_11921.aString7090 == null)
			return null;
		return aClass523_11921;
	}

	public Class523 method18630() {
		if (null != aClass523_11921 && aClass523_11921.aString7090 == null)
			return null;
		return aClass523_11921;
	}

	public Class523 method18533() {
		if (null != aClass523_11921 && aClass523_11921.aString7090 == null)
			return null;
		return aClass523_11921;
	}

	public void method18851() {
		anInt11932 = 2103282385;
		anInt11899 = 342166455 * client.anInt11019;
	}

	public final void method18852(Class681 class681, int i) {
		int i_77_ = anIntArray11902[0];
		int i_78_ = anIntArray11944[0];
		switch (-538279681 * class681.anInt8637) {
		case 1:
			i_77_++;
			i_78_--;
			break;
		case 7:
			i_77_--;
			break;
		case 6:
			i_78_++;
			break;
		case 0:
			i_77_--;
			i_78_--;
			break;
		case 3:
			i_77_++;
			break;
		case 5:
			i_78_--;
			break;
		case 4:
			i_77_--;
			i_78_++;
			break;
		case 2:
			i_77_++;
			i_78_++;
			break;
		}
		if (aClass695_11914.method14162(-2068898975) && (aClass695_11914.method14163(-1032294288).anInt2185 * -707228641 == 1)) {
			anIntArray11931 = null;
			aClass695_11914.method14165(-1, (byte) 24);
		}
		for (int i_79_ = 0; i_79_ < aClass505Array11915.length; i_79_++) {
			if (-1 != 1429262853 * aClass505Array11915[i_79_].anInt6909) {
				Class685 class685 = ((Class685) (Class57.aClass24_Sub4_720.method81(1429262853 * aClass505Array11915[i_79_].anInt6909, -595402673)));
				if (class685.aBool8665 && -1 != class685.anInt8671 * -1567837355 && (((Class198) Class321.aClass24_Sub10_3551.method81(((class685.anInt8671) * -1567837355), 5588859)).anInt2185) * -707228641 == 1) {
					aClass505Array11915[i_79_].aClass695_6911.method14165(-1, (byte) 72);
					aClass505Array11915[i_79_].anInt6909 = 82367795;
				}
			}
		}
		if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
			anInt11942 += 1705181029;
		for (int i_80_ = -1057678739 * anInt11942; i_80_ > 0; i_80_--) {
			anIntArray11902[i_80_] = anIntArray11902[i_80_ - 1];
			anIntArray11944[i_80_] = anIntArray11944[i_80_ - 1];
			aByteArray11945[i_80_] = aByteArray11945[i_80_ - 1];
		}
		anIntArray11902[0] = i_77_;
		anIntArray11944[0] = i_78_;
		aByteArray11945[0] = (byte) i;
	}

	public int method18600() {
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 1231416495);
			if (class295 != null && -1 != -1821798279 * class295.anInt3310)
				return -1821798279 * class295.anInt3310;
		}
		return aClass295_12168.anInt3310 * -1821798279;
	}

	public void method18853(Class295 class295) {
		method18833(class295, true, true, true, (byte) 24);
	}

	public Class549 method17058(Class180 class180) {
		return null;
	}

	public void method18854(Class295 class295, boolean bool, boolean bool_81_, boolean bool_82_) {
		if (class295 != aClass295_12168 && Class35.aBool338 && Class352.method6214(-541403241 * anInt11955, -733978003))
			Exception_Sub7.method17974(1796367287);
		aClass295_12168 = class295;
		if (null != aClass295_12168) {
			if (bool)
				aString12169 = aClass295_12168.aString3279;
			if (bool_81_)
				anInt12170 = aClass295_12168.anInt3285 * -882122449;
			if (bool_82_)
				aClass297_12164 = null;
		}
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
	}

	void method17081(Class180 class180, int i) {
		if (aClass295_12168 != null && (aBool11950 || method18835(class180, 0, (byte) -32))) {
			Class432 class432 = class180.method3172();
			class432.method6899(method10612());
			class432.method6896(0.0F, -5.0F, 0.0F);
			method18532(class180, aClass176Array11952, class432, aBool11950, (byte) 104);
			for (int i_83_ = 0; i_83_ < aClass176Array11952.length; i_83_++)
				aClass176Array11952[i_83_] = null;
		}
	}

	boolean method18855() {
		return aBool12177 || aClass295_12168.aBool3299;
	}

	boolean method18856(Class180 class180, int i) {
		int i_84_ = i;
		Class587 class587 = method18542(-1798871322);
		Class695 class695 = ((aClass695_11914.method14162(-2105937735) && !aClass695_11914.method14172(62947922)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(14039784) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
		int i_85_ = 261385821 * class587.anInt7740;
		int i_86_ = class587.anInt7738 * 1568751847;
		if (i_85_ != 0 || i_86_ != 0 || class587.anInt7753 * -353138087 != 0 || 0 != class587.anInt7756 * -1624976099)
			i |= 0x7;
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		boolean bool_87_ = false;
		if (anInt11932 * 391979727 != 0) {
			Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 1709116079) : aClass295_12168);
			if (class295 == null || client.anInt11019 >= (-863714809 * anInt11899 + -789435441 * class295.anInt3346))
				anInt11932 = 0;
			else {
				anInt11932 = (255 - (255 * (client.anInt11019 - -863714809 * anInt11899) / (class295.anInt3346 * -789435441))) * -918117329;
				bool_87_ = true;
			}
		}
		if (bool_87_)
			i |= 0x100;
		int i_88_ = aClass61_11936.method1384((byte) 1);
		Class176 class176 = (aClass176Array11952[0] = aClass295_12168.method5303(class180, i, Class258.aClass24_Sub2_2827, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_88_, aClass308_12163, method18543(-1502472688), false, -1961546275));
		if (class176 == null)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 74);
		if (i_85_ != 0 || i_86_ != 0) {
			method18591(i_88_, i_85_, i_86_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 63);
			if (0 != 299555935 * anInt11927)
				aClass176Array11952[0].method2868(299555935 * anInt11927);
			if (0 != -1105701807 * anInt11943)
				aClass176Array11952[0].method2869(-1105701807 * anInt11943);
			if (-1914574331 * anInt11888 != 0)
				aClass176Array11952[0].method3015(0, -1914574331 * anInt11888, 0);
		} else
			method18591(i_88_, method18564(-2102476272) << 9, method18564(-1889974673) << 9, 0, 0, (byte) 80);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (bool_87_)
			class176.method2908((byte) (391979727 * anInt11932), null);
		method18540(class180, class587, i_84_, i_85_, i_86_, i_88_, -764823858);
		return true;
	}

	boolean method18857(Class180 class180, int i) {
		int i_89_ = i;
		Class587 class587 = method18542(-2044483351);
		Class695 class695 = ((aClass695_11914.method14162(-1390567249) && !aClass695_11914.method14172(-1741401830)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-1275646623) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
		int i_90_ = 261385821 * class587.anInt7740;
		int i_91_ = class587.anInt7738 * 1568751847;
		if (i_90_ != 0 || i_91_ != 0 || class587.anInt7753 * -353138087 != 0 || 0 != class587.anInt7756 * -1624976099)
			i |= 0x7;
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		boolean bool_92_ = false;
		if (anInt11932 * 391979727 != 0) {
			Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 818045106) : aClass295_12168);
			if (class295 == null || client.anInt11019 >= (-863714809 * anInt11899 + -789435441 * class295.anInt3346))
				anInt11932 = 0;
			else {
				anInt11932 = (255 - (255 * (client.anInt11019 - -863714809 * anInt11899) / (class295.anInt3346 * -789435441))) * -918117329;
				bool_92_ = true;
			}
		}
		if (bool_92_)
			i |= 0x100;
		int i_93_ = aClass61_11936.method1384((byte) 1);
		Class176 class176 = (aClass176Array11952[0] = aClass295_12168.method5303(class180, i, Class258.aClass24_Sub2_2827, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_93_, aClass308_12163, method18543(-1318444192), false, -1731798723));
		if (class176 == null)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 81);
		if (i_90_ != 0 || i_91_ != 0) {
			method18591(i_93_, i_90_, i_91_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 20);
			if (0 != 299555935 * anInt11927)
				aClass176Array11952[0].method2868(299555935 * anInt11927);
			if (0 != -1105701807 * anInt11943)
				aClass176Array11952[0].method2869(-1105701807 * anInt11943);
			if (-1914574331 * anInt11888 != 0)
				aClass176Array11952[0].method3015(0, -1914574331 * anInt11888, 0);
		} else
			method18591(i_93_, method18564(-1702492332) << 9, method18564(-1338814715) << 9, 0, 0, (byte) 70);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (bool_92_)
			class176.method2908((byte) (391979727 * anInt11932), null);
		method18540(class180, class587, i_89_, i_90_, i_91_, i_93_, -1659427393);
		return true;
	}

	boolean method18858(Class180 class180, int i) {
		int i_94_ = i;
		Class587 class587 = method18542(-1879420369);
		Class695 class695 = ((aClass695_11914.method14162(-206478465) && !aClass695_11914.method14172(233815854)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-319705963) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
		int i_95_ = 261385821 * class587.anInt7740;
		int i_96_ = class587.anInt7738 * 1568751847;
		if (i_95_ != 0 || i_96_ != 0 || class587.anInt7753 * -353138087 != 0 || 0 != class587.anInt7756 * -1624976099)
			i |= 0x7;
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		boolean bool_97_ = false;
		if (anInt11932 * 391979727 != 0) {
			Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 856816202) : aClass295_12168);
			if (class295 == null || client.anInt11019 >= (-863714809 * anInt11899 + -789435441 * class295.anInt3346))
				anInt11932 = 0;
			else {
				anInt11932 = (255 - (255 * (client.anInt11019 - -863714809 * anInt11899) / (class295.anInt3346 * -789435441))) * -918117329;
				bool_97_ = true;
			}
		}
		if (bool_97_)
			i |= 0x100;
		int i_98_ = aClass61_11936.method1384((byte) 1);
		Class176 class176 = (aClass176Array11952[0] = aClass295_12168.method5303(class180, i, Class258.aClass24_Sub2_2827, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_98_, aClass308_12163, method18543(1837233960), false, -1288518904));
		if (class176 == null)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 76);
		if (i_95_ != 0 || i_96_ != 0) {
			method18591(i_98_, i_95_, i_96_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 16);
			if (0 != 299555935 * anInt11927)
				aClass176Array11952[0].method2868(299555935 * anInt11927);
			if (0 != -1105701807 * anInt11943)
				aClass176Array11952[0].method2869(-1105701807 * anInt11943);
			if (-1914574331 * anInt11888 != 0)
				aClass176Array11952[0].method3015(0, -1914574331 * anInt11888, 0);
		} else
			method18591(i_98_, method18564(-1821976789) << 9, method18564(-1706827164) << 9, 0, 0, (byte) 10);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (bool_97_)
			class176.method2908((byte) (391979727 * anInt11932), null);
		method18540(class180, class587, i_94_, i_95_, i_96_, i_98_, -1834619382);
		return true;
	}

	static {
		anInt12165 = 768707353;
	}

	public final void method18859(Class681 class681, int i) {
		int i_99_ = anIntArray11902[0];
		int i_100_ = anIntArray11944[0];
		switch (-538279681 * class681.anInt8637) {
		case 1:
			i_99_++;
			i_100_--;
			break;
		case 7:
			i_99_--;
			break;
		case 6:
			i_100_++;
			break;
		case 0:
			i_99_--;
			i_100_--;
			break;
		case 3:
			i_99_++;
			break;
		case 5:
			i_100_--;
			break;
		case 4:
			i_99_--;
			i_100_++;
			break;
		case 2:
			i_99_++;
			i_100_++;
			break;
		}
		if (aClass695_11914.method14162(-1367491478) && (aClass695_11914.method14163(511446557).anInt2185 * -707228641 == 1)) {
			anIntArray11931 = null;
			aClass695_11914.method14165(-1, (byte) 69);
		}
		for (int i_101_ = 0; i_101_ < aClass505Array11915.length; i_101_++) {
			if (-1 != 1429262853 * aClass505Array11915[i_101_].anInt6909) {
				Class685 class685 = ((Class685) (Class57.aClass24_Sub4_720.method81(1429262853 * aClass505Array11915[i_101_].anInt6909, 1713433195)));
				if (class685.aBool8665 && -1 != class685.anInt8671 * -1567837355 && (((Class198) Class321.aClass24_Sub10_3551.method81(((class685.anInt8671) * -1567837355), -1753247118)).anInt2185) * -707228641 == 1) {
					aClass505Array11915[i_101_].aClass695_6911.method14165(-1, (byte) 29);
					aClass505Array11915[i_101_].anInt6909 = 82367795;
				}
			}
		}
		if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
			anInt11942 += 1705181029;
		for (int i_102_ = -1057678739 * anInt11942; i_102_ > 0; i_102_--) {
			anIntArray11902[i_102_] = anIntArray11902[i_102_ - 1];
			anIntArray11944[i_102_] = anIntArray11944[i_102_ - 1];
			aByteArray11945[i_102_] = aByteArray11945[i_102_ - 1];
		}
		anIntArray11902[0] = i_99_;
		anIntArray11944[0] = i_100_;
		aByteArray11945[0] = (byte) i;
	}

	public void method18860(int i, int i_103_, int i_104_, boolean bool, int i_105_) {
		aByte10864 = aByte10862 = (byte) i;
		if (client.aClass509_11072.method8359(463594087).method7706(i_103_, i_104_, (short) 2604))
			aByte10862++;
		if (aClass695_11914.method14162(-1661926354) && (aClass695_11914.method14163(-343327132).anInt2185 * -707228641 == 1)) {
			anIntArray11931 = null;
			aClass695_11914.method14165(-1, (byte) 124);
		}
		for (int i_106_ = 0; i_106_ < aClass505Array11915.length; i_106_++) {
			if (aClass505Array11915[i_106_].anInt6909 * 1429262853 != -1) {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(((aClass505Array11915[i_106_].anInt6909) * 1429262853), -844707528));
				if (class685.aBool8665 && -1567837355 * class685.anInt8671 != -1 && (((Class198) Class321.aClass24_Sub10_3551.method81(((class685.anInt8671) * -1567837355), 987141808)).anInt2185) * -707228641 == 1) {
					aClass505Array11915[i_106_].aClass695_6911.method14165(-1, (byte) 27);
					aClass505Array11915[i_106_].anInt6909 = 82367795;
				}
			}
		}
		if (!bool) {
			int i_107_ = i_103_ - anIntArray11902[0];
			int i_108_ = i_104_ - anIntArray11944[0];
			if (i_107_ >= -8 && i_107_ <= 8 && i_108_ >= -8 && i_108_ <= 8) {
				if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
					anInt11942 += 1705181029;
				for (int i_109_ = -1057678739 * anInt11942; i_109_ > 0; i_109_--) {
					anIntArray11902[i_109_] = anIntArray11902[i_109_ - 1];
					anIntArray11944[i_109_] = anIntArray11944[i_109_ - 1];
					aByteArray11945[i_109_] = aByteArray11945[i_109_ - 1];
				}
				anIntArray11902[0] = i_103_;
				anIntArray11944[0] = i_104_;
				aByteArray11945[0] = Class679.aClass679_8622.aByte8627;
				return;
			}
		}
		anInt11942 = 0;
		anInt11947 = 0;
		anInt11946 = 0;
		anIntArray11902[0] = i_103_;
		anIntArray11944[0] = i_104_;
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 = (float) ((i_105_ << 8) + (anIntArray11902[0] << 9));
		class442.aFloat4919 = (float) ((anIntArray11944[0] << 9) + (i_105_ << 8));
		method10618(class442);
		class442.method7141();
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
	}

	public final boolean method18861() {
		if (aClass295_12168 == null)
			return false;
		return true;
	}

	public int method18626() {
		return -541403241 * anInt11955 + 1;
	}

	int method18552() {
		if (-1 != -710569895 * anInt12166)
			return anInt12166 * -710569895;
		if (null != aClass295_12168.anIntArray3312) {
			Class295 class295 = aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1101186171);
			if (null != class295 && -1 != class295.anInt3284 * -767096327)
				return -767096327 * class295.anInt3284;
		}
		return aClass295_12168.anInt3284 * -767096327;
	}

	public int method18862(int i) {
		return anIntArray12160[i];
	}

	public void method18863(int i, int i_110_, int i_111_) {
		anIntArray12160[i] = i_110_;
		anIntArray12171[i] = i_111_;
	}

	public void method18864(int i, int i_112_, int i_113_) {
		anIntArray12160[i] = i_112_;
		anIntArray12171[i] = i_113_;
	}

	public void method18865(int i, int i_114_, int i_115_) {
		anIntArray12160[i] = i_114_;
		anIntArray12171[i] = i_115_;
	}

	public void method18866(String string, int i, int i_116_) {
		int i_117_ = (Class259.method4781((byte) 11) * (Class536.aClass615_7224.anInt8059 * -1699353169));
		method18598(string, i, i_116_, i_117_, -441238943);
	}

	public void method18867(String string, int i, int i_118_) {
		int i_119_ = (Class259.method4781((byte) -6) * (Class536.aClass615_7224.anInt8059 * -1699353169));
		method18598(string, i, i_118_, i_119_, -441238943);
	}

	public void method18868(String string, int i, int i_120_) {
		int i_121_ = (Class259.method4781((byte) -66) * (Class536.aClass615_7224.anInt8059 * -1699353169));
		method18598(string, i, i_120_, i_121_, -441238943);
	}

	public void method18869(String string, int i, int i_122_) {
		int i_123_ = (Class259.method4781((byte) -52) * (Class536.aClass615_7224.anInt8059 * -1699353169));
		method18598(string, i, i_122_, i_123_, -441238943);
	}

	Class558 method17040(Class180 class180, byte i) {
		if (null == aClass295_12168 || !method18835(class180, 526336, (byte) -113))
			return null;
		Class432 class432 = method10612();
		Class445 class445 = method10637();
		Class432 class432_124_ = class180.method3172();
		int i_125_ = aClass61_11936.method1384((byte) 1);
		Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][(int) class445.aClass442_4927.aFloat4918 >> 9][(int) class445.aClass442_4927.aFloat4919 >> 9]);
		if (class561 != null && class561.aClass640_Sub1_Sub4_7556 != null) {
			int i_126_ = (1017774861 * anInt11903 - class561.aClass640_Sub1_Sub4_7556.aShort11871);
			anInt11903 = -1593015355 * (int) ((float) (1017774861 * anInt11903) - (float) i_126_ / 10.0F);
		} else
			anInt11903 = (-1593015355 * (int) ((float) (anInt11903 * 1017774861) - (float) (1017774861 * anInt11903) / 10.0F));
		class432_124_.method6899(class432);
		class432_124_.method6896(0.0F, (float) (-20 - 1017774861 * anInt11903), 0.0F);
		Class587 class587 = method18542(-2007321542);
		Class295 class295 = (aClass295_12168.anIntArray3312 != null ? aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 1292382600) : aClass295_12168);
		boolean bool = class295.aClass439_3341 != null;
		aBool11951 = false;
		Class558 class558 = null;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub10_10611.method16939((short) 1260) == 1 && class295.aBool3274 && class587.aBool7717) {
			Class695 class695 = ((aClass695_11914.method14162(-363654620) && aClass695_11914.method14172(1294012641)) ? aClass695_11914 : null);
			Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-36565357) && (!aClass695_Sub2_11913.aBool10970 || null == class695)) ? aClass695_Sub2_11913 : null);
			short i_127_ = Class536.aClass615_7224.aShort8051;
			byte i_128_ = Class536.aClass615_7224.aByte8037;
			if (aClass295_12168.aShort3322 > -1) {
				i_127_ = aClass295_12168.aShort3322;
				i_128_ = aClass295_12168.aByte3323;
			}
			Class176 class176;
			if (i_127_ > -1 && Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(882295091) == 1)
				class176 = Class576.method9635(class180, i_125_, 299555935 * anInt11927, anInt11943 * -1105701807, -1914574331 * anInt11888, aClass176Array11952[0], i_127_, i_128_, (class695_sub2 != null ? (Class695) class695_sub2 : class695), (byte) 14);
			else
				class176 = Class35.method1127(class180, i_125_, 299555935 * anInt11927, -1105701807 * anInt11943, anInt11888 * -1914574331, 897343531 * aClass295_12168.anInt3342, aClass176Array11952[0], aClass295_12168.aShort3318 & 0xffff, aClass295_12168.aShort3319 & 0xffff, aClass295_12168.aByte3320 & 0xff, aClass295_12168.aByte3288 & 0xff, (class695_sub2 != null ? (Class695) class695_sub2 : class695), -86896371);
			if (null != class176) {
				class558 = Class171_Sub1.method14736(method18834(-1930528445), -312370085);
				aBool11951 = true;
				class180.method3182(false);
				if (bool)
					class176.method2889(class432_124_, null, 0);
				else {
					if (aClass169Array10863 == null || (aClass169Array10863.length < 1 + aClass176Array11952.length))
						method17050(aClass176Array11952.length + 1, (short) 30709);
					class176.method2889(class432_124_, (aClass169Array10863[aClass176Array11952.length]), 0);
				}
				class180.method3182(true);
			}
		}
		if (bool) {
			if (aClass169Array10863 == null || aClass169Array10863.length > 1)
				method17050(1, (short) 26242);
			class180.method3536(class432_124_, aClass169Array10863[0], class295.aClass439_3341);
		} else if (aClass169Array10863 == null || aClass169Array10863.length < aClass176Array11952.length)
			method17050(aClass176Array11952.length, (short) 21570);
		if (class558 == null)
			class558 = Class171_Sub1.method14736(method18834(-775336671), 963099282);
		method18532(class180, aClass176Array11952, class432_124_, false, (byte) 6);
		for (int i_129_ = 0; i_129_ < aClass176Array11952.length; i_129_++) {
			if (null != aClass176Array11952[i_129_]) {
				if (aClass295_12168.aBool3315)
					aClass176Array11952[i_129_].method2986(-1895931967 * anInt12172, anInt12173 * 1662717731, -1970013993 * anInt12162, -1976700197 * anInt12167);
				if (bool)
					aClass176Array11952[i_129_].method2889(class432_124_, null, 0);
				else
					aClass176Array11952[i_129_].method2889(class432_124_, (aClass169Array10863[i_129_]), 0);
			} else if (!bool)
				aClass169Array10863[i_129_].aBool1874 = false;
		}
		if (null != aClass613_11949) {
			Class182 class182 = aClass613_11949.method10139();
			class180.method3179(class182);
		}
		for (int i_130_ = 0; i_130_ < aClass176Array11952.length; i_130_++) {
			if (aClass176Array11952[i_130_] != null)
				aBool11951 |= aClass176Array11952[i_130_].method2949();
			aClass176Array11952[i_130_] = null;
		}
		anInt11890 = client.anInt11129 * -1710401247;
		return class558;
	}

	public boolean method17080() {
		if (null != aClass295_12168.anIntArray3312 && (aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -993389844) == null))
			return false;
		return true;
	}

	public boolean method17034() {
		if (null != aClass295_12168.anIntArray3312 && (aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 2024348100) == null))
			return false;
		return true;
	}

	public boolean method17082() {
		if (null != aClass295_12168.anIntArray3312 && (aClass295_12168.method5314(Class671.aClass97_8584, Class671.aClass97_8584, 931358019) == null))
			return false;
		return true;
	}

	static void method18870(Class180 class180, short i) {
		if ((-943170217 * Class35.anInt346 >= 2 || client.aBool11188) && null == client.aClass243_11150) {
			String string;
			if (client.aBool11188 && -943170217 * Class35.anInt346 < 2)
				string = new StringBuilder().append(client.aString11191).append(Class53.aClass53_667.method1290((Class144_Sub1.aClass671_8995), (byte) -75)).append(client.aString11192).append(" ").append(Class33.aString326).toString();
			else if (Class652.method10895(-733948691) && Class35.anInt346 * -943170217 > 2)
				string = Class72.method1496(Class200.aClass527_Sub8_Sub7_2202, (byte) -123);
			else {
				Class527_Sub8_Sub7 class527_sub8_sub7 = Class200.aClass527_Sub8_Sub7_2202;
				if (class527_sub8_sub7 == null)
					return;
				string = Class72.method1496(class527_sub8_sub7, (byte) -70);
				int[] is = Class700_Sub41.method17315(class527_sub8_sub7, -1419422402);
				if (null != is)
					string = new StringBuilder().append(string).append(Class370.method6358(is, -1192518486)).toString();
			}
			if (Class35.anInt346 * -943170217 > 2)
				string = new StringBuilder().append(string).append(Class232.method4330(16777215, 1026545389)).append(" / ").append(-943170217 * Class35.anInt346 - 2).append(Class53.aClass53_659.method1290((Class144_Sub1.aClass671_8995), (byte) -89)).toString();
			if (null != Class35.aClass243_332) {
				Class174 class174 = Class35.aClass243_332.method4516(Class211.aClass420_2256, (client.anInterface50_11053), -539509299);
				if (null == class174)
					class174 = Class29.aClass174_262;
				class174.method2767(string, 1237393855 * Class35.anInt356, -219415593 * Class35.anInt371, -1054537975 * Class35.aClass243_332.anInt2511, Class35.aClass243_332.anInt2514 * -1386504031, Class35.aClass243_332.anInt2527 * -192538049, -413972121 * Class35.aClass243_332.anInt2621, Class35.aClass243_332.anInt2580 * 1184331787, Class35.aClass243_332.anInt2581 * 213133865, client.aRandom11092, Class610.anInt8001, client.anIntArray11257, Class191.aClass147Array2138, null, -459088376);
				Class554_Sub1.method16829(client.anIntArray11257[0], client.anIntArray11257[1], client.anIntArray11257[2], client.anIntArray11257[3], (byte) 3);
			}
		}
	}
}
