/* Class98_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class98_Sub1_Sub2 extends Class98_Sub1 implements Interface12 {
	JS5ResourceProvider aClass461_11332;
	Class199 aClass199_11333 = new Class199(64);
	static int anInt11334;
	static int anInt11335;

	Class153_Sub2 method10492(int i, byte i_0_) {
		byte[] is = aClass461_11332.method5556((aClass458_8868.method5498(1026582322).id) * 1716263195, i, (byte) 1);
		Class153_Sub2 class153_sub2 = new Class153_Sub2(aClass458_8868, i);
		if (null != is)
			class153_sub2.decodeType(new RSByteBuffer(is));
		return class153_sub2;
	}

	public ConfigType method70(int i, byte i_1_) {
		Class153_Sub2 class153_sub2;
		synchronized (aClass199_11333) {
			class153_sub2 = (Class153_Sub2) aClass199_11333.method2886((long) i);
			if (class153_sub2 == null) {
				class153_sub2 = method10492(i, (byte) -45);
				aClass199_11333.method2881(class153_sub2, (long) i);
			}
		}
		return class153_sub2;
	}

	public void method10493(byte i) {
		synchronized (aClass199_11333) {
			aClass199_11333.method2884((byte) -115);
		}
	}

	public void method10494() {
		synchronized (aClass199_11333) {
			aClass199_11333.method2892(914616250);
		}
	}

	public void method10495(byte i) {
		synchronized (aClass199_11333) {
			aClass199_11333.method2892(385248243);
		}
	}

	public void method10496() {
		synchronized (aClass199_11333) {
			aClass199_11333.method2892(930848617);
		}
	}

	public int method71(int i) {
		return super.method71(1841045315);
	}

	public void method10497() {
		synchronized (aClass199_11333) {
			aClass199_11333.method2884((byte) -119);
		}
	}

	public int method12() {
		return super.method71(1549258430);
	}

	public Iterator iterator() {
		return new Class620(this);
	}

	public Iterator method10498() {
		return new Class620(this);
	}

	public void method10499(int i, int i_2_) {
		synchronized (aClass199_11333) {
			aClass199_11333.method2883(i, -1953338456);
		}
	}

	public int method73() {
		return super.method71(1859778167);
	}

	public Iterator method10500() {
		return new Class620(this);
	}

	public Class98_Sub1_Sub2(GameMode class670, Class458 class458, Language class664, JS5ResourceProvider class461) {
		super(class670, class458, class664, (class461 != null ? class461.method5566((class458.method5498(466181547).id * 1716263195), 1044361307) : 0));
		aClass461_11332 = class461;
	}

	public void method10501() {
		synchronized (aClass199_11333) {
			aClass199_11333.method2884((byte) -124);
		}
	}

	public void method10502() {
		synchronized (aClass199_11333) {
			aClass199_11333.method2884((byte) -111);
		}
	}

	public void method10503(int i) {
		synchronized (aClass199_11333) {
			aClass199_11333.method2883(i, -1058905367);
		}
	}

	public Iterator method10504() {
		return new Class620(this);
	}

	public ConfigType method72(int i) {
		Class153_Sub2 class153_sub2;
		synchronized (aClass199_11333) {
			class153_sub2 = (Class153_Sub2) aClass199_11333.method2886((long) i);
			if (class153_sub2 == null) {
				class153_sub2 = method10492(i, (byte) -15);
				aClass199_11333.method2881(class153_sub2, (long) i);
			}
		}
		return class153_sub2;
	}

	static final void method10505(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.pauseText = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
	}
}
