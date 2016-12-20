/* Class454 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class454 {
	int anInt4969;
	public static Class454 aClass454_4970 = new Class454(0);
	static Class454 aClass454_4971 = new Class454(1);
	public static Class452 aClass452_4972;

	Class454(int i) {
		anInt4969 = i * -1466724457;
	}

	static RSByteBuffer method7337(int i) {
		RSByteBuffer class527_sub38 = Class708.method14376(-2142886602);
		long l;
		if (-1552456759 * Class32.anInt274 != -1)
			l = (long) (Class32.anInt274 * -1552456759);
		else if (-1L == Class32.aLong321 * -8573635942399706625L)
			l = Class525.method8726(Class32.aString289, -141984090);
		else
			l = Class32.aLong321 * -8573635942399706625L;
		Class684.aLong8653 = 8116618987213126071L * l;
		Class586.method9783(class527_sub38, l);
		class527_sub38.writeString(Class32.aString306, -1553126256);
		class527_sub38.writeLong(Class32.aLong304 * 8955827681536040585L);
		class527_sub38.writeLong(client.aLong11281 * 3809206929332399715L);
		class527_sub38.method16650(Class52.LOGIN_PUBLIC_EXPONENT, Class52.LOGIN_PUBLIC_MODULUS, (byte) -27);
		return class527_sub38;
	}

	static final void method7338(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_0_ >= 1 && i_0_ <= 2) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub2_10596), i_0_, 940006637);
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub2_10617), i_0_, -38906428);
			Class631.method10465(1219605327);
		}
	}

	static final void method7339(Class665 class665, int i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class249 class249 = ((Class249) Class457.aClass24_Sub12_5063.method81(i_1_, -682956066));
		if (null == class249.aString2737)
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class249.aString2737;
	}

	static final void method7340(Class665 class665, byte i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, -1417682120);
		Class240 class240 = Class183.aClass240Array2100[i_2_ >> 16];
		Class194.method3701(class243, class240, class665, 1769813785);
	}

	static final void method7341(Class665 class665, byte i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, 252669898);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.method17815(class243).method16255((byte) 39);
	}
}
