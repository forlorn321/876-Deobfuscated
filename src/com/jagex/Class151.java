/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public class Class151 {
	int anInt1692;
	Class171_Sub2_Sub2 aClass171_Sub2_Sub2_1693;
	Class171_Sub2_Sub2 aClass171_Sub2_Sub2_1694;
	boolean aBool1695;
	int anInt1696 = 0;
	Class527_Sub8_Sub3 aClass527_Sub8_Sub3_1697;
	int anInt1698;
	Class180_Sub3 aClass180_Sub3_1699;
	boolean aBool1700;
	Class694 aClass694_1701;
	boolean aBool1702;
	int anInt1703 = 0;
	Class184 aClass184_1704;
	Class171_Sub2_Sub2 aClass171_Sub2_Sub2_1705;
	Class118_Sub3[] aClass118_Sub3Array1706;
	Class527_Sub8_Sub3 aClass527_Sub8_Sub3_1707;
	Class118_Sub3 aClass118_Sub3_1708;
	boolean aBool1709;
	boolean aBool1710;
	int anInt1711;
	boolean aBool1712;

	boolean method2495(int i, int i_0_, int i_1_, int i_2_) {
		if (aClass171_Sub2_Sub2_1705 == null || aClass694_1701.method14088(944005655) || method2515())
			return false;
		if (anInt1698 != i_1_ || anInt1692 != i_2_) {
			anInt1698 = i_1_;
			anInt1692 = i_2_;
			for (Class527 class527 = aClass694_1701.method14081((short) 11371); class527 != aClass694_1701.aClass527_8736; class527 = class527.aClass527_7105)
				((Class527_Sub17) class527).method16168(anInt1698, anInt1692);
			aBool1702 = true;
			aBool1712 = true;
			aBool1709 = true;
		}
		if (method2496()) {
			anInt1696 = i;
			anInt1703 = i_0_;
			aBool1700 = true;
			aClass180_Sub3_1699.method15363(-anInt1696, (anInt1692 + anInt1703 - aClass180_Sub3_1699.method3285(2069502222).method2729()));
			aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1705, (byte) -105);
			aClass171_Sub2_Sub2_1705.method17933(0);
			aClass180_Sub3_1699.method3136(3, 0);
			return true;
		}
		return false;
	}

	boolean method2496() {
		if (aBool1712) {
			if (aClass527_Sub8_Sub3_1697 != null) {
				aClass527_Sub8_Sub3_1697.method129();
				aClass527_Sub8_Sub3_1697 = null;
			}
			if (aClass118_Sub3_1708 != null) {
				aClass118_Sub3_1708.method2064();
				aClass118_Sub3_1708 = null;
			}
		}
		if (aBool1702) {
			if (aClass527_Sub8_Sub3_1707 != null) {
				aClass527_Sub8_Sub3_1707.method129();
				aClass527_Sub8_Sub3_1707 = null;
			}
			if (aClass118_Sub3Array1706[0] != null) {
				aClass118_Sub3Array1706[0].method2064();
				aClass118_Sub3Array1706[0] = null;
			}
			if (aClass118_Sub3Array1706[1] != null) {
				aClass118_Sub3Array1706[1].method2064();
				aClass118_Sub3Array1706[1] = null;
			}
		}
		if (aBool1712) {
			if (aClass171_Sub2_Sub2_1694 != null)
				aClass527_Sub8_Sub3_1697 = new Class527_Sub8_Sub3(aClass180_Sub3_1699, Class157.aClass157_1727, Class184.aClass184_2106, anInt1698, anInt1692, aClass180_Sub3_1699.anInt9746);
			if (aBool1710)
				aClass118_Sub3_1708 = new Class118_Sub3(aClass180_Sub3_1699, 34037, Class157.aClass157_1727, Class184.aClass184_2106, anInt1698, anInt1692);
			else if (aClass527_Sub8_Sub3_1697 == null)
				aClass527_Sub8_Sub3_1697 = new Class527_Sub8_Sub3(aClass180_Sub3_1699, Class157.aClass157_1727, Class184.aClass184_2106, anInt1698, anInt1692);
			aBool1712 = false;
			aBool1709 = true;
			aBool1695 = true;
		}
		if (aBool1702) {
			if (aClass171_Sub2_Sub2_1694 != null)
				aClass527_Sub8_Sub3_1707 = new Class527_Sub8_Sub3(aClass180_Sub3_1699, Class157.aClass157_1723, aClass184_1704, anInt1698, anInt1692, aClass180_Sub3_1699.anInt9746);
			aClass118_Sub3Array1706[0] = new Class118_Sub3(aClass180_Sub3_1699, 34037, Class157.aClass157_1723, aClass184_1704, anInt1698, anInt1692);
			aClass118_Sub3Array1706[1] = anInt1711 > 1 ? new Class118_Sub3(aClass180_Sub3_1699, 34037, Class157.aClass157_1723, aClass184_1704, anInt1698, anInt1692) : null;
			aBool1702 = false;
			aBool1709 = true;
			aBool1695 = true;
		}
		if (aBool1709) {
			if (aClass171_Sub2_Sub2_1694 != null) {
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1693, (byte) -81);
				aClass171_Sub2_Sub2_1693.method15324(null);
				aClass171_Sub2_Sub2_1693.method15321(0, null);
				aClass171_Sub2_Sub2_1693.method15321(1, null);
				aClass171_Sub2_Sub2_1693.method15321(0, aClass118_Sub3Array1706[0].method14459(0));
				aClass171_Sub2_Sub2_1693.method15321(1, (anInt1711 > 1 ? aClass118_Sub3Array1706[1].method14459(0) : null));
				if (aBool1710)
					aClass171_Sub2_Sub2_1693.method15324(aClass118_Sub3_1708.method14471(0));
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1693, -677418425);
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1694, (byte) 0);
				aClass171_Sub2_Sub2_1694.method15324(null);
				aClass171_Sub2_Sub2_1694.method15321(0, null);
				aClass171_Sub2_Sub2_1694.method15321(0, aClass527_Sub8_Sub3_1707);
				aClass171_Sub2_Sub2_1694.method15324(aClass527_Sub8_Sub3_1697);
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1694, -677418425);
			} else {
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1693, (byte) -31);
				aClass171_Sub2_Sub2_1693.method15324(null);
				aClass171_Sub2_Sub2_1693.method15321(0, null);
				aClass171_Sub2_Sub2_1693.method15321(1, null);
				aClass171_Sub2_Sub2_1693.method15321(0, aClass118_Sub3Array1706[0].method14459(0));
				aClass171_Sub2_Sub2_1693.method15321(1, (anInt1711 > 1 ? aClass118_Sub3Array1706[1].method14459(0) : null));
				if (aBool1710)
					aClass171_Sub2_Sub2_1693.method15324(aClass118_Sub3_1708.method14471(0));
				else
					aClass171_Sub2_Sub2_1693.method15324(aClass527_Sub8_Sub3_1697);
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1693, -677418425);
			}
			aBool1709 = false;
			aBool1695 = true;
		}
		if (aBool1695) {
			aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1705, (byte) -25);
			aBool1695 = !aClass171_Sub2_Sub2_1705.method15322();
			aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1705, -677418425);
		}
		return !aBool1695;
	}

	boolean method2497() {
		return aClass171_Sub2_Sub2_1705 != null;
	}

	boolean method2498(Class527_Sub17 class527_sub17) {
		if (aClass171_Sub2_Sub2_1705 != null) {
			if (class527_sub17.method16183() || class527_sub17.method16191()) {
				aClass694_1701.method14147(class527_sub17, 31743009);
				method2505();
				if (class527_sub17.method16172() >= 0 && method2496()) {
					if (anInt1698 != -1 && anInt1692 != -1)
						class527_sub17.method16168(anInt1698, anInt1692);
					class527_sub17.aBool10473 = true;
					return true;
				}
			}
			method2504(class527_sub17);
		}
		return false;
	}

	void method2499(int i, int i_3_) {
		if (aBool1700) {
			if (aClass171_Sub2_Sub2_1694 != null) {
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1694, -677418425);
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1693, (byte) -113);
				aClass171_Sub2_Sub2_1693.method17933(0);
				aClass171_Sub2_Sub2_1694.method15330(0, 0, anInt1698, anInt1692, 0, 0, true, aBool1710);
			}
			aClass180_Sub3_1699.method15429();
			aClass180_Sub3_1699.method15525(0);
			aClass180_Sub3_1699.method15402(1);
			aClass180_Sub3_1699.method3131();
			int i_4_ = 0;
			int i_5_ = 1;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			Object object = null;
			for (Class527_Sub17 class527_sub17 = ((Class527_Sub17) aClass694_1701.method14081((short) 5593)); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
				if (!class527_sub17.method16165())
					i_7_++;
			}
			Class527_Sub17[] class527_sub17s = new Class527_Sub17[i_7_];
			i_7_ = 0;
			for (Class527_Sub17 class527_sub17 = ((Class527_Sub17) aClass694_1701.method14081((short) 5545)); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
				if (!class527_sub17.method16165())
					class527_sub17s[i_7_++] = class527_sub17;
			}
			while (i_6_ < i_7_) {
				for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
					Class527_Sub17 class527_sub17 = class527_sub17s[i_9_];
					if (class527_sub17.method16172() == i_8_) {
						int i_10_ = class527_sub17.method16171();
						for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
							aClass180_Sub3_1699.method15363(0, 0);
							class527_sub17.method16176(i_11_, (aClass118_Sub3Array1706[i_4_]), aClass118_Sub3_1708, i_3_, i);
							if (i_11_ == i_10_ - 1 && i_6_ == i_7_ - 1) {
								aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1693, -677418425);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1692));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1696, anInt1703);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1692 - i_3_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1696, anInt1703 + i_3_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1692 - i_3_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1696 + i, anInt1703 + i_3_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1692));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1696 + i, anInt1703);
								OpenGL.glEnd();
							} else {
								aClass171_Sub2_Sub2_1693.method17933(i_5_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1692);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1692 - i_3_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_3_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1692 - i_3_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_3_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1692);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class527_sub17.method16170(i_11_);
							i_5_ = i_5_ + 1 & 0x1;
							i_4_ = i_4_ + 1 & 0x1;
						}
						i_6_++;
					}
				}
				i_8_++;
			}
			aBool1700 = false;
			object = null;
		}
	}

	boolean method2500() {
		if (aBool1712) {
			if (aClass527_Sub8_Sub3_1697 != null) {
				aClass527_Sub8_Sub3_1697.method129();
				aClass527_Sub8_Sub3_1697 = null;
			}
			if (aClass118_Sub3_1708 != null) {
				aClass118_Sub3_1708.method2064();
				aClass118_Sub3_1708 = null;
			}
		}
		if (aBool1702) {
			if (aClass527_Sub8_Sub3_1707 != null) {
				aClass527_Sub8_Sub3_1707.method129();
				aClass527_Sub8_Sub3_1707 = null;
			}
			if (aClass118_Sub3Array1706[0] != null) {
				aClass118_Sub3Array1706[0].method2064();
				aClass118_Sub3Array1706[0] = null;
			}
			if (aClass118_Sub3Array1706[1] != null) {
				aClass118_Sub3Array1706[1].method2064();
				aClass118_Sub3Array1706[1] = null;
			}
		}
		if (aBool1712) {
			if (aClass171_Sub2_Sub2_1694 != null)
				aClass527_Sub8_Sub3_1697 = new Class527_Sub8_Sub3(aClass180_Sub3_1699, Class157.aClass157_1727, Class184.aClass184_2106, anInt1698, anInt1692, aClass180_Sub3_1699.anInt9746);
			if (aBool1710)
				aClass118_Sub3_1708 = new Class118_Sub3(aClass180_Sub3_1699, 34037, Class157.aClass157_1727, Class184.aClass184_2106, anInt1698, anInt1692);
			else if (aClass527_Sub8_Sub3_1697 == null)
				aClass527_Sub8_Sub3_1697 = new Class527_Sub8_Sub3(aClass180_Sub3_1699, Class157.aClass157_1727, Class184.aClass184_2106, anInt1698, anInt1692);
			aBool1712 = false;
			aBool1709 = true;
			aBool1695 = true;
		}
		if (aBool1702) {
			if (aClass171_Sub2_Sub2_1694 != null)
				aClass527_Sub8_Sub3_1707 = new Class527_Sub8_Sub3(aClass180_Sub3_1699, Class157.aClass157_1723, aClass184_1704, anInt1698, anInt1692, aClass180_Sub3_1699.anInt9746);
			aClass118_Sub3Array1706[0] = new Class118_Sub3(aClass180_Sub3_1699, 34037, Class157.aClass157_1723, aClass184_1704, anInt1698, anInt1692);
			aClass118_Sub3Array1706[1] = anInt1711 > 1 ? new Class118_Sub3(aClass180_Sub3_1699, 34037, Class157.aClass157_1723, aClass184_1704, anInt1698, anInt1692) : null;
			aBool1702 = false;
			aBool1709 = true;
			aBool1695 = true;
		}
		if (aBool1709) {
			if (aClass171_Sub2_Sub2_1694 != null) {
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1693, (byte) -98);
				aClass171_Sub2_Sub2_1693.method15324(null);
				aClass171_Sub2_Sub2_1693.method15321(0, null);
				aClass171_Sub2_Sub2_1693.method15321(1, null);
				aClass171_Sub2_Sub2_1693.method15321(0, aClass118_Sub3Array1706[0].method14459(0));
				aClass171_Sub2_Sub2_1693.method15321(1, (anInt1711 > 1 ? aClass118_Sub3Array1706[1].method14459(0) : null));
				if (aBool1710)
					aClass171_Sub2_Sub2_1693.method15324(aClass118_Sub3_1708.method14471(0));
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1693, -677418425);
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1694, (byte) -54);
				aClass171_Sub2_Sub2_1694.method15324(null);
				aClass171_Sub2_Sub2_1694.method15321(0, null);
				aClass171_Sub2_Sub2_1694.method15321(0, aClass527_Sub8_Sub3_1707);
				aClass171_Sub2_Sub2_1694.method15324(aClass527_Sub8_Sub3_1697);
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1694, -677418425);
			} else {
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1693, (byte) -30);
				aClass171_Sub2_Sub2_1693.method15324(null);
				aClass171_Sub2_Sub2_1693.method15321(0, null);
				aClass171_Sub2_Sub2_1693.method15321(1, null);
				aClass171_Sub2_Sub2_1693.method15321(0, aClass118_Sub3Array1706[0].method14459(0));
				aClass171_Sub2_Sub2_1693.method15321(1, (anInt1711 > 1 ? aClass118_Sub3Array1706[1].method14459(0) : null));
				if (aBool1710)
					aClass171_Sub2_Sub2_1693.method15324(aClass118_Sub3_1708.method14471(0));
				else
					aClass171_Sub2_Sub2_1693.method15324(aClass527_Sub8_Sub3_1697);
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1693, -677418425);
			}
			aBool1709 = false;
			aBool1695 = true;
		}
		if (aBool1695) {
			aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1705, (byte) -127);
			aBool1695 = !aClass171_Sub2_Sub2_1705.method15322();
			aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1705, -677418425);
		}
		return !aBool1695;
	}

	boolean method2501(int i, int i_12_, int i_13_, int i_14_) {
		if (aClass171_Sub2_Sub2_1705 == null || aClass694_1701.method14088(1756826890) || method2515())
			return false;
		if (anInt1698 != i_13_ || anInt1692 != i_14_) {
			anInt1698 = i_13_;
			anInt1692 = i_14_;
			for (Class527 class527 = aClass694_1701.method14081((short) 912); class527 != aClass694_1701.aClass527_8736; class527 = class527.aClass527_7105)
				((Class527_Sub17) class527).method16168(anInt1698, anInt1692);
			aBool1702 = true;
			aBool1712 = true;
			aBool1709 = true;
		}
		if (method2496()) {
			anInt1696 = i;
			anInt1703 = i_12_;
			aBool1700 = true;
			aClass180_Sub3_1699.method15363(-anInt1696, (anInt1692 + anInt1703 - aClass180_Sub3_1699.method3285(443887290).method2729()));
			aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1705, (byte) -25);
			aClass171_Sub2_Sub2_1705.method17933(0);
			aClass180_Sub3_1699.method3136(3, 0);
			return true;
		}
		return false;
	}

	void method2502(int i, int i_15_) {
		if (aBool1700) {
			if (aClass171_Sub2_Sub2_1694 != null) {
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1694, -677418425);
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1693, (byte) -121);
				aClass171_Sub2_Sub2_1693.method17933(0);
				aClass171_Sub2_Sub2_1694.method15330(0, 0, anInt1698, anInt1692, 0, 0, true, aBool1710);
			}
			aClass180_Sub3_1699.method15429();
			aClass180_Sub3_1699.method15525(0);
			aClass180_Sub3_1699.method15402(1);
			aClass180_Sub3_1699.method3131();
			int i_16_ = 0;
			int i_17_ = 1;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			Object object = null;
			for (Class527_Sub17 class527_sub17 = ((Class527_Sub17) aClass694_1701.method14081((short) 3780)); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
				if (!class527_sub17.method16165())
					i_19_++;
			}
			Class527_Sub17[] class527_sub17s = new Class527_Sub17[i_19_];
			i_19_ = 0;
			for (Class527_Sub17 class527_sub17 = ((Class527_Sub17) aClass694_1701.method14081((short) -9410)); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
				if (!class527_sub17.method16165())
					class527_sub17s[i_19_++] = class527_sub17;
			}
			while (i_18_ < i_19_) {
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					Class527_Sub17 class527_sub17 = class527_sub17s[i_21_];
					if (class527_sub17.method16172() == i_20_) {
						int i_22_ = class527_sub17.method16171();
						for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
							aClass180_Sub3_1699.method15363(0, 0);
							class527_sub17.method16176(i_23_, (aClass118_Sub3Array1706[i_16_]), aClass118_Sub3_1708, i_15_, i);
							if (i_23_ == i_22_ - 1 && i_18_ == i_19_ - 1) {
								aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1693, -677418425);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1692));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1696, anInt1703);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1692 - i_15_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1696, anInt1703 + i_15_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1692 - i_15_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1696 + i, anInt1703 + i_15_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1692));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1696 + i, anInt1703);
								OpenGL.glEnd();
							} else {
								aClass171_Sub2_Sub2_1693.method17933(i_17_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1692);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1692 - i_15_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_15_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1692 - i_15_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_15_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1692);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class527_sub17.method16170(i_23_);
							i_17_ = i_17_ + 1 & 0x1;
							i_16_ = i_16_ + 1 & 0x1;
						}
						i_18_++;
					}
				}
				i_20_++;
			}
			aBool1700 = false;
			object = null;
		}
	}

	boolean method2503(Class527_Sub17 class527_sub17) {
		if (aClass171_Sub2_Sub2_1705 != null) {
			if (class527_sub17.method16183() || class527_sub17.method16191()) {
				aClass694_1701.method14147(class527_sub17, -477825986);
				method2505();
				if (class527_sub17.method16172() >= 0 && method2496()) {
					if (anInt1698 != -1 && anInt1692 != -1)
						class527_sub17.method16168(anInt1698, anInt1692);
					class527_sub17.aBool10473 = true;
					return true;
				}
			}
			method2504(class527_sub17);
		}
		return false;
	}

	void method2504(Class527_Sub17 class527_sub17) {
		class527_sub17.aBool10473 = false;
		class527_sub17.method16198();
		class527_sub17.method8735(-1889161967);
		method2505();
	}

	void method2505() {
		int i = 0;
		boolean bool = false;
		Class184 class184 = Class184.aClass184_2104;
		for (Class527_Sub17 class527_sub17 = (Class527_Sub17) aClass694_1701.method14081((short) 5870); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
			Class184 class184_24_ = class527_sub17.method16167();
			if (class184_24_.anInt2111 * 408933829 > class184.anInt2111 * 408933829)
				class184 = class184_24_;
			bool |= class527_sub17.method16173();
			i += class527_sub17.method16171();
		}
		if (class184 != aClass184_1704) {
			aClass184_1704 = class184;
			aBool1702 = true;
		}
		int i_25_ = anInt1711 > 2 ? 2 : anInt1711;
		int i_26_ = i > 2 ? 2 : i;
		if (i_25_ != i_26_) {
			aBool1702 = true;
			aBool1709 = true;
		}
		if (bool != aBool1710) {
			aBool1710 = bool;
			aBool1712 = true;
		}
		anInt1711 = i;
	}

	boolean method2506() {
		return aClass171_Sub2_Sub2_1705 != null;
	}

	boolean method2507() {
		return aBool1700;
	}

	Class151(Class180_Sub3 class180_sub3) {
		anInt1698 = 1;
		anInt1692 = 1;
		aClass694_1701 = new Class694();
		aBool1702 = true;
		aBool1712 = true;
		aBool1709 = true;
		aBool1695 = true;
		aClass118_Sub3Array1706 = new Class118_Sub3[2];
		aBool1710 = false;
		anInt1711 = 0;
		aClass184_1704 = Class184.aClass184_2104;
		aClass180_Sub3_1699 = class180_sub3;
		if (aClass180_Sub3_1699.aBool9818 && aClass180_Sub3_1699.aBool9829) {
			aClass171_Sub2_Sub2_1705 = aClass171_Sub2_Sub2_1693 = new Class171_Sub2_Sub2(aClass180_Sub3_1699);
			if (aClass180_Sub3_1699.anInt9746 > 1 && aClass180_Sub3_1699.aBool9659 && aClass180_Sub3_1699.aBool9820)
				aClass171_Sub2_Sub2_1705 = aClass171_Sub2_Sub2_1694 = new Class171_Sub2_Sub2(aClass180_Sub3_1699);
		}
	}

	boolean method2508() {
		for (Class527_Sub17 class527_sub17 = (Class527_Sub17) aClass694_1701.method14081((short) 648); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
			if (!class527_sub17.method16165())
				return false;
		}
		return true;
	}

	boolean method2509() {
		for (Class527_Sub17 class527_sub17 = (Class527_Sub17) aClass694_1701.method14081((short) -3366); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
			if (!class527_sub17.method16165())
				return false;
		}
		return true;
	}

	boolean method2510() {
		for (Class527_Sub17 class527_sub17 = (Class527_Sub17) aClass694_1701.method14081((short) -3463); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
			if (!class527_sub17.method16165())
				return false;
		}
		return true;
	}

	boolean method2511(int i, int i_27_, int i_28_, int i_29_) {
		if (aClass171_Sub2_Sub2_1705 == null || aClass694_1701.method14088(1583136812) || method2515())
			return false;
		if (anInt1698 != i_28_ || anInt1692 != i_29_) {
			anInt1698 = i_28_;
			anInt1692 = i_29_;
			for (Class527 class527 = aClass694_1701.method14081((short) -8005); class527 != aClass694_1701.aClass527_8736; class527 = class527.aClass527_7105)
				((Class527_Sub17) class527).method16168(anInt1698, anInt1692);
			aBool1702 = true;
			aBool1712 = true;
			aBool1709 = true;
		}
		if (method2496()) {
			anInt1696 = i;
			anInt1703 = i_27_;
			aBool1700 = true;
			aClass180_Sub3_1699.method15363(-anInt1696, (anInt1692 + anInt1703 - aClass180_Sub3_1699.method3285(631267394).method2729()));
			aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1705, (byte) -74);
			aClass171_Sub2_Sub2_1705.method17933(0);
			aClass180_Sub3_1699.method3136(3, 0);
			return true;
		}
		return false;
	}

	boolean method2512() {
		return aBool1700;
	}

	boolean method2513(int i, int i_30_, int i_31_, int i_32_) {
		if (aClass171_Sub2_Sub2_1705 == null || aClass694_1701.method14088(-788101440) || method2515())
			return false;
		if (anInt1698 != i_31_ || anInt1692 != i_32_) {
			anInt1698 = i_31_;
			anInt1692 = i_32_;
			for (Class527 class527 = aClass694_1701.method14081((short) -11843); class527 != aClass694_1701.aClass527_8736; class527 = class527.aClass527_7105)
				((Class527_Sub17) class527).method16168(anInt1698, anInt1692);
			aBool1702 = true;
			aBool1712 = true;
			aBool1709 = true;
		}
		if (method2496()) {
			anInt1696 = i;
			anInt1703 = i_30_;
			aBool1700 = true;
			aClass180_Sub3_1699.method15363(-anInt1696, (anInt1692 + anInt1703 - aClass180_Sub3_1699.method3285(1808941115).method2729()));
			aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1705, (byte) -106);
			aClass171_Sub2_Sub2_1705.method17933(0);
			aClass180_Sub3_1699.method3136(3, 0);
			return true;
		}
		return false;
	}

	void method2514() {
		aClass171_Sub2_Sub2_1693 = null;
		aClass171_Sub2_Sub2_1694 = null;
		aClass171_Sub2_Sub2_1705 = null;
		aClass527_Sub8_Sub3_1697 = null;
		aClass118_Sub3_1708 = null;
		aClass118_Sub3Array1706 = null;
		aClass527_Sub8_Sub3_1707 = null;
		if (!aClass694_1701.method14088(2033042395)) {
			for (Class527 class527 = aClass694_1701.method14081((short) 4182); class527 != aClass694_1701.aClass527_8736; class527 = class527.aClass527_7105)
				((Class527_Sub17) class527).method16198();
		}
		anInt1692 = 1;
		anInt1698 = 1;
	}

	boolean method2515() {
		for (Class527_Sub17 class527_sub17 = (Class527_Sub17) aClass694_1701.method14081((short) -11289); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
			if (!class527_sub17.method16165())
				return false;
		}
		return true;
	}

	void method2516(int i, int i_33_) {
		if (aBool1700) {
			if (aClass171_Sub2_Sub2_1694 != null) {
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1694, -677418425);
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1693, (byte) -96);
				aClass171_Sub2_Sub2_1693.method17933(0);
				aClass171_Sub2_Sub2_1694.method15330(0, 0, anInt1698, anInt1692, 0, 0, true, aBool1710);
			}
			aClass180_Sub3_1699.method15429();
			aClass180_Sub3_1699.method15525(0);
			aClass180_Sub3_1699.method15402(1);
			aClass180_Sub3_1699.method3131();
			int i_34_ = 0;
			int i_35_ = 1;
			int i_36_ = 0;
			int i_37_ = 0;
			int i_38_ = 0;
			Object object = null;
			for (Class527_Sub17 class527_sub17 = ((Class527_Sub17) aClass694_1701.method14081((short) -18178)); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
				if (!class527_sub17.method16165())
					i_37_++;
			}
			Class527_Sub17[] class527_sub17s = new Class527_Sub17[i_37_];
			i_37_ = 0;
			for (Class527_Sub17 class527_sub17 = ((Class527_Sub17) aClass694_1701.method14081((short) 3172)); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
				if (!class527_sub17.method16165())
					class527_sub17s[i_37_++] = class527_sub17;
			}
			while (i_36_ < i_37_) {
				for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
					Class527_Sub17 class527_sub17 = class527_sub17s[i_39_];
					if (class527_sub17.method16172() == i_38_) {
						int i_40_ = class527_sub17.method16171();
						for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
							aClass180_Sub3_1699.method15363(0, 0);
							class527_sub17.method16176(i_41_, (aClass118_Sub3Array1706[i_34_]), aClass118_Sub3_1708, i_33_, i);
							if (i_41_ == i_40_ - 1 && i_36_ == i_37_ - 1) {
								aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1693, -677418425);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1692));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1696, anInt1703);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1692 - i_33_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1696, anInt1703 + i_33_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1692 - i_33_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1696 + i, anInt1703 + i_33_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1692));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1696 + i, anInt1703);
								OpenGL.glEnd();
							} else {
								aClass171_Sub2_Sub2_1693.method17933(i_35_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1692);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1692 - i_33_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_33_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1692 - i_33_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_33_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1692);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class527_sub17.method16170(i_41_);
							i_35_ = i_35_ + 1 & 0x1;
							i_34_ = i_34_ + 1 & 0x1;
						}
						i_36_++;
					}
				}
				i_38_++;
			}
			aBool1700 = false;
			object = null;
		}
	}

	void method2517(int i, int i_42_) {
		if (aBool1700) {
			if (aClass171_Sub2_Sub2_1694 != null) {
				aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1694, -677418425);
				aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1693, (byte) -76);
				aClass171_Sub2_Sub2_1693.method17933(0);
				aClass171_Sub2_Sub2_1694.method15330(0, 0, anInt1698, anInt1692, 0, 0, true, aBool1710);
			}
			aClass180_Sub3_1699.method15429();
			aClass180_Sub3_1699.method15525(0);
			aClass180_Sub3_1699.method15402(1);
			aClass180_Sub3_1699.method3131();
			int i_43_ = 0;
			int i_44_ = 1;
			int i_45_ = 0;
			int i_46_ = 0;
			int i_47_ = 0;
			Object object = null;
			for (Class527_Sub17 class527_sub17 = ((Class527_Sub17) aClass694_1701.method14081((short) -5769)); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
				if (!class527_sub17.method16165())
					i_46_++;
			}
			Class527_Sub17[] class527_sub17s = new Class527_Sub17[i_46_];
			i_46_ = 0;
			for (Class527_Sub17 class527_sub17 = ((Class527_Sub17) aClass694_1701.method14081((short) 29806)); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
				if (!class527_sub17.method16165())
					class527_sub17s[i_46_++] = class527_sub17;
			}
			while (i_45_ < i_46_) {
				for (int i_48_ = 0; i_48_ < i_46_; i_48_++) {
					Class527_Sub17 class527_sub17 = class527_sub17s[i_48_];
					if (class527_sub17.method16172() == i_47_) {
						int i_49_ = class527_sub17.method16171();
						for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
							aClass180_Sub3_1699.method15363(0, 0);
							class527_sub17.method16176(i_50_, (aClass118_Sub3Array1706[i_43_]), aClass118_Sub3_1708, i_42_, i);
							if (i_50_ == i_49_ - 1 && i_45_ == i_46_ - 1) {
								aClass180_Sub3_1699.method3107(aClass171_Sub2_Sub2_1693, -677418425);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + anInt1692));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(anInt1696, anInt1703);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1692 - i_42_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(anInt1696, anInt1703 + i_42_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (anInt1692 - i_42_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(anInt1696 + i, anInt1703 + i_42_);
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + anInt1692));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(anInt1696 + i, anInt1703);
								OpenGL.glEnd();
							} else {
								aClass171_Sub2_Sub2_1693.method17933(i_44_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) anInt1692);
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) (anInt1692 - i_42_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_42_);
								OpenGL.glTexCoord2f((float) i, (float) (anInt1692 - i_42_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_42_);
								OpenGL.glTexCoord2f((float) i, (float) anInt1692);
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class527_sub17.method16170(i_50_);
							i_44_ = i_44_ + 1 & 0x1;
							i_43_ = i_43_ + 1 & 0x1;
						}
						i_45_++;
					}
				}
				i_47_++;
			}
			aBool1700 = false;
			object = null;
		}
	}

	boolean method2518(Class527_Sub17 class527_sub17) {
		if (aClass171_Sub2_Sub2_1705 != null) {
			if (class527_sub17.method16183() || class527_sub17.method16191()) {
				aClass694_1701.method14147(class527_sub17, -1149495909);
				method2505();
				if (class527_sub17.method16172() >= 0 && method2496()) {
					if (anInt1698 != -1 && anInt1692 != -1)
						class527_sub17.method16168(anInt1698, anInt1692);
					class527_sub17.aBool10473 = true;
					return true;
				}
			}
			method2504(class527_sub17);
		}
		return false;
	}

	boolean method2519(int i, int i_51_, int i_52_, int i_53_) {
		if (aClass171_Sub2_Sub2_1705 == null || aClass694_1701.method14088(-1368252558) || method2515())
			return false;
		if (anInt1698 != i_52_ || anInt1692 != i_53_) {
			anInt1698 = i_52_;
			anInt1692 = i_53_;
			for (Class527 class527 = aClass694_1701.method14081((short) -8230); class527 != aClass694_1701.aClass527_8736; class527 = class527.aClass527_7105)
				((Class527_Sub17) class527).method16168(anInt1698, anInt1692);
			aBool1702 = true;
			aBool1712 = true;
			aBool1709 = true;
		}
		if (method2496()) {
			anInt1696 = i;
			anInt1703 = i_51_;
			aBool1700 = true;
			aClass180_Sub3_1699.method15363(-anInt1696, (anInt1692 + anInt1703 - aClass180_Sub3_1699.method3285(1801936579).method2729()));
			aClass180_Sub3_1699.method3106(aClass171_Sub2_Sub2_1705, (byte) -74);
			aClass171_Sub2_Sub2_1705.method17933(0);
			aClass180_Sub3_1699.method3136(3, 0);
			return true;
		}
		return false;
	}

	void method2520() {
		int i = 0;
		boolean bool = false;
		Class184 class184 = Class184.aClass184_2104;
		for (Class527_Sub17 class527_sub17 = (Class527_Sub17) aClass694_1701.method14081((short) -31864); class527_sub17 != null; class527_sub17 = (Class527_Sub17) aClass694_1701.method14086(-65534)) {
			Class184 class184_54_ = class527_sub17.method16167();
			if (class184_54_.anInt2111 * 408933829 > class184.anInt2111 * 408933829)
				class184 = class184_54_;
			bool |= class527_sub17.method16173();
			i += class527_sub17.method16171();
		}
		if (class184 != aClass184_1704) {
			aClass184_1704 = class184;
			aBool1702 = true;
		}
		int i_55_ = anInt1711 > 2 ? 2 : anInt1711;
		int i_56_ = i > 2 ? 2 : i;
		if (i_55_ != i_56_) {
			aBool1702 = true;
			aBool1709 = true;
		}
		if (bool != aBool1710) {
			aBool1710 = bool;
			aBool1712 = true;
		}
		anInt1711 = i;
	}
}
