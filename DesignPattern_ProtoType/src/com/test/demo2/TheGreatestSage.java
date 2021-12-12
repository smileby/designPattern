package com.test.demo2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 齐天大圣
 * @author BaiYun
 *
 */
@SuppressWarnings("serial")
public class TheGreatestSage extends Monkey implements Cloneable, Serializable {
	
	private GoldRingedStaff grs;
	
	/**
	 * 从石头缝蹦出来
	 */
	public TheGreatestSage(){
		System.out.println("克隆是不走构造方法的，直接字节流复制，构造器只运行一次");
		this.grs = new GoldRingedStaff();
		this.date = new Date();
		this.height = 150;
		this.weight = 30;
	}
	
	public GoldRingedStaff getGrs() {
		return grs;
	}
	public void setGrs(GoldRingedStaff grs) {
		this.grs = grs;
	}



	/**
	 * 分身术【对象的深度拷贝】
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			TheGreatestSage copy = (TheGreatestSage)ois.readObject();
			copy.setDate(new Date());
			
			return copy;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				ois.close();
				bis.close();
				oos.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 变化
	 * @throws CloneNotSupportedException 
	 */
	public void change() throws CloneNotSupportedException{
		TheGreatestSage copy = (TheGreatestSage)clone();
		System.out.println("大圣本尊生日：" + this.getDate().getTime());
		System.out.println("克隆大圣生日：" + copy.getDate().getTime());
		System.out.println("大圣本尊和克隆的是否为同一对象" + (this==copy));
		System.out.println("大圣本尊和克隆的是否拥有相同的金箍棒" + (this.grs == copy.getGrs()));
	}
	
}
