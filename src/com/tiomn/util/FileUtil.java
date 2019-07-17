package com.tiomn.util;

import java.io.File;

public class FileUtil {
	//ɾ����ļ�
	public static void delFile(File file){
		if(file.exists()&&file.isFile()){
			file.delete();
		}
	}
	
	//ɾ���ļ��У���չ��
	
	public static void main(String[] args) {
		delFile(new File("D:\\haha.txt"));
	}
}
