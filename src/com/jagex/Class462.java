/* Class462 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Class462 implements Callable {
	Class449 this$0;
	Class536_Sub18_Sub15_Sub3 aClass536_Sub18_Sub15_Sub3_5218;
	URL anURL5219;
	static String aString5220;

	public Object call() throws Exception {
		URLConnection urlconnection = anURL5219.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			this$0.aLong4933 = Class249.method3450(2016692141) * -2082141985377531835L;
			bool = false;
		}
		return new Class473(this$0, bool ? urlconnection.getInputStream() : null, aClass536_Sub18_Sub15_Sub3_5218, anURL5219);
	}

	public Object method5615() throws Exception {
		URLConnection urlconnection = anURL5219.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			this$0.aLong4933 = Class249.method3450(1849474473) * -2082141985377531835L;
			bool = false;
		}
		return new Class473(this$0, bool ? urlconnection.getInputStream() : null, aClass536_Sub18_Sub15_Sub3_5218, anURL5219);
	}

	Class462(Class449 class449, URL url, Class536_Sub18_Sub15_Sub3 class536_sub18_sub15_sub3) {
		this$0 = class449;
		anURL5219 = url;
		aClass536_Sub18_Sub15_Sub3_5218 = class536_sub18_sub15_sub3;
	}

	static final void method5616(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_0_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_1_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class533.method6465(i_0_, i_1_, i_2_, true, (byte) 1);
	}

	static final void method5617(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_3_ | 1 << i_4_;
	}

	static void method5618(Class536_Sub18_Sub6 class536_sub18_sub6, short i) {
		boolean bool = false;
		class536_sub18_sub6.method9521(-528419039);
		for (Class536_Sub18_Sub6 class536_sub18_sub6_5_ = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8248(945309562)); null != class536_sub18_sub6_5_; class536_sub18_sub6_5_ = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8241(-891590587))) {
			if (Class649_Sub1_Sub5_Sub2.method10936(class536_sub18_sub6.method10694((byte) -11), class536_sub18_sub6_5_.method10694((byte) 100), -1681281182)) {
				Class38.method841(class536_sub18_sub6, class536_sub18_sub6_5_, 1416624494);
				bool = true;
				break;
			}
		}
		if (!bool)
			Class70.aClass700_764.method8239(class536_sub18_sub6, (byte) -58);
	}

	static final void method5619(InterfaceDefinitions class251, int i, int i_6_, int i_7_, Class668 class668, int i_8_) {
		if (null == class251.opKeyRates)
			throw new RuntimeException();
		class251.opKeyRates[i] = i_6_;
		class251.anIntArray2722[i] = i_7_;
	}

	static final void method5620(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		class251.anInt2693 = (class668.anIntArray8541[class668.anInt8542 * 1867269829] * -1035323945);
		class251.anInt2576 = (-1090634513 * class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1]);
		Class668.method8011(class251, 263642117);
		Class223.method3202(class234, class251, 1667869333);
		if (0 == 1049444347 * class251.anInt2728)
			Class499.method6023(class234, class251, false, (byte) -52);
	}
}
