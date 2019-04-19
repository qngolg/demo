package com.example.demo.unsafe;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import lombok.*;
import org.apache.commons.lang.SerializationUtils;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String name;
    private String code;
    private List<Son> sonList;

    private void readObject(java.io.ObjectInputStream io) throws IOException, ClassNotFoundException {
        io.defaultReadObject();
        System.out.println("我是攻击代码");
    }

    public static void main(String[] args) {
        Son son = Son.builder().name("son").build();
        User user = User.builder().name("user").sonList(Lists.newArrayList(son)).build();

        //不安全的clone方法
        User clone = (User) SerializationUtils.clone(user);
        System.out.println(clone.getName());
        System.out.println(clone.getSonList().get(0).getName());

        //安全的clone方法
        Gson gson = new Gson();
        User safeClone = gson.fromJson(gson.toJson(user), User.class);
        System.out.println(safeClone.getName());
        System.out.println(safeClone.getSonList().get(0).getName());

    }
}
