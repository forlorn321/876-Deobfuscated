/* Class503 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.LinkedList;

public class Class503 implements Runnable {
	Class515 aClass515_6852;
	LinkedList aLinkedList6853;
	volatile boolean aBool6854 = false;

	public void method6043(Class510 class510, byte i) {
		synchronized (aLinkedList6853) {
			aLinkedList6853.add(class510);
			aLinkedList6853.notify();
		}
	}

	public boolean method6044(byte i) {
		return aBool6854;
	}

	public Class515 method6045(int i) {
		return aClass515_6852;
	}

	void method6046(Class515 class515, int i) {
		aClass515_6852 = class515;
	}

	public void run() {
		for (;;)
			method6047(2038709878);
	}

	void method6047(int i) {
		Object object = null;
		Class510 class510;
		synchronized (aLinkedList6853) {
			try {
				aLinkedList6853.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class510 = (Class510) aLinkedList6853.pollFirst();
		}
		do {
			try {
				try {
					if (null != class510) {
						aBool6854 = true;
						method6052(class510, 1794947838);
					}
				} catch (Exception exception) {
					aBool6854 = false;
					break;
				}
				aBool6854 = false;
			} catch (Exception object_0_) {
				aBool6854 = false;
				throw object_0_;
			}
		} while (false);
	}

	public void method6048() {
		for (;;)
			method6047(1869919964);
	}

	public Class503() {
		aLinkedList6853 = new LinkedList();
		aClass515_6852 = new Class515(true);
	}

	public void method6049(Class34_Sub17 class34_sub17, int i) {
		aClass515_6852.method6254(class34_sub17, -253285224);
	}

	void method6050() {
		Object object = null;
		Class510 class510;
		synchronized (aLinkedList6853) {
			try {
				aLinkedList6853.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class510 = (Class510) aLinkedList6853.pollFirst();
		}
		do {
			try {
				try {
					if (null != class510) {
						aBool6854 = true;
						method6052(class510, -2128190078);
					}
				} catch (Exception exception) {
					aBool6854 = false;
					break;
				}
				aBool6854 = false;
			} catch (Exception object_1_) {
				aBool6854 = false;
				throw object_1_;
			}
		} while (false);
	}

	void method6051() {
		Object object = null;
		Class510 class510;
		synchronized (aLinkedList6853) {
			try {
				aLinkedList6853.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class510 = (Class510) aLinkedList6853.pollFirst();
		}
		do {
			try {
				try {
					if (null != class510) {
						aBool6854 = true;
						method6052(class510, -1669874571);
					}
				} catch (Exception exception) {
					aBool6854 = false;
					break;
				}
				aBool6854 = false;
			} catch (Exception object_2_) {
				aBool6854 = false;
				throw object_2_;
			}
		} while (false);
	}

	void method6052(Class510 class510, int i) {
		if (class510.aClass498_6925 == Class498.aClass498_5562)
			aClass515_6852.method6319(-1782328596);
		else
			aClass515_6852.method6291(class510, (byte) 21);
		for (boolean bool = aClass515_6852.method6271(2146396960); !bool; bool = aClass515_6852.method6271(1862027753)) {
			/* empty */
		}
		aClass515_6852.method6260((byte) 76);
		client.aClass515_11066.method6260((byte) 46);
	}

	void method6053() {
		Object object = null;
		Class510 class510;
		synchronized (aLinkedList6853) {
			try {
				aLinkedList6853.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class510 = (Class510) aLinkedList6853.pollFirst();
		}
		do {
			try {
				try {
					if (null != class510) {
						aBool6854 = true;
						method6052(class510, 1355424189);
					}
				} catch (Exception exception) {
					aBool6854 = false;
					break;
				}
				aBool6854 = false;
			} catch (Exception object_3_) {
				aBool6854 = false;
				throw object_3_;
			}
		} while (false);
	}

	static final void method6054(Class668 class668, int i) {
		Class251 class251 = Class264.method3678(class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)], -689214737);
		if (class251.aClass251Array2725 == null)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else {
			int i_4_ = class251.aClass251Array2725.length;
			for (int i_5_ = 0; i_5_ < class251.aClass251Array2725.length; i_5_++) {
				if (class251.aClass251Array2725[i_5_] == null) {
					i_4_ = i_5_;
					break;
				}
			}
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_4_;
		}
	}

	static String method6055(int i, int i_6_, boolean bool, int i_7_) {
		if (i_6_ < 2 || i_6_ > 36)
			throw new IllegalArgumentException(new StringBuilder().append("").append(i_6_).toString());
		if (!bool || i < 0)
			return Integer.toString(i, i_6_);
		int i_8_ = 2;
		int i_9_ = i / i_6_;
		while (0 != i_9_) {
			i_9_ /= i_6_;
			i_8_++;
		}
		char[] cs = new char[i_8_];
		cs[0] = '+';
		for (int i_10_ = i_8_ - 1; i_10_ > 0; i_10_--) {
			int i_11_ = i;
			i /= i_6_;
			int i_12_ = i_11_ - i * i_6_;
			if (i_12_ >= 10)
				cs[i_10_] = (char) (i_12_ + 87);
			else
				cs[i_10_] = (char) (i_12_ + 48);
		}
		return new String(cs);
	}

	public static Class699[] method6056(int i) {
		return (new Class699[] { Class699.aClass699_8791, Class699.aClass699_8790, Class699.aClass699_8787, Class699.aClass699_8792, Class699.aClass699_8789, Class699.aClass699_8784, Class699.aClass699_8785, Class699.aClass699_8793, Class699.aClass699_8786 });
	}
}
