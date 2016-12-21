/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class387 implements Interface49 {
	public int anInt4034;
	public Class399 aClass399_4035;
	public int anInt4036;
	public int anInt4037;
	public int anInt4038;
	public boolean aBool4039;
	public int anInt4040;
	public int anInt4041;
	public int anInt4042;
	public int anInt4043;
	public Class395 aClass395_4044;

	public Class390 method343(byte i) {
		return Class390.aClass390_4052;
	}

	public Class390 method342() {
		return Class390.aClass390_4052;
	}

	public Class390 method344() {
		return Class390.aClass390_4052;
	}

	Class387(int i, Class395 class395, Class399 class399, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
		anInt4041 = i * -1150425063;
		aClass395_4044 = class395;
		aClass399_4035 = class399;
		anInt4036 = i_0_ * 2102713251;
		anInt4037 = -105561099 * i_1_;
		anInt4034 = 91690615 * i_2_;
		anInt4042 = 1541549763 * i_3_;
		anInt4038 = -676067673 * i_4_;
		anInt4043 = -1775435065 * i_5_;
		anInt4040 = i_6_ * -434767683;
		aBool4039 = bool;
	}

	public static void method4846(Class553 class553, Class167 class167, int i) {
		Iterator iterator = Class626.aList8161.iterator();
		while (iterator.hasNext()) {
			Class627 class627 = (Class627) iterator.next();
			if (class627.aBool8179)
				class627.method7477(class553, class167);
		}
	}

	static final void method4847(Class668 class668, Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1, int i) {
		class668.anInt8542 -= -1287325605;
		int i_7_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_8_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		int i_9_ = class668.anIntArray8541[2 + 1867269829 * class668.anInt8542];
		int i_10_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 3];
		int i_11_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 4];
		boolean bool = (class668.anIntArray8541[5 + 1867269829 * class668.anInt8542] == 1);
		int i_12_ = class668.anIntArray8541[6 + 1867269829 * class668.anInt8542];
		if (Class683.aClass301_Sub1_8651.method4054(782449771) != Class290.aClass290_3220)
			throw new RuntimeException();
		Class333_Sub2 class333_sub2 = ((Class333_Sub2) Class683.aClass301_Sub1_8651.method4051(826143221));
		Class425 class425 = new Class425();
		Class425 class425_13_ = new Class425();
		class425.method5090(0.0F, 1.0F, 0.0F, (float) (3.141592653589793 * (double) i_11_ * 2.0 / 16384.0));
		Class436 class436 = new Class436(1.0F, 0.0F, 0.0F);
		class436.method5263(class425);
		class436.method5246();
		class425_13_.method5115(class436, (float) ((double) i_10_ * 3.141592653589793 * 2.0 / 16384.0));
		class425.method5096(class425_13_);
		Class598 class598 = client.aClass515_11066.method6255(-1677586866);
		int i_14_ = class598.anInt7839 * 1858049507 << 9;
		int i_15_ = 1479112045 * class598.anInt7840 << 9;
		if (null != class649_sub1_sub5_sub1)
			class333_sub2.method9173(class649_sub1_sub5_sub1, new Class436((float) i_7_, (float) i_8_, (float) i_9_), class425, bool, i_12_, (client.aClass515_11066.method6292(976158578).anIntArrayArrayArray5245), client.aClass515_11066.method6251(475293236), i_14_, i_15_, (byte) 127);
		client.aBool11242 = true;
	}
}
