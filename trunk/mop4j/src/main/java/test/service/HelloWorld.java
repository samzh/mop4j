package test.service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import test.util.HibernateUtil;
import test.vo.Message;

public class HelloWorld {

	public static void main(String[] args) {
		// First unit of work
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Message message = new Message("Hello World");
		Long msgId = (Long) session.save(message);
		tx.commit();
		session.close();
		// Second unit of work
		Session newSession = HibernateUtil.getSessionFactory().openSession();
		Transaction newTransaction = newSession.beginTransaction();
		List messages = newSession.createQuery(
				"from Message m order by m.text asc").list();
		System.out.println(messages.size() + " message(s) found:");

		for (Iterator iter = messages.iterator(); iter.hasNext();) {
			Message loadedMsg = (Message) iter.next();
			System.out.println(loadedMsg.getText());
		}
		newTransaction.commit();
		newSession.close();
		// Shutting down the application
		HibernateUtil.shutdown();
	}

}
