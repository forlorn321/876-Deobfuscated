/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class248 implements DefinitionI {
	int anInt2478;
	Interface12 anInterface12_2479;
	public int anInt2480;
	public int anInt2481 = -1149711835;
	public int anInt2482 = 1916118953;
	public String aString2483;
	public int anInt2484;
	int anInt2485;
	public int anInt2486;
	int anInt2487;
	public static final int anInt2488 = 1;
	public static final int anInt2489 = 2;
	public int anInt2490;
	public int anInt2491;
	public boolean aBool2492;
	public boolean aBool2493;
	public int anInt2494;
	public String aString2495;
	public String[] aStringArray2496;
	public int[] anIntArray2497;
	int anInt2498;
	public int anInt2499;
	int anInt2500;
	Class4 aClass4_2501;
	int anInt2502;
	int anInt2503;
	int anInt2504;
	public Class261 aClass261_2505;
	public int[] anIntArray2506;
	public int anInt2507;
	public int anInt2508;
	public int anInt2509;
	public int anInt2510;
	int anInt2511;
	public int anInt2512;
	public int anInt2513;
	public int anInt2514;
	public int anInt2515;
	Class247 aClass247_2516;
	public static final int anInt2517 = 0;
	public Class283 aClass283_2518;
	public int[] anIntArray2519;
	public int anInt2520;
	public byte[] aByteArray2521;
	public boolean aBool2522;
	public int anInt2523 = -2016971861;
	public int anInt2524;
	public int anInt2525;
	static String[] aStringArray2526;

	public int method3427(int i, int i_0_) {
		if (null == aClass4_2501)
			return i_0_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_2501.method556((long) i);
		if (null == class536_sub26)
			return i_0_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	void method3428(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt2481 = class536_sub33.readBigSmart() * 1149711835;
		else if (i == 2)
			anInt2482 = class536_sub33.readBigSmart() * -1916118953;
		else if (3 == i)
			aString2483 = class536_sub33.readString();
		else if (i == 4)
			anInt2484 = class536_sub33.read24BitUnsignedInteger() * -180963073;
		else if (i == 5)
			anInt2523 = class536_sub33.read24BitUnsignedInteger() * 2016971861;
		else if (i == 6)
			anInt2486 = class536_sub33.readUnsignedByte() * -7622749;
		else if (i == 7) {
			int i_1_ = class536_sub33.readUnsignedByte();
			if ((i_1_ & 0x1) == 0)
				aBool2492 = false;
			if (2 == (i_1_ & 0x2))
				aBool2493 = true;
		} else if (i == 8)
			class536_sub33.readUnsignedByte();
		else if (i == 9) {
			anInt2485 = class536_sub33.readUnsignedShort() * 1999689291;
			if (426165091 * anInt2485 == 65535)
				anInt2485 = -1999689291;
			anInt2500 = class536_sub33.readUnsignedShort() * -1881479131;
			if (65535 == -486607955 * anInt2500)
				anInt2500 = 1881479131;
			anInt2478 = class536_sub33.readInt() * -1840375399;
			anInt2498 = class536_sub33.readInt() * -1919900775;
		} else if (i >= 10 && i <= 14)
			aStringArray2496[i - 10] = class536_sub33.readString();
		else if (15 == i) {
			int i_2_ = class536_sub33.readUnsignedByte();
			anIntArray2497 = new int[2 * i_2_];
			for (int i_3_ = 0; i_3_ < i_2_ * 2; i_3_++)
				anIntArray2497[i_3_] = class536_sub33.readShort((byte) -91);
			anInt2509 = class536_sub33.readInt() * 1612502845;
			int i_4_ = class536_sub33.readUnsignedByte();
			anIntArray2519 = new int[i_4_];
			for (int i_5_ = 0; i_5_ < anIntArray2519.length; i_5_++)
				anIntArray2519[i_5_] = class536_sub33.readInt();
			aByteArray2521 = new byte[i_2_];
			for (int i_6_ = 0; i_6_ < i_2_; i_6_++)
				aByteArray2521[i_6_] = class536_sub33.readByte();
		} else if (16 == i)
			aBool2522 = false;
		else if (17 == i)
			aString2495 = class536_sub33.readString();
		else if (18 == i)
			anInt2504 = class536_sub33.readBigSmart() * -793893797;
		else if (19 == i)
			anInt2508 = class536_sub33.readUnsignedShort() * -282969387;
		else if (20 == i) {
			anInt2503 = class536_sub33.readUnsignedShort() * 1957270325;
			if (anInt2503 * 374368029 == 65535)
				anInt2503 = -1957270325;
			anInt2511 = class536_sub33.readUnsignedShort() * 2097056265;
			if (1125786681 * anInt2511 == 65535)
				anInt2511 = -2097056265;
			anInt2487 = class536_sub33.readInt() * -2092236185;
			anInt2502 = class536_sub33.readInt() * -1218494085;
		} else if (i == 21)
			anInt2491 = class536_sub33.readInt() * -340919351;
		else if (22 == i)
			anInt2494 = class536_sub33.readInt() * -9738933;
		else if (23 == i) {
			anInt2512 = class536_sub33.readUnsignedByte() * -1756714353;
			anInt2513 = class536_sub33.readUnsignedByte() * 1973839709;
			anInt2514 = class536_sub33.readUnsignedByte() * -1112294055;
		} else if (24 == i) {
			anInt2515 = class536_sub33.readShort((byte) -54) * 896394271;
			anInt2499 = class536_sub33.readShort((byte) -113) * -49190051;
		} else if (25 == i)
			anInt2525 = class536_sub33.readBigSmart() * -1823971701;
		else if (26 == i || i == 27) {
			anInt2485 = class536_sub33.readUnsignedShort() * 1999689291;
			if (anInt2485 * 426165091 == 65535)
				anInt2485 = -1999689291;
			anInt2500 = class536_sub33.readUnsignedShort() * -1881479131;
			if (anInt2500 * -486607955 == 65535)
				anInt2500 = 1881479131;
			int i_7_ = -1;
			if (i == 27) {
				i_7_ = class536_sub33.readUnsignedShort();
				if (i_7_ == 65535)
					i_7_ = -1;
			}
			int i_8_ = class536_sub33.readUnsignedByte();
			anIntArray2506 = new int[i_8_ + 2];
			for (int i_9_ = 0; i_9_ <= i_8_; i_9_++) {
				anIntArray2506[i_9_] = class536_sub33.readUnsignedShort();
				if (65535 == anIntArray2506[i_9_])
					anIntArray2506[i_9_] = -1;
			}
			anIntArray2506[1 + i_8_] = i_7_;
		} else if (i == 28)
			anInt2524 = class536_sub33.readUnsignedByte() * 1823493063;
		else if (29 == i)
			aClass261_2505 = ((Class261) Class682.method8091(Class344.method4485(-1062550878), class536_sub33.readUnsignedByte(), 1858049507));
		else if (i == 30)
			aClass283_2518 = ((Class283) Class682.method8091(Class710_Sub17.method10091(-453688078), class536_sub33.readUnsignedByte(), 1858049507));
		else if (i == 249) {
			int i_10_ = class536_sub33.readUnsignedByte();
			if (null == aClass4_2501) {
				int i_11_ = Class528.method6434(i_10_, -374904646);
				aClass4_2501 = new Class4(i_11_);
			}
			for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
				boolean bool = class536_sub33.readUnsignedByte() == 1;
				int i_13_ = class536_sub33.read24BitUnsignedInteger();
				Class536 class536;
				if (bool)
					class536 = new Class536_Sub13(class536_sub33.readString());
				else
					class536 = new Class536_Sub26(class536_sub33.readInt());
				aClass4_2501.method560(class536, (long) i_13_);
			}
		}
	}

	public void method75(byte i) {
		if (null != anIntArray2497) {
			for (int i_14_ = 0; i_14_ < anIntArray2497.length; i_14_ += 2) {
				if (anIntArray2497[i_14_] < -10405275 * anInt2507)
					anInt2507 = 490071917 * anIntArray2497[i_14_];
				else if (anIntArray2497[i_14_] > anInt2490 * -2077796911)
					anInt2490 = -567467215 * anIntArray2497[i_14_];
				if (anIntArray2497[i_14_ + 1] < anInt2520 * -1552833791)
					anInt2520 = -1353229055 * anIntArray2497[i_14_ + 1];
				else if (anIntArray2497[i_14_ + 1] > anInt2510 * 1889839503)
					anInt2510 = anIntArray2497[i_14_ + 1] * -875408017;
			}
		}
	}

	public boolean method3429(Interface20 interface20, Interface18 interface18, int i) {
		int i_15_ = -1;
		if (-486607955 * anInt2500 != -1) {
			Class153 class153 = interface20.method124(Class458.aClass458_5176, anInt2500 * -486607955, 323730415);
			i_15_ = interface18.method99(class153, 1958177552);
		} else if (426165091 * anInt2485 != -1) {
			Class324 class324 = interface20.method123(426165091 * anInt2485, -1018286558);
			i_15_ = interface18.method96(class324, 142472388);
		} else
			return true;
		if (null == anIntArray2506) {
			if (i_15_ < -17945943 * anInt2478 || i_15_ > anInt2498 * 438567081)
				return false;
		} else {
			if (i_15_ < 0 || i_15_ >= anIntArray2506.length - 1) {
				int i_16_ = anIntArray2506[anIntArray2506.length - 1];
				if (i_16_ != -1) {
					if (-17945943 * anInt2478 != -1 && -1 != anInt2498 * 438567081 && (i_15_ < anInt2478 * -17945943 || i_15_ > anInt2498 * 438567081))
						return false;
				} else
					return false;
			}
			if (anIntArray2506[i_15_] == -1)
				return false;
		}
		boolean bool = false;
		int i_17_;
		if (1125786681 * anInt2511 != -1) {
			Class153 class153 = interface20.method124(Class458.aClass458_5176, anInt2511 * 1125786681, 323730415);
			i_17_ = interface18.method99(class153, 1656575067);
		} else if (-1 != anInt2503 * 374368029) {
			Class324 class324 = interface20.method123(anInt2503 * 374368029, -1018286558);
			i_17_ = interface18.method96(class324, 1365121733);
		} else
			return true;
		if (i_17_ < -1896548009 * anInt2487 || i_17_ > anInt2502 * 954758579)
			return false;
		return true;
	}

	public Class143 method3430(Class167 class167, boolean bool, int i) {
		int i_18_ = bool ? -1002957977 * anInt2482 : 400801363 * anInt2481;
		int i_19_ = i_18_ | 1526643673 * class167.anInt1850 << 29;
		Class143 class143 = ((Class143) aClass247_2516.aClass199_2477.method2886((long) i_19_));
		if (class143 != null)
			return class143;
		if (!aClass247_2516.aClass461_2476.method5580(i_18_, -964514165))
			return null;
		Class179 class179 = Class181.method2718(aClass247_2516.aClass461_2476, i_18_, 0);
		if (class179 != null) {
			class143 = class167.method2082(class179, true);
			aClass247_2516.aClass199_2477.method2881(class143, (long) i_19_);
		}
		return class143;
	}

	public Class143 method3431(Class167 class167, int i) {
		int i_20_ = -1695002333 * anInt2525 | class167.anInt1850 * 1526643673 << 29;
		Class143 class143 = ((Class143) aClass247_2516.aClass199_2477.method2886((long) i_20_));
		if (class143 != null)
			return class143;
		if (!aClass247_2516.aClass461_2476.method5580(-1695002333 * anInt2525, -964514165))
			return null;
		Class179 class179 = Class181.method2718(aClass247_2516.aClass461_2476, anInt2525 * -1695002333, 0);
		if (null != class179) {
			class143 = class167.method2082(class179, true);
			aClass247_2516.aClass199_2477.method2881(class143, (long) i_20_);
		}
		return class143;
	}

	public Class143 method3432(Class167 class167, int i) {
		Class143 class143 = (Class143) (aClass247_2516.aClass199_2477.method2886((long) (anInt2504 * -793613357 | 0x20000 | 1526643673 * class167.anInt1850 << 29)));
		if (class143 != null)
			return class143;
		aClass247_2516.aClass461_2476.method5580(-793613357 * anInt2504, -964514165);
		Class179 class179 = Class181.method2718(aClass247_2516.aClass461_2476, -793613357 * anInt2504, 0);
		if (null != class179) {
			class143 = class167.method2082(class179, true);
			aClass247_2516.aClass199_2477.method2881(class143, (long) (anInt2504 * -793613357 | 0x20000 | 1526643673 * class167.anInt1850 << 29));
		}
		return class143;
	}

	void method3433(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt2481 = class536_sub33.readBigSmart() * 1149711835;
		else if (i == 2)
			anInt2482 = class536_sub33.readBigSmart() * -1916118953;
		else if (3 == i)
			aString2483 = class536_sub33.readString();
		else if (i == 4)
			anInt2484 = class536_sub33.read24BitUnsignedInteger() * -180963073;
		else if (i == 5)
			anInt2523 = class536_sub33.read24BitUnsignedInteger() * 2016971861;
		else if (i == 6)
			anInt2486 = class536_sub33.readUnsignedByte() * -7622749;
		else if (i == 7) {
			int i_21_ = class536_sub33.readUnsignedByte();
			if ((i_21_ & 0x1) == 0)
				aBool2492 = false;
			if (2 == (i_21_ & 0x2))
				aBool2493 = true;
		} else if (i == 8)
			class536_sub33.readUnsignedByte();
		else if (i == 9) {
			anInt2485 = class536_sub33.readUnsignedShort() * 1999689291;
			if (426165091 * anInt2485 == 65535)
				anInt2485 = -1999689291;
			anInt2500 = class536_sub33.readUnsignedShort() * -1881479131;
			if (65535 == -486607955 * anInt2500)
				anInt2500 = 1881479131;
			anInt2478 = class536_sub33.readInt() * -1840375399;
			anInt2498 = class536_sub33.readInt() * -1919900775;
		} else if (i >= 10 && i <= 14)
			aStringArray2496[i - 10] = class536_sub33.readString();
		else if (15 == i) {
			int i_22_ = class536_sub33.readUnsignedByte();
			anIntArray2497 = new int[2 * i_22_];
			for (int i_23_ = 0; i_23_ < i_22_ * 2; i_23_++)
				anIntArray2497[i_23_] = class536_sub33.readShort((byte) -121);
			anInt2509 = class536_sub33.readInt() * 1612502845;
			int i_24_ = class536_sub33.readUnsignedByte();
			anIntArray2519 = new int[i_24_];
			for (int i_25_ = 0; i_25_ < anIntArray2519.length; i_25_++)
				anIntArray2519[i_25_] = class536_sub33.readInt();
			aByteArray2521 = new byte[i_22_];
			for (int i_26_ = 0; i_26_ < i_22_; i_26_++)
				aByteArray2521[i_26_] = class536_sub33.readByte();
		} else if (16 == i)
			aBool2522 = false;
		else if (17 == i)
			aString2495 = class536_sub33.readString();
		else if (18 == i)
			anInt2504 = class536_sub33.readBigSmart() * -793893797;
		else if (19 == i)
			anInt2508 = class536_sub33.readUnsignedShort() * -282969387;
		else if (20 == i) {
			anInt2503 = class536_sub33.readUnsignedShort() * 1957270325;
			if (anInt2503 * 374368029 == 65535)
				anInt2503 = -1957270325;
			anInt2511 = class536_sub33.readUnsignedShort() * 2097056265;
			if (1125786681 * anInt2511 == 65535)
				anInt2511 = -2097056265;
			anInt2487 = class536_sub33.readInt() * -2092236185;
			anInt2502 = class536_sub33.readInt() * -1218494085;
		} else if (i == 21)
			anInt2491 = class536_sub33.readInt() * -340919351;
		else if (22 == i)
			anInt2494 = class536_sub33.readInt() * -9738933;
		else if (23 == i) {
			anInt2512 = class536_sub33.readUnsignedByte() * -1756714353;
			anInt2513 = class536_sub33.readUnsignedByte() * 1973839709;
			anInt2514 = class536_sub33.readUnsignedByte() * -1112294055;
		} else if (24 == i) {
			anInt2515 = class536_sub33.readShort((byte) -20) * 896394271;
			anInt2499 = class536_sub33.readShort((byte) -30) * -49190051;
		} else if (25 == i)
			anInt2525 = class536_sub33.readBigSmart() * -1823971701;
		else if (26 == i || i == 27) {
			anInt2485 = class536_sub33.readUnsignedShort() * 1999689291;
			if (anInt2485 * 426165091 == 65535)
				anInt2485 = -1999689291;
			anInt2500 = class536_sub33.readUnsignedShort() * -1881479131;
			if (anInt2500 * -486607955 == 65535)
				anInt2500 = 1881479131;
			int i_27_ = -1;
			if (i == 27) {
				i_27_ = class536_sub33.readUnsignedShort();
				if (i_27_ == 65535)
					i_27_ = -1;
			}
			int i_28_ = class536_sub33.readUnsignedByte();
			anIntArray2506 = new int[i_28_ + 2];
			for (int i_29_ = 0; i_29_ <= i_28_; i_29_++) {
				anIntArray2506[i_29_] = class536_sub33.readUnsignedShort();
				if (65535 == anIntArray2506[i_29_])
					anIntArray2506[i_29_] = -1;
			}
			anIntArray2506[1 + i_28_] = i_27_;
		} else if (i == 28)
			anInt2524 = class536_sub33.readUnsignedByte() * 1823493063;
		else if (29 == i)
			aClass261_2505 = ((Class261) Class682.method8091(Class344.method4485(-710630031), class536_sub33.readUnsignedByte(), 1858049507));
		else if (i == 30)
			aClass283_2518 = ((Class283) Class682.method8091(Class710_Sub17.method10091(976764257), class536_sub33.readUnsignedByte(), 1858049507));
		else if (i == 249) {
			int i_30_ = class536_sub33.readUnsignedByte();
			if (null == aClass4_2501) {
				int i_31_ = Class528.method6434(i_30_, -685720789);
				aClass4_2501 = new Class4(i_31_);
			}
			for (int i_32_ = 0; i_32_ < i_30_; i_32_++) {
				boolean bool = class536_sub33.readUnsignedByte() == 1;
				int i_33_ = class536_sub33.read24BitUnsignedInteger();
				Class536 class536;
				if (bool)
					class536 = new Class536_Sub13(class536_sub33.readString());
				else
					class536 = new Class536_Sub26(class536_sub33.readInt());
				aClass4_2501.method560(class536, (long) i_33_);
			}
		}
	}

	public String method3434(int i, String string, byte i_34_) {
		if (aClass4_2501 == null)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_2501.method556((long) i);
		if (class536_sub13 == null)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	public final Class248 method3435(Interface20 interface20, Interface18 interface18, int i) {
		int i_35_ = -1;
		if (-1 != 426165091 * anInt2485) {
			Class324 class324 = interface20.method123(anInt2485 * 426165091, -1018286558);
			if (class324 != null)
				i_35_ = interface18.method96(class324, 42541070);
		} else if (anInt2500 * -486607955 != -1) {
			Class153 class153 = interface20.method124(Class458.aClass458_5176, -486607955 * anInt2500, 323730415);
			if (null != class153)
				i_35_ = interface18.method99(class153, 1624403409);
		}
		if (i_35_ < 0 || i_35_ >= anIntArray2506.length - 1) {
			int i_36_ = anIntArray2506[anIntArray2506.length - 1];
			if (-1 != i_36_)
				return ((Class248) anInterface12_2479.method70(i_36_, (byte) -45));
			return null;
		}
		if (-1 == anIntArray2506[i_35_])
			return null;
		return (Class248) anInterface12_2479.method70(anIntArray2506[i_35_], (byte) -42);
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method3436(class536_sub33, i, 1748707631);
		}
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_37_ = class536_sub33.readUnsignedByte();
			if (i_37_ == 0)
				break;
			method3436(class536_sub33, i_37_, -713829168);
		}
	}

	public void method77() {
		if (null != anIntArray2497) {
			for (int i = 0; i < anIntArray2497.length; i += 2) {
				if (anIntArray2497[i] < -10405275 * anInt2507)
					anInt2507 = 490071917 * anIntArray2497[i];
				else if (anIntArray2497[i] > anInt2490 * -2077796911)
					anInt2490 = -567467215 * anIntArray2497[i];
				if (anIntArray2497[i + 1] < anInt2520 * -1552833791)
					anInt2520 = -1353229055 * anIntArray2497[i + 1];
				else if (anIntArray2497[i + 1] > anInt2510 * 1889839503)
					anInt2510 = anIntArray2497[i + 1] * -875408017;
			}
		}
	}

	void method3436(RSByteBuffer class536_sub33, int i, int i_38_) {
		if (i == 1)
			anInt2481 = class536_sub33.readBigSmart() * 1149711835;
		else if (i == 2)
			anInt2482 = class536_sub33.readBigSmart() * -1916118953;
		else if (3 == i)
			aString2483 = class536_sub33.readString();
		else if (i == 4)
			anInt2484 = class536_sub33.read24BitUnsignedInteger() * -180963073;
		else if (i == 5)
			anInt2523 = class536_sub33.read24BitUnsignedInteger() * 2016971861;
		else if (i == 6)
			anInt2486 = class536_sub33.readUnsignedByte() * -7622749;
		else if (i == 7) {
			int i_39_ = class536_sub33.readUnsignedByte();
			if ((i_39_ & 0x1) == 0)
				aBool2492 = false;
			if (2 == (i_39_ & 0x2))
				aBool2493 = true;
		} else if (i == 8)
			class536_sub33.readUnsignedByte();
		else if (i == 9) {
			anInt2485 = class536_sub33.readUnsignedShort() * 1999689291;
			if (426165091 * anInt2485 == 65535)
				anInt2485 = -1999689291;
			anInt2500 = class536_sub33.readUnsignedShort() * -1881479131;
			if (65535 == -486607955 * anInt2500)
				anInt2500 = 1881479131;
			anInt2478 = class536_sub33.readInt() * -1840375399;
			anInt2498 = class536_sub33.readInt() * -1919900775;
		} else if (i >= 10 && i <= 14)
			aStringArray2496[i - 10] = class536_sub33.readString();
		else if (15 == i) {
			int i_40_ = class536_sub33.readUnsignedByte();
			anIntArray2497 = new int[2 * i_40_];
			for (int i_41_ = 0; i_41_ < i_40_ * 2; i_41_++)
				anIntArray2497[i_41_] = class536_sub33.readShort((byte) -18);
			anInt2509 = class536_sub33.readInt() * 1612502845;
			int i_42_ = class536_sub33.readUnsignedByte();
			anIntArray2519 = new int[i_42_];
			for (int i_43_ = 0; i_43_ < anIntArray2519.length; i_43_++)
				anIntArray2519[i_43_] = class536_sub33.readInt();
			aByteArray2521 = new byte[i_40_];
			for (int i_44_ = 0; i_44_ < i_40_; i_44_++)
				aByteArray2521[i_44_] = class536_sub33.readByte();
		} else if (16 == i)
			aBool2522 = false;
		else if (17 == i)
			aString2495 = class536_sub33.readString();
		else if (18 == i)
			anInt2504 = class536_sub33.readBigSmart() * -793893797;
		else if (19 == i)
			anInt2508 = class536_sub33.readUnsignedShort() * -282969387;
		else if (20 == i) {
			anInt2503 = class536_sub33.readUnsignedShort() * 1957270325;
			if (anInt2503 * 374368029 == 65535)
				anInt2503 = -1957270325;
			anInt2511 = class536_sub33.readUnsignedShort() * 2097056265;
			if (1125786681 * anInt2511 == 65535)
				anInt2511 = -2097056265;
			anInt2487 = class536_sub33.readInt() * -2092236185;
			anInt2502 = class536_sub33.readInt() * -1218494085;
		} else if (i == 21)
			anInt2491 = class536_sub33.readInt() * -340919351;
		else if (22 == i)
			anInt2494 = class536_sub33.readInt() * -9738933;
		else if (23 == i) {
			anInt2512 = class536_sub33.readUnsignedByte() * -1756714353;
			anInt2513 = class536_sub33.readUnsignedByte() * 1973839709;
			anInt2514 = class536_sub33.readUnsignedByte() * -1112294055;
		} else if (24 == i) {
			anInt2515 = class536_sub33.readShort((byte) -79) * 896394271;
			anInt2499 = class536_sub33.readShort((byte) -62) * -49190051;
		} else if (25 == i)
			anInt2525 = class536_sub33.readBigSmart() * -1823971701;
		else if (26 == i || i == 27) {
			anInt2485 = class536_sub33.readUnsignedShort() * 1999689291;
			if (anInt2485 * 426165091 == 65535)
				anInt2485 = -1999689291;
			anInt2500 = class536_sub33.readUnsignedShort() * -1881479131;
			if (anInt2500 * -486607955 == 65535)
				anInt2500 = 1881479131;
			int i_45_ = -1;
			if (i == 27) {
				i_45_ = class536_sub33.readUnsignedShort();
				if (i_45_ == 65535)
					i_45_ = -1;
			}
			int i_46_ = class536_sub33.readUnsignedByte();
			anIntArray2506 = new int[i_46_ + 2];
			for (int i_47_ = 0; i_47_ <= i_46_; i_47_++) {
				anIntArray2506[i_47_] = class536_sub33.readUnsignedShort();
				if (65535 == anIntArray2506[i_47_])
					anIntArray2506[i_47_] = -1;
			}
			anIntArray2506[1 + i_46_] = i_45_;
		} else if (i == 28)
			anInt2524 = class536_sub33.readUnsignedByte() * 1823493063;
		else if (29 == i)
			aClass261_2505 = ((Class261) Class682.method8091(Class344.method4485(-1449131152), class536_sub33.readUnsignedByte(), 1858049507));
		else if (i == 30)
			aClass283_2518 = ((Class283) Class682.method8091(Class710_Sub17.method10091(33812784), class536_sub33.readUnsignedByte(), 1858049507));
		else if (i == 249) {
			int i_48_ = class536_sub33.readUnsignedByte();
			if (null == aClass4_2501) {
				int i_49_ = Class528.method6434(i_48_, -967130968);
				aClass4_2501 = new Class4(i_49_);
			}
			for (int i_50_ = 0; i_50_ < i_48_; i_50_++) {
				boolean bool = class536_sub33.readUnsignedByte() == 1;
				int i_51_ = class536_sub33.read24BitUnsignedInteger();
				Class536 class536;
				if (bool)
					class536 = new Class536_Sub13(class536_sub33.readString());
				else
					class536 = new Class536_Sub26(class536_sub33.readInt());
				aClass4_2501.method560(class536, (long) i_51_);
			}
		}
	}

	public int method3437(int i, int i_52_, byte i_53_) {
		if (null == aClass4_2501)
			return i_52_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_2501.method556((long) i);
		if (null == class536_sub26)
			return i_52_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public Class143 method3438(Class167 class167) {
		Class143 class143 = (Class143) (aClass247_2516.aClass199_2477.method2886((long) (anInt2504 * -793613357 | 0x20000 | 1526643673 * class167.anInt1850 << 29)));
		if (class143 != null)
			return class143;
		aClass247_2516.aClass461_2476.method5580(-793613357 * anInt2504, -964514165);
		Class179 class179 = Class181.method2718(aClass247_2516.aClass461_2476, -793613357 * anInt2504, 0);
		if (null != class179) {
			class143 = class167.method2082(class179, true);
			aClass247_2516.aClass199_2477.method2881(class143, (long) (anInt2504 * -793613357 | 0x20000 | 1526643673 * class167.anInt1850 << 29));
		}
		return class143;
	}

	public Class143 method3439(Class167 class167) {
		Class143 class143 = (Class143) (aClass247_2516.aClass199_2477.method2886((long) (anInt2504 * -793613357 | 0x20000 | 1526643673 * class167.anInt1850 << 29)));
		if (class143 != null)
			return class143;
		aClass247_2516.aClass461_2476.method5580(-793613357 * anInt2504, -964514165);
		Class179 class179 = Class181.method2718(aClass247_2516.aClass461_2476, -793613357 * anInt2504, 0);
		if (null != class179) {
			class143 = class167.method2082(class179, true);
			aClass247_2516.aClass199_2477.method2881(class143, (long) (anInt2504 * -793613357 | 0x20000 | 1526643673 * class167.anInt1850 << 29));
		}
		return class143;
	}

	public int method3440(int i, int i_54_) {
		if (null == aClass4_2501)
			return i_54_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_2501.method556((long) i);
		if (null == class536_sub26)
			return i_54_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public int method3441(int i, int i_55_) {
		if (null == aClass4_2501)
			return i_55_;
		Class536_Sub26 class536_sub26 = (Class536_Sub26) aClass4_2501.method556((long) i);
		if (null == class536_sub26)
			return i_55_;
		return 2083602213 * class536_sub26.anInt10533;
	}

	public String method3442(int i, String string) {
		if (aClass4_2501 == null)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_2501.method556((long) i);
		if (class536_sub13 == null)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	public String method3443(int i, String string) {
		if (aClass4_2501 == null)
			return string;
		Class536_Sub13 class536_sub13 = (Class536_Sub13) aClass4_2501.method556((long) i);
		if (class536_sub13 == null)
			return string;
		return (String) class536_sub13.anObject10468;
	}

	Class248(int i, Interface12 interface12, Class247 class247) {
		anInt2486 = 0;
		aBool2492 = true;
		aBool2493 = false;
		aStringArray2496 = new String[5];
		anInt2504 = 793893797;
		anInt2478 = 1840375399;
		anInt2498 = 1919900775;
		anInt2485 = -1999689291;
		anInt2500 = 1881479131;
		anInt2503 = -1957270325;
		anInt2511 = -2097056265;
		anIntArray2506 = null;
		anInt2507 = 1657411731;
		anInt2520 = -794254593;
		anInt2490 = -2147483648;
		anInt2510 = -2147483648;
		anInt2512 = 1756714353;
		anInt2513 = -1973839709;
		anInt2514 = 1112294055;
		aClass261_2505 = Class261.aClass261_2841;
		aClass283_2518 = Class283.aClass283_3179;
		anInt2524 = -1823493063;
		aBool2522 = true;
		anInt2508 = 282969387;
		anInt2525 = 1823971701;
		anInt2480 = i * -1090336687;
		anInterface12_2479 = interface12;
		aClass247_2516 = class247;
	}

	static int method3444(int i) {
		int i_56_ = Class483.aClass303_5431.anInt3425 * -783382047;
		if (i_56_ < Class310.aClass303Array3467.length - 1)
			Class483.aClass303_5431 = Class310.aClass303Array3467[i_56_ + 1];
		return 100;
	}

	public static int method3445(CharSequence charsequence, int i) {
		int i_57_ = charsequence.length();
		int i_58_ = 0;
		for (int i_59_ = 0; i_59_ < i_57_; i_59_++) {
			char c = charsequence.charAt(i_59_);
			if (c <= '\u007f')
				i_58_++;
			else if (c <= '\u07ff')
				i_58_ += 2;
			else
				i_58_ += 3;
		}
		return i_58_;
	}

	static final void method3446(InterfaceDefinitions class251, Class234 class234, Class668 class668, short i) {
		class251.anInt2636 = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * 1355450591;
		Class668.method8011(class251, 263642117);
		if (-809980533 * class251.anInt2546 == -1 && !class234.aBool2379)
			Class34_Sub12.method10335(class251.anInt2559 * -1591767037, 1933001832);
	}

	static final void method3447(Class668 class668, byte i) {
		long l = (class668.aLongArray8565[(class668.anInt8546 -= 1792517805) * 1346022693]);
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = -1L == l ? "" : Long.toString(l, 36).toUpperCase();
	}

	static final void method3448(Class668 class668, int i) {
		Class542_Sub1.aBool10708 = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
	}

	static final void method3449(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class603.method7202(string, (byte) 1);
	}
}
