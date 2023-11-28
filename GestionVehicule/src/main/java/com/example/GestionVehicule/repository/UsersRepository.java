package com.example.GestionVehicule.repository;
import com.example.GestionVehicule.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {
     Users findByMailAndMdp(String mail,String mdp);
}
