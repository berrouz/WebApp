package com.shevchik.dao;

import com.shevchik.models.Contact;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 19.09.12
 * Time: 16:56
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class ContactDaoImpl implements ContactDao{

    @Autowired
    private SessionFactory sessionFactory;


    public List<Contact> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }


    public List<Contact> findAllWithDetail() {
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }


    public Contact findById(Long id) {
        return (Contact) sessionFactory.getCurrentSession().getNamedQuery("Contact.findById").setParameter("id", id).uniqueResult();
    }


    public Contact save(Contact contact) {
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
        return contact;
    }


    public void delete(Contact contact) {
        sessionFactory.getCurrentSession().delete(contact);
    }
}
