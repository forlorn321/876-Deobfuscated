/* Class539 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class539 implements Interface59 {
	Hashtable aHashtable7229 = new Hashtable();
	String aString7230;
	Class459 aClass459_7231;
	Hashtable aHashtable7232 = new Hashtable();
	public static int anInt7233;

	public void method366(String string) throws Exception_Sub2 {
		method8992(string, com.jagex.Class518.class, -1789870632);
	}

	public boolean method367(String string, int i) {
		return aHashtable7229.containsKey(string);
	}

	void method8991(String string, File file, short i) {
		aHashtable7229.put(string, file);
	}

	public void method369(String string, int i) throws Exception_Sub2 {
		method8992(string, com.jagex.Class518.class, -980446576);
	}

	public boolean method368(byte i) {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7232.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7232.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_0_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_0_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7232.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7229.get(string);
						Class var_class_1_ = (Class) aHashtable7232.get(string);
						Vector vector = ((Vector) field.get(var_class_1_.getClassLoader()));
						for (int i_2_ = 0; i_2_ < vector.size(); i_2_++) {
							try {
								Object object = vector.elementAt(i_2_);
								Field field_3_ = object.getClass().getDeclaredField("name");
								method.invoke(field_3_, new Object[] { Boolean.TRUE });
								try {
									String string_4_ = (String) field_3_.get(object);
									if (string_4_ != null && (string_4_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_5_ = object.getClass().getDeclaredField("handle");
										Method method_6_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_5_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_6_, (new Object[] { Boolean.TRUE }));
										try {
											method_6_.invoke(object, new Object[0]);
											field_5_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_6_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_5_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_3_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		aHashtable7232 = hashtable;
		return aHashtable7232.isEmpty();
	}

	void method8992(String string, Class var_class, int i) throws Exception_Sub2 {
		Class var_class_7_ = (Class) aHashtable7232.get(string);
		if (var_class_7_ != null && var_class_7_.getClassLoader() != var_class.getClassLoader())
			throw new Exception_Sub2(1, string);
		File file = null;
		if (file == null)
			file = (File) aHashtable7229.get(string);
		if (file != null) {
			try {
				file = new File(file.getCanonicalPath());
				Class var_class_8_ = Class.forName("java.lang.Runtime");
				Class var_class_9_ = Class.forName("java.lang.reflect.AccessibleObject");
				Method method = var_class_9_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				Method method_10_ = (var_class_8_.getDeclaredMethod("load0", new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") }));
				method.invoke(method_10_, new Object[] { Boolean.TRUE });
				method_10_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
				method.invoke(method_10_, new Object[] { Boolean.FALSE });
				aHashtable7232.put(string, var_class);
			} catch (NoSuchMethodException nosuchmethodexception) {
				System.load(file.getPath());
				aHashtable7232.put(string, com.jagex.Class518.class);
			} catch (Throwable throwable) {
				throw new Exception_Sub2(3, string, throwable);
			}
		} else
			throw new Exception_Sub2(4, string);
	}

	public int method8993(String string, byte i) throws Exception_Sub4 {
		if (aHashtable7229.containsKey(string))
			return 100;
		String string_11_ = Class461.method7601(string, -1030926182);
		if (null == string_11_)
			throw new Exception_Sub4(1, string);
		String string_12_ = null;
		if (string_12_ == null) {
			string_12_ = new StringBuilder().append(aString7230).append(string_11_).toString();
			if (null == aClass459_7231 || !aClass459_7231.method7496(string_12_, "", 87074612))
				throw new Exception_Sub4(2, string);
		}
		if (!aClass459_7231.method7485(string_12_, 1789858470))
			return aClass459_7231.method7501(string_12_, -424734829);
		byte[] is = aClass459_7231.method7497(string_12_, "", (byte) -1);
		if (is == null)
			throw new Exception_Sub4(3, string);
		Object object = null;
		File file;
		try {
			file = Class558.method9444(string_11_, 2098576845);
		} catch (RuntimeException runtimeexception) {
			throw new Exception_Sub4(4, string, runtimeexception);
		}
		if (file == null)
			throw new Exception_Sub4(5, string);
		boolean bool = true;
		byte[] is_13_ = Class389.method6464(file, 1987411895);
		if (null != is_13_ && is_13_.length == is.length) {
			for (int i_14_ = 0; i_14_ < is_13_.length; i_14_++) {
				if (is[i_14_] != is_13_[i_14_]) {
					bool = false;
					break;
				}
			}
		} else
			bool = false;
		if (!bool) {
			try {
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				fileoutputstream.write(is, 0, is.length);
				fileoutputstream.close();
			} catch (Throwable throwable) {
				throw new Exception_Sub4(6, string, throwable);
			}
		}
		method8991(string, file, (short) 154);
		return 100;
	}

	public void method370(String string) throws Exception_Sub2 {
		method8992(string, com.jagex.Class518.class, -1799128149);
	}

	public Class539(Class459 class459) {
		aClass459_7231 = class459;
		String string = "";
		if (Class498.aString5584.startsWith("win") || Class498.aString5584.startsWith("windows 7"))
			string = new StringBuilder().append(string).append("windows/").toString();
		else if (Class498.aString5584.startsWith("linux"))
			string = new StringBuilder().append(string).append("linux/").toString();
		else if (Class498.aString5584.startsWith("mac"))
			string = new StringBuilder().append(string).append("macos/").toString();
		if (Class498.aString5583.startsWith("amd64") || Class498.aString5583.startsWith("x86_64"))
			string = new StringBuilder().append(string).append("x86_64/").toString();
		else if (Class498.aString5583.startsWith("i386") || Class498.aString5583.startsWith("i486") || Class498.aString5583.startsWith("i586") || Class498.aString5583.startsWith("x86"))
			string = new StringBuilder().append(string).append("x86/").toString();
		else if (Class498.aString5583.startsWith("ppc"))
			string = new StringBuilder().append(string).append("ppc/").toString();
		else
			string = new StringBuilder().append(string).append("universal/").toString();
		aString7230 = string;
	}

	public boolean method371(String string) {
		return aHashtable7229.containsKey(string);
	}

	public boolean method372(String string) {
		return aHashtable7229.containsKey(string);
	}

	public boolean method373() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7232.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7232.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_15_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_15_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7232.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7229.get(string);
						Class var_class_16_ = (Class) aHashtable7232.get(string);
						Vector vector = ((Vector) field.get(var_class_16_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_17_ = object.getClass().getDeclaredField("name");
								method.invoke(field_17_, new Object[] { Boolean.TRUE });
								try {
									String string_18_ = (String) field_17_.get(object);
									if (string_18_ != null && (string_18_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_19_ = object.getClass().getDeclaredField("handle");
										Method method_20_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_19_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_20_, (new Object[] { Boolean.TRUE }));
										try {
											method_20_.invoke(object, new Object[0]);
											field_19_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_20_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_19_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_17_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		aHashtable7232 = hashtable;
		return aHashtable7232.isEmpty();
	}

	public boolean method351() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7232.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7232.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_21_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_21_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7232.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7229.get(string);
						Class var_class_22_ = (Class) aHashtable7232.get(string);
						Vector vector = ((Vector) field.get(var_class_22_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_23_ = object.getClass().getDeclaredField("name");
								method.invoke(field_23_, new Object[] { Boolean.TRUE });
								try {
									String string_24_ = (String) field_23_.get(object);
									if (string_24_ != null && (string_24_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_25_ = object.getClass().getDeclaredField("handle");
										Method method_26_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_25_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_26_, (new Object[] { Boolean.TRUE }));
										try {
											method_26_.invoke(object, new Object[0]);
											field_25_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_26_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_25_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_23_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		aHashtable7232 = hashtable;
		return aHashtable7232.isEmpty();
	}

	public boolean method350() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7232.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7232.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_27_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_27_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7232.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7229.get(string);
						Class var_class_28_ = (Class) aHashtable7232.get(string);
						Vector vector = ((Vector) field.get(var_class_28_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_29_ = object.getClass().getDeclaredField("name");
								method.invoke(field_29_, new Object[] { Boolean.TRUE });
								try {
									String string_30_ = (String) field_29_.get(object);
									if (string_30_ != null && (string_30_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_31_ = object.getClass().getDeclaredField("handle");
										Method method_32_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_31_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_32_, (new Object[] { Boolean.TRUE }));
										try {
											method_32_.invoke(object, new Object[0]);
											field_31_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_32_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_31_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_29_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		aHashtable7232 = hashtable;
		return aHashtable7232.isEmpty();
	}

	public boolean method349() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7232.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7232.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_33_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_33_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7232.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7229.get(string);
						Class var_class_34_ = (Class) aHashtable7232.get(string);
						Vector vector = ((Vector) field.get(var_class_34_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_35_ = object.getClass().getDeclaredField("name");
								method.invoke(field_35_, new Object[] { Boolean.TRUE });
								try {
									String string_36_ = (String) field_35_.get(object);
									if (string_36_ != null && (string_36_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_37_ = object.getClass().getDeclaredField("handle");
										Method method_38_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_37_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_38_, (new Object[] { Boolean.TRUE }));
										try {
											method_38_.invoke(object, new Object[0]);
											field_37_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_38_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_37_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_35_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		aHashtable7232 = hashtable;
		return aHashtable7232.isEmpty();
	}

	static String method8994(String string) {
		if (Class498.aString5584.startsWith("win"))
			return new StringBuilder().append(string).append(".dll").toString();
		if (Class498.aString5584.startsWith("linux"))
			return new StringBuilder().append("lib").append(string).append(".so").toString();
		if (Class498.aString5584.startsWith("mac"))
			return new StringBuilder().append("lib").append(string).append(".dylib").toString();
		return null;
	}

	void method8995(String string, File file) {
		aHashtable7229.put(string, file);
	}

	void method8996(String string, Class var_class) throws Exception_Sub2 {
		Class var_class_39_ = (Class) aHashtable7232.get(string);
		if (var_class_39_ != null && var_class_39_.getClassLoader() != var_class.getClassLoader())
			throw new Exception_Sub2(1, string);
		File file = null;
		if (file == null)
			file = (File) aHashtable7229.get(string);
		if (file != null) {
			try {
				file = new File(file.getCanonicalPath());
				Class var_class_40_ = Class.forName("java.lang.Runtime");
				Class var_class_41_ = Class.forName("java.lang.reflect.AccessibleObject");
				Method method = var_class_41_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				Method method_42_ = (var_class_40_.getDeclaredMethod("load0", new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") }));
				method.invoke(method_42_, new Object[] { Boolean.TRUE });
				method_42_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
				method.invoke(method_42_, new Object[] { Boolean.FALSE });
				aHashtable7232.put(string, var_class);
			} catch (NoSuchMethodException nosuchmethodexception) {
				System.load(file.getPath());
				aHashtable7232.put(string, com.jagex.Class518.class);
			} catch (Throwable throwable) {
				throw new Exception_Sub2(3, string, throwable);
			}
		} else
			throw new Exception_Sub2(4, string);
	}

	static final void method8997(Class243 class243, Class240 class240, Class665 class665, byte i) {
		class243.anInt2530 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -1441961983;
		Class430.method6876(class243, (byte) 41);
	}

	static final void method8998(Class665 class665, byte i) {
		int i_43_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_43_, 675114060);
		Class240 class240 = Class183.aClass240Array2100[i_43_ >> 16];
		Class394.method6503(class243, class240, class665, -440596497);
	}

	public static byte[] method8999(CharSequence charsequence, short i) {
		int i_44_ = charsequence.length();
		byte[] is = new byte[i_44_];
		for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
			char c = charsequence.charAt(i_45_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_45_] = (byte) c;
			else if (c == '\u20ac')
				is[i_45_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_45_] = (byte) -126;
			else if (c == '\u0192')
				is[i_45_] = (byte) -125;
			else if (c == '\u201e')
				is[i_45_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_45_] = (byte) -123;
			else if ('\u2020' == c)
				is[i_45_] = (byte) -122;
			else if (c == '\u2021')
				is[i_45_] = (byte) -121;
			else if (c == '\u02c6')
				is[i_45_] = (byte) -120;
			else if (c == '\u2030')
				is[i_45_] = (byte) -119;
			else if (c == '\u0160')
				is[i_45_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_45_] = (byte) -117;
			else if (c == '\u0152')
				is[i_45_] = (byte) -116;
			else if (c == '\u017d')
				is[i_45_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_45_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_45_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_45_] = (byte) -109;
			else if (c == '\u201d')
				is[i_45_] = (byte) -108;
			else if (c == '\u2022')
				is[i_45_] = (byte) -107;
			else if ('\u2013' == c)
				is[i_45_] = (byte) -106;
			else if (c == '\u2014')
				is[i_45_] = (byte) -105;
			else if ('\u02dc' == c)
				is[i_45_] = (byte) -104;
			else if (c == '\u2122')
				is[i_45_] = (byte) -103;
			else if ('\u0161' == c)
				is[i_45_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_45_] = (byte) -101;
			else if (c == '\u0153')
				is[i_45_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_45_] = (byte) -98;
			else if (c == '\u0178')
				is[i_45_] = (byte) -97;
			else
				is[i_45_] = (byte) 63;
		}
		return is;
	}

	public static String method9000(byte[] is, int i, int i_46_, int i_47_) {
		char[] cs = new char[i_46_];
		int i_48_ = 0;
		for (int i_49_ = 0; i_49_ < i_46_; i_49_++) {
			int i_50_ = is[i_49_ + i] & 0xff;
			if (0 != i_50_) {
				if (i_50_ >= 128 && i_50_ < 160) {
					int i_51_ = Class662.aCharArray8515[i_50_ - 128];
					if (i_51_ == 0)
						i_51_ = 63;
					i_50_ = i_51_;
				}
				cs[i_48_++] = (char) i_50_;
			}
		}
		return new String(cs, 0, i_48_);
	}

	static final void method9001(byte i) {
		for (Class527_Sub8_Sub5 class527_sub8_sub5 = ((Class527_Sub8_Sub5) client.aClass694_11290.method14081((short) 3509)); null != class527_sub8_sub5; class527_sub8_sub5 = ((Class527_Sub8_Sub5) client.aClass694_11290.method14086(-65534))) {
			Class640_Sub1_Sub2_Sub5 class640_sub1_sub2_sub5 = class527_sub8_sub5.aClass640_Sub1_Sub2_Sub5_11638;
			if (client.anInt11019 > class640_sub1_sub2_sub5.anInt12141 * -179474811) {
				class527_sub8_sub5.method8735(-1889161967);
				class640_sub1_sub2_sub5.method18818(-252305607);
			} else if (client.anInt11019 >= class640_sub1_sub2_sub5.anInt12140 * -2143165409) {
				class640_sub1_sub2_sub5.method18813(1710133738);
				if (class640_sub1_sub2_sub5.anInt12151 * -596817661 > 0) {
					if (-1481292237 * client.anInt11080 == 4) {
						Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1 = Class466.aClass196Array5314[(-596817661 * class640_sub1_sub2_sub5.anInt12151) - 1].method3717(2033212831);
						if (null != class640_sub1_sub2_sub1) {
							Class442 class442 = (class640_sub1_sub2_sub1.method10637().aClass442_4927);
							if ((int) class442.aFloat4918 >= 0 && ((int) class442.aFloat4918 < client.aClass509_11072.method8284((byte) 67) * 512) && (int) class442.aFloat4919 >= 0 && ((int) class442.aFloat4919 < client.aClass509_11072.method8285(497187031) * 512))
								class640_sub1_sub2_sub5.method18812((int) class442.aFloat4918, (int) class442.aFloat4919, ((Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, class640_sub1_sub2_sub1.aByte10864, (byte) 5)) - (class640_sub1_sub2_sub5.anInt12139 * 26441149)), client.anInt11019, (byte) 92);
						}
					} else {
						Class527_Sub26 class527_sub26 = ((Class527_Sub26) (client.aClass14_10989.method709((long) ((class640_sub1_sub2_sub5.anInt12151 * -596817661) - 1))));
						if (class527_sub26 != null) {
							Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
							Class442 class442 = (class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
							if ((int) class442.aFloat4918 >= 0 && ((int) class442.aFloat4918 < client.aClass509_11072.method8284((byte) 67) * 512) && (int) class442.aFloat4919 >= 0 && ((int) class442.aFloat4919 < client.aClass509_11072.method8285(1514504123) * 512))
								class640_sub1_sub2_sub5.method18812((int) class442.aFloat4918, (int) class442.aFloat4919, ((Class590.method9853((int) class442.aFloat4918, (int) class442.aFloat4919, class640_sub1_sub2_sub5.aByte10864, (byte) 5)) - (class640_sub1_sub2_sub5.anInt12139 * 26441149)), client.anInt11019, (byte) 49);
						}
					}
				}
				if (-596817661 * class640_sub1_sub2_sub5.anInt12151 < 0) {
					int i_52_ = (-(-596817661 * class640_sub1_sub2_sub5.anInt12151) - 1);
					Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2;
					if (client.anInt11070 * -899375681 == i_52_)
						class640_sub1_sub2_sub1_sub2 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937;
					else
						class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_52_]);
					if (null != class640_sub1_sub2_sub1_sub2) {
						Class442 class442 = (class640_sub1_sub2_sub1_sub2.method10637().aClass442_4927);
						if ((int) class442.aFloat4918 >= 0 && ((int) class442.aFloat4918 < (client.aClass509_11072.method8284((byte) 81) * 512)) && (int) class442.aFloat4919 >= 0 && ((int) class442.aFloat4919 < client.aClass509_11072.method8285(-1321013056) * 512))
							class640_sub1_sub2_sub5.method18812((int) class442.aFloat4918, (int) class442.aFloat4919, (Class590.method9853((int) (class442.aFloat4918), (int) (class442.aFloat4919), (class640_sub1_sub2_sub5.aByte10864), (byte) 5) - (class640_sub1_sub2_sub5.anInt12139 * 26441149)), client.anInt11019, (byte) -32);
					}
				}
				class640_sub1_sub2_sub5.method18814(-2132013331 * client.anInt11108, 1271529395);
				client.aClass509_11072.method8314(608490018).method9269(class640_sub1_sub2_sub5, true, -1980807710);
			}
		}
	}

	static final void method9002(Class665 class665, byte i) {
		if (962135673 * client.anInt11075 >= 2)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = client.anInt11075 * 962135673;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	public static void method9003(int i, int i_53_) {
		if (i < 0 || i > 2)
			i = 0;
		Class628.anInt8201 = 153177349 * i;
		Class628.aClass613Array8192 = (new Class613[1 + Class166.anIntArray1835[367556557 * Class628.anInt8201]]);
		Class628.anInt8193 = 0;
		Class628.anInt8202 = 0;
	}
}
