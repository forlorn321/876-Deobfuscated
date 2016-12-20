/* Class208_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub22 extends Class208 {
	int anInt9963;
	int anInt9964;
	int anInt9965;
	int anInt9966;
	Class483 aClass483_9967;

	Class208_Sub22(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9964 = class527_sub38.readUnsignedShort() * 1445007665;
		anInt9963 = class527_sub38.readUnsignedByte() * -1270475813;
		anInt9965 = class527_sub38.readUnsignedByte() * 163751233;
		anInt9966 = class527_sub38.readUnsignedByte() * -254730541;
		aClass483_9967 = Class245.aClass226_2698.method4211(Class193.aClass193_2150, this, 1189783505 * anInt9964, anInt9966 * -478877349, anInt9963 * -1322012589, Class206.aClass206_2228.method3836(-1219102877), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, anInt9965 * 674556609, false, (byte) 40);
		if (null != aClass483_9967)
			aClass483_9967.method7851((byte) 0);
	}

	void method3850(byte i) {
		if (aClass483_9967 != null) {
			aClass483_9967.method7864(50, (byte) 6);
			Class245.aClass226_2698.method4215(aClass483_9967, (byte) -1);
			aClass483_9967 = null;
		}
	}

	public void method3848() {
		if (aClass483_9967 != null)
			aClass483_9967.method7852(1969554825);
	}

	public void method3851() {
		if (aClass483_9967 != null)
			aClass483_9967.method7852(1969554825);
	}

	public void method3846(int i) {
		if (aClass483_9967 != null)
			aClass483_9967.method7852(1969554825);
	}

	void method3852() {
		if (aClass483_9967 != null) {
			aClass483_9967.method7864(50, (byte) 6);
			Class245.aClass226_2698.method4215(aClass483_9967, (byte) -1);
			aClass483_9967 = null;
		}
	}

	void method3853() {
		if (aClass483_9967 != null) {
			aClass483_9967.method7864(50, (byte) 6);
			Class245.aClass226_2698.method4215(aClass483_9967, (byte) -1);
			aClass483_9967 = null;
		}
	}

	void method3854() {
		if (aClass483_9967 != null) {
			aClass483_9967.method7864(50, (byte) 6);
			Class245.aClass226_2698.method4215(aClass483_9967, (byte) -1);
			aClass483_9967 = null;
		}
	}

	public static void method15638(byte i) {
		int i_0_ = 0;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub8_10601.method16916(-805741433) == 1) {
			i_0_ |= 0x1;
			i_0_ |= 0x10;
			i_0_ |= 0x20;
			i_0_ |= 0x2;
			i_0_ |= 0x4;
		}
		if (Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-1670187423) == 0)
			i_0_ |= 0x40;
		Class275.method5140(i_0_, (byte) -37);
		client.aClass509_11072.method8310(-1444106383).method17373(i_0_, 1371735012);
		Class396.aClass506_4119.method8231(1813554760).method8310(-780608649).method17373(i_0_, 1371735012);
		Class174_Sub2.aClass24_Sub17_9120.method17408(i_0_, -999018526);
		Class381.aClass24_Sub9_3936.method17385(i_0_, (byte) 93);
		Class57.aClass24_Sub4_720.method17362(i_0_, (byte) 87);
		Class269.method5058(i_0_, (short) 2048);
		Class214.method3903(i_0_, -736203091);
		Class630.method10431(i_0_, 49846687);
		Class697.method14267(i_0_, 72145066);
		Class214.method3902(i_0_, -543185506);
		client.aClass509_11072.method8361(-428559959);
	}

	static final void method15639(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class420.aClass273_4591.method5116(string, 135321610);
	}

	static final void method15640(Class243 class243, int i, int i_1_, int i_2_, Class665 class665, int i_3_) {
		if (class243.anIntArray2508 == null)
			throw new RuntimeException();
		class243.anIntArray2508[i] = i_1_;
		class243.anIntArray2590[i] = i_2_;
	}

	static final void method15641(Class243 class243, Class240 class240, Class665 class665, int i) {
		class665.anInt8526 -= 409523364;
		class243.anInt2507 = 1644512035 * (class665.anIntArray8525[class665.anInt8526 * 1769813785]);
		class243.anInt2534 = (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1] * 167234469);
		int i_4_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 2];
		if (i_4_ < 0)
			i_4_ = 0;
		else if (i_4_ > 5)
			i_4_ = 5;
		int i_5_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 3];
		if (i_5_ < 0)
			i_5_ = 0;
		else if (i_5_ > 5)
			i_5_ = 5;
		class243.aByte2503 = (byte) i_4_;
		class243.aByte2488 = (byte) i_5_;
		Class430.method6876(class243, (byte) 93);
		Class209.method3869(class240, class243, -1778055362);
		if (0 == class243.anInt2501 * -270144907)
			Class397.method6513(class240, class243, false, 1940372441);
		if (-1 == class243.anInt2675 * -927924265 && !class240.aBool2394)
			Class592.method9878(class243.anInt2504 * -254728301, -2114762155);
	}
}
