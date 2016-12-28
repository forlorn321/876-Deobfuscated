/* Class649_Sub1_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub2_Sub2 extends Class649_Sub1_Sub2 implements Interface59 {
	boolean aBool11996;
	Class177 aClass177_11997;
	Class536_Sub18_Sub7 aClass536_Sub18_Sub7_11998;
	Class34_Sub17 aClass34_Sub17_11999;
	int anInt12000;
	byte aByte12001;
	boolean aBool12002;
	boolean aBool12003;
	boolean aBool12004;
	Class559 aClass559_12005;

	boolean method9942(int i) {
		if (null != aClass177_11997)
			return aClass177_11997.method2511();
		return false;
	}

	boolean method9974(int i) {
		if (null != aClass177_11997)
			return !aClass177_11997.method2512();
		return true;
	}

	public void method346() {
		if (aClass177_11997 != null)
			aClass177_11997.method2467();
	}

	public int method9960(int i) {
		return aClass177_11997 != null ? aClass177_11997.method2562() : 0;
	}

	Class177 method10941(Class167 class167, int i, byte i_0_) {
		if (aClass177_11997 != null && class167.method2308(aClass177_11997.method2466(), i) == 0)
			return aClass177_11997;
		Class7 class7 = method10942(class167, i, false, -2054990043);
		if (class7 != null)
			return (Class177) class7.anObject117;
		return null;
	}

	Class7 method10942(Class167 class167, int i, boolean bool, int i_1_) {
		ObjTypeDecoder class612 = ((ObjTypeDecoder) aClass34_Sub17_11999.method70(-1374813275 * anInt12000, (byte) -33));
		Class160 class160;
		Class160 class160_2_;
		if (aBool12002) {
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
		return class612.method7287(class167, i, (ObjShapes.aClass606_7895.anInt7878 * -723459231), aByte12001, class160, class160_2_, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, bool, null, (byte) -71);
	}

	public Class559 method9946(Class167 class167, int i) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12005)
			aClass559_12005 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10941(class167, 0, (byte) -98), (short) -7248);
		return aClass559_12005;
	}

	public boolean method370(int i) {
		return true;
	}

	Class563 method9944(Class167 class167, byte i) {
		if (null == aClass177_11997)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool12003, -763440635);
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11999.method70(anInt12000 * -1374813275, (byte) -84)).aClass437_8010);
		if (null != class437) {
			aClass177_11997.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_11997.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	boolean method9956() {
		if (null != aClass177_11997)
			return aClass177_11997.method2511();
		return false;
	}

	boolean method9940(int i) {
		return aBool12004;
	}

	public void method372(Class167 class167, int i) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_11998 == null && aBool11996) {
			Class7 class7 = method10942(class167, 262144, true, -1498312896);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (class7 != null ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11998;
			aClass536_Sub18_Sub7_11998 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6758(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, 2094272386);
	}

	void method9986(int i) {
		aBool12004 = false;
		if (null != aClass177_11997)
			aClass177_11997.method2465(aClass177_11997.method2466() & ~0x10000);
	}

	boolean method9969(Class167 class167, int i, int i_3_) {
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11999.method70(anInt12000 * -1374813275, (byte) -103)).aClass437_8010);
		if (class437 != null)
			return class167.method2073(i, i_3_, method7851(), class437, -1960842706);
		Class177 class177 = method10941(class167, 131072, (byte) 32);
		if (class177 != null) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_3_, class433, false, 0);
		}
		return false;
	}

	public Class649_Sub1_Sub2_Sub2(Class553 class553, Class167 class167, Class34_Sub17 class34_sub17, ObjTypeDecoder class612, int i, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_, boolean bool_9_) {
		super(class553, i_5_, i_6_, i_7_, i, i_4_, class612.anInt7987 * -1688265125);
		aClass34_Sub17_11999 = class34_sub17;
		anInt12000 = 477198867 * class612.anInt8008;
		aBool12002 = bool;
		aByte12001 = (byte) i_8_;
		aBool12003 = 0 != class612.anInt7953 * 1248110961 && !bool;
		aBool12004 = bool_9_;
		aBool11996 = (class167.method2012() && class612.aBool8000 && !aBool12002 && ClientSetting.aClass536_Sub40_8843.shadowSetting.method10004(-1297861423) != 0);
		int i_10_ = 2048;
		if (aBool12004)
			i_10_ |= 0x10000;
		if (class612.aBool7969)
			i_10_ |= 0x80000;
		Class7 class7 = method10942(class167, i_10_, aBool11996, -2056809677);
		if (class7 != null) {
			aClass177_11997 = (Class177) class7.anObject117;
			aClass536_Sub18_Sub7_11998 = (Class536_Sub18_Sub7) class7.anObject118;
			if (aBool12004 || class612.aBool7969) {
				aClass177_11997 = aClass177_11997.method2623((byte) 0, i_10_, false);
				if (class612.aBool7969) {
					Class501 class501 = client.aClass515_11066.method6245((byte) -6);
					aClass177_11997.method2510(861320207 * class501.anInt6846, (class501.anInt6848 * -1291356555), class501.anInt6847 * 55899967, class501.anInt6845 * 857983835);
				}
			}
		}
		method9968(1, -1164266068);
	}

	public int method367(byte i) {
		return aByte12001;
	}

	public void method378(int i) {
		if (aClass177_11997 != null)
			aClass177_11997.method2467();
	}

	public boolean method380() {
		return aBool11996;
	}

	public boolean method369(int i) {
		return aBool11996;
	}

	public void method371(Class167 class167, int i) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (null == aClass536_Sub18_Sub7_11998 && aBool11996) {
			Class7 class7 = method10942(class167, 262144, true, -1860241823);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11998;
			aClass536_Sub18_Sub7_11998 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 71);
	}

	Class563 method9965(Class167 class167) {
		if (null == aClass177_11997)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool12003, -260456010);
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11999.method70(anInt12000 * -1374813275, (byte) -15)).aClass437_8010);
		if (null != class437) {
			aClass177_11997.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_11997.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public int method9() {
		return -1374813275 * anInt12000;
	}

	public int method10() {
		return -1374813275 * anInt12000;
	}

	public Class559 method9955(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12005)
			aClass559_12005 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10941(class167, 0, (byte) -28), (short) -32257);
		return aClass559_12005;
	}

	public Class559 method9963(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12005)
			aClass559_12005 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10941(class167, 0, (byte) -88), (short) -17163);
		return aClass559_12005;
	}

	public int method375() {
		return ObjShapes.aClass606_7895.anInt7878 * -723459231;
	}

	boolean method9987() {
		if (null != aClass177_11997)
			return !aClass177_11997.method2512();
		return true;
	}

	Class177 method10943(Class167 class167, int i) {
		if (aClass177_11997 != null && class167.method2308(aClass177_11997.method2466(), i) == 0)
			return aClass177_11997;
		Class7 class7 = method10942(class167, i, false, -1812848310);
		if (class7 != null)
			return (Class177) class7.anObject117;
		return null;
	}

	public void method270() {
		if (aClass177_11997 != null)
			aClass177_11997.method2467();
	}

	void method9975(Class167 class167) {
		/* empty */
	}

	public int method71(int i) {
		return ObjShapes.aClass606_7895.anInt7878 * -723459231;
	}

	public void method353() {
		if (aClass177_11997 != null)
			aClass177_11997.method2467();
	}

	public int method373(byte i) {
		return -1374813275 * anInt12000;
	}

	public boolean method381() {
		return aBool11996;
	}

	public boolean method368() {
		return true;
	}

	public void method382(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (null == aClass536_Sub18_Sub7_11998 && aBool11996) {
			Class7 class7 = method10942(class167, 262144, true, -1907701777);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11998;
			aClass536_Sub18_Sub7_11998 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 86);
	}

	public void method383(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (null == aClass536_Sub18_Sub7_11998 && aBool11996) {
			Class7 class7 = method10942(class167, 262144, true, -1699744643);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11998;
			aClass536_Sub18_Sub7_11998 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 59);
	}

	public void method384(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_11998 == null && aBool11996) {
			Class7 class7 = method10942(class167, 262144, true, -2021232195);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (class7 != null ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11998;
			aClass536_Sub18_Sub7_11998 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6758(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, 2101686848);
	}

	public int method9958() {
		return aClass177_11997 != null ? aClass177_11997.method2562() : 0;
	}

	public int method377() {
		return aByte12001;
	}

	public int method9941() {
		return aClass177_11997 != null ? aClass177_11997.method2562() : 0;
	}

	boolean method9939(Class167 class167, int i, int i_11_, byte i_12_) {
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11999.method70(anInt12000 * -1374813275, (byte) -17)).aClass437_8010);
		if (class437 != null)
			return class167.method2073(i, i_11_, method7851(), class437, -1991908948);
		Class177 class177 = method10941(class167, 131072, (byte) -40);
		if (class177 != null) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_11_, class433, false, 0);
		}
		return false;
	}

	public int method9984() {
		return aClass177_11997 != null ? aClass177_11997.method2562() : 0;
	}

	void method9967(Class167 class167) {
		/* empty */
	}

	public Class559 method9961(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12005)
			aClass559_12005 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10941(class167, 0, (byte) -91), (short) -22065);
		return aClass559_12005;
	}

	public Class559 method9962(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12005)
			aClass559_12005 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10941(class167, 0, (byte) -6), (short) -20367);
		return aClass559_12005;
	}

	public int method376() {
		return aByte12001;
	}

	Class563 method9985(Class167 class167) {
		if (null == aClass177_11997)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool12003, -887695466);
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11999.method70(anInt12000 * -1374813275, (byte) -10)).aClass437_8010);
		if (null != class437) {
			aClass177_11997.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_11997.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	void method9943(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_13_, int i_14_, boolean bool, int i_15_) {
		if (class649_sub1 instanceof Class649_Sub1_Sub2_Sub2) {
			Class649_Sub1_Sub2_Sub2 class649_sub1_sub2_sub2_16_ = (Class649_Sub1_Sub2_Sub2) class649_sub1;
			if (aClass177_11997 != null && class649_sub1_sub2_sub2_16_.aClass177_11997 != null)
				aClass177_11997.method2469((class649_sub1_sub2_sub2_16_.aClass177_11997), i, i_13_, i_14_, bool);
		}
	}

	Class563 method9966(Class167 class167) {
		if (null == aClass177_11997)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool12003, 822693151);
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11999.method70(anInt12000 * -1374813275, (byte) 73)).aClass437_8010);
		if (null != class437) {
			aClass177_11997.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_11997.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	void method9945(Class167 class167, int i) {
		/* empty */
	}

	public int method374() {
		return ObjShapes.aClass606_7895.anInt7878 * -723459231;
	}

	public void method379() {
		if (aClass177_11997 != null)
			aClass177_11997.method2467();
	}

	boolean method9957(Class167 class167, int i, int i_17_) {
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11999.method70(anInt12000 * -1374813275, (byte) -6)).aClass437_8010);
		if (class437 != null)
			return class167.method2073(i, i_17_, method7851(), class437, -2135312174);
		Class177 class177 = method10941(class167, 131072, (byte) 18);
		if (class177 != null) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_17_, class433, false, 0);
		}
		return false;
	}

	boolean method9971(Class167 class167, int i, int i_18_) {
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11999.method70(anInt12000 * -1374813275, (byte) -24)).aClass437_8010);
		if (class437 != null)
			return class167.method2073(i, i_18_, method7851(), class437, -2084043014);
		Class177 class177 = method10941(class167, 131072, (byte) 23);
		if (class177 != null) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_18_, class433, false, 0);
		}
		return false;
	}

	boolean method9938() {
		return aBool12004;
	}

	boolean method9972() {
		return aBool12004;
	}

	boolean method9973() {
		return aBool12004;
	}

	void method9947(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_19_, int i_20_, boolean bool) {
		if (class649_sub1 instanceof Class649_Sub1_Sub2_Sub2) {
			Class649_Sub1_Sub2_Sub2 class649_sub1_sub2_sub2_21_ = (Class649_Sub1_Sub2_Sub2) class649_sub1;
			if (aClass177_11997 != null && class649_sub1_sub2_sub2_21_.aClass177_11997 != null)
				aClass177_11997.method2469((class649_sub1_sub2_sub2_21_.aClass177_11997), i, i_19_, i_20_, bool);
		}
	}

	void method9978(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_22_, int i_23_, boolean bool) {
		if (class649_sub1 instanceof Class649_Sub1_Sub2_Sub2) {
			Class649_Sub1_Sub2_Sub2 class649_sub1_sub2_sub2_24_ = (Class649_Sub1_Sub2_Sub2) class649_sub1;
			if (aClass177_11997 != null && class649_sub1_sub2_sub2_24_.aClass177_11997 != null)
				aClass177_11997.method2469((class649_sub1_sub2_sub2_24_.aClass177_11997), i, i_22_, i_23_, bool);
		}
	}

	void method9976() {
		aBool12004 = false;
		if (null != aClass177_11997)
			aClass177_11997.method2465(aClass177_11997.method2466() & ~0x10000);
	}

	public int method267() {
		return ObjShapes.aClass606_7895.anInt7878 * -723459231;
	}

	Class177 method10944(Class167 class167, int i) {
		if (aClass177_11997 != null && class167.method2308(aClass177_11997.method2466(), i) == 0)
			return aClass177_11997;
		Class7 class7 = method10942(class167, i, false, -1808631513);
		if (class7 != null)
			return (Class177) class7.anObject117;
		return null;
	}

	Class7 method10945(Class167 class167, int i, boolean bool) {
		ObjTypeDecoder class612 = ((ObjTypeDecoder) aClass34_Sub17_11999.method70(-1374813275 * anInt12000, (byte) -89));
		Class160 class160;
		Class160 class160_25_;
		if (aBool12002) {
			class160 = aClass553_10838.aClass160Array7418[aByte10840];
			class160_25_ = aClass553_10838.aClass160Array7459[0];
		} else {
			class160 = aClass553_10838.aClass160Array7459[aByte10840];
			if (aByte10840 < 3)
				class160_25_ = aClass553_10838.aClass160Array7459[aByte10840 + 1];
			else
				class160_25_ = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		return class612.method7287(class167, i, (ObjShapes.aClass606_7895.anInt7878 * -723459231), aByte12001, class160, class160_25_, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, bool, null, (byte) 10);
	}

	static void method10946(int i, int i_26_) {
		Class391.anInt4063 = -1712142967 * i;
		Class542_Sub1.anInt10707 = 636642145;
		Class542_Sub1.anInt10707 = 636642145;
		Class455.method5480((byte) 119);
	}

	static int method10947(int i, int i_27_, int i_28_) {
		int i_29_ = i >> 31 & i_27_ - 1;
		return ((i >>> 31) + i) % i_27_ + i_29_;
	}

	static final void method10948(Class668 class668, int i) {
		int i_30_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (client.anInt11289 * -1484801557 == 2 && i_30_ < 142551095 * client.anInt11288)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass31Array11291[i_30_].aBool273 ? 1 : 0;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
