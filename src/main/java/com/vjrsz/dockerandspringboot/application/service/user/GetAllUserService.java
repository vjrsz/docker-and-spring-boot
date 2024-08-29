package com.vjrsz.dockerandspringboot.application.service.user;

import com.vjrsz.dockerandspringboot.adapters.repositories.UserRepository;
import com.vjrsz.dockerandspringboot.core.useCases.user.GetAllUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetAllUserService implements GetAllUserUseCase {

    private UserRepository userRepository;

    @Override
    public OutputValues execute(InputValues input) {
        return new OutputValues(userRepository.getAll());
    }
}
