package com.zoe.pawse.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Entity(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "NO")
    private int NO;

//    @Column(name = "ID")
    private String ID;

//    @Column(name = "PASSWORD")
    private String PASSWORD;

//    @Column(name = "EMAIL")
    private String EMAIL;
}
