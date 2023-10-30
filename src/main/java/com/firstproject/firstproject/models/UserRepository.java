package com.firstproject.firstproject.models;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer>{
  List<Users> findBySize(int size);
  List<Users> findByNameandPassword(String name, String password);
}
