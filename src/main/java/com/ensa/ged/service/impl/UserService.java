package com.ensa.ged.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IUserDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.User;
import com.ensa.ged.service.IUserService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class UserService extends AbstractService<User> implements IUserService , Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
    private IUserDao dao;

    public UserService() {
        super();
    }

    // API

    @Override
    protected IOperations<User> getDao() {
        return dao;
    }

	public void findByLogin(String login) {
		// TODO Auto-generated method stub
		
	}

}
