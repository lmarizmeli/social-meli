package br.com.mercadolivre.bootcampw2.grupo11.socialmeli.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserFollowingListDTO {
    private int userId;
    private String userName;
    private List<UserDTO> followed;
}