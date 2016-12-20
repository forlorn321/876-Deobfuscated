/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class375 {
	Class358 aClass358_3915;
	Map aMap3916 = new HashMap();

	public Class360 method6379(int i, int i_0_) {
		return (Class360) aMap3916.get(Integer.valueOf(i));
	}

	public void method6380(byte i) {
		Iterator iterator = aMap3916.values().iterator();
		while (iterator.hasNext()) {
			Class360 class360 = (Class360) iterator.next();
			class360.method6312(-1666998123);
		}
	}

	public Class360 method6381(int i, int i_1_, float f, Interface42 interface42, byte i_2_) {
		if (method6379(i, 1619600701) != null)
			return null;
		Class360 class360 = null;
		if (i_1_ != -1)
			class360 = method6379(i_1_, -1177042892);
		Object object = aClass358_3915.method6278(class360, -78273611);
		Class360 class360_3_ = new Class360(i, f, object, this, interface42, class360);
		aMap3916.put(Integer.valueOf(i), class360_3_);
		return class360_3_;
	}

	public Class375(Class358 class358) {
		aClass358_3915 = class358;
	}

	public void method6382() {
		Iterator iterator = aMap3916.values().iterator();
		while (iterator.hasNext()) {
			Class360 class360 = (Class360) iterator.next();
			class360.method6312(-1666998123);
		}
	}

	public void method6383() {
		Iterator iterator = aMap3916.values().iterator();
		while (iterator.hasNext()) {
			Class360 class360 = (Class360) iterator.next();
			class360.method6312(-1666998123);
		}
	}

	public void method6384() {
		Iterator iterator = aMap3916.values().iterator();
		while (iterator.hasNext()) {
			Class360 class360 = (Class360) iterator.next();
			class360.method6312(-1666998123);
		}
	}

	public static void method6385(int i, int i_4_, int i_5_, int i_6_) {
		Class592 class592 = client.aClass509_11072.method8283((short) 16463);
		int i_7_ = 153371143 * class592.anInt7798 + i_4_;
		int i_8_ = i_5_ + -2029646807 * class592.anInt7799;
		if (client.aClass509_11072.method8314(-525312075) != null && (client.aClass509_11072.method8279(-629943508) != Class503.aClass503_6875) && i_4_ >= 0 && i_5_ >= 0 && i_4_ < client.aClass509_11072.method8284((byte) 95) && i_5_ < client.aClass509_11072.method8285(1957878260)) {
			long l = (long) (i << 28 | i_8_ << 14 | i_7_);
			Class527_Sub12 class527_sub12 = (Class527_Sub12) client.aClass14_11253.method709(l);
			if (null == class527_sub12)
				client.aClass509_11072.method8314(1225539450).method9246(i, i_4_, i_5_, (byte) -59);
			else {
				Class527_Sub22 class527_sub22 = (Class527_Sub22) class527_sub12.aClass694_10444.method14081((short) 9035);
				if (class527_sub22 == null)
					client.aClass509_11072.method8314(-1524389629).method9246(i, i_4_, i_5_, (byte) -15);
				else {
					int i_9_ = -1;
					int i_10_ = -1;
					int i_11_ = -1;
					Class432 class432 = null;
					Class432 class432_12_ = null;
					Class432 class432_13_ = null;
					Class640_Sub1_Sub5_Sub1 class640_sub1_sub5_sub1 = ((Class640_Sub1_Sub5_Sub1) client.aClass509_11072.method8314(927948215).method9246(i, i_4_, i_5_, (byte) -48));
					if (null == class640_sub1_sub5_sub1)
						class640_sub1_sub5_sub1 = (new Class640_Sub1_Sub5_Sub1(client.aClass509_11072.method8314(-715761498), i_4_ << 9, client.aClass509_11072.method8314(2049707804).aClass161Array7434[i].method2595(i_4_, i_5_, (byte) 97), i_5_ << 9, i, i));
					else {
						i_9_ = 569712533 * class640_sub1_sub5_sub1.anInt12121;
						i_10_ = class640_sub1_sub5_sub1.anInt12123 * -838153433;
						i_11_ = 959320019 * class640_sub1_sub5_sub1.anInt12120;
						class432 = class640_sub1_sub5_sub1.aClass432_12127;
						class432_12_ = class640_sub1_sub5_sub1.aClass432_12128;
						class432_13_ = class640_sub1_sub5_sub1.aClass432_12125;
						Class640_Sub1_Sub5_Sub1 class640_sub1_sub5_sub1_14_ = class640_sub1_sub5_sub1;
						class640_sub1_sub5_sub1.anInt12120 = -688005211;
						class640_sub1_sub5_sub1_14_.anInt12123 = -379057303;
						class640_sub1_sub5_sub1.aClass555_10867 = client.aClass509_11072.method8314(292442732);
					}
					class640_sub1_sub5_sub1.anInt12121 = 228253189 * class527_sub22.anInt10494;
					class640_sub1_sub5_sub1.anInt12122 = 1305491179 * class527_sub22.anInt10493;
					while_49_: do {
						Class527_Sub22 class527_sub22_15_;
						do {
							class527_sub22_15_ = (Class527_Sub22) class527_sub12.aClass694_10444.method14086(-65534);
							if (class527_sub22_15_ == null)
								break while_49_;
						} while (569712533 * class640_sub1_sub5_sub1.anInt12121 == (class527_sub22_15_.anInt10494 * -875637783));
						class640_sub1_sub5_sub1.anInt12123 = class527_sub22_15_.anInt10494 * 1567101551;
						class640_sub1_sub5_sub1.anInt12129 = class527_sub22_15_.anInt10493 * -68366513;
						for (;;) {
							Class527_Sub22 class527_sub22_16_ = ((Class527_Sub22) class527_sub12.aClass694_10444.method14086(-65534));
							if (null == class527_sub22_16_)
								break;
							if ((class527_sub22_16_.anInt10494 * -875637783 != (class640_sub1_sub5_sub1.anInt12121 * 569712533)) && ((class640_sub1_sub5_sub1.anInt12123 * -838153433) != (class527_sub22_16_.anInt10494 * -875637783))) {
								class640_sub1_sub5_sub1.anInt12120 = (1171551187 * class527_sub22_16_.anInt10494);
								class640_sub1_sub5_sub1.anInt12126 = (-2056882941 * class527_sub22_16_.anInt10493);
							}
						}
					} while (false);
					int i_17_ = Class590.method9853((i_4_ << 9) + 256, (i_5_ << 9) + 256, i, (byte) 5);
					class640_sub1_sub5_sub1.method10619((float) (i_4_ << 9), (float) i_17_, (float) (i_5_ << 9));
					if (i_9_ != class640_sub1_sub5_sub1.anInt12121 * 569712533) {
						if (569712533 * class640_sub1_sub5_sub1.anInt12121 == i_10_)
							class640_sub1_sub5_sub1.aClass432_12127 = class432_12_;
						else if (i_11_ == 569712533 * (class640_sub1_sub5_sub1.anInt12121))
							class640_sub1_sub5_sub1.aClass432_12127 = class432_13_;
						else if (((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81((class640_sub1_sub5_sub1.anInt12121 * 569712533), 78192309))).aBool150)
							class640_sub1_sub5_sub1.aClass432_12127 = Class637.method10571((byte) -70);
						else
							class640_sub1_sub5_sub1.aClass432_12127 = null;
					}
					if (class640_sub1_sub5_sub1.anInt12123 * -838153433 == -1)
						class640_sub1_sub5_sub1.aClass432_12128 = null;
					else if (i_10_ != (-838153433 * class640_sub1_sub5_sub1.anInt12123)) {
						if (-838153433 * class640_sub1_sub5_sub1.anInt12123 == i_9_)
							class640_sub1_sub5_sub1.aClass432_12128 = class432;
						else if ((-838153433 * class640_sub1_sub5_sub1.anInt12123) == i_11_)
							class640_sub1_sub5_sub1.aClass432_12128 = class432_13_;
						else if (((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81((-838153433 * class640_sub1_sub5_sub1.anInt12123), 1491137663))).aBool150)
							class640_sub1_sub5_sub1.aClass432_12128 = Class637.method10571((byte) -2);
						else
							class640_sub1_sub5_sub1.aClass432_12128 = null;
					}
					if (-1 == class640_sub1_sub5_sub1.anInt12120 * 959320019)
						class640_sub1_sub5_sub1.aClass432_12125 = null;
					else if (class640_sub1_sub5_sub1.anInt12120 * 959320019 != i_11_) {
						if (class640_sub1_sub5_sub1.anInt12120 * 959320019 == i_9_)
							class640_sub1_sub5_sub1.aClass432_12125 = class432;
						else if (959320019 * class640_sub1_sub5_sub1.anInt12120 == i_10_)
							class640_sub1_sub5_sub1.aClass432_12125 = class432_12_;
						else if (((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81((959320019 * class640_sub1_sub5_sub1.anInt12120), 1277015793))).aBool150)
							class640_sub1_sub5_sub1.aClass432_12125 = Class637.method10571((byte) 97);
						else
							class640_sub1_sub5_sub1.aClass432_12125 = null;
					}
					class640_sub1_sub5_sub1.anInt12130 = 0;
					class640_sub1_sub5_sub1.aByte10864 = (byte) i;
					class640_sub1_sub5_sub1.aByte10862 = (byte) i;
					if (client.aClass509_11072.method8359(796055719).method7706(i_4_, i_5_, (short) 13162))
						class640_sub1_sub5_sub1.aByte10862++;
					client.aClass509_11072.method8314(-1203175770).method9402(i, i_4_, i_5_, i_17_, class640_sub1_sub5_sub1, (byte) -27);
				}
			}
		}
	}
}
