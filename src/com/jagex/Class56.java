/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;
import java.awt.Frame;
import java.util.Iterator;
import java.util.LinkedList;

public class Class56 {
	public static Frame aFrame711;

	public static int method1322() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class180 class180 = Class700_Sub34.method17259(0, canvas, null, null, null, null, null, null, 0, (byte) 37);
		long l = Class234.method4347(-1408626088);
		for (int i = 0; i < 10000; i++)
			class180.method3076(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i = (int) (Class234.method4347(-1408626088) - l);
		class180.method3174(0, 0, 100, 100, -16777216, 283646093);
		class180.method3081((byte) 89);
		return i;
	}

	static void method1323() {
		/* empty */
	}

	public static int method1324() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class180 class180 = Class700_Sub34.method17259(0, canvas, null, null, null, null, null, null, 0, (byte) 126);
		long l = Class234.method4347(-1408626088);
		for (int i = 0; i < 10000; i++)
			class180.method3076(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i = (int) (Class234.method4347(-1408626088) - l);
		class180.method3174(0, 0, 100, 100, -16777216, 1231004236);
		class180.method3081((byte) 56);
		return i;
	}

	public static int method1325() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class180 class180 = Class700_Sub34.method17259(0, canvas, null, null, null, null, null, null, 0, (byte) 67);
		long l = Class234.method4347(-1408626088);
		for (int i = 0; i < 10000; i++)
			class180.method3076(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i = (int) (Class234.method4347(-1408626088) - l);
		class180.method3174(0, 0, 100, 100, -16777216, -1854516074);
		class180.method3081((byte) 125);
		return i;
	}

	public static int method1326() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class180 class180 = Class700_Sub34.method17259(0, canvas, null, null, null, null, null, null, 0, (byte) 26);
		long l = Class234.method4347(-1408626088);
		for (int i = 0; i < 10000; i++)
			class180.method3076(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i = (int) (Class234.method4347(-1408626088) - l);
		class180.method3174(0, 0, 100, 100, -16777216, 1650003449);
		class180.method3081((byte) 81);
		return i;
	}

	Class56() throws Throwable {
		throw new Error();
	}

	public static Class255 method1327(RSByteBuffer class527_sub38, short i) {
		int i_0_ = class527_sub38.readUnsignedByte();
		if (0 == i_0_)
			return null;
		i_0_--;
		class527_sub38.anInt10689 += 1474750881;
		int i_1_ = class527_sub38.readInt();
		Object[] objects = new Object[i_0_];
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			int i_3_ = class527_sub38.readUnsignedByte();
			if (i_3_ == 0)
				objects[i_2_] = Class475.method7758(java.lang.Integer.class, 318492261).method75(class527_sub38, (byte) -25);
			else if (1 == i_3_)
				objects[i_2_] = Class475.method7758(java.lang.String.class, 318492261).method75(class527_sub38, (byte) 37);
			else
				throw new IllegalStateException(new StringBuilder().append("Unrecognised type ID in deserialise: ").append(i_3_).toString());
		}
		return new Class255(i_1_, objects);
	}

	static final void method1328(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_4_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_5_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183)
			Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183.method10481(i_4_, i_5_, Class174_Sub2.aClass24_Sub17_9120, 445778496);
	}

	static final void method1329(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool11127 ? 1 : 0;
	}

	static final void method1330(Class665 class665, int i) throws Exception_Sub6 {
		class665.anInt8526 -= 204761682;
		int i_6_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_7_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class442 class442 = Class442.method7166((float) i_6_, (float) i_6_, (float) i_6_);
		if (class442.aFloat4918 == -1.0F)
			class442.aFloat4918 = Float.POSITIVE_INFINITY;
		if (class442.aFloat4915 == -1.0F)
			class442.aFloat4915 = Float.POSITIVE_INFINITY;
		if (class442.aFloat4919 == -1.0F)
			class442.aFloat4919 = Float.POSITIVE_INFINITY;
		Class208_Sub10.aClass296_Sub1_9923.method5353(class442, (byte) -20);
		Class208_Sub10.aClass296_Sub1_9923.method5350((float) i_7_ / 1000.0F, 1473684115);
		class442.method7141();
	}

	static final void method1331(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool11000 ? 1 : 0;
	}

	public static int method1332(String string, boolean bool, int i) {
		string = string.toLowerCase();
		Class314.anIntArray3507 = null;
		Class403.anInt4164 = 0;
		LinkedList linkedlist = new LinkedList();
		LinkedList linkedlist_8_ = new LinkedList();
		int i_9_ = bool ? 32768 : 0;
		int i_10_ = ((bool ? Exception_Sub3.aClass51_11362.anInt514 * 1474974589 : Exception_Sub3.aClass51_11362.anInt517 * 1738826785) + i_9_);
		for (int i_11_ = i_9_; i_11_ < i_10_; i_11_++) {
			Class527_Sub8_Sub17 class527_sub8_sub17 = Exception_Sub3.aClass51_11362.method1277(i_11_, 1534559201);
			if (class527_sub8_sub17.aBool11819 && class527_sub8_sub17.method18405((byte) -39).toLowerCase().indexOf(string) != -1) {
				if (linkedlist.size() >= 50)
					return -1;
				linkedlist.add(Integer.valueOf(i_11_));
				linkedlist_8_.add(class527_sub8_sub17.method18405((byte) -35));
			}
		}
		Class314.anIntArray3507 = new int[linkedlist.size()];
		int i_12_ = 0;
		Iterator iterator = linkedlist.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			Class314.anIntArray3507[i_12_++] = integer.intValue();
		}
		String[] strings = ((String[]) linkedlist_8_.toArray(new String[Class314.anIntArray3507.length]));
		Class325.method5752(strings, Class314.anIntArray3507, -709566596);
		return linkedlist.size();
	}
}
