package com.example.demo.mapstruct.mapper;

import com.example.demo.mapstruct.bean.Employee;
import com.example.demo.mapstruct.bean.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = UserTransform.class)
public interface UserMapper {
    UserMapper INSTANCE = (UserMapper) Mappers.getMapper(User.class);
    @Mappings({
            @Mapping(source = "name",target = "ename"),
    })
    Employee userToEmployee(User user);
    User employeeToUser(Employee employee);
}

interface <T,R> f2 {

}
