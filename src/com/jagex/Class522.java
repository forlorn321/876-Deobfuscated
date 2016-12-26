/* Class522 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class522 {
	int anInt7057;
	byte aByte7058;
	boolean[] aBoolArray7059;
	Class649_Sub1 aClass649_Sub1_7060;
	int anInt7061;
	int anInt7062;
	Class536_Sub18_Sub7 aClass536_Sub18_Sub7_7063;
	Class177 aClass177_7064;
	Class688 aClass688_7065;
	Class688 aClass688_7066;
	Class34_Sub17 aClass34_Sub17_7067;
	int anInt7068;
	int anInt7069;
	boolean aBool7070;
	boolean aBool7071;
	int anInt7072;
	boolean aBool7073;
	boolean aBool7074 = false;
	Class627 aClass627_7075;
	Class590 aClass590_7076;
	public static String aString7077;

	public void method6360(int i, int i_0_) {
		aClass688_7066 = null;
		if (i_0_ > 0) {
			aClass688_7066 = new Class688_Sub2(aClass649_Sub1_7060, false);
			aClass688_7066.method8126(i, i_0_, 1, false, 204195655);
		} else {
			aBool7070 = true;
			method6374(false, i, 1, 0, -1812181101);
		}
	}

	boolean method6361(int i) {
		return aBool7071;
	}

	int method6362(byte i) {
		return anInt7072 * -1441435047;
	}

	void method6363(Class590 class590, byte i) {
		aClass590_7076 = class590;
		aClass177_7064 = null;
	}

	final Class177 method6364(Class167 class167, int i, boolean bool, boolean bool_1_, int i_2_) {
		Class612 class612 = (Class612) aClass34_Sub17_7067.method70(-1858685201 * anInt7061, (byte) -30);
		if (class612.anIntArray7988 != null)
			class612 = class612.method7293(Class465_Sub1.aClass96_10352, (4 == client.anInt11074 * 1542697723 ? (Interface18) (Class193.anInterface18_2191) : Class465_Sub1.aClass96_10352), (byte) 125);
		if (class612 == null) {
			method6369(class167, -1328198137);
			anInt7068 = 1579591191;
			return null;
		}
		if (!aBool7070 && anInt7068 * -1942155687 != class612.anInt8008 * 1083959103) {
			method6374(true, -1, 0, 0, -1883935174);
			aBool7073 = false;
			aClass177_7064 = null;
		}
		method6367(aClass649_Sub1_7060, -1294163166);
		if (bool_1_)
			bool_1_ = bool_1_ & (aBool7071 & !aBool7073 & Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(-639173902) != 0);
		if (bool && !bool_1_) {
			anInt7068 = class612.anInt8008 * -1531879593;
			return null;
		}
		Class436 class436 = aClass649_Sub1_7060.method7837().aClass436_4823;
		Class553 class553 = client.aClass515_11066.method6249(-1030080044);
		if (bool_1_) {
			class553.method6758(aClass536_Sub18_Sub7_7063, aByte7058, (int) class436.aFloat4850, (int) class436.aFloat4853, aBoolArray7059, 2099691773);
			aBool7073 = false;
		}
		Class160 class160 = class553.aClass160Array7431[aByte7058];
		Class160 class160_3_;
		if (aBool7074)
			class160_3_ = class553.aClass160Array7459[0];
		else
			class160_3_ = (aByte7058 < 3 ? class553.aClass160Array7431[1 + aByte7058] : null);
		Class177 class177 = null;
		if (aClass688_7065.method8121(-2088736421)) {
			if (bool_1_)
				i |= 0x40000;
			class177 = (class612.method7288(class167, i, 11 != anInt7069 * 1875706389 ? anInt7069 * 1875706389 : 10, (anInt7069 * 1875706389 == 11 ? 1515283871 * anInt7062 + 4 : anInt7062 * 1515283871), class160, class160_3_, (int) class436.aFloat4850, class160.method1925((int) class436.aFloat4850, (int) class436.aFloat4853, (byte) 16), (int) class436.aFloat4853, aClass688_7065, aClass590_7076, 114151337));
			if (class177 != null) {
				if (bool_1_) {
					if (aBoolArray7059 == null)
						aBoolArray7059 = new boolean[4];
					aClass536_Sub18_Sub7_7063 = class177.method2459(aClass536_Sub18_Sub7_7063);
					class553.method6761(aClass536_Sub18_Sub7_7063, aByte7058, (int) class436.aFloat4850, (int) class436.aFloat4853, aBoolArray7059, (byte) 87);
					aBool7073 = true;
				}
				anInt7072 = class177.method2562() * 1702016489;
				class177.method2579();
			} else {
				aBoolArray7059 = null;
				aClass536_Sub18_Sub7_7063 = null;
				anInt7072 = 0;
			}
			aClass177_7064 = null;
		} else if (null == aClass177_7064 || (aClass177_7064.method2466() & i) != i || (1083959103 * class612.anInt8008 != -1942155687 * anInt7068)) {
			if (null != aClass177_7064)
				i |= aClass177_7064.method2466();
			Class7 class7 = (class612.method7287(class167, i, anInt7069 * 1875706389 != 11 ? anInt7069 * 1875706389 : 10, (anInt7069 * 1875706389 == 11 ? 4 + anInt7062 * 1515283871 : 1515283871 * anInt7062), class160, class160_3_, (int) class436.aFloat4850, class160.method1925((int) class436.aFloat4850, (int) class436.aFloat4853, (byte) -9), (int) class436.aFloat4853, bool_1_, aClass590_7076, (byte) -29));
			if (class7 != null) {
				aClass177_7064 = class177 = (Class177) class7.anObject117;
				if (bool_1_) {
					aClass536_Sub18_Sub7_7063 = (Class536_Sub18_Sub7) class7.anObject118;
					aBoolArray7059 = null;
					class553.method6761(aClass536_Sub18_Sub7_7063, aByte7058, (int) class436.aFloat4850, (int) class436.aFloat4853, null, (byte) 84);
					aBool7073 = true;
				}
				anInt7072 = class177.method2562() * 1702016489;
				class177.method2579();
			} else {
				aBoolArray7059 = null;
				aClass536_Sub18_Sub7_7063 = null;
				aClass177_7064 = null;
				anInt7072 = 0;
			}
		} else
			class177 = aClass177_7064;
		anInt7068 = -1531879593 * class612.anInt8008;
		return class177;
	}

	Class612 method6365(int i) {
		return (Class612) aClass34_Sub17_7067.method70(-1858685201 * anInt7061, (byte) -59);
	}

	int method6366() {
		return -method6362((byte) 2);
	}

	void method6367(Class649_Sub1 class649_sub1, int i) {
		if (null != aClass688_7066 && aClass688_7066.method8121(-1752143406)) {
			aClass688_7066.method8138((client.cycles - anInt7057 * 701818341), 1849478923);
			if (aClass688_7066.method8135(-841908704))
				aClass688_7066.method8122(-1, -2116450684);
			if (!aClass688_7066.method8128(-144709969)) {
				aClass688_7065 = aClass688_7066;
				aBool7070 = true;
				anInt7057 = client.cycles * 264753133;
				return;
			}
		}
		if (aClass688_7065.method8121(289934863)) {
			if (aClass688_7065.method8138((client.cycles - anInt7057 * 701818341), 1793467864)) {
				if (Class710.aClass536_Sub40_8843.aClass710_Sub9_10756.method10004(-944463154) == 2)
					aBool7073 = false;
				if (aClass688_7065.method8135(-1684042710)) {
					aClass688_7065.method8122(-1, -1210701484);
					aBool7070 = false;
					method6374(false, -1, 0, 0, -1768742502);
				}
			}
		} else
			method6374(false, -1, 0, 0, -2141397443);
		anInt7057 = 264753133 * client.cycles;
	}

	void method6368(Class167 class167, int i) {
		method6364(class167, 262144, true, true, -1338546640);
	}

	void method6369(Class167 class167, int i) {
		if (null != aClass536_Sub18_Sub7_7063) {
			Class436 class436 = aClass649_Sub1_7060.method7837().aClass436_4823;
			client.aClass515_11066.method6249(787904244).method6758(aClass536_Sub18_Sub7_7063, aByte7058, (int) class436.aFloat4850, (int) class436.aFloat4853, aBoolArray7059, 2105244965);
			aBoolArray7059 = null;
			aClass536_Sub18_Sub7_7063 = null;
		}
	}

	int method6370(int i) {
		return -method6362((byte) 52);
	}

	Class522(Class167 class167, Class34_Sub17 class34_sub17, Class612 class612, int i, int i_4_, int i_5_, Class649_Sub1 class649_sub1, boolean bool, int i_6_, int i_7_) {
		anInt7068 = 1579591191;
		anInt7072 = 0;
		aBool7070 = false;
		aBool7073 = false;
		aClass34_Sub17_7067 = class34_sub17;
		anInt7061 = -1370532687 * class612.anInt8008;
		anInt7069 = i * 1265220925;
		anInt7062 = i_4_ * 478967391;
		aClass649_Sub1_7060 = class649_sub1;
		aBool7070 = -1 != i_6_;
		aByte7058 = (byte) i_5_;
		aBool7074 = bool;
		aBool7071 = class167.method2012() && class612.aBool8000 && !aBool7074;
		aClass688_7065 = new Class688_Sub2(class649_sub1, false);
		method6374(false, i_6_, 1, aBool7070 ? i_7_ : 0, -1742539842);
	}

	public void method6371(int i, int i_8_) {
		aClass688_7066 = null;
		if (i_8_ > 0) {
			aClass688_7066 = new Class688_Sub2(aClass649_Sub1_7060, false);
			aClass688_7066.method8126(i, i_8_, 1, false, 978946606);
		} else {
			aBool7070 = true;
			method6374(false, i, 1, 0, -1598068786);
		}
	}

	public void method6372(int i, int i_9_) {
		aClass688_7066 = null;
		if (i_9_ > 0) {
			aClass688_7066 = new Class688_Sub2(aClass649_Sub1_7060, false);
			aClass688_7066.method8126(i, i_9_, 1, false, 1057642701);
		} else {
			aBool7070 = true;
			method6374(false, i, 1, 0, -2083802097);
		}
	}

	boolean method6373() {
		return aBool7071;
	}

	void method6374(boolean bool, int i, int i_10_, int i_11_, int i_12_) {
		int i_13_ = i;
		boolean bool_14_ = false;
		if (i_13_ == -1) {
			Class612 class612 = ((Class612) aClass34_Sub17_7067.method70(-1858685201 * anInt7061, (byte) -15));
			Class612 class612_15_ = class612;
			if (class612.anIntArray7988 != null)
				class612 = (class612.method7293(Class465_Sub1.aClass96_10352, (1542697723 * client.anInt11074 == 4 ? (Interface18) Class193.anInterface18_2191 : Class465_Sub1.aClass96_10352), (byte) 34));
			if (class612 == null)
				return;
			if (class612 == class612_15_)
				class612_15_ = null;
			if (class612.method7300((byte) -115)) {
				if (!class612.aBool7993 || Class710.aClass536_Sub40_8843.aClass710_Sub23_10774.method10126(1041246061) == 1) {
					if (bool && aClass688_7065.method8121(-393240839) && class612.method7296(aClass688_7065.method8120((byte) 34), -2082504538))
						return;
					if (class612.anInt8008 * 1083959103 != -1942155687 * anInt7068)
						bool_14_ = class612.aBool7998;
					i_13_ = class612.method7305((byte) -105);
					if (class612.method7294((byte) 10))
						i_10_ = 0;
					else
						i_10_ = 1;
				}
			} else if (class612_15_ != null && class612_15_.method7300((byte) -121) && (!class612_15_.aBool7993 || Class710.aClass536_Sub40_8843.aClass710_Sub23_10774.method10126(1041246061) == 1)) {
				if (bool && aClass688_7065.method8121(391739265) && class612_15_.method7296(aClass688_7065.method8120((byte) 113), -1796929211))
					return;
				if (1083959103 * class612.anInt8008 != anInt7068 * -1942155687)
					bool_14_ = class612_15_.aBool7998;
				i_13_ = class612_15_.method7305((byte) -108);
				if (class612_15_.method7294((byte) -55))
					i_10_ = 0;
				else
					i_10_ = 1;
			}
		}
		if (i_13_ == -1)
			aClass688_7065.method8124(-1, false, (byte) -79);
		else {
			aClass688_7065.method8126(i_13_, i_11_, i_10_, bool_14_, -523805773);
			anInt7057 = 264753133 * client.cycles;
			aBool7073 = false;
			aClass177_7064 = null;
		}
	}

	public void method6375(int i, int i_16_, int i_17_) {
		aClass688_7066 = null;
		if (i_16_ > 0) {
			aClass688_7066 = new Class688_Sub2(aClass649_Sub1_7060, false);
			aClass688_7066.method8126(i, i_16_, 1, false, -901337798);
		} else {
			aBool7070 = true;
			method6374(false, i, 1, 0, -1540340771);
		}
	}

	int method6376() {
		return -method6362((byte) -49);
	}

	void method6377(Class167 class167) {
		method6364(class167, 262144, true, true, -2057079601);
	}

	boolean method6378() {
		return aBool7071;
	}

	void method6379(Class167 class167, Class177 class177, Class433 class433, int i, int i_18_, int i_19_, int i_20_, boolean bool, byte i_21_) {
		Class172[] class172s = class177.method2514();
		Class156[] class156s = class177.method2515();
		if ((null == aClass627_7075 || aClass627_7075.aBool8168) && (class172s != null || null != class156s)) {
			Class612 class612 = ((Class612) aClass34_Sub17_7067.method70(anInt7061 * -1858685201, (byte) -11));
			if (null != class612.anIntArray7988)
				class612 = (class612.method7293(Class465_Sub1.aClass96_10352, (4 == client.anInt11074 * 1542697723 ? (Interface18) Class193.anInterface18_2191 : Class465_Sub1.aClass96_10352), (byte) 92));
			if (class612 != null)
				aClass627_7075 = Class627.method7484(client.cycles, true);
		}
		if (null != aClass627_7075) {
			class177.method2513(class433);
			if (bool)
				aClass627_7075.method7474(class167, (long) client.cycles, class172s, class156s, false);
			else
				aClass627_7075.method7485((long) client.cycles);
			aClass627_7075.method7473(aByte7058, i, i_18_, i_19_, i_20_);
		}
	}

	static final void method6380(Class668 class668, int i) {
		int i_22_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_22_ ^ 0xffffffff;
	}

	static final void method6381(Class668 class668, int i) {
		throw new RuntimeException("");
	}

	static final void method6382(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class470.method5705(string, (byte) 118);
	}

	static void method6383(int i, boolean bool, int i_23_) {
		Class536_Sub1 class536_sub1 = Class659.method7970(i, bool, -916210176);
		if (class536_sub1 != null) {
			for (int i_24_ = 0; i_24_ < class536_sub1.anIntArray10304.length; i_24_++) {
				class536_sub1.anIntArray10304[i_24_] = -1;
				class536_sub1.anIntArray10300[i_24_] = 0;
			}
			class536_sub1.aClass21Array10305 = null;
		}
	}

	static final void method6384(Class668 class668, int i) {
		if ((client.anInt11101 * -708374433 != 0 && client.anInt11101 * -708374433 != 9) || Class344.method4487(-440129613))
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else if (Class23.aBool224)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else if (3394066617891110125L * Class23.aLong225 > Class249.method3450(1876306489) - 1000L)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else {
			Class23.aBool224 = true;
			Class106 class106 = Class536_Sub41.method9871(2077853800);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4440, class106.aClass15_1258, 1445634322);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(-56372019 * Class593.worldListChecksum);
			class106.method1409(class536_sub23, -159211228);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		}
	}
}
