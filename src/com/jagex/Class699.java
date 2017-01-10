/* Class699 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class699 implements Interface75 {
	static Class699 aClass699_8784;
	public static Class699 aClass699_8785;
	public static Class699 aClass699_8786;
	public static Class699 aClass699_8787 = new Class699(-2);
	int anInt8788;
	static Class699 aClass699_8789;
	static Class699 aClass699_8790;
	static Class699 aClass699_8791;
	static Class699 aClass699_8792;
	static Class699 aClass699_8793;

	public int method78() {
		return anInt8788 * 394543733;
	}

	public int method12() {
		return anInt8788 * 394543733;
	}

	public int method73() {
		return anInt8788 * 394543733;
	}

	static {
		aClass699_8785 = new Class699(-3);
		aClass699_8784 = new Class699(2);
		aClass699_8786 = new Class699(3);
		aClass699_8792 = new Class699(4);
		aClass699_8789 = new Class699(5);
		aClass699_8790 = new Class699(6);
		aClass699_8791 = new Class699(7);
		aClass699_8793 = new Class699(8);
	}

	Class699(int i) {
		anInt8788 = 435289565 * i;
	}

	static void method8235(GraphicalRenderer class167, int i) {
		if (Class54.aClass708_602.method8339((byte) 75) != 0) {
			if (ClientSetting.aClass536_Sub40_8843.toolkit.method10071() == 0) {
				for (Class536_Sub5 class536_sub5 = ((Class536_Sub5) Class54.aClass708_602.method8308(1867269829)); class536_sub5 != null; class536_sub5 = ((Class536_Sub5) Class54.aClass708_602.method8311(2006801508))) {
					Class111.aClass34_Sub13_1391.method10338(class167, class167, class536_sub5.anInt10417 * 1511029381, 982613921 * class536_sub5.anInt10413, 382349973 * class536_sub5.anInt10412, class536_sub5.anInt10415 * -2100961019, false, false, 1811899613 * class536_sub5.anInt10416, Class18.aClass184_190, (class536_sub5.aBool10414 ? (Class565.MY_PLAYER.aClass617_12202) : null), Class644.aClass628_8352, -2081820608);
					class536_sub5.method6484();
				}
				Class552.method6692(-1151588844);
			} else {
				if (null == Class54.aClass167_600) {
					Canvas canvas = new Canvas();
					canvas.setSize(36, 32);
					Class54.aClass167_600 = Class219.method3105(0, canvas, CPUUsageSetting.aClass174_10892, Class175.anInterface24_1935, Class53.aClass385_598, Class402.aClass397_4204, Class237.aClass396_2422, Class540.aClass461_7161, 0, -896397719);
					Class54.aClass184_601 = (Class54.aClass167_600.method2089(Class259.method3608(Class710_Sub43.aClass461_10940, -219992997 * Class35.anInt295, 0, (byte) 10), Class181.method2720(Class398.aClass461_4122, -219992997 * Class35.anInt295, 0), true));
				}
				for (Class536_Sub5 class536_sub5 = ((Class536_Sub5) Class54.aClass708_602.method8308(1867269829)); null != class536_sub5; class536_sub5 = ((Class536_Sub5) Class54.aClass708_602.method8311(995251041))) {
					Class111.aClass34_Sub13_1391.method10338(Class54.aClass167_600, class167, class536_sub5.anInt10417 * 1511029381, class536_sub5.anInt10413 * 982613921, 382349973 * class536_sub5.anInt10412, -2100961019 * class536_sub5.anInt10415, false, false, class536_sub5.anInt10416 * 1811899613, Class54.aClass184_601, (class536_sub5.aBool10414 ? (Class565.MY_PLAYER.aClass617_12202) : null), Class644.aClass628_8352, -1640329556);
					class536_sub5.method6484();
				}
			}
		}
	}

	static final void method8236(Class668 class668, int i) {
		class668.anInt8544 -= 1543270475;
		Class242.method3397((String) (class668.anObjectArray8543[class668.anInt8544 * 366709801]), (String) (class668.anObjectArray8543[1 + class668.anInt8544 * 366709801]), (String) (class668.anObjectArray8543[class668.anInt8544 * 366709801 + 2]), class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] == 1, true, 58976445);
	}
}
