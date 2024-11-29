package com.ktth.nguyenbaodai_onktth.impl;

import com.ktth.nguyenbaodai_onktth.model.Post;
import com.ktth.nguyenbaodai_onktth.repository.PostRepository;
import com.ktth.nguyenbaodai_onktth.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void deletedPost(Long id) {
        postRepository.deleteById(id);

    }
}
