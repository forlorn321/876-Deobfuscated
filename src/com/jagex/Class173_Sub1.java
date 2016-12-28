/* Class173_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class173_Sub1 extends Class173 {
	Class461 aClass461_9382;
	Class461 aClass461_9383;
	static int anInt9384;

	public boolean method137(Class599 class599, int i, Class594 class594, float f, int i_0_, int i_1_, boolean bool, int i_2_) {
		boolean bool_3_ = true;
		if (class599 == Class599.aClass599_7843) {
			if (aClass461_9383.method5565(i, 1069839645))
				bool_3_ = aClass461_9383.method5580(i, -964514165);
			return bool_3_ & aClass461_9382.method5580(i, -964514165);
		}
		if (Class599.aClass599_7844 == class599)
			return aClass461_9382.method5580(i, -964514165);
		if (Class599.aClass599_7842 == class599)
			return aClass461_9383.method5580(i, -964514165);
		return false;
	}

	public Class173_Sub1(Class461 class461, Class461 class461_4_) {
		aClass461_9382 = class461;
		aClass461_9383 = class461_4_;
	}

	byte[] method2437(Class599 class599, int i, int i_5_) {
		if ((class599 == Class599.aClass599_7844 || class599 == Class599.aClass599_7843) && aClass461_9382.method5565(i, 568142020))
			return aClass461_9382.method5595(i, -842531911);
		if (Class599.aClass599_7842 == class599 && aClass461_9383.method5565(i, 1987389651))
			return aClass461_9383.method5595(i, -860185207);
		return null;
	}

	public boolean method136(Class599 class599, int i, Class594 class594, float f, int i_6_, int i_7_, boolean bool) {
		boolean bool_8_ = true;
		if (class599 == Class599.aClass599_7843) {
			if (aClass461_9383.method5565(i, -491040194))
				bool_8_ = aClass461_9383.method5580(i, -964514165);
			return bool_8_ & aClass461_9382.method5580(i, -964514165);
		}
		if (Class599.aClass599_7844 == class599)
			return aClass461_9382.method5580(i, -964514165);
		if (Class599.aClass599_7842 == class599)
			return aClass461_9383.method5580(i, -964514165);
		return false;
	}

	byte[] method2441(Class599 class599, int i) {
		if ((class599 == Class599.aClass599_7844 || class599 == Class599.aClass599_7843) && aClass461_9382.method5565(i, 1123845972))
			return aClass461_9382.method5595(i, -915012272);
		if (Class599.aClass599_7842 == class599 && aClass461_9383.method5565(i, -1121361011))
			return aClass461_9383.method5595(i, -842399264);
		return null;
	}

	static final void method8633(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		int i_9_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (InterfaceDefinitions.anInt2617 * 10493011 == i_9_ || i_9_ == InterfaceDefinitions.anInt2533 * -1139317763 || i_9_ == InterfaceDefinitions.anInt2535 * -292337027 || 1087226469 * InterfaceDefinitions.anInt2634 == i_9_)
			class251.dragRenderBehaviour = i_9_ * 52080145;
	}

	public static void method8634(int i, String string, int i_10_) {
		Class635.method7564(i, 0, "", "", "", string, null, -1538266173);
	}

	public static Class690[] method8635(int i) {
		return (new Class690[] { Class690.aClass690_8695, Class690.aClass690_8698, Class690.aClass690_8696, Class690.aClass690_8694, Class690.aClass690_8693 });
	}

	static void method8636(InterfaceDefinitions class251, int i, int i_11_, short i_12_) {
		if (class251.posXMode == 0)
			class251.anInt2571 = 1462897253 * class251.posX;
		else if (class251.posXMode == 1)
			class251.anInt2571 = ((i - -1606950689 * class251.anInt2573) / 2 + 370234961 * class251.posX) * 452880853;
		else if (2 == class251.posXMode)
			class251.anInt2571 = (i - -1606950689 * class251.anInt2573 - class251.posX * 370234961) * 452880853;
		else if (class251.posXMode == 3)
			class251.anInt2571 = (class251.posX * 370234961 * i >> 14) * 452880853;
		else if (4 == class251.posXMode)
			class251.anInt2571 = 452880853 * ((i - -1606950689 * class251.anInt2573) / 2 + (i * (370234961 * class251.posX) >> 14));
		else
			class251.anInt2571 = 452880853 * (i - -1606950689 * class251.anInt2573 - (i * (class251.posX * 370234961) >> 14));
		if (class251.posYMode == 0)
			class251.anInt2572 = -1382197559 * class251.posY;
		else if (class251.posYMode == 1)
			class251.anInt2572 = 464397613 * ((i_11_ - class251.anInt2574 * 223822141) / 2 + class251.posY * -206409331);
		else if (2 == class251.posYMode)
			class251.anInt2572 = (i_11_ - class251.anInt2574 * 223822141 - -206409331 * class251.posY) * 464397613;
		else if (3 == class251.posYMode)
			class251.anInt2572 = (-206409331 * class251.posY * i_11_ >> 14) * 464397613;
		else if (4 == class251.posYMode)
			class251.anInt2572 = ((-206409331 * class251.posY * i_11_ >> 14) + (i_11_ - 223822141 * class251.anInt2574) / 2) * 464397613;
		else
			class251.anInt2572 = (i_11_ - class251.anInt2574 * 223822141 - (i_11_ * (class251.posY * -206409331) >> 14)) * 464397613;
		if (client.aBool11010 && (client.getIComponentSettings(class251).settings * -512963777 != 0 || class251.anInt2728 * 1049444347 == 0)) {
			if (class251.anInt2571 * 1151043453 < 0)
				class251.anInt2571 = 0;
			else if ((1151043453 * class251.anInt2571 + -1606950689 * class251.anInt2573) > i)
				class251.anInt2571 = 452880853 * (i - -1606950689 * class251.anInt2573);
			if (-712740187 * class251.anInt2572 < 0)
				class251.anInt2572 = 0;
			else if ((223822141 * class251.anInt2574 + class251.anInt2572 * -712740187) > i_11_)
				class251.anInt2572 = (i_11_ - class251.anInt2574 * 223822141) * 464397613;
		}
	}

	static void method8637(int i) {
		Class103.aClass199_1231.method2892(-1340260187);
	}
}
