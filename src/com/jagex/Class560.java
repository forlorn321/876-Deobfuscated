/* Class560 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class560 {
	short[] aShortArray7533;
	public static final int anInt7534 = 2;
	byte aByte7535;
	public static final int anInt7536 = 4;
	short aShort7537;
	short aShort7538;
	byte aByte7539;
	short aShort7540;
	short aShort7541;
	public static final int anInt7542 = 1;
	int[] anIntArray7543;
	int[] anIntArray7544;
	int[] anIntArray7545;
	public static final int anInt7546 = 16;
	short[] aShortArray7547;
	short[] aShortArray7548;
	public static final int anInt7549 = 8;

	Class560(Class555 class555, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		aByte7535 = (byte) i;
		aByte7539 = (byte) i_0_;
		anIntArray7544 = new int[4];
		anIntArray7545 = new int[4];
		anIntArray7543 = new int[4];
		anIntArray7544[0] = i_1_;
		anIntArray7544[1] = i_2_;
		anIntArray7544[2] = i_3_;
		anIntArray7544[3] = i_4_;
		anIntArray7545[0] = i_5_;
		anIntArray7545[1] = i_6_;
		anIntArray7545[2] = i_7_;
		anIntArray7545[3] = i_8_;
		anIntArray7543[0] = i_9_;
		anIntArray7543[1] = i_10_;
		anIntArray7543[2] = i_11_;
		anIntArray7543[3] = i_12_;
		aShort7540 = (short) (i_1_ >> class555.anInt7421 * 1742303003);
		aShort7541 = (short) (i_3_ >> class555.anInt7421 * 1742303003);
		aShort7537 = (short) (i_9_ >> 1742303003 * class555.anInt7421);
		aShort7538 = (short) (i_11_ >> 1742303003 * class555.anInt7421);
		aShortArray7547 = new short[4];
		aShortArray7548 = new short[4];
		aShortArray7533 = new short[4];
	}

	static final void method9449(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (Class177.aClass527_Sub40_2048.anInt10721 * 529936607 < 512 || client.aBool10999 || client.aBool11016) ? 1 : 0;
	}

	public static Class23 method9450(Class9 class9, RSByteBuffer class527_sub38, byte i) {
		return Class703.method14308(class9, class527_sub38, 2, (byte) 22);
	}

	static final void method9451(Class527_Sub2 class527_sub2, boolean bool, byte i) {
		if (class527_sub2.aBool10356) {
			if (207415441 * class527_sub2.anInt10347 < 0 || Class157.method2563(client.aClass509_11072.method8310(-951103731), class527_sub2.anInt10347 * 207415441, class527_sub2.anInt10350 * -1673605725, -1903386388)) {
				if (!bool)
					Class654.method10915(class527_sub2.anInt10348 * 1986250821, 966881501 * class527_sub2.anInt10358, 1182093437 * class527_sub2.anInt10346, class527_sub2.anInt10345 * -677418425, class527_sub2.anInt10347 * 207415441, (-1708989899 * class527_sub2.anInt10349), (-1673605725 * class527_sub2.anInt10350), -1, 0, -492434390);
				else
					Class282.method5197(class527_sub2.anInt10348 * 1986250821, class527_sub2.anInt10358 * 966881501, class527_sub2.anInt10346 * 1182093437, -677418425 * class527_sub2.anInt10345, null, (byte) -17);
				class527_sub2.method8735(-1889161967);
			}
		} else if (class527_sub2.aBool10355 && 1182093437 * class527_sub2.anInt10346 >= 1 && -677418425 * class527_sub2.anInt10345 >= 1 && (1182093437 * class527_sub2.anInt10346 <= client.aClass509_11072.method8284((byte) 14) - 2) && (-677418425 * class527_sub2.anInt10345 <= client.aClass509_11072.method8285(1866442929) - 2)
				&& (1059125193 * class527_sub2.anInt10351 < 0 || Class157.method2563(client.aClass509_11072.method8310(492442799), (class527_sub2.anInt10351 * 1059125193), (-925936527 * class527_sub2.anInt10344), -1842403310))) {
			if (!bool)
				Class654.method10915(class527_sub2.anInt10348 * 1986250821, class527_sub2.anInt10358 * 966881501, class527_sub2.anInt10346 * 1182093437, -677418425 * class527_sub2.anInt10345, class527_sub2.anInt10351 * 1059125193, class527_sub2.anInt10352 * 1808463735, class527_sub2.anInt10344 * -925936527, -1, 0, -492434390);
			else
				Class282.method5197(class527_sub2.anInt10348 * 1986250821, class527_sub2.anInt10358 * 966881501, class527_sub2.anInt10346 * 1182093437, class527_sub2.anInt10345 * -677418425, class527_sub2.aClass599_10354, (byte) -62);
			class527_sub2.aBool10355 = false;
			if (!bool && (207415441 * class527_sub2.anInt10347 == class527_sub2.anInt10351 * 1059125193) && 207415441 * class527_sub2.anInt10347 == -1)
				class527_sub2.method8735(-1889161967);
			else if (!bool && (1059125193 * class527_sub2.anInt10351 == class527_sub2.anInt10347 * 207415441) && (-1708989899 * class527_sub2.anInt10349 == class527_sub2.anInt10352 * 1808463735) && (class527_sub2.anInt10344 * -925936527 == -1673605725 * class527_sub2.anInt10350))
				class527_sub2.method8735(-1889161967);
		}
	}
}
