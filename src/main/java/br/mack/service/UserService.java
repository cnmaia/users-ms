package br.mack.service;

import br.mack.controller.dto.UserRequest;
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

    /**
     * Find user.
     *
     * @param id the id
     * @return the user
     */
    User find(Long id);
}
