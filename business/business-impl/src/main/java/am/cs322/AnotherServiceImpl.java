package am.cs322;

import am.cs322.model.Another;
import am.cs322.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnotherServiceImpl implements AnotherService{
    AnotherRepository anotherRepository;
    UserRepository userRepository;

    public AnotherServiceImpl(AnotherRepository anotherRepository, UserRepository userRepository) {
        this.anotherRepository = anotherRepository;
        this.userRepository = userRepository;
    }

    @Override
    public String accountCreation(boolean isCredit, long user_id) {
        Optional<User> user = userRepository.findById(user_id);
        user.ifPresent(value -> anotherRepository.save(new Another(isCredit, value)));
        return user.isPresent() ? "Account is created" : "Account is not created";
    }
}
