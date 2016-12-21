/* Class530 - Decompiled by JODE
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

public class Class530 implements Interface60 {
	String aString7110;
	Class461 aClass461_7111;
	Hashtable aHashtable7112 = new Hashtable();
	Hashtable aHashtable7113 = new Hashtable();

	public int method6437(String string, byte i) throws Exception_Sub1 {
		if (aHashtable7112.containsKey(string))
			return 100;
		String string_0_ = Class272.method3719(string, -886634563);
		if (string_0_ == null)
			throw new Exception_Sub1(1, string);
		String string_1_ = null;
		if (null == string_1_) {
			string_1_ = new StringBuilder().append(aString7110).append(string_0_).toString();
			if (null == aClass461_7111 || !aClass461_7111.method5574(string_1_, "", -1511373119))
				throw new Exception_Sub1(2, string);
		}
		if (!aClass461_7111.method5577(string_1_, -1194638794))
			return aClass461_7111.method5567(string_1_, 1453260262);
		byte[] is = aClass461_7111.method5609(string_1_, "", -6855510);
		if (null == is)
			throw new Exception_Sub1(3, string);
		Object object = null;
		File file;
		try {
			file = Class674.method8031(string_0_, 114563965);
		} catch (RuntimeException runtimeexception) {
			throw new Exception_Sub1(4, string, runtimeexception);
		}
		if (null == file)
			throw new Exception_Sub1(5, string);
		boolean bool = true;
		byte[] is_2_ = Class335.method4374(file, (byte) -61);
		if (null != is_2_ && is.length == is_2_.length) {
			for (int i_3_ = 0; i_3_ < is_2_.length; i_3_++) {
				if (is_2_[i_3_] != is[i_3_]) {
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
				throw new Exception_Sub1(6, string, throwable);
			}
		}
		method6438(string, file, (byte) 118);
		return 100;
	}

	void method6438(String string, File file, byte i) {
		aHashtable7112.put(string, file);
	}

	public boolean method386(String string, int i) {
		return aHashtable7112.containsKey(string);
	}

	public void method391(String string, int i) throws Exception_Sub6 {
		method6439(string, com.jagex.Class532.class, 1117759125);
	}

	public Class530(Class461 class461) {
		aClass461_7111 = class461;
		String string = "";
		if (Class497.aString5550.startsWith("win") || Class497.aString5550.startsWith("windows 7"))
			string = new StringBuilder().append(string).append("windows/").toString();
		else if (Class497.aString5550.startsWith("linux"))
			string = new StringBuilder().append(string).append("linux/").toString();
		else if (Class497.aString5550.startsWith("mac"))
			string = new StringBuilder().append(string).append("macos/").toString();
		if (Class497.aString5551.startsWith("amd64") || Class497.aString5551.startsWith("x86_64"))
			string = new StringBuilder().append(string).append("x86_64/").toString();
		else if (Class497.aString5551.startsWith("i386") || Class497.aString5551.startsWith("i486") || Class497.aString5551.startsWith("i586") || Class497.aString5551.startsWith("x86"))
			string = new StringBuilder().append(string).append("x86/").toString();
		else if (Class497.aString5551.startsWith("ppc"))
			string = new StringBuilder().append(string).append("ppc/").toString();
		else
			string = new StringBuilder().append(string).append("universal/").toString();
		aString7110 = string;
	}

	public void method387(String string) throws Exception_Sub6 {
		method6439(string, com.jagex.Class532.class, 1074608353);
	}

	public void method385(String string) throws Exception_Sub6 {
		method6439(string, com.jagex.Class532.class, 1683507879);
	}

	public void method388(String string) throws Exception_Sub6 {
		method6439(string, com.jagex.Class532.class, 2025700028);
	}

	public boolean method209(int i) {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7113.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7113.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_4_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_4_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7113.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7112.get(string);
						Class var_class_5_ = (Class) aHashtable7113.get(string);
						Vector vector = ((Vector) field.get(var_class_5_.getClassLoader()));
						for (int i_6_ = 0; i_6_ < vector.size(); i_6_++) {
							try {
								Object object = vector.elementAt(i_6_);
								Field field_7_ = object.getClass().getDeclaredField("name");
								method.invoke(field_7_, new Object[] { Boolean.TRUE });
								try {
									String string_8_ = (String) field_7_.get(object);
									if (null != string_8_ && (string_8_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_9_ = object.getClass().getDeclaredField("handle");
										Method method_10_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_9_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_10_, (new Object[] { Boolean.TRUE }));
										try {
											method_10_.invoke(object, new Object[0]);
											field_9_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_10_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_9_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_7_, new Object[] { Boolean.FALSE });
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
		aHashtable7113 = hashtable;
		return aHashtable7113.isEmpty();
	}

	public boolean method390(String string) {
		return aHashtable7112.containsKey(string);
	}

	public boolean method392(String string) {
		return aHashtable7112.containsKey(string);
	}

	public void method389(String string) throws Exception_Sub6 {
		method6439(string, com.jagex.Class532.class, 1911687205);
	}

	public boolean method215() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = aHashtable7113.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, aHashtable7113.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_11_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_11_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = aHashtable7113.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = (File) aHashtable7112.get(string);
						Class var_class_12_ = (Class) aHashtable7113.get(string);
						Vector vector = ((Vector) field.get(var_class_12_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_13_ = object.getClass().getDeclaredField("name");
								method.invoke(field_13_, new Object[] { Boolean.TRUE });
								try {
									String string_14_ = (String) field_13_.get(object);
									if (null != string_14_ && (string_14_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_15_ = object.getClass().getDeclaredField("handle");
										Method method_16_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_15_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_16_, (new Object[] { Boolean.TRUE }));
										try {
											method_16_.invoke(object, new Object[0]);
											field_15_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_16_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_15_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_13_, new Object[] { Boolean.FALSE });
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
		aHashtable7113 = hashtable;
		return aHashtable7113.isEmpty();
	}

	void method6439(String string, Class var_class, int i) throws Exception_Sub6 {
		Class var_class_17_ = (Class) aHashtable7113.get(string);
		if (var_class_17_ != null && var_class_17_.getClassLoader() != var_class.getClassLoader())
			throw new Exception_Sub6(1, string);
		File file = null;
		if (null == file)
			file = (File) aHashtable7112.get(string);
		if (null != file) {
			try {
				file = new File(file.getCanonicalPath());
				Class var_class_18_ = Class.forName("java.lang.Runtime");
				Class var_class_19_ = Class.forName("java.lang.reflect.AccessibleObject");
				Method method = var_class_19_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				Method method_20_ = (var_class_18_.getDeclaredMethod("load0", new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") }));
				method.invoke(method_20_, new Object[] { Boolean.TRUE });
				method_20_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
				method.invoke(method_20_, new Object[] { Boolean.FALSE });
				aHashtable7113.put(string, var_class);
			} catch (NoSuchMethodException nosuchmethodexception) {
				System.load(file.getPath());
				aHashtable7113.put(string, com.jagex.Class532.class);
			} catch (Throwable throwable) {
				throw new Exception_Sub6(3, string, throwable);
			}
		} else
			throw new Exception_Sub6(4, string);
	}

	static final void method6440(Class668 class668, int i) {
		int i_21_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.aByteArray3712[i_21_];
	}

	static final void method6441(byte i) {
		Class438.method5301(Class677.aClass167_8609, (short) -9722);
		if (728530343 * client.anInt11264 != -989431627 * Class320.anInt3539)
			Class85.method1188(773966016);
	}
}
