package com.stackroute.neo4jservice.service.relationservice.serviceinterface;


import com.stackroute.neo4jservice.domain.relation.Post;

import java.util.List;

public interface PostService {
    public Post savePost(Post post);
    public String deletePost(String id);
    public List<Post> getAllPosts();
}
