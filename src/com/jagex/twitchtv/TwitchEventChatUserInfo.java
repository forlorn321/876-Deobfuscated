/* TwitchEventChatUserInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class578;

public class TwitchEventChatUserInfo extends TwitchEvent {
	public String displayName;
	public int userState;
	public int nameColourARGB;
	public boolean ignore;
	public int modes;
	public int subscriptions;

	public TwitchEventChatUserInfo(int i, int i_0_, String string, int i_1_, boolean bool, int i_2_, int i_3_) {
		super(i);
		userState = i_0_;
		displayName = string;
		nameColourARGB = i_1_;
		ignore = bool;
		modes = i_2_;
		subscriptions = i_3_;
	}

	public Class578 method6561() {
		return null;
	}

	public void method6560(int[] is, long[] ls, Object[] objects) {
		/* empty */
	}

	public Class578 method6562() {
		return null;
	}

	public Class578 method6563() {
		return null;
	}

	public Class578 method6564() {
		return null;
	}

	public Class578 method6565() {
		return null;
	}

	public void method6566(int[] is, long[] ls, Object[] objects) {
		/* empty */
	}
}
