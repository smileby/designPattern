package com.baiyun.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件
 * @author BaiYun
 *
 */
public class Folder extends AbstractFile {
	
	private String name;
	
	private List<AbstractFile> files;
	
	public Folder(String name) {
		super();
		this.name = name;
		this.files = new ArrayList<>();
	}

	@Override
	public void addFile(AbstractFile abstractFile) {
		files.add(abstractFile);
	}

	@Override
	public void removeFile(AbstractFile abstractFile) {
		// TODO Auto-generated method stub

	}

	@Override
	public AbstractFile getFile(int index) {
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("对" + name + "进行杀毒");
		for (AbstractFile abstractFile : files) {
			abstractFile.killVirus();
		}
	}

}
