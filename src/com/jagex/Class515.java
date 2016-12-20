/* Class515 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

public abstract class Class515 implements Interface61, Runnable, FocusListener, WindowListener {
	static long[] aLongArray7013;
	public static int anInt7014;
	static long aLong7015 = -8706516754551582976L;
	public static int anInt7016;
	static long[] aLongArray7017;
	static final int anInt7018 = 32;
	public static int anInt7019;
	public static int anInt7020;
	static Font aFont7021;
	static final long aLong7022 = 3221225472L;
	protected static volatile boolean aBool7023;
	static int anInt7024;
	protected static volatile boolean aBool7025;
	static Class1 aClass1_7026;
	static final String aString7027 = "main_file_cache.dat2";
	static volatile boolean aBool7028;
	protected static boolean aBool7029;
	static final int anInt7030 = 1048576;
	static final String aString7031 = "random.dat";
	protected static Class1 aClass1_7032;
	static final String aString7033 = "main_file_cache.idx";
	static final String aString7034 = "main_file_cache.idx255";
	static volatile long aLong7035;
	static boolean aBool7036;
	protected static String aString7037;
	protected static Class1 aClass1_7038;
	static final int anInt7039 = 0;
	static final int anInt7040 = 1;
	static Class516 aClass516_7041;
	static long aLong7042;
	static final String aString7043 = "rw";
	boolean aBool7044 = false;
	public static int anInt7045;
	public static int anInt7046;
	boolean aBool7047 = false;

	public final void method390(Graphics graphics) {
		paint(graphics);
	}

	void method8495(byte i) {
		if (Class451.aCanvas4939 != null) {
			Class451.aCanvas4939.removeFocusListener(this);
			Class451.aCanvas4939.getParent().setBackground(Color.black);
			Class451.aCanvas4939.getParent().remove(Class451.aCanvas4939);
		}
	}

	final void method8496(Class499 class499, String string, String string_0_, int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			method8505(Class516.aClass516_7050, bool, 1719689361);
			Class358.anInt3831 = ((Class289.anInt3223 = class499.method8169(-1670106675) * 2082158183) * -1897425737);
			Class76.anInt796 = (Class611.anInt8009 = class499.method8170(-1369911177) * 959450025) * 474023147;
			anInt7019 = 0;
			anInt7020 = 0;
			if (Class440.method7110((byte) -11) == Class516.aClass516_7048) {
				Class358.anInt3831 += 1471209282 * class499.method8176(1238978337);
				Class76.anInt796 += 1650765894 * class499.method8180(-2125826494);
				method8500(class499.method8172(44060696), -2027002325);
			}
			RuntimeException_Sub1.anApplet12044 = Class212.anApplet2258;
			method8590(string, string_0_, i, i_1_, i_2_, i_3_, -1438328613);
		} catch (Throwable throwable) {
			Class180.method3542(null, throwable, 1604547405);
			method8518("crash", -453146763);
		}
	}

	static void method8497() {
		try {
			File file = new File(Class329.aString3605, "random.dat");
			if (file.exists())
				aClass1_7026 = new Class1(new Class19(file, "rw", 25L), 24, 0);
			else {
				while_8_: for (int i = 0; i < Class338.aStringArray3654.length; i++) {
					for (int i_5_ = 0; i_5_ < Class667.aStringArray8566.length; i_5_++) {
						File file_6_ = new File(new StringBuilder().append(Class667.aStringArray8566[i_5_]).append(Class338.aStringArray3654[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_6_.exists()) {
							aClass1_7026 = new Class1(new Class19(file_6_, "rw", 25L), 24, 0);
							break while_8_;
						}
					}
				}
			}
			if (aClass1_7026 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass1_7026 = new Class1(new Class19(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	public final void windowOpened(WindowEvent windowevent) {
		/* empty */
	}

	void method8498(File file, File file_7_, byte i) {
		try {
			Class19 class19 = new Class19(Class527_Sub8_Sub13_Sub1.aFile12033, "rw", 10000L);
			RSByteBuffer class527_sub38 = new RSByteBuffer(500);
			class527_sub38.writeByte(3, 333485321);
			class527_sub38.writeByte(file_7_ != null ? 1 : 0, 1017131085);
			class527_sub38.writeGJString(file.getPath(), -1968427149);
			if (file_7_ != null)
				class527_sub38.writeGJString(file_7_.getPath(), -1968427149);
			class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 29);
			class19.method751((byte) -21);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	static void method8499(Object object) {
		if (Class388.anEventQueue3989 != null) {
			for (int i = 0; i < 50 && Class388.anEventQueue3989.peekEvent() != null; i++)
				Class518.method8635(1L);
			try {
				if (null != object)
					Class388.anEventQueue3989.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	synchronized void method8500(String string, int i) {
		Class514.aFrame7012 = new Frame();
		Class514.aFrame7012.setTitle(string);
		Class514.aFrame7012.setResizable(true);
		Class514.aFrame7012.addWindowListener(this);
		Class514.aFrame7012.setBackground(Color.black);
		Class514.aFrame7012.setVisible(true);
		Class514.aFrame7012.toFront();
		Insets insets = Class514.aFrame7012.getInsets();
		Class514.aFrame7012.setSize((Class358.anInt3831 * -21941151 + insets.left + insets.right), (-239790197 * Class76.anInt796 + insets.top + insets.bottom));
	}

	synchronized void method8501(int i) {
		method8495((byte) -51);
		Container container = Class198.method3745((byte) 31);
		Class451.aCanvas4939 = new Canvas_Sub1(container);
		method8502(container, (byte) 0);
	}

	void method8502(Container container, byte i) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class451.aCanvas4939);
		Class451.aCanvas4939.setSize(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009);
		Class451.aCanvas4939.setVisible(true);
		if (Class514.aFrame7012 == container) {
			Insets insets = Class514.aFrame7012.getInsets();
			Class451.aCanvas4939.setLocation((insets.left + -416298495 * anInt7019), (insets.top + anInt7020 * -1313216019));
		} else
			Class451.aCanvas4939.setLocation(-416298495 * anInt7019, -1313216019 * anInt7020);
		Class451.aCanvas4939.addFocusListener(this);
		Class451.aCanvas4939.requestFocus();
		Class333.aBool3628 = true;
		aBool7028 = true;
		Class451.aCanvas4939.setFocusTraversalKeysEnabled(false);
		aBool7023 = true;
		aBool7025 = false;
		aLong7035 = Class234.method4347(-1408626088) * -2725090416659441879L;
	}

	public static Class516 method8503() {
		return aClass516_7041;
	}

	final boolean method8504(byte i) {
		String string = Class212.anApplet2258.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method8518("invalidhost", -1695090182);
		return false;
	}

	void method8505(Class516 class516, boolean bool, int i) {
		if (null == class516)
			throw new NullPointerException();
		if (class516 != Class516.aClass516_7050 && class516 != Class516.aClass516_7049)
			throw new IllegalStateException();
		aClass516_7041 = class516;
		if (aClass516_7041 != Class516.aClass516_7049) {
			if (bool)
				aClass516_7041 = Class516.aClass516_7048;
		}
	}

	public final void method8506(WindowEvent windowevent) {
		/* empty */
	}

	void method8507(byte i) {
		long l = Class234.method4347(-1408626088);
		long l_8_ = aLongArray7013[Class312.anInt3496 * -1201903141];
		aLongArray7013[-1201903141 * Class312.anInt3496] = l;
		Class312.anInt3496 = -986748333 * (Class312.anInt3496 * -1201903141 + 1 & 0x1f);
		if (l_8_ != 0L && l <= l_8_) {
			/* empty */
		}
		synchronized (this) {
			Class333.aBool3628 = aBool7028;
		}
		method8515(1005520784);
	}

	public final void method8508(WindowEvent windowevent) {
		/* empty */
	}

	String method8509(byte i) {
		return null;
	}

	final void method8510(boolean bool, int i) {
		synchronized (this) {
			if (aBool7036)
				return;
			aBool7036 = true;
		}
		try {
			method8517(1296243022);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass1_7032.method491(-91365873);
			for (int i_9_ = 0; i_9_ < 1358395719 * Class425.anInt4805; i_9_++)
				Class550.aClass1Array7294[i_9_].method491(748186287);
			aClass1_7038.method491(-69769990);
			aClass1_7026.method491(-1857835573);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool7047) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class208_Sub19.method15633((byte) 2))
			Class177.method3056((byte) -14).method368((byte) -92);
		if (Class451.aCanvas4939 != null) {
			try {
				Class451.aCanvas4939.removeFocusListener(this);
				Class451.aCanvas4939.getParent().remove(Class451.aCanvas4939);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (Class514.aFrame7012 != null) {
			Class514.aFrame7012.setVisible(false);
			Class514.aFrame7012.dispose();
			Class514.aFrame7012 = null;
		}
	}

	public static final void method8511() {
		Class629.anImage8217 = null;
		aFont7021 = null;
	}

	public void stop() {
		if (!aBool7036)
			aLong7042 = ((Class234.method4347(-1408626088) + 4000L) * 566320195339239335L);
	}

	public void destroy() {
		if (!aBool7036) {
			aLong7042 = Class234.method4347(-1408626088) * 566320195339239335L;
			Class518.method8635(5000L);
			method8510(false, -1574975580);
		}
	}

	public final void update(Graphics graphics) {
		paint(graphics);
	}

	public final synchronized void paint(Graphics graphics) {
		if (!aBool7036) {
			aBool7023 = true;
			if ((Class234.method4347(-1408626088) - aLong7035 * -4233394088639253223L) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null || (rectangle.width >= -21941151 * Class358.anInt3831 && rectangle.height >= -239790197 * Class76.anInt796))
					aBool7025 = true;
			}
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		aBool7028 = true;
		aBool7023 = true;
	}

	public final void focusLost(FocusEvent focusevent) {
		aBool7028 = false;
	}

	public final void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowClosing(WindowEvent windowevent) {
		aBool7029 = true;
		destroy();
	}

	public final void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	public void method8512(int i) throws Exception_Sub2 {
		if (!aBool7047) {
			Class177.method3056((byte) -40).method369("jaclib", 1842737952);
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class234.aString2373.startsWith("win"))
					throw new Exception_Sub2(128, "jaclib");
			}
			aBool7047 = true;
		}
	}

	void method8513(byte i) {
		if (null != Class282.aString3198) {
			String string = Class282.aString3198.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_10_ = Class261.aString2862;
				if (string_10_.equals("1.1") || string_10_.startsWith("1.1.") || string_10_.equals("1.2") || string_10_.startsWith("1.2.") || string_10_.equals("1.3") || string_10_.startsWith("1.3.") || string_10_.equals("1.4") || string_10_.startsWith("1.4.") || string_10_.equals("1.5") || string_10_.startsWith("1.5.") || string_10_.equals("1.6.0")) {
					method8518("wrongjava", -964483993);
					return;
				}
				if (string_10_.startsWith("1.6.0_")) {
					int i_11_;
					for (i_11_ = 6; (i_11_ < string_10_.length() && Class315.method5673(string_10_.charAt(i_11_), (byte) 0)); i_11_++) {
						/* empty */
					}
					String string_12_ = string_10_.substring(6, i_11_);
					if (Class281.method5186(string_12_, 2135970854) && Class360.method6326(string_12_, (byte) -15) < 10) {
						method8518("wrongjava", -1162158943);
						return;
					}
				}
			}
		}
		Class198.method3745((byte) 31).setFocusCycleRoot(true);
		anInt7045 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 1961511735);
		anInt7046 = Runtime.getRuntime().availableProcessors() * -1102465829;
		method8501(1132253204);
		method8519(-1538590961);
		Class170.aClass517_1880 = Class405.method6548(-2092756810);
		while (aLong7042 * 5636571961258244119L == 0L || (Class234.method4347(-1408626088) < aLong7042 * 5636571961258244119L)) {
			Class190.anInt2128 = Class170.aClass517_1880.method8624(7688926709995876547L * aLong7015) * 1015170151;
			for (int i_13_ = 0; i_13_ < -296839337 * Class190.anInt2128; i_13_++)
				method8507((byte) 19);
			method8553(-1662935690);
			Class28.method864(Class451.aCanvas4939, -585548146);
		}
	}

	void method8514(String string, String string_14_, byte i) {
		if (!aBool7044) {
			aBool7044 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class60.method1375(Class212.anApplet2258, "loggedout", 1084593262);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class212.anApplet2258.getAppletContext().showDocument(new URL(Class212.anApplet2258.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws?").append(string_14_).toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	abstract void method8515(int i);

	public final void method8516(FocusEvent focusevent) {
		aBool7028 = true;
		aBool7023 = true;
	}

	abstract void method8517(int i);

	void method8518(String string, int i) {
		if (!aBool7044) {
			aBool7044 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class60.method1375(Class212.anApplet2258, "loggedout", 890325216);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class212.anApplet2258.getAppletContext().showDocument(new URL(Class212.anApplet2258.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	abstract void method8519(int i);

	void method8520() {
		long l = Class234.method4347(-1408626088);
		long l_15_ = (aLongArray7017[-1203892921 * Class700_Sub35.anInt10931 - 1 & 0x1f]);
		long l_16_ = aLongArray7017[-1203892921 * Class700_Sub35.anInt10931];
		aLongArray7017[-1203892921 * Class700_Sub35.anInt10931] = l;
		Class700_Sub35.anInt10931 = ((1 + -1203892921 * Class700_Sub35.anInt10931 & 0x1f) * 1668516983);
		if (l_16_ != 0L && l > l_16_) {
			int i = (int) (l - l_16_);
			anInt7016 = -440532463 * (int) (l - l_15_);
			anInt7014 = 339266153 * (((i >> 1) + 32000) / i);
		}
		if ((anInt7024 += -893997057) * 2085179391 - 1 > 50) {
			anInt7024 -= -1750179890;
			aBool7023 = true;
			Class451.aCanvas4939.setSize(-1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009);
			Class451.aCanvas4939.setVisible(true);
			if (Class514.aFrame7012 != null && Class56.aFrame711 == null) {
				Insets insets = Class514.aFrame7012.getInsets();
				Class451.aCanvas4939.setLocation((anInt7019 * -416298495 + insets.left), (anInt7020 * -1313216019 + insets.top));
			} else
				Class451.aCanvas4939.setLocation(-416298495 * anInt7019, anInt7020 * -1313216019);
		}
		method8537((byte) -41);
	}

	abstract void method8521();

	static {
		anInt7014 = 0;
		anInt7016 = 0;
		aLongArray7017 = new long[32];
		aLongArray7013 = new long[32];
		anInt7019 = 0;
		anInt7020 = 0;
		aString7037 = null;
		aBool7023 = true;
		anInt7024 = -321929716;
		aBool7025 = false;
		aLong7035 = 0L;
		aBool7029 = false;
		aBool7028 = true;
		aClass1_7026 = null;
		aClass1_7032 = null;
		aClass1_7038 = null;
		aClass516_7041 = null;
		aLong7042 = 0L;
		aBool7036 = false;
		anInt7045 = -1961511735;
		anInt7046 = -1102465829;
	}

	public void method8522() {
		do {
			try {
				try {
					method8513((byte) -63);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class180.method3542(method8509((byte) 93), throwable, 1604547405);
					method8518("crash", -397216338);
					method8510(true, -1610302820);
					break;
				}
				method8510(true, -1638270633);
			} catch (Exception object) {
				method8510(true, -1711549149);
				throw object;
			}
		} while (false);
	}

	public void method8523() {
		do {
			try {
				try {
					method8513((byte) -33);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class180.method3542(method8509((byte) 102), throwable, 1604547405);
					method8518("crash", -1898759527);
					method8510(true, -1813138196);
					break;
				}
				method8510(true, -1681503560);
			} catch (Exception object) {
				method8510(true, -1851996398);
				throw object;
			}
		} while (false);
	}

	public void method381(Applet applet) {
		Class212.anApplet2258 = applet;
	}

	abstract void method8524();

	abstract void method8525();

	abstract void method8526();

	abstract void method8527();

	public static Class19 method8528(String string, String string_17_, boolean bool) {
		File file = new File(Class105.aFile1307, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class19 class19;
				try {
					Class19 class19_18_ = new Class19(file, "rw", 10000L);
					class19 = class19_18_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		String string_19_ = "";
		if (33 == -692807731 * Class23.anInt228)
			string_19_ = "_rc";
		else if (-692807731 * Class23.anInt228 == 34)
			string_19_ = "_wip";
		File file_20_ = new File(Class329.aString3605, new StringBuilder().append("jagex_").append(string_17_).append("_preferences").append(string).append(string_19_).append(".dat").toString());
		do {
			if (!bool && file_20_.exists()) {
				Class19 class19;
				try {
					Class19 class19_21_ = new Class19(file_20_, "rw", 10000L);
					class19 = class19_21_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		Class19 class19;
		try {
			Class19 class19_22_ = new Class19(file, "rw", 10000L);
			class19 = class19_22_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class19;
	}

	abstract void method8529();

	abstract void method8530();

	abstract void method8531();

	String method8532() {
		return null;
	}

	public void start() {
		if (!aBool7036)
			aLong7042 = 0L;
	}

	void method8533() {
		long l = Class234.method4347(-1408626088);
		long l_23_ = (aLongArray7017[-1203892921 * Class700_Sub35.anInt10931 - 1 & 0x1f]);
		long l_24_ = aLongArray7017[-1203892921 * Class700_Sub35.anInt10931];
		aLongArray7017[-1203892921 * Class700_Sub35.anInt10931] = l;
		Class700_Sub35.anInt10931 = ((1 + -1203892921 * Class700_Sub35.anInt10931 & 0x1f) * 1668516983);
		if (l_24_ != 0L && l > l_24_) {
			int i = (int) (l - l_24_);
			anInt7016 = -440532463 * (int) (l - l_23_);
			anInt7014 = 339266153 * (((i >> 1) + 32000) / i);
		}
		if ((anInt7024 += -893997057) * 2085179391 - 1 > 50) {
			anInt7024 -= -1750179890;
			aBool7023 = true;
			Class451.aCanvas4939.setSize(-1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009);
			Class451.aCanvas4939.setVisible(true);
			if (Class514.aFrame7012 != null && Class56.aFrame711 == null) {
				Insets insets = Class514.aFrame7012.getInsets();
				Class451.aCanvas4939.setLocation((anInt7019 * -416298495 + insets.left), (anInt7020 * -1313216019 + insets.top));
			} else
				Class451.aCanvas4939.setLocation(-416298495 * anInt7019, anInt7020 * -1313216019);
		}
		method8537((byte) -68);
	}

	File method8534(String string, String string_25_, int i) {
		String string_26_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
		Class527_Sub8_Sub13_Sub1.aFile12033 = new File(Class329.aString3605, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_25_).append(string_26_).append(".dat").toString());
		String string_27_ = null;
		String string_28_ = null;
		boolean bool = false;
		if (Class527_Sub8_Sub13_Sub1.aFile12033.exists()) {
			try {
				Class19 class19 = new Class19(Class527_Sub8_Sub13_Sub1.aFile12033, "rw", 10000L);
				int i_29_;
				RSByteBuffer class527_sub38;
				for (class527_sub38 = (new RSByteBuffer((int) class19.method752(1805039315))); (class527_sub38.anInt10689 * -441238943 < class527_sub38.buffer.length); class527_sub38.anInt10689 += i_29_ * 1474750881) {
					i_29_ = class19.method753(class527_sub38.buffer, (-441238943 * class527_sub38.anInt10689), ((class527_sub38.buffer).length - (class527_sub38.anInt10689 * -441238943)), (byte) 12);
					if (i_29_ == -1)
						throw new IOException();
				}
				class527_sub38.anInt10689 = 0;
				i_29_ = class527_sub38.readUnsignedByte();
				if (i_29_ < 1 || i_29_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_29_).toString());
				int i_30_ = 0;
				if (i_29_ > 1)
					i_30_ = class527_sub38.readUnsignedByte();
				if (i_29_ <= 2) {
					string_27_ = class527_sub38.readVersionedString(90180177);
					if (1 == i_30_)
						string_28_ = class527_sub38.readVersionedString(90180177);
				} else {
					string_27_ = class527_sub38.method16459(1863485866);
					if (1 == i_30_)
						string_28_ = class527_sub38.method16459(1888494448);
				}
				class19.method751((byte) -32);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_27_) {
				File file = new File(string_27_);
				if (!file.exists())
					string_27_ = null;
			}
			if (string_27_ != null) {
				File file = new File(string_27_, "test.dat");
				if (!method8574(file, true, 37147))
					string_27_ = null;
			}
		}
		if (null == string_27_ && i == 0) {
			while_9_: for (int i_31_ = 0; i_31_ < Class338.aStringArray3654.length; i_31_++) {
				for (int i_32_ = 0; i_32_ < Class667.aStringArray8566.length; i_32_++) {
					File file = new File(new StringBuilder().append(Class667.aStringArray8566[i_32_]).append(Class338.aStringArray3654[i_31_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method8574(new File(file, "test.dat"), true, 37147)) {
						string_27_ = file.toString();
						bool = true;
						break while_9_;
					}
				}
			}
		}
		if (string_27_ == null) {
			string_27_ = new StringBuilder().append(Class329.aString3605).append(File.separatorChar).append("dickcache").append(string_26_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_25_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_28_) {
			File file = new File(string_28_);
			File file_33_ = new File(string_27_);
			try {
				File[] files = file.listFiles();
				File[] files_34_ = files;
				for (int i_35_ = 0; i_35_ < files_34_.length; i_35_++) {
					File file_36_ = files_34_[i_35_];
					File file_37_ = new File(file_33_, file_36_.getName());
					boolean bool_38_ = file_36_.renameTo(file_37_);
					if (!bool_38_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method8498(new File(string_27_), null, (byte) 0);
		return new File(string_27_);
	}

	File method8535(String string, String string_39_, int i) {
		String string_40_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
		Class527_Sub8_Sub13_Sub1.aFile12033 = new File(Class329.aString3605, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_39_).append(string_40_).append(".dat").toString());
		String string_41_ = null;
		String string_42_ = null;
		boolean bool = false;
		if (Class527_Sub8_Sub13_Sub1.aFile12033.exists()) {
			try {
				Class19 class19 = new Class19(Class527_Sub8_Sub13_Sub1.aFile12033, "rw", 10000L);
				int i_43_;
				RSByteBuffer class527_sub38;
				for (class527_sub38 = (new RSByteBuffer((int) class19.method752(1810266803))); (class527_sub38.anInt10689 * -441238943 < class527_sub38.buffer.length); class527_sub38.anInt10689 += i_43_ * 1474750881) {
					i_43_ = class19.method753(class527_sub38.buffer, (-441238943 * class527_sub38.anInt10689), ((class527_sub38.buffer).length - (class527_sub38.anInt10689 * -441238943)), (byte) 12);
					if (i_43_ == -1)
						throw new IOException();
				}
				class527_sub38.anInt10689 = 0;
				i_43_ = class527_sub38.readUnsignedByte();
				if (i_43_ < 1 || i_43_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_43_).toString());
				int i_44_ = 0;
				if (i_43_ > 1)
					i_44_ = class527_sub38.readUnsignedByte();
				if (i_43_ <= 2) {
					string_41_ = class527_sub38.readVersionedString(90180177);
					if (1 == i_44_)
						string_42_ = class527_sub38.readVersionedString(90180177);
				} else {
					string_41_ = class527_sub38.method16459(1508947834);
					if (1 == i_44_)
						string_42_ = class527_sub38.method16459(1664368329);
				}
				class19.method751((byte) 95);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_41_) {
				File file = new File(string_41_);
				if (!file.exists())
					string_41_ = null;
			}
			if (string_41_ != null) {
				File file = new File(string_41_, "test.dat");
				if (!method8574(file, true, 37147))
					string_41_ = null;
			}
		}
		if (null == string_41_ && i == 0) {
			while_10_: for (int i_45_ = 0; i_45_ < Class338.aStringArray3654.length; i_45_++) {
				for (int i_46_ = 0; i_46_ < Class667.aStringArray8566.length; i_46_++) {
					File file = new File(new StringBuilder().append(Class667.aStringArray8566[i_46_]).append(Class338.aStringArray3654[i_45_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method8574(new File(file, "test.dat"), true, 37147)) {
						string_41_ = file.toString();
						bool = true;
						break while_10_;
					}
				}
			}
		}
		if (string_41_ == null) {
			string_41_ = new StringBuilder().append(Class329.aString3605).append(File.separatorChar).append("dickcache").append(string_40_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_39_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_42_) {
			File file = new File(string_42_);
			File file_47_ = new File(string_41_);
			try {
				File[] files = file.listFiles();
				File[] files_48_ = files;
				for (int i_49_ = 0; i_49_ < files_48_.length; i_49_++) {
					File file_50_ = files_48_[i_49_];
					File file_51_ = new File(file_47_, file_50_.getName());
					boolean bool_52_ = file_50_.renameTo(file_51_);
					if (!bool_52_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method8498(new File(string_41_), null, (byte) 0);
		return new File(string_41_);
	}

	public void method379(Applet applet) {
		Class212.anApplet2258 = applet;
	}

	void method8536(File file, File file_53_) {
		try {
			Class19 class19 = new Class19(Class527_Sub8_Sub13_Sub1.aFile12033, "rw", 10000L);
			RSByteBuffer class527_sub38 = new RSByteBuffer(500);
			class527_sub38.writeByte(3, 1087490163);
			class527_sub38.writeByte(file_53_ != null ? 1 : 0, -569687707);
			class527_sub38.writeGJString(file.getPath(), -1968427149);
			if (file_53_ != null)
				class527_sub38.writeGJString(file_53_.getPath(), -1968427149);
			class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 125);
			class19.method751((byte) 38);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	abstract void method8537(byte i);

	boolean method8538(File file, boolean bool) {
		boolean bool_54_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_54_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_54_;
	}

	synchronized void method8539(String string) {
		Class514.aFrame7012 = new Frame();
		Class514.aFrame7012.setTitle(string);
		Class514.aFrame7012.setResizable(true);
		Class514.aFrame7012.addWindowListener(this);
		Class514.aFrame7012.setBackground(Color.black);
		Class514.aFrame7012.setVisible(true);
		Class514.aFrame7012.toFront();
		Insets insets = Class514.aFrame7012.getInsets();
		Class514.aFrame7012.setSize((Class358.anInt3831 * -21941151 + insets.left + insets.right), (-239790197 * Class76.anInt796 + insets.top + insets.bottom));
	}

	public final void method8540(WindowEvent windowevent) {
		/* empty */
	}

	static void method8541() {
		try {
			File file = new File(Class329.aString3605, "random.dat");
			if (file.exists())
				aClass1_7026 = new Class1(new Class19(file, "rw", 25L), 24, 0);
			else {
				while_11_: for (int i = 0; i < Class338.aStringArray3654.length; i++) {
					for (int i_55_ = 0; i_55_ < Class667.aStringArray8566.length; i_55_++) {
						File file_56_ = new File(new StringBuilder().append(Class667.aStringArray8566[i_55_]).append(Class338.aStringArray3654[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_56_.exists()) {
							aClass1_7026 = new Class1(new Class19(file_56_, "rw", 25L), 24, 0);
							break while_11_;
						}
					}
				}
			}
			if (aClass1_7026 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass1_7026 = new Class1(new Class19(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	static void method8542() {
		try {
			File file = new File(Class329.aString3605, "random.dat");
			if (file.exists())
				aClass1_7026 = new Class1(new Class19(file, "rw", 25L), 24, 0);
			else {
				while_12_: for (int i = 0; i < Class338.aStringArray3654.length; i++) {
					for (int i_57_ = 0; i_57_ < Class667.aStringArray8566.length; i_57_++) {
						File file_58_ = new File(new StringBuilder().append(Class667.aStringArray8566[i_57_]).append(Class338.aStringArray3654[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_58_.exists()) {
							aClass1_7026 = new Class1(new Class19(file_58_, "rw", 25L), 24, 0);
							break while_12_;
						}
					}
				}
			}
			if (aClass1_7026 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass1_7026 = new Class1(new Class19(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	File method8543(String string, String string_59_, int i, int i_60_) {
		String string_61_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
		Class527_Sub8_Sub13_Sub1.aFile12033 = new File(Class329.aString3605, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_59_).append(string_61_).append(".dat").toString());
		String string_62_ = null;
		String string_63_ = null;
		boolean bool = false;
		if (Class527_Sub8_Sub13_Sub1.aFile12033.exists()) {
			try {
				Class19 class19 = new Class19(Class527_Sub8_Sub13_Sub1.aFile12033, "rw", 10000L);
				int i_64_;
				RSByteBuffer class527_sub38;
				for (class527_sub38 = (new RSByteBuffer((int) class19.method752(1895634649))); (class527_sub38.anInt10689 * -441238943 < class527_sub38.buffer.length); class527_sub38.anInt10689 += i_64_ * 1474750881) {
					i_64_ = class19.method753(class527_sub38.buffer, (-441238943 * class527_sub38.anInt10689), ((class527_sub38.buffer).length - (class527_sub38.anInt10689 * -441238943)), (byte) 12);
					if (i_64_ == -1)
						throw new IOException();
				}
				class527_sub38.anInt10689 = 0;
				i_64_ = class527_sub38.readUnsignedByte();
				if (i_64_ < 1 || i_64_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_64_).toString());
				int i_65_ = 0;
				if (i_64_ > 1)
					i_65_ = class527_sub38.readUnsignedByte();
				if (i_64_ <= 2) {
					string_62_ = class527_sub38.readVersionedString(90180177);
					if (1 == i_65_)
						string_63_ = class527_sub38.readVersionedString(90180177);
				} else {
					string_62_ = class527_sub38.method16459(1678644655);
					if (1 == i_65_)
						string_63_ = class527_sub38.method16459(1965923888);
				}
				class19.method751((byte) 82);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_62_) {
				File file = new File(string_62_);
				if (!file.exists())
					string_62_ = null;
			}
			if (string_62_ != null) {
				File file = new File(string_62_, "test.dat");
				if (!method8574(file, true, 37147))
					string_62_ = null;
			}
		}
		if (null == string_62_ && i == 0) {
			while_13_: for (int i_66_ = 0; i_66_ < Class338.aStringArray3654.length; i_66_++) {
				for (int i_67_ = 0; i_67_ < Class667.aStringArray8566.length; i_67_++) {
					File file = new File(new StringBuilder().append(Class667.aStringArray8566[i_67_]).append(Class338.aStringArray3654[i_66_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method8574(new File(file, "test.dat"), true, 37147)) {
						string_62_ = file.toString();
						bool = true;
						break while_13_;
					}
				}
			}
		}
		if (string_62_ == null) {
			string_62_ = new StringBuilder().append(Class329.aString3605).append(File.separatorChar).append("dickcache").append(string_61_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_59_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_63_) {
			File file = new File(string_63_);
			File file_68_ = new File(string_62_);
			try {
				File[] files = file.listFiles();
				File[] files_69_ = files;
				for (int i_70_ = 0; i_70_ < files_69_.length; i_70_++) {
					File file_71_ = files_69_[i_70_];
					File file_72_ = new File(file_68_, file_71_.getName());
					boolean bool_73_ = file_71_.renameTo(file_72_);
					if (!bool_73_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method8498(new File(string_62_), null, (byte) 0);
		return new File(string_62_);
	}

	public static Class19 method8544(String string, String string_74_, boolean bool) {
		File file = new File(Class105.aFile1307, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class19 class19;
				try {
					Class19 class19_75_ = new Class19(file, "rw", 10000L);
					class19 = class19_75_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		String string_76_ = "";
		if (33 == -692807731 * Class23.anInt228)
			string_76_ = "_rc";
		else if (-692807731 * Class23.anInt228 == 34)
			string_76_ = "_wip";
		File file_77_ = new File(Class329.aString3605, new StringBuilder().append("jagex_").append(string_74_).append("_preferences").append(string).append(string_76_).append(".dat").toString());
		do {
			if (!bool && file_77_.exists()) {
				Class19 class19;
				try {
					Class19 class19_78_ = new Class19(file_77_, "rw", 10000L);
					class19 = class19_78_;
				} catch (IOException ioexception) {
					break;
				}
				return class19;
			}
		} while (false);
		Class19 class19;
		try {
			Class19 class19_79_ = new Class19(file, "rw", 10000L);
			class19 = class19_79_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class19;
	}

	synchronized void method8545(String string) {
		Class514.aFrame7012 = new Frame();
		Class514.aFrame7012.setTitle(string);
		Class514.aFrame7012.setResizable(true);
		Class514.aFrame7012.addWindowListener(this);
		Class514.aFrame7012.setBackground(Color.black);
		Class514.aFrame7012.setVisible(true);
		Class514.aFrame7012.toFront();
		Insets insets = Class514.aFrame7012.getInsets();
		Class514.aFrame7012.setSize((Class358.anInt3831 * -21941151 + insets.left + insets.right), (-239790197 * Class76.anInt796 + insets.top + insets.bottom));
	}

	synchronized void method8546() {
		method8495((byte) -62);
		Container container = Class198.method3745((byte) 31);
		Class451.aCanvas4939 = new Canvas_Sub1(container);
		method8502(container, (byte) 0);
	}

	Class515() {
		/* empty */
	}

	synchronized void method8547() {
		method8495((byte) -43);
		Container container = Class198.method3745((byte) 31);
		Class451.aCanvas4939 = new Canvas_Sub1(container);
		method8502(container, (byte) 0);
	}

	public final void method8548(WindowEvent windowevent) {
		aBool7029 = true;
		destroy();
	}

	void method8549(Container container) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class451.aCanvas4939);
		Class451.aCanvas4939.setSize(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009);
		Class451.aCanvas4939.setVisible(true);
		if (Class514.aFrame7012 == container) {
			Insets insets = Class514.aFrame7012.getInsets();
			Class451.aCanvas4939.setLocation((insets.left + -416298495 * anInt7019), (insets.top + anInt7020 * -1313216019));
		} else
			Class451.aCanvas4939.setLocation(-416298495 * anInt7019, -1313216019 * anInt7020);
		Class451.aCanvas4939.addFocusListener(this);
		Class451.aCanvas4939.requestFocus();
		Class333.aBool3628 = true;
		aBool7028 = true;
		Class451.aCanvas4939.setFocusTraversalKeysEnabled(false);
		aBool7023 = true;
		aBool7025 = false;
		aLong7035 = Class234.method4347(-1408626088) * -2725090416659441879L;
	}

	void method8550(Container container) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class451.aCanvas4939);
		Class451.aCanvas4939.setSize(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009);
		Class451.aCanvas4939.setVisible(true);
		if (Class514.aFrame7012 == container) {
			Insets insets = Class514.aFrame7012.getInsets();
			Class451.aCanvas4939.setLocation((insets.left + -416298495 * anInt7019), (insets.top + anInt7020 * -1313216019));
		} else
			Class451.aCanvas4939.setLocation(-416298495 * anInt7019, -1313216019 * anInt7020);
		Class451.aCanvas4939.addFocusListener(this);
		Class451.aCanvas4939.requestFocus();
		Class333.aBool3628 = true;
		aBool7028 = true;
		Class451.aCanvas4939.setFocusTraversalKeysEnabled(false);
		aBool7023 = true;
		aBool7025 = false;
		aLong7035 = Class234.method4347(-1408626088) * -2725090416659441879L;
	}

	final boolean method8551() {
		String string = Class212.anApplet2258.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method8518("invalidhost", -302066703);
		return false;
	}

	final boolean method8552() {
		String string = Class212.anApplet2258.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method8518("invalidhost", -1987895587);
		return false;
	}

	void method8553(int i) {
		long l = Class234.method4347(-1408626088);
		long l_80_ = (aLongArray7017[-1203892921 * Class700_Sub35.anInt10931 - 1 & 0x1f]);
		long l_81_ = aLongArray7017[-1203892921 * Class700_Sub35.anInt10931];
		aLongArray7017[-1203892921 * Class700_Sub35.anInt10931] = l;
		Class700_Sub35.anInt10931 = ((1 + -1203892921 * Class700_Sub35.anInt10931 & 0x1f) * 1668516983);
		if (l_81_ != 0L && l > l_81_) {
			int i_82_ = (int) (l - l_81_);
			anInt7016 = -440532463 * (int) (l - l_80_);
			anInt7014 = 339266153 * (((i_82_ >> 1) + 32000) / i_82_);
		}
		if ((anInt7024 += -893997057) * 2085179391 - 1 > 50) {
			anInt7024 -= -1750179890;
			aBool7023 = true;
			Class451.aCanvas4939.setSize(-1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009);
			Class451.aCanvas4939.setVisible(true);
			if (Class514.aFrame7012 != null && Class56.aFrame711 == null) {
				Insets insets = Class514.aFrame7012.getInsets();
				Class451.aCanvas4939.setLocation((anInt7019 * -416298495 + insets.left), (anInt7020 * -1313216019 + insets.top));
			} else
				Class451.aCanvas4939.setLocation(-416298495 * anInt7019, anInt7020 * -1313216019);
		}
		method8537((byte) 60);
	}

	abstract void method8554();

	static void method8555(Object object) {
		if (Class388.anEventQueue3989 != null) {
			for (int i = 0; i < 50 && Class388.anEventQueue3989.peekEvent() != null; i++)
				Class518.method8635(1L);
			try {
				if (null != object)
					Class388.anEventQueue3989.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	static void method8556(Object object) {
		if (Class388.anEventQueue3989 != null) {
			for (int i = 0; i < 50 && Class388.anEventQueue3989.peekEvent() != null; i++)
				Class518.method8635(1L);
			try {
				if (null != object)
					Class388.anEventQueue3989.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method8557() {
		long l = Class234.method4347(-1408626088);
		long l_83_ = aLongArray7013[Class312.anInt3496 * -1201903141];
		aLongArray7013[-1201903141 * Class312.anInt3496] = l;
		Class312.anInt3496 = -986748333 * (Class312.anInt3496 * -1201903141 + 1 & 0x1f);
		if (l_83_ != 0L && l <= l_83_) {
			/* empty */
		}
		synchronized (this) {
			Class333.aBool3628 = aBool7028;
		}
		method8515(-225305425);
	}

	void method8558() {
		long l = Class234.method4347(-1408626088);
		long l_84_ = (aLongArray7017[-1203892921 * Class700_Sub35.anInt10931 - 1 & 0x1f]);
		long l_85_ = aLongArray7017[-1203892921 * Class700_Sub35.anInt10931];
		aLongArray7017[-1203892921 * Class700_Sub35.anInt10931] = l;
		Class700_Sub35.anInt10931 = ((1 + -1203892921 * Class700_Sub35.anInt10931 & 0x1f) * 1668516983);
		if (l_85_ != 0L && l > l_85_) {
			int i = (int) (l - l_85_);
			anInt7016 = -440532463 * (int) (l - l_84_);
			anInt7014 = 339266153 * (((i >> 1) + 32000) / i);
		}
		if ((anInt7024 += -893997057) * 2085179391 - 1 > 50) {
			anInt7024 -= -1750179890;
			aBool7023 = true;
			Class451.aCanvas4939.setSize(-1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009);
			Class451.aCanvas4939.setVisible(true);
			if (Class514.aFrame7012 != null && Class56.aFrame711 == null) {
				Insets insets = Class514.aFrame7012.getInsets();
				Class451.aCanvas4939.setLocation((anInt7019 * -416298495 + insets.left), (anInt7020 * -1313216019 + insets.top));
			} else
				Class451.aCanvas4939.setLocation(-416298495 * anInt7019, anInt7020 * -1313216019);
		}
		method8537((byte) -9);
	}

	public final void method8559(WindowEvent windowevent) {
		/* empty */
	}

	boolean method8560(File file, boolean bool) {
		boolean bool_86_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_86_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_86_;
	}

	final void method8561(boolean bool) {
		synchronized (this) {
			if (aBool7036)
				return;
			aBool7036 = true;
		}
		try {
			method8517(1022166943);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass1_7032.method491(-257037478);
			for (int i = 0; i < 1358395719 * Class425.anInt4805; i++)
				Class550.aClass1Array7294[i].method491(-711990726);
			aClass1_7038.method491(-189355406);
			aClass1_7026.method491(-1155407417);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool7047) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class208_Sub19.method15633((byte) 2))
			Class177.method3056((byte) 25).method368((byte) -18);
		if (Class451.aCanvas4939 != null) {
			try {
				Class451.aCanvas4939.removeFocusListener(this);
				Class451.aCanvas4939.getParent().remove(Class451.aCanvas4939);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (Class514.aFrame7012 != null) {
			Class514.aFrame7012.setVisible(false);
			Class514.aFrame7012.dispose();
			Class514.aFrame7012 = null;
		}
	}

	public final void method8562(WindowEvent windowevent) {
		/* empty */
	}

	final void method8563(boolean bool) {
		synchronized (this) {
			if (aBool7036)
				return;
			aBool7036 = true;
		}
		try {
			method8517(1762273640);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass1_7032.method491(-2057878492);
			for (int i = 0; i < 1358395719 * Class425.anInt4805; i++)
				Class550.aClass1Array7294[i].method491(-638701389);
			aClass1_7038.method491(-1350373074);
			aClass1_7026.method491(-444829793);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool7047) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class208_Sub19.method15633((byte) 2))
			Class177.method3056((byte) 92).method368((byte) -16);
		if (Class451.aCanvas4939 != null) {
			try {
				Class451.aCanvas4939.removeFocusListener(this);
				Class451.aCanvas4939.getParent().remove(Class451.aCanvas4939);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (Class514.aFrame7012 != null) {
			Class514.aFrame7012.setVisible(false);
			Class514.aFrame7012.dispose();
			Class514.aFrame7012 = null;
		}
	}

	final void method8564(boolean bool) {
		synchronized (this) {
			if (aBool7036)
				return;
			aBool7036 = true;
		}
		try {
			method8517(1294292382);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass1_7032.method491(549649586);
			for (int i = 0; i < 1358395719 * Class425.anInt4805; i++)
				Class550.aClass1Array7294[i].method491(-674736141);
			aClass1_7038.method491(-217048890);
			aClass1_7026.method491(-856737196);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool7047) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class208_Sub19.method15633((byte) 2))
			Class177.method3056((byte) -16).method368((byte) -117);
		if (Class451.aCanvas4939 != null) {
			try {
				Class451.aCanvas4939.removeFocusListener(this);
				Class451.aCanvas4939.getParent().remove(Class451.aCanvas4939);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (Class514.aFrame7012 != null) {
			Class514.aFrame7012.setVisible(false);
			Class514.aFrame7012.dispose();
			Class514.aFrame7012 = null;
		}
	}

	public static final void method8565() {
		Class170.aClass517_1880.method8625((byte) -125);
		for (int i = 0; i < 32; i++)
			aLongArray7017[i] = 0L;
		for (int i = 0; i < 32; i++)
			aLongArray7013[i] = 0L;
		Class190.anInt2128 = 0;
	}

	static long method8566() {
		return Class170.aClass517_1880.method8614((byte) -90);
	}

	static long method8567() {
		return Class170.aClass517_1880.method8614((byte) -2);
	}

	static long method8568() {
		return Class170.aClass517_1880.method8614((byte) -66);
	}

	static long method8569() {
		return Class170.aClass517_1880.method8614((byte) -105);
	}

	void method8570() {
		if (null != Class282.aString3198) {
			String string = Class282.aString3198.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_87_ = Class261.aString2862;
				if (string_87_.equals("1.1") || string_87_.startsWith("1.1.") || string_87_.equals("1.2") || string_87_.startsWith("1.2.") || string_87_.equals("1.3") || string_87_.startsWith("1.3.") || string_87_.equals("1.4") || string_87_.startsWith("1.4.") || string_87_.equals("1.5") || string_87_.startsWith("1.5.") || string_87_.equals("1.6.0")) {
					method8518("wrongjava", -1152858618);
					return;
				}
				if (string_87_.startsWith("1.6.0_")) {
					int i;
					for (i = 6; (i < string_87_.length() && Class315.method5673(string_87_.charAt(i), (byte) 0)); i++) {
						/* empty */
					}
					String string_88_ = string_87_.substring(6, i);
					if (Class281.method5186(string_88_, 2135970854) && Class360.method6326(string_88_, (byte) -75) < 10) {
						method8518("wrongjava", -327485643);
						return;
					}
				}
			}
		}
		Class198.method3745((byte) 31).setFocusCycleRoot(true);
		anInt7045 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 1961511735);
		anInt7046 = Runtime.getRuntime().availableProcessors() * -1102465829;
		method8501(1132253204);
		method8519(-1538590961);
		Class170.aClass517_1880 = Class405.method6548(-961889379);
		while (aLong7042 * 5636571961258244119L == 0L || (Class234.method4347(-1408626088) < aLong7042 * 5636571961258244119L)) {
			Class190.anInt2128 = Class170.aClass517_1880.method8624(7688926709995876547L * aLong7015) * 1015170151;
			for (int i = 0; i < -296839337 * Class190.anInt2128; i++)
				method8507((byte) 6);
			method8553(958826437);
			Class28.method864(Class451.aCanvas4939, 647567278);
		}
	}

	public void method383() {
		if (!aBool7036)
			aLong7042 = 0L;
	}

	void method8571(File file, File file_89_) {
		try {
			Class19 class19 = new Class19(Class527_Sub8_Sub13_Sub1.aFile12033, "rw", 10000L);
			RSByteBuffer class527_sub38 = new RSByteBuffer(500);
			class527_sub38.writeByte(3, 1770365997);
			class527_sub38.writeByte(file_89_ != null ? 1 : 0, -83672547);
			class527_sub38.writeGJString(file.getPath(), -1968427149);
			if (file_89_ != null)
				class527_sub38.writeGJString(file_89_.getPath(), -1968427149);
			class19.method760(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 116);
			class19.method751((byte) 14);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public void method382() {
		if (!aBool7036)
			aLong7042 = 0L;
	}

	public void method386() {
		if (!aBool7036)
			aLong7042 = ((Class234.method4347(-1408626088) + 4000L) * 566320195339239335L);
	}

	public void method391() {
		if (!aBool7036)
			aLong7042 = ((Class234.method4347(-1408626088) + 4000L) * 566320195339239335L);
	}

	public void method387() {
		if (!aBool7036) {
			aLong7042 = Class234.method4347(-1408626088) * 566320195339239335L;
			Class518.method8635(5000L);
			method8510(false, -2044116326);
		}
	}

	public void method389() {
		if (!aBool7036) {
			aLong7042 = Class234.method4347(-1408626088) * 566320195339239335L;
			Class518.method8635(5000L);
			method8510(false, -2078613944);
		}
	}

	public final void method8572(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8573(WindowEvent windowevent) {
		/* empty */
	}

	public final void method380(Graphics graphics) {
		paint(graphics);
	}

	public void method384() {
		if (!aBool7036)
			aLong7042 = 0L;
	}

	public final synchronized void method393(Graphics graphics) {
		if (!aBool7036) {
			aBool7023 = true;
			if ((Class234.method4347(-1408626088) - aLong7035 * -4233394088639253223L) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null || (rectangle.width >= -21941151 * Class358.anInt3831 && rectangle.height >= -239790197 * Class76.anInt796))
					aBool7025 = true;
			}
		}
	}

	boolean method8574(File file, boolean bool, int i) {
		boolean bool_90_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i_91_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_91_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_90_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_90_;
	}

	public final void method8575(FocusEvent focusevent) {
		aBool7028 = true;
		aBool7023 = true;
	}

	public final void method8576(FocusEvent focusevent) {
		aBool7028 = true;
		aBool7023 = true;
	}

	public final void method8577(FocusEvent focusevent) {
		aBool7028 = false;
	}

	public abstract void init();

	void method8578(Class516 class516, boolean bool) {
		if (null == class516)
			throw new NullPointerException();
		if (class516 != Class516.aClass516_7050 && class516 != Class516.aClass516_7049)
			throw new IllegalStateException();
		aClass516_7041 = class516;
		if (aClass516_7041 != Class516.aClass516_7049) {
			if (bool)
				aClass516_7041 = Class516.aClass516_7048;
		}
	}

	public final void method8579(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8580(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8581(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8582(FocusEvent focusevent) {
		aBool7028 = false;
	}

	public final void method8583(WindowEvent windowevent) {
		aBool7029 = true;
		destroy();
	}

	public void run() {
		do {
			try {
				try {
					method8513((byte) -121);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class180.method3542(method8509((byte) 85), throwable, 1604547405);
					method8518("crash", -574384564);
					method8510(true, -1955596539);
					break;
				}
				method8510(true, -1415497118);
			} catch (Exception object) {
				method8510(true, -1445106215);
				throw object;
			}
		} while (false);
	}

	void method8584(Container container) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class451.aCanvas4939);
		Class451.aCanvas4939.setSize(Class289.anInt3223 * -1803844265, -471480167 * Class611.anInt8009);
		Class451.aCanvas4939.setVisible(true);
		if (Class514.aFrame7012 == container) {
			Insets insets = Class514.aFrame7012.getInsets();
			Class451.aCanvas4939.setLocation((insets.left + -416298495 * anInt7019), (insets.top + anInt7020 * -1313216019));
		} else
			Class451.aCanvas4939.setLocation(-416298495 * anInt7019, -1313216019 * anInt7020);
		Class451.aCanvas4939.addFocusListener(this);
		Class451.aCanvas4939.requestFocus();
		Class333.aBool3628 = true;
		aBool7028 = true;
		Class451.aCanvas4939.setFocusTraversalKeysEnabled(false);
		aBool7023 = true;
		aBool7025 = false;
		aLong7035 = Class234.method4347(-1408626088) * -2725090416659441879L;
	}

	public final void method8585(WindowEvent windowevent) {
		/* empty */
	}

	public final void method8586(WindowEvent windowevent) {
		/* empty */
	}

	public void method385() {
		if (!aBool7036)
			aLong7042 = ((Class234.method4347(-1408626088) + 4000L) * 566320195339239335L);
	}

	public final void method8587(WindowEvent windowevent) {
		/* empty */
	}

	public final void method388(Graphics graphics) {
		paint(graphics);
	}

	abstract void method8588();

	public final void method8589(WindowEvent windowevent) {
		/* empty */
	}

	final void method8590(String string, String string_92_, int i, int i_93_, int i_94_, int i_95_, int i_96_) throws Exception {
		Class425.anInt4805 = 849633399 * i_93_;
		Class23.anInt228 = -789435131 * i;
		RuntimeException_Sub1.anInt12042 = i_94_ * 126629633;
		RuntimeException_Sub1.anInt12040 = -540544861 * i_95_;
		Class282.aString3198 = "Unknown";
		Class261.aString2862 = "1.1";
		try {
			Class282.aString3198 = System.getProperty("java.vendor");
			Class261.aString2862 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			Class385.aString3961 = System.getProperty("os.name");
		} catch (Exception exception) {
			Class385.aString3961 = "Unknown";
		}
		Class234.aString2373 = Class385.aString3961.toLowerCase();
		try {
			Class193.aString2155 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class193.aString2155 = "";
		}
		try {
			Class383_Sub1.aString10277 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class383_Sub1.aString10277 = "";
		}
		try {
			Class329.aString3605 = System.getProperty("user.home");
			if (Class329.aString3605 != null)
				Class329.aString3605 = new StringBuilder().append(Class329.aString3605).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class234.aString2373.startsWith("win")) {
				if (Class329.aString3605 == null)
					Class329.aString3605 = System.getenv("USERPROFILE");
			} else if (null == Class329.aString3605)
				Class329.aString3605 = System.getenv("HOME");
			if (null != Class329.aString3605)
				Class329.aString3605 = new StringBuilder().append(Class329.aString3605).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == Class329.aString3605)
			Class329.aString3605 = "~/";
		try {
			Class388.anEventQueue3989 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class667.aStringArray8566 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class329.aString3605, "/tmp/", "" };
		Class338.aStringArray3654 = new String[] { new StringBuilder().append(".jagex_cache_").append(Class23.anInt228 * -692807731).toString(), new StringBuilder().append(".file_store_").append(-692807731 * Class23.anInt228).toString() };
		while_15_: for (int i_97_ = 0; i_97_ < 4; i_97_++) {
			Class105.aFile1307 = method8543(string, string_92_, i_97_, 2016384461);
			if (!Class105.aFile1307.exists())
				Class105.aFile1307.mkdirs();
			File[] files = Class105.aFile1307.listFiles();
			if (null != files) {
				File[] files_98_ = files;
				for (int i_99_ = 0; i_99_ < files_98_.length; i_99_++) {
					File file = files_98_[i_99_];
					if (!method8574(file, false, 37147))
						continue while_15_;
				}
			}
			break;
		}
		Class641.method10703(Class105.aFile1307, -385890812);
		Class331_Sub3.method15769(-664078857);
		aClass1_7032 = new Class1(new Class19((Class558.method9444("main_file_cache.dat2", 2017645370)), "rw", 3221225472L), 5200, 0);
		aClass1_7038 = new Class1(new Class19((Class558.method9444("main_file_cache.idx255", 2076331874)), "rw", 1048576L), 6000, 0);
		Class550.aClass1Array7294 = new Class1[Class425.anInt4805 * 1358395719];
		for (int i_100_ = 0; i_100_ < Class425.anInt4805 * 1358395719; i_100_++)
			Class550.aClass1Array7294[i_100_] = new Class1(new Class19((Class558.method9444(new StringBuilder().append("main_file_cache.idx").append(i_100_).toString(), 2008952446)), "rw", 1048576L), 6000, 0);
		try {
			Class504.aClass709_6907 = new Class709();
		} catch (Exception exception) {
			Class707.aBool8841 = false;
		}
		Class330.aClass513_3609 = new Class513();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_101_ = threadgroup.getParent(); null != threadgroup_101_; threadgroup_101_ = threadgroup.getParent())
			threadgroup = threadgroup_101_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_102_ = 0; i_102_ < threads.length; i_102_++) {
			if (threads[i_102_] != null && threads[i_102_].getName().startsWith("AWT"))
				threads[i_102_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	abstract void method8591();

	public void supplyApplet(Applet applet) {
		Class212.anApplet2258 = applet;
	}

	public static final void method8592(int i, String string, Color color, Color color_103_, Color color_104_) {
		try {
			Graphics graphics = Class451.aCanvas4939.getGraphics();
			if (null == aFont7021)
				aFont7021 = new Font("Helvetica", 1, 13);
			if (null == color)
				color = new Color(140, 17, 17);
			if (null == color_103_)
				color_103_ = new Color(140, 17, 17);
			if (null == color_104_)
				color_104_ = new Color(255, 255, 255);
			try {
				if (null == Class629.anImage8217)
					Class629.anImage8217 = Class451.aCanvas4939.createImage((Class289.anInt3223 * -1803844265), (-471480167 * (Class611.anInt8009)));
				Graphics graphics_105_ = Class629.anImage8217.getGraphics();
				graphics_105_.setColor(Color.black);
				graphics_105_.fillRect(0, 0, -1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009);
				int i_106_ = Class289.anInt3223 * -1803844265 / 2 - 152;
				int i_107_ = Class611.anInt8009 * -471480167 / 2 - 18;
				graphics_105_.setColor(color_103_);
				graphics_105_.drawRect(i_106_, i_107_, 303, 33);
				graphics_105_.setColor(color);
				graphics_105_.fillRect(i_106_ + 2, i_107_ + 2, i * 3, 30);
				graphics_105_.setColor(Color.black);
				graphics_105_.drawRect(1 + i_106_, i_107_ + 1, 301, 31);
				graphics_105_.fillRect(2 + i_106_ + i * 3, 2 + i_107_, 300 - i * 3, 30);
				graphics_105_.setFont(aFont7021);
				graphics_105_.setColor(color_104_);
				graphics_105_.drawString(string, (i_106_ + (304 - string.length() * 6) / 2), i_107_ + 22);
				if (null != aString7037) {
					graphics_105_.setFont(aFont7021);
					graphics_105_.setColor(color_104_);
					graphics_105_.drawString(aString7037, ((-1803844265 * Class289.anInt3223 / 2) - aString7037.length() * 6 / 2), (-471480167 * Class611.anInt8009 / 2) - 26);
				}
				graphics.drawImage(Class629.anImage8217, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Class289.anInt3223 * -1803844265, Class611.anInt8009 * -471480167);
				int i_108_ = -1803844265 * Class289.anInt3223 / 2 - 152;
				int i_109_ = -471480167 * Class611.anInt8009 / 2 - 18;
				graphics.setColor(color_103_);
				graphics.drawRect(i_108_, i_109_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(i_108_ + 2, i_109_ + 2, i * 3, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(i_108_ + 1, i_109_ + 1, 301, 31);
				graphics.fillRect(3 * i + (2 + i_108_), 2 + i_109_, 300 - i * 3, 30);
				graphics.setFont(aFont7021);
				graphics.setColor(color_104_);
				if (aString7037 != null) {
					graphics.setFont(aFont7021);
					graphics.setColor(color_104_);
					graphics.drawString(aString7037, (-1803844265 * Class289.anInt3223 / 2 - aString7037.length() * 6 / 2), (-471480167 * Class611.anInt8009 / 2 - 26));
				}
				graphics.drawString(string, i_108_ + (304 - string.length() * 6) / 2, 22 + i_109_);
			}
		} catch (Exception exception) {
			Class451.aCanvas4939.repaint();
		}
	}

	public static final void method8593() {
		Class629.anImage8217 = null;
		aFont7021 = null;
	}

	synchronized void method8594() {
		method8495((byte) -51);
		Container container = Class198.method3745((byte) 31);
		Class451.aCanvas4939 = new Canvas_Sub1(container);
		method8502(container, (byte) 0);
	}

	void method8595(String string) {
		if (!aBool7044) {
			aBool7044 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class60.method1375(Class212.anApplet2258, "loggedout", 1264075127);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class212.anApplet2258.getAppletContext().showDocument(new URL(Class212.anApplet2258.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method8596(String string) {
		if (!aBool7044) {
			aBool7044 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class60.method1375(Class212.anApplet2258, "loggedout", 661921420);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class212.anApplet2258.getAppletContext().showDocument(new URL(Class212.anApplet2258.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method8597(String string, String string_110_) {
		if (!aBool7044) {
			aBool7044 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class60.method1375(Class212.anApplet2258, "loggedout", 1079689910);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class212.anApplet2258.getAppletContext().showDocument(new URL(Class212.anApplet2258.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws?").append(string_110_).toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public void method8598() throws Exception_Sub2 {
		if (!aBool7047) {
			Class177.method3056((byte) -26).method369("jaclib", 561725294);
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class234.aString2373.startsWith("win"))
					throw new Exception_Sub2(128, "jaclib");
			}
			aBool7047 = true;
		}
	}

	public void method8599() throws Exception_Sub2 {
		if (!aBool7047) {
			Class177.method3056((byte) 28).method369("jaclib", 966397224);
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class234.aString2373.startsWith("win"))
					throw new Exception_Sub2(128, "jaclib");
			}
			aBool7047 = true;
		}
	}

	public void method8600() throws Exception_Sub2 {
		if (!aBool7047) {
			Class177.method3056((byte) 34).method369("jaclib", -1798601558);
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class234.aString2373.startsWith("win"))
					throw new Exception_Sub2(128, "jaclib");
			}
			aBool7047 = true;
		}
	}

	final void method8601(boolean bool) {
		synchronized (this) {
			if (aBool7036)
				return;
			aBool7036 = true;
		}
		try {
			method8517(1954043783);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass1_7032.method491(187115137);
			for (int i = 0; i < 1358395719 * Class425.anInt4805; i++)
				Class550.aClass1Array7294[i].method491(222737876);
			aClass1_7038.method491(691271496);
			aClass1_7026.method491(-512724025);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool7047) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class208_Sub19.method15633((byte) 2))
			Class177.method3056((byte) -86).method368((byte) -28);
		if (Class451.aCanvas4939 != null) {
			try {
				Class451.aCanvas4939.removeFocusListener(this);
				Class451.aCanvas4939.getParent().remove(Class451.aCanvas4939);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (Class514.aFrame7012 != null) {
			Class514.aFrame7012.setVisible(false);
			Class514.aFrame7012.dispose();
			Class514.aFrame7012 = null;
		}
	}

	public final void method392(Graphics graphics) {
		paint(graphics);
	}

	public static Class516 method8602() {
		return aClass516_7041;
	}

	static final void method8603(Class665 class665, int i) {
		int i_111_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_111_, 738736315);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 236302803 * class243.anInt2576;
	}

	static final void method8604(Class665 class665, byte i) {
		class665.anInt8526 -= 307142523;
		byte[] is = { (byte) class665.anIntArray8525[1769813785 * class665.anInt8526] };
		byte[] is_112_ = { (byte) class665.anIntArray8525[1 + class665.anInt8526 * 1769813785] };
		int i_113_ = class665.anIntArray8525[2 + class665.anInt8526 * 1769813785];
		Class243 class243 = Class648.method10837(i_113_, 42761709);
		Class527_Sub41.method16680(class243, is, is_112_, class665, -300145839);
	}

	static void method8605(int i, boolean bool, short i_114_) {
		Class527_Sub1 class527_sub1 = Class263.method4962(i, bool, (byte) 64);
		if (class527_sub1 != null) {
			for (int i_115_ = 0; i_115_ < class527_sub1.anIntArray10332.length; i_115_++) {
				class527_sub1.anIntArray10332[i_115_] = -1;
				class527_sub1.anIntArray10330[i_115_] = 0;
			}
			class527_sub1.aClass18Array10335 = null;
		}
	}
}
