package com.StarkIndustries.SpringSecurityMark1.Service;

import com.StarkIndustries.SpringSecurityMark1.Model.UserDetailsImplementation;
import com.StarkIndustries.SpringSecurityMark1.Model.Users;
import com.StarkIndustries.SpringSecurityMark1.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    public UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepo.findByUsername(username);
        if(users==null){
            throw new UsernameNotFoundException("User not found");
        }
        return new UserDetailsImplementation(users);
    }
}
