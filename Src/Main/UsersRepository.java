package Diaaland.ma.demo.entity;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}

