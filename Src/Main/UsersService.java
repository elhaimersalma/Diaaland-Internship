package Diaaland.ma.demo.entity;

public interface UsersService extends UsersDetailsService {
    Users save(UsersRegistrationDto registrationDto);
}
