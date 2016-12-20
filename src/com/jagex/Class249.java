/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class249 implements Interface14 {
	public int anInt2732;
	Interface13 anInterface13_2733;
	int anInt2734;
	public int anInt2735 = -1395173747;
	public int anInt2736 = 604173035;
	public String aString2737;
	public int anInt2738;
	public int anInt2739 = -745295083;
	public int anInt2740;
	public int anInt2741 = 0;
	public static final int anInt2742 = 1;
	public static final int anInt2743 = 2;
	public String[] aStringArray2744;
	public int anInt2745;
	public boolean aBool2746 = true;
	public boolean aBool2747 = false;
	public int anInt2748;
	public String aString2749;
	public int anInt2750;
	int anInt2751;
	public Class274 aClass274_2752;
	int anInt2753;
	int anInt2754;
	Class258 aClass258_2755;
	int anInt2756;
	public static final int anInt2757 = 0;
	int anInt2758;
	public int[] anIntArray2759;
	public int[] anIntArray2760;
	int anInt2761;
	int anInt2762;
	public Class277 aClass277_2763;
	public int anInt2764;
	public int anInt2765;
	public int anInt2766;
	public int anInt2767;
	public int anInt2768;
	public int anInt2769;
	public int anInt2770;
	public int anInt2771;
	public int anInt2772;
	public int[] anIntArray2773;
	public byte[] aByteArray2774;
	int anInt2775;
	public boolean aBool2776;
	public int anInt2777;
	Class14 aClass14_2778;
	public int anInt2779;

	public Class147 method4635(Class180 class180) {
		Class147 class147 = (Class147) (aClass258_2755.aClass205_2826.method3787((long) (-1686443479 * anInt2762 | 0x20000 | -397006101 * class180.anInt2064 << 29)));
		if (null != class147)
			return class147;
		aClass258_2755.aClass459_2825.method7480(-1686443479 * anInt2762, 1737369242);
		Class185 class185 = Class165.method2653(aClass258_2755.aClass459_2825, -1686443479 * anInt2762, 0);
		if (class185 != null) {
			class147 = class180.method3271(class185, true);
			aClass258_2755.aClass205_2826.method3790(class147, (long) (-1686443479 * anInt2762 | 0x20000 | class180.anInt2064 * -397006101 << 29));
		}
		return class147;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			method4649(class527_sub38, i_0_, 941257559);
		}
	}

	public String method4636(int i, String string, int i_1_) {
		if (aClass14_2778 == null)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2778.method709((long) i);
		if (null == class527_sub26)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public void method86(int i) {
		if (anIntArray2760 != null) {
			for (int i_2_ = 0; i_2_ < anIntArray2760.length; i_2_ += 2) {
				if (anIntArray2760[i_2_] < -1712073 * anInt2740)
					anInt2740 = 286250375 * anIntArray2760[i_2_];
				else if (anIntArray2760[i_2_] > 1589409961 * anInt2771)
					anInt2771 = anIntArray2760[i_2_] * -779375719;
				if (anIntArray2760[1 + i_2_] < -1564335433 * anInt2748)
					anInt2748 = -965321977 * anIntArray2760[i_2_ + 1];
				else if (anIntArray2760[i_2_ + 1] > -548669143 * anInt2764)
					anInt2764 = anIntArray2760[i_2_ + 1] * -770329831;
			}
		}
	}

	Class249(int i, Interface13 interface13, Class258 class258) {
		aStringArray2744 = new String[5];
		anInt2762 = -2110673433;
		anInt2751 = 253636205;
		anInt2734 = 459095013;
		anInt2761 = 1419432991;
		anInt2754 = -1945129233;
		anInt2775 = 1447617451;
		anInt2758 = 1946077463;
		anIntArray2759 = null;
		anInt2740 = 1861233273;
		anInt2748 = -1182161671;
		anInt2771 = -2147483648;
		anInt2764 = -2147483648;
		anInt2770 = -1543035153;
		anInt2767 = -429523553;
		anInt2768 = 1508859909;
		aClass274_2752 = Class274.aClass274_3144;
		aClass277_2763 = Class277.aClass277_3163;
		anInt2750 = 1323320021;
		aBool2776 = true;
		anInt2777 = -285211471;
		anInt2745 = -1165934455;
		anInt2772 = 1330331225 * i;
		anInterface13_2733 = interface13;
		aClass258_2755 = class258;
	}

	public Class147 method4637(Class180 class180, boolean bool, int i) {
		int i_3_ = bool ? 1028708925 * anInt2736 : anInt2735 * 1928897467;
		int i_4_ = i_3_ | -397006101 * class180.anInt2064 << 29;
		Class147 class147 = (Class147) aClass258_2755.aClass205_2826.method3787((long) i_4_);
		if (class147 != null)
			return class147;
		if (!aClass258_2755.aClass459_2825.method7480(i_3_, -1130420703))
			return null;
		Class185 class185 = Class165.method2653(aClass258_2755.aClass459_2825, i_3_, 0);
		if (class185 != null) {
			class147 = class180.method3271(class185, true);
			aClass258_2755.aClass205_2826.method3790(class147, (long) i_4_);
		}
		return class147;
	}

	public boolean method4638(Interface20 interface20, Interface18 interface18, int i) {
		int i_5_ = -1;
		if (-1 != -1446461455 * anInt2754) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -1446461455 * anInt2754, -364099576);
			i_5_ = interface18.method101(class160, 1096407173);
		} else if (anInt2761 * 1021335585 != -1) {
			Class333 class333 = interface20.method123(anInt2761 * 1021335585, 166433523);
			i_5_ = interface18.method100(class333, (short) -20007);
		} else
			return true;
		if (anIntArray2759 == null) {
			if (i_5_ < anInt2751 * 1378022555 || i_5_ > 1459975699 * anInt2734)
				return false;
		} else {
			if (i_5_ < 0 || i_5_ >= anIntArray2759.length - 1) {
				int i_6_ = anIntArray2759[anIntArray2759.length - 1];
				if (-1 != i_6_) {
					if (-1 != anInt2751 * 1378022555 && -1 != 1459975699 * anInt2734 && (i_5_ < anInt2751 * 1378022555 || i_5_ > 1459975699 * anInt2734))
						return false;
				} else
					return false;
			}
			if (anIntArray2759[i_5_] == -1)
				return false;
		}
		boolean bool = false;
		int i_7_;
		if (anInt2758 * -11206311 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt2758 * -11206311, -1811696228);
			i_7_ = interface18.method101(class160, 1096407173);
		} else if (anInt2775 * 920977661 != -1) {
			Class333 class333 = interface20.method123(anInt2775 * 920977661, -1597620351);
			i_7_ = interface18.method100(class333, (short) -1413);
		} else
			return true;
		if (i_7_ < anInt2753 * -807453685 || i_7_ > -1171668907 * anInt2756)
			return false;
		return true;
	}

	public Class147 method4639(Class180 class180, int i) {
		Class147 class147 = (Class147) (aClass258_2755.aClass205_2826.method3787((long) (-1686443479 * anInt2762 | 0x20000 | -397006101 * class180.anInt2064 << 29)));
		if (null != class147)
			return class147;
		aClass258_2755.aClass459_2825.method7480(-1686443479 * anInt2762, 1755594303);
		Class185 class185 = Class165.method2653(aClass258_2755.aClass459_2825, -1686443479 * anInt2762, 0);
		if (class185 != null) {
			class147 = class180.method3271(class185, true);
			aClass258_2755.aClass205_2826.method3790(class147, (long) (-1686443479 * anInt2762 | 0x20000 | class180.anInt2064 * -397006101 << 29));
		}
		return class147;
	}

	public int method4640(int i, int i_8_, int i_9_) {
		if (aClass14_2778 == null)
			return i_8_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2778.method709((long) i);
		if (null == class527_sub7)
			return i_8_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method4649(class527_sub38, i, 1614834143);
		}
	}

	public final Class249 method4641(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (anInt2761 * 1021335585 != -1) {
			Class333 class333 = interface20.method123(anInt2761 * 1021335585, -879203617);
			if (null != class333)
				i = interface18.method100(class333, (short) -32027);
		} else if (-1446461455 * anInt2754 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -1446461455 * anInt2754, -1474174941);
			if (class160 != null)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray2759.length - 1) {
			int i_10_ = anIntArray2759[anIntArray2759.length - 1];
			if (-1 != i_10_)
				return ((Class249) anInterface13_2733.method81(i_10_, -1981188752));
			return null;
		}
		if (anIntArray2759[i] == -1)
			return null;
		return ((Class249) anInterface13_2733.method81(anIntArray2759[i], -1508327852));
	}

	public String method4642(int i, String string) {
		if (aClass14_2778 == null)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2778.method709((long) i);
		if (null == class527_sub26)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method4649(class527_sub38, i, 1446231877);
		}
	}

	public void method85() {
		if (anIntArray2760 != null) {
			for (int i = 0; i < anIntArray2760.length; i += 2) {
				if (anIntArray2760[i] < -1712073 * anInt2740)
					anInt2740 = 286250375 * anIntArray2760[i];
				else if (anIntArray2760[i] > 1589409961 * anInt2771)
					anInt2771 = anIntArray2760[i] * -779375719;
				if (anIntArray2760[1 + i] < -1564335433 * anInt2748)
					anInt2748 = -965321977 * anIntArray2760[i + 1];
				else if (anIntArray2760[i + 1] > -548669143 * anInt2764)
					anInt2764 = anIntArray2760[i + 1] * -770329831;
			}
		}
	}

	public void method84() {
		if (anIntArray2760 != null) {
			for (int i = 0; i < anIntArray2760.length; i += 2) {
				if (anIntArray2760[i] < -1712073 * anInt2740)
					anInt2740 = 286250375 * anIntArray2760[i];
				else if (anIntArray2760[i] > 1589409961 * anInt2771)
					anInt2771 = anIntArray2760[i] * -779375719;
				if (anIntArray2760[1 + i] < -1564335433 * anInt2748)
					anInt2748 = -965321977 * anIntArray2760[i + 1];
				else if (anIntArray2760[i + 1] > -548669143 * anInt2764)
					anInt2764 = anIntArray2760[i + 1] * -770329831;
			}
		}
	}

	void method4643(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt2735 = class527_sub38.method16466(-1622642717) * 1395173747;
		else if (i == 2)
			anInt2736 = class527_sub38.method16466(-1918872378) * -604173035;
		else if (3 == i)
			aString2737 = class527_sub38.readString(1543412542);
		else if (i == 4)
			anInt2738 = class527_sub38.read24BitUnsignedInteger(1602922270) * 2119433309;
		else if (5 == i)
			anInt2739 = class527_sub38.read24BitUnsignedInteger(1887778634) * 745295083;
		else if (6 == i)
			anInt2741 = class527_sub38.readUnsignedByte() * -835586857;
		else if (i == 7) {
			int i_11_ = class527_sub38.readUnsignedByte();
			if (0 == (i_11_ & 0x1))
				aBool2746 = false;
			if ((i_11_ & 0x2) == 2)
				aBool2747 = true;
		} else if (i == 8)
			class527_sub38.readUnsignedByte();
		else if (i == 9) {
			anInt2761 = class527_sub38.readUnsignedShort() * -1419432991;
			if (1021335585 * anInt2761 == 65535)
				anInt2761 = 1419432991;
			anInt2754 = class527_sub38.readUnsignedShort() * 1945129233;
			if (-1446461455 * anInt2754 == 65535)
				anInt2754 = -1945129233;
			anInt2751 = class527_sub38.readInt() * -253636205;
			anInt2734 = class527_sub38.readInt() * -459095013;
		} else if (i >= 10 && i <= 14)
			aStringArray2744[i - 10] = class527_sub38.readString(1245627465);
		else if (i == 15) {
			int i_12_ = class527_sub38.readUnsignedByte();
			anIntArray2760 = new int[2 * i_12_];
			for (int i_13_ = 0; i_13_ < i_12_ * 2; i_13_++)
				anIntArray2760[i_13_] = class527_sub38.readShort();
			anInt2765 = class527_sub38.readInt() * 1358867653;
			int i_14_ = class527_sub38.readUnsignedByte();
			anIntArray2773 = new int[i_14_];
			for (int i_15_ = 0; i_15_ < anIntArray2773.length; i_15_++)
				anIntArray2773[i_15_] = class527_sub38.readInt();
			aByteArray2774 = new byte[i_12_];
			for (int i_16_ = 0; i_16_ < i_12_; i_16_++)
				aByteArray2774[i_16_] = class527_sub38.readByte();
		} else if (16 == i)
			aBool2776 = false;
		else if (i == 17)
			aString2749 = class527_sub38.readString(1012227594);
		else if (18 == i)
			anInt2762 = class527_sub38.method16466(-1794963970) * 2110673433;
		else if (i == 19)
			anInt2777 = class527_sub38.readUnsignedShort() * 285211471;
		else if (20 == i) {
			anInt2775 = class527_sub38.readUnsignedShort() * -1447617451;
			if (anInt2775 * 920977661 == 65535)
				anInt2775 = 1447617451;
			anInt2758 = class527_sub38.readUnsignedShort() * -1946077463;
			if (65535 == -11206311 * anInt2758)
				anInt2758 = 1946077463;
			anInt2753 = class527_sub38.readInt() * -1644400733;
			anInt2756 = class527_sub38.readInt() * -1845150467;
		} else if (21 == i)
			anInt2732 = class527_sub38.readInt() * -1448345399;
		else if (i == 22)
			anInt2779 = class527_sub38.readInt() * -1981728215;
		else if (i == 23) {
			anInt2770 = class527_sub38.readUnsignedByte() * 1543035153;
			anInt2767 = class527_sub38.readUnsignedByte() * 429523553;
			anInt2768 = class527_sub38.readUnsignedByte() * -1508859909;
		} else if (24 == i) {
			anInt2769 = class527_sub38.readShort() * 929570405;
			anInt2766 = class527_sub38.readShort() * -1705318631;
		} else if (i == 25)
			anInt2745 = class527_sub38.method16466(-1696723944) * 1165934455;
		else if (26 == i || i == 27) {
			anInt2761 = class527_sub38.readUnsignedShort() * -1419432991;
			if (anInt2761 * 1021335585 == 65535)
				anInt2761 = 1419432991;
			anInt2754 = class527_sub38.readUnsignedShort() * 1945129233;
			if (anInt2754 * -1446461455 == 65535)
				anInt2754 = -1945129233;
			int i_17_ = -1;
			if (27 == i) {
				i_17_ = class527_sub38.readUnsignedShort();
				if (i_17_ == 65535)
					i_17_ = -1;
			}
			int i_18_ = class527_sub38.readUnsignedByte();
			anIntArray2759 = new int[i_18_ + 2];
			for (int i_19_ = 0; i_19_ <= i_18_; i_19_++) {
				anIntArray2759[i_19_] = class527_sub38.readUnsignedShort();
				if (65535 == anIntArray2759[i_19_])
					anIntArray2759[i_19_] = -1;
			}
			anIntArray2759[i_18_ + 1] = i_17_;
		} else if (28 == i)
			anInt2750 = class527_sub38.readUnsignedByte() * -1323320021;
		else if (i == 29)
			aClass274_2752 = ((Class274) Class26.method858(Class24_Sub20.method17422(-828799108), class527_sub38.readUnsignedByte(), -573842168));
		else if (i == 30)
			aClass277_2763 = ((Class277) Class26.method858(Class284.method5200(-903498615), class527_sub38.readUnsignedByte(), 325167973));
		else if (249 == i) {
			int i_20_ = class527_sub38.readUnsignedByte();
			if (aClass14_2778 == null) {
				int i_21_ = Class186.method3652(i_20_, 812683817);
				aClass14_2778 = new Class14(i_21_);
			}
			for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
				boolean bool = class527_sub38.readUnsignedByte() == 1;
				int i_23_ = class527_sub38.read24BitUnsignedInteger(348615880);
				Class527 class527;
				if (bool)
					class527 = new Class527_Sub26(class527_sub38.readString(1168621907));
				else
					class527 = new Node_Sub6(class527_sub38.readInt());
				aClass14_2778.method714(class527, (long) i_23_);
			}
		}
	}

	public boolean method4644(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (-1 != -1446461455 * anInt2754) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -1446461455 * anInt2754, -1631215380);
			i = interface18.method101(class160, 1096407173);
		} else if (anInt2761 * 1021335585 != -1) {
			Class333 class333 = interface20.method123(anInt2761 * 1021335585, -219545762);
			i = interface18.method100(class333, (short) -15847);
		} else
			return true;
		if (anIntArray2759 == null) {
			if (i < anInt2751 * 1378022555 || i > 1459975699 * anInt2734)
				return false;
		} else {
			if (i < 0 || i >= anIntArray2759.length - 1) {
				int i_24_ = anIntArray2759[anIntArray2759.length - 1];
				if (-1 != i_24_) {
					if (-1 != anInt2751 * 1378022555 && -1 != 1459975699 * anInt2734 && (i < anInt2751 * 1378022555 || i > 1459975699 * anInt2734))
						return false;
				} else
					return false;
			}
			if (anIntArray2759[i] == -1)
				return false;
		}
		boolean bool = false;
		int i_25_;
		if (anInt2758 * -11206311 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt2758 * -11206311, -1491523612);
			i_25_ = interface18.method101(class160, 1096407173);
		} else if (anInt2775 * 920977661 != -1) {
			Class333 class333 = interface20.method123(anInt2775 * 920977661, 247665756);
			i_25_ = interface18.method100(class333, (short) -17384);
		} else
			return true;
		if (i_25_ < anInt2753 * -807453685 || i_25_ > -1171668907 * anInt2756)
			return false;
		return true;
	}

	public final Class249 method4645(Interface20 interface20, Interface18 interface18, int i) {
		int i_26_ = -1;
		if (anInt2761 * 1021335585 != -1) {
			Class333 class333 = interface20.method123(anInt2761 * 1021335585, 1422665892);
			if (null != class333)
				i_26_ = interface18.method100(class333, (short) -20688);
		} else if (-1446461455 * anInt2754 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -1446461455 * anInt2754, -900323180);
			if (class160 != null)
				i_26_ = interface18.method101(class160, 1096407173);
		}
		if (i_26_ < 0 || i_26_ >= anIntArray2759.length - 1) {
			int i_27_ = anIntArray2759[anIntArray2759.length - 1];
			if (-1 != i_27_)
				return ((Class249) anInterface13_2733.method81(i_27_, 1494189755));
			return null;
		}
		if (anIntArray2759[i_26_] == -1)
			return null;
		return (Class249) anInterface13_2733.method81(anIntArray2759[i_26_], 1677133409);
	}

	public Class147 method4646(Class180 class180, boolean bool) {
		int i = bool ? 1028708925 * anInt2736 : anInt2735 * 1928897467;
		int i_28_ = i | -397006101 * class180.anInt2064 << 29;
		Class147 class147 = ((Class147) aClass258_2755.aClass205_2826.method3787((long) i_28_));
		if (class147 != null)
			return class147;
		if (!aClass258_2755.aClass459_2825.method7480(i, 833623401))
			return null;
		Class185 class185 = Class165.method2653(aClass258_2755.aClass459_2825, i, 0);
		if (class185 != null) {
			class147 = class180.method3271(class185, true);
			aClass258_2755.aClass205_2826.method3790(class147, (long) i_28_);
		}
		return class147;
	}

	public Class147 method4647(Class180 class180, boolean bool) {
		int i = bool ? 1028708925 * anInt2736 : anInt2735 * 1928897467;
		int i_29_ = i | -397006101 * class180.anInt2064 << 29;
		Class147 class147 = ((Class147) aClass258_2755.aClass205_2826.method3787((long) i_29_));
		if (class147 != null)
			return class147;
		if (!aClass258_2755.aClass459_2825.method7480(i, -1040752660))
			return null;
		Class185 class185 = Class165.method2653(aClass258_2755.aClass459_2825, i, 0);
		if (class185 != null) {
			class147 = class180.method3271(class185, true);
			aClass258_2755.aClass205_2826.method3790(class147, (long) i_29_);
		}
		return class147;
	}

	public Class147 method4648(Class180 class180, byte i) {
		int i_30_ = anInt2745 * 581159495 | -397006101 * class180.anInt2064 << 29;
		Class147 class147 = ((Class147) aClass258_2755.aClass205_2826.method3787((long) i_30_));
		if (class147 != null)
			return class147;
		if (!aClass258_2755.aClass459_2825.method7480(581159495 * anInt2745, 652081764))
			return null;
		Class185 class185 = Class165.method2653(aClass258_2755.aClass459_2825, anInt2745 * 581159495, 0);
		if (null != class185) {
			class147 = class180.method3271(class185, true);
			aClass258_2755.aClass205_2826.method3790(class147, (long) i_30_);
		}
		return class147;
	}

	void method4649(RSByteBuffer class527_sub38, int i, int i_31_) {
		if (i == 1)
			anInt2735 = class527_sub38.method16466(-2109824658) * 1395173747;
		else if (i == 2)
			anInt2736 = class527_sub38.method16466(-1694359956) * -604173035;
		else if (3 == i)
			aString2737 = class527_sub38.readString(1771145279);
		else if (i == 4)
			anInt2738 = class527_sub38.read24BitUnsignedInteger(546053861) * 2119433309;
		else if (5 == i)
			anInt2739 = class527_sub38.read24BitUnsignedInteger(437159608) * 745295083;
		else if (6 == i)
			anInt2741 = class527_sub38.readUnsignedByte() * -835586857;
		else if (i == 7) {
			int i_32_ = class527_sub38.readUnsignedByte();
			if (0 == (i_32_ & 0x1))
				aBool2746 = false;
			if ((i_32_ & 0x2) == 2)
				aBool2747 = true;
		} else if (i == 8)
			class527_sub38.readUnsignedByte();
		else if (i == 9) {
			anInt2761 = class527_sub38.readUnsignedShort() * -1419432991;
			if (1021335585 * anInt2761 == 65535)
				anInt2761 = 1419432991;
			anInt2754 = class527_sub38.readUnsignedShort() * 1945129233;
			if (-1446461455 * anInt2754 == 65535)
				anInt2754 = -1945129233;
			anInt2751 = class527_sub38.readInt() * -253636205;
			anInt2734 = class527_sub38.readInt() * -459095013;
		} else if (i >= 10 && i <= 14)
			aStringArray2744[i - 10] = class527_sub38.readString(738784744);
		else if (i == 15) {
			int i_33_ = class527_sub38.readUnsignedByte();
			anIntArray2760 = new int[2 * i_33_];
			for (int i_34_ = 0; i_34_ < i_33_ * 2; i_34_++)
				anIntArray2760[i_34_] = class527_sub38.readShort();
			anInt2765 = class527_sub38.readInt() * 1358867653;
			int i_35_ = class527_sub38.readUnsignedByte();
			anIntArray2773 = new int[i_35_];
			for (int i_36_ = 0; i_36_ < anIntArray2773.length; i_36_++)
				anIntArray2773[i_36_] = class527_sub38.readInt();
			aByteArray2774 = new byte[i_33_];
			for (int i_37_ = 0; i_37_ < i_33_; i_37_++)
				aByteArray2774[i_37_] = class527_sub38.readByte();
		} else if (16 == i)
			aBool2776 = false;
		else if (i == 17)
			aString2749 = class527_sub38.readString(730782983);
		else if (18 == i)
			anInt2762 = class527_sub38.method16466(-2042267751) * 2110673433;
		else if (i == 19)
			anInt2777 = class527_sub38.readUnsignedShort() * 285211471;
		else if (20 == i) {
			anInt2775 = class527_sub38.readUnsignedShort() * -1447617451;
			if (anInt2775 * 920977661 == 65535)
				anInt2775 = 1447617451;
			anInt2758 = class527_sub38.readUnsignedShort() * -1946077463;
			if (65535 == -11206311 * anInt2758)
				anInt2758 = 1946077463;
			anInt2753 = class527_sub38.readInt() * -1644400733;
			anInt2756 = class527_sub38.readInt() * -1845150467;
		} else if (21 == i)
			anInt2732 = class527_sub38.readInt() * -1448345399;
		else if (i == 22)
			anInt2779 = class527_sub38.readInt() * -1981728215;
		else if (i == 23) {
			anInt2770 = class527_sub38.readUnsignedByte() * 1543035153;
			anInt2767 = class527_sub38.readUnsignedByte() * 429523553;
			anInt2768 = class527_sub38.readUnsignedByte() * -1508859909;
		} else if (24 == i) {
			anInt2769 = class527_sub38.readShort() * 929570405;
			anInt2766 = class527_sub38.readShort() * -1705318631;
		} else if (i == 25)
			anInt2745 = class527_sub38.method16466(-1895557228) * 1165934455;
		else if (26 == i || i == 27) {
			anInt2761 = class527_sub38.readUnsignedShort() * -1419432991;
			if (anInt2761 * 1021335585 == 65535)
				anInt2761 = 1419432991;
			anInt2754 = class527_sub38.readUnsignedShort() * 1945129233;
			if (anInt2754 * -1446461455 == 65535)
				anInt2754 = -1945129233;
			int i_38_ = -1;
			if (27 == i) {
				i_38_ = class527_sub38.readUnsignedShort();
				if (i_38_ == 65535)
					i_38_ = -1;
			}
			int i_39_ = class527_sub38.readUnsignedByte();
			anIntArray2759 = new int[i_39_ + 2];
			for (int i_40_ = 0; i_40_ <= i_39_; i_40_++) {
				anIntArray2759[i_40_] = class527_sub38.readUnsignedShort();
				if (65535 == anIntArray2759[i_40_])
					anIntArray2759[i_40_] = -1;
			}
			anIntArray2759[i_39_ + 1] = i_38_;
		} else if (28 == i)
			anInt2750 = class527_sub38.readUnsignedByte() * -1323320021;
		else if (i == 29)
			aClass274_2752 = ((Class274) Class26.method858(Class24_Sub20.method17422(-933665457), class527_sub38.readUnsignedByte(), -500610499));
		else if (i == 30)
			aClass277_2763 = ((Class277) Class26.method858(Class284.method5200(-903498615), class527_sub38.readUnsignedByte(), -929350372));
		else if (249 == i) {
			int i_41_ = class527_sub38.readUnsignedByte();
			if (aClass14_2778 == null) {
				int i_42_ = Class186.method3652(i_41_, -1782440716);
				aClass14_2778 = new Class14(i_42_);
			}
			for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
				boolean bool = class527_sub38.readUnsignedByte() == 1;
				int i_44_ = class527_sub38.read24BitUnsignedInteger(1674432360);
				Class527 class527;
				if (bool)
					class527 = new Class527_Sub26(class527_sub38.readString(1396575038));
				else
					class527 = new Node_Sub6(class527_sub38.readInt());
				aClass14_2778.method714(class527, (long) i_44_);
			}
		}
	}

	public Class147 method4650(Class180 class180) {
		Class147 class147 = (Class147) (aClass258_2755.aClass205_2826.method3787((long) (-1686443479 * anInt2762 | 0x20000 | -397006101 * class180.anInt2064 << 29)));
		if (null != class147)
			return class147;
		aClass258_2755.aClass459_2825.method7480(-1686443479 * anInt2762, 1063545244);
		Class185 class185 = Class165.method2653(aClass258_2755.aClass459_2825, -1686443479 * anInt2762, 0);
		if (class185 != null) {
			class147 = class180.method3271(class185, true);
			aClass258_2755.aClass205_2826.method3790(class147, (long) (-1686443479 * anInt2762 | 0x20000 | class180.anInt2064 * -397006101 << 29));
		}
		return class147;
	}

	public int method4651(int i, int i_45_) {
		if (aClass14_2778 == null)
			return i_45_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2778.method709((long) i);
		if (null == class527_sub7)
			return i_45_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public int method4652(int i, int i_46_) {
		if (aClass14_2778 == null)
			return i_46_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2778.method709((long) i);
		if (null == class527_sub7)
			return i_46_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public int method4653(int i, int i_47_) {
		if (aClass14_2778 == null)
			return i_47_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2778.method709((long) i);
		if (null == class527_sub7)
			return i_47_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public Class147 method4654(Class180 class180) {
		int i = anInt2745 * 581159495 | -397006101 * class180.anInt2064 << 29;
		Class147 class147 = (Class147) aClass258_2755.aClass205_2826.method3787((long) i);
		if (class147 != null)
			return class147;
		if (!aClass258_2755.aClass459_2825.method7480(581159495 * anInt2745, -978925522))
			return null;
		Class185 class185 = Class165.method2653(aClass258_2755.aClass459_2825, anInt2745 * 581159495, 0);
		if (null != class185) {
			class147 = class180.method3271(class185, true);
			aClass258_2755.aClass205_2826.method3790(class147, (long) i);
		}
		return class147;
	}

	public final Class249 method4655(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (anInt2761 * 1021335585 != -1) {
			Class333 class333 = interface20.method123(anInt2761 * 1021335585, 659614288);
			if (null != class333)
				i = interface18.method100(class333, (short) -12138);
		} else if (-1446461455 * anInt2754 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -1446461455 * anInt2754, -963683090);
			if (class160 != null)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray2759.length - 1) {
			int i_48_ = anIntArray2759[anIntArray2759.length - 1];
			if (-1 != i_48_)
				return ((Class249) anInterface13_2733.method81(i_48_, 737489522));
			return null;
		}
		if (anIntArray2759[i] == -1)
			return null;
		return ((Class249) anInterface13_2733.method81(anIntArray2759[i], 1259767812));
	}

	public boolean method4656(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (-1 != -1446461455 * anInt2754) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -1446461455 * anInt2754, -1838597505);
			i = interface18.method101(class160, 1096407173);
		} else if (anInt2761 * 1021335585 != -1) {
			Class333 class333 = interface20.method123(anInt2761 * 1021335585, -5763762);
			i = interface18.method100(class333, (short) -8777);
		} else
			return true;
		if (anIntArray2759 == null) {
			if (i < anInt2751 * 1378022555 || i > 1459975699 * anInt2734)
				return false;
		} else {
			if (i < 0 || i >= anIntArray2759.length - 1) {
				int i_49_ = anIntArray2759[anIntArray2759.length - 1];
				if (-1 != i_49_) {
					if (-1 != anInt2751 * 1378022555 && -1 != 1459975699 * anInt2734 && (i < anInt2751 * 1378022555 || i > 1459975699 * anInt2734))
						return false;
				} else
					return false;
			}
			if (anIntArray2759[i] == -1)
				return false;
		}
		boolean bool = false;
		int i_50_;
		if (anInt2758 * -11206311 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt2758 * -11206311, -1409040204);
			i_50_ = interface18.method101(class160, 1096407173);
		} else if (anInt2775 * 920977661 != -1) {
			Class333 class333 = interface20.method123(anInt2775 * 920977661, -1555355620);
			i_50_ = interface18.method100(class333, (short) -19682);
		} else
			return true;
		if (i_50_ < anInt2753 * -807453685 || i_50_ > -1171668907 * anInt2756)
			return false;
		return true;
	}

	public final Class249 method4657(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (anInt2761 * 1021335585 != -1) {
			Class333 class333 = interface20.method123(anInt2761 * 1021335585, -623739667);
			if (null != class333)
				i = interface18.method100(class333, (short) -32028);
		} else if (-1446461455 * anInt2754 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, -1446461455 * anInt2754, -783781539);
			if (class160 != null)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray2759.length - 1) {
			int i_51_ = anIntArray2759[anIntArray2759.length - 1];
			if (-1 != i_51_)
				return ((Class249) anInterface13_2733.method81(i_51_, -941583101));
			return null;
		}
		if (anIntArray2759[i] == -1)
			return null;
		return ((Class249) anInterface13_2733.method81(anIntArray2759[i], 250463816));
	}

	static final int method4658(int i, int i_52_, int i_53_, int i_54_) {
		if (i == i_52_)
			return i;
		int i_55_ = 128 - i_53_;
		int i_56_ = (i_52_ & 0x7f) * i_53_ + (i & 0x7f) * i_55_ >> 7;
		int i_57_ = i_55_ * (i & 0x380) + (i_52_ & 0x380) * i_53_ >> 7;
		int i_58_ = i_55_ * (i & 0xfc00) + (i_52_ & 0xfc00) * i_53_ >> 7;
		return i_58_ & 0xfc00 | i_57_ & 0x380 | i_56_ & 0x7f;
	}

	static final void method4659(Class243 class243, Class240 class240, boolean bool, int i, Class665 class665, byte i_59_) {
		class665.anInt8526 -= 204761682;
		int i_60_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_61_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		if (-927924265 * class243.anInt2675 == -1 && !class240.aBool2394) {
			Class144_Sub1.method14513(class243.anInt2504 * -254728301, (byte) -1);
			Class208_Sub21.method15637(-254728301 * class243.anInt2504, (byte) -33);
			Class527_Sub31.method16351(class243.anInt2504 * -254728301, -62985375);
		}
		if (i_60_ == -1) {
			class243.anInt2541 = 121119097;
			class243.anInt2542 = 174092741;
			class243.anInt2572 = -1325886353;
		} else {
			class243.anInt2572 = i_60_ * 1325886353;
			class243.anInt2589 = -556656963 * i_61_;
			class243.aBool2655 = bool;
			Class9 class9 = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_60_, 25019970);
			class243.anInt2547 = -374676893 * class9.anInt107;
			class243.anInt2548 = 1065196537 * class9.anInt94;
			class243.anInt2549 = -538513913 * class9.anInt95;
			class243.anInt2545 = -1057392511 * class9.anInt138;
			class243.anInt2546 = class9.anInt97 * -1597423567;
			class243.anInt2553 = class9.anInt92 * 1444331149;
			class243.anInt2558 = -944822447 * i;
			if (class243.anInt2554 * 1514038763 > 0)
				class243.anInt2553 = -413286125 * (class243.anInt2553 * 654713696 / (class243.anInt2554 * 1514038763));
			else if (1885280809 * class243.anInt2509 > 0)
				class243.anInt2553 = -413286125 * (654713696 * class243.anInt2553 / (class243.anInt2509 * 1885280809));
		}
	}

	static final void method4660(Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class15.method739(string, -1776716848);
	}

	static final void method4661(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_62_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_63_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		Class80 class80 = ((Class80) Class679.aClass24_Sub21_8628.method81(i_63_, -1498367616));
		if (class80.method1566(1200398548))
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class198) Class321.aClass24_Sub10_3551.method81(i_62_, -1346966061)).method3734(i_63_, class80.aString806, 1575158955);
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (((Class198) Class321.aClass24_Sub10_3551.method81(i_62_, -224484889)).method3733(i_63_, class80.anInt804 * 780718929, (byte) -82));
	}

	static final void method4662(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (class665.anIntArray8546[class665.anIntArray8545[891367231 * class665.anInt8527]]);
	}

	static final void method4663(Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1, short i) {
		Class695_Sub2 class695_sub2 = class640_sub1_sub2_sub1.aClass695_Sub2_11913;
		if (class695_sub2.method14162(-825448970) && class695_sub2.method14187(1, 1236220031) && class695_sub2.method14177(2122338344)) {
			if (class695_sub2.aBool10970) {
				class695_sub2.method14168(class640_sub1_sub2_sub1.method18542(-2032041795).method9786(-311528533), false, true, 1434372188);
				class695_sub2.aBool10970 = class695_sub2.method14162(-1326791697);
			}
			class695_sub2.method14179(-1389540908);
		}
		for (int i_64_ = 0; i_64_ < class640_sub1_sub2_sub1.aClass505Array11915.length; i_64_++) {
			if (1429262853 * (class640_sub1_sub2_sub1.aClass505Array11915[i_64_].anInt6909) != -1) {
				Class695 class695 = (class640_sub1_sub2_sub1.aClass505Array11915[i_64_].aClass695_6911);
				if (class695.method14172(296087927)) {
					Class685 class685 = (Class685) (Class57.aClass24_Sub4_720.method81(1429262853 * (class640_sub1_sub2_sub1.aClass505Array11915[i_64_].anInt6909), 117036519));
					Class198 class198 = class695.method14163(-455590869);
					if (class685.aBool8665) {
						if (class198.anInt2193 * -970181161 == 3) {
							if ((1210251625 * class640_sub1_sub2_sub1.anInt11947) > 0 && ((-1359861193 * class640_sub1_sub2_sub1.anInt11923) <= client.anInt11019) && (class640_sub1_sub2_sub1.anInt11930 * 488451139) < client.anInt11019) {
								class695.method14165(-1, (byte) 79);
								class640_sub1_sub2_sub1.aClass505Array11915[i_64_].anInt6909 = 82367795;
								continue;
							}
						} else if (class198.anInt2193 * -970181161 == 1 && 1210251625 * (class640_sub1_sub2_sub1.anInt11947) > 0 && ((-1359861193 * class640_sub1_sub2_sub1.anInt11923) <= client.anInt11019) && ((488451139 * class640_sub1_sub2_sub1.anInt11930) < client.anInt11019))
							continue;
					}
				}
				if (class695.method14187(1, 1744800272) && class695.method14177(1462598384)) {
					class695.method14165(-1, (byte) 109);
					class640_sub1_sub2_sub1.aClass505Array11915[i_64_].anInt6909 = 82367795;
				}
			}
		}
		Class695 class695 = class640_sub1_sub2_sub1.aClass695_11914;
		do {
			if (class695.method14162(-1000380682)) {
				Class198 class198 = class695.method14163(-638658488);
				if (3 == -970181161 * class198.anInt2193) {
					if (class640_sub1_sub2_sub1.anInt11947 * 1210251625 > 0 && (class640_sub1_sub2_sub1.anInt11923 * -1359861193 <= client.anInt11019) && (class640_sub1_sub2_sub1.anInt11930 * 488451139 < client.anInt11019)) {
						class640_sub1_sub2_sub1.anIntArray11931 = null;
						class695.method14165(-1, (byte) 25);
						break;
					}
				} else if (1 == -970181161 * class198.anInt2193) {
					if (class640_sub1_sub2_sub1.anInt11947 * 1210251625 > 0 && (-1359861193 * class640_sub1_sub2_sub1.anInt11923 <= client.anInt11019) && (488451139 * class640_sub1_sub2_sub1.anInt11930 < client.anInt11019)) {
						class695.method14160(1, (byte) -64);
						break;
					}
					class695.method14160(0, (byte) -14);
				}
				if (class695.method14187(1, 2042411148) && class695.method14177(426285962)) {
					class640_sub1_sub2_sub1.anIntArray11931 = null;
					class695.method14165(-1, (byte) 64);
				}
			}
		} while (false);
		for (int i_65_ = 0; (i_65_ < class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934.length); i_65_++) {
			Class695_Sub3_Sub1 class695_sub3_sub1 = class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934[i_65_];
			if (null != class695_sub3_sub1) {
				if (class695_sub3_sub1.anInt11885 * -1374842995 > 0)
					class695_sub3_sub1.anInt11885 -= -1829614779;
				else if (class695_sub3_sub1.method14187(1, -1276678587) && class695_sub3_sub1.method14177(752250719))
					class640_sub1_sub2_sub1.aClass695_Sub3_Sub1Array11934[i_65_] = null;
			}
		}
	}
}
