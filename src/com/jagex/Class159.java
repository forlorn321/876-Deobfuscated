/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class159 {
	int anInt1744;
	Class183_Sub2_Sub3 aClass183_Sub2_Sub3_1745;
	Class183_Sub2_Sub3 aClass183_Sub2_Sub3_1746;
	Class183_Sub2_Sub3 aClass183_Sub2_Sub3_1747;
	boolean aBool1748;
	int anInt1749;
	int anInt1750 = 0;
	boolean aBool1751;
	Class536_Sub18_Sub3 aClass536_Sub18_Sub3_1752;
	Class708 aClass708_1753;
	boolean aBool1754;
	int anInt1755;
	Class167_Sub2 aClass167_Sub2_1756;
	boolean aBool1757;
	Class124_Sub1[] aClass124_Sub1Array1758;
	Class536_Sub18_Sub3 aClass536_Sub18_Sub3_1759;
	Class124_Sub1 aClass124_Sub1_1760;
	boolean aBool1761;
	boolean aBool1762;
	int anInt1763;
	Class171 aClass171_1764;

	boolean method1893() {
		if (aBool1751) {
			if (aClass536_Sub18_Sub3_1752 != null) {
				aClass536_Sub18_Sub3_1752.method131();
				aClass536_Sub18_Sub3_1752 = null;
			}
			if (aClass124_Sub1_1760 != null) {
				aClass124_Sub1_1760.method1613();
				aClass124_Sub1_1760 = null;
			}
		}
		if (aBool1754) {
			if (aClass536_Sub18_Sub3_1759 != null) {
				aClass536_Sub18_Sub3_1759.method131();
				aClass536_Sub18_Sub3_1759 = null;
			}
			if (aClass124_Sub1Array1758[0] != null) {
				aClass124_Sub1Array1758[0].method1613();
				aClass124_Sub1Array1758[0] = null;
			}
			if (aClass124_Sub1Array1758[1] != null) {
				aClass124_Sub1Array1758[1].method1613();
				aClass124_Sub1Array1758[1] = null;
			}
		}
		if (aBool1751) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			if (aBool1762)
				aClass124_Sub1_1760 = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			else if (aClass536_Sub18_Sub3_1752 == null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			aBool1751 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1754) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1759 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			aClass124_Sub1Array1758[0] = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744);
			aClass124_Sub1Array1758[1] = anInt1763 > 1 ? new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744) : null;
			aBool1754 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1761) {
			if (aClass183_Sub2_Sub3_1746 != null) {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1746, -409819235);
				aClass183_Sub2_Sub3_1746.method9037(null);
				aClass183_Sub2_Sub3_1746.method9035(0, null);
				aClass183_Sub2_Sub3_1746.method9035(0, aClass536_Sub18_Sub3_1759);
				aClass183_Sub2_Sub3_1746.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1746, (byte) 1);
			} else {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				else
					aClass183_Sub2_Sub3_1745.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
			}
			aBool1761 = false;
			aBool1757 = true;
		}
		if (aBool1757) {
			aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1747, -409819235);
			aBool1757 = !aClass183_Sub2_Sub3_1747.method9036();
			aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1747, (byte) 1);
		}
		return !aBool1757;
	}

	boolean method1894() {
		return aClass183_Sub2_Sub3_1747 != null;
	}

	boolean method1895() {
		return aBool1748;
	}

	boolean method1896() {
		for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = (Class536_Sub12) aClass708_1753.method8311(1694901930)) {
			if (!class536_sub12.method9442())
				return false;
		}
		return true;
	}

	boolean method1897() {
		if (aBool1751) {
			if (aClass536_Sub18_Sub3_1752 != null) {
				aClass536_Sub18_Sub3_1752.method131();
				aClass536_Sub18_Sub3_1752 = null;
			}
			if (aClass124_Sub1_1760 != null) {
				aClass124_Sub1_1760.method1613();
				aClass124_Sub1_1760 = null;
			}
		}
		if (aBool1754) {
			if (aClass536_Sub18_Sub3_1759 != null) {
				aClass536_Sub18_Sub3_1759.method131();
				aClass536_Sub18_Sub3_1759 = null;
			}
			if (aClass124_Sub1Array1758[0] != null) {
				aClass124_Sub1Array1758[0].method1613();
				aClass124_Sub1Array1758[0] = null;
			}
			if (aClass124_Sub1Array1758[1] != null) {
				aClass124_Sub1Array1758[1].method1613();
				aClass124_Sub1Array1758[1] = null;
			}
		}
		if (aBool1751) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			if (aBool1762)
				aClass124_Sub1_1760 = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			else if (aClass536_Sub18_Sub3_1752 == null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			aBool1751 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1754) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1759 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			aClass124_Sub1Array1758[0] = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744);
			aClass124_Sub1Array1758[1] = anInt1763 > 1 ? new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744) : null;
			aBool1754 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1761) {
			if (aClass183_Sub2_Sub3_1746 != null) {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1746, -409819235);
				aClass183_Sub2_Sub3_1746.method9037(null);
				aClass183_Sub2_Sub3_1746.method9035(0, null);
				aClass183_Sub2_Sub3_1746.method9035(0, aClass536_Sub18_Sub3_1759);
				aClass183_Sub2_Sub3_1746.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1746, (byte) 1);
			} else {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				else
					aClass183_Sub2_Sub3_1745.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
			}
			aBool1761 = false;
			aBool1757 = true;
		}
		if (aBool1757) {
			aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1747, -409819235);
			aBool1757 = !aClass183_Sub2_Sub3_1747.method9036();
			aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1747, (byte) 1);
		}
		return !aBool1757;
	}

	void method1898() {
		aClass183_Sub2_Sub3_1745 = null;
		aClass183_Sub2_Sub3_1746 = null;
		aClass183_Sub2_Sub3_1747 = null;
		aClass536_Sub18_Sub3_1752 = null;
		aClass124_Sub1_1760 = null;
		aClass124_Sub1Array1758 = null;
		aClass536_Sub18_Sub3_1759 = null;
		if (!aClass708_1753.method8313(-1770714554)) {
			for (Class536 class536 = aClass708_1753.method8308(1867269829); class536 != aClass708_1753.aClass536_8826; class536 = class536.aClass536_7132)
				((Class536_Sub12) class536).method9434();
		}
		anInt1744 = 1;
		anInt1755 = 1;
	}

	void method1899(int i, int i_0_) {
		if (aBool1748) {
			if (aClass183_Sub2_Sub3_1746 != null) {
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1746, (byte) 1);
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method10542(0);
				aClass183_Sub2_Sub3_1746.method9040(0, 0, anInt1755, anInt1744, 0, 0, true, aBool1762);
			}
			aClass167_Sub2_1756.method8614();
			aClass167_Sub2_1756.method8567(0);
			aClass167_Sub2_1756.method8557(1);
			aClass167_Sub2_1756.method2051();
			int i_1_ = 0;
			int i_2_ = 1;
			int i_3_ = 0;
			int i_4_ = 0;
			int i_5_ = 0;
			Object object = null;
			for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = ((Class536_Sub12) aClass708_1753.method8311(1161783022))) {
				if (!class536_sub12.method9442())
					i_4_++;
			}
			Class536_Sub12[] class536_sub12s = new Class536_Sub12[i_4_];
			i_4_ = 0;
			for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = ((Class536_Sub12) aClass708_1753.method8311(2144992024))) {
				if (!class536_sub12.method9442())
					class536_sub12s[i_4_++] = class536_sub12;
			}
			while (i_3_ < i_4_) {
				for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
					Class536_Sub12 class536_sub12 = class536_sub12s[i_6_];
					if (class536_sub12.method9438() == i_5_) {
						int i_7_ = class536_sub12.method9440();
						for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
							aClass167_Sub2_1756.method8542(0, 0);
							class536_sub12.method9435(i_8_, (aClass124_Sub1Array1758[i_1_]), aClass124_Sub1_1760, i_0_, i);
							if (i_8_ == i_7_ - 1 && i_3_ == i_4_ - 1) {
								aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1744));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1750, anInt1749);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1744 - i_0_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1750, anInt1749 + i_0_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1744 - i_0_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1750 + i, anInt1749 + i_0_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1744));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1750 + i, anInt1749);
								OpenGL.glEnd();
							} else {
								aClass183_Sub2_Sub3_1745.method10542(i_2_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1744);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1744 - i_0_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_0_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1744 - i_0_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_0_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1744);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class536_sub12.method9436(i_8_);
							i_2_ = i_2_ + 1 & 0x1;
							i_1_ = i_1_ + 1 & 0x1;
						}
						i_3_++;
					}
				}
				i_5_++;
			}
			aBool1748 = false;
			object = null;
		}
	}

	boolean method1900(Class536_Sub12 class536_sub12) {
		if (aClass183_Sub2_Sub3_1747 != null) {
			if (class536_sub12.method9451() || class536_sub12.method9433()) {
				aClass708_1753.method8335(class536_sub12, -522666208);
				method1902();
				if (class536_sub12.method9438() >= 0 && method1897()) {
					if (anInt1755 != -1 && anInt1744 != -1)
						class536_sub12.method9432(anInt1755, anInt1744);
					class536_sub12.aBool10467 = true;
					return true;
				}
			}
			method1901(class536_sub12);
		}
		return false;
	}

	void method1901(Class536_Sub12 class536_sub12) {
		class536_sub12.aBool10467 = false;
		class536_sub12.method9434();
		class536_sub12.method6484(564858870);
		method1902();
	}

	void method1902() {
		int i = 0;
		boolean bool = false;
		Class171 class171 = Class171.aClass171_1905;
		for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = (Class536_Sub12) aClass708_1753.method8311(908325179)) {
			Class171 class171_9_ = class536_sub12.method9437();
			if (class171_9_.anInt1898 * -147747987 > class171.anInt1898 * -147747987)
				class171 = class171_9_;
			bool |= class536_sub12.method9459();
			i += class536_sub12.method9440();
		}
		if (class171 != aClass171_1764) {
			aClass171_1764 = class171;
			aBool1754 = true;
		}
		int i_10_ = anInt1763 > 2 ? 2 : anInt1763;
		int i_11_ = i > 2 ? 2 : i;
		if (i_10_ != i_11_) {
			aBool1754 = true;
			aBool1761 = true;
		}
		if (bool != aBool1762) {
			aBool1762 = bool;
			aBool1751 = true;
		}
		anInt1763 = i;
	}

	void method1903() {
		aClass183_Sub2_Sub3_1745 = null;
		aClass183_Sub2_Sub3_1746 = null;
		aClass183_Sub2_Sub3_1747 = null;
		aClass536_Sub18_Sub3_1752 = null;
		aClass124_Sub1_1760 = null;
		aClass124_Sub1Array1758 = null;
		aClass536_Sub18_Sub3_1759 = null;
		if (!aClass708_1753.method8313(307645643)) {
			for (Class536 class536 = aClass708_1753.method8308(1867269829); class536 != aClass708_1753.aClass536_8826; class536 = class536.aClass536_7132)
				((Class536_Sub12) class536).method9434();
		}
		anInt1744 = 1;
		anInt1755 = 1;
	}

	void method1904() {
		aClass183_Sub2_Sub3_1745 = null;
		aClass183_Sub2_Sub3_1746 = null;
		aClass183_Sub2_Sub3_1747 = null;
		aClass536_Sub18_Sub3_1752 = null;
		aClass124_Sub1_1760 = null;
		aClass124_Sub1Array1758 = null;
		aClass536_Sub18_Sub3_1759 = null;
		if (!aClass708_1753.method8313(-234768222)) {
			for (Class536 class536 = aClass708_1753.method8308(1867269829); class536 != aClass708_1753.aClass536_8826; class536 = class536.aClass536_7132)
				((Class536_Sub12) class536).method9434();
		}
		anInt1744 = 1;
		anInt1755 = 1;
	}

	boolean method1905() {
		return aClass183_Sub2_Sub3_1747 != null;
	}

	boolean method1906() {
		return aBool1748;
	}

	boolean method1907() {
		return aBool1748;
	}

	Class159(Class167_Sub2 class167_sub2) {
		anInt1749 = 0;
		anInt1755 = 1;
		anInt1744 = 1;
		aClass708_1753 = new Class708();
		aBool1754 = true;
		aBool1751 = true;
		aBool1761 = true;
		aBool1757 = true;
		aClass124_Sub1Array1758 = new Class124_Sub1[2];
		aBool1762 = false;
		anInt1763 = 0;
		aClass171_1764 = Class171.aClass171_1905;
		aClass167_Sub2_1756 = class167_sub2;
		if (aClass167_Sub2_1756.aBool9289 && aClass167_Sub2_1756.aBool9300) {
			aClass183_Sub2_Sub3_1747 = aClass183_Sub2_Sub3_1745 = new Class183_Sub2_Sub3(aClass167_Sub2_1756);
			if (aClass167_Sub2_1756.anInt9164 > 1 && aClass167_Sub2_1756.aBool9201 && aClass167_Sub2_1756.aBool9291)
				aClass183_Sub2_Sub3_1747 = aClass183_Sub2_Sub3_1746 = new Class183_Sub2_Sub3(aClass167_Sub2_1756);
		}
	}

	boolean method1908() {
		for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = (Class536_Sub12) aClass708_1753.method8311(1050126369)) {
			if (!class536_sub12.method9442())
				return false;
		}
		return true;
	}

	boolean method1909() {
		for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = (Class536_Sub12) aClass708_1753.method8311(1764214868)) {
			if (!class536_sub12.method9442())
				return false;
		}
		return true;
	}

	boolean method1910() {
		for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = (Class536_Sub12) aClass708_1753.method8311(2022091144)) {
			if (!class536_sub12.method9442())
				return false;
		}
		return true;
	}

	void method1911() {
		aClass183_Sub2_Sub3_1745 = null;
		aClass183_Sub2_Sub3_1746 = null;
		aClass183_Sub2_Sub3_1747 = null;
		aClass536_Sub18_Sub3_1752 = null;
		aClass124_Sub1_1760 = null;
		aClass124_Sub1Array1758 = null;
		aClass536_Sub18_Sub3_1759 = null;
		if (!aClass708_1753.method8313(-724820185)) {
			for (Class536 class536 = aClass708_1753.method8308(1867269829); class536 != aClass708_1753.aClass536_8826; class536 = class536.aClass536_7132)
				((Class536_Sub12) class536).method9434();
		}
		anInt1744 = 1;
		anInt1755 = 1;
	}

	boolean method1912() {
		if (aBool1751) {
			if (aClass536_Sub18_Sub3_1752 != null) {
				aClass536_Sub18_Sub3_1752.method131();
				aClass536_Sub18_Sub3_1752 = null;
			}
			if (aClass124_Sub1_1760 != null) {
				aClass124_Sub1_1760.method1613();
				aClass124_Sub1_1760 = null;
			}
		}
		if (aBool1754) {
			if (aClass536_Sub18_Sub3_1759 != null) {
				aClass536_Sub18_Sub3_1759.method131();
				aClass536_Sub18_Sub3_1759 = null;
			}
			if (aClass124_Sub1Array1758[0] != null) {
				aClass124_Sub1Array1758[0].method1613();
				aClass124_Sub1Array1758[0] = null;
			}
			if (aClass124_Sub1Array1758[1] != null) {
				aClass124_Sub1Array1758[1].method1613();
				aClass124_Sub1Array1758[1] = null;
			}
		}
		if (aBool1751) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			if (aBool1762)
				aClass124_Sub1_1760 = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			else if (aClass536_Sub18_Sub3_1752 == null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			aBool1751 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1754) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1759 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			aClass124_Sub1Array1758[0] = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744);
			aClass124_Sub1Array1758[1] = anInt1763 > 1 ? new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744) : null;
			aBool1754 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1761) {
			if (aClass183_Sub2_Sub3_1746 != null) {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1746, -409819235);
				aClass183_Sub2_Sub3_1746.method9037(null);
				aClass183_Sub2_Sub3_1746.method9035(0, null);
				aClass183_Sub2_Sub3_1746.method9035(0, aClass536_Sub18_Sub3_1759);
				aClass183_Sub2_Sub3_1746.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1746, (byte) 1);
			} else {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				else
					aClass183_Sub2_Sub3_1745.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
			}
			aBool1761 = false;
			aBool1757 = true;
		}
		if (aBool1757) {
			aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1747, -409819235);
			aBool1757 = !aClass183_Sub2_Sub3_1747.method9036();
			aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1747, (byte) 1);
		}
		return !aBool1757;
	}

	boolean method1913() {
		for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = (Class536_Sub12) aClass708_1753.method8311(1128597430)) {
			if (!class536_sub12.method9442())
				return false;
		}
		return true;
	}

	boolean method1914() {
		if (aBool1751) {
			if (aClass536_Sub18_Sub3_1752 != null) {
				aClass536_Sub18_Sub3_1752.method131();
				aClass536_Sub18_Sub3_1752 = null;
			}
			if (aClass124_Sub1_1760 != null) {
				aClass124_Sub1_1760.method1613();
				aClass124_Sub1_1760 = null;
			}
		}
		if (aBool1754) {
			if (aClass536_Sub18_Sub3_1759 != null) {
				aClass536_Sub18_Sub3_1759.method131();
				aClass536_Sub18_Sub3_1759 = null;
			}
			if (aClass124_Sub1Array1758[0] != null) {
				aClass124_Sub1Array1758[0].method1613();
				aClass124_Sub1Array1758[0] = null;
			}
			if (aClass124_Sub1Array1758[1] != null) {
				aClass124_Sub1Array1758[1].method1613();
				aClass124_Sub1Array1758[1] = null;
			}
		}
		if (aBool1751) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			if (aBool1762)
				aClass124_Sub1_1760 = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			else if (aClass536_Sub18_Sub3_1752 == null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			aBool1751 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1754) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1759 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			aClass124_Sub1Array1758[0] = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744);
			aClass124_Sub1Array1758[1] = anInt1763 > 1 ? new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744) : null;
			aBool1754 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1761) {
			if (aClass183_Sub2_Sub3_1746 != null) {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1746, -409819235);
				aClass183_Sub2_Sub3_1746.method9037(null);
				aClass183_Sub2_Sub3_1746.method9035(0, null);
				aClass183_Sub2_Sub3_1746.method9035(0, aClass536_Sub18_Sub3_1759);
				aClass183_Sub2_Sub3_1746.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1746, (byte) 1);
			} else {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				else
					aClass183_Sub2_Sub3_1745.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
			}
			aBool1761 = false;
			aBool1757 = true;
		}
		if (aBool1757) {
			aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1747, -409819235);
			aBool1757 = !aClass183_Sub2_Sub3_1747.method9036();
			aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1747, (byte) 1);
		}
		return !aBool1757;
	}

	boolean method1915() {
		if (aBool1751) {
			if (aClass536_Sub18_Sub3_1752 != null) {
				aClass536_Sub18_Sub3_1752.method131();
				aClass536_Sub18_Sub3_1752 = null;
			}
			if (aClass124_Sub1_1760 != null) {
				aClass124_Sub1_1760.method1613();
				aClass124_Sub1_1760 = null;
			}
		}
		if (aBool1754) {
			if (aClass536_Sub18_Sub3_1759 != null) {
				aClass536_Sub18_Sub3_1759.method131();
				aClass536_Sub18_Sub3_1759 = null;
			}
			if (aClass124_Sub1Array1758[0] != null) {
				aClass124_Sub1Array1758[0].method1613();
				aClass124_Sub1Array1758[0] = null;
			}
			if (aClass124_Sub1Array1758[1] != null) {
				aClass124_Sub1Array1758[1].method1613();
				aClass124_Sub1Array1758[1] = null;
			}
		}
		if (aBool1751) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			if (aBool1762)
				aClass124_Sub1_1760 = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			else if (aClass536_Sub18_Sub3_1752 == null)
				aClass536_Sub18_Sub3_1752 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1726, Class171.aClass171_1895, anInt1755, anInt1744);
			aBool1751 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1754) {
			if (aClass183_Sub2_Sub3_1746 != null)
				aClass536_Sub18_Sub3_1759 = new Class536_Sub18_Sub3(aClass167_Sub2_1756, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744, aClass167_Sub2_1756.anInt9164);
			aClass124_Sub1Array1758[0] = new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744);
			aClass124_Sub1Array1758[1] = anInt1763 > 1 ? new Class124_Sub1(aClass167_Sub2_1756, 34037, Class155.aClass155_1722, aClass171_1764, anInt1755, anInt1744) : null;
			aBool1754 = false;
			aBool1761 = true;
			aBool1757 = true;
		}
		if (aBool1761) {
			if (aClass183_Sub2_Sub3_1746 != null) {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1746, -409819235);
				aClass183_Sub2_Sub3_1746.method9037(null);
				aClass183_Sub2_Sub3_1746.method9035(0, null);
				aClass183_Sub2_Sub3_1746.method9035(0, aClass536_Sub18_Sub3_1759);
				aClass183_Sub2_Sub3_1746.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1746, (byte) 1);
			} else {
				aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1745, -409819235);
				aClass183_Sub2_Sub3_1745.method9037(null);
				aClass183_Sub2_Sub3_1745.method9035(0, null);
				aClass183_Sub2_Sub3_1745.method9035(1, null);
				aClass183_Sub2_Sub3_1745.method9035(0, aClass124_Sub1Array1758[0].method8398(0));
				aClass183_Sub2_Sub3_1745.method9035(1, (anInt1763 > 1 ? aClass124_Sub1Array1758[1].method8398(0) : null));
				if (aBool1762)
					aClass183_Sub2_Sub3_1745.method9037(aClass124_Sub1_1760.method8399(0));
				else
					aClass183_Sub2_Sub3_1745.method9037(aClass536_Sub18_Sub3_1752);
				aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1745, (byte) 1);
			}
			aBool1761 = false;
			aBool1757 = true;
		}
		if (aBool1757) {
			aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1747, -409819235);
			aBool1757 = !aClass183_Sub2_Sub3_1747.method9036();
			aClass167_Sub2_1756.method2029(aClass183_Sub2_Sub3_1747, (byte) 1);
		}
		return !aBool1757;
	}

	boolean method1916() {
		for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = (Class536_Sub12) aClass708_1753.method8311(1911573526)) {
			if (!class536_sub12.method9442())
				return false;
		}
		return true;
	}

	boolean method1917() {
		for (Class536_Sub12 class536_sub12 = (Class536_Sub12) aClass708_1753.method8308(1867269829); class536_sub12 != null; class536_sub12 = (Class536_Sub12) aClass708_1753.method8311(1725847463)) {
			if (!class536_sub12.method9442())
				return false;
		}
		return true;
	}

	boolean method1918(int i, int i_12_, int i_13_, int i_14_) {
		if (aClass183_Sub2_Sub3_1747 == null || aClass708_1753.method8313(-1801516909) || method1896())
			return false;
		if (anInt1755 != i_13_ || anInt1744 != i_14_) {
			anInt1755 = i_13_;
			anInt1744 = i_14_;
			for (Class536 class536 = aClass708_1753.method8308(1867269829); class536 != aClass708_1753.aClass536_8826; class536 = class536.aClass536_7132)
				((Class536_Sub12) class536).method9432(anInt1755, anInt1744);
			aBool1754 = true;
			aBool1751 = true;
			aBool1761 = true;
		}
		if (method1897()) {
			anInt1750 = i;
			anInt1749 = i_12_;
			aBool1748 = true;
			aClass167_Sub2_1756.method8542(-anInt1750, (anInt1744 + anInt1749 - aClass167_Sub2_1756.method2278((byte) -8).method2726()));
			aClass167_Sub2_1756.method2028(aClass183_Sub2_Sub3_1747, -409819235);
			aClass183_Sub2_Sub3_1747.method10542(0);
			aClass167_Sub2_1756.method2000(3, 0);
			return true;
		}
		return false;
	}
}
