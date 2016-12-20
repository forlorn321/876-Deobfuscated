/* Class522_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class522_Sub6 extends Class522 {
	public Class522_Sub6 aClass522_Sub6_10328;
	public Class522_Sub6 aClass522_Sub6_10329;

	public void method15989() {
		if (null != aClass522_Sub6_10328) {
			aClass522_Sub6_10328.aClass522_Sub6_10329 = aClass522_Sub6_10329;
			aClass522_Sub6_10329.aClass522_Sub6_10328 = aClass522_Sub6_10328;
			aClass522_Sub6_10329 = null;
			aClass522_Sub6_10328 = null;
		}
	}

	public void method15990(byte i) {
		if (null != aClass522_Sub6_10328) {
			aClass522_Sub6_10328.aClass522_Sub6_10329 = aClass522_Sub6_10329;
			aClass522_Sub6_10329.aClass522_Sub6_10328 = aClass522_Sub6_10328;
			aClass522_Sub6_10329 = null;
			aClass522_Sub6_10328 = null;
		}
	}

	public static final void method15991(int i) {
		for (Class527_Sub2 class527_sub2 = ((Class527_Sub2) Class527_Sub2.aClass694_10357.method14081((short) -4974)); null != class527_sub2; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10357.method14086(-65534)) {
			if (!class527_sub2.aBool10356) {
				class527_sub2.aBool10355 = true;
				if (1182093437 * class527_sub2.anInt10346 >= 0 && class527_sub2.anInt10345 * -677418425 >= 0 && (class527_sub2.anInt10346 * 1182093437 < client.aClass509_11072.method8284((byte) 87)) && (-677418425 * class527_sub2.anInt10345 < client.aClass509_11072.method8285(-1109468118)))
					Class154.method2536(class527_sub2, (byte) -65);
			} else
				class527_sub2.method8735(-1889161967);
		}
		for (Class527_Sub2 class527_sub2 = ((Class527_Sub2) Class527_Sub2.aClass694_10359.method14081((short) 1965)); class527_sub2 != null; class527_sub2 = (Class527_Sub2) Class527_Sub2.aClass694_10359.method14086(-65534)) {
			if (!class527_sub2.aBool10356)
				class527_sub2.aBool10355 = true;
			else
				class527_sub2.method8735(-1889161967);
		}
	}

	static boolean method15992(Class527_Sub38_Sub2 class527_sub38_sub2, int i, int i_0_) {
		int i_1_ = class527_sub38_sub2.method18469(2, -26016725);
		if (i_1_ == 0) {
			if (class527_sub38_sub2.method18469(1, -918866493) != 0)
				method15992(class527_sub38_sub2, i, 1900078844);
			int i_2_ = class527_sub38_sub2.method18469(6, 1612122259);
			int i_3_ = class527_sub38_sub2.method18469(6, 1060390474);
			boolean bool = class527_sub38_sub2.method18469(1, -1502263665) == 1;
			if (bool)
				Class105.anIntArray1306[(Class105.anInt1294 += -1816171541) * -673487677 - 1] = i;
			if (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] != null)
				throw new RuntimeException();
			Class47 class47 = Class105.aClass47Array1296[i];
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = (new Class640_Sub1_Sub2_Sub1_Sub2(client.aClass509_11072.method8314(-1916318300))));
			class640_sub1_sub2_sub1_sub2.anInt11955 = i * 1587877927;
			if (null != Class105.aClass527_Sub38Array1298[i])
				class640_sub1_sub2_sub1_sub2.method18873(Class105.aClass527_Sub38Array1298[i], 348521444);
			if (Class105.aClass527_Sub38Array1305[i] != null)
				class640_sub1_sub2_sub1_sub2.method18874(Class105.aClass527_Sub38Array1305[i], -1720390257);
			class640_sub1_sub2_sub1_sub2.method18528(358090743 * class47.anInt496, true, -1829425898);
			class640_sub1_sub2_sub1_sub2.anInt11910 = -1143379759 * class47.anInt495;
			int i_4_ = class47.anInt497 * 924471349;
			int i_5_ = i_4_ >> 28;
			int i_6_ = i_4_ >> 14 & 0xff;
			int i_7_ = i_4_ & 0xff;
			Class592 class592 = client.aClass509_11072.method8283((short) 5666);
			int i_8_ = (i_6_ << 6) + i_2_ - 153371143 * class592.anInt7798;
			int i_9_ = (i_7_ << 6) + i_3_ - class592.anInt7799 * -2029646807;
			class640_sub1_sub2_sub1_sub2.aClass210_12185 = class47.aClass210_498;
			class640_sub1_sub2_sub1_sub2.aBool12180 = class47.aBool499;
			class640_sub1_sub2_sub1_sub2.aByteArray11945[0] = Class105.aByteArray1299[i];
			class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) i_5_;
			if (client.aClass509_11072.method8359(775765624).method7706(i_8_, i_9_, (short) 7310))
				class640_sub1_sub2_sub1_sub2.aByte10862++;
			class640_sub1_sub2_sub1_sub2.method18886(i_8_, i_9_, -1083819263);
			Class105.aClass47Array1296[i] = null;
			return true;
		}
		if (i_1_ == 1) {
			int i_10_ = class527_sub38_sub2.method18469(2, 1498163188);
			int i_11_ = 924471349 * Class105.aClass47Array1296[i].anInt497;
			Class105.aClass47Array1296[i].anInt497 = 224559645 * (((i_10_ + (i_11_ >> 28) & 0x3) << 28) + (i_11_ & 0xfffffff));
			return false;
		}
		if (i_1_ == 2) {
			int i_12_ = class527_sub38_sub2.method18469(5, 1607399354);
			int i_13_ = i_12_ >> 3 & 0x3;
			int i_14_ = i_12_ & 0x7;
			int i_15_ = 924471349 * Class105.aClass47Array1296[i].anInt497;
			if (!Class105.$assertionsDisabled && (Class105.aByteArray1299[i] < 0 || Class105.aByteArray1299[i] > 3))
				throw new AssertionError();
			int i_16_ = i_13_ + (i_15_ >> 28) & 0x3;
			int i_17_ = i_15_ >> 14 & 0xff;
			int i_18_ = i_15_ & 0xff;
			if (0 == i_14_) {
				i_17_--;
				i_18_--;
			}
			if (i_14_ == 1)
				i_18_--;
			if (i_14_ == 2) {
				i_17_++;
				i_18_--;
			}
			if (i_14_ == 3)
				i_17_--;
			if (i_14_ == 4)
				i_17_++;
			if (5 == i_14_) {
				i_17_--;
				i_18_++;
			}
			if (i_14_ == 6)
				i_18_++;
			if (7 == i_14_) {
				i_17_++;
				i_18_++;
			}
			Class26.method858(Class679.method13904(673878859), Class105.aByteArray1299[i], 738618284);
			Class105.aClass47Array1296[i].anInt497 = (i_18_ + ((i_16_ << 28) + (i_17_ << 14))) * 224559645;
			return false;
		}
		int i_19_ = class527_sub38_sub2.method18469(20, -621187086);
		int i_20_ = i_19_ >> 18 & 0x3;
		int i_21_ = i_19_ >> 16 & 0x3;
		int i_22_ = i_19_ >> 8 & 0xff;
		int i_23_ = i_19_ & 0xff;
		int i_24_ = 924471349 * Class105.aClass47Array1296[i].anInt497;
		Class105.aByteArray1299[i] = (byte) (i_20_ - 1);
		if (!Class105.$assertionsDisabled && (Class105.aByteArray1299[i] < 0 || Class105.aByteArray1299[i] > 3))
			throw new AssertionError();
		int i_25_ = (i_24_ >> 28) + i_21_ & 0x3;
		int i_26_ = (i_24_ >> 14) + i_22_ & 0xff;
		int i_27_ = i_24_ + i_23_ & 0xff;
		Class26.method858(Class679.method13904(673878859), i_20_ - 1, 996267670);
		Class105.aClass47Array1296[i].anInt497 = 224559645 * ((i_25_ << 28) + (i_26_ << 14) + i_27_);
		return false;
	}
}
