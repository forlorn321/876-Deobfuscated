/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class119 {
	int anInt1441;
	int anInt1442;
	boolean aBool1443;
	float aFloat1444;
	boolean aBool1445;
	boolean aBool1446;
	int[] anIntArray1447;
	float aFloat1448;
	boolean aBool1449 = false;
	int anInt1450;
	float aFloat1451;
	float aFloat1452;
	float aFloat1453;
	int[] anIntArray1454;
	float aFloat1455;
	Class180_Sub1 aClass180_Sub1_1456;
	Class101 aClass101_1457;
	int anInt1458;
	int[] anIntArray1459;
	float[] aFloatArray1460;
	int anInt1461;
	int anInt1462;
	int[] anIntArray1463;
	int anInt1464;
	int anInt1465;
	float aFloat1466;
	boolean aBool1467 = true;
	int anInt1468;
	int anInt1469;
	int anInt1470;
	int[] anIntArray1471;
	int anInt1472;
	int anInt1473;
	float aFloat1474;
	int anInt1475;
	int anInt1476;
	boolean aBool1477;
	Class595 aClass595_1478;
	float aFloat1479;

	final void method2069(boolean bool, boolean bool_0_, boolean bool_1_, float f, float f_2_, float f_3_, float f_4_, float f_5_, float f_6_, float f_7_, float f_8_, float f_9_, int i) {
		if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_4_, (int) f, (int) f_5_, (int) f_2_, i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_5_, (int) f_2_, (int) f_6_, (int) f_3_, i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_6_, (int) f_3_, (int) f_4_, (int) f, i, (byte) 1);
		} else {
			float f_10_ = f_5_ - f_4_;
			float f_11_ = f_2_ - f;
			float f_12_ = f_6_ - f_4_;
			float f_13_ = f_3_ - f;
			float f_14_ = f_8_ - f_7_;
			float f_15_ = f_9_ - f_7_;
			float f_16_ = 0.0F;
			if (f_2_ != f)
				f_16_ = (f_5_ - f_4_) / (f_2_ - f);
			float f_17_ = 0.0F;
			if (f_3_ != f_2_)
				f_17_ = (f_6_ - f_5_) / (f_3_ - f_2_);
			float f_18_ = 0.0F;
			if (f_3_ != f)
				f_18_ = (f_4_ - f_6_) / (f - f_3_);
			float f_19_ = f_10_ * f_13_ - f_12_ * f_11_;
			if (f_19_ != 0.0F) {
				float f_20_ = (f_14_ * f_13_ - f_15_ * f_11_) / f_19_;
				float f_21_ = (f_15_ * f_10_ - f_14_ * f_12_) / f_19_;
				if (f <= f_2_ && f <= f_3_) {
					if (!(f >= (float) anInt1450)) {
						if (f_2_ > (float) anInt1450)
							f_2_ = (float) anInt1450;
						if (f_3_ > (float) anInt1450)
							f_3_ = (float) anInt1450;
						f_7_ = f_7_ - f_20_ * f_4_ + f_20_;
						if (f_2_ < f_3_) {
							f_6_ = f_4_;
							if (f < 0.0F) {
								f_6_ -= f_18_ * f;
								f_4_ -= f_16_ * f;
								f_7_ -= f_21_ * f;
								f = 0.0F;
							}
							if (f_2_ < 0.0F) {
								f_5_ -= f_17_ * f_2_;
								f_2_ = 0.0F;
							}
							if (f != f_2_ && f_18_ < f_16_ || f == f_2_ && f_18_ > f_17_) {
								f += 0.5F;
								f_2_ += 0.5F;
								f_3_ = (float) (int) (f_3_ + 0.5F) - f_2_;
								f_2_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_2_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f, i, 0, (int) f_6_, (int) f_4_, f_7_, f_20_);
									f_6_ += f_18_;
									f_4_ += f_16_;
									f_7_ += f_21_;
									f += (float) anInt1458;
								}
								while (--f_3_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f, i, 0, (int) f_6_, (int) f_5_, f_7_, f_20_);
									f_6_ += f_18_;
									f_5_ += f_17_;
									f_7_ += f_21_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_2_ += 0.5F;
								f_3_ = (float) (int) (f_3_ + 0.5F) - f_2_;
								f_2_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_2_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f, i, 0, (int) f_4_, (int) f_6_, f_7_, f_20_);
									f_6_ += f_18_;
									f_4_ += f_16_;
									f_7_ += f_21_;
									f += (float) anInt1458;
								}
								while (--f_3_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f, i, 0, (int) f_5_, (int) f_6_, f_7_, f_20_);
									f_6_ += f_18_;
									f_5_ += f_17_;
									f_7_ += f_21_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_5_ = f_4_;
							if (f < 0.0F) {
								f_5_ -= f_18_ * f;
								f_4_ -= f_16_ * f;
								f_7_ -= f_21_ * f;
								f = 0.0F;
							}
							if (f_3_ < 0.0F) {
								f_6_ -= f_17_ * f_3_;
								f_3_ = 0.0F;
							}
							if (f != f_3_ && f_18_ < f_16_ || f == f_3_ && f_17_ > f_16_) {
								f += 0.5F;
								f_3_ += 0.5F;
								f_2_ = (float) (int) (f_2_ + 0.5F) - f_3_;
								f_3_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_3_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f, i, 0, (int) f_5_, (int) f_4_, f_7_, f_20_);
									f_5_ += f_18_;
									f_4_ += f_16_;
									f_7_ += f_21_;
									f += (float) anInt1458;
								}
								while (--f_2_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f, i, 0, (int) f_6_, (int) f_4_, f_7_, f_20_);
									f_6_ += f_17_;
									f_4_ += f_16_;
									f_7_ += f_21_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_3_ += 0.5F;
								f_2_ = (float) (int) (f_2_ + 0.5F) - f_3_;
								f_3_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_3_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f, i, 0, (int) f_4_, (int) f_5_, f_7_, f_20_);
									f_5_ += f_18_;
									f_4_ += f_16_;
									f_7_ += f_21_;
									f += (float) anInt1458;
								}
								while (--f_2_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f, i, 0, (int) f_4_, (int) f_6_, f_7_, f_20_);
									f_6_ += f_17_;
									f_4_ += f_16_;
									f_7_ += f_21_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_2_ <= f_3_) {
					if (!(f_2_ >= (float) anInt1450)) {
						if (f_3_ > (float) anInt1450)
							f_3_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_8_ = f_8_ - f_20_ * f_5_ + f_20_;
						if (f_3_ < f) {
							f_4_ = f_5_;
							if (f_2_ < 0.0F) {
								f_4_ -= f_16_ * f_2_;
								f_5_ -= f_17_ * f_2_;
								f_8_ -= f_21_ * f_2_;
								f_2_ = 0.0F;
							}
							if (f_3_ < 0.0F) {
								f_6_ -= f_18_ * f_3_;
								f_3_ = 0.0F;
							}
							if (f_2_ != f_3_ && f_16_ < f_17_ || f_2_ == f_3_ && f_16_ > f_18_) {
								f_2_ += 0.5F;
								f_3_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_3_;
								f_3_ -= f_2_;
								f_2_ = (float) anIntArray1447[(int) f_2_];
								while (--f_3_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_2_, i, 0, (int) f_4_, (int) f_5_, f_8_, f_20_);
									f_4_ += f_16_;
									f_5_ += f_17_;
									f_8_ += f_21_;
									f_2_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_2_, i, 0, (int) f_4_, (int) f_6_, f_8_, f_20_);
									f_4_ += f_16_;
									f_6_ += f_18_;
									f_8_ += f_21_;
									f_2_ += (float) anInt1458;
								}
							} else {
								f_2_ += 0.5F;
								f_3_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_3_;
								f_3_ -= f_2_;
								f_2_ = (float) anIntArray1447[(int) f_2_];
								while (--f_3_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_2_, i, 0, (int) f_5_, (int) f_4_, f_8_, f_20_);
									f_4_ += f_16_;
									f_5_ += f_17_;
									f_8_ += f_21_;
									f_2_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_2_, i, 0, (int) f_6_, (int) f_4_, f_8_, f_20_);
									f_4_ += f_16_;
									f_6_ += f_18_;
									f_8_ += f_21_;
									f_2_ += (float) anInt1458;
								}
							}
						} else {
							f_6_ = f_5_;
							if (f_2_ < 0.0F) {
								f_6_ -= f_16_ * f_2_;
								f_5_ -= f_17_ * f_2_;
								f_8_ -= f_21_ * f_2_;
								f_2_ = 0.0F;
							}
							if (f < 0.0F) {
								f_4_ -= f_18_ * f;
								f = 0.0F;
							}
							if (f_16_ < f_17_) {
								f_2_ += 0.5F;
								f += 0.5F;
								f_3_ = (float) (int) (f_3_ + 0.5F) - f;
								f -= f_2_;
								f_2_ = (float) anIntArray1447[(int) f_2_];
								while (--f >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_2_, i, 0, (int) f_6_, (int) f_5_, f_8_, f_20_);
									f_6_ += f_16_;
									f_5_ += f_17_;
									f_8_ += f_21_;
									f_2_ += (float) anInt1458;
								}
								while (--f_3_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_2_, i, 0, (int) f_4_, (int) f_5_, f_8_, f_20_);
									f_4_ += f_18_;
									f_5_ += f_17_;
									f_8_ += f_21_;
									f_2_ += (float) anInt1458;
								}
							} else {
								f_2_ += 0.5F;
								f += 0.5F;
								f_3_ = (float) (int) (f_3_ + 0.5F) - f;
								f -= f_2_;
								f_2_ = (float) anIntArray1447[(int) f_2_];
								while (--f >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_2_, i, 0, (int) f_5_, (int) f_6_, f_8_, f_20_);
									f_6_ += f_16_;
									f_5_ += f_17_;
									f_8_ += f_21_;
									f_2_ += (float) anInt1458;
								}
								while (--f_3_ >= 0.0F) {
									method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_2_, i, 0, (int) f_5_, (int) f_4_, f_8_, f_20_);
									f_4_ += f_18_;
									f_5_ += f_17_;
									f_8_ += f_21_;
									f_2_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_3_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_2_ > (float) anInt1450)
						f_2_ = (float) anInt1450;
					f_9_ = f_9_ - f_20_ * f_6_ + f_20_;
					if (f < f_2_) {
						f_5_ = f_6_;
						if (f_3_ < 0.0F) {
							f_5_ -= f_17_ * f_3_;
							f_6_ -= f_18_ * f_3_;
							f_9_ -= f_21_ * f_3_;
							f_3_ = 0.0F;
						}
						if (f < 0.0F) {
							f_4_ -= f_16_ * f;
							f = 0.0F;
						}
						if (f_17_ < f_18_) {
							f_3_ += 0.5F;
							f += 0.5F;
							f_2_ = (float) (int) (f_2_ + 0.5F) - f;
							f -= f_3_;
							f_3_ = (float) anIntArray1447[(int) f_3_];
							while (--f >= 0.0F) {
								method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_3_, i, 0, (int) f_5_, (int) f_6_, f_9_, f_20_);
								f_5_ += f_17_;
								f_6_ += f_18_;
								f_9_ += f_21_;
								f_3_ += (float) anInt1458;
							}
							while (--f_2_ >= 0.0F) {
								method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_3_, i, 0, (int) f_5_, (int) f_4_, f_9_, f_20_);
								f_5_ += f_17_;
								f_4_ += f_16_;
								f_9_ += f_21_;
								f_3_ += (float) anInt1458;
							}
						} else {
							f_3_ += 0.5F;
							f += 0.5F;
							f_2_ = (float) (int) (f_2_ + 0.5F) - f;
							f -= f_3_;
							f_3_ = (float) anIntArray1447[(int) f_3_];
							while (--f >= 0.0F) {
								method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_3_, i, 0, (int) f_6_, (int) f_5_, f_9_, f_20_);
								f_5_ += f_17_;
								f_6_ += f_18_;
								f_9_ += f_21_;
								f_3_ += (float) anInt1458;
							}
							while (--f_2_ >= 0.0F) {
								method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_3_, i, 0, (int) f_4_, (int) f_5_, f_9_, f_20_);
								f_5_ += f_17_;
								f_4_ += f_16_;
								f_9_ += f_21_;
								f_3_ += (float) anInt1458;
							}
						}
					} else {
						f_4_ = f_6_;
						if (f_3_ < 0.0F) {
							f_4_ -= f_17_ * f_3_;
							f_6_ -= f_18_ * f_3_;
							f_9_ -= f_21_ * f_3_;
							f_3_ = 0.0F;
						}
						if (f_2_ < 0.0F) {
							f_5_ -= f_16_ * f_2_;
							f_2_ = 0.0F;
						}
						if (f_17_ < f_18_) {
							f_3_ += 0.5F;
							f_2_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_2_;
							f_2_ -= f_3_;
							f_3_ = (float) anIntArray1447[(int) f_3_];
							while (--f_2_ >= 0.0F) {
								method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_3_, i, 0, (int) f_4_, (int) f_6_, f_9_, f_20_);
								f_4_ += f_17_;
								f_6_ += f_18_;
								f_9_ += f_21_;
								f_3_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_3_, i, 0, (int) f_5_, (int) f_6_, f_9_, f_20_);
								f_5_ += f_16_;
								f_6_ += f_18_;
								f_9_ += f_21_;
								f_3_ += (float) anInt1458;
							}
						} else {
							f_3_ += 0.5F;
							f_2_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_2_;
							f_2_ -= f_3_;
							f_3_ = (float) anIntArray1447[(int) f_3_];
							while (--f_2_ >= 0.0F) {
								method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_3_, i, 0, (int) f_6_, (int) f_4_, f_9_, f_20_);
								f_4_ += f_17_;
								f_6_ += f_18_;
								f_9_ += f_21_;
								f_3_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2078(bool, bool_0_, bool_1_, anIntArray1459, (int) f_3_, i, 0, (int) f_6_, (int) f_5_, f_9_, f_20_);
								f_5_ += f_16_;
								f_6_ += f_18_;
								f_9_ += f_21_;
								f_3_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2070(boolean bool, boolean bool_22_, boolean bool_23_, float f, float f_24_, float f_25_, float f_26_, float f_27_, float f_28_, float f_29_, float f_30_, float f_31_, int i, int i_32_, int i_33_) {
		if (!bool)
			method2077(false, bool_22_, bool_23_, f, f_24_, f_25_, f_26_, f_27_, f_28_, f_29_, f_30_, f_31_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_26_, (int) f, (int) f_27_, (int) f_24_, ~0xffffff | i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_27_, (int) f_24_, (int) f_28_, (int) f_25_, ~0xffffff | i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_28_, (int) f_25_, (int) f_26_, (int) f, ~0xffffff | i, (byte) 1);
		} else {
			float f_34_ = f_27_ - f_26_;
			float f_35_ = f_24_ - f;
			float f_36_ = f_28_ - f_26_;
			float f_37_ = f_25_ - f;
			float f_38_ = f_30_ - f_29_;
			float f_39_ = f_31_ - f_29_;
			float f_40_ = (float) ((i_32_ & 0xff0000) - (i & 0xff0000));
			float f_41_ = (float) ((i_33_ & 0xff0000) - (i & 0xff0000));
			float f_42_ = (float) ((i_32_ & 0xff00) - (i & 0xff00));
			float f_43_ = (float) ((i_33_ & 0xff00) - (i & 0xff00));
			float f_44_ = (float) ((i_32_ & 0xff) - (i & 0xff));
			float f_45_ = (float) ((i_33_ & 0xff) - (i & 0xff));
			float f_46_;
			if (f_25_ != f_24_)
				f_46_ = (f_28_ - f_27_) / (f_25_ - f_24_);
			else
				f_46_ = 0.0F;
			float f_47_;
			if (f_24_ != f)
				f_47_ = f_34_ / f_35_;
			else
				f_47_ = 0.0F;
			float f_48_;
			if (f_25_ != f)
				f_48_ = f_36_ / f_37_;
			else
				f_48_ = 0.0F;
			float f_49_ = f_34_ * f_37_ - f_36_ * f_35_;
			if (f_49_ != 0.0F) {
				float f_50_ = (f_38_ * f_37_ - f_39_ * f_35_) / f_49_;
				float f_51_ = (f_39_ * f_34_ - f_38_ * f_36_) / f_49_;
				float f_52_ = (f_40_ * f_37_ - f_41_ * f_35_) / f_49_;
				float f_53_ = (f_41_ * f_34_ - f_40_ * f_36_) / f_49_;
				float f_54_ = (f_42_ * f_37_ - f_43_ * f_35_) / f_49_;
				float f_55_ = (f_43_ * f_34_ - f_42_ * f_36_) / f_49_;
				float f_56_ = (f_44_ * f_37_ - f_45_ * f_35_) / f_49_;
				float f_57_ = (f_45_ * f_34_ - f_44_ * f_36_) / f_49_;
				if (f <= f_24_ && f <= f_25_) {
					if (!(f >= (float) anInt1450)) {
						if (f_24_ > (float) anInt1450)
							f_24_ = (float) anInt1450;
						if (f_25_ > (float) anInt1450)
							f_25_ = (float) anInt1450;
						f_29_ = f_29_ - f_50_ * f_26_ + f_50_;
						float f_58_ = (float) (i & 0xff0000) - f_52_ * f_26_ + f_52_;
						float f_59_ = (float) (i & 0xff00) - f_54_ * f_26_ + f_54_;
						float f_60_ = (float) (i & 0xff) - f_56_ * f_26_ + f_56_;
						if (f_24_ < f_25_) {
							f_28_ = f_26_;
							if (f < 0.0F) {
								f_28_ -= f_48_ * f;
								f_26_ -= f_47_ * f;
								f_29_ -= f_51_ * f;
								f_58_ -= f_53_ * f;
								f_59_ -= f_55_ * f;
								f_60_ -= f_57_ * f;
								f = 0.0F;
							}
							if (f_24_ < 0.0F) {
								f_27_ -= f_46_ * f_24_;
								f_24_ = 0.0F;
							}
							if (f != f_24_ && f_48_ < f_47_ || f == f_24_ && f_48_ > f_46_) {
								f += 0.5F;
								f_24_ += 0.5F;
								f_25_ = (float) (int) (f_25_ + 0.5F) - f_24_;
								f_24_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_24_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f, 0, 0, (int) f_28_, (int) f_26_, f_29_, f_50_, f_58_, f_52_, f_59_, f_54_, f_60_, f_56_);
									f_28_ += f_48_;
									f_26_ += f_47_;
									f_29_ += f_51_;
									f_58_ += f_53_;
									f_59_ += f_55_;
									f_60_ += f_57_;
									f += (float) anInt1458;
								}
								while (--f_25_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f, 0, 0, (int) f_28_, (int) f_27_, f_29_, f_50_, f_58_, f_52_, f_59_, f_54_, f_60_, f_56_);
									f_28_ += f_48_;
									f_27_ += f_46_;
									f_29_ += f_51_;
									f_58_ += f_53_;
									f_59_ += f_55_;
									f_60_ += f_57_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_24_ += 0.5F;
								f_25_ = (float) (int) (f_25_ + 0.5F) - f_24_;
								f_24_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_24_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f, 0, 0, (int) f_26_, (int) f_28_, f_29_, f_50_, f_58_, f_52_, f_59_, f_54_, f_60_, f_56_);
									f_28_ += f_48_;
									f_26_ += f_47_;
									f_29_ += f_51_;
									f_58_ += f_53_;
									f_59_ += f_55_;
									f_60_ += f_57_;
									f += (float) anInt1458;
								}
								while (--f_25_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f, 0, 0, (int) f_27_, (int) f_28_, f_29_, f_50_, f_58_, f_52_, f_59_, f_54_, f_60_, f_56_);
									f_28_ += f_48_;
									f_27_ += f_46_;
									f_29_ += f_51_;
									f_58_ += f_53_;
									f_59_ += f_55_;
									f_60_ += f_57_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_27_ = f_26_;
							if (f < 0.0F) {
								f_27_ -= f_48_ * f;
								f_26_ -= f_47_ * f;
								f_29_ -= f_51_ * f;
								f_58_ -= f_53_ * f;
								f_59_ -= f_55_ * f;
								f_60_ -= f_57_ * f;
								f = 0.0F;
							}
							if (f_25_ < 0.0F) {
								f_28_ -= f_46_ * f_25_;
								f_25_ = 0.0F;
							}
							if (f != f_25_ && f_48_ < f_47_ || f == f_25_ && f_46_ > f_47_) {
								f += 0.5F;
								f_25_ += 0.5F;
								f_24_ = (float) (int) (f_24_ + 0.5F) - f_25_;
								f_25_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_25_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f, 0, 0, (int) f_27_, (int) f_26_, f_29_, f_50_, f_58_, f_52_, f_59_, f_54_, f_60_, f_56_);
									f_27_ += f_48_;
									f_26_ += f_47_;
									f_29_ += f_51_;
									f_58_ += f_53_;
									f_59_ += f_55_;
									f_60_ += f_57_;
									f += (float) anInt1458;
								}
								while (--f_24_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f, 0, 0, (int) f_28_, (int) f_26_, f_29_, f_50_, f_58_, f_52_, f_59_, f_54_, f_60_, f_56_);
									f_28_ += f_46_;
									f_26_ += f_47_;
									f_29_ += f_51_;
									f_58_ += f_53_;
									f_59_ += f_55_;
									f_60_ += f_57_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_25_ += 0.5F;
								f_24_ = (float) (int) (f_24_ + 0.5F) - f_25_;
								f_25_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_25_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f, 0, 0, (int) f_26_, (int) f_27_, f_29_, f_50_, f_58_, f_52_, f_59_, f_54_, f_60_, f_56_);
									f_27_ += f_48_;
									f_26_ += f_47_;
									f_29_ += f_51_;
									f_58_ += f_53_;
									f_59_ += f_55_;
									f_60_ += f_57_;
									f += (float) anInt1458;
								}
								while (--f_24_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f, 0, 0, (int) f_26_, (int) f_28_, f_29_, f_50_, f_58_, f_52_, f_59_, f_54_, f_60_, f_56_);
									f_28_ += f_46_;
									f_26_ += f_47_;
									f_29_ += f_51_;
									f_58_ += f_53_;
									f_59_ += f_55_;
									f_60_ += f_57_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_24_ <= f_25_) {
					if (!(f_24_ >= (float) anInt1450)) {
						if (f_25_ > (float) anInt1450)
							f_25_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_30_ = f_30_ - f_50_ * f_27_ + f_50_;
						float f_61_ = ((float) (i_32_ & 0xff0000) - f_52_ * f_27_ + f_52_);
						float f_62_ = (float) (i_32_ & 0xff00) - f_54_ * f_27_ + f_54_;
						float f_63_ = (float) (i_32_ & 0xff) - f_56_ * f_27_ + f_56_;
						if (f_25_ < f) {
							f_26_ = f_27_;
							if (f_24_ < 0.0F) {
								f_26_ -= f_47_ * f_24_;
								f_27_ -= f_46_ * f_24_;
								f_30_ -= f_51_ * f_24_;
								f_61_ -= f_53_ * f_24_;
								f_62_ -= f_55_ * f_24_;
								f_63_ -= f_57_ * f_24_;
								f_24_ = 0.0F;
							}
							if (f_25_ < 0.0F) {
								f_28_ -= f_48_ * f_25_;
								f_25_ = 0.0F;
							}
							if (f_24_ != f_25_ && f_47_ < f_46_ || f_24_ == f_25_ && f_47_ > f_48_) {
								f_24_ += 0.5F;
								f_25_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_25_;
								f_25_ -= f_24_;
								f_24_ = (float) anIntArray1447[(int) f_24_];
								while (--f_25_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f_24_, 0, 0, (int) f_26_, (int) f_27_, f_30_, f_50_, f_61_, f_52_, f_62_, f_54_, f_63_, f_56_);
									f_26_ += f_47_;
									f_27_ += f_46_;
									f_30_ += f_51_;
									f_61_ += f_53_;
									f_62_ += f_55_;
									f_63_ += f_57_;
									f_24_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f_24_, 0, 0, (int) f_26_, (int) f_28_, f_30_, f_50_, f_61_, f_52_, f_62_, f_54_, f_63_, f_56_);
									f_26_ += f_47_;
									f_28_ += f_48_;
									f_30_ += f_51_;
									f_61_ += f_53_;
									f_62_ += f_55_;
									f_63_ += f_57_;
									f_24_ += (float) anInt1458;
								}
							} else {
								f_24_ += 0.5F;
								f_25_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_25_;
								f_25_ -= f_24_;
								f_24_ = (float) anIntArray1447[(int) f_24_];
								while (--f_25_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f_24_, 0, 0, (int) f_27_, (int) f_26_, f_30_, f_50_, f_61_, f_52_, f_62_, f_54_, f_63_, f_56_);
									f_26_ += f_47_;
									f_27_ += f_46_;
									f_30_ += f_51_;
									f_61_ += f_53_;
									f_62_ += f_55_;
									f_63_ += f_57_;
									f_24_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f_24_, 0, 0, (int) f_28_, (int) f_26_, f_30_, f_50_, f_61_, f_52_, f_62_, f_54_, f_63_, f_56_);
									f_26_ += f_47_;
									f_28_ += f_48_;
									f_30_ += f_51_;
									f_61_ += f_53_;
									f_62_ += f_55_;
									f_63_ += f_57_;
									f_24_ += (float) anInt1458;
								}
							}
						} else {
							f_28_ = f_27_;
							if (f_24_ < 0.0F) {
								f_28_ -= f_47_ * f_24_;
								f_27_ -= f_46_ * f_24_;
								f_30_ -= f_51_ * f_24_;
								f_61_ -= f_53_ * f_24_;
								f_62_ -= f_55_ * f_24_;
								f_63_ -= f_57_ * f_24_;
								f_24_ = 0.0F;
							}
							if (f < 0.0F) {
								f_26_ -= f_48_ * f;
								f = 0.0F;
							}
							if (f_47_ < f_46_) {
								f_24_ += 0.5F;
								f += 0.5F;
								f_25_ = (float) (int) (f_25_ + 0.5F) - f;
								f -= f_24_;
								f_24_ = (float) anIntArray1447[(int) f_24_];
								while (--f >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f_24_, 0, 0, (int) f_28_, (int) f_27_, f_30_, f_50_, f_61_, f_52_, f_62_, f_54_, f_63_, f_56_);
									f_28_ += f_47_;
									f_27_ += f_46_;
									f_30_ += f_51_;
									f_61_ += f_53_;
									f_62_ += f_55_;
									f_63_ += f_57_;
									f_24_ += (float) anInt1458;
								}
								while (--f_25_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f_24_, 0, 0, (int) f_26_, (int) f_27_, f_30_, f_50_, f_61_, f_52_, f_62_, f_54_, f_63_, f_56_);
									f_26_ += f_48_;
									f_27_ += f_46_;
									f_30_ += f_51_;
									f_61_ += f_53_;
									f_62_ += f_55_;
									f_63_ += f_57_;
									f_24_ += (float) anInt1458;
								}
							} else {
								f_24_ += 0.5F;
								f += 0.5F;
								f_25_ = (float) (int) (f_25_ + 0.5F) - f;
								f -= f_24_;
								f_24_ = (float) anIntArray1447[(int) f_24_];
								while (--f >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f_24_, 0, 0, (int) f_27_, (int) f_28_, f_30_, f_50_, f_61_, f_52_, f_62_, f_54_, f_63_, f_56_);
									f_28_ += f_47_;
									f_27_ += f_46_;
									f_30_ += f_51_;
									f_61_ += f_53_;
									f_62_ += f_55_;
									f_63_ += f_57_;
									f_24_ += (float) anInt1458;
								}
								while (--f_25_ >= 0.0F) {
									method2076(bool_22_, bool_23_, anIntArray1459, (int) f_24_, 0, 0, (int) f_27_, (int) f_26_, f_30_, f_50_, f_61_, f_52_, f_62_, f_54_, f_63_, f_56_);
									f_26_ += f_48_;
									f_27_ += f_46_;
									f_30_ += f_51_;
									f_61_ += f_53_;
									f_62_ += f_55_;
									f_63_ += f_57_;
									f_24_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_25_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_24_ > (float) anInt1450)
						f_24_ = (float) anInt1450;
					f_31_ = f_31_ - f_50_ * f_28_ + f_50_;
					float f_64_ = (float) (i_33_ & 0xff0000) - f_52_ * f_28_ + f_52_;
					float f_65_ = (float) (i_33_ & 0xff00) - f_54_ * f_28_ + f_54_;
					float f_66_ = (float) (i_33_ & 0xff) - f_56_ * f_28_ + f_56_;
					if (f < f_24_) {
						f_27_ = f_28_;
						if (f_25_ < 0.0F) {
							f_27_ -= f_46_ * f_25_;
							f_28_ -= f_48_ * f_25_;
							f_31_ -= f_51_ * f_25_;
							f_64_ -= f_53_ * f_25_;
							f_65_ -= f_55_ * f_25_;
							f_66_ -= f_57_ * f_25_;
							f_25_ = 0.0F;
						}
						if (f < 0.0F) {
							f_26_ -= f_47_ * f;
							f = 0.0F;
						}
						if (f_46_ < f_48_) {
							f_25_ += 0.5F;
							f += 0.5F;
							f_24_ = (float) (int) (f_24_ + 0.5F) - f;
							f -= f_25_;
							f_25_ = (float) anIntArray1447[(int) f_25_];
							while (--f >= 0.0F) {
								method2076(bool_22_, bool_23_, anIntArray1459, (int) f_25_, 0, 0, (int) f_27_, (int) f_28_, f_31_, f_50_, f_64_, f_52_, f_65_, f_54_, f_66_, f_56_);
								f_27_ += f_46_;
								f_28_ += f_48_;
								f_31_ += f_51_;
								f_64_ += f_53_;
								f_65_ += f_55_;
								f_66_ += f_57_;
								f_25_ += (float) anInt1458;
							}
							while (--f_24_ >= 0.0F) {
								method2076(bool_22_, bool_23_, anIntArray1459, (int) f_25_, 0, 0, (int) f_27_, (int) f_26_, f_31_, f_50_, f_64_, f_52_, f_65_, f_54_, f_66_, f_56_);
								f_27_ += f_46_;
								f_26_ += f_47_;
								f_31_ += f_51_;
								f_64_ += f_53_;
								f_65_ += f_55_;
								f_66_ += f_57_;
								f_25_ += (float) anInt1458;
							}
						} else {
							f_25_ += 0.5F;
							f += 0.5F;
							f_24_ = (float) (int) (f_24_ + 0.5F) - f;
							f -= f_25_;
							f_25_ = (float) anIntArray1447[(int) f_25_];
							while (--f >= 0.0F) {
								method2076(bool_22_, bool_23_, anIntArray1459, (int) f_25_, 0, 0, (int) f_28_, (int) f_27_, f_31_, f_50_, f_64_, f_52_, f_65_, f_54_, f_66_, f_56_);
								f_27_ += f_46_;
								f_28_ += f_48_;
								f_31_ += f_51_;
								f_64_ += f_53_;
								f_65_ += f_55_;
								f_66_ += f_57_;
								f_25_ += (float) anInt1458;
							}
							while (--f_24_ >= 0.0F) {
								method2076(bool_22_, bool_23_, anIntArray1459, (int) f_25_, 0, 0, (int) f_26_, (int) f_27_, f_31_, f_50_, f_64_, f_52_, f_65_, f_54_, f_66_, f_56_);
								f_27_ += f_46_;
								f_26_ += f_47_;
								f_31_ += f_51_;
								f_64_ += f_53_;
								f_65_ += f_55_;
								f_66_ += f_57_;
								f_25_ += (float) anInt1458;
							}
						}
					} else {
						f_26_ = f_28_;
						if (f_25_ < 0.0F) {
							f_26_ -= f_46_ * f_25_;
							f_28_ -= f_48_ * f_25_;
							f_31_ -= f_51_ * f_25_;
							f_64_ -= f_53_ * f_25_;
							f_65_ -= f_55_ * f_25_;
							f_66_ -= f_57_ * f_25_;
							f_25_ = 0.0F;
						}
						if (f_24_ < 0.0F) {
							f_27_ -= f_47_ * f_24_;
							f_24_ = 0.0F;
						}
						if (f_46_ < f_48_) {
							f_25_ += 0.5F;
							f_24_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_24_;
							f_24_ -= f_25_;
							f_25_ = (float) anIntArray1447[(int) f_25_];
							while (--f_24_ >= 0.0F) {
								method2076(bool_22_, bool_23_, anIntArray1459, (int) f_25_, 0, 0, (int) f_26_, (int) f_28_, f_31_, f_50_, f_64_, f_52_, f_65_, f_54_, f_66_, f_56_);
								f_26_ += f_46_;
								f_28_ += f_48_;
								f_31_ += f_51_;
								f_64_ += f_53_;
								f_65_ += f_55_;
								f_66_ += f_57_;
								f_25_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2076(bool_22_, bool_23_, anIntArray1459, (int) f_25_, 0, 0, (int) f_27_, (int) f_28_, f_31_, f_50_, f_64_, f_52_, f_65_, f_54_, f_66_, f_56_);
								f_27_ += f_47_;
								f_28_ += f_48_;
								f_31_ += f_51_;
								f_64_ += f_53_;
								f_65_ += f_55_;
								f_66_ += f_57_;
								f_25_ += (float) anInt1458;
							}
						} else {
							f_25_ += 0.5F;
							f_24_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_24_;
							f_24_ -= f_25_;
							f_25_ = (float) anIntArray1447[(int) f_25_];
							while (--f_24_ >= 0.0F) {
								method2076(bool_22_, bool_23_, anIntArray1459, (int) f_25_, 0, 0, (int) f_28_, (int) f_26_, f_31_, f_50_, f_64_, f_52_, f_65_, f_54_, f_66_, f_56_);
								f_26_ += f_46_;
								f_28_ += f_48_;
								f_31_ += f_51_;
								f_64_ += f_53_;
								f_65_ += f_55_;
								f_66_ += f_57_;
								f_25_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2076(bool_22_, bool_23_, anIntArray1459, (int) f_25_, 0, 0, (int) f_28_, (int) f_27_, f_31_, f_50_, f_64_, f_52_, f_65_, f_54_, f_66_, f_56_);
								f_27_ += f_47_;
								f_28_ += f_48_;
								f_31_ += f_51_;
								f_64_ += f_53_;
								f_65_ += f_55_;
								f_66_ += f_57_;
								f_25_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	int method2071() {
		return anIntArray1447[0] / anInt1458;
	}

	int method2072() {
		return anIntArray1447[0] % anInt1458;
	}

	final void method2073(boolean bool, boolean bool_67_, boolean bool_68_, float f, float f_69_, float f_70_, float f_71_, float f_72_, float f_73_, float f_74_, float f_75_, float f_76_, float f_77_, float f_78_, float f_79_) {
		if (!bool)
			method2077(false, bool_67_, bool_68_, f, f_69_, f_70_, f_71_, f_72_, f_73_, f_74_, f_75_, f_76_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_71_, (int) f, (int) f_72_, (int) f_69_, (Class656.anIntArray8393[(int) f_77_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_72_, (int) f_69_, (int) f_73_, (int) f_70_, (Class656.anIntArray8393[(int) f_77_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_73_, (int) f_70_, (int) f_71_, (int) f, (Class656.anIntArray8393[(int) f_77_ & 0xffff]), (byte) 1);
		} else {
			float f_80_ = f_72_ - f_71_;
			float f_81_ = f_69_ - f;
			float f_82_ = f_73_ - f_71_;
			float f_83_ = f_70_ - f;
			float f_84_ = f_78_ - f_77_;
			float f_85_ = f_79_ - f_77_;
			float f_86_ = f_75_ - f_74_;
			float f_87_ = f_76_ - f_74_;
			float f_88_;
			if (f_70_ != f_69_)
				f_88_ = (f_73_ - f_72_) / (f_70_ - f_69_);
			else
				f_88_ = 0.0F;
			float f_89_;
			if (f_69_ != f)
				f_89_ = f_80_ / f_81_;
			else
				f_89_ = 0.0F;
			float f_90_;
			if (f_70_ != f)
				f_90_ = f_82_ / f_83_;
			else
				f_90_ = 0.0F;
			float f_91_ = f_80_ * f_83_ - f_82_ * f_81_;
			if (f_91_ != 0.0F) {
				float f_92_ = (f_84_ * f_83_ - f_85_ * f_81_) / f_91_;
				float f_93_ = (f_85_ * f_80_ - f_84_ * f_82_) / f_91_;
				float f_94_ = (f_86_ * f_83_ - f_87_ * f_81_) / f_91_;
				float f_95_ = (f_87_ * f_80_ - f_86_ * f_82_) / f_91_;
				if (f <= f_69_ && f <= f_70_) {
					if (!(f >= (float) anInt1450)) {
						if (f_69_ > (float) anInt1450)
							f_69_ = (float) anInt1450;
						if (f_70_ > (float) anInt1450)
							f_70_ = (float) anInt1450;
						f_77_ = f_77_ - f_92_ * f_71_ + f_92_;
						f_74_ = f_74_ - f_94_ * f_71_ + f_94_;
						if (f_69_ < f_70_) {
							f_73_ = f_71_;
							if (f < 0.0F) {
								f_73_ -= f_90_ * f;
								f_71_ -= f_89_ * f;
								f_77_ -= f_93_ * f;
								f_74_ -= f_95_ * f;
								f = 0.0F;
							}
							if (f_69_ < 0.0F) {
								f_72_ -= f_88_ * f_69_;
								f_69_ = 0.0F;
							}
							if (f != f_69_ && f_90_ < f_89_ || f == f_69_ && f_90_ > f_88_) {
								f += 0.5F;
								f_69_ += 0.5F;
								f_70_ = (float) (int) (f_70_ + 0.5F) - f_69_;
								f_69_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_69_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f, 0, 0, (int) f_73_, (int) f_71_, f_77_, f_92_, f_74_, f_94_);
									f_73_ += f_90_;
									f_71_ += f_89_;
									f_77_ += f_93_;
									f_74_ += f_95_;
									f += (float) anInt1458;
								}
								while (--f_70_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f, 0, 0, (int) f_73_, (int) f_72_, f_77_, f_92_, f_74_, f_94_);
									f_73_ += f_90_;
									f_72_ += f_88_;
									f_77_ += f_93_;
									f_74_ += f_95_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_69_ += 0.5F;
								f_70_ = (float) (int) (f_70_ + 0.5F) - f_69_;
								f_69_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_69_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f, 0, 0, (int) f_71_, (int) f_73_, f_77_, f_92_, f_74_, f_94_);
									f_73_ += f_90_;
									f_71_ += f_89_;
									f_77_ += f_93_;
									f_74_ += f_95_;
									f += (float) anInt1458;
								}
								while (--f_70_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f, 0, 0, (int) f_72_, (int) f_73_, f_77_, f_92_, f_74_, f_94_);
									f_73_ += f_90_;
									f_72_ += f_88_;
									f_77_ += f_93_;
									f_74_ += f_95_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_72_ = f_71_;
							if (f < 0.0F) {
								f_72_ -= f_90_ * f;
								f_71_ -= f_89_ * f;
								f_77_ -= f_93_ * f;
								f_74_ -= f_95_ * f;
								f = 0.0F;
							}
							if (f_70_ < 0.0F) {
								f_73_ -= f_88_ * f_70_;
								f_70_ = 0.0F;
							}
							if (f != f_70_ && f_90_ < f_89_ || f == f_70_ && f_88_ > f_89_) {
								f += 0.5F;
								f_70_ += 0.5F;
								f_69_ = (float) (int) (f_69_ + 0.5F) - f_70_;
								f_70_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_70_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f, 0, 0, (int) f_72_, (int) f_71_, f_77_, f_92_, f_74_, f_94_);
									f_72_ += f_90_;
									f_71_ += f_89_;
									f_77_ += f_93_;
									f_74_ += f_95_;
									f += (float) anInt1458;
								}
								while (--f_69_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f, 0, 0, (int) f_73_, (int) f_71_, f_77_, f_92_, f_74_, f_94_);
									f_73_ += f_88_;
									f_71_ += f_89_;
									f_77_ += f_93_;
									f_74_ += f_95_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_70_ += 0.5F;
								f_69_ = (float) (int) (f_69_ + 0.5F) - f_70_;
								f_70_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_70_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f, 0, 0, (int) f_71_, (int) f_72_, f_77_, f_92_, f_74_, f_94_);
									f_72_ += f_90_;
									f_71_ += f_89_;
									f_77_ += f_93_;
									f_74_ += f_95_;
									f += (float) anInt1458;
								}
								while (--f_69_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f, 0, 0, (int) f_71_, (int) f_73_, f_77_, f_92_, f_74_, f_94_);
									f_73_ += f_88_;
									f_71_ += f_89_;
									f_77_ += f_93_;
									f_74_ += f_95_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_69_ <= f_70_) {
					if (!(f_69_ >= (float) anInt1450)) {
						if (f_70_ > (float) anInt1450)
							f_70_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_78_ = f_78_ - f_92_ * f_72_ + f_92_;
						f_75_ = f_75_ - f_94_ * f_72_ + f_94_;
						if (f_70_ < f) {
							f_71_ = f_72_;
							if (f_69_ < 0.0F) {
								f_71_ -= f_89_ * f_69_;
								f_72_ -= f_88_ * f_69_;
								f_78_ -= f_93_ * f_69_;
								f_75_ -= f_95_ * f_69_;
								f_69_ = 0.0F;
							}
							if (f_70_ < 0.0F) {
								f_73_ -= f_90_ * f_70_;
								f_70_ = 0.0F;
							}
							if (f_69_ != f_70_ && f_89_ < f_88_ || f_69_ == f_70_ && f_89_ > f_90_) {
								f_69_ += 0.5F;
								f_70_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_70_;
								f_70_ -= f_69_;
								f_69_ = (float) anIntArray1447[(int) f_69_];
								while (--f_70_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f_69_, 0, 0, (int) f_71_, (int) f_72_, f_78_, f_92_, f_75_, f_94_);
									f_71_ += f_89_;
									f_72_ += f_88_;
									f_78_ += f_93_;
									f_75_ += f_95_;
									f_69_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f_69_, 0, 0, (int) f_71_, (int) f_73_, f_78_, f_92_, f_75_, f_94_);
									f_71_ += f_89_;
									f_73_ += f_90_;
									f_78_ += f_93_;
									f_75_ += f_95_;
									f_69_ += (float) anInt1458;
								}
							} else {
								f_69_ += 0.5F;
								f_70_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_70_;
								f_70_ -= f_69_;
								f_69_ = (float) anIntArray1447[(int) f_69_];
								while (--f_70_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f_69_, 0, 0, (int) f_72_, (int) f_71_, f_78_, f_92_, f_75_, f_94_);
									f_71_ += f_89_;
									f_72_ += f_88_;
									f_78_ += f_93_;
									f_75_ += f_95_;
									f_69_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f_69_, 0, 0, (int) f_73_, (int) f_71_, f_78_, f_92_, f_75_, f_94_);
									f_71_ += f_89_;
									f_73_ += f_90_;
									f_78_ += f_93_;
									f_75_ += f_95_;
									f_69_ += (float) anInt1458;
								}
							}
						} else {
							f_73_ = f_72_;
							if (f_69_ < 0.0F) {
								f_73_ -= f_89_ * f_69_;
								f_72_ -= f_88_ * f_69_;
								f_78_ -= f_93_ * f_69_;
								f_75_ -= f_95_ * f_69_;
								f_69_ = 0.0F;
							}
							if (f < 0.0F) {
								f_71_ -= f_90_ * f;
								f = 0.0F;
							}
							if (f_89_ < f_88_) {
								f_69_ += 0.5F;
								f += 0.5F;
								f_70_ = (float) (int) (f_70_ + 0.5F) - f;
								f -= f_69_;
								f_69_ = (float) anIntArray1447[(int) f_69_];
								while (--f >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f_69_, 0, 0, (int) f_73_, (int) f_72_, f_78_, f_92_, f_75_, f_94_);
									f_73_ += f_89_;
									f_72_ += f_88_;
									f_78_ += f_93_;
									f_75_ += f_95_;
									f_69_ += (float) anInt1458;
								}
								while (--f_70_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f_69_, 0, 0, (int) f_71_, (int) f_72_, f_78_, f_92_, f_75_, f_94_);
									f_71_ += f_90_;
									f_72_ += f_88_;
									f_78_ += f_93_;
									f_75_ += f_95_;
									f_69_ += (float) anInt1458;
								}
							} else {
								f_69_ += 0.5F;
								f += 0.5F;
								f_70_ = (float) (int) (f_70_ + 0.5F) - f;
								f -= f_69_;
								f_69_ = (float) anIntArray1447[(int) f_69_];
								while (--f >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f_69_, 0, 0, (int) f_72_, (int) f_73_, f_78_, f_92_, f_75_, f_94_);
									f_73_ += f_89_;
									f_72_ += f_88_;
									f_78_ += f_93_;
									f_75_ += f_95_;
									f_69_ += (float) anInt1458;
								}
								while (--f_70_ >= 0.0F) {
									method2098(bool_67_, bool_68_, anIntArray1459, (int) f_69_, 0, 0, (int) f_72_, (int) f_71_, f_78_, f_92_, f_75_, f_94_);
									f_71_ += f_90_;
									f_72_ += f_88_;
									f_78_ += f_93_;
									f_75_ += f_95_;
									f_69_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_70_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_69_ > (float) anInt1450)
						f_69_ = (float) anInt1450;
					f_79_ = f_79_ - f_92_ * f_73_ + f_92_;
					f_76_ = f_76_ - f_94_ * f_73_ + f_94_;
					if (f < f_69_) {
						f_72_ = f_73_;
						if (f_70_ < 0.0F) {
							f_72_ -= f_88_ * f_70_;
							f_73_ -= f_90_ * f_70_;
							f_79_ -= f_93_ * f_70_;
							f_76_ -= f_95_ * f_70_;
							f_70_ = 0.0F;
						}
						if (f < 0.0F) {
							f_71_ -= f_89_ * f;
							f = 0.0F;
						}
						if (f_88_ < f_90_) {
							f_70_ += 0.5F;
							f += 0.5F;
							f_69_ = (float) (int) (f_69_ + 0.5F) - f;
							f -= f_70_;
							f_70_ = (float) anIntArray1447[(int) f_70_];
							while (--f >= 0.0F) {
								method2098(bool_67_, bool_68_, anIntArray1459, (int) f_70_, 0, 0, (int) f_72_, (int) f_73_, f_79_, f_92_, f_76_, f_94_);
								f_72_ += f_88_;
								f_73_ += f_90_;
								f_79_ += f_93_;
								f_76_ += f_95_;
								f_70_ += (float) anInt1458;
							}
							while (--f_69_ >= 0.0F) {
								method2098(bool_67_, bool_68_, anIntArray1459, (int) f_70_, 0, 0, (int) f_72_, (int) f_71_, f_79_, f_92_, f_76_, f_94_);
								f_72_ += f_88_;
								f_71_ += f_89_;
								f_79_ += f_93_;
								f_76_ += f_95_;
								f_70_ += (float) anInt1458;
							}
						} else {
							f_70_ += 0.5F;
							f += 0.5F;
							f_69_ = (float) (int) (f_69_ + 0.5F) - f;
							f -= f_70_;
							f_70_ = (float) anIntArray1447[(int) f_70_];
							while (--f >= 0.0F) {
								method2098(bool_67_, bool_68_, anIntArray1459, (int) f_70_, 0, 0, (int) f_73_, (int) f_72_, f_79_, f_92_, f_76_, f_94_);
								f_72_ += f_88_;
								f_73_ += f_90_;
								f_79_ += f_93_;
								f_76_ += f_95_;
								f_70_ += (float) anInt1458;
							}
							while (--f_69_ >= 0.0F) {
								method2098(bool_67_, bool_68_, anIntArray1459, (int) f_70_, 0, 0, (int) f_71_, (int) f_72_, f_79_, f_92_, f_76_, f_94_);
								f_72_ += f_88_;
								f_71_ += f_89_;
								f_79_ += f_93_;
								f_76_ += f_95_;
								f_70_ += (float) anInt1458;
							}
						}
					} else {
						f_71_ = f_73_;
						if (f_70_ < 0.0F) {
							f_71_ -= f_88_ * f_70_;
							f_73_ -= f_90_ * f_70_;
							f_79_ -= f_93_ * f_70_;
							f_76_ -= f_95_ * f_70_;
							f_70_ = 0.0F;
						}
						if (f_69_ < 0.0F) {
							f_72_ -= f_89_ * f_69_;
							f_69_ = 0.0F;
						}
						if (f_88_ < f_90_) {
							f_70_ += 0.5F;
							f_69_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_69_;
							f_69_ -= f_70_;
							f_70_ = (float) anIntArray1447[(int) f_70_];
							while (--f_69_ >= 0.0F) {
								method2098(bool_67_, bool_68_, anIntArray1459, (int) f_70_, 0, 0, (int) f_71_, (int) f_73_, f_79_, f_92_, f_76_, f_94_);
								f_71_ += f_88_;
								f_73_ += f_90_;
								f_79_ += f_93_;
								f_76_ += f_95_;
								f_70_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_67_, bool_68_, anIntArray1459, (int) f_70_, 0, 0, (int) f_72_, (int) f_73_, f_79_, f_92_, f_76_, f_94_);
								f_72_ += f_89_;
								f_73_ += f_90_;
								f_79_ += f_93_;
								f_76_ += f_95_;
								f_70_ += (float) anInt1458;
							}
						} else {
							f_70_ += 0.5F;
							f_69_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_69_;
							f_69_ -= f_70_;
							f_70_ = (float) anIntArray1447[(int) f_70_];
							while (--f_69_ >= 0.0F) {
								method2098(bool_67_, bool_68_, anIntArray1459, (int) f_70_, 0, 0, (int) f_73_, (int) f_71_, f_79_, f_92_, f_76_, f_94_);
								f_71_ += f_88_;
								f_73_ += f_90_;
								f_79_ += f_93_;
								f_76_ += f_95_;
								f_70_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_67_, bool_68_, anIntArray1459, (int) f_70_, 0, 0, (int) f_73_, (int) f_72_, f_79_, f_92_, f_76_, f_94_);
								f_72_ += f_89_;
								f_73_ += f_90_;
								f_79_ += f_93_;
								f_76_ += f_95_;
								f_70_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2074(boolean bool, boolean bool_96_, boolean bool_97_, float f, float f_98_, float f_99_, float f_100_, float f_101_, float f_102_, float f_103_, float f_104_, float f_105_, float f_106_, float f_107_, float f_108_) {
		if (!bool)
			method2077(false, bool_96_, bool_97_, f, f_98_, f_99_, f_100_, f_101_, f_102_, f_103_, f_104_, f_105_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_100_, (int) f, (int) f_101_, (int) f_98_, (Class656.anIntArray8393[(int) f_106_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_101_, (int) f_98_, (int) f_102_, (int) f_99_, (Class656.anIntArray8393[(int) f_106_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_102_, (int) f_99_, (int) f_100_, (int) f, (Class656.anIntArray8393[(int) f_106_ & 0xffff]), (byte) 1);
		} else {
			float f_109_ = f_101_ - f_100_;
			float f_110_ = f_98_ - f;
			float f_111_ = f_102_ - f_100_;
			float f_112_ = f_99_ - f;
			float f_113_ = f_107_ - f_106_;
			float f_114_ = f_108_ - f_106_;
			float f_115_ = f_104_ - f_103_;
			float f_116_ = f_105_ - f_103_;
			float f_117_;
			if (f_99_ != f_98_)
				f_117_ = (f_102_ - f_101_) / (f_99_ - f_98_);
			else
				f_117_ = 0.0F;
			float f_118_;
			if (f_98_ != f)
				f_118_ = f_109_ / f_110_;
			else
				f_118_ = 0.0F;
			float f_119_;
			if (f_99_ != f)
				f_119_ = f_111_ / f_112_;
			else
				f_119_ = 0.0F;
			float f_120_ = f_109_ * f_112_ - f_111_ * f_110_;
			if (f_120_ != 0.0F) {
				float f_121_ = (f_113_ * f_112_ - f_114_ * f_110_) / f_120_;
				float f_122_ = (f_114_ * f_109_ - f_113_ * f_111_) / f_120_;
				float f_123_ = (f_115_ * f_112_ - f_116_ * f_110_) / f_120_;
				float f_124_ = (f_116_ * f_109_ - f_115_ * f_111_) / f_120_;
				if (f <= f_98_ && f <= f_99_) {
					if (!(f >= (float) anInt1450)) {
						if (f_98_ > (float) anInt1450)
							f_98_ = (float) anInt1450;
						if (f_99_ > (float) anInt1450)
							f_99_ = (float) anInt1450;
						f_106_ = f_106_ - f_121_ * f_100_ + f_121_;
						f_103_ = f_103_ - f_123_ * f_100_ + f_123_;
						if (f_98_ < f_99_) {
							f_102_ = f_100_;
							if (f < 0.0F) {
								f_102_ -= f_119_ * f;
								f_100_ -= f_118_ * f;
								f_106_ -= f_122_ * f;
								f_103_ -= f_124_ * f;
								f = 0.0F;
							}
							if (f_98_ < 0.0F) {
								f_101_ -= f_117_ * f_98_;
								f_98_ = 0.0F;
							}
							if (f != f_98_ && f_119_ < f_118_ || f == f_98_ && f_119_ > f_117_) {
								f += 0.5F;
								f_98_ += 0.5F;
								f_99_ = (float) (int) (f_99_ + 0.5F) - f_98_;
								f_98_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_98_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f, 0, 0, (int) f_102_, (int) f_100_, f_106_, f_121_, f_103_, f_123_);
									f_102_ += f_119_;
									f_100_ += f_118_;
									f_106_ += f_122_;
									f_103_ += f_124_;
									f += (float) anInt1458;
								}
								while (--f_99_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f, 0, 0, (int) f_102_, (int) f_101_, f_106_, f_121_, f_103_, f_123_);
									f_102_ += f_119_;
									f_101_ += f_117_;
									f_106_ += f_122_;
									f_103_ += f_124_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_98_ += 0.5F;
								f_99_ = (float) (int) (f_99_ + 0.5F) - f_98_;
								f_98_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_98_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f, 0, 0, (int) f_100_, (int) f_102_, f_106_, f_121_, f_103_, f_123_);
									f_102_ += f_119_;
									f_100_ += f_118_;
									f_106_ += f_122_;
									f_103_ += f_124_;
									f += (float) anInt1458;
								}
								while (--f_99_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f, 0, 0, (int) f_101_, (int) f_102_, f_106_, f_121_, f_103_, f_123_);
									f_102_ += f_119_;
									f_101_ += f_117_;
									f_106_ += f_122_;
									f_103_ += f_124_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_101_ = f_100_;
							if (f < 0.0F) {
								f_101_ -= f_119_ * f;
								f_100_ -= f_118_ * f;
								f_106_ -= f_122_ * f;
								f_103_ -= f_124_ * f;
								f = 0.0F;
							}
							if (f_99_ < 0.0F) {
								f_102_ -= f_117_ * f_99_;
								f_99_ = 0.0F;
							}
							if (f != f_99_ && f_119_ < f_118_ || f == f_99_ && f_117_ > f_118_) {
								f += 0.5F;
								f_99_ += 0.5F;
								f_98_ = (float) (int) (f_98_ + 0.5F) - f_99_;
								f_99_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_99_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f, 0, 0, (int) f_101_, (int) f_100_, f_106_, f_121_, f_103_, f_123_);
									f_101_ += f_119_;
									f_100_ += f_118_;
									f_106_ += f_122_;
									f_103_ += f_124_;
									f += (float) anInt1458;
								}
								while (--f_98_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f, 0, 0, (int) f_102_, (int) f_100_, f_106_, f_121_, f_103_, f_123_);
									f_102_ += f_117_;
									f_100_ += f_118_;
									f_106_ += f_122_;
									f_103_ += f_124_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_99_ += 0.5F;
								f_98_ = (float) (int) (f_98_ + 0.5F) - f_99_;
								f_99_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_99_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f, 0, 0, (int) f_100_, (int) f_101_, f_106_, f_121_, f_103_, f_123_);
									f_101_ += f_119_;
									f_100_ += f_118_;
									f_106_ += f_122_;
									f_103_ += f_124_;
									f += (float) anInt1458;
								}
								while (--f_98_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f, 0, 0, (int) f_100_, (int) f_102_, f_106_, f_121_, f_103_, f_123_);
									f_102_ += f_117_;
									f_100_ += f_118_;
									f_106_ += f_122_;
									f_103_ += f_124_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_98_ <= f_99_) {
					if (!(f_98_ >= (float) anInt1450)) {
						if (f_99_ > (float) anInt1450)
							f_99_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_107_ = f_107_ - f_121_ * f_101_ + f_121_;
						f_104_ = f_104_ - f_123_ * f_101_ + f_123_;
						if (f_99_ < f) {
							f_100_ = f_101_;
							if (f_98_ < 0.0F) {
								f_100_ -= f_118_ * f_98_;
								f_101_ -= f_117_ * f_98_;
								f_107_ -= f_122_ * f_98_;
								f_104_ -= f_124_ * f_98_;
								f_98_ = 0.0F;
							}
							if (f_99_ < 0.0F) {
								f_102_ -= f_119_ * f_99_;
								f_99_ = 0.0F;
							}
							if (f_98_ != f_99_ && f_118_ < f_117_ || f_98_ == f_99_ && f_118_ > f_119_) {
								f_98_ += 0.5F;
								f_99_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_99_;
								f_99_ -= f_98_;
								f_98_ = (float) anIntArray1447[(int) f_98_];
								while (--f_99_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f_98_, 0, 0, (int) f_100_, (int) f_101_, f_107_, f_121_, f_104_, f_123_);
									f_100_ += f_118_;
									f_101_ += f_117_;
									f_107_ += f_122_;
									f_104_ += f_124_;
									f_98_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f_98_, 0, 0, (int) f_100_, (int) f_102_, f_107_, f_121_, f_104_, f_123_);
									f_100_ += f_118_;
									f_102_ += f_119_;
									f_107_ += f_122_;
									f_104_ += f_124_;
									f_98_ += (float) anInt1458;
								}
							} else {
								f_98_ += 0.5F;
								f_99_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_99_;
								f_99_ -= f_98_;
								f_98_ = (float) anIntArray1447[(int) f_98_];
								while (--f_99_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f_98_, 0, 0, (int) f_101_, (int) f_100_, f_107_, f_121_, f_104_, f_123_);
									f_100_ += f_118_;
									f_101_ += f_117_;
									f_107_ += f_122_;
									f_104_ += f_124_;
									f_98_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f_98_, 0, 0, (int) f_102_, (int) f_100_, f_107_, f_121_, f_104_, f_123_);
									f_100_ += f_118_;
									f_102_ += f_119_;
									f_107_ += f_122_;
									f_104_ += f_124_;
									f_98_ += (float) anInt1458;
								}
							}
						} else {
							f_102_ = f_101_;
							if (f_98_ < 0.0F) {
								f_102_ -= f_118_ * f_98_;
								f_101_ -= f_117_ * f_98_;
								f_107_ -= f_122_ * f_98_;
								f_104_ -= f_124_ * f_98_;
								f_98_ = 0.0F;
							}
							if (f < 0.0F) {
								f_100_ -= f_119_ * f;
								f = 0.0F;
							}
							if (f_118_ < f_117_) {
								f_98_ += 0.5F;
								f += 0.5F;
								f_99_ = (float) (int) (f_99_ + 0.5F) - f;
								f -= f_98_;
								f_98_ = (float) anIntArray1447[(int) f_98_];
								while (--f >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f_98_, 0, 0, (int) f_102_, (int) f_101_, f_107_, f_121_, f_104_, f_123_);
									f_102_ += f_118_;
									f_101_ += f_117_;
									f_107_ += f_122_;
									f_104_ += f_124_;
									f_98_ += (float) anInt1458;
								}
								while (--f_99_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f_98_, 0, 0, (int) f_100_, (int) f_101_, f_107_, f_121_, f_104_, f_123_);
									f_100_ += f_119_;
									f_101_ += f_117_;
									f_107_ += f_122_;
									f_104_ += f_124_;
									f_98_ += (float) anInt1458;
								}
							} else {
								f_98_ += 0.5F;
								f += 0.5F;
								f_99_ = (float) (int) (f_99_ + 0.5F) - f;
								f -= f_98_;
								f_98_ = (float) anIntArray1447[(int) f_98_];
								while (--f >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f_98_, 0, 0, (int) f_101_, (int) f_102_, f_107_, f_121_, f_104_, f_123_);
									f_102_ += f_118_;
									f_101_ += f_117_;
									f_107_ += f_122_;
									f_104_ += f_124_;
									f_98_ += (float) anInt1458;
								}
								while (--f_99_ >= 0.0F) {
									method2098(bool_96_, bool_97_, anIntArray1459, (int) f_98_, 0, 0, (int) f_101_, (int) f_100_, f_107_, f_121_, f_104_, f_123_);
									f_100_ += f_119_;
									f_101_ += f_117_;
									f_107_ += f_122_;
									f_104_ += f_124_;
									f_98_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_99_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_98_ > (float) anInt1450)
						f_98_ = (float) anInt1450;
					f_108_ = f_108_ - f_121_ * f_102_ + f_121_;
					f_105_ = f_105_ - f_123_ * f_102_ + f_123_;
					if (f < f_98_) {
						f_101_ = f_102_;
						if (f_99_ < 0.0F) {
							f_101_ -= f_117_ * f_99_;
							f_102_ -= f_119_ * f_99_;
							f_108_ -= f_122_ * f_99_;
							f_105_ -= f_124_ * f_99_;
							f_99_ = 0.0F;
						}
						if (f < 0.0F) {
							f_100_ -= f_118_ * f;
							f = 0.0F;
						}
						if (f_117_ < f_119_) {
							f_99_ += 0.5F;
							f += 0.5F;
							f_98_ = (float) (int) (f_98_ + 0.5F) - f;
							f -= f_99_;
							f_99_ = (float) anIntArray1447[(int) f_99_];
							while (--f >= 0.0F) {
								method2098(bool_96_, bool_97_, anIntArray1459, (int) f_99_, 0, 0, (int) f_101_, (int) f_102_, f_108_, f_121_, f_105_, f_123_);
								f_101_ += f_117_;
								f_102_ += f_119_;
								f_108_ += f_122_;
								f_105_ += f_124_;
								f_99_ += (float) anInt1458;
							}
							while (--f_98_ >= 0.0F) {
								method2098(bool_96_, bool_97_, anIntArray1459, (int) f_99_, 0, 0, (int) f_101_, (int) f_100_, f_108_, f_121_, f_105_, f_123_);
								f_101_ += f_117_;
								f_100_ += f_118_;
								f_108_ += f_122_;
								f_105_ += f_124_;
								f_99_ += (float) anInt1458;
							}
						} else {
							f_99_ += 0.5F;
							f += 0.5F;
							f_98_ = (float) (int) (f_98_ + 0.5F) - f;
							f -= f_99_;
							f_99_ = (float) anIntArray1447[(int) f_99_];
							while (--f >= 0.0F) {
								method2098(bool_96_, bool_97_, anIntArray1459, (int) f_99_, 0, 0, (int) f_102_, (int) f_101_, f_108_, f_121_, f_105_, f_123_);
								f_101_ += f_117_;
								f_102_ += f_119_;
								f_108_ += f_122_;
								f_105_ += f_124_;
								f_99_ += (float) anInt1458;
							}
							while (--f_98_ >= 0.0F) {
								method2098(bool_96_, bool_97_, anIntArray1459, (int) f_99_, 0, 0, (int) f_100_, (int) f_101_, f_108_, f_121_, f_105_, f_123_);
								f_101_ += f_117_;
								f_100_ += f_118_;
								f_108_ += f_122_;
								f_105_ += f_124_;
								f_99_ += (float) anInt1458;
							}
						}
					} else {
						f_100_ = f_102_;
						if (f_99_ < 0.0F) {
							f_100_ -= f_117_ * f_99_;
							f_102_ -= f_119_ * f_99_;
							f_108_ -= f_122_ * f_99_;
							f_105_ -= f_124_ * f_99_;
							f_99_ = 0.0F;
						}
						if (f_98_ < 0.0F) {
							f_101_ -= f_118_ * f_98_;
							f_98_ = 0.0F;
						}
						if (f_117_ < f_119_) {
							f_99_ += 0.5F;
							f_98_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_98_;
							f_98_ -= f_99_;
							f_99_ = (float) anIntArray1447[(int) f_99_];
							while (--f_98_ >= 0.0F) {
								method2098(bool_96_, bool_97_, anIntArray1459, (int) f_99_, 0, 0, (int) f_100_, (int) f_102_, f_108_, f_121_, f_105_, f_123_);
								f_100_ += f_117_;
								f_102_ += f_119_;
								f_108_ += f_122_;
								f_105_ += f_124_;
								f_99_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_96_, bool_97_, anIntArray1459, (int) f_99_, 0, 0, (int) f_101_, (int) f_102_, f_108_, f_121_, f_105_, f_123_);
								f_101_ += f_118_;
								f_102_ += f_119_;
								f_108_ += f_122_;
								f_105_ += f_124_;
								f_99_ += (float) anInt1458;
							}
						} else {
							f_99_ += 0.5F;
							f_98_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_98_;
							f_98_ -= f_99_;
							f_99_ = (float) anIntArray1447[(int) f_99_];
							while (--f_98_ >= 0.0F) {
								method2098(bool_96_, bool_97_, anIntArray1459, (int) f_99_, 0, 0, (int) f_102_, (int) f_100_, f_108_, f_121_, f_105_, f_123_);
								f_100_ += f_117_;
								f_102_ += f_119_;
								f_108_ += f_122_;
								f_105_ += f_124_;
								f_99_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_96_, bool_97_, anIntArray1459, (int) f_99_, 0, 0, (int) f_102_, (int) f_101_, f_108_, f_121_, f_105_, f_123_);
								f_101_ += f_118_;
								f_102_ += f_119_;
								f_108_ += f_122_;
								f_105_ += f_124_;
								f_99_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	int method2075() {
		return anIntArray1447[0] / anInt1458;
	}

	final void method2076(boolean bool, boolean bool_125_, int[] is, int i, int i_126_, int i_127_, int i_128_, int i_129_, float f, float f_130_, float f_131_, float f_132_, float f_133_, float f_134_, float f_135_, float f_136_) {
		if (aBool1445) {
			if (i_129_ > anInt1442)
				i_129_ = anInt1442;
			if (i_128_ < 0)
				i_128_ = 0;
		}
		if (i_128_ < i_129_) {
			if (aBool1446) {
				i += i_128_;
				f_131_ += f_132_ * (float) i_128_;
				f_133_ += f_134_ * (float) i_128_;
				f_135_ += f_136_ * (float) i_128_;
				if (aBool1467) {
					i_127_ = i_129_ - i_128_ >> 2;
					f_132_ *= 4.0F;
					f_134_ *= 4.0F;
					f_136_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_127_ > 0) {
							do {
								i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
								is[i++] = i_126_;
								is[i++] = i_126_;
								is[i++] = i_126_;
								is[i++] = i_126_;
							} while (--i_127_ > 0);
						}
						i_127_ = i_129_ - i_128_ & 0x3;
						if (i_127_ > 0) {
							i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							do
								is[i++] = i_126_;
							while (--i_127_ > 0);
						}
					} else if (!aBool1443) {
						int i_137_ = anInt1441;
						int i_138_ = 256 - anInt1441;
						if (i_127_ > 0) {
							do {
								i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
								i_126_ = (((i_126_ & 0xff00ff) * i_138_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_138_ >> 8 & 0xff00));
								int i_139_ = is[i];
								if (bool_125_) {
									is[i++] = ((i_138_ | i_139_ >> 24) << 24 | (i_126_ + (((i_139_ & 0xff00ff) * i_137_ >> 8) & 0xff00ff) + (((i_139_ & 0xff00) * i_137_ >> 8) & 0xff00)));
									i_139_ = is[i];
									is[i++] = ((i_138_ | i_139_ >> 24) << 24 | (i_126_ + (((i_139_ & 0xff00ff) * i_137_ >> 8) & 0xff00ff) + (((i_139_ & 0xff00) * i_137_ >> 8) & 0xff00)));
									i_139_ = is[i];
									is[i++] = ((i_138_ | i_139_ >> 24) << 24 | (i_126_ + (((i_139_ & 0xff00ff) * i_137_ >> 8) & 0xff00ff) + (((i_139_ & 0xff00) * i_137_ >> 8) & 0xff00)));
									i_139_ = is[i];
									is[i++] = ((i_138_ | i_139_ >> 24) << 24 | (i_126_ + (((i_139_ & 0xff00ff) * i_137_ >> 8) & 0xff00ff) + (((i_139_ & 0xff00) * i_137_ >> 8) & 0xff00)));
								} else {
									is[i++] = (i_126_ + ((i_139_ & 0xff00ff) * i_137_ >> 8 & 0xff00ff) + ((i_139_ & 0xff00) * i_137_ >> 8 & 0xff00));
									i_139_ = is[i];
									is[i++] = (i_126_ + ((i_139_ & 0xff00ff) * i_137_ >> 8 & 0xff00ff) + ((i_139_ & 0xff00) * i_137_ >> 8 & 0xff00));
									i_139_ = is[i];
									is[i++] = (i_126_ + ((i_139_ & 0xff00ff) * i_137_ >> 8 & 0xff00ff) + ((i_139_ & 0xff00) * i_137_ >> 8 & 0xff00));
									i_139_ = is[i];
									is[i++] = (i_126_ + ((i_139_ & 0xff00ff) * i_137_ >> 8 & 0xff00ff) + ((i_139_ & 0xff00) * i_137_ >> 8 & 0xff00));
								}
							} while (--i_127_ > 0);
						}
						i_127_ = i_129_ - i_128_ & 0x3;
						if (i_127_ > 0) {
							i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							i_126_ = (((i_126_ & 0xff00ff) * i_138_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_138_ >> 8 & 0xff00));
							do {
								int i_140_ = is[i];
								if (bool_125_)
									is[i++] = ((i_138_ | i_140_ >> 24) << 24 | (i_126_ + (((i_140_ & 0xff00ff) * i_137_ >> 8) & 0xff00ff) + (((i_140_ & 0xff00) * i_137_ >> 8) & 0xff00)));
								else
									is[i++] = (i_126_ + ((i_140_ & 0xff00ff) * i_137_ >> 8 & 0xff00ff) + ((i_140_ & 0xff00) * i_137_ >> 8 & 0xff00));
							} while (--i_127_ > 0);
						}
					} else {
						if (i_127_ > 0) {
							do {
								i_126_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
								int[] is_141_ = is;
								int i_142_ = i++;
								int i_143_ = i_126_;
								int i_144_ = is_141_[i_142_];
								int i_145_ = i_143_ + i_144_;
								int i_146_ = ((i_143_ & 0xff00ff) + (i_144_ & 0xff00ff));
								i_144_ = (i_146_ & 0x1000100) + (i_145_ - i_146_ & 0x10000);
								is_141_[i_142_] = (~0xffffff | i_145_ - i_144_ | i_144_ - (i_144_ >>> 8));
								int[] is_147_ = is;
								i_145_ = i++;
								i_146_ = i_126_;
								int i_148_ = is_147_[i_145_];
								int i_149_ = i_146_ + i_148_;
								int i_150_ = ((i_146_ & 0xff00ff) + (i_148_ & 0xff00ff));
								i_148_ = (i_150_ & 0x1000100) + (i_149_ - i_150_ & 0x10000);
								is_147_[i_145_] = (~0xffffff | i_149_ - i_148_ | i_148_ - (i_148_ >>> 8));
								int[] is_151_ = is;
								i_149_ = i++;
								i_150_ = i_126_;
								int i_152_ = is_151_[i_149_];
								int i_153_ = i_150_ + i_152_;
								int i_154_ = ((i_150_ & 0xff00ff) + (i_152_ & 0xff00ff));
								i_152_ = (i_154_ & 0x1000100) + (i_153_ - i_154_ & 0x10000);
								is_151_[i_149_] = (~0xffffff | i_153_ - i_152_ | i_152_ - (i_152_ >>> 8));
								int[] is_155_ = is;
								i_153_ = i++;
								i_154_ = i_126_;
								int i_156_ = is_155_[i_153_];
								int i_157_ = i_154_ + i_156_;
								int i_158_ = ((i_154_ & 0xff00ff) + (i_156_ & 0xff00ff));
								i_156_ = (i_158_ & 0x1000100) + (i_157_ - i_158_ & 0x10000);
								is_155_[i_153_] = (~0xffffff | i_157_ - i_156_ | i_156_ - (i_156_ >>> 8));
							} while (--i_127_ > 0);
						}
						i_127_ = i_129_ - i_128_ & 0x3;
						if (i_127_ > 0) {
							i_126_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							do {
								int[] is_159_ = is;
								int i_160_ = i++;
								int i_161_ = i_126_;
								int i_162_ = is_159_[i_160_];
								int i_163_ = i_161_ + i_162_;
								int i_164_ = ((i_161_ & 0xff00ff) + (i_162_ & 0xff00ff));
								i_162_ = (i_164_ & 0x1000100) + (i_163_ - i_164_ & 0x10000);
								is_159_[i_160_] = (~0xffffff | i_163_ - i_162_ | i_162_ - (i_162_ >>> 8));
							} while (--i_127_ > 0);
						}
					}
				} else {
					i_127_ = i_129_ - i_128_;
					if (anInt1441 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							f_131_ += f_132_;
							f_133_ += f_134_;
							f_135_ += f_136_;
						} while (--i_127_ > 0);
					} else if (!aBool1443) {
						int i_165_ = anInt1441;
						int i_166_ = 256 - anInt1441;
						do {
							i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							f_131_ += f_132_;
							f_133_ += f_134_;
							f_135_ += f_136_;
							i_126_ = (((i_126_ & 0xff00ff) * i_166_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_166_ >> 8 & 0xff00));
							int i_167_ = is[i];
							if (bool_125_)
								is[i++] = ((i_166_ | i_167_ >> 24) << 24 | (i_126_ + ((i_167_ & 0xff00ff) * i_165_ >> 8 & 0xff00ff) + ((i_167_ & 0xff00) * i_165_ >> 8 & 0xff00)));
							else
								is[i++] = (i_126_ + ((i_167_ & 0xff00ff) * i_165_ >> 8 & 0xff00ff) + ((i_167_ & 0xff00) * i_165_ >> 8 & 0xff00));
						} while (--i_127_ > 0);
					} else {
						do {
							int[] is_168_ = is;
							int i_169_ = i++;
							int i_170_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							int i_171_ = is_168_[i_169_];
							int i_172_ = i_170_ + i_171_;
							int i_173_ = (i_170_ & 0xff00ff) + (i_171_ & 0xff00ff);
							i_171_ = (i_173_ & 0x1000100) + (i_172_ - i_173_ & 0x10000);
							is_168_[i_169_] = (~0xffffff | i_172_ - i_171_ | i_171_ - (i_171_ >>> 8));
							f_131_ += f_132_;
							f_133_ += f_134_;
							f_135_ += f_136_;
						} while (--i_127_ > 0);
					}
				}
			} else {
				i += i_128_ - 1;
				f += f_130_ * (float) i_128_;
				f_131_ += f_132_ * (float) i_128_;
				f_133_ += f_134_ * (float) i_128_;
				f_135_ += f_136_ * (float) i_128_;
				if (aClass101_1457.aBool1227) {
					if (aBool1467) {
						i_127_ = i_129_ - i_128_ >> 2;
						f_132_ *= 4.0F;
						f_134_ *= 4.0F;
						f_136_ *= 4.0F;
						if (anInt1441 == 0) {
							if (i_127_ > 0) {
								do {
									i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
									f_131_ += f_132_;
									f_133_ += f_134_;
									f_135_ += f_136_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_126_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_126_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_126_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_126_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
								} while (--i_127_ > 0);
							}
							i_127_ = i_129_ - i_128_ & 0x3;
							if (i_127_ > 0) {
								i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_126_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
								} while (--i_127_ > 0);
							}
						} else if (!aBool1443) {
							int i_174_ = anInt1441;
							int i_175_ = 256 - anInt1441;
							if (i_127_ > 0) {
								do {
									i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
									f_131_ += f_132_;
									f_133_ += f_134_;
									f_135_ += f_136_;
									i_126_ = (((i_126_ & 0xff00ff) * i_175_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_175_ >> 8 & 0xff00));
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_176_ = is[i];
										if (bool_125_)
											is[i] = (((i_175_ | i_176_ >> 24) << 24) | (i_126_ + (((i_176_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_176_ & 0xff00) * i_174_) >> 8 & 0xff00)));
										else
											is[i] = (i_126_ + (((i_176_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_176_ & 0xff00) * i_174_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_177_ = is[i];
										if (bool_125_)
											is[i] = (((i_175_ | i_177_ >> 24) << 24) | (i_126_ + (((i_177_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_177_ & 0xff00) * i_174_) >> 8 & 0xff00)));
										else
											is[i] = (i_126_ + (((i_177_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_177_ & 0xff00) * i_174_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_178_ = is[i];
										if (bool_125_)
											is[i] = (((i_175_ | i_178_ >> 24) << 24) | (i_126_ + (((i_178_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_178_ & 0xff00) * i_174_) >> 8 & 0xff00)));
										else
											is[i] = (i_126_ + (((i_178_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_178_ & 0xff00) * i_174_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_179_ = is[i];
										if (bool_125_)
											is[i] = (((i_175_ | i_179_ >> 24) << 24) | (i_126_ + (((i_179_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_179_ & 0xff00) * i_174_) >> 8 & 0xff00)));
										else
											is[i] = (i_126_ + (((i_179_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_179_ & 0xff00) * i_174_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
								} while (--i_127_ > 0);
							}
							i_127_ = i_129_ - i_128_ & 0x3;
							if (i_127_ > 0) {
								i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								i_126_ = (((i_126_ & 0xff00ff) * i_175_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_175_ >> 8 & 0xff00));
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_180_ = is[i];
										if (bool_125_)
											is[i] = (((i_175_ | i_180_ >> 24) << 24) | (i_126_ + (((i_180_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_180_ & 0xff00) * i_174_) >> 8 & 0xff00)));
										else
											is[i] = (i_126_ + (((i_180_ & 0xff00ff) * i_174_) >> 8 & 0xff00ff) + (((i_180_ & 0xff00) * i_174_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
								} while (--i_127_ > 0);
							}
						} else {
							if (i_127_ > 0) {
								do {
									i_126_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
									f_131_ += f_132_;
									f_133_ += f_134_;
									f_135_ += f_136_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_181_ = is;
										int i_182_ = i;
										int i_183_ = i_126_;
										int i_184_ = is_181_[i_182_];
										int i_185_ = i_183_ + i_184_;
										int i_186_ = ((i_183_ & 0xff00ff) + (i_184_ & 0xff00ff));
										i_184_ = ((i_186_ & 0x1000100) + (i_185_ - i_186_ & 0x10000));
										is_181_[i_182_] = (~0xffffff | i_185_ - i_184_ | i_184_ - (i_184_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_187_ = is;
										int i_188_ = i;
										int i_189_ = i_126_;
										int i_190_ = is_187_[i_188_];
										int i_191_ = i_189_ + i_190_;
										int i_192_ = ((i_189_ & 0xff00ff) + (i_190_ & 0xff00ff));
										i_190_ = ((i_192_ & 0x1000100) + (i_191_ - i_192_ & 0x10000));
										is_187_[i_188_] = (~0xffffff | i_191_ - i_190_ | i_190_ - (i_190_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_193_ = is;
										int i_194_ = i;
										int i_195_ = i_126_;
										int i_196_ = is_193_[i_194_];
										int i_197_ = i_195_ + i_196_;
										int i_198_ = ((i_195_ & 0xff00ff) + (i_196_ & 0xff00ff));
										i_196_ = ((i_198_ & 0x1000100) + (i_197_ - i_198_ & 0x10000));
										is_193_[i_194_] = (~0xffffff | i_197_ - i_196_ | i_196_ - (i_196_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_199_ = is;
										int i_200_ = i;
										int i_201_ = i_126_;
										int i_202_ = is_199_[i_200_];
										int i_203_ = i_201_ + i_202_;
										int i_204_ = ((i_201_ & 0xff00ff) + (i_202_ & 0xff00ff));
										i_202_ = ((i_204_ & 0x1000100) + (i_203_ - i_204_ & 0x10000));
										is_199_[i_200_] = (~0xffffff | i_203_ - i_202_ | i_202_ - (i_202_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
								} while (--i_127_ > 0);
							}
							i_127_ = i_129_ - i_128_ & 0x3;
							if (i_127_ > 0) {
								i_126_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_205_ = is;
										int i_206_ = i;
										int i_207_ = i_126_;
										int i_208_ = is_205_[i_206_];
										int i_209_ = i_207_ + i_208_;
										int i_210_ = ((i_207_ & 0xff00ff) + (i_208_ & 0xff00ff));
										i_208_ = ((i_210_ & 0x1000100) + (i_209_ - i_210_ & 0x10000));
										is_205_[i_206_] = (~0xffffff | i_209_ - i_208_ | i_208_ - (i_208_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_130_;
								} while (--i_127_ > 0);
							}
						}
					} else {
						i_127_ = i_129_ - i_128_;
						if (anInt1441 == 0) {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									is[i] = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_130_;
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
							} while (--i_127_ > 0);
						} else if (!aBool1443) {
							int i_211_ = anInt1441;
							int i_212_ = 256 - anInt1441;
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
									i_126_ = (((i_126_ & 0xff00ff) * i_212_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_212_ >> 8 & 0xff00));
									int i_213_ = is[i];
									if (bool_125_)
										is[i] = ((i_212_ | i_213_ >> 24) << 24 | (i_126_ + (((i_213_ & 0xff00ff) * i_211_) >> 8 & 0xff00ff) + (((i_213_ & 0xff00) * i_211_) >> 8 & 0xff00)));
									else
										is[i] = (i_126_ + (((i_213_ & 0xff00ff) * i_211_ >> 8) & 0xff00ff) + (((i_213_ & 0xff00) * i_211_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_130_;
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
							} while (--i_127_ > 0);
						} else {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_214_ = is;
									int i_215_ = i;
									int i_216_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
									int i_217_ = is_214_[i_215_];
									int i_218_ = i_216_ + i_217_;
									int i_219_ = ((i_216_ & 0xff00ff) + (i_217_ & 0xff00ff));
									i_217_ = ((i_219_ & 0x1000100) + (i_218_ - i_219_ & 0x10000));
									is_214_[i_215_] = (~0xffffff | i_218_ - i_217_ | i_217_ - (i_217_ >>> 8));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_130_;
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
							} while (--i_127_ > 0);
						}
					}
				} else if (aBool1467) {
					i_127_ = i_129_ - i_128_ >> 2;
					f_132_ *= 4.0F;
					f_134_ *= 4.0F;
					f_136_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_127_ > 0) {
							do {
								i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_126_;
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_126_;
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_126_;
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_126_;
								f += f_130_;
							} while (--i_127_ > 0);
						}
						i_127_ = i_129_ - i_128_ & 0x3;
						if (i_127_ > 0) {
							i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_126_;
								f += f_130_;
							} while (--i_127_ > 0);
						}
					} else if (!aBool1443) {
						int i_220_ = anInt1441;
						int i_221_ = 256 - anInt1441;
						if (i_127_ > 0) {
							do {
								i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
								i_126_ = (((i_126_ & 0xff00ff) * i_221_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_221_ >> 8 & 0xff00));
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_222_ = is[i];
									if (bool_125_)
										is[i] = ((i_221_ | i_222_ >> 24) << 24 | (i_126_ + (((i_222_ & 0xff00ff) * i_220_) >> 8 & 0xff00ff) + (((i_222_ & 0xff00) * i_220_) >> 8 & 0xff00)));
									else
										is[i] = (i_126_ + (((i_222_ & 0xff00ff) * i_220_ >> 8) & 0xff00ff) + (((i_222_ & 0xff00) * i_220_ >> 8) & 0xff00));
								}
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_223_ = is[i];
									if (bool_125_)
										is[i] = ((i_221_ | i_223_ >> 24) << 24 | (i_126_ + (((i_223_ & 0xff00ff) * i_220_) >> 8 & 0xff00ff) + (((i_223_ & 0xff00) * i_220_) >> 8 & 0xff00)));
									else
										is[i] = (i_126_ + (((i_223_ & 0xff00ff) * i_220_ >> 8) & 0xff00ff) + (((i_223_ & 0xff00) * i_220_ >> 8) & 0xff00));
								}
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_224_ = is[i];
									if (bool_125_)
										is[i] = ((i_221_ | i_224_ >> 24) << 24 | (i_126_ + (((i_224_ & 0xff00ff) * i_220_) >> 8 & 0xff00ff) + (((i_224_ & 0xff00) * i_220_) >> 8 & 0xff00)));
									else
										is[i] = (i_126_ + (((i_224_ & 0xff00ff) * i_220_ >> 8) & 0xff00ff) + (((i_224_ & 0xff00) * i_220_ >> 8) & 0xff00));
								}
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_225_ = is[i];
									if (bool_125_)
										is[i] = ((i_221_ | i_225_ >> 24) << 24 | (i_126_ + (((i_225_ & 0xff00ff) * i_220_) >> 8 & 0xff00ff) + (((i_225_ & 0xff00) * i_220_) >> 8 & 0xff00)));
									else
										is[i] = (i_126_ + (((i_225_ & 0xff00ff) * i_220_ >> 8) & 0xff00ff) + (((i_225_ & 0xff00) * i_220_ >> 8) & 0xff00));
								}
								f += f_130_;
							} while (--i_127_ > 0);
						}
						i_127_ = i_129_ - i_128_ & 0x3;
						if (i_127_ > 0) {
							i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							i_126_ = (((i_126_ & 0xff00ff) * i_221_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_221_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_226_ = is[i];
									if (bool_125_)
										is[i] = ((i_221_ | i_226_ >> 24) << 24 | (i_126_ + (((i_226_ & 0xff00ff) * i_220_) >> 8 & 0xff00ff) + (((i_226_ & 0xff00) * i_220_) >> 8 & 0xff00)));
									else
										is[i] = (i_126_ + (((i_226_ & 0xff00ff) * i_220_ >> 8) & 0xff00ff) + (((i_226_ & 0xff00) * i_220_ >> 8) & 0xff00));
								}
								f += f_130_;
							} while (--i_127_ > 0);
						}
					} else {
						if (i_127_ > 0) {
							do {
								i_126_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								f_131_ += f_132_;
								f_133_ += f_134_;
								f_135_ += f_136_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_227_ = is;
									int i_228_ = i;
									int i_229_ = i_126_;
									int i_230_ = is_227_[i_228_];
									int i_231_ = i_229_ + i_230_;
									int i_232_ = ((i_229_ & 0xff00ff) + (i_230_ & 0xff00ff));
									i_230_ = ((i_232_ & 0x1000100) + (i_231_ - i_232_ & 0x10000));
									is_227_[i_228_] = (~0xffffff | i_231_ - i_230_ | i_230_ - (i_230_ >>> 8));
								}
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_233_ = is;
									int i_234_ = i;
									int i_235_ = i_126_;
									int i_236_ = is_233_[i_234_];
									int i_237_ = i_235_ + i_236_;
									int i_238_ = ((i_235_ & 0xff00ff) + (i_236_ & 0xff00ff));
									i_236_ = ((i_238_ & 0x1000100) + (i_237_ - i_238_ & 0x10000));
									is_233_[i_234_] = (~0xffffff | i_237_ - i_236_ | i_236_ - (i_236_ >>> 8));
								}
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_239_ = is;
									int i_240_ = i;
									int i_241_ = i_126_;
									int i_242_ = is_239_[i_240_];
									int i_243_ = i_241_ + i_242_;
									int i_244_ = ((i_241_ & 0xff00ff) + (i_242_ & 0xff00ff));
									i_242_ = ((i_244_ & 0x1000100) + (i_243_ - i_244_ & 0x10000));
									is_239_[i_240_] = (~0xffffff | i_243_ - i_242_ | i_242_ - (i_242_ >>> 8));
								}
								f += f_130_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_245_ = is;
									int i_246_ = i;
									int i_247_ = i_126_;
									int i_248_ = is_245_[i_246_];
									int i_249_ = i_247_ + i_248_;
									int i_250_ = ((i_247_ & 0xff00ff) + (i_248_ & 0xff00ff));
									i_248_ = ((i_250_ & 0x1000100) + (i_249_ - i_250_ & 0x10000));
									is_245_[i_246_] = (~0xffffff | i_249_ - i_248_ | i_248_ - (i_248_ >>> 8));
								}
								f += f_130_;
							} while (--i_127_ > 0);
						}
						i_127_ = i_129_ - i_128_ & 0x3;
						if (i_127_ > 0) {
							i_126_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_251_ = is;
									int i_252_ = i;
									int i_253_ = i_126_;
									int i_254_ = is_251_[i_252_];
									int i_255_ = i_253_ + i_254_;
									int i_256_ = ((i_253_ & 0xff00ff) + (i_254_ & 0xff00ff));
									i_254_ = ((i_256_ & 0x1000100) + (i_255_ - i_256_ & 0x10000));
									is_251_[i_252_] = (~0xffffff | i_255_ - i_254_ | i_254_ - (i_254_ >>> 8));
								}
								f += f_130_;
							} while (--i_127_ > 0);
						}
					}
				} else {
					i_127_ = i_129_ - i_128_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i])
								is[i] = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
							f += f_130_;
							f_131_ += f_132_;
							f_133_ += f_134_;
							f_135_ += f_136_;
						} while (--i_127_ > 0);
					} else if (!aBool1443) {
						int i_257_ = anInt1441;
						int i_258_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								i_126_ = ~0xffffff | ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								i_126_ = (((i_126_ & 0xff00ff) * i_258_ >> 8 & 0xff00ff) + ((i_126_ & 0xff00) * i_258_ >> 8 & 0xff00));
								int i_259_ = is[i];
								if (bool_125_)
									is[i] = ((i_258_ | i_259_ >> 24) << 24 | (i_126_ + (((i_259_ & 0xff00ff) * i_257_ >> 8) & 0xff00ff) + (((i_259_ & 0xff00) * i_257_ >> 8) & 0xff00)));
								else
									is[i] = (i_126_ + ((i_259_ & 0xff00ff) * i_257_ >> 8 & 0xff00ff) + ((i_259_ & 0xff00) * i_257_ >> 8 & 0xff00));
							}
							f += f_130_;
							f_131_ += f_132_;
							f_133_ += f_134_;
							f_135_ += f_136_;
						} while (--i_127_ > 0);
					} else {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								int[] is_260_ = is;
								int i_261_ = i;
								int i_262_ = ((int) f_131_ & 0xff0000 | (int) f_133_ & 0xff00 | (int) f_135_ & 0xff);
								int i_263_ = is_260_[i_261_];
								int i_264_ = i_262_ + i_263_;
								int i_265_ = ((i_262_ & 0xff00ff) + (i_263_ & 0xff00ff));
								i_263_ = (i_265_ & 0x1000100) + (i_264_ - i_265_ & 0x10000);
								is_260_[i_261_] = (~0xffffff | i_264_ - i_263_ | i_263_ - (i_263_ >>> 8));
							}
							f += f_130_;
							f_131_ += f_132_;
							f_133_ += f_134_;
							f_135_ += f_136_;
						} while (--i_127_ > 0);
					}
				}
			}
		}
	}

	final void method2077(boolean bool, boolean bool_266_, boolean bool_267_, float f, float f_268_, float f_269_, float f_270_, float f_271_, float f_272_, float f_273_, float f_274_, float f_275_, int i) {
		if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_270_, (int) f, (int) f_271_, (int) f_268_, i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_271_, (int) f_268_, (int) f_272_, (int) f_269_, i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_272_, (int) f_269_, (int) f_270_, (int) f, i, (byte) 1);
		} else {
			float f_276_ = f_271_ - f_270_;
			float f_277_ = f_268_ - f;
			float f_278_ = f_272_ - f_270_;
			float f_279_ = f_269_ - f;
			float f_280_ = f_274_ - f_273_;
			float f_281_ = f_275_ - f_273_;
			float f_282_ = 0.0F;
			if (f_268_ != f)
				f_282_ = (f_271_ - f_270_) / (f_268_ - f);
			float f_283_ = 0.0F;
			if (f_269_ != f_268_)
				f_283_ = (f_272_ - f_271_) / (f_269_ - f_268_);
			float f_284_ = 0.0F;
			if (f_269_ != f)
				f_284_ = (f_270_ - f_272_) / (f - f_269_);
			float f_285_ = f_276_ * f_279_ - f_278_ * f_277_;
			if (f_285_ != 0.0F) {
				float f_286_ = (f_280_ * f_279_ - f_281_ * f_277_) / f_285_;
				float f_287_ = (f_281_ * f_276_ - f_280_ * f_278_) / f_285_;
				if (f <= f_268_ && f <= f_269_) {
					if (!(f >= (float) anInt1450)) {
						if (f_268_ > (float) anInt1450)
							f_268_ = (float) anInt1450;
						if (f_269_ > (float) anInt1450)
							f_269_ = (float) anInt1450;
						f_273_ = f_273_ - f_286_ * f_270_ + f_286_;
						if (f_268_ < f_269_) {
							f_272_ = f_270_;
							if (f < 0.0F) {
								f_272_ -= f_284_ * f;
								f_270_ -= f_282_ * f;
								f_273_ -= f_287_ * f;
								f = 0.0F;
							}
							if (f_268_ < 0.0F) {
								f_271_ -= f_283_ * f_268_;
								f_268_ = 0.0F;
							}
							if (f != f_268_ && f_284_ < f_282_ || f == f_268_ && f_284_ > f_283_) {
								f += 0.5F;
								f_268_ += 0.5F;
								f_269_ = (float) (int) (f_269_ + 0.5F) - f_268_;
								f_268_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_268_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f, i, 0, (int) f_272_, (int) f_270_, f_273_, f_286_);
									f_272_ += f_284_;
									f_270_ += f_282_;
									f_273_ += f_287_;
									f += (float) anInt1458;
								}
								while (--f_269_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f, i, 0, (int) f_272_, (int) f_271_, f_273_, f_286_);
									f_272_ += f_284_;
									f_271_ += f_283_;
									f_273_ += f_287_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_268_ += 0.5F;
								f_269_ = (float) (int) (f_269_ + 0.5F) - f_268_;
								f_268_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_268_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f, i, 0, (int) f_270_, (int) f_272_, f_273_, f_286_);
									f_272_ += f_284_;
									f_270_ += f_282_;
									f_273_ += f_287_;
									f += (float) anInt1458;
								}
								while (--f_269_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f, i, 0, (int) f_271_, (int) f_272_, f_273_, f_286_);
									f_272_ += f_284_;
									f_271_ += f_283_;
									f_273_ += f_287_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_271_ = f_270_;
							if (f < 0.0F) {
								f_271_ -= f_284_ * f;
								f_270_ -= f_282_ * f;
								f_273_ -= f_287_ * f;
								f = 0.0F;
							}
							if (f_269_ < 0.0F) {
								f_272_ -= f_283_ * f_269_;
								f_269_ = 0.0F;
							}
							if (f != f_269_ && f_284_ < f_282_ || f == f_269_ && f_283_ > f_282_) {
								f += 0.5F;
								f_269_ += 0.5F;
								f_268_ = (float) (int) (f_268_ + 0.5F) - f_269_;
								f_269_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_269_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f, i, 0, (int) f_271_, (int) f_270_, f_273_, f_286_);
									f_271_ += f_284_;
									f_270_ += f_282_;
									f_273_ += f_287_;
									f += (float) anInt1458;
								}
								while (--f_268_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f, i, 0, (int) f_272_, (int) f_270_, f_273_, f_286_);
									f_272_ += f_283_;
									f_270_ += f_282_;
									f_273_ += f_287_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_269_ += 0.5F;
								f_268_ = (float) (int) (f_268_ + 0.5F) - f_269_;
								f_269_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_269_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f, i, 0, (int) f_270_, (int) f_271_, f_273_, f_286_);
									f_271_ += f_284_;
									f_270_ += f_282_;
									f_273_ += f_287_;
									f += (float) anInt1458;
								}
								while (--f_268_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f, i, 0, (int) f_270_, (int) f_272_, f_273_, f_286_);
									f_272_ += f_283_;
									f_270_ += f_282_;
									f_273_ += f_287_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_268_ <= f_269_) {
					if (!(f_268_ >= (float) anInt1450)) {
						if (f_269_ > (float) anInt1450)
							f_269_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_274_ = f_274_ - f_286_ * f_271_ + f_286_;
						if (f_269_ < f) {
							f_270_ = f_271_;
							if (f_268_ < 0.0F) {
								f_270_ -= f_282_ * f_268_;
								f_271_ -= f_283_ * f_268_;
								f_274_ -= f_287_ * f_268_;
								f_268_ = 0.0F;
							}
							if (f_269_ < 0.0F) {
								f_272_ -= f_284_ * f_269_;
								f_269_ = 0.0F;
							}
							if (f_268_ != f_269_ && f_282_ < f_283_ || f_268_ == f_269_ && f_282_ > f_284_) {
								f_268_ += 0.5F;
								f_269_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_269_;
								f_269_ -= f_268_;
								f_268_ = (float) anIntArray1447[(int) f_268_];
								while (--f_269_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_268_, i, 0, (int) f_270_, (int) f_271_, f_274_, f_286_);
									f_270_ += f_282_;
									f_271_ += f_283_;
									f_274_ += f_287_;
									f_268_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_268_, i, 0, (int) f_270_, (int) f_272_, f_274_, f_286_);
									f_270_ += f_282_;
									f_272_ += f_284_;
									f_274_ += f_287_;
									f_268_ += (float) anInt1458;
								}
							} else {
								f_268_ += 0.5F;
								f_269_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_269_;
								f_269_ -= f_268_;
								f_268_ = (float) anIntArray1447[(int) f_268_];
								while (--f_269_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_268_, i, 0, (int) f_271_, (int) f_270_, f_274_, f_286_);
									f_270_ += f_282_;
									f_271_ += f_283_;
									f_274_ += f_287_;
									f_268_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_268_, i, 0, (int) f_272_, (int) f_270_, f_274_, f_286_);
									f_270_ += f_282_;
									f_272_ += f_284_;
									f_274_ += f_287_;
									f_268_ += (float) anInt1458;
								}
							}
						} else {
							f_272_ = f_271_;
							if (f_268_ < 0.0F) {
								f_272_ -= f_282_ * f_268_;
								f_271_ -= f_283_ * f_268_;
								f_274_ -= f_287_ * f_268_;
								f_268_ = 0.0F;
							}
							if (f < 0.0F) {
								f_270_ -= f_284_ * f;
								f = 0.0F;
							}
							if (f_282_ < f_283_) {
								f_268_ += 0.5F;
								f += 0.5F;
								f_269_ = (float) (int) (f_269_ + 0.5F) - f;
								f -= f_268_;
								f_268_ = (float) anIntArray1447[(int) f_268_];
								while (--f >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_268_, i, 0, (int) f_272_, (int) f_271_, f_274_, f_286_);
									f_272_ += f_282_;
									f_271_ += f_283_;
									f_274_ += f_287_;
									f_268_ += (float) anInt1458;
								}
								while (--f_269_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_268_, i, 0, (int) f_270_, (int) f_271_, f_274_, f_286_);
									f_270_ += f_284_;
									f_271_ += f_283_;
									f_274_ += f_287_;
									f_268_ += (float) anInt1458;
								}
							} else {
								f_268_ += 0.5F;
								f += 0.5F;
								f_269_ = (float) (int) (f_269_ + 0.5F) - f;
								f -= f_268_;
								f_268_ = (float) anIntArray1447[(int) f_268_];
								while (--f >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_268_, i, 0, (int) f_271_, (int) f_272_, f_274_, f_286_);
									f_272_ += f_282_;
									f_271_ += f_283_;
									f_274_ += f_287_;
									f_268_ += (float) anInt1458;
								}
								while (--f_269_ >= 0.0F) {
									method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_268_, i, 0, (int) f_271_, (int) f_270_, f_274_, f_286_);
									f_270_ += f_284_;
									f_271_ += f_283_;
									f_274_ += f_287_;
									f_268_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_269_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_268_ > (float) anInt1450)
						f_268_ = (float) anInt1450;
					f_275_ = f_275_ - f_286_ * f_272_ + f_286_;
					if (f < f_268_) {
						f_271_ = f_272_;
						if (f_269_ < 0.0F) {
							f_271_ -= f_283_ * f_269_;
							f_272_ -= f_284_ * f_269_;
							f_275_ -= f_287_ * f_269_;
							f_269_ = 0.0F;
						}
						if (f < 0.0F) {
							f_270_ -= f_282_ * f;
							f = 0.0F;
						}
						if (f_283_ < f_284_) {
							f_269_ += 0.5F;
							f += 0.5F;
							f_268_ = (float) (int) (f_268_ + 0.5F) - f;
							f -= f_269_;
							f_269_ = (float) anIntArray1447[(int) f_269_];
							while (--f >= 0.0F) {
								method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_269_, i, 0, (int) f_271_, (int) f_272_, f_275_, f_286_);
								f_271_ += f_283_;
								f_272_ += f_284_;
								f_275_ += f_287_;
								f_269_ += (float) anInt1458;
							}
							while (--f_268_ >= 0.0F) {
								method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_269_, i, 0, (int) f_271_, (int) f_270_, f_275_, f_286_);
								f_271_ += f_283_;
								f_270_ += f_282_;
								f_275_ += f_287_;
								f_269_ += (float) anInt1458;
							}
						} else {
							f_269_ += 0.5F;
							f += 0.5F;
							f_268_ = (float) (int) (f_268_ + 0.5F) - f;
							f -= f_269_;
							f_269_ = (float) anIntArray1447[(int) f_269_];
							while (--f >= 0.0F) {
								method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_269_, i, 0, (int) f_272_, (int) f_271_, f_275_, f_286_);
								f_271_ += f_283_;
								f_272_ += f_284_;
								f_275_ += f_287_;
								f_269_ += (float) anInt1458;
							}
							while (--f_268_ >= 0.0F) {
								method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_269_, i, 0, (int) f_270_, (int) f_271_, f_275_, f_286_);
								f_271_ += f_283_;
								f_270_ += f_282_;
								f_275_ += f_287_;
								f_269_ += (float) anInt1458;
							}
						}
					} else {
						f_270_ = f_272_;
						if (f_269_ < 0.0F) {
							f_270_ -= f_283_ * f_269_;
							f_272_ -= f_284_ * f_269_;
							f_275_ -= f_287_ * f_269_;
							f_269_ = 0.0F;
						}
						if (f_268_ < 0.0F) {
							f_271_ -= f_282_ * f_268_;
							f_268_ = 0.0F;
						}
						if (f_283_ < f_284_) {
							f_269_ += 0.5F;
							f_268_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_268_;
							f_268_ -= f_269_;
							f_269_ = (float) anIntArray1447[(int) f_269_];
							while (--f_268_ >= 0.0F) {
								method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_269_, i, 0, (int) f_270_, (int) f_272_, f_275_, f_286_);
								f_270_ += f_283_;
								f_272_ += f_284_;
								f_275_ += f_287_;
								f_269_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_269_, i, 0, (int) f_271_, (int) f_272_, f_275_, f_286_);
								f_271_ += f_282_;
								f_272_ += f_284_;
								f_275_ += f_287_;
								f_269_ += (float) anInt1458;
							}
						} else {
							f_269_ += 0.5F;
							f_268_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_268_;
							f_268_ -= f_269_;
							f_269_ = (float) anIntArray1447[(int) f_269_];
							while (--f_268_ >= 0.0F) {
								method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_269_, i, 0, (int) f_272_, (int) f_270_, f_275_, f_286_);
								f_270_ += f_283_;
								f_272_ += f_284_;
								f_275_ += f_287_;
								f_269_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2078(bool, bool_266_, bool_267_, anIntArray1459, (int) f_269_, i, 0, (int) f_272_, (int) f_271_, f_275_, f_286_);
								f_271_ += f_282_;
								f_272_ += f_284_;
								f_275_ += f_287_;
								f_269_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2078(boolean bool, boolean bool_288_, boolean bool_289_, int[] is, int i, int i_290_, int i_291_, int i_292_, int i_293_, float f, float f_294_) {
		if (aBool1445) {
			if (i_293_ > anInt1442)
				i_293_ = anInt1442;
			if (i_292_ < 0)
				i_292_ = 0;
		}
		if (i_292_ < i_293_) {
			i += i_292_ - 1;
			i_291_ = i_293_ - i_292_ >> 2;
			f += f_294_ * (float) i_292_;
			if (aClass101_1457.aBool1227) {
				if (anInt1441 == 0) {
					while (--i_291_ >= 0) {
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_290_;
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_290_;
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_290_;
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_290_;
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
					}
					i_291_ = i_293_ - i_292_ & 0x3;
					while (--i_291_ >= 0) {
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_290_;
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
					}
				} else if (anInt1441 == 254) {
					if (i_292_ != 0 && i_293_ <= anInt1442 - 1) {
						while (--i_291_ >= 0) {
							i++;
							if ((!bool_288_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_294_;
							i++;
							if ((!bool_288_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_294_;
							i++;
							if ((!bool_288_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_294_;
							i++;
							if ((!bool_288_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_294_;
						}
						i_291_ = i_293_ - i_292_ & 0x3;
						while (--i_291_ >= 0) {
							i++;
							if ((!bool_288_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_294_;
						}
					}
				} else {
					int i_295_ = anInt1441;
					int i_296_ = 256 - anInt1441;
					i_290_ = (((i_290_ & 0xff00ff) * i_296_ >> 8 & 0xff00ff) + ((i_290_ & 0xff00) * i_296_ >> 8 & 0xff00));
					while (--i_291_ >= 0) {
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_297_ = is[i];
								if (bool_289_)
									is[i] = ((i_296_ | i_297_ >> 24) << 24 | (i_290_ + (((i_297_ & 0xff00ff) * i_295_ >> 8) & 0xff00ff) + (((i_297_ & 0xff00) * i_295_ >> 8) & 0xff00)));
								else
									is[i] = (i_290_ + ((i_297_ & 0xff00ff) * i_295_ >> 8 & 0xff00ff) + ((i_297_ & 0xff00) * i_295_ >> 8 & 0xff00));
							}
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_298_ = is[i];
								if (bool_289_)
									is[i] = ((i_296_ | i_298_ >> 24) << 24 | (i_290_ + (((i_298_ & 0xff00ff) * i_295_ >> 8) & 0xff00ff) + (((i_298_ & 0xff00) * i_295_ >> 8) & 0xff00)));
								else
									is[i] = (i_290_ + ((i_298_ & 0xff00ff) * i_295_ >> 8 & 0xff00ff) + ((i_298_ & 0xff00) * i_295_ >> 8 & 0xff00));
							}
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_299_ = is[i];
								if (bool_289_)
									is[i] = ((i_296_ | i_299_ >> 24) << 24 | (i_290_ + (((i_299_ & 0xff00ff) * i_295_ >> 8) & 0xff00ff) + (((i_299_ & 0xff00) * i_295_ >> 8) & 0xff00)));
								else
									is[i] = (i_290_ + ((i_299_ & 0xff00ff) * i_295_ >> 8 & 0xff00ff) + ((i_299_ & 0xff00) * i_295_ >> 8 & 0xff00));
							}
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_300_ = is[i];
								if (bool_289_)
									is[i] = ((i_296_ | i_300_ >> 24) << 24 | (i_290_ + (((i_300_ & 0xff00ff) * i_295_ >> 8) & 0xff00ff) + (((i_300_ & 0xff00) * i_295_ >> 8) & 0xff00)));
								else
									is[i] = (i_290_ + ((i_300_ & 0xff00ff) * i_295_ >> 8 & 0xff00ff) + ((i_300_ & 0xff00) * i_295_ >> 8 & 0xff00));
							}
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
					}
					i_291_ = i_293_ - i_292_ & 0x3;
					while (--i_291_ >= 0) {
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_301_ = is[i];
								if (bool_289_)
									is[i] = ((i_296_ | i_301_ >> 24) << 24 | (i_290_ + (((i_301_ & 0xff00ff) * i_295_ >> 8) & 0xff00ff) + (((i_301_ & 0xff00) * i_295_ >> 8) & 0xff00)));
								else
									is[i] = (i_290_ + ((i_301_ & 0xff00ff) * i_295_ >> 8 & 0xff00ff) + ((i_301_ & 0xff00) * i_295_ >> 8 & 0xff00));
							}
							if (bool_288_)
								aFloatArray1460[i] = f;
						}
						f += f_294_;
					}
				}
			} else if (bool) {
				if (anInt1441 == 0) {
					while (--i_291_ >= 0) {
						i++;
						if (!bool_288_ || f < aFloatArray1460[i])
							is[i] = i_290_;
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i])
							is[i] = i_290_;
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i])
							is[i] = i_290_;
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i])
							is[i] = i_290_;
						f += f_294_;
					}
					i_291_ = i_293_ - i_292_ & 0x3;
					while (--i_291_ >= 0) {
						i++;
						if (!bool_288_ || f < aFloatArray1460[i])
							is[i] = i_290_;
						f += f_294_;
					}
				} else if (anInt1441 == 254) {
					if (i_292_ != 0 && i_293_ <= anInt1442 - 1) {
						while (--i_291_ >= 0) {
							i++;
							if (!bool_288_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_294_;
							i++;
							if (!bool_288_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_294_;
							i++;
							if (!bool_288_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_294_;
							i++;
							if (!bool_288_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_294_;
						}
						i_291_ = i_293_ - i_292_ & 0x3;
						while (--i_291_ >= 0) {
							i++;
							if (!bool_288_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_294_;
						}
					}
				} else {
					int i_302_ = anInt1441;
					int i_303_ = 256 - anInt1441;
					i_290_ = (((i_290_ & 0xff00ff) * i_303_ >> 8 & 0xff00ff) + ((i_290_ & 0xff00) * i_303_ >> 8 & 0xff00));
					while (--i_291_ >= 0) {
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							int i_304_ = is[i];
							if (bool_289_)
								is[i] = ((i_303_ | i_304_ >> 24) << 24 | (i_290_ + ((i_304_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_304_ & 0xff00) * i_302_ >> 8 & 0xff00)));
							else
								is[i] = (i_290_ + ((i_304_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_304_ & 0xff00) * i_302_ >> 8 & 0xff00));
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							int i_305_ = is[i];
							if (bool_289_)
								is[i] = ((i_303_ | i_305_ >> 24) << 24 | (i_290_ + ((i_305_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_305_ & 0xff00) * i_302_ >> 8 & 0xff00)));
							else
								is[i] = (i_290_ + ((i_305_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_305_ & 0xff00) * i_302_ >> 8 & 0xff00));
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							int i_306_ = is[i];
							if (bool_289_)
								is[i] = ((i_303_ | i_306_ >> 24) << 24 | (i_290_ + ((i_306_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_306_ & 0xff00) * i_302_ >> 8 & 0xff00)));
							else
								is[i] = (i_290_ + ((i_306_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_306_ & 0xff00) * i_302_ >> 8 & 0xff00));
						}
						f += f_294_;
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							int i_307_ = is[i];
							if (bool_289_)
								is[i] = ((i_303_ | i_307_ >> 24) << 24 | (i_290_ + ((i_307_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_307_ & 0xff00) * i_302_ >> 8 & 0xff00)));
							else
								is[i] = (i_290_ + ((i_307_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_307_ & 0xff00) * i_302_ >> 8 & 0xff00));
						}
						f += f_294_;
					}
					i_291_ = i_293_ - i_292_ & 0x3;
					while (--i_291_ >= 0) {
						i++;
						if (!bool_288_ || f < aFloatArray1460[i]) {
							int i_308_ = is[i];
							if (bool_289_)
								is[i] = ((i_303_ | i_308_ >> 24) << 24 | (i_290_ + ((i_308_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_308_ & 0xff00) * i_302_ >> 8 & 0xff00)));
							else
								is[i] = (i_290_ + ((i_308_ & 0xff00ff) * i_302_ >> 8 & 0xff00ff) + ((i_308_ & 0xff00) * i_302_ >> 8 & 0xff00));
						}
						f += f_294_;
					}
				}
			}
		}
	}

	final void method2079(boolean bool, boolean bool_309_, boolean bool_310_, float f, float f_311_, float f_312_, float f_313_, float f_314_, float f_315_, float f_316_, float f_317_, float f_318_, float f_319_, float f_320_, float f_321_, float f_322_, float f_323_, float f_324_, float f_325_, float f_326_, float f_327_, int i, int i_328_, int i_329_, int i_330_, float f_331_, float f_332_, float f_333_, int i_334_) {
		if (!bool)
			method2077(false, bool_309_, bool_310_, f, f_311_, f_312_, f_313_, f_314_, f_315_, f_316_, f_317_, f_318_, 0);
		else {
			int i_335_ = i_334_ & 0xffff;
			if (i_335_ != anInt1462) {
				anIntArray1463 = aClass180_Sub1_1456.method14841(i_335_);
				if (anIntArray1463 == null) {
					anInt1462 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					anInt1468 = 0;
					int i_336_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_334_), (byte) 10) & 0xffff]);
					int i_337_ = (~0xffffff | ((i >> 16 & 0xff) * (i_336_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_336_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_336_ & 0xff) >> 8);
					method2106(true, bool_309_, bool_310_, f, f_311_, f_312_, f_313_, f_314_, f_315_, f_316_, f_317_, f_318_, Class388.method6456(i_337_, i_330_, f_331_, (byte) 16), Class388.method6456(i_337_, i_330_, f_332_, (byte) 53), Class388.method6456(i_337_, i_330_, f_333_, (byte) -87));
					return;
				}
				anInt1462 = i_335_;
				anInt1464 = aClass180_Sub1_1456.method14822(i_334_);
				anInt1476 = anInt1464 - 1;
				aClass595_1478 = aClass180_Sub1_1456.method14823(i_334_);
				aBool1477 = aClass180_Sub1_1456.method14834(i_334_);
				anInt1468 = aClass180_Sub1_1456.method14824(i_334_) & 0xff;
			}
			anInt1461 = i_330_;
			if (!(f <= f_311_) || !(f <= f_312_)) {
				if (f_311_ <= f_312_) {
					float f_338_ = f_313_;
					f_313_ = f_314_;
					f_314_ = f_338_;
					f_338_ = f;
					f = f_311_;
					f_311_ = f_338_;
					f_338_ = f_316_;
					f_316_ = f_317_;
					f_317_ = f_338_;
					f_338_ = f_322_;
					f_322_ = f_323_;
					f_323_ = f_338_;
					f_338_ = f_325_;
					f_325_ = f_326_;
					f_326_ = f_338_;
					f_338_ = f_319_;
					f_319_ = f_320_;
					f_320_ = f_338_;
					f_338_ = f_331_;
					f_331_ = f_332_;
					f_332_ = f_338_;
					int i_339_ = i;
					i = i_328_;
					i_328_ = i_339_;
				} else {
					float f_340_ = f_313_;
					f_313_ = f_315_;
					f_315_ = f_340_;
					f_340_ = f;
					f = f_312_;
					f_312_ = f_340_;
					f_340_ = f_316_;
					f_316_ = f_318_;
					f_318_ = f_340_;
					f_340_ = f_322_;
					f_322_ = f_324_;
					f_324_ = f_340_;
					f_340_ = f_325_;
					f_325_ = f_327_;
					f_327_ = f_340_;
					f_340_ = f_319_;
					f_319_ = f_321_;
					f_321_ = f_340_;
					f_340_ = f_331_;
					f_331_ = f_333_;
					f_333_ = f_340_;
					int i_341_ = i;
					i = i_329_;
					i_329_ = i_341_;
				}
			}
			f_322_ /= f_319_;
			f_323_ /= f_320_;
			f_324_ /= f_321_;
			f_325_ /= f_319_;
			f_326_ /= f_320_;
			f_327_ /= f_321_;
			f_316_ = 1.0F / f_316_;
			f_317_ = 1.0F / f_317_;
			f_318_ = 1.0F / f_318_;
			f_319_ = 1.0F / f_319_;
			f_320_ = 1.0F / f_320_;
			f_321_ = 1.0F / f_321_;
			float f_342_ = (float) (i >> 24 & 0xff);
			float f_343_ = (float) (i_328_ >> 24 & 0xff);
			float f_344_ = (float) (i_329_ >> 24 & 0xff);
			float f_345_ = (float) (i >> 16 & 0xff);
			float f_346_ = (float) (i_328_ >> 16 & 0xff);
			float f_347_ = (float) (i_329_ >> 16 & 0xff);
			float f_348_ = (float) (i >> 8 & 0xff);
			float f_349_ = (float) (i_328_ >> 8 & 0xff);
			float f_350_ = (float) (i_329_ >> 8 & 0xff);
			float f_351_ = (float) (i & 0xff);
			float f_352_ = (float) (i_328_ & 0xff);
			float f_353_ = (float) (i_329_ & 0xff);
			float f_354_ = 0.0F;
			float f_355_ = 0.0F;
			float f_356_ = 0.0F;
			float f_357_ = 0.0F;
			float f_358_ = 0.0F;
			float f_359_ = 0.0F;
			float f_360_ = 0.0F;
			float f_361_ = 0.0F;
			float f_362_ = 0.0F;
			float f_363_ = 0.0F;
			if (f_311_ != f) {
				float f_364_ = f_311_ - f;
				f_354_ = (f_314_ - f_313_) / f_364_;
				f_355_ = (f_317_ - f_316_) / f_364_;
				f_356_ = (f_320_ - f_319_) / f_364_;
				f_357_ = (f_323_ - f_322_) / f_364_;
				f_358_ = (f_326_ - f_325_) / f_364_;
				f_359_ = (f_332_ - f_331_) / f_364_;
				f_360_ = (f_343_ - f_342_) / f_364_;
				f_361_ = (f_346_ - f_345_) / f_364_;
				f_362_ = (f_349_ - f_348_) / f_364_;
				f_363_ = (f_352_ - f_351_) / f_364_;
			}
			float f_365_ = 0.0F;
			float f_366_ = 0.0F;
			float f_367_ = 0.0F;
			float f_368_ = 0.0F;
			float f_369_ = 0.0F;
			float f_370_ = 0.0F;
			float f_371_ = 0.0F;
			float f_372_ = 0.0F;
			float f_373_ = 0.0F;
			float f_374_ = 0.0F;
			if (f_312_ != f_311_) {
				float f_375_ = f_312_ - f_311_;
				f_365_ = (f_315_ - f_314_) / f_375_;
				f_366_ = (f_318_ - f_317_) / f_375_;
				f_367_ = (f_321_ - f_320_) / f_375_;
				f_368_ = (f_324_ - f_323_) / f_375_;
				f_369_ = (f_327_ - f_326_) / f_375_;
				f_370_ = (f_333_ - f_332_) / f_375_;
				f_371_ = (f_344_ - f_343_) / f_375_;
				f_372_ = (f_347_ - f_346_) / f_375_;
				f_373_ = (f_350_ - f_349_) / f_375_;
				f_374_ = (f_353_ - f_352_) / f_375_;
			}
			float f_376_ = 0.0F;
			float f_377_ = 0.0F;
			float f_378_ = 0.0F;
			float f_379_ = 0.0F;
			float f_380_ = 0.0F;
			float f_381_ = 0.0F;
			float f_382_ = 0.0F;
			float f_383_ = 0.0F;
			float f_384_ = 0.0F;
			float f_385_ = 0.0F;
			if (f != f_312_) {
				float f_386_ = f - f_312_;
				f_376_ = (f_313_ - f_315_) / f_386_;
				f_377_ = (f_316_ - f_318_) / f_386_;
				f_378_ = (f_319_ - f_321_) / f_386_;
				f_379_ = (f_322_ - f_324_) / f_386_;
				f_380_ = (f_325_ - f_327_) / f_386_;
				f_381_ = (f_331_ - f_333_) / f_386_;
				f_382_ = (f_342_ - f_344_) / f_386_;
				f_383_ = (f_345_ - f_347_) / f_386_;
				f_384_ = (f_348_ - f_350_) / f_386_;
				f_385_ = (f_351_ - f_353_) / f_386_;
			}
			if (!(f >= (float) anInt1450)) {
				if (f_311_ > (float) anInt1450)
					f_311_ = (float) anInt1450;
				if (f_312_ > (float) anInt1450)
					f_312_ = (float) anInt1450;
				if (f_311_ < f_312_) {
					f_315_ = f_313_;
					f_318_ = f_316_;
					f_321_ = f_319_;
					f_324_ = f_322_;
					f_327_ = f_325_;
					f_333_ = f_331_;
					f_344_ = f_342_;
					f_347_ = f_345_;
					f_350_ = f_348_;
					f_353_ = f_351_;
					if (f < 0.0F) {
						f_313_ -= f_354_ * f;
						f_315_ -= f_376_ * f;
						f_316_ -= f_355_ * f;
						f_318_ -= f_377_ * f;
						f_319_ -= f_356_ * f;
						f_321_ -= f_378_ * f;
						f_322_ -= f_357_ * f;
						f_324_ -= f_379_ * f;
						f_325_ -= f_358_ * f;
						f_327_ -= f_380_ * f;
						f_331_ -= f_359_ * f;
						f_333_ -= f_381_ * f;
						f_342_ -= f_360_ * f;
						f_344_ -= f_382_ * f;
						f_345_ -= f_360_ * f;
						f_347_ -= f_382_ * f;
						f_348_ -= f_360_ * f;
						f_350_ -= f_382_ * f;
						f_351_ -= f_360_ * f;
						f_353_ -= f_382_ * f;
						f = 0.0F;
					}
					if (f_311_ < 0.0F) {
						f_314_ -= f_365_ * f_311_;
						f_317_ -= f_366_ * f_311_;
						f_320_ -= f_367_ * f_311_;
						f_323_ -= f_368_ * f_311_;
						f_326_ -= f_369_ * f_311_;
						f_332_ -= f_370_ * f_311_;
						f_343_ -= f_371_ * f_311_;
						f_346_ -= f_372_ * f_311_;
						f_349_ -= f_373_ * f_311_;
						f_352_ -= f_374_ * f_311_;
						f_311_ = 0.0F;
					}
					if (f != f_311_ && f_376_ < f_354_ || f == f_311_ && f_376_ > f_365_) {
						f += 0.5F;
						f_311_ += 0.5F;
						f_312_ = (float) (int) (f_312_ + 0.5F) - f_311_;
						f_311_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_311_ >= 0.0F) {
							method2081(bool_309_, bool_310_, anIntArray1459, anIntArray1463, (int) f, (int) f_315_, (int) f_313_, f_318_, f_316_, f_321_, f_319_, f_324_, f_322_, f_327_, f_325_, f_333_, f_331_, f_344_, f_342_, f_347_, f_345_, f_350_, f_348_, f_353_, f_351_);
							f_313_ += f_354_;
							f_315_ += f_376_;
							f_316_ += f_355_;
							f_318_ += f_377_;
							f_319_ += f_356_;
							f_321_ += f_378_;
							f_322_ += f_357_;
							f_324_ += f_379_;
							f_325_ += f_358_;
							f_327_ += f_380_;
							f_331_ += f_359_;
							f_333_ += f_381_;
							f_342_ += f_360_;
							f_344_ += f_382_;
							f_345_ += f_361_;
							f_347_ += f_383_;
							f_348_ += f_362_;
							f_350_ += f_384_;
							f_351_ += f_363_;
							f_353_ += f_385_;
							f += (float) anInt1458;
						}
						while (--f_312_ >= 0.0F) {
							method2081(bool_309_, bool_310_, anIntArray1459, anIntArray1463, (int) f, (int) f_315_, (int) f_314_, f_318_, f_317_, f_321_, f_320_, f_324_, f_323_, f_327_, f_326_, f_333_, f_332_, f_344_, f_343_, f_347_, f_346_, f_350_, f_349_, f_353_, f_352_);
							f_314_ += f_365_;
							f_315_ += f_376_;
							f_317_ += f_366_;
							f_318_ += f_377_;
							f_320_ += f_367_;
							f_321_ += f_378_;
							f_323_ += f_368_;
							f_324_ += f_379_;
							f_326_ += f_369_;
							f_327_ += f_380_;
							f_332_ += f_370_;
							f_333_ += f_381_;
							f_343_ += f_371_;
							f_344_ += f_382_;
							f_346_ += f_372_;
							f_347_ += f_383_;
							f_349_ += f_373_;
							f_350_ += f_384_;
							f_352_ += f_374_;
							f_353_ += f_385_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_311_ += 0.5F;
						f_312_ = (float) (int) (f_312_ + 0.5F) - f_311_;
						f_311_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_311_ >= 0.0F) {
							method2081(bool_309_, bool_310_, anIntArray1459, anIntArray1463, (int) f, (int) f_313_, (int) f_315_, f_316_, f_318_, f_319_, f_321_, f_322_, f_324_, f_325_, f_327_, f_331_, f_333_, f_342_, f_344_, f_345_, f_347_, f_348_, f_350_, f_351_, f_353_);
							f_313_ += f_354_;
							f_315_ += f_376_;
							f_316_ += f_355_;
							f_318_ += f_377_;
							f_319_ += f_356_;
							f_321_ += f_378_;
							f_322_ += f_357_;
							f_324_ += f_379_;
							f_325_ += f_358_;
							f_327_ += f_380_;
							f_331_ += f_359_;
							f_333_ += f_381_;
							f_342_ += f_360_;
							f_344_ += f_382_;
							f_345_ += f_361_;
							f_347_ += f_383_;
							f_348_ += f_362_;
							f_350_ += f_384_;
							f_351_ += f_363_;
							f_353_ += f_385_;
							f += (float) anInt1458;
						}
						while (--f_312_ >= 0.0F) {
							method2081(bool_309_, bool_310_, anIntArray1459, anIntArray1463, (int) f, (int) f_314_, (int) f_315_, f_317_, f_318_, f_320_, f_321_, f_323_, f_324_, f_326_, f_327_, f_332_, f_333_, f_343_, f_344_, f_346_, f_347_, f_349_, f_350_, f_352_, f_353_);
							f_314_ += f_365_;
							f_315_ += f_376_;
							f_317_ += f_366_;
							f_318_ += f_377_;
							f_320_ += f_367_;
							f_321_ += f_378_;
							f_323_ += f_368_;
							f_324_ += f_379_;
							f_326_ += f_369_;
							f_327_ += f_380_;
							f_332_ += f_370_;
							f_333_ += f_381_;
							f_343_ += f_371_;
							f_344_ += f_382_;
							f_346_ += f_372_;
							f_347_ += f_383_;
							f_349_ += f_373_;
							f_350_ += f_384_;
							f_352_ += f_374_;
							f_353_ += f_385_;
							f += (float) anInt1458;
						}
					}
				} else {
					f_314_ = f_313_;
					f_317_ = f_316_;
					f_320_ = f_319_;
					f_323_ = f_322_;
					f_326_ = f_325_;
					f_332_ = f_331_;
					f_343_ = f_342_;
					f_346_ = f_345_;
					f_349_ = f_348_;
					f_352_ = f_351_;
					if (f < 0.0F) {
						f_313_ -= f_354_ * f;
						f_314_ -= f_376_ * f;
						f_316_ -= f_355_ * f;
						f_317_ -= f_377_ * f;
						f_319_ -= f_356_ * f;
						f_320_ -= f_378_ * f;
						f_322_ -= f_357_ * f;
						f_323_ -= f_379_ * f;
						f_325_ -= f_358_ * f;
						f_326_ -= f_380_ * f;
						f_331_ -= f_359_ * f;
						f_332_ -= f_381_ * f;
						f_342_ -= f_360_ * f;
						f_343_ -= f_382_ * f;
						f_345_ -= f_360_ * f;
						f_346_ -= f_382_ * f;
						f_348_ -= f_360_ * f;
						f_349_ -= f_382_ * f;
						f_351_ -= f_360_ * f;
						f_352_ -= f_382_ * f;
						f = 0.0F;
					}
					if (f_312_ < 0.0F) {
						f_315_ -= f_365_ * f_312_;
						f_318_ -= f_366_ * f_312_;
						f_321_ -= f_367_ * f_312_;
						f_324_ -= f_368_ * f_312_;
						f_327_ -= f_369_ * f_312_;
						f_333_ -= f_370_ * f_312_;
						f_344_ -= f_371_ * f_312_;
						f_347_ -= f_372_ * f_312_;
						f_350_ -= f_373_ * f_312_;
						f_353_ -= f_374_ * f_312_;
						f_312_ = 0.0F;
					}
					if (f != f_312_ && f_376_ < f_354_ || f == f_312_ && f_365_ > f_354_) {
						f += 0.5F;
						f_312_ += 0.5F;
						f_311_ = (float) (int) (f_311_ + 0.5F) - f_312_;
						f_312_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_312_ >= 0.0F) {
							method2081(bool_309_, bool_310_, anIntArray1459, anIntArray1463, (int) f, (int) f_314_, (int) f_313_, f_317_, f_316_, f_320_, f_319_, f_323_, f_322_, f_326_, f_325_, f_332_, f_331_, f_343_, f_342_, f_346_, f_345_, f_349_, f_348_, f_352_, f_351_);
							f_313_ += f_354_;
							f_314_ += f_376_;
							f_316_ += f_355_;
							f_317_ += f_377_;
							f_319_ += f_356_;
							f_320_ += f_378_;
							f_322_ += f_357_;
							f_323_ += f_379_;
							f_325_ += f_358_;
							f_326_ += f_380_;
							f_331_ += f_359_;
							f_332_ += f_381_;
							f_342_ += f_360_;
							f_343_ += f_382_;
							f_345_ += f_361_;
							f_346_ += f_383_;
							f_348_ += f_362_;
							f_349_ += f_384_;
							f_351_ += f_363_;
							f_352_ += f_385_;
							f += (float) anInt1458;
						}
						while (--f_311_ >= 0.0F) {
							method2081(bool_309_, bool_310_, anIntArray1459, anIntArray1463, (int) f, (int) f_315_, (int) f_313_, f_318_, f_316_, f_321_, f_319_, f_324_, f_322_, f_327_, f_325_, f_333_, f_331_, f_344_, f_342_, f_347_, f_345_, f_350_, f_348_, f_353_, f_351_);
							f_315_ += f_365_;
							f_313_ += f_354_;
							f_318_ += f_366_;
							f_316_ += f_355_;
							f_321_ += f_367_;
							f_319_ += f_356_;
							f_324_ += f_368_;
							f_322_ += f_357_;
							f_327_ += f_369_;
							f_325_ += f_358_;
							f_333_ += f_370_;
							f_331_ += f_359_;
							f_344_ += f_371_;
							f_342_ += f_360_;
							f_347_ += f_372_;
							f_345_ += f_361_;
							f_350_ += f_373_;
							f_348_ += f_362_;
							f_353_ += f_374_;
							f_351_ += f_363_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_312_ += 0.5F;
						f_311_ = (float) (int) (f_311_ + 0.5F) - f_312_;
						f_312_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_312_ >= 0.0F) {
							method2081(bool_309_, bool_310_, anIntArray1459, anIntArray1463, (int) f, (int) f_313_, (int) f_314_, f_316_, f_317_, f_319_, f_320_, f_322_, f_323_, f_325_, f_326_, f_331_, f_332_, f_342_, f_343_, f_345_, f_346_, f_348_, f_349_, f_351_, f_352_);
							f_314_ += f_376_;
							f_313_ += f_354_;
							f_317_ += f_377_;
							f_316_ += f_355_;
							f_320_ += f_378_;
							f_319_ += f_356_;
							f_323_ += f_379_;
							f_322_ += f_357_;
							f_326_ += f_380_;
							f_325_ += f_358_;
							f_332_ += f_381_;
							f_331_ += f_359_;
							f_343_ += f_382_;
							f_342_ += f_360_;
							f_346_ += f_383_;
							f_345_ += f_361_;
							f_349_ += f_384_;
							f_348_ += f_362_;
							f_352_ += f_385_;
							f_351_ += f_363_;
							f += (float) anInt1458;
						}
						while (--f_311_ >= 0.0F) {
							method2081(bool_309_, bool_310_, anIntArray1459, anIntArray1463, (int) f, (int) f_313_, (int) f_315_, f_316_, f_318_, f_319_, f_321_, f_322_, f_324_, f_325_, f_327_, f_331_, f_333_, f_342_, f_344_, f_345_, f_347_, f_348_, f_350_, f_351_, f_353_);
							f_313_ += f_354_;
							f_315_ += f_365_;
							f_316_ += f_355_;
							f_318_ += f_366_;
							f_319_ += f_356_;
							f_321_ += f_367_;
							f_322_ += f_357_;
							f_324_ += f_368_;
							f_325_ += f_358_;
							f_327_ += f_369_;
							f_331_ += f_359_;
							f_333_ += f_370_;
							f_342_ += f_360_;
							f_344_ += f_371_;
							f_345_ += f_361_;
							f_347_ += f_372_;
							f_348_ += f_362_;
							f_350_ += f_373_;
							f_351_ += f_363_;
							f_353_ += f_374_;
							f += (float) anInt1458;
						}
					}
				}
			}
		}
	}

	final void method2080(boolean bool, boolean bool_387_, boolean bool_388_, float f, float f_389_, float f_390_, float f_391_, float f_392_, float f_393_, float f_394_, float f_395_, float f_396_, float f_397_, float f_398_, float f_399_) {
		if (!bool)
			method2077(false, bool_387_, bool_388_, f, f_389_, f_390_, f_391_, f_392_, f_393_, f_394_, f_395_, f_396_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_391_, (int) f, (int) f_392_, (int) f_389_, (Class656.anIntArray8393[(int) f_397_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_392_, (int) f_389_, (int) f_393_, (int) f_390_, (Class656.anIntArray8393[(int) f_397_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_393_, (int) f_390_, (int) f_391_, (int) f, (Class656.anIntArray8393[(int) f_397_ & 0xffff]), (byte) 1);
		} else {
			float f_400_ = f_392_ - f_391_;
			float f_401_ = f_389_ - f;
			float f_402_ = f_393_ - f_391_;
			float f_403_ = f_390_ - f;
			float f_404_ = f_398_ - f_397_;
			float f_405_ = f_399_ - f_397_;
			float f_406_ = f_395_ - f_394_;
			float f_407_ = f_396_ - f_394_;
			float f_408_;
			if (f_390_ != f_389_)
				f_408_ = (f_393_ - f_392_) / (f_390_ - f_389_);
			else
				f_408_ = 0.0F;
			float f_409_;
			if (f_389_ != f)
				f_409_ = f_400_ / f_401_;
			else
				f_409_ = 0.0F;
			float f_410_;
			if (f_390_ != f)
				f_410_ = f_402_ / f_403_;
			else
				f_410_ = 0.0F;
			float f_411_ = f_400_ * f_403_ - f_402_ * f_401_;
			if (f_411_ != 0.0F) {
				float f_412_ = (f_404_ * f_403_ - f_405_ * f_401_) / f_411_;
				float f_413_ = (f_405_ * f_400_ - f_404_ * f_402_) / f_411_;
				float f_414_ = (f_406_ * f_403_ - f_407_ * f_401_) / f_411_;
				float f_415_ = (f_407_ * f_400_ - f_406_ * f_402_) / f_411_;
				if (f <= f_389_ && f <= f_390_) {
					if (!(f >= (float) anInt1450)) {
						if (f_389_ > (float) anInt1450)
							f_389_ = (float) anInt1450;
						if (f_390_ > (float) anInt1450)
							f_390_ = (float) anInt1450;
						f_397_ = f_397_ - f_412_ * f_391_ + f_412_;
						f_394_ = f_394_ - f_414_ * f_391_ + f_414_;
						if (f_389_ < f_390_) {
							f_393_ = f_391_;
							if (f < 0.0F) {
								f_393_ -= f_410_ * f;
								f_391_ -= f_409_ * f;
								f_397_ -= f_413_ * f;
								f_394_ -= f_415_ * f;
								f = 0.0F;
							}
							if (f_389_ < 0.0F) {
								f_392_ -= f_408_ * f_389_;
								f_389_ = 0.0F;
							}
							if (f != f_389_ && f_410_ < f_409_ || f == f_389_ && f_410_ > f_408_) {
								f += 0.5F;
								f_389_ += 0.5F;
								f_390_ = (float) (int) (f_390_ + 0.5F) - f_389_;
								f_389_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_389_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f, 0, 0, (int) f_393_, (int) f_391_, f_397_, f_412_, f_394_, f_414_);
									f_393_ += f_410_;
									f_391_ += f_409_;
									f_397_ += f_413_;
									f_394_ += f_415_;
									f += (float) anInt1458;
								}
								while (--f_390_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f, 0, 0, (int) f_393_, (int) f_392_, f_397_, f_412_, f_394_, f_414_);
									f_393_ += f_410_;
									f_392_ += f_408_;
									f_397_ += f_413_;
									f_394_ += f_415_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_389_ += 0.5F;
								f_390_ = (float) (int) (f_390_ + 0.5F) - f_389_;
								f_389_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_389_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f, 0, 0, (int) f_391_, (int) f_393_, f_397_, f_412_, f_394_, f_414_);
									f_393_ += f_410_;
									f_391_ += f_409_;
									f_397_ += f_413_;
									f_394_ += f_415_;
									f += (float) anInt1458;
								}
								while (--f_390_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f, 0, 0, (int) f_392_, (int) f_393_, f_397_, f_412_, f_394_, f_414_);
									f_393_ += f_410_;
									f_392_ += f_408_;
									f_397_ += f_413_;
									f_394_ += f_415_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_392_ = f_391_;
							if (f < 0.0F) {
								f_392_ -= f_410_ * f;
								f_391_ -= f_409_ * f;
								f_397_ -= f_413_ * f;
								f_394_ -= f_415_ * f;
								f = 0.0F;
							}
							if (f_390_ < 0.0F) {
								f_393_ -= f_408_ * f_390_;
								f_390_ = 0.0F;
							}
							if (f != f_390_ && f_410_ < f_409_ || f == f_390_ && f_408_ > f_409_) {
								f += 0.5F;
								f_390_ += 0.5F;
								f_389_ = (float) (int) (f_389_ + 0.5F) - f_390_;
								f_390_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_390_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f, 0, 0, (int) f_392_, (int) f_391_, f_397_, f_412_, f_394_, f_414_);
									f_392_ += f_410_;
									f_391_ += f_409_;
									f_397_ += f_413_;
									f_394_ += f_415_;
									f += (float) anInt1458;
								}
								while (--f_389_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f, 0, 0, (int) f_393_, (int) f_391_, f_397_, f_412_, f_394_, f_414_);
									f_393_ += f_408_;
									f_391_ += f_409_;
									f_397_ += f_413_;
									f_394_ += f_415_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_390_ += 0.5F;
								f_389_ = (float) (int) (f_389_ + 0.5F) - f_390_;
								f_390_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_390_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f, 0, 0, (int) f_391_, (int) f_392_, f_397_, f_412_, f_394_, f_414_);
									f_392_ += f_410_;
									f_391_ += f_409_;
									f_397_ += f_413_;
									f_394_ += f_415_;
									f += (float) anInt1458;
								}
								while (--f_389_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f, 0, 0, (int) f_391_, (int) f_393_, f_397_, f_412_, f_394_, f_414_);
									f_393_ += f_408_;
									f_391_ += f_409_;
									f_397_ += f_413_;
									f_394_ += f_415_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_389_ <= f_390_) {
					if (!(f_389_ >= (float) anInt1450)) {
						if (f_390_ > (float) anInt1450)
							f_390_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_398_ = f_398_ - f_412_ * f_392_ + f_412_;
						f_395_ = f_395_ - f_414_ * f_392_ + f_414_;
						if (f_390_ < f) {
							f_391_ = f_392_;
							if (f_389_ < 0.0F) {
								f_391_ -= f_409_ * f_389_;
								f_392_ -= f_408_ * f_389_;
								f_398_ -= f_413_ * f_389_;
								f_395_ -= f_415_ * f_389_;
								f_389_ = 0.0F;
							}
							if (f_390_ < 0.0F) {
								f_393_ -= f_410_ * f_390_;
								f_390_ = 0.0F;
							}
							if (f_389_ != f_390_ && f_409_ < f_408_ || f_389_ == f_390_ && f_409_ > f_410_) {
								f_389_ += 0.5F;
								f_390_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_390_;
								f_390_ -= f_389_;
								f_389_ = (float) anIntArray1447[(int) f_389_];
								while (--f_390_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f_389_, 0, 0, (int) f_391_, (int) f_392_, f_398_, f_412_, f_395_, f_414_);
									f_391_ += f_409_;
									f_392_ += f_408_;
									f_398_ += f_413_;
									f_395_ += f_415_;
									f_389_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f_389_, 0, 0, (int) f_391_, (int) f_393_, f_398_, f_412_, f_395_, f_414_);
									f_391_ += f_409_;
									f_393_ += f_410_;
									f_398_ += f_413_;
									f_395_ += f_415_;
									f_389_ += (float) anInt1458;
								}
							} else {
								f_389_ += 0.5F;
								f_390_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_390_;
								f_390_ -= f_389_;
								f_389_ = (float) anIntArray1447[(int) f_389_];
								while (--f_390_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f_389_, 0, 0, (int) f_392_, (int) f_391_, f_398_, f_412_, f_395_, f_414_);
									f_391_ += f_409_;
									f_392_ += f_408_;
									f_398_ += f_413_;
									f_395_ += f_415_;
									f_389_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f_389_, 0, 0, (int) f_393_, (int) f_391_, f_398_, f_412_, f_395_, f_414_);
									f_391_ += f_409_;
									f_393_ += f_410_;
									f_398_ += f_413_;
									f_395_ += f_415_;
									f_389_ += (float) anInt1458;
								}
							}
						} else {
							f_393_ = f_392_;
							if (f_389_ < 0.0F) {
								f_393_ -= f_409_ * f_389_;
								f_392_ -= f_408_ * f_389_;
								f_398_ -= f_413_ * f_389_;
								f_395_ -= f_415_ * f_389_;
								f_389_ = 0.0F;
							}
							if (f < 0.0F) {
								f_391_ -= f_410_ * f;
								f = 0.0F;
							}
							if (f_409_ < f_408_) {
								f_389_ += 0.5F;
								f += 0.5F;
								f_390_ = (float) (int) (f_390_ + 0.5F) - f;
								f -= f_389_;
								f_389_ = (float) anIntArray1447[(int) f_389_];
								while (--f >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f_389_, 0, 0, (int) f_393_, (int) f_392_, f_398_, f_412_, f_395_, f_414_);
									f_393_ += f_409_;
									f_392_ += f_408_;
									f_398_ += f_413_;
									f_395_ += f_415_;
									f_389_ += (float) anInt1458;
								}
								while (--f_390_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f_389_, 0, 0, (int) f_391_, (int) f_392_, f_398_, f_412_, f_395_, f_414_);
									f_391_ += f_410_;
									f_392_ += f_408_;
									f_398_ += f_413_;
									f_395_ += f_415_;
									f_389_ += (float) anInt1458;
								}
							} else {
								f_389_ += 0.5F;
								f += 0.5F;
								f_390_ = (float) (int) (f_390_ + 0.5F) - f;
								f -= f_389_;
								f_389_ = (float) anIntArray1447[(int) f_389_];
								while (--f >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f_389_, 0, 0, (int) f_392_, (int) f_393_, f_398_, f_412_, f_395_, f_414_);
									f_393_ += f_409_;
									f_392_ += f_408_;
									f_398_ += f_413_;
									f_395_ += f_415_;
									f_389_ += (float) anInt1458;
								}
								while (--f_390_ >= 0.0F) {
									method2098(bool_387_, bool_388_, anIntArray1459, (int) f_389_, 0, 0, (int) f_392_, (int) f_391_, f_398_, f_412_, f_395_, f_414_);
									f_391_ += f_410_;
									f_392_ += f_408_;
									f_398_ += f_413_;
									f_395_ += f_415_;
									f_389_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_390_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_389_ > (float) anInt1450)
						f_389_ = (float) anInt1450;
					f_399_ = f_399_ - f_412_ * f_393_ + f_412_;
					f_396_ = f_396_ - f_414_ * f_393_ + f_414_;
					if (f < f_389_) {
						f_392_ = f_393_;
						if (f_390_ < 0.0F) {
							f_392_ -= f_408_ * f_390_;
							f_393_ -= f_410_ * f_390_;
							f_399_ -= f_413_ * f_390_;
							f_396_ -= f_415_ * f_390_;
							f_390_ = 0.0F;
						}
						if (f < 0.0F) {
							f_391_ -= f_409_ * f;
							f = 0.0F;
						}
						if (f_408_ < f_410_) {
							f_390_ += 0.5F;
							f += 0.5F;
							f_389_ = (float) (int) (f_389_ + 0.5F) - f;
							f -= f_390_;
							f_390_ = (float) anIntArray1447[(int) f_390_];
							while (--f >= 0.0F) {
								method2098(bool_387_, bool_388_, anIntArray1459, (int) f_390_, 0, 0, (int) f_392_, (int) f_393_, f_399_, f_412_, f_396_, f_414_);
								f_392_ += f_408_;
								f_393_ += f_410_;
								f_399_ += f_413_;
								f_396_ += f_415_;
								f_390_ += (float) anInt1458;
							}
							while (--f_389_ >= 0.0F) {
								method2098(bool_387_, bool_388_, anIntArray1459, (int) f_390_, 0, 0, (int) f_392_, (int) f_391_, f_399_, f_412_, f_396_, f_414_);
								f_392_ += f_408_;
								f_391_ += f_409_;
								f_399_ += f_413_;
								f_396_ += f_415_;
								f_390_ += (float) anInt1458;
							}
						} else {
							f_390_ += 0.5F;
							f += 0.5F;
							f_389_ = (float) (int) (f_389_ + 0.5F) - f;
							f -= f_390_;
							f_390_ = (float) anIntArray1447[(int) f_390_];
							while (--f >= 0.0F) {
								method2098(bool_387_, bool_388_, anIntArray1459, (int) f_390_, 0, 0, (int) f_393_, (int) f_392_, f_399_, f_412_, f_396_, f_414_);
								f_392_ += f_408_;
								f_393_ += f_410_;
								f_399_ += f_413_;
								f_396_ += f_415_;
								f_390_ += (float) anInt1458;
							}
							while (--f_389_ >= 0.0F) {
								method2098(bool_387_, bool_388_, anIntArray1459, (int) f_390_, 0, 0, (int) f_391_, (int) f_392_, f_399_, f_412_, f_396_, f_414_);
								f_392_ += f_408_;
								f_391_ += f_409_;
								f_399_ += f_413_;
								f_396_ += f_415_;
								f_390_ += (float) anInt1458;
							}
						}
					} else {
						f_391_ = f_393_;
						if (f_390_ < 0.0F) {
							f_391_ -= f_408_ * f_390_;
							f_393_ -= f_410_ * f_390_;
							f_399_ -= f_413_ * f_390_;
							f_396_ -= f_415_ * f_390_;
							f_390_ = 0.0F;
						}
						if (f_389_ < 0.0F) {
							f_392_ -= f_409_ * f_389_;
							f_389_ = 0.0F;
						}
						if (f_408_ < f_410_) {
							f_390_ += 0.5F;
							f_389_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_389_;
							f_389_ -= f_390_;
							f_390_ = (float) anIntArray1447[(int) f_390_];
							while (--f_389_ >= 0.0F) {
								method2098(bool_387_, bool_388_, anIntArray1459, (int) f_390_, 0, 0, (int) f_391_, (int) f_393_, f_399_, f_412_, f_396_, f_414_);
								f_391_ += f_408_;
								f_393_ += f_410_;
								f_399_ += f_413_;
								f_396_ += f_415_;
								f_390_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_387_, bool_388_, anIntArray1459, (int) f_390_, 0, 0, (int) f_392_, (int) f_393_, f_399_, f_412_, f_396_, f_414_);
								f_392_ += f_409_;
								f_393_ += f_410_;
								f_399_ += f_413_;
								f_396_ += f_415_;
								f_390_ += (float) anInt1458;
							}
						} else {
							f_390_ += 0.5F;
							f_389_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_389_;
							f_389_ -= f_390_;
							f_390_ = (float) anIntArray1447[(int) f_390_];
							while (--f_389_ >= 0.0F) {
								method2098(bool_387_, bool_388_, anIntArray1459, (int) f_390_, 0, 0, (int) f_393_, (int) f_391_, f_399_, f_412_, f_396_, f_414_);
								f_391_ += f_408_;
								f_393_ += f_410_;
								f_399_ += f_413_;
								f_396_ += f_415_;
								f_390_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_387_, bool_388_, anIntArray1459, (int) f_390_, 0, 0, (int) f_393_, (int) f_392_, f_399_, f_412_, f_396_, f_414_);
								f_392_ += f_409_;
								f_393_ += f_410_;
								f_399_ += f_413_;
								f_396_ += f_415_;
								f_390_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2081(boolean bool, boolean bool_416_, int[] is, int[] is_417_, int i, int i_418_, int i_419_, float f, float f_420_, float f_421_, float f_422_, float f_423_, float f_424_, float f_425_, float f_426_, float f_427_, float f_428_, float f_429_, float f_430_, float f_431_, float f_432_, float f_433_, float f_434_, float f_435_, float f_436_) {
		int i_437_ = i_419_ - i_418_;
		float f_438_ = 1.0F / (float) i_437_;
		float f_439_ = (f_420_ - f) * f_438_;
		float f_440_ = (f_422_ - f_421_) * f_438_;
		float f_441_ = (f_424_ - f_423_) * f_438_;
		float f_442_ = (f_426_ - f_425_) * f_438_;
		float f_443_ = (f_428_ - f_427_) * f_438_;
		float f_444_ = (f_430_ - f_429_) * f_438_;
		float f_445_ = (f_432_ - f_431_) * f_438_;
		float f_446_ = (f_434_ - f_433_) * f_438_;
		float f_447_ = (f_436_ - f_435_) * f_438_;
		if (aBool1445) {
			if (i_419_ > anInt1442)
				i_419_ = anInt1442;
			if (i_418_ < 0) {
				f -= f_439_ * (float) i_418_;
				f_421_ -= f_440_ * (float) i_418_;
				f_423_ -= f_441_ * (float) i_418_;
				f_425_ -= f_442_ * (float) i_418_;
				f_427_ -= f_443_ * (float) i_418_;
				f_429_ -= f_444_ * (float) i_418_;
				f_431_ -= f_445_ * (float) i_418_;
				f_433_ -= f_446_ * (float) i_418_;
				f_435_ -= f_447_ * (float) i_418_;
				i_418_ = 0;
			}
		}
		if (i_418_ < i_419_) {
			i_437_ = i_419_ - i_418_;
			i += i_418_;
			while (i_437_-- > 0) {
				float f_448_ = 1.0F / f;
				float f_449_ = 1.0F / f_421_;
				if (!bool || f_448_ < aFloatArray1460[i]) {
					int i_450_ = (int) (f_423_ * f_449_ * (float) anInt1464);
					if (aBool1477)
						i_450_ &= anInt1476;
					else if (i_450_ < 0)
						i_450_ = 0;
					else if (i_450_ > anInt1476)
						i_450_ = anInt1476;
					int i_451_ = (int) (f_425_ * f_449_ * (float) anInt1464);
					if (aBool1477)
						i_451_ &= anInt1476;
					else if (i_451_ < 0)
						i_451_ = 0;
					else if (i_451_ > anInt1476)
						i_451_ = anInt1476;
					int i_452_ = anIntArray1463[i_451_ * anInt1464 + i_450_];
					int i_453_ = 255;
					if (aClass595_1478 == Class595.aClass595_7814)
						i_453_ = (int) ((float) (i_452_ >> 24 & 0xff) * f_429_ / 255.0F);
					else if (aClass595_1478 == Class595.aClass595_7815) {
						if ((i_452_ >> 24 & 0xff) > anInt1468)
							i_453_ = 255;
						else
							i_453_ = 0;
					} else
						i_453_ = (int) f_429_;
					if (i_453_ != 0) {
						if (i_453_ != 255) {
							int i_454_ = (~0xffffff | ((int) (f_431_ * (float) (i_452_ >> 16 & 0xff)) << 8 & 0xff0000) | (int) (f_433_ * (float) (i_452_ >> 8 & 0xff)) & 0xff00 | ((int) (f_435_ * (float) (i_452_ & 0xff)) >> 8));
							if (f_427_ != 0.0F) {
								int i_455_ = (int) (255.0F - f_427_);
								int i_456_ = ((((anInt1461 & 0xff00ff) * (int) f_427_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_427_ & 0xff0000)) >>> 8);
								i_454_ = ((((i_454_ & 0xff00ff) * i_455_ & ~0xff00ff) | ((i_454_ & 0xff00) * i_455_ & 0xff0000)) >>> 8) + i_456_;
							}
							int i_457_ = is[i];
							int i_458_ = 255 - i_453_;
							i_454_ = ((((i_457_ & 0xff00ff) * i_458_ + (i_454_ & 0xff00ff) * i_453_) & ~0xff00ff) + (((i_457_ & 0xff00) * i_458_ + (i_454_ & 0xff00) * i_453_) & 0xff0000)) >> 8;
							if (bool_416_)
								is[i] = (i_453_ | is[i] >> 24) << 24 | i_454_;
							else
								is[i] = i_454_;
							if (bool)
								aFloatArray1460[i] = f_448_;
						} else {
							int i_459_ = (~0xffffff | ((int) (f_431_ * (float) (i_452_ >> 16 & 0xff)) << 8 & 0xff0000) | (int) (f_433_ * (float) (i_452_ >> 8 & 0xff)) & 0xff00 | ((int) (f_435_ * (float) (i_452_ & 0xff)) >> 8));
							if (f_427_ != 0.0F) {
								int i_460_ = (int) (255.0F - f_427_);
								int i_461_ = ((((anInt1461 & 0xff00ff) * (int) f_427_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_427_ & 0xff0000)) >>> 8);
								i_459_ = ((((i_459_ & 0xff00ff) * i_460_ & ~0xff00ff) | ((i_459_ & 0xff00) * i_460_ & 0xff0000)) >>> 8) + i_461_;
							}
							if (bool_416_)
								is[i] = i_453_ << 24 | i_459_;
							else
								is[i] = i_459_;
							if (bool)
								aFloatArray1460[i] = f_448_;
						}
					}
				}
				i++;
				f += f_439_;
				f_421_ += f_440_;
				f_423_ += f_441_;
				f_425_ += f_442_;
				f_427_ += f_443_;
				f_429_ += f_444_;
				f_431_ += f_445_;
				f_433_ += f_446_;
				f_435_ += f_447_;
			}
		}
	}

	final void method2082(boolean bool, boolean bool_462_, int[] is, int i, int i_463_, int i_464_, float f, float f_465_, float f_466_, float f_467_, float f_468_, float f_469_, float f_470_, float f_471_, float f_472_, float f_473_, float f_474_, float f_475_, float f_476_, float f_477_, float f_478_, float f_479_, float f_480_, float f_481_, float f_482_, float f_483_, float f_484_, float f_485_) {
		int i_486_ = i_464_ - i_463_;
		float f_487_ = 1.0F / (float) i_486_;
		float f_488_ = (f_465_ - f) * f_487_;
		float f_489_ = (f_467_ - f_466_) * f_487_;
		float f_490_ = (f_469_ - f_468_) * f_487_;
		float f_491_ = (f_471_ - f_470_) * f_487_;
		float f_492_ = (f_473_ - f_472_) * f_487_;
		float f_493_ = (f_475_ - f_474_) * f_487_;
		float f_494_ = (f_477_ - f_476_) * f_487_;
		float f_495_ = (f_479_ - f_478_) * f_487_;
		float f_496_ = (f_481_ - f_480_) * f_487_;
		float f_497_ = (f_483_ - f_482_) * f_487_;
		float f_498_ = (f_485_ - f_484_) * f_487_;
		if (aBool1445) {
			if (i_464_ > anInt1442)
				i_464_ = anInt1442;
			if (i_463_ < 0) {
				f -= f_488_ * (float) i_463_;
				f_466_ -= f_489_ * (float) i_463_;
				f_468_ -= f_490_ * (float) i_463_;
				f_470_ -= f_491_ * (float) i_463_;
				f_472_ -= f_492_ * (float) i_463_;
				f_474_ -= f_493_ * (float) i_463_;
				f_476_ -= f_494_ * (float) i_463_;
				f_478_ -= f_495_ * (float) i_463_;
				f_480_ -= f_496_ * (float) i_463_;
				f_482_ -= f_497_ * (float) i_463_;
				f_484_ -= f_498_ * (float) i_463_;
				i_463_ = 0;
			}
		}
		if (i_463_ < i_464_) {
			i_486_ = i_464_ - i_463_;
			i += i_463_;
			while (i_486_-- > 0) {
				float f_499_ = 1.0F / f;
				float f_500_ = 1.0F / f_466_;
				if (!bool || f_499_ < aFloatArray1460[i]) {
					float f_501_ = f_468_ * f_500_;
					float f_502_ = f_470_ * f_500_;
					int i_503_ = ((int) (f_501_ * (float) anInt1464 * aFloat1455) & anInt1476);
					int i_504_ = ((int) (f_502_ * (float) anInt1464 * aFloat1455) & anInt1476);
					int i_505_ = anIntArray1463[i_504_ * anInt1464 + i_503_];
					i_503_ = ((int) (f_501_ * (float) anInt1472 * aFloat1474) & anInt1473);
					i_504_ = ((int) (f_502_ * (float) anInt1472 * aFloat1474) & anInt1473);
					int i_506_ = anIntArray1454[i_504_ * anInt1472 + i_503_];
					i_503_ = ((int) (f_501_ * (float) anInt1469 * aFloat1479) & anInt1465);
					i_504_ = ((int) (f_502_ * (float) anInt1469 * aFloat1479) & anInt1465);
					int i_507_ = anIntArray1471[i_504_ * anInt1469 + i_503_];
					float f_508_ = 1.0F - (f_482_ + f_484_);
					i_505_ = (~0xffffff | ((int) (f_482_ * (float) (i_505_ >> 16 & 0xff)) << 16) | (int) (f_482_ * (float) (i_505_ >> 8 & 0xff)) << 8 | (int) (f_482_ * (float) (i_505_ & 0xff)));
					i_506_ = (~0xffffff | ((int) (f_484_ * (float) (i_506_ >> 16 & 0xff)) << 16) | (int) (f_484_ * (float) (i_506_ >> 8 & 0xff)) << 8 | (int) (f_484_ * (float) (i_506_ & 0xff)));
					i_507_ = (~0xffffff | ((int) (f_508_ * (float) (i_507_ >> 16 & 0xff)) << 16) | (int) (f_508_ * (float) (i_507_ >> 8 & 0xff)) << 8 | (int) (f_508_ * (float) (i_507_ & 0xff)));
					int i_509_ = i_505_ + i_506_ + i_507_;
					int i_510_ = (~0xffffff | ((int) (f_476_ * (float) (i_509_ >> 16 & 0xff)) << 8) & 0xff0000 | ((int) (f_478_ * (float) (i_509_ >> 8 & 0xff)) & 0xff00) | (int) (f_480_ * (float) (i_509_ & 0xff)) >> 8);
					if (f_472_ != 0.0F) {
						int i_511_ = (int) (255.0F - f_472_);
						int i_512_ = ((((anInt1461 & 0xff00ff) * (int) f_472_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_472_ & 0xff0000)) >>> 8);
						i_510_ = (((i_510_ & 0xff00ff) * i_511_ & ~0xff00ff | (i_510_ & 0xff00) * i_511_ & 0xff0000) >>> 8) + i_512_;
					}
					if (bool_462_)
						is[i] = ((int) f_474_ | is[i] >> 24) << 24 | i_510_;
					else
						is[i] = i_510_;
					if (bool)
						aFloatArray1460[i] = f_499_;
				}
				i++;
				f += f_488_;
				f_466_ += f_489_;
				f_468_ += f_490_;
				f_470_ += f_491_;
				f_472_ += f_492_;
				f_474_ += f_493_;
				f_476_ += f_494_;
				f_478_ += f_495_;
				f_480_ += f_496_;
				f_482_ += f_497_;
				f_484_ += f_498_;
			}
		}
	}

	int method2083() {
		return anIntArray1447[0] % anInt1458;
	}

	int method2084() {
		return anIntArray1447[0] / anInt1458;
	}

	final void method2085(boolean bool, boolean bool_513_, boolean bool_514_, float f, float f_515_, float f_516_, float f_517_, float f_518_, float f_519_, float f_520_, float f_521_, float f_522_, float f_523_, float f_524_, float f_525_, float f_526_, float f_527_, float f_528_, float f_529_, float f_530_, float f_531_, int i, int i_532_, int i_533_, int i_534_, float f_535_, float f_536_, float f_537_, int i_538_, float f_539_, int i_540_, float f_541_, int i_542_, float f_543_) {
		if (!bool)
			method2077(false, bool_513_, bool_514_, f, f_515_, f_516_, f_517_, f_518_, f_519_, f_520_, f_521_, f_522_, 0);
		else {
			anInt1461 = i_534_;
			if (!(f <= f_515_) || !(f <= f_516_)) {
				if (f_515_ <= f_516_) {
					float f_544_ = f_517_;
					f_517_ = f_518_;
					f_518_ = f_544_;
					f_544_ = f;
					f = f_515_;
					f_515_ = f_544_;
					f_544_ = f_520_;
					f_520_ = f_521_;
					f_521_ = f_544_;
					f_544_ = f_526_;
					f_526_ = f_527_;
					f_527_ = f_544_;
					f_544_ = f_529_;
					f_529_ = f_530_;
					f_530_ = f_544_;
					f_544_ = f_523_;
					f_523_ = f_524_;
					f_524_ = f_544_;
					f_544_ = f_535_;
					f_535_ = f_536_;
					f_536_ = f_544_;
					f_544_ = f_539_;
					f_539_ = f_541_;
					f_541_ = f_544_;
					int i_545_ = i;
					i = i_532_;
					i_532_ = i_545_;
					i_545_ = i_538_;
					i_538_ = i_540_;
					i_540_ = i_545_;
				} else {
					float f_546_ = f_517_;
					f_517_ = f_519_;
					f_519_ = f_546_;
					f_546_ = f;
					f = f_516_;
					f_516_ = f_546_;
					f_546_ = f_520_;
					f_520_ = f_522_;
					f_522_ = f_546_;
					f_546_ = f_526_;
					f_526_ = f_528_;
					f_528_ = f_546_;
					f_546_ = f_529_;
					f_529_ = f_531_;
					f_531_ = f_546_;
					f_546_ = f_523_;
					f_523_ = f_525_;
					f_525_ = f_546_;
					f_546_ = f_535_;
					f_535_ = f_537_;
					f_537_ = f_546_;
					f_546_ = f_539_;
					f_539_ = f_543_;
					f_543_ = f_546_;
					int i_547_ = i;
					i = i_533_;
					i_533_ = i_547_;
					i_547_ = i_538_;
					i_538_ = i_542_;
					i_542_ = i_547_;
				}
			}
			int i_548_ = i_538_ & 0xffff;
			int i_549_ = i_540_ & 0xffff;
			int i_550_ = i_542_ & 0xffff;
			if (i_548_ != anInt1462) {
				anIntArray1463 = aClass180_Sub1_1456.method14841(i_548_);
				if (anIntArray1463 == null) {
					anInt1462 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					int i_551_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_538_), (byte) 10) & 0xffff]);
					int i_552_ = (~0xffffff | ((i >> 16 & 0xff) * (i_551_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_551_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_551_ & 0xff) >> 8);
					method2106(true, bool_513_, bool_514_, f, f_515_, f_516_, f_517_, f_518_, f_519_, f_520_, f_521_, f_522_, Class388.method6456(i_552_, i_534_, f_535_, (byte) 16), Class388.method6456(i_552_, i_534_, f_536_, (byte) -116), Class388.method6456(i_552_, i_534_, f_537_, (byte) -52));
					return;
				}
				anInt1462 = i_548_;
				anInt1464 = aClass180_Sub1_1456.method14822(i_538_);
				anInt1476 = anInt1464 - 1;
				aClass595_1478 = aClass180_Sub1_1456.method14823(i_538_);
			}
			aFloat1455 = f_539_;
			if (i_549_ != anInt1470) {
				anIntArray1454 = aClass180_Sub1_1456.method14841(i_549_);
				if (anIntArray1454 == null) {
					anInt1470 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					int i_553_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_540_), (byte) 10) & 0xffff]);
					int i_554_ = (~0xffffff | ((i >> 16 & 0xff) * (i_553_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_553_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_553_ & 0xff) >> 8);
					method2106(true, bool_513_, bool_514_, f, f_515_, f_516_, f_517_, f_518_, f_519_, f_520_, f_521_, f_522_, Class388.method6456(i_554_, i_534_, f_535_, (byte) -43), Class388.method6456(i_554_, i_534_, f_536_, (byte) -49), Class388.method6456(i_554_, i_534_, f_537_, (byte) -8));
					return;
				}
				anInt1470 = i_549_;
				anInt1472 = aClass180_Sub1_1456.method14822(i_540_);
				anInt1473 = anInt1472 - 1;
			}
			aFloat1474 = f_541_;
			if (i_550_ != anInt1475) {
				anIntArray1471 = aClass180_Sub1_1456.method14841(i_550_);
				if (anIntArray1471 == null) {
					anInt1475 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					int i_555_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_542_), (byte) 10) & 0xffff]);
					int i_556_ = (~0xffffff | ((i >> 16 & 0xff) * (i_555_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_555_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_555_ & 0xff) >> 8);
					method2106(true, bool_513_, bool_514_, (float) (int) f, (float) (int) f_515_, (float) (int) f_516_, (float) (int) f_517_, (float) (int) f_518_, (float) (int) f_519_, (float) (int) f_520_, (float) (int) f_521_, (float) (int) f_522_, Class388.method6456(i_556_, i_534_, f_535_, (byte) 9), Class388.method6456(i_556_, i_534_, f_536_, (byte) -47), Class388.method6456(i_556_, i_534_, f_537_, (byte) -6));
					return;
				}
				anInt1475 = i_550_;
				anInt1469 = aClass180_Sub1_1456.method14822(i_542_);
				anInt1465 = anInt1469 - 1;
			}
			aFloat1479 = f_543_;
			f_526_ /= f_523_;
			f_527_ /= f_524_;
			f_528_ /= f_525_;
			f_529_ /= f_523_;
			f_530_ /= f_524_;
			f_531_ /= f_525_;
			f_520_ = 1.0F / f_520_;
			f_521_ = 1.0F / f_521_;
			f_522_ = 1.0F / f_522_;
			f_523_ = 1.0F / f_523_;
			f_524_ = 1.0F / f_524_;
			f_525_ = 1.0F / f_525_;
			float f_557_ = (float) (i >> 24 & 0xff);
			float f_558_ = (float) (i_532_ >> 24 & 0xff);
			float f_559_ = (float) (i_533_ >> 24 & 0xff);
			float f_560_ = (float) (i >> 16 & 0xff);
			float f_561_ = (float) (i_532_ >> 16 & 0xff);
			float f_562_ = (float) (i_533_ >> 16 & 0xff);
			float f_563_ = (float) (i >> 8 & 0xff);
			float f_564_ = (float) (i_532_ >> 8 & 0xff);
			float f_565_ = (float) (i_533_ >> 8 & 0xff);
			float f_566_ = (float) (i & 0xff);
			float f_567_ = (float) (i_532_ & 0xff);
			float f_568_ = (float) (i_533_ & 0xff);
			float f_569_ = 1.0F;
			float f_570_ = 0.0F;
			float f_571_ = 0.0F;
			float f_572_ = 0.0F;
			float f_573_ = 1.0F;
			float f_574_ = 0.0F;
			float f_575_ = 0.0F;
			float f_576_ = 0.0F;
			float f_577_ = 0.0F;
			float f_578_ = 0.0F;
			float f_579_ = 0.0F;
			float f_580_ = 0.0F;
			float f_581_ = 0.0F;
			float f_582_ = 0.0F;
			float f_583_ = 0.0F;
			float f_584_ = 0.0F;
			float f_585_ = 0.0F;
			float f_586_ = 0.0F;
			if (f_515_ != f) {
				float f_587_ = f_515_ - f;
				f_575_ = (f_518_ - f_517_) / f_587_;
				f_576_ = (f_521_ - f_520_) / f_587_;
				f_577_ = (f_524_ - f_523_) / f_587_;
				f_578_ = (f_527_ - f_526_) / f_587_;
				f_579_ = (f_530_ - f_529_) / f_587_;
				f_580_ = (f_536_ - f_535_) / f_587_;
				f_581_ = (f_558_ - f_557_) / f_587_;
				f_582_ = (f_561_ - f_560_) / f_587_;
				f_583_ = (f_564_ - f_563_) / f_587_;
				f_584_ = (f_567_ - f_566_) / f_587_;
				f_585_ = (f_570_ - f_569_) / f_587_;
				f_586_ = (f_573_ - f_572_) / f_587_;
			}
			float f_588_ = 0.0F;
			float f_589_ = 0.0F;
			float f_590_ = 0.0F;
			float f_591_ = 0.0F;
			float f_592_ = 0.0F;
			float f_593_ = 0.0F;
			float f_594_ = 0.0F;
			float f_595_ = 0.0F;
			float f_596_ = 0.0F;
			float f_597_ = 0.0F;
			float f_598_ = 0.0F;
			float f_599_ = 0.0F;
			if (f_516_ != f_515_) {
				float f_600_ = f_516_ - f_515_;
				f_588_ = (f_519_ - f_518_) / f_600_;
				f_589_ = (f_522_ - f_521_) / f_600_;
				f_590_ = (f_525_ - f_524_) / f_600_;
				f_591_ = (f_528_ - f_527_) / f_600_;
				f_592_ = (f_531_ - f_530_) / f_600_;
				f_593_ = (f_537_ - f_536_) / f_600_;
				f_594_ = (f_559_ - f_558_) / f_600_;
				f_595_ = (f_562_ - f_561_) / f_600_;
				f_596_ = (f_565_ - f_564_) / f_600_;
				f_597_ = (f_568_ - f_567_) / f_600_;
				f_598_ = (f_571_ - f_570_) / f_600_;
				f_599_ = (f_574_ - f_573_) / f_600_;
			}
			float f_601_ = 0.0F;
			float f_602_ = 0.0F;
			float f_603_ = 0.0F;
			float f_604_ = 0.0F;
			float f_605_ = 0.0F;
			float f_606_ = 0.0F;
			float f_607_ = 0.0F;
			float f_608_ = 0.0F;
			float f_609_ = 0.0F;
			float f_610_ = 0.0F;
			float f_611_ = 0.0F;
			float f_612_ = 0.0F;
			if (f != f_516_) {
				float f_613_ = f - f_516_;
				f_601_ = (f_517_ - f_519_) / f_613_;
				f_602_ = (f_520_ - f_522_) / f_613_;
				f_603_ = (f_523_ - f_525_) / f_613_;
				f_604_ = (f_526_ - f_528_) / f_613_;
				f_605_ = (f_529_ - f_531_) / f_613_;
				f_606_ = (f_535_ - f_537_) / f_613_;
				f_607_ = (f_557_ - f_559_) / f_613_;
				f_608_ = (f_560_ - f_562_) / f_613_;
				f_609_ = (f_563_ - f_565_) / f_613_;
				f_610_ = (f_566_ - f_568_) / f_613_;
				f_611_ = (f_569_ - f_571_) / f_613_;
				f_612_ = (f_572_ - f_574_) / f_613_;
			}
			if (!(f >= (float) anInt1450)) {
				if (f_515_ > (float) anInt1450)
					f_515_ = (float) anInt1450;
				if (f_516_ > (float) anInt1450)
					f_516_ = (float) anInt1450;
				if (f_515_ < f_516_) {
					f_519_ = f_517_;
					f_522_ = f_520_;
					f_525_ = f_523_;
					f_528_ = f_526_;
					f_531_ = f_529_;
					f_537_ = f_535_;
					f_559_ = f_557_;
					f_562_ = f_560_;
					f_565_ = f_563_;
					f_568_ = f_566_;
					f_571_ = f_569_;
					f_574_ = f_572_;
					if (f < 0.0F) {
						f_517_ -= f_575_ * f;
						f_519_ -= f_601_ * f;
						f_520_ -= f_576_ * f;
						f_522_ -= f_602_ * f;
						f_523_ -= f_577_ * f;
						f_525_ -= f_603_ * f;
						f_526_ -= f_578_ * f;
						f_528_ -= f_604_ * f;
						f_529_ -= f_579_ * f;
						f_531_ -= f_605_ * f;
						f_535_ -= f_580_ * f;
						f_537_ -= f_606_ * f;
						f_557_ -= f_581_ * f;
						f_559_ -= f_607_ * f;
						f_560_ -= f_582_ * f;
						f_562_ -= f_608_ * f;
						f_563_ -= f_583_ * f;
						f_565_ -= f_609_ * f;
						f_566_ -= f_584_ * f;
						f_568_ -= f_610_ * f;
						f_569_ -= f_585_ * f;
						f_571_ -= f_611_ * f;
						f_572_ -= f_586_ * f;
						f_574_ -= f_612_ * f;
						f = 0.0F;
					}
					if (f_515_ < 0.0F) {
						f_518_ -= f_588_ * f_515_;
						f_521_ -= f_589_ * f_515_;
						f_524_ -= f_590_ * f_515_;
						f_527_ -= f_591_ * f_515_;
						f_530_ -= f_592_ * f_515_;
						f_536_ -= f_593_ * f_515_;
						f_558_ -= f_594_ * f_515_;
						f_561_ -= f_595_ * f_515_;
						f_564_ -= f_596_ * f_515_;
						f_567_ -= f_597_ * f_515_;
						f_570_ -= f_598_ * f_515_;
						f_573_ -= f_599_ * f_515_;
						f_515_ = 0.0F;
					}
					if (f != f_515_ && f_601_ < f_575_ || f == f_515_ && f_601_ > f_588_) {
						f += 0.5F;
						f_515_ += 0.5F;
						f_516_ = (float) (int) (f_516_ + 0.5F) - f_515_;
						f_515_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_515_ >= 0.0F) {
							method2082(bool_513_, bool_514_, anIntArray1459, (int) f, (int) f_519_, (int) f_517_, f_522_, f_520_, f_525_, f_523_, f_528_, f_526_, f_531_, f_529_, f_537_, f_535_, f_559_, f_557_, f_562_, f_560_, f_565_, f_563_, f_568_, f_566_, f_571_, f_569_, f_574_, f_572_);
							f_517_ += f_575_;
							f_519_ += f_601_;
							f_520_ += f_576_;
							f_522_ += f_602_;
							f_523_ += f_577_;
							f_525_ += f_603_;
							f_526_ += f_578_;
							f_528_ += f_604_;
							f_529_ += f_579_;
							f_531_ += f_605_;
							f_535_ += f_580_;
							f_537_ += f_606_;
							f_557_ += f_581_;
							f_559_ += f_607_;
							f_560_ += f_582_;
							f_562_ += f_608_;
							f_563_ += f_583_;
							f_565_ += f_609_;
							f_566_ += f_584_;
							f_568_ += f_610_;
							f_569_ += f_585_;
							f_571_ += f_611_;
							f_572_ += f_586_;
							f_574_ += f_612_;
							f += (float) anInt1458;
						}
						while (--f_516_ >= 0.0F) {
							method2082(bool_513_, bool_514_, anIntArray1459, (int) f, (int) f_519_, (int) f_518_, f_522_, f_521_, f_525_, f_524_, f_528_, f_527_, f_531_, f_530_, f_537_, f_536_, f_559_, f_558_, f_562_, f_561_, f_565_, f_564_, f_568_, f_567_, f_571_, f_570_, f_574_, f_573_);
							f_518_ += f_588_;
							f_519_ += f_601_;
							f_521_ += f_589_;
							f_522_ += f_602_;
							f_524_ += f_590_;
							f_525_ += f_603_;
							f_527_ += f_591_;
							f_528_ += f_604_;
							f_530_ += f_592_;
							f_531_ += f_605_;
							f_536_ += f_593_;
							f_537_ += f_606_;
							f_558_ += f_594_;
							f_559_ += f_607_;
							f_561_ += f_595_;
							f_562_ += f_608_;
							f_564_ += f_596_;
							f_565_ += f_609_;
							f_567_ += f_597_;
							f_568_ += f_610_;
							f_570_ += f_598_;
							f_571_ += f_611_;
							f_573_ += f_599_;
							f_574_ += f_612_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_515_ += 0.5F;
						f_516_ = (float) (int) (f_516_ + 0.5F) - f_515_;
						f_515_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_515_ >= 0.0F) {
							method2082(bool_513_, bool_514_, anIntArray1459, (int) f, (int) f_517_, (int) f_519_, f_520_, f_522_, f_523_, f_525_, f_526_, f_528_, f_529_, f_531_, f_535_, f_537_, f_557_, f_559_, f_560_, f_562_, f_563_, f_565_, f_566_, f_568_, f_569_, f_571_, f_572_, f_574_);
							f_517_ += f_575_;
							f_519_ += f_601_;
							f_520_ += f_576_;
							f_522_ += f_602_;
							f_523_ += f_577_;
							f_525_ += f_603_;
							f_526_ += f_578_;
							f_528_ += f_604_;
							f_529_ += f_579_;
							f_531_ += f_605_;
							f_535_ += f_580_;
							f_537_ += f_606_;
							f_557_ += f_581_;
							f_559_ += f_607_;
							f_560_ += f_582_;
							f_562_ += f_608_;
							f_563_ += f_583_;
							f_565_ += f_609_;
							f_566_ += f_584_;
							f_568_ += f_610_;
							f_569_ += f_585_;
							f_571_ += f_611_;
							f_572_ += f_586_;
							f_574_ += f_612_;
							f += (float) anInt1458;
						}
						while (--f_516_ >= 0.0F) {
							method2082(bool_513_, bool_514_, anIntArray1459, (int) f, (int) f_518_, (int) f_519_, f_521_, f_522_, f_524_, f_525_, f_527_, f_528_, f_530_, f_531_, f_536_, f_537_, f_558_, f_559_, f_561_, f_562_, f_564_, f_565_, f_567_, f_568_, f_570_, f_571_, f_573_, f_574_);
							f_518_ += f_588_;
							f_519_ += f_601_;
							f_521_ += f_589_;
							f_522_ += f_602_;
							f_524_ += f_590_;
							f_525_ += f_603_;
							f_527_ += f_591_;
							f_528_ += f_604_;
							f_530_ += f_592_;
							f_531_ += f_605_;
							f_536_ += f_593_;
							f_537_ += f_606_;
							f_558_ += f_594_;
							f_559_ += f_607_;
							f_561_ += f_595_;
							f_562_ += f_608_;
							f_564_ += f_596_;
							f_565_ += f_609_;
							f_567_ += f_597_;
							f_568_ += f_610_;
							f_570_ += f_598_;
							f_571_ += f_611_;
							f_573_ += f_599_;
							f_574_ += f_612_;
							f += (float) anInt1458;
						}
					}
				} else {
					f_518_ = f_517_;
					f_521_ = f_520_;
					f_524_ = f_523_;
					f_527_ = f_526_;
					f_530_ = f_529_;
					f_536_ = f_535_;
					f_558_ = f_557_;
					f_561_ = f_560_;
					f_564_ = f_563_;
					f_567_ = f_566_;
					f_570_ = f_569_;
					f_573_ = f_572_;
					if (f < 0.0F) {
						f_517_ -= f_575_ * f;
						f_518_ -= f_601_ * f;
						f_520_ -= f_576_ * f;
						f_521_ -= f_602_ * f;
						f_523_ -= f_577_ * f;
						f_524_ -= f_603_ * f;
						f_526_ -= f_578_ * f;
						f_527_ -= f_604_ * f;
						f_529_ -= f_579_ * f;
						f_530_ -= f_605_ * f;
						f_535_ -= f_580_ * f;
						f_536_ -= f_606_ * f;
						f_557_ -= f_581_ * f;
						f_558_ -= f_607_ * f;
						f_560_ -= f_582_ * f;
						f_561_ -= f_608_ * f;
						f_563_ -= f_583_ * f;
						f_564_ -= f_609_ * f;
						f_566_ -= f_584_ * f;
						f_567_ -= f_610_ * f;
						f_569_ -= f_585_ * f;
						f_570_ -= f_611_ * f;
						f_572_ -= f_586_ * f;
						f_573_ -= f_612_ * f;
						f = 0.0F;
					}
					if (f_516_ < 0.0F) {
						f_519_ -= f_588_ * f_516_;
						f_522_ -= f_589_ * f_516_;
						f_525_ -= f_590_ * f_516_;
						f_528_ -= f_591_ * f_516_;
						f_531_ -= f_592_ * f_516_;
						f_537_ -= f_593_ * f_516_;
						f_559_ -= f_594_ * f_516_;
						f_562_ -= f_595_ * f_516_;
						f_565_ -= f_596_ * f_516_;
						f_568_ -= f_597_ * f_516_;
						f_571_ -= f_598_ * f_516_;
						f_574_ -= f_599_ * f_516_;
						f_516_ = 0.0F;
					}
					if (f != f_516_ && f_601_ < f_575_ || f == f_516_ && f_588_ > f_575_) {
						f += 0.5F;
						f_516_ += 0.5F;
						f_515_ = (float) (int) (f_515_ + 0.5F) - f_516_;
						f_516_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_516_ >= 0.0F) {
							method2082(bool_513_, bool_514_, anIntArray1459, (int) f, (int) f_518_, (int) f_517_, f_521_, f_520_, f_524_, f_523_, f_527_, f_526_, f_530_, f_529_, f_536_, f_535_, f_558_, f_557_, f_561_, f_560_, f_564_, f_563_, f_567_, f_566_, f_570_, f_569_, f_573_, f_572_);
							f_517_ += f_575_;
							f_518_ += f_601_;
							f_520_ += f_576_;
							f_521_ += f_602_;
							f_523_ += f_577_;
							f_524_ += f_603_;
							f_526_ += f_578_;
							f_527_ += f_604_;
							f_529_ += f_579_;
							f_530_ += f_605_;
							f_535_ += f_580_;
							f_536_ += f_606_;
							f_557_ += f_581_;
							f_558_ += f_607_;
							f_560_ += f_582_;
							f_561_ += f_608_;
							f_563_ += f_583_;
							f_564_ += f_609_;
							f_566_ += f_584_;
							f_567_ += f_610_;
							f_569_ += f_585_;
							f_570_ += f_611_;
							f_572_ += f_586_;
							f_573_ += f_612_;
							f += (float) anInt1458;
						}
						while (--f_515_ >= 0.0F) {
							method2082(bool_513_, bool_514_, anIntArray1459, (int) f, (int) f_519_, (int) f_517_, f_522_, f_520_, f_525_, f_523_, f_528_, f_526_, f_531_, f_529_, f_537_, f_535_, f_559_, f_557_, f_562_, f_560_, f_565_, f_563_, f_568_, f_566_, f_571_, f_569_, f_574_, f_572_);
							f_519_ += f_588_;
							f_517_ += f_575_;
							f_522_ += f_589_;
							f_520_ += f_576_;
							f_525_ += f_590_;
							f_523_ += f_577_;
							f_528_ += f_591_;
							f_526_ += f_578_;
							f_531_ += f_592_;
							f_529_ += f_579_;
							f_537_ += f_593_;
							f_535_ += f_580_;
							f_559_ += f_594_;
							f_557_ += f_581_;
							f_562_ += f_595_;
							f_560_ += f_582_;
							f_565_ += f_596_;
							f_563_ += f_583_;
							f_568_ += f_597_;
							f_566_ += f_584_;
							f_571_ += f_598_;
							f_569_ += f_585_;
							f_574_ += f_599_;
							f_572_ += f_586_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_516_ += 0.5F;
						f_515_ = (float) (int) (f_515_ + 0.5F) - f_516_;
						f_516_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_516_ >= 0.0F) {
							method2082(bool_513_, bool_514_, anIntArray1459, (int) f, (int) f_517_, (int) f_518_, f_520_, f_521_, f_523_, f_524_, f_526_, f_527_, f_529_, f_530_, f_535_, f_536_, f_557_, f_558_, f_560_, f_561_, f_563_, f_564_, f_566_, f_567_, f_569_, f_570_, f_572_, f_573_);
							f_518_ += f_601_;
							f_517_ += f_575_;
							f_521_ += f_602_;
							f_520_ += f_576_;
							f_524_ += f_603_;
							f_523_ += f_577_;
							f_527_ += f_604_;
							f_526_ += f_578_;
							f_530_ += f_605_;
							f_529_ += f_579_;
							f_536_ += f_606_;
							f_535_ += f_580_;
							f_558_ += f_607_;
							f_557_ += f_581_;
							f_561_ += f_608_;
							f_560_ += f_582_;
							f_564_ += f_609_;
							f_563_ += f_583_;
							f_567_ += f_610_;
							f_566_ += f_584_;
							f_570_ += f_611_;
							f_569_ += f_585_;
							f_573_ += f_612_;
							f_572_ += f_586_;
							f += (float) anInt1458;
						}
						while (--f_515_ >= 0.0F) {
							method2082(bool_513_, bool_514_, anIntArray1459, (int) f, (int) f_517_, (int) f_519_, f_520_, f_522_, f_523_, f_525_, f_526_, f_528_, f_529_, f_531_, f_535_, f_537_, f_557_, f_559_, f_560_, f_562_, f_563_, f_565_, f_566_, f_568_, f_569_, f_571_, f_572_, f_574_);
							f_517_ += f_575_;
							f_519_ += f_588_;
							f_520_ += f_576_;
							f_522_ += f_589_;
							f_523_ += f_577_;
							f_525_ += f_590_;
							f_526_ += f_578_;
							f_528_ += f_591_;
							f_529_ += f_579_;
							f_531_ += f_592_;
							f_535_ += f_580_;
							f_537_ += f_593_;
							f_557_ += f_581_;
							f_559_ += f_594_;
							f_560_ += f_582_;
							f_562_ += f_595_;
							f_563_ += f_583_;
							f_565_ += f_596_;
							f_566_ += f_584_;
							f_568_ += f_597_;
							f_569_ += f_585_;
							f_571_ += f_598_;
							f_572_ += f_586_;
							f_574_ += f_599_;
							f += (float) anInt1458;
						}
					}
				}
			}
		}
	}

	final void method2086(boolean bool, boolean bool_614_, int[] is, int i, int i_615_, int i_616_, int i_617_, int i_618_, float f, float f_619_, float f_620_, float f_621_) {
		if (aBool1445) {
			if (i_618_ > anInt1442)
				i_618_ = anInt1442;
			if (i_617_ < 0)
				i_617_ = 0;
		}
		if (i_617_ < i_618_) {
			i += i_617_ - 1;
			f += f_619_ * (float) i_617_;
			f_620_ += f_621_ * (float) i_617_;
			if (aClass101_1457.aBool1227) {
				if (aBool1467) {
					i_616_ = i_618_ - i_617_ >> 2;
					f_619_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_616_ > 0) {
							do {
								i_615_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								f += f_619_;
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									is[i] = i_615_;
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									is[i] = i_615_;
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									is[i] = i_615_;
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									is[i] = i_615_;
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
							} while (--i_616_ > 0);
						}
						i_616_ = i_618_ - i_617_ & 0x3;
						if (i_616_ > 0) {
							i_615_ = Class656.anIntArray8393[(int) f & 0xffff];
							do {
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									is[i] = i_615_;
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
							} while (--i_616_ > 0);
						}
					} else {
						int i_622_ = anInt1441;
						int i_623_ = 256 - anInt1441;
						if (i_616_ > 0) {
							do {
								i_615_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								f += f_619_;
								i_615_ = (((i_615_ & 0xff00ff) * i_623_ >> 8 & 0xff00ff) + ((i_615_ & 0xff00) * i_623_ >> 8 & 0xff00));
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									int i_624_ = is[i];
									if (bool_614_)
										is[i] = ((i_623_ | i_624_ >> 24) << 24 | (i_615_ + (((i_624_ & 0xff00ff) * i_622_) >> 8 & 0xff00ff) + (((i_624_ & 0xff00) * i_622_) >> 8 & 0xff00)));
									else
										is[i] = (i_615_ + (((i_624_ & 0xff00ff) * i_622_ >> 8) & 0xff00ff) + (((i_624_ & 0xff00) * i_622_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									int i_625_ = is[i];
									if (bool_614_)
										is[i] = ((i_623_ | i_625_ >> 24) << 24 | (i_615_ + (((i_625_ & 0xff00ff) * i_622_) >> 8 & 0xff00ff) + (((i_625_ & 0xff00) * i_622_) >> 8 & 0xff00)));
									else
										is[i] = (i_615_ + (((i_625_ & 0xff00ff) * i_622_ >> 8) & 0xff00ff) + (((i_625_ & 0xff00) * i_622_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									int i_626_ = is[i];
									if (bool_614_)
										is[i] = ((i_623_ | i_626_ >> 24) << 24 | (i_615_ + (((i_626_ & 0xff00ff) * i_622_) >> 8 & 0xff00ff) + (((i_626_ & 0xff00) * i_622_) >> 8 & 0xff00)));
									else
										is[i] = (i_615_ + (((i_626_ & 0xff00ff) * i_622_ >> 8) & 0xff00ff) + (((i_626_ & 0xff00) * i_622_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									int i_627_ = is[i];
									if (bool_614_)
										is[i] = ((i_623_ | i_627_ >> 24) << 24 | (i_615_ + (((i_627_ & 0xff00ff) * i_622_) >> 8 & 0xff00ff) + (((i_627_ & 0xff00) * i_622_) >> 8 & 0xff00)));
									else
										is[i] = (i_615_ + (((i_627_ & 0xff00ff) * i_622_ >> 8) & 0xff00ff) + (((i_627_ & 0xff00) * i_622_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
							} while (--i_616_ > 0);
						}
						i_616_ = i_618_ - i_617_ & 0x3;
						if (i_616_ > 0) {
							i_615_ = Class656.anIntArray8393[(int) f & 0xffff];
							i_615_ = (((i_615_ & 0xff00ff) * i_623_ >> 8 & 0xff00ff) + ((i_615_ & 0xff00) * i_623_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f_620_ < aFloatArray1460[i]) {
									int i_628_ = is[i];
									if (bool_614_)
										is[i] = ((i_623_ | i_628_ >> 24) << 24 | (i_615_ + (((i_628_ & 0xff00ff) * i_622_) >> 8 & 0xff00ff) + (((i_628_ & 0xff00) * i_622_) >> 8 & 0xff00)));
									else
										is[i] = (i_615_ + (((i_628_ & 0xff00ff) * i_622_ >> 8) & 0xff00ff) + (((i_628_ & 0xff00) * i_622_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_620_;
								}
								f_620_ += f_621_;
							} while (--i_616_ > 0);
						}
					}
				} else {
					i_616_ = i_618_ - i_617_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f_620_ < aFloatArray1460[i]) {
								is[i] = (Class656.anIntArray8393[(int) f & 0xffff]);
								if (bool)
									aFloatArray1460[i] = f_620_;
							}
							f_620_ += f_621_;
							f += f_619_;
						} while (--i_616_ > 0);
					} else {
						int i_629_ = anInt1441;
						int i_630_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f_620_ < aFloatArray1460[i]) {
								i_615_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								i_615_ = (((i_615_ & 0xff00ff) * i_630_ >> 8 & 0xff00ff) + ((i_615_ & 0xff00) * i_630_ >> 8 & 0xff00));
								int i_631_ = is[i];
								if (bool_614_)
									is[i] = ((i_630_ | i_631_ >> 24) << 24 | (i_615_ + (((i_631_ & 0xff00ff) * i_629_ >> 8) & 0xff00ff) + (((i_631_ & 0xff00) * i_629_ >> 8) & 0xff00)));
								else
									is[i] = (i_615_ + ((i_631_ & 0xff00ff) * i_629_ >> 8 & 0xff00ff) + ((i_631_ & 0xff00) * i_629_ >> 8 & 0xff00));
								if (bool)
									aFloatArray1460[i] = f_620_;
							}
							f += f_619_;
							f_620_ += f_621_;
						} while (--i_616_ > 0);
					}
				}
			} else if (aBool1467) {
				i_616_ = i_618_ - i_617_ >> 2;
				f_619_ *= 4.0F;
				if (anInt1441 == 0) {
					if (i_616_ > 0) {
						do {
							i_615_ = Class656.anIntArray8393[(int) f & 0xffff];
							f += f_619_;
							i++;
							if (!bool || f_620_ < aFloatArray1460[i])
								is[i] = i_615_;
							f_620_ += f_621_;
							i++;
							if (!bool || f_620_ < aFloatArray1460[i])
								is[i] = i_615_;
							f_620_ += f_621_;
							i++;
							if (!bool || f_620_ < aFloatArray1460[i])
								is[i] = i_615_;
							f_620_ += f_621_;
							i++;
							if (!bool || f_620_ < aFloatArray1460[i])
								is[i] = i_615_;
							f_620_ += f_621_;
						} while (--i_616_ > 0);
					}
					i_616_ = i_618_ - i_617_ & 0x3;
					if (i_616_ > 0) {
						i_615_ = Class656.anIntArray8393[(int) f & 0xffff];
						do {
							i++;
							if (!bool || f_620_ < aFloatArray1460[i])
								is[i] = i_615_;
							f_620_ += f_621_;
						} while (--i_616_ > 0);
					}
				} else {
					int i_632_ = anInt1441;
					int i_633_ = 256 - anInt1441;
					if (i_616_ > 0) {
						do {
							i_615_ = Class656.anIntArray8393[(int) f & 0xffff];
							f += f_619_;
							i_615_ = (((i_615_ & 0xff00ff) * i_633_ >> 8 & 0xff00ff) + ((i_615_ & 0xff00) * i_633_ >> 8 & 0xff00));
							i++;
							if (!bool || f_620_ < aFloatArray1460[i]) {
								int i_634_ = is[i];
								if (bool_614_)
									is[i] = ((i_633_ | i_634_ >> 24) << 24 | (i_615_ + (((i_634_ & 0xff00ff) * i_632_ >> 8) & 0xff00ff) + (((i_634_ & 0xff00) * i_632_ >> 8) & 0xff00)));
								else
									is[i] = (i_615_ + ((i_634_ & 0xff00ff) * i_632_ >> 8 & 0xff00ff) + ((i_634_ & 0xff00) * i_632_ >> 8 & 0xff00));
							}
							f_620_ += f_621_;
							i++;
							if (!bool || f_620_ < aFloatArray1460[i]) {
								int i_635_ = is[i];
								if (bool_614_)
									is[i] = ((i_633_ | i_635_ >> 24) << 24 | (i_615_ + (((i_635_ & 0xff00ff) * i_632_ >> 8) & 0xff00ff) + (((i_635_ & 0xff00) * i_632_ >> 8) & 0xff00)));
								else
									is[i] = (i_615_ + ((i_635_ & 0xff00ff) * i_632_ >> 8 & 0xff00ff) + ((i_635_ & 0xff00) * i_632_ >> 8 & 0xff00));
							}
							f_620_ += f_621_;
							i++;
							if (!bool || f_620_ < aFloatArray1460[i]) {
								int i_636_ = is[i];
								if (bool_614_)
									is[i] = ((i_633_ | i_636_ >> 24) << 24 | (i_615_ + (((i_636_ & 0xff00ff) * i_632_ >> 8) & 0xff00ff) + (((i_636_ & 0xff00) * i_632_ >> 8) & 0xff00)));
								else
									is[i] = (i_615_ + ((i_636_ & 0xff00ff) * i_632_ >> 8 & 0xff00ff) + ((i_636_ & 0xff00) * i_632_ >> 8 & 0xff00));
							}
							f_620_ += f_621_;
							i++;
							if (!bool || f_620_ < aFloatArray1460[i]) {
								int i_637_ = is[i];
								if (bool_614_)
									is[i] = ((i_633_ | i_637_ >> 24) << 24 | (i_615_ + (((i_637_ & 0xff00ff) * i_632_ >> 8) & 0xff00ff) + (((i_637_ & 0xff00) * i_632_ >> 8) & 0xff00)));
								else
									is[i] = (i_615_ + ((i_637_ & 0xff00ff) * i_632_ >> 8 & 0xff00ff) + ((i_637_ & 0xff00) * i_632_ >> 8 & 0xff00));
							}
							f_620_ += f_621_;
						} while (--i_616_ > 0);
					}
					i_616_ = i_618_ - i_617_ & 0x3;
					if (i_616_ > 0) {
						i_615_ = Class656.anIntArray8393[(int) f & 0xffff];
						i_615_ = (((i_615_ & 0xff00ff) * i_633_ >> 8 & 0xff00ff) + ((i_615_ & 0xff00) * i_633_ >> 8 & 0xff00));
						do {
							i++;
							if (!bool || f_620_ < aFloatArray1460[i]) {
								int i_638_ = is[i];
								if (bool_614_)
									is[i] = ((i_633_ | i_638_ >> 24) << 24 | (i_615_ + (((i_638_ & 0xff00ff) * i_632_ >> 8) & 0xff00ff) + (((i_638_ & 0xff00) * i_632_ >> 8) & 0xff00)));
								else
									is[i] = (i_615_ + ((i_638_ & 0xff00ff) * i_632_ >> 8 & 0xff00ff) + ((i_638_ & 0xff00) * i_632_ >> 8 & 0xff00));
							}
							f_620_ += f_621_;
						} while (--i_616_ > 0);
					}
				}
			} else {
				i_616_ = i_618_ - i_617_;
				if (anInt1441 == 0) {
					do {
						i++;
						if (!bool || f_620_ < aFloatArray1460[i])
							is[i] = Class656.anIntArray8393[(int) f & 0xffff];
						f_620_ += f_621_;
						f += f_619_;
					} while (--i_616_ > 0);
				} else {
					int i_639_ = anInt1441;
					int i_640_ = 256 - anInt1441;
					do {
						i++;
						if (!bool || f_620_ < aFloatArray1460[i]) {
							i_615_ = Class656.anIntArray8393[(int) f & 0xffff];
							i_615_ = (((i_615_ & 0xff00ff) * i_640_ >> 8 & 0xff00ff) + ((i_615_ & 0xff00) * i_640_ >> 8 & 0xff00));
							int i_641_ = is[i];
							if (bool_614_)
								is[i] = ((i_640_ | i_641_ >> 24) << 24 | (i_615_ + ((i_641_ & 0xff00ff) * i_639_ >> 8 & 0xff00ff) + ((i_641_ & 0xff00) * i_639_ >> 8 & 0xff00)));
							else
								is[i] = (i_615_ + ((i_641_ & 0xff00ff) * i_639_ >> 8 & 0xff00ff) + ((i_641_ & 0xff00) * i_639_ >> 8 & 0xff00));
						}
						f += f_619_;
						f_620_ += f_621_;
					} while (--i_616_ > 0);
				}
			}
		}
	}

	final void method2087(boolean bool) {
		aBool1449 = bool;
	}

	final void method2088(boolean bool) {
		aBool1449 = bool;
	}

	final void method2089(boolean bool) {
		aBool1449 = bool;
	}

	final void method2090(boolean bool, boolean bool_642_, int[] is, int i, int i_643_, int i_644_, float f, float f_645_, float f_646_, float f_647_, float f_648_, float f_649_, float f_650_, float f_651_, float f_652_, float f_653_, float f_654_, float f_655_, float f_656_, float f_657_, float f_658_, float f_659_, float f_660_, float f_661_, float f_662_, float f_663_, float f_664_, float f_665_) {
		int i_666_ = i_644_ - i_643_;
		float f_667_ = 1.0F / (float) i_666_;
		float f_668_ = (f_645_ - f) * f_667_;
		float f_669_ = (f_647_ - f_646_) * f_667_;
		float f_670_ = (f_649_ - f_648_) * f_667_;
		float f_671_ = (f_651_ - f_650_) * f_667_;
		float f_672_ = (f_653_ - f_652_) * f_667_;
		float f_673_ = (f_655_ - f_654_) * f_667_;
		float f_674_ = (f_657_ - f_656_) * f_667_;
		float f_675_ = (f_659_ - f_658_) * f_667_;
		float f_676_ = (f_661_ - f_660_) * f_667_;
		float f_677_ = (f_663_ - f_662_) * f_667_;
		float f_678_ = (f_665_ - f_664_) * f_667_;
		if (aBool1445) {
			if (i_644_ > anInt1442)
				i_644_ = anInt1442;
			if (i_643_ < 0) {
				f -= f_668_ * (float) i_643_;
				f_646_ -= f_669_ * (float) i_643_;
				f_648_ -= f_670_ * (float) i_643_;
				f_650_ -= f_671_ * (float) i_643_;
				f_652_ -= f_672_ * (float) i_643_;
				f_654_ -= f_673_ * (float) i_643_;
				f_656_ -= f_674_ * (float) i_643_;
				f_658_ -= f_675_ * (float) i_643_;
				f_660_ -= f_676_ * (float) i_643_;
				f_662_ -= f_677_ * (float) i_643_;
				f_664_ -= f_678_ * (float) i_643_;
				i_643_ = 0;
			}
		}
		if (i_643_ < i_644_) {
			i_666_ = i_644_ - i_643_;
			i += i_643_;
			while (i_666_-- > 0) {
				float f_679_ = 1.0F / f;
				float f_680_ = 1.0F / f_646_;
				if (!bool || f_679_ < aFloatArray1460[i]) {
					float f_681_ = f_648_ * f_680_;
					float f_682_ = f_650_ * f_680_;
					int i_683_ = ((int) (f_681_ * (float) anInt1464 * aFloat1455) & anInt1476);
					int i_684_ = ((int) (f_682_ * (float) anInt1464 * aFloat1455) & anInt1476);
					int i_685_ = anIntArray1463[i_684_ * anInt1464 + i_683_];
					i_683_ = ((int) (f_681_ * (float) anInt1472 * aFloat1474) & anInt1473);
					i_684_ = ((int) (f_682_ * (float) anInt1472 * aFloat1474) & anInt1473);
					int i_686_ = anIntArray1454[i_684_ * anInt1472 + i_683_];
					i_683_ = ((int) (f_681_ * (float) anInt1469 * aFloat1479) & anInt1465);
					i_684_ = ((int) (f_682_ * (float) anInt1469 * aFloat1479) & anInt1465);
					int i_687_ = anIntArray1471[i_684_ * anInt1469 + i_683_];
					float f_688_ = 1.0F - (f_662_ + f_664_);
					i_685_ = (~0xffffff | ((int) (f_662_ * (float) (i_685_ >> 16 & 0xff)) << 16) | (int) (f_662_ * (float) (i_685_ >> 8 & 0xff)) << 8 | (int) (f_662_ * (float) (i_685_ & 0xff)));
					i_686_ = (~0xffffff | ((int) (f_664_ * (float) (i_686_ >> 16 & 0xff)) << 16) | (int) (f_664_ * (float) (i_686_ >> 8 & 0xff)) << 8 | (int) (f_664_ * (float) (i_686_ & 0xff)));
					i_687_ = (~0xffffff | ((int) (f_688_ * (float) (i_687_ >> 16 & 0xff)) << 16) | (int) (f_688_ * (float) (i_687_ >> 8 & 0xff)) << 8 | (int) (f_688_ * (float) (i_687_ & 0xff)));
					int i_689_ = i_685_ + i_686_ + i_687_;
					int i_690_ = (~0xffffff | ((int) (f_656_ * (float) (i_689_ >> 16 & 0xff)) << 8) & 0xff0000 | ((int) (f_658_ * (float) (i_689_ >> 8 & 0xff)) & 0xff00) | (int) (f_660_ * (float) (i_689_ & 0xff)) >> 8);
					if (f_652_ != 0.0F) {
						int i_691_ = (int) (255.0F - f_652_);
						int i_692_ = ((((anInt1461 & 0xff00ff) * (int) f_652_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_652_ & 0xff0000)) >>> 8);
						i_690_ = (((i_690_ & 0xff00ff) * i_691_ & ~0xff00ff | (i_690_ & 0xff00) * i_691_ & 0xff0000) >>> 8) + i_692_;
					}
					if (bool_642_)
						is[i] = ((int) f_654_ | is[i] >> 24) << 24 | i_690_;
					else
						is[i] = i_690_;
					if (bool)
						aFloatArray1460[i] = f_679_;
				}
				i++;
				f += f_668_;
				f_646_ += f_669_;
				f_648_ += f_670_;
				f_650_ += f_671_;
				f_652_ += f_672_;
				f_654_ += f_673_;
				f_656_ += f_674_;
				f_658_ += f_675_;
				f_660_ += f_676_;
				f_662_ += f_677_;
				f_664_ += f_678_;
			}
		}
	}

	final void method2091(boolean bool, boolean bool_693_, boolean bool_694_, float f, float f_695_, float f_696_, float f_697_, float f_698_, float f_699_, float f_700_, float f_701_, float f_702_, float f_703_, float f_704_, float f_705_) {
		if (!bool)
			method2077(false, bool_693_, bool_694_, f, f_695_, f_696_, f_697_, f_698_, f_699_, f_700_, f_701_, f_702_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_697_, (int) f, (int) f_698_, (int) f_695_, (Class656.anIntArray8393[(int) f_703_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_698_, (int) f_695_, (int) f_699_, (int) f_696_, (Class656.anIntArray8393[(int) f_703_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_699_, (int) f_696_, (int) f_697_, (int) f, (Class656.anIntArray8393[(int) f_703_ & 0xffff]), (byte) 1);
		} else {
			float f_706_ = f_698_ - f_697_;
			float f_707_ = f_695_ - f;
			float f_708_ = f_699_ - f_697_;
			float f_709_ = f_696_ - f;
			float f_710_ = f_704_ - f_703_;
			float f_711_ = f_705_ - f_703_;
			float f_712_ = f_701_ - f_700_;
			float f_713_ = f_702_ - f_700_;
			float f_714_;
			if (f_696_ != f_695_)
				f_714_ = (f_699_ - f_698_) / (f_696_ - f_695_);
			else
				f_714_ = 0.0F;
			float f_715_;
			if (f_695_ != f)
				f_715_ = f_706_ / f_707_;
			else
				f_715_ = 0.0F;
			float f_716_;
			if (f_696_ != f)
				f_716_ = f_708_ / f_709_;
			else
				f_716_ = 0.0F;
			float f_717_ = f_706_ * f_709_ - f_708_ * f_707_;
			if (f_717_ != 0.0F) {
				float f_718_ = (f_710_ * f_709_ - f_711_ * f_707_) / f_717_;
				float f_719_ = (f_711_ * f_706_ - f_710_ * f_708_) / f_717_;
				float f_720_ = (f_712_ * f_709_ - f_713_ * f_707_) / f_717_;
				float f_721_ = (f_713_ * f_706_ - f_712_ * f_708_) / f_717_;
				if (f <= f_695_ && f <= f_696_) {
					if (!(f >= (float) anInt1450)) {
						if (f_695_ > (float) anInt1450)
							f_695_ = (float) anInt1450;
						if (f_696_ > (float) anInt1450)
							f_696_ = (float) anInt1450;
						f_703_ = f_703_ - f_718_ * f_697_ + f_718_;
						f_700_ = f_700_ - f_720_ * f_697_ + f_720_;
						if (f_695_ < f_696_) {
							f_699_ = f_697_;
							if (f < 0.0F) {
								f_699_ -= f_716_ * f;
								f_697_ -= f_715_ * f;
								f_703_ -= f_719_ * f;
								f_700_ -= f_721_ * f;
								f = 0.0F;
							}
							if (f_695_ < 0.0F) {
								f_698_ -= f_714_ * f_695_;
								f_695_ = 0.0F;
							}
							if (f != f_695_ && f_716_ < f_715_ || f == f_695_ && f_716_ > f_714_) {
								f += 0.5F;
								f_695_ += 0.5F;
								f_696_ = (float) (int) (f_696_ + 0.5F) - f_695_;
								f_695_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_695_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f, 0, 0, (int) f_699_, (int) f_697_, f_703_, f_718_, f_700_, f_720_);
									f_699_ += f_716_;
									f_697_ += f_715_;
									f_703_ += f_719_;
									f_700_ += f_721_;
									f += (float) anInt1458;
								}
								while (--f_696_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f, 0, 0, (int) f_699_, (int) f_698_, f_703_, f_718_, f_700_, f_720_);
									f_699_ += f_716_;
									f_698_ += f_714_;
									f_703_ += f_719_;
									f_700_ += f_721_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_695_ += 0.5F;
								f_696_ = (float) (int) (f_696_ + 0.5F) - f_695_;
								f_695_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_695_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f, 0, 0, (int) f_697_, (int) f_699_, f_703_, f_718_, f_700_, f_720_);
									f_699_ += f_716_;
									f_697_ += f_715_;
									f_703_ += f_719_;
									f_700_ += f_721_;
									f += (float) anInt1458;
								}
								while (--f_696_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f, 0, 0, (int) f_698_, (int) f_699_, f_703_, f_718_, f_700_, f_720_);
									f_699_ += f_716_;
									f_698_ += f_714_;
									f_703_ += f_719_;
									f_700_ += f_721_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_698_ = f_697_;
							if (f < 0.0F) {
								f_698_ -= f_716_ * f;
								f_697_ -= f_715_ * f;
								f_703_ -= f_719_ * f;
								f_700_ -= f_721_ * f;
								f = 0.0F;
							}
							if (f_696_ < 0.0F) {
								f_699_ -= f_714_ * f_696_;
								f_696_ = 0.0F;
							}
							if (f != f_696_ && f_716_ < f_715_ || f == f_696_ && f_714_ > f_715_) {
								f += 0.5F;
								f_696_ += 0.5F;
								f_695_ = (float) (int) (f_695_ + 0.5F) - f_696_;
								f_696_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_696_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f, 0, 0, (int) f_698_, (int) f_697_, f_703_, f_718_, f_700_, f_720_);
									f_698_ += f_716_;
									f_697_ += f_715_;
									f_703_ += f_719_;
									f_700_ += f_721_;
									f += (float) anInt1458;
								}
								while (--f_695_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f, 0, 0, (int) f_699_, (int) f_697_, f_703_, f_718_, f_700_, f_720_);
									f_699_ += f_714_;
									f_697_ += f_715_;
									f_703_ += f_719_;
									f_700_ += f_721_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_696_ += 0.5F;
								f_695_ = (float) (int) (f_695_ + 0.5F) - f_696_;
								f_696_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_696_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f, 0, 0, (int) f_697_, (int) f_698_, f_703_, f_718_, f_700_, f_720_);
									f_698_ += f_716_;
									f_697_ += f_715_;
									f_703_ += f_719_;
									f_700_ += f_721_;
									f += (float) anInt1458;
								}
								while (--f_695_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f, 0, 0, (int) f_697_, (int) f_699_, f_703_, f_718_, f_700_, f_720_);
									f_699_ += f_714_;
									f_697_ += f_715_;
									f_703_ += f_719_;
									f_700_ += f_721_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_695_ <= f_696_) {
					if (!(f_695_ >= (float) anInt1450)) {
						if (f_696_ > (float) anInt1450)
							f_696_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_704_ = f_704_ - f_718_ * f_698_ + f_718_;
						f_701_ = f_701_ - f_720_ * f_698_ + f_720_;
						if (f_696_ < f) {
							f_697_ = f_698_;
							if (f_695_ < 0.0F) {
								f_697_ -= f_715_ * f_695_;
								f_698_ -= f_714_ * f_695_;
								f_704_ -= f_719_ * f_695_;
								f_701_ -= f_721_ * f_695_;
								f_695_ = 0.0F;
							}
							if (f_696_ < 0.0F) {
								f_699_ -= f_716_ * f_696_;
								f_696_ = 0.0F;
							}
							if (f_695_ != f_696_ && f_715_ < f_714_ || f_695_ == f_696_ && f_715_ > f_716_) {
								f_695_ += 0.5F;
								f_696_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_696_;
								f_696_ -= f_695_;
								f_695_ = (float) anIntArray1447[(int) f_695_];
								while (--f_696_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f_695_, 0, 0, (int) f_697_, (int) f_698_, f_704_, f_718_, f_701_, f_720_);
									f_697_ += f_715_;
									f_698_ += f_714_;
									f_704_ += f_719_;
									f_701_ += f_721_;
									f_695_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f_695_, 0, 0, (int) f_697_, (int) f_699_, f_704_, f_718_, f_701_, f_720_);
									f_697_ += f_715_;
									f_699_ += f_716_;
									f_704_ += f_719_;
									f_701_ += f_721_;
									f_695_ += (float) anInt1458;
								}
							} else {
								f_695_ += 0.5F;
								f_696_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_696_;
								f_696_ -= f_695_;
								f_695_ = (float) anIntArray1447[(int) f_695_];
								while (--f_696_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f_695_, 0, 0, (int) f_698_, (int) f_697_, f_704_, f_718_, f_701_, f_720_);
									f_697_ += f_715_;
									f_698_ += f_714_;
									f_704_ += f_719_;
									f_701_ += f_721_;
									f_695_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f_695_, 0, 0, (int) f_699_, (int) f_697_, f_704_, f_718_, f_701_, f_720_);
									f_697_ += f_715_;
									f_699_ += f_716_;
									f_704_ += f_719_;
									f_701_ += f_721_;
									f_695_ += (float) anInt1458;
								}
							}
						} else {
							f_699_ = f_698_;
							if (f_695_ < 0.0F) {
								f_699_ -= f_715_ * f_695_;
								f_698_ -= f_714_ * f_695_;
								f_704_ -= f_719_ * f_695_;
								f_701_ -= f_721_ * f_695_;
								f_695_ = 0.0F;
							}
							if (f < 0.0F) {
								f_697_ -= f_716_ * f;
								f = 0.0F;
							}
							if (f_715_ < f_714_) {
								f_695_ += 0.5F;
								f += 0.5F;
								f_696_ = (float) (int) (f_696_ + 0.5F) - f;
								f -= f_695_;
								f_695_ = (float) anIntArray1447[(int) f_695_];
								while (--f >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f_695_, 0, 0, (int) f_699_, (int) f_698_, f_704_, f_718_, f_701_, f_720_);
									f_699_ += f_715_;
									f_698_ += f_714_;
									f_704_ += f_719_;
									f_701_ += f_721_;
									f_695_ += (float) anInt1458;
								}
								while (--f_696_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f_695_, 0, 0, (int) f_697_, (int) f_698_, f_704_, f_718_, f_701_, f_720_);
									f_697_ += f_716_;
									f_698_ += f_714_;
									f_704_ += f_719_;
									f_701_ += f_721_;
									f_695_ += (float) anInt1458;
								}
							} else {
								f_695_ += 0.5F;
								f += 0.5F;
								f_696_ = (float) (int) (f_696_ + 0.5F) - f;
								f -= f_695_;
								f_695_ = (float) anIntArray1447[(int) f_695_];
								while (--f >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f_695_, 0, 0, (int) f_698_, (int) f_699_, f_704_, f_718_, f_701_, f_720_);
									f_699_ += f_715_;
									f_698_ += f_714_;
									f_704_ += f_719_;
									f_701_ += f_721_;
									f_695_ += (float) anInt1458;
								}
								while (--f_696_ >= 0.0F) {
									method2098(bool_693_, bool_694_, anIntArray1459, (int) f_695_, 0, 0, (int) f_698_, (int) f_697_, f_704_, f_718_, f_701_, f_720_);
									f_697_ += f_716_;
									f_698_ += f_714_;
									f_704_ += f_719_;
									f_701_ += f_721_;
									f_695_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_696_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_695_ > (float) anInt1450)
						f_695_ = (float) anInt1450;
					f_705_ = f_705_ - f_718_ * f_699_ + f_718_;
					f_702_ = f_702_ - f_720_ * f_699_ + f_720_;
					if (f < f_695_) {
						f_698_ = f_699_;
						if (f_696_ < 0.0F) {
							f_698_ -= f_714_ * f_696_;
							f_699_ -= f_716_ * f_696_;
							f_705_ -= f_719_ * f_696_;
							f_702_ -= f_721_ * f_696_;
							f_696_ = 0.0F;
						}
						if (f < 0.0F) {
							f_697_ -= f_715_ * f;
							f = 0.0F;
						}
						if (f_714_ < f_716_) {
							f_696_ += 0.5F;
							f += 0.5F;
							f_695_ = (float) (int) (f_695_ + 0.5F) - f;
							f -= f_696_;
							f_696_ = (float) anIntArray1447[(int) f_696_];
							while (--f >= 0.0F) {
								method2098(bool_693_, bool_694_, anIntArray1459, (int) f_696_, 0, 0, (int) f_698_, (int) f_699_, f_705_, f_718_, f_702_, f_720_);
								f_698_ += f_714_;
								f_699_ += f_716_;
								f_705_ += f_719_;
								f_702_ += f_721_;
								f_696_ += (float) anInt1458;
							}
							while (--f_695_ >= 0.0F) {
								method2098(bool_693_, bool_694_, anIntArray1459, (int) f_696_, 0, 0, (int) f_698_, (int) f_697_, f_705_, f_718_, f_702_, f_720_);
								f_698_ += f_714_;
								f_697_ += f_715_;
								f_705_ += f_719_;
								f_702_ += f_721_;
								f_696_ += (float) anInt1458;
							}
						} else {
							f_696_ += 0.5F;
							f += 0.5F;
							f_695_ = (float) (int) (f_695_ + 0.5F) - f;
							f -= f_696_;
							f_696_ = (float) anIntArray1447[(int) f_696_];
							while (--f >= 0.0F) {
								method2098(bool_693_, bool_694_, anIntArray1459, (int) f_696_, 0, 0, (int) f_699_, (int) f_698_, f_705_, f_718_, f_702_, f_720_);
								f_698_ += f_714_;
								f_699_ += f_716_;
								f_705_ += f_719_;
								f_702_ += f_721_;
								f_696_ += (float) anInt1458;
							}
							while (--f_695_ >= 0.0F) {
								method2098(bool_693_, bool_694_, anIntArray1459, (int) f_696_, 0, 0, (int) f_697_, (int) f_698_, f_705_, f_718_, f_702_, f_720_);
								f_698_ += f_714_;
								f_697_ += f_715_;
								f_705_ += f_719_;
								f_702_ += f_721_;
								f_696_ += (float) anInt1458;
							}
						}
					} else {
						f_697_ = f_699_;
						if (f_696_ < 0.0F) {
							f_697_ -= f_714_ * f_696_;
							f_699_ -= f_716_ * f_696_;
							f_705_ -= f_719_ * f_696_;
							f_702_ -= f_721_ * f_696_;
							f_696_ = 0.0F;
						}
						if (f_695_ < 0.0F) {
							f_698_ -= f_715_ * f_695_;
							f_695_ = 0.0F;
						}
						if (f_714_ < f_716_) {
							f_696_ += 0.5F;
							f_695_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_695_;
							f_695_ -= f_696_;
							f_696_ = (float) anIntArray1447[(int) f_696_];
							while (--f_695_ >= 0.0F) {
								method2098(bool_693_, bool_694_, anIntArray1459, (int) f_696_, 0, 0, (int) f_697_, (int) f_699_, f_705_, f_718_, f_702_, f_720_);
								f_697_ += f_714_;
								f_699_ += f_716_;
								f_705_ += f_719_;
								f_702_ += f_721_;
								f_696_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_693_, bool_694_, anIntArray1459, (int) f_696_, 0, 0, (int) f_698_, (int) f_699_, f_705_, f_718_, f_702_, f_720_);
								f_698_ += f_715_;
								f_699_ += f_716_;
								f_705_ += f_719_;
								f_702_ += f_721_;
								f_696_ += (float) anInt1458;
							}
						} else {
							f_696_ += 0.5F;
							f_695_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_695_;
							f_695_ -= f_696_;
							f_696_ = (float) anIntArray1447[(int) f_696_];
							while (--f_695_ >= 0.0F) {
								method2098(bool_693_, bool_694_, anIntArray1459, (int) f_696_, 0, 0, (int) f_699_, (int) f_697_, f_705_, f_718_, f_702_, f_720_);
								f_697_ += f_714_;
								f_699_ += f_716_;
								f_705_ += f_719_;
								f_702_ += f_721_;
								f_696_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_693_, bool_694_, anIntArray1459, (int) f_696_, 0, 0, (int) f_699_, (int) f_698_, f_705_, f_718_, f_702_, f_720_);
								f_698_ += f_715_;
								f_699_ += f_716_;
								f_705_ += f_719_;
								f_702_ += f_721_;
								f_696_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2092(boolean bool, boolean bool_722_, boolean bool_723_, int[] is, int i, int i_724_, int i_725_, int i_726_, int i_727_, float f, float f_728_) {
		if (aBool1445) {
			if (i_727_ > anInt1442)
				i_727_ = anInt1442;
			if (i_726_ < 0)
				i_726_ = 0;
		}
		if (i_726_ < i_727_) {
			i += i_726_ - 1;
			i_725_ = i_727_ - i_726_ >> 2;
			f += f_728_ * (float) i_726_;
			if (aClass101_1457.aBool1227) {
				if (anInt1441 == 0) {
					while (--i_725_ >= 0) {
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_724_;
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_724_;
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_724_;
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_724_;
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
					}
					i_725_ = i_727_ - i_726_ & 0x3;
					while (--i_725_ >= 0) {
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_724_;
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
					}
				} else if (anInt1441 == 254) {
					if (i_726_ != 0 && i_727_ <= anInt1442 - 1) {
						while (--i_725_ >= 0) {
							i++;
							if ((!bool_722_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_728_;
							i++;
							if ((!bool_722_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_728_;
							i++;
							if ((!bool_722_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_728_;
							i++;
							if ((!bool_722_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_728_;
						}
						i_725_ = i_727_ - i_726_ & 0x3;
						while (--i_725_ >= 0) {
							i++;
							if ((!bool_722_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_728_;
						}
					}
				} else {
					int i_729_ = anInt1441;
					int i_730_ = 256 - anInt1441;
					i_724_ = (((i_724_ & 0xff00ff) * i_730_ >> 8 & 0xff00ff) + ((i_724_ & 0xff00) * i_730_ >> 8 & 0xff00));
					while (--i_725_ >= 0) {
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_731_ = is[i];
								if (bool_723_)
									is[i] = ((i_730_ | i_731_ >> 24) << 24 | (i_724_ + (((i_731_ & 0xff00ff) * i_729_ >> 8) & 0xff00ff) + (((i_731_ & 0xff00) * i_729_ >> 8) & 0xff00)));
								else
									is[i] = (i_724_ + ((i_731_ & 0xff00ff) * i_729_ >> 8 & 0xff00ff) + ((i_731_ & 0xff00) * i_729_ >> 8 & 0xff00));
							}
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_732_ = is[i];
								if (bool_723_)
									is[i] = ((i_730_ | i_732_ >> 24) << 24 | (i_724_ + (((i_732_ & 0xff00ff) * i_729_ >> 8) & 0xff00ff) + (((i_732_ & 0xff00) * i_729_ >> 8) & 0xff00)));
								else
									is[i] = (i_724_ + ((i_732_ & 0xff00ff) * i_729_ >> 8 & 0xff00ff) + ((i_732_ & 0xff00) * i_729_ >> 8 & 0xff00));
							}
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_733_ = is[i];
								if (bool_723_)
									is[i] = ((i_730_ | i_733_ >> 24) << 24 | (i_724_ + (((i_733_ & 0xff00ff) * i_729_ >> 8) & 0xff00ff) + (((i_733_ & 0xff00) * i_729_ >> 8) & 0xff00)));
								else
									is[i] = (i_724_ + ((i_733_ & 0xff00ff) * i_729_ >> 8 & 0xff00ff) + ((i_733_ & 0xff00) * i_729_ >> 8 & 0xff00));
							}
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_734_ = is[i];
								if (bool_723_)
									is[i] = ((i_730_ | i_734_ >> 24) << 24 | (i_724_ + (((i_734_ & 0xff00ff) * i_729_ >> 8) & 0xff00ff) + (((i_734_ & 0xff00) * i_729_ >> 8) & 0xff00)));
								else
									is[i] = (i_724_ + ((i_734_ & 0xff00ff) * i_729_ >> 8 & 0xff00ff) + ((i_734_ & 0xff00) * i_729_ >> 8 & 0xff00));
							}
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
					}
					i_725_ = i_727_ - i_726_ & 0x3;
					while (--i_725_ >= 0) {
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_735_ = is[i];
								if (bool_723_)
									is[i] = ((i_730_ | i_735_ >> 24) << 24 | (i_724_ + (((i_735_ & 0xff00ff) * i_729_ >> 8) & 0xff00ff) + (((i_735_ & 0xff00) * i_729_ >> 8) & 0xff00)));
								else
									is[i] = (i_724_ + ((i_735_ & 0xff00ff) * i_729_ >> 8 & 0xff00ff) + ((i_735_ & 0xff00) * i_729_ >> 8 & 0xff00));
							}
							if (bool_722_)
								aFloatArray1460[i] = f;
						}
						f += f_728_;
					}
				}
			} else if (bool) {
				if (anInt1441 == 0) {
					while (--i_725_ >= 0) {
						i++;
						if (!bool_722_ || f < aFloatArray1460[i])
							is[i] = i_724_;
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i])
							is[i] = i_724_;
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i])
							is[i] = i_724_;
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i])
							is[i] = i_724_;
						f += f_728_;
					}
					i_725_ = i_727_ - i_726_ & 0x3;
					while (--i_725_ >= 0) {
						i++;
						if (!bool_722_ || f < aFloatArray1460[i])
							is[i] = i_724_;
						f += f_728_;
					}
				} else if (anInt1441 == 254) {
					if (i_726_ != 0 && i_727_ <= anInt1442 - 1) {
						while (--i_725_ >= 0) {
							i++;
							if (!bool_722_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_728_;
							i++;
							if (!bool_722_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_728_;
							i++;
							if (!bool_722_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_728_;
							i++;
							if (!bool_722_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_728_;
						}
						i_725_ = i_727_ - i_726_ & 0x3;
						while (--i_725_ >= 0) {
							i++;
							if (!bool_722_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_728_;
						}
					}
				} else {
					int i_736_ = anInt1441;
					int i_737_ = 256 - anInt1441;
					i_724_ = (((i_724_ & 0xff00ff) * i_737_ >> 8 & 0xff00ff) + ((i_724_ & 0xff00) * i_737_ >> 8 & 0xff00));
					while (--i_725_ >= 0) {
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							int i_738_ = is[i];
							if (bool_723_)
								is[i] = ((i_737_ | i_738_ >> 24) << 24 | (i_724_ + ((i_738_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_738_ & 0xff00) * i_736_ >> 8 & 0xff00)));
							else
								is[i] = (i_724_ + ((i_738_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_738_ & 0xff00) * i_736_ >> 8 & 0xff00));
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							int i_739_ = is[i];
							if (bool_723_)
								is[i] = ((i_737_ | i_739_ >> 24) << 24 | (i_724_ + ((i_739_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_739_ & 0xff00) * i_736_ >> 8 & 0xff00)));
							else
								is[i] = (i_724_ + ((i_739_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_739_ & 0xff00) * i_736_ >> 8 & 0xff00));
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							int i_740_ = is[i];
							if (bool_723_)
								is[i] = ((i_737_ | i_740_ >> 24) << 24 | (i_724_ + ((i_740_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_740_ & 0xff00) * i_736_ >> 8 & 0xff00)));
							else
								is[i] = (i_724_ + ((i_740_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_740_ & 0xff00) * i_736_ >> 8 & 0xff00));
						}
						f += f_728_;
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							int i_741_ = is[i];
							if (bool_723_)
								is[i] = ((i_737_ | i_741_ >> 24) << 24 | (i_724_ + ((i_741_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_741_ & 0xff00) * i_736_ >> 8 & 0xff00)));
							else
								is[i] = (i_724_ + ((i_741_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_741_ & 0xff00) * i_736_ >> 8 & 0xff00));
						}
						f += f_728_;
					}
					i_725_ = i_727_ - i_726_ & 0x3;
					while (--i_725_ >= 0) {
						i++;
						if (!bool_722_ || f < aFloatArray1460[i]) {
							int i_742_ = is[i];
							if (bool_723_)
								is[i] = ((i_737_ | i_742_ >> 24) << 24 | (i_724_ + ((i_742_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_742_ & 0xff00) * i_736_ >> 8 & 0xff00)));
							else
								is[i] = (i_724_ + ((i_742_ & 0xff00ff) * i_736_ >> 8 & 0xff00ff) + ((i_742_ & 0xff00) * i_736_ >> 8 & 0xff00));
						}
						f += f_728_;
					}
				}
			}
		}
	}

	final void method2093(boolean bool) {
		aBool1449 = bool;
	}

	final void method2094(boolean bool, boolean bool_743_, boolean bool_744_, float f, float f_745_, float f_746_, float f_747_, float f_748_, float f_749_, float f_750_, float f_751_, float f_752_, float f_753_, float f_754_, float f_755_) {
		if (!bool)
			method2077(false, bool_743_, bool_744_, f, f_745_, f_746_, f_747_, f_748_, f_749_, f_750_, f_751_, f_752_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_747_, (int) f, (int) f_748_, (int) f_745_, (Class656.anIntArray8393[(int) f_753_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_748_, (int) f_745_, (int) f_749_, (int) f_746_, (Class656.anIntArray8393[(int) f_753_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_749_, (int) f_746_, (int) f_747_, (int) f, (Class656.anIntArray8393[(int) f_753_ & 0xffff]), (byte) 1);
		} else {
			float f_756_ = f_748_ - f_747_;
			float f_757_ = f_745_ - f;
			float f_758_ = f_749_ - f_747_;
			float f_759_ = f_746_ - f;
			float f_760_ = f_754_ - f_753_;
			float f_761_ = f_755_ - f_753_;
			float f_762_ = f_751_ - f_750_;
			float f_763_ = f_752_ - f_750_;
			float f_764_;
			if (f_746_ != f_745_)
				f_764_ = (f_749_ - f_748_) / (f_746_ - f_745_);
			else
				f_764_ = 0.0F;
			float f_765_;
			if (f_745_ != f)
				f_765_ = f_756_ / f_757_;
			else
				f_765_ = 0.0F;
			float f_766_;
			if (f_746_ != f)
				f_766_ = f_758_ / f_759_;
			else
				f_766_ = 0.0F;
			float f_767_ = f_756_ * f_759_ - f_758_ * f_757_;
			if (f_767_ != 0.0F) {
				float f_768_ = (f_760_ * f_759_ - f_761_ * f_757_) / f_767_;
				float f_769_ = (f_761_ * f_756_ - f_760_ * f_758_) / f_767_;
				float f_770_ = (f_762_ * f_759_ - f_763_ * f_757_) / f_767_;
				float f_771_ = (f_763_ * f_756_ - f_762_ * f_758_) / f_767_;
				if (f <= f_745_ && f <= f_746_) {
					if (!(f >= (float) anInt1450)) {
						if (f_745_ > (float) anInt1450)
							f_745_ = (float) anInt1450;
						if (f_746_ > (float) anInt1450)
							f_746_ = (float) anInt1450;
						f_753_ = f_753_ - f_768_ * f_747_ + f_768_;
						f_750_ = f_750_ - f_770_ * f_747_ + f_770_;
						if (f_745_ < f_746_) {
							f_749_ = f_747_;
							if (f < 0.0F) {
								f_749_ -= f_766_ * f;
								f_747_ -= f_765_ * f;
								f_753_ -= f_769_ * f;
								f_750_ -= f_771_ * f;
								f = 0.0F;
							}
							if (f_745_ < 0.0F) {
								f_748_ -= f_764_ * f_745_;
								f_745_ = 0.0F;
							}
							if (f != f_745_ && f_766_ < f_765_ || f == f_745_ && f_766_ > f_764_) {
								f += 0.5F;
								f_745_ += 0.5F;
								f_746_ = (float) (int) (f_746_ + 0.5F) - f_745_;
								f_745_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_745_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f, 0, 0, (int) f_749_, (int) f_747_, f_753_, f_768_, f_750_, f_770_);
									f_749_ += f_766_;
									f_747_ += f_765_;
									f_753_ += f_769_;
									f_750_ += f_771_;
									f += (float) anInt1458;
								}
								while (--f_746_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f, 0, 0, (int) f_749_, (int) f_748_, f_753_, f_768_, f_750_, f_770_);
									f_749_ += f_766_;
									f_748_ += f_764_;
									f_753_ += f_769_;
									f_750_ += f_771_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_745_ += 0.5F;
								f_746_ = (float) (int) (f_746_ + 0.5F) - f_745_;
								f_745_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_745_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f, 0, 0, (int) f_747_, (int) f_749_, f_753_, f_768_, f_750_, f_770_);
									f_749_ += f_766_;
									f_747_ += f_765_;
									f_753_ += f_769_;
									f_750_ += f_771_;
									f += (float) anInt1458;
								}
								while (--f_746_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f, 0, 0, (int) f_748_, (int) f_749_, f_753_, f_768_, f_750_, f_770_);
									f_749_ += f_766_;
									f_748_ += f_764_;
									f_753_ += f_769_;
									f_750_ += f_771_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_748_ = f_747_;
							if (f < 0.0F) {
								f_748_ -= f_766_ * f;
								f_747_ -= f_765_ * f;
								f_753_ -= f_769_ * f;
								f_750_ -= f_771_ * f;
								f = 0.0F;
							}
							if (f_746_ < 0.0F) {
								f_749_ -= f_764_ * f_746_;
								f_746_ = 0.0F;
							}
							if (f != f_746_ && f_766_ < f_765_ || f == f_746_ && f_764_ > f_765_) {
								f += 0.5F;
								f_746_ += 0.5F;
								f_745_ = (float) (int) (f_745_ + 0.5F) - f_746_;
								f_746_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_746_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f, 0, 0, (int) f_748_, (int) f_747_, f_753_, f_768_, f_750_, f_770_);
									f_748_ += f_766_;
									f_747_ += f_765_;
									f_753_ += f_769_;
									f_750_ += f_771_;
									f += (float) anInt1458;
								}
								while (--f_745_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f, 0, 0, (int) f_749_, (int) f_747_, f_753_, f_768_, f_750_, f_770_);
									f_749_ += f_764_;
									f_747_ += f_765_;
									f_753_ += f_769_;
									f_750_ += f_771_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_746_ += 0.5F;
								f_745_ = (float) (int) (f_745_ + 0.5F) - f_746_;
								f_746_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_746_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f, 0, 0, (int) f_747_, (int) f_748_, f_753_, f_768_, f_750_, f_770_);
									f_748_ += f_766_;
									f_747_ += f_765_;
									f_753_ += f_769_;
									f_750_ += f_771_;
									f += (float) anInt1458;
								}
								while (--f_745_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f, 0, 0, (int) f_747_, (int) f_749_, f_753_, f_768_, f_750_, f_770_);
									f_749_ += f_764_;
									f_747_ += f_765_;
									f_753_ += f_769_;
									f_750_ += f_771_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_745_ <= f_746_) {
					if (!(f_745_ >= (float) anInt1450)) {
						if (f_746_ > (float) anInt1450)
							f_746_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_754_ = f_754_ - f_768_ * f_748_ + f_768_;
						f_751_ = f_751_ - f_770_ * f_748_ + f_770_;
						if (f_746_ < f) {
							f_747_ = f_748_;
							if (f_745_ < 0.0F) {
								f_747_ -= f_765_ * f_745_;
								f_748_ -= f_764_ * f_745_;
								f_754_ -= f_769_ * f_745_;
								f_751_ -= f_771_ * f_745_;
								f_745_ = 0.0F;
							}
							if (f_746_ < 0.0F) {
								f_749_ -= f_766_ * f_746_;
								f_746_ = 0.0F;
							}
							if (f_745_ != f_746_ && f_765_ < f_764_ || f_745_ == f_746_ && f_765_ > f_766_) {
								f_745_ += 0.5F;
								f_746_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_746_;
								f_746_ -= f_745_;
								f_745_ = (float) anIntArray1447[(int) f_745_];
								while (--f_746_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f_745_, 0, 0, (int) f_747_, (int) f_748_, f_754_, f_768_, f_751_, f_770_);
									f_747_ += f_765_;
									f_748_ += f_764_;
									f_754_ += f_769_;
									f_751_ += f_771_;
									f_745_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f_745_, 0, 0, (int) f_747_, (int) f_749_, f_754_, f_768_, f_751_, f_770_);
									f_747_ += f_765_;
									f_749_ += f_766_;
									f_754_ += f_769_;
									f_751_ += f_771_;
									f_745_ += (float) anInt1458;
								}
							} else {
								f_745_ += 0.5F;
								f_746_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_746_;
								f_746_ -= f_745_;
								f_745_ = (float) anIntArray1447[(int) f_745_];
								while (--f_746_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f_745_, 0, 0, (int) f_748_, (int) f_747_, f_754_, f_768_, f_751_, f_770_);
									f_747_ += f_765_;
									f_748_ += f_764_;
									f_754_ += f_769_;
									f_751_ += f_771_;
									f_745_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f_745_, 0, 0, (int) f_749_, (int) f_747_, f_754_, f_768_, f_751_, f_770_);
									f_747_ += f_765_;
									f_749_ += f_766_;
									f_754_ += f_769_;
									f_751_ += f_771_;
									f_745_ += (float) anInt1458;
								}
							}
						} else {
							f_749_ = f_748_;
							if (f_745_ < 0.0F) {
								f_749_ -= f_765_ * f_745_;
								f_748_ -= f_764_ * f_745_;
								f_754_ -= f_769_ * f_745_;
								f_751_ -= f_771_ * f_745_;
								f_745_ = 0.0F;
							}
							if (f < 0.0F) {
								f_747_ -= f_766_ * f;
								f = 0.0F;
							}
							if (f_765_ < f_764_) {
								f_745_ += 0.5F;
								f += 0.5F;
								f_746_ = (float) (int) (f_746_ + 0.5F) - f;
								f -= f_745_;
								f_745_ = (float) anIntArray1447[(int) f_745_];
								while (--f >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f_745_, 0, 0, (int) f_749_, (int) f_748_, f_754_, f_768_, f_751_, f_770_);
									f_749_ += f_765_;
									f_748_ += f_764_;
									f_754_ += f_769_;
									f_751_ += f_771_;
									f_745_ += (float) anInt1458;
								}
								while (--f_746_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f_745_, 0, 0, (int) f_747_, (int) f_748_, f_754_, f_768_, f_751_, f_770_);
									f_747_ += f_766_;
									f_748_ += f_764_;
									f_754_ += f_769_;
									f_751_ += f_771_;
									f_745_ += (float) anInt1458;
								}
							} else {
								f_745_ += 0.5F;
								f += 0.5F;
								f_746_ = (float) (int) (f_746_ + 0.5F) - f;
								f -= f_745_;
								f_745_ = (float) anIntArray1447[(int) f_745_];
								while (--f >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f_745_, 0, 0, (int) f_748_, (int) f_749_, f_754_, f_768_, f_751_, f_770_);
									f_749_ += f_765_;
									f_748_ += f_764_;
									f_754_ += f_769_;
									f_751_ += f_771_;
									f_745_ += (float) anInt1458;
								}
								while (--f_746_ >= 0.0F) {
									method2098(bool_743_, bool_744_, anIntArray1459, (int) f_745_, 0, 0, (int) f_748_, (int) f_747_, f_754_, f_768_, f_751_, f_770_);
									f_747_ += f_766_;
									f_748_ += f_764_;
									f_754_ += f_769_;
									f_751_ += f_771_;
									f_745_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_746_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_745_ > (float) anInt1450)
						f_745_ = (float) anInt1450;
					f_755_ = f_755_ - f_768_ * f_749_ + f_768_;
					f_752_ = f_752_ - f_770_ * f_749_ + f_770_;
					if (f < f_745_) {
						f_748_ = f_749_;
						if (f_746_ < 0.0F) {
							f_748_ -= f_764_ * f_746_;
							f_749_ -= f_766_ * f_746_;
							f_755_ -= f_769_ * f_746_;
							f_752_ -= f_771_ * f_746_;
							f_746_ = 0.0F;
						}
						if (f < 0.0F) {
							f_747_ -= f_765_ * f;
							f = 0.0F;
						}
						if (f_764_ < f_766_) {
							f_746_ += 0.5F;
							f += 0.5F;
							f_745_ = (float) (int) (f_745_ + 0.5F) - f;
							f -= f_746_;
							f_746_ = (float) anIntArray1447[(int) f_746_];
							while (--f >= 0.0F) {
								method2098(bool_743_, bool_744_, anIntArray1459, (int) f_746_, 0, 0, (int) f_748_, (int) f_749_, f_755_, f_768_, f_752_, f_770_);
								f_748_ += f_764_;
								f_749_ += f_766_;
								f_755_ += f_769_;
								f_752_ += f_771_;
								f_746_ += (float) anInt1458;
							}
							while (--f_745_ >= 0.0F) {
								method2098(bool_743_, bool_744_, anIntArray1459, (int) f_746_, 0, 0, (int) f_748_, (int) f_747_, f_755_, f_768_, f_752_, f_770_);
								f_748_ += f_764_;
								f_747_ += f_765_;
								f_755_ += f_769_;
								f_752_ += f_771_;
								f_746_ += (float) anInt1458;
							}
						} else {
							f_746_ += 0.5F;
							f += 0.5F;
							f_745_ = (float) (int) (f_745_ + 0.5F) - f;
							f -= f_746_;
							f_746_ = (float) anIntArray1447[(int) f_746_];
							while (--f >= 0.0F) {
								method2098(bool_743_, bool_744_, anIntArray1459, (int) f_746_, 0, 0, (int) f_749_, (int) f_748_, f_755_, f_768_, f_752_, f_770_);
								f_748_ += f_764_;
								f_749_ += f_766_;
								f_755_ += f_769_;
								f_752_ += f_771_;
								f_746_ += (float) anInt1458;
							}
							while (--f_745_ >= 0.0F) {
								method2098(bool_743_, bool_744_, anIntArray1459, (int) f_746_, 0, 0, (int) f_747_, (int) f_748_, f_755_, f_768_, f_752_, f_770_);
								f_748_ += f_764_;
								f_747_ += f_765_;
								f_755_ += f_769_;
								f_752_ += f_771_;
								f_746_ += (float) anInt1458;
							}
						}
					} else {
						f_747_ = f_749_;
						if (f_746_ < 0.0F) {
							f_747_ -= f_764_ * f_746_;
							f_749_ -= f_766_ * f_746_;
							f_755_ -= f_769_ * f_746_;
							f_752_ -= f_771_ * f_746_;
							f_746_ = 0.0F;
						}
						if (f_745_ < 0.0F) {
							f_748_ -= f_765_ * f_745_;
							f_745_ = 0.0F;
						}
						if (f_764_ < f_766_) {
							f_746_ += 0.5F;
							f_745_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_745_;
							f_745_ -= f_746_;
							f_746_ = (float) anIntArray1447[(int) f_746_];
							while (--f_745_ >= 0.0F) {
								method2098(bool_743_, bool_744_, anIntArray1459, (int) f_746_, 0, 0, (int) f_747_, (int) f_749_, f_755_, f_768_, f_752_, f_770_);
								f_747_ += f_764_;
								f_749_ += f_766_;
								f_755_ += f_769_;
								f_752_ += f_771_;
								f_746_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_743_, bool_744_, anIntArray1459, (int) f_746_, 0, 0, (int) f_748_, (int) f_749_, f_755_, f_768_, f_752_, f_770_);
								f_748_ += f_765_;
								f_749_ += f_766_;
								f_755_ += f_769_;
								f_752_ += f_771_;
								f_746_ += (float) anInt1458;
							}
						} else {
							f_746_ += 0.5F;
							f_745_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_745_;
							f_745_ -= f_746_;
							f_746_ = (float) anIntArray1447[(int) f_746_];
							while (--f_745_ >= 0.0F) {
								method2098(bool_743_, bool_744_, anIntArray1459, (int) f_746_, 0, 0, (int) f_749_, (int) f_747_, f_755_, f_768_, f_752_, f_770_);
								f_747_ += f_764_;
								f_749_ += f_766_;
								f_755_ += f_769_;
								f_752_ += f_771_;
								f_746_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_743_, bool_744_, anIntArray1459, (int) f_746_, 0, 0, (int) f_749_, (int) f_748_, f_755_, f_768_, f_752_, f_770_);
								f_748_ += f_765_;
								f_749_ += f_766_;
								f_755_ += f_769_;
								f_752_ += f_771_;
								f_746_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2095(boolean bool, boolean bool_772_, int[] is, int i, int i_773_, int i_774_, int i_775_, int i_776_, float f, float f_777_, float f_778_, float f_779_) {
		if (aBool1445) {
			if (i_776_ > anInt1442)
				i_776_ = anInt1442;
			if (i_775_ < 0)
				i_775_ = 0;
		}
		if (i_775_ < i_776_) {
			i += i_775_ - 1;
			f += f_777_ * (float) i_775_;
			f_778_ += f_779_ * (float) i_775_;
			if (aClass101_1457.aBool1227) {
				if (aBool1467) {
					i_774_ = i_776_ - i_775_ >> 2;
					f_777_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_774_ > 0) {
							do {
								i_773_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								f += f_777_;
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									is[i] = i_773_;
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									is[i] = i_773_;
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									is[i] = i_773_;
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									is[i] = i_773_;
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
							} while (--i_774_ > 0);
						}
						i_774_ = i_776_ - i_775_ & 0x3;
						if (i_774_ > 0) {
							i_773_ = Class656.anIntArray8393[(int) f & 0xffff];
							do {
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									is[i] = i_773_;
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
							} while (--i_774_ > 0);
						}
					} else {
						int i_780_ = anInt1441;
						int i_781_ = 256 - anInt1441;
						if (i_774_ > 0) {
							do {
								i_773_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								f += f_777_;
								i_773_ = (((i_773_ & 0xff00ff) * i_781_ >> 8 & 0xff00ff) + ((i_773_ & 0xff00) * i_781_ >> 8 & 0xff00));
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									int i_782_ = is[i];
									if (bool_772_)
										is[i] = ((i_781_ | i_782_ >> 24) << 24 | (i_773_ + (((i_782_ & 0xff00ff) * i_780_) >> 8 & 0xff00ff) + (((i_782_ & 0xff00) * i_780_) >> 8 & 0xff00)));
									else
										is[i] = (i_773_ + (((i_782_ & 0xff00ff) * i_780_ >> 8) & 0xff00ff) + (((i_782_ & 0xff00) * i_780_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									int i_783_ = is[i];
									if (bool_772_)
										is[i] = ((i_781_ | i_783_ >> 24) << 24 | (i_773_ + (((i_783_ & 0xff00ff) * i_780_) >> 8 & 0xff00ff) + (((i_783_ & 0xff00) * i_780_) >> 8 & 0xff00)));
									else
										is[i] = (i_773_ + (((i_783_ & 0xff00ff) * i_780_ >> 8) & 0xff00ff) + (((i_783_ & 0xff00) * i_780_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									int i_784_ = is[i];
									if (bool_772_)
										is[i] = ((i_781_ | i_784_ >> 24) << 24 | (i_773_ + (((i_784_ & 0xff00ff) * i_780_) >> 8 & 0xff00ff) + (((i_784_ & 0xff00) * i_780_) >> 8 & 0xff00)));
									else
										is[i] = (i_773_ + (((i_784_ & 0xff00ff) * i_780_ >> 8) & 0xff00ff) + (((i_784_ & 0xff00) * i_780_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									int i_785_ = is[i];
									if (bool_772_)
										is[i] = ((i_781_ | i_785_ >> 24) << 24 | (i_773_ + (((i_785_ & 0xff00ff) * i_780_) >> 8 & 0xff00ff) + (((i_785_ & 0xff00) * i_780_) >> 8 & 0xff00)));
									else
										is[i] = (i_773_ + (((i_785_ & 0xff00ff) * i_780_ >> 8) & 0xff00ff) + (((i_785_ & 0xff00) * i_780_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
							} while (--i_774_ > 0);
						}
						i_774_ = i_776_ - i_775_ & 0x3;
						if (i_774_ > 0) {
							i_773_ = Class656.anIntArray8393[(int) f & 0xffff];
							i_773_ = (((i_773_ & 0xff00ff) * i_781_ >> 8 & 0xff00ff) + ((i_773_ & 0xff00) * i_781_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f_778_ < aFloatArray1460[i]) {
									int i_786_ = is[i];
									if (bool_772_)
										is[i] = ((i_781_ | i_786_ >> 24) << 24 | (i_773_ + (((i_786_ & 0xff00ff) * i_780_) >> 8 & 0xff00ff) + (((i_786_ & 0xff00) * i_780_) >> 8 & 0xff00)));
									else
										is[i] = (i_773_ + (((i_786_ & 0xff00ff) * i_780_ >> 8) & 0xff00ff) + (((i_786_ & 0xff00) * i_780_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_778_;
								}
								f_778_ += f_779_;
							} while (--i_774_ > 0);
						}
					}
				} else {
					i_774_ = i_776_ - i_775_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f_778_ < aFloatArray1460[i]) {
								is[i] = (Class656.anIntArray8393[(int) f & 0xffff]);
								if (bool)
									aFloatArray1460[i] = f_778_;
							}
							f_778_ += f_779_;
							f += f_777_;
						} while (--i_774_ > 0);
					} else {
						int i_787_ = anInt1441;
						int i_788_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f_778_ < aFloatArray1460[i]) {
								i_773_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								i_773_ = (((i_773_ & 0xff00ff) * i_788_ >> 8 & 0xff00ff) + ((i_773_ & 0xff00) * i_788_ >> 8 & 0xff00));
								int i_789_ = is[i];
								if (bool_772_)
									is[i] = ((i_788_ | i_789_ >> 24) << 24 | (i_773_ + (((i_789_ & 0xff00ff) * i_787_ >> 8) & 0xff00ff) + (((i_789_ & 0xff00) * i_787_ >> 8) & 0xff00)));
								else
									is[i] = (i_773_ + ((i_789_ & 0xff00ff) * i_787_ >> 8 & 0xff00ff) + ((i_789_ & 0xff00) * i_787_ >> 8 & 0xff00));
								if (bool)
									aFloatArray1460[i] = f_778_;
							}
							f += f_777_;
							f_778_ += f_779_;
						} while (--i_774_ > 0);
					}
				}
			} else if (aBool1467) {
				i_774_ = i_776_ - i_775_ >> 2;
				f_777_ *= 4.0F;
				if (anInt1441 == 0) {
					if (i_774_ > 0) {
						do {
							i_773_ = Class656.anIntArray8393[(int) f & 0xffff];
							f += f_777_;
							i++;
							if (!bool || f_778_ < aFloatArray1460[i])
								is[i] = i_773_;
							f_778_ += f_779_;
							i++;
							if (!bool || f_778_ < aFloatArray1460[i])
								is[i] = i_773_;
							f_778_ += f_779_;
							i++;
							if (!bool || f_778_ < aFloatArray1460[i])
								is[i] = i_773_;
							f_778_ += f_779_;
							i++;
							if (!bool || f_778_ < aFloatArray1460[i])
								is[i] = i_773_;
							f_778_ += f_779_;
						} while (--i_774_ > 0);
					}
					i_774_ = i_776_ - i_775_ & 0x3;
					if (i_774_ > 0) {
						i_773_ = Class656.anIntArray8393[(int) f & 0xffff];
						do {
							i++;
							if (!bool || f_778_ < aFloatArray1460[i])
								is[i] = i_773_;
							f_778_ += f_779_;
						} while (--i_774_ > 0);
					}
				} else {
					int i_790_ = anInt1441;
					int i_791_ = 256 - anInt1441;
					if (i_774_ > 0) {
						do {
							i_773_ = Class656.anIntArray8393[(int) f & 0xffff];
							f += f_777_;
							i_773_ = (((i_773_ & 0xff00ff) * i_791_ >> 8 & 0xff00ff) + ((i_773_ & 0xff00) * i_791_ >> 8 & 0xff00));
							i++;
							if (!bool || f_778_ < aFloatArray1460[i]) {
								int i_792_ = is[i];
								if (bool_772_)
									is[i] = ((i_791_ | i_792_ >> 24) << 24 | (i_773_ + (((i_792_ & 0xff00ff) * i_790_ >> 8) & 0xff00ff) + (((i_792_ & 0xff00) * i_790_ >> 8) & 0xff00)));
								else
									is[i] = (i_773_ + ((i_792_ & 0xff00ff) * i_790_ >> 8 & 0xff00ff) + ((i_792_ & 0xff00) * i_790_ >> 8 & 0xff00));
							}
							f_778_ += f_779_;
							i++;
							if (!bool || f_778_ < aFloatArray1460[i]) {
								int i_793_ = is[i];
								if (bool_772_)
									is[i] = ((i_791_ | i_793_ >> 24) << 24 | (i_773_ + (((i_793_ & 0xff00ff) * i_790_ >> 8) & 0xff00ff) + (((i_793_ & 0xff00) * i_790_ >> 8) & 0xff00)));
								else
									is[i] = (i_773_ + ((i_793_ & 0xff00ff) * i_790_ >> 8 & 0xff00ff) + ((i_793_ & 0xff00) * i_790_ >> 8 & 0xff00));
							}
							f_778_ += f_779_;
							i++;
							if (!bool || f_778_ < aFloatArray1460[i]) {
								int i_794_ = is[i];
								if (bool_772_)
									is[i] = ((i_791_ | i_794_ >> 24) << 24 | (i_773_ + (((i_794_ & 0xff00ff) * i_790_ >> 8) & 0xff00ff) + (((i_794_ & 0xff00) * i_790_ >> 8) & 0xff00)));
								else
									is[i] = (i_773_ + ((i_794_ & 0xff00ff) * i_790_ >> 8 & 0xff00ff) + ((i_794_ & 0xff00) * i_790_ >> 8 & 0xff00));
							}
							f_778_ += f_779_;
							i++;
							if (!bool || f_778_ < aFloatArray1460[i]) {
								int i_795_ = is[i];
								if (bool_772_)
									is[i] = ((i_791_ | i_795_ >> 24) << 24 | (i_773_ + (((i_795_ & 0xff00ff) * i_790_ >> 8) & 0xff00ff) + (((i_795_ & 0xff00) * i_790_ >> 8) & 0xff00)));
								else
									is[i] = (i_773_ + ((i_795_ & 0xff00ff) * i_790_ >> 8 & 0xff00ff) + ((i_795_ & 0xff00) * i_790_ >> 8 & 0xff00));
							}
							f_778_ += f_779_;
						} while (--i_774_ > 0);
					}
					i_774_ = i_776_ - i_775_ & 0x3;
					if (i_774_ > 0) {
						i_773_ = Class656.anIntArray8393[(int) f & 0xffff];
						i_773_ = (((i_773_ & 0xff00ff) * i_791_ >> 8 & 0xff00ff) + ((i_773_ & 0xff00) * i_791_ >> 8 & 0xff00));
						do {
							i++;
							if (!bool || f_778_ < aFloatArray1460[i]) {
								int i_796_ = is[i];
								if (bool_772_)
									is[i] = ((i_791_ | i_796_ >> 24) << 24 | (i_773_ + (((i_796_ & 0xff00ff) * i_790_ >> 8) & 0xff00ff) + (((i_796_ & 0xff00) * i_790_ >> 8) & 0xff00)));
								else
									is[i] = (i_773_ + ((i_796_ & 0xff00ff) * i_790_ >> 8 & 0xff00ff) + ((i_796_ & 0xff00) * i_790_ >> 8 & 0xff00));
							}
							f_778_ += f_779_;
						} while (--i_774_ > 0);
					}
				}
			} else {
				i_774_ = i_776_ - i_775_;
				if (anInt1441 == 0) {
					do {
						i++;
						if (!bool || f_778_ < aFloatArray1460[i])
							is[i] = Class656.anIntArray8393[(int) f & 0xffff];
						f_778_ += f_779_;
						f += f_777_;
					} while (--i_774_ > 0);
				} else {
					int i_797_ = anInt1441;
					int i_798_ = 256 - anInt1441;
					do {
						i++;
						if (!bool || f_778_ < aFloatArray1460[i]) {
							i_773_ = Class656.anIntArray8393[(int) f & 0xffff];
							i_773_ = (((i_773_ & 0xff00ff) * i_798_ >> 8 & 0xff00ff) + ((i_773_ & 0xff00) * i_798_ >> 8 & 0xff00));
							int i_799_ = is[i];
							if (bool_772_)
								is[i] = ((i_798_ | i_799_ >> 24) << 24 | (i_773_ + ((i_799_ & 0xff00ff) * i_797_ >> 8 & 0xff00ff) + ((i_799_ & 0xff00) * i_797_ >> 8 & 0xff00)));
							else
								is[i] = (i_773_ + ((i_799_ & 0xff00ff) * i_797_ >> 8 & 0xff00ff) + ((i_799_ & 0xff00) * i_797_ >> 8 & 0xff00));
						}
						f += f_777_;
						f_778_ += f_779_;
					} while (--i_774_ > 0);
				}
			}
		}
	}

	final void method2096(boolean bool, boolean bool_800_, boolean bool_801_, float f, float f_802_, float f_803_, float f_804_, float f_805_, float f_806_, float f_807_, float f_808_, float f_809_, float f_810_, float f_811_, float f_812_) {
		if (!bool)
			method2077(false, bool_800_, bool_801_, f, f_802_, f_803_, f_804_, f_805_, f_806_, f_807_, f_808_, f_809_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_804_, (int) f, (int) f_805_, (int) f_802_, (Class656.anIntArray8393[(int) f_810_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_805_, (int) f_802_, (int) f_806_, (int) f_803_, (Class656.anIntArray8393[(int) f_810_ & 0xffff]), (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_806_, (int) f_803_, (int) f_804_, (int) f, (Class656.anIntArray8393[(int) f_810_ & 0xffff]), (byte) 1);
		} else {
			float f_813_ = f_805_ - f_804_;
			float f_814_ = f_802_ - f;
			float f_815_ = f_806_ - f_804_;
			float f_816_ = f_803_ - f;
			float f_817_ = f_811_ - f_810_;
			float f_818_ = f_812_ - f_810_;
			float f_819_ = f_808_ - f_807_;
			float f_820_ = f_809_ - f_807_;
			float f_821_;
			if (f_803_ != f_802_)
				f_821_ = (f_806_ - f_805_) / (f_803_ - f_802_);
			else
				f_821_ = 0.0F;
			float f_822_;
			if (f_802_ != f)
				f_822_ = f_813_ / f_814_;
			else
				f_822_ = 0.0F;
			float f_823_;
			if (f_803_ != f)
				f_823_ = f_815_ / f_816_;
			else
				f_823_ = 0.0F;
			float f_824_ = f_813_ * f_816_ - f_815_ * f_814_;
			if (f_824_ != 0.0F) {
				float f_825_ = (f_817_ * f_816_ - f_818_ * f_814_) / f_824_;
				float f_826_ = (f_818_ * f_813_ - f_817_ * f_815_) / f_824_;
				float f_827_ = (f_819_ * f_816_ - f_820_ * f_814_) / f_824_;
				float f_828_ = (f_820_ * f_813_ - f_819_ * f_815_) / f_824_;
				if (f <= f_802_ && f <= f_803_) {
					if (!(f >= (float) anInt1450)) {
						if (f_802_ > (float) anInt1450)
							f_802_ = (float) anInt1450;
						if (f_803_ > (float) anInt1450)
							f_803_ = (float) anInt1450;
						f_810_ = f_810_ - f_825_ * f_804_ + f_825_;
						f_807_ = f_807_ - f_827_ * f_804_ + f_827_;
						if (f_802_ < f_803_) {
							f_806_ = f_804_;
							if (f < 0.0F) {
								f_806_ -= f_823_ * f;
								f_804_ -= f_822_ * f;
								f_810_ -= f_826_ * f;
								f_807_ -= f_828_ * f;
								f = 0.0F;
							}
							if (f_802_ < 0.0F) {
								f_805_ -= f_821_ * f_802_;
								f_802_ = 0.0F;
							}
							if (f != f_802_ && f_823_ < f_822_ || f == f_802_ && f_823_ > f_821_) {
								f += 0.5F;
								f_802_ += 0.5F;
								f_803_ = (float) (int) (f_803_ + 0.5F) - f_802_;
								f_802_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_802_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f, 0, 0, (int) f_806_, (int) f_804_, f_810_, f_825_, f_807_, f_827_);
									f_806_ += f_823_;
									f_804_ += f_822_;
									f_810_ += f_826_;
									f_807_ += f_828_;
									f += (float) anInt1458;
								}
								while (--f_803_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f, 0, 0, (int) f_806_, (int) f_805_, f_810_, f_825_, f_807_, f_827_);
									f_806_ += f_823_;
									f_805_ += f_821_;
									f_810_ += f_826_;
									f_807_ += f_828_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_802_ += 0.5F;
								f_803_ = (float) (int) (f_803_ + 0.5F) - f_802_;
								f_802_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_802_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f, 0, 0, (int) f_804_, (int) f_806_, f_810_, f_825_, f_807_, f_827_);
									f_806_ += f_823_;
									f_804_ += f_822_;
									f_810_ += f_826_;
									f_807_ += f_828_;
									f += (float) anInt1458;
								}
								while (--f_803_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f, 0, 0, (int) f_805_, (int) f_806_, f_810_, f_825_, f_807_, f_827_);
									f_806_ += f_823_;
									f_805_ += f_821_;
									f_810_ += f_826_;
									f_807_ += f_828_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_805_ = f_804_;
							if (f < 0.0F) {
								f_805_ -= f_823_ * f;
								f_804_ -= f_822_ * f;
								f_810_ -= f_826_ * f;
								f_807_ -= f_828_ * f;
								f = 0.0F;
							}
							if (f_803_ < 0.0F) {
								f_806_ -= f_821_ * f_803_;
								f_803_ = 0.0F;
							}
							if (f != f_803_ && f_823_ < f_822_ || f == f_803_ && f_821_ > f_822_) {
								f += 0.5F;
								f_803_ += 0.5F;
								f_802_ = (float) (int) (f_802_ + 0.5F) - f_803_;
								f_803_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_803_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f, 0, 0, (int) f_805_, (int) f_804_, f_810_, f_825_, f_807_, f_827_);
									f_805_ += f_823_;
									f_804_ += f_822_;
									f_810_ += f_826_;
									f_807_ += f_828_;
									f += (float) anInt1458;
								}
								while (--f_802_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f, 0, 0, (int) f_806_, (int) f_804_, f_810_, f_825_, f_807_, f_827_);
									f_806_ += f_821_;
									f_804_ += f_822_;
									f_810_ += f_826_;
									f_807_ += f_828_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_803_ += 0.5F;
								f_802_ = (float) (int) (f_802_ + 0.5F) - f_803_;
								f_803_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_803_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f, 0, 0, (int) f_804_, (int) f_805_, f_810_, f_825_, f_807_, f_827_);
									f_805_ += f_823_;
									f_804_ += f_822_;
									f_810_ += f_826_;
									f_807_ += f_828_;
									f += (float) anInt1458;
								}
								while (--f_802_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f, 0, 0, (int) f_804_, (int) f_806_, f_810_, f_825_, f_807_, f_827_);
									f_806_ += f_821_;
									f_804_ += f_822_;
									f_810_ += f_826_;
									f_807_ += f_828_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_802_ <= f_803_) {
					if (!(f_802_ >= (float) anInt1450)) {
						if (f_803_ > (float) anInt1450)
							f_803_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_811_ = f_811_ - f_825_ * f_805_ + f_825_;
						f_808_ = f_808_ - f_827_ * f_805_ + f_827_;
						if (f_803_ < f) {
							f_804_ = f_805_;
							if (f_802_ < 0.0F) {
								f_804_ -= f_822_ * f_802_;
								f_805_ -= f_821_ * f_802_;
								f_811_ -= f_826_ * f_802_;
								f_808_ -= f_828_ * f_802_;
								f_802_ = 0.0F;
							}
							if (f_803_ < 0.0F) {
								f_806_ -= f_823_ * f_803_;
								f_803_ = 0.0F;
							}
							if (f_802_ != f_803_ && f_822_ < f_821_ || f_802_ == f_803_ && f_822_ > f_823_) {
								f_802_ += 0.5F;
								f_803_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_803_;
								f_803_ -= f_802_;
								f_802_ = (float) anIntArray1447[(int) f_802_];
								while (--f_803_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f_802_, 0, 0, (int) f_804_, (int) f_805_, f_811_, f_825_, f_808_, f_827_);
									f_804_ += f_822_;
									f_805_ += f_821_;
									f_811_ += f_826_;
									f_808_ += f_828_;
									f_802_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f_802_, 0, 0, (int) f_804_, (int) f_806_, f_811_, f_825_, f_808_, f_827_);
									f_804_ += f_822_;
									f_806_ += f_823_;
									f_811_ += f_826_;
									f_808_ += f_828_;
									f_802_ += (float) anInt1458;
								}
							} else {
								f_802_ += 0.5F;
								f_803_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_803_;
								f_803_ -= f_802_;
								f_802_ = (float) anIntArray1447[(int) f_802_];
								while (--f_803_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f_802_, 0, 0, (int) f_805_, (int) f_804_, f_811_, f_825_, f_808_, f_827_);
									f_804_ += f_822_;
									f_805_ += f_821_;
									f_811_ += f_826_;
									f_808_ += f_828_;
									f_802_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f_802_, 0, 0, (int) f_806_, (int) f_804_, f_811_, f_825_, f_808_, f_827_);
									f_804_ += f_822_;
									f_806_ += f_823_;
									f_811_ += f_826_;
									f_808_ += f_828_;
									f_802_ += (float) anInt1458;
								}
							}
						} else {
							f_806_ = f_805_;
							if (f_802_ < 0.0F) {
								f_806_ -= f_822_ * f_802_;
								f_805_ -= f_821_ * f_802_;
								f_811_ -= f_826_ * f_802_;
								f_808_ -= f_828_ * f_802_;
								f_802_ = 0.0F;
							}
							if (f < 0.0F) {
								f_804_ -= f_823_ * f;
								f = 0.0F;
							}
							if (f_822_ < f_821_) {
								f_802_ += 0.5F;
								f += 0.5F;
								f_803_ = (float) (int) (f_803_ + 0.5F) - f;
								f -= f_802_;
								f_802_ = (float) anIntArray1447[(int) f_802_];
								while (--f >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f_802_, 0, 0, (int) f_806_, (int) f_805_, f_811_, f_825_, f_808_, f_827_);
									f_806_ += f_822_;
									f_805_ += f_821_;
									f_811_ += f_826_;
									f_808_ += f_828_;
									f_802_ += (float) anInt1458;
								}
								while (--f_803_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f_802_, 0, 0, (int) f_804_, (int) f_805_, f_811_, f_825_, f_808_, f_827_);
									f_804_ += f_823_;
									f_805_ += f_821_;
									f_811_ += f_826_;
									f_808_ += f_828_;
									f_802_ += (float) anInt1458;
								}
							} else {
								f_802_ += 0.5F;
								f += 0.5F;
								f_803_ = (float) (int) (f_803_ + 0.5F) - f;
								f -= f_802_;
								f_802_ = (float) anIntArray1447[(int) f_802_];
								while (--f >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f_802_, 0, 0, (int) f_805_, (int) f_806_, f_811_, f_825_, f_808_, f_827_);
									f_806_ += f_822_;
									f_805_ += f_821_;
									f_811_ += f_826_;
									f_808_ += f_828_;
									f_802_ += (float) anInt1458;
								}
								while (--f_803_ >= 0.0F) {
									method2098(bool_800_, bool_801_, anIntArray1459, (int) f_802_, 0, 0, (int) f_805_, (int) f_804_, f_811_, f_825_, f_808_, f_827_);
									f_804_ += f_823_;
									f_805_ += f_821_;
									f_811_ += f_826_;
									f_808_ += f_828_;
									f_802_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_803_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_802_ > (float) anInt1450)
						f_802_ = (float) anInt1450;
					f_812_ = f_812_ - f_825_ * f_806_ + f_825_;
					f_809_ = f_809_ - f_827_ * f_806_ + f_827_;
					if (f < f_802_) {
						f_805_ = f_806_;
						if (f_803_ < 0.0F) {
							f_805_ -= f_821_ * f_803_;
							f_806_ -= f_823_ * f_803_;
							f_812_ -= f_826_ * f_803_;
							f_809_ -= f_828_ * f_803_;
							f_803_ = 0.0F;
						}
						if (f < 0.0F) {
							f_804_ -= f_822_ * f;
							f = 0.0F;
						}
						if (f_821_ < f_823_) {
							f_803_ += 0.5F;
							f += 0.5F;
							f_802_ = (float) (int) (f_802_ + 0.5F) - f;
							f -= f_803_;
							f_803_ = (float) anIntArray1447[(int) f_803_];
							while (--f >= 0.0F) {
								method2098(bool_800_, bool_801_, anIntArray1459, (int) f_803_, 0, 0, (int) f_805_, (int) f_806_, f_812_, f_825_, f_809_, f_827_);
								f_805_ += f_821_;
								f_806_ += f_823_;
								f_812_ += f_826_;
								f_809_ += f_828_;
								f_803_ += (float) anInt1458;
							}
							while (--f_802_ >= 0.0F) {
								method2098(bool_800_, bool_801_, anIntArray1459, (int) f_803_, 0, 0, (int) f_805_, (int) f_804_, f_812_, f_825_, f_809_, f_827_);
								f_805_ += f_821_;
								f_804_ += f_822_;
								f_812_ += f_826_;
								f_809_ += f_828_;
								f_803_ += (float) anInt1458;
							}
						} else {
							f_803_ += 0.5F;
							f += 0.5F;
							f_802_ = (float) (int) (f_802_ + 0.5F) - f;
							f -= f_803_;
							f_803_ = (float) anIntArray1447[(int) f_803_];
							while (--f >= 0.0F) {
								method2098(bool_800_, bool_801_, anIntArray1459, (int) f_803_, 0, 0, (int) f_806_, (int) f_805_, f_812_, f_825_, f_809_, f_827_);
								f_805_ += f_821_;
								f_806_ += f_823_;
								f_812_ += f_826_;
								f_809_ += f_828_;
								f_803_ += (float) anInt1458;
							}
							while (--f_802_ >= 0.0F) {
								method2098(bool_800_, bool_801_, anIntArray1459, (int) f_803_, 0, 0, (int) f_804_, (int) f_805_, f_812_, f_825_, f_809_, f_827_);
								f_805_ += f_821_;
								f_804_ += f_822_;
								f_812_ += f_826_;
								f_809_ += f_828_;
								f_803_ += (float) anInt1458;
							}
						}
					} else {
						f_804_ = f_806_;
						if (f_803_ < 0.0F) {
							f_804_ -= f_821_ * f_803_;
							f_806_ -= f_823_ * f_803_;
							f_812_ -= f_826_ * f_803_;
							f_809_ -= f_828_ * f_803_;
							f_803_ = 0.0F;
						}
						if (f_802_ < 0.0F) {
							f_805_ -= f_822_ * f_802_;
							f_802_ = 0.0F;
						}
						if (f_821_ < f_823_) {
							f_803_ += 0.5F;
							f_802_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_802_;
							f_802_ -= f_803_;
							f_803_ = (float) anIntArray1447[(int) f_803_];
							while (--f_802_ >= 0.0F) {
								method2098(bool_800_, bool_801_, anIntArray1459, (int) f_803_, 0, 0, (int) f_804_, (int) f_806_, f_812_, f_825_, f_809_, f_827_);
								f_804_ += f_821_;
								f_806_ += f_823_;
								f_812_ += f_826_;
								f_809_ += f_828_;
								f_803_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_800_, bool_801_, anIntArray1459, (int) f_803_, 0, 0, (int) f_805_, (int) f_806_, f_812_, f_825_, f_809_, f_827_);
								f_805_ += f_822_;
								f_806_ += f_823_;
								f_812_ += f_826_;
								f_809_ += f_828_;
								f_803_ += (float) anInt1458;
							}
						} else {
							f_803_ += 0.5F;
							f_802_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_802_;
							f_802_ -= f_803_;
							f_803_ = (float) anIntArray1447[(int) f_803_];
							while (--f_802_ >= 0.0F) {
								method2098(bool_800_, bool_801_, anIntArray1459, (int) f_803_, 0, 0, (int) f_806_, (int) f_804_, f_812_, f_825_, f_809_, f_827_);
								f_804_ += f_821_;
								f_806_ += f_823_;
								f_812_ += f_826_;
								f_809_ += f_828_;
								f_803_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2098(bool_800_, bool_801_, anIntArray1459, (int) f_803_, 0, 0, (int) f_806_, (int) f_805_, f_812_, f_825_, f_809_, f_827_);
								f_805_ += f_822_;
								f_806_ += f_823_;
								f_812_ += f_826_;
								f_809_ += f_828_;
								f_803_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2097(boolean bool, boolean bool_829_, boolean bool_830_, float f, float f_831_, float f_832_, float f_833_, float f_834_, float f_835_, float f_836_, float f_837_, float f_838_, int i, int i_839_, int i_840_) {
		if (!bool)
			method2077(false, bool_829_, bool_830_, f, f_831_, f_832_, f_833_, f_834_, f_835_, f_836_, f_837_, f_838_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_833_, (int) f, (int) f_834_, (int) f_831_, ~0xffffff | i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_834_, (int) f_831_, (int) f_835_, (int) f_832_, ~0xffffff | i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_835_, (int) f_832_, (int) f_833_, (int) f, ~0xffffff | i, (byte) 1);
		} else {
			float f_841_ = f_834_ - f_833_;
			float f_842_ = f_831_ - f;
			float f_843_ = f_835_ - f_833_;
			float f_844_ = f_832_ - f;
			float f_845_ = f_837_ - f_836_;
			float f_846_ = f_838_ - f_836_;
			float f_847_ = (float) ((i_839_ & 0xff0000) - (i & 0xff0000));
			float f_848_ = (float) ((i_840_ & 0xff0000) - (i & 0xff0000));
			float f_849_ = (float) ((i_839_ & 0xff00) - (i & 0xff00));
			float f_850_ = (float) ((i_840_ & 0xff00) - (i & 0xff00));
			float f_851_ = (float) ((i_839_ & 0xff) - (i & 0xff));
			float f_852_ = (float) ((i_840_ & 0xff) - (i & 0xff));
			float f_853_;
			if (f_832_ != f_831_)
				f_853_ = (f_835_ - f_834_) / (f_832_ - f_831_);
			else
				f_853_ = 0.0F;
			float f_854_;
			if (f_831_ != f)
				f_854_ = f_841_ / f_842_;
			else
				f_854_ = 0.0F;
			float f_855_;
			if (f_832_ != f)
				f_855_ = f_843_ / f_844_;
			else
				f_855_ = 0.0F;
			float f_856_ = f_841_ * f_844_ - f_843_ * f_842_;
			if (f_856_ != 0.0F) {
				float f_857_ = (f_845_ * f_844_ - f_846_ * f_842_) / f_856_;
				float f_858_ = (f_846_ * f_841_ - f_845_ * f_843_) / f_856_;
				float f_859_ = (f_847_ * f_844_ - f_848_ * f_842_) / f_856_;
				float f_860_ = (f_848_ * f_841_ - f_847_ * f_843_) / f_856_;
				float f_861_ = (f_849_ * f_844_ - f_850_ * f_842_) / f_856_;
				float f_862_ = (f_850_ * f_841_ - f_849_ * f_843_) / f_856_;
				float f_863_ = (f_851_ * f_844_ - f_852_ * f_842_) / f_856_;
				float f_864_ = (f_852_ * f_841_ - f_851_ * f_843_) / f_856_;
				if (f <= f_831_ && f <= f_832_) {
					if (!(f >= (float) anInt1450)) {
						if (f_831_ > (float) anInt1450)
							f_831_ = (float) anInt1450;
						if (f_832_ > (float) anInt1450)
							f_832_ = (float) anInt1450;
						f_836_ = f_836_ - f_857_ * f_833_ + f_857_;
						float f_865_ = ((float) (i & 0xff0000) - f_859_ * f_833_ + f_859_);
						float f_866_ = (float) (i & 0xff00) - f_861_ * f_833_ + f_861_;
						float f_867_ = (float) (i & 0xff) - f_863_ * f_833_ + f_863_;
						if (f_831_ < f_832_) {
							f_835_ = f_833_;
							if (f < 0.0F) {
								f_835_ -= f_855_ * f;
								f_833_ -= f_854_ * f;
								f_836_ -= f_858_ * f;
								f_865_ -= f_860_ * f;
								f_866_ -= f_862_ * f;
								f_867_ -= f_864_ * f;
								f = 0.0F;
							}
							if (f_831_ < 0.0F) {
								f_834_ -= f_853_ * f_831_;
								f_831_ = 0.0F;
							}
							if (f != f_831_ && f_855_ < f_854_ || f == f_831_ && f_855_ > f_853_) {
								f += 0.5F;
								f_831_ += 0.5F;
								f_832_ = (float) (int) (f_832_ + 0.5F) - f_831_;
								f_831_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_831_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f, 0, 0, (int) f_835_, (int) f_833_, f_836_, f_857_, f_865_, f_859_, f_866_, f_861_, f_867_, f_863_);
									f_835_ += f_855_;
									f_833_ += f_854_;
									f_836_ += f_858_;
									f_865_ += f_860_;
									f_866_ += f_862_;
									f_867_ += f_864_;
									f += (float) anInt1458;
								}
								while (--f_832_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f, 0, 0, (int) f_835_, (int) f_834_, f_836_, f_857_, f_865_, f_859_, f_866_, f_861_, f_867_, f_863_);
									f_835_ += f_855_;
									f_834_ += f_853_;
									f_836_ += f_858_;
									f_865_ += f_860_;
									f_866_ += f_862_;
									f_867_ += f_864_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_831_ += 0.5F;
								f_832_ = (float) (int) (f_832_ + 0.5F) - f_831_;
								f_831_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_831_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f, 0, 0, (int) f_833_, (int) f_835_, f_836_, f_857_, f_865_, f_859_, f_866_, f_861_, f_867_, f_863_);
									f_835_ += f_855_;
									f_833_ += f_854_;
									f_836_ += f_858_;
									f_865_ += f_860_;
									f_866_ += f_862_;
									f_867_ += f_864_;
									f += (float) anInt1458;
								}
								while (--f_832_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f, 0, 0, (int) f_834_, (int) f_835_, f_836_, f_857_, f_865_, f_859_, f_866_, f_861_, f_867_, f_863_);
									f_835_ += f_855_;
									f_834_ += f_853_;
									f_836_ += f_858_;
									f_865_ += f_860_;
									f_866_ += f_862_;
									f_867_ += f_864_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_834_ = f_833_;
							if (f < 0.0F) {
								f_834_ -= f_855_ * f;
								f_833_ -= f_854_ * f;
								f_836_ -= f_858_ * f;
								f_865_ -= f_860_ * f;
								f_866_ -= f_862_ * f;
								f_867_ -= f_864_ * f;
								f = 0.0F;
							}
							if (f_832_ < 0.0F) {
								f_835_ -= f_853_ * f_832_;
								f_832_ = 0.0F;
							}
							if (f != f_832_ && f_855_ < f_854_ || f == f_832_ && f_853_ > f_854_) {
								f += 0.5F;
								f_832_ += 0.5F;
								f_831_ = (float) (int) (f_831_ + 0.5F) - f_832_;
								f_832_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_832_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f, 0, 0, (int) f_834_, (int) f_833_, f_836_, f_857_, f_865_, f_859_, f_866_, f_861_, f_867_, f_863_);
									f_834_ += f_855_;
									f_833_ += f_854_;
									f_836_ += f_858_;
									f_865_ += f_860_;
									f_866_ += f_862_;
									f_867_ += f_864_;
									f += (float) anInt1458;
								}
								while (--f_831_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f, 0, 0, (int) f_835_, (int) f_833_, f_836_, f_857_, f_865_, f_859_, f_866_, f_861_, f_867_, f_863_);
									f_835_ += f_853_;
									f_833_ += f_854_;
									f_836_ += f_858_;
									f_865_ += f_860_;
									f_866_ += f_862_;
									f_867_ += f_864_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_832_ += 0.5F;
								f_831_ = (float) (int) (f_831_ + 0.5F) - f_832_;
								f_832_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_832_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f, 0, 0, (int) f_833_, (int) f_834_, f_836_, f_857_, f_865_, f_859_, f_866_, f_861_, f_867_, f_863_);
									f_834_ += f_855_;
									f_833_ += f_854_;
									f_836_ += f_858_;
									f_865_ += f_860_;
									f_866_ += f_862_;
									f_867_ += f_864_;
									f += (float) anInt1458;
								}
								while (--f_831_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f, 0, 0, (int) f_833_, (int) f_835_, f_836_, f_857_, f_865_, f_859_, f_866_, f_861_, f_867_, f_863_);
									f_835_ += f_853_;
									f_833_ += f_854_;
									f_836_ += f_858_;
									f_865_ += f_860_;
									f_866_ += f_862_;
									f_867_ += f_864_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_831_ <= f_832_) {
					if (!(f_831_ >= (float) anInt1450)) {
						if (f_832_ > (float) anInt1450)
							f_832_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_837_ = f_837_ - f_857_ * f_834_ + f_857_;
						float f_868_ = ((float) (i_839_ & 0xff0000) - f_859_ * f_834_ + f_859_);
						float f_869_ = ((float) (i_839_ & 0xff00) - f_861_ * f_834_ + f_861_);
						float f_870_ = ((float) (i_839_ & 0xff) - f_863_ * f_834_ + f_863_);
						if (f_832_ < f) {
							f_833_ = f_834_;
							if (f_831_ < 0.0F) {
								f_833_ -= f_854_ * f_831_;
								f_834_ -= f_853_ * f_831_;
								f_837_ -= f_858_ * f_831_;
								f_868_ -= f_860_ * f_831_;
								f_869_ -= f_862_ * f_831_;
								f_870_ -= f_864_ * f_831_;
								f_831_ = 0.0F;
							}
							if (f_832_ < 0.0F) {
								f_835_ -= f_855_ * f_832_;
								f_832_ = 0.0F;
							}
							if (f_831_ != f_832_ && f_854_ < f_853_ || f_831_ == f_832_ && f_854_ > f_855_) {
								f_831_ += 0.5F;
								f_832_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_832_;
								f_832_ -= f_831_;
								f_831_ = (float) anIntArray1447[(int) f_831_];
								while (--f_832_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f_831_, 0, 0, (int) f_833_, (int) f_834_, f_837_, f_857_, f_868_, f_859_, f_869_, f_861_, f_870_, f_863_);
									f_833_ += f_854_;
									f_834_ += f_853_;
									f_837_ += f_858_;
									f_868_ += f_860_;
									f_869_ += f_862_;
									f_870_ += f_864_;
									f_831_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f_831_, 0, 0, (int) f_833_, (int) f_835_, f_837_, f_857_, f_868_, f_859_, f_869_, f_861_, f_870_, f_863_);
									f_833_ += f_854_;
									f_835_ += f_855_;
									f_837_ += f_858_;
									f_868_ += f_860_;
									f_869_ += f_862_;
									f_870_ += f_864_;
									f_831_ += (float) anInt1458;
								}
							} else {
								f_831_ += 0.5F;
								f_832_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_832_;
								f_832_ -= f_831_;
								f_831_ = (float) anIntArray1447[(int) f_831_];
								while (--f_832_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f_831_, 0, 0, (int) f_834_, (int) f_833_, f_837_, f_857_, f_868_, f_859_, f_869_, f_861_, f_870_, f_863_);
									f_833_ += f_854_;
									f_834_ += f_853_;
									f_837_ += f_858_;
									f_868_ += f_860_;
									f_869_ += f_862_;
									f_870_ += f_864_;
									f_831_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f_831_, 0, 0, (int) f_835_, (int) f_833_, f_837_, f_857_, f_868_, f_859_, f_869_, f_861_, f_870_, f_863_);
									f_833_ += f_854_;
									f_835_ += f_855_;
									f_837_ += f_858_;
									f_868_ += f_860_;
									f_869_ += f_862_;
									f_870_ += f_864_;
									f_831_ += (float) anInt1458;
								}
							}
						} else {
							f_835_ = f_834_;
							if (f_831_ < 0.0F) {
								f_835_ -= f_854_ * f_831_;
								f_834_ -= f_853_ * f_831_;
								f_837_ -= f_858_ * f_831_;
								f_868_ -= f_860_ * f_831_;
								f_869_ -= f_862_ * f_831_;
								f_870_ -= f_864_ * f_831_;
								f_831_ = 0.0F;
							}
							if (f < 0.0F) {
								f_833_ -= f_855_ * f;
								f = 0.0F;
							}
							if (f_854_ < f_853_) {
								f_831_ += 0.5F;
								f += 0.5F;
								f_832_ = (float) (int) (f_832_ + 0.5F) - f;
								f -= f_831_;
								f_831_ = (float) anIntArray1447[(int) f_831_];
								while (--f >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f_831_, 0, 0, (int) f_835_, (int) f_834_, f_837_, f_857_, f_868_, f_859_, f_869_, f_861_, f_870_, f_863_);
									f_835_ += f_854_;
									f_834_ += f_853_;
									f_837_ += f_858_;
									f_868_ += f_860_;
									f_869_ += f_862_;
									f_870_ += f_864_;
									f_831_ += (float) anInt1458;
								}
								while (--f_832_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f_831_, 0, 0, (int) f_833_, (int) f_834_, f_837_, f_857_, f_868_, f_859_, f_869_, f_861_, f_870_, f_863_);
									f_833_ += f_855_;
									f_834_ += f_853_;
									f_837_ += f_858_;
									f_868_ += f_860_;
									f_869_ += f_862_;
									f_870_ += f_864_;
									f_831_ += (float) anInt1458;
								}
							} else {
								f_831_ += 0.5F;
								f += 0.5F;
								f_832_ = (float) (int) (f_832_ + 0.5F) - f;
								f -= f_831_;
								f_831_ = (float) anIntArray1447[(int) f_831_];
								while (--f >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f_831_, 0, 0, (int) f_834_, (int) f_835_, f_837_, f_857_, f_868_, f_859_, f_869_, f_861_, f_870_, f_863_);
									f_835_ += f_854_;
									f_834_ += f_853_;
									f_837_ += f_858_;
									f_868_ += f_860_;
									f_869_ += f_862_;
									f_870_ += f_864_;
									f_831_ += (float) anInt1458;
								}
								while (--f_832_ >= 0.0F) {
									method2076(bool_829_, bool_830_, anIntArray1459, (int) f_831_, 0, 0, (int) f_834_, (int) f_833_, f_837_, f_857_, f_868_, f_859_, f_869_, f_861_, f_870_, f_863_);
									f_833_ += f_855_;
									f_834_ += f_853_;
									f_837_ += f_858_;
									f_868_ += f_860_;
									f_869_ += f_862_;
									f_870_ += f_864_;
									f_831_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_832_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_831_ > (float) anInt1450)
						f_831_ = (float) anInt1450;
					f_838_ = f_838_ - f_857_ * f_835_ + f_857_;
					float f_871_ = ((float) (i_840_ & 0xff0000) - f_859_ * f_835_ + f_859_);
					float f_872_ = (float) (i_840_ & 0xff00) - f_861_ * f_835_ + f_861_;
					float f_873_ = (float) (i_840_ & 0xff) - f_863_ * f_835_ + f_863_;
					if (f < f_831_) {
						f_834_ = f_835_;
						if (f_832_ < 0.0F) {
							f_834_ -= f_853_ * f_832_;
							f_835_ -= f_855_ * f_832_;
							f_838_ -= f_858_ * f_832_;
							f_871_ -= f_860_ * f_832_;
							f_872_ -= f_862_ * f_832_;
							f_873_ -= f_864_ * f_832_;
							f_832_ = 0.0F;
						}
						if (f < 0.0F) {
							f_833_ -= f_854_ * f;
							f = 0.0F;
						}
						if (f_853_ < f_855_) {
							f_832_ += 0.5F;
							f += 0.5F;
							f_831_ = (float) (int) (f_831_ + 0.5F) - f;
							f -= f_832_;
							f_832_ = (float) anIntArray1447[(int) f_832_];
							while (--f >= 0.0F) {
								method2076(bool_829_, bool_830_, anIntArray1459, (int) f_832_, 0, 0, (int) f_834_, (int) f_835_, f_838_, f_857_, f_871_, f_859_, f_872_, f_861_, f_873_, f_863_);
								f_834_ += f_853_;
								f_835_ += f_855_;
								f_838_ += f_858_;
								f_871_ += f_860_;
								f_872_ += f_862_;
								f_873_ += f_864_;
								f_832_ += (float) anInt1458;
							}
							while (--f_831_ >= 0.0F) {
								method2076(bool_829_, bool_830_, anIntArray1459, (int) f_832_, 0, 0, (int) f_834_, (int) f_833_, f_838_, f_857_, f_871_, f_859_, f_872_, f_861_, f_873_, f_863_);
								f_834_ += f_853_;
								f_833_ += f_854_;
								f_838_ += f_858_;
								f_871_ += f_860_;
								f_872_ += f_862_;
								f_873_ += f_864_;
								f_832_ += (float) anInt1458;
							}
						} else {
							f_832_ += 0.5F;
							f += 0.5F;
							f_831_ = (float) (int) (f_831_ + 0.5F) - f;
							f -= f_832_;
							f_832_ = (float) anIntArray1447[(int) f_832_];
							while (--f >= 0.0F) {
								method2076(bool_829_, bool_830_, anIntArray1459, (int) f_832_, 0, 0, (int) f_835_, (int) f_834_, f_838_, f_857_, f_871_, f_859_, f_872_, f_861_, f_873_, f_863_);
								f_834_ += f_853_;
								f_835_ += f_855_;
								f_838_ += f_858_;
								f_871_ += f_860_;
								f_872_ += f_862_;
								f_873_ += f_864_;
								f_832_ += (float) anInt1458;
							}
							while (--f_831_ >= 0.0F) {
								method2076(bool_829_, bool_830_, anIntArray1459, (int) f_832_, 0, 0, (int) f_833_, (int) f_834_, f_838_, f_857_, f_871_, f_859_, f_872_, f_861_, f_873_, f_863_);
								f_834_ += f_853_;
								f_833_ += f_854_;
								f_838_ += f_858_;
								f_871_ += f_860_;
								f_872_ += f_862_;
								f_873_ += f_864_;
								f_832_ += (float) anInt1458;
							}
						}
					} else {
						f_833_ = f_835_;
						if (f_832_ < 0.0F) {
							f_833_ -= f_853_ * f_832_;
							f_835_ -= f_855_ * f_832_;
							f_838_ -= f_858_ * f_832_;
							f_871_ -= f_860_ * f_832_;
							f_872_ -= f_862_ * f_832_;
							f_873_ -= f_864_ * f_832_;
							f_832_ = 0.0F;
						}
						if (f_831_ < 0.0F) {
							f_834_ -= f_854_ * f_831_;
							f_831_ = 0.0F;
						}
						if (f_853_ < f_855_) {
							f_832_ += 0.5F;
							f_831_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_831_;
							f_831_ -= f_832_;
							f_832_ = (float) anIntArray1447[(int) f_832_];
							while (--f_831_ >= 0.0F) {
								method2076(bool_829_, bool_830_, anIntArray1459, (int) f_832_, 0, 0, (int) f_833_, (int) f_835_, f_838_, f_857_, f_871_, f_859_, f_872_, f_861_, f_873_, f_863_);
								f_833_ += f_853_;
								f_835_ += f_855_;
								f_838_ += f_858_;
								f_871_ += f_860_;
								f_872_ += f_862_;
								f_873_ += f_864_;
								f_832_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2076(bool_829_, bool_830_, anIntArray1459, (int) f_832_, 0, 0, (int) f_834_, (int) f_835_, f_838_, f_857_, f_871_, f_859_, f_872_, f_861_, f_873_, f_863_);
								f_834_ += f_854_;
								f_835_ += f_855_;
								f_838_ += f_858_;
								f_871_ += f_860_;
								f_872_ += f_862_;
								f_873_ += f_864_;
								f_832_ += (float) anInt1458;
							}
						} else {
							f_832_ += 0.5F;
							f_831_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_831_;
							f_831_ -= f_832_;
							f_832_ = (float) anIntArray1447[(int) f_832_];
							while (--f_831_ >= 0.0F) {
								method2076(bool_829_, bool_830_, anIntArray1459, (int) f_832_, 0, 0, (int) f_835_, (int) f_833_, f_838_, f_857_, f_871_, f_859_, f_872_, f_861_, f_873_, f_863_);
								f_833_ += f_853_;
								f_835_ += f_855_;
								f_838_ += f_858_;
								f_871_ += f_860_;
								f_872_ += f_862_;
								f_873_ += f_864_;
								f_832_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2076(bool_829_, bool_830_, anIntArray1459, (int) f_832_, 0, 0, (int) f_835_, (int) f_834_, f_838_, f_857_, f_871_, f_859_, f_872_, f_861_, f_873_, f_863_);
								f_834_ += f_854_;
								f_835_ += f_855_;
								f_838_ += f_858_;
								f_871_ += f_860_;
								f_872_ += f_862_;
								f_873_ += f_864_;
								f_832_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2098(boolean bool, boolean bool_874_, int[] is, int i, int i_875_, int i_876_, int i_877_, int i_878_, float f, float f_879_, float f_880_, float f_881_) {
		if (aBool1445) {
			if (i_878_ > anInt1442)
				i_878_ = anInt1442;
			if (i_877_ < 0)
				i_877_ = 0;
		}
		if (i_877_ < i_878_) {
			i += i_877_ - 1;
			f += f_879_ * (float) i_877_;
			f_880_ += f_881_ * (float) i_877_;
			if (aClass101_1457.aBool1227) {
				if (aBool1467) {
					i_876_ = i_878_ - i_877_ >> 2;
					f_879_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_876_ > 0) {
							do {
								i_875_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								f += f_879_;
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									is[i] = i_875_;
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									is[i] = i_875_;
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									is[i] = i_875_;
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									is[i] = i_875_;
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
							} while (--i_876_ > 0);
						}
						i_876_ = i_878_ - i_877_ & 0x3;
						if (i_876_ > 0) {
							i_875_ = Class656.anIntArray8393[(int) f & 0xffff];
							do {
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									is[i] = i_875_;
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
							} while (--i_876_ > 0);
						}
					} else {
						int i_882_ = anInt1441;
						int i_883_ = 256 - anInt1441;
						if (i_876_ > 0) {
							do {
								i_875_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								f += f_879_;
								i_875_ = (((i_875_ & 0xff00ff) * i_883_ >> 8 & 0xff00ff) + ((i_875_ & 0xff00) * i_883_ >> 8 & 0xff00));
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									int i_884_ = is[i];
									if (bool_874_)
										is[i] = ((i_883_ | i_884_ >> 24) << 24 | (i_875_ + (((i_884_ & 0xff00ff) * i_882_) >> 8 & 0xff00ff) + (((i_884_ & 0xff00) * i_882_) >> 8 & 0xff00)));
									else
										is[i] = (i_875_ + (((i_884_ & 0xff00ff) * i_882_ >> 8) & 0xff00ff) + (((i_884_ & 0xff00) * i_882_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									int i_885_ = is[i];
									if (bool_874_)
										is[i] = ((i_883_ | i_885_ >> 24) << 24 | (i_875_ + (((i_885_ & 0xff00ff) * i_882_) >> 8 & 0xff00ff) + (((i_885_ & 0xff00) * i_882_) >> 8 & 0xff00)));
									else
										is[i] = (i_875_ + (((i_885_ & 0xff00ff) * i_882_ >> 8) & 0xff00ff) + (((i_885_ & 0xff00) * i_882_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									int i_886_ = is[i];
									if (bool_874_)
										is[i] = ((i_883_ | i_886_ >> 24) << 24 | (i_875_ + (((i_886_ & 0xff00ff) * i_882_) >> 8 & 0xff00ff) + (((i_886_ & 0xff00) * i_882_) >> 8 & 0xff00)));
									else
										is[i] = (i_875_ + (((i_886_ & 0xff00ff) * i_882_ >> 8) & 0xff00ff) + (((i_886_ & 0xff00) * i_882_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									int i_887_ = is[i];
									if (bool_874_)
										is[i] = ((i_883_ | i_887_ >> 24) << 24 | (i_875_ + (((i_887_ & 0xff00ff) * i_882_) >> 8 & 0xff00ff) + (((i_887_ & 0xff00) * i_882_) >> 8 & 0xff00)));
									else
										is[i] = (i_875_ + (((i_887_ & 0xff00ff) * i_882_ >> 8) & 0xff00ff) + (((i_887_ & 0xff00) * i_882_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
							} while (--i_876_ > 0);
						}
						i_876_ = i_878_ - i_877_ & 0x3;
						if (i_876_ > 0) {
							i_875_ = Class656.anIntArray8393[(int) f & 0xffff];
							i_875_ = (((i_875_ & 0xff00ff) * i_883_ >> 8 & 0xff00ff) + ((i_875_ & 0xff00) * i_883_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f_880_ < aFloatArray1460[i]) {
									int i_888_ = is[i];
									if (bool_874_)
										is[i] = ((i_883_ | i_888_ >> 24) << 24 | (i_875_ + (((i_888_ & 0xff00ff) * i_882_) >> 8 & 0xff00ff) + (((i_888_ & 0xff00) * i_882_) >> 8 & 0xff00)));
									else
										is[i] = (i_875_ + (((i_888_ & 0xff00ff) * i_882_ >> 8) & 0xff00ff) + (((i_888_ & 0xff00) * i_882_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f_880_;
								}
								f_880_ += f_881_;
							} while (--i_876_ > 0);
						}
					}
				} else {
					i_876_ = i_878_ - i_877_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f_880_ < aFloatArray1460[i]) {
								is[i] = (Class656.anIntArray8393[(int) f & 0xffff]);
								if (bool)
									aFloatArray1460[i] = f_880_;
							}
							f_880_ += f_881_;
							f += f_879_;
						} while (--i_876_ > 0);
					} else {
						int i_889_ = anInt1441;
						int i_890_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f_880_ < aFloatArray1460[i]) {
								i_875_ = (Class656.anIntArray8393[(int) f & 0xffff]);
								i_875_ = (((i_875_ & 0xff00ff) * i_890_ >> 8 & 0xff00ff) + ((i_875_ & 0xff00) * i_890_ >> 8 & 0xff00));
								int i_891_ = is[i];
								if (bool_874_)
									is[i] = ((i_890_ | i_891_ >> 24) << 24 | (i_875_ + (((i_891_ & 0xff00ff) * i_889_ >> 8) & 0xff00ff) + (((i_891_ & 0xff00) * i_889_ >> 8) & 0xff00)));
								else
									is[i] = (i_875_ + ((i_891_ & 0xff00ff) * i_889_ >> 8 & 0xff00ff) + ((i_891_ & 0xff00) * i_889_ >> 8 & 0xff00));
								if (bool)
									aFloatArray1460[i] = f_880_;
							}
							f += f_879_;
							f_880_ += f_881_;
						} while (--i_876_ > 0);
					}
				}
			} else if (aBool1467) {
				i_876_ = i_878_ - i_877_ >> 2;
				f_879_ *= 4.0F;
				if (anInt1441 == 0) {
					if (i_876_ > 0) {
						do {
							i_875_ = Class656.anIntArray8393[(int) f & 0xffff];
							f += f_879_;
							i++;
							if (!bool || f_880_ < aFloatArray1460[i])
								is[i] = i_875_;
							f_880_ += f_881_;
							i++;
							if (!bool || f_880_ < aFloatArray1460[i])
								is[i] = i_875_;
							f_880_ += f_881_;
							i++;
							if (!bool || f_880_ < aFloatArray1460[i])
								is[i] = i_875_;
							f_880_ += f_881_;
							i++;
							if (!bool || f_880_ < aFloatArray1460[i])
								is[i] = i_875_;
							f_880_ += f_881_;
						} while (--i_876_ > 0);
					}
					i_876_ = i_878_ - i_877_ & 0x3;
					if (i_876_ > 0) {
						i_875_ = Class656.anIntArray8393[(int) f & 0xffff];
						do {
							i++;
							if (!bool || f_880_ < aFloatArray1460[i])
								is[i] = i_875_;
							f_880_ += f_881_;
						} while (--i_876_ > 0);
					}
				} else {
					int i_892_ = anInt1441;
					int i_893_ = 256 - anInt1441;
					if (i_876_ > 0) {
						do {
							i_875_ = Class656.anIntArray8393[(int) f & 0xffff];
							f += f_879_;
							i_875_ = (((i_875_ & 0xff00ff) * i_893_ >> 8 & 0xff00ff) + ((i_875_ & 0xff00) * i_893_ >> 8 & 0xff00));
							i++;
							if (!bool || f_880_ < aFloatArray1460[i]) {
								int i_894_ = is[i];
								if (bool_874_)
									is[i] = ((i_893_ | i_894_ >> 24) << 24 | (i_875_ + (((i_894_ & 0xff00ff) * i_892_ >> 8) & 0xff00ff) + (((i_894_ & 0xff00) * i_892_ >> 8) & 0xff00)));
								else
									is[i] = (i_875_ + ((i_894_ & 0xff00ff) * i_892_ >> 8 & 0xff00ff) + ((i_894_ & 0xff00) * i_892_ >> 8 & 0xff00));
							}
							f_880_ += f_881_;
							i++;
							if (!bool || f_880_ < aFloatArray1460[i]) {
								int i_895_ = is[i];
								if (bool_874_)
									is[i] = ((i_893_ | i_895_ >> 24) << 24 | (i_875_ + (((i_895_ & 0xff00ff) * i_892_ >> 8) & 0xff00ff) + (((i_895_ & 0xff00) * i_892_ >> 8) & 0xff00)));
								else
									is[i] = (i_875_ + ((i_895_ & 0xff00ff) * i_892_ >> 8 & 0xff00ff) + ((i_895_ & 0xff00) * i_892_ >> 8 & 0xff00));
							}
							f_880_ += f_881_;
							i++;
							if (!bool || f_880_ < aFloatArray1460[i]) {
								int i_896_ = is[i];
								if (bool_874_)
									is[i] = ((i_893_ | i_896_ >> 24) << 24 | (i_875_ + (((i_896_ & 0xff00ff) * i_892_ >> 8) & 0xff00ff) + (((i_896_ & 0xff00) * i_892_ >> 8) & 0xff00)));
								else
									is[i] = (i_875_ + ((i_896_ & 0xff00ff) * i_892_ >> 8 & 0xff00ff) + ((i_896_ & 0xff00) * i_892_ >> 8 & 0xff00));
							}
							f_880_ += f_881_;
							i++;
							if (!bool || f_880_ < aFloatArray1460[i]) {
								int i_897_ = is[i];
								if (bool_874_)
									is[i] = ((i_893_ | i_897_ >> 24) << 24 | (i_875_ + (((i_897_ & 0xff00ff) * i_892_ >> 8) & 0xff00ff) + (((i_897_ & 0xff00) * i_892_ >> 8) & 0xff00)));
								else
									is[i] = (i_875_ + ((i_897_ & 0xff00ff) * i_892_ >> 8 & 0xff00ff) + ((i_897_ & 0xff00) * i_892_ >> 8 & 0xff00));
							}
							f_880_ += f_881_;
						} while (--i_876_ > 0);
					}
					i_876_ = i_878_ - i_877_ & 0x3;
					if (i_876_ > 0) {
						i_875_ = Class656.anIntArray8393[(int) f & 0xffff];
						i_875_ = (((i_875_ & 0xff00ff) * i_893_ >> 8 & 0xff00ff) + ((i_875_ & 0xff00) * i_893_ >> 8 & 0xff00));
						do {
							i++;
							if (!bool || f_880_ < aFloatArray1460[i]) {
								int i_898_ = is[i];
								if (bool_874_)
									is[i] = ((i_893_ | i_898_ >> 24) << 24 | (i_875_ + (((i_898_ & 0xff00ff) * i_892_ >> 8) & 0xff00ff) + (((i_898_ & 0xff00) * i_892_ >> 8) & 0xff00)));
								else
									is[i] = (i_875_ + ((i_898_ & 0xff00ff) * i_892_ >> 8 & 0xff00ff) + ((i_898_ & 0xff00) * i_892_ >> 8 & 0xff00));
							}
							f_880_ += f_881_;
						} while (--i_876_ > 0);
					}
				}
			} else {
				i_876_ = i_878_ - i_877_;
				if (anInt1441 == 0) {
					do {
						i++;
						if (!bool || f_880_ < aFloatArray1460[i])
							is[i] = Class656.anIntArray8393[(int) f & 0xffff];
						f_880_ += f_881_;
						f += f_879_;
					} while (--i_876_ > 0);
				} else {
					int i_899_ = anInt1441;
					int i_900_ = 256 - anInt1441;
					do {
						i++;
						if (!bool || f_880_ < aFloatArray1460[i]) {
							i_875_ = Class656.anIntArray8393[(int) f & 0xffff];
							i_875_ = (((i_875_ & 0xff00ff) * i_900_ >> 8 & 0xff00ff) + ((i_875_ & 0xff00) * i_900_ >> 8 & 0xff00));
							int i_901_ = is[i];
							if (bool_874_)
								is[i] = ((i_900_ | i_901_ >> 24) << 24 | (i_875_ + ((i_901_ & 0xff00ff) * i_899_ >> 8 & 0xff00ff) + ((i_901_ & 0xff00) * i_899_ >> 8 & 0xff00)));
							else
								is[i] = (i_875_ + ((i_901_ & 0xff00ff) * i_899_ >> 8 & 0xff00ff) + ((i_901_ & 0xff00) * i_899_ >> 8 & 0xff00));
						}
						f += f_879_;
						f_880_ += f_881_;
					} while (--i_876_ > 0);
				}
			}
		}
	}

	final void method2099(boolean bool, boolean bool_902_, int[] is, int i, int i_903_, int i_904_, int i_905_, int i_906_, float f, float f_907_, float f_908_, float f_909_, float f_910_, float f_911_, float f_912_, float f_913_) {
		if (aBool1445) {
			if (i_906_ > anInt1442)
				i_906_ = anInt1442;
			if (i_905_ < 0)
				i_905_ = 0;
		}
		if (i_905_ < i_906_) {
			if (aBool1446) {
				i += i_905_;
				f_908_ += f_909_ * (float) i_905_;
				f_910_ += f_911_ * (float) i_905_;
				f_912_ += f_913_ * (float) i_905_;
				if (aBool1467) {
					i_904_ = i_906_ - i_905_ >> 2;
					f_909_ *= 4.0F;
					f_911_ *= 4.0F;
					f_913_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_904_ > 0) {
							do {
								i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
								is[i++] = i_903_;
								is[i++] = i_903_;
								is[i++] = i_903_;
								is[i++] = i_903_;
							} while (--i_904_ > 0);
						}
						i_904_ = i_906_ - i_905_ & 0x3;
						if (i_904_ > 0) {
							i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							do
								is[i++] = i_903_;
							while (--i_904_ > 0);
						}
					} else if (!aBool1443) {
						int i_914_ = anInt1441;
						int i_915_ = 256 - anInt1441;
						if (i_904_ > 0) {
							do {
								i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
								i_903_ = (((i_903_ & 0xff00ff) * i_915_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_915_ >> 8 & 0xff00));
								int i_916_ = is[i];
								if (bool_902_) {
									is[i++] = ((i_915_ | i_916_ >> 24) << 24 | (i_903_ + (((i_916_ & 0xff00ff) * i_914_ >> 8) & 0xff00ff) + (((i_916_ & 0xff00) * i_914_ >> 8) & 0xff00)));
									i_916_ = is[i];
									is[i++] = ((i_915_ | i_916_ >> 24) << 24 | (i_903_ + (((i_916_ & 0xff00ff) * i_914_ >> 8) & 0xff00ff) + (((i_916_ & 0xff00) * i_914_ >> 8) & 0xff00)));
									i_916_ = is[i];
									is[i++] = ((i_915_ | i_916_ >> 24) << 24 | (i_903_ + (((i_916_ & 0xff00ff) * i_914_ >> 8) & 0xff00ff) + (((i_916_ & 0xff00) * i_914_ >> 8) & 0xff00)));
									i_916_ = is[i];
									is[i++] = ((i_915_ | i_916_ >> 24) << 24 | (i_903_ + (((i_916_ & 0xff00ff) * i_914_ >> 8) & 0xff00ff) + (((i_916_ & 0xff00) * i_914_ >> 8) & 0xff00)));
								} else {
									is[i++] = (i_903_ + ((i_916_ & 0xff00ff) * i_914_ >> 8 & 0xff00ff) + ((i_916_ & 0xff00) * i_914_ >> 8 & 0xff00));
									i_916_ = is[i];
									is[i++] = (i_903_ + ((i_916_ & 0xff00ff) * i_914_ >> 8 & 0xff00ff) + ((i_916_ & 0xff00) * i_914_ >> 8 & 0xff00));
									i_916_ = is[i];
									is[i++] = (i_903_ + ((i_916_ & 0xff00ff) * i_914_ >> 8 & 0xff00ff) + ((i_916_ & 0xff00) * i_914_ >> 8 & 0xff00));
									i_916_ = is[i];
									is[i++] = (i_903_ + ((i_916_ & 0xff00ff) * i_914_ >> 8 & 0xff00ff) + ((i_916_ & 0xff00) * i_914_ >> 8 & 0xff00));
								}
							} while (--i_904_ > 0);
						}
						i_904_ = i_906_ - i_905_ & 0x3;
						if (i_904_ > 0) {
							i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							i_903_ = (((i_903_ & 0xff00ff) * i_915_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_915_ >> 8 & 0xff00));
							do {
								int i_917_ = is[i];
								if (bool_902_)
									is[i++] = ((i_915_ | i_917_ >> 24) << 24 | (i_903_ + (((i_917_ & 0xff00ff) * i_914_ >> 8) & 0xff00ff) + (((i_917_ & 0xff00) * i_914_ >> 8) & 0xff00)));
								else
									is[i++] = (i_903_ + ((i_917_ & 0xff00ff) * i_914_ >> 8 & 0xff00ff) + ((i_917_ & 0xff00) * i_914_ >> 8 & 0xff00));
							} while (--i_904_ > 0);
						}
					} else {
						if (i_904_ > 0) {
							do {
								i_903_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
								int[] is_918_ = is;
								int i_919_ = i++;
								int i_920_ = i_903_;
								int i_921_ = is_918_[i_919_];
								int i_922_ = i_920_ + i_921_;
								int i_923_ = ((i_920_ & 0xff00ff) + (i_921_ & 0xff00ff));
								i_921_ = (i_923_ & 0x1000100) + (i_922_ - i_923_ & 0x10000);
								is_918_[i_919_] = (~0xffffff | i_922_ - i_921_ | i_921_ - (i_921_ >>> 8));
								int[] is_924_ = is;
								i_922_ = i++;
								i_923_ = i_903_;
								int i_925_ = is_924_[i_922_];
								int i_926_ = i_923_ + i_925_;
								int i_927_ = ((i_923_ & 0xff00ff) + (i_925_ & 0xff00ff));
								i_925_ = (i_927_ & 0x1000100) + (i_926_ - i_927_ & 0x10000);
								is_924_[i_922_] = (~0xffffff | i_926_ - i_925_ | i_925_ - (i_925_ >>> 8));
								int[] is_928_ = is;
								i_926_ = i++;
								i_927_ = i_903_;
								int i_929_ = is_928_[i_926_];
								int i_930_ = i_927_ + i_929_;
								int i_931_ = ((i_927_ & 0xff00ff) + (i_929_ & 0xff00ff));
								i_929_ = (i_931_ & 0x1000100) + (i_930_ - i_931_ & 0x10000);
								is_928_[i_926_] = (~0xffffff | i_930_ - i_929_ | i_929_ - (i_929_ >>> 8));
								int[] is_932_ = is;
								i_930_ = i++;
								i_931_ = i_903_;
								int i_933_ = is_932_[i_930_];
								int i_934_ = i_931_ + i_933_;
								int i_935_ = ((i_931_ & 0xff00ff) + (i_933_ & 0xff00ff));
								i_933_ = (i_935_ & 0x1000100) + (i_934_ - i_935_ & 0x10000);
								is_932_[i_930_] = (~0xffffff | i_934_ - i_933_ | i_933_ - (i_933_ >>> 8));
							} while (--i_904_ > 0);
						}
						i_904_ = i_906_ - i_905_ & 0x3;
						if (i_904_ > 0) {
							i_903_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							do {
								int[] is_936_ = is;
								int i_937_ = i++;
								int i_938_ = i_903_;
								int i_939_ = is_936_[i_937_];
								int i_940_ = i_938_ + i_939_;
								int i_941_ = ((i_938_ & 0xff00ff) + (i_939_ & 0xff00ff));
								i_939_ = (i_941_ & 0x1000100) + (i_940_ - i_941_ & 0x10000);
								is_936_[i_937_] = (~0xffffff | i_940_ - i_939_ | i_939_ - (i_939_ >>> 8));
							} while (--i_904_ > 0);
						}
					}
				} else {
					i_904_ = i_906_ - i_905_;
					if (anInt1441 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							f_908_ += f_909_;
							f_910_ += f_911_;
							f_912_ += f_913_;
						} while (--i_904_ > 0);
					} else if (!aBool1443) {
						int i_942_ = anInt1441;
						int i_943_ = 256 - anInt1441;
						do {
							i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							f_908_ += f_909_;
							f_910_ += f_911_;
							f_912_ += f_913_;
							i_903_ = (((i_903_ & 0xff00ff) * i_943_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_943_ >> 8 & 0xff00));
							int i_944_ = is[i];
							if (bool_902_)
								is[i++] = ((i_943_ | i_944_ >> 24) << 24 | (i_903_ + ((i_944_ & 0xff00ff) * i_942_ >> 8 & 0xff00ff) + ((i_944_ & 0xff00) * i_942_ >> 8 & 0xff00)));
							else
								is[i++] = (i_903_ + ((i_944_ & 0xff00ff) * i_942_ >> 8 & 0xff00ff) + ((i_944_ & 0xff00) * i_942_ >> 8 & 0xff00));
						} while (--i_904_ > 0);
					} else {
						do {
							int[] is_945_ = is;
							int i_946_ = i++;
							int i_947_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							int i_948_ = is_945_[i_946_];
							int i_949_ = i_947_ + i_948_;
							int i_950_ = (i_947_ & 0xff00ff) + (i_948_ & 0xff00ff);
							i_948_ = (i_950_ & 0x1000100) + (i_949_ - i_950_ & 0x10000);
							is_945_[i_946_] = (~0xffffff | i_949_ - i_948_ | i_948_ - (i_948_ >>> 8));
							f_908_ += f_909_;
							f_910_ += f_911_;
							f_912_ += f_913_;
						} while (--i_904_ > 0);
					}
				}
			} else {
				i += i_905_ - 1;
				f += f_907_ * (float) i_905_;
				f_908_ += f_909_ * (float) i_905_;
				f_910_ += f_911_ * (float) i_905_;
				f_912_ += f_913_ * (float) i_905_;
				if (aClass101_1457.aBool1227) {
					if (aBool1467) {
						i_904_ = i_906_ - i_905_ >> 2;
						f_909_ *= 4.0F;
						f_911_ *= 4.0F;
						f_913_ *= 4.0F;
						if (anInt1441 == 0) {
							if (i_904_ > 0) {
								do {
									i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
									f_908_ += f_909_;
									f_910_ += f_911_;
									f_912_ += f_913_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_903_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_903_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_903_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_903_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
								} while (--i_904_ > 0);
							}
							i_904_ = i_906_ - i_905_ & 0x3;
							if (i_904_ > 0) {
								i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_903_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
								} while (--i_904_ > 0);
							}
						} else if (!aBool1443) {
							int i_951_ = anInt1441;
							int i_952_ = 256 - anInt1441;
							if (i_904_ > 0) {
								do {
									i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
									f_908_ += f_909_;
									f_910_ += f_911_;
									f_912_ += f_913_;
									i_903_ = (((i_903_ & 0xff00ff) * i_952_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_952_ >> 8 & 0xff00));
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_953_ = is[i];
										if (bool_902_)
											is[i] = (((i_952_ | i_953_ >> 24) << 24) | (i_903_ + (((i_953_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_953_ & 0xff00) * i_951_) >> 8 & 0xff00)));
										else
											is[i] = (i_903_ + (((i_953_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_953_ & 0xff00) * i_951_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_954_ = is[i];
										if (bool_902_)
											is[i] = (((i_952_ | i_954_ >> 24) << 24) | (i_903_ + (((i_954_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_954_ & 0xff00) * i_951_) >> 8 & 0xff00)));
										else
											is[i] = (i_903_ + (((i_954_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_954_ & 0xff00) * i_951_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_955_ = is[i];
										if (bool_902_)
											is[i] = (((i_952_ | i_955_ >> 24) << 24) | (i_903_ + (((i_955_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_955_ & 0xff00) * i_951_) >> 8 & 0xff00)));
										else
											is[i] = (i_903_ + (((i_955_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_955_ & 0xff00) * i_951_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_956_ = is[i];
										if (bool_902_)
											is[i] = (((i_952_ | i_956_ >> 24) << 24) | (i_903_ + (((i_956_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_956_ & 0xff00) * i_951_) >> 8 & 0xff00)));
										else
											is[i] = (i_903_ + (((i_956_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_956_ & 0xff00) * i_951_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
								} while (--i_904_ > 0);
							}
							i_904_ = i_906_ - i_905_ & 0x3;
							if (i_904_ > 0) {
								i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								i_903_ = (((i_903_ & 0xff00ff) * i_952_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_952_ >> 8 & 0xff00));
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_957_ = is[i];
										if (bool_902_)
											is[i] = (((i_952_ | i_957_ >> 24) << 24) | (i_903_ + (((i_957_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_957_ & 0xff00) * i_951_) >> 8 & 0xff00)));
										else
											is[i] = (i_903_ + (((i_957_ & 0xff00ff) * i_951_) >> 8 & 0xff00ff) + (((i_957_ & 0xff00) * i_951_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
								} while (--i_904_ > 0);
							}
						} else {
							if (i_904_ > 0) {
								do {
									i_903_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
									f_908_ += f_909_;
									f_910_ += f_911_;
									f_912_ += f_913_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_958_ = is;
										int i_959_ = i;
										int i_960_ = i_903_;
										int i_961_ = is_958_[i_959_];
										int i_962_ = i_960_ + i_961_;
										int i_963_ = ((i_960_ & 0xff00ff) + (i_961_ & 0xff00ff));
										i_961_ = ((i_963_ & 0x1000100) + (i_962_ - i_963_ & 0x10000));
										is_958_[i_959_] = (~0xffffff | i_962_ - i_961_ | i_961_ - (i_961_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_964_ = is;
										int i_965_ = i;
										int i_966_ = i_903_;
										int i_967_ = is_964_[i_965_];
										int i_968_ = i_966_ + i_967_;
										int i_969_ = ((i_966_ & 0xff00ff) + (i_967_ & 0xff00ff));
										i_967_ = ((i_969_ & 0x1000100) + (i_968_ - i_969_ & 0x10000));
										is_964_[i_965_] = (~0xffffff | i_968_ - i_967_ | i_967_ - (i_967_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_970_ = is;
										int i_971_ = i;
										int i_972_ = i_903_;
										int i_973_ = is_970_[i_971_];
										int i_974_ = i_972_ + i_973_;
										int i_975_ = ((i_972_ & 0xff00ff) + (i_973_ & 0xff00ff));
										i_973_ = ((i_975_ & 0x1000100) + (i_974_ - i_975_ & 0x10000));
										is_970_[i_971_] = (~0xffffff | i_974_ - i_973_ | i_973_ - (i_973_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_976_ = is;
										int i_977_ = i;
										int i_978_ = i_903_;
										int i_979_ = is_976_[i_977_];
										int i_980_ = i_978_ + i_979_;
										int i_981_ = ((i_978_ & 0xff00ff) + (i_979_ & 0xff00ff));
										i_979_ = ((i_981_ & 0x1000100) + (i_980_ - i_981_ & 0x10000));
										is_976_[i_977_] = (~0xffffff | i_980_ - i_979_ | i_979_ - (i_979_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
								} while (--i_904_ > 0);
							}
							i_904_ = i_906_ - i_905_ & 0x3;
							if (i_904_ > 0) {
								i_903_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_982_ = is;
										int i_983_ = i;
										int i_984_ = i_903_;
										int i_985_ = is_982_[i_983_];
										int i_986_ = i_984_ + i_985_;
										int i_987_ = ((i_984_ & 0xff00ff) + (i_985_ & 0xff00ff));
										i_985_ = ((i_987_ & 0x1000100) + (i_986_ - i_987_ & 0x10000));
										is_982_[i_983_] = (~0xffffff | i_986_ - i_985_ | i_985_ - (i_985_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_907_;
								} while (--i_904_ > 0);
							}
						}
					} else {
						i_904_ = i_906_ - i_905_;
						if (anInt1441 == 0) {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									is[i] = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_907_;
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
							} while (--i_904_ > 0);
						} else if (!aBool1443) {
							int i_988_ = anInt1441;
							int i_989_ = 256 - anInt1441;
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
									i_903_ = (((i_903_ & 0xff00ff) * i_989_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_989_ >> 8 & 0xff00));
									int i_990_ = is[i];
									if (bool_902_)
										is[i] = ((i_989_ | i_990_ >> 24) << 24 | (i_903_ + (((i_990_ & 0xff00ff) * i_988_) >> 8 & 0xff00ff) + (((i_990_ & 0xff00) * i_988_) >> 8 & 0xff00)));
									else
										is[i] = (i_903_ + (((i_990_ & 0xff00ff) * i_988_ >> 8) & 0xff00ff) + (((i_990_ & 0xff00) * i_988_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_907_;
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
							} while (--i_904_ > 0);
						} else {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_991_ = is;
									int i_992_ = i;
									int i_993_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
									int i_994_ = is_991_[i_992_];
									int i_995_ = i_993_ + i_994_;
									int i_996_ = ((i_993_ & 0xff00ff) + (i_994_ & 0xff00ff));
									i_994_ = ((i_996_ & 0x1000100) + (i_995_ - i_996_ & 0x10000));
									is_991_[i_992_] = (~0xffffff | i_995_ - i_994_ | i_994_ - (i_994_ >>> 8));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_907_;
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
							} while (--i_904_ > 0);
						}
					}
				} else if (aBool1467) {
					i_904_ = i_906_ - i_905_ >> 2;
					f_909_ *= 4.0F;
					f_911_ *= 4.0F;
					f_913_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_904_ > 0) {
							do {
								i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_903_;
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_903_;
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_903_;
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_903_;
								f += f_907_;
							} while (--i_904_ > 0);
						}
						i_904_ = i_906_ - i_905_ & 0x3;
						if (i_904_ > 0) {
							i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_903_;
								f += f_907_;
							} while (--i_904_ > 0);
						}
					} else if (!aBool1443) {
						int i_997_ = anInt1441;
						int i_998_ = 256 - anInt1441;
						if (i_904_ > 0) {
							do {
								i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
								i_903_ = (((i_903_ & 0xff00ff) * i_998_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_998_ >> 8 & 0xff00));
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_999_ = is[i];
									if (bool_902_)
										is[i] = ((i_998_ | i_999_ >> 24) << 24 | (i_903_ + (((i_999_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_999_ & 0xff00) * i_997_) >> 8 & 0xff00)));
									else
										is[i] = (i_903_ + (((i_999_ & 0xff00ff) * i_997_ >> 8) & 0xff00ff) + (((i_999_ & 0xff00) * i_997_ >> 8) & 0xff00));
								}
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1000_ = is[i];
									if (bool_902_)
										is[i] = ((i_998_ | i_1000_ >> 24) << 24 | (i_903_ + (((i_1000_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_1000_ & 0xff00) * i_997_) >> 8 & 0xff00)));
									else
										is[i] = (i_903_ + (((i_1000_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_1000_ & 0xff00) * i_997_ >> 8) & 0xff00));
								}
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1001_ = is[i];
									if (bool_902_)
										is[i] = ((i_998_ | i_1001_ >> 24) << 24 | (i_903_ + (((i_1001_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_1001_ & 0xff00) * i_997_) >> 8 & 0xff00)));
									else
										is[i] = (i_903_ + (((i_1001_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_1001_ & 0xff00) * i_997_ >> 8) & 0xff00));
								}
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1002_ = is[i];
									if (bool_902_)
										is[i] = ((i_998_ | i_1002_ >> 24) << 24 | (i_903_ + (((i_1002_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_1002_ & 0xff00) * i_997_) >> 8 & 0xff00)));
									else
										is[i] = (i_903_ + (((i_1002_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_1002_ & 0xff00) * i_997_ >> 8) & 0xff00));
								}
								f += f_907_;
							} while (--i_904_ > 0);
						}
						i_904_ = i_906_ - i_905_ & 0x3;
						if (i_904_ > 0) {
							i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							i_903_ = (((i_903_ & 0xff00ff) * i_998_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_998_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1003_ = is[i];
									if (bool_902_)
										is[i] = ((i_998_ | i_1003_ >> 24) << 24 | (i_903_ + (((i_1003_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_1003_ & 0xff00) * i_997_) >> 8 & 0xff00)));
									else
										is[i] = (i_903_ + (((i_1003_ & 0xff00ff) * i_997_) >> 8 & 0xff00ff) + (((i_1003_ & 0xff00) * i_997_ >> 8) & 0xff00));
								}
								f += f_907_;
							} while (--i_904_ > 0);
						}
					} else {
						if (i_904_ > 0) {
							do {
								i_903_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								f_908_ += f_909_;
								f_910_ += f_911_;
								f_912_ += f_913_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1004_ = is;
									int i_1005_ = i;
									int i_1006_ = i_903_;
									int i_1007_ = is_1004_[i_1005_];
									int i_1008_ = i_1006_ + i_1007_;
									int i_1009_ = ((i_1006_ & 0xff00ff) + (i_1007_ & 0xff00ff));
									i_1007_ = ((i_1009_ & 0x1000100) + (i_1008_ - i_1009_ & 0x10000));
									is_1004_[i_1005_] = (~0xffffff | i_1008_ - i_1007_ | i_1007_ - (i_1007_ >>> 8));
								}
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1010_ = is;
									int i_1011_ = i;
									int i_1012_ = i_903_;
									int i_1013_ = is_1010_[i_1011_];
									int i_1014_ = i_1012_ + i_1013_;
									int i_1015_ = ((i_1012_ & 0xff00ff) + (i_1013_ & 0xff00ff));
									i_1013_ = ((i_1015_ & 0x1000100) + (i_1014_ - i_1015_ & 0x10000));
									is_1010_[i_1011_] = (~0xffffff | i_1014_ - i_1013_ | i_1013_ - (i_1013_ >>> 8));
								}
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1016_ = is;
									int i_1017_ = i;
									int i_1018_ = i_903_;
									int i_1019_ = is_1016_[i_1017_];
									int i_1020_ = i_1018_ + i_1019_;
									int i_1021_ = ((i_1018_ & 0xff00ff) + (i_1019_ & 0xff00ff));
									i_1019_ = ((i_1021_ & 0x1000100) + (i_1020_ - i_1021_ & 0x10000));
									is_1016_[i_1017_] = (~0xffffff | i_1020_ - i_1019_ | i_1019_ - (i_1019_ >>> 8));
								}
								f += f_907_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1022_ = is;
									int i_1023_ = i;
									int i_1024_ = i_903_;
									int i_1025_ = is_1022_[i_1023_];
									int i_1026_ = i_1024_ + i_1025_;
									int i_1027_ = ((i_1024_ & 0xff00ff) + (i_1025_ & 0xff00ff));
									i_1025_ = ((i_1027_ & 0x1000100) + (i_1026_ - i_1027_ & 0x10000));
									is_1022_[i_1023_] = (~0xffffff | i_1026_ - i_1025_ | i_1025_ - (i_1025_ >>> 8));
								}
								f += f_907_;
							} while (--i_904_ > 0);
						}
						i_904_ = i_906_ - i_905_ & 0x3;
						if (i_904_ > 0) {
							i_903_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1028_ = is;
									int i_1029_ = i;
									int i_1030_ = i_903_;
									int i_1031_ = is_1028_[i_1029_];
									int i_1032_ = i_1030_ + i_1031_;
									int i_1033_ = ((i_1030_ & 0xff00ff) + (i_1031_ & 0xff00ff));
									i_1031_ = ((i_1033_ & 0x1000100) + (i_1032_ - i_1033_ & 0x10000));
									is_1028_[i_1029_] = (~0xffffff | i_1032_ - i_1031_ | i_1031_ - (i_1031_ >>> 8));
								}
								f += f_907_;
							} while (--i_904_ > 0);
						}
					}
				} else {
					i_904_ = i_906_ - i_905_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i])
								is[i] = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
							f += f_907_;
							f_908_ += f_909_;
							f_910_ += f_911_;
							f_912_ += f_913_;
						} while (--i_904_ > 0);
					} else if (!aBool1443) {
						int i_1034_ = anInt1441;
						int i_1035_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								i_903_ = ~0xffffff | ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								i_903_ = (((i_903_ & 0xff00ff) * i_1035_ >> 8 & 0xff00ff) + ((i_903_ & 0xff00) * i_1035_ >> 8 & 0xff00));
								int i_1036_ = is[i];
								if (bool_902_)
									is[i] = ((i_1035_ | i_1036_ >> 24) << 24 | (i_903_ + (((i_1036_ & 0xff00ff) * i_1034_) >> 8 & 0xff00ff) + (((i_1036_ & 0xff00) * i_1034_ >> 8) & 0xff00)));
								else
									is[i] = (i_903_ + (((i_1036_ & 0xff00ff) * i_1034_ >> 8) & 0xff00ff) + ((i_1036_ & 0xff00) * i_1034_ >> 8 & 0xff00));
							}
							f += f_907_;
							f_908_ += f_909_;
							f_910_ += f_911_;
							f_912_ += f_913_;
						} while (--i_904_ > 0);
					} else {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								int[] is_1037_ = is;
								int i_1038_ = i;
								int i_1039_ = ((int) f_908_ & 0xff0000 | (int) f_910_ & 0xff00 | (int) f_912_ & 0xff);
								int i_1040_ = is_1037_[i_1038_];
								int i_1041_ = i_1039_ + i_1040_;
								int i_1042_ = ((i_1039_ & 0xff00ff) + (i_1040_ & 0xff00ff));
								i_1040_ = ((i_1042_ & 0x1000100) + (i_1041_ - i_1042_ & 0x10000));
								is_1037_[i_1038_] = (~0xffffff | i_1041_ - i_1040_ | i_1040_ - (i_1040_ >>> 8));
							}
							f += f_907_;
							f_908_ += f_909_;
							f_910_ += f_911_;
							f_912_ += f_913_;
						} while (--i_904_ > 0);
					}
				}
			}
		}
	}

	final void method2100(boolean bool, boolean bool_1043_, int[] is, int i, int i_1044_, int i_1045_, int i_1046_, int i_1047_, float f, float f_1048_, float f_1049_, float f_1050_, float f_1051_, float f_1052_, float f_1053_, float f_1054_) {
		if (aBool1445) {
			if (i_1047_ > anInt1442)
				i_1047_ = anInt1442;
			if (i_1046_ < 0)
				i_1046_ = 0;
		}
		if (i_1046_ < i_1047_) {
			if (aBool1446) {
				i += i_1046_;
				f_1049_ += f_1050_ * (float) i_1046_;
				f_1051_ += f_1052_ * (float) i_1046_;
				f_1053_ += f_1054_ * (float) i_1046_;
				if (aBool1467) {
					i_1045_ = i_1047_ - i_1046_ >> 2;
					f_1050_ *= 4.0F;
					f_1052_ *= 4.0F;
					f_1054_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_1045_ > 0) {
							do {
								i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
								is[i++] = i_1044_;
								is[i++] = i_1044_;
								is[i++] = i_1044_;
								is[i++] = i_1044_;
							} while (--i_1045_ > 0);
						}
						i_1045_ = i_1047_ - i_1046_ & 0x3;
						if (i_1045_ > 0) {
							i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							do
								is[i++] = i_1044_;
							while (--i_1045_ > 0);
						}
					} else if (!aBool1443) {
						int i_1055_ = anInt1441;
						int i_1056_ = 256 - anInt1441;
						if (i_1045_ > 0) {
							do {
								i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
								i_1044_ = (((i_1044_ & 0xff00ff) * i_1056_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1056_ >> 8 & 0xff00));
								int i_1057_ = is[i];
								if (bool_1043_) {
									is[i++] = ((i_1056_ | i_1057_ >> 24) << 24 | (i_1044_ + (((i_1057_ & 0xff00ff) * i_1055_) >> 8 & 0xff00ff) + (((i_1057_ & 0xff00) * i_1055_ >> 8) & 0xff00)));
									i_1057_ = is[i];
									is[i++] = ((i_1056_ | i_1057_ >> 24) << 24 | (i_1044_ + (((i_1057_ & 0xff00ff) * i_1055_) >> 8 & 0xff00ff) + (((i_1057_ & 0xff00) * i_1055_ >> 8) & 0xff00)));
									i_1057_ = is[i];
									is[i++] = ((i_1056_ | i_1057_ >> 24) << 24 | (i_1044_ + (((i_1057_ & 0xff00ff) * i_1055_) >> 8 & 0xff00ff) + (((i_1057_ & 0xff00) * i_1055_ >> 8) & 0xff00)));
									i_1057_ = is[i];
									is[i++] = ((i_1056_ | i_1057_ >> 24) << 24 | (i_1044_ + (((i_1057_ & 0xff00ff) * i_1055_) >> 8 & 0xff00ff) + (((i_1057_ & 0xff00) * i_1055_ >> 8) & 0xff00)));
								} else {
									is[i++] = (i_1044_ + (((i_1057_ & 0xff00ff) * i_1055_ >> 8) & 0xff00ff) + ((i_1057_ & 0xff00) * i_1055_ >> 8 & 0xff00));
									i_1057_ = is[i];
									is[i++] = (i_1044_ + (((i_1057_ & 0xff00ff) * i_1055_ >> 8) & 0xff00ff) + ((i_1057_ & 0xff00) * i_1055_ >> 8 & 0xff00));
									i_1057_ = is[i];
									is[i++] = (i_1044_ + (((i_1057_ & 0xff00ff) * i_1055_ >> 8) & 0xff00ff) + ((i_1057_ & 0xff00) * i_1055_ >> 8 & 0xff00));
									i_1057_ = is[i];
									is[i++] = (i_1044_ + (((i_1057_ & 0xff00ff) * i_1055_ >> 8) & 0xff00ff) + ((i_1057_ & 0xff00) * i_1055_ >> 8 & 0xff00));
								}
							} while (--i_1045_ > 0);
						}
						i_1045_ = i_1047_ - i_1046_ & 0x3;
						if (i_1045_ > 0) {
							i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							i_1044_ = (((i_1044_ & 0xff00ff) * i_1056_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1056_ >> 8 & 0xff00));
							do {
								int i_1058_ = is[i];
								if (bool_1043_)
									is[i++] = ((i_1056_ | i_1058_ >> 24) << 24 | (i_1044_ + (((i_1058_ & 0xff00ff) * i_1055_) >> 8 & 0xff00ff) + (((i_1058_ & 0xff00) * i_1055_ >> 8) & 0xff00)));
								else
									is[i++] = (i_1044_ + (((i_1058_ & 0xff00ff) * i_1055_ >> 8) & 0xff00ff) + ((i_1058_ & 0xff00) * i_1055_ >> 8 & 0xff00));
							} while (--i_1045_ > 0);
						}
					} else {
						if (i_1045_ > 0) {
							do {
								i_1044_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
								int[] is_1059_ = is;
								int i_1060_ = i++;
								int i_1061_ = i_1044_;
								int i_1062_ = is_1059_[i_1060_];
								int i_1063_ = i_1061_ + i_1062_;
								int i_1064_ = ((i_1061_ & 0xff00ff) + (i_1062_ & 0xff00ff));
								i_1062_ = ((i_1064_ & 0x1000100) + (i_1063_ - i_1064_ & 0x10000));
								is_1059_[i_1060_] = (~0xffffff | i_1063_ - i_1062_ | i_1062_ - (i_1062_ >>> 8));
								int[] is_1065_ = is;
								i_1063_ = i++;
								i_1064_ = i_1044_;
								int i_1066_ = is_1065_[i_1063_];
								int i_1067_ = i_1064_ + i_1066_;
								int i_1068_ = ((i_1064_ & 0xff00ff) + (i_1066_ & 0xff00ff));
								i_1066_ = ((i_1068_ & 0x1000100) + (i_1067_ - i_1068_ & 0x10000));
								is_1065_[i_1063_] = (~0xffffff | i_1067_ - i_1066_ | i_1066_ - (i_1066_ >>> 8));
								int[] is_1069_ = is;
								i_1067_ = i++;
								i_1068_ = i_1044_;
								int i_1070_ = is_1069_[i_1067_];
								int i_1071_ = i_1068_ + i_1070_;
								int i_1072_ = ((i_1068_ & 0xff00ff) + (i_1070_ & 0xff00ff));
								i_1070_ = ((i_1072_ & 0x1000100) + (i_1071_ - i_1072_ & 0x10000));
								is_1069_[i_1067_] = (~0xffffff | i_1071_ - i_1070_ | i_1070_ - (i_1070_ >>> 8));
								int[] is_1073_ = is;
								i_1071_ = i++;
								i_1072_ = i_1044_;
								int i_1074_ = is_1073_[i_1071_];
								int i_1075_ = i_1072_ + i_1074_;
								int i_1076_ = ((i_1072_ & 0xff00ff) + (i_1074_ & 0xff00ff));
								i_1074_ = ((i_1076_ & 0x1000100) + (i_1075_ - i_1076_ & 0x10000));
								is_1073_[i_1071_] = (~0xffffff | i_1075_ - i_1074_ | i_1074_ - (i_1074_ >>> 8));
							} while (--i_1045_ > 0);
						}
						i_1045_ = i_1047_ - i_1046_ & 0x3;
						if (i_1045_ > 0) {
							i_1044_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							do {
								int[] is_1077_ = is;
								int i_1078_ = i++;
								int i_1079_ = i_1044_;
								int i_1080_ = is_1077_[i_1078_];
								int i_1081_ = i_1079_ + i_1080_;
								int i_1082_ = ((i_1079_ & 0xff00ff) + (i_1080_ & 0xff00ff));
								i_1080_ = ((i_1082_ & 0x1000100) + (i_1081_ - i_1082_ & 0x10000));
								is_1077_[i_1078_] = (~0xffffff | i_1081_ - i_1080_ | i_1080_ - (i_1080_ >>> 8));
							} while (--i_1045_ > 0);
						}
					}
				} else {
					i_1045_ = i_1047_ - i_1046_;
					if (anInt1441 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							f_1049_ += f_1050_;
							f_1051_ += f_1052_;
							f_1053_ += f_1054_;
						} while (--i_1045_ > 0);
					} else if (!aBool1443) {
						int i_1083_ = anInt1441;
						int i_1084_ = 256 - anInt1441;
						do {
							i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							f_1049_ += f_1050_;
							f_1051_ += f_1052_;
							f_1053_ += f_1054_;
							i_1044_ = (((i_1044_ & 0xff00ff) * i_1084_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1084_ >> 8 & 0xff00));
							int i_1085_ = is[i];
							if (bool_1043_)
								is[i++] = ((i_1084_ | i_1085_ >> 24) << 24 | (i_1044_ + (((i_1085_ & 0xff00ff) * i_1083_ >> 8) & 0xff00ff) + ((i_1085_ & 0xff00) * i_1083_ >> 8 & 0xff00)));
							else
								is[i++] = (i_1044_ + ((i_1085_ & 0xff00ff) * i_1083_ >> 8 & 0xff00ff) + ((i_1085_ & 0xff00) * i_1083_ >> 8 & 0xff00));
						} while (--i_1045_ > 0);
					} else {
						do {
							int[] is_1086_ = is;
							int i_1087_ = i++;
							int i_1088_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							int i_1089_ = is_1086_[i_1087_];
							int i_1090_ = i_1088_ + i_1089_;
							int i_1091_ = (i_1088_ & 0xff00ff) + (i_1089_ & 0xff00ff);
							i_1089_ = (i_1091_ & 0x1000100) + (i_1090_ - i_1091_ & 0x10000);
							is_1086_[i_1087_] = (~0xffffff | i_1090_ - i_1089_ | i_1089_ - (i_1089_ >>> 8));
							f_1049_ += f_1050_;
							f_1051_ += f_1052_;
							f_1053_ += f_1054_;
						} while (--i_1045_ > 0);
					}
				}
			} else {
				i += i_1046_ - 1;
				f += f_1048_ * (float) i_1046_;
				f_1049_ += f_1050_ * (float) i_1046_;
				f_1051_ += f_1052_ * (float) i_1046_;
				f_1053_ += f_1054_ * (float) i_1046_;
				if (aClass101_1457.aBool1227) {
					if (aBool1467) {
						i_1045_ = i_1047_ - i_1046_ >> 2;
						f_1050_ *= 4.0F;
						f_1052_ *= 4.0F;
						f_1054_ *= 4.0F;
						if (anInt1441 == 0) {
							if (i_1045_ > 0) {
								do {
									i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
									f_1049_ += f_1050_;
									f_1051_ += f_1052_;
									f_1053_ += f_1054_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1044_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1044_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1044_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1044_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
								} while (--i_1045_ > 0);
							}
							i_1045_ = i_1047_ - i_1046_ & 0x3;
							if (i_1045_ > 0) {
								i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1044_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
								} while (--i_1045_ > 0);
							}
						} else if (!aBool1443) {
							int i_1092_ = anInt1441;
							int i_1093_ = 256 - anInt1441;
							if (i_1045_ > 0) {
								do {
									i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
									f_1049_ += f_1050_;
									f_1051_ += f_1052_;
									f_1053_ += f_1054_;
									i_1044_ = (((i_1044_ & 0xff00ff) * i_1093_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1093_ >> 8 & 0xff00));
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1094_ = is[i];
										if (bool_1043_)
											is[i] = (((i_1093_ | i_1094_ >> 24) << 24) | (i_1044_ + (((i_1094_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1094_ & 0xff00) * i_1092_) >> 8 & 0xff00)));
										else
											is[i] = (i_1044_ + (((i_1094_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1094_ & 0xff00) * i_1092_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1095_ = is[i];
										if (bool_1043_)
											is[i] = (((i_1093_ | i_1095_ >> 24) << 24) | (i_1044_ + (((i_1095_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1095_ & 0xff00) * i_1092_) >> 8 & 0xff00)));
										else
											is[i] = (i_1044_ + (((i_1095_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1095_ & 0xff00) * i_1092_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1096_ = is[i];
										if (bool_1043_)
											is[i] = (((i_1093_ | i_1096_ >> 24) << 24) | (i_1044_ + (((i_1096_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1096_ & 0xff00) * i_1092_) >> 8 & 0xff00)));
										else
											is[i] = (i_1044_ + (((i_1096_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1096_ & 0xff00) * i_1092_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1097_ = is[i];
										if (bool_1043_)
											is[i] = (((i_1093_ | i_1097_ >> 24) << 24) | (i_1044_ + (((i_1097_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1097_ & 0xff00) * i_1092_) >> 8 & 0xff00)));
										else
											is[i] = (i_1044_ + (((i_1097_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1097_ & 0xff00) * i_1092_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
								} while (--i_1045_ > 0);
							}
							i_1045_ = i_1047_ - i_1046_ & 0x3;
							if (i_1045_ > 0) {
								i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								i_1044_ = (((i_1044_ & 0xff00ff) * i_1093_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1093_ >> 8 & 0xff00));
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1098_ = is[i];
										if (bool_1043_)
											is[i] = (((i_1093_ | i_1098_ >> 24) << 24) | (i_1044_ + (((i_1098_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1098_ & 0xff00) * i_1092_) >> 8 & 0xff00)));
										else
											is[i] = (i_1044_ + (((i_1098_ & 0xff00ff) * i_1092_) >> 8 & 0xff00ff) + (((i_1098_ & 0xff00) * i_1092_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
								} while (--i_1045_ > 0);
							}
						} else {
							if (i_1045_ > 0) {
								do {
									i_1044_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
									f_1049_ += f_1050_;
									f_1051_ += f_1052_;
									f_1053_ += f_1054_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1099_ = is;
										int i_1100_ = i;
										int i_1101_ = i_1044_;
										int i_1102_ = is_1099_[i_1100_];
										int i_1103_ = i_1101_ + i_1102_;
										int i_1104_ = ((i_1101_ & 0xff00ff) + (i_1102_ & 0xff00ff));
										i_1102_ = ((i_1104_ & 0x1000100) + (i_1103_ - i_1104_ & 0x10000));
										is_1099_[i_1100_] = (~0xffffff | i_1103_ - i_1102_ | i_1102_ - (i_1102_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1105_ = is;
										int i_1106_ = i;
										int i_1107_ = i_1044_;
										int i_1108_ = is_1105_[i_1106_];
										int i_1109_ = i_1107_ + i_1108_;
										int i_1110_ = ((i_1107_ & 0xff00ff) + (i_1108_ & 0xff00ff));
										i_1108_ = ((i_1110_ & 0x1000100) + (i_1109_ - i_1110_ & 0x10000));
										is_1105_[i_1106_] = (~0xffffff | i_1109_ - i_1108_ | i_1108_ - (i_1108_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1111_ = is;
										int i_1112_ = i;
										int i_1113_ = i_1044_;
										int i_1114_ = is_1111_[i_1112_];
										int i_1115_ = i_1113_ + i_1114_;
										int i_1116_ = ((i_1113_ & 0xff00ff) + (i_1114_ & 0xff00ff));
										i_1114_ = ((i_1116_ & 0x1000100) + (i_1115_ - i_1116_ & 0x10000));
										is_1111_[i_1112_] = (~0xffffff | i_1115_ - i_1114_ | i_1114_ - (i_1114_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1117_ = is;
										int i_1118_ = i;
										int i_1119_ = i_1044_;
										int i_1120_ = is_1117_[i_1118_];
										int i_1121_ = i_1119_ + i_1120_;
										int i_1122_ = ((i_1119_ & 0xff00ff) + (i_1120_ & 0xff00ff));
										i_1120_ = ((i_1122_ & 0x1000100) + (i_1121_ - i_1122_ & 0x10000));
										is_1117_[i_1118_] = (~0xffffff | i_1121_ - i_1120_ | i_1120_ - (i_1120_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
								} while (--i_1045_ > 0);
							}
							i_1045_ = i_1047_ - i_1046_ & 0x3;
							if (i_1045_ > 0) {
								i_1044_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1123_ = is;
										int i_1124_ = i;
										int i_1125_ = i_1044_;
										int i_1126_ = is_1123_[i_1124_];
										int i_1127_ = i_1125_ + i_1126_;
										int i_1128_ = ((i_1125_ & 0xff00ff) + (i_1126_ & 0xff00ff));
										i_1126_ = ((i_1128_ & 0x1000100) + (i_1127_ - i_1128_ & 0x10000));
										is_1123_[i_1124_] = (~0xffffff | i_1127_ - i_1126_ | i_1126_ - (i_1126_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1048_;
								} while (--i_1045_ > 0);
							}
						}
					} else {
						i_1045_ = i_1047_ - i_1046_;
						if (anInt1441 == 0) {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									is[i] = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1048_;
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
							} while (--i_1045_ > 0);
						} else if (!aBool1443) {
							int i_1129_ = anInt1441;
							int i_1130_ = 256 - anInt1441;
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
									i_1044_ = (((i_1044_ & 0xff00ff) * i_1130_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1130_ >> 8 & 0xff00));
									int i_1131_ = is[i];
									if (bool_1043_)
										is[i] = ((i_1130_ | i_1131_ >> 24) << 24 | (i_1044_ + (((i_1131_ & 0xff00ff) * i_1129_) >> 8 & 0xff00ff) + (((i_1131_ & 0xff00) * i_1129_) >> 8 & 0xff00)));
									else
										is[i] = (i_1044_ + (((i_1131_ & 0xff00ff) * i_1129_) >> 8 & 0xff00ff) + (((i_1131_ & 0xff00) * i_1129_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1048_;
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
							} while (--i_1045_ > 0);
						} else {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1132_ = is;
									int i_1133_ = i;
									int i_1134_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
									int i_1135_ = is_1132_[i_1133_];
									int i_1136_ = i_1134_ + i_1135_;
									int i_1137_ = ((i_1134_ & 0xff00ff) + (i_1135_ & 0xff00ff));
									i_1135_ = ((i_1137_ & 0x1000100) + (i_1136_ - i_1137_ & 0x10000));
									is_1132_[i_1133_] = (~0xffffff | i_1136_ - i_1135_ | i_1135_ - (i_1135_ >>> 8));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1048_;
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
							} while (--i_1045_ > 0);
						}
					}
				} else if (aBool1467) {
					i_1045_ = i_1047_ - i_1046_ >> 2;
					f_1050_ *= 4.0F;
					f_1052_ *= 4.0F;
					f_1054_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_1045_ > 0) {
							do {
								i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1044_;
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1044_;
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1044_;
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1044_;
								f += f_1048_;
							} while (--i_1045_ > 0);
						}
						i_1045_ = i_1047_ - i_1046_ & 0x3;
						if (i_1045_ > 0) {
							i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1044_;
								f += f_1048_;
							} while (--i_1045_ > 0);
						}
					} else if (!aBool1443) {
						int i_1138_ = anInt1441;
						int i_1139_ = 256 - anInt1441;
						if (i_1045_ > 0) {
							do {
								i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
								i_1044_ = (((i_1044_ & 0xff00ff) * i_1139_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1139_ >> 8 & 0xff00));
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1140_ = is[i];
									if (bool_1043_)
										is[i] = ((i_1139_ | i_1140_ >> 24) << 24 | (i_1044_ + (((i_1140_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1140_ & 0xff00) * i_1138_) >> 8 & 0xff00)));
									else
										is[i] = (i_1044_ + (((i_1140_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1140_ & 0xff00) * i_1138_ >> 8) & 0xff00));
								}
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1141_ = is[i];
									if (bool_1043_)
										is[i] = ((i_1139_ | i_1141_ >> 24) << 24 | (i_1044_ + (((i_1141_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1141_ & 0xff00) * i_1138_) >> 8 & 0xff00)));
									else
										is[i] = (i_1044_ + (((i_1141_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1141_ & 0xff00) * i_1138_ >> 8) & 0xff00));
								}
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1142_ = is[i];
									if (bool_1043_)
										is[i] = ((i_1139_ | i_1142_ >> 24) << 24 | (i_1044_ + (((i_1142_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1142_ & 0xff00) * i_1138_) >> 8 & 0xff00)));
									else
										is[i] = (i_1044_ + (((i_1142_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1142_ & 0xff00) * i_1138_ >> 8) & 0xff00));
								}
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1143_ = is[i];
									if (bool_1043_)
										is[i] = ((i_1139_ | i_1143_ >> 24) << 24 | (i_1044_ + (((i_1143_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1143_ & 0xff00) * i_1138_) >> 8 & 0xff00)));
									else
										is[i] = (i_1044_ + (((i_1143_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1143_ & 0xff00) * i_1138_ >> 8) & 0xff00));
								}
								f += f_1048_;
							} while (--i_1045_ > 0);
						}
						i_1045_ = i_1047_ - i_1046_ & 0x3;
						if (i_1045_ > 0) {
							i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							i_1044_ = (((i_1044_ & 0xff00ff) * i_1139_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1139_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1144_ = is[i];
									if (bool_1043_)
										is[i] = ((i_1139_ | i_1144_ >> 24) << 24 | (i_1044_ + (((i_1144_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1144_ & 0xff00) * i_1138_) >> 8 & 0xff00)));
									else
										is[i] = (i_1044_ + (((i_1144_ & 0xff00ff) * i_1138_) >> 8 & 0xff00ff) + (((i_1144_ & 0xff00) * i_1138_ >> 8) & 0xff00));
								}
								f += f_1048_;
							} while (--i_1045_ > 0);
						}
					} else {
						if (i_1045_ > 0) {
							do {
								i_1044_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								f_1049_ += f_1050_;
								f_1051_ += f_1052_;
								f_1053_ += f_1054_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1145_ = is;
									int i_1146_ = i;
									int i_1147_ = i_1044_;
									int i_1148_ = is_1145_[i_1146_];
									int i_1149_ = i_1147_ + i_1148_;
									int i_1150_ = ((i_1147_ & 0xff00ff) + (i_1148_ & 0xff00ff));
									i_1148_ = ((i_1150_ & 0x1000100) + (i_1149_ - i_1150_ & 0x10000));
									is_1145_[i_1146_] = (~0xffffff | i_1149_ - i_1148_ | i_1148_ - (i_1148_ >>> 8));
								}
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1151_ = is;
									int i_1152_ = i;
									int i_1153_ = i_1044_;
									int i_1154_ = is_1151_[i_1152_];
									int i_1155_ = i_1153_ + i_1154_;
									int i_1156_ = ((i_1153_ & 0xff00ff) + (i_1154_ & 0xff00ff));
									i_1154_ = ((i_1156_ & 0x1000100) + (i_1155_ - i_1156_ & 0x10000));
									is_1151_[i_1152_] = (~0xffffff | i_1155_ - i_1154_ | i_1154_ - (i_1154_ >>> 8));
								}
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1157_ = is;
									int i_1158_ = i;
									int i_1159_ = i_1044_;
									int i_1160_ = is_1157_[i_1158_];
									int i_1161_ = i_1159_ + i_1160_;
									int i_1162_ = ((i_1159_ & 0xff00ff) + (i_1160_ & 0xff00ff));
									i_1160_ = ((i_1162_ & 0x1000100) + (i_1161_ - i_1162_ & 0x10000));
									is_1157_[i_1158_] = (~0xffffff | i_1161_ - i_1160_ | i_1160_ - (i_1160_ >>> 8));
								}
								f += f_1048_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1163_ = is;
									int i_1164_ = i;
									int i_1165_ = i_1044_;
									int i_1166_ = is_1163_[i_1164_];
									int i_1167_ = i_1165_ + i_1166_;
									int i_1168_ = ((i_1165_ & 0xff00ff) + (i_1166_ & 0xff00ff));
									i_1166_ = ((i_1168_ & 0x1000100) + (i_1167_ - i_1168_ & 0x10000));
									is_1163_[i_1164_] = (~0xffffff | i_1167_ - i_1166_ | i_1166_ - (i_1166_ >>> 8));
								}
								f += f_1048_;
							} while (--i_1045_ > 0);
						}
						i_1045_ = i_1047_ - i_1046_ & 0x3;
						if (i_1045_ > 0) {
							i_1044_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1169_ = is;
									int i_1170_ = i;
									int i_1171_ = i_1044_;
									int i_1172_ = is_1169_[i_1170_];
									int i_1173_ = i_1171_ + i_1172_;
									int i_1174_ = ((i_1171_ & 0xff00ff) + (i_1172_ & 0xff00ff));
									i_1172_ = ((i_1174_ & 0x1000100) + (i_1173_ - i_1174_ & 0x10000));
									is_1169_[i_1170_] = (~0xffffff | i_1173_ - i_1172_ | i_1172_ - (i_1172_ >>> 8));
								}
								f += f_1048_;
							} while (--i_1045_ > 0);
						}
					}
				} else {
					i_1045_ = i_1047_ - i_1046_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i])
								is[i] = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
							f += f_1048_;
							f_1049_ += f_1050_;
							f_1051_ += f_1052_;
							f_1053_ += f_1054_;
						} while (--i_1045_ > 0);
					} else if (!aBool1443) {
						int i_1175_ = anInt1441;
						int i_1176_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								i_1044_ = ~0xffffff | ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								i_1044_ = (((i_1044_ & 0xff00ff) * i_1176_ >> 8 & 0xff00ff) + ((i_1044_ & 0xff00) * i_1176_ >> 8 & 0xff00));
								int i_1177_ = is[i];
								if (bool_1043_)
									is[i] = ((i_1176_ | i_1177_ >> 24) << 24 | (i_1044_ + (((i_1177_ & 0xff00ff) * i_1175_) >> 8 & 0xff00ff) + (((i_1177_ & 0xff00) * i_1175_ >> 8) & 0xff00)));
								else
									is[i] = (i_1044_ + (((i_1177_ & 0xff00ff) * i_1175_ >> 8) & 0xff00ff) + ((i_1177_ & 0xff00) * i_1175_ >> 8 & 0xff00));
							}
							f += f_1048_;
							f_1049_ += f_1050_;
							f_1051_ += f_1052_;
							f_1053_ += f_1054_;
						} while (--i_1045_ > 0);
					} else {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								int[] is_1178_ = is;
								int i_1179_ = i;
								int i_1180_ = ((int) f_1049_ & 0xff0000 | (int) f_1051_ & 0xff00 | (int) f_1053_ & 0xff);
								int i_1181_ = is_1178_[i_1179_];
								int i_1182_ = i_1180_ + i_1181_;
								int i_1183_ = ((i_1180_ & 0xff00ff) + (i_1181_ & 0xff00ff));
								i_1181_ = ((i_1183_ & 0x1000100) + (i_1182_ - i_1183_ & 0x10000));
								is_1178_[i_1179_] = (~0xffffff | i_1182_ - i_1181_ | i_1181_ - (i_1181_ >>> 8));
							}
							f += f_1048_;
							f_1049_ += f_1050_;
							f_1051_ += f_1052_;
							f_1053_ += f_1054_;
						} while (--i_1045_ > 0);
					}
				}
			}
		}
	}

	final void method2101(boolean bool, boolean bool_1184_, int[] is, int i, int i_1185_, int i_1186_, int i_1187_, int i_1188_, float f, float f_1189_, float f_1190_, float f_1191_, float f_1192_, float f_1193_, float f_1194_, float f_1195_) {
		if (aBool1445) {
			if (i_1188_ > anInt1442)
				i_1188_ = anInt1442;
			if (i_1187_ < 0)
				i_1187_ = 0;
		}
		if (i_1187_ < i_1188_) {
			if (aBool1446) {
				i += i_1187_;
				f_1190_ += f_1191_ * (float) i_1187_;
				f_1192_ += f_1193_ * (float) i_1187_;
				f_1194_ += f_1195_ * (float) i_1187_;
				if (aBool1467) {
					i_1186_ = i_1188_ - i_1187_ >> 2;
					f_1191_ *= 4.0F;
					f_1193_ *= 4.0F;
					f_1195_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_1186_ > 0) {
							do {
								i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
								is[i++] = i_1185_;
								is[i++] = i_1185_;
								is[i++] = i_1185_;
								is[i++] = i_1185_;
							} while (--i_1186_ > 0);
						}
						i_1186_ = i_1188_ - i_1187_ & 0x3;
						if (i_1186_ > 0) {
							i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							do
								is[i++] = i_1185_;
							while (--i_1186_ > 0);
						}
					} else if (!aBool1443) {
						int i_1196_ = anInt1441;
						int i_1197_ = 256 - anInt1441;
						if (i_1186_ > 0) {
							do {
								i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
								i_1185_ = (((i_1185_ & 0xff00ff) * i_1197_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1197_ >> 8 & 0xff00));
								int i_1198_ = is[i];
								if (bool_1184_) {
									is[i++] = ((i_1197_ | i_1198_ >> 24) << 24 | (i_1185_ + (((i_1198_ & 0xff00ff) * i_1196_) >> 8 & 0xff00ff) + (((i_1198_ & 0xff00) * i_1196_ >> 8) & 0xff00)));
									i_1198_ = is[i];
									is[i++] = ((i_1197_ | i_1198_ >> 24) << 24 | (i_1185_ + (((i_1198_ & 0xff00ff) * i_1196_) >> 8 & 0xff00ff) + (((i_1198_ & 0xff00) * i_1196_ >> 8) & 0xff00)));
									i_1198_ = is[i];
									is[i++] = ((i_1197_ | i_1198_ >> 24) << 24 | (i_1185_ + (((i_1198_ & 0xff00ff) * i_1196_) >> 8 & 0xff00ff) + (((i_1198_ & 0xff00) * i_1196_ >> 8) & 0xff00)));
									i_1198_ = is[i];
									is[i++] = ((i_1197_ | i_1198_ >> 24) << 24 | (i_1185_ + (((i_1198_ & 0xff00ff) * i_1196_) >> 8 & 0xff00ff) + (((i_1198_ & 0xff00) * i_1196_ >> 8) & 0xff00)));
								} else {
									is[i++] = (i_1185_ + (((i_1198_ & 0xff00ff) * i_1196_ >> 8) & 0xff00ff) + ((i_1198_ & 0xff00) * i_1196_ >> 8 & 0xff00));
									i_1198_ = is[i];
									is[i++] = (i_1185_ + (((i_1198_ & 0xff00ff) * i_1196_ >> 8) & 0xff00ff) + ((i_1198_ & 0xff00) * i_1196_ >> 8 & 0xff00));
									i_1198_ = is[i];
									is[i++] = (i_1185_ + (((i_1198_ & 0xff00ff) * i_1196_ >> 8) & 0xff00ff) + ((i_1198_ & 0xff00) * i_1196_ >> 8 & 0xff00));
									i_1198_ = is[i];
									is[i++] = (i_1185_ + (((i_1198_ & 0xff00ff) * i_1196_ >> 8) & 0xff00ff) + ((i_1198_ & 0xff00) * i_1196_ >> 8 & 0xff00));
								}
							} while (--i_1186_ > 0);
						}
						i_1186_ = i_1188_ - i_1187_ & 0x3;
						if (i_1186_ > 0) {
							i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							i_1185_ = (((i_1185_ & 0xff00ff) * i_1197_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1197_ >> 8 & 0xff00));
							do {
								int i_1199_ = is[i];
								if (bool_1184_)
									is[i++] = ((i_1197_ | i_1199_ >> 24) << 24 | (i_1185_ + (((i_1199_ & 0xff00ff) * i_1196_) >> 8 & 0xff00ff) + (((i_1199_ & 0xff00) * i_1196_ >> 8) & 0xff00)));
								else
									is[i++] = (i_1185_ + (((i_1199_ & 0xff00ff) * i_1196_ >> 8) & 0xff00ff) + ((i_1199_ & 0xff00) * i_1196_ >> 8 & 0xff00));
							} while (--i_1186_ > 0);
						}
					} else {
						if (i_1186_ > 0) {
							do {
								i_1185_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
								int[] is_1200_ = is;
								int i_1201_ = i++;
								int i_1202_ = i_1185_;
								int i_1203_ = is_1200_[i_1201_];
								int i_1204_ = i_1202_ + i_1203_;
								int i_1205_ = ((i_1202_ & 0xff00ff) + (i_1203_ & 0xff00ff));
								i_1203_ = ((i_1205_ & 0x1000100) + (i_1204_ - i_1205_ & 0x10000));
								is_1200_[i_1201_] = (~0xffffff | i_1204_ - i_1203_ | i_1203_ - (i_1203_ >>> 8));
								int[] is_1206_ = is;
								i_1204_ = i++;
								i_1205_ = i_1185_;
								int i_1207_ = is_1206_[i_1204_];
								int i_1208_ = i_1205_ + i_1207_;
								int i_1209_ = ((i_1205_ & 0xff00ff) + (i_1207_ & 0xff00ff));
								i_1207_ = ((i_1209_ & 0x1000100) + (i_1208_ - i_1209_ & 0x10000));
								is_1206_[i_1204_] = (~0xffffff | i_1208_ - i_1207_ | i_1207_ - (i_1207_ >>> 8));
								int[] is_1210_ = is;
								i_1208_ = i++;
								i_1209_ = i_1185_;
								int i_1211_ = is_1210_[i_1208_];
								int i_1212_ = i_1209_ + i_1211_;
								int i_1213_ = ((i_1209_ & 0xff00ff) + (i_1211_ & 0xff00ff));
								i_1211_ = ((i_1213_ & 0x1000100) + (i_1212_ - i_1213_ & 0x10000));
								is_1210_[i_1208_] = (~0xffffff | i_1212_ - i_1211_ | i_1211_ - (i_1211_ >>> 8));
								int[] is_1214_ = is;
								i_1212_ = i++;
								i_1213_ = i_1185_;
								int i_1215_ = is_1214_[i_1212_];
								int i_1216_ = i_1213_ + i_1215_;
								int i_1217_ = ((i_1213_ & 0xff00ff) + (i_1215_ & 0xff00ff));
								i_1215_ = ((i_1217_ & 0x1000100) + (i_1216_ - i_1217_ & 0x10000));
								is_1214_[i_1212_] = (~0xffffff | i_1216_ - i_1215_ | i_1215_ - (i_1215_ >>> 8));
							} while (--i_1186_ > 0);
						}
						i_1186_ = i_1188_ - i_1187_ & 0x3;
						if (i_1186_ > 0) {
							i_1185_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							do {
								int[] is_1218_ = is;
								int i_1219_ = i++;
								int i_1220_ = i_1185_;
								int i_1221_ = is_1218_[i_1219_];
								int i_1222_ = i_1220_ + i_1221_;
								int i_1223_ = ((i_1220_ & 0xff00ff) + (i_1221_ & 0xff00ff));
								i_1221_ = ((i_1223_ & 0x1000100) + (i_1222_ - i_1223_ & 0x10000));
								is_1218_[i_1219_] = (~0xffffff | i_1222_ - i_1221_ | i_1221_ - (i_1221_ >>> 8));
							} while (--i_1186_ > 0);
						}
					}
				} else {
					i_1186_ = i_1188_ - i_1187_;
					if (anInt1441 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							f_1190_ += f_1191_;
							f_1192_ += f_1193_;
							f_1194_ += f_1195_;
						} while (--i_1186_ > 0);
					} else if (!aBool1443) {
						int i_1224_ = anInt1441;
						int i_1225_ = 256 - anInt1441;
						do {
							i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							f_1190_ += f_1191_;
							f_1192_ += f_1193_;
							f_1194_ += f_1195_;
							i_1185_ = (((i_1185_ & 0xff00ff) * i_1225_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1225_ >> 8 & 0xff00));
							int i_1226_ = is[i];
							if (bool_1184_)
								is[i++] = ((i_1225_ | i_1226_ >> 24) << 24 | (i_1185_ + (((i_1226_ & 0xff00ff) * i_1224_ >> 8) & 0xff00ff) + ((i_1226_ & 0xff00) * i_1224_ >> 8 & 0xff00)));
							else
								is[i++] = (i_1185_ + ((i_1226_ & 0xff00ff) * i_1224_ >> 8 & 0xff00ff) + ((i_1226_ & 0xff00) * i_1224_ >> 8 & 0xff00));
						} while (--i_1186_ > 0);
					} else {
						do {
							int[] is_1227_ = is;
							int i_1228_ = i++;
							int i_1229_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							int i_1230_ = is_1227_[i_1228_];
							int i_1231_ = i_1229_ + i_1230_;
							int i_1232_ = (i_1229_ & 0xff00ff) + (i_1230_ & 0xff00ff);
							i_1230_ = (i_1232_ & 0x1000100) + (i_1231_ - i_1232_ & 0x10000);
							is_1227_[i_1228_] = (~0xffffff | i_1231_ - i_1230_ | i_1230_ - (i_1230_ >>> 8));
							f_1190_ += f_1191_;
							f_1192_ += f_1193_;
							f_1194_ += f_1195_;
						} while (--i_1186_ > 0);
					}
				}
			} else {
				i += i_1187_ - 1;
				f += f_1189_ * (float) i_1187_;
				f_1190_ += f_1191_ * (float) i_1187_;
				f_1192_ += f_1193_ * (float) i_1187_;
				f_1194_ += f_1195_ * (float) i_1187_;
				if (aClass101_1457.aBool1227) {
					if (aBool1467) {
						i_1186_ = i_1188_ - i_1187_ >> 2;
						f_1191_ *= 4.0F;
						f_1193_ *= 4.0F;
						f_1195_ *= 4.0F;
						if (anInt1441 == 0) {
							if (i_1186_ > 0) {
								do {
									i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
									f_1190_ += f_1191_;
									f_1192_ += f_1193_;
									f_1194_ += f_1195_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1185_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1185_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1185_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1185_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
								} while (--i_1186_ > 0);
							}
							i_1186_ = i_1188_ - i_1187_ & 0x3;
							if (i_1186_ > 0) {
								i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1185_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
								} while (--i_1186_ > 0);
							}
						} else if (!aBool1443) {
							int i_1233_ = anInt1441;
							int i_1234_ = 256 - anInt1441;
							if (i_1186_ > 0) {
								do {
									i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
									f_1190_ += f_1191_;
									f_1192_ += f_1193_;
									f_1194_ += f_1195_;
									i_1185_ = (((i_1185_ & 0xff00ff) * i_1234_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1234_ >> 8 & 0xff00));
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1235_ = is[i];
										if (bool_1184_)
											is[i] = (((i_1234_ | i_1235_ >> 24) << 24) | (i_1185_ + (((i_1235_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1235_ & 0xff00) * i_1233_) >> 8 & 0xff00)));
										else
											is[i] = (i_1185_ + (((i_1235_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1235_ & 0xff00) * i_1233_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1236_ = is[i];
										if (bool_1184_)
											is[i] = (((i_1234_ | i_1236_ >> 24) << 24) | (i_1185_ + (((i_1236_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1236_ & 0xff00) * i_1233_) >> 8 & 0xff00)));
										else
											is[i] = (i_1185_ + (((i_1236_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1236_ & 0xff00) * i_1233_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1237_ = is[i];
										if (bool_1184_)
											is[i] = (((i_1234_ | i_1237_ >> 24) << 24) | (i_1185_ + (((i_1237_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1237_ & 0xff00) * i_1233_) >> 8 & 0xff00)));
										else
											is[i] = (i_1185_ + (((i_1237_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1237_ & 0xff00) * i_1233_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1238_ = is[i];
										if (bool_1184_)
											is[i] = (((i_1234_ | i_1238_ >> 24) << 24) | (i_1185_ + (((i_1238_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1238_ & 0xff00) * i_1233_) >> 8 & 0xff00)));
										else
											is[i] = (i_1185_ + (((i_1238_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1238_ & 0xff00) * i_1233_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
								} while (--i_1186_ > 0);
							}
							i_1186_ = i_1188_ - i_1187_ & 0x3;
							if (i_1186_ > 0) {
								i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								i_1185_ = (((i_1185_ & 0xff00ff) * i_1234_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1234_ >> 8 & 0xff00));
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1239_ = is[i];
										if (bool_1184_)
											is[i] = (((i_1234_ | i_1239_ >> 24) << 24) | (i_1185_ + (((i_1239_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1239_ & 0xff00) * i_1233_) >> 8 & 0xff00)));
										else
											is[i] = (i_1185_ + (((i_1239_ & 0xff00ff) * i_1233_) >> 8 & 0xff00ff) + (((i_1239_ & 0xff00) * i_1233_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
								} while (--i_1186_ > 0);
							}
						} else {
							if (i_1186_ > 0) {
								do {
									i_1185_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
									f_1190_ += f_1191_;
									f_1192_ += f_1193_;
									f_1194_ += f_1195_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1240_ = is;
										int i_1241_ = i;
										int i_1242_ = i_1185_;
										int i_1243_ = is_1240_[i_1241_];
										int i_1244_ = i_1242_ + i_1243_;
										int i_1245_ = ((i_1242_ & 0xff00ff) + (i_1243_ & 0xff00ff));
										i_1243_ = ((i_1245_ & 0x1000100) + (i_1244_ - i_1245_ & 0x10000));
										is_1240_[i_1241_] = (~0xffffff | i_1244_ - i_1243_ | i_1243_ - (i_1243_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1246_ = is;
										int i_1247_ = i;
										int i_1248_ = i_1185_;
										int i_1249_ = is_1246_[i_1247_];
										int i_1250_ = i_1248_ + i_1249_;
										int i_1251_ = ((i_1248_ & 0xff00ff) + (i_1249_ & 0xff00ff));
										i_1249_ = ((i_1251_ & 0x1000100) + (i_1250_ - i_1251_ & 0x10000));
										is_1246_[i_1247_] = (~0xffffff | i_1250_ - i_1249_ | i_1249_ - (i_1249_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1252_ = is;
										int i_1253_ = i;
										int i_1254_ = i_1185_;
										int i_1255_ = is_1252_[i_1253_];
										int i_1256_ = i_1254_ + i_1255_;
										int i_1257_ = ((i_1254_ & 0xff00ff) + (i_1255_ & 0xff00ff));
										i_1255_ = ((i_1257_ & 0x1000100) + (i_1256_ - i_1257_ & 0x10000));
										is_1252_[i_1253_] = (~0xffffff | i_1256_ - i_1255_ | i_1255_ - (i_1255_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1258_ = is;
										int i_1259_ = i;
										int i_1260_ = i_1185_;
										int i_1261_ = is_1258_[i_1259_];
										int i_1262_ = i_1260_ + i_1261_;
										int i_1263_ = ((i_1260_ & 0xff00ff) + (i_1261_ & 0xff00ff));
										i_1261_ = ((i_1263_ & 0x1000100) + (i_1262_ - i_1263_ & 0x10000));
										is_1258_[i_1259_] = (~0xffffff | i_1262_ - i_1261_ | i_1261_ - (i_1261_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
								} while (--i_1186_ > 0);
							}
							i_1186_ = i_1188_ - i_1187_ & 0x3;
							if (i_1186_ > 0) {
								i_1185_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1264_ = is;
										int i_1265_ = i;
										int i_1266_ = i_1185_;
										int i_1267_ = is_1264_[i_1265_];
										int i_1268_ = i_1266_ + i_1267_;
										int i_1269_ = ((i_1266_ & 0xff00ff) + (i_1267_ & 0xff00ff));
										i_1267_ = ((i_1269_ & 0x1000100) + (i_1268_ - i_1269_ & 0x10000));
										is_1264_[i_1265_] = (~0xffffff | i_1268_ - i_1267_ | i_1267_ - (i_1267_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1189_;
								} while (--i_1186_ > 0);
							}
						}
					} else {
						i_1186_ = i_1188_ - i_1187_;
						if (anInt1441 == 0) {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									is[i] = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1189_;
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
							} while (--i_1186_ > 0);
						} else if (!aBool1443) {
							int i_1270_ = anInt1441;
							int i_1271_ = 256 - anInt1441;
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
									i_1185_ = (((i_1185_ & 0xff00ff) * i_1271_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1271_ >> 8 & 0xff00));
									int i_1272_ = is[i];
									if (bool_1184_)
										is[i] = ((i_1271_ | i_1272_ >> 24) << 24 | (i_1185_ + (((i_1272_ & 0xff00ff) * i_1270_) >> 8 & 0xff00ff) + (((i_1272_ & 0xff00) * i_1270_) >> 8 & 0xff00)));
									else
										is[i] = (i_1185_ + (((i_1272_ & 0xff00ff) * i_1270_) >> 8 & 0xff00ff) + (((i_1272_ & 0xff00) * i_1270_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1189_;
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
							} while (--i_1186_ > 0);
						} else {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1273_ = is;
									int i_1274_ = i;
									int i_1275_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
									int i_1276_ = is_1273_[i_1274_];
									int i_1277_ = i_1275_ + i_1276_;
									int i_1278_ = ((i_1275_ & 0xff00ff) + (i_1276_ & 0xff00ff));
									i_1276_ = ((i_1278_ & 0x1000100) + (i_1277_ - i_1278_ & 0x10000));
									is_1273_[i_1274_] = (~0xffffff | i_1277_ - i_1276_ | i_1276_ - (i_1276_ >>> 8));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1189_;
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
							} while (--i_1186_ > 0);
						}
					}
				} else if (aBool1467) {
					i_1186_ = i_1188_ - i_1187_ >> 2;
					f_1191_ *= 4.0F;
					f_1193_ *= 4.0F;
					f_1195_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_1186_ > 0) {
							do {
								i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1185_;
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1185_;
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1185_;
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1185_;
								f += f_1189_;
							} while (--i_1186_ > 0);
						}
						i_1186_ = i_1188_ - i_1187_ & 0x3;
						if (i_1186_ > 0) {
							i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1185_;
								f += f_1189_;
							} while (--i_1186_ > 0);
						}
					} else if (!aBool1443) {
						int i_1279_ = anInt1441;
						int i_1280_ = 256 - anInt1441;
						if (i_1186_ > 0) {
							do {
								i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
								i_1185_ = (((i_1185_ & 0xff00ff) * i_1280_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1280_ >> 8 & 0xff00));
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1281_ = is[i];
									if (bool_1184_)
										is[i] = ((i_1280_ | i_1281_ >> 24) << 24 | (i_1185_ + (((i_1281_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1281_ & 0xff00) * i_1279_) >> 8 & 0xff00)));
									else
										is[i] = (i_1185_ + (((i_1281_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1281_ & 0xff00) * i_1279_ >> 8) & 0xff00));
								}
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1282_ = is[i];
									if (bool_1184_)
										is[i] = ((i_1280_ | i_1282_ >> 24) << 24 | (i_1185_ + (((i_1282_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1282_ & 0xff00) * i_1279_) >> 8 & 0xff00)));
									else
										is[i] = (i_1185_ + (((i_1282_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1282_ & 0xff00) * i_1279_ >> 8) & 0xff00));
								}
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1283_ = is[i];
									if (bool_1184_)
										is[i] = ((i_1280_ | i_1283_ >> 24) << 24 | (i_1185_ + (((i_1283_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1283_ & 0xff00) * i_1279_) >> 8 & 0xff00)));
									else
										is[i] = (i_1185_ + (((i_1283_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1283_ & 0xff00) * i_1279_ >> 8) & 0xff00));
								}
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1284_ = is[i];
									if (bool_1184_)
										is[i] = ((i_1280_ | i_1284_ >> 24) << 24 | (i_1185_ + (((i_1284_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1284_ & 0xff00) * i_1279_) >> 8 & 0xff00)));
									else
										is[i] = (i_1185_ + (((i_1284_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1284_ & 0xff00) * i_1279_ >> 8) & 0xff00));
								}
								f += f_1189_;
							} while (--i_1186_ > 0);
						}
						i_1186_ = i_1188_ - i_1187_ & 0x3;
						if (i_1186_ > 0) {
							i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							i_1185_ = (((i_1185_ & 0xff00ff) * i_1280_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1280_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1285_ = is[i];
									if (bool_1184_)
										is[i] = ((i_1280_ | i_1285_ >> 24) << 24 | (i_1185_ + (((i_1285_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1285_ & 0xff00) * i_1279_) >> 8 & 0xff00)));
									else
										is[i] = (i_1185_ + (((i_1285_ & 0xff00ff) * i_1279_) >> 8 & 0xff00ff) + (((i_1285_ & 0xff00) * i_1279_ >> 8) & 0xff00));
								}
								f += f_1189_;
							} while (--i_1186_ > 0);
						}
					} else {
						if (i_1186_ > 0) {
							do {
								i_1185_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								f_1190_ += f_1191_;
								f_1192_ += f_1193_;
								f_1194_ += f_1195_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1286_ = is;
									int i_1287_ = i;
									int i_1288_ = i_1185_;
									int i_1289_ = is_1286_[i_1287_];
									int i_1290_ = i_1288_ + i_1289_;
									int i_1291_ = ((i_1288_ & 0xff00ff) + (i_1289_ & 0xff00ff));
									i_1289_ = ((i_1291_ & 0x1000100) + (i_1290_ - i_1291_ & 0x10000));
									is_1286_[i_1287_] = (~0xffffff | i_1290_ - i_1289_ | i_1289_ - (i_1289_ >>> 8));
								}
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1292_ = is;
									int i_1293_ = i;
									int i_1294_ = i_1185_;
									int i_1295_ = is_1292_[i_1293_];
									int i_1296_ = i_1294_ + i_1295_;
									int i_1297_ = ((i_1294_ & 0xff00ff) + (i_1295_ & 0xff00ff));
									i_1295_ = ((i_1297_ & 0x1000100) + (i_1296_ - i_1297_ & 0x10000));
									is_1292_[i_1293_] = (~0xffffff | i_1296_ - i_1295_ | i_1295_ - (i_1295_ >>> 8));
								}
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1298_ = is;
									int i_1299_ = i;
									int i_1300_ = i_1185_;
									int i_1301_ = is_1298_[i_1299_];
									int i_1302_ = i_1300_ + i_1301_;
									int i_1303_ = ((i_1300_ & 0xff00ff) + (i_1301_ & 0xff00ff));
									i_1301_ = ((i_1303_ & 0x1000100) + (i_1302_ - i_1303_ & 0x10000));
									is_1298_[i_1299_] = (~0xffffff | i_1302_ - i_1301_ | i_1301_ - (i_1301_ >>> 8));
								}
								f += f_1189_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1304_ = is;
									int i_1305_ = i;
									int i_1306_ = i_1185_;
									int i_1307_ = is_1304_[i_1305_];
									int i_1308_ = i_1306_ + i_1307_;
									int i_1309_ = ((i_1306_ & 0xff00ff) + (i_1307_ & 0xff00ff));
									i_1307_ = ((i_1309_ & 0x1000100) + (i_1308_ - i_1309_ & 0x10000));
									is_1304_[i_1305_] = (~0xffffff | i_1308_ - i_1307_ | i_1307_ - (i_1307_ >>> 8));
								}
								f += f_1189_;
							} while (--i_1186_ > 0);
						}
						i_1186_ = i_1188_ - i_1187_ & 0x3;
						if (i_1186_ > 0) {
							i_1185_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1310_ = is;
									int i_1311_ = i;
									int i_1312_ = i_1185_;
									int i_1313_ = is_1310_[i_1311_];
									int i_1314_ = i_1312_ + i_1313_;
									int i_1315_ = ((i_1312_ & 0xff00ff) + (i_1313_ & 0xff00ff));
									i_1313_ = ((i_1315_ & 0x1000100) + (i_1314_ - i_1315_ & 0x10000));
									is_1310_[i_1311_] = (~0xffffff | i_1314_ - i_1313_ | i_1313_ - (i_1313_ >>> 8));
								}
								f += f_1189_;
							} while (--i_1186_ > 0);
						}
					}
				} else {
					i_1186_ = i_1188_ - i_1187_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i])
								is[i] = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
							f += f_1189_;
							f_1190_ += f_1191_;
							f_1192_ += f_1193_;
							f_1194_ += f_1195_;
						} while (--i_1186_ > 0);
					} else if (!aBool1443) {
						int i_1316_ = anInt1441;
						int i_1317_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								i_1185_ = ~0xffffff | ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								i_1185_ = (((i_1185_ & 0xff00ff) * i_1317_ >> 8 & 0xff00ff) + ((i_1185_ & 0xff00) * i_1317_ >> 8 & 0xff00));
								int i_1318_ = is[i];
								if (bool_1184_)
									is[i] = ((i_1317_ | i_1318_ >> 24) << 24 | (i_1185_ + (((i_1318_ & 0xff00ff) * i_1316_) >> 8 & 0xff00ff) + (((i_1318_ & 0xff00) * i_1316_ >> 8) & 0xff00)));
								else
									is[i] = (i_1185_ + (((i_1318_ & 0xff00ff) * i_1316_ >> 8) & 0xff00ff) + ((i_1318_ & 0xff00) * i_1316_ >> 8 & 0xff00));
							}
							f += f_1189_;
							f_1190_ += f_1191_;
							f_1192_ += f_1193_;
							f_1194_ += f_1195_;
						} while (--i_1186_ > 0);
					} else {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								int[] is_1319_ = is;
								int i_1320_ = i;
								int i_1321_ = ((int) f_1190_ & 0xff0000 | (int) f_1192_ & 0xff00 | (int) f_1194_ & 0xff);
								int i_1322_ = is_1319_[i_1320_];
								int i_1323_ = i_1321_ + i_1322_;
								int i_1324_ = ((i_1321_ & 0xff00ff) + (i_1322_ & 0xff00ff));
								i_1322_ = ((i_1324_ & 0x1000100) + (i_1323_ - i_1324_ & 0x10000));
								is_1319_[i_1320_] = (~0xffffff | i_1323_ - i_1322_ | i_1322_ - (i_1322_ >>> 8));
							}
							f += f_1189_;
							f_1190_ += f_1191_;
							f_1192_ += f_1193_;
							f_1194_ += f_1195_;
						} while (--i_1186_ > 0);
					}
				}
			}
		}
	}

	final void method2102(boolean bool, boolean bool_1325_, int[] is, int i, int i_1326_, int i_1327_, int i_1328_, int i_1329_, float f, float f_1330_, float f_1331_, float f_1332_, float f_1333_, float f_1334_, float f_1335_, float f_1336_) {
		if (aBool1445) {
			if (i_1329_ > anInt1442)
				i_1329_ = anInt1442;
			if (i_1328_ < 0)
				i_1328_ = 0;
		}
		if (i_1328_ < i_1329_) {
			if (aBool1446) {
				i += i_1328_;
				f_1331_ += f_1332_ * (float) i_1328_;
				f_1333_ += f_1334_ * (float) i_1328_;
				f_1335_ += f_1336_ * (float) i_1328_;
				if (aBool1467) {
					i_1327_ = i_1329_ - i_1328_ >> 2;
					f_1332_ *= 4.0F;
					f_1334_ *= 4.0F;
					f_1336_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_1327_ > 0) {
							do {
								i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
								is[i++] = i_1326_;
								is[i++] = i_1326_;
								is[i++] = i_1326_;
								is[i++] = i_1326_;
							} while (--i_1327_ > 0);
						}
						i_1327_ = i_1329_ - i_1328_ & 0x3;
						if (i_1327_ > 0) {
							i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							do
								is[i++] = i_1326_;
							while (--i_1327_ > 0);
						}
					} else if (!aBool1443) {
						int i_1337_ = anInt1441;
						int i_1338_ = 256 - anInt1441;
						if (i_1327_ > 0) {
							do {
								i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
								i_1326_ = (((i_1326_ & 0xff00ff) * i_1338_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1338_ >> 8 & 0xff00));
								int i_1339_ = is[i];
								if (bool_1325_) {
									is[i++] = ((i_1338_ | i_1339_ >> 24) << 24 | (i_1326_ + (((i_1339_ & 0xff00ff) * i_1337_) >> 8 & 0xff00ff) + (((i_1339_ & 0xff00) * i_1337_ >> 8) & 0xff00)));
									i_1339_ = is[i];
									is[i++] = ((i_1338_ | i_1339_ >> 24) << 24 | (i_1326_ + (((i_1339_ & 0xff00ff) * i_1337_) >> 8 & 0xff00ff) + (((i_1339_ & 0xff00) * i_1337_ >> 8) & 0xff00)));
									i_1339_ = is[i];
									is[i++] = ((i_1338_ | i_1339_ >> 24) << 24 | (i_1326_ + (((i_1339_ & 0xff00ff) * i_1337_) >> 8 & 0xff00ff) + (((i_1339_ & 0xff00) * i_1337_ >> 8) & 0xff00)));
									i_1339_ = is[i];
									is[i++] = ((i_1338_ | i_1339_ >> 24) << 24 | (i_1326_ + (((i_1339_ & 0xff00ff) * i_1337_) >> 8 & 0xff00ff) + (((i_1339_ & 0xff00) * i_1337_ >> 8) & 0xff00)));
								} else {
									is[i++] = (i_1326_ + (((i_1339_ & 0xff00ff) * i_1337_ >> 8) & 0xff00ff) + ((i_1339_ & 0xff00) * i_1337_ >> 8 & 0xff00));
									i_1339_ = is[i];
									is[i++] = (i_1326_ + (((i_1339_ & 0xff00ff) * i_1337_ >> 8) & 0xff00ff) + ((i_1339_ & 0xff00) * i_1337_ >> 8 & 0xff00));
									i_1339_ = is[i];
									is[i++] = (i_1326_ + (((i_1339_ & 0xff00ff) * i_1337_ >> 8) & 0xff00ff) + ((i_1339_ & 0xff00) * i_1337_ >> 8 & 0xff00));
									i_1339_ = is[i];
									is[i++] = (i_1326_ + (((i_1339_ & 0xff00ff) * i_1337_ >> 8) & 0xff00ff) + ((i_1339_ & 0xff00) * i_1337_ >> 8 & 0xff00));
								}
							} while (--i_1327_ > 0);
						}
						i_1327_ = i_1329_ - i_1328_ & 0x3;
						if (i_1327_ > 0) {
							i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							i_1326_ = (((i_1326_ & 0xff00ff) * i_1338_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1338_ >> 8 & 0xff00));
							do {
								int i_1340_ = is[i];
								if (bool_1325_)
									is[i++] = ((i_1338_ | i_1340_ >> 24) << 24 | (i_1326_ + (((i_1340_ & 0xff00ff) * i_1337_) >> 8 & 0xff00ff) + (((i_1340_ & 0xff00) * i_1337_ >> 8) & 0xff00)));
								else
									is[i++] = (i_1326_ + (((i_1340_ & 0xff00ff) * i_1337_ >> 8) & 0xff00ff) + ((i_1340_ & 0xff00) * i_1337_ >> 8 & 0xff00));
							} while (--i_1327_ > 0);
						}
					} else {
						if (i_1327_ > 0) {
							do {
								i_1326_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
								int[] is_1341_ = is;
								int i_1342_ = i++;
								int i_1343_ = i_1326_;
								int i_1344_ = is_1341_[i_1342_];
								int i_1345_ = i_1343_ + i_1344_;
								int i_1346_ = ((i_1343_ & 0xff00ff) + (i_1344_ & 0xff00ff));
								i_1344_ = ((i_1346_ & 0x1000100) + (i_1345_ - i_1346_ & 0x10000));
								is_1341_[i_1342_] = (~0xffffff | i_1345_ - i_1344_ | i_1344_ - (i_1344_ >>> 8));
								int[] is_1347_ = is;
								i_1345_ = i++;
								i_1346_ = i_1326_;
								int i_1348_ = is_1347_[i_1345_];
								int i_1349_ = i_1346_ + i_1348_;
								int i_1350_ = ((i_1346_ & 0xff00ff) + (i_1348_ & 0xff00ff));
								i_1348_ = ((i_1350_ & 0x1000100) + (i_1349_ - i_1350_ & 0x10000));
								is_1347_[i_1345_] = (~0xffffff | i_1349_ - i_1348_ | i_1348_ - (i_1348_ >>> 8));
								int[] is_1351_ = is;
								i_1349_ = i++;
								i_1350_ = i_1326_;
								int i_1352_ = is_1351_[i_1349_];
								int i_1353_ = i_1350_ + i_1352_;
								int i_1354_ = ((i_1350_ & 0xff00ff) + (i_1352_ & 0xff00ff));
								i_1352_ = ((i_1354_ & 0x1000100) + (i_1353_ - i_1354_ & 0x10000));
								is_1351_[i_1349_] = (~0xffffff | i_1353_ - i_1352_ | i_1352_ - (i_1352_ >>> 8));
								int[] is_1355_ = is;
								i_1353_ = i++;
								i_1354_ = i_1326_;
								int i_1356_ = is_1355_[i_1353_];
								int i_1357_ = i_1354_ + i_1356_;
								int i_1358_ = ((i_1354_ & 0xff00ff) + (i_1356_ & 0xff00ff));
								i_1356_ = ((i_1358_ & 0x1000100) + (i_1357_ - i_1358_ & 0x10000));
								is_1355_[i_1353_] = (~0xffffff | i_1357_ - i_1356_ | i_1356_ - (i_1356_ >>> 8));
							} while (--i_1327_ > 0);
						}
						i_1327_ = i_1329_ - i_1328_ & 0x3;
						if (i_1327_ > 0) {
							i_1326_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							do {
								int[] is_1359_ = is;
								int i_1360_ = i++;
								int i_1361_ = i_1326_;
								int i_1362_ = is_1359_[i_1360_];
								int i_1363_ = i_1361_ + i_1362_;
								int i_1364_ = ((i_1361_ & 0xff00ff) + (i_1362_ & 0xff00ff));
								i_1362_ = ((i_1364_ & 0x1000100) + (i_1363_ - i_1364_ & 0x10000));
								is_1359_[i_1360_] = (~0xffffff | i_1363_ - i_1362_ | i_1362_ - (i_1362_ >>> 8));
							} while (--i_1327_ > 0);
						}
					}
				} else {
					i_1327_ = i_1329_ - i_1328_;
					if (anInt1441 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							f_1331_ += f_1332_;
							f_1333_ += f_1334_;
							f_1335_ += f_1336_;
						} while (--i_1327_ > 0);
					} else if (!aBool1443) {
						int i_1365_ = anInt1441;
						int i_1366_ = 256 - anInt1441;
						do {
							i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							f_1331_ += f_1332_;
							f_1333_ += f_1334_;
							f_1335_ += f_1336_;
							i_1326_ = (((i_1326_ & 0xff00ff) * i_1366_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1366_ >> 8 & 0xff00));
							int i_1367_ = is[i];
							if (bool_1325_)
								is[i++] = ((i_1366_ | i_1367_ >> 24) << 24 | (i_1326_ + (((i_1367_ & 0xff00ff) * i_1365_ >> 8) & 0xff00ff) + ((i_1367_ & 0xff00) * i_1365_ >> 8 & 0xff00)));
							else
								is[i++] = (i_1326_ + ((i_1367_ & 0xff00ff) * i_1365_ >> 8 & 0xff00ff) + ((i_1367_ & 0xff00) * i_1365_ >> 8 & 0xff00));
						} while (--i_1327_ > 0);
					} else {
						do {
							int[] is_1368_ = is;
							int i_1369_ = i++;
							int i_1370_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							int i_1371_ = is_1368_[i_1369_];
							int i_1372_ = i_1370_ + i_1371_;
							int i_1373_ = (i_1370_ & 0xff00ff) + (i_1371_ & 0xff00ff);
							i_1371_ = (i_1373_ & 0x1000100) + (i_1372_ - i_1373_ & 0x10000);
							is_1368_[i_1369_] = (~0xffffff | i_1372_ - i_1371_ | i_1371_ - (i_1371_ >>> 8));
							f_1331_ += f_1332_;
							f_1333_ += f_1334_;
							f_1335_ += f_1336_;
						} while (--i_1327_ > 0);
					}
				}
			} else {
				i += i_1328_ - 1;
				f += f_1330_ * (float) i_1328_;
				f_1331_ += f_1332_ * (float) i_1328_;
				f_1333_ += f_1334_ * (float) i_1328_;
				f_1335_ += f_1336_ * (float) i_1328_;
				if (aClass101_1457.aBool1227) {
					if (aBool1467) {
						i_1327_ = i_1329_ - i_1328_ >> 2;
						f_1332_ *= 4.0F;
						f_1334_ *= 4.0F;
						f_1336_ *= 4.0F;
						if (anInt1441 == 0) {
							if (i_1327_ > 0) {
								do {
									i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
									f_1331_ += f_1332_;
									f_1333_ += f_1334_;
									f_1335_ += f_1336_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1326_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1326_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1326_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1326_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
								} while (--i_1327_ > 0);
							}
							i_1327_ = i_1329_ - i_1328_ & 0x3;
							if (i_1327_ > 0) {
								i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1326_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
								} while (--i_1327_ > 0);
							}
						} else if (!aBool1443) {
							int i_1374_ = anInt1441;
							int i_1375_ = 256 - anInt1441;
							if (i_1327_ > 0) {
								do {
									i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
									f_1331_ += f_1332_;
									f_1333_ += f_1334_;
									f_1335_ += f_1336_;
									i_1326_ = (((i_1326_ & 0xff00ff) * i_1375_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1375_ >> 8 & 0xff00));
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1376_ = is[i];
										if (bool_1325_)
											is[i] = (((i_1375_ | i_1376_ >> 24) << 24) | (i_1326_ + (((i_1376_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1376_ & 0xff00) * i_1374_) >> 8 & 0xff00)));
										else
											is[i] = (i_1326_ + (((i_1376_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1376_ & 0xff00) * i_1374_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1377_ = is[i];
										if (bool_1325_)
											is[i] = (((i_1375_ | i_1377_ >> 24) << 24) | (i_1326_ + (((i_1377_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1377_ & 0xff00) * i_1374_) >> 8 & 0xff00)));
										else
											is[i] = (i_1326_ + (((i_1377_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1377_ & 0xff00) * i_1374_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1378_ = is[i];
										if (bool_1325_)
											is[i] = (((i_1375_ | i_1378_ >> 24) << 24) | (i_1326_ + (((i_1378_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1378_ & 0xff00) * i_1374_) >> 8 & 0xff00)));
										else
											is[i] = (i_1326_ + (((i_1378_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1378_ & 0xff00) * i_1374_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1379_ = is[i];
										if (bool_1325_)
											is[i] = (((i_1375_ | i_1379_ >> 24) << 24) | (i_1326_ + (((i_1379_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1379_ & 0xff00) * i_1374_) >> 8 & 0xff00)));
										else
											is[i] = (i_1326_ + (((i_1379_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1379_ & 0xff00) * i_1374_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
								} while (--i_1327_ > 0);
							}
							i_1327_ = i_1329_ - i_1328_ & 0x3;
							if (i_1327_ > 0) {
								i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								i_1326_ = (((i_1326_ & 0xff00ff) * i_1375_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1375_ >> 8 & 0xff00));
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1380_ = is[i];
										if (bool_1325_)
											is[i] = (((i_1375_ | i_1380_ >> 24) << 24) | (i_1326_ + (((i_1380_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1380_ & 0xff00) * i_1374_) >> 8 & 0xff00)));
										else
											is[i] = (i_1326_ + (((i_1380_ & 0xff00ff) * i_1374_) >> 8 & 0xff00ff) + (((i_1380_ & 0xff00) * i_1374_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
								} while (--i_1327_ > 0);
							}
						} else {
							if (i_1327_ > 0) {
								do {
									i_1326_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
									f_1331_ += f_1332_;
									f_1333_ += f_1334_;
									f_1335_ += f_1336_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1381_ = is;
										int i_1382_ = i;
										int i_1383_ = i_1326_;
										int i_1384_ = is_1381_[i_1382_];
										int i_1385_ = i_1383_ + i_1384_;
										int i_1386_ = ((i_1383_ & 0xff00ff) + (i_1384_ & 0xff00ff));
										i_1384_ = ((i_1386_ & 0x1000100) + (i_1385_ - i_1386_ & 0x10000));
										is_1381_[i_1382_] = (~0xffffff | i_1385_ - i_1384_ | i_1384_ - (i_1384_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1387_ = is;
										int i_1388_ = i;
										int i_1389_ = i_1326_;
										int i_1390_ = is_1387_[i_1388_];
										int i_1391_ = i_1389_ + i_1390_;
										int i_1392_ = ((i_1389_ & 0xff00ff) + (i_1390_ & 0xff00ff));
										i_1390_ = ((i_1392_ & 0x1000100) + (i_1391_ - i_1392_ & 0x10000));
										is_1387_[i_1388_] = (~0xffffff | i_1391_ - i_1390_ | i_1390_ - (i_1390_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1393_ = is;
										int i_1394_ = i;
										int i_1395_ = i_1326_;
										int i_1396_ = is_1393_[i_1394_];
										int i_1397_ = i_1395_ + i_1396_;
										int i_1398_ = ((i_1395_ & 0xff00ff) + (i_1396_ & 0xff00ff));
										i_1396_ = ((i_1398_ & 0x1000100) + (i_1397_ - i_1398_ & 0x10000));
										is_1393_[i_1394_] = (~0xffffff | i_1397_ - i_1396_ | i_1396_ - (i_1396_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1399_ = is;
										int i_1400_ = i;
										int i_1401_ = i_1326_;
										int i_1402_ = is_1399_[i_1400_];
										int i_1403_ = i_1401_ + i_1402_;
										int i_1404_ = ((i_1401_ & 0xff00ff) + (i_1402_ & 0xff00ff));
										i_1402_ = ((i_1404_ & 0x1000100) + (i_1403_ - i_1404_ & 0x10000));
										is_1399_[i_1400_] = (~0xffffff | i_1403_ - i_1402_ | i_1402_ - (i_1402_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
								} while (--i_1327_ > 0);
							}
							i_1327_ = i_1329_ - i_1328_ & 0x3;
							if (i_1327_ > 0) {
								i_1326_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1405_ = is;
										int i_1406_ = i;
										int i_1407_ = i_1326_;
										int i_1408_ = is_1405_[i_1406_];
										int i_1409_ = i_1407_ + i_1408_;
										int i_1410_ = ((i_1407_ & 0xff00ff) + (i_1408_ & 0xff00ff));
										i_1408_ = ((i_1410_ & 0x1000100) + (i_1409_ - i_1410_ & 0x10000));
										is_1405_[i_1406_] = (~0xffffff | i_1409_ - i_1408_ | i_1408_ - (i_1408_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1330_;
								} while (--i_1327_ > 0);
							}
						}
					} else {
						i_1327_ = i_1329_ - i_1328_;
						if (anInt1441 == 0) {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									is[i] = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1330_;
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
							} while (--i_1327_ > 0);
						} else if (!aBool1443) {
							int i_1411_ = anInt1441;
							int i_1412_ = 256 - anInt1441;
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
									i_1326_ = (((i_1326_ & 0xff00ff) * i_1412_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1412_ >> 8 & 0xff00));
									int i_1413_ = is[i];
									if (bool_1325_)
										is[i] = ((i_1412_ | i_1413_ >> 24) << 24 | (i_1326_ + (((i_1413_ & 0xff00ff) * i_1411_) >> 8 & 0xff00ff) + (((i_1413_ & 0xff00) * i_1411_) >> 8 & 0xff00)));
									else
										is[i] = (i_1326_ + (((i_1413_ & 0xff00ff) * i_1411_) >> 8 & 0xff00ff) + (((i_1413_ & 0xff00) * i_1411_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1330_;
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
							} while (--i_1327_ > 0);
						} else {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1414_ = is;
									int i_1415_ = i;
									int i_1416_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
									int i_1417_ = is_1414_[i_1415_];
									int i_1418_ = i_1416_ + i_1417_;
									int i_1419_ = ((i_1416_ & 0xff00ff) + (i_1417_ & 0xff00ff));
									i_1417_ = ((i_1419_ & 0x1000100) + (i_1418_ - i_1419_ & 0x10000));
									is_1414_[i_1415_] = (~0xffffff | i_1418_ - i_1417_ | i_1417_ - (i_1417_ >>> 8));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1330_;
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
							} while (--i_1327_ > 0);
						}
					}
				} else if (aBool1467) {
					i_1327_ = i_1329_ - i_1328_ >> 2;
					f_1332_ *= 4.0F;
					f_1334_ *= 4.0F;
					f_1336_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_1327_ > 0) {
							do {
								i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1326_;
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1326_;
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1326_;
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1326_;
								f += f_1330_;
							} while (--i_1327_ > 0);
						}
						i_1327_ = i_1329_ - i_1328_ & 0x3;
						if (i_1327_ > 0) {
							i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1326_;
								f += f_1330_;
							} while (--i_1327_ > 0);
						}
					} else if (!aBool1443) {
						int i_1420_ = anInt1441;
						int i_1421_ = 256 - anInt1441;
						if (i_1327_ > 0) {
							do {
								i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
								i_1326_ = (((i_1326_ & 0xff00ff) * i_1421_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1421_ >> 8 & 0xff00));
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1422_ = is[i];
									if (bool_1325_)
										is[i] = ((i_1421_ | i_1422_ >> 24) << 24 | (i_1326_ + (((i_1422_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1422_ & 0xff00) * i_1420_) >> 8 & 0xff00)));
									else
										is[i] = (i_1326_ + (((i_1422_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1422_ & 0xff00) * i_1420_ >> 8) & 0xff00));
								}
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1423_ = is[i];
									if (bool_1325_)
										is[i] = ((i_1421_ | i_1423_ >> 24) << 24 | (i_1326_ + (((i_1423_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1423_ & 0xff00) * i_1420_) >> 8 & 0xff00)));
									else
										is[i] = (i_1326_ + (((i_1423_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1423_ & 0xff00) * i_1420_ >> 8) & 0xff00));
								}
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1424_ = is[i];
									if (bool_1325_)
										is[i] = ((i_1421_ | i_1424_ >> 24) << 24 | (i_1326_ + (((i_1424_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1424_ & 0xff00) * i_1420_) >> 8 & 0xff00)));
									else
										is[i] = (i_1326_ + (((i_1424_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1424_ & 0xff00) * i_1420_ >> 8) & 0xff00));
								}
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1425_ = is[i];
									if (bool_1325_)
										is[i] = ((i_1421_ | i_1425_ >> 24) << 24 | (i_1326_ + (((i_1425_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1425_ & 0xff00) * i_1420_) >> 8 & 0xff00)));
									else
										is[i] = (i_1326_ + (((i_1425_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1425_ & 0xff00) * i_1420_ >> 8) & 0xff00));
								}
								f += f_1330_;
							} while (--i_1327_ > 0);
						}
						i_1327_ = i_1329_ - i_1328_ & 0x3;
						if (i_1327_ > 0) {
							i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							i_1326_ = (((i_1326_ & 0xff00ff) * i_1421_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1421_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1426_ = is[i];
									if (bool_1325_)
										is[i] = ((i_1421_ | i_1426_ >> 24) << 24 | (i_1326_ + (((i_1426_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1426_ & 0xff00) * i_1420_) >> 8 & 0xff00)));
									else
										is[i] = (i_1326_ + (((i_1426_ & 0xff00ff) * i_1420_) >> 8 & 0xff00ff) + (((i_1426_ & 0xff00) * i_1420_ >> 8) & 0xff00));
								}
								f += f_1330_;
							} while (--i_1327_ > 0);
						}
					} else {
						if (i_1327_ > 0) {
							do {
								i_1326_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								f_1331_ += f_1332_;
								f_1333_ += f_1334_;
								f_1335_ += f_1336_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1427_ = is;
									int i_1428_ = i;
									int i_1429_ = i_1326_;
									int i_1430_ = is_1427_[i_1428_];
									int i_1431_ = i_1429_ + i_1430_;
									int i_1432_ = ((i_1429_ & 0xff00ff) + (i_1430_ & 0xff00ff));
									i_1430_ = ((i_1432_ & 0x1000100) + (i_1431_ - i_1432_ & 0x10000));
									is_1427_[i_1428_] = (~0xffffff | i_1431_ - i_1430_ | i_1430_ - (i_1430_ >>> 8));
								}
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1433_ = is;
									int i_1434_ = i;
									int i_1435_ = i_1326_;
									int i_1436_ = is_1433_[i_1434_];
									int i_1437_ = i_1435_ + i_1436_;
									int i_1438_ = ((i_1435_ & 0xff00ff) + (i_1436_ & 0xff00ff));
									i_1436_ = ((i_1438_ & 0x1000100) + (i_1437_ - i_1438_ & 0x10000));
									is_1433_[i_1434_] = (~0xffffff | i_1437_ - i_1436_ | i_1436_ - (i_1436_ >>> 8));
								}
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1439_ = is;
									int i_1440_ = i;
									int i_1441_ = i_1326_;
									int i_1442_ = is_1439_[i_1440_];
									int i_1443_ = i_1441_ + i_1442_;
									int i_1444_ = ((i_1441_ & 0xff00ff) + (i_1442_ & 0xff00ff));
									i_1442_ = ((i_1444_ & 0x1000100) + (i_1443_ - i_1444_ & 0x10000));
									is_1439_[i_1440_] = (~0xffffff | i_1443_ - i_1442_ | i_1442_ - (i_1442_ >>> 8));
								}
								f += f_1330_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1445_ = is;
									int i_1446_ = i;
									int i_1447_ = i_1326_;
									int i_1448_ = is_1445_[i_1446_];
									int i_1449_ = i_1447_ + i_1448_;
									int i_1450_ = ((i_1447_ & 0xff00ff) + (i_1448_ & 0xff00ff));
									i_1448_ = ((i_1450_ & 0x1000100) + (i_1449_ - i_1450_ & 0x10000));
									is_1445_[i_1446_] = (~0xffffff | i_1449_ - i_1448_ | i_1448_ - (i_1448_ >>> 8));
								}
								f += f_1330_;
							} while (--i_1327_ > 0);
						}
						i_1327_ = i_1329_ - i_1328_ & 0x3;
						if (i_1327_ > 0) {
							i_1326_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1451_ = is;
									int i_1452_ = i;
									int i_1453_ = i_1326_;
									int i_1454_ = is_1451_[i_1452_];
									int i_1455_ = i_1453_ + i_1454_;
									int i_1456_ = ((i_1453_ & 0xff00ff) + (i_1454_ & 0xff00ff));
									i_1454_ = ((i_1456_ & 0x1000100) + (i_1455_ - i_1456_ & 0x10000));
									is_1451_[i_1452_] = (~0xffffff | i_1455_ - i_1454_ | i_1454_ - (i_1454_ >>> 8));
								}
								f += f_1330_;
							} while (--i_1327_ > 0);
						}
					}
				} else {
					i_1327_ = i_1329_ - i_1328_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i])
								is[i] = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
							f += f_1330_;
							f_1331_ += f_1332_;
							f_1333_ += f_1334_;
							f_1335_ += f_1336_;
						} while (--i_1327_ > 0);
					} else if (!aBool1443) {
						int i_1457_ = anInt1441;
						int i_1458_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								i_1326_ = ~0xffffff | ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								i_1326_ = (((i_1326_ & 0xff00ff) * i_1458_ >> 8 & 0xff00ff) + ((i_1326_ & 0xff00) * i_1458_ >> 8 & 0xff00));
								int i_1459_ = is[i];
								if (bool_1325_)
									is[i] = ((i_1458_ | i_1459_ >> 24) << 24 | (i_1326_ + (((i_1459_ & 0xff00ff) * i_1457_) >> 8 & 0xff00ff) + (((i_1459_ & 0xff00) * i_1457_ >> 8) & 0xff00)));
								else
									is[i] = (i_1326_ + (((i_1459_ & 0xff00ff) * i_1457_ >> 8) & 0xff00ff) + ((i_1459_ & 0xff00) * i_1457_ >> 8 & 0xff00));
							}
							f += f_1330_;
							f_1331_ += f_1332_;
							f_1333_ += f_1334_;
							f_1335_ += f_1336_;
						} while (--i_1327_ > 0);
					} else {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								int[] is_1460_ = is;
								int i_1461_ = i;
								int i_1462_ = ((int) f_1331_ & 0xff0000 | (int) f_1333_ & 0xff00 | (int) f_1335_ & 0xff);
								int i_1463_ = is_1460_[i_1461_];
								int i_1464_ = i_1462_ + i_1463_;
								int i_1465_ = ((i_1462_ & 0xff00ff) + (i_1463_ & 0xff00ff));
								i_1463_ = ((i_1465_ & 0x1000100) + (i_1464_ - i_1465_ & 0x10000));
								is_1460_[i_1461_] = (~0xffffff | i_1464_ - i_1463_ | i_1463_ - (i_1463_ >>> 8));
							}
							f += f_1330_;
							f_1331_ += f_1332_;
							f_1333_ += f_1334_;
							f_1335_ += f_1336_;
						} while (--i_1327_ > 0);
					}
				}
			}
		}
	}

	final void method2103(boolean bool, boolean bool_1466_, int[] is, int i, int i_1467_, int i_1468_, int i_1469_, int i_1470_, float f, float f_1471_, float f_1472_, float f_1473_, float f_1474_, float f_1475_, float f_1476_, float f_1477_) {
		if (aBool1445) {
			if (i_1470_ > anInt1442)
				i_1470_ = anInt1442;
			if (i_1469_ < 0)
				i_1469_ = 0;
		}
		if (i_1469_ < i_1470_) {
			if (aBool1446) {
				i += i_1469_;
				f_1472_ += f_1473_ * (float) i_1469_;
				f_1474_ += f_1475_ * (float) i_1469_;
				f_1476_ += f_1477_ * (float) i_1469_;
				if (aBool1467) {
					i_1468_ = i_1470_ - i_1469_ >> 2;
					f_1473_ *= 4.0F;
					f_1475_ *= 4.0F;
					f_1477_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_1468_ > 0) {
							do {
								i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
								is[i++] = i_1467_;
								is[i++] = i_1467_;
								is[i++] = i_1467_;
								is[i++] = i_1467_;
							} while (--i_1468_ > 0);
						}
						i_1468_ = i_1470_ - i_1469_ & 0x3;
						if (i_1468_ > 0) {
							i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							do
								is[i++] = i_1467_;
							while (--i_1468_ > 0);
						}
					} else if (!aBool1443) {
						int i_1478_ = anInt1441;
						int i_1479_ = 256 - anInt1441;
						if (i_1468_ > 0) {
							do {
								i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
								i_1467_ = (((i_1467_ & 0xff00ff) * i_1479_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1479_ >> 8 & 0xff00));
								int i_1480_ = is[i];
								if (bool_1466_) {
									is[i++] = ((i_1479_ | i_1480_ >> 24) << 24 | (i_1467_ + (((i_1480_ & 0xff00ff) * i_1478_) >> 8 & 0xff00ff) + (((i_1480_ & 0xff00) * i_1478_ >> 8) & 0xff00)));
									i_1480_ = is[i];
									is[i++] = ((i_1479_ | i_1480_ >> 24) << 24 | (i_1467_ + (((i_1480_ & 0xff00ff) * i_1478_) >> 8 & 0xff00ff) + (((i_1480_ & 0xff00) * i_1478_ >> 8) & 0xff00)));
									i_1480_ = is[i];
									is[i++] = ((i_1479_ | i_1480_ >> 24) << 24 | (i_1467_ + (((i_1480_ & 0xff00ff) * i_1478_) >> 8 & 0xff00ff) + (((i_1480_ & 0xff00) * i_1478_ >> 8) & 0xff00)));
									i_1480_ = is[i];
									is[i++] = ((i_1479_ | i_1480_ >> 24) << 24 | (i_1467_ + (((i_1480_ & 0xff00ff) * i_1478_) >> 8 & 0xff00ff) + (((i_1480_ & 0xff00) * i_1478_ >> 8) & 0xff00)));
								} else {
									is[i++] = (i_1467_ + (((i_1480_ & 0xff00ff) * i_1478_ >> 8) & 0xff00ff) + ((i_1480_ & 0xff00) * i_1478_ >> 8 & 0xff00));
									i_1480_ = is[i];
									is[i++] = (i_1467_ + (((i_1480_ & 0xff00ff) * i_1478_ >> 8) & 0xff00ff) + ((i_1480_ & 0xff00) * i_1478_ >> 8 & 0xff00));
									i_1480_ = is[i];
									is[i++] = (i_1467_ + (((i_1480_ & 0xff00ff) * i_1478_ >> 8) & 0xff00ff) + ((i_1480_ & 0xff00) * i_1478_ >> 8 & 0xff00));
									i_1480_ = is[i];
									is[i++] = (i_1467_ + (((i_1480_ & 0xff00ff) * i_1478_ >> 8) & 0xff00ff) + ((i_1480_ & 0xff00) * i_1478_ >> 8 & 0xff00));
								}
							} while (--i_1468_ > 0);
						}
						i_1468_ = i_1470_ - i_1469_ & 0x3;
						if (i_1468_ > 0) {
							i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							i_1467_ = (((i_1467_ & 0xff00ff) * i_1479_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1479_ >> 8 & 0xff00));
							do {
								int i_1481_ = is[i];
								if (bool_1466_)
									is[i++] = ((i_1479_ | i_1481_ >> 24) << 24 | (i_1467_ + (((i_1481_ & 0xff00ff) * i_1478_) >> 8 & 0xff00ff) + (((i_1481_ & 0xff00) * i_1478_ >> 8) & 0xff00)));
								else
									is[i++] = (i_1467_ + (((i_1481_ & 0xff00ff) * i_1478_ >> 8) & 0xff00ff) + ((i_1481_ & 0xff00) * i_1478_ >> 8 & 0xff00));
							} while (--i_1468_ > 0);
						}
					} else {
						if (i_1468_ > 0) {
							do {
								i_1467_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
								int[] is_1482_ = is;
								int i_1483_ = i++;
								int i_1484_ = i_1467_;
								int i_1485_ = is_1482_[i_1483_];
								int i_1486_ = i_1484_ + i_1485_;
								int i_1487_ = ((i_1484_ & 0xff00ff) + (i_1485_ & 0xff00ff));
								i_1485_ = ((i_1487_ & 0x1000100) + (i_1486_ - i_1487_ & 0x10000));
								is_1482_[i_1483_] = (~0xffffff | i_1486_ - i_1485_ | i_1485_ - (i_1485_ >>> 8));
								int[] is_1488_ = is;
								i_1486_ = i++;
								i_1487_ = i_1467_;
								int i_1489_ = is_1488_[i_1486_];
								int i_1490_ = i_1487_ + i_1489_;
								int i_1491_ = ((i_1487_ & 0xff00ff) + (i_1489_ & 0xff00ff));
								i_1489_ = ((i_1491_ & 0x1000100) + (i_1490_ - i_1491_ & 0x10000));
								is_1488_[i_1486_] = (~0xffffff | i_1490_ - i_1489_ | i_1489_ - (i_1489_ >>> 8));
								int[] is_1492_ = is;
								i_1490_ = i++;
								i_1491_ = i_1467_;
								int i_1493_ = is_1492_[i_1490_];
								int i_1494_ = i_1491_ + i_1493_;
								int i_1495_ = ((i_1491_ & 0xff00ff) + (i_1493_ & 0xff00ff));
								i_1493_ = ((i_1495_ & 0x1000100) + (i_1494_ - i_1495_ & 0x10000));
								is_1492_[i_1490_] = (~0xffffff | i_1494_ - i_1493_ | i_1493_ - (i_1493_ >>> 8));
								int[] is_1496_ = is;
								i_1494_ = i++;
								i_1495_ = i_1467_;
								int i_1497_ = is_1496_[i_1494_];
								int i_1498_ = i_1495_ + i_1497_;
								int i_1499_ = ((i_1495_ & 0xff00ff) + (i_1497_ & 0xff00ff));
								i_1497_ = ((i_1499_ & 0x1000100) + (i_1498_ - i_1499_ & 0x10000));
								is_1496_[i_1494_] = (~0xffffff | i_1498_ - i_1497_ | i_1497_ - (i_1497_ >>> 8));
							} while (--i_1468_ > 0);
						}
						i_1468_ = i_1470_ - i_1469_ & 0x3;
						if (i_1468_ > 0) {
							i_1467_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							do {
								int[] is_1500_ = is;
								int i_1501_ = i++;
								int i_1502_ = i_1467_;
								int i_1503_ = is_1500_[i_1501_];
								int i_1504_ = i_1502_ + i_1503_;
								int i_1505_ = ((i_1502_ & 0xff00ff) + (i_1503_ & 0xff00ff));
								i_1503_ = ((i_1505_ & 0x1000100) + (i_1504_ - i_1505_ & 0x10000));
								is_1500_[i_1501_] = (~0xffffff | i_1504_ - i_1503_ | i_1503_ - (i_1503_ >>> 8));
							} while (--i_1468_ > 0);
						}
					}
				} else {
					i_1468_ = i_1470_ - i_1469_;
					if (anInt1441 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							f_1472_ += f_1473_;
							f_1474_ += f_1475_;
							f_1476_ += f_1477_;
						} while (--i_1468_ > 0);
					} else if (!aBool1443) {
						int i_1506_ = anInt1441;
						int i_1507_ = 256 - anInt1441;
						do {
							i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							f_1472_ += f_1473_;
							f_1474_ += f_1475_;
							f_1476_ += f_1477_;
							i_1467_ = (((i_1467_ & 0xff00ff) * i_1507_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1507_ >> 8 & 0xff00));
							int i_1508_ = is[i];
							if (bool_1466_)
								is[i++] = ((i_1507_ | i_1508_ >> 24) << 24 | (i_1467_ + (((i_1508_ & 0xff00ff) * i_1506_ >> 8) & 0xff00ff) + ((i_1508_ & 0xff00) * i_1506_ >> 8 & 0xff00)));
							else
								is[i++] = (i_1467_ + ((i_1508_ & 0xff00ff) * i_1506_ >> 8 & 0xff00ff) + ((i_1508_ & 0xff00) * i_1506_ >> 8 & 0xff00));
						} while (--i_1468_ > 0);
					} else {
						do {
							int[] is_1509_ = is;
							int i_1510_ = i++;
							int i_1511_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							int i_1512_ = is_1509_[i_1510_];
							int i_1513_ = i_1511_ + i_1512_;
							int i_1514_ = (i_1511_ & 0xff00ff) + (i_1512_ & 0xff00ff);
							i_1512_ = (i_1514_ & 0x1000100) + (i_1513_ - i_1514_ & 0x10000);
							is_1509_[i_1510_] = (~0xffffff | i_1513_ - i_1512_ | i_1512_ - (i_1512_ >>> 8));
							f_1472_ += f_1473_;
							f_1474_ += f_1475_;
							f_1476_ += f_1477_;
						} while (--i_1468_ > 0);
					}
				}
			} else {
				i += i_1469_ - 1;
				f += f_1471_ * (float) i_1469_;
				f_1472_ += f_1473_ * (float) i_1469_;
				f_1474_ += f_1475_ * (float) i_1469_;
				f_1476_ += f_1477_ * (float) i_1469_;
				if (aClass101_1457.aBool1227) {
					if (aBool1467) {
						i_1468_ = i_1470_ - i_1469_ >> 2;
						f_1473_ *= 4.0F;
						f_1475_ *= 4.0F;
						f_1477_ *= 4.0F;
						if (anInt1441 == 0) {
							if (i_1468_ > 0) {
								do {
									i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
									f_1472_ += f_1473_;
									f_1474_ += f_1475_;
									f_1476_ += f_1477_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1467_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1467_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1467_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1467_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
								} while (--i_1468_ > 0);
							}
							i_1468_ = i_1470_ - i_1469_ & 0x3;
							if (i_1468_ > 0) {
								i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										is[i] = i_1467_;
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
								} while (--i_1468_ > 0);
							}
						} else if (!aBool1443) {
							int i_1515_ = anInt1441;
							int i_1516_ = 256 - anInt1441;
							if (i_1468_ > 0) {
								do {
									i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
									f_1472_ += f_1473_;
									f_1474_ += f_1475_;
									f_1476_ += f_1477_;
									i_1467_ = (((i_1467_ & 0xff00ff) * i_1516_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1516_ >> 8 & 0xff00));
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1517_ = is[i];
										if (bool_1466_)
											is[i] = (((i_1516_ | i_1517_ >> 24) << 24) | (i_1467_ + (((i_1517_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1517_ & 0xff00) * i_1515_) >> 8 & 0xff00)));
										else
											is[i] = (i_1467_ + (((i_1517_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1517_ & 0xff00) * i_1515_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1518_ = is[i];
										if (bool_1466_)
											is[i] = (((i_1516_ | i_1518_ >> 24) << 24) | (i_1467_ + (((i_1518_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1518_ & 0xff00) * i_1515_) >> 8 & 0xff00)));
										else
											is[i] = (i_1467_ + (((i_1518_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1518_ & 0xff00) * i_1515_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1519_ = is[i];
										if (bool_1466_)
											is[i] = (((i_1516_ | i_1519_ >> 24) << 24) | (i_1467_ + (((i_1519_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1519_ & 0xff00) * i_1515_) >> 8 & 0xff00)));
										else
											is[i] = (i_1467_ + (((i_1519_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1519_ & 0xff00) * i_1515_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1520_ = is[i];
										if (bool_1466_)
											is[i] = (((i_1516_ | i_1520_ >> 24) << 24) | (i_1467_ + (((i_1520_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1520_ & 0xff00) * i_1515_) >> 8 & 0xff00)));
										else
											is[i] = (i_1467_ + (((i_1520_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1520_ & 0xff00) * i_1515_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
								} while (--i_1468_ > 0);
							}
							i_1468_ = i_1470_ - i_1469_ & 0x3;
							if (i_1468_ > 0) {
								i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								i_1467_ = (((i_1467_ & 0xff00ff) * i_1516_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1516_ >> 8 & 0xff00));
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int i_1521_ = is[i];
										if (bool_1466_)
											is[i] = (((i_1516_ | i_1521_ >> 24) << 24) | (i_1467_ + (((i_1521_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1521_ & 0xff00) * i_1515_) >> 8 & 0xff00)));
										else
											is[i] = (i_1467_ + (((i_1521_ & 0xff00ff) * i_1515_) >> 8 & 0xff00ff) + (((i_1521_ & 0xff00) * i_1515_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
								} while (--i_1468_ > 0);
							}
						} else {
							if (i_1468_ > 0) {
								do {
									i_1467_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
									f_1472_ += f_1473_;
									f_1474_ += f_1475_;
									f_1476_ += f_1477_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1522_ = is;
										int i_1523_ = i;
										int i_1524_ = i_1467_;
										int i_1525_ = is_1522_[i_1523_];
										int i_1526_ = i_1524_ + i_1525_;
										int i_1527_ = ((i_1524_ & 0xff00ff) + (i_1525_ & 0xff00ff));
										i_1525_ = ((i_1527_ & 0x1000100) + (i_1526_ - i_1527_ & 0x10000));
										is_1522_[i_1523_] = (~0xffffff | i_1526_ - i_1525_ | i_1525_ - (i_1525_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1528_ = is;
										int i_1529_ = i;
										int i_1530_ = i_1467_;
										int i_1531_ = is_1528_[i_1529_];
										int i_1532_ = i_1530_ + i_1531_;
										int i_1533_ = ((i_1530_ & 0xff00ff) + (i_1531_ & 0xff00ff));
										i_1531_ = ((i_1533_ & 0x1000100) + (i_1532_ - i_1533_ & 0x10000));
										is_1528_[i_1529_] = (~0xffffff | i_1532_ - i_1531_ | i_1531_ - (i_1531_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1534_ = is;
										int i_1535_ = i;
										int i_1536_ = i_1467_;
										int i_1537_ = is_1534_[i_1535_];
										int i_1538_ = i_1536_ + i_1537_;
										int i_1539_ = ((i_1536_ & 0xff00ff) + (i_1537_ & 0xff00ff));
										i_1537_ = ((i_1539_ & 0x1000100) + (i_1538_ - i_1539_ & 0x10000));
										is_1534_[i_1535_] = (~0xffffff | i_1538_ - i_1537_ | i_1537_ - (i_1537_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1540_ = is;
										int i_1541_ = i;
										int i_1542_ = i_1467_;
										int i_1543_ = is_1540_[i_1541_];
										int i_1544_ = i_1542_ + i_1543_;
										int i_1545_ = ((i_1542_ & 0xff00ff) + (i_1543_ & 0xff00ff));
										i_1543_ = ((i_1545_ & 0x1000100) + (i_1544_ - i_1545_ & 0x10000));
										is_1540_[i_1541_] = (~0xffffff | i_1544_ - i_1543_ | i_1543_ - (i_1543_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
								} while (--i_1468_ > 0);
							}
							i_1468_ = i_1470_ - i_1469_ & 0x3;
							if (i_1468_ > 0) {
								i_1467_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1460[i]) {
										int[] is_1546_ = is;
										int i_1547_ = i;
										int i_1548_ = i_1467_;
										int i_1549_ = is_1546_[i_1547_];
										int i_1550_ = i_1548_ + i_1549_;
										int i_1551_ = ((i_1548_ & 0xff00ff) + (i_1549_ & 0xff00ff));
										i_1549_ = ((i_1551_ & 0x1000100) + (i_1550_ - i_1551_ & 0x10000));
										is_1546_[i_1547_] = (~0xffffff | i_1550_ - i_1549_ | i_1549_ - (i_1549_ >>> 8));
										if (bool)
											aFloatArray1460[i] = f;
									}
									f += f_1471_;
								} while (--i_1468_ > 0);
							}
						}
					} else {
						i_1468_ = i_1470_ - i_1469_;
						if (anInt1441 == 0) {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									is[i] = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1471_;
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
							} while (--i_1468_ > 0);
						} else if (!aBool1443) {
							int i_1552_ = anInt1441;
							int i_1553_ = 256 - anInt1441;
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
									i_1467_ = (((i_1467_ & 0xff00ff) * i_1553_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1553_ >> 8 & 0xff00));
									int i_1554_ = is[i];
									if (bool_1466_)
										is[i] = ((i_1553_ | i_1554_ >> 24) << 24 | (i_1467_ + (((i_1554_ & 0xff00ff) * i_1552_) >> 8 & 0xff00ff) + (((i_1554_ & 0xff00) * i_1552_) >> 8 & 0xff00)));
									else
										is[i] = (i_1467_ + (((i_1554_ & 0xff00ff) * i_1552_) >> 8 & 0xff00ff) + (((i_1554_ & 0xff00) * i_1552_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1471_;
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
							} while (--i_1468_ > 0);
						} else {
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1555_ = is;
									int i_1556_ = i;
									int i_1557_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
									int i_1558_ = is_1555_[i_1556_];
									int i_1559_ = i_1557_ + i_1558_;
									int i_1560_ = ((i_1557_ & 0xff00ff) + (i_1558_ & 0xff00ff));
									i_1558_ = ((i_1560_ & 0x1000100) + (i_1559_ - i_1560_ & 0x10000));
									is_1555_[i_1556_] = (~0xffffff | i_1559_ - i_1558_ | i_1558_ - (i_1558_ >>> 8));
									if (bool)
										aFloatArray1460[i] = f;
								}
								f += f_1471_;
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
							} while (--i_1468_ > 0);
						}
					}
				} else if (aBool1467) {
					i_1468_ = i_1470_ - i_1469_ >> 2;
					f_1473_ *= 4.0F;
					f_1475_ *= 4.0F;
					f_1477_ *= 4.0F;
					if (anInt1441 == 0) {
						if (i_1468_ > 0) {
							do {
								i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1467_;
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1467_;
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1467_;
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1467_;
								f += f_1471_;
							} while (--i_1468_ > 0);
						}
						i_1468_ = i_1470_ - i_1469_ & 0x3;
						if (i_1468_ > 0) {
							i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i])
									is[i] = i_1467_;
								f += f_1471_;
							} while (--i_1468_ > 0);
						}
					} else if (!aBool1443) {
						int i_1561_ = anInt1441;
						int i_1562_ = 256 - anInt1441;
						if (i_1468_ > 0) {
							do {
								i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
								i_1467_ = (((i_1467_ & 0xff00ff) * i_1562_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1562_ >> 8 & 0xff00));
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1563_ = is[i];
									if (bool_1466_)
										is[i] = ((i_1562_ | i_1563_ >> 24) << 24 | (i_1467_ + (((i_1563_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1563_ & 0xff00) * i_1561_) >> 8 & 0xff00)));
									else
										is[i] = (i_1467_ + (((i_1563_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1563_ & 0xff00) * i_1561_ >> 8) & 0xff00));
								}
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1564_ = is[i];
									if (bool_1466_)
										is[i] = ((i_1562_ | i_1564_ >> 24) << 24 | (i_1467_ + (((i_1564_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1564_ & 0xff00) * i_1561_) >> 8 & 0xff00)));
									else
										is[i] = (i_1467_ + (((i_1564_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1564_ & 0xff00) * i_1561_ >> 8) & 0xff00));
								}
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1565_ = is[i];
									if (bool_1466_)
										is[i] = ((i_1562_ | i_1565_ >> 24) << 24 | (i_1467_ + (((i_1565_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1565_ & 0xff00) * i_1561_) >> 8 & 0xff00)));
									else
										is[i] = (i_1467_ + (((i_1565_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1565_ & 0xff00) * i_1561_ >> 8) & 0xff00));
								}
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1566_ = is[i];
									if (bool_1466_)
										is[i] = ((i_1562_ | i_1566_ >> 24) << 24 | (i_1467_ + (((i_1566_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1566_ & 0xff00) * i_1561_) >> 8 & 0xff00)));
									else
										is[i] = (i_1467_ + (((i_1566_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1566_ & 0xff00) * i_1561_ >> 8) & 0xff00));
								}
								f += f_1471_;
							} while (--i_1468_ > 0);
						}
						i_1468_ = i_1470_ - i_1469_ & 0x3;
						if (i_1468_ > 0) {
							i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							i_1467_ = (((i_1467_ & 0xff00ff) * i_1562_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1562_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int i_1567_ = is[i];
									if (bool_1466_)
										is[i] = ((i_1562_ | i_1567_ >> 24) << 24 | (i_1467_ + (((i_1567_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1567_ & 0xff00) * i_1561_) >> 8 & 0xff00)));
									else
										is[i] = (i_1467_ + (((i_1567_ & 0xff00ff) * i_1561_) >> 8 & 0xff00ff) + (((i_1567_ & 0xff00) * i_1561_ >> 8) & 0xff00));
								}
								f += f_1471_;
							} while (--i_1468_ > 0);
						}
					} else {
						if (i_1468_ > 0) {
							do {
								i_1467_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								f_1472_ += f_1473_;
								f_1474_ += f_1475_;
								f_1476_ += f_1477_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1568_ = is;
									int i_1569_ = i;
									int i_1570_ = i_1467_;
									int i_1571_ = is_1568_[i_1569_];
									int i_1572_ = i_1570_ + i_1571_;
									int i_1573_ = ((i_1570_ & 0xff00ff) + (i_1571_ & 0xff00ff));
									i_1571_ = ((i_1573_ & 0x1000100) + (i_1572_ - i_1573_ & 0x10000));
									is_1568_[i_1569_] = (~0xffffff | i_1572_ - i_1571_ | i_1571_ - (i_1571_ >>> 8));
								}
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1574_ = is;
									int i_1575_ = i;
									int i_1576_ = i_1467_;
									int i_1577_ = is_1574_[i_1575_];
									int i_1578_ = i_1576_ + i_1577_;
									int i_1579_ = ((i_1576_ & 0xff00ff) + (i_1577_ & 0xff00ff));
									i_1577_ = ((i_1579_ & 0x1000100) + (i_1578_ - i_1579_ & 0x10000));
									is_1574_[i_1575_] = (~0xffffff | i_1578_ - i_1577_ | i_1577_ - (i_1577_ >>> 8));
								}
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1580_ = is;
									int i_1581_ = i;
									int i_1582_ = i_1467_;
									int i_1583_ = is_1580_[i_1581_];
									int i_1584_ = i_1582_ + i_1583_;
									int i_1585_ = ((i_1582_ & 0xff00ff) + (i_1583_ & 0xff00ff));
									i_1583_ = ((i_1585_ & 0x1000100) + (i_1584_ - i_1585_ & 0x10000));
									is_1580_[i_1581_] = (~0xffffff | i_1584_ - i_1583_ | i_1583_ - (i_1583_ >>> 8));
								}
								f += f_1471_;
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1586_ = is;
									int i_1587_ = i;
									int i_1588_ = i_1467_;
									int i_1589_ = is_1586_[i_1587_];
									int i_1590_ = i_1588_ + i_1589_;
									int i_1591_ = ((i_1588_ & 0xff00ff) + (i_1589_ & 0xff00ff));
									i_1589_ = ((i_1591_ & 0x1000100) + (i_1590_ - i_1591_ & 0x10000));
									is_1586_[i_1587_] = (~0xffffff | i_1590_ - i_1589_ | i_1589_ - (i_1589_ >>> 8));
								}
								f += f_1471_;
							} while (--i_1468_ > 0);
						}
						i_1468_ = i_1470_ - i_1469_ & 0x3;
						if (i_1468_ > 0) {
							i_1467_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1460[i]) {
									int[] is_1592_ = is;
									int i_1593_ = i;
									int i_1594_ = i_1467_;
									int i_1595_ = is_1592_[i_1593_];
									int i_1596_ = i_1594_ + i_1595_;
									int i_1597_ = ((i_1594_ & 0xff00ff) + (i_1595_ & 0xff00ff));
									i_1595_ = ((i_1597_ & 0x1000100) + (i_1596_ - i_1597_ & 0x10000));
									is_1592_[i_1593_] = (~0xffffff | i_1596_ - i_1595_ | i_1595_ - (i_1595_ >>> 8));
								}
								f += f_1471_;
							} while (--i_1468_ > 0);
						}
					}
				} else {
					i_1468_ = i_1470_ - i_1469_;
					if (anInt1441 == 0) {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i])
								is[i] = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
							f += f_1471_;
							f_1472_ += f_1473_;
							f_1474_ += f_1475_;
							f_1476_ += f_1477_;
						} while (--i_1468_ > 0);
					} else if (!aBool1443) {
						int i_1598_ = anInt1441;
						int i_1599_ = 256 - anInt1441;
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								i_1467_ = ~0xffffff | ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								i_1467_ = (((i_1467_ & 0xff00ff) * i_1599_ >> 8 & 0xff00ff) + ((i_1467_ & 0xff00) * i_1599_ >> 8 & 0xff00));
								int i_1600_ = is[i];
								if (bool_1466_)
									is[i] = ((i_1599_ | i_1600_ >> 24) << 24 | (i_1467_ + (((i_1600_ & 0xff00ff) * i_1598_) >> 8 & 0xff00ff) + (((i_1600_ & 0xff00) * i_1598_ >> 8) & 0xff00)));
								else
									is[i] = (i_1467_ + (((i_1600_ & 0xff00ff) * i_1598_ >> 8) & 0xff00ff) + ((i_1600_ & 0xff00) * i_1598_ >> 8 & 0xff00));
							}
							f += f_1471_;
							f_1472_ += f_1473_;
							f_1474_ += f_1475_;
							f_1476_ += f_1477_;
						} while (--i_1468_ > 0);
					} else {
						do {
							i++;
							if (!bool || f < aFloatArray1460[i]) {
								int[] is_1601_ = is;
								int i_1602_ = i;
								int i_1603_ = ((int) f_1472_ & 0xff0000 | (int) f_1474_ & 0xff00 | (int) f_1476_ & 0xff);
								int i_1604_ = is_1601_[i_1602_];
								int i_1605_ = i_1603_ + i_1604_;
								int i_1606_ = ((i_1603_ & 0xff00ff) + (i_1604_ & 0xff00ff));
								i_1604_ = ((i_1606_ & 0x1000100) + (i_1605_ - i_1606_ & 0x10000));
								is_1601_[i_1602_] = (~0xffffff | i_1605_ - i_1604_ | i_1604_ - (i_1604_ >>> 8));
							}
							f += f_1471_;
							f_1472_ += f_1473_;
							f_1474_ += f_1475_;
							f_1476_ += f_1477_;
						} while (--i_1468_ > 0);
					}
				}
			}
		}
	}

	final void method2104(boolean bool, boolean bool_1607_, boolean bool_1608_, float f, float f_1609_, float f_1610_, float f_1611_, float f_1612_, float f_1613_, float f_1614_, float f_1615_, float f_1616_, int i) {
		if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_1611_, (int) f, (int) f_1612_, (int) f_1609_, i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_1612_, (int) f_1609_, (int) f_1613_, (int) f_1610_, i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_1613_, (int) f_1610_, (int) f_1611_, (int) f, i, (byte) 1);
		} else {
			float f_1617_ = f_1612_ - f_1611_;
			float f_1618_ = f_1609_ - f;
			float f_1619_ = f_1613_ - f_1611_;
			float f_1620_ = f_1610_ - f;
			float f_1621_ = f_1615_ - f_1614_;
			float f_1622_ = f_1616_ - f_1614_;
			float f_1623_ = 0.0F;
			if (f_1609_ != f)
				f_1623_ = (f_1612_ - f_1611_) / (f_1609_ - f);
			float f_1624_ = 0.0F;
			if (f_1610_ != f_1609_)
				f_1624_ = (f_1613_ - f_1612_) / (f_1610_ - f_1609_);
			float f_1625_ = 0.0F;
			if (f_1610_ != f)
				f_1625_ = (f_1611_ - f_1613_) / (f - f_1610_);
			float f_1626_ = f_1617_ * f_1620_ - f_1619_ * f_1618_;
			if (f_1626_ != 0.0F) {
				float f_1627_ = (f_1621_ * f_1620_ - f_1622_ * f_1618_) / f_1626_;
				float f_1628_ = (f_1622_ * f_1617_ - f_1621_ * f_1619_) / f_1626_;
				if (f <= f_1609_ && f <= f_1610_) {
					if (!(f >= (float) anInt1450)) {
						if (f_1609_ > (float) anInt1450)
							f_1609_ = (float) anInt1450;
						if (f_1610_ > (float) anInt1450)
							f_1610_ = (float) anInt1450;
						f_1614_ = f_1614_ - f_1627_ * f_1611_ + f_1627_;
						if (f_1609_ < f_1610_) {
							f_1613_ = f_1611_;
							if (f < 0.0F) {
								f_1613_ -= f_1625_ * f;
								f_1611_ -= f_1623_ * f;
								f_1614_ -= f_1628_ * f;
								f = 0.0F;
							}
							if (f_1609_ < 0.0F) {
								f_1612_ -= f_1624_ * f_1609_;
								f_1609_ = 0.0F;
							}
							if (f != f_1609_ && f_1625_ < f_1623_ || f == f_1609_ && f_1625_ > f_1624_) {
								f += 0.5F;
								f_1609_ += 0.5F;
								f_1610_ = (float) (int) (f_1610_ + 0.5F) - f_1609_;
								f_1609_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_1609_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f, i, 0, (int) f_1613_, (int) f_1611_, f_1614_, f_1627_);
									f_1613_ += f_1625_;
									f_1611_ += f_1623_;
									f_1614_ += f_1628_;
									f += (float) anInt1458;
								}
								while (--f_1610_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f, i, 0, (int) f_1613_, (int) f_1612_, f_1614_, f_1627_);
									f_1613_ += f_1625_;
									f_1612_ += f_1624_;
									f_1614_ += f_1628_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_1609_ += 0.5F;
								f_1610_ = (float) (int) (f_1610_ + 0.5F) - f_1609_;
								f_1609_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_1609_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f, i, 0, (int) f_1611_, (int) f_1613_, f_1614_, f_1627_);
									f_1613_ += f_1625_;
									f_1611_ += f_1623_;
									f_1614_ += f_1628_;
									f += (float) anInt1458;
								}
								while (--f_1610_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f, i, 0, (int) f_1612_, (int) f_1613_, f_1614_, f_1627_);
									f_1613_ += f_1625_;
									f_1612_ += f_1624_;
									f_1614_ += f_1628_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_1612_ = f_1611_;
							if (f < 0.0F) {
								f_1612_ -= f_1625_ * f;
								f_1611_ -= f_1623_ * f;
								f_1614_ -= f_1628_ * f;
								f = 0.0F;
							}
							if (f_1610_ < 0.0F) {
								f_1613_ -= f_1624_ * f_1610_;
								f_1610_ = 0.0F;
							}
							if (f != f_1610_ && f_1625_ < f_1623_ || f == f_1610_ && f_1624_ > f_1623_) {
								f += 0.5F;
								f_1610_ += 0.5F;
								f_1609_ = (float) (int) (f_1609_ + 0.5F) - f_1610_;
								f_1610_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_1610_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f, i, 0, (int) f_1612_, (int) f_1611_, f_1614_, f_1627_);
									f_1612_ += f_1625_;
									f_1611_ += f_1623_;
									f_1614_ += f_1628_;
									f += (float) anInt1458;
								}
								while (--f_1609_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f, i, 0, (int) f_1613_, (int) f_1611_, f_1614_, f_1627_);
									f_1613_ += f_1624_;
									f_1611_ += f_1623_;
									f_1614_ += f_1628_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_1610_ += 0.5F;
								f_1609_ = (float) (int) (f_1609_ + 0.5F) - f_1610_;
								f_1610_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_1610_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f, i, 0, (int) f_1611_, (int) f_1612_, f_1614_, f_1627_);
									f_1612_ += f_1625_;
									f_1611_ += f_1623_;
									f_1614_ += f_1628_;
									f += (float) anInt1458;
								}
								while (--f_1609_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f, i, 0, (int) f_1611_, (int) f_1613_, f_1614_, f_1627_);
									f_1613_ += f_1624_;
									f_1611_ += f_1623_;
									f_1614_ += f_1628_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_1609_ <= f_1610_) {
					if (!(f_1609_ >= (float) anInt1450)) {
						if (f_1610_ > (float) anInt1450)
							f_1610_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_1615_ = f_1615_ - f_1627_ * f_1612_ + f_1627_;
						if (f_1610_ < f) {
							f_1611_ = f_1612_;
							if (f_1609_ < 0.0F) {
								f_1611_ -= f_1623_ * f_1609_;
								f_1612_ -= f_1624_ * f_1609_;
								f_1615_ -= f_1628_ * f_1609_;
								f_1609_ = 0.0F;
							}
							if (f_1610_ < 0.0F) {
								f_1613_ -= f_1625_ * f_1610_;
								f_1610_ = 0.0F;
							}
							if (f_1609_ != f_1610_ && f_1623_ < f_1624_ || f_1609_ == f_1610_ && f_1623_ > f_1625_) {
								f_1609_ += 0.5F;
								f_1610_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_1610_;
								f_1610_ -= f_1609_;
								f_1609_ = (float) anIntArray1447[(int) f_1609_];
								while (--f_1610_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1609_, i, 0, (int) f_1611_, (int) f_1612_, f_1615_, f_1627_);
									f_1611_ += f_1623_;
									f_1612_ += f_1624_;
									f_1615_ += f_1628_;
									f_1609_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1609_, i, 0, (int) f_1611_, (int) f_1613_, f_1615_, f_1627_);
									f_1611_ += f_1623_;
									f_1613_ += f_1625_;
									f_1615_ += f_1628_;
									f_1609_ += (float) anInt1458;
								}
							} else {
								f_1609_ += 0.5F;
								f_1610_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_1610_;
								f_1610_ -= f_1609_;
								f_1609_ = (float) anIntArray1447[(int) f_1609_];
								while (--f_1610_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1609_, i, 0, (int) f_1612_, (int) f_1611_, f_1615_, f_1627_);
									f_1611_ += f_1623_;
									f_1612_ += f_1624_;
									f_1615_ += f_1628_;
									f_1609_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1609_, i, 0, (int) f_1613_, (int) f_1611_, f_1615_, f_1627_);
									f_1611_ += f_1623_;
									f_1613_ += f_1625_;
									f_1615_ += f_1628_;
									f_1609_ += (float) anInt1458;
								}
							}
						} else {
							f_1613_ = f_1612_;
							if (f_1609_ < 0.0F) {
								f_1613_ -= f_1623_ * f_1609_;
								f_1612_ -= f_1624_ * f_1609_;
								f_1615_ -= f_1628_ * f_1609_;
								f_1609_ = 0.0F;
							}
							if (f < 0.0F) {
								f_1611_ -= f_1625_ * f;
								f = 0.0F;
							}
							if (f_1623_ < f_1624_) {
								f_1609_ += 0.5F;
								f += 0.5F;
								f_1610_ = (float) (int) (f_1610_ + 0.5F) - f;
								f -= f_1609_;
								f_1609_ = (float) anIntArray1447[(int) f_1609_];
								while (--f >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1609_, i, 0, (int) f_1613_, (int) f_1612_, f_1615_, f_1627_);
									f_1613_ += f_1623_;
									f_1612_ += f_1624_;
									f_1615_ += f_1628_;
									f_1609_ += (float) anInt1458;
								}
								while (--f_1610_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1609_, i, 0, (int) f_1611_, (int) f_1612_, f_1615_, f_1627_);
									f_1611_ += f_1625_;
									f_1612_ += f_1624_;
									f_1615_ += f_1628_;
									f_1609_ += (float) anInt1458;
								}
							} else {
								f_1609_ += 0.5F;
								f += 0.5F;
								f_1610_ = (float) (int) (f_1610_ + 0.5F) - f;
								f -= f_1609_;
								f_1609_ = (float) anIntArray1447[(int) f_1609_];
								while (--f >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1609_, i, 0, (int) f_1612_, (int) f_1613_, f_1615_, f_1627_);
									f_1613_ += f_1623_;
									f_1612_ += f_1624_;
									f_1615_ += f_1628_;
									f_1609_ += (float) anInt1458;
								}
								while (--f_1610_ >= 0.0F) {
									method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1609_, i, 0, (int) f_1612_, (int) f_1611_, f_1615_, f_1627_);
									f_1611_ += f_1625_;
									f_1612_ += f_1624_;
									f_1615_ += f_1628_;
									f_1609_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_1610_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_1609_ > (float) anInt1450)
						f_1609_ = (float) anInt1450;
					f_1616_ = f_1616_ - f_1627_ * f_1613_ + f_1627_;
					if (f < f_1609_) {
						f_1612_ = f_1613_;
						if (f_1610_ < 0.0F) {
							f_1612_ -= f_1624_ * f_1610_;
							f_1613_ -= f_1625_ * f_1610_;
							f_1616_ -= f_1628_ * f_1610_;
							f_1610_ = 0.0F;
						}
						if (f < 0.0F) {
							f_1611_ -= f_1623_ * f;
							f = 0.0F;
						}
						if (f_1624_ < f_1625_) {
							f_1610_ += 0.5F;
							f += 0.5F;
							f_1609_ = (float) (int) (f_1609_ + 0.5F) - f;
							f -= f_1610_;
							f_1610_ = (float) anIntArray1447[(int) f_1610_];
							while (--f >= 0.0F) {
								method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1610_, i, 0, (int) f_1612_, (int) f_1613_, f_1616_, f_1627_);
								f_1612_ += f_1624_;
								f_1613_ += f_1625_;
								f_1616_ += f_1628_;
								f_1610_ += (float) anInt1458;
							}
							while (--f_1609_ >= 0.0F) {
								method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1610_, i, 0, (int) f_1612_, (int) f_1611_, f_1616_, f_1627_);
								f_1612_ += f_1624_;
								f_1611_ += f_1623_;
								f_1616_ += f_1628_;
								f_1610_ += (float) anInt1458;
							}
						} else {
							f_1610_ += 0.5F;
							f += 0.5F;
							f_1609_ = (float) (int) (f_1609_ + 0.5F) - f;
							f -= f_1610_;
							f_1610_ = (float) anIntArray1447[(int) f_1610_];
							while (--f >= 0.0F) {
								method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1610_, i, 0, (int) f_1613_, (int) f_1612_, f_1616_, f_1627_);
								f_1612_ += f_1624_;
								f_1613_ += f_1625_;
								f_1616_ += f_1628_;
								f_1610_ += (float) anInt1458;
							}
							while (--f_1609_ >= 0.0F) {
								method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1610_, i, 0, (int) f_1611_, (int) f_1612_, f_1616_, f_1627_);
								f_1612_ += f_1624_;
								f_1611_ += f_1623_;
								f_1616_ += f_1628_;
								f_1610_ += (float) anInt1458;
							}
						}
					} else {
						f_1611_ = f_1613_;
						if (f_1610_ < 0.0F) {
							f_1611_ -= f_1624_ * f_1610_;
							f_1613_ -= f_1625_ * f_1610_;
							f_1616_ -= f_1628_ * f_1610_;
							f_1610_ = 0.0F;
						}
						if (f_1609_ < 0.0F) {
							f_1612_ -= f_1623_ * f_1609_;
							f_1609_ = 0.0F;
						}
						if (f_1624_ < f_1625_) {
							f_1610_ += 0.5F;
							f_1609_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_1609_;
							f_1609_ -= f_1610_;
							f_1610_ = (float) anIntArray1447[(int) f_1610_];
							while (--f_1609_ >= 0.0F) {
								method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1610_, i, 0, (int) f_1611_, (int) f_1613_, f_1616_, f_1627_);
								f_1611_ += f_1624_;
								f_1613_ += f_1625_;
								f_1616_ += f_1628_;
								f_1610_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1610_, i, 0, (int) f_1612_, (int) f_1613_, f_1616_, f_1627_);
								f_1612_ += f_1623_;
								f_1613_ += f_1625_;
								f_1616_ += f_1628_;
								f_1610_ += (float) anInt1458;
							}
						} else {
							f_1610_ += 0.5F;
							f_1609_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_1609_;
							f_1609_ -= f_1610_;
							f_1610_ = (float) anIntArray1447[(int) f_1610_];
							while (--f_1609_ >= 0.0F) {
								method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1610_, i, 0, (int) f_1613_, (int) f_1611_, f_1616_, f_1627_);
								f_1611_ += f_1624_;
								f_1613_ += f_1625_;
								f_1616_ += f_1628_;
								f_1610_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2078(bool, bool_1607_, bool_1608_, anIntArray1459, (int) f_1610_, i, 0, (int) f_1613_, (int) f_1612_, f_1616_, f_1627_);
								f_1612_ += f_1623_;
								f_1613_ += f_1625_;
								f_1616_ += f_1628_;
								f_1610_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2105(boolean bool) {
		aBool1449 = bool;
	}

	final void method2106(boolean bool, boolean bool_1629_, boolean bool_1630_, float f, float f_1631_, float f_1632_, float f_1633_, float f_1634_, float f_1635_, float f_1636_, float f_1637_, float f_1638_, int i, int i_1639_, int i_1640_) {
		if (!bool)
			method2077(false, bool_1629_, bool_1630_, f, f_1631_, f_1632_, f_1633_, f_1634_, f_1635_, f_1636_, f_1637_, f_1638_, 0);
		else if (aBool1449) {
			aClass180_Sub1_1456.method3142((int) f_1633_, (int) f, (int) f_1634_, (int) f_1631_, ~0xffffff | i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_1634_, (int) f_1631_, (int) f_1635_, (int) f_1632_, ~0xffffff | i, (byte) 1);
			aClass180_Sub1_1456.method3142((int) f_1635_, (int) f_1632_, (int) f_1633_, (int) f, ~0xffffff | i, (byte) 1);
		} else {
			float f_1641_ = f_1634_ - f_1633_;
			float f_1642_ = f_1631_ - f;
			float f_1643_ = f_1635_ - f_1633_;
			float f_1644_ = f_1632_ - f;
			float f_1645_ = f_1637_ - f_1636_;
			float f_1646_ = f_1638_ - f_1636_;
			float f_1647_ = (float) ((i_1639_ & 0xff0000) - (i & 0xff0000));
			float f_1648_ = (float) ((i_1640_ & 0xff0000) - (i & 0xff0000));
			float f_1649_ = (float) ((i_1639_ & 0xff00) - (i & 0xff00));
			float f_1650_ = (float) ((i_1640_ & 0xff00) - (i & 0xff00));
			float f_1651_ = (float) ((i_1639_ & 0xff) - (i & 0xff));
			float f_1652_ = (float) ((i_1640_ & 0xff) - (i & 0xff));
			float f_1653_;
			if (f_1632_ != f_1631_)
				f_1653_ = (f_1635_ - f_1634_) / (f_1632_ - f_1631_);
			else
				f_1653_ = 0.0F;
			float f_1654_;
			if (f_1631_ != f)
				f_1654_ = f_1641_ / f_1642_;
			else
				f_1654_ = 0.0F;
			float f_1655_;
			if (f_1632_ != f)
				f_1655_ = f_1643_ / f_1644_;
			else
				f_1655_ = 0.0F;
			float f_1656_ = f_1641_ * f_1644_ - f_1643_ * f_1642_;
			if (f_1656_ != 0.0F) {
				float f_1657_ = (f_1645_ * f_1644_ - f_1646_ * f_1642_) / f_1656_;
				float f_1658_ = (f_1646_ * f_1641_ - f_1645_ * f_1643_) / f_1656_;
				float f_1659_ = (f_1647_ * f_1644_ - f_1648_ * f_1642_) / f_1656_;
				float f_1660_ = (f_1648_ * f_1641_ - f_1647_ * f_1643_) / f_1656_;
				float f_1661_ = (f_1649_ * f_1644_ - f_1650_ * f_1642_) / f_1656_;
				float f_1662_ = (f_1650_ * f_1641_ - f_1649_ * f_1643_) / f_1656_;
				float f_1663_ = (f_1651_ * f_1644_ - f_1652_ * f_1642_) / f_1656_;
				float f_1664_ = (f_1652_ * f_1641_ - f_1651_ * f_1643_) / f_1656_;
				if (f <= f_1631_ && f <= f_1632_) {
					if (!(f >= (float) anInt1450)) {
						if (f_1631_ > (float) anInt1450)
							f_1631_ = (float) anInt1450;
						if (f_1632_ > (float) anInt1450)
							f_1632_ = (float) anInt1450;
						f_1636_ = f_1636_ - f_1657_ * f_1633_ + f_1657_;
						float f_1665_ = ((float) (i & 0xff0000) - f_1659_ * f_1633_ + f_1659_);
						float f_1666_ = ((float) (i & 0xff00) - f_1661_ * f_1633_ + f_1661_);
						float f_1667_ = (float) (i & 0xff) - f_1663_ * f_1633_ + f_1663_;
						if (f_1631_ < f_1632_) {
							f_1635_ = f_1633_;
							if (f < 0.0F) {
								f_1635_ -= f_1655_ * f;
								f_1633_ -= f_1654_ * f;
								f_1636_ -= f_1658_ * f;
								f_1665_ -= f_1660_ * f;
								f_1666_ -= f_1662_ * f;
								f_1667_ -= f_1664_ * f;
								f = 0.0F;
							}
							if (f_1631_ < 0.0F) {
								f_1634_ -= f_1653_ * f_1631_;
								f_1631_ = 0.0F;
							}
							if (f != f_1631_ && f_1655_ < f_1654_ || f == f_1631_ && f_1655_ > f_1653_) {
								f += 0.5F;
								f_1631_ += 0.5F;
								f_1632_ = (float) (int) (f_1632_ + 0.5F) - f_1631_;
								f_1631_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_1631_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f, 0, 0, (int) f_1635_, (int) f_1633_, f_1636_, f_1657_, f_1665_, f_1659_, f_1666_, f_1661_, f_1667_, f_1663_);
									f_1635_ += f_1655_;
									f_1633_ += f_1654_;
									f_1636_ += f_1658_;
									f_1665_ += f_1660_;
									f_1666_ += f_1662_;
									f_1667_ += f_1664_;
									f += (float) anInt1458;
								}
								while (--f_1632_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f, 0, 0, (int) f_1635_, (int) f_1634_, f_1636_, f_1657_, f_1665_, f_1659_, f_1666_, f_1661_, f_1667_, f_1663_);
									f_1635_ += f_1655_;
									f_1634_ += f_1653_;
									f_1636_ += f_1658_;
									f_1665_ += f_1660_;
									f_1666_ += f_1662_;
									f_1667_ += f_1664_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_1631_ += 0.5F;
								f_1632_ = (float) (int) (f_1632_ + 0.5F) - f_1631_;
								f_1631_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_1631_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f, 0, 0, (int) f_1633_, (int) f_1635_, f_1636_, f_1657_, f_1665_, f_1659_, f_1666_, f_1661_, f_1667_, f_1663_);
									f_1635_ += f_1655_;
									f_1633_ += f_1654_;
									f_1636_ += f_1658_;
									f_1665_ += f_1660_;
									f_1666_ += f_1662_;
									f_1667_ += f_1664_;
									f += (float) anInt1458;
								}
								while (--f_1632_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f, 0, 0, (int) f_1634_, (int) f_1635_, f_1636_, f_1657_, f_1665_, f_1659_, f_1666_, f_1661_, f_1667_, f_1663_);
									f_1635_ += f_1655_;
									f_1634_ += f_1653_;
									f_1636_ += f_1658_;
									f_1665_ += f_1660_;
									f_1666_ += f_1662_;
									f_1667_ += f_1664_;
									f += (float) anInt1458;
								}
							}
						} else {
							f_1634_ = f_1633_;
							if (f < 0.0F) {
								f_1634_ -= f_1655_ * f;
								f_1633_ -= f_1654_ * f;
								f_1636_ -= f_1658_ * f;
								f_1665_ -= f_1660_ * f;
								f_1666_ -= f_1662_ * f;
								f_1667_ -= f_1664_ * f;
								f = 0.0F;
							}
							if (f_1632_ < 0.0F) {
								f_1635_ -= f_1653_ * f_1632_;
								f_1632_ = 0.0F;
							}
							if (f != f_1632_ && f_1655_ < f_1654_ || f == f_1632_ && f_1653_ > f_1654_) {
								f += 0.5F;
								f_1632_ += 0.5F;
								f_1631_ = (float) (int) (f_1631_ + 0.5F) - f_1632_;
								f_1632_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_1632_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f, 0, 0, (int) f_1634_, (int) f_1633_, f_1636_, f_1657_, f_1665_, f_1659_, f_1666_, f_1661_, f_1667_, f_1663_);
									f_1634_ += f_1655_;
									f_1633_ += f_1654_;
									f_1636_ += f_1658_;
									f_1665_ += f_1660_;
									f_1666_ += f_1662_;
									f_1667_ += f_1664_;
									f += (float) anInt1458;
								}
								while (--f_1631_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f, 0, 0, (int) f_1635_, (int) f_1633_, f_1636_, f_1657_, f_1665_, f_1659_, f_1666_, f_1661_, f_1667_, f_1663_);
									f_1635_ += f_1653_;
									f_1633_ += f_1654_;
									f_1636_ += f_1658_;
									f_1665_ += f_1660_;
									f_1666_ += f_1662_;
									f_1667_ += f_1664_;
									f += (float) anInt1458;
								}
							} else {
								f += 0.5F;
								f_1632_ += 0.5F;
								f_1631_ = (float) (int) (f_1631_ + 0.5F) - f_1632_;
								f_1632_ -= f;
								f = (float) anIntArray1447[(int) f];
								while (--f_1632_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f, 0, 0, (int) f_1633_, (int) f_1634_, f_1636_, f_1657_, f_1665_, f_1659_, f_1666_, f_1661_, f_1667_, f_1663_);
									f_1634_ += f_1655_;
									f_1633_ += f_1654_;
									f_1636_ += f_1658_;
									f_1665_ += f_1660_;
									f_1666_ += f_1662_;
									f_1667_ += f_1664_;
									f += (float) anInt1458;
								}
								while (--f_1631_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f, 0, 0, (int) f_1633_, (int) f_1635_, f_1636_, f_1657_, f_1665_, f_1659_, f_1666_, f_1661_, f_1667_, f_1663_);
									f_1635_ += f_1653_;
									f_1633_ += f_1654_;
									f_1636_ += f_1658_;
									f_1665_ += f_1660_;
									f_1666_ += f_1662_;
									f_1667_ += f_1664_;
									f += (float) anInt1458;
								}
							}
						}
					}
				} else if (f_1631_ <= f_1632_) {
					if (!(f_1631_ >= (float) anInt1450)) {
						if (f_1632_ > (float) anInt1450)
							f_1632_ = (float) anInt1450;
						if (f > (float) anInt1450)
							f = (float) anInt1450;
						f_1637_ = f_1637_ - f_1657_ * f_1634_ + f_1657_;
						float f_1668_ = ((float) (i_1639_ & 0xff0000) - f_1659_ * f_1634_ + f_1659_);
						float f_1669_ = ((float) (i_1639_ & 0xff00) - f_1661_ * f_1634_ + f_1661_);
						float f_1670_ = ((float) (i_1639_ & 0xff) - f_1663_ * f_1634_ + f_1663_);
						if (f_1632_ < f) {
							f_1633_ = f_1634_;
							if (f_1631_ < 0.0F) {
								f_1633_ -= f_1654_ * f_1631_;
								f_1634_ -= f_1653_ * f_1631_;
								f_1637_ -= f_1658_ * f_1631_;
								f_1668_ -= f_1660_ * f_1631_;
								f_1669_ -= f_1662_ * f_1631_;
								f_1670_ -= f_1664_ * f_1631_;
								f_1631_ = 0.0F;
							}
							if (f_1632_ < 0.0F) {
								f_1635_ -= f_1655_ * f_1632_;
								f_1632_ = 0.0F;
							}
							if (f_1631_ != f_1632_ && f_1654_ < f_1653_ || f_1631_ == f_1632_ && f_1654_ > f_1655_) {
								f_1631_ += 0.5F;
								f_1632_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_1632_;
								f_1632_ -= f_1631_;
								f_1631_ = (float) anIntArray1447[(int) f_1631_];
								while (--f_1632_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1631_, 0, 0, (int) f_1633_, (int) f_1634_, f_1637_, f_1657_, f_1668_, f_1659_, f_1669_, f_1661_, f_1670_, f_1663_);
									f_1633_ += f_1654_;
									f_1634_ += f_1653_;
									f_1637_ += f_1658_;
									f_1668_ += f_1660_;
									f_1669_ += f_1662_;
									f_1670_ += f_1664_;
									f_1631_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1631_, 0, 0, (int) f_1633_, (int) f_1635_, f_1637_, f_1657_, f_1668_, f_1659_, f_1669_, f_1661_, f_1670_, f_1663_);
									f_1633_ += f_1654_;
									f_1635_ += f_1655_;
									f_1637_ += f_1658_;
									f_1668_ += f_1660_;
									f_1669_ += f_1662_;
									f_1670_ += f_1664_;
									f_1631_ += (float) anInt1458;
								}
							} else {
								f_1631_ += 0.5F;
								f_1632_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_1632_;
								f_1632_ -= f_1631_;
								f_1631_ = (float) anIntArray1447[(int) f_1631_];
								while (--f_1632_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1631_, 0, 0, (int) f_1634_, (int) f_1633_, f_1637_, f_1657_, f_1668_, f_1659_, f_1669_, f_1661_, f_1670_, f_1663_);
									f_1633_ += f_1654_;
									f_1634_ += f_1653_;
									f_1637_ += f_1658_;
									f_1668_ += f_1660_;
									f_1669_ += f_1662_;
									f_1670_ += f_1664_;
									f_1631_ += (float) anInt1458;
								}
								while (--f >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1631_, 0, 0, (int) f_1635_, (int) f_1633_, f_1637_, f_1657_, f_1668_, f_1659_, f_1669_, f_1661_, f_1670_, f_1663_);
									f_1633_ += f_1654_;
									f_1635_ += f_1655_;
									f_1637_ += f_1658_;
									f_1668_ += f_1660_;
									f_1669_ += f_1662_;
									f_1670_ += f_1664_;
									f_1631_ += (float) anInt1458;
								}
							}
						} else {
							f_1635_ = f_1634_;
							if (f_1631_ < 0.0F) {
								f_1635_ -= f_1654_ * f_1631_;
								f_1634_ -= f_1653_ * f_1631_;
								f_1637_ -= f_1658_ * f_1631_;
								f_1668_ -= f_1660_ * f_1631_;
								f_1669_ -= f_1662_ * f_1631_;
								f_1670_ -= f_1664_ * f_1631_;
								f_1631_ = 0.0F;
							}
							if (f < 0.0F) {
								f_1633_ -= f_1655_ * f;
								f = 0.0F;
							}
							if (f_1654_ < f_1653_) {
								f_1631_ += 0.5F;
								f += 0.5F;
								f_1632_ = (float) (int) (f_1632_ + 0.5F) - f;
								f -= f_1631_;
								f_1631_ = (float) anIntArray1447[(int) f_1631_];
								while (--f >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1631_, 0, 0, (int) f_1635_, (int) f_1634_, f_1637_, f_1657_, f_1668_, f_1659_, f_1669_, f_1661_, f_1670_, f_1663_);
									f_1635_ += f_1654_;
									f_1634_ += f_1653_;
									f_1637_ += f_1658_;
									f_1668_ += f_1660_;
									f_1669_ += f_1662_;
									f_1670_ += f_1664_;
									f_1631_ += (float) anInt1458;
								}
								while (--f_1632_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1631_, 0, 0, (int) f_1633_, (int) f_1634_, f_1637_, f_1657_, f_1668_, f_1659_, f_1669_, f_1661_, f_1670_, f_1663_);
									f_1633_ += f_1655_;
									f_1634_ += f_1653_;
									f_1637_ += f_1658_;
									f_1668_ += f_1660_;
									f_1669_ += f_1662_;
									f_1670_ += f_1664_;
									f_1631_ += (float) anInt1458;
								}
							} else {
								f_1631_ += 0.5F;
								f += 0.5F;
								f_1632_ = (float) (int) (f_1632_ + 0.5F) - f;
								f -= f_1631_;
								f_1631_ = (float) anIntArray1447[(int) f_1631_];
								while (--f >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1631_, 0, 0, (int) f_1634_, (int) f_1635_, f_1637_, f_1657_, f_1668_, f_1659_, f_1669_, f_1661_, f_1670_, f_1663_);
									f_1635_ += f_1654_;
									f_1634_ += f_1653_;
									f_1637_ += f_1658_;
									f_1668_ += f_1660_;
									f_1669_ += f_1662_;
									f_1670_ += f_1664_;
									f_1631_ += (float) anInt1458;
								}
								while (--f_1632_ >= 0.0F) {
									method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1631_, 0, 0, (int) f_1634_, (int) f_1633_, f_1637_, f_1657_, f_1668_, f_1659_, f_1669_, f_1661_, f_1670_, f_1663_);
									f_1633_ += f_1655_;
									f_1634_ += f_1653_;
									f_1637_ += f_1658_;
									f_1668_ += f_1660_;
									f_1669_ += f_1662_;
									f_1670_ += f_1664_;
									f_1631_ += (float) anInt1458;
								}
							}
						}
					}
				} else if (!(f_1632_ >= (float) anInt1450)) {
					if (f > (float) anInt1450)
						f = (float) anInt1450;
					if (f_1631_ > (float) anInt1450)
						f_1631_ = (float) anInt1450;
					f_1638_ = f_1638_ - f_1657_ * f_1635_ + f_1657_;
					float f_1671_ = ((float) (i_1640_ & 0xff0000) - f_1659_ * f_1635_ + f_1659_);
					float f_1672_ = ((float) (i_1640_ & 0xff00) - f_1661_ * f_1635_ + f_1661_);
					float f_1673_ = ((float) (i_1640_ & 0xff) - f_1663_ * f_1635_ + f_1663_);
					if (f < f_1631_) {
						f_1634_ = f_1635_;
						if (f_1632_ < 0.0F) {
							f_1634_ -= f_1653_ * f_1632_;
							f_1635_ -= f_1655_ * f_1632_;
							f_1638_ -= f_1658_ * f_1632_;
							f_1671_ -= f_1660_ * f_1632_;
							f_1672_ -= f_1662_ * f_1632_;
							f_1673_ -= f_1664_ * f_1632_;
							f_1632_ = 0.0F;
						}
						if (f < 0.0F) {
							f_1633_ -= f_1654_ * f;
							f = 0.0F;
						}
						if (f_1653_ < f_1655_) {
							f_1632_ += 0.5F;
							f += 0.5F;
							f_1631_ = (float) (int) (f_1631_ + 0.5F) - f;
							f -= f_1632_;
							f_1632_ = (float) anIntArray1447[(int) f_1632_];
							while (--f >= 0.0F) {
								method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1632_, 0, 0, (int) f_1634_, (int) f_1635_, f_1638_, f_1657_, f_1671_, f_1659_, f_1672_, f_1661_, f_1673_, f_1663_);
								f_1634_ += f_1653_;
								f_1635_ += f_1655_;
								f_1638_ += f_1658_;
								f_1671_ += f_1660_;
								f_1672_ += f_1662_;
								f_1673_ += f_1664_;
								f_1632_ += (float) anInt1458;
							}
							while (--f_1631_ >= 0.0F) {
								method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1632_, 0, 0, (int) f_1634_, (int) f_1633_, f_1638_, f_1657_, f_1671_, f_1659_, f_1672_, f_1661_, f_1673_, f_1663_);
								f_1634_ += f_1653_;
								f_1633_ += f_1654_;
								f_1638_ += f_1658_;
								f_1671_ += f_1660_;
								f_1672_ += f_1662_;
								f_1673_ += f_1664_;
								f_1632_ += (float) anInt1458;
							}
						} else {
							f_1632_ += 0.5F;
							f += 0.5F;
							f_1631_ = (float) (int) (f_1631_ + 0.5F) - f;
							f -= f_1632_;
							f_1632_ = (float) anIntArray1447[(int) f_1632_];
							while (--f >= 0.0F) {
								method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1632_, 0, 0, (int) f_1635_, (int) f_1634_, f_1638_, f_1657_, f_1671_, f_1659_, f_1672_, f_1661_, f_1673_, f_1663_);
								f_1634_ += f_1653_;
								f_1635_ += f_1655_;
								f_1638_ += f_1658_;
								f_1671_ += f_1660_;
								f_1672_ += f_1662_;
								f_1673_ += f_1664_;
								f_1632_ += (float) anInt1458;
							}
							while (--f_1631_ >= 0.0F) {
								method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1632_, 0, 0, (int) f_1633_, (int) f_1634_, f_1638_, f_1657_, f_1671_, f_1659_, f_1672_, f_1661_, f_1673_, f_1663_);
								f_1634_ += f_1653_;
								f_1633_ += f_1654_;
								f_1638_ += f_1658_;
								f_1671_ += f_1660_;
								f_1672_ += f_1662_;
								f_1673_ += f_1664_;
								f_1632_ += (float) anInt1458;
							}
						}
					} else {
						f_1633_ = f_1635_;
						if (f_1632_ < 0.0F) {
							f_1633_ -= f_1653_ * f_1632_;
							f_1635_ -= f_1655_ * f_1632_;
							f_1638_ -= f_1658_ * f_1632_;
							f_1671_ -= f_1660_ * f_1632_;
							f_1672_ -= f_1662_ * f_1632_;
							f_1673_ -= f_1664_ * f_1632_;
							f_1632_ = 0.0F;
						}
						if (f_1631_ < 0.0F) {
							f_1634_ -= f_1654_ * f_1631_;
							f_1631_ = 0.0F;
						}
						if (f_1653_ < f_1655_) {
							f_1632_ += 0.5F;
							f_1631_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_1631_;
							f_1631_ -= f_1632_;
							f_1632_ = (float) anIntArray1447[(int) f_1632_];
							while (--f_1631_ >= 0.0F) {
								method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1632_, 0, 0, (int) f_1633_, (int) f_1635_, f_1638_, f_1657_, f_1671_, f_1659_, f_1672_, f_1661_, f_1673_, f_1663_);
								f_1633_ += f_1653_;
								f_1635_ += f_1655_;
								f_1638_ += f_1658_;
								f_1671_ += f_1660_;
								f_1672_ += f_1662_;
								f_1673_ += f_1664_;
								f_1632_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1632_, 0, 0, (int) f_1634_, (int) f_1635_, f_1638_, f_1657_, f_1671_, f_1659_, f_1672_, f_1661_, f_1673_, f_1663_);
								f_1634_ += f_1654_;
								f_1635_ += f_1655_;
								f_1638_ += f_1658_;
								f_1671_ += f_1660_;
								f_1672_ += f_1662_;
								f_1673_ += f_1664_;
								f_1632_ += (float) anInt1458;
							}
						} else {
							f_1632_ += 0.5F;
							f_1631_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_1631_;
							f_1631_ -= f_1632_;
							f_1632_ = (float) anIntArray1447[(int) f_1632_];
							while (--f_1631_ >= 0.0F) {
								method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1632_, 0, 0, (int) f_1635_, (int) f_1633_, f_1638_, f_1657_, f_1671_, f_1659_, f_1672_, f_1661_, f_1673_, f_1663_);
								f_1633_ += f_1653_;
								f_1635_ += f_1655_;
								f_1638_ += f_1658_;
								f_1671_ += f_1660_;
								f_1672_ += f_1662_;
								f_1673_ += f_1664_;
								f_1632_ += (float) anInt1458;
							}
							while (--f >= 0.0F) {
								method2076(bool_1629_, bool_1630_, anIntArray1459, (int) f_1632_, 0, 0, (int) f_1635_, (int) f_1634_, f_1638_, f_1657_, f_1671_, f_1659_, f_1672_, f_1661_, f_1673_, f_1663_);
								f_1634_ += f_1654_;
								f_1635_ += f_1655_;
								f_1638_ += f_1658_;
								f_1671_ += f_1660_;
								f_1672_ += f_1662_;
								f_1673_ += f_1664_;
								f_1632_ += (float) anInt1458;
							}
						}
					}
				}
			}
		}
	}

	final void method2107(boolean bool, boolean bool_1674_, boolean bool_1675_, int[] is, int i, int i_1676_, int i_1677_, int i_1678_, int i_1679_, float f, float f_1680_) {
		if (aBool1445) {
			if (i_1679_ > anInt1442)
				i_1679_ = anInt1442;
			if (i_1678_ < 0)
				i_1678_ = 0;
		}
		if (i_1678_ < i_1679_) {
			i += i_1678_ - 1;
			i_1677_ = i_1679_ - i_1678_ >> 2;
			f += f_1680_ * (float) i_1678_;
			if (aClass101_1457.aBool1227) {
				if (anInt1441 == 0) {
					while (--i_1677_ >= 0) {
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1676_;
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1676_;
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1676_;
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1676_;
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
					}
					i_1677_ = i_1679_ - i_1678_ & 0x3;
					while (--i_1677_ >= 0) {
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1676_;
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
					}
				} else if (anInt1441 == 254) {
					if (i_1678_ != 0 && i_1679_ <= anInt1442 - 1) {
						while (--i_1677_ >= 0) {
							i++;
							if ((!bool_1674_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1680_;
							i++;
							if ((!bool_1674_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1680_;
							i++;
							if ((!bool_1674_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1680_;
							i++;
							if ((!bool_1674_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1680_;
						}
						i_1677_ = i_1679_ - i_1678_ & 0x3;
						while (--i_1677_ >= 0) {
							i++;
							if ((!bool_1674_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1680_;
						}
					}
				} else {
					int i_1681_ = anInt1441;
					int i_1682_ = 256 - anInt1441;
					i_1676_ = (((i_1676_ & 0xff00ff) * i_1682_ >> 8 & 0xff00ff) + ((i_1676_ & 0xff00) * i_1682_ >> 8 & 0xff00));
					while (--i_1677_ >= 0) {
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1683_ = is[i];
								if (bool_1675_)
									is[i] = ((i_1682_ | i_1683_ >> 24) << 24 | (i_1676_ + (((i_1683_ & 0xff00ff) * i_1681_) >> 8 & 0xff00ff) + (((i_1683_ & 0xff00) * i_1681_ >> 8) & 0xff00)));
								else
									is[i] = (i_1676_ + (((i_1683_ & 0xff00ff) * i_1681_ >> 8) & 0xff00ff) + ((i_1683_ & 0xff00) * i_1681_ >> 8 & 0xff00));
							}
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1684_ = is[i];
								if (bool_1675_)
									is[i] = ((i_1682_ | i_1684_ >> 24) << 24 | (i_1676_ + (((i_1684_ & 0xff00ff) * i_1681_) >> 8 & 0xff00ff) + (((i_1684_ & 0xff00) * i_1681_ >> 8) & 0xff00)));
								else
									is[i] = (i_1676_ + (((i_1684_ & 0xff00ff) * i_1681_ >> 8) & 0xff00ff) + ((i_1684_ & 0xff00) * i_1681_ >> 8 & 0xff00));
							}
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1685_ = is[i];
								if (bool_1675_)
									is[i] = ((i_1682_ | i_1685_ >> 24) << 24 | (i_1676_ + (((i_1685_ & 0xff00ff) * i_1681_) >> 8 & 0xff00ff) + (((i_1685_ & 0xff00) * i_1681_ >> 8) & 0xff00)));
								else
									is[i] = (i_1676_ + (((i_1685_ & 0xff00ff) * i_1681_ >> 8) & 0xff00ff) + ((i_1685_ & 0xff00) * i_1681_ >> 8 & 0xff00));
							}
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1686_ = is[i];
								if (bool_1675_)
									is[i] = ((i_1682_ | i_1686_ >> 24) << 24 | (i_1676_ + (((i_1686_ & 0xff00ff) * i_1681_) >> 8 & 0xff00ff) + (((i_1686_ & 0xff00) * i_1681_ >> 8) & 0xff00)));
								else
									is[i] = (i_1676_ + (((i_1686_ & 0xff00ff) * i_1681_ >> 8) & 0xff00ff) + ((i_1686_ & 0xff00) * i_1681_ >> 8 & 0xff00));
							}
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
					}
					i_1677_ = i_1679_ - i_1678_ & 0x3;
					while (--i_1677_ >= 0) {
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1687_ = is[i];
								if (bool_1675_)
									is[i] = ((i_1682_ | i_1687_ >> 24) << 24 | (i_1676_ + (((i_1687_ & 0xff00ff) * i_1681_) >> 8 & 0xff00ff) + (((i_1687_ & 0xff00) * i_1681_ >> 8) & 0xff00)));
								else
									is[i] = (i_1676_ + (((i_1687_ & 0xff00ff) * i_1681_ >> 8) & 0xff00ff) + ((i_1687_ & 0xff00) * i_1681_ >> 8 & 0xff00));
							}
							if (bool_1674_)
								aFloatArray1460[i] = f;
						}
						f += f_1680_;
					}
				}
			} else if (bool) {
				if (anInt1441 == 0) {
					while (--i_1677_ >= 0) {
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i])
							is[i] = i_1676_;
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i])
							is[i] = i_1676_;
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i])
							is[i] = i_1676_;
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i])
							is[i] = i_1676_;
						f += f_1680_;
					}
					i_1677_ = i_1679_ - i_1678_ & 0x3;
					while (--i_1677_ >= 0) {
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i])
							is[i] = i_1676_;
						f += f_1680_;
					}
				} else if (anInt1441 == 254) {
					if (i_1678_ != 0 && i_1679_ <= anInt1442 - 1) {
						while (--i_1677_ >= 0) {
							i++;
							if (!bool_1674_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1680_;
							i++;
							if (!bool_1674_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1680_;
							i++;
							if (!bool_1674_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1680_;
							i++;
							if (!bool_1674_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1680_;
						}
						i_1677_ = i_1679_ - i_1678_ & 0x3;
						while (--i_1677_ >= 0) {
							i++;
							if (!bool_1674_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1680_;
						}
					}
				} else {
					int i_1688_ = anInt1441;
					int i_1689_ = 256 - anInt1441;
					i_1676_ = (((i_1676_ & 0xff00ff) * i_1689_ >> 8 & 0xff00ff) + ((i_1676_ & 0xff00) * i_1689_ >> 8 & 0xff00));
					while (--i_1677_ >= 0) {
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							int i_1690_ = is[i];
							if (bool_1675_)
								is[i] = ((i_1689_ | i_1690_ >> 24) << 24 | (i_1676_ + (((i_1690_ & 0xff00ff) * i_1688_ >> 8) & 0xff00ff) + ((i_1690_ & 0xff00) * i_1688_ >> 8 & 0xff00)));
							else
								is[i] = (i_1676_ + ((i_1690_ & 0xff00ff) * i_1688_ >> 8 & 0xff00ff) + ((i_1690_ & 0xff00) * i_1688_ >> 8 & 0xff00));
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							int i_1691_ = is[i];
							if (bool_1675_)
								is[i] = ((i_1689_ | i_1691_ >> 24) << 24 | (i_1676_ + (((i_1691_ & 0xff00ff) * i_1688_ >> 8) & 0xff00ff) + ((i_1691_ & 0xff00) * i_1688_ >> 8 & 0xff00)));
							else
								is[i] = (i_1676_ + ((i_1691_ & 0xff00ff) * i_1688_ >> 8 & 0xff00ff) + ((i_1691_ & 0xff00) * i_1688_ >> 8 & 0xff00));
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							int i_1692_ = is[i];
							if (bool_1675_)
								is[i] = ((i_1689_ | i_1692_ >> 24) << 24 | (i_1676_ + (((i_1692_ & 0xff00ff) * i_1688_ >> 8) & 0xff00ff) + ((i_1692_ & 0xff00) * i_1688_ >> 8 & 0xff00)));
							else
								is[i] = (i_1676_ + ((i_1692_ & 0xff00ff) * i_1688_ >> 8 & 0xff00ff) + ((i_1692_ & 0xff00) * i_1688_ >> 8 & 0xff00));
						}
						f += f_1680_;
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							int i_1693_ = is[i];
							if (bool_1675_)
								is[i] = ((i_1689_ | i_1693_ >> 24) << 24 | (i_1676_ + (((i_1693_ & 0xff00ff) * i_1688_ >> 8) & 0xff00ff) + ((i_1693_ & 0xff00) * i_1688_ >> 8 & 0xff00)));
							else
								is[i] = (i_1676_ + ((i_1693_ & 0xff00ff) * i_1688_ >> 8 & 0xff00ff) + ((i_1693_ & 0xff00) * i_1688_ >> 8 & 0xff00));
						}
						f += f_1680_;
					}
					i_1677_ = i_1679_ - i_1678_ & 0x3;
					while (--i_1677_ >= 0) {
						i++;
						if (!bool_1674_ || f < aFloatArray1460[i]) {
							int i_1694_ = is[i];
							if (bool_1675_)
								is[i] = ((i_1689_ | i_1694_ >> 24) << 24 | (i_1676_ + (((i_1694_ & 0xff00ff) * i_1688_ >> 8) & 0xff00ff) + ((i_1694_ & 0xff00) * i_1688_ >> 8 & 0xff00)));
							else
								is[i] = (i_1676_ + ((i_1694_ & 0xff00ff) * i_1688_ >> 8 & 0xff00ff) + ((i_1694_ & 0xff00) * i_1688_ >> 8 & 0xff00));
						}
						f += f_1680_;
					}
				}
			}
		}
	}

	final void method2108(boolean bool, boolean bool_1695_, boolean bool_1696_, int[] is, int i, int i_1697_, int i_1698_, int i_1699_, int i_1700_, float f, float f_1701_) {
		if (aBool1445) {
			if (i_1700_ > anInt1442)
				i_1700_ = anInt1442;
			if (i_1699_ < 0)
				i_1699_ = 0;
		}
		if (i_1699_ < i_1700_) {
			i += i_1699_ - 1;
			i_1698_ = i_1700_ - i_1699_ >> 2;
			f += f_1701_ * (float) i_1699_;
			if (aClass101_1457.aBool1227) {
				if (anInt1441 == 0) {
					while (--i_1698_ >= 0) {
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1697_;
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1697_;
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1697_;
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1697_;
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
					}
					i_1698_ = i_1700_ - i_1699_ & 0x3;
					while (--i_1698_ >= 0) {
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool)
								is[i] = i_1697_;
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
					}
				} else if (anInt1441 == 254) {
					if (i_1699_ != 0 && i_1700_ <= anInt1442 - 1) {
						while (--i_1698_ >= 0) {
							i++;
							if ((!bool_1695_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1701_;
							i++;
							if ((!bool_1695_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1701_;
							i++;
							if ((!bool_1695_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1701_;
							i++;
							if ((!bool_1695_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1701_;
						}
						i_1698_ = i_1700_ - i_1699_ & 0x3;
						while (--i_1698_ >= 0) {
							i++;
							if ((!bool_1695_ || f < aFloatArray1460[i]) && bool)
								is[i - 1] = is[i];
							f += f_1701_;
						}
					}
				} else {
					int i_1702_ = anInt1441;
					int i_1703_ = 256 - anInt1441;
					i_1697_ = (((i_1697_ & 0xff00ff) * i_1703_ >> 8 & 0xff00ff) + ((i_1697_ & 0xff00) * i_1703_ >> 8 & 0xff00));
					while (--i_1698_ >= 0) {
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1704_ = is[i];
								if (bool_1696_)
									is[i] = ((i_1703_ | i_1704_ >> 24) << 24 | (i_1697_ + (((i_1704_ & 0xff00ff) * i_1702_) >> 8 & 0xff00ff) + (((i_1704_ & 0xff00) * i_1702_ >> 8) & 0xff00)));
								else
									is[i] = (i_1697_ + (((i_1704_ & 0xff00ff) * i_1702_ >> 8) & 0xff00ff) + ((i_1704_ & 0xff00) * i_1702_ >> 8 & 0xff00));
							}
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1705_ = is[i];
								if (bool_1696_)
									is[i] = ((i_1703_ | i_1705_ >> 24) << 24 | (i_1697_ + (((i_1705_ & 0xff00ff) * i_1702_) >> 8 & 0xff00ff) + (((i_1705_ & 0xff00) * i_1702_ >> 8) & 0xff00)));
								else
									is[i] = (i_1697_ + (((i_1705_ & 0xff00ff) * i_1702_ >> 8) & 0xff00ff) + ((i_1705_ & 0xff00) * i_1702_ >> 8 & 0xff00));
							}
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1706_ = is[i];
								if (bool_1696_)
									is[i] = ((i_1703_ | i_1706_ >> 24) << 24 | (i_1697_ + (((i_1706_ & 0xff00ff) * i_1702_) >> 8 & 0xff00ff) + (((i_1706_ & 0xff00) * i_1702_ >> 8) & 0xff00)));
								else
									is[i] = (i_1697_ + (((i_1706_ & 0xff00ff) * i_1702_ >> 8) & 0xff00ff) + ((i_1706_ & 0xff00) * i_1702_ >> 8 & 0xff00));
							}
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1707_ = is[i];
								if (bool_1696_)
									is[i] = ((i_1703_ | i_1707_ >> 24) << 24 | (i_1697_ + (((i_1707_ & 0xff00ff) * i_1702_) >> 8 & 0xff00ff) + (((i_1707_ & 0xff00) * i_1702_ >> 8) & 0xff00)));
								else
									is[i] = (i_1697_ + (((i_1707_ & 0xff00ff) * i_1702_ >> 8) & 0xff00ff) + ((i_1707_ & 0xff00) * i_1702_ >> 8 & 0xff00));
							}
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
					}
					i_1698_ = i_1700_ - i_1699_ & 0x3;
					while (--i_1698_ >= 0) {
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							if (bool) {
								int i_1708_ = is[i];
								if (bool_1696_)
									is[i] = ((i_1703_ | i_1708_ >> 24) << 24 | (i_1697_ + (((i_1708_ & 0xff00ff) * i_1702_) >> 8 & 0xff00ff) + (((i_1708_ & 0xff00) * i_1702_ >> 8) & 0xff00)));
								else
									is[i] = (i_1697_ + (((i_1708_ & 0xff00ff) * i_1702_ >> 8) & 0xff00ff) + ((i_1708_ & 0xff00) * i_1702_ >> 8 & 0xff00));
							}
							if (bool_1695_)
								aFloatArray1460[i] = f;
						}
						f += f_1701_;
					}
				}
			} else if (bool) {
				if (anInt1441 == 0) {
					while (--i_1698_ >= 0) {
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i])
							is[i] = i_1697_;
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i])
							is[i] = i_1697_;
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i])
							is[i] = i_1697_;
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i])
							is[i] = i_1697_;
						f += f_1701_;
					}
					i_1698_ = i_1700_ - i_1699_ & 0x3;
					while (--i_1698_ >= 0) {
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i])
							is[i] = i_1697_;
						f += f_1701_;
					}
				} else if (anInt1441 == 254) {
					if (i_1699_ != 0 && i_1700_ <= anInt1442 - 1) {
						while (--i_1698_ >= 0) {
							i++;
							if (!bool_1695_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1701_;
							i++;
							if (!bool_1695_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1701_;
							i++;
							if (!bool_1695_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1701_;
							i++;
							if (!bool_1695_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1701_;
						}
						i_1698_ = i_1700_ - i_1699_ & 0x3;
						while (--i_1698_ >= 0) {
							i++;
							if (!bool_1695_ || f < aFloatArray1460[i])
								is[i - 1] = is[i];
							f += f_1701_;
						}
					}
				} else {
					int i_1709_ = anInt1441;
					int i_1710_ = 256 - anInt1441;
					i_1697_ = (((i_1697_ & 0xff00ff) * i_1710_ >> 8 & 0xff00ff) + ((i_1697_ & 0xff00) * i_1710_ >> 8 & 0xff00));
					while (--i_1698_ >= 0) {
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							int i_1711_ = is[i];
							if (bool_1696_)
								is[i] = ((i_1710_ | i_1711_ >> 24) << 24 | (i_1697_ + (((i_1711_ & 0xff00ff) * i_1709_ >> 8) & 0xff00ff) + ((i_1711_ & 0xff00) * i_1709_ >> 8 & 0xff00)));
							else
								is[i] = (i_1697_ + ((i_1711_ & 0xff00ff) * i_1709_ >> 8 & 0xff00ff) + ((i_1711_ & 0xff00) * i_1709_ >> 8 & 0xff00));
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							int i_1712_ = is[i];
							if (bool_1696_)
								is[i] = ((i_1710_ | i_1712_ >> 24) << 24 | (i_1697_ + (((i_1712_ & 0xff00ff) * i_1709_ >> 8) & 0xff00ff) + ((i_1712_ & 0xff00) * i_1709_ >> 8 & 0xff00)));
							else
								is[i] = (i_1697_ + ((i_1712_ & 0xff00ff) * i_1709_ >> 8 & 0xff00ff) + ((i_1712_ & 0xff00) * i_1709_ >> 8 & 0xff00));
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							int i_1713_ = is[i];
							if (bool_1696_)
								is[i] = ((i_1710_ | i_1713_ >> 24) << 24 | (i_1697_ + (((i_1713_ & 0xff00ff) * i_1709_ >> 8) & 0xff00ff) + ((i_1713_ & 0xff00) * i_1709_ >> 8 & 0xff00)));
							else
								is[i] = (i_1697_ + ((i_1713_ & 0xff00ff) * i_1709_ >> 8 & 0xff00ff) + ((i_1713_ & 0xff00) * i_1709_ >> 8 & 0xff00));
						}
						f += f_1701_;
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							int i_1714_ = is[i];
							if (bool_1696_)
								is[i] = ((i_1710_ | i_1714_ >> 24) << 24 | (i_1697_ + (((i_1714_ & 0xff00ff) * i_1709_ >> 8) & 0xff00ff) + ((i_1714_ & 0xff00) * i_1709_ >> 8 & 0xff00)));
							else
								is[i] = (i_1697_ + ((i_1714_ & 0xff00ff) * i_1709_ >> 8 & 0xff00ff) + ((i_1714_ & 0xff00) * i_1709_ >> 8 & 0xff00));
						}
						f += f_1701_;
					}
					i_1698_ = i_1700_ - i_1699_ & 0x3;
					while (--i_1698_ >= 0) {
						i++;
						if (!bool_1695_ || f < aFloatArray1460[i]) {
							int i_1715_ = is[i];
							if (bool_1696_)
								is[i] = ((i_1710_ | i_1715_ >> 24) << 24 | (i_1697_ + (((i_1715_ & 0xff00ff) * i_1709_ >> 8) & 0xff00ff) + ((i_1715_ & 0xff00) * i_1709_ >> 8 & 0xff00)));
							else
								is[i] = (i_1697_ + ((i_1715_ & 0xff00ff) * i_1709_ >> 8 & 0xff00ff) + ((i_1715_ & 0xff00) * i_1709_ >> 8 & 0xff00));
						}
						f += f_1701_;
					}
				}
			}
		}
	}

	final void method2109(boolean bool, boolean bool_1716_, boolean bool_1717_, float f, float f_1718_, float f_1719_, float f_1720_, float f_1721_, float f_1722_, float f_1723_, float f_1724_, float f_1725_, float f_1726_, float f_1727_, float f_1728_, float f_1729_, float f_1730_, float f_1731_, float f_1732_, float f_1733_, float f_1734_, int i, int i_1735_, int i_1736_, int i_1737_, float f_1738_, float f_1739_, float f_1740_, int i_1741_) {
		if (!bool)
			method2077(false, bool_1716_, bool_1717_, f, f_1718_, f_1719_, f_1720_, f_1721_, f_1722_, f_1723_, f_1724_, f_1725_, 0);
		else {
			int i_1742_ = i_1741_ & 0xffff;
			if (i_1742_ != anInt1462) {
				anIntArray1463 = aClass180_Sub1_1456.method14841(i_1742_);
				if (anIntArray1463 == null) {
					anInt1462 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					anInt1468 = 0;
					int i_1743_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_1741_), (byte) 10) & 0xffff]);
					int i_1744_ = (~0xffffff | ((i >> 16 & 0xff) * (i_1743_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_1743_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_1743_ & 0xff) >> 8);
					method2106(true, bool_1716_, bool_1717_, f, f_1718_, f_1719_, f_1720_, f_1721_, f_1722_, f_1723_, f_1724_, f_1725_, Class388.method6456(i_1744_, i_1737_, f_1738_, (byte) -12), Class388.method6456(i_1744_, i_1737_, f_1739_, (byte) 30), Class388.method6456(i_1744_, i_1737_, f_1740_, (byte) -38));
					return;
				}
				anInt1462 = i_1742_;
				anInt1464 = aClass180_Sub1_1456.method14822(i_1741_);
				anInt1476 = anInt1464 - 1;
				aClass595_1478 = aClass180_Sub1_1456.method14823(i_1741_);
				aBool1477 = aClass180_Sub1_1456.method14834(i_1741_);
				anInt1468 = aClass180_Sub1_1456.method14824(i_1741_) & 0xff;
			}
			anInt1461 = i_1737_;
			if (!(f <= f_1718_) || !(f <= f_1719_)) {
				if (f_1718_ <= f_1719_) {
					float f_1745_ = f_1720_;
					f_1720_ = f_1721_;
					f_1721_ = f_1745_;
					f_1745_ = f;
					f = f_1718_;
					f_1718_ = f_1745_;
					f_1745_ = f_1723_;
					f_1723_ = f_1724_;
					f_1724_ = f_1745_;
					f_1745_ = f_1729_;
					f_1729_ = f_1730_;
					f_1730_ = f_1745_;
					f_1745_ = f_1732_;
					f_1732_ = f_1733_;
					f_1733_ = f_1745_;
					f_1745_ = f_1726_;
					f_1726_ = f_1727_;
					f_1727_ = f_1745_;
					f_1745_ = f_1738_;
					f_1738_ = f_1739_;
					f_1739_ = f_1745_;
					int i_1746_ = i;
					i = i_1735_;
					i_1735_ = i_1746_;
				} else {
					float f_1747_ = f_1720_;
					f_1720_ = f_1722_;
					f_1722_ = f_1747_;
					f_1747_ = f;
					f = f_1719_;
					f_1719_ = f_1747_;
					f_1747_ = f_1723_;
					f_1723_ = f_1725_;
					f_1725_ = f_1747_;
					f_1747_ = f_1729_;
					f_1729_ = f_1731_;
					f_1731_ = f_1747_;
					f_1747_ = f_1732_;
					f_1732_ = f_1734_;
					f_1734_ = f_1747_;
					f_1747_ = f_1726_;
					f_1726_ = f_1728_;
					f_1728_ = f_1747_;
					f_1747_ = f_1738_;
					f_1738_ = f_1740_;
					f_1740_ = f_1747_;
					int i_1748_ = i;
					i = i_1736_;
					i_1736_ = i_1748_;
				}
			}
			f_1729_ /= f_1726_;
			f_1730_ /= f_1727_;
			f_1731_ /= f_1728_;
			f_1732_ /= f_1726_;
			f_1733_ /= f_1727_;
			f_1734_ /= f_1728_;
			f_1723_ = 1.0F / f_1723_;
			f_1724_ = 1.0F / f_1724_;
			f_1725_ = 1.0F / f_1725_;
			f_1726_ = 1.0F / f_1726_;
			f_1727_ = 1.0F / f_1727_;
			f_1728_ = 1.0F / f_1728_;
			float f_1749_ = (float) (i >> 24 & 0xff);
			float f_1750_ = (float) (i_1735_ >> 24 & 0xff);
			float f_1751_ = (float) (i_1736_ >> 24 & 0xff);
			float f_1752_ = (float) (i >> 16 & 0xff);
			float f_1753_ = (float) (i_1735_ >> 16 & 0xff);
			float f_1754_ = (float) (i_1736_ >> 16 & 0xff);
			float f_1755_ = (float) (i >> 8 & 0xff);
			float f_1756_ = (float) (i_1735_ >> 8 & 0xff);
			float f_1757_ = (float) (i_1736_ >> 8 & 0xff);
			float f_1758_ = (float) (i & 0xff);
			float f_1759_ = (float) (i_1735_ & 0xff);
			float f_1760_ = (float) (i_1736_ & 0xff);
			float f_1761_ = 0.0F;
			float f_1762_ = 0.0F;
			float f_1763_ = 0.0F;
			float f_1764_ = 0.0F;
			float f_1765_ = 0.0F;
			float f_1766_ = 0.0F;
			float f_1767_ = 0.0F;
			float f_1768_ = 0.0F;
			float f_1769_ = 0.0F;
			float f_1770_ = 0.0F;
			if (f_1718_ != f) {
				float f_1771_ = f_1718_ - f;
				f_1761_ = (f_1721_ - f_1720_) / f_1771_;
				f_1762_ = (f_1724_ - f_1723_) / f_1771_;
				f_1763_ = (f_1727_ - f_1726_) / f_1771_;
				f_1764_ = (f_1730_ - f_1729_) / f_1771_;
				f_1765_ = (f_1733_ - f_1732_) / f_1771_;
				f_1766_ = (f_1739_ - f_1738_) / f_1771_;
				f_1767_ = (f_1750_ - f_1749_) / f_1771_;
				f_1768_ = (f_1753_ - f_1752_) / f_1771_;
				f_1769_ = (f_1756_ - f_1755_) / f_1771_;
				f_1770_ = (f_1759_ - f_1758_) / f_1771_;
			}
			float f_1772_ = 0.0F;
			float f_1773_ = 0.0F;
			float f_1774_ = 0.0F;
			float f_1775_ = 0.0F;
			float f_1776_ = 0.0F;
			float f_1777_ = 0.0F;
			float f_1778_ = 0.0F;
			float f_1779_ = 0.0F;
			float f_1780_ = 0.0F;
			float f_1781_ = 0.0F;
			if (f_1719_ != f_1718_) {
				float f_1782_ = f_1719_ - f_1718_;
				f_1772_ = (f_1722_ - f_1721_) / f_1782_;
				f_1773_ = (f_1725_ - f_1724_) / f_1782_;
				f_1774_ = (f_1728_ - f_1727_) / f_1782_;
				f_1775_ = (f_1731_ - f_1730_) / f_1782_;
				f_1776_ = (f_1734_ - f_1733_) / f_1782_;
				f_1777_ = (f_1740_ - f_1739_) / f_1782_;
				f_1778_ = (f_1751_ - f_1750_) / f_1782_;
				f_1779_ = (f_1754_ - f_1753_) / f_1782_;
				f_1780_ = (f_1757_ - f_1756_) / f_1782_;
				f_1781_ = (f_1760_ - f_1759_) / f_1782_;
			}
			float f_1783_ = 0.0F;
			float f_1784_ = 0.0F;
			float f_1785_ = 0.0F;
			float f_1786_ = 0.0F;
			float f_1787_ = 0.0F;
			float f_1788_ = 0.0F;
			float f_1789_ = 0.0F;
			float f_1790_ = 0.0F;
			float f_1791_ = 0.0F;
			float f_1792_ = 0.0F;
			if (f != f_1719_) {
				float f_1793_ = f - f_1719_;
				f_1783_ = (f_1720_ - f_1722_) / f_1793_;
				f_1784_ = (f_1723_ - f_1725_) / f_1793_;
				f_1785_ = (f_1726_ - f_1728_) / f_1793_;
				f_1786_ = (f_1729_ - f_1731_) / f_1793_;
				f_1787_ = (f_1732_ - f_1734_) / f_1793_;
				f_1788_ = (f_1738_ - f_1740_) / f_1793_;
				f_1789_ = (f_1749_ - f_1751_) / f_1793_;
				f_1790_ = (f_1752_ - f_1754_) / f_1793_;
				f_1791_ = (f_1755_ - f_1757_) / f_1793_;
				f_1792_ = (f_1758_ - f_1760_) / f_1793_;
			}
			if (!(f >= (float) anInt1450)) {
				if (f_1718_ > (float) anInt1450)
					f_1718_ = (float) anInt1450;
				if (f_1719_ > (float) anInt1450)
					f_1719_ = (float) anInt1450;
				if (f_1718_ < f_1719_) {
					f_1722_ = f_1720_;
					f_1725_ = f_1723_;
					f_1728_ = f_1726_;
					f_1731_ = f_1729_;
					f_1734_ = f_1732_;
					f_1740_ = f_1738_;
					f_1751_ = f_1749_;
					f_1754_ = f_1752_;
					f_1757_ = f_1755_;
					f_1760_ = f_1758_;
					if (f < 0.0F) {
						f_1720_ -= f_1761_ * f;
						f_1722_ -= f_1783_ * f;
						f_1723_ -= f_1762_ * f;
						f_1725_ -= f_1784_ * f;
						f_1726_ -= f_1763_ * f;
						f_1728_ -= f_1785_ * f;
						f_1729_ -= f_1764_ * f;
						f_1731_ -= f_1786_ * f;
						f_1732_ -= f_1765_ * f;
						f_1734_ -= f_1787_ * f;
						f_1738_ -= f_1766_ * f;
						f_1740_ -= f_1788_ * f;
						f_1749_ -= f_1767_ * f;
						f_1751_ -= f_1789_ * f;
						f_1752_ -= f_1767_ * f;
						f_1754_ -= f_1789_ * f;
						f_1755_ -= f_1767_ * f;
						f_1757_ -= f_1789_ * f;
						f_1758_ -= f_1767_ * f;
						f_1760_ -= f_1789_ * f;
						f = 0.0F;
					}
					if (f_1718_ < 0.0F) {
						f_1721_ -= f_1772_ * f_1718_;
						f_1724_ -= f_1773_ * f_1718_;
						f_1727_ -= f_1774_ * f_1718_;
						f_1730_ -= f_1775_ * f_1718_;
						f_1733_ -= f_1776_ * f_1718_;
						f_1739_ -= f_1777_ * f_1718_;
						f_1750_ -= f_1778_ * f_1718_;
						f_1753_ -= f_1779_ * f_1718_;
						f_1756_ -= f_1780_ * f_1718_;
						f_1759_ -= f_1781_ * f_1718_;
						f_1718_ = 0.0F;
					}
					if (f != f_1718_ && f_1783_ < f_1761_ || f == f_1718_ && f_1783_ > f_1772_) {
						f += 0.5F;
						f_1718_ += 0.5F;
						f_1719_ = (float) (int) (f_1719_ + 0.5F) - f_1718_;
						f_1718_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_1718_ >= 0.0F) {
							method2081(bool_1716_, bool_1717_, anIntArray1459, anIntArray1463, (int) f, (int) f_1722_, (int) f_1720_, f_1725_, f_1723_, f_1728_, f_1726_, f_1731_, f_1729_, f_1734_, f_1732_, f_1740_, f_1738_, f_1751_, f_1749_, f_1754_, f_1752_, f_1757_, f_1755_, f_1760_, f_1758_);
							f_1720_ += f_1761_;
							f_1722_ += f_1783_;
							f_1723_ += f_1762_;
							f_1725_ += f_1784_;
							f_1726_ += f_1763_;
							f_1728_ += f_1785_;
							f_1729_ += f_1764_;
							f_1731_ += f_1786_;
							f_1732_ += f_1765_;
							f_1734_ += f_1787_;
							f_1738_ += f_1766_;
							f_1740_ += f_1788_;
							f_1749_ += f_1767_;
							f_1751_ += f_1789_;
							f_1752_ += f_1768_;
							f_1754_ += f_1790_;
							f_1755_ += f_1769_;
							f_1757_ += f_1791_;
							f_1758_ += f_1770_;
							f_1760_ += f_1792_;
							f += (float) anInt1458;
						}
						while (--f_1719_ >= 0.0F) {
							method2081(bool_1716_, bool_1717_, anIntArray1459, anIntArray1463, (int) f, (int) f_1722_, (int) f_1721_, f_1725_, f_1724_, f_1728_, f_1727_, f_1731_, f_1730_, f_1734_, f_1733_, f_1740_, f_1739_, f_1751_, f_1750_, f_1754_, f_1753_, f_1757_, f_1756_, f_1760_, f_1759_);
							f_1721_ += f_1772_;
							f_1722_ += f_1783_;
							f_1724_ += f_1773_;
							f_1725_ += f_1784_;
							f_1727_ += f_1774_;
							f_1728_ += f_1785_;
							f_1730_ += f_1775_;
							f_1731_ += f_1786_;
							f_1733_ += f_1776_;
							f_1734_ += f_1787_;
							f_1739_ += f_1777_;
							f_1740_ += f_1788_;
							f_1750_ += f_1778_;
							f_1751_ += f_1789_;
							f_1753_ += f_1779_;
							f_1754_ += f_1790_;
							f_1756_ += f_1780_;
							f_1757_ += f_1791_;
							f_1759_ += f_1781_;
							f_1760_ += f_1792_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_1718_ += 0.5F;
						f_1719_ = (float) (int) (f_1719_ + 0.5F) - f_1718_;
						f_1718_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_1718_ >= 0.0F) {
							method2081(bool_1716_, bool_1717_, anIntArray1459, anIntArray1463, (int) f, (int) f_1720_, (int) f_1722_, f_1723_, f_1725_, f_1726_, f_1728_, f_1729_, f_1731_, f_1732_, f_1734_, f_1738_, f_1740_, f_1749_, f_1751_, f_1752_, f_1754_, f_1755_, f_1757_, f_1758_, f_1760_);
							f_1720_ += f_1761_;
							f_1722_ += f_1783_;
							f_1723_ += f_1762_;
							f_1725_ += f_1784_;
							f_1726_ += f_1763_;
							f_1728_ += f_1785_;
							f_1729_ += f_1764_;
							f_1731_ += f_1786_;
							f_1732_ += f_1765_;
							f_1734_ += f_1787_;
							f_1738_ += f_1766_;
							f_1740_ += f_1788_;
							f_1749_ += f_1767_;
							f_1751_ += f_1789_;
							f_1752_ += f_1768_;
							f_1754_ += f_1790_;
							f_1755_ += f_1769_;
							f_1757_ += f_1791_;
							f_1758_ += f_1770_;
							f_1760_ += f_1792_;
							f += (float) anInt1458;
						}
						while (--f_1719_ >= 0.0F) {
							method2081(bool_1716_, bool_1717_, anIntArray1459, anIntArray1463, (int) f, (int) f_1721_, (int) f_1722_, f_1724_, f_1725_, f_1727_, f_1728_, f_1730_, f_1731_, f_1733_, f_1734_, f_1739_, f_1740_, f_1750_, f_1751_, f_1753_, f_1754_, f_1756_, f_1757_, f_1759_, f_1760_);
							f_1721_ += f_1772_;
							f_1722_ += f_1783_;
							f_1724_ += f_1773_;
							f_1725_ += f_1784_;
							f_1727_ += f_1774_;
							f_1728_ += f_1785_;
							f_1730_ += f_1775_;
							f_1731_ += f_1786_;
							f_1733_ += f_1776_;
							f_1734_ += f_1787_;
							f_1739_ += f_1777_;
							f_1740_ += f_1788_;
							f_1750_ += f_1778_;
							f_1751_ += f_1789_;
							f_1753_ += f_1779_;
							f_1754_ += f_1790_;
							f_1756_ += f_1780_;
							f_1757_ += f_1791_;
							f_1759_ += f_1781_;
							f_1760_ += f_1792_;
							f += (float) anInt1458;
						}
					}
				} else {
					f_1721_ = f_1720_;
					f_1724_ = f_1723_;
					f_1727_ = f_1726_;
					f_1730_ = f_1729_;
					f_1733_ = f_1732_;
					f_1739_ = f_1738_;
					f_1750_ = f_1749_;
					f_1753_ = f_1752_;
					f_1756_ = f_1755_;
					f_1759_ = f_1758_;
					if (f < 0.0F) {
						f_1720_ -= f_1761_ * f;
						f_1721_ -= f_1783_ * f;
						f_1723_ -= f_1762_ * f;
						f_1724_ -= f_1784_ * f;
						f_1726_ -= f_1763_ * f;
						f_1727_ -= f_1785_ * f;
						f_1729_ -= f_1764_ * f;
						f_1730_ -= f_1786_ * f;
						f_1732_ -= f_1765_ * f;
						f_1733_ -= f_1787_ * f;
						f_1738_ -= f_1766_ * f;
						f_1739_ -= f_1788_ * f;
						f_1749_ -= f_1767_ * f;
						f_1750_ -= f_1789_ * f;
						f_1752_ -= f_1767_ * f;
						f_1753_ -= f_1789_ * f;
						f_1755_ -= f_1767_ * f;
						f_1756_ -= f_1789_ * f;
						f_1758_ -= f_1767_ * f;
						f_1759_ -= f_1789_ * f;
						f = 0.0F;
					}
					if (f_1719_ < 0.0F) {
						f_1722_ -= f_1772_ * f_1719_;
						f_1725_ -= f_1773_ * f_1719_;
						f_1728_ -= f_1774_ * f_1719_;
						f_1731_ -= f_1775_ * f_1719_;
						f_1734_ -= f_1776_ * f_1719_;
						f_1740_ -= f_1777_ * f_1719_;
						f_1751_ -= f_1778_ * f_1719_;
						f_1754_ -= f_1779_ * f_1719_;
						f_1757_ -= f_1780_ * f_1719_;
						f_1760_ -= f_1781_ * f_1719_;
						f_1719_ = 0.0F;
					}
					if (f != f_1719_ && f_1783_ < f_1761_ || f == f_1719_ && f_1772_ > f_1761_) {
						f += 0.5F;
						f_1719_ += 0.5F;
						f_1718_ = (float) (int) (f_1718_ + 0.5F) - f_1719_;
						f_1719_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_1719_ >= 0.0F) {
							method2081(bool_1716_, bool_1717_, anIntArray1459, anIntArray1463, (int) f, (int) f_1721_, (int) f_1720_, f_1724_, f_1723_, f_1727_, f_1726_, f_1730_, f_1729_, f_1733_, f_1732_, f_1739_, f_1738_, f_1750_, f_1749_, f_1753_, f_1752_, f_1756_, f_1755_, f_1759_, f_1758_);
							f_1720_ += f_1761_;
							f_1721_ += f_1783_;
							f_1723_ += f_1762_;
							f_1724_ += f_1784_;
							f_1726_ += f_1763_;
							f_1727_ += f_1785_;
							f_1729_ += f_1764_;
							f_1730_ += f_1786_;
							f_1732_ += f_1765_;
							f_1733_ += f_1787_;
							f_1738_ += f_1766_;
							f_1739_ += f_1788_;
							f_1749_ += f_1767_;
							f_1750_ += f_1789_;
							f_1752_ += f_1768_;
							f_1753_ += f_1790_;
							f_1755_ += f_1769_;
							f_1756_ += f_1791_;
							f_1758_ += f_1770_;
							f_1759_ += f_1792_;
							f += (float) anInt1458;
						}
						while (--f_1718_ >= 0.0F) {
							method2081(bool_1716_, bool_1717_, anIntArray1459, anIntArray1463, (int) f, (int) f_1722_, (int) f_1720_, f_1725_, f_1723_, f_1728_, f_1726_, f_1731_, f_1729_, f_1734_, f_1732_, f_1740_, f_1738_, f_1751_, f_1749_, f_1754_, f_1752_, f_1757_, f_1755_, f_1760_, f_1758_);
							f_1722_ += f_1772_;
							f_1720_ += f_1761_;
							f_1725_ += f_1773_;
							f_1723_ += f_1762_;
							f_1728_ += f_1774_;
							f_1726_ += f_1763_;
							f_1731_ += f_1775_;
							f_1729_ += f_1764_;
							f_1734_ += f_1776_;
							f_1732_ += f_1765_;
							f_1740_ += f_1777_;
							f_1738_ += f_1766_;
							f_1751_ += f_1778_;
							f_1749_ += f_1767_;
							f_1754_ += f_1779_;
							f_1752_ += f_1768_;
							f_1757_ += f_1780_;
							f_1755_ += f_1769_;
							f_1760_ += f_1781_;
							f_1758_ += f_1770_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_1719_ += 0.5F;
						f_1718_ = (float) (int) (f_1718_ + 0.5F) - f_1719_;
						f_1719_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_1719_ >= 0.0F) {
							method2081(bool_1716_, bool_1717_, anIntArray1459, anIntArray1463, (int) f, (int) f_1720_, (int) f_1721_, f_1723_, f_1724_, f_1726_, f_1727_, f_1729_, f_1730_, f_1732_, f_1733_, f_1738_, f_1739_, f_1749_, f_1750_, f_1752_, f_1753_, f_1755_, f_1756_, f_1758_, f_1759_);
							f_1721_ += f_1783_;
							f_1720_ += f_1761_;
							f_1724_ += f_1784_;
							f_1723_ += f_1762_;
							f_1727_ += f_1785_;
							f_1726_ += f_1763_;
							f_1730_ += f_1786_;
							f_1729_ += f_1764_;
							f_1733_ += f_1787_;
							f_1732_ += f_1765_;
							f_1739_ += f_1788_;
							f_1738_ += f_1766_;
							f_1750_ += f_1789_;
							f_1749_ += f_1767_;
							f_1753_ += f_1790_;
							f_1752_ += f_1768_;
							f_1756_ += f_1791_;
							f_1755_ += f_1769_;
							f_1759_ += f_1792_;
							f_1758_ += f_1770_;
							f += (float) anInt1458;
						}
						while (--f_1718_ >= 0.0F) {
							method2081(bool_1716_, bool_1717_, anIntArray1459, anIntArray1463, (int) f, (int) f_1720_, (int) f_1722_, f_1723_, f_1725_, f_1726_, f_1728_, f_1729_, f_1731_, f_1732_, f_1734_, f_1738_, f_1740_, f_1749_, f_1751_, f_1752_, f_1754_, f_1755_, f_1757_, f_1758_, f_1760_);
							f_1720_ += f_1761_;
							f_1722_ += f_1772_;
							f_1723_ += f_1762_;
							f_1725_ += f_1773_;
							f_1726_ += f_1763_;
							f_1728_ += f_1774_;
							f_1729_ += f_1764_;
							f_1731_ += f_1775_;
							f_1732_ += f_1765_;
							f_1734_ += f_1776_;
							f_1738_ += f_1766_;
							f_1740_ += f_1777_;
							f_1749_ += f_1767_;
							f_1751_ += f_1778_;
							f_1752_ += f_1768_;
							f_1754_ += f_1779_;
							f_1755_ += f_1769_;
							f_1757_ += f_1780_;
							f_1758_ += f_1770_;
							f_1760_ += f_1781_;
							f += (float) anInt1458;
						}
					}
				}
			}
		}
	}

	final void method2110(boolean bool, boolean bool_1794_, boolean bool_1795_, float f, float f_1796_, float f_1797_, float f_1798_, float f_1799_, float f_1800_, float f_1801_, float f_1802_, float f_1803_, float f_1804_, float f_1805_, float f_1806_, float f_1807_, float f_1808_, float f_1809_, float f_1810_, float f_1811_, float f_1812_, int i, int i_1813_, int i_1814_, int i_1815_, float f_1816_, float f_1817_, float f_1818_, int i_1819_) {
		if (!bool)
			method2077(false, bool_1794_, bool_1795_, f, f_1796_, f_1797_, f_1798_, f_1799_, f_1800_, f_1801_, f_1802_, f_1803_, 0);
		else {
			int i_1820_ = i_1819_ & 0xffff;
			if (i_1820_ != anInt1462) {
				anIntArray1463 = aClass180_Sub1_1456.method14841(i_1820_);
				if (anIntArray1463 == null) {
					anInt1462 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					anInt1468 = 0;
					int i_1821_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_1819_), (byte) 10) & 0xffff]);
					int i_1822_ = (~0xffffff | ((i >> 16 & 0xff) * (i_1821_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_1821_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_1821_ & 0xff) >> 8);
					method2106(true, bool_1794_, bool_1795_, f, f_1796_, f_1797_, f_1798_, f_1799_, f_1800_, f_1801_, f_1802_, f_1803_, Class388.method6456(i_1822_, i_1815_, f_1816_, (byte) 16), Class388.method6456(i_1822_, i_1815_, f_1817_, (byte) -14), Class388.method6456(i_1822_, i_1815_, f_1818_, (byte) 6));
					return;
				}
				anInt1462 = i_1820_;
				anInt1464 = aClass180_Sub1_1456.method14822(i_1819_);
				anInt1476 = anInt1464 - 1;
				aClass595_1478 = aClass180_Sub1_1456.method14823(i_1819_);
				aBool1477 = aClass180_Sub1_1456.method14834(i_1819_);
				anInt1468 = aClass180_Sub1_1456.method14824(i_1819_) & 0xff;
			}
			anInt1461 = i_1815_;
			if (!(f <= f_1796_) || !(f <= f_1797_)) {
				if (f_1796_ <= f_1797_) {
					float f_1823_ = f_1798_;
					f_1798_ = f_1799_;
					f_1799_ = f_1823_;
					f_1823_ = f;
					f = f_1796_;
					f_1796_ = f_1823_;
					f_1823_ = f_1801_;
					f_1801_ = f_1802_;
					f_1802_ = f_1823_;
					f_1823_ = f_1807_;
					f_1807_ = f_1808_;
					f_1808_ = f_1823_;
					f_1823_ = f_1810_;
					f_1810_ = f_1811_;
					f_1811_ = f_1823_;
					f_1823_ = f_1804_;
					f_1804_ = f_1805_;
					f_1805_ = f_1823_;
					f_1823_ = f_1816_;
					f_1816_ = f_1817_;
					f_1817_ = f_1823_;
					int i_1824_ = i;
					i = i_1813_;
					i_1813_ = i_1824_;
				} else {
					float f_1825_ = f_1798_;
					f_1798_ = f_1800_;
					f_1800_ = f_1825_;
					f_1825_ = f;
					f = f_1797_;
					f_1797_ = f_1825_;
					f_1825_ = f_1801_;
					f_1801_ = f_1803_;
					f_1803_ = f_1825_;
					f_1825_ = f_1807_;
					f_1807_ = f_1809_;
					f_1809_ = f_1825_;
					f_1825_ = f_1810_;
					f_1810_ = f_1812_;
					f_1812_ = f_1825_;
					f_1825_ = f_1804_;
					f_1804_ = f_1806_;
					f_1806_ = f_1825_;
					f_1825_ = f_1816_;
					f_1816_ = f_1818_;
					f_1818_ = f_1825_;
					int i_1826_ = i;
					i = i_1814_;
					i_1814_ = i_1826_;
				}
			}
			f_1807_ /= f_1804_;
			f_1808_ /= f_1805_;
			f_1809_ /= f_1806_;
			f_1810_ /= f_1804_;
			f_1811_ /= f_1805_;
			f_1812_ /= f_1806_;
			f_1801_ = 1.0F / f_1801_;
			f_1802_ = 1.0F / f_1802_;
			f_1803_ = 1.0F / f_1803_;
			f_1804_ = 1.0F / f_1804_;
			f_1805_ = 1.0F / f_1805_;
			f_1806_ = 1.0F / f_1806_;
			float f_1827_ = (float) (i >> 24 & 0xff);
			float f_1828_ = (float) (i_1813_ >> 24 & 0xff);
			float f_1829_ = (float) (i_1814_ >> 24 & 0xff);
			float f_1830_ = (float) (i >> 16 & 0xff);
			float f_1831_ = (float) (i_1813_ >> 16 & 0xff);
			float f_1832_ = (float) (i_1814_ >> 16 & 0xff);
			float f_1833_ = (float) (i >> 8 & 0xff);
			float f_1834_ = (float) (i_1813_ >> 8 & 0xff);
			float f_1835_ = (float) (i_1814_ >> 8 & 0xff);
			float f_1836_ = (float) (i & 0xff);
			float f_1837_ = (float) (i_1813_ & 0xff);
			float f_1838_ = (float) (i_1814_ & 0xff);
			float f_1839_ = 0.0F;
			float f_1840_ = 0.0F;
			float f_1841_ = 0.0F;
			float f_1842_ = 0.0F;
			float f_1843_ = 0.0F;
			float f_1844_ = 0.0F;
			float f_1845_ = 0.0F;
			float f_1846_ = 0.0F;
			float f_1847_ = 0.0F;
			float f_1848_ = 0.0F;
			if (f_1796_ != f) {
				float f_1849_ = f_1796_ - f;
				f_1839_ = (f_1799_ - f_1798_) / f_1849_;
				f_1840_ = (f_1802_ - f_1801_) / f_1849_;
				f_1841_ = (f_1805_ - f_1804_) / f_1849_;
				f_1842_ = (f_1808_ - f_1807_) / f_1849_;
				f_1843_ = (f_1811_ - f_1810_) / f_1849_;
				f_1844_ = (f_1817_ - f_1816_) / f_1849_;
				f_1845_ = (f_1828_ - f_1827_) / f_1849_;
				f_1846_ = (f_1831_ - f_1830_) / f_1849_;
				f_1847_ = (f_1834_ - f_1833_) / f_1849_;
				f_1848_ = (f_1837_ - f_1836_) / f_1849_;
			}
			float f_1850_ = 0.0F;
			float f_1851_ = 0.0F;
			float f_1852_ = 0.0F;
			float f_1853_ = 0.0F;
			float f_1854_ = 0.0F;
			float f_1855_ = 0.0F;
			float f_1856_ = 0.0F;
			float f_1857_ = 0.0F;
			float f_1858_ = 0.0F;
			float f_1859_ = 0.0F;
			if (f_1797_ != f_1796_) {
				float f_1860_ = f_1797_ - f_1796_;
				f_1850_ = (f_1800_ - f_1799_) / f_1860_;
				f_1851_ = (f_1803_ - f_1802_) / f_1860_;
				f_1852_ = (f_1806_ - f_1805_) / f_1860_;
				f_1853_ = (f_1809_ - f_1808_) / f_1860_;
				f_1854_ = (f_1812_ - f_1811_) / f_1860_;
				f_1855_ = (f_1818_ - f_1817_) / f_1860_;
				f_1856_ = (f_1829_ - f_1828_) / f_1860_;
				f_1857_ = (f_1832_ - f_1831_) / f_1860_;
				f_1858_ = (f_1835_ - f_1834_) / f_1860_;
				f_1859_ = (f_1838_ - f_1837_) / f_1860_;
			}
			float f_1861_ = 0.0F;
			float f_1862_ = 0.0F;
			float f_1863_ = 0.0F;
			float f_1864_ = 0.0F;
			float f_1865_ = 0.0F;
			float f_1866_ = 0.0F;
			float f_1867_ = 0.0F;
			float f_1868_ = 0.0F;
			float f_1869_ = 0.0F;
			float f_1870_ = 0.0F;
			if (f != f_1797_) {
				float f_1871_ = f - f_1797_;
				f_1861_ = (f_1798_ - f_1800_) / f_1871_;
				f_1862_ = (f_1801_ - f_1803_) / f_1871_;
				f_1863_ = (f_1804_ - f_1806_) / f_1871_;
				f_1864_ = (f_1807_ - f_1809_) / f_1871_;
				f_1865_ = (f_1810_ - f_1812_) / f_1871_;
				f_1866_ = (f_1816_ - f_1818_) / f_1871_;
				f_1867_ = (f_1827_ - f_1829_) / f_1871_;
				f_1868_ = (f_1830_ - f_1832_) / f_1871_;
				f_1869_ = (f_1833_ - f_1835_) / f_1871_;
				f_1870_ = (f_1836_ - f_1838_) / f_1871_;
			}
			if (!(f >= (float) anInt1450)) {
				if (f_1796_ > (float) anInt1450)
					f_1796_ = (float) anInt1450;
				if (f_1797_ > (float) anInt1450)
					f_1797_ = (float) anInt1450;
				if (f_1796_ < f_1797_) {
					f_1800_ = f_1798_;
					f_1803_ = f_1801_;
					f_1806_ = f_1804_;
					f_1809_ = f_1807_;
					f_1812_ = f_1810_;
					f_1818_ = f_1816_;
					f_1829_ = f_1827_;
					f_1832_ = f_1830_;
					f_1835_ = f_1833_;
					f_1838_ = f_1836_;
					if (f < 0.0F) {
						f_1798_ -= f_1839_ * f;
						f_1800_ -= f_1861_ * f;
						f_1801_ -= f_1840_ * f;
						f_1803_ -= f_1862_ * f;
						f_1804_ -= f_1841_ * f;
						f_1806_ -= f_1863_ * f;
						f_1807_ -= f_1842_ * f;
						f_1809_ -= f_1864_ * f;
						f_1810_ -= f_1843_ * f;
						f_1812_ -= f_1865_ * f;
						f_1816_ -= f_1844_ * f;
						f_1818_ -= f_1866_ * f;
						f_1827_ -= f_1845_ * f;
						f_1829_ -= f_1867_ * f;
						f_1830_ -= f_1845_ * f;
						f_1832_ -= f_1867_ * f;
						f_1833_ -= f_1845_ * f;
						f_1835_ -= f_1867_ * f;
						f_1836_ -= f_1845_ * f;
						f_1838_ -= f_1867_ * f;
						f = 0.0F;
					}
					if (f_1796_ < 0.0F) {
						f_1799_ -= f_1850_ * f_1796_;
						f_1802_ -= f_1851_ * f_1796_;
						f_1805_ -= f_1852_ * f_1796_;
						f_1808_ -= f_1853_ * f_1796_;
						f_1811_ -= f_1854_ * f_1796_;
						f_1817_ -= f_1855_ * f_1796_;
						f_1828_ -= f_1856_ * f_1796_;
						f_1831_ -= f_1857_ * f_1796_;
						f_1834_ -= f_1858_ * f_1796_;
						f_1837_ -= f_1859_ * f_1796_;
						f_1796_ = 0.0F;
					}
					if (f != f_1796_ && f_1861_ < f_1839_ || f == f_1796_ && f_1861_ > f_1850_) {
						f += 0.5F;
						f_1796_ += 0.5F;
						f_1797_ = (float) (int) (f_1797_ + 0.5F) - f_1796_;
						f_1796_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_1796_ >= 0.0F) {
							method2081(bool_1794_, bool_1795_, anIntArray1459, anIntArray1463, (int) f, (int) f_1800_, (int) f_1798_, f_1803_, f_1801_, f_1806_, f_1804_, f_1809_, f_1807_, f_1812_, f_1810_, f_1818_, f_1816_, f_1829_, f_1827_, f_1832_, f_1830_, f_1835_, f_1833_, f_1838_, f_1836_);
							f_1798_ += f_1839_;
							f_1800_ += f_1861_;
							f_1801_ += f_1840_;
							f_1803_ += f_1862_;
							f_1804_ += f_1841_;
							f_1806_ += f_1863_;
							f_1807_ += f_1842_;
							f_1809_ += f_1864_;
							f_1810_ += f_1843_;
							f_1812_ += f_1865_;
							f_1816_ += f_1844_;
							f_1818_ += f_1866_;
							f_1827_ += f_1845_;
							f_1829_ += f_1867_;
							f_1830_ += f_1846_;
							f_1832_ += f_1868_;
							f_1833_ += f_1847_;
							f_1835_ += f_1869_;
							f_1836_ += f_1848_;
							f_1838_ += f_1870_;
							f += (float) anInt1458;
						}
						while (--f_1797_ >= 0.0F) {
							method2081(bool_1794_, bool_1795_, anIntArray1459, anIntArray1463, (int) f, (int) f_1800_, (int) f_1799_, f_1803_, f_1802_, f_1806_, f_1805_, f_1809_, f_1808_, f_1812_, f_1811_, f_1818_, f_1817_, f_1829_, f_1828_, f_1832_, f_1831_, f_1835_, f_1834_, f_1838_, f_1837_);
							f_1799_ += f_1850_;
							f_1800_ += f_1861_;
							f_1802_ += f_1851_;
							f_1803_ += f_1862_;
							f_1805_ += f_1852_;
							f_1806_ += f_1863_;
							f_1808_ += f_1853_;
							f_1809_ += f_1864_;
							f_1811_ += f_1854_;
							f_1812_ += f_1865_;
							f_1817_ += f_1855_;
							f_1818_ += f_1866_;
							f_1828_ += f_1856_;
							f_1829_ += f_1867_;
							f_1831_ += f_1857_;
							f_1832_ += f_1868_;
							f_1834_ += f_1858_;
							f_1835_ += f_1869_;
							f_1837_ += f_1859_;
							f_1838_ += f_1870_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_1796_ += 0.5F;
						f_1797_ = (float) (int) (f_1797_ + 0.5F) - f_1796_;
						f_1796_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_1796_ >= 0.0F) {
							method2081(bool_1794_, bool_1795_, anIntArray1459, anIntArray1463, (int) f, (int) f_1798_, (int) f_1800_, f_1801_, f_1803_, f_1804_, f_1806_, f_1807_, f_1809_, f_1810_, f_1812_, f_1816_, f_1818_, f_1827_, f_1829_, f_1830_, f_1832_, f_1833_, f_1835_, f_1836_, f_1838_);
							f_1798_ += f_1839_;
							f_1800_ += f_1861_;
							f_1801_ += f_1840_;
							f_1803_ += f_1862_;
							f_1804_ += f_1841_;
							f_1806_ += f_1863_;
							f_1807_ += f_1842_;
							f_1809_ += f_1864_;
							f_1810_ += f_1843_;
							f_1812_ += f_1865_;
							f_1816_ += f_1844_;
							f_1818_ += f_1866_;
							f_1827_ += f_1845_;
							f_1829_ += f_1867_;
							f_1830_ += f_1846_;
							f_1832_ += f_1868_;
							f_1833_ += f_1847_;
							f_1835_ += f_1869_;
							f_1836_ += f_1848_;
							f_1838_ += f_1870_;
							f += (float) anInt1458;
						}
						while (--f_1797_ >= 0.0F) {
							method2081(bool_1794_, bool_1795_, anIntArray1459, anIntArray1463, (int) f, (int) f_1799_, (int) f_1800_, f_1802_, f_1803_, f_1805_, f_1806_, f_1808_, f_1809_, f_1811_, f_1812_, f_1817_, f_1818_, f_1828_, f_1829_, f_1831_, f_1832_, f_1834_, f_1835_, f_1837_, f_1838_);
							f_1799_ += f_1850_;
							f_1800_ += f_1861_;
							f_1802_ += f_1851_;
							f_1803_ += f_1862_;
							f_1805_ += f_1852_;
							f_1806_ += f_1863_;
							f_1808_ += f_1853_;
							f_1809_ += f_1864_;
							f_1811_ += f_1854_;
							f_1812_ += f_1865_;
							f_1817_ += f_1855_;
							f_1818_ += f_1866_;
							f_1828_ += f_1856_;
							f_1829_ += f_1867_;
							f_1831_ += f_1857_;
							f_1832_ += f_1868_;
							f_1834_ += f_1858_;
							f_1835_ += f_1869_;
							f_1837_ += f_1859_;
							f_1838_ += f_1870_;
							f += (float) anInt1458;
						}
					}
				} else {
					f_1799_ = f_1798_;
					f_1802_ = f_1801_;
					f_1805_ = f_1804_;
					f_1808_ = f_1807_;
					f_1811_ = f_1810_;
					f_1817_ = f_1816_;
					f_1828_ = f_1827_;
					f_1831_ = f_1830_;
					f_1834_ = f_1833_;
					f_1837_ = f_1836_;
					if (f < 0.0F) {
						f_1798_ -= f_1839_ * f;
						f_1799_ -= f_1861_ * f;
						f_1801_ -= f_1840_ * f;
						f_1802_ -= f_1862_ * f;
						f_1804_ -= f_1841_ * f;
						f_1805_ -= f_1863_ * f;
						f_1807_ -= f_1842_ * f;
						f_1808_ -= f_1864_ * f;
						f_1810_ -= f_1843_ * f;
						f_1811_ -= f_1865_ * f;
						f_1816_ -= f_1844_ * f;
						f_1817_ -= f_1866_ * f;
						f_1827_ -= f_1845_ * f;
						f_1828_ -= f_1867_ * f;
						f_1830_ -= f_1845_ * f;
						f_1831_ -= f_1867_ * f;
						f_1833_ -= f_1845_ * f;
						f_1834_ -= f_1867_ * f;
						f_1836_ -= f_1845_ * f;
						f_1837_ -= f_1867_ * f;
						f = 0.0F;
					}
					if (f_1797_ < 0.0F) {
						f_1800_ -= f_1850_ * f_1797_;
						f_1803_ -= f_1851_ * f_1797_;
						f_1806_ -= f_1852_ * f_1797_;
						f_1809_ -= f_1853_ * f_1797_;
						f_1812_ -= f_1854_ * f_1797_;
						f_1818_ -= f_1855_ * f_1797_;
						f_1829_ -= f_1856_ * f_1797_;
						f_1832_ -= f_1857_ * f_1797_;
						f_1835_ -= f_1858_ * f_1797_;
						f_1838_ -= f_1859_ * f_1797_;
						f_1797_ = 0.0F;
					}
					if (f != f_1797_ && f_1861_ < f_1839_ || f == f_1797_ && f_1850_ > f_1839_) {
						f += 0.5F;
						f_1797_ += 0.5F;
						f_1796_ = (float) (int) (f_1796_ + 0.5F) - f_1797_;
						f_1797_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_1797_ >= 0.0F) {
							method2081(bool_1794_, bool_1795_, anIntArray1459, anIntArray1463, (int) f, (int) f_1799_, (int) f_1798_, f_1802_, f_1801_, f_1805_, f_1804_, f_1808_, f_1807_, f_1811_, f_1810_, f_1817_, f_1816_, f_1828_, f_1827_, f_1831_, f_1830_, f_1834_, f_1833_, f_1837_, f_1836_);
							f_1798_ += f_1839_;
							f_1799_ += f_1861_;
							f_1801_ += f_1840_;
							f_1802_ += f_1862_;
							f_1804_ += f_1841_;
							f_1805_ += f_1863_;
							f_1807_ += f_1842_;
							f_1808_ += f_1864_;
							f_1810_ += f_1843_;
							f_1811_ += f_1865_;
							f_1816_ += f_1844_;
							f_1817_ += f_1866_;
							f_1827_ += f_1845_;
							f_1828_ += f_1867_;
							f_1830_ += f_1846_;
							f_1831_ += f_1868_;
							f_1833_ += f_1847_;
							f_1834_ += f_1869_;
							f_1836_ += f_1848_;
							f_1837_ += f_1870_;
							f += (float) anInt1458;
						}
						while (--f_1796_ >= 0.0F) {
							method2081(bool_1794_, bool_1795_, anIntArray1459, anIntArray1463, (int) f, (int) f_1800_, (int) f_1798_, f_1803_, f_1801_, f_1806_, f_1804_, f_1809_, f_1807_, f_1812_, f_1810_, f_1818_, f_1816_, f_1829_, f_1827_, f_1832_, f_1830_, f_1835_, f_1833_, f_1838_, f_1836_);
							f_1800_ += f_1850_;
							f_1798_ += f_1839_;
							f_1803_ += f_1851_;
							f_1801_ += f_1840_;
							f_1806_ += f_1852_;
							f_1804_ += f_1841_;
							f_1809_ += f_1853_;
							f_1807_ += f_1842_;
							f_1812_ += f_1854_;
							f_1810_ += f_1843_;
							f_1818_ += f_1855_;
							f_1816_ += f_1844_;
							f_1829_ += f_1856_;
							f_1827_ += f_1845_;
							f_1832_ += f_1857_;
							f_1830_ += f_1846_;
							f_1835_ += f_1858_;
							f_1833_ += f_1847_;
							f_1838_ += f_1859_;
							f_1836_ += f_1848_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_1797_ += 0.5F;
						f_1796_ = (float) (int) (f_1796_ + 0.5F) - f_1797_;
						f_1797_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_1797_ >= 0.0F) {
							method2081(bool_1794_, bool_1795_, anIntArray1459, anIntArray1463, (int) f, (int) f_1798_, (int) f_1799_, f_1801_, f_1802_, f_1804_, f_1805_, f_1807_, f_1808_, f_1810_, f_1811_, f_1816_, f_1817_, f_1827_, f_1828_, f_1830_, f_1831_, f_1833_, f_1834_, f_1836_, f_1837_);
							f_1799_ += f_1861_;
							f_1798_ += f_1839_;
							f_1802_ += f_1862_;
							f_1801_ += f_1840_;
							f_1805_ += f_1863_;
							f_1804_ += f_1841_;
							f_1808_ += f_1864_;
							f_1807_ += f_1842_;
							f_1811_ += f_1865_;
							f_1810_ += f_1843_;
							f_1817_ += f_1866_;
							f_1816_ += f_1844_;
							f_1828_ += f_1867_;
							f_1827_ += f_1845_;
							f_1831_ += f_1868_;
							f_1830_ += f_1846_;
							f_1834_ += f_1869_;
							f_1833_ += f_1847_;
							f_1837_ += f_1870_;
							f_1836_ += f_1848_;
							f += (float) anInt1458;
						}
						while (--f_1796_ >= 0.0F) {
							method2081(bool_1794_, bool_1795_, anIntArray1459, anIntArray1463, (int) f, (int) f_1798_, (int) f_1800_, f_1801_, f_1803_, f_1804_, f_1806_, f_1807_, f_1809_, f_1810_, f_1812_, f_1816_, f_1818_, f_1827_, f_1829_, f_1830_, f_1832_, f_1833_, f_1835_, f_1836_, f_1838_);
							f_1798_ += f_1839_;
							f_1800_ += f_1850_;
							f_1801_ += f_1840_;
							f_1803_ += f_1851_;
							f_1804_ += f_1841_;
							f_1806_ += f_1852_;
							f_1807_ += f_1842_;
							f_1809_ += f_1853_;
							f_1810_ += f_1843_;
							f_1812_ += f_1854_;
							f_1816_ += f_1844_;
							f_1818_ += f_1855_;
							f_1827_ += f_1845_;
							f_1829_ += f_1856_;
							f_1830_ += f_1846_;
							f_1832_ += f_1857_;
							f_1833_ += f_1847_;
							f_1835_ += f_1858_;
							f_1836_ += f_1848_;
							f_1838_ += f_1859_;
							f += (float) anInt1458;
						}
					}
				}
			}
		}
	}

	final void method2111(boolean bool, boolean bool_1872_, int[] is, int[] is_1873_, int i, int i_1874_, int i_1875_, float f, float f_1876_, float f_1877_, float f_1878_, float f_1879_, float f_1880_, float f_1881_, float f_1882_, float f_1883_, float f_1884_, float f_1885_, float f_1886_, float f_1887_, float f_1888_, float f_1889_, float f_1890_, float f_1891_, float f_1892_) {
		int i_1893_ = i_1875_ - i_1874_;
		float f_1894_ = 1.0F / (float) i_1893_;
		float f_1895_ = (f_1876_ - f) * f_1894_;
		float f_1896_ = (f_1878_ - f_1877_) * f_1894_;
		float f_1897_ = (f_1880_ - f_1879_) * f_1894_;
		float f_1898_ = (f_1882_ - f_1881_) * f_1894_;
		float f_1899_ = (f_1884_ - f_1883_) * f_1894_;
		float f_1900_ = (f_1886_ - f_1885_) * f_1894_;
		float f_1901_ = (f_1888_ - f_1887_) * f_1894_;
		float f_1902_ = (f_1890_ - f_1889_) * f_1894_;
		float f_1903_ = (f_1892_ - f_1891_) * f_1894_;
		if (aBool1445) {
			if (i_1875_ > anInt1442)
				i_1875_ = anInt1442;
			if (i_1874_ < 0) {
				f -= f_1895_ * (float) i_1874_;
				f_1877_ -= f_1896_ * (float) i_1874_;
				f_1879_ -= f_1897_ * (float) i_1874_;
				f_1881_ -= f_1898_ * (float) i_1874_;
				f_1883_ -= f_1899_ * (float) i_1874_;
				f_1885_ -= f_1900_ * (float) i_1874_;
				f_1887_ -= f_1901_ * (float) i_1874_;
				f_1889_ -= f_1902_ * (float) i_1874_;
				f_1891_ -= f_1903_ * (float) i_1874_;
				i_1874_ = 0;
			}
		}
		if (i_1874_ < i_1875_) {
			i_1893_ = i_1875_ - i_1874_;
			i += i_1874_;
			while (i_1893_-- > 0) {
				float f_1904_ = 1.0F / f;
				float f_1905_ = 1.0F / f_1877_;
				if (!bool || f_1904_ < aFloatArray1460[i]) {
					int i_1906_ = (int) (f_1879_ * f_1905_ * (float) anInt1464);
					if (aBool1477)
						i_1906_ &= anInt1476;
					else if (i_1906_ < 0)
						i_1906_ = 0;
					else if (i_1906_ > anInt1476)
						i_1906_ = anInt1476;
					int i_1907_ = (int) (f_1881_ * f_1905_ * (float) anInt1464);
					if (aBool1477)
						i_1907_ &= anInt1476;
					else if (i_1907_ < 0)
						i_1907_ = 0;
					else if (i_1907_ > anInt1476)
						i_1907_ = anInt1476;
					int i_1908_ = anIntArray1463[i_1907_ * anInt1464 + i_1906_];
					int i_1909_ = 255;
					if (aClass595_1478 == Class595.aClass595_7814)
						i_1909_ = (int) ((float) (i_1908_ >> 24 & 0xff) * f_1885_ / 255.0F);
					else if (aClass595_1478 == Class595.aClass595_7815) {
						if ((i_1908_ >> 24 & 0xff) > anInt1468)
							i_1909_ = 255;
						else
							i_1909_ = 0;
					} else
						i_1909_ = (int) f_1885_;
					if (i_1909_ != 0) {
						if (i_1909_ != 255) {
							int i_1910_ = (~0xffffff | ((int) (f_1887_ * (float) (i_1908_ >> 16 & 0xff)) << 8 & 0xff0000) | ((int) (f_1889_ * (float) (i_1908_ >> 8 & 0xff)) & 0xff00) | (int) (f_1891_ * (float) (i_1908_ & 0xff)) >> 8);
							if (f_1883_ != 0.0F) {
								int i_1911_ = (int) (255.0F - f_1883_);
								int i_1912_ = ((((anInt1461 & 0xff00ff) * (int) f_1883_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_1883_ & 0xff0000)) >>> 8);
								i_1910_ = ((((i_1910_ & 0xff00ff) * i_1911_ & ~0xff00ff) | ((i_1910_ & 0xff00) * i_1911_ & 0xff0000)) >>> 8) + i_1912_;
							}
							int i_1913_ = is[i];
							int i_1914_ = 255 - i_1909_;
							i_1910_ = ((((i_1913_ & 0xff00ff) * i_1914_ + (i_1910_ & 0xff00ff) * i_1909_) & ~0xff00ff) + (((i_1913_ & 0xff00) * i_1914_ + (i_1910_ & 0xff00) * i_1909_) & 0xff0000)) >> 8;
							if (bool_1872_)
								is[i] = (i_1909_ | is[i] >> 24) << 24 | i_1910_;
							else
								is[i] = i_1910_;
							if (bool)
								aFloatArray1460[i] = f_1904_;
						} else {
							int i_1915_ = (~0xffffff | ((int) (f_1887_ * (float) (i_1908_ >> 16 & 0xff)) << 8 & 0xff0000) | ((int) (f_1889_ * (float) (i_1908_ >> 8 & 0xff)) & 0xff00) | (int) (f_1891_ * (float) (i_1908_ & 0xff)) >> 8);
							if (f_1883_ != 0.0F) {
								int i_1916_ = (int) (255.0F - f_1883_);
								int i_1917_ = ((((anInt1461 & 0xff00ff) * (int) f_1883_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_1883_ & 0xff0000)) >>> 8);
								i_1915_ = ((((i_1915_ & 0xff00ff) * i_1916_ & ~0xff00ff) | ((i_1915_ & 0xff00) * i_1916_ & 0xff0000)) >>> 8) + i_1917_;
							}
							if (bool_1872_)
								is[i] = i_1909_ << 24 | i_1915_;
							else
								is[i] = i_1915_;
							if (bool)
								aFloatArray1460[i] = f_1904_;
						}
					}
				}
				i++;
				f += f_1895_;
				f_1877_ += f_1896_;
				f_1879_ += f_1897_;
				f_1881_ += f_1898_;
				f_1883_ += f_1899_;
				f_1885_ += f_1900_;
				f_1887_ += f_1901_;
				f_1889_ += f_1902_;
				f_1891_ += f_1903_;
			}
		}
	}

	final void method2112(boolean bool, boolean bool_1918_, int[] is, int[] is_1919_, int i, int i_1920_, int i_1921_, float f, float f_1922_, float f_1923_, float f_1924_, float f_1925_, float f_1926_, float f_1927_, float f_1928_, float f_1929_, float f_1930_, float f_1931_, float f_1932_, float f_1933_, float f_1934_, float f_1935_, float f_1936_, float f_1937_, float f_1938_) {
		int i_1939_ = i_1921_ - i_1920_;
		float f_1940_ = 1.0F / (float) i_1939_;
		float f_1941_ = (f_1922_ - f) * f_1940_;
		float f_1942_ = (f_1924_ - f_1923_) * f_1940_;
		float f_1943_ = (f_1926_ - f_1925_) * f_1940_;
		float f_1944_ = (f_1928_ - f_1927_) * f_1940_;
		float f_1945_ = (f_1930_ - f_1929_) * f_1940_;
		float f_1946_ = (f_1932_ - f_1931_) * f_1940_;
		float f_1947_ = (f_1934_ - f_1933_) * f_1940_;
		float f_1948_ = (f_1936_ - f_1935_) * f_1940_;
		float f_1949_ = (f_1938_ - f_1937_) * f_1940_;
		if (aBool1445) {
			if (i_1921_ > anInt1442)
				i_1921_ = anInt1442;
			if (i_1920_ < 0) {
				f -= f_1941_ * (float) i_1920_;
				f_1923_ -= f_1942_ * (float) i_1920_;
				f_1925_ -= f_1943_ * (float) i_1920_;
				f_1927_ -= f_1944_ * (float) i_1920_;
				f_1929_ -= f_1945_ * (float) i_1920_;
				f_1931_ -= f_1946_ * (float) i_1920_;
				f_1933_ -= f_1947_ * (float) i_1920_;
				f_1935_ -= f_1948_ * (float) i_1920_;
				f_1937_ -= f_1949_ * (float) i_1920_;
				i_1920_ = 0;
			}
		}
		if (i_1920_ < i_1921_) {
			i_1939_ = i_1921_ - i_1920_;
			i += i_1920_;
			while (i_1939_-- > 0) {
				float f_1950_ = 1.0F / f;
				float f_1951_ = 1.0F / f_1923_;
				if (!bool || f_1950_ < aFloatArray1460[i]) {
					int i_1952_ = (int) (f_1925_ * f_1951_ * (float) anInt1464);
					if (aBool1477)
						i_1952_ &= anInt1476;
					else if (i_1952_ < 0)
						i_1952_ = 0;
					else if (i_1952_ > anInt1476)
						i_1952_ = anInt1476;
					int i_1953_ = (int) (f_1927_ * f_1951_ * (float) anInt1464);
					if (aBool1477)
						i_1953_ &= anInt1476;
					else if (i_1953_ < 0)
						i_1953_ = 0;
					else if (i_1953_ > anInt1476)
						i_1953_ = anInt1476;
					int i_1954_ = anIntArray1463[i_1953_ * anInt1464 + i_1952_];
					int i_1955_ = 255;
					if (aClass595_1478 == Class595.aClass595_7814)
						i_1955_ = (int) ((float) (i_1954_ >> 24 & 0xff) * f_1931_ / 255.0F);
					else if (aClass595_1478 == Class595.aClass595_7815) {
						if ((i_1954_ >> 24 & 0xff) > anInt1468)
							i_1955_ = 255;
						else
							i_1955_ = 0;
					} else
						i_1955_ = (int) f_1931_;
					if (i_1955_ != 0) {
						if (i_1955_ != 255) {
							int i_1956_ = (~0xffffff | ((int) (f_1933_ * (float) (i_1954_ >> 16 & 0xff)) << 8 & 0xff0000) | ((int) (f_1935_ * (float) (i_1954_ >> 8 & 0xff)) & 0xff00) | (int) (f_1937_ * (float) (i_1954_ & 0xff)) >> 8);
							if (f_1929_ != 0.0F) {
								int i_1957_ = (int) (255.0F - f_1929_);
								int i_1958_ = ((((anInt1461 & 0xff00ff) * (int) f_1929_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_1929_ & 0xff0000)) >>> 8);
								i_1956_ = ((((i_1956_ & 0xff00ff) * i_1957_ & ~0xff00ff) | ((i_1956_ & 0xff00) * i_1957_ & 0xff0000)) >>> 8) + i_1958_;
							}
							int i_1959_ = is[i];
							int i_1960_ = 255 - i_1955_;
							i_1956_ = ((((i_1959_ & 0xff00ff) * i_1960_ + (i_1956_ & 0xff00ff) * i_1955_) & ~0xff00ff) + (((i_1959_ & 0xff00) * i_1960_ + (i_1956_ & 0xff00) * i_1955_) & 0xff0000)) >> 8;
							if (bool_1918_)
								is[i] = (i_1955_ | is[i] >> 24) << 24 | i_1956_;
							else
								is[i] = i_1956_;
							if (bool)
								aFloatArray1460[i] = f_1950_;
						} else {
							int i_1961_ = (~0xffffff | ((int) (f_1933_ * (float) (i_1954_ >> 16 & 0xff)) << 8 & 0xff0000) | ((int) (f_1935_ * (float) (i_1954_ >> 8 & 0xff)) & 0xff00) | (int) (f_1937_ * (float) (i_1954_ & 0xff)) >> 8);
							if (f_1929_ != 0.0F) {
								int i_1962_ = (int) (255.0F - f_1929_);
								int i_1963_ = ((((anInt1461 & 0xff00ff) * (int) f_1929_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_1929_ & 0xff0000)) >>> 8);
								i_1961_ = ((((i_1961_ & 0xff00ff) * i_1962_ & ~0xff00ff) | ((i_1961_ & 0xff00) * i_1962_ & 0xff0000)) >>> 8) + i_1963_;
							}
							if (bool_1918_)
								is[i] = i_1955_ << 24 | i_1961_;
							else
								is[i] = i_1961_;
							if (bool)
								aFloatArray1460[i] = f_1950_;
						}
					}
				}
				i++;
				f += f_1941_;
				f_1923_ += f_1942_;
				f_1925_ += f_1943_;
				f_1927_ += f_1944_;
				f_1929_ += f_1945_;
				f_1931_ += f_1946_;
				f_1933_ += f_1947_;
				f_1935_ += f_1948_;
				f_1937_ += f_1949_;
			}
		}
	}

	final void method2113(boolean bool, boolean bool_1964_, int[] is, int[] is_1965_, int i, int i_1966_, int i_1967_, float f, float f_1968_, float f_1969_, float f_1970_, float f_1971_, float f_1972_, float f_1973_, float f_1974_, float f_1975_, float f_1976_, float f_1977_, float f_1978_, float f_1979_, float f_1980_, float f_1981_, float f_1982_, float f_1983_, float f_1984_) {
		int i_1985_ = i_1967_ - i_1966_;
		float f_1986_ = 1.0F / (float) i_1985_;
		float f_1987_ = (f_1968_ - f) * f_1986_;
		float f_1988_ = (f_1970_ - f_1969_) * f_1986_;
		float f_1989_ = (f_1972_ - f_1971_) * f_1986_;
		float f_1990_ = (f_1974_ - f_1973_) * f_1986_;
		float f_1991_ = (f_1976_ - f_1975_) * f_1986_;
		float f_1992_ = (f_1978_ - f_1977_) * f_1986_;
		float f_1993_ = (f_1980_ - f_1979_) * f_1986_;
		float f_1994_ = (f_1982_ - f_1981_) * f_1986_;
		float f_1995_ = (f_1984_ - f_1983_) * f_1986_;
		if (aBool1445) {
			if (i_1967_ > anInt1442)
				i_1967_ = anInt1442;
			if (i_1966_ < 0) {
				f -= f_1987_ * (float) i_1966_;
				f_1969_ -= f_1988_ * (float) i_1966_;
				f_1971_ -= f_1989_ * (float) i_1966_;
				f_1973_ -= f_1990_ * (float) i_1966_;
				f_1975_ -= f_1991_ * (float) i_1966_;
				f_1977_ -= f_1992_ * (float) i_1966_;
				f_1979_ -= f_1993_ * (float) i_1966_;
				f_1981_ -= f_1994_ * (float) i_1966_;
				f_1983_ -= f_1995_ * (float) i_1966_;
				i_1966_ = 0;
			}
		}
		if (i_1966_ < i_1967_) {
			i_1985_ = i_1967_ - i_1966_;
			i += i_1966_;
			while (i_1985_-- > 0) {
				float f_1996_ = 1.0F / f;
				float f_1997_ = 1.0F / f_1969_;
				if (!bool || f_1996_ < aFloatArray1460[i]) {
					int i_1998_ = (int) (f_1971_ * f_1997_ * (float) anInt1464);
					if (aBool1477)
						i_1998_ &= anInt1476;
					else if (i_1998_ < 0)
						i_1998_ = 0;
					else if (i_1998_ > anInt1476)
						i_1998_ = anInt1476;
					int i_1999_ = (int) (f_1973_ * f_1997_ * (float) anInt1464);
					if (aBool1477)
						i_1999_ &= anInt1476;
					else if (i_1999_ < 0)
						i_1999_ = 0;
					else if (i_1999_ > anInt1476)
						i_1999_ = anInt1476;
					int i_2000_ = anIntArray1463[i_1999_ * anInt1464 + i_1998_];
					int i_2001_ = 255;
					if (aClass595_1478 == Class595.aClass595_7814)
						i_2001_ = (int) ((float) (i_2000_ >> 24 & 0xff) * f_1977_ / 255.0F);
					else if (aClass595_1478 == Class595.aClass595_7815) {
						if ((i_2000_ >> 24 & 0xff) > anInt1468)
							i_2001_ = 255;
						else
							i_2001_ = 0;
					} else
						i_2001_ = (int) f_1977_;
					if (i_2001_ != 0) {
						if (i_2001_ != 255) {
							int i_2002_ = (~0xffffff | ((int) (f_1979_ * (float) (i_2000_ >> 16 & 0xff)) << 8 & 0xff0000) | ((int) (f_1981_ * (float) (i_2000_ >> 8 & 0xff)) & 0xff00) | (int) (f_1983_ * (float) (i_2000_ & 0xff)) >> 8);
							if (f_1975_ != 0.0F) {
								int i_2003_ = (int) (255.0F - f_1975_);
								int i_2004_ = ((((anInt1461 & 0xff00ff) * (int) f_1975_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_1975_ & 0xff0000)) >>> 8);
								i_2002_ = ((((i_2002_ & 0xff00ff) * i_2003_ & ~0xff00ff) | ((i_2002_ & 0xff00) * i_2003_ & 0xff0000)) >>> 8) + i_2004_;
							}
							int i_2005_ = is[i];
							int i_2006_ = 255 - i_2001_;
							i_2002_ = ((((i_2005_ & 0xff00ff) * i_2006_ + (i_2002_ & 0xff00ff) * i_2001_) & ~0xff00ff) + (((i_2005_ & 0xff00) * i_2006_ + (i_2002_ & 0xff00) * i_2001_) & 0xff0000)) >> 8;
							if (bool_1964_)
								is[i] = (i_2001_ | is[i] >> 24) << 24 | i_2002_;
							else
								is[i] = i_2002_;
							if (bool)
								aFloatArray1460[i] = f_1996_;
						} else {
							int i_2007_ = (~0xffffff | ((int) (f_1979_ * (float) (i_2000_ >> 16 & 0xff)) << 8 & 0xff0000) | ((int) (f_1981_ * (float) (i_2000_ >> 8 & 0xff)) & 0xff00) | (int) (f_1983_ * (float) (i_2000_ & 0xff)) >> 8);
							if (f_1975_ != 0.0F) {
								int i_2008_ = (int) (255.0F - f_1975_);
								int i_2009_ = ((((anInt1461 & 0xff00ff) * (int) f_1975_ & ~0xff00ff) | ((anInt1461 & 0xff00) * (int) f_1975_ & 0xff0000)) >>> 8);
								i_2007_ = ((((i_2007_ & 0xff00ff) * i_2008_ & ~0xff00ff) | ((i_2007_ & 0xff00) * i_2008_ & 0xff0000)) >>> 8) + i_2009_;
							}
							if (bool_1964_)
								is[i] = i_2001_ << 24 | i_2007_;
							else
								is[i] = i_2007_;
							if (bool)
								aFloatArray1460[i] = f_1996_;
						}
					}
				}
				i++;
				f += f_1987_;
				f_1969_ += f_1988_;
				f_1971_ += f_1989_;
				f_1973_ += f_1990_;
				f_1975_ += f_1991_;
				f_1977_ += f_1992_;
				f_1979_ += f_1993_;
				f_1981_ += f_1994_;
				f_1983_ += f_1995_;
			}
		}
	}

	final void method2114(boolean bool, boolean bool_2010_, boolean bool_2011_, float f, float f_2012_, float f_2013_, float f_2014_, float f_2015_, float f_2016_, float f_2017_, float f_2018_, float f_2019_, float f_2020_, float f_2021_, float f_2022_, float f_2023_, float f_2024_, float f_2025_, float f_2026_, float f_2027_, float f_2028_, int i, int i_2029_, int i_2030_, int i_2031_, float f_2032_, float f_2033_, float f_2034_, int i_2035_, float f_2036_, int i_2037_, float f_2038_,
			int i_2039_, float f_2040_) {
		if (!bool)
			method2077(false, bool_2010_, bool_2011_, f, f_2012_, f_2013_, f_2014_, f_2015_, f_2016_, f_2017_, f_2018_, f_2019_, 0);
		else {
			anInt1461 = i_2031_;
			if (!(f <= f_2012_) || !(f <= f_2013_)) {
				if (f_2012_ <= f_2013_) {
					float f_2041_ = f_2014_;
					f_2014_ = f_2015_;
					f_2015_ = f_2041_;
					f_2041_ = f;
					f = f_2012_;
					f_2012_ = f_2041_;
					f_2041_ = f_2017_;
					f_2017_ = f_2018_;
					f_2018_ = f_2041_;
					f_2041_ = f_2023_;
					f_2023_ = f_2024_;
					f_2024_ = f_2041_;
					f_2041_ = f_2026_;
					f_2026_ = f_2027_;
					f_2027_ = f_2041_;
					f_2041_ = f_2020_;
					f_2020_ = f_2021_;
					f_2021_ = f_2041_;
					f_2041_ = f_2032_;
					f_2032_ = f_2033_;
					f_2033_ = f_2041_;
					f_2041_ = f_2036_;
					f_2036_ = f_2038_;
					f_2038_ = f_2041_;
					int i_2042_ = i;
					i = i_2029_;
					i_2029_ = i_2042_;
					i_2042_ = i_2035_;
					i_2035_ = i_2037_;
					i_2037_ = i_2042_;
				} else {
					float f_2043_ = f_2014_;
					f_2014_ = f_2016_;
					f_2016_ = f_2043_;
					f_2043_ = f;
					f = f_2013_;
					f_2013_ = f_2043_;
					f_2043_ = f_2017_;
					f_2017_ = f_2019_;
					f_2019_ = f_2043_;
					f_2043_ = f_2023_;
					f_2023_ = f_2025_;
					f_2025_ = f_2043_;
					f_2043_ = f_2026_;
					f_2026_ = f_2028_;
					f_2028_ = f_2043_;
					f_2043_ = f_2020_;
					f_2020_ = f_2022_;
					f_2022_ = f_2043_;
					f_2043_ = f_2032_;
					f_2032_ = f_2034_;
					f_2034_ = f_2043_;
					f_2043_ = f_2036_;
					f_2036_ = f_2040_;
					f_2040_ = f_2043_;
					int i_2044_ = i;
					i = i_2030_;
					i_2030_ = i_2044_;
					i_2044_ = i_2035_;
					i_2035_ = i_2039_;
					i_2039_ = i_2044_;
				}
			}
			int i_2045_ = i_2035_ & 0xffff;
			int i_2046_ = i_2037_ & 0xffff;
			int i_2047_ = i_2039_ & 0xffff;
			if (i_2045_ != anInt1462) {
				anIntArray1463 = aClass180_Sub1_1456.method14841(i_2045_);
				if (anIntArray1463 == null) {
					anInt1462 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					int i_2048_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_2035_), (byte) 10) & 0xffff]);
					int i_2049_ = (~0xffffff | ((i >> 16 & 0xff) * (i_2048_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_2048_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_2048_ & 0xff) >> 8);
					method2106(true, bool_2010_, bool_2011_, f, f_2012_, f_2013_, f_2014_, f_2015_, f_2016_, f_2017_, f_2018_, f_2019_, Class388.method6456(i_2049_, i_2031_, f_2032_, (byte) -61), Class388.method6456(i_2049_, i_2031_, f_2033_, (byte) -30), Class388.method6456(i_2049_, i_2031_, f_2034_, (byte) -8));
					return;
				}
				anInt1462 = i_2045_;
				anInt1464 = aClass180_Sub1_1456.method14822(i_2035_);
				anInt1476 = anInt1464 - 1;
				aClass595_1478 = aClass180_Sub1_1456.method14823(i_2035_);
			}
			aFloat1455 = f_2036_;
			if (i_2046_ != anInt1470) {
				anIntArray1454 = aClass180_Sub1_1456.method14841(i_2046_);
				if (anIntArray1454 == null) {
					anInt1470 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					int i_2050_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_2037_), (byte) 10) & 0xffff]);
					int i_2051_ = (~0xffffff | ((i >> 16 & 0xff) * (i_2050_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_2050_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_2050_ & 0xff) >> 8);
					method2106(true, bool_2010_, bool_2011_, f, f_2012_, f_2013_, f_2014_, f_2015_, f_2016_, f_2017_, f_2018_, f_2019_, Class388.method6456(i_2051_, i_2031_, f_2032_, (byte) -35), Class388.method6456(i_2051_, i_2031_, f_2033_, (byte) 18), Class388.method6456(i_2051_, i_2031_, f_2034_, (byte) -19));
					return;
				}
				anInt1470 = i_2046_;
				anInt1472 = aClass180_Sub1_1456.method14822(i_2037_);
				anInt1473 = anInt1472 - 1;
			}
			aFloat1474 = f_2038_;
			if (i_2047_ != anInt1475) {
				anIntArray1471 = aClass180_Sub1_1456.method14841(i_2047_);
				if (anIntArray1471 == null) {
					anInt1475 = -1;
					anInt1441 = 255 - (i >> 24 & 0xff);
					int i_2052_ = (Class656.anIntArray8393[Class453.method7333(aClass180_Sub1_1456.method14825(i_2039_), (byte) 10) & 0xffff]);
					int i_2053_ = (~0xffffff | ((i >> 16 & 0xff) * (i_2052_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_2052_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_2052_ & 0xff) >> 8);
					method2106(true, bool_2010_, bool_2011_, (float) (int) f, (float) (int) f_2012_, (float) (int) f_2013_, (float) (int) f_2014_, (float) (int) f_2015_, (float) (int) f_2016_, (float) (int) f_2017_, (float) (int) f_2018_, (float) (int) f_2019_, Class388.method6456(i_2053_, i_2031_, f_2032_, (byte) 28), Class388.method6456(i_2053_, i_2031_, f_2033_, (byte) 9), Class388.method6456(i_2053_, i_2031_, f_2034_, (byte) -36));
					return;
				}
				anInt1475 = i_2047_;
				anInt1469 = aClass180_Sub1_1456.method14822(i_2039_);
				anInt1465 = anInt1469 - 1;
			}
			aFloat1479 = f_2040_;
			f_2023_ /= f_2020_;
			f_2024_ /= f_2021_;
			f_2025_ /= f_2022_;
			f_2026_ /= f_2020_;
			f_2027_ /= f_2021_;
			f_2028_ /= f_2022_;
			f_2017_ = 1.0F / f_2017_;
			f_2018_ = 1.0F / f_2018_;
			f_2019_ = 1.0F / f_2019_;
			f_2020_ = 1.0F / f_2020_;
			f_2021_ = 1.0F / f_2021_;
			f_2022_ = 1.0F / f_2022_;
			float f_2054_ = (float) (i >> 24 & 0xff);
			float f_2055_ = (float) (i_2029_ >> 24 & 0xff);
			float f_2056_ = (float) (i_2030_ >> 24 & 0xff);
			float f_2057_ = (float) (i >> 16 & 0xff);
			float f_2058_ = (float) (i_2029_ >> 16 & 0xff);
			float f_2059_ = (float) (i_2030_ >> 16 & 0xff);
			float f_2060_ = (float) (i >> 8 & 0xff);
			float f_2061_ = (float) (i_2029_ >> 8 & 0xff);
			float f_2062_ = (float) (i_2030_ >> 8 & 0xff);
			float f_2063_ = (float) (i & 0xff);
			float f_2064_ = (float) (i_2029_ & 0xff);
			float f_2065_ = (float) (i_2030_ & 0xff);
			float f_2066_ = 1.0F;
			float f_2067_ = 0.0F;
			float f_2068_ = 0.0F;
			float f_2069_ = 0.0F;
			float f_2070_ = 1.0F;
			float f_2071_ = 0.0F;
			float f_2072_ = 0.0F;
			float f_2073_ = 0.0F;
			float f_2074_ = 0.0F;
			float f_2075_ = 0.0F;
			float f_2076_ = 0.0F;
			float f_2077_ = 0.0F;
			float f_2078_ = 0.0F;
			float f_2079_ = 0.0F;
			float f_2080_ = 0.0F;
			float f_2081_ = 0.0F;
			float f_2082_ = 0.0F;
			float f_2083_ = 0.0F;
			if (f_2012_ != f) {
				float f_2084_ = f_2012_ - f;
				f_2072_ = (f_2015_ - f_2014_) / f_2084_;
				f_2073_ = (f_2018_ - f_2017_) / f_2084_;
				f_2074_ = (f_2021_ - f_2020_) / f_2084_;
				f_2075_ = (f_2024_ - f_2023_) / f_2084_;
				f_2076_ = (f_2027_ - f_2026_) / f_2084_;
				f_2077_ = (f_2033_ - f_2032_) / f_2084_;
				f_2078_ = (f_2055_ - f_2054_) / f_2084_;
				f_2079_ = (f_2058_ - f_2057_) / f_2084_;
				f_2080_ = (f_2061_ - f_2060_) / f_2084_;
				f_2081_ = (f_2064_ - f_2063_) / f_2084_;
				f_2082_ = (f_2067_ - f_2066_) / f_2084_;
				f_2083_ = (f_2070_ - f_2069_) / f_2084_;
			}
			float f_2085_ = 0.0F;
			float f_2086_ = 0.0F;
			float f_2087_ = 0.0F;
			float f_2088_ = 0.0F;
			float f_2089_ = 0.0F;
			float f_2090_ = 0.0F;
			float f_2091_ = 0.0F;
			float f_2092_ = 0.0F;
			float f_2093_ = 0.0F;
			float f_2094_ = 0.0F;
			float f_2095_ = 0.0F;
			float f_2096_ = 0.0F;
			if (f_2013_ != f_2012_) {
				float f_2097_ = f_2013_ - f_2012_;
				f_2085_ = (f_2016_ - f_2015_) / f_2097_;
				f_2086_ = (f_2019_ - f_2018_) / f_2097_;
				f_2087_ = (f_2022_ - f_2021_) / f_2097_;
				f_2088_ = (f_2025_ - f_2024_) / f_2097_;
				f_2089_ = (f_2028_ - f_2027_) / f_2097_;
				f_2090_ = (f_2034_ - f_2033_) / f_2097_;
				f_2091_ = (f_2056_ - f_2055_) / f_2097_;
				f_2092_ = (f_2059_ - f_2058_) / f_2097_;
				f_2093_ = (f_2062_ - f_2061_) / f_2097_;
				f_2094_ = (f_2065_ - f_2064_) / f_2097_;
				f_2095_ = (f_2068_ - f_2067_) / f_2097_;
				f_2096_ = (f_2071_ - f_2070_) / f_2097_;
			}
			float f_2098_ = 0.0F;
			float f_2099_ = 0.0F;
			float f_2100_ = 0.0F;
			float f_2101_ = 0.0F;
			float f_2102_ = 0.0F;
			float f_2103_ = 0.0F;
			float f_2104_ = 0.0F;
			float f_2105_ = 0.0F;
			float f_2106_ = 0.0F;
			float f_2107_ = 0.0F;
			float f_2108_ = 0.0F;
			float f_2109_ = 0.0F;
			if (f != f_2013_) {
				float f_2110_ = f - f_2013_;
				f_2098_ = (f_2014_ - f_2016_) / f_2110_;
				f_2099_ = (f_2017_ - f_2019_) / f_2110_;
				f_2100_ = (f_2020_ - f_2022_) / f_2110_;
				f_2101_ = (f_2023_ - f_2025_) / f_2110_;
				f_2102_ = (f_2026_ - f_2028_) / f_2110_;
				f_2103_ = (f_2032_ - f_2034_) / f_2110_;
				f_2104_ = (f_2054_ - f_2056_) / f_2110_;
				f_2105_ = (f_2057_ - f_2059_) / f_2110_;
				f_2106_ = (f_2060_ - f_2062_) / f_2110_;
				f_2107_ = (f_2063_ - f_2065_) / f_2110_;
				f_2108_ = (f_2066_ - f_2068_) / f_2110_;
				f_2109_ = (f_2069_ - f_2071_) / f_2110_;
			}
			if (!(f >= (float) anInt1450)) {
				if (f_2012_ > (float) anInt1450)
					f_2012_ = (float) anInt1450;
				if (f_2013_ > (float) anInt1450)
					f_2013_ = (float) anInt1450;
				if (f_2012_ < f_2013_) {
					f_2016_ = f_2014_;
					f_2019_ = f_2017_;
					f_2022_ = f_2020_;
					f_2025_ = f_2023_;
					f_2028_ = f_2026_;
					f_2034_ = f_2032_;
					f_2056_ = f_2054_;
					f_2059_ = f_2057_;
					f_2062_ = f_2060_;
					f_2065_ = f_2063_;
					f_2068_ = f_2066_;
					f_2071_ = f_2069_;
					if (f < 0.0F) {
						f_2014_ -= f_2072_ * f;
						f_2016_ -= f_2098_ * f;
						f_2017_ -= f_2073_ * f;
						f_2019_ -= f_2099_ * f;
						f_2020_ -= f_2074_ * f;
						f_2022_ -= f_2100_ * f;
						f_2023_ -= f_2075_ * f;
						f_2025_ -= f_2101_ * f;
						f_2026_ -= f_2076_ * f;
						f_2028_ -= f_2102_ * f;
						f_2032_ -= f_2077_ * f;
						f_2034_ -= f_2103_ * f;
						f_2054_ -= f_2078_ * f;
						f_2056_ -= f_2104_ * f;
						f_2057_ -= f_2079_ * f;
						f_2059_ -= f_2105_ * f;
						f_2060_ -= f_2080_ * f;
						f_2062_ -= f_2106_ * f;
						f_2063_ -= f_2081_ * f;
						f_2065_ -= f_2107_ * f;
						f_2066_ -= f_2082_ * f;
						f_2068_ -= f_2108_ * f;
						f_2069_ -= f_2083_ * f;
						f_2071_ -= f_2109_ * f;
						f = 0.0F;
					}
					if (f_2012_ < 0.0F) {
						f_2015_ -= f_2085_ * f_2012_;
						f_2018_ -= f_2086_ * f_2012_;
						f_2021_ -= f_2087_ * f_2012_;
						f_2024_ -= f_2088_ * f_2012_;
						f_2027_ -= f_2089_ * f_2012_;
						f_2033_ -= f_2090_ * f_2012_;
						f_2055_ -= f_2091_ * f_2012_;
						f_2058_ -= f_2092_ * f_2012_;
						f_2061_ -= f_2093_ * f_2012_;
						f_2064_ -= f_2094_ * f_2012_;
						f_2067_ -= f_2095_ * f_2012_;
						f_2070_ -= f_2096_ * f_2012_;
						f_2012_ = 0.0F;
					}
					if (f != f_2012_ && f_2098_ < f_2072_ || f == f_2012_ && f_2098_ > f_2085_) {
						f += 0.5F;
						f_2012_ += 0.5F;
						f_2013_ = (float) (int) (f_2013_ + 0.5F) - f_2012_;
						f_2012_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_2012_ >= 0.0F) {
							method2082(bool_2010_, bool_2011_, anIntArray1459, (int) f, (int) f_2016_, (int) f_2014_, f_2019_, f_2017_, f_2022_, f_2020_, f_2025_, f_2023_, f_2028_, f_2026_, f_2034_, f_2032_, f_2056_, f_2054_, f_2059_, f_2057_, f_2062_, f_2060_, f_2065_, f_2063_, f_2068_, f_2066_, f_2071_, f_2069_);
							f_2014_ += f_2072_;
							f_2016_ += f_2098_;
							f_2017_ += f_2073_;
							f_2019_ += f_2099_;
							f_2020_ += f_2074_;
							f_2022_ += f_2100_;
							f_2023_ += f_2075_;
							f_2025_ += f_2101_;
							f_2026_ += f_2076_;
							f_2028_ += f_2102_;
							f_2032_ += f_2077_;
							f_2034_ += f_2103_;
							f_2054_ += f_2078_;
							f_2056_ += f_2104_;
							f_2057_ += f_2079_;
							f_2059_ += f_2105_;
							f_2060_ += f_2080_;
							f_2062_ += f_2106_;
							f_2063_ += f_2081_;
							f_2065_ += f_2107_;
							f_2066_ += f_2082_;
							f_2068_ += f_2108_;
							f_2069_ += f_2083_;
							f_2071_ += f_2109_;
							f += (float) anInt1458;
						}
						while (--f_2013_ >= 0.0F) {
							method2082(bool_2010_, bool_2011_, anIntArray1459, (int) f, (int) f_2016_, (int) f_2015_, f_2019_, f_2018_, f_2022_, f_2021_, f_2025_, f_2024_, f_2028_, f_2027_, f_2034_, f_2033_, f_2056_, f_2055_, f_2059_, f_2058_, f_2062_, f_2061_, f_2065_, f_2064_, f_2068_, f_2067_, f_2071_, f_2070_);
							f_2015_ += f_2085_;
							f_2016_ += f_2098_;
							f_2018_ += f_2086_;
							f_2019_ += f_2099_;
							f_2021_ += f_2087_;
							f_2022_ += f_2100_;
							f_2024_ += f_2088_;
							f_2025_ += f_2101_;
							f_2027_ += f_2089_;
							f_2028_ += f_2102_;
							f_2033_ += f_2090_;
							f_2034_ += f_2103_;
							f_2055_ += f_2091_;
							f_2056_ += f_2104_;
							f_2058_ += f_2092_;
							f_2059_ += f_2105_;
							f_2061_ += f_2093_;
							f_2062_ += f_2106_;
							f_2064_ += f_2094_;
							f_2065_ += f_2107_;
							f_2067_ += f_2095_;
							f_2068_ += f_2108_;
							f_2070_ += f_2096_;
							f_2071_ += f_2109_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_2012_ += 0.5F;
						f_2013_ = (float) (int) (f_2013_ + 0.5F) - f_2012_;
						f_2012_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_2012_ >= 0.0F) {
							method2082(bool_2010_, bool_2011_, anIntArray1459, (int) f, (int) f_2014_, (int) f_2016_, f_2017_, f_2019_, f_2020_, f_2022_, f_2023_, f_2025_, f_2026_, f_2028_, f_2032_, f_2034_, f_2054_, f_2056_, f_2057_, f_2059_, f_2060_, f_2062_, f_2063_, f_2065_, f_2066_, f_2068_, f_2069_, f_2071_);
							f_2014_ += f_2072_;
							f_2016_ += f_2098_;
							f_2017_ += f_2073_;
							f_2019_ += f_2099_;
							f_2020_ += f_2074_;
							f_2022_ += f_2100_;
							f_2023_ += f_2075_;
							f_2025_ += f_2101_;
							f_2026_ += f_2076_;
							f_2028_ += f_2102_;
							f_2032_ += f_2077_;
							f_2034_ += f_2103_;
							f_2054_ += f_2078_;
							f_2056_ += f_2104_;
							f_2057_ += f_2079_;
							f_2059_ += f_2105_;
							f_2060_ += f_2080_;
							f_2062_ += f_2106_;
							f_2063_ += f_2081_;
							f_2065_ += f_2107_;
							f_2066_ += f_2082_;
							f_2068_ += f_2108_;
							f_2069_ += f_2083_;
							f_2071_ += f_2109_;
							f += (float) anInt1458;
						}
						while (--f_2013_ >= 0.0F) {
							method2082(bool_2010_, bool_2011_, anIntArray1459, (int) f, (int) f_2015_, (int) f_2016_, f_2018_, f_2019_, f_2021_, f_2022_, f_2024_, f_2025_, f_2027_, f_2028_, f_2033_, f_2034_, f_2055_, f_2056_, f_2058_, f_2059_, f_2061_, f_2062_, f_2064_, f_2065_, f_2067_, f_2068_, f_2070_, f_2071_);
							f_2015_ += f_2085_;
							f_2016_ += f_2098_;
							f_2018_ += f_2086_;
							f_2019_ += f_2099_;
							f_2021_ += f_2087_;
							f_2022_ += f_2100_;
							f_2024_ += f_2088_;
							f_2025_ += f_2101_;
							f_2027_ += f_2089_;
							f_2028_ += f_2102_;
							f_2033_ += f_2090_;
							f_2034_ += f_2103_;
							f_2055_ += f_2091_;
							f_2056_ += f_2104_;
							f_2058_ += f_2092_;
							f_2059_ += f_2105_;
							f_2061_ += f_2093_;
							f_2062_ += f_2106_;
							f_2064_ += f_2094_;
							f_2065_ += f_2107_;
							f_2067_ += f_2095_;
							f_2068_ += f_2108_;
							f_2070_ += f_2096_;
							f_2071_ += f_2109_;
							f += (float) anInt1458;
						}
					}
				} else {
					f_2015_ = f_2014_;
					f_2018_ = f_2017_;
					f_2021_ = f_2020_;
					f_2024_ = f_2023_;
					f_2027_ = f_2026_;
					f_2033_ = f_2032_;
					f_2055_ = f_2054_;
					f_2058_ = f_2057_;
					f_2061_ = f_2060_;
					f_2064_ = f_2063_;
					f_2067_ = f_2066_;
					f_2070_ = f_2069_;
					if (f < 0.0F) {
						f_2014_ -= f_2072_ * f;
						f_2015_ -= f_2098_ * f;
						f_2017_ -= f_2073_ * f;
						f_2018_ -= f_2099_ * f;
						f_2020_ -= f_2074_ * f;
						f_2021_ -= f_2100_ * f;
						f_2023_ -= f_2075_ * f;
						f_2024_ -= f_2101_ * f;
						f_2026_ -= f_2076_ * f;
						f_2027_ -= f_2102_ * f;
						f_2032_ -= f_2077_ * f;
						f_2033_ -= f_2103_ * f;
						f_2054_ -= f_2078_ * f;
						f_2055_ -= f_2104_ * f;
						f_2057_ -= f_2079_ * f;
						f_2058_ -= f_2105_ * f;
						f_2060_ -= f_2080_ * f;
						f_2061_ -= f_2106_ * f;
						f_2063_ -= f_2081_ * f;
						f_2064_ -= f_2107_ * f;
						f_2066_ -= f_2082_ * f;
						f_2067_ -= f_2108_ * f;
						f_2069_ -= f_2083_ * f;
						f_2070_ -= f_2109_ * f;
						f = 0.0F;
					}
					if (f_2013_ < 0.0F) {
						f_2016_ -= f_2085_ * f_2013_;
						f_2019_ -= f_2086_ * f_2013_;
						f_2022_ -= f_2087_ * f_2013_;
						f_2025_ -= f_2088_ * f_2013_;
						f_2028_ -= f_2089_ * f_2013_;
						f_2034_ -= f_2090_ * f_2013_;
						f_2056_ -= f_2091_ * f_2013_;
						f_2059_ -= f_2092_ * f_2013_;
						f_2062_ -= f_2093_ * f_2013_;
						f_2065_ -= f_2094_ * f_2013_;
						f_2068_ -= f_2095_ * f_2013_;
						f_2071_ -= f_2096_ * f_2013_;
						f_2013_ = 0.0F;
					}
					if (f != f_2013_ && f_2098_ < f_2072_ || f == f_2013_ && f_2085_ > f_2072_) {
						f += 0.5F;
						f_2013_ += 0.5F;
						f_2012_ = (float) (int) (f_2012_ + 0.5F) - f_2013_;
						f_2013_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_2013_ >= 0.0F) {
							method2082(bool_2010_, bool_2011_, anIntArray1459, (int) f, (int) f_2015_, (int) f_2014_, f_2018_, f_2017_, f_2021_, f_2020_, f_2024_, f_2023_, f_2027_, f_2026_, f_2033_, f_2032_, f_2055_, f_2054_, f_2058_, f_2057_, f_2061_, f_2060_, f_2064_, f_2063_, f_2067_, f_2066_, f_2070_, f_2069_);
							f_2014_ += f_2072_;
							f_2015_ += f_2098_;
							f_2017_ += f_2073_;
							f_2018_ += f_2099_;
							f_2020_ += f_2074_;
							f_2021_ += f_2100_;
							f_2023_ += f_2075_;
							f_2024_ += f_2101_;
							f_2026_ += f_2076_;
							f_2027_ += f_2102_;
							f_2032_ += f_2077_;
							f_2033_ += f_2103_;
							f_2054_ += f_2078_;
							f_2055_ += f_2104_;
							f_2057_ += f_2079_;
							f_2058_ += f_2105_;
							f_2060_ += f_2080_;
							f_2061_ += f_2106_;
							f_2063_ += f_2081_;
							f_2064_ += f_2107_;
							f_2066_ += f_2082_;
							f_2067_ += f_2108_;
							f_2069_ += f_2083_;
							f_2070_ += f_2109_;
							f += (float) anInt1458;
						}
						while (--f_2012_ >= 0.0F) {
							method2082(bool_2010_, bool_2011_, anIntArray1459, (int) f, (int) f_2016_, (int) f_2014_, f_2019_, f_2017_, f_2022_, f_2020_, f_2025_, f_2023_, f_2028_, f_2026_, f_2034_, f_2032_, f_2056_, f_2054_, f_2059_, f_2057_, f_2062_, f_2060_, f_2065_, f_2063_, f_2068_, f_2066_, f_2071_, f_2069_);
							f_2016_ += f_2085_;
							f_2014_ += f_2072_;
							f_2019_ += f_2086_;
							f_2017_ += f_2073_;
							f_2022_ += f_2087_;
							f_2020_ += f_2074_;
							f_2025_ += f_2088_;
							f_2023_ += f_2075_;
							f_2028_ += f_2089_;
							f_2026_ += f_2076_;
							f_2034_ += f_2090_;
							f_2032_ += f_2077_;
							f_2056_ += f_2091_;
							f_2054_ += f_2078_;
							f_2059_ += f_2092_;
							f_2057_ += f_2079_;
							f_2062_ += f_2093_;
							f_2060_ += f_2080_;
							f_2065_ += f_2094_;
							f_2063_ += f_2081_;
							f_2068_ += f_2095_;
							f_2066_ += f_2082_;
							f_2071_ += f_2096_;
							f_2069_ += f_2083_;
							f += (float) anInt1458;
						}
					} else {
						f += 0.5F;
						f_2013_ += 0.5F;
						f_2012_ = (float) (int) (f_2012_ + 0.5F) - f_2013_;
						f_2013_ -= f;
						f = (float) anIntArray1447[(int) f];
						while (--f_2013_ >= 0.0F) {
							method2082(bool_2010_, bool_2011_, anIntArray1459, (int) f, (int) f_2014_, (int) f_2015_, f_2017_, f_2018_, f_2020_, f_2021_, f_2023_, f_2024_, f_2026_, f_2027_, f_2032_, f_2033_, f_2054_, f_2055_, f_2057_, f_2058_, f_2060_, f_2061_, f_2063_, f_2064_, f_2066_, f_2067_, f_2069_, f_2070_);
							f_2015_ += f_2098_;
							f_2014_ += f_2072_;
							f_2018_ += f_2099_;
							f_2017_ += f_2073_;
							f_2021_ += f_2100_;
							f_2020_ += f_2074_;
							f_2024_ += f_2101_;
							f_2023_ += f_2075_;
							f_2027_ += f_2102_;
							f_2026_ += f_2076_;
							f_2033_ += f_2103_;
							f_2032_ += f_2077_;
							f_2055_ += f_2104_;
							f_2054_ += f_2078_;
							f_2058_ += f_2105_;
							f_2057_ += f_2079_;
							f_2061_ += f_2106_;
							f_2060_ += f_2080_;
							f_2064_ += f_2107_;
							f_2063_ += f_2081_;
							f_2067_ += f_2108_;
							f_2066_ += f_2082_;
							f_2070_ += f_2109_;
							f_2069_ += f_2083_;
							f += (float) anInt1458;
						}
						while (--f_2012_ >= 0.0F) {
							method2082(bool_2010_, bool_2011_, anIntArray1459, (int) f, (int) f_2014_, (int) f_2016_, f_2017_, f_2019_, f_2020_, f_2022_, f_2023_, f_2025_, f_2026_, f_2028_, f_2032_, f_2034_, f_2054_, f_2056_, f_2057_, f_2059_, f_2060_, f_2062_, f_2063_, f_2065_, f_2066_, f_2068_, f_2069_, f_2071_);
							f_2014_ += f_2072_;
							f_2016_ += f_2085_;
							f_2017_ += f_2073_;
							f_2019_ += f_2086_;
							f_2020_ += f_2074_;
							f_2022_ += f_2087_;
							f_2023_ += f_2075_;
							f_2025_ += f_2088_;
							f_2026_ += f_2076_;
							f_2028_ += f_2089_;
							f_2032_ += f_2077_;
							f_2034_ += f_2090_;
							f_2054_ += f_2078_;
							f_2056_ += f_2091_;
							f_2057_ += f_2079_;
							f_2059_ += f_2092_;
							f_2060_ += f_2080_;
							f_2062_ += f_2093_;
							f_2063_ += f_2081_;
							f_2065_ += f_2094_;
							f_2066_ += f_2082_;
							f_2068_ += f_2095_;
							f_2069_ += f_2083_;
							f_2071_ += f_2096_;
							f += (float) anInt1458;
						}
					}
				}
			}
		}
	}

	Class119(Class180_Sub1 class180_sub1, Class101 class101) {
		aBool1443 = false;
		anInt1441 = 0;
		aBool1445 = false;
		aBool1446 = false;
		anIntArray1447 = new int[4096];
		aFloat1452 = 0.0F;
		aFloat1453 = 1.0F;
		anInt1462 = -1;
		anIntArray1463 = null;
		anInt1464 = 0;
		anInt1476 = 0;
		aFloat1455 = 0.0F;
		anInt1468 = 0;
		aBool1477 = true;
		anInt1470 = -1;
		anIntArray1454 = null;
		anInt1472 = 0;
		anInt1473 = 0;
		aFloat1474 = 0.0F;
		anInt1475 = -1;
		anIntArray1471 = null;
		anInt1469 = 0;
		anInt1465 = 0;
		aFloat1479 = 0.0F;
		aClass180_Sub1_1456 = class180_sub1;
		aClass101_1457 = class101;
		anInt1458 = aClass180_Sub1_1456.anInt9387 * -1173855569;
		anIntArray1459 = aClass180_Sub1_1456.anIntArray9386;
		aFloatArray1460 = aClass180_Sub1_1456.aFloatArray9389;
		aClass595_1478 = Class595.aClass595_7816;
	}
}
