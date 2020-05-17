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
        return new User("user", "$2a$10$ifz3x7/X8/i.swiSAzf2/eK9j.AtdGVAlU0nTWXPALPfmeuUc78vG" , new ArrayList<>());
    }
}