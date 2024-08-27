package com.vjrsz.dockerandspringboot.adapters.presenters.exceptions;

import java.util.HashMap;

public record ErrorPresenter (
    int status,
    String message,
    HashMap<String, String> details
){}
