package com.zoe.pawse.DTO;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    @Id
    public int NO;
    public String ID;
    public String EMAIL;
    public String PASSWORD;

}
