/* Class548 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class548 {
	Class544 aClass544_7296;
	static final int anInt7297 = -2002;
	static final int anInt7298 = 39424;
	static final int anInt7299 = 1;
	static final int anInt7300 = 2;
	static final int anInt7301 = 2002;
	int anInt7302;
	static final int anInt7303 = 8;
	int anInt7304 = 0;
	static final int anInt7305 = 12;

	final boolean method6635(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (i > 2002 || i_0_ > 2002 || i_1_ > 2002 || i_2_ > 2002 || i_3_ > 2002 || i_4_ > 2002)
			return false;
		if (i < -2002 || i_0_ < -2002 || i_1_ < -2002 || i_2_ < -2002 || i_3_ < -2002 || i_4_ < -2002)
			return false;
		if (anInt7302 == 2) {
			int i_8_ = i_2_ + i * aClass544_7296.anInt7265;
			if (i_8_ >= 0 && i_8_ < aClass544_7296.anIntArray7240.length && (i_5_ << 8) - 39424 < aClass544_7296.anIntArray7240[i_8_])
				return false;
			i_8_ = i_3_ + i_0_ * aClass544_7296.anInt7265;
			if (i_8_ >= 0 && i_8_ < aClass544_7296.anIntArray7240.length && (i_6_ << 8) - 39424 < aClass544_7296.anIntArray7240[i_8_])
				return false;
			i_8_ = i_4_ + i_1_ * aClass544_7296.anInt7265;
			if (i_8_ >= 0 && i_8_ < aClass544_7296.anIntArray7240.length && (i_7_ << 8) - 39424 < aClass544_7296.anIntArray7240[i_8_])
				return false;
		}
		int i_9_ = i_3_ - i_2_;
		int i_10_ = i_0_ - i;
		int i_11_ = i_4_ - i_2_;
		int i_12_ = i_1_ - i;
		int i_13_ = i_6_ - i_5_;
		int i_14_ = i_7_ - i_5_;
		if (i < i_0_ && i < i_1_) {
			i--;
			if (i_0_ > i_1_)
				i_0_++;
			else
				i_1_++;
		} else if (i_0_ < i_1_) {
			i_0_--;
			if (i > i_1_)
				i++;
			else
				i_1_++;
		} else {
			i_1_--;
			if (i > i_0_)
				i++;
			else
				i_0_++;
		}
		int i_15_ = 0;
		if (i_0_ != i)
			i_15_ = (i_3_ - i_2_ << 12) / (i_0_ - i);
		int i_16_ = 0;
		if (i_1_ != i_0_)
			i_16_ = (i_4_ - i_3_ << 12) / (i_1_ - i_0_);
		int i_17_ = 0;
		if (i_1_ != i)
			i_17_ = (i_2_ - i_4_ << 12) / (i - i_1_);
		int i_18_ = i_9_ * i_12_ - i_11_ * i_10_;
		if (i_18_ == 0)
			return false;
		int i_19_ = (i_13_ * i_12_ - i_14_ * i_10_ << 8) / i_18_;
		int i_20_ = (i_14_ * i_9_ - i_13_ * i_11_ << 8) / i_18_;
		if (i <= i_0_ && i <= i_1_) {
			if (i >= aClass544_7296.anInt7266)
				return true;
			if (i_0_ > aClass544_7296.anInt7266)
				i_0_ = aClass544_7296.anInt7266;
			if (i_1_ > aClass544_7296.anInt7266)
				i_1_ = aClass544_7296.anInt7266;
			i_5_ = (i_5_ << 8) - i_19_ * i_2_ + i_19_;
			if (i_0_ < i_1_) {
				i_4_ = i_2_ <<= 12;
				if (i < 0) {
					i_4_ -= i_17_ * i;
					i_2_ -= i_15_ * i;
					i_5_ -= i_20_ * i;
					i = 0;
				}
				i_3_ <<= 12;
				if (i_0_ < 0) {
					i_3_ -= i_16_ * i_0_;
					i_0_ = 0;
				}
				if (i != i_0_ && i_17_ < i_15_ || i == i_0_ && i_17_ > i_16_) {
					i_1_ -= i_0_;
					i_0_ -= i;
					i *= aClass544_7296.anInt7265;
					while (--i_0_ >= 0) {
						if (!method6636(aClass544_7296.anIntArray7240, i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, aClass544_7296.anInt7265))
							return false;
						i_4_ += i_17_;
						i_2_ += i_15_;
						i_5_ += i_20_;
						i += aClass544_7296.anInt7265;
					}
					while (--i_1_ >= 0) {
						if (!method6636(aClass544_7296.anIntArray7240, i, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_5_, i_19_, aClass544_7296.anInt7265))
							return false;
						i_4_ += i_17_;
						i_3_ += i_16_;
						i_5_ += i_20_;
						i += aClass544_7296.anInt7265;
					}
					return true;
				}
				i_1_ -= i_0_;
				i_0_ -= i;
				i *= aClass544_7296.anInt7265;
				while (--i_0_ >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_4_ += i_17_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += aClass544_7296.anInt7265;
				}
				while (--i_1_ >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_4_ += i_17_;
					i_3_ += i_16_;
					i_5_ += i_20_;
					i += aClass544_7296.anInt7265;
				}
				return true;
			}
			i_3_ = i_2_ <<= 12;
			if (i < 0) {
				i_3_ -= i_17_ * i;
				i_2_ -= i_15_ * i;
				i_5_ -= i_20_ * i;
				i = 0;
			}
			i_4_ <<= 12;
			if (i_1_ < 0) {
				i_4_ -= i_16_ * i_1_;
				i_1_ = 0;
			}
			if (i != i_1_ && i_17_ < i_15_ || i == i_1_ && i_16_ > i_15_) {
				i_0_ -= i_1_;
				i_1_ -= i;
				i *= aClass544_7296.anInt7265;
				while (--i_1_ >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_3_ += i_17_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += aClass544_7296.anInt7265;
				}
				while (--i_0_ >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_4_ += i_16_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += aClass544_7296.anInt7265;
				}
				return true;
			}
			i_0_ -= i_1_;
			i_1_ -= i;
			i *= aClass544_7296.anInt7265;
			while (--i_1_ >= 0) {
				if (!method6636(aClass544_7296.anIntArray7240, i, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_5_, i_19_, aClass544_7296.anInt7265))
					return false;
				i_3_ += i_17_;
				i_2_ += i_15_;
				i_5_ += i_20_;
				i += aClass544_7296.anInt7265;
			}
			while (--i_0_ >= 0) {
				if (!method6636(aClass544_7296.anIntArray7240, i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, aClass544_7296.anInt7265))
					return false;
				i_4_ += i_16_;
				i_2_ += i_15_;
				i_5_ += i_20_;
				i += aClass544_7296.anInt7265;
			}
			return true;
		}
		if (i_0_ <= i_1_) {
			if (i_0_ >= aClass544_7296.anInt7266)
				return true;
			if (i_1_ > aClass544_7296.anInt7266)
				i_1_ = aClass544_7296.anInt7266;
			if (i > aClass544_7296.anInt7266)
				i = aClass544_7296.anInt7266;
			i_6_ = (i_6_ << 8) - i_19_ * i_3_ + i_19_;
			if (i_1_ < i) {
				i_2_ = i_3_ <<= 12;
				if (i_0_ < 0) {
					i_2_ -= i_15_ * i_0_;
					i_3_ -= i_16_ * i_0_;
					i_6_ -= i_20_ * i_0_;
					i_0_ = 0;
				}
				i_4_ <<= 12;
				if (i_1_ < 0) {
					i_4_ -= i_17_ * i_1_;
					i_1_ = 0;
				}
				if (i_0_ != i_1_ && i_15_ < i_16_ || i_0_ == i_1_ && i_15_ > i_17_) {
					i -= i_1_;
					i_1_ -= i_0_;
					i_0_ *= aClass544_7296.anInt7265;
					while (--i_1_ >= 0) {
						if (!method6636(aClass544_7296.anIntArray7240, i_0_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, aClass544_7296.anInt7265))
							return false;
						i_2_ += i_15_;
						i_3_ += i_16_;
						i_6_ += i_20_;
						i_0_ += aClass544_7296.anInt7265;
					}
					while (--i >= 0) {
						if (!method6636(aClass544_7296.anIntArray7240, i_0_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_6_, i_19_, aClass544_7296.anInt7265))
							return false;
						i_2_ += i_15_;
						i_4_ += i_17_;
						i_6_ += i_20_;
						i_0_ += aClass544_7296.anInt7265;
					}
					return true;
				}
				i -= i_1_;
				i_1_ -= i_0_;
				i_0_ *= aClass544_7296.anInt7265;
				while (--i_1_ >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_2_ += i_15_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += aClass544_7296.anInt7265;
				}
				while (--i >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i_0_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_2_ += i_15_;
					i_4_ += i_17_;
					i_6_ += i_20_;
					i_0_ += aClass544_7296.anInt7265;
				}
				return true;
			}
			i_4_ = i_3_ <<= 12;
			if (i_0_ < 0) {
				i_4_ -= i_15_ * i_0_;
				i_3_ -= i_16_ * i_0_;
				i_6_ -= i_20_ * i_0_;
				i_0_ = 0;
			}
			i_2_ <<= 12;
			if (i < 0) {
				i_2_ -= i_17_ * i;
				i = 0;
			}
			if (i_15_ < i_16_) {
				i_1_ -= i;
				i -= i_0_;
				i_0_ *= aClass544_7296.anInt7265;
				while (--i >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i_0_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_4_ += i_15_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += aClass544_7296.anInt7265;
				}
				while (--i_1_ >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i_0_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_2_ += i_17_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += aClass544_7296.anInt7265;
				}
				return true;
			}
			i_1_ -= i;
			i -= i_0_;
			i_0_ *= aClass544_7296.anInt7265;
			while (--i >= 0) {
				if (!method6636(aClass544_7296.anIntArray7240, i_0_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_6_, i_19_, aClass544_7296.anInt7265))
					return false;
				i_4_ += i_15_;
				i_3_ += i_16_;
				i_6_ += i_20_;
				i_0_ += aClass544_7296.anInt7265;
			}
			while (--i_1_ >= 0) {
				if (!method6636(aClass544_7296.anIntArray7240, i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, aClass544_7296.anInt7265))
					return false;
				i_2_ += i_17_;
				i_3_ += i_16_;
				i_6_ += i_20_;
				i_0_ += aClass544_7296.anInt7265;
			}
			return true;
		}
		if (i_1_ >= aClass544_7296.anInt7266)
			return true;
		if (i > aClass544_7296.anInt7266)
			i = aClass544_7296.anInt7266;
		if (i_0_ > aClass544_7296.anInt7266)
			i_0_ = aClass544_7296.anInt7266;
		i_7_ = (i_7_ << 8) - i_19_ * i_4_ + i_19_;
		if (i < i_0_) {
			i_3_ = i_4_ <<= 12;
			if (i_1_ < 0) {
				i_3_ -= i_16_ * i_1_;
				i_4_ -= i_17_ * i_1_;
				i_7_ -= i_20_ * i_1_;
				i_1_ = 0;
			}
			i_2_ <<= 12;
			if (i < 0) {
				i_2_ -= i_15_ * i;
				i = 0;
			}
			if (i_16_ < i_17_) {
				i_0_ -= i;
				i -= i_1_;
				i_1_ *= aClass544_7296.anInt7265;
				while (--i >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_3_ += i_16_;
					i_4_ += i_17_;
					i_7_ += i_20_;
					i_1_ += aClass544_7296.anInt7265;
				}
				while (--i_0_ >= 0) {
					if (!method6636(aClass544_7296.anIntArray7240, i_1_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_, i_19_, aClass544_7296.anInt7265))
						return false;
					i_3_ += i_16_;
					i_2_ += i_15_;
					i_7_ += i_20_;
					i_1_ += aClass544_7296.anInt7265;
				}
				return true;
			}
			i_0_ -= i;
			i -= i_1_;
			i_1_ *= aClass544_7296.anInt7265;
			while (--i >= 0) {
				if (!method6636(aClass544_7296.anIntArray7240, i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, aClass544_7296.anInt7265))
					return false;
				i_3_ += i_16_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += aClass544_7296.anInt7265;
			}
			while (--i_0_ >= 0) {
				if (!method6636(aClass544_7296.anIntArray7240, i_1_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, aClass544_7296.anInt7265))
					return false;
				i_3_ += i_16_;
				i_2_ += i_15_;
				i_7_ += i_20_;
				i_1_ += aClass544_7296.anInt7265;
			}
			return true;
		}
		i_2_ = i_4_ <<= 12;
		if (i_1_ < 0) {
			i_2_ -= i_16_ * i_1_;
			i_4_ -= i_17_ * i_1_;
			i_7_ -= i_20_ * i_1_;
			i_1_ = 0;
		}
		i_3_ <<= 12;
		if (i_0_ < 0) {
			i_3_ -= i_15_ * i_0_;
			i_0_ = 0;
		}
		if (i_16_ < i_17_) {
			i -= i_0_;
			i_0_ -= i_1_;
			i_1_ *= aClass544_7296.anInt7265;
			while (--i_0_ >= 0) {
				if (!method6636(aClass544_7296.anIntArray7240, i_1_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, aClass544_7296.anInt7265))
					return false;
				i_2_ += i_16_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += aClass544_7296.anInt7265;
			}
			while (--i >= 0) {
				if (!method6636(aClass544_7296.anIntArray7240, i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, aClass544_7296.anInt7265))
					return false;
				i_3_ += i_15_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += aClass544_7296.anInt7265;
			}
			return true;
		}
		i -= i_0_;
		i_0_ -= i_1_;
		i_1_ *= aClass544_7296.anInt7265;
		while (--i_0_ >= 0) {
			if (!method6636(aClass544_7296.anIntArray7240, i_1_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_, i_19_, aClass544_7296.anInt7265))
				return false;
			i_2_ += i_16_;
			i_4_ += i_17_;
			i_7_ += i_20_;
			i_1_ += aClass544_7296.anInt7265;
		}
		while (--i >= 0) {
			if (!method6636(aClass544_7296.anIntArray7240, i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, aClass544_7296.anInt7265))
				return false;
			i_3_ += i_15_;
			i_4_ += i_17_;
			i_7_ += i_20_;
			i_1_ += aClass544_7296.anInt7265;
		}
		return true;
	}

	final boolean method6636(int[] is, int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		if (i_23_ > i_26_)
			i_23_ = i_26_;
		if (i_22_ < 0)
			i_22_ = 0;
		if (i_22_ >= i_23_)
			return true;
		i += i_22_ - 1;
		i_21_ = i_23_ - i_22_ >> 2;
		i_24_ += i_25_ * i_22_;
		if (anInt7302 == 1) {
			anInt7304 += i_21_;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
			}
			i_21_ = i_23_ - i_22_ & 0x3;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
			}
		} else {
			i_24_ -= 39424;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
			}
			i_21_ = i_23_ - i_22_ & 0x3;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
			}
		}
		return true;
	}

	Class548(Class544 class544) {
		aClass544_7296 = class544;
	}
}
