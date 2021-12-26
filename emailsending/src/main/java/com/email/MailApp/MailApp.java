package com.email.MailApp;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailApp {
	
	
	public void sendMail()
	{
		String message = "Hi friend! i will be there for you !!!!!";
		String subject = "Regarding MailApp Testing";
		String to = "pranavfunny1@gmail.com";
		String from = "vivekpandey.2cse19@gmail.com";

	//	sendEmail(message, subject, to, from);
		sendAttach(message, subject, to, from);
	}
	
	

	private void sendAttach(String message, String subject, String to, String from) {
		
		//get the System properties value


		Properties properties = System.getProperties();
		//Setting important properties to  properties

		//varibale for gmail
		 String host="smtp.gmail.com";

		properties.put("mail.smtp.host", host);

		properties.put("mail.smtp.port", "465");

		properties.put("mail.smtp.ssl.enable", "true");

		properties.put("mail.smtp.auth", "true");



		//Step 1:Get the Session Object

		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication("vivekpandey.2cse19@gmail.com","vivek@321");
			}
		});

		session.setDebug(true);

		//Step 2:compose the Message

		MimeMessage m = new MimeMessage(session);

		try {

			//from email
			m.setFrom(from);

			//adding message to recipient message

			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			//adding subject to message
			m.setSubject(subject);
               
			MimeMultipart mimeMultipart = new MimeMultipart();
			
			String path="C:\\Users\\PKP95\\Desktop\\india.png";
			//send Text Message
			//send Attachment
			
			MimeBodyPart text = new MimeBodyPart();

			MimeBodyPart filename = new MimeBodyPart();
			
			try {
				
				text.setText(message);
			    File file=new File(path);
			    
				filename.attachFile(file);
				
				
				mimeMultipart.addBodyPart(text);
				mimeMultipart.addBodyPart(filename);
				
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		
			//Send
                
            m.setContent(mimeMultipart);

			Transport.send(m);

			System.out.println("Mail sent Successfull !!!!!!!");
		} 

		catch (Exception e) {

			e.printStackTrace();

		}

	
		
		
	}



	private void sendEmail(String message, String subject, String to, String from) {



	

		//get the System properties value


		Properties properties = System.getProperties();
		//Setting important properties to  properties

		//varibale for gmail
		 String host="smtp.gmail.com";

		properties.put("mail.smtp.host", host);

		properties.put("mail.smtp.port", "465");

		properties.put("mail.smtp.ssl.enable", "true");

		properties.put("mail.smtp.auth", "true");



		//Step 1:Get the Session Object

		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication("vivekpandey.2cse19@gmail.com","vivek@321");
			}
		});

		session.setDebug(true);

		//Step 2:compose the Message

		MimeMessage m = new MimeMessage(session);

		try {

			//from email
			m.setFrom(from);

			//adding message to recepient message

			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			//adding subject to message
			m.setSubject(subject);

			
          MimeBodyPart mimeBodyPart = new  MimeBodyPart();
          
          mimeBodyPart.setText(message);
        ///adding message body
		
			//Send

			Transport.send(m);

			System.out.println("Mail sent Successfull !!!!!!!");
		} 

		catch (Exception e) {

			e.printStackTrace();

		}

	}


}
