//package com.oauth.application.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.oauth.oauth_detail.entity.OAuthClientDetail;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//import static javax.persistence.GenerationType.IDENTITY;
//
///**
// * Description :
// *
// * @author leejinho
// * @version 1.0
// */
//@Entity
//@Setter @Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class RedirectUrl {
//    @Id @GeneratedValue(strategy = IDENTITY)
//    private Integer id;
//
//    private String redirectUrl;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "client_id")
//    @JsonIgnore
//    private OAuthClientDetail oAuthClientDetail;
//}
