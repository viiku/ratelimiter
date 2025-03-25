package com.viiku.ratelimiter.user;

import com.viiku.ratelimiter.common.BaseDomainModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseDomainModel {
    private String id;
    private String name;
    private String email;
}
