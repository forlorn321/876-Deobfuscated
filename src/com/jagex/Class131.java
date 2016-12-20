/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Buffer;

public class Class131 {
	Class180_Sub3 aClass180_Sub3_1554;
	Buffer aBuffer1555;

	Class131(Class180_Sub3 class180_sub3, byte[] is, int i) {
		aClass180_Sub3_1554 = class180_sub3;
		aBuffer1555 = aClass180_Sub3_1554.aNativeHeap9667.method1940(i, false);
		if (is != null)
			aBuffer1555.method3(is, 0, 0, i);
	}

	void method2183(byte[] is, int i) {
		if (aBuffer1555 == null || aBuffer1555.method1() < i)
			aBuffer1555 = aClass180_Sub3_1554.aNativeHeap9667.method1940(i, false);
		aBuffer1555.method3(is, 0, 0, i);
	}

	void method2184(byte[] is, int i) {
		if (aBuffer1555 == null || aBuffer1555.method1() < i)
			aBuffer1555 = aClass180_Sub3_1554.aNativeHeap9667.method1940(i, false);
		aBuffer1555.method3(is, 0, 0, i);
	}

	Class131(Class180_Sub3 class180_sub3, Buffer buffer) {
		aClass180_Sub3_1554 = class180_sub3;
		aBuffer1555 = buffer;
	}
}
