/* Class633 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class633 {
	public static Class633 aClass633_8248;
	static Class633 aClass633_8249;
	static Class633 aClass633_8250;
	static Class633 aClass633_8251;
	static Class633 aClass633_8252;
	static Class633 aClass633_8253;
	static Class633 aClass633_8254;
	static Class633 aClass633_8255;
	static Class633 aClass633_8256;
	public static Class633 aClass633_8257 = new Class633(1);
	public int anInt8258;
	static long aLong8259;
	public static Class34_Sub15 aClass34_Sub15_8260;

	static {
		aClass633_8249 = new Class633(2);
		aClass633_8253 = new Class633(3);
		aClass633_8248 = new Class633(4);
		aClass633_8250 = new Class633(5);
		aClass633_8256 = new Class633(6);
		aClass633_8254 = new Class633(7);
		aClass633_8255 = new Class633(8);
		aClass633_8251 = new Class633(9);
		aClass633_8252 = new Class633(10);
	}

	Class633(int i) {
		anInt8258 = i * -1941974779;
	}

	static final void method7543(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class216.method3091(class251, class234, class668, -1570523505);
	}

	static final void method7544(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		class668.anInt8542 -= 1472892954;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		Class2 class2 = Class196.aClass410_2202.method4981(client.anInterface51_11196, i_1_, 686774428);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class2.method541(string, i_0_, Class195.aClass143Array2201, 601823666);
	}

	static final void method7545(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.antiAliasingSetting.method10156();
	}

	static void method7546(Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int i, int i_2_, int i_3_, int i_4_) {
		BASTypeDecoder class589 = class649_sub1_sub5_sub1.method10877(-1858829304);
		Class688_Sub3 class688_sub3 = class649_sub1_sub5_sub1.aClass688_Sub3_11914;
		int i_5_ = ((-1999712379 * class649_sub1_sub5_sub1.anInt11939 - class649_sub1_sub5_sub1.aClass62_11940.anInt700 * 897724319) & 0x3fff);
		if (Class680.aClass680_8643.aByte8644 == i) {
			if (0 != i_5_ || -1883036047 * class649_sub1_sub5_sub1.anInt11937 > 25) {
				if (i_3_ < 0 && -1511615581 * class589.anInt7745 != -1) {
					class688_sub3.method8151(class589.anInt7745 * -1511615581, false, true, (byte) -114);
					class688_sub3.aBool10975 = false;
				} else if (i_3_ > 0 && -1 != 347363283 * class589.anInt7746) {
					class688_sub3.method8151(347363283 * class589.anInt7746, false, true, (byte) -126);
					class688_sub3.aBool10975 = false;
				} else if (!class688_sub3.aBool10975 || !class589.method7090(class688_sub3.method8120((byte) 57), 900823373)) {
					class688_sub3.method8151(class589.method7095((byte) -66), false, true, (byte) -65);
					class688_sub3.aBool10975 = class649_sub1_sub5_sub1.aClass688_Sub3_11914.method8121(-1340714704);
				}
			} else if (!class688_sub3.aBool10975 || !class589.method7090(class688_sub3.method8120((byte) 46), 900823373)) {
				class688_sub3.method8151(class589.method7095((byte) -53), false, true, (byte) -102);
				class688_sub3.aBool10975 = class688_sub3.method8121(-1577584470);
			}
		} else if (class649_sub1_sub5_sub1.anInt11911 * -1375730507 != -1 && (i_5_ >= 10240 || i_5_ <= 2048)) {
			int i_6_ = ((client.anIntArray11190[i_2_] - (897724319 * class649_sub1_sub5_sub1.aClass62_11940.anInt700)) & 0x3fff);
			if (Class680.aClass680_8640.aByte8644 == i && -1 != -1967774449 * class589.anInt7751) {
				if (i_6_ > 2048 && i_6_ <= 6144 && -1 != -461301069 * class589.anInt7754)
					class688_sub3.method8151(-461301069 * class589.anInt7754, false, true, (byte) -71);
				else if (i_6_ >= 10240 && i_6_ < 14336 && -1062537651 * class589.anInt7741 != -1)
					class688_sub3.method8151(-1062537651 * class589.anInt7741, false, true, (byte) -63);
				else if (i_6_ > 6144 && i_6_ < 10240 && -1 != class589.anInt7752 * 1554006571)
					class688_sub3.method8151(class589.anInt7752 * 1554006571, false, true, (byte) -52);
				else
					class688_sub3.method8151(class589.anInt7751 * -1967774449, false, true, (byte) -46);
			} else if (Class680.aClass680_8638.aByte8644 == i && 1910615395 * class589.anInt7755 != -1) {
				if (i_6_ > 2048 && i_6_ <= 6144 && -1 != class589.anInt7758 * 592656773)
					class688_sub3.method8151(class589.anInt7758 * 592656773, false, true, (byte) -128);
				else if (i_6_ >= 10240 && i_6_ < 14336 && class589.anInt7757 * -1930617513 != -1)
					class688_sub3.method8151(-1930617513 * class589.anInt7757, false, true, (byte) -107);
				else if (i_6_ > 6144 && i_6_ < 10240 && class589.anInt7766 * 183104283 != -1)
					class688_sub3.method8151(class589.anInt7766 * 183104283, false, true, (byte) -20);
				else
					class688_sub3.method8151(1910615395 * class589.anInt7755, false, true, (byte) -36);
			} else if (i_6_ > 2048 && i_6_ <= 6144 && -1 != -204531703 * class589.anInt7750)
				class688_sub3.method8151(-204531703 * class589.anInt7750, false, true, (byte) -35);
			else if (i_6_ >= 10240 && i_6_ < 14336 && -1 != 1568969531 * class589.anInt7753)
				class688_sub3.method8151(1568969531 * class589.anInt7753, false, true, (byte) -58);
			else if (i_6_ > 6144 && i_6_ < 10240 && -1 != -2092395793 * class589.anInt7748)
				class688_sub3.method8151(class589.anInt7748 * -2092395793, false, true, (byte) -43);
			else
				class688_sub3.method8151(class589.anInt7747 * -1313783865, false, true, (byte) -59);
			class688_sub3.aBool10975 = false;
		} else if (0 != i_5_ || class649_sub1_sub5_sub1.anInt11937 * -1883036047 > 25) {
			if (Class680.aClass680_8640.aByte8644 == i && -1 != -1967774449 * class589.anInt7751) {
				if (i_3_ < 0 && -1 != class589.anInt7756 * -1073825795)
					class688_sub3.method8151(class589.anInt7756 * -1073825795, false, true, (byte) -112);
				else if (i_3_ > 0 && class589.anInt7762 * -2038431427 != -1)
					class688_sub3.method8151(class589.anInt7762 * -2038431427, false, true, (byte) -7);
				else
					class688_sub3.method8151(-1967774449 * class589.anInt7751, false, true, (byte) -119);
			} else if (i == Class680.aClass680_8638.aByte8644 && class589.anInt7755 * 1910615395 != -1) {
				if (i_3_ < 0 && -1 != class589.anInt7759 * 362638809)
					class688_sub3.method8151(class589.anInt7759 * 362638809, false, true, (byte) -70);
				else if (i_3_ > 0 && -1 != -188887673 * class589.anInt7769)
					class688_sub3.method8151(class589.anInt7769 * -188887673, false, true, (byte) -48);
				else
					class688_sub3.method8151(class589.anInt7755 * 1910615395, false, true, (byte) -3);
			} else if (i_3_ < 0 && -628236459 * class589.anInt7763 != -1)
				class688_sub3.method8151(-628236459 * class589.anInt7763, false, true, (byte) -81);
			else if (i_3_ > 0 && -1 != class589.anInt7764 * -185233035)
				class688_sub3.method8151(class589.anInt7764 * -185233035, false, true, (byte) -1);
			else
				class688_sub3.method8151(class589.anInt7747 * -1313783865, false, true, (byte) -104);
			class688_sub3.aBool10975 = false;
		} else {
			if (i == Class680.aClass680_8640.aByte8644 && -1 != -1967774449 * class589.anInt7751)
				class688_sub3.method8151(class589.anInt7751 * -1967774449, false, true, (byte) -64);
			else if (Class680.aClass680_8638.aByte8644 == i && -1 != class589.anInt7755 * 1910615395)
				class688_sub3.method8151(1910615395 * class589.anInt7755, false, true, (byte) -115);
			else
				class688_sub3.method8151(-1313783865 * class589.anInt7747, false, true, (byte) -94);
			class688_sub3.aBool10975 = false;
		}
	}
}
