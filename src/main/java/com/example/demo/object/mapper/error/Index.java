package com.example.demo.object.mapper.error;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Index {

    private String fileName;

    private Integer fileId;


    public String toJson() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(this);
    }

    /**
     * new ObjectMapper().writeValueAsString() 会把 所有的get方法 都变成它的属性
     * {"fileName":"1.index","fileId":1,"nextFileId":2}
     * 类似这样 nextFileId 不是我们的属性 但是ObjectMapper就会把它序列化出来
     * 避免这个问题 就在method上加一个@JsonIgnore
     * @return
     */
    public Integer getNextFileId(){
        return fileId + 1;
    }

    @JsonIgnore
    public String getNextFileName(){
        return (fileId + 1) + ".index";
    }
}
