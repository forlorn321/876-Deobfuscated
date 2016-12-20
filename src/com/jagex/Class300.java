/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class300 implements Runnable {
	long aLong3401;
	Interface31 anInterface31_3402;
	boolean aBool3403;
	volatile boolean aBool3404;
	long aLong3405;
	int anInt3406;
	Interface31 anInterface31_3407 = new Class292();
	String aString3408;
	String aString3409;
	int anInt3410;
	Class310 aClass310_3411;

	void method5524() {
		aBool3404 = true;
	}

	public int method5525() {
		return -1559924853 * anInt3410;
	}

	synchronized void method5526(byte i) {
		aBool3403 = true;
	}

	synchronized boolean method5527(byte i) {
		return anInterface31_3407.method178(-8570413392306185633L * aLong3405);
	}

	synchronized void method5528(Interface31 interface31, int i) {
		anInterface31_3402 = anInterface31_3407;
		anInterface31_3407 = interface31;
		aLong3405 = Class234.method4347(-1408626088) * 6458335453267100063L;
	}

	synchronized void method5529() {
		aBool3403 = true;
	}

	public int method5530(int i) {
		if (null == aClass310_3411)
			return 0;
		int i_0_ = aClass310_3411.anInt3485 * -1481142029;
		if (aClass310_3411.aBool3489 && anInt3410 * -1559924853 < 1933212919 * aClass310_3411.anInt3467)
			return anInt3410 * -1559924853 + 1;
		if (i_0_ < 0 || i_0_ >= Class290.aClass310Array3230.length - 1)
			return 100;
		if (aClass310_3411.anInt3487 * -138373539 == anInt3410 * -1559924853)
			return aClass310_3411.anInt3467 * 1933212919;
		return -138373539 * aClass310_3411.anInt3487;
	}

	public String method5531() {
		return aString3409;
	}

	public String method5532(int i) {
		return aString3408;
	}

	public String method5533(int i) {
		return aString3409;
	}

	synchronized void method5534(long l, String string, String string_1_, int i, Class310 class310) {
		aLong3401 = -5503646343980934087L * l;
		aString3409 = string;
		aString3408 = string_1_;
		anInt3410 = i * 452804643;
		aClass310_3411 = class310;
	}

	public Class310 method5535(int i) {
		return aClass310_3411;
	}

	void method5536(int i) {
		aBool3404 = true;
	}

	public void run() {
		while (!aBool3404) {
			long l = Class234.method4347(-1408626088);
			synchronized (this) {
				try {
					anInt3406 += -29178841;
					if (anInterface31_3407 instanceof Class292)
						anInterface31_3407.method176(aBool3403, (byte) -37);
					else {
						long l_2_ = Class234.method4347(-1408626088);
						if (null != Class402.aClass180_4150 && null != anInterface31_3402 && anInterface31_3402.method179(-720464649) != 0 && (aLong3405 * -8570413392306185633L >= (l_2_ - (long) anInterface31_3402.method179(-1250821528)))) {
							int i = (int) ((l_2_ - aLong3405 * -8570413392306185633L) * 255L / (long) anInterface31_3402.method179(-1677344416));
							int i_3_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_3_ = i_3_ << 24 | 0xffffff;
							Class19.method767((byte) -31);
							Class402.aClass180_4150.method3136(1, 0);
							Class147 class147 = (Class402.aClass180_4150.method3146(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009, true, 937790122));
							Class171_Sub2 class171_sub2 = Class402.aClass180_4150.method3109();
							class171_sub2.method15321(0, class147.method2454());
							Class402.aClass180_4150.method3106(class171_sub2, (byte) -73);
							anInterface31_3402.method176(true, (byte) -37);
							Class402.aClass180_4150.method3107(class171_sub2, -677418425);
							class147.method2416(0, 0, 0, i_3_, 1);
							Class402.aClass180_4150.method3106(class171_sub2, (byte) 3);
							Class402.aClass180_4150.method3136(1, 0);
							anInterface31_3407.method176(true, (byte) -12);
							Class402.aClass180_4150.method3107(class171_sub2, -677418425);
							class147.method2416(0, 0, 0, i, 1);
						} else {
							if (null != anInterface31_3402) {
								aBool3403 = true;
								anInterface31_3402.method177(2022311364);
								anInterface31_3402 = null;
							}
							if (aBool3403) {
								Class19.method767((byte) -85);
								if (null != Class402.aClass180_4150)
									Class402.aClass180_4150.method3136(1, 0);
							}
							anInterface31_3407.method176(aBool3403 || (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3152()), (byte) -38);
						}
						try {
							if (null != Class402.aClass180_4150 && !(anInterface31_3407 instanceof Class292))
								Class402.aClass180_4150.method3078((byte) 32);
						} catch (Exception_Sub1 exception_sub1) {
							Class180.method3542(new StringBuilder().append(exception_sub1.getMessage()).append(Class678.aclient8619.method8509((byte) 27)).toString(), exception_sub1, 1604547405);
							Class535.method8982(0, true, 2038795974);
						}
					}
					aBool3403 = false;
					if (Class402.aClass180_4150 != null && !(anInterface31_3407 instanceof Class292) && (aClass310_3411.anInt3485 * -1481142029 < Class310.aClass310_3472.anInt3485 * -1481142029))
						Class36.method1142((byte) 77);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_4_ = Class234.method4347(-1408626088);
			int i = (int) (20L - (l_4_ - l));
			if (i > 0)
				Class518.method8635((long) i);
		}
	}

	public void method5537() {
		while (!aBool3404) {
			long l = Class234.method4347(-1408626088);
			synchronized (this) {
				try {
					anInt3406 += -29178841;
					if (anInterface31_3407 instanceof Class292)
						anInterface31_3407.method176(aBool3403, (byte) -38);
					else {
						long l_5_ = Class234.method4347(-1408626088);
						if (null != Class402.aClass180_4150 && null != anInterface31_3402 && anInterface31_3402.method179(-830607550) != 0 && (aLong3405 * -8570413392306185633L >= (l_5_ - (long) anInterface31_3402.method179(-1917626362)))) {
							int i = (int) ((l_5_ - aLong3405 * -8570413392306185633L) * 255L / (long) anInterface31_3402.method179(-1153583165));
							int i_6_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_6_ = i_6_ << 24 | 0xffffff;
							Class19.method767((byte) -1);
							Class402.aClass180_4150.method3136(1, 0);
							Class147 class147 = (Class402.aClass180_4150.method3146(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009, true, 937790122));
							Class171_Sub2 class171_sub2 = Class402.aClass180_4150.method3109();
							class171_sub2.method15321(0, class147.method2454());
							Class402.aClass180_4150.method3106(class171_sub2, (byte) -58);
							anInterface31_3402.method176(true, (byte) 58);
							Class402.aClass180_4150.method3107(class171_sub2, -677418425);
							class147.method2416(0, 0, 0, i_6_, 1);
							Class402.aClass180_4150.method3106(class171_sub2, (byte) -27);
							Class402.aClass180_4150.method3136(1, 0);
							anInterface31_3407.method176(true, (byte) -92);
							Class402.aClass180_4150.method3107(class171_sub2, -677418425);
							class147.method2416(0, 0, 0, i, 1);
						} else {
							if (null != anInterface31_3402) {
								aBool3403 = true;
								anInterface31_3402.method177(1781408769);
								anInterface31_3402 = null;
							}
							if (aBool3403) {
								Class19.method767((byte) 32);
								if (null != Class402.aClass180_4150)
									Class402.aClass180_4150.method3136(1, 0);
							}
							anInterface31_3407.method176(aBool3403 || (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3152()), (byte) 36);
						}
						try {
							if (null != Class402.aClass180_4150 && !(anInterface31_3407 instanceof Class292))
								Class402.aClass180_4150.method3078((byte) 54);
						} catch (Exception_Sub1 exception_sub1) {
							Class180.method3542(new StringBuilder().append(exception_sub1.getMessage()).append(Class678.aclient8619.method8509((byte) 127)).toString(), exception_sub1, 1604547405);
							Class535.method8982(0, true, 2038795974);
						}
					}
					aBool3403 = false;
					if (Class402.aClass180_4150 != null && !(anInterface31_3407 instanceof Class292) && (aClass310_3411.anInt3485 * -1481142029 < Class310.aClass310_3472.anInt3485 * -1481142029))
						Class36.method1142((byte) 31);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_7_ = Class234.method4347(-1408626088);
			int i = (int) (20L - (l_7_ - l));
			if (i > 0)
				Class518.method8635((long) i);
		}
	}

	public void method5538() {
		while (!aBool3404) {
			long l = Class234.method4347(-1408626088);
			synchronized (this) {
				try {
					anInt3406 += -29178841;
					if (anInterface31_3407 instanceof Class292)
						anInterface31_3407.method176(aBool3403, (byte) 1);
					else {
						long l_8_ = Class234.method4347(-1408626088);
						if (null != Class402.aClass180_4150 && null != anInterface31_3402 && anInterface31_3402.method179(-1187933423) != 0 && (aLong3405 * -8570413392306185633L >= l_8_ - (long) anInterface31_3402.method179(-16775901))) {
							int i = (int) ((l_8_ - aLong3405 * -8570413392306185633L) * 255L / (long) anInterface31_3402.method179(-85901976));
							int i_9_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_9_ = i_9_ << 24 | 0xffffff;
							Class19.method767((byte) 15);
							Class402.aClass180_4150.method3136(1, 0);
							Class147 class147 = (Class402.aClass180_4150.method3146(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009, true, 937790122));
							Class171_Sub2 class171_sub2 = Class402.aClass180_4150.method3109();
							class171_sub2.method15321(0, class147.method2454());
							Class402.aClass180_4150.method3106(class171_sub2, (byte) -92);
							anInterface31_3402.method176(true, (byte) 23);
							Class402.aClass180_4150.method3107(class171_sub2, -677418425);
							class147.method2416(0, 0, 0, i_9_, 1);
							Class402.aClass180_4150.method3106(class171_sub2, (byte) -90);
							Class402.aClass180_4150.method3136(1, 0);
							anInterface31_3407.method176(true, (byte) 11);
							Class402.aClass180_4150.method3107(class171_sub2, -677418425);
							class147.method2416(0, 0, 0, i, 1);
						} else {
							if (null != anInterface31_3402) {
								aBool3403 = true;
								anInterface31_3402.method177(1916459980);
								anInterface31_3402 = null;
							}
							if (aBool3403) {
								Class19.method767((byte) -28);
								if (null != Class402.aClass180_4150)
									Class402.aClass180_4150.method3136(1, 0);
							}
							anInterface31_3407.method176(aBool3403 || (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3152()), (byte) 19);
						}
						try {
							if (null != Class402.aClass180_4150 && !(anInterface31_3407 instanceof Class292))
								Class402.aClass180_4150.method3078((byte) 121);
						} catch (Exception_Sub1 exception_sub1) {
							Class180.method3542(new StringBuilder().append(exception_sub1.getMessage()).append(Class678.aclient8619.method8509((byte) 70)).toString(), exception_sub1, 1604547405);
							Class535.method8982(0, true, 2038795974);
						}
					}
					aBool3403 = false;
					if (Class402.aClass180_4150 != null && !(anInterface31_3407 instanceof Class292) && (aClass310_3411.anInt3485 * -1481142029 < Class310.aClass310_3472.anInt3485 * -1481142029))
						Class36.method1142((byte) 40);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_10_ = Class234.method4347(-1408626088);
			int i = (int) (20L - (l_10_ - l));
			if (i > 0)
				Class518.method8635((long) i);
		}
	}

	int method5539() {
		return anInt3406 * -946967657;
	}

	public int method5540() {
		if (null == aClass310_3411)
			return 0;
		int i = aClass310_3411.anInt3485 * -1481142029;
		if (aClass310_3411.aBool3489 && anInt3410 * -1559924853 < 1933212919 * aClass310_3411.anInt3467)
			return anInt3410 * -1559924853 + 1;
		if (i < 0 || i >= Class290.aClass310Array3230.length - 1)
			return 100;
		if (aClass310_3411.anInt3487 * -138373539 == anInt3410 * -1559924853)
			return aClass310_3411.anInt3467 * 1933212919;
		return -138373539 * aClass310_3411.anInt3487;
	}

	public int method5541(int i) {
		return -1559924853 * anInt3410;
	}

	Class300() {
		anInterface31_3402 = null;
	}

	public long method5542() {
		return aLong3401 * 1853135396571943433L;
	}

	synchronized void method5543() {
		aBool3403 = true;
	}

	synchronized void method5544(Interface31 interface31) {
		anInterface31_3402 = anInterface31_3407;
		anInterface31_3407 = interface31;
		aLong3405 = Class234.method4347(-1408626088) * 6458335453267100063L;
	}

	synchronized void method5545(Interface31 interface31) {
		anInterface31_3402 = anInterface31_3407;
		anInterface31_3407 = interface31;
		aLong3405 = Class234.method4347(-1408626088) * 6458335453267100063L;
	}

	synchronized void method5546(Interface31 interface31) {
		anInterface31_3402 = anInterface31_3407;
		anInterface31_3407 = interface31;
		aLong3405 = Class234.method4347(-1408626088) * 6458335453267100063L;
	}

	void method5547() {
		aBool3404 = true;
	}

	synchronized void method5548(long l, String string, String string_11_, int i, Class310 class310) {
		aLong3401 = -5503646343980934087L * l;
		aString3409 = string;
		aString3408 = string_11_;
		anInt3410 = i * 452804643;
		aClass310_3411 = class310;
	}

	synchronized void method5549(long l, String string, String string_12_, int i, Class310 class310) {
		aLong3401 = -5503646343980934087L * l;
		aString3409 = string;
		aString3408 = string_12_;
		anInt3410 = i * 452804643;
		aClass310_3411 = class310;
	}

	public int method5550() {
		if (null == aClass310_3411)
			return 0;
		int i = aClass310_3411.anInt3485 * -1481142029;
		if (aClass310_3411.aBool3489 && anInt3410 * -1559924853 < 1933212919 * aClass310_3411.anInt3467)
			return anInt3410 * -1559924853 + 1;
		if (i < 0 || i >= Class290.aClass310Array3230.length - 1)
			return 100;
		if (aClass310_3411.anInt3487 * -138373539 == anInt3410 * -1559924853)
			return aClass310_3411.anInt3467 * 1933212919;
		return -138373539 * aClass310_3411.anInt3487;
	}

	synchronized void method5551(long l, String string, String string_13_, int i, Class310 class310, int i_14_) {
		aLong3401 = -5503646343980934087L * l;
		aString3409 = string;
		aString3408 = string_13_;
		anInt3410 = i * 452804643;
		aClass310_3411 = class310;
	}

	synchronized void method5552() {
		aBool3403 = true;
	}

	public String method5553() {
		return aString3408;
	}

	public String method5554() {
		return aString3408;
	}

	int method5555(int i) {
		return anInt3406 * -946967657;
	}

	public String method5556() {
		return aString3409;
	}

	public long method5557(short i) {
		return aLong3401 * 1853135396571943433L;
	}

	public long method5558() {
		return aLong3401 * 1853135396571943433L;
	}

	void method5559() {
		aBool3404 = true;
	}

	synchronized boolean method5560() {
		return anInterface31_3407.method178(-8570413392306185633L * aLong3405);
	}

	synchronized void method5561() {
		aBool3403 = true;
	}

	void method5562() {
		aBool3404 = true;
	}

	static final void method5563(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_15_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_16_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		int i_17_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass346_8532.method6132(i_15_, i_16_, i_17_, (byte) -6);
	}

	static final void method5564(Class665 class665, int i) {
		int i_18_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class232.method4330(i_18_, 2056730819);
	}

	static final int method5565(Class91 class91, int i) {
		if (null == class91)
			return 12;
		switch (class91.anInt846 * 1899620479) {
		default:
			return 12;
		case 3:
			return 20;
		}
	}

	static final boolean method5566(char c, int i) {
		if (Character.isISOControl(c))
			return false;
		if (Class394.method6500(c, 1126301037))
			return true;
		char[] cs = Class86.aCharArray820;
		for (int i_19_ = 0; i_19_ < cs.length; i_19_++) {
			char c_20_ = cs[i_19_];
			if (c == c_20_)
				return true;
		}
		cs = Class86.aCharArray823;
		for (int i_21_ = 0; i_21_ < cs.length; i_21_++) {
			char c_22_ = cs[i_21_];
			if (c == c_22_)
				return true;
		}
		return false;
	}

	static final void method5567(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_23_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_24_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		Class331_Sub3.method15766(6, i_23_, i_24_, "", 472161400);
	}

	static Class171_Sub1_Sub3 method5568(Class180_Sub1 class180_sub1, Canvas canvas, int i, int i_25_, int i_26_) {
		Class171_Sub1_Sub3_Sub1 class171_sub1_sub3_sub1 = new Class171_Sub1_Sub3_Sub1(class180_sub1, canvas, i, i_25_);
		return class171_sub1_sub3_sub1;
	}
}
