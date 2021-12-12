package com.baiyun.demo1;

public class TestDemo1 {
	public static void main(String[] args) {
        AbstractFile folder1 = new Folder("资料库");
        AbstractFile folder2 = new Folder("资料库 --》 图像文件");
        AbstractFile folder3 = new Folder("资料库 --》 文本文件");
        AbstractFile folder4 = new Folder("资料库 --》 视频文件");
        
        AbstractFile image1 = new ImageFile("资料库 --》 图像文件 --> 小龙女.jpg");
        AbstractFile image2 = new ImageFile("资料库 --》 图像文件 --> 张无忌.gif");

        AbstractFile text1 = new TextFile("资料库 --》 文本文件 --> 九阴真经.txt");
        AbstractFile text2 = new TextFile("资料库 --》 文本文件 --> 葵花宝典.doc");

        AbstractFile video1 = new VideoFile("资料库 --》 视频文件 --> 笑傲江湖.rmvb");
        AbstractFile video2 = new VideoFile("资料库 --》 视频文件 --> 天龙八部.mp4");

        folder2.addFile(image1);
        folder2.addFile(image2);

        folder3.addFile(text1);
        folder3.addFile(text2);

        folder4.addFile(video1);
        folder4.addFile(video2);

        folder1.addFile(folder2);
        folder1.addFile(folder3);
        folder1.addFile(folder4);

        folder1.killVirus();
	}
}
