package com.rest.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.book.helper.FileUploadhelper;

@RestController
public class FileUploadController {
	
	@Autowired
	private FileUploadhelper FileUploadhelper;
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
	{
		
		try
		{
		System.out.println("File Name is "+file.getOriginalFilename());
		System.out.println("File size is "+file.getSize());
		
		 if(file.getSize()<=0)
		 {
			
			 ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Reuest must contains file.");
		 }
		
		 if(!file.getContentType().equals("/image/jpeg"))
		 {
			 ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only Jpeg Contains are allowed to upload.");
		 }
		 
		 //File upload code
		 boolean res = FileUploadhelper.uploadFile(file);
		 
		 System.out.println("File upload result "+res);
		 
		 if(res)
		 {
			//return  ResponseEntity.ok("File is uploaded successfully..!!!");
			 
			 return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
		 }
		 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong.Please try again later");
	
	}

}
