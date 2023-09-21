package com.zoe.pawse.Service;

import com.zoe.pawse.Entity.UserEntity;
import com.zoe.pawse.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void join(UserEntity user){
        UserEntity userEntity = UserEntity.builder()
                .NO(user.getNO())
                .ID(user.getID())
                .PASSWORD(user.getPASSWORD())
                .EMAIL(user.getEMAIL())
                .build();
        userRepository.save(userEntity);
    }
}
