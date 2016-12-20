/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

class Class153 implements Runnable {
	Class358_Sub2 this$0;
	static Class22 aClass22_1715;
	public static Class24_Sub14 aClass24_Sub14_1716;

	Class153(Class358_Sub2 class358_sub2) {
		this$0 = class358_sub2;
	}

	public void run() {
		try {
			while (!this$0.aBool10287) {
				HashMap hashmap = this$0.method15932(-2078215399);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8032((byte) 0);
					}
				}
				Class518.method8635(50L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
		}
	}

	public void method2521() {
		try {
			while (!this$0.aBool10287) {
				HashMap hashmap = this$0.method15932(-1861829114);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8032((byte) 0);
					}
				}
				Class518.method8635(50L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
		}
	}

	public void method2522() {
		try {
			while (!this$0.aBool10287) {
				HashMap hashmap = this$0.method15932(-1831328810);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8032((byte) 0);
					}
				}
				Class518.method8635(50L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
		}
	}

	public static void method2523(Class459 class459, Class181 class181, Interface24 interface24, int i) {
		Class269.aClass459_3121 = class459;
		Class25.aClass181_237 = class181;
		Class511.anInterface24_6980 = interface24;
	}

	static final void method2524(Class243 class243, Class240 class240, Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (Class243.anInt2676 * 1866237161 == i_0_ || Class243.anInt2473 * 200616817 == i_0_ || -1281262299 * Class243.anInt2474 == i_0_ || 633613451 * Class243.anInt2475 == i_0_)
			class243.anInt2604 = 1170849881 * i_0_;
	}

	static final void method2525(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = ((null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) && (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183.aBool8278)) ? 1 : 0;
	}

	static final void method2526(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class272.method5084((byte) 50).method87();
	}

	static final void method2527(Class665 class665, byte i) {
		class665.anInt8528 -= 1299028551;
		String string = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261]);
		String string_1_ = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261 + 1]);
		String string_2_ = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261 + 2]);
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) == 1);
		Class532.method8929(string, string_1_, string_2_, bool, -1873945662);
	}

	static final void method2528(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1;
	}

	public static void method2529(int i) {
		synchronized (Class558.aStack7531) {
			Class558.aStack7531 = new Stack();
		}
	}
}
