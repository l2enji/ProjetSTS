package com.pokepok.rest.service;
import com.sun.mail.smtp.SMTPTransport;

import static com.pokepok.rest.constant.EmailConstant.*;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
	public void sendNewPasswordEmail(String firstname, String password, String email) throws MessagingException {
		Message message = createEmail(firstname,password,email);
		SMTPTransport smtpTransport = (SMTPTransport)getEmailSession().getTransport(SIMPLE_MAIL_TRANSFERT_PROTOCOL);
		smtpTransport.connect(GMAIL_SMTP_SERVER, USERNAME, PASSWORD);
		smtpTransport.send(message,message.getAllRecipients());
		smtpTransport.close();
	}
	
	private Message createEmail(String firstname, String password, String email) throws AddressException, MessagingException {
		Message message = new MimeMessage(getEmailSession());
		message.setFrom(new InternetAddress(FROM_EMAIL));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email,false));
		message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(CC_EMAIL,false));
		message.setSubject(EMAIL_SUBJECT);
		message.setText("Hello"+ firstname+ ",\n\n Your new account password is : "+password+"\n\n The support Team");
		message.setSentDate(new Date());
		message.saveChanges();
		return message;
	}
	
	private Session getEmailSession() {	
		Properties properties = System.getProperties();
		properties.put(SMTP_HOST, GMAIL_SMTP_SERVER);
		properties.put(SMTP_AUTH, true);
		properties.put(SMTP_PORT, DEFAULT_PORT);
		properties.put(SMTP_STARTTLS_ENABLE, true);
		properties.put(SMTP_STARTTLS_REQUIRED, true);
		
		return Session.getInstance(properties, null);
	}
}
