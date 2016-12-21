/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchEvent;

public class Class295 {
	static Class295 aClass295_3249;
	static Class295 aClass295_3250;
	static Class295 aClass295_3251;
	static Class295 aClass295_3252;
	static Class295 aClass295_3253;
	static Class295 aClass295_3254;
	static Class295 aClass295_3255;
	static Class295 aClass295_3256;
	static Class295 aClass295_3257 = new Class295(0);
	static Class295 aClass295_3258;
	static Class295 aClass295_3259;
	static Class295 aClass295_3260;
	static Class295 aClass295_3261;
	static Class295 aClass295_3262;
	static Class295 aClass295_3263;
	int anInt3264;

	static {
		aClass295_3249 = new Class295(1);
		aClass295_3254 = new Class295(2);
		aClass295_3252 = new Class295(3);
		aClass295_3253 = new Class295(4);
		aClass295_3250 = new Class295(5);
		aClass295_3255 = new Class295(6);
		aClass295_3256 = new Class295(7);
		aClass295_3251 = new Class295(8);
		aClass295_3258 = new Class295(9);
		aClass295_3260 = new Class295(10);
		aClass295_3259 = new Class295(11);
		aClass295_3261 = new Class295(12);
		aClass295_3262 = new Class295(13);
		aClass295_3263 = new Class295(14);
	}

	Class295(int i) {
		anInt3264 = i * 224133811;
	}

	public static void method3977(Class167 class167, long l) {
		if (Class575.anInt7658 * 179908453 != 3 && 0 != Class575.anInt7658 * 179908453) {
			if (1 == 179908453 * Class575.anInt7658) {
				if (Class575.aStringArray7650 == null || Class575.aStringArray7650.length == 0)
					throw new RuntimeException("");
				int i = 0;
				for (int i_0_ = 0; i_0_ < Class575.aStringArray7650.length; i_0_++) {
					if (null != Class575.aStringArray7650[i_0_]) {
						try {
							i += (Class399.aClass530_4128.method6437(Class575.aStringArray7650[i_0_], (byte) 63));
						} catch (Exception_Sub1 exception_sub1) {
							Class684.method8105(Class52.aClass52_589, exception_sub1.aString11345, (-813039431 * exception_sub1.anInt11344), exception_sub1.getCause(), 1527611708);
							Class575.anInt7658 = -445497529;
							return;
						}
					} else
						i += 100;
				}
				Class575.anInt7671 = i / Class575.aStringArray7650.length * -541599771;
				if (100 == -2028696083 * Class575.anInt7671) {
					Class575.anInt7658 = Class509.method6179(-840546757) * 1283156589;
					if (2 != 179908453 * Class575.anInt7658)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = Class536_Sub42.aTwitchTV10811.Service();
			if (null != twitchevents) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (twitchevent != null && Class586.method7064(twitchevent, l)) {
						Class572 class572 = twitchevent.method4952();
						if (class572 != null)
							Class306.method4121(class572.method78(), twitchevent, (byte) 1);
					}
				}
			}
			if (Class536_Sub42.aTwitchTV10811.IsStreaming() && (l - Class575.aLong7663 * -4568954554610869773L > -6974614597900039733L * Class633.aLong8259)) {
				Class575.aLong7663 = 6225798727630464827L * l;
				if (class167.method2036())
					Class575.aBool7667 = true;
			}
			if (Class536_Sub42.aTwitchTV10811.IsStreaming()) {
				if (l - 4334052769340612825L * Class575.aLong7664 < (long) (973232179 * Class575.anInt7655))
					Class575.anInt7649 = 626907102;
				else if (l - Class575.aLong7665 * 5219853963144803599L < (long) (Class575.anInt7655 * 973232179))
					Class575.anInt7649 = 313453551;
				else
					Class575.anInt7649 = 0;
			} else
				Class575.anInt7649 = 0;
			if ((l - Class575.aLong7675 * 6153599447183377337L > (long) (Class575.anInt7647 * 1541788289)) && Class536_Sub42.aTwitchTV10811.GetWebcamState() == 5) {
				Class536_Sub42.aTwitchTV10811.RestartWebcamDevice();
				Class575.aLong7675 = l * 7973063499720905353L;
			}
		}
	}

	static final void method3978(Class251 class251, Class668 class668, byte i) {
		Class2 class2 = class251.method3470(Class196.aClass410_2202, client.anInterface51_11196, (byte) -35);
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_3_ = class2.method540(class251.aString2638, -1606950689 * class251.anInt2573, class251.anInt2721 * -1204882523, i_2_, i_1_, Class195.aClass143Array2201, -1022270402);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_3_;
	}
}
