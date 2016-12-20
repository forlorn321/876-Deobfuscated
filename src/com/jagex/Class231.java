/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class231 implements Interface27 {
	int anInt2356;
	int anInt2357;
	Class214 this$0;
	public static Class62_Sub2 aClass62_Sub2_2358;

	Class231(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		int i = class527_sub38.readUnsignedShort();
		if (i != 65535) {
			anInt2356 = i * -1881837471;
			anInt2357 = class527_sub38.readInt() * 714501647;
		} else {
			anInt2356 = 1881837471;
			anInt2357 = 0;
		}
	}

	public void method150(Class219 class219, int i) {
		if (anInt2356 * -1258212447 != -1) {
			try {
				class219.method3994(1636000752).method109(((Class333) this$0.anInterface28_2263.method154(-2094630047).method81(anInt2356 * -1258212447, 270076033)), -390283025 * anInt2357, 65280);
			} catch (Exception_Sub7 exception_sub7) {
				/* empty */
			}
		}
	}

	public void method151(Class219 class219) {
		if (anInt2356 * -1258212447 != -1) {
			try {
				class219.method3994(1636000752).method109(((Class333) this$0.anInterface28_2263.method154(-1148583170).method81(anInt2356 * -1258212447, -1066642591)), -390283025 * anInt2357, 65280);
			} catch (Exception_Sub7 exception_sub7) {
				/* empty */
			}
		}
	}

	static final void method4323(Class665 class665, int i) {
		Class572.method9608((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), -1, -1, false, 2046990586);
	}

	static final void method4324(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_1_ = Class204.aClass527_Sub31_2213.aClass700_Sub24_10591.method17139((byte) -37);
		if (i_1_ != i_0_) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub24_10591), i_0_, 1277419984);
			Class631.method10465(-1564572617);
			client.aBool11020 = false;
		}
	}

	static final void method4325(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_2_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_3_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		Class331_Sub3.method15766(8, i_2_, i_3_, "", 472161400);
	}

	public static final void method4326(Class527_Sub41 class527_sub41, boolean bool, boolean bool_4_, int i) {
		int i_5_ = class527_sub41.anInt10752 * 1307137747;
		int i_6_ = (int) (class527_sub41.aLong7106 * -8168620736534281759L);
		class527_sub41.method8735(-1889161967);
		if (bool)
			Class112.method2017(i_5_, 1779716750);
		Class700_Sub28.method17206(i_5_, (byte) -3);
		Class243 class243 = Class648.method10837(i_6_, 391980338);
		if (class243 != null)
			Class430.method6876(class243, (byte) 45);
		Class178.method3066(i_5_, 743617919);
		if (!bool_4_ && -1 != -2119864417 * client.anInt11237)
			Class316_Sub1.method15722(client.anInt11237 * -2119864417, 1, 1486862552);
		Class10 class10 = new Class10(client.aClass14_11276);
		for (Class527_Sub41 class527_sub41_7_ = (Class527_Sub41) class10.method673(-79299532); null != class527_sub41_7_; class527_sub41_7_ = (Class527_Sub41) class10.next()) {
			if (!class527_sub41_7_.method8736(-2126519674)) {
				class527_sub41_7_ = (Class527_Sub41) class10.method673(-664270696);
				if (class527_sub41_7_ == null)
					break;
			}
			if (1842780707 * class527_sub41_7_.anInt10753 == 3) {
				int i_8_ = (int) (-8168620736534281759L * class527_sub41_7_.aLong7106);
				if (i_5_ == i_8_ >>> 16)
					method4326(class527_sub41_7_, true, bool_4_, 1698568183);
			}
		}
	}

	public static int method4327(int i, int i_9_) {
		Class585.aTwitchWebcamFrameData7705 = null;
		Class585.aClass147_7688 = null;
		if (i < 0 || i >= Class585.aTwitchWebcamDeviceArray7709.length)
			return -1;
		return (Class585.aTwitchTV7698.StopWebcamDevice(939179397 * Class585.aTwitchWebcamDeviceArray7709[i].anInt1121));
	}

	public static boolean method4328(int i) {
		do {
			boolean bool;
			try {
				if (IcmpService_Sub1.available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (null != IcmpService_Sub1.anIcmpService_Sub1_10869)
			throw new IllegalStateException("");
		IcmpService_Sub1.anIcmpService_Sub1_10869 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class644());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	static final void method4329(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class403.method6540(class243, class240, class665, (byte) -40);
	}
}
