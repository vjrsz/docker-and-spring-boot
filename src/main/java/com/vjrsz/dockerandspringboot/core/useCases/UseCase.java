package com.vjrsz.dockerandspringboot.core.useCases;


public interface UseCase<I extends UseCase.InputUseCase, O extends UseCase.OutputUseCase> {
    O execute(I input);

    interface InputUseCase { }
    interface OutputUseCase { }
}
