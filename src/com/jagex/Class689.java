/* Class689 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class689 implements Iterator {
	Class536_Sub18 aClass536_Sub18_8689;
	Class700 aClass700_8690;
	Class536_Sub18 aClass536_Sub18_8691 = null;
	static String aString8692;

	void method8173(byte i) {
		aClass536_Sub18_8689 = aClass700_8690.aClass536_Sub18_8794.aClass536_Sub18_10506;
		aClass536_Sub18_8691 = null;
	}

	public Class536_Sub18 method8174(byte i) {
		method8173((byte) 84);
		return (Class536_Sub18) next();
	}

	public Object next() {
		Class536_Sub18 class536_sub18 = aClass536_Sub18_8689;
		if (aClass700_8690.aClass536_Sub18_8794 == class536_sub18) {
			class536_sub18 = null;
			aClass536_Sub18_8689 = null;
		} else
			aClass536_Sub18_8689 = class536_sub18.aClass536_Sub18_10506;
		aClass536_Sub18_8691 = class536_sub18;
		return class536_sub18;
	}

	public boolean hasNext() {
		return aClass536_Sub18_8689 != aClass700_8690.aClass536_Sub18_8794;
	}

	public void remove() {
		if (null == aClass536_Sub18_8691)
			throw new IllegalStateException();
		aClass536_Sub18_8691.method9521(-925018308);
		aClass536_Sub18_8691 = null;
	}

	public Class689(Class700 class700) {
		aClass700_8690 = class700;
		aClass536_Sub18_8689 = aClass700_8690.aClass536_Sub18_8794.aClass536_Sub18_10506;
		aClass536_Sub18_8691 = null;
	}

	public boolean method8175() {
		return aClass536_Sub18_8689 != aClass700_8690.aClass536_Sub18_8794;
	}

	public Object method8176() {
		Class536_Sub18 class536_sub18 = aClass536_Sub18_8689;
		if (aClass700_8690.aClass536_Sub18_8794 == class536_sub18) {
			class536_sub18 = null;
			aClass536_Sub18_8689 = null;
		} else
			aClass536_Sub18_8689 = class536_sub18.aClass536_Sub18_10506;
		aClass536_Sub18_8691 = class536_sub18;
		return class536_sub18;
	}

	public Object method8177() {
		Class536_Sub18 class536_sub18 = aClass536_Sub18_8689;
		if (aClass700_8690.aClass536_Sub18_8794 == class536_sub18) {
			class536_sub18 = null;
			aClass536_Sub18_8689 = null;
		} else
			aClass536_Sub18_8689 = class536_sub18.aClass536_Sub18_10506;
		aClass536_Sub18_8691 = class536_sub18;
		return class536_sub18;
	}

	void method8178() {
		aClass536_Sub18_8689 = aClass700_8690.aClass536_Sub18_8794.aClass536_Sub18_10506;
		aClass536_Sub18_8691 = null;
	}

	void method8179() {
		aClass536_Sub18_8689 = aClass700_8690.aClass536_Sub18_8794.aClass536_Sub18_10506;
		aClass536_Sub18_8691 = null;
	}

	public void method8180() {
		if (null == aClass536_Sub18_8691)
			throw new IllegalStateException();
		aClass536_Sub18_8691.method9521(-1365469345);
		aClass536_Sub18_8691 = null;
	}

	public boolean method8181() {
		return aClass536_Sub18_8689 != aClass700_8690.aClass536_Sub18_8794;
	}

	public static final void method8182(int i) {
		for (int i_0_ = 0; i_0_ < 5; i_0_++)
			client.aBoolArray11270[i_0_] = false;
		client.anInt11192 = -1863105115;
		client.anInt11119 = -408425903;
		Class593.anInt7811 = 0;
		Class460_Sub1.anInt10291 = 0;
		Class246.anInt2474 = 68985507;
		if (Class65.method1062() == 2) {
			Class598 class598 = client.aClass515_11066.method6255(-1877472177);
			int i_1_ = 1858049507 * class598.anInt7839 << 9;
			int i_2_ = 1479112045 * class598.anInt7840 << 9;
			int i_3_ = 1000 / Class319_Sub1.method9134(2111912700);
			Class683.aClass301_Sub1_8651.method4070((float) i_3_ / 1000.0F, (client.aClass515_11066.method6292(1320952185).anIntArrayArrayArray5245), client.aClass515_11066.method6251(893716864), i_1_, i_2_, 1498174256);
		}
		Class667.anInt8535 = 1594603721;
		Class658.anInt8498 = -662013517;
		client.anInt11267 = -460612177 * client.cycles;
		Class184_Sub6.anInt9933 = -371967667 * Class637.anInt8301;
		Class469.anInt5356 = Class205_Sub21.anInt9958 * 761726941;
		Class681.anInt8648 = Class685.anInt8665 * 76702477;
		Class392_Sub3.anInt10231 = 540543625 * Class141.anInt1658;
		Class23.anInt231 = -1308716707 * Class144.anInt1681;
		Class98_Sub1_Sub2.anInt11335 = -34019295 * client.anInt11287;
	}

	static final void method8183(int i, byte i_4_) {
		client.anIntArray11051 = new int[i];
		client.anIntArray11089 = new int[i];
		client.anIntArray11145 = new int[i];
		client.anIntArray11146 = new int[i];
		client.anIntArray11097 = new int[i];
	}
}
