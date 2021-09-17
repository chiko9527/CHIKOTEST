package com.test;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class User{
    private String name;

    private int id;
}