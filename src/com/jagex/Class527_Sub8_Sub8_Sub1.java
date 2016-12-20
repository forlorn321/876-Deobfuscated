/* Class527_Sub8_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub8_Sub1 extends Class527_Sub8_Sub8 {
	int anInt12048;
	int anInt12049;
	int anInt12050;
	int anInt12051;
	static final int anInt12052 = 16;
	byte[] aByteArray12053;

	static final void method18706(byte[] is, int i, int i_0_, int i_1_, int i_2_) {
		if (i_1_ < i_2_) {
			i += i_1_;
			i_0_ = i_2_ - i_1_ >> 2;
			while (--i_0_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_0_ = i_2_ - i_1_ & 0x3;
			while (--i_0_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method18707(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		int i_8_ = 0;
		if (i_3_ != i)
			i_8_ = (i_6_ - i_5_ << 16) / (i_3_ - i);
		int i_9_ = 0;
		if (i_4_ != i_3_)
			i_9_ = (i_7_ - i_6_ << 16) / (i_4_ - i_3_);
		int i_10_ = 0;
		if (i_4_ != i)
			i_10_ = (i_5_ - i_7_ << 16) / (i - i_4_);
		if (i <= i_3_ && i <= i_4_) {
			if (i_3_ < i_4_) {
				i_7_ = i_5_ <<= 16;
				if (i < 0) {
					i_7_ -= i_10_ * i;
					i_5_ -= i_8_ * i;
					i = 0;
				}
				i_6_ <<= 16;
				if (i_3_ < 0) {
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				if (i != i_3_ && i_10_ < i_8_ || i == i_3_ && i_10_ > i_9_) {
					i_4_ -= i_3_;
					i_3_ -= i;
					i *= anInt12049;
					while (--i_3_ >= 0) {
						method18706(aByteArray12053, i, 0, i_7_ >> 16, i_5_ >> 16);
						i_7_ += i_10_;
						i_5_ += i_8_;
						i += anInt12049;
					}
					while (--i_4_ >= 0) {
						method18706(aByteArray12053, i, 0, i_7_ >> 16, i_6_ >> 16);
						i_7_ += i_10_;
						i_6_ += i_9_;
						i += anInt12049;
					}
				} else {
					i_4_ -= i_3_;
					i_3_ -= i;
					i *= anInt12049;
					while (--i_3_ >= 0) {
						method18706(aByteArray12053, i, 0, i_5_ >> 16, i_7_ >> 16);
						i_7_ += i_10_;
						i_5_ += i_8_;
						i += anInt12049;
					}
					while (--i_4_ >= 0) {
						method18706(aByteArray12053, i, 0, i_6_ >> 16, i_7_ >> 16);
						i_7_ += i_10_;
						i_6_ += i_9_;
						i += anInt12049;
					}
				}
			} else {
				i_6_ = i_5_ <<= 16;
				if (i < 0) {
					i_6_ -= i_10_ * i;
					i_5_ -= i_8_ * i;
					i = 0;
				}
				i_7_ <<= 16;
				if (i_4_ < 0) {
					i_7_ -= i_9_ * i_4_;
					i_4_ = 0;
				}
				if (i != i_4_ && i_10_ < i_8_ || i == i_4_ && i_9_ > i_8_) {
					i_3_ -= i_4_;
					i_4_ -= i;
					i *= anInt12049;
					while (--i_4_ >= 0) {
						method18706(aByteArray12053, i, 0, i_6_ >> 16, i_5_ >> 16);
						i_6_ += i_10_;
						i_5_ += i_8_;
						i += anInt12049;
					}
					while (--i_3_ >= 0) {
						method18706(aByteArray12053, i, 0, i_7_ >> 16, i_5_ >> 16);
						i_7_ += i_9_;
						i_5_ += i_8_;
						i += anInt12049;
					}
				} else {
					i_3_ -= i_4_;
					i_4_ -= i;
					i *= anInt12049;
					while (--i_4_ >= 0) {
						method18706(aByteArray12053, i, 0, i_5_ >> 16, i_6_ >> 16);
						i_6_ += i_10_;
						i_5_ += i_8_;
						i += anInt12049;
					}
					while (--i_3_ >= 0) {
						method18706(aByteArray12053, i, 0, i_5_ >> 16, i_7_ >> 16);
						i_7_ += i_9_;
						i_5_ += i_8_;
						i += anInt12049;
					}
				}
			}
		} else if (i_3_ <= i_4_) {
			if (i_4_ < i) {
				i_5_ = i_6_ <<= 16;
				if (i_3_ < 0) {
					i_5_ -= i_8_ * i_3_;
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				i_7_ <<= 16;
				if (i_4_ < 0) {
					i_7_ -= i_10_ * i_4_;
					i_4_ = 0;
				}
				if (i_3_ != i_4_ && i_8_ < i_9_ || i_3_ == i_4_ && i_8_ > i_10_) {
					i -= i_4_;
					i_4_ -= i_3_;
					i_3_ *= anInt12049;
					while (--i_4_ >= 0) {
						method18706(aByteArray12053, i_3_, 0, i_5_ >> 16, i_6_ >> 16);
						i_5_ += i_8_;
						i_6_ += i_9_;
						i_3_ += anInt12049;
					}
					while (--i >= 0) {
						method18706(aByteArray12053, i_3_, 0, i_5_ >> 16, i_7_ >> 16);
						i_5_ += i_8_;
						i_7_ += i_10_;
						i_3_ += anInt12049;
					}
				} else {
					i -= i_4_;
					i_4_ -= i_3_;
					i_3_ *= anInt12049;
					while (--i_4_ >= 0) {
						method18706(aByteArray12053, i_3_, 0, i_6_ >> 16, i_5_ >> 16);
						i_5_ += i_8_;
						i_6_ += i_9_;
						i_3_ += anInt12049;
					}
					while (--i >= 0) {
						method18706(aByteArray12053, i_3_, 0, i_7_ >> 16, i_5_ >> 16);
						i_5_ += i_8_;
						i_7_ += i_10_;
						i_3_ += anInt12049;
					}
				}
			} else {
				i_7_ = i_6_ <<= 16;
				if (i_3_ < 0) {
					i_7_ -= i_8_ * i_3_;
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				i_5_ <<= 16;
				if (i < 0) {
					i_5_ -= i_10_ * i;
					i = 0;
				}
				if (i_8_ < i_9_) {
					i_4_ -= i;
					i -= i_3_;
					i_3_ *= anInt12049;
					while (--i >= 0) {
						method18706(aByteArray12053, i_3_, 0, i_7_ >> 16, i_6_ >> 16);
						i_7_ += i_8_;
						i_6_ += i_9_;
						i_3_ += anInt12049;
					}
					while (--i_4_ >= 0) {
						method18706(aByteArray12053, i_3_, 0, i_5_ >> 16, i_6_ >> 16);
						i_5_ += i_10_;
						i_6_ += i_9_;
						i_3_ += anInt12049;
					}
				} else {
					i_4_ -= i;
					i -= i_3_;
					i_3_ *= anInt12049;
					while (--i >= 0) {
						method18706(aByteArray12053, i_3_, 0, i_6_ >> 16, i_7_ >> 16);
						i_7_ += i_8_;
						i_6_ += i_9_;
						i_3_ += anInt12049;
					}
					while (--i_4_ >= 0) {
						method18706(aByteArray12053, i_3_, 0, i_6_ >> 16, i_5_ >> 16);
						i_5_ += i_10_;
						i_6_ += i_9_;
						i_3_ += anInt12049;
					}
				}
			}
		} else if (i < i_3_) {
			i_6_ = i_7_ <<= 16;
			if (i_4_ < 0) {
				i_6_ -= i_9_ * i_4_;
				i_7_ -= i_10_ * i_4_;
				i_4_ = 0;
			}
			i_5_ <<= 16;
			if (i < 0) {
				i_5_ -= i_8_ * i;
				i = 0;
			}
			if (i_9_ < i_10_) {
				i_3_ -= i;
				i -= i_4_;
				i_4_ *= anInt12049;
				while (--i >= 0) {
					method18706(aByteArray12053, i_4_, 0, i_6_ >> 16, i_7_ >> 16);
					i_6_ += i_9_;
					i_7_ += i_10_;
					i_4_ += anInt12049;
				}
				while (--i_3_ >= 0) {
					method18706(aByteArray12053, i_4_, 0, i_6_ >> 16, i_5_ >> 16);
					i_6_ += i_9_;
					i_5_ += i_8_;
					i_4_ += anInt12049;
				}
			} else {
				i_3_ -= i;
				i -= i_4_;
				i_4_ *= anInt12049;
				while (--i >= 0) {
					method18706(aByteArray12053, i_4_, 0, i_7_ >> 16, i_6_ >> 16);
					i_6_ += i_9_;
					i_7_ += i_10_;
					i_4_ += anInt12049;
				}
				while (--i_3_ >= 0) {
					method18706(aByteArray12053, i_4_, 0, i_5_ >> 16, i_6_ >> 16);
					i_6_ += i_9_;
					i_5_ += i_8_;
					i_4_ += anInt12049;
				}
			}
		} else {
			i_5_ = i_7_ <<= 16;
			if (i_4_ < 0) {
				i_5_ -= i_9_ * i_4_;
				i_7_ -= i_10_ * i_4_;
				i_4_ = 0;
			}
			i_6_ <<= 16;
			if (i_3_ < 0) {
				i_6_ -= i_8_ * i_3_;
				i_3_ = 0;
			}
			if (i_9_ < i_10_) {
				i -= i_3_;
				i_3_ -= i_4_;
				i_4_ *= anInt12049;
				while (--i_3_ >= 0) {
					method18706(aByteArray12053, i_4_, 0, i_5_ >> 16, i_7_ >> 16);
					i_5_ += i_9_;
					i_7_ += i_10_;
					i_4_ += anInt12049;
				}
				while (--i >= 0) {
					method18706(aByteArray12053, i_4_, 0, i_6_ >> 16, i_7_ >> 16);
					i_6_ += i_8_;
					i_7_ += i_10_;
					i_4_ += anInt12049;
				}
			} else {
				i -= i_3_;
				i_3_ -= i_4_;
				i_4_ *= anInt12049;
				while (--i_3_ >= 0) {
					method18706(aByteArray12053, i_4_, 0, i_7_ >> 16, i_5_ >> 16);
					i_5_ += i_9_;
					i_7_ += i_10_;
					i_4_ += anInt12049;
				}
				while (--i >= 0) {
					method18706(aByteArray12053, i_4_, 0, i_7_ >> 16, i_6_ >> 16);
					i_6_ += i_8_;
					i_7_ += i_10_;
					i_4_ += anInt12049;
				}
			}
		}
	}

	boolean method18708(int i, int i_11_) {
		return aByteArray12053.length >= i * i_11_;
	}

	void method18709() {
		int i = -1;
		int i_12_ = aByteArray12053.length - 8;
		while (i < i_12_) {
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
		}
		while (i < aByteArray12053.length - 1)
			aByteArray12053[++i] = (byte) 0;
	}

	Class527_Sub8_Sub8_Sub1(Class180_Sub3 class180_sub3, int i, int i_13_) {
		aByteArray12053 = new byte[i * i_13_];
	}

	void method18710() {
		int i = -1;
		int i_14_ = aByteArray12053.length - 8;
		while (i < i_14_) {
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
			aByteArray12053[++i] = (byte) 0;
		}
		while (i < aByteArray12053.length - 1)
			aByteArray12053[++i] = (byte) 0;
	}

	void method18711(int i, int i_15_, int i_16_, int i_17_) {
		anInt12051 = i;
		anInt12050 = i_15_;
		anInt12049 = i_16_ - i;
		anInt12048 = i_17_ - i_15_;
	}

	void method18712(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		int i_23_ = 0;
		if (i_18_ != i)
			i_23_ = (i_21_ - i_20_ << 16) / (i_18_ - i);
		int i_24_ = 0;
		if (i_19_ != i_18_)
			i_24_ = (i_22_ - i_21_ << 16) / (i_19_ - i_18_);
		int i_25_ = 0;
		if (i_19_ != i)
			i_25_ = (i_20_ - i_22_ << 16) / (i - i_19_);
		if (i <= i_18_ && i <= i_19_) {
			if (i_18_ < i_19_) {
				i_22_ = i_20_ <<= 16;
				if (i < 0) {
					i_22_ -= i_25_ * i;
					i_20_ -= i_23_ * i;
					i = 0;
				}
				i_21_ <<= 16;
				if (i_18_ < 0) {
					i_21_ -= i_24_ * i_18_;
					i_18_ = 0;
				}
				if (i != i_18_ && i_25_ < i_23_ || i == i_18_ && i_25_ > i_24_) {
					i_19_ -= i_18_;
					i_18_ -= i;
					i *= anInt12049;
					while (--i_18_ >= 0) {
						method18706(aByteArray12053, i, 0, i_22_ >> 16, i_20_ >> 16);
						i_22_ += i_25_;
						i_20_ += i_23_;
						i += anInt12049;
					}
					while (--i_19_ >= 0) {
						method18706(aByteArray12053, i, 0, i_22_ >> 16, i_21_ >> 16);
						i_22_ += i_25_;
						i_21_ += i_24_;
						i += anInt12049;
					}
				} else {
					i_19_ -= i_18_;
					i_18_ -= i;
					i *= anInt12049;
					while (--i_18_ >= 0) {
						method18706(aByteArray12053, i, 0, i_20_ >> 16, i_22_ >> 16);
						i_22_ += i_25_;
						i_20_ += i_23_;
						i += anInt12049;
					}
					while (--i_19_ >= 0) {
						method18706(aByteArray12053, i, 0, i_21_ >> 16, i_22_ >> 16);
						i_22_ += i_25_;
						i_21_ += i_24_;
						i += anInt12049;
					}
				}
			} else {
				i_21_ = i_20_ <<= 16;
				if (i < 0) {
					i_21_ -= i_25_ * i;
					i_20_ -= i_23_ * i;
					i = 0;
				}
				i_22_ <<= 16;
				if (i_19_ < 0) {
					i_22_ -= i_24_ * i_19_;
					i_19_ = 0;
				}
				if (i != i_19_ && i_25_ < i_23_ || i == i_19_ && i_24_ > i_23_) {
					i_18_ -= i_19_;
					i_19_ -= i;
					i *= anInt12049;
					while (--i_19_ >= 0) {
						method18706(aByteArray12053, i, 0, i_21_ >> 16, i_20_ >> 16);
						i_21_ += i_25_;
						i_20_ += i_23_;
						i += anInt12049;
					}
					while (--i_18_ >= 0) {
						method18706(aByteArray12053, i, 0, i_22_ >> 16, i_20_ >> 16);
						i_22_ += i_24_;
						i_20_ += i_23_;
						i += anInt12049;
					}
				} else {
					i_18_ -= i_19_;
					i_19_ -= i;
					i *= anInt12049;
					while (--i_19_ >= 0) {
						method18706(aByteArray12053, i, 0, i_20_ >> 16, i_21_ >> 16);
						i_21_ += i_25_;
						i_20_ += i_23_;
						i += anInt12049;
					}
					while (--i_18_ >= 0) {
						method18706(aByteArray12053, i, 0, i_20_ >> 16, i_22_ >> 16);
						i_22_ += i_24_;
						i_20_ += i_23_;
						i += anInt12049;
					}
				}
			}
		} else if (i_18_ <= i_19_) {
			if (i_19_ < i) {
				i_20_ = i_21_ <<= 16;
				if (i_18_ < 0) {
					i_20_ -= i_23_ * i_18_;
					i_21_ -= i_24_ * i_18_;
					i_18_ = 0;
				}
				i_22_ <<= 16;
				if (i_19_ < 0) {
					i_22_ -= i_25_ * i_19_;
					i_19_ = 0;
				}
				if (i_18_ != i_19_ && i_23_ < i_24_ || i_18_ == i_19_ && i_23_ > i_25_) {
					i -= i_19_;
					i_19_ -= i_18_;
					i_18_ *= anInt12049;
					while (--i_19_ >= 0) {
						method18706(aByteArray12053, i_18_, 0, i_20_ >> 16, i_21_ >> 16);
						i_20_ += i_23_;
						i_21_ += i_24_;
						i_18_ += anInt12049;
					}
					while (--i >= 0) {
						method18706(aByteArray12053, i_18_, 0, i_20_ >> 16, i_22_ >> 16);
						i_20_ += i_23_;
						i_22_ += i_25_;
						i_18_ += anInt12049;
					}
				} else {
					i -= i_19_;
					i_19_ -= i_18_;
					i_18_ *= anInt12049;
					while (--i_19_ >= 0) {
						method18706(aByteArray12053, i_18_, 0, i_21_ >> 16, i_20_ >> 16);
						i_20_ += i_23_;
						i_21_ += i_24_;
						i_18_ += anInt12049;
					}
					while (--i >= 0) {
						method18706(aByteArray12053, i_18_, 0, i_22_ >> 16, i_20_ >> 16);
						i_20_ += i_23_;
						i_22_ += i_25_;
						i_18_ += anInt12049;
					}
				}
			} else {
				i_22_ = i_21_ <<= 16;
				if (i_18_ < 0) {
					i_22_ -= i_23_ * i_18_;
					i_21_ -= i_24_ * i_18_;
					i_18_ = 0;
				}
				i_20_ <<= 16;
				if (i < 0) {
					i_20_ -= i_25_ * i;
					i = 0;
				}
				if (i_23_ < i_24_) {
					i_19_ -= i;
					i -= i_18_;
					i_18_ *= anInt12049;
					while (--i >= 0) {
						method18706(aByteArray12053, i_18_, 0, i_22_ >> 16, i_21_ >> 16);
						i_22_ += i_23_;
						i_21_ += i_24_;
						i_18_ += anInt12049;
					}
					while (--i_19_ >= 0) {
						method18706(aByteArray12053, i_18_, 0, i_20_ >> 16, i_21_ >> 16);
						i_20_ += i_25_;
						i_21_ += i_24_;
						i_18_ += anInt12049;
					}
				} else {
					i_19_ -= i;
					i -= i_18_;
					i_18_ *= anInt12049;
					while (--i >= 0) {
						method18706(aByteArray12053, i_18_, 0, i_21_ >> 16, i_22_ >> 16);
						i_22_ += i_23_;
						i_21_ += i_24_;
						i_18_ += anInt12049;
					}
					while (--i_19_ >= 0) {
						method18706(aByteArray12053, i_18_, 0, i_21_ >> 16, i_20_ >> 16);
						i_20_ += i_25_;
						i_21_ += i_24_;
						i_18_ += anInt12049;
					}
				}
			}
		} else if (i < i_18_) {
			i_21_ = i_22_ <<= 16;
			if (i_19_ < 0) {
				i_21_ -= i_24_ * i_19_;
				i_22_ -= i_25_ * i_19_;
				i_19_ = 0;
			}
			i_20_ <<= 16;
			if (i < 0) {
				i_20_ -= i_23_ * i;
				i = 0;
			}
			if (i_24_ < i_25_) {
				i_18_ -= i;
				i -= i_19_;
				i_19_ *= anInt12049;
				while (--i >= 0) {
					method18706(aByteArray12053, i_19_, 0, i_21_ >> 16, i_22_ >> 16);
					i_21_ += i_24_;
					i_22_ += i_25_;
					i_19_ += anInt12049;
				}
				while (--i_18_ >= 0) {
					method18706(aByteArray12053, i_19_, 0, i_21_ >> 16, i_20_ >> 16);
					i_21_ += i_24_;
					i_20_ += i_23_;
					i_19_ += anInt12049;
				}
			} else {
				i_18_ -= i;
				i -= i_19_;
				i_19_ *= anInt12049;
				while (--i >= 0) {
					method18706(aByteArray12053, i_19_, 0, i_22_ >> 16, i_21_ >> 16);
					i_21_ += i_24_;
					i_22_ += i_25_;
					i_19_ += anInt12049;
				}
				while (--i_18_ >= 0) {
					method18706(aByteArray12053, i_19_, 0, i_20_ >> 16, i_21_ >> 16);
					i_21_ += i_24_;
					i_20_ += i_23_;
					i_19_ += anInt12049;
				}
			}
		} else {
			i_20_ = i_22_ <<= 16;
			if (i_19_ < 0) {
				i_20_ -= i_24_ * i_19_;
				i_22_ -= i_25_ * i_19_;
				i_19_ = 0;
			}
			i_21_ <<= 16;
			if (i_18_ < 0) {
				i_21_ -= i_23_ * i_18_;
				i_18_ = 0;
			}
			if (i_24_ < i_25_) {
				i -= i_18_;
				i_18_ -= i_19_;
				i_19_ *= anInt12049;
				while (--i_18_ >= 0) {
					method18706(aByteArray12053, i_19_, 0, i_20_ >> 16, i_22_ >> 16);
					i_20_ += i_24_;
					i_22_ += i_25_;
					i_19_ += anInt12049;
				}
				while (--i >= 0) {
					method18706(aByteArray12053, i_19_, 0, i_21_ >> 16, i_22_ >> 16);
					i_21_ += i_23_;
					i_22_ += i_25_;
					i_19_ += anInt12049;
				}
			} else {
				i -= i_18_;
				i_18_ -= i_19_;
				i_19_ *= anInt12049;
				while (--i_18_ >= 0) {
					method18706(aByteArray12053, i_19_, 0, i_22_ >> 16, i_20_ >> 16);
					i_20_ += i_24_;
					i_22_ += i_25_;
					i_19_ += anInt12049;
				}
				while (--i >= 0) {
					method18706(aByteArray12053, i_19_, 0, i_22_ >> 16, i_21_ >> 16);
					i_21_ += i_23_;
					i_22_ += i_25_;
					i_19_ += anInt12049;
				}
			}
		}
	}

	void method18713(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		int i_31_ = 0;
		if (i_26_ != i)
			i_31_ = (i_29_ - i_28_ << 16) / (i_26_ - i);
		int i_32_ = 0;
		if (i_27_ != i_26_)
			i_32_ = (i_30_ - i_29_ << 16) / (i_27_ - i_26_);
		int i_33_ = 0;
		if (i_27_ != i)
			i_33_ = (i_28_ - i_30_ << 16) / (i - i_27_);
		if (i <= i_26_ && i <= i_27_) {
			if (i_26_ < i_27_) {
				i_30_ = i_28_ <<= 16;
				if (i < 0) {
					i_30_ -= i_33_ * i;
					i_28_ -= i_31_ * i;
					i = 0;
				}
				i_29_ <<= 16;
				if (i_26_ < 0) {
					i_29_ -= i_32_ * i_26_;
					i_26_ = 0;
				}
				if (i != i_26_ && i_33_ < i_31_ || i == i_26_ && i_33_ > i_32_) {
					i_27_ -= i_26_;
					i_26_ -= i;
					i *= anInt12049;
					while (--i_26_ >= 0) {
						method18706(aByteArray12053, i, 0, i_30_ >> 16, i_28_ >> 16);
						i_30_ += i_33_;
						i_28_ += i_31_;
						i += anInt12049;
					}
					while (--i_27_ >= 0) {
						method18706(aByteArray12053, i, 0, i_30_ >> 16, i_29_ >> 16);
						i_30_ += i_33_;
						i_29_ += i_32_;
						i += anInt12049;
					}
				} else {
					i_27_ -= i_26_;
					i_26_ -= i;
					i *= anInt12049;
					while (--i_26_ >= 0) {
						method18706(aByteArray12053, i, 0, i_28_ >> 16, i_30_ >> 16);
						i_30_ += i_33_;
						i_28_ += i_31_;
						i += anInt12049;
					}
					while (--i_27_ >= 0) {
						method18706(aByteArray12053, i, 0, i_29_ >> 16, i_30_ >> 16);
						i_30_ += i_33_;
						i_29_ += i_32_;
						i += anInt12049;
					}
				}
			} else {
				i_29_ = i_28_ <<= 16;
				if (i < 0) {
					i_29_ -= i_33_ * i;
					i_28_ -= i_31_ * i;
					i = 0;
				}
				i_30_ <<= 16;
				if (i_27_ < 0) {
					i_30_ -= i_32_ * i_27_;
					i_27_ = 0;
				}
				if (i != i_27_ && i_33_ < i_31_ || i == i_27_ && i_32_ > i_31_) {
					i_26_ -= i_27_;
					i_27_ -= i;
					i *= anInt12049;
					while (--i_27_ >= 0) {
						method18706(aByteArray12053, i, 0, i_29_ >> 16, i_28_ >> 16);
						i_29_ += i_33_;
						i_28_ += i_31_;
						i += anInt12049;
					}
					while (--i_26_ >= 0) {
						method18706(aByteArray12053, i, 0, i_30_ >> 16, i_28_ >> 16);
						i_30_ += i_32_;
						i_28_ += i_31_;
						i += anInt12049;
					}
				} else {
					i_26_ -= i_27_;
					i_27_ -= i;
					i *= anInt12049;
					while (--i_27_ >= 0) {
						method18706(aByteArray12053, i, 0, i_28_ >> 16, i_29_ >> 16);
						i_29_ += i_33_;
						i_28_ += i_31_;
						i += anInt12049;
					}
					while (--i_26_ >= 0) {
						method18706(aByteArray12053, i, 0, i_28_ >> 16, i_30_ >> 16);
						i_30_ += i_32_;
						i_28_ += i_31_;
						i += anInt12049;
					}
				}
			}
		} else if (i_26_ <= i_27_) {
			if (i_27_ < i) {
				i_28_ = i_29_ <<= 16;
				if (i_26_ < 0) {
					i_28_ -= i_31_ * i_26_;
					i_29_ -= i_32_ * i_26_;
					i_26_ = 0;
				}
				i_30_ <<= 16;
				if (i_27_ < 0) {
					i_30_ -= i_33_ * i_27_;
					i_27_ = 0;
				}
				if (i_26_ != i_27_ && i_31_ < i_32_ || i_26_ == i_27_ && i_31_ > i_33_) {
					i -= i_27_;
					i_27_ -= i_26_;
					i_26_ *= anInt12049;
					while (--i_27_ >= 0) {
						method18706(aByteArray12053, i_26_, 0, i_28_ >> 16, i_29_ >> 16);
						i_28_ += i_31_;
						i_29_ += i_32_;
						i_26_ += anInt12049;
					}
					while (--i >= 0) {
						method18706(aByteArray12053, i_26_, 0, i_28_ >> 16, i_30_ >> 16);
						i_28_ += i_31_;
						i_30_ += i_33_;
						i_26_ += anInt12049;
					}
				} else {
					i -= i_27_;
					i_27_ -= i_26_;
					i_26_ *= anInt12049;
					while (--i_27_ >= 0) {
						method18706(aByteArray12053, i_26_, 0, i_29_ >> 16, i_28_ >> 16);
						i_28_ += i_31_;
						i_29_ += i_32_;
						i_26_ += anInt12049;
					}
					while (--i >= 0) {
						method18706(aByteArray12053, i_26_, 0, i_30_ >> 16, i_28_ >> 16);
						i_28_ += i_31_;
						i_30_ += i_33_;
						i_26_ += anInt12049;
					}
				}
			} else {
				i_30_ = i_29_ <<= 16;
				if (i_26_ < 0) {
					i_30_ -= i_31_ * i_26_;
					i_29_ -= i_32_ * i_26_;
					i_26_ = 0;
				}
				i_28_ <<= 16;
				if (i < 0) {
					i_28_ -= i_33_ * i;
					i = 0;
				}
				if (i_31_ < i_32_) {
					i_27_ -= i;
					i -= i_26_;
					i_26_ *= anInt12049;
					while (--i >= 0) {
						method18706(aByteArray12053, i_26_, 0, i_30_ >> 16, i_29_ >> 16);
						i_30_ += i_31_;
						i_29_ += i_32_;
						i_26_ += anInt12049;
					}
					while (--i_27_ >= 0) {
						method18706(aByteArray12053, i_26_, 0, i_28_ >> 16, i_29_ >> 16);
						i_28_ += i_33_;
						i_29_ += i_32_;
						i_26_ += anInt12049;
					}
				} else {
					i_27_ -= i;
					i -= i_26_;
					i_26_ *= anInt12049;
					while (--i >= 0) {
						method18706(aByteArray12053, i_26_, 0, i_29_ >> 16, i_30_ >> 16);
						i_30_ += i_31_;
						i_29_ += i_32_;
						i_26_ += anInt12049;
					}
					while (--i_27_ >= 0) {
						method18706(aByteArray12053, i_26_, 0, i_29_ >> 16, i_28_ >> 16);
						i_28_ += i_33_;
						i_29_ += i_32_;
						i_26_ += anInt12049;
					}
				}
			}
		} else if (i < i_26_) {
			i_29_ = i_30_ <<= 16;
			if (i_27_ < 0) {
				i_29_ -= i_32_ * i_27_;
				i_30_ -= i_33_ * i_27_;
				i_27_ = 0;
			}
			i_28_ <<= 16;
			if (i < 0) {
				i_28_ -= i_31_ * i;
				i = 0;
			}
			if (i_32_ < i_33_) {
				i_26_ -= i;
				i -= i_27_;
				i_27_ *= anInt12049;
				while (--i >= 0) {
					method18706(aByteArray12053, i_27_, 0, i_29_ >> 16, i_30_ >> 16);
					i_29_ += i_32_;
					i_30_ += i_33_;
					i_27_ += anInt12049;
				}
				while (--i_26_ >= 0) {
					method18706(aByteArray12053, i_27_, 0, i_29_ >> 16, i_28_ >> 16);
					i_29_ += i_32_;
					i_28_ += i_31_;
					i_27_ += anInt12049;
				}
			} else {
				i_26_ -= i;
				i -= i_27_;
				i_27_ *= anInt12049;
				while (--i >= 0) {
					method18706(aByteArray12053, i_27_, 0, i_30_ >> 16, i_29_ >> 16);
					i_29_ += i_32_;
					i_30_ += i_33_;
					i_27_ += anInt12049;
				}
				while (--i_26_ >= 0) {
					method18706(aByteArray12053, i_27_, 0, i_28_ >> 16, i_29_ >> 16);
					i_29_ += i_32_;
					i_28_ += i_31_;
					i_27_ += anInt12049;
				}
			}
		} else {
			i_28_ = i_30_ <<= 16;
			if (i_27_ < 0) {
				i_28_ -= i_32_ * i_27_;
				i_30_ -= i_33_ * i_27_;
				i_27_ = 0;
			}
			i_29_ <<= 16;
			if (i_26_ < 0) {
				i_29_ -= i_31_ * i_26_;
				i_26_ = 0;
			}
			if (i_32_ < i_33_) {
				i -= i_26_;
				i_26_ -= i_27_;
				i_27_ *= anInt12049;
				while (--i_26_ >= 0) {
					method18706(aByteArray12053, i_27_, 0, i_28_ >> 16, i_30_ >> 16);
					i_28_ += i_32_;
					i_30_ += i_33_;
					i_27_ += anInt12049;
				}
				while (--i >= 0) {
					method18706(aByteArray12053, i_27_, 0, i_29_ >> 16, i_30_ >> 16);
					i_29_ += i_31_;
					i_30_ += i_33_;
					i_27_ += anInt12049;
				}
			} else {
				i -= i_26_;
				i_26_ -= i_27_;
				i_27_ *= anInt12049;
				while (--i_26_ >= 0) {
					method18706(aByteArray12053, i_27_, 0, i_30_ >> 16, i_28_ >> 16);
					i_28_ += i_32_;
					i_30_ += i_33_;
					i_27_ += anInt12049;
				}
				while (--i >= 0) {
					method18706(aByteArray12053, i_27_, 0, i_30_ >> 16, i_29_ >> 16);
					i_29_ += i_31_;
					i_30_ += i_33_;
					i_27_ += anInt12049;
				}
			}
		}
	}

	static final void method18714(byte[] is, int i, int i_34_, int i_35_, int i_36_) {
		if (i_35_ < i_36_) {
			i += i_35_;
			i_34_ = i_36_ - i_35_ >> 2;
			while (--i_34_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_34_ = i_36_ - i_35_ & 0x3;
			while (--i_34_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	static final void method18715(byte[] is, int i, int i_37_, int i_38_, int i_39_) {
		if (i_38_ < i_39_) {
			i += i_38_;
			i_37_ = i_39_ - i_38_ >> 2;
			while (--i_37_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_37_ = i_39_ - i_38_ & 0x3;
			while (--i_37_ >= 0)
				is[i++] = (byte) 1;
		}
	}
}
