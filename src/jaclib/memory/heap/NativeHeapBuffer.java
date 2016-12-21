/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	private int anInt1104;
	public NativeHeap aNativeHeap1105;
	private int anInt1106;
	private boolean aBool1107 = true;

	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
		aNativeHeap1105 = nativeheap;
		anInt1106 = 1328303121 * i;
		anInt1104 = i_0_ * 1517456619;
	}

	private final synchronized boolean method1247() {
		return aNativeHeap1105.method1439() && aBool1107;
	}

	public final long method2() {
		return aNativeHeap1105.getBufferAddress(anInt1106 * -1258674959);
	}

	public final int method1() {
		return -642925629 * anInt1104;
	}

	public final synchronized void method3(byte[] is, int i, int i_1_, int i_2_) {
		if (!method1247() | is == null | i < 0 | i_2_ + i > is.length | i_1_ < 0 | i_2_ + i_1_ > -642925629 * anInt1104)
			throw new RuntimeException();
		aNativeHeap1105.put(anInt1106 * -1258674959, is, i, i_1_, i_2_);
	}

	public final synchronized void method1248() {
		if (method1247())
			aNativeHeap1105.deallocateBuffer(-1258674959 * anInt1106);
		aBool1107 = false;
	}

	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		method1248();
	}

	public final synchronized void method4(byte[] is, int i, int i_3_, int i_4_) {
		if (!method1247() | is == null | i < 0 | i_4_ + i > is.length | i_3_ < 0 | i_4_ + i_3_ > -642925629 * anInt1104)
			throw new RuntimeException();
		aNativeHeap1105.put(anInt1106 * -1258674959, is, i, i_3_, i_4_);
	}

	protected final synchronized void method1249() throws Throwable {
		super.finalize();
		method1248();
	}

	protected final synchronized void method1250() throws Throwable {
		super.finalize();
		method1248();
	}

	public final long method5() {
		return aNativeHeap1105.getBufferAddress(anInt1106 * -1258674959);
	}

	public final long method6() {
		return aNativeHeap1105.getBufferAddress(anInt1106 * -1258674959);
	}

	public final long method7() {
		return aNativeHeap1105.getBufferAddress(anInt1106 * -1258674959);
	}

	public final int method8() {
		return -642925629 * anInt1104;
	}

	public final int method9() {
		return -642925629 * anInt1104;
	}

	public final int method10() {
		return -642925629 * anInt1104;
	}

	private final synchronized boolean method1251() {
		return aNativeHeap1105.method1439() && aBool1107;
	}

	private final synchronized boolean method1252() {
		return aNativeHeap1105.method1439() && aBool1107;
	}

	private final synchronized boolean method1253() {
		return aNativeHeap1105.method1439() && aBool1107;
	}

	private final synchronized boolean method1254() {
		return aNativeHeap1105.method1439() && aBool1107;
	}

	private final synchronized boolean method1255() {
		return aNativeHeap1105.method1439() && aBool1107;
	}

	private final synchronized boolean method1256() {
		return aNativeHeap1105.method1439() && aBool1107;
	}

	public final synchronized void method1257() {
		if (method1247())
			aNativeHeap1105.deallocateBuffer(-1258674959 * anInt1106);
		aBool1107 = false;
	}

	public final synchronized void method1258() {
		if (method1247())
			aNativeHeap1105.deallocateBuffer(-1258674959 * anInt1106);
		aBool1107 = false;
	}

	public final synchronized void method1259() {
		if (method1247())
			aNativeHeap1105.deallocateBuffer(-1258674959 * anInt1106);
		aBool1107 = false;
	}
}
