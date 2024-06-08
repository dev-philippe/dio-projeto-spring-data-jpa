package dio.aula;

import dio.aula.model.Users;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;


    @Override
    public void run(String... args) throws Exception {

        Users user = new Users();
        user.setName("Philippe Diniz");
        user.setUserName("Philippão");
        user.setPassword("dio123");

        repository.save(user);

        for(Users u : repository.findAll()){
            System.out.println(u);
        }

    }
}
