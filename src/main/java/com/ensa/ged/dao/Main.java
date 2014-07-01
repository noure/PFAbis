package com.ensa.ged.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.ensa.ged.dao.impl.RolesDao;
import com.ensa.ged.dao.impl.UserDao;
import com.ensa.ged.model.Roles;
import com.ensa.ged.model.User;

public class Main {
	@Autowired
	private static IUserDao userDao =new UserDao();

	@Autowired
	private static IRolesDao rolesDao =new RolesDao();

	public static void main(String arg[]) {

		Roles roleUser = new Roles();
		roleUser.setName("ROLE_USER");
		rolesDao.create(roleUser);

		Roles roleAdmin = new Roles();
		roleAdmin.setName("ROLE_ADMIN");
		rolesDao.create(roleAdmin);

		User userAdmin = new User();
		userAdmin.setUserName("Admin");
		userAdmin.setCniUser("PB134890");
		userAdmin.setEmailUser("labihi.nour");
		userAdmin.setPwdUser("123456");
		userAdmin.setProfessionUser("developper");
		userAdmin.setNationUser("marocain");
		Set<Roles> AdminRoles = new HashSet<Roles>();
		AdminRoles.add(roleAdmin);
		AdminRoles.add(roleUser);
		userAdmin.setRoles(AdminRoles);

		Set<User> users = new HashSet<User>();
		users.add(userAdmin);
		roleUser.setUserlist(users);
		roleAdmin.setUserlist(users);

		userDao.create(userAdmin);

	}

}
