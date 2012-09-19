package com.shevchik.dao;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 19.09.12
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */

import com.shevchik.models.Contact;

import java.util.List;

public interface ContactDao {
    public List<Contact> getAll();
    public List<Contact> findAllWithDetail();
    public Contact findById(Long id);
    public Contact save(Contact contact);
    public void delete(Contact contact);
}
