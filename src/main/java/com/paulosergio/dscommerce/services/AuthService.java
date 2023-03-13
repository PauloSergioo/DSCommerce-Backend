package com.paulosergio.dscommerce.services;

import com.paulosergio.dscommerce.entities.User;
import com.paulosergio.dscommerce.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validateSelfForAdmin(Long userId) {
        User me = userService.authenticated();
        if (!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)) {
            throw new ForbiddenException("Access denied");
        }
    }

}
