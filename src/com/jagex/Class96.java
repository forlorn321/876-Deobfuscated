/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class96 implements Interface18, Interface20, Interface72 {
	public Class610 aClass610_1164;
	Class98_Sub1_Sub1 aClass98_Sub1_Sub1_1165;
	Class34_Sub14 aClass34_Sub14_1166;
	PlayerStat[] aClass618Array1167;

	public int method1298(int i, int i_0_) {
		return aClass618Array1167[i].getVisibleXp((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public int method487(int i) {
		return aClass618Array1167[i].getVisibleBaseLevel((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public int method1299(int i, int i_1_) {
		return aClass618Array1167[i].getLevel();
	}

	public int method481(int i, byte i_2_) {
		return aClass618Array1167[i].getVisibleBaseLevel((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public int method1300(int i, int i_3_) {
		return aClass618Array1167[i].getExperience();
	}

	public int method1301(int i, int i_4_) {
		return aClass618Array1167[i].getBaseLevel();
	}

	public int method98(Class153 class153) {
		return aClass610_1164.method99(class153, 2071580499);
	}

	public Class324 method123(int i, int i_5_) {
		Class324 class324 = (Class324) aClass34_Sub14_1166.method70(i, (byte) -20);
		if (class324.aClass153_3555.aClass458_1717 != Class458.aClass458_5176)
			return null;
		return class324;
	}

	public Class153 method128(Class458 class458, int i) {
		if (class458 != Class458.aClass458_5176)
			return null;
		return (Class153) aClass98_Sub1_Sub1_1165.method70(i, (byte) -22);
	}

	public int method96(Class324 class324, int i) {
		return aClass610_1164.method96(class324, 96088693);
	}

	public int method1302(int i) {
		return aClass618Array1167[i].getVisibleXp((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public Class153 method125(Class458 class458, int i) {
		if (class458 != Class458.aClass458_5176)
			return null;
		return (Class153) aClass98_Sub1_Sub1_1165.method70(i, (byte) -12);
	}

	public int method1303(int i) {
		return aClass618Array1167[i].getVisibleXp((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public int method1304(int i) {
		return aClass618Array1167[i].getLevel();
	}

	public int method1305(int i) {
		return aClass618Array1167[i].getLevel();
	}

	public Class153 method124(Class458 class458, int i, int i_6_) {
		if (class458 != Class458.aClass458_5176)
			return null;
		return (Class153) aClass98_Sub1_Sub1_1165.method70(i, (byte) 29);
	}

	public int method1306(int i) {
		return aClass618Array1167[i].getLevel();
	}

	public int method1307(int i) {
		return aClass618Array1167[i].getLevel();
	}

	public int method484(int i) {
		return aClass618Array1167[i].getVisibleBaseLevel((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public Class96(Class98_Sub1_Sub1 class98_sub1_sub1, Class34_Sub14 class34_sub14, int i) {
		aClass618Array1167 = new PlayerStat[i];
		aClass610_1164 = new Class610();
		aClass98_Sub1_Sub1_1165 = class98_sub1_sub1;
		aClass34_Sub14_1166 = class34_sub14;
	}

	public int method483(int i) {
		return aClass618Array1167[i].getVisibleBaseLevel((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public int method485(int i) {
		return aClass618Array1167[i].getVisibleBaseLevel((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public int method486(int i) {
		return aClass618Array1167[i].getVisibleBaseLevel((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public int method99(Class153 class153, int i) {
		return aClass610_1164.method99(class153, 2010419400);
	}

	public int method482(int i) {
		return aClass618Array1167[i].getVisibleBaseLevel((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	public int method1308(int i) {
		return aClass618Array1167[i].getBaseLevel();
	}

	public Class324 method122(int i) {
		Class324 class324 = (Class324) aClass34_Sub14_1166.method70(i, (byte) -39);
		if (class324.aClass153_3555.aClass458_1717 != Class458.aClass458_5176)
			return null;
		return class324;
	}

	public int method97(Class153 class153) {
		return aClass610_1164.method99(class153, 1778830117);
	}

	public int method95(Class324 class324) {
		return aClass610_1164.method96(class324, 1666145862);
	}

	public int method1309(int i) {
		return aClass618Array1167[i].getLevel();
	}

	public int method1310(int i) {
		return aClass618Array1167[i].getExperience();
	}

	public Class153 method126(Class458 class458, int i) {
		if (class458 != Class458.aClass458_5176)
			return null;
		return (Class153) aClass98_Sub1_Sub1_1165.method70(i, (byte) -7);
	}

	public Class153 method127(Class458 class458, int i) {
		if (class458 != Class458.aClass458_5176)
			return null;
		return (Class153) aClass98_Sub1_Sub1_1165.method70(i, (byte) 25);
	}

	public int method1311(int i) {
		return aClass618Array1167[i].getVisibleXp((client.aBool11123 ? AccountType.MEMBERS : AccountType.FREE));
	}

	static final void method1312(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_7_);
		Class234 class234 = Class463.aClass234Array5227[i_7_ >> 16];
		Class582.method7023(class251, class234, class668, -923292901);
	}

	static void method1313(int i, int i_8_, byte i_9_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(12, (long) i);
		class536_sub18_sub5.method10659(1967875779);
		class536_sub18_sub5.anInt11675 = 1577826219 * i_8_;
	}
}
