/* Class536_Sub18_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub7_Sub2 extends Class536_Sub18_Sub7 {
	int anInt12075;
	int anInt12076;
	static final int anInt12077 = 16;
	int anInt12078;
	int anInt12079;
	byte[] aByteArray12080;

	void method10999(int i, int i_0_, int i_1_, int i_2_) {
		anInt12078 = i;
		anInt12079 = i_0_;
		anInt12075 = i_1_ - i;
		anInt12076 = i_2_ - i_0_;
	}

	void method11000(int i, int i_3_, int i_4_, int i_5_) {
		anInt12078 = i;
		anInt12079 = i_3_;
		anInt12075 = i_4_ - i;
		anInt12076 = i_5_ - i_3_;
	}

	boolean method11001(int i, int i_6_) {
		return aByteArray12080.length >= i * i_6_;
	}

	void method11002(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		int i_12_ = 0;
		if (i_7_ != i)
			i_12_ = (i_10_ - i_9_ << 16) / (i_7_ - i);
		int i_13_ = 0;
		if (i_8_ != i_7_)
			i_13_ = (i_11_ - i_10_ << 16) / (i_8_ - i_7_);
		int i_14_ = 0;
		if (i_8_ != i)
			i_14_ = (i_9_ - i_11_ << 16) / (i - i_8_);
		if (i <= i_7_ && i <= i_8_) {
			if (i_7_ < i_8_) {
				i_11_ = i_9_ <<= 16;
				if (i < 0) {
					i_11_ -= i_14_ * i;
					i_9_ -= i_12_ * i;
					i = 0;
				}
				i_10_ <<= 16;
				if (i_7_ < 0) {
					i_10_ -= i_13_ * i_7_;
					i_7_ = 0;
				}
				if (i != i_7_ && i_14_ < i_12_ || i == i_7_ && i_14_ > i_13_) {
					i_8_ -= i_7_;
					i_7_ -= i;
					i *= anInt12075;
					while (--i_7_ >= 0) {
						method11003(aByteArray12080, i, 0, i_11_ >> 16, i_9_ >> 16);
						i_11_ += i_14_;
						i_9_ += i_12_;
						i += anInt12075;
					}
					while (--i_8_ >= 0) {
						method11003(aByteArray12080, i, 0, i_11_ >> 16, i_10_ >> 16);
						i_11_ += i_14_;
						i_10_ += i_13_;
						i += anInt12075;
					}
				} else {
					i_8_ -= i_7_;
					i_7_ -= i;
					i *= anInt12075;
					while (--i_7_ >= 0) {
						method11003(aByteArray12080, i, 0, i_9_ >> 16, i_11_ >> 16);
						i_11_ += i_14_;
						i_9_ += i_12_;
						i += anInt12075;
					}
					while (--i_8_ >= 0) {
						method11003(aByteArray12080, i, 0, i_10_ >> 16, i_11_ >> 16);
						i_11_ += i_14_;
						i_10_ += i_13_;
						i += anInt12075;
					}
				}
			} else {
				i_10_ = i_9_ <<= 16;
				if (i < 0) {
					i_10_ -= i_14_ * i;
					i_9_ -= i_12_ * i;
					i = 0;
				}
				i_11_ <<= 16;
				if (i_8_ < 0) {
					i_11_ -= i_13_ * i_8_;
					i_8_ = 0;
				}
				if (i != i_8_ && i_14_ < i_12_ || i == i_8_ && i_13_ > i_12_) {
					i_7_ -= i_8_;
					i_8_ -= i;
					i *= anInt12075;
					while (--i_8_ >= 0) {
						method11003(aByteArray12080, i, 0, i_10_ >> 16, i_9_ >> 16);
						i_10_ += i_14_;
						i_9_ += i_12_;
						i += anInt12075;
					}
					while (--i_7_ >= 0) {
						method11003(aByteArray12080, i, 0, i_11_ >> 16, i_9_ >> 16);
						i_11_ += i_13_;
						i_9_ += i_12_;
						i += anInt12075;
					}
				} else {
					i_7_ -= i_8_;
					i_8_ -= i;
					i *= anInt12075;
					while (--i_8_ >= 0) {
						method11003(aByteArray12080, i, 0, i_9_ >> 16, i_10_ >> 16);
						i_10_ += i_14_;
						i_9_ += i_12_;
						i += anInt12075;
					}
					while (--i_7_ >= 0) {
						method11003(aByteArray12080, i, 0, i_9_ >> 16, i_11_ >> 16);
						i_11_ += i_13_;
						i_9_ += i_12_;
						i += anInt12075;
					}
				}
			}
		} else if (i_7_ <= i_8_) {
			if (i_8_ < i) {
				i_9_ = i_10_ <<= 16;
				if (i_7_ < 0) {
					i_9_ -= i_12_ * i_7_;
					i_10_ -= i_13_ * i_7_;
					i_7_ = 0;
				}
				i_11_ <<= 16;
				if (i_8_ < 0) {
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				if (i_7_ != i_8_ && i_12_ < i_13_ || i_7_ == i_8_ && i_12_ > i_14_) {
					i -= i_8_;
					i_8_ -= i_7_;
					i_7_ *= anInt12075;
					while (--i_8_ >= 0) {
						method11003(aByteArray12080, i_7_, 0, i_9_ >> 16, i_10_ >> 16);
						i_9_ += i_12_;
						i_10_ += i_13_;
						i_7_ += anInt12075;
					}
					while (--i >= 0) {
						method11003(aByteArray12080, i_7_, 0, i_9_ >> 16, i_11_ >> 16);
						i_9_ += i_12_;
						i_11_ += i_14_;
						i_7_ += anInt12075;
					}
				} else {
					i -= i_8_;
					i_8_ -= i_7_;
					i_7_ *= anInt12075;
					while (--i_8_ >= 0) {
						method11003(aByteArray12080, i_7_, 0, i_10_ >> 16, i_9_ >> 16);
						i_9_ += i_12_;
						i_10_ += i_13_;
						i_7_ += anInt12075;
					}
					while (--i >= 0) {
						method11003(aByteArray12080, i_7_, 0, i_11_ >> 16, i_9_ >> 16);
						i_9_ += i_12_;
						i_11_ += i_14_;
						i_7_ += anInt12075;
					}
				}
			} else {
				i_11_ = i_10_ <<= 16;
				if (i_7_ < 0) {
					i_11_ -= i_12_ * i_7_;
					i_10_ -= i_13_ * i_7_;
					i_7_ = 0;
				}
				i_9_ <<= 16;
				if (i < 0) {
					i_9_ -= i_14_ * i;
					i = 0;
				}
				if (i_12_ < i_13_) {
					i_8_ -= i;
					i -= i_7_;
					i_7_ *= anInt12075;
					while (--i >= 0) {
						method11003(aByteArray12080, i_7_, 0, i_11_ >> 16, i_10_ >> 16);
						i_11_ += i_12_;
						i_10_ += i_13_;
						i_7_ += anInt12075;
					}
					while (--i_8_ >= 0) {
						method11003(aByteArray12080, i_7_, 0, i_9_ >> 16, i_10_ >> 16);
						i_9_ += i_14_;
						i_10_ += i_13_;
						i_7_ += anInt12075;
					}
				} else {
					i_8_ -= i;
					i -= i_7_;
					i_7_ *= anInt12075;
					while (--i >= 0) {
						method11003(aByteArray12080, i_7_, 0, i_10_ >> 16, i_11_ >> 16);
						i_11_ += i_12_;
						i_10_ += i_13_;
						i_7_ += anInt12075;
					}
					while (--i_8_ >= 0) {
						method11003(aByteArray12080, i_7_, 0, i_10_ >> 16, i_9_ >> 16);
						i_9_ += i_14_;
						i_10_ += i_13_;
						i_7_ += anInt12075;
					}
				}
			}
		} else if (i < i_7_) {
			i_10_ = i_11_ <<= 16;
			if (i_8_ < 0) {
				i_10_ -= i_13_ * i_8_;
				i_11_ -= i_14_ * i_8_;
				i_8_ = 0;
			}
			i_9_ <<= 16;
			if (i < 0) {
				i_9_ -= i_12_ * i;
				i = 0;
			}
			if (i_13_ < i_14_) {
				i_7_ -= i;
				i -= i_8_;
				i_8_ *= anInt12075;
				while (--i >= 0) {
					method11003(aByteArray12080, i_8_, 0, i_10_ >> 16, i_11_ >> 16);
					i_10_ += i_13_;
					i_11_ += i_14_;
					i_8_ += anInt12075;
				}
				while (--i_7_ >= 0) {
					method11003(aByteArray12080, i_8_, 0, i_10_ >> 16, i_9_ >> 16);
					i_10_ += i_13_;
					i_9_ += i_12_;
					i_8_ += anInt12075;
				}
			} else {
				i_7_ -= i;
				i -= i_8_;
				i_8_ *= anInt12075;
				while (--i >= 0) {
					method11003(aByteArray12080, i_8_, 0, i_11_ >> 16, i_10_ >> 16);
					i_10_ += i_13_;
					i_11_ += i_14_;
					i_8_ += anInt12075;
				}
				while (--i_7_ >= 0) {
					method11003(aByteArray12080, i_8_, 0, i_9_ >> 16, i_10_ >> 16);
					i_10_ += i_13_;
					i_9_ += i_12_;
					i_8_ += anInt12075;
				}
			}
		} else {
			i_9_ = i_11_ <<= 16;
			if (i_8_ < 0) {
				i_9_ -= i_13_ * i_8_;
				i_11_ -= i_14_ * i_8_;
				i_8_ = 0;
			}
			i_10_ <<= 16;
			if (i_7_ < 0) {
				i_10_ -= i_12_ * i_7_;
				i_7_ = 0;
			}
			if (i_13_ < i_14_) {
				i -= i_7_;
				i_7_ -= i_8_;
				i_8_ *= anInt12075;
				while (--i_7_ >= 0) {
					method11003(aByteArray12080, i_8_, 0, i_9_ >> 16, i_11_ >> 16);
					i_9_ += i_13_;
					i_11_ += i_14_;
					i_8_ += anInt12075;
				}
				while (--i >= 0) {
					method11003(aByteArray12080, i_8_, 0, i_10_ >> 16, i_11_ >> 16);
					i_10_ += i_12_;
					i_11_ += i_14_;
					i_8_ += anInt12075;
				}
			} else {
				i -= i_7_;
				i_7_ -= i_8_;
				i_8_ *= anInt12075;
				while (--i_7_ >= 0) {
					method11003(aByteArray12080, i_8_, 0, i_11_ >> 16, i_9_ >> 16);
					i_9_ += i_13_;
					i_11_ += i_14_;
					i_8_ += anInt12075;
				}
				while (--i >= 0) {
					method11003(aByteArray12080, i_8_, 0, i_11_ >> 16, i_10_ >> 16);
					i_10_ += i_12_;
					i_11_ += i_14_;
					i_8_ += anInt12075;
				}
			}
		}
	}

	static final void method11003(byte[] is, int i, int i_15_, int i_16_, int i_17_) {
		if (i_16_ < i_17_) {
			i += i_16_;
			i_15_ = i_17_ - i_16_ >> 2;
			while (--i_15_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_15_ = i_17_ - i_16_ & 0x3;
			while (--i_15_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method11004(int i, int i_18_, int i_19_, int i_20_) {
		anInt12078 = i;
		anInt12079 = i_18_;
		anInt12075 = i_19_ - i;
		anInt12076 = i_20_ - i_18_;
	}

	void method11005() {
		int i = -1;
		int i_21_ = aByteArray12080.length - 8;
		while (i < i_21_) {
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
		}
		while (i < aByteArray12080.length - 1)
			aByteArray12080[++i] = (byte) 0;
	}

	void method11006(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		int i_27_ = 0;
		if (i_22_ != i)
			i_27_ = (i_25_ - i_24_ << 16) / (i_22_ - i);
		int i_28_ = 0;
		if (i_23_ != i_22_)
			i_28_ = (i_26_ - i_25_ << 16) / (i_23_ - i_22_);
		int i_29_ = 0;
		if (i_23_ != i)
			i_29_ = (i_24_ - i_26_ << 16) / (i - i_23_);
		if (i <= i_22_ && i <= i_23_) {
			if (i_22_ < i_23_) {
				i_26_ = i_24_ <<= 16;
				if (i < 0) {
					i_26_ -= i_29_ * i;
					i_24_ -= i_27_ * i;
					i = 0;
				}
				i_25_ <<= 16;
				if (i_22_ < 0) {
					i_25_ -= i_28_ * i_22_;
					i_22_ = 0;
				}
				if (i != i_22_ && i_29_ < i_27_ || i == i_22_ && i_29_ > i_28_) {
					i_23_ -= i_22_;
					i_22_ -= i;
					i *= anInt12075;
					while (--i_22_ >= 0) {
						method11003(aByteArray12080, i, 0, i_26_ >> 16, i_24_ >> 16);
						i_26_ += i_29_;
						i_24_ += i_27_;
						i += anInt12075;
					}
					while (--i_23_ >= 0) {
						method11003(aByteArray12080, i, 0, i_26_ >> 16, i_25_ >> 16);
						i_26_ += i_29_;
						i_25_ += i_28_;
						i += anInt12075;
					}
				} else {
					i_23_ -= i_22_;
					i_22_ -= i;
					i *= anInt12075;
					while (--i_22_ >= 0) {
						method11003(aByteArray12080, i, 0, i_24_ >> 16, i_26_ >> 16);
						i_26_ += i_29_;
						i_24_ += i_27_;
						i += anInt12075;
					}
					while (--i_23_ >= 0) {
						method11003(aByteArray12080, i, 0, i_25_ >> 16, i_26_ >> 16);
						i_26_ += i_29_;
						i_25_ += i_28_;
						i += anInt12075;
					}
				}
			} else {
				i_25_ = i_24_ <<= 16;
				if (i < 0) {
					i_25_ -= i_29_ * i;
					i_24_ -= i_27_ * i;
					i = 0;
				}
				i_26_ <<= 16;
				if (i_23_ < 0) {
					i_26_ -= i_28_ * i_23_;
					i_23_ = 0;
				}
				if (i != i_23_ && i_29_ < i_27_ || i == i_23_ && i_28_ > i_27_) {
					i_22_ -= i_23_;
					i_23_ -= i;
					i *= anInt12075;
					while (--i_23_ >= 0) {
						method11003(aByteArray12080, i, 0, i_25_ >> 16, i_24_ >> 16);
						i_25_ += i_29_;
						i_24_ += i_27_;
						i += anInt12075;
					}
					while (--i_22_ >= 0) {
						method11003(aByteArray12080, i, 0, i_26_ >> 16, i_24_ >> 16);
						i_26_ += i_28_;
						i_24_ += i_27_;
						i += anInt12075;
					}
				} else {
					i_22_ -= i_23_;
					i_23_ -= i;
					i *= anInt12075;
					while (--i_23_ >= 0) {
						method11003(aByteArray12080, i, 0, i_24_ >> 16, i_25_ >> 16);
						i_25_ += i_29_;
						i_24_ += i_27_;
						i += anInt12075;
					}
					while (--i_22_ >= 0) {
						method11003(aByteArray12080, i, 0, i_24_ >> 16, i_26_ >> 16);
						i_26_ += i_28_;
						i_24_ += i_27_;
						i += anInt12075;
					}
				}
			}
		} else if (i_22_ <= i_23_) {
			if (i_23_ < i) {
				i_24_ = i_25_ <<= 16;
				if (i_22_ < 0) {
					i_24_ -= i_27_ * i_22_;
					i_25_ -= i_28_ * i_22_;
					i_22_ = 0;
				}
				i_26_ <<= 16;
				if (i_23_ < 0) {
					i_26_ -= i_29_ * i_23_;
					i_23_ = 0;
				}
				if (i_22_ != i_23_ && i_27_ < i_28_ || i_22_ == i_23_ && i_27_ > i_29_) {
					i -= i_23_;
					i_23_ -= i_22_;
					i_22_ *= anInt12075;
					while (--i_23_ >= 0) {
						method11003(aByteArray12080, i_22_, 0, i_24_ >> 16, i_25_ >> 16);
						i_24_ += i_27_;
						i_25_ += i_28_;
						i_22_ += anInt12075;
					}
					while (--i >= 0) {
						method11003(aByteArray12080, i_22_, 0, i_24_ >> 16, i_26_ >> 16);
						i_24_ += i_27_;
						i_26_ += i_29_;
						i_22_ += anInt12075;
					}
				} else {
					i -= i_23_;
					i_23_ -= i_22_;
					i_22_ *= anInt12075;
					while (--i_23_ >= 0) {
						method11003(aByteArray12080, i_22_, 0, i_25_ >> 16, i_24_ >> 16);
						i_24_ += i_27_;
						i_25_ += i_28_;
						i_22_ += anInt12075;
					}
					while (--i >= 0) {
						method11003(aByteArray12080, i_22_, 0, i_26_ >> 16, i_24_ >> 16);
						i_24_ += i_27_;
						i_26_ += i_29_;
						i_22_ += anInt12075;
					}
				}
			} else {
				i_26_ = i_25_ <<= 16;
				if (i_22_ < 0) {
					i_26_ -= i_27_ * i_22_;
					i_25_ -= i_28_ * i_22_;
					i_22_ = 0;
				}
				i_24_ <<= 16;
				if (i < 0) {
					i_24_ -= i_29_ * i;
					i = 0;
				}
				if (i_27_ < i_28_) {
					i_23_ -= i;
					i -= i_22_;
					i_22_ *= anInt12075;
					while (--i >= 0) {
						method11003(aByteArray12080, i_22_, 0, i_26_ >> 16, i_25_ >> 16);
						i_26_ += i_27_;
						i_25_ += i_28_;
						i_22_ += anInt12075;
					}
					while (--i_23_ >= 0) {
						method11003(aByteArray12080, i_22_, 0, i_24_ >> 16, i_25_ >> 16);
						i_24_ += i_29_;
						i_25_ += i_28_;
						i_22_ += anInt12075;
					}
				} else {
					i_23_ -= i;
					i -= i_22_;
					i_22_ *= anInt12075;
					while (--i >= 0) {
						method11003(aByteArray12080, i_22_, 0, i_25_ >> 16, i_26_ >> 16);
						i_26_ += i_27_;
						i_25_ += i_28_;
						i_22_ += anInt12075;
					}
					while (--i_23_ >= 0) {
						method11003(aByteArray12080, i_22_, 0, i_25_ >> 16, i_24_ >> 16);
						i_24_ += i_29_;
						i_25_ += i_28_;
						i_22_ += anInt12075;
					}
				}
			}
		} else if (i < i_22_) {
			i_25_ = i_26_ <<= 16;
			if (i_23_ < 0) {
				i_25_ -= i_28_ * i_23_;
				i_26_ -= i_29_ * i_23_;
				i_23_ = 0;
			}
			i_24_ <<= 16;
			if (i < 0) {
				i_24_ -= i_27_ * i;
				i = 0;
			}
			if (i_28_ < i_29_) {
				i_22_ -= i;
				i -= i_23_;
				i_23_ *= anInt12075;
				while (--i >= 0) {
					method11003(aByteArray12080, i_23_, 0, i_25_ >> 16, i_26_ >> 16);
					i_25_ += i_28_;
					i_26_ += i_29_;
					i_23_ += anInt12075;
				}
				while (--i_22_ >= 0) {
					method11003(aByteArray12080, i_23_, 0, i_25_ >> 16, i_24_ >> 16);
					i_25_ += i_28_;
					i_24_ += i_27_;
					i_23_ += anInt12075;
				}
			} else {
				i_22_ -= i;
				i -= i_23_;
				i_23_ *= anInt12075;
				while (--i >= 0) {
					method11003(aByteArray12080, i_23_, 0, i_26_ >> 16, i_25_ >> 16);
					i_25_ += i_28_;
					i_26_ += i_29_;
					i_23_ += anInt12075;
				}
				while (--i_22_ >= 0) {
					method11003(aByteArray12080, i_23_, 0, i_24_ >> 16, i_25_ >> 16);
					i_25_ += i_28_;
					i_24_ += i_27_;
					i_23_ += anInt12075;
				}
			}
		} else {
			i_24_ = i_26_ <<= 16;
			if (i_23_ < 0) {
				i_24_ -= i_28_ * i_23_;
				i_26_ -= i_29_ * i_23_;
				i_23_ = 0;
			}
			i_25_ <<= 16;
			if (i_22_ < 0) {
				i_25_ -= i_27_ * i_22_;
				i_22_ = 0;
			}
			if (i_28_ < i_29_) {
				i -= i_22_;
				i_22_ -= i_23_;
				i_23_ *= anInt12075;
				while (--i_22_ >= 0) {
					method11003(aByteArray12080, i_23_, 0, i_24_ >> 16, i_26_ >> 16);
					i_24_ += i_28_;
					i_26_ += i_29_;
					i_23_ += anInt12075;
				}
				while (--i >= 0) {
					method11003(aByteArray12080, i_23_, 0, i_25_ >> 16, i_26_ >> 16);
					i_25_ += i_27_;
					i_26_ += i_29_;
					i_23_ += anInt12075;
				}
			} else {
				i -= i_22_;
				i_22_ -= i_23_;
				i_23_ *= anInt12075;
				while (--i_22_ >= 0) {
					method11003(aByteArray12080, i_23_, 0, i_26_ >> 16, i_24_ >> 16);
					i_24_ += i_28_;
					i_26_ += i_29_;
					i_23_ += anInt12075;
				}
				while (--i >= 0) {
					method11003(aByteArray12080, i_23_, 0, i_26_ >> 16, i_25_ >> 16);
					i_25_ += i_27_;
					i_26_ += i_29_;
					i_23_ += anInt12075;
				}
			}
		}
	}

	void method11007() {
		int i = -1;
		int i_30_ = aByteArray12080.length - 8;
		while (i < i_30_) {
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
		}
		while (i < aByteArray12080.length - 1)
			aByteArray12080[++i] = (byte) 0;
	}

	Class536_Sub18_Sub7_Sub2(Class167_Sub2 class167_sub2, int i, int i_31_) {
		aByteArray12080 = new byte[i * i_31_];
	}

	void method11008(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		int i_37_ = 0;
		if (i_32_ != i)
			i_37_ = (i_35_ - i_34_ << 16) / (i_32_ - i);
		int i_38_ = 0;
		if (i_33_ != i_32_)
			i_38_ = (i_36_ - i_35_ << 16) / (i_33_ - i_32_);
		int i_39_ = 0;
		if (i_33_ != i)
			i_39_ = (i_34_ - i_36_ << 16) / (i - i_33_);
		if (i <= i_32_ && i <= i_33_) {
			if (i_32_ < i_33_) {
				i_36_ = i_34_ <<= 16;
				if (i < 0) {
					i_36_ -= i_39_ * i;
					i_34_ -= i_37_ * i;
					i = 0;
				}
				i_35_ <<= 16;
				if (i_32_ < 0) {
					i_35_ -= i_38_ * i_32_;
					i_32_ = 0;
				}
				if (i != i_32_ && i_39_ < i_37_ || i == i_32_ && i_39_ > i_38_) {
					i_33_ -= i_32_;
					i_32_ -= i;
					i *= anInt12075;
					while (--i_32_ >= 0) {
						method11003(aByteArray12080, i, 0, i_36_ >> 16, i_34_ >> 16);
						i_36_ += i_39_;
						i_34_ += i_37_;
						i += anInt12075;
					}
					while (--i_33_ >= 0) {
						method11003(aByteArray12080, i, 0, i_36_ >> 16, i_35_ >> 16);
						i_36_ += i_39_;
						i_35_ += i_38_;
						i += anInt12075;
					}
				} else {
					i_33_ -= i_32_;
					i_32_ -= i;
					i *= anInt12075;
					while (--i_32_ >= 0) {
						method11003(aByteArray12080, i, 0, i_34_ >> 16, i_36_ >> 16);
						i_36_ += i_39_;
						i_34_ += i_37_;
						i += anInt12075;
					}
					while (--i_33_ >= 0) {
						method11003(aByteArray12080, i, 0, i_35_ >> 16, i_36_ >> 16);
						i_36_ += i_39_;
						i_35_ += i_38_;
						i += anInt12075;
					}
				}
			} else {
				i_35_ = i_34_ <<= 16;
				if (i < 0) {
					i_35_ -= i_39_ * i;
					i_34_ -= i_37_ * i;
					i = 0;
				}
				i_36_ <<= 16;
				if (i_33_ < 0) {
					i_36_ -= i_38_ * i_33_;
					i_33_ = 0;
				}
				if (i != i_33_ && i_39_ < i_37_ || i == i_33_ && i_38_ > i_37_) {
					i_32_ -= i_33_;
					i_33_ -= i;
					i *= anInt12075;
					while (--i_33_ >= 0) {
						method11003(aByteArray12080, i, 0, i_35_ >> 16, i_34_ >> 16);
						i_35_ += i_39_;
						i_34_ += i_37_;
						i += anInt12075;
					}
					while (--i_32_ >= 0) {
						method11003(aByteArray12080, i, 0, i_36_ >> 16, i_34_ >> 16);
						i_36_ += i_38_;
						i_34_ += i_37_;
						i += anInt12075;
					}
				} else {
					i_32_ -= i_33_;
					i_33_ -= i;
					i *= anInt12075;
					while (--i_33_ >= 0) {
						method11003(aByteArray12080, i, 0, i_34_ >> 16, i_35_ >> 16);
						i_35_ += i_39_;
						i_34_ += i_37_;
						i += anInt12075;
					}
					while (--i_32_ >= 0) {
						method11003(aByteArray12080, i, 0, i_34_ >> 16, i_36_ >> 16);
						i_36_ += i_38_;
						i_34_ += i_37_;
						i += anInt12075;
					}
				}
			}
		} else if (i_32_ <= i_33_) {
			if (i_33_ < i) {
				i_34_ = i_35_ <<= 16;
				if (i_32_ < 0) {
					i_34_ -= i_37_ * i_32_;
					i_35_ -= i_38_ * i_32_;
					i_32_ = 0;
				}
				i_36_ <<= 16;
				if (i_33_ < 0) {
					i_36_ -= i_39_ * i_33_;
					i_33_ = 0;
				}
				if (i_32_ != i_33_ && i_37_ < i_38_ || i_32_ == i_33_ && i_37_ > i_39_) {
					i -= i_33_;
					i_33_ -= i_32_;
					i_32_ *= anInt12075;
					while (--i_33_ >= 0) {
						method11003(aByteArray12080, i_32_, 0, i_34_ >> 16, i_35_ >> 16);
						i_34_ += i_37_;
						i_35_ += i_38_;
						i_32_ += anInt12075;
					}
					while (--i >= 0) {
						method11003(aByteArray12080, i_32_, 0, i_34_ >> 16, i_36_ >> 16);
						i_34_ += i_37_;
						i_36_ += i_39_;
						i_32_ += anInt12075;
					}
				} else {
					i -= i_33_;
					i_33_ -= i_32_;
					i_32_ *= anInt12075;
					while (--i_33_ >= 0) {
						method11003(aByteArray12080, i_32_, 0, i_35_ >> 16, i_34_ >> 16);
						i_34_ += i_37_;
						i_35_ += i_38_;
						i_32_ += anInt12075;
					}
					while (--i >= 0) {
						method11003(aByteArray12080, i_32_, 0, i_36_ >> 16, i_34_ >> 16);
						i_34_ += i_37_;
						i_36_ += i_39_;
						i_32_ += anInt12075;
					}
				}
			} else {
				i_36_ = i_35_ <<= 16;
				if (i_32_ < 0) {
					i_36_ -= i_37_ * i_32_;
					i_35_ -= i_38_ * i_32_;
					i_32_ = 0;
				}
				i_34_ <<= 16;
				if (i < 0) {
					i_34_ -= i_39_ * i;
					i = 0;
				}
				if (i_37_ < i_38_) {
					i_33_ -= i;
					i -= i_32_;
					i_32_ *= anInt12075;
					while (--i >= 0) {
						method11003(aByteArray12080, i_32_, 0, i_36_ >> 16, i_35_ >> 16);
						i_36_ += i_37_;
						i_35_ += i_38_;
						i_32_ += anInt12075;
					}
					while (--i_33_ >= 0) {
						method11003(aByteArray12080, i_32_, 0, i_34_ >> 16, i_35_ >> 16);
						i_34_ += i_39_;
						i_35_ += i_38_;
						i_32_ += anInt12075;
					}
				} else {
					i_33_ -= i;
					i -= i_32_;
					i_32_ *= anInt12075;
					while (--i >= 0) {
						method11003(aByteArray12080, i_32_, 0, i_35_ >> 16, i_36_ >> 16);
						i_36_ += i_37_;
						i_35_ += i_38_;
						i_32_ += anInt12075;
					}
					while (--i_33_ >= 0) {
						method11003(aByteArray12080, i_32_, 0, i_35_ >> 16, i_34_ >> 16);
						i_34_ += i_39_;
						i_35_ += i_38_;
						i_32_ += anInt12075;
					}
				}
			}
		} else if (i < i_32_) {
			i_35_ = i_36_ <<= 16;
			if (i_33_ < 0) {
				i_35_ -= i_38_ * i_33_;
				i_36_ -= i_39_ * i_33_;
				i_33_ = 0;
			}
			i_34_ <<= 16;
			if (i < 0) {
				i_34_ -= i_37_ * i;
				i = 0;
			}
			if (i_38_ < i_39_) {
				i_32_ -= i;
				i -= i_33_;
				i_33_ *= anInt12075;
				while (--i >= 0) {
					method11003(aByteArray12080, i_33_, 0, i_35_ >> 16, i_36_ >> 16);
					i_35_ += i_38_;
					i_36_ += i_39_;
					i_33_ += anInt12075;
				}
				while (--i_32_ >= 0) {
					method11003(aByteArray12080, i_33_, 0, i_35_ >> 16, i_34_ >> 16);
					i_35_ += i_38_;
					i_34_ += i_37_;
					i_33_ += anInt12075;
				}
			} else {
				i_32_ -= i;
				i -= i_33_;
				i_33_ *= anInt12075;
				while (--i >= 0) {
					method11003(aByteArray12080, i_33_, 0, i_36_ >> 16, i_35_ >> 16);
					i_35_ += i_38_;
					i_36_ += i_39_;
					i_33_ += anInt12075;
				}
				while (--i_32_ >= 0) {
					method11003(aByteArray12080, i_33_, 0, i_34_ >> 16, i_35_ >> 16);
					i_35_ += i_38_;
					i_34_ += i_37_;
					i_33_ += anInt12075;
				}
			}
		} else {
			i_34_ = i_36_ <<= 16;
			if (i_33_ < 0) {
				i_34_ -= i_38_ * i_33_;
				i_36_ -= i_39_ * i_33_;
				i_33_ = 0;
			}
			i_35_ <<= 16;
			if (i_32_ < 0) {
				i_35_ -= i_37_ * i_32_;
				i_32_ = 0;
			}
			if (i_38_ < i_39_) {
				i -= i_32_;
				i_32_ -= i_33_;
				i_33_ *= anInt12075;
				while (--i_32_ >= 0) {
					method11003(aByteArray12080, i_33_, 0, i_34_ >> 16, i_36_ >> 16);
					i_34_ += i_38_;
					i_36_ += i_39_;
					i_33_ += anInt12075;
				}
				while (--i >= 0) {
					method11003(aByteArray12080, i_33_, 0, i_35_ >> 16, i_36_ >> 16);
					i_35_ += i_37_;
					i_36_ += i_39_;
					i_33_ += anInt12075;
				}
			} else {
				i -= i_32_;
				i_32_ -= i_33_;
				i_33_ *= anInt12075;
				while (--i_32_ >= 0) {
					method11003(aByteArray12080, i_33_, 0, i_36_ >> 16, i_34_ >> 16);
					i_34_ += i_38_;
					i_36_ += i_39_;
					i_33_ += anInt12075;
				}
				while (--i >= 0) {
					method11003(aByteArray12080, i_33_, 0, i_36_ >> 16, i_35_ >> 16);
					i_35_ += i_37_;
					i_36_ += i_39_;
					i_33_ += anInt12075;
				}
			}
		}
	}

	void method11009() {
		int i = -1;
		int i_40_ = aByteArray12080.length - 8;
		while (i < i_40_) {
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
			aByteArray12080[++i] = (byte) 0;
		}
		while (i < aByteArray12080.length - 1)
			aByteArray12080[++i] = (byte) 0;
	}

	static final void method11010(byte[] is, int i, int i_41_, int i_42_, int i_43_) {
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
