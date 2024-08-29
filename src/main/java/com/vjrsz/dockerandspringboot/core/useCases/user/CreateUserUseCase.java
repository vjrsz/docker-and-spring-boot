package com.vjrsz.dockerandspringboot.core.useCases.user;

import com.vjrsz.dockerandspringboot.core.entities.User;
import com.vjrsz.dockerandspringboot.core.useCases.UseCase;

public interface CreateUserUseCase extends UseCase<CreateUserUseCase.InputValues, CreateUserUseCase.OutputValues> {
    record InputValues (
        String name,
        String email,
        String password
    ) implements UseCase.InputUseCase {}

    record OutputValues (
         User user
    ) implements UseCase.OutputUseCase {}
}
