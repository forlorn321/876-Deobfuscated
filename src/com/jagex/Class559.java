/* Class559 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class559 implements Runnable {
	Class358_Sub1 this$0;

	public void method9445() {
		try {
			while (!this$0.aBool10124) {
				Iterator iterator = this$0.aList10128.iterator();
				while (iterator.hasNext()) {
					Class551 class551 = (Class551) iterator.next();
					class551.method9129(-574223891);
				}
				HashMap hashmap = this$0.method15792((byte) -67);
				Iterator iterator_0_ = hashmap.keySet().iterator();
				while (iterator_0_.hasNext()) {
					Class485 class485 = (Class485) iterator_0_.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8032((byte) 0);
					}
				}
				iterator_0_ = this$0.aList10128.iterator();
				while (iterator_0_.hasNext()) {
					Class551 class551 = (Class551) iterator_0_.next();
					class551.method9116((short) 16384);
				}
				Class518.method8635(6L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
			exception.printStackTrace();
		}
	}

	public void run() {
		try {
			while (!this$0.aBool10124) {
				Iterator iterator = this$0.aList10128.iterator();
				while (iterator.hasNext()) {
					Class551 class551 = (Class551) iterator.next();
					class551.method9129(-574223891);
				}
				HashMap hashmap = this$0.method15792((byte) -57);
				Iterator iterator_1_ = hashmap.keySet().iterator();
				while (iterator_1_.hasNext()) {
					Class485 class485 = (Class485) iterator_1_.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8032((byte) 0);
					}
				}
				iterator_1_ = this$0.aList10128.iterator();
				while (iterator_1_.hasNext()) {
					Class551 class551 = (Class551) iterator_1_.next();
					class551.method9116((short) 16384);
				}
				Class518.method8635(6L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
			exception.printStackTrace();
		}
	}

	Class559(Class358_Sub1 class358_sub1) {
		this$0 = class358_sub1;
	}

	public void method9446() {
		try {
			while (!this$0.aBool10124) {
				Iterator iterator = this$0.aList10128.iterator();
				while (iterator.hasNext()) {
					Class551 class551 = (Class551) iterator.next();
					class551.method9129(-574223891);
				}
				HashMap hashmap = this$0.method15792((byte) -63);
				Iterator iterator_2_ = hashmap.keySet().iterator();
				while (iterator_2_.hasNext()) {
					Class485 class485 = (Class485) iterator_2_.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8032((byte) 0);
					}
				}
				iterator_2_ = this$0.aList10128.iterator();
				while (iterator_2_.hasNext()) {
					Class551 class551 = (Class551) iterator_2_.next();
					class551.method9116((short) 16384);
				}
				Class518.method8635(6L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
			exception.printStackTrace();
		}
	}

	static void method9447(Class665 class665, byte i) {
		Class142.method2375((byte) -123);
		Class466.method7659(class665, (byte) -28);
	}

	public static int method9448(String string, byte i) {
		return Class585.aTwitchTV7698.ChatSendMessage(string);
	}
}
