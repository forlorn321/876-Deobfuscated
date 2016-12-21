/* Class647 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class647 implements Interface13, Interface7 {
	public boolean aBool8362;
	int anInt8363;
	public int anInt8364 = 0;
	public int anInt8365 = -1883456873;
	public int anInt8366;
	public int anInt8367;
	public int anInt8368;
	public boolean aBool8369;
	public int anInt8370;
	public boolean aBool8371;
	public int anInt8372;
	static final int anInt8373 = 1190717;
	public int anInt8374;
	public int anInt8375;
	public int anInt8376;
	public int anInt8377;

	public void method56(int i) {
		anInt8363 = i * -2072138289;
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method7811(class536_sub33, i_0_, 1734811109);
		}
	}

	void method7811(RSByteBuffer class536_sub33, int i, int i_1_) {
		if (i == 1)
			anInt8364 = Class449.method5416(class536_sub33.read24BitUnsignedInteger(1284000565), (byte) 50) * 1852842473;
		else if (i == 2)
			anInt8365 = class536_sub33.readUnsignedByte() * 1883456873;
		else if (i == 3) {
			anInt8365 = class536_sub33.readUnsignedShort() * 1883456873;
			if (anInt8365 * 22125273 == 65535)
				anInt8365 = -1883456873;
		} else if (5 == i)
			aBool8362 = false;
		else if (i == 7)
			anInt8366 = Class449.method5416(class536_sub33.read24BitUnsignedInteger(1258087298), (byte) 5) * -114755775;
		else if (8 != i) {
			if (9 == i)
				anInt8372 = ((class536_sub33.readUnsignedShort() << 2) * 204951213);
			else if (10 == i)
				aBool8369 = false;
			else if (i == 11)
				anInt8370 = class536_sub33.readUnsignedByte() * -114962495;
			else if (12 == i)
				aBool8371 = true;
			else if (i == 13)
				anInt8367 = class536_sub33.read24BitUnsignedInteger(986149512) * 1189193267;
			else if (i == 14)
				anInt8368 = (class536_sub33.readUnsignedByte() << 2) * 225541593;
			else if (16 == i)
				anInt8374 = class536_sub33.readUnsignedByte() * 512389045;
			else if (20 == i)
				anInt8375 = class536_sub33.readUnsignedShort() * 359893901;
			else if (i == 21)
				anInt8376 = class536_sub33.readUnsignedByte() * 824514893;
			else if (22 == i)
				anInt8377 = class536_sub33.readUnsignedShort() * 703894231;
		}
	}

	public void method58(int i) {
		anInt8363 = i * -2072138289;
	}

	public void method59(int i, int i_2_) {
		anInt8363 = i * -2072138289;
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method7811(class536_sub33, i, 1734811109);
		}
	}

	public void method77() {
		anInt8370 = -114962495 * (653672513 * anInt8370 << 8 | anInt8363 * 1940273455);
	}

	public void method57(int i) {
		anInt8363 = i * -2072138289;
	}

	void method7812(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt8364 = Class449.method5416(class536_sub33.read24BitUnsignedInteger(903994787), (byte) -33) * 1852842473;
		else if (i == 2)
			anInt8365 = class536_sub33.readUnsignedByte() * 1883456873;
		else if (i == 3) {
			anInt8365 = class536_sub33.readUnsignedShort() * 1883456873;
			if (anInt8365 * 22125273 == 65535)
				anInt8365 = -1883456873;
		} else if (5 == i)
			aBool8362 = false;
		else if (i == 7)
			anInt8366 = Class449.method5416(class536_sub33.read24BitUnsignedInteger(1789269078), (byte) 21) * -114755775;
		else if (8 != i) {
			if (9 == i)
				anInt8372 = ((class536_sub33.readUnsignedShort() << 2) * 204951213);
			else if (10 == i)
				aBool8369 = false;
			else if (i == 11)
				anInt8370 = class536_sub33.readUnsignedByte() * -114962495;
			else if (12 == i)
				aBool8371 = true;
			else if (i == 13)
				anInt8367 = class536_sub33.read24BitUnsignedInteger(1301969592) * 1189193267;
			else if (i == 14)
				anInt8368 = ((class536_sub33.readUnsignedByte() << 2) * 225541593);
			else if (16 == i)
				anInt8374 = class536_sub33.readUnsignedByte() * 512389045;
			else if (20 == i)
				anInt8375 = class536_sub33.readUnsignedShort() * 359893901;
			else if (i == 21)
				anInt8376 = class536_sub33.readUnsignedByte() * 824514893;
			else if (22 == i)
				anInt8377 = class536_sub33.readUnsignedShort() * 703894231;
		}
	}

	public void method75(byte i) {
		anInt8370 = -114962495 * (653672513 * anInt8370 << 8 | anInt8363 * 1940273455);
	}

	Class647() {
		aBool8362 = true;
		anInt8366 = 114755775;
		anInt8372 = 1855805952;
		aBool8369 = true;
		anInt8370 = -919699960;
		aBool8371 = false;
		anInt8367 = 2051353383;
		anInt8368 = 1549760064;
		anInt8374 = 1810187595;
		anInt8375 = 1198479283;
		anInt8376 = 0;
		anInt8377 = 2099557824;
	}

	void method7813(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt8364 = Class449.method5416(class536_sub33.read24BitUnsignedInteger(786261806), (byte) 51) * 1852842473;
		else if (i == 2)
			anInt8365 = class536_sub33.readUnsignedByte() * 1883456873;
		else if (i == 3) {
			anInt8365 = class536_sub33.readUnsignedShort() * 1883456873;
			if (anInt8365 * 22125273 == 65535)
				anInt8365 = -1883456873;
		} else if (5 == i)
			aBool8362 = false;
		else if (i == 7)
			anInt8366 = Class449.method5416(class536_sub33.read24BitUnsignedInteger(2043304224), (byte) 30) * -114755775;
		else if (8 != i) {
			if (9 == i)
				anInt8372 = ((class536_sub33.readUnsignedShort() << 2) * 204951213);
			else if (10 == i)
				aBool8369 = false;
			else if (i == 11)
				anInt8370 = class536_sub33.readUnsignedByte() * -114962495;
			else if (12 == i)
				aBool8371 = true;
			else if (i == 13)
				anInt8367 = class536_sub33.read24BitUnsignedInteger(1343775908) * 1189193267;
			else if (i == 14)
				anInt8368 = (class536_sub33.readUnsignedByte() << 2) * 225541593;
			else if (16 == i)
				anInt8374 = class536_sub33.readUnsignedByte() * 512389045;
			else if (20 == i)
				anInt8375 = class536_sub33.readUnsignedShort() * 359893901;
			else if (i == 21)
				anInt8376 = class536_sub33.readUnsignedByte() * 824514893;
			else if (22 == i)
				anInt8377 = class536_sub33.readUnsignedShort() * 703894231;
		}
	}

	static int method7814(int i) {
		if (16711935 == i)
			return -1;
		return Class330.method4319(i, 1937234640);
	}

	static final void method7815(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3260(1620142649).size();
	}

	static final void method7816(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_3_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		boolean bool = 1 == (class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1]);
		if (!Class410.method4999(i_3_, bool, 1421467345))
			throw new RuntimeException();
	}
}
