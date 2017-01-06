/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class Class426 {
	Class469 aClass469_4800;
	Class459_Sub1[] aClass459_Sub1Array4801;
	Class466 aClass466_4802;
	BigInteger aBigInteger4803;
	BigInteger aBigInteger4804;
	JS5ArchiveRequest aClass536_Sub18_Sub15_Sub2_4805;
	Class536_Sub18_Sub15_Sub3 aClass536_Sub18_Sub15_Sub3_4806;
	Class460 aClass460_4807;
	Class469 aClass469_4808;
	boolean aBool4809 = false;
	Class449 aClass449_4810;

	public boolean method5122(byte i) {
		if (aClass469_4800 != null)
			return true;
		if (aClass536_Sub18_Sub15_Sub2_4805 == null) {
			if (aClass460_4807.method5528((byte) 1))
				return false;
			aClass536_Sub18_Sub15_Sub2_4805 = aClass460_4807.method5522(255, 255, (byte) 0, true, 1099044667);
		}
		if (aClass536_Sub18_Sub15_Sub2_4805.aBool11777)
			return false;
		RSByteBuffer class536_sub33 = new RSByteBuffer(aClass536_Sub18_Sub15_Sub2_4805.method10771(1989491128));
		aClass469_4800 = new Class469(class536_sub33, aBigInteger4803, aBigInteger4804);
		if (aClass459_Sub1Array4801 == null)
			aClass459_Sub1Array4801 = new Class459_Sub1[aClass469_4800.aClass448Array5355.length];
		else {
			for (int i_0_ = 0; i_0_ < aClass459_Sub1Array4801.length; i_0_++) {
				if (aClass459_Sub1Array4801[i_0_] != null) {
					Class448 class448 = aClass469_4800.aClass448Array5355[i_0_];
					aClass459_Sub1Array4801[i_0_].method9237(class448.anInt4923 * 1535951545, class448.aByteArray4922, 1857151345 * class448.anInt4925, class448.anInt4924 * -1573408083, -16711936);
					if (aClass459_Sub1Array4801[i_0_].method9241(1635499627))
						aClass459_Sub1Array4801[i_0_].method9244(false, (byte) 84);
				}
			}
		}
		aBool4809 = false;
		return true;
	}

	public Class459_Sub1 method5123(int i, Class547 class547, Class547 class547_1_, boolean bool, int i_2_) {
		return method5124(i, class547, class547_1_, true, bool, (byte) -48);
	}

	Class459_Sub1 method5124(int i, Class547 class547, Class547 class547_3_, boolean bool, boolean bool_4_, byte i_5_) {
		if (null == aClass469_4800)
			throw new RuntimeException();
		if (i < 0 || i >= aClass459_Sub1Array4801.length)
			throw new RuntimeException();
		if (null != aClass459_Sub1Array4801[i])
			return aClass459_Sub1Array4801[i];
		Class448 class448 = aClass469_4800.aClass448Array5355[i];
		Class459_Sub1 class459_sub1 = new Class459_Sub1(i, class547, class547_3_, aClass460_4807, bool_4_ ? aClass449_4810 : null, aClass466_4802, class448.anInt4923 * 1535951545, class448.aByteArray4922, class448.anInt4925 * 1857151345, bool, class448.anInt4924 * -1573408083);
		aClass459_Sub1Array4801[i] = class459_sub1;
		if (null != aClass469_4808 && bool_4_) {
			Class448 class448_6_ = aClass469_4808.aClass448Array5355[i];
			aClass459_Sub1Array4801[i].method9244((aClass459_Sub1Array4801[i].method9246(1535951545 * class448_6_.anInt4923, class448_6_.aByteArray4922, class448_6_.anInt4925 * 1857151345, class448_6_.anInt4924 * -1573408083, (byte) 120)), (byte) 112);
		}
		return class459_sub1;
	}

	public void method5125(int i) {
		if (aClass459_Sub1Array4801 != null) {
			for (int i_7_ = 0; i_7_ < aClass459_Sub1Array4801.length; i_7_++) {
				if (null != aClass459_Sub1Array4801[i_7_])
					aClass459_Sub1Array4801[i_7_].method9234(-241412179);
			}
			for (int i_8_ = 0; i_8_ < aClass459_Sub1Array4801.length; i_8_++) {
				if (null != aClass459_Sub1Array4801[i_8_])
					aClass459_Sub1Array4801[i_8_].method9248(-331731896);
			}
			if (aClass469_4800 == null)
				method5122((byte) -17);
			else if (null != aClass449_4810 && !aBool4809) {
				if (aClass536_Sub18_Sub15_Sub3_4806 == null)
					aClass536_Sub18_Sub15_Sub3_4806 = aClass449_4810.method5404(743924120);
				else if (!aClass536_Sub18_Sub15_Sub3_4806.aBool11777) {
					byte[] is = aClass536_Sub18_Sub15_Sub3_4806.method10771(1958572390);
					try {
						aClass469_4808 = new Class469(new RSByteBuffer(is), aBigInteger4803, aBigInteger4804);
						for (int i_9_ = 0; i_9_ < aClass459_Sub1Array4801.length; i_9_++) {
							if (aClass459_Sub1Array4801[i_9_] != null && aClass459_Sub1Array4801[i_9_].method9241(464498670)) {
								Class448 class448 = aClass469_4808.aClass448Array5355[i_9_];
								aClass459_Sub1Array4801[i_9_].method9244((aClass459_Sub1Array4801[i_9_].method9246(1535951545 * class448.anInt4923, class448.aByteArray4922, 1857151345 * class448.anInt4925, -1573408083 * class448.anInt4924, (byte) 98)), (byte) 21);
							}
						}
					} catch (Exception exception) {
						for (int i_10_ = 0; i_10_ < aClass459_Sub1Array4801.length; i_10_++) {
							if (null != aClass459_Sub1Array4801[i_10_] && aClass459_Sub1Array4801[i_10_].method9241(1705465325))
								aClass459_Sub1Array4801[i_10_].method9244(false, (byte) 122);
						}
					}
					aClass536_Sub18_Sub15_Sub3_4806 = null;
					aBool4809 = true;
				}
			}
		}
	}

	public Class426(Class460 class460, Class449 class449, Class466 class466, BigInteger biginteger, BigInteger biginteger_11_) {
		aClass460_4807 = class460;
		aClass449_4810 = class449;
		aClass466_4802 = class466;
		aBigInteger4803 = biginteger;
		aBigInteger4804 = biginteger_11_;
		if (!aClass460_4807.method5528((byte) 1))
			aClass536_Sub18_Sub15_Sub2_4805 = aClass460_4807.method5522(255, 255, (byte) 0, true, 1099044667);
		if (null != aClass449_4810)
			aClass536_Sub18_Sub15_Sub3_4806 = aClass449_4810.method5404(1524586663);
	}

	public void method5126() {
		if (aClass459_Sub1Array4801 != null) {
			for (int i = 0; i < aClass459_Sub1Array4801.length; i++) {
				if (null != aClass459_Sub1Array4801[i])
					aClass459_Sub1Array4801[i].method9234(-988810452);
			}
			for (int i = 0; i < aClass459_Sub1Array4801.length; i++) {
				if (null != aClass459_Sub1Array4801[i])
					aClass459_Sub1Array4801[i].method9248(-331731896);
			}
			if (aClass469_4800 == null)
				method5122((byte) -38);
			else if (null != aClass449_4810 && !aBool4809) {
				if (aClass536_Sub18_Sub15_Sub3_4806 == null)
					aClass536_Sub18_Sub15_Sub3_4806 = aClass449_4810.method5404(473201792);
				else if (!aClass536_Sub18_Sub15_Sub3_4806.aBool11777) {
					byte[] is = aClass536_Sub18_Sub15_Sub3_4806.method10771(2023029335);
					try {
						aClass469_4808 = new Class469(new RSByteBuffer(is), aBigInteger4803, aBigInteger4804);
						for (int i = 0; i < aClass459_Sub1Array4801.length; i++) {
							if (aClass459_Sub1Array4801[i] != null && aClass459_Sub1Array4801[i].method9241(1796998380)) {
								Class448 class448 = aClass469_4808.aClass448Array5355[i];
								aClass459_Sub1Array4801[i].method9244((aClass459_Sub1Array4801[i].method9246(1535951545 * class448.anInt4923, class448.aByteArray4922, 1857151345 * class448.anInt4925, -1573408083 * class448.anInt4924, (byte) 119)), (byte) 39);
							}
						}
					} catch (Exception exception) {
						for (int i = 0; i < aClass459_Sub1Array4801.length; i++) {
							if (null != aClass459_Sub1Array4801[i] && aClass459_Sub1Array4801[i].method9241(777383956))
								aClass459_Sub1Array4801[i].method9244(false, (byte) 27);
						}
					}
					aClass536_Sub18_Sub15_Sub3_4806 = null;
					aBool4809 = true;
				}
			}
		}
	}

	public static int method5127(int i) {
		return Class536_Sub42.aTwitchTV10811.GetStreamState();
	}

	static final void method5128(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
		int i_12_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		Class184_Sub2.aClass211_9442.method2990(i_12_, -1011522128);
	}

	public static boolean method5129(int i, int i_13_) {
		return i == 9 || i == 10 || i == 4;
	}

	public static void method5130(int i, int i_14_) {
		int i_15_ = client.aList11233.indexOf(Integer.valueOf(i));
		if (i_15_ == -1)
			client.aList11233.add(Integer.valueOf(i));
	}
}
