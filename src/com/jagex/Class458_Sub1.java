/* Class458_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Dimension;

final class Class458_Sub1 extends Class458 {
	Class458_Sub1(JS5ConfigGroup class648, int i, boolean bool, boolean bool_0_) {
		super(class648, i, bool, bool_0_);
	}

	Object method5496(Class153 class153) {
		if (class153.aClass453_1716 == Class453.aClass453_4955)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(997769475);
	}

	Object method5495(Class153 class153) {
		if (class153.aClass453_1716 == Class453.aClass453_4955)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(1615098942);
	}

	Object method5494(Class153 class153, int i) {
		if (class153.aClass453_1716 == Class453.aClass453_4955)
			return Integer.valueOf(-1);
		return class153.aClass453_1716.method5439(751026582);
	}

	public static int method9334(int i, int i_1_, byte i_2_) {
		if (183673691 * Class644.aClass628_8352.anInt8197 == -1)
			return 1;
		if (i != ClientSetting.aClass536_Sub40_8843.toolkit.method10071()) {
			Class101.method1355(i, Class38.aClass38_403.method840(Class459.aClass664_5178, 1549341707), true, -504758393);
			if (ClientSetting.aClass536_Sub40_8843.toolkit.method10071() != i)
				return -1;
		}
		int i_3_;
		try {
			Dimension dimension = Class399.aCanvas4127.getSize();
			Class306.method4120(Class38.aClass38_403.method840(Class459.aClass664_5178, 1910101812), true, Class677.aClass167_8609, Class536_Sub15.aClass184_10488, Class223.aClass2_2338, (byte) 0);
			Class180 class180 = Class180.method2708(Class602.aClass461_7857, (183673691 * Class644.aClass628_8352.anInt8197), 0);
			long l = Class249.method3450(1357261973);
			Class677.aClass167_8609.method2051();
			client.aClass433_11110.method5203(0.0F, 256.0F, 0.0F);
			Class677.aClass167_8609.method2099(client.aClass433_11110);
			Class443 class443 = Class677.aClass167_8609.method2391();
			class443.method5350((float) (dimension.width / 2), (float) (dimension.height / 2), 512.0F, 512.0F, (float) client.aClass515_11066.method6247(-1661109781), (float) client.aClass515_11066.method6248(-214965683), (float) dimension.width, (float) dimension.height);
			Class677.aClass167_8609.method2390(class443);
			Class677.aClass167_8609.method2006(1.0F);
			Class677.aClass167_8609.method2105(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			Class177 class177 = Class677.aClass167_8609.method2093(class180, 2048, 64, 64, 768);
			int i_4_ = 0;
			while_54_: for (int i_5_ = 0; i_5_ < 500; i_5_++) {
				Class677.aClass167_8609.method2000(3, 0);
				for (int i_6_ = 15; i_6_ >= 0; i_6_--) {
					for (int i_7_ = 0; i_7_ <= i_6_; i_7_++) {
						client.aClass433_11294.method5203((float) (int) (((float) i_7_ - (float) i_6_ / 2.0F) * 512.0F), 0.0F, (float) ((1 + i_6_) * 512));
						class177.method2490(client.aClass433_11294, null, 0);
						i_4_++;
						if (Class249.method3450(1319029135) - l >= (long) i_1_)
							break while_54_;
					}
				}
			}
			Class677.aClass167_8609.method2004();
			long l_8_ = (long) (1000 * i_4_) / (Class249.method3450(1889979274) - l);
			Class677.aClass167_8609.method2000(3, 0);
			i_3_ = (int) l_8_;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return -1;
		}
		return i_3_;
	}

	static void method9335(int i, int i_9_, byte i_10_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(6, (long) i);
		class536_sub18_sub5.method10659(1985075342);
		class536_sub18_sub5.anInt11675 = i_9_ * 1577826219;
	}
}
