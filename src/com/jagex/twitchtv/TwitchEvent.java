/* TwitchEvent - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class578;

public abstract class TwitchEvent {
	public int eventType;

	public TwitchEvent(int i) {
		eventType = i;
	}

	public abstract void method6560(int[] is, long[] ls, Object[] objects);

	public abstract Class578 method6561();

	public abstract Class578 method6562();

	public abstract Class578 method6563();

	public abstract Class578 method6564();

	public abstract Class578 method6565();

	public abstract void method6566(int[] is, long[] ls, Object[] objects);
}
