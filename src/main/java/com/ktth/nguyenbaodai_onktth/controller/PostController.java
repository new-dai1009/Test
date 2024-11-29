package com.ktth.nguyenbaodai_onktth.controller;


import com.ktth.nguyenbaodai_onktth.impl.PostServiceImpl;
import com.ktth.nguyenbaodai_onktth.model.Post;
import com.ktth.nguyenbaodai_onktth.repository.PostRepository;
import com.ktth.nguyenbaodai_onktth.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostServiceImpl postService;

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/list")
    public String listPost(Model model){
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "posts/list";
    }
    @GetMapping("/new")
    public String createPostForm(Model model){
        model.addAttribute("post", new Post());
        return "posts/formAdd";
    }
    @PostMapping("/save")
    public String savePost(@ModelAttribute("post") Post post){
        postService.savePost(post);
        return "redirect:/posts/list";
    }


}
