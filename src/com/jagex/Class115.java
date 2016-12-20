/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.image.BufferedImage;
import java.util.Iterator;

public class Class115 {
	static boolean aBool1414 = false;

	public static void method2022() {
		if (!aBool1414) {
			Class42.method1180((client.aClass509_11072.method8314(-2116854).aClass561ArrayArrayArray7420), -255479051);
			if ((client.aClass509_11072.method8314(382060634).aClass561ArrayArrayArray7437) != null)
				Class42.method1180((client.aClass509_11072.method8314(1543176938).aClass561ArrayArrayArray7437), -1073148126);
			aBool1414 = true;
		}
	}

	Class115() throws Throwable {
		throw new Error();
	}

	public static void method2023() {
		if (!aBool1414) {
			Class42.method1180((client.aClass509_11072.method8314(90152332).aClass561ArrayArrayArray7420), -1067520493);
			if ((client.aClass509_11072.method8314(1745204212).aClass561ArrayArrayArray7437) != null)
				Class42.method1180((client.aClass509_11072.method8314(475224357).aClass561ArrayArrayArray7437), 217081990);
			aBool1414 = true;
		}
	}

	public static void method2024() {
		if (!aBool1414) {
			Class42.method1180((client.aClass509_11072.method8314(298730861).aClass561ArrayArrayArray7420), -633357235);
			if ((client.aClass509_11072.method8314(820105595).aClass561ArrayArrayArray7437) != null)
				Class42.method1180((client.aClass509_11072.method8314(1020394817).aClass561ArrayArrayArray7437), -1840968417);
			aBool1414 = true;
		}
	}

	public static String method2025(long l, int i, int i_0_) {
		Class565.method9496(l);
		int i_1_ = Class85.aCalendar816.get(5);
		int i_2_ = Class85.aCalendar816.get(2);
		int i_3_ = Class85.aCalendar816.get(1);
		if (3 == i)
			return Class660.method11021(l, i, 639940690);
		return new StringBuilder().append(Integer.toString(i_1_ / 10)).append(i_1_ % 10).append("-").append(Class85.aStringArrayArray817[i][i_2_]).append("-").append(i_3_).toString();
	}

	public static int[] method2026(BufferedImage bufferedimage, int i) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_4_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i_5_ = 0; i_5_ < is_4_.length; i_5_++)
					is_4_[i_5_] = -16777216 + (is[i_5_] + ((is[i_5_] << 16) + (is[i_5_] << 8)));
			} else {
				for (int i_6_ = 0; i_6_ < is_4_.length; i_6_++) {
					int i_7_ = i_6_ * 2;
					is_4_[i_6_] = ((is[i_7_] << 8) + (is[i_7_] << 16) + (is[i_7_] + (is[i_7_ + 1] << 24)));
				}
			}
			return is_4_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}

	static int method2027(Iterable iterable, int i) {
		int i_8_ = -1;
		Iterator iterator = iterable.iterator();
		while (iterator.hasNext()) {
			Interface76 interface76 = (Interface76) iterator.next();
			if (interface76.method87() > i_8_)
				i_8_ = interface76.method87();
		}
		return (8 + i_8_) / 8;
	}

	public static final int method2028(int i, int i_9_, int i_10_) {
		if (i == -1)
			return 12345678;
		i_9_ = (i & 0x7f) * i_9_ >> 7;
		if (i_9_ < 2)
			i_9_ = 2;
		else if (i_9_ > 126)
			i_9_ = 126;
		return (i & 0xff80) + i_9_;
	}

	static final void method2029(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_11_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_12_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4154(i_11_, 354824429).method4073(i_12_, 1551922499);
	}

	static void method2030(Class698 class698, short i) {
		Class63.aClass698_738 = class698;
	}
}
