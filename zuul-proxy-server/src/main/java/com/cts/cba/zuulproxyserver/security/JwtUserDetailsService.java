package com.cts.cba.zuulproxyserver.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("user", "$2a$10$y5WEqlOcfHlRvaqEF5ppMuZk2A.P60cgnhBYb.GUovEZ6yoA4d5nm" , new ArrayList<>());
    }
}