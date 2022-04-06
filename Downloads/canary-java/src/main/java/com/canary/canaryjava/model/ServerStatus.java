package com.canary.canaryjava.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class ServerStatus {

    private int status;
    private String message;
}
