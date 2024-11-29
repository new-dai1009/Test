package com.ktth.nguyenbaodai_onktth.service;

import com.ktth.nguyenbaodai_onktth.model.Post;


import java.util.List;

public interface PostService {
    List<Post> getAllPost();
    Post getPostById(Long id);
    Post savePost(Post post);
    void deletedPost(Long id);
}
