/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

class Class200 implements Interface55 {
	Class211 this$0;

	public void method361(Object object, float[] fs, Object[] objects) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) 0);
		float f = class479.method5808(-1567807913);
		float f_0_ = class479.method5782(1205041563);
		Class436 class436_1_ = this$0.method2985(-399101567);
		Class436 class436_2_ = Class436.method5252(class436, class436_1_);
		float f_3_ = 0.0F;
		int i = 8192;
		float f_4_ = class436_2_.method5291();
		float f_5_ = 0.0F;
		if (f_4_ >= f_0_)
			f_3_ = 0.0F;
		else {
			float f_6_ = ((Float) objects[0]).floatValue();
			float f_7_ = ((Float) objects[1]).floatValue();
			if (class436_1_.aFloat4850 > class436.aFloat4850 - f_6_ / 2.0F && class436_1_.aFloat4850 < f_6_ / 2.0F + class436.aFloat4850 && class436_1_.aFloat4853 > class436.aFloat4853 - f_7_ / 2.0F && (class436_1_.aFloat4853 < f_7_ / 2.0F + class436.aFloat4853)) {
				float f_8_ = Math.abs(class436_1_.aFloat4850 - (f_6_ / 2.0F + class436.aFloat4850));
				float f_9_ = Math.abs(class436_1_.aFloat4850 - (class436.aFloat4850 - f_6_ / 2.0F));
				float f_10_ = Math.abs(class436_1_.aFloat4853 - (class436.aFloat4850 + f_7_ / 2.0F));
				float f_11_ = Math.abs(class436_1_.aFloat4853 - (class436.aFloat4850 - f_7_ / 2.0F));
				float f_12_ = f_0_ - f;
				float f_13_ = Math.min(f_8_, f_9_);
				float f_14_ = Math.min(f_10_, f_11_);
				float f_15_ = 1.0F / f_12_ * f_13_;
				float f_16_ = f_14_ * (1.0F / f_12_);
				f_15_ = Math.min(Math.max(f_15_, 0.0F), 1.0F);
				f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
				f_3_ = Math.min(f_15_, f_16_);
			}
			if (0.0F != class436_2_.aFloat4850 || class436_2_.aFloat4853 != 0.0F) {
				if (2 == 155362615 * Class246.anInt2474) {
					float f_17_ = Class683.aClass301_Sub1_8651.method4092((byte) 101);
					if (class436_2_.aFloat4850 != 0.0F || 0.0F != class436_2_.aFloat4853) {
						int i_18_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_17_)) - (int) (Math.atan2((double) (class436_2_.aFloat4850), (double) (class436_2_.aFloat4853)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_18_ > 8192)
							i_18_ = 16384 - i_18_;
						int i_19_;
						if (f_4_ <= 0.0F)
							i_19_ = 8192;
						else if (f_4_ >= 4096.0F)
							i_19_ = 16384;
						else
							i_19_ = (int) (8192.0F + f_4_ * 8192.0F / 4096.0F);
						i = i_18_ * i_19_ / 8192 + (16384 - i_19_ >> 1);
					}
					f_5_ = (float) i * 6.1035156E-5F;
				} else {
					int i_20_ = (-(158223895 * Class144.anInt1681) - (int) (Math.atan2((double) class436_2_.aFloat4850, (double) class436_2_.aFloat4853) * 2607.5945876176133) - 4096) & 0x3fff;
					if (i_20_ > 8192)
						i_20_ = 16384 - i_20_;
					int i_21_;
					if (f_4_ <= 0.0F)
						i_21_ = 8192;
					else if (f_4_ >= 4096.0F)
						i_21_ = 16384;
					else
						i_21_ = (int) (8192.0F * f_4_ / 4096.0F + 8192.0F);
					i = (16384 - i_21_ >> 1) + i_20_ * i_21_ / 8192;
					f_5_ = 6.1035156E-5F * (float) i;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_3_ : (double) f_3_ * Math.sqrt((double) (1.0F - f_5_)));
		fs[1] = (float) (i < 0 ? (double) -f_3_ : (double) f_3_ * Math.sqrt((double) f_5_));
	}

	public void method360(Object object, float[] fs, Object[] objects, byte i) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -63);
		float f = class479.method5808(-1622258665);
		float f_22_ = class479.method5782(-1427985561);
		Class436 class436_23_ = this$0.method2985(-1049665633);
		Class436 class436_24_ = Class436.method5252(class436, class436_23_);
		float f_25_ = 0.0F;
		int i_26_ = 8192;
		float f_27_ = class436_24_.method5291();
		float f_28_ = 0.0F;
		if (f_27_ >= f_22_)
			f_25_ = 0.0F;
		else {
			float f_29_ = ((Float) objects[0]).floatValue();
			float f_30_ = ((Float) objects[1]).floatValue();
			if (class436_23_.aFloat4850 > class436.aFloat4850 - f_29_ / 2.0F && class436_23_.aFloat4850 < f_29_ / 2.0F + class436.aFloat4850 && class436_23_.aFloat4853 > class436.aFloat4853 - f_30_ / 2.0F && (class436_23_.aFloat4853 < f_30_ / 2.0F + class436.aFloat4853)) {
				float f_31_ = Math.abs(class436_23_.aFloat4850 - (f_29_ / 2.0F + class436.aFloat4850));
				float f_32_ = Math.abs(class436_23_.aFloat4850 - (class436.aFloat4850 - f_29_ / 2.0F));
				float f_33_ = Math.abs(class436_23_.aFloat4853 - (class436.aFloat4850 + f_30_ / 2.0F));
				float f_34_ = Math.abs(class436_23_.aFloat4853 - (class436.aFloat4850 - f_30_ / 2.0F));
				float f_35_ = f_22_ - f;
				float f_36_ = Math.min(f_31_, f_32_);
				float f_37_ = Math.min(f_33_, f_34_);
				float f_38_ = 1.0F / f_35_ * f_36_;
				float f_39_ = f_37_ * (1.0F / f_35_);
				f_38_ = Math.min(Math.max(f_38_, 0.0F), 1.0F);
				f_39_ = Math.min(Math.max(f_39_, 0.0F), 1.0F);
				f_25_ = Math.min(f_38_, f_39_);
			}
			if (0.0F != class436_24_.aFloat4850 || class436_24_.aFloat4853 != 0.0F) {
				if (2 == 155362615 * Class246.anInt2474) {
					float f_40_ = Class683.aClass301_Sub1_8651.method4092((byte) 24);
					if (class436_24_.aFloat4850 != 0.0F || 0.0F != class436_24_.aFloat4853) {
						int i_41_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_40_)) - (int) (Math.atan2((double) (class436_24_.aFloat4850), (double) (class436_24_.aFloat4853)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_41_ > 8192)
							i_41_ = 16384 - i_41_;
						int i_42_;
						if (f_27_ <= 0.0F)
							i_42_ = 8192;
						else if (f_27_ >= 4096.0F)
							i_42_ = 16384;
						else
							i_42_ = (int) (8192.0F + f_27_ * 8192.0F / 4096.0F);
						i_26_ = i_41_ * i_42_ / 8192 + (16384 - i_42_ >> 1);
					}
					f_28_ = (float) i_26_ * 6.1035156E-5F;
				} else {
					int i_43_ = ((-(158223895 * Class144.anInt1681) - (int) (Math.atan2((double) (class436_24_.aFloat4850), (double) (class436_24_.aFloat4853)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_43_ > 8192)
						i_43_ = 16384 - i_43_;
					int i_44_;
					if (f_27_ <= 0.0F)
						i_44_ = 8192;
					else if (f_27_ >= 4096.0F)
						i_44_ = 16384;
					else
						i_44_ = (int) (8192.0F * f_27_ / 4096.0F + 8192.0F);
					i_26_ = (16384 - i_44_ >> 1) + i_43_ * i_44_ / 8192;
					f_28_ = 6.1035156E-5F * (float) i_26_;
				}
			}
		}
		fs[0] = (float) (i_26_ < 0 ? (double) f_25_ : (double) f_25_ * Math.sqrt((double) (1.0F - f_28_)));
		fs[1] = (float) (i_26_ < 0 ? (double) -f_25_ : (double) f_25_ * Math.sqrt((double) f_28_));
	}

	public void method362(Object object, float[] fs, Object[] objects) {
		Class479 class479 = (Class479) object;
		Class436 class436 = class479.method5781((byte) -12);
		float f = class479.method5808(-1608241673);
		float f_45_ = class479.method5782(-1903546827);
		Class436 class436_46_ = this$0.method2985(-140113482);
		Class436 class436_47_ = Class436.method5252(class436, class436_46_);
		float f_48_ = 0.0F;
		int i = 8192;
		float f_49_ = class436_47_.method5291();
		float f_50_ = 0.0F;
		if (f_49_ >= f_45_)
			f_48_ = 0.0F;
		else {
			float f_51_ = ((Float) objects[0]).floatValue();
			float f_52_ = ((Float) objects[1]).floatValue();
			if (class436_46_.aFloat4850 > class436.aFloat4850 - f_51_ / 2.0F && class436_46_.aFloat4850 < f_51_ / 2.0F + class436.aFloat4850 && class436_46_.aFloat4853 > class436.aFloat4853 - f_52_ / 2.0F && (class436_46_.aFloat4853 < f_52_ / 2.0F + class436.aFloat4853)) {
				float f_53_ = Math.abs(class436_46_.aFloat4850 - (f_51_ / 2.0F + class436.aFloat4850));
				float f_54_ = Math.abs(class436_46_.aFloat4850 - (class436.aFloat4850 - f_51_ / 2.0F));
				float f_55_ = Math.abs(class436_46_.aFloat4853 - (class436.aFloat4850 + f_52_ / 2.0F));
				float f_56_ = Math.abs(class436_46_.aFloat4853 - (class436.aFloat4850 - f_52_ / 2.0F));
				float f_57_ = f_45_ - f;
				float f_58_ = Math.min(f_53_, f_54_);
				float f_59_ = Math.min(f_55_, f_56_);
				float f_60_ = 1.0F / f_57_ * f_58_;
				float f_61_ = f_59_ * (1.0F / f_57_);
				f_60_ = Math.min(Math.max(f_60_, 0.0F), 1.0F);
				f_61_ = Math.min(Math.max(f_61_, 0.0F), 1.0F);
				f_48_ = Math.min(f_60_, f_61_);
			}
			if (0.0F != class436_47_.aFloat4850 || class436_47_.aFloat4853 != 0.0F) {
				if (2 == 155362615 * Class246.anInt2474) {
					float f_62_ = Class683.aClass301_Sub1_8651.method4092((byte) -12);
					if (class436_47_.aFloat4850 != 0.0F || 0.0F != class436_47_.aFloat4853) {
						int i_63_ = (((int) (2607.5945876176133 * (double) (-1.0F * f_62_)) - (int) (Math.atan2((double) (class436_47_.aFloat4850), (double) (class436_47_.aFloat4853)) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_63_ > 8192)
							i_63_ = 16384 - i_63_;
						int i_64_;
						if (f_49_ <= 0.0F)
							i_64_ = 8192;
						else if (f_49_ >= 4096.0F)
							i_64_ = 16384;
						else
							i_64_ = (int) (8192.0F + f_49_ * 8192.0F / 4096.0F);
						i = i_63_ * i_64_ / 8192 + (16384 - i_64_ >> 1);
					}
					f_50_ = (float) i * 6.1035156E-5F;
				} else {
					int i_65_ = ((-(158223895 * Class144.anInt1681) - (int) (Math.atan2((double) (class436_47_.aFloat4850), (double) (class436_47_.aFloat4853)) * 2607.5945876176133) - 4096) & 0x3fff);
					if (i_65_ > 8192)
						i_65_ = 16384 - i_65_;
					int i_66_;
					if (f_49_ <= 0.0F)
						i_66_ = 8192;
					else if (f_49_ >= 4096.0F)
						i_66_ = 16384;
					else
						i_66_ = (int) (8192.0F * f_49_ / 4096.0F + 8192.0F);
					i = (16384 - i_66_ >> 1) + i_65_ * i_66_ / 8192;
					f_50_ = 6.1035156E-5F * (float) i;
				}
			}
		}
		fs[0] = (float) (i < 0 ? (double) f_48_ : (double) f_48_ * Math.sqrt((double) (1.0F - f_50_)));
		fs[1] = (float) (i < 0 ? (double) -f_48_ : (double) f_48_ * Math.sqrt((double) f_50_));
	}

	Class200(Class211 class211) {
		this$0 = class211;
	}

	static final void method2914(Class251 class251, Class234 class234, Class668 class668, int i) {
		class251.anInt2601 = -323602093;
		class251.anInt2602 = -436498141 * client.anInt11156;
		class251.anInt2603 = 0;
		if (-1 == class251.anInt2546 * -809980533 && !class234.aBool2379)
			Class34_Sub7.method10328(-1591767037 * class251.anInt2559, (short) -17373);
	}

	public static int method2915(int i, int i_67_, boolean bool, byte i_68_) {
		Class536_Sub1 class536_sub1 = Class659.method7970(i, bool, -973144680);
		if (class536_sub1 == null)
			return 0;
		if (i_67_ < 0 || i_67_ >= class536_sub1.anIntArray10300.length)
			return 0;
		return class536_sub1.anIntArray10300[i_67_];
	}

	public static SubIncomingPacket[] method2916() {
		return (new SubIncomingPacket[] { 
				SubIncomingPacket.aClass409_4307, //0
				SubIncomingPacket.aClass409_4308, 
				SubIncomingPacket.aClass409_4309, 
				SubIncomingPacket.aClass409_4313, 
				SubIncomingPacket.aClass409_4317, 
				SubIncomingPacket.aClass409_4312, 
				SubIncomingPacket.REMOVE_GROUND_ITEM, 
				SubIncomingPacket.aClass409_4314, 
				SubIncomingPacket.ADD_GROUND_ITEM, 
				SubIncomingPacket.aClass409_4316, 
				SubIncomingPacket.aClass409_4321, 
				SubIncomingPacket.aClass409_4318, 
				SubIncomingPacket.aClass409_4319, 
				SubIncomingPacket.aClass409_4320,
				SubIncomingPacket.aClass409_4311 
				});
	}
}
