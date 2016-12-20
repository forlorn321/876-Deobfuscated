/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class22 {
	static String[] aStringArray210 = new String[100];
	byte[][] aByteArrayArray211;
	public int anInt212;
	public int anInt213;
	public Interface2 anInterface2_214;
	public int anInt215;
	byte[] aByteArray216;

	public int method777(String string, int i, Interface4[] interface4s) {
		int i_0_ = method783(string, new int[] { i }, aStringArray210, interface4s, 1168187470);
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			int i_3_ = method781(aStringArray210[i_2_], interface4s, (short) 386);
			if (i_3_ > i_1_)
				i_1_ = i_3_;
		}
		return i_1_;
	}

	public int method778(int i, char c, int i_4_) {
		if (aByteArrayArray211 != null)
			return aByteArrayArray211[i][c];
		return 0;
	}

	public int method779(int i) {
		return aByteArray216[i] & 0xff;
	}

	public int method780(String string, short i) {
		return method781(string, null, (short) 386);
	}

	public int method781(String string, Interface4[] interface4s, short i) {
		if (string == null)
			return 0;
		int i_5_ = -1;
		int i_6_ = -1;
		int i_7_ = 0;
		int i_8_ = string.length();
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			char c = string.charAt(i_9_);
			if (60 == c)
				i_5_ = i_9_;
			else {
				if (c == 62 && -1 != i_5_) {
					String string_10_ = string.substring(1 + i_5_, i_9_);
					i_5_ = -1;
					if (string_10_.equals("lt"))
						c = '<';
					else if (string_10_.equals("gt"))
						c = '>';
					else if (string_10_.equals("nbsp"))
						c = '\u00a0';
					else if (string_10_.equals("shy"))
						c = '\u00ad';
					else if (string_10_.equals("times"))
						c = '\u00d7';
					else if (string_10_.equals("euro"))
						c = '\u0080';
					else if (string_10_.equals("copy"))
						c = '\u00a9';
					else if (string_10_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_10_.startsWith("img=") && interface4s != null) {
							try {
								int i_11_ = Class360.method6326(string_10_.substring(4), (byte) -7);
								i_7_ += interface4s[i_11_].method42();
								i_6_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_10_.startsWith("sprite=") && anInterface2_214 != null) {
							try {
								int i_12_ = -1;
								int i_13_ = string_10_.indexOf(',');
								if (-1 == i_13_)
									i_12_ = (Class360.method6326(string_10_.substring(7), (byte) 38));
								else
									i_12_ = (Class360.method6326(string_10_.substring(7, i_13_), (byte) -57));
								i_7_ += anInterface2_214.method9(i_12_, (byte) 0);
								i_6_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_5_ == -1) {
					i_7_ += aByteArray216[(Class676.method13876(c, 1907269876) & 0xff)] & 0xff;
					if (aByteArrayArray211 != null && i_6_ != -1)
						i_7_ += aByteArrayArray211[i_6_][c];
					i_6_ = c;
				}
			}
		}
		return i_7_;
	}

	public String method782(String string, int i, Interface4[] interface4s) {
		if (method781(string, interface4s, (short) 386) <= i)
			return string;
		i -= method781("...", null, (short) 386);
		int i_14_ = -1;
		int i_15_ = -1;
		int i_16_ = 0;
		int i_17_ = string.length();
		String string_18_ = "";
		for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
			char c = string.charAt(i_19_);
			if (60 == c)
				i_14_ = i_19_;
			else {
				if (c == 62 && i_14_ != -1) {
					String string_20_ = string.substring(1 + i_14_, i_19_);
					i_14_ = -1;
					if (string_20_.equals("lt"))
						c = '<';
					else if (string_20_.equals("gt"))
						c = '>';
					else if (string_20_.equals("nbsp"))
						c = '\u00a0';
					else if (string_20_.equals("shy"))
						c = '\u00ad';
					else if (string_20_.equals("times"))
						c = '\u00d7';
					else if (string_20_.equals("euro"))
						c = '\u0080';
					else if (string_20_.equals("copy"))
						c = '\u00a9';
					else if (string_20_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_20_.startsWith("img=") && interface4s != null) {
							try {
								int i_21_ = Class360.method6326(string_20_.substring(4), (byte) 59);
								i_16_ += interface4s[i_21_].method42();
								i_15_ = -1;
								if (i_16_ > i)
									return new StringBuilder().append(string_18_).append("...").toString();
								string_18_ = string.substring(0, 1 + i_19_);
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_20_.startsWith("sprite=") && anInterface2_214 != null) {
							try {
								int i_22_ = -1;
								int i_23_ = string_20_.indexOf(',');
								if (i_23_ == -1)
									i_22_ = (Class360.method6326(string_20_.substring(7), (byte) -28));
								else
									i_22_ = (Class360.method6326(string_20_.substring(7, i_23_), (byte) 61));
								i_16_ += anInterface2_214.method9(i_22_, (byte) 0);
								i_15_ = -1;
								if (i_16_ > i)
									return new StringBuilder().append(string_18_).append("...").toString();
								string_18_ = string.substring(0, 1 + i_19_);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_14_) {
					i_16_ += aByteArray216[(Class676.method13876(c, 1907269876) & 0xff)] & 0xff;
					if (null != aByteArrayArray211 && i_15_ != -1)
						i_16_ += aByteArrayArray211[i_15_][c];
					i_15_ = c;
					int i_24_ = i_16_;
					if (aByteArrayArray211 != null)
						i_24_ += aByteArrayArray211[c][46];
					if (i_24_ > i)
						return new StringBuilder().append(string_18_).append("...").toString();
					string_18_ = string.substring(0, 1 + i_19_);
				}
			}
		}
		return string;
	}

	public int method783(String string, int[] is, String[] strings, Interface4[] interface4s, int i) {
		return method784(string, is, strings, interface4s, true, (byte) 51);
	}

	int method784(String string, int[] is, String[] strings, Interface4[] interface4s, boolean bool, byte i) {
		if (null == string)
			return 0;
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_ = -1;
		int i_28_ = 0;
		int i_29_ = 0;
		int i_30_ = -1;
		int i_31_ = -1;
		int i_32_ = 0;
		int i_33_ = string.length();
		for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
			int i_35_ = (Class676.method13876(string.charAt(i_34_), 1907269876) & 0xff);
			int i_36_ = 0;
			if (60 == i_35_)
				i_30_ = i_34_;
			else {
				int i_37_;
				if (-1 != i_30_) {
					if (62 != i_35_)
						continue;
					i_37_ = i_30_;
					String string_38_ = string.substring(i_30_ + 1, i_34_);
					i_30_ = -1;
					if (string_38_.equals("br")) {
						strings[i_32_] = string.substring(i_26_, 1 + i_34_);
						if (++i_32_ >= strings.length)
							return 0;
						i_26_ = 1 + i_34_;
						i_25_ = 0;
						i_27_ = -1;
						i_31_ = -1;
						continue;
					}
					if (string_38_.equals("lt")) {
						i_36_ += method788(60, (short) 27285);
						if (null != aByteArrayArray211 && i_31_ != -1)
							i_36_ += aByteArrayArray211[i_31_][60];
						i_31_ = 60;
					} else if (string_38_.equals("gt")) {
						i_36_ += method788(62, (short) 25878);
						if (aByteArrayArray211 != null && i_31_ != -1)
							i_36_ += aByteArrayArray211[i_31_][62];
						i_31_ = 62;
					} else if (string_38_.equals("nbsp")) {
						i_36_ += method788(160, (short) 15274);
						if (null != aByteArrayArray211 && -1 != i_31_)
							i_36_ += aByteArrayArray211[i_31_][160];
						i_31_ = 160;
					} else if (string_38_.equals("shy")) {
						i_36_ += method788(173, (short) 23519);
						if (aByteArrayArray211 != null && i_31_ != -1)
							i_36_ += aByteArrayArray211[i_31_][173];
						i_31_ = 173;
					} else if (string_38_.equals("times")) {
						i_36_ += method788(215, (short) 26798);
						if (aByteArrayArray211 != null && i_31_ != -1)
							i_36_ += aByteArrayArray211[i_31_][215];
						i_31_ = 215;
					} else if (string_38_.equals("euro")) {
						i_36_ += method788(128, (short) 15753);
						if (aByteArrayArray211 != null && -1 != i_31_)
							i_36_ += aByteArrayArray211[i_31_][128];
						i_31_ = 128;
					} else if (string_38_.equals("copy")) {
						i_36_ += method788(169, (short) 12727);
						if (null != aByteArrayArray211 && i_31_ != -1)
							i_36_ += aByteArrayArray211[i_31_][169];
						i_31_ = 169;
					} else if (string_38_.equals("reg")) {
						i_36_ += method788(174, (short) 31037);
						if (aByteArrayArray211 != null && -1 != i_31_)
							i_36_ += aByteArrayArray211[i_31_][174];
						i_31_ = 174;
					} else if (string_38_.startsWith("img=") && null != interface4s) {
						try {
							int i_39_ = Class360.method6326(string_38_.substring(4), (byte) 85);
							i_36_ += interface4s[i_39_].method42();
							i_31_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					} else if (string_38_.startsWith("sprite=") && anInterface2_214 != null) {
						try {
							int i_40_ = -1;
							int i_41_ = string_38_.indexOf(',');
							if (i_41_ == -1)
								i_40_ = Class360.method6326(string_38_.substring(7), (byte) 5);
							else
								i_40_ = (Class360.method6326(string_38_.substring(7, i_41_), (byte) 63));
							i_36_ += anInterface2_214.method9(i_40_, (byte) 0);
							i_31_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
						continue;
					}
					i_35_ = -1;
				} else {
					i_37_ = i_34_;
					i_36_ += method788(i_35_, (short) 23964);
					if (null != aByteArrayArray211 && -1 != i_31_)
						i_36_ += aByteArrayArray211[i_31_][i_35_];
					i_31_ = i_35_;
				}
				if (i_36_ > 0) {
					i_25_ += i_36_;
					if (null != is) {
						if (32 == i_35_) {
							i_27_ = i_34_;
							i_28_ = i_25_;
							i_29_ = bool ? 1 : 0;
						}
						if (i_25_ > is[i_32_ < is.length ? i_32_ : is.length - 1]) {
							if (i_27_ >= 0) {
								strings[i_32_] = string.substring(i_26_, 1 + i_27_ - i_29_);
								if (++i_32_ >= strings.length)
									return 0;
								i_26_ = 1 + i_27_;
								i_27_ = -1;
								i_25_ -= i_28_;
								i_31_ = -1;
							} else {
								strings[i_32_] = string.substring(i_26_, i_37_);
								if (++i_32_ >= strings.length)
									return 0;
								i_26_ = i_37_;
								i_27_ = -1;
								i_25_ = i_36_;
								i_31_ = -1;
							}
						}
						if (i_35_ == 45) {
							i_27_ = i_34_;
							i_28_ = i_25_;
							i_29_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_26_) {
			strings[i_32_] = string.substring(i_26_, string.length());
			i_32_++;
		}
		return i_32_;
	}

	static int method785(byte[][] is, byte[][] is_42_, int[] is_43_, byte[] is_44_, int[] is_45_, int i, int i_46_) {
		int i_47_ = is_43_[i];
		int i_48_ = is_45_[i] + i_47_;
		int i_49_ = is_43_[i_46_];
		int i_50_ = i_49_ + is_45_[i_46_];
		int i_51_ = i_47_;
		if (i_49_ > i_47_)
			i_51_ = i_49_;
		int i_52_ = i_48_;
		if (i_50_ < i_48_)
			i_52_ = i_50_;
		int i_53_ = is_44_[i] & 0xff;
		if ((is_44_[i_46_] & 0xff) < i_53_)
			i_53_ = is_44_[i_46_] & 0xff;
		byte[] is_54_ = is_42_[i];
		byte[] is_55_ = is[i_46_];
		int i_56_ = i_51_ - i_47_;
		int i_57_ = i_51_ - i_49_;
		for (int i_58_ = i_51_; i_58_ < i_52_; i_58_++) {
			int i_59_ = is_54_[i_56_++] + is_55_[i_57_++];
			if (i_59_ < i_53_)
				i_53_ = i_59_;
		}
		return -i_53_;
	}

	public int method786(String string, int i, Interface4[] interface4s, byte i_60_) {
		return method783(string, new int[] { i }, aStringArray210, interface4s, -1419819032);
	}

	public int method787(String string, int[] is, String[] strings, Interface4[] interface4s) {
		return method784(string, is, strings, interface4s, true, (byte) 33);
	}

	public int method788(int i, short i_61_) {
		return aByteArray216[i] & 0xff;
	}

	public Point method789(String string, int i, int i_62_, int i_63_, Interface4[] interface4s, int i_64_) {
		if (i_63_ <= 0)
			return new Point(0, i_62_ + anInt215 * -63286397);
		if (i_63_ > string.length())
			i_63_ = string.length();
		if (0 == i_62_)
			i_62_ = 169086347 * anInt212;
		int i_65_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) 11);
		int i_66_ = 0;
		for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
			int i_68_ = aStringArray210[i_67_].length();
			if (i_66_ + i_68_ > i_63_ || i_65_ - 1 == i_67_ && i_63_ == string.length()) {
				String string_69_ = string.substring(i_66_, i_63_);
				if (string_69_.endsWith("<br>")) {
					string_69_ = "";
					i_66_ += i_68_;
					i_67_++;
				}
				int i_70_ = method781(string_69_, interface4s, (short) 386);
				int i_71_ = i_67_ * i_62_ + -63286397 * anInt215;
				return new Point(i_70_, i_71_);
			}
			i_66_ += i_68_;
		}
		return null;
	}

	public int method790(String string, int i, int i_72_, int i_73_, int i_74_, Interface4[] interface4s, int i_75_) {
		if (0 == i_72_)
			i_72_ = 169086347 * anInt212;
		int i_76_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) -24);
		if (0 == i_76_)
			return 0;
		if (i_74_ < 0)
			i_74_ = 0;
		i_74_ /= i_72_;
		if (i_74_ >= i_76_)
			i_74_ = i_76_ - 1;
		String string_77_ = aStringArray210[i_74_];
		int i_78_ = 0;
		int i_79_ = 0;
		int i_80_;
		for (i_80_ = 0; i_80_ < i_73_ && i_78_ < string_77_.length(); i_80_ = method781(string_77_.substring(0, ++i_78_), interface4s, (short) 386))
			i_79_ = i_80_;
		if (i_78_ == string_77_.length() && string_77_.endsWith("<br>"))
			i_78_ -= 4;
		if (i_73_ - i_79_ < i_80_ - i_73_)
			i_78_--;
		for (int i_81_ = 0; i_81_ < i_74_; i_81_++)
			i_78_ += aStringArray210[i_81_].length();
		return i_78_;
	}

	public String method791(String string, int i, Interface4[] interface4s, byte i_82_) {
		if (method781(string, interface4s, (short) 386) <= i)
			return string;
		i -= method781("...", null, (short) 386);
		int i_83_ = -1;
		int i_84_ = -1;
		int i_85_ = 0;
		int i_86_ = string.length();
		String string_87_ = "";
		for (int i_88_ = 0; i_88_ < i_86_; i_88_++) {
			char c = string.charAt(i_88_);
			if (60 == c)
				i_83_ = i_88_;
			else {
				if (c == 62 && i_83_ != -1) {
					String string_89_ = string.substring(1 + i_83_, i_88_);
					i_83_ = -1;
					if (string_89_.equals("lt"))
						c = '<';
					else if (string_89_.equals("gt"))
						c = '>';
					else if (string_89_.equals("nbsp"))
						c = '\u00a0';
					else if (string_89_.equals("shy"))
						c = '\u00ad';
					else if (string_89_.equals("times"))
						c = '\u00d7';
					else if (string_89_.equals("euro"))
						c = '\u0080';
					else if (string_89_.equals("copy"))
						c = '\u00a9';
					else if (string_89_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_89_.startsWith("img=") && interface4s != null) {
							try {
								int i_90_ = Class360.method6326(string_89_.substring(4), (byte) -74);
								i_85_ += interface4s[i_90_].method42();
								i_84_ = -1;
								if (i_85_ > i)
									return new StringBuilder().append(string_87_).append("...").toString();
								string_87_ = string.substring(0, 1 + i_88_);
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_89_.startsWith("sprite=") && anInterface2_214 != null) {
							try {
								int i_91_ = -1;
								int i_92_ = string_89_.indexOf(',');
								if (i_92_ == -1)
									i_91_ = (Class360.method6326(string_89_.substring(7), (byte) 65));
								else
									i_91_ = (Class360.method6326(string_89_.substring(7, i_92_), (byte) -14));
								i_85_ += anInterface2_214.method9(i_91_, (byte) 0);
								i_84_ = -1;
								if (i_85_ > i)
									return new StringBuilder().append(string_87_).append("...").toString();
								string_87_ = string.substring(0, 1 + i_88_);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_83_) {
					i_85_ += aByteArray216[(Class676.method13876(c, 1907269876) & 0xff)] & 0xff;
					if (null != aByteArrayArray211 && i_84_ != -1)
						i_85_ += aByteArrayArray211[i_84_][c];
					i_84_ = c;
					int i_93_ = i_85_;
					if (aByteArrayArray211 != null)
						i_93_ += aByteArrayArray211[c][46];
					if (i_93_ > i)
						return new StringBuilder().append(string_87_).append("...").toString();
					string_87_ = string.substring(0, 1 + i_88_);
				}
			}
		}
		return string;
	}

	public static Class22 method792(Class459 class459, int i, int i_94_) {
		return Class504.method8220(class459, i, i_94_, null, (byte) -33);
	}

	public static Class22 method793(Class459 class459, int i, int i_95_, Interface2 interface2) {
		byte[] is = class459.method7470(i, i_95_, (byte) -4);
		if (null == is)
			return null;
		return new Class22(is, interface2);
	}

	public static Class22 method794(Class459 class459, int i, Interface2 interface2) {
		byte[] is = class459.method7512(i, 1447980132);
		if (null == is)
			return null;
		return new Class22(is, interface2);
	}

	public static Class22 method795(Class459 class459, int i, Interface2 interface2) {
		byte[] is = class459.method7512(i, 1447980132);
		if (null == is)
			return null;
		return new Class22(is, interface2);
	}

	public int method796(String string, int i, Interface4[] interface4s) {
		return method783(string, new int[] { i }, aStringArray210, interface4s, 1100911084);
	}

	static int method797(byte[][] is, byte[][] is_96_, int[] is_97_, byte[] is_98_, int[] is_99_, int i, int i_100_) {
		int i_101_ = is_97_[i];
		int i_102_ = is_99_[i] + i_101_;
		int i_103_ = is_97_[i_100_];
		int i_104_ = i_103_ + is_99_[i_100_];
		int i_105_ = i_101_;
		if (i_103_ > i_101_)
			i_105_ = i_103_;
		int i_106_ = i_102_;
		if (i_104_ < i_102_)
			i_106_ = i_104_;
		int i_107_ = is_98_[i] & 0xff;
		if ((is_98_[i_100_] & 0xff) < i_107_)
			i_107_ = is_98_[i_100_] & 0xff;
		byte[] is_108_ = is_96_[i];
		byte[] is_109_ = is[i_100_];
		int i_110_ = i_105_ - i_101_;
		int i_111_ = i_105_ - i_103_;
		for (int i_112_ = i_105_; i_112_ < i_106_; i_112_++) {
			int i_113_ = is_108_[i_110_++] + is_109_[i_111_++];
			if (i_113_ < i_107_)
				i_107_ = i_113_;
		}
		return -i_107_;
	}

	public int method798(String string, int i, Interface4[] interface4s, int i_114_) {
		int i_115_ = method783(string, new int[] { i }, aStringArray210, interface4s, 669478082);
		int i_116_ = 0;
		for (int i_117_ = 0; i_117_ < i_115_; i_117_++) {
			int i_118_ = method781(aStringArray210[i_117_], interface4s, (short) 386);
			if (i_118_ > i_116_)
				i_116_ = i_118_;
		}
		return i_116_;
	}

	public int method799(int i) {
		return aByteArray216[i] & 0xff;
	}

	public int method800(int i) {
		return aByteArray216[i] & 0xff;
	}

	public String method801(String string, int i, Interface4[] interface4s, int i_119_, int i_120_) {
		int i_121_ = method783(string, new int[] { i }, aStringArray210, interface4s, -1078432173);
		if (i_119_ >= 0 && i_119_ < i_121_)
			return aStringArray210[i_119_];
		return null;
	}

	public String method802(String string, int i, Interface4[] interface4s) {
		if (method781(string, interface4s, (short) 386) <= i)
			return string;
		i -= method781("...", null, (short) 386);
		int i_122_ = -1;
		int i_123_ = -1;
		int i_124_ = 0;
		int i_125_ = string.length();
		String string_126_ = "";
		for (int i_127_ = 0; i_127_ < i_125_; i_127_++) {
			char c = string.charAt(i_127_);
			if (60 == c)
				i_122_ = i_127_;
			else {
				if (c == 62 && i_122_ != -1) {
					String string_128_ = string.substring(1 + i_122_, i_127_);
					i_122_ = -1;
					if (string_128_.equals("lt"))
						c = '<';
					else if (string_128_.equals("gt"))
						c = '>';
					else if (string_128_.equals("nbsp"))
						c = '\u00a0';
					else if (string_128_.equals("shy"))
						c = '\u00ad';
					else if (string_128_.equals("times"))
						c = '\u00d7';
					else if (string_128_.equals("euro"))
						c = '\u0080';
					else if (string_128_.equals("copy"))
						c = '\u00a9';
					else if (string_128_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_128_.startsWith("img=") && interface4s != null) {
							try {
								int i_129_ = Class360.method6326(string_128_.substring(4), (byte) -41);
								i_124_ += interface4s[i_129_].method42();
								i_123_ = -1;
								if (i_124_ > i)
									return new StringBuilder().append(string_126_).append("...").toString();
								string_126_ = string.substring(0, 1 + i_127_);
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_128_.startsWith("sprite=") && anInterface2_214 != null) {
							try {
								int i_130_ = -1;
								int i_131_ = string_128_.indexOf(',');
								if (i_131_ == -1)
									i_130_ = (Class360.method6326(string_128_.substring(7), (byte) -23));
								else
									i_130_ = (Class360.method6326(string_128_.substring(7, i_131_), (byte) 90));
								i_124_ += anInterface2_214.method9(i_130_, (byte) 0);
								i_123_ = -1;
								if (i_124_ > i)
									return new StringBuilder().append(string_126_).append("...").toString();
								string_126_ = string.substring(0, 1 + i_127_);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_122_) {
					i_124_ += aByteArray216[(Class676.method13876(c, 1907269876) & 0xff)] & 0xff;
					if (null != aByteArrayArray211 && i_123_ != -1)
						i_124_ += aByteArrayArray211[i_123_][c];
					i_123_ = c;
					int i_132_ = i_124_;
					if (aByteArrayArray211 != null)
						i_132_ += aByteArrayArray211[c][46];
					if (i_132_ > i)
						return new StringBuilder().append(string_126_).append("...").toString();
					string_126_ = string.substring(0, 1 + i_127_);
				}
			}
		}
		return string;
	}

	public int method803(String string) {
		return method781(string, null, (short) 386);
	}

	public int method804(String string) {
		return method781(string, null, (short) 386);
	}

	public int method805(String string, int i, Interface4[] interface4s) {
		return method783(string, new int[] { i }, aStringArray210, interface4s, -816515418);
	}

	public int method806(int i, char c) {
		if (aByteArrayArray211 != null)
			return aByteArrayArray211[i][c];
		return 0;
	}

	public String method807(String string, int i, Interface4[] interface4s) {
		if (method781(string, interface4s, (short) 386) <= i)
			return string;
		i -= method781("...", null, (short) 386);
		int i_133_ = -1;
		int i_134_ = -1;
		int i_135_ = 0;
		int i_136_ = string.length();
		String string_137_ = "";
		for (int i_138_ = 0; i_138_ < i_136_; i_138_++) {
			char c = string.charAt(i_138_);
			if (60 == c)
				i_133_ = i_138_;
			else {
				if (c == 62 && i_133_ != -1) {
					String string_139_ = string.substring(1 + i_133_, i_138_);
					i_133_ = -1;
					if (string_139_.equals("lt"))
						c = '<';
					else if (string_139_.equals("gt"))
						c = '>';
					else if (string_139_.equals("nbsp"))
						c = '\u00a0';
					else if (string_139_.equals("shy"))
						c = '\u00ad';
					else if (string_139_.equals("times"))
						c = '\u00d7';
					else if (string_139_.equals("euro"))
						c = '\u0080';
					else if (string_139_.equals("copy"))
						c = '\u00a9';
					else if (string_139_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_139_.startsWith("img=") && interface4s != null) {
							try {
								int i_140_ = Class360.method6326(string_139_.substring(4), (byte) -14);
								i_135_ += interface4s[i_140_].method42();
								i_134_ = -1;
								if (i_135_ > i)
									return new StringBuilder().append(string_137_).append("...").toString();
								string_137_ = string.substring(0, 1 + i_138_);
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_139_.startsWith("sprite=") && anInterface2_214 != null) {
							try {
								int i_141_ = -1;
								int i_142_ = string_139_.indexOf(',');
								if (i_142_ == -1)
									i_141_ = (Class360.method6326(string_139_.substring(7), (byte) 28));
								else
									i_141_ = (Class360.method6326(string_139_.substring(7, i_142_), (byte) 4));
								i_135_ += anInterface2_214.method9(i_141_, (byte) 0);
								i_134_ = -1;
								if (i_135_ > i)
									return new StringBuilder().append(string_137_).append("...").toString();
								string_137_ = string.substring(0, 1 + i_138_);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_133_) {
					i_135_ += aByteArray216[(Class676.method13876(c, 1907269876) & 0xff)] & 0xff;
					if (null != aByteArrayArray211 && i_134_ != -1)
						i_135_ += aByteArrayArray211[i_134_][c];
					i_134_ = c;
					int i_143_ = i_135_;
					if (aByteArrayArray211 != null)
						i_143_ += aByteArrayArray211[c][46];
					if (i_143_ > i)
						return new StringBuilder().append(string_137_).append("...").toString();
					string_137_ = string.substring(0, 1 + i_138_);
				}
			}
		}
		return string;
	}

	Class22(byte[] is, Interface2 interface2) {
		anInterface2_214 = interface2;
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		int i = class527_sub38.readUnsignedByte();
		if (i != 0)
			throw new RuntimeException("");
		boolean bool = class527_sub38.readUnsignedByte() == 1;
		aByteArray216 = new byte[256];
		class527_sub38.method16460(aByteArray216, 0, 256, -1886360781);
		if (bool) {
			int[] is_144_ = new int[256];
			int[] is_145_ = new int[256];
			for (int i_146_ = 0; i_146_ < 256; i_146_++)
				is_144_[i_146_] = class527_sub38.readUnsignedByte();
			for (int i_147_ = 0; i_147_ < 256; i_147_++)
				is_145_[i_147_] = class527_sub38.readUnsignedByte();
			byte[][] is_148_ = new byte[256][];
			for (int i_149_ = 0; i_149_ < 256; i_149_++) {
				is_148_[i_149_] = new byte[is_144_[i_149_]];
				byte i_150_ = 0;
				for (int i_151_ = 0; i_151_ < is_148_[i_149_].length; i_151_++) {
					i_150_ += class527_sub38.readByte();
					is_148_[i_149_][i_151_] = i_150_;
				}
			}
			byte[][] is_152_ = new byte[256][];
			for (int i_153_ = 0; i_153_ < 256; i_153_++) {
				is_152_[i_153_] = new byte[is_144_[i_153_]];
				byte i_154_ = 0;
				for (int i_155_ = 0; i_155_ < is_152_[i_153_].length; i_155_++) {
					i_154_ += class527_sub38.readByte();
					is_152_[i_153_][i_155_] = i_154_;
				}
			}
			aByteArrayArray211 = new byte[256][256];
			for (int i_156_ = 0; i_156_ < 256; i_156_++) {
				if (32 != i_156_ && 160 != i_156_) {
					for (int i_157_ = 0; i_157_ < 256; i_157_++) {
						if (i_157_ != 32 && i_157_ != 160)
							aByteArrayArray211[i_156_][i_157_] = (byte) Class562.method9464(is_148_, is_152_, is_145_, aByteArray216, is_144_, i_156_, i_157_, 2087079739);
					}
				}
			}
			anInt212 = 1534538275 * (is_144_[32] + is_145_[32]);
		} else
			anInt212 = class527_sub38.readUnsignedByte() * 1534538275;
		class527_sub38.readUnsignedByte();
		class527_sub38.readUnsignedByte();
		anInt215 = class527_sub38.readUnsignedByte() * 1643500331;
		anInt213 = class527_sub38.readUnsignedByte() * -685146643;
	}

	int method808(String string, int[] is, String[] strings, Interface4[] interface4s, boolean bool) {
		if (null == string)
			return 0;
		int i = 0;
		int i_158_ = 0;
		int i_159_ = -1;
		int i_160_ = 0;
		int i_161_ = 0;
		int i_162_ = -1;
		int i_163_ = -1;
		int i_164_ = 0;
		int i_165_ = string.length();
		for (int i_166_ = 0; i_166_ < i_165_; i_166_++) {
			int i_167_ = (Class676.method13876(string.charAt(i_166_), 1907269876) & 0xff);
			int i_168_ = 0;
			if (60 == i_167_)
				i_162_ = i_166_;
			else {
				int i_169_;
				if (-1 != i_162_) {
					if (62 != i_167_)
						continue;
					i_169_ = i_162_;
					String string_170_ = string.substring(i_162_ + 1, i_166_);
					i_162_ = -1;
					if (string_170_.equals("br")) {
						strings[i_164_] = string.substring(i_158_, 1 + i_166_);
						if (++i_164_ >= strings.length)
							return 0;
						i_158_ = 1 + i_166_;
						i = 0;
						i_159_ = -1;
						i_163_ = -1;
						continue;
					}
					if (string_170_.equals("lt")) {
						i_168_ += method788(60, (short) 31762);
						if (null != aByteArrayArray211 && i_163_ != -1)
							i_168_ += aByteArrayArray211[i_163_][60];
						i_163_ = 60;
					} else if (string_170_.equals("gt")) {
						i_168_ += method788(62, (short) 27318);
						if (aByteArrayArray211 != null && i_163_ != -1)
							i_168_ += aByteArrayArray211[i_163_][62];
						i_163_ = 62;
					} else if (string_170_.equals("nbsp")) {
						i_168_ += method788(160, (short) 15097);
						if (null != aByteArrayArray211 && -1 != i_163_)
							i_168_ += aByteArrayArray211[i_163_][160];
						i_163_ = 160;
					} else if (string_170_.equals("shy")) {
						i_168_ += method788(173, (short) 10349);
						if (aByteArrayArray211 != null && i_163_ != -1)
							i_168_ += aByteArrayArray211[i_163_][173];
						i_163_ = 173;
					} else if (string_170_.equals("times")) {
						i_168_ += method788(215, (short) 27532);
						if (aByteArrayArray211 != null && i_163_ != -1)
							i_168_ += aByteArrayArray211[i_163_][215];
						i_163_ = 215;
					} else if (string_170_.equals("euro")) {
						i_168_ += method788(128, (short) 17062);
						if (aByteArrayArray211 != null && -1 != i_163_)
							i_168_ += aByteArrayArray211[i_163_][128];
						i_163_ = 128;
					} else if (string_170_.equals("copy")) {
						i_168_ += method788(169, (short) 14590);
						if (null != aByteArrayArray211 && i_163_ != -1)
							i_168_ += aByteArrayArray211[i_163_][169];
						i_163_ = 169;
					} else if (string_170_.equals("reg")) {
						i_168_ += method788(174, (short) 22393);
						if (aByteArrayArray211 != null && -1 != i_163_)
							i_168_ += aByteArrayArray211[i_163_][174];
						i_163_ = 174;
					} else if (string_170_.startsWith("img=") && null != interface4s) {
						try {
							int i_171_ = Class360.method6326(string_170_.substring(4), (byte) 43);
							i_168_ += interface4s[i_171_].method42();
							i_163_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					} else if (string_170_.startsWith("sprite=") && anInterface2_214 != null) {
						try {
							int i_172_ = -1;
							int i_173_ = string_170_.indexOf(',');
							if (i_173_ == -1)
								i_172_ = Class360.method6326(string_170_.substring(7), (byte) 9);
							else
								i_172_ = (Class360.method6326(string_170_.substring(7, i_173_), (byte) -31));
							i_168_ += anInterface2_214.method9(i_172_, (byte) 0);
							i_163_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
						continue;
					}
					i_167_ = -1;
				} else {
					i_169_ = i_166_;
					i_168_ += method788(i_167_, (short) 11450);
					if (null != aByteArrayArray211 && -1 != i_163_)
						i_168_ += aByteArrayArray211[i_163_][i_167_];
					i_163_ = i_167_;
				}
				if (i_168_ > 0) {
					i += i_168_;
					if (null != is) {
						if (32 == i_167_) {
							i_159_ = i_166_;
							i_160_ = i;
							i_161_ = bool ? 1 : 0;
						}
						if (i > is[(i_164_ < is.length ? i_164_ : is.length - 1)]) {
							if (i_159_ >= 0) {
								strings[i_164_] = string.substring(i_158_, 1 + i_159_ - i_161_);
								if (++i_164_ >= strings.length)
									return 0;
								i_158_ = 1 + i_159_;
								i_159_ = -1;
								i -= i_160_;
								i_163_ = -1;
							} else {
								strings[i_164_] = string.substring(i_158_, i_169_);
								if (++i_164_ >= strings.length)
									return 0;
								i_158_ = i_169_;
								i_159_ = -1;
								i = i_168_;
								i_163_ = -1;
							}
						}
						if (i_167_ == 45) {
							i_159_ = i_166_;
							i_160_ = i;
							i_161_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_158_) {
			strings[i_164_] = string.substring(i_158_, string.length());
			i_164_++;
		}
		return i_164_;
	}

	public int method809(String string) {
		return method781(string, null, (short) 386);
	}

	public int method810(String string, int i, int i_174_, Interface4[] interface4s, int i_175_) {
		if (0 == i_174_)
			i_174_ = 169086347 * anInt212;
		int i_176_ = method783(string, new int[] { i }, aStringArray210, interface4s, 1585510221);
		int i_177_ = i_174_ * (i_176_ - 1);
		return i_177_ + -63286397 * anInt215 + 672688101 * anInt213;
	}

	public String method811(String string, int i, Interface4[] interface4s, int i_178_) {
		int i_179_ = method783(string, new int[] { i }, aStringArray210, interface4s, 931139653);
		if (i_178_ >= 0 && i_178_ < i_179_)
			return aStringArray210[i_178_];
		return null;
	}

	public String method812(String string, int i, Interface4[] interface4s, int i_180_) {
		int i_181_ = method783(string, new int[] { i }, aStringArray210, interface4s, 295950669);
		if (i_180_ >= 0 && i_180_ < i_181_)
			return aStringArray210[i_180_];
		return null;
	}

	public int method813(String string, int i, int i_182_, Interface4[] interface4s) {
		if (0 == i_182_)
			i_182_ = 169086347 * anInt212;
		int i_183_ = method783(string, new int[] { i }, aStringArray210, interface4s, -1233057472);
		int i_184_ = i_182_ * (i_183_ - 1);
		return i_184_ + -63286397 * anInt215 + 672688101 * anInt213;
	}

	public Point method814(String string, int i, int i_185_, int i_186_, Interface4[] interface4s) {
		if (i_186_ <= 0)
			return new Point(0, i_185_ + anInt215 * -63286397);
		if (i_186_ > string.length())
			i_186_ = string.length();
		if (0 == i_185_)
			i_185_ = 169086347 * anInt212;
		int i_187_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) -14);
		int i_188_ = 0;
		for (int i_189_ = 0; i_189_ < i_187_; i_189_++) {
			int i_190_ = aStringArray210[i_189_].length();
			if (i_188_ + i_190_ > i_186_ || i_187_ - 1 == i_189_ && i_186_ == string.length()) {
				String string_191_ = string.substring(i_188_, i_186_);
				if (string_191_.endsWith("<br>")) {
					string_191_ = "";
					i_188_ += i_190_;
					i_189_++;
				}
				int i_192_ = method781(string_191_, interface4s, (short) 386);
				int i_193_ = i_189_ * i_185_ + -63286397 * anInt215;
				return new Point(i_192_, i_193_);
			}
			i_188_ += i_190_;
		}
		return null;
	}

	public Point method815(String string, int i, int i_194_, int i_195_, Interface4[] interface4s) {
		if (i_195_ <= 0)
			return new Point(0, i_194_ + anInt215 * -63286397);
		if (i_195_ > string.length())
			i_195_ = string.length();
		if (0 == i_194_)
			i_194_ = 169086347 * anInt212;
		int i_196_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) 16);
		int i_197_ = 0;
		for (int i_198_ = 0; i_198_ < i_196_; i_198_++) {
			int i_199_ = aStringArray210[i_198_].length();
			if (i_197_ + i_199_ > i_195_ || i_196_ - 1 == i_198_ && i_195_ == string.length()) {
				String string_200_ = string.substring(i_197_, i_195_);
				if (string_200_.endsWith("<br>")) {
					string_200_ = "";
					i_197_ += i_199_;
					i_198_++;
				}
				int i_201_ = method781(string_200_, interface4s, (short) 386);
				int i_202_ = i_198_ * i_194_ + -63286397 * anInt215;
				return new Point(i_201_, i_202_);
			}
			i_197_ += i_199_;
		}
		return null;
	}

	public int method816(String string, int i, int i_203_, int i_204_, int i_205_, Interface4[] interface4s) {
		if (0 == i_203_)
			i_203_ = 169086347 * anInt212;
		int i_206_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) 19);
		if (0 == i_206_)
			return 0;
		if (i_205_ < 0)
			i_205_ = 0;
		i_205_ /= i_203_;
		if (i_205_ >= i_206_)
			i_205_ = i_206_ - 1;
		String string_207_ = aStringArray210[i_205_];
		int i_208_ = 0;
		int i_209_ = 0;
		int i_210_;
		for (i_210_ = 0; i_210_ < i_204_ && i_208_ < string_207_.length(); i_210_ = method781(string_207_.substring(0, ++i_208_), interface4s, (short) 386))
			i_209_ = i_210_;
		if (i_208_ == string_207_.length() && string_207_.endsWith("<br>"))
			i_208_ -= 4;
		if (i_204_ - i_209_ < i_210_ - i_204_)
			i_208_--;
		for (int i_211_ = 0; i_211_ < i_205_; i_211_++)
			i_208_ += aStringArray210[i_211_].length();
		return i_208_;
	}

	public int method817(String string, int i, int i_212_, int i_213_, int i_214_, Interface4[] interface4s) {
		if (0 == i_212_)
			i_212_ = 169086347 * anInt212;
		int i_215_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) 52);
		if (0 == i_215_)
			return 0;
		if (i_214_ < 0)
			i_214_ = 0;
		i_214_ /= i_212_;
		if (i_214_ >= i_215_)
			i_214_ = i_215_ - 1;
		String string_216_ = aStringArray210[i_214_];
		int i_217_ = 0;
		int i_218_ = 0;
		int i_219_;
		for (i_219_ = 0; i_219_ < i_213_ && i_217_ < string_216_.length(); i_219_ = method781(string_216_.substring(0, ++i_217_), interface4s, (short) 386))
			i_218_ = i_219_;
		if (i_217_ == string_216_.length() && string_216_.endsWith("<br>"))
			i_217_ -= 4;
		if (i_213_ - i_218_ < i_219_ - i_213_)
			i_217_--;
		for (int i_220_ = 0; i_220_ < i_214_; i_220_++)
			i_217_ += aStringArray210[i_220_].length();
		return i_217_;
	}

	public int method818(String string, int i, int i_221_, int i_222_, int i_223_, Interface4[] interface4s) {
		if (0 == i_221_)
			i_221_ = 169086347 * anInt212;
		int i_224_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) 57);
		if (0 == i_224_)
			return 0;
		if (i_223_ < 0)
			i_223_ = 0;
		i_223_ /= i_221_;
		if (i_223_ >= i_224_)
			i_223_ = i_224_ - 1;
		String string_225_ = aStringArray210[i_223_];
		int i_226_ = 0;
		int i_227_ = 0;
		int i_228_;
		for (i_228_ = 0; i_228_ < i_222_ && i_226_ < string_225_.length(); i_228_ = method781(string_225_.substring(0, ++i_226_), interface4s, (short) 386))
			i_227_ = i_228_;
		if (i_226_ == string_225_.length() && string_225_.endsWith("<br>"))
			i_226_ -= 4;
		if (i_222_ - i_227_ < i_228_ - i_222_)
			i_226_--;
		for (int i_229_ = 0; i_229_ < i_223_; i_229_++)
			i_226_ += aStringArray210[i_229_].length();
		return i_226_;
	}

	public int method819(String string, int i, int i_230_, int i_231_, int i_232_, Interface4[] interface4s) {
		if (0 == i_230_)
			i_230_ = 169086347 * anInt212;
		int i_233_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) -38);
		if (0 == i_233_)
			return 0;
		if (i_232_ < 0)
			i_232_ = 0;
		i_232_ /= i_230_;
		if (i_232_ >= i_233_)
			i_232_ = i_233_ - 1;
		String string_234_ = aStringArray210[i_232_];
		int i_235_ = 0;
		int i_236_ = 0;
		int i_237_;
		for (i_237_ = 0; i_237_ < i_231_ && i_235_ < string_234_.length(); i_237_ = method781(string_234_.substring(0, ++i_235_), interface4s, (short) 386))
			i_236_ = i_237_;
		if (i_235_ == string_234_.length() && string_234_.endsWith("<br>"))
			i_235_ -= 4;
		if (i_231_ - i_236_ < i_237_ - i_231_)
			i_235_--;
		for (int i_238_ = 0; i_238_ < i_232_; i_238_++)
			i_235_ += aStringArray210[i_238_].length();
		return i_235_;
	}

	public int method820(String string, int i, int i_239_, int i_240_, int i_241_, Interface4[] interface4s) {
		if (0 == i_239_)
			i_239_ = 169086347 * anInt212;
		int i_242_ = method784(string, new int[] { i }, aStringArray210, interface4s, false, (byte) -90);
		if (0 == i_242_)
			return 0;
		if (i_241_ < 0)
			i_241_ = 0;
		i_241_ /= i_239_;
		if (i_241_ >= i_242_)
			i_241_ = i_242_ - 1;
		String string_243_ = aStringArray210[i_241_];
		int i_244_ = 0;
		int i_245_ = 0;
		int i_246_;
		for (i_246_ = 0; i_246_ < i_240_ && i_244_ < string_243_.length(); i_246_ = method781(string_243_.substring(0, ++i_244_), interface4s, (short) 386))
			i_245_ = i_246_;
		if (i_244_ == string_243_.length() && string_243_.endsWith("<br>"))
			i_244_ -= 4;
		if (i_240_ - i_245_ < i_246_ - i_240_)
			i_244_--;
		for (int i_247_ = 0; i_247_ < i_241_; i_247_++)
			i_244_ += aStringArray210[i_247_].length();
		return i_244_;
	}
}
