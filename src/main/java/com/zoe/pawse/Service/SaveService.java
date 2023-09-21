package com.zoe.pawse.Service;

import com.zoe.pawse.DTO.UserDTO;
import com.zoe.pawse.Entity.UserEntity;
import jdk.swing.interop.SwingInterOpUtils;

public interface SaveService {
    Long register(UserDTO userDTO);

    default UserEntity dtoToEntity(UserDTO userDTO){
        UserEntity userEntity = UserEntity.builder()
                .NO(userDTO.getNO())
                .ID(userDTO.getID())
                .PASSWORD(userDTO.getPASSWORD())
                .EMAIL(userDTO.getEMAIL())
                .build();
        return userEntity;
    }
}
