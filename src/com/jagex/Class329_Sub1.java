/* Class329_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class329_Sub1 extends Class329 {
	int anInt10074 = 0;

	public void method206(boolean bool) {
		int i = (aClass383_3602.aClass400_3943.method6525(aClass147_3604.method42(), (client.anInt11158 * -1844600635), -1173855569) + 1877641641 * aClass383_3602.anInt3945);
		int i_0_ = (aClass383_3602.aClass384_3944.method6413(aClass147_3604.method2410(), (client.anInt11058 * 1254981347), -1332128073) + 162660109 * aClass383_3602.anInt3942);
		aClass147_3604.method2473((float) (i + aClass147_3604.method42() / 2), (float) (i_0_ + aClass147_3604.method2410() / 2), 4096, 1775611507 * anInt10074);
		anInt10074 += ((Class383_Sub1) aClass383_3602).anInt10278 * 1278684961;
	}

	public void method203(boolean bool, int i) {
		int i_1_ = (aClass383_3602.aClass400_3943.method6525(aClass147_3604.method42(), (client.anInt11158 * -1844600635), -1173855569) + 1877641641 * aClass383_3602.anInt3945);
		int i_2_ = (aClass383_3602.aClass384_3944.method6413(aClass147_3604.method2410(), (client.anInt11058 * 1254981347), -637560560) + 162660109 * aClass383_3602.anInt3942);
		aClass147_3604.method2473((float) (i_1_ + aClass147_3604.method42() / 2), (float) (i_2_ + aClass147_3604.method2410() / 2), 4096, 1775611507 * anInt10074);
		anInt10074 += ((Class383_Sub1) aClass383_3602).anInt10278 * 1278684961;
	}

	Class329_Sub1(Class459 class459, Class383_Sub1 class383_sub1) {
		super(class459, (Class383) class383_sub1);
	}

	static void method15770(int i) {
		if (Class500.method8189(-665048852)) {
			if (null == Class107.aStringArray1327)
				Class599.method9921((short) 6150);
			Class107.aBool1341 = true;
			Class107.anInt1332 = 0;
			Class107.anIntArray1334 = new int[100];
			Class107.anIntArray1333 = new int[100];
			Class107.anIntArray1340 = new int[100];
			Class697.anIntArray8760 = new int[100];
			for (int i_3_ = 0; i_3_ < 100; i_3_++) {
				Class107.anIntArray1334[i_3_] = ((int) (Math.random() * (double) (-1803844265 * Class289.anInt3223)) << 4) + (int) (Math.random() * 15.0);
				Class107.anIntArray1333[i_3_] = (int) (Math.random() * 350.0) << 4;
				Class107.anIntArray1340[i_3_] = (int) (Math.random() * 102.0) + 51;
				Class697.anIntArray8760[i_3_] = 8 + (int) (Math.random() * 48.0);
			}
			Class527_Sub41_Sub1.anIntArray11734 = new int[Class289.anInt3223 * -1803844265 >> 1];
		}
	}
}
