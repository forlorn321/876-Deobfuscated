/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class128 {
	boolean aBool1532 = true;
	static final int anInt1533 = 128;
	Class180_Sub3 aClass180_Sub3_1534;
	int anInt1535;
	int anInt1536;
	static final int anInt1537 = 7;
	Class141 aClass141_1538;
	int anInt1539 = -1;
	int anInt1540;
	Interface17 anInterface17_1541;
	Class131_Sub1 aClass131_Sub1_1542;
	Class118_Sub3 aClass118_Sub3_1543;

	void method2165(Interface17 interface17, int i) {
		if (i != 0) {
			method2169();
			aClass180_Sub3_1534.method15401(aClass118_Sub3_1543);
			aClass180_Sub3_1534.method15433(interface17, 4, 0, i);
		}
	}

	void method2166() {
		method2174(anInterface17_1541, anInt1540);
	}

	void method2167(byte[] is, int i) {
		aClass131_Sub1_1542.method98(5123, is, i * 2);
		method2174(aClass131_Sub1_1542, i);
	}

	void method2168() {
		if (aBool1532) {
			aBool1532 = false;
			byte[] is = aClass141_1538.aByteArray1650;
			byte[] is_0_ = aClass180_Sub3_1534.aByteArray9733;
			int i = 0;
			int i_1_ = aClass141_1538.anInt1649;
			int i_2_ = anInt1536 + anInt1535 * aClass141_1538.anInt1649;
			for (int i_3_ = -128; i_3_ < 0; i_3_++) {
				i = (i << 8) - i;
				for (int i_4_ = -128; i_4_ < 0; i_4_++) {
					if (is[i_2_++] != 0)
						i++;
				}
				i_2_ += i_1_ - 128;
			}
			if (aClass118_Sub3_1543 != null && anInt1539 == i)
				aBool1532 = false;
			else {
				anInt1539 = i;
				int i_5_ = 0;
				i_2_ = anInt1536 + anInt1535 * i_1_;
				for (int i_6_ = -128; i_6_ < 0; i_6_++) {
					for (int i_7_ = -128; i_7_ < 0; i_7_++) {
						if (is[i_2_] != 0)
							is_0_[i_5_++] = (byte) 68;
						else {
							int i_8_ = 0;
							if (is[i_2_ - 1] != 0)
								i_8_++;
							if (is[i_2_ + 1] != 0)
								i_8_++;
							if (is[i_2_ - i_1_] != 0)
								i_8_++;
							if (is[i_2_ + i_1_] != 0)
								i_8_++;
							is_0_[i_5_++] = (byte) (17 * i_8_);
						}
						i_2_++;
					}
					i_2_ += aClass141_1538.anInt1649 - 128;
				}
				if (aClass118_Sub3_1543 == null) {
					aClass118_Sub3_1543 = new Class118_Sub3(aClass180_Sub3_1534, 3553, Class157.aClass157_1724, Class184.aClass184_2104, 128, 128, false, aClass180_Sub3_1534.aByteArray9733, Class157.aClass157_1724, false);
					aClass118_Sub3_1543.method14450(false, false);
					aClass118_Sub3_1543.method2035(true);
				} else
					aClass118_Sub3_1543.method14455(0, 0, 128, 128, (aClass180_Sub3_1534.aByteArray9733), Class157.aClass157_1724, 0, 0, false);
			}
		}
	}

	void method2169() {
		if (aBool1532) {
			aBool1532 = false;
			byte[] is = aClass141_1538.aByteArray1650;
			byte[] is_9_ = aClass180_Sub3_1534.aByteArray9733;
			int i = 0;
			int i_10_ = aClass141_1538.anInt1649;
			int i_11_ = anInt1536 + anInt1535 * aClass141_1538.anInt1649;
			for (int i_12_ = -128; i_12_ < 0; i_12_++) {
				i = (i << 8) - i;
				for (int i_13_ = -128; i_13_ < 0; i_13_++) {
					if (is[i_11_++] != 0)
						i++;
				}
				i_11_ += i_10_ - 128;
			}
			if (aClass118_Sub3_1543 != null && anInt1539 == i)
				aBool1532 = false;
			else {
				anInt1539 = i;
				int i_14_ = 0;
				i_11_ = anInt1536 + anInt1535 * i_10_;
				for (int i_15_ = -128; i_15_ < 0; i_15_++) {
					for (int i_16_ = -128; i_16_ < 0; i_16_++) {
						if (is[i_11_] != 0)
							is_9_[i_14_++] = (byte) 68;
						else {
							int i_17_ = 0;
							if (is[i_11_ - 1] != 0)
								i_17_++;
							if (is[i_11_ + 1] != 0)
								i_17_++;
							if (is[i_11_ - i_10_] != 0)
								i_17_++;
							if (is[i_11_ + i_10_] != 0)
								i_17_++;
							is_9_[i_14_++] = (byte) (17 * i_17_);
						}
						i_11_++;
					}
					i_11_ += aClass141_1538.anInt1649 - 128;
				}
				if (aClass118_Sub3_1543 == null) {
					aClass118_Sub3_1543 = new Class118_Sub3(aClass180_Sub3_1534, 3553, Class157.aClass157_1724, Class184.aClass184_2104, 128, 128, false, aClass180_Sub3_1534.aByteArray9733, Class157.aClass157_1724, false);
					aClass118_Sub3_1543.method14450(false, false);
					aClass118_Sub3_1543.method2035(true);
				} else
					aClass118_Sub3_1543.method14455(0, 0, 128, 128, (aClass180_Sub3_1534.aByteArray9733), Class157.aClass157_1724, 0, 0, false);
			}
		}
	}

	void method2170(byte[] is, int i) {
		aClass131_Sub1_1542.method98(5123, is, i * 2);
		method2174(aClass131_Sub1_1542, i);
	}

	void method2171(byte[] is, int i) {
		aClass131_Sub1_1542.method98(5123, is, i * 2);
		method2174(aClass131_Sub1_1542, i);
	}

	void method2172(byte[] is, int i) {
		aClass131_Sub1_1542.method98(5123, is, i * 2);
		method2174(aClass131_Sub1_1542, i);
	}

	void method2173() {
		if (aBool1532) {
			aBool1532 = false;
			byte[] is = aClass141_1538.aByteArray1650;
			byte[] is_18_ = aClass180_Sub3_1534.aByteArray9733;
			int i = 0;
			int i_19_ = aClass141_1538.anInt1649;
			int i_20_ = anInt1536 + anInt1535 * aClass141_1538.anInt1649;
			for (int i_21_ = -128; i_21_ < 0; i_21_++) {
				i = (i << 8) - i;
				for (int i_22_ = -128; i_22_ < 0; i_22_++) {
					if (is[i_20_++] != 0)
						i++;
				}
				i_20_ += i_19_ - 128;
			}
			if (aClass118_Sub3_1543 != null && anInt1539 == i)
				aBool1532 = false;
			else {
				anInt1539 = i;
				int i_23_ = 0;
				i_20_ = anInt1536 + anInt1535 * i_19_;
				for (int i_24_ = -128; i_24_ < 0; i_24_++) {
					for (int i_25_ = -128; i_25_ < 0; i_25_++) {
						if (is[i_20_] != 0)
							is_18_[i_23_++] = (byte) 68;
						else {
							int i_26_ = 0;
							if (is[i_20_ - 1] != 0)
								i_26_++;
							if (is[i_20_ + 1] != 0)
								i_26_++;
							if (is[i_20_ - i_19_] != 0)
								i_26_++;
							if (is[i_20_ + i_19_] != 0)
								i_26_++;
							is_18_[i_23_++] = (byte) (17 * i_26_);
						}
						i_20_++;
					}
					i_20_ += aClass141_1538.anInt1649 - 128;
				}
				if (aClass118_Sub3_1543 == null) {
					aClass118_Sub3_1543 = new Class118_Sub3(aClass180_Sub3_1534, 3553, Class157.aClass157_1724, Class184.aClass184_2104, 128, 128, false, aClass180_Sub3_1534.aByteArray9733, Class157.aClass157_1724, false);
					aClass118_Sub3_1543.method14450(false, false);
					aClass118_Sub3_1543.method2035(true);
				} else
					aClass118_Sub3_1543.method14455(0, 0, 128, 128, (aClass180_Sub3_1534.aByteArray9733), Class157.aClass157_1724, 0, 0, false);
			}
		}
	}

	void method2174(Interface17 interface17, int i) {
		if (i != 0) {
			method2169();
			aClass180_Sub3_1534.method15401(aClass118_Sub3_1543);
			aClass180_Sub3_1534.method15433(interface17, 4, 0, i);
		}
	}

	Class128(Class180_Sub3 class180_sub3, Class141 class141, Class161_Sub2 class161_sub2, int i, int i_27_, int i_28_, int i_29_, int i_30_) {
		aClass180_Sub3_1534 = class180_sub3;
		aClass141_1538 = class141;
		anInt1536 = i_29_;
		anInt1535 = i_30_;
		int i_31_ = 1 << i_28_;
		int i_32_ = 0;
		int i_33_ = i << i_28_;
		int i_34_ = i_27_ << i_28_;
		for (int i_35_ = 0; i_35_ < i_31_; i_35_++) {
			int i_36_ = ((i_34_ + i_35_) * (class161_sub2.anInt1750 * 1210322533) + i_33_);
			for (int i_37_ = 0; i_37_ < i_31_; i_37_++) {
				short[] is = class161_sub2.aShortArrayArray9261[i_36_++];
				if (is != null)
					i_32_ += is.length;
			}
		}
		anInt1540 = i_32_;
		if (i_32_ > 0) {
			RSByteBuffer class527_sub38 = new RSByteBuffer(i_32_ * 2);
			if (aClass180_Sub3_1534.aBool9788) {
				for (int i_38_ = 0; i_38_ < i_31_; i_38_++) {
					int i_39_ = ((i_34_ + i_38_) * (class161_sub2.anInt1750 * 1210322533) + i_33_);
					for (int i_40_ = 0; i_40_ < i_31_; i_40_++) {
						short[] is = class161_sub2.aShortArrayArray9261[i_39_++];
						if (is != null) {
							for (int i_41_ = 0; i_41_ < is.length; i_41_++)
								class527_sub38.writeShort(is[i_41_] & 0xffff, 1404835786);
						}
					}
				}
			} else {
				for (int i_42_ = 0; i_42_ < i_31_; i_42_++) {
					int i_43_ = ((i_34_ + i_42_) * (class161_sub2.anInt1750 * 1210322533) + i_33_);
					for (int i_44_ = 0; i_44_ < i_31_; i_44_++) {
						short[] is = class161_sub2.aShortArrayArray9261[i_43_++];
						if (is != null) {
							for (int i_45_ = 0; i_45_ < is.length; i_45_++)
								class527_sub38.writeShortLE(is[i_45_] & 0xffff, 1830089739);
						}
					}
				}
			}
			anInterface17_1541 = aClass180_Sub3_1534.method15434(5123, (class527_sub38.buffer), (class527_sub38.anInt10689 * -441238943), false);
			aClass131_Sub1_1542 = new Class131_Sub1(aClass180_Sub3_1534, 5123, null, 1);
		} else
			aClass118_Sub3_1543 = null;
	}

	void method2175() {
		if (aBool1532) {
			aBool1532 = false;
			byte[] is = aClass141_1538.aByteArray1650;
			byte[] is_46_ = aClass180_Sub3_1534.aByteArray9733;
			int i = 0;
			int i_47_ = aClass141_1538.anInt1649;
			int i_48_ = anInt1536 + anInt1535 * aClass141_1538.anInt1649;
			for (int i_49_ = -128; i_49_ < 0; i_49_++) {
				i = (i << 8) - i;
				for (int i_50_ = -128; i_50_ < 0; i_50_++) {
					if (is[i_48_++] != 0)
						i++;
				}
				i_48_ += i_47_ - 128;
			}
			if (aClass118_Sub3_1543 != null && anInt1539 == i)
				aBool1532 = false;
			else {
				anInt1539 = i;
				int i_51_ = 0;
				i_48_ = anInt1536 + anInt1535 * i_47_;
				for (int i_52_ = -128; i_52_ < 0; i_52_++) {
					for (int i_53_ = -128; i_53_ < 0; i_53_++) {
						if (is[i_48_] != 0)
							is_46_[i_51_++] = (byte) 68;
						else {
							int i_54_ = 0;
							if (is[i_48_ - 1] != 0)
								i_54_++;
							if (is[i_48_ + 1] != 0)
								i_54_++;
							if (is[i_48_ - i_47_] != 0)
								i_54_++;
							if (is[i_48_ + i_47_] != 0)
								i_54_++;
							is_46_[i_51_++] = (byte) (17 * i_54_);
						}
						i_48_++;
					}
					i_48_ += aClass141_1538.anInt1649 - 128;
				}
				if (aClass118_Sub3_1543 == null) {
					aClass118_Sub3_1543 = new Class118_Sub3(aClass180_Sub3_1534, 3553, Class157.aClass157_1724, Class184.aClass184_2104, 128, 128, false, aClass180_Sub3_1534.aByteArray9733, Class157.aClass157_1724, false);
					aClass118_Sub3_1543.method14450(false, false);
					aClass118_Sub3_1543.method2035(true);
				} else
					aClass118_Sub3_1543.method14455(0, 0, 128, 128, (aClass180_Sub3_1534.aByteArray9733), Class157.aClass157_1724, 0, 0, false);
			}
		}
	}
}
