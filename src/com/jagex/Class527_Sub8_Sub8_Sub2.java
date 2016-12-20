/* Class527_Sub8_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub8_Sub2 extends Class527_Sub8_Sub8 {
	static final int anInt12079 = 16;
	int anInt12080;
	int anInt12081;
	int anInt12082;
	int anInt12083;
	byte[] aByteArray12084;

	static final void method18740(byte[] is, int i, int i_0_, int i_1_, int i_2_) {
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

	void method18741(int i, int i_3_, int i_4_, int i_5_) {
		anInt12082 = i;
		anInt12083 = i_3_;
		anInt12081 = i_4_ - i;
		anInt12080 = i_5_ - i_3_;
	}

	boolean method18742(int i, int i_6_) {
		return aByteArray12084.length >= i * i_6_;
	}

	void method18743() {
		int i = -1;
		int i_7_ = aByteArray12084.length - 8;
		while (i < i_7_) {
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
		}
		while (i < aByteArray12084.length - 1)
			aByteArray12084[++i] = (byte) 0;
	}

	void method18744(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = 0;
		if (i_8_ != i)
			i_13_ = (i_11_ - i_10_ << 16) / (i_8_ - i);
		int i_14_ = 0;
		if (i_9_ != i_8_)
			i_14_ = (i_12_ - i_11_ << 16) / (i_9_ - i_8_);
		int i_15_ = 0;
		if (i_9_ != i)
			i_15_ = (i_10_ - i_12_ << 16) / (i - i_9_);
		if (i <= i_8_ && i <= i_9_) {
			if (i_8_ < i_9_) {
				i_12_ = i_10_ <<= 16;
				if (i < 0) {
					i_12_ -= i_15_ * i;
					i_10_ -= i_13_ * i;
					i = 0;
				}
				i_11_ <<= 16;
				if (i_8_ < 0) {
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				if (i != i_8_ && i_15_ < i_13_ || i == i_8_ && i_15_ > i_14_) {
					i_9_ -= i_8_;
					i_8_ -= i;
					i *= anInt12081;
					while (--i_8_ >= 0) {
						method18745(aByteArray12084, i, 0, i_12_ >> 16, i_10_ >> 16);
						i_12_ += i_15_;
						i_10_ += i_13_;
						i += anInt12081;
					}
					while (--i_9_ >= 0) {
						method18745(aByteArray12084, i, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_15_;
						i_11_ += i_14_;
						i += anInt12081;
					}
				} else {
					i_9_ -= i_8_;
					i_8_ -= i;
					i *= anInt12081;
					while (--i_8_ >= 0) {
						method18745(aByteArray12084, i, 0, i_10_ >> 16, i_12_ >> 16);
						i_12_ += i_15_;
						i_10_ += i_13_;
						i += anInt12081;
					}
					while (--i_9_ >= 0) {
						method18745(aByteArray12084, i, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_15_;
						i_11_ += i_14_;
						i += anInt12081;
					}
				}
			} else {
				i_11_ = i_10_ <<= 16;
				if (i < 0) {
					i_11_ -= i_15_ * i;
					i_10_ -= i_13_ * i;
					i = 0;
				}
				i_12_ <<= 16;
				if (i_9_ < 0) {
					i_12_ -= i_14_ * i_9_;
					i_9_ = 0;
				}
				if (i != i_9_ && i_15_ < i_13_ || i == i_9_ && i_14_ > i_13_) {
					i_8_ -= i_9_;
					i_9_ -= i;
					i *= anInt12081;
					while (--i_9_ >= 0) {
						method18745(aByteArray12084, i, 0, i_11_ >> 16, i_10_ >> 16);
						i_11_ += i_15_;
						i_10_ += i_13_;
						i += anInt12081;
					}
					while (--i_8_ >= 0) {
						method18745(aByteArray12084, i, 0, i_12_ >> 16, i_10_ >> 16);
						i_12_ += i_14_;
						i_10_ += i_13_;
						i += anInt12081;
					}
				} else {
					i_8_ -= i_9_;
					i_9_ -= i;
					i *= anInt12081;
					while (--i_9_ >= 0) {
						method18745(aByteArray12084, i, 0, i_10_ >> 16, i_11_ >> 16);
						i_11_ += i_15_;
						i_10_ += i_13_;
						i += anInt12081;
					}
					while (--i_8_ >= 0) {
						method18745(aByteArray12084, i, 0, i_10_ >> 16, i_12_ >> 16);
						i_12_ += i_14_;
						i_10_ += i_13_;
						i += anInt12081;
					}
				}
			}
		} else if (i_8_ <= i_9_) {
			if (i_9_ < i) {
				i_10_ = i_11_ <<= 16;
				if (i_8_ < 0) {
					i_10_ -= i_13_ * i_8_;
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				i_12_ <<= 16;
				if (i_9_ < 0) {
					i_12_ -= i_15_ * i_9_;
					i_9_ = 0;
				}
				if (i_8_ != i_9_ && i_13_ < i_14_ || i_8_ == i_9_ && i_13_ > i_15_) {
					i -= i_9_;
					i_9_ -= i_8_;
					i_8_ *= anInt12081;
					while (--i_9_ >= 0) {
						method18745(aByteArray12084, i_8_, 0, i_10_ >> 16, i_11_ >> 16);
						i_10_ += i_13_;
						i_11_ += i_14_;
						i_8_ += anInt12081;
					}
					while (--i >= 0) {
						method18745(aByteArray12084, i_8_, 0, i_10_ >> 16, i_12_ >> 16);
						i_10_ += i_13_;
						i_12_ += i_15_;
						i_8_ += anInt12081;
					}
				} else {
					i -= i_9_;
					i_9_ -= i_8_;
					i_8_ *= anInt12081;
					while (--i_9_ >= 0) {
						method18745(aByteArray12084, i_8_, 0, i_11_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_11_ += i_14_;
						i_8_ += anInt12081;
					}
					while (--i >= 0) {
						method18745(aByteArray12084, i_8_, 0, i_12_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_12_ += i_15_;
						i_8_ += anInt12081;
					}
				}
			} else {
				i_12_ = i_11_ <<= 16;
				if (i_8_ < 0) {
					i_12_ -= i_13_ * i_8_;
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				i_10_ <<= 16;
				if (i < 0) {
					i_10_ -= i_15_ * i;
					i = 0;
				}
				if (i_13_ < i_14_) {
					i_9_ -= i;
					i -= i_8_;
					i_8_ *= anInt12081;
					while (--i >= 0) {
						method18745(aByteArray12084, i_8_, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_13_;
						i_11_ += i_14_;
						i_8_ += anInt12081;
					}
					while (--i_9_ >= 0) {
						method18745(aByteArray12084, i_8_, 0, i_10_ >> 16, i_11_ >> 16);
						i_10_ += i_15_;
						i_11_ += i_14_;
						i_8_ += anInt12081;
					}
				} else {
					i_9_ -= i;
					i -= i_8_;
					i_8_ *= anInt12081;
					while (--i >= 0) {
						method18745(aByteArray12084, i_8_, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_13_;
						i_11_ += i_14_;
						i_8_ += anInt12081;
					}
					while (--i_9_ >= 0) {
						method18745(aByteArray12084, i_8_, 0, i_11_ >> 16, i_10_ >> 16);
						i_10_ += i_15_;
						i_11_ += i_14_;
						i_8_ += anInt12081;
					}
				}
			}
		} else if (i < i_8_) {
			i_11_ = i_12_ <<= 16;
			if (i_9_ < 0) {
				i_11_ -= i_14_ * i_9_;
				i_12_ -= i_15_ * i_9_;
				i_9_ = 0;
			}
			i_10_ <<= 16;
			if (i < 0) {
				i_10_ -= i_13_ * i;
				i = 0;
			}
			if (i_14_ < i_15_) {
				i_8_ -= i;
				i -= i_9_;
				i_9_ *= anInt12081;
				while (--i >= 0) {
					method18745(aByteArray12084, i_9_, 0, i_11_ >> 16, i_12_ >> 16);
					i_11_ += i_14_;
					i_12_ += i_15_;
					i_9_ += anInt12081;
				}
				while (--i_8_ >= 0) {
					method18745(aByteArray12084, i_9_, 0, i_11_ >> 16, i_10_ >> 16);
					i_11_ += i_14_;
					i_10_ += i_13_;
					i_9_ += anInt12081;
				}
			} else {
				i_8_ -= i;
				i -= i_9_;
				i_9_ *= anInt12081;
				while (--i >= 0) {
					method18745(aByteArray12084, i_9_, 0, i_12_ >> 16, i_11_ >> 16);
					i_11_ += i_14_;
					i_12_ += i_15_;
					i_9_ += anInt12081;
				}
				while (--i_8_ >= 0) {
					method18745(aByteArray12084, i_9_, 0, i_10_ >> 16, i_11_ >> 16);
					i_11_ += i_14_;
					i_10_ += i_13_;
					i_9_ += anInt12081;
				}
			}
		} else {
			i_10_ = i_12_ <<= 16;
			if (i_9_ < 0) {
				i_10_ -= i_14_ * i_9_;
				i_12_ -= i_15_ * i_9_;
				i_9_ = 0;
			}
			i_11_ <<= 16;
			if (i_8_ < 0) {
				i_11_ -= i_13_ * i_8_;
				i_8_ = 0;
			}
			if (i_14_ < i_15_) {
				i -= i_8_;
				i_8_ -= i_9_;
				i_9_ *= anInt12081;
				while (--i_8_ >= 0) {
					method18745(aByteArray12084, i_9_, 0, i_10_ >> 16, i_12_ >> 16);
					i_10_ += i_14_;
					i_12_ += i_15_;
					i_9_ += anInt12081;
				}
				while (--i >= 0) {
					method18745(aByteArray12084, i_9_, 0, i_11_ >> 16, i_12_ >> 16);
					i_11_ += i_13_;
					i_12_ += i_15_;
					i_9_ += anInt12081;
				}
			} else {
				i -= i_8_;
				i_8_ -= i_9_;
				i_9_ *= anInt12081;
				while (--i_8_ >= 0) {
					method18745(aByteArray12084, i_9_, 0, i_12_ >> 16, i_10_ >> 16);
					i_10_ += i_14_;
					i_12_ += i_15_;
					i_9_ += anInt12081;
				}
				while (--i >= 0) {
					method18745(aByteArray12084, i_9_, 0, i_12_ >> 16, i_11_ >> 16);
					i_11_ += i_13_;
					i_12_ += i_15_;
					i_9_ += anInt12081;
				}
			}
		}
	}

	static final void method18745(byte[] is, int i, int i_16_, int i_17_, int i_18_) {
		if (i_17_ < i_18_) {
			i += i_17_;
			i_16_ = i_18_ - i_17_ >> 2;
			while (--i_16_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_16_ = i_18_ - i_17_ & 0x3;
			while (--i_16_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method18746(int i, int i_19_, int i_20_, int i_21_) {
		anInt12082 = i;
		anInt12083 = i_19_;
		anInt12081 = i_20_ - i;
		anInt12080 = i_21_ - i_19_;
	}

	static final void method18747(byte[] is, int i, int i_22_, int i_23_, int i_24_) {
		if (i_23_ < i_24_) {
			i += i_23_;
			i_22_ = i_24_ - i_23_ >> 2;
			while (--i_22_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_22_ = i_24_ - i_23_ & 0x3;
			while (--i_22_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method18748() {
		int i = -1;
		int i_25_ = aByteArray12084.length - 8;
		while (i < i_25_) {
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
		}
		while (i < aByteArray12084.length - 1)
			aByteArray12084[++i] = (byte) 0;
	}

	void method18749() {
		int i = -1;
		int i_26_ = aByteArray12084.length - 8;
		while (i < i_26_) {
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
			aByteArray12084[++i] = (byte) 0;
		}
		while (i < aByteArray12084.length - 1)
			aByteArray12084[++i] = (byte) 0;
	}

	Class527_Sub8_Sub8_Sub2(Class180_Sub2 class180_sub2, int i, int i_27_) {
		aByteArray12084 = new byte[i * i_27_];
	}

	boolean method18750(int i, int i_28_) {
		return aByteArray12084.length >= i * i_28_;
	}

	void method18751(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		int i_34_ = 0;
		if (i_29_ != i)
			i_34_ = (i_32_ - i_31_ << 16) / (i_29_ - i);
		int i_35_ = 0;
		if (i_30_ != i_29_)
			i_35_ = (i_33_ - i_32_ << 16) / (i_30_ - i_29_);
		int i_36_ = 0;
		if (i_30_ != i)
			i_36_ = (i_31_ - i_33_ << 16) / (i - i_30_);
		if (i <= i_29_ && i <= i_30_) {
			if (i_29_ < i_30_) {
				i_33_ = i_31_ <<= 16;
				if (i < 0) {
					i_33_ -= i_36_ * i;
					i_31_ -= i_34_ * i;
					i = 0;
				}
				i_32_ <<= 16;
				if (i_29_ < 0) {
					i_32_ -= i_35_ * i_29_;
					i_29_ = 0;
				}
				if (i != i_29_ && i_36_ < i_34_ || i == i_29_ && i_36_ > i_35_) {
					i_30_ -= i_29_;
					i_29_ -= i;
					i *= anInt12081;
					while (--i_29_ >= 0) {
						method18745(aByteArray12084, i, 0, i_33_ >> 16, i_31_ >> 16);
						i_33_ += i_36_;
						i_31_ += i_34_;
						i += anInt12081;
					}
					while (--i_30_ >= 0) {
						method18745(aByteArray12084, i, 0, i_33_ >> 16, i_32_ >> 16);
						i_33_ += i_36_;
						i_32_ += i_35_;
						i += anInt12081;
					}
				} else {
					i_30_ -= i_29_;
					i_29_ -= i;
					i *= anInt12081;
					while (--i_29_ >= 0) {
						method18745(aByteArray12084, i, 0, i_31_ >> 16, i_33_ >> 16);
						i_33_ += i_36_;
						i_31_ += i_34_;
						i += anInt12081;
					}
					while (--i_30_ >= 0) {
						method18745(aByteArray12084, i, 0, i_32_ >> 16, i_33_ >> 16);
						i_33_ += i_36_;
						i_32_ += i_35_;
						i += anInt12081;
					}
				}
			} else {
				i_32_ = i_31_ <<= 16;
				if (i < 0) {
					i_32_ -= i_36_ * i;
					i_31_ -= i_34_ * i;
					i = 0;
				}
				i_33_ <<= 16;
				if (i_30_ < 0) {
					i_33_ -= i_35_ * i_30_;
					i_30_ = 0;
				}
				if (i != i_30_ && i_36_ < i_34_ || i == i_30_ && i_35_ > i_34_) {
					i_29_ -= i_30_;
					i_30_ -= i;
					i *= anInt12081;
					while (--i_30_ >= 0) {
						method18745(aByteArray12084, i, 0, i_32_ >> 16, i_31_ >> 16);
						i_32_ += i_36_;
						i_31_ += i_34_;
						i += anInt12081;
					}
					while (--i_29_ >= 0) {
						method18745(aByteArray12084, i, 0, i_33_ >> 16, i_31_ >> 16);
						i_33_ += i_35_;
						i_31_ += i_34_;
						i += anInt12081;
					}
				} else {
					i_29_ -= i_30_;
					i_30_ -= i;
					i *= anInt12081;
					while (--i_30_ >= 0) {
						method18745(aByteArray12084, i, 0, i_31_ >> 16, i_32_ >> 16);
						i_32_ += i_36_;
						i_31_ += i_34_;
						i += anInt12081;
					}
					while (--i_29_ >= 0) {
						method18745(aByteArray12084, i, 0, i_31_ >> 16, i_33_ >> 16);
						i_33_ += i_35_;
						i_31_ += i_34_;
						i += anInt12081;
					}
				}
			}
		} else if (i_29_ <= i_30_) {
			if (i_30_ < i) {
				i_31_ = i_32_ <<= 16;
				if (i_29_ < 0) {
					i_31_ -= i_34_ * i_29_;
					i_32_ -= i_35_ * i_29_;
					i_29_ = 0;
				}
				i_33_ <<= 16;
				if (i_30_ < 0) {
					i_33_ -= i_36_ * i_30_;
					i_30_ = 0;
				}
				if (i_29_ != i_30_ && i_34_ < i_35_ || i_29_ == i_30_ && i_34_ > i_36_) {
					i -= i_30_;
					i_30_ -= i_29_;
					i_29_ *= anInt12081;
					while (--i_30_ >= 0) {
						method18745(aByteArray12084, i_29_, 0, i_31_ >> 16, i_32_ >> 16);
						i_31_ += i_34_;
						i_32_ += i_35_;
						i_29_ += anInt12081;
					}
					while (--i >= 0) {
						method18745(aByteArray12084, i_29_, 0, i_31_ >> 16, i_33_ >> 16);
						i_31_ += i_34_;
						i_33_ += i_36_;
						i_29_ += anInt12081;
					}
				} else {
					i -= i_30_;
					i_30_ -= i_29_;
					i_29_ *= anInt12081;
					while (--i_30_ >= 0) {
						method18745(aByteArray12084, i_29_, 0, i_32_ >> 16, i_31_ >> 16);
						i_31_ += i_34_;
						i_32_ += i_35_;
						i_29_ += anInt12081;
					}
					while (--i >= 0) {
						method18745(aByteArray12084, i_29_, 0, i_33_ >> 16, i_31_ >> 16);
						i_31_ += i_34_;
						i_33_ += i_36_;
						i_29_ += anInt12081;
					}
				}
			} else {
				i_33_ = i_32_ <<= 16;
				if (i_29_ < 0) {
					i_33_ -= i_34_ * i_29_;
					i_32_ -= i_35_ * i_29_;
					i_29_ = 0;
				}
				i_31_ <<= 16;
				if (i < 0) {
					i_31_ -= i_36_ * i;
					i = 0;
				}
				if (i_34_ < i_35_) {
					i_30_ -= i;
					i -= i_29_;
					i_29_ *= anInt12081;
					while (--i >= 0) {
						method18745(aByteArray12084, i_29_, 0, i_33_ >> 16, i_32_ >> 16);
						i_33_ += i_34_;
						i_32_ += i_35_;
						i_29_ += anInt12081;
					}
					while (--i_30_ >= 0) {
						method18745(aByteArray12084, i_29_, 0, i_31_ >> 16, i_32_ >> 16);
						i_31_ += i_36_;
						i_32_ += i_35_;
						i_29_ += anInt12081;
					}
				} else {
					i_30_ -= i;
					i -= i_29_;
					i_29_ *= anInt12081;
					while (--i >= 0) {
						method18745(aByteArray12084, i_29_, 0, i_32_ >> 16, i_33_ >> 16);
						i_33_ += i_34_;
						i_32_ += i_35_;
						i_29_ += anInt12081;
					}
					while (--i_30_ >= 0) {
						method18745(aByteArray12084, i_29_, 0, i_32_ >> 16, i_31_ >> 16);
						i_31_ += i_36_;
						i_32_ += i_35_;
						i_29_ += anInt12081;
					}
				}
			}
		} else if (i < i_29_) {
			i_32_ = i_33_ <<= 16;
			if (i_30_ < 0) {
				i_32_ -= i_35_ * i_30_;
				i_33_ -= i_36_ * i_30_;
				i_30_ = 0;
			}
			i_31_ <<= 16;
			if (i < 0) {
				i_31_ -= i_34_ * i;
				i = 0;
			}
			if (i_35_ < i_36_) {
				i_29_ -= i;
				i -= i_30_;
				i_30_ *= anInt12081;
				while (--i >= 0) {
					method18745(aByteArray12084, i_30_, 0, i_32_ >> 16, i_33_ >> 16);
					i_32_ += i_35_;
					i_33_ += i_36_;
					i_30_ += anInt12081;
				}
				while (--i_29_ >= 0) {
					method18745(aByteArray12084, i_30_, 0, i_32_ >> 16, i_31_ >> 16);
					i_32_ += i_35_;
					i_31_ += i_34_;
					i_30_ += anInt12081;
				}
			} else {
				i_29_ -= i;
				i -= i_30_;
				i_30_ *= anInt12081;
				while (--i >= 0) {
					method18745(aByteArray12084, i_30_, 0, i_33_ >> 16, i_32_ >> 16);
					i_32_ += i_35_;
					i_33_ += i_36_;
					i_30_ += anInt12081;
				}
				while (--i_29_ >= 0) {
					method18745(aByteArray12084, i_30_, 0, i_31_ >> 16, i_32_ >> 16);
					i_32_ += i_35_;
					i_31_ += i_34_;
					i_30_ += anInt12081;
				}
			}
		} else {
			i_31_ = i_33_ <<= 16;
			if (i_30_ < 0) {
				i_31_ -= i_35_ * i_30_;
				i_33_ -= i_36_ * i_30_;
				i_30_ = 0;
			}
			i_32_ <<= 16;
			if (i_29_ < 0) {
				i_32_ -= i_34_ * i_29_;
				i_29_ = 0;
			}
			if (i_35_ < i_36_) {
				i -= i_29_;
				i_29_ -= i_30_;
				i_30_ *= anInt12081;
				while (--i_29_ >= 0) {
					method18745(aByteArray12084, i_30_, 0, i_31_ >> 16, i_33_ >> 16);
					i_31_ += i_35_;
					i_33_ += i_36_;
					i_30_ += anInt12081;
				}
				while (--i >= 0) {
					method18745(aByteArray12084, i_30_, 0, i_32_ >> 16, i_33_ >> 16);
					i_32_ += i_34_;
					i_33_ += i_36_;
					i_30_ += anInt12081;
				}
			} else {
				i -= i_29_;
				i_29_ -= i_30_;
				i_30_ *= anInt12081;
				while (--i_29_ >= 0) {
					method18745(aByteArray12084, i_30_, 0, i_33_ >> 16, i_31_ >> 16);
					i_31_ += i_35_;
					i_33_ += i_36_;
					i_30_ += anInt12081;
				}
				while (--i >= 0) {
					method18745(aByteArray12084, i_30_, 0, i_33_ >> 16, i_32_ >> 16);
					i_32_ += i_34_;
					i_33_ += i_36_;
					i_30_ += anInt12081;
				}
			}
		}
	}
}
