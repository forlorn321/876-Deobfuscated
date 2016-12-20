/* Class194 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamFrameData;

class Class194 implements Interface56 {
	Class226 this$0;

	public void method362(Object object, float[] fs, Object[] objects) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(971803770);
		float f = class483.method7869((short) 18156);
		float f_0_ = class483.method7915((byte) 58);
		Class442 class442_1_ = Class442.method7155(class442, this$0.method4197((byte) -40));
		float f_2_ = 0.0F;
		float f_3_ = class442_1_.method7160();
		if (f_3_ >= f_0_)
			f_2_ = 0.0F;
		if (f_3_ <= f)
			f_2_ = 1.0F;
		else {
			float f_4_ = 1.0F - 1.0F / (f_0_ - f) * (f_3_ - f);
			if ((double) f_4_ < 0.0 || (double) f_4_ > 1.0)
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			f_2_ = f_4_;
		}
		int i = 8192;
		float f_5_ = 0.0F;
		if (2 == -349191067 * Class30.anInt265) {
			float f_6_ = Class208_Sub10.aClass296_Sub1_9923.method5382(-1161775282);
			if (0.0F != class442_1_.aFloat4918 || class442_1_.aFloat4919 != 0.0F) {
				int i_7_ = (((int) ((double) (f_6_ * -1.0F) * 2607.5945876176133) - (int) (Math.atan2((double) class442_1_.aFloat4918, (double) class442_1_.aFloat4919) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_7_ > 8192)
					i_7_ = 16384 - i_7_;
				int i_8_;
				if (f_3_ <= 0.0F)
					i_8_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_8_ = 16384;
				else
					i_8_ = (int) (8192.0F + f_3_ * 8192.0F / 4096.0F);
				i = i_8_ * i_7_ / 8192 + (16384 - i_8_ >> 1);
			}
			f_5_ = 6.1035156E-5F * (float) i;
		} else {
			if (0.0F != class442_1_.aFloat4918 || class442_1_.aFloat4919 != 0.0F) {
				int i_9_ = ((-(-1728661517 * Class12.anInt176) - (int) (Math.atan2((double) class442_1_.aFloat4918, (double) class442_1_.aFloat4919) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_9_ > 8192)
					i_9_ = 16384 - i_9_;
				int i_10_;
				if (f_3_ <= 0.0F)
					i_10_ = 8192;
				else if (f_3_ >= 4096.0F)
					i_10_ = 16384;
				else
					i_10_ = (int) (8192.0F + f_3_ * 8192.0F / 4096.0F);
				i = i_9_ * i_10_ / 8192 + (16384 - i_10_ >> 1);
			}
			f_5_ = 6.1035156E-5F * (float) i;
		}
		fs[0] = (float) (i < 0 ? (double) f_2_ : (double) f_2_ * Math.sqrt((double) ((1.0F - f_5_) * 2.0F)));
		fs[1] = (float) (i < 0 ? (double) -f_2_ : (double) f_2_ * Math.sqrt((double) (2.0F * f_5_)));
	}

	public void method361(Object object, float[] fs, Object[] objects, int i) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(636804124);
		float f = class483.method7869((short) 29933);
		float f_11_ = class483.method7915((byte) 37);
		Class442 class442_12_ = Class442.method7155(class442, this$0.method4197((byte) -70));
		float f_13_ = 0.0F;
		float f_14_ = class442_12_.method7160();
		if (f_14_ >= f_11_)
			f_13_ = 0.0F;
		if (f_14_ <= f)
			f_13_ = 1.0F;
		else {
			float f_15_ = 1.0F - 1.0F / (f_11_ - f) * (f_14_ - f);
			if ((double) f_15_ < 0.0 || (double) f_15_ > 1.0)
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
			f_13_ = f_15_;
		}
		int i_16_ = 8192;
		float f_17_ = 0.0F;
		if (2 == -349191067 * Class30.anInt265) {
			float f_18_ = Class208_Sub10.aClass296_Sub1_9923.method5382(89433670);
			if (0.0F != class442_12_.aFloat4918 || class442_12_.aFloat4919 != 0.0F) {
				int i_19_ = (((int) ((double) (f_18_ * -1.0F) * 2607.5945876176133) - (int) (Math.atan2((double) class442_12_.aFloat4918, (double) class442_12_.aFloat4919) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_19_ > 8192)
					i_19_ = 16384 - i_19_;
				int i_20_;
				if (f_14_ <= 0.0F)
					i_20_ = 8192;
				else if (f_14_ >= 4096.0F)
					i_20_ = 16384;
				else
					i_20_ = (int) (8192.0F + f_14_ * 8192.0F / 4096.0F);
				i_16_ = i_20_ * i_19_ / 8192 + (16384 - i_20_ >> 1);
			}
			f_17_ = 6.1035156E-5F * (float) i_16_;
		} else {
			if (0.0F != class442_12_.aFloat4918 || class442_12_.aFloat4919 != 0.0F) {
				int i_21_ = ((-(-1728661517 * Class12.anInt176) - (int) (Math.atan2((double) class442_12_.aFloat4918, (double) class442_12_.aFloat4919) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_21_ > 8192)
					i_21_ = 16384 - i_21_;
				int i_22_;
				if (f_14_ <= 0.0F)
					i_22_ = 8192;
				else if (f_14_ >= 4096.0F)
					i_22_ = 16384;
				else
					i_22_ = (int) (8192.0F + f_14_ * 8192.0F / 4096.0F);
				i_16_ = i_21_ * i_22_ / 8192 + (16384 - i_22_ >> 1);
			}
			f_17_ = 6.1035156E-5F * (float) i_16_;
		}
		fs[0] = (float) (i_16_ < 0 ? (double) f_13_ : (double) f_13_ * Math.sqrt((double) ((1.0F - f_17_) * 2.0F)));
		fs[1] = (float) (i_16_ < 0 ? (double) -f_13_ : (double) f_13_ * Math.sqrt((double) (2.0F * f_17_)));
	}

	public void method363(Object object, float[] fs, Object[] objects) {
		Class483 class483 = (Class483) object;
		Class442 class442 = class483.method7868(1048304808);
		float f = class483.method7869((short) -5516);
		float f_23_ = class483.method7915((byte) -44);
		Class442 class442_24_ = Class442.method7155(class442, this$0.method4197((byte) -56));
		float f_25_ = 0.0F;
		float f_26_ = class442_24_.method7160();
		if (f_26_ >= f_23_)
			f_25_ = 0.0F;
		if (f_26_ <= f)
			f_25_ = 1.0F;
		else {
			float f_27_ = 1.0F - 1.0F / (f_23_ - f) * (f_26_ - f);
			if ((double) f_27_ < 0.0 || (double) f_27_ > 1.0)
				f_27_ = Math.min(Math.max(f_27_, 0.0F), 1.0F);
			f_25_ = f_27_;
		}
		int i = 8192;
		float f_28_ = 0.0F;
		if (2 == -349191067 * Class30.anInt265) {
			float f_29_ = Class208_Sub10.aClass296_Sub1_9923.method5382(975380593);
			if (0.0F != class442_24_.aFloat4918 || class442_24_.aFloat4919 != 0.0F) {
				int i_30_ = (((int) ((double) (f_29_ * -1.0F) * 2607.5945876176133) - (int) (Math.atan2((double) class442_24_.aFloat4918, (double) class442_24_.aFloat4919) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_30_ > 8192)
					i_30_ = 16384 - i_30_;
				int i_31_;
				if (f_26_ <= 0.0F)
					i_31_ = 8192;
				else if (f_26_ >= 4096.0F)
					i_31_ = 16384;
				else
					i_31_ = (int) (8192.0F + f_26_ * 8192.0F / 4096.0F);
				i = i_31_ * i_30_ / 8192 + (16384 - i_31_ >> 1);
			}
			f_28_ = 6.1035156E-5F * (float) i;
		} else {
			if (0.0F != class442_24_.aFloat4918 || class442_24_.aFloat4919 != 0.0F) {
				int i_32_ = ((-(-1728661517 * Class12.anInt176) - (int) (Math.atan2((double) class442_24_.aFloat4918, (double) class442_24_.aFloat4919) * 2607.5945876176133) - 4096) & 0x3fff);
				if (i_32_ > 8192)
					i_32_ = 16384 - i_32_;
				int i_33_;
				if (f_26_ <= 0.0F)
					i_33_ = 8192;
				else if (f_26_ >= 4096.0F)
					i_33_ = 16384;
				else
					i_33_ = (int) (8192.0F + f_26_ * 8192.0F / 4096.0F);
				i = i_32_ * i_33_ / 8192 + (16384 - i_33_ >> 1);
			}
			f_28_ = 6.1035156E-5F * (float) i;
		}
		fs[0] = (float) (i < 0 ? (double) f_25_ : (double) f_25_ * Math.sqrt((double) ((1.0F - f_28_) * 2.0F)));
		fs[1] = (float) (i < 0 ? (double) -f_25_ : (double) f_25_ * Math.sqrt((double) (2.0F * f_28_)));
	}

	Class194(Class226 class226) {
		this$0 = class226;
	}

	static final void method3700(Class665 class665, byte i) {
		int i_34_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_34_, 991074572);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2547 * 1865797529;
	}

	static final void method3701(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 1596060974) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2647 = Class103.method1800(string, class665, (byte) -67);
		class243.aBool2606 = true;
	}

	static final void method3702(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		Class100[] class100s = client.aClass100Array11025;
		for (int i_41_ = 0; i_41_ < class100s.length; i_41_++) {
			Class100 class100 = class100s[i_41_];
			if (null != class100 && 2 == -905648307 * class100.anInt1176) {
				Class638.method10576(class100.anInt1181 * 1209348687, 1807651153 * class100.anInt1180, -1019199 * class100.anInt1178, 0, 727733518 * class100.anInt1179, false, false, (short) 8458);
				if (client.aFloatArray11139[0] > -1.0F && client.anInt11019 % 20 < 10) {
					Class147 class147 = (Class631.aClass147Array8257[1280661885 * class100.anInt1177]);
					int i_42_ = (int) (client.aFloatArray11139[0] + (float) i - 12.0F);
					int i_43_ = (int) (client.aFloatArray11139[1] + (float) i_35_ - 28.0F);
					class147.method2415(i_42_, i_43_);
				}
			}
		}
	}

	public static int method3703(int i, int i_44_, int i_45_) {
		Class585.aTwitchWebcamFrameData7705 = new TwitchWebcamFrameData();
		if (i < 0 || i >= Class585.aTwitchWebcamDeviceArray7709.length)
			return -1;
		return (Class585.aTwitchTV7698.StartWebcamDevice((Class585.aTwitchWebcamDeviceArray7709[i].anInt1121 * 939179397), i_44_));
	}
}
