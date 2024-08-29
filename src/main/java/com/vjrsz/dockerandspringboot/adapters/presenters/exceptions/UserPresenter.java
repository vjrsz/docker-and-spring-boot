package com.vjrsz.dockerandspringboot.adapters.presenters.exceptions;

public record UserPresenter(
    Long id,
    String name,
    String email
) { }
