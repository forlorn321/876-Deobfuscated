/* Class608_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class608_Sub1 extends Class608 implements Interface6 {
	JS5ResourceProvider aClass461_10553;

	boolean method7241(int i, byte i_0_) {
		synchronized (aClass461_10553) {
			boolean bool = aClass461_10553.method5558(i, 0, 1158858346);
			return bool;
		}
	}

	boolean method7245(int i) {
		synchronized (aClass461_10553) {
			boolean bool = aClass461_10553.method5558(i, 0, -1464659536);
			return bool;
		}
	}

	public Class method51(int i) {
		return com.jagex.ObjTypeDecoder.class;
	}

	byte[] method7255(int i, int i_1_) {
		synchronized (aClass461_10553) {
			byte[] is = aClass461_10553.method5556(i, 0, (byte) 1);
			return is;
		}
	}

	public ConfigType method55(int i, Interface12 interface12, int i_2_) {
		return new ObjTypeDecoder(i, this, interface12);
	}

	public ConfigType method53(int i, Interface12 interface12) {
		return new ObjTypeDecoder(i, this, interface12);
	}

	public ConfigType method54(int i, Interface12 interface12) {
		return new ObjTypeDecoder(i, this, interface12);
	}

	public Class method52() {
		return com.jagex.ObjTypeDecoder.class;
	}

	byte[] method7242(int i) {
		synchronized (aClass461_10553) {
			byte[] is = aClass461_10553.method5556(i, 0, (byte) 1);
			return is;
		}
	}

	boolean method7243(int i) {
		synchronized (aClass461_10553) {
			boolean bool = aClass461_10553.method5558(i, 0, 824273709);
			return bool;
		}
	}

	boolean method7240(int i) {
		synchronized (aClass461_10553) {
			boolean bool = aClass461_10553.method5558(i, 0, 1207530664);
			return bool;
		}
	}

	Class608_Sub1(boolean bool, JS5ResourceProvider class461, Language class664, GameMode class670) {
		super(bool, class664, class670);
		aClass461_10553 = class461;
	}

	boolean method7246(int i) {
		synchronized (aClass461_10553) {
			boolean bool = aClass461_10553.method5558(i, 0, 1325611083);
			return bool;
		}
	}
}
