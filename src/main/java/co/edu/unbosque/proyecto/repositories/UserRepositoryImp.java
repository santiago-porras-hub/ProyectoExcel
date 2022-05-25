package co.edu.unbosque.proyecto.repositories;

import co.edu.unbosque.proyecto.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepositoryImp implements UserRepository{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void registerUser(User user) {
        System.out.println(user.getEdad());
        entityManager.merge(user);
    }
}
