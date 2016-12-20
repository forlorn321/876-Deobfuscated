/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
	long peer;
	private int anInt1357;
	private boolean aBool1358;

	public NativeHeap(int i) {
		anInt1357 = -867221101 * i;
		allocateHeap(120521883 * anInt1357);
		aBool1358 = true;
	}

	synchronized boolean method1939() {
		return aBool1358;
	}

	public NativeHeapBuffer method1940(int i, boolean bool) {
		if (!aBool1358)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public synchronized void method1941() {
		if (aBool1358)
			deallocateHeap();
		aBool1358 = false;
	}

	private native void allocateHeap(int i);

	private native void deallocateHeap();

	synchronized native int allocateBuffer(int i, boolean bool);

	synchronized native long getBufferAddress(int i);

	synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

	synchronized native void put(int i, byte[] is, int i_3_, int i_4_, int i_5_);

	synchronized native void deallocateBuffer(int i);

	public synchronized native void copy(long l, long l_6_, int i);

	protected synchronized void finalize() throws Throwable {
		super.finalize();
		method1941();
	}

	protected synchronized void method1942() throws Throwable {
		super.finalize();
		method1941();
	}

	protected synchronized void method1943() throws Throwable {
		super.finalize();
		method1941();
	}

	protected synchronized void method1944() throws Throwable {
		super.finalize();
		method1941();
	}

	protected synchronized void method1945() throws Throwable {
		super.finalize();
		method1941();
	}

	protected synchronized void method1946() throws Throwable {
		super.finalize();
		method1941();
	}

	synchronized boolean method1947() {
		return aBool1358;
	}

	synchronized boolean method1948() {
		return aBool1358;
	}

	public NativeHeapBuffer method1949(int i, boolean bool) {
		if (!aBool1358)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public NativeHeapBuffer method1950(int i, boolean bool) {
		if (!aBool1358)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public NativeHeapBuffer method1951(int i, boolean bool) {
		if (!aBool1358)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}
}
