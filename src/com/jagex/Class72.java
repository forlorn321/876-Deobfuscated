/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class72 {
	public String aString785;
	public String aString786;
	public String aString787;
	public boolean aBool788;

	Class72() {
		/* empty */
	}

	static void method1495(short i) {
		Class63.aClass28_737 = Class28.aClass28_260;
		Class63.aClass699_733 = Class699.aClass699_8772;
		Class207.aClass702_2232 = Class702.aClass702_8810;
		Class63.aClass698_738 = Class698.aClass698_8767;
		Class565.aClass687_7578 = Class687.aClass687_8679;
		Class497.aClass701_5581 = Class701.aClass701_8795;
		Class63.aString739 = null;
	}

	static String method1496(Class527_Sub8_Sub7 class527_sub8_sub7, byte i) {
		if (class527_sub8_sub7.aString11653 == null || class527_sub8_sub7.aString11653.length() == 0) {
			if (class527_sub8_sub7.aString11650 != null && class527_sub8_sub7.aString11650.length() > 0)
				return new StringBuilder().append(class527_sub8_sub7.aString11641).append(Class53.aClass53_667.method1290((Class144_Sub1.aClass671_8995), (byte) -26)).append(class527_sub8_sub7.aString11650).toString();
			return class527_sub8_sub7.aString11641;
		}
		if (null != class527_sub8_sub7.aString11650 && class527_sub8_sub7.aString11650.length() > 0)
			return new StringBuilder().append(class527_sub8_sub7.aString11641).append(Class53.aClass53_667.method1290((Class144_Sub1.aClass671_8995), (byte) -72)).append(class527_sub8_sub7.aString11650).append(Class53.aClass53_667.method1290((Class144_Sub1.aClass671_8995), (byte) -61)).append(class527_sub8_sub7.aString11653).toString();
		return new StringBuilder().append(class527_sub8_sub7.aString11641).append(Class53.aClass53_667.method1290(Class144_Sub1.aClass671_8995, (byte) -46)).append(class527_sub8_sub7.aString11653).toString();
	}

	static final void method1497(Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class490.method7976(string, (byte) 0);
	}

	static final void method1498(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -54);
	}

	static final void method1499(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method1500(Class243 class243, Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_1_ = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) - 1);
		if (-1260029751 * class243.anInt2541 != 6)
			throw new RuntimeException("");
		Class295 class295 = ((Class295) Class381.aClass24_Sub9_3936.method81(class243.anInt2542 * 1538136819, 217753260));
		if (null == class243.aClass308_2513)
			class243.aClass308_2513 = new Class308(class295, true);
		class243.aClass308_2513.aLong3450 = Class235.method4355(908118883) * -1114685536257316839L;
		if (i_1_ < 0 || i_1_ >= class295.anIntArray3281.length)
			throw new RuntimeException(new StringBuilder().append("").append(i_1_).toString());
		class243.aClass308_2513.anIntArray3449[i_1_] = i_0_;
		Class430.method6876(class243, (byte) 54);
	}
}
