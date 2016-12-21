/* Class649_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class649_Sub1_Sub3 extends Class649_Sub1 {
	public static final int anInt11780 = 64;
	public static final int anInt11781 = 2;
	public static final int anInt11782 = 4;
	int anInt11783 = 0;
	public static final int anInt11784 = 16;
	public static final int anInt11785 = 32;
	Class536_Sub19[] aClass536_Sub19Array11786 = new Class536_Sub19[4];
	public static final int anInt11787 = 128;
	static int[] anIntArray11788 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	public short aShort11789;
	public static final int anInt11790 = 1;
	public static final int anInt11791 = 8;

	int method9959(Class536_Sub19[] class536_sub19s, byte i) {
		if (aBool8468) {
			Class436 class436 = method7837().aClass436_4823;
			int i_0_ = ((int) class436.aFloat4850 >> aClass553_10838.anInt7444 * 1893698405);
			int i_1_ = ((int) class436.aFloat4853 >> 1893698405 * aClass553_10838.anInt7444);
			int i_2_ = 0;
			if (-1629030593 * aClass553_10838.anInt7454 == i_0_)
				i_2_++;
			else if (aClass553_10838.anInt7454 * -1629030593 < i_0_)
				i_2_ += 2;
			if (i_1_ == aClass553_10838.anInt7455 * -1430999951)
				i_2_ += 3;
			else if (aClass553_10838.anInt7455 * -1430999951 > i_1_)
				i_2_ += 6;
			int i_3_ = anIntArray11788[i_2_];
			if (0 == (aShort11789 & i_3_)) {
				if (aShort11789 == 1 && i_0_ > 0)
					i_0_--;
				else if (4 == aShort11789 && i_0_ <= 937313339 * aClass553_10838.anInt7428)
					i_0_++;
				else if (aShort11789 == 8 && i_1_ > 0)
					i_1_--;
				else if (2 == aShort11789 && i_1_ <= 1965060689 * aClass553_10838.anInt7464)
					i_1_++;
				else if (16 == aShort11789 && i_0_ > 0 && i_1_ <= 1965060689 * aClass553_10838.anInt7464) {
					i_0_--;
					i_1_++;
				} else if (aShort11789 == 32 && i_0_ <= 937313339 * aClass553_10838.anInt7428 && i_1_ <= 1965060689 * aClass553_10838.anInt7464) {
					i_0_++;
					i_1_++;
				} else if (128 == aShort11789 && i_0_ > 0 && i_1_ > 0) {
					i_0_--;
					i_1_--;
				} else if (aShort11789 == 64 && i_0_ <= 937313339 * aClass553_10838.anInt7428 && i_1_ > 0) {
					i_0_++;
					i_1_--;
				} else
					throw new RuntimeException("");
			}
			anInt11783 = method9950(i_0_, i_1_, aClass536_Sub19Array11786, 18532735) * -1641591955;
			aBool8468 = false;
		}
		for (int i_4_ = 0; i_4_ < anInt11783 * -859343259; i_4_++)
			class536_sub19s[i_4_] = aClass536_Sub19Array11786[i_4_];
		return -859343259 * anInt11783;
	}

	boolean method9983() {
		Class436 class436 = method7837().aClass436_4823;
		return (aClass553_10838.aBoolArrayArray7471[(aClass553_10838.anInt7447 * 813474573 + (((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444) - -1629030593 * aClass553_10838.anInt7454))][(((int) class436.aFloat4853 >> aClass553_10838.anInt7444 * 1893698405) - aClass553_10838.anInt7455 * -1430999951 + 813474573 * aClass553_10838.anInt7447)]);
	}

	boolean method9948(Class167 class167, int i) {
		Class436 class436 = method7837().aClass436_4823;
		return (aClass553_10838.aClass544_7426.method6591(this, aByte10840, ((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444), ((int) class436.aFloat4853 >> aClass553_10838.anInt7444 * 1893698405)));
	}

	boolean method9949(int i) {
		Class436 class436 = method7837().aClass436_4823;
		return (aClass553_10838.aBoolArrayArray7471[(aClass553_10838.anInt7447 * 813474573 + (((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444) - -1629030593 * aClass553_10838.anInt7454))][(((int) class436.aFloat4853 >> aClass553_10838.anInt7444 * 1893698405) - aClass553_10838.anInt7455 * -1430999951 + 813474573 * aClass553_10838.anInt7447)]);
	}

	int method9981(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			Class436 class436 = method7837().aClass436_4823;
			int i = ((int) class436.aFloat4850 >> aClass553_10838.anInt7444 * 1893698405);
			int i_5_ = ((int) class436.aFloat4853 >> 1893698405 * aClass553_10838.anInt7444);
			int i_6_ = 0;
			if (-1629030593 * aClass553_10838.anInt7454 == i)
				i_6_++;
			else if (aClass553_10838.anInt7454 * -1629030593 < i)
				i_6_ += 2;
			if (i_5_ == aClass553_10838.anInt7455 * -1430999951)
				i_6_ += 3;
			else if (aClass553_10838.anInt7455 * -1430999951 > i_5_)
				i_6_ += 6;
			int i_7_ = anIntArray11788[i_6_];
			if (0 == (aShort11789 & i_7_)) {
				if (aShort11789 == 1 && i > 0)
					i--;
				else if (4 == aShort11789 && i <= 937313339 * aClass553_10838.anInt7428)
					i++;
				else if (aShort11789 == 8 && i_5_ > 0)
					i_5_--;
				else if (2 == aShort11789 && i_5_ <= 1965060689 * aClass553_10838.anInt7464)
					i_5_++;
				else if (16 == aShort11789 && i > 0 && i_5_ <= 1965060689 * aClass553_10838.anInt7464) {
					i--;
					i_5_++;
				} else if (aShort11789 == 32 && i <= 937313339 * aClass553_10838.anInt7428 && i_5_ <= 1965060689 * aClass553_10838.anInt7464) {
					i++;
					i_5_++;
				} else if (128 == aShort11789 && i > 0 && i_5_ > 0) {
					i--;
					i_5_--;
				} else if (aShort11789 == 64 && i <= 937313339 * aClass553_10838.anInt7428 && i_5_ > 0) {
					i++;
					i_5_--;
				} else
					throw new RuntimeException("");
			}
			anInt11783 = method9950(i, i_5_, aClass536_Sub19Array11786, 1456441984) * -1641591955;
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11783 * -859343259; i++)
			class536_sub19s[i] = aClass536_Sub19Array11786[i];
		return -859343259 * anInt11783;
	}

	int method9980(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			Class436 class436 = method7837().aClass436_4823;
			int i = ((int) class436.aFloat4850 >> aClass553_10838.anInt7444 * 1893698405);
			int i_8_ = ((int) class436.aFloat4853 >> 1893698405 * aClass553_10838.anInt7444);
			int i_9_ = 0;
			if (-1629030593 * aClass553_10838.anInt7454 == i)
				i_9_++;
			else if (aClass553_10838.anInt7454 * -1629030593 < i)
				i_9_ += 2;
			if (i_8_ == aClass553_10838.anInt7455 * -1430999951)
				i_9_ += 3;
			else if (aClass553_10838.anInt7455 * -1430999951 > i_8_)
				i_9_ += 6;
			int i_10_ = anIntArray11788[i_9_];
			if (0 == (aShort11789 & i_10_)) {
				if (aShort11789 == 1 && i > 0)
					i--;
				else if (4 == aShort11789 && i <= 937313339 * aClass553_10838.anInt7428)
					i++;
				else if (aShort11789 == 8 && i_8_ > 0)
					i_8_--;
				else if (2 == aShort11789 && i_8_ <= 1965060689 * aClass553_10838.anInt7464)
					i_8_++;
				else if (16 == aShort11789 && i > 0 && i_8_ <= 1965060689 * aClass553_10838.anInt7464) {
					i--;
					i_8_++;
				} else if (aShort11789 == 32 && i <= 937313339 * aClass553_10838.anInt7428 && i_8_ <= 1965060689 * aClass553_10838.anInt7464) {
					i++;
					i_8_++;
				} else if (128 == aShort11789 && i > 0 && i_8_ > 0) {
					i--;
					i_8_--;
				} else if (aShort11789 == 64 && i <= 937313339 * aClass553_10838.anInt7428 && i_8_ > 0) {
					i++;
					i_8_--;
				} else
					throw new RuntimeException("");
			}
			anInt11783 = method9950(i, i_8_, aClass536_Sub19Array11786, -512022030) * -1641591955;
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11783 * -859343259; i++)
			class536_sub19s[i] = aClass536_Sub19Array11786[i];
		return -859343259 * anInt11783;
	}

	Class649_Sub1_Sub3(Class553 class553, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		super(class553);
		aByte10839 = (byte) i_13_;
		aByte10840 = (byte) i_14_;
		aShort11789 = (short) i_15_;
		method7841(new Class436((float) i, (float) i_11_, (float) i_12_));
		for (int i_16_ = 0; i_16_ < 4; i_16_++)
			aClass536_Sub19Array11786[i_16_] = null;
	}

	boolean method9982(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		return (aClass553_10838.aClass544_7426.method6591(this, aByte10840, ((int) class436.aFloat4850 >> 1893698405 * aClass553_10838.anInt7444), ((int) class436.aFloat4853 >> aClass553_10838.anInt7444 * 1893698405)));
	}

	int method9979(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			Class436 class436 = method7837().aClass436_4823;
			int i = ((int) class436.aFloat4850 >> aClass553_10838.anInt7444 * 1893698405);
			int i_17_ = ((int) class436.aFloat4853 >> 1893698405 * aClass553_10838.anInt7444);
			int i_18_ = 0;
			if (-1629030593 * aClass553_10838.anInt7454 == i)
				i_18_++;
			else if (aClass553_10838.anInt7454 * -1629030593 < i)
				i_18_ += 2;
			if (i_17_ == aClass553_10838.anInt7455 * -1430999951)
				i_18_ += 3;
			else if (aClass553_10838.anInt7455 * -1430999951 > i_17_)
				i_18_ += 6;
			int i_19_ = anIntArray11788[i_18_];
			if (0 == (aShort11789 & i_19_)) {
				if (aShort11789 == 1 && i > 0)
					i--;
				else if (4 == aShort11789 && i <= 937313339 * aClass553_10838.anInt7428)
					i++;
				else if (aShort11789 == 8 && i_17_ > 0)
					i_17_--;
				else if (2 == aShort11789 && i_17_ <= 1965060689 * aClass553_10838.anInt7464)
					i_17_++;
				else if (16 == aShort11789 && i > 0 && i_17_ <= 1965060689 * aClass553_10838.anInt7464) {
					i--;
					i_17_++;
				} else if (aShort11789 == 32 && i <= 937313339 * aClass553_10838.anInt7428 && (i_17_ <= 1965060689 * aClass553_10838.anInt7464)) {
					i++;
					i_17_++;
				} else if (128 == aShort11789 && i > 0 && i_17_ > 0) {
					i--;
					i_17_--;
				} else if (aShort11789 == 64 && i <= 937313339 * aClass553_10838.anInt7428 && i_17_ > 0) {
					i++;
					i_17_--;
				} else
					throw new RuntimeException("");
			}
			anInt11783 = method9950(i, i_17_, aClass536_Sub19Array11786, -879665085) * -1641591955;
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11783 * -859343259; i++)
			class536_sub19s[i] = aClass536_Sub19Array11786[i];
		return -859343259 * anInt11783;
	}
}
