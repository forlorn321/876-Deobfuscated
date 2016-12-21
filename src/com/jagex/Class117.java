/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class117 {
	Class167_Sub1 aClass167_Sub1_1433;
	boolean aBool1434;
	boolean aBool1435;
	int anInt1436;
	int anInt1437;
	boolean aBool1438;
	float aFloat1439;
	int anInt1440;
	int anInt1441;
	float aFloat1442;
	float aFloat1443;
	float aFloat1444;
	float aFloat1445;
	int[] anIntArray1446;
	Class595 aClass595_1447;
	Class107 aClass107_1448;
	boolean aBool1449;
	int anInt1450;
	int[] anIntArray1451;
	float[] aFloatArray1452;
	int anInt1453;
	int anInt1454;
	int[] anIntArray1455;
	int anInt1456;
	int anInt1457;
	float aFloat1458;
	float aFloat1459;
	int anInt1460;
	boolean aBool1461;
	float aFloat1462;
	int[] anIntArray1463;
	int anInt1464;
	int anInt1465;
	float aFloat1466;
	int anInt1467;
	int[] anIntArray1468;
	int anInt1469;
	int anInt1470;
	boolean aBool1471 = false;

	final void method1487(boolean bool, boolean bool_0_, boolean bool_1_, float f, float f_2_, float f_3_, float f_4_, float f_5_, float f_6_, float f_7_, float f_8_, float f_9_, float f_10_, float f_11_, float f_12_) {
		if (!bool)
			method1507(false, bool_0_, bool_1_, f, f_2_, f_3_, f_4_, f_5_, f_6_, f_7_, f_8_, f_9_, 0);
		else if (aBool1471) {
			aClass167_Sub1_1433.method2060((int) f_4_, (int) f, (int) f_5_, (int) f_2_, (Class639.anIntArray8308[(int) f_10_ & 0xffff]), 254834806);
			aClass167_Sub1_1433.method2060((int) f_5_, (int) f_2_, (int) f_6_, (int) f_3_, (Class639.anIntArray8308[(int) f_10_ & 0xffff]), -728274460);
			aClass167_Sub1_1433.method2060((int) f_6_, (int) f_3_, (int) f_4_, (int) f, (Class639.anIntArray8308[(int) f_10_ & 0xffff]), -572652471);
		} else {
			float f_13_ = f_5_ - f_4_;
			float f_14_ = f_2_ - f;
			float f_15_ = f_6_ - f_4_;
			float f_16_ = f_3_ - f;
			float f_17_ = f_11_ - f_10_;
			float f_18_ = f_12_ - f_10_;
			float f_19_ = f_8_ - f_7_;
			float f_20_ = f_9_ - f_7_;
			float f_21_;
			if (f_3_ != f_2_)
				f_21_ = (f_6_ - f_5_) / (f_3_ - f_2_);
			else
				f_21_ = 0.0F;
			float f_22_;
			if (f_2_ != f)
				f_22_ = f_13_ / f_14_;
			else
				f_22_ = 0.0F;
			float f_23_;
			if (f_3_ != f)
				f_23_ = f_15_ / f_16_;
			else
				f_23_ = 0.0F;
			float f_24_ = f_13_ * f_16_ - f_15_ * f_14_;
			if (f_24_ != 0.0F) {
				float f_25_ = (f_17_ * f_16_ - f_18_ * f_14_) / f_24_;
				float f_26_ = (f_18_ * f_13_ - f_17_ * f_15_) / f_24_;
				float f_27_ = (f_19_ * f_16_ - f_20_ * f_14_) / f_24_;
				float f_28_ = (f_20_ * f_13_ - f_19_ * f_15_) / f_24_;
				if (f <= f_2_ && f <= f_3_) {
					if (!(f >= (float) anInt1460)) {
						if (f_2_ > (float) anInt1460)
							f_2_ = (float) anInt1460;
						if (f_3_ > (float) anInt1460)
							f_3_ = (float) anInt1460;
						f_10_ = f_10_ - f_25_ * f_4_ + f_25_;
						f_7_ = f_7_ - f_27_ * f_4_ + f_27_;
						if (f_2_ < f_3_) {
							f_6_ = f_4_;
							if (f < 0.0F) {
								f_6_ -= f_23_ * f;
								f_4_ -= f_22_ * f;
								f_10_ -= f_26_ * f;
								f_7_ -= f_28_ * f;
								f = 0.0F;
							}
							if (f_2_ < 0.0F) {
								f_5_ -= f_21_ * f_2_;
								f_2_ = 0.0F;
							}
							if (f != f_2_ && f_23_ < f_22_ || f == f_2_ && f_23_ > f_21_) {
								f += 0.5F;
								f_2_ += 0.5F;
								f_3_ = (float) (int) (f_3_ + 0.5F) - f_2_;
								f_2_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_2_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f, 0, 0, (int) f_6_, (int) f_4_, f_10_, f_25_, f_7_, f_27_);
									f_6_ += f_23_;
									f_4_ += f_22_;
									f_10_ += f_26_;
									f_7_ += f_28_;
									f += (float) anInt1440;
								}
								while (--f_3_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f, 0, 0, (int) f_6_, (int) f_5_, f_10_, f_25_, f_7_, f_27_);
									f_6_ += f_23_;
									f_5_ += f_21_;
									f_10_ += f_26_;
									f_7_ += f_28_;
									f += (float) anInt1440;
								}
							} else {
								f += 0.5F;
								f_2_ += 0.5F;
								f_3_ = (float) (int) (f_3_ + 0.5F) - f_2_;
								f_2_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_2_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f, 0, 0, (int) f_4_, (int) f_6_, f_10_, f_25_, f_7_, f_27_);
									f_6_ += f_23_;
									f_4_ += f_22_;
									f_10_ += f_26_;
									f_7_ += f_28_;
									f += (float) anInt1440;
								}
								while (--f_3_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f, 0, 0, (int) f_5_, (int) f_6_, f_10_, f_25_, f_7_, f_27_);
									f_6_ += f_23_;
									f_5_ += f_21_;
									f_10_ += f_26_;
									f_7_ += f_28_;
									f += (float) anInt1440;
								}
							}
						} else {
							f_5_ = f_4_;
							if (f < 0.0F) {
								f_5_ -= f_23_ * f;
								f_4_ -= f_22_ * f;
								f_10_ -= f_26_ * f;
								f_7_ -= f_28_ * f;
								f = 0.0F;
							}
							if (f_3_ < 0.0F) {
								f_6_ -= f_21_ * f_3_;
								f_3_ = 0.0F;
							}
							if (f != f_3_ && f_23_ < f_22_ || f == f_3_ && f_21_ > f_22_) {
								f += 0.5F;
								f_3_ += 0.5F;
								f_2_ = (float) (int) (f_2_ + 0.5F) - f_3_;
								f_3_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_3_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f, 0, 0, (int) f_5_, (int) f_4_, f_10_, f_25_, f_7_, f_27_);
									f_5_ += f_23_;
									f_4_ += f_22_;
									f_10_ += f_26_;
									f_7_ += f_28_;
									f += (float) anInt1440;
								}
								while (--f_2_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f, 0, 0, (int) f_6_, (int) f_4_, f_10_, f_25_, f_7_, f_27_);
									f_6_ += f_21_;
									f_4_ += f_22_;
									f_10_ += f_26_;
									f_7_ += f_28_;
									f += (float) anInt1440;
								}
							} else {
								f += 0.5F;
								f_3_ += 0.5F;
								f_2_ = (float) (int) (f_2_ + 0.5F) - f_3_;
								f_3_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_3_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f, 0, 0, (int) f_4_, (int) f_5_, f_10_, f_25_, f_7_, f_27_);
									f_5_ += f_23_;
									f_4_ += f_22_;
									f_10_ += f_26_;
									f_7_ += f_28_;
									f += (float) anInt1440;
								}
								while (--f_2_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f, 0, 0, (int) f_4_, (int) f_6_, f_10_, f_25_, f_7_, f_27_);
									f_6_ += f_21_;
									f_4_ += f_22_;
									f_10_ += f_26_;
									f_7_ += f_28_;
									f += (float) anInt1440;
								}
							}
						}
					}
				} else if (f_2_ <= f_3_) {
					if (!(f_2_ >= (float) anInt1460)) {
						if (f_3_ > (float) anInt1460)
							f_3_ = (float) anInt1460;
						if (f > (float) anInt1460)
							f = (float) anInt1460;
						f_11_ = f_11_ - f_25_ * f_5_ + f_25_;
						f_8_ = f_8_ - f_27_ * f_5_ + f_27_;
						if (f_3_ < f) {
							f_4_ = f_5_;
							if (f_2_ < 0.0F) {
								f_4_ -= f_22_ * f_2_;
								f_5_ -= f_21_ * f_2_;
								f_11_ -= f_26_ * f_2_;
								f_8_ -= f_28_ * f_2_;
								f_2_ = 0.0F;
							}
							if (f_3_ < 0.0F) {
								f_6_ -= f_23_ * f_3_;
								f_3_ = 0.0F;
							}
							if (f_2_ != f_3_ && f_22_ < f_21_ || f_2_ == f_3_ && f_22_ > f_23_) {
								f_2_ += 0.5F;
								f_3_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_3_;
								f_3_ -= f_2_;
								f_2_ = (float) anIntArray1446[(int) f_2_];
								while (--f_3_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f_2_, 0, 0, (int) f_4_, (int) f_5_, f_11_, f_25_, f_8_, f_27_);
									f_4_ += f_22_;
									f_5_ += f_21_;
									f_11_ += f_26_;
									f_8_ += f_28_;
									f_2_ += (float) anInt1440;
								}
								while (--f >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f_2_, 0, 0, (int) f_4_, (int) f_6_, f_11_, f_25_, f_8_, f_27_);
									f_4_ += f_22_;
									f_6_ += f_23_;
									f_11_ += f_26_;
									f_8_ += f_28_;
									f_2_ += (float) anInt1440;
								}
							} else {
								f_2_ += 0.5F;
								f_3_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_3_;
								f_3_ -= f_2_;
								f_2_ = (float) anIntArray1446[(int) f_2_];
								while (--f_3_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f_2_, 0, 0, (int) f_5_, (int) f_4_, f_11_, f_25_, f_8_, f_27_);
									f_4_ += f_22_;
									f_5_ += f_21_;
									f_11_ += f_26_;
									f_8_ += f_28_;
									f_2_ += (float) anInt1440;
								}
								while (--f >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f_2_, 0, 0, (int) f_6_, (int) f_4_, f_11_, f_25_, f_8_, f_27_);
									f_4_ += f_22_;
									f_6_ += f_23_;
									f_11_ += f_26_;
									f_8_ += f_28_;
									f_2_ += (float) anInt1440;
								}
							}
						} else {
							f_6_ = f_5_;
							if (f_2_ < 0.0F) {
								f_6_ -= f_22_ * f_2_;
								f_5_ -= f_21_ * f_2_;
								f_11_ -= f_26_ * f_2_;
								f_8_ -= f_28_ * f_2_;
								f_2_ = 0.0F;
							}
							if (f < 0.0F) {
								f_4_ -= f_23_ * f;
								f = 0.0F;
							}
							if (f_22_ < f_21_) {
								f_2_ += 0.5F;
								f += 0.5F;
								f_3_ = (float) (int) (f_3_ + 0.5F) - f;
								f -= f_2_;
								f_2_ = (float) anIntArray1446[(int) f_2_];
								while (--f >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f_2_, 0, 0, (int) f_6_, (int) f_5_, f_11_, f_25_, f_8_, f_27_);
									f_6_ += f_22_;
									f_5_ += f_21_;
									f_11_ += f_26_;
									f_8_ += f_28_;
									f_2_ += (float) anInt1440;
								}
								while (--f_3_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f_2_, 0, 0, (int) f_4_, (int) f_5_, f_11_, f_25_, f_8_, f_27_);
									f_4_ += f_23_;
									f_5_ += f_21_;
									f_11_ += f_26_;
									f_8_ += f_28_;
									f_2_ += (float) anInt1440;
								}
							} else {
								f_2_ += 0.5F;
								f += 0.5F;
								f_3_ = (float) (int) (f_3_ + 0.5F) - f;
								f -= f_2_;
								f_2_ = (float) anIntArray1446[(int) f_2_];
								while (--f >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f_2_, 0, 0, (int) f_5_, (int) f_6_, f_11_, f_25_, f_8_, f_27_);
									f_6_ += f_22_;
									f_5_ += f_21_;
									f_11_ += f_26_;
									f_8_ += f_28_;
									f_2_ += (float) anInt1440;
								}
								while (--f_3_ >= 0.0F) {
									method1488(bool_0_, bool_1_, anIntArray1451, (int) f_2_, 0, 0, (int) f_5_, (int) f_4_, f_11_, f_25_, f_8_, f_27_);
									f_4_ += f_23_;
									f_5_ += f_21_;
									f_11_ += f_26_;
									f_8_ += f_28_;
									f_2_ += (float) anInt1440;
								}
							}
						}
					}
				} else if (!(f_3_ >= (float) anInt1460)) {
					if (f > (float) anInt1460)
						f = (float) anInt1460;
					if (f_2_ > (float) anInt1460)
						f_2_ = (float) anInt1460;
					f_12_ = f_12_ - f_25_ * f_6_ + f_25_;
					f_9_ = f_9_ - f_27_ * f_6_ + f_27_;
					if (f < f_2_) {
						f_5_ = f_6_;
						if (f_3_ < 0.0F) {
							f_5_ -= f_21_ * f_3_;
							f_6_ -= f_23_ * f_3_;
							f_12_ -= f_26_ * f_3_;
							f_9_ -= f_28_ * f_3_;
							f_3_ = 0.0F;
						}
						if (f < 0.0F) {
							f_4_ -= f_22_ * f;
							f = 0.0F;
						}
						if (f_21_ < f_23_) {
							f_3_ += 0.5F;
							f += 0.5F;
							f_2_ = (float) (int) (f_2_ + 0.5F) - f;
							f -= f_3_;
							f_3_ = (float) anIntArray1446[(int) f_3_];
							while (--f >= 0.0F) {
								method1488(bool_0_, bool_1_, anIntArray1451, (int) f_3_, 0, 0, (int) f_5_, (int) f_6_, f_12_, f_25_, f_9_, f_27_);
								f_5_ += f_21_;
								f_6_ += f_23_;
								f_12_ += f_26_;
								f_9_ += f_28_;
								f_3_ += (float) anInt1440;
							}
							while (--f_2_ >= 0.0F) {
								method1488(bool_0_, bool_1_, anIntArray1451, (int) f_3_, 0, 0, (int) f_5_, (int) f_4_, f_12_, f_25_, f_9_, f_27_);
								f_5_ += f_21_;
								f_4_ += f_22_;
								f_12_ += f_26_;
								f_9_ += f_28_;
								f_3_ += (float) anInt1440;
							}
						} else {
							f_3_ += 0.5F;
							f += 0.5F;
							f_2_ = (float) (int) (f_2_ + 0.5F) - f;
							f -= f_3_;
							f_3_ = (float) anIntArray1446[(int) f_3_];
							while (--f >= 0.0F) {
								method1488(bool_0_, bool_1_, anIntArray1451, (int) f_3_, 0, 0, (int) f_6_, (int) f_5_, f_12_, f_25_, f_9_, f_27_);
								f_5_ += f_21_;
								f_6_ += f_23_;
								f_12_ += f_26_;
								f_9_ += f_28_;
								f_3_ += (float) anInt1440;
							}
							while (--f_2_ >= 0.0F) {
								method1488(bool_0_, bool_1_, anIntArray1451, (int) f_3_, 0, 0, (int) f_4_, (int) f_5_, f_12_, f_25_, f_9_, f_27_);
								f_5_ += f_21_;
								f_4_ += f_22_;
								f_12_ += f_26_;
								f_9_ += f_28_;
								f_3_ += (float) anInt1440;
							}
						}
					} else {
						f_4_ = f_6_;
						if (f_3_ < 0.0F) {
							f_4_ -= f_21_ * f_3_;
							f_6_ -= f_23_ * f_3_;
							f_12_ -= f_26_ * f_3_;
							f_9_ -= f_28_ * f_3_;
							f_3_ = 0.0F;
						}
						if (f_2_ < 0.0F) {
							f_5_ -= f_22_ * f_2_;
							f_2_ = 0.0F;
						}
						if (f_21_ < f_23_) {
							f_3_ += 0.5F;
							f_2_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_2_;
							f_2_ -= f_3_;
							f_3_ = (float) anIntArray1446[(int) f_3_];
							while (--f_2_ >= 0.0F) {
								method1488(bool_0_, bool_1_, anIntArray1451, (int) f_3_, 0, 0, (int) f_4_, (int) f_6_, f_12_, f_25_, f_9_, f_27_);
								f_4_ += f_21_;
								f_6_ += f_23_;
								f_12_ += f_26_;
								f_9_ += f_28_;
								f_3_ += (float) anInt1440;
							}
							while (--f >= 0.0F) {
								method1488(bool_0_, bool_1_, anIntArray1451, (int) f_3_, 0, 0, (int) f_5_, (int) f_6_, f_12_, f_25_, f_9_, f_27_);
								f_5_ += f_22_;
								f_6_ += f_23_;
								f_12_ += f_26_;
								f_9_ += f_28_;
								f_3_ += (float) anInt1440;
							}
						} else {
							f_3_ += 0.5F;
							f_2_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_2_;
							f_2_ -= f_3_;
							f_3_ = (float) anIntArray1446[(int) f_3_];
							while (--f_2_ >= 0.0F) {
								method1488(bool_0_, bool_1_, anIntArray1451, (int) f_3_, 0, 0, (int) f_6_, (int) f_4_, f_12_, f_25_, f_9_, f_27_);
								f_4_ += f_21_;
								f_6_ += f_23_;
								f_12_ += f_26_;
								f_9_ += f_28_;
								f_3_ += (float) anInt1440;
							}
							while (--f >= 0.0F) {
								method1488(bool_0_, bool_1_, anIntArray1451, (int) f_3_, 0, 0, (int) f_6_, (int) f_5_, f_12_, f_25_, f_9_, f_27_);
								f_5_ += f_22_;
								f_6_ += f_23_;
								f_12_ += f_26_;
								f_9_ += f_28_;
								f_3_ += (float) anInt1440;
							}
						}
					}
				}
			}
		}
	}

	final void method1488(boolean bool, boolean bool_29_, int[] is, int i, int i_30_, int i_31_, int i_32_, int i_33_, float f, float f_34_, float f_35_, float f_36_) {
		if (aBool1449) {
			if (i_33_ > anInt1441)
				i_33_ = anInt1441;
			if (i_32_ < 0)
				i_32_ = 0;
		}
		if (i_32_ < i_33_) {
			i += i_32_ - 1;
			f += f_34_ * (float) i_32_;
			f_35_ += f_36_ * (float) i_32_;
			if (aClass107_1448.aBool1285) {
				if (aBool1434) {
					i_31_ = i_33_ - i_32_ >> 2;
					f_34_ *= 4.0F;
					if (anInt1436 == 0) {
						if (i_31_ > 0) {
							do {
								i_30_ = (Class639.anIntArray8308[(int) f & 0xffff]);
								f += f_34_;
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									is[i] = i_30_;
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									is[i] = i_30_;
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									is[i] = i_30_;
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									is[i] = i_30_;
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
							} while (--i_31_ > 0);
						}
						i_31_ = i_33_ - i_32_ & 0x3;
						if (i_31_ > 0) {
							i_30_ = Class639.anIntArray8308[(int) f & 0xffff];
							do {
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									is[i] = i_30_;
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
							} while (--i_31_ > 0);
						}
					} else {
						int i_37_ = anInt1436;
						int i_38_ = 256 - anInt1436;
						if (i_31_ > 0) {
							do {
								i_30_ = (Class639.anIntArray8308[(int) f & 0xffff]);
								f += f_34_;
								i_30_ = (((i_30_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff) + ((i_30_ & 0xff00) * i_38_ >> 8 & 0xff00));
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									int i_39_ = is[i];
									if (bool_29_)
										is[i] = ((i_38_ | i_39_ >> 24) << 24 | (i_30_ + (((i_39_ & 0xff00ff) * i_37_) >> 8 & 0xff00ff) + (((i_39_ & 0xff00) * i_37_ >> 8) & 0xff00)));
									else
										is[i] = (i_30_ + (((i_39_ & 0xff00ff) * i_37_ >> 8) & 0xff00ff) + ((i_39_ & 0xff00) * i_37_ >> 8 & 0xff00));
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									int i_40_ = is[i];
									if (bool_29_)
										is[i] = ((i_38_ | i_40_ >> 24) << 24 | (i_30_ + (((i_40_ & 0xff00ff) * i_37_) >> 8 & 0xff00ff) + (((i_40_ & 0xff00) * i_37_ >> 8) & 0xff00)));
									else
										is[i] = (i_30_ + (((i_40_ & 0xff00ff) * i_37_ >> 8) & 0xff00ff) + ((i_40_ & 0xff00) * i_37_ >> 8 & 0xff00));
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									int i_41_ = is[i];
									if (bool_29_)
										is[i] = ((i_38_ | i_41_ >> 24) << 24 | (i_30_ + (((i_41_ & 0xff00ff) * i_37_) >> 8 & 0xff00ff) + (((i_41_ & 0xff00) * i_37_ >> 8) & 0xff00)));
									else
										is[i] = (i_30_ + (((i_41_ & 0xff00ff) * i_37_ >> 8) & 0xff00ff) + ((i_41_ & 0xff00) * i_37_ >> 8 & 0xff00));
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									int i_42_ = is[i];
									if (bool_29_)
										is[i] = ((i_38_ | i_42_ >> 24) << 24 | (i_30_ + (((i_42_ & 0xff00ff) * i_37_) >> 8 & 0xff00ff) + (((i_42_ & 0xff00) * i_37_ >> 8) & 0xff00)));
									else
										is[i] = (i_30_ + (((i_42_ & 0xff00ff) * i_37_ >> 8) & 0xff00ff) + ((i_42_ & 0xff00) * i_37_ >> 8 & 0xff00));
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
							} while (--i_31_ > 0);
						}
						i_31_ = i_33_ - i_32_ & 0x3;
						if (i_31_ > 0) {
							i_30_ = Class639.anIntArray8308[(int) f & 0xffff];
							i_30_ = (((i_30_ & 0xff00ff) * i_38_ >> 8 & 0xff00ff) + ((i_30_ & 0xff00) * i_38_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f_35_ < aFloatArray1452[i]) {
									int i_43_ = is[i];
									if (bool_29_)
										is[i] = ((i_38_ | i_43_ >> 24) << 24 | (i_30_ + (((i_43_ & 0xff00ff) * i_37_) >> 8 & 0xff00ff) + (((i_43_ & 0xff00) * i_37_ >> 8) & 0xff00)));
									else
										is[i] = (i_30_ + (((i_43_ & 0xff00ff) * i_37_ >> 8) & 0xff00ff) + ((i_43_ & 0xff00) * i_37_ >> 8 & 0xff00));
									if (bool)
										aFloatArray1452[i] = f_35_;
								}
								f_35_ += f_36_;
							} while (--i_31_ > 0);
						}
					}
				} else {
					i_31_ = i_33_ - i_32_;
					if (anInt1436 == 0) {
						do {
							i++;
							if (!bool || f_35_ < aFloatArray1452[i]) {
								is[i] = (Class639.anIntArray8308[(int) f & 0xffff]);
								if (bool)
									aFloatArray1452[i] = f_35_;
							}
							f_35_ += f_36_;
							f += f_34_;
						} while (--i_31_ > 0);
					} else {
						int i_44_ = anInt1436;
						int i_45_ = 256 - anInt1436;
						do {
							i++;
							if (!bool || f_35_ < aFloatArray1452[i]) {
								i_30_ = (Class639.anIntArray8308[(int) f & 0xffff]);
								i_30_ = (((i_30_ & 0xff00ff) * i_45_ >> 8 & 0xff00ff) + ((i_30_ & 0xff00) * i_45_ >> 8 & 0xff00));
								int i_46_ = is[i];
								if (bool_29_)
									is[i] = ((i_45_ | i_46_ >> 24) << 24 | (i_30_ + (((i_46_ & 0xff00ff) * i_44_ >> 8) & 0xff00ff) + ((i_46_ & 0xff00) * i_44_ >> 8 & 0xff00)));
								else
									is[i] = (i_30_ + ((i_46_ & 0xff00ff) * i_44_ >> 8 & 0xff00ff) + ((i_46_ & 0xff00) * i_44_ >> 8 & 0xff00));
								if (bool)
									aFloatArray1452[i] = f_35_;
							}
							f += f_34_;
							f_35_ += f_36_;
						} while (--i_31_ > 0);
					}
				}
			} else if (aBool1434) {
				i_31_ = i_33_ - i_32_ >> 2;
				f_34_ *= 4.0F;
				if (anInt1436 == 0) {
					if (i_31_ > 0) {
						do {
							i_30_ = Class639.anIntArray8308[(int) f & 0xffff];
							f += f_34_;
							i++;
							if (!bool || f_35_ < aFloatArray1452[i])
								is[i] = i_30_;
							f_35_ += f_36_;
							i++;
							if (!bool || f_35_ < aFloatArray1452[i])
								is[i] = i_30_;
							f_35_ += f_36_;
							i++;
							if (!bool || f_35_ < aFloatArray1452[i])
								is[i] = i_30_;
							f_35_ += f_36_;
							i++;
							if (!bool || f_35_ < aFloatArray1452[i])
								is[i] = i_30_;
							f_35_ += f_36_;
						} while (--i_31_ > 0);
					}
					i_31_ = i_33_ - i_32_ & 0x3;
					if (i_31_ > 0) {
						i_30_ = Class639.anIntArray8308[(int) f & 0xffff];
						do {
							i++;
							if (!bool || f_35_ < aFloatArray1452[i])
								is[i] = i_30_;
							f_35_ += f_36_;
						} while (--i_31_ > 0);
					}
				} else {
					int i_47_ = anInt1436;
					int i_48_ = 256 - anInt1436;
					if (i_31_ > 0) {
						do {
							i_30_ = Class639.anIntArray8308[(int) f & 0xffff];
							f += f_34_;
							i_30_ = (((i_30_ & 0xff00ff) * i_48_ >> 8 & 0xff00ff) + ((i_30_ & 0xff00) * i_48_ >> 8 & 0xff00));
							i++;
							if (!bool || f_35_ < aFloatArray1452[i]) {
								int i_49_ = is[i];
								if (bool_29_)
									is[i] = ((i_48_ | i_49_ >> 24) << 24 | (i_30_ + (((i_49_ & 0xff00ff) * i_47_ >> 8) & 0xff00ff) + ((i_49_ & 0xff00) * i_47_ >> 8 & 0xff00)));
								else
									is[i] = (i_30_ + ((i_49_ & 0xff00ff) * i_47_ >> 8 & 0xff00ff) + ((i_49_ & 0xff00) * i_47_ >> 8 & 0xff00));
							}
							f_35_ += f_36_;
							i++;
							if (!bool || f_35_ < aFloatArray1452[i]) {
								int i_50_ = is[i];
								if (bool_29_)
									is[i] = ((i_48_ | i_50_ >> 24) << 24 | (i_30_ + (((i_50_ & 0xff00ff) * i_47_ >> 8) & 0xff00ff) + ((i_50_ & 0xff00) * i_47_ >> 8 & 0xff00)));
								else
									is[i] = (i_30_ + ((i_50_ & 0xff00ff) * i_47_ >> 8 & 0xff00ff) + ((i_50_ & 0xff00) * i_47_ >> 8 & 0xff00));
							}
							f_35_ += f_36_;
							i++;
							if (!bool || f_35_ < aFloatArray1452[i]) {
								int i_51_ = is[i];
								if (bool_29_)
									is[i] = ((i_48_ | i_51_ >> 24) << 24 | (i_30_ + (((i_51_ & 0xff00ff) * i_47_ >> 8) & 0xff00ff) + ((i_51_ & 0xff00) * i_47_ >> 8 & 0xff00)));
								else
									is[i] = (i_30_ + ((i_51_ & 0xff00ff) * i_47_ >> 8 & 0xff00ff) + ((i_51_ & 0xff00) * i_47_ >> 8 & 0xff00));
							}
							f_35_ += f_36_;
							i++;
							if (!bool || f_35_ < aFloatArray1452[i]) {
								int i_52_ = is[i];
								if (bool_29_)
									is[i] = ((i_48_ | i_52_ >> 24) << 24 | (i_30_ + (((i_52_ & 0xff00ff) * i_47_ >> 8) & 0xff00ff) + ((i_52_ & 0xff00) * i_47_ >> 8 & 0xff00)));
								else
									is[i] = (i_30_ + ((i_52_ & 0xff00ff) * i_47_ >> 8 & 0xff00ff) + ((i_52_ & 0xff00) * i_47_ >> 8 & 0xff00));
							}
							f_35_ += f_36_;
						} while (--i_31_ > 0);
					}
					i_31_ = i_33_ - i_32_ & 0x3;
					if (i_31_ > 0) {
						i_30_ = Class639.anIntArray8308[(int) f & 0xffff];
						i_30_ = (((i_30_ & 0xff00ff) * i_48_ >> 8 & 0xff00ff) + ((i_30_ & 0xff00) * i_48_ >> 8 & 0xff00));
						do {
							i++;
							if (!bool || f_35_ < aFloatArray1452[i]) {
								int i_53_ = is[i];
								if (bool_29_)
									is[i] = ((i_48_ | i_53_ >> 24) << 24 | (i_30_ + (((i_53_ & 0xff00ff) * i_47_ >> 8) & 0xff00ff) + ((i_53_ & 0xff00) * i_47_ >> 8 & 0xff00)));
								else
									is[i] = (i_30_ + ((i_53_ & 0xff00ff) * i_47_ >> 8 & 0xff00ff) + ((i_53_ & 0xff00) * i_47_ >> 8 & 0xff00));
							}
							f_35_ += f_36_;
						} while (--i_31_ > 0);
					}
				}
			} else {
				i_31_ = i_33_ - i_32_;
				if (anInt1436 == 0) {
					do {
						i++;
						if (!bool || f_35_ < aFloatArray1452[i])
							is[i] = Class639.anIntArray8308[(int) f & 0xffff];
						f_35_ += f_36_;
						f += f_34_;
					} while (--i_31_ > 0);
				} else {
					int i_54_ = anInt1436;
					int i_55_ = 256 - anInt1436;
					do {
						i++;
						if (!bool || f_35_ < aFloatArray1452[i]) {
							i_30_ = Class639.anIntArray8308[(int) f & 0xffff];
							i_30_ = (((i_30_ & 0xff00ff) * i_55_ >> 8 & 0xff00ff) + ((i_30_ & 0xff00) * i_55_ >> 8 & 0xff00));
							int i_56_ = is[i];
							if (bool_29_)
								is[i] = ((i_55_ | i_56_ >> 24) << 24 | (i_30_ + ((i_56_ & 0xff00ff) * i_54_ >> 8 & 0xff00ff) + ((i_56_ & 0xff00) * i_54_ >> 8 & 0xff00)));
							else
								is[i] = (i_30_ + ((i_56_ & 0xff00ff) * i_54_ >> 8 & 0xff00ff) + ((i_56_ & 0xff00) * i_54_ >> 8 & 0xff00));
						}
						f += f_34_;
						f_35_ += f_36_;
					} while (--i_31_ > 0);
				}
			}
		}
	}

	final void method1489(boolean bool, boolean bool_57_, int[] is, int i, int i_58_, int i_59_, int i_60_, int i_61_, float f, float f_62_, float f_63_, float f_64_, float f_65_, float f_66_, float f_67_, float f_68_) {
		if (aBool1449) {
			if (i_61_ > anInt1441)
				i_61_ = anInt1441;
			if (i_60_ < 0)
				i_60_ = 0;
		}
		if (i_60_ < i_61_) {
			if (aBool1438) {
				i += i_60_;
				f_63_ += f_64_ * (float) i_60_;
				f_65_ += f_66_ * (float) i_60_;
				f_67_ += f_68_ * (float) i_60_;
				if (aBool1434) {
					i_59_ = i_61_ - i_60_ >> 2;
					f_64_ *= 4.0F;
					f_66_ *= 4.0F;
					f_68_ *= 4.0F;
					if (anInt1436 == 0) {
						if (i_59_ > 0) {
							do {
								i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
								is[i++] = i_58_;
								is[i++] = i_58_;
								is[i++] = i_58_;
								is[i++] = i_58_;
							} while (--i_59_ > 0);
						}
						i_59_ = i_61_ - i_60_ & 0x3;
						if (i_59_ > 0) {
							i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							do
								is[i++] = i_58_;
							while (--i_59_ > 0);
						}
					} else if (!aBool1435) {
						int i_69_ = anInt1436;
						int i_70_ = 256 - anInt1436;
						if (i_59_ > 0) {
							do {
								i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
								i_58_ = (((i_58_ & 0xff00ff) * i_70_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_70_ >> 8 & 0xff00));
								int i_71_ = is[i];
								if (bool_57_) {
									is[i++] = ((i_70_ | i_71_ >> 24) << 24 | (i_58_ + (((i_71_ & 0xff00ff) * i_69_ >> 8) & 0xff00ff) + ((i_71_ & 0xff00) * i_69_ >> 8 & 0xff00)));
									i_71_ = is[i];
									is[i++] = ((i_70_ | i_71_ >> 24) << 24 | (i_58_ + (((i_71_ & 0xff00ff) * i_69_ >> 8) & 0xff00ff) + ((i_71_ & 0xff00) * i_69_ >> 8 & 0xff00)));
									i_71_ = is[i];
									is[i++] = ((i_70_ | i_71_ >> 24) << 24 | (i_58_ + (((i_71_ & 0xff00ff) * i_69_ >> 8) & 0xff00ff) + ((i_71_ & 0xff00) * i_69_ >> 8 & 0xff00)));
									i_71_ = is[i];
									is[i++] = ((i_70_ | i_71_ >> 24) << 24 | (i_58_ + (((i_71_ & 0xff00ff) * i_69_ >> 8) & 0xff00ff) + ((i_71_ & 0xff00) * i_69_ >> 8 & 0xff00)));
								} else {
									is[i++] = (i_58_ + ((i_71_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff) + ((i_71_ & 0xff00) * i_69_ >> 8 & 0xff00));
									i_71_ = is[i];
									is[i++] = (i_58_ + ((i_71_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff) + ((i_71_ & 0xff00) * i_69_ >> 8 & 0xff00));
									i_71_ = is[i];
									is[i++] = (i_58_ + ((i_71_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff) + ((i_71_ & 0xff00) * i_69_ >> 8 & 0xff00));
									i_71_ = is[i];
									is[i++] = (i_58_ + ((i_71_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff) + ((i_71_ & 0xff00) * i_69_ >> 8 & 0xff00));
								}
							} while (--i_59_ > 0);
						}
						i_59_ = i_61_ - i_60_ & 0x3;
						if (i_59_ > 0) {
							i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							i_58_ = (((i_58_ & 0xff00ff) * i_70_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_70_ >> 8 & 0xff00));
							do {
								int i_72_ = is[i];
								if (bool_57_)
									is[i++] = ((i_70_ | i_72_ >> 24) << 24 | (i_58_ + (((i_72_ & 0xff00ff) * i_69_ >> 8) & 0xff00ff) + ((i_72_ & 0xff00) * i_69_ >> 8 & 0xff00)));
								else
									is[i++] = (i_58_ + ((i_72_ & 0xff00ff) * i_69_ >> 8 & 0xff00ff) + ((i_72_ & 0xff00) * i_69_ >> 8 & 0xff00));
							} while (--i_59_ > 0);
						}
					} else {
						if (i_59_ > 0) {
							do {
								i_58_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
								int[] is_73_ = is;
								int i_74_ = i++;
								int i_75_ = i_58_;
								int i_76_ = is_73_[i_74_];
								int i_77_ = i_75_ + i_76_;
								int i_78_ = (i_75_ & 0xff00ff) + (i_76_ & 0xff00ff);
								i_76_ = (i_78_ & 0x1000100) + (i_77_ - i_78_ & 0x10000);
								is_73_[i_74_] = (~0xffffff | i_77_ - i_76_ | i_76_ - (i_76_ >>> 8));
								int[] is_79_ = is;
								i_77_ = i++;
								i_78_ = i_58_;
								int i_80_ = is_79_[i_77_];
								int i_81_ = i_78_ + i_80_;
								int i_82_ = (i_78_ & 0xff00ff) + (i_80_ & 0xff00ff);
								i_80_ = (i_82_ & 0x1000100) + (i_81_ - i_82_ & 0x10000);
								is_79_[i_77_] = (~0xffffff | i_81_ - i_80_ | i_80_ - (i_80_ >>> 8));
								int[] is_83_ = is;
								i_81_ = i++;
								i_82_ = i_58_;
								int i_84_ = is_83_[i_81_];
								int i_85_ = i_82_ + i_84_;
								int i_86_ = (i_82_ & 0xff00ff) + (i_84_ & 0xff00ff);
								i_84_ = (i_86_ & 0x1000100) + (i_85_ - i_86_ & 0x10000);
								is_83_[i_81_] = (~0xffffff | i_85_ - i_84_ | i_84_ - (i_84_ >>> 8));
								int[] is_87_ = is;
								i_85_ = i++;
								i_86_ = i_58_;
								int i_88_ = is_87_[i_85_];
								int i_89_ = i_86_ + i_88_;
								int i_90_ = (i_86_ & 0xff00ff) + (i_88_ & 0xff00ff);
								i_88_ = (i_90_ & 0x1000100) + (i_89_ - i_90_ & 0x10000);
								is_87_[i_85_] = (~0xffffff | i_89_ - i_88_ | i_88_ - (i_88_ >>> 8));
							} while (--i_59_ > 0);
						}
						i_59_ = i_61_ - i_60_ & 0x3;
						if (i_59_ > 0) {
							i_58_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							do {
								int[] is_91_ = is;
								int i_92_ = i++;
								int i_93_ = i_58_;
								int i_94_ = is_91_[i_92_];
								int i_95_ = i_93_ + i_94_;
								int i_96_ = (i_93_ & 0xff00ff) + (i_94_ & 0xff00ff);
								i_94_ = (i_96_ & 0x1000100) + (i_95_ - i_96_ & 0x10000);
								is_91_[i_92_] = (~0xffffff | i_95_ - i_94_ | i_94_ - (i_94_ >>> 8));
							} while (--i_59_ > 0);
						}
					}
				} else {
					i_59_ = i_61_ - i_60_;
					if (anInt1436 == 0) {
						do {
							is[i++] = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							f_63_ += f_64_;
							f_65_ += f_66_;
							f_67_ += f_68_;
						} while (--i_59_ > 0);
					} else if (!aBool1435) {
						int i_97_ = anInt1436;
						int i_98_ = 256 - anInt1436;
						do {
							i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							f_63_ += f_64_;
							f_65_ += f_66_;
							f_67_ += f_68_;
							i_58_ = (((i_58_ & 0xff00ff) * i_98_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_98_ >> 8 & 0xff00));
							int i_99_ = is[i];
							if (bool_57_)
								is[i++] = ((i_98_ | i_99_ >> 24) << 24 | (i_58_ + ((i_99_ & 0xff00ff) * i_97_ >> 8 & 0xff00ff) + ((i_99_ & 0xff00) * i_97_ >> 8 & 0xff00)));
							else
								is[i++] = (i_58_ + ((i_99_ & 0xff00ff) * i_97_ >> 8 & 0xff00ff) + ((i_99_ & 0xff00) * i_97_ >> 8 & 0xff00));
						} while (--i_59_ > 0);
					} else {
						do {
							int[] is_100_ = is;
							int i_101_ = i++;
							int i_102_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							int i_103_ = is_100_[i_101_];
							int i_104_ = i_102_ + i_103_;
							int i_105_ = (i_102_ & 0xff00ff) + (i_103_ & 0xff00ff);
							i_103_ = (i_105_ & 0x1000100) + (i_104_ - i_105_ & 0x10000);
							is_100_[i_101_] = (~0xffffff | i_104_ - i_103_ | i_103_ - (i_103_ >>> 8));
							f_63_ += f_64_;
							f_65_ += f_66_;
							f_67_ += f_68_;
						} while (--i_59_ > 0);
					}
				}
			} else {
				i += i_60_ - 1;
				f += f_62_ * (float) i_60_;
				f_63_ += f_64_ * (float) i_60_;
				f_65_ += f_66_ * (float) i_60_;
				f_67_ += f_68_ * (float) i_60_;
				if (aClass107_1448.aBool1285) {
					if (aBool1434) {
						i_59_ = i_61_ - i_60_ >> 2;
						f_64_ *= 4.0F;
						f_66_ *= 4.0F;
						f_68_ *= 4.0F;
						if (anInt1436 == 0) {
							if (i_59_ > 0) {
								do {
									i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
									f_63_ += f_64_;
									f_65_ += f_66_;
									f_67_ += f_68_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										is[i] = i_58_;
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										is[i] = i_58_;
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										is[i] = i_58_;
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										is[i] = i_58_;
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
								} while (--i_59_ > 0);
							}
							i_59_ = i_61_ - i_60_ & 0x3;
							if (i_59_ > 0) {
								i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										is[i] = i_58_;
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
								} while (--i_59_ > 0);
							}
						} else if (!aBool1435) {
							int i_106_ = anInt1436;
							int i_107_ = 256 - anInt1436;
							if (i_59_ > 0) {
								do {
									i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
									f_63_ += f_64_;
									f_65_ += f_66_;
									f_67_ += f_68_;
									i_58_ = (((i_58_ & 0xff00ff) * i_107_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_107_ >> 8 & 0xff00));
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int i_108_ = is[i];
										if (bool_57_)
											is[i] = (((i_107_ | i_108_ >> 24) << 24) | (i_58_ + (((i_108_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_108_ & 0xff00) * i_106_) >> 8 & 0xff00)));
										else
											is[i] = (i_58_ + (((i_108_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_108_ & 0xff00) * i_106_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int i_109_ = is[i];
										if (bool_57_)
											is[i] = (((i_107_ | i_109_ >> 24) << 24) | (i_58_ + (((i_109_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_109_ & 0xff00) * i_106_) >> 8 & 0xff00)));
										else
											is[i] = (i_58_ + (((i_109_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_109_ & 0xff00) * i_106_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int i_110_ = is[i];
										if (bool_57_)
											is[i] = (((i_107_ | i_110_ >> 24) << 24) | (i_58_ + (((i_110_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_110_ & 0xff00) * i_106_) >> 8 & 0xff00)));
										else
											is[i] = (i_58_ + (((i_110_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_110_ & 0xff00) * i_106_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int i_111_ = is[i];
										if (bool_57_)
											is[i] = (((i_107_ | i_111_ >> 24) << 24) | (i_58_ + (((i_111_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_111_ & 0xff00) * i_106_) >> 8 & 0xff00)));
										else
											is[i] = (i_58_ + (((i_111_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_111_ & 0xff00) * i_106_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
								} while (--i_59_ > 0);
							}
							i_59_ = i_61_ - i_60_ & 0x3;
							if (i_59_ > 0) {
								i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								i_58_ = (((i_58_ & 0xff00ff) * i_107_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_107_ >> 8 & 0xff00));
								do {
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int i_112_ = is[i];
										if (bool_57_)
											is[i] = (((i_107_ | i_112_ >> 24) << 24) | (i_58_ + (((i_112_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_112_ & 0xff00) * i_106_) >> 8 & 0xff00)));
										else
											is[i] = (i_58_ + (((i_112_ & 0xff00ff) * i_106_) >> 8 & 0xff00ff) + (((i_112_ & 0xff00) * i_106_) >> 8 & 0xff00));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
								} while (--i_59_ > 0);
							}
						} else {
							if (i_59_ > 0) {
								do {
									i_58_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
									f_63_ += f_64_;
									f_65_ += f_66_;
									f_67_ += f_68_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int[] is_113_ = is;
										int i_114_ = i;
										int i_115_ = i_58_;
										int i_116_ = is_113_[i_114_];
										int i_117_ = i_115_ + i_116_;
										int i_118_ = ((i_115_ & 0xff00ff) + (i_116_ & 0xff00ff));
										i_116_ = ((i_118_ & 0x1000100) + (i_117_ - i_118_ & 0x10000));
										is_113_[i_114_] = (~0xffffff | i_117_ - i_116_ | i_116_ - (i_116_ >>> 8));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int[] is_119_ = is;
										int i_120_ = i;
										int i_121_ = i_58_;
										int i_122_ = is_119_[i_120_];
										int i_123_ = i_121_ + i_122_;
										int i_124_ = ((i_121_ & 0xff00ff) + (i_122_ & 0xff00ff));
										i_122_ = ((i_124_ & 0x1000100) + (i_123_ - i_124_ & 0x10000));
										is_119_[i_120_] = (~0xffffff | i_123_ - i_122_ | i_122_ - (i_122_ >>> 8));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int[] is_125_ = is;
										int i_126_ = i;
										int i_127_ = i_58_;
										int i_128_ = is_125_[i_126_];
										int i_129_ = i_127_ + i_128_;
										int i_130_ = ((i_127_ & 0xff00ff) + (i_128_ & 0xff00ff));
										i_128_ = ((i_130_ & 0x1000100) + (i_129_ - i_130_ & 0x10000));
										is_125_[i_126_] = (~0xffffff | i_129_ - i_128_ | i_128_ - (i_128_ >>> 8));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int[] is_131_ = is;
										int i_132_ = i;
										int i_133_ = i_58_;
										int i_134_ = is_131_[i_132_];
										int i_135_ = i_133_ + i_134_;
										int i_136_ = ((i_133_ & 0xff00ff) + (i_134_ & 0xff00ff));
										i_134_ = ((i_136_ & 0x1000100) + (i_135_ - i_136_ & 0x10000));
										is_131_[i_132_] = (~0xffffff | i_135_ - i_134_ | i_134_ - (i_134_ >>> 8));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
								} while (--i_59_ > 0);
							}
							i_59_ = i_61_ - i_60_ & 0x3;
							if (i_59_ > 0) {
								i_58_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								do {
									i++;
									if (!bool || f < aFloatArray1452[i]) {
										int[] is_137_ = is;
										int i_138_ = i;
										int i_139_ = i_58_;
										int i_140_ = is_137_[i_138_];
										int i_141_ = i_139_ + i_140_;
										int i_142_ = ((i_139_ & 0xff00ff) + (i_140_ & 0xff00ff));
										i_140_ = ((i_142_ & 0x1000100) + (i_141_ - i_142_ & 0x10000));
										is_137_[i_138_] = (~0xffffff | i_141_ - i_140_ | i_140_ - (i_140_ >>> 8));
										if (bool)
											aFloatArray1452[i] = f;
									}
									f += f_62_;
								} while (--i_59_ > 0);
							}
						}
					} else {
						i_59_ = i_61_ - i_60_;
						if (anInt1436 == 0) {
							do {
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									is[i] = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
									if (bool)
										aFloatArray1452[i] = f;
								}
								f += f_62_;
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
							} while (--i_59_ > 0);
						} else if (!aBool1435) {
							int i_143_ = anInt1436;
							int i_144_ = 256 - anInt1436;
							do {
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
									i_58_ = (((i_58_ & 0xff00ff) * i_144_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_144_ >> 8 & 0xff00));
									int i_145_ = is[i];
									if (bool_57_)
										is[i] = ((i_144_ | i_145_ >> 24) << 24 | (i_58_ + (((i_145_ & 0xff00ff) * i_143_) >> 8 & 0xff00ff) + (((i_145_ & 0xff00) * i_143_) >> 8 & 0xff00)));
									else
										is[i] = (i_58_ + (((i_145_ & 0xff00ff) * i_143_ >> 8) & 0xff00ff) + (((i_145_ & 0xff00) * i_143_ >> 8) & 0xff00));
									if (bool)
										aFloatArray1452[i] = f;
								}
								f += f_62_;
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
							} while (--i_59_ > 0);
						} else {
							do {
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int[] is_146_ = is;
									int i_147_ = i;
									int i_148_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
									int i_149_ = is_146_[i_147_];
									int i_150_ = i_148_ + i_149_;
									int i_151_ = ((i_148_ & 0xff00ff) + (i_149_ & 0xff00ff));
									i_149_ = ((i_151_ & 0x1000100) + (i_150_ - i_151_ & 0x10000));
									is_146_[i_147_] = (~0xffffff | i_150_ - i_149_ | i_149_ - (i_149_ >>> 8));
									if (bool)
										aFloatArray1452[i] = f;
								}
								f += f_62_;
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
							} while (--i_59_ > 0);
						}
					}
				} else if (aBool1434) {
					i_59_ = i_61_ - i_60_ >> 2;
					f_64_ *= 4.0F;
					f_66_ *= 4.0F;
					f_68_ *= 4.0F;
					if (anInt1436 == 0) {
						if (i_59_ > 0) {
							do {
								i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
								i++;
								if (!bool || f < aFloatArray1452[i])
									is[i] = i_58_;
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i])
									is[i] = i_58_;
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i])
									is[i] = i_58_;
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i])
									is[i] = i_58_;
								f += f_62_;
							} while (--i_59_ > 0);
						}
						i_59_ = i_61_ - i_60_ & 0x3;
						if (i_59_ > 0) {
							i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1452[i])
									is[i] = i_58_;
								f += f_62_;
							} while (--i_59_ > 0);
						}
					} else if (!aBool1435) {
						int i_152_ = anInt1436;
						int i_153_ = 256 - anInt1436;
						if (i_59_ > 0) {
							do {
								i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
								i_58_ = (((i_58_ & 0xff00ff) * i_153_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_153_ >> 8 & 0xff00));
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int i_154_ = is[i];
									if (bool_57_)
										is[i] = ((i_153_ | i_154_ >> 24) << 24 | (i_58_ + (((i_154_ & 0xff00ff) * i_152_) >> 8 & 0xff00ff) + (((i_154_ & 0xff00) * i_152_) >> 8 & 0xff00)));
									else
										is[i] = (i_58_ + (((i_154_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_154_ & 0xff00) * i_152_ >> 8) & 0xff00));
								}
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int i_155_ = is[i];
									if (bool_57_)
										is[i] = ((i_153_ | i_155_ >> 24) << 24 | (i_58_ + (((i_155_ & 0xff00ff) * i_152_) >> 8 & 0xff00ff) + (((i_155_ & 0xff00) * i_152_) >> 8 & 0xff00)));
									else
										is[i] = (i_58_ + (((i_155_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_155_ & 0xff00) * i_152_ >> 8) & 0xff00));
								}
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int i_156_ = is[i];
									if (bool_57_)
										is[i] = ((i_153_ | i_156_ >> 24) << 24 | (i_58_ + (((i_156_ & 0xff00ff) * i_152_) >> 8 & 0xff00ff) + (((i_156_ & 0xff00) * i_152_) >> 8 & 0xff00)));
									else
										is[i] = (i_58_ + (((i_156_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_156_ & 0xff00) * i_152_ >> 8) & 0xff00));
								}
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int i_157_ = is[i];
									if (bool_57_)
										is[i] = ((i_153_ | i_157_ >> 24) << 24 | (i_58_ + (((i_157_ & 0xff00ff) * i_152_) >> 8 & 0xff00ff) + (((i_157_ & 0xff00) * i_152_) >> 8 & 0xff00)));
									else
										is[i] = (i_58_ + (((i_157_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_157_ & 0xff00) * i_152_ >> 8) & 0xff00));
								}
								f += f_62_;
							} while (--i_59_ > 0);
						}
						i_59_ = i_61_ - i_60_ & 0x3;
						if (i_59_ > 0) {
							i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							i_58_ = (((i_58_ & 0xff00ff) * i_153_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_153_ >> 8 & 0xff00));
							do {
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int i_158_ = is[i];
									if (bool_57_)
										is[i] = ((i_153_ | i_158_ >> 24) << 24 | (i_58_ + (((i_158_ & 0xff00ff) * i_152_) >> 8 & 0xff00ff) + (((i_158_ & 0xff00) * i_152_) >> 8 & 0xff00)));
									else
										is[i] = (i_58_ + (((i_158_ & 0xff00ff) * i_152_ >> 8) & 0xff00ff) + (((i_158_ & 0xff00) * i_152_ >> 8) & 0xff00));
								}
								f += f_62_;
							} while (--i_59_ > 0);
						}
					} else {
						if (i_59_ > 0) {
							do {
								i_58_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								f_63_ += f_64_;
								f_65_ += f_66_;
								f_67_ += f_68_;
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int[] is_159_ = is;
									int i_160_ = i;
									int i_161_ = i_58_;
									int i_162_ = is_159_[i_160_];
									int i_163_ = i_161_ + i_162_;
									int i_164_ = ((i_161_ & 0xff00ff) + (i_162_ & 0xff00ff));
									i_162_ = ((i_164_ & 0x1000100) + (i_163_ - i_164_ & 0x10000));
									is_159_[i_160_] = (~0xffffff | i_163_ - i_162_ | i_162_ - (i_162_ >>> 8));
								}
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int[] is_165_ = is;
									int i_166_ = i;
									int i_167_ = i_58_;
									int i_168_ = is_165_[i_166_];
									int i_169_ = i_167_ + i_168_;
									int i_170_ = ((i_167_ & 0xff00ff) + (i_168_ & 0xff00ff));
									i_168_ = ((i_170_ & 0x1000100) + (i_169_ - i_170_ & 0x10000));
									is_165_[i_166_] = (~0xffffff | i_169_ - i_168_ | i_168_ - (i_168_ >>> 8));
								}
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int[] is_171_ = is;
									int i_172_ = i;
									int i_173_ = i_58_;
									int i_174_ = is_171_[i_172_];
									int i_175_ = i_173_ + i_174_;
									int i_176_ = ((i_173_ & 0xff00ff) + (i_174_ & 0xff00ff));
									i_174_ = ((i_176_ & 0x1000100) + (i_175_ - i_176_ & 0x10000));
									is_171_[i_172_] = (~0xffffff | i_175_ - i_174_ | i_174_ - (i_174_ >>> 8));
								}
								f += f_62_;
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int[] is_177_ = is;
									int i_178_ = i;
									int i_179_ = i_58_;
									int i_180_ = is_177_[i_178_];
									int i_181_ = i_179_ + i_180_;
									int i_182_ = ((i_179_ & 0xff00ff) + (i_180_ & 0xff00ff));
									i_180_ = ((i_182_ & 0x1000100) + (i_181_ - i_182_ & 0x10000));
									is_177_[i_178_] = (~0xffffff | i_181_ - i_180_ | i_180_ - (i_180_ >>> 8));
								}
								f += f_62_;
							} while (--i_59_ > 0);
						}
						i_59_ = i_61_ - i_60_ & 0x3;
						if (i_59_ > 0) {
							i_58_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							do {
								i++;
								if (!bool || f < aFloatArray1452[i]) {
									int[] is_183_ = is;
									int i_184_ = i;
									int i_185_ = i_58_;
									int i_186_ = is_183_[i_184_];
									int i_187_ = i_185_ + i_186_;
									int i_188_ = ((i_185_ & 0xff00ff) + (i_186_ & 0xff00ff));
									i_186_ = ((i_188_ & 0x1000100) + (i_187_ - i_188_ & 0x10000));
									is_183_[i_184_] = (~0xffffff | i_187_ - i_186_ | i_186_ - (i_186_ >>> 8));
								}
								f += f_62_;
							} while (--i_59_ > 0);
						}
					}
				} else {
					i_59_ = i_61_ - i_60_;
					if (anInt1436 == 0) {
						do {
							i++;
							if (!bool || f < aFloatArray1452[i])
								is[i] = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
							f += f_62_;
							f_63_ += f_64_;
							f_65_ += f_66_;
							f_67_ += f_68_;
						} while (--i_59_ > 0);
					} else if (!aBool1435) {
						int i_189_ = anInt1436;
						int i_190_ = 256 - anInt1436;
						do {
							i++;
							if (!bool || f < aFloatArray1452[i]) {
								i_58_ = ~0xffffff | ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								i_58_ = (((i_58_ & 0xff00ff) * i_190_ >> 8 & 0xff00ff) + ((i_58_ & 0xff00) * i_190_ >> 8 & 0xff00));
								int i_191_ = is[i];
								if (bool_57_)
									is[i] = ((i_190_ | i_191_ >> 24) << 24 | (i_58_ + (((i_191_ & 0xff00ff) * i_189_ >> 8) & 0xff00ff) + (((i_191_ & 0xff00) * i_189_ >> 8) & 0xff00)));
								else
									is[i] = (i_58_ + ((i_191_ & 0xff00ff) * i_189_ >> 8 & 0xff00ff) + ((i_191_ & 0xff00) * i_189_ >> 8 & 0xff00));
							}
							f += f_62_;
							f_63_ += f_64_;
							f_65_ += f_66_;
							f_67_ += f_68_;
						} while (--i_59_ > 0);
					} else {
						do {
							i++;
							if (!bool || f < aFloatArray1452[i]) {
								int[] is_192_ = is;
								int i_193_ = i;
								int i_194_ = ((int) f_63_ & 0xff0000 | (int) f_65_ & 0xff00 | (int) f_67_ & 0xff);
								int i_195_ = is_192_[i_193_];
								int i_196_ = i_194_ + i_195_;
								int i_197_ = ((i_194_ & 0xff00ff) + (i_195_ & 0xff00ff));
								i_195_ = (i_197_ & 0x1000100) + (i_196_ - i_197_ & 0x10000);
								is_192_[i_193_] = (~0xffffff | i_196_ - i_195_ | i_195_ - (i_195_ >>> 8));
							}
							f += f_62_;
							f_63_ += f_64_;
							f_65_ += f_66_;
							f_67_ += f_68_;
						} while (--i_59_ > 0);
					}
				}
			}
		}
	}

	int method1490() {
		return anIntArray1446[0] % anInt1440;
	}

	final void method1491(boolean bool, boolean bool_198_, boolean bool_199_, float f, float f_200_, float f_201_, float f_202_, float f_203_, float f_204_, float f_205_, float f_206_, float f_207_, float f_208_, float f_209_, float f_210_, float f_211_, float f_212_, float f_213_, float f_214_, float f_215_, float f_216_, int i, int i_217_, int i_218_, int i_219_, float f_220_, float f_221_, float f_222_, int i_223_) {
		if (!bool)
			method1507(false, bool_198_, bool_199_, f, f_200_, f_201_, f_202_, f_203_, f_204_, f_205_, f_206_, f_207_, 0);
		else {
			int i_224_ = i_223_ & 0xffff;
			if (i_224_ != anInt1454) {
				anIntArray1455 = aClass167_Sub1_1433.method8444(i_224_);
				if (anIntArray1455 == null) {
					anInt1454 = -1;
					anInt1436 = 255 - (i >> 24 & 0xff);
					anInt1465 = 0;
					int i_225_ = (Class639.anIntArray8308[Class254.method3537(aClass167_Sub1_1433.method8448(i_223_), 1409175155) & 0xffff]);
					int i_226_ = (~0xffffff | ((i >> 16 & 0xff) * (i_225_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_225_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_225_ & 0xff) >> 8);
					method1504(true, bool_198_, bool_199_, f, f_200_, f_201_, f_202_, f_203_, f_204_, f_205_, f_206_, f_207_, Class302.method4097(i_226_, i_219_, f_220_, -1825552150), Class302.method4097(i_226_, i_219_, f_221_, -1283859155), Class302.method4097(i_226_, i_219_, f_222_, -1826985262));
					return;
				}
				anInt1454 = i_224_;
				anInt1456 = aClass167_Sub1_1433.method8446(i_223_);
				anInt1457 = anInt1456 - 1;
				aClass595_1447 = aClass167_Sub1_1433.method8465(i_223_);
				aBool1461 = aClass167_Sub1_1433.method8449(i_223_);
				anInt1465 = aClass167_Sub1_1433.method8447(i_223_) & 0xff;
			}
			anInt1453 = i_219_;
			if (!(f <= f_200_) || !(f <= f_201_)) {
				if (f_200_ <= f_201_) {
					float f_227_ = f_202_;
					f_202_ = f_203_;
					f_203_ = f_227_;
					f_227_ = f;
					f = f_200_;
					f_200_ = f_227_;
					f_227_ = f_205_;
					f_205_ = f_206_;
					f_206_ = f_227_;
					f_227_ = f_211_;
					f_211_ = f_212_;
					f_212_ = f_227_;
					f_227_ = f_214_;
					f_214_ = f_215_;
					f_215_ = f_227_;
					f_227_ = f_208_;
					f_208_ = f_209_;
					f_209_ = f_227_;
					f_227_ = f_220_;
					f_220_ = f_221_;
					f_221_ = f_227_;
					int i_228_ = i;
					i = i_217_;
					i_217_ = i_228_;
				} else {
					float f_229_ = f_202_;
					f_202_ = f_204_;
					f_204_ = f_229_;
					f_229_ = f;
					f = f_201_;
					f_201_ = f_229_;
					f_229_ = f_205_;
					f_205_ = f_207_;
					f_207_ = f_229_;
					f_229_ = f_211_;
					f_211_ = f_213_;
					f_213_ = f_229_;
					f_229_ = f_214_;
					f_214_ = f_216_;
					f_216_ = f_229_;
					f_229_ = f_208_;
					f_208_ = f_210_;
					f_210_ = f_229_;
					f_229_ = f_220_;
					f_220_ = f_222_;
					f_222_ = f_229_;
					int i_230_ = i;
					i = i_218_;
					i_218_ = i_230_;
				}
			}
			f_211_ /= f_208_;
			f_212_ /= f_209_;
			f_213_ /= f_210_;
			f_214_ /= f_208_;
			f_215_ /= f_209_;
			f_216_ /= f_210_;
			f_205_ = 1.0F / f_205_;
			f_206_ = 1.0F / f_206_;
			f_207_ = 1.0F / f_207_;
			f_208_ = 1.0F / f_208_;
			f_209_ = 1.0F / f_209_;
			f_210_ = 1.0F / f_210_;
			float f_231_ = (float) (i >> 24 & 0xff);
			float f_232_ = (float) (i_217_ >> 24 & 0xff);
			float f_233_ = (float) (i_218_ >> 24 & 0xff);
			float f_234_ = (float) (i >> 16 & 0xff);
			float f_235_ = (float) (i_217_ >> 16 & 0xff);
			float f_236_ = (float) (i_218_ >> 16 & 0xff);
			float f_237_ = (float) (i >> 8 & 0xff);
			float f_238_ = (float) (i_217_ >> 8 & 0xff);
			float f_239_ = (float) (i_218_ >> 8 & 0xff);
			float f_240_ = (float) (i & 0xff);
			float f_241_ = (float) (i_217_ & 0xff);
			float f_242_ = (float) (i_218_ & 0xff);
			float f_243_ = 0.0F;
			float f_244_ = 0.0F;
			float f_245_ = 0.0F;
			float f_246_ = 0.0F;
			float f_247_ = 0.0F;
			float f_248_ = 0.0F;
			float f_249_ = 0.0F;
			float f_250_ = 0.0F;
			float f_251_ = 0.0F;
			float f_252_ = 0.0F;
			if (f_200_ != f) {
				float f_253_ = f_200_ - f;
				f_243_ = (f_203_ - f_202_) / f_253_;
				f_244_ = (f_206_ - f_205_) / f_253_;
				f_245_ = (f_209_ - f_208_) / f_253_;
				f_246_ = (f_212_ - f_211_) / f_253_;
				f_247_ = (f_215_ - f_214_) / f_253_;
				f_248_ = (f_221_ - f_220_) / f_253_;
				f_249_ = (f_232_ - f_231_) / f_253_;
				f_250_ = (f_235_ - f_234_) / f_253_;
				f_251_ = (f_238_ - f_237_) / f_253_;
				f_252_ = (f_241_ - f_240_) / f_253_;
			}
			float f_254_ = 0.0F;
			float f_255_ = 0.0F;
			float f_256_ = 0.0F;
			float f_257_ = 0.0F;
			float f_258_ = 0.0F;
			float f_259_ = 0.0F;
			float f_260_ = 0.0F;
			float f_261_ = 0.0F;
			float f_262_ = 0.0F;
			float f_263_ = 0.0F;
			if (f_201_ != f_200_) {
				float f_264_ = f_201_ - f_200_;
				f_254_ = (f_204_ - f_203_) / f_264_;
				f_255_ = (f_207_ - f_206_) / f_264_;
				f_256_ = (f_210_ - f_209_) / f_264_;
				f_257_ = (f_213_ - f_212_) / f_264_;
				f_258_ = (f_216_ - f_215_) / f_264_;
				f_259_ = (f_222_ - f_221_) / f_264_;
				f_260_ = (f_233_ - f_232_) / f_264_;
				f_261_ = (f_236_ - f_235_) / f_264_;
				f_262_ = (f_239_ - f_238_) / f_264_;
				f_263_ = (f_242_ - f_241_) / f_264_;
			}
			float f_265_ = 0.0F;
			float f_266_ = 0.0F;
			float f_267_ = 0.0F;
			float f_268_ = 0.0F;
			float f_269_ = 0.0F;
			float f_270_ = 0.0F;
			float f_271_ = 0.0F;
			float f_272_ = 0.0F;
			float f_273_ = 0.0F;
			float f_274_ = 0.0F;
			if (f != f_201_) {
				float f_275_ = f - f_201_;
				f_265_ = (f_202_ - f_204_) / f_275_;
				f_266_ = (f_205_ - f_207_) / f_275_;
				f_267_ = (f_208_ - f_210_) / f_275_;
				f_268_ = (f_211_ - f_213_) / f_275_;
				f_269_ = (f_214_ - f_216_) / f_275_;
				f_270_ = (f_220_ - f_222_) / f_275_;
				f_271_ = (f_231_ - f_233_) / f_275_;
				f_272_ = (f_234_ - f_236_) / f_275_;
				f_273_ = (f_237_ - f_239_) / f_275_;
				f_274_ = (f_240_ - f_242_) / f_275_;
			}
			if (!(f >= (float) anInt1460)) {
				if (f_200_ > (float) anInt1460)
					f_200_ = (float) anInt1460;
				if (f_201_ > (float) anInt1460)
					f_201_ = (float) anInt1460;
				if (f_200_ < f_201_) {
					f_204_ = f_202_;
					f_207_ = f_205_;
					f_210_ = f_208_;
					f_213_ = f_211_;
					f_216_ = f_214_;
					f_222_ = f_220_;
					f_233_ = f_231_;
					f_236_ = f_234_;
					f_239_ = f_237_;
					f_242_ = f_240_;
					if (f < 0.0F) {
						f_202_ -= f_243_ * f;
						f_204_ -= f_265_ * f;
						f_205_ -= f_244_ * f;
						f_207_ -= f_266_ * f;
						f_208_ -= f_245_ * f;
						f_210_ -= f_267_ * f;
						f_211_ -= f_246_ * f;
						f_213_ -= f_268_ * f;
						f_214_ -= f_247_ * f;
						f_216_ -= f_269_ * f;
						f_220_ -= f_248_ * f;
						f_222_ -= f_270_ * f;
						f_231_ -= f_249_ * f;
						f_233_ -= f_271_ * f;
						f_234_ -= f_249_ * f;
						f_236_ -= f_271_ * f;
						f_237_ -= f_249_ * f;
						f_239_ -= f_271_ * f;
						f_240_ -= f_249_ * f;
						f_242_ -= f_271_ * f;
						f = 0.0F;
					}
					if (f_200_ < 0.0F) {
						f_203_ -= f_254_ * f_200_;
						f_206_ -= f_255_ * f_200_;
						f_209_ -= f_256_ * f_200_;
						f_212_ -= f_257_ * f_200_;
						f_215_ -= f_258_ * f_200_;
						f_221_ -= f_259_ * f_200_;
						f_232_ -= f_260_ * f_200_;
						f_235_ -= f_261_ * f_200_;
						f_238_ -= f_262_ * f_200_;
						f_241_ -= f_263_ * f_200_;
						f_200_ = 0.0F;
					}
					if (f != f_200_ && f_265_ < f_243_ || f == f_200_ && f_265_ > f_254_) {
						f += 0.5F;
						f_200_ += 0.5F;
						f_201_ = (float) (int) (f_201_ + 0.5F) - f_200_;
						f_200_ -= f;
						f = (float) anIntArray1446[(int) f];
						while (--f_200_ >= 0.0F) {
							method1492(bool_198_, bool_199_, anIntArray1451, anIntArray1455, (int) f, (int) f_204_, (int) f_202_, f_207_, f_205_, f_210_, f_208_, f_213_, f_211_, f_216_, f_214_, f_222_, f_220_, f_233_, f_231_, f_236_, f_234_, f_239_, f_237_, f_242_, f_240_);
							f_202_ += f_243_;
							f_204_ += f_265_;
							f_205_ += f_244_;
							f_207_ += f_266_;
							f_208_ += f_245_;
							f_210_ += f_267_;
							f_211_ += f_246_;
							f_213_ += f_268_;
							f_214_ += f_247_;
							f_216_ += f_269_;
							f_220_ += f_248_;
							f_222_ += f_270_;
							f_231_ += f_249_;
							f_233_ += f_271_;
							f_234_ += f_250_;
							f_236_ += f_272_;
							f_237_ += f_251_;
							f_239_ += f_273_;
							f_240_ += f_252_;
							f_242_ += f_274_;
							f += (float) anInt1440;
						}
						while (--f_201_ >= 0.0F) {
							method1492(bool_198_, bool_199_, anIntArray1451, anIntArray1455, (int) f, (int) f_204_, (int) f_203_, f_207_, f_206_, f_210_, f_209_, f_213_, f_212_, f_216_, f_215_, f_222_, f_221_, f_233_, f_232_, f_236_, f_235_, f_239_, f_238_, f_242_, f_241_);
							f_203_ += f_254_;
							f_204_ += f_265_;
							f_206_ += f_255_;
							f_207_ += f_266_;
							f_209_ += f_256_;
							f_210_ += f_267_;
							f_212_ += f_257_;
							f_213_ += f_268_;
							f_215_ += f_258_;
							f_216_ += f_269_;
							f_221_ += f_259_;
							f_222_ += f_270_;
							f_232_ += f_260_;
							f_233_ += f_271_;
							f_235_ += f_261_;
							f_236_ += f_272_;
							f_238_ += f_262_;
							f_239_ += f_273_;
							f_241_ += f_263_;
							f_242_ += f_274_;
							f += (float) anInt1440;
						}
					} else {
						f += 0.5F;
						f_200_ += 0.5F;
						f_201_ = (float) (int) (f_201_ + 0.5F) - f_200_;
						f_200_ -= f;
						f = (float) anIntArray1446[(int) f];
						while (--f_200_ >= 0.0F) {
							method1492(bool_198_, bool_199_, anIntArray1451, anIntArray1455, (int) f, (int) f_202_, (int) f_204_, f_205_, f_207_, f_208_, f_210_, f_211_, f_213_, f_214_, f_216_, f_220_, f_222_, f_231_, f_233_, f_234_, f_236_, f_237_, f_239_, f_240_, f_242_);
							f_202_ += f_243_;
							f_204_ += f_265_;
							f_205_ += f_244_;
							f_207_ += f_266_;
							f_208_ += f_245_;
							f_210_ += f_267_;
							f_211_ += f_246_;
							f_213_ += f_268_;
							f_214_ += f_247_;
							f_216_ += f_269_;
							f_220_ += f_248_;
							f_222_ += f_270_;
							f_231_ += f_249_;
							f_233_ += f_271_;
							f_234_ += f_250_;
							f_236_ += f_272_;
							f_237_ += f_251_;
							f_239_ += f_273_;
							f_240_ += f_252_;
							f_242_ += f_274_;
							f += (float) anInt1440;
						}
						while (--f_201_ >= 0.0F) {
							method1492(bool_198_, bool_199_, anIntArray1451, anIntArray1455, (int) f, (int) f_203_, (int) f_204_, f_206_, f_207_, f_209_, f_210_, f_212_, f_213_, f_215_, f_216_, f_221_, f_222_, f_232_, f_233_, f_235_, f_236_, f_238_, f_239_, f_241_, f_242_);
							f_203_ += f_254_;
							f_204_ += f_265_;
							f_206_ += f_255_;
							f_207_ += f_266_;
							f_209_ += f_256_;
							f_210_ += f_267_;
							f_212_ += f_257_;
							f_213_ += f_268_;
							f_215_ += f_258_;
							f_216_ += f_269_;
							f_221_ += f_259_;
							f_222_ += f_270_;
							f_232_ += f_260_;
							f_233_ += f_271_;
							f_235_ += f_261_;
							f_236_ += f_272_;
							f_238_ += f_262_;
							f_239_ += f_273_;
							f_241_ += f_263_;
							f_242_ += f_274_;
							f += (float) anInt1440;
						}
					}
				} else {
					f_203_ = f_202_;
					f_206_ = f_205_;
					f_209_ = f_208_;
					f_212_ = f_211_;
					f_215_ = f_214_;
					f_221_ = f_220_;
					f_232_ = f_231_;
					f_235_ = f_234_;
					f_238_ = f_237_;
					f_241_ = f_240_;
					if (f < 0.0F) {
						f_202_ -= f_243_ * f;
						f_203_ -= f_265_ * f;
						f_205_ -= f_244_ * f;
						f_206_ -= f_266_ * f;
						f_208_ -= f_245_ * f;
						f_209_ -= f_267_ * f;
						f_211_ -= f_246_ * f;
						f_212_ -= f_268_ * f;
						f_214_ -= f_247_ * f;
						f_215_ -= f_269_ * f;
						f_220_ -= f_248_ * f;
						f_221_ -= f_270_ * f;
						f_231_ -= f_249_ * f;
						f_232_ -= f_271_ * f;
						f_234_ -= f_249_ * f;
						f_235_ -= f_271_ * f;
						f_237_ -= f_249_ * f;
						f_238_ -= f_271_ * f;
						f_240_ -= f_249_ * f;
						f_241_ -= f_271_ * f;
						f = 0.0F;
					}
					if (f_201_ < 0.0F) {
						f_204_ -= f_254_ * f_201_;
						f_207_ -= f_255_ * f_201_;
						f_210_ -= f_256_ * f_201_;
						f_213_ -= f_257_ * f_201_;
						f_216_ -= f_258_ * f_201_;
						f_222_ -= f_259_ * f_201_;
						f_233_ -= f_260_ * f_201_;
						f_236_ -= f_261_ * f_201_;
						f_239_ -= f_262_ * f_201_;
						f_242_ -= f_263_ * f_201_;
						f_201_ = 0.0F;
					}
					if (f != f_201_ && f_265_ < f_243_ || f == f_201_ && f_254_ > f_243_) {
						f += 0.5F;
						f_201_ += 0.5F;
						f_200_ = (float) (int) (f_200_ + 0.5F) - f_201_;
						f_201_ -= f;
						f = (float) anIntArray1446[(int) f];
						while (--f_201_ >= 0.0F) {
							method1492(bool_198_, bool_199_, anIntArray1451, anIntArray1455, (int) f, (int) f_203_, (int) f_202_, f_206_, f_205_, f_209_, f_208_, f_212_, f_211_, f_215_, f_214_, f_221_, f_220_, f_232_, f_231_, f_235_, f_234_, f_238_, f_237_, f_241_, f_240_);
							f_202_ += f_243_;
							f_203_ += f_265_;
							f_205_ += f_244_;
							f_206_ += f_266_;
							f_208_ += f_245_;
							f_209_ += f_267_;
							f_211_ += f_246_;
							f_212_ += f_268_;
							f_214_ += f_247_;
							f_215_ += f_269_;
							f_220_ += f_248_;
							f_221_ += f_270_;
							f_231_ += f_249_;
							f_232_ += f_271_;
							f_234_ += f_250_;
							f_235_ += f_272_;
							f_237_ += f_251_;
							f_238_ += f_273_;
							f_240_ += f_252_;
							f_241_ += f_274_;
							f += (float) anInt1440;
						}
						while (--f_200_ >= 0.0F) {
							method1492(bool_198_, bool_199_, anIntArray1451, anIntArray1455, (int) f, (int) f_204_, (int) f_202_, f_207_, f_205_, f_210_, f_208_, f_213_, f_211_, f_216_, f_214_, f_222_, f_220_, f_233_, f_231_, f_236_, f_234_, f_239_, f_237_, f_242_, f_240_);
							f_204_ += f_254_;
							f_202_ += f_243_;
							f_207_ += f_255_;
							f_205_ += f_244_;
							f_210_ += f_256_;
							f_208_ += f_245_;
							f_213_ += f_257_;
							f_211_ += f_246_;
							f_216_ += f_258_;
							f_214_ += f_247_;
							f_222_ += f_259_;
							f_220_ += f_248_;
							f_233_ += f_260_;
							f_231_ += f_249_;
							f_236_ += f_261_;
							f_234_ += f_250_;
							f_239_ += f_262_;
							f_237_ += f_251_;
							f_242_ += f_263_;
							f_240_ += f_252_;
							f += (float) anInt1440;
						}
					} else {
						f += 0.5F;
						f_201_ += 0.5F;
						f_200_ = (float) (int) (f_200_ + 0.5F) - f_201_;
						f_201_ -= f;
						f = (float) anIntArray1446[(int) f];
						while (--f_201_ >= 0.0F) {
							method1492(bool_198_, bool_199_, anIntArray1451, anIntArray1455, (int) f, (int) f_202_, (int) f_203_, f_205_, f_206_, f_208_, f_209_, f_211_, f_212_, f_214_, f_215_, f_220_, f_221_, f_231_, f_232_, f_234_, f_235_, f_237_, f_238_, f_240_, f_241_);
							f_203_ += f_265_;
							f_202_ += f_243_;
							f_206_ += f_266_;
							f_205_ += f_244_;
							f_209_ += f_267_;
							f_208_ += f_245_;
							f_212_ += f_268_;
							f_211_ += f_246_;
							f_215_ += f_269_;
							f_214_ += f_247_;
							f_221_ += f_270_;
							f_220_ += f_248_;
							f_232_ += f_271_;
							f_231_ += f_249_;
							f_235_ += f_272_;
							f_234_ += f_250_;
							f_238_ += f_273_;
							f_237_ += f_251_;
							f_241_ += f_274_;
							f_240_ += f_252_;
							f += (float) anInt1440;
						}
						while (--f_200_ >= 0.0F) {
							method1492(bool_198_, bool_199_, anIntArray1451, anIntArray1455, (int) f, (int) f_202_, (int) f_204_, f_205_, f_207_, f_208_, f_210_, f_211_, f_213_, f_214_, f_216_, f_220_, f_222_, f_231_, f_233_, f_234_, f_236_, f_237_, f_239_, f_240_, f_242_);
							f_202_ += f_243_;
							f_204_ += f_254_;
							f_205_ += f_244_;
							f_207_ += f_255_;
							f_208_ += f_245_;
							f_210_ += f_256_;
							f_211_ += f_246_;
							f_213_ += f_257_;
							f_214_ += f_247_;
							f_216_ += f_258_;
							f_220_ += f_248_;
							f_222_ += f_259_;
							f_231_ += f_249_;
							f_233_ += f_260_;
							f_234_ += f_250_;
							f_236_ += f_261_;
							f_237_ += f_251_;
							f_239_ += f_262_;
							f_240_ += f_252_;
							f_242_ += f_263_;
							f += (float) anInt1440;
						}
					}
				}
			}
		}
	}

	final void method1492(boolean bool, boolean bool_276_, int[] is, int[] is_277_, int i, int i_278_, int i_279_, float f, float f_280_, float f_281_, float f_282_, float f_283_, float f_284_, float f_285_, float f_286_, float f_287_, float f_288_, float f_289_, float f_290_, float f_291_, float f_292_, float f_293_, float f_294_, float f_295_, float f_296_) {
		int i_297_ = i_279_ - i_278_;
		float f_298_ = 1.0F / (float) i_297_;
		float f_299_ = (f_280_ - f) * f_298_;
		float f_300_ = (f_282_ - f_281_) * f_298_;
		float f_301_ = (f_284_ - f_283_) * f_298_;
		float f_302_ = (f_286_ - f_285_) * f_298_;
		float f_303_ = (f_288_ - f_287_) * f_298_;
		float f_304_ = (f_290_ - f_289_) * f_298_;
		float f_305_ = (f_292_ - f_291_) * f_298_;
		float f_306_ = (f_294_ - f_293_) * f_298_;
		float f_307_ = (f_296_ - f_295_) * f_298_;
		if (aBool1449) {
			if (i_279_ > anInt1441)
				i_279_ = anInt1441;
			if (i_278_ < 0) {
				f -= f_299_ * (float) i_278_;
				f_281_ -= f_300_ * (float) i_278_;
				f_283_ -= f_301_ * (float) i_278_;
				f_285_ -= f_302_ * (float) i_278_;
				f_287_ -= f_303_ * (float) i_278_;
				f_289_ -= f_304_ * (float) i_278_;
				f_291_ -= f_305_ * (float) i_278_;
				f_293_ -= f_306_ * (float) i_278_;
				f_295_ -= f_307_ * (float) i_278_;
				i_278_ = 0;
			}
		}
		if (i_278_ < i_279_) {
			i_297_ = i_279_ - i_278_;
			i += i_278_;
			while (i_297_-- > 0) {
				float f_308_ = 1.0F / f;
				float f_309_ = 1.0F / f_281_;
				if (!bool || f_308_ < aFloatArray1452[i]) {
					int i_310_ = (int) (f_283_ * f_309_ * (float) anInt1456);
					if (aBool1461)
						i_310_ &= anInt1457;
					else if (i_310_ < 0)
						i_310_ = 0;
					else if (i_310_ > anInt1457)
						i_310_ = anInt1457;
					int i_311_ = (int) (f_285_ * f_309_ * (float) anInt1456);
					if (aBool1461)
						i_311_ &= anInt1457;
					else if (i_311_ < 0)
						i_311_ = 0;
					else if (i_311_ > anInt1457)
						i_311_ = anInt1457;
					int i_312_ = anIntArray1455[i_311_ * anInt1456 + i_310_];
					int i_313_ = 255;
					if (aClass595_1447 == Class595.aClass595_7819)
						i_313_ = (int) ((float) (i_312_ >> 24 & 0xff) * f_289_ / 255.0F);
					else if (aClass595_1447 == Class595.aClass595_7818) {
						if ((i_312_ >> 24 & 0xff) > anInt1465)
							i_313_ = 255;
						else
							i_313_ = 0;
					} else
						i_313_ = (int) f_289_;
					if (i_313_ != 0) {
						if (i_313_ != 255) {
							int i_314_ = (~0xffffff | ((int) (f_291_ * (float) (i_312_ >> 16 & 0xff)) << 8 & 0xff0000) | (int) (f_293_ * (float) (i_312_ >> 8 & 0xff)) & 0xff00 | ((int) (f_295_ * (float) (i_312_ & 0xff)) >> 8));
							if (f_287_ != 0.0F) {
								int i_315_ = (int) (255.0F - f_287_);
								int i_316_ = ((((anInt1453 & 0xff00ff) * (int) f_287_ & ~0xff00ff) | ((anInt1453 & 0xff00) * (int) f_287_ & 0xff0000)) >>> 8);
								i_314_ = ((((i_314_ & 0xff00ff) * i_315_ & ~0xff00ff) | ((i_314_ & 0xff00) * i_315_ & 0xff0000)) >>> 8) + i_316_;
							}
							int i_317_ = is[i];
							int i_318_ = 255 - i_313_;
							i_314_ = ((((i_317_ & 0xff00ff) * i_318_ + (i_314_ & 0xff00ff) * i_313_) & ~0xff00ff) + (((i_317_ & 0xff00) * i_318_ + (i_314_ & 0xff00) * i_313_) & 0xff0000)) >> 8;
							if (bool_276_)
								is[i] = (i_313_ | is[i] >> 24) << 24 | i_314_;
							else
								is[i] = i_314_;
							if (bool)
								aFloatArray1452[i] = f_308_;
						} else {
							int i_319_ = (~0xffffff | ((int) (f_291_ * (float) (i_312_ >> 16 & 0xff)) << 8 & 0xff0000) | (int) (f_293_ * (float) (i_312_ >> 8 & 0xff)) & 0xff00 | ((int) (f_295_ * (float) (i_312_ & 0xff)) >> 8));
							if (f_287_ != 0.0F) {
								int i_320_ = (int) (255.0F - f_287_);
								int i_321_ = ((((anInt1453 & 0xff00ff) * (int) f_287_ & ~0xff00ff) | ((anInt1453 & 0xff00) * (int) f_287_ & 0xff0000)) >>> 8);
								i_319_ = ((((i_319_ & 0xff00ff) * i_320_ & ~0xff00ff) | ((i_319_ & 0xff00) * i_320_ & 0xff0000)) >>> 8) + i_321_;
							}
							if (bool_276_)
								is[i] = i_313_ << 24 | i_319_;
							else
								is[i] = i_319_;
							if (bool)
								aFloatArray1452[i] = f_308_;
						}
					}
				}
				i++;
				f += f_299_;
				f_281_ += f_300_;
				f_283_ += f_301_;
				f_285_ += f_302_;
				f_287_ += f_303_;
				f_289_ += f_304_;
				f_291_ += f_305_;
				f_293_ += f_306_;
				f_295_ += f_307_;
			}
		}
	}

	final void method1493(boolean bool, boolean bool_322_, boolean bool_323_, float f, float f_324_, float f_325_, float f_326_, float f_327_, float f_328_, float f_329_, float f_330_, float f_331_, float f_332_, float f_333_, float f_334_, float f_335_, float f_336_, float f_337_, float f_338_, float f_339_, float f_340_, int i, int i_341_, int i_342_, int i_343_, float f_344_, float f_345_, float f_346_, int i_347_, float f_348_, int i_349_, float f_350_, int i_351_, float f_352_) {
		if (!bool)
			method1507(false, bool_322_, bool_323_, f, f_324_, f_325_, f_326_, f_327_, f_328_, f_329_, f_330_, f_331_, 0);
		else {
			anInt1453 = i_343_;
			if (!(f <= f_324_) || !(f <= f_325_)) {
				if (f_324_ <= f_325_) {
					float f_353_ = f_326_;
					f_326_ = f_327_;
					f_327_ = f_353_;
					f_353_ = f;
					f = f_324_;
					f_324_ = f_353_;
					f_353_ = f_329_;
					f_329_ = f_330_;
					f_330_ = f_353_;
					f_353_ = f_335_;
					f_335_ = f_336_;
					f_336_ = f_353_;
					f_353_ = f_338_;
					f_338_ = f_339_;
					f_339_ = f_353_;
					f_353_ = f_332_;
					f_332_ = f_333_;
					f_333_ = f_353_;
					f_353_ = f_344_;
					f_344_ = f_345_;
					f_345_ = f_353_;
					f_353_ = f_348_;
					f_348_ = f_350_;
					f_350_ = f_353_;
					int i_354_ = i;
					i = i_341_;
					i_341_ = i_354_;
					i_354_ = i_347_;
					i_347_ = i_349_;
					i_349_ = i_354_;
				} else {
					float f_355_ = f_326_;
					f_326_ = f_328_;
					f_328_ = f_355_;
					f_355_ = f;
					f = f_325_;
					f_325_ = f_355_;
					f_355_ = f_329_;
					f_329_ = f_331_;
					f_331_ = f_355_;
					f_355_ = f_335_;
					f_335_ = f_337_;
					f_337_ = f_355_;
					f_355_ = f_338_;
					f_338_ = f_340_;
					f_340_ = f_355_;
					f_355_ = f_332_;
					f_332_ = f_334_;
					f_334_ = f_355_;
					f_355_ = f_344_;
					f_344_ = f_346_;
					f_346_ = f_355_;
					f_355_ = f_348_;
					f_348_ = f_352_;
					f_352_ = f_355_;
					int i_356_ = i;
					i = i_342_;
					i_342_ = i_356_;
					i_356_ = i_347_;
					i_347_ = i_351_;
					i_351_ = i_356_;
				}
			}
			int i_357_ = i_347_ & 0xffff;
			int i_358_ = i_349_ & 0xffff;
			int i_359_ = i_351_ & 0xffff;
			if (i_357_ != anInt1454) {
				anIntArray1455 = aClass167_Sub1_1433.method8444(i_357_);
				if (anIntArray1455 == null) {
					anInt1454 = -1;
					anInt1436 = 255 - (i >> 24 & 0xff);
					int i_360_ = (Class639.anIntArray8308[Class254.method3537(aClass167_Sub1_1433.method8448(i_347_), 1409175155) & 0xffff]);
					int i_361_ = (~0xffffff | ((i >> 16 & 0xff) * (i_360_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_360_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_360_ & 0xff) >> 8);
					method1504(true, bool_322_, bool_323_, f, f_324_, f_325_, f_326_, f_327_, f_328_, f_329_, f_330_, f_331_, Class302.method4097(i_361_, i_343_, f_344_, -1142640288), Class302.method4097(i_361_, i_343_, f_345_, -1773539956), Class302.method4097(i_361_, i_343_, f_346_, -1716172052));
					return;
				}
				anInt1454 = i_357_;
				anInt1456 = aClass167_Sub1_1433.method8446(i_347_);
				anInt1457 = anInt1456 - 1;
				aClass595_1447 = aClass167_Sub1_1433.method8465(i_347_);
			}
			aFloat1458 = f_348_;
			if (i_358_ != anInt1469) {
				anIntArray1463 = aClass167_Sub1_1433.method8444(i_358_);
				if (anIntArray1463 == null) {
					anInt1469 = -1;
					anInt1436 = 255 - (i >> 24 & 0xff);
					int i_362_ = (Class639.anIntArray8308[Class254.method3537(aClass167_Sub1_1433.method8448(i_349_), 1409175155) & 0xffff]);
					int i_363_ = (~0xffffff | ((i >> 16 & 0xff) * (i_362_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_362_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_362_ & 0xff) >> 8);
					method1504(true, bool_322_, bool_323_, f, f_324_, f_325_, f_326_, f_327_, f_328_, f_329_, f_330_, f_331_, Class302.method4097(i_363_, i_343_, f_344_, -840364423), Class302.method4097(i_363_, i_343_, f_345_, -2051263031), Class302.method4097(i_363_, i_343_, f_346_, -999460310));
					return;
				}
				anInt1469 = i_358_;
				anInt1464 = aClass167_Sub1_1433.method8446(i_349_);
				anInt1437 = anInt1464 - 1;
			}
			aFloat1466 = f_350_;
			if (i_359_ != anInt1467) {
				anIntArray1468 = aClass167_Sub1_1433.method8444(i_359_);
				if (anIntArray1468 == null) {
					anInt1467 = -1;
					anInt1436 = 255 - (i >> 24 & 0xff);
					int i_364_ = (Class639.anIntArray8308[Class254.method3537(aClass167_Sub1_1433.method8448(i_351_), 1409175155) & 0xffff]);
					int i_365_ = (~0xffffff | ((i >> 16 & 0xff) * (i_364_ >> 16 & 0xff) << 8 & 0xff0000) | (i >> 8 & 0xff) * (i_364_ >> 8 & 0xff) & 0xff00 | (i & 0xff) * (i_364_ & 0xff) >> 8);
					method1504(true, bool_322_, bool_323_, (float) (int) f, (float) (int) f_324_, (float) (int) f_325_, (float) (int) f_326_, (float) (int) f_327_, (float) (int) f_328_, (float) (int) f_329_, (float) (int) f_330_, (float) (int) f_331_, Class302.method4097(i_365_, i_343_, f_344_, -924498830), Class302.method4097(i_365_, i_343_, f_345_, -1813152191), Class302.method4097(i_365_, i_343_, f_346_, -1157509218));
					return;
				}
				anInt1467 = i_359_;
				anInt1450 = aClass167_Sub1_1433.method8446(i_351_);
				anInt1470 = anInt1450 - 1;
			}
			aFloat1443 = f_352_;
			f_335_ /= f_332_;
			f_336_ /= f_333_;
			f_337_ /= f_334_;
			f_338_ /= f_332_;
			f_339_ /= f_333_;
			f_340_ /= f_334_;
			f_329_ = 1.0F / f_329_;
			f_330_ = 1.0F / f_330_;
			f_331_ = 1.0F / f_331_;
			f_332_ = 1.0F / f_332_;
			f_333_ = 1.0F / f_333_;
			f_334_ = 1.0F / f_334_;
			float f_366_ = (float) (i >> 24 & 0xff);
			float f_367_ = (float) (i_341_ >> 24 & 0xff);
			float f_368_ = (float) (i_342_ >> 24 & 0xff);
			float f_369_ = (float) (i >> 16 & 0xff);
			float f_370_ = (float) (i_341_ >> 16 & 0xff);
			float f_371_ = (float) (i_342_ >> 16 & 0xff);
			float f_372_ = (float) (i >> 8 & 0xff);
			float f_373_ = (float) (i_341_ >> 8 & 0xff);
			float f_374_ = (float) (i_342_ >> 8 & 0xff);
			float f_375_ = (float) (i & 0xff);
			float f_376_ = (float) (i_341_ & 0xff);
			float f_377_ = (float) (i_342_ & 0xff);
			float f_378_ = 1.0F;
			float f_379_ = 0.0F;
			float f_380_ = 0.0F;
			float f_381_ = 0.0F;
			float f_382_ = 1.0F;
			float f_383_ = 0.0F;
			float f_384_ = 0.0F;
			float f_385_ = 0.0F;
			float f_386_ = 0.0F;
			float f_387_ = 0.0F;
			float f_388_ = 0.0F;
			float f_389_ = 0.0F;
			float f_390_ = 0.0F;
			float f_391_ = 0.0F;
			float f_392_ = 0.0F;
			float f_393_ = 0.0F;
			float f_394_ = 0.0F;
			float f_395_ = 0.0F;
			if (f_324_ != f) {
				float f_396_ = f_324_ - f;
				f_384_ = (f_327_ - f_326_) / f_396_;
				f_385_ = (f_330_ - f_329_) / f_396_;
				f_386_ = (f_333_ - f_332_) / f_396_;
				f_387_ = (f_336_ - f_335_) / f_396_;
				f_388_ = (f_339_ - f_338_) / f_396_;
				f_389_ = (f_345_ - f_344_) / f_396_;
				f_390_ = (f_367_ - f_366_) / f_396_;
				f_391_ = (f_370_ - f_369_) / f_396_;
				f_392_ = (f_373_ - f_372_) / f_396_;
				f_393_ = (f_376_ - f_375_) / f_396_;
				f_394_ = (f_379_ - f_378_) / f_396_;
				f_395_ = (f_382_ - f_381_) / f_396_;
			}
			float f_397_ = 0.0F;
			float f_398_ = 0.0F;
			float f_399_ = 0.0F;
			float f_400_ = 0.0F;
			float f_401_ = 0.0F;
			float f_402_ = 0.0F;
			float f_403_ = 0.0F;
			float f_404_ = 0.0F;
			float f_405_ = 0.0F;
			float f_406_ = 0.0F;
			float f_407_ = 0.0F;
			float f_408_ = 0.0F;
			if (f_325_ != f_324_) {
				float f_409_ = f_325_ - f_324_;
				f_397_ = (f_328_ - f_327_) / f_409_;
				f_398_ = (f_331_ - f_330_) / f_409_;
				f_399_ = (f_334_ - f_333_) / f_409_;
				f_400_ = (f_337_ - f_336_) / f_409_;
				f_401_ = (f_340_ - f_339_) / f_409_;
				f_402_ = (f_346_ - f_345_) / f_409_;
				f_403_ = (f_368_ - f_367_) / f_409_;
				f_404_ = (f_371_ - f_370_) / f_409_;
				f_405_ = (f_374_ - f_373_) / f_409_;
				f_406_ = (f_377_ - f_376_) / f_409_;
				f_407_ = (f_380_ - f_379_) / f_409_;
				f_408_ = (f_383_ - f_382_) / f_409_;
			}
			float f_410_ = 0.0F;
			float f_411_ = 0.0F;
			float f_412_ = 0.0F;
			float f_413_ = 0.0F;
			float f_414_ = 0.0F;
			float f_415_ = 0.0F;
			float f_416_ = 0.0F;
			float f_417_ = 0.0F;
			float f_418_ = 0.0F;
			float f_419_ = 0.0F;
			float f_420_ = 0.0F;
			float f_421_ = 0.0F;
			if (f != f_325_) {
				float f_422_ = f - f_325_;
				f_410_ = (f_326_ - f_328_) / f_422_;
				f_411_ = (f_329_ - f_331_) / f_422_;
				f_412_ = (f_332_ - f_334_) / f_422_;
				f_413_ = (f_335_ - f_337_) / f_422_;
				f_414_ = (f_338_ - f_340_) / f_422_;
				f_415_ = (f_344_ - f_346_) / f_422_;
				f_416_ = (f_366_ - f_368_) / f_422_;
				f_417_ = (f_369_ - f_371_) / f_422_;
				f_418_ = (f_372_ - f_374_) / f_422_;
				f_419_ = (f_375_ - f_377_) / f_422_;
				f_420_ = (f_378_ - f_380_) / f_422_;
				f_421_ = (f_381_ - f_383_) / f_422_;
			}
			if (!(f >= (float) anInt1460)) {
				if (f_324_ > (float) anInt1460)
					f_324_ = (float) anInt1460;
				if (f_325_ > (float) anInt1460)
					f_325_ = (float) anInt1460;
				if (f_324_ < f_325_) {
					f_328_ = f_326_;
					f_331_ = f_329_;
					f_334_ = f_332_;
					f_337_ = f_335_;
					f_340_ = f_338_;
					f_346_ = f_344_;
					f_368_ = f_366_;
					f_371_ = f_369_;
					f_374_ = f_372_;
					f_377_ = f_375_;
					f_380_ = f_378_;
					f_383_ = f_381_;
					if (f < 0.0F) {
						f_326_ -= f_384_ * f;
						f_328_ -= f_410_ * f;
						f_329_ -= f_385_ * f;
						f_331_ -= f_411_ * f;
						f_332_ -= f_386_ * f;
						f_334_ -= f_412_ * f;
						f_335_ -= f_387_ * f;
						f_337_ -= f_413_ * f;
						f_338_ -= f_388_ * f;
						f_340_ -= f_414_ * f;
						f_344_ -= f_389_ * f;
						f_346_ -= f_415_ * f;
						f_366_ -= f_390_ * f;
						f_368_ -= f_416_ * f;
						f_369_ -= f_391_ * f;
						f_371_ -= f_417_ * f;
						f_372_ -= f_392_ * f;
						f_374_ -= f_418_ * f;
						f_375_ -= f_393_ * f;
						f_377_ -= f_419_ * f;
						f_378_ -= f_394_ * f;
						f_380_ -= f_420_ * f;
						f_381_ -= f_395_ * f;
						f_383_ -= f_421_ * f;
						f = 0.0F;
					}
					if (f_324_ < 0.0F) {
						f_327_ -= f_397_ * f_324_;
						f_330_ -= f_398_ * f_324_;
						f_333_ -= f_399_ * f_324_;
						f_336_ -= f_400_ * f_324_;
						f_339_ -= f_401_ * f_324_;
						f_345_ -= f_402_ * f_324_;
						f_367_ -= f_403_ * f_324_;
						f_370_ -= f_404_ * f_324_;
						f_373_ -= f_405_ * f_324_;
						f_376_ -= f_406_ * f_324_;
						f_379_ -= f_407_ * f_324_;
						f_382_ -= f_408_ * f_324_;
						f_324_ = 0.0F;
					}
					if (f != f_324_ && f_410_ < f_384_ || f == f_324_ && f_410_ > f_397_) {
						f += 0.5F;
						f_324_ += 0.5F;
						f_325_ = (float) (int) (f_325_ + 0.5F) - f_324_;
						f_324_ -= f;
						f = (float) anIntArray1446[(int) f];
						while (--f_324_ >= 0.0F) {
							method1494(bool_322_, bool_323_, anIntArray1451, (int) f, (int) f_328_, (int) f_326_, f_331_, f_329_, f_334_, f_332_, f_337_, f_335_, f_340_, f_338_, f_346_, f_344_, f_368_, f_366_, f_371_, f_369_, f_374_, f_372_, f_377_, f_375_, f_380_, f_378_, f_383_, f_381_);
							f_326_ += f_384_;
							f_328_ += f_410_;
							f_329_ += f_385_;
							f_331_ += f_411_;
							f_332_ += f_386_;
							f_334_ += f_412_;
							f_335_ += f_387_;
							f_337_ += f_413_;
							f_338_ += f_388_;
							f_340_ += f_414_;
							f_344_ += f_389_;
							f_346_ += f_415_;
							f_366_ += f_390_;
							f_368_ += f_416_;
							f_369_ += f_391_;
							f_371_ += f_417_;
							f_372_ += f_392_;
							f_374_ += f_418_;
							f_375_ += f_393_;
							f_377_ += f_419_;
							f_378_ += f_394_;
							f_380_ += f_420_;
							f_381_ += f_395_;
							f_383_ += f_421_;
							f += (float) anInt1440;
						}
						while (--f_325_ >= 0.0F) {
							method1494(bool_322_, bool_323_, anIntArray1451, (int) f, (int) f_328_, (int) f_327_, f_331_, f_330_, f_334_, f_333_, f_337_, f_336_, f_340_, f_339_, f_346_, f_345_, f_368_, f_367_, f_371_, f_370_, f_374_, f_373_, f_377_, f_376_, f_380_, f_379_, f_383_, f_382_);
							f_327_ += f_397_;
							f_328_ += f_410_;
							f_330_ += f_398_;
							f_331_ += f_411_;
							f_333_ += f_399_;
							f_334_ += f_412_;
							f_336_ += f_400_;
							f_337_ += f_413_;
							f_339_ += f_401_;
							f_340_ += f_414_;
							f_345_ += f_402_;
							f_346_ += f_415_;
							f_367_ += f_403_;
							f_368_ += f_416_;
							f_370_ += f_404_;
							f_371_ += f_417_;
							f_373_ += f_405_;
							f_374_ += f_418_;
							f_376_ += f_406_;
							f_377_ += f_419_;
							f_379_ += f_407_;
							f_380_ += f_420_;
							f_382_ += f_408_;
							f_383_ += f_421_;
							f += (float) anInt1440;
						}
					} else {
						f += 0.5F;
						f_324_ += 0.5F;
						f_325_ = (float) (int) (f_325_ + 0.5F) - f_324_;
						f_324_ -= f;
						f = (float) anIntArray1446[(int) f];
						while (--f_324_ >= 0.0F) {
							method1494(bool_322_, bool_323_, anIntArray1451, (int) f, (int) f_326_, (int) f_328_, f_329_, f_331_, f_332_, f_334_, f_335_, f_337_, f_338_, f_340_, f_344_, f_346_, f_366_, f_368_, f_369_, f_371_, f_372_, f_374_, f_375_, f_377_, f_378_, f_380_, f_381_, f_383_);
							f_326_ += f_384_;
							f_328_ += f_410_;
							f_329_ += f_385_;
							f_331_ += f_411_;
							f_332_ += f_386_;
							f_334_ += f_412_;
							f_335_ += f_387_;
							f_337_ += f_413_;
							f_338_ += f_388_;
							f_340_ += f_414_;
							f_344_ += f_389_;
							f_346_ += f_415_;
							f_366_ += f_390_;
							f_368_ += f_416_;
							f_369_ += f_391_;
							f_371_ += f_417_;
							f_372_ += f_392_;
							f_374_ += f_418_;
							f_375_ += f_393_;
							f_377_ += f_419_;
							f_378_ += f_394_;
							f_380_ += f_420_;
							f_381_ += f_395_;
							f_383_ += f_421_;
							f += (float) anInt1440;
						}
						while (--f_325_ >= 0.0F) {
							method1494(bool_322_, bool_323_, anIntArray1451, (int) f, (int) f_327_, (int) f_328_, f_330_, f_331_, f_333_, f_334_, f_336_, f_337_, f_339_, f_340_, f_345_, f_346_, f_367_, f_368_, f_370_, f_371_, f_373_, f_374_, f_376_, f_377_, f_379_, f_380_, f_382_, f_383_);
							f_327_ += f_397_;
							f_328_ += f_410_;
							f_330_ += f_398_;
							f_331_ += f_411_;
							f_333_ += f_399_;
							f_334_ += f_412_;
							f_336_ += f_400_;
							f_337_ += f_413_;
							f_339_ += f_401_;
							f_340_ += f_414_;
							f_345_ += f_402_;
							f_346_ += f_415_;
							f_367_ += f_403_;
							f_368_ += f_416_;
							f_370_ += f_404_;
							f_371_ += f_417_;
							f_373_ += f_405_;
							f_374_ += f_418_;
							f_376_ += f_406_;
							f_377_ += f_419_;
							f_379_ += f_407_;
							f_380_ += f_420_;
							f_382_ += f_408_;
							f_383_ += f_421_;
							f += (float) anInt1440;
						}
					}
				} else {
					f_327_ = f_326_;
					f_330_ = f_329_;
					f_333_ = f_332_;
					f_336_ = f_335_;
					f_339_ = f_338_;
					f_345_ = f_344_;
					f_367_ = f_366_;
					f_370_ = f_369_;
					f_373_ = f_372_;
					f_376_ = f_375_;
					f_379_ = f_378_;
					f_382_ = f_381_;
					if (f < 0.0F) {
						f_326_ -= f_384_ * f;
						f_327_ -= f_410_ * f;
						f_329_ -= f_385_ * f;
						f_330_ -= f_411_ * f;
						f_332_ -= f_386_ * f;
						f_333_ -= f_412_ * f;
						f_335_ -= f_387_ * f;
						f_336_ -= f_413_ * f;
						f_338_ -= f_388_ * f;
						f_339_ -= f_414_ * f;
						f_344_ -= f_389_ * f;
						f_345_ -= f_415_ * f;
						f_366_ -= f_390_ * f;
						f_367_ -= f_416_ * f;
						f_369_ -= f_391_ * f;
						f_370_ -= f_417_ * f;
						f_372_ -= f_392_ * f;
						f_373_ -= f_418_ * f;
						f_375_ -= f_393_ * f;
						f_376_ -= f_419_ * f;
						f_378_ -= f_394_ * f;
						f_379_ -= f_420_ * f;
						f_381_ -= f_395_ * f;
						f_382_ -= f_421_ * f;
						f = 0.0F;
					}
					if (f_325_ < 0.0F) {
						f_328_ -= f_397_ * f_325_;
						f_331_ -= f_398_ * f_325_;
						f_334_ -= f_399_ * f_325_;
						f_337_ -= f_400_ * f_325_;
						f_340_ -= f_401_ * f_325_;
						f_346_ -= f_402_ * f_325_;
						f_368_ -= f_403_ * f_325_;
						f_371_ -= f_404_ * f_325_;
						f_374_ -= f_405_ * f_325_;
						f_377_ -= f_406_ * f_325_;
						f_380_ -= f_407_ * f_325_;
						f_383_ -= f_408_ * f_325_;
						f_325_ = 0.0F;
					}
					if (f != f_325_ && f_410_ < f_384_ || f == f_325_ && f_397_ > f_384_) {
						f += 0.5F;
						f_325_ += 0.5F;
						f_324_ = (float) (int) (f_324_ + 0.5F) - f_325_;
						f_325_ -= f;
						f = (float) anIntArray1446[(int) f];
						while (--f_325_ >= 0.0F) {
							method1494(bool_322_, bool_323_, anIntArray1451, (int) f, (int) f_327_, (int) f_326_, f_330_, f_329_, f_333_, f_332_, f_336_, f_335_, f_339_, f_338_, f_345_, f_344_, f_367_, f_366_, f_370_, f_369_, f_373_, f_372_, f_376_, f_375_, f_379_, f_378_, f_382_, f_381_);
							f_326_ += f_384_;
							f_327_ += f_410_;
							f_329_ += f_385_;
							f_330_ += f_411_;
							f_332_ += f_386_;
							f_333_ += f_412_;
							f_335_ += f_387_;
							f_336_ += f_413_;
							f_338_ += f_388_;
							f_339_ += f_414_;
							f_344_ += f_389_;
							f_345_ += f_415_;
							f_366_ += f_390_;
							f_367_ += f_416_;
							f_369_ += f_391_;
							f_370_ += f_417_;
							f_372_ += f_392_;
							f_373_ += f_418_;
							f_375_ += f_393_;
							f_376_ += f_419_;
							f_378_ += f_394_;
							f_379_ += f_420_;
							f_381_ += f_395_;
							f_382_ += f_421_;
							f += (float) anInt1440;
						}
						while (--f_324_ >= 0.0F) {
							method1494(bool_322_, bool_323_, anIntArray1451, (int) f, (int) f_328_, (int) f_326_, f_331_, f_329_, f_334_, f_332_, f_337_, f_335_, f_340_, f_338_, f_346_, f_344_, f_368_, f_366_, f_371_, f_369_, f_374_, f_372_, f_377_, f_375_, f_380_, f_378_, f_383_, f_381_);
							f_328_ += f_397_;
							f_326_ += f_384_;
							f_331_ += f_398_;
							f_329_ += f_385_;
							f_334_ += f_399_;
							f_332_ += f_386_;
							f_337_ += f_400_;
							f_335_ += f_387_;
							f_340_ += f_401_;
							f_338_ += f_388_;
							f_346_ += f_402_;
							f_344_ += f_389_;
							f_368_ += f_403_;
							f_366_ += f_390_;
							f_371_ += f_404_;
							f_369_ += f_391_;
							f_374_ += f_405_;
							f_372_ += f_392_;
							f_377_ += f_406_;
							f_375_ += f_393_;
							f_380_ += f_407_;
							f_378_ += f_394_;
							f_383_ += f_408_;
							f_381_ += f_395_;
							f += (float) anInt1440;
						}
					} else {
						f += 0.5F;
						f_325_ += 0.5F;
						f_324_ = (float) (int) (f_324_ + 0.5F) - f_325_;
						f_325_ -= f;
						f = (float) anIntArray1446[(int) f];
						while (--f_325_ >= 0.0F) {
							method1494(bool_322_, bool_323_, anIntArray1451, (int) f, (int) f_326_, (int) f_327_, f_329_, f_330_, f_332_, f_333_, f_335_, f_336_, f_338_, f_339_, f_344_, f_345_, f_366_, f_367_, f_369_, f_370_, f_372_, f_373_, f_375_, f_376_, f_378_, f_379_, f_381_, f_382_);
							f_327_ += f_410_;
							f_326_ += f_384_;
							f_330_ += f_411_;
							f_329_ += f_385_;
							f_333_ += f_412_;
							f_332_ += f_386_;
							f_336_ += f_413_;
							f_335_ += f_387_;
							f_339_ += f_414_;
							f_338_ += f_388_;
							f_345_ += f_415_;
							f_344_ += f_389_;
							f_367_ += f_416_;
							f_366_ += f_390_;
							f_370_ += f_417_;
							f_369_ += f_391_;
							f_373_ += f_418_;
							f_372_ += f_392_;
							f_376_ += f_419_;
							f_375_ += f_393_;
							f_379_ += f_420_;
							f_378_ += f_394_;
							f_382_ += f_421_;
							f_381_ += f_395_;
							f += (float) anInt1440;
						}
						while (--f_324_ >= 0.0F) {
							method1494(bool_322_, bool_323_, anIntArray1451, (int) f, (int) f_326_, (int) f_328_, f_329_, f_331_, f_332_, f_334_, f_335_, f_337_, f_338_, f_340_, f_344_, f_346_, f_366_, f_368_, f_369_, f_371_, f_372_, f_374_, f_375_, f_377_, f_378_, f_380_, f_381_, f_383_);
							f_326_ += f_384_;
							f_328_ += f_397_;
							f_329_ += f_385_;
							f_331_ += f_398_;
							f_332_ += f_386_;
							f_334_ += f_399_;
							f_335_ += f_387_;
							f_337_ += f_400_;
							f_338_ += f_388_;
							f_340_ += f_401_;
							f_344_ += f_389_;
							f_346_ += f_402_;
							f_366_ += f_390_;
							f_368_ += f_403_;
							f_369_ += f_391_;
							f_371_ += f_404_;
							f_372_ += f_392_;
							f_374_ += f_405_;
							f_375_ += f_393_;
							f_377_ += f_406_;
							f_378_ += f_394_;
							f_380_ += f_407_;
							f_381_ += f_395_;
							f_383_ += f_408_;
							f += (float) anInt1440;
						}
					}
				}
			}
		}
	}

	final void method1494(boolean bool, boolean bool_423_, int[] is, int i, int i_424_, int i_425_, float f, float f_426_, float f_427_, float f_428_, float f_429_, float f_430_, float f_431_, float f_432_, float f_433_, float f_434_, float f_435_, float f_436_, float f_437_, float f_438_, float f_439_, float f_440_, float f_441_, float f_442_, float f_443_, float f_444_, float f_445_, float f_446_) {
		int i_447_ = i_425_ - i_424_;
		float f_448_ = 1.0F / (float) i_447_;
		float f_449_ = (f_426_ - f) * f_448_;
		float f_450_ = (f_428_ - f_427_) * f_448_;
		float f_451_ = (f_430_ - f_429_) * f_448_;
		float f_452_ = (f_432_ - f_431_) * f_448_;
		float f_453_ = (f_434_ - f_433_) * f_448_;
		float f_454_ = (f_436_ - f_435_) * f_448_;
		float f_455_ = (f_438_ - f_437_) * f_448_;
		float f_456_ = (f_440_ - f_439_) * f_448_;
		float f_457_ = (f_442_ - f_441_) * f_448_;
		float f_458_ = (f_444_ - f_443_) * f_448_;
		float f_459_ = (f_446_ - f_445_) * f_448_;
		if (aBool1449) {
			if (i_425_ > anInt1441)
				i_425_ = anInt1441;
			if (i_424_ < 0) {
				f -= f_449_ * (float) i_424_;
				f_427_ -= f_450_ * (float) i_424_;
				f_429_ -= f_451_ * (float) i_424_;
				f_431_ -= f_452_ * (float) i_424_;
				f_433_ -= f_453_ * (float) i_424_;
				f_435_ -= f_454_ * (float) i_424_;
				f_437_ -= f_455_ * (float) i_424_;
				f_439_ -= f_456_ * (float) i_424_;
				f_441_ -= f_457_ * (float) i_424_;
				f_443_ -= f_458_ * (float) i_424_;
				f_445_ -= f_459_ * (float) i_424_;
				i_424_ = 0;
			}
		}
		if (i_424_ < i_425_) {
			i_447_ = i_425_ - i_424_;
			i += i_424_;
			while (i_447_-- > 0) {
				float f_460_ = 1.0F / f;
				float f_461_ = 1.0F / f_427_;
				if (!bool || f_460_ < aFloatArray1452[i]) {
					float f_462_ = f_429_ * f_461_;
					float f_463_ = f_431_ * f_461_;
					int i_464_ = ((int) (f_462_ * (float) anInt1456 * aFloat1458) & anInt1457);
					int i_465_ = ((int) (f_463_ * (float) anInt1456 * aFloat1458) & anInt1457);
					int i_466_ = anIntArray1455[i_465_ * anInt1456 + i_464_];
					i_464_ = ((int) (f_462_ * (float) anInt1464 * aFloat1466) & anInt1437);
					i_465_ = ((int) (f_463_ * (float) anInt1464 * aFloat1466) & anInt1437);
					int i_467_ = anIntArray1463[i_465_ * anInt1464 + i_464_];
					i_464_ = ((int) (f_462_ * (float) anInt1450 * aFloat1443) & anInt1470);
					i_465_ = ((int) (f_463_ * (float) anInt1450 * aFloat1443) & anInt1470);
					int i_468_ = anIntArray1468[i_465_ * anInt1450 + i_464_];
					float f_469_ = 1.0F - (f_443_ + f_445_);
					i_466_ = (~0xffffff | ((int) (f_443_ * (float) (i_466_ >> 16 & 0xff)) << 16) | (int) (f_443_ * (float) (i_466_ >> 8 & 0xff)) << 8 | (int) (f_443_ * (float) (i_466_ & 0xff)));
					i_467_ = (~0xffffff | ((int) (f_445_ * (float) (i_467_ >> 16 & 0xff)) << 16) | (int) (f_445_ * (float) (i_467_ >> 8 & 0xff)) << 8 | (int) (f_445_ * (float) (i_467_ & 0xff)));
					i_468_ = (~0xffffff | ((int) (f_469_ * (float) (i_468_ >> 16 & 0xff)) << 16) | (int) (f_469_ * (float) (i_468_ >> 8 & 0xff)) << 8 | (int) (f_469_ * (float) (i_468_ & 0xff)));
					int i_470_ = i_466_ + i_467_ + i_468_;
					int i_471_ = (~0xffffff | ((int) (f_437_ * (float) (i_470_ >> 16 & 0xff)) << 8) & 0xff0000 | ((int) (f_439_ * (float) (i_470_ >> 8 & 0xff)) & 0xff00) | (int) (f_441_ * (float) (i_470_ & 0xff)) >> 8);
					if (f_433_ != 0.0F) {
						int i_472_ = (int) (255.0F - f_433_);
						int i_473_ = ((((anInt1453 & 0xff00ff) * (int) f_433_ & ~0xff00ff) | ((anInt1453 & 0xff00) * (int) f_433_ & 0xff0000)) >>> 8);
						i_471_ = (((i_471_ & 0xff00ff) * i_472_ & ~0xff00ff | (i_471_ & 0xff00) * i_472_ & 0xff0000) >>> 8) + i_473_;
					}
					if (bool_423_)
						is[i] = ((int) f_435_ | is[i] >> 24) << 24 | i_471_;
					else
						is[i] = i_471_;
					if (bool)
						aFloatArray1452[i] = f_460_;
				}
				i++;
				f += f_449_;
				f_427_ += f_450_;
				f_429_ += f_451_;
				f_431_ += f_452_;
				f_433_ += f_453_;
				f_435_ += f_454_;
				f_437_ += f_455_;
				f_439_ += f_456_;
				f_441_ += f_457_;
				f_443_ += f_458_;
				f_445_ += f_459_;
			}
		}
	}

	int method1495() {
		return anIntArray1446[0] % anInt1440;
	}

	int method1496() {
		return anIntArray1446[0] % anInt1440;
	}

	int method1497() {
		return anIntArray1446[0] % anInt1440;
	}

	int method1498() {
		return anIntArray1446[0] / anInt1440;
	}

	int method1499() {
		return anIntArray1446[0] / anInt1440;
	}

	int method1500() {
		return anIntArray1446[0] / anInt1440;
	}

	final void method1501(boolean bool) {
		aBool1471 = bool;
	}

	final void method1502(boolean bool) {
		aBool1471 = bool;
	}

	int method1503() {
		return anIntArray1446[0] / anInt1440;
	}

	final void method1504(boolean bool, boolean bool_474_, boolean bool_475_, float f, float f_476_, float f_477_, float f_478_, float f_479_, float f_480_, float f_481_, float f_482_, float f_483_, int i, int i_484_, int i_485_) {
		if (!bool)
			method1507(false, bool_474_, bool_475_, f, f_476_, f_477_, f_478_, f_479_, f_480_, f_481_, f_482_, f_483_, 0);
		else if (aBool1471) {
			aClass167_Sub1_1433.method2060((int) f_478_, (int) f, (int) f_479_, (int) f_476_, ~0xffffff | i, -803382054);
			aClass167_Sub1_1433.method2060((int) f_479_, (int) f_476_, (int) f_480_, (int) f_477_, ~0xffffff | i, -552328597);
			aClass167_Sub1_1433.method2060((int) f_480_, (int) f_477_, (int) f_478_, (int) f, ~0xffffff | i, -219967307);
		} else {
			float f_486_ = f_479_ - f_478_;
			float f_487_ = f_476_ - f;
			float f_488_ = f_480_ - f_478_;
			float f_489_ = f_477_ - f;
			float f_490_ = f_482_ - f_481_;
			float f_491_ = f_483_ - f_481_;
			float f_492_ = (float) ((i_484_ & 0xff0000) - (i & 0xff0000));
			float f_493_ = (float) ((i_485_ & 0xff0000) - (i & 0xff0000));
			float f_494_ = (float) ((i_484_ & 0xff00) - (i & 0xff00));
			float f_495_ = (float) ((i_485_ & 0xff00) - (i & 0xff00));
			float f_496_ = (float) ((i_484_ & 0xff) - (i & 0xff));
			float f_497_ = (float) ((i_485_ & 0xff) - (i & 0xff));
			float f_498_;
			if (f_477_ != f_476_)
				f_498_ = (f_480_ - f_479_) / (f_477_ - f_476_);
			else
				f_498_ = 0.0F;
			float f_499_;
			if (f_476_ != f)
				f_499_ = f_486_ / f_487_;
			else
				f_499_ = 0.0F;
			float f_500_;
			if (f_477_ != f)
				f_500_ = f_488_ / f_489_;
			else
				f_500_ = 0.0F;
			float f_501_ = f_486_ * f_489_ - f_488_ * f_487_;
			if (f_501_ != 0.0F) {
				float f_502_ = (f_490_ * f_489_ - f_491_ * f_487_) / f_501_;
				float f_503_ = (f_491_ * f_486_ - f_490_ * f_488_) / f_501_;
				float f_504_ = (f_492_ * f_489_ - f_493_ * f_487_) / f_501_;
				float f_505_ = (f_493_ * f_486_ - f_492_ * f_488_) / f_501_;
				float f_506_ = (f_494_ * f_489_ - f_495_ * f_487_) / f_501_;
				float f_507_ = (f_495_ * f_486_ - f_494_ * f_488_) / f_501_;
				float f_508_ = (f_496_ * f_489_ - f_497_ * f_487_) / f_501_;
				float f_509_ = (f_497_ * f_486_ - f_496_ * f_488_) / f_501_;
				if (f <= f_476_ && f <= f_477_) {
					if (!(f >= (float) anInt1460)) {
						if (f_476_ > (float) anInt1460)
							f_476_ = (float) anInt1460;
						if (f_477_ > (float) anInt1460)
							f_477_ = (float) anInt1460;
						f_481_ = f_481_ - f_502_ * f_478_ + f_502_;
						float f_510_ = ((float) (i & 0xff0000) - f_504_ * f_478_ + f_504_);
						float f_511_ = (float) (i & 0xff00) - f_506_ * f_478_ + f_506_;
						float f_512_ = (float) (i & 0xff) - f_508_ * f_478_ + f_508_;
						if (f_476_ < f_477_) {
							f_480_ = f_478_;
							if (f < 0.0F) {
								f_480_ -= f_500_ * f;
								f_478_ -= f_499_ * f;
								f_481_ -= f_503_ * f;
								f_510_ -= f_505_ * f;
								f_511_ -= f_507_ * f;
								f_512_ -= f_509_ * f;
								f = 0.0F;
							}
							if (f_476_ < 0.0F) {
								f_479_ -= f_498_ * f_476_;
								f_476_ = 0.0F;
							}
							if (f != f_476_ && f_500_ < f_499_ || f == f_476_ && f_500_ > f_498_) {
								f += 0.5F;
								f_476_ += 0.5F;
								f_477_ = (float) (int) (f_477_ + 0.5F) - f_476_;
								f_476_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_476_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f, 0, 0, (int) f_480_, (int) f_478_, f_481_, f_502_, f_510_, f_504_, f_511_, f_506_, f_512_, f_508_);
									f_480_ += f_500_;
									f_478_ += f_499_;
									f_481_ += f_503_;
									f_510_ += f_505_;
									f_511_ += f_507_;
									f_512_ += f_509_;
									f += (float) anInt1440;
								}
								while (--f_477_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f, 0, 0, (int) f_480_, (int) f_479_, f_481_, f_502_, f_510_, f_504_, f_511_, f_506_, f_512_, f_508_);
									f_480_ += f_500_;
									f_479_ += f_498_;
									f_481_ += f_503_;
									f_510_ += f_505_;
									f_511_ += f_507_;
									f_512_ += f_509_;
									f += (float) anInt1440;
								}
							} else {
								f += 0.5F;
								f_476_ += 0.5F;
								f_477_ = (float) (int) (f_477_ + 0.5F) - f_476_;
								f_476_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_476_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f, 0, 0, (int) f_478_, (int) f_480_, f_481_, f_502_, f_510_, f_504_, f_511_, f_506_, f_512_, f_508_);
									f_480_ += f_500_;
									f_478_ += f_499_;
									f_481_ += f_503_;
									f_510_ += f_505_;
									f_511_ += f_507_;
									f_512_ += f_509_;
									f += (float) anInt1440;
								}
								while (--f_477_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f, 0, 0, (int) f_479_, (int) f_480_, f_481_, f_502_, f_510_, f_504_, f_511_, f_506_, f_512_, f_508_);
									f_480_ += f_500_;
									f_479_ += f_498_;
									f_481_ += f_503_;
									f_510_ += f_505_;
									f_511_ += f_507_;
									f_512_ += f_509_;
									f += (float) anInt1440;
								}
							}
						} else {
							f_479_ = f_478_;
							if (f < 0.0F) {
								f_479_ -= f_500_ * f;
								f_478_ -= f_499_ * f;
								f_481_ -= f_503_ * f;
								f_510_ -= f_505_ * f;
								f_511_ -= f_507_ * f;
								f_512_ -= f_509_ * f;
								f = 0.0F;
							}
							if (f_477_ < 0.0F) {
								f_480_ -= f_498_ * f_477_;
								f_477_ = 0.0F;
							}
							if (f != f_477_ && f_500_ < f_499_ || f == f_477_ && f_498_ > f_499_) {
								f += 0.5F;
								f_477_ += 0.5F;
								f_476_ = (float) (int) (f_476_ + 0.5F) - f_477_;
								f_477_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_477_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f, 0, 0, (int) f_479_, (int) f_478_, f_481_, f_502_, f_510_, f_504_, f_511_, f_506_, f_512_, f_508_);
									f_479_ += f_500_;
									f_478_ += f_499_;
									f_481_ += f_503_;
									f_510_ += f_505_;
									f_511_ += f_507_;
									f_512_ += f_509_;
									f += (float) anInt1440;
								}
								while (--f_476_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f, 0, 0, (int) f_480_, (int) f_478_, f_481_, f_502_, f_510_, f_504_, f_511_, f_506_, f_512_, f_508_);
									f_480_ += f_498_;
									f_478_ += f_499_;
									f_481_ += f_503_;
									f_510_ += f_505_;
									f_511_ += f_507_;
									f_512_ += f_509_;
									f += (float) anInt1440;
								}
							} else {
								f += 0.5F;
								f_477_ += 0.5F;
								f_476_ = (float) (int) (f_476_ + 0.5F) - f_477_;
								f_477_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_477_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f, 0, 0, (int) f_478_, (int) f_479_, f_481_, f_502_, f_510_, f_504_, f_511_, f_506_, f_512_, f_508_);
									f_479_ += f_500_;
									f_478_ += f_499_;
									f_481_ += f_503_;
									f_510_ += f_505_;
									f_511_ += f_507_;
									f_512_ += f_509_;
									f += (float) anInt1440;
								}
								while (--f_476_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f, 0, 0, (int) f_478_, (int) f_480_, f_481_, f_502_, f_510_, f_504_, f_511_, f_506_, f_512_, f_508_);
									f_480_ += f_498_;
									f_478_ += f_499_;
									f_481_ += f_503_;
									f_510_ += f_505_;
									f_511_ += f_507_;
									f_512_ += f_509_;
									f += (float) anInt1440;
								}
							}
						}
					}
				} else if (f_476_ <= f_477_) {
					if (!(f_476_ >= (float) anInt1460)) {
						if (f_477_ > (float) anInt1460)
							f_477_ = (float) anInt1460;
						if (f > (float) anInt1460)
							f = (float) anInt1460;
						f_482_ = f_482_ - f_502_ * f_479_ + f_502_;
						float f_513_ = ((float) (i_484_ & 0xff0000) - f_504_ * f_479_ + f_504_);
						float f_514_ = ((float) (i_484_ & 0xff00) - f_506_ * f_479_ + f_506_);
						float f_515_ = ((float) (i_484_ & 0xff) - f_508_ * f_479_ + f_508_);
						if (f_477_ < f) {
							f_478_ = f_479_;
							if (f_476_ < 0.0F) {
								f_478_ -= f_499_ * f_476_;
								f_479_ -= f_498_ * f_476_;
								f_482_ -= f_503_ * f_476_;
								f_513_ -= f_505_ * f_476_;
								f_514_ -= f_507_ * f_476_;
								f_515_ -= f_509_ * f_476_;
								f_476_ = 0.0F;
							}
							if (f_477_ < 0.0F) {
								f_480_ -= f_500_ * f_477_;
								f_477_ = 0.0F;
							}
							if (f_476_ != f_477_ && f_499_ < f_498_ || f_476_ == f_477_ && f_499_ > f_500_) {
								f_476_ += 0.5F;
								f_477_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_477_;
								f_477_ -= f_476_;
								f_476_ = (float) anIntArray1446[(int) f_476_];
								while (--f_477_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f_476_, 0, 0, (int) f_478_, (int) f_479_, f_482_, f_502_, f_513_, f_504_, f_514_, f_506_, f_515_, f_508_);
									f_478_ += f_499_;
									f_479_ += f_498_;
									f_482_ += f_503_;
									f_513_ += f_505_;
									f_514_ += f_507_;
									f_515_ += f_509_;
									f_476_ += (float) anInt1440;
								}
								while (--f >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f_476_, 0, 0, (int) f_478_, (int) f_480_, f_482_, f_502_, f_513_, f_504_, f_514_, f_506_, f_515_, f_508_);
									f_478_ += f_499_;
									f_480_ += f_500_;
									f_482_ += f_503_;
									f_513_ += f_505_;
									f_514_ += f_507_;
									f_515_ += f_509_;
									f_476_ += (float) anInt1440;
								}
							} else {
								f_476_ += 0.5F;
								f_477_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_477_;
								f_477_ -= f_476_;
								f_476_ = (float) anIntArray1446[(int) f_476_];
								while (--f_477_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f_476_, 0, 0, (int) f_479_, (int) f_478_, f_482_, f_502_, f_513_, f_504_, f_514_, f_506_, f_515_, f_508_);
									f_478_ += f_499_;
									f_479_ += f_498_;
									f_482_ += f_503_;
									f_513_ += f_505_;
									f_514_ += f_507_;
									f_515_ += f_509_;
									f_476_ += (float) anInt1440;
								}
								while (--f >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f_476_, 0, 0, (int) f_480_, (int) f_478_, f_482_, f_502_, f_513_, f_504_, f_514_, f_506_, f_515_, f_508_);
									f_478_ += f_499_;
									f_480_ += f_500_;
									f_482_ += f_503_;
									f_513_ += f_505_;
									f_514_ += f_507_;
									f_515_ += f_509_;
									f_476_ += (float) anInt1440;
								}
							}
						} else {
							f_480_ = f_479_;
							if (f_476_ < 0.0F) {
								f_480_ -= f_499_ * f_476_;
								f_479_ -= f_498_ * f_476_;
								f_482_ -= f_503_ * f_476_;
								f_513_ -= f_505_ * f_476_;
								f_514_ -= f_507_ * f_476_;
								f_515_ -= f_509_ * f_476_;
								f_476_ = 0.0F;
							}
							if (f < 0.0F) {
								f_478_ -= f_500_ * f;
								f = 0.0F;
							}
							if (f_499_ < f_498_) {
								f_476_ += 0.5F;
								f += 0.5F;
								f_477_ = (float) (int) (f_477_ + 0.5F) - f;
								f -= f_476_;
								f_476_ = (float) anIntArray1446[(int) f_476_];
								while (--f >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f_476_, 0, 0, (int) f_480_, (int) f_479_, f_482_, f_502_, f_513_, f_504_, f_514_, f_506_, f_515_, f_508_);
									f_480_ += f_499_;
									f_479_ += f_498_;
									f_482_ += f_503_;
									f_513_ += f_505_;
									f_514_ += f_507_;
									f_515_ += f_509_;
									f_476_ += (float) anInt1440;
								}
								while (--f_477_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f_476_, 0, 0, (int) f_478_, (int) f_479_, f_482_, f_502_, f_513_, f_504_, f_514_, f_506_, f_515_, f_508_);
									f_478_ += f_500_;
									f_479_ += f_498_;
									f_482_ += f_503_;
									f_513_ += f_505_;
									f_514_ += f_507_;
									f_515_ += f_509_;
									f_476_ += (float) anInt1440;
								}
							} else {
								f_476_ += 0.5F;
								f += 0.5F;
								f_477_ = (float) (int) (f_477_ + 0.5F) - f;
								f -= f_476_;
								f_476_ = (float) anIntArray1446[(int) f_476_];
								while (--f >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f_476_, 0, 0, (int) f_479_, (int) f_480_, f_482_, f_502_, f_513_, f_504_, f_514_, f_506_, f_515_, f_508_);
									f_480_ += f_499_;
									f_479_ += f_498_;
									f_482_ += f_503_;
									f_513_ += f_505_;
									f_514_ += f_507_;
									f_515_ += f_509_;
									f_476_ += (float) anInt1440;
								}
								while (--f_477_ >= 0.0F) {
									method1489(bool_474_, bool_475_, anIntArray1451, (int) f_476_, 0, 0, (int) f_479_, (int) f_478_, f_482_, f_502_, f_513_, f_504_, f_514_, f_506_, f_515_, f_508_);
									f_478_ += f_500_;
									f_479_ += f_498_;
									f_482_ += f_503_;
									f_513_ += f_505_;
									f_514_ += f_507_;
									f_515_ += f_509_;
									f_476_ += (float) anInt1440;
								}
							}
						}
					}
				} else if (!(f_477_ >= (float) anInt1460)) {
					if (f > (float) anInt1460)
						f = (float) anInt1460;
					if (f_476_ > (float) anInt1460)
						f_476_ = (float) anInt1460;
					f_483_ = f_483_ - f_502_ * f_480_ + f_502_;
					float f_516_ = ((float) (i_485_ & 0xff0000) - f_504_ * f_480_ + f_504_);
					float f_517_ = (float) (i_485_ & 0xff00) - f_506_ * f_480_ + f_506_;
					float f_518_ = (float) (i_485_ & 0xff) - f_508_ * f_480_ + f_508_;
					if (f < f_476_) {
						f_479_ = f_480_;
						if (f_477_ < 0.0F) {
							f_479_ -= f_498_ * f_477_;
							f_480_ -= f_500_ * f_477_;
							f_483_ -= f_503_ * f_477_;
							f_516_ -= f_505_ * f_477_;
							f_517_ -= f_507_ * f_477_;
							f_518_ -= f_509_ * f_477_;
							f_477_ = 0.0F;
						}
						if (f < 0.0F) {
							f_478_ -= f_499_ * f;
							f = 0.0F;
						}
						if (f_498_ < f_500_) {
							f_477_ += 0.5F;
							f += 0.5F;
							f_476_ = (float) (int) (f_476_ + 0.5F) - f;
							f -= f_477_;
							f_477_ = (float) anIntArray1446[(int) f_477_];
							while (--f >= 0.0F) {
								method1489(bool_474_, bool_475_, anIntArray1451, (int) f_477_, 0, 0, (int) f_479_, (int) f_480_, f_483_, f_502_, f_516_, f_504_, f_517_, f_506_, f_518_, f_508_);
								f_479_ += f_498_;
								f_480_ += f_500_;
								f_483_ += f_503_;
								f_516_ += f_505_;
								f_517_ += f_507_;
								f_518_ += f_509_;
								f_477_ += (float) anInt1440;
							}
							while (--f_476_ >= 0.0F) {
								method1489(bool_474_, bool_475_, anIntArray1451, (int) f_477_, 0, 0, (int) f_479_, (int) f_478_, f_483_, f_502_, f_516_, f_504_, f_517_, f_506_, f_518_, f_508_);
								f_479_ += f_498_;
								f_478_ += f_499_;
								f_483_ += f_503_;
								f_516_ += f_505_;
								f_517_ += f_507_;
								f_518_ += f_509_;
								f_477_ += (float) anInt1440;
							}
						} else {
							f_477_ += 0.5F;
							f += 0.5F;
							f_476_ = (float) (int) (f_476_ + 0.5F) - f;
							f -= f_477_;
							f_477_ = (float) anIntArray1446[(int) f_477_];
							while (--f >= 0.0F) {
								method1489(bool_474_, bool_475_, anIntArray1451, (int) f_477_, 0, 0, (int) f_480_, (int) f_479_, f_483_, f_502_, f_516_, f_504_, f_517_, f_506_, f_518_, f_508_);
								f_479_ += f_498_;
								f_480_ += f_500_;
								f_483_ += f_503_;
								f_516_ += f_505_;
								f_517_ += f_507_;
								f_518_ += f_509_;
								f_477_ += (float) anInt1440;
							}
							while (--f_476_ >= 0.0F) {
								method1489(bool_474_, bool_475_, anIntArray1451, (int) f_477_, 0, 0, (int) f_478_, (int) f_479_, f_483_, f_502_, f_516_, f_504_, f_517_, f_506_, f_518_, f_508_);
								f_479_ += f_498_;
								f_478_ += f_499_;
								f_483_ += f_503_;
								f_516_ += f_505_;
								f_517_ += f_507_;
								f_518_ += f_509_;
								f_477_ += (float) anInt1440;
							}
						}
					} else {
						f_478_ = f_480_;
						if (f_477_ < 0.0F) {
							f_478_ -= f_498_ * f_477_;
							f_480_ -= f_500_ * f_477_;
							f_483_ -= f_503_ * f_477_;
							f_516_ -= f_505_ * f_477_;
							f_517_ -= f_507_ * f_477_;
							f_518_ -= f_509_ * f_477_;
							f_477_ = 0.0F;
						}
						if (f_476_ < 0.0F) {
							f_479_ -= f_499_ * f_476_;
							f_476_ = 0.0F;
						}
						if (f_498_ < f_500_) {
							f_477_ += 0.5F;
							f_476_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_476_;
							f_476_ -= f_477_;
							f_477_ = (float) anIntArray1446[(int) f_477_];
							while (--f_476_ >= 0.0F) {
								method1489(bool_474_, bool_475_, anIntArray1451, (int) f_477_, 0, 0, (int) f_478_, (int) f_480_, f_483_, f_502_, f_516_, f_504_, f_517_, f_506_, f_518_, f_508_);
								f_478_ += f_498_;
								f_480_ += f_500_;
								f_483_ += f_503_;
								f_516_ += f_505_;
								f_517_ += f_507_;
								f_518_ += f_509_;
								f_477_ += (float) anInt1440;
							}
							while (--f >= 0.0F) {
								method1489(bool_474_, bool_475_, anIntArray1451, (int) f_477_, 0, 0, (int) f_479_, (int) f_480_, f_483_, f_502_, f_516_, f_504_, f_517_, f_506_, f_518_, f_508_);
								f_479_ += f_499_;
								f_480_ += f_500_;
								f_483_ += f_503_;
								f_516_ += f_505_;
								f_517_ += f_507_;
								f_518_ += f_509_;
								f_477_ += (float) anInt1440;
							}
						} else {
							f_477_ += 0.5F;
							f_476_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_476_;
							f_476_ -= f_477_;
							f_477_ = (float) anIntArray1446[(int) f_477_];
							while (--f_476_ >= 0.0F) {
								method1489(bool_474_, bool_475_, anIntArray1451, (int) f_477_, 0, 0, (int) f_480_, (int) f_478_, f_483_, f_502_, f_516_, f_504_, f_517_, f_506_, f_518_, f_508_);
								f_478_ += f_498_;
								f_480_ += f_500_;
								f_483_ += f_503_;
								f_516_ += f_505_;
								f_517_ += f_507_;
								f_518_ += f_509_;
								f_477_ += (float) anInt1440;
							}
							while (--f >= 0.0F) {
								method1489(bool_474_, bool_475_, anIntArray1451, (int) f_477_, 0, 0, (int) f_480_, (int) f_479_, f_483_, f_502_, f_516_, f_504_, f_517_, f_506_, f_518_, f_508_);
								f_479_ += f_499_;
								f_480_ += f_500_;
								f_483_ += f_503_;
								f_516_ += f_505_;
								f_517_ += f_507_;
								f_518_ += f_509_;
								f_477_ += (float) anInt1440;
							}
						}
					}
				}
			}
		}
	}

	final void method1505(boolean bool) {
		aBool1471 = bool;
	}

	final void method1506(boolean bool, boolean bool_519_, boolean bool_520_, int[] is, int i, int i_521_, int i_522_, int i_523_, int i_524_, float f, float f_525_) {
		if (aBool1449) {
			if (i_524_ > anInt1441)
				i_524_ = anInt1441;
			if (i_523_ < 0)
				i_523_ = 0;
		}
		if (i_523_ < i_524_) {
			i += i_523_ - 1;
			i_522_ = i_524_ - i_523_ >> 2;
			f += f_525_ * (float) i_523_;
			if (aClass107_1448.aBool1285) {
				if (anInt1436 == 0) {
					while (--i_522_ >= 0) {
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool)
								is[i] = i_521_;
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool)
								is[i] = i_521_;
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool)
								is[i] = i_521_;
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool)
								is[i] = i_521_;
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
					}
					i_522_ = i_524_ - i_523_ & 0x3;
					while (--i_522_ >= 0) {
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool)
								is[i] = i_521_;
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
					}
				} else if (anInt1436 == 254) {
					if (i_523_ != 0 && i_524_ <= anInt1441 - 1) {
						while (--i_522_ >= 0) {
							i++;
							if ((!bool_519_ || f < aFloatArray1452[i]) && bool)
								is[i - 1] = is[i];
							f += f_525_;
							i++;
							if ((!bool_519_ || f < aFloatArray1452[i]) && bool)
								is[i - 1] = is[i];
							f += f_525_;
							i++;
							if ((!bool_519_ || f < aFloatArray1452[i]) && bool)
								is[i - 1] = is[i];
							f += f_525_;
							i++;
							if ((!bool_519_ || f < aFloatArray1452[i]) && bool)
								is[i - 1] = is[i];
							f += f_525_;
						}
						i_522_ = i_524_ - i_523_ & 0x3;
						while (--i_522_ >= 0) {
							i++;
							if ((!bool_519_ || f < aFloatArray1452[i]) && bool)
								is[i - 1] = is[i];
							f += f_525_;
						}
					}
				} else {
					int i_526_ = anInt1436;
					int i_527_ = 256 - anInt1436;
					i_521_ = (((i_521_ & 0xff00ff) * i_527_ >> 8 & 0xff00ff) + ((i_521_ & 0xff00) * i_527_ >> 8 & 0xff00));
					while (--i_522_ >= 0) {
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool) {
								int i_528_ = is[i];
								if (bool_520_)
									is[i] = ((i_527_ | i_528_ >> 24) << 24 | (i_521_ + (((i_528_ & 0xff00ff) * i_526_ >> 8) & 0xff00ff) + (((i_528_ & 0xff00) * i_526_ >> 8) & 0xff00)));
								else
									is[i] = (i_521_ + ((i_528_ & 0xff00ff) * i_526_ >> 8 & 0xff00ff) + ((i_528_ & 0xff00) * i_526_ >> 8 & 0xff00));
							}
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool) {
								int i_529_ = is[i];
								if (bool_520_)
									is[i] = ((i_527_ | i_529_ >> 24) << 24 | (i_521_ + (((i_529_ & 0xff00ff) * i_526_ >> 8) & 0xff00ff) + (((i_529_ & 0xff00) * i_526_ >> 8) & 0xff00)));
								else
									is[i] = (i_521_ + ((i_529_ & 0xff00ff) * i_526_ >> 8 & 0xff00ff) + ((i_529_ & 0xff00) * i_526_ >> 8 & 0xff00));
							}
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool) {
								int i_530_ = is[i];
								if (bool_520_)
									is[i] = ((i_527_ | i_530_ >> 24) << 24 | (i_521_ + (((i_530_ & 0xff00ff) * i_526_ >> 8) & 0xff00ff) + (((i_530_ & 0xff00) * i_526_ >> 8) & 0xff00)));
								else
									is[i] = (i_521_ + ((i_530_ & 0xff00ff) * i_526_ >> 8 & 0xff00ff) + ((i_530_ & 0xff00) * i_526_ >> 8 & 0xff00));
							}
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool) {
								int i_531_ = is[i];
								if (bool_520_)
									is[i] = ((i_527_ | i_531_ >> 24) << 24 | (i_521_ + (((i_531_ & 0xff00ff) * i_526_ >> 8) & 0xff00ff) + (((i_531_ & 0xff00) * i_526_ >> 8) & 0xff00)));
								else
									is[i] = (i_521_ + ((i_531_ & 0xff00ff) * i_526_ >> 8 & 0xff00ff) + ((i_531_ & 0xff00) * i_526_ >> 8 & 0xff00));
							}
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
					}
					i_522_ = i_524_ - i_523_ & 0x3;
					while (--i_522_ >= 0) {
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							if (bool) {
								int i_532_ = is[i];
								if (bool_520_)
									is[i] = ((i_527_ | i_532_ >> 24) << 24 | (i_521_ + (((i_532_ & 0xff00ff) * i_526_ >> 8) & 0xff00ff) + (((i_532_ & 0xff00) * i_526_ >> 8) & 0xff00)));
								else
									is[i] = (i_521_ + ((i_532_ & 0xff00ff) * i_526_ >> 8 & 0xff00ff) + ((i_532_ & 0xff00) * i_526_ >> 8 & 0xff00));
							}
							if (bool_519_)
								aFloatArray1452[i] = f;
						}
						f += f_525_;
					}
				}
			} else if (bool) {
				if (anInt1436 == 0) {
					while (--i_522_ >= 0) {
						i++;
						if (!bool_519_ || f < aFloatArray1452[i])
							is[i] = i_521_;
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i])
							is[i] = i_521_;
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i])
							is[i] = i_521_;
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i])
							is[i] = i_521_;
						f += f_525_;
					}
					i_522_ = i_524_ - i_523_ & 0x3;
					while (--i_522_ >= 0) {
						i++;
						if (!bool_519_ || f < aFloatArray1452[i])
							is[i] = i_521_;
						f += f_525_;
					}
				} else if (anInt1436 == 254) {
					if (i_523_ != 0 && i_524_ <= anInt1441 - 1) {
						while (--i_522_ >= 0) {
							i++;
							if (!bool_519_ || f < aFloatArray1452[i])
								is[i - 1] = is[i];
							f += f_525_;
							i++;
							if (!bool_519_ || f < aFloatArray1452[i])
								is[i - 1] = is[i];
							f += f_525_;
							i++;
							if (!bool_519_ || f < aFloatArray1452[i])
								is[i - 1] = is[i];
							f += f_525_;
							i++;
							if (!bool_519_ || f < aFloatArray1452[i])
								is[i - 1] = is[i];
							f += f_525_;
						}
						i_522_ = i_524_ - i_523_ & 0x3;
						while (--i_522_ >= 0) {
							i++;
							if (!bool_519_ || f < aFloatArray1452[i])
								is[i - 1] = is[i];
							f += f_525_;
						}
					}
				} else {
					int i_533_ = anInt1436;
					int i_534_ = 256 - anInt1436;
					i_521_ = (((i_521_ & 0xff00ff) * i_534_ >> 8 & 0xff00ff) + ((i_521_ & 0xff00) * i_534_ >> 8 & 0xff00));
					while (--i_522_ >= 0) {
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							int i_535_ = is[i];
							if (bool_520_)
								is[i] = ((i_534_ | i_535_ >> 24) << 24 | (i_521_ + ((i_535_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_535_ & 0xff00) * i_533_ >> 8 & 0xff00)));
							else
								is[i] = (i_521_ + ((i_535_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_535_ & 0xff00) * i_533_ >> 8 & 0xff00));
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							int i_536_ = is[i];
							if (bool_520_)
								is[i] = ((i_534_ | i_536_ >> 24) << 24 | (i_521_ + ((i_536_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_536_ & 0xff00) * i_533_ >> 8 & 0xff00)));
							else
								is[i] = (i_521_ + ((i_536_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_536_ & 0xff00) * i_533_ >> 8 & 0xff00));
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							int i_537_ = is[i];
							if (bool_520_)
								is[i] = ((i_534_ | i_537_ >> 24) << 24 | (i_521_ + ((i_537_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_537_ & 0xff00) * i_533_ >> 8 & 0xff00)));
							else
								is[i] = (i_521_ + ((i_537_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_537_ & 0xff00) * i_533_ >> 8 & 0xff00));
						}
						f += f_525_;
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							int i_538_ = is[i];
							if (bool_520_)
								is[i] = ((i_534_ | i_538_ >> 24) << 24 | (i_521_ + ((i_538_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_538_ & 0xff00) * i_533_ >> 8 & 0xff00)));
							else
								is[i] = (i_521_ + ((i_538_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_538_ & 0xff00) * i_533_ >> 8 & 0xff00));
						}
						f += f_525_;
					}
					i_522_ = i_524_ - i_523_ & 0x3;
					while (--i_522_ >= 0) {
						i++;
						if (!bool_519_ || f < aFloatArray1452[i]) {
							int i_539_ = is[i];
							if (bool_520_)
								is[i] = ((i_534_ | i_539_ >> 24) << 24 | (i_521_ + ((i_539_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_539_ & 0xff00) * i_533_ >> 8 & 0xff00)));
							else
								is[i] = (i_521_ + ((i_539_ & 0xff00ff) * i_533_ >> 8 & 0xff00ff) + ((i_539_ & 0xff00) * i_533_ >> 8 & 0xff00));
						}
						f += f_525_;
					}
				}
			}
		}
	}

	Class117(Class167_Sub1 class167_sub1, Class107 class107) {
		aBool1434 = true;
		aBool1435 = false;
		anInt1436 = 0;
		aBool1449 = false;
		aBool1438 = false;
		anIntArray1446 = new int[4096];
		aFloat1444 = 0.0F;
		aFloat1445 = 1.0F;
		anInt1454 = -1;
		anIntArray1455 = null;
		anInt1456 = 0;
		anInt1457 = 0;
		aFloat1458 = 0.0F;
		anInt1465 = 0;
		aBool1461 = true;
		anInt1469 = -1;
		anIntArray1463 = null;
		anInt1464 = 0;
		anInt1437 = 0;
		aFloat1466 = 0.0F;
		anInt1467 = -1;
		anIntArray1468 = null;
		anInt1450 = 0;
		anInt1470 = 0;
		aFloat1443 = 0.0F;
		aClass167_Sub1_1433 = class167_sub1;
		aClass107_1448 = class107;
		anInt1440 = aClass167_Sub1_1433.anInt8997 * -570111553;
		anIntArray1451 = aClass167_Sub1_1433.anIntArray8996;
		aFloatArray1452 = aClass167_Sub1_1433.aFloatArray8999;
		aClass595_1447 = Class595.aClass595_7820;
	}

	final void method1507(boolean bool, boolean bool_540_, boolean bool_541_, float f, float f_542_, float f_543_, float f_544_, float f_545_, float f_546_, float f_547_, float f_548_, float f_549_, int i) {
		if (aBool1471) {
			aClass167_Sub1_1433.method2060((int) f_544_, (int) f, (int) f_545_, (int) f_542_, i, 326316031);
			aClass167_Sub1_1433.method2060((int) f_545_, (int) f_542_, (int) f_546_, (int) f_543_, i, -20461226);
			aClass167_Sub1_1433.method2060((int) f_546_, (int) f_543_, (int) f_544_, (int) f, i, 634675725);
		} else {
			float f_550_ = f_545_ - f_544_;
			float f_551_ = f_542_ - f;
			float f_552_ = f_546_ - f_544_;
			float f_553_ = f_543_ - f;
			float f_554_ = f_548_ - f_547_;
			float f_555_ = f_549_ - f_547_;
			float f_556_ = 0.0F;
			if (f_542_ != f)
				f_556_ = (f_545_ - f_544_) / (f_542_ - f);
			float f_557_ = 0.0F;
			if (f_543_ != f_542_)
				f_557_ = (f_546_ - f_545_) / (f_543_ - f_542_);
			float f_558_ = 0.0F;
			if (f_543_ != f)
				f_558_ = (f_544_ - f_546_) / (f - f_543_);
			float f_559_ = f_550_ * f_553_ - f_552_ * f_551_;
			if (f_559_ != 0.0F) {
				float f_560_ = (f_554_ * f_553_ - f_555_ * f_551_) / f_559_;
				float f_561_ = (f_555_ * f_550_ - f_554_ * f_552_) / f_559_;
				if (f <= f_542_ && f <= f_543_) {
					if (!(f >= (float) anInt1460)) {
						if (f_542_ > (float) anInt1460)
							f_542_ = (float) anInt1460;
						if (f_543_ > (float) anInt1460)
							f_543_ = (float) anInt1460;
						f_547_ = f_547_ - f_560_ * f_544_ + f_560_;
						if (f_542_ < f_543_) {
							f_546_ = f_544_;
							if (f < 0.0F) {
								f_546_ -= f_558_ * f;
								f_544_ -= f_556_ * f;
								f_547_ -= f_561_ * f;
								f = 0.0F;
							}
							if (f_542_ < 0.0F) {
								f_545_ -= f_557_ * f_542_;
								f_542_ = 0.0F;
							}
							if (f != f_542_ && f_558_ < f_556_ || f == f_542_ && f_558_ > f_557_) {
								f += 0.5F;
								f_542_ += 0.5F;
								f_543_ = (float) (int) (f_543_ + 0.5F) - f_542_;
								f_542_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_542_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f, i, 0, (int) f_546_, (int) f_544_, f_547_, f_560_);
									f_546_ += f_558_;
									f_544_ += f_556_;
									f_547_ += f_561_;
									f += (float) anInt1440;
								}
								while (--f_543_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f, i, 0, (int) f_546_, (int) f_545_, f_547_, f_560_);
									f_546_ += f_558_;
									f_545_ += f_557_;
									f_547_ += f_561_;
									f += (float) anInt1440;
								}
							} else {
								f += 0.5F;
								f_542_ += 0.5F;
								f_543_ = (float) (int) (f_543_ + 0.5F) - f_542_;
								f_542_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_542_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f, i, 0, (int) f_544_, (int) f_546_, f_547_, f_560_);
									f_546_ += f_558_;
									f_544_ += f_556_;
									f_547_ += f_561_;
									f += (float) anInt1440;
								}
								while (--f_543_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f, i, 0, (int) f_545_, (int) f_546_, f_547_, f_560_);
									f_546_ += f_558_;
									f_545_ += f_557_;
									f_547_ += f_561_;
									f += (float) anInt1440;
								}
							}
						} else {
							f_545_ = f_544_;
							if (f < 0.0F) {
								f_545_ -= f_558_ * f;
								f_544_ -= f_556_ * f;
								f_547_ -= f_561_ * f;
								f = 0.0F;
							}
							if (f_543_ < 0.0F) {
								f_546_ -= f_557_ * f_543_;
								f_543_ = 0.0F;
							}
							if (f != f_543_ && f_558_ < f_556_ || f == f_543_ && f_557_ > f_556_) {
								f += 0.5F;
								f_543_ += 0.5F;
								f_542_ = (float) (int) (f_542_ + 0.5F) - f_543_;
								f_543_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_543_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f, i, 0, (int) f_545_, (int) f_544_, f_547_, f_560_);
									f_545_ += f_558_;
									f_544_ += f_556_;
									f_547_ += f_561_;
									f += (float) anInt1440;
								}
								while (--f_542_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f, i, 0, (int) f_546_, (int) f_544_, f_547_, f_560_);
									f_546_ += f_557_;
									f_544_ += f_556_;
									f_547_ += f_561_;
									f += (float) anInt1440;
								}
							} else {
								f += 0.5F;
								f_543_ += 0.5F;
								f_542_ = (float) (int) (f_542_ + 0.5F) - f_543_;
								f_543_ -= f;
								f = (float) anIntArray1446[(int) f];
								while (--f_543_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f, i, 0, (int) f_544_, (int) f_545_, f_547_, f_560_);
									f_545_ += f_558_;
									f_544_ += f_556_;
									f_547_ += f_561_;
									f += (float) anInt1440;
								}
								while (--f_542_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f, i, 0, (int) f_544_, (int) f_546_, f_547_, f_560_);
									f_546_ += f_557_;
									f_544_ += f_556_;
									f_547_ += f_561_;
									f += (float) anInt1440;
								}
							}
						}
					}
				} else if (f_542_ <= f_543_) {
					if (!(f_542_ >= (float) anInt1460)) {
						if (f_543_ > (float) anInt1460)
							f_543_ = (float) anInt1460;
						if (f > (float) anInt1460)
							f = (float) anInt1460;
						f_548_ = f_548_ - f_560_ * f_545_ + f_560_;
						if (f_543_ < f) {
							f_544_ = f_545_;
							if (f_542_ < 0.0F) {
								f_544_ -= f_556_ * f_542_;
								f_545_ -= f_557_ * f_542_;
								f_548_ -= f_561_ * f_542_;
								f_542_ = 0.0F;
							}
							if (f_543_ < 0.0F) {
								f_546_ -= f_558_ * f_543_;
								f_543_ = 0.0F;
							}
							if (f_542_ != f_543_ && f_556_ < f_557_ || f_542_ == f_543_ && f_556_ > f_558_) {
								f_542_ += 0.5F;
								f_543_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_543_;
								f_543_ -= f_542_;
								f_542_ = (float) anIntArray1446[(int) f_542_];
								while (--f_543_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_542_, i, 0, (int) f_544_, (int) f_545_, f_548_, f_560_);
									f_544_ += f_556_;
									f_545_ += f_557_;
									f_548_ += f_561_;
									f_542_ += (float) anInt1440;
								}
								while (--f >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_542_, i, 0, (int) f_544_, (int) f_546_, f_548_, f_560_);
									f_544_ += f_556_;
									f_546_ += f_558_;
									f_548_ += f_561_;
									f_542_ += (float) anInt1440;
								}
							} else {
								f_542_ += 0.5F;
								f_543_ += 0.5F;
								f = (float) (int) (f + 0.5F) - f_543_;
								f_543_ -= f_542_;
								f_542_ = (float) anIntArray1446[(int) f_542_];
								while (--f_543_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_542_, i, 0, (int) f_545_, (int) f_544_, f_548_, f_560_);
									f_544_ += f_556_;
									f_545_ += f_557_;
									f_548_ += f_561_;
									f_542_ += (float) anInt1440;
								}
								while (--f >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_542_, i, 0, (int) f_546_, (int) f_544_, f_548_, f_560_);
									f_544_ += f_556_;
									f_546_ += f_558_;
									f_548_ += f_561_;
									f_542_ += (float) anInt1440;
								}
							}
						} else {
							f_546_ = f_545_;
							if (f_542_ < 0.0F) {
								f_546_ -= f_556_ * f_542_;
								f_545_ -= f_557_ * f_542_;
								f_548_ -= f_561_ * f_542_;
								f_542_ = 0.0F;
							}
							if (f < 0.0F) {
								f_544_ -= f_558_ * f;
								f = 0.0F;
							}
							if (f_556_ < f_557_) {
								f_542_ += 0.5F;
								f += 0.5F;
								f_543_ = (float) (int) (f_543_ + 0.5F) - f;
								f -= f_542_;
								f_542_ = (float) anIntArray1446[(int) f_542_];
								while (--f >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_542_, i, 0, (int) f_546_, (int) f_545_, f_548_, f_560_);
									f_546_ += f_556_;
									f_545_ += f_557_;
									f_548_ += f_561_;
									f_542_ += (float) anInt1440;
								}
								while (--f_543_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_542_, i, 0, (int) f_544_, (int) f_545_, f_548_, f_560_);
									f_544_ += f_558_;
									f_545_ += f_557_;
									f_548_ += f_561_;
									f_542_ += (float) anInt1440;
								}
							} else {
								f_542_ += 0.5F;
								f += 0.5F;
								f_543_ = (float) (int) (f_543_ + 0.5F) - f;
								f -= f_542_;
								f_542_ = (float) anIntArray1446[(int) f_542_];
								while (--f >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_542_, i, 0, (int) f_545_, (int) f_546_, f_548_, f_560_);
									f_546_ += f_556_;
									f_545_ += f_557_;
									f_548_ += f_561_;
									f_542_ += (float) anInt1440;
								}
								while (--f_543_ >= 0.0F) {
									method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_542_, i, 0, (int) f_545_, (int) f_544_, f_548_, f_560_);
									f_544_ += f_558_;
									f_545_ += f_557_;
									f_548_ += f_561_;
									f_542_ += (float) anInt1440;
								}
							}
						}
					}
				} else if (!(f_543_ >= (float) anInt1460)) {
					if (f > (float) anInt1460)
						f = (float) anInt1460;
					if (f_542_ > (float) anInt1460)
						f_542_ = (float) anInt1460;
					f_549_ = f_549_ - f_560_ * f_546_ + f_560_;
					if (f < f_542_) {
						f_545_ = f_546_;
						if (f_543_ < 0.0F) {
							f_545_ -= f_557_ * f_543_;
							f_546_ -= f_558_ * f_543_;
							f_549_ -= f_561_ * f_543_;
							f_543_ = 0.0F;
						}
						if (f < 0.0F) {
							f_544_ -= f_556_ * f;
							f = 0.0F;
						}
						if (f_557_ < f_558_) {
							f_543_ += 0.5F;
							f += 0.5F;
							f_542_ = (float) (int) (f_542_ + 0.5F) - f;
							f -= f_543_;
							f_543_ = (float) anIntArray1446[(int) f_543_];
							while (--f >= 0.0F) {
								method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_543_, i, 0, (int) f_545_, (int) f_546_, f_549_, f_560_);
								f_545_ += f_557_;
								f_546_ += f_558_;
								f_549_ += f_561_;
								f_543_ += (float) anInt1440;
							}
							while (--f_542_ >= 0.0F) {
								method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_543_, i, 0, (int) f_545_, (int) f_544_, f_549_, f_560_);
								f_545_ += f_557_;
								f_544_ += f_556_;
								f_549_ += f_561_;
								f_543_ += (float) anInt1440;
							}
						} else {
							f_543_ += 0.5F;
							f += 0.5F;
							f_542_ = (float) (int) (f_542_ + 0.5F) - f;
							f -= f_543_;
							f_543_ = (float) anIntArray1446[(int) f_543_];
							while (--f >= 0.0F) {
								method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_543_, i, 0, (int) f_546_, (int) f_545_, f_549_, f_560_);
								f_545_ += f_557_;
								f_546_ += f_558_;
								f_549_ += f_561_;
								f_543_ += (float) anInt1440;
							}
							while (--f_542_ >= 0.0F) {
								method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_543_, i, 0, (int) f_544_, (int) f_545_, f_549_, f_560_);
								f_545_ += f_557_;
								f_544_ += f_556_;
								f_549_ += f_561_;
								f_543_ += (float) anInt1440;
							}
						}
					} else {
						f_544_ = f_546_;
						if (f_543_ < 0.0F) {
							f_544_ -= f_557_ * f_543_;
							f_546_ -= f_558_ * f_543_;
							f_549_ -= f_561_ * f_543_;
							f_543_ = 0.0F;
						}
						if (f_542_ < 0.0F) {
							f_545_ -= f_556_ * f_542_;
							f_542_ = 0.0F;
						}
						if (f_557_ < f_558_) {
							f_543_ += 0.5F;
							f_542_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_542_;
							f_542_ -= f_543_;
							f_543_ = (float) anIntArray1446[(int) f_543_];
							while (--f_542_ >= 0.0F) {
								method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_543_, i, 0, (int) f_544_, (int) f_546_, f_549_, f_560_);
								f_544_ += f_557_;
								f_546_ += f_558_;
								f_549_ += f_561_;
								f_543_ += (float) anInt1440;
							}
							while (--f >= 0.0F) {
								method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_543_, i, 0, (int) f_545_, (int) f_546_, f_549_, f_560_);
								f_545_ += f_556_;
								f_546_ += f_558_;
								f_549_ += f_561_;
								f_543_ += (float) anInt1440;
							}
						} else {
							f_543_ += 0.5F;
							f_542_ += 0.5F;
							f = (float) (int) (f + 0.5F) - f_542_;
							f_542_ -= f_543_;
							f_543_ = (float) anIntArray1446[(int) f_543_];
							while (--f_542_ >= 0.0F) {
								method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_543_, i, 0, (int) f_546_, (int) f_544_, f_549_, f_560_);
								f_544_ += f_557_;
								f_546_ += f_558_;
								f_549_ += f_561_;
								f_543_ += (float) anInt1440;
							}
							while (--f >= 0.0F) {
								method1506(bool, bool_540_, bool_541_, anIntArray1451, (int) f_543_, i, 0, (int) f_546_, (int) f_545_, f_549_, f_560_);
								f_545_ += f_556_;
								f_546_ += f_558_;
								f_549_ += f_561_;
								f_543_ += (float) anInt1440;
							}
						}
					}
				}
			}
		}
	}
}
