/* Class649_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub3_Sub1 extends Class649_Sub1_Sub3 implements Interface59 {
	static int[] anIntArray11990;
	boolean aBool11991;
	public Class522 aClass522_11992;
	Class559 aClass559_11993;
	boolean aBool11994 = true;
	static int[] anIntArray11995 = { 1, 2, 4, 8 };

	public void method383(GraphicalRenderer class167) {
		aClass522_11992.method6368(class167, 16711935);
	}

	public void method378(int i) {
		/* empty */
	}

	boolean method9942(int i) {
		return aBool11994;
	}

	public Class559 method9946(GraphicalRenderer class167, int i) {
		return aClass559_11993;
	}

	public int method9960(int i) {
		return aClass522_11992.method6362((byte) -87);
	}

	public int method9953(int i) {
		return aClass522_11992.method6370(-404456564);
	}

	public void method10937(ObjTypeTransformation class590, int i) {
		aClass522_11992.method6363(class590, (byte) -47);
	}

	public Class559 method9961(GraphicalRenderer class167) {
		return aClass559_11993;
	}

	void method9945(GraphicalRenderer class167, int i) {
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 262144, true, true, -835843117);
		if (null != class177) {
			Class433 class433 = method7851();
			Class431 class431 = method7837();
			int i_0_ = (int) class431.aClass436_4823.aFloat4850 >> 9;
			int i_1_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
			aClass522_11992.method6379(class167, class177, class433, i_0_, i_0_, i_1_, i_1_, false, (byte) -17);
		}
	}

	public int method9958() {
		return aClass522_11992.method6362((byte) -23);
	}

	Class563 method9965(GraphicalRenderer class167) {
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 2048, false, true, -2035001727);
		if (null == class177)
			return null;
		Class433 class433 = method7851();
		Class431 class431 = method7837();
		Class563 class563 = Class225.method3212(aBool11991, -692069196);
		int i = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_2_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		aClass522_11992.method6379(class167, class177, class433, i, i, i_2_, i_2_, true, (byte) 1);
		ObjTypeDecoder class612 = aClass522_11992.method6365(-12455026);
		if (class612.aClass437_8010 != null) {
			class177.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class612.aClass437_8010);
		} else
			class177.method2490(class433, aClass178Array10842[0], 0);
		if (aClass522_11992.aClass627_7075 != null) {
			Class166 class166 = aClass522_11992.aClass627_7075.method7476();
			class167.method2351(class166);
		}
		aBool11994 = class177.method2511() || aClass522_11992.aClass627_7075 != null;
		if (null == aClass559_11993)
			aClass559_11993 = Class684.method8109((int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, (short) -9428);
		else
			Class626.method7463(aClass559_11993, (int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, -1191095950);
		return class563;
	}

	Class563 method9944(GraphicalRenderer class167, byte i) {
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 2048, false, true, -1185695341);
		if (null == class177)
			return null;
		Class433 class433 = method7851();
		Class431 class431 = method7837();
		Class563 class563 = Class225.method3212(aBool11991, -91654808);
		int i_3_ = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_4_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		aClass522_11992.method6379(class167, class177, class433, i_3_, i_3_, i_4_, i_4_, true, (byte) -14);
		ObjTypeDecoder class612 = aClass522_11992.method6365(-631973528);
		if (class612.aClass437_8010 != null) {
			class177.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class612.aClass437_8010);
		} else
			class177.method2490(class433, aClass178Array10842[0], 0);
		if (aClass522_11992.aClass627_7075 != null) {
			Class166 class166 = aClass522_11992.aClass627_7075.method7476();
			class167.method2351(class166);
		}
		aBool11994 = class177.method2511() || aClass522_11992.aClass627_7075 != null;
		if (null == aClass559_11993)
			aClass559_11993 = Class684.method8109((int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, (short) -6854);
		else
			Class626.method7463(aClass559_11993, (int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, 628491353);
		return class563;
	}

	final void method9986(int i) {
		throw new IllegalStateException();
	}

	public int method373(byte i) {
		return -1858685201 * aClass522_11992.anInt7061;
	}

	public int method71(int i) {
		return 1875706389 * aClass522_11992.anInt7069;
	}

	final boolean method9940(int i) {
		return false;
	}

	boolean method9969(GraphicalRenderer class167, int i, int i_5_) {
		ObjTypeDecoder class612 = aClass522_11992.method6365(1072570453);
		if (null != class612.aClass437_8010)
			return class167.method2073(i, i_5_, method7851(), class612.aClass437_8010, -1842320453);
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 131072, false, false, -1015763805);
		if (null == class177)
			return false;
		return class177.method2549(i, i_5_, method7851(), false, 0);
	}

	public boolean method370(int i) {
		return true;
	}

	public boolean method369(int i) {
		return aClass522_11992.method6361(2057025931);
	}

	public void method371(GraphicalRenderer class167, int i) {
		aClass522_11992.method6368(class167, 16711935);
	}

	public void method372(GraphicalRenderer class167, int i) {
		aClass522_11992.method6369(class167, 1341551351);
	}

	static {
		anIntArray11990 = new int[] { 16, 32, 64, 128 };
	}

	public int method9() {
		return -1858685201 * aClass522_11992.anInt7061;
	}

	public int method10() {
		return -1858685201 * aClass522_11992.anInt7061;
	}

	public int method374() {
		return 1875706389 * aClass522_11992.anInt7069;
	}

	public int method267() {
		return 1875706389 * aClass522_11992.anInt7069;
	}

	public int method375() {
		return 1875706389 * aClass522_11992.anInt7069;
	}

	public int method376() {
		return aClass522_11992.anInt7062 * 1515283871;
	}

	public int method377() {
		return aClass522_11992.anInt7062 * 1515283871;
	}

	public void method270() {
		/* empty */
	}

	Class563 method9966(GraphicalRenderer class167) {
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 2048, false, true, -1596813509);
		if (null == class177)
			return null;
		Class433 class433 = method7851();
		Class431 class431 = method7837();
		Class563 class563 = Class225.method3212(aBool11991, 1014868779);
		int i = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_6_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		aClass522_11992.method6379(class167, class177, class433, i, i, i_6_, i_6_, true, (byte) -47);
		ObjTypeDecoder class612 = aClass522_11992.method6365(1545664244);
		if (class612.aClass437_8010 != null) {
			class177.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class612.aClass437_8010);
		} else
			class177.method2490(class433, aClass178Array10842[0], 0);
		if (aClass522_11992.aClass627_7075 != null) {
			Class166 class166 = aClass522_11992.aClass627_7075.method7476();
			class167.method2351(class166);
		}
		aBool11994 = class177.method2511() || aClass522_11992.aClass627_7075 != null;
		if (null == aClass559_11993)
			aClass559_11993 = Class684.method8109((int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, (short) 1188);
		else
			Class626.method7463(aClass559_11993, (int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, -1919963903);
		return class563;
	}

	public void method353() {
		/* empty */
	}

	boolean method9987() {
		return false;
	}

	public boolean method380() {
		return aClass522_11992.method6361(1999235492);
	}

	boolean method9974(int i) {
		return false;
	}

	public boolean method368() {
		return true;
	}

	public void method382(GraphicalRenderer class167) {
		aClass522_11992.method6368(class167, 16711935);
	}

	public int method367(byte i) {
		return aClass522_11992.anInt7062 * 1515283871;
	}

	public void method384(GraphicalRenderer class167) {
		aClass522_11992.method6369(class167, 1475630432);
	}

	public int method9984() {
		return aClass522_11992.method6362((byte) 10);
	}

	boolean method9956() {
		return aBool11994;
	}

	boolean method9971(GraphicalRenderer class167, int i, int i_7_) {
		ObjTypeDecoder class612 = aClass522_11992.method6365(911552057);
		if (null != class612.aClass437_8010)
			return class167.method2073(i, i_7_, method7851(), class612.aClass437_8010, -1871321654);
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 131072, false, false, -1203608532);
		if (null == class177)
			return false;
		return class177.method2549(i, i_7_, method7851(), false, 0);
	}

	public Class649_Sub1_Sub3_Sub1(Class553 class553, GraphicalRenderer class167, Class34_Sub17 class34_sub17, ObjTypeDecoder class612, int i, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool, int i_12_, int i_13_, int i_14_, int i_15_) {
		super(class553, i_9_, i_10_, i_11_, i, i_8_, Class707.method8301(i_12_, i_13_, -1411037171));
		aClass522_11992 = new Class522(class167, class34_sub17, class612, i_12_, i_13_, i_8_, this, bool, i_14_, i_15_);
		aBool11991 = class612.anInt7953 * 1248110961 != 0 && !bool;
		method9968(1, -868048343);
	}

	public void method379() {
		/* empty */
	}

	public Class559 method9955(GraphicalRenderer class167) {
		return aClass559_11993;
	}

	final void method9943(GraphicalRenderer class167, Class649_Sub1 class649_sub1, int i, int i_16_, int i_17_, boolean bool, int i_18_) {
		throw new IllegalStateException();
	}

	public void method346() {
		/* empty */
	}

	public Class559 method9963(GraphicalRenderer class167) {
		return aClass559_11993;
	}

	public int method9964() {
		return aClass522_11992.method6370(1019240147);
	}

	Class563 method9985(GraphicalRenderer class167) {
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 2048, false, true, -1423456197);
		if (null == class177)
			return null;
		Class433 class433 = method7851();
		Class431 class431 = method7837();
		Class563 class563 = Class225.method3212(aBool11991, -106112483);
		int i = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_19_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		aClass522_11992.method6379(class167, class177, class433, i, i, i_19_, i_19_, true, (byte) -73);
		ObjTypeDecoder class612 = aClass522_11992.method6365(-470390027);
		if (class612.aClass437_8010 != null) {
			class177.method2490(class433, null, 0);
			class167.method2102(class433, aClass178Array10842[0], class612.aClass437_8010);
		} else
			class177.method2490(class433, aClass178Array10842[0], 0);
		if (aClass522_11992.aClass627_7075 != null) {
			Class166 class166 = aClass522_11992.aClass627_7075.method7476();
			class167.method2351(class166);
		}
		aBool11994 = class177.method2511() || aClass522_11992.aClass627_7075 != null;
		if (null == aClass559_11993)
			aClass559_11993 = Class684.method8109((int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, (short) 42);
		else
			Class626.method7463(aClass559_11993, (int) class431.aClass436_4823.aFloat4850, (int) class431.aClass436_4823.aFloat4852, (int) class431.aClass436_4823.aFloat4853, class177, -742929137);
		return class563;
	}

	public boolean method381() {
		return aClass522_11992.method6361(1762355229);
	}

	public Class559 method9962(GraphicalRenderer class167) {
		return aClass559_11993;
	}

	void method9967(GraphicalRenderer class167) {
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 262144, true, true, -1339298217);
		if (null != class177) {
			Class433 class433 = method7851();
			Class431 class431 = method7837();
			int i = (int) class431.aClass436_4823.aFloat4850 >> 9;
			int i_20_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
			aClass522_11992.method6379(class167, class177, class433, i, i, i_20_, i_20_, false, (byte) -75);
		}
	}

	void method9975(GraphicalRenderer class167) {
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 262144, true, true, -1909598157);
		if (null != class177) {
			Class433 class433 = method7851();
			Class431 class431 = method7837();
			int i = (int) class431.aClass436_4823.aFloat4850 >> 9;
			int i_21_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
			aClass522_11992.method6379(class167, class177, class433, i, i, i_21_, i_21_, false, (byte) -67);
		}
	}

	public int method9941() {
		return aClass522_11992.method6362((byte) 106);
	}

	boolean method9957(GraphicalRenderer class167, int i, int i_22_) {
		ObjTypeDecoder class612 = aClass522_11992.method6365(93318457);
		if (null != class612.aClass437_8010)
			return class167.method2073(i, i_22_, method7851(), class612.aClass437_8010, -1833125536);
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 131072, false, false, -952279305);
		if (null == class177)
			return false;
		return class177.method2549(i, i_22_, method7851(), false, 0);
	}

	boolean method9939(GraphicalRenderer class167, int i, int i_23_, byte i_24_) {
		ObjTypeDecoder class612 = aClass522_11992.method6365(1593529923);
		if (null != class612.aClass437_8010)
			return class167.method2073(i, i_23_, method7851(), class612.aClass437_8010, -1642458123);
		MeshRasterizer class177 = aClass522_11992.method6364(class167, 131072, false, false, -1459701979);
		if (null == class177)
			return false;
		return class177.method2549(i, i_23_, method7851(), false, 0);
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

	final void method9947(GraphicalRenderer class167, Class649_Sub1 class649_sub1, int i, int i_25_, int i_26_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method9978(GraphicalRenderer class167, Class649_Sub1 class649_sub1, int i, int i_27_, int i_28_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method9976() {
		throw new IllegalStateException();
	}

	static int method10938(int i, int i_29_) {
		if (ObjShapes.aClass606_7874.anInt7878 * -723459231 == i || ObjShapes.aClass606_7876.anInt7878 * -723459231 == i)
			return anIntArray11990[i_29_ & 0x3];
		return anIntArray11995[i_29_ & 0x3];
	}

	static void method10939(Class536_Sub3 class536_sub3, int i, int i_30_, int i_31_, int i_32_, int i_33_) {
		if (class536_sub3.anInt10388 * -1095423089 != -1 || class536_sub3.anIntArray10365 != null) {
			int i_34_ = class536_sub3.anInt10376 * -540425639;
			if (0 == class536_sub3.anInt10375 * -93526815 || ClientSetting.aClass536_Sub40_8843.bgSoundVolumeSetting.method10213(-692892104) == 0 || class536_sub3.anInt10364 * -121615235 != i) {
				if (class536_sub3.aClass479_10389 != null) {
					class536_sub3.aClass479_10389.method5774(100, (byte) 32);
					Class184_Sub2.aClass211_9442.method3002((class536_sub3.aClass479_10389), -1092963117);
					class536_sub3.aClass479_10389 = null;
				}
			} else {
				if (null != class536_sub3.aClass479_10389 && ((class536_sub3.aClass479_10389.method5772(1780038524) == Class481.aClass481_5426) || (class536_sub3.aClass479_10389.method5772(1781800007) == Class481.aClass481_5427))) {
					Class184_Sub2.aClass211_9442.method3002((class536_sub3.aClass479_10389), -1092963117);
					class536_sub3.aClass479_10389 = null;
				}
				if (null == class536_sub3.aClass479_10389) {
					if (class536_sub3.anInt10388 * -1095423089 >= 0) {
						int i_35_ = 256;
						int i_36_ = (int) ((float) (-995712829 * class536_sub3.anInt10367) + (0.5F * (float) ((2020943271 * class536_sub3.anInt10370) - (class536_sub3.anInt10367 * -995712829))));
						int i_37_ = (int) ((float) (class536_sub3.anInt10369 * -348333025) + (0.5F * (float) ((1433169921 * class536_sub3.anInt10371) - (-348333025 * (class536_sub3.anInt10369)))));
						class536_sub3.aClass436_10372.aFloat4850 = (float) i_36_;
						class536_sub3.aClass436_10372.aFloat4853 = (float) i_37_;
						class536_sub3.aClass479_10389 = (Class184_Sub2.aClass211_9442.method3003(Class198.aClass198_2206, class536_sub3, -1095423089 * class536_sub3.anInt10388, -1, 0, Class188.aClass188_2127.method2788(-1030615376), Class207.aClass207_2240, (float) (267121987 * class536_sub3.anInt10368), (float) (class536_sub3.anInt10375 * -93526815), class536_sub3.aClass436_10372, 0, i_35_, false, (byte) 14));
						if (class536_sub3.aClass479_10389 != null) {
							float f = (float) i_34_ / 255.0F;
							class536_sub3.aClass479_10389.method5788(f, 150, -1104696647);
							class536_sub3.aClass479_10389.method5790((byte) -99);
						}
					}
				} else {
					int i_38_ = (int) ((float) (class536_sub3.anInt10370 * 2020943271 - (class536_sub3.anInt10367 * -995712829)) * 0.5F + (float) (-995712829 * class536_sub3.anInt10367));
					int i_39_ = (int) ((float) (class536_sub3.anInt10371 * 1433169921 - (class536_sub3.anInt10369 * -348333025)) * 0.5F + (float) (-348333025 * class536_sub3.anInt10369));
					class536_sub3.aClass436_10372.aFloat4850 = (float) i_38_;
					class536_sub3.aClass436_10372.aFloat4853 = (float) i_39_;
				}
				if (class536_sub3.aClass479_10387 == null) {
					if (null != class536_sub3.anIntArray10365 && ((class536_sub3.anInt10394 -= i_32_ * -951577747) * 921038437) <= 0) {
						int i_40_ = ((256 == class536_sub3.anInt10393 * 659693545 && class536_sub3.anInt10377 * 737043913 == 256) ? 256 : ((int) (Math.random() * (double) (659693545 * (class536_sub3.anInt10393) - (737043913 * (class536_sub3.anInt10377)))) + class536_sub3.anInt10377 * 737043913));
						int i_41_ = (int) (Math.random() * (double) (class536_sub3.anIntArray10365).length);
						int i_42_ = (int) ((float) (-995712829 * class536_sub3.anInt10367) + (float) ((2020943271 * class536_sub3.anInt10370) - (class536_sub3.anInt10367 * -995712829)) * 0.5F);
						int i_43_ = (int) ((float) (-348333025 * class536_sub3.anInt10369) + (0.5F * (float) ((class536_sub3.anInt10371 * 1433169921) - (class536_sub3.anInt10369 * -348333025))));
						class536_sub3.aClass436_10373.aFloat4850 = (float) i_42_;
						class536_sub3.aClass436_10373.aFloat4853 = (float) i_43_;
						class536_sub3.aClass479_10387 = (Class184_Sub2.aClass211_9442.method3003(Class198.aClass198_2204, class536_sub3, class536_sub3.anIntArray10365[i_41_], 0, i_34_, Class188.aClass188_2135.method2788(-106096037), Class207.aClass207_2240, (float) (267121987 * class536_sub3.anInt10368), (float) (class536_sub3.anInt10375 * -93526815 + (class536_sub3.anInt10368 * 267121987)), class536_sub3.aClass436_10373, 0, i_40_, false, (byte) 14));
						if (class536_sub3.aClass479_10387 != null)
							class536_sub3.aClass479_10387.method5790((byte) -69);
						class536_sub3.anInt10394 = ((class536_sub3.anInt10391 * 1942209471 + (int) (Math.random() * (double) ((1109598061 * (class536_sub3.anInt10392)) - (1942209471 * (class536_sub3.anInt10391))))) * -951577747);
					}
				} else {
					int i_44_ = (int) ((float) (class536_sub3.anInt10367 * -995712829) + (float) ((class536_sub3.anInt10370 * 2020943271) - (class536_sub3.anInt10367 * -995712829)) * 0.5F);
					int i_45_ = (int) ((float) (class536_sub3.anInt10369 * -348333025) + 0.5F * (float) ((1433169921 * class536_sub3.anInt10371) - (class536_sub3.anInt10369 * -348333025)));
					class536_sub3.aClass436_10373.aFloat4850 = (float) i_44_;
					class536_sub3.aClass436_10373.aFloat4853 = (float) i_45_;
					if ((class536_sub3.aClass479_10387.method5772(2129831740) == Class481.aClass481_5426) || (class536_sub3.aClass479_10387.method5772(2008563181) == Class481.aClass481_5427)) {
						Class184_Sub2.aClass211_9442.method3002(class536_sub3.aClass479_10387, -1092963117);
						class536_sub3.aClass479_10387 = null;
					}
				}
			}
		}
	}

	static final void method10940(Class668 class668, int i) {
		Class711.method8375((short) -13812);
	}
}
