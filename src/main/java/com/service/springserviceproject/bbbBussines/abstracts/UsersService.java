package com.service.springserviceproject.bbbBussines.abstracts;

import com.service.springserviceproject.aaaEntities.concretes.Users;

public interface UsersService {
    Users findUserByName(String name);
}
