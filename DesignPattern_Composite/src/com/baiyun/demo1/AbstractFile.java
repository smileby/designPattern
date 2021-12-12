package com.baiyun.demo1;

/**
 * 抽象构建： 抽象文件
 */
public abstract class AbstractFile {
	
	/**
	 * 添加文件
	 * @param abstractFile
	 */
	public abstract void addFile(AbstractFile abstractFile);
	
	/**
	 * 删除文件
	 * @param abstractFile
	 */
	public abstract void removeFile(AbstractFile abstractFile);
	
	/**
	 * 获取文件
	 * @param index
	 * @return
	 */
	public abstract AbstractFile getFile(int index);
	
	/**
	 * 对文件进行杀毒
	 * @return
	 */
	public abstract void killVirus();
}
