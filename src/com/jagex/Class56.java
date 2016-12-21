/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class56 implements Interface13 {
	int[] anIntArray603;
	public int anInt604;
	public int anInt605;
	Class76 aClass76_606;
	public boolean aBool607 = false;
	public static Class34_Sub14 aClass34_Sub14_608;

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte(881142849);
			if (0 == i_0_)
				break;
			method957(class536_sub33, i_0_, (byte) -93);
		}
	}

	void method957(RSByteBuffer class536_sub33, int i, byte i_1_) {
		do {
			if (1 == i)
				anInt604 = class536_sub33.method9720((byte) 1) * 715815817;
			else if (i == 2)
				anInt605 = class536_sub33.read24BitUnsignedInteger(1969591302) * -1631318095;
			else if (i == 3)
				aBool607 = true;
			else if (4 == i)
				anInt604 = -715815817;
			else if (5 == i)
				break;
		} while (false);
	}

	public Class143 method958(Class167 class167, int i, boolean bool, short i_2_) {
		long l = (long) (1861642937 * anInt604 | i << 16 | (bool ? 262144 : 0) | 1526643673 * class167.anInt1850 << 19);
		Class143 class143 = (Class143) aClass76_606.aClass199_821.method2886(l);
		if (class143 != null)
			return class143;
		method960(class167, i, bool, l);
		return (Class143) aClass76_606.aClass199_821.method2886(l);
	}

	public int[] method959(Class167 class167, int i, boolean bool, int i_3_) {
		if (anIntArray603 != null)
			return anIntArray603;
		long l = (long) (anInt604 * 1861642937 | i << 16 | (bool ? 262144 : 0) | 1526643673 * class167.anInt1850 << 19);
		method960(class167, i, bool, l);
		return anIntArray603;
	}

	void method960(Class167 class167, int i, boolean bool, long l) {
		if (aClass76_606.aClass461_820.method5580(anInt604 * 1861642937, -964514165)) {
			Class179 class179 = Class181.method2718(aClass76_606.aClass461_820, anInt604 * 1861642937, 0);
			if (class179 != null) {
				class179.method2673();
				if (bool)
					class179.method2646();
				for (int i_4_ = 0; i_4_ < i; i_4_++)
					class179.method2647();
				anIntArray603 = class179.method2643(false);
				if (0 != anInt605 * -2117412527) {
					int i_5_ = (anInt605 * -2117412527 & 0xff0000) >> 16;
					int i_6_ = (-2117412527 * anInt605 & 0xff00) >> 8;
					int i_7_ = -2117412527 * anInt605 & 0xff;
					for (int i_8_ = 0; i_8_ < anIntArray603.length; i_8_++) {
						int i_9_ = anIntArray603[i_8_] >> 24 & 0xff;
						int i_10_ = 256 - i_9_;
						if (i_9_ != 0) {
							int i_11_ = (i_5_ * (anIntArray603[i_8_] & 0xff0000) * -16777216);
							int i_12_ = (16711680 * ((anIntArray603[i_8_] & 0xff00) * i_6_));
							int i_13_ = (anIntArray603[i_8_] & 0xff) * i_7_ * 65280;
							int i_14_ = (i_11_ | i_12_ | i_13_) >>> 8;
							if (i_9_ == 255)
								anIntArray603[i_8_] = i_14_;
							else {
								int i_15_ = anIntArray603[i_8_];
								anIntArray603[i_8_] = (i_9_ << 24 | ((((i_15_ & 0xff00ff) * i_9_ + (i_14_ & 0xff00ff) * i_10_) & ~0xff00ff) + (((i_15_ & 0xff00) * i_9_ + (i_14_ & 0xff00) * i_10_) & 0xff0000)) >> 8);
							}
						}
					}
				}
			}
			Class143 class143 = class167.method2082(class179, true);
			if (class143 != null)
				aClass76_606.aClass199_821.method2881(class143, l);
		}
	}

	public void method75(byte i) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(1525372046);
			if (0 == i)
				break;
			method957(class536_sub33, i, (byte) 29);
		}
	}

	public void method77() {
		/* empty */
	}

	void method961(RSByteBuffer class536_sub33, int i) {
		do {
			if (1 == i)
				anInt604 = class536_sub33.method9720((byte) 1) * 715815817;
			else if (i == 2)
				anInt605 = class536_sub33.read24BitUnsignedInteger(1228698049) * -1631318095;
			else if (i == 3)
				aBool607 = true;
			else if (4 == i)
				anInt604 = -715815817;
			else if (5 == i)
				break;
		} while (false);
	}

	void method962(RSByteBuffer class536_sub33, int i) {
		do {
			if (1 == i)
				anInt604 = class536_sub33.method9720((byte) 1) * 715815817;
			else if (i == 2)
				anInt605 = class536_sub33.read24BitUnsignedInteger(783504920) * -1631318095;
			else if (i == 3)
				aBool607 = true;
			else if (4 == i)
				anInt604 = -715815817;
			else if (5 == i)
				break;
		} while (false);
	}

	Class56(int i, Class76 class76) {
		aClass76_606 = class76;
	}

	public boolean method963(int i) {
		return aClass76_606.aClass461_820.method5580(1861642937 * anInt604, -964514165);
	}

	static final void method964(Class251[] class251s, int i, int i_16_) {
		for (int i_17_ = 0; i_17_ < class251s.length; i_17_++) {
			Class251 class251 = class251s[i_17_];
			if (null != class251) {
				if (class251.anInt2728 * 1049444347 == 0) {
					if (class251.aClass251Array2726 != null)
						method964(class251.aClass251Array2726, i, -2121611684);
					Class536_Sub36 class536_sub36 = ((Class536_Sub36) (client.aClass4_11008.method556((long) (-1591767037 * class251.anInt2559))));
					if (class536_sub36 != null)
						Class205.method2950((-358726121 * class536_sub36.anInt10634), i, -870807069);
				}
				if (i == 0 && null != class251.anObjectArray2703) {
					Class536_Sub42 class536_sub42 = new Class536_Sub42();
					class536_sub42.aClass251_10804 = class251;
					class536_sub42.anObjectArray10802 = class251.anObjectArray2703;
					Class618.method7388(class536_sub42, 1906304947);
				}
				if (i == 1 && class251.anObjectArray2704 != null) {
					if (class251.anInt2546 * -809980533 >= 0) {
						Class251 class251_18_ = Class264.method3678((-1591767037 * class251.anInt2559), -689214737);
						if (class251_18_ == null || class251_18_.aClass251Array2725 == null || (-809980533 * class251.anInt2546 >= class251_18_.aClass251Array2725.length) || class251 != (class251_18_.aClass251Array2725[-809980533 * class251.anInt2546]))
							continue;
					}
					Class536_Sub42 class536_sub42 = new Class536_Sub42();
					class536_sub42.aClass251_10804 = class251;
					class536_sub42.anObjectArray10802 = class251.anObjectArray2704;
					Class618.method7388(class536_sub42, -1748882624);
				}
			}
		}
	}
}
