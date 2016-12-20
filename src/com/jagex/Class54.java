/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class54 implements Interface14 {
	public boolean aBool704 = false;
	public int anInt705;
	public int anInt706;
	Class78 aClass78_707;
	int[] anIntArray708;

	public Class147 method1293(Class180 class180, int i, boolean bool, byte i_0_) {
		long l = (long) (1725725845 * anInt705 | i << 16 | (bool ? 262144 : 0) | class180.anInt2064 * -397006101 << 19);
		Class147 class147 = (Class147) aClass78_707.aClass205_800.method3787(l);
		if (null != class147)
			return class147;
		method1296(class180, i, bool, l);
		return (Class147) aClass78_707.aClass205_800.method3787(l);
	}

	public void method84() {
		/* empty */
	}

	void method1294(RSByteBuffer class527_sub38, int i, int i_1_) {
		do {
			if (1 == i)
				anInt705 = class527_sub38.method16466(-1730064619) * -286232899;
			else if (i == 2)
				anInt706 = class527_sub38.read24BitUnsignedInteger(1128454112) * 1059097993;
			else if (i == 3)
				aBool704 = true;
			else if (4 == i)
				anInt705 = 286232899;
			else if (i == 5)
				break;
		} while (false);
	}

	Class54(int i, Class78 class78) {
		aClass78_707 = class78;
	}

	public int[] method1295(Class180 class180, int i, boolean bool, byte i_2_) {
		if (null != anIntArray708)
			return anIntArray708;
		long l = (long) (anInt705 * 1725725845 | i << 16 | (bool ? 262144 : 0) | class180.anInt2064 * -397006101 << 19);
		method1296(class180, i, bool, l);
		return anIntArray708;
	}

	void method1296(Class180 class180, int i, boolean bool, long l) {
		if (aClass78_707.aClass459_799.method7480(anInt705 * 1725725845, -310851193)) {
			Class185 class185 = Class165.method2653(aClass78_707.aClass459_799, anInt705 * 1725725845, 0);
			if (null != class185) {
				class185.method3617();
				if (bool)
					class185.method3582();
				for (int i_3_ = 0; i_3_ < i; i_3_++)
					class185.method3593();
				anIntArray708 = class185.method3584(false);
				if (0 != anInt706 * 1932916921) {
					int i_4_ = (anInt706 * 1932916921 & 0xff0000) >> 16;
					int i_5_ = (anInt706 * 1932916921 & 0xff00) >> 8;
					int i_6_ = 1932916921 * anInt706 & 0xff;
					for (int i_7_ = 0; i_7_ < anIntArray708.length; i_7_++) {
						int i_8_ = anIntArray708[i_7_] >> 24 & 0xff;
						int i_9_ = 256 - i_8_;
						if (i_8_ != 0) {
							int i_10_ = ((anIntArray708[i_7_] & 0xff0000) * i_4_ * -16777216);
							int i_11_ = ((anIntArray708[i_7_] & 0xff00) * i_5_ * 16711680);
							int i_12_ = i_6_ * (anIntArray708[i_7_] & 0xff) * 65280;
							int i_13_ = (i_10_ | i_11_ | i_12_) >>> 8;
							if (i_8_ == 255)
								anIntArray708[i_7_] = i_13_;
							else {
								int i_14_ = anIntArray708[i_7_];
								anIntArray708[i_7_] = (i_8_ << 24 | ((((i_13_ & 0xff00) * i_9_ + (i_14_ & 0xff00) * i_8_) & 0xff0000) + ((i_9_ * (i_13_ & 0xff00ff) + (i_14_ & 0xff00ff) * i_8_) & ~0xff00ff)) >> 8);
							}
						}
					}
				}
			}
			Class147 class147 = class180.method3271(class185, true);
			if (null != class147)
				aClass78_707.aClass205_800.method3790(class147, l);
		}
	}

	public boolean method1297(int i) {
		return aClass78_707.aClass459_799.method7480(1725725845 * anInt705, 1112709792);
	}

	public Class147 method1298(Class180 class180, int i, boolean bool) {
		long l = (long) (1725725845 * anInt705 | i << 16 | (bool ? 262144 : 0) | class180.anInt2064 * -397006101 << 19);
		Class147 class147 = (Class147) aClass78_707.aClass205_800.method3787(l);
		if (null != class147)
			return class147;
		method1296(class180, i, bool, l);
		return (Class147) aClass78_707.aClass205_800.method3787(l);
	}

	void method1299(Class180 class180, int i, boolean bool, long l) {
		if (aClass78_707.aClass459_799.method7480(anInt705 * 1725725845, -1631774599)) {
			Class185 class185 = Class165.method2653(aClass78_707.aClass459_799, anInt705 * 1725725845, 0);
			if (null != class185) {
				class185.method3617();
				if (bool)
					class185.method3582();
				for (int i_15_ = 0; i_15_ < i; i_15_++)
					class185.method3593();
				anIntArray708 = class185.method3584(false);
				if (0 != anInt706 * 1932916921) {
					int i_16_ = (anInt706 * 1932916921 & 0xff0000) >> 16;
					int i_17_ = (anInt706 * 1932916921 & 0xff00) >> 8;
					int i_18_ = 1932916921 * anInt706 & 0xff;
					for (int i_19_ = 0; i_19_ < anIntArray708.length; i_19_++) {
						int i_20_ = anIntArray708[i_19_] >> 24 & 0xff;
						int i_21_ = 256 - i_20_;
						if (i_20_ != 0) {
							int i_22_ = ((anIntArray708[i_19_] & 0xff0000) * i_16_ * -16777216);
							int i_23_ = ((anIntArray708[i_19_] & 0xff00) * i_17_ * 16711680);
							int i_24_ = (i_18_ * (anIntArray708[i_19_] & 0xff) * 65280);
							int i_25_ = (i_22_ | i_23_ | i_24_) >>> 8;
							if (i_20_ == 255)
								anIntArray708[i_19_] = i_25_;
							else {
								int i_26_ = anIntArray708[i_19_];
								anIntArray708[i_19_] = (i_20_ << 24 | ((((i_25_ & 0xff00) * i_21_ + (i_26_ & 0xff00) * i_20_) & 0xff0000) + ((i_21_ * (i_25_ & 0xff00ff) + (i_26_ & 0xff00ff) * i_20_) & ~0xff00ff)) >> 8);
							}
						}
					}
				}
			}
			Class147 class147 = class180.method3271(class185, true);
			if (null != class147)
				aClass78_707.aClass205_800.method3790(class147, l);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1294(class527_sub38, i, 1716325262);
		}
	}

	public void method85() {
		/* empty */
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_27_ = class527_sub38.readUnsignedByte();
			if (0 == i_27_)
				break;
			method1294(class527_sub38, i_27_, 1927800224);
		}
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1294(class527_sub38, i, 1961322648);
		}
	}

	public int[] method1300(Class180 class180, int i, boolean bool) {
		if (null != anIntArray708)
			return anIntArray708;
		long l = (long) (anInt705 * 1725725845 | i << 16 | (bool ? 262144 : 0) | class180.anInt2064 * -397006101 << 19);
		method1296(class180, i, bool, l);
		return anIntArray708;
	}

	public void method86(int i) {
		/* empty */
	}

	public boolean method1301() {
		return aClass78_707.aClass459_799.method7480(1725725845 * anInt705, 744678762);
	}

	public boolean method1302() {
		return aClass78_707.aClass459_799.method7480(1725725845 * anInt705, -253860455);
	}

	static Class522_Sub2 method1303(int i) {
		Class522_Sub2 class522_sub2 = ((Class522_Sub2) Class522_Sub2.aClass705_10299.method14318(1952382946));
		if (null != class522_sub2) {
			Class522_Sub2.anInt10294 -= 961645153;
			return class522_sub2;
		}
		return new Class522_Sub2();
	}
}
