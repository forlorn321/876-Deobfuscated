/* Class672 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public final class Class672 {
	public static int method13784(CharSequence charsequence, CharSequence charsequence_0_) {
		int i = charsequence.length();
		int i_1_ = charsequence_0_.length();
		if (0 == i)
			return i_1_;
		if (i_1_ == 0)
			return i;
		int[] is = new int[i + 1];
		int[] is_2_ = new int[i + 1];
		for (int i_3_ = 0; i_3_ <= i; i_3_++)
			is[i_3_] = i_3_;
		for (int i_4_ = 1; i_4_ <= i_1_; i_4_++) {
			is_2_[0] = i_4_;
			char c = charsequence_0_.charAt(i_4_ - 1);
			for (int i_5_ = 1; i_5_ <= i; i_5_++)
				is_2_[i_5_] = Math.min(Math.min(1 + is_2_[i_5_ - 1], is[i_5_] + 1), (is[i_5_ - 1] + (charsequence.charAt(i_5_ - 1) == c ? 0 : 1)));
			int[] is_6_ = is;
			is = is_2_;
			is_2_ = is_6_;
		}
		return is[i];
	}

	static int method13785(CharSequence charsequence, char c) {
		int i = 0;
		int i_7_ = charsequence.length();
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			if (charsequence.charAt(i_8_) == c)
				i++;
		}
		return i;
	}

	static int method13786(CharSequence charsequence, char c) {
		int i = 0;
		int i_9_ = charsequence.length();
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			if (charsequence.charAt(i_10_) == c)
				i++;
		}
		return i;
	}

	public static int method13787(CharSequence charsequence, CharSequence charsequence_11_) {
		int i = charsequence.length();
		int i_12_ = charsequence_11_.length();
		if (0 == i)
			return i_12_;
		if (i_12_ == 0)
			return i;
		int[] is = new int[i + 1];
		int[] is_13_ = new int[i + 1];
		for (int i_14_ = 0; i_14_ <= i; i_14_++)
			is[i_14_] = i_14_;
		for (int i_15_ = 1; i_15_ <= i_12_; i_15_++) {
			is_13_[0] = i_15_;
			char c = charsequence_11_.charAt(i_15_ - 1);
			for (int i_16_ = 1; i_16_ <= i; i_16_++)
				is_13_[i_16_] = Math.min(Math.min(1 + is_13_[i_16_ - 1], is[i_16_] + 1), (is[i_16_ - 1] + (charsequence.charAt(i_16_ - 1) == c ? 0 : 1)));
			int[] is_17_ = is;
			is = is_13_;
			is_13_ = is_17_;
		}
		return is[i];
	}

	public static String method13788(Object[] objects, int i, int i_18_) {
		if (i_18_ == 0)
			return "";
		if (1 == i_18_) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (charsequence == null)
				return "null";
			return charsequence.toString();
		}
		int i_19_ = i_18_ + i;
		int i_20_ = 0;
		for (int i_21_ = i; i_21_ < i_19_; i_21_++) {
			CharSequence charsequence = (CharSequence) objects[i_21_];
			if (null == charsequence)
				i_20_ += 4;
			else
				i_20_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_20_);
		for (int i_22_ = i; i_22_ < i_19_; i_22_++) {
			CharSequence charsequence = (CharSequence) objects[i_22_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	public static boolean method13789(char c) {
		return c >= '0' && c <= '9';
	}

	public static boolean method13790(CharSequence charsequence) {
		return Class208_Sub3.method15608(charsequence, 10, true, (byte) -22);
	}

	public static boolean method13791(CharSequence charsequence) {
		return Class208_Sub3.method15608(charsequence, 10, true, (byte) -91);
	}

	public static String method13792(String string, char c, String string_23_) {
		int i = string.length();
		int i_24_ = string_23_.length();
		int i_25_ = i;
		int i_26_ = i_24_ - 1;
		if (i_26_ != 0) {
			int i_27_ = 0;
			for (;;) {
				i_27_ = string.indexOf(c, i_27_);
				if (i_27_ < 0)
					break;
				i_27_++;
				i_25_ += i_26_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_25_);
		int i_28_ = 0;
		for (;;) {
			int i_29_ = string.indexOf(c, i_28_);
			if (i_29_ < 0)
				break;
			stringbuilder.append(string.substring(i_28_, i_29_));
			stringbuilder.append(string_23_);
			i_28_ = 1 + i_29_;
		}
		stringbuilder.append(string.substring(i_28_));
		return stringbuilder.toString();
	}

	static boolean method13793(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_30_ = false;
		boolean bool_31_ = false;
		int i_32_ = 0;
		int i_33_ = charsequence.length();
		for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
			int i_35_ = charsequence.charAt(i_34_);
			if (0 == i_34_) {
				if (45 == i_35_) {
					bool_30_ = true;
					continue;
				}
				if (43 == i_35_ && bool)
					continue;
			}
			if (i_35_ >= 48 && i_35_ <= 57)
				i_35_ -= 48;
			else if (i_35_ >= 65 && i_35_ <= 90)
				i_35_ -= 55;
			else if (i_35_ >= 97 && i_35_ <= 122)
				i_35_ -= 87;
			else
				return false;
			if (i_35_ >= i)
				return false;
			if (bool_30_)
				i_35_ = -i_35_;
			int i_36_ = i_35_ + i * i_32_;
			if (i_32_ != i_36_ / i)
				return false;
			i_32_ = i_36_;
			bool_31_ = true;
		}
		return bool_31_;
	}

	public static boolean method13794(char c) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || '\u0152' == c || '\u2014' == c || '\u0153' == c || c == '\u0178')
			return true;
		return false;
	}

	public static int method13795(CharSequence charsequence) {
		return Class217.method3972(charsequence, 10, true, -1380482569);
	}

	static int method13796(CharSequence charsequence, int i, boolean bool) {
		if (i < 2 || i > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
		boolean bool_37_ = false;
		boolean bool_38_ = false;
		int i_39_ = 0;
		int i_40_ = charsequence.length();
		for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
			int i_42_ = charsequence.charAt(i_41_);
			if (i_41_ == 0) {
				if (45 == i_42_) {
					bool_37_ = true;
					continue;
				}
				if (43 == i_42_ && bool)
					continue;
			}
			if (i_42_ >= 48 && i_42_ <= 57)
				i_42_ -= 48;
			else if (i_42_ >= 65 && i_42_ <= 90)
				i_42_ -= 55;
			else if (i_42_ >= 97 && i_42_ <= 122)
				i_42_ -= 87;
			else
				throw new NumberFormatException();
			if (i_42_ >= i)
				throw new NumberFormatException();
			if (bool_37_)
				i_42_ = -i_42_;
			int i_43_ = i * i_39_ + i_42_;
			if (i_43_ / i != i_39_)
				throw new NumberFormatException();
			i_39_ = i_43_;
			bool_38_ = true;
		}
		if (!bool_38_)
			throw new NumberFormatException();
		return i_39_;
	}

	public static String method13797(int i, boolean bool) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class269.method5056(i, 10, bool, -917201598);
	}

	public static String method13798(int i, boolean bool) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class269.method5056(i, 10, bool, -917201598);
	}

	public static String method13799(int i, boolean bool) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class269.method5056(i, 10, bool, -917201598);
	}

	static String method13800(int i, int i_44_, boolean bool) {
		if (i_44_ < 2 || i_44_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_44_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_44_);
		int i_45_ = 2;
		int i_46_ = i / i_44_;
		while (i_46_ != 0) {
			i_46_ /= i_44_;
			i_45_++;
		}
		char[] cs = new char[i_45_];
		cs[0] = '+';
		for (int i_47_ = i_45_ - 1; i_47_ > 0; i_47_--) {
			int i_48_ = i;
			i /= i_44_;
			int i_49_ = i_48_ - i * i_44_;
			if (i_49_ >= 10)
				cs[i_47_] = (char) (87 + i_49_);
			else
				cs[i_47_] = (char) (48 + i_49_);
		}
		return new String(cs);
	}

	public static int method13801(CharSequence charsequence) {
		int i = charsequence.length();
		int i_50_ = 0;
		for (int i_51_ = 0; i_51_ < i; i_51_++)
			i_50_ = ((i_50_ << 5) - i_50_ + Class676.method13876(charsequence.charAt(i_51_), 1907269876));
		return i_50_;
	}

	public static int method13802(CharSequence charsequence) {
		int i = charsequence.length();
		int i_52_ = 0;
		for (int i_53_ = 0; i_53_ < i; i_53_++)
			i_52_ = ((i_52_ << 5) - i_52_ + Class676.method13876(charsequence.charAt(i_53_), 1907269876));
		return i_52_;
	}

	public static int method13803(CharSequence charsequence) {
		int i = charsequence.length();
		int i_54_ = 0;
		for (int i_55_ = 0; i_55_ < i; i_55_++)
			i_54_ = ((i_54_ << 5) - i_54_ + Class676.method13876(charsequence.charAt(i_55_), 1907269876));
		return i_54_;
	}

	public static int method13804(CharSequence charsequence) {
		int i = charsequence.length();
		int i_56_ = 0;
		for (int i_57_ = 0; i_57_ < i; i_57_++)
			i_56_ = (i_56_ << 5) - i_56_ + charsequence.charAt(i_57_);
		return i_56_;
	}

	Class672() throws Throwable {
		throw new Error();
	}

	public static long method13805(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_58_ = 0; i_58_ < i; i_58_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_58_);
		return l;
	}

	public static int method13806(CharSequence charsequence) {
		return Class217.method3972(charsequence, 10, true, -2134803461);
	}

	public static int method13807(CharSequence charsequence, CharSequence charsequence_59_) {
		int i = charsequence.length();
		int i_60_ = charsequence_59_.length();
		if (0 == i)
			return i_60_;
		if (i_60_ == 0)
			return i;
		int[] is = new int[i + 1];
		int[] is_61_ = new int[i + 1];
		for (int i_62_ = 0; i_62_ <= i; i_62_++)
			is[i_62_] = i_62_;
		for (int i_63_ = 1; i_63_ <= i_60_; i_63_++) {
			is_61_[0] = i_63_;
			char c = charsequence_59_.charAt(i_63_ - 1);
			for (int i_64_ = 1; i_64_ <= i; i_64_++)
				is_61_[i_64_] = Math.min(Math.min(1 + is_61_[i_64_ - 1], is[i_64_] + 1), (is[i_64_ - 1] + (charsequence.charAt(i_64_ - 1) == c ? 0 : 1)));
			int[] is_65_ = is;
			is = is_61_;
			is_61_ = is_65_;
		}
		return is[i];
	}

	public static long method13808(CharSequence charsequence) {
		int i = charsequence.length();
		long l = 0L;
		for (int i_66_ = 0; i_66_ < i; i_66_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_66_);
		return l;
	}

	public static int method13809(CharSequence charsequence, CharSequence charsequence_67_) {
		int i = charsequence.length();
		int i_68_ = charsequence_67_.length();
		if (0 == i)
			return i_68_;
		if (i_68_ == 0)
			return i;
		int[] is = new int[i + 1];
		int[] is_69_ = new int[i + 1];
		for (int i_70_ = 0; i_70_ <= i; i_70_++)
			is[i_70_] = i_70_;
		for (int i_71_ = 1; i_71_ <= i_68_; i_71_++) {
			is_69_[0] = i_71_;
			char c = charsequence_67_.charAt(i_71_ - 1);
			for (int i_72_ = 1; i_72_ <= i; i_72_++)
				is_69_[i_72_] = Math.min(Math.min(1 + is_69_[i_72_ - 1], is[i_72_] + 1), (is[i_72_ - 1] + (charsequence.charAt(i_72_ - 1) == c ? 0 : 1)));
			int[] is_73_ = is;
			is = is_69_;
			is_69_ = is_73_;
		}
		return is[i];
	}

	public static boolean method13810(char c) {
		return c >= '0' && c <= '9';
	}

	public static boolean method13811(char c) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	public static boolean method13812(char c) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	public static boolean method13813(char c) {
		return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}

	public static String method13814(Object[] objects, int i, int i_74_) {
		if (i_74_ == 0)
			return "";
		if (1 == i_74_) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (charsequence == null)
				return "null";
			return charsequence.toString();
		}
		int i_75_ = i_74_ + i;
		int i_76_ = 0;
		for (int i_77_ = i; i_77_ < i_75_; i_77_++) {
			CharSequence charsequence = (CharSequence) objects[i_77_];
			if (null == charsequence)
				i_76_ += 4;
			else
				i_76_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_76_);
		for (int i_78_ = i; i_78_ < i_75_; i_78_++) {
			CharSequence charsequence = (CharSequence) objects[i_78_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	public static boolean method13815(char c) {
		return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}

	public static String method13816(Object[] objects, int i, int i_79_) {
		if (i_79_ == 0)
			return "";
		if (1 == i_79_) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (charsequence == null)
				return "null";
			return charsequence.toString();
		}
		int i_80_ = i_79_ + i;
		int i_81_ = 0;
		for (int i_82_ = i; i_82_ < i_80_; i_82_++) {
			CharSequence charsequence = (CharSequence) objects[i_82_];
			if (null == charsequence)
				i_81_ += 4;
			else
				i_81_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_81_);
		for (int i_83_ = i; i_83_ < i_80_; i_83_++) {
			CharSequence charsequence = (CharSequence) objects[i_83_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	public static String method13817(String string, char c, String string_84_) {
		int i = string.length();
		int i_85_ = string_84_.length();
		int i_86_ = i;
		int i_87_ = i_85_ - 1;
		if (i_87_ != 0) {
			int i_88_ = 0;
			for (;;) {
				i_88_ = string.indexOf(c, i_88_);
				if (i_88_ < 0)
					break;
				i_88_++;
				i_86_ += i_87_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_86_);
		int i_89_ = 0;
		for (;;) {
			int i_90_ = string.indexOf(c, i_89_);
			if (i_90_ < 0)
				break;
			stringbuilder.append(string.substring(i_89_, i_90_));
			stringbuilder.append(string_84_);
			i_89_ = 1 + i_90_;
		}
		stringbuilder.append(string.substring(i_89_));
		return stringbuilder.toString();
	}

	public static String method13818(String string, char c, String string_91_) {
		int i = string.length();
		int i_92_ = string_91_.length();
		int i_93_ = i;
		int i_94_ = i_92_ - 1;
		if (i_94_ != 0) {
			int i_95_ = 0;
			for (;;) {
				i_95_ = string.indexOf(c, i_95_);
				if (i_95_ < 0)
					break;
				i_95_++;
				i_93_ += i_94_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_93_);
		int i_96_ = 0;
		for (;;) {
			int i_97_ = string.indexOf(c, i_96_);
			if (i_97_ < 0)
				break;
			stringbuilder.append(string.substring(i_96_, i_97_));
			stringbuilder.append(string_91_);
			i_96_ = 1 + i_97_;
		}
		stringbuilder.append(string.substring(i_96_));
		return stringbuilder.toString();
	}

	public static String method13819(String string, char c, String string_98_) {
		int i = string.length();
		int i_99_ = string_98_.length();
		int i_100_ = i;
		int i_101_ = i_99_ - 1;
		if (i_101_ != 0) {
			int i_102_ = 0;
			for (;;) {
				i_102_ = string.indexOf(c, i_102_);
				if (i_102_ < 0)
					break;
				i_102_++;
				i_100_ += i_101_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_100_);
		int i_103_ = 0;
		for (;;) {
			int i_104_ = string.indexOf(c, i_103_);
			if (i_104_ < 0)
				break;
			stringbuilder.append(string.substring(i_103_, i_104_));
			stringbuilder.append(string_98_);
			i_103_ = 1 + i_104_;
		}
		stringbuilder.append(string.substring(i_103_));
		return stringbuilder.toString();
	}

	public static String method13820(String string, char c, String string_105_) {
		int i = string.length();
		int i_106_ = string_105_.length();
		int i_107_ = i;
		int i_108_ = i_106_ - 1;
		if (i_108_ != 0) {
			int i_109_ = 0;
			for (;;) {
				i_109_ = string.indexOf(c, i_109_);
				if (i_109_ < 0)
					break;
				i_109_++;
				i_107_ += i_108_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_107_);
		int i_110_ = 0;
		for (;;) {
			int i_111_ = string.indexOf(c, i_110_);
			if (i_111_ < 0)
				break;
			stringbuilder.append(string.substring(i_110_, i_111_));
			stringbuilder.append(string_105_);
			i_110_ = 1 + i_111_;
		}
		stringbuilder.append(string.substring(i_110_));
		return stringbuilder.toString();
	}

	public static String method13821(String string, char c, String string_112_) {
		int i = string.length();
		int i_113_ = string_112_.length();
		int i_114_ = i;
		int i_115_ = i_113_ - 1;
		if (i_115_ != 0) {
			int i_116_ = 0;
			for (;;) {
				i_116_ = string.indexOf(c, i_116_);
				if (i_116_ < 0)
					break;
				i_116_++;
				i_114_ += i_115_;
			}
		}
		StringBuilder stringbuilder = new StringBuilder(i_114_);
		int i_117_ = 0;
		for (;;) {
			int i_118_ = string.indexOf(c, i_117_);
			if (i_118_ < 0)
				break;
			stringbuilder.append(string.substring(i_117_, i_118_));
			stringbuilder.append(string_112_);
			i_117_ = 1 + i_118_;
		}
		stringbuilder.append(string.substring(i_117_));
		return stringbuilder.toString();
	}

	public static boolean method13822(char c) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	public static boolean method13823(CharSequence charsequence) {
		return Class208_Sub3.method15608(charsequence, 10, true, (byte) -42);
	}

	public static boolean method13824(char c) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || '\u0152' == c || '\u2014' == c || '\u0153' == c || c == '\u0178')
			return true;
		return false;
	}

	public static boolean method13825(char c) {
		if (c >= ' ' && c <= '~')
			return true;
		if (c >= '\u00a0' && c <= '\u00ff')
			return true;
		if (c == '\u20ac' || '\u0152' == c || '\u2014' == c || '\u0153' == c || c == '\u0178')
			return true;
		return false;
	}

	static void method13826(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_119_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_120_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i_119_, (byte) -10);
		TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
		if (twitchwebcamdevice != null)
			twitchwebcamdevicecapability = twitchwebcamdevice.method1691(i_120_);
		if (null == twitchwebcamdevicecapability) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 654182613 * twitchwebcamdevicecapability.anInt1129;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1130 * 268176839;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1984150841 * twitchwebcamdevicecapability.anInt1131;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevicecapability.anInt1132 * 187330919;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1447398877 * twitchwebcamdevicecapability.anInt1133;
		}
	}

	static final void method13827(int i) {
		int i_121_ = 0;
		Class555 class555 = client.aClass509_11072.method8314(1900554408);
		for (int i_122_ = 0; i_122_ < client.aClass509_11072.method8284((byte) 110); i_122_++) {
			for (int i_123_ = 0; i_123_ < client.aClass509_11072.method8285(-24883885); i_123_++) {
				if (Class650.method10862(class555.aClass561ArrayArrayArray7426, i_121_, i_122_, i_123_, true, 1601224210))
					i_121_++;
				if (i_121_ >= 512)
					return;
			}
		}
	}

	public static String method13828(int i) {
		return Class63.aString739;
	}

	static Class581[] method13829(byte i) {
		return (new Class581[] { Class581.aClass581_7674, Class581.aClass581_7675 });
	}

	static boolean method13830(int i) {
		if (-1 != -1552456759 * Class32.anInt274)
			return Class700_Sub39.method17292(-281159195);
		return Class430.method6874(Class32.aString289, Class32.aString306, (byte) 81);
	}
}
