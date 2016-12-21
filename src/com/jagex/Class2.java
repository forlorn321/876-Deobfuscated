/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Point;

public class Class2 {
	byte[] aByteArray88;
	byte[][] aByteArrayArray89;
	public int anInt90;
	public int anInt91;
	public int anInt92;
	static String[] aStringArray93 = new String[100];
	public Interface4 anInterface4_94;
	static int anInt95;
	public static int[] anIntArray96;

	public int method528(int i, char c, byte i_0_) {
		if (null != aByteArrayArray89)
			return aByteArrayArray89[i][c];
		return 0;
	}

	public int method529(int i, int i_1_) {
		return aByteArray88[i] & 0xff;
	}

	public int method530(String string, byte i) {
		return method531(string, null, 1834510667);
	}

	public int method531(String string, Interface2[] interface2s, int i) {
		if (string == null)
			return 0;
		int i_2_ = -1;
		int i_3_ = -1;
		int i_4_ = 0;
		int i_5_ = string.length();
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			char c = string.charAt(i_6_);
			if (c == 60)
				i_2_ = i_6_;
			else {
				if (c == 62 && i_2_ != -1) {
					String string_7_ = string.substring(i_2_ + 1, i_6_);
					i_2_ = -1;
					if (string_7_.equals("lt"))
						c = '<';
					else if (string_7_.equals("gt"))
						c = '>';
					else if (string_7_.equals("nbsp"))
						c = '\u00a0';
					else if (string_7_.equals("shy"))
						c = '\u00ad';
					else if (string_7_.equals("times"))
						c = '\u00d7';
					else if (string_7_.equals("euro"))
						c = '\u0080';
					else if (string_7_.equals("copy"))
						c = '\u00a9';
					else if (string_7_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_7_.startsWith("img=") && interface2s != null) {
							try {
								int i_8_ = Class392.method4867(string_7_.substring(4), -674555966);
								i_4_ += interface2s[i_8_].method12();
								i_3_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_7_.startsWith("sprite=") && anInterface4_94 != null) {
							try {
								int i_9_ = -1;
								int i_10_ = string_7_.indexOf(',');
								if (-1 == i_10_)
									i_9_ = (Class392.method4867(string_7_.substring(7), 544392095));
								else
									i_9_ = (Class392.method4867(string_7_.substring(7, i_10_), 546266338));
								i_4_ += anInterface4_94.method39(i_9_, 554557928);
								i_3_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (-1 == i_2_) {
					i_4_ += (aByteArray88[Class543.method6581(c, -5823823) & 0xff]) & 0xff;
					if (null != aByteArrayArray89 && i_3_ != -1)
						i_4_ += aByteArrayArray89[i_3_][c];
					i_3_ = c;
				}
			}
		}
		return i_4_;
	}

	public String method532(String string, int i, Interface2[] interface2s, int i_11_) {
		if (method531(string, interface2s, -81584301) <= i)
			return string;
		i -= method531("...", null, 1434690790);
		int i_12_ = -1;
		int i_13_ = -1;
		int i_14_ = 0;
		int i_15_ = string.length();
		String string_16_ = "";
		for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
			char c = string.charAt(i_17_);
			if (c == 60)
				i_12_ = i_17_;
			else {
				if (c == 62 && -1 != i_12_) {
					String string_18_ = string.substring(1 + i_12_, i_17_);
					i_12_ = -1;
					if (string_18_.equals("lt"))
						c = '<';
					else if (string_18_.equals("gt"))
						c = '>';
					else if (string_18_.equals("nbsp"))
						c = '\u00a0';
					else if (string_18_.equals("shy"))
						c = '\u00ad';
					else if (string_18_.equals("times"))
						c = '\u00d7';
					else if (string_18_.equals("euro"))
						c = '\u0080';
					else if (string_18_.equals("copy"))
						c = '\u00a9';
					else if (string_18_.equals("reg"))
						c = '\u00ae';
					else {
						if (string_18_.startsWith("img=") && interface2s != null) {
							try {
								int i_19_ = Class392.method4867(string_18_.substring(4), -2028932790);
								i_14_ += interface2s[i_19_].method12();
								i_13_ = -1;
								if (i_14_ > i)
									return new StringBuilder().append(string_16_).append("...").toString();
								string_16_ = string.substring(0, i_17_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						} else if (string_18_.startsWith("sprite=") && anInterface4_94 != null) {
							try {
								int i_20_ = -1;
								int i_21_ = string_18_.indexOf(',');
								if (i_21_ == -1)
									i_20_ = (Class392.method4867(string_18_.substring(7), 365709905));
								else
									i_20_ = (Class392.method4867(string_18_.substring(7, i_21_), -300770862));
								i_14_ += anInterface4_94.method39(i_20_, 554557928);
								i_13_ = -1;
								if (i_14_ > i)
									return new StringBuilder().append(string_16_).append("...").toString();
								string_16_ = string.substring(0, i_17_ + 1);
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i_12_ == -1) {
					i_14_ += aByteArray88[(Class543.method6581(c, -5823823) & 0xff)] & 0xff;
					if (aByteArrayArray89 != null && i_13_ != -1)
						i_14_ += aByteArrayArray89[i_13_][c];
					i_13_ = c;
					int i_22_ = i_14_;
					if (aByteArrayArray89 != null)
						i_22_ += aByteArrayArray89[c][46];
					if (i_22_ > i)
						return new StringBuilder().append(string_16_).append("...").toString();
					string_16_ = string.substring(0, i_17_ + 1);
				}
			}
		}
		return string;
	}

	public int method533(String string, int[] is, String[] strings, Interface2[] interface2s, byte i) {
		return method534(string, is, strings, interface2s, true, (byte) 111);
	}

	int method534(String string, int[] is, String[] strings, Interface2[] interface2s, boolean bool, byte i) {
		if (string == null)
			return 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = -1;
		int i_26_ = 0;
		int i_27_ = 0;
		int i_28_ = -1;
		int i_29_ = -1;
		int i_30_ = 0;
		int i_31_ = string.length();
		for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
			int i_33_ = Class543.method6581(string.charAt(i_32_), -5823823) & 0xff;
			int i_34_ = 0;
			if (60 == i_33_)
				i_28_ = i_32_;
			else {
				int i_35_;
				if (i_28_ != -1) {
					if (i_33_ != 62)
						continue;
					i_35_ = i_28_;
					String string_36_ = string.substring(1 + i_28_, i_32_);
					i_28_ = -1;
					if (string_36_.equals("br")) {
						strings[i_30_] = string.substring(i_24_, 1 + i_32_);
						if (++i_30_ >= strings.length)
							return 0;
						i_24_ = 1 + i_32_;
						i_23_ = 0;
						i_25_ = -1;
						i_29_ = -1;
						continue;
					}
					if (string_36_.equals("lt")) {
						i_34_ += method529(60, -1711399258);
						if (aByteArrayArray89 != null && -1 != i_29_)
							i_34_ += aByteArrayArray89[i_29_][60];
						i_29_ = 60;
					} else if (string_36_.equals("gt")) {
						i_34_ += method529(62, -1813154803);
						if (null != aByteArrayArray89 && -1 != i_29_)
							i_34_ += aByteArrayArray89[i_29_][62];
						i_29_ = 62;
					} else if (string_36_.equals("nbsp")) {
						i_34_ += method529(160, -1499512660);
						if (null != aByteArrayArray89 && i_29_ != -1)
							i_34_ += aByteArrayArray89[i_29_][160];
						i_29_ = 160;
					} else if (string_36_.equals("shy")) {
						i_34_ += method529(173, -1294594223);
						if (aByteArrayArray89 != null && -1 != i_29_)
							i_34_ += aByteArrayArray89[i_29_][173];
						i_29_ = 173;
					} else if (string_36_.equals("times")) {
						i_34_ += method529(215, -1484503098);
						if (aByteArrayArray89 != null && -1 != i_29_)
							i_34_ += aByteArrayArray89[i_29_][215];
						i_29_ = 215;
					} else if (string_36_.equals("euro")) {
						i_34_ += method529(128, -1452467071);
						if (null != aByteArrayArray89 && -1 != i_29_)
							i_34_ += aByteArrayArray89[i_29_][128];
						i_29_ = 128;
					} else if (string_36_.equals("copy")) {
						i_34_ += method529(169, -1949785203);
						if (null != aByteArrayArray89 && -1 != i_29_)
							i_34_ += aByteArrayArray89[i_29_][169];
						i_29_ = 169;
					} else if (string_36_.equals("reg")) {
						i_34_ += method529(174, -2025517682);
						if (aByteArrayArray89 != null && -1 != i_29_)
							i_34_ += aByteArrayArray89[i_29_][174];
						i_29_ = 174;
					} else if (string_36_.startsWith("img=") && interface2s != null) {
						try {
							int i_37_ = Class392.method4867(string_36_.substring(4), -426401360);
							i_34_ += interface2s[i_37_].method12();
							i_29_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					} else if (string_36_.startsWith("sprite=") && anInterface4_94 != null) {
						try {
							int i_38_ = -1;
							int i_39_ = string_36_.indexOf(',');
							if (i_39_ == -1)
								i_38_ = Class392.method4867(string_36_.substring(7), -1611106276);
							else
								i_38_ = (Class392.method4867(string_36_.substring(7, i_39_), -1714752727));
							i_34_ += anInterface4_94.method39(i_38_, 554557928);
							i_29_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
						continue;
					}
					i_33_ = -1;
				} else {
					i_35_ = i_32_;
					i_34_ += method529(i_33_, -1711011617);
					if (aByteArrayArray89 != null && i_29_ != -1)
						i_34_ += aByteArrayArray89[i_29_][i_33_];
					i_29_ = i_33_;
				}
				if (i_34_ > 0) {
					i_23_ += i_34_;
					if (is != null) {
						if (32 == i_33_) {
							i_25_ = i_32_;
							i_26_ = i_23_;
							i_27_ = bool ? 1 : 0;
						}
						if (i_23_ > is[i_30_ < is.length ? i_30_ : is.length - 1]) {
							if (i_25_ >= 0) {
								strings[i_30_] = string.substring(i_24_, 1 + i_25_ - i_27_);
								if (++i_30_ >= strings.length)
									return 0;
								i_24_ = 1 + i_25_;
								i_25_ = -1;
								i_23_ -= i_26_;
								i_29_ = -1;
							} else {
								strings[i_30_] = string.substring(i_24_, i_35_);
								if (++i_30_ >= strings.length)
									return 0;
								i_24_ = i_35_;
								i_25_ = -1;
								i_23_ = i_34_;
								i_29_ = -1;
							}
						}
						if (45 == i_33_) {
							i_25_ = i_32_;
							i_26_ = i_23_;
							i_27_ = 0;
						}
					}
				}
			}
		}
		if (string.length() > i_24_) {
			strings[i_30_] = string.substring(i_24_, string.length());
			i_30_++;
		}
		return i_30_;
	}

	public int method535(int i) {
		return aByteArray88[i] & 0xff;
	}

	public int method536(String string, int i, Interface2[] interface2s, byte i_40_) {
		return method533(string, new int[] { i }, aStringArray93, interface2s, (byte) 64);
	}

	public String method537(String string, int i, Interface2[] interface2s, int i_41_, int i_42_) {
		int i_43_ = method533(string, new int[] { i }, aStringArray93, interface2s, (byte) 49);
		if (i_41_ >= 0 && i_41_ < i_43_)
			return aStringArray93[i_41_];
		return null;
	}

	public int method538(String string, int i, int i_44_, Interface2[] interface2s, byte i_45_) {
		if (0 == i_44_)
			i_44_ = -206496891 * anInt90;
		int i_46_ = method533(string, new int[] { i }, aStringArray93, interface2s, (byte) 24);
		int i_47_ = (i_46_ - 1) * i_44_;
		return anInt92 * 1780869003 + (anInt91 * -1214764847 + i_47_);
	}

	public int method539(int i) {
		return aByteArray88[i] & 0xff;
	}

	public int method540(String string, int i, int i_48_, int i_49_, int i_50_, Interface2[] interface2s, int i_51_) {
		if (i_48_ == 0)
			i_48_ = anInt90 * -206496891;
		int i_52_ = method534(string, new int[] { i }, aStringArray93, interface2s, false, (byte) 33);
		if (i_52_ == 0)
			return 0;
		if (i_50_ < 0)
			i_50_ = 0;
		i_50_ /= i_48_;
		if (i_50_ >= i_52_)
			i_50_ = i_52_ - 1;
		String string_53_ = aStringArray93[i_50_];
		int i_54_ = 0;
		int i_55_ = 0;
		int i_56_;
		for (i_56_ = 0; i_56_ < i_49_ && i_54_ < string_53_.length(); i_56_ = method531(string_53_.substring(0, ++i_54_), interface2s, 1121599272))
			i_55_ = i_56_;
		if (i_54_ == string_53_.length() && string_53_.endsWith("<br>"))
			i_54_ -= 4;
		if (i_49_ - i_55_ < i_56_ - i_49_)
			i_54_--;
		for (int i_57_ = 0; i_57_ < i_50_; i_57_++)
			i_54_ += aStringArray93[i_57_].length();
		return i_54_;
	}

	public int method541(String string, int i, Interface2[] interface2s, int i_58_) {
		int i_59_ = method533(string, new int[] { i }, aStringArray93, interface2s, (byte) 59);
		int i_60_ = 0;
		for (int i_61_ = 0; i_61_ < i_59_; i_61_++) {
			int i_62_ = method531(aStringArray93[i_61_], interface2s, 966244846);
			if (i_62_ > i_60_)
				i_60_ = i_62_;
		}
		return i_60_;
	}

	public int method542(int i) {
		return aByteArray88[i] & 0xff;
	}

	public int method543(int i) {
		return aByteArray88[i] & 0xff;
	}

	public Point method544(String string, int i, int i_63_, int i_64_, Interface2[] interface2s, int i_65_) {
		if (i_64_ <= 0)
			return new Point(0, -1214764847 * anInt91 + i_63_);
		if (i_64_ > string.length())
			i_64_ = string.length();
		if (0 == i_63_)
			i_63_ = -206496891 * anInt90;
		int i_66_ = method534(string, new int[] { i }, aStringArray93, interface2s, false, (byte) 85);
		int i_67_ = 0;
		for (int i_68_ = 0; i_68_ < i_66_; i_68_++) {
			int i_69_ = aStringArray93[i_68_].length();
			if (i_69_ + i_67_ > i_64_ || i_66_ - 1 == i_68_ && i_64_ == string.length()) {
				String string_70_ = string.substring(i_67_, i_64_);
				if (string_70_.endsWith("<br>")) {
					string_70_ = "";
					i_67_ += i_69_;
					i_68_++;
				}
				int i_71_ = method531(string_70_, interface2s, 2058481433);
				int i_72_ = anInt91 * -1214764847 + i_68_ * i_63_;
				return new Point(i_71_, i_72_);
			}
			i_67_ += i_69_;
		}
		return null;
	}

	Class2(byte[] is, Interface4 interface4) {
		anInterface4_94 = interface4;
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		int i = class536_sub33.readUnsignedByte();
		if (0 != i)
			throw new RuntimeException("");
		boolean bool = class536_sub33.readUnsignedByte() == 1;
		aByteArray88 = new byte[256];
		class536_sub33.method9716(aByteArray88, 0, 256, -741920053);
		if (bool) {
			int[] is_73_ = new int[256];
			int[] is_74_ = new int[256];
			for (int i_75_ = 0; i_75_ < 256; i_75_++)
				is_73_[i_75_] = class536_sub33.readUnsignedByte();
			for (int i_76_ = 0; i_76_ < 256; i_76_++)
				is_74_[i_76_] = class536_sub33.readUnsignedByte();
			byte[][] is_77_ = new byte[256][];
			for (int i_78_ = 0; i_78_ < 256; i_78_++) {
				is_77_[i_78_] = new byte[is_73_[i_78_]];
				byte i_79_ = 0;
				for (int i_80_ = 0; i_80_ < is_77_[i_78_].length; i_80_++) {
					i_79_ += class536_sub33.readByte();
					is_77_[i_78_][i_80_] = i_79_;
				}
			}
			byte[][] is_81_ = new byte[256][];
			for (int i_82_ = 0; i_82_ < 256; i_82_++) {
				is_81_[i_82_] = new byte[is_73_[i_82_]];
				byte i_83_ = 0;
				for (int i_84_ = 0; i_84_ < is_81_[i_82_].length; i_84_++) {
					i_83_ += class536_sub33.readByte();
					is_81_[i_82_][i_84_] = i_83_;
				}
			}
			aByteArrayArray89 = new byte[256][256];
			for (int i_85_ = 0; i_85_ < 256; i_85_++) {
				if (32 != i_85_ && i_85_ != 160) {
					for (int i_86_ = 0; i_86_ < 256; i_86_++) {
						if (i_86_ != 32 && 160 != i_86_)
							aByteArrayArray89[i_85_][i_86_] = (byte) Class700.method8250(is_77_, is_81_, is_74_, aByteArray88, is_73_, i_85_, i_86_, (byte) -46);
					}
				}
			}
			anInt90 = (is_74_[32] + is_73_[32]) * 510043469;
		} else
			anInt90 = class536_sub33.readUnsignedByte() * 510043469;
		class536_sub33.readUnsignedByte();
		class536_sub33.readUnsignedByte();
		anInt91 = class536_sub33.readUnsignedByte() * -823578575;
		anInt92 = class536_sub33.readUnsignedByte() * 1130301475;
	}
}
