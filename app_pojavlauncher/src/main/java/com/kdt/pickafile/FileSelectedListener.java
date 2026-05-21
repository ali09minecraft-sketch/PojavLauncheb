package com.kdt.pickafile;

import java.io.File;

@np.annotation.NPProtect
public abstract class FileSelectedListener
{
	public abstract void onFileSelected(File file, String path);
    public void onFileLongClick(File file, String path) {}
}
