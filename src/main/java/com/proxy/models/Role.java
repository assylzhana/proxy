package com.proxy.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ROLES")
@Builder
public class Role implements GrantedAuthority
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID",nullable = false)
    private Long id;

    @Column(name="NAME")
    private String name;

    @Override
    public String getAuthority()
    {
        return name;
    }
}