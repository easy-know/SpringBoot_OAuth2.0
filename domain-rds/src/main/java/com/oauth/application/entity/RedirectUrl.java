package com.oauth.application.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Entity
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RedirectUrl {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "BOARD_ID")
    private Application applicationEntity;
}
