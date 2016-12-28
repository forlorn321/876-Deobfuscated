/* Class649_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub2_Sub1 extends Class649_Sub1_Sub2 implements Interface59 {
	Class559 aClass559_11969;
	boolean aBool11970;
	public Class522 aClass522_11971;
	boolean aBool11972 = true;
	static int anInt11973;

	public Class559 method9963(Class167 class167) {
		return aClass559_11969;
	}

	final void method9986(int i) {
		throw new IllegalStateException();
	}

	public Class649_Sub1_Sub2_Sub1(Class553 class553, Class167 class167, Class34_Sub17 class34_sub17, ObjTypeDecoder class612, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, int i_6_) {
		super(class553, i_1_, i_2_, i_3_, i, i_0_, class612.anInt7987 * -1688265125);
		aClass522_11971 = new Class522(class167, class34_sub17, class612, -723459231 * ObjShapes.aClass606_7895.anInt7878, i_4_, i_0_, this, bool, i_5_, i_6_);
		aBool11970 = 0 != class612.anInt7953 * 1248110961 && !bool;
		method9968(1, 1330077827);
	}

	public Class559 method9946(Class167 class167, int i) {
		return aClass559_11969;
	}

	public int method9960(int i) {
		return aClass522_11971.method6362((byte) -109);
	}

	public int method9953(int i) {
		return aClass522_11971.method6370(-1868106399);
	}

	Class563 method9944(Class167 class167, byte i) {
		Class177 class177 = aClass522_11971.method6364(class167, 2048, false, true, -1479373708);
		if (class177 == null)
			return null;
		Class433 class433 = method7851();
		Class431 class431 = method7837();
		Class563 class563 = Class225.method3212(aBool11970, 1049699086);
		int i_7_ = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_8_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		aClass522_11971.method6379(class167, class177, class433, i_7_, i_7_, i_8_, i_8_, true, (byte) -6);
		ObjTypeDecoder class612 = aClass522_11971.method6365(589596469);
		if (null != class612.aClass437_8010) {
			class177.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class612.aClass437_8010);
		} else
			class177.method2490(class433, aClass178Array10842[0], 0);
		if (aClass522_11971.aClass627_7075 != null) {
			Class166 class166 = aClass522_11971.aClass627_7075.method7476();
			class167.method2351(class166);
		}
		aBool11972 = class177.method2511() || aClass522_11971.aClass627_7075 != null;
		if (null == aClass559_11969)
			aClass559_11969 = Class684.method8109((int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, (short) -30724);
		else
			Class626.method7463(aClass559_11969, (int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, -1288228349);
		return class563;
	}

	void method9945(Class167 class167, int i) {
		Class177 class177 = aClass522_11971.method6364(class167, 262144, true, true, -1809889751);
		if (null != class177) {
			Class436 class436 = method7837().aClass436_4823;
			int i_9_ = (int) class436.aFloat4850 >> 9;
			int i_10_ = (int) class436.aFloat4853 >> 9;
			aClass522_11971.method6379(class167, class177, method7851(), i_9_, i_9_, i_10_, i_10_, false, (byte) -112);
		}
	}

	boolean method9939(Class167 class167, int i, int i_11_, byte i_12_) {
		ObjTypeDecoder class612 = aClass522_11971.method6365(1239546541);
		if (null != class612.aClass437_8010)
			return class167.method2073(i, i_11_, method7851(), class612.aClass437_8010, -1789299609);
		Class177 class177 = aClass522_11971.method6364(class167, 131072, false, false, -1667011713);
		if (class177 == null)
			return false;
		return class177.method2549(i, i_11_, method7851(), false, 0);
	}

	boolean method9969(Class167 class167, int i, int i_13_) {
		ObjTypeDecoder class612 = aClass522_11971.method6365(-627082728);
		if (null != class612.aClass437_8010)
			return class167.method2073(i, i_13_, method7851(), class612.aClass437_8010, -1936238770);
		Class177 class177 = aClass522_11971.method6364(class167, 131072, false, false, -2021055220);
		if (class177 == null)
			return false;
		return class177.method2549(i, i_13_, method7851(), false, 0);
	}

	final void method9943(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_14_, int i_15_, boolean bool, int i_16_) {
		throw new IllegalStateException();
	}

	boolean method9974(int i) {
		return false;
	}

	public int method373(byte i) {
		return aClass522_11971.anInt7061 * -1858685201;
	}

	boolean method9957(Class167 class167, int i, int i_17_) {
		ObjTypeDecoder class612 = aClass522_11971.method6365(1155369459);
		if (null != class612.aClass437_8010)
			return class167.method2073(i, i_17_, method7851(), class612.aClass437_8010, -1802655292);
		Class177 class177 = aClass522_11971.method6364(class167, 131072, false, false, -847927879);
		if (class177 == null)
			return false;
		return class177.method2549(i, i_17_, method7851(), false, 0);
	}

	public int method367(byte i) {
		return 1515283871 * aClass522_11971.anInt7062;
	}

	public void method10926(ObjTypeTransformation class590, int i) {
		aClass522_11971.method6363(class590, (byte) -89);
	}

	public void method378(int i) {
		/* empty */
	}

	public boolean method370(int i) {
		return true;
	}

	public boolean method369(int i) {
		return aClass522_11971.method6361(2082050764);
	}

	public void method383(Class167 class167) {
		aClass522_11971.method6368(class167, 16711935);
	}

	public void method372(Class167 class167, int i) {
		aClass522_11971.method6369(class167, -834112652);
	}

	public int method9() {
		return aClass522_11971.anInt7061 * -1858685201;
	}

	public int method10() {
		return aClass522_11971.anInt7061 * -1858685201;
	}

	public int method374() {
		return 1875706389 * aClass522_11971.anInt7069;
	}

	public int method267() {
		return 1875706389 * aClass522_11971.anInt7069;
	}

	public int method375() {
		return 1875706389 * aClass522_11971.anInt7069;
	}

	public int method376() {
		return 1515283871 * aClass522_11971.anInt7062;
	}

	Class563 method9966(Class167 class167) {
		Class177 class177 = aClass522_11971.method6364(class167, 2048, false, true, -1544728363);
		if (class177 == null)
			return null;
		Class433 class433 = method7851();
		Class431 class431 = method7837();
		Class563 class563 = Class225.method3212(aBool11970, 2097223487);
		int i = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_18_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		aClass522_11971.method6379(class167, class177, class433, i, i, i_18_, i_18_, true, (byte) -1);
		ObjTypeDecoder class612 = aClass522_11971.method6365(203587960);
		if (null != class612.aClass437_8010) {
			class177.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class612.aClass437_8010);
		} else
			class177.method2490(class433, aClass178Array10842[0], 0);
		if (aClass522_11971.aClass627_7075 != null) {
			Class166 class166 = aClass522_11971.aClass627_7075.method7476();
			class167.method2351(class166);
		}
		aBool11972 = class177.method2511() || aClass522_11971.aClass627_7075 != null;
		if (null == aClass559_11969)
			aClass559_11969 = Class684.method8109((int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, (short) 4385);
		else
			Class626.method7463(aClass559_11969, (int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, -1276373953);
		return class563;
	}

	public void method270() {
		/* empty */
	}

	public void method346() {
		/* empty */
	}

	public int method71(int i) {
		return 1875706389 * aClass522_11971.anInt7069;
	}

	boolean method9971(Class167 class167, int i, int i_19_) {
		ObjTypeDecoder class612 = aClass522_11971.method6365(-923980166);
		if (null != class612.aClass437_8010)
			return class167.method2073(i, i_19_, method7851(), class612.aClass437_8010, -2053855896);
		Class177 class177 = aClass522_11971.method6364(class167, 131072, false, false, -1128803414);
		if (class177 == null)
			return false;
		return class177.method2549(i, i_19_, method7851(), false, 0);
	}

	public int method377() {
		return 1515283871 * aClass522_11971.anInt7062;
	}

	public boolean method380() {
		return aClass522_11971.method6361(1535314588);
	}

	public boolean method368() {
		return true;
	}

	public void method382(Class167 class167) {
		aClass522_11971.method6368(class167, 16711935);
	}

	public int method9958() {
		return aClass522_11971.method6362((byte) 46);
	}

	public void method384(Class167 class167) {
		aClass522_11971.method6369(class167, 532965186);
	}

	boolean method9987() {
		return false;
	}

	void method9975(Class167 class167) {
		Class177 class177 = aClass522_11971.method6364(class167, 262144, true, true, -1755044356);
		if (null != class177) {
			Class436 class436 = method7837().aClass436_4823;
			int i = (int) class436.aFloat4850 >> 9;
			int i_20_ = (int) class436.aFloat4853 >> 9;
			aClass522_11971.method6379(class167, class177, method7851(), i, i, i_20_, i_20_, false, (byte) -33);
		}
	}

	public int method9941() {
		return aClass522_11971.method6362((byte) -22);
	}

	boolean method9942(int i) {
		return aBool11972;
	}

	public int method9984() {
		return aClass522_11971.method6362((byte) -44);
	}

	public Class559 method9955(Class167 class167) {
		return aClass559_11969;
	}

	public Class559 method9961(Class167 class167) {
		return aClass559_11969;
	}

	public Class559 method9962(Class167 class167) {
		return aClass559_11969;
	}

	final boolean method9940(int i) {
		return false;
	}

	public int method9964() {
		return aClass522_11971.method6370(-1233843704);
	}

	Class563 method9985(Class167 class167) {
		Class177 class177 = aClass522_11971.method6364(class167, 2048, false, true, -1737612667);
		if (class177 == null)
			return null;
		Class433 class433 = method7851();
		Class431 class431 = method7837();
		Class563 class563 = Class225.method3212(aBool11970, 2075639148);
		int i = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_21_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		aClass522_11971.method6379(class167, class177, class433, i, i, i_21_, i_21_, true, (byte) -11);
		ObjTypeDecoder class612 = aClass522_11971.method6365(1542474012);
		if (null != class612.aClass437_8010) {
			class177.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class612.aClass437_8010);
		} else
			class177.method2490(class433, aClass178Array10842[0], 0);
		if (aClass522_11971.aClass627_7075 != null) {
			Class166 class166 = aClass522_11971.aClass627_7075.method7476();
			class167.method2351(class166);
		}
		aBool11972 = class177.method2511() || aClass522_11971.aClass627_7075 != null;
		if (null == aClass559_11969)
			aClass559_11969 = Class684.method8109((int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, (short) -261);
		else
			Class626.method7463(aClass559_11969, (int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, 854935319);
		return class563;
	}

	final void method9976() {
		throw new IllegalStateException();
	}

	void method9967(Class167 class167) {
		Class177 class177 = aClass522_11971.method6364(class167, 262144, true, true, -1118003498);
		if (null != class177) {
			Class436 class436 = method7837().aClass436_4823;
			int i = (int) class436.aFloat4850 >> 9;
			int i_22_ = (int) class436.aFloat4853 >> 9;
			aClass522_11971.method6379(class167, class177, method7851(), i, i, i_22_, i_22_, false, (byte) -70);
		}
	}

	public void method371(Class167 class167, int i) {
		aClass522_11971.method6368(class167, 16711935);
	}

	public void method353() {
		/* empty */
	}

	public boolean method381() {
		return aClass522_11971.method6361(1832812900);
	}

	public void method379() {
		/* empty */
	}

	boolean method9956() {
		return aBool11972;
	}

	final boolean method9938() {
		return false;
	}

	final boolean method9972() {
		return false;
	}

	final boolean method9973() {
		return false;
	}

	final void method9947(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_23_, int i_24_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method9978(Class167 class167, Class649_Sub1 class649_sub1, int i, int i_25_, int i_26_, boolean bool) {
		throw new IllegalStateException();
	}

	Class563 method9965(Class167 class167) {
		Class177 class177 = aClass522_11971.method6364(class167, 2048, false, true, -1119815053);
		if (class177 == null)
			return null;
		Class433 class433 = method7851();
		Class431 class431 = method7837();
		Class563 class563 = Class225.method3212(aBool11970, 1035041907);
		int i = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_27_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		aClass522_11971.method6379(class167, class177, class433, i, i, i_27_, i_27_, true, (byte) -59);
		ObjTypeDecoder class612 = aClass522_11971.method6365(775624504);
		if (null != class612.aClass437_8010) {
			class177.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class612.aClass437_8010);
		} else
			class177.method2490(class433, aClass178Array10842[0], 0);
		if (aClass522_11971.aClass627_7075 != null) {
			Class166 class166 = aClass522_11971.aClass627_7075.method7476();
			class167.method2351(class166);
		}
		aBool11972 = class177.method2511() || aClass522_11971.aClass627_7075 != null;
		if (null == aClass559_11969)
			aClass559_11969 = Class684.method8109((int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, (short) -23847);
		else
			Class626.method7463(aClass559_11969, (int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, 696296392);
		return class563;
	}

	public void method10927(ObjTypeTransformation class590) {
		aClass522_11971.method6363(class590, (byte) -80);
	}
}
