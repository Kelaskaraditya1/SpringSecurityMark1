package com.StarkIndustries.SpringSecurityMark1.Service;

import com.StarkIndustries.SpringSecurityMark1.Model.UserPrincipal;
import com.StarkIndustries.SpringSecurityMark1.Model.Users;
import com.StarkIndustries.SpringSecurityMark1.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users = userRepository.findByUsername(username);
        if(users==null)
            throw new UsernameNotFoundException("User not Found!!");

        return new UserPrincipal(users);
    }
}
