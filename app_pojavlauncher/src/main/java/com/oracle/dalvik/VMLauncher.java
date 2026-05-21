package com.oracle.dalvik;

@np.annotation.NPProtect
public final class VMLauncher {
	private VMLauncher() {
	}
	public static native int launchJVM(String[] args);
}
