/* Class649_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub3_Sub2 extends Class649_Sub1_Sub3 implements Interface59 {
	Class177 aClass177_12022;
	Class559 aClass559_12023;
	Class34_Sub17 aClass34_Sub17_12024;
	boolean aBool12025;
	Class536_Sub18_Sub7 aClass536_Sub18_Sub7_12026;
	static int[] anIntArray12027;
	int anInt12028;
	byte aByte12029;
	byte aByte12030;
	static int[] anIntArray12031 = { 1, 2, 4, 8 };
	boolean aBool12032;
	boolean aBool12033;
	boolean aBool12034;

	public int method71(int i) {
		return aByte12030;
	}

	public void method270() {
		if (aClass177_12022 != null)
			aClass177_12022.method2467();
	}

	boolean method9942(int i) {
		if (aClass177_12022 != null)
			return aClass177_12022.method2511();
		return false;
	}

	public int method9960(int i) {
		return null != aClass177_12022 ? aClass177_12022.method2562() : 0;
	}

	Class177 method10957(Class167 class167, int i, byte i_0_) {
		if (null != aClass177_12022 && class167.method2308(aClass177_12022.method2466(), i) == 0)
			return aClass177_12022;
		Class7 class7 = method10958(class167, i, false, 947390899);
		if (null != class7)
			return (Class177) class7.anObject117;
		return null;
	}

	Class7 method10958(Class167 class167, int i, boolean bool, int i_1_) {
		Class612 class612 = (Class612) aClass34_Sub17_12024.method70(anInt12028 * 42962607, (byte) 42);
		Class160 class160;
		Class160 class160_2_;
		if (aBool12034) {
			class160 = aClass553_10838.aClass160Array7418[aByte10840];
			class160_2_ = aClass553_10838.aClass160Array7459[0];
		} else {
			class160 = aClass553_10838.aClass160Array7459[aByte10840];
			if (aByte10840 < 3)
				class160_2_ = aClass553_10838.aClass160Array7459[aByte10840 + 1];
			else
				class160_2_ = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		return class612.method7287(class167, i, aByte12030, aByte12029, class160, class160_2_, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, bool, null, (byte) -114);
	}

	public Class559 method9946(Class167 class167, int i) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12023)
			aClass559_12023 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10957(class167, 0, (byte) -59), (short) 3444);
		return aClass559_12023;
	}

	Class563 method9944(Class167 class167, byte i) {
		if (aClass177_12022 == null)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool12032, -527237271);
		Class437 class437 = (((Class612) aClass34_Sub17_12024.method70(42962607 * anInt12028, (byte) -5)).aClass437_8010);
		if (null != class437) {
			aClass177_12022.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_12022.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	void method9945(Class167 class167, int i) {
		/* empty */
	}

	boolean method9939(Class167 class167, int i, int i_3_, byte i_4_) {
		Class437 class437 = (((Class612) aClass34_Sub17_12024.method70(42962607 * anInt12028, (byte) -3)).aClass437_8010);
		if (class437 != null)
			return class167.method2073(i, i_3_, method7851(), class437, -1867120823);
		Class177 class177 = method10957(class167, 131072, (byte) -25);
		if (class177 != null) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_3_, class433, false, 0);
		}
		return false;
	}

	boolean method9940(int i) {
		return aBool12033;
	}

	void method9943(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_5_, int i_6_, boolean bool, int i_7_) {
		if (class649_sub1 instanceof Class649_Sub1_Sub3_Sub2) {
			Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2_8_ = (Class649_Sub1_Sub3_Sub2) class649_sub1;
			if (null != aClass177_12022 && null != class649_sub1_sub3_sub2_8_.aClass177_12022)
				aClass177_12022.method2469((class649_sub1_sub3_sub2_8_.aClass177_12022), i, i_5_, i_6_, bool);
		} else if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub2) {
			Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2 = (Class649_Sub1_Sub5_Sub2) class649_sub1;
			if (null != aClass177_12022 && null != class649_sub1_sub5_sub2.aClass177_11978)
				aClass177_12022.method2469((class649_sub1_sub5_sub2.aClass177_11978), i, i_5_, i_6_, bool);
		}
	}

	void method9986(int i) {
		aBool12033 = false;
		if (aClass177_12022 != null)
			aClass177_12022.method2465(aClass177_12022.method2466() & ~0x10000);
	}

	public int method373(byte i) {
		return 42962607 * anInt12028;
	}

	static int method10959(int i, int i_9_) {
		if (i == Class606.aClass606_7874.anInt7878 * -723459231 || -723459231 * Class606.aClass606_7876.anInt7878 == i)
			return anIntArray12027[i_9_ & 0x3];
		return anIntArray12031[i_9_ & 0x3];
	}

	public int method367(byte i) {
		return aByte12029;
	}

	boolean method9973() {
		return aBool12033;
	}

	public boolean method370(int i) {
		return true;
	}

	Class563 method9966(Class167 class167) {
		if (aClass177_12022 == null)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool12032, -1653475838);
		Class437 class437 = (((Class612) aClass34_Sub17_12024.method70(42962607 * anInt12028, (byte) 51)).aClass437_8010);
		if (null != class437) {
			aClass177_12022.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_12022.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public void method383(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12026 == null && aBool12025) {
			Class7 class7 = method10958(class167, 262144, true, 451974320);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (class7 != null ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12026;
			aClass536_Sub18_Sub7_12026 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 29);
	}

	boolean method9971(Class167 class167, int i, int i_10_) {
		Class437 class437 = (((Class612) aClass34_Sub17_12024.method70(42962607 * anInt12028, (byte) 7)).aClass437_8010);
		if (class437 != null)
			return class167.method2073(i, i_10_, method7851(), class437, -1851404279);
		Class177 class177 = method10957(class167, 131072, (byte) -31);
		if (class177 != null) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_10_, class433, false, 0);
		}
		return false;
	}

	static {
		anIntArray12027 = new int[] { 16, 32, 64, 128 };
	}

	public int method9() {
		return 42962607 * anInt12028;
	}

	public int method10() {
		return 42962607 * anInt12028;
	}

	public int method267() {
		return aByte12030;
	}

	public int method376() {
		return aByte12029;
	}

	public Class649_Sub1_Sub3_Sub2(Class553 class553, Class167 class167, Class34_Sub17 class34_sub17, Class612 class612, int i, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_, int i_16_, boolean bool_17_) {
		super(class553, i_12_, i_13_, i_14_, i, i_11_, Class97.method1321(i_15_, i_16_, 1066073076));
		aClass34_Sub17_12024 = class34_sub17;
		anInt12028 = class612.anInt8008 * 24892529;
		aBool12034 = bool;
		aByte12030 = (byte) i_15_;
		aByte12029 = (byte) i_16_;
		aBool12032 = 0 != 1248110961 * class612.anInt7953 && !bool;
		aBool12033 = bool_17_;
		aBool12025 = (class167.method2012() && class612.aBool8000 && !aBool12034 && ClientSetting.aClass536_Sub40_8843.shadowSetting.method10004(-1652907588) != 0);
		int i_18_ = 2048;
		if (aBool12033)
			i_18_ |= 0x10000;
		if (class612.aBool7969)
			i_18_ |= 0x80000;
		Class7 class7 = method10958(class167, i_18_, aBool12025, 318410512);
		if (null != class7) {
			aClass177_12022 = (Class177) class7.anObject117;
			aClass536_Sub18_Sub7_12026 = (Class536_Sub18_Sub7) class7.anObject118;
			if (aBool12033 || class612.aBool7969) {
				aClass177_12022 = aClass177_12022.method2623((byte) 0, i_18_, false);
				if (class612.aBool7969) {
					Class501 class501 = client.aClass515_11066.method6245((byte) -28);
					aClass177_12022.method2510(class501.anInt6846 * 861320207, (class501.anInt6848 * -1291356555), 55899967 * class501.anInt6847, class501.anInt6845 * 857983835);
				}
			}
		}
		method9968(1, -1689739843);
	}

	public int method377() {
		return aByte12029;
	}

	public void method371(Class167 class167, int i) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12026 == null && aBool12025) {
			Class7 class7 = method10958(class167, 262144, true, 611520265);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (class7 != null ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12026;
			aClass536_Sub18_Sub7_12026 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 113);
	}

	public void method379() {
		if (aClass177_12022 != null)
			aClass177_12022.method2467();
	}

	public void method353() {
		if (aClass177_12022 != null)
			aClass177_12022.method2467();
	}

	public boolean method380() {
		return aBool12025;
	}

	public boolean method381() {
		return aBool12025;
	}

	public boolean method368() {
		return true;
	}

	public void method382(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12026 == null && aBool12025) {
			Class7 class7 = method10958(class167, 262144, true, -572218813);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (class7 != null ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12026;
			aClass536_Sub18_Sub7_12026 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 36);
	}

	Class563 method9965(Class167 class167) {
		if (aClass177_12022 == null)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool12032, 1179970727);
		Class437 class437 = (((Class612) aClass34_Sub17_12024.method70(42962607 * anInt12028, (byte) -53)).aClass437_8010);
		if (null != class437) {
			aClass177_12022.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_12022.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public void method384(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12026 == null && aBool12025) {
			Class7 class7 = method10958(class167, 262144, true, -1096012155);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (class7 != null ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12026;
			aClass536_Sub18_Sub7_12026 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (null != class536_sub18_sub7)
			aClass553_10838.method6758(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, 2052912916);
	}

	boolean method9987() {
		if (null != aClass177_12022)
			return !aClass177_12022.method2512();
		return true;
	}

	public void method372(Class167 class167, int i) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12026 == null && aBool12025) {
			Class7 class7 = method10958(class167, 262144, true, -796264941);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (class7 != null ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12026;
			aClass536_Sub18_Sub7_12026 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (null != class536_sub18_sub7)
			aClass553_10838.method6758(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, 2119496545);
	}

	public int method9941() {
		return null != aClass177_12022 ? aClass177_12022.method2562() : 0;
	}

	public int method9958() {
		return null != aClass177_12022 ? aClass177_12022.method2562() : 0;
	}

	boolean method9956() {
		if (aClass177_12022 != null)
			return aClass177_12022.method2511();
		return false;
	}

	public void method346() {
		if (aClass177_12022 != null)
			aClass177_12022.method2467();
	}

	public Class559 method9962(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12023)
			aClass559_12023 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10957(class167, 0, (byte) -101), (short) -2537);
		return aClass559_12023;
	}

	public int method9984() {
		return null != aClass177_12022 ? aClass177_12022.method2562() : 0;
	}

	Class563 method9985(Class167 class167) {
		if (aClass177_12022 == null)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool12032, -332970645);
		Class437 class437 = (((Class612) aClass34_Sub17_12024.method70(42962607 * anInt12028, (byte) 112)).aClass437_8010);
		if (null != class437) {
			aClass177_12022.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_12022.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	boolean method9938() {
		return aBool12033;
	}

	public int method375() {
		return aByte12030;
	}

	void method9967(Class167 class167) {
		/* empty */
	}

	void method9975(Class167 class167) {
		/* empty */
	}

	boolean method9969(Class167 class167, int i, int i_19_) {
		Class437 class437 = (((Class612) aClass34_Sub17_12024.method70(42962607 * anInt12028, (byte) 1)).aClass437_8010);
		if (class437 != null)
			return class167.method2073(i, i_19_, method7851(), class437, -1976594420);
		Class177 class177 = method10957(class167, 131072, (byte) -1);
		if (class177 != null) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_19_, class433, false, 0);
		}
		return false;
	}

	boolean method9957(Class167 class167, int i, int i_20_) {
		Class437 class437 = (((Class612) aClass34_Sub17_12024.method70(42962607 * anInt12028, (byte) -17)).aClass437_8010);
		if (class437 != null)
			return class167.method2073(i, i_20_, method7851(), class437, -1735435313);
		Class177 class177 = method10957(class167, 131072, (byte) -74);
		if (class177 != null) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_20_, class433, false, 0);
		}
		return false;
	}

	public Class559 method9961(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12023)
			aClass559_12023 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10957(class167, 0, (byte) -15), (short) -30847);
		return aClass559_12023;
	}

	public boolean method369(int i) {
		return aBool12025;
	}

	boolean method9972() {
		return aBool12033;
	}

	public Class559 method9963(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12023)
			aClass559_12023 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10957(class167, 0, (byte) -64), (short) -21347);
		return aClass559_12023;
	}

	public void method378(int i) {
		if (aClass177_12022 != null)
			aClass177_12022.method2467();
	}

	void method9978(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_21_, int i_22_, boolean bool) {
		if (class649_sub1 instanceof Class649_Sub1_Sub3_Sub2) {
			Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2_23_ = (Class649_Sub1_Sub3_Sub2) class649_sub1;
			if (null != aClass177_12022 && null != class649_sub1_sub3_sub2_23_.aClass177_12022)
				aClass177_12022.method2469((class649_sub1_sub3_sub2_23_.aClass177_12022), i, i_21_, i_22_, bool);
		} else if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub2) {
			Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2 = (Class649_Sub1_Sub5_Sub2) class649_sub1;
			if (null != aClass177_12022 && null != class649_sub1_sub5_sub2.aClass177_11978)
				aClass177_12022.method2469((class649_sub1_sub5_sub2.aClass177_11978), i, i_21_, i_22_, bool);
		}
	}

	void method9976() {
		aBool12033 = false;
		if (aClass177_12022 != null)
			aClass177_12022.method2465(aClass177_12022.method2466() & ~0x10000);
	}

	public int method374() {
		return aByte12030;
	}

	static int method10960(int i, int i_24_) {
		if (i == Class606.aClass606_7874.anInt7878 * -723459231 || -723459231 * Class606.aClass606_7876.anInt7878 == i)
			return anIntArray12027[i_24_ & 0x3];
		return anIntArray12031[i_24_ & 0x3];
	}

	void method9947(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_25_, int i_26_, boolean bool) {
		if (class649_sub1 instanceof Class649_Sub1_Sub3_Sub2) {
			Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2_27_ = (Class649_Sub1_Sub3_Sub2) class649_sub1;
			if (null != aClass177_12022 && null != class649_sub1_sub3_sub2_27_.aClass177_12022)
				aClass177_12022.method2469((class649_sub1_sub3_sub2_27_.aClass177_12022), i, i_25_, i_26_, bool);
		} else if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub2) {
			Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2 = (Class649_Sub1_Sub5_Sub2) class649_sub1;
			if (null != aClass177_12022 && null != class649_sub1_sub5_sub2.aClass177_11978)
				aClass177_12022.method2469((class649_sub1_sub5_sub2.aClass177_11978), i, i_25_, i_26_, bool);
		}
	}

	public Class559 method9955(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12023)
			aClass559_12023 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10957(class167, 0, (byte) -84), (short) -23444);
		return aClass559_12023;
	}

	Class177 method10961(Class167 class167, int i) {
		if (null != aClass177_12022 && class167.method2308(aClass177_12022.method2466(), i) == 0)
			return aClass177_12022;
		Class7 class7 = method10958(class167, i, false, -689495255);
		if (null != class7)
			return (Class177) class7.anObject117;
		return null;
	}

	Class177 method10962(Class167 class167, int i) {
		if (null != aClass177_12022 && class167.method2308(aClass177_12022.method2466(), i) == 0)
			return aClass177_12022;
		Class7 class7 = method10958(class167, i, false, -20324774);
		if (null != class7)
			return (Class177) class7.anObject117;
		return null;
	}

	boolean method9974(int i) {
		if (null != aClass177_12022)
			return !aClass177_12022.method2512();
		return true;
	}
}
