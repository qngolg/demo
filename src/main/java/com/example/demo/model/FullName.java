package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FullName {
    private String firstName;
    private String middleName;
    private String lastName;
}
