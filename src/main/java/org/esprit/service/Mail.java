package org.esprit.service;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.annotation.Resource;
import javax.ejb.Stateless;

import org.esprit.domain.*;
@Stateless
@WebServlet(value="/mail")
public class Mail extends HttpServlet implements IMail
{
    @Resource(mappedName="java:jboss/mail/Default")
    private Session mailSession;

    protected void doGet(Employee p)  throws ServletException, IOException {
        {

           // PrintWriter out=response.getWriter();
            try    {
                MimeMessage m = new MimeMessage(mailSession);
                Address from = new InternetAddress("oumaima.ouali@esprit.tn");
                Address[] to = new InternetAddress[] {new InternetAddress(p.getEmail_address()) };

                m.setFrom(from);
                m.setRecipients(Message.RecipientType.TO, to);
                m.setSubject("Consolidate worklowd calculation : reset your password");
                m.setSentDate(new java.util.Date());
                m.setContent("Hello  "+p.getLogin()+" your new password is 0000 ","text/plain");
                Transport.send(m);
              //  out.println("Mail sent!");
            }
            catch (javax.mail.MessagingException e)
            {
                e.printStackTrace();
              //  out.println("Error in Sending Mail: "+e);
            }
        }
    }

	@Override
	public void send(Employee Mail) {
		try{ doGet(Mail);}catch(Exception e){e.printStackTrace();}
	}

	

	
	
}
