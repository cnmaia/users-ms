package br.mack.controller;

/**
 * Created by cmaia on 09/10/16
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST)
    public ResponseEntity createUser(@RequestBody UserRequest user) {
        userService.create(user);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public ResponseEntity listAllUsers() {
        return new ResponseEntity(userService.list(), HttpStatus.OK);
    }
}
