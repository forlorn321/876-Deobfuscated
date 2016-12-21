/* Class536_Sub18_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub7_Sub1 extends Class536_Sub18_Sub7 {
	int anInt12051;
	int anInt12052;
	static final int anInt12053 = 16;
	int anInt12054;
	int anInt12055;
	byte[] aByteArray12056;

	boolean method10972(int i, int i_0_) {
		return aByteArray12056.length >= i * i_0_;
	}

	void method10973(int i, int i_1_, int i_2_, int i_3_) {
		anInt12054 = i;
		anInt12051 = i_1_;
		anInt12055 = i_2_ - i;
		anInt12052 = i_3_ - i_1_;
	}

	void method10974() {
		int i = -1;
		int i_4_ = aByteArray12056.length - 8;
		while (i < i_4_) {
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
		}
		while (i < aByteArray12056.length - 1)
			aByteArray12056[++i] = (byte) 0;
	}

	void method10975(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = 0;
		if (i_5_ != i)
			i_10_ = (i_8_ - i_7_ << 16) / (i_5_ - i);
		int i_11_ = 0;
		if (i_6_ != i_5_)
			i_11_ = (i_9_ - i_8_ << 16) / (i_6_ - i_5_);
		int i_12_ = 0;
		if (i_6_ != i)
			i_12_ = (i_7_ - i_9_ << 16) / (i - i_6_);
		if (i <= i_5_ && i <= i_6_) {
			if (i_5_ < i_6_) {
				i_9_ = i_7_ <<= 16;
				if (i < 0) {
					i_9_ -= i_12_ * i;
					i_7_ -= i_10_ * i;
					i = 0;
				}
				i_8_ <<= 16;
				if (i_5_ < 0) {
					i_8_ -= i_11_ * i_5_;
					i_5_ = 0;
				}
				if (i != i_5_ && i_12_ < i_10_ || i == i_5_ && i_12_ > i_11_) {
					i_6_ -= i_5_;
					i_5_ -= i;
					i *= anInt12055;
					while (--i_5_ >= 0) {
						method10978(aByteArray12056, i, 0, i_9_ >> 16, i_7_ >> 16);
						i_9_ += i_12_;
						i_7_ += i_10_;
						i += anInt12055;
					}
					while (--i_6_ >= 0) {
						method10978(aByteArray12056, i, 0, i_9_ >> 16, i_8_ >> 16);
						i_9_ += i_12_;
						i_8_ += i_11_;
						i += anInt12055;
					}
				} else {
					i_6_ -= i_5_;
					i_5_ -= i;
					i *= anInt12055;
					while (--i_5_ >= 0) {
						method10978(aByteArray12056, i, 0, i_7_ >> 16, i_9_ >> 16);
						i_9_ += i_12_;
						i_7_ += i_10_;
						i += anInt12055;
					}
					while (--i_6_ >= 0) {
						method10978(aByteArray12056, i, 0, i_8_ >> 16, i_9_ >> 16);
						i_9_ += i_12_;
						i_8_ += i_11_;
						i += anInt12055;
					}
				}
			} else {
				i_8_ = i_7_ <<= 16;
				if (i < 0) {
					i_8_ -= i_12_ * i;
					i_7_ -= i_10_ * i;
					i = 0;
				}
				i_9_ <<= 16;
				if (i_6_ < 0) {
					i_9_ -= i_11_ * i_6_;
					i_6_ = 0;
				}
				if (i != i_6_ && i_12_ < i_10_ || i == i_6_ && i_11_ > i_10_) {
					i_5_ -= i_6_;
					i_6_ -= i;
					i *= anInt12055;
					while (--i_6_ >= 0) {
						method10978(aByteArray12056, i, 0, i_8_ >> 16, i_7_ >> 16);
						i_8_ += i_12_;
						i_7_ += i_10_;
						i += anInt12055;
					}
					while (--i_5_ >= 0) {
						method10978(aByteArray12056, i, 0, i_9_ >> 16, i_7_ >> 16);
						i_9_ += i_11_;
						i_7_ += i_10_;
						i += anInt12055;
					}
				} else {
					i_5_ -= i_6_;
					i_6_ -= i;
					i *= anInt12055;
					while (--i_6_ >= 0) {
						method10978(aByteArray12056, i, 0, i_7_ >> 16, i_8_ >> 16);
						i_8_ += i_12_;
						i_7_ += i_10_;
						i += anInt12055;
					}
					while (--i_5_ >= 0) {
						method10978(aByteArray12056, i, 0, i_7_ >> 16, i_9_ >> 16);
						i_9_ += i_11_;
						i_7_ += i_10_;
						i += anInt12055;
					}
				}
			}
		} else if (i_5_ <= i_6_) {
			if (i_6_ < i) {
				i_7_ = i_8_ <<= 16;
				if (i_5_ < 0) {
					i_7_ -= i_10_ * i_5_;
					i_8_ -= i_11_ * i_5_;
					i_5_ = 0;
				}
				i_9_ <<= 16;
				if (i_6_ < 0) {
					i_9_ -= i_12_ * i_6_;
					i_6_ = 0;
				}
				if (i_5_ != i_6_ && i_10_ < i_11_ || i_5_ == i_6_ && i_10_ > i_12_) {
					i -= i_6_;
					i_6_ -= i_5_;
					i_5_ *= anInt12055;
					while (--i_6_ >= 0) {
						method10978(aByteArray12056, i_5_, 0, i_7_ >> 16, i_8_ >> 16);
						i_7_ += i_10_;
						i_8_ += i_11_;
						i_5_ += anInt12055;
					}
					while (--i >= 0) {
						method10978(aByteArray12056, i_5_, 0, i_7_ >> 16, i_9_ >> 16);
						i_7_ += i_10_;
						i_9_ += i_12_;
						i_5_ += anInt12055;
					}
				} else {
					i -= i_6_;
					i_6_ -= i_5_;
					i_5_ *= anInt12055;
					while (--i_6_ >= 0) {
						method10978(aByteArray12056, i_5_, 0, i_8_ >> 16, i_7_ >> 16);
						i_7_ += i_10_;
						i_8_ += i_11_;
						i_5_ += anInt12055;
					}
					while (--i >= 0) {
						method10978(aByteArray12056, i_5_, 0, i_9_ >> 16, i_7_ >> 16);
						i_7_ += i_10_;
						i_9_ += i_12_;
						i_5_ += anInt12055;
					}
				}
			} else {
				i_9_ = i_8_ <<= 16;
				if (i_5_ < 0) {
					i_9_ -= i_10_ * i_5_;
					i_8_ -= i_11_ * i_5_;
					i_5_ = 0;
				}
				i_7_ <<= 16;
				if (i < 0) {
					i_7_ -= i_12_ * i;
					i = 0;
				}
				if (i_10_ < i_11_) {
					i_6_ -= i;
					i -= i_5_;
					i_5_ *= anInt12055;
					while (--i >= 0) {
						method10978(aByteArray12056, i_5_, 0, i_9_ >> 16, i_8_ >> 16);
						i_9_ += i_10_;
						i_8_ += i_11_;
						i_5_ += anInt12055;
					}
					while (--i_6_ >= 0) {
						method10978(aByteArray12056, i_5_, 0, i_7_ >> 16, i_8_ >> 16);
						i_7_ += i_12_;
						i_8_ += i_11_;
						i_5_ += anInt12055;
					}
				} else {
					i_6_ -= i;
					i -= i_5_;
					i_5_ *= anInt12055;
					while (--i >= 0) {
						method10978(aByteArray12056, i_5_, 0, i_8_ >> 16, i_9_ >> 16);
						i_9_ += i_10_;
						i_8_ += i_11_;
						i_5_ += anInt12055;
					}
					while (--i_6_ >= 0) {
						method10978(aByteArray12056, i_5_, 0, i_8_ >> 16, i_7_ >> 16);
						i_7_ += i_12_;
						i_8_ += i_11_;
						i_5_ += anInt12055;
					}
				}
			}
		} else if (i < i_5_) {
			i_8_ = i_9_ <<= 16;
			if (i_6_ < 0) {
				i_8_ -= i_11_ * i_6_;
				i_9_ -= i_12_ * i_6_;
				i_6_ = 0;
			}
			i_7_ <<= 16;
			if (i < 0) {
				i_7_ -= i_10_ * i;
				i = 0;
			}
			if (i_11_ < i_12_) {
				i_5_ -= i;
				i -= i_6_;
				i_6_ *= anInt12055;
				while (--i >= 0) {
					method10978(aByteArray12056, i_6_, 0, i_8_ >> 16, i_9_ >> 16);
					i_8_ += i_11_;
					i_9_ += i_12_;
					i_6_ += anInt12055;
				}
				while (--i_5_ >= 0) {
					method10978(aByteArray12056, i_6_, 0, i_8_ >> 16, i_7_ >> 16);
					i_8_ += i_11_;
					i_7_ += i_10_;
					i_6_ += anInt12055;
				}
			} else {
				i_5_ -= i;
				i -= i_6_;
				i_6_ *= anInt12055;
				while (--i >= 0) {
					method10978(aByteArray12056, i_6_, 0, i_9_ >> 16, i_8_ >> 16);
					i_8_ += i_11_;
					i_9_ += i_12_;
					i_6_ += anInt12055;
				}
				while (--i_5_ >= 0) {
					method10978(aByteArray12056, i_6_, 0, i_7_ >> 16, i_8_ >> 16);
					i_8_ += i_11_;
					i_7_ += i_10_;
					i_6_ += anInt12055;
				}
			}
		} else {
			i_7_ = i_9_ <<= 16;
			if (i_6_ < 0) {
				i_7_ -= i_11_ * i_6_;
				i_9_ -= i_12_ * i_6_;
				i_6_ = 0;
			}
			i_8_ <<= 16;
			if (i_5_ < 0) {
				i_8_ -= i_10_ * i_5_;
				i_5_ = 0;
			}
			if (i_11_ < i_12_) {
				i -= i_5_;
				i_5_ -= i_6_;
				i_6_ *= anInt12055;
				while (--i_5_ >= 0) {
					method10978(aByteArray12056, i_6_, 0, i_7_ >> 16, i_9_ >> 16);
					i_7_ += i_11_;
					i_9_ += i_12_;
					i_6_ += anInt12055;
				}
				while (--i >= 0) {
					method10978(aByteArray12056, i_6_, 0, i_8_ >> 16, i_9_ >> 16);
					i_8_ += i_10_;
					i_9_ += i_12_;
					i_6_ += anInt12055;
				}
			} else {
				i -= i_5_;
				i_5_ -= i_6_;
				i_6_ *= anInt12055;
				while (--i_5_ >= 0) {
					method10978(aByteArray12056, i_6_, 0, i_9_ >> 16, i_7_ >> 16);
					i_7_ += i_11_;
					i_9_ += i_12_;
					i_6_ += anInt12055;
				}
				while (--i >= 0) {
					method10978(aByteArray12056, i_6_, 0, i_9_ >> 16, i_8_ >> 16);
					i_8_ += i_10_;
					i_9_ += i_12_;
					i_6_ += anInt12055;
				}
			}
		}
	}

	Class536_Sub18_Sub7_Sub1(Class167_Sub3 class167_sub3, int i, int i_13_) {
		aByteArray12056 = new byte[i * i_13_];
	}

	void method10976(int i, int i_14_, int i_15_, int i_16_) {
		anInt12054 = i;
		anInt12051 = i_14_;
		anInt12055 = i_15_ - i;
		anInt12052 = i_16_ - i_14_;
	}

	void method10977(int i, int i_17_, int i_18_, int i_19_) {
		anInt12054 = i;
		anInt12051 = i_17_;
		anInt12055 = i_18_ - i;
		anInt12052 = i_19_ - i_17_;
	}

	static final void method10978(byte[] is, int i, int i_20_, int i_21_, int i_22_) {
		if (i_21_ < i_22_) {
			i += i_21_;
			i_20_ = i_22_ - i_21_ >> 2;
			while (--i_20_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_20_ = i_22_ - i_21_ & 0x3;
			while (--i_20_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method10979() {
		int i = -1;
		int i_23_ = aByteArray12056.length - 8;
		while (i < i_23_) {
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
		}
		while (i < aByteArray12056.length - 1)
			aByteArray12056[++i] = (byte) 0;
	}

	void method10980() {
		int i = -1;
		int i_24_ = aByteArray12056.length - 8;
		while (i < i_24_) {
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
			aByteArray12056[++i] = (byte) 0;
		}
		while (i < aByteArray12056.length - 1)
			aByteArray12056[++i] = (byte) 0;
	}

	void method10981(int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		int i_30_ = 0;
		if (i_25_ != i)
			i_30_ = (i_28_ - i_27_ << 16) / (i_25_ - i);
		int i_31_ = 0;
		if (i_26_ != i_25_)
			i_31_ = (i_29_ - i_28_ << 16) / (i_26_ - i_25_);
		int i_32_ = 0;
		if (i_26_ != i)
			i_32_ = (i_27_ - i_29_ << 16) / (i - i_26_);
		if (i <= i_25_ && i <= i_26_) {
			if (i_25_ < i_26_) {
				i_29_ = i_27_ <<= 16;
				if (i < 0) {
					i_29_ -= i_32_ * i;
					i_27_ -= i_30_ * i;
					i = 0;
				}
				i_28_ <<= 16;
				if (i_25_ < 0) {
					i_28_ -= i_31_ * i_25_;
					i_25_ = 0;
				}
				if (i != i_25_ && i_32_ < i_30_ || i == i_25_ && i_32_ > i_31_) {
					i_26_ -= i_25_;
					i_25_ -= i;
					i *= anInt12055;
					while (--i_25_ >= 0) {
						method10978(aByteArray12056, i, 0, i_29_ >> 16, i_27_ >> 16);
						i_29_ += i_32_;
						i_27_ += i_30_;
						i += anInt12055;
					}
					while (--i_26_ >= 0) {
						method10978(aByteArray12056, i, 0, i_29_ >> 16, i_28_ >> 16);
						i_29_ += i_32_;
						i_28_ += i_31_;
						i += anInt12055;
					}
				} else {
					i_26_ -= i_25_;
					i_25_ -= i;
					i *= anInt12055;
					while (--i_25_ >= 0) {
						method10978(aByteArray12056, i, 0, i_27_ >> 16, i_29_ >> 16);
						i_29_ += i_32_;
						i_27_ += i_30_;
						i += anInt12055;
					}
					while (--i_26_ >= 0) {
						method10978(aByteArray12056, i, 0, i_28_ >> 16, i_29_ >> 16);
						i_29_ += i_32_;
						i_28_ += i_31_;
						i += anInt12055;
					}
				}
			} else {
				i_28_ = i_27_ <<= 16;
				if (i < 0) {
					i_28_ -= i_32_ * i;
					i_27_ -= i_30_ * i;
					i = 0;
				}
				i_29_ <<= 16;
				if (i_26_ < 0) {
					i_29_ -= i_31_ * i_26_;
					i_26_ = 0;
				}
				if (i != i_26_ && i_32_ < i_30_ || i == i_26_ && i_31_ > i_30_) {
					i_25_ -= i_26_;
					i_26_ -= i;
					i *= anInt12055;
					while (--i_26_ >= 0) {
						method10978(aByteArray12056, i, 0, i_28_ >> 16, i_27_ >> 16);
						i_28_ += i_32_;
						i_27_ += i_30_;
						i += anInt12055;
					}
					while (--i_25_ >= 0) {
						method10978(aByteArray12056, i, 0, i_29_ >> 16, i_27_ >> 16);
						i_29_ += i_31_;
						i_27_ += i_30_;
						i += anInt12055;
					}
				} else {
					i_25_ -= i_26_;
					i_26_ -= i;
					i *= anInt12055;
					while (--i_26_ >= 0) {
						method10978(aByteArray12056, i, 0, i_27_ >> 16, i_28_ >> 16);
						i_28_ += i_32_;
						i_27_ += i_30_;
						i += anInt12055;
					}
					while (--i_25_ >= 0) {
						method10978(aByteArray12056, i, 0, i_27_ >> 16, i_29_ >> 16);
						i_29_ += i_31_;
						i_27_ += i_30_;
						i += anInt12055;
					}
				}
			}
		} else if (i_25_ <= i_26_) {
			if (i_26_ < i) {
				i_27_ = i_28_ <<= 16;
				if (i_25_ < 0) {
					i_27_ -= i_30_ * i_25_;
					i_28_ -= i_31_ * i_25_;
					i_25_ = 0;
				}
				i_29_ <<= 16;
				if (i_26_ < 0) {
					i_29_ -= i_32_ * i_26_;
					i_26_ = 0;
				}
				if (i_25_ != i_26_ && i_30_ < i_31_ || i_25_ == i_26_ && i_30_ > i_32_) {
					i -= i_26_;
					i_26_ -= i_25_;
					i_25_ *= anInt12055;
					while (--i_26_ >= 0) {
						method10978(aByteArray12056, i_25_, 0, i_27_ >> 16, i_28_ >> 16);
						i_27_ += i_30_;
						i_28_ += i_31_;
						i_25_ += anInt12055;
					}
					while (--i >= 0) {
						method10978(aByteArray12056, i_25_, 0, i_27_ >> 16, i_29_ >> 16);
						i_27_ += i_30_;
						i_29_ += i_32_;
						i_25_ += anInt12055;
					}
				} else {
					i -= i_26_;
					i_26_ -= i_25_;
					i_25_ *= anInt12055;
					while (--i_26_ >= 0) {
						method10978(aByteArray12056, i_25_, 0, i_28_ >> 16, i_27_ >> 16);
						i_27_ += i_30_;
						i_28_ += i_31_;
						i_25_ += anInt12055;
					}
					while (--i >= 0) {
						method10978(aByteArray12056, i_25_, 0, i_29_ >> 16, i_27_ >> 16);
						i_27_ += i_30_;
						i_29_ += i_32_;
						i_25_ += anInt12055;
					}
				}
			} else {
				i_29_ = i_28_ <<= 16;
				if (i_25_ < 0) {
					i_29_ -= i_30_ * i_25_;
					i_28_ -= i_31_ * i_25_;
					i_25_ = 0;
				}
				i_27_ <<= 16;
				if (i < 0) {
					i_27_ -= i_32_ * i;
					i = 0;
				}
				if (i_30_ < i_31_) {
					i_26_ -= i;
					i -= i_25_;
					i_25_ *= anInt12055;
					while (--i >= 0) {
						method10978(aByteArray12056, i_25_, 0, i_29_ >> 16, i_28_ >> 16);
						i_29_ += i_30_;
						i_28_ += i_31_;
						i_25_ += anInt12055;
					}
					while (--i_26_ >= 0) {
						method10978(aByteArray12056, i_25_, 0, i_27_ >> 16, i_28_ >> 16);
						i_27_ += i_32_;
						i_28_ += i_31_;
						i_25_ += anInt12055;
					}
				} else {
					i_26_ -= i;
					i -= i_25_;
					i_25_ *= anInt12055;
					while (--i >= 0) {
						method10978(aByteArray12056, i_25_, 0, i_28_ >> 16, i_29_ >> 16);
						i_29_ += i_30_;
						i_28_ += i_31_;
						i_25_ += anInt12055;
					}
					while (--i_26_ >= 0) {
						method10978(aByteArray12056, i_25_, 0, i_28_ >> 16, i_27_ >> 16);
						i_27_ += i_32_;
						i_28_ += i_31_;
						i_25_ += anInt12055;
					}
				}
			}
		} else if (i < i_25_) {
			i_28_ = i_29_ <<= 16;
			if (i_26_ < 0) {
				i_28_ -= i_31_ * i_26_;
				i_29_ -= i_32_ * i_26_;
				i_26_ = 0;
			}
			i_27_ <<= 16;
			if (i < 0) {
				i_27_ -= i_30_ * i;
				i = 0;
			}
			if (i_31_ < i_32_) {
				i_25_ -= i;
				i -= i_26_;
				i_26_ *= anInt12055;
				while (--i >= 0) {
					method10978(aByteArray12056, i_26_, 0, i_28_ >> 16, i_29_ >> 16);
					i_28_ += i_31_;
					i_29_ += i_32_;
					i_26_ += anInt12055;
				}
				while (--i_25_ >= 0) {
					method10978(aByteArray12056, i_26_, 0, i_28_ >> 16, i_27_ >> 16);
					i_28_ += i_31_;
					i_27_ += i_30_;
					i_26_ += anInt12055;
				}
			} else {
				i_25_ -= i;
				i -= i_26_;
				i_26_ *= anInt12055;
				while (--i >= 0) {
					method10978(aByteArray12056, i_26_, 0, i_29_ >> 16, i_28_ >> 16);
					i_28_ += i_31_;
					i_29_ += i_32_;
					i_26_ += anInt12055;
				}
				while (--i_25_ >= 0) {
					method10978(aByteArray12056, i_26_, 0, i_27_ >> 16, i_28_ >> 16);
					i_28_ += i_31_;
					i_27_ += i_30_;
					i_26_ += anInt12055;
				}
			}
		} else {
			i_27_ = i_29_ <<= 16;
			if (i_26_ < 0) {
				i_27_ -= i_31_ * i_26_;
				i_29_ -= i_32_ * i_26_;
				i_26_ = 0;
			}
			i_28_ <<= 16;
			if (i_25_ < 0) {
				i_28_ -= i_30_ * i_25_;
				i_25_ = 0;
			}
			if (i_31_ < i_32_) {
				i -= i_25_;
				i_25_ -= i_26_;
				i_26_ *= anInt12055;
				while (--i_25_ >= 0) {
					method10978(aByteArray12056, i_26_, 0, i_27_ >> 16, i_29_ >> 16);
					i_27_ += i_31_;
					i_29_ += i_32_;
					i_26_ += anInt12055;
				}
				while (--i >= 0) {
					method10978(aByteArray12056, i_26_, 0, i_28_ >> 16, i_29_ >> 16);
					i_28_ += i_30_;
					i_29_ += i_32_;
					i_26_ += anInt12055;
				}
			} else {
				i -= i_25_;
				i_25_ -= i_26_;
				i_26_ *= anInt12055;
				while (--i_25_ >= 0) {
					method10978(aByteArray12056, i_26_, 0, i_29_ >> 16, i_27_ >> 16);
					i_27_ += i_31_;
					i_29_ += i_32_;
					i_26_ += anInt12055;
				}
				while (--i >= 0) {
					method10978(aByteArray12056, i_26_, 0, i_29_ >> 16, i_28_ >> 16);
					i_28_ += i_30_;
					i_29_ += i_32_;
					i_26_ += anInt12055;
				}
			}
		}
	}

	void method10982(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		int i_38_ = 0;
		if (i_33_ != i)
			i_38_ = (i_36_ - i_35_ << 16) / (i_33_ - i);
		int i_39_ = 0;
		if (i_34_ != i_33_)
			i_39_ = (i_37_ - i_36_ << 16) / (i_34_ - i_33_);
		int i_40_ = 0;
		if (i_34_ != i)
			i_40_ = (i_35_ - i_37_ << 16) / (i - i_34_);
		if (i <= i_33_ && i <= i_34_) {
			if (i_33_ < i_34_) {
				i_37_ = i_35_ <<= 16;
				if (i < 0) {
					i_37_ -= i_40_ * i;
					i_35_ -= i_38_ * i;
					i = 0;
				}
				i_36_ <<= 16;
				if (i_33_ < 0) {
					i_36_ -= i_39_ * i_33_;
					i_33_ = 0;
				}
				if (i != i_33_ && i_40_ < i_38_ || i == i_33_ && i_40_ > i_39_) {
					i_34_ -= i_33_;
					i_33_ -= i;
					i *= anInt12055;
					while (--i_33_ >= 0) {
						method10978(aByteArray12056, i, 0, i_37_ >> 16, i_35_ >> 16);
						i_37_ += i_40_;
						i_35_ += i_38_;
						i += anInt12055;
					}
					while (--i_34_ >= 0) {
						method10978(aByteArray12056, i, 0, i_37_ >> 16, i_36_ >> 16);
						i_37_ += i_40_;
						i_36_ += i_39_;
						i += anInt12055;
					}
				} else {
					i_34_ -= i_33_;
					i_33_ -= i;
					i *= anInt12055;
					while (--i_33_ >= 0) {
						method10978(aByteArray12056, i, 0, i_35_ >> 16, i_37_ >> 16);
						i_37_ += i_40_;
						i_35_ += i_38_;
						i += anInt12055;
					}
					while (--i_34_ >= 0) {
						method10978(aByteArray12056, i, 0, i_36_ >> 16, i_37_ >> 16);
						i_37_ += i_40_;
						i_36_ += i_39_;
						i += anInt12055;
					}
				}
			} else {
				i_36_ = i_35_ <<= 16;
				if (i < 0) {
					i_36_ -= i_40_ * i;
					i_35_ -= i_38_ * i;
					i = 0;
				}
				i_37_ <<= 16;
				if (i_34_ < 0) {
					i_37_ -= i_39_ * i_34_;
					i_34_ = 0;
				}
				if (i != i_34_ && i_40_ < i_38_ || i == i_34_ && i_39_ > i_38_) {
					i_33_ -= i_34_;
					i_34_ -= i;
					i *= anInt12055;
					while (--i_34_ >= 0) {
						method10978(aByteArray12056, i, 0, i_36_ >> 16, i_35_ >> 16);
						i_36_ += i_40_;
						i_35_ += i_38_;
						i += anInt12055;
					}
					while (--i_33_ >= 0) {
						method10978(aByteArray12056, i, 0, i_37_ >> 16, i_35_ >> 16);
						i_37_ += i_39_;
						i_35_ += i_38_;
						i += anInt12055;
					}
				} else {
					i_33_ -= i_34_;
					i_34_ -= i;
					i *= anInt12055;
					while (--i_34_ >= 0) {
						method10978(aByteArray12056, i, 0, i_35_ >> 16, i_36_ >> 16);
						i_36_ += i_40_;
						i_35_ += i_38_;
						i += anInt12055;
					}
					while (--i_33_ >= 0) {
						method10978(aByteArray12056, i, 0, i_35_ >> 16, i_37_ >> 16);
						i_37_ += i_39_;
						i_35_ += i_38_;
						i += anInt12055;
					}
				}
			}
		} else if (i_33_ <= i_34_) {
			if (i_34_ < i) {
				i_35_ = i_36_ <<= 16;
				if (i_33_ < 0) {
					i_35_ -= i_38_ * i_33_;
					i_36_ -= i_39_ * i_33_;
					i_33_ = 0;
				}
				i_37_ <<= 16;
				if (i_34_ < 0) {
					i_37_ -= i_40_ * i_34_;
					i_34_ = 0;
				}
				if (i_33_ != i_34_ && i_38_ < i_39_ || i_33_ == i_34_ && i_38_ > i_40_) {
					i -= i_34_;
					i_34_ -= i_33_;
					i_33_ *= anInt12055;
					while (--i_34_ >= 0) {
						method10978(aByteArray12056, i_33_, 0, i_35_ >> 16, i_36_ >> 16);
						i_35_ += i_38_;
						i_36_ += i_39_;
						i_33_ += anInt12055;
					}
					while (--i >= 0) {
						method10978(aByteArray12056, i_33_, 0, i_35_ >> 16, i_37_ >> 16);
						i_35_ += i_38_;
						i_37_ += i_40_;
						i_33_ += anInt12055;
					}
				} else {
					i -= i_34_;
					i_34_ -= i_33_;
					i_33_ *= anInt12055;
					while (--i_34_ >= 0) {
						method10978(aByteArray12056, i_33_, 0, i_36_ >> 16, i_35_ >> 16);
						i_35_ += i_38_;
						i_36_ += i_39_;
						i_33_ += anInt12055;
					}
					while (--i >= 0) {
						method10978(aByteArray12056, i_33_, 0, i_37_ >> 16, i_35_ >> 16);
						i_35_ += i_38_;
						i_37_ += i_40_;
						i_33_ += anInt12055;
					}
				}
			} else {
				i_37_ = i_36_ <<= 16;
				if (i_33_ < 0) {
					i_37_ -= i_38_ * i_33_;
					i_36_ -= i_39_ * i_33_;
					i_33_ = 0;
				}
				i_35_ <<= 16;
				if (i < 0) {
					i_35_ -= i_40_ * i;
					i = 0;
				}
				if (i_38_ < i_39_) {
					i_34_ -= i;
					i -= i_33_;
					i_33_ *= anInt12055;
					while (--i >= 0) {
						method10978(aByteArray12056, i_33_, 0, i_37_ >> 16, i_36_ >> 16);
						i_37_ += i_38_;
						i_36_ += i_39_;
						i_33_ += anInt12055;
					}
					while (--i_34_ >= 0) {
						method10978(aByteArray12056, i_33_, 0, i_35_ >> 16, i_36_ >> 16);
						i_35_ += i_40_;
						i_36_ += i_39_;
						i_33_ += anInt12055;
					}
				} else {
					i_34_ -= i;
					i -= i_33_;
					i_33_ *= anInt12055;
					while (--i >= 0) {
						method10978(aByteArray12056, i_33_, 0, i_36_ >> 16, i_37_ >> 16);
						i_37_ += i_38_;
						i_36_ += i_39_;
						i_33_ += anInt12055;
					}
					while (--i_34_ >= 0) {
						method10978(aByteArray12056, i_33_, 0, i_36_ >> 16, i_35_ >> 16);
						i_35_ += i_40_;
						i_36_ += i_39_;
						i_33_ += anInt12055;
					}
				}
			}
		} else if (i < i_33_) {
			i_36_ = i_37_ <<= 16;
			if (i_34_ < 0) {
				i_36_ -= i_39_ * i_34_;
				i_37_ -= i_40_ * i_34_;
				i_34_ = 0;
			}
			i_35_ <<= 16;
			if (i < 0) {
				i_35_ -= i_38_ * i;
				i = 0;
			}
			if (i_39_ < i_40_) {
				i_33_ -= i;
				i -= i_34_;
				i_34_ *= anInt12055;
				while (--i >= 0) {
					method10978(aByteArray12056, i_34_, 0, i_36_ >> 16, i_37_ >> 16);
					i_36_ += i_39_;
					i_37_ += i_40_;
					i_34_ += anInt12055;
				}
				while (--i_33_ >= 0) {
					method10978(aByteArray12056, i_34_, 0, i_36_ >> 16, i_35_ >> 16);
					i_36_ += i_39_;
					i_35_ += i_38_;
					i_34_ += anInt12055;
				}
			} else {
				i_33_ -= i;
				i -= i_34_;
				i_34_ *= anInt12055;
				while (--i >= 0) {
					method10978(aByteArray12056, i_34_, 0, i_37_ >> 16, i_36_ >> 16);
					i_36_ += i_39_;
					i_37_ += i_40_;
					i_34_ += anInt12055;
				}
				while (--i_33_ >= 0) {
					method10978(aByteArray12056, i_34_, 0, i_35_ >> 16, i_36_ >> 16);
					i_36_ += i_39_;
					i_35_ += i_38_;
					i_34_ += anInt12055;
				}
			}
		} else {
			i_35_ = i_37_ <<= 16;
			if (i_34_ < 0) {
				i_35_ -= i_39_ * i_34_;
				i_37_ -= i_40_ * i_34_;
				i_34_ = 0;
			}
			i_36_ <<= 16;
			if (i_33_ < 0) {
				i_36_ -= i_38_ * i_33_;
				i_33_ = 0;
			}
			if (i_39_ < i_40_) {
				i -= i_33_;
				i_33_ -= i_34_;
				i_34_ *= anInt12055;
				while (--i_33_ >= 0) {
					method10978(aByteArray12056, i_34_, 0, i_35_ >> 16, i_37_ >> 16);
					i_35_ += i_39_;
					i_37_ += i_40_;
					i_34_ += anInt12055;
				}
				while (--i >= 0) {
					method10978(aByteArray12056, i_34_, 0, i_36_ >> 16, i_37_ >> 16);
					i_36_ += i_38_;
					i_37_ += i_40_;
					i_34_ += anInt12055;
				}
			} else {
				i -= i_33_;
				i_33_ -= i_34_;
				i_34_ *= anInt12055;
				while (--i_33_ >= 0) {
					method10978(aByteArray12056, i_34_, 0, i_37_ >> 16, i_35_ >> 16);
					i_35_ += i_39_;
					i_37_ += i_40_;
					i_34_ += anInt12055;
				}
				while (--i >= 0) {
					method10978(aByteArray12056, i_34_, 0, i_37_ >> 16, i_36_ >> 16);
					i_36_ += i_38_;
					i_37_ += i_40_;
					i_34_ += anInt12055;
				}
			}
		}
	}

	static final void method10983(byte[] is, int i, int i_41_, int i_42_, int i_43_) {
		if (i_42_ < i_43_) {
			i += i_42_;
			i_41_ = i_43_ - i_42_ >> 2;
			while (--i_41_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_41_ = i_43_ - i_42_ & 0x3;
			while (--i_41_ >= 0)
				is[i++] = (byte) 1;
		}
	}
}
