/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class44 {
	int anInt515;
	int anInt516;
	int anInt517;
	int anInt518;
	int anInt519;
	public static short[][][] skinTextures;

	Class44(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt515 = 1702590229 * i;
		anInt516 = i_0_ * 1164083407;
		anInt517 = i_1_ * 302611185;
		anInt518 = i_2_ * -1849208975;
		anInt519 = i_3_ * -1558246815;
	}

	public int hashCode() {
		return anInt515 * -999677891;
	}

	public int method880() {
		return anInt515 * -999677891;
	}

	public int method881() {
		return anInt515 * -999677891;
	}

	static boolean method882(int i) {
		return Class105.aBool1248;
	}

	static void method883(long[] ls, int[] is, int i, int i_4_, int i_5_) {
		if (i < i_4_) {
			int i_6_ = (i + i_4_) / 2;
			int i_7_ = i;
			long l = ls[i_6_];
			ls[i_6_] = ls[i_4_];
			ls[i_4_] = l;
			int i_8_ = is[i_6_];
			is[i_6_] = is[i_4_];
			is[i_4_] = i_8_;
			int i_9_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_10_ = i; i_10_ < i_4_; i_10_++) {
				if (ls[i_10_] < l + (long) (i_10_ & i_9_)) {
					long l_11_ = ls[i_10_];
					ls[i_10_] = ls[i_7_];
					ls[i_7_] = l_11_;
					int i_12_ = is[i_10_];
					is[i_10_] = is[i_7_];
					is[i_7_++] = i_12_;
				}
			}
			ls[i_4_] = ls[i_7_];
			ls[i_7_] = l;
			is[i_4_] = is[i_7_];
			is[i_7_] = i_8_;
			method883(ls, is, i, i_7_ - 1, 527678901);
			method883(ls, is, 1 + i_7_, i_4_, 527678901);
		}
	}
}
