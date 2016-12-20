/* Class544 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class544 implements Interface14 {
	public int anInt7244;
	static final int anInt7245 = 70;
	public int anInt7246 = -2054849391;
	public int anInt7247 = -1421803205;
	public int anInt7248 = 766171285;
	Class547 aClass547_7249;
	public int anInt7250;
	public int anInt7251;
	public int anInt7252;
	public int anInt7253 = -1871210395;
	public int anInt7254;
	public int anInt7255;
	public int anInt7256;

	void method9029(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			class527_sub38.readUnsignedShort();
		else if (2 == i)
			anInt7246 = class527_sub38.readUnsignedByte() * -412290449;
		else if (i == 3)
			anInt7247 = class527_sub38.readUnsignedByte() * -679296059;
		else if (i == 4)
			anInt7248 = 0;
		else if (i == 5)
			anInt7250 = class527_sub38.readUnsignedShort() * -1668341587;
		else if (6 == i)
			class527_sub38.readUnsignedByte();
		else if (i == 7)
			anInt7251 = class527_sub38.method16466(-1923672299) * -1262514891;
		else if (i == 8)
			anInt7244 = class527_sub38.method16466(-1619607385) * -180762521;
		else if (i == 9)
			anInt7256 = class527_sub38.method16466(-1806436664) * -247199347;
		else if (i == 10)
			anInt7254 = class527_sub38.method16466(-1846590512) * 166425047;
		else if (11 == i)
			anInt7248 = class527_sub38.readUnsignedShort() * -766171285;
		else if (i == 12)
			anInt7255 = class527_sub38.method16466(-1989392102) * -1210367037;
		else if (13 == i)
			anInt7252 = class527_sub38.method16466(-1815926886) * 151597113;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method9030(class527_sub38, i_0_, -1058935553);
		}
	}

	void method9030(RSByteBuffer class527_sub38, int i, int i_1_) {
		if (i == 1)
			class527_sub38.readUnsignedShort();
		else if (2 == i)
			anInt7246 = class527_sub38.readUnsignedByte() * -412290449;
		else if (i == 3)
			anInt7247 = class527_sub38.readUnsignedByte() * -679296059;
		else if (i == 4)
			anInt7248 = 0;
		else if (i == 5)
			anInt7250 = class527_sub38.readUnsignedShort() * -1668341587;
		else if (6 == i)
			class527_sub38.readUnsignedByte();
		else if (i == 7)
			anInt7251 = class527_sub38.method16466(-1849729601) * -1262514891;
		else if (i == 8)
			anInt7244 = class527_sub38.method16466(-1678320937) * -180762521;
		else if (i == 9)
			anInt7256 = class527_sub38.method16466(-2113683963) * -247199347;
		else if (i == 10)
			anInt7254 = class527_sub38.method16466(-2033476011) * 166425047;
		else if (11 == i)
			anInt7248 = class527_sub38.readUnsignedShort() * -766171285;
		else if (i == 12)
			anInt7255 = class527_sub38.method16466(-1925716434) * -1210367037;
		else if (13 == i)
			anInt7252 = class527_sub38.method16466(-1728578876) * 151597113;
	}

	void method9031(Class180 class180) {
		method9036(class180, -975823587 * anInt7251, (byte) -83);
		method9036(class180, anInt7244 * -1353657513, (byte) -61);
		method9036(class180, 1660379461 * anInt7256, (byte) -1);
		method9036(class180, 1883967975 * anInt7254, (byte) -127);
		method9036(class180, 919815403 * anInt7255, (byte) -99);
		method9036(class180, 1039908361 * anInt7252, (byte) -109);
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method9030(class527_sub38, i, 1814743816);
		}
	}

	void method9032(Class180 class180, int i) {
		method9036(class180, -975823587 * anInt7251, (byte) -119);
		method9036(class180, anInt7244 * -1353657513, (byte) -122);
		method9036(class180, 1660379461 * anInt7256, (byte) -94);
		method9036(class180, 1883967975 * anInt7254, (byte) -24);
		method9036(class180, 919815403 * anInt7255, (byte) -77);
		method9036(class180, 1039908361 * anInt7252, (byte) -119);
	}

	public void method86(int i) {
		/* empty */
	}

	public Class147 method9033(Class180 class180, int i, int i_2_) {
		if (i < 0)
			return null;
		Class147 class147 = (Class147) aClass547_7249.aClass205_7266.method3787((long) i);
		if (null == class147) {
			method9032(class180, 1886410447);
			class147 = ((Class147) aClass547_7249.aClass205_7266.method3787((long) i));
		}
		return class147;
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method9030(class527_sub38, i, 2091360239);
		}
	}

	Class544(int i, Class547 class547) {
		anInt7250 = -819794098;
		anInt7251 = 1262514891;
		anInt7244 = 180762521;
		anInt7256 = 247199347;
		anInt7254 = -166425047;
		anInt7255 = 1210367037;
		anInt7252 = -151597113;
		aClass547_7249 = class547;
	}

	public void method84() {
		/* empty */
	}

	void method9034(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			class527_sub38.readUnsignedShort();
		else if (2 == i)
			anInt7246 = class527_sub38.readUnsignedByte() * -412290449;
		else if (i == 3)
			anInt7247 = class527_sub38.readUnsignedByte() * -679296059;
		else if (i == 4)
			anInt7248 = 0;
		else if (i == 5)
			anInt7250 = class527_sub38.readUnsignedShort() * -1668341587;
		else if (6 == i)
			class527_sub38.readUnsignedByte();
		else if (i == 7)
			anInt7251 = class527_sub38.method16466(-2099374899) * -1262514891;
		else if (i == 8)
			anInt7244 = class527_sub38.method16466(-1768196416) * -180762521;
		else if (i == 9)
			anInt7256 = class527_sub38.method16466(-1742664179) * -247199347;
		else if (i == 10)
			anInt7254 = class527_sub38.method16466(-2027679934) * 166425047;
		else if (11 == i)
			anInt7248 = class527_sub38.readUnsignedShort() * -766171285;
		else if (i == 12)
			anInt7255 = class527_sub38.method16466(-1609643740) * -1210367037;
		else if (13 == i)
			anInt7252 = class527_sub38.method16466(-1846397014) * 151597113;
	}

	void method9035(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			class527_sub38.readUnsignedShort();
		else if (2 == i)
			anInt7246 = class527_sub38.readUnsignedByte() * -412290449;
		else if (i == 3)
			anInt7247 = class527_sub38.readUnsignedByte() * -679296059;
		else if (i == 4)
			anInt7248 = 0;
		else if (i == 5)
			anInt7250 = class527_sub38.readUnsignedShort() * -1668341587;
		else if (6 == i)
			class527_sub38.readUnsignedByte();
		else if (i == 7)
			anInt7251 = class527_sub38.method16466(-2017397616) * -1262514891;
		else if (i == 8)
			anInt7244 = class527_sub38.method16466(-2064042319) * -180762521;
		else if (i == 9)
			anInt7256 = class527_sub38.method16466(-1726580628) * -247199347;
		else if (i == 10)
			anInt7254 = class527_sub38.method16466(-1650105124) * 166425047;
		else if (11 == i)
			anInt7248 = class527_sub38.readUnsignedShort() * -766171285;
		else if (i == 12)
			anInt7255 = class527_sub38.method16466(-1758286081) * -1210367037;
		else if (13 == i)
			anInt7252 = class527_sub38.method16466(-1785492931) * 151597113;
	}

	void method9036(Class180 class180, int i, byte i_3_) {
		Class459 class459 = aClass547_7249.aClass459_7267;
		if (i >= 0 && aClass547_7249.aClass205_7266.method3787((long) i) == null && class459.method7480(i, 233607775)) {
			Class185 class185 = Class165.method2665(class459, i);
			aClass547_7249.aClass205_7266.method3790(class180.method3271(class185, true), (long) i);
		}
	}

	void method9037(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			class527_sub38.readUnsignedShort();
		else if (2 == i)
			anInt7246 = class527_sub38.readUnsignedByte() * -412290449;
		else if (i == 3)
			anInt7247 = class527_sub38.readUnsignedByte() * -679296059;
		else if (i == 4)
			anInt7248 = 0;
		else if (i == 5)
			anInt7250 = class527_sub38.readUnsignedShort() * -1668341587;
		else if (6 == i)
			class527_sub38.readUnsignedByte();
		else if (i == 7)
			anInt7251 = class527_sub38.method16466(-1621478479) * -1262514891;
		else if (i == 8)
			anInt7244 = class527_sub38.method16466(-1996780194) * -180762521;
		else if (i == 9)
			anInt7256 = class527_sub38.method16466(-1780624298) * -247199347;
		else if (i == 10)
			anInt7254 = class527_sub38.method16466(-2059331881) * 166425047;
		else if (11 == i)
			anInt7248 = class527_sub38.readUnsignedShort() * -766171285;
		else if (i == 12)
			anInt7255 = class527_sub38.method16466(-1876375741) * -1210367037;
		else if (13 == i)
			anInt7252 = class527_sub38.method16466(-1671954997) * 151597113;
	}

	public Class147 method9038(Class180 class180, int i) {
		if (i < 0)
			return null;
		Class147 class147 = (Class147) aClass547_7249.aClass205_7266.method3787((long) i);
		if (null == class147) {
			method9032(class180, 1094459581);
			class147 = ((Class147) aClass547_7249.aClass205_7266.method3787((long) i));
		}
		return class147;
	}

	public Class147 method9039(Class180 class180, int i) {
		if (i < 0)
			return null;
		Class147 class147 = (Class147) aClass547_7249.aClass205_7266.method3787((long) i);
		if (null == class147) {
			method9032(class180, 2067507619);
			class147 = ((Class147) aClass547_7249.aClass205_7266.method3787((long) i));
		}
		return class147;
	}

	void method9040(Class180 class180, int i) {
		Class459 class459 = aClass547_7249.aClass459_7267;
		if (i >= 0 && aClass547_7249.aClass205_7266.method3787((long) i) == null && class459.method7480(i, -1045267324)) {
			Class185 class185 = Class165.method2665(class459, i);
			aClass547_7249.aClass205_7266.method3790(class180.method3271(class185, true), (long) i);
		}
	}

	void method9041(Class180 class180, int i) {
		Class459 class459 = aClass547_7249.aClass459_7267;
		if (i >= 0 && aClass547_7249.aClass205_7266.method3787((long) i) == null && class459.method7480(i, 871775607)) {
			Class185 class185 = Class165.method2665(class459, i);
			aClass547_7249.aClass205_7266.method3790(class180.method3271(class185, true), (long) i);
		}
	}

	public void method85() {
		/* empty */
	}

	void method9042(Class180 class180) {
		method9036(class180, -975823587 * anInt7251, (byte) -37);
		method9036(class180, anInt7244 * -1353657513, (byte) -95);
		method9036(class180, 1660379461 * anInt7256, (byte) -47);
		method9036(class180, 1883967975 * anInt7254, (byte) -33);
		method9036(class180, 919815403 * anInt7255, (byte) -97);
		method9036(class180, 1039908361 * anInt7252, (byte) -20);
	}

	static void method9043(int i) {
		synchronized (Class55.aClass205_709) {
			Class55.aClass205_709.method3820(-1350386898);
		}
	}

	public static void method9044(int i, int i_4_) {
		Class527_Sub24_Sub11.method18288(i, -779868085);
	}
}
