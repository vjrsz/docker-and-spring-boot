package com.vjrsz.dockerandspringboot.core.useCases.user;

import com.vjrsz.dockerandspringboot.core.entities.User;
import com.vjrsz.dockerandspringboot.core.useCases.UseCase;

import java.util.List;

public interface GetAllUserUseCase extends UseCase<GetAllUserUseCase.InputValues, GetAllUserUseCase.OutputValues> {
    record InputValues (
    ) implements InputUseCase {}

    record OutputValues (
         List<User> users
    ) implements OutputUseCase {}
}
