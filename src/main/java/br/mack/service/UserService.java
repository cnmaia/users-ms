package br.mack.service;

import br.mack.model.User;

import java.util.List;

/**
 * Created by cmaia on 09/10/16.
 */
public interface UserService {

    /**
     * Create.
     *
     * @param user the user
     */
    void create(UserRequest user);

    /**
     * List list.
     *
     * @return the list
     */
    List<User> list();
}
