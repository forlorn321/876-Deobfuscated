/* Class687 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class687 {
	Class687() throws Throwable {
		throw new Error();
	}

	public static void method8114(int[] is, int i, int[] is_0_, int i_1_, int i_2_) {
		if (is == is_0_) {
			if (i == i_1_)
				return;
			if (i_1_ > i && i_1_ < i + i_2_) {
				i_2_--;
				i += i_2_;
				i_1_ += i_2_;
				i_2_ = i - i_2_;
				i_2_ += 7;
				while (i >= i_2_) {
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
				}
				i_2_ -= 7;
				while (i >= i_2_)
					is_0_[i_1_--] = is[i--];
				return;
			}
		}
		i_2_ += i;
		i_2_ -= 7;
		while (i < i_2_) {
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
		}
		i_2_ += 7;
		while (i < i_2_)
			is_0_[i_1_++] = is[i++];
	}

	public static void method8115(int[] is, int i, int i_3_, int i_4_) {
		i_3_ = i + i_3_ - 7;
		while (i < i_3_) {
			is[i++] = i_4_;
			is[i++] = i_4_;
			is[i++] = i_4_;
			is[i++] = i_4_;
			is[i++] = i_4_;
			is[i++] = i_4_;
			is[i++] = i_4_;
			is[i++] = i_4_;
		}
		i_3_ += 7;
		while (i < i_3_)
			is[i++] = i_4_;
	}

	public static void method8116(Object[] objects, int i, Object[] objects_5_, int i_6_, int i_7_) {
		if (objects == objects_5_) {
			if (i == i_6_)
				return;
			if (i_6_ > i && i_6_ < i + i_7_) {
				i_7_--;
				i += i_7_;
				i_6_ += i_7_;
				i_7_ = i - i_7_;
				i_7_ += 7;
				while (i >= i_7_) {
					objects_5_[i_6_--] = objects[i--];
					objects_5_[i_6_--] = objects[i--];
					objects_5_[i_6_--] = objects[i--];
					objects_5_[i_6_--] = objects[i--];
					objects_5_[i_6_--] = objects[i--];
					objects_5_[i_6_--] = objects[i--];
					objects_5_[i_6_--] = objects[i--];
					objects_5_[i_6_--] = objects[i--];
				}
				i_7_ -= 7;
				while (i >= i_7_)
					objects_5_[i_6_--] = objects[i--];
				return;
			}
		}
		i_7_ += i;
		i_7_ -= 7;
		while (i < i_7_) {
			objects_5_[i_6_++] = objects[i++];
			objects_5_[i_6_++] = objects[i++];
			objects_5_[i_6_++] = objects[i++];
			objects_5_[i_6_++] = objects[i++];
			objects_5_[i_6_++] = objects[i++];
			objects_5_[i_6_++] = objects[i++];
			objects_5_[i_6_++] = objects[i++];
			objects_5_[i_6_++] = objects[i++];
		}
		i_7_ += 7;
		while (i < i_7_)
			objects_5_[i_6_++] = objects[i++];
	}

	public static void method8117(float[] fs, int i, float[] fs_8_, int i_9_, int i_10_) {
		if (fs == fs_8_) {
			if (i == i_9_)
				return;
			if (i_9_ > i && i_9_ < i + i_10_) {
				i_10_--;
				i += i_10_;
				i_9_ += i_10_;
				i_10_ = i - i_10_;
				i_10_ += 7;
				while (i >= i_10_) {
					fs_8_[i_9_--] = fs[i--];
					fs_8_[i_9_--] = fs[i--];
					fs_8_[i_9_--] = fs[i--];
					fs_8_[i_9_--] = fs[i--];
					fs_8_[i_9_--] = fs[i--];
					fs_8_[i_9_--] = fs[i--];
					fs_8_[i_9_--] = fs[i--];
					fs_8_[i_9_--] = fs[i--];
				}
				i_10_ -= 7;
				while (i >= i_10_)
					fs_8_[i_9_--] = fs[i--];
				return;
			}
		}
		i_10_ += i;
		i_10_ -= 7;
		while (i < i_10_) {
			fs_8_[i_9_++] = fs[i++];
			fs_8_[i_9_++] = fs[i++];
			fs_8_[i_9_++] = fs[i++];
			fs_8_[i_9_++] = fs[i++];
			fs_8_[i_9_++] = fs[i++];
			fs_8_[i_9_++] = fs[i++];
			fs_8_[i_9_++] = fs[i++];
			fs_8_[i_9_++] = fs[i++];
		}
		i_10_ += 7;
		while (i < i_10_)
			fs_8_[i_9_++] = fs[i++];
	}
}
