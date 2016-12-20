/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.event.ActionEvent;

public class Class28 {
	static Class28 aClass28_260 = new Class28();
	static Class28 aClass28_261 = new Class28();

	Class28() {
		/* empty */
	}

	static void method864(Object object, int i) {
		if (Class388.anEventQueue3989 != null) {
			for (int i_0_ = 0; i_0_ < 50 && Class388.anEventQueue3989.peekEvent() != null; i_0_++)
				Class518.method8635(1L);
			try {
				if (null != object)
					Class388.anEventQueue3989.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	static final void method865(Class665 class665, byte i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_1_, 870695719);
		Class670.method13765(class243, class665, 287743048);
	}

	static void method866(int i, int i_2_, int i_3_, boolean bool, int i_4_, boolean bool_5_, int i_6_) {
		if (i < i_2_) {
			int i_7_ = (i + i_2_) / 2;
			int i_8_ = i;
			Class604_Sub1 class604_sub1 = Class3.aClass604_Sub1Array31[i_7_];
			Class3.aClass604_Sub1Array31[i_7_] = Class3.aClass604_Sub1Array31[i_2_];
			Class3.aClass604_Sub1Array31[i_2_] = class604_sub1;
			for (int i_9_ = i; i_9_ < i_2_; i_9_++) {
				if (Class385.method6429(Class3.aClass604_Sub1Array31[i_9_], class604_sub1, i_3_, bool, i_4_, bool_5_, (byte) 4) <= 0) {
					Class604_Sub1 class604_sub1_10_ = Class3.aClass604_Sub1Array31[i_9_];
					Class3.aClass604_Sub1Array31[i_9_] = Class3.aClass604_Sub1Array31[i_8_];
					Class3.aClass604_Sub1Array31[i_8_++] = class604_sub1_10_;
				}
			}
			Class3.aClass604_Sub1Array31[i_2_] = Class3.aClass604_Sub1Array31[i_8_];
			Class3.aClass604_Sub1Array31[i_8_] = class604_sub1;
			method866(i, i_8_ - 1, i_3_, bool, i_4_, bool_5_, -255846610);
			method866(i_8_ + 1, i_2_, i_3_, bool, i_4_, bool_5_, -704071829);
		}
	}

	static final void method867(int i, int i_11_) {
		int i_12_ = client.anInt11019 - client.anInt11273 * -591269243;
		if (i_12_ >= 100) {
			Class30.anInt265 = Class527_Sub29.method16288(2129617660) * 1363889517;
			Class452.anInt4964 = 1432081761;
			Class400.anInt4141 = -228665961;
		} else {
			float f = 1.0F - (float) ((100 - i_12_) * (100 - i_12_) * (100 - i_12_)) / 1000000.0F;
			int i_13_;
			if (Class527_Sub29.method16288(1464586246) == 2) {
				Class527_Sub36 class527_sub36 = Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0).method5783(-189132337);
				Class592 class592 = client.aClass509_11072.method8283((short) 20697);
				Class700_Sub34.anInt10928 = ((int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5381(1221800763) * 2607.5945876176133) & 0x3fff) * -290107601;
				Class12.anInt176 = ((int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5382(1861331689) * -2607.5945876176133) & 0x3fff) * 355973435;
				Class689.anInt8692 = 0;
				client.anInt11062 = (int) ((float) (-1337374329 * Class639.anInt8327) + (float) ((int) ((double) (473278291 * client.anInt11291) / (4.0 * (Math.tan((double) ((Class208_Sub10.aClass296_Sub1_9923.method5392(-692967285)) / 2.0F))))) - (-1337374329 * (Class639.anInt8327))) * f) * 418533641;
				Class320.anInt3543 = ((int) (f * (float) ((1445023519 * class527_sub36.anInt10676) - class592.anInt7798 * 1216613888 - (Class389_Sub2.anInt10170 * 1084967455)) + (float) (1084967455 * Class389_Sub2.anInt10170)) * 1149154509);
				Class142.anInt1657 = (-1960018167 * (int) ((float) (-(-1748166157 * class527_sub36.anInt10671) - -758879849 * Class303.anInt3427) * f + (float) (Class303.anInt3427 * -758879849)));
				Class201.anInt2211 = (421295465 * (int) ((float) (1101977115 * Class105.anInt1308) + ((float) ((class527_sub36.anInt10675 * -424734829) - class592.anInt7799 * 202920448 - 1101977115 * Class105.anInt1308) * f)));
				i_13_ = (-(-1728661517 * Class12.anInt176) - -2077363727 * Class268.anInt3113) & 0x3fff;
				if (i_13_ > 8192)
					i_13_ -= 16384;
				else if (i_13_ < -8192)
					i_13_ += 16384;
			} else {
				int i_14_ = (int) client.aFloat11111;
				if (client.anInt11120 * -340124423 >> 8 > i_14_)
					i_14_ = -340124423 * client.anInt11120 >> 8;
				if (client.aBoolArray11060[4] && 128 + client.anIntArray11294[4] > i_14_)
					i_14_ = 128 + client.anIntArray11294[4];
				int i_15_ = ((1325625329 * client.anInt11099 + (int) client.aFloat11112) & 0x3fff);
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class708.method14379(657661431 * Class286.anInt3211, (Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, Class673.anInt8585 * 162317215, (byte) 5) - client.anInt11036 * 80155925), Class608.anInt7995 * -1823634057, i_14_, i_15_, 600 + (i_14_ >> 3) * 3 << 2, i, 1474750881);
				Class320.anInt3543 = (1149154509 * (int) ((float) (Class389_Sub2.anInt10170 * 1084967455) + f * (float) (-1998563323 * Class320.anInt3543 - 1084967455 * (Class389_Sub2.anInt10170))));
				Class142.anInt1657 = (-1960018167 * (int) ((float) (Class303.anInt3427 * -758879849) + ((float) (298893113 * Class142.anInt1657 - -758879849 * Class303.anInt3427) * f)));
				Class201.anInt2211 = (421295465 * (int) (f * (float) (Class201.anInt2211 * -1261737255 - Class105.anInt1308 * 1101977115) + (float) (Class105.anInt1308 * 1101977115)));
				Class700_Sub34.anInt10928 = (-290107601 * (int) (f * (float) ((-1153148977 * Class700_Sub34.anInt10928) - Class319.anInt3539 * 1413535689) + (float) (Class319.anInt3539 * 1413535689)));
				i_13_ = (-1728661517 * Class12.anInt176 - -2077363727 * Class268.anInt3113);
				if (i_13_ > 8192)
					i_13_ -= 16384;
				else if (i_13_ < -8192)
					i_13_ += 16384;
			}
			Class12.anInt176 = 355973435 * (int) ((float) i_13_ * f + (float) (Class268.anInt3113 * -2077363727));
			Class12.anInt176 = (-1728661517 * Class12.anInt176 & 0x3fff) * 355973435;
			client.anInt11062 = ((int) ((float) (1553632569 * client.anInt11062 - -1337374329 * Class639.anInt8327) * f + (float) (Class639.anInt8327 * -1337374329)) * 418533641);
		}
	}
}
