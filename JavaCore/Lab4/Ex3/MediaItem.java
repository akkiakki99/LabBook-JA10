package com.capg.lab4ex3;

public abstract class MediaItem extends Item{
	
	private int runtime;

	public MediaItem(int uID, String title, int copies, int runtime) {
		super(uID, title, copies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
    
	
}
