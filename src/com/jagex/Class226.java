/* Class226 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class226 {
	int anInt2320;
	static final int anInt2321 = 8192;
	static final int anInt2322 = 16384;
	static final int anInt2323 = 8192;
	List aList2324;
	boolean aBool2325;
	Interface56 anInterface56_2326;
	boolean aBool2327;
	List aList2328 = new ArrayList();
	List aList2329 = new ArrayList();
	static final int anInt2330 = 4096;
	HashMap aHashMap2331;
	Interface56 anInterface56_2332;
	Class205 aClass205_2333;
	HashMap aHashMap2334 = new HashMap();
	static final int anInt2335 = 4096;
	int anInt2336;
	Class442 aClass442_2337;
	HashMap aHashMap2338;
	static final int anInt2339 = 0;
	Class483 aClass483_2340;
	Class205 aClass205_2341;
	boolean aBool2342;
	int anInt2343;
	int anInt2344;
	static final int anInt2345 = 16384;
	Class483 aClass483_2346;
	Interface56 anInterface56_2347;
	Interface56 anInterface56_2348;
	Class205 aClass205_2349;
	public static Interface24 anInterface24_2350;
	static Class243 aClass243_2351;
	static int anInt2352;

	Interface70 method4193(int i, boolean bool, byte i_0_) {
		if (!aBool2327)
			return null;
		Interface70 interface70 = (Interface70) (bool ? aClass205_2341.method3787((long) i) : aClass205_2333.method3787((long) i));
		if (null == interface70) {
			if (bool)
				interface70 = (Interface70) aHashMap2331.get(Integer.valueOf(i));
			else
				interface70 = (Interface70) aHashMap2334.get(Integer.valueOf(i));
		}
		return interface70;
	}

	public void method4194(Class198 class198, int i, Class640_Sub1 class640_sub1, byte i_1_) {
		if (class198 != null && null != class198.anIntArrayArray2178 && i < class198.anIntArrayArray2178.length && class198.anIntArrayArray2178[i] != null && (class640_sub1.aByte10864 == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) && class640_sub1.method17060((byte) 1)) {
			int i_2_ = class198.anIntArrayArray2178[i][0];
			int i_3_ = i_2_ >> 8;
			int i_4_ = i_2_ >> 5 & 0x7;
			int i_5_ = i_2_ & 0x1f;
			if (class198.anIntArrayArray2178[i].length > 1) {
				int i_6_ = (int) (Math.random() * (double) (class198.anIntArrayArray2178[i]).length);
				if (i_6_ > 0)
					i_3_ = class198.anIntArrayArray2178[i][i_6_];
			}
			int i_7_ = 256;
			if (class198.anIntArray2169 != null && null != class198.anIntArray2173)
				i_7_ = ((int) (Math.random() * (double) (class198.anIntArray2173[i] - class198.anIntArray2169[i])) + class198.anIntArray2169[i]);
			int i_8_ = (class198.anIntArray2189 == null ? 255 : class198.anIntArray2189[i]);
			if (i_5_ == 0) {
				if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == class640_sub1)
					method4218(Class193.aClass193_2142, i_3_, i_4_, i_8_, Class206.aClass206_2223.method3836(-1119685786), Class189.aClass189_2126, 0.0F, 0.0F, null, class640_sub1.aByte10864, i_7_, 0, 1151747660);
			} else {
				if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == class640_sub1) {
					if (Class204.aClass527_Sub31_2213.aClass700_Sub24_10633.method17139((byte) -9) == 0)
						return;
				} else if (Class204.aClass527_Sub31_2213.aClass700_Sub24_10634.method17139((byte) -109) == 0)
					return;
				if (-1 != -384251211 * class198.anInt2176) {
					int i_9_ = 0;
					if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub1)
						i_9_ = ((Class640_Sub1_Sub2_Sub1) class640_sub1).method18553(-1506764058);
					else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub4)
						i_9_ = ((Class640_Sub1_Sub2_Sub4) class640_sub1).method18786(-225421223);
					else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub5)
						i_9_ = ((Class640_Sub1_Sub2_Sub5) class640_sub1).method18811((byte) 60);
					if (i_9_ != 0 && i_9_ != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18553(-529292562) && i_9_ != -820304157 * client.anInt11232) {
						i_8_ = i_8_ * (class198.anInt2176 * -384251211) / 100;
						if (i_8_ < 0)
							i_8_ = 0;
						else if (i_8_ > 255)
							i_8_ = 255;
					}
				}
				Class442 class442 = class640_sub1.method10637().aClass442_4927;
				int i_10_ = (int) class442.aFloat4918 - 256 >> 9;
				int i_11_ = (int) class442.aFloat4919 - 256 >> 9;
				Class442 class442_12_ = new Class442((float) (i_10_ << 9), 0.0F, (float) (i_11_ << 9));
				int i_13_ = class640_sub1.aByte10864 << 24;
				method4218(Class193.aClass193_2148, i_3_, i_4_, i_8_, Class206.aClass206_2221.method3836(-563443726), ((class640_sub1 != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) ? Class189.aClass189_2124 : Class189.aClass189_2126), 0.0F, (float) (i_5_ << 9), class442_12_, i_13_, i_7_, 0, -740593891);
			}
		}
	}

	Class205 method4195(int i) {
		return aClass205_2333;
	}

	Class205 method4196(int i) {
		return aClass205_2341;
	}

	Class442 method4197(byte i) {
		return aClass442_2337;
	}

	List method4198() {
		return aList2329;
	}

	List method4199(int i) {
		return aList2329;
	}

	public void method4200(int i) {
		if (aBool2327) {
			Class52.method1288(949233264);
			if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637() != null)) {
				if (aClass442_2337 == null)
					aClass442_2337 = new Class442();
				aClass442_2337.aFloat4918 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927.aFloat4918);
				aClass442_2337.aFloat4915 = 0.0F;
				aClass442_2337.aFloat4919 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927.aFloat4919);
			}
			Iterator iterator = aHashMap2334.values().iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				interface70.method205((byte) 86);
			}
			iterator = aHashMap2331.values().iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				interface70.method205((byte) 96);
			}
			iterator = aList2324.iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				if (interface70.method429((byte) 75))
					aHashMap2331.remove(Integer.valueOf(interface70.method434((byte) 1)));
				else
					aHashMap2334.remove(Integer.valueOf(interface70.method434((byte) 1)));
			}
			aList2324.clear();
			if (aClass483_2346 != null && (aClass483_2346.method7858(1855557036) == Class482.aClass482_5422) && false == aBool2342 && null != client.aClass109_11067.aClass2_1367 && Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4455, client.aClass109_11067.aClass2_1367, (byte) -23);
				class527_sub15.buffer.writeInt(aClass483_2346.method7926(-1988240267).method434((byte) 1), -2141394233);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				aBool2342 = true;
			}
			iterator = aList2328.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7884(-1749752092);
				class483.method7950(1288258926);
				Class482 class482 = class483.method7858(1481514231);
				if (class483.method7949((byte) 124) == this) {
					if (Class482.aClass482_5425 == class482 || class482 == Class482.aClass482_5426) {
						if ((class483.method7900((byte) 8) == Class193.aClass193_2152) || (class483.method7900((byte) 8) == Class193.aClass193_2153)) {
							if (aClass483_2346 == class483) {
								aBool2342 = false;
								aClass483_2346 = null;
								class483.method7850((byte) 0);
								aList2329.remove(class483);
							} else {
								int i_14_ = class483.method7926(-1961266316).method434((byte) 1);
								boolean bool = (method4208(Class206.aClass206_2220.method3836(1006260846), 1497230687) > 0.0F);
								if (false == aBool2325 && bool) {
									if (-743748327 * anInt2320 == i_14_) {
										method4224(i_14_, (byte) 36);
										anInt2320 = -969129769;
									}
									class483.method7850((byte) 0);
									aList2329.remove(class483);
								} else if (i_14_ == anInt2344 * -771435999) {
									anInt2344 = 232050207;
									aBool2325 = false;
									class483.method7850((byte) 0);
									aList2329.remove(class483);
									Iterator iterator_15_ = aList2328.iterator();
									while (iterator_15_.hasNext()) {
										Class483 class483_16_ = (Class483) iterator_15_.next();
										if (class483_16_.method7900((byte) 8) == Class193.aClass193_2152) {
											int i_17_ = class483_16_.method7926(-2057987807).method434((byte) 1);
											if (((i_17_ == -743748327 * anInt2320) && ((class483_16_.method7858(1090337794)) == (Class482.aClass482_5425))) || (class483_16_.method7858(918706969) == Class482.aClass482_5420) || (class483_16_.method7858(1601266596) == Class482.aClass482_5421) || (class483_16_.method7858(1548526971) == (Class482.aClass482_5422))) {
												if (class483_16_.method7858(1057463821) == Class482.aClass482_5425)
													class483_16_.method7882(478083224);
												else
													class483_16_.method7852(1969554825);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2325 || i_14_ != -743748327 * anInt2320) {
										class483.method7850((byte) 0);
										aList2329.remove(class483);
									}
									if (!aBool2325 && -743748327 * anInt2320 == i_14_) {
										anInt2320 = -969129769;
										aClass483_2340 = null;
									}
								}
							}
						} else {
							Iterator iterator_18_ = aHashMap2338.keySet().iterator();
							while (iterator_18_.hasNext()) {
								int i_19_ = ((Integer) iterator_18_.next()).intValue();
								Class212 class212 = ((Class212) aHashMap2338.get(Integer.valueOf(i_19_)));
								if (class212.method3884((short) -12766).contains(class483)) {
									class212.method3883(class483, -1680675884);
									break;
								}
							}
							class483.method7850((byte) 0);
							aList2329.remove(class483);
						}
					} else if ((class483.method7858(1877774394) != Class482.aClass482_5424) && (class483.method7855((short) 255) == Class206.aClass206_2220.method3836(-97740636))) {
						boolean bool = (method4208(Class206.aClass206_2220.method3836(-780525553), 1639964359) > 1.0E-4F);
						if (!bool)
							class483.method7864(150, (byte) 6);
					}
				}
			}
		}
	}

	boolean method4201(Class442 class442, Class442 class442_20_, float f) {
		Class442 class442_21_ = Class442.method7155(class442_20_, class442);
		if (class442_21_.method7160() >= f)
			return false;
		return true;
	}

	public void method4202(Class483 class483, int i, int i_22_, byte i_23_) {
		if (class483 != null) {
			Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
			if (class212 == null) {
				class212 = new Class212(this);
				aHashMap2338.put(Integer.valueOf(i), class212);
			}
			if (!class212.method3881(class483, (byte) 1)) {
				class483.method7880(i_22_, true, -365692000);
				class212.method3882(class483, (short) 255);
			}
		}
	}

	public void method4203(int i, int i_24_) {
		Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
		if (null != class212) {
			List list = class212.method3884((short) 693);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				if (!class483.method7874((byte) -2))
					class483.method7852(1969554825);
			}
		}
	}

	public Class226() {
		aHashMap2331 = new HashMap();
		aList2324 = new ArrayList();
		aHashMap2338 = new HashMap();
		aClass483_2346 = null;
		aBool2342 = false;
		anInterface56_2332 = new Class194(this);
		anInterface56_2347 = new Class197(this);
		anInterface56_2348 = new Class204(this);
		anInterface56_2326 = new Class203(this);
	}

	public int method4204() {
		return -743748327 * anInt2320;
	}

	void method4205(int i) {
		Class190 class190 = new Class190(this);
		Class207 class207 = new Class207(this);
		Class229 class229 = new Class229(this);
		Class230 class230 = new Class230(this);
		Class220 class220 = new Class220(this);
		Class262.method4945(Class201.aClass201_2204.method3766(1901691293), Class201.aClass201_2206.method3766(-1019752747), 0.2F, class190, (byte) -26);
		Class262.method4945(Class201.aClass201_2210.method3766(1470948790), Class201.aClass201_2206.method3766(-1573209009), 1.0F, class207, (byte) 88);
		Class262.method4945(Class201.aClass201_2207.method3766(767426650), Class201.aClass201_2206.method3766(86340122), 1.0F, class229, (byte) -19);
		Class262.method4945(Class201.aClass201_2208.method3766(115567309), Class201.aClass201_2206.method3766(460067481), 0.8F, class230, (byte) -40);
		Class262.method4945(Class201.aClass201_2209.method3766(-1204829224), Class201.aClass201_2206.method3766(-1261848391), 1.0F, class220, (byte) -52);
		Class262.method4945(Class206.aClass206_2220.method3836(897061630), Class201.aClass201_2210.method3766(-777995174), 1.0F, null, (byte) -4);
		Class262.method4945(Class206.aClass206_2222.method3836(-2145805878), Class201.aClass201_2209.method3766(-212943733), 1.0F, null, (byte) -9);
		Class262.method4945(Class206.aClass206_2228.method3836(-1721662676), Class201.aClass201_2204.method3766(-862349422), 1.0F, null, (byte) 31);
		Class262.method4945(Class206.aClass206_2223.method3836(-792492274), Class201.aClass201_2204.method3766(-2031610383), 1.0F, null, (byte) 21);
		Class262.method4945(Class206.aClass206_2221.method3836(-1256910450), Class201.aClass201_2204.method3766(-115615176), 1.0F, null, (byte) -17);
		Class262.method4945(Class206.aClass206_2225.method3836(1311657140), Class201.aClass201_2204.method3766(215187236), 1.0F, null, (byte) -3);
		Class262.method4945(Class206.aClass206_2226.method3836(-1547136872), Class201.aClass201_2204.method3766(430799884), 1.0F, null, (byte) -10);
		Class262.method4945(Class206.aClass206_2227.method3836(235649677), Class201.aClass201_2208.method3766(-1810771850), 1.0F, null, (byte) 77);
		Class262.method4945(Class206.aClass206_2229.method3836(-2057409312), Class206.aClass206_2227.method3836(-818011661), 1.0F, null, (byte) -54);
		Class262.method4945(Class206.aClass206_2224.method3836(-1425174999), Class206.aClass206_2227.method3836(2138981724), 1.0F, null, (byte) 18);
		Class458.method7469(Class206.aClass206_2220.method3836(-104056455), (byte) 0).method6309(0.75F, 440351387);
	}

	public void method4206(int i, int i_25_, int i_26_, int i_27_) {
		int i_28_ = Class201.aClass201_2206.method3766(-899785890);
		if (Class458.method7469(i, (byte) -86) == null && (i_28_ == i_25_ || Class458.method7469(i_25_, (byte) -116) != null)) {
			float f = (float) i_26_ * 1.5258789E-5F;
			Class262.method4945(i, i_28_ == i_25_ ? -1 : i_25_, f, null, (byte) -60);
		}
	}

	public void method4207(Class483 class483) {
		class483.method7859(this, 1386726796);
		aList2329.add(class483);
	}

	float method4208(int i, int i_29_) {
		Class360 class360 = Class458.method7469(i, (byte) -108);
		float f = 1.0F;
		for (/**/; class360 != null; class360 = class360.method6306((short) 163))
			f *= class360.method6310(-1983899737);
		return f;
	}

	public void method4209(int i, int i_30_) {
		if (aBool2327 && (!aBool2325 || -771435999 * anInt2344 != i)) {
			if (aBool2325 && -771435999 * anInt2344 != i) {
				Iterator iterator = aList2328.iterator();
				while (iterator.hasNext()) {
					Class483 class483 = (Class483) iterator.next();
					if (class483.method7900((byte) 8) == Class193.aClass193_2153) {
						class483.method7850((byte) 0);
						aList2329.remove(class483);
						aBool2325 = false;
						break;
					}
				}
			}
			if (i_30_ != 0 && -1 != i) {
				if (!aBool2325 && aClass483_2340 != null)
					aClass483_2340.method7875(-968710475);
				Class483 class483 = method4211(Class193.aClass193_2153, this, i, 0, i_30_, Class206.aClass206_2220.method3836(-708378475), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 255, true, (byte) 118);
				if (null != class483) {
					class483.method7852(1969554825);
					method4215(class483, (byte) -1);
					aBool2325 = true;
					anInt2344 = -232050207 * i;
				}
			}
		}
	}

	void method4210(int i) {
		if (client.aClass109_11067.aClass2_1367 != null && Class167.method2677(client.anInt11048 * -1927019389, (byte) 17)) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4428, client.aClass109_11067.aClass2_1367, (byte) 18);
			class527_sub15.buffer.writeInt(i, -1758170320);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	public Class483 method4211(Class193 class193, Object object, int i, int i_31_, int i_32_, int i_33_, Class189 class189, float f, float f_34_, Class442 class442, int i_35_, int i_36_, boolean bool, byte i_37_) {
		if (!aBool2327)
			return null;
		if (null == object)
			return null;
		i_32_ = Math.max(0, Math.min(i_32_, 255));
		i_36_ = Math.max(0, i_36_);
		if (Class189.aClass189_2126 != class189 && !method4216(aClass442_2337, class442, f_34_, (byte) 1))
			return null;
		if (i_36_ <= 0)
			i_36_ = 255;
		float f_38_ = (float) i_32_ / 255.0F;
		float f_39_ = (float) i_36_ / 255.0F;
		Interface70 interface70 = method4213(i, bool, (byte) 95);
		Class483 class483 = method4214(interface70, -2008985333);
		if (null == class483)
			return null;
		class483.method7859(object, 1386726796);
		class483.method7862(i_33_, (byte) 69);
		if (class189 != Class189.aClass189_2126) {
			class483.method7893(true, (byte) 0);
			class483.method7867(class442, 1474750881);
			class483.method7911(f, -828609922);
			class483.method7872(f_34_, (byte) 0);
			if (class189 == Class189.aClass189_2122)
				class483.method7847(anInterface56_2347, (byte) 5);
			else if (Class189.aClass189_2125 == class189)
				class483.method7847(anInterface56_2326, (byte) 21);
			else if (class189 == Class189.aClass189_2124)
				class483.method7847(anInterface56_2332, (byte) 22);
			else if (class189 == Class189.aClass189_2123)
				class483.method7847(anInterface56_2348, (byte) 82);
			else
				class483.method7893(false, (byte) 0);
		}
		class483.method7876(f_38_, 0, 2082021783);
		class483.method7870(i_31_ > 1 || i_31_ < 0, i_31_ > 0 ? i_31_ - 1 : i_31_, -763931080);
		class483.method7878(f_39_, 168947023);
		class483.method7861(class193, (byte) 105);
		return class483;
	}

	public void method4212(int i, int i_40_) {
		Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
		if (null != class212) {
			List list = class212.method3884((short) 23200);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7851((byte) 0);
			}
		}
	}

	Interface70 method4213(int i, boolean bool, byte i_41_) {
		if (!aBool2327)
			return null;
		Interface70 interface70 = method4193(i, bool, (byte) 1);
		if (interface70 == null) {
			Class216 class216 = new Class216(this);
			interface70 = Class258.method4744((bool ? Class620.aClass459_8118 : Class205.aClass459_2219), i, class216, bool, aClass205_2349, 1942716809);
			if (bool)
				aHashMap2331.put(Integer.valueOf(i), interface70);
			else
				aHashMap2334.put(Integer.valueOf(i), interface70);
		}
		return interface70;
	}

	Class483 method4214(Interface70 interface70, int i) {
		if (!aBool2327)
			return null;
		int i_42_ = 0;
		Iterator iterator = aList2328.iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			i_42_++;
			if (class483.method7858(1708955281) == Class482.aClass482_5428) {
				class483.method7849(interface70, 1529295279);
				return class483;
			}
		}
		if (i_42_ >= 213861705 * anInt2336)
			return null;
		Class483 class483 = interface70.method446(457021570);
		aList2328.add(class483);
		return class483;
	}

	public void method4215(Class483 class483, byte i) {
		class483.method7859(this, 1386726796);
		aList2329.add(class483);
	}

	boolean method4216(Class442 class442, Class442 class442_43_, float f, byte i) {
		Class442 class442_44_ = Class442.method7155(class442_43_, class442);
		if (class442_44_.method7160() >= f)
			return false;
		return true;
	}

	public void method4217(int i, int i_45_, int i_46_) {
		Class360 class360 = Class458.method7469(i, (byte) -101);
		if (class360 != null) {
			float f = (float) i_45_ * 1.5258789E-5F;
			class360.method6309(f, 440351387);
		}
	}

	public void method4218(Class193 class193, int i, int i_47_, int i_48_, int i_49_, Class189 class189, float f, float f_50_, Class442 class442, int i_51_, int i_52_, int i_53_, int i_54_) {
		if (aBool2327) {
			Class483 class483 = method4211(class193, this, i, i_47_, i_48_, i_49_, class189, f, f_50_, class442, i_51_, i_52_, false, (byte) 41);
			if (null != class483) {
				if (0 == i_53_)
					class483.method7852(1969554825);
				else
					class483.method7880(i_53_, false, -365692000);
				method4215(class483, (byte) -1);
			}
		}
	}

	public void method4219(int i) {
		anInt2343 = -1857779625 * i;
	}

	public int method4220(int i) {
		return -743748327 * anInt2320;
	}

	public void method4221(int i, int i_55_) {
		anInt2343 = -1857779625 * i;
	}

	public int method4222(int i) {
		return anInt2343 * 1186521959;
	}

	public void method4223(int i, int i_56_) {
		if (aBool2327 && i >= 0)
			method4213(i, false, (byte) 113);
	}

	void method4224(int i, byte i_57_) {
		if (client.aClass109_11067.aClass2_1367 != null && Class167.method2677(client.anInt11048 * -1927019389, (byte) 17)) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4428, client.aClass109_11067.aClass2_1367, (byte) -86);
			class527_sub15.buffer.writeInt(i, 1303819991);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	public void method4225() {
		Class299.method5521((byte) 66);
	}

	public void method4226(int i, int i_58_, boolean bool, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		if (aBool2327 && i != anInt2320 * -743748327) {
			if (aBool2325 && null != aClass483_2340 && anInt2320 * -743748327 != i) {
				aClass483_2340.method7882(-248429271);
				aClass483_2340.method7850((byte) 0);
				aList2329.remove(aClass483_2340);
			}
			Class483 class483 = method4242(960821171);
			if (null != class483 && class483.method7926(-1821751182).method434((byte) 1) == i) {
				aClass483_2340 = class483;
				anInt2320 = (class483.method7926(-1847245800).method434((byte) 1) * 969129769);
			} else {
				boolean bool_65_ = false;
				if (-743748327 * anInt2320 >= 0) {
					Iterator iterator = aList2329.iterator();
					while (iterator.hasNext()) {
						Class483 class483_66_ = (Class483) iterator.next();
						if (class483_66_.method7900((byte) 8) == Class193.aClass193_2152) {
							class483_66_.method7864(2000, (byte) 6);
							bool_65_ = true;
						}
					}
				}
				aClass483_2340 = null;
				anInt2320 = -969129769;
				Class483 class483_67_ = null;
				if (aClass483_2346 != null && aClass483_2346.method7926(-2087015244) != null && aClass483_2346.method7926(-2036217637).method434((byte) 1) == i && (aClass483_2346.method7858(1345112993) == Class482.aClass482_5422)) {
					class483_67_ = aClass483_2346;
					aClass483_2346 = null;
					aBool2342 = false;
				}
				if (class483_67_ == null) {
					if (bool) {
						float f = (float) i_62_;
						float f_68_ = (float) i_63_;
						Class442 class442 = new Class442((float) i_60_, 0.0F, (float) i_61_);
						class483_67_ = method4211(Class193.aClass193_2152, this, i, 0, bool_65_ ? 0 : i_58_, (anInt2343 * 1186521959 == i ? Class201.aClass201_2207.method3766(-809148455) : Class206.aClass206_2220.method3836(1745683495)), Class189.aClass189_2123, f, f_68_, class442, i_59_, 255, true, (byte) 121);
					} else
						class483_67_ = method4211(Class193.aClass193_2152, this, i, 0, bool_65_ ? 0 : i_58_, (i == 1186521959 * anInt2343 ? Class201.aClass201_2207.method3766(-850281641) : Class206.aClass206_2220.method3836(2073168859)), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 255, true, (byte) 29);
				}
				if (null != class483_67_) {
					if (bool_65_) {
						float f = (float) i_58_ / 255.0F;
						class483_67_.method7876(f, 2000, -1875863791);
					}
					class483_67_.method7852(1969554825);
					method4215(class483_67_, (byte) -1);
					aClass483_2340 = class483_67_;
					anInt2320 = i * 969129769;
					if (aBool2325)
						aClass483_2340.method7875(-1878002339);
					if (client.aClass109_11067.aClass2_1367 != null && Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4455, (client.aClass109_11067.aClass2_1367), (byte) -27);
						class527_sub15.buffer.writeInt(-743748327 * anInt2320, -593221329);
						client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					}
				}
			}
		}
	}

	public void method4227(int i, int i_69_) {
		if (!aBool2327) {
			anInt2336 = i * -831210247;
			aClass205_2333 = new Class205(i_69_, 100);
			aClass205_2341 = new Class205(10);
			aClass205_2333.method3812(new Class187(this), 1387420198);
			Class653 class653 = new Class653(Class378.aClass378_3927);
			Class681.method13908(class653, 1623986934);
			method4205(-648424718);
			anInt2320 = -969129769;
			aBool2327 = true;
		}
	}

	public void method4228(int i) {
		Iterator iterator = aList2329.iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			if (class483.method7900((byte) 8) == Class193.aClass193_2152) {
				class483.method7864(500, (byte) 6);
				if (class483.method7926(-2062529612).method434((byte) 1) == -743748327 * anInt2320) {
					method4224(anInt2320 * -743748327, (byte) 4);
					break;
				}
			}
		}
		aClass483_2340 = null;
		anInt2320 = -969129769;
	}

	public void method4229(int i, int i_70_, int i_71_) {
		if (aBool2327 && (!aBool2325 || -771435999 * anInt2344 != i)) {
			if (aBool2325 && -771435999 * anInt2344 != i) {
				Iterator iterator = aList2328.iterator();
				while (iterator.hasNext()) {
					Class483 class483 = (Class483) iterator.next();
					if (class483.method7900((byte) 8) == Class193.aClass193_2153) {
						class483.method7850((byte) 0);
						aList2329.remove(class483);
						aBool2325 = false;
						break;
					}
				}
			}
			if (i_70_ != 0 && -1 != i) {
				if (!aBool2325 && aClass483_2340 != null)
					aClass483_2340.method7875(-1821027809);
				Class483 class483 = method4211(Class193.aClass193_2153, this, i, 0, i_70_, Class206.aClass206_2220.method3836(-1405229075), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 255, true, (byte) 80);
				if (null != class483) {
					class483.method7852(1969554825);
					method4215(class483, (byte) -1);
					aBool2325 = true;
					anInt2344 = -232050207 * i;
				}
			}
		}
	}

	public void method4230(int i, int i_72_, boolean bool, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_) {
		if (aBool2327 && i != anInt2320 * -743748327) {
			if (aBool2325 && null != aClass483_2340 && anInt2320 * -743748327 != i) {
				aClass483_2340.method7882(1580150145);
				aClass483_2340.method7850((byte) 0);
				aList2329.remove(aClass483_2340);
			}
			Class483 class483 = method4242(971699084);
			if (null != class483 && class483.method7926(-1920324939).method434((byte) 1) == i) {
				aClass483_2340 = class483;
				anInt2320 = (class483.method7926(-2083272724).method434((byte) 1) * 969129769);
			} else {
				boolean bool_78_ = false;
				if (-743748327 * anInt2320 >= 0) {
					Iterator iterator = aList2329.iterator();
					while (iterator.hasNext()) {
						Class483 class483_79_ = (Class483) iterator.next();
						if (class483_79_.method7900((byte) 8) == Class193.aClass193_2152) {
							class483_79_.method7864(2000, (byte) 6);
							bool_78_ = true;
						}
					}
				}
				aClass483_2340 = null;
				anInt2320 = -969129769;
				Class483 class483_80_ = null;
				if (aClass483_2346 != null && aClass483_2346.method7926(-1883536104) != null && aClass483_2346.method7926(-2133552467).method434((byte) 1) == i && (aClass483_2346.method7858(1710223169) == Class482.aClass482_5422)) {
					class483_80_ = aClass483_2346;
					aClass483_2346 = null;
					aBool2342 = false;
				}
				if (class483_80_ == null) {
					if (bool) {
						float f = (float) i_76_;
						float f_81_ = (float) i_77_;
						Class442 class442 = new Class442((float) i_74_, 0.0F, (float) i_75_);
						class483_80_ = method4211(Class193.aClass193_2152, this, i, 0, bool_78_ ? 0 : i_72_, (anInt2343 * 1186521959 == i ? Class201.aClass201_2207.method3766(1515548911) : Class206.aClass206_2220.method3836(2141808322)), Class189.aClass189_2123, f, f_81_, class442, i_73_, 255, true, (byte) 23);
					} else
						class483_80_ = method4211(Class193.aClass193_2152, this, i, 0, bool_78_ ? 0 : i_72_, (i == 1186521959 * anInt2343 ? Class201.aClass201_2207.method3766(1386953513) : Class206.aClass206_2220.method3836(-1283486280)), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 255, true, (byte) 10);
				}
				if (null != class483_80_) {
					if (bool_78_) {
						float f = (float) i_72_ / 255.0F;
						class483_80_.method7876(f, 2000, -1410797853);
					}
					class483_80_.method7852(1969554825);
					method4215(class483_80_, (byte) -1);
					aClass483_2340 = class483_80_;
					anInt2320 = i * 969129769;
					if (aBool2325)
						aClass483_2340.method7875(-2039830001);
					if (client.aClass109_11067.aClass2_1367 != null && Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4455, (client.aClass109_11067.aClass2_1367), (byte) 38);
						class527_sub15.buffer.writeInt(-743748327 * anInt2320, 1437720374);
						client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					}
				}
			}
		}
	}

	void method4231() {
		Class190 class190 = new Class190(this);
		Class207 class207 = new Class207(this);
		Class229 class229 = new Class229(this);
		Class230 class230 = new Class230(this);
		Class220 class220 = new Class220(this);
		Class262.method4945(Class201.aClass201_2204.method3766(206437485), Class201.aClass201_2206.method3766(-1368118767), 0.2F, class190, (byte) 83);
		Class262.method4945(Class201.aClass201_2210.method3766(1959592306), Class201.aClass201_2206.method3766(-1600520171), 1.0F, class207, (byte) -77);
		Class262.method4945(Class201.aClass201_2207.method3766(-713408945), Class201.aClass201_2206.method3766(1092633596), 1.0F, class229, (byte) -51);
		Class262.method4945(Class201.aClass201_2208.method3766(1669276775), Class201.aClass201_2206.method3766(190705236), 0.8F, class230, (byte) 51);
		Class262.method4945(Class201.aClass201_2209.method3766(882385430), Class201.aClass201_2206.method3766(-773267643), 1.0F, class220, (byte) -111);
		Class262.method4945(Class206.aClass206_2220.method3836(567747586), Class201.aClass201_2210.method3766(-2025813972), 1.0F, null, (byte) 24);
		Class262.method4945(Class206.aClass206_2222.method3836(-494880349), Class201.aClass201_2209.method3766(738910689), 1.0F, null, (byte) 20);
		Class262.method4945(Class206.aClass206_2228.method3836(1494155512), Class201.aClass201_2204.method3766(-338512068), 1.0F, null, (byte) 99);
		Class262.method4945(Class206.aClass206_2223.method3836(2108278296), Class201.aClass201_2204.method3766(-191680174), 1.0F, null, (byte) 77);
		Class262.method4945(Class206.aClass206_2221.method3836(2021290296), Class201.aClass201_2204.method3766(1778121380), 1.0F, null, (byte) -37);
		Class262.method4945(Class206.aClass206_2225.method3836(503481721), Class201.aClass201_2204.method3766(-67634796), 1.0F, null, (byte) -4);
		Class262.method4945(Class206.aClass206_2226.method3836(-528884158), Class201.aClass201_2204.method3766(-1825111587), 1.0F, null, (byte) -23);
		Class262.method4945(Class206.aClass206_2227.method3836(1347107000), Class201.aClass201_2208.method3766(866011404), 1.0F, null, (byte) 0);
		Class262.method4945(Class206.aClass206_2229.method3836(1551327231), Class206.aClass206_2227.method3836(611107800), 1.0F, null, (byte) -39);
		Class262.method4945(Class206.aClass206_2224.method3836(877042255), Class206.aClass206_2227.method3836(1651650046), 1.0F, null, (byte) -54);
		Class458.method7469(Class206.aClass206_2220.method3836(-344267873), (byte) -32).method6309(0.75F, 440351387);
	}

	public void method4232(int i, int i_82_) {
		if (!aBool2327) {
			anInt2336 = i * -831210247;
			aClass205_2333 = new Class205(i_82_, 100);
			aClass205_2341 = new Class205(10);
			aClass205_2333.method3812(new Class187(this), 2133753907);
			Class653 class653 = new Class653(Class378.aClass378_3927);
			Class681.method13908(class653, 1623986934);
			method4205(-523742545);
			anInt2320 = -969129769;
			aBool2327 = true;
		}
	}

	List method4233() {
		return aList2324;
	}

	Class205 method4234() {
		return aClass205_2333;
	}

	Class205 method4235() {
		return aClass205_2333;
	}

	Class205 method4236() {
		return aClass205_2333;
	}

	public void method4237(Class483 class483, int i, int i_83_) {
		if (class483 != null) {
			Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
			if (class212 == null) {
				class212 = new Class212(this);
				aHashMap2338.put(Integer.valueOf(i), class212);
			}
			if (!class212.method3881(class483, (byte) 21)) {
				class483.method7880(i_83_, true, -365692000);
				class212.method3882(class483, (short) 255);
			}
		}
	}

	Class205 method4238() {
		return aClass205_2341;
	}

	public void method4239(int i) {
		Class299.method5521((byte) 8);
	}

	public void method4240() {
		if (aBool2327) {
			Class52.method1288(1258858073);
			if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637() != null)) {
				if (aClass442_2337 == null)
					aClass442_2337 = new Class442();
				aClass442_2337.aFloat4918 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927.aFloat4918);
				aClass442_2337.aFloat4915 = 0.0F;
				aClass442_2337.aFloat4919 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927.aFloat4919);
			}
			Iterator iterator = aHashMap2334.values().iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				interface70.method205((byte) 22);
			}
			iterator = aHashMap2331.values().iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				interface70.method205((byte) -6);
			}
			iterator = aList2324.iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				if (interface70.method429((byte) 73))
					aHashMap2331.remove(Integer.valueOf(interface70.method434((byte) 1)));
				else
					aHashMap2334.remove(Integer.valueOf(interface70.method434((byte) 1)));
			}
			aList2324.clear();
			if (aClass483_2346 != null && (aClass483_2346.method7858(1253982068) == Class482.aClass482_5422) && false == aBool2342 && null != client.aClass109_11067.aClass2_1367 && Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4455, client.aClass109_11067.aClass2_1367, (byte) -92);
				class527_sub15.buffer.writeInt(aClass483_2346.method7926(-2077385990).method434((byte) 1), 999221836);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				aBool2342 = true;
			}
			iterator = aList2328.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7884(-1749752092);
				class483.method7950(633707059);
				Class482 class482 = class483.method7858(1591437088);
				if (class483.method7949((byte) 12) == this) {
					if (Class482.aClass482_5425 == class482 || class482 == Class482.aClass482_5426) {
						if ((class483.method7900((byte) 8) == Class193.aClass193_2152) || (class483.method7900((byte) 8) == Class193.aClass193_2153)) {
							if (aClass483_2346 == class483) {
								aBool2342 = false;
								aClass483_2346 = null;
								class483.method7850((byte) 0);
								aList2329.remove(class483);
							} else {
								int i = class483.method7926(-1998843882).method434((byte) 1);
								boolean bool = (method4208(Class206.aClass206_2220.method3836(-1167870240), 1967121662) > 0.0F);
								if (false == aBool2325 && bool) {
									if (-743748327 * anInt2320 == i) {
										method4224(i, (byte) 77);
										anInt2320 = -969129769;
									}
									class483.method7850((byte) 0);
									aList2329.remove(class483);
								} else if (i == anInt2344 * -771435999) {
									anInt2344 = 232050207;
									aBool2325 = false;
									class483.method7850((byte) 0);
									aList2329.remove(class483);
									Iterator iterator_84_ = aList2328.iterator();
									while (iterator_84_.hasNext()) {
										Class483 class483_85_ = (Class483) iterator_84_.next();
										if (class483_85_.method7900((byte) 8) == Class193.aClass193_2152) {
											int i_86_ = class483_85_.method7926(-2019084641).method434((byte) 1);
											if (((i_86_ == -743748327 * anInt2320) && ((class483_85_.method7858(1293986529)) == (Class482.aClass482_5425))) || (class483_85_.method7858(1601003257) == Class482.aClass482_5420) || (class483_85_.method7858(1976235985) == Class482.aClass482_5421) || (class483_85_.method7858(1744144454) == (Class482.aClass482_5422))) {
												if (class483_85_.method7858(1790500586) == Class482.aClass482_5425)
													class483_85_.method7882(1528064957);
												else
													class483_85_.method7852(1969554825);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2325 || i != -743748327 * anInt2320) {
										class483.method7850((byte) 0);
										aList2329.remove(class483);
									}
									if (!aBool2325 && -743748327 * anInt2320 == i) {
										anInt2320 = -969129769;
										aClass483_2340 = null;
									}
								}
							}
						} else {
							Iterator iterator_87_ = aHashMap2338.keySet().iterator();
							while (iterator_87_.hasNext()) {
								int i = ((Integer) iterator_87_.next()).intValue();
								Class212 class212 = ((Class212) aHashMap2338.get(Integer.valueOf(i)));
								if (class212.method3884((short) 2752).contains(class483)) {
									class212.method3883(class483, -1902298994);
									break;
								}
							}
							class483.method7850((byte) 0);
							aList2329.remove(class483);
						}
					} else if ((class483.method7858(2101978124) != Class482.aClass482_5424) && (class483.method7855((short) 255) == Class206.aClass206_2220.method3836(-631306246))) {
						boolean bool = (method4208(Class206.aClass206_2220.method3836(702500340), 1626417413) > 1.0E-4F);
						if (!bool)
							class483.method7864(150, (byte) 6);
					}
				}
			}
		}
	}

	public void method4241(int i, int i_88_) {
		if (!aBool2327) {
			anInt2336 = i * -831210247;
			aClass205_2333 = new Class205(i_88_, 100);
			aClass205_2341 = new Class205(10);
			aClass205_2333.method3812(new Class187(this), 1435468399);
			Class653 class653 = new Class653(Class378.aClass378_3927);
			Class681.method13908(class653, 1623986934);
			method4205(-727415754);
			anInt2320 = -969129769;
			aBool2327 = true;
		}
	}

	Class483 method4242(int i) {
		Iterator iterator = aList2329.iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			if (class483.method7900((byte) 8) == Class193.aClass193_2152 && class483.method7858(1559028888) == Class482.aClass482_5423)
				return class483;
		}
		return null;
	}

	public void method4243() {
		if (aBool2327) {
			Class52.method1288(1021508180);
			if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637() != null)) {
				if (aClass442_2337 == null)
					aClass442_2337 = new Class442();
				aClass442_2337.aFloat4918 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927.aFloat4918);
				aClass442_2337.aFloat4915 = 0.0F;
				aClass442_2337.aFloat4919 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927.aFloat4919);
			}
			Iterator iterator = aHashMap2334.values().iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				interface70.method205((byte) 95);
			}
			iterator = aHashMap2331.values().iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				interface70.method205((byte) 30);
			}
			iterator = aList2324.iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				if (interface70.method429((byte) 42))
					aHashMap2331.remove(Integer.valueOf(interface70.method434((byte) 1)));
				else
					aHashMap2334.remove(Integer.valueOf(interface70.method434((byte) 1)));
			}
			aList2324.clear();
			if (aClass483_2346 != null && (aClass483_2346.method7858(1053306266) == Class482.aClass482_5422) && false == aBool2342 && null != client.aClass109_11067.aClass2_1367 && Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4455, client.aClass109_11067.aClass2_1367, (byte) -92);
				class527_sub15.buffer.writeInt(aClass483_2346.method7926(-1980585020).method434((byte) 1), 923651247);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				aBool2342 = true;
			}
			iterator = aList2328.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7884(-1749752092);
				class483.method7950(992000270);
				Class482 class482 = class483.method7858(1947793001);
				if (class483.method7949((byte) 93) == this) {
					if (Class482.aClass482_5425 == class482 || class482 == Class482.aClass482_5426) {
						if ((class483.method7900((byte) 8) == Class193.aClass193_2152) || (class483.method7900((byte) 8) == Class193.aClass193_2153)) {
							if (aClass483_2346 == class483) {
								aBool2342 = false;
								aClass483_2346 = null;
								class483.method7850((byte) 0);
								aList2329.remove(class483);
							} else {
								int i = class483.method7926(-2029575179).method434((byte) 1);
								boolean bool = (method4208(Class206.aClass206_2220.method3836(1831446844), 1935962112) > 0.0F);
								if (false == aBool2325 && bool) {
									if (-743748327 * anInt2320 == i) {
										method4224(i, (byte) -77);
										anInt2320 = -969129769;
									}
									class483.method7850((byte) 0);
									aList2329.remove(class483);
								} else if (i == anInt2344 * -771435999) {
									anInt2344 = 232050207;
									aBool2325 = false;
									class483.method7850((byte) 0);
									aList2329.remove(class483);
									Iterator iterator_89_ = aList2328.iterator();
									while (iterator_89_.hasNext()) {
										Class483 class483_90_ = (Class483) iterator_89_.next();
										if (class483_90_.method7900((byte) 8) == Class193.aClass193_2152) {
											int i_91_ = class483_90_.method7926(-2012510714).method434((byte) 1);
											if (((i_91_ == -743748327 * anInt2320) && (class483_90_.method7858(911730658) == (Class482.aClass482_5425))) || (class483_90_.method7858(1450489041) == Class482.aClass482_5420) || (class483_90_.method7858(1783095560) == Class482.aClass482_5421) || (class483_90_.method7858(1556246090) == (Class482.aClass482_5422))) {
												if (class483_90_.method7858(1550553940) == Class482.aClass482_5425)
													class483_90_.method7882(-376709459);
												else
													class483_90_.method7852(1969554825);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2325 || i != -743748327 * anInt2320) {
										class483.method7850((byte) 0);
										aList2329.remove(class483);
									}
									if (!aBool2325 && -743748327 * anInt2320 == i) {
										anInt2320 = -969129769;
										aClass483_2340 = null;
									}
								}
							}
						} else {
							Iterator iterator_92_ = aHashMap2338.keySet().iterator();
							while (iterator_92_.hasNext()) {
								int i = ((Integer) iterator_92_.next()).intValue();
								Class212 class212 = ((Class212) aHashMap2338.get(Integer.valueOf(i)));
								if (class212.method3884((short) 4250).contains(class483)) {
									class212.method3883(class483, -2028571769);
									break;
								}
							}
							class483.method7850((byte) 0);
							aList2329.remove(class483);
						}
					} else if ((class483.method7858(2096923981) != Class482.aClass482_5424) && (class483.method7855((short) 255) == Class206.aClass206_2220.method3836(-1474009847))) {
						boolean bool = method4208(Class206.aClass206_2220.method3836(-1373490267), 1459006863) > 1.0E-4F;
						if (!bool)
							class483.method7864(150, (byte) 6);
					}
				}
			}
		}
	}

	public void method4244() {
		if (aBool2327) {
			Class52.method1288(2096413554);
			if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637() != null)) {
				if (aClass442_2337 == null)
					aClass442_2337 = new Class442();
				aClass442_2337.aFloat4918 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927.aFloat4918);
				aClass442_2337.aFloat4915 = 0.0F;
				aClass442_2337.aFloat4919 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927.aFloat4919);
			}
			Iterator iterator = aHashMap2334.values().iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				interface70.method205((byte) -12);
			}
			iterator = aHashMap2331.values().iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				interface70.method205((byte) 59);
			}
			iterator = aList2324.iterator();
			while (iterator.hasNext()) {
				Interface70 interface70 = (Interface70) iterator.next();
				if (interface70.method429((byte) 12))
					aHashMap2331.remove(Integer.valueOf(interface70.method434((byte) 1)));
				else
					aHashMap2334.remove(Integer.valueOf(interface70.method434((byte) 1)));
			}
			aList2324.clear();
			if (aClass483_2346 != null && (aClass483_2346.method7858(953829877) == Class482.aClass482_5422) && false == aBool2342 && null != client.aClass109_11067.aClass2_1367 && Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
				Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4455, client.aClass109_11067.aClass2_1367, (byte) 8);
				class527_sub15.buffer.writeInt(aClass483_2346.method7926(-2078164161).method434((byte) 1), 724032892);
				client.aClass109_11067.method1969(class527_sub15, (byte) 1);
				aBool2342 = true;
			}
			iterator = aList2328.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7884(-1749752092);
				class483.method7950(805937065);
				Class482 class482 = class483.method7858(1389395604);
				if (class483.method7949((byte) 119) == this) {
					if (Class482.aClass482_5425 == class482 || class482 == Class482.aClass482_5426) {
						if ((class483.method7900((byte) 8) == Class193.aClass193_2152) || (class483.method7900((byte) 8) == Class193.aClass193_2153)) {
							if (aClass483_2346 == class483) {
								aBool2342 = false;
								aClass483_2346 = null;
								class483.method7850((byte) 0);
								aList2329.remove(class483);
							} else {
								int i = class483.method7926(-1993249981).method434((byte) 1);
								boolean bool = (method4208(Class206.aClass206_2220.method3836(-603391061), 1680456131) > 0.0F);
								if (false == aBool2325 && bool) {
									if (-743748327 * anInt2320 == i) {
										method4224(i, (byte) -52);
										anInt2320 = -969129769;
									}
									class483.method7850((byte) 0);
									aList2329.remove(class483);
								} else if (i == anInt2344 * -771435999) {
									anInt2344 = 232050207;
									aBool2325 = false;
									class483.method7850((byte) 0);
									aList2329.remove(class483);
									Iterator iterator_93_ = aList2328.iterator();
									while (iterator_93_.hasNext()) {
										Class483 class483_94_ = (Class483) iterator_93_.next();
										if (class483_94_.method7900((byte) 8) == Class193.aClass193_2152) {
											int i_95_ = class483_94_.method7926(-1989208455).method434((byte) 1);
											if (((i_95_ == -743748327 * anInt2320) && (class483_94_.method7858(934983209) == (Class482.aClass482_5425))) || (class483_94_.method7858(1032209368) == Class482.aClass482_5420) || (class483_94_.method7858(1994699970) == Class482.aClass482_5421) || (class483_94_.method7858(1101561827) == (Class482.aClass482_5422))) {
												if (class483_94_.method7858(1168303034) == Class482.aClass482_5425)
													class483_94_.method7882(321099873);
												else
													class483_94_.method7852(1969554825);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2325 || i != -743748327 * anInt2320) {
										class483.method7850((byte) 0);
										aList2329.remove(class483);
									}
									if (!aBool2325 && -743748327 * anInt2320 == i) {
										anInt2320 = -969129769;
										aClass483_2340 = null;
									}
								}
							}
						} else {
							Iterator iterator_96_ = aHashMap2338.keySet().iterator();
							while (iterator_96_.hasNext()) {
								int i = ((Integer) iterator_96_.next()).intValue();
								Class212 class212 = ((Class212) aHashMap2338.get(Integer.valueOf(i)));
								if (class212.method3884((short) -4763).contains(class483)) {
									class212.method3883(class483, -1951126566);
									break;
								}
							}
							class483.method7850((byte) 0);
							aList2329.remove(class483);
						}
					} else if ((class483.method7858(1375247892) != Class482.aClass482_5424) && (class483.method7855((short) 255) == Class206.aClass206_2220.method3836(1798306481))) {
						boolean bool = (method4208(Class206.aClass206_2220.method3836(1917264682), 1511261963) > 1.0E-4F);
						if (!bool)
							class483.method7864(150, (byte) 6);
					}
				}
			}
		}
	}

	public void method4245(int i) {
		if (aBool2327 && i >= 0)
			method4213(i, false, (byte) 72);
	}

	void method4246(int[] is, byte i) {
		if (aBool2327 && null != is) {
			int[] is_97_ = is;
			for (int i_98_ = 0; i_98_ < is_97_.length; i_98_++) {
				int i_99_ = is_97_[i_98_];
				method4223(i_99_, -836535677);
			}
		}
	}

	public void method4247(Class483 class483, int i, int i_100_) {
		if (class483 != null) {
			Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
			if (class212 == null) {
				class212 = new Class212(this);
				aHashMap2338.put(Integer.valueOf(i), class212);
			}
			if (!class212.method3881(class483, (byte) -17)) {
				class483.method7880(i_100_, true, -365692000);
				class212.method3882(class483, (short) 255);
			}
		}
	}

	public void method4248(int i, int i_101_) {
		Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
		if (null != class212) {
			List list = class212.method3884((short) -1219);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7864(50, (byte) 6);
			}
		}
	}

	public void method4249(Class483 class483, int i, int i_102_) {
		if (class483 != null) {
			Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
			if (class212 == null) {
				class212 = new Class212(this);
				aHashMap2338.put(Integer.valueOf(i), class212);
			}
			if (!class212.method3881(class483, (byte) 35)) {
				class483.method7880(i_102_, true, -365692000);
				class212.method3882(class483, (short) 255);
			}
		}
	}

	public void method4250(int i) {
		method4273(i, 255, (byte) 8);
	}

	public void method4251(int i) {
		Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
		if (null != class212) {
			List list = class212.method3884((short) -14808);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				if (!class483.method7874((byte) -57))
					class483.method7852(1969554825);
			}
		}
	}

	public void method4252(int i) {
		Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
		if (null != class212) {
			List list = class212.method3884((short) 547);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7864(50, (byte) 6);
			}
		}
	}

	public void method4253(int i) {
		Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
		if (null != class212) {
			List list = class212.method3884((short) -9489);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7851((byte) 0);
			}
		}
	}

	public void method4254(int i) {
		Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
		if (null != class212) {
			List list = class212.method3884((short) 23073);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class483 class483 = (Class483) iterator.next();
				class483.method7851((byte) 0);
			}
		}
	}

	public void method4255(Class483 class483, int i, int i_103_) {
		if (class483 != null) {
			Class212 class212 = (Class212) aHashMap2338.get(Integer.valueOf(i));
			if (class212 == null) {
				class212 = new Class212(this);
				aHashMap2338.put(Integer.valueOf(i), class212);
			}
			if (!class212.method3881(class483, (byte) 10)) {
				class483.method7880(i_103_, true, -365692000);
				class212.method3882(class483, (short) 255);
			}
		}
	}

	void method4256() {
		Class190 class190 = new Class190(this);
		Class207 class207 = new Class207(this);
		Class229 class229 = new Class229(this);
		Class230 class230 = new Class230(this);
		Class220 class220 = new Class220(this);
		Class262.method4945(Class201.aClass201_2204.method3766(-1144716763), Class201.aClass201_2206.method3766(2080004373), 0.2F, class190, (byte) -39);
		Class262.method4945(Class201.aClass201_2210.method3766(-840414414), Class201.aClass201_2206.method3766(1828494466), 1.0F, class207, (byte) -88);
		Class262.method4945(Class201.aClass201_2207.method3766(-828224527), Class201.aClass201_2206.method3766(1112243557), 1.0F, class229, (byte) 49);
		Class262.method4945(Class201.aClass201_2208.method3766(-598294032), Class201.aClass201_2206.method3766(-1527403636), 0.8F, class230, (byte) 69);
		Class262.method4945(Class201.aClass201_2209.method3766(1175424034), Class201.aClass201_2206.method3766(1148497206), 1.0F, class220, (byte) -8);
		Class262.method4945(Class206.aClass206_2220.method3836(408949374), Class201.aClass201_2210.method3766(-1717850182), 1.0F, null, (byte) -86);
		Class262.method4945(Class206.aClass206_2222.method3836(2133804145), Class201.aClass201_2209.method3766(-1078733246), 1.0F, null, (byte) 95);
		Class262.method4945(Class206.aClass206_2228.method3836(-684190993), Class201.aClass201_2204.method3766(-1227518416), 1.0F, null, (byte) 41);
		Class262.method4945(Class206.aClass206_2223.method3836(-1796939790), Class201.aClass201_2204.method3766(-226939926), 1.0F, null, (byte) -56);
		Class262.method4945(Class206.aClass206_2221.method3836(306666039), Class201.aClass201_2204.method3766(-1056793819), 1.0F, null, (byte) -40);
		Class262.method4945(Class206.aClass206_2225.method3836(148198792), Class201.aClass201_2204.method3766(2095496836), 1.0F, null, (byte) 4);
		Class262.method4945(Class206.aClass206_2226.method3836(-1933557601), Class201.aClass201_2204.method3766(1313998699), 1.0F, null, (byte) -23);
		Class262.method4945(Class206.aClass206_2227.method3836(-1470125216), Class201.aClass201_2208.method3766(-1746116370), 1.0F, null, (byte) -46);
		Class262.method4945(Class206.aClass206_2229.method3836(1200627936), Class206.aClass206_2227.method3836(1057968643), 1.0F, null, (byte) 47);
		Class262.method4945(Class206.aClass206_2224.method3836(-1251774925), Class206.aClass206_2227.method3836(-1692020511), 1.0F, null, (byte) -53);
		Class458.method7469(Class206.aClass206_2220.method3836(-304407708), (byte) -27).method6309(0.75F, 440351387);
	}

	void method4257() {
		Class190 class190 = new Class190(this);
		Class207 class207 = new Class207(this);
		Class229 class229 = new Class229(this);
		Class230 class230 = new Class230(this);
		Class220 class220 = new Class220(this);
		Class262.method4945(Class201.aClass201_2204.method3766(184675885), Class201.aClass201_2206.method3766(1467990842), 0.2F, class190, (byte) -6);
		Class262.method4945(Class201.aClass201_2210.method3766(87474973), Class201.aClass201_2206.method3766(-385201160), 1.0F, class207, (byte) -50);
		Class262.method4945(Class201.aClass201_2207.method3766(-1974450199), Class201.aClass201_2206.method3766(-1836266571), 1.0F, class229, (byte) 36);
		Class262.method4945(Class201.aClass201_2208.method3766(-471297017), Class201.aClass201_2206.method3766(-987317404), 0.8F, class230, (byte) 48);
		Class262.method4945(Class201.aClass201_2209.method3766(-514499255), Class201.aClass201_2206.method3766(1885178465), 1.0F, class220, (byte) -61);
		Class262.method4945(Class206.aClass206_2220.method3836(-1970754588), Class201.aClass201_2210.method3766(-1891938959), 1.0F, null, (byte) -19);
		Class262.method4945(Class206.aClass206_2222.method3836(202859232), Class201.aClass201_2209.method3766(1395340933), 1.0F, null, (byte) -3);
		Class262.method4945(Class206.aClass206_2228.method3836(1400771070), Class201.aClass201_2204.method3766(1756789224), 1.0F, null, (byte) 16);
		Class262.method4945(Class206.aClass206_2223.method3836(-923992127), Class201.aClass201_2204.method3766(-1510974330), 1.0F, null, (byte) -92);
		Class262.method4945(Class206.aClass206_2221.method3836(-1363417925), Class201.aClass201_2204.method3766(-1705552874), 1.0F, null, (byte) -25);
		Class262.method4945(Class206.aClass206_2225.method3836(-1218779160), Class201.aClass201_2204.method3766(1115972127), 1.0F, null, (byte) -77);
		Class262.method4945(Class206.aClass206_2226.method3836(854960336), Class201.aClass201_2204.method3766(1092536348), 1.0F, null, (byte) 30);
		Class262.method4945(Class206.aClass206_2227.method3836(1663538947), Class201.aClass201_2208.method3766(-262786167), 1.0F, null, (byte) -1);
		Class262.method4945(Class206.aClass206_2229.method3836(1850666921), Class206.aClass206_2227.method3836(250477218), 1.0F, null, (byte) -46);
		Class262.method4945(Class206.aClass206_2224.method3836(551602686), Class206.aClass206_2227.method3836(559091527), 1.0F, null, (byte) 41);
		Class458.method7469(Class206.aClass206_2220.method3836(1171903326), (byte) -58).method6309(0.75F, 440351387);
	}

	public void method4258(int i, int i_104_, int i_105_) {
		int i_106_ = Class201.aClass201_2206.method3766(-1760527786);
		if (Class458.method7469(i, (byte) -12) == null && (i_106_ == i_104_ || Class458.method7469(i_104_, (byte) -77) != null)) {
			float f = (float) i_105_ * 1.5258789E-5F;
			Class262.method4945(i, i_106_ == i_104_ ? -1 : i_104_, f, null, (byte) 53);
		}
	}

	public void method4259(int i, int i_107_, int i_108_) {
		if (!aBool2327) {
			anInt2336 = i * -831210247;
			aClass205_2333 = new Class205(i_107_, 100);
			aClass205_2341 = new Class205(10);
			aClass205_2333.method3812(new Class187(this), 1464972123);
			Class653 class653 = new Class653(Class378.aClass378_3927);
			Class681.method13908(class653, 1623986934);
			method4205(1559936483);
			anInt2320 = -969129769;
			aBool2327 = true;
		}
	}

	float method4260(int i) {
		Class360 class360 = Class458.method7469(i, (byte) -63);
		float f = 1.0F;
		for (/**/; class360 != null; class360 = class360.method6306((short) -8190))
			f *= class360.method6310(-1383190170);
		return f;
	}

	float method4261(int i) {
		Class360 class360 = Class458.method7469(i, (byte) -83);
		float f = 1.0F;
		for (/**/; class360 != null; class360 = class360.method6306((short) -2801))
			f *= class360.method6310(-1852839009);
		return f;
	}

	public void method4262(int i) {
		Iterator iterator = aList2329.iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			int i_109_ = class483.method7855((short) 255);
			boolean bool = Class596.method9904(i_109_, i, -108358782);
			if (bool)
				class483.method7864(50, (byte) 6);
		}
	}

	void method4263(int[] is) {
		if (aBool2327 && null != is) {
			int[] is_110_ = is;
			for (int i = 0; i < is_110_.length; i++) {
				int i_111_ = is_110_[i];
				method4223(i_111_, 1936556109);
			}
		}
	}

	public void method4264(Class198 class198, int i, int i_112_) {
		if (null != class198 && class198.anIntArrayArray2178 != null && i < class198.anIntArrayArray2178.length && null != class198.anIntArrayArray2178[i]) {
			int i_113_ = class198.anIntArrayArray2178[i][0];
			int i_114_ = i_113_ >> 8;
			int i_115_ = i_113_ >> 5 & 0x7;
			if (class198.anIntArrayArray2178[i].length > 1) {
				int i_116_ = (int) (Math.random() * (double) (class198.anIntArrayArray2178[i]).length);
				if (i_116_ > 0)
					i_114_ = class198.anIntArrayArray2178[i][i_116_];
			}
			int i_117_ = 256;
			if (class198.anIntArray2169 != null && class198.anIntArray2173 != null)
				i_117_ = (int) ((double) class198.anIntArray2169[i] + (Math.random() * (double) (class198.anIntArray2173[i] - class198.anIntArray2169[i])));
			int i_118_ = (class198.anIntArray2189 == null ? 255 : class198.anIntArray2189[i]);
			method4218(Class193.aClass193_2145, i_114_, i_115_, i_118_, Class206.aClass206_2221.method3836(-253432325), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_117_, 0, -691213012);
		}
	}

	Class205 method4265() {
		return aClass205_2341;
	}

	public void method4266(int i) {
		if (aBool2327 && i >= 0)
			method4213(i, false, (byte) 29);
	}

	Interface70 method4267(int i, boolean bool) {
		if (!aBool2327)
			return null;
		Interface70 interface70 = (Interface70) (bool ? aClass205_2341.method3787((long) i) : aClass205_2333.method3787((long) i));
		if (null == interface70) {
			if (bool)
				interface70 = (Interface70) aHashMap2331.get(Integer.valueOf(i));
			else
				interface70 = (Interface70) aHashMap2334.get(Integer.valueOf(i));
		}
		return interface70;
	}

	Interface70 method4268(int i, boolean bool) {
		if (!aBool2327)
			return null;
		Interface70 interface70 = (Interface70) (bool ? aClass205_2341.method3787((long) i) : aClass205_2333.method3787((long) i));
		if (null == interface70) {
			if (bool)
				interface70 = (Interface70) aHashMap2331.get(Integer.valueOf(i));
			else
				interface70 = (Interface70) aHashMap2334.get(Integer.valueOf(i));
		}
		return interface70;
	}

	Interface70 method4269(int i, boolean bool) {
		if (!aBool2327)
			return null;
		Interface70 interface70 = (Interface70) (bool ? aClass205_2341.method3787((long) i) : aClass205_2333.method3787((long) i));
		if (null == interface70) {
			if (bool)
				interface70 = (Interface70) aHashMap2331.get(Integer.valueOf(i));
			else
				interface70 = (Interface70) aHashMap2334.get(Integer.valueOf(i));
		}
		return interface70;
	}

	public void method4270() {
		Class299.method5521((byte) 62);
	}

	public void method4271(Class483 class483) {
		class483.method7859(this, 1386726796);
		aList2329.add(class483);
	}

	public void method4272(Class483 class483) {
		class483.method7859(this, 1386726796);
		aList2329.add(class483);
	}

	public void method4273(int i, int i_119_, byte i_120_) {
		method4226(i, i_119_, false, 0, 0, 0, 0, 0, -896671502);
	}

	public void method4274(Class483 class483) {
		class483.method7859(this, 1386726796);
		aList2329.add(class483);
	}

	public void method4275(Class198 class198, int i, Class640_Sub1 class640_sub1) {
		if (class198 != null && null != class198.anIntArrayArray2178 && i < class198.anIntArrayArray2178.length && class198.anIntArrayArray2178[i] != null && (class640_sub1.aByte10864 == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) && class640_sub1.method17060((byte) 1)) {
			int i_121_ = class198.anIntArrayArray2178[i][0];
			int i_122_ = i_121_ >> 8;
			int i_123_ = i_121_ >> 5 & 0x7;
			int i_124_ = i_121_ & 0x1f;
			if (class198.anIntArrayArray2178[i].length > 1) {
				int i_125_ = (int) (Math.random() * (double) (class198.anIntArrayArray2178[i]).length);
				if (i_125_ > 0)
					i_122_ = class198.anIntArrayArray2178[i][i_125_];
			}
			int i_126_ = 256;
			if (class198.anIntArray2169 != null && null != class198.anIntArray2173)
				i_126_ = ((int) (Math.random() * (double) (class198.anIntArray2173[i] - class198.anIntArray2169[i])) + class198.anIntArray2169[i]);
			int i_127_ = (class198.anIntArray2189 == null ? 255 : class198.anIntArray2189[i]);
			if (i_124_ == 0) {
				if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == class640_sub1)
					method4218(Class193.aClass193_2142, i_122_, i_123_, i_127_, Class206.aClass206_2223.method3836(2143366576), Class189.aClass189_2126, 0.0F, 0.0F, null, class640_sub1.aByte10864, i_126_, 0, -904476717);
			} else {
				if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == class640_sub1) {
					if (Class204.aClass527_Sub31_2213.aClass700_Sub24_10633.method17139((byte) -63) == 0)
						return;
				} else if (Class204.aClass527_Sub31_2213.aClass700_Sub24_10634.method17139((byte) 43) == 0)
					return;
				if (-1 != -384251211 * class198.anInt2176) {
					int i_128_ = 0;
					if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub1)
						i_128_ = ((Class640_Sub1_Sub2_Sub1) class640_sub1).method18553(-1624256553);
					else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub4)
						i_128_ = ((Class640_Sub1_Sub2_Sub4) class640_sub1).method18786(100745143);
					else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub5)
						i_128_ = ((Class640_Sub1_Sub2_Sub5) class640_sub1).method18811((byte) 60);
					if (i_128_ != 0 && i_128_ != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18553(1199063857) && i_128_ != -820304157 * client.anInt11232) {
						i_127_ = i_127_ * (class198.anInt2176 * -384251211) / 100;
						if (i_127_ < 0)
							i_127_ = 0;
						else if (i_127_ > 255)
							i_127_ = 255;
					}
				}
				Class442 class442 = class640_sub1.method10637().aClass442_4927;
				int i_129_ = (int) class442.aFloat4918 - 256 >> 9;
				int i_130_ = (int) class442.aFloat4919 - 256 >> 9;
				Class442 class442_131_ = new Class442((float) (i_129_ << 9), 0.0F, (float) (i_130_ << 9));
				int i_132_ = class640_sub1.aByte10864 << 24;
				method4218(Class193.aClass193_2148, i_122_, i_123_, i_127_, Class206.aClass206_2221.method3836(2104070454), ((class640_sub1 != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) ? Class189.aClass189_2124 : Class189.aClass189_2126), 0.0F, (float) (i_124_ << 9), class442_131_, i_132_, i_126_, 0, 1136019551);
			}
		}
	}

	boolean method4276(Class442 class442, Class442 class442_133_, float f) {
		Class442 class442_134_ = Class442.method7155(class442_133_, class442);
		if (class442_134_.method7160() >= f)
			return false;
		return true;
	}

	public Class483 method4277(Class193 class193, Object object, int i, int i_135_, int i_136_, int i_137_, Class189 class189, float f, float f_138_, Class442 class442, int i_139_, int i_140_, boolean bool) {
		if (!aBool2327)
			return null;
		if (null == object)
			return null;
		i_136_ = Math.max(0, Math.min(i_136_, 255));
		i_140_ = Math.max(0, i_140_);
		if (Class189.aClass189_2126 != class189 && !method4216(aClass442_2337, class442, f_138_, (byte) 1))
			return null;
		if (i_140_ <= 0)
			i_140_ = 255;
		float f_141_ = (float) i_136_ / 255.0F;
		float f_142_ = (float) i_140_ / 255.0F;
		Interface70 interface70 = method4213(i, bool, (byte) 80);
		Class483 class483 = method4214(interface70, -771031705);
		if (null == class483)
			return null;
		class483.method7859(object, 1386726796);
		class483.method7862(i_137_, (byte) 32);
		if (class189 != Class189.aClass189_2126) {
			class483.method7893(true, (byte) 0);
			class483.method7867(class442, 1474750881);
			class483.method7911(f, 1109232260);
			class483.method7872(f_138_, (byte) 0);
			if (class189 == Class189.aClass189_2122)
				class483.method7847(anInterface56_2347, (byte) 13);
			else if (Class189.aClass189_2125 == class189)
				class483.method7847(anInterface56_2326, (byte) 114);
			else if (class189 == Class189.aClass189_2124)
				class483.method7847(anInterface56_2332, (byte) 52);
			else if (class189 == Class189.aClass189_2123)
				class483.method7847(anInterface56_2348, (byte) 8);
			else
				class483.method7893(false, (byte) 0);
		}
		class483.method7876(f_141_, 0, 1517804502);
		class483.method7870(i_135_ > 1 || i_135_ < 0, i_135_ > 0 ? i_135_ - 1 : i_135_, 238175860);
		class483.method7878(f_142_, 168947023);
		class483.method7861(class193, (byte) 54);
		return class483;
	}

	public Class483 method4278(Class193 class193, Object object, int i, int i_143_, int i_144_, int i_145_, Class189 class189, float f, float f_146_, Class442 class442, int i_147_, int i_148_, boolean bool) {
		if (!aBool2327)
			return null;
		if (null == object)
			return null;
		i_144_ = Math.max(0, Math.min(i_144_, 255));
		i_148_ = Math.max(0, i_148_);
		if (Class189.aClass189_2126 != class189 && !method4216(aClass442_2337, class442, f_146_, (byte) 1))
			return null;
		if (i_148_ <= 0)
			i_148_ = 255;
		float f_149_ = (float) i_144_ / 255.0F;
		float f_150_ = (float) i_148_ / 255.0F;
		Interface70 interface70 = method4213(i, bool, (byte) 27);
		Class483 class483 = method4214(interface70, -1568414636);
		if (null == class483)
			return null;
		class483.method7859(object, 1386726796);
		class483.method7862(i_145_, (byte) 74);
		if (class189 != Class189.aClass189_2126) {
			class483.method7893(true, (byte) 0);
			class483.method7867(class442, 1474750881);
			class483.method7911(f, -888204006);
			class483.method7872(f_146_, (byte) 0);
			if (class189 == Class189.aClass189_2122)
				class483.method7847(anInterface56_2347, (byte) 40);
			else if (Class189.aClass189_2125 == class189)
				class483.method7847(anInterface56_2326, (byte) 63);
			else if (class189 == Class189.aClass189_2124)
				class483.method7847(anInterface56_2332, (byte) 17);
			else if (class189 == Class189.aClass189_2123)
				class483.method7847(anInterface56_2348, (byte) 101);
			else
				class483.method7893(false, (byte) 0);
		}
		class483.method7876(f_149_, 0, -527291711);
		class483.method7870(i_143_ > 1 || i_143_ < 0, i_143_ > 0 ? i_143_ - 1 : i_143_, -888033374);
		class483.method7878(f_150_, 168947023);
		class483.method7861(class193, (byte) 74);
		return class483;
	}

	public void method4279(Class193 class193, int i, int i_151_, int i_152_, int i_153_, Class189 class189, float f, float f_154_, Class442 class442, int i_155_, int i_156_, int i_157_) {
		if (aBool2327) {
			Class483 class483 = method4211(class193, this, i, i_151_, i_152_, i_153_, class189, f, f_154_, class442, i_155_, i_156_, false, (byte) 11);
			if (null != class483) {
				if (0 == i_157_)
					class483.method7852(1969554825);
				else
					class483.method7880(i_157_, false, -365692000);
				method4215(class483, (byte) -1);
			}
		}
	}

	public void method4280(Class193 class193, int i, int i_158_, int i_159_, int i_160_, Class189 class189, float f, float f_161_, Class442 class442, int i_162_, int i_163_, int i_164_) {
		if (aBool2327) {
			Class483 class483 = method4211(class193, this, i, i_158_, i_159_, i_160_, class189, f, f_161_, class442, i_162_, i_163_, false, (byte) 61);
			if (null != class483) {
				if (0 == i_164_)
					class483.method7852(1969554825);
				else
					class483.method7880(i_164_, false, -365692000);
				method4215(class483, (byte) -1);
			}
		}
	}

	public void method4281(int i, int i_165_) {
		if (anInt2320 * -743748327 != i) {
			if (null != aClass483_2346) {
				aClass483_2346.method7864(0, (byte) 6);
				method4215(aClass483_2346, (byte) -1);
				aClass483_2346 = null;
			}
			Class483 class483 = method4211(Class193.aClass193_2152, this, i, 0, i_165_, Class206.aClass206_2220.method3836(-1180811661), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 255, true, (byte) 85);
			if (null != class483) {
				class483.method7851((byte) 0);
				aClass483_2346 = class483;
			}
			aBool2342 = false;
		}
	}

	public void method4282(int i) {
		if (aBool2327 && i >= 0)
			method4213(i, false, (byte) 14);
	}

	public int method4283() {
		return -743748327 * anInt2320;
	}

	public void method4284(Class198 class198, int i) {
		if (null != class198 && class198.anIntArrayArray2178 != null && i < class198.anIntArrayArray2178.length && null != class198.anIntArrayArray2178[i]) {
			int i_166_ = class198.anIntArrayArray2178[i][0];
			int i_167_ = i_166_ >> 8;
			int i_168_ = i_166_ >> 5 & 0x7;
			if (class198.anIntArrayArray2178[i].length > 1) {
				int i_169_ = (int) (Math.random() * (double) (class198.anIntArrayArray2178[i]).length);
				if (i_169_ > 0)
					i_167_ = class198.anIntArrayArray2178[i][i_169_];
			}
			int i_170_ = 256;
			if (class198.anIntArray2169 != null && class198.anIntArray2173 != null)
				i_170_ = (int) ((double) class198.anIntArray2169[i] + (Math.random() * (double) (class198.anIntArray2173[i] - class198.anIntArray2169[i])));
			int i_171_ = (class198.anIntArray2189 == null ? 255 : class198.anIntArray2189[i]);
			method4218(Class193.aClass193_2145, i_167_, i_168_, i_171_, Class206.aClass206_2221.method3836(832819899), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_170_, 0, -804374936);
		}
	}

	public void method4285(int i) {
		anInt2343 = -1857779625 * i;
	}

	void method4286(int i) {
		if (client.aClass109_11067.aClass2_1367 != null && Class167.method2677(client.anInt11048 * -1927019389, (byte) 17)) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4428, client.aClass109_11067.aClass2_1367, (byte) -3);
			class527_sub15.buffer.writeInt(i, -957564470);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	Interface70 method4287(int i, boolean bool) {
		if (!aBool2327)
			return null;
		Interface70 interface70 = method4193(i, bool, (byte) 1);
		if (interface70 == null) {
			Class216 class216 = new Class216(this);
			interface70 = Class258.method4744((bool ? Class620.aClass459_8118 : Class205.aClass459_2219), i, class216, bool, aClass205_2349, 1684082539);
			if (bool)
				aHashMap2331.put(Integer.valueOf(i), interface70);
			else
				aHashMap2334.put(Integer.valueOf(i), interface70);
		}
		return interface70;
	}

	public void method4288(int i) {
		method4273(i, 255, (byte) 8);
	}

	public void method4289(int i) {
		method4273(i, 255, (byte) 8);
	}

	List method4290(int i) {
		return aList2324;
	}

	public void method4291(int i, int i_172_) {
		method4226(i, i_172_, false, 0, 0, 0, 0, 0, -1841722175);
	}

	public void method4292(int i, int i_173_) {
		Class360 class360 = Class458.method7469(i, (byte) -33);
		if (class360 != null) {
			float f = (float) i_173_ * 1.5258789E-5F;
			class360.method6309(f, 440351387);
		}
	}

	public void method4293(int i, int i_174_, boolean bool, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_) {
		if (aBool2327 && i != anInt2320 * -743748327) {
			if (aBool2325 && null != aClass483_2340 && anInt2320 * -743748327 != i) {
				aClass483_2340.method7882(1231702210);
				aClass483_2340.method7850((byte) 0);
				aList2329.remove(aClass483_2340);
			}
			Class483 class483 = method4242(-828035844);
			if (null != class483 && class483.method7926(-1894989179).method434((byte) 1) == i) {
				aClass483_2340 = class483;
				anInt2320 = (class483.method7926(-1814931897).method434((byte) 1) * 969129769);
			} else {
				boolean bool_180_ = false;
				if (-743748327 * anInt2320 >= 0) {
					Iterator iterator = aList2329.iterator();
					while (iterator.hasNext()) {
						Class483 class483_181_ = (Class483) iterator.next();
						if (class483_181_.method7900((byte) 8) == Class193.aClass193_2152) {
							class483_181_.method7864(2000, (byte) 6);
							bool_180_ = true;
						}
					}
				}
				aClass483_2340 = null;
				anInt2320 = -969129769;
				Class483 class483_182_ = null;
				if (aClass483_2346 != null && aClass483_2346.method7926(-2106615524) != null && aClass483_2346.method7926(-2113774580).method434((byte) 1) == i && (aClass483_2346.method7858(1971855238) == Class482.aClass482_5422)) {
					class483_182_ = aClass483_2346;
					aClass483_2346 = null;
					aBool2342 = false;
				}
				if (class483_182_ == null) {
					if (bool) {
						float f = (float) i_178_;
						float f_183_ = (float) i_179_;
						Class442 class442 = new Class442((float) i_176_, 0.0F, (float) i_177_);
						class483_182_ = method4211(Class193.aClass193_2152, this, i, 0, bool_180_ ? 0 : i_174_, (anInt2343 * 1186521959 == i ? Class201.aClass201_2207.method3766(-6234604) : Class206.aClass206_2220.method3836(1210027035)), Class189.aClass189_2123, f, f_183_, class442, i_175_, 255, true, (byte) 54);
					} else
						class483_182_ = method4211(Class193.aClass193_2152, this, i, 0, bool_180_ ? 0 : i_174_, (i == 1186521959 * anInt2343 ? Class201.aClass201_2207.method3766(-11803429) : Class206.aClass206_2220.method3836(-110121267)), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 255, true, (byte) 12);
				}
				if (null != class483_182_) {
					if (bool_180_) {
						float f = (float) i_174_ / 255.0F;
						class483_182_.method7876(f, 2000, -360214493);
					}
					class483_182_.method7852(1969554825);
					method4215(class483_182_, (byte) -1);
					aClass483_2340 = class483_182_;
					anInt2320 = i * 969129769;
					if (aBool2325)
						aClass483_2340.method7875(-1110037053);
					if (client.aClass109_11067.aClass2_1367 != null && Class167.method2677(-1927019389 * client.anInt11048, (byte) 17)) {
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4455, (client.aClass109_11067.aClass2_1367), (byte) 27);
						class527_sub15.buffer.writeInt(-743748327 * anInt2320, 1535092300);
						client.aClass109_11067.method1969(class527_sub15, (byte) 1);
					}
				}
			}
		}
	}

	Class483 method4294() {
		Iterator iterator = aList2329.iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			if (class483.method7900((byte) 8) == Class193.aClass193_2152 && class483.method7858(1315550253) == Class482.aClass482_5423)
				return class483;
		}
		return null;
	}

	Class483 method4295() {
		Iterator iterator = aList2329.iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			if (class483.method7900((byte) 8) == Class193.aClass193_2152 && class483.method7858(1918859045) == Class482.aClass482_5423)
				return class483;
		}
		return null;
	}

	public void method4296(int i, int i_184_) {
		if (aBool2327 && (!aBool2325 || -771435999 * anInt2344 != i)) {
			if (aBool2325 && -771435999 * anInt2344 != i) {
				Iterator iterator = aList2328.iterator();
				while (iterator.hasNext()) {
					Class483 class483 = (Class483) iterator.next();
					if (class483.method7900((byte) 8) == Class193.aClass193_2153) {
						class483.method7850((byte) 0);
						aList2329.remove(class483);
						aBool2325 = false;
						break;
					}
				}
			}
			if (i_184_ != 0 && -1 != i) {
				if (!aBool2325 && aClass483_2340 != null)
					aClass483_2340.method7875(-1081435778);
				Class483 class483 = method4211(Class193.aClass193_2153, this, i, 0, i_184_, Class206.aClass206_2220.method3836(-1066127644), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 255, true, (byte) 108);
				if (null != class483) {
					class483.method7852(1969554825);
					method4215(class483, (byte) -1);
					aBool2325 = true;
					anInt2344 = -232050207 * i;
				}
			}
		}
	}

	public void method4297(int i, byte i_185_) {
		Iterator iterator = aList2329.iterator();
		while (iterator.hasNext()) {
			Class483 class483 = (Class483) iterator.next();
			int i_186_ = class483.method7855((short) 255);
			boolean bool = Class596.method9904(i_186_, i, 904936728);
			if (bool)
				class483.method7864(50, (byte) 6);
		}
	}

	public void method4298(int i, int i_187_, int i_188_) {
		if (anInt2320 * -743748327 != i) {
			if (null != aClass483_2346) {
				aClass483_2346.method7864(0, (byte) 6);
				method4215(aClass483_2346, (byte) -1);
				aClass483_2346 = null;
			}
			Class483 class483 = method4211(Class193.aClass193_2152, this, i, 0, i_187_, Class206.aClass206_2220.method3836(-871976735), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, 255, true, (byte) 127);
			if (null != class483) {
				class483.method7851((byte) 0);
				aClass483_2346 = class483;
			}
			aBool2342 = false;
		}
	}

	public void method4299(int i, int i_189_) {
		method4273(i, 255, (byte) 8);
	}

	public void method4300(Class198 class198, int i) {
		if (null != class198 && class198.anIntArrayArray2178 != null && i < class198.anIntArrayArray2178.length && null != class198.anIntArrayArray2178[i]) {
			int i_190_ = class198.anIntArrayArray2178[i][0];
			int i_191_ = i_190_ >> 8;
			int i_192_ = i_190_ >> 5 & 0x7;
			if (class198.anIntArrayArray2178[i].length > 1) {
				int i_193_ = (int) (Math.random() * (double) (class198.anIntArrayArray2178[i]).length);
				if (i_193_ > 0)
					i_191_ = class198.anIntArrayArray2178[i][i_193_];
			}
			int i_194_ = 256;
			if (class198.anIntArray2169 != null && class198.anIntArray2173 != null)
				i_194_ = (int) ((double) class198.anIntArray2169[i] + (Math.random() * (double) (class198.anIntArray2173[i] - class198.anIntArray2169[i])));
			int i_195_ = (class198.anIntArray2189 == null ? 255 : class198.anIntArray2189[i]);
			method4218(Class193.aClass193_2145, i_191_, i_192_, i_195_, Class206.aClass206_2221.method3836(-457756376), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_194_, 0, 1873753802);
		}
	}

	public void method4301(Class198 class198, int i) {
		if (null != class198 && class198.anIntArrayArray2178 != null && i < class198.anIntArrayArray2178.length && null != class198.anIntArrayArray2178[i]) {
			int i_196_ = class198.anIntArrayArray2178[i][0];
			int i_197_ = i_196_ >> 8;
			int i_198_ = i_196_ >> 5 & 0x7;
			if (class198.anIntArrayArray2178[i].length > 1) {
				int i_199_ = (int) (Math.random() * (double) (class198.anIntArrayArray2178[i]).length);
				if (i_199_ > 0)
					i_197_ = class198.anIntArrayArray2178[i][i_199_];
			}
			int i_200_ = 256;
			if (class198.anIntArray2169 != null && class198.anIntArray2173 != null)
				i_200_ = (int) ((double) class198.anIntArray2169[i] + (Math.random() * (double) (class198.anIntArray2173[i] - class198.anIntArray2169[i])));
			int i_201_ = (class198.anIntArray2189 == null ? 255 : class198.anIntArray2189[i]);
			method4218(Class193.aClass193_2145, i_197_, i_198_, i_201_, Class206.aClass206_2221.method3836(-1284291203), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_200_, 0, -1234427584);
		}
	}

	static final void method4302(Class665 class665, int i) {
		int i_202_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3992(i_202_, -903459113).method3917((byte) -86);
	}

	static void method4303(Class180 class180, int i, int i_203_, Class243 class243, Class142 class142, int i_204_, int i_205_, int i_206_) {
		for (int i_207_ = 0; i_207_ < -1599561389 * client.anInt11059; i_207_++) {
			Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) client.anIntArray11021[i_207_]));
			if (null != class527_sub26) {
				Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
				if (class640_sub1_sub2_sub1_sub1.method18838(2141575072) && (class640_sub1_sub2_sub1_sub1.aByte10864 == (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864))) {
					Class295 class295 = class640_sub1_sub2_sub1_sub1.aClass295_12168;
					if (null != class295 && null != class295.anIntArray3312)
						class295 = class295.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1905437682);
					if (null != class295 && class295.aBool3313 && class295.aBool3299) {
						Class442 class442 = (class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
						int i_208_ = (int) class442.aFloat4918 / 128 - i / 128;
						int i_209_ = (int) class442.aFloat4919 / 128 - i_203_ / 128;
						if (1372952149 * class295.anInt3337 != -1)
							Class532.method8928(class180, class142, class243, i_204_, i_205_, i_208_, i_209_, (1372952149 * class295.anInt3337), (byte) -35);
						else
							Class527_Sub8.method16062(class243, class142, i_204_, i_205_, i_208_, i_209_, (Class49.aClass147Array507[1]), -707500905);
					}
				}
			}
		}
	}

	static final void method4304(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, boolean bool, byte i) {
		Class587 class587 = class640_sub1_sub2_sub1.method18542(-1468632296);
		if (0 == class640_sub1_sub2_sub1.anInt11942 * -1057678739) {
			class640_sub1_sub2_sub1.anInt11946 = 0;
			Class174_Sub1.anInt9111 = 1658964061 * Class679.aClass679_8625.aByte8627;
			Class334_Sub2.anInt10071 = 0;
		} else {
			if (class640_sub1_sub2_sub1.aClass695_11914.method14162(-1045904026) && !class640_sub1_sub2_sub1.aClass695_11914.method14172(-948972109)) {
				Class198 class198 = class640_sub1_sub2_sub1.aClass695_11914.method14163(-1228298961);
				if (1210251625 * class640_sub1_sub2_sub1.anInt11947 > 0 && 0 == class198.anInt2193 * -970181161) {
					class640_sub1_sub2_sub1.anInt11946 += -1994941813;
					Class174_Sub1.anInt9111 = 1658964061 * Class679.aClass679_8625.aByte8627;
					Class334_Sub2.anInt10071 = 0;
					return;
				}
				if (1210251625 * class640_sub1_sub2_sub1.anInt11947 <= 0 && 0 == -707228641 * class198.anInt2185) {
					class640_sub1_sub2_sub1.anInt11946 += -1994941813;
					Class174_Sub1.anInt9111 = 1658964061 * Class679.aClass679_8625.aByte8627;
					Class334_Sub2.anInt10071 = 0;
					return;
				}
			}
			for (int i_210_ = 0; i_210_ < class640_sub1_sub2_sub1.aClass505Array11915.length; i_210_++) {
				if ((class640_sub1_sub2_sub1.aClass505Array11915[i_210_].anInt6909) * 1429262853 != -1 && class640_sub1_sub2_sub1.aClass505Array11915[i_210_].aClass695_6911.method14172(1325980222)) {
					Class685 class685 = (Class685) (Class57.aClass24_Sub4_720.method81(1429262853 * (class640_sub1_sub2_sub1.aClass505Array11915[i_210_].anInt6909), 599697799));
					if (class685.aBool8665 && -1 != -1567837355 * class685.anInt8671) {
						Class198 class198 = (Class198) (Class321.aClass24_Sub10_3551.method81(class685.anInt8671 * -1567837355, -208233551));
						if (1210251625 * class640_sub1_sub2_sub1.anInt11947 > 0 && class198.anInt2193 * -970181161 == 0) {
							class640_sub1_sub2_sub1.anInt11946 += -1994941813;
							Class174_Sub1.anInt9111 = (Class679.aClass679_8625.aByte8627 * 1658964061);
							Class334_Sub2.anInt10071 = 0;
							return;
						}
						if ((1210251625 * class640_sub1_sub2_sub1.anInt11947 <= 0) && -707228641 * class198.anInt2185 == 0) {
							class640_sub1_sub2_sub1.anInt11946 += -1994941813;
							Class174_Sub1.anInt9111 = (Class679.aClass679_8625.aByte8627 * 1658964061);
							Class334_Sub2.anInt10071 = 0;
							return;
						}
					}
				}
			}
			Class442 class442 = Class442.method7139(class640_sub1_sub2_sub1.method10637().aClass442_4927);
			int i_211_ = (int) class442.aFloat4918;
			int i_212_ = (int) class442.aFloat4919;
			int i_213_ = ((512 * (class640_sub1_sub2_sub1.anIntArray11902[class640_sub1_sub2_sub1.anInt11942 * -1057678739 - 1])) + class640_sub1_sub2_sub1.method18564(-1167734478) * 256);
			int i_214_ = ((512 * (class640_sub1_sub2_sub1.anIntArray11944[class640_sub1_sub2_sub1.anInt11942 * -1057678739 - 1])) + class640_sub1_sub2_sub1.method18564(-1512131520) * 256);
			if (i_211_ < i_213_) {
				if (i_212_ < i_214_)
					class640_sub1_sub2_sub1.method18527(10240, -1231528078);
				else if (i_212_ > i_214_)
					class640_sub1_sub2_sub1.method18527(14336, 506149517);
				else
					class640_sub1_sub2_sub1.method18527(12288, -2081726419);
			} else if (i_211_ > i_213_) {
				if (i_212_ < i_214_)
					class640_sub1_sub2_sub1.method18527(6144, 1326856468);
				else if (i_212_ > i_214_)
					class640_sub1_sub2_sub1.method18527(2048, -2108677009);
				else
					class640_sub1_sub2_sub1.method18527(4096, 1212588061);
			} else if (i_212_ < i_214_)
				class640_sub1_sub2_sub1.method18527(8192, -562705131);
			else if (i_212_ > i_214_)
				class640_sub1_sub2_sub1.method18527(0, 361201653);
			int i_215_ = (class640_sub1_sub2_sub1.aByteArray11945[-1057678739 * class640_sub1_sub2_sub1.anInt11942 - 1]);
			if (!bool && (i_213_ - i_211_ > 1024 || i_213_ - i_211_ < -1024 || i_214_ - i_212_ > 1024 || i_214_ - i_212_ < -1024)) {
				class640_sub1_sub2_sub1.method10619((float) i_213_, class442.aFloat4915, (float) i_214_);
				class640_sub1_sub2_sub1.method18528((class640_sub1_sub2_sub1.anInt11938) * 1672946997, false, -1837658178);
				class640_sub1_sub2_sub1.anInt11942 -= 1705181029;
				if (class640_sub1_sub2_sub1.anInt11947 * 1210251625 > 0)
					class640_sub1_sub2_sub1.anInt11947 -= 655173337;
				Class174_Sub1.anInt9111 = Class679.aClass679_8625.aByte8627 * 1658964061;
				Class334_Sub2.anInt10071 = 0;
				class442.method7141();
			} else {
				int i_216_ = 16;
				boolean bool_217_ = true;
				if (class640_sub1_sub2_sub1 instanceof Class640_Sub1_Sub2_Sub1_Sub1)
					bool_217_ = ((Class640_Sub1_Sub2_Sub1_Sub1) class640_sub1_sub2_sub1).aClass295_12168.aBool3316;
				if (bool_217_) {
					int i_218_ = (1672946997 * class640_sub1_sub2_sub1.anInt11938 - (class640_sub1_sub2_sub1.aClass61_11936.anInt725 * 1085423875));
					if (0 != i_218_ && 816496727 * class640_sub1_sub2_sub1.anInt11910 == -1 && (class640_sub1_sub2_sub1.anInt11937 * 2021896877 != 0))
						i_216_ = 8;
					if (!bool && (-1057678739 * class640_sub1_sub2_sub1.anInt11942 > 2))
						i_216_ = 24;
					if (!bool && (class640_sub1_sub2_sub1.anInt11942 * -1057678739 > 3))
						i_216_ = 32;
				} else {
					if (!bool && (-1057678739 * class640_sub1_sub2_sub1.anInt11942 > 1))
						i_216_ = 24;
					if (!bool && (class640_sub1_sub2_sub1.anInt11942 * -1057678739 > 2))
						i_216_ = 32;
				}
				if (-1410302685 * class640_sub1_sub2_sub1.anInt11946 > 0 && -1057678739 * class640_sub1_sub2_sub1.anInt11942 > 1) {
					i_216_ = 32;
					class640_sub1_sub2_sub1.anInt11946 -= -1994941813;
				}
				if (Class679.aClass679_8623.aByte8627 == i_215_)
					i_216_ <<= 1;
				else if (Class679.aClass679_8620.aByte8627 == i_215_)
					i_216_ >>= 1;
				if (-237523145 * class587.anInt7749 != -1) {
					i_216_ <<= 9;
					if (1 == -1057678739 * class640_sub1_sub2_sub1.anInt11942) {
						int i_219_ = (-491902267 * class640_sub1_sub2_sub1.anInt11918 * (class640_sub1_sub2_sub1.anInt11918 * -491902267));
						int i_220_ = (((int) class442.aFloat4918 > i_213_ ? (int) class442.aFloat4918 - i_213_ : i_213_ - (int) class442.aFloat4918) << 9);
						int i_221_ = (((int) class442.aFloat4919 > i_214_ ? (int) class442.aFloat4919 - i_214_ : i_214_ - (int) class442.aFloat4919) << 9);
						int i_222_ = i_220_ > i_221_ ? i_220_ : i_221_;
						int i_223_ = -475046290 * class587.anInt7749 * i_222_;
						if (i_219_ > i_223_) {
							Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1_224_;
							(class640_sub1_sub2_sub1_224_ = class640_sub1_sub2_sub1).anInt11918 = (1029030925 * (class640_sub1_sub2_sub1_224_.anInt11918 * -491902267 / 2));
						} else if (i_219_ / 2 > i_222_) {
							class640_sub1_sub2_sub1.anInt11918 -= -1302527541 * class587.anInt7749;
							if (class640_sub1_sub2_sub1.anInt11918 * -491902267 < 0)
								class640_sub1_sub2_sub1.anInt11918 = 0;
						} else if ((class640_sub1_sub2_sub1.anInt11918 * -491902267) < i_216_) {
							class640_sub1_sub2_sub1.anInt11918 += class587.anInt7749 * -1302527541;
							if (class640_sub1_sub2_sub1.anInt11918 * -491902267 > i_216_)
								class640_sub1_sub2_sub1.anInt11918 = i_216_ * 1029030925;
						}
					} else if (-491902267 * class640_sub1_sub2_sub1.anInt11918 < i_216_) {
						class640_sub1_sub2_sub1.anInt11918 += class587.anInt7749 * -1302527541;
						if (class640_sub1_sub2_sub1.anInt11918 * -491902267 > i_216_)
							class640_sub1_sub2_sub1.anInt11918 = 1029030925 * i_216_;
					} else if (-491902267 * class640_sub1_sub2_sub1.anInt11918 > 0) {
						class640_sub1_sub2_sub1.anInt11918 -= -1302527541 * class587.anInt7749;
						if (-491902267 * class640_sub1_sub2_sub1.anInt11918 < 0)
							class640_sub1_sub2_sub1.anInt11918 = 0;
					}
					i_216_ = class640_sub1_sub2_sub1.anInt11918 * -491902267 >> 9;
					if (i_216_ < 1)
						i_216_ = 1;
				}
				Class334_Sub2.anInt10071 = 0;
				if (i_213_ != i_211_ || i_212_ != i_214_) {
					if (i_211_ < i_213_) {
						class442.aFloat4918 += (float) i_216_;
						Class334_Sub2.anInt10071 = (336695907 * (-2092335285 * Class334_Sub2.anInt10071 | 0x4));
						if (class442.aFloat4918 > (float) i_213_)
							class442.aFloat4918 = (float) i_213_;
					} else if (i_211_ > i_213_) {
						class442.aFloat4918 -= (float) i_216_;
						Class334_Sub2.anInt10071 = ((-2092335285 * Class334_Sub2.anInt10071 | 0x8) * 336695907);
						if (class442.aFloat4918 < (float) i_213_)
							class442.aFloat4918 = (float) i_213_;
					}
					if (i_212_ < i_214_) {
						class442.aFloat4919 += (float) i_216_;
						Class334_Sub2.anInt10071 = ((Class334_Sub2.anInt10071 * -2092335285 | 0x1) * 336695907);
						if (class442.aFloat4919 > (float) i_214_)
							class442.aFloat4919 = (float) i_214_;
					} else if (i_212_ > i_214_) {
						class442.aFloat4919 -= (float) i_216_;
						Class334_Sub2.anInt10071 = ((Class334_Sub2.anInt10071 * -2092335285 | 0x2) * 336695907);
						if (class442.aFloat4919 < (float) i_214_)
							class442.aFloat4919 = (float) i_214_;
					}
					class640_sub1_sub2_sub1.method10618(class442);
					if (i_216_ >= 32)
						Class174_Sub1.anInt9111 = 1658964061 * Class679.aClass679_8623.aByte8627;
					else
						Class174_Sub1.anInt9111 = 1658964061 * i_215_;
				} else
					Class174_Sub1.anInt9111 = Class679.aClass679_8625.aByte8627 * 1658964061;
				if ((int) class442.aFloat4918 == i_213_ && i_214_ == (int) class442.aFloat4919) {
					class640_sub1_sub2_sub1.anInt11942 -= 1705181029;
					if (1210251625 * class640_sub1_sub2_sub1.anInt11947 > 0)
						class640_sub1_sub2_sub1.anInt11947 -= 655173337;
				}
				class442.method7141();
			}
		}
	}
}
