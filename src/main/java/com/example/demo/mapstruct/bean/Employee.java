package com.example.demo.mapstruct.bean;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String ename;
    private String position;
    private String mairried;
}
