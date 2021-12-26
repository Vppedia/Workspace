package com.rest.book.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadhelper {
	
	//private final String  UPLOAD_DIR="C:\\IDE\\Spring_Tool_workspace\\BootRestBook\\src\\main\\resources\\static\\images";
	private final String  UPLOAD_DIR= new ClassPathResource("static/images/").getFile().getAbsolutePath();
	
	public FileUploadhelper()throws IOException
	{
	
	}
	
	public boolean uploadFile(MultipartFile f)
	{  
		boolean flag=false;
		
		try
		{
//			InputStream inputStream = f.getInputStream();
//			byte[] data=new byte[inputStream.available()];
//			inputStream.read(data);			
//			
//			//write data
//			FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+File.separator+f.getOriginalFilename());
//			
//		fos.write(data);
//			fos.close();
//			fos.flush();
//		flag=true;
			
			System.out.println("Inside try block of fileuploadhelper");
			
		 Files.copy(f.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+f.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		    flag=true;
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return flag;
		
		
	}
	

}
