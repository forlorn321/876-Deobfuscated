/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	private int anInt1097;
	public NativeHeap aNativeHeap1098;
	private int anInt1099;
	private boolean aBool1100 = true;

	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
		aNativeHeap1098 = nativeheap;
		anInt1099 = i * 1631134303;
		anInt1097 = i_0_ * 1706330647;
	}

	private final synchronized boolean method1678() {
		return aNativeHeap1098.method1939() && aBool1100;
	}

	public final long method2() {
		return aNativeHeap1098.getBufferAddress(-42747489 * anInt1099);
	}

	public final int method1() {
		return anInt1097 * -1082700377;
	}

	public final synchronized void method3(byte[] is, int i, int i_1_, int i_2_) {
		if (!method1678() | is == null | i < 0 | i_2_ + i > is.length | i_1_ < 0 | i_2_ + i_1_ > -1082700377 * anInt1097)
			throw new RuntimeException();
		aNativeHeap1098.put(anInt1099 * -42747489, is, i, i_1_, i_2_);
	}

	public final synchronized void method1679() {
		if (method1678())
			aNativeHeap1098.deallocateBuffer(anInt1099 * -42747489);
		aBool1100 = false;
	}

	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		method1679();
	}

	protected final synchronized void method1680() throws Throwable {
		super.finalize();
		method1679();
	}

	protected final synchronized void method1681() throws Throwable {
		super.finalize();
		method1679();
	}

	protected final synchronized void method1682() throws Throwable {
		super.finalize();
		method1679();
	}

	protected final synchronized void method1683() throws Throwable {
		super.finalize();
		method1679();
	}

	protected final synchronized void method1684() throws Throwable {
		super.finalize();
		method1679();
	}

	public final long method4() {
		return aNativeHeap1098.getBufferAddress(-42747489 * anInt1099);
	}

	public final synchronized void method5(byte[] is, int i, int i_3_, int i_4_) {
		if (!method1678() | is == null | i < 0 | i_4_ + i > is.length | i_3_ < 0 | i_4_ + i_3_ > -1082700377 * anInt1097)
			throw new RuntimeException();
		aNativeHeap1098.put(anInt1099 * -42747489, is, i, i_3_, i_4_);
	}

	private final synchronized boolean method1685() {
		return aNativeHeap1098.method1939() && aBool1100;
	}

	private final synchronized boolean method1686() {
		return aNativeHeap1098.method1939() && aBool1100;
	}

	public final int method6() {
		return anInt1097 * -1082700377;
	}

	public final int method7() {
		return anInt1097 * -1082700377;
	}

	public final synchronized void method1687() {
		if (method1678())
			aNativeHeap1098.deallocateBuffer(anInt1099 * -42747489);
		aBool1100 = false;
	}

	public final synchronized void method1688() {
		if (method1678())
			aNativeHeap1098.deallocateBuffer(anInt1099 * -42747489);
		aBool1100 = false;
	}
}
