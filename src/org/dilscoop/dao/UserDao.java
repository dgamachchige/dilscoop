package org.dilscoop.dao;

import org.dilscoop.model.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class UserDao {
	public void saveUser(UserDetails user){
		Configuration configuration = new Configuration();
	    configuration.configure();
		ServiceRegistry serviceRegistry  = new StandardServiceRegistryBuilder().applySettings(
	            configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
}
