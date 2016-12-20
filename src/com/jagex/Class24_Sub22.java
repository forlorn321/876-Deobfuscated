/* Class24_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class24_Sub22 extends Class24 {
	static int anInt10986;

	public Class24_Sub22(Class678 class678, Class671 class671, Class459 class459) {
		super(class678, class671, class459, Class657.aClass657_8425, 64, new Class43(com.jagex.Class88.class));
	}

	static Class26_Sub1 method17424(byte i) {
		Class26_Sub1 class26_sub1 = new Class26_Sub1();
		boolean bool = false;
		boolean bool_0_ = false;
		boolean bool_1_ = false;
		if (Class234.aString2373.startsWith("win")) {
			bool_0_ = true;
			bool = true;
			bool_1_ = true;
		} else {
			bool = true;
			bool_1_ = true;
		}
		if (Class110.aBool1382) {
			class26_sub1.method16293(16, 1906415102);
			bool = false;
		}
		if (Class110.aBool1381) {
			class26_sub1.method16293(32, 892800968);
			bool_0_ = false;
		}
		if (Class110.aBool1385) {
			class26_sub1.method16293(16384, 1261372491);
			bool_1_ = false;
		}
		if (!bool && !bool_0_) {
			Class143.method2380(class26_sub1, 523981024);
			return class26_sub1;
		}
		int i_2_ = -1;
		int i_3_ = -1;
		int i_4_ = -1;
		if (bool_0_) {
			try {
				Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub38_10630, 3, 1206694032);
				Class631.method10465(959021816);
				i_3_ = Class49.method1267(3, 1000, (short) 255);
				if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1884531119) == 3) {
					class26_sub1.method16293(4, 699824882);
					Class143 class143 = Class402.aClass180_4150.method3077();
					long l = (-3959867577634484715L * class143.aLong1668 & 0xffffffffffffL);
					switch (-1388704187 * class143.anInt1664) {
					case 4318: {
						boolean bool_5_ = l >= 64425238954L;
						bool &= bool_5_;
						if (!bool_5_)
							class26_sub1.method16293(256, 1394222839);
						break;
					}
					case 4098: {
						boolean bool_6_ = l >= 60129613779L;
						bool &= bool_6_;
						if (!bool_6_)
							class26_sub1.method16293(512, 474058962);
						break;
					}
					}
				}
			} catch (Exception exception) {
				class26_sub1.method16293(4096, 912529939);
			}
		}
		if (bool_1_) {
			try {
				Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub38_10630, 5, 1561835998);
				Class631.method10465(1028041795);
				i_4_ = Class49.method1267(5, 1000, (short) 255);
				if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1834452728) == 5)
					class26_sub1.method16293(8192, 1359334286);
			} catch (Exception exception) {
				class26_sub1.method16293(32768, 1105983022);
			}
		}
		if (bool) {
			try {
				Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub38_10630, 4, 1860142529);
				Class631.method10465(-2001698220);
				i_2_ = Class49.method1267(1, 1000, (short) 255);
				if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1444964317) == 1)
					class26_sub1.method16293(2, 1824060704);
			} catch (Exception exception) {
				class26_sub1.method16293(2048, 635725102);
			}
		}
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub38_10630), 0, 1084001858);
		if (-1 == i_2_ && i_3_ == -1) {
			Class143.method2380(class26_sub1, 523981024);
			return class26_sub1;
		}
		class26_sub1.method16294(3, i_3_, (byte) 10);
		class26_sub1.method16294(1, i_2_, (byte) 10);
		class26_sub1.method16294(5, i_4_, (byte) 10);
		i_3_ *= 1.3F;
		if (i_3_ > 100000 && i_2_ > 100000 || i_3_ > i_2_)
			Class651.method10864(class26_sub1, 3, i_2_ == -1 ? i_3_ : i_2_, -1239686003);
		else
			Class651.method10864(class26_sub1, 1, -1 == i_3_ ? i_2_ : i_3_, -1239686003);
		return class26_sub1;
	}
}
