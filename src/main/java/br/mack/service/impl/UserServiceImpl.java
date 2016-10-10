package br.mack.service.impl;

import br.mack.model.User;
import br.mack.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cmaia on 09/10/16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(UserRequest user) {
        validate(user);

        User userEntity = new User(null, user.getName(), user.getEmail());
        userRepository.save(userEntity);
    }

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    private void validate(UserRequest user) {
        Map<String, String> validationErrors = new HashMap<String, String>();

        if (user.getEmail() == null || user.getEmail().isEmpty() || !EmailValidator.getInstance().isValid(user.getEmail())) {
            validationErrors.put("email", "Email invalid.");
        }

        if(user.getName() == null || user.getEmail().isEmpty()) {
            validationErrors.put("name", "Name invalid.");
        }

        if (validationErrors.size() > 0) {
            throw new ValidationException(validationErrors);
        }
    }
}
