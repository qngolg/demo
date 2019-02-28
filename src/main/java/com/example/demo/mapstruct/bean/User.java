package com.example.demo.mapstruct.bean;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private double account;
    private boolean married;
}
