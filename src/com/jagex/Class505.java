/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

public abstract class Class505 implements Interface62, Runnable, FocusListener, WindowListener {
	static long aLong6855;
	public static int anInt6856;
	public static int anInt6857;
	boolean aBool6858;
	static final int anInt6859 = 32;
	static long[] aLongArray6860;
	static long[] aLongArray6861;
	boolean aBool6862 = false;
	public static int anInt6863;
	public static int anInt6864;
	protected static volatile boolean aBool6865;
	static final String aString6866 = "main_file_cache.dat2";
	static final int anInt6867 = 0;
	static volatile long aLong6868;
	protected static boolean aBool6869;
	static volatile boolean aBool6870;
	static final long aLong6871 = 3221225472L;
	static final int anInt6872 = 1048576;
	static final String aString6873 = "rw";
	static int anInt6874;
	static final String aString6875 = "main_file_cache.idx";
	static final String aString6876 = "main_file_cache.idx255";
	static final String aString6877 = "random.dat";
	static Class18 aClass18_6878;
	protected static Class18 aClass18_6879;
	protected static Class18 aClass18_6880;
	protected static String aString6881;
	static final int anInt6882 = 1;
	public static Class504 aClass504_6883;
	public static int anInt6884;
	static boolean aBool6885;
	static long aLong6886 = -124605970243904768L;
	public static int anInt6887;
	static Class512 aClass512_6888;
	protected static volatile boolean aBool6889;

	synchronized void method6080(byte i) {
		method6088(-267448915);
		Container container = Class300.method4022((byte) 0);
		Class399.aCanvas4127 = new Canvas_Sub1(container);
		method6087(container, -237155511);
	}

	public void supplyApplet(Applet applet) {
		Class622.anApplet8126 = applet;
	}

	final void method6081(Class496 class496, String string, String string_0_, int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			method6124(Class512.aClass512_6932, bool, (byte) 1);
			Class500.anInt6841 = ((Class144.anInt1679 = class496.method6009((byte) 19) * -1756763355) * -126642153);
			Class313.anInt3499 = ((Class34_Sub6.anInt10965 = class496.method6010(-1426967281) * -2083311653) * -2047396477);
			anInt6887 = 0;
			anInt6863 = 0;
			if (Class74.method1136(-1617235478) == Class512.aClass512_6933) {
				Class500.anInt6841 += -373149530 * class496.method6002((byte) -20);
				Class313.anInt3499 += 1116579874 * class496.method6001(-548859475);
				method6127(class496.method6004(-527555887), (byte) 125);
			}
			Class249.anApplet2529 = Class622.anApplet8126;
			method6082(string, string_0_, i, i_1_, i_2_, i_3_, (byte) 48);
		} catch (Throwable throwable) {
			Class81.method1165(null, throwable, (byte) 56);
			method6121("crash", -1595167576);
		}
	}

	final void method6082(String string, String string_5_, int i, int i_6_, int i_7_, int i_8_, byte i_9_) throws Exception {
		Class151.anInt1711 = i_6_ * -677434807;
		Class679.anInt8636 = -1179446659 * i;
		RuntimeException_Sub1.anInt12035 = 1645710011 * i_7_;
		RuntimeException_Sub1.anInt12038 = i_8_ * 33878745;
		InputStream_Sub1.aString10980 = "Unknown";
		Class31.aString276 = "1.1";
		try {
			InputStream_Sub1.aString10980 = System.getProperty("java.vendor");
			Class31.aString276 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			Class333.aString3621 = System.getProperty("os.name");
		} catch (Exception exception) {
			Class333.aString3621 = "Unknown";
		}
		Class241.aString2456 = Class333.aString3621.toLowerCase();
		try {
			Class451.aString4948 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class451.aString4948 = "";
		}
		try {
			Class221.aString2312 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class221.aString2312 = "";
		}
		try {
			Class189.aString2145 = System.getProperty("user.home");
			if (Class189.aString2145 != null)
				Class189.aString2145 = new StringBuilder().append(Class189.aString2145).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class241.aString2456.startsWith("win")) {
				if (null == Class189.aString2145)
					Class189.aString2145 = System.getenv("USERPROFILE");
			} else if (null == Class189.aString2145)
				Class189.aString2145 = System.getenv("HOME");
			if (null != Class189.aString2145)
				Class189.aString2145 = new StringBuilder().append(Class189.aString2145).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (Class189.aString2145 == null)
			Class189.aString2145 = "~/";
		try {
			Class397.anEventQueue4116 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class107.aStringArray1322 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class189.aString2145, "/tmp/", "" };
		Class248.aStringArray2526 = new String[] { new StringBuilder().append(".jagex_cache_").append(-1104382251 * Class679.anInt8636).toString(), new StringBuilder().append(".file_store_").append(Class679.anInt8636 * -1104382251).toString() };
		while_24_: for (int i_10_ = 0; i_10_ < 4; i_10_++) {
			Class63.aFile718 = method6083(string, string_5_, i_10_, 632873891);
			if (!Class63.aFile718.exists())
				Class63.aFile718.mkdirs();
			File[] files = Class63.aFile718.listFiles();
			if (null != files) {
				File[] files_11_ = files;
				for (int i_12_ = 0; i_12_ < files_11_.length; i_12_++) {
					File file = files_11_[i_12_];
					if (!method6085(file, false, 1569708124))
						continue while_24_;
				}
			}
			break;
		}
		Class247.method3425(Class63.aFile718, (byte) 8);
		Class550_Sub1.method9815(1074099657);
		aClass18_6879 = new Class18(new Class6((Class674.method8031("main_file_cache.dat2", 114563965)), "rw", 3221225472L), 5200, 0);
		aClass18_6880 = new Class18(new Class6((Class674.method8031("main_file_cache.idx255", 114563965)), "rw", 1048576L), 6000, 0);
		Class484.aClass18Array5436 = new Class18[-1362565127 * Class151.anInt1711];
		for (int i_13_ = 0; i_13_ < Class151.anInt1711 * -1362565127; i_13_++)
			Class484.aClass18Array5436[i_13_] = new Class18(new Class6((Class674.method8031(new StringBuilder().append("main_file_cache.idx").append(i_13_).toString(), 114563965)), "rw", 1048576L), 6000, 0);
		try {
			Class464.aClass691_5228 = new Class691();
		} catch (Exception exception) {
			Class707.aBool8822 = false;
		}
		Class285.aClass517_3192 = new Class517();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_14_ = threadgroup.getParent(); threadgroup_14_ != null; threadgroup_14_ = threadgroup.getParent())
			threadgroup = threadgroup_14_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_15_ = 0; i_15_ < threads.length; i_15_++) {
			if (null != threads[i_15_] && threads[i_15_].getName().startsWith("AWT"))
				threads[i_15_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	File method6083(String string, String string_16_, int i, int i_17_) {
		String string_18_ = (0 == i ? "" : new StringBuilder().append("").append(i).toString());
		Class483.aFile5430 = new File(Class189.aString2145, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_16_).append(string_18_).append(".dat").toString());
		String string_19_ = null;
		String string_20_ = null;
		boolean bool = false;
		if (Class483.aFile5430.exists()) {
			try {
				Class6 class6 = new Class6(Class483.aFile5430, "rw", 10000L);
				int i_21_;
				RSByteBuffer class536_sub33;
				for (class536_sub33 = new RSByteBuffer((int) class6.method586(917143623)); (-810172525 * class536_sub33.off < class536_sub33.buffer.length); class536_sub33.off += i_21_ * 516175515) {
					i_21_ = class6.method587(class536_sub33.buffer, (-810172525 * class536_sub33.off), ((class536_sub33.buffer).length - (class536_sub33.off * -810172525)), 416218073);
					if (-1 == i_21_)
						throw new IOException();
				}
				class536_sub33.off = 0;
				i_21_ = class536_sub33.readUnsignedByte();
				if (i_21_ < 1 || i_21_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_21_).toString());
				int i_22_ = 0;
				if (i_21_ > 1)
					i_22_ = class536_sub33.readUnsignedByte();
				if (i_21_ <= 2) {
					string_19_ = class536_sub33.readVersionedString();
					if (1 == i_22_)
						string_20_ = class536_sub33.readVersionedString();
				} else {
					string_19_ = class536_sub33.method9715(-1120069370);
					if (1 == i_22_)
						string_20_ = class536_sub33.method9715(-1497565237);
				}
				class6.method585(-1411037171);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_19_) {
				File file = new File(string_19_);
				if (!file.exists())
					string_19_ = null;
			}
			if (string_19_ != null) {
				File file = new File(string_19_, "test.dat");
				if (!method6085(file, true, 2044659443))
					string_19_ = null;
			}
		}
		if (string_19_ == null && 0 == i) {
			while_25_: for (int i_23_ = 0; i_23_ < Class248.aStringArray2526.length; i_23_++) {
				for (int i_24_ = 0; i_24_ < Class107.aStringArray1322.length; i_24_++) {
					File file = new File(new StringBuilder().append(Class107.aStringArray1322[i_24_]).append(Class248.aStringArray2526[i_23_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method6085(new File(file, "test.dat"), true, -851110425)) {
						string_19_ = file.toString();
						bool = true;
						break while_25_;
					}
				}
			}
		}
		if (string_19_ == null) {
			string_19_ = new StringBuilder().append(Class189.aString2145).append(File.separatorChar).append("jagexcache").append(string_18_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_16_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_20_) {
			File file = new File(string_20_);
			File file_25_ = new File(string_19_);
			try {
				File[] files = file.listFiles();
				File[] files_26_ = files;
				for (int i_27_ = 0; i_27_ < files_26_.length; i_27_++) {
					File file_28_ = files_26_[i_27_];
					File file_29_ = new File(file_25_, file_28_.getName());
					boolean bool_30_ = file_28_.renameTo(file_29_);
					if (!bool_30_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method6110(new File(string_19_), null, 2002445214);
		return new File(string_19_);
	}

	abstract void method6084(int i);

	boolean method6085(File file, boolean bool, int i) {
		boolean bool_31_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i_32_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_32_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_31_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_31_;
	}

	abstract void method6086();

	void method6087(Container container, int i) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class399.aCanvas4127);
		Class399.aCanvas4127.setSize(-1804846931 * Class144.anInt1679, Class34_Sub6.anInt10965 * 589116499);
		Class399.aCanvas4127.setVisible(true);
		if (container == Class145.aFrame1692) {
			Insets insets = Class145.aFrame1692.getInsets();
			Class399.aCanvas4127.setLocation((insets.left + 1509041125 * anInt6887), (insets.top + anInt6863 * -1413419225));
		} else
			Class399.aCanvas4127.setLocation(anInt6887 * 1509041125, anInt6863 * -1413419225);
		Class399.aCanvas4127.addFocusListener(this);
		Class399.aCanvas4127.requestFocus();
		Class67_Sub1.aBool10601 = true;
		aBool6870 = true;
		Class399.aCanvas4127.setFocusTraversalKeysEnabled(false);
		aBool6889 = true;
		aBool6865 = false;
		aLong6868 = Class249.method3450(2018621804) * -5994310136978674325L;
	}

	void method6088(int i) {
		if (null != Class399.aCanvas4127) {
			Class399.aCanvas4127.removeFocusListener(this);
			Class399.aCanvas4127.getParent().setBackground(Color.black);
			Class399.aCanvas4127.getParent().remove(Class399.aCanvas4127);
		}
	}

	final boolean method6089(int i) {
		String string = Class622.anApplet8126.getDocumentBase().getHost().toLowerCase();
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
		method6121("invalidhost", 1741174878);
		return false;
	}

	public void run() {
		do {
			try {
				try {
					method6126((byte) -87);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class81.method1165(method6092(1546429760), throwable, (byte) 19);
					method6121("crash", 2073449117);
					method6093(true, (byte) -1);
					break;
				}
				method6093(true, (byte) -1);
			} catch (Exception object) {
				method6093(true, (byte) -1);
				throw object;
			}
		} while (false);
	}

	public final void windowClosing(WindowEvent windowevent) {
		aBool6869 = true;
		destroy();
	}

	void method6090(byte i) {
		long l = Class249.method3450(2032200748);
		long l_33_ = aLongArray6861[Class477.anInt5382 * 549721781];
		aLongArray6861[Class477.anInt5382 * 549721781] = l;
		Class477.anInt5382 = (Class477.anInt5382 * 549721781 + 1 & 0x1f) * 1610000285;
		if (0L != l_33_ && l <= l_33_) {
			/* empty */
		}
		synchronized (this) {
			Class67_Sub1.aBool10601 = aBool6870;
		}
		method6096((byte) -127);
	}

	void method6091(byte i) {
		long l = Class249.method3450(1820567083);
		long l_34_ = aLongArray6860[-1147796785 * Class217.anInt2305 - 1 & 0x1f];
		long l_35_ = aLongArray6860[Class217.anInt2305 * -1147796785];
		aLongArray6860[-1147796785 * Class217.anInt2305] = l;
		Class217.anInt2305 = (1 + -1147796785 * Class217.anInt2305 & 0x1f) * -981351377;
		if (0L != l_35_ && l > l_35_) {
			int i_36_ = (int) (l - l_35_);
			anInt6884 = 951262637 * (int) (l - l_34_);
			anInt6856 = -20875515 * (((i_36_ >> 1) + 32000) / i_36_);
		}
		if ((anInt6874 += 2042358681) * 598227113 - 1 > 50) {
			anInt6874 -= -961281054;
			aBool6889 = true;
			Class399.aCanvas4127.setSize(Class144.anInt1679 * -1804846931, 589116499 * Class34_Sub6.anInt10965);
			Class399.aCanvas4127.setVisible(true);
			if (Class145.aFrame1692 != null && null == Class223.aFrame2336) {
				Insets insets = Class145.aFrame1692.getInsets();
				Class399.aCanvas4127.setLocation((insets.left + 1509041125 * anInt6887), (insets.top + -1413419225 * anInt6863));
			} else
				Class399.aCanvas4127.setLocation(anInt6887 * 1509041125, anInt6863 * -1413419225);
		}
		method6109((byte) -35);
	}

	String method6092(int i) {
		return null;
	}

	final void method6093(boolean bool, byte i) {
		synchronized (this) {
			if (aBool6885)
				return;
			aBool6885 = true;
		}
		try {
			method6097(-1537177856);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass18_6879.method672(-2101761707);
			for (int i_37_ = 0; i_37_ < -1362565127 * Class151.anInt1711; i_37_++)
				Class484.aClass18Array5436[i_37_].method672(-1932898936);
			aClass18_6880.method672(-1974325459);
			aClass18_6878.method672(-1930369667);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool6858) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class536_Sub24.method9591(1357904623))
			Class114.method1481((byte) 33).method209(-1448067218);
		if (Class399.aCanvas4127 != null) {
			try {
				Class399.aCanvas4127.removeFocusListener(this);
				Class399.aCanvas4127.getParent().remove(Class399.aCanvas4127);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (null != Class145.aFrame1692) {
			Class145.aFrame1692.setVisible(false);
			Class145.aFrame1692.dispose();
			Class145.aFrame1692 = null;
		}
	}

	public void start() {
		if (!aBool6885)
			aLong6855 = 0L;
	}

	void method6094() {
		long l = Class249.method3450(1352207270);
		long l_38_ = aLongArray6861[Class477.anInt5382 * 549721781];
		aLongArray6861[Class477.anInt5382 * 549721781] = l;
		Class477.anInt5382 = (Class477.anInt5382 * 549721781 + 1 & 0x1f) * 1610000285;
		if (0L != l_38_ && l <= l_38_) {
			/* empty */
		}
		synchronized (this) {
			Class67_Sub1.aBool10601 = aBool6870;
		}
		method6096((byte) -98);
	}

	public void destroy() {
		if (!aBool6885) {
			aLong6855 = Class249.method3450(1650200503) * 9209616068252677303L;
			Class212.method3067(5000L);
			method6093(false, (byte) -1);
		}
	}

	public final void update(Graphics graphics) {
		paint(graphics);
	}

	public final synchronized void paint(Graphics graphics) {
		if (!aBool6885) {
			aBool6889 = true;
			if ((Class249.method3450(1872108848) - aLong6868 * 2938380846569871171L) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= Class500.anInt6841 * 569699291 && rectangle.height >= Class313.anInt3499 * 160996593))
					aBool6865 = true;
			}
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		aBool6870 = true;
		aBool6889 = true;
	}

	Class505() {
		aBool6858 = false;
	}

	void method6095() {
		long l = Class249.method3450(2031841341);
		long l_39_ = aLongArray6860[-1147796785 * Class217.anInt2305 - 1 & 0x1f];
		long l_40_ = aLongArray6860[Class217.anInt2305 * -1147796785];
		aLongArray6860[-1147796785 * Class217.anInt2305] = l;
		Class217.anInt2305 = (1 + -1147796785 * Class217.anInt2305 & 0x1f) * -981351377;
		if (0L != l_40_ && l > l_40_) {
			int i = (int) (l - l_40_);
			anInt6884 = 951262637 * (int) (l - l_39_);
			anInt6856 = -20875515 * (((i >> 1) + 32000) / i);
		}
		if ((anInt6874 += 2042358681) * 598227113 - 1 > 50) {
			anInt6874 -= -961281054;
			aBool6889 = true;
			Class399.aCanvas4127.setSize(Class144.anInt1679 * -1804846931, 589116499 * Class34_Sub6.anInt10965);
			Class399.aCanvas4127.setVisible(true);
			if (Class145.aFrame1692 != null && null == Class223.aFrame2336) {
				Insets insets = Class145.aFrame1692.getInsets();
				Class399.aCanvas4127.setLocation((insets.left + 1509041125 * anInt6887), (insets.top + -1413419225 * anInt6863));
			} else
				Class399.aCanvas4127.setLocation(anInt6887 * 1509041125, anInt6863 * -1413419225);
		}
		method6109((byte) -102);
	}

	public final void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowOpened(WindowEvent windowevent) {
		/* empty */
	}

	public abstract void init();

	abstract void method6096(byte i);

	abstract void method6097(int i);

	void method6098(String string, String string_41_, int i) {
		if (!aBool6862) {
			aBool6862 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class25.method729(Class622.anApplet8126, "loggedout", 1422653631);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class622.anApplet8126.getAppletContext().showDocument(new URL(Class622.anApplet8126.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws?").append(string_41_).toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public final void method6099(FocusEvent focusevent) {
		aBool6870 = false;
	}

	abstract void method6100();

	static {
		anInt6856 = 0;
		anInt6884 = 0;
		aLongArray6860 = new long[32];
		aLongArray6861 = new long[32];
		anInt6887 = 0;
		anInt6863 = 0;
		aString6881 = null;
		aBool6889 = true;
		anInt6874 = -1022875948;
		aBool6865 = false;
		aLong6868 = 0L;
		aBool6869 = false;
		aBool6870 = true;
		aClass18_6878 = null;
		aClass18_6879 = null;
		aClass18_6880 = null;
		aClass512_6888 = null;
		aLong6855 = 0L;
		aBool6885 = false;
		anInt6857 = -886517331;
		anInt6864 = -1652957041;
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	abstract void method6101();

	abstract void method6102();

	abstract void method6103();

	String method6104() {
		return null;
	}

	String method6105() {
		return null;
	}

	String method6106() {
		return null;
	}

	String method6107() {
		return null;
	}

	public void method394(Applet applet) {
		Class622.anApplet8126 = applet;
	}

	public void method395(Applet applet) {
		Class622.anApplet8126 = applet;
	}

	public void method409(Applet applet) {
		Class622.anApplet8126 = applet;
	}

	public static final void method6108() {
		Class655.anImage8495 = null;
		Class41_Sub1.aFont10561 = null;
	}

	abstract void method6109(byte i);

	void method6110(File file, File file_42_, int i) {
		try {
			Class6 class6 = new Class6(Class483.aFile5430, "rw", 10000L);
			RSByteBuffer class536_sub33 = new RSByteBuffer(500);
			class536_sub33.writeByte(3);
			class536_sub33.writeByte(null != file_42_ ? 1 : 0);
			class536_sub33.method9752(file.getPath(), -13799264);
			if (file_42_ != null)
				class536_sub33.method9752(file_42_.getPath(), 638096067);
			class6.method584(class536_sub33.buffer, 0, -810172525 * class536_sub33.off, (byte) 1);
			class6.method585(-1411037171);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public static void method6111(RSByteBuffer class536_sub33) {
		byte[] is = new byte[24];
		try {
			aClass18_6878.method673(0L);
			aClass18_6878.method685(is, (byte) 117);
			int i;
			for (i = 0; i < 24 && 0 == is[i]; i++) {
				/* empty */
			}
			if (i >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i = 0; i < 24; i++)
				is[i] = (byte) -1;
		}
		class536_sub33.writeBytes(is, 0, 24, (byte) 9);
	}

	abstract void method6112();

	void method6113() {
		if (null != Class399.aCanvas4127) {
			Class399.aCanvas4127.removeFocusListener(this);
			Class399.aCanvas4127.getParent().setBackground(Color.black);
			Class399.aCanvas4127.getParent().remove(Class399.aCanvas4127);
		}
	}

	void method6114() {
		if (null != Class399.aCanvas4127) {
			Class399.aCanvas4127.removeFocusListener(this);
			Class399.aCanvas4127.getParent().setBackground(Color.black);
			Class399.aCanvas4127.getParent().remove(Class399.aCanvas4127);
		}
	}

	static void method6115() {
		try {
			File file = new File(Class189.aString2145, "random.dat");
			if (file.exists())
				aClass18_6878 = new Class18(new Class6(file, "rw", 25L), 24, 0);
			else {
				while_26_: for (int i = 0; i < Class248.aStringArray2526.length; i++) {
					for (int i_43_ = 0; i_43_ < Class107.aStringArray1322.length; i_43_++) {
						File file_44_ = new File(new StringBuilder().append(Class107.aStringArray1322[i_43_]).append(Class248.aStringArray2526[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_44_.exists()) {
							aClass18_6878 = new Class18(new Class6(file_44_, "rw", 25L), 24, 0);
							break while_26_;
						}
					}
				}
			}
			if (aClass18_6878 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass18_6878 = new Class18(new Class6(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	abstract void method6116();

	void method6117() {
		if (InputStream_Sub1.aString10980 != null) {
			String string = InputStream_Sub1.aString10980.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_45_ = Class31.aString276;
				if (string_45_.equals("1.1") || string_45_.startsWith("1.1.") || string_45_.equals("1.2") || string_45_.startsWith("1.2.") || string_45_.equals("1.3") || string_45_.startsWith("1.3.") || string_45_.equals("1.4") || string_45_.startsWith("1.4.") || string_45_.equals("1.5") || string_45_.startsWith("1.5.") || string_45_.equals("1.6.0")) {
					method6121("wrongjava", -949398473);
					return;
				}
				if (string_45_.startsWith("1.6.0_")) {
					int i;
					for (i = 6; (i < string_45_.length() && Class97.method1318(string_45_.charAt(i), -454062706)); i++) {
						/* empty */
					}
					String string_46_ = string_45_.substring(6, i);
					if (Class710_Sub30.method10184(string_46_, -1506968299) && Class392.method4867(string_46_, -1757591262) < 10) {
						method6121("wrongjava", 2098961157);
						return;
					}
				}
			}
		}
		Class300.method4022((byte) 0).setFocusCycleRoot(true);
		anInt6857 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 886517331);
		anInt6864 = Runtime.getRuntime().availableProcessors() * -1652957041;
		method6080((byte) -40);
		method6084(-1588861472);
		aClass504_6883 = Class449.method5423(-1056111649);
		while (aLong6855 * -765353526295598841L == 0L || (Class249.method3450(1910198023) < aLong6855 * -765353526295598841L)) {
			Class243.anInt2458 = (aClass504_6883.method6068(-4013848546647482281L * aLong6886) * 541300575);
			for (int i = 0; i < Class243.anInt2458 * 1057522847; i++)
				method6090((byte) -54);
			method6091((byte) 26);
			Class106.method1430(Class399.aCanvas4127, (byte) 1);
		}
	}

	void method6118() {
		if (InputStream_Sub1.aString10980 != null) {
			String string = InputStream_Sub1.aString10980.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_47_ = Class31.aString276;
				if (string_47_.equals("1.1") || string_47_.startsWith("1.1.") || string_47_.equals("1.2") || string_47_.startsWith("1.2.") || string_47_.equals("1.3") || string_47_.startsWith("1.3.") || string_47_.equals("1.4") || string_47_.startsWith("1.4.") || string_47_.equals("1.5") || string_47_.startsWith("1.5.") || string_47_.equals("1.6.0")) {
					method6121("wrongjava", -208547023);
					return;
				}
				if (string_47_.startsWith("1.6.0_")) {
					int i;
					for (i = 6; (i < string_47_.length() && Class97.method1318(string_47_.charAt(i), 62145438)); i++) {
						/* empty */
					}
					String string_48_ = string_47_.substring(6, i);
					if (Class710_Sub30.method10184(string_48_, -1506968299) && Class392.method4867(string_48_, 36651637) < 10) {
						method6121("wrongjava", 406566915);
						return;
					}
				}
			}
		}
		Class300.method4022((byte) 0).setFocusCycleRoot(true);
		anInt6857 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 886517331);
		anInt6864 = Runtime.getRuntime().availableProcessors() * -1652957041;
		method6080((byte) 0);
		method6084(395764202);
		aClass504_6883 = Class449.method5423(-1425002107);
		while (aLong6855 * -765353526295598841L == 0L || (Class249.method3450(2098430656) < aLong6855 * -765353526295598841L)) {
			Class243.anInt2458 = (aClass504_6883.method6068(-4013848546647482281L * aLong6886) * 541300575);
			for (int i = 0; i < Class243.anInt2458 * 1057522847; i++)
				method6090((byte) 14);
			method6091((byte) 68);
			Class106.method1430(Class399.aCanvas4127, (byte) 1);
		}
	}

	void method6119() {
		if (InputStream_Sub1.aString10980 != null) {
			String string = InputStream_Sub1.aString10980.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_49_ = Class31.aString276;
				if (string_49_.equals("1.1") || string_49_.startsWith("1.1.") || string_49_.equals("1.2") || string_49_.startsWith("1.2.") || string_49_.equals("1.3") || string_49_.startsWith("1.3.") || string_49_.equals("1.4") || string_49_.startsWith("1.4.") || string_49_.equals("1.5") || string_49_.startsWith("1.5.") || string_49_.equals("1.6.0")) {
					method6121("wrongjava", 397282541);
					return;
				}
				if (string_49_.startsWith("1.6.0_")) {
					int i;
					for (i = 6; (i < string_49_.length() && Class97.method1318(string_49_.charAt(i), 250358618)); i++) {
						/* empty */
					}
					String string_50_ = string_49_.substring(6, i);
					if (Class710_Sub30.method10184(string_50_, -1506968299) && Class392.method4867(string_50_, 1537960502) < 10) {
						method6121("wrongjava", 755890109);
						return;
					}
				}
			}
		}
		Class300.method4022((byte) 0).setFocusCycleRoot(true);
		anInt6857 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 886517331);
		anInt6864 = Runtime.getRuntime().availableProcessors() * -1652957041;
		method6080((byte) 51);
		method6084(-1137452363);
		aClass504_6883 = Class449.method5423(-1169607858);
		while (aLong6855 * -765353526295598841L == 0L || (Class249.method3450(1985869898) < aLong6855 * -765353526295598841L)) {
			Class243.anInt2458 = (aClass504_6883.method6068(-4013848546647482281L * aLong6886) * 541300575);
			for (int i = 0; i < Class243.anInt2458 * 1057522847; i++)
				method6090((byte) 89);
			method6091((byte) 80);
			Class106.method1430(Class399.aCanvas4127, (byte) 1);
		}
	}

	void method6120() {
		long l = Class249.method3450(1399554251);
		long l_51_ = aLongArray6860[-1147796785 * Class217.anInt2305 - 1 & 0x1f];
		long l_52_ = aLongArray6860[Class217.anInt2305 * -1147796785];
		aLongArray6860[-1147796785 * Class217.anInt2305] = l;
		Class217.anInt2305 = (1 + -1147796785 * Class217.anInt2305 & 0x1f) * -981351377;
		if (0L != l_52_ && l > l_52_) {
			int i = (int) (l - l_52_);
			anInt6884 = 951262637 * (int) (l - l_51_);
			anInt6856 = -20875515 * (((i >> 1) + 32000) / i);
		}
		if ((anInt6874 += 2042358681) * 598227113 - 1 > 50) {
			anInt6874 -= -961281054;
			aBool6889 = true;
			Class399.aCanvas4127.setSize(Class144.anInt1679 * -1804846931, 589116499 * Class34_Sub6.anInt10965);
			Class399.aCanvas4127.setVisible(true);
			if (Class145.aFrame1692 != null && null == Class223.aFrame2336) {
				Insets insets = Class145.aFrame1692.getInsets();
				Class399.aCanvas4127.setLocation((insets.left + 1509041125 * anInt6887), (insets.top + -1413419225 * anInt6863));
			} else
				Class399.aCanvas4127.setLocation(anInt6887 * 1509041125, anInt6863 * -1413419225);
		}
		method6109((byte) -68);
	}

	void method6121(String string, int i) {
		if (!aBool6862) {
			aBool6862 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class25.method729(Class622.anApplet8126, "loggedout", -18452948);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class622.anApplet8126.getAppletContext().showDocument(new URL(Class622.anApplet8126.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public void method398() {
		if (!aBool6885)
			aLong6855 = ((Class249.method3450(1658750289) + 4000L) * 9209616068252677303L);
	}

	public final void focusLost(FocusEvent focusevent) {
		aBool6870 = false;
	}

	public void method396() {
		if (!aBool6885) {
			aLong6855 = Class249.method3450(1396263374) * 9209616068252677303L;
			Class212.method3067(5000L);
			method6093(false, (byte) -1);
		}
	}

	public void method399() {
		if (!aBool6885) {
			aLong6855 = Class249.method3450(1679747579) * 9209616068252677303L;
			Class212.method3067(5000L);
			method6093(false, (byte) -1);
		}
	}

	public final void method403(Graphics graphics) {
		paint(graphics);
	}

	public final void method401(Graphics graphics) {
		paint(graphics);
	}

	public final synchronized void method407(Graphics graphics) {
		if (!aBool6885) {
			aBool6889 = true;
			if ((Class249.method3450(1482687919) - aLong6868 * 2938380846569871171L) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= Class500.anInt6841 * 569699291 && rectangle.height >= Class313.anInt3499 * 160996593))
					aBool6865 = true;
			}
		}
	}

	void method6122() {
		if (InputStream_Sub1.aString10980 != null) {
			String string = InputStream_Sub1.aString10980.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_53_ = Class31.aString276;
				if (string_53_.equals("1.1") || string_53_.startsWith("1.1.") || string_53_.equals("1.2") || string_53_.startsWith("1.2.") || string_53_.equals("1.3") || string_53_.startsWith("1.3.") || string_53_.equals("1.4") || string_53_.startsWith("1.4.") || string_53_.equals("1.5") || string_53_.startsWith("1.5.") || string_53_.equals("1.6.0")) {
					method6121("wrongjava", -645500938);
					return;
				}
				if (string_53_.startsWith("1.6.0_")) {
					int i;
					for (i = 6; (i < string_53_.length() && Class97.method1318(string_53_.charAt(i), 114239206)); i++) {
						/* empty */
					}
					String string_54_ = string_53_.substring(6, i);
					if (Class710_Sub30.method10184(string_54_, -1506968299) && Class392.method4867(string_54_, -686319877) < 10) {
						method6121("wrongjava", 1943193001);
						return;
					}
				}
			}
		}
		Class300.method4022((byte) 0).setFocusCycleRoot(true);
		anInt6857 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 886517331);
		anInt6864 = Runtime.getRuntime().availableProcessors() * -1652957041;
		method6080((byte) -4);
		method6084(2125058834);
		aClass504_6883 = Class449.method5423(-1118276029);
		while (aLong6855 * -765353526295598841L == 0L || (Class249.method3450(1987828589) < aLong6855 * -765353526295598841L)) {
			Class243.anInt2458 = (aClass504_6883.method6068(-4013848546647482281L * aLong6886) * 541300575);
			for (int i = 0; i < Class243.anInt2458 * 1057522847; i++)
				method6090((byte) 37);
			method6091((byte) 55);
			Class106.method1430(Class399.aCanvas4127, (byte) 1);
		}
	}

	public final void method404(Graphics graphics) {
		paint(graphics);
	}

	public final void method405(Graphics graphics) {
		paint(graphics);
	}

	public final synchronized void method406(Graphics graphics) {
		if (!aBool6885) {
			aBool6889 = true;
			if ((Class249.method3450(1386695278) - aLong6868 * 2938380846569871171L) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= Class500.anInt6841 * 569699291 && rectangle.height >= Class313.anInt3499 * 160996593))
					aBool6865 = true;
			}
		}
	}

	public final void method402(Graphics graphics) {
		paint(graphics);
	}

	public final void method6123(FocusEvent focusevent) {
		aBool6870 = true;
		aBool6889 = true;
	}

	void method6124(Class512 class512, boolean bool, byte i) {
		if (null == class512)
			throw new NullPointerException();
		if (Class512.aClass512_6932 != class512 && Class512.aClass512_6934 != class512)
			throw new IllegalStateException();
		aClass512_6888 = class512;
		if (aClass512_6888 != Class512.aClass512_6934) {
			if (bool)
				aClass512_6888 = Class512.aClass512_6933;
		}
	}

	public void method6125() {
		do {
			try {
				try {
					method6126((byte) -48);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class81.method1165(method6092(825757204), throwable, (byte) -62);
					method6121("crash", -646961839);
					method6093(true, (byte) -1);
					break;
				}
				method6093(true, (byte) -1);
			} catch (Exception object) {
				method6093(true, (byte) -1);
				throw object;
			}
		} while (false);
	}

	public void method400() {
		if (!aBool6885) {
			aLong6855 = Class249.method3450(2141298625) * 9209616068252677303L;
			Class212.method3067(5000L);
			method6093(false, (byte) -1);
		}
	}

	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	public void stop() {
		if (!aBool6885)
			aLong6855 = ((Class249.method3450(1920220640) + 4000L) * 9209616068252677303L);
	}

	void method6126(byte i) {
		if (InputStream_Sub1.aString10980 != null) {
			String string = InputStream_Sub1.aString10980.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_55_ = Class31.aString276;
				if (string_55_.equals("1.1") || string_55_.startsWith("1.1.") || string_55_.equals("1.2") || string_55_.startsWith("1.2.") || string_55_.equals("1.3") || string_55_.startsWith("1.3.") || string_55_.equals("1.4") || string_55_.startsWith("1.4.") || string_55_.equals("1.5") || string_55_.startsWith("1.5.") || string_55_.equals("1.6.0")) {
					method6121("wrongjava", -1144163138);
					return;
				}
				if (string_55_.startsWith("1.6.0_")) {
					int i_56_;
					for (i_56_ = 6; (i_56_ < string_55_.length() && Class97.method1318(string_55_.charAt(i_56_), -1574319073)); i_56_++) {
						/* empty */
					}
					String string_57_ = string_55_.substring(6, i_56_);
					if (Class710_Sub30.method10184(string_57_, -1506968299) && Class392.method4867(string_57_, 1354546930) < 10) {
						method6121("wrongjava", -1547773695);
						return;
					}
				}
			}
		}
		Class300.method4022((byte) 0).setFocusCycleRoot(true);
		anInt6857 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 886517331);
		anInt6864 = Runtime.getRuntime().availableProcessors() * -1652957041;
		method6080((byte) -55);
		method6084(1778811660);
		aClass504_6883 = Class449.method5423(-1656083384);
		while (aLong6855 * -765353526295598841L == 0L || (Class249.method3450(1991159351) < aLong6855 * -765353526295598841L)) {
			Class243.anInt2458 = (aClass504_6883.method6068(-4013848546647482281L * aLong6886) * 541300575);
			for (int i_58_ = 0; i_58_ < Class243.anInt2458 * 1057522847; i_58_++)
				method6090((byte) -37);
			method6091((byte) 109);
			Class106.method1430(Class399.aCanvas4127, (byte) 1);
		}
	}

	public abstract void method397();

	public abstract void method410();

	synchronized void method6127(String string, byte i) {
		Class145.aFrame1692 = new Frame();
		Class145.aFrame1692.setTitle(string);
		Class145.aFrame1692.setResizable(true);
		Class145.aFrame1692.addWindowListener(this);
		Class145.aFrame1692.setBackground(Color.black);
		Class145.aFrame1692.setVisible(true);
		Class145.aFrame1692.toFront();
		Insets insets = Class145.aFrame1692.getInsets();
		Class145.aFrame1692.setSize(insets.right + (Class500.anInt6841 * 569699291 + insets.left), insets.bottom + (160996593 * Class313.anInt3499 + insets.top));
	}

	abstract void method6128();

	abstract void method6129();

	public static final void method6130() {
		Class655.anImage8495 = null;
		Class41_Sub1.aFont10561 = null;
	}

	void method6131() {
		long l = Class249.method3450(1572587163);
		long l_59_ = aLongArray6861[Class477.anInt5382 * 549721781];
		aLongArray6861[Class477.anInt5382 * 549721781] = l;
		Class477.anInt5382 = (Class477.anInt5382 * 549721781 + 1 & 0x1f) * 1610000285;
		if (0L != l_59_ && l <= l_59_) {
			/* empty */
		}
		synchronized (this) {
			Class67_Sub1.aBool10601 = aBool6870;
		}
		method6096((byte) -65);
	}

	public abstract void method408();

	public static final void method6132() {
		Class655.anImage8495 = null;
		Class41_Sub1.aFont10561 = null;
	}

	public void method6133(byte i) throws Exception_Sub6 {
		if (!aBool6858) {
			Class114.method1481((byte) 57).method391("jaclib", 485887217);
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class241.aString2456.startsWith("win"))
					throw new Exception_Sub6(128, "jaclib");
			}
			aBool6858 = true;
		}
	}

	abstract void method6134();

	void method6135() {
		if (null != Class399.aCanvas4127) {
			Class399.aCanvas4127.removeFocusListener(this);
			Class399.aCanvas4127.getParent().setBackground(Color.black);
			Class399.aCanvas4127.getParent().remove(Class399.aCanvas4127);
		}
	}

	static int method6136(int i, byte i_60_) {
		if (9 == i || i == 10)
			return 1;
		if (11 == i)
			return 8;
		return i;
	}

	static final void method6137(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub33_10762.method10197(-141560769);
	}
}
