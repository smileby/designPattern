package com.baiyun.facade;

import com.baiyun.children.CPU;
import com.baiyun.children.Disk;
import com.baiyun.children.Memory;

/**
 * 外观模式的核心类
 * @author BaiYun
 *
 */
public class Computer {
	
	private CPU cpu;
	
	private Disk disk;
	
	private Memory memory;
	
	public Computer(){
		this.cpu = new CPU();
		this.disk = new Disk();
		this.memory = new Memory();
	}
	
	public void start(){
		cpu.start();
		disk.start();
		memory.start();
	}
	
	public void shutdown(){
		cpu.shutdown();
		disk.shutdown();
		memory.shutdown();
	}
}
