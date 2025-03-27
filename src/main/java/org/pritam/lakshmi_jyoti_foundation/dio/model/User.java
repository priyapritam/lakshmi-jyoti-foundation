package org.pritam.lakshmi_jyoti_foundation.dio.model;

import jakarta.persistence.*;
import lombok.*;
import org.pritam.lakshmi_jyoti_foundation.dio.enums.Role;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userid;

    @Column(name = "user_name", nullable = false, unique = true)
    private String username;

    @Column(name = "user_email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String phno;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "created_at",nullable = false, updatable = false)
    private LocalDateTime createdat = LocalDateTime.now();
}
