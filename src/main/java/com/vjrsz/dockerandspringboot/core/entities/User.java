package com.vjrsz.dockerandspringboot.core.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class User implements Serializable {
    private Long id;
    private String username;
}
