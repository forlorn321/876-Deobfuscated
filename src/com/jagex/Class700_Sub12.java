/* Class700_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class700_Sub12 extends Class700 {
	public static final int anInt10847 = 0;
	public static final int anInt10848 = 1;

	public void method16953() {
		if (1 != anInt8785 * -420933067 && -420933067 * anInt8785 != 0)
			anInt8785 = method14279((byte) -118) * -380424163;
	}

	public Class700_Sub12(int i, Class527_Sub31 class527_sub31) {
		super(i, class527_sub31);
	}

	public int method16954(int i) {
		return -420933067 * anInt8785;
	}

	int method14286(int i) {
		return 1;
	}

	int method14289(int i, int i_0_) {
		return 1;
	}

	public void method16955() {
		if (1 != anInt8785 * -420933067 && -420933067 * anInt8785 != 0)
			anInt8785 = method14279((byte) -49) * -380424163;
	}

	void method14284(int i, int i_1_) {
		anInt8785 = -380424163 * i;
	}

	int method14285(int i) {
		return 1;
	}

	public int method16956() {
		return -420933067 * anInt8785;
	}

	void method14287(int i) {
		anInt8785 = -380424163 * i;
	}

	void method14281(int i) {
		anInt8785 = -380424163 * i;
	}

	int method14288() {
		return 1;
	}

	public Class700_Sub12(Class527_Sub31 class527_sub31) {
		super(class527_sub31);
	}

	int method14279(byte i) {
		return 1;
	}

	public void method16957() {
		if (1 != anInt8785 * -420933067 && -420933067 * anInt8785 != 0)
			anInt8785 = method14279((byte) -59) * -380424163;
	}

	public void method16958(int i) {
		if (1 != anInt8785 * -420933067 && -420933067 * anInt8785 != 0)
			anInt8785 = method14279((byte) -35) * -380424163;
	}

	public int method16959() {
		return -420933067 * anInt8785;
	}

	public int method16960() {
		return -420933067 * anInt8785;
	}

	static void method16961(int i, int i_2_) {
		if (i == 21)
			throw new Error();
		if (i == 9)
			throw new OutOfMemoryError();
		try {
			if (i == 6)
				Class44.method1193((short) -6881);
			else if (16 == i)
				Class493.method7997(new StringBuilder().append("").append(-1176934951 * Class515.anInt7014).toString(), (byte) 8);
			else if (3 == i) {
				Class566 class566 = (client.aClass509_11072.method8314(69071411).aClass566_7430);
				class566.aBool7603 = !class566.aBool7603;
			} else if (i == 24)
				client.aBool11022 = true;
			else if (i == 23)
				client.aBool11022 = false;
			else if (i == 19)
				client.aClass705_11182.method14332(-466550314);
			else if (i == 29) {
				Class676_Sub1.method17023(61414372);
				for (int i_3_ = 0; i_3_ < 10; i_3_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_4_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_4_).toString(), (byte) 8);
			} else if (i == 27) {
				Class676_Sub1.method17023(-2137976194);
				for (int i_5_ = 0; i_5_ < 10; i_5_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_6_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_6_).toString(), (byte) 8);
				Class172.method2741(1414927524);
				Class676_Sub1.method17023(-326558593);
				for (int i_7_ = 0; i_7_ < 10; i_7_++)
					System.gc();
				i_6_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class493.method7997(new StringBuilder().append("").append(i_6_).toString(), (byte) 8);
			} else if (5 == i)
				Class493.method7997((Class234.aClass539_2374.method368((byte) -6) ? "Success" : "Failure"), (byte) 8);
			else if (28 == i)
				Class3.aClass13_34.method700(1542076610);
			else if (22 == i)
				Class454.aClass452_4972.method7307(-1782723339);
			else if (13 == i)
				Class454.aClass452_4972.method7306(-2147380146);
			else if (7 == i)
				Class451.aCanvas4939.setLocation(50, 50);
			else if (i == 25)
				Class451.aCanvas4939.setLocation((Class515.anInt7019 * -416298495), (Class515.anInt7020 * -1313216019));
			else if (17 == i)
				Class633.method10519((byte) 0);
			else if (8 == i) {
				client.aClass509_11072.aLong6966 = Class234.method4347(-1408626088) * -3945043459867598971L;
				client.aClass509_11072.aBool6939 = true;
				Class633.method10519((byte) 0);
			} else if (10 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append((int) class442.aFloat4918 >> 9).append(" ").append((int) class442.aFloat4919 >> 9).toString(), (byte) 8);
			} else if (11 == i) {
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class493.method7997(new StringBuilder().append("").append(client.aClass509_11072.method8314(-1393686124).aClass161Array7434[(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)].method2595((int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, (byte) 42)).toString(), (byte) 8);
			} else if (1 == i) {
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2492.method3789(1699012952)).append(" ").append(Class243.aClass205_2492.method3810(-676087878)).toString(), (byte) 8);
				Class493.method7997(new StringBuilder().append(Class243.aClass205_2497.method3789(1017584881)).append(" ").append(Class243.aClass205_2497.method3810(-576527122)).toString(), (byte) 8);
			} else if (4 == i)
				Class32.method942(false, -2036833154);
			else if (20 == i) {
				client.aBool11023 = !client.aBool11023;
				Class402.aClass180_4150.method3339(client.aBool11023);
				Class527_Sub8_Sub16.method18399((byte) -17);
			} else if (14 == i) {
				client.anInt11032 = 0;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 15) {
				client.anInt11032 = 1087431529;
				client.aClass509_11072.method8361(-428559959);
			} else if (i == 26) {
				client.anInt11032 = -2120104238;
				client.aClass509_11072.method8361(-428559959);
			}
		} catch (Exception exception) {
			Class493.method7997(Class53.aClass53_528.method1290(Class144_Sub1.aClass671_8995, (byte) -105), (byte) 8);
		}
	}
}
