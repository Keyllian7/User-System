package br.com.keyllian.project.api.controller;

import br.com.keyllian.project.api.dto.UserDTO;
import br.com.keyllian.project.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> listAll(){
        return userService.listAll();
    }

    @PostMapping
    public void insert(@RequestBody UserDTO user) {
        userService.insert(user);
    }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ("id") Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }

}
