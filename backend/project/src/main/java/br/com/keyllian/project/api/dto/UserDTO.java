package br.com.keyllian.project.api.dto;

import br.com.keyllian.project.domain.entity.UserEntity;
import org.springframework.beans.BeanUtils;

public class UserDTO {

    private Long id;
    private String username;
    private String login;
    private String password;
    private String email;

    public UserDTO(UserEntity user) {
        BeanUtils.copyProperties(user, this);
    }

    public UserDTO() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
