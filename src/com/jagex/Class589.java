/* Class589 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class589 implements Interface14 {
	String aString7761;
	public int anInt7762;
	public static final int anInt7763 = -1;
	public static final int anInt7764 = 0;
	public static final int anInt7765 = 1;
	int anInt7766;
	static final int anInt7767 = 70;
	public boolean aBool7768 = false;
	Class577 aClass577_7769;
	public int anInt7770;
	int anInt7771;
	public int[] anIntArray7772;
	int anInt7773;
	int anInt7774;
	public int anInt7775 = -67095721;
	public int anInt7776;
	static final int anInt7777 = 16777215;
	public int anInt7778;
	public int anInt7779;
	public int anInt7780;
	int anInt7781;
	public int anInt7782;
	public int anInt7783;
	public int anInt7784;
	int anInt7785;
	int anInt7786;
	int anInt7787;
	Interface13 anInterface13_7788;

	public String method9818(int i) {
		String string = aString7761;
		i = i * (-340884709 * anInt7787) / (anInt7771 * 1454509141);
		for (;;) {
			int i_0_ = string.indexOf("%1");
			if (i_0_ < 0)
				break;
			string = new StringBuilder().append(string.substring(0, i_0_)).append(Class677.method13888(i, false, 1832735157)).append(string.substring(2 + i_0_)).toString();
		}
		return string;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_1_ = class527_sub38.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method9819(class527_sub38, i_1_, -580404910);
		}
	}

	void method9819(RSByteBuffer class527_sub38, int i, int i_2_) {
		if (i == 1)
			anInt7775 = class527_sub38.method16466(-2070524553) * 67095721;
		else if (2 == i) {
			anInt7770 = class527_sub38.read24BitUnsignedInteger(333099592) * 503461853;
			aBool7768 = true;
		} else if (3 == i)
			anInt7785 = class527_sub38.method16466(-2095871118) * -1468158573;
		else if (4 == i)
			anInt7774 = class527_sub38.method16466(-1842904901) * 126584909;
		else if (i == 5)
			anInt7773 = class527_sub38.method16466(-1597210477) * -558626507;
		else if (i == 6)
			anInt7781 = class527_sub38.method16466(-1649316907) * 1479982631;
		else if (7 == i)
			anInt7776 = class527_sub38.readShort() * 1070557447;
		else if (8 == i)
			aString7761 = class527_sub38.readVersionedString(90180177);
		else if (9 == i)
			anInt7779 = class527_sub38.readUnsignedShort() * -562639015;
		else if (10 == i)
			anInt7762 = class527_sub38.readShort() * 1946889521;
		else if (i == 11)
			anInt7778 = 0;
		else if (12 == i)
			anInt7780 = class527_sub38.readUnsignedByte() * 1330661665;
		else if (i == 13)
			anInt7784 = class527_sub38.readShort() * -2135409265;
		else if (14 == i)
			anInt7778 = class527_sub38.readUnsignedShort() * 27692257;
		else if (i == 16) {
			anInt7782 = class527_sub38.readShort() * 2136586659;
			anInt7783 = class527_sub38.readShort() * 728916979;
		} else if (i == 17 || 18 == i) {
			anInt7766 = class527_sub38.readUnsignedShort() * 2130864251;
			if (anInt7766 * -2002438477 == 65535)
				anInt7766 = -2130864251;
			anInt7786 = class527_sub38.readUnsignedShort() * -2065030907;
			if (65535 == anInt7786 * -444169267)
				anInt7786 = 2065030907;
			int i_3_ = -1;
			if (18 == i) {
				i_3_ = class527_sub38.readUnsignedShort();
				if (65535 == i_3_)
					i_3_ = -1;
			}
			int i_4_ = class527_sub38.readUnsignedByte();
			anIntArray7772 = new int[2 + i_4_];
			for (int i_5_ = 0; i_5_ <= i_4_; i_5_++) {
				anIntArray7772[i_5_] = class527_sub38.readUnsignedShort();
				if (65535 == anIntArray7772[i_5_])
					anIntArray7772[i_5_] = -1;
			}
			anIntArray7772[i_4_ + 1] = i_3_;
		} else if (19 == i)
			anInt7787 = class527_sub38.readUnsignedShort() * 2000953107;
		else if (i == 20)
			anInt7771 = class527_sub38.readUnsignedShort() * 951226621;
	}

	public final Class589 method9820(Interface20 interface20, Interface18 interface18, int i) {
		int i_6_ = -1;
		if (anIntArray7772 == null)
			return this;
		if (null == interface20 || null == interface18)
			return null;
		if (-2002438477 * anInt7766 != -1) {
			Class333 class333 = interface20.method123(anInt7766 * -2002438477, 333402431);
			if (class333 != null)
				i_6_ = interface18.method100(class333, (short) -14683);
		} else if (-444169267 * anInt7786 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -444169267 * anInt7786, -1324722165);
			if (null != class160)
				i_6_ = interface18.method101(class160, 1096407173);
		}
		if (i_6_ < 0 || i_6_ >= anIntArray7772.length - 1) {
			int i_7_ = anIntArray7772[anIntArray7772.length - 1];
			if (i_7_ != -1)
				return ((Class589) anInterface13_7788.method81(i_7_, -1434752503));
			return null;
		}
		if (anIntArray7772[i_6_] == -1)
			return null;
		return (Class589) anInterface13_7788.method81(anIntArray7772[i_6_], -1359103138);
	}

	Class589(int i, Class577 class577, Interface13 interface13) {
		anInt7770 = -1090664413;
		anInt7779 = -730025386;
		anInt7785 = 1468158573;
		anInt7773 = 558626507;
		anInt7774 = -126584909;
		anInt7781 = -1479982631;
		anInt7776 = 0;
		anInt7762 = 0;
		anInt7778 = -27692257;
		aString7761 = "";
		anInt7780 = -1330661665;
		anInt7784 = 0;
		anInt7782 = 0;
		anInt7783 = 0;
		anInt7766 = -2130864251;
		anInt7786 = 2065030907;
		anInt7787 = 2000953107;
		anInt7771 = 951226621;
		aClass577_7769 = class577;
		anInterface13_7788 = interface13;
	}

	public Class147 method9821(Class180 class180, int i) {
		if (1646885019 * anInt7785 < 0)
			return null;
		Class147 class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (anInt7785 * 1646885019));
		if (null == class147) {
			method9825(class180, -59302098);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (1646885019 * anInt7785));
		}
		return class147;
	}

	public Class147 method9822(Class180 class180, byte i) {
		if (1598210333 * anInt7773 < 0)
			return null;
		Class147 class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (anInt7773 * 1598210333));
		if (null == class147) {
			method9825(class180, -138197390);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (1598210333 * anInt7773));
		}
		return class147;
	}

	public String method9823(int i) {
		String string = aString7761;
		i = i * (-340884709 * anInt7787) / (anInt7771 * 1454509141);
		for (;;) {
			int i_8_ = string.indexOf("%1");
			if (i_8_ < 0)
				break;
			string = new StringBuilder().append(string.substring(0, i_8_)).append(Class677.method13888(i, false, 1533437105)).append(string.substring(2 + i_8_)).toString();
		}
		return string;
	}

	public Class147 method9824(Class180 class180) {
		if (1598210333 * anInt7773 < 0)
			return null;
		Class147 class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (anInt7773 * 1598210333));
		if (null == class147) {
			method9825(class180, -1868887236);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (1598210333 * anInt7773));
		}
		return class147;
	}

	void method9825(Class180 class180, int i) {
		Class459 class459 = aClass577_7769.aClass459_7641;
		if (1646885019 * anInt7785 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7785 * 1646885019)) == null) && class459.method7480(anInt7785 * 1646885019, 1843041)) {
			Class185 class185 = Class165.method2665(class459, anInt7785 * 1646885019);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7785 * 1646885019));
		}
		if (1598210333 * anInt7773 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7773 * 1598210333)) == null) && class459.method7480(anInt7773 * 1598210333, -1370765317)) {
			Class185 class185 = Class165.method2665(class459, 1598210333 * anInt7773);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7773 * 1598210333));
		}
		if (346222725 * anInt7774 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7774 * 346222725)) == null) && class459.method7480(346222725 * anInt7774, 1267630506)) {
			Class185 class185 = Class165.method2665(class459, anInt7774 * 346222725);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7774 * 346222725));
		}
		if (anInt7781 * -2000105065 >= 0 && aClass577_7769.aClass205_7642.method3787((long) (anInt7781 * -2000105065)) == null && class459.method7480(anInt7781 * -2000105065, -1741992050)) {
			Class185 class185 = Class165.method2665(class459, anInt7781 * -2000105065);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7781 * -2000105065));
		}
	}

	public void method86(int i) {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method9819(class527_sub38, i, 1103502672);
		}
	}

	public Class147 method9826(Class180 class180, short i) {
		if (-2000105065 * anInt7781 < 0)
			return null;
		Class147 class147 = ((Class147) aClass577_7769.aClass205_7642.method3787((long) (-2000105065 * anInt7781)));
		if (class147 == null) {
			method9825(class180, -1946167787);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (-2000105065 * anInt7781));
		}
		return class147;
	}

	public final Class589 method9827(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (anIntArray7772 == null)
			return this;
		if (null == interface20 || null == interface18)
			return null;
		if (-2002438477 * anInt7766 != -1) {
			Class333 class333 = interface20.method123(anInt7766 * -2002438477, -792741860);
			if (class333 != null)
				i = interface18.method100(class333, (short) -3440);
		} else if (-444169267 * anInt7786 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -444169267 * anInt7786, -880206263);
			if (null != class160)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray7772.length - 1) {
			int i_9_ = anIntArray7772[anIntArray7772.length - 1];
			if (i_9_ != -1)
				return (Class589) anInterface13_7788.method81(i_9_, 67389306);
			return null;
		}
		if (anIntArray7772[i] == -1)
			return null;
		return ((Class589) anInterface13_7788.method81(anIntArray7772[i], -1819730600));
	}

	public Class147 method9828(Class180 class180) {
		if (1646885019 * anInt7785 < 0)
			return null;
		Class147 class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (anInt7785 * 1646885019));
		if (null == class147) {
			method9825(class180, -1684457582);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (1646885019 * anInt7785));
		}
		return class147;
	}

	void method9829(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt7775 = class527_sub38.method16466(-2028448855) * 67095721;
		else if (2 == i) {
			anInt7770 = class527_sub38.read24BitUnsignedInteger(1573719674) * 503461853;
			aBool7768 = true;
		} else if (3 == i)
			anInt7785 = class527_sub38.method16466(-1693993142) * -1468158573;
		else if (4 == i)
			anInt7774 = class527_sub38.method16466(-1955610908) * 126584909;
		else if (i == 5)
			anInt7773 = class527_sub38.method16466(-1979075883) * -558626507;
		else if (i == 6)
			anInt7781 = class527_sub38.method16466(-1601249545) * 1479982631;
		else if (7 == i)
			anInt7776 = class527_sub38.readShort() * 1070557447;
		else if (8 == i)
			aString7761 = class527_sub38.readVersionedString(90180177);
		else if (9 == i)
			anInt7779 = class527_sub38.readUnsignedShort() * -562639015;
		else if (10 == i)
			anInt7762 = class527_sub38.readShort() * 1946889521;
		else if (i == 11)
			anInt7778 = 0;
		else if (12 == i)
			anInt7780 = class527_sub38.readUnsignedByte() * 1330661665;
		else if (i == 13)
			anInt7784 = class527_sub38.readShort() * -2135409265;
		else if (14 == i)
			anInt7778 = class527_sub38.readUnsignedShort() * 27692257;
		else if (i == 16) {
			anInt7782 = class527_sub38.readShort() * 2136586659;
			anInt7783 = class527_sub38.readShort() * 728916979;
		} else if (i == 17 || 18 == i) {
			anInt7766 = class527_sub38.readUnsignedShort() * 2130864251;
			if (anInt7766 * -2002438477 == 65535)
				anInt7766 = -2130864251;
			anInt7786 = class527_sub38.readUnsignedShort() * -2065030907;
			if (65535 == anInt7786 * -444169267)
				anInt7786 = 2065030907;
			int i_10_ = -1;
			if (18 == i) {
				i_10_ = class527_sub38.readUnsignedShort();
				if (65535 == i_10_)
					i_10_ = -1;
			}
			int i_11_ = class527_sub38.readUnsignedByte();
			anIntArray7772 = new int[2 + i_11_];
			for (int i_12_ = 0; i_12_ <= i_11_; i_12_++) {
				anIntArray7772[i_12_] = class527_sub38.readUnsignedShort();
				if (65535 == anIntArray7772[i_12_])
					anIntArray7772[i_12_] = -1;
			}
			anIntArray7772[i_11_ + 1] = i_10_;
		} else if (19 == i)
			anInt7787 = class527_sub38.readUnsignedShort() * 2000953107;
		else if (i == 20)
			anInt7771 = class527_sub38.readUnsignedShort() * 951226621;
	}

	void method9830(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt7775 = class527_sub38.method16466(-2104655557) * 67095721;
		else if (2 == i) {
			anInt7770 = class527_sub38.read24BitUnsignedInteger(51636050) * 503461853;
			aBool7768 = true;
		} else if (3 == i)
			anInt7785 = class527_sub38.method16466(-2004630398) * -1468158573;
		else if (4 == i)
			anInt7774 = class527_sub38.method16466(-1596620266) * 126584909;
		else if (i == 5)
			anInt7773 = class527_sub38.method16466(-2078960968) * -558626507;
		else if (i == 6)
			anInt7781 = class527_sub38.method16466(-2026986925) * 1479982631;
		else if (7 == i)
			anInt7776 = class527_sub38.readShort() * 1070557447;
		else if (8 == i)
			aString7761 = class527_sub38.readVersionedString(90180177);
		else if (9 == i)
			anInt7779 = class527_sub38.readUnsignedShort() * -562639015;
		else if (10 == i)
			anInt7762 = class527_sub38.readShort() * 1946889521;
		else if (i == 11)
			anInt7778 = 0;
		else if (12 == i)
			anInt7780 = class527_sub38.readUnsignedByte() * 1330661665;
		else if (i == 13)
			anInt7784 = class527_sub38.readShort() * -2135409265;
		else if (14 == i)
			anInt7778 = class527_sub38.readUnsignedShort() * 27692257;
		else if (i == 16) {
			anInt7782 = class527_sub38.readShort() * 2136586659;
			anInt7783 = class527_sub38.readShort() * 728916979;
		} else if (i == 17 || 18 == i) {
			anInt7766 = class527_sub38.readUnsignedShort() * 2130864251;
			if (anInt7766 * -2002438477 == 65535)
				anInt7766 = -2130864251;
			anInt7786 = class527_sub38.readUnsignedShort() * -2065030907;
			if (65535 == anInt7786 * -444169267)
				anInt7786 = 2065030907;
			int i_13_ = -1;
			if (18 == i) {
				i_13_ = class527_sub38.readUnsignedShort();
				if (65535 == i_13_)
					i_13_ = -1;
			}
			int i_14_ = class527_sub38.readUnsignedByte();
			anIntArray7772 = new int[2 + i_14_];
			for (int i_15_ = 0; i_15_ <= i_14_; i_15_++) {
				anIntArray7772[i_15_] = class527_sub38.readUnsignedShort();
				if (65535 == anIntArray7772[i_15_])
					anIntArray7772[i_15_] = -1;
			}
			anIntArray7772[i_14_ + 1] = i_13_;
		} else if (19 == i)
			anInt7787 = class527_sub38.readUnsignedShort() * 2000953107;
		else if (i == 20)
			anInt7771 = class527_sub38.readUnsignedShort() * 951226621;
	}

	void method9831(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt7775 = class527_sub38.method16466(-1869660787) * 67095721;
		else if (2 == i) {
			anInt7770 = class527_sub38.read24BitUnsignedInteger(1585953016) * 503461853;
			aBool7768 = true;
		} else if (3 == i)
			anInt7785 = class527_sub38.method16466(-2066101636) * -1468158573;
		else if (4 == i)
			anInt7774 = class527_sub38.method16466(-2066014238) * 126584909;
		else if (i == 5)
			anInt7773 = class527_sub38.method16466(-2057928887) * -558626507;
		else if (i == 6)
			anInt7781 = class527_sub38.method16466(-1844114674) * 1479982631;
		else if (7 == i)
			anInt7776 = class527_sub38.readShort() * 1070557447;
		else if (8 == i)
			aString7761 = class527_sub38.readVersionedString(90180177);
		else if (9 == i)
			anInt7779 = class527_sub38.readUnsignedShort() * -562639015;
		else if (10 == i)
			anInt7762 = class527_sub38.readShort() * 1946889521;
		else if (i == 11)
			anInt7778 = 0;
		else if (12 == i)
			anInt7780 = class527_sub38.readUnsignedByte() * 1330661665;
		else if (i == 13)
			anInt7784 = class527_sub38.readShort() * -2135409265;
		else if (14 == i)
			anInt7778 = class527_sub38.readUnsignedShort() * 27692257;
		else if (i == 16) {
			anInt7782 = class527_sub38.readShort() * 2136586659;
			anInt7783 = class527_sub38.readShort() * 728916979;
		} else if (i == 17 || 18 == i) {
			anInt7766 = class527_sub38.readUnsignedShort() * 2130864251;
			if (anInt7766 * -2002438477 == 65535)
				anInt7766 = -2130864251;
			anInt7786 = class527_sub38.readUnsignedShort() * -2065030907;
			if (65535 == anInt7786 * -444169267)
				anInt7786 = 2065030907;
			int i_16_ = -1;
			if (18 == i) {
				i_16_ = class527_sub38.readUnsignedShort();
				if (65535 == i_16_)
					i_16_ = -1;
			}
			int i_17_ = class527_sub38.readUnsignedByte();
			anIntArray7772 = new int[2 + i_17_];
			for (int i_18_ = 0; i_18_ <= i_17_; i_18_++) {
				anIntArray7772[i_18_] = class527_sub38.readUnsignedShort();
				if (65535 == anIntArray7772[i_18_])
					anIntArray7772[i_18_] = -1;
			}
			anIntArray7772[i_17_ + 1] = i_16_;
		} else if (19 == i)
			anInt7787 = class527_sub38.readUnsignedShort() * 2000953107;
		else if (i == 20)
			anInt7771 = class527_sub38.readUnsignedShort() * 951226621;
	}

	void method9832(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt7775 = class527_sub38.method16466(-1909362824) * 67095721;
		else if (2 == i) {
			anInt7770 = class527_sub38.read24BitUnsignedInteger(1286721790) * 503461853;
			aBool7768 = true;
		} else if (3 == i)
			anInt7785 = class527_sub38.method16466(-1970744199) * -1468158573;
		else if (4 == i)
			anInt7774 = class527_sub38.method16466(-1937826531) * 126584909;
		else if (i == 5)
			anInt7773 = class527_sub38.method16466(-2002854458) * -558626507;
		else if (i == 6)
			anInt7781 = class527_sub38.method16466(-1911861597) * 1479982631;
		else if (7 == i)
			anInt7776 = class527_sub38.readShort() * 1070557447;
		else if (8 == i)
			aString7761 = class527_sub38.readVersionedString(90180177);
		else if (9 == i)
			anInt7779 = class527_sub38.readUnsignedShort() * -562639015;
		else if (10 == i)
			anInt7762 = class527_sub38.readShort() * 1946889521;
		else if (i == 11)
			anInt7778 = 0;
		else if (12 == i)
			anInt7780 = class527_sub38.readUnsignedByte() * 1330661665;
		else if (i == 13)
			anInt7784 = class527_sub38.readShort() * -2135409265;
		else if (14 == i)
			anInt7778 = class527_sub38.readUnsignedShort() * 27692257;
		else if (i == 16) {
			anInt7782 = class527_sub38.readShort() * 2136586659;
			anInt7783 = class527_sub38.readShort() * 728916979;
		} else if (i == 17 || 18 == i) {
			anInt7766 = class527_sub38.readUnsignedShort() * 2130864251;
			if (anInt7766 * -2002438477 == 65535)
				anInt7766 = -2130864251;
			anInt7786 = class527_sub38.readUnsignedShort() * -2065030907;
			if (65535 == anInt7786 * -444169267)
				anInt7786 = 2065030907;
			int i_19_ = -1;
			if (18 == i) {
				i_19_ = class527_sub38.readUnsignedShort();
				if (65535 == i_19_)
					i_19_ = -1;
			}
			int i_20_ = class527_sub38.readUnsignedByte();
			anIntArray7772 = new int[2 + i_20_];
			for (int i_21_ = 0; i_21_ <= i_20_; i_21_++) {
				anIntArray7772[i_21_] = class527_sub38.readUnsignedShort();
				if (65535 == anIntArray7772[i_21_])
					anIntArray7772[i_21_] = -1;
			}
			anIntArray7772[i_20_ + 1] = i_19_;
		} else if (19 == i)
			anInt7787 = class527_sub38.readUnsignedShort() * 2000953107;
		else if (i == 20)
			anInt7771 = class527_sub38.readUnsignedShort() * 951226621;
	}

	public final Class589 method9833(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (anIntArray7772 == null)
			return this;
		if (null == interface20 || null == interface18)
			return null;
		if (-2002438477 * anInt7766 != -1) {
			Class333 class333 = interface20.method123(anInt7766 * -2002438477, -1059647770);
			if (class333 != null)
				i = interface18.method100(class333, (short) -32743);
		} else if (-444169267 * anInt7786 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -444169267 * anInt7786, -1770426576);
			if (null != class160)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray7772.length - 1) {
			int i_22_ = anIntArray7772[anIntArray7772.length - 1];
			if (i_22_ != -1)
				return ((Class589) anInterface13_7788.method81(i_22_, 575419965));
			return null;
		}
		if (anIntArray7772[i] == -1)
			return null;
		return ((Class589) anInterface13_7788.method81(anIntArray7772[i], 799555373));
	}

	public final Class589 method9834(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (anIntArray7772 == null)
			return this;
		if (null == interface20 || null == interface18)
			return null;
		if (-2002438477 * anInt7766 != -1) {
			Class333 class333 = interface20.method123(anInt7766 * -2002438477, 1512945160);
			if (class333 != null)
				i = interface18.method100(class333, (short) -6794);
		} else if (-444169267 * anInt7786 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -444169267 * anInt7786, -1135611637);
			if (null != class160)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray7772.length - 1) {
			int i_23_ = anIntArray7772[anIntArray7772.length - 1];
			if (i_23_ != -1)
				return ((Class589) anInterface13_7788.method81(i_23_, 1582355778));
			return null;
		}
		if (anIntArray7772[i] == -1)
			return null;
		return ((Class589) anInterface13_7788.method81(anIntArray7772[i], 655976007));
	}

	public void method85() {
		/* empty */
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method9819(class527_sub38, i, -2114748467);
		}
	}

	public String method9835(int i) {
		String string = aString7761;
		i = i * (-340884709 * anInt7787) / (anInt7771 * 1454509141);
		for (;;) {
			int i_24_ = string.indexOf("%1");
			if (i_24_ < 0)
				break;
			string = new StringBuilder().append(string.substring(0, i_24_)).append(Class677.method13888(i, false, 37940401)).append(string.substring(2 + i_24_)).toString();
		}
		return string;
	}

	public Class147 method9836(Class180 class180) {
		if (1646885019 * anInt7785 < 0)
			return null;
		Class147 class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (anInt7785 * 1646885019));
		if (null == class147) {
			method9825(class180, -1567520719);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (1646885019 * anInt7785));
		}
		return class147;
	}

	public void method84() {
		/* empty */
	}

	void method9837(Class180 class180) {
		Class459 class459 = aClass577_7769.aClass459_7641;
		if (1646885019 * anInt7785 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7785 * 1646885019)) == null) && class459.method7480(anInt7785 * 1646885019, 320413692)) {
			Class185 class185 = Class165.method2665(class459, anInt7785 * 1646885019);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7785 * 1646885019));
		}
		if (1598210333 * anInt7773 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7773 * 1598210333)) == null) && class459.method7480(anInt7773 * 1598210333, 451658862)) {
			Class185 class185 = Class165.method2665(class459, 1598210333 * anInt7773);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7773 * 1598210333));
		}
		if (346222725 * anInt7774 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7774 * 346222725)) == null) && class459.method7480(346222725 * anInt7774, 221099496)) {
			Class185 class185 = Class165.method2665(class459, anInt7774 * 346222725);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7774 * 346222725));
		}
		if (anInt7781 * -2000105065 >= 0 && aClass577_7769.aClass205_7642.method3787((long) (anInt7781 * -2000105065)) == null && class459.method7480(anInt7781 * -2000105065, -1082021753)) {
			Class185 class185 = Class165.method2665(class459, anInt7781 * -2000105065);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7781 * -2000105065));
		}
	}

	public Class147 method9838(Class180 class180) {
		if (1646885019 * anInt7785 < 0)
			return null;
		Class147 class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (anInt7785 * 1646885019));
		if (null == class147) {
			method9825(class180, -886394367);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (1646885019 * anInt7785));
		}
		return class147;
	}

	public String method9839(int i, int i_25_) {
		String string = aString7761;
		i = i * (-340884709 * anInt7787) / (anInt7771 * 1454509141);
		for (;;) {
			int i_26_ = string.indexOf("%1");
			if (i_26_ < 0)
				break;
			string = new StringBuilder().append(string.substring(0, i_26_)).append(Class677.method13888(i, false, 700495459)).append(string.substring(2 + i_26_)).toString();
		}
		return string;
	}

	void method9840(Class180 class180) {
		Class459 class459 = aClass577_7769.aClass459_7641;
		if (1646885019 * anInt7785 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7785 * 1646885019)) == null) && class459.method7480(anInt7785 * 1646885019, 88541394)) {
			Class185 class185 = Class165.method2665(class459, anInt7785 * 1646885019);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7785 * 1646885019));
		}
		if (1598210333 * anInt7773 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7773 * 1598210333)) == null) && class459.method7480(anInt7773 * 1598210333, 1335301841)) {
			Class185 class185 = Class165.method2665(class459, 1598210333 * anInt7773);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7773 * 1598210333));
		}
		if (346222725 * anInt7774 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7774 * 346222725)) == null) && class459.method7480(346222725 * anInt7774, 231628181)) {
			Class185 class185 = Class165.method2665(class459, anInt7774 * 346222725);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7774 * 346222725));
		}
		if (anInt7781 * -2000105065 >= 0 && aClass577_7769.aClass205_7642.method3787((long) (anInt7781 * -2000105065)) == null && class459.method7480(anInt7781 * -2000105065, 355498407)) {
			Class185 class185 = Class165.method2665(class459, anInt7781 * -2000105065);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7781 * -2000105065));
		}
	}

	public Class147 method9841(Class180 class180) {
		if (1598210333 * anInt7773 < 0)
			return null;
		Class147 class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (anInt7773 * 1598210333));
		if (null == class147) {
			method9825(class180, -1648447723);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (1598210333 * anInt7773));
		}
		return class147;
	}

	public Class147 method9842(Class180 class180) {
		if (1598210333 * anInt7773 < 0)
			return null;
		Class147 class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (anInt7773 * 1598210333));
		if (null == class147) {
			method9825(class180, 1101072544);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (1598210333 * anInt7773));
		}
		return class147;
	}

	public Class147 method9843(Class180 class180) {
		if (anInt7774 * 346222725 < 0)
			return null;
		Class147 class147 = ((Class147) aClass577_7769.aClass205_7642.method3787((long) (346222725 * anInt7774)));
		if (null == class147) {
			method9825(class180, -222564646);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (346222725 * anInt7774));
		}
		return class147;
	}

	public Class147 method9844(Class180 class180) {
		if (-2000105065 * anInt7781 < 0)
			return null;
		Class147 class147 = ((Class147) aClass577_7769.aClass205_7642.method3787((long) (-2000105065 * anInt7781)));
		if (class147 == null) {
			method9825(class180, -1816029745);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (-2000105065 * anInt7781));
		}
		return class147;
	}

	public Class147 method9845(Class180 class180) {
		if (-2000105065 * anInt7781 < 0)
			return null;
		Class147 class147 = ((Class147) aClass577_7769.aClass205_7642.method3787((long) (-2000105065 * anInt7781)));
		if (class147 == null) {
			method9825(class180, 1204406199);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (-2000105065 * anInt7781));
		}
		return class147;
	}

	void method9846(Class180 class180) {
		Class459 class459 = aClass577_7769.aClass459_7641;
		if (1646885019 * anInt7785 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7785 * 1646885019)) == null) && class459.method7480(anInt7785 * 1646885019, 226196773)) {
			Class185 class185 = Class165.method2665(class459, anInt7785 * 1646885019);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7785 * 1646885019));
		}
		if (1598210333 * anInt7773 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7773 * 1598210333)) == null) && class459.method7480(anInt7773 * 1598210333, 2118246013)) {
			Class185 class185 = Class165.method2665(class459, 1598210333 * anInt7773);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7773 * 1598210333));
		}
		if (346222725 * anInt7774 >= 0 && (aClass577_7769.aClass205_7642.method3787((long) (anInt7774 * 346222725)) == null) && class459.method7480(346222725 * anInt7774, 272570613)) {
			Class185 class185 = Class165.method2665(class459, anInt7774 * 346222725);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7774 * 346222725));
		}
		if (anInt7781 * -2000105065 >= 0 && aClass577_7769.aClass205_7642.method3787((long) (anInt7781 * -2000105065)) == null && class459.method7480(anInt7781 * -2000105065, -1241182156)) {
			Class185 class185 = Class165.method2665(class459, anInt7781 * -2000105065);
			aClass577_7769.aClass205_7642.method3790(class180.method3271(class185, true), (long) (anInt7781 * -2000105065));
		}
	}

	public Class147 method9847(Class180 class180, int i) {
		if (anInt7774 * 346222725 < 0)
			return null;
		Class147 class147 = ((Class147) aClass577_7769.aClass205_7642.method3787((long) (346222725 * anInt7774)));
		if (null == class147) {
			method9825(class180, -1825274443);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (346222725 * anInt7774));
		}
		return class147;
	}

	public Class147 method9848(Class180 class180) {
		if (anInt7774 * 346222725 < 0)
			return null;
		Class147 class147 = ((Class147) aClass577_7769.aClass205_7642.method3787((long) (346222725 * anInt7774)));
		if (null == class147) {
			method9825(class180, -1103378745);
			class147 = (Class147) aClass577_7769.aClass205_7642.method3787((long) (346222725 * anInt7774));
		}
		return class147;
	}

	static final void method9849(Class665 class665, byte i) {
		int i_27_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_27_, 1012615328);
		Class240 class240 = Class183.aClass240Array2100[i_27_ >> 16];
		Class249.method4659(class243, class240, false, 0, class665, (byte) 95);
	}
}
