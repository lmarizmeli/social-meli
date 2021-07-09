package br.com.mercadolivre.bootcampw2.grupo11.socialmeli.dtos;

import br.com.mercadolivre.bootcampw2.grupo11.socialmeli.entities.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO{
    private int userId;
    private String userName;


    public static UserDTO fromEntity(User user) {
        return new UserDTO(user.getUserId(), user.getUserName());
    }
}
