package com.ktth.nguyenbaodai_onktth.repository;

import com.ktth.nguyenbaodai_onktth.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
