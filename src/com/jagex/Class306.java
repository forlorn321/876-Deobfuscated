/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jagex.twitchtv.TwitchEvent;

public class Class306 implements Interface30 {
	boolean aBool3444;
	AffineTransform anAffineTransform3445;
	List aList3446 = new ArrayList();
	boolean aBool3447;
	boolean aBool3448;
	boolean aBool3449;
	String aString3450;
	String aString3451;

	public void method172(short i) {
		/* empty */
	}

	final int method4109(int i, int i_0_) {
		if (aBool3447)
			return (-1804846931 * Class144.anInt1679 - i) / 2;
		return 0;
	}

	public int method171(int i) {
		return 100;
	}

	public void method188(boolean bool, byte i) {
		if (!aBool3449 && !aBool3444) {
			aBool3444 = true;
			try {
				String[] strings = Class344.method4483(client.aString11108, '|', (byte) -17);
				if (strings.length < 3)
					aBool3449 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class399.aCanvas4127);
					int i_1_ = 0;
					for (int i_2_ = 0; i_2_ < strings.length; i_2_++) {
						String[] strings_3_ = Class344.method4483(strings[i_2_].trim(), '=', (byte) -24);
						if (strings_3_[0].equals("halign"))
							aBool3447 = Boolean.parseBoolean(strings_3_[1]);
						else if (strings_3_[0].equals("valign"))
							aBool3448 = Boolean.parseBoolean(strings_3_[1]);
						else if (strings_3_[0].equals("image")) {
							String[] strings_4_ = Class344.method4483(strings_3_[1], ',', (byte) -85);
							Image image;
							try {
								image = method4110(strings_4_[0], -1355493687);
							} catch (Exception exception) {
								image = null;
							}
							if (null != image) {
								mediatracker.addImage(image, i_1_++);
								aList3446.add(new Class315_Sub1(this, image, Class392.method4867(strings_4_[1], 962282372), Class392.method4867(strings_4_[2], -1418532598)));
							}
						} else if (strings_3_[0].equals("rotatingimage")) {
							String[] strings_5_ = Class344.method4483(strings_3_[1], ',', (byte) -104);
							Image image;
							try {
								image = method4110(strings_5_[0], -1355493687);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i_1_++);
								aList3446.add(new Class315_Sub1_Sub1(this, image, Class392.method4867(strings_5_[1], -1724739017), Class392.method4867(strings_5_[2], 184881200), Float.parseFloat(strings_5_[3])));
							}
						} else if (strings_3_[0].equals("progress")) {
							String[] strings_6_ = Class344.method4483(strings_3_[1], ',', (byte) -91);
							aList3446.add(new Class315_Sub2(this, Boolean.parseBoolean(strings_6_[0]), strings_6_[1], Class392.method4867(strings_6_[2], 860715233), Integer.decode(strings_6_[3]).intValue(), Class392.method4867(strings_6_[4], -1248288767), Class392.method4867(strings_6_[5], 1611812618)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool3449 = true;
			}
		}
		if (aBool3449)
			method4111(-1876552226);
		else {
			Graphics graphics = Class399.aCanvas4127.getGraphics();
			if (graphics != null) {
				try {
					aString3451 = new StringBuilder().append("").append(Class192.aClass292_2177.method3944(884081433)).append("%").toString();
					aString3450 = Class192.aClass292_2177.method3936((byte) 11);
					if (null == Class655.anImage8495)
						Class655.anImage8495 = (Class399.aCanvas4127.createImage(-1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499));
					Graphics graphics_7_ = Class655.anImage8495.getGraphics();
					graphics_7_.setColor(Color.BLACK);
					graphics_7_.fillRect(0, 0, -1804846931 * Class144.anInt1679, 589116499 * Class34_Sub6.anInt10965);
					Iterator iterator = aList3446.iterator();
					while (iterator.hasNext()) {
						Class315 class315 = (Class315) iterator.next();
						class315.method4206(graphics_7_, -1776386962);
					}
					graphics.drawImage(Class655.anImage8495, 0, 0, null);
				} catch (Exception exception) {
					aBool3449 = true;
				}
			} else
				Class399.aCanvas4127.repaint();
		}
	}

	Image method4110(String string, int i) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class622.anApplet8126.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i_8_ = 0;
				int i_9_;
				while ((i_9_ = inputstream.read()) != -1)
					is[i_8_++] = (byte) i_9_;
				Image image_10_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_10_;
			} catch (Exception exception) {
				throw new IOException();
			}
			if (null != inputstream)
				inputstream.close();
			return image;
		} catch (Exception object) {
			if (null != inputstream)
				inputstream.close();
			throw object;
		}
	}

	void method4111(int i) {
		Class1.method527(Class192.aClass292_2177.method3944(2088325628), Class192.aClass292_2177.method3936((byte) 11), client.aColorArray11038[247320061 * client.anInt10988], client.aColorArray11039[client.anInt10988 * 247320061], client.aColorArray11058[247320061 * client.anInt10988], -1738070155);
	}

	public void method182(int i) {
		Class34.method817(-1635233065);
	}

	public int method180() {
		return 100;
	}

	public boolean method185(long l) {
		return true;
	}

	public boolean method175(long l) {
		return true;
	}

	public int method177() {
		return 100;
	}

	Class306() {
		anAffineTransform3445 = new AffineTransform();
	}

	final int method4112(int i) {
		if (aBool3448)
			return (589116499 * Class34_Sub6.anInt10965 - i) / 2;
		return 0;
	}

	public void method179(boolean bool) {
		if (!aBool3449 && !aBool3444) {
			aBool3444 = true;
			try {
				String[] strings = Class344.method4483(client.aString11108, '|', (byte) -31);
				if (strings.length < 3)
					aBool3449 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class399.aCanvas4127);
					int i = 0;
					for (int i_11_ = 0; i_11_ < strings.length; i_11_++) {
						String[] strings_12_ = Class344.method4483(strings[i_11_].trim(), '=', (byte) -127);
						if (strings_12_[0].equals("halign"))
							aBool3447 = Boolean.parseBoolean(strings_12_[1]);
						else if (strings_12_[0].equals("valign"))
							aBool3448 = Boolean.parseBoolean(strings_12_[1]);
						else if (strings_12_[0].equals("image")) {
							String[] strings_13_ = Class344.method4483(strings_12_[1], ',', (byte) -14);
							Image image;
							try {
								image = method4110(strings_13_[0], -1355493687);
							} catch (Exception exception) {
								image = null;
							}
							if (null != image) {
								mediatracker.addImage(image, i++);
								aList3446.add(new Class315_Sub1(this, image, Class392.method4867(strings_13_[1], -892505045), Class392.method4867(strings_13_[2], -1894742531)));
							}
						} else if (strings_12_[0].equals("rotatingimage")) {
							String[] strings_14_ = Class344.method4483(strings_12_[1], ',', (byte) -118);
							Image image;
							try {
								image = method4110(strings_14_[0], -1355493687);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								aList3446.add(new Class315_Sub1_Sub1(this, image, Class392.method4867(strings_14_[1], -772297563), Class392.method4867(strings_14_[2], -244383793), Float.parseFloat(strings_14_[3])));
							}
						} else if (strings_12_[0].equals("progress")) {
							String[] strings_15_ = Class344.method4483(strings_12_[1], ',', (byte) -10);
							aList3446.add(new Class315_Sub2(this, Boolean.parseBoolean(strings_15_[0]), strings_15_[1], Class392.method4867(strings_15_[2], 746897985), Integer.decode(strings_15_[3]).intValue(), Class392.method4867(strings_15_[4], -2092968896), Class392.method4867(strings_15_[5], -562257767)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool3449 = true;
			}
		}
		if (aBool3449)
			method4111(384481057);
		else {
			Graphics graphics = Class399.aCanvas4127.getGraphics();
			if (graphics != null) {
				try {
					aString3451 = new StringBuilder().append("").append(Class192.aClass292_2177.method3944(2022719149)).append("%").toString();
					aString3450 = Class192.aClass292_2177.method3936((byte) 11);
					if (null == Class655.anImage8495)
						Class655.anImage8495 = (Class399.aCanvas4127.createImage(-1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499));
					Graphics graphics_16_ = Class655.anImage8495.getGraphics();
					graphics_16_.setColor(Color.BLACK);
					graphics_16_.fillRect(0, 0, -1804846931 * Class144.anInt1679, 589116499 * Class34_Sub6.anInt10965);
					Iterator iterator = aList3446.iterator();
					while (iterator.hasNext()) {
						Class315 class315 = (Class315) iterator.next();
						class315.method4206(graphics_16_, -1776386962);
					}
					graphics.drawImage(Class655.anImage8495, 0, 0, null);
				} catch (Exception exception) {
					aBool3449 = true;
				}
			} else
				Class399.aCanvas4127.repaint();
		}
	}

	final int method4113(int i) {
		if (aBool3447)
			return (-1804846931 * Class144.anInt1679 - i) / 2;
		return 0;
	}

	void method4114() {
		Class1.method527(Class192.aClass292_2177.method3944(470909930), Class192.aClass292_2177.method3936((byte) 11), client.aColorArray11038[247320061 * client.anInt10988], client.aColorArray11039[client.anInt10988 * 247320061], client.aColorArray11058[247320061 * client.anInt10988], 2033254005);
	}

	void method4115() {
		Class1.method527(Class192.aClass292_2177.method3944(-2005426549), Class192.aClass292_2177.method3936((byte) 11), client.aColorArray11038[247320061 * client.anInt10988], client.aColorArray11039[client.anInt10988 * 247320061], client.aColorArray11058[247320061 * client.anInt10988], -704455680);
	}

	void method4116() {
		Class1.method527(Class192.aClass292_2177.method3944(-368102923), Class192.aClass292_2177.method3936((byte) 11), client.aColorArray11038[247320061 * client.anInt10988], client.aColorArray11039[client.anInt10988 * 247320061], client.aColorArray11058[247320061 * client.anInt10988], 1996135866);
	}

	public void method183() {
		Class34.method817(-1635233065);
	}

	public void method178() {
		/* empty */
	}

	public int method176() {
		return 100;
	}

	final int method4117(int i) {
		if (aBool3448)
			return (589116499 * Class34_Sub6.anInt10965 - i) / 2;
		return 0;
	}

	public int method181() {
		return 100;
	}

	public boolean method189(long l) {
		return true;
	}

	public boolean method184(long l) {
		return true;
	}

	public int method173(int i) {
		return 0;
	}

	public int method186() {
		return 0;
	}

	public int method187() {
		return 0;
	}

	public void method174(boolean bool) {
		if (!aBool3449 && !aBool3444) {
			aBool3444 = true;
			try {
				String[] strings = Class344.method4483(client.aString11108, '|', (byte) -47);
				if (strings.length < 3)
					aBool3449 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class399.aCanvas4127);
					int i = 0;
					for (int i_17_ = 0; i_17_ < strings.length; i_17_++) {
						String[] strings_18_ = Class344.method4483(strings[i_17_].trim(), '=', (byte) -115);
						if (strings_18_[0].equals("halign"))
							aBool3447 = Boolean.parseBoolean(strings_18_[1]);
						else if (strings_18_[0].equals("valign"))
							aBool3448 = Boolean.parseBoolean(strings_18_[1]);
						else if (strings_18_[0].equals("image")) {
							String[] strings_19_ = Class344.method4483(strings_18_[1], ',', (byte) -8);
							Image image;
							try {
								image = method4110(strings_19_[0], -1355493687);
							} catch (Exception exception) {
								image = null;
							}
							if (null != image) {
								mediatracker.addImage(image, i++);
								aList3446.add(new Class315_Sub1(this, image, Class392.method4867(strings_19_[1], 1303949487), Class392.method4867(strings_19_[2], -1911159434)));
							}
						} else if (strings_18_[0].equals("rotatingimage")) {
							String[] strings_20_ = Class344.method4483(strings_18_[1], ',', (byte) -27);
							Image image;
							try {
								image = method4110(strings_20_[0], -1355493687);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								aList3446.add(new Class315_Sub1_Sub1(this, image, Class392.method4867(strings_20_[1], -1922449385), Class392.method4867(strings_20_[2], 2115033404), Float.parseFloat(strings_20_[3])));
							}
						} else if (strings_18_[0].equals("progress")) {
							String[] strings_21_ = Class344.method4483(strings_18_[1], ',', (byte) -48);
							aList3446.add(new Class315_Sub2(this, Boolean.parseBoolean(strings_21_[0]), strings_21_[1], Class392.method4867(strings_21_[2], -762985651), Integer.decode(strings_21_[3]).intValue(), Class392.method4867(strings_21_[4], 1129392085), Class392.method4867(strings_21_[5], -1877098189)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool3449 = true;
			}
		}
		if (aBool3449)
			method4111(-1968630622);
		else {
			Graphics graphics = Class399.aCanvas4127.getGraphics();
			if (graphics != null) {
				try {
					aString3451 = new StringBuilder().append("").append(Class192.aClass292_2177.method3944(498666410)).append("%").toString();
					aString3450 = Class192.aClass292_2177.method3936((byte) 11);
					if (null == Class655.anImage8495)
						Class655.anImage8495 = (Class399.aCanvas4127.createImage(-1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499));
					Graphics graphics_22_ = Class655.anImage8495.getGraphics();
					graphics_22_.setColor(Color.BLACK);
					graphics_22_.fillRect(0, 0, -1804846931 * Class144.anInt1679, 589116499 * Class34_Sub6.anInt10965);
					Iterator iterator = aList3446.iterator();
					while (iterator.hasNext()) {
						Class315 class315 = (Class315) iterator.next();
						class315.method4206(graphics_22_, -1776386962);
					}
					graphics.drawImage(Class655.anImage8495, 0, 0, null);
				} catch (Exception exception) {
					aBool3449 = true;
				}
			} else
				Class399.aCanvas4127.repaint();
		}
	}

	final int method4118(int i, byte i_23_) {
		if (aBool3448)
			return (589116499 * Class34_Sub6.anInt10965 - i) / 2;
		return 0;
	}

	public static Class386 method4119(RSByteBuffer class536_sub33, int i) {
		String string = class536_sub33.readString();
		Class395 class395 = (Class333_Sub3.method9230(1525738188)[class536_sub33.readUnsignedByte(1168561056)]);
		Class399 class399 = (Class266.method3692(878827744)[class536_sub33.readUnsignedByte(-1846490431)]);
		int i_24_ = class536_sub33.readShort((byte) -17);
		int i_25_ = class536_sub33.readShort((byte) -100);
		int i_26_ = class536_sub33.readUnsignedByte(-666356365);
		int i_27_ = class536_sub33.readUnsignedByte(5555935);
		int i_28_ = class536_sub33.readUnsignedByte(-251055230);
		int i_29_ = class536_sub33.readUnsignedShort();
		int i_30_ = class536_sub33.readUnsignedShort();
		int i_31_ = class536_sub33.method9720((byte) 1);
		int i_32_ = class536_sub33.readInt();
		int i_33_ = class536_sub33.readInt();
		return new Class386(string, class395, class399, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, i_33_);
	}

	public static void method4120(String string, boolean bool, Class167 class167, Class184 class184, Class2 class2, byte i) {
		boolean bool_34_ = (!Class34_Sub8.aBool10968 || Class301_Sub1.method9201(-1363873811));
		if (bool_34_) {
			if (Class34_Sub8.aBool10968 && bool_34_) {
				class2 = Class70.aClass2_793;
				class184 = class167.method2089(class2, Class24.aClass179_Sub2Array233, true);
				int i_35_ = class2.method541(string, 250, null, 601823666);
				int i_36_ = class2.method538(string, 250, class2.anInt90 * -206496891, null, (byte) 3);
				int i_37_ = Class100.aClass179_1192.method2633();
				int i_38_ = i_37_ + 4;
				i_35_ += 2 * i_38_;
				i_36_ += 2 * i_38_;
				if (i_35_ < 2057814377 * Class100.anInt1187)
					i_35_ = Class100.anInt1187 * 2057814377;
				if (i_36_ < -893218317 * Class100.anInt1188)
					i_36_ = Class100.anInt1188 * -893218317;
				int i_39_ = (Class100.aClass395_1191.method4878(i_35_, (-125739413 * (client.anInt11152)), 1962460864) + 2114272643 * Class100.anInt1183);
				int i_40_ = (Class100.aClass399_1184.method4906(i_36_, (-358673315 * (client.anInt11153)), -502343786) + 1520168137 * Class100.anInt1185);
				class167.method2082(Class100.aClass179_1193, false).method1734(i_39_ + Class100.aClass179_1186.method2633(), i_40_ + Class100.aClass179_1186.method2677(), i_35_ - Class100.aClass179_1186.method2633() * 2, i_36_ - Class100.aClass179_1186.method2677() * 2, 1, -1, 0);
				class167.method2082(Class100.aClass179_1186, true).method1728(i_39_, i_40_);
				Class100.aClass179_1186.method2648();
				class167.method2082(Class100.aClass179_1186, true).method1728(i_35_ + i_39_ - i_37_, i_40_);
				Class100.aClass179_1186.method2646();
				class167.method2082(Class100.aClass179_1186, true).method1728(i_35_ + i_39_ - i_37_, i_40_ + i_36_ - i_37_);
				Class100.aClass179_1186.method2648();
				class167.method2082(Class100.aClass179_1186, true).method1728(i_39_, i_36_ + i_40_ - i_37_);
				Class100.aClass179_1186.method2646();
				class167.method2082(Class100.aClass179_1192, true).method1733(i_39_, i_40_ + Class100.aClass179_1186.method2677(), i_37_, i_36_ - Class100.aClass179_1186.method2677() * 2);
				Class100.aClass179_1192.method2647();
				class167.method2082(Class100.aClass179_1192, true).method1733(i_39_ + Class100.aClass179_1186.method2633(), i_40_, i_35_ - Class100.aClass179_1186.method2633() * 2, i_37_);
				Class100.aClass179_1192.method2647();
				class167.method2082(Class100.aClass179_1192, true).method1733(i_39_ + i_35_ - i_37_, i_40_ + Class100.aClass179_1186.method2677(), i_37_, i_36_ - Class100.aClass179_1186.method2677() * 2);
				Class100.aClass179_1192.method2647();
				class167.method2082(Class100.aClass179_1192, true).method1733(i_39_ + Class100.aClass179_1186.method2633(), i_36_ + i_40_ - i_37_, i_35_ - Class100.aClass179_1186.method2633() * 2, i_37_);
				Class100.aClass179_1192.method2647();
				class184.method2743(string, i_38_ + i_39_, i_40_ + i_38_, i_35_ - 2 * i_38_, i_36_ - 2 * i_38_, -12602421 * Class246.anInt2466 | ~0xffffff, -1, 1, 1, 0, null, null, null, 0, 0, -955014811);
				Class680.method8073(i_39_, i_40_, i_35_, i_36_, (byte) 120);
			} else {
				int i_41_ = class2.method541(string, 250, null, 601823666);
				int i_42_ = class2.method536(string, 250, null, (byte) -45) * 13;
				int i_43_ = 4;
				int i_44_ = 6 + i_43_;
				int i_45_ = i_43_ + 6;
				class167.method2063(i_44_ - i_43_, i_45_ - i_43_, i_43_ + (i_41_ + i_43_), i_43_ + i_42_ + i_43_, -16777216, 0);
				class167.method2062(i_44_ - i_43_, i_45_ - i_43_, i_43_ + (i_41_ + i_43_), i_43_ + (i_43_ + i_42_), -1, 0);
				class184.method2743(string, i_44_, i_45_, i_41_, i_42_, -1, -1, 1, 1, 0, null, null, null, 0, 0, -1614416549);
				Class680.method8073(i_44_ - i_43_, i_45_ - i_43_, i_41_ + i_43_ + i_43_, i_43_ + i_42_ + i_43_, (byte) 87);
			}
			if (bool) {
				try {
					class167.method2084();
					class167.method2002((byte) 27);
				} catch (Exception_Sub5 exception_sub5) {
					/* empty */
				}
			}
		}
	}

	public static void method4121(int i, TwitchEvent twitchevent, byte i_46_) {
		Class536_Sub18_Sub16 class536_sub18_sub16 = Class221.method3108(Class570.aClass570_7624, i, -1, (byte) -14);
		if (class536_sub18_sub16 != null) {
			Class668 class668 = Class586.method7063((byte) 5);
			if (1971309879 * class536_sub18_sub16.anInt11802 != 0)
				class668.aLongArray8538 = new long[class536_sub18_sub16.anInt11802 * 1971309879];
			if (520600665 * class536_sub18_sub16.anInt11795 != 0)
				class668.anIntArray8550 = new int[520600665 * class536_sub18_sub16.anInt11795];
			if (0 != class536_sub18_sub16.anInt11799 * 1265663029)
				class668.anObjectArray8561 = new String[class536_sub18_sub16.anInt11799 * 1265663029];
			twitchevent.method4951(class668.anIntArray8550, class668.aLongArray8538, class668.anObjectArray8561);
			Class198.method2876(class536_sub18_sub16, 500000, class668, -2040267124);
		}
	}

	static final void method4122(Class251 class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -807866914) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2543 = Class33.method796(string, class668, (short) -21941);
		class251.aBool2666 = true;
	}

	static final void method4123(Class668 class668, int i) {
		Class184_Sub2.aClass211_9442.method3013(39424);
	}

	static final void method4124(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_47_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_48_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class499.method6024(i_47_, i_48_, true, -978258019);
	}

	static final void method4125(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class49.method927(string, -610946079);
	}

	static final void method4126(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class685.anInt8656 * -1582682093;
	}

	static final void method4127(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static void method4128(int i) {
		Class513.method6220();
	}

	static final void method4129(Class668 class668, int i) {
		int i_49_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_49_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_49_ >> 16];
		Class98_Sub1_Sub2.method10505(class251, class234, class668, -1374007248);
	}

	public static Class288 method4130(int i, int i_50_) {
		if (1798810777 * Class288.aClass288_3212.anInt3210 == i)
			return Class288.aClass288_3212;
		if (i == Class288.aClass288_3211.anInt3210 * 1798810777)
			return Class288.aClass288_3211;
		return null;
	}

	static final void method4131(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.anInt11156 * -1791435655;
	}

	static final void method4132(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (string != null)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = string.length();
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
