package cm.ex.merch.repository;

import cm.ex.merch.entity.user.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, UUID> {

    Authority findByAuthority(String authority);

    Authority findByLevel(String level);

}


