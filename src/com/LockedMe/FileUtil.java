package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	static int count=0;
	List<MyFile> files=new ArrayList<>();
	public FileUtil() {
		File f=new File("e://pratice");
		String[] fs=f.list();
		for(String file:fs)
		{
			count++;
			files.add(new MyFile(count, file));
		}
	}
	public List<MyFile> getFiles()
	{
		/*File f=new File("e://pratice");
		String[] fs=f.list();
		for(String file:fs)
		{
			count++;
			files.add(new MyFile(count, file));
		}*/
		return files;
	}
	public void addFile(String fileName) throws IOException {
		File f=new File("E://pratice//"+fileName+".txt");
		f.createNewFile();
	}
	public boolean deleteFile(String fileName)
	{
		boolean isDeleted=false;
		
		files=getFiles();
		for(MyFile file:files)
		{
			if(file.getFileName().startsWith(fileName))
			{
				File f=new File("E://pratice//"+file.getFileName());
				f.delete();
				isDeleted=true;
				break;
			}
		}
		return isDeleted;
	}
	public boolean search(String fileName)
	{
		boolean isIdentified=false;
		files=getFiles();
		for(MyFile file:files)
		{
			if(file.getFileName().startsWith(fileName))
			{
				isIdentified=true;
				break;
			}
		}
		return isIdentified;
	}
}