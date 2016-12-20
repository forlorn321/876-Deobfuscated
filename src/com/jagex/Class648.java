/* Class648 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class648 {
	static Class199 aClass199_8370 = new Class199(128);

	static Class527_Sub8_Sub10 method10821(byte[] is) {
		return new Class527_Sub8_Sub10(new RSByteBuffer(is), Class310.anInterface20_3490);
	}

	static Class527_Sub8_Sub10 method10822(Class579 class579, int i, int i_0_) {
		int i_1_ = 1025329677 * class579.anInt7672 | i << 10;
		Class527_Sub8_Sub10 class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_1_ << 16));
		if (class527_sub8_sub10 != null)
			return class527_sub8_sub10;
		byte[] is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_1_, -1173853915), 1447980132));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_1_ << 16);
			return class527_sub8_sub10;
		}
		i_1_ = class579.anInt7672 * 1025329677 | 65536 + i_0_ << 10;
		class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_1_ << 16));
		if (class527_sub8_sub10 != null)
			return class527_sub8_sub10;
		is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_1_, 544894217), 1447980132));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_1_ << 16);
			return class527_sub8_sub10;
		}
		i_1_ = class579.anInt7672 * 1025329677 | 0x3fffc00;
		class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_1_ << 16));
		if (null != class527_sub8_sub10)
			return class527_sub8_sub10;
		is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_1_, -563930824), 1447980132));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_1_ << 16);
			return class527_sub8_sub10;
		}
		return null;
	}

	Class648() throws Throwable {
		throw new Error();
	}

	static Class527_Sub8_Sub10 method10823(int i) {
		Class527_Sub8_Sub10 class527_sub8_sub10 = (Class527_Sub8_Sub10) aClass199_8370.method3748((long) i);
		if (null != class527_sub8_sub10)
			return class527_sub8_sub10;
		byte[] is = Class293_Sub1.aClass459_10041.method7470(i, 0, (byte) -98);
		if (null == is || is.length <= 1)
			return null;
		try {
			class527_sub8_sub10 = Class222.method4152(is, -635407399);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		aClass199_8370.method3749(class527_sub8_sub10, (long) i);
		return class527_sub8_sub10;
	}

	static Class527_Sub8_Sub10 method10824(int i) {
		Class527_Sub8_Sub10 class527_sub8_sub10 = (Class527_Sub8_Sub10) aClass199_8370.method3748((long) i);
		if (null != class527_sub8_sub10)
			return class527_sub8_sub10;
		byte[] is = Class293_Sub1.aClass459_10041.method7470(i, 0, (byte) -99);
		if (null == is || is.length <= 1)
			return null;
		try {
			class527_sub8_sub10 = Class222.method4152(is, -635407399);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		aClass199_8370.method3749(class527_sub8_sub10, (long) i);
		return class527_sub8_sub10;
	}

	static Class527_Sub8_Sub10 method10825(int i) {
		Class527_Sub8_Sub10 class527_sub8_sub10 = (Class527_Sub8_Sub10) aClass199_8370.method3748((long) i);
		if (null != class527_sub8_sub10)
			return class527_sub8_sub10;
		byte[] is = Class293_Sub1.aClass459_10041.method7470(i, 0, (byte) -19);
		if (null == is || is.length <= 1)
			return null;
		try {
			class527_sub8_sub10 = Class222.method4152(is, -635407399);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		aClass199_8370.method3749(class527_sub8_sub10, (long) i);
		return class527_sub8_sub10;
	}

	static Class527_Sub8_Sub10 method10826(Class579 class579, int i, int i_2_) {
		int i_3_ = 1025329677 * class579.anInt7672 | i << 10;
		Class527_Sub8_Sub10 class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_3_ << 16));
		if (class527_sub8_sub10 != null)
			return class527_sub8_sub10;
		byte[] is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_3_, -719602289), 1447980132));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_3_ << 16);
			return class527_sub8_sub10;
		}
		i_3_ = class579.anInt7672 * 1025329677 | 65536 + i_2_ << 10;
		class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_3_ << 16));
		if (class527_sub8_sub10 != null)
			return class527_sub8_sub10;
		is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_3_, 529794457), 1447980132));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_3_ << 16);
			return class527_sub8_sub10;
		}
		i_3_ = class579.anInt7672 * 1025329677 | 0x3fffc00;
		class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_3_ << 16));
		if (null != class527_sub8_sub10)
			return class527_sub8_sub10;
		is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_3_, 735829110), 1447980132));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_3_ << 16);
			return class527_sub8_sub10;
		}
		return null;
	}

	public static void method10827() {
		aClass199_8370.method3750((byte) -78);
	}

	static Class527_Sub8_Sub10 method10828(Class579 class579, int i, int i_4_) {
		int i_5_ = 1025329677 * class579.anInt7672 | i << 10;
		Class527_Sub8_Sub10 class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_5_ << 16));
		if (class527_sub8_sub10 != null)
			return class527_sub8_sub10;
		byte[] is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_5_, -98576490), 1447980132));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_5_ << 16);
			return class527_sub8_sub10;
		}
		i_5_ = class579.anInt7672 * 1025329677 | 65536 + i_4_ << 10;
		class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_5_ << 16));
		if (class527_sub8_sub10 != null)
			return class527_sub8_sub10;
		is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_5_, 689610504), 1447980132));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_5_ << 16);
			return class527_sub8_sub10;
		}
		i_5_ = class579.anInt7672 * 1025329677 | 0x3fffc00;
		class527_sub8_sub10 = ((Class527_Sub8_Sub10) aClass199_8370.method3748((long) i_5_ << 16));
		if (null != class527_sub8_sub10)
			return class527_sub8_sub10;
		is = (Class293_Sub1.aClass459_10041.method7512(Class293_Sub1.aClass459_10041.method7494(i_5_, -220509535), 1447980132));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class527_sub8_sub10 = Class222.method4152(is, -635407399);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class527_sub8_sub10.aClass579_11730 = class579;
			aClass199_8370.method3749(class527_sub8_sub10, (long) i_5_ << 16);
			return class527_sub8_sub10;
		}
		return null;
	}

	static Class527_Sub8_Sub10 method10829(byte[] is) {
		return new Class527_Sub8_Sub10(new RSByteBuffer(is), Class310.anInterface20_3490);
	}

	public static void method10830() {
		aClass199_8370.method3750((byte) -49);
	}

	static final void method10831(Class665 class665, byte i) {
		int i_6_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = method10837(i_6_, 530792865);
		Class240 class240 = Class183.aClass240Array2100[i_6_ >> 16];
		Class539.method8997(class243, class240, class665, (byte) 22);
	}

	static final void method10832(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 60549226) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2611 = Class103.method1800(string, class665, (byte) -49);
		class243.aBool2606 = true;
	}

	static final void method10833(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) ((Class234.method4347(-1408626088) - Class703.aClass219_8825.method4054(-1527274783) - 4017478168588280439L * Class542.aLong7237) / 1000L);
	}

	static final void method10834(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anInt8526 -= 204761682;
		int i_7_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_8_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string.substring(i_7_, i_8_);
	}

	static final void method10835(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		if (class674.aClass243_8587.anInt2675 * -927924265 == -1) {
			if (class665.aBool8549)
				throw new RuntimeException("");
			throw new RuntimeException("");
		}
		Class243 class243 = class674.method13842(1671201074);
		class243.aClass243Array2665[(class674.aClass243_8587.anInt2675 * -927924265)] = null;
		Class430.method6876(class243, (byte) 9);
	}

	static final void method10836(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_9_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_10_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_9_ & -1 - (1 << i_10_);
	}

	public static Class243 method10837(int i, int i_11_) {
		int i_12_ = i >> 16;
		if (Class183.aClass240Array2100[i_12_] == null || (Class183.aClass240Array2100[i_12_].method4386(i, -517380336) == null)) {
			boolean bool = Class189.method3666(i_12_, null, -374584257);
			if (!bool)
				return null;
		}
		return Class183.aClass240Array2100[i_12_].method4386(i, -221251032);
	}

	static boolean method10838(int i) {
		return Class35.anInt346 * -943170217 > 0;
	}

	static final void method10839(Class665 class665, short i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class194.method3701(class243, class240, class665, 1769813785);
	}
}
