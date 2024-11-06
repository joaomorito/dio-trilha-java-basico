package me.joao.api_rest_em_nuvem.service;

import me.joao.api_rest_em_nuvem.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);


}
