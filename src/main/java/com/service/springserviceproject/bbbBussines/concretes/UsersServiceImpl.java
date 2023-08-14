package com.service.springserviceproject.bbbBussines.concretes;

import com.service.springserviceproject.aaaEntities.abstracts.UsersRepository;
import com.service.springserviceproject.aaaEntities.concretes.Users;
import com.service.springserviceproject.bbbBussines.abstracts.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Autowired
    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users findUserByName(String name) {
        return usersRepository.findByName(name);
    }
}
