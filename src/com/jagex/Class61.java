/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class61 {
	public int anInt725;
	int anInt726;

	public boolean method1382(int i, int i_0_, int i_1_) {
		int i_2_ = anInt726 * 363254439;
		if (i == 1085423875 * anInt725 && anInt726 * 363254439 == 0)
			return false;
		boolean bool;
		if (0 == 363254439 * anInt726) {
			if (i > anInt725 * 1085423875 && i <= i_0_ + 1085423875 * anInt725 || (i < 1085423875 * anInt725 && i >= 1085423875 * anInt725 - i_0_)) {
				anInt725 = i * -830525013;
				return false;
			}
			bool = true;
		} else if (anInt726 * 363254439 > 0 && i > anInt725 * 1085423875) {
			int i_3_ = anInt726 * 363254439 * (anInt726 * 363254439) / (i_0_ * 2);
			int i_4_ = anInt725 * 1085423875 + i_3_;
			if (i_4_ >= i || i_4_ < anInt725 * 1085423875)
				bool = false;
			else
				bool = true;
		} else if (363254439 * anInt726 < 0 && i < 1085423875 * anInt725) {
			int i_5_ = anInt726 * 363254439 * (363254439 * anInt726) / (2 * i_0_);
			int i_6_ = anInt725 * 1085423875 - i_5_;
			if (i_6_ <= i || i_6_ > anInt725 * 1085423875)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 1085423875 * anInt725) {
				anInt726 += i_0_ * -575294185;
				if (0 != i_1_ && anInt726 * 363254439 > i_1_)
					anInt726 = -575294185 * i_1_;
			} else {
				anInt726 -= -575294185 * i_0_;
				if (0 != i_1_ && anInt726 * 363254439 < -i_1_)
					anInt726 = -i_1_ * -575294185;
			}
			if (363254439 * anInt726 != i_2_) {
				int i_7_ = (anInt726 * 363254439 * (anInt726 * 363254439) / (i_0_ * 2));
				if (i > 1085423875 * anInt725) {
					if (i_7_ + 1085423875 * anInt725 > i)
						anInt726 = -575294185 * i_2_;
				} else if (i < 1085423875 * anInt725 && 1085423875 * anInt725 - i_7_ < i)
					anInt726 = -575294185 * i_2_;
			}
		} else if (anInt726 * 363254439 > 0) {
			anInt726 -= -575294185 * i_0_;
			if (anInt726 * 363254439 < 0)
				anInt726 = 0;
		} else {
			anInt726 += i_0_ * -575294185;
			if (anInt726 * 363254439 > 0)
				anInt726 = 0;
		}
		anInt725 += (363254439 * anInt726 + i_2_ >> 1) * -830525013;
		return bool;
	}

	public void method1383(int i, int i_8_) {
		anInt725 = i * -830525013;
		anInt726 = 0;
	}

	public int method1384(byte i) {
		return anInt725 * 1085423875 & 0x3fff;
	}

	public void method1385(byte i) {
		anInt725 = -830525013 * (1085423875 * anInt725 & 0x3fff);
	}

	public boolean method1386(int i, int i_9_, int i_10_) {
		int i_11_ = anInt726 * 363254439;
		if (i == 1085423875 * anInt725 && anInt726 * 363254439 == 0)
			return false;
		boolean bool;
		if (0 == 363254439 * anInt726) {
			if (i > anInt725 * 1085423875 && i <= i_9_ + 1085423875 * anInt725 || (i < 1085423875 * anInt725 && i >= 1085423875 * anInt725 - i_9_)) {
				anInt725 = i * -830525013;
				return false;
			}
			bool = true;
		} else if (anInt726 * 363254439 > 0 && i > anInt725 * 1085423875) {
			int i_12_ = anInt726 * 363254439 * (anInt726 * 363254439) / (i_9_ * 2);
			int i_13_ = anInt725 * 1085423875 + i_12_;
			if (i_13_ >= i || i_13_ < anInt725 * 1085423875)
				bool = false;
			else
				bool = true;
		} else if (363254439 * anInt726 < 0 && i < 1085423875 * anInt725) {
			int i_14_ = anInt726 * 363254439 * (363254439 * anInt726) / (2 * i_9_);
			int i_15_ = anInt725 * 1085423875 - i_14_;
			if (i_15_ <= i || i_15_ > anInt725 * 1085423875)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 1085423875 * anInt725) {
				anInt726 += i_9_ * -575294185;
				if (0 != i_10_ && anInt726 * 363254439 > i_10_)
					anInt726 = -575294185 * i_10_;
			} else {
				anInt726 -= -575294185 * i_9_;
				if (0 != i_10_ && anInt726 * 363254439 < -i_10_)
					anInt726 = -i_10_ * -575294185;
			}
			if (363254439 * anInt726 != i_11_) {
				int i_16_ = (anInt726 * 363254439 * (anInt726 * 363254439) / (i_9_ * 2));
				if (i > 1085423875 * anInt725) {
					if (i_16_ + 1085423875 * anInt725 > i)
						anInt726 = -575294185 * i_11_;
				} else if (i < 1085423875 * anInt725 && 1085423875 * anInt725 - i_16_ < i)
					anInt726 = -575294185 * i_11_;
			}
		} else if (anInt726 * 363254439 > 0) {
			anInt726 -= -575294185 * i_9_;
			if (anInt726 * 363254439 < 0)
				anInt726 = 0;
		} else {
			anInt726 += i_9_ * -575294185;
			if (anInt726 * 363254439 > 0)
				anInt726 = 0;
		}
		anInt725 += (363254439 * anInt726 + i_11_ >> 1) * -830525013;
		return bool;
	}

	public void method1387(int i) {
		anInt725 = i * -830525013;
		anInt726 = 0;
	}

	public boolean method1388(int i, int i_17_, int i_18_) {
		int i_19_ = anInt726 * 363254439;
		if (i == 1085423875 * anInt725 && anInt726 * 363254439 == 0)
			return false;
		boolean bool;
		if (0 == 363254439 * anInt726) {
			if (i > anInt725 * 1085423875 && i <= i_17_ + 1085423875 * anInt725 || (i < 1085423875 * anInt725 && i >= 1085423875 * anInt725 - i_17_)) {
				anInt725 = i * -830525013;
				return false;
			}
			bool = true;
		} else if (anInt726 * 363254439 > 0 && i > anInt725 * 1085423875) {
			int i_20_ = anInt726 * 363254439 * (anInt726 * 363254439) / (i_17_ * 2);
			int i_21_ = anInt725 * 1085423875 + i_20_;
			if (i_21_ >= i || i_21_ < anInt725 * 1085423875)
				bool = false;
			else
				bool = true;
		} else if (363254439 * anInt726 < 0 && i < 1085423875 * anInt725) {
			int i_22_ = anInt726 * 363254439 * (363254439 * anInt726) / (2 * i_17_);
			int i_23_ = anInt725 * 1085423875 - i_22_;
			if (i_23_ <= i || i_23_ > anInt725 * 1085423875)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 1085423875 * anInt725) {
				anInt726 += i_17_ * -575294185;
				if (0 != i_18_ && anInt726 * 363254439 > i_18_)
					anInt726 = -575294185 * i_18_;
			} else {
				anInt726 -= -575294185 * i_17_;
				if (0 != i_18_ && anInt726 * 363254439 < -i_18_)
					anInt726 = -i_18_ * -575294185;
			}
			if (363254439 * anInt726 != i_19_) {
				int i_24_ = (anInt726 * 363254439 * (anInt726 * 363254439) / (i_17_ * 2));
				if (i > 1085423875 * anInt725) {
					if (i_24_ + 1085423875 * anInt725 > i)
						anInt726 = -575294185 * i_19_;
				} else if (i < 1085423875 * anInt725 && 1085423875 * anInt725 - i_24_ < i)
					anInt726 = -575294185 * i_19_;
			}
		} else if (anInt726 * 363254439 > 0) {
			anInt726 -= -575294185 * i_17_;
			if (anInt726 * 363254439 < 0)
				anInt726 = 0;
		} else {
			anInt726 += i_17_ * -575294185;
			if (anInt726 * 363254439 > 0)
				anInt726 = 0;
		}
		anInt725 += (363254439 * anInt726 + i_19_ >> 1) * -830525013;
		return bool;
	}

	public boolean method1389(int i, int i_25_, int i_26_, int i_27_) {
		int i_28_ = anInt726 * 363254439;
		if (i == 1085423875 * anInt725 && anInt726 * 363254439 == 0)
			return false;
		boolean bool;
		if (0 == 363254439 * anInt726) {
			if (i > anInt725 * 1085423875 && i <= i_25_ + 1085423875 * anInt725 || (i < 1085423875 * anInt725 && i >= 1085423875 * anInt725 - i_25_)) {
				anInt725 = i * -830525013;
				return false;
			}
			bool = true;
		} else if (anInt726 * 363254439 > 0 && i > anInt725 * 1085423875) {
			int i_29_ = anInt726 * 363254439 * (anInt726 * 363254439) / (i_25_ * 2);
			int i_30_ = anInt725 * 1085423875 + i_29_;
			if (i_30_ >= i || i_30_ < anInt725 * 1085423875)
				bool = false;
			else
				bool = true;
		} else if (363254439 * anInt726 < 0 && i < 1085423875 * anInt725) {
			int i_31_ = anInt726 * 363254439 * (363254439 * anInt726) / (2 * i_25_);
			int i_32_ = anInt725 * 1085423875 - i_31_;
			if (i_32_ <= i || i_32_ > anInt725 * 1085423875)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 1085423875 * anInt725) {
				anInt726 += i_25_ * -575294185;
				if (0 != i_26_ && anInt726 * 363254439 > i_26_)
					anInt726 = -575294185 * i_26_;
			} else {
				anInt726 -= -575294185 * i_25_;
				if (0 != i_26_ && anInt726 * 363254439 < -i_26_)
					anInt726 = -i_26_ * -575294185;
			}
			if (363254439 * anInt726 != i_28_) {
				int i_33_ = (anInt726 * 363254439 * (anInt726 * 363254439) / (i_25_ * 2));
				if (i > 1085423875 * anInt725) {
					if (i_33_ + 1085423875 * anInt725 > i)
						anInt726 = -575294185 * i_28_;
				} else if (i < 1085423875 * anInt725 && 1085423875 * anInt725 - i_33_ < i)
					anInt726 = -575294185 * i_28_;
			}
		} else if (anInt726 * 363254439 > 0) {
			anInt726 -= -575294185 * i_25_;
			if (anInt726 * 363254439 < 0)
				anInt726 = 0;
		} else {
			anInt726 += i_25_ * -575294185;
			if (anInt726 * 363254439 > 0)
				anInt726 = 0;
		}
		anInt725 += (363254439 * anInt726 + i_28_ >> 1) * -830525013;
		return bool;
	}

	public int method1390() {
		return anInt725 * 1085423875 & 0x3fff;
	}

	public int method1391() {
		return anInt725 * 1085423875 & 0x3fff;
	}

	public int method1392() {
		return anInt725 * 1085423875 & 0x3fff;
	}

	public void method1393() {
		anInt725 = -830525013 * (1085423875 * anInt725 & 0x3fff);
	}

	public static void method1394(short i) {
		Class585.aClass147_7688 = null;
	}

	static final void method1395(Class665 class665, byte i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class387.method6441((byte) -72);
		if (class527_sub8_sub12 != null) {
			boolean bool = (class527_sub8_sub12.method18302(-502443805 * Class529_Sub1.anInt10783 + Class529.anInt7137, Class635.anInt8302 * 1891819005 + Class529.anInt7138, Class666.anIntArray8556, 1312560541));
			if (bool) {
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class666.anIntArray8556[1];
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class666.anIntArray8556[2];
			} else {
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
				class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			}
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		}
	}
}
