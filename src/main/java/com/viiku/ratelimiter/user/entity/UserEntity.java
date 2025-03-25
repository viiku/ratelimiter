package com.viiku.ratelimiter.user.entity;

import com.viiku.ratelimiter.common.model.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * Entity class named {@link UserEntity} representing a User, it extends
 * {@link BaseEntity} mapped to the "USERS" table.
 * Includes fields for id, name, and email, with UUID generation for the id.
 */

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS")
@Entity
public class UserEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;
}
