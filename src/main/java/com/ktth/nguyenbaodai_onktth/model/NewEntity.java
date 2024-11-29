package com.ktth.nguyenbaodai_onktth.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "new_entity")
public class NewEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}