package com.shevchik.service;

import com.shevchik.dao.ContactDao;
import com.shevchik.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 19.09.12
 * Time: 20:13
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class ContactServiceImpl {

    @Autowired
    private ContactDao contactDao;


    public List<Contact> getAll(){
        return contactDao.getAll();
    }


    public List<Contact> findAllWithDetail() {
        return contactDao.findAllWithDetail();
    }


    public Contact findById(Long id) {
        return contactDao.findById(id);
    }


    public Contact save(Contact contact) {
        return contactDao.save(contact);
    }


    public void delete(Contact contact) {
        contactDao.delete(contact);
    }
}
