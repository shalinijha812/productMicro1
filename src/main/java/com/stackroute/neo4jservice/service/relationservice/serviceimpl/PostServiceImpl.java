package com.stackroute.neo4jservice.service.relationservice.serviceimpl;


import com.stackroute.neo4jservice.domain.relation.Post;
import com.stackroute.neo4jservice.repository.relationrepository.PostRepository;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    PostRepository postRepository;
    @Autowired
    public PostServiceImpl(PostRepository postRepository)
    {
        this.postRepository=postRepository;
    }

    @Override
    public Post savePost(Post post) {
        Post savedPost = postRepository.save(post);
        return savedPost;
    }

    @Override
    public List<Post> getAllPosts() {
        return (List<Post>)postRepository.findAll();
    }
}
