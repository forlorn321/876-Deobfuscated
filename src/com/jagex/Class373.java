/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class373 {
	public static Class373 aClass373_3907 = new Class373();
	public static Class373 aClass373_3908 = new Class373();

	Class373() {
		/* empty */
	}

	static void method6375(int i) {
		Class585.aTwitchWebcamDeviceArray7709 = Class585.aTwitchTV7698.GetWebcamDevices();
	}

	static Class527_Sub8_Sub10 method6376(Class579 class579, int i, int i_0_, int i_1_) {
		int i_2_ = 1025329677 * class579.anInt7672 | i << 10;
		Class527_Sub8_Sub10 class527_sub8_sub10 = ((Class527_Sub8_Sub10) Class648.aClass199_8370.method3748((long) i_2_ << 16));
		if (class527_sub8_sub10 != null)
			return class527_sub8_sub10;
		byte[] is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_2_, -1988221757), 1447980132));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			Class648.aClass199_8370.method3749(class527_sub8_sub10, (long) i_2_ << 16);
			return class527_sub8_sub10;
		}
		i_2_ = class579.anInt7672 * 1025329677 | 65536 + i_0_ << 10;
		class527_sub8_sub10 = ((Class527_Sub8_Sub10) Class648.aClass199_8370.method3748((long) i_2_ << 16));
		if (class527_sub8_sub10 != null)
			return class527_sub8_sub10;
		is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_2_, -1144687233), 1447980132));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			Class648.aClass199_8370.method3749(class527_sub8_sub10, (long) i_2_ << 16);
			return class527_sub8_sub10;
		}
		i_2_ = class579.anInt7672 * 1025329677 | 0x3fffc00;
		class527_sub8_sub10 = ((Class527_Sub8_Sub10) Class648.aClass199_8370.method3748((long) i_2_ << 16));
		if (null != class527_sub8_sub10)
			return class527_sub8_sub10;
		is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_2_, -535922975), 1447980132));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_2_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			Class648.aClass199_8370.method3749(class527_sub8_sub10, (long) i_2_ << 16);
			return class527_sub8_sub10;
		}
		return null;
	}

	static final void method6377(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 320581553) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2612 = Class103.method1800(string, class665, (byte) -85);
		class243.aBool2606 = true;
	}

	static final void method6378(Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_3_, -1048815382);
		Class240 class240 = Class183.aClass240Array2100[i_3_ >> 16];
		Class574.method9628(class243, class240, class665, 476421714);
	}
}
