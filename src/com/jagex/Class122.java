/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.memory.Buffer;

public class Class122 {
	Buffer aBuffer1482;
	Class167_Sub2 aClass167_Sub2_1483;

	Class122(Class167_Sub2 class167_sub2, Buffer buffer) {
		aClass167_Sub2_1483 = class167_sub2;
		aBuffer1482 = buffer;
	}

	void method1603(byte[] is, int i) {
		if (aBuffer1482 == null || aBuffer1482.method1() < i)
			aBuffer1482 = aClass167_Sub2_1483.aNativeHeap9180.method1440(i, false);
		aBuffer1482.method3(is, 0, 0, i);
	}

	void method1604(byte[] is, int i) {
		if (aBuffer1482 == null || aBuffer1482.method1() < i)
			aBuffer1482 = aClass167_Sub2_1483.aNativeHeap9180.method1440(i, false);
		aBuffer1482.method3(is, 0, 0, i);
	}

	Class122(Class167_Sub2 class167_sub2, byte[] is, int i) {
		aClass167_Sub2_1483 = class167_sub2;
		aBuffer1482 = aClass167_Sub2_1483.aNativeHeap9180.method1440(i, false);
		if (is != null)
			aBuffer1482.method3(is, 0, 0, i);
	}
}
