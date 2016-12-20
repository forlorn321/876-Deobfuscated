/* Class587 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.Iterator;

public class Class587 implements Interface7, Interface14 {
	public int anInt7716;
	public boolean aBool7717;
	public int[] anIntArray7718;
	int anInt7719;
	public int anInt7720;
	public int anInt7721;
	public int anInt7722;
	public int anInt7723;
	public int anInt7724;
	public int anInt7725;
	public int anInt7726;
	public int anInt7727;
	public int anInt7728;
	public int anInt7729;
	public int[] anIntArray7730;
	public int anInt7731;
	public int anInt7732;
	public int anInt7733;
	public int anInt7734;
	public int anInt7735;
	public int anInt7736;
	public int anInt7737;
	public int anInt7738;
	public int anInt7739;
	public int anInt7740;
	public int anInt7741;
	public int anInt7742;
	public int[] anIntArray7743;
	public int[][] anIntArrayArray7744;
	public int[][] anIntArrayArray7745;
	Class432[] aClass432Array7746;
	public int anInt7747;
	public int[] anIntArray7748;
	public int anInt7749;
	public int anInt7750;
	public int anInt7751;
	public int anInt7752 = 965106271;
	public int anInt7753;
	public int anInt7754;
	public int anInt7755;
	public int anInt7756;
	public int anInt7757;
	public int anInt7758;
	public int anInt7759;
	public static Class24_Sub19 aClass24_Sub19_7760;

	void method9784(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			anInt7752 = class527_sub38.method16466(-1797667492) * -965106271;
			anInt7759 = class527_sub38.method16466(-1891293579) * -515420617;
		} else if (i == 2)
			anInt7721 = class527_sub38.method16466(-1874297525) * -1955999763;
		else if (i == 3)
			anInt7731 = class527_sub38.method16466(-1957882622) * 1687931229;
		else if (i == 4)
			anInt7732 = class527_sub38.method16466(-2140178780) * 1506434867;
		else if (5 == i)
			anInt7733 = class527_sub38.method16466(-1604674681) * -756019441;
		else if (6 == i)
			anInt7755 = class527_sub38.method16466(-1900190457) * 780444359;
		else if (7 == i)
			anInt7727 = class527_sub38.method16466(-1848217734) * -998393921;
		else if (i == 8)
			anInt7728 = class527_sub38.method16466(-1824654897) * -883769299;
		else if (9 == i)
			anInt7729 = class527_sub38.method16466(-2002211587) * -1249813139;
		else if (26 == i) {
			anInt7740 = ((short) (class527_sub38.readUnsignedByte() * 4) * 1806423541);
			anInt7738 = ((short) (class527_sub38.readUnsignedByte() * 4) * -1920740649);
		} else if (i == 27) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (anIntArrayArray7744 == null)
				anIntArrayArray7744 = new int[1 + i_0_][];
			else if (i_0_ >= anIntArrayArray7744.length)
				anIntArrayArray7744 = (int[][]) Arrays.copyOf(anIntArrayArray7744, i_0_ + 1);
			anIntArrayArray7744[i_0_] = new int[6];
			for (int i_1_ = 0; i_1_ < 6; i_1_++)
				anIntArrayArray7744[i_0_][i_1_] = class527_sub38.readShort();
		} else if (28 == i) {
			int i_2_ = class527_sub38.readUnsignedByte();
			anIntArray7748 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				anIntArray7748[i_3_] = class527_sub38.readUnsignedByte();
				if (anIntArray7748[i_3_] == 255)
					anIntArray7748[i_3_] = -1;
			}
		} else if (29 == i)
			anInt7726 = class527_sub38.readUnsignedByte() * -362064149;
		else if (30 == i)
			anInt7750 = class527_sub38.readUnsignedShort() * 1828694323;
		else if (31 == i)
			anInt7725 = class527_sub38.readUnsignedByte() * -1506375525;
		else if (32 == i)
			anInt7722 = class527_sub38.readUnsignedShort() * -636216129;
		else if (33 == i)
			anInt7753 = class527_sub38.readShort() * -207413783;
		else if (34 == i)
			anInt7751 = class527_sub38.readUnsignedByte() * -740038347;
		else if (35 == i)
			anInt7747 = class527_sub38.readUnsignedShort() * -1079949653;
		else if (36 == i)
			anInt7756 = class527_sub38.readShort() * -1597074123;
		else if (i == 37)
			anInt7749 = class527_sub38.readUnsignedByte() * 781923975;
		else if (i == 38)
			anInt7720 = class527_sub38.method16466(-1943171007) * 1913305385;
		else if (39 == i)
			anInt7741 = class527_sub38.method16466(-2121829231) * -1530259901;
		else if (i == 40)
			anInt7723 = class527_sub38.method16466(-1949603492) * 119461529;
		else if (41 == i)
			anInt7724 = class527_sub38.method16466(-1585173193) * 2037060533;
		else if (42 == i)
			anInt7716 = class527_sub38.method16466(-1889711471) * 280896517;
		else if (43 == i)
			class527_sub38.readUnsignedShort();
		else if (i == 44)
			class527_sub38.readUnsignedShort();
		else if (i == 45)
			anInt7758 = class527_sub38.readUnsignedShort() * 2126333313;
		else if (i == 46)
			anInt7734 = class527_sub38.method16466(-2011539174) * -2059671437;
		else if (i == 47)
			anInt7735 = class527_sub38.method16466(-1940183262) * -464159755;
		else if (i == 48)
			anInt7736 = class527_sub38.method16466(-1891795182) * -615696941;
		else if (49 == i)
			anInt7737 = class527_sub38.method16466(-1967876154) * -1411917185;
		else if (50 == i)
			anInt7754 = class527_sub38.method16466(-1663015368) * -49412669;
		else if (51 == i)
			anInt7739 = class527_sub38.method16466(-1729343893) * 2043306321;
		else if (52 == i) {
			int i_4_ = class527_sub38.readUnsignedByte();
			anIntArray7730 = new int[i_4_];
			anIntArray7718 = new int[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				anIntArray7730[i_5_] = class527_sub38.method16466(-2108667454);
				int i_6_ = class527_sub38.readUnsignedByte();
				anIntArray7718[i_5_] = i_6_;
				anInt7719 += i_6_ * -2090171859;
			}
		} else if (53 == i)
			aBool7717 = false;
		else if (i == 54) {
			anInt7742 = (class527_sub38.readUnsignedByte() << 6) * 1767241835;
			anInt7757 = (class527_sub38.readUnsignedByte() << 6) * 2034143483;
		} else if (i == 55) {
			int i_7_ = class527_sub38.readUnsignedByte();
			if (null == anIntArray7743)
				anIntArray7743 = new int[i_7_ + 1];
			else if (i_7_ >= anIntArray7743.length)
				anIntArray7743 = Arrays.copyOf(anIntArray7743, i_7_ + 1);
			anIntArray7743[i_7_] = class527_sub38.readUnsignedShort();
		} else if (56 == i) {
			int i_8_ = class527_sub38.readUnsignedByte();
			if (anIntArrayArray7745 == null)
				anIntArrayArray7745 = new int[i_8_ + 1][];
			else if (i_8_ >= anIntArrayArray7745.length)
				anIntArrayArray7745 = (int[][]) Arrays.copyOf(anIntArrayArray7745, 1 + i_8_);
			anIntArrayArray7745[i_8_] = new int[3];
			for (int i_9_ = 0; i_9_ < 3; i_9_++)
				anIntArrayArray7745[i_8_][i_9_] = class527_sub38.readShort();
		}
	}

	Class587(int i) {
		anIntArray7730 = null;
		anIntArray7718 = null;
		anInt7719 = 0;
		anInt7720 = -1913305385;
		anInt7741 = 1530259901;
		anInt7759 = 515420617;
		anInt7723 = -119461529;
		anInt7724 = -2037060533;
		anInt7716 = -280896517;
		anInt7755 = -780444359;
		anInt7727 = 998393921;
		anInt7728 = 883769299;
		anInt7729 = 1249813139;
		anInt7721 = 1955999763;
		anInt7731 = -1687931229;
		anInt7732 = -1506434867;
		anInt7733 = 756019441;
		anInt7734 = 2059671437;
		anInt7735 = 464159755;
		anInt7736 = 615696941;
		anInt7737 = 1411917185;
		anInt7754 = 49412669;
		anInt7739 = -2043306321;
		anInt7740 = 0;
		anInt7738 = 0;
		anInt7742 = 0;
		anInt7757 = 0;
		anInt7726 = 0;
		anInt7750 = 0;
		anInt7725 = 0;
		anInt7722 = 0;
		anInt7753 = 0;
		anInt7751 = 0;
		anInt7747 = 0;
		anInt7756 = 0;
		anInt7749 = -781923975;
		anInt7758 = -2126333313;
		aBool7717 = true;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_10_ = class527_sub38.readUnsignedByte();
			if (i_10_ == 0)
				break;
			method9789(class527_sub38, i_10_, (byte) 0);
		}
	}

	public int[] method9785() {
		Class14 class14 = new Class14(16);
		Class46.method1236(1266908769 * anInt7752, class14, (byte) 3);
		if (anIntArray7730 != null) {
			int[] is = anIntArray7730;
			for (int i = 0; i < is.length; i++) {
				int i_11_ = is[i];
				Class46.method1236(i_11_, class14, (byte) 3);
			}
		}
		Class46.method1236(-1847397607 * anInt7720, class14, (byte) 3);
		Class46.method1236(1628333675 * anInt7741, class14, (byte) 3);
		Class46.method1236(581945223 * anInt7759, class14, (byte) 3);
		Class46.method1236(anInt7723 * -685957719, class14, (byte) 3);
		Class46.method1236(2112324253 * anInt7724, class14, (byte) 3);
		Class46.method1236(anInt7716 * 1404635341, class14, (byte) 3);
		Class46.method1236(298811127 * anInt7755, class14, (byte) 3);
		Class46.method1236(-1566427073 * anInt7727, class14, (byte) 3);
		Class46.method1236(anInt7728 * 1429573541, class14, (byte) 3);
		Class46.method1236(anInt7729 * -1620298651, class14, (byte) 3);
		Class46.method1236(-1585256987 * anInt7721, class14, (byte) 3);
		Class46.method1236(anInt7731 * 755159797, class14, (byte) 3);
		Class46.method1236(anInt7732 * -2115193861, class14, (byte) 3);
		Class46.method1236(-553713681 * anInt7733, class14, (byte) 3);
		Class46.method1236(anInt7734 * 451214523, class14, (byte) 3);
		Class46.method1236(anInt7735 * 723982429, class14, (byte) 3);
		Class46.method1236(anInt7736 * -161879461, class14, (byte) 3);
		Class46.method1236(anInt7737 * -2062948993, class14, (byte) 3);
		Class46.method1236(anInt7754 * -1462562069, class14, (byte) 3);
		Class46.method1236(225544113 * anInt7739, class14, (byte) 3);
		int[] is = new int[class14.method711(-1184567619)];
		int i = 0;
		Iterator iterator = class14.iterator();
		while (iterator.hasNext()) {
			Class527 class527 = (Class527) iterator.next();
			is[i++] = (int) (class527.aLong7106 * -8168620736534281759L);
		}
		return is;
	}

	public void method86(int i) {
		/* empty */
	}

	public int method9786(int i) {
		if (-1 != anInt7752 * 1266908769)
			return anInt7752 * 1266908769;
		if (anIntArray7730 != null) {
			int i_12_ = (int) (Math.random() * (double) (-102294107 * anInt7719));
			int i_13_;
			for (i_13_ = 0; i_12_ >= anIntArray7718[i_13_]; i_13_++)
				i_12_ -= anIntArray7718[i_13_];
			return anIntArray7730[i_13_];
		}
		return -1;
	}

	public boolean method9787(int i, int i_14_) {
		if (-1 == i)
			return false;
		if (i == 1266908769 * anInt7752)
			return true;
		if (anIntArray7730 != null) {
			for (int i_15_ = 0; i_15_ < anIntArray7730.length; i_15_++) {
				if (anIntArray7730[i_15_] == i)
					return true;
			}
		}
		return false;
	}

	public Class432[] method9788(byte i) {
		if (null != aClass432Array7746)
			return aClass432Array7746;
		if (null == anIntArrayArray7744)
			return null;
		aClass432Array7746 = new Class432[anIntArrayArray7744.length];
		for (int i_16_ = 0; i_16_ < anIntArrayArray7744.length; i_16_++) {
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = 0;
			if (anIntArrayArray7744[i_16_] != null) {
				i_17_ = anIntArrayArray7744[i_16_][0];
				i_18_ = anIntArrayArray7744[i_16_][1];
				i_19_ = anIntArrayArray7744[i_16_][2];
				i_20_ = anIntArrayArray7744[i_16_][3] << 3;
				i_21_ = anIntArrayArray7744[i_16_][4] << 3;
				i_22_ = anIntArrayArray7744[i_16_][5] << 3;
			}
			if (i_17_ != 0 || 0 != i_18_ || 0 != i_19_ || i_20_ != 0 || 0 != i_21_ || 0 != i_22_) {
				Class432 class432 = aClass432Array7746[i_16_] = new Class432();
				if (i_22_ != 0)
					class432.method6936(0.0F, 0.0F, 1.0F, Class428.method6863(i_22_));
				if (i_20_ != 0)
					class432.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(i_20_));
				if (i_21_ != 0)
					class432.method6936(0.0F, 1.0F, 0.0F, Class428.method6863(i_21_));
				class432.method6896((float) i_17_, (float) i_18_, (float) i_19_);
			}
		}
		return aClass432Array7746;
	}

	void method9789(RSByteBuffer class527_sub38, int i, byte i_23_) {
		if (1 == i) {
			anInt7752 = class527_sub38.method16466(-2033140245) * -965106271;
			anInt7759 = class527_sub38.method16466(-1940149231) * -515420617;
		} else if (i == 2)
			anInt7721 = class527_sub38.method16466(-2019818194) * -1955999763;
		else if (i == 3)
			anInt7731 = class527_sub38.method16466(-2017483857) * 1687931229;
		else if (i == 4)
			anInt7732 = class527_sub38.method16466(-1740315426) * 1506434867;
		else if (5 == i)
			anInt7733 = class527_sub38.method16466(-1664532546) * -756019441;
		else if (6 == i)
			anInt7755 = class527_sub38.method16466(-2075890925) * 780444359;
		else if (7 == i)
			anInt7727 = class527_sub38.method16466(-1618102761) * -998393921;
		else if (i == 8)
			anInt7728 = class527_sub38.method16466(-1931340228) * -883769299;
		else if (9 == i)
			anInt7729 = class527_sub38.method16466(-1965668904) * -1249813139;
		else if (26 == i) {
			anInt7740 = ((short) (class527_sub38.readUnsignedByte() * 4) * 1806423541);
			anInt7738 = ((short) (class527_sub38.readUnsignedByte() * 4) * -1920740649);
		} else if (i == 27) {
			int i_24_ = class527_sub38.readUnsignedByte();
			if (anIntArrayArray7744 == null)
				anIntArrayArray7744 = new int[1 + i_24_][];
			else if (i_24_ >= anIntArrayArray7744.length)
				anIntArrayArray7744 = (int[][]) Arrays.copyOf(anIntArrayArray7744, i_24_ + 1);
			anIntArrayArray7744[i_24_] = new int[6];
			for (int i_25_ = 0; i_25_ < 6; i_25_++)
				anIntArrayArray7744[i_24_][i_25_] = class527_sub38.readShort();
		} else if (28 == i) {
			int i_26_ = class527_sub38.readUnsignedByte();
			anIntArray7748 = new int[i_26_];
			for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
				anIntArray7748[i_27_] = class527_sub38.readUnsignedByte();
				if (anIntArray7748[i_27_] == 255)
					anIntArray7748[i_27_] = -1;
			}
		} else if (29 == i)
			anInt7726 = class527_sub38.readUnsignedByte() * -362064149;
		else if (30 == i)
			anInt7750 = class527_sub38.readUnsignedShort() * 1828694323;
		else if (31 == i)
			anInt7725 = class527_sub38.readUnsignedByte() * -1506375525;
		else if (32 == i)
			anInt7722 = class527_sub38.readUnsignedShort() * -636216129;
		else if (33 == i)
			anInt7753 = class527_sub38.readShort() * -207413783;
		else if (34 == i)
			anInt7751 = class527_sub38.readUnsignedByte() * -740038347;
		else if (35 == i)
			anInt7747 = class527_sub38.readUnsignedShort() * -1079949653;
		else if (36 == i)
			anInt7756 = class527_sub38.readShort() * -1597074123;
		else if (i == 37)
			anInt7749 = class527_sub38.readUnsignedByte() * 781923975;
		else if (i == 38)
			anInt7720 = class527_sub38.method16466(-2028276264) * 1913305385;
		else if (39 == i)
			anInt7741 = class527_sub38.method16466(-2118147461) * -1530259901;
		else if (i == 40)
			anInt7723 = class527_sub38.method16466(-1958986775) * 119461529;
		else if (41 == i)
			anInt7724 = class527_sub38.method16466(-1759996691) * 2037060533;
		else if (42 == i)
			anInt7716 = class527_sub38.method16466(-1997111053) * 280896517;
		else if (43 == i)
			class527_sub38.readUnsignedShort();
		else if (i == 44)
			class527_sub38.readUnsignedShort();
		else if (i == 45)
			anInt7758 = class527_sub38.readUnsignedShort() * 2126333313;
		else if (i == 46)
			anInt7734 = class527_sub38.method16466(-1654332873) * -2059671437;
		else if (i == 47)
			anInt7735 = class527_sub38.method16466(-1658395665) * -464159755;
		else if (i == 48)
			anInt7736 = class527_sub38.method16466(-2086768435) * -615696941;
		else if (49 == i)
			anInt7737 = class527_sub38.method16466(-1803523017) * -1411917185;
		else if (50 == i)
			anInt7754 = class527_sub38.method16466(-1700532256) * -49412669;
		else if (51 == i)
			anInt7739 = class527_sub38.method16466(-1862149452) * 2043306321;
		else if (52 == i) {
			int i_28_ = class527_sub38.readUnsignedByte();
			anIntArray7730 = new int[i_28_];
			anIntArray7718 = new int[i_28_];
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				anIntArray7730[i_29_] = class527_sub38.method16466(-1691850867);
				int i_30_ = class527_sub38.readUnsignedByte();
				anIntArray7718[i_29_] = i_30_;
				anInt7719 += i_30_ * -2090171859;
			}
		} else if (53 == i)
			aBool7717 = false;
		else if (i == 54) {
			anInt7742 = (class527_sub38.readUnsignedByte() << 6) * 1767241835;
			anInt7757 = (class527_sub38.readUnsignedByte() << 6) * 2034143483;
		} else if (i == 55) {
			int i_31_ = class527_sub38.readUnsignedByte();
			if (null == anIntArray7743)
				anIntArray7743 = new int[i_31_ + 1];
			else if (i_31_ >= anIntArray7743.length)
				anIntArray7743 = Arrays.copyOf(anIntArray7743, i_31_ + 1);
			anIntArray7743[i_31_] = class527_sub38.readUnsignedShort();
		} else if (56 == i) {
			int i_32_ = class527_sub38.readUnsignedByte();
			if (anIntArrayArray7745 == null)
				anIntArrayArray7745 = new int[i_32_ + 1][];
			else if (i_32_ >= anIntArrayArray7745.length)
				anIntArrayArray7745 = (int[][]) Arrays.copyOf(anIntArrayArray7745, 1 + i_32_);
			anIntArrayArray7745[i_32_] = new int[3];
			for (int i_33_ = 0; i_33_ < 3; i_33_++)
				anIntArrayArray7745[i_32_][i_33_] = class527_sub38.readShort();
		}
	}

	public int[] method9790(byte i) {
		Class14 class14 = new Class14(16);
		Class46.method1236(1266908769 * anInt7752, class14, (byte) 3);
		if (anIntArray7730 != null) {
			int[] is = anIntArray7730;
			for (int i_34_ = 0; i_34_ < is.length; i_34_++) {
				int i_35_ = is[i_34_];
				Class46.method1236(i_35_, class14, (byte) 3);
			}
		}
		Class46.method1236(-1847397607 * anInt7720, class14, (byte) 3);
		Class46.method1236(1628333675 * anInt7741, class14, (byte) 3);
		Class46.method1236(581945223 * anInt7759, class14, (byte) 3);
		Class46.method1236(anInt7723 * -685957719, class14, (byte) 3);
		Class46.method1236(2112324253 * anInt7724, class14, (byte) 3);
		Class46.method1236(anInt7716 * 1404635341, class14, (byte) 3);
		Class46.method1236(298811127 * anInt7755, class14, (byte) 3);
		Class46.method1236(-1566427073 * anInt7727, class14, (byte) 3);
		Class46.method1236(anInt7728 * 1429573541, class14, (byte) 3);
		Class46.method1236(anInt7729 * -1620298651, class14, (byte) 3);
		Class46.method1236(-1585256987 * anInt7721, class14, (byte) 3);
		Class46.method1236(anInt7731 * 755159797, class14, (byte) 3);
		Class46.method1236(anInt7732 * -2115193861, class14, (byte) 3);
		Class46.method1236(-553713681 * anInt7733, class14, (byte) 3);
		Class46.method1236(anInt7734 * 451214523, class14, (byte) 3);
		Class46.method1236(anInt7735 * 723982429, class14, (byte) 3);
		Class46.method1236(anInt7736 * -161879461, class14, (byte) 3);
		Class46.method1236(anInt7737 * -2062948993, class14, (byte) 3);
		Class46.method1236(anInt7754 * -1462562069, class14, (byte) 3);
		Class46.method1236(225544113 * anInt7739, class14, (byte) 3);
		int[] is = new int[class14.method711(-1467245401)];
		int i_36_ = 0;
		Iterator iterator = class14.iterator();
		while (iterator.hasNext()) {
			Class527 class527 = (Class527) iterator.next();
			is[i_36_++] = (int) (class527.aLong7106 * -8168620736534281759L);
		}
		return is;
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method9789(class527_sub38, i, (byte) 0);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method9789(class527_sub38, i, (byte) 0);
		}
	}

	public void method85() {
		/* empty */
	}

	public boolean method9791(int i) {
		if (-1 == i)
			return false;
		if (i == 1266908769 * anInt7752)
			return true;
		if (anIntArray7730 != null) {
			for (int i_37_ = 0; i_37_ < anIntArray7730.length; i_37_++) {
				if (anIntArray7730[i_37_] == i)
					return true;
			}
		}
		return false;
	}

	public void method60(int i) {
		/* empty */
	}

	void method9792(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			anInt7752 = class527_sub38.method16466(-2138529419) * -965106271;
			anInt7759 = class527_sub38.method16466(-1614404428) * -515420617;
		} else if (i == 2)
			anInt7721 = class527_sub38.method16466(-1713339280) * -1955999763;
		else if (i == 3)
			anInt7731 = class527_sub38.method16466(-1798714807) * 1687931229;
		else if (i == 4)
			anInt7732 = class527_sub38.method16466(-2137907768) * 1506434867;
		else if (5 == i)
			anInt7733 = class527_sub38.method16466(-2077513097) * -756019441;
		else if (6 == i)
			anInt7755 = class527_sub38.method16466(-1643261179) * 780444359;
		else if (7 == i)
			anInt7727 = class527_sub38.method16466(-2074250930) * -998393921;
		else if (i == 8)
			anInt7728 = class527_sub38.method16466(-1821265488) * -883769299;
		else if (9 == i)
			anInt7729 = class527_sub38.method16466(-1880796223) * -1249813139;
		else if (26 == i) {
			anInt7740 = ((short) (class527_sub38.readUnsignedByte() * 4) * 1806423541);
			anInt7738 = ((short) (class527_sub38.readUnsignedByte() * 4) * -1920740649);
		} else if (i == 27) {
			int i_38_ = class527_sub38.readUnsignedByte();
			if (anIntArrayArray7744 == null)
				anIntArrayArray7744 = new int[1 + i_38_][];
			else if (i_38_ >= anIntArrayArray7744.length)
				anIntArrayArray7744 = (int[][]) Arrays.copyOf(anIntArrayArray7744, i_38_ + 1);
			anIntArrayArray7744[i_38_] = new int[6];
			for (int i_39_ = 0; i_39_ < 6; i_39_++)
				anIntArrayArray7744[i_38_][i_39_] = class527_sub38.readShort();
		} else if (28 == i) {
			int i_40_ = class527_sub38.readUnsignedByte();
			anIntArray7748 = new int[i_40_];
			for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
				anIntArray7748[i_41_] = class527_sub38.readUnsignedByte();
				if (anIntArray7748[i_41_] == 255)
					anIntArray7748[i_41_] = -1;
			}
		} else if (29 == i)
			anInt7726 = class527_sub38.readUnsignedByte() * -362064149;
		else if (30 == i)
			anInt7750 = class527_sub38.readUnsignedShort() * 1828694323;
		else if (31 == i)
			anInt7725 = class527_sub38.readUnsignedByte() * -1506375525;
		else if (32 == i)
			anInt7722 = class527_sub38.readUnsignedShort() * -636216129;
		else if (33 == i)
			anInt7753 = class527_sub38.readShort() * -207413783;
		else if (34 == i)
			anInt7751 = class527_sub38.readUnsignedByte() * -740038347;
		else if (35 == i)
			anInt7747 = class527_sub38.readUnsignedShort() * -1079949653;
		else if (36 == i)
			anInt7756 = class527_sub38.readShort() * -1597074123;
		else if (i == 37)
			anInt7749 = class527_sub38.readUnsignedByte() * 781923975;
		else if (i == 38)
			anInt7720 = class527_sub38.method16466(-1761262572) * 1913305385;
		else if (39 == i)
			anInt7741 = class527_sub38.method16466(-2139779294) * -1530259901;
		else if (i == 40)
			anInt7723 = class527_sub38.method16466(-2046455685) * 119461529;
		else if (41 == i)
			anInt7724 = class527_sub38.method16466(-1620673462) * 2037060533;
		else if (42 == i)
			anInt7716 = class527_sub38.method16466(-1621024692) * 280896517;
		else if (43 == i)
			class527_sub38.readUnsignedShort();
		else if (i == 44)
			class527_sub38.readUnsignedShort();
		else if (i == 45)
			anInt7758 = class527_sub38.readUnsignedShort() * 2126333313;
		else if (i == 46)
			anInt7734 = class527_sub38.method16466(-2030677807) * -2059671437;
		else if (i == 47)
			anInt7735 = class527_sub38.method16466(-1697353392) * -464159755;
		else if (i == 48)
			anInt7736 = class527_sub38.method16466(-1929179529) * -615696941;
		else if (49 == i)
			anInt7737 = class527_sub38.method16466(-1748357810) * -1411917185;
		else if (50 == i)
			anInt7754 = class527_sub38.method16466(-1896600027) * -49412669;
		else if (51 == i)
			anInt7739 = class527_sub38.method16466(-1928364021) * 2043306321;
		else if (52 == i) {
			int i_42_ = class527_sub38.readUnsignedByte();
			anIntArray7730 = new int[i_42_];
			anIntArray7718 = new int[i_42_];
			for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
				anIntArray7730[i_43_] = class527_sub38.method16466(-1993072016);
				int i_44_ = class527_sub38.readUnsignedByte();
				anIntArray7718[i_43_] = i_44_;
				anInt7719 += i_44_ * -2090171859;
			}
		} else if (53 == i)
			aBool7717 = false;
		else if (i == 54) {
			anInt7742 = (class527_sub38.readUnsignedByte() << 6) * 1767241835;
			anInt7757 = (class527_sub38.readUnsignedByte() << 6) * 2034143483;
		} else if (i == 55) {
			int i_45_ = class527_sub38.readUnsignedByte();
			if (null == anIntArray7743)
				anIntArray7743 = new int[i_45_ + 1];
			else if (i_45_ >= anIntArray7743.length)
				anIntArray7743 = Arrays.copyOf(anIntArray7743, i_45_ + 1);
			anIntArray7743[i_45_] = class527_sub38.readUnsignedShort();
		} else if (56 == i) {
			int i_46_ = class527_sub38.readUnsignedByte();
			if (anIntArrayArray7745 == null)
				anIntArrayArray7745 = new int[i_46_ + 1][];
			else if (i_46_ >= anIntArrayArray7745.length)
				anIntArrayArray7745 = (int[][]) Arrays.copyOf(anIntArrayArray7745, 1 + i_46_);
			anIntArrayArray7745[i_46_] = new int[3];
			for (int i_47_ = 0; i_47_ < 3; i_47_++)
				anIntArrayArray7745[i_46_][i_47_] = class527_sub38.readShort();
		}
	}

	public Class432[] method9793() {
		if (null != aClass432Array7746)
			return aClass432Array7746;
		if (null == anIntArrayArray7744)
			return null;
		aClass432Array7746 = new Class432[anIntArrayArray7744.length];
		for (int i = 0; i < anIntArrayArray7744.length; i++) {
			int i_48_ = 0;
			int i_49_ = 0;
			int i_50_ = 0;
			int i_51_ = 0;
			int i_52_ = 0;
			int i_53_ = 0;
			if (anIntArrayArray7744[i] != null) {
				i_48_ = anIntArrayArray7744[i][0];
				i_49_ = anIntArrayArray7744[i][1];
				i_50_ = anIntArrayArray7744[i][2];
				i_51_ = anIntArrayArray7744[i][3] << 3;
				i_52_ = anIntArrayArray7744[i][4] << 3;
				i_53_ = anIntArrayArray7744[i][5] << 3;
			}
			if (i_48_ != 0 || 0 != i_49_ || 0 != i_50_ || i_51_ != 0 || 0 != i_52_ || 0 != i_53_) {
				Class432 class432 = aClass432Array7746[i] = new Class432();
				if (i_53_ != 0)
					class432.method6936(0.0F, 0.0F, 1.0F, Class428.method6863(i_53_));
				if (i_51_ != 0)
					class432.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(i_51_));
				if (i_52_ != 0)
					class432.method6936(0.0F, 1.0F, 0.0F, Class428.method6863(i_52_));
				class432.method6896((float) i_48_, (float) i_49_, (float) i_50_);
			}
		}
		return aClass432Array7746;
	}

	public int method9794() {
		if (-1 != anInt7752 * 1266908769)
			return anInt7752 * 1266908769;
		if (anIntArray7730 != null) {
			int i = (int) (Math.random() * (double) (-102294107 * anInt7719));
			int i_54_;
			for (i_54_ = 0; i >= anIntArray7718[i_54_]; i_54_++)
				i -= anIntArray7718[i_54_];
			return anIntArray7730[i_54_];
		}
		return -1;
	}

	public int method9795() {
		if (-1 != anInt7752 * 1266908769)
			return anInt7752 * 1266908769;
		if (anIntArray7730 != null) {
			int i = (int) (Math.random() * (double) (-102294107 * anInt7719));
			int i_55_;
			for (i_55_ = 0; i >= anIntArray7718[i_55_]; i_55_++)
				i -= anIntArray7718[i_55_];
			return anIntArray7730[i_55_];
		}
		return -1;
	}

	public int method9796() {
		if (-1 != anInt7752 * 1266908769)
			return anInt7752 * 1266908769;
		if (anIntArray7730 != null) {
			int i = (int) (Math.random() * (double) (-102294107 * anInt7719));
			int i_56_;
			for (i_56_ = 0; i >= anIntArray7718[i_56_]; i_56_++)
				i -= anIntArray7718[i_56_];
			return anIntArray7730[i_56_];
		}
		return -1;
	}

	public boolean method9797(int i) {
		if (-1 == i)
			return false;
		if (i == 1266908769 * anInt7752)
			return true;
		if (anIntArray7730 != null) {
			for (int i_57_ = 0; i_57_ < anIntArray7730.length; i_57_++) {
				if (anIntArray7730[i_57_] == i)
					return true;
			}
		}
		return false;
	}

	static final void method9798(int i, Class14 class14) {
		if (i != -1 && class14.method709((long) i) == null)
			class14.method714(new Class527(), (long) i);
	}

	public void method16(int i, int i_58_) {
		/* empty */
	}

	Class587() {
		anIntArray7730 = null;
		anIntArray7718 = null;
		anInt7719 = 0;
		anInt7720 = -1913305385;
		anInt7741 = 1530259901;
		anInt7759 = 515420617;
		anInt7723 = -119461529;
		anInt7724 = -2037060533;
		anInt7716 = -280896517;
		anInt7755 = -780444359;
		anInt7727 = 998393921;
		anInt7728 = 883769299;
		anInt7729 = 1249813139;
		anInt7721 = 1955999763;
		anInt7731 = -1687931229;
		anInt7732 = -1506434867;
		anInt7733 = 756019441;
		anInt7734 = 2059671437;
		anInt7735 = 464159755;
		anInt7736 = 615696941;
		anInt7737 = 1411917185;
		anInt7754 = 49412669;
		anInt7739 = -2043306321;
		anInt7740 = 0;
		anInt7738 = 0;
		anInt7742 = 0;
		anInt7757 = 0;
		anInt7726 = 0;
		anInt7750 = 0;
		anInt7725 = 0;
		anInt7722 = 0;
		anInt7753 = 0;
		anInt7751 = 0;
		anInt7747 = 0;
		anInt7756 = 0;
		anInt7749 = -781923975;
		anInt7758 = -2126333313;
		aBool7717 = true;
	}

	public int[] method9799() {
		Class14 class14 = new Class14(16);
		Class46.method1236(1266908769 * anInt7752, class14, (byte) 3);
		if (anIntArray7730 != null) {
			int[] is = anIntArray7730;
			for (int i = 0; i < is.length; i++) {
				int i_59_ = is[i];
				Class46.method1236(i_59_, class14, (byte) 3);
			}
		}
		Class46.method1236(-1847397607 * anInt7720, class14, (byte) 3);
		Class46.method1236(1628333675 * anInt7741, class14, (byte) 3);
		Class46.method1236(581945223 * anInt7759, class14, (byte) 3);
		Class46.method1236(anInt7723 * -685957719, class14, (byte) 3);
		Class46.method1236(2112324253 * anInt7724, class14, (byte) 3);
		Class46.method1236(anInt7716 * 1404635341, class14, (byte) 3);
		Class46.method1236(298811127 * anInt7755, class14, (byte) 3);
		Class46.method1236(-1566427073 * anInt7727, class14, (byte) 3);
		Class46.method1236(anInt7728 * 1429573541, class14, (byte) 3);
		Class46.method1236(anInt7729 * -1620298651, class14, (byte) 3);
		Class46.method1236(-1585256987 * anInt7721, class14, (byte) 3);
		Class46.method1236(anInt7731 * 755159797, class14, (byte) 3);
		Class46.method1236(anInt7732 * -2115193861, class14, (byte) 3);
		Class46.method1236(-553713681 * anInt7733, class14, (byte) 3);
		Class46.method1236(anInt7734 * 451214523, class14, (byte) 3);
		Class46.method1236(anInt7735 * 723982429, class14, (byte) 3);
		Class46.method1236(anInt7736 * -161879461, class14, (byte) 3);
		Class46.method1236(anInt7737 * -2062948993, class14, (byte) 3);
		Class46.method1236(anInt7754 * -1462562069, class14, (byte) 3);
		Class46.method1236(225544113 * anInt7739, class14, (byte) 3);
		int[] is = new int[class14.method711(-1410952525)];
		int i = 0;
		Iterator iterator = class14.iterator();
		while (iterator.hasNext()) {
			Class527 class527 = (Class527) iterator.next();
			is[i++] = (int) (class527.aLong7106 * -8168620736534281759L);
		}
		return is;
	}

	public void method84() {
		/* empty */
	}

	public int[] method9800() {
		Class14 class14 = new Class14(16);
		Class46.method1236(1266908769 * anInt7752, class14, (byte) 3);
		if (anIntArray7730 != null) {
			int[] is = anIntArray7730;
			for (int i = 0; i < is.length; i++) {
				int i_60_ = is[i];
				Class46.method1236(i_60_, class14, (byte) 3);
			}
		}
		Class46.method1236(-1847397607 * anInt7720, class14, (byte) 3);
		Class46.method1236(1628333675 * anInt7741, class14, (byte) 3);
		Class46.method1236(581945223 * anInt7759, class14, (byte) 3);
		Class46.method1236(anInt7723 * -685957719, class14, (byte) 3);
		Class46.method1236(2112324253 * anInt7724, class14, (byte) 3);
		Class46.method1236(anInt7716 * 1404635341, class14, (byte) 3);
		Class46.method1236(298811127 * anInt7755, class14, (byte) 3);
		Class46.method1236(-1566427073 * anInt7727, class14, (byte) 3);
		Class46.method1236(anInt7728 * 1429573541, class14, (byte) 3);
		Class46.method1236(anInt7729 * -1620298651, class14, (byte) 3);
		Class46.method1236(-1585256987 * anInt7721, class14, (byte) 3);
		Class46.method1236(anInt7731 * 755159797, class14, (byte) 3);
		Class46.method1236(anInt7732 * -2115193861, class14, (byte) 3);
		Class46.method1236(-553713681 * anInt7733, class14, (byte) 3);
		Class46.method1236(anInt7734 * 451214523, class14, (byte) 3);
		Class46.method1236(anInt7735 * 723982429, class14, (byte) 3);
		Class46.method1236(anInt7736 * -161879461, class14, (byte) 3);
		Class46.method1236(anInt7737 * -2062948993, class14, (byte) 3);
		Class46.method1236(anInt7754 * -1462562069, class14, (byte) 3);
		Class46.method1236(225544113 * anInt7739, class14, (byte) 3);
		int[] is = new int[class14.method711(-208607003)];
		int i = 0;
		Iterator iterator = class14.iterator();
		while (iterator.hasNext()) {
			Class527 class527 = (Class527) iterator.next();
			is[i++] = (int) (class527.aLong7106 * -8168620736534281759L);
		}
		return is;
	}

	static final void method9801(int i, Class14 class14) {
		if (i != -1 && class14.method709((long) i) == null)
			class14.method714(new Class527(), (long) i);
	}

	static final void method9802(Class665 class665, int i) throws Exception_Sub6 {
		class665.anInt8526 -= 204761682;
		int i_61_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_62_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		Class442 class442 = Class442.method7166((float) i_61_, (float) i_61_, (float) i_61_);
		if (class442.aFloat4918 == -1.0F)
			class442.aFloat4918 = Float.POSITIVE_INFINITY;
		if (class442.aFloat4915 == -1.0F)
			class442.aFloat4915 = Float.POSITIVE_INFINITY;
		if (class442.aFloat4919 == -1.0F)
			class442.aFloat4919 = Float.POSITIVE_INFINITY;
		Class208_Sub10.aClass296_Sub1_9923.method5352(class442, 245838033);
		Class208_Sub10.aClass296_Sub1_9923.method5349((float) i_62_ / 1000.0F, (byte) -97);
		class442.method7141();
	}

	static final void method9803(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		int i_63_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class217.method3970(i_63_, class243, class665, -2100990263);
	}

	static final void method9804(Class665 class665, byte i) {
		client.aBool10996 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1;
		if (client.aBool10996)
			Class698.method14273(1196532562);
	}

	static final void method9805(Class665 class665, int i) {
		class665.anInt8526 -= 614285046;
		Class527_Sub36 class527_sub36 = ((Class527_Sub36) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]));
		if (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -98) != Class309.aClass309_3459)
			throw new RuntimeException();
		((Class696_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5472(494045094)).method17176(class527_sub36.method16385(-155850479), class665.anIntArray8525[1769813785 * class665.anInt8526], class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1], class665.anIntArray8525[class665.anInt8526 * 1769813785 + 2], class665.anIntArray8525[3 + class665.anInt8526 * 1769813785], class665.anIntArray8525[4 + 1769813785 * class665.anInt8526],
				class665.anIntArray8525[1769813785 * class665.anInt8526 + 5], (byte) 31);
	}

	static Class527_Sub15 method9806(int i, int i_64_, int i_65_, int i_66_) {
		Class527_Sub15 class527_sub15 = null;
		if (i_65_ == 0)
			class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4395, client.aClass109_11067.aClass2_1367, (byte) -26);
		if (i_65_ == 1)
			class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4443, client.aClass109_11067.aClass2_1367, (byte) 38);
		Class592 class592 = client.aClass509_11072.method8283((short) 8037);
		class527_sub15.buffer.writeByte128(Class475.method7770(-297859188) ? 1 : 0, -362087053);
		class527_sub15.buffer.writeShortLE2(i_64_ + class592.anInt7799 * -2029646807, (byte) -12);
		class527_sub15.buffer.writeShort(i + class592.anInt7798 * 153371143, 1404835786);
		Class106.anInt1323 = 1689365215 * i;
		Class106.anInt1322 = -1880014929 * i_64_;
		Class106.aBool1317 = false;
		Class563_Sub1.method16313((byte) 0);
		return class527_sub15;
	}

	public static String method9807(int i) {
		return Class23.method828("www", false, -1708114234);
	}

	static final void method9808(Class665 class665, int i) {
		Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class665.aClass640_Sub1_Sub2_Sub1_8522);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -318039309 * class640_sub1_sub2_sub1_sub1.anInt12170;
	}
}
