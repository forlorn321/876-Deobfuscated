/* Class649_Sub1_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub4_Sub2 extends Class649_Sub1_Sub4 implements Interface59 {
	int anInt12011;
	boolean aBool12012;
	Class536_Sub18_Sub7 aClass536_Sub18_Sub7_12013;
	Class559 aClass559_12014;
	boolean aBool12015;
	byte aByte12016;
	byte aByte12017;
	boolean aBool12018;
	Class34_Sub17 aClass34_Sub17_12019;
	Class177 aClass177_12020;
	public static Class461 aClass461_12021;

	boolean method9942(int i) {
		if (aClass177_12020 != null)
			return aClass177_12020.method2511();
		return false;
	}

	public int method9958() {
		return null != aClass177_12020 ? aClass177_12020.method2562() : 0;
	}

	Class7 method10950(Class167 class167, int i, boolean bool, byte i_0_) {
		Class612 class612 = (Class612) aClass34_Sub17_12019.method70(1813796665 * anInt12011, (byte) -36);
		Class160 class160;
		Class160 class160_1_;
		if (aBool12012) {
			class160 = aClass553_10838.aClass160Array7418[aByte10840];
			class160_1_ = aClass553_10838.aClass160Array7459[0];
		} else {
			class160 = aClass553_10838.aClass160Array7459[aByte10840];
			if (aByte10840 < 3)
				class160_1_ = aClass553_10838.aClass160Array7459[aByte10840 + 1];
			else
				class160_1_ = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		return class612.method7287(class167, i, aByte12016, aByte12017, class160, class160_1_, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, bool, null, (byte) 55);
	}

	public int method9960(int i) {
		return null != aClass177_12020 ? aClass177_12020.method2562() : 0;
	}

	public int method377() {
		return aByte12017;
	}

	public int method9() {
		return 1813796665 * anInt12011;
	}

	public Class559 method9946(Class167 class167, int i) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12014)
			aClass559_12014 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10951(class167, 0, -1349181388), (short) -31307);
		return aClass559_12014;
	}

	Class563 method9944(Class167 class167, byte i) {
		if (null == aClass177_12020)
			return null;
		Class433 class433 = class167.method2091();
		class433.method5190(method7851());
		class433.method5200((float) aShort11823, 0.0F, (float) aShort11821);
		Class563 class563 = Class225.method3212(aBool12015, 1108590026);
		Class437 class437 = (((Class612) aClass34_Sub17_12019.method70(anInt12011 * 1813796665, (byte) -31)).aClass437_8010);
		if (null != class437) {
			aClass177_12020.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_12020.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	void method9945(Class167 class167, int i) {
		/* empty */
	}

	boolean method9939(Class167 class167, int i, int i_2_, byte i_3_) {
		Class437 class437 = (((Class612) aClass34_Sub17_12019.method70(1813796665 * anInt12011, (byte) 65)).aClass437_8010);
		if (null != class437)
			return class167.method2073(i, i_2_, method7851(), class437, -1990266155);
		Class177 class177 = method10951(class167, 131072, -1349181388);
		if (null != class177) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_2_, class433, false, 0);
		}
		return false;
	}

	public int method373(byte i) {
		return 1813796665 * anInt12011;
	}

	Class563 method9966(Class167 class167) {
		if (null == aClass177_12020)
			return null;
		Class433 class433 = class167.method2091();
		class433.method5190(method7851());
		class433.method5200((float) aShort11823, 0.0F, (float) aShort11821);
		Class563 class563 = Class225.method3212(aBool12015, 462943354);
		Class437 class437 = (((Class612) aClass34_Sub17_12019.method70(anInt12011 * 1813796665, (byte) -47)).aClass437_8010);
		if (null != class437) {
			aClass177_12020.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_12020.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public int method367(byte i) {
		return aByte12017;
	}

	public void method378(int i) {
		if (null != aClass177_12020)
			aClass177_12020.method2467();
	}

	public Class649_Sub1_Sub4_Sub2(Class553 class553, Class167 class167, Class34_Sub17 class34_sub17, Class612 class612, int i, int i_4_, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(class553, i_5_, i_6_, i_7_, i, i_4_, i_8_, i_9_);
		aClass34_Sub17_12019 = class34_sub17;
		anInt12011 = -661358025 * class612.anInt8008;
		aBool12012 = bool;
		aByte12017 = (byte) i_11_;
		aByte12016 = (byte) i_10_;
		aBool12015 = 0 != 1248110961 * class612.anInt7953 && !bool;
		aBool12018 = (class167.method2012() && class612.aBool8000 && !aBool12012 && Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(-171613671) != 0);
		int i_12_ = 2048;
		if (class612.aBool7969)
			i_12_ |= 0x80000;
		Class7 class7 = method10950(class167, i_12_, aBool12018, (byte) 27);
		if (class7 != null) {
			aClass177_12020 = (Class177) class7.anObject117;
			aClass536_Sub18_Sub7_12013 = (Class536_Sub18_Sub7) class7.anObject118;
			if (class612.aBool7969) {
				aClass177_12020 = aClass177_12020.method2623((byte) 0, i_12_, false);
				if (class612.aBool7969) {
					Class501 class501 = client.aClass515_11066.method6245((byte) 64);
					aClass177_12020.method2510(class501.anInt6846 * 861320207, (class501.anInt6848 * -1291356555), 55899967 * class501.anInt6847, class501.anInt6845 * 857983835);
				}
			}
		}
		method9968(1, 382182265);
	}

	public boolean method369(int i) {
		return aBool12018;
	}

	public void method371(Class167 class167, int i) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12013 == null && aBool12018) {
			Class7 class7 = method10950(class167, 262144, true, (byte) 72);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12013;
			aClass536_Sub18_Sub7_12013 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (null != class536_sub18_sub7)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 89);
	}

	public void method372(Class167 class167, int i) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12013 == null && aBool12018) {
			Class7 class7 = method10950(class167, 262144, true, (byte) 28);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12013;
			aClass536_Sub18_Sub7_12013 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (null != class536_sub18_sub7)
			aClass553_10838.method6758(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, 2111718015);
	}

	public void method353() {
		if (null != aClass177_12020)
			aClass177_12020.method2467();
	}

	Class563 method9985(Class167 class167) {
		if (null == aClass177_12020)
			return null;
		Class433 class433 = class167.method2091();
		class433.method5190(method7851());
		class433.method5200((float) aShort11823, 0.0F, (float) aShort11821);
		Class563 class563 = Class225.method3212(aBool12015, -673526996);
		Class437 class437 = (((Class612) aClass34_Sub17_12019.method70(anInt12011 * 1813796665, (byte) 85)).aClass437_8010);
		if (null != class437) {
			aClass177_12020.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_12020.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public int method374() {
		return aByte12016;
	}

	public void method384(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12013 == null && aBool12018) {
			Class7 class7 = method10950(class167, 262144, true, (byte) 2);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12013;
			aClass536_Sub18_Sub7_12013 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (null != class536_sub18_sub7)
			aClass553_10838.method6758(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, 2073465083);
	}

	public int method375() {
		return aByte12016;
	}

	public int method376() {
		return aByte12017;
	}

	public int method267() {
		return aByte12016;
	}

	public boolean method370(int i) {
		return true;
	}

	public void method346() {
		if (null != aClass177_12020)
			aClass177_12020.method2467();
	}

	public int method10() {
		return 1813796665 * anInt12011;
	}

	boolean method9974(int i) {
		if (aClass177_12020 != null)
			return !aClass177_12020.method2512();
		return true;
	}

	public int method71(int i) {
		return aByte12016;
	}

	public boolean method381() {
		return aBool12018;
	}

	public boolean method368() {
		return true;
	}

	public void method382(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12013 == null && aBool12018) {
			Class7 class7 = method10950(class167, 262144, true, (byte) 126);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12013;
			aClass536_Sub18_Sub7_12013 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (null != class536_sub18_sub7)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 117);
	}

	public void method383(Class167 class167) {
		Object object = null;
		Class536_Sub18_Sub7 class536_sub18_sub7;
		if (aClass536_Sub18_Sub7_12013 == null && aBool12018) {
			Class7 class7 = method10950(class167, 262144, true, (byte) 101);
			class536_sub18_sub7 = (Class536_Sub18_Sub7) (null != class7 ? class7.anObject118 : null);
		} else {
			class536_sub18_sub7 = aClass536_Sub18_Sub7_12013;
			aClass536_Sub18_Sub7_12013 = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		if (null != class536_sub18_sub7)
			aClass553_10838.method6761(class536_sub18_sub7, aByte10840, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 27);
	}

	public boolean method380() {
		return aBool12018;
	}

	boolean method9987() {
		if (aClass177_12020 != null)
			return !aClass177_12020.method2512();
		return true;
	}

	boolean method9956() {
		if (aClass177_12020 != null)
			return aClass177_12020.method2511();
		return false;
	}

	public int method9941() {
		return null != aClass177_12020 ? aClass177_12020.method2562() : 0;
	}

	Class563 method9965(Class167 class167) {
		if (null == aClass177_12020)
			return null;
		Class433 class433 = class167.method2091();
		class433.method5190(method7851());
		class433.method5200((float) aShort11823, 0.0F, (float) aShort11821);
		Class563 class563 = Class225.method3212(aBool12015, -1797746034);
		Class437 class437 = (((Class612) aClass34_Sub17_12019.method70(anInt12011 * 1813796665, (byte) 50)).aClass437_8010);
		if (null != class437) {
			aClass177_12020.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class437);
		} else
			aClass177_12020.method2490(class433, aClass178Array10842[0], 0);
		return class563;
	}

	public int method9984() {
		return null != aClass177_12020 ? aClass177_12020.method2562() : 0;
	}

	public Class559 method9955(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12014)
			aClass559_12014 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10951(class167, 0, -1349181388), (short) -5582);
		return aClass559_12014;
	}

	boolean method9971(Class167 class167, int i, int i_13_) {
		Class437 class437 = (((Class612) aClass34_Sub17_12019.method70(1813796665 * anInt12011, (byte) -70)).aClass437_8010);
		if (null != class437)
			return class167.method2073(i, i_13_, method7851(), class437, -1773254293);
		Class177 class177 = method10951(class167, 131072, -1349181388);
		if (null != class177) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_13_, class433, false, 0);
		}
		return false;
	}

	public Class559 method9962(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12014)
			aClass559_12014 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10951(class167, 0, -1349181388), (short) -28461);
		return aClass559_12014;
	}

	public Class559 method9963(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12014)
			aClass559_12014 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10951(class167, 0, -1349181388), (short) -5720);
		return aClass559_12014;
	}

	boolean method9957(Class167 class167, int i, int i_14_) {
		Class437 class437 = (((Class612) aClass34_Sub17_12019.method70(1813796665 * anInt12011, (byte) 94)).aClass437_8010);
		if (null != class437)
			return class167.method2073(i, i_14_, method7851(), class437, -1706359902);
		Class177 class177 = method10951(class167, 131072, -1349181388);
		if (null != class177) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_14_, class433, false, 0);
		}
		return false;
	}

	public void method270() {
		if (null != aClass177_12020)
			aClass177_12020.method2467();
	}

	public Class559 method9961(Class167 class167) {
		Class436 class436 = method7837().aClass436_4823;
		if (null == aClass559_12014)
			aClass559_12014 = Class684.method8109((int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, method10951(class167, 0, -1349181388), (short) 2228);
		return aClass559_12014;
	}

	public void method379() {
		if (null != aClass177_12020)
			aClass177_12020.method2467();
	}

	void method9975(Class167 class167) {
		/* empty */
	}

	boolean method9969(Class167 class167, int i, int i_15_) {
		Class437 class437 = (((Class612) aClass34_Sub17_12019.method70(1813796665 * anInt12011, (byte) -36)).aClass437_8010);
		if (null != class437)
			return class167.method2073(i, i_15_, method7851(), class437, -1862279923);
		Class177 class177 = method10951(class167, 131072, -1349181388);
		if (null != class177) {
			Class433 class433 = method7851();
			return class177.method2549(i, i_15_, class433, false, 0);
		}
		return false;
	}

	void method9967(Class167 class167) {
		/* empty */
	}

	Class177 method10951(Class167 class167, int i, int i_16_) {
		if (null != aClass177_12020 && class167.method2308(aClass177_12020.method2466(), i) == 0)
			return aClass177_12020;
		Class7 class7 = method10950(class167, i, false, (byte) 43);
		if (null != class7)
			return (Class177) class7.anObject117;
		return null;
	}

	Class177 method10952(Class167 class167, int i) {
		if (null != aClass177_12020 && class167.method2308(aClass177_12020.method2466(), i) == 0)
			return aClass177_12020;
		Class7 class7 = method10950(class167, i, false, (byte) 64);
		if (null != class7)
			return (Class177) class7.anObject117;
		return null;
	}

	Class177 method10953(Class167 class167, int i) {
		if (null != aClass177_12020 && class167.method2308(aClass177_12020.method2466(), i) == 0)
			return aClass177_12020;
		Class7 class7 = method10950(class167, i, false, (byte) 46);
		if (null != class7)
			return (Class177) class7.anObject117;
		return null;
	}

	Class7 method10954(Class167 class167, int i, boolean bool) {
		Class612 class612 = (Class612) aClass34_Sub17_12019.method70(1813796665 * anInt12011, (byte) -116);
		Class160 class160;
		Class160 class160_17_;
		if (aBool12012) {
			class160 = aClass553_10838.aClass160Array7418[aByte10840];
			class160_17_ = aClass553_10838.aClass160Array7459[0];
		} else {
			class160 = aClass553_10838.aClass160Array7459[aByte10840];
			if (aByte10840 < 3)
				class160_17_ = aClass553_10838.aClass160Array7459[aByte10840 + 1];
			else
				class160_17_ = null;
		}
		Class436 class436 = method7837().aClass436_4823;
		return class612.method7287(class167, i, aByte12016, aByte12017, class160, class160_17_, (int) class436.aFloat4850, (int) class436.aFloat4852, (int) class436.aFloat4853, bool, null, (byte) 79);
	}

	public static Class536_Sub18_Sub12 method10955(int i, short i_18_) {
		return ((Class536_Sub18_Sub12) Class262.aClass4_2847.method556((long) i));
	}

	static final void method10956(Class668 class668, int i) {
		int i_19_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_19_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_19_ >> 16];
		Class545.method6608(class251, class234, class668, (short) 15461);
	}
}
