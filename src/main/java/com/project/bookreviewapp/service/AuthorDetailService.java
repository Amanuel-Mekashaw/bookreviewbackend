package com.project.bookreviewapp.service;

import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.project.bookreviewapp.dto.AuthorDetailDTO;
import com.project.bookreviewapp.entity.AuthorDetail;
import com.project.bookreviewapp.entity.User;

public interface AuthorDetailService {
    Optional<AuthorDetail> getAuthorDetail(Long id);

    AuthorDetail createAuthorDetail(AuthorDetail authorDetail);

    void deleteAuthorDetail(Long id);

    boolean isAuthorDetailExist(AuthorDetail authorDetail);

    public Optional<User> getUserByAuthorId(Long authorId);

    public Optional<AuthorDetail> getUserDetailByAuthorId(Long authorId);

    public Optional<AuthorDetail> findUserWithAuthorDetailsById(Long id);

    void addNewUserDetail(AuthorDetailDTO authorDetailDTO, MultipartFile profilePhoto);

}
