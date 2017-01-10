/* Class674 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.LinkedList;

public class AccountType implements Interface75 {
	public static AccountType FREE = new AccountType(0, "");
	public static AccountType MEMBERS = new AccountType(1, "");
	int anInt8584;

	public int method78() {
		return -1615432875 * anInt8584;
	}

	AccountType(int i, String string) {
		anInt8584 = 933884413 * i;
	}

	public int method12() {
		return -1615432875 * anInt8584;
	}

	public int method73() {
		return -1615432875 * anInt8584;
	}

	public static Class603_Sub1 method8027(int i) {
		if (1844671827 * Class23.anInt229 < Class23.aClass603_Sub1Array226.length)
			return (Class23.aClass603_Sub1Array226[(Class23.anInt229 += -225143077) * 1844671827 - 1]);
		return null;
	}

	static final void method8028(Class668 class668, int i) {
		Class706_Sub2.method10262((byte) 102);
		Class70.aBool780 = false;
	}

	static void method8029(int[] is, LinkedList linkedlist, int i, int i_0_, float f, int i_1_) {
		if (!linkedlist.isEmpty()) {
			for (int i_2_ = 0; i_2_ < linkedlist.size(); i_2_++) {
				Class580 class580 = (Class580) linkedlist.get(i_2_);
				int i_3_ = i + (int) (f * (float) (class580.anInt7693 * -1465674509));
				int i_4_ = i_0_ + (int) (f * (float) (1853291375 * class580.anInt7692));
				int i_5_ = (int) ((float) (979275017 * class580.anInt7691) * f);
				int i_6_ = (int) ((float) (-214675961 * class580.anInt7694) * f);
				if (i_3_ < Class420.anInt4585 * 672935275 && i_4_ < Class575.anInt7669 * -264469499) {
					if (i_5_ + i_3_ > Class420.anInt4585 * 672935275)
						i_5_ = 672935275 * Class420.anInt4585 - i_3_;
					if (i_6_ + i_4_ > Class575.anInt7669 * -264469499)
						i_6_ = -264469499 * Class575.anInt7669 - i_4_;
					for (int i_7_ = i_4_; i_7_ < i_6_ + i_4_; i_7_++) {
						int i_8_ = i_3_ + Class420.anInt4585 * 672935275 * i_7_;
						Arrays.fill(is, i_8_, i_5_ + i_8_, -16777216);
					}
				}
			}
		}
	}

	static void method8030(GraphicalRenderer class167, byte i) {
		int i_9_ = -467577567 * Class312.anInt3487;
		int i_10_ = 1644471179 * Class70.anInt768;
		int i_11_ = Class2.anInt95 * 917143623;
		int i_12_ = Class153.anInt1719 * -311054579 - 3;
		int i_13_ = 20;
		if (Class642.aClass184_8333 == null || null == Class287.aClass2_3209) {
			Class642.aClass184_8333 = ((FontRenderer) Class196.aClass410_2202.method4980((client.anInterface51_11196), (Class301.anInt3400 * 614229123), true, true, (byte) 12));
			Class287.aClass2_3209 = Class196.aClass410_2202.method4981((client.anInterface51_11196), (614229123 * Class301.anInt3400), -1041916677);
			if (null != Class642.aClass184_8333 && Class287.aClass2_3209 != null) {
				Class51.method930(-1398418648);
				int i_14_ = i_11_ / 2 + i_9_;
				if (i_11_ + i_14_ > -1804846931 * Class144.anInt1679)
					i_14_ = -1804846931 * Class144.anInt1679 - i_11_;
				if (i_14_ < 0)
					i_14_ = 0;
				Class486.method5861(i_14_, 1644471179 * Class70.anInt768, -883554905);
				return;
			}
		}
		FontRenderer class184;
		if (null == Class642.aClass184_8333 || null == Class287.aClass2_3209)
			class184 = Class26.aClass184_248;
		else
			class184 = Class642.aClass184_8333;
		Class2 class2 = Class231.method3316(1331488694);
		Class651.method7864(class167, Class312.anInt3487 * -467577567, Class70.anInt768 * 1644471179, 917143623 * Class2.anInt95, -311054579 * Class153.anInt1719, i_13_, class184, class2, Class38.aClass38_435.method840((Class459.CLIENT_PARAMS), 1916428980), (byte) 8);
		int i_15_ = (255 - Class26.anInt247 * 1641077831 - 1566263285 * Class70.anInt781);
		if (i_15_ < 0)
			i_15_ = 0;
		int i_16_ = Class329.aClass550_3601.method6656(-1909525531);
		int i_17_ = Class329.aClass550_3601.method6657(-2041205629);
		if (!Class70.aBool753) {
			int i_18_ = 0;
			for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8308(1867269829)); class536_sub18_sub9 != null; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8311(941820107))) {
				int i_19_ = ((2934691 * Class70.anInt749 * (1780207751 * Class70.anInt760 - 1 - i_18_)) + (1 + (i_10_ + i_13_ + -1214764847 * class2.anInt91)));
				if (i_16_ > -467577567 * Class312.anInt3487 && i_16_ < (Class312.anInt3487 * -467577567 + Class2.anInt95 * 917143623) && i_17_ > i_19_ - -1214764847 * class2.anInt91 - 1 && i_17_ < 1780869003 * class2.anInt92 + i_19_ && class536_sub18_sub9.aBool11714)
					class167.method2063(-467577567 * Class312.anInt3487, i_19_ - -1214764847 * class2.anInt91, 917143623 * Class2.anInt95, 2934691 * Class70.anInt749, (i_15_ << 24 | Class582.anInt7699 * 421730549), 1);
				i_18_++;
			}
		} else {
			int i_20_ = 0;
			for (Class536_Sub18_Sub6 class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8248(63549754)); class536_sub18_sub6 != null; class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8241(-797369288))) {
				int i_21_ = (1 + (class2.anInt91 * -1214764847 + (i_13_ + i_10_)) + i_20_ * (Class70.anInt749 * 2934691));
				if (i_16_ > -467577567 * Class312.anInt3487 && i_16_ < (917143623 * Class2.anInt95 + Class312.anInt3487 * -467577567) && i_17_ > i_21_ - -1214764847 * class2.anInt91 - 1 && i_17_ < 1780869003 * class2.anInt92 + i_21_ && (class536_sub18_sub6.anInt11685 * -606992075 > 1 || (((Class536_Sub18_Sub9) (class536_sub18_sub6.aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506)).aBool11714)))
					class167.method2063(Class312.anInt3487 * -467577567, i_21_ - -1214764847 * class2.anInt91, 917143623 * Class2.anInt95, Class70.anInt749 * 2934691, (i_15_ << 24 | 421730549 * Class582.anInt7699), 1);
				i_20_++;
			}
			if (null != Class70.aClass536_Sub18_Sub6_754) {
				Class651.method7864(class167, -1742636179 * Class283.anInt3184, Class70.anInt767 * -1907476413, Canvas_Sub1.anInt11875 * -2003725765, Class507.anInt6915 * -1785378353, i_13_, class184, class2, (Class70.aClass536_Sub18_Sub6_754.aString11684), (byte) 8);
				i_20_ = 0;
				for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass536_Sub18_Sub6_754.aClass700_11683.method8248(898167567)); null != class536_sub18_sub9; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass536_Sub18_Sub6_754.aClass700_11683.method8241(278161415))) {
					int i_22_ = (i_20_ * (Class70.anInt749 * 2934691) + (i_13_ + Class70.anInt767 * -1907476413 + -1214764847 * class2.anInt91 + 1));
					if (i_16_ > Class283.anInt3184 * -1742636179 && i_16_ < (-2003725765 * Canvas_Sub1.anInt11875 + -1742636179 * Class283.anInt3184) && i_17_ > i_22_ - class2.anInt91 * -1214764847 - 1 && i_17_ < class2.anInt92 * 1780869003 + i_22_ && class536_sub18_sub9.aBool11714)
						class167.method2063(Class283.anInt3184 * -1742636179, i_22_ - class2.anInt91 * -1214764847, -2003725765 * Canvas_Sub1.anInt11875, 2934691 * Class70.anInt749, i_15_ << 24 | Class582.anInt7699 * 421730549, 1);
					i_20_++;
				}
				Class104.method1380(class167, -1742636179 * Class283.anInt3184, Class70.anInt767 * -1907476413, -2003725765 * Canvas_Sub1.anInt11875, -1785378353 * Class507.anInt6915, i_13_, 425624849);
			}
		}
		Class104.method1380(class167, Class312.anInt3487 * -467577567, Class70.anInt768 * 1644471179, 917143623 * Class2.anInt95, -311054579 * Class153.anInt1719, i_13_, 459463849);
		if (!Class70.aBool753) {
			int i_23_ = 0;
			for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8308(1867269829)); null != class536_sub18_sub9; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8311(1696844984))) {
				int i_24_ = (((Class70.anInt760 * 1780207751 - 1 - i_23_) * (2934691 * Class70.anInt749)) + (1 + (class2.anInt91 * -1214764847 + (i_13_ + i_10_))));
				RemoveRoofSetting.method9920(i_16_, i_17_, i_9_, i_10_, i_11_, i_12_, i_24_, class536_sub18_sub9, class184, class2, Class158.anInt1743 * 1559126045 | ~0xffffff, JS5ResourceProvider.anInt5217 * -1058819483 | ~0xffffff, 566941531);
				i_23_++;
			}
		} else {
			int i_25_ = 0;
			for (Class536_Sub18_Sub6 class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8248(1935403366)); null != class536_sub18_sub6; class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8241(874264648))) {
				int i_26_ = (class2.anInt91 * -1214764847 + (i_13_ + 1644471179 * Class70.anInt768) + 1 + i_25_ * (Class70.anInt749 * 2934691));
				if (1 == -606992075 * class536_sub18_sub6.anInt11685)
					RemoveRoofSetting.method9920(i_16_, i_17_, Class312.anInt3487 * -467577567, Class70.anInt768 * 1644471179, 917143623 * Class2.anInt95, -311054579 * Class153.anInt1719, i_26_, ((Class536_Sub18_Sub9) (class536_sub18_sub6.aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506)), class184, class2, Class158.anInt1743 * 1559126045 | ~0xffffff, JS5ResourceProvider.anInt5217 * -1058819483 | ~0xffffff, -1011192955);
				else
					Class599.method7155(i_16_, i_17_, Class312.anInt3487 * -467577567, Class70.anInt768 * 1644471179, Class2.anInt95 * 917143623, -311054579 * Class153.anInt1719, i_26_, class536_sub18_sub6, class184, class2, (1559126045 * Class158.anInt1743 | ~0xffffff), (-1058819483 * JS5ResourceProvider.anInt5217 | ~0xffffff), 403182947);
				i_25_++;
			}
			if (Class70.aClass536_Sub18_Sub6_754 != null) {
				i_25_ = 0;
				for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass536_Sub18_Sub6_754.aClass700_11683.method8248(-1197394472)); null != class536_sub18_sub9; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass536_Sub18_Sub6_754.aClass700_11683.method8241(-1215625863))) {
					int i_27_ = (i_25_ * (2934691 * Class70.anInt749) + (1 + (-1214764847 * class2.anInt91 + (-1907476413 * Class70.anInt767 + i_13_))));
					RemoveRoofSetting.method9920(i_16_, i_17_, -1742636179 * Class283.anInt3184, Class70.anInt767 * -1907476413, -2003725765 * Canvas_Sub1.anInt11875, -1785378353 * Class507.anInt6915, i_27_, class536_sub18_sub9, class184, class2, Class158.anInt1743 * 1559126045 | ~0xffffff, -1058819483 * JS5ResourceProvider.anInt5217 | ~0xffffff, -2075201216);
					i_25_++;
				}
			}
		}
	}

	public static File method8031(String string, int i) {
		if (!Class502.aBool6851)
			throw new RuntimeException("");
		File file = (File) Class502.aHashtable6849.get(string);
		if (file != null)
			return file;
		File file_28_ = new File(Class502.aFile6850, string);
		RandomAccessFile randomaccessfile = null;
		File file_29_;
		try {
			File file_30_ = new File(file_28_.getParent());
			if (!file_30_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_28_, "rw");
			int i_31_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_31_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			Class502.aHashtable6849.put(string, file_28_);
			file_29_ = file_28_;
		} catch (Exception exception) {
			try {
				if (null != randomaccessfile) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_32_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_29_;
	}
}
