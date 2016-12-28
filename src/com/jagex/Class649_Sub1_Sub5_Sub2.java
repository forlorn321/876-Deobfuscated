/* Class649_Sub1_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub5_Sub2 extends Class649_Sub1_Sub5 implements Interface59 {
	Class177 aClass177_11978;
	Class34_Sub17 aClass34_Sub17_11979;
	Class536_Sub18_Sub7 aClass536_Sub18_Sub7_11980;
	Class559 aClass559_11981;
	int anInt11982;
	byte aByte11983;
	byte aByte11984;
	boolean aBool11985;
	boolean aBool11986;
	boolean aBool11987;
	boolean aBool11988;
	boolean aBool11989;

	Class563 method9965(Class167 class167) {
		if (null == aClass177_11978)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool11986, -1532865561);
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11979.method70(anInt11982 * 304510135, (byte) 19)).aClass437_8010);
		if (class437 != null) {
			aClass177_11978.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_11978.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public void method378(int i) {
		if (null != aClass177_11978)
			aClass177_11978.method2467();
	}

	boolean method9969(Class167 class167, int i, int i_0_) {
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11979.method70(304510135 * anInt11982, (byte) 58)).aClass437_8010);
		if (null != class437)
			return class167.method2073(i, i_0_, method7851(), class437, -1749442517);
		Class177 class177 = method10930(class167, 131072, 713199109);
		if (null != class177) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_0_, class433, false, 0);
		}
		return false;
	}

	public int method9960(int i) {
		return aClass177_11978 != null ? aClass177_11978.method2562() : 0;
	}

	Class177 method10930(Class167 class167, int i, int i_1_) {
		if (null != aClass177_11978 && class167.method2308(aClass177_11978.method2466(), i) == 0)
			return aClass177_11978;
		Class7 class7 = method10931(class167, i, false, -1179822453);
		if (class7 != null)
			return (Class177) class7.anObject117;
		return null;
	}

	Class7 method10931(Class167 class167, int i, boolean bool, int i_2_) {
		ObjTypeDecoder class612 = (ObjTypeDecoder) aClass34_Sub17_11979.method70(304510135 * anInt11982, (byte) 15);
		Class160 class160;
		Class160 class160_3_;
		if (aBool11988) {
			class160 = aClass553_10838.aClass160Array7418[aByte10840];
			class160_3_ = aClass553_10838.aClass160Array7459[0];
		} else {
			class160 = aClass553_10838.aClass160Array7459[aByte10840];
			if (aByte10840 < 3)
				class160_3_ = aClass553_10838.aClass160Array7459[aByte10840 + 1];
			else
				class160_3_ = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		return (class612.method7287(class167, i, (ObjShapes.aClass606_7894.anInt7878 * -723459231 != aByte11983 ? (int) aByte11983 : ObjShapes.aClass606_7880.anInt7878 * -723459231), (aByte11983 == -723459231 * ObjShapes.aClass606_7894.anInt7878 ? (int) (aByte11984 + 4) : aByte11984), class160, class160_3_, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, bool, null, (byte) -99));
	}

	boolean method9956() {
		if (aClass177_11978 != null)
			return aClass177_11978.method2511();
		return false;
	}

	public Class559 method9962(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_11981)
			aClass559_11981 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10930(class167, 0, 1995346017), (short) -12989);
		return aClass559_11981;
	}

	void method9945(Class167 class167, int i) {
		/* empty */
	}

	public void method382(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_11980 == null && aBool11987) {
			Class7 class7 = method10931(class167, 262144, true, 943869656);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11980;
			aClass536_Sub18_Sub7_11980 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 40);
	}

	public void method379() {
		if (null != aClass177_11978)
			aClass177_11978.method2467();
	}

	void method9986(int i) {
		aBool11985 = false;
		if (aClass177_11978 != null)
			aClass177_11978.method2465(aClass177_11978.method2466() & ~0x10000);
	}

	public int method373(byte i) {
		return 304510135 * anInt11982;
	}

	public int method71(int i) {
		return aByte11983;
	}

	public int method367(byte i) {
		return aByte11984;
	}

	boolean method9939(Class167 class167, int i, int i_4_, byte i_5_) {
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11979.method70(304510135 * anInt11982, (byte) -13)).aClass437_8010);
		if (null != class437)
			return class167.method2073(i, i_4_, method7851(), class437, -1936019565);
		Class177 class177 = method10930(class167, 131072, -960274315);
		if (null != class177) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_4_, class433, false, 0);
		}
		return false;
	}

	public boolean method370(int i) {
		return aBool11989;
	}

	public boolean method369(int i) {
		return aBool11987;
	}

	boolean method9957(Class167 class167, int i, int i_6_) {
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11979.method70(304510135 * anInt11982, (byte) -82)).aClass437_8010);
		if (null != class437)
			return class167.method2073(i, i_6_, method7851(), class437, -1934177998);
		Class177 class177 = method10930(class167, 131072, 1137653796);
		if (null != class177) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_6_, class433, false, 0);
		}
		return false;
	}

	public void method372(Class167 class167, int i) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (null == aClass536_Sub18_Sub7_11980 && aBool11987) {
			Class7 class7 = method10931(class167, 262144, true, -2111480784);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11980;
			aClass536_Sub18_Sub7_11980 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6758(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, 2041776710);
	}

	public int method9984() {
		return aClass177_11978 != null ? aClass177_11978.method2562() : 0;
	}

	public int method9() {
		return 304510135 * anInt11982;
	}

	public int method10() {
		return 304510135 * anInt11982;
	}

	public int method374() {
		return aByte11983;
	}

	public int method267() {
		return aByte11983;
	}

	public Class559 method9946(Class167 class167, int i) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_11981)
			aClass559_11981 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10930(class167, 0, -1754977753), (short) -13590);
		return aClass559_11981;
	}

	public int method376() {
		return aByte11984;
	}

	public void method270() {
		if (null != aClass177_11978)
			aClass177_11978.method2467();
	}

	public void method346() {
		if (null != aClass177_11978)
			aClass177_11978.method2467();
	}

	boolean method9974(int i) {
		if (aClass177_11978 != null)
			return !aClass177_11978.method2512();
		return true;
	}

	public void method353() {
		if (null != aClass177_11978)
			aClass177_11978.method2467();
	}

	void method9943(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_7_, int i_8_, boolean bool, int i_9_) {
		if (class649_sub1 instanceof Class649_Sub1_Sub3_Sub2) {
			Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2 = (Class649_Sub1_Sub3_Sub2) class649_sub1;
			if (null != aClass177_11978 && class649_sub1_sub3_sub2.aClass177_12022 != null)
				aClass177_11978.method2469((class649_sub1_sub3_sub2.aClass177_12022), i, i_7_, i_8_, bool);
		} else if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub2) {
			Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2_10_ = (Class649_Sub1_Sub5_Sub2) class649_sub1;
			if (null != aClass177_11978 && class649_sub1_sub5_sub2_10_.aClass177_11978 != null)
				aClass177_11978.method2469((class649_sub1_sub5_sub2_10_.aClass177_11978), i, i_7_, i_8_, bool);
		}
	}

	public boolean method381() {
		return aBool11987;
	}

	public boolean method368() {
		return aBool11989;
	}

	public boolean method380() {
		return aBool11987;
	}

	public void method383(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_11980 == null && aBool11987) {
			Class7 class7 = method10931(class167, 262144, true, -1845310237);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11980;
			aClass536_Sub18_Sub7_11980 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 104);
	}

	public void method384(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (null == aClass536_Sub18_Sub7_11980 && aBool11987) {
			Class7 class7 = method10931(class167, 262144, true, -1494666960);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11980;
			aClass536_Sub18_Sub7_11980 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6758(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, 2066510092);
	}

	boolean method9987() {
		if (aClass177_11978 != null)
			return !aClass177_11978.method2512();
		return true;
	}

	boolean method9973() {
		return aBool11985;
	}

	public int method9941() {
		return aClass177_11978 != null ? aClass177_11978.method2562() : 0;
	}

	public int method9958() {
		return aClass177_11978 != null ? aClass177_11978.method2562() : 0;
	}

	Class563 method9966(Class167 class167) {
		if (null == aClass177_11978)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool11986, -385278183);
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11979.method70(anInt11982 * 304510135, (byte) -80)).aClass437_8010);
		if (class437 != null) {
			aClass177_11978.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_11978.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public int method375() {
		return aByte11983;
	}

	public Class559 method9961(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_11981)
			aClass559_11981 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10930(class167, 0, -2117771072), (short) -2979);
		return aClass559_11981;
	}

	public void method371(Class167 class167, int i) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_11980 == null && aBool11987) {
			Class7 class7 = method10931(class167, 262144, true, 1967211991);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_11980;
			aClass536_Sub18_Sub7_11980 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (class536_sub18_sub7 != null)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 115);
	}

	public Class559 method9963(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_11981)
			aClass559_11981 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10930(class167, 0, 1214448387), (short) -19746);
		return aClass559_11981;
	}

	Class563 method9985(Class167 class167) {
		if (null == aClass177_11978)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool11986, 630842282);
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11979.method70(anInt11982 * 304510135, (byte) -59)).aClass437_8010);
		if (class437 != null) {
			aClass177_11978.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_11978.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public Class649_Sub1_Sub5_Sub2(Class553 class553, Class167 class167, Class34_Sub17 class34_sub17, ObjTypeDecoder class612, int i, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool_21_, boolean bool_22_) {
		super(class553, i, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, class612.anInt7996 * -1529252395 == 1, Class533.method6464(i_19_, i_20_, -918320373));
		aClass34_Sub17_11979 = class34_sub17;
		anInt11982 = class612.anInt8008 * -1591612999;
		aByte10840 = (byte) i_11_;
		aBool11988 = bool;
		aByte11983 = (byte) i_19_;
		aByte11984 = (byte) i_20_;
		aBool11986 = 1248110961 * class612.anInt7953 != 0 && !bool;
		aBool11985 = bool_21_;
		aBool11987 = (class167.method2012() && class612.aBool8000 && !aBool11988 && ClientSetting.aClass536_Sub40_8843.shadowSetting.method10004(406325794) != 0);
		aBool11989 = bool_22_;
		int i_23_ = 2048;
		if (aBool11985)
			i_23_ |= 0x10000;
		if (class612.aBool7969)
			i_23_ |= 0x80000;
		Class7 class7 = method10931(class167, i_23_, aBool11987, -1978705815);
		if (class7 != null) {
			aClass177_11978 = (Class177) class7.anObject117;
			aClass536_Sub18_Sub7_11980 = (Class536_Sub18_Sub7) class7.anObject118;
			if (aBool11985 || class612.aBool7969) {
				aClass177_11978 = aClass177_11978.method2623((byte) 0, i_23_, false);
				if (class612.aBool7969) {
					Class501 class501 = client.aClass515_11066.method6245((byte) 41);
					aClass177_11978.method2510(class501.anInt6846 * 861320207, (class501.anInt6848 * -1291356555), class501.anInt6847 * 55899967, class501.anInt6845 * 857983835);
				}
			}
		}
		method9968(1, -2091596716);
	}

	public int method10932(int i) {
		return null != aClass177_11978 ? aClass177_11978.method2493() / 4 : 15;
	}

	void method9967(Class167 class167) {
		/* empty */
	}

	Class563 method9944(Class167 class167, byte i) {
		if (null == aClass177_11978)
			return null;
		Class433 class433 = method7851();
		Class563 class563 = Class225.method3212(aBool11986, -1644590221);
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11979.method70(anInt11982 * 304510135, (byte) -98)).aClass437_8010);
		if (class437 != null) {
			aClass177_11978.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_11978.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	boolean method9942(int i) {
		if (aClass177_11978 != null)
			return aClass177_11978.method2511();
		return false;
	}

	boolean method9971(Class167 class167, int i, int i_24_) {
		Class437 class437 = (((ObjTypeDecoder) aClass34_Sub17_11979.method70(304510135 * anInt11982, (byte) -35)).aClass437_8010);
		if (null != class437)
			return class167.method2073(i, i_24_, method7851(), class437, -1807015755);
		Class177 class177 = method10930(class167, 131072, 1146411593);
		if (null != class177) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_24_, class433, false, 0);
		}
		return false;
	}

	public int method377() {
		return aByte11984;
	}

	boolean method9972() {
		return aBool11985;
	}

	boolean method9938() {
		return aBool11985;
	}

	void method9947(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_25_, int i_26_, boolean bool) {
		if (class649_sub1 instanceof Class649_Sub1_Sub3_Sub2) {
			Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2 = (Class649_Sub1_Sub3_Sub2) class649_sub1;
			if (null != aClass177_11978 && class649_sub1_sub3_sub2.aClass177_12022 != null)
				aClass177_11978.method2469((class649_sub1_sub3_sub2.aClass177_12022), i, i_25_, i_26_, bool);
		} else if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub2) {
			Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2_27_ = (Class649_Sub1_Sub5_Sub2) class649_sub1;
			if (null != aClass177_11978 && class649_sub1_sub5_sub2_27_.aClass177_11978 != null)
				aClass177_11978.method2469((class649_sub1_sub5_sub2_27_.aClass177_11978), i, i_25_, i_26_, bool);
		}
	}

	void method9978(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_28_, int i_29_, boolean bool) {
		if (class649_sub1 instanceof Class649_Sub1_Sub3_Sub2) {
			Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2 = (Class649_Sub1_Sub3_Sub2) class649_sub1;
			if (null != aClass177_11978 && class649_sub1_sub3_sub2.aClass177_12022 != null)
				aClass177_11978.method2469((class649_sub1_sub3_sub2.aClass177_12022), i, i_28_, i_29_, bool);
		} else if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub2) {
			Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2_30_ = (Class649_Sub1_Sub5_Sub2) class649_sub1;
			if (null != aClass177_11978 && class649_sub1_sub5_sub2_30_.aClass177_11978 != null)
				aClass177_11978.method2469((class649_sub1_sub5_sub2_30_.aClass177_11978), i, i_28_, i_29_, bool);
		}
	}

	void method9976() {
		aBool11985 = false;
		if (aClass177_11978 != null)
			aClass177_11978.method2465(aClass177_11978.method2466() & ~0x10000);
	}

	public Class559 method9955(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_11981)
			aClass559_11981 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10930(class167, 0, -761982675), (short) -19006);
		return aClass559_11981;
	}

	Class177 method10933(Class167 class167, int i) {
		if (null != aClass177_11978 && class167.method2308(aClass177_11978.method2466(), i) == 0)
			return aClass177_11978;
		Class7 class7 = method10931(class167, i, false, -631692932);
		if (class7 != null)
			return (Class177) class7.anObject117;
		return null;
	}

	Class177 method10934(Class167 class167, int i) {
		if (null != aClass177_11978 && class167.method2308(aClass177_11978.method2466(), i) == 0)
			return aClass177_11978;
		Class7 class7 = method10931(class167, i, false, 946919754);
		if (class7 != null)
			return (Class177) class7.anObject117;
		return null;
	}

	boolean method9940(int i) {
		return aBool11985;
	}

	public int method10935() {
		return null != aClass177_11978 ? aClass177_11978.method2493() / 4 : 15;
	}

	void method9975(Class167 class167) {
		/* empty */
	}

	static boolean method10936(int i, int i_31_, int i_32_) {
		if (i_31_ >= 1000 && i < 1000)
			return true;
		if (i_31_ < 1000 && i < 1000) {
			if (Class645.method7805(i, 2111760486))
				return true;
			if (Class645.method7805(i_31_, 1010760161))
				return false;
			return true;
		}
		if (i_31_ >= 1000 && i >= 1000)
			return true;
		return false;
	}
}
