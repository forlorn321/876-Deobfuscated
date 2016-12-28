/* Class589 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;
import java.util.Iterator;

public class Class589 implements Interface7, DefinitionI {
	public int anInt7741;
	public int[] anIntArray7742;
	public int[] anIntArray7743;
	int anInt7744;
	public int anInt7745;
	public int anInt7746;
	public int anInt7747;
	public int anInt7748;
	public int[][] anIntArrayArray7749;
	public int anInt7750;
	public int anInt7751;
	public int anInt7752;
	public int anInt7753;
	public int anInt7754;
	public int anInt7755;
	public int anInt7756;
	public int anInt7757;
	public int anInt7758;
	public int anInt7759;
	public int[] anIntArray7760;
	public int anInt7761 = -1588511957;
	public int anInt7762;
	public int anInt7763;
	public int anInt7764;
	public int anInt7765;
	public int anInt7766;
	public int anInt7767;
	public int anInt7768;
	public int anInt7769;
	public int anInt7770;
	Class433[] aClass433Array7771;
	public int[] anIntArray7772;
	public int anInt7773;
	public int anInt7774;
	public int[][] anIntArrayArray7775;
	public int anInt7776;
	public int anInt7777;
	public boolean aBool7778;
	public int anInt7779;
	public int anInt7780;
	public int anInt7781;
	public int anInt7782;
	public int anInt7783;
	public int anInt7784;

	public boolean method7086(int i) {
		if (-1 == i)
			return false;
		if (i == 1438930045 * anInt7761)
			return true;
		if (null != anIntArray7742) {
			for (int i_0_ = 0; i_0_ < anIntArray7742.length; i_0_++) {
				if (anIntArray7742[i_0_] == i)
					return true;
			}
		}
		return false;
	}

	Class589(int i) {
		anIntArray7742 = null;
		anIntArray7743 = null;
		anInt7744 = 0;
		anInt7745 = -1657026571;
		anInt7746 = 1928128421;
		anInt7747 = -1405538807;
		anInt7748 = 282665969;
		anInt7753 = -1000787443;
		anInt7750 = 1942751687;
		anInt7751 = -331098607;
		anInt7752 = -1950116995;
		anInt7741 = 824233339;
		anInt7754 = 1871895429;
		anInt7755 = 2139800501;
		anInt7766 = 1240256749;
		anInt7757 = 1820385689;
		anInt7758 = 740960435;
		anInt7759 = 1350811031;
		anInt7769 = 1326028745;
		anInt7756 = -1926126933;
		anInt7762 = 1124999659;
		anInt7763 = 260626947;
		anInt7764 = -2062546653;
		anInt7765 = 0;
		anInt7773 = 0;
		anInt7767 = 0;
		anInt7768 = 0;
		anInt7784 = 0;
		anInt7779 = 0;
		anInt7777 = 0;
		anInt7774 = 0;
		anInt7776 = 0;
		anInt7770 = 0;
		anInt7780 = 0;
		anInt7781 = 0;
		anInt7782 = -140970409;
		anInt7783 = 569739117;
		aBool7778 = true;
	}

	public int[] method7087() {
		Class4 class4 = new Class4(16);
		Class454.method5457(anInt7761 * 1438930045, class4, 16711935);
		if (anIntArray7742 != null) {
			int[] is = anIntArray7742;
			for (int i = 0; i < is.length; i++) {
				int i_1_ = is[i];
				Class454.method5457(i_1_, class4, 16711935);
			}
		}
		Class454.method5457(-1511615581 * anInt7745, class4, 16711935);
		Class454.method5457(anInt7746 * 347363283, class4, 16711935);
		Class454.method5457(anInt7747 * -1313783865, class4, 16711935);
		Class454.method5457(anInt7748 * -2092395793, class4, 16711935);
		Class454.method5457(anInt7753 * 1568969531, class4, 16711935);
		Class454.method5457(anInt7750 * -204531703, class4, 16711935);
		Class454.method5457(-1967774449 * anInt7751, class4, 16711935);
		Class454.method5457(1554006571 * anInt7752, class4, 16711935);
		Class454.method5457(-1062537651 * anInt7741, class4, 16711935);
		Class454.method5457(-461301069 * anInt7754, class4, 16711935);
		Class454.method5457(anInt7755 * 1910615395, class4, 16711935);
		Class454.method5457(183104283 * anInt7766, class4, 16711935);
		Class454.method5457(anInt7757 * -1930617513, class4, 16711935);
		Class454.method5457(592656773 * anInt7758, class4, 16711935);
		Class454.method5457(362638809 * anInt7759, class4, 16711935);
		Class454.method5457(anInt7769 * -188887673, class4, 16711935);
		Class454.method5457(-1073825795 * anInt7756, class4, 16711935);
		Class454.method5457(anInt7762 * -2038431427, class4, 16711935);
		Class454.method5457(-628236459 * anInt7763, class4, 16711935);
		Class454.method5457(-185233035 * anInt7764, class4, 16711935);
		int[] is = new int[class4.method569(2085518031)];
		int i = 0;
		Iterator iterator = class4.iterator();
		while (iterator.hasNext()) {
			Class536 class536 = (Class536) iterator.next();
			is[i++] = (int) (-6909195213925454795L * class536.aLong7133);
		}
		return is;
	}

	void method7088(RSByteBuffer class536_sub33, int i, int i_2_) {
		if (1 == i) {
			anInt7761 = class536_sub33.readBigSmart() * 1588511957;
			anInt7747 = class536_sub33.readBigSmart() * 1405538807;
		} else if (i == 2)
			anInt7755 = class536_sub33.readBigSmart() * -2139800501;
		else if (3 == i)
			anInt7766 = class536_sub33.readBigSmart() * -1240256749;
		else if (i == 4)
			anInt7757 = class536_sub33.readBigSmart() * -1820385689;
		else if (5 == i)
			anInt7758 = class536_sub33.readBigSmart() * -740960435;
		else if (i == 6)
			anInt7751 = class536_sub33.readBigSmart() * 331098607;
		else if (i == 7)
			anInt7752 = class536_sub33.readBigSmart() * 1950116995;
		else if (i == 8)
			anInt7741 = class536_sub33.readBigSmart() * -824233339;
		else if (9 == i)
			anInt7754 = class536_sub33.readBigSmart() * -1871895429;
		else if (26 == i) {
			anInt7765 = ((short) (class536_sub33.readUnsignedByte() * 4) * -758473575);
			anInt7773 = ((short) (class536_sub33.readUnsignedByte() * 4) * -1691462167);
		} else if (i == 27) {
			int i_3_ = class536_sub33.readUnsignedByte();
			if (anIntArrayArray7749 == null)
				anIntArrayArray7749 = new int[1 + i_3_][];
			else if (i_3_ >= anIntArrayArray7749.length)
				anIntArrayArray7749 = (int[][]) Arrays.copyOf(anIntArrayArray7749, i_3_ + 1);
			anIntArrayArray7749[i_3_] = new int[6];
			for (int i_4_ = 0; i_4_ < 6; i_4_++)
				anIntArrayArray7749[i_3_][i_4_] = class536_sub33.readShort();
		} else if (28 == i) {
			int i_5_ = class536_sub33.readUnsignedByte();
			anIntArray7760 = new int[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				anIntArray7760[i_6_] = class536_sub33.readUnsignedByte();
				if (anIntArray7760[i_6_] == 255)
					anIntArray7760[i_6_] = -1;
			}
		} else if (i == 29)
			anInt7784 = class536_sub33.readUnsignedByte() * -1436382825;
		else if (30 == i)
			anInt7779 = class536_sub33.readUnsignedShort() * -1303237615;
		else if (31 == i)
			anInt7777 = class536_sub33.readUnsignedByte() * -1505741571;
		else if (i == 32)
			anInt7774 = class536_sub33.readUnsignedShort() * -1601731675;
		else if (i == 33)
			anInt7776 = class536_sub33.readShort() * -1115275197;
		else if (34 == i)
			anInt7770 = class536_sub33.readUnsignedByte() * -242454385;
		else if (i == 35)
			anInt7780 = class536_sub33.readUnsignedShort() * 441458675;
		else if (36 == i)
			anInt7781 = class536_sub33.readShort() * -53443997;
		else if (i == 37)
			anInt7782 = class536_sub33.readUnsignedByte() * 140970409;
		else if (38 == i)
			anInt7745 = class536_sub33.readBigSmart() * 1657026571;
		else if (i == 39)
			anInt7746 = class536_sub33.readBigSmart() * -1928128421;
		else if (i == 40)
			anInt7748 = class536_sub33.readBigSmart() * -282665969;
		else if (i == 41)
			anInt7753 = class536_sub33.readBigSmart() * 1000787443;
		else if (42 == i)
			anInt7750 = class536_sub33.readBigSmart() * -1942751687;
		else if (43 == i)
			class536_sub33.readUnsignedShort();
		else if (i == 44)
			class536_sub33.readUnsignedShort();
		else if (i == 45)
			anInt7783 = class536_sub33.readUnsignedShort() * -569739117;
		else if (46 == i)
			anInt7759 = class536_sub33.readBigSmart() * -1350811031;
		else if (i == 47)
			anInt7769 = class536_sub33.readBigSmart() * -1326028745;
		else if (48 == i)
			anInt7756 = class536_sub33.readBigSmart() * 1926126933;
		else if (i == 49)
			anInt7762 = class536_sub33.readBigSmart() * -1124999659;
		else if (50 == i)
			anInt7763 = class536_sub33.readBigSmart() * -260626947;
		else if (51 == i)
			anInt7764 = class536_sub33.readBigSmart() * 2062546653;
		else if (i == 52) {
			int i_7_ = class536_sub33.readUnsignedByte();
			anIntArray7742 = new int[i_7_];
			anIntArray7743 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				anIntArray7742[i_8_] = class536_sub33.readBigSmart();
				int i_9_ = class536_sub33.readUnsignedByte();
				anIntArray7743[i_8_] = i_9_;
				anInt7744 += 2115455283 * i_9_;
			}
		} else if (53 == i)
			aBool7778 = false;
		else if (54 == i) {
			anInt7767 = (class536_sub33.readUnsignedByte() << 6) * -347752559;
			anInt7768 = (class536_sub33.readUnsignedByte() << 6) * 1011724005;
		} else if (i == 55) {
			int i_10_ = class536_sub33.readUnsignedByte();
			if (null == anIntArray7772)
				anIntArray7772 = new int[1 + i_10_];
			else if (i_10_ >= anIntArray7772.length)
				anIntArray7772 = Arrays.copyOf(anIntArray7772, i_10_ + 1);
			anIntArray7772[i_10_] = class536_sub33.readUnsignedShort();
		} else if (i == 56) {
			int i_11_ = class536_sub33.readUnsignedByte();
			if (null == anIntArrayArray7775)
				anIntArrayArray7775 = new int[i_11_ + 1][];
			else if (i_11_ >= anIntArrayArray7775.length)
				anIntArrayArray7775 = (int[][]) Arrays.copyOf(anIntArrayArray7775, i_11_ + 1);
			anIntArrayArray7775[i_11_] = new int[3];
			for (int i_12_ = 0; i_12_ < 3; i_12_++)
				anIntArrayArray7775[i_11_][i_12_] = class536_sub33.readShort();
		}
	}

	Class589() {
		anIntArray7742 = null;
		anIntArray7743 = null;
		anInt7744 = 0;
		anInt7745 = -1657026571;
		anInt7746 = 1928128421;
		anInt7747 = -1405538807;
		anInt7748 = 282665969;
		anInt7753 = -1000787443;
		anInt7750 = 1942751687;
		anInt7751 = -331098607;
		anInt7752 = -1950116995;
		anInt7741 = 824233339;
		anInt7754 = 1871895429;
		anInt7755 = 2139800501;
		anInt7766 = 1240256749;
		anInt7757 = 1820385689;
		anInt7758 = 740960435;
		anInt7759 = 1350811031;
		anInt7769 = 1326028745;
		anInt7756 = -1926126933;
		anInt7762 = 1124999659;
		anInt7763 = 260626947;
		anInt7764 = -2062546653;
		anInt7765 = 0;
		anInt7773 = 0;
		anInt7767 = 0;
		anInt7768 = 0;
		anInt7784 = 0;
		anInt7779 = 0;
		anInt7777 = 0;
		anInt7774 = 0;
		anInt7776 = 0;
		anInt7770 = 0;
		anInt7780 = 0;
		anInt7781 = 0;
		anInt7782 = -140970409;
		anInt7783 = 569739117;
		aBool7778 = true;
	}

	public boolean method7089(int i) {
		if (-1 == i)
			return false;
		if (i == 1438930045 * anInt7761)
			return true;
		if (null != anIntArray7742) {
			for (int i_13_ = 0; i_13_ < anIntArray7742.length; i_13_++) {
				if (anIntArray7742[i_13_] == i)
					return true;
			}
		}
		return false;
	}

	public boolean method7090(int i, int i_14_) {
		if (-1 == i)
			return false;
		if (i == 1438930045 * anInt7761)
			return true;
		if (null != anIntArray7742) {
			for (int i_15_ = 0; i_15_ < anIntArray7742.length; i_15_++) {
				if (anIntArray7742[i_15_] == i)
					return true;
			}
		}
		return false;
	}

	public Class433[] method7091(int i) {
		if (aClass433Array7771 != null)
			return aClass433Array7771;
		if (anIntArrayArray7749 == null)
			return null;
		aClass433Array7771 = new Class433[anIntArrayArray7749.length];
		for (int i_16_ = 0; i_16_ < anIntArrayArray7749.length; i_16_++) {
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = 0;
			if (null != anIntArrayArray7749[i_16_]) {
				i_17_ = anIntArrayArray7749[i_16_][0];
				i_18_ = anIntArrayArray7749[i_16_][1];
				i_19_ = anIntArrayArray7749[i_16_][2];
				i_20_ = anIntArrayArray7749[i_16_][3] << 3;
				i_21_ = anIntArrayArray7749[i_16_][4] << 3;
				i_22_ = anIntArrayArray7749[i_16_][5] << 3;
			}
			if (i_17_ != 0 || 0 != i_18_ || 0 != i_19_ || i_20_ != 0 || i_21_ != 0 || i_22_ != 0) {
				Class433 class433 = aClass433Array7771[i_16_] = new Class433();
				if (i_22_ != 0)
					class433.method5214(0.0F, 0.0F, 1.0F, Class447.method5400(i_22_));
				if (i_20_ != 0)
					class433.method5214(1.0F, 0.0F, 0.0F, Class447.method5400(i_20_));
				if (i_21_ != 0)
					class433.method5214(0.0F, 1.0F, 0.0F, Class447.method5400(i_21_));
				class433.method5200((float) i_17_, (float) i_18_, (float) i_19_);
			}
		}
		return aClass433Array7771;
	}

	public int[] method7092(int i) {
		Class4 class4 = new Class4(16);
		Class454.method5457(anInt7761 * 1438930045, class4, 16711935);
		if (anIntArray7742 != null) {
			int[] is = anIntArray7742;
			for (int i_23_ = 0; i_23_ < is.length; i_23_++) {
				int i_24_ = is[i_23_];
				Class454.method5457(i_24_, class4, 16711935);
			}
		}
		Class454.method5457(-1511615581 * anInt7745, class4, 16711935);
		Class454.method5457(anInt7746 * 347363283, class4, 16711935);
		Class454.method5457(anInt7747 * -1313783865, class4, 16711935);
		Class454.method5457(anInt7748 * -2092395793, class4, 16711935);
		Class454.method5457(anInt7753 * 1568969531, class4, 16711935);
		Class454.method5457(anInt7750 * -204531703, class4, 16711935);
		Class454.method5457(-1967774449 * anInt7751, class4, 16711935);
		Class454.method5457(1554006571 * anInt7752, class4, 16711935);
		Class454.method5457(-1062537651 * anInt7741, class4, 16711935);
		Class454.method5457(-461301069 * anInt7754, class4, 16711935);
		Class454.method5457(anInt7755 * 1910615395, class4, 16711935);
		Class454.method5457(183104283 * anInt7766, class4, 16711935);
		Class454.method5457(anInt7757 * -1930617513, class4, 16711935);
		Class454.method5457(592656773 * anInt7758, class4, 16711935);
		Class454.method5457(362638809 * anInt7759, class4, 16711935);
		Class454.method5457(anInt7769 * -188887673, class4, 16711935);
		Class454.method5457(-1073825795 * anInt7756, class4, 16711935);
		Class454.method5457(anInt7762 * -2038431427, class4, 16711935);
		Class454.method5457(-628236459 * anInt7763, class4, 16711935);
		Class454.method5457(-185233035 * anInt7764, class4, 16711935);
		int[] is = new int[class4.method569(1165147722)];
		int i_25_ = 0;
		Iterator iterator = class4.iterator();
		while (iterator.hasNext()) {
			Class536 class536 = (Class536) iterator.next();
			is[i_25_++] = (int) (-6909195213925454795L * class536.aLong7133);
		}
		return is;
	}

	public void method59(int i, int i_26_) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			method7088(class536_sub33, i, -1296551347);
		}
	}

	public void method77() {
		/* empty */
	}

	public void method57(int i) {
		/* empty */
	}

	public void method58(int i) {
		/* empty */
	}

	public void method56(int i) {
		/* empty */
	}

	void method7093(RSByteBuffer class536_sub33, int i) {
		if (1 == i) {
			anInt7761 = class536_sub33.readBigSmart() * 1588511957;
			anInt7747 = class536_sub33.readBigSmart() * 1405538807;
		} else if (i == 2)
			anInt7755 = class536_sub33.readBigSmart() * -2139800501;
		else if (3 == i)
			anInt7766 = class536_sub33.readBigSmart() * -1240256749;
		else if (i == 4)
			anInt7757 = class536_sub33.readBigSmart() * -1820385689;
		else if (5 == i)
			anInt7758 = class536_sub33.readBigSmart() * -740960435;
		else if (i == 6)
			anInt7751 = class536_sub33.readBigSmart() * 331098607;
		else if (i == 7)
			anInt7752 = class536_sub33.readBigSmart() * 1950116995;
		else if (i == 8)
			anInt7741 = class536_sub33.readBigSmart() * -824233339;
		else if (9 == i)
			anInt7754 = class536_sub33.readBigSmart() * -1871895429;
		else if (26 == i) {
			anInt7765 = ((short) (class536_sub33.readUnsignedByte() * 4) * -758473575);
			anInt7773 = ((short) (class536_sub33.readUnsignedByte() * 4) * -1691462167);
		} else if (i == 27) {
			int i_27_ = class536_sub33.readUnsignedByte();
			if (anIntArrayArray7749 == null)
				anIntArrayArray7749 = new int[1 + i_27_][];
			else if (i_27_ >= anIntArrayArray7749.length)
				anIntArrayArray7749 = (int[][]) Arrays.copyOf(anIntArrayArray7749, i_27_ + 1);
			anIntArrayArray7749[i_27_] = new int[6];
			for (int i_28_ = 0; i_28_ < 6; i_28_++)
				anIntArrayArray7749[i_27_][i_28_] = class536_sub33.readShort();
		} else if (28 == i) {
			int i_29_ = class536_sub33.readUnsignedByte();
			anIntArray7760 = new int[i_29_];
			for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
				anIntArray7760[i_30_] = class536_sub33.readUnsignedByte();
				if (anIntArray7760[i_30_] == 255)
					anIntArray7760[i_30_] = -1;
			}
		} else if (i == 29)
			anInt7784 = class536_sub33.readUnsignedByte() * -1436382825;
		else if (30 == i)
			anInt7779 = class536_sub33.readUnsignedShort() * -1303237615;
		else if (31 == i)
			anInt7777 = class536_sub33.readUnsignedByte() * -1505741571;
		else if (i == 32)
			anInt7774 = class536_sub33.readUnsignedShort() * -1601731675;
		else if (i == 33)
			anInt7776 = class536_sub33.readShort() * -1115275197;
		else if (34 == i)
			anInt7770 = class536_sub33.readUnsignedByte() * -242454385;
		else if (i == 35)
			anInt7780 = class536_sub33.readUnsignedShort() * 441458675;
		else if (36 == i)
			anInt7781 = class536_sub33.readShort() * -53443997;
		else if (i == 37)
			anInt7782 = class536_sub33.readUnsignedByte() * 140970409;
		else if (38 == i)
			anInt7745 = class536_sub33.readBigSmart() * 1657026571;
		else if (i == 39)
			anInt7746 = class536_sub33.readBigSmart() * -1928128421;
		else if (i == 40)
			anInt7748 = class536_sub33.readBigSmart() * -282665969;
		else if (i == 41)
			anInt7753 = class536_sub33.readBigSmart() * 1000787443;
		else if (42 == i)
			anInt7750 = class536_sub33.readBigSmart() * -1942751687;
		else if (43 == i)
			class536_sub33.readUnsignedShort();
		else if (i == 44)
			class536_sub33.readUnsignedShort();
		else if (i == 45)
			anInt7783 = class536_sub33.readUnsignedShort() * -569739117;
		else if (46 == i)
			anInt7759 = class536_sub33.readBigSmart() * -1350811031;
		else if (i == 47)
			anInt7769 = class536_sub33.readBigSmart() * -1326028745;
		else if (48 == i)
			anInt7756 = class536_sub33.readBigSmart() * 1926126933;
		else if (i == 49)
			anInt7762 = class536_sub33.readBigSmart() * -1124999659;
		else if (50 == i)
			anInt7763 = class536_sub33.readBigSmart() * -260626947;
		else if (51 == i)
			anInt7764 = class536_sub33.readBigSmart() * 2062546653;
		else if (i == 52) {
			int i_31_ = class536_sub33.readUnsignedByte();
			anIntArray7742 = new int[i_31_];
			anIntArray7743 = new int[i_31_];
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
				anIntArray7742[i_32_] = class536_sub33.readBigSmart();
				int i_33_ = class536_sub33.readUnsignedByte();
				anIntArray7743[i_32_] = i_33_;
				anInt7744 += 2115455283 * i_33_;
			}
		} else if (53 == i)
			aBool7778 = false;
		else if (54 == i) {
			anInt7767 = (class536_sub33.readUnsignedByte() << 6) * -347752559;
			anInt7768 = (class536_sub33.readUnsignedByte() << 6) * 1011724005;
		} else if (i == 55) {
			int i_34_ = class536_sub33.readUnsignedByte();
			if (null == anIntArray7772)
				anIntArray7772 = new int[1 + i_34_];
			else if (i_34_ >= anIntArray7772.length)
				anIntArray7772 = Arrays.copyOf(anIntArray7772, i_34_ + 1);
			anIntArray7772[i_34_] = class536_sub33.readUnsignedShort();
		} else if (i == 56) {
			int i_35_ = class536_sub33.readUnsignedByte();
			if (null == anIntArrayArray7775)
				anIntArrayArray7775 = new int[i_35_ + 1][];
			else if (i_35_ >= anIntArrayArray7775.length)
				anIntArrayArray7775 = (int[][]) Arrays.copyOf(anIntArrayArray7775, i_35_ + 1);
			anIntArrayArray7775[i_35_] = new int[3];
			for (int i_36_ = 0; i_36_ < 3; i_36_++)
				anIntArrayArray7775[i_35_][i_36_] = class536_sub33.readShort();
		}
	}

	public boolean method7094(int i) {
		if (-1 == i)
			return false;
		if (i == 1438930045 * anInt7761)
			return true;
		if (null != anIntArray7742) {
			for (int i_37_ = 0; i_37_ < anIntArray7742.length; i_37_++) {
				if (anIntArray7742[i_37_] == i)
					return true;
			}
		}
		return false;
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_38_ = class536_sub33.readUnsignedByte();
			if (0 == i_38_)
				break;
			method7088(class536_sub33, i_38_, 449462677);
		}
	}

	public void method75(byte i) {
		/* empty */
	}

	public int method7095(byte i) {
		if (-1 != anInt7761 * 1438930045)
			return 1438930045 * anInt7761;
		if (anIntArray7742 != null) {
			int i_39_ = (int) (Math.random() * (double) (996530683 * anInt7744));
			int i_40_;
			for (i_40_ = 0; i_39_ >= anIntArray7743[i_40_]; i_40_++)
				i_39_ -= anIntArray7743[i_40_];
			return anIntArray7742[i_40_];
		}
		return -1;
	}

	static final void method7096(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class167.method2411(class251, class234, class668, 707956218);
	}

	static final void method7097(Class668 class668, short i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class198.method2873(class251, class234, class668, Class233.aClass233_2371, (byte) 60);
	}

	static final void method7098(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		String string = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801]);
		String string_41_ = ((String) class668.anObjectArray8543[366709801 * class668.anInt8544 + 1]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class309_Sub1.method9190(string, string_41_, (byte) 8);
	}
}
