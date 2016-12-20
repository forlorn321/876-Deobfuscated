/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class6 implements Interface6 {
	Class459 aClass459_54;
	Interface13 anInterface13_55;
	Class671 aClass671_56;
	boolean aBool57;
	Class607 aClass607_58;
	Class5 aClass5_59;
	Class205 aClass205_60 = new Class205(50);
	int anInt61;
	String[] aStringArray62;
	String[] aStringArray63;

	void method569() {
		synchronized (aClass205_60) {
			aClass205_60.method3820(-724717395);
		}
		synchronized (aClass607_58) {
			aClass607_58.method10068();
		}
	}

	Class147 method570(Class180 class180, Class180 class180_0_, int i, int i_1_, int i_2_, int i_3_, boolean bool, boolean bool_4_, int i_5_, Class174 class174, Class633 class633, Class615 class615, Interface13 interface13, byte i_6_) {
		if (!bool_4_) {
			Class147 class147 = method583(class180_0_, i, i_1_, i_2_, i_3_, i_5_, class633, (byte) -1);
			if (null != class147)
				return class147;
		}
		Class9 class9 = (Class9) interface13.method81(i, -1729281688);
		if (i_1_ > 1 && null != class9.anIntArray125) {
			int i_7_ = -1;
			for (int i_8_ = 0; i_8_ < 10; i_8_++) {
				if (i_1_ >= class9.anIntArray126[i_8_] && 0 != class9.anIntArray126[i_8_])
					i_7_ = class9.anIntArray125[i_8_];
			}
			if (i_7_ != -1)
				class9 = (Class9) interface13.method81(i_7_, -916119780);
		}
		int[] is = class9.method613(class180, class180_0_, i_1_, i_2_, i_3_, bool, i_5_, class174, class633, class615, -2012258745);
		if (is == null)
			return null;
		Class147 class147;
		if (bool_4_)
			class147 = class180.method3163(is, 0, 36, 36, 32, 1629738515);
		else
			class147 = class180_0_.method3163(is, 0, 36, 36, 32, 1702879308);
		if (!bool_4_) {
			Class5 class5 = new Class5();
			class5.anInt51 = 1726520879 * class180_0_.anInt2064;
			class5.anInt47 = -40232247 * i;
			class5.anInt48 = -1216042463 * i_1_;
			class5.anInt49 = i_2_ * 419592479;
			class5.anInt52 = i_3_ * -251760617;
			class5.anInt46 = 2030352673 * i_5_;
			class5.aBool50 = class633 != null;
			aClass607_58.method10065(class147, class5);
		}
		return class147;
	}

	Class6(Class678 class678, Class671 class671, boolean bool, Class459 class459, Interface13 interface13) {
		aClass607_58 = new Class607(250);
		aClass5_59 = new Class5();
		aClass671_56 = class671;
		aBool57 = bool;
		aClass459_54 = class459;
		anInterface13_55 = interface13;
		if (class678 == Class678.aClass678_8613)
			aStringArray62 = new String[] { null, null, Class53.aClass53_540.method1290(aClass671_56, (byte) -120), null, null, Class53.aClass53_552.method1290(aClass671_56, (byte) -102) };
		else
			aStringArray62 = new String[] { null, null, Class53.aClass53_540.method1290(aClass671_56, (byte) -89), null, null, null };
		aStringArray63 = new String[] { null, null, null, null, Class53.aClass53_541.method1290(aClass671_56, (byte) -122) };
	}

	void method571(boolean bool, int i) {
		if (aBool57 != bool) {
			aBool57 = bool;
			method573((short) 21651);
		}
	}

	void method572(int i, int i_9_) {
		anInt61 = i * 1576101215;
		synchronized (aClass205_60) {
			aClass205_60.method3793((byte) 38);
		}
	}

	void method573(short i) {
		synchronized (aClass205_60) {
			aClass205_60.method3793((byte) 47);
		}
		synchronized (aClass607_58) {
			aClass607_58.method10079();
		}
	}

	void method574(int i) {
		synchronized (aClass607_58) {
			aClass607_58.method10079();
		}
	}

	Class147 method575(Class180 class180, Class180 class180_10_, int i, int i_11_, int i_12_, int i_13_, boolean bool, boolean bool_14_, int i_15_, Class174 class174, Class633 class633, Class615 class615, Interface13 interface13) {
		if (!bool_14_) {
			Class147 class147 = method583(class180_10_, i, i_11_, i_12_, i_13_, i_15_, class633, (byte) -1);
			if (null != class147)
				return class147;
		}
		Class9 class9 = (Class9) interface13.method81(i, -330931393);
		if (i_11_ > 1 && null != class9.anIntArray125) {
			int i_16_ = -1;
			for (int i_17_ = 0; i_17_ < 10; i_17_++) {
				if (i_11_ >= class9.anIntArray126[i_17_] && 0 != class9.anIntArray126[i_17_])
					i_16_ = class9.anIntArray125[i_17_];
			}
			if (i_16_ != -1)
				class9 = (Class9) interface13.method81(i_16_, -997920182);
		}
		int[] is = class9.method613(class180, class180_10_, i_11_, i_12_, i_13_, bool, i_15_, class174, class633, class615, -2012258745);
		if (is == null)
			return null;
		Class147 class147;
		if (bool_14_)
			class147 = class180.method3163(is, 0, 36, 36, 32, 366746317);
		else
			class147 = class180_10_.method3163(is, 0, 36, 36, 32, 305960474);
		if (!bool_14_) {
			Class5 class5 = new Class5();
			class5.anInt51 = 1726520879 * class180_10_.anInt2064;
			class5.anInt47 = -40232247 * i;
			class5.anInt48 = -1216042463 * i_11_;
			class5.anInt49 = i_12_ * 419592479;
			class5.anInt52 = i_13_ * -251760617;
			class5.anInt46 = 2030352673 * i_15_;
			class5.aBool50 = class633 != null;
			aClass607_58.method10065(class147, class5);
		}
		return class147;
	}

	void method576(int i) {
		synchronized (aClass205_60) {
			aClass205_60.method3820(499860501);
		}
		synchronized (aClass607_58) {
			aClass607_58.method10068();
		}
	}

	Class147 method577(Class180 class180, Class180 class180_18_, int i, int i_19_, int i_20_, int i_21_, boolean bool, boolean bool_22_, int i_23_, Class174 class174, Class633 class633, Class615 class615, Interface13 interface13) {
		if (!bool_22_) {
			Class147 class147 = method583(class180_18_, i, i_19_, i_20_, i_21_, i_23_, class633, (byte) -1);
			if (null != class147)
				return class147;
		}
		Class9 class9 = (Class9) interface13.method81(i, 1732121916);
		if (i_19_ > 1 && null != class9.anIntArray125) {
			int i_24_ = -1;
			for (int i_25_ = 0; i_25_ < 10; i_25_++) {
				if (i_19_ >= class9.anIntArray126[i_25_] && 0 != class9.anIntArray126[i_25_])
					i_24_ = class9.anIntArray125[i_25_];
			}
			if (i_24_ != -1)
				class9 = (Class9) interface13.method81(i_24_, -1487433532);
		}
		int[] is = class9.method613(class180, class180_18_, i_19_, i_20_, i_21_, bool, i_23_, class174, class633, class615, -2012258745);
		if (is == null)
			return null;
		Class147 class147;
		if (bool_22_)
			class147 = class180.method3163(is, 0, 36, 36, 32, 509255253);
		else
			class147 = class180_18_.method3163(is, 0, 36, 36, 32, -1281905362);
		if (!bool_22_) {
			Class5 class5 = new Class5();
			class5.anInt51 = 1726520879 * class180_18_.anInt2064;
			class5.anInt47 = -40232247 * i;
			class5.anInt48 = -1216042463 * i_19_;
			class5.anInt49 = i_20_ * 419592479;
			class5.anInt52 = i_21_ * -251760617;
			class5.anInt46 = 2030352673 * i_23_;
			class5.aBool50 = class633 != null;
			aClass607_58.method10065(class147, class5);
		}
		return class147;
	}

	void method578(int i, byte i_26_) {
		synchronized (aClass205_60) {
			aClass205_60.method3792(i, (byte) -53);
		}
		synchronized (aClass607_58) {
			aClass607_58.method10067(i);
		}
	}

	void method579(int i) {
		anInt61 = i * 1576101215;
		synchronized (aClass205_60) {
			aClass205_60.method3793((byte) 4);
		}
	}

	void method580(boolean bool) {
		if (aBool57 != bool) {
			aBool57 = bool;
			method573((short) 2000);
		}
	}

	void method581() {
		synchronized (aClass607_58) {
			aClass607_58.method10079();
		}
	}

	void method582(int i) {
		synchronized (aClass205_60) {
			aClass205_60.method3792(i, (byte) -13);
		}
		synchronized (aClass607_58) {
			aClass607_58.method10067(i);
		}
	}

	Class147 method583(Class180 class180, int i, int i_27_, int i_28_, int i_29_, int i_30_, Class633 class633, byte i_31_) {
		aClass5_59.anInt51 = class180.anInt2064 * 1726520879;
		aClass5_59.anInt47 = i * -40232247;
		aClass5_59.anInt48 = i_27_ * -1216042463;
		aClass5_59.anInt49 = 419592479 * i_28_;
		aClass5_59.anInt52 = i_29_ * -251760617;
		aClass5_59.anInt46 = 2030352673 * i_30_;
		aClass5_59.aBool50 = class633 != null;
		return (Class147) aClass607_58.method10075(aClass5_59);
	}

	public static final Class527_Sub41 method584(int i, Class527_Sub41 class527_sub41, int[] is, boolean bool, int i_32_) {
		Class527_Sub41 class527_sub41_33_ = (Class527_Sub41) client.aClass14_11276.method709((long) i);
		if (null != class527_sub41_33_)
			Class231.method4326(class527_sub41_33_, (class527_sub41_33_.anInt10752 * 1307137747 != 1307137747 * class527_sub41.anInt10752), bool, -450447219);
		client.aClass14_11276.method714(class527_sub41, (long) i);
		Class581.method9669(1307137747 * class527_sub41.anInt10752, is, (byte) -87);
		Class243 class243 = Class648.method10837(i, 1076093213);
		if (null != class243)
			Class430.method6876(class243, (byte) 84);
		if (null != client.aClass243_11196) {
			Class430.method6876(client.aClass243_11196, (byte) 17);
			client.aClass243_11196 = null;
		}
		if (null != class243)
			Class397.method6513((Class183.aClass240Array2100[class243.anInt2504 * -254728301 >>> 16]), class243, !bool, 523436593);
		if (!bool)
			Class573.method9618(class527_sub41.anInt10752 * 1307137747, is, -729961384);
		if (!bool && -1 != client.anInt11237 * -2119864417)
			Class316_Sub1.method15722(-2119864417 * client.anInt11237, 1, 981899269);
		return class527_sub41;
	}

	public static boolean method585(String string, int i) {
		if (null == string)
			return false;
		for (int i_34_ = 0; i_34_ < 182205737 * client.anInt11299; i_34_++) {
			Class72 class72 = client.aClass72Array11301[i_34_];
			if (string.equalsIgnoreCase(class72.aString785))
				return true;
			if (string.equalsIgnoreCase(class72.aString786))
				return true;
		}
		return false;
	}

	public static void method586(byte i) {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 2, -86612327);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 2, -125358554);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 1, 58434255);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 1, 301971945);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 1, 1188973854);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 1, -197875362);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 1, 1624125996);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 1, 323784871);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 2, 919994558);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 1, 2013704999);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 2, 606561173);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 1, 1723666093);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 2058921741);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 321995734);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 2, 1843373928);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 1806558655);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 723491734);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 1, 657959812);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 1, 814012291);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 0, 1552124410);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 4, 198331496);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(-954645573).method10252((short) -27582);
		client.aBool11183 = true;
	}
}
