/* Class34_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class34_Sub6 extends Class34 {
	public static int anInt10965;

	public Class34_Sub6(GameMode class670, Language class664, JS5ResourceProvider class461) {
		super(class670, class664, class461, JS5ConfigGroup.ENUM_TYPE, 128, new Class58(com.jagex.Class39.class));
	}

	public static int method10321(CharSequence charsequence, CharSequence charsequence_0_, Language class664, int i) {
		int i_1_ = charsequence.length();
		int i_2_ = charsequence_0_.length();
		int i_3_ = 0;
		int i_4_ = 0;
		char c = '\0';
		char c_5_ = '\0';
		while (i_3_ - c < i_1_ || i_4_ - c_5_ < i_2_) {
			if (i_3_ - c >= i_1_)
				return -1;
			if (i_4_ - c_5_ >= i_2_)
				return 1;
			char c_6_;
			if (c != 0) {
				c_6_ = c;
				boolean bool = false;
			} else
				c_6_ = charsequence.charAt(i_3_++);
			char c_7_;
			if (0 != c_5_) {
				c_7_ = c_5_;
				boolean bool = false;
			} else
				c_7_ = charsequence_0_.charAt(i_4_++);
			c = Class226.method3280(c_6_, -1719713314);
			c_5_ = Class226.method3280(c_7_, -1811947013);
			c_6_ = Class649_Sub1_Sub2.method10751(c_6_, class664, (byte) 0);
			c_7_ = Class649_Sub1_Sub2.method10751(c_7_, class664, (byte) 0);
			if (c_7_ != c_6_ && (Character.toUpperCase(c_6_) != Character.toUpperCase(c_7_))) {
				c_6_ = Character.toLowerCase(c_6_);
				c_7_ = Character.toLowerCase(c_7_);
				if (c_7_ != c_6_)
					return (Class244.method3410(c_6_, class664, -761824995) - Class244.method3410(c_7_, class664, -872248606));
			}
		}
		int i_8_ = Math.min(i_1_, i_2_);
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			if (class664 == Language.aClass664_8516) {
				i_3_ = i_1_ - 1 - i_9_;
				i_4_ = i_2_ - 1 - i_9_;
			} else
				i_3_ = i_4_ = i_9_;
			char c_10_ = charsequence.charAt(i_3_);
			char c_11_ = charsequence_0_.charAt(i_4_);
			if (c_10_ != c_11_ && (Character.toUpperCase(c_10_) != Character.toUpperCase(c_11_))) {
				c_10_ = Character.toLowerCase(c_10_);
				c_11_ = Character.toLowerCase(c_11_);
				if (c_10_ != c_11_)
					return (Class244.method3410(c_10_, class664, -1061511866) - Class244.method3410(c_11_, class664, -1279914358));
			}
		}
		int i_12_ = i_1_ - i_2_;
		if (0 != i_12_)
			return i_12_;
		for (int i_13_ = 0; i_13_ < i_8_; i_13_++) {
			char c_14_ = charsequence.charAt(i_13_);
			char c_15_ = charsequence_0_.charAt(i_13_);
			if (c_14_ != c_15_)
				return (Class244.method3410(c_14_, class664, -652949085) - Class244.method3410(c_15_, class664, -1606443601));
		}
		return 0;
	}
}
