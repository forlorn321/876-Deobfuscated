/* Class292 - Decompiled by JODE
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

public class Class292 implements Interface31 {
	boolean aBool3250;
	boolean aBool3251;
	List aList3252 = new ArrayList();
	boolean aBool3253;
	String aString3254;
	AffineTransform anAffineTransform3255 = new AffineTransform();
	String aString3256;
	boolean aBool3257;

	public int method187() {
		return 100;
	}

	final int method5258(int i, int i_0_) {
		if (aBool3253)
			return (-1803844265 * Class289.anInt3223 - i) / 2;
		return 0;
	}

	final int method5259(int i, int i_1_) {
		if (aBool3257)
			return (-471480167 * Class611.anInt8009 - i) / 2;
		return 0;
	}

	final int method5260(int i) {
		if (aBool3253)
			return (-1803844265 * Class289.anInt3223 - i) / 2;
		return 0;
	}

	Image method5261(String string, byte i) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class212.anApplet2258.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i_2_ = 0;
				int i_3_;
				while ((i_3_ = inputstream.read()) != -1)
					is[i_2_++] = (byte) i_3_;
				Image image_4_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_4_;
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

	void method5262(byte i) {
		Class219.method4066(Class290.aClass300_3229.method5541(49672619), Class290.aClass300_3229.method5532(650028368), client.aColorArray11098[-1289997611 * client.anInt10993], client.aColorArray11044[-1289997611 * client.anInt10993], client.aColorArray11057[-1289997611 * client.anInt10993], -1282923130);
	}

	public void method177(int i) {
		Class534.method8956(1976067308);
	}

	public void method182(int i) {
		/* empty */
	}

	public void method176(boolean bool, byte i) {
		if (!aBool3250 && !aBool3251) {
			aBool3251 = true;
			try {
				String[] strings = Class592.method9875(client.aString11002, '|', (short) -18277);
				if (strings.length < 3)
					aBool3250 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class451.aCanvas4939);
					int i_5_ = 0;
					for (int i_6_ = 0; i_6_ < strings.length; i_6_++) {
						String[] strings_7_ = Class592.method9875(strings[i_6_].trim(), '=', (short) -13691);
						if (strings_7_[0].equals("halign"))
							aBool3253 = Boolean.parseBoolean(strings_7_[1]);
						else if (strings_7_[0].equals("valign"))
							aBool3257 = Boolean.parseBoolean(strings_7_[1]);
						else if (strings_7_[0].equals("image")) {
							String[] strings_8_ = Class592.method9875(strings_7_[1], ',', (short) -969);
							Image image;
							try {
								image = method5261(strings_8_[0], (byte) 44);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i_5_++);
								aList3252.add(new Class314_Sub2(this, image, Class360.method6326(strings_8_[1], (byte) 75), Class360.method6326(strings_8_[2], (byte) 34)));
							}
						} else if (strings_7_[0].equals("rotatingimage")) {
							String[] strings_9_ = Class592.method9875(strings_7_[1], ',', (short) -25614);
							Image image;
							try {
								image = method5261(strings_9_[0], (byte) 44);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i_5_++);
								aList3252.add(new Class314_Sub2_Sub1(this, image, Class360.method6326(strings_9_[1], (byte) -51), Class360.method6326(strings_9_[2], (byte) -32), Float.parseFloat(strings_9_[3])));
							}
						} else if (strings_7_[0].equals("progress")) {
							String[] strings_10_ = Class592.method9875(strings_7_[1], ',', (short) -8245);
							aList3252.add(new Class314_Sub1(this, Boolean.parseBoolean(strings_10_[0]), strings_10_[1], Class360.method6326(strings_10_[2], (byte) 21), Integer.decode(strings_10_[3]).intValue(), Class360.method6326(strings_10_[4], (byte) 4), Class360.method6326(strings_10_[5], (byte) -8)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool3250 = true;
			}
		}
		if (aBool3250)
			method5262((byte) -62);
		else {
			Graphics graphics = Class451.aCanvas4939.getGraphics();
			if (graphics != null) {
				try {
					aString3254 = new StringBuilder().append("").append(Class290.aClass300_3229.method5541(49672619)).append("%").toString();
					aString3256 = Class290.aClass300_3229.method5532(1194956939);
					if (Class629.anImage8217 == null)
						Class629.anImage8217 = (Class451.aCanvas4939.createImage(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009));
					Graphics graphics_11_ = Class629.anImage8217.getGraphics();
					graphics_11_.setColor(Color.BLACK);
					graphics_11_.fillRect(0, 0, -1803844265 * Class289.anInt3223, Class611.anInt8009 * -471480167);
					Iterator iterator = aList3252.iterator();
					while (iterator.hasNext()) {
						Class314 class314 = (Class314) iterator.next();
						class314.method5660(graphics_11_, 1771048140);
					}
					graphics.drawImage(Class629.anImage8217, 0, 0, null);
				} catch (Exception exception) {
					aBool3250 = true;
				}
			} else
				Class451.aCanvas4939.repaint();
		}
	}

	public boolean method178(long l) {
		return true;
	}

	Class292() {
		/* empty */
	}

	final int method5263(int i) {
		if (aBool3253)
			return (-1803844265 * Class289.anInt3223 - i) / 2;
		return 0;
	}

	public int method185() {
		return 0;
	}

	public void method174(boolean bool) {
		if (!aBool3250 && !aBool3251) {
			aBool3251 = true;
			try {
				String[] strings = Class592.method9875(client.aString11002, '|', (short) -2723);
				if (strings.length < 3)
					aBool3250 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class451.aCanvas4939);
					int i = 0;
					for (int i_12_ = 0; i_12_ < strings.length; i_12_++) {
						String[] strings_13_ = Class592.method9875(strings[i_12_].trim(), '=', (short) -14067);
						if (strings_13_[0].equals("halign"))
							aBool3253 = Boolean.parseBoolean(strings_13_[1]);
						else if (strings_13_[0].equals("valign"))
							aBool3257 = Boolean.parseBoolean(strings_13_[1]);
						else if (strings_13_[0].equals("image")) {
							String[] strings_14_ = Class592.method9875(strings_13_[1], ',', (short) -1916);
							Image image;
							try {
								image = method5261(strings_14_[0], (byte) 44);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								aList3252.add(new Class314_Sub2(this, image, Class360.method6326(strings_14_[1], (byte) 15), Class360.method6326(strings_14_[2], (byte) -53)));
							}
						} else if (strings_13_[0].equals("rotatingimage")) {
							String[] strings_15_ = Class592.method9875(strings_13_[1], ',', (short) -18320);
							Image image;
							try {
								image = method5261(strings_15_[0], (byte) 44);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								aList3252.add(new Class314_Sub2_Sub1(this, image, Class360.method6326(strings_15_[1], (byte) 79), Class360.method6326(strings_15_[2], (byte) -17), Float.parseFloat(strings_15_[3])));
							}
						} else if (strings_13_[0].equals("progress")) {
							String[] strings_16_ = Class592.method9875(strings_13_[1], ',', (short) -15589);
							aList3252.add(new Class314_Sub1(this, Boolean.parseBoolean(strings_16_[0]), strings_16_[1], Class360.method6326(strings_16_[2], (byte) 79), Integer.decode(strings_16_[3]).intValue(), Class360.method6326(strings_16_[4], (byte) -106), Class360.method6326(strings_16_[5], (byte) -10)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool3250 = true;
			}
		}
		if (aBool3250)
			method5262((byte) -70);
		else {
			Graphics graphics = Class451.aCanvas4939.getGraphics();
			if (graphics != null) {
				try {
					aString3254 = new StringBuilder().append("").append(Class290.aClass300_3229.method5541(49672619)).append("%").toString();
					aString3256 = Class290.aClass300_3229.method5532(-1948707817);
					if (Class629.anImage8217 == null)
						Class629.anImage8217 = (Class451.aCanvas4939.createImage(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009));
					Graphics graphics_17_ = Class629.anImage8217.getGraphics();
					graphics_17_.setColor(Color.BLACK);
					graphics_17_.fillRect(0, 0, -1803844265 * Class289.anInt3223, Class611.anInt8009 * -471480167);
					Iterator iterator = aList3252.iterator();
					while (iterator.hasNext()) {
						Class314 class314 = (Class314) iterator.next();
						class314.method5660(graphics_17_, 2059683587);
					}
					graphics.drawImage(Class629.anImage8217, 0, 0, null);
				} catch (Exception exception) {
					aBool3250 = true;
				}
			} else
				Class451.aCanvas4939.repaint();
		}
	}

	public int method179(int i) {
		return 0;
	}

	Image method5264(String string) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class212.anApplet2258.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i = 0;
				int i_18_;
				while ((i_18_ = inputstream.read()) != -1)
					is[i++] = (byte) i_18_;
				Image image_19_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_19_;
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

	Image method5265(String string) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class212.anApplet2258.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i = 0;
				int i_20_;
				while ((i_20_ = inputstream.read()) != -1)
					is[i++] = (byte) i_20_;
				Image image_21_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_21_;
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

	Image method5266(String string) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class212.anApplet2258.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i = 0;
				int i_22_;
				while ((i_22_ = inputstream.read()) != -1)
					is[i++] = (byte) i_22_;
				Image image_23_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_23_;
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

	public boolean method175(long l) {
		return true;
	}

	void method5267() {
		Class219.method4066(Class290.aClass300_3229.method5541(49672619), Class290.aClass300_3229.method5532(1897416533), client.aColorArray11098[-1289997611 * client.anInt10993], client.aColorArray11044[-1289997611 * client.anInt10993], client.aColorArray11057[-1289997611 * client.anInt10993], -879710019);
	}

	public void method180() {
		Class534.method8956(1411877080);
	}

	public void method32() {
		Class534.method8956(1579819079);
	}

	public int method181(int i) {
		return 100;
	}

	public void method34() {
		/* empty */
	}

	void method5268() {
		Class219.method4066(Class290.aClass300_3229.method5541(49672619), Class290.aClass300_3229.method5532(290238964), client.aColorArray11098[-1289997611 * client.anInt10993], client.aColorArray11044[-1289997611 * client.anInt10993], client.aColorArray11057[-1289997611 * client.anInt10993], -1868930086);
	}

	public int method183() {
		return 100;
	}

	public boolean method184(long l) {
		return true;
	}

	Image method5269(String string) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			try {
				inputstream = Class212.anApplet2258.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[12000];
				int i = 0;
				int i_24_;
				while ((i_24_ = inputstream.read()) != -1)
					is[i++] = (byte) i_24_;
				Image image_25_ = Toolkit.getDefaultToolkit().createImage(is);
				inputstream.close();
				image = image_25_;
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

	public void method33() {
		Class534.method8956(1554557099);
	}

	public boolean method186(long l) {
		return true;
	}

	static final void method5270(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		class243.anInt2525 = (class665.anIntArray8525[class665.anInt8526 * 1769813785] * -892747571);
		class243.anInt2526 = (class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1] * -2022317685);
		Class430.method6876(class243, (byte) 39);
		if (0 == class243.anInt2501 * -270144907)
			Class397.method6513(class240, class243, false, 1742480300);
	}

	static final void method5271(Class665 class665, int i) {
		if ((Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 17) != Class301.aClass301_3418) || (Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -69) != Class309.aClass309_3455))
			throw new RuntimeException();
		Class442 class442 = ((Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0)).method15732((byte) 120);
		Class442 class442_26_ = ((Class696_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5472(502106250)).method17229((byte) -108);
		Class442 class442_27_ = Class442.method7139(class442);
		class442_27_.method7154(class442_26_);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) class442_27_.method7160();
	}

	static final void method5272(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class265.method5042(547612020);
	}

	public static void method5273(int i, byte i_28_) {
		synchronized (Class633.aClass205_8288) {
			Class633.aClass205_8288.method3792(i, (byte) -75);
		}
		synchronized (Class633.aClass205_8289) {
			Class633.aClass205_8289.method3792(i, (byte) -28);
		}
	}

	static final void method5274(boolean bool, Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		if (bool)
			Class171_Sub1.method14734(class240, class243, (byte) -62);
		else
			Class69.method1480(class240, class243, 2083375724);
	}
}
