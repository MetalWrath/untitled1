package org.example.restcontroller;

import org.example.dto.UserDto;
import org.example.service.UserService;
import org.example.support.UserGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public void createUser(@RequestBody UserDto user){
        userService.saveUser(user);
    }

    @GetMapping("/users")
    public List<UserDto> getlist(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserDto getOneUser(@PathVariable int id){
        return userService.getOneUser(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteOneUser(@PathVariable int id){
        userService.deleteUser(id);
    }

    @GetMapping("/users/bycompany/{comp}")
    public List<UserDto> getUserByCompany(@PathVariable String comp){
        return userService.getUserByCompany(comp.toUpperCase(Locale.ROOT));
    }

    @GetMapping("/generate")
    public String generateUser(){
        List<UserDto> userDtoList = UserGenerator.getUserList(100);
        for (UserDto userDto : userDtoList){
            userService.saveUser(userDto);
        }
        return "Users was created!";
    }


}
