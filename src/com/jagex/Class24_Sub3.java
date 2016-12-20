/* Class24_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class24_Sub3 extends Class24 {
	public Class24_Sub3(Class678 class678, Class671 class671, Class459 class459) {
		super(class678, class671, class459, Class657.aClass657_8464, 64, new Class43(com.jagex.Class202.class));
	}

	static void method17353(Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1, boolean bool, int i) {
		if (Class35.anInt346 * -943170217 < 407) {
			Class295 class295 = class640_sub1_sub2_sub1_sub1.aClass295_12168;
			String string = class640_sub1_sub2_sub1_sub1.aString12169;
			if (null != class295.anIntArray3312) {
				class295 = class295.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -214823657);
				if (class295 == null)
					return;
				string = class295.aString3279;
			}
			if (class295.aBool3299) {
				if (-318039309 * class640_sub1_sub2_sub1_sub1.anInt12170 != 0) {
					String string_0_ = (client.aClass678_11259 == Class678.aClass678_8611 ? Class53.aClass53_545.method1290((Class144_Sub1.aClass671_8995), (byte) -45) : Class53.aClass53_578.method1290((Class144_Sub1.aClass671_8995), (byte) -51));
					string = new StringBuilder().append(string).append(OutgoingPacket.method6634((class640_sub1_sub2_sub1_sub1.anInt12170 * -318039309), (-1574175591 * (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anInt12192)), (byte) 7)).append(Class33.aString328).append(string_0_).append(-318039309 * class640_sub1_sub2_sub1_sub1.anInt12170).append(Class33.aString327).toString();
				}
				if (client.aBool11188 && !bool) {
					Class80 class80 = ((Class80) (163079961 * Class665.anInt8550 != -1 ? (Class679.aClass24_Sub21_8628.method81(163079961 * Class665.anInt8550, 1470699345)) : null));
					if ((Class477.anInt5388 * -1182072537 & 0x2) != 0 && (null == class80 || (class295.method5331((163079961 * Class665.anInt8550), (class80.anInt804 * 780718929), (byte) -42) != 780718929 * class80.anInt804)))
						Class687.method13961(client.aString11191, new StringBuilder().append(client.aString11192).append(" ").append(Class33.aString326).append(" ").append(Class232.method4330(16776960, 311693395)).append(string).toString(), -1312689413 * Class634.anInt8296, 8, -1, (long) (class640_sub1_sub2_sub1_sub1.anInt11955 * -541403241), 0, 0, true, false, (long) (class640_sub1_sub2_sub1_sub1.anInt11955 * -541403241), false, (byte) -110);
				}
				if (!bool) {
					String[] strings = class295.aStringArray3308;
					if (client.aBool11037)
						strings = Class213.method3893(strings, (byte) 65);
					if (null != strings) {
						for (int i_1_ = strings.length - 1; i_1_ >= 0; i_1_--) {
							if (null != strings[i_1_] && 0 == ((534179271 * (class640_sub1_sub2_sub1_sub1.anInt12176)) & 1 << i_1_) && (class295.aByte3339 == 0 || (!(strings[i_1_].equalsIgnoreCase(Class53.aClass53_657.method1290(Class144_Sub1.aClass671_8995, (byte) -56))) && !(strings[i_1_].equalsIgnoreCase(Class53.aClass53_552.method1290(Class144_Sub1.aClass671_8995, (byte) -100)))))) {
								int i_2_ = 0;
								int i_3_ = -1277515419 * client.anInt11186;
								if (0 == i_1_)
									i_2_ = 9;
								if (1 == i_1_)
									i_2_ = 10;
								if (2 == i_1_)
									i_2_ = 11;
								if (i_1_ == 3)
									i_2_ = 12;
								if (4 == i_1_)
									i_2_ = 13;
								if (5 == i_1_)
									i_2_ = 1003;
								int i_4_ = class295.method5330(i_1_, (byte) -91);
								if (i_4_ != -1)
									i_3_ = i_4_;
								Class687.method13961(strings[i_1_], new StringBuilder().append(Class232.method4330(16776960, 929864480)).append(string).toString(), ((strings[i_1_].equalsIgnoreCase(Class53.aClass53_657.method1290(Class144_Sub1.aClass671_8995, (byte) -38))) ? 2020310481 * class295.anInt3298 : i_3_), i_2_, -1, (long) (-541403241 * (class640_sub1_sub2_sub1_sub1.anInt11955)), 0, 0, true, false, (long) ((class640_sub1_sub2_sub1_sub1.anInt11955) * -541403241), false, (byte) -88);
							}
						}
						if (1 == class295.aByte3339) {
							for (int i_5_ = 0; i_5_ < strings.length; i_5_++) {
								if (null != strings[i_5_] && 0 == ((534179271 * (class640_sub1_sub2_sub1_sub1.anInt12176)) & 1 << i_5_) && ((strings[i_5_].equalsIgnoreCase(Class53.aClass53_657.method1290(Class144_Sub1.aClass671_8995, (byte) -38))) || (strings[i_5_].equalsIgnoreCase(Class53.aClass53_552.method1290(Class144_Sub1.aClass671_8995, (byte) -39))))) {
									short i_6_ = 0;
									if ((-318039309 * (class640_sub1_sub2_sub1_sub1.anInt12170)) > (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anInt12192) * -1574175591)
										i_6_ = (short) 2000;
									short i_7_ = 0;
									int i_8_ = client.anInt11186 * -1277515419;
									if (0 == i_5_)
										i_7_ = (short) 9;
									if (1 == i_5_)
										i_7_ = (short) 10;
									if (i_5_ == 2)
										i_7_ = (short) 11;
									if (3 == i_5_)
										i_7_ = (short) 12;
									if (4 == i_5_)
										i_7_ = (short) 13;
									if (i_5_ == 5)
										i_7_ = (short) 1003;
									if (i_7_ != 0)
										i_7_ += i_6_;
									int i_9_ = class295.method5330(i_5_, (byte) -65);
									if (i_9_ != -1)
										i_8_ = i_9_;
									Class687.method13961(strings[i_5_], new StringBuilder().append(Class232.method4330(16776960, 708102275)).append(string).toString(), ((strings[i_5_].equalsIgnoreCase(Class53.aClass53_657.method1290(Class144_Sub1.aClass671_8995, (byte) -23))) ? class295.anInt3298 * 2020310481 : i_8_), i_7_, -1, (long) (-541403241 * (class640_sub1_sub2_sub1_sub1.anInt11955)), 0, 0, true, false, (long) ((class640_sub1_sub2_sub1_sub1.anInt11955) * -541403241), false, (byte) -12);
								}
							}
						}
					}
				}
			}
		}
	}
}
