package br.com.mercadolivre.bootcampw2.grupo11.socialmeli.entities.user;

import br.com.mercadolivre.bootcampw2.grupo11.socialmeli.entities.follow.Follow;
import br.com.mercadolivre.bootcampw2.grupo11.socialmeli.entities.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/** This entity inherits from user and encapsulates the logic of seller being followed by users */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Seller extends User {
  @OneToMany(mappedBy = "seller")
  private Set<Follow> followers;

  @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Post> posts;
}
