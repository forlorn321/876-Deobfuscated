/* Class296_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class296_Sub1 extends Class296 {
	int anInt10027 = 0;

	public void method15682(RSByteBuffer class527_sub38, int i) {
		int i_0_ = -441238943 * class527_sub38.anInt10689;
		int i_1_ = class527_sub38.readUnsignedByte();
		method5345(Class235.method4352(i_1_ & 0x1, 1842713739), -524016440);
		if (0 != (i_1_ & 0x8)) {
			Class309 class309 = Class535.method8981(class527_sub38.readUnsignedByte(), -1730806731);
			if (aClass309_3376 != class309) {
				try {
					method5346(class309, true, 1032920337);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_1_ & 0x10) != 0) {
			Class301 class301 = Class465.method7647(class527_sub38.readUnsignedByte(), 1086659564);
			if (class301 != aClass301_3353) {
				try {
					method5347(class301, true, 29319166);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_1_ >> 7 & 0x1) == 1) {
			int i_2_ = class527_sub38.readUnsignedShort();
			if ((i_2_ >> 569926703 * Class291.aClass291_3238.anInt3249 & 0x1) == 1)
				aClass442_3358.method7144(class527_sub38);
			if ((i_2_ >> Class291.aClass291_3235.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3366.method7144(class527_sub38);
			if ((i_2_ >> 569926703 * Class291.aClass291_3236.anInt3249 & 0x1) == 1)
				aClass442_3362.method7144(class527_sub38);
			if ((i_2_ >> Class291.aClass291_3237.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3363.method7144(class527_sub38);
			if (1 == (i_2_ >> 569926703 * Class291.aClass291_3242.anInt3249 & 0x1)) {
				aFloat3374 = class527_sub38.readFloat(-2138464367);
				aFloat3375 = class527_sub38.readFloat(-672300889);
			}
			if (1 == (i_2_ >> Class291.aClass291_3239.anInt3249 * 569926703 & 0x1)) {
				aFloat3378 = class527_sub38.readFloat(-1753515522);
				aFloat3382 = class527_sub38.readFloat(-1664452341);
			}
			if ((i_2_ >> 569926703 * Class291.aClass291_3240.anInt3249 & 0x1) == 1)
				aClass307_3350 = Class606.method10060(class527_sub38.readUnsignedByte(), 1537905328);
			if ((i_2_ >> 569926703 * Class291.aClass291_3234.anInt3249 & 0x1) == 1) {
				anInt3357 = class527_sub38.read24BitUnsignedInteger(1509780242) * -203768969;
				class527_sub38.readUnsignedByte();
			}
			if (1 == (i_2_ >> Class291.aClass291_3246.anInt3249 * 569926703 & 0x1)) {
				int i_3_ = class527_sub38.readUnsignedByte();
				aBool3380 = 1 == (i_3_ & 0x1);
				aBool3359 = (i_3_ & 0x2) == 2;
			}
			if ((i_2_ >> 569926703 * Class291.aClass291_3243.anInt3249 & 0x1) == 1) {
				int i_4_ = class527_sub38.readUnsignedByte();
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
					int i_6_ = class527_sub38.readUnsignedByte();
					int i_7_ = class527_sub38.readUnsignedByte();
					if (0 == i_6_)
						method5366(i_7_, 2122663966);
					else {
						Class270 class270 = Class433.method6966(class527_sub38.readUnsignedByte(), -827896581);
						boolean bool = true;
						Iterator iterator = aClass14_3360.iterator();
						while (iterator.hasNext()) {
							Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
							if (i_7_ == (class527_sub8_sub15.anInt11779 * 575434551)) {
								class527_sub8_sub15.method18355(class527_sub38, -1884712550);
								bool = false;
								break;
							}
						}
						if (bool)
							method5445(Class526.method8734(i_7_, class270, class527_sub38, (byte) 93), 1415579398);
					}
				}
			}
			if (1 == (i_2_ >> 569926703 * Class291.aClass291_3245.anInt3249 & 0x1)) {
				anInt3348 = class527_sub38.readUnsignedShort() * -1096148605;
				aFloat3383 = class527_sub38.readFloat(-1564336143);
			}
			if (1 == (i_2_ >> 569926703 * Class291.aClass291_3247.anInt3249 & 0x1))
				aClass303_3356 = Class622.method10234(class527_sub38.readUnsignedByte(), 653188195);
			if ((i_2_ >> 569926703 * Class291.aClass291_3241.anInt3249 & 0x1) == 1) {
				aClass442_3370.method7144(class527_sub38);
				aClass442_3371.method7144(class527_sub38);
				aFloat3381 = class527_sub38.readFloat(-1483338020);
				aFloat3373 = class527_sub38.readFloat(-1251998536);
			}
			if (1 == (i_2_ >> Class291.aClass291_3248.anInt3249 * 569926703 & 0x1))
				class527_sub38.readFloat(-443506492);
			if (1 == (i_2_ >> Class291.aClass291_3244.anInt3249 * 569926703 & 0x1))
				aFloat3372 = class527_sub38.readFloat(-1675140160);
		}
		if (aClass696_3379 != null && (i_1_ >> 5 & 0x1) == 1)
			aClass696_3379.method14248(class527_sub38, -1348494302);
		if (null != aClass327_3354 && 1 == (i_1_ >> 6 & 0x1))
			aClass327_3354.method5786(class527_sub38, 1258060834);
		if (i != -441238943 * class527_sub38.anInt10689 - i_0_)
			throw new RuntimeException(new StringBuilder().append(-441238943 * (class527_sub38.anInt10689) - i_0_).append(",").append(i).toString());
	}

	public int method15683() {
		anInt10027 += -349551933;
		if (anInt10027 * -79757845 == 126)
			anInt10027 = 0;
		return anInt10027 * -79757845;
	}

	public int method15684(int i) {
		anInt10027 += -349551933;
		if (anInt10027 * -79757845 == 126)
			anInt10027 = 0;
		return anInt10027 * -79757845;
	}

	public int method15685() {
		anInt10027 += -349551933;
		if (anInt10027 * -79757845 == 126)
			anInt10027 = 0;
		return anInt10027 * -79757845;
	}

	public int method15686() {
		anInt10027 += -349551933;
		if (anInt10027 * -79757845 == 126)
			anInt10027 = 0;
		return anInt10027 * -79757845;
	}

	public Class296_Sub1(Interface30 interface30) {
		super(Class288.aClass288_3219, interface30);
	}

	public int method15687() {
		anInt10027 += -349551933;
		if (anInt10027 * -79757845 == 126)
			anInt10027 = 0;
		return anInt10027 * -79757845;
	}

	public void method15688(RSByteBuffer class527_sub38, int i) {
		int i_8_ = -441238943 * class527_sub38.anInt10689;
		int i_9_ = class527_sub38.readUnsignedByte();
		method5345(Class235.method4352(i_9_ & 0x1, 1477894468), -1424738855);
		if (0 != (i_9_ & 0x8)) {
			Class309 class309 = Class535.method8981(class527_sub38.readUnsignedByte(), -1635402963);
			if (aClass309_3376 != class309) {
				try {
					method5346(class309, true, 1032920337);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_9_ & 0x10) != 0) {
			Class301 class301 = Class465.method7647(class527_sub38.readUnsignedByte(), 1086659564);
			if (class301 != aClass301_3353) {
				try {
					method5347(class301, true, 1937850167);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_9_ >> 7 & 0x1) == 1) {
			int i_10_ = class527_sub38.readUnsignedShort();
			if ((i_10_ >> 569926703 * Class291.aClass291_3238.anInt3249 & 0x1) == 1)
				aClass442_3358.method7144(class527_sub38);
			if ((i_10_ >> Class291.aClass291_3235.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3366.method7144(class527_sub38);
			if ((i_10_ >> 569926703 * Class291.aClass291_3236.anInt3249 & 0x1) == 1)
				aClass442_3362.method7144(class527_sub38);
			if ((i_10_ >> Class291.aClass291_3237.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3363.method7144(class527_sub38);
			if (1 == (i_10_ >> 569926703 * Class291.aClass291_3242.anInt3249 & 0x1)) {
				aFloat3374 = class527_sub38.readFloat(-2042932633);
				aFloat3375 = class527_sub38.readFloat(-1439193577);
			}
			if (1 == (i_10_ >> Class291.aClass291_3239.anInt3249 * 569926703 & 0x1)) {
				aFloat3378 = class527_sub38.readFloat(-360023655);
				aFloat3382 = class527_sub38.readFloat(-1770027540);
			}
			if ((i_10_ >> 569926703 * Class291.aClass291_3240.anInt3249 & 0x1) == 1)
				aClass307_3350 = Class606.method10060(class527_sub38.readUnsignedByte(), -137344128);
			if ((i_10_ >> 569926703 * Class291.aClass291_3234.anInt3249 & 0x1) == 1) {
				anInt3357 = class527_sub38.read24BitUnsignedInteger(1107133362) * -203768969;
				class527_sub38.readUnsignedByte();
			}
			if (1 == (i_10_ >> Class291.aClass291_3246.anInt3249 * 569926703 & 0x1)) {
				int i_11_ = class527_sub38.readUnsignedByte();
				aBool3380 = 1 == (i_11_ & 0x1);
				aBool3359 = (i_11_ & 0x2) == 2;
			}
			if ((i_10_ >> 569926703 * Class291.aClass291_3243.anInt3249 & 0x1) == 1) {
				int i_12_ = class527_sub38.readUnsignedByte();
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					int i_14_ = class527_sub38.readUnsignedByte();
					int i_15_ = class527_sub38.readUnsignedByte();
					if (0 == i_14_)
						method5366(i_15_, 1844312302);
					else {
						Class270 class270 = Class433.method6966(class527_sub38.readUnsignedByte(), 1774898016);
						boolean bool = true;
						Iterator iterator = aClass14_3360.iterator();
						while (iterator.hasNext()) {
							Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
							if (i_15_ == (class527_sub8_sub15.anInt11779 * 575434551)) {
								class527_sub8_sub15.method18355(class527_sub38, 1258818090);
								bool = false;
								break;
							}
						}
						if (bool)
							method5445(Class526.method8734(i_15_, class270, class527_sub38, (byte) 105), -180154186);
					}
				}
			}
			if (1 == (i_10_ >> 569926703 * Class291.aClass291_3245.anInt3249 & 0x1)) {
				anInt3348 = class527_sub38.readUnsignedShort() * -1096148605;
				aFloat3383 = class527_sub38.readFloat(-569883023);
			}
			if (1 == (i_10_ >> 569926703 * Class291.aClass291_3247.anInt3249 & 0x1))
				aClass303_3356 = Class622.method10234(class527_sub38.readUnsignedByte(), -151605939);
			if ((i_10_ >> 569926703 * Class291.aClass291_3241.anInt3249 & 0x1) == 1) {
				aClass442_3370.method7144(class527_sub38);
				aClass442_3371.method7144(class527_sub38);
				aFloat3381 = class527_sub38.readFloat(-1977225682);
				aFloat3373 = class527_sub38.readFloat(-281537842);
			}
			if (1 == (i_10_ >> Class291.aClass291_3248.anInt3249 * 569926703 & 0x1))
				class527_sub38.readFloat(-972832678);
			if (1 == (i_10_ >> Class291.aClass291_3244.anInt3249 * 569926703 & 0x1))
				aFloat3372 = class527_sub38.readFloat(-1744066734);
		}
		if (aClass696_3379 != null && (i_9_ >> 5 & 0x1) == 1)
			aClass696_3379.method14248(class527_sub38, -2070255528);
		if (null != aClass327_3354 && 1 == (i_9_ >> 6 & 0x1))
			aClass327_3354.method5786(class527_sub38, 1972477103);
		if (i != -441238943 * class527_sub38.anInt10689 - i_8_)
			throw new RuntimeException(new StringBuilder().append(-441238943 * (class527_sub38.anInt10689) - i_8_).append(",").append(i).toString());
	}

	public void method15689(RSByteBuffer class527_sub38, int i) {
		int i_16_ = -441238943 * class527_sub38.anInt10689;
		int i_17_ = class527_sub38.readUnsignedByte();
		method5345(Class235.method4352(i_17_ & 0x1, 1688627306), -1249890724);
		if (0 != (i_17_ & 0x8)) {
			Class309 class309 = Class535.method8981(class527_sub38.readUnsignedByte(), -934007364);
			if (aClass309_3376 != class309) {
				try {
					method5346(class309, true, 1032920337);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_17_ & 0x10) != 0) {
			Class301 class301 = Class465.method7647(class527_sub38.readUnsignedByte(), 1086659564);
			if (class301 != aClass301_3353) {
				try {
					method5347(class301, true, 612342908);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_17_ >> 7 & 0x1) == 1) {
			int i_18_ = class527_sub38.readUnsignedShort();
			if ((i_18_ >> 569926703 * Class291.aClass291_3238.anInt3249 & 0x1) == 1)
				aClass442_3358.method7144(class527_sub38);
			if ((i_18_ >> Class291.aClass291_3235.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3366.method7144(class527_sub38);
			if ((i_18_ >> 569926703 * Class291.aClass291_3236.anInt3249 & 0x1) == 1)
				aClass442_3362.method7144(class527_sub38);
			if ((i_18_ >> Class291.aClass291_3237.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3363.method7144(class527_sub38);
			if (1 == (i_18_ >> 569926703 * Class291.aClass291_3242.anInt3249 & 0x1)) {
				aFloat3374 = class527_sub38.readFloat(-1722632425);
				aFloat3375 = class527_sub38.readFloat(-2099230222);
			}
			if (1 == (i_18_ >> Class291.aClass291_3239.anInt3249 * 569926703 & 0x1)) {
				aFloat3378 = class527_sub38.readFloat(-1146874069);
				aFloat3382 = class527_sub38.readFloat(-653760982);
			}
			if ((i_18_ >> 569926703 * Class291.aClass291_3240.anInt3249 & 0x1) == 1)
				aClass307_3350 = Class606.method10060(class527_sub38.readUnsignedByte(), -447818093);
			if ((i_18_ >> 569926703 * Class291.aClass291_3234.anInt3249 & 0x1) == 1) {
				anInt3357 = class527_sub38.read24BitUnsignedInteger(972570413) * -203768969;
				class527_sub38.readUnsignedByte();
			}
			if (1 == (i_18_ >> Class291.aClass291_3246.anInt3249 * 569926703 & 0x1)) {
				int i_19_ = class527_sub38.readUnsignedByte();
				aBool3380 = 1 == (i_19_ & 0x1);
				aBool3359 = (i_19_ & 0x2) == 2;
			}
			if ((i_18_ >> 569926703 * Class291.aClass291_3243.anInt3249 & 0x1) == 1) {
				int i_20_ = class527_sub38.readUnsignedByte();
				for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
					int i_22_ = class527_sub38.readUnsignedByte();
					int i_23_ = class527_sub38.readUnsignedByte();
					if (0 == i_22_)
						method5366(i_23_, 1452944521);
					else {
						Class270 class270 = Class433.method6966(class527_sub38.readUnsignedByte(), 2090259253);
						boolean bool = true;
						Iterator iterator = aClass14_3360.iterator();
						while (iterator.hasNext()) {
							Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
							if (i_23_ == (class527_sub8_sub15.anInt11779 * 575434551)) {
								class527_sub8_sub15.method18355(class527_sub38, -6761230);
								bool = false;
								break;
							}
						}
						if (bool)
							method5445(Class526.method8734(i_23_, class270, class527_sub38, (byte) 21), -1303349826);
					}
				}
			}
			if (1 == (i_18_ >> 569926703 * Class291.aClass291_3245.anInt3249 & 0x1)) {
				anInt3348 = class527_sub38.readUnsignedShort() * -1096148605;
				aFloat3383 = class527_sub38.readFloat(-2066048265);
			}
			if (1 == (i_18_ >> 569926703 * Class291.aClass291_3247.anInt3249 & 0x1))
				aClass303_3356 = Class622.method10234(class527_sub38.readUnsignedByte(), -27475409);
			if ((i_18_ >> 569926703 * Class291.aClass291_3241.anInt3249 & 0x1) == 1) {
				aClass442_3370.method7144(class527_sub38);
				aClass442_3371.method7144(class527_sub38);
				aFloat3381 = class527_sub38.readFloat(-1576705065);
				aFloat3373 = class527_sub38.readFloat(-1760588740);
			}
			if (1 == (i_18_ >> Class291.aClass291_3248.anInt3249 * 569926703 & 0x1))
				class527_sub38.readFloat(-1633294728);
			if (1 == (i_18_ >> Class291.aClass291_3244.anInt3249 * 569926703 & 0x1))
				aFloat3372 = class527_sub38.readFloat(-1122706127);
		}
		if (aClass696_3379 != null && (i_17_ >> 5 & 0x1) == 1)
			aClass696_3379.method14248(class527_sub38, -1490304090);
		if (null != aClass327_3354 && 1 == (i_17_ >> 6 & 0x1))
			aClass327_3354.method5786(class527_sub38, 1995401383);
		if (i != -441238943 * class527_sub38.anInt10689 - i_16_)
			throw new RuntimeException(new StringBuilder().append(-441238943 * (class527_sub38.anInt10689) - i_16_).append(",").append(i).toString());
	}

	public void method15690(RSByteBuffer class527_sub38, int i) {
		int i_24_ = -441238943 * class527_sub38.anInt10689;
		int i_25_ = class527_sub38.readUnsignedByte();
		method5345(Class235.method4352(i_25_ & 0x1, 1843220811), 1982527696);
		if (0 != (i_25_ & 0x8)) {
			Class309 class309 = Class535.method8981(class527_sub38.readUnsignedByte(), -1766572359);
			if (aClass309_3376 != class309) {
				try {
					method5346(class309, true, 1032920337);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_25_ & 0x10) != 0) {
			Class301 class301 = Class465.method7647(class527_sub38.readUnsignedByte(), 1086659564);
			if (class301 != aClass301_3353) {
				try {
					method5347(class301, true, 1298680401);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_25_ >> 7 & 0x1) == 1) {
			int i_26_ = class527_sub38.readUnsignedShort();
			if ((i_26_ >> 569926703 * Class291.aClass291_3238.anInt3249 & 0x1) == 1)
				aClass442_3358.method7144(class527_sub38);
			if ((i_26_ >> Class291.aClass291_3235.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3366.method7144(class527_sub38);
			if ((i_26_ >> 569926703 * Class291.aClass291_3236.anInt3249 & 0x1) == 1)
				aClass442_3362.method7144(class527_sub38);
			if ((i_26_ >> Class291.aClass291_3237.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3363.method7144(class527_sub38);
			if (1 == (i_26_ >> 569926703 * Class291.aClass291_3242.anInt3249 & 0x1)) {
				aFloat3374 = class527_sub38.readFloat(-2081054801);
				aFloat3375 = class527_sub38.readFloat(-1721683235);
			}
			if (1 == (i_26_ >> Class291.aClass291_3239.anInt3249 * 569926703 & 0x1)) {
				aFloat3378 = class527_sub38.readFloat(-107846741);
				aFloat3382 = class527_sub38.readFloat(-749542534);
			}
			if ((i_26_ >> 569926703 * Class291.aClass291_3240.anInt3249 & 0x1) == 1)
				aClass307_3350 = Class606.method10060(class527_sub38.readUnsignedByte(), 1274873974);
			if ((i_26_ >> 569926703 * Class291.aClass291_3234.anInt3249 & 0x1) == 1) {
				anInt3357 = class527_sub38.read24BitUnsignedInteger(406998289) * -203768969;
				class527_sub38.readUnsignedByte();
			}
			if (1 == (i_26_ >> Class291.aClass291_3246.anInt3249 * 569926703 & 0x1)) {
				int i_27_ = class527_sub38.readUnsignedByte();
				aBool3380 = 1 == (i_27_ & 0x1);
				aBool3359 = (i_27_ & 0x2) == 2;
			}
			if ((i_26_ >> 569926703 * Class291.aClass291_3243.anInt3249 & 0x1) == 1) {
				int i_28_ = class527_sub38.readUnsignedByte();
				for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
					int i_30_ = class527_sub38.readUnsignedByte();
					int i_31_ = class527_sub38.readUnsignedByte();
					if (0 == i_30_)
						method5366(i_31_, 1493428610);
					else {
						Class270 class270 = Class433.method6966(class527_sub38.readUnsignedByte(), 2067266129);
						boolean bool = true;
						Iterator iterator = aClass14_3360.iterator();
						while (iterator.hasNext()) {
							Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
							if (i_31_ == (class527_sub8_sub15.anInt11779 * 575434551)) {
								class527_sub8_sub15.method18355(class527_sub38, -2106881825);
								bool = false;
								break;
							}
						}
						if (bool)
							method5445(Class526.method8734(i_31_, class270, class527_sub38, (byte) 94), -1181570277);
					}
				}
			}
			if (1 == (i_26_ >> 569926703 * Class291.aClass291_3245.anInt3249 & 0x1)) {
				anInt3348 = class527_sub38.readUnsignedShort() * -1096148605;
				aFloat3383 = class527_sub38.readFloat(-1361528521);
			}
			if (1 == (i_26_ >> 569926703 * Class291.aClass291_3247.anInt3249 & 0x1))
				aClass303_3356 = Class622.method10234(class527_sub38.readUnsignedByte(), 464930750);
			if ((i_26_ >> 569926703 * Class291.aClass291_3241.anInt3249 & 0x1) == 1) {
				aClass442_3370.method7144(class527_sub38);
				aClass442_3371.method7144(class527_sub38);
				aFloat3381 = class527_sub38.readFloat(-232144803);
				aFloat3373 = class527_sub38.readFloat(-662192862);
			}
			if (1 == (i_26_ >> Class291.aClass291_3248.anInt3249 * 569926703 & 0x1))
				class527_sub38.readFloat(-1174470198);
			if (1 == (i_26_ >> Class291.aClass291_3244.anInt3249 * 569926703 & 0x1))
				aFloat3372 = class527_sub38.readFloat(-1606415858);
		}
		if (aClass696_3379 != null && (i_25_ >> 5 & 0x1) == 1)
			aClass696_3379.method14248(class527_sub38, -1365006935);
		if (null != aClass327_3354 && 1 == (i_25_ >> 6 & 0x1))
			aClass327_3354.method5786(class527_sub38, 1454982585);
		if (i != -441238943 * class527_sub38.anInt10689 - i_24_)
			throw new RuntimeException(new StringBuilder().append(-441238943 * (class527_sub38.anInt10689) - i_24_).append(",").append(i).toString());
	}

	public void method15691(RSByteBuffer class527_sub38, int i, int i_32_) {
		int i_33_ = -441238943 * class527_sub38.anInt10689;
		int i_34_ = class527_sub38.readUnsignedByte();
		method5345(Class235.method4352(i_34_ & 0x1, 1889814933), -1994466696);
		if (0 != (i_34_ & 0x8)) {
			Class309 class309 = Class535.method8981(class527_sub38.readUnsignedByte(), -924855818);
			if (aClass309_3376 != class309) {
				try {
					method5346(class309, true, 1032920337);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_34_ & 0x10) != 0) {
			Class301 class301 = Class465.method7647(class527_sub38.readUnsignedByte(), 1086659564);
			if (class301 != aClass301_3353) {
				try {
					method5347(class301, true, 829342460);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_34_ >> 7 & 0x1) == 1) {
			int i_35_ = class527_sub38.readUnsignedShort();
			if ((i_35_ >> 569926703 * Class291.aClass291_3238.anInt3249 & 0x1) == 1)
				aClass442_3358.method7144(class527_sub38);
			if ((i_35_ >> Class291.aClass291_3235.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3366.method7144(class527_sub38);
			if ((i_35_ >> 569926703 * Class291.aClass291_3236.anInt3249 & 0x1) == 1)
				aClass442_3362.method7144(class527_sub38);
			if ((i_35_ >> Class291.aClass291_3237.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3363.method7144(class527_sub38);
			if (1 == (i_35_ >> 569926703 * Class291.aClass291_3242.anInt3249 & 0x1)) {
				aFloat3374 = class527_sub38.readFloat(-1016855642);
				aFloat3375 = class527_sub38.readFloat(-1812668041);
			}
			if (1 == (i_35_ >> Class291.aClass291_3239.anInt3249 * 569926703 & 0x1)) {
				aFloat3378 = class527_sub38.readFloat(-1344253389);
				aFloat3382 = class527_sub38.readFloat(-577142858);
			}
			if ((i_35_ >> 569926703 * Class291.aClass291_3240.anInt3249 & 0x1) == 1)
				aClass307_3350 = Class606.method10060(class527_sub38.readUnsignedByte(), 578380892);
			if ((i_35_ >> 569926703 * Class291.aClass291_3234.anInt3249 & 0x1) == 1) {
				anInt3357 = class527_sub38.read24BitUnsignedInteger(1617265411) * -203768969;
				class527_sub38.readUnsignedByte();
			}
			if (1 == (i_35_ >> Class291.aClass291_3246.anInt3249 * 569926703 & 0x1)) {
				int i_36_ = class527_sub38.readUnsignedByte();
				aBool3380 = 1 == (i_36_ & 0x1);
				aBool3359 = (i_36_ & 0x2) == 2;
			}
			if ((i_35_ >> 569926703 * Class291.aClass291_3243.anInt3249 & 0x1) == 1) {
				int i_37_ = class527_sub38.readUnsignedByte();
				for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
					int i_39_ = class527_sub38.readUnsignedByte();
					int i_40_ = class527_sub38.readUnsignedByte();
					if (0 == i_39_)
						method5366(i_40_, 1605805335);
					else {
						Class270 class270 = Class433.method6966(class527_sub38.readUnsignedByte(), -399469140);
						boolean bool = true;
						Iterator iterator = aClass14_3360.iterator();
						while (iterator.hasNext()) {
							Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
							if (i_40_ == (class527_sub8_sub15.anInt11779 * 575434551)) {
								class527_sub8_sub15.method18355(class527_sub38, -1821529963);
								bool = false;
								break;
							}
						}
						if (bool)
							method5445(Class526.method8734(i_40_, class270, class527_sub38, (byte) 72), 453078388);
					}
				}
			}
			if (1 == (i_35_ >> 569926703 * Class291.aClass291_3245.anInt3249 & 0x1)) {
				anInt3348 = class527_sub38.readUnsignedShort() * -1096148605;
				aFloat3383 = class527_sub38.readFloat(-1243911515);
			}
			if (1 == (i_35_ >> 569926703 * Class291.aClass291_3247.anInt3249 & 0x1))
				aClass303_3356 = Class622.method10234(class527_sub38.readUnsignedByte(), 653789231);
			if ((i_35_ >> 569926703 * Class291.aClass291_3241.anInt3249 & 0x1) == 1) {
				aClass442_3370.method7144(class527_sub38);
				aClass442_3371.method7144(class527_sub38);
				aFloat3381 = class527_sub38.readFloat(-1964478521);
				aFloat3373 = class527_sub38.readFloat(-828576403);
			}
			if (1 == (i_35_ >> Class291.aClass291_3248.anInt3249 * 569926703 & 0x1))
				class527_sub38.readFloat(-161335438);
			if (1 == (i_35_ >> Class291.aClass291_3244.anInt3249 * 569926703 & 0x1))
				aFloat3372 = class527_sub38.readFloat(-1066298534);
		}
		if (aClass696_3379 != null && (i_34_ >> 5 & 0x1) == 1)
			aClass696_3379.method14248(class527_sub38, -196317207);
		if (null != aClass327_3354 && 1 == (i_34_ >> 6 & 0x1))
			aClass327_3354.method5786(class527_sub38, 1227035536);
		if (i != -441238943 * class527_sub38.anInt10689 - i_33_)
			throw new RuntimeException(new StringBuilder().append(-441238943 * (class527_sub38.anInt10689) - i_33_).append(",").append(i).toString());
	}

	public void method15692(RSByteBuffer class527_sub38, int i) {
		int i_41_ = -441238943 * class527_sub38.anInt10689;
		int i_42_ = class527_sub38.readUnsignedByte();
		method5345(Class235.method4352(i_42_ & 0x1, 1570744248), 1419842885);
		if (0 != (i_42_ & 0x8)) {
			Class309 class309 = Class535.method8981(class527_sub38.readUnsignedByte(), -1846256214);
			if (aClass309_3376 != class309) {
				try {
					method5346(class309, true, 1032920337);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_42_ & 0x10) != 0) {
			Class301 class301 = Class465.method7647(class527_sub38.readUnsignedByte(), 1086659564);
			if (class301 != aClass301_3353) {
				try {
					method5347(class301, true, 838136335);
				} catch (Exception_Sub6 exception_sub6) {
					exception_sub6.printStackTrace();
				}
			}
		}
		if ((i_42_ >> 7 & 0x1) == 1) {
			int i_43_ = class527_sub38.readUnsignedShort();
			if ((i_43_ >> 569926703 * Class291.aClass291_3238.anInt3249 & 0x1) == 1)
				aClass442_3358.method7144(class527_sub38);
			if ((i_43_ >> Class291.aClass291_3235.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3366.method7144(class527_sub38);
			if ((i_43_ >> 569926703 * Class291.aClass291_3236.anInt3249 & 0x1) == 1)
				aClass442_3362.method7144(class527_sub38);
			if ((i_43_ >> Class291.aClass291_3237.anInt3249 * 569926703 & 0x1) == 1)
				aClass442_3363.method7144(class527_sub38);
			if (1 == (i_43_ >> 569926703 * Class291.aClass291_3242.anInt3249 & 0x1)) {
				aFloat3374 = class527_sub38.readFloat(-835232195);
				aFloat3375 = class527_sub38.readFloat(-39393049);
			}
			if (1 == (i_43_ >> Class291.aClass291_3239.anInt3249 * 569926703 & 0x1)) {
				aFloat3378 = class527_sub38.readFloat(-1077038864);
				aFloat3382 = class527_sub38.readFloat(-1999793355);
			}
			if ((i_43_ >> 569926703 * Class291.aClass291_3240.anInt3249 & 0x1) == 1)
				aClass307_3350 = Class606.method10060(class527_sub38.readUnsignedByte(), -447324275);
			if ((i_43_ >> 569926703 * Class291.aClass291_3234.anInt3249 & 0x1) == 1) {
				anInt3357 = class527_sub38.read24BitUnsignedInteger(700558523) * -203768969;
				class527_sub38.readUnsignedByte();
			}
			if (1 == (i_43_ >> Class291.aClass291_3246.anInt3249 * 569926703 & 0x1)) {
				int i_44_ = class527_sub38.readUnsignedByte();
				aBool3380 = 1 == (i_44_ & 0x1);
				aBool3359 = (i_44_ & 0x2) == 2;
			}
			if ((i_43_ >> 569926703 * Class291.aClass291_3243.anInt3249 & 0x1) == 1) {
				int i_45_ = class527_sub38.readUnsignedByte();
				for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
					int i_47_ = class527_sub38.readUnsignedByte();
					int i_48_ = class527_sub38.readUnsignedByte();
					if (0 == i_47_)
						method5366(i_48_, 1783618631);
					else {
						Class270 class270 = Class433.method6966(class527_sub38.readUnsignedByte(), -606196853);
						boolean bool = true;
						Iterator iterator = aClass14_3360.iterator();
						while (iterator.hasNext()) {
							Class527_Sub8_Sub15 class527_sub8_sub15 = (Class527_Sub8_Sub15) iterator.next();
							if (i_48_ == (class527_sub8_sub15.anInt11779 * 575434551)) {
								class527_sub8_sub15.method18355(class527_sub38, -354805131);
								bool = false;
								break;
							}
						}
						if (bool)
							method5445(Class526.method8734(i_48_, class270, class527_sub38, (byte) 100), 1799606032);
					}
				}
			}
			if (1 == (i_43_ >> 569926703 * Class291.aClass291_3245.anInt3249 & 0x1)) {
				anInt3348 = class527_sub38.readUnsignedShort() * -1096148605;
				aFloat3383 = class527_sub38.readFloat(-410356255);
			}
			if (1 == (i_43_ >> 569926703 * Class291.aClass291_3247.anInt3249 & 0x1))
				aClass303_3356 = Class622.method10234(class527_sub38.readUnsignedByte(), 903320832);
			if ((i_43_ >> 569926703 * Class291.aClass291_3241.anInt3249 & 0x1) == 1) {
				aClass442_3370.method7144(class527_sub38);
				aClass442_3371.method7144(class527_sub38);
				aFloat3381 = class527_sub38.readFloat(-560571781);
				aFloat3373 = class527_sub38.readFloat(-1741707061);
			}
			if (1 == (i_43_ >> Class291.aClass291_3248.anInt3249 * 569926703 & 0x1))
				class527_sub38.readFloat(-707586250);
			if (1 == (i_43_ >> Class291.aClass291_3244.anInt3249 * 569926703 & 0x1))
				aFloat3372 = class527_sub38.readFloat(-2027221589);
		}
		if (aClass696_3379 != null && (i_42_ >> 5 & 0x1) == 1)
			aClass696_3379.method14248(class527_sub38, -1816062598);
		if (null != aClass327_3354 && 1 == (i_42_ >> 6 & 0x1))
			aClass327_3354.method5786(class527_sub38, 580208780);
		if (i != -441238943 * class527_sub38.anInt10689 - i_41_)
			throw new RuntimeException(new StringBuilder().append(-441238943 * (class527_sub38.anInt10689) - i_41_).append(",").append(i).toString());
	}

	public static int method15693(short i) {
		if (Class597.aTwitchEventLiveStreams7849 == null || (490422869 * Class585.anInt7708 >= Class597.aTwitchEventLiveStreams7849.streamCount - 1))
			return -1;
		return (Class585.anInt7708 += -640177411) * 490422869;
	}

	static final void method15694(int i) {
		client.anInt11245 = -5641215;
		client.anInt11080 = -1474990351;
		Class213.aClass527_Sub38_2261 = null;
		Class263.method4963(996331156);
	}

	static void method15695(Class243[] class243s, Class243 class243, boolean bool, int i) {
		int i_49_ = (class243.anInt2525 * 1620847621 != 0 ? class243.anInt2525 * 1620847621 : class243.anInt2511 * -1054537975);
		int i_50_ = (1847049763 * class243.anInt2526 != 0 ? class243.anInt2526 * 1847049763 : -1386504031 * class243.anInt2514);
		Class384.method6421(class243s, -254728301 * class243.anInt2504, i_49_, i_50_, bool, (short) 13923);
		if (null != class243.aClass243Array2666)
			Class384.method6421(class243.aClass243Array2666, class243.anInt2504 * -254728301, i_49_, i_50_, bool, (short) -10577);
		Class527_Sub41 class527_sub41 = ((Class527_Sub41) client.aClass14_11276.method709((long) (-254728301 * class243.anInt2504)));
		if (class527_sub41 != null)
			Class628.method10415(1307137747 * class527_sub41.anInt10752, i_49_, i_50_, bool, (byte) 102);
		if (client.aClass243_11201 == class243) {
			int i_51_ = Class105.anInt1300 * 351100807;
			int[] is = Class105.anIntArray1301;
			for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
				Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_52_]]);
				if (null != class640_sub1_sub2_sub1_sub2)
					class640_sub1_sub2_sub1_sub2.method18624(i_49_, i_50_, bool, -2023571193);
			}
			for (int i_53_ = 0; i_53_ < -1599561389 * client.anInt11059; i_53_++) {
				int i_54_ = client.anIntArray11021[i_53_];
				Class527_Sub26 class527_sub26 = ((Class527_Sub26) client.aClass14_10989.method709((long) i_54_));
				if (class527_sub26 != null)
					((Class640_Sub1_Sub2_Sub1) class527_sub26.anObject10522).method18624(i_49_, i_50_, bool, -1055725505);
			}
		}
	}

	static final void method15696(Class665 class665, int i) {
		int i_55_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub34_10599.method14289(i_55_, 441947034);
	}
}
