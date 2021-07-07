package br.com.mercadolivre.bootcampw2.grupo11.socialmeli.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FollowerCountDTO {
    private int userId;
    private String userName;
    int followersCount;
}
