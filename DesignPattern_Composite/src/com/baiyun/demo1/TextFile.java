package com.baiyun.demo1;

/**
 * 叶子构件
 * @author BaiYun
 *
 */
public class TextFile extends AbstractFile {
	
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void addFile(AbstractFile abstractFile) {
		System.out.println("方法未实现");

	}

	@Override
	public void removeFile(AbstractFile abstractFile) {
		System.out.println("方法未实现");

	}

	@Override
	public AbstractFile getFile(int index) {
		System.out.println("方法未实现");
		return null;
	}

	@Override
	public void killVirus() {
		System.out.println("对" +name+ "进行杀毒");
	}

}
